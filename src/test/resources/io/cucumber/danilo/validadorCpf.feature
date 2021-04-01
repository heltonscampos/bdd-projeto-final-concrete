# language: pt

Funcionalidade: Validar CPF
  Cenario: CPF Valido
  Dado que eu esteja na pagina de validacao de cpf 
  E digito um cpf valido "09912149432"
  Quando eu clico no botao enviar
  Entao e redirecionado para outra pagina

  Cenario: CPF invalido
  Dado que eu esteja na pagina de validacao de cpf 
  E digito um cpf invalido "129.360.810-11"
  Quando eu clico no botao enviar
  Entao devo ver uma mensagem de "Não é válido"
