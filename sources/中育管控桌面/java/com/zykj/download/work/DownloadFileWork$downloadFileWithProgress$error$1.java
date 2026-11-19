package com.zykj.download.work;

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
import p018b3.C4414b;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, m7880d2 = {"<anonymous>", "Lcom/zykj/http/exception/RemoteCodeException;", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {1, 5, 1}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.download.work.DownloadFileWork$downloadFileWithProgress$error$1", m7918f = "DownloadFileWork.kt", m7919i = {}, m7920l = {97}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes3.dex */
public final class DownloadFileWork$downloadFileWithProgress$error$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RemoteCodeException>, Object> {

    /* renamed from: a */
    public int f5673a;

    /* renamed from: b */
    public final /* synthetic */ DownloadFileWork f5674b;

    /* renamed from: c */
    public final /* synthetic */ C4414b f5675c;

    @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, m7880d2 = {"<anonymous>", "Lcom/zykj/http/exception/RemoteCodeException;", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {1, 5, 1}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.download.work.DownloadFileWork$downloadFileWithProgress$error$1$1", m7918f = "DownloadFileWork.kt", m7919i = {0, 1, 2}, m7920l = {108, 120, 123, 120, 123, 120, 123, 120, 123, 120, 123}, m7921m = "invokeSuspend", m7922n = {"job", "job", "job"}, m7923s = {"L$0", "L$0", "L$0"})
    /* renamed from: com.zykj.download.work.DownloadFileWork$downloadFileWithProgress$error$1$1 */
    public static final class C60031 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RemoteCodeException>, Object> {

        /* renamed from: a */
        public Object f5676a;

        /* renamed from: b */
        public Object f5677b;

        /* renamed from: c */
        public int f5678c;

        /* renamed from: d */
        public /* synthetic */ Object f5679d;

        /* renamed from: e */
        public final /* synthetic */ DownloadFileWork f5680e;

        /* renamed from: f */
        public final /* synthetic */ C4414b f5681f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C60031(DownloadFileWork downloadFileWork, C4414b c4414b, Continuation continuation) {
            super(2, continuation);
            this.f5680e = downloadFileWork;
            this.f5681f = c4414b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C60031 c60031 = new C60031(this.f5680e, this.f5681f, continuation);
            c60031.f5679d = obj;
            return c60031;
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
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.download.work.DownloadFileWork$downloadFileWithProgress$error$1.C60031.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes3/com/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1.smali:176
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C60031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadFileWork$downloadFileWithProgress$error$1(DownloadFileWork downloadFileWork, C4414b c4414b, Continuation continuation) {
        super(2, continuation);
        this.f5674b = downloadFileWork;
        this.f5675c = c4414b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DownloadFileWork$downloadFileWithProgress$error$1(this.f5674b, this.f5675c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super RemoteCodeException> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f5673a;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        C60031 c60031 = new C60031(this.f5674b, this.f5675c, null);
        this.f5673a = 1;
        Object objSupervisorScope = SupervisorKt.supervisorScope(c60031, this);
        return objSupervisorScope == coroutine_suspended ? coroutine_suspended : objSupervisorScope;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((DownloadFileWork$downloadFileWithProgress$error$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
