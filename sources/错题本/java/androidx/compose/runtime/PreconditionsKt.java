package androidx.compose.runtime;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a1\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007H\u0080\b\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\u0004\u001a1\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007H\u0080\b\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001¢\u0006\u0004\b\f\u0010\n\u001a#\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0080\b\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m5110d2 = {"", "message", "Ld6/s;", "throwIllegalArgumentException", "(Ljava/lang/String;)V", "", "value", "Lkotlin/Function0;", "lazyMessage", "requirePrecondition", "(ZLr6/a;)V", "throwIllegalStateException", "checkPrecondition", "(Z)V", "runtime_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class PreconditionsKt {
    public static final void checkPrecondition(boolean z8, @NotNull InterfaceC6469a interfaceC6469a) {
        if (z8) {
            return;
        }
        throwIllegalStateException((String) interfaceC6469a.invoke());
    }

    public static final void requirePrecondition(boolean z8, @NotNull InterfaceC6469a interfaceC6469a) {
        if (z8) {
            return;
        }
        throwIllegalArgumentException((String) interfaceC6469a.invoke());
    }

    public static final void throwIllegalArgumentException(@NotNull String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void throwIllegalStateException(@NotNull String str) {
        throw new IllegalStateException(str);
    }

    public static final void checkPrecondition(boolean z8) {
        if (z8) {
            return;
        }
        throwIllegalStateException("Check failed.");
    }
}
