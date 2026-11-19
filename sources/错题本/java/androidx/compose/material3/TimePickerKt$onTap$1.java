package androidx.compose.material3;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;

@Metadata(m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "androidx.compose.material3.TimePickerKt", m5303f = "TimePicker.kt", m5304i = {0, 0, 1, 1}, m5305l = {894, 897}, m5306m = "onTap-rOwcSBo", m5307n = {"$this$onTap_u2drOwcSBo", "autoSwitchToMinute", "$this$onTap_u2drOwcSBo", "autoSwitchToMinute"}, m5308s = {"L$0", "Z$0", "L$0", "Z$0"})
/* loaded from: classes.dex */
public final class TimePickerKt$onTap$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    public TimePickerKt$onTap$1(InterfaceC5631c<? super TimePickerKt$onTap$1> interfaceC5631c) {
        super(interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TimePickerKt.m9143onTaprOwcSBo(null, 0.0f, 0.0f, 0.0f, false, 0L, this);
    }
}
