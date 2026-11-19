package androidx.navigation;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u0086\u0002J\t\u0010\r\u001a\u00020\u0005H\u0086\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m5110d2 = {"Landroidx/navigation/NamedNavArgument;", "", HintConstants.AUTOFILL_HINT_NAME, "", "argument", "Landroidx/navigation/NavArgument;", "<init>", "(Ljava/lang/String;Landroidx/navigation/NavArgument;)V", "getName", "()Ljava/lang/String;", "getArgument", "()Landroidx/navigation/NavArgument;", "component1", "component2", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class NamedNavArgument {

    @NotNull
    private final NavArgument argument;

    @NotNull
    private final String name;

    public NamedNavArgument(@NotNull String name, @NotNull NavArgument argument) {
        AbstractC5830k.m5330g(name, "name");
        AbstractC5830k.m5330g(argument, "argument");
        this.name = name;
        this.argument = argument;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final NavArgument getArgument() {
        return this.argument;
    }

    @NotNull
    public final NavArgument getArgument() {
        return this.argument;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }
}
