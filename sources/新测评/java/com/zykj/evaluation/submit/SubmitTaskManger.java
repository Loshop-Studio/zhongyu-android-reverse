package com.zykj.evaluation.submit;

// RE note 本类字节码直接引用的读写或显示接口包括JSON。

import android.app.Application;
import androidx.work.WorkManager;
import com.blankj.utilcode.util.Utils;
import com.zykj.evaluation.bean.TaskState;
import com.zykj.evaluation.p056di.AppDatabase;
import com.zykj.evaluation.submit.SubmitTaskManger;
import com.zykj.evaluation.upload.OssTaskManger;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class SubmitTaskManger {

    /* renamed from: a */
    public final AppDatabase f8890a;

    /* renamed from: b */
    public final OssTaskManger f8891b;

    /* renamed from: c */
    public final Lazy f8892c;

    public SubmitTaskManger(AppDatabase database, OssTaskManger ossTaskManger) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(ossTaskManger, "ossTaskManger");
        this.f8890a = database;
        this.f8891b = ossTaskManger;
        this.f8892c = LazyKt.lazy(new Function0() { // from class: r5.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SubmitTaskManger.m8799m();
            }
        });
    }

    /* renamed from: h */
    public static /* synthetic */ Object m8796h(SubmitTaskManger submitTaskManger, long j10, long j11, int i10, String str, String[] strArr, Continuation continuation, int i11, Object obj) {
        String str2;
        if ((i11 & 8) != 0) {
            str2 = j10 + "_" + j11 + "_" + i10;
        } else {
            str2 = str;
        }
        return submitTaskManger.m8803g(j10, j11, i10, str2, (i11 & 16) != 0 ? new String[0] : strArr, continuation);
    }

    /* renamed from: j */
    public static /* synthetic */ Object m8797j(SubmitTaskManger submitTaskManger, long j10, long j11, List list, String str, String[] strArr, Continuation continuation, int i10, Object obj) {
        String str2;
        if ((i10 & 8) != 0) {
            str2 = j10 + "_" + j11 + "_" + TaskState.ToDo.INSTANCE.getState();
        } else {
            str2 = str;
        }
        return submitTaskManger.m8804i(j10, j11, list, str2, (i10 & 16) != 0 ? new String[0] : strArr, continuation);
    }

    /* renamed from: l */
    public static /* synthetic */ Object m8798l(SubmitTaskManger submitTaskManger, long j10, long j11, int i10, String str, String[] strArr, Continuation continuation, int i11, Object obj) {
        String str2;
        if ((i11 & 8) != 0) {
            str2 = j10 + "_" + j11 + "_" + i10;
        } else {
            str2 = str;
        }
        return submitTaskManger.m8805k(j10, j11, i10, str2, (i11 & 16) != 0 ? new String[0] : strArr, continuation);
    }

    /* renamed from: m */
    public static final WorkManager m8799m() {
        WorkManager.Companion companion = WorkManager.INSTANCE;
        Application app = Utils.getApp();
        Intrinsics.checkNotNullExpressionValue(app, "getApp(...)");
        return companion.getInstance(app);
    }

    /* renamed from: d */
    public final WorkManager m8800d() {
        return (WorkManager) this.f8892c.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7 A[Catch: Exception -> 0x0042, TryCatch #1 {Exception -> 0x0042, blocks: (B:14:0x003d, B:38:0x00c8, B:40:0x00cf, B:52:0x00fa, B:53:0x011a, B:43:0x00d7, B:44:0x00db, B:46:0x00e1, B:48:0x00ef), top: B:64:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e1 A[Catch: Exception -> 0x0042, TryCatch #1 {Exception -> 0x0042, blocks: (B:14:0x003d, B:38:0x00c8, B:40:0x00cf, B:52:0x00fa, B:53:0x011a, B:43:0x00d7, B:44:0x00db, B:46:0x00e1, B:48:0x00ef), top: B:64:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fa A[Catch: Exception -> 0x0042, TryCatch #1 {Exception -> 0x0042, blocks: (B:14:0x003d, B:38:0x00c8, B:40:0x00cf, B:52:0x00fa, B:53:0x011a, B:43:0x00d7, B:44:0x00db, B:46:0x00e1, B:48:0x00ef), top: B:64:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8801e(long r18, long r20, java.lang.String r22, kotlin.coroutines.Continuation r23) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.submit.SubmitTaskManger.m8801e(long, long, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/submit/SubmitTaskManger.smali:579
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
    
        if (r3.m10482n(r4, r6, r8, r9) == r2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c9, code lost:
    
        r24 = r6;
        r6 = r4;
        r4 = r24;
        r3 = r8;
        r8 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ee, code lost:
    
        if (r3.m10483o(r4, r6, r8, r9) == r2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010a, code lost:
    
        if (r3.m10484p(r4, r6, r8, r9) == r2) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8802f(long r27, long r29, int r31, kotlin.coroutines.Continuation r32) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.submit.SubmitTaskManger.m8802f(long, long, int, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/submit/SubmitTaskManger.smali:1233
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8803g(long r19, long r21, int r23, java.lang.String r24, java.lang.String[] r25, kotlin.coroutines.Continuation r26) {
        /*
            r18 = this;
            r0 = r18
            r1 = r26
            boolean r2 = r1 instanceof com.zykj.evaluation.submit.SubmitTaskManger$startSubmitCorrectSelfWork$1
            if (r2 == 0) goto L17
            r2 = r1
            com.zykj.evaluation.submit.SubmitTaskManger$startSubmitCorrectSelfWork$1 r2 = (com.zykj.evaluation.submit.SubmitTaskManger$startSubmitCorrectSelfWork$1) r2
            int r3 = r2.f8921h
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f8921h = r3
            goto L1c
        L17:
            com.zykj.evaluation.submit.SubmitTaskManger$startSubmitCorrectSelfWork$1 r2 = new com.zykj.evaluation.submit.SubmitTaskManger$startSubmitCorrectSelfWork$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f8919f
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.f8921h
            r5 = 1
            if (r4 == 0) goto L48
            if (r4 != r5) goto L40
            int r3 = r2.f8916c
            long r4 = r2.f8915b
            long r6 = r2.f8914a
            java.lang.Object r8 = r2.f8918e
            java.lang.String[] r8 = (java.lang.String[]) r8
            java.lang.Object r2 = r2.f8917d
            java.lang.String r2 = (java.lang.String) r2
            kotlin.ResultKt.throwOnFailure(r1)
            r10 = r6
            r7 = r8
            r8 = r10
            r12 = r3
            r10 = r4
            goto L8c
        L40:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L48:
            kotlin.ResultKt.throwOnFailure(r1)
            com.zykj.evaluation.di.AppDatabase r1 = r0.f8890a
            n5.b r1 = r1.mo8675g()
            n5.a r6 = new n5.a
            m5.i$a r4 = p167m5.AbstractC8559i.a.f14195b
            int r11 = r4.m14101a()
            m5.e$c r4 = p167m5.AbstractC8555e.c.f14191b
            int r13 = r4.m14097a()
            r16 = 64
            r17 = 0
            java.lang.String r12 = ""
            r14 = 0
            r15 = 0
            r7 = r19
            r9 = r21
            r6.<init>(r7, r9, r11, r12, r13, r14, r15, r16, r17)
            r4 = r24
            r2.f8917d = r4
            r7 = r25
            r2.f8918e = r7
            r8 = r19
            r2.f8914a = r8
            r10 = r21
            r2.f8915b = r10
            r12 = r23
            r2.f8916c = r12
            r2.f8921h = r5
            java.lang.Object r1 = r1.mo8708a(r6, r2)
            if (r1 != r3) goto L8b
            return r3
        L8b:
            r2 = r4
        L8c:
            com.zykj.evaluation.submit.SubmitCorrectSelfWork$a r1 = com.zykj.evaluation.submit.SubmitCorrectSelfWork.INSTANCE
            int r3 = r7.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r7, r3)
            java.lang.String[] r3 = (java.lang.String[]) r3
            r19 = r1
            r25 = r3
            r20 = r8
            r22 = r10
            r24 = r12
            androidx.work.OneTimeWorkRequest$Builder r1 = r19.m8784a(r20, r22, r24, r25)
            androidx.work.WorkRequest r1 = r1.build()
            androidx.work.OneTimeWorkRequest r1 = (androidx.work.OneTimeWorkRequest) r1
            androidx.work.WorkManager r3 = r0.m8800d()
            androidx.work.ExistingWorkPolicy r4 = androidx.work.ExistingWorkPolicy.REPLACE
            r3.enqueueUniqueWork(r2, r4, r1)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.submit.SubmitTaskManger.m8803g(long, long, int, java.lang.String, java.lang.String[], kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/submit/SubmitTaskManger.smali:2262
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8804i(long r19, long r21, java.util.List r23, java.lang.String r24, java.lang.String[] r25, kotlin.coroutines.Continuation r26) {
        /*
            r18 = this;
            r0 = r18
            r1 = r26
            boolean r2 = r1 instanceof com.zykj.evaluation.submit.SubmitTaskManger$startSubmitNoStemWork$1
            if (r2 == 0) goto L17
            r2 = r1
            com.zykj.evaluation.submit.SubmitTaskManger$startSubmitNoStemWork$1 r2 = (com.zykj.evaluation.submit.SubmitTaskManger$startSubmitNoStemWork$1) r2
            int r3 = r2.f8930i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f8930i = r3
            goto L1c
        L17:
            com.zykj.evaluation.submit.SubmitTaskManger$startSubmitNoStemWork$1 r2 = new com.zykj.evaluation.submit.SubmitTaskManger$startSubmitNoStemWork$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f8928g
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.f8930i
            r5 = 1
            if (r4 == 0) goto L4e
            if (r4 != r5) goto L46
            long r3 = r2.f8923b
            long r5 = r2.f8922a
            java.lang.Object r7 = r2.f8927f
            com.google.gson.Gson r7 = (com.google.gson.Gson) r7
            java.lang.Object r7 = r2.f8926e
            java.lang.String[] r7 = (java.lang.String[]) r7
            java.lang.Object r8 = r2.f8925d
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r2.f8924c
            java.util.List r2 = (java.util.List) r2
            kotlin.ResultKt.throwOnFailure(r1)
            r9 = r8
            r8 = r7
            r7 = r9
            r11 = r3
            r9 = r5
            goto La7
        L46:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L4e:
            kotlin.ResultKt.throwOnFailure(r1)
            com.google.gson.Gson r1 = new com.google.gson.Gson
            r1.<init>()
            com.zykj.evaluation.di.AppDatabase r4 = r0.f8890a
            n5.b r4 = r4.mo8675g()
            n5.a r6 = new n5.a
            m5.i$b r7 = p167m5.AbstractC8559i.b.f14196b
            int r11 = r7.m14101a()
            r7 = r23
            java.lang.String r12 = r1.toJson(r7)
            java.lang.String r8 = "toJson(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r8)
            m5.e$c r8 = p167m5.AbstractC8555e.c.f14191b
            int r13 = r8.m14097a()
            r16 = 64
            r17 = 0
            r14 = 0
            r15 = 0
            r7 = r19
            r9 = r21
            r6.<init>(r7, r9, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r23)
            r2.f8924c = r7
            r7 = r24
            r2.f8925d = r7
            r8 = r25
            r2.f8926e = r8
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)
            r2.f8927f = r1
            r9 = r19
            r2.f8922a = r9
            r11 = r21
            r2.f8923b = r11
            r2.f8930i = r5
            java.lang.Object r1 = r4.mo8708a(r6, r2)
            if (r1 != r3) goto La7
            return r3
        La7:
            com.zykj.evaluation.submit.SubmitNoStemWork$a r1 = com.zykj.evaluation.submit.SubmitNoStemWork.INSTANCE
            int r2 = r8.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r8, r2)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r19 = r1
            r24 = r2
            r20 = r9
            r22 = r11
            androidx.work.OneTimeWorkRequest$Builder r1 = r19.m8788a(r20, r22, r24)
            androidx.work.WorkRequest r1 = r1.build()
            androidx.work.OneTimeWorkRequest r1 = (androidx.work.OneTimeWorkRequest) r1
            androidx.work.WorkManager r2 = r0.m8800d()
            androidx.work.ExistingWorkPolicy r3 = androidx.work.ExistingWorkPolicy.REPLACE
            r2.enqueueUniqueWork(r7, r3, r1)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.submit.SubmitTaskManger.m8804i(long, long, java.util.List, java.lang.String, java.lang.String[], kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/submit/SubmitTaskManger.smali:2646
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8805k(long r24, long r26, int r28, java.lang.String r29, java.lang.String[] r30, kotlin.coroutines.Continuation r31) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.submit.SubmitTaskManger.m8805k(long, long, int, java.lang.String, java.lang.String[], kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/submit/SubmitTaskManger.smali:3076
    }
}
