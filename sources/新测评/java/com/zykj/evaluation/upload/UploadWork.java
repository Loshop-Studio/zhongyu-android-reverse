package com.zykj.evaluation.upload;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u0000 *2\u00020\u0001:\u0001(B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H¦@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\rH¦@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000fH\u0097@¢\u0006\u0004\b\u001a\u0010\u0014J(\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ2\u0010$\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"H\u0082@¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u0004\u0018\u00010\r2\u0006\u0010&\u001a\u00020\rH\u0082@¢\u0006\u0004\b'\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, m13558d2 = {"Lcom/zykj/evaluation/upload/UploadWork;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lcom/zykj/evaluation/upload/OssTaskManger;", "ossTaskManger", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/zykj/evaluation/upload/OssTaskManger;)V", "", "key", "", "", "extras", "Landroidx/work/ListenableWorker$Result;", "f", "(Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "h", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadUrl", "i", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "g", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doWork", "j", "(Ljava/lang/String;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Ljava/io/File;", "file", "fileRelativePath", "Lcom/zykj/evaluation/upload/OssToken;", "credential", "k", "(ILjava/io/File;Ljava/lang/String;Lcom/zykj/evaluation/upload/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "srcPath", "l", "a", "Lcom/zykj/evaluation/upload/OssTaskManger;", "b", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nUploadWork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadWork.kt\ncom/zykj/evaluation/upload/UploadWork\n+ 2 Data.kt\nandroidx/work/DataKt\n*L\n1#1,232:1\n31#2,5:233\n31#2,5:238\n31#2,5:243\n*S KotlinDebug\n*F\n+ 1 UploadWork.kt\ncom/zykj/evaluation/upload/UploadWork\n*L\n112#1:233,5\n185#1:238,5\n193#1:243,5\n*E\n"})
/* loaded from: classes4.dex */
public abstract class UploadWork extends CoroutineWorker {

    /* renamed from: c */
    public static final int f10496c;

    /* renamed from: d */
    public static final String f10497d;

    /* renamed from: a, reason: from kotlin metadata */
    public final OssTaskManger ossTaskManger;

    @Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "com.zykj.evaluation.upload.UploadWork", m13596f = "UploadWork.kt", m13597i = {0, 1, 1, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 14}, m13598l = {70, 75, 83, 96, 105, 106, 119, 131, 141, 149, 154, 161, 164, 170, 175}, m13599m = "doWork$suspendImpl", m13600n = {"$this", "$this", "extras", "$this", "extras", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "$this", "extras", "filePath", "file", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "$this", "extras", "filePath", "file", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "$this", "extras", "filePath", "file", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "$this", "extras", "filePath", "file", "date", "fileName", "ext", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "$this", "extras", "filePath", "file", "fileName", "ext", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "$this", "extras", "filePath", "file", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "$i$a$-run-UploadWork$doWork$ossData$3", "$this", "extras", "filePath", "file", "ossData", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "$this", "extras", "filePath", "file", "ossData", "it", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "$i$a$-let-UploadWork$doWork$3", "$this", "extras", "filePath", "file", "ossData", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "$this", "extras", "filePath", "file", "ossData", "url", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "$this", "extras", "filePath", "file", "ossData", "url", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "$this", "extras", "filePath", "file", "e", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY}, m13601s = {"L$0", "L$0", "L$1", "L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0"})
    /* renamed from: com.zykj.evaluation.upload.UploadWork$doWork$1 */
    public static final class C69531 extends ContinuationImpl {

        /* renamed from: a */
        public Object f10499a;

        /* renamed from: b */
        public Object f10500b;

        /* renamed from: c */
        public Object f10501c;

        /* renamed from: d */
        public Object f10502d;

        /* renamed from: e */
        public Object f10503e;

        /* renamed from: f */
        public Object f10504f;

        /* renamed from: g */
        public Object f10505g;

        /* renamed from: h */
        public int f10506h;

        /* renamed from: i */
        public int f10507i;

        /* renamed from: j */
        public /* synthetic */ Object f10508j;

        /* renamed from: l */
        public int f10510l;

        public C69531(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10508j = obj;
            this.f10510l |= Integer.MIN_VALUE;
            return UploadWork.m10514e(UploadWork.this, this);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f10496c = 8;
        String simpleName = companion.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        f10497d = simpleName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadWork(Context context, WorkerParameters workerParams, OssTaskManger ossTaskManger) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        Intrinsics.checkNotNullParameter(ossTaskManger, "ossTaskManger");
        this.ossTaskManger = ossTaskManger;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0144: MOVE (r4 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]) (LINE:325), block:B:41:0x0144 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0196: MOVE (r5 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]) (LINE:407), block:B:49:0x0196 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0145: MOVE (r5 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:326), block:B:41:0x0144 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0197: MOVE (r6 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:408), block:B:49:0x0196 */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x0146: MOVE (r6 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]) (LINE:327), block:B:41:0x0144 */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x0198: MOVE (r7 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]) (LINE:409), block:B:49:0x0196 */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x0147: MOVE (r7 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]) (LINE:328), block:B:41:0x0144 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02de A[Catch: Exception -> 0x02fc, TRY_LEAVE, TryCatch #2 {Exception -> 0x02fc, blocks: (B:101:0x02da, B:103:0x02de, B:132:0x0391, B:134:0x0395), top: B:208:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0395 A[Catch: Exception -> 0x02fc, TRY_LEAVE, TryCatch #2 {Exception -> 0x02fc, blocks: (B:101:0x02da, B:103:0x02de, B:132:0x0391, B:134:0x0395), top: B:208:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0403 A[Catch: Exception -> 0x0449, TRY_ENTER, TryCatch #3 {Exception -> 0x0449, blocks: (B:151:0x0403, B:158:0x044e, B:160:0x0458), top: B:211:0x0401 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x047a A[Catch: Exception -> 0x04a2, TryCatch #9 {Exception -> 0x04a2, blocks: (B:187:0x0575, B:192:0x05bd, B:179:0x0529, B:181:0x052d, B:184:0x0534, B:189:0x0578, B:164:0x0476, B:166:0x047a, B:170:0x04a5), top: B:215:0x0476 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04a5 A[Catch: Exception -> 0x04a2, TRY_LEAVE, TryCatch #9 {Exception -> 0x04a2, blocks: (B:187:0x0575, B:192:0x05bd, B:179:0x0529, B:181:0x052d, B:184:0x0534, B:189:0x0578, B:164:0x0476, B:166:0x047a, B:170:0x04a5), top: B:215:0x0476 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0578 A[Catch: Exception -> 0x04a2, TryCatch #9 {Exception -> 0x04a2, blocks: (B:187:0x0575, B:192:0x05bd, B:179:0x0529, B:181:0x052d, B:184:0x0534, B:189:0x0578, B:164:0x0476, B:166:0x047a, B:170:0x04a5), top: B:215:0x0476 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0618 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x065d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r11v0, types: [T, java.io.File] */
    /* JADX WARN: Type inference failed for: r15v15, types: [com.zykj.evaluation.upload.UploadWork, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v48, types: [com.zykj.evaluation.upload.UploadWork, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r4v31, types: [java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v40, types: [java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r4v70 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v69 */
    /* JADX WARN: Type inference failed for: r5v70 */
    /* JADX WARN: Type inference failed for: r5v71 */
    /* JADX WARN: Type inference failed for: r5v72 */
    /* JADX WARN: Type inference failed for: r5v73 */
    /* JADX WARN: Type inference failed for: r5v80 */
    /* JADX WARN: Type inference failed for: r5v81 */
    /* JADX WARN: Type inference failed for: r6v51, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r9v14, types: [T, java.io.File] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object m10514e(com.zykj.evaluation.upload.UploadWork r17, kotlin.coroutines.Continuation r18) {
        /*
            Method dump skipped, instructions count: 1668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.upload.UploadWork.m10514e(com.zykj.evaluation.upload.UploadWork, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/upload/UploadWork.smali:244
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10515f(java.lang.Object r5, java.lang.String[] r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.zykj.evaluation.upload.UploadWork$failedResult$1
            if (r0 == 0) goto L13
            r0 = r7
            com.zykj.evaluation.upload.UploadWork$failedResult$1 r0 = (com.zykj.evaluation.upload.UploadWork$failedResult$1) r0
            int r1 = r0.f10515e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10515e = r1
            goto L18
        L13:
            com.zykj.evaluation.upload.UploadWork$failedResult$1 r0 = new com.zykj.evaluation.upload.UploadWork$failedResult$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f10513c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f10515e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r5 = r0.f10512b
            r6 = r5
            java.lang.String[] r6 = (java.lang.String[]) r6
            java.lang.Object r5 = r0.f10511a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L48
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            kotlin.ResultKt.throwOnFailure(r7)
            r0.f10511a = r5
            r0.f10512b = r6
            r0.f10515e = r3
            java.lang.Object r7 = r4.mo10452g(r5, r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            java.lang.String r7 = "ERROR_KEY"
            kotlin.Pair r5 = kotlin.TuplesKt.m13565to(r7, r5)
            java.lang.String r7 = "EXTRA_DATA"
            kotlin.Pair r6 = kotlin.TuplesKt.m13565to(r7, r6)
            kotlin.Pair[] r5 = new kotlin.Pair[]{r5, r6}
            androidx.work.Data$Builder r6 = new androidx.work.Data$Builder
            r6.<init>()
            r7 = 0
        L5e:
            r0 = 2
            if (r7 >= r0) goto L73
            r0 = r5[r7]
            java.lang.Object r1 = r0.getFirst()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getSecond()
            r6.put(r1, r0)
            int r7 = r7 + 1
            goto L5e
        L73:
            androidx.work.Data r5 = r6.build()
            androidx.work.ListenableWorker$Result r5 = androidx.work.ListenableWorker.Result.failure(r5)
            java.lang.String r6 = "failure(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.upload.UploadWork.m10515f(java.lang.Object, java.lang.String[], kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/upload/UploadWork.smali:3784
    }

    @Override // androidx.work.CoroutineWorker
    public Object doWork(Continuation continuation) {
        return m10514e(this, continuation);
    }

    /* renamed from: g */
    public abstract Object mo10452g(Object obj, Continuation continuation);

    /* renamed from: h */
    public abstract Object mo10453h(Continuation continuation);

    /* renamed from: i */
    public abstract Object mo10454i(String str, Continuation continuation);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10516j(java.lang.String r5, java.lang.String[] r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.zykj.evaluation.upload.UploadWork$successResult$1
            if (r0 == 0) goto L13
            r0 = r7
            com.zykj.evaluation.upload.UploadWork$successResult$1 r0 = (com.zykj.evaluation.upload.UploadWork$successResult$1) r0
            int r1 = r0.f10520e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10520e = r1
            goto L18
        L13:
            com.zykj.evaluation.upload.UploadWork$successResult$1 r0 = new com.zykj.evaluation.upload.UploadWork$successResult$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f10518c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f10520e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r5 = r0.f10517b
            r6 = r5
            java.lang.String[] r6 = (java.lang.String[]) r6
            java.lang.Object r5 = r0.f10516a
            java.lang.String r5 = (java.lang.String) r5
            kotlin.ResultKt.throwOnFailure(r7)
            goto L4a
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            kotlin.ResultKt.throwOnFailure(r7)
            r0.f10516a = r5
            r0.f10517b = r6
            r0.f10520e = r3
            java.lang.Object r7 = r4.mo10454i(r5, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            java.lang.String r7 = "SUCCESS_KEY"
            kotlin.Pair r5 = kotlin.TuplesKt.m13565to(r7, r5)
            java.lang.String r7 = "EXTRA_DATA"
            kotlin.Pair r6 = kotlin.TuplesKt.m13565to(r7, r6)
            kotlin.Pair[] r5 = new kotlin.Pair[]{r5, r6}
            androidx.work.Data$Builder r6 = new androidx.work.Data$Builder
            r6.<init>()
            r7 = 0
        L60:
            r0 = 2
            if (r7 >= r0) goto L75
            r0 = r5[r7]
            java.lang.Object r1 = r0.getFirst()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getSecond()
            r6.put(r1, r0)
            int r7 = r7 + 1
            goto L60
        L75:
            androidx.work.Data r5 = r6.build()
            androidx.work.ListenableWorker$Result r5 = androidx.work.ListenableWorker.Result.success(r5)
            java.lang.String r6 = "success(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.upload.UploadWork.m10516j(java.lang.String, java.lang.String[], kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/upload/UploadWork.smali:4080
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10517k(int r6, java.io.File r7, java.lang.String r8, com.zykj.evaluation.upload.OssToken r9, kotlin.coroutines.Continuation r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof com.zykj.evaluation.upload.UploadWork$uploadFile$1
            if (r0 == 0) goto L13
            r0 = r10
            com.zykj.evaluation.upload.UploadWork$uploadFile$1 r0 = (com.zykj.evaluation.upload.UploadWork$uploadFile$1) r0
            int r1 = r0.f10527g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10527g = r1
            goto L18
        L13:
            com.zykj.evaluation.upload.UploadWork$uploadFile$1 r0 = new com.zykj.evaluation.upload.UploadWork$uploadFile$1
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.f10525e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f10527g
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            int r6 = r0.f10521a
            java.lang.Object r7 = r0.f10524d
            com.zykj.evaluation.upload.OssToken r7 = (com.zykj.evaluation.upload.OssToken) r7
            java.lang.Object r7 = r0.f10523c
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.f10522b
            java.io.File r7 = (java.io.File) r7
            kotlin.ResultKt.throwOnFailure(r10)
            goto L66
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3f:
            kotlin.ResultKt.throwOnFailure(r10)
            com.zykj.evaluation.upload.UploadUtils r10 = com.zykj.evaluation.upload.UploadUtils.f10480a
            java.lang.String r2 = r7.getAbsolutePath()
            java.lang.String r4 = "getAbsolutePath(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            r0.f10522b = r7
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r0.f10523c = r4
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)
            r0.f10524d = r4
            r0.f10521a = r6
            r0.f10527g = r3
            java.lang.Object r10 = r10.m10509c(r2, r8, r9, r0)
            if (r10 != r1) goto L66
            return r1
        L66:
            java.lang.String r10 = (java.lang.String) r10
            if (r6 != r3) goto L6d
            r7.delete()
        L6d:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.upload.UploadWork.m10517k(int, java.io.File, java.lang.String, com.zykj.evaluation.upload.OssToken, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/upload/UploadWork.smali:4359
    }

    /* renamed from: l */
    public final Object m10518l(String str, Continuation continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new UploadWork$zipFile$2(str, null), continuation);
    }
}
