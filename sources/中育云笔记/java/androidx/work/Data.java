package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.camera.video.AudioStats;
import androidx.exifinterface.media.ExifInterface;
import androidx.room.TypeConverter;
import cd.AbstractC5423b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p280od.InterfaceC10469c;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10960n;

/* loaded from: classes3.dex */
public final class Data {
    public static final Companion Companion = new Companion(null);
    public static final Data EMPTY = new Builder().build();

    @SuppressLint({"MinMaxConstant"})
    public static final int MAX_DATA_BYTES = 10240;
    private static final String NULL_STRING_V1 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
    private static final short STREAM_MAGIC = -21521;
    private static final short STREAM_VERSION = 1;
    private static final byte TYPE_BOOLEAN = 1;
    private static final byte TYPE_BOOLEAN_ARRAY = 8;
    private static final byte TYPE_BYTE = 2;
    private static final byte TYPE_BYTE_ARRAY = 9;
    private static final byte TYPE_DOUBLE = 6;
    private static final byte TYPE_DOUBLE_ARRAY = 13;
    private static final byte TYPE_FLOAT = 5;
    private static final byte TYPE_FLOAT_ARRAY = 12;
    private static final byte TYPE_INTEGER = 3;
    private static final byte TYPE_INTEGER_ARRAY = 10;
    private static final byte TYPE_LONG = 4;
    private static final byte TYPE_LONG_ARRAY = 11;
    private static final byte TYPE_NULL = 0;
    private static final byte TYPE_STRING = 7;
    private static final byte TYPE_STRING_ARRAY = 14;
    private final Map<String, Object> values;

    public static final class Builder {
        private final Map<String, Object> values = new LinkedHashMap();

        private final Builder putDirect(String str, Object obj) {
            this.values.put(str, obj);
            return this;
        }

        public final Data build() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            Data data = new Data((Map<String, ?>) this.values);
            Data.Companion.toByteArrayInternalV1(data);
            return data;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final Builder put(String key, Object obj) {
            AbstractC9979u.m20294g(key, "key");
            Map<String, Object> map = this.values;
            if (obj == null) {
                obj = null;
            } else {
                InterfaceC10469c interfaceC10469cM20315b = AbstractC9983y.m20315b(obj.getClass());
                if (!(AbstractC9979u.m20289b(interfaceC10469cM20315b, AbstractC9983y.m20315b(Boolean.TYPE)) ? true : AbstractC9979u.m20289b(interfaceC10469cM20315b, AbstractC9983y.m20315b(Byte.TYPE)) ? true : AbstractC9979u.m20289b(interfaceC10469cM20315b, AbstractC9983y.m20315b(Integer.TYPE)) ? true : AbstractC9979u.m20289b(interfaceC10469cM20315b, AbstractC9983y.m20315b(Long.TYPE)) ? true : AbstractC9979u.m20289b(interfaceC10469cM20315b, AbstractC9983y.m20315b(Float.TYPE)) ? true : AbstractC9979u.m20289b(interfaceC10469cM20315b, AbstractC9983y.m20315b(Double.TYPE)) ? true : AbstractC9979u.m20289b(interfaceC10469cM20315b, AbstractC9983y.m20315b(String.class)) ? true : AbstractC9979u.m20289b(interfaceC10469cM20315b, AbstractC9983y.m20315b(Boolean[].class)) ? true : AbstractC9979u.m20289b(interfaceC10469cM20315b, AbstractC9983y.m20315b(Byte[].class)) ? true : AbstractC9979u.m20289b(interfaceC10469cM20315b, AbstractC9983y.m20315b(Integer[].class)) ? true : AbstractC9979u.m20289b(interfaceC10469cM20315b, AbstractC9983y.m20315b(Long[].class)) ? true : AbstractC9979u.m20289b(interfaceC10469cM20315b, AbstractC9983y.m20315b(Float[].class)) ? true : AbstractC9979u.m20289b(interfaceC10469cM20315b, AbstractC9983y.m20315b(Double[].class)) ? true : AbstractC9979u.m20289b(interfaceC10469cM20315b, AbstractC9983y.m20315b(String[].class)))) {
                    if (AbstractC9979u.m20289b(interfaceC10469cM20315b, AbstractC9983y.m20315b(boolean[].class))) {
                        obj = Data_Kt.convertPrimitiveArray((boolean[]) obj);
                    } else if (AbstractC9979u.m20289b(interfaceC10469cM20315b, AbstractC9983y.m20315b(byte[].class))) {
                        obj = Data_Kt.convertPrimitiveArray((byte[]) obj);
                    } else if (AbstractC9979u.m20289b(interfaceC10469cM20315b, AbstractC9983y.m20315b(int[].class))) {
                        obj = Data_Kt.convertPrimitiveArray((int[]) obj);
                    } else if (AbstractC9979u.m20289b(interfaceC10469cM20315b, AbstractC9983y.m20315b(long[].class))) {
                        obj = Data_Kt.convertPrimitiveArray((long[]) obj);
                    } else if (AbstractC9979u.m20289b(interfaceC10469cM20315b, AbstractC9983y.m20315b(float[].class))) {
                        obj = Data_Kt.convertPrimitiveArray((float[]) obj);
                    } else {
                        if (!AbstractC9979u.m20289b(interfaceC10469cM20315b, AbstractC9983y.m20315b(double[].class))) {
                            throw new IllegalArgumentException("Key " + key + " has invalid type " + interfaceC10469cM20315b);
                        }
                        obj = Data_Kt.convertPrimitiveArray((double[]) obj);
                    }
                }
            }
            map.put(key, obj);
            return this;
        }

