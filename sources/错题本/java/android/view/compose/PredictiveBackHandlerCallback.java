package android.view.compose;

import android.view.BackEventCompat;
import android.view.OnBackPressedCallback;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001BP\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00127\u0010\u000f\u001a3\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u0019R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fRS\u0010\u000f\u001a3\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, m5110d2 = {"Landroidx/activity/compose/PredictiveBackHandlerCallback;", "Landroidx/activity/OnBackPressedCallback;", "", "enabled", "Lkotlinx/coroutines/v;", "onBackScope", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/f;", "Landroidx/activity/BackEventCompat;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "progress", "Lh6/c;", "Ld6/s;", "", "currentOnBack", "<init>", "(ZLkotlinx/coroutines/v;Lr6/e;)V", "setIsEnabled", "(Z)V", "backEvent", "handleOnBackStarted", "(Landroidx/activity/BackEventCompat;)V", "handleOnBackProgressed", "handleOnBackPressed", "()V", "handleOnBackCancelled", "Lkotlinx/coroutines/v;", "getOnBackScope", "()Lkotlinx/coroutines/v;", "setOnBackScope", "(Lkotlinx/coroutines/v;)V", "Lr6/e;", "getCurrentOnBack", "()Lr6/e;", "setCurrentOnBack", "(Lr6/e;)V", "Landroidx/activity/compose/OnBackInstance;", "onBackInstance", "Landroidx/activity/compose/OnBackInstance;", "isActive", "Z", "activity-compose_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class PredictiveBackHandlerCallback extends OnBackPressedCallback {

    @NotNull
    private InterfaceC6473e currentOnBack;
    private boolean isActive;

    @Nullable
    private OnBackInstance onBackInstance;

    @NotNull
    private InterfaceC6009v onBackScope;

    public PredictiveBackHandlerCallback(boolean z8, @NotNull InterfaceC6009v interfaceC6009v, @NotNull InterfaceC6473e interfaceC6473e) {
        super(z8);
        this.onBackScope = interfaceC6009v;
        this.currentOnBack = interfaceC6473e;
    }

    @NotNull
    public final InterfaceC6473e getCurrentOnBack() {
        return this.currentOnBack;
    }

    @NotNull
    public final InterfaceC6009v getOnBackScope() {
        return this.onBackScope;
    }

    @Override // android.view.OnBackPressedCallback
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

    @Override // android.view.OnBackPressedCallback
    public void handleOnBackPressed() {
        OnBackInstance onBackInstance = this.onBackInstance;
        if (onBackInstance != null && !onBackInstance.getIsPredictiveBack()) {
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

    @Override // android.view.OnBackPressedCallback
    public void handleOnBackProgressed(@NotNull BackEventCompat backEvent) {
        super.handleOnBackProgressed(backEvent);
        OnBackInstance onBackInstance = this.onBackInstance;
        if (onBackInstance != null) {
            onBackInstance.m6510sendJP2dKIU(backEvent);
        }
    }

    @Override // android.view.OnBackPressedCallback
    public void handleOnBackStarted(@NotNull BackEventCompat backEvent) {
        super.handleOnBackStarted(backEvent);
        OnBackInstance onBackInstance = this.onBackInstance;
        if (onBackInstance != null) {
            onBackInstance.cancel();
        }
        if (getIsEnabled()) {
            this.onBackInstance = new OnBackInstance(this.onBackScope, true, this.currentOnBack, this);
        }
        this.isActive = true;
    }

    public final void setCurrentOnBack(@NotNull InterfaceC6473e interfaceC6473e) {
        this.currentOnBack = interfaceC6473e;
    }

    public final void setIsEnabled(boolean enabled) {
        OnBackInstance onBackInstance;
        if (!enabled && !this.isActive && getIsEnabled() && (onBackInstance = this.onBackInstance) != null) {
            onBackInstance.cancel();
        }
        setEnabled(enabled);
    }

    public final void setOnBackScope(@NotNull InterfaceC6009v interfaceC6009v) {
        this.onBackScope = interfaceC6009v;
    }
}
