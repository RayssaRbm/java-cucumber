#language:pt

Funcionalidade: História do Usuário

Cenario: Realizar Compra

Dado que o usuário realize o login no ecommerce: "http://www.automationexercise.com"
Quando todos os produtos forem incluídos no carrinho
Então finalizo a compra com sucesso


Cenario: Novo Usuário

Dado que acesso o ecommerce: "http://www.automationexercise.com"
Quando solicito um novo cadastro
E preencho os dados necessários
Então usuário é cadastrado com sucesso