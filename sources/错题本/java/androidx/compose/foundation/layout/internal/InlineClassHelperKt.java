package androidx.compose.foundation.layout.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\u0004\u001a\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\u0004\u001a1\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\fH\u0080\b\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0080\b\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001¢\u0006\u0004\b\u000e\u0010\u0010\u001a?\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00018\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\fH\u0080\b\u0082\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a1\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000H\u0080\b\u0082\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0004\b\u0013\u0010\u0015\u001a1\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\fH\u0080\b\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001¢\u0006\u0004\b\u0016\u0010\u000f¨\u0006\u0017"}, m5110d2 = {"", "message", "Ld6/s;", "throwIllegalStateException", "(Ljava/lang/String;)V", "", "throwIllegalStateExceptionForNullCheck", "(Ljava/lang/String;)Ljava/lang/Void;", "throwIllegalArgumentException", "throwIndexOutOfBoundsException", "", "value", "Lkotlin/Function0;", "lazyMessage", "checkPrecondition", "(ZLr6/a;)V", "(Z)V", "", ExifInterface.GPS_DIRECTION_TRUE, "checkPreconditionNotNull", "(Ljava/lang/Object;Lr6/a;)Ljava/lang/Object;", "(Ljava/lang/Object;)Ljava/lang/Object;", "requirePrecondition", "foundation-layout_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class InlineClassHelperKt {
    public static final void checkPrecondition(boolean z8, @NotNull InterfaceC6469a interfaceC6469a) {
        if (z8) {
            return;
        }
        throwIllegalStateException((String) interfaceC6469a.invoke());
    }

    @NotNull
    public static final <T> T checkPreconditionNotNull(@Nullable T t8, @NotNull InterfaceC6469a interfaceC6469a) {
        if (t8 != null) {
            return t8;
        }
        throwIllegalStateExceptionForNullCheck((String) interfaceC6469a.invoke());
        throw new KotlinNothingValueException();
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

    @NotNull
    public static final Void throwIllegalStateExceptionForNullCheck(@NotNull String str) {
        throw new IllegalStateException(str);
    }

    public static final void throwIndexOutOfBoundsException(@NotNull String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static final void checkPrecondition(boolean z8) {
        if (z8) {
            return;
        }
        throwIllegalStateException("Check failed.");
    }

    @NotNull
    public static final <T> T checkPreconditionNotNull(@Nullable T t8) {
        if (t8 != null) {
            return t8;
        }
        throwIllegalStateExceptionForNullCheck("Required value was null.");
        throw new KotlinNothingValueException();
    }
}
