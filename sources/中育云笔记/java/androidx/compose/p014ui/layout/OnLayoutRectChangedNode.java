package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.node.DelegatableNode;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
final class OnLayoutRectChangedNode extends Modifier.Node {
    private InterfaceC9540l callback;
    private long debounceMillis;
    private DelegatableNode.RegistrationHandle handle;
    private long throttleMillis;

    public OnLayoutRectChangedNode(long j10, long j11, InterfaceC9540l interfaceC9540l) {
        this.throttleMillis = j10;
        this.debounceMillis = j11;
        this.callback = interfaceC9540l;
    }

    public final void disposeAndRegister() {
        DelegatableNode.RegistrationHandle registrationHandle = this.handle;
        if (registrationHandle != null) {
            registrationHandle.unregister();
        }
        this.handle = OnLayoutRectChangedModifierKt.registerOnLayoutRectChanged(this, this.throttleMillis, this.debounceMillis, this.callback);
    }

    public final InterfaceC9540l getCallback() {
        return this.callback;
    }

    public final long getDebounceMillis() {
        return this.debounceMillis;
    }

    public final DelegatableNode.RegistrationHandle getHandle() {
        return this.handle;
    }

    public final long getThrottleMillis() {
        return this.throttleMillis;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        disposeAndRegister();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        DelegatableNode.RegistrationHandle registrationHandle = this.handle;
        if (registrationHandle != null) {
            registrationHandle.unregister();
        }
    }

    public final void setCallback(InterfaceC9540l interfaceC9540l) {
        this.callback = interfaceC9540l;
    }

    public final void setDebounceMillis(long j10) {
        this.debounceMillis = j10;
    }

    public final void setHandle(DelegatableNode.RegistrationHandle registrationHandle) {
        this.handle = registrationHandle;
    }

    public final void setThrottleMillis(long j10) {
        this.throttleMillis = j10;
    }
}