        public final Builder putAll(Data data) {
            AbstractC9979u.m20294g(data, "data");
            putAll(data.values);
            return this;
        }

        public final Builder putBoolean(String key, boolean z10) {
            AbstractC9979u.m20294g(key, "key");
            return putDirect(key, Boolean.valueOf(z10));
        }

        public final Builder putBooleanArray(String key, boolean[] value) {
            AbstractC9979u.m20294g(key, "key");
            AbstractC9979u.m20294g(value, "value");
            this.values.put(key, Data_Kt.convertPrimitiveArray(value));
            return this;
        }

        public final Builder putByte(String key, byte b10) {
            AbstractC9979u.m20294g(key, "key");
            return putDirect(key, Byte.valueOf(b10));
        }

        public final Builder putByteArray(String key, byte[] value) {
            AbstractC9979u.m20294g(key, "key");
            AbstractC9979u.m20294g(value, "value");
            this.values.put(key, Data_Kt.convertPrimitiveArray(value));
            return this;
        }

        public final Builder putDouble(String key, double d10) {
            AbstractC9979u.m20294g(key, "key");
            return putDirect(key, Double.valueOf(d10));
        }

        public final Builder putDoubleArray(String key, double[] value) {
            AbstractC9979u.m20294g(key, "key");
            AbstractC9979u.m20294g(value, "value");
            this.values.put(key, Data_Kt.convertPrimitiveArray(value));
            return this;
        }

        public final Builder putFloat(String key, float f10) {
            AbstractC9979u.m20294g(key, "key");
            return putDirect(key, Float.valueOf(f10));
        }

        public final Builder putFloatArray(String key, float[] value) {
            AbstractC9979u.m20294g(key, "key");
            AbstractC9979u.m20294g(value, "value");
            this.values.put(key, Data_Kt.convertPrimitiveArray(value));
            return this;
        }

        public final Builder putInt(String key, int i10) {
            AbstractC9979u.m20294g(key, "key");
            return putDirect(key, Integer.valueOf(i10));
        }

        public final Builder putIntArray(String key, int[] value) {
            AbstractC9979u.m20294g(key, "key");
            AbstractC9979u.m20294g(value, "value");
            this.values.put(key, Data_Kt.convertPrimitiveArray(value));
            return this;
        }

        public final Builder putLong(String key, long j10) {
            AbstractC9979u.m20294g(key, "key");
            return putDirect(key, Long.valueOf(j10));
        }

        public final Builder putLongArray(String key, long[] value) {
            AbstractC9979u.m20294g(key, "key");
            AbstractC9979u.m20294g(value, "value");
            this.values.put(key, Data_Kt.convertPrimitiveArray(value));
            return this;
        }

        public final Builder putString(String key, String str) {
            AbstractC9979u.m20294g(key, "key");
            return putDirect(key, str);
        }

