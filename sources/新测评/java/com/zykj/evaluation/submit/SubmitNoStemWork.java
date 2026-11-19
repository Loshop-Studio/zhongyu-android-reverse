package com.zykj.evaluation.submit;

// RE note 本类字节码直接引用的读写或显示接口包括JSON。

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.hilt.work.HiltWorker;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkerParameters;
import com.zykj.evaluation.bean.GetTaskListKt;
import com.zykj.evaluation.bean.TaskState;
import com.zykj.evaluation.p056di.AppDatabase;
import com.zykj.evaluation.utils.LocalAnswerManager;
import java.util.ArrayList;
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
@Metadata(m13557d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001#B-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ4\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00120\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0019\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR$\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, m13558d2 = {"Lcom/zykj/evaluation/submit/SubmitNoStemWork;", "Lcom/zykj/evaluation/submit/SubmitWork;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lp5/j;", NotificationCompat.CATEGORY_SERVICE, "Lcom/zykj/evaluation/di/AppDatabase;", "database", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp5/j;Lcom/zykj/evaluation/di/AppDatabase;)V", "", "userId", "taskId", "", "taskState", "Lkotlinx/coroutines/flow/Flow;", "", "o", "(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "m", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "g", "Lp5/j;", "Lcom/zykj/evaluation/di/AppDatabase;", "Ljava/util/ArrayList;", "Ln5/h;", "Lkotlin/collections/ArrayList;", "h", "Ljava/util/ArrayList;", "uploadAnswerList", "i", "a", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nSubmitNoStemWork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubmitNoStemWork.kt\ncom/zykj/evaluation/submit/SubmitNoStemWork\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,129:1\n49#2:130\n51#2:134\n46#3:131\n51#3:133\n105#4:132\n1563#5:135\n1634#5,2:136\n1563#5:138\n1634#5,2:139\n295#5,2:141\n1636#5:143\n1636#5:144\n*S KotlinDebug\n*F\n+ 1 SubmitNoStemWork.kt\ncom/zykj/evaluation/submit/SubmitNoStemWork\n*L\n68#1:130\n68#1:134\n68#1:131\n68#1:133\n68#1:132\n82#1:135\n82#1:136,2\n84#1:138\n84#1:139,2\n85#1:141,2\n84#1:143\n82#1:144\n*E\n"})
/* loaded from: classes4.dex */
public final class SubmitNoStemWork extends SubmitWork {

    /* renamed from: i, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: j */
    public static final int f8847j = 8;

    /* renamed from: f, reason: from kotlin metadata */
    public final InterfaceC8843j service;

    /* renamed from: g, reason: from kotlin metadata */
    public final AppDatabase database;

    /* renamed from: h, reason: from kotlin metadata */
    public final ArrayList uploadAnswerList;

    /* renamed from: com.zykj.evaluation.submit.SubmitNoStemWork$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ OneTimeWorkRequest.Builder m8787b(Companion companion, long j10, long j11, String[] strArr, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                strArr = new String[0];
            }
            return companion.m8788a(j10, j11, strArr);
        }

        /* renamed from: a */
        public final OneTimeWorkRequest.Builder m8788a(long j10, long j11, String... tags) {
            Intrinsics.checkNotNullParameter(tags, "tags");
            Data.Builder builder = new Data.Builder();
            builder.putLong("USER_ID", j10);
            builder.putLong("TASK_ID", j11);
            builder.putInt("TASK_STATE", TaskState.ToDo.INSTANCE.getState());
            OneTimeWorkRequest.Builder inputData = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) SubmitNoStemWork.class).setInputData(builder.build());
            for (String str : tags) {
                inputData.addTag(str);
            }
            return inputData;
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitNoStemWork(Context context, WorkerParameters workerParams, InterfaceC8843j service, AppDatabase database) {
        super(context, workerParams, database);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(database, "database");
        this.service = service;
        this.database = database;
        this.uploadAnswerList = new ArrayList();
    }

    @Override // com.zykj.evaluation.submit.SubmitWork
    /* renamed from: f */
    public Object mo8779f(Continuation continuation) {
        long jM14227h = m8814l().m14227h();
        int i10 = getInputData().getInt("TASK_STATE", -1);
        LocalAnswerManager.f10541a.m10524a(new C7589e(GetTaskListKt.convertToTaskState(i10), getInputData().getLong("USER_ID", -1L), jM14227h).m12467m(C7589e.f12717d.m12473a()));
        return Unit.INSTANCE;
    }

    @Override // com.zykj.evaluation.submit.SubmitWork
    /* renamed from: g */
    public Object mo8780g(Continuation continuation) {
        Object objMo8729d = this.database.mo8676h().mo8729d(m8814l().m14228i(), m8814l().m14227h(), getInputData().getInt("TASK_STATE", -1), continuation);
        return objMo8729d == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo8729d : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.zykj.evaluation.submit.SubmitWork
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo8781m(kotlin.coroutines.Continuation r19) throws com.google.gson.JsonSyntaxException, com.zykj.http.exception.RemoteCodeException {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.submit.SubmitNoStemWork.mo8781m(kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/submit/SubmitNoStemWork.smali:421
    }

    @Override // com.zykj.evaluation.submit.SubmitWork
    /* renamed from: o */
    public Object mo8782o(long j10, long j11, int i10, Continuation continuation) {
        final Flow flowMo8730e = this.database.mo8676h().mo8730e(j10, j11, i10);
        return new Flow() { // from class: com.zykj.evaluation.submit.SubmitNoStemWork$uploadCommitStateList$$inlined$map$1

            /* renamed from: com.zykj.evaluation.submit.SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2 */
            public static final class C68692 implements FlowCollector {

                /* renamed from: a */
                public final /* synthetic */ FlowCollector f8853a;

                /* renamed from: b */
                public final /* synthetic */ SubmitNoStemWork f8854b;

                @Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
                @DebugMetadata(m13595c = "com.zykj.evaluation.submit.SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2", m13596f = "SubmitNoStemWork.kt", m13597i = {0, 0, 0, 0, 0}, m13598l = {50}, m13599m = "emit", m13600n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m13601s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                /* renamed from: com.zykj.evaluation.submit.SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a */
                    public /* synthetic */ Object f8855a;

                    /* renamed from: b */
                    public int f8856b;

                    /* renamed from: c */
                    public Object f8857c;

                    /* renamed from: e */
                    public Object f8859e;

                    /* renamed from: f */
                    public Object f8860f;

                    /* renamed from: g */
                    public Object f8861g;

                    /* renamed from: h */
                    public int f8862h;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f8855a = obj;
                        this.f8856b |= Integer.MIN_VALUE;
                        return C68692.this.emit(null, this);
                    }
                }

                public C68692(FlowCollector flowCollector, SubmitNoStemWork submitNoStemWork) {
                    this.f8853a = flowCollector;
                    this.f8854b = submitNoStemWork;
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
                        boolean r0 = r8 instanceof com.zykj.evaluation.submit.SubmitNoStemWork$uploadCommitStateList$$inlined$map$1.C68692.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.zykj.evaluation.submit.SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2$1 r0 = (com.zykj.evaluation.submit.SubmitNoStemWork$uploadCommitStateList$$inlined$map$1.C68692.AnonymousClass1) r0
                        int r1 = r0.f8856b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f8856b = r1
                        goto L18
                    L13:
                        com.zykj.evaluation.submit.SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2$1 r0 = new com.zykj.evaluation.submit.SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.f8855a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f8856b
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r7 = r0.f8861g
                        kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
                        java.lang.Object r7 = r0.f8859e
                        com.zykj.evaluation.submit.SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2$1 r7 = (com.zykj.evaluation.submit.SubmitNoStemWork$uploadCommitStateList$$inlined$map$1.C68692.AnonymousClass1) r7
                        kotlin.ResultKt.throwOnFailure(r8)
                        goto La2
                    L31:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L39:
                        kotlin.ResultKt.throwOnFailure(r8)
                        kotlinx.coroutines.flow.FlowCollector r8 = r6.f8853a
                        r2 = r7
                        java.util.List r2 = (java.util.List) r2
                        com.zykj.evaluation.submit.SubmitNoStemWork r4 = r6.f8854b
                        java.util.ArrayList r4 = com.zykj.evaluation.submit.SubmitNoStemWork.m8786p(r4)
                        r4.clear()
                        com.zykj.evaluation.submit.SubmitNoStemWork r4 = r6.f8854b
                        java.util.ArrayList r4 = com.zykj.evaluation.submit.SubmitNoStemWork.m8786p(r4)
                        r4.addAll(r2)
                        java.util.ArrayList r4 = new java.util.ArrayList
                        r5 = 10
                        int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r5)
                        r4.<init>(r5)
                        java.util.Iterator r2 = r2.iterator()
                    L62:
                        boolean r5 = r2.hasNext()
                        if (r5 == 0) goto L7e
                        java.lang.Object r5 = r2.next()
                        n5.h r5 = (p178n5.C8641h) r5
                        com.zykj.evaluation.bean.UploadData r5 = r5.m14231c()
                        int r5 = r5.getCommitState()
                        java.lang.Integer r5 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r5)
                        r4.add(r5)
                        goto L62
                    L7e:
                        java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
                        r0.f8857c = r2
                        java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
                        r0.f8859e = r2
                        java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
                        r0.f8860f = r7
                        java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
                        r0.f8861g = r7
                        r7 = 0
                        r0.f8862h = r7
                        r0.f8856b = r3
                        java.lang.Object r7 = r8.emit(r4, r0)
                        if (r7 != r1) goto La2
                        return r1
                    La2:
                        kotlin.Unit r7 = kotlin.Unit.INSTANCE
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.submit.SubmitNoStemWork$uploadCommitStateList$$inlined$map$1.C68692.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1$2.smali:41
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation2) {
                Object objCollect = flowMo8730e.collect(new C68692(flowCollector, this), continuation2);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }
}
