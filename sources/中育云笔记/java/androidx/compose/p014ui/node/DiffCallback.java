package androidx.compose.p014ui.node;

/* loaded from: classes2.dex */
public interface DiffCallback {
    boolean areItemsTheSame(int i10, int i11);

    void insert(int i10);

    void remove(int i10, int i11);

    void same(int i10, int i11);
}
