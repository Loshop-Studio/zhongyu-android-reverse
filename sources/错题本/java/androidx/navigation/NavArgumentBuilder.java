package androidx.navigation;

import android.view.serialization.ClassDiscriminatorModeKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavArgument;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@NavDestinationDsl
@Metadata(m5109d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R,\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u000e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R(\u0010\u0014\u001a\u0004\u0018\u00010\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0001@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u000e@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013¨\u0006\u001e"}, m5110d2 = {"Landroidx/navigation/NavArgumentBuilder;", "", "<init>", "()V", "builder", "Landroidx/navigation/NavArgument$Builder;", "_type", "Landroidx/navigation/NavType;", "value", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "getType", "()Landroidx/navigation/NavType;", "setType", "(Landroidx/navigation/NavType;)V", "", "nullable", "getNullable", "()Z", "setNullable", "(Z)V", "defaultValue", "getDefaultValue", "()Ljava/lang/Object;", "setDefaultValue", "(Ljava/lang/Object;)V", "unknownDefaultValuePresent", "getUnknownDefaultValuePresent$navigation_common_release", "setUnknownDefaultValuePresent$navigation_common_release", "build", "Landroidx/navigation/NavArgument;", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class NavArgumentBuilder {

    @Nullable
    private NavType<?> _type;

    @NotNull
    private final NavArgument.Builder builder = new NavArgument.Builder();

    @Nullable
    private Object defaultValue;
    private boolean nullable;
    private boolean unknownDefaultValuePresent;

    @NotNull
    public final NavArgument build() {
        return this.builder.build();
    }

    @Nullable
    public final Object getDefaultValue() {
        return this.defaultValue;
    }

    public final boolean getNullable() {
        return this.nullable;
    }

    @NotNull
    public final NavType<?> getType() {
        NavType<?> navType = this._type;
        if (navType != null) {
            return navType;
        }
        throw new IllegalStateException("NavType has not been set on this builder.");
    }

    /* renamed from: getUnknownDefaultValuePresent$navigation_common_release, reason: from getter */
    public final boolean getUnknownDefaultValuePresent() {
        return this.unknownDefaultValuePresent;
    }

    public final void setDefaultValue(@Nullable Object obj) {
        this.defaultValue = obj;
        this.builder.setDefaultValue(obj);
    }

    public final void setNullable(boolean z8) {
        this.nullable = z8;
        this.builder.setIsNullable(z8);
    }

    public final void setType(@NotNull NavType<?> value) {
        AbstractC5830k.m5330g(value, "value");
        this._type = value;
        this.builder.setType(value);
    }

    public final void setUnknownDefaultValuePresent$navigation_common_release(boolean z8) {
        this.unknownDefaultValuePresent = z8;
        this.builder.setUnknownDefaultValuePresent$navigation_common_release(z8);
    }
}
