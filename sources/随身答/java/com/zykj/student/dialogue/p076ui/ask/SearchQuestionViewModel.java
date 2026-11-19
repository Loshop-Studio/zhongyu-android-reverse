package com.zykj.student.dialogue.p076ui.ask;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelKt;
import com.zykj.student.dialogue.base.BaseViewModel;
import com.zykj.student.dialogue.bean.resp.CollectSession;
import com.zykj.student.dialogue.upload.OssTaskManger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p158k6.InterfaceC8287g;
import p180m6.C9005k0;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001(B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001d0!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006)"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;", "Lcom/zykj/student/dialogue/base/BaseViewModel;", "Lk6/g;", "dialogueApi", "Lcom/zykj/student/dialogue/upload/OssTaskManger;", "ossTaskManger", "<init>", "(Lk6/g;Lcom/zykj/student/dialogue/upload/OssTaskManger;)V", "Lcom/zykj/student/dialogue/bean/resp/CollectSession;", "collectSession", "", "o", "(Lcom/zykj/student/dialogue/bean/resp/CollectSession;)V", "", "imageUrl", "q", "(Ljava/lang/String;)V", "sessionId", "", "collected", "r", "(Ljava/lang/String;Z)V", "fileAbsolutePath", "s", "c", "Lk6/g;", "d", "Lcom/zykj/student/dialogue/upload/OssTaskManger;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lm6/k0;", "e", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_uiState", "Lkotlinx/coroutines/flow/StateFlow;", "f", "Lkotlinx/coroutines/flow/StateFlow;", "p", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "g", "a", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class SearchQuestionViewModel extends BaseViewModel {

    /* renamed from: h */
    public static final int f10673h = 8;

    /* renamed from: c, reason: from kotlin metadata */
    public final InterfaceC8287g dialogueApi;

    /* renamed from: d, reason: from kotlin metadata */
    public final OssTaskManger ossTaskManger;

    /* renamed from: e, reason: from kotlin metadata */
    public final MutableStateFlow _uiState;

    /* renamed from: f, reason: from kotlin metadata */
    public final StateFlow uiState;

    public SearchQuestionViewModel(InterfaceC8287g dialogueApi, OssTaskManger ossTaskManger) {
        Intrinsics.checkNotNullParameter(dialogueApi, "dialogueApi");
        Intrinsics.checkNotNullParameter(ossTaskManger, "ossTaskManger");
        this.dialogueApi = dialogueApi;
        this.ossTaskManger = ossTaskManger;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new C9005k0(null, 1, null));
        this._uiState = MutableStateFlow;
        this.uiState = FlowKt.asStateFlow(MutableStateFlow);
    }

    /* renamed from: o */
    public final void m10081o(CollectSession collectSession) {
        Intrinsics.checkNotNullParameter(collectSession, "collectSession");
        BaseViewModel.m9917f(this, null, false, null, null, null, new SearchQuestionViewModel$changeCollect$1(collectSession, this, null), 31, null);
    }

    /* renamed from: p, reason: from getter */
    public final StateFlow getUiState() {
        return this.uiState;
    }

    /* renamed from: q */
    public final void m10083q(String imageUrl) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        BaseViewModel.m9917f(this, null, true, null, null, null, new SearchQuestionViewModel$searchQuestions$1(this, imageUrl, null), 29, null);
    }

    /* renamed from: r */
    public final void m10084r(String sessionId, boolean collected) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SearchQuestionViewModel$updateLocalCollectState$1(this, sessionId, collected, null), 3, null);
    }

    /* renamed from: s */
    public final void m10085s(String fileAbsolutePath) {
        Intrinsics.checkNotNullParameter(fileAbsolutePath, "fileAbsolutePath");
        OssTaskManger.m11052f(this.ossTaskManger, "UPLOAD_SEARCH_IMAGE_WORK_NAME", fileAbsolutePath, 0, null, null, 28, null);
    }
}
