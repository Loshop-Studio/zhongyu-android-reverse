package androidx.savedstate.serialization;

import android.os.Bundle;
import androidx.savedstate.SavedStateReader;
import ee.AbstractC9138o;
import ee.InterfaceC9129f;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5431a;
import p153fe.AbstractC9224a;
import p153fe.InterfaceC9226c;
import p182he.AbstractC9553a;

/* loaded from: classes3.dex */
public final class SavedStateDecoder extends AbstractC9224a {
    private final SavedStateConfiguration configuration;
    private int index;
    private String key;
    private final Bundle savedState;
    private final AbstractC9553a serializersModule;

    public SavedStateDecoder(Bundle savedState, SavedStateConfiguration configuration) {
        AbstractC9979u.m20294g(savedState, "savedState");
        AbstractC9979u.m20294g(configuration, "configuration");
        this.savedState = savedState;
        this.configuration = configuration;
        this.key = "";
        this.serializersModule = configuration.getSerializersModule();
    }

    private final boolean[] decodeBooleanArray() {
        return SavedStateReader.m33834getBooleanArrayimpl(SavedStateReader.m33824constructorimpl(this.savedState), this.key);
    }

    private final char[] decodeCharArray() {
        return SavedStateReader.m33838getCharArrayimpl(SavedStateReader.m33824constructorimpl(this.savedState), this.key);
    }

    private final double[] decodeDoubleArray() {
        return SavedStateReader.m33848getDoubleArrayimpl(SavedStateReader.m33824constructorimpl(this.savedState), this.key);
    }

    private static final boolean decodeElementIndex$presentInEncoding(SavedStateDecoder savedStateDecoder, InterfaceC9129f interfaceC9129f, int i10) {
        return SavedStateReader.m33825containsimpl(SavedStateReader.m33824constructorimpl(savedStateDecoder.savedState), interfaceC9129f.mo17959d(i10));
    }

    private final float[] decodeFloatArray() {
        return SavedStateReader.m33852getFloatArrayimpl(SavedStateReader.m33824constructorimpl(this.savedState), this.key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> T decodeFormatSpecificTypes(InterfaceC5431a interfaceC5431a) {
        T t10 = (T) SavedStateDecoder_androidKt.decodeFormatSpecificTypesOnPlatform(this, interfaceC5431a);
        if (t10 != null) {
            return t10;
        }
        InterfaceC9129f descriptor = interfaceC5431a.getDescriptor();
        if (AbstractC9979u.m20289b(descriptor, SavedStateCodecUtilsKt.getIntListDescriptor())) {
            return (T) decodeIntList();
        }
        if (AbstractC9979u.m20289b(descriptor, SavedStateCodecUtilsKt.getStringListDescriptor())) {
            return (T) decodeStringList();
        }
        if (AbstractC9979u.m20289b(descriptor, SavedStateCodecUtilsKt.getBooleanArrayDescriptor())) {
            return (T) decodeBooleanArray();
        }
        if (AbstractC9979u.m20289b(descriptor, SavedStateCodecUtilsKt.getCharArrayDescriptor())) {
            return (T) decodeCharArray();
        }
        if (AbstractC9979u.m20289b(descriptor, SavedStateCodecUtilsKt.getDoubleArrayDescriptor())) {
            return (T) decodeDoubleArray();
        }
        if (AbstractC9979u.m20289b(descriptor, SavedStateCodecUtilsKt.getFloatArrayDescriptor())) {
            return (T) decodeFloatArray();
        }
        if (AbstractC9979u.m20289b(descriptor, SavedStateCodecUtilsKt.getIntArrayDescriptor())) {
            return (T) decodeIntArray();
        }
        if (AbstractC9979u.m20289b(descriptor, SavedStateCodecUtilsKt.getLongArrayDescriptor())) {
            return (T) decodeLongArray();
        }
        if (AbstractC9979u.m20289b(descriptor, SavedStateCodecUtilsKt.getStringArrayDescriptor())) {
            return (T) decodeStringArray();
        }
        return null;
    }

    private final int[] decodeIntArray() {
        return SavedStateReader.m33856getIntArrayimpl(SavedStateReader.m33824constructorimpl(this.savedState), this.key);
    }

    private final List<Integer> decodeIntList() {
        return SavedStateReader.m33858getIntListimpl(SavedStateReader.m33824constructorimpl(this.savedState), this.key);
    }

    private final long[] decodeLongArray() {
        return SavedStateReader.m33866getLongArrayimpl(SavedStateReader.m33824constructorimpl(this.savedState), this.key);
    }

    private final String[] decodeStringArray() {
        return SavedStateReader.m33896getStringArrayimpl(SavedStateReader.m33824constructorimpl(this.savedState), this.key);
    }

    private final List<String> decodeStringList() {
        return SavedStateReader.m33898getStringListimpl(SavedStateReader.m33824constructorimpl(this.savedState), this.key);
    }

    @Override // p153fe.AbstractC9224a, p153fe.InterfaceC9228e
    public InterfaceC9226c beginStructure(InterfaceC9129f descriptor) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
        return AbstractC9979u.m20289b(this.key, "") ? this : new SavedStateDecoder(SavedStateReader.m33881getSavedStateimpl(SavedStateReader.m33824constructorimpl(this.savedState), this.key), this.configuration);
    }

    @Override // p153fe.AbstractC9224a, p153fe.InterfaceC9228e
    public boolean decodeBoolean() {
        return SavedStateReader.m33833getBooleanimpl(SavedStateReader.m33824constructorimpl(this.savedState), this.key);
    }

    @Override // p153fe.AbstractC9224a, p153fe.InterfaceC9228e
    public byte decodeByte() {
        return (byte) SavedStateReader.m33855getIntimpl(SavedStateReader.m33824constructorimpl(this.savedState), this.key);
    }

    @Override // p153fe.AbstractC9224a, p153fe.InterfaceC9228e
    public char decodeChar() {
        return SavedStateReader.m33837getCharimpl(SavedStateReader.m33824constructorimpl(this.savedState), this.key);
    }

    @Override // p153fe.AbstractC9224a, p153fe.InterfaceC9228e
    public double decodeDouble() {
        return SavedStateReader.m33847getDoubleimpl(SavedStateReader.m33824constructorimpl(this.savedState), this.key);
    }

    @Override // p153fe.InterfaceC9226c
    public int decodeElementIndex(InterfaceC9129f descriptor) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
        int iM33904sizeimpl = (AbstractC9979u.m20289b(descriptor.getKind(), AbstractC9138o.b.f21333a) || AbstractC9979u.m20289b(descriptor.getKind(), AbstractC9138o.c.f21334a)) ? SavedStateReader.m33904sizeimpl(SavedStateReader.m33824constructorimpl(this.savedState)) : descriptor.mo17958c();
        while (true) {
            int i10 = this.index;
            if (i10 >= iM33904sizeimpl || !descriptor.mo17962g(i10) || decodeElementIndex$presentInEncoding(this, descriptor, this.index)) {
                break;
            }
            this.index++;
        }
        int i11 = this.index;
        if (i11 >= iM33904sizeimpl) {
            return -1;
        }
        this.key = descriptor.mo17959d(i11);
        int i12 = this.index;
        this.index = i12 + 1;
        return i12;
    }

