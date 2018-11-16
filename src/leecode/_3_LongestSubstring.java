package leecode;

/**
 * Created by Shaun on 2018/10/22.
 */
/*public class _3_LongestSubstring {
    Node head =null;

    class Node{
        Node next = null;
        String data;

        public Node(String data){
            this.data=data;
        }
    }
    public Node LongestSub(Node head){
        int length =0;
        Node tmpHead=head ;
        Node pre =null;
        Node curr = null;
        if (tmpHead!=null){
            int i =0;
            curr = tmpHead.next;
            if(curr.data!= tmpHead.data){
                      i++;
                    curr = curr.next;
            }
        }


    }
}
**/