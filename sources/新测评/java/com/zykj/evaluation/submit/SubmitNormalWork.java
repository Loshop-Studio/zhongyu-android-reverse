package com.zykj.evaluation.submit;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.hilt.work.HiltWorker;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkerParameters;
import com.blankj.utilcode.util.FileUtils;
import com.zykj.evaluation.bean.GetTaskListKt;
import com.zykj.evaluation.p056di.AppDatabase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p101g7.C7589e;
import p200p5.InterfaceC8843j;

@StabilityInferred(parameters = 0)
@HiltWorker
@Metadata(m13557d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ4\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00120\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0019\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001b¨\u0006\u001e"}, m13558d2 = {"Lcom/zykj/evaluation/submit/SubmitNormalWork;", "Lcom/zykj/evaluation/submit/SubmitWork;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lp5/j;", NotificationCompat.CATEGORY_SERVICE, "Lcom/zykj/evaluation/di/AppDatabase;", "database", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp5/j;Lcom/zykj/evaluation/di/AppDatabase;)V", "", "userId", "taskId", "", "taskState", "Lkotlinx/coroutines/flow/Flow;", "", "o", "(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "m", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "g", "Lp5/j;", "Lcom/zykj/evaluation/di/AppDatabase;", "h", "a", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nSubmitNormalWork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubmitNormalWork.kt\ncom/zykj/evaluation/submit/SubmitNormalWork\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,108:1\n49#2:109\n51#2:113\n46#3:110\n51#3:112\n105#4:111\n*S KotlinDebug\n*F\n+ 1 SubmitNormalWork.kt\ncom/zykj/evaluation/submit/SubmitNormalWork\n*L\n65#1:109\n65#1:113\n65#1:110\n65#1:112\n65#1:111\n*E\n"})
/* loaded from: classes4.dex */
public final class SubmitNormalWork extends SubmitWork {

    /* renamed from: h, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: i */
    public static final int f8870i = 8;

    /* renamed from: f, reason: from kotlin metadata */
    public final InterfaceC8843j service;

    /* renamed from: g, reason: from kotlin metadata */
    public final AppDatabase database;

