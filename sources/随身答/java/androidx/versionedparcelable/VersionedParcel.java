package androidx.versionedparcelable;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.NetworkOnMainThreadException;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseBooleanArray;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public abstract class VersionedParcel {
    private static final int EX_BAD_PARCELABLE = -2;
    private static final int EX_ILLEGAL_ARGUMENT = -3;
    private static final int EX_ILLEGAL_STATE = -5;
    private static final int EX_NETWORK_MAIN_THREAD = -6;
    private static final int EX_NULL_POINTER = -4;
    private static final int EX_PARCELABLE = -9;
    private static final int EX_SECURITY = -1;
    private static final int EX_UNSUPPORTED_OPERATION = -7;
    private static final String TAG = "VersionedParcel";
    private static final int TYPE_BINDER = 5;
    private static final int TYPE_FLOAT = 8;
    private static final int TYPE_INTEGER = 7;
    private static final int TYPE_PARCELABLE = 2;
    private static final int TYPE_SERIALIZABLE = 3;
    private static final int TYPE_STRING = 4;
    private static final int TYPE_VERSIONED_PARCELABLE = 1;
    protected final ArrayMap<String, Class> mParcelizerCache;
    protected final ArrayMap<String, Method> mReadCache;
    protected final ArrayMap<String, Method> mWriteCache;

    public static class ParcelException extends RuntimeException {
        public ParcelException(Throwable th) {
            super(th);
        }
    }

    public VersionedParcel(ArrayMap<String, Method> arrayMap, ArrayMap<String, Method> arrayMap2, ArrayMap<String, Class> arrayMap3) {
        this.mReadCache = arrayMap;
        this.mWriteCache = arrayMap2;
        this.mParcelizerCache = arrayMap3;
    }

    private Exception createException(int i9, String str) {
        switch (i9) {
            case EX_PARCELABLE /* -9 */:
                return (Exception) readParcelable();
            case -8:
            default:
                return new RuntimeException("Unknown exception code: " + i9 + " msg " + str);
            case EX_UNSUPPORTED_OPERATION /* -7 */:
                return new UnsupportedOperationException(str);
            case EX_NETWORK_MAIN_THREAD /* -6 */:
                return new NetworkOnMainThreadException();
            case EX_ILLEGAL_STATE /* -5 */:
                return new IllegalStateException(str);
            case -4:
                return new NullPointerException(str);
            case -3:
                return new IllegalArgumentException(str);
            case -2:
                return new BadParcelableException(str);
            case -1:
                return new SecurityException(str);
        }
    }

    private Class findParcelClass(Class<? extends VersionedParcelable> cls) throws ClassNotFoundException {
        Class cls2 = this.mParcelizerCache.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.mParcelizerCache.put(cls.getName(), cls3);
        return cls3;
    }

    private Method getReadMethod(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, ClassNotFoundException {
        Method method = this.mReadCache.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
        this.mReadCache.put(str, declaredMethod);
        return declaredMethod;
    }

    @NonNull
    public static Throwable getRootCause(@NonNull Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    private <T> int getType(T t9) {
        if (t9 instanceof String) {
            return 4;
        }
        if (t9 instanceof Parcelable) {
            return 2;
        }
        if (t9 instanceof VersionedParcelable) {
            return 1;
        }
        if (t9 instanceof Serializable) {
            return 3;
        }
        if (t9 instanceof IBinder) {
            return 5;
        }
        if (t9 instanceof Integer) {
            return 7;
        }
        if (t9 instanceof Float) {
            return 8;
        }
        throw new IllegalArgumentException(t9.getClass().getName() + " cannot be VersionedParcelled");
    }

    private Method getWriteMethod(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method = this.mWriteCache.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class clsFindParcelClass = findParcelClass(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsFindParcelClass.getDeclaredMethod("write", cls, VersionedParcel.class);
        this.mWriteCache.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    private <T, S extends Collection<T>> S readCollection(S s9) {
        int i9 = readInt();
        if (i9 < 0) {
            return null;
        }
        if (i9 != 0) {
            int i10 = readInt();
            if (i9 < 0) {
                return null;
            }
            if (i10 == 1) {
                while (i9 > 0) {
                    s9.add(readVersionedParcelable());
                    i9--;
                }
            } else if (i10 == 2) {
                while (i9 > 0) {
                    s9.add(readParcelable());
                    i9--;
                }
            } else if (i10 == 3) {
                while (i9 > 0) {
                    s9.add(readSerializable());
                    i9--;
                }
            } else if (i10 == 4) {
                while (i9 > 0) {
                    s9.add(readString());
                    i9--;
                }
            } else if (i10 == 5) {
                while (i9 > 0) {
                    s9.add(readStrongBinder());
                    i9--;
                }
            }
        }
        return s9;
    }

    private int readExceptionCode() {
        return readInt();
    }

    private <T> void writeCollection(Collection<T> collection, int i9) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        setOutputField(i9);
        writeCollection(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void writeVersionedParcelableCreator(VersionedParcelable versionedParcelable) {
        try {
            writeString(findParcelClass(versionedParcelable.getClass()).getName());
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(versionedParcelable.getClass().getSimpleName() + " does not have a Parcelizer", e10);
        }
    }

    public abstract void closeField();

    public abstract VersionedParcel createSubParcel();

    public boolean isStream() {
        return false;
    }

    public <T> T[] readArray(T[] tArr, int i9) {
        return !readField(i9) ? tArr : (T[]) readArray(tArr);
    }

    public abstract boolean readBoolean();

    public boolean readBoolean(boolean z9, int i9) {
        return !readField(i9) ? z9 : readBoolean();
    }

    public boolean[] readBooleanArray(boolean[] zArr, int i9) {
        return !readField(i9) ? zArr : readBooleanArray();
    }

    public abstract Bundle readBundle();

    public Bundle readBundle(Bundle bundle, int i9) {
        return !readField(i9) ? bundle : readBundle();
    }

    public byte readByte(byte b10, int i9) {
        return !readField(i9) ? b10 : (byte) (readInt() & 255);
    }

    public abstract byte[] readByteArray();

    public byte[] readByteArray(byte[] bArr, int i9) {
        return !readField(i9) ? bArr : readByteArray();
    }

    public char[] readCharArray(char[] cArr, int i9) {
        if (!readField(i9)) {
            return cArr;
        }
        int i10 = readInt();
        if (i10 < 0) {
            return null;
        }
        char[] cArr2 = new char[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            cArr2[i11] = (char) readInt();
        }
        return cArr2;
    }

    public abstract CharSequence readCharSequence();

    public CharSequence readCharSequence(CharSequence charSequence, int i9) {
        return !readField(i9) ? charSequence : readCharSequence();
    }

    public abstract double readDouble();

    public double readDouble(double d10, int i9) {
        return !readField(i9) ? d10 : readDouble();
    }

    public double[] readDoubleArray(double[] dArr, int i9) {
        return !readField(i9) ? dArr : readDoubleArray();
    }

    public Exception readException(Exception exc, int i9) {
        int exceptionCode;
        return (readField(i9) && (exceptionCode = readExceptionCode()) != 0) ? readException(exceptionCode, readString()) : exc;
    }

    public abstract boolean readField(int i9);

    public abstract float readFloat();

    public float readFloat(float f10, int i9) {
        return !readField(i9) ? f10 : readFloat();
    }

    public float[] readFloatArray(float[] fArr, int i9) {
        return !readField(i9) ? fArr : readFloatArray();
    }

    public <T extends VersionedParcelable> T readFromParcel(String str, VersionedParcel versionedParcel) {
        try {
            return (T) getReadMethod(str).invoke(null, versionedParcel);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
        }
    }

    public abstract int readInt();

    public int readInt(int i9, int i10) {
        return !readField(i10) ? i9 : readInt();
    }

    public int[] readIntArray(int[] iArr, int i9) {
        return !readField(i9) ? iArr : readIntArray();
    }

    public <T> List<T> readList(List<T> list, int i9) {
        return !readField(i9) ? list : (List) readCollection(new ArrayList());
    }

    public abstract long readLong();

    public long readLong(long j9, int i9) {
        return !readField(i9) ? j9 : readLong();
    }

    public long[] readLongArray(long[] jArr, int i9) {
        return !readField(i9) ? jArr : readLongArray();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <K, V> Map<K, V> readMap(Map<K, V> map, int i9) {
        if (!readField(i9)) {
            return map;
        }
        int i10 = readInt();
        if (i10 < 0) {
            return null;
        }
        ArrayMap arrayMap = new ArrayMap();
        if (i10 != 0) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            readCollection(arrayList);
            readCollection(arrayList2);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayMap.put(arrayList.get(i11), arrayList2.get(i11));
            }
        }
        return arrayMap;
    }

    public abstract <T extends Parcelable> T readParcelable();

    public <T extends Parcelable> T readParcelable(T t9, int i9) {
        return !readField(i9) ? t9 : (T) readParcelable();
    }

    public Serializable readSerializable() {
        String string = readString();
        if (string == null) {
            return null;
        }
        try {
            return (Serializable) new ObjectInputStream(new ByteArrayInputStream(readByteArray())) { // from class: androidx.versionedparcelable.VersionedParcel.1
                @Override // java.io.ObjectInputStream
                public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException, IOException {
                    Class<?> cls = Class.forName(objectStreamClass.getName(), false, getClass().getClassLoader());
                    return cls != null ? cls : super.resolveClass(objectStreamClass);
                }
            }.readObject();
        } catch (IOException e10) {
            throw new RuntimeException("VersionedParcelable encountered IOException reading a Serializable object (name = " + string + ")", e10);
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = " + string + ")", e11);
        }
    }

    public <T> Set<T> readSet(Set<T> set, int i9) {
        return !readField(i9) ? set : (Set) readCollection(new ArraySet());
    }

    @RequiresApi(api = 21)
    public Size readSize(Size size, int i9) {
        if (!readField(i9)) {
            return size;
        }
        if (readBoolean()) {
            return new Size(readInt(), readInt());
        }
        return null;
    }

    @RequiresApi(api = 21)
    public SizeF readSizeF(SizeF sizeF, int i9) {
        if (!readField(i9)) {
            return sizeF;
        }
        if (readBoolean()) {
            return new SizeF(readFloat(), readFloat());
        }
        return null;
    }

    public SparseBooleanArray readSparseBooleanArray(SparseBooleanArray sparseBooleanArray, int i9) {
        if (!readField(i9)) {
            return sparseBooleanArray;
        }
        int i10 = readInt();
        if (i10 < 0) {
            return null;
        }
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            sparseBooleanArray2.put(readInt(), readBoolean());
        }
        return sparseBooleanArray2;
    }

    public abstract String readString();

    public String readString(String str, int i9) {
        return !readField(i9) ? str : readString();
    }

    public abstract IBinder readStrongBinder();

    public IBinder readStrongBinder(IBinder iBinder, int i9) {
        return !readField(i9) ? iBinder : readStrongBinder();
    }

    public <T extends VersionedParcelable> T readVersionedParcelable(T t9, int i9) {
        return !readField(i9) ? t9 : (T) readVersionedParcelable();
    }

    public abstract void setOutputField(int i9);

    public void setSerializationFlags(boolean z9, boolean z10) {
    }

    public <T> void writeArray(T[] tArr, int i9) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        setOutputField(i9);
        writeArray(tArr);
    }

    public abstract void writeBoolean(boolean z9);

    public void writeBoolean(boolean z9, int i9) {
        setOutputField(i9);
        writeBoolean(z9);
    }

    public void writeBooleanArray(boolean[] zArr, int i9) {
        setOutputField(i9);
        writeBooleanArray(zArr);
    }

    public abstract void writeBundle(Bundle bundle);

    public void writeBundle(Bundle bundle, int i9) {
        setOutputField(i9);
        writeBundle(bundle);
    }

    public void writeByte(byte b10, int i9) {
        setOutputField(i9);
        writeInt(b10);
    }

    public abstract void writeByteArray(byte[] bArr);

    public void writeByteArray(byte[] bArr, int i9) {
        setOutputField(i9);
        writeByteArray(bArr);
    }

    public abstract void writeByteArray(byte[] bArr, int i9, int i10);

    public void writeCharArray(char[] cArr, int i9) {
        setOutputField(i9);
        if (cArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(cArr.length);
        for (char c10 : cArr) {
            writeInt(c10);
        }
    }

    public abstract void writeCharSequence(CharSequence charSequence);

    public void writeCharSequence(CharSequence charSequence, int i9) {
        setOutputField(i9);
        writeCharSequence(charSequence);
    }

    public abstract void writeDouble(double d10);

    public void writeDouble(double d10, int i9) {
        setOutputField(i9);
        writeDouble(d10);
    }

    public void writeDoubleArray(double[] dArr, int i9) {
        setOutputField(i9);
        writeDoubleArray(dArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void writeException(Exception exc, int i9) {
        setOutputField(i9);
        if (exc == 0) {
            writeNoException();
            return;
        }
        int i10 = ((exc instanceof Parcelable) && exc.getClass().getClassLoader() == Parcelable.class.getClassLoader()) ? EX_PARCELABLE : exc instanceof SecurityException ? -1 : exc instanceof BadParcelableException ? -2 : exc instanceof IllegalArgumentException ? -3 : exc instanceof NullPointerException ? -4 : exc instanceof IllegalStateException ? EX_ILLEGAL_STATE : exc instanceof NetworkOnMainThreadException ? EX_NETWORK_MAIN_THREAD : exc instanceof UnsupportedOperationException ? EX_UNSUPPORTED_OPERATION : 0;
        writeInt(i10);
        if (i10 == 0) {
            if (!(exc instanceof RuntimeException)) {
                throw new RuntimeException(exc);
            }
            throw ((RuntimeException) exc);
        }
        writeString(exc.getMessage());
        if (i10 != EX_PARCELABLE) {
            return;
        }
        writeParcelable((Parcelable) exc);
    }

    public abstract void writeFloat(float f10);

    public void writeFloat(float f10, int i9) {
        setOutputField(i9);
        writeFloat(f10);
    }

    public void writeFloatArray(float[] fArr, int i9) {
        setOutputField(i9);
        writeFloatArray(fArr);
    }

    public abstract void writeInt(int i9);

    public void writeInt(int i9, int i10) {
        setOutputField(i10);
        writeInt(i9);
    }

    public void writeIntArray(int[] iArr, int i9) {
        setOutputField(i9);
        writeIntArray(iArr);
    }

    public <T> void writeList(List<T> list, int i9) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        writeCollection(list, i9);
    }

    public abstract void writeLong(long j9);

    public void writeLong(long j9, int i9) {
        setOutputField(i9);
        writeLong(j9);
    }

    public void writeLongArray(long[] jArr, int i9) {
        setOutputField(i9);
        writeLongArray(jArr);
    }

    public <K, V> void writeMap(Map<K, V> map, int i9) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        setOutputField(i9);
        if (map == null) {
            writeInt(-1);
            return;
        }
        int size = map.size();
        writeInt(size);
        if (size == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            arrayList.add(entry.getKey());
            arrayList2.add(entry.getValue());
        }
        writeCollection(arrayList);
        writeCollection(arrayList2);
    }

    public void writeNoException() {
        writeInt(0);
    }

    public abstract void writeParcelable(Parcelable parcelable);

    public void writeParcelable(Parcelable parcelable, int i9) {
        setOutputField(i9);
        writeParcelable(parcelable);
    }

    public void writeSerializable(Serializable serializable, int i9) throws IOException {
        setOutputField(i9);
        writeSerializable(serializable);
    }

    public <T> void writeSet(Set<T> set, int i9) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        writeCollection(set, i9);
    }

    @RequiresApi(api = 21)
    public void writeSize(Size size, int i9) {
        setOutputField(i9);
        writeBoolean(size != null);
        if (size != null) {
            writeInt(size.getWidth());
            writeInt(size.getHeight());
        }
    }

    @RequiresApi(api = 21)
    public void writeSizeF(SizeF sizeF, int i9) {
        setOutputField(i9);
        writeBoolean(sizeF != null);
        if (sizeF != null) {
            writeFloat(sizeF.getWidth());
            writeFloat(sizeF.getHeight());
        }
    }

    public void writeSparseBooleanArray(SparseBooleanArray sparseBooleanArray, int i9) {
        setOutputField(i9);
        if (sparseBooleanArray == null) {
            writeInt(-1);
            return;
        }
        int size = sparseBooleanArray.size();
        writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            writeInt(sparseBooleanArray.keyAt(i10));
            writeBoolean(sparseBooleanArray.valueAt(i10));
        }
    }

    public abstract void writeString(String str);

    public void writeString(String str, int i9) {
        setOutputField(i9);
        writeString(str);
    }

    public abstract void writeStrongBinder(IBinder iBinder);

    public void writeStrongBinder(IBinder iBinder, int i9) {
        setOutputField(i9);
        writeStrongBinder(iBinder);
    }

    public abstract void writeStrongInterface(IInterface iInterface);

    public void writeStrongInterface(IInterface iInterface, int i9) {
        setOutputField(i9);
        writeStrongInterface(iInterface);
    }

    public <T extends VersionedParcelable> void writeToParcel(T t9, VersionedParcel versionedParcel) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            getWriteMethod(t9.getClass()).invoke(null, t9, versionedParcel);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (!(e13.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
            }
            throw ((RuntimeException) e13.getCause());
        }
    }

    public void writeVersionedParcelable(VersionedParcelable versionedParcelable, int i9) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        setOutputField(i9);
        writeVersionedParcelable(versionedParcelable);
    }

    private <T> void writeCollection(Collection<T> collection) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (collection == null) {
            writeInt(-1);
        }
        int size = collection.size();
        writeInt(size);
        if (size > 0) {
            int type = getType(collection.iterator().next());
            writeInt(type);
            switch (type) {
                case 1:
                    Iterator<T> it = collection.iterator();
                    while (it.hasNext()) {
                        writeVersionedParcelable((VersionedParcelable) it.next());
                    }
                    break;
                case 2:
                    Iterator<T> it2 = collection.iterator();
                    while (it2.hasNext()) {
                        writeParcelable((Parcelable) it2.next());
                    }
                    break;
                case 3:
                    Iterator<T> it3 = collection.iterator();
                    while (it3.hasNext()) {
                        writeSerializable((Serializable) it3.next());
                    }
                    break;
                case 4:
                    Iterator<T> it4 = collection.iterator();
                    while (it4.hasNext()) {
                        writeString((String) it4.next());
                    }
                    break;
                case 5:
                    Iterator<T> it5 = collection.iterator();
                    while (it5.hasNext()) {
                        writeStrongBinder((IBinder) it5.next());
                    }
                    break;
                case 7:
                    Iterator<T> it6 = collection.iterator();
                    while (it6.hasNext()) {
                        writeInt(((Integer) it6.next()).intValue());
                    }
                    break;
                case 8:
                    Iterator<T> it7 = collection.iterator();
                    while (it7.hasNext()) {
                        writeFloat(((Float) it7.next()).floatValue());
                    }
                    break;
            }
        }
    }

    private void writeSerializable(Serializable serializable) throws IOException {
        if (serializable == null) {
            writeString(null);
            return;
        }
        String name = serializable.getClass().getName();
        writeString(name);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            writeByteArray(byteArrayOutputStream.toByteArray());
        } catch (IOException e10) {
            throw new RuntimeException("VersionedParcelable encountered IOException writing serializable object (name = " + name + ")", e10);
        }
    }

    public <T> T[] readArray(T[] tArr) {
        int i9 = readInt();
        if (i9 < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i9);
        if (i9 != 0) {
            int i10 = readInt();
            if (i9 < 0) {
                return null;
            }
            if (i10 == 1) {
                while (i9 > 0) {
                    arrayList.add(readVersionedParcelable());
                    i9--;
                }
            } else if (i10 == 2) {
                while (i9 > 0) {
                    arrayList.add(readParcelable());
                    i9--;
                }
            } else if (i10 == 3) {
                while (i9 > 0) {
                    arrayList.add(readSerializable());
                    i9--;
                }
            } else if (i10 == 4) {
                while (i9 > 0) {
                    arrayList.add(readString());
                    i9--;
                }
            } else if (i10 == 5) {
                while (i9 > 0) {
                    arrayList.add(readStrongBinder());
                    i9--;
                }
            }
        }
        return (T[]) arrayList.toArray(tArr);
    }

    public boolean[] readBooleanArray() {
        int i9 = readInt();
        if (i9 < 0) {
            return null;
        }
        boolean[] zArr = new boolean[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            zArr[i10] = readInt() != 0;
        }
        return zArr;
    }

    public double[] readDoubleArray() {
        int i9 = readInt();
        if (i9 < 0) {
            return null;
        }
        double[] dArr = new double[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            dArr[i10] = readDouble();
        }
        return dArr;
    }

    public float[] readFloatArray() {
        int i9 = readInt();
        if (i9 < 0) {
            return null;
        }
        float[] fArr = new float[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            fArr[i10] = readFloat();
        }
        return fArr;
    }

    public int[] readIntArray() {
        int i9 = readInt();
        if (i9 < 0) {
            return null;
        }
        int[] iArr = new int[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            iArr[i10] = readInt();
        }
        return iArr;
    }

    public long[] readLongArray() {
        int i9 = readInt();
        if (i9 < 0) {
            return null;
        }
        long[] jArr = new long[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            jArr[i10] = readLong();
        }
        return jArr;
    }

    public <T extends VersionedParcelable> T readVersionedParcelable() {
        String string = readString();
        if (string == null) {
            return null;
        }
        return (T) readFromParcel(string, createSubParcel());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void writeArray(T[] tArr) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (tArr == 0) {
            writeInt(-1);
            return;
        }
        int length = tArr.length;
        writeInt(length);
        if (length > 0) {
            int i9 = 0;
            int type = getType(tArr[0]);
            writeInt(type);
            if (type == 1) {
                while (i9 < length) {
                    writeVersionedParcelable((VersionedParcelable) tArr[i9]);
                    i9++;
                }
                return;
            }
            if (type == 2) {
                while (i9 < length) {
                    writeParcelable((Parcelable) tArr[i9]);
                    i9++;
                }
                return;
            }
            if (type == 3) {
                while (i9 < length) {
                    writeSerializable((Serializable) tArr[i9]);
                    i9++;
                }
            } else if (type == 4) {
                while (i9 < length) {
                    writeString((String) tArr[i9]);
                    i9++;
                }
            } else {
                if (type != 5) {
                    return;
                }
                while (i9 < length) {
                    writeStrongBinder((IBinder) tArr[i9]);
                    i9++;
                }
            }
        }
    }

    public void writeBooleanArray(boolean[] zArr) {
        if (zArr != null) {
            writeInt(zArr.length);
            for (boolean z9 : zArr) {
                writeInt(z9 ? 1 : 0);
            }
            return;
        }
        writeInt(-1);
    }

    public void writeByteArray(byte[] bArr, int i9, int i10, int i11) {
        setOutputField(i11);
        writeByteArray(bArr, i9, i10);
    }

    public void writeDoubleArray(double[] dArr) {
        if (dArr != null) {
            writeInt(dArr.length);
            for (double d10 : dArr) {
                writeDouble(d10);
            }
            return;
        }
        writeInt(-1);
    }

    public void writeFloatArray(float[] fArr) {
        if (fArr != null) {
            writeInt(fArr.length);
            for (float f10 : fArr) {
                writeFloat(f10);
            }
            return;
        }
        writeInt(-1);
    }

    public void writeIntArray(int[] iArr) {
        if (iArr != null) {
            writeInt(iArr.length);
            for (int i9 : iArr) {
                writeInt(i9);
            }
            return;
        }
        writeInt(-1);
    }

    public void writeLongArray(long[] jArr) {
        if (jArr != null) {
            writeInt(jArr.length);
            for (long j9 : jArr) {
                writeLong(j9);
            }
            return;
        }
        writeInt(-1);
    }

    public void writeVersionedParcelable(VersionedParcelable versionedParcelable) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (versionedParcelable == null) {
            writeString(null);
            return;
        }
        writeVersionedParcelableCreator(versionedParcelable);
        VersionedParcel versionedParcelCreateSubParcel = createSubParcel();
        writeToParcel(versionedParcelable, versionedParcelCreateSubParcel);
        versionedParcelCreateSubParcel.closeField();
    }

    private Exception readException(int i9, String str) {
        return createException(i9, str);
    }
}
