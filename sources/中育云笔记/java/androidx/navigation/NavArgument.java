package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.savedstate.SavedStateReader;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;

/* loaded from: classes.dex */
public final class NavArgument {
    private final Object defaultValue;
    private final boolean isDefaultValuePresent;
    private final boolean isDefaultValueUnknown;
    private final boolean isNullable;
    private final NavType<Object> type;

    public static final class Builder {
        private Object defaultValue;
        private boolean defaultValuePresent;
        private boolean isNullable;
        private NavType<Object> type;
        private boolean unknownDefaultValuePresent;

        public final NavArgument build() {
            NavType<Object> navTypeInferFromValueType = this.type;
            if (navTypeInferFromValueType == null) {
                navTypeInferFromValueType = NavType.Companion.inferFromValueType(this.defaultValue);
                AbstractC9979u.m20292e(navTypeInferFromValueType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
            }
            return new NavArgument(navTypeInferFromValueType, this.isNullable, this.defaultValue, this.defaultValuePresent, this.unknownDefaultValuePresent);
        }

        public final Builder setDefaultValue(Object obj) {
            this.defaultValue = obj;
            this.defaultValuePresent = true;
            return this;
        }

        public final Builder setIsNullable(boolean z10) {
            this.isNullable = z10;
            return this;
        }

        public final <T> Builder setType(NavType<T> type) {
            AbstractC9979u.m20294g(type, "type");
            this.type = type;
            return this;
        }

        public final Builder setUnknownDefaultValuePresent$navigation_common_release(boolean z10) {
            this.unknownDefaultValuePresent = z10;
            return this;
        }
    }

    public NavArgument(NavType<Object> type, boolean z10, Object obj, boolean z11, boolean z12) {
        AbstractC9979u.m20294g(type, "type");
        if (!type.isNullableAllowed() && z10) {
            throw new IllegalArgumentException((type.getName() + " does not allow nullable values").toString());
        }
        if (!z10 && z11 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + type.getName() + " has null value but is not nullable.").toString());
        }
        this.type = type;
        this.isNullable = z10;
        this.defaultValue = obj;
        this.isDefaultValuePresent = z11 || z12;
        this.isDefaultValueUnknown = z12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && NavArgument.class == obj.getClass()) {
            NavArgument navArgument = (NavArgument) obj;
            if (this.isNullable != navArgument.isNullable || this.isDefaultValuePresent != navArgument.isDefaultValuePresent || !AbstractC9979u.m20289b(this.type, navArgument.type)) {
                return false;
            }
            Object obj2 = this.defaultValue;
            if (obj2 != null) {
                return AbstractC9979u.m20289b(obj2, navArgument.defaultValue);
            }
            if (navArgument.defaultValue == null) {
                return true;
            }
        }
        return false;
    }

    public final Object getDefaultValue() {
        return this.defaultValue;
    }

    public final NavType<Object> getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((this.type.hashCode() * 31) + (this.isNullable ? 1 : 0)) * 31) + (this.isDefaultValuePresent ? 1 : 0)) * 31;
        Object obj = this.defaultValue;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final boolean isDefaultValuePresent() {
        return this.isDefaultValuePresent;
    }

    public final boolean isDefaultValueUnknown$navigation_common_release() {
        return this.isDefaultValueUnknown;
    }

    public final boolean isNullable() {
        return this.isNullable;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void putDefaultValue(String name, Bundle bundle) {
        Object obj;
        AbstractC9979u.m20294g(name, "name");
        AbstractC9979u.m20294g(bundle, "bundle");
        if (!this.isDefaultValuePresent || (obj = this.defaultValue) == null) {
            return;
        }
        this.type.put(bundle, name, obj);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractC9983y.m20315b(NavArgument.class).mo20277f());
        sb2.append(" Type: " + this.type);
        sb2.append(" Nullable: " + this.isNullable);
        if (this.isDefaultValuePresent) {
            sb2.append(" DefaultValue: " + this.defaultValue);
        }
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return string;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean verify(String name, Bundle bundle) {
        AbstractC9979u.m20294g(name, "name");
        AbstractC9979u.m20294g(bundle, "bundle");
        if (!this.isNullable) {
            Bundle bundleM33824constructorimpl = SavedStateReader.m33824constructorimpl(bundle);
            if (SavedStateReader.m33825containsimpl(bundleM33824constructorimpl, name) && SavedStateReader.m33903isNullimpl(bundleM33824constructorimpl, name)) {
                return false;
            }
        }
        try {
            this.type.get(bundle, name);
            return true;
        } catch (IllegalStateException unused) {
            return false;
        }
    }
}
