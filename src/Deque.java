public class Deque<T> {
    private NodeDeque<T> cabeca = new NodeDeque<T>();
    private int tamanho = 0;

    public boolean isEmpity(){
        return tamanho==0;
    }

    public void addFirst(T info){
        NodeDeque<T> elemento = new NodeDeque<T>(info);
        if(isEmpity()){
            elemento.setAnterior(cabeca);
            cabeca.setProximo(elemento);
            cabeca.setAnterior(elemento);
            tamanho++;
        } else {
            elemento.setProximo(cabeca.getProximo());
            elemento.setAnterior(cabeca);
            cabeca.getProximo().setAnterior(elemento);
            cabeca.setProximo(elemento);
            tamanho++;
        }
    }

    public void addLast(T info){
        if(isEmpity()){
            addFirst(info);
        }else {
            NodeDeque<T> elemento = new NodeDeque<>(info);
            elemento.setAnterior(cabeca.getAnterior());
            elemento.setProximo(cabeca);
            cabeca.getAnterior().setProximo(elemento);
            cabeca.setAnterior(elemento);
            tamanho++;
        }
    }

    public T removeFirst() throws Exception{
        if (isEmpity()){
            throw new Exception("O deque está vazio");
        }
        NodeDeque<T> temp = cabeca.getProximo();
        cabeca.getProximo().getProximo().setAnterior(cabeca);
        cabeca.setProximo(cabeca.getProximo().getProximo());
        tamanho--;
        return temp.getInfo();
    }

    public T removeLast() throws Exception{
        if (isEmpity()){
            throw new Exception("O deque está vazio");
        }
        NodeDeque<T> temp = cabeca.getAnterior();
        cabeca.getAnterior().getAnterior().setProximo(cabeca);
        cabeca.setAnterior(cabeca.getAnterior().getAnterior());
        tamanho--;
        return temp.getInfo();
    }

    public void printDeque() throws Exception{
        if (isEmpity()){
            throw new Exception("O deque está vazio");
        }
        NodeDeque<T> temp = cabeca.getProximo();
        for(int i = 0 ; i < tamanho; i++){
            System.out.println(temp.getInfo());
            temp=temp.getProximo();
        }
    }
}
