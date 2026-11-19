package com.zykj.evaluation.submit;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.zykj.evaluation.p056di.AppDatabase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import p178n5.C8632a;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b'\u0018\u0000 ,2\u00020\u0001:\u0001$B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ4\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00100\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH¦@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H¦@¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0013H¦@¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0013H¦@¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u0019\u0010\u0015J\"\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001dH\u0082@¢\u0006\u0004\b\u001f\u0010 J$\u0010\"\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001dH\u0082@¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010+\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001a8\u0004@BX\u0084.¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006-"}, m13558d2 = {"Lcom/zykj/evaluation/submit/SubmitWork;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lcom/zykj/evaluation/di/AppDatabase;", "database", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/zykj/evaluation/di/AppDatabase;)V", "", "userId", "taskId", "", "taskState", "Lkotlinx/coroutines/flow/Flow;", "", "o", "(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "m", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "g", "f", "Landroidx/work/ListenableWorker$Result;", "doWork", "Ln5/a;", "k", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "key", "n", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "extra", "i", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lcom/zykj/evaluation/di/AppDatabase;", "value", "b", "Ln5/a;", "l", "()Ln5/a;", "submitTask", "c", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nSubmitWork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubmitWork.kt\ncom/zykj/evaluation/submit/SubmitWork\n+ 2 Data.kt\nandroidx/work/DataKt\n*L\n1#1,206:1\n31#2,5:207\n31#2,5:212\n*S KotlinDebug\n*F\n+ 1 SubmitWork.kt\ncom/zykj/evaluation/submit/SubmitWork\n*L\n166#1:207,5\n203#1:212,5\n*E\n"})
/* loaded from: classes4.dex */
public abstract class SubmitWork extends CoroutineWorker {

    /* renamed from: d */
    public static final int f8940d = 8;

    /* renamed from: e */
    public static final String f8941e;

    /* renamed from: a, reason: from kotlin metadata */
    public final AppDatabase database;

