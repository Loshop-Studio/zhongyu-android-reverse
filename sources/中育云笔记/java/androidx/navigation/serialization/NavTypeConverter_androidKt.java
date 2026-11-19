package androidx.navigation.serialization;

import androidx.navigation.NavType;
import androidx.navigation.serialization.InternalAndroidNavType;
import com.alibaba.android.arouter.utils.Consts;
import ee.AbstractC9137n;
import ee.InterfaceC9129f;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.text.Regex;
import p310qd.AbstractC10793c0;
import p310qd.AbstractC10819z;

/* loaded from: classes.dex */
public final class NavTypeConverter_androidKt {
    private static final Class<?> getClass(InterfaceC9129f interfaceC9129f) throws ClassNotFoundException {
        String strM23238K = AbstractC10819z.m23238K(interfaceC9129f.mo17961f(), "?", "", false, 4, null);
        try {
            Class<?> cls = Class.forName(strM23238K);
            AbstractC9979u.m20293f(cls, "forName(...)");
            return cls;
        } catch (ClassNotFoundException unused) {
            if (AbstractC10793c0.m23108U(strM23238K, Consts.DOT, false, 2, null)) {
                Class<?> cls2 = Class.forName(new Regex("(\\.+)(?!.*\\.)").m20343m(strM23238K, "\\$"));
                AbstractC9979u.m20293f(cls2, "forName(...)");
                return cls2;
            }
            String str = "Cannot find class with name \"" + interfaceC9129f.mo17961f() + "\". Ensure that the serialName for this argument is the default fully qualified name";
            if (interfaceC9129f.getKind() instanceof AbstractC9137n.b) {
                str = str + ".\nIf the build is minified, try annotating the Enum class with \"androidx.annotation.Keep\" to ensure the Enum is not removed.";
            }
            throw new IllegalArgumentException(str);
        }
    }

    public static final NavType<?> parseEnum(InterfaceC9129f interfaceC9129f) {
        AbstractC9979u.m20294g(interfaceC9129f, "<this>");
        NavType<?> serializableOrParcelableType$navigation_common_release = NavType.Companion.parseSerializableOrParcelableType$navigation_common_release(getClass(interfaceC9129f), false);
        return serializableOrParcelableType$navigation_common_release == null ? UNKNOWN.INSTANCE : serializableOrParcelableType$navigation_common_release;
    }

    public static final NavType<?> parseEnumList(InterfaceC9129f interfaceC9129f) throws ClassNotFoundException {
        AbstractC9979u.m20294g(interfaceC9129f, "<this>");
        Class<?> cls = getClass(interfaceC9129f.mo17960e(0));
        AbstractC9979u.m20292e(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Enum<*>>");
        return new InternalAndroidNavType.EnumListType(cls);
    }

    public static final NavType<?> parseNullableEnum(InterfaceC9129f interfaceC9129f) throws ClassNotFoundException {
        AbstractC9979u.m20294g(interfaceC9129f, "<this>");
        Class<?> cls = getClass(interfaceC9129f);
        if (!Enum.class.isAssignableFrom(cls)) {
            return UNKNOWN.INSTANCE;
        }
        AbstractC9979u.m20292e(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Enum<*>?>");
        return new InternalAndroidNavType.EnumNullableType(cls);
    }
}
