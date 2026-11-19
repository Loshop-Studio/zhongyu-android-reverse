package androidx.collection.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\b\u0010\t\u001a4\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\fH\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0004\u001a4\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\fH\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001¢\u0006\u0004\b\u0011\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, m5110d2 = {"", "message", "Ld6/s;", "throwIllegalStateException", "(Ljava/lang/String;)V", "throwIndexOutOfBoundsException", "throwNoSuchElementException", "", "throwNoSuchElementExceptionForInline", "(Ljava/lang/String;)Ljava/lang/Void;", "", "value", "Lkotlin/Function0;", "lazyMessage", "checkPrecondition", "(ZLr6/a;)V", "throwIllegalArgumentException", "requirePrecondition", "collection"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class RuntimeHelpersKt {
    public static final void checkPrecondition(boolean z8, @NotNull InterfaceC6469a lazyMessage) {
        AbstractC5830k.m5330g(lazyMessage, "lazyMessage");
        if (z8) {
            return;
        }
        throwIllegalStateException((String) lazyMessage.invoke());
    }

    public static final void requirePrecondition(boolean z8, @NotNull InterfaceC6469a lazyMessage) {
        AbstractC5830k.m5330g(lazyMessage, "lazyMessage");
        if (z8) {
            return;
        }
        throwIllegalArgumentException((String) lazyMessage.invoke());
    }

    public static final void throwIllegalArgumentException(@NotNull String message) {
        AbstractC5830k.m5330g(message, "message");
        throw new IllegalArgumentException(message);
    }

    public static final void throwIllegalStateException(@NotNull String message) {
        AbstractC5830k.m5330g(message, "message");
        throw new IllegalStateException(message);
    }

    public static final void throwIndexOutOfBoundsException(@NotNull String message) {
        AbstractC5830k.m5330g(message, "message");
        throw new IndexOutOfBoundsException(message);
    }

    public static final void throwNoSuchElementException(@NotNull String message) {
        AbstractC5830k.m5330g(message, "message");
        throw new NoSuchElementException(message);
    }

    @PublishedApi
    @NotNull
    public static final Void throwNoSuchElementExceptionForInline(@NotNull String message) {
        AbstractC5830k.m5330g(message, "message");
        throw new NoSuchElementException(message);
    }
}
