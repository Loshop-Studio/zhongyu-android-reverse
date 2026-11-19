package android.view.serialization;

import android.os.IBinder;
import android.os.Parcelable;
import android.view.serialization.serializers.CharSequenceSerializer;
import android.view.serialization.serializers.DefaultParcelableSerializer;
import android.view.serialization.serializers.SparseArraySerializer;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5832m;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p084i7.C5687c;
import p101k7.InterfaceC5765g;
import p118m7.C6124c;

@Metadata(m5109d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b&\"\u001a\u0010\u0001\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004\"\u001a\u0010\u0007\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\u0004\"\u001a\u0010\t\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0004\" \u0010\u000b\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0002\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\f\u0010\u0004\" \u0010\u000f\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0002\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0010\u0010\u0004\"\u001a\u0010\u0012\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0004\"\u001a\u0010\u0014\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0002\u001a\u0004\b\u0015\u0010\u0004\" \u0010\u0016\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0002\u0012\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0017\u0010\u0004\" \u0010\u0019\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0002\u0012\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001a\u0010\u0004\"\u001a\u0010\u001c\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0002\u001a\u0004\b\u001d\u0010\u0004\"\u001a\u0010\u001e\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0002\u001a\u0004\b\u001f\u0010\u0004\"\u001a\u0010 \u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\u0002\u001a\u0004\b!\u0010\u0004\"\u001a\u0010\"\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010\u0002\u001a\u0004\b#\u0010\u0004\"\u001a\u0010$\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010\u0002\u001a\u0004\b%\u0010\u0004¨\u0006&"}, m5110d2 = {"Lk7/g;", "polymorphicCharSequenceDescriptor", "Lk7/g;", "getPolymorphicCharSequenceDescriptor", "()Lk7/g;", "polymorphicParcelableDescriptor", "getPolymorphicParcelableDescriptor", "polymorphicJavaSerializableDescriptor", "getPolymorphicJavaSerializableDescriptor", "polymorphicIBinderDescriptor", "getPolymorphicIBinderDescriptor", "parcelableArrayDescriptor", "getParcelableArrayDescriptor", "getParcelableArrayDescriptor$annotations", "()V", "polymorphicParcelableArrayDescriptor", "getPolymorphicParcelableArrayDescriptor", "getPolymorphicParcelableArrayDescriptor$annotations", "parcelableListDescriptor", "getParcelableListDescriptor", "polymorphicParcelableListDescriptor", "getPolymorphicParcelableListDescriptor", "charSequenceArrayDescriptor", "getCharSequenceArrayDescriptor", "getCharSequenceArrayDescriptor$annotations", "polymorphicCharSequenceArrayDescriptor", "getPolymorphicCharSequenceArrayDescriptor", "getPolymorphicCharSequenceArrayDescriptor$annotations", "charSequenceListDescriptor", "getCharSequenceListDescriptor", "polymorphicCharSequenceListDescriptor", "getPolymorphicCharSequenceListDescriptor", "sparseParcelableArrayDescriptor", "getSparseParcelableArrayDescriptor", "polymorphicSparseParcelableArrayDescriptor", "getPolymorphicSparseParcelableArrayDescriptor", "nullablePolymorphicSparseParcelableArrayDescriptor", "getNullablePolymorphicSparseParcelableArrayDescriptor", "savedstate_release"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSavedStateCodecUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateCodecUtils.android.kt\nandroidx/savedstate/serialization/SavedStateCodecUtils_androidKt\n+ 2 BuiltinSerializers.kt\nkotlinx/serialization/builtins/BuiltinSerializersKt\n*L\n1#1,67:1\n194#2:68\n194#2:69\n194#2:70\n194#2:71\n*S KotlinDebug\n*F\n+ 1 SavedStateCodecUtils.android.kt\nandroidx/savedstate/serialization/SavedStateCodecUtils_androidKt\n*L\n42#1:68\n45#1:69\n52#1:70\n55#1:71\n*E\n"})
/* loaded from: classes2.dex */
public final class SavedStateCodecUtils_androidKt {

    @NotNull
    private static final InterfaceC5765g charSequenceArrayDescriptor;

    @NotNull
    private static final InterfaceC5765g charSequenceListDescriptor;

    @NotNull
    private static final InterfaceC5765g nullablePolymorphicSparseParcelableArrayDescriptor;

    @NotNull
    private static final InterfaceC5765g parcelableArrayDescriptor;

    @NotNull
    private static final InterfaceC5765g parcelableListDescriptor;

    @NotNull
    private static final InterfaceC5765g polymorphicCharSequenceArrayDescriptor;

    @NotNull
    private static final InterfaceC5765g polymorphicCharSequenceListDescriptor;

    @NotNull
    private static final InterfaceC5765g polymorphicParcelableArrayDescriptor;

    @NotNull
    private static final InterfaceC5765g polymorphicParcelableListDescriptor;

    @NotNull
    private static final InterfaceC5765g polymorphicSparseParcelableArrayDescriptor;

    @NotNull
    private static final InterfaceC5765g sparseParcelableArrayDescriptor;

    @NotNull
    private static final InterfaceC5765g polymorphicCharSequenceDescriptor = new C5687c(AbstractC5832m.m5340a(CharSequence.class)).getDescriptor();

    @NotNull
    private static final InterfaceC5765g polymorphicParcelableDescriptor = new C5687c(AbstractC5832m.m5340a(Parcelable.class)).getDescriptor();

    @NotNull
    private static final InterfaceC5765g polymorphicJavaSerializableDescriptor = new C5687c(AbstractC5832m.m5340a(Serializable.class)).getDescriptor();

    @NotNull
    private static final InterfaceC5765g polymorphicIBinderDescriptor = new C5687c(AbstractC5832m.m5340a(IBinder.class)).getDescriptor();

    static {
        DefaultParcelableSerializer defaultParcelableSerializer = DefaultParcelableSerializer.INSTANCE;
        parcelableArrayDescriptor = AbstractC5806u.m5262a(AbstractC5832m.m5340a(Parcelable.class), defaultParcelableSerializer).f9804c;
        polymorphicParcelableArrayDescriptor = AbstractC5806u.m5262a(AbstractC5832m.m5340a(Parcelable.class), new C5687c(AbstractC5832m.m5340a(Parcelable.class))).f9804c;
        parcelableListDescriptor = (C6124c) AbstractC5806u.m5264c(defaultParcelableSerializer).f9784c;
        polymorphicParcelableListDescriptor = (C6124c) AbstractC5806u.m5264c(new C5687c(AbstractC5832m.m5340a(Parcelable.class))).f9784c;
        CharSequenceSerializer charSequenceSerializer = CharSequenceSerializer.INSTANCE;
        charSequenceArrayDescriptor = AbstractC5806u.m5262a(AbstractC5832m.m5340a(CharSequence.class), charSequenceSerializer).f9804c;
        polymorphicCharSequenceArrayDescriptor = AbstractC5806u.m5262a(AbstractC5832m.m5340a(CharSequence.class), new C5687c(AbstractC5832m.m5340a(CharSequence.class))).f9804c;
        charSequenceListDescriptor = (C6124c) AbstractC5806u.m5264c(charSequenceSerializer).f9784c;
        polymorphicCharSequenceListDescriptor = (C6124c) AbstractC5806u.m5264c(new C5687c(AbstractC5832m.m5340a(CharSequence.class))).f9784c;
        sparseParcelableArrayDescriptor = new SparseArraySerializer(defaultParcelableSerializer).getDescriptor();
        polymorphicSparseParcelableArrayDescriptor = new SparseArraySerializer(new C5687c(AbstractC5832m.m5340a(Parcelable.class))).getDescriptor();
        nullablePolymorphicSparseParcelableArrayDescriptor = new SparseArraySerializer(AbstractC5806u.m5283v(new C5687c(AbstractC5832m.m5340a(Parcelable.class)))).getDescriptor();
    }

    @NotNull
    public static final InterfaceC5765g getCharSequenceArrayDescriptor() {
        return charSequenceArrayDescriptor;
    }

    public static /* synthetic */ void getCharSequenceArrayDescriptor$annotations() {
    }

    @NotNull
    public static final InterfaceC5765g getCharSequenceListDescriptor() {
        return charSequenceListDescriptor;
    }

    @NotNull
    public static final InterfaceC5765g getNullablePolymorphicSparseParcelableArrayDescriptor() {
        return nullablePolymorphicSparseParcelableArrayDescriptor;
    }

    @NotNull
    public static final InterfaceC5765g getParcelableArrayDescriptor() {
        return parcelableArrayDescriptor;
    }

    public static /* synthetic */ void getParcelableArrayDescriptor$annotations() {
    }

    @NotNull
    public static final InterfaceC5765g getParcelableListDescriptor() {
        return parcelableListDescriptor;
    }

    @NotNull
    public static final InterfaceC5765g getPolymorphicCharSequenceArrayDescriptor() {
        return polymorphicCharSequenceArrayDescriptor;
    }

    public static /* synthetic */ void getPolymorphicCharSequenceArrayDescriptor$annotations() {
    }

    @NotNull
    public static final InterfaceC5765g getPolymorphicCharSequenceDescriptor() {
        return polymorphicCharSequenceDescriptor;
    }

    @NotNull
    public static final InterfaceC5765g getPolymorphicCharSequenceListDescriptor() {
        return polymorphicCharSequenceListDescriptor;
    }

    @NotNull
    public static final InterfaceC5765g getPolymorphicIBinderDescriptor() {
        return polymorphicIBinderDescriptor;
    }

    @NotNull
    public static final InterfaceC5765g getPolymorphicJavaSerializableDescriptor() {
        return polymorphicJavaSerializableDescriptor;
    }

    @NotNull
    public static final InterfaceC5765g getPolymorphicParcelableArrayDescriptor() {
        return polymorphicParcelableArrayDescriptor;
    }

    public static /* synthetic */ void getPolymorphicParcelableArrayDescriptor$annotations() {
    }

    @NotNull
    public static final InterfaceC5765g getPolymorphicParcelableDescriptor() {
        return polymorphicParcelableDescriptor;
    }

    @NotNull
    public static final InterfaceC5765g getPolymorphicParcelableListDescriptor() {
        return polymorphicParcelableListDescriptor;
    }

    @NotNull
    public static final InterfaceC5765g getPolymorphicSparseParcelableArrayDescriptor() {
        return polymorphicSparseParcelableArrayDescriptor;
    }

    @NotNull
    public static final InterfaceC5765g getSparseParcelableArrayDescriptor() {
        return sparseParcelableArrayDescriptor;
    }
}
