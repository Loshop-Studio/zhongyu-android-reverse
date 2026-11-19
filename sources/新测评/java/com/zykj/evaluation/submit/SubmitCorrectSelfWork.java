package com.zykj.evaluation.submit;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.hilt.work.HiltWorker;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkerParameters;
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
import p200p5.InterfaceC8843j;

@StabilityInferred(parameters = 0)
@HiltWorker
@Metadata(m13557d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ4\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00120\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0019\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001b¨\u0006\u001e"}, m13558d2 = {"Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork;", "Lcom/zykj/evaluation/submit/SubmitWork;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lp5/j;", NotificationCompat.CATEGORY_SERVICE, "Lcom/zykj/evaluation/di/AppDatabase;", "database", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp5/j;Lcom/zykj/evaluation/di/AppDatabase;)V", "", "userId", "taskId", "", "taskState", "Lkotlinx/coroutines/flow/Flow;", "", "o", "(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "m", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "g", "Lp5/j;", "Lcom/zykj/evaluation/di/AppDatabase;", "h", "a", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nSubmitCorrectSelfWork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubmitCorrectSelfWork.kt\ncom/zykj/evaluation/submit/SubmitCorrectSelfWork\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,86:1\n49#2:87\n51#2:91\n46#3:88\n51#3:90\n105#4:89\n*S KotlinDebug\n*F\n+ 1 SubmitCorrectSelfWork.kt\ncom/zykj/evaluation/submit/SubmitCorrectSelfWork\n*L\n61#1:87\n61#1:91\n61#1:88\n61#1:90\n61#1:89\n*E\n"})
/* loaded from: classes4.dex */
public final class SubmitCorrectSelfWork extends SubmitWork {

    /* renamed from: h, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: i */
    public static final int f8829i = 8;

    /* renamed from: f, reason: from kotlin metadata */
    public final InterfaceC8843j service;

    /* renamed from: g, reason: from kotlin metadata */
    public final AppDatabase database;

