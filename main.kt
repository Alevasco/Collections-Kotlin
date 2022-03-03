fun main() {

/*
Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
*/


val listaEstoque = mutableListOf<String>()

  
while (true){
  println("\n**Estoque da loja de brinquedo**\n")

  println("1 - Adicionar itens no estoque")
  println("2 - Remover itens do estoque")
  println("3 - Atualizar itens do estoque")
  println("4 - Listar itens no estoque")
  println("5 - Sair")

  println("\nEscolha uma opção: ")
  val opc = readLine()!!.toInt()

  println("\n")

  when(opc){
    
        1 -> {
          print("Digite um item para ser adicionado no estoque: ")
          val item = readLine()!!
  
          if(item.isEmpty()){
            println("Valor inválido")
          }else{
            listaEstoque.add(item)
            println("Item inserido com sucesso!")
          }

      }

       2 -> {
          print("Digite um item para ser adicionado para ser removido do estoque: ")
          val item = readLine()!!
  
          if(item.isEmpty()){
            println("Valor inválido")
          }else{
            if(listaEstoque.contains(item)){
              listaEstoque.remove(item)
              println("O item $item foi removido com sucesso")
            }else{
              println("O item $item não existe na lista")
            }
          }
       }

      3 -> {
          print("Selecione um item de 0 a ${listaEstoque.size - 1}")
          val pos = readLine()!!.toInt()

          if(pos in 0..(listaEstoque.size - 1)){
           print("Agora digite o produto que a ser atualizado: ")
                  val item = readLine()!!
        
                  listaEstoque[pos] = item
          }else{
           println("Esse item não existe")
          }
      }

     
       4 -> {
          if(listaEstoque.isEmpty()){
            println("O estoque está vazio")
            }else{
             println("**Itens do estoque**")
  
             listaEstoque.forEach {
             println(it)
            }
          }
       }
  
       else -> break 
        
    }
    
  }
    
  }