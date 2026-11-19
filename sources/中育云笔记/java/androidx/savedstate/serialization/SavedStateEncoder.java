package androidx.savedstate.serialization;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import ee.AbstractC9138o;
import ee.InterfaceC9129f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5439i;
import p153fe.AbstractC9225b;
import p153fe.InterfaceC9227d;
import p182he.AbstractC9553a;
import p309qc.AbstractC10776g;

/* loaded from: classes3.dex */
public final class SavedStateEncoder extends AbstractC9225b {
    private final SavedStateConfiguration configuration;
    private String key;
    private final Bundle savedState;
    private final AbstractC9553a serializersModule;

    public SavedStateEncoder(Bundle savedState, SavedStateConfiguration configuration) {
        AbstractC9979u.m20294g(savedState, "savedState");
        AbstractC9979u.m20294g(configuration, "configuration");
        this.savedState = savedState;
        this.configuration = configuration;
        this.key = "";
        this.serializersModule = configuration.getSerializersModule();
    }

    private final void checkDiscriminatorCollisions(Bundle bundle, String str) {
        if (this.configuration.getClassDiscriminatorMode() == 1) {
            boolean zM33825containsimpl = SavedStateReader.m33825containsimpl(SavedStateReader.m33824constructorimpl(bundle), "type");
            boolean zM20289b = AbstractC9979u.m20289b(str, "type");
            if (zM33825containsimpl && zM20289b) {
                throw new IllegalArgumentException("SavedStateEncoder for " + SavedStateReader.m33895getStringimpl(SavedStateReader.m33824constructorimpl(bundle), "type") + " has property '" + str + "' that conflicts with the class discriminator. You can rename a property with @SerialName annotation.");
            }
        }
    }

    private final void encodeBooleanArray(boolean[] zArr) {
        SavedStateWriter.m33917putBooleanArrayimpl(SavedStateWriter.m33910constructorimpl(this.savedState), this.key, zArr);
    }

    private final void encodeCharArray(char[] cArr) {
        SavedStateWriter.m33919putCharArrayimpl(SavedStateWriter.m33910constructorimpl(this.savedState), this.key, cArr);
    }

    private final void encodeDoubleArray(double[] dArr) {
        SavedStateWriter.m33924putDoubleArrayimpl(SavedStateWriter.m33910constructorimpl(this.savedState), this.key, dArr);
    }

