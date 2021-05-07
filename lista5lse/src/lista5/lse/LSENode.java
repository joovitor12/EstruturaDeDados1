
package lista5.lse;


class LSENode<T> {
    private T info;
    private LSENode <T> prox;
    
    LSENode (T valor){
        info = valor;
    }
     void setInfo (T valor){
        info = valor;
    }
    void setProx (LSENode <T> novoProx){
       prox = novoProx;
    }
    T getInfo(){
        return info;
    }
     LSENode <T> getProx(){
        return prox;
    }
}
