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
import p178n5.C8655v;
import p200p5.InterfaceC8843j;

@StabilityInferred(parameters = 0)
@HiltWorker
@Metadata(m13557d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\u0019B5\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0082@¢\u0006\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010 ¨\u0006#"}, m13558d2 = {"Lcom/zykj/evaluation/upload/QuestionUploadWork;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lp5/j;", NotificationCompat.CATEGORY_SERVICE, "Lcom/zykj/evaluation/di/AppDatabase;", "database", "Lcom/zykj/evaluation/upload/OssTaskManger;", "ossTaskManger", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp5/j;Lcom/zykj/evaluation/di/AppDatabase;Lcom/zykj/evaluation/upload/OssTaskManger;)V", "Landroidx/work/ListenableWorker$Result;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "key", "", "", "extras", "f", "(Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "a", "Lp5/j;", "b", "Lcom/zykj/evaluation/di/AppDatabase;", "c", "Lcom/zykj/evaluation/upload/OssTaskManger;", "Ln5/v;", "Ln5/v;", "uploadQuestion", "e", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nQuestionUploadWork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuestionUploadWork.kt\ncom/zykj/evaluation/upload/QuestionUploadWork\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Data.kt\nandroidx/work/DataKt\n*L\n1#1,290:1\n1#2:291\n1563#3:292\n1634#3,3:293\n1563#3:296\n1634#3,3:297\n1563#3:300\n1634#3,3:301\n1563#3:304\n1634#3,2:305\n1563#3:307\n1634#3,3:308\n1636#3:311\n1563#3:312\n1634#3,2:313\n1563#3:315\n1634#3,3:316\n1636#3:319\n1563#3:320\n1634#3,3:321\n1563#3:324\n1634#3,2:325\n1563#3:327\n1634#3,3:328\n1636#3:331\n1869#3,2:332\n31#4,5:334\n31#4,5:339\n*S KotlinDebug\n*F\n+ 1 QuestionUploadWork.kt\ncom/zykj/evaluation/upload/QuestionUploadWork\n*L\n100#1:292\n100#1:293,3\n104#1:296\n104#1:297,3\n137#1:300\n137#1:301,3\n145#1:304\n145#1:305,2\n147#1:307\n147#1:308,3\n145#1:311\n159#1:312\n159#1:313,2\n161#1:315\n161#1:316,3\n159#1:319\n193#1:320\n193#1:321,3\n208#1:324\n208#1:325,2\n210#1:327\n210#1:328,3\n208#1:331\n237#1:332,2\n263#1:334,5\n283#1:339,5\n*E\n"})
/* loaded from: classes4.dex */
public final class QuestionUploadWork extends CoroutineWorker {

    /* renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f */
    public static final int f10402f = 8;

    /* renamed from: a, reason: from kotlin metadata */
    public final InterfaceC8843j service;

    /* renamed from: b, reason: from kotlin metadata */
    public final AppDatabase database;

    /* renamed from: c, reason: from kotlin metadata */
    public final OssTaskManger ossTaskManger;

    /* renamed from: d, reason: from kotlin metadata */
    public C8655v uploadQuestion;

    /* renamed from: com.zykj.evaluation.upload.QuestionUploadWork$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final OneTimeWorkRequest.Builder m10497a(long j10, long j11, long j12, int i10) {
            Data.Builder builder = new Data.Builder();
            builder.putLong("USER_ID", j10);
            builder.putLong("TASK_ID", j11);
            builder.putInt("TASK_STATE", i10);
            builder.putLong("QUESTION_ID", j12);
            return new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) QuestionUploadWork.class).setInputData(builder.build());
        }

        public Companion() {
        }
    }

    @Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "com.zykj.evaluation.upload.QuestionUploadWork", m13596f = "QuestionUploadWork.kt", m13597i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 14, 14, 14, 14, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 16, 16, 16, 16, 16, 16, 16, 16, 16, 17, 17, 17, 17, 17, 17, 17, 17, 17, 18, 18, 18, 18, 18, 18, 18}, m13598l = {75, 84, 89, 107, 110, 116, 122, 132, 173, 177, 182, 188, ComposerKt.providerMapsKey, 231, 233, 238, 243, 248, 249}, m13599m = "doWork", m13600n = {"userId", "taskId", "questionId", "taskState", "stringBuilder", "userId", "taskId", "questionId", "taskState", "userId", "taskId", "questionId", "taskState", "commitTaskAnswer", "draftUploadData", "userId", "taskId", "questionId", "taskState", "ossData", "commitTaskAnswer", "draftUploadData", "userId", "taskId", "questionId", "taskState", "ossData", "commitTaskAnswer", "draftUploadData", "uuid", "ext", "objectKey", "userId", "taskId", "questionId", "taskState", "ossData", "commitTaskAnswer", "draftUploadData", "uuid", "ext", "objectKey", "it", "userId", "taskId", "questionId", "taskState", "$i$a$-let-QuestionUploadWork$doWork$url$1", "ossData", "commitTaskAnswer", "draftUploadData", "uuid", "ext", "objectKey", "url", "userId", "taskId", "questionId", "taskState", "ossData", "commitTaskAnswer", "draftUploadData", "answerUploadData", "userId", "taskId", "questionId", "taskState", "ossData", "commitTaskAnswer", "draftUploadData", "answerUploadData", "userId", "taskId", "questionId", "taskState", "ossData", "commitTaskAnswer", "draftUploadData", "answerUploadData", "uuid", "ext", "objectKey", "userId", "taskId", "questionId", "taskState", "ossData", "commitTaskAnswer", "draftUploadData", "answerUploadData", "uuid", "ext", "objectKey", "it", "userId", "taskId", "questionId", "taskState", "$i$a$-let-QuestionUploadWork$doWork$url$2", "ossData", "commitTaskAnswer", "draftUploadData", "answerUploadData", "uuid", "ext", "objectKey", "url", "userId", "taskId", "questionId", "taskState", "ossData", "commitTaskAnswer", "draftUploadData", "$this$doWork_u24lambda_u2414", "userId", "taskId", "questionId", "taskState", "$i$a$-runCatching-QuestionUploadWork$doWork$10", "ossData", "commitTaskAnswer", "draftUploadData", "$this$doWork_u24lambda_u2414", "userId", "taskId", "questionId", "taskState", "$i$a$-runCatching-QuestionUploadWork$doWork$10", "ossData", "commitTaskAnswer", "draftUploadData", "$this$doWork_u24lambda_u2414", "$this$forEach$iv", "element$iv", "it", "userId", "taskId", "questionId", "taskState", "$i$a$-runCatching-QuestionUploadWork$doWork$10", "$i$f$forEach", "$i$a$-forEach-QuestionUploadWork$doWork$10$1", "ossData", "commitTaskAnswer", "draftUploadData", "it", "userId", "taskId", "questionId", "taskState", "$i$a$-onFailure-QuestionUploadWork$doWork$11", "ossData", "commitTaskAnswer", "draftUploadData", "it", "userId", "taskId", "questionId", "taskState", "$i$a$-let-QuestionUploadWork$doWork$12", "ossData", "commitTaskAnswer", "draftUploadData", "userId", "taskId", "questionId", "taskState"}, m13601s = {"J$0", "J$1", "J$2", "I$0", "L$0", "J$0", "J$1", "J$2", "I$0", "J$0", "J$1", "J$2", "I$0", "L$0", "L$1", "J$0", "J$1", "J$2", "I$0", "L$0", "L$1", "L$2", "J$0", "J$1", "J$2", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0", "J$1", "J$2", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "J$1", "J$2", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "J$1", "J$2", "I$0", "L$0", "L$1", "L$2", "L$4", "J$0", "J$1", "J$2", "I$0", "L$0", "L$1", "L$2", "L$3", "J$0", "J$1", "J$2", "I$0", "L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "L$7", "J$0", "J$1", "J$2", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "J$0", "J$1", "J$2", "I$0", "I$1", "L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "L$7", "L$8", "J$0", "J$1", "J$2", "I$0", "L$0", "L$1", "L$2", "L$3", "J$0", "J$1", "J$2", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "J$0", "J$1", "J$2", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$7", "J$0", "J$1", "J$2", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$4", "J$0", "J$1", "J$2", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "J$0", "J$1", "J$2", "I$0", "I$1", "L$0", "L$1", "L$2", "J$0", "J$1", "J$2", "I$0"})
    /* renamed from: com.zykj.evaluation.upload.QuestionUploadWork$doWork$1 */
    public static final class C69491 extends ContinuationImpl {

        /* renamed from: a */
        public long f10407a;

        /* renamed from: b */
        public long f10408b;

        /* renamed from: c */
        public long f10409c;

        /* renamed from: d */
        public int f10410d;

        /* renamed from: e */
        public int f10411e;

        /* renamed from: f */
        public int f10412f;

        /* renamed from: g */
        public int f10413g;

        /* renamed from: h */
        public Object f10414h;

        /* renamed from: i */
        public Object f10415i;

        /* renamed from: j */
        public Object f10416j;

        /* renamed from: k */
        public Object f10417k;

        /* renamed from: l */
        public Object f10418l;

        /* renamed from: m */
        public Object f10419m;

        /* renamed from: n */
        public Object f10420n;

        /* renamed from: o */
        public Object f10421o;

        /* renamed from: p */
        public Object f10422p;

        /* renamed from: q */
        public /* synthetic */ Object f10423q;

        /* renamed from: s */
        public int f10425s;

        public C69491(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10423q = obj;
            this.f10425s |= Integer.MIN_VALUE;
            return QuestionUploadWork.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuestionUploadWork(Context context, WorkerParameters workerParams, InterfaceC8843j service, AppDatabase database, OssTaskManger ossTaskManger) {
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

    /* renamed from: e */
    public static /* synthetic */ Object m10493e(QuestionUploadWork questionUploadWork, Object obj, String[] strArr, Continuation continuation, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            strArr = null;
        }
        return questionUploadWork.m10495d(obj, strArr, continuation);
    }

    /* renamed from: g */
    public static /* synthetic */ Object m10494g(QuestionUploadWork questionUploadWork, Object obj, String[] strArr, Continuation continuation, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            strArr = null;
        }
        return questionUploadWork.m10496f(obj, strArr, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10495d(java.lang.Object r23, java.lang.String[] r24, kotlin.coroutines.Continuation r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r25
            boolean r2 = r1 instanceof com.zykj.evaluation.upload.QuestionUploadWork$failedResult$1
            if (r2 == 0) goto L17
            r2 = r1
            com.zykj.evaluation.upload.QuestionUploadWork$failedResult$1 r2 = (com.zykj.evaluation.upload.QuestionUploadWork$failedResult$1) r2
            int r3 = r2.f10432e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f10432e = r3
            goto L1c
        L17:
            com.zykj.evaluation.upload.QuestionUploadWork$failedResult$1 r2 = new com.zykj.evaluation.upload.QuestionUploadWork$failedResult$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f10430c
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.f10432e
            r5 = 1
            if (r4 == 0) goto L3b
            if (r4 != r5) goto L33
            java.lang.Object r3 = r2.f10429b
            java.lang.String[] r3 = (java.lang.String[]) r3
            java.lang.Object r2 = r2.f10428a
            kotlin.ResultKt.throwOnFailure(r1)
            goto L7f
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3b:
            kotlin.ResultKt.throwOnFailure(r1)
            com.zykj.evaluation.di.AppDatabase r1 = r0.database
            n5.w r1 = r1.mo8678j()
            n5.v r4 = r0.uploadQuestion
            if (r4 != 0) goto L4e
            java.lang.String r4 = "uploadQuestion"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            r4 = 0
        L4e:
            r6 = r4
            m5.e$a r4 = p167m5.AbstractC8555e.a.f14189b
            int r19 = r4.m14097a()
            r20 = 511(0x1ff, float:7.16E-43)
            r21 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            n5.v r4 = p178n5.C8655v.m14243b(r6, r7, r9, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21)
            r6 = r23
            r2.f10428a = r6
            r7 = r24
            r2.f10429b = r7
            r2.f10432e = r5
            java.lang.Object r1 = r1.mo8766b(r4, r2)
            if (r1 != r3) goto L7d
            return r3
        L7d:
            r2 = r6
            r3 = r7
        L7f:
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "uploadQuestion failed, key is "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r1.<init>(r4)
            com.tencent.bugly.crashreport.CrashReport.postCatchedException(r1)
            java.lang.String r1 = "ERROR_KEY"
            kotlin.Pair r1 = kotlin.TuplesKt.m13565to(r1, r2)
            java.lang.String r2 = "EXTRA_DATA"
            kotlin.Pair r2 = kotlin.TuplesKt.m13565to(r2, r3)
            kotlin.Pair[] r1 = new kotlin.Pair[]{r1, r2}
            androidx.work.Data$Builder r2 = new androidx.work.Data$Builder
            r2.<init>()
            r3 = 0
        Lae:
            r4 = 2
            if (r3 >= r4) goto Lc3
            r4 = r1[r3]
            java.lang.Object r5 = r4.getFirst()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.getSecond()
            r2.put(r5, r4)
            int r3 = r3 + 1
            goto Lae
        Lc3:
            androidx.work.Data r1 = r2.build()
            androidx.work.ListenableWorker$Result r1 = androidx.work.ListenableWorker.Result.failure(r1)
            java.lang.String r2 = "failure(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.upload.QuestionUploadWork.m10495d(java.lang.Object, java.lang.String[], kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/upload/QuestionUploadWork.smali:268
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:69|(1:71)|72|(1:74)|75|(4:77|(2:80|78)|332|81)(2:82|(4:84|(2:87|85)|333|88)(2:90|(3:93|94|(2:96|(1:99))(2:100|(4:103|40|104|(2:106|(1:109))(6:110|(1:112)(1:113)|114|(1:116)|117|(2:119|334)(17:120|121|(2:124|122)|331|125|126|(1:128)|129|321|(3:132|(5:134|(5:137|(4:140|(2:142|325)(2:143|324)|144|138)|323|145|135)|322|146|320)(2:147|(2:318|(2:169|(1:339)(4:172|173|168|(2:175|(1:340)(1:178))(4:179|(3:182|183|(2:185|(1:188))(11:189|(1:191)(1:192)|193|(1:195)|196|(5:199|(1:201)(1:203)|202|204|197)|330|205|(1:207)|208|(2:210|336)(7:211|212|(5:215|(4:218|(2:220|316)(2:221|315)|222|216)|314|223|213)|313|224|321|(1:130))))|181|335)))(3:167|168|(0)(0)))(5:149|(5:152|(4:155|(2:157|329)(2:158|328)|159|153)|327|160|150)|326|161|319))|162)|317|225|308|226|(1:228)|231|(4:233|(1:235)|236|(2:238|(1:341)(13:241|242|243|264|265|267|(2:269|(1:343)(2:272|273))|274|(1:276)|277|(2:279|(1:344)(3:282|283|(1:285)(1:286)))|287|(1:345)(1:290)))(2:246|(1:342)(13:249|250|243|264|265|267|(0)|274|(0)|277|(0)|287|(0)(0))))(4:252|253|254|(2:256|(2:258|337)(5:259|310|260|254|(11:263|264|265|267|(0)|274|(0)|277|(0)|287|(0)(0))(0)))(0)))))))))|89|126|(0)|129|321|(1:130)|317|225|308|226|(0)|231|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0c37, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0c38, code lost:
    
        r5 = r7;
        r6 = r51;
        r14 = r8;
        r17 = r10;
        r18 = r20;
        r16 = r25;
        r10 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0713 A[LOOP:8: B:122:0x070d->B:124:0x0713, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0903  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0961  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0a02  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0a7d  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0b9d  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0c32 A[Catch: all -> 0x0c37, TryCatch #0 {all -> 0x0c37, blocks: (B:226:0x0c2c, B:228:0x0c32, B:231:0x0c45, B:233:0x0c4b, B:235:0x0c4f, B:236:0x0c53, B:238:0x0c59, B:246:0x0cb3, B:252:0x0d0b), top: B:308:0x0c2c }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0c4b A[Catch: all -> 0x0c37, TryCatch #0 {all -> 0x0c37, blocks: (B:226:0x0c2c, B:228:0x0c32, B:231:0x0c45, B:233:0x0c4b, B:235:0x0c4f, B:236:0x0c53, B:238:0x0c59, B:246:0x0cb3, B:252:0x0d0b), top: B:308:0x0c2c }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0d0b A[Catch: all -> 0x0c37, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0c37, blocks: (B:226:0x0c2c, B:228:0x0c32, B:231:0x0c45, B:233:0x0c4b, B:235:0x0c4f, B:236:0x0c53, B:238:0x0c59, B:246:0x0cb3, B:252:0x0d0b), top: B:308:0x0c2c }] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0d2b A[Catch: all -> 0x0d8c, TryCatch #2 {all -> 0x0d8c, blocks: (B:260:0x0d83, B:254:0x0d25, B:256:0x0d2b, B:263:0x0d8e, B:264:0x0d90), top: B:310:0x0d83 }] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0d8e A[Catch: all -> 0x0d8c, TryCatch #2 {all -> 0x0d8c, blocks: (B:260:0x0d83, B:254:0x0d25, B:256:0x0d2b, B:263:0x0d8e, B:264:0x0d90), top: B:310:0x0d83 }] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0dc9  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0e25  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0e2a  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0e79 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0e7a  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0ec0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0ed3  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0edc  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0ee5  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0eed  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0f34 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:338:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:345:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04eb  */
    /* JADX WARN: Type inference failed for: r12v32, types: [T, java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v13, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v33, types: [T, java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r15v8, types: [T, java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v27 */
    /* JADX WARN: Type inference failed for: r16v37 */
    /* JADX WARN: Type inference failed for: r16v38 */
    /* JADX WARN: Type inference failed for: r16v40 */
    /* JADX WARN: Type inference failed for: r16v41 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r2v29, types: [T, java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v53, types: [T, java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v69 */
    /* JADX WARN: Type inference failed for: r5v91 */
    /* JADX WARN: Type inference failed for: r5v92 */
    /* JADX WARN: Type inference failed for: r8v23, types: [T, java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:211:0x0b52 -> B:212:0x0b57). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:259:0x0d7e -> B:310:0x0d83). Please report as a decompilation issue!!! */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doWork(kotlin.coroutines.Continuation r56) {
        /*
            Method dump skipped, instructions count: 3938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.upload.QuestionUploadWork.doWork(kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/upload/QuestionUploadWork.smali:704
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10496f(java.lang.Object r23, java.lang.String[] r24, kotlin.coroutines.Continuation r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r25
            boolean r2 = r1 instanceof com.zykj.evaluation.upload.QuestionUploadWork$successResult$1
            if (r2 == 0) goto L17
            r2 = r1
            com.zykj.evaluation.upload.QuestionUploadWork$successResult$1 r2 = (com.zykj.evaluation.upload.QuestionUploadWork$successResult$1) r2
            int r3 = r2.f10437e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f10437e = r3
            goto L1c
        L17:
            com.zykj.evaluation.upload.QuestionUploadWork$successResult$1 r2 = new com.zykj.evaluation.upload.QuestionUploadWork$successResult$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f10435c
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.f10437e
            r5 = 1
            if (r4 == 0) goto L3b
            if (r4 != r5) goto L33
            java.lang.Object r3 = r2.f10434b
            java.lang.String[] r3 = (java.lang.String[]) r3
            java.lang.Object r2 = r2.f10433a
            kotlin.ResultKt.throwOnFailure(r1)
            goto L7f
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3b:
            kotlin.ResultKt.throwOnFailure(r1)
            com.zykj.evaluation.di.AppDatabase r1 = r0.database
            n5.w r1 = r1.mo8678j()
            n5.v r4 = r0.uploadQuestion
            if (r4 != 0) goto L4e
            java.lang.String r4 = "uploadQuestion"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            r4 = 0
        L4e:
            r6 = r4
            m5.e$b r4 = p167m5.AbstractC8555e.b.f14190b
            int r19 = r4.m14097a()
            r20 = 511(0x1ff, float:7.16E-43)
            r21 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            n5.v r4 = p178n5.C8655v.m14243b(r6, r7, r9, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21)
            r6 = r23
            r2.f10433a = r6
            r7 = r24
            r2.f10434b = r7
            r2.f10437e = r5
            java.lang.Object r1 = r1.mo8766b(r4, r2)
            if (r1 != r3) goto L7d
            return r3
        L7d:
            r2 = r6
            r3 = r7
        L7f:
            java.lang.String r1 = "SUCCESS_KEY"
            kotlin.Pair r1 = kotlin.TuplesKt.m13565to(r1, r2)
            java.lang.String r2 = "EXTRA_DATA"
            kotlin.Pair r2 = kotlin.TuplesKt.m13565to(r2, r3)
            kotlin.Pair[] r1 = new kotlin.Pair[]{r1, r2}
            androidx.work.Data$Builder r2 = new androidx.work.Data$Builder
            r2.<init>()
            r3 = 0
        L95:
            r4 = 2
            if (r3 >= r4) goto Laa
            r4 = r1[r3]
            java.lang.Object r5 = r4.getFirst()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.getSecond()
            r2.put(r5, r4)
            int r3 = r3 + 1
            goto L95
        Laa:
            androidx.work.Data r1 = r2.build()
            androidx.work.ListenableWorker$Result r1 = androidx.work.ListenableWorker.Result.success(r1)
            java.lang.String r2 = "success(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.upload.QuestionUploadWork.m10496f(java.lang.Object, java.lang.String[], kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/upload/QuestionUploadWork.smali:5136
    }
}
