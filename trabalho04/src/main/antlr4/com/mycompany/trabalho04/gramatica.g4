grammar gramatica;

/* Iniciamos com palavras e simbolos reservados da linguagem; assim como
   numeros inteiros/reais, condições para cadeias de 
   caracteres, comentarios, entre outros. */

/* Declarações apos a palavra "fragment" não geram token, são apenas de uso
   interno da nossa gramatica */

/* Declarações seguidas da palavra skip, geram tokens que são descartados */

fragment
Letra: 'a'..'z'|'A'..'Z';
fragment
LetraMinuscula: 'a'..'z';
fragment
Digito: '0'..'9';

INFORMACOES: 'informacoes';
NOME: 'nome';
TELEFONE: 'telefone';
EMAIL: 'email';

HABILIDADES: 'habilidades';
PROJETOS: 'projetos';

MONTA_PORTFOLIO: 'monta_portfolio';
FIM_PORTFOLIO: 'fim_portfolio';

NUM_INT: ('0'..'9')+;
NUM_REAL: ('0'..'9')+ '.' ('0'..'9')+;

/* Habilidades devem iniciar com letra minuscula */
HABILIDADE: LetraMinuscula('_'|Letra|Digito)*;

/* Projetos devem iniciar com _ (caracter de sublinhado) */
PROJETO: '_'(Letra|Digito)*;

CADEIA: '"' (ESC_SEQ | ~('"' | '\\' | '\n' )*)'"';
ErroCadeiaNaoFechada: '"' (ESC_SEQ | ~('"' | '\\' )* '\n');

fragment
ESC_SEQ: '\\"';

ABREPAR: '(';
FECHAPAR: ')';
ABRECHAVE: '{';
FECHACHAVE: '}';
VIRGULA: ',';
ATRIUICAO: '<-';

ErroComent: '{' ~('\n')* '}}';
Coment: '{' ~('\n')* '}' -> skip;

WS: (' '|'\t'|'\r'|'\n') -> skip;
ErroComentNaoFechado: '{' ~('\n' | '}')*;
Erro: .;

/* Regras da gramatica */

/* Iniciamos declarando nossas informações; depois declaramos, de forma opcional,
   nossas habilidades e projetos; entre 'monta_portfolio' e 'fim_portfolio' temos
   o corpo do nosso programa. */
programa: informacoes (habilidades projetos)? 'monta_portfolio' corpo 'fim_portfolio' EOF;

/* Declaração das informações pessoais, sendo obrigatorio declarar ao menos uma. */
informacoes: 'informacoes' infos+=infosPessoais (',' infos+=infosPessoais)*; 

/* Informações pessoais disponiveis para declaração. */
infosPessoais: 'Nome' | 'Telefone' | 'Email' | 'Site' | 'Linkedin' | 'Github';

/* As habilidades são uma lista de HABILIDADE, separados por virgula,
   é necessario declarar ao menos uma habilidade. */
habilidades: 'habilidades' habs+=HABILIDADE (',' habs+=HABILIDADE)*;

/* Os projetos são uma lista de PROJETO, separados por virgula; é necessario
   declarar ao menos um projeto. */
projetos: 'projetos' projs+=PROJETO (',' projs+=PROJETO)*;

/* Uma lista de comandos */
corpo: cmd*;

/* Podemos ter comando de atribuição ou comando de projetos */
cmd: cmdAtribuicao
   | cmdProjetos;

/* No comando de atribuição, atribuimos (utilizando <-) uma cadeia nas opções
   de informações pessoais. */
cmdAtribuicao: infosPessoais '<-' CADEIA;

/* No comando projetos (cmdProjetos), passamos uma CADEIA (descrição do nosso
   projeto) e uma lista de HABILIDADE (separados por virgula) relacionadas ao projeto. 
   Ex: _p1("site institucional", html, css, javascript) */
cmdProjetos: PROJETO '(' CADEIA (',' HABILIDADE)* ')';