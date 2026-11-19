package androidx.compose.p006ui.text.input;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.DoNotInline;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0017J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m5175d2 = {"Landroidx/compose/ui/text/input/ImmHelper21;", "Landroidx/compose/ui/text/input/ImmHelper;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "hideSoftInput", "", "imm", "Landroid/view/inputmethod/InputMethodManager;", "showSoftInput", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class ImmHelper21 implements ImmHelper {
    private final View view;

    public ImmHelper21(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSoftInput$lambda$0(InputMethodManager imm, ImmHelper21 this$0) {
        Intrinsics.checkNotNullParameter(imm, "$imm");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        imm.showSoftInput(this$0.view, 0);
    }

    @Override // androidx.compose.p006ui.text.input.ImmHelper
    @DoNotInline
    public void hideSoftInput(InputMethodManager imm) {
        Intrinsics.checkNotNullParameter(imm, "imm");
        imm.hideSoftInputFromWindow(this.view.getWindowToken(), 0);
    }

    @Override // androidx.compose.p006ui.text.input.ImmHelper
    @DoNotInline
    public void showSoftInput(final InputMethodManager imm) {
        Intrinsics.checkNotNullParameter(imm, "imm");
        this.view.post(new Runnable() { // from class: androidx.compose.ui.text.input.a
            @Override // java.lang.Runnable
            public final void run() {
                ImmHelper21.showSoftInput$lambda$0(imm, this);
            }
        });
    }
}
