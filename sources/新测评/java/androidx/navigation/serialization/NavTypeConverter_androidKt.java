package androidx.navigation.serialization;

import androidx.navigation.NavType;
import androidx.navigation.serialization.InternalAndroidNavType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;

@Metadata(m13557d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u0002H\u0000\u001a\u0010\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u0002H\u0000\u001a\u0010\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u0002H\u0000\u001a\u0010\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006*\u00020\u0002H\u0002¨\u0006\u0007"}, m13558d2 = {"parseEnum", "Landroidx/navigation/NavType;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "parseNullableEnum", "parseEnumList", "getClass", "Ljava/lang/Class;", "navigation-common_release"}, m13559k = 2, m13560mv = {2, 0, 0}, m13562xi = 48)
/* loaded from: classes3.dex */
public final class NavTypeConverter_androidKt {
    private static final Class<?> getClass(SerialDescriptor serialDescriptor) throws ClassNotFoundException {
        String strReplace$default = StringsKt.replace$default(serialDescriptor.getSerialName(), "?", "", false, 4, (Object) null);
        try {
            Class<?> cls = Class.forName(strReplace$default);
            Intrinsics.checkNotNullExpressionValue(cls, "forName(...)");
            return cls;
        } catch (ClassNotFoundException unused) {
            if (StringsKt.contains$default((CharSequence) strReplace$default, (CharSequence) ".", false, 2, (Object) null)) {
                Class<?> cls2 = Class.forName(new Regex("(\\.+)(?!.*\\.)").replace(strReplace$default, "\\$"));
                Intrinsics.checkNotNullExpressionValue(cls2, "forName(...)");
                return cls2;
            }
            String str = "Cannot find class with name \"" + serialDescriptor.getSerialName() + "\". Ensure that the serialName for this argument is the default fully qualified name";
            if (serialDescriptor.getKind() instanceof SerialKind.ENUM) {
                str = str + ".\nIf the build is minified, try annotating the Enum class with \"androidx.annotation.Keep\" to ensure the Enum is not removed.";
            }
            throw new IllegalArgumentException(str);
        }
    }

    public static final NavType<?> parseEnum(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        NavType<?> serializableOrParcelableType$navigation_common_release = NavType.INSTANCE.parseSerializableOrParcelableType$navigation_common_release(getClass(serialDescriptor), false);
        return serializableOrParcelableType$navigation_common_release == null ? UNKNOWN.INSTANCE : serializableOrParcelableType$navigation_common_release;
    }

    public static final NavType<?> parseEnumList(SerialDescriptor serialDescriptor) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Class<?> cls = getClass(serialDescriptor.getElementDescriptor(0));
        Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Enum<*>>");
        return new InternalAndroidNavType.EnumListType(cls);
    }

    public static final NavType<?> parseNullableEnum(SerialDescriptor serialDescriptor) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Class<?> cls = getClass(serialDescriptor);
        if (!Enum.class.isAssignableFrom(cls)) {
            return UNKNOWN.INSTANCE;
        }
        Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Enum<*>?>");
        return new InternalAndroidNavType.EnumNullableType(cls);
    }
}
