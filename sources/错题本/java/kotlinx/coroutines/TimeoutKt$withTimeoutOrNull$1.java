package kotlinx.coroutines;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.location.LocationRequestCompat;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;

@Metadata(m5111k = 3, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "kotlinx.coroutines.TimeoutKt", m5303f = "Timeout.kt", m5304i = {0, 0, 0}, m5305l = {LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY}, m5306m = "withTimeoutOrNull", m5307n = {"block", "coroutine", "timeMillis"}, m5308s = {"L$0", "L$1", "J$0"})
/* loaded from: classes4.dex */
final class TimeoutKt$withTimeoutOrNull$1<T> extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public TimeoutKt$withTimeoutOrNull$1(InterfaceC5631c<? super TimeoutKt$withTimeoutOrNull$1> interfaceC5631c) {
        super(interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC6014x.m5628H(0L, null, this);
    }
}
