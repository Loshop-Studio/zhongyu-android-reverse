package com.zykj.student.dialogue.p076ui.ask;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelKt;
import com.zykj.student.dialogue.base.BaseViewModel;
import com.zykj.student.dialogue.bean.resp.CourseItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p158k6.InterfaceC8287g;
import p180m6.C8993e0;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/ask/AskQuestionViewModel;", "Lcom/zykj/student/dialogue/base/BaseViewModel;", "Lk6/g;", "dialogueApi", "<init>", "(Lk6/g;)V", "", "keyword", "", "o", "(Ljava/lang/String;)V", "Lcom/zykj/student/dialogue/bean/resp/CourseItem;", "item", "p", "(Lcom/zykj/student/dialogue/bean/resp/CourseItem;)V", "q", "()Ljava/lang/String;", "r", "()V", "c", "Lk6/g;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lm6/e0;", "d", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_uiState", "Lkotlinx/coroutines/flow/StateFlow;", "e", "Lkotlinx/coroutines/flow/StateFlow;", "s", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAskQuestionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AskQuestionViewModel.kt\ncom/zykj/student/dialogue/ui/ask/AskQuestionViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,61:1\n230#2,5:62\n*S KotlinDebug\n*F\n+ 1 AskQuestionViewModel.kt\ncom/zykj/student/dialogue/ui/ask/AskQuestionViewModel\n*L\n45#1:62,5\n*E\n"})
/* loaded from: classes5.dex */
public final class AskQuestionViewModel extends BaseViewModel {

    /* renamed from: c, reason: from kotlin metadata */
    public final InterfaceC8287g dialogueApi;

    /* renamed from: d, reason: from kotlin metadata */
    public final MutableStateFlow _uiState;

    /* renamed from: e, reason: from kotlin metadata */
    public final StateFlow uiState;

    public AskQuestionViewModel(InterfaceC8287g dialogueApi) {
        Intrinsics.checkNotNullParameter(dialogueApi, "dialogueApi");
        this.dialogueApi = dialogueApi;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new C8993e0(null, false, null, null, 15, null));
        this._uiState = MutableStateFlow;
        this.uiState = FlowKt.asStateFlow(MutableStateFlow);
        m10069r();
    }

    /* renamed from: o */
    public final void m10066o(String keyword) {
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AskQuestionViewModel$changeKeyWord$1(this, keyword, null), 3, null);
    }

    /* renamed from: p */
    public final void m10067p(CourseItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        MutableStateFlow mutableStateFlow = this._uiState;
        while (true) {
            Object value = mutableStateFlow.getValue();
            CourseItem courseItem = item;
            if (mutableStateFlow.compareAndSet(value, C8993e0.m14371b((C8993e0) value, null, false, null, courseItem, 7, null))) {
                return;
            } else {
                item = courseItem;
            }
        }
    }

    /* renamed from: q */
    public final String m10068q() {
        CourseItem courseItemM14373c = ((C8993e0) this.uiState.getValue()).m14373c();
        if (courseItemM14373c != null) {
            return courseItemM14373c.getId();
        }
        return null;
    }

    /* renamed from: r */
    public final void m10069r() {
        BaseViewModel.m9917f(this, null, false, null, null, null, new AskQuestionViewModel$getCourseList$1(this, null), 31, null);
    }

    /* renamed from: s, reason: from getter */
    public final StateFlow getUiState() {
        return this.uiState;
    }
}
