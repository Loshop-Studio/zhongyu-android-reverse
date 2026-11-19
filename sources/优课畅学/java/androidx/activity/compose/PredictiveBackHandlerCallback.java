package androidx.activity.compose;

import androidx.activity.BackEventCompat;
import androidx.activity.OnBackPressedCallback;
import kotlinx.coroutines.channels.C9160c;
import p135i8.InterfaceC8822b0;
import p300x7.InterfaceC10574p;

/* loaded from: classes.dex */
final class PredictiveBackHandlerCallback extends OnBackPressedCallback {
    private InterfaceC10574p currentOnBack;
    private boolean isActive;
    private OnBackInstance onBackInstance;
    private InterfaceC8822b0 onBackScope;

    public PredictiveBackHandlerCallback(boolean z10, InterfaceC8822b0 interfaceC8822b0, InterfaceC10574p interfaceC10574p) {
        super(z10);
        this.onBackScope = interfaceC8822b0;
        this.currentOnBack = interfaceC10574p;
    }

    public final InterfaceC10574p getCurrentOnBack() {
        return this.currentOnBack;
    }

    public final InterfaceC8822b0 getOnBackScope() {
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
            C9160c.m16531b(onBackInstance.m20104sendJP2dKIU(backEventCompat));
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

    public final void setCurrentOnBack(InterfaceC10574p interfaceC10574p) {
        this.currentOnBack = interfaceC10574p;
    }

    public final void setIsEnabled(boolean z10) {
        OnBackInstance onBackInstance;
        if (!z10 && !this.isActive && isEnabled() && (onBackInstance = this.onBackInstance) != null) {
            onBackInstance.cancel();
        }
        setEnabled(z10);
    }

    public final void setOnBackScope(InterfaceC8822b0 interfaceC8822b0) {
        this.onBackScope = interfaceC8822b0;
    }
}
