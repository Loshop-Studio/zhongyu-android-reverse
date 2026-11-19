package com.google.protobuf;

import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public interface LazyStringList extends ProtocolStringList {
    void add(ByteString byteString);

    void add(byte[] bArr);

    boolean addAllByteArray(Collection<byte[]> collection);

    boolean addAllByteString(Collection<? extends ByteString> collection);

    List<byte[]> asByteArrayList();

    byte[] getByteArray(int i6);

    ByteString getByteString(int i6);

    Object getRaw(int i6);

    List<?> getUnderlyingElements();

    LazyStringList getUnmodifiableView();

    void mergeFrom(LazyStringList lazyStringList);

    void set(int i6, ByteString byteString);

    void set(int i6, byte[] bArr);
}
