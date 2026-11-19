package androidx.compose.p011ui.platform;

import android.view.ActionMode;
import android.view.View;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.platform.actionmodecallback.FloatingTextActionModeCallback;
import androidx.compose.p011ui.platform.actionmodecallback.TextActionModeCallback;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005Jg\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010JW\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m5110d2 = {"Landroidx/compose/ui/platform/AndroidTextToolbar;", "Landroidx/compose/ui/platform/TextToolbar;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Landroidx/compose/ui/geometry/Rect;", "rect", "Lkotlin/Function0;", "Ld6/s;", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "onAutofillRequested", "showMenu", "(Landroidx/compose/ui/geometry/Rect;Lr6/a;Lr6/a;Lr6/a;Lr6/a;Lr6/a;)V", "(Landroidx/compose/ui/geometry/Rect;Lr6/a;Lr6/a;Lr6/a;Lr6/a;)V", "hide", "()V", "Landroid/view/View;", "Landroid/view/ActionMode;", "actionMode", "Landroid/view/ActionMode;", "Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;", "textActionModeCallback", "Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;", "Landroidx/compose/ui/platform/TextToolbarStatus;", "<set-?>", NotificationCompat.CATEGORY_STATUS, "Landroidx/compose/ui/platform/TextToolbarStatus;", "getStatus", "()Landroidx/compose/ui/platform/TextToolbarStatus;", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class AndroidTextToolbar implements TextToolbar {
    public static final int $stable = 8;

    @Nullable
    private ActionMode actionMode;

    @NotNull
    private final View view;

    @NotNull
    private final TextActionModeCallback textActionModeCallback = new TextActionModeCallback(new InterfaceC6469a() { // from class: androidx.compose.ui.platform.AndroidTextToolbar$textActionModeCallback$1
        {
            super(0);
        }

        @Override // p152r6.InterfaceC6469a
        public /* bridge */ /* synthetic */ Object invoke() {
            m12442invoke();
            return C5443s.f8405a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m12442invoke() {
            this.this$0.actionMode = null;
        }
    }, null, null, null, null, null, null, 126, null);

    @NotNull
    private TextToolbarStatus status = TextToolbarStatus.Hidden;

    public AndroidTextToolbar(@NotNull View view) {
        this.view = view;
    }

    @Override // androidx.compose.p011ui.platform.TextToolbar
    @NotNull
    public TextToolbarStatus getStatus() {
        return this.status;
    }

    @Override // androidx.compose.p011ui.platform.TextToolbar
    public void hide() {
        this.status = TextToolbarStatus.Hidden;
        ActionMode actionMode = this.actionMode;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.actionMode = null;
    }

    @Override // androidx.compose.p011ui.platform.TextToolbar
    public void showMenu(@NotNull Rect rect, @Nullable InterfaceC6469a onCopyRequested, @Nullable InterfaceC6469a onPasteRequested, @Nullable InterfaceC6469a onCutRequested, @Nullable InterfaceC6469a onSelectAllRequested, @Nullable InterfaceC6469a onAutofillRequested) {
        this.textActionModeCallback.setRect(rect);
        this.textActionModeCallback.setOnCopyRequested(onCopyRequested);
        this.textActionModeCallback.setOnCutRequested(onCutRequested);
        this.textActionModeCallback.setOnPasteRequested(onPasteRequested);
        this.textActionModeCallback.setOnSelectAllRequested(onSelectAllRequested);
        this.textActionModeCallback.setOnAutofillRequested(onAutofillRequested);
        ActionMode actionMode = this.actionMode;
        if (actionMode != null) {
            actionMode.invalidate();
        } else {
            this.status = TextToolbarStatus.Shown;
            this.actionMode = TextToolbarHelperMethods.INSTANCE.startActionMode(this.view, new FloatingTextActionModeCallback(this.textActionModeCallback), 1);
        }
    }

    @Override // androidx.compose.p011ui.platform.TextToolbar
    public void showMenu(@NotNull Rect rect, @Nullable InterfaceC6469a onCopyRequested, @Nullable InterfaceC6469a onPasteRequested, @Nullable InterfaceC6469a onCutRequested, @Nullable InterfaceC6469a onSelectAllRequested) {
        showMenu(rect, onCopyRequested, onPasteRequested, onCutRequested, onSelectAllRequested, null);
    }
}
