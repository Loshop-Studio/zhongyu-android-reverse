package androidx.compose.p013ui.platform;

import android.view.ActionMode;
import android.view.View;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.platform.actionmodecallback.FloatingTextActionModeCallback;
import androidx.compose.p013ui.platform.actionmodecallback.TextActionModeCallback;
import androidx.compose.runtime.internal.StabilityInferred;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class AndroidTextToolbar implements TextToolbar {
    public static final int $stable = 8;
    private ActionMode actionMode;
    private final View view;
    private final TextActionModeCallback textActionModeCallback = new TextActionModeCallback(new InterfaceC10559a() { // from class: androidx.compose.ui.platform.AndroidTextToolbar$textActionModeCallback$1
        {
            super(0);
        }

        @Override // p300x7.InterfaceC10559a
        public /* bridge */ /* synthetic */ Object invoke() {
            m26036invoke();
            return C8736p.f16368a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m26036invoke() {
            this.this$0.actionMode = null;
        }
    }, null, null, null, null, null, null, 126, null);
    private TextToolbarStatus status = TextToolbarStatus.Hidden;

    public AndroidTextToolbar(View view) {
        this.view = view;
    }

    @Override // androidx.compose.p013ui.platform.TextToolbar
    public TextToolbarStatus getStatus() {
        return this.status;
    }

    @Override // androidx.compose.p013ui.platform.TextToolbar
    public void hide() {
        this.status = TextToolbarStatus.Hidden;
        ActionMode actionMode = this.actionMode;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.actionMode = null;
    }

    @Override // androidx.compose.p013ui.platform.TextToolbar
    public void showMenu(Rect rect, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2, InterfaceC10559a interfaceC10559a3, InterfaceC10559a interfaceC10559a4, InterfaceC10559a interfaceC10559a5) {
        this.textActionModeCallback.setRect(rect);
        this.textActionModeCallback.setOnCopyRequested(interfaceC10559a);
        this.textActionModeCallback.setOnCutRequested(interfaceC10559a3);
        this.textActionModeCallback.setOnPasteRequested(interfaceC10559a2);
        this.textActionModeCallback.setOnSelectAllRequested(interfaceC10559a4);
        this.textActionModeCallback.setOnAutofillRequested(interfaceC10559a5);
        ActionMode actionMode = this.actionMode;
        if (actionMode == null) {
            this.status = TextToolbarStatus.Shown;
            this.actionMode = TextToolbarHelperMethods.INSTANCE.startActionMode(this.view, new FloatingTextActionModeCallback(this.textActionModeCallback), 1);
        } else if (actionMode != null) {
            actionMode.invalidate();
        }
    }

    @Override // androidx.compose.p013ui.platform.TextToolbar
    public void showMenu(Rect rect, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2, InterfaceC10559a interfaceC10559a3, InterfaceC10559a interfaceC10559a4) {
        showMenu(rect, interfaceC10559a, interfaceC10559a2, interfaceC10559a3, interfaceC10559a4, null);
    }
}
