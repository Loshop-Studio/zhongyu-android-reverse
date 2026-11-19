package com.zykj.evaluation.upload;

import android.content.Context;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.hilt.work.HiltWorker;
import androidx.work.CoroutineWorker;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkerParameters;
import com.zykj.evaluation.p056di.AppDatabase;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p178n5.C8648o;
import p200p5.InterfaceC8843j;

@StabilityInferred(parameters = 0)
@HiltWorker
@Metadata(m13557d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\u0019B5\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0082@¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010 ¨\u0006#"}, m13558d2 = {"Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lp5/j;", NotificationCompat.CATEGORY_SERVICE, "Lcom/zykj/evaluation/di/AppDatabase;", "database", "Lcom/zykj/evaluation/upload/OssTaskManger;", "ossTaskManger", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp5/j;Lcom/zykj/evaluation/di/AppDatabase;Lcom/zykj/evaluation/upload/OssTaskManger;)V", "", "key", "", "", "extras", "Landroidx/work/ListenableWorker$Result;", "f", "(Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lp5/j;", "b", "Lcom/zykj/evaluation/di/AppDatabase;", "c", "Lcom/zykj/evaluation/upload/OssTaskManger;", "Ln5/o;", "Ln5/o;", "uploadCorrectSelfQuestion", "e", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nSelfCorrectQuestionUploadWork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelfCorrectQuestionUploadWork.kt\ncom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Data.kt\nandroidx/work/DataKt\n*L\n1#1,245:1\n1#2:246\n1563#3:247\n1634#3,2:248\n1563#3:250\n1634#3,3:251\n1636#3:254\n1563#3:255\n1634#3,2:256\n1563#3:258\n1634#3,3:259\n1636#3:262\n1563#3:263\n1634#3,3:264\n1563#3:267\n1634#3,2:268\n1563#3:270\n1634#3,3:271\n1636#3:274\n1869#3,2:275\n31#4,5:277\n31#4,5:282\n*S KotlinDebug\n*F\n+ 1 SelfCorrectQuestionUploadWork.kt\ncom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork\n*L\n105#1:247\n105#1:248,2\n107#1:250\n107#1:251,3\n105#1:254\n121#1:255\n121#1:256,2\n123#1:258\n123#1:259,3\n121#1:262\n161#1:263\n161#1:264,3\n177#1:267\n177#1:268,2\n179#1:270\n179#1:271,3\n177#1:274\n195#1:275,2\n221#1:277,5\n238#1:282,5\n*E\n"})
/* loaded from: classes4.dex */
public final class SelfCorrectQuestionUploadWork extends CoroutineWorker {

    /* renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f */
    public static final int f10439f = 8;

    /* renamed from: a, reason: from kotlin metadata */
    public final InterfaceC8843j service;

    /* renamed from: b, reason: from kotlin metadata */
    public final AppDatabase database;

    /* renamed from: c, reason: from kotlin metadata */
    public final OssTaskManger ossTaskManger;

    /* renamed from: d, reason: from kotlin metadata */
    public C8648o uploadCorrectSelfQuestion;

    /* renamed from: com.zykj.evaluation.upload.SelfCorrectQuestionUploadWork$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final OneTimeWorkRequest.Builder m10505a(long j10, long j11, long j12, int i10) {
            Data.Builder builder = new Data.Builder();
            builder.putLong("USER_ID", j10);
            builder.putLong("TASK_ID", j11);
            builder.putInt("TASK_STATE", i10);
            builder.putLong("QUESTION_ID", j12);
            return new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) SelfCorrectQuestionUploadWork.class).setInputData(builder.build());
        }

        public Companion() {
        }
    }

    @Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "com.zykj.evaluation.upload.SelfCorrectQuestionUploadWork", m13596f = "SelfCorrectQuestionUploadWork.kt", m13597i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11}, m13598l = {80, 89, 94, 137, 144, 150, 156, 173, 196, 199, ComposerKt.referenceKey, ComposerKt.reuseKey}, m13599m = "doWork", m13600n = {"userId", "taskId", "questionId", "taskState", "stringBuilder", "userId", "taskId", "questionId", "taskState", "userId", "taskId", "questionId", "taskState", "commitSelfCorrectReqList", "ossData", "answerUploadData", "userId", "taskId", "questionId", "taskState", "commitSelfCorrectReqList", "ossData", "answerUploadData", "userId", "taskId", "questionId", "taskState", "commitSelfCorrectReqList", "ossData", "answerUploadData", "uuid", "ext", "objectKey", "userId", "taskId", "questionId", "taskState", "commitSelfCorrectReqList", "ossData", "answerUploadData", "uuid", "ext", "objectKey", "it", "userId", "taskId", "questionId", "taskState", "$i$a$-let-SelfCorrectQuestionUploadWork$doWork$url$1", "commitSelfCorrectReqList", "ossData", "answerUploadData", "uuid", "ext", "objectKey", "url", "userId", "taskId", "questionId", "taskState", "commitSelfCorrectReqList", "ossData", "$this$doWork_u24lambda_u2410", "$this$forEach$iv", "element$iv", "it", "userId", "taskId", "questionId", "taskState", "$i$a$-runCatching-SelfCorrectQuestionUploadWork$doWork$7", "$i$f$forEach", "$i$a$-forEach-SelfCorrectQuestionUploadWork$doWork$7$1", "commitSelfCorrectReqList", "ossData", "it", "userId", "taskId", "questionId", "taskState", "$i$a$-onFailure-SelfCorrectQuestionUploadWork$doWork$8", "commitSelfCorrectReqList", "ossData", "it", "userId", "taskId", "questionId", "taskState", "$i$a$-let-SelfCorrectQuestionUploadWork$doWork$9", "commitSelfCorrectReqList", "ossData", "userId", "taskId", "questionId", "taskState"}, m13601s = {"J$0", "J$1", "J$2", "I$0", "L$0", "J$0", "J$1", "J$2", "I$0", "J$0", "J$1", "J$2", "I$0", "L$0", "L$1", "L$3", "J$0", "J$1", "J$2", "I$0", "L$0", "L$1", "L$2", "J$0", "J$1", "J$2", "I$0", "L$0", "L$1", "L$3", "L$4", "L$5", "L$6", "J$0", "J$1", "J$2", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "J$1", "J$2", "I$0", "I$1", "L$0", "L$1", "L$3", "L$4", "L$5", "L$6", "L$7", "J$0", "J$1", "J$2", "I$0", "L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "J$0", "J$1", "J$2", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$3", "J$0", "J$1", "J$2", "I$0", "I$1", "L$0", "L$1", "L$2", "J$0", "J$1", "J$2", "I$0", "I$1", "L$0", "L$1", "J$0", "J$1", "J$2", "I$0"})
    /* renamed from: com.zykj.evaluation.upload.SelfCorrectQuestionUploadWork$doWork$1 */
    public static final class C69511 extends ContinuationImpl {

        /* renamed from: a */
        public long f10444a;

        /* renamed from: b */
        public long f10445b;

        /* renamed from: c */
        public long f10446c;

        /* renamed from: d */
        public int f10447d;

        /* renamed from: e */
        public int f10448e;

        /* renamed from: f */
        public int f10449f;

        /* renamed from: g */
        public int f10450g;

        /* renamed from: h */
        public Object f10451h;

        /* renamed from: i */
        public Object f10452i;

        /* renamed from: j */
        public Object f10453j;

        /* renamed from: k */
        public Object f10454k;

        /* renamed from: l */
        public Object f10455l;

        /* renamed from: m */
        public Object f10456m;

        /* renamed from: n */
        public Object f10457n;

        /* renamed from: o */
        public Object f10458o;

        /* renamed from: p */
        public /* synthetic */ Object f10459p;

        /* renamed from: r */
        public int f10461r;

        public C69511(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10459p = obj;
            this.f10461r |= Integer.MIN_VALUE;
            return SelfCorrectQuestionUploadWork.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfCorrectQuestionUploadWork(Context context, WorkerParameters workerParams, InterfaceC8843j service, AppDatabase database, OssTaskManger ossTaskManger) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(ossTaskManger, "ossTaskManger");
        this.service = service;
        this.database = database;
        this.ossTaskManger = ossTaskManger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10501d(java.lang.Object r20, java.lang.String[] r21, kotlin.coroutines.Continuation r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r22
            boolean r2 = r1 instanceof com.zykj.evaluation.upload.SelfCorrectQuestionUploadWork$failedResult$1
            if (r2 == 0) goto L17
            r2 = r1
            com.zykj.evaluation.upload.SelfCorrectQuestionUploadWork$failedResult$1 r2 = (com.zykj.evaluation.upload.SelfCorrectQuestionUploadWork$failedResult$1) r2
            int r3 = r2.f10468e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f10468e = r3
            goto L1c
        L17:
            com.zykj.evaluation.upload.SelfCorrectQuestionUploadWork$failedResult$1 r2 = new com.zykj.evaluation.upload.SelfCorrectQuestionUploadWork$failedResult$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f10466c
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.f10468e
            r5 = 1
            if (r4 == 0) goto L3b
            if (r4 != r5) goto L33
            java.lang.Object r3 = r2.f10465b
            java.lang.String[] r3 = (java.lang.String[]) r3
            java.lang.Object r2 = r2.f10464a
            kotlin.ResultKt.throwOnFailure(r1)
            goto L79
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3b:
            kotlin.ResultKt.throwOnFailure(r1)
            com.zykj.evaluation.di.AppDatabase r1 = r0.database
            n5.p r1 = r1.mo8677i()
            n5.o r4 = r0.uploadCorrectSelfQuestion
            if (r4 != 0) goto L4e
            java.lang.String r4 = "uploadCorrectSelfQuestion"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            r4 = 0
        L4e:
            r6 = r4
            m5.e$a r4 = p167m5.AbstractC8555e.a.f14189b
            int r16 = r4.m14097a()
            r17 = 63
            r18 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            n5.o r4 = p178n5.C8648o.m14234b(r6, r7, r9, r11, r12, r14, r15, r16, r17, r18)
            r6 = r20
            r2.f10464a = r6
            r7 = r21
            r2.f10465b = r7
            r2.f10468e = r5
            java.lang.Object r1 = r1.mo8748c(r4, r2)
            if (r1 != r3) goto L77
            return r3
        L77:
            r2 = r6
            r3 = r7
        L79:
            java.lang.String r1 = "ERROR_KEY"
            kotlin.Pair r1 = kotlin.TuplesKt.m13565to(r1, r2)
            java.lang.String r2 = "EXTRA_DATA"
            kotlin.Pair r2 = kotlin.TuplesKt.m13565to(r2, r3)
            kotlin.Pair[] r1 = new kotlin.Pair[]{r1, r2}
            androidx.work.Data$Builder r2 = new androidx.work.Data$Builder
            r2.<init>()
            r3 = 0
        L8f:
            r4 = 2
            if (r3 >= r4) goto La4
            r4 = r1[r3]
            java.lang.Object r5 = r4.getFirst()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.getSecond()
            r2.put(r5, r4)
            int r3 = r3 + 1
            goto L8f
        La4:
            androidx.work.Data r1 = r2.build()
            androidx.work.ListenableWorker$Result r1 = androidx.work.ListenableWorker.Result.failure(r1)
            java.lang.String r2 = "failure(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.upload.SelfCorrectQuestionUploadWork.m10501d(java.lang.Object, java.lang.String[], kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/upload/SelfCorrectQuestionUploadWork.smali:212
    }

    /* renamed from: e */
    public static /* synthetic */ Object m10502e(SelfCorrectQuestionUploadWork selfCorrectQuestionUploadWork, Object obj, String[] strArr, Continuation continuation, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            strArr = null;
        }
        return selfCorrectQuestionUploadWork.m10501d(obj, strArr, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10503f(java.lang.Object r20, java.lang.String[] r21, kotlin.coroutines.Continuation r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r22
            boolean r2 = r1 instanceof com.zykj.evaluation.upload.SelfCorrectQuestionUploadWork$successResult$1
            if (r2 == 0) goto L17
            r2 = r1
            com.zykj.evaluation.upload.SelfCorrectQuestionUploadWork$successResult$1 r2 = (com.zykj.evaluation.upload.SelfCorrectQuestionUploadWork$successResult$1) r2
            int r3 = r2.f10473e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f10473e = r3
            goto L1c
        L17:
            com.zykj.evaluation.upload.SelfCorrectQuestionUploadWork$successResult$1 r2 = new com.zykj.evaluation.upload.SelfCorrectQuestionUploadWork$successResult$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f10471c
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.f10473e
            r5 = 1
            if (r4 == 0) goto L3b
            if (r4 != r5) goto L33
            java.lang.Object r3 = r2.f10470b
            java.lang.String[] r3 = (java.lang.String[]) r3
            java.lang.Object r2 = r2.f10469a
            kotlin.ResultKt.throwOnFailure(r1)
            goto L79
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3b:
            kotlin.ResultKt.throwOnFailure(r1)
            com.zykj.evaluation.di.AppDatabase r1 = r0.database
            n5.p r1 = r1.mo8677i()
            n5.o r4 = r0.uploadCorrectSelfQuestion
            if (r4 != 0) goto L4e
            java.lang.String r4 = "uploadCorrectSelfQuestion"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            r4 = 0
        L4e:
            r6 = r4
            m5.e$b r4 = p167m5.AbstractC8555e.b.f14190b
            int r16 = r4.m14097a()
            r17 = 63
            r18 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            n5.o r4 = p178n5.C8648o.m14234b(r6, r7, r9, r11, r12, r14, r15, r16, r17, r18)
            r6 = r20
            r2.f10469a = r6
            r7 = r21
            r2.f10470b = r7
            r2.f10473e = r5
            java.lang.Object r1 = r1.mo8748c(r4, r2)
            if (r1 != r3) goto L77
            return r3
        L77:
            r2 = r6
            r3 = r7
        L79:
            java.lang.String r1 = "SUCCESS_KEY"
            kotlin.Pair r1 = kotlin.TuplesKt.m13565to(r1, r2)
            java.lang.String r2 = "EXTRA_DATA"
            kotlin.Pair r2 = kotlin.TuplesKt.m13565to(r2, r3)
            kotlin.Pair[] r1 = new kotlin.Pair[]{r1, r2}
            androidx.work.Data$Builder r2 = new androidx.work.Data$Builder
            r2.<init>()
            r3 = 0
        L8f:
            r4 = 2
            if (r3 >= r4) goto La4
            r4 = r1[r3]
            java.lang.Object r5 = r4.getFirst()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.getSecond()
            r2.put(r5, r4)
            int r3 = r3 + 1
            goto L8f
        La4:
            androidx.work.Data r1 = r2.build()
            androidx.work.ListenableWorker$Result r1 = androidx.work.ListenableWorker.Result.success(r1)
            java.lang.String r2 = "success(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.upload.SelfCorrectQuestionUploadWork.m10503f(java.lang.Object, java.lang.String[], kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/upload/SelfCorrectQuestionUploadWork.smali:618
    }

    /* renamed from: g */
    public static /* synthetic */ Object m10504g(SelfCorrectQuestionUploadWork selfCorrectQuestionUploadWork, Object obj, String[] strArr, Continuation continuation, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            strArr = null;
        }
        return selfCorrectQuestionUploadWork.m10503f(obj, strArr, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:55|(1:57)|58|(1:60)|61|238|(3:64|(5:66|(5:69|(4:72|(2:74|241)(1:242)|75|70)|240|76|67)|239|77|237)(2:78|(2:234|(2:98|(3:101|102|(2:104|(2:106|107)(1:108))(2:113|(1:250)(3:116|117|(2:119|(1:251)(1:122))(13:123|(1:125)(1:126)|127|(1:129)|130|(5:133|(1:135)(1:137)|136|138|131)|247|139|(1:141)|142|(7:145|146|(5:149|(4:152|(2:154|232)(1:233)|155|150)|231|156|147)|230|157|238|(1:62))|144|248)))))(2:97|(0)(0)))(5:80|(5:83|(4:86|(2:88|245)(1:246)|89|84)|244|90|81)|243|91|236))|92)|235|158|228|159|160|226|161|(4:163|164|165|(3:167|144|248)(6:168|224|169|226|161|(4:174|175|179|(1:181)(6:186|185|187|(1:189)|190|(2:192|(1:252)(3:195|196|(1:198)(3:199|201|(1:253)(1:204))))(3:200|201|(0)(0))))(0)))(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x04c4, code lost:
    
        if (r0 == r12) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x07f5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x07f6, code lost:
    
        r17 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0809, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x080a, code lost:
    
        r17 = r1;
        r18 = r48;
        r19 = r14;
        r13 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0858, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r0, r1, r4) == r5) goto L144;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0795 A[Catch: all -> 0x07f5, TRY_LEAVE, TryCatch #2 {all -> 0x07f5, blocks: (B:161:0x078f, B:163:0x0795), top: B:226:0x078f }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x07f9 A[Catch: all -> 0x07f3, TRY_LEAVE, TryCatch #1 {all -> 0x07f3, blocks: (B:169:0x07e9, B:165:0x07a4, B:174:0x07f9), top: B:224:0x07e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0822  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0881  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x088f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x08f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x08f6  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x08fd  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0936 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0949  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0952  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x095b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0963  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x09ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:249:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:253:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r12v50, types: [T, java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v13, types: [T, java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v30, types: [T, java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:145:0x06a7 -> B:146:0x06ad). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:168:0x07e4 -> B:224:0x07e9). Please report as a decompilation issue!!! */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doWork(kotlin.coroutines.Continuation r48) {
        /*
            Method dump skipped, instructions count: 2506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.upload.SelfCorrectQuestionUploadWork.doWork(kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/upload/SelfCorrectQuestionUploadWork.smali:1026
    }
}
