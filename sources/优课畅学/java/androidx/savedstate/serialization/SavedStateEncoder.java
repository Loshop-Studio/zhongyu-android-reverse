package androidx.savedstate.serialization;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC9080a;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.AbstractC8726f;
import p246s8.InterfaceC10059i;
import p268u8.AbstractC10219o;
import p268u8.InterfaceC10210f;
import p279v8.AbstractC10253b;
import p279v8.InterfaceC10255d;
import p301x8.AbstractC10583a;

/* loaded from: classes3.dex */
public final class SavedStateEncoder extends AbstractC10253b {
    private final SavedStateConfiguration configuration;
    private String key;
    private final Bundle savedState;
    private final AbstractC10583a serializersModule;

    public SavedStateEncoder(Bundle savedState, SavedStateConfiguration configuration) {
        AbstractC9133u.m16133g(savedState, "savedState");
        AbstractC9133u.m16133g(configuration, "configuration");
        this.savedState = savedState;
        this.configuration = configuration;
        this.key = "";
        this.serializersModule = configuration.getSerializersModule();
    }

    private final void checkDiscriminatorCollisions(Bundle bundle, String str) {
        if (this.configuration.getClassDiscriminatorMode() == 1) {
            boolean zM27230containsimpl = SavedStateReader.m27230containsimpl(SavedStateReader.m27229constructorimpl(bundle), "type");
            boolean zM16128b = AbstractC9133u.m16128b(str, "type");
            if (zM27230containsimpl && zM16128b) {
                throw new IllegalArgumentException("SavedStateEncoder for " + SavedStateReader.m27300getStringimpl(SavedStateReader.m27229constructorimpl(bundle), "type") + " has property '" + str + "' that conflicts with the class discriminator. You can rename a property with @SerialName annotation.");
            }
        }
    }

    private final void encodeBooleanArray(boolean[] zArr) {
        SavedStateWriter.m27322putBooleanArrayimpl(SavedStateWriter.m27315constructorimpl(this.savedState), this.key, zArr);
    }

    private final void encodeCharArray(char[] cArr) {
        SavedStateWriter.m27324putCharArrayimpl(SavedStateWriter.m27315constructorimpl(this.savedState), this.key, cArr);
    }

    private final void encodeDoubleArray(double[] dArr) {
        SavedStateWriter.m27329putDoubleArrayimpl(SavedStateWriter.m27315constructorimpl(this.savedState), this.key, dArr);
    }

