package androidx.savedstate;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class SavedStateWriter {
    private final Bundle source;

    private /* synthetic */ SavedStateWriter(Bundle bundle) {
        this.source = bundle;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SavedStateWriter m27313boximpl(Bundle bundle) {
        return new SavedStateWriter(bundle);
    }

    /* renamed from: clear-impl, reason: not valid java name */
    public static final void m27314clearimpl(Bundle bundle) {
        bundle.clear();
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static Bundle m27315constructorimpl(Bundle source) {
        AbstractC9133u.m16133g(source, "source");
        return source;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m27316equalsimpl(Bundle bundle, Object obj) {
        return (obj instanceof SavedStateWriter) && AbstractC9133u.m16128b(bundle, ((SavedStateWriter) obj).m27353unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m27317equalsimpl0(Bundle bundle, Bundle bundle2) {
        return AbstractC9133u.m16128b(bundle, bundle2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m27318hashCodeimpl(Bundle bundle) {
        return bundle.hashCode();
    }

    /* renamed from: putAll-impl, reason: not valid java name */
    public static final void m27319putAllimpl(Bundle bundle, Bundle from) {
        AbstractC9133u.m16133g(from, "from");
        bundle.putAll(from);
    }

    /* renamed from: putBinder-impl, reason: not valid java name */
    public static final void m27320putBinderimpl(Bundle bundle, String key, IBinder value) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(value, "value");
        bundle.putBinder(key, value);
    }

    /* renamed from: putBoolean-impl, reason: not valid java name */
    public static final void m27321putBooleanimpl(Bundle bundle, String key, boolean z10) {
        AbstractC9133u.m16133g(key, "key");
        bundle.putBoolean(key, z10);
    }

    /* renamed from: putBooleanArray-impl, reason: not valid java name */
    public static final void m27322putBooleanArrayimpl(Bundle bundle, String key, boolean[] value) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(value, "value");
        bundle.putBooleanArray(key, value);
    }

    /* renamed from: putChar-impl, reason: not valid java name */
    public static final void m27323putCharimpl(Bundle bundle, String key, char c10) {
        AbstractC9133u.m16133g(key, "key");
        bundle.putChar(key, c10);
    }

    /* renamed from: putCharArray-impl, reason: not valid java name */
    public static final void m27324putCharArrayimpl(Bundle bundle, String key, char[] value) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(value, "value");
        bundle.putCharArray(key, value);
    }

    /* renamed from: putCharSequence-impl, reason: not valid java name */
    public static final void m27325putCharSequenceimpl(Bundle bundle, String key, CharSequence value) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(value, "value");
        bundle.putCharSequence(key, value);
    }

    /* renamed from: putCharSequenceArray-impl, reason: not valid java name */
    public static final void m27326putCharSequenceArrayimpl(Bundle bundle, String key, CharSequence[] value) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(value, "value");
        bundle.putCharSequenceArray(key, value);
    }

    /* renamed from: putCharSequenceList-impl, reason: not valid java name */
    public static final void m27327putCharSequenceListimpl(Bundle bundle, String key, List<? extends CharSequence> value) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(value, "value");
        bundle.putCharSequenceArrayList(key, SavedStateWriterKt.toArrayListUnsafe(value));
    }

    /* renamed from: putDouble-impl, reason: not valid java name */
    public static final void m27328putDoubleimpl(Bundle bundle, String key, double d10) {
        AbstractC9133u.m16133g(key, "key");
        bundle.putDouble(key, d10);
    }

    /* renamed from: putDoubleArray-impl, reason: not valid java name */
    public static final void m27329putDoubleArrayimpl(Bundle bundle, String key, double[] value) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(value, "value");
        bundle.putDoubleArray(key, value);
    }

    /* renamed from: putFloat-impl, reason: not valid java name */
    public static final void m27330putFloatimpl(Bundle bundle, String key, float f10) {
        AbstractC9133u.m16133g(key, "key");
        bundle.putFloat(key, f10);
    }

    /* renamed from: putFloatArray-impl, reason: not valid java name */
    public static final void m27331putFloatArrayimpl(Bundle bundle, String key, float[] value) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(value, "value");
        bundle.putFloatArray(key, value);
    }

    /* renamed from: putInt-impl, reason: not valid java name */
    public static final void m27332putIntimpl(Bundle bundle, String key, int i10) {
        AbstractC9133u.m16133g(key, "key");
        bundle.putInt(key, i10);
    }

    /* renamed from: putIntArray-impl, reason: not valid java name */
    public static final void m27333putIntArrayimpl(Bundle bundle, String key, int[] value) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(value, "value");
        bundle.putIntArray(key, value);
    }

    /* renamed from: putIntList-impl, reason: not valid java name */
    public static final void m27334putIntListimpl(Bundle bundle, String key, List<Integer> value) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(value, "value");
        bundle.putIntegerArrayList(key, SavedStateWriterKt.toArrayListUnsafe(value));
    }

    /* renamed from: putJavaSerializable-impl, reason: not valid java name */
    public static final <T extends Serializable> void m27335putJavaSerializableimpl(Bundle bundle, String key, T value) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(value, "value");
        bundle.putSerializable(key, value);
    }

    /* renamed from: putLong-impl, reason: not valid java name */
    public static final void m27336putLongimpl(Bundle bundle, String key, long j10) {
        AbstractC9133u.m16133g(key, "key");
        bundle.putLong(key, j10);
    }

    /* renamed from: putLongArray-impl, reason: not valid java name */
    public static final void m27337putLongArrayimpl(Bundle bundle, String key, long[] value) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(value, "value");
        bundle.putLongArray(key, value);
    }

    /* renamed from: putNull-impl, reason: not valid java name */
    public static final void m27338putNullimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        bundle.putString(key, null);
    }

    /* renamed from: putParcelable-impl, reason: not valid java name */
    public static final <T extends Parcelable> void m27339putParcelableimpl(Bundle bundle, String key, T value) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(value, "value");
        bundle.putParcelable(key, value);
    }

    /* renamed from: putParcelableArray-impl, reason: not valid java name */
    public static final <T extends Parcelable> void m27340putParcelableArrayimpl(Bundle bundle, String key, T[] value) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(value, "value");
        bundle.putParcelableArray(key, value);
    }

    /* renamed from: putParcelableList-impl, reason: not valid java name */
    public static final <T extends Parcelable> void m27341putParcelableListimpl(Bundle bundle, String key, List<? extends T> value) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(value, "value");
        bundle.putParcelableArrayList(key, SavedStateWriterKt.toArrayListUnsafe(value));
    }

    /* renamed from: putSavedState-impl, reason: not valid java name */
    public static final void m27342putSavedStateimpl(Bundle bundle, String key, Bundle value) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(value, "value");
        bundle.putBundle(key, value);
    }

    /* renamed from: putSavedStateArray-impl, reason: not valid java name */
    public static final void m27343putSavedStateArrayimpl(Bundle bundle, String key, Bundle[] value) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(value, "value");
        m27340putParcelableArrayimpl(bundle, key, value);
    }

    /* renamed from: putSavedStateList-impl, reason: not valid java name */
    public static final void m27344putSavedStateListimpl(Bundle bundle, String key, List<Bundle> value) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(value, "value");
        m27341putParcelableListimpl(bundle, key, value);
    }

    /* renamed from: putSize-impl, reason: not valid java name */
    public static final void m27345putSizeimpl(Bundle bundle, String key, Size value) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(value, "value");
        bundle.putSize(key, value);
    }

    /* renamed from: putSizeF-impl, reason: not valid java name */
    public static final void m27346putSizeFimpl(Bundle bundle, String key, SizeF value) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(value, "value");
        bundle.putSizeF(key, value);
    }

    /* renamed from: putSparseParcelableArray-impl, reason: not valid java name */
    public static final <T extends Parcelable> void m27347putSparseParcelableArrayimpl(Bundle bundle, String key, SparseArray<T> value) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(value, "value");
        bundle.putSparseParcelableArray(key, value);
    }

    /* renamed from: putString-impl, reason: not valid java name */
    public static final void m27348putStringimpl(Bundle bundle, String key, String value) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(value, "value");
        bundle.putString(key, value);
    }

    /* renamed from: putStringArray-impl, reason: not valid java name */
    public static final void m27349putStringArrayimpl(Bundle bundle, String key, String[] value) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(value, "value");
        bundle.putStringArray(key, value);
    }

    /* renamed from: putStringList-impl, reason: not valid java name */
    public static final void m27350putStringListimpl(Bundle bundle, String key, List<String> value) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(value, "value");
        bundle.putStringArrayList(key, SavedStateWriterKt.toArrayListUnsafe(value));
    }

    /* renamed from: remove-impl, reason: not valid java name */
    public static final void m27351removeimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        bundle.remove(key);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m27352toStringimpl(Bundle bundle) {
        return "SavedStateWriter(source=" + bundle + ')';
    }

    public boolean equals(Object obj) {
        return m27316equalsimpl(this.source, obj);
    }

    public int hashCode() {
        return m27318hashCodeimpl(this.source);
    }

    public String toString() {
        return m27352toStringimpl(this.source);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Bundle m27353unboximpl() {
        return this.source;
    }
}
