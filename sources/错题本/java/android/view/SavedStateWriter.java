package android.view;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087@\u0018\u00002\u00020\u0001B\u0015\b\u0001\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\"\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u001d\u0010&\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020#¢\u0006\u0004\b$\u0010%J\u001d\u0010*\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u0015\u0010-\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b+\u0010,J'\u00102\u001a\u00020\u000b\"\b\b\u0000\u0010/*\u00020.2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b0\u00101J'\u00106\u001a\u00020\u000b\"\b\b\u0000\u0010/*\u0002032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b4\u00105J\u001d\u0010:\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u000207¢\u0006\u0004\b8\u00109J\u001d\u0010>\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020;¢\u0006\u0004\b<\u0010=J\u001d\u0010A\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b?\u0010@J#\u0010E\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020#0B¢\u0006\u0004\bC\u0010DJ#\u0010G\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00170B¢\u0006\u0004\bF\u0010DJ'\u0010I\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0010\u0010\n\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030B¢\u0006\u0004\bH\u0010DJ#\u0010K\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070B¢\u0006\u0004\bJ\u0010DJ-\u0010M\u001a\u00020\u000b\"\b\b\u0000\u0010/*\u00020.2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000B¢\u0006\u0004\bL\u0010DJ\u001d\u0010Q\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020N¢\u0006\u0004\bO\u0010PJ\u001d\u0010U\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020R¢\u0006\u0004\bS\u0010TJ#\u0010Y\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00170V¢\u0006\u0004\bW\u0010XJ\u001d\u0010]\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020Z¢\u0006\u0004\b[\u0010\\J\u001d\u0010a\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020^¢\u0006\u0004\b_\u0010`J\u001d\u0010e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020b¢\u0006\u0004\bc\u0010dJ\u001d\u0010i\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020f¢\u0006\u0004\bg\u0010hJ'\u0010l\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0010\u0010\n\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030V¢\u0006\u0004\bj\u0010kJ#\u0010o\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070V¢\u0006\u0004\bm\u0010nJ-\u0010r\u001a\u00020\u000b\"\b\b\u0000\u0010/*\u00020.2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000V¢\u0006\u0004\bp\u0010qJ-\u0010v\u001a\u00020\u000b\"\b\b\u0000\u0010/*\u00020.2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000s¢\u0006\u0004\bt\u0010uJ!\u0010y\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\bw\u0010xJ\u0019\u0010}\u001a\u00020\u000b2\n\u0010z\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b{\u0010|J\u0015\u0010\u007f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b~\u0010,J\u0010\u0010\u0082\u0001\u001a\u00020\u000b¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0013\u0010\u0085\u0001\u001a\u00020\u0007HÖ\u0001¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u0013\u0010\u0088\u0001\u001a\u00020#HÖ\u0001¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001e\u0010\u008c\u0001\u001a\u00020\u000f2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0019\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0004\u0010\u008d\u0001\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003¨\u0006\u008e\u0001"}, m5110d2 = {"Landroidx/savedstate/SavedStateWriter;", "", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "source", "constructor-impl", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "", "key", "Landroid/os/IBinder;", "value", "Ld6/s;", "putBinder-impl", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/IBinder;)V", "putBinder", "", "putBoolean-impl", "(Landroid/os/Bundle;Ljava/lang/String;Z)V", "putBoolean", "", "putChar-impl", "(Landroid/os/Bundle;Ljava/lang/String;C)V", "putChar", "", "putCharSequence-impl", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/CharSequence;)V", "putCharSequence", "", "putDouble-impl", "(Landroid/os/Bundle;Ljava/lang/String;D)V", "putDouble", "", "putFloat-impl", "(Landroid/os/Bundle;Ljava/lang/String;F)V", "putFloat", "", "putInt-impl", "(Landroid/os/Bundle;Ljava/lang/String;I)V", "putInt", "", "putLong-impl", "(Landroid/os/Bundle;Ljava/lang/String;J)V", "putLong", "putNull-impl", "(Landroid/os/Bundle;Ljava/lang/String;)V", "putNull", "Landroid/os/Parcelable;", ExifInterface.GPS_DIRECTION_TRUE, "putParcelable-impl", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Parcelable;)V", "putParcelable", "Ljava/io/Serializable;", "putJavaSerializable-impl", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/io/Serializable;)V", "putJavaSerializable", "Landroid/util/Size;", "putSize-impl", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/util/Size;)V", "putSize", "Landroid/util/SizeF;", "putSizeF-impl", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/util/SizeF;)V", "putSizeF", "putString-impl", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V", "putString", "", "putIntList-impl", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V", "putIntList", "putCharSequenceList-impl", "putCharSequenceList", "putSavedStateList-impl", "putSavedStateList", "putStringList-impl", "putStringList", "putParcelableList-impl", "putParcelableList", "", "putBooleanArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[Z)V", "putBooleanArray", "", "putCharArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[C)V", "putCharArray", "", "putCharSequenceArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[Ljava/lang/CharSequence;)V", "putCharSequenceArray", "", "putDoubleArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[D)V", "putDoubleArray", "", "putFloatArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[F)V", "putFloatArray", "", "putIntArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[I)V", "putIntArray", "", "putLongArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[J)V", "putLongArray", "putSavedStateArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[Landroid/os/Bundle;)V", "putSavedStateArray", "putStringArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[Ljava/lang/String;)V", "putStringArray", "putParcelableArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[Landroid/os/Parcelable;)V", "putParcelableArray", "Landroid/util/SparseArray;", "putSparseParcelableArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/util/SparseArray;)V", "putSparseParcelableArray", "putSavedState-impl", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Bundle;)V", "putSavedState", TypedValues.TransitionType.S_FROM, "putAll-impl", "(Landroid/os/Bundle;Landroid/os/Bundle;)V", "putAll", "remove-impl", "remove", "clear-impl", "(Landroid/os/Bundle;)V", "clear", "toString-impl", "(Landroid/os/Bundle;)Ljava/lang/String;", "toString", "hashCode-impl", "(Landroid/os/Bundle;)I", "hashCode", "other", "equals-impl", "(Landroid/os/Bundle;Ljava/lang/Object;)Z", "equals", "Landroid/os/Bundle;", "savedstate_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
/* loaded from: classes2.dex */
public final class SavedStateWriter {