        public final Builder putStringArray(String key, String[] value) {
            AbstractC9979u.m20294g(key, "key");
            AbstractC9979u.m20294g(value, "value");
            return putDirect(key, value);
        }

        public final Builder putAll(Map<String, ? extends Object> values) {
            AbstractC9979u.m20294g(values, "values");
            for (Map.Entry<String, ? extends Object> entry : values.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
            return this;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private static final boolean fromByteArray$isObjectStream(ByteArrayInputStream byteArrayInputStream) throws IOException {
            byte[] bArr = new byte[2];
            byteArrayInputStream.read(bArr);
            byte b10 = (byte) (-21267);
            boolean z10 = false;
            if (bArr[0] == ((byte) 16777132) && bArr[1] == b10) {
                z10 = true;
            }
            byteArrayInputStream.reset();
            return z10;
        }

        private static final void fromByteArray$readHeader(DataInputStream dataInputStream) throws IOException {
            short s10 = dataInputStream.readShort();
            if (s10 != -21521) {
                throw new IllegalStateException(("Magic number doesn't match: " + ((int) s10)).toString());
            }
            short s11 = dataInputStream.readShort();
            if (s11 == 1) {
                return;
            }
            throw new IllegalStateException(("Unsupported version number: " + ((int) s11)).toString());
        }

        private static final Object fromByteArray$readValue(DataInputStream dataInputStream, byte b10) throws IOException {
            if (b10 == 0) {
                return null;
            }
            if (b10 == 1) {
                return Boolean.valueOf(dataInputStream.readBoolean());
            }
            if (b10 == 2) {
                return Byte.valueOf(dataInputStream.readByte());
            }
            if (b10 == 3) {
                return Integer.valueOf(dataInputStream.readInt());
            }
            if (b10 == 4) {
                return Long.valueOf(dataInputStream.readLong());
            }
            if (b10 == 5) {
                return Float.valueOf(dataInputStream.readFloat());
            }
            if (b10 == 6) {
                return Double.valueOf(dataInputStream.readDouble());
            }
            if (b10 == 7) {
                return dataInputStream.readUTF();
            }
            int i10 = 0;
            if (b10 == 8) {
                int i11 = dataInputStream.readInt();
                Boolean[] boolArr = new Boolean[i11];
                while (i10 < i11) {
                    boolArr[i10] = Boolean.valueOf(dataInputStream.readBoolean());
                    i10++;
                }
                return boolArr;
            }
            if (b10 == 9) {
                int i12 = dataInputStream.readInt();
                Byte[] bArr = new Byte[i12];
                while (i10 < i12) {
                    bArr[i10] = Byte.valueOf(dataInputStream.readByte());
                    i10++;
                }
                return bArr;
            }
            if (b10 == 10) {
                int i13 = dataInputStream.readInt();
                Integer[] numArr = new Integer[i13];
                while (i10 < i13) {
                    numArr[i10] = Integer.valueOf(dataInputStream.readInt());
                    i10++;
                }
                return numArr;
            }
            if (b10 == 11) {
                int i14 = dataInputStream.readInt();
                Long[] lArr = new Long[i14];
                while (i10 < i14) {
                    lArr[i10] = Long.valueOf(dataInputStream.readLong());
                    i10++;
                }
                return lArr;
            }
            if (b10 == 12) {
                int i15 = dataInputStream.readInt();
                Float[] fArr = new Float[i15];
                while (i10 < i15) {
                    fArr[i10] = Float.valueOf(dataInputStream.readFloat());
                    i10++;
                }
                return fArr;
            }
            if (b10 == 13) {
                int i16 = dataInputStream.readInt();
                Double[] dArr = new Double[i16];
                while (i10 < i16) {
                    dArr[i10] = Double.valueOf(dataInputStream.readDouble());
                    i10++;
                }
                return dArr;
            }
            if (b10 != 14) {
                throw new IllegalStateException("Unsupported type " + ((int) b10));
            }
            int i17 = dataInputStream.readInt();
            String[] strArr = new String[i17];
            while (i10 < i17) {
                String utf = dataInputStream.readUTF();
                if (AbstractC9979u.m20289b(utf, Data.NULL_STRING_V1)) {
                    utf = null;
                }
                strArr[i10] = utf;
                i10++;
            }
            return strArr;
        }

        private static final void toByteArrayInternalV1$writeArray(DataOutputStream dataOutputStream, Object[] objArr) throws IOException {
            int i10;
            InterfaceC10469c interfaceC10469cM20315b = AbstractC9983y.m20315b(objArr.getClass());
            if (AbstractC9979u.m20289b(interfaceC10469cM20315b, AbstractC9983y.m20315b(Boolean[].class))) {
                i10 = 8;
            } else if (AbstractC9979u.m20289b(interfaceC10469cM20315b, AbstractC9983y.m20315b(Byte[].class))) {
                i10 = 9;
            } else if (AbstractC9979u.m20289b(interfaceC10469cM20315b, AbstractC9983y.m20315b(Integer[].class))) {
                i10 = 10;
            } else if (AbstractC9979u.m20289b(interfaceC10469cM20315b, AbstractC9983y.m20315b(Long[].class))) {
                i10 = 11;
            } else if (AbstractC9979u.m20289b(interfaceC10469cM20315b, AbstractC9983y.m20315b(Float[].class))) {
                i10 = 12;
            } else if (AbstractC9979u.m20289b(interfaceC10469cM20315b, AbstractC9983y.m20315b(Double[].class))) {
                i10 = 13;
            } else {
                if (!AbstractC9979u.m20289b(interfaceC10469cM20315b, AbstractC9983y.m20315b(String[].class))) {
                    throw new IllegalArgumentException("Unsupported value type " + AbstractC9983y.m20315b(objArr.getClass()).mo20276e());
                }
                i10 = 14;
            }
            dataOutputStream.writeByte(i10);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj : objArr) {
                if (i10 == 8) {
                    Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i10 == 9) {
                    Byte b10 = obj instanceof Byte ? (Byte) obj : null;
                    dataOutputStream.writeByte(b10 != null ? b10.byteValue() : (byte) 0);
                } else if (i10 == 10) {
                    Integer num = obj instanceof Integer ? (Integer) obj : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i10 == 11) {
                    Long l10 = obj instanceof Long ? (Long) obj : null;
                    dataOutputStream.writeLong(l10 != null ? l10.longValue() : 0L);
                } else if (i10 == 12) {
                    Float f10 = obj instanceof Float ? (Float) obj : null;
                    dataOutputStream.writeFloat(f10 != null ? f10.floatValue() : 0.0f);
                } else if (i10 == 13) {
                    Double d10 = obj instanceof Double ? (Double) obj : null;
                    dataOutputStream.writeDouble(d10 != null ? d10.doubleValue() : AudioStats.AUDIO_AMPLITUDE_NONE);
                } else if (i10 == 14) {
                    String str = obj instanceof String ? (String) obj : null;
                    if (str == null) {
                        str = Data.NULL_STRING_V1;
                    }
                    dataOutputStream.writeUTF(str);
                }
            }
        }

        private static final void toByteArrayInternalV1$writeEntry(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
            if (obj == null) {
                dataOutputStream.writeByte(0);
            } else if (obj instanceof Boolean) {
                dataOutputStream.writeByte(1);
                dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                dataOutputStream.writeByte(2);
                dataOutputStream.writeByte(((Number) obj).byteValue());
            } else if (obj instanceof Integer) {
                dataOutputStream.writeByte(3);
                dataOutputStream.writeInt(((Number) obj).intValue());
            } else if (obj instanceof Long) {
                dataOutputStream.writeByte(4);
                dataOutputStream.writeLong(((Number) obj).longValue());
            } else if (obj instanceof Float) {
                dataOutputStream.writeByte(5);
                dataOutputStream.writeFloat(((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                dataOutputStream.writeByte(6);
                dataOutputStream.writeDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                dataOutputStream.writeByte(7);
                dataOutputStream.writeUTF((String) obj);
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalArgumentException("Unsupported value type " + AbstractC9983y.m20315b(obj.getClass()).mo20277f());
                }
                toByteArrayInternalV1$writeArray(dataOutputStream, (Object[]) obj);
            }
            dataOutputStream.writeUTF(str);
        }

        private static final void toByteArrayInternalV1$writeHeader(DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeShort(-21521);
            dataOutputStream.writeShort(1);
        }

        @TypeConverter
        public final Data fromByteArray(byte[] bytes) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            AbstractC9979u.m20294g(bytes, "bytes");
            if (bytes.length > 10240) {
                throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
            }
            if (bytes.length == 0) {
                return Data.EMPTY;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
                int i10 = 0;
                if (fromByteArray$isObjectStream(byteArrayInputStream)) {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        int i11 = objectInputStream.readInt();
                        while (i10 < i11) {
                            String utf = objectInputStream.readUTF();
                            AbstractC9979u.m20293f(utf, "readUTF()");
                            linkedHashMap.put(utf, objectInputStream.readObject());
                            i10++;
                        }
                        AbstractC5423b.m2902a(objectInputStream, null);
                    } finally {
                    }
                } else {
                    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                    try {
                        fromByteArray$readHeader(dataInputStream);
                        int i12 = dataInputStream.readInt();
                        while (i10 < i12) {
                            Object objFromByteArray$readValue = fromByteArray$readValue(dataInputStream, dataInputStream.readByte());
                            String key = dataInputStream.readUTF();
                            AbstractC9979u.m20293f(key, "key");
                            linkedHashMap.put(key, objFromByteArray$readValue);
                            i10++;
                        }
                        AbstractC5423b.m2902a(dataInputStream, null);
                    } finally {
                    }
                }
            } catch (IOException e10) {
                Logger.get().error(Data_Kt.TAG, "Error in Data#fromByteArray: ", e10);
            } catch (ClassNotFoundException e11) {
                Logger.get().error(Data_Kt.TAG, "Error in Data#fromByteArray: ", e11);
            }
            return new Data(linkedHashMap);
        }

        @InterfaceC10770a
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final byte[] toByteArrayInternalV0(Data data) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            AbstractC9979u.m20294g(data, "data");
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream.writeInt(data.size());
                        for (Map.Entry entry : data.values.entrySet()) {
                            String str = (String) entry.getKey();
                            Object value = entry.getValue();
                            objectOutputStream.writeUTF(str);
                            objectOutputStream.writeObject(value);
                        }
                        C10786q c10786q = C10786q.f26013a;
                        AbstractC5423b.m2902a(objectOutputStream, null);
                        AbstractC5423b.m2902a(byteArrayOutputStream, null);
                        if (byteArrayOutputStream.size() > 10240) {
                            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        AbstractC9979u.m20293f(byteArray, "{\n                val st…ByteArray()\n            }");
                        return byteArray;
                    } finally {
                    }
                } finally {
                }
            } catch (IOException e10) {
                Logger.get().error(Data_Kt.TAG, "Error in Data#toByteArray: ", e10);
                return new byte[0];
            }
        }

        @TypeConverter
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final byte[] toByteArrayInternalV1(Data data) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            AbstractC9979u.m20294g(data, "data");
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    toByteArrayInternalV1$writeHeader(dataOutputStream);
                    dataOutputStream.writeInt(data.size());
                    for (Map.Entry entry : data.values.entrySet()) {
                        toByteArrayInternalV1$writeEntry(dataOutputStream, (String) entry.getKey(), entry.getValue());
                    }
                    dataOutputStream.flush();
                    if (dataOutputStream.size() > 10240) {
                        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    AbstractC5423b.m2902a(dataOutputStream, null);
                    AbstractC9979u.m20293f(byteArray, "{\n                ByteAr…          }\n            }");
                    return byteArray;
                } finally {
                }
            } catch (IOException e10) {
                Logger.get().error(Data_Kt.TAG, "Error in Data#toByteArray: ", e10);
                return new byte[0];
            }
        }

        private Companion() {
        }
    }

    public Data(Data other) {
        AbstractC9979u.m20294g(other, "other");
        this.values = new HashMap(other.values);
    }

    @TypeConverter
    public static final Data fromByteArray(byte[] bArr) {
        return Companion.fromByteArray(bArr);
    }

    private final /* synthetic */ <T> T getOrDefault(String str, T t10) {
        T t11 = (T) this.values.get(str);
        AbstractC9979u.m20300m(3, ExifInterface.GPS_DIRECTION_TRUE);
        return t11 != null ? t11 : t10;
    }

    private final /* synthetic */ <T, TArray> TArray getTypedArray(String str, InterfaceC9544p interfaceC9544p) {
        Object[] objArr;
        final Object obj = this.values.get(str);
        if (!(obj instanceof Object[]) || (objArr = (Object[]) obj) == null) {
            return null;
        }
        Integer numValueOf = Integer.valueOf(objArr.length);
        AbstractC9979u.m20299l();
        return (TArray) interfaceC9544p.invoke(numValueOf, new InterfaceC9540l() { // from class: androidx.work.Data.getTypedArray.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final T invoke(int i10) {
                T t10 = ((Object[]) obj)[i10];
                AbstractC9979u.m20300m(1, ExifInterface.GPS_DIRECTION_TRUE);
                return t10;
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                return invoke(((Number) obj2).intValue());
            }
        });
    }

    @InterfaceC10770a
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final byte[] toByteArrayInternalV0(Data data) {
        return Companion.toByteArrayInternalV0(data);
    }

    @TypeConverter
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final byte[] toByteArrayInternalV1(Data data) {
        return Companion.toByteArrayInternalV1(data);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L6a
            java.lang.Class<androidx.work.Data> r2 = androidx.work.Data.class
            java.lang.Class r3 = r8.getClass()
            boolean r2 = kotlin.jvm.internal.AbstractC9979u.m20289b(r2, r3)
            if (r2 != 0) goto L14
            goto L6a
        L14:
            androidx.work.Data r8 = (androidx.work.Data) r8
            java.util.Map<java.lang.String, java.lang.Object> r2 = r7.values
            java.util.Set r2 = r2.keySet()
            java.util.Map<java.lang.String, java.lang.Object> r3 = r8.values
            java.util.Set r3 = r3.keySet()
            boolean r3 = kotlin.jvm.internal.AbstractC9979u.m20289b(r2, r3)
            if (r3 != 0) goto L29
            return r1
        L29:
            java.util.Iterator r2 = r2.iterator()
        L2d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L69
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.util.Map<java.lang.String, java.lang.Object> r4 = r7.values
            java.lang.Object r4 = r4.get(r3)
            java.util.Map<java.lang.String, java.lang.Object> r5 = r8.values
            java.lang.Object r3 = r5.get(r3)
            if (r4 == 0) goto L61
            if (r3 != 0) goto L4a
            goto L61
        L4a:
            boolean r5 = r4 instanceof java.lang.Object[]
            if (r5 == 0) goto L5c
            r5 = r4
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            boolean r6 = r3 instanceof java.lang.Object[]
            if (r6 == 0) goto L5c
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            boolean r3 = p325rc.AbstractC10962o.m23983d(r5, r3)
            goto L66
        L5c:
            boolean r3 = kotlin.jvm.internal.AbstractC9979u.m20289b(r4, r3)
            goto L66
        L61:
            if (r4 != r3) goto L65
            r3 = r0
            goto L66
        L65:
            r3 = r1
        L66:
            if (r3 != 0) goto L2d
            return r1
        L69:
            return r0
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.Data.equals(java.lang.Object):boolean");
    }

    public final boolean getBoolean(String key, boolean z10) {
        AbstractC9979u.m20294g(key, "key");
        Object objValueOf = Boolean.valueOf(z10);
        Object obj = this.values.get(key);
        if (obj instanceof Boolean) {
            objValueOf = obj;
        }
        return ((Boolean) objValueOf).booleanValue();
    }

    public final boolean[] getBooleanArray(String key) {
        Object[] objArr;
        AbstractC9979u.m20294g(key, "key");
        final Object obj = this.values.get(key);
        if (!(obj instanceof Object[]) || (objArr = (Object[]) obj) == null) {
            return null;
        }
        int length = objArr.length;
        InterfaceC9540l interfaceC9540l = new InterfaceC9540l() { // from class: androidx.work.Data$getBooleanArray$$inlined$getTypedArray$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Boolean invoke(int i10) {
                Object obj2 = ((Object[]) obj)[i10];
                if (obj2 != null) {
                    return (Boolean) obj2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                return invoke(((Number) obj2).intValue());
            }
        };
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            zArr[i10] = ((Boolean) interfaceC9540l.invoke(Integer.valueOf(i10))).booleanValue();
        }
        return zArr;
    }

    public final byte getByte(String key, byte b10) {
        AbstractC9979u.m20294g(key, "key");
        Object objValueOf = Byte.valueOf(b10);
        Object obj = this.values.get(key);
        if (obj instanceof Byte) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).byteValue();
    }

    public final byte[] getByteArray(String key) {
        Object[] objArr;
        AbstractC9979u.m20294g(key, "key");
        final Object obj = this.values.get(key);
        if (!(obj instanceof Object[]) || (objArr = (Object[]) obj) == null) {
            return null;
        }
        int length = objArr.length;
        InterfaceC9540l interfaceC9540l = new InterfaceC9540l() { // from class: androidx.work.Data$getByteArray$$inlined$getTypedArray$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Byte invoke(int i10) {
                Object obj2 = ((Object[]) obj)[i10];
                if (obj2 != null) {
                    return (Byte) obj2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Byte");
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                return invoke(((Number) obj2).intValue());
            }
        };
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = ((Number) interfaceC9540l.invoke(Integer.valueOf(i10))).byteValue();
        }
        return bArr;
    }

    public final double getDouble(String key, double d10) {
        AbstractC9979u.m20294g(key, "key");
        Object objValueOf = Double.valueOf(d10);
        Object obj = this.values.get(key);
        if (obj instanceof Double) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).doubleValue();
    }

    public final double[] getDoubleArray(String key) {
        Object[] objArr;
        AbstractC9979u.m20294g(key, "key");
        final Object obj = this.values.get(key);
        if (!(obj instanceof Object[]) || (objArr = (Object[]) obj) == null) {
            return null;
        }
        int length = objArr.length;
        InterfaceC9540l interfaceC9540l = new InterfaceC9540l() { // from class: androidx.work.Data$getDoubleArray$$inlined$getTypedArray$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Double invoke(int i10) {
                Object obj2 = ((Object[]) obj)[i10];
                if (obj2 != null) {
                    return (Double) obj2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Double");
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                return invoke(((Number) obj2).intValue());
            }
        };
        double[] dArr = new double[length];
        for (int i10 = 0; i10 < length; i10++) {
            dArr[i10] = ((Number) interfaceC9540l.invoke(Integer.valueOf(i10))).doubleValue();
        }
        return dArr;
    }

    public final float getFloat(String key, float f10) {
        AbstractC9979u.m20294g(key, "key");
        Object objValueOf = Float.valueOf(f10);
        Object obj = this.values.get(key);
        if (obj instanceof Float) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).floatValue();
    }

    public final float[] getFloatArray(String key) {
        Object[] objArr;
        AbstractC9979u.m20294g(key, "key");
        final Object obj = this.values.get(key);
        if (!(obj instanceof Object[]) || (objArr = (Object[]) obj) == null) {
            return null;
        }
        int length = objArr.length;
        InterfaceC9540l interfaceC9540l = new InterfaceC9540l() { // from class: androidx.work.Data$getFloatArray$$inlined$getTypedArray$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Float invoke(int i10) {
                Object obj2 = ((Object[]) obj)[i10];
                if (obj2 != null) {
                    return (Float) obj2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                return invoke(((Number) obj2).intValue());
            }
        };
        float[] fArr = new float[length];
        for (int i10 = 0; i10 < length; i10++) {
            fArr[i10] = ((Number) interfaceC9540l.invoke(Integer.valueOf(i10))).floatValue();
        }
        return fArr;
    }

    public final int getInt(String key, int i10) {
        AbstractC9979u.m20294g(key, "key");
        Object objValueOf = Integer.valueOf(i10);
        Object obj = this.values.get(key);
        if (obj instanceof Integer) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).intValue();
    }

    public final int[] getIntArray(String key) {
        Object[] objArr;
        AbstractC9979u.m20294g(key, "key");
        final Object obj = this.values.get(key);
        if (!(obj instanceof Object[]) || (objArr = (Object[]) obj) == null) {
            return null;
        }
        int length = objArr.length;
        InterfaceC9540l interfaceC9540l = new InterfaceC9540l() { // from class: androidx.work.Data$getIntArray$$inlined$getTypedArray$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Integer invoke(int i10) {
                Object obj2 = ((Object[]) obj)[i10];
                if (obj2 != null) {
                    return (Integer) obj2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                return invoke(((Number) obj2).intValue());
            }
        };
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = ((Number) interfaceC9540l.invoke(Integer.valueOf(i10))).intValue();
        }
        return iArr;
    }

    public final Map<String, Object> getKeyValueMap() {
        Map<String, Object> mapUnmodifiableMap = Collections.unmodifiableMap(this.values);
        AbstractC9979u.m20293f(mapUnmodifiableMap, "unmodifiableMap(values)");
        return mapUnmodifiableMap;
    }

    public final long getLong(String key, long j10) {
        AbstractC9979u.m20294g(key, "key");
        Object objValueOf = Long.valueOf(j10);
        Object obj = this.values.get(key);
        if (obj instanceof Long) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).longValue();
    }

    public final long[] getLongArray(String key) {
        Object[] objArr;
        AbstractC9979u.m20294g(key, "key");
        final Object obj = this.values.get(key);
        if (!(obj instanceof Object[]) || (objArr = (Object[]) obj) == null) {
            return null;
        }
        int length = objArr.length;
        InterfaceC9540l interfaceC9540l = new InterfaceC9540l() { // from class: androidx.work.Data$getLongArray$$inlined$getTypedArray$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Long invoke(int i10) {
                Object obj2 = ((Object[]) obj)[i10];
                if (obj2 != null) {
                    return (Long) obj2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                return invoke(((Number) obj2).intValue());
            }
        };
        long[] jArr = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            jArr[i10] = ((Number) interfaceC9540l.invoke(Integer.valueOf(i10))).longValue();
        }
        return jArr;
    }

    public final String getString(String key) {
        AbstractC9979u.m20294g(key, "key");
        Object obj = this.values.get(key);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String[] getStringArray(String key) {
        Object[] objArr;
        AbstractC9979u.m20294g(key, "key");
        final Object obj = this.values.get(key);
        if (!(obj instanceof Object[]) || (objArr = (Object[]) obj) == null) {
            return null;
        }
        int length = objArr.length;
        InterfaceC9540l interfaceC9540l = new InterfaceC9540l() { // from class: androidx.work.Data$getStringArray$$inlined$getTypedArray$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final String invoke(int i10) {
                Object obj2 = ((Object[]) obj)[i10];
                if (obj2 != null) {
                    return (String) obj2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                return invoke(((Number) obj2).intValue());
            }
        };
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = interfaceC9540l.invoke(Integer.valueOf(i10));
        }
        return strArr;
    }

    public final /* synthetic */ <T> boolean hasKey$work_runtime_release(String key) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20300m(4, ExifInterface.GPS_DIRECTION_TRUE);
        return hasKeyWithValueOfType(key, Object.class);
    }

    public final <T> boolean hasKeyWithValueOfType(String key, Class<T> klass) {
        AbstractC9979u.m20294g(key, "key");
        AbstractC9979u.m20294g(klass, "klass");
        Object obj = this.values.get(key);
        return obj != null && klass.isAssignableFrom(obj.getClass());
    }

    public int hashCode() {
        int iHashCode = 0;
        for (Map.Entry<String, Object> entry : this.values.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ AbstractC10960n.m23981b((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public final int size() {
        return this.values.size();
    }

    public final byte[] toByteArray() {
        return Companion.toByteArrayInternalV1(this);
    }

    public String toString() {
        String str = "Data {" + AbstractC10947g0.m23954w0(this.values.entrySet(), null, null, null, 0, null, new InterfaceC9540l() { // from class: androidx.work.Data$toString$1$content$1
            @Override // p181hd.InterfaceC9540l
            public final CharSequence invoke(Map.Entry<String, ? extends Object> entry) {
                AbstractC9979u.m20294g(entry, "<name for destructuring parameter 0>");
                String key = entry.getKey();
                Object value = entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(key);
                sb2.append(" : ");
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                    AbstractC9979u.m20293f(value, "toString(this)");
                }
                sb2.append(value);
                return sb2.toString();
            }
        }, 31, null) + "}";
        AbstractC9979u.m20293f(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    public Data(Map<String, ?> values) {
        AbstractC9979u.m20294g(values, "values");
        this.values = new HashMap(values);
    }
}
