package androidx.activity;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Lambda;
import p181hd.InterfaceC9529a;

/* loaded from: classes.dex */
public final class ComponentActivity$onBackPressedDispatcher$2 extends Lambda implements InterfaceC9529a {
    final /* synthetic */ ComponentActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComponentActivity$onBackPressedDispatcher$2(ComponentActivity componentActivity) {
        super(0);
        this.this$0 = componentActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(ComponentActivity componentActivity) {
        try {
            super/*android.app.Activity*/.onBackPressed();
        } catch (IllegalStateException e10) {
            if (!AbstractC9979u.m20289b(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e10;
            }
        } catch (NullPointerException e11) {
            if (!AbstractC9979u.m20289b(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e11;
            }
        }
    }

    @Override // p181hd.InterfaceC9529a
    public final OnBackPressedDispatcher invoke() {
        final ComponentActivity componentActivity = this.this$0;
        final OnBackPressedDispatcher onBackPressedDispatcher = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.j
            @Override // java.lang.Runnable
            public final void run() {
                ComponentActivity$onBackPressedDispatcher$2.invoke$lambda$0(componentActivity);
            }
        });
        final ComponentActivity componentActivity2 = this.this$0;
        if (Build.VERSION.SDK_INT >= 33) {
            if (!AbstractC9979u.m20289b(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.access$addObserverForBackInvoker(componentActivity2, onBackPressedDispatcher);
                    }
                });
                return onBackPressedDispatcher;
            }
            componentActivity2.addObserverForBackInvoker(onBackPressedDispatcher);
        }
        return onBackPressedDispatcher;
    }
}