    @NotNull
    private final Bundle source;

    @PublishedApi
    private /* synthetic */ SavedStateWriter(Bundle bundle) {
        this.source = bundle;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SavedStateWriter m13681boximpl(Bundle bundle) {
        return new SavedStateWriter(bundle);
    }

    /* renamed from: clear-impl, reason: not valid java name */
    public static final void m13682clearimpl(Bundle bundle) {
        bundle.clear();
    }

    @PublishedApi
    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static Bundle m13683constructorimpl(@NotNull Bundle source) {
        AbstractC5830k.m5330g(source, "source");
        return source;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m13684equalsimpl(Bundle bundle, Object obj) {
        return (obj instanceof SavedStateWriter) && AbstractC5830k.m5325b(bundle, ((SavedStateWriter) obj).getSource());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m13685equalsimpl0(Bundle bundle, Bundle bundle2) {
        return AbstractC5830k.m5325b(bundle, bundle2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m13686hashCodeimpl(Bundle bundle) {
        return bundle.hashCode();
    }

    /* renamed from: putAll-impl, reason: not valid java name */
    public static final void m13687putAllimpl(Bundle bundle, @NotNull Bundle from) {
        AbstractC5830k.m5330g(from, "from");
        bundle.putAll(from);
    }

    /* renamed from: putBinder-impl, reason: not valid java name */
    public static final void m13688putBinderimpl(Bundle bundle, @NotNull String key, @NotNull IBinder value) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(value, "value");
        bundle.putBinder(key, value);
    }

    /* renamed from: putBoolean-impl, reason: not valid java name */
    public static final void m13689putBooleanimpl(Bundle bundle, @NotNull String key, boolean z8) {
        AbstractC5830k.m5330g(key, "key");
        bundle.putBoolean(key, z8);
    }

    /* renamed from: putBooleanArray-impl, reason: not valid java name */
    public static final void m13690putBooleanArrayimpl(Bundle bundle, @NotNull String key, @NotNull boolean[] value) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(value, "value");
        bundle.putBooleanArray(key, value);
    }

    /* renamed from: putChar-impl, reason: not valid java name */
    public static final void m13691putCharimpl(Bundle bundle, @NotNull String key, char c) {
        AbstractC5830k.m5330g(key, "key");
        bundle.putChar(key, c);
    }

    /* renamed from: putCharArray-impl, reason: not valid java name */
    public static final void m13692putCharArrayimpl(Bundle bundle, @NotNull String key, @NotNull char[] value) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(value, "value");
        bundle.putCharArray(key, value);
    }

    /* renamed from: putCharSequence-impl, reason: not valid java name */
    public static final void m13693putCharSequenceimpl(Bundle bundle, @NotNull String key, @NotNull CharSequence value) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(value, "value");
        bundle.putCharSequence(key, value);
    }

    /* renamed from: putCharSequenceArray-impl, reason: not valid java name */
    public static final void m13694putCharSequenceArrayimpl(Bundle bundle, @NotNull String key, @NotNull CharSequence[] value) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(value, "value");
        bundle.putCharSequenceArray(key, value);
    }

