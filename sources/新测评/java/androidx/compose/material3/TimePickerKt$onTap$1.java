package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.compose.material3.TimePickerKt", m13596f = "TimePicker.kt", m13597i = {0, 0, 1, 1}, m13598l = {894, 897}, m13599m = "onTap-rOwcSBo", m13600n = {"$this$onTap_u2drOwcSBo", "autoSwitchToMinute", "$this$onTap_u2drOwcSBo", "autoSwitchToMinute"}, m13601s = {"L$0", "Z$0", "L$0", "Z$0"})
/* loaded from: classes2.dex */
public final class TimePickerKt$onTap$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    public TimePickerKt$onTap$1(Continuation<? super TimePickerKt$onTap$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TimePickerKt.m19468onTaprOwcSBo(null, 0.0f, 0.0f, 0.0f, false, 0L, this);
    }
}
