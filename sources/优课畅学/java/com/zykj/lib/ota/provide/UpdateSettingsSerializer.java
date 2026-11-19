package com.zykj.lib.ota.provide;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p252t3.C10090a;

/* loaded from: classes4.dex */
// RE note: In 1.1.3 the generated message refers to a removed ignoreVersionCode_ field. The original parser fails when reading the test file.
public final class UpdateSettingsSerializer implements Serializer<C10090a> {

    /* renamed from: a */
    public static final UpdateSettingsSerializer f10275a = new UpdateSettingsSerializer();

    /* renamed from: b */
    public static final C10090a f10276b;

    static {
        C10090a c10090aM18844b = C10090a.m18844b();
        AbstractC9133u.m16132f(c10090aM18844b, "getDefaultInstance(...)");
        f10276b = c10090aM18844b;
    }

    private UpdateSettingsSerializer() {
    }

    @Override // androidx.datastore.core.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C10090a getDefaultValue() {
        return f10276b;
    }

    @Override // androidx.datastore.core.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object writeTo(C10090a c10090a, OutputStream outputStream, InterfaceC9324c interfaceC9324c) {
        c10090a.writeTo(outputStream);
        return C8736p.f16368a;
    }

    @Override // androidx.datastore.core.Serializer
    public Object readFrom(InputStream inputStream, InterfaceC9324c<? super C10090a> interfaceC9324c) throws CorruptionException {
        try {
            C10090a c10090aM18845c = C10090a.m18845c(inputStream);
            AbstractC9133u.m16132f(c10090aM18845c, "parseFrom(...)");
            return c10090aM18845c;
        } catch (InvalidProtocolBufferException e10) {
            throw new CorruptionException("Cannot read proto.", e10);
        }
    }
}
