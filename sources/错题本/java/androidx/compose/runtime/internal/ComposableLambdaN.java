package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.InterfaceC5827h;
import org.jetbrains.annotations.NotNull;
import p045d6.InterfaceC5428d;

@Stable
@ComposeCompilerApi
@Metadata(m5109d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\bg\u0018\u0000ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0001À\u0006\u0001"}, m5110d2 = {"Landroidx/compose/runtime/internal/ComposableLambdaN;", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface ComposableLambdaN extends InterfaceC5428d, InterfaceC5827h {
    @Override // kotlin.jvm.internal.InterfaceC5827h
    /* synthetic */ int getArity();

    Object invoke(@NotNull Object... objArr);
}
