package mediatheque;

public interface ItemVisitor {
    void visit(Book idem);
    void visit(CD item);
}
