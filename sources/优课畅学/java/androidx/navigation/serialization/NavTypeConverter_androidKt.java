package androidx.navigation.serialization;

import androidx.navigation.NavType;
import androidx.navigation.serialization.InternalAndroidNavType;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.text.Regex;
import p113g8.AbstractC8661c0;
import p113g8.AbstractC8687z;
import p268u8.AbstractC10218n;
import p268u8.InterfaceC10210f;

/* loaded from: classes3.dex */
public final class NavTypeConverter_androidKt {
    private static final Class<?> getClass(InterfaceC10210f interfaceC10210f) throws ClassNotFoundException {
        String strM14101I = AbstractC8687z.m14101I(interfaceC10210f.mo19089f(), "?", "", false, 4, null);
        try {
            Class<?> cls = Class.forName(strM14101I);
            AbstractC9133u.m16132f(cls, "forName(...)");
            return cls;
        } catch (ClassNotFoundException unused) {
            if (AbstractC8661c0.m13973S(strM14101I, ".", false, 2, null)) {
                Class<?> cls2 = Class.forName(new Regex("(\\.+)(?!.*\\.)").m16182i(strM14101I, "\\$"));
                AbstractC9133u.m16132f(cls2, "forName(...)");
                return cls2;
            }
            String str = "Cannot find class with name \"" + interfaceC10210f.mo19089f() + "\". Ensure that the serialName for this argument is the default fully qualified name";
            if (interfaceC10210f.getKind() instanceof AbstractC10218n.b) {
                str = str + ".\nIf the build is minified, try annotating the Enum class with \"androidx.annotation.Keep\" to ensure the Enum is not removed.";
            }
            throw new IllegalArgumentException(str);
        }
    }

    public static final NavType<?> parseEnum(InterfaceC10210f interfaceC10210f) {
        AbstractC9133u.m16133g(interfaceC10210f, "<this>");
        NavType<?> serializableOrParcelableType$navigation_common_release = NavType.Companion.parseSerializableOrParcelableType$navigation_common_release(getClass(interfaceC10210f), false);
        return serializableOrParcelableType$navigation_common_release == null ? UNKNOWN.INSTANCE : serializableOrParcelableType$navigation_common_release;
    }

    public static final NavType<?> parseEnumList(InterfaceC10210f interfaceC10210f) throws ClassNotFoundException {
        AbstractC9133u.m16133g(interfaceC10210f, "<this>");
        Class<?> cls = getClass(interfaceC10210f.mo19088e(0));
        AbstractC9133u.m16131e(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Enum<*>>");
        return new InternalAndroidNavType.EnumListType(cls);
    }

    public static final NavType<?> parseNullableEnum(InterfaceC10210f interfaceC10210f) throws ClassNotFoundException {
        AbstractC9133u.m16133g(interfaceC10210f, "<this>");
        Class<?> cls = getClass(interfaceC10210f);
        if (!Enum.class.isAssignableFrom(cls)) {
            return UNKNOWN.INSTANCE;
        }
        AbstractC9133u.m16131e(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Enum<*>?>");
        return new InternalAndroidNavType.EnumNullableType(cls);
    }
}