    private final void encodeFloatArray(float[] fArr) {
        SavedStateWriter.m33926putFloatArrayimpl(SavedStateWriter.m33910constructorimpl(this.savedState), this.key, fArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> boolean encodeFormatSpecificTypes(InterfaceC5439i interfaceC5439i, T t10) {
        if (SavedStateEncoder_androidKt.encodeFormatSpecificTypesOnPlatform(this, interfaceC5439i, t10)) {
            return true;
        }
        InterfaceC9129f descriptor = interfaceC5439i.getDescriptor();
        if (AbstractC9979u.m20289b(descriptor, SavedStateCodecUtilsKt.getIntListDescriptor())) {
            AbstractC9979u.m20292e(t10, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Int>");
            encodeIntList((List) t10);
            return true;
        }
        if (AbstractC9979u.m20289b(descriptor, SavedStateCodecUtilsKt.getStringListDescriptor())) {
            AbstractC9979u.m20292e(t10, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            encodeStringList((List) t10);
            return true;
        }
        if (AbstractC9979u.m20289b(descriptor, SavedStateCodecUtilsKt.getBooleanArrayDescriptor())) {
            AbstractC9979u.m20292e(t10, "null cannot be cast to non-null type kotlin.BooleanArray");
            encodeBooleanArray((boolean[]) t10);
            return true;
        }
        if (AbstractC9979u.m20289b(descriptor, SavedStateCodecUtilsKt.getCharArrayDescriptor())) {
            AbstractC9979u.m20292e(t10, "null cannot be cast to non-null type kotlin.CharArray");
            encodeCharArray((char[]) t10);
            return true;
        }
        if (AbstractC9979u.m20289b(descriptor, SavedStateCodecUtilsKt.getDoubleArrayDescriptor())) {
            AbstractC9979u.m20292e(t10, "null cannot be cast to non-null type kotlin.DoubleArray");
            encodeDoubleArray((double[]) t10);
            return true;
        }
        if (AbstractC9979u.m20289b(descriptor, SavedStateCodecUtilsKt.getFloatArrayDescriptor())) {
            AbstractC9979u.m20292e(t10, "null cannot be cast to non-null type kotlin.FloatArray");
            encodeFloatArray((float[]) t10);
            return true;
        }
        if (AbstractC9979u.m20289b(descriptor, SavedStateCodecUtilsKt.getIntArrayDescriptor())) {
            AbstractC9979u.m20292e(t10, "null cannot be cast to non-null type kotlin.IntArray");
            encodeIntArray((int[]) t10);
            return true;
        }
        if (AbstractC9979u.m20289b(descriptor, SavedStateCodecUtilsKt.getLongArrayDescriptor())) {
            AbstractC9979u.m20292e(t10, "null cannot be cast to non-null type kotlin.LongArray");
            encodeLongArray((long[]) t10);
            return true;
        }
        if (!AbstractC9979u.m20289b(descriptor, SavedStateCodecUtilsKt.getStringArrayDescriptor())) {
            return false;
        }
        AbstractC9979u.m20292e(t10, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
        encodeStringArray((String[]) t10);
        return true;
    }

    private final void encodeIntArray(int[] iArr) {
        SavedStateWriter.m33928putIntArrayimpl(SavedStateWriter.m33910constructorimpl(this.savedState), this.key, iArr);
    }

    private final void encodeIntList(List<Integer> list) {
        SavedStateWriter.m33929putIntListimpl(SavedStateWriter.m33910constructorimpl(this.savedState), this.key, list);
    }

    private final void encodeLongArray(long[] jArr) {
        SavedStateWriter.m33932putLongArrayimpl(SavedStateWriter.m33910constructorimpl(this.savedState), this.key, jArr);
    }

    private final void encodeStringArray(String[] strArr) {
        SavedStateWriter.m33944putStringArrayimpl(SavedStateWriter.m33910constructorimpl(this.savedState), this.key, strArr);
    }

    private final void encodeStringList(List<String> list) {
        SavedStateWriter.m33945putStringListimpl(SavedStateWriter.m33910constructorimpl(this.savedState), this.key, list);
    }

    private final void putClassDiscriminatorIfRequired(SavedStateConfiguration savedStateConfiguration, InterfaceC9129f interfaceC9129f, Bundle bundle) {
        if (savedStateConfiguration.getClassDiscriminatorMode() == 1 && !SavedStateReader.m33825containsimpl(SavedStateReader.m33824constructorimpl(bundle), "type")) {
            if (AbstractC9979u.m20289b(interfaceC9129f.getKind(), AbstractC9138o.a.f21332a) || AbstractC9979u.m20289b(interfaceC9129f.getKind(), AbstractC9138o.d.f21335a)) {
                SavedStateWriter.m33943putStringimpl(SavedStateWriter.m33910constructorimpl(bundle), "type", interfaceC9129f.mo17961f());
            }
        }
    }

    @Override // p153fe.AbstractC9225b, p153fe.InterfaceC9229f
    public InterfaceC9227d beginStructure(InterfaceC9129f descriptor) {
        Pair[] pairArr;
        AbstractC9979u.m20294g(descriptor, "descriptor");
        if (AbstractC9979u.m20289b(this.key, "")) {
            putClassDiscriminatorIfRequired(this.configuration, descriptor, this.savedState);
            return this;
        }
        Map mapM20088h = AbstractC9925a.m20088h();
        if (mapM20088h.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapM20088h.size());
            for (Map.Entry entry : mapM20088h.entrySet()) {
                arrayList.add(AbstractC10776g.m22975a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m33910constructorimpl(bundleBundleOf);
        SavedStateWriter.m33937putSavedStateimpl(SavedStateWriter.m33910constructorimpl(this.savedState), this.key, bundleBundleOf);
        putClassDiscriminatorIfRequired(this.configuration, descriptor, bundleBundleOf);
        return new SavedStateEncoder(bundleBundleOf, this.configuration);
    }

    @Override // p153fe.AbstractC9225b, p153fe.InterfaceC9229f
    public void encodeBoolean(boolean z10) {
        SavedStateWriter.m33916putBooleanimpl(SavedStateWriter.m33910constructorimpl(this.savedState), this.key, z10);
    }

    @Override // p153fe.AbstractC9225b, p153fe.InterfaceC9229f
    public void encodeByte(byte b10) {
        SavedStateWriter.m33927putIntimpl(SavedStateWriter.m33910constructorimpl(this.savedState), this.key, b10);
    }

    @Override // p153fe.AbstractC9225b, p153fe.InterfaceC9229f
    public void encodeChar(char c10) {
        SavedStateWriter.m33918putCharimpl(SavedStateWriter.m33910constructorimpl(this.savedState), this.key, c10);
    }

    @Override // p153fe.AbstractC9225b, p153fe.InterfaceC9229f
    public void encodeDouble(double d10) {
        SavedStateWriter.m33923putDoubleimpl(SavedStateWriter.m33910constructorimpl(this.savedState), this.key, d10);
    }

    @Override // p153fe.AbstractC9225b
    public boolean encodeElement(InterfaceC9129f descriptor, int i10) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
        String strMo17959d = descriptor.mo17959d(i10);
        this.key = strMo17959d;
        checkDiscriminatorCollisions(this.savedState, strMo17959d);
        return true;
    }

    @Override // p153fe.AbstractC9225b, p153fe.InterfaceC9229f
    public void encodeEnum(InterfaceC9129f enumDescriptor, int i10) {
        AbstractC9979u.m20294g(enumDescriptor, "enumDescriptor");
        SavedStateWriter.m33927putIntimpl(SavedStateWriter.m33910constructorimpl(this.savedState), this.key, i10);
    }

    @Override // p153fe.AbstractC9225b, p153fe.InterfaceC9229f
    public void encodeFloat(float f10) {
        SavedStateWriter.m33925putFloatimpl(SavedStateWriter.m33910constructorimpl(this.savedState), this.key, f10);
    }

    @Override // p153fe.AbstractC9225b, p153fe.InterfaceC9229f
    public void encodeInt(int i10) {
        SavedStateWriter.m33927putIntimpl(SavedStateWriter.m33910constructorimpl(this.savedState), this.key, i10);
    }

    @Override // p153fe.AbstractC9225b, p153fe.InterfaceC9229f
    public void encodeLong(long j10) {
        SavedStateWriter.m33931putLongimpl(SavedStateWriter.m33910constructorimpl(this.savedState), this.key, j10);
    }

    @Override // p153fe.InterfaceC9229f
    public void encodeNull() {
        SavedStateWriter.m33933putNullimpl(SavedStateWriter.m33910constructorimpl(this.savedState), this.key);
    }

    @Override // p153fe.AbstractC9225b, p153fe.InterfaceC9229f
    public <T> void encodeSerializableValue(InterfaceC5439i serializer, T t10) {
        AbstractC9979u.m20294g(serializer, "serializer");
        if (encodeFormatSpecificTypes(serializer, t10)) {
            return;
        }
        super.encodeSerializableValue(serializer, t10);
    }

    @Override // p153fe.AbstractC9225b, p153fe.InterfaceC9229f
    public void encodeShort(short s10) {
        SavedStateWriter.m33927putIntimpl(SavedStateWriter.m33910constructorimpl(this.savedState), this.key, s10);
    }

    @Override // p153fe.AbstractC9225b, p153fe.InterfaceC9229f
    public void encodeString(String value) {
        AbstractC9979u.m20294g(value, "value");
        SavedStateWriter.m33943putStringimpl(SavedStateWriter.m33910constructorimpl(this.savedState), this.key, value);
    }

    public final String getKey$savedstate_release() {
        return this.key;
    }

    public final Bundle getSavedState$savedstate_release() {
        return this.savedState;
    }

    @Override // p153fe.InterfaceC9229f
    public AbstractC9553a getSerializersModule() {
        return this.serializersModule;
    }

    @Override // p153fe.AbstractC9225b
    public boolean shouldEncodeElementDefault(InterfaceC9129f descriptor, int i10) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
        return this.configuration.getEncodeDefaults();
    }
}
