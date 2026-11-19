package androidx.navigation.serialization;

import android.support.v4.media.AbstractC0037f;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavType;
import androidx.navigation.serialization.InternalAndroidNavType;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import kotlin.text.AbstractC5862w;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import p101k7.C5769k;
import p101k7.InterfaceC5765g;

@Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0017\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006*\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m5110d2 = {"Lk7/g;", "Landroidx/navigation/NavType;", "parseEnum", "(Lk7/g;)Landroidx/navigation/NavType;", "parseNullableEnum", "parseEnumList", "Ljava/lang/Class;", "getClass", "(Lk7/g;)Ljava/lang/Class;", "navigation-common_release"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class NavTypeConverter_androidKt {
    private static final Class<?> getClass(InterfaceC5765g interfaceC5765g) {
        String strM5407A = AbstractC5862w.m5407A(interfaceC5765g.mo5105h(), "?", "");
        try {
            return Class.forName(strM5407A);
        } catch (ClassNotFoundException unused) {
            if (AbstractC5855p.m5372F(strM5407A, ".", false)) {
                return Class.forName(new Regex("(\\.+)(?!.*\\.)").replace(strM5407A, "\\$"));
            }
            String strM74C = "Cannot find class with name \"" + interfaceC5765g.mo5105h() + "\". Ensure that the serialName for this argument is the default fully qualified name";
            if (interfaceC5765g.getKind() instanceof C5769k) {
                strM74C = AbstractC0037f.m74C(strM74C, ".\nIf the build is minified, try annotating the Enum class with \"androidx.annotation.Keep\" to ensure the Enum is not removed.");
            }
            throw new IllegalArgumentException(strM74C);
        }
    }

    @NotNull
    public static final NavType<?> parseEnum(@NotNull InterfaceC5765g interfaceC5765g) {
        AbstractC5830k.m5330g(interfaceC5765g, "<this>");
        NavType<?> serializableOrParcelableType$navigation_common_release = NavType.INSTANCE.parseSerializableOrParcelableType$navigation_common_release(getClass(interfaceC5765g), false);
        return serializableOrParcelableType$navigation_common_release == null ? UNKNOWN.INSTANCE : serializableOrParcelableType$navigation_common_release;
    }

    @NotNull
    public static final NavType<?> parseEnumList(@NotNull InterfaceC5765g interfaceC5765g) {
        AbstractC5830k.m5330g(interfaceC5765g, "<this>");
        Class<?> cls = getClass(interfaceC5765g.mo5104g(0));
        AbstractC5830k.m5328e(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Enum<*>>");
        return new InternalAndroidNavType.EnumListType(cls);
    }

    @NotNull
    public static final NavType<?> parseNullableEnum(@NotNull InterfaceC5765g interfaceC5765g) {
        AbstractC5830k.m5330g(interfaceC5765g, "<this>");
        Class<?> cls = getClass(interfaceC5765g);
        if (!Enum.class.isAssignableFrom(cls)) {
            return UNKNOWN.INSTANCE;
        }
        AbstractC5830k.m5328e(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Enum<*>?>");
        return new InternalAndroidNavType.EnumNullableType(cls);
    }
}
