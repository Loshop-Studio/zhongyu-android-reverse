package androidx.navigation.serialization;

import androidx.navigation.NavType;
import kotlin.jvm.internal.AbstractC9133u;
import p089e8.InterfaceC8387o;
import p113g8.AbstractC8687z;
import p246s8.AbstractC10067q;
import p246s8.InterfaceC10052b;
import p268u8.AbstractC10218n;
import p268u8.InterfaceC10210f;

/* loaded from: classes3.dex */
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

    public static final NavType<?> getNavType(InterfaceC10210f interfaceC10210f) {
        AbstractC9133u.m16133g(interfaceC10210f, "<this>");
        InternalType internalType = toInternalType(interfaceC10210f);
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
                return NavTypeConverter_androidKt.parseEnum(interfaceC10210f);
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
                int i10 = iArr[toInternalType(interfaceC10210f.mo19088e(0)).ordinal()];
                return i10 != 1 ? i10 != 2 ? UNKNOWN.INSTANCE : InternalNavType.INSTANCE.getStringNullableArrayType() : NavType.StringArrayType;
            case 20:
                switch (iArr[toInternalType(interfaceC10210f.mo19088e(0)).ordinal()]) {
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
                        return NavTypeConverter_androidKt.parseEnumList(interfaceC10210f);
                    default:
                        return UNKNOWN.INSTANCE;
                }
            case 21:
                return NavTypeConverter_androidKt.parseNullableEnum(interfaceC10210f);
            default:
                return UNKNOWN.INSTANCE;
        }
    }

    public static final boolean matchKType(InterfaceC10210f interfaceC10210f, InterfaceC8387o kType) {
        AbstractC9133u.m16133g(interfaceC10210f, "<this>");
        AbstractC9133u.m16133g(kType, "kType");
        if (interfaceC10210f.mo19085b() != kType.mo13675a()) {
            return false;
        }
        InterfaceC10052b interfaceC10052bM18782f = AbstractC10067q.m18782f(kType);
        if (interfaceC10052bM18782f != null) {
            return AbstractC9133u.m16128b(interfaceC10210f, interfaceC10052bM18782f.getDescriptor());
        }
        throw new IllegalStateException(("Cannot find KSerializer for [" + interfaceC10210f.mo19089f() + "]. If applicable, custom KSerializers for custom and third-party KType is currently not supported when declared directly on a class field via @Serializable(with = ...). Please use @Serializable or @Serializable(with = ...) on the class or object declaration.").toString());
    }

    private static final InternalType toInternalType(InterfaceC10210f interfaceC10210f) {
        String strM14101I = AbstractC8687z.m14101I(interfaceC10210f.mo19089f(), "?", "", false, 4, null);
        return AbstractC9133u.m16128b(interfaceC10210f.getKind(), AbstractC10218n.b.f20392a) ? interfaceC10210f.mo19085b() ? InternalType.ENUM_NULLABLE : InternalType.ENUM : AbstractC9133u.m16128b(strM14101I, "kotlin.Int") ? interfaceC10210f.mo19085b() ? InternalType.INT_NULLABLE : InternalType.INT : AbstractC9133u.m16128b(strM14101I, "kotlin.Boolean") ? interfaceC10210f.mo19085b() ? InternalType.BOOL_NULLABLE : InternalType.BOOL : AbstractC9133u.m16128b(strM14101I, "kotlin.Double") ? interfaceC10210f.mo19085b() ? InternalType.DOUBLE_NULLABLE : InternalType.DOUBLE : AbstractC9133u.m16128b(strM14101I, "kotlin.Float") ? interfaceC10210f.mo19085b() ? InternalType.FLOAT_NULLABLE : InternalType.FLOAT : AbstractC9133u.m16128b(strM14101I, "kotlin.Long") ? interfaceC10210f.mo19085b() ? InternalType.LONG_NULLABLE : InternalType.LONG : AbstractC9133u.m16128b(strM14101I, "kotlin.String") ? interfaceC10210f.mo19085b() ? InternalType.STRING_NULLABLE : InternalType.STRING : AbstractC9133u.m16128b(strM14101I, "kotlin.IntArray") ? InternalType.INT_ARRAY : AbstractC9133u.m16128b(strM14101I, "kotlin.DoubleArray") ? InternalType.DOUBLE_ARRAY : AbstractC9133u.m16128b(strM14101I, "kotlin.BooleanArray") ? InternalType.BOOL_ARRAY : AbstractC9133u.m16128b(strM14101I, "kotlin.FloatArray") ? InternalType.FLOAT_ARRAY : AbstractC9133u.m16128b(strM14101I, "kotlin.LongArray") ? InternalType.LONG_ARRAY : AbstractC9133u.m16128b(strM14101I, "kotlin.Array") ? InternalType.ARRAY : AbstractC8687z.m14105M(strM14101I, "kotlin.collections.ArrayList", false, 2, null) ? InternalType.LIST : InternalType.UNKNOWN;
    }
}