    private final void encodeFloatArray(float[] fArr) {
        SavedStateWriter.m27331putFloatArrayimpl(SavedStateWriter.m27315constructorimpl(this.savedState), this.key, fArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> boolean encodeFormatSpecificTypes(InterfaceC10059i interfaceC10059i, T t10) {
        if (SavedStateEncoder_androidKt.encodeFormatSpecificTypesOnPlatform(this, interfaceC10059i, t10)) {
            return true;
        }
        InterfaceC10210f descriptor = interfaceC10059i.getDescriptor();
        if (AbstractC9133u.m16128b(descriptor, SavedStateCodecUtilsKt.getIntListDescriptor())) {
            AbstractC9133u.m16131e(t10, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Int>");
            encodeIntList((List) t10);
            return true;
        }
        if (AbstractC9133u.m16128b(descriptor, SavedStateCodecUtilsKt.getStringListDescriptor())) {
            AbstractC9133u.m16131e(t10, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            encodeStringList((List) t10);
            return true;
        }
        if (AbstractC9133u.m16128b(descriptor, SavedStateCodecUtilsKt.getBooleanArrayDescriptor())) {
            AbstractC9133u.m16131e(t10, "null cannot be cast to non-null type kotlin.BooleanArray");
            encodeBooleanArray((boolean[]) t10);
            return true;
        }
        if (AbstractC9133u.m16128b(descriptor, SavedStateCodecUtilsKt.getCharArrayDescriptor())) {
            AbstractC9133u.m16131e(t10, "null cannot be cast to non-null type kotlin.CharArray");
            encodeCharArray((char[]) t10);
            return true;
        }
        if (AbstractC9133u.m16128b(descriptor, SavedStateCodecUtilsKt.getDoubleArrayDescriptor())) {
            AbstractC9133u.m16131e(t10, "null cannot be cast to non-null type kotlin.DoubleArray");
            encodeDoubleArray((double[]) t10);
            return true;
        }
        if (AbstractC9133u.m16128b(descriptor, SavedStateCodecUtilsKt.getFloatArrayDescriptor())) {
            AbstractC9133u.m16131e(t10, "null cannot be cast to non-null type kotlin.FloatArray");
            encodeFloatArray((float[]) t10);
            return true;
        }
        if (AbstractC9133u.m16128b(descriptor, SavedStateCodecUtilsKt.getIntArrayDescriptor())) {
            AbstractC9133u.m16131e(t10, "null cannot be cast to non-null type kotlin.IntArray");
            encodeIntArray((int[]) t10);
            return true;
        }
        if (AbstractC9133u.m16128b(descriptor, SavedStateCodecUtilsKt.getLongArrayDescriptor())) {
            AbstractC9133u.m16131e(t10, "null cannot be cast to non-null type kotlin.LongArray");
            encodeLongArray((long[]) t10);
            return true;
        }
        if (!AbstractC9133u.m16128b(descriptor, SavedStateCodecUtilsKt.getStringArrayDescriptor())) {
            return false;
        }
        AbstractC9133u.m16131e(t10, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
        encodeStringArray((String[]) t10);
        return true;
    }

    private final void encodeIntArray(int[] iArr) {
        SavedStateWriter.m27333putIntArrayimpl(SavedStateWriter.m27315constructorimpl(this.savedState), this.key, iArr);
    }

    private final void encodeIntList(List<Integer> list) {
        SavedStateWriter.m27334putIntListimpl(SavedStateWriter.m27315constructorimpl(this.savedState), this.key, list);
    }

    private final void encodeLongArray(long[] jArr) {
        SavedStateWriter.m27337putLongArrayimpl(SavedStateWriter.m27315constructorimpl(this.savedState), this.key, jArr);
    }

    private final void encodeStringArray(String[] strArr) {
        SavedStateWriter.m27349putStringArrayimpl(SavedStateWriter.m27315constructorimpl(this.savedState), this.key, strArr);
    }

    private final void encodeStringList(List<String> list) {
        SavedStateWriter.m27350putStringListimpl(SavedStateWriter.m27315constructorimpl(this.savedState), this.key, list);
    }

    private final void putClassDiscriminatorIfRequired(SavedStateConfiguration savedStateConfiguration, InterfaceC10210f interfaceC10210f, Bundle bundle) {
        if (savedStateConfiguration.getClassDiscriminatorMode() == 1 && !SavedStateReader.m27230containsimpl(SavedStateReader.m27229constructorimpl(bundle), "type")) {
            if (AbstractC9133u.m16128b(interfaceC10210f.getKind(), AbstractC10219o.a.f20393a) || AbstractC9133u.m16128b(interfaceC10210f.getKind(), AbstractC10219o.d.f20396a)) {
                SavedStateWriter.m27348putStringimpl(SavedStateWriter.m27315constructorimpl(bundle), "type", interfaceC10210f.mo19089f());
            }
        }
    }

    @Override // p279v8.AbstractC10253b, p279v8.InterfaceC10257f
    public InterfaceC10255d beginStructure(InterfaceC10210f descriptor) {
        Pair[] pairArr;
        AbstractC9133u.m16133g(descriptor, "descriptor");
        if (AbstractC9133u.m16128b(this.key, "")) {
            putClassDiscriminatorIfRequired(this.configuration, descriptor, this.savedState);
            return this;
        }
        Map mapM15943h = AbstractC9080a.m15943h();
        if (mapM15943h.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapM15943h.size());
            for (Map.Entry entry : mapM15943h.entrySet()) {
                arrayList.add(AbstractC8726f.m14230a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m27315constructorimpl(bundleBundleOf);
        SavedStateWriter.m27342putSavedStateimpl(SavedStateWriter.m27315constructorimpl(this.savedState), this.key, bundleBundleOf);
        putClassDiscriminatorIfRequired(this.configuration, descriptor, bundleBundleOf);
        return new SavedStateEncoder(bundleBundleOf, this.configuration);
    }

    @Override // p279v8.AbstractC10253b, p279v8.InterfaceC10257f
    public void encodeBoolean(boolean z10) {
        SavedStateWriter.m27321putBooleanimpl(SavedStateWriter.m27315constructorimpl(this.savedState), this.key, z10);
    }

    @Override // p279v8.AbstractC10253b, p279v8.InterfaceC10257f
    public void encodeByte(byte b10) {
        SavedStateWriter.m27332putIntimpl(SavedStateWriter.m27315constructorimpl(this.savedState), this.key, b10);
    }

    @Override // p279v8.AbstractC10253b, p279v8.InterfaceC10257f
    public void encodeChar(char c10) {
        SavedStateWriter.m27323putCharimpl(SavedStateWriter.m27315constructorimpl(this.savedState), this.key, c10);
    }

    @Override // p279v8.AbstractC10253b, p279v8.InterfaceC10257f
    public void encodeDouble(double d10) {
        SavedStateWriter.m27328putDoubleimpl(SavedStateWriter.m27315constructorimpl(this.savedState), this.key, d10);
    }

    @Override // p279v8.AbstractC10253b
    public boolean encodeElement(InterfaceC10210f descriptor, int i10) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
        String strMo19087d = descriptor.mo19087d(i10);
        this.key = strMo19087d;
        checkDiscriminatorCollisions(this.savedState, strMo19087d);
        return true;
    }

    @Override // p279v8.AbstractC10253b, p279v8.InterfaceC10257f
    public void encodeEnum(InterfaceC10210f enumDescriptor, int i10) {
        AbstractC9133u.m16133g(enumDescriptor, "enumDescriptor");
        SavedStateWriter.m27332putIntimpl(SavedStateWriter.m27315constructorimpl(this.savedState), this.key, i10);
    }

    @Override // p279v8.AbstractC10253b, p279v8.InterfaceC10257f
    public void encodeFloat(float f10) {
        SavedStateWriter.m27330putFloatimpl(SavedStateWriter.m27315constructorimpl(this.savedState), this.key, f10);
    }

    @Override // p279v8.AbstractC10253b, p279v8.InterfaceC10257f
    public void encodeInt(int i10) {
        SavedStateWriter.m27332putIntimpl(SavedStateWriter.m27315constructorimpl(this.savedState), this.key, i10);
    }

    @Override // p279v8.AbstractC10253b, p279v8.InterfaceC10257f
    public void encodeLong(long j10) {
        SavedStateWriter.m27336putLongimpl(SavedStateWriter.m27315constructorimpl(this.savedState), this.key, j10);
    }

    @Override // p279v8.InterfaceC10257f
    public void encodeNull() {
        SavedStateWriter.m27338putNullimpl(SavedStateWriter.m27315constructorimpl(this.savedState), this.key);
    }

    @Override // p279v8.AbstractC10253b, p279v8.InterfaceC10257f
    public <T> void encodeSerializableValue(InterfaceC10059i serializer, T t10) {
        AbstractC9133u.m16133g(serializer, "serializer");
        if (encodeFormatSpecificTypes(serializer, t10)) {
            return;
        }
        super.encodeSerializableValue(serializer, t10);
    }

    @Override // p279v8.AbstractC10253b, p279v8.InterfaceC10257f
    public void encodeShort(short s10) {
        SavedStateWriter.m27332putIntimpl(SavedStateWriter.m27315constructorimpl(this.savedState), this.key, s10);
    }

    @Override // p279v8.AbstractC10253b, p279v8.InterfaceC10257f
    public void encodeString(String value) {
        AbstractC9133u.m16133g(value, "value");
        SavedStateWriter.m27348putStringimpl(SavedStateWriter.m27315constructorimpl(this.savedState), this.key, value);
    }

    public final String getKey$savedstate_release() {
        return this.key;
    }

    public final Bundle getSavedState$savedstate_release() {
        return this.savedState;
    }

    @Override // p279v8.InterfaceC10257f
    public AbstractC10583a getSerializersModule() {
        return this.serializersModule;
    }

    @Override // p279v8.AbstractC10253b
    public boolean shouldEncodeElementDefault(InterfaceC10210f descriptor, int i10) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
        return this.configuration.getEncodeDefaults();
    }
}
