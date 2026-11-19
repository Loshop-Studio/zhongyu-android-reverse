package androidx.compose.p013ui.internal;

import androidx.exifinterface.media.ExifInterface;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(m13557d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u0005\u001a\u001c\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0080\b\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0080\b\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001a/\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\b\u0010\u0002\u001a\u0004\u0018\u0001H\bH\u0080\b\u0082\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0002\u0010\n\u001a=\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\b\u0010\u0002\u001a\u0004\u0018\u0001H\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0080\b\u0082\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0002\u0010\u000b\u001a*\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0080\b\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001a=\u0010\r\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\b\u0010\u0002\u001a\u0004\u0018\u0001H\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0080\b\u0082\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0002\u0010\u000b\u001a\u0010\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0006H\u0000¨\u0006\u0016"}, m13558d2 = {"checkPrecondition", "", "value", "", "lazyMessage", "Lkotlin/Function0;", "", "checkPreconditionNotNull", ExifInterface.GPS_DIRECTION_TRUE, "", "(Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "requirePrecondition", "requirePreconditionNotNull", "throwIllegalArgumentException", "message", "throwIllegalArgumentExceptionForNullCheck", "", "throwIllegalStateException", "throwIllegalStateExceptionForNullCheck", "throwIndexOutOfBoundsException", "throwUnsupportedOperationException", "ui_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class InlineClassHelperKt {
    public static final void checkPrecondition(boolean z9, Function0<String> function0) {
        if (z9) {
            return;
        }
        throwIllegalStateException(function0.invoke());
    }

    public static final <T> T checkPreconditionNotNull(T t10, Function0<String> function0) {
        if (t10 != null) {
            return t10;
        }
        throwIllegalStateExceptionForNullCheck(function0.invoke());
        throw new KotlinNothingValueException();
    }

    public static final void requirePrecondition(boolean z9, Function0<String> function0) {
        if (z9) {
            return;
        }
        throwIllegalArgumentException(function0.invoke());
    }

    public static final <T> T requirePreconditionNotNull(T t10, Function0<String> function0) {
        if (t10 != null) {
            return t10;
        }
        throwIllegalArgumentExceptionForNullCheck(function0.invoke());
        throw new KotlinNothingValueException();
    }

    public static final void throwIllegalArgumentException(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final Void throwIllegalArgumentExceptionForNullCheck(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void throwIllegalStateException(String str) {
        throw new IllegalStateException(str);
    }

    public static final Void throwIllegalStateExceptionForNullCheck(String str) {
        throw new IllegalStateException(str);
    }

    public static final void throwIndexOutOfBoundsException(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static final void throwUnsupportedOperationException(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static final void checkPrecondition(boolean z9) {
        if (z9) {
            return;
        }
        throwIllegalStateException("Check failed.");
    }

    public static final <T> T checkPreconditionNotNull(T t10) {
        if (t10 != null) {
            return t10;
        }
        throwIllegalStateExceptionForNullCheck("Required value was null.");
        throw new KotlinNothingValueException();
    }
}
