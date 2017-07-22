# language: pt
@contaOperacoes
Funcionalidade: Testar as operacoes basicas de conta

  Esquema do Cenário: Testar saque e deposito
    Dado a conta criada para o dono <dono> com a senha <senha>
    Quando o dono <dono> realiza o deposito no valor de <deposito> na conta
    E o dono <dono> realiza o primeiro saque no valor de <primeiro_saque> na conta com senha <senha>
    E o dono realiza o segundo saque no valor de <segundo_saque> na conta
    Então o dono tem o saldo no valor de <saldo_esperado> na conta

    Exemplos: 
      | dono    | senha | deposito | primeiro_saque | segundo_saque | saldo_esperado |
      | Roberto |  1234 |      100 |             10 |            10 |             80 |
      | Maria   |  4321 |      200 |             10 |            10 |            180 |
      | Pablo   |  5678 |      200 |             20 |            20 |            160 |
      | Rafael  |  8765 |      200 |             30 |            20 |            150 |