    /* renamed from: com.zykj.evaluation.submit.SubmitNormalWork$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ OneTimeWorkRequest.Builder m8790b(Companion companion, long j10, long j11, int i10, String[] strArr, int i11, Object obj) {
            if ((i11 & 8) != 0) {
                strArr = new String[0];
            }
            return companion.m8791a(j10, j11, i10, strArr);
        }

        /* renamed from: a */
        public final OneTimeWorkRequest.Builder m8791a(long j10, long j11, int i10, String... tags) {
            Intrinsics.checkNotNullParameter(tags, "tags");
            Data.Builder builder = new Data.Builder();
            builder.putLong("USER_ID", j10);
            builder.putLong("TASK_ID", j11);
            builder.putInt("TASK_STATE", i10);
            OneTimeWorkRequest.Builder inputData = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) SubmitNormalWork.class).setInputData(builder.build());
            for (String str : tags) {
                inputData.addTag(str);
            }
            return inputData;
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitNormalWork(Context context, WorkerParameters workerParams, InterfaceC8843j service, AppDatabase database) {
        super(context, workerParams, database);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(database, "database");
        this.service = service;
        this.database = database;
    }

    @Override // com.zykj.evaluation.submit.SubmitWork
    /* renamed from: f */
    public Object mo8779f(Continuation continuation) {
        long jM14227h = m8814l().m14227h();
        int i10 = getInputData().getInt("TASK_STATE", -1);
        FileUtils.delete(new C7589e(GetTaskListKt.convertToTaskState(i10), getInputData().getLong("USER_ID", -1L), jM14227h).m12467m(C7589e.f12717d.m12473a()));
        return Unit.INSTANCE;
    }

    @Override // com.zykj.evaluation.submit.SubmitWork
    /* renamed from: g */
    public Object mo8780g(Continuation continuation) {
        Object objMo8767c = this.database.mo8678j().mo8767c(m8814l().m14228i(), m8814l().m14227h(), getInputData().getInt("TASK_STATE", -1), continuation);
        return objMo8767c == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo8767c : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // com.zykj.evaluation.submit.SubmitWork
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo8781m(kotlin.coroutines.Continuation r10) throws com.zykj.http.exception.RemoteCodeException {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.zykj.evaluation.submit.SubmitNormalWork$submitTask$1
            if (r0 == 0) goto L13
            r0 = r10
            com.zykj.evaluation.submit.SubmitNormalWork$submitTask$1 r0 = (com.zykj.evaluation.submit.SubmitNormalWork$submitTask$1) r0
            int r1 = r0.f8889g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8889g = r1
            goto L18
        L13:
            com.zykj.evaluation.submit.SubmitNormalWork$submitTask$1 r0 = new com.zykj.evaluation.submit.SubmitNormalWork$submitTask$1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f8887e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f8889g
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r10)
            goto L71
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L31:
            kotlin.ResultKt.throwOnFailure(r10)
            n5.a r10 = r9.m8814l()
            long r4 = r10.m14227h()
            androidx.work.Data r10 = r9.getInputData()
            java.lang.String r2 = "TASK_STATE"
            r6 = -1
            int r10 = r10.getInt(r2, r6)
            androidx.work.Data r2 = r9.getInputData()
            java.lang.String r6 = "USER_ID"
            r7 = -1
            long r6 = r2.getLong(r6, r7)
            com.zykj.evaluation.bean.TaskState$ToCorrect r2 = com.zykj.evaluation.bean.TaskState.ToCorrect.INSTANCE
            int r2 = r2.getState()
            if (r10 != r2) goto L5d
            r2 = r3
            goto L5e
        L5d:
            r2 = 0
        L5e:
            p5.j r8 = r9.service
            r0.f8883a = r4
            r0.f8885c = r10
            r0.f8884b = r6
            r0.f8886d = r2
            r0.f8889g = r3
            java.lang.Object r10 = r8.m14831m(r4, r2, r0)
            if (r10 != r1) goto L71
            return r1
        L71:
            com.zykj.http.bean.ApiResp r10 = (com.zykj.http.bean.ApiResp) r10
            p189o5.AbstractC8711g.m14347b(r10)
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.submit.SubmitNormalWork.mo8781m(kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/submit/SubmitNormalWork.smali:383
    }

    @Override // com.zykj.evaluation.submit.SubmitWork
    /* renamed from: o */
    public Object mo8782o(long j10, long j11, int i10, Continuation continuation) {
        final Flow flowMo8769e = this.database.mo8678j().mo8769e(j10, j11, i10);
        return new Flow() { // from class: com.zykj.evaluation.submit.SubmitNormalWork$uploadCommitStateList$$inlined$map$1

            /* renamed from: com.zykj.evaluation.submit.SubmitNormalWork$uploadCommitStateList$$inlined$map$1$2 */
            public static final class C68712 implements FlowCollector {

                /* renamed from: a */
                public final /* synthetic */ FlowCollector f8874a;

                @Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
                @DebugMetadata(m13595c = "com.zykj.evaluation.submit.SubmitNormalWork$uploadCommitStateList$$inlined$map$1$2", m13596f = "SubmitNormalWork.kt", m13597i = {0, 0, 0, 0, 0}, m13598l = {50}, m13599m = "emit", m13600n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m13601s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                /* renamed from: com.zykj.evaluation.submit.SubmitNormalWork$uploadCommitStateList$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a */
                    public /* synthetic */ Object f8875a;

                    /* renamed from: b */
                    public int f8876b;

                    /* renamed from: c */
                    public Object f8877c;

                    /* renamed from: e */
                    public Object f8879e;

                    /* renamed from: f */
                    public Object f8880f;

                    /* renamed from: g */
                    public Object f8881g;

                    /* renamed from: h */
                    public int f8882h;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f8875a = obj;
                        this.f8876b |= Integer.MIN_VALUE;
                        return C68712.this.emit(null, this);
                    }
                }

                public C68712(FlowCollector flowCollector) {
                    this.f8874a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.zykj.evaluation.submit.SubmitNormalWork$uploadCommitStateList$$inlined$map$1.C68712.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.zykj.evaluation.submit.SubmitNormalWork$uploadCommitStateList$$inlined$map$1$2$1 r0 = (com.zykj.evaluation.submit.SubmitNormalWork$uploadCommitStateList$$inlined$map$1.C68712.AnonymousClass1) r0
                        int r1 = r0.f8876b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f8876b = r1
                        goto L18
                    L13:
                        com.zykj.evaluation.submit.SubmitNormalWork$uploadCommitStateList$$inlined$map$1$2$1 r0 = new com.zykj.evaluation.submit.SubmitNormalWork$uploadCommitStateList$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.f8875a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f8876b
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r7 = r0.f8881g
                        kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
                        java.lang.Object r7 = r0.f8879e
                        com.zykj.evaluation.submit.SubmitNormalWork$uploadCommitStateList$$inlined$map$1$2$1 r7 = (com.zykj.evaluation.submit.SubmitNormalWork$uploadCommitStateList$$inlined$map$1.C68712.AnonymousClass1) r7
                        kotlin.ResultKt.throwOnFailure(r8)
                        goto L8c
                    L31:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L39:
                        kotlin.ResultKt.throwOnFailure(r8)
                        kotlinx.coroutines.flow.FlowCollector r8 = r6.f8874a
                        r2 = r7
                        java.util.List r2 = (java.util.List) r2
                        java.util.ArrayList r4 = new java.util.ArrayList
                        r5 = 10
                        int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r5)
                        r4.<init>(r5)
                        java.util.Iterator r2 = r2.iterator()
                    L50:
                        boolean r5 = r2.hasNext()
                        if (r5 == 0) goto L68
                        java.lang.Object r5 = r2.next()
                        n5.v r5 = (p178n5.C8655v) r5
                        int r5 = r5.m14246d()
                        java.lang.Integer r5 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r5)
                        r4.add(r5)
                        goto L50
                    L68:
                        java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
                        r0.f8877c = r2
                        java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
                        r0.f8879e = r2
                        java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
                        r0.f8880f = r7
                        java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
                        r0.f8881g = r7
                        r7 = 0
                        r0.f8882h = r7
                        r0.f8876b = r3
                        java.lang.Object r7 = r8.emit(r4, r0)
                        if (r7 != r1) goto L8c
                        return r1
                    L8c:
                        kotlin.Unit r7 = kotlin.Unit.INSTANCE
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.submit.SubmitNormalWork$uploadCommitStateList$$inlined$map$1.C68712.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/submit/SubmitNormalWork$uploadCommitStateList$$inlined$map$1$2.smali:37
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation2) {
                Object objCollect = flowMo8769e.collect(new C68712(flowCollector), continuation2);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }
}
