package androidx.emoji2.text.flatbuffer;

/* loaded from: classes2.dex */
interface ReadBuf {
    byte[] data();

    byte get(int i6);

    boolean getBoolean(int i6);

    double getDouble(int i6);

    float getFloat(int i6);

    int getInt(int i6);

    long getLong(int i6);

    short getShort(int i6);

    String getString(int i6, int i7);

    int limit();
}
