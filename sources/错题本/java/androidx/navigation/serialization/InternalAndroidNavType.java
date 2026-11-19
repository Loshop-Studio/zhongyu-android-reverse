package androidx.navigation.serialization;

import android.os.Bundle;
import android.support.v4.media.AbstractC0037f;
import android.view.serialization.ClassDiscriminatorModeKt;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.CollectionNavType;
import androidx.navigation.NavType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5862w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m5110d2 = {"Landroidx/navigation/serialization/InternalAndroidNavType;", "", "<init>", "()V", "EnumNullableType", "SerializableNullableType", "EnumListType", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class InternalAndroidNavType {

    @NotNull
    public static final InternalAndroidNavType INSTANCE = new InternalAndroidNavType();

    @Metadata(m5109d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00042\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\f2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0017J/\u0010\u001a\u001a\u00020\u00192\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00042\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010 H\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, m5110d2 = {"Landroidx/navigation/serialization/InternalAndroidNavType$EnumListType;", "", "D", "Landroidx/navigation/CollectionNavType;", "", "Ljava/lang/Class;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "<init>", "(Ljava/lang/Class;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "bundle", "", "key", "value", "Ld6/s;", "put", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "parseValue", "(Ljava/lang/String;)Ljava/util/List;", "previousValue", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "other", "", "valueEquals", "(Ljava/util/List;Ljava/util/List;)Z", "serializeAsValues", "(Ljava/util/List;)Ljava/util/List;", "emptyCollection", "()Ljava/util/List;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/navigation/NavType$EnumType;", "enumNavType", "Landroidx/navigation/NavType$EnumType;", "getName", "()Ljava/lang/String;", HintConstants.AUTOFILL_HINT_NAME, "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nNavTypeConverter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavTypeConverter.android.kt\nandroidx/navigation/serialization/InternalAndroidNavType$EnumListType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,176:1\n1#2:177\n1557#3:178\n1628#3,3:179\n*S KotlinDebug\n*F\n+ 1 NavTypeConverter.android.kt\nandroidx/navigation/serialization/InternalAndroidNavType$EnumListType\n*L\n161#1:178\n161#1:179,3\n*E\n"})
    public static final class EnumListType<D extends Enum<?>> extends CollectionNavType<List<? extends D>> {

        @NotNull
        private final NavType.EnumType<D> enumNavType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnumListType(@NotNull Class<D> type) {
            super(true);
            AbstractC5830k.m5330g(type, "type");
            this.enumNavType = new NavType.EnumType<>(type);
        }

        @Override // androidx.navigation.CollectionNavType
        @NotNull
        public List<D> emptyCollection() {
            return EmptyList.INSTANCE;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof EnumListType) {
                return AbstractC5830k.m5325b(this.enumNavType, ((EnumListType) other).enumNavType);
            }
            return false;
        }

        @Override // androidx.navigation.NavType
        @NotNull
        public String getName() {
            return "List<" + this.enumNavType.getName() + "}>";
        }

        public int hashCode() {
            return this.enumNavType.hashCode();
        }

        @Override // androidx.navigation.NavType
        @Nullable
        public List<D> get(@NotNull Bundle bundle, @NotNull String key) {
            AbstractC5830k.m5330g(bundle, "bundle");
            AbstractC5830k.m5330g(key, "key");
            Object obj = bundle.get(key);
            if (obj instanceof List) {
                return (List) obj;
            }
            return null;
        }

        @Override // androidx.navigation.NavType
        public void put(@NotNull Bundle bundle, @NotNull String key, @Nullable List<? extends D> value) {
            AbstractC5830k.m5330g(bundle, "bundle");
            AbstractC5830k.m5330g(key, "key");
            bundle.putSerializable(key, value != null ? new ArrayList(value) : null);
        }

        @Override // androidx.navigation.CollectionNavType
        @NotNull
        public List<String> serializeAsValues(@Nullable List<? extends D> value) {
            if (value == null) {
                return EmptyList.INSTANCE;
            }
            ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(value, 10));
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                arrayList.add(((Enum) it.next()).toString());
            }
            return arrayList;
        }

        @Override // androidx.navigation.NavType
        public boolean valueEquals(@Nullable List<? extends D> value, @Nullable List<? extends D> other) {
            return AbstractC5830k.m5325b(value != null ? new ArrayList(value) : null, other != null ? new ArrayList(other) : null);
        }

        @Override // androidx.navigation.NavType
        @NotNull
        public List<D> parseValue(@NotNull String value) {
            AbstractC5830k.m5330g(value, "value");
            return AbstractC5806u.m5286y(this.enumNavType.parseValue(value));
        }

        @Override // androidx.navigation.NavType
        @Nullable
        public List<D> parseValue(@NotNull String value, @Nullable List<? extends D> previousValue) {
            AbstractC5830k.m5330g(value, "value");
            List<D> value2 = parseValue(value);
            return previousValue != null ? AbstractC5805t.m5240t0(previousValue, value2) : value2;
        }
    }

    @Metadata(m5109d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000f\u001a\u00020\u000e2\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0011\u001a\u0004\u0018\u00018\u00002\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u0004\u0018\u00018\u00002\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010 \u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m5110d2 = {"Landroidx/navigation/serialization/InternalAndroidNavType$SerializableNullableType;", "Ljava/io/Serializable;", "D", "Landroidx/navigation/NavType;", "Ljava/lang/Class;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "<init>", "(Ljava/lang/Class;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "bundle", "", "key", "value", "Ld6/s;", "put", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/io/Serializable;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/io/Serializable;", "parseValue", "(Ljava/lang/String;)Ljava/io/Serializable;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/Class;", "getName", "()Ljava/lang/String;", HintConstants.AUTOFILL_HINT_NAME, "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static class SerializableNullableType<D extends Serializable> extends NavType<D> {

        @NotNull
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableNullableType(@NotNull Class<D> type) {
            super(true);
            AbstractC5830k.m5330g(type, "type");
            this.type = type;
            if (Serializable.class.isAssignableFrom(type)) {
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof SerializableNullableType) {
                return AbstractC5830k.m5325b(this.type, ((SerializableNullableType) other).type);
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
            Object obj = bundle.get(key);
            if (obj instanceof Serializable) {
                return (D) obj;
            }
            return null;
        }

        @Override // androidx.navigation.NavType
        @Nullable
        public D parseValue(@NotNull String value) {
            AbstractC5830k.m5330g(value, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public void put(@NotNull Bundle bundle, @NotNull String key, @Nullable D value) {
            AbstractC5830k.m5330g(bundle, "bundle");
            AbstractC5830k.m5330g(key, "key");
            bundle.putSerializable(key, this.type.cast(value));
        }
    }

    private InternalAndroidNavType() {
    }

    @Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u00022\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0003B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\u000eR\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m5110d2 = {"Landroidx/navigation/serialization/InternalAndroidNavType$EnumNullableType;", "D", "", "Landroidx/navigation/serialization/InternalAndroidNavType$SerializableNullableType;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Ljava/lang/Class;", "<init>", "(Ljava/lang/Class;)V", HintConstants.AUTOFILL_HINT_NAME, "", "getName", "()Ljava/lang/String;", "parseValue", "value", "(Ljava/lang/String;)Ljava/lang/Enum;", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nNavTypeConverter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavTypeConverter.android.kt\nandroidx/navigation/serialization/InternalAndroidNavType$EnumNullableType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,176:1\n1#2:177\n1310#3,2:178\n*S KotlinDebug\n*F\n+ 1 NavTypeConverter.android.kt\nandroidx/navigation/serialization/InternalAndroidNavType$EnumNullableType\n*L\n86#1:178,2\n*E\n"})
    public static final class EnumNullableType<D extends Enum<?>> extends SerializableNullableType<D> {

        @NotNull
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnumNullableType(@NotNull Class<D> type) {
            super(type);
            AbstractC5830k.m5330g(type, "type");
            if (type.isEnum()) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " is not an Enum type.").toString());
        }

        @Override // androidx.navigation.serialization.InternalAndroidNavType.SerializableNullableType, androidx.navigation.NavType
        @NotNull
        public String getName() {
            return this.type.getName();
        }

        @Override // androidx.navigation.serialization.InternalAndroidNavType.SerializableNullableType, androidx.navigation.NavType
        @Nullable
        public D parseValue(@NotNull String value) {
            AbstractC5830k.m5330g(value, "value");
            D d9 = null;
            if (value.equals("null")) {
                return null;
            }
            D[] enumConstants = this.type.getEnumConstants();
            AbstractC5830k.m5327d(enumConstants);
            int length = enumConstants.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                D d10 = enumConstants[i];
                D d11 = d10;
                AbstractC5830k.m5327d(d11);
                if (AbstractC5862w.m5415v(d11.name(), value, true)) {
                    d9 = d10;
                    break;
                }
                i++;
            }
            D d12 = d9;
            if (d12 != null) {
                return d12;
            }
            StringBuilder sbM100y = AbstractC0037f.m100y("Enum value ", value, " not found for type ");
            sbM100y.append(this.type.getName());
            sbM100y.append('.');
            throw new IllegalArgumentException(sbM100y.toString());
        }
    }
}
