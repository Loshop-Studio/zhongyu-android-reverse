package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ArrayDecoders;

@CheckReturnValue
/* loaded from: classes2.dex */
interface Schema<T> {
    boolean equals(T t6, T t7);

    int getSerializedSize(T t6);

    int hashCode(T t6);

    boolean isInitialized(T t6);

    void makeImmutable(T t6);

    void mergeFrom(T t6, Reader reader, ExtensionRegistryLite extensionRegistryLite);

    void mergeFrom(T t6, T t7);

    void mergeFrom(T t6, byte[] bArr, int i6, int i7, ArrayDecoders.Registers registers);

    T newInstance();

    void writeTo(T t6, Writer writer);
}
