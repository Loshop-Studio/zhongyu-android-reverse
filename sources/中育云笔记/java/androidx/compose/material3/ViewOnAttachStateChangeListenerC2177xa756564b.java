package androidx.compose.material3;

import android.view.View;
import android.view.ViewTreeObserver;
import p181hd.InterfaceC9529a;

/* renamed from: androidx.compose.material3.ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1 */
/* loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC2177xa756564b implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ InterfaceC9529a $onKeyboardVisibilityChange;
    final /* synthetic */ View $view;
    private boolean isListeningToGlobalLayout;

    public ViewOnAttachStateChangeListenerC2177xa756564b(View view, InterfaceC9529a interfaceC9529a) {
        this.$view = view;
        this.$onKeyboardVisibilityChange = interfaceC9529a;
        view.addOnAttachStateChangeListener(this);
        registerOnGlobalLayoutListener();
    }

    private final void registerOnGlobalLayoutListener() {
        if (this.isListeningToGlobalLayout || !this.$view.isAttachedToWindow()) {
            return;
        }
        this.$view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.isListeningToGlobalLayout = true;
    }

    private final void unregisterOnGlobalLayoutListener() {
        if (this.isListeningToGlobalLayout) {
            this.$view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.isListeningToGlobalLayout = false;
        }
    }

    public final void dispose() {
        unregisterOnGlobalLayoutListener();
        this.$view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.$onKeyboardVisibilityChange.invoke();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        registerOnGlobalLayoutListener();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        unregisterOnGlobalLayoutListener();
    }
}
