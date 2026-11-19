package com.zykj.download.work;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.compose.material3.MenuKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p071uc.crashsdk.export.ExitType;
import com.taobao.sophix.PatchStatus;
import com.zykj.http.exception.RemoteCodeException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.SupervisorKt;
import p283w5.C9827b;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, m13413d2 = {"<anonymous>", "Lcom/zykj/http/exception/RemoteCodeException;", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.download.work.DownloadFileWork$downloadFileWithProgress$error$1", m13451f = "DownloadFileWork.kt", m13452i = {}, m13453l = {ExitType.UNEXP_FOREGROUND_CRASH}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes4.dex */
public final class DownloadFileWork$downloadFileWithProgress$error$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RemoteCodeException>, Object> {

    /* renamed from: a */
    public int f9913a;

    /* renamed from: b */
    public final /* synthetic */ DownloadFileWork f9914b;

    /* renamed from: c */
    public final /* synthetic */ C9827b f9915c;

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, m13413d2 = {"<anonymous>", "Lcom/zykj/http/exception/RemoteCodeException;", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.download.work.DownloadFileWork$downloadFileWithProgress$error$1$1", m13451f = "DownloadFileWork.kt", m13452i = {0, 1, 2}, m13453l = {AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, MenuKt.InTransitionDuration, PatchStatus.CODE_LOAD_RES_ADDASSERTPATH, MenuKt.InTransitionDuration, PatchStatus.CODE_LOAD_RES_ADDASSERTPATH, MenuKt.InTransitionDuration, PatchStatus.CODE_LOAD_RES_ADDASSERTPATH, MenuKt.InTransitionDuration, PatchStatus.CODE_LOAD_RES_ADDASSERTPATH, MenuKt.InTransitionDuration, PatchStatus.CODE_LOAD_RES_ADDASSERTPATH}, m13454m = "invokeSuspend", m13455n = {"job", "job", "job"}, m13456s = {"L$0", "L$0", "L$0"})
    /* renamed from: com.zykj.download.work.DownloadFileWork$downloadFileWithProgress$error$1$1 */
    public static final class C71741 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RemoteCodeException>, Object> {

        /* renamed from: a */
        public Object f9916a;

        /* renamed from: b */
        public Object f9917b;

        /* renamed from: c */
        public int f9918c;

        /* renamed from: d */
        public /* synthetic */ Object f9919d;

        /* renamed from: e */
        public final /* synthetic */ DownloadFileWork f9920e;

        /* renamed from: f */
        public final /* synthetic */ C9827b f9921f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C71741(DownloadFileWork downloadFileWork, C9827b c9827b, Continuation continuation) {
            super(2, continuation);
            this.f9920e = downloadFileWork;
            this.f9921f = c9827b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C71741 c71741 = new C71741(this.f9920e, this.f9921f, continuation);
            c71741.f9919d = obj;
            return c71741;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super RemoteCodeException> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x00fa, code lost:
        
            if (r13.updateFlag(r2, r3, r12) != r1) goto L37;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0128  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0166  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0169  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x019c  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x019f  */
        /* JADX WARN: Type inference failed for: r13v23, types: [com.zykj.download.work.DownloadFileWorkProxy] */
        /* JADX WARN: Type inference failed for: r13v26, types: [com.zykj.download.work.DownloadFileWorkProxy] */
        /* JADX WARN: Type inference failed for: r13v29, types: [com.zykj.download.work.DownloadFileWorkProxy] */
        /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v19, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r2v20 */
        /* JADX WARN: Type inference failed for: r2v26 */
        /* JADX WARN: Type inference failed for: r2v30 */
        /* JADX WARN: Type inference failed for: r2v31 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v15, types: [com.zykj.download.DownloadFlag] */
        /* JADX WARN: Type inference failed for: r6v16, types: [com.zykj.download.DownloadFlag] */
        /* JADX WARN: Type inference failed for: r6v18, types: [com.zykj.download.DownloadFlag] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 526
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.download.work.DownloadFileWork$downloadFileWithProgress$error$1.C71741.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/随身答/smali_classes4/com/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1.smali:176
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C71741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadFileWork$downloadFileWithProgress$error$1(DownloadFileWork downloadFileWork, C9827b c9827b, Continuation continuation) {
        super(2, continuation);
        this.f9914b = downloadFileWork;
        this.f9915c = c9827b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DownloadFileWork$downloadFileWithProgress$error$1(this.f9914b, this.f9915c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super RemoteCodeException> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f9913a;
        if (i9 != 0) {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        C71741 c71741 = new C71741(this.f9914b, this.f9915c, null);
        this.f9913a = 1;
        Object objSupervisorScope = SupervisorKt.supervisorScope(c71741, this);
        return objSupervisorScope == coroutine_suspended ? coroutine_suspended : objSupervisorScope;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((DownloadFileWork$downloadFileWithProgress$error$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
