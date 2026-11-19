package androidx.datastore;

import androidx.datastore.core.Serializer;
import androidx.datastore.core.okio.OkioSerializer;
import kotlin.jvm.internal.AbstractC9133u;
import okio.BufferedSink;
import okio.BufferedSource;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;

/* loaded from: classes2.dex */
public final class OkioSerializerWrapper<T> implements OkioSerializer<T> {
    private final Serializer<T> delegate;

    public OkioSerializerWrapper(Serializer<T> delegate) {
        AbstractC9133u.m16133g(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // androidx.datastore.core.okio.OkioSerializer
    public T getDefaultValue() {
        return this.delegate.getDefaultValue();
    }

    @Override // androidx.datastore.core.okio.OkioSerializer
    public Object readFrom(BufferedSource bufferedSource, InterfaceC9324c<? super T> interfaceC9324c) {
        return this.delegate.readFrom(bufferedSource.inputStream(), interfaceC9324c);
    }

    @Override // androidx.datastore.core.okio.OkioSerializer
    public Object writeTo(T t10, BufferedSink bufferedSink, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objWriteTo = this.delegate.writeTo(t10, bufferedSink.outputStream(), interfaceC9324c);
        return objWriteTo == AbstractC9434a.m17291f() ? objWriteTo : C8736p.f16368a;
    }
}
