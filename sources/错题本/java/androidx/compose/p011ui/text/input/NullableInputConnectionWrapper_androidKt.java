package androidx.compose.p011ui.text.input;

import android.os.Build;
import android.view.inputmethod.InputConnection;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m5110d2 = {"Landroid/view/inputmethod/InputConnection;", "delegate", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/NullableInputConnectionWrapper;", "Ld6/s;", "onConnectionClosed", "NullableInputConnectionWrapper", "(Landroid/view/inputmethod/InputConnection;Lr6/c;)Landroidx/compose/ui/text/input/NullableInputConnectionWrapper;", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class NullableInputConnectionWrapper_androidKt {
    @NotNull
    public static final NullableInputConnectionWrapper NullableInputConnectionWrapper(@NotNull InputConnection inputConnection, @NotNull InterfaceC6471c interfaceC6471c) {
        int i = Build.VERSION.SDK_INT;
        return i >= 34 ? new NullableInputConnectionWrapperApi34(inputConnection, interfaceC6471c) : i >= 25 ? new NullableInputConnectionWrapperApi25(inputConnection, interfaceC6471c) : new NullableInputConnectionWrapperApi24(inputConnection, interfaceC6471c);
    }
}
