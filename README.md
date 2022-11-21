# gerador-de-tabelas

Este é um projeto com o objetivo de criar um banco de dados já populado, para fins didáticos. São geradas 4 tabelas:

#Setor
Uma tabela de domínio, que contém os possíveis setores no qual um funcionário pode trabalhar.

#Senioridade
Uma tabela de domínio, que contém os possíveis graus de senioridade de um funcionário.

#Funcionario
A tabela principal, com informações acerca do funcionário, id do setor que ele trabalha, bem como da senioridade.

#Endereco
Tabela com informações acerca do endereço do funcionário, referenciada pelo seu id.

Apesar de que as tabelas não possuem relacionamentos através de FKS, as mesmas podem ser facilmente adicionáveis para os campos de funcionario -> setor, funcionario -> senioridade e endereco -> funcionario, uma vez que os valores estão corretamente preenchidos. O objetivo principal desse projeto é gerar um script contendo tabelas com uma ampla variedade de dados, a fim de se realizarem exercícios de SQL.
