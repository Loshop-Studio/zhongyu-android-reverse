package androidx.compose.p014ui.platform;

import android.view.ActionMode;
import android.view.View;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.platform.actionmodecallback.FloatingTextActionModeCallback;
import androidx.compose.p014ui.platform.actionmodecallback.TextActionModeCallback;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.asm.Opcodes;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class AndroidTextToolbar implements TextToolbar {
    public static final int $stable = 8;
    private ActionMode actionMode;
    private final View view;
    private final TextActionModeCallback textActionModeCallback = new TextActionModeCallback(new InterfaceC9529a() { // from class: androidx.compose.ui.platform.AndroidTextToolbar$textActionModeCallback$1
        {
            super(0);
        }

        @Override // p181hd.InterfaceC9529a
        public /* bridge */ /* synthetic */ Object invoke() {
            m32638invoke();
            return C10786q.f26013a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m32638invoke() {
            this.this$0.actionMode = null;
        }
    }, null, null, null, null, null, null, Opcodes.IAND, null);
    private TextToolbarStatus status = TextToolbarStatus.Hidden;

    public AndroidTextToolbar(View view) {
        this.view = view;
    }

    @Override // androidx.compose.p014ui.platform.TextToolbar
    public TextToolbarStatus getStatus() {
        return this.status;
    }

    @Override // androidx.compose.p014ui.platform.TextToolbar
    public void hide() {
        this.status = TextToolbarStatus.Hidden;
        ActionMode actionMode = this.actionMode;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.actionMode = null;
    }

    @Override // androidx.compose.p014ui.platform.TextToolbar
    public void showMenu(Rect rect, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, InterfaceC9529a interfaceC9529a3, InterfaceC9529a interfaceC9529a4, InterfaceC9529a interfaceC9529a5) {
        this.textActionModeCallback.setRect(rect);
        this.textActionModeCallback.setOnCopyRequested(interfaceC9529a);
        this.textActionModeCallback.setOnCutRequested(interfaceC9529a3);
        this.textActionModeCallback.setOnPasteRequested(interfaceC9529a2);
        this.textActionModeCallback.setOnSelectAllRequested(interfaceC9529a4);
        this.textActionModeCallback.setOnAutofillRequested(interfaceC9529a5);
        ActionMode actionMode = this.actionMode;
        if (actionMode == null) {
            this.status = TextToolbarStatus.Shown;
            this.actionMode = TextToolbarHelperMethods.INSTANCE.startActionMode(this.view, new FloatingTextActionModeCallback(this.textActionModeCallback), 1);
        } else if (actionMode != null) {
            actionMode.invalidate();
        }
    }

    @Override // androidx.compose.p014ui.platform.TextToolbar
    public void showMenu(Rect rect, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, InterfaceC9529a interfaceC9529a3, InterfaceC9529a interfaceC9529a4) {
        showMenu(rect, interfaceC9529a, interfaceC9529a2, interfaceC9529a3, interfaceC9529a4, null);
    }
}
