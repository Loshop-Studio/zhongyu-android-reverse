package com.google.protobuf;

import com.google.protobuf.ArrayDecoders;
import java.io.IOException;

@CheckReturnValue
/* loaded from: classes4.dex */
interface Schema<T> {
    boolean equals(T t9, T t10);

    int getSerializedSize(T t9);

    int hashCode(T t9);

    boolean isInitialized(T t9);

    void makeImmutable(T t9);

    void mergeFrom(T t9, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    void mergeFrom(T t9, T t10);

    void mergeFrom(T t9, byte[] bArr, int i9, int i10, ArrayDecoders.Registers registers) throws IOException;

    T newInstance();

    void writeTo(T t9, Writer writer) throws IOException;
}
