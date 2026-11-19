package androidx.savedstate;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class SavedStateWriter {
    private final Bundle source;

    private /* synthetic */ SavedStateWriter(Bundle bundle) {
        this.source = bundle;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SavedStateWriter m33908boximpl(Bundle bundle) {
        return new SavedStateWriter(bundle);
    }

    /* renamed from: clear-impl, reason: not valid java name */
    public static final void m33909clearimpl(Bundle bundle) {
        bundle.clear();
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static Bundle m33910constructorimpl(Bundle source) {
        AbstractC9979u.m20294g(source, "source");
        return source;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m33911equalsimpl(Bundle bundle, Object obj) {
        return (obj instanceof SavedStateWriter) && AbstractC9979u.m20289b(bundle, ((SavedStateWriter) obj).m33948unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33912equalsimpl0(Bundle bundle, Bundle bundle2) {
        return AbstractC9979u.m20289b(bundle, bundle2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m33913hashCodeimpl(Bundle bundle) {
        return bundle.hashCode();
    }

    /* renamed from: putAll-impl, reason: not valid java name */
    public static final void m33914putAllimpl(Bundle bundle, Bundle from) {
        AbstractC9979u.m20294g(from, "from");
        bundle.putAll(from);
    }

    /* renamed from: putBinder-impl, reason: not valid java name */
    public static final void m33915putBinderimpl(Bundle bundle, String key, IBinder value) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(value, "value");
        bundle.putBinder(key, value);
    }

    /* renamed from: putBoolean-impl, reason: not valid java name */
    public static final void m33916putBooleanimpl(Bundle bundle, String key, boolean z10) {
        AbstractC9979u.m20294g(key, "key");
        bundle.putBoolean(key, z10);
    }

    /* renamed from: putBooleanArray-impl, reason: not valid java name */
    public static final void m33917putBooleanArrayimpl(Bundle bundle, String key, boolean[] value) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(value, "value");
        bundle.putBooleanArray(key, value);
    }

    /* renamed from: putChar-impl, reason: not valid java name */
    public static final void m33918putCharimpl(Bundle bundle, String key, char c10) {
        AbstractC9979u.m20294g(key, "key");
        bundle.putChar(key, c10);
    }

    /* renamed from: putCharArray-impl, reason: not valid java name */
    public static final void m33919putCharArrayimpl(Bundle bundle, String key, char[] value) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(value, "value");
        bundle.putCharArray(key, value);
    }

    /* renamed from: putCharSequence-impl, reason: not valid java name */
    public static final void m33920putCharSequenceimpl(Bundle bundle, String key, CharSequence value) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(value, "value");
        bundle.putCharSequence(key, value);
    }

    /* renamed from: putCharSequenceArray-impl, reason: not valid java name */
    public static final void m33921putCharSequenceArrayimpl(Bundle bundle, String key, CharSequence[] value) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(value, "value");
        bundle.putCharSequenceArray(key, value);
    }

    /* renamed from: putCharSequenceList-impl, reason: not valid java name */
    public static final void m33922putCharSequenceListimpl(Bundle bundle, String key, List<? extends CharSequence> value) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(value, "value");
        bundle.putCharSequenceArrayList(key, SavedStateWriterKt.toArrayListUnsafe(value));
    }

    /* renamed from: putDouble-impl, reason: not valid java name */
    public static final void m33923putDoubleimpl(Bundle bundle, String key, double d10) {
        AbstractC9979u.m20294g(key, "key");
        bundle.putDouble(key, d10);
    }

    /* renamed from: putDoubleArray-impl, reason: not valid java name */
    public static final void m33924putDoubleArrayimpl(Bundle bundle, String key, double[] value) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(value, "value");
        bundle.putDoubleArray(key, value);
    }

    /* renamed from: putFloat-impl, reason: not valid java name */
    public static final void m33925putFloatimpl(Bundle bundle, String key, float f10) {
        AbstractC9979u.m20294g(key, "key");
        bundle.putFloat(key, f10);
    }

    /* renamed from: putFloatArray-impl, reason: not valid java name */
    public static final void m33926putFloatArrayimpl(Bundle bundle, String key, float[] value) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(value, "value");
        bundle.putFloatArray(key, value);
    }

    /* renamed from: putInt-impl, reason: not valid java name */
    public static final void m33927putIntimpl(Bundle bundle, String key, int i10) {
        AbstractC9979u.m20294g(key, "key");
        bundle.putInt(key, i10);
    }

    /* renamed from: putIntArray-impl, reason: not valid java name */
    public static final void m33928putIntArrayimpl(Bundle bundle, String key, int[] value) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(value, "value");
        bundle.putIntArray(key, value);
    }

    /* renamed from: putIntList-impl, reason: not valid java name */
    public static final void m33929putIntListimpl(Bundle bundle, String key, List<Integer> value) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(value, "value");
        bundle.putIntegerArrayList(key, SavedStateWriterKt.toArrayListUnsafe(value));
    }

    /* renamed from: putJavaSerializable-impl, reason: not valid java name */
    public static final <T extends Serializable> void m33930putJavaSerializableimpl(Bundle bundle, String key, T value) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(value, "value");
        bundle.putSerializable(key, value);
    }

    /* renamed from: putLong-impl, reason: not valid java name */
    public static final void m33931putLongimpl(Bundle bundle, String key, long j10) {
        AbstractC9979u.m20294g(key, "key");
        bundle.putLong(key, j10);
    }

    /* renamed from: putLongArray-impl, reason: not valid java name */
    public static final void m33932putLongArrayimpl(Bundle bundle, String key, long[] value) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(value, "value");
        bundle.putLongArray(key, value);
    }

    /* renamed from: putNull-impl, reason: not valid java name */
    public static final void m33933putNullimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        bundle.putString(key, null);
    }

    /* renamed from: putParcelable-impl, reason: not valid java name */
    public static final <T extends Parcelable> void m33934putParcelableimpl(Bundle bundle, String key, T value) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(value, "value");
        bundle.putParcelable(key, value);
    }

    /* renamed from: putParcelableArray-impl, reason: not valid java name */
    public static final <T extends Parcelable> void m33935putParcelableArrayimpl(Bundle bundle, String key, T[] value) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(value, "value");
        bundle.putParcelableArray(key, value);
    }

    /* renamed from: putParcelableList-impl, reason: not valid java name */
    public static final <T extends Parcelable> void m33936putParcelableListimpl(Bundle bundle, String key, List<? extends T> value) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(value, "value");
        bundle.putParcelableArrayList(key, SavedStateWriterKt.toArrayListUnsafe(value));
    }

    /* renamed from: putSavedState-impl, reason: not valid java name */
    public static final void m33937putSavedStateimpl(Bundle bundle, String key, Bundle value) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(value, "value");
        bundle.putBundle(key, value);
    }

    /* renamed from: putSavedStateArray-impl, reason: not valid java name */
    public static final void m33938putSavedStateArrayimpl(Bundle bundle, String key, Bundle[] value) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(value, "value");
        m33935putParcelableArrayimpl(bundle, key, value);
    }

    /* renamed from: putSavedStateList-impl, reason: not valid java name */
    public static final void m33939putSavedStateListimpl(Bundle bundle, String key, List<Bundle> value) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(value, "value");
        m33936putParcelableListimpl(bundle, key, value);
    }

    /* renamed from: putSize-impl, reason: not valid java name */
    public static final void m33940putSizeimpl(Bundle bundle, String key, Size value) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(value, "value");
        bundle.putSize(key, value);
    }

    /* renamed from: putSizeF-impl, reason: not valid java name */
    public static final void m33941putSizeFimpl(Bundle bundle, String key, SizeF value) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(value, "value");
        bundle.putSizeF(key, value);
    }

    /* renamed from: putSparseParcelableArray-impl, reason: not valid java name */
    public static final <T extends Parcelable> void m33942putSparseParcelableArrayimpl(Bundle bundle, String key, SparseArray<T> value) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(value, "value");
        bundle.putSparseParcelableArray(key, value);
    }

    /* renamed from: putString-impl, reason: not valid java name */
    public static final void m33943putStringimpl(Bundle bundle, String key, String value) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(value, "value");
        bundle.putString(key, value);
    }

    /* renamed from: putStringArray-impl, reason: not valid java name */
    public static final void m33944putStringArrayimpl(Bundle bundle, String key, String[] value) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(value, "value");
        bundle.putStringArray(key, value);
    }

    /* renamed from: putStringList-impl, reason: not valid java name */
    public static final void m33945putStringListimpl(Bundle bundle, String key, List<String> value) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(value, "value");
        bundle.putStringArrayList(key, SavedStateWriterKt.toArrayListUnsafe(value));
    }

    /* renamed from: remove-impl, reason: not valid java name */
    public static final void m33946removeimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        bundle.remove(key);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m33947toStringimpl(Bundle bundle) {
        return "SavedStateWriter(source=" + bundle + ')';
    }

    public boolean equals(Object obj) {
        return m33911equalsimpl(this.source, obj);
    }

    public int hashCode() {
        return m33913hashCodeimpl(this.source);
    }

    public String toString() {
        return m33947toStringimpl(this.source);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Bundle m33948unboximpl() {
        return this.source;
    }
}
