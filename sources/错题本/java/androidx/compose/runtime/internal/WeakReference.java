package androidx.compose.runtime.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 2)
@Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m5110d2 = {"Landroidx/compose/runtime/internal/WeakReference;", ExifInterface.GPS_DIRECTION_TRUE, "", "Ljava/lang/ref/WeakReference;", TypedValues.Custom.S_REFERENCE, "(Ljava/lang/Object;)V", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class WeakReference<T> extends java.lang.ref.WeakReference<T> {
    public static final int $stable = 0;

    public WeakReference(@NotNull T t8) {
        super(t8);
    }
}
