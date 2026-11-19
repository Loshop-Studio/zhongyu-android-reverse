package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public final class ComposeInputMethodManager_androidKt {
    private static InterfaceC9540l ComposeInputMethodManagerFactory = new InterfaceC9540l() { // from class: androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt$ComposeInputMethodManagerFactory$1
        @Override // p181hd.InterfaceC9540l
        public final ComposeInputMethodManager invoke(View view) {
            return Build.VERSION.SDK_INT >= 34 ? new ComposeInputMethodManagerImplApi34(view) : new ComposeInputMethodManagerImplApi24(view);
        }
    };

    public static final ComposeInputMethodManager ComposeInputMethodManager(View view) {
        return (ComposeInputMethodManager) ComposeInputMethodManagerFactory.invoke(view);
    }

    @VisibleForTesting
    public static final InterfaceC9540l overrideComposeInputMethodManagerFactoryForTests(InterfaceC9540l interfaceC9540l) {
        InterfaceC9540l interfaceC9540l2 = ComposeInputMethodManagerFactory;
        ComposeInputMethodManagerFactory = interfaceC9540l;
        return interfaceC9540l2;
    }
}
