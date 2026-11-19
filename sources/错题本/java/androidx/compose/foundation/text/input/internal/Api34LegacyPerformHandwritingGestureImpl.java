package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p011ui.platform.ViewConfiguration;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@RequiresApi(34)
@Metadata(m5109d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J[\u0010\u0014\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u001a\u001a\u00020\u00192\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m5110d2 = {"Landroidx/compose/foundation/text/input/internal/Api34LegacyPerformHandwritingGestureImpl;", "", "<init>", "()V", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "legacyTextFieldState", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "textFieldSelectionManager", "Landroid/view/inputmethod/HandwritingGesture;", "gesture", "Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/function/IntConsumer;", "consumer", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/EditCommand;", "Ld6/s;", "editCommandConsumer", "performHandwritingGesture", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroid/view/inputmethod/HandwritingGesture;Landroidx/compose/ui/platform/ViewConfiguration;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;Lr6/c;)V", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "previewHandwritingGesture", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class Api34LegacyPerformHandwritingGestureImpl {

    @NotNull
    public static final Api34LegacyPerformHandwritingGestureImpl INSTANCE = new Api34LegacyPerformHandwritingGestureImpl();

    private Api34LegacyPerformHandwritingGestureImpl() {
    }

    public final void performHandwritingGesture(@Nullable LegacyTextFieldState legacyTextFieldState, @Nullable TextFieldSelectionManager textFieldSelectionManager, @NotNull HandwritingGesture gesture, @Nullable ViewConfiguration viewConfiguration, @Nullable Executor executor, @Nullable IntConsumer consumer, @NotNull InterfaceC6471c editCommandConsumer) {
        int iPerformHandwritingGesture$foundation_release = legacyTextFieldState != null ? HandwritingGestureApi34.INSTANCE.performHandwritingGesture$foundation_release(legacyTextFieldState, gesture, textFieldSelectionManager, viewConfiguration, editCommandConsumer) : 3;
        if (consumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new RunnableC1375d(consumer, iPerformHandwritingGesture$foundation_release, 0));
        } else {
            consumer.accept(iPerformHandwritingGesture$foundation_release);
        }
    }

    public final boolean previewHandwritingGesture(@Nullable LegacyTextFieldState legacyTextFieldState, @Nullable TextFieldSelectionManager textFieldSelectionManager, @NotNull PreviewableHandwritingGesture gesture, @Nullable CancellationSignal cancellationSignal) {
        if (legacyTextFieldState != null) {
            return HandwritingGestureApi34.INSTANCE.previewHandwritingGesture$foundation_release(legacyTextFieldState, gesture, textFieldSelectionManager, cancellationSignal);
        }
        return false;
    }
}
