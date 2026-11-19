package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.savedstate.SavedStateReader;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;

/* loaded from: classes3.dex */
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
                AbstractC9133u.m16131e(navTypeInferFromValueType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
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
            AbstractC9133u.m16133g(type, "type");
            this.type = type;
            return this;
        }

        public final Builder setUnknownDefaultValuePresent$navigation_common_release(boolean z10) {
            this.unknownDefaultValuePresent = z10;
            return this;
        }
    }

    public NavArgument(NavType<Object> type, boolean z10, Object obj, boolean z11, boolean z12) {
        AbstractC9133u.m16133g(type, "type");
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
            if (this.isNullable != navArgument.isNullable || this.isDefaultValuePresent != navArgument.isDefaultValuePresent || !AbstractC9133u.m16128b(this.type, navArgument.type)) {
                return false;
            }
            Object obj2 = this.defaultValue;
            if (obj2 != null) {
                return AbstractC9133u.m16128b(obj2, navArgument.defaultValue);
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
        AbstractC9133u.m16133g(name, "name");
        AbstractC9133u.m16133g(bundle, "bundle");
        if (!this.isDefaultValuePresent || (obj = this.defaultValue) == null) {
            return;
        }
        this.type.put(bundle, name, obj);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC9137y.m16154b(NavArgument.class).mo13672g());
        sb.append(" Type: " + this.type);
        sb.append(" Nullable: " + this.isNullable);
        if (this.isDefaultValuePresent) {
            sb.append(" DefaultValue: " + this.defaultValue);
        }
        String string = sb.toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        return string;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean verify(String name, Bundle bundle) {
        AbstractC9133u.m16133g(name, "name");
        AbstractC9133u.m16133g(bundle, "bundle");
        if (!this.isNullable) {
            Bundle bundleM27229constructorimpl = SavedStateReader.m27229constructorimpl(bundle);
            if (SavedStateReader.m27230containsimpl(bundleM27229constructorimpl, name) && SavedStateReader.m27308isNullimpl(bundleM27229constructorimpl, name)) {
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
