package mediatheque;

public class BookPrinter
implements ItemVisitor{
        public BookPrinter(){}

        public void visit(CD item){}

        public void visit (Book item){

            System.out.println(item.toString());    
        }
} 

