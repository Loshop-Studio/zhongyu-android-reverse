package androidx.navigation.serialization;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavType;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5862w;
import org.jetbrains.annotations.NotNull;
import p000a.AbstractC0000a;
import p084i7.InterfaceC5686b;
import p101k7.C5769k;
import p101k7.InterfaceC5765g;
import p133o7.AbstractC6283g;
import p133o7.C6280d;
import p207y6.InterfaceC6793q;

@Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m5110d2 = {"Lk7/g;", "Landroidx/navigation/NavType;", "getNavType", "(Lk7/g;)Landroidx/navigation/NavType;", "Landroidx/navigation/serialization/InternalType;", "toInternalType", "(Lk7/g;)Landroidx/navigation/serialization/InternalType;", "Ly6/q;", "kType", "", "matchKType", "(Lk7/g;Ly6/q;)Z", "navigation-common_release"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class NavTypeConverterKt {

    @Metadata(m5111k = 3, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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

    @NotNull
    public static final NavType<?> getNavType(@NotNull InterfaceC5765g interfaceC5765g) {
        AbstractC5830k.m5330g(interfaceC5765g, "<this>");
        InternalType internalType = toInternalType(interfaceC5765g);
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
                return NavTypeConverter_androidKt.parseEnum(interfaceC5765g);
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
                int i = iArr[toInternalType(interfaceC5765g.mo5104g(0)).ordinal()];
                return i != 1 ? i != 2 ? UNKNOWN.INSTANCE : InternalNavType.INSTANCE.getStringNullableArrayType() : NavType.StringArrayType;
            case 20:
                switch (iArr[toInternalType(interfaceC5765g.mo5104g(0)).ordinal()]) {
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
                        return NavTypeConverter_androidKt.parseEnumList(interfaceC5765g);
                    default:
                        return UNKNOWN.INSTANCE;
                }
            case 21:
                return NavTypeConverter_androidKt.parseNullableEnum(interfaceC5765g);
            default:
                return UNKNOWN.INSTANCE;
        }
    }

    public static final boolean matchKType(@NotNull InterfaceC5765g interfaceC5765g, @NotNull InterfaceC6793q kType) {
        AbstractC5830k.m5330g(interfaceC5765g, "<this>");
        AbstractC5830k.m5330g(kType, "kType");
        if (interfaceC5765g.mo5099b() != kType.mo5360a()) {
            return false;
        }
        C6280d c6280d = AbstractC6283g.f10039a;
        AbstractC5830k.m5330g(c6280d, "<this>");
        InterfaceC5686b interfaceC5686bM12o = AbstractC0000a.m12o(c6280d, kType, false);
        if (interfaceC5686bM12o != null) {
            return interfaceC5765g.equals(interfaceC5686bM12o.getDescriptor());
        }
        throw new IllegalStateException(("Cannot find KSerializer for [" + interfaceC5765g.mo5105h() + "]. If applicable, custom KSerializers for custom and third-party KType is currently not supported when declared directly on a class field via @Serializable(with = ...). Please use @Serializable or @Serializable(with = ...) on the class or object declaration.").toString());
    }

    private static final InternalType toInternalType(InterfaceC5765g interfaceC5765g) {
        String strM5407A = AbstractC5862w.m5407A(interfaceC5765g.mo5105h(), "?", "");
        return AbstractC5830k.m5325b(interfaceC5765g.getKind(), C5769k.f9145b) ? interfaceC5765g.mo5099b() ? InternalType.ENUM_NULLABLE : InternalType.ENUM : strM5407A.equals("kotlin.Int") ? interfaceC5765g.mo5099b() ? InternalType.INT_NULLABLE : InternalType.INT : strM5407A.equals("kotlin.Boolean") ? interfaceC5765g.mo5099b() ? InternalType.BOOL_NULLABLE : InternalType.BOOL : strM5407A.equals("kotlin.Double") ? interfaceC5765g.mo5099b() ? InternalType.DOUBLE_NULLABLE : InternalType.DOUBLE : strM5407A.equals("kotlin.Float") ? interfaceC5765g.mo5099b() ? InternalType.FLOAT_NULLABLE : InternalType.FLOAT : strM5407A.equals("kotlin.Long") ? interfaceC5765g.mo5099b() ? InternalType.LONG_NULLABLE : InternalType.LONG : strM5407A.equals("kotlin.String") ? interfaceC5765g.mo5099b() ? InternalType.STRING_NULLABLE : InternalType.STRING : strM5407A.equals("kotlin.IntArray") ? InternalType.INT_ARRAY : strM5407A.equals("kotlin.DoubleArray") ? InternalType.DOUBLE_ARRAY : strM5407A.equals("kotlin.BooleanArray") ? InternalType.BOOL_ARRAY : strM5407A.equals("kotlin.FloatArray") ? InternalType.FLOAT_ARRAY : strM5407A.equals("kotlin.LongArray") ? InternalType.LONG_ARRAY : strM5407A.equals("kotlin.Array") ? InternalType.ARRAY : AbstractC5862w.m5409C(strM5407A, "kotlin.collections.ArrayList", false) ? InternalType.LIST : InternalType.UNKNOWN;
    }
}
