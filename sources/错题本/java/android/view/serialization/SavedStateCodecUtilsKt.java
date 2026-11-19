package android.view.serialization;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5832m;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p101k7.InterfaceC5765g;
import p118m7.C6117a0;
import p118m7.C6124c;
import p118m7.C6133f;
import p118m7.C6143i0;
import p118m7.C6146j0;
import p118m7.C6156m1;
import p118m7.C6158n0;
import p118m7.C6160o;
import p118m7.C6175t;

@Metadata(m5109d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0017\"\u001a\u0010\u0001\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004\"\u001a\u0010\u0007\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\u0004\"\u001a\u0010\t\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0004\"\u001a\u0010\u000b\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\u0004\"\u001a\u0010\r\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0004\"\u001a\u0010\u000f\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0004\"\u001a\u0010\u0011\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\u0004\" \u0010\u0013\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0002\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0017"}, m5110d2 = {"Lk7/g;", "intListDescriptor", "Lk7/g;", "getIntListDescriptor", "()Lk7/g;", "stringListDescriptor", "getStringListDescriptor", "booleanArrayDescriptor", "getBooleanArrayDescriptor", "charArrayDescriptor", "getCharArrayDescriptor", "doubleArrayDescriptor", "getDoubleArrayDescriptor", "floatArrayDescriptor", "getFloatArrayDescriptor", "intArrayDescriptor", "getIntArrayDescriptor", "longArrayDescriptor", "getLongArrayDescriptor", "stringArrayDescriptor", "getStringArrayDescriptor", "getStringArrayDescriptor$annotations", "()V", "savedstate_release"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSavedStateCodecUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateCodecUtils.kt\nandroidx/savedstate/serialization/SavedStateCodecUtilsKt\n+ 2 BuiltinSerializers.kt\nkotlinx/serialization/builtins/BuiltinSerializersKt\n*L\n1#1,41:1\n194#2:42\n*S KotlinDebug\n*F\n+ 1 SavedStateCodecUtils.kt\nandroidx/savedstate/serialization/SavedStateCodecUtilsKt\n*L\n40#1:42\n*E\n"})
/* loaded from: classes2.dex */
public final class SavedStateCodecUtilsKt {

    @NotNull
    private static final InterfaceC5765g booleanArrayDescriptor;

    @NotNull
    private static final InterfaceC5765g charArrayDescriptor;

    @NotNull
    private static final InterfaceC5765g doubleArrayDescriptor;

    @NotNull
    private static final InterfaceC5765g floatArrayDescriptor;

    @NotNull
    private static final InterfaceC5765g intArrayDescriptor;

    @NotNull
    private static final InterfaceC5765g intListDescriptor = (C6124c) AbstractC5806u.m5264c(C6146j0.f9816a).f9784c;

    @NotNull
    private static final InterfaceC5765g longArrayDescriptor;

    @NotNull
    private static final InterfaceC5765g stringArrayDescriptor;

    @NotNull
    private static final InterfaceC5765g stringListDescriptor;

    static {
        C6156m1 c6156m1 = C6156m1.f9829a;
        stringListDescriptor = (C6124c) AbstractC5806u.m5264c(c6156m1).f9784c;
        booleanArrayDescriptor = C6133f.f9797c.f9788b;
        charArrayDescriptor = C6160o.f9838c.f9788b;
        doubleArrayDescriptor = C6175t.f9864c.f9788b;
        floatArrayDescriptor = C6117a0.f9763c.f9788b;
        intArrayDescriptor = C6143i0.f9813c.f9788b;
        longArrayDescriptor = C6158n0.f9833c.f9788b;
        stringArrayDescriptor = AbstractC5806u.m5262a(AbstractC5832m.m5340a(String.class), c6156m1).f9804c;
    }

    @NotNull
    public static final InterfaceC5765g getBooleanArrayDescriptor() {
        return booleanArrayDescriptor;
    }

    @NotNull
    public static final InterfaceC5765g getCharArrayDescriptor() {
        return charArrayDescriptor;
    }

    @NotNull
    public static final InterfaceC5765g getDoubleArrayDescriptor() {
        return doubleArrayDescriptor;
    }

    @NotNull
    public static final InterfaceC5765g getFloatArrayDescriptor() {
        return floatArrayDescriptor;
    }

    @NotNull
    public static final InterfaceC5765g getIntArrayDescriptor() {
        return intArrayDescriptor;
    }

    @NotNull
    public static final InterfaceC5765g getIntListDescriptor() {
        return intListDescriptor;
    }

    @NotNull
    public static final InterfaceC5765g getLongArrayDescriptor() {
        return longArrayDescriptor;
    }

    @NotNull
    public static final InterfaceC5765g getStringArrayDescriptor() {
        return stringArrayDescriptor;
    }

    public static /* synthetic */ void getStringArrayDescriptor$annotations() {
    }

    @NotNull
    public static final InterfaceC5765g getStringListDescriptor() {
        return stringListDescriptor;
    }
}
