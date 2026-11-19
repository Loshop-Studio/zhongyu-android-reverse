package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.compose.ComposeNavigator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5835p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a*\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m5110d2 = {"", "instance", "", "identityHashCode", "(Ljava/lang/Object;)I", "Landroidx/compose/runtime/Composer;", "composer", "Lkotlin/Function0;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", ComposeNavigator.NAME, "invokeComposable", "(Landroidx/compose/runtime/Composer;Lr6/e;)V", "runtime_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class Utils_jvmKt {
    public static final int identityHashCode(@Nullable Object obj) {
        return System.identityHashCode(obj);
    }

    public static final void invokeComposable(@NotNull Composer composer, @NotNull InterfaceC6473e interfaceC6473e) {
        AbstractC5830k.m5328e(interfaceC6473e, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        AbstractC5835p.m5354c(2, interfaceC6473e);
        interfaceC6473e.invoke(composer, 1);
    }
}
