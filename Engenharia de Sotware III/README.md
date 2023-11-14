Exemplos de aplicações dos padrões de projeto Pagamento de Compras (crédito, débito e dinheiro) em java

<table>
    <tr>
        <td>Nome do padrão</td>
        <td>Anti-padrão</td>
        <td>Definição do padrão</td>
        <td>Problema que ele resolve</td>
        <td>Onde é utilizado na arquitetura Java</td>
    </tr>
    <tr>
        <td>Strategy</td>
        <td>Herança</td>
        <td>O padrão de design Strategy é um padrão de design comportamental que permite definir uma família de algoritmos, encapsulá-los e torná-los intercambiáveis.</td>
        <td>Evita a complexidade de decisões incorporadas e torna o código mais flexível.</td>
        <td>Usado em Java para gerenciar estratégias de roteamento de rede, flexibilidade.</td>
    </tr>
    </tr>
    <tr>
        <td>Observer</td>
        <td>Alto acoplamento</td>
        <td>O padrão de design Observer é um padrão de design comportamental que permite que um objeto, mantenha uma lista de objetos dependentes.</td>
        <td>Reduz o alto acoplamento entre objetos.</td>
        <td>Usado em Java para atualizar automaticamente interfaces de usuário em tempo real e também manter consistência de dados.</td>
    </tr>
    <tr>
        <td>Composite</td>
        <td>Código de grande complexidade</td>
        <td>É aplicada quando se precisa criar estruturas hierárquicas de objetos, como árvores.</td>
        <td>Evita a duplicação de código e usa a recursão para dividir problemas em partes menores e resolvê-los eficientemente.</td>
        <td>Usado em Java para representar estruturas de documentos, criar árvores de categorias, etc.</td>
    </tr>
    <tr>
        <td>Facade</td>
        <td>Uma única classe ou objeto assume muitas responsabilidades.</td>
        <td>Fornece uma interface fácil de usar para um conjunto de funcionalidades complexas.</td>
        <td>Resolve o desafio de interagir com sistemas complexos, simplificando o acesso aos serviços essenciais.</td>
        <td>Em java é usado em sistemas de gerenciamento de banco de dados, operações de banco de dados, etc.</td>
    </tr>
    <tr>
        <td>Singleton</td>
        <td>Múltiplas instâncias da classe parecem compartilhar o mesmo estado</td>
        <td>Garante que uma classe tenha somente uma instância.</td>
        <td>Resolve o problema de controlar múltiplas instâncias da mesma classe.</td>
        <td>Em java é usado para gerenciar recursos compartilhados, configurações de aplicativos globais, etc.</td>
    </tr>
</table>
