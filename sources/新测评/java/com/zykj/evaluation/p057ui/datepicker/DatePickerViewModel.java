package com.zykj.evaluation.p057ui.datepicker;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001f\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u001f\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\r8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u000bR\u001f\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\r8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u000bR\u001f\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\r8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u000f\u001a\u0004\b \u0010\u0011¨\u0006\""}, m13558d2 = {"Lcom/zykj/evaluation/ui/datepicker/DatePickerViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "Ljava/text/SimpleDateFormat;", "a", "Ljava/text/SimpleDateFormat;", "simpleDateFormat", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Ljava/util/Date;", "b", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_startDate", "Lkotlinx/coroutines/flow/StateFlow;", "c", "Lkotlinx/coroutines/flow/StateFlow;", "getStartDate", "()Lkotlinx/coroutines/flow/StateFlow;", "startDate", "d", "_endDate", "e", "getEndDate", "endDate", "f", "_startTime", "g", "getStartTime", "startTime", "h", "_endTime", "i", "getEndTime", "endTime", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final class DatePickerViewModel extends ViewModel {

    /* renamed from: a, reason: from kotlin metadata */
    public final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.CHINA);

    /* renamed from: b, reason: from kotlin metadata */
    public final MutableStateFlow _startDate;

    /* renamed from: c, reason: from kotlin metadata */
    public final StateFlow startDate;

    /* renamed from: d, reason: from kotlin metadata */
    public final MutableStateFlow _endDate;

    /* renamed from: e, reason: from kotlin metadata */
    public final StateFlow endDate;

    /* renamed from: f, reason: from kotlin metadata */
    public final MutableStateFlow _startTime;

    /* renamed from: g, reason: from kotlin metadata */
    public final StateFlow startTime;

    /* renamed from: h, reason: from kotlin metadata */
    public final MutableStateFlow _endTime;

    /* renamed from: i, reason: from kotlin metadata */
    public final StateFlow endTime;

    public DatePickerViewModel() {
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._startDate = MutableStateFlow;
        this.startDate = MutableStateFlow;
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this._endDate = MutableStateFlow2;
        this.endDate = MutableStateFlow2;
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this._startTime = MutableStateFlow3;
        this.startTime = MutableStateFlow3;
        MutableStateFlow MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this._endTime = MutableStateFlow4;
        this.endTime = MutableStateFlow4;
    }
}
