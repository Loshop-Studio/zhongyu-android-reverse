package androidx.navigation.serialization;

import androidx.navigation.NavType;
import ee.AbstractC9137n;
import ee.InterfaceC9129f;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.AbstractC5447q;
import p049ce.InterfaceC5432b;
import p280od.InterfaceC10481o;
import p310qd.AbstractC10819z;

/* loaded from: classes.dex */
public final class NavTypeConverterKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InternalType.values().length];
            try {
                iArr[InternalType.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InternalType.STRING_NULLABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InternalType.INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InternalType.BOOL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InternalType.DOUBLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InternalType.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[InternalType.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[InternalType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[InternalType.INT_NULLABLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[InternalType.BOOL_NULLABLE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[InternalType.DOUBLE_NULLABLE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[InternalType.FLOAT_NULLABLE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[InternalType.LONG_NULLABLE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[InternalType.INT_ARRAY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[InternalType.BOOL_ARRAY.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[InternalType.DOUBLE_ARRAY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[InternalType.FLOAT_ARRAY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[InternalType.LONG_ARRAY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[InternalType.ARRAY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[InternalType.LIST.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[InternalType.ENUM_NULLABLE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final NavType<?> getNavType(InterfaceC9129f interfaceC9129f) {
        AbstractC9979u.m20294g(interfaceC9129f, "<this>");
        InternalType internalType = toInternalType(interfaceC9129f);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        switch (iArr[internalType.ordinal()]) {
            case 1:
                return InternalNavType.INSTANCE.getStringNonNullableType();
            case 2:
                return NavType.StringType;
            case 3:
                return NavType.IntType;
            case 4:
                return NavType.BoolType;
            case 5:
                return InternalNavType.INSTANCE.getDoubleType();
            case 6:
                return NavType.FloatType;
            case 7:
                return NavType.LongType;
            case 8:
                return NavTypeConverter_androidKt.parseEnum(interfaceC9129f);
            case 9:
                return InternalNavType.INSTANCE.getIntNullableType();
            case 10:
                return InternalNavType.INSTANCE.getBoolNullableType();
            case 11:
                return InternalNavType.INSTANCE.getDoubleNullableType();
            case 12:
                return InternalNavType.INSTANCE.getFloatNullableType();
            case 13:
                return InternalNavType.INSTANCE.getLongNullableType();
            case 14:
                return NavType.IntArrayType;
            case 15:
                return NavType.BoolArrayType;
            case 16:
                return InternalNavType.INSTANCE.getDoubleArrayType();
            case 17:
                return NavType.FloatArrayType;
            case 18:
                return NavType.LongArrayType;
            case 19:
                int i10 = iArr[toInternalType(interfaceC9129f.mo17960e(0)).ordinal()];
                return i10 != 1 ? i10 != 2 ? UNKNOWN.INSTANCE : InternalNavType.INSTANCE.getStringNullableArrayType() : NavType.StringArrayType;
            case 20:
                switch (iArr[toInternalType(interfaceC9129f.mo17960e(0)).ordinal()]) {
                    case 1:
                        return NavType.StringListType;
                    case 2:
                        return InternalNavType.INSTANCE.getStringNullableListType();
                    case 3:
                        return NavType.IntListType;
                    case 4:
                        return NavType.BoolListType;
                    case 5:
                        return InternalNavType.INSTANCE.getDoubleListType();
                    case 6:
                        return NavType.FloatListType;
                    case 7:
                        return NavType.LongListType;
                    case 8:
                        return NavTypeConverter_androidKt.parseEnumList(interfaceC9129f);
                    default:
                        return UNKNOWN.INSTANCE;
                }
            case 21:
                return NavTypeConverter_androidKt.parseNullableEnum(interfaceC9129f);
            default:
                return UNKNOWN.INSTANCE;
        }
    }

    public static final boolean matchKType(InterfaceC9129f interfaceC9129f, InterfaceC10481o kType) {
        AbstractC9979u.m20294g(interfaceC9129f, "<this>");
        AbstractC9979u.m20294g(kType, "kType");
        if (interfaceC9129f.mo17957b() != kType.mo18565a()) {
            return false;
        }
        InterfaceC5432b interfaceC5432bM2957g = AbstractC5447q.m2957g(kType);
        if (interfaceC5432bM2957g != null) {
            return AbstractC9979u.m20289b(interfaceC9129f, interfaceC5432bM2957g.getDescriptor());
        }
        throw new IllegalStateException(("Cannot find KSerializer for [" + interfaceC9129f.mo17961f() + "]. If applicable, custom KSerializers for custom and third-party KType is currently not supported when declared directly on a class field via @Serializable(with = ...). Please use @Serializable or @Serializable(with = ...) on the class or object declaration.").toString());
    }

    private static final InternalType toInternalType(InterfaceC9129f interfaceC9129f) {
        String strM23238K = AbstractC10819z.m23238K(interfaceC9129f.mo17961f(), "?", "", false, 4, null);
        return AbstractC9979u.m20289b(interfaceC9129f.getKind(), AbstractC9137n.b.f21331a) ? interfaceC9129f.mo17957b() ? InternalType.ENUM_NULLABLE : InternalType.ENUM : AbstractC9979u.m20289b(strM23238K, "kotlin.Int") ? interfaceC9129f.mo17957b() ? InternalType.INT_NULLABLE : InternalType.INT : AbstractC9979u.m20289b(strM23238K, "kotlin.Boolean") ? interfaceC9129f.mo17957b() ? InternalType.BOOL_NULLABLE : InternalType.BOOL : AbstractC9979u.m20289b(strM23238K, "kotlin.Double") ? interfaceC9129f.mo17957b() ? InternalType.DOUBLE_NULLABLE : InternalType.DOUBLE : AbstractC9979u.m20289b(strM23238K, "kotlin.Float") ? interfaceC9129f.mo17957b() ? InternalType.FLOAT_NULLABLE : InternalType.FLOAT : AbstractC9979u.m20289b(strM23238K, "kotlin.Long") ? interfaceC9129f.mo17957b() ? InternalType.LONG_NULLABLE : InternalType.LONG : AbstractC9979u.m20289b(strM23238K, "kotlin.String") ? interfaceC9129f.mo17957b() ? InternalType.STRING_NULLABLE : InternalType.STRING : AbstractC9979u.m20289b(strM23238K, "kotlin.IntArray") ? InternalType.INT_ARRAY : AbstractC9979u.m20289b(strM23238K, "kotlin.DoubleArray") ? InternalType.DOUBLE_ARRAY : AbstractC9979u.m20289b(strM23238K, "kotlin.BooleanArray") ? InternalType.BOOL_ARRAY : AbstractC9979u.m20289b(strM23238K, "kotlin.FloatArray") ? InternalType.FLOAT_ARRAY : AbstractC9979u.m20289b(strM23238K, "kotlin.LongArray") ? InternalType.LONG_ARRAY : AbstractC9979u.m20289b(strM23238K, "kotlin.Array") ? InternalType.ARRAY : AbstractC10819z.m23242O(strM23238K, "kotlin.collections.ArrayList", false, 2, null) ? InternalType.LIST : InternalType.UNKNOWN;
    }
}
