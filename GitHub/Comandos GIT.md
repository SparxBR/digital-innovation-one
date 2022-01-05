# Comandos Git mais utilizados e como configurar



- começar a trabalhar com o codigo: git status e se não tiver pendencia fazer git pull se não verificar o que esta pendente.

  

- git checkout -b nova-funcionalidade

  sai da branch que esta e entra numa nova

  

- git stash save "nome do stash" 

  guardar as alterações da branch pra mudar de branch caso precise

  

- git stash list 

  mostra a lista de stath

  

- STASH salva os arquivos que esta em staged

  

- git stash pop 1 (numero  do stash que deseja abrir)

  para abrir um stash.

  

- git log --oneline

  trazer o log e, 1 só linha

  

O Git é fundamental para a otimização de projetos. E, com certeza, se você usa ou pretende usar o Git é importante que esteja familiarizado com os principais comandos Git.

Para isso, preparei este artigo com a criação dos principais atalhos para o Git. O que irá permitir potencializar o trabalho do dia a dia, garantindo uma melhor experiência e mais produtividade.

> **Git, SVN e CVS— comparação das** [principais ferramentas de controle de versão de software](https://blog.geekhunter.com.br/git-svn-e-cvs-comparacao-dos-principais-vcs/)**.**



## O que é o Git?

O Git é o sistema *opensource* de controle de versão mais popular da internet.

Ele pode ser usado principalmente no desenvolvimento de software, mas pode ser usado para registrar o histórico de edições de qualquer tipo de arquivo.

Cada diretório de trabalho do Git é um repositório com um histórico completo e habilidade total de acompanhamento das revisões, não dependente de acesso a uma rede ou a um servidor central.

## Como começar com o Git

Vou explicar utilizando o VSCode, editor que eu uso como padrão com o Git. Caso você queira saber como configurá-lo como editor padrão também, confira o link a seguir:

> [Visual Studio Code + Git](https://blog.geekhunter.com.br/visual-studio-code-como-editor-do-git/): como transformar o VSCode no editor padrão

Para começar, vamos abrir o arquivo **.gitconfig** responsável pelas opções de configuração do GIT, utilizando no terminal o comando:

```
git config --global -e
```

No arquivo de configuração, devemos encontrar a sessão **Alias**.

Caso essa sessão não exista no .gitconfig, realize a declaração desta nova sessão no final do arquivo, procedendo com a inclusão da expressão **alias entre colchetes**:

```
[alias]
```

![img](https://blog-geek-midia.s3.amazonaws.com/wp-content/uploads/2020/08/06093249/git1.png)

Após a declaração da sessão, podemos proceder com a configuração de nosso primeiro atalho para os métodos do Git.

### As Informações

Iremos criar um atalho para o comando **git status**, simplificando sua utilização.

Atente para o parâmetro **-s** no final do atalho criado, essa opção permite um status resumido resultando em maior dinamismo.

Caso em algum momento seja necessário um status mais completo podemos utilizar normalmente o comando: **git status**.

```
s = !git status -s
```

![git status](https://blog-geek-midia.s3.amazonaws.com/wp-content/uploads/2020/08/06094403/git2.png)

![comando git status ](https://blog-geek-midia.s3.amazonaws.com/wp-content/uploads/2020/08/06094420/git3.png)

### Os Commits

O segundo atalho que iremos criar será para o nosso processo de *commit*.

Nesta configuração utilizaremos os parâmetros **–all**, que adiciona todos os arquivos para o *staged* de mudanças, e logo em seguida **(&&)** executa o *commit* com o parâmetro **-m** que nos permite incluir a mensagem descritiva do nosso *commit*.

```
c = !git add --all && git commit -m
```

Lembre-se que caso você não queira adicionar todos os arquivos alterados para o processo de commit, deve-se incluir individualmente os arquivos que desejamos com o comando tradicional **git add [nome do arquivo]** e depois executarmos o comando **git commit -m “[Mensagem Descritiva]”**. Ou seja, o processo tradicional.

### Git Log

Também incluiremos o atalho para o comando **git log**, utilizando opções de personalização do comando, permitindo uma visualização mais amigável e descritiva.

Para isso utilizaremos o parâmetro **–prety=format:** que irá permitir customizarmos a apresentação de nossos *logs*, a partir do atalho que criarmos, com algumas opções específicas:

- **%h:** o percentual com a letra **h** minúscula irá apresentar o *hash* reduzido do *commit;*
- **%d:** o percentual com a letra **d** minúscula irá mostrar a *branch*, e também a *tag* caso exista, do *commit*;
- **%s:** o percentual coma letra **s** minúscula (**de subject**) irá demonstrar a mensagem do *commit*.
- **%cn:** nome da pessoa que realizou o *commit*;
- **%cr:** a data relativa do *commit.*

Também utilizaremos a opção de utilizar cores diferentes para cada coluna, o que facilita a visualização, utilizado o parâmetro **%** com a letra **C** maiúscula **(%C)** seguido da cor que desejamos entre parênteses **(blue)**.

```
l = !git log --pretty=format:'%C(blue)%h%C(red)%d %C(white)%s - %C(cyan)%cn, %C(green)%cr'
```

![git log](https://blog-geek-midia.s3.amazonaws.com/wp-content/uploads/2020/08/06102811/git5.png)

Por fim, o arquivo **.gitconfig** ficará desta forma.

![conclusão do gitconfig](https://blog-geek-midia.s3.amazonaws.com/wp-content/uploads/2020/08/06102847/git6-1024x767.png)

Assim concluímos a configuração dos atalhos básicos do Git que eu mais utilizo.

> Encontre a oportunidade de trabalho ideal para você! [Vagas para desenvolvedor](https://bit.ly/3kme2u7) com o seu perfil. Confira!

Agora que você já sabe como configurá-lo, gostaria de passar também, de forma mais geral e didática, os dez principais comandos do git que todo desenvolvedor deveria saber, confira:

## 10 Principais Comandos Git

### Git Clone

O Git clone é um comando para baixar o código-fonte existente de um repositório remoto (como o Github, por exemplo).

Existem algumas maneiras de baixar o código-fonte, mas principalmente eu prefiro o clone com o modo https:

```
git clone <https://nome-do-link>
```

### Git Branch

Com *branches*, vários desenvolvedores podem trabalhar em paralelo no mesmo projeto simultaneamente.

Pode-se usar o comando **git branch** para criar, listar e excluir *branches*.

Criando uma nova *branch*:

```
git branch <nome-do-branch>
```

Este comando criará uma *branch* localmente. Para enviar a nova *branch* para o repositório remoto, você precisa usar o seguinte comando:

```
git push -u <remote> <nome-da-branch>
```

Para ver as *branches*:

```
git branch or git branch --list
```

Deletando uma *branch*:

```
git branch -d <nome-da-branch>
```

### Git Checkout

Este é um dos comandos Git mais usados. Para trabalhar em uma *branch*, primeiro você precisa mudar para ela.

Usamos o *git checkout* principalmente para alternar de um *branch* para outro. Também podemos usá-lo para verificar arquivos e *commits*:

```
git checkout <nome-da-branch>
```

Há também um comando de atalho que permite criar e trocar para um *branch* ao mesmo tempo:

```
git checkout -b <nome-da-branch>
```

### Git Status

O comando status do Git fornece todas as informações necessárias sobre o branch atual.

```
git status
```

### Git Add

Quando criamos, modificamos ou excluímos um arquivo, essas alterações ocorrerão em nosso ambiente local e não serão incluídas no próximo *commit* (a menos que alteremos as configurações).

Precisamos usar o comando **git add** para incluir as alterações de um arquivo em nosso próximo *commit*.

Para adicionar um arquivo:

```
git add <arquivo>
```

Para adicionar tudo de uma vez:

```
git add -A
```

O comando **git add** não altera o repositório e as alterações não são salvas até usarmos o *git commit*.

### Git Commit

Este comando é como definir um ponto de verificação no processo de desenvolvimento, para o qual você pode voltar mais tarde, se necessário.

```
git commit -m "mensagem explicando a mudança no código"
```

### Git Push

Após confirmar as alterações, a próxima coisa que você deseja fazer é enviar as alterações para o servidor remoto.

O comando **git push** envia e salva suas confirmações no repositório remoto.

```
git push <remote> <nome-do-branch>
```

No entanto, se seu branch for criado recentemente, você também precisará fazer upload do branch com o seguinte comando:

```
git push -u origin <nome-do-branch>
```

### Git Pull

O comando **git pull** é usado para obter atualizações do repositório remoto.

Este comando é uma combinação de *git fetch* e *git merge*, o que significa que, quando usamos o **git pull**, ele recebe as atualizações do repositório remoto **git fetch** e aplica imediatamente as alterações mais recentes no seu local **git merge**.

```
git pull <remote>
```

### Git Revert

Existem várias maneiras de desfazer nossas alterações local ou remotamente (depende do que precisamos), mas devemos usar esses comandos com cuidado para evitar problemas.

Uma maneira segura de desfazer os *commits* é usando **git revert**.

```
git revert 'número do hash'
```

O número do hash pode ser conseguido pelo comando:

```
git log -- oneline
```

### Git Merge

Quando você conclui o desenvolvimento em sua branch e tudo funciona bem, a etapa final é mesclar as branches, isso é feito com o comando **git merge**.

```
git merge <nome-da-branch>
```

Lembrando que existem diversas outras opções de comandos e configurações, que podem ser verificadas na [documentação oficial do Git](https://git-scm.com/docs/git-config).

Agora que você já conheceu os principais comandos Git, te convido a ler o próximo post dessa trilha de conhecimento: **[O que é Commit e como usar Commits Semânticos](https://blog.geekhunter.com.br/o-que-e-commit-e-como-usar-commits-semanticos/)**.