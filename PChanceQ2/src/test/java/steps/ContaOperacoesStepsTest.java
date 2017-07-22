package steps;

import sources.Banco;
import sources.Conta;
import cucumber.api.java.pt.*;

import static org.junit.Assert.*;

public class ContaOperacoesStepsTest {
   
         private Conta conta;
   
         @Dado("^a conta criada para o dono (.*?) com a senha (\\d+)$")
         public void a_conta_criada_para_o_dono(String dono, String senha) throws Throwable {
               // Definição de conta
               Banco.criaConta(dono, senha);
         }
   
         @Quando("^o dono (.*?) realiza o deposito no valor de (\\d+) na conta$")
         public void um_usuario_realiza_o_deposito_no_valor_de_na_conta(String dono, int valorDeposito) throws Throwable {
               assertTrue("O usuario " + dono + " não tem limite disponível na conta para este valor de deposito",
                             Banco.deposita(dono,valorDeposito));
         }
   
         @E("^o dono (.*?) realiza o primeiro saque no valor de (\\d+) na conta com senha (\\d+)$")
         public void o_dono_realiza_o_primeiro_saque_no_valor_de_na_conta(String dono, int valorSaque, String senha) throws Throwable {
               assertTrue("O dono "+ dono + " não tem saldo disponível na conta para este valor de saque",
                             Banco.saca(dono,senha,valorSaque));
         }
   
         @E("^o dono realiza o segundo saque no valor de (\\d+) na conta$")
         public void o_dono_realiza_o_segundo_saque_no_valor_de_na_conta(String dono, String senha, int valorSaque) throws Throwable {
               assertTrue("O dono " + conta.verDono() + " não tem saldo disponível na conta para este valor de saque",
                             Banco.saca(dono,senha,valorSaque));
         }
   
        
		@Então("^o dono tem o saldo no valor de (\\d+) na conta$")
         public void o_dono_tem_o_saldo_na_conta_no_valor_de(String dono, String senha, int saldoEsperado) throws Throwable {
               assertEquals("O dono " + dono + " está com o saldo incorreto na conta", saldoEsperado,
                             Banco.verSaldo(dono, senha));
         }

 }