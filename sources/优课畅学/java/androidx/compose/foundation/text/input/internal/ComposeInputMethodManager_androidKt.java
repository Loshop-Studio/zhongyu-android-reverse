package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class ComposeInputMethodManager_androidKt {
    private static InterfaceC10570l ComposeInputMethodManagerFactory = new InterfaceC10570l() { // from class: androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt$ComposeInputMethodManagerFactory$1
        @Override // p300x7.InterfaceC10570l
        public final ComposeInputMethodManager invoke(View view) {
            return Build.VERSION.SDK_INT >= 34 ? new ComposeInputMethodManagerImplApi34(view) : new ComposeInputMethodManagerImplApi24(view);
        }
    };

    public static final ComposeInputMethodManager ComposeInputMethodManager(View view) {
        return (ComposeInputMethodManager) ComposeInputMethodManagerFactory.invoke(view);
    }

    @VisibleForTesting
    public static final InterfaceC10570l overrideComposeInputMethodManagerFactoryForTests(InterfaceC10570l interfaceC10570l) {
        InterfaceC10570l interfaceC10570l2 = ComposeInputMethodManagerFactory;
        ComposeInputMethodManagerFactory = interfaceC10570l;
        return interfaceC10570l2;
    }
}