    @Override // p153fe.AbstractC9224a, p153fe.InterfaceC9228e
    public int decodeEnum(InterfaceC9129f enumDescriptor) {
        AbstractC9979u.m20294g(enumDescriptor, "enumDescriptor");
        return SavedStateReader.m33855getIntimpl(SavedStateReader.m33824constructorimpl(this.savedState), this.key);
    }

    @Override // p153fe.AbstractC9224a, p153fe.InterfaceC9228e
    public float decodeFloat() {
        return SavedStateReader.m33851getFloatimpl(SavedStateReader.m33824constructorimpl(this.savedState), this.key);
    }

    @Override // p153fe.AbstractC9224a, p153fe.InterfaceC9228e
    public int decodeInt() {
        return SavedStateReader.m33855getIntimpl(SavedStateReader.m33824constructorimpl(this.savedState), this.key);
    }

    @Override // p153fe.AbstractC9224a, p153fe.InterfaceC9228e
    public long decodeLong() {
        return SavedStateReader.m33865getLongimpl(SavedStateReader.m33824constructorimpl(this.savedState), this.key);
    }

    @Override // p153fe.AbstractC9224a, p153fe.InterfaceC9228e
    public boolean decodeNotNullMark() {
        return !SavedStateReader.m33903isNullimpl(SavedStateReader.m33824constructorimpl(this.savedState), this.key);
    }

    @Override // p153fe.AbstractC9224a, p153fe.InterfaceC9228e
    public <T> T decodeSerializableValue(InterfaceC5431a deserializer) {
        AbstractC9979u.m20294g(deserializer, "deserializer");
        T t10 = (T) decodeFormatSpecificTypes(deserializer);
        return t10 == null ? (T) super.decodeSerializableValue(deserializer) : t10;
    }

    @Override // p153fe.AbstractC9224a, p153fe.InterfaceC9228e
    public short decodeShort() {
        return (short) SavedStateReader.m33855getIntimpl(SavedStateReader.m33824constructorimpl(this.savedState), this.key);
    }

    @Override // p153fe.AbstractC9224a, p153fe.InterfaceC9228e
    public String decodeString() {
        return SavedStateReader.m33895getStringimpl(SavedStateReader.m33824constructorimpl(this.savedState), this.key);
    }

    public final String getKey$savedstate_release() {
        return this.key;
    }

    public final Bundle getSavedState$savedstate_release() {
        return this.savedState;
    }

    @Override // p153fe.InterfaceC9226c
    public AbstractC9553a getSerializersModule() {
        return this.serializersModule;
    }
}
