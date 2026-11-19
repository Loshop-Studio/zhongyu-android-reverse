package com.zykj.student.dialogue.p076ui.detail.viewmodel;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import android.app.Application;
import androidx.camera.video.AudioStats;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.datastore.core.DataStore;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModelKt;
import com.zykj.student.dialogue.base.BaseViewModel;
import com.zykj.student.dialogue.bean.resp.MessageResponse;
import com.zykj.student.dialogue.p076ui.detail.viewmodel.AbstractC7538a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p138i6.AbstractC8136b;
import p158k6.InterfaceC8287g;
import p214p6.C9335j;
import p214p6.C9336k;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u001a¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\r¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\r2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b/\u00100J\u001a\u00102\u001a\u00020\r2\b\b\u0002\u00101\u001a\u00020\u001aH\u0086@¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\r¢\u0006\u0004\b4\u0010*J\r\u00105\u001a\u00020\r¢\u0006\u0004\b5\u0010*J\u0015\u00107\u001a\u00020\r2\u0006\u00106\u001a\u00020\u001a¢\u0006\u0004\b7\u0010(J\r\u00108\u001a\u00020\r¢\u0006\u0004\b8\u0010*J)\u0010;\u001a\u00020\r2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\r092\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\r09¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020B0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010@R\u001d\u0010M\u001a\b\u0012\u0004\u0012\u00020\u001a0H8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010R\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR$\u0010\u0019\u001a\u00020\u00142\u0006\u0010S\u001a\u00020\u00148\u0006@BX\u0086.¢\u0006\f\n\u0004\bT\u0010O\u001a\u0004\bU\u0010QR\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010(R$\u0010`\u001a\u00020[2\u0006\u0010S\u001a\u00020[8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u001c\u0010c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010a0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010@R\u001f\u0010f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010a0H8\u0006¢\u0006\f\n\u0004\bd\u0010J\u001a\u0004\be\u0010LR\u001a\u0010h\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010@R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0H8\u0006¢\u0006\f\n\u0004\bi\u0010J\u001a\u0004\bj\u0010LR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00100k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100o8\u0006¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u001a\u0010u\u001a\b\u0012\u0004\u0012\u00020\u001a0k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010mR\u001d\u0010y\u001a\b\u0012\u0004\u0012\u00020\u001a0k8\u0006¢\u0006\f\n\u0004\bv\u0010m\u001a\u0004\bw\u0010xR\u001d\u0010{\u001a\b\u0012\u0004\u0012\u00020\u001a0H8\u0006¢\u0006\f\n\u0004\bz\u0010J\u001a\u0004\b{\u0010L¨\u0006|"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;", "Lcom/zykj/student/dialogue/base/BaseViewModel;", "Lk6/g;", "dialogueApi", "Landroid/app/Application;", "application", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zykj/message/server/bean/UserInfo;", "userInfoFlow", "<init>", "(Lk6/g;Landroid/app/Application;Lkotlinx/coroutines/flow/MutableStateFlow;)V", "Lp6/k;", "viewState", "", "y", "(Lp6/k;)V", "Lcom/zykj/student/dialogue/ui/detail/viewmodel/b;", NotificationCompat.CATEGORY_EVENT, "x", "(Lcom/zykj/student/dialogue/ui/detail/viewmodel/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "sessionId", "P", "(Ljava/lang/String;)V", "J", "questionId", "", "fromCollectHistory", "R", "(Ljava/lang/String;Z)V", "", "videoProgress", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "(I)V", "", "speedRate", "U", "(D)V", "resumePlaying", ExifInterface.LATITUDE_SOUTH, "(Z)V", "O", "()V", "Lcom/zykj/student/dialogue/ui/detail/viewmodel/a;", "action", "w", "(Lcom/zykj/student/dialogue/ui/detail/viewmodel/a;)V", "M", "(Lcom/zykj/student/dialogue/ui/detail/viewmodel/b;)V", "selectLast", "D", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.LONGITUDE_WEST, "understood", "X", "Q", "Lkotlin/Function0;", "onShowDialog", "N", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "c", "Lk6/g;", "d", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "e", "Landroidx/datastore/core/DataStore;", "dataStore", "f", "_hasChanged", "Lkotlinx/coroutines/flow/StateFlow;", "g", "Lkotlinx/coroutines/flow/StateFlow;", "C", "()Lkotlinx/coroutines/flow/StateFlow;", "hasChanged", "h", "Ljava/lang/String;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "()Ljava/lang/String;", "filePrefixPath", "value", "i", "I", "j", "Z", "B", "()Z", "setFromCollectHistory", "Lp6/j;", "k", "Lp6/j;", "G", "()Lp6/j;", "playInfo", "Lcom/zykj/student/dialogue/bean/resp/QuestionResp;", "l", "_questionBean", "m", "H", "questionBean", "n", "_viewState", "o", "K", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "p", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_event", "Lkotlinx/coroutines/flow/SharedFlow;", "q", "Lkotlinx/coroutines/flow/SharedFlow;", "z", "()Lkotlinx/coroutines/flow/SharedFlow;", "r", "_isPermit", "s", "L", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "isPermit", "t", "isNoRemind", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAnswerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnswerViewModel.kt\ncom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,529:1\n774#2:530\n865#2,2:531\n*S KotlinDebug\n*F\n+ 1 AnswerViewModel.kt\ncom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel\n*L\n231#1:530\n231#1:531,2\n*E\n"})
/* loaded from: classes5.dex */
public final class AnswerViewModel extends BaseViewModel {

    /* renamed from: c, reason: from kotlin metadata */
    public final InterfaceC8287g dialogueApi;

    /* renamed from: d, reason: from kotlin metadata */
    public final MutableStateFlow userInfoFlow;

    /* renamed from: e, reason: from kotlin metadata */
    public final DataStore dataStore;

    /* renamed from: f, reason: from kotlin metadata */
    public final MutableStateFlow _hasChanged;

    /* renamed from: g, reason: from kotlin metadata */
    public final StateFlow hasChanged;

    /* renamed from: h, reason: from kotlin metadata */
    public final String filePrefixPath;

    /* renamed from: i, reason: from kotlin metadata */
    public String questionId;

    /* renamed from: j, reason: from kotlin metadata */
    public boolean fromCollectHistory;

    /* renamed from: k, reason: from kotlin metadata */
    public C9335j playInfo;

    /* renamed from: l, reason: from kotlin metadata */
    public final MutableStateFlow _questionBean;

    /* renamed from: m, reason: from kotlin metadata */
    public final StateFlow questionBean;

    /* renamed from: n, reason: from kotlin metadata */
    public final MutableStateFlow _viewState;

    /* renamed from: o, reason: from kotlin metadata */
    public final StateFlow viewState;

    /* renamed from: p, reason: from kotlin metadata */
    public final MutableSharedFlow _event;

    /* renamed from: q, reason: from kotlin metadata */
    public final SharedFlow event;

    /* renamed from: r, reason: from kotlin metadata */
    public final MutableSharedFlow _isPermit;

    /* renamed from: s, reason: from kotlin metadata */
    public final MutableSharedFlow isPermit;

    /* renamed from: t, reason: from kotlin metadata */
    public final StateFlow isNoRemind;

    public AnswerViewModel(InterfaceC8287g dialogueApi, Application application, MutableStateFlow userInfoFlow) {
        Intrinsics.checkNotNullParameter(dialogueApi, "dialogueApi");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(userInfoFlow, "userInfoFlow");
        this.dialogueApi = dialogueApi;
        this.userInfoFlow = userInfoFlow;
        DataStore dataStoreM13035c = AbstractC8136b.m13035c(application);
        this.dataStore = dataStoreM13035c;
        Boolean bool = Boolean.FALSE;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this._hasChanged = MutableStateFlow;
        this.hasChanged = FlowKt.asStateFlow(MutableStateFlow);
        File externalCacheDir = application.getExternalCacheDir();
        this.filePrefixPath = (externalCacheDir != null ? externalCacheDir.getAbsolutePath() : null) + "/Dialogue/lesson/";
        this.playInfo = new C9335j(0, false, AudioStats.AUDIO_AMPLITUDE_NONE, 7, null);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this._questionBean = MutableStateFlow2;
        this.questionBean = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(new C9336k(null, 0, false, null, 0L, false, 63, null));
        this._viewState = MutableStateFlow3;
        this.viewState = MutableStateFlow3;
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._event = mutableSharedFlowMutableSharedFlow$default;
        this.event = mutableSharedFlowMutableSharedFlow$default;
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._isPermit = mutableSharedFlowMutableSharedFlow$default2;
        this.isPermit = mutableSharedFlowMutableSharedFlow$default2;
        this.isNoRemind = FlowKt.stateIn(FlowKt.combine(dataStoreM13035c.getData(), userInfoFlow, new AnswerViewModel$isNoRemind$1(null)), ViewModelKt.getViewModelScope(this), SharingStarted.INSTANCE.getEagerly(), bool);
    }

    /* renamed from: E */
    public static final void m10447E(AnswerViewModel answerViewModel, Throwable th) {
        C9336k c9336k = (C9336k) answerViewModel._viewState.getValue();
        Result.Companion companion = Result.INSTANCE;
        answerViewModel.m10483y(C9336k.m15226b(c9336k, Result.m24757boximpl(Result.m24758constructorimpl(ResultKt.createFailure(th))), 0, false, null, 0L, false, 62, null));
    }

    /* renamed from: F */
    public static final int m10448F(List list, AnswerViewModel answerViewModel) {
        int size;
        if (((C9336k) answerViewModel._viewState.getValue()).m15242q() == Tab.f11245a) {
            size = list.size();
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((MessageResponse) obj).isPrimary()) {
                    arrayList.add(obj);
                }
            }
            size = arrayList.size();
        }
        return size - 1;
    }

    /* renamed from: A, reason: from getter */
    public final String getFilePrefixPath() {
        return this.filePrefixPath;
    }

    /* renamed from: B, reason: from getter */
    public final boolean getFromCollectHistory() {
        return this.fromCollectHistory;
    }

    /* renamed from: C, reason: from getter */
    public final StateFlow getHasChanged() {
        return this.hasChanged;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10462D(boolean r15, kotlin.coroutines.Continuation r16) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.student.dialogue.p076ui.detail.viewmodel.AnswerViewModel.m10462D(boolean, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/随身答/smali_classes5/com/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel.smali:926
    }

    /* renamed from: G, reason: from getter */
    public final C9335j getPlayInfo() {
        return this.playInfo;
    }

    /* renamed from: H, reason: from getter */
    public final StateFlow getQuestionBean() {
        return this.questionBean;
    }

    /* renamed from: I */
    public final String m10465I() {
        String str = this.questionId;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("questionId");
        return null;
    }

    /* renamed from: J */
    public final void m10466J(String sessionId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnswerViewModel$getSessionById$1(this, sessionId, null), 3, null);
    }

    /* renamed from: K, reason: from getter */
    public final StateFlow getViewState() {
        return this.viewState;
    }

    /* renamed from: L, reason: from getter */
    public final MutableSharedFlow getIsPermit() {
        return this.isPermit;
    }

    /* renamed from: M */
    public final void m10469M(AbstractC7539b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnswerViewModel$onEvent$1(event, this, null), 3, null);
    }

    /* renamed from: N */
    public final void m10470N(Function0 onShowDialog, Function0 action) {
        Intrinsics.checkNotNullParameter(onShowDialog, "onShowDialog");
        Intrinsics.checkNotNullParameter(action, "action");
        if (((Boolean) this.isNoRemind.getValue()).booleanValue()) {
            action.invoke();
        } else {
            onShowDialog.invoke();
        }
    }

    /* renamed from: O */
    public final void m10471O() {
        this.playInfo.m15222d();
    }

    /* renamed from: P */
    public final void m10472P(String sessionId) {
        BaseViewModel.m9917f(this, null, false, null, null, null, new AnswerViewModel$resetReadState$1(this, sessionId, null), 31, null);
    }

    /* renamed from: Q */
    public final void m10473Q() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnswerViewModel$setNoRemind$1(this, null), 3, null);
    }

    /* renamed from: R */
    public final void m10474R(String questionId, boolean fromCollectHistory) {
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        this.questionId = questionId;
        this.fromCollectHistory = fromCollectHistory;
        m10466J(questionId);
        m10481w(new AbstractC7538a.d(false, 1, null));
    }

    /* renamed from: S */
    public final void m10475S(boolean resumePlaying) {
        this.playInfo.m15223e(resumePlaying);
    }

    /* renamed from: T */
    public final void m10476T() {
        BaseViewModel.m9917f(this, null, false, null, null, null, new AnswerViewModel$setSessionState$1(this, null), 31, null);
    }

    /* renamed from: U */
    public final void m10477U(double speedRate) {
        this.playInfo.m15224f(speedRate);
    }

    /* renamed from: V */
    public final void m10478V(int videoProgress) {
        this.playInfo.m15225g(videoProgress);
    }

    /* renamed from: W */
    public final void m10479W() {
        BaseViewModel.m9917f(this, null, false, null, null, null, new AnswerViewModel$updateCollectState$1(this, null), 31, null);
    }

    /* renamed from: X */
    public final void m10480X(boolean understood) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnswerViewModel$updateUnderstood$1(this, understood, null), 3, null);
    }

    /* renamed from: w */
    public final void m10481w(AbstractC7538a action) {
        Intrinsics.checkNotNullParameter(action, "action");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnswerViewModel$dispatch$1(this, action, null), 3, null);
    }

    /* renamed from: x */
    public final Object m10482x(AbstractC7539b abstractC7539b, Continuation continuation) {
        Object objEmit = this._event.emit(abstractC7539b, continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }

    /* renamed from: y */
    public final void m10483y(C9336k viewState) {
        this._viewState.setValue(viewState);
    }

    /* renamed from: z, reason: from getter */
    public final SharedFlow getEvent() {
        return this.event;
    }
}
