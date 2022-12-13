public class NodeDeque<T> {
    private NodeDeque<T> anterior;
    private NodeDeque<T> proximo;
    private T info;

    public NodeDeque(T info){
        this.info = info;
        this.proximo = null;
        this.anterior = null;
    }

    public NodeDeque(){
        this(null);
    }

    public NodeDeque<T> getAnterior() {
        return anterior;
    }
    public void setAnterior(NodeDeque<T> anterior) {
        this.anterior = anterior;
    }
    public NodeDeque<T> getProximo() {
        return proximo;
    }
    public void setProximo(NodeDeque<T> proximo) {
        this.proximo = proximo;
    }
    public T getInfo() {
        return info;
    }
    public void setInfo(T info) {
        this.info = info;
    }
}
