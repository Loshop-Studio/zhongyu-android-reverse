package androidx.datastore.core;

import java.io.InputStream;
import java.io.OutputStream;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;

/* loaded from: classes2.dex */
public interface Serializer<T> {
    T getDefaultValue();

    Object readFrom(InputStream inputStream, InterfaceC9324c<? super T> interfaceC9324c);

    Object writeTo(T t10, OutputStream outputStream, InterfaceC9324c<? super C8736p> interfaceC9324c);
}
