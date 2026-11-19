package com.zykj.student.dialogue.p076ui.home;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012R\u001f\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00148\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0012R\u001f\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00148\u0006¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\u0018R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012R\u001f\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00148\u0006¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b \u0010\u0018¨\u0006%"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "Ljava/util/Date;", "date", "", "l", "(Ljava/util/Date;)V", "j", "m", "k", "Ljava/text/SimpleDateFormat;", "a", "Ljava/text/SimpleDateFormat;", "simpleDateFormat", "Lkotlinx/coroutines/flow/MutableStateFlow;", "b", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_startDate", "Lkotlinx/coroutines/flow/StateFlow;", "c", "Lkotlinx/coroutines/flow/StateFlow;", "h", "()Lkotlinx/coroutines/flow/StateFlow;", "startDate", "d", "_endDate", "e", "f", "endDate", "_startTime", "g", "i", "startTime", "_endTime", "endTime", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
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

    /* renamed from: f, reason: from getter */
    public final StateFlow getEndDate() {
        return this.endDate;
    }

    /* renamed from: g, reason: from getter */
    public final StateFlow getEndTime() {
        return this.endTime;
    }

    /* renamed from: h, reason: from getter */
    public final StateFlow getStartDate() {
        return this.startDate;
    }

    /* renamed from: i, reason: from getter */
    public final StateFlow getStartTime() {
        return this.startTime;
    }

    /* renamed from: j */
    public final void m10571j(Date date) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DatePickerViewModel$updateEndDate$1(this, date, null), 3, null);
    }

    /* renamed from: k */
    public final void m10572k(Date date) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DatePickerViewModel$updateEndTime$1(this, date, null), 3, null);
    }

    /* renamed from: l */
    public final void m10573l(Date date) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DatePickerViewModel$updateStartDate$1(this, date, null), 3, null);
    }

    /* renamed from: m */
    public final void m10574m(Date date) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DatePickerViewModel$updateStartTime$1(this, date, null), 3, null);
    }
}
