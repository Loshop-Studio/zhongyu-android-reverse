package org.tensorflow.lite;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* loaded from: classes6.dex */
public enum DataType {
    FLOAT32(1),
    INT32(2),
    UINT8(3),
    INT64(4),
    STRING(5),
    BOOL(6),
    INT8(9);


    /* renamed from: k */
    public static final DataType[] f25525k = values();

    /* renamed from: c */
    public final int f25527c;

    /* renamed from: org.tensorflow.lite.DataType$a */
    public static /* synthetic */ class C10585a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25528a;

        static {
            int[] iArr = new int[DataType.values().length];
            f25528a = iArr;
            try {
                iArr[DataType.FLOAT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25528a[DataType.INT32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25528a[DataType.INT8.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25528a[DataType.UINT8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25528a[DataType.INT64.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f25528a[DataType.BOOL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f25528a[DataType.STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    DataType(int i10) {
        this.f25527c = i10;
    }

    /* renamed from: c */
    public static DataType m22369c(int i10) {
        for (DataType dataType : f25525k) {
            if (dataType.f25527c == i10) {
                return dataType;
            }
        }
        throw new IllegalArgumentException("DataType error: DataType " + i10 + " is not recognized in Java (version " + TensorFlowLite.m22401b() + ")");
    }

    /* renamed from: a */
    public int m22370a() {
        switch (C10585a.f25528a[ordinal()]) {
            case 1:
            case 2:
                return 4;
            case 3:
            case 4:
                return 1;
            case 5:
                return 8;
            case 6:
            case 7:
                return -1;
            default:
                throw new IllegalArgumentException("DataType error: DataType " + this + " is not supported yet");
        }
    }

    /* renamed from: d */
    public String m22371d() {
        switch (C10585a.f25528a[ordinal()]) {
            case 1:
                return TypedValues.Custom.S_FLOAT;
            case 2:
                return "int";
            case 3:
            case 4:
                return "byte";
            case 5:
                return "long";
            case 6:
                return "bool";
            case 7:
                return TypedValues.Custom.S_STRING;
            default:
                throw new IllegalArgumentException("DataType error: DataType " + this + " is not supported yet");
        }
    }
}