    /* renamed from: putCharSequenceList-impl, reason: not valid java name */
    public static final void m13695putCharSequenceListimpl(Bundle bundle, @NotNull String key, @NotNull List<? extends CharSequence> value) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(value, "value");
        bundle.putCharSequenceArrayList(key, SavedStateWriterKt.toArrayListUnsafe(value));
    }

    /* renamed from: putDouble-impl, reason: not valid java name */
    public static final void m13696putDoubleimpl(Bundle bundle, @NotNull String key, double d9) {
        AbstractC5830k.m5330g(key, "key");
        bundle.putDouble(key, d9);
    }

    /* renamed from: putDoubleArray-impl, reason: not valid java name */
    public static final void m13697putDoubleArrayimpl(Bundle bundle, @NotNull String key, @NotNull double[] value) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(value, "value");
        bundle.putDoubleArray(key, value);
    }

    /* renamed from: putFloat-impl, reason: not valid java name */
    public static final void m13698putFloatimpl(Bundle bundle, @NotNull String key, float f) {
        AbstractC5830k.m5330g(key, "key");
        bundle.putFloat(key, f);
    }

    /* renamed from: putFloatArray-impl, reason: not valid java name */
    public static final void m13699putFloatArrayimpl(Bundle bundle, @NotNull String key, @NotNull float[] value) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(value, "value");
        bundle.putFloatArray(key, value);
    }

    /* renamed from: putInt-impl, reason: not valid java name */
    public static final void m13700putIntimpl(Bundle bundle, @NotNull String key, int i) {
        AbstractC5830k.m5330g(key, "key");
        bundle.putInt(key, i);
    }

    /* renamed from: putIntArray-impl, reason: not valid java name */
    public static final void m13701putIntArrayimpl(Bundle bundle, @NotNull String key, @NotNull int[] value) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(value, "value");
        bundle.putIntArray(key, value);
    }

    /* renamed from: putIntList-impl, reason: not valid java name */
    public static final void m13702putIntListimpl(Bundle bundle, @NotNull String key, @NotNull List<Integer> value) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(value, "value");
        bundle.putIntegerArrayList(key, SavedStateWriterKt.toArrayListUnsafe(value));
    }

    /* renamed from: putJavaSerializable-impl, reason: not valid java name */
    public static final <T extends Serializable> void m13703putJavaSerializableimpl(Bundle bundle, @NotNull String key, @NotNull T value) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(value, "value");
        bundle.putSerializable(key, value);
    }

    /* renamed from: putLong-impl, reason: not valid java name */
    public static final void m13704putLongimpl(Bundle bundle, @NotNull String key, long j7) {
        AbstractC5830k.m5330g(key, "key");
        bundle.putLong(key, j7);
    }

    /* renamed from: putLongArray-impl, reason: not valid java name */
    public static final void m13705putLongArrayimpl(Bundle bundle, @NotNull String key, @NotNull long[] value) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(value, "value");
        bundle.putLongArray(key, value);
    }

    /* renamed from: putNull-impl, reason: not valid java name */
    public static final void m13706putNullimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        bundle.putString(key, null);
    }

    /* renamed from: putParcelable-impl, reason: not valid java name */
    public static final <T extends Parcelable> void m13707putParcelableimpl(Bundle bundle, @NotNull String key, @NotNull T value) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(value, "value");
        bundle.putParcelable(key, value);
    }

    /* renamed from: putParcelableArray-impl, reason: not valid java name */
    public static final <T extends Parcelable> void m13708putParcelableArrayimpl(Bundle bundle, @NotNull String key, @NotNull T[] value) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(value, "value");
        bundle.putParcelableArray(key, value);
    }

    /* renamed from: putParcelableList-impl, reason: not valid java name */
    public static final <T extends Parcelable> void m13709putParcelableListimpl(Bundle bundle, @NotNull String key, @NotNull List<? extends T> value) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(value, "value");
        bundle.putParcelableArrayList(key, SavedStateWriterKt.toArrayListUnsafe(value));
    }

    /* renamed from: putSavedState-impl, reason: not valid java name */
    public static final void m13710putSavedStateimpl(Bundle bundle, @NotNull String key, @NotNull Bundle value) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(value, "value");
        bundle.putBundle(key, value);
    }

    /* renamed from: putSavedStateArray-impl, reason: not valid java name */
    public static final void m13711putSavedStateArrayimpl(Bundle bundle, @NotNull String key, @NotNull Bundle[] value) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(value, "value");
        m13708putParcelableArrayimpl(bundle, key, value);
    }

    /* renamed from: putSavedStateList-impl, reason: not valid java name */
    public static final void m13712putSavedStateListimpl(Bundle bundle, @NotNull String key, @NotNull List<Bundle> value) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(value, "value");
        m13709putParcelableListimpl(bundle, key, value);
    }

    /* renamed from: putSize-impl, reason: not valid java name */
    public static final void m13713putSizeimpl(Bundle bundle, @NotNull String key, @NotNull Size value) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(value, "value");
        bundle.putSize(key, value);
    }

    /* renamed from: putSizeF-impl, reason: not valid java name */
    public static final void m13714putSizeFimpl(Bundle bundle, @NotNull String key, @NotNull SizeF value) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(value, "value");
        bundle.putSizeF(key, value);
    }

    /* renamed from: putSparseParcelableArray-impl, reason: not valid java name */
    public static final <T extends Parcelable> void m13715putSparseParcelableArrayimpl(Bundle bundle, @NotNull String key, @NotNull SparseArray<T> value) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(value, "value");
        bundle.putSparseParcelableArray(key, value);
    }

    /* renamed from: putString-impl, reason: not valid java name */
    public static final void m13716putStringimpl(Bundle bundle, @NotNull String key, @NotNull String value) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(value, "value");
        bundle.putString(key, value);
    }

    /* renamed from: putStringArray-impl, reason: not valid java name */
    public static final void m13717putStringArrayimpl(Bundle bundle, @NotNull String key, @NotNull String[] value) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(value, "value");
        bundle.putStringArray(key, value);
    }

    /* renamed from: putStringList-impl, reason: not valid java name */
    public static final void m13718putStringListimpl(Bundle bundle, @NotNull String key, @NotNull List<String> value) {
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(value, "value");
        bundle.putStringArrayList(key, SavedStateWriterKt.toArrayListUnsafe(value));
    }

    /* renamed from: remove-impl, reason: not valid java name */
    public static final void m13719removeimpl(Bundle bundle, @NotNull String key) {
        AbstractC5830k.m5330g(key, "key");
        bundle.remove(key);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m13720toStringimpl(Bundle bundle) {
        return "SavedStateWriter(source=" + bundle + ')';
    }

    public boolean equals(Object obj) {
        return m13684equalsimpl(this.source, obj);
    }

    public int hashCode() {
        return m13686hashCodeimpl(this.source);
    }

    public String toString() {
        return m13720toStringimpl(this.source);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ Bundle getSource() {
        return this.source;
    }
}
