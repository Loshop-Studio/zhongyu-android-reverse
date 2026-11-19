package p147rx.internal.util.unsafe;

/* loaded from: classes2.dex */
public interface MessagePassingQueue<M> {
    boolean isEmpty();

    boolean offer(M m3);

    M peek();

    M poll();

    int size();
}
