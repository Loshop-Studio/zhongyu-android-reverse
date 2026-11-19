package androidx.compose.p013ui.input.key;

import android.view.KeyEvent;
import androidx.compose.p013ui.Modifier;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
final class InterceptedKeyInputNode extends Modifier.Node implements SoftKeyboardInterceptionModifierNode {
    private InterfaceC10570l onEvent;
    private InterfaceC10570l onPreEvent;

    public InterceptedKeyInputNode(InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2) {
        this.onEvent = interfaceC10570l;
        this.onPreEvent = interfaceC10570l2;
    }

    public final InterfaceC10570l getOnEvent() {
        return this.onEvent;
    }

    public final InterfaceC10570l getOnPreEvent() {
        return this.onPreEvent;
    }

    @Override // androidx.compose.p013ui.input.key.SoftKeyboardInterceptionModifierNode
    /* renamed from: onInterceptKeyBeforeSoftKeyboard-ZmokQxo, reason: not valid java name */
    public boolean mo25044onInterceptKeyBeforeSoftKeyboardZmokQxo(KeyEvent keyEvent) {
        InterfaceC10570l interfaceC10570l = this.onEvent;
        if (interfaceC10570l != null) {
            return ((Boolean) interfaceC10570l.invoke(KeyEvent.m25340boximpl(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.p013ui.input.key.SoftKeyboardInterceptionModifierNode
    /* renamed from: onPreInterceptKeyBeforeSoftKeyboard-ZmokQxo, reason: not valid java name */
    public boolean mo25045onPreInterceptKeyBeforeSoftKeyboardZmokQxo(KeyEvent keyEvent) {
        InterfaceC10570l interfaceC10570l = this.onPreEvent;
        if (interfaceC10570l != null) {
            return ((Boolean) interfaceC10570l.invoke(KeyEvent.m25340boximpl(keyEvent))).booleanValue();
        }
        return false;
    }

    public final void setOnEvent(InterfaceC10570l interfaceC10570l) {
        this.onEvent = interfaceC10570l;
    }

    public final void setOnPreEvent(InterfaceC10570l interfaceC10570l) {
        this.onPreEvent = interfaceC10570l;
    }
}
