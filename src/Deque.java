public class Deque<T> {
    private int tam =  0;
    NodeDeque<T> cabeca = new NodeDeque<>();
    NodeDeque<T> cauda = new NodeDeque<>();

    public boolean isEmpty(){
        if (tam == 0 ){
            return true;
        } else {
            return false;
        }
    }

    public void addFirst(T info){
        NodeDeque<T> elemento = new NodeDeque<T>(info);
        if (isEmpty()){
            cabeca.setProximo(elemento);
            cauda.setAnterior(elemento);
            elemento.setProximo(cauda);
            elemento.setAnterior(cabeca);
        } else {
            elemento.setProximo(cabeca.getProximo());
            elemento.setAnterior(cabeca);
            cabeca.getProximo().setAnterior(elemento);
            cabeca.setProximo(elemento);
        }
        tam++;
    }

    public void addLast(T info){
        NodeDeque<T> elemento = new NodeDeque<T>(info);
        if(isEmpty()){
            addFirst(info);
        } else {
            elemento.setAnterior(cauda.getAnterior());
            elemento.setProximo(cauda);
            cauda.getAnterior().setProximo(elemento);
            cauda.setAnterior(elemento);
        }
        tam++;
    }

    public T removeFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("O deque está vazio!");
        }
        NodeDeque<T> temp = cabeca.getProximo();
        cabeca.getProximo().getProximo().setAnterior(cabeca);
        cabeca.setProximo(cabeca.getProximo().getProximo());
        tam--;
        return temp.getInfo();
    }

    public T removeLast() throws Exception{
        if (isEmpty()){
            throw new Exception("O deque está vazio!");
        }
        NodeDeque<T> temp = cauda.getAnterior();
        cauda.getAnterior().getAnterior().setProximo(cauda);
        cauda.setAnterior(cauda.getAnterior().getAnterior());
        tam--;
        return temp.getInfo();
    }
}
