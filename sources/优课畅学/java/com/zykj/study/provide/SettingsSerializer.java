package com.zykj.study.provide;

// RE note: DataStore settings.pb holds the page index (int32 #1) and position offset (float #2). Verified by original serializer round-trip.

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import com.google.protobuf.InvalidProtocolBufferException;
import com.zykj.study.proto.Settings;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;

@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class SettingsSerializer implements Serializer<Settings> {

    /* renamed from: a */
    public static final SettingsSerializer f11292a = new SettingsSerializer();

    /* renamed from: b */
    public static final Settings f11293b;

    static {
        Settings defaultInstance = Settings.getDefaultInstance();
        AbstractC9133u.m16132f(defaultInstance, "getDefaultInstance(...)");
        f11293b = defaultInstance;
    }

    private SettingsSerializer() {
    }

    @Override // androidx.datastore.core.Serializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Settings getDefaultValue() {
        return f11293b;
    }

    @Override // androidx.datastore.core.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object writeTo(Settings settings, OutputStream outputStream, InterfaceC9324c interfaceC9324c) {
        settings.writeTo(outputStream);
        return C8736p.f16368a;
    }

    @Override // androidx.datastore.core.Serializer
    public Object readFrom(InputStream inputStream, InterfaceC9324c<? super Settings> interfaceC9324c) throws CorruptionException {
        try {
            Settings from = Settings.parseFrom(inputStream);
            AbstractC9133u.m16132f(from, "parseFrom(...)");
            return from;
        } catch (InvalidProtocolBufferException e10) {
            throw new CorruptionException("Cannot read proto.", e10);
        }
    }
}
