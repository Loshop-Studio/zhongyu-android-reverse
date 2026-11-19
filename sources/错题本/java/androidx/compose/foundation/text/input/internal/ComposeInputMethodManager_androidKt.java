package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a/\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\"\"\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m5110d2 = {"Landroid/view/View;", "view", "Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;", "ComposeInputMethodManager", "(Landroid/view/View;)Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;", "Lkotlin/Function1;", "factory", "overrideComposeInputMethodManagerFactoryForTests", "(Lr6/c;)Lr6/c;", "ComposeInputMethodManagerFactory", "Lr6/c;", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ComposeInputMethodManager_androidKt {

    @NotNull
    private static InterfaceC6471c ComposeInputMethodManagerFactory = new InterfaceC6471c() { // from class: androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt$ComposeInputMethodManagerFactory$1
        @Override // p152r6.InterfaceC6471c
        public final ComposeInputMethodManager invoke(View view) {
            return Build.VERSION.SDK_INT >= 34 ? new ComposeInputMethodManagerImplApi34(view) : new ComposeInputMethodManagerImplApi24(view);
        }
    };

    @NotNull
    public static final ComposeInputMethodManager ComposeInputMethodManager(@NotNull View view) {
        return (ComposeInputMethodManager) ComposeInputMethodManagerFactory.invoke(view);
    }

    @TestOnly
    @VisibleForTesting
    @NotNull
    public static final InterfaceC6471c overrideComposeInputMethodManagerFactoryForTests(@NotNull InterfaceC6471c interfaceC6471c) {
        InterfaceC6471c interfaceC6471c2 = ComposeInputMethodManagerFactory;
        ComposeInputMethodManagerFactory = interfaceC6471c;
        return interfaceC6471c2;
    }
}
