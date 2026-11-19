package androidx.savedstate.serialization;

import android.os.Bundle;
import androidx.savedstate.SavedStateReader;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p246s8.InterfaceC10051a;
import p268u8.AbstractC10219o;
import p268u8.InterfaceC10210f;
import p279v8.AbstractC10252a;
import p279v8.InterfaceC10254c;
import p301x8.AbstractC10583a;

/* loaded from: classes3.dex */
public final class SavedStateDecoder extends AbstractC10252a {
    private final SavedStateConfiguration configuration;
    private int index;
    private String key;
    private final Bundle savedState;
    private final AbstractC10583a serializersModule;

    public SavedStateDecoder(Bundle savedState, SavedStateConfiguration configuration) {
        AbstractC9133u.m16133g(savedState, "savedState");
        AbstractC9133u.m16133g(configuration, "configuration");
        this.savedState = savedState;
        this.configuration = configuration;
        this.key = "";
        this.serializersModule = configuration.getSerializersModule();
    }

    private final boolean[] decodeBooleanArray() {
        return SavedStateReader.m27239getBooleanArrayimpl(SavedStateReader.m27229constructorimpl(this.savedState), this.key);
    }

    private final char[] decodeCharArray() {
        return SavedStateReader.m27243getCharArrayimpl(SavedStateReader.m27229constructorimpl(this.savedState), this.key);
    }

    private final double[] decodeDoubleArray() {
        return SavedStateReader.m27253getDoubleArrayimpl(SavedStateReader.m27229constructorimpl(this.savedState), this.key);
    }

    private static final boolean decodeElementIndex$presentInEncoding(SavedStateDecoder savedStateDecoder, InterfaceC10210f interfaceC10210f, int i10) {
        return SavedStateReader.m27230containsimpl(SavedStateReader.m27229constructorimpl(savedStateDecoder.savedState), interfaceC10210f.mo19087d(i10));
    }

    private final float[] decodeFloatArray() {
        return SavedStateReader.m27257getFloatArrayimpl(SavedStateReader.m27229constructorimpl(this.savedState), this.key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> T decodeFormatSpecificTypes(InterfaceC10051a interfaceC10051a) {
        T t10 = (T) SavedStateDecoder_androidKt.decodeFormatSpecificTypesOnPlatform(this, interfaceC10051a);
        if (t10 != null) {
            return t10;
        }
        InterfaceC10210f descriptor = interfaceC10051a.getDescriptor();
        if (AbstractC9133u.m16128b(descriptor, SavedStateCodecUtilsKt.getIntListDescriptor())) {
            return (T) decodeIntList();
        }
        if (AbstractC9133u.m16128b(descriptor, SavedStateCodecUtilsKt.getStringListDescriptor())) {
            return (T) decodeStringList();
        }
        if (AbstractC9133u.m16128b(descriptor, SavedStateCodecUtilsKt.getBooleanArrayDescriptor())) {
            return (T) decodeBooleanArray();
        }
        if (AbstractC9133u.m16128b(descriptor, SavedStateCodecUtilsKt.getCharArrayDescriptor())) {
            return (T) decodeCharArray();
        }
        if (AbstractC9133u.m16128b(descriptor, SavedStateCodecUtilsKt.getDoubleArrayDescriptor())) {
            return (T) decodeDoubleArray();
        }
        if (AbstractC9133u.m16128b(descriptor, SavedStateCodecUtilsKt.getFloatArrayDescriptor())) {
            return (T) decodeFloatArray();
        }
        if (AbstractC9133u.m16128b(descriptor, SavedStateCodecUtilsKt.getIntArrayDescriptor())) {
            return (T) decodeIntArray();
        }
        if (AbstractC9133u.m16128b(descriptor, SavedStateCodecUtilsKt.getLongArrayDescriptor())) {
            return (T) decodeLongArray();
        }
        if (AbstractC9133u.m16128b(descriptor, SavedStateCodecUtilsKt.getStringArrayDescriptor())) {
            return (T) decodeStringArray();
        }
        return null;
    }

    private final int[] decodeIntArray() {
        return SavedStateReader.m27261getIntArrayimpl(SavedStateReader.m27229constructorimpl(this.savedState), this.key);
    }

    private final List<Integer> decodeIntList() {
        return SavedStateReader.m27263getIntListimpl(SavedStateReader.m27229constructorimpl(this.savedState), this.key);
    }

    private final long[] decodeLongArray() {
        return SavedStateReader.m27271getLongArrayimpl(SavedStateReader.m27229constructorimpl(this.savedState), this.key);
    }

    private final String[] decodeStringArray() {
        return SavedStateReader.m27301getStringArrayimpl(SavedStateReader.m27229constructorimpl(this.savedState), this.key);
    }

    private final List<String> decodeStringList() {
        return SavedStateReader.m27303getStringListimpl(SavedStateReader.m27229constructorimpl(this.savedState), this.key);
    }

    @Override // p279v8.AbstractC10252a, p279v8.InterfaceC10256e
    public InterfaceC10254c beginStructure(InterfaceC10210f descriptor) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
        return AbstractC9133u.m16128b(this.key, "") ? this : new SavedStateDecoder(SavedStateReader.m27286getSavedStateimpl(SavedStateReader.m27229constructorimpl(this.savedState), this.key), this.configuration);
    }

    @Override // p279v8.AbstractC10252a, p279v8.InterfaceC10256e
    public boolean decodeBoolean() {
        return SavedStateReader.m27238getBooleanimpl(SavedStateReader.m27229constructorimpl(this.savedState), this.key);
    }

    @Override // p279v8.AbstractC10252a, p279v8.InterfaceC10256e
    public byte decodeByte() {
        return (byte) SavedStateReader.m27260getIntimpl(SavedStateReader.m27229constructorimpl(this.savedState), this.key);
    }

    @Override // p279v8.AbstractC10252a, p279v8.InterfaceC10256e
    public char decodeChar() {
        return SavedStateReader.m27242getCharimpl(SavedStateReader.m27229constructorimpl(this.savedState), this.key);
    }

    @Override // p279v8.AbstractC10252a, p279v8.InterfaceC10256e
    public double decodeDouble() {
        return SavedStateReader.m27252getDoubleimpl(SavedStateReader.m27229constructorimpl(this.savedState), this.key);
    }

    @Override // p279v8.InterfaceC10254c
    public int decodeElementIndex(InterfaceC10210f descriptor) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
        int iM27309sizeimpl = (AbstractC9133u.m16128b(descriptor.getKind(), AbstractC10219o.b.f20394a) || AbstractC9133u.m16128b(descriptor.getKind(), AbstractC10219o.c.f20395a)) ? SavedStateReader.m27309sizeimpl(SavedStateReader.m27229constructorimpl(this.savedState)) : descriptor.mo19086c();
        while (true) {
            int i10 = this.index;
            if (i10 >= iM27309sizeimpl || !descriptor.mo19090g(i10) || decodeElementIndex$presentInEncoding(this, descriptor, this.index)) {
                break;
            }
            this.index++;
        }
        int i11 = this.index;
        if (i11 >= iM27309sizeimpl) {
            return -1;
        }
        this.key = descriptor.mo19087d(i11);
        int i12 = this.index;
        this.index = i12 + 1;
        return i12;
    }

