package androidx.sqlite;

/* loaded from: classes3.dex */
public interface SQLiteConnection extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    SQLiteStatement prepare(String str);
}
