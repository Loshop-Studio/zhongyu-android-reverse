package com.google.protobuf;

import com.google.protobuf.ArrayDecoders;
import java.io.IOException;

@CheckReturnValue
/* loaded from: classes3.dex */
interface Schema<T> {
    boolean equals(T t8, T t9);

    int getSerializedSize(T t8);

    int hashCode(T t8);

    boolean isInitialized(T t8);

    void makeImmutable(T t8);

    void mergeFrom(T t8, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    void mergeFrom(T t8, T t9);

    void mergeFrom(T t8, byte[] bArr, int i, int i8, ArrayDecoders.Registers registers) throws IOException;

    T newInstance();

    void writeTo(T t8, Writer writer) throws IOException;
}
