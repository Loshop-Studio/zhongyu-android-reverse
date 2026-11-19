package androidx.activity.compose;

import androidx.activity.BackEventCompat;
import androidx.activity.OnBackPressedCallback;
import kotlinx.coroutines.channels.C10002c;
import p181hd.InterfaceC9544p;
import sd.InterfaceC11122i0;

/* loaded from: classes.dex */
final class PredictiveBackHandlerCallback extends OnBackPressedCallback {
    private InterfaceC9544p currentOnBack;
    private boolean isActive;
    private OnBackInstance onBackInstance;
    private InterfaceC11122i0 onBackScope;

    public PredictiveBackHandlerCallback(boolean z10, InterfaceC11122i0 interfaceC11122i0, InterfaceC9544p interfaceC9544p) {
        super(z10);
        this.onBackScope = interfaceC11122i0;
        this.currentOnBack = interfaceC9544p;
    }

    public final InterfaceC9544p getCurrentOnBack() {
        return this.currentOnBack;
    }

    public final InterfaceC11122i0 getOnBackScope() {
        return this.onBackScope;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public void handleOnBackCancelled() {
        super.handleOnBackCancelled();
        OnBackInstance onBackInstance = this.onBackInstance;
        if (onBackInstance != null) {
            onBackInstance.cancel();
        }
        OnBackInstance onBackInstance2 = this.onBackInstance;
        if (onBackInstance2 != null) {
            onBackInstance2.setPredictiveBack(false);
        }
        this.isActive = false;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public void handleOnBackPressed() {
        OnBackInstance onBackInstance = this.onBackInstance;
        if (onBackInstance != null && !onBackInstance.isPredictiveBack()) {
            onBackInstance.cancel();
            this.onBackInstance = null;
        }
        if (this.onBackInstance == null) {
            this.onBackInstance = new OnBackInstance(this.onBackScope, false, this.currentOnBack, this);
        }
        OnBackInstance onBackInstance2 = this.onBackInstance;
        if (onBackInstance2 != null) {
            onBackInstance2.close();
        }
        OnBackInstance onBackInstance3 = this.onBackInstance;
        if (onBackInstance3 != null) {
            onBackInstance3.setPredictiveBack(false);
        }
        this.isActive = false;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public void handleOnBackProgressed(BackEventCompat backEventCompat) {
        super.handleOnBackProgressed(backEventCompat);
        OnBackInstance onBackInstance = this.onBackInstance;
        if (onBackInstance != null) {
            C10002c.m20724b(onBackInstance.m26706sendJP2dKIU(backEventCompat));
        }
    }

    @Override // androidx.activity.OnBackPressedCallback
    public void handleOnBackStarted(BackEventCompat backEventCompat) {
        super.handleOnBackStarted(backEventCompat);
        OnBackInstance onBackInstance = this.onBackInstance;
        if (onBackInstance != null) {
            onBackInstance.cancel();
        }
        if (isEnabled()) {
            this.onBackInstance = new OnBackInstance(this.onBackScope, true, this.currentOnBack, this);
        }
        this.isActive = true;
    }

    public final void setCurrentOnBack(InterfaceC9544p interfaceC9544p) {
        this.currentOnBack = interfaceC9544p;
    }

    public final void setIsEnabled(boolean z10) {
        OnBackInstance onBackInstance;
        if (!z10 && !this.isActive && isEnabled() && (onBackInstance = this.onBackInstance) != null) {
            onBackInstance.cancel();
        }
        setEnabled(z10);
    }

    public final void setOnBackScope(InterfaceC11122i0 interfaceC11122i0) {
        this.onBackScope = interfaceC11122i0;
    }
}
