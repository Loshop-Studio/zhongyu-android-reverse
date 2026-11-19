package com.zykj.student.dialogue.p076ui.detail.viewmodel;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModelKt;
import androidx.work.WorkManager;
import com.zykj.student.dialogue.base.BaseViewModel;
import com.zykj.student.dialogue.upload.OssTaskManger;
import java.io.File;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import p158k6.InterfaceC8287g;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J?\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u001f0!2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u001fH\u0086@¢\u0006\u0004\b#\u0010$J\u001e\u0010'\u001a\u00020\u00112\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0%H\u0086@¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00103\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00100R$\u0010\u0010\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020:098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020:0>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B¨\u0006D"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;", "Lcom/zykj/student/dialogue/base/BaseViewModel;", "Lk6/g;", "dialogueApi", "Landroidx/work/WorkManager;", "workManager", "Lcom/zykj/student/dialogue/upload/OssTaskManger;", "ossTaskManger", "Landroid/app/Application;", "application", "<init>", "(Lk6/g;Landroidx/work/WorkManager;Lcom/zykj/student/dialogue/upload/OssTaskManger;Landroid/app/Application;)V", "", "r", "()Ljava/lang/String;", "", "previewImageAdded", "", "u", "(Z)V", "sessionId", "contentUrl", "screenshotUrl", "o", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "courseId", "", "answerUserIds", "summary", "p", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V", "", "imagePathList", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/work/WorkInfo;", "v", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "imageUrls", "t", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "Lk6/g;", "d", "Landroidx/work/WorkManager;", "e", "Lcom/zykj/student/dialogue/upload/OssTaskManger;", "f", "Ljava/lang/String;", "dirName", "g", "filePath", "value", "h", "Z", "s", "()Z", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/zykj/student/dialogue/ui/detail/viewmodel/c;", "i", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_event", "Lkotlinx/coroutines/flow/SharedFlow;", "j", "Lkotlinx/coroutines/flow/SharedFlow;", "q", "()Lkotlinx/coroutines/flow/SharedFlow;", NotificationCompat.CATEGORY_EVENT, "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNewAnswerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewAnswerViewModel.kt\ncom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,193:1\n1563#2:194\n1634#2,3:195\n1563#2:198\n1634#2,3:199\n*S KotlinDebug\n*F\n+ 1 NewAnswerViewModel.kt\ncom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel\n*L\n120#1:194\n120#1:195,3\n166#1:198\n166#1:199,3\n*E\n"})
/* loaded from: classes5.dex */
public final class NewAnswerViewModel extends BaseViewModel {

    /* renamed from: c, reason: from kotlin metadata */
    public final InterfaceC8287g dialogueApi;

    /* renamed from: d, reason: from kotlin metadata */
    public final WorkManager workManager;

    /* renamed from: e, reason: from kotlin metadata */
    public final OssTaskManger ossTaskManger;

    /* renamed from: f, reason: from kotlin metadata */
    public final String dirName;

    /* renamed from: g, reason: from kotlin metadata */
    public final String filePath;

    /* renamed from: h, reason: from kotlin metadata */
    public boolean previewImageAdded;

    /* renamed from: i, reason: from kotlin metadata */
    public final MutableSharedFlow _event;

    /* renamed from: j, reason: from kotlin metadata */
    public final SharedFlow event;

