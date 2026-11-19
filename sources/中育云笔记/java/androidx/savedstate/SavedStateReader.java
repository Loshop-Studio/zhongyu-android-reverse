package androidx.savedstate;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.core.os.BundleCompat;
import androidx.exifinterface.media.ExifInterface;
import gd.AbstractC9293a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p265nd.AbstractC10410o;
import p280od.InterfaceC10469c;
import p325rc.AbstractC10967q0;

/* loaded from: classes3.dex */
public final class SavedStateReader {
    private final Bundle source;

    private /* synthetic */ SavedStateReader(Bundle bundle) {
        this.source = bundle;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SavedStateReader m33823boximpl(Bundle bundle) {
        return new SavedStateReader(bundle);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static Bundle m33824constructorimpl(Bundle source) {
        AbstractC9979u.m20294g(source, "source");
        return source;
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m33825containsimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        return bundle.containsKey(key);
    }

    /* renamed from: contentDeepEquals-impl, reason: not valid java name */
    public static final boolean m33826contentDeepEqualsimpl(Bundle bundle, Bundle other) {
        AbstractC9979u.m20294g(other, "other");
        return SavedStateReaderKt__SavedStateReader_androidKt.contentDeepEquals$SavedStateReaderKt__SavedStateReader_androidKt(bundle, other);
    }

    /* renamed from: contentDeepHashCode-impl, reason: not valid java name */
    public static final int m33827contentDeepHashCodeimpl(Bundle bundle) {
        return SavedStateReaderKt__SavedStateReader_androidKt.m2110x4f1a1420(bundle);
    }

    /* renamed from: contentDeepToString-impl, reason: not valid java name */
    public static final String m33828contentDeepToStringimpl(Bundle bundle) {
        StringBuilder sb2 = new StringBuilder((AbstractC10410o.m21756i(bundle.size(), 429496729) * 5) + 2);
        SavedStateReaderKt__SavedStateReader_androidKt.m2111x56e5e5af(bundle, sb2, new ArrayList());
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return string;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m33829equalsimpl(Bundle bundle, Object obj) {
        return (obj instanceof SavedStateReader) && AbstractC9979u.m20289b(bundle, ((SavedStateReader) obj).m33907unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33830equalsimpl0(Bundle bundle, Bundle bundle2) {
        return AbstractC9979u.m20289b(bundle, bundle2);
    }

    /* renamed from: getBinder-impl, reason: not valid java name */
    public static final IBinder m33831getBinderimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        IBinder binder = bundle.getBinder(key);
        if (binder != null) {
            return binder;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getBinderOrNull-impl, reason: not valid java name */
    public static final IBinder m33832getBinderOrNullimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        return bundle.getBinder(key);
    }

    /* renamed from: getBoolean-impl, reason: not valid java name */
    public static final boolean m33833getBooleanimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        boolean z10 = bundle.getBoolean(key, false);
        if (z10 || !bundle.getBoolean(key, true)) {
            return z10;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getBooleanArray-impl, reason: not valid java name */
    public static final boolean[] m33834getBooleanArrayimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        boolean[] booleanArray = bundle.getBooleanArray(key);
        if (booleanArray != null) {
            return booleanArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getBooleanArrayOrNull-impl, reason: not valid java name */
    public static final boolean[] m33835getBooleanArrayOrNullimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        return bundle.getBooleanArray(key);
    }

    /* renamed from: getBooleanOrNull-impl, reason: not valid java name */
    public static final Boolean m33836getBooleanOrNullimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        boolean z10 = bundle.getBoolean(key, false);
        if (z10 || !bundle.getBoolean(key, true)) {
            return Boolean.valueOf(z10);
        }
        return null;
    }

    /* renamed from: getChar-impl, reason: not valid java name */
    public static final char m33837getCharimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        char c10 = bundle.getChar(key, (char) 0);
        if (c10 != 0 || bundle.getChar(key, (char) 65535) != 65535) {
            return c10;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getCharArray-impl, reason: not valid java name */
    public static final char[] m33838getCharArrayimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        char[] charArray = bundle.getCharArray(key);
        if (charArray != null) {
            return charArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getCharArrayOrNull-impl, reason: not valid java name */
    public static final char[] m33839getCharArrayOrNullimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        return bundle.getCharArray(key);
    }

    /* renamed from: getCharOrNull-impl, reason: not valid java name */
    public static final Character m33840getCharOrNullimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        char c10 = bundle.getChar(key, (char) 0);
        if (c10 == 0 && bundle.getChar(key, (char) 65535) == 65535) {
            return null;
        }
        return Character.valueOf(c10);
    }

    /* renamed from: getCharSequence-impl, reason: not valid java name */
    public static final CharSequence m33841getCharSequenceimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        CharSequence charSequence = bundle.getCharSequence(key);
        if (charSequence != null) {
            return charSequence;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getCharSequenceArray-impl, reason: not valid java name */
    public static final CharSequence[] m33842getCharSequenceArrayimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        CharSequence[] charSequenceArray = bundle.getCharSequenceArray(key);
        if (charSequenceArray != null) {
            return charSequenceArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getCharSequenceArrayOrNull-impl, reason: not valid java name */
    public static final CharSequence[] m33843getCharSequenceArrayOrNullimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        return bundle.getCharSequenceArray(key);
    }

    /* renamed from: getCharSequenceList-impl, reason: not valid java name */
    public static final List<CharSequence> m33844getCharSequenceListimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        ArrayList<CharSequence> charSequenceArrayList = bundle.getCharSequenceArrayList(key);
        if (charSequenceArrayList != null) {
            return charSequenceArrayList;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getCharSequenceListOrNull-impl, reason: not valid java name */
    public static final List<CharSequence> m33845getCharSequenceListOrNullimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        return bundle.getCharSequenceArrayList(key);
    }

    /* renamed from: getCharSequenceOrNull-impl, reason: not valid java name */
    public static final CharSequence m33846getCharSequenceOrNullimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        return bundle.getCharSequence(key);
    }

    /* renamed from: getDouble-impl, reason: not valid java name */
    public static final double m33847getDoubleimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        double d10 = bundle.getDouble(key, Double.MIN_VALUE);
        if (d10 != Double.MIN_VALUE || bundle.getDouble(key, Double.MAX_VALUE) != Double.MAX_VALUE) {
            return d10;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getDoubleArray-impl, reason: not valid java name */
    public static final double[] m33848getDoubleArrayimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        double[] doubleArray = bundle.getDoubleArray(key);
        if (doubleArray != null) {
            return doubleArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getDoubleArrayOrNull-impl, reason: not valid java name */
    public static final double[] m33849getDoubleArrayOrNullimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        return bundle.getDoubleArray(key);
    }

    /* renamed from: getDoubleOrNull-impl, reason: not valid java name */
    public static final Double m33850getDoubleOrNullimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        double d10 = bundle.getDouble(key, Double.MIN_VALUE);
        if (d10 == Double.MIN_VALUE && bundle.getDouble(key, Double.MAX_VALUE) == Double.MAX_VALUE) {
            return null;
        }
        return Double.valueOf(d10);
    }

    /* renamed from: getFloat-impl, reason: not valid java name */
    public static final float m33851getFloatimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        float f10 = bundle.getFloat(key, Float.MIN_VALUE);
        if (f10 != Float.MIN_VALUE || bundle.getFloat(key, Float.MAX_VALUE) != Float.MAX_VALUE) {
            return f10;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getFloatArray-impl, reason: not valid java name */
    public static final float[] m33852getFloatArrayimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        float[] floatArray = bundle.getFloatArray(key);
        if (floatArray != null) {
            return floatArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getFloatArrayOrNull-impl, reason: not valid java name */
    public static final float[] m33853getFloatArrayOrNullimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        return bundle.getFloatArray(key);
    }

    /* renamed from: getFloatOrNull-impl, reason: not valid java name */
    public static final Float m33854getFloatOrNullimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        float f10 = bundle.getFloat(key, Float.MIN_VALUE);
        if (f10 == Float.MIN_VALUE && bundle.getFloat(key, Float.MAX_VALUE) == Float.MAX_VALUE) {
            return null;
        }
        return Float.valueOf(f10);
    }

    /* renamed from: getInt-impl, reason: not valid java name */
    public static final int m33855getIntimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        int i10 = bundle.getInt(key, Integer.MIN_VALUE);
        if (i10 != Integer.MIN_VALUE || bundle.getInt(key, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i10;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getIntArray-impl, reason: not valid java name */
    public static final int[] m33856getIntArrayimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        int[] intArray = bundle.getIntArray(key);
        if (intArray != null) {
            return intArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getIntArrayOrNull-impl, reason: not valid java name */
    public static final int[] m33857getIntArrayOrNullimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        return bundle.getIntArray(key);
    }

    /* renamed from: getIntList-impl, reason: not valid java name */
    public static final List<Integer> m33858getIntListimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(key);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getIntListOrNull-impl, reason: not valid java name */
    public static final List<Integer> m33859getIntListOrNullimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        return bundle.getIntegerArrayList(key);
    }

    /* renamed from: getIntOrNull-impl, reason: not valid java name */
    public static final Integer m33860getIntOrNullimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        int i10 = bundle.getInt(key, Integer.MIN_VALUE);
        if (i10 == Integer.MIN_VALUE && bundle.getInt(key, Integer.MAX_VALUE) == Integer.MAX_VALUE) {
            return null;
        }
        return Integer.valueOf(i10);
    }

    /* renamed from: getJavaSerializable-impl, reason: not valid java name */
    public static final <T extends Serializable> T m33862getJavaSerializableimpl(Bundle bundle, String key, InterfaceC10469c serializableClass) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(serializableClass, "serializableClass");
        T t10 = (T) BundleCompat.getSerializable(bundle, key, AbstractC9293a.m18324a(serializableClass));
        if (t10 != null) {
            return t10;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getJavaSerializableOrNull-impl, reason: not valid java name */
    public static final <T extends Serializable> T m33864getJavaSerializableOrNullimpl(Bundle bundle, String key, InterfaceC10469c serializableClass) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(serializableClass, "serializableClass");
        return (T) BundleCompat.getSerializable(bundle, key, AbstractC9293a.m18324a(serializableClass));
    }

    /* renamed from: getLong-impl, reason: not valid java name */
    public static final long m33865getLongimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        long j10 = bundle.getLong(key, Long.MIN_VALUE);
        if (j10 != Long.MIN_VALUE || bundle.getLong(key, Long.MAX_VALUE) != Long.MAX_VALUE) {
            return j10;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getLongArray-impl, reason: not valid java name */
    public static final long[] m33866getLongArrayimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        long[] longArray = bundle.getLongArray(key);
        if (longArray != null) {
            return longArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getLongArrayOrNull-impl, reason: not valid java name */
    public static final long[] m33867getLongArrayOrNullimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        return bundle.getLongArray(key);
    }

    /* renamed from: getLongOrNull-impl, reason: not valid java name */
    public static final Long m33868getLongOrNullimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        long j10 = bundle.getLong(key, Long.MIN_VALUE);
        if (j10 == Long.MIN_VALUE && bundle.getLong(key, Long.MAX_VALUE) == Long.MAX_VALUE) {
            return null;
        }
        return Long.valueOf(j10);
    }

    /* renamed from: getParcelable-impl, reason: not valid java name */
    public static final <T extends Parcelable> T m33870getParcelableimpl(Bundle bundle, String key, InterfaceC10469c parcelableClass) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(parcelableClass, "parcelableClass");
        T t10 = (T) BundleCompat.getParcelable(bundle, key, AbstractC9293a.m18324a(parcelableClass));
        if (t10 != null) {
            return t10;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getParcelableArray-impl, reason: not valid java name */
    public static final <T extends Parcelable> T[] m33872getParcelableArrayimpl(Bundle bundle, String key, InterfaceC10469c parcelableClass) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(parcelableClass, "parcelableClass");
        T[] tArr = (T[]) m33874getParcelableArrayOrNullimpl(bundle, key, parcelableClass);
        if (tArr != null) {
            return tArr;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getParcelableArrayOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> T[] m33874getParcelableArrayOrNullimpl(Bundle bundle, String key, InterfaceC10469c parcelableClass) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(parcelableClass, "parcelableClass");
        T[] tArr = (T[]) BundleCompat.getParcelableArray(bundle, key, AbstractC9293a.m18324a(parcelableClass));
        if (tArr != null) {
            return tArr;
        }
        return null;
    }

    /* renamed from: getParcelableList-impl, reason: not valid java name */
    public static final <T extends Parcelable> List<T> m33876getParcelableListimpl(Bundle bundle, String key, InterfaceC10469c parcelableClass) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(parcelableClass, "parcelableClass");
        ArrayList parcelableArrayList = BundleCompat.getParcelableArrayList(bundle, key, AbstractC9293a.m18324a(parcelableClass));
        if (parcelableArrayList != null) {
            return parcelableArrayList;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getParcelableListOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> List<T> m33878getParcelableListOrNullimpl(Bundle bundle, String key, InterfaceC10469c parcelableClass) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(parcelableClass, "parcelableClass");
        return BundleCompat.getParcelableArrayList(bundle, key, AbstractC9293a.m18324a(parcelableClass));
    }

    /* renamed from: getParcelableOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> T m33880getParcelableOrNullimpl(Bundle bundle, String key, InterfaceC10469c parcelableClass) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(parcelableClass, "parcelableClass");
        return (T) BundleCompat.getParcelable(bundle, key, AbstractC9293a.m18324a(parcelableClass));
    }

    /* renamed from: getSavedState-impl, reason: not valid java name */
    public static final Bundle m33881getSavedStateimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        Bundle bundle2 = bundle.getBundle(key);
        if (bundle2 != null) {
            return bundle2;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getSavedStateArray-impl, reason: not valid java name */
    public static final Bundle[] m33882getSavedStateArrayimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        return (Bundle[]) m33872getParcelableArrayimpl(bundle, key, AbstractC9983y.m20315b(Bundle.class));
    }

    /* renamed from: getSavedStateArrayOrNull-impl, reason: not valid java name */
    public static final Bundle[] m33883getSavedStateArrayOrNullimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        return (Bundle[]) m33874getParcelableArrayOrNullimpl(bundle, key, AbstractC9983y.m20315b(Bundle.class));
    }

    /* renamed from: getSavedStateList-impl, reason: not valid java name */
    public static final List<Bundle> m33884getSavedStateListimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        return m33876getParcelableListimpl(bundle, key, AbstractC9983y.m20315b(Bundle.class));
    }

    /* renamed from: getSavedStateListOrNull-impl, reason: not valid java name */
    public static final List<Bundle> m33885getSavedStateListOrNullimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        return m33878getParcelableListOrNullimpl(bundle, key, AbstractC9983y.m20315b(Bundle.class));
    }

    /* renamed from: getSavedStateOrNull-impl, reason: not valid java name */
    public static final Bundle m33886getSavedStateOrNullimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        return bundle.getBundle(key);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final Size m33887getSizeimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        Size size = bundle.getSize(key);
        if (size != null) {
            return size;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getSizeF-impl, reason: not valid java name */
    public static final SizeF m33888getSizeFimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        SizeF sizeF = bundle.getSizeF(key);
        if (sizeF != null) {
            return sizeF;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getSizeFOrNull-impl, reason: not valid java name */
    public static final SizeF m33889getSizeFOrNullimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        return bundle.getSizeF(key);
    }

    /* renamed from: getSizeOrNull-impl, reason: not valid java name */
    public static final Size m33890getSizeOrNullimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        return bundle.getSize(key);
    }

    /* renamed from: getSparseParcelableArray-impl, reason: not valid java name */
    public static final <T extends Parcelable> SparseArray<T> m33892getSparseParcelableArrayimpl(Bundle bundle, String key, InterfaceC10469c parcelableClass) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(parcelableClass, "parcelableClass");
        SparseArray<T> sparseArrayM33894getSparseParcelableArrayOrNullimpl = m33894getSparseParcelableArrayOrNullimpl(bundle, key, parcelableClass);
        if (sparseArrayM33894getSparseParcelableArrayOrNullimpl != null) {
            return sparseArrayM33894getSparseParcelableArrayOrNullimpl;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getSparseParcelableArrayOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> SparseArray<T> m33894getSparseParcelableArrayOrNullimpl(Bundle bundle, String key, InterfaceC10469c parcelableClass) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(parcelableClass, "parcelableClass");
        return BundleCompat.getSparseParcelableArray(bundle, key, AbstractC9293a.m18324a(parcelableClass));
    }

    /* renamed from: getString-impl, reason: not valid java name */
    public static final String m33895getStringimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        String string = bundle.getString(key);
        if (string != null) {
            return string;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getStringArray-impl, reason: not valid java name */
    public static final String[] m33896getStringArrayimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        String[] stringArray = bundle.getStringArray(key);
        if (stringArray != null) {
            return stringArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getStringArrayOrNull-impl, reason: not valid java name */
    public static final String[] m33897getStringArrayOrNullimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        return bundle.getStringArray(key);
    }

    /* renamed from: getStringList-impl, reason: not valid java name */
    public static final List<String> m33898getStringListimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        ArrayList<String> stringArrayList = bundle.getStringArrayList(key);
        if (stringArrayList != null) {
            return stringArrayList;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getStringListOrNull-impl, reason: not valid java name */
    public static final List<String> m33899getStringListOrNullimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        return bundle.getStringArrayList(key);
    }

    /* renamed from: getStringOrNull-impl, reason: not valid java name */
    public static final String m33900getStringOrNullimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        return bundle.getString(key);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m33901hashCodeimpl(Bundle bundle) {
        return bundle.hashCode();
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m33902isEmptyimpl(Bundle bundle) {
        return bundle.isEmpty();
    }

    /* renamed from: isNull-impl, reason: not valid java name */
    public static final boolean m33903isNullimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        return m33825containsimpl(bundle, key) && bundle.get(key) == null;
    }

    /* renamed from: size-impl, reason: not valid java name */
    public static final int m33904sizeimpl(Bundle bundle) {
        return bundle.size();
    }

    /* renamed from: toMap-impl, reason: not valid java name */
    public static final Map<String, Object> m33905toMapimpl(Bundle bundle) {
        Map mapM24037d = AbstractC10967q0.m24037d(bundle.size());
        for (String str : bundle.keySet()) {
            AbstractC9979u.m20291d(str);
            mapM24037d.put(str, bundle.get(str));
        }
        return AbstractC10967q0.m24035b(mapM24037d);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m33906toStringimpl(Bundle bundle) {
        return "SavedStateReader(source=" + bundle + ')';
    }

    public boolean equals(Object obj) {
        return m33829equalsimpl(this.source, obj);
    }

    public int hashCode() {
        return m33901hashCodeimpl(this.source);
    }

    public String toString() {
        return m33906toStringimpl(this.source);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Bundle m33907unboximpl() {
        return this.source;
    }

    /* renamed from: getJavaSerializable-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Serializable> T m33861getJavaSerializableimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) m33862getJavaSerializableimpl(bundle, key, AbstractC9983y.m20315b(Serializable.class));
    }

    /* renamed from: getJavaSerializableOrNull-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Serializable> T m33863getJavaSerializableOrNullimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) m33864getJavaSerializableOrNullimpl(bundle, key, AbstractC9983y.m20315b(Serializable.class));
    }

    /* renamed from: getParcelable-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> T m33869getParcelableimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) m33870getParcelableimpl(bundle, key, AbstractC9983y.m20315b(Parcelable.class));
    }

    /* renamed from: getParcelableArray-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> T[] m33871getParcelableArrayimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T[]) m33872getParcelableArrayimpl(bundle, key, AbstractC9983y.m20315b(Parcelable.class));
    }

    /* renamed from: getParcelableArrayOrNull-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> T[] m33873getParcelableArrayOrNullimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T[]) m33874getParcelableArrayOrNullimpl(bundle, key, AbstractC9983y.m20315b(Parcelable.class));
    }

    /* renamed from: getParcelableListOrNull-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> List<T> m33877getParcelableListOrNullimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return m33878getParcelableListOrNullimpl(bundle, key, AbstractC9983y.m20315b(Parcelable.class));
    }

    /* renamed from: getParcelableOrNull-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> T m33879getParcelableOrNullimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) m33880getParcelableOrNullimpl(bundle, key, AbstractC9983y.m20315b(Parcelable.class));
    }

    /* renamed from: getSparseParcelableArray-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> SparseArray<T> m33891getSparseParcelableArrayimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return m33892getSparseParcelableArrayimpl(bundle, key, AbstractC9983y.m20315b(Parcelable.class));
    }

    /* renamed from: getSparseParcelableArrayOrNull-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> SparseArray<T> m33893getSparseParcelableArrayOrNullimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return m33894getSparseParcelableArrayOrNullimpl(bundle, key, AbstractC9983y.m20315b(Parcelable.class));
    }

    /* renamed from: getParcelableList-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> List<T> m33875getParcelableListimpl(Bundle bundle, String key) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return m33876getParcelableListimpl(bundle, key, AbstractC9983y.m20315b(Parcelable.class));
    }
}
