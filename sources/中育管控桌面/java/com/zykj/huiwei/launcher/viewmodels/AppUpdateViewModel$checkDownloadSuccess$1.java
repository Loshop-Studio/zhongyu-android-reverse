package com.zykj.huiwei.launcher.viewmodels;

import com.zykj.huiwei.launcher.bean.resp.VersionInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(m7879d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.AppUpdateViewModel$checkDownloadSuccess$1", m7918f = "AppUpdateViewModel.kt", m7919i = {0, 0, 1, 1, 1}, m7920l = {95, 99}, m7921m = "invokeSuspend", m7922n = {"$this$flow", "downloadProxy", "$this$flow", "downloadProxy", "path"}, m7923s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
/* loaded from: classes4.dex */
public final class AppUpdateViewModel$checkDownloadSuccess$1 extends SuspendLambda implements Function2<FlowCollector<? super String>, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f6951a;

    /* renamed from: b */
    public Object f6952b;

    /* renamed from: c */
    public int f6953c;

    /* renamed from: d */
    public /* synthetic */ Object f6954d;

    /* renamed from: e */
    public final /* synthetic */ VersionInfo f6955e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppUpdateViewModel$checkDownloadSuccess$1(VersionInfo versionInfo, Continuation continuation) {
        super(2, continuation);
        this.f6955e = versionInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AppUpdateViewModel$checkDownloadSuccess$1 appUpdateViewModel$checkDownloadSuccess$1 = new AppUpdateViewModel$checkDownloadSuccess$1(this.f6955e, continuation);
        appUpdateViewModel$checkDownloadSuccess$1.f6954d = obj;
        return appUpdateViewModel$checkDownloadSuccess$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super String> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector) flowCollector, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0085, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f6954d
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r7.f6953c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 == r4) goto L26
            if (r2 != r3) goto L1e
            java.lang.Object r0 = r7.f6952b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r7.f6951a
            com.zykj.download.work.DownloadFileWorkProxy r0 = (com.zykj.download.work.DownloadFileWorkProxy) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L88
        L1e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L26:
            java.lang.Object r2 = r7.f6951a
            com.zykj.download.work.DownloadFileWorkProxy r2 = (com.zykj.download.work.DownloadFileWorkProxy) r2
            kotlin.ResultKt.throwOnFailure(r8)
            goto L67
        L2e:
            kotlin.ResultKt.throwOnFailure(r8)
            com.zykj.download.work.DownloadFileWorkProxy r2 = new com.zykj.download.work.DownloadFileWorkProxy
            com.zykj.huiwei.launcher.app.App$a r8 = com.zykj.huiwei.launcher.app.App.INSTANCE
            com.zykj.huiwei.launcher.app.App r5 = r8.m5206a()
            com.zykj.download.data.AppDatabase$a r6 = com.zykj.download.data.AppDatabase.INSTANCE
            com.zykj.huiwei.launcher.app.App r8 = r8.m5206a()
            com.zykj.download.data.AppDatabase r8 = r6.m4996b(r8)
            r6 = 0
            r2.<init>(r5, r8, r6)
            com.zykj.huiwei.launcher.bean.resp.VersionInfo r8 = r7.f6955e
            java.lang.String r8 = r8.getFileUrl()
            java.io.File r5 = new java.io.File
            java.lang.String r6 = com.blankj.utilcode.util.AbstractC4674y.m2440b()
            r5.<init>(r6)
            r7.f6954d = r0
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)
            r7.f6951a = r6
            r7.f6953c = r4
            java.lang.Object r8 = r2.checkDownloadSuccess(r8, r5, r7)
            if (r8 != r1) goto L67
            goto L87
        L67:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L6d
            java.lang.String r8 = ""
        L6d:
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
            r7.f6954d = r4
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)
            r7.f6951a = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r7.f6952b = r2
            r7.f6953c = r3
            java.lang.Object r8 = r0.emit(r8, r7)
            if (r8 != r1) goto L88
        L87:
            return r1
        L88:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.viewmodels.AppUpdateViewModel$checkDownloadSuccess$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$checkDownloadSuccess$1.smali:162
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector flowCollector, Continuation continuation) {
        return ((AppUpdateViewModel$checkDownloadSuccess$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
