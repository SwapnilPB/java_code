package javaprac;

public class AddLinkedListNum {
    public ListNodeData addTwoNums(ListNodeData l1, ListNodeData l2){

        return l1;
    }

    public static void main(String[] args) {
        ListNodeData ls = new AddLinkedListNum().addTwoNums(new ListNodeData(3), new ListNodeData(2));
    }
}


class ListNodeData {
    int val;
    ListNodeData next;

    ListNodeData() {
    }

    ListNodeData(int val) {
        this.val = val;
    }

    ListNodeData(int val, ListNodeData next) {
        this.val = val;
        this.next = next;
    }
}