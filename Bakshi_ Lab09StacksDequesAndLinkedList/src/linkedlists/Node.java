package linkedlists;


/**
 * @author Ronak Bakshi
 */
public class Node<E>
{
   E data;
   Node<E> nextNode;
   
   public Node(E data)
   {
      this.data = data;
   }
   /**
    * 
    * @return String
    */
   @Override
   public String toString()
   {
      return data.toString();
   }
}
