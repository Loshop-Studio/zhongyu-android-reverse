package androidx.compose.p011ui.platform;

import androidx.compose.p011ui.ExperimentalComposeUiApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;

@ExperimentalComposeUiApi
@Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\bç\u0080\u0001\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m5110d2 = {"Landroidx/compose/ui/platform/PlatformTextInputInterceptor;", "", "Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;", "request", "Landroidx/compose/ui/platform/PlatformTextInputSession;", "nextHandler", "", "interceptStartInputMethod", "(Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;Landroidx/compose/ui/platform/PlatformTextInputSession;Lh6/c;)Ljava/lang/Object;", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public interface PlatformTextInputInterceptor {
    @Nullable
    Object interceptStartInputMethod(@NotNull PlatformTextInputMethodRequest platformTextInputMethodRequest, @NotNull PlatformTextInputSession platformTextInputSession, @NotNull InterfaceC5631c<?> interfaceC5631c);
}
