ExemploVendasMod35

Projeto Java de vendas com cadastro de clientes, produtos e vendas, desenvolvido para estudar a migração do acesso a dados de JDBC para JPA/Hibernate.
Sobre a alteração (JDBC → JPA)

Originalmente, o acesso ao banco era feito com JDBC puro: cada DAO escrevia o SQL manualmente (INSERT, UPDATE, DELETE, SELECT) e preenchia os parâmetros com PreparedStatement.

Nesta versão, o projeto passou a utilizar JPA com Hibernate:

    Mapeamento de Entidades: As classes de domínio foram mapeadas como entidades (ClienteJpa, ProdutoJpa, VendaJpa, ProdutoQuantidadeJpa) utilizando anotações como @Entity, @Table, @Id, @Column e @ManyToOne.

    Gerenciamento de Schema: As tabelas passam a ser criadas e atualizadas automaticamente pelo Hibernate (hbm2ddl.auto=update) a partir da unidade de persistência ExemploJPA.

    Gerenciamento de Dependências: O projeto agora utiliza o Maven (pom.xml) para controle de dependências e build.

    DAOs JPA: As classes DAO (GenericJpaDAO, VendaJpaDAO) operam com o EntityManager, eliminando a necessidade de escrita manual de SQL.

As classes JDBC originais foram mantidas no projeto para fins de comparação, e os testes dos DAOs JDBC (ClienteDAOTest, ProdutoDAOTest, VendaDAOTest) foram ajustados para rodar contra a mesma base de dados.