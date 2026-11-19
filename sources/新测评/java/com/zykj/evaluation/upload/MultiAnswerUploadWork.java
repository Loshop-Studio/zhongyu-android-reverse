package com.zykj.evaluation.upload;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.hilt.work.HiltWorker;
import androidx.work.CoroutineWorker;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkerParameters;
import com.blankj.utilcode.util.GsonUtils;
import com.zykj.evaluation.bean.UploadData;
import com.zykj.evaluation.p056di.AppDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p167m5.AbstractC8555e;
import p178n5.C8641h;

@StabilityInferred(parameters = 0)
@HiltWorker
@Metadata(m13557d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001cB-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m13558d2 = {"Lcom/zykj/evaluation/upload/MultiAnswerUploadWork;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lcom/zykj/evaluation/upload/OssTaskManger;", "ossTaskManger", "Lcom/zykj/evaluation/di/AppDatabase;", "database", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/zykj/evaluation/upload/OssTaskManger;Lcom/zykj/evaluation/di/AppDatabase;)V", "Landroidx/work/ListenableWorker$Result;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "uuid", "filePath", "uploadUrl", "Lm5/e;", "commitState", "", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm5/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "key", "c", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lcom/zykj/evaluation/upload/OssTaskManger;", "b", "Lcom/zykj/evaluation/di/AppDatabase;", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nMultiAnswerUploadWork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiAnswerUploadWork.kt\ncom/zykj/evaluation/upload/MultiAnswerUploadWork\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Data.kt\nandroidx/work/DataKt\n*L\n1#1,188:1\n13472#2,2:189\n13472#2,2:196\n31#3,5:191\n31#3,5:198\n*S KotlinDebug\n*F\n+ 1 MultiAnswerUploadWork.kt\ncom/zykj/evaluation/upload/MultiAnswerUploadWork\n*L\n81#1:189,2\n169#1:196,2\n136#1:191,5\n186#1:198,5\n*E\n"})
/* loaded from: classes4.dex */
public final class MultiAnswerUploadWork extends CoroutineWorker {

    /* renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d */
    public static final int f10273d = 8;

    /* renamed from: a, reason: from kotlin metadata */
    public final OssTaskManger ossTaskManger;

    /* renamed from: b, reason: from kotlin metadata */
    public final AppDatabase database;

    /* renamed from: com.zykj.evaluation.upload.MultiAnswerUploadWork$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final OneTimeWorkRequest.Builder m10465a(long j10, long j11, int i10, List uploadAnswerList) {
            Intrinsics.checkNotNullParameter(uploadAnswerList, "uploadAnswerList");
            OneTimeWorkRequest.Builder builder = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) MultiAnswerUploadWork.class);
            Data.Builder builder2 = new Data.Builder();
            builder2.putLong("USER_ID", j10);
            builder2.putLong("TASK_ID", j11);
            builder2.putInt("TASK_STATE", i10);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(uploadAnswerList, 10));
            Iterator it = uploadAnswerList.iterator();
            while (it.hasNext()) {
                arrayList.add(GsonUtils.toJson((Pair) it.next()));
            }
            builder2.putStringArray("ANSWER_DATA", (String[]) arrayList.toArray(new String[0]));
            return builder.setInputData(builder2.build());
        }

        public Companion() {
        }
    }

    @Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "com.zykj.evaluation.upload.MultiAnswerUploadWork", m13596f = "MultiAnswerUploadWork.kt", m13597i = {2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6}, m13598l = {72, 75, 76, 99, 107, 115, 124}, m13599m = "doWork", m13600n = {"it", "$i$a$-let-MultiAnswerUploadWork$doWork$ossData$1", "ossData", "failedList", "$this$forEach$iv", "element$iv", "it", "pair", "uuid", "filePath", "file", "extension", "uploadPath", "$i$f$forEach", "$i$a$-forEach-MultiAnswerUploadWork$doWork$2", "ossData", "failedList", "$this$forEach$iv", "element$iv", "it", "pair", "uuid", "filePath", "file", "extension", "uploadPath", "$i$f$forEach", "$i$a$-forEach-MultiAnswerUploadWork$doWork$2", "ossData", "failedList", "$this$forEach$iv", "element$iv", "it", "pair", "uuid", "filePath", "file", "extension", "uploadPath", "url", "$i$f$forEach", "$i$a$-forEach-MultiAnswerUploadWork$doWork$2", "ossData", "failedList", "$this$forEach$iv", "element$iv", "it", "pair", "uuid", "filePath", "file", "extension", "uploadPath", "url", "$i$f$forEach", "$i$a$-forEach-MultiAnswerUploadWork$doWork$2"}, m13601s = {"L$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "I$0", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "I$0", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "I$0", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "I$0", "I$3"})
    /* renamed from: com.zykj.evaluation.upload.MultiAnswerUploadWork$doWork$1 */
    public static final class C69471 extends ContinuationImpl {

        /* renamed from: a */
        public Object f10276a;

        /* renamed from: b */
        public Object f10277b;

        /* renamed from: c */
        public Object f10278c;

        /* renamed from: d */
        public Object f10279d;

        /* renamed from: e */
        public Object f10280e;

        /* renamed from: f */
        public Object f10281f;

        /* renamed from: g */
        public Object f10282g;

        /* renamed from: h */
        public Object f10283h;

        /* renamed from: i */
        public Object f10284i;

        /* renamed from: j */
        public Object f10285j;

        /* renamed from: k */
        public Object f10286k;

        /* renamed from: l */
        public Object f10287l;

        /* renamed from: m */
        public int f10288m;

        /* renamed from: n */
        public int f10289n;

        /* renamed from: o */
        public int f10290o;

        /* renamed from: p */
        public int f10291p;

        /* renamed from: q */
        public /* synthetic */ Object f10292q;

        /* renamed from: s */
        public int f10294s;

        public C69471(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10292q = obj;
            this.f10294s |= Integer.MIN_VALUE;
            return MultiAnswerUploadWork.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiAnswerUploadWork(Context context, WorkerParameters workerParams, OssTaskManger ossTaskManger, AppDatabase database) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        Intrinsics.checkNotNullParameter(ossTaskManger, "ossTaskManger");
        Intrinsics.checkNotNullParameter(database, "database");
        this.ossTaskManger = ossTaskManger;
        this.database = database;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00dc -> B:21:0x00df). Please report as a decompilation issue!!! */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10463c(java.lang.Object r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.upload.MultiAnswerUploadWork.m10463c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/upload/MultiAnswerUploadWork.smali:179
    }

    /* renamed from: d */
    public final Object m10464d(String str, String str2, String str3, AbstractC8555e abstractC8555e, Continuation continuation) {
        Object objMo8728c = this.database.mo8676h().mo8728c(new C8641h(getInputData().getLong("USER_ID", 0L), getInputData().getLong("TASK_ID", 0L), getInputData().getInt("TASK_STATE", 0), str, new UploadData(str, str2, str3, abstractC8555e.m14097a())), continuation);
        return objMo8728c == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo8728c : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0367, code lost:
    
        if (m10464d(r12, r2, r1, r4, r5) == r6) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0372, code lost:
    
        r2 = r5;
        r4 = r7;
        r5 = r8;
        r3 = r11;
        r11 = r13;
        r12 = r14;
        r13 = r15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:60:0x02ed, B:62:0x02f3], limit reached: 73 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r23v0, types: [androidx.work.ListenableWorker, com.zykj.evaluation.upload.MultiAnswerUploadWork, java.lang.Object] */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doWork(kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instructions count: 1096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.upload.MultiAnswerUploadWork.doWork(kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/upload/MultiAnswerUploadWork.smali:887
    }
}
