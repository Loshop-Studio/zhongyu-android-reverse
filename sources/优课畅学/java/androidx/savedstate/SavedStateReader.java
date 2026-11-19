package androidx.savedstate;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.core.os.BundleCompat;
import androidx.exifinterface.media.ExifInterface;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p077d8.AbstractC8323h;
import p089e8.InterfaceC8375c;
import p134i7.AbstractC8798p0;
import p289w7.AbstractC10360a;

/* loaded from: classes3.dex */
public final class SavedStateReader {
    private final Bundle source;

    private /* synthetic */ SavedStateReader(Bundle bundle) {
        this.source = bundle;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SavedStateReader m27228boximpl(Bundle bundle) {
        return new SavedStateReader(bundle);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static Bundle m27229constructorimpl(Bundle source) {
        AbstractC9133u.m16133g(source, "source");
        return source;
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m27230containsimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        return bundle.containsKey(key);
    }

    /* renamed from: contentDeepEquals-impl, reason: not valid java name */
    public static final boolean m27231contentDeepEqualsimpl(Bundle bundle, Bundle other) {
        AbstractC9133u.m16133g(other, "other");
        return SavedStateReaderKt__SavedStateReader_androidKt.contentDeepEquals$SavedStateReaderKt__SavedStateReader_androidKt(bundle, other);
    }

    /* renamed from: contentDeepHashCode-impl, reason: not valid java name */
    public static final int m27232contentDeepHashCodeimpl(Bundle bundle) {
        return SavedStateReaderKt__SavedStateReader_androidKt.m1942x4f1a1420(bundle);
    }

    /* renamed from: contentDeepToString-impl, reason: not valid java name */
    public static final String m27233contentDeepToStringimpl(Bundle bundle) {
        StringBuilder sb = new StringBuilder((AbstractC8323h.m13513h(bundle.size(), 429496729) * 5) + 2);
        SavedStateReaderKt__SavedStateReader_androidKt.m1943x56e5e5af(bundle, sb, new ArrayList());
        String string = sb.toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        return string;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m27234equalsimpl(Bundle bundle, Object obj) {
        return (obj instanceof SavedStateReader) && AbstractC9133u.m16128b(bundle, ((SavedStateReader) obj).m27312unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m27235equalsimpl0(Bundle bundle, Bundle bundle2) {
        return AbstractC9133u.m16128b(bundle, bundle2);
    }

    /* renamed from: getBinder-impl, reason: not valid java name */
    public static final IBinder m27236getBinderimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        IBinder binder = bundle.getBinder(key);
        if (binder != null) {
            return binder;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getBinderOrNull-impl, reason: not valid java name */
    public static final IBinder m27237getBinderOrNullimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        return bundle.getBinder(key);
    }

    /* renamed from: getBoolean-impl, reason: not valid java name */
    public static final boolean m27238getBooleanimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        boolean z10 = bundle.getBoolean(key, false);
        if (z10 || !bundle.getBoolean(key, true)) {
            return z10;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getBooleanArray-impl, reason: not valid java name */
    public static final boolean[] m27239getBooleanArrayimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        boolean[] booleanArray = bundle.getBooleanArray(key);
        if (booleanArray != null) {
            return booleanArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getBooleanArrayOrNull-impl, reason: not valid java name */
    public static final boolean[] m27240getBooleanArrayOrNullimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        return bundle.getBooleanArray(key);
    }

    /* renamed from: getBooleanOrNull-impl, reason: not valid java name */
    public static final Boolean m27241getBooleanOrNullimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        boolean z10 = bundle.getBoolean(key, false);
        if (z10 || !bundle.getBoolean(key, true)) {
            return Boolean.valueOf(z10);
        }
        return null;
    }

    /* renamed from: getChar-impl, reason: not valid java name */
    public static final char m27242getCharimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        char c10 = bundle.getChar(key, (char) 0);
        if (c10 != 0 || bundle.getChar(key, (char) 65535) != 65535) {
            return c10;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getCharArray-impl, reason: not valid java name */
    public static final char[] m27243getCharArrayimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        char[] charArray = bundle.getCharArray(key);
        if (charArray != null) {
            return charArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getCharArrayOrNull-impl, reason: not valid java name */
    public static final char[] m27244getCharArrayOrNullimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        return bundle.getCharArray(key);
    }

    /* renamed from: getCharOrNull-impl, reason: not valid java name */
    public static final Character m27245getCharOrNullimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        char c10 = bundle.getChar(key, (char) 0);
        if (c10 == 0 && bundle.getChar(key, (char) 65535) == 65535) {
            return null;
        }
        return Character.valueOf(c10);
    }

    /* renamed from: getCharSequence-impl, reason: not valid java name */
    public static final CharSequence m27246getCharSequenceimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        CharSequence charSequence = bundle.getCharSequence(key);
        if (charSequence != null) {
            return charSequence;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getCharSequenceArray-impl, reason: not valid java name */
    public static final CharSequence[] m27247getCharSequenceArrayimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        CharSequence[] charSequenceArray = bundle.getCharSequenceArray(key);
        if (charSequenceArray != null) {
            return charSequenceArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getCharSequenceArrayOrNull-impl, reason: not valid java name */
    public static final CharSequence[] m27248getCharSequenceArrayOrNullimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        return bundle.getCharSequenceArray(key);
    }

    /* renamed from: getCharSequenceList-impl, reason: not valid java name */
    public static final List<CharSequence> m27249getCharSequenceListimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        ArrayList<CharSequence> charSequenceArrayList = bundle.getCharSequenceArrayList(key);
        if (charSequenceArrayList != null) {
            return charSequenceArrayList;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getCharSequenceListOrNull-impl, reason: not valid java name */
    public static final List<CharSequence> m27250getCharSequenceListOrNullimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        return bundle.getCharSequenceArrayList(key);
    }

    /* renamed from: getCharSequenceOrNull-impl, reason: not valid java name */
    public static final CharSequence m27251getCharSequenceOrNullimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        return bundle.getCharSequence(key);
    }

    /* renamed from: getDouble-impl, reason: not valid java name */
    public static final double m27252getDoubleimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        double d10 = bundle.getDouble(key, Double.MIN_VALUE);
        if (d10 != Double.MIN_VALUE || bundle.getDouble(key, Double.MAX_VALUE) != Double.MAX_VALUE) {
            return d10;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getDoubleArray-impl, reason: not valid java name */
    public static final double[] m27253getDoubleArrayimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        double[] doubleArray = bundle.getDoubleArray(key);
        if (doubleArray != null) {
            return doubleArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getDoubleArrayOrNull-impl, reason: not valid java name */
    public static final double[] m27254getDoubleArrayOrNullimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        return bundle.getDoubleArray(key);
    }

    /* renamed from: getDoubleOrNull-impl, reason: not valid java name */
    public static final Double m27255getDoubleOrNullimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        double d10 = bundle.getDouble(key, Double.MIN_VALUE);
        if (d10 == Double.MIN_VALUE && bundle.getDouble(key, Double.MAX_VALUE) == Double.MAX_VALUE) {
            return null;
        }
        return Double.valueOf(d10);
    }

    /* renamed from: getFloat-impl, reason: not valid java name */
    public static final float m27256getFloatimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        float f10 = bundle.getFloat(key, Float.MIN_VALUE);
        if (f10 != Float.MIN_VALUE || bundle.getFloat(key, Float.MAX_VALUE) != Float.MAX_VALUE) {
            return f10;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getFloatArray-impl, reason: not valid java name */
    public static final float[] m27257getFloatArrayimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        float[] floatArray = bundle.getFloatArray(key);
        if (floatArray != null) {
            return floatArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getFloatArrayOrNull-impl, reason: not valid java name */
    public static final float[] m27258getFloatArrayOrNullimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        return bundle.getFloatArray(key);
    }

    /* renamed from: getFloatOrNull-impl, reason: not valid java name */
    public static final Float m27259getFloatOrNullimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        float f10 = bundle.getFloat(key, Float.MIN_VALUE);
        if (f10 == Float.MIN_VALUE && bundle.getFloat(key, Float.MAX_VALUE) == Float.MAX_VALUE) {
            return null;
        }
        return Float.valueOf(f10);
    }

    /* renamed from: getInt-impl, reason: not valid java name */
    public static final int m27260getIntimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        int i10 = bundle.getInt(key, Integer.MIN_VALUE);
        if (i10 != Integer.MIN_VALUE || bundle.getInt(key, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i10;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getIntArray-impl, reason: not valid java name */
    public static final int[] m27261getIntArrayimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        int[] intArray = bundle.getIntArray(key);
        if (intArray != null) {
            return intArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getIntArrayOrNull-impl, reason: not valid java name */
    public static final int[] m27262getIntArrayOrNullimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        return bundle.getIntArray(key);
    }

    /* renamed from: getIntList-impl, reason: not valid java name */
    public static final List<Integer> m27263getIntListimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(key);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getIntListOrNull-impl, reason: not valid java name */
    public static final List<Integer> m27264getIntListOrNullimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        return bundle.getIntegerArrayList(key);
    }

    /* renamed from: getIntOrNull-impl, reason: not valid java name */
    public static final Integer m27265getIntOrNullimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        int i10 = bundle.getInt(key, Integer.MIN_VALUE);
        if (i10 == Integer.MIN_VALUE && bundle.getInt(key, Integer.MAX_VALUE) == Integer.MAX_VALUE) {
            return null;
        }
        return Integer.valueOf(i10);
    }

    /* renamed from: getJavaSerializable-impl, reason: not valid java name */
    public static final <T extends Serializable> T m27267getJavaSerializableimpl(Bundle bundle, String key, InterfaceC8375c serializableClass) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(serializableClass, "serializableClass");
        T t10 = (T) BundleCompat.getSerializable(bundle, key, AbstractC10360a.m19298a(serializableClass));
        if (t10 != null) {
            return t10;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getJavaSerializableOrNull-impl, reason: not valid java name */
    public static final <T extends Serializable> T m27269getJavaSerializableOrNullimpl(Bundle bundle, String key, InterfaceC8375c serializableClass) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(serializableClass, "serializableClass");
        return (T) BundleCompat.getSerializable(bundle, key, AbstractC10360a.m19298a(serializableClass));
    }

    /* renamed from: getLong-impl, reason: not valid java name */
    public static final long m27270getLongimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        long j10 = bundle.getLong(key, Long.MIN_VALUE);
        if (j10 != Long.MIN_VALUE || bundle.getLong(key, Long.MAX_VALUE) != Long.MAX_VALUE) {
            return j10;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getLongArray-impl, reason: not valid java name */
    public static final long[] m27271getLongArrayimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        long[] longArray = bundle.getLongArray(key);
        if (longArray != null) {
            return longArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getLongArrayOrNull-impl, reason: not valid java name */
    public static final long[] m27272getLongArrayOrNullimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        return bundle.getLongArray(key);
    }

    /* renamed from: getLongOrNull-impl, reason: not valid java name */
    public static final Long m27273getLongOrNullimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        long j10 = bundle.getLong(key, Long.MIN_VALUE);
        if (j10 == Long.MIN_VALUE && bundle.getLong(key, Long.MAX_VALUE) == Long.MAX_VALUE) {
            return null;
        }
        return Long.valueOf(j10);
    }

    /* renamed from: getParcelable-impl, reason: not valid java name */
    public static final <T extends Parcelable> T m27275getParcelableimpl(Bundle bundle, String key, InterfaceC8375c parcelableClass) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(parcelableClass, "parcelableClass");
        T t10 = (T) BundleCompat.getParcelable(bundle, key, AbstractC10360a.m19298a(parcelableClass));
        if (t10 != null) {
            return t10;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getParcelableArray-impl, reason: not valid java name */
    public static final <T extends Parcelable> T[] m27277getParcelableArrayimpl(Bundle bundle, String key, InterfaceC8375c parcelableClass) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(parcelableClass, "parcelableClass");
        T[] tArr = (T[]) m27279getParcelableArrayOrNullimpl(bundle, key, parcelableClass);
        if (tArr != null) {
            return tArr;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getParcelableArrayOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> T[] m27279getParcelableArrayOrNullimpl(Bundle bundle, String key, InterfaceC8375c parcelableClass) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(parcelableClass, "parcelableClass");
        T[] tArr = (T[]) BundleCompat.getParcelableArray(bundle, key, AbstractC10360a.m19298a(parcelableClass));
        if (tArr != null) {
            return tArr;
        }
        return null;
    }

    /* renamed from: getParcelableList-impl, reason: not valid java name */
    public static final <T extends Parcelable> List<T> m27281getParcelableListimpl(Bundle bundle, String key, InterfaceC8375c parcelableClass) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(parcelableClass, "parcelableClass");
        ArrayList parcelableArrayList = BundleCompat.getParcelableArrayList(bundle, key, AbstractC10360a.m19298a(parcelableClass));
        if (parcelableArrayList != null) {
            return parcelableArrayList;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getParcelableListOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> List<T> m27283getParcelableListOrNullimpl(Bundle bundle, String key, InterfaceC8375c parcelableClass) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(parcelableClass, "parcelableClass");
        return BundleCompat.getParcelableArrayList(bundle, key, AbstractC10360a.m19298a(parcelableClass));
    }

    /* renamed from: getParcelableOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> T m27285getParcelableOrNullimpl(Bundle bundle, String key, InterfaceC8375c parcelableClass) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(parcelableClass, "parcelableClass");
        return (T) BundleCompat.getParcelable(bundle, key, AbstractC10360a.m19298a(parcelableClass));
    }

    /* renamed from: getSavedState-impl, reason: not valid java name */
    public static final Bundle m27286getSavedStateimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        Bundle bundle2 = bundle.getBundle(key);
        if (bundle2 != null) {
            return bundle2;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getSavedStateArray-impl, reason: not valid java name */
    public static final Bundle[] m27287getSavedStateArrayimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        return (Bundle[]) m27277getParcelableArrayimpl(bundle, key, AbstractC9137y.m16154b(Bundle.class));
    }

    /* renamed from: getSavedStateArrayOrNull-impl, reason: not valid java name */
    public static final Bundle[] m27288getSavedStateArrayOrNullimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        return (Bundle[]) m27279getParcelableArrayOrNullimpl(bundle, key, AbstractC9137y.m16154b(Bundle.class));
    }

    /* renamed from: getSavedStateList-impl, reason: not valid java name */
    public static final List<Bundle> m27289getSavedStateListimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        return m27281getParcelableListimpl(bundle, key, AbstractC9137y.m16154b(Bundle.class));
    }

    /* renamed from: getSavedStateListOrNull-impl, reason: not valid java name */
    public static final List<Bundle> m27290getSavedStateListOrNullimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        return m27283getParcelableListOrNullimpl(bundle, key, AbstractC9137y.m16154b(Bundle.class));
    }

    /* renamed from: getSavedStateOrNull-impl, reason: not valid java name */
    public static final Bundle m27291getSavedStateOrNullimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        return bundle.getBundle(key);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final Size m27292getSizeimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        Size size = bundle.getSize(key);
        if (size != null) {
            return size;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getSizeF-impl, reason: not valid java name */
    public static final SizeF m27293getSizeFimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        SizeF sizeF = bundle.getSizeF(key);
        if (sizeF != null) {
            return sizeF;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getSizeFOrNull-impl, reason: not valid java name */
    public static final SizeF m27294getSizeFOrNullimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        return bundle.getSizeF(key);
    }

    /* renamed from: getSizeOrNull-impl, reason: not valid java name */
    public static final Size m27295getSizeOrNullimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        return bundle.getSize(key);
    }

    /* renamed from: getSparseParcelableArray-impl, reason: not valid java name */
    public static final <T extends Parcelable> SparseArray<T> m27297getSparseParcelableArrayimpl(Bundle bundle, String key, InterfaceC8375c parcelableClass) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(parcelableClass, "parcelableClass");
        SparseArray<T> sparseArrayM27299getSparseParcelableArrayOrNullimpl = m27299getSparseParcelableArrayOrNullimpl(bundle, key, parcelableClass);
        if (sparseArrayM27299getSparseParcelableArrayOrNullimpl != null) {
            return sparseArrayM27299getSparseParcelableArrayOrNullimpl;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getSparseParcelableArrayOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> SparseArray<T> m27299getSparseParcelableArrayOrNullimpl(Bundle bundle, String key, InterfaceC8375c parcelableClass) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16133g(parcelableClass, "parcelableClass");
        return BundleCompat.getSparseParcelableArray(bundle, key, AbstractC10360a.m19298a(parcelableClass));
    }

    /* renamed from: getString-impl, reason: not valid java name */
    public static final String m27300getStringimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        String string = bundle.getString(key);
        if (string != null) {
            return string;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getStringArray-impl, reason: not valid java name */
    public static final String[] m27301getStringArrayimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        String[] stringArray = bundle.getStringArray(key);
        if (stringArray != null) {
            return stringArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getStringArrayOrNull-impl, reason: not valid java name */
    public static final String[] m27302getStringArrayOrNullimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        return bundle.getStringArray(key);
    }

    /* renamed from: getStringList-impl, reason: not valid java name */
    public static final List<String> m27303getStringListimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        ArrayList<String> stringArrayList = bundle.getStringArrayList(key);
        if (stringArrayList != null) {
            return stringArrayList;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(key);
        throw new KotlinNothingValueException();
    }

    /* renamed from: getStringListOrNull-impl, reason: not valid java name */
    public static final List<String> m27304getStringListOrNullimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        return bundle.getStringArrayList(key);
    }

    /* renamed from: getStringOrNull-impl, reason: not valid java name */
    public static final String m27305getStringOrNullimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        return bundle.getString(key);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m27306hashCodeimpl(Bundle bundle) {
        return bundle.hashCode();
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m27307isEmptyimpl(Bundle bundle) {
        return bundle.isEmpty();
    }

    /* renamed from: isNull-impl, reason: not valid java name */
    public static final boolean m27308isNullimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        return m27230containsimpl(bundle, key) && bundle.get(key) == null;
    }

    /* renamed from: size-impl, reason: not valid java name */
    public static final int m27309sizeimpl(Bundle bundle) {
        return bundle.size();
    }

    /* renamed from: toMap-impl, reason: not valid java name */
    public static final Map<String, Object> m27310toMapimpl(Bundle bundle) {
        Map mapM14662d = AbstractC8798p0.m14662d(bundle.size());
        for (String str : bundle.keySet()) {
            AbstractC9133u.m16130d(str);
            mapM14662d.put(str, bundle.get(str));
        }
        return AbstractC8798p0.m14660b(mapM14662d);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m27311toStringimpl(Bundle bundle) {
        return "SavedStateReader(source=" + bundle + ')';
    }

    public boolean equals(Object obj) {
        return m27234equalsimpl(this.source, obj);
    }

    public int hashCode() {
        return m27306hashCodeimpl(this.source);
    }

    public String toString() {
        return m27311toStringimpl(this.source);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Bundle m27312unboximpl() {
        return this.source;
    }

    /* renamed from: getJavaSerializable-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Serializable> T m27266getJavaSerializableimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) m27267getJavaSerializableimpl(bundle, key, AbstractC9137y.m16154b(Serializable.class));
    }

    /* renamed from: getJavaSerializableOrNull-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Serializable> T m27268getJavaSerializableOrNullimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) m27269getJavaSerializableOrNullimpl(bundle, key, AbstractC9137y.m16154b(Serializable.class));
    }

    /* renamed from: getParcelable-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> T m27274getParcelableimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) m27275getParcelableimpl(bundle, key, AbstractC9137y.m16154b(Parcelable.class));
    }

    /* renamed from: getParcelableArray-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> T[] m27276getParcelableArrayimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T[]) m27277getParcelableArrayimpl(bundle, key, AbstractC9137y.m16154b(Parcelable.class));
    }

    /* renamed from: getParcelableArrayOrNull-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> T[] m27278getParcelableArrayOrNullimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T[]) m27279getParcelableArrayOrNullimpl(bundle, key, AbstractC9137y.m16154b(Parcelable.class));
    }

    /* renamed from: getParcelableListOrNull-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> List<T> m27282getParcelableListOrNullimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return m27283getParcelableListOrNullimpl(bundle, key, AbstractC9137y.m16154b(Parcelable.class));
    }

    /* renamed from: getParcelableOrNull-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> T m27284getParcelableOrNullimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) m27285getParcelableOrNullimpl(bundle, key, AbstractC9137y.m16154b(Parcelable.class));
    }

    /* renamed from: getSparseParcelableArray-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> SparseArray<T> m27296getSparseParcelableArrayimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return m27297getSparseParcelableArrayimpl(bundle, key, AbstractC9137y.m16154b(Parcelable.class));
    }

    /* renamed from: getSparseParcelableArrayOrNull-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> SparseArray<T> m27298getSparseParcelableArrayOrNullimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return m27299getSparseParcelableArrayOrNullimpl(bundle, key, AbstractC9137y.m16154b(Parcelable.class));
    }

    /* renamed from: getParcelableList-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> List<T> m27280getParcelableListimpl(Bundle bundle, String key) {
        AbstractC9133u.m16133g(key, "key");
        AbstractC9133u.m16139m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return m27281getParcelableListimpl(bundle, key, AbstractC9137y.m16154b(Parcelable.class));
    }
}
