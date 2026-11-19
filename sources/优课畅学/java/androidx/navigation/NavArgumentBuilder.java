package androidx.navigation;

import androidx.navigation.NavArgument;
import kotlin.jvm.internal.AbstractC9133u;

@NavDestinationDsl
/* loaded from: classes3.dex */
public final class NavArgumentBuilder {
    private NavType<?> _type;
    private final NavArgument.Builder builder = new NavArgument.Builder();
    private Object defaultValue;
    private boolean nullable;
    private boolean unknownDefaultValuePresent;

    public final NavArgument build() {
        return this.builder.build();
    }

    public final Object getDefaultValue() {
        return this.defaultValue;
    }

    public final boolean getNullable() {
        return this.nullable;
    }

    public final NavType<?> getType() {
        NavType<?> navType = this._type;
        if (navType != null) {
            return navType;
        }
        throw new IllegalStateException("NavType has not been set on this builder.");
    }

    public final boolean getUnknownDefaultValuePresent$navigation_common_release() {
        return this.unknownDefaultValuePresent;
    }

    public final void setDefaultValue(Object obj) {
        this.defaultValue = obj;
        this.builder.setDefaultValue(obj);
    }

    public final void setNullable(boolean z10) {
        this.nullable = z10;
        this.builder.setIsNullable(z10);
    }

    public final void setType(NavType<?> value) {
        AbstractC9133u.m16133g(value, "value");
        this._type = value;
        this.builder.setType(value);
    }

    public final void setUnknownDefaultValuePresent$navigation_common_release(boolean z10) {
        this.unknownDefaultValuePresent = z10;
        this.builder.setUnknownDefaultValuePresent$navigation_common_release(z10);
    }
}
