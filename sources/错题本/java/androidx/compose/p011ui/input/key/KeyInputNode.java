package androidx.compose.p011ui.input.key;

import android.view.KeyEvent;
import androidx.compose.p011ui.Modifier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\fR0\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R0\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, m5110d2 = {"Landroidx/compose/ui/input/key/KeyInputNode;", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "onEvent", "onPreEvent", "<init>", "(Lr6/c;Lr6/c;)V", NotificationCompat.CATEGORY_EVENT, "onKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "onKeyEvent", "onPreKeyEvent-ZmokQxo", "onPreKeyEvent", "Lr6/c;", "getOnEvent", "()Lr6/c;", "setOnEvent", "(Lr6/c;)V", "getOnPreEvent", "setOnPreEvent", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
final class KeyInputNode extends Modifier.Node implements KeyInputModifierNode {

    @Nullable
    private InterfaceC6471c onEvent;

    @Nullable
    private InterfaceC6471c onPreEvent;

    public KeyInputNode(@Nullable InterfaceC6471c interfaceC6471c, @Nullable InterfaceC6471c interfaceC6471c2) {
        this.onEvent = interfaceC6471c;
        this.onPreEvent = interfaceC6471c2;
    }

    @Nullable
    public final InterfaceC6471c getOnEvent() {
        return this.onEvent;
    }

    @Nullable
    public final InterfaceC6471c getOnPreEvent() {
        return this.onPreEvent;
    }

    @Override // androidx.compose.p011ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo */
    public boolean mo6723onKeyEventZmokQxo(@NotNull KeyEvent event) {
        InterfaceC6471c interfaceC6471c = this.onEvent;
        if (interfaceC6471c != null) {
            return ((Boolean) interfaceC6471c.invoke(KeyEvent.m11746boximpl(event))).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.p011ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo */
    public boolean mo6725onPreKeyEventZmokQxo(@NotNull KeyEvent event) {
        InterfaceC6471c interfaceC6471c = this.onPreEvent;
        if (interfaceC6471c != null) {
            return ((Boolean) interfaceC6471c.invoke(KeyEvent.m11746boximpl(event))).booleanValue();
        }
        return false;
    }

    public final void setOnEvent(@Nullable InterfaceC6471c interfaceC6471c) {
        this.onEvent = interfaceC6471c;
    }

    public final void setOnPreEvent(@Nullable InterfaceC6471c interfaceC6471c) {
        this.onPreEvent = interfaceC6471c;
    }
}
