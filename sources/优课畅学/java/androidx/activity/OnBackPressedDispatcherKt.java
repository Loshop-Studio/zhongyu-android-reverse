package androidx.activity;

import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcherKt {
    public static final OnBackPressedCallback addCallback(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, final boolean z10, final InterfaceC10570l onBackPressed) {
        AbstractC9133u.m16133g(onBackPressedDispatcher, "<this>");
        AbstractC9133u.m16133g(onBackPressed, "onBackPressed");
        OnBackPressedCallback onBackPressedCallback = new OnBackPressedCallback(z10) { // from class: androidx.activity.OnBackPressedDispatcherKt$addCallback$callback$1
            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                onBackPressed.invoke(this);
            }
        };
        if (lifecycleOwner != null) {
            onBackPressedDispatcher.addCallback(lifecycleOwner, onBackPressedCallback);
            return onBackPressedCallback;
        }
        onBackPressedDispatcher.addCallback(onBackPressedCallback);
        return onBackPressedCallback;
    }

    public static /* synthetic */ OnBackPressedCallback addCallback$default(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, boolean z10, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lifecycleOwner = null;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return addCallback(onBackPressedDispatcher, lifecycleOwner, z10, interfaceC10570l);
    }
}
