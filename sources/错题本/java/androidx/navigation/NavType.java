package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.AbstractC0037f;
import android.view.SavedStateReader;
import android.view.SavedStateWriter;
import android.view.serialization.ClassDiscriminatorModeKt;
import androidx.annotation.AnyRes;
import androidx.annotation.RestrictTo;
import androidx.autofill.HintConstants;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5862w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p204y1.AbstractC6768a;

@Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b&\u0018\u0000 %*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0006%&'()*B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H&¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0010\u001a\u0004\u0018\u00018\u00002\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u000b\u001a\u00020\nH¦\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\nH&¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0012\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0015J+\u0010\u0016\u001a\u00028\u00002\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u0016\u001a\u00028\u00002\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0016\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\u0004\u0010!R\u001a\u0010\"\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001f¨\u0006+"}, m5110d2 = {"Landroidx/navigation/NavType;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "isNullableAllowed", "<init>", "(Z)V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "bundle", "", "key", "value", "Ld6/s;", "put", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;", "parseValue", "(Ljava/lang/String;)Ljava/lang/Object;", "previousValue", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "parseAndPut", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "serializeAsValue", "(Ljava/lang/Object;)Ljava/lang/String;", "other", "valueEquals", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "Z", "()Z", HintConstants.AUTOFILL_HINT_NAME, "Ljava/lang/String;", "getName", "Companion", "ParcelableType", "ParcelableArrayType", "SerializableType", "EnumType", "SerializableArrayType", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public abstract class NavType<T> {
    private final boolean isNullableAllowed;

    @NotNull
    private final String name = "nav_type";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final NavType<Integer> IntType = new IntNavType();

    @JvmField
    @NotNull
    public static final NavType<Integer> ReferenceType = new NavType<Integer>() { // from class: androidx.navigation.NavType$Companion$ReferenceType$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        @AnyRes
        public Integer get(Bundle bundle, String key) {
            return Integer.valueOf(SavedStateReader.m13628getIntimpl(AbstractC1923c.m1062z(bundle, "bundle", key, "key", bundle), key));
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return TypedValues.Custom.S_REFERENCE;
        }

        public void put(Bundle bundle, String key, @AnyRes int value) {
            SavedStateWriter.m13700putIntimpl(AbstractC1923c.m1041e(bundle, "bundle", key, "key", bundle), key, value);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public Integer parseValue(String value) throws NumberFormatException {
            int i;
            AbstractC5830k.m5330g(value, "value");
            if (AbstractC5862w.m5409C(value, "0x", false)) {
                String strSubstring = value.substring(2);
                AbstractC5830k.m5329f(strSubstring, "substring(...)");
                AbstractC6768a.m6440d(16);
                i = Integer.parseInt(strSubstring, 16);
            } else {
                i = Integer.parseInt(value);
            }
            return Integer.valueOf(i);
        }

        @Override // androidx.navigation.NavType
        public /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Integer num) {
            put(bundle, str, num.intValue());
        }
    };

    @JvmField
    @NotNull
    public static final NavType<int[]> IntArrayType = new IntArrayNavType();

    @JvmField
    @NotNull
    public static final NavType<List<Integer>> IntListType = new IntListNavType();

    @JvmField
    @NotNull
    public static final NavType<Long> LongType = new LongNavType();

    @JvmField
    @NotNull
    public static final NavType<long[]> LongArrayType = new LongArrayNavType();

    @JvmField
    @NotNull
    public static final NavType<List<Long>> LongListType = new LongListNavType();

    @JvmField
    @NotNull
    public static final NavType<Float> FloatType = new FloatNavType();

    @JvmField
    @NotNull
    public static final NavType<float[]> FloatArrayType = new FloatArrayNavType();

    @JvmField
    @NotNull
    public static final NavType<List<Float>> FloatListType = new FloatListNavType();

    @JvmField
    @NotNull
    public static final NavType<Boolean> BoolType = new BoolNavType();

    @JvmField
    @NotNull
    public static final NavType<boolean[]> BoolArrayType = new BoolArrayNavType();

    @JvmField
    @NotNull
    public static final NavType<List<Boolean>> BoolListType = new BoolListNavType();

    @JvmField
    @NotNull
    public static final NavType<String> StringType = new StringNavType();

    @JvmField
    @NotNull
    public static final NavType<String[]> StringArrayType = new StringArrayNavType();

    @JvmField
    @NotNull
    public static final NavType<List<String>> StringListType = new StringListNavType();

    @Metadata(m5109d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0017J'\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u0007H\u0007J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0007R\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00180\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00180\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00180\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001e\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00180\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001e\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010)0\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001e\u0010*\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00180\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, m5110d2 = {"Landroidx/navigation/NavType$Companion;", "", "<init>", "()V", "fromArgType", "Landroidx/navigation/NavType;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "packageName", "parseSerializableOrParcelableType", "clazz", "Ljava/lang/Class;", "isArray", "", "parseSerializableOrParcelableType$navigation_common_release", "inferFromValue", "value", "inferFromValueType", "IntType", "", "ReferenceType", "IntArrayType", "", "IntListType", "", "LongType", "", "LongArrayType", "", "LongListType", "FloatType", "", "FloatArrayType", "", "FloatListType", "BoolType", "BoolArrayType", "", "BoolListType", "StringType", "StringArrayType", "", "StringListType", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @JvmStatic
        @NotNull
        public NavType<?> fromArgType(@Nullable String type, @Nullable String packageName) {
            NavType<?> navTypeNavTypeFromArgType = NavTypeKt.navTypeFromArgType(type);
            if (navTypeNavTypeFromArgType != null) {
                return navTypeNavTypeFromArgType;
            }
            NavType<Integer> navType = NavType.ReferenceType;
            if (AbstractC5830k.m5325b(navType.getName(), type)) {
                return navType;
            }
            if (type == null || type.length() == 0) {
                return NavType.StringType;
            }
            try {
                String strConcat = (!AbstractC5862w.m5409C(type, ".", false) || packageName == null) ? type : packageName.concat(type);
                boolean zM5414u = AbstractC5862w.m5414u(type, "[]", false);
                if (zM5414u) {
                    strConcat = strConcat.substring(0, strConcat.length() - 2);
                    AbstractC5830k.m5329f(strConcat, "substring(...)");
                }
                NavType<?> serializableOrParcelableType$navigation_common_release = parseSerializableOrParcelableType$navigation_common_release(Class.forName(strConcat), zM5414u);
                if (serializableOrParcelableType$navigation_common_release != null) {
                    return serializableOrParcelableType$navigation_common_release;
                }
                throw new IllegalArgumentException((strConcat + " is not Serializable or Parcelable.").toString());
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public final NavType<Object> inferFromValue(@NotNull String value) {
            AbstractC5830k.m5330g(value, "value");
            return NavTypeKt.navTypeInferFromValue(value);
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public final NavType<Object> inferFromValueType(@Nullable Object value) {
            NavType<Object> navTypeNavTypeInferFromValueType = NavTypeKt.navTypeInferFromValueType(value);
            if (navTypeNavTypeInferFromValueType != null) {
                return navTypeNavTypeInferFromValueType;
            }
            if ((value instanceof Object[]) && (((Object[]) value) instanceof String[])) {
                NavType<String[]> navType = NavType.StringArrayType;
                AbstractC5830k.m5328e(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType;
            }
            AbstractC5830k.m5327d(value);
            if (value.getClass().isArray()) {
                Class<?> componentType = value.getClass().getComponentType();
                AbstractC5830k.m5327d(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    Class<?> componentType2 = value.getClass().getComponentType();
                    AbstractC5830k.m5328e(componentType2, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                    return new ParcelableArrayType(componentType2);
                }
            }
            if (value.getClass().isArray()) {
                Class<?> componentType3 = value.getClass().getComponentType();
                AbstractC5830k.m5327d(componentType3);
                if (Serializable.class.isAssignableFrom(componentType3)) {
                    Class<?> componentType4 = value.getClass().getComponentType();
                    AbstractC5830k.m5328e(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                    return new SerializableArrayType(componentType4);
                }
            }
            if (value instanceof Parcelable) {
                return new ParcelableType(value.getClass());
            }
            if (value instanceof Enum) {
                return new EnumType(value.getClass());
            }
            if (value instanceof Serializable) {
                return new SerializableType(value.getClass());
            }
            throw new IllegalArgumentException("Object of type " + value.getClass().getName() + " is not supported for navigation arguments.");
        }

        @Nullable
        public final NavType<?> parseSerializableOrParcelableType$navigation_common_release(@NotNull Class<?> clazz, boolean isArray) {
            AbstractC5830k.m5330g(clazz, "clazz");
            if (Parcelable.class.isAssignableFrom(clazz)) {
                return isArray ? new ParcelableArrayType(clazz) : new ParcelableType(clazz);
            }
            if (Enum.class.isAssignableFrom(clazz) && !isArray) {
                return new EnumType(clazz);
            }
            if (Serializable.class.isAssignableFrom(clazz)) {
                return isArray ? new SerializableArrayType(clazz) : new SerializableType(clazz);
            }
            return null;
        }

        private Companion() {
        }
    }

    @Metadata(m5109d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u001e\u001a\u00020\u00182\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, m5110d2 = {"Landroidx/navigation/NavType$ParcelableArrayType;", "Landroid/os/Parcelable;", "D", "Landroidx/navigation/NavType;", "", "Ljava/lang/Class;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "<init>", "(Ljava/lang/Class;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "bundle", "", "key", "value", "Ld6/s;", "put", "(Landroid/os/Bundle;Ljava/lang/String;[Landroid/os/Parcelable;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)[Landroid/os/Parcelable;", "parseValue", "(Ljava/lang/String;)[Landroid/os/Parcelable;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "valueEquals", "([Landroid/os/Parcelable;[Landroid/os/Parcelable;)Z", "arrayType", "Ljava/lang/Class;", "getName", "()Ljava/lang/String;", HintConstants.AUTOFILL_HINT_NAME, "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class ParcelableArrayType<D extends Parcelable> extends NavType<D[]> {

        @NotNull
        private final Class<D[]> arrayType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParcelableArrayType(@NotNull Class<D> type) {
            super(true);
            AbstractC5830k.m5330g(type, "type");
            if (!Parcelable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Parcelable.").toString());
            }
            try {
                this.arrayType = (Class<D[]>) Class.forName("[L" + type.getName() + ';');
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || !ParcelableArrayType.class.equals(other.getClass())) {
                return false;
            }
            return AbstractC5830k.m5325b(this.arrayType, ((ParcelableArrayType) other).arrayType);
        }

        @Override // androidx.navigation.NavType
        @NotNull
        public String getName() {
            return this.arrayType.getName();
        }

        public int hashCode() {
            return this.arrayType.hashCode();
        }

        @Override // androidx.navigation.NavType
        @Nullable
        public D[] get(@NotNull Bundle bundle, @NotNull String key) {
            AbstractC5830k.m5330g(bundle, "bundle");
            AbstractC5830k.m5330g(key, "key");
            return (D[]) ((Parcelable[]) bundle.get(key));
        }

        @Override // androidx.navigation.NavType
        @NotNull
        public D[] parseValue(@NotNull String value) {
            AbstractC5830k.m5330g(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public void put(@NotNull Bundle bundle, @NotNull String key, @Nullable D[] value) {
            AbstractC5830k.m5330g(bundle, "bundle");
            AbstractC5830k.m5330g(key, "key");
            this.arrayType.cast(value);
            bundle.putParcelableArray(key, value);
        }

        @Override // androidx.navigation.NavType
        public boolean valueEquals(@Nullable D[] value, @Nullable D[] other) {
            return AbstractC5802q.m5210w(value, other);
        }
    }

    @Metadata(m5109d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0010\u001a\u0004\u0018\u00018\u00012\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00028\u00012\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m5110d2 = {"Landroidx/navigation/NavType$ParcelableType;", "D", "Landroidx/navigation/NavType;", "Ljava/lang/Class;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "<init>", "(Ljava/lang/Class;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "bundle", "", "key", "value", "Ld6/s;", "put", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;", "parseValue", "(Ljava/lang/String;)Ljava/lang/Object;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/Class;", "getName", "()Ljava/lang/String;", HintConstants.AUTOFILL_HINT_NAME, "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class ParcelableType<D> extends NavType<D> {

        @NotNull
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParcelableType(@NotNull Class<D> type) {
            super(true);
            AbstractC5830k.m5330g(type, "type");
            if (Parcelable.class.isAssignableFrom(type) || Serializable.class.isAssignableFrom(type)) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Parcelable or Serializable.").toString());
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || !ParcelableType.class.equals(other.getClass())) {
                return false;
            }
            return AbstractC5830k.m5325b(this.type, ((ParcelableType) other).type);
        }

        @Override // androidx.navigation.NavType
        @Nullable
        public D get(@NotNull Bundle bundle, @NotNull String key) {
            AbstractC5830k.m5330g(bundle, "bundle");
            AbstractC5830k.m5330g(key, "key");
            return (D) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        @NotNull
        public String getName() {
            return this.type.getName();
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        @Override // androidx.navigation.NavType
        public D parseValue(@NotNull String value) {
            AbstractC5830k.m5330g(value, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public void put(@NotNull Bundle bundle, @NotNull String key, D value) {
            AbstractC5830k.m5330g(bundle, "bundle");
            AbstractC5830k.m5330g(key, "key");
            this.type.cast(value);
            if (value == null || (value instanceof Parcelable)) {
                bundle.putParcelable(key, (Parcelable) value);
            } else if (value instanceof Serializable) {
                bundle.putSerializable(key, (Serializable) value);
            }
        }
    }

    @Metadata(m5109d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u001e\u001a\u00020\u00182\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, m5110d2 = {"Landroidx/navigation/NavType$SerializableArrayType;", "Ljava/io/Serializable;", "D", "Landroidx/navigation/NavType;", "", "Ljava/lang/Class;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "<init>", "(Ljava/lang/Class;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "bundle", "", "key", "value", "Ld6/s;", "put", "(Landroid/os/Bundle;Ljava/lang/String;[Ljava/io/Serializable;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/io/Serializable;", "parseValue", "(Ljava/lang/String;)[Ljava/io/Serializable;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "valueEquals", "([Ljava/io/Serializable;[Ljava/io/Serializable;)Z", "arrayType", "Ljava/lang/Class;", "getName", "()Ljava/lang/String;", HintConstants.AUTOFILL_HINT_NAME, "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class SerializableArrayType<D extends Serializable> extends NavType<D[]> {

        @NotNull
        private final Class<D[]> arrayType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableArrayType(@NotNull Class<D> type) {
            super(true);
            AbstractC5830k.m5330g(type, "type");
            if (!Serializable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
            }
            try {
                this.arrayType = (Class<D[]>) Class.forName("[L" + type.getName() + ';');
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || !SerializableArrayType.class.equals(other.getClass())) {
                return false;
            }
            return AbstractC5830k.m5325b(this.arrayType, ((SerializableArrayType) other).arrayType);
        }

        @Override // androidx.navigation.NavType
        @NotNull
        public String getName() {
            return this.arrayType.getName();
        }

        public int hashCode() {
            return this.arrayType.hashCode();
        }

        @Override // androidx.navigation.NavType
        @Nullable
        public D[] get(@NotNull Bundle bundle, @NotNull String key) {
            AbstractC5830k.m5330g(bundle, "bundle");
            AbstractC5830k.m5330g(key, "key");
            return (D[]) ((Serializable[]) bundle.get(key));
        }

        @Override // androidx.navigation.NavType
        @NotNull
        public D[] parseValue(@NotNull String value) {
            AbstractC5830k.m5330g(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.navigation.NavType
        public void put(@NotNull Bundle bundle, @NotNull String key, @Nullable D[] value) {
            AbstractC5830k.m5330g(bundle, "bundle");
            AbstractC5830k.m5330g(key, "key");
            this.arrayType.cast(value);
            bundle.putSerializable(key, value);
        }

        @Override // androidx.navigation.NavType
        public boolean valueEquals(@Nullable D[] value, @Nullable D[] other) {
            return AbstractC5802q.m5210w(value, other);
        }
    }

    @Metadata(m5109d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0017\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001f\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\nJ+\u0010\u0012\u001a\u00020\u00112\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0014\u001a\u0004\u0018\u00018\u00012\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\"\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, m5110d2 = {"Landroidx/navigation/NavType$SerializableType;", "Ljava/io/Serializable;", "D", "Landroidx/navigation/NavType;", "Ljava/lang/Class;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "<init>", "(Ljava/lang/Class;)V", "", "nullableAllowed", "(ZLjava/lang/Class;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "bundle", "", "key", "value", "Ld6/s;", "put", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/io/Serializable;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/io/Serializable;", "parseValue", "(Ljava/lang/String;)Ljava/io/Serializable;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/Class;", "getName", "()Ljava/lang/String;", HintConstants.AUTOFILL_HINT_NAME, "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nNavType.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.android.kt\nandroidx/navigation/NavType$SerializableType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,478:1\n1#2:479\n*E\n"})
    public static class SerializableType<D extends Serializable> extends NavType<D> {

        @NotNull
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableType(@NotNull Class<D> type) {
            super(true);
            AbstractC5830k.m5330g(type, "type");
            if (!Serializable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
            }
            if (!type.isEnum()) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " is an Enum. You should use EnumType instead.").toString());
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof SerializableType) {
                return AbstractC5830k.m5325b(this.type, ((SerializableType) other).type);
            }
            return false;
        }

        @Override // androidx.navigation.NavType
        @NotNull
        public String getName() {
            return this.type.getName();
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        @Override // androidx.navigation.NavType
        @Nullable
        public D get(@NotNull Bundle bundle, @NotNull String key) {
            AbstractC5830k.m5330g(bundle, "bundle");
            AbstractC5830k.m5330g(key, "key");
            return (D) bundle.get(key);
        }

        @Override // androidx.navigation.NavType
        @NotNull
        public D parseValue(@NotNull String value) {
            AbstractC5830k.m5330g(value, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public void put(@NotNull Bundle bundle, @NotNull String key, @NotNull D value) {
            AbstractC5830k.m5330g(bundle, "bundle");
            AbstractC5830k.m5330g(key, "key");
            AbstractC5830k.m5330g(value, "value");
            this.type.cast(value);
            bundle.putSerializable(key, value);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableType(boolean z8, @NotNull Class<D> type) {
            super(z8);
            AbstractC5830k.m5330g(type, "type");
            if (Serializable.class.isAssignableFrom(type)) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }
    }

    public NavType(boolean z8) {
        this.isNullableAllowed = z8;
    }

    @JvmStatic
    @NotNull
    public static NavType<?> fromArgType(@Nullable String str, @Nullable String str2) {
        return INSTANCE.fromArgType(str, str2);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final NavType<Object> inferFromValue(@NotNull String str) {
        return INSTANCE.inferFromValue(str);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final NavType<Object> inferFromValueType(@Nullable Object obj) {
        return INSTANCE.inferFromValueType(obj);
    }

    @Nullable
    public abstract T get(@NotNull Bundle bundle, @NotNull String key);

    @NotNull
    public String getName() {
        return this.name;
    }

    /* renamed from: isNullableAllowed, reason: from getter */
    public boolean getIsNullableAllowed() {
        return this.isNullableAllowed;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final T parseAndPut(@NotNull Bundle bundle, @NotNull String key, @NotNull String value) {
        AbstractC5830k.m5330g(bundle, "bundle");
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(value, "value");
        return (T) NavTypeKt.navTypeParseAndPut(this, bundle, key, value);
    }

    public abstract T parseValue(@NotNull String value);

    public T parseValue(@NotNull String value, T previousValue) {
        AbstractC5830k.m5330g(value, "value");
        return parseValue(value);
    }

    public abstract void put(@NotNull Bundle bundle, @NotNull String key, T value);

    @NotNull
    public String serializeAsValue(T value) {
        return String.valueOf(value);
    }

    @NotNull
    public String toString() {
        return getName();
    }

    public boolean valueEquals(T value, T other) {
        return AbstractC5830k.m5325b(value, other);
    }

    @Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000*\f\b\u0001\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\f\u001a\u00028\u00012\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\u000eR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m5110d2 = {"Landroidx/navigation/NavType$EnumType;", "D", "", "Landroidx/navigation/NavType$SerializableType;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Ljava/lang/Class;", "<init>", "(Ljava/lang/Class;)V", HintConstants.AUTOFILL_HINT_NAME, "", "getName", "()Ljava/lang/String;", "parseValue", "value", "(Ljava/lang/String;)Ljava/lang/Enum;", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nNavType.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.android.kt\nandroidx/navigation/NavType$EnumType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,478:1\n1#2:479\n1310#3,2:480\n*S KotlinDebug\n*F\n+ 1 NavType.android.kt\nandroidx/navigation/NavType$EnumType\n*L\n401#1:480,2\n*E\n"})
    public static final class EnumType<D extends Enum<?>> extends SerializableType<D> {

        @NotNull
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnumType(@NotNull Class<D> type) {
            super(false, type);
            AbstractC5830k.m5330g(type, "type");
            if (type.isEnum()) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " is not an Enum type.").toString());
        }

        @Override // androidx.navigation.NavType.SerializableType, androidx.navigation.NavType
        @NotNull
        public String getName() {
            return this.type.getName();
        }

        @Override // androidx.navigation.NavType.SerializableType, androidx.navigation.NavType
        @NotNull
        public D parseValue(@NotNull String value) {
            D d9;
            AbstractC5830k.m5330g(value, "value");
            D[] enumConstants = this.type.getEnumConstants();
            AbstractC5830k.m5329f(enumConstants, "getEnumConstants(...)");
            int length = enumConstants.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    d9 = null;
                    break;
                }
                d9 = enumConstants[i];
                if (AbstractC5862w.m5415v(d9.name(), value, true)) {
                    break;
                }
                i++;
            }
            D d10 = d9;
            if (d10 != null) {
                return d10;
            }
            StringBuilder sbM100y = AbstractC0037f.m100y("Enum value ", value, " not found for type ");
            sbM100y.append(this.type.getName());
            sbM100y.append('.');
            throw new IllegalArgumentException(sbM100y.toString());
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final T parseAndPut(@NotNull Bundle bundle, @NotNull String key, @Nullable String value, T previousValue) {
        AbstractC5830k.m5330g(bundle, "bundle");
        AbstractC5830k.m5330g(key, "key");
        return (T) NavTypeKt.navTypeParseAndPut(this, bundle, key, value, previousValue);
    }
}
