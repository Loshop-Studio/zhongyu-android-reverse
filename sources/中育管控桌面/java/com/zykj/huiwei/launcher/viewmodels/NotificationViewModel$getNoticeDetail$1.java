package com.zykj.huiwei.launcher.viewmodels;

import com.blankj.utilcode.util.AbstractC4669t;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.NotificationViewModel$getNoticeDetail$1", m7918f = "NotificationViewModel.kt", m7919i = {1}, m7920l = {49, 58}, m7921m = "invokeSuspend", m7922n = {"e"}, m7923s = {"L$0"})
/* loaded from: classes4.dex */
public final class NotificationViewModel$getNoticeDetail$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f7286a;

    /* renamed from: b */
    public int f7287b;

    /* renamed from: c */
    public final /* synthetic */ NotificationViewModel f7288c;

    /* renamed from: d */
    public final /* synthetic */ long f7289d;

    @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.NotificationViewModel$getNoticeDetail$1$2", m7918f = "NotificationViewModel.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
    /* renamed from: com.zykj.huiwei.launcher.viewmodels.NotificationViewModel$getNoticeDetail$1$2 */
    public static final class C61912 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {

        /* renamed from: a */
        public int f7290a;

        public C61912(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C61912(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7290a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(AbstractC4669t.m2428b());
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C61912) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationViewModel$getNoticeDetail$1(NotificationViewModel notificationViewModel, long j6, Continuation continuation) {
        super(2, continuation);
        this.f7288c = notificationViewModel;
        this.f7289d = j6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NotificationViewModel$getNoticeDetail$1(this.f7288c, this.f7289d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008d, code lost:
    
        if (r8 != r1) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r7.f7287b
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L26
            if (r0 == r3) goto L1f
            if (r0 != r2) goto L17
            java.lang.Object r0 = r7.f7286a
            java.lang.Exception r0 = (java.lang.Exception) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L90
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Exception -> L23
            goto L47
        L23:
            r0 = move-exception
            r8 = r0
            goto L7b
        L26:
            kotlin.ResultKt.throwOnFailure(r8)
            com.zykj.huiwei.launcher.viewmodels.NotificationViewModel r8 = r7.f7288c
            com.kunminx.architecture.ui.callback.UnPeekLiveData r8 = r8.isDialogVisible()
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            r8.setValue(r0)
            com.zykj.huiwei.launcher.viewmodels.NotificationViewModel r8 = r7.f7288c     // Catch: java.lang.Exception -> L23
            com.zykj.huiwei.launcher.repository.NotificationRepository r8 = com.zykj.huiwei.launcher.viewmodels.NotificationViewModel.m6172a(r8)     // Catch: java.lang.Exception -> L23
            long r4 = r7.f7289d     // Catch: java.lang.Exception -> L23
            r7.f7287b = r3     // Catch: java.lang.Exception -> L23
            java.lang.Object r8 = r8.m5426c(r4, r7)     // Catch: java.lang.Exception -> L23
            if (r8 != r1) goto L47
            goto L8f
        L47:
            com.zykj.http.bean.ApiResp r8 = (com.zykj.http.bean.ApiResp) r8     // Catch: java.lang.Exception -> L23
            boolean r0 = r8.getSuccess()     // Catch: java.lang.Exception -> L23
            if (r0 != 0) goto L6b
            com.zykj.http.bean.ErrorInfo r0 = r8.getError()     // Catch: java.lang.Exception -> L23
            if (r0 == 0) goto L6b
            int r0 = r0.getCode()     // Catch: java.lang.Exception -> L23
            r4 = 10010(0x271a, float:1.4027E-41)
            if (r0 != r4) goto L6b
            com.zykj.huiwei.launcher.viewmodels.NotificationViewModel r8 = r7.f7288c     // Catch: java.lang.Exception -> L23
            androidx.lifecycle.MutableLiveData r8 = com.zykj.huiwei.launcher.viewmodels.NotificationViewModel.m6174c(r8)     // Catch: java.lang.Exception -> L23
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)     // Catch: java.lang.Exception -> L23
            r8.setValue(r0)     // Catch: java.lang.Exception -> L23
            goto Lc4
        L6b:
            java.lang.Object r8 = r8.getResult()     // Catch: java.lang.Exception -> L23
            com.zykj.huiwei.launcher.viewmodels.NotificationViewModel r0 = r7.f7288c     // Catch: java.lang.Exception -> L23
            com.zykj.huiwei.launcher.bean.resp.NoticeBean r8 = (com.zykj.huiwei.launcher.bean.resp.NoticeBean) r8     // Catch: java.lang.Exception -> L23
            androidx.lifecycle.MutableLiveData r0 = com.zykj.huiwei.launcher.viewmodels.NotificationViewModel.m6173b(r0)     // Catch: java.lang.Exception -> L23
            r0.setValue(r8)     // Catch: java.lang.Exception -> L23
            goto Lc4
        L7b:
            kotlinx.coroutines.CoroutineDispatcher r8 = kotlinx.coroutines.Dispatchers.getIO()
            com.zykj.huiwei.launcher.viewmodels.NotificationViewModel$getNoticeDetail$1$2 r3 = new com.zykj.huiwei.launcher.viewmodels.NotificationViewModel$getNoticeDetail$1$2
            r4 = 0
            r3.<init>(r4)
            r7.f7286a = r0
            r7.f7287b = r2
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r8, r3, r7)
            if (r8 != r1) goto L90
        L8f:
            return r1
        L90:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Lad
            com.zykj.huiwei.launcher.viewmodels.NotificationViewModel r8 = r7.f7288c
            com.kunminx.architecture.ui.callback.UnPeekLiveData r8 = r8.getToastLiveData()
            com.zykj.base.bean.toast.ToastErrorMessage r1 = new com.zykj.base.bean.toast.ToastErrorMessage
            r5 = 5
            r6 = 0
            r2 = 0
            java.lang.String r3 = "获取通知详情失败"
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            r8.setValue(r1)
            goto Lc1
        Lad:
            com.zykj.huiwei.launcher.viewmodels.NotificationViewModel r8 = r7.f7288c
            com.kunminx.architecture.ui.callback.UnPeekLiveData r8 = r8.getToastLiveData()
            com.zykj.base.bean.toast.ToastErrorMessage r1 = new com.zykj.base.bean.toast.ToastErrorMessage
            r5 = 5
            r6 = 0
            r2 = 0
            java.lang.String r3 = "无网络连接，请检查网络"
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            r8.setValue(r1)
        Lc1:
            r0.printStackTrace()
        Lc4:
            com.zykj.huiwei.launcher.viewmodels.NotificationViewModel r8 = r7.f7288c
            com.kunminx.architecture.ui.callback.UnPeekLiveData r8 = r8.isDialogVisible()
            r0 = 0
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            r8.setValue(r0)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.viewmodels.NotificationViewModel$getNoticeDetail$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/viewmodels/NotificationViewModel$getNoticeDetail$1.smali:146
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((NotificationViewModel$getNoticeDetail$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