    /* renamed from: com.zykj.evaluation.submit.SubmitCorrectSelfWork$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ OneTimeWorkRequest.Builder m8783b(Companion companion, long j10, long j11, int i10, String[] strArr, int i11, Object obj) {
            if ((i11 & 8) != 0) {
                strArr = new String[0];
            }
            return companion.m8784a(j10, j11, i10, strArr);
        }

        /* renamed from: a */
        public final OneTimeWorkRequest.Builder m8784a(long j10, long j11, int i10, String... tags) {
            Intrinsics.checkNotNullParameter(tags, "tags");
            Data.Builder builder = new Data.Builder();
            builder.putLong("USER_ID", j10);
            builder.putLong("TASK_ID", j11);
            builder.putInt("TASK_STATE", i10);
            OneTimeWorkRequest.Builder inputData = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) SubmitCorrectSelfWork.class).setInputData(builder.build());
            for (String str : tags) {
                inputData.addTag(str);
            }
            return inputData;
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitCorrectSelfWork(Context context, WorkerParameters workerParams, InterfaceC8843j service, AppDatabase database) {
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
        return Unit.INSTANCE;
    }

    @Override // com.zykj.evaluation.submit.SubmitWork
    /* renamed from: g */
    public Object mo8780g(Continuation continuation) {
        Object objMo8746a = this.database.mo8677i().mo8746a(m8814l().m14228i(), m8814l().m14227h(), getInputData().getInt("TASK_STATE", -1), continuation);
        return objMo8746a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo8746a : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.zykj.evaluation.submit.SubmitWork
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo8781m(kotlin.coroutines.Continuation r7) throws com.zykj.http.exception.RemoteCodeException {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.zykj.evaluation.submit.SubmitCorrectSelfWork$submitTask$1
            if (r0 == 0) goto L13
            r0 = r7
            com.zykj.evaluation.submit.SubmitCorrectSelfWork$submitTask$1 r0 = (com.zykj.evaluation.submit.SubmitCorrectSelfWork$submitTask$1) r0
            int r1 = r0.f8845d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8845d = r1
            goto L18
        L13:
            com.zykj.evaluation.submit.SubmitCorrectSelfWork$submitTask$1 r0 = new com.zykj.evaluation.submit.SubmitCorrectSelfWork$submitTask$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f8843b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f8845d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r7)
            goto L49
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            kotlin.ResultKt.throwOnFailure(r7)
            n5.a r7 = r6.m8814l()
            long r4 = r7.m14227h()
            p5.j r7 = r6.service
            r0.f8842a = r4
            r0.f8845d = r3
            java.lang.Object r7 = r7.m14827i(r4, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            com.zykj.http.bean.ApiResp r7 = (com.zykj.http.bean.ApiResp) r7
            p189o5.AbstractC8711g.m14347b(r7)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.submit.SubmitCorrectSelfWork.mo8781m(kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/submit/SubmitCorrectSelfWork.smali:278
    }

    @Override // com.zykj.evaluation.submit.SubmitWork
    /* renamed from: o */
    public Object mo8782o(long j10, long j11, int i10, Continuation continuation) {
        final Flow flowMo8750e = this.database.mo8677i().mo8750e(j10, j11, i10);
        return new Flow() { // from class: com.zykj.evaluation.submit.SubmitCorrectSelfWork$uploadCommitStateList$$inlined$map$1

            /* renamed from: com.zykj.evaluation.submit.SubmitCorrectSelfWork$uploadCommitStateList$$inlined$map$1$2 */
            public static final class C68672 implements FlowCollector {

                /* renamed from: a */
                public final /* synthetic */ FlowCollector f8833a;

                @Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
                @DebugMetadata(m13595c = "com.zykj.evaluation.submit.SubmitCorrectSelfWork$uploadCommitStateList$$inlined$map$1$2", m13596f = "SubmitCorrectSelfWork.kt", m13597i = {0, 0, 0, 0, 0}, m13598l = {50}, m13599m = "emit", m13600n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m13601s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                /* renamed from: com.zykj.evaluation.submit.SubmitCorrectSelfWork$uploadCommitStateList$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a */
                    public /* synthetic */ Object f8834a;

                    /* renamed from: b */
                    public int f8835b;

                    /* renamed from: c */
                    public Object f8836c;

                    /* renamed from: e */
                    public Object f8838e;

                    /* renamed from: f */
                    public Object f8839f;

                    /* renamed from: g */
                    public Object f8840g;

                    /* renamed from: h */
                    public int f8841h;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f8834a = obj;
                        this.f8835b |= Integer.MIN_VALUE;
                        return C68672.this.emit(null, this);
                    }
                }

                public C68672(FlowCollector flowCollector) {
                    this.f8833a = flowCollector;
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
                        boolean r0 = r8 instanceof com.zykj.evaluation.submit.SubmitCorrectSelfWork$uploadCommitStateList$$inlined$map$1.C68672.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.zykj.evaluation.submit.SubmitCorrectSelfWork$uploadCommitStateList$$inlined$map$1$2$1 r0 = (com.zykj.evaluation.submit.SubmitCorrectSelfWork$uploadCommitStateList$$inlined$map$1.C68672.AnonymousClass1) r0
                        int r1 = r0.f8835b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f8835b = r1
                        goto L18
                    L13:
                        com.zykj.evaluation.submit.SubmitCorrectSelfWork$uploadCommitStateList$$inlined$map$1$2$1 r0 = new com.zykj.evaluation.submit.SubmitCorrectSelfWork$uploadCommitStateList$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.f8834a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f8835b
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r7 = r0.f8840g
                        kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
                        java.lang.Object r7 = r0.f8838e
                        com.zykj.evaluation.submit.SubmitCorrectSelfWork$uploadCommitStateList$$inlined$map$1$2$1 r7 = (com.zykj.evaluation.submit.SubmitCorrectSelfWork$uploadCommitStateList$$inlined$map$1.C68672.AnonymousClass1) r7
                        kotlin.ResultKt.throwOnFailure(r8)
                        goto L8c
                    L31:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L39:
                        kotlin.ResultKt.throwOnFailure(r8)
                        kotlinx.coroutines.flow.FlowCollector r8 = r6.f8833a
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
                        n5.o r5 = (p178n5.C8648o) r5
                        int r5 = r5.m14238e()
                        java.lang.Integer r5 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r5)
                        r4.add(r5)
                        goto L50
                    L68:
                        java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
                        r0.f8836c = r2
                        java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
                        r0.f8838e = r2
                        java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
                        r0.f8839f = r7
                        java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
                        r0.f8840g = r7
                        r7 = 0
                        r0.f8841h = r7
                        r0.f8835b = r3
                        java.lang.Object r7 = r8.emit(r4, r0)
                        if (r7 != r1) goto L8c
                        return r1
                    L8c:
                        kotlin.Unit r7 = kotlin.Unit.INSTANCE
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.submit.SubmitCorrectSelfWork$uploadCommitStateList$$inlined$map$1.C68672.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/submit/SubmitCorrectSelfWork$uploadCommitStateList$$inlined$map$1$2.smali:37
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation2) {
                Object objCollect = flowMo8750e.collect(new C68672(flowCollector), continuation2);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }
}
