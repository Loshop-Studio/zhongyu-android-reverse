package androidx.datastore.core.okio;

import okio.BufferedSink;
import okio.BufferedSource;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;

/* loaded from: classes2.dex */
public interface OkioSerializer<T> {
    T getDefaultValue();

    Object readFrom(BufferedSource bufferedSource, InterfaceC9324c<? super T> interfaceC9324c);

    Object writeTo(T t10, BufferedSink bufferedSink, InterfaceC9324c<? super C8736p> interfaceC9324c);
}