    public NewAnswerViewModel(InterfaceC8287g dialogueApi, WorkManager workManager, OssTaskManger ossTaskManger, Application application) {
        Intrinsics.checkNotNullParameter(dialogueApi, "dialogueApi");
        Intrinsics.checkNotNullParameter(workManager, "workManager");
        Intrinsics.checkNotNullParameter(ossTaskManger, "ossTaskManger");
        Intrinsics.checkNotNullParameter(application, "application");
        this.dialogueApi = dialogueApi;
        this.workManager = workManager;
        this.ossTaskManger = ossTaskManger;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.dirName = string;
        File externalCacheDir = application.getExternalCacheDir();
        this.filePath = (externalCacheDir != null ? externalCacheDir.getAbsolutePath() : null) + "/Dialogue/lesson/" + string;
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._event = mutableSharedFlowMutableSharedFlow$default;
        this.event = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    /* renamed from: o */
    public final void m10489o(String sessionId, String contentUrl, String screenshotUrl) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(contentUrl, "contentUrl");
        Intrinsics.checkNotNullParameter(screenshotUrl, "screenshotUrl");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NewAnswerViewModel$addAnswer$1(this, sessionId, screenshotUrl, contentUrl, null), 3, null);
    }

    /* renamed from: p */
    public final void m10490p(String courseId, String contentUrl, String screenshotUrl, String[] answerUserIds, String summary) {
        Intrinsics.checkNotNullParameter(courseId, "courseId");
        Intrinsics.checkNotNullParameter(contentUrl, "contentUrl");
        Intrinsics.checkNotNullParameter(screenshotUrl, "screenshotUrl");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NewAnswerViewModel$createSession$1(this, answerUserIds, courseId, screenshotUrl, contentUrl, summary, null), 3, null);
    }

    /* renamed from: q, reason: from getter */
    public final SharedFlow getEvent() {
        return this.event;
    }

    /* renamed from: r, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    /* renamed from: s, reason: from getter */
    public final boolean getPreviewImageAdded() {
        return this.previewImageAdded;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10494t(java.util.Set r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.zykj.student.dialogue.p076ui.detail.viewmodel.NewAnswerViewModel$monitorPictures$1
            if (r0 == 0) goto L13
            r0 = r9
            com.zykj.student.dialogue.ui.detail.viewmodel.NewAnswerViewModel$monitorPictures$1 r0 = (com.zykj.student.dialogue.p076ui.detail.viewmodel.NewAnswerViewModel$monitorPictures$1) r0
            int r1 = r0.f11228e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11228e = r1
            goto L18
        L13:
            com.zykj.student.dialogue.ui.detail.viewmodel.NewAnswerViewModel$monitorPictures$1 r0 = new com.zykj.student.dialogue.ui.detail.viewmodel.NewAnswerViewModel$monitorPictures$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f11226c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f11228e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r8 = r0.f11224a
            java.util.Set r8 = (java.util.Set) r8
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L2d
            goto L67
        L2d:
            r8 = move-exception
            goto L6d
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlin.Result$Companion r9 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L2d
            k6.g r9 = r7.dialogueApi     // Catch: java.lang.Throwable -> L2d
            com.zykj.student.dialogue.bean.req.MonitorPictureReq r2 = new com.zykj.student.dialogue.bean.req.MonitorPictureReq     // Catch: java.lang.Throwable -> L2d
            java.lang.String r4 = "随身答"
            java.lang.String r5 = com.blankj.utilcode.util.AppUtils.getAppPackageName()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r6 = "getAppPackageName(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)     // Catch: java.lang.Throwable -> L2d
            r6 = r8
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch: java.lang.Throwable -> L2d
            java.util.List r6 = kotlin.collections.CollectionsKt.toList(r6)     // Catch: java.lang.Throwable -> L2d
            r2.<init>(r4, r5, r6)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)     // Catch: java.lang.Throwable -> L2d
            r0.f11224a = r8     // Catch: java.lang.Throwable -> L2d
            r8 = 0
            r0.f11225b = r8     // Catch: java.lang.Throwable -> L2d
            r0.f11228e = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r9 = r9.m13393i(r2, r0)     // Catch: java.lang.Throwable -> L2d
            if (r9 != r1) goto L67
            return r1
        L67:
            com.zykj.student.dialogue.network.BaseResponse r9 = (com.zykj.student.dialogue.network.BaseResponse) r9     // Catch: java.lang.Throwable -> L2d
            kotlin.Result.m24758constructorimpl(r9)     // Catch: java.lang.Throwable -> L2d
            goto L76
        L6d:
            kotlin.Result$Companion r9 = kotlin.Result.INSTANCE
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            kotlin.Result.m24758constructorimpl(r8)
        L76:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.student.dialogue.p076ui.detail.viewmodel.NewAnswerViewModel.m10494t(java.util.Set, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/随身答/smali_classes5/com/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel.smali:552
    }

    /* renamed from: u */
    public final void m10495u(boolean previewImageAdded) {
        this.previewImageAdded = previewImageAdded;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10496v(java.util.List r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.student.dialogue.p076ui.detail.viewmodel.NewAnswerViewModel.m10496v(java.util.List, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/随身答/smali_classes5/com/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel.smali:829
    }
}
