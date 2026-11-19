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

    private Exception createException(int i6, String str) {
        switch (i6) {
            case EX_PARCELABLE /* -9 */:
                return (Exception) readParcelable();
            case -8:
            default:
                return new RuntimeException("Unknown exception code: " + i6 + " msg " + str);
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

    private Method getReadMethod(String str) throws NoSuchMethodException, SecurityException {
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

    private <T> int getType(T t6) {
        if (t6 instanceof String) {
            return 4;
        }
        if (t6 instanceof Parcelable) {
            return 2;
        }
        if (t6 instanceof VersionedParcelable) {
            return 1;
        }
        if (t6 instanceof Serializable) {
            return 3;
        }
        if (t6 instanceof IBinder) {
            return 5;
        }
        if (t6 instanceof Integer) {
            return 7;
        }
        if (t6 instanceof Float) {
            return 8;
        }
        throw new IllegalArgumentException(t6.getClass().getName() + " cannot be VersionedParcelled");
    }

    private Method getWriteMethod(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
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

    private <T, S extends Collection<T>> S readCollection(S s6) {
        int i6 = readInt();
        if (i6 < 0) {
            return null;
        }
        if (i6 != 0) {
            int i7 = readInt();
            if (i6 < 0) {
                return null;
            }
            if (i7 == 1) {
                while (i6 > 0) {
                    s6.add(readVersionedParcelable());
                    i6--;
                }
            } else if (i7 == 2) {
                while (i6 > 0) {
                    s6.add(readParcelable());
                    i6--;
                }
            } else if (i7 == 3) {
                while (i6 > 0) {
                    s6.add(readSerializable());
                    i6--;
                }
            } else if (i7 == 4) {
                while (i6 > 0) {
                    s6.add(readString());
                    i6--;
                }
            } else if (i7 == 5) {
                while (i6 > 0) {
                    s6.add(readStrongBinder());
                    i6--;
                }
            }
        }
        return s6;
    }

    private int readExceptionCode() {
        return readInt();
    }

    private <T> void writeCollection(Collection<T> collection, int i6) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        setOutputField(i6);
        writeCollection(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void writeVersionedParcelableCreator(VersionedParcelable versionedParcelable) {
        try {
            writeString(findParcelClass(versionedParcelable.getClass()).getName());
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException(versionedParcelable.getClass().getSimpleName() + " does not have a Parcelizer", e6);
        }
    }

    public abstract void closeField();

    public abstract VersionedParcel createSubParcel();

    public boolean isStream() {
        return false;
    }

    public <T> T[] readArray(T[] tArr, int i6) {
        return !readField(i6) ? tArr : (T[]) readArray(tArr);
    }

    public abstract boolean readBoolean();

    public boolean readBoolean(boolean z6, int i6) {
        return !readField(i6) ? z6 : readBoolean();
    }

    public boolean[] readBooleanArray(boolean[] zArr, int i6) {
        return !readField(i6) ? zArr : readBooleanArray();
    }

    public abstract Bundle readBundle();

    public Bundle readBundle(Bundle bundle, int i6) {
        return !readField(i6) ? bundle : readBundle();
    }

    public byte readByte(byte b7, int i6) {
        return !readField(i6) ? b7 : (byte) (readInt() & 255);
    }

    public abstract byte[] readByteArray();

    public byte[] readByteArray(byte[] bArr, int i6) {
        return !readField(i6) ? bArr : readByteArray();
    }

    public char[] readCharArray(char[] cArr, int i6) {
        if (!readField(i6)) {
            return cArr;
        }
        int i7 = readInt();
        if (i7 < 0) {
            return null;
        }
        char[] cArr2 = new char[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            cArr2[i8] = (char) readInt();
        }
        return cArr2;
    }

    public abstract CharSequence readCharSequence();

    public CharSequence readCharSequence(CharSequence charSequence, int i6) {
        return !readField(i6) ? charSequence : readCharSequence();
    }

    public abstract double readDouble();

    public double readDouble(double d6, int i6) {
        return !readField(i6) ? d6 : readDouble();
    }

    public double[] readDoubleArray(double[] dArr, int i6) {
        return !readField(i6) ? dArr : readDoubleArray();
    }

    public Exception readException(Exception exc, int i6) {
        int exceptionCode;
        return (readField(i6) && (exceptionCode = readExceptionCode()) != 0) ? readException(exceptionCode, readString()) : exc;
    }

    public abstract boolean readField(int i6);

    public abstract float readFloat();

    public float readFloat(float f6, int i6) {
        return !readField(i6) ? f6 : readFloat();
    }

    public float[] readFloatArray(float[] fArr, int i6) {
        return !readField(i6) ? fArr : readFloatArray();
    }

    public <T extends VersionedParcelable> T readFromParcel(String str, VersionedParcel versionedParcel) {
        try {
            return (T) getReadMethod(str).invoke(null, versionedParcel);
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e6);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e7);
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e8);
        } catch (InvocationTargetException e9) {
            if (e9.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e9.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e9);
        }
    }

    public abstract int readInt();

    public int readInt(int i6, int i7) {
        return !readField(i7) ? i6 : readInt();
    }

    public int[] readIntArray(int[] iArr, int i6) {
        return !readField(i6) ? iArr : readIntArray();
    }

    public <T> List<T> readList(List<T> list, int i6) {
        return !readField(i6) ? list : (List) readCollection(new ArrayList());
    }

    public abstract long readLong();

    public long readLong(long j6, int i6) {
        return !readField(i6) ? j6 : readLong();
    }

    public long[] readLongArray(long[] jArr, int i6) {
        return !readField(i6) ? jArr : readLongArray();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <K, V> Map<K, V> readMap(Map<K, V> map, int i6) {
        if (!readField(i6)) {
            return map;
        }
        int i7 = readInt();
        if (i7 < 0) {
            return null;
        }
        ArrayMap arrayMap = new ArrayMap();
        if (i7 != 0) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            readCollection(arrayList);
            readCollection(arrayList2);
            for (int i8 = 0; i8 < i7; i8++) {
                arrayMap.put(arrayList.get(i8), arrayList2.get(i8));
            }
        }
        return arrayMap;
    }

    public abstract <T extends Parcelable> T readParcelable();

    public <T extends Parcelable> T readParcelable(T t6, int i6) {
        return !readField(i6) ? t6 : (T) readParcelable();
    }

    public Serializable readSerializable() {
        String string = readString();
        if (string == null) {
            return null;
        }
        try {
            return (Serializable) new ObjectInputStream(new ByteArrayInputStream(readByteArray())) { // from class: androidx.versionedparcelable.VersionedParcel.1
                @Override // java.io.ObjectInputStream
                public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException {
                    Class<?> cls = Class.forName(objectStreamClass.getName(), false, getClass().getClassLoader());
                    return cls != null ? cls : super.resolveClass(objectStreamClass);
                }
            }.readObject();
        } catch (IOException e6) {
            throw new RuntimeException("VersionedParcelable encountered IOException reading a Serializable object (name = " + string + ")", e6);
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = " + string + ")", e7);
        }
    }

    public <T> Set<T> readSet(Set<T> set, int i6) {
        return !readField(i6) ? set : (Set) readCollection(new ArraySet());
    }

    @RequiresApi(api = 21)
    public Size readSize(Size size, int i6) {
        if (!readField(i6)) {
            return size;
        }
        if (readBoolean()) {
            return new Size(readInt(), readInt());
        }
        return null;
    }

    @RequiresApi(api = 21)
    public SizeF readSizeF(SizeF sizeF, int i6) {
        if (!readField(i6)) {
            return sizeF;
        }
        if (readBoolean()) {
            return new SizeF(readFloat(), readFloat());
        }
        return null;
    }

    public SparseBooleanArray readSparseBooleanArray(SparseBooleanArray sparseBooleanArray, int i6) {
        if (!readField(i6)) {
            return sparseBooleanArray;
        }
        int i7 = readInt();
        if (i7 < 0) {
            return null;
        }
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(i7);
        for (int i8 = 0; i8 < i7; i8++) {
            sparseBooleanArray2.put(readInt(), readBoolean());
        }
        return sparseBooleanArray2;
    }

    public abstract String readString();

    public String readString(String str, int i6) {
        return !readField(i6) ? str : readString();
    }

    public abstract IBinder readStrongBinder();

    public IBinder readStrongBinder(IBinder iBinder, int i6) {
        return !readField(i6) ? iBinder : readStrongBinder();
    }

    public <T extends VersionedParcelable> T readVersionedParcelable(T t6, int i6) {
        return !readField(i6) ? t6 : (T) readVersionedParcelable();
    }

    public abstract void setOutputField(int i6);

    public void setSerializationFlags(boolean z6, boolean z7) {
    }

    public <T> void writeArray(T[] tArr, int i6) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        setOutputField(i6);
        writeArray(tArr);
    }

    public abstract void writeBoolean(boolean z6);

    public void writeBoolean(boolean z6, int i6) {
        setOutputField(i6);
        writeBoolean(z6);
    }

    public void writeBooleanArray(boolean[] zArr, int i6) {
        setOutputField(i6);
        writeBooleanArray(zArr);
    }

    public abstract void writeBundle(Bundle bundle);

    public void writeBundle(Bundle bundle, int i6) {
        setOutputField(i6);
        writeBundle(bundle);
    }

    public void writeByte(byte b7, int i6) {
        setOutputField(i6);
        writeInt(b7);
    }

    public abstract void writeByteArray(byte[] bArr);

    public void writeByteArray(byte[] bArr, int i6) {
        setOutputField(i6);
        writeByteArray(bArr);
    }

    public abstract void writeByteArray(byte[] bArr, int i6, int i7);

    public void writeCharArray(char[] cArr, int i6) {
        setOutputField(i6);
        if (cArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(cArr.length);
        for (char c7 : cArr) {
            writeInt(c7);
        }
    }

    public abstract void writeCharSequence(CharSequence charSequence);

    public void writeCharSequence(CharSequence charSequence, int i6) {
        setOutputField(i6);
        writeCharSequence(charSequence);
    }

    public abstract void writeDouble(double d6);

    public void writeDouble(double d6, int i6) {
        setOutputField(i6);
        writeDouble(d6);
    }

    public void writeDoubleArray(double[] dArr, int i6) {
        setOutputField(i6);
        writeDoubleArray(dArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void writeException(Exception exc, int i6) {
        setOutputField(i6);
        if (exc == 0) {
            writeNoException();
            return;
        }
        int i7 = ((exc instanceof Parcelable) && exc.getClass().getClassLoader() == Parcelable.class.getClassLoader()) ? EX_PARCELABLE : exc instanceof SecurityException ? -1 : exc instanceof BadParcelableException ? -2 : exc instanceof IllegalArgumentException ? -3 : exc instanceof NullPointerException ? -4 : exc instanceof IllegalStateException ? EX_ILLEGAL_STATE : exc instanceof NetworkOnMainThreadException ? EX_NETWORK_MAIN_THREAD : exc instanceof UnsupportedOperationException ? EX_UNSUPPORTED_OPERATION : 0;
        writeInt(i7);
        if (i7 == 0) {
            if (!(exc instanceof RuntimeException)) {
                throw new RuntimeException(exc);
            }
            throw ((RuntimeException) exc);
        }
        writeString(exc.getMessage());
        if (i7 != EX_PARCELABLE) {
            return;
        }
        writeParcelable((Parcelable) exc);
    }

    public abstract void writeFloat(float f6);

    public void writeFloat(float f6, int i6) {
        setOutputField(i6);
        writeFloat(f6);
    }

    public void writeFloatArray(float[] fArr, int i6) {
        setOutputField(i6);
        writeFloatArray(fArr);
    }

    public abstract void writeInt(int i6);

    public void writeInt(int i6, int i7) {
        setOutputField(i7);
        writeInt(i6);
    }

    public void writeIntArray(int[] iArr, int i6) {
        setOutputField(i6);
        writeIntArray(iArr);
    }

    public <T> void writeList(List<T> list, int i6) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        writeCollection(list, i6);
    }

    public abstract void writeLong(long j6);

    public void writeLong(long j6, int i6) {
        setOutputField(i6);
        writeLong(j6);
    }

    public void writeLongArray(long[] jArr, int i6) {
        setOutputField(i6);
        writeLongArray(jArr);
    }

    public <K, V> void writeMap(Map<K, V> map, int i6) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        setOutputField(i6);
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

    public void writeParcelable(Parcelable parcelable, int i6) {
        setOutputField(i6);
        writeParcelable(parcelable);
    }

    public void writeSerializable(Serializable serializable, int i6) throws IOException {
        setOutputField(i6);
        writeSerializable(serializable);
    }

    public <T> void writeSet(Set<T> set, int i6) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        writeCollection(set, i6);
    }

    @RequiresApi(api = 21)
    public void writeSize(Size size, int i6) {
        setOutputField(i6);
        writeBoolean(size != null);
        if (size != null) {
            writeInt(size.getWidth());
            writeInt(size.getHeight());
        }
    }

    @RequiresApi(api = 21)
    public void writeSizeF(SizeF sizeF, int i6) {
        setOutputField(i6);
        writeBoolean(sizeF != null);
        if (sizeF != null) {
            writeFloat(sizeF.getWidth());
            writeFloat(sizeF.getHeight());
        }
    }

    public void writeSparseBooleanArray(SparseBooleanArray sparseBooleanArray, int i6) {
        setOutputField(i6);
        if (sparseBooleanArray == null) {
            writeInt(-1);
            return;
        }
        int size = sparseBooleanArray.size();
        writeInt(size);
        for (int i7 = 0; i7 < size; i7++) {
            writeInt(sparseBooleanArray.keyAt(i7));
            writeBoolean(sparseBooleanArray.valueAt(i7));
        }
    }

    public abstract void writeString(String str);

    public void writeString(String str, int i6) {
        setOutputField(i6);
        writeString(str);
    }

    public abstract void writeStrongBinder(IBinder iBinder);

    public void writeStrongBinder(IBinder iBinder, int i6) {
        setOutputField(i6);
        writeStrongBinder(iBinder);
    }

    public abstract void writeStrongInterface(IInterface iInterface);

    public void writeStrongInterface(IInterface iInterface, int i6) {
        setOutputField(i6);
        writeStrongInterface(iInterface);
    }

    public <T extends VersionedParcelable> void writeToParcel(T t6, VersionedParcel versionedParcel) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            getWriteMethod(t6.getClass()).invoke(null, t6, versionedParcel);
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e6);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e7);
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e8);
        } catch (InvocationTargetException e9) {
            if (!(e9.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e9);
            }
            throw ((RuntimeException) e9.getCause());
        }
    }

    public void writeVersionedParcelable(VersionedParcelable versionedParcelable, int i6) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        setOutputField(i6);
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
        } catch (IOException e6) {
            throw new RuntimeException("VersionedParcelable encountered IOException writing serializable object (name = " + name + ")", e6);
        }
    }

    public <T> T[] readArray(T[] tArr) {
        int i6 = readInt();
        if (i6 < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i6);
        if (i6 != 0) {
            int i7 = readInt();
            if (i6 < 0) {
                return null;
            }
            if (i7 == 1) {
                while (i6 > 0) {
                    arrayList.add(readVersionedParcelable());
                    i6--;
                }
            } else if (i7 == 2) {
                while (i6 > 0) {
                    arrayList.add(readParcelable());
                    i6--;
                }
            } else if (i7 == 3) {
                while (i6 > 0) {
                    arrayList.add(readSerializable());
                    i6--;
                }
            } else if (i7 == 4) {
                while (i6 > 0) {
                    arrayList.add(readString());
                    i6--;
                }
            } else if (i7 == 5) {
                while (i6 > 0) {
                    arrayList.add(readStrongBinder());
                    i6--;
                }
            }
        }
        return (T[]) arrayList.toArray(tArr);
    }

    public boolean[] readBooleanArray() {
        int i6 = readInt();
        if (i6 < 0) {
            return null;
        }
        boolean[] zArr = new boolean[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            zArr[i7] = readInt() != 0;
        }
        return zArr;
    }

    public double[] readDoubleArray() {
        int i6 = readInt();
        if (i6 < 0) {
            return null;
        }
        double[] dArr = new double[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            dArr[i7] = readDouble();
        }
        return dArr;
    }

    public float[] readFloatArray() {
        int i6 = readInt();
        if (i6 < 0) {
            return null;
        }
        float[] fArr = new float[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            fArr[i7] = readFloat();
        }
        return fArr;
    }

    public int[] readIntArray() {
        int i6 = readInt();
        if (i6 < 0) {
            return null;
        }
        int[] iArr = new int[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            iArr[i7] = readInt();
        }
        return iArr;
    }

    public long[] readLongArray() {
        int i6 = readInt();
        if (i6 < 0) {
            return null;
        }
        long[] jArr = new long[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            jArr[i7] = readLong();
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
            int i6 = 0;
            int type = getType(tArr[0]);
            writeInt(type);
            if (type == 1) {
                while (i6 < length) {
                    writeVersionedParcelable((VersionedParcelable) tArr[i6]);
                    i6++;
                }
                return;
            }
            if (type == 2) {
                while (i6 < length) {
                    writeParcelable((Parcelable) tArr[i6]);
                    i6++;
                }
                return;
            }
            if (type == 3) {
                while (i6 < length) {
                    writeSerializable((Serializable) tArr[i6]);
                    i6++;
                }
            } else if (type == 4) {
                while (i6 < length) {
                    writeString((String) tArr[i6]);
                    i6++;
                }
            } else {
                if (type != 5) {
                    return;
                }
                while (i6 < length) {
                    writeStrongBinder((IBinder) tArr[i6]);
                    i6++;
                }
            }
        }
    }

    public void writeBooleanArray(boolean[] zArr) {
        if (zArr != null) {
            writeInt(zArr.length);
            for (boolean z6 : zArr) {
                writeInt(z6 ? 1 : 0);
            }
            return;
        }
        writeInt(-1);
    }

    public void writeByteArray(byte[] bArr, int i6, int i7, int i8) {
        setOutputField(i8);
        writeByteArray(bArr, i6, i7);
    }

    public void writeDoubleArray(double[] dArr) {
        if (dArr != null) {
            writeInt(dArr.length);
            for (double d6 : dArr) {
                writeDouble(d6);
            }
            return;
        }
        writeInt(-1);
    }

    public void writeFloatArray(float[] fArr) {
        if (fArr != null) {
            writeInt(fArr.length);
            for (float f6 : fArr) {
                writeFloat(f6);
            }
            return;
        }
        writeInt(-1);
    }

    public void writeIntArray(int[] iArr) {
        if (iArr != null) {
            writeInt(iArr.length);
            for (int i6 : iArr) {
                writeInt(i6);
            }
            return;
        }
        writeInt(-1);
    }

    public void writeLongArray(long[] jArr) {
        if (jArr != null) {
            writeInt(jArr.length);
            for (long j6 : jArr) {
                writeLong(j6);
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

    private Exception readException(int i6, String str) {
        return createException(i6, str);
    }
}
