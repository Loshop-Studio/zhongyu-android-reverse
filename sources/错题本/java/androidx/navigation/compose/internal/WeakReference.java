package androidx.navigation.compose.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\"\u0010\r\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00018\u00008\u00000\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m5110d2 = {"Landroidx/navigation/compose/internal/WeakReference;", "", ExifInterface.GPS_DIRECTION_TRUE, TypedValues.Custom.S_REFERENCE, "<init>", "(Ljava/lang/Object;)V", "get", "()Ljava/lang/Object;", "Ld6/s;", "clear", "()V", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "weakReference", "Ljava/lang/ref/WeakReference;", "navigation-compose_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class WeakReference<T> {
    public static final int $stable = 8;

    @NotNull
    private final java.lang.ref.WeakReference<T> weakReference;

    public WeakReference(@NotNull T t8) {
        this.weakReference = new java.lang.ref.WeakReference<>(t8);
    }

    public final void clear() {
        this.weakReference.clear();
    }

    @Nullable
    public final T get() {
        return this.weakReference.get();
    }
}
