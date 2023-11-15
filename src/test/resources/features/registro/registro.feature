 #language: pt
Funcionalidade: Cadastrar usuário
  EU COMO usuário do sistema.
  DESEJO realizar o cadastro de novos usuários.
  PARA QUE seja possível armazenar e gerenciar seus dados.

  Contexto:
    Dada ingreso a la pagina "https://cadastro-de-usuarios.s3.us-east-1.amazonaws.com/index.html"

 Esquema do Cenario:  Cadastrar novo usuário válido
   Quando carrego nome <nombre>
   E carrego email <email>
   E carrego senha <password>
   E clico em Cadastrar
   Entao aparece uma tabela com os dados do usuário <nombre> e <email>
   Exemplos:
   |caso               | nombre        | email           | password   |
   | Usuario valido    | "juan perez"  | "juan@gmail.com"  | "pepito123"|
  # | usuario sin email | "ruben perez" | ""              | "juan123   |

  Cenario: Verifique os campos vazios ao entrar na página
    Entao los campos de registro estan vacios , se muestran el valor enmascarado de cada campo nombre = "João da Silva" Email = "joao.silva@email.com" contraseña = "********"

  Cenario: Verifique a tabela do usuário
    Entao no se muestra la tabla de usuarios
  #verifico que no exista la tabla de usuario al no existir un usuario registrado

  Cenario: Tente se cadastrar sem preencher o campo do nome
    Quando lleno el formulario de registro con los datos de usuario validos dejando el campo nombre vacio
    E clico em Cadastrar
    Entao O campo de nome está gerando o erro "O campo Nome é obrigatório." A tabela de usuários não deve ser alterada


  Cenario: Tente se cadastrar sem preencher o campo de senha
    Quando lleno el formulario de registro con los datos de usuario validos dejando el campo email vacio
    E clico em Cadastrar
    Entao O campo de e-mail está gerando o erro "O campo E-mail é obrigatório." A tabela de usuários não deve ser alterada.



  Cenario: Tente se cadastrar sem preencher o campo de e-mail.
    Quando carrego nome "juan perez"
    E carrego email ""
    E carrego senha "pepito123"
    E clico em Cadastrar
    Entao O campo de e-mail está gerando o erro "O campo E-mail é obrigatório." A tabela de usuários não deve ser alterada.




  Cenario: Tente se registrar com campo de nome incompleto
    Quando carrego nome "juan"
    E carrego email "juan@gmail.com"
    E carrego senha "juan1234"
    E clico em Cadastrar
    Entao O campo de nome está gerando o erro "Por favor, insira um nome completo." A tabela de usuários não deve ser alterada

  Cenario: Tente se registrar com um e-mail inválido
    Quando carrego nome "juan perez"
    E carrego email "vasquez"
    E carrego senha "azulazul"
    E clico em Cadastrar
    Entao O campo de e-mail está gerando o erro "Por favor, insira um e-mail válido." A tabela de usuários não deve ser alterada.

  Cenario: Tente se cadastrar com campo de senha inválido
    Quando carrego nome "juan vasquez"
    E carrego email "vasquez@gmail.com"
    E carrego senha "1234"
    E clico em Cadastrar
    Entao O campo de senha está gerando o erro "A senha deve conter ao menos 8 caracteres." A tabela de usuários não deve ser alterada.

  Cenario: Deletar usuário
    Dada O registro de 3 usuários.
    Quando O usuário com o número de ID 2 será removido.
    Entao Os usuários com os IDs 1 e 3 devem permanecer inalterados na tabela, enquanto o usuário com o ID 2 será removido. Os usuários devem ser exibidos ordenados por ID, do menor para o maior