    /* renamed from: b, reason: from kotlin metadata */
    public C8632a submitTask;

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "com.zykj.evaluation.submit.SubmitWork$doWork$2", m13596f = "SubmitWork.kt", m13597i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 9, 9}, m13598l = {79, 84, 118, 124, 127, 128, 129, 131, 136, 142}, m13599m = "invokeSuspend", m13600n = {"$this$coroutineScope", "userId", "taskId", "taskState", "$this$coroutineScope", "userId", "taskId", "taskState", "$this$coroutineScope", "commitState", "job", "userId", "taskId", "taskState", "$this$coroutineScope", "commitState", "job", "userId", "taskId", "taskState", "$this$coroutineScope", "commitState", "job", "userId", "taskId", "taskState", "$this$coroutineScope", "commitState", "job", "userId", "taskId", "taskState", "$this$coroutineScope", "commitState", "job", "userId", "taskId", "taskState", "$this$coroutineScope", "commitState", "job", "userId", "taskId", "taskState", "$this$coroutineScope", "commitState", "job", "e", "userId", "taskId", "taskState", "$this$coroutineScope", "e"}, m13601s = {"L$0", "J$0", "J$1", "I$0", "L$0", "J$0", "J$1", "I$0", "L$0", "L$1", "L$2", "J$0", "J$1", "I$0", "L$0", "L$1", "L$2", "J$0", "J$1", "I$0", "L$0", "L$1", "L$2", "J$0", "J$1", "I$0", "L$0", "L$1", "L$2", "J$0", "J$1", "I$0", "L$0", "L$1", "L$2", "J$0", "J$1", "I$0", "L$0", "L$1", "L$2", "J$0", "J$1", "I$0", "L$0", "L$1", "L$2", "L$3", "J$0", "J$1", "I$0", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nSubmitWork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubmitWork.kt\ncom/zykj/evaluation/submit/SubmitWork$doWork$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n1#2:207\n*E\n"})
    /* renamed from: com.zykj.evaluation.submit.SubmitWork$doWork$2 */
    public static final class C68742 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ListenableWorker.Result>, Object> {

        /* renamed from: a */
        public Object f8944a;

        /* renamed from: b */
        public Object f8945b;

        /* renamed from: c */
        public Object f8946c;

        /* renamed from: d */
        public long f8947d;

        /* renamed from: e */
        public long f8948e;

        /* renamed from: f */
        public int f8949f;

        /* renamed from: g */
        public int f8950g;

        /* renamed from: h */
        public /* synthetic */ Object f8951h;

        public C68742(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C68742 c68742 = SubmitWork.this.new C68742(continuation);
            c68742.f8951h = obj;
            return c68742;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super ListenableWorker.Result> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:63:0x0164, code lost:
        
            if (r14 != com.zykj.evaluation.bean.TaskState.Correcting.INSTANCE.getState()) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x023b, code lost:
        
            if (r0 == r7) goto L48;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 12, insn: 0x005b: MOVE (r13 I:??[long, double]) = (r12 I:??[long, double]) (LINE:92), block:B:17:0x005b */
        /* JADX WARN: Removed duplicated region for block: B:101:0x02b4  */
        /* JADX WARN: Removed duplicated region for block: B:102:0x02b6 A[Catch: Exception -> 0x02fe, PHI: r1 r2 r4 r6 r9 r12 r13 r20
          0x02b6: PHI (r1v23 int) = (r1v21 int), (r1v24 int) binds: [B:100:0x02b2, B:20:0x0074] A[DONT_GENERATE, DONT_INLINE]
          0x02b6: PHI (r2v17 kotlinx.coroutines.Job) = (r2v14 kotlinx.coroutines.Job), (r2v19 kotlinx.coroutines.Job) binds: [B:100:0x02b2, B:20:0x0074] A[DONT_GENERATE, DONT_INLINE]
          0x02b6: PHI (r4v16 long) = (r4v14 long), (r4v17 long) binds: [B:100:0x02b2, B:20:0x0074] A[DONT_GENERATE, DONT_INLINE]
          0x02b6: PHI (r6v14 kotlinx.coroutines.CoroutineScope) = (r6v13 kotlinx.coroutines.CoroutineScope), (r6v1 kotlinx.coroutines.CoroutineScope) binds: [B:100:0x02b2, B:20:0x0074] A[DONT_GENERATE, DONT_INLINE]
          0x02b6: PHI (r9v14 kotlin.jvm.internal.Ref$ObjectRef) = (r9v24 kotlin.jvm.internal.Ref$ObjectRef), (r9v25 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:100:0x02b2, B:20:0x0074] A[DONT_GENERATE, DONT_INLINE]
          0x02b6: PHI (r12v29 com.zykj.evaluation.submit.SubmitWork$doWork$2) = (r12v26 com.zykj.evaluation.submit.SubmitWork$doWork$2), (r12v31 com.zykj.evaluation.submit.SubmitWork$doWork$2) binds: [B:100:0x02b2, B:20:0x0074] A[DONT_GENERATE, DONT_INLINE]
          0x02b6: PHI (r13v13 long) = (r13v11 long), (r13v14 long) binds: [B:100:0x02b2, B:20:0x0074] A[DONT_GENERATE, DONT_INLINE]
          0x02b6: PHI (r20v19 int) = (r20v17 int), (r20v20 int) binds: [B:100:0x02b2, B:20:0x0074] A[DONT_GENERATE, DONT_INLINE], TryCatch #4 {Exception -> 0x02fe, blocks: (B:105:0x02fb, B:102:0x02b6, B:99:0x0291, B:96:0x026c), top: B:143:0x026c }] */
        /* JADX WARN: Removed duplicated region for block: B:104:0x02f9  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x035c  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x039d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:133:0x03c9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:134:0x03ca A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:148:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x014b  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x014e A[Catch: Exception -> 0x01e0, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x01e0, blocks: (B:69:0x01b1, B:71:0x01bb, B:50:0x013b, B:58:0x014e, B:65:0x016e), top: B:137:0x013b }] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x01bb A[Catch: Exception -> 0x01e0, TRY_LEAVE, TryCatch #1 {Exception -> 0x01e0, blocks: (B:69:0x01b1, B:71:0x01bb, B:50:0x013b, B:58:0x014e, B:65:0x016e), top: B:137:0x013b }] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x01e4 A[Catch: Exception -> 0x01dc, TryCatch #5 {Exception -> 0x01dc, blocks: (B:114:0x035e, B:111:0x0302, B:88:0x023f, B:73:0x01d2, B:81:0x01e4, B:83:0x01f4, B:124:0x037a), top: B:145:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:98:0x028f  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0291 A[Catch: Exception -> 0x02fe, PHI: r1 r2 r4 r6 r9 r12 r13 r20
          0x0291: PHI (r1v21 int) = (r1v19 int), (r1v22 int) binds: [B:97:0x028d, B:23:0x008d] A[DONT_GENERATE, DONT_INLINE]
          0x0291: PHI (r2v14 kotlinx.coroutines.Job) = (r2v11 kotlinx.coroutines.Job), (r2v16 kotlinx.coroutines.Job) binds: [B:97:0x028d, B:23:0x008d] A[DONT_GENERATE, DONT_INLINE]
          0x0291: PHI (r4v14 long) = (r4v12 long), (r4v15 long) binds: [B:97:0x028d, B:23:0x008d] A[DONT_GENERATE, DONT_INLINE]
          0x0291: PHI (r6v13 kotlinx.coroutines.CoroutineScope) = (r6v12 kotlinx.coroutines.CoroutineScope), (r6v1 kotlinx.coroutines.CoroutineScope) binds: [B:97:0x028d, B:23:0x008d] A[DONT_GENERATE, DONT_INLINE]
          0x0291: PHI (r9v11 kotlin.jvm.internal.Ref$ObjectRef) = (r9v26 kotlin.jvm.internal.Ref$ObjectRef), (r9v27 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:97:0x028d, B:23:0x008d] A[DONT_GENERATE, DONT_INLINE]
          0x0291: PHI (r12v26 com.zykj.evaluation.submit.SubmitWork$doWork$2) = (r12v23 com.zykj.evaluation.submit.SubmitWork$doWork$2), (r12v28 com.zykj.evaluation.submit.SubmitWork$doWork$2) binds: [B:97:0x028d, B:23:0x008d] A[DONT_GENERATE, DONT_INLINE]
          0x0291: PHI (r13v11 long) = (r13v9 long), (r13v12 long) binds: [B:97:0x028d, B:23:0x008d] A[DONT_GENERATE, DONT_INLINE]
          0x0291: PHI (r20v17 int) = (r20v15 int), (r20v18 int) binds: [B:97:0x028d, B:23:0x008d] A[DONT_GENERATE, DONT_INLINE], TryCatch #4 {Exception -> 0x02fe, blocks: (B:105:0x02fb, B:102:0x02b6, B:99:0x0291, B:96:0x026c), top: B:143:0x026c }] */
        /* JADX WARN: Type inference failed for: r3v17, types: [T, m5.e$c] */
        /* JADX WARN: Type inference failed for: r9v0 */
        /* JADX WARN: Type inference failed for: r9v17 */
        /* JADX WARN: Type inference failed for: r9v18 */
        /* JADX WARN: Type inference failed for: r9v22 */
        /* JADX WARN: Type inference failed for: r9v23 */
        /* JADX WARN: Type inference failed for: r9v4 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01d6 -> B:76:0x01da). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instructions count: 998
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.submit.SubmitWork.C68742.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/submit/SubmitWork$doWork$2.smali:324
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C68742) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static {
        String simpleName = SubmitWork.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        f8941e = simpleName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitWork(Context context, WorkerParameters workerParams, AppDatabase database) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        Intrinsics.checkNotNullParameter(database, "database");
        this.database = database;
    }

    /* renamed from: h */
    public static /* synthetic */ Object m8810h(SubmitWork submitWork, Continuation continuation) {
        return CoroutineScopeKt.coroutineScope(submitWork.new C68742(null), continuation);
    }

    /* renamed from: j */
    public static /* synthetic */ Object m8811j(SubmitWork submitWork, Object obj, Object obj2, Continuation continuation, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: failedResult");
        }
        if ((i10 & 2) != 0) {
            obj2 = null;
        }
        return submitWork.m8812i(obj, obj2, continuation);
    }

    @Override // androidx.work.CoroutineWorker
    public Object doWork(Continuation continuation) {
        return m8810h(this, continuation);
    }

    /* renamed from: f */
    public abstract Object mo8779f(Continuation continuation);

    /* renamed from: g */
    public abstract Object mo8780g(Continuation continuation);

    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0141 A[LOOP:0: B:42:0x013f->B:43:0x0141, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8812i(java.lang.Object r24, java.lang.Object r25, kotlin.coroutines.Continuation r26) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.submit.SubmitWork.m8812i(java.lang.Object, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/submit/SubmitWork.smali:348
    }

    /* renamed from: k */
    public final Object m8813k(long j10, long j11, Continuation continuation) {
        return this.database.mo8675g().mo8711d(j10, j11, continuation);
    }

    /* renamed from: l */
    public final C8632a m8814l() {
        C8632a c8632a = this.submitTask;
        if (c8632a != null) {
            return c8632a;
        }
        Intrinsics.throwUninitializedPropertyAccessException("submitTask");
        return null;
    }

    /* renamed from: m */
    public abstract Object mo8781m(Continuation continuation);

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8815n(java.lang.Object r22, kotlin.coroutines.Continuation r23) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.submit.SubmitWork.m8815n(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/submit/SubmitWork.smali:1164
    }

    /* renamed from: o */
    public abstract Object mo8782o(long j10, long j11, int i10, Continuation continuation);
}