    @Override // p279v8.AbstractC10252a, p279v8.InterfaceC10256e
    public int decodeEnum(InterfaceC10210f enumDescriptor) {
        AbstractC9133u.m16133g(enumDescriptor, "enumDescriptor");
        return SavedStateReader.m27260getIntimpl(SavedStateReader.m27229constructorimpl(this.savedState), this.key);
    }

    @Override // p279v8.AbstractC10252a, p279v8.InterfaceC10256e
    public float decodeFloat() {
        return SavedStateReader.m27256getFloatimpl(SavedStateReader.m27229constructorimpl(this.savedState), this.key);
    }

    @Override // p279v8.AbstractC10252a, p279v8.InterfaceC10256e
    public int decodeInt() {
        return SavedStateReader.m27260getIntimpl(SavedStateReader.m27229constructorimpl(this.savedState), this.key);
    }

    @Override // p279v8.AbstractC10252a, p279v8.InterfaceC10256e
    public long decodeLong() {
        return SavedStateReader.m27270getLongimpl(SavedStateReader.m27229constructorimpl(this.savedState), this.key);
    }

    @Override // p279v8.AbstractC10252a, p279v8.InterfaceC10256e
    public boolean decodeNotNullMark() {
        return !SavedStateReader.m27308isNullimpl(SavedStateReader.m27229constructorimpl(this.savedState), this.key);
    }

    @Override // p279v8.AbstractC10252a, p279v8.InterfaceC10256e
    public <T> T decodeSerializableValue(InterfaceC10051a deserializer) {
        AbstractC9133u.m16133g(deserializer, "deserializer");
        T t10 = (T) decodeFormatSpecificTypes(deserializer);
        return t10 == null ? (T) super.decodeSerializableValue(deserializer) : t10;
    }

    @Override // p279v8.AbstractC10252a, p279v8.InterfaceC10256e
    public short decodeShort() {
        return (short) SavedStateReader.m27260getIntimpl(SavedStateReader.m27229constructorimpl(this.savedState), this.key);
    }

    @Override // p279v8.AbstractC10252a, p279v8.InterfaceC10256e
    public String decodeString() {
        return SavedStateReader.m27300getStringimpl(SavedStateReader.m27229constructorimpl(this.savedState), this.key);
    }

    public final String getKey$savedstate_release() {
        return this.key;
    }

    public final Bundle getSavedState$savedstate_release() {
        return this.savedState;
    }

    @Override // p279v8.InterfaceC10254c
    public AbstractC10583a getSerializersModule() {
        return this.serializersModule;
    }
}
