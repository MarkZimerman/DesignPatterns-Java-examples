package strategy.task;

public interface Encryptor<T> {
    T encrypt(T message);
}
