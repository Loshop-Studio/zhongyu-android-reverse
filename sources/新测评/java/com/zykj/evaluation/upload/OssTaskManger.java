package com.zykj.evaluation.upload;

import android.app.Application;
import androidx.lifecycle.LiveData;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkQuery;
import com.blankj.utilcode.util.Utils;
import com.zykj.evaluation.bean.CommitAnswer;
import com.zykj.evaluation.bean.CommitTaskAnswer;
import com.zykj.evaluation.bean.UploadData;
import com.zykj.evaluation.p056di.AppDatabase;
import com.zykj.evaluation.upload.AbstractC6954a;
import com.zykj.evaluation.upload.AbstractC6955b;
import com.zykj.evaluation.upload.FileUploadWork;
import com.zykj.evaluation.upload.OssTaskManger;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import p090f7.InterfaceC7490c;
import p167m5.AbstractC8555e;
import p178n5.C8655v;

/* loaded from: classes4.dex */
public final class OssTaskManger {

    /* renamed from: a */
    public final MutableStateFlow f10309a;

    /* renamed from: b */
    public final InterfaceC7490c f10310b;

    /* renamed from: c */
    public final AppDatabase f10311c;

    /* renamed from: d */
    public final Lazy f10312d;

    public OssTaskManger(MutableStateFlow userFlow, InterfaceC7490c ossTokenApi, AppDatabase database) {
        Intrinsics.checkNotNullParameter(userFlow, "userFlow");
        Intrinsics.checkNotNullParameter(ossTokenApi, "ossTokenApi");
        Intrinsics.checkNotNullParameter(database, "database");
        this.f10309a = userFlow;
        this.f10310b = ossTokenApi;
        this.f10311c = database;
        this.f10312d = LazyKt.lazy(new Function0() { // from class: f7.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OssTaskManger.m10471x();
            }
        });
    }

    /* renamed from: f */
    public static /* synthetic */ Object m10469f(OssTaskManger ossTaskManger, AbstractC6955b abstractC6955b, String str, AbstractC6954a abstractC6954a, String str2, String str3, long j10, Continuation continuation, int i10, Object obj) {
        String strReplace$default;
        long jCurrentTimeMillis;
        OssTaskManger ossTaskManger2;
        AbstractC6955b abstractC6955b2;
        AbstractC6954a abstractC6954a2;
        Continuation continuation2;
        if ((i10 & 2) != 0) {
            str = "";
        }
        String str4 = str;
        String str5 = (i10 & 8) != 0 ? "0" : str2;
        if ((i10 & 16) != 0) {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            strReplace$default = StringsKt.replace$default(string, "-", "", false, 4, (Object) null);
        } else {
            strReplace$default = str3;
        }
        if ((i10 & 32) != 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
            abstractC6954a2 = abstractC6954a;
            continuation2 = continuation;
            ossTaskManger2 = ossTaskManger;
            abstractC6955b2 = abstractC6955b;
        } else {
            jCurrentTimeMillis = j10;
            ossTaskManger2 = ossTaskManger;
            abstractC6955b2 = abstractC6955b;
            abstractC6954a2 = abstractC6954a;
            continuation2 = continuation;
        }
        return ossTaskManger2.m10474e(abstractC6955b2, str4, abstractC6954a2, str5, strReplace$default, jCurrentTimeMillis, continuation2);
    }

    /* renamed from: v */
    public static /* synthetic */ OneTimeWorkRequest m10470v(OssTaskManger ossTaskManger, String str, int i10, String[] strArr, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            strArr = new String[0];
        }
        return ossTaskManger.m10489u(str, i10, strArr);
    }

    /* renamed from: x */
    public static final WorkManager m10471x() {
        WorkManager.Companion companion = WorkManager.INSTANCE;
        Application app = Utils.getApp();
        Intrinsics.checkNotNullExpressionValue(app, "getApp(...)");
        return companion.getInstance(app);
    }

    /* renamed from: c */
    public final int m10472c(UploadData uploadData, List list, List list2) {
        int i10;
        int i11;
        int i12 = (uploadData.getLocalPath().length() <= 0 && uploadData.getUploadUrl().length() <= 0) ? 0 : 1;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            i10 = 0;
            while (it.hasNext()) {
                UploadData uploadData2 = (UploadData) it.next();
                if (uploadData2.getLocalPath().length() > 0 || uploadData2.getUploadUrl().length() > 0) {
                    i10++;
                    if (i10 < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
        } else {
            i10 = 0;
        }
        Iterator it2 = list2.iterator();
        int i13 = 0;
        while (it2.hasNext()) {
            Iterator<T> it3 = ((CommitTaskAnswer) it2.next()).getAnswers().iterator();
            int i14 = 0;
            while (it3.hasNext()) {
                List<String> answers = ((CommitAnswer) it3.next()).getAnswers();
                if (answers == null || !answers.isEmpty()) {
                    Iterator<T> it4 = answers.iterator();
                    i11 = 0;
                    while (it4.hasNext()) {
                        if (((String) it4.next()).length() > 0 && (i11 = i11 + 1) < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                } else {
                    i11 = 0;
                }
                i14 += i11;
            }
            i13 += i14;
        }
        return i12 + i10 + i13;
    }

    /* renamed from: d */
    public final Object m10473d(String str, String str2, Continuation continuation) {
        return m10469f(this, AbstractC6955b.b.f10537b, "." + str2, AbstractC6954a.a.f10532c, str, null, 0L, continuation, 48, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10474e(com.zykj.evaluation.upload.AbstractC6955b r30, java.lang.String r31, com.zykj.evaluation.upload.AbstractC6954a r32, java.lang.String r33, java.lang.String r34, long r35, kotlin.coroutines.Continuation r37) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.upload.OssTaskManger.m10474e(com.zykj.evaluation.upload.b, java.lang.String, com.zykj.evaluation.upload.a, java.lang.String, java.lang.String, long, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/upload/OssTaskManger.smali:844
    }

    /* renamed from: g */
    public final Object m10475g(String str, Continuation continuation) {
        return m10469f(this, AbstractC6955b.b.f10537b, "." + str, AbstractC6954a.b.f10533c, null, null, 0L, continuation, 56, null);
    }

    /* renamed from: h */
    public final Object m10476h(Continuation continuation) {
        return m10469f(this, AbstractC6955b.b.f10537b, null, AbstractC6954a.c.f10534c, null, null, 0L, continuation, 58, null);
    }

    /* renamed from: i */
    public final Object m10477i(String str, Continuation continuation) {
        return m10469f(this, AbstractC6955b.a.f10536b, "." + str, AbstractC6954a.c.f10534c, null, null, 0L, continuation, 56, null);
    }

    /* renamed from: j */
    public final LiveData m10478j(OneTimeWorkRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return m10480l().getWorkInfoByIdLiveData(request.getId());
    }

    /* renamed from: k */
    public final LiveData m10479k(List localPathList) {
        Intrinsics.checkNotNullParameter(localPathList, "localPathList");
        return m10480l().getWorkInfosLiveData(WorkQuery.Builder.INSTANCE.fromUniqueWorkNames(localPathList).build());
    }

    /* renamed from: l */
    public final WorkManager m10480l() {
        return (WorkManager) this.f10312d.getValue();
    }

    /* renamed from: m */
    public final boolean m10481m(UploadData uploadData, List list, List list2) {
        return m10472c(uploadData, list, list2) > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x011f -> B:30:0x0128). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0131 -> B:32:0x0135). Please report as a decompilation issue!!! */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10482n(long r22, long r24, int r26, kotlin.coroutines.Continuation r27) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.upload.OssTaskManger.m10482n(long, long, int, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/upload/OssTaskManger.smali:2319
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x014a -> B:30:0x0156). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x015f -> B:32:0x016c). Please report as a decompilation issue!!! */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10483o(long r29, long r31, int r33, kotlin.coroutines.Continuation r34) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.upload.OssTaskManger.m10483o(long, long, int, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/upload/OssTaskManger.smali:2996
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0130 -> B:30:0x013a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0143 -> B:32:0x014b). Please report as a decompilation issue!!! */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10484p(long r23, long r25, int r27, kotlin.coroutines.Continuation r28) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.upload.OssTaskManger.m10484p(long, long, int, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/upload/OssTaskManger.smali:3778
    }

    /* renamed from: q */
    public final boolean m10485q(C8655v c8655v, UploadData uploadData, List list, List list2) {
        if (c8655v == null) {
            return false;
        }
        return c8655v.m14246d() == AbstractC8555e.c.f14191b.m14097a() && m10481m(c8655v.m14248f(), c8655v.m14245c(), c8655v.m14247e()) && !m10481m(uploadData, list, list2);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10486r(long r29, long r31, int r33, long r34, com.zykj.evaluation.bean.UploadData r36, java.util.List r37, boolean r38, boolean r39, java.util.List r40, kotlin.coroutines.Continuation r41) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.upload.OssTaskManger.m10486r(long, long, int, long, com.zykj.evaluation.bean.UploadData, java.util.List, boolean, boolean, java.util.List, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/upload/OssTaskManger.smali:4597
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10487s(long r18, long r20, int r22, long r23, java.util.List r25, java.util.List r26, kotlin.coroutines.Continuation r27) {
        /*
            r17 = this;
            r0 = r17
            r1 = r27
            boolean r2 = r1 instanceof com.zykj.evaluation.upload.OssTaskManger$startCommitSelfCorrectQuestion$1
            if (r2 == 0) goto L17
            r2 = r1
            com.zykj.evaluation.upload.OssTaskManger$startCommitSelfCorrectQuestion$1 r2 = (com.zykj.evaluation.upload.OssTaskManger$startCommitSelfCorrectQuestion$1) r2
            int r3 = r2.f10386i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f10386i = r3
            goto L1c
        L17:
            com.zykj.evaluation.upload.OssTaskManger$startCommitSelfCorrectQuestion$1 r2 = new com.zykj.evaluation.upload.OssTaskManger$startCommitSelfCorrectQuestion$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f10384g
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.f10386i
            r5 = 1
            if (r4 == 0) goto L49
            if (r4 != r5) goto L41
            long r3 = r2.f10380c
            int r5 = r2.f10381d
            long r6 = r2.f10379b
            long r8 = r2.f10378a
            java.lang.Object r10 = r2.f10383f
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r2 = r2.f10382e
            java.util.List r2 = (java.util.List) r2
            kotlin.ResultKt.throwOnFailure(r1)
            r12 = r8
            r9 = r6
            r7 = r12
            r12 = r3
            goto L87
        L41:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L49:
            kotlin.ResultKt.throwOnFailure(r1)
            com.zykj.evaluation.di.AppDatabase r1 = r0.f10311c
            n5.p r1 = r1.mo8677i()
            n5.o r6 = new n5.o
            m5.e$c r4 = p167m5.AbstractC8555e.c.f14191b
            int r16 = r4.m14097a()
            r7 = r18
            r9 = r20
            r11 = r22
            r12 = r23
            r14 = r25
            r15 = r26
            r6.<init>(r7, r9, r11, r12, r14, r15, r16)
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r25)
            r2.f10382e = r4
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r26)
            r2.f10383f = r4
            r2.f10378a = r7
            r2.f10379b = r9
            r2.f10381d = r11
            r2.f10380c = r12
            r2.f10386i = r5
            java.lang.Object r1 = r1.mo8748c(r6, r2)
            if (r1 != r3) goto L86
            return r3
        L86:
            r5 = r11
        L87:
            com.zykj.evaluation.upload.SelfCorrectQuestionUploadWork$a r1 = com.zykj.evaluation.upload.SelfCorrectQuestionUploadWork.INSTANCE
            r18 = r1
            r25 = r5
            r19 = r7
            r21 = r9
            r23 = r12
            androidx.work.OneTimeWorkRequest$Builder r1 = r18.m10505a(r19, r21, r23, r25)
            androidx.work.WorkRequest r1 = r1.build()
            androidx.work.OneTimeWorkRequest r1 = (androidx.work.OneTimeWorkRequest) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            java.lang.String r3 = "_"
            r2.append(r3)
            r2.append(r9)
            r2.append(r3)
            r2.append(r5)
            r2.append(r3)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            androidx.work.WorkManager r3 = r0.m10480l()
            androidx.work.ExistingWorkPolicy r4 = androidx.work.ExistingWorkPolicy.REPLACE
            r3.enqueueUniqueWork(r2, r4, r1)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.upload.OssTaskManger.m10487s(long, long, int, long, java.util.List, java.util.List, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/upload/OssTaskManger.smali:5579
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10488t(long r19, long r21, int r23, com.zykj.evaluation.bean.UploadData r24, kotlin.coroutines.Continuation r25) {
        /*
            r18 = this;
            r0 = r18
            r1 = r25
            boolean r2 = r1 instanceof com.zykj.evaluation.upload.OssTaskManger$startUploadAnswerWork$1
            if (r2 == 0) goto L17
            r2 = r1
            com.zykj.evaluation.upload.OssTaskManger$startUploadAnswerWork$1 r2 = (com.zykj.evaluation.upload.OssTaskManger$startUploadAnswerWork$1) r2
            int r3 = r2.f10393g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f10393g = r3
            goto L1c
        L17:
            com.zykj.evaluation.upload.OssTaskManger$startUploadAnswerWork$1 r2 = new com.zykj.evaluation.upload.OssTaskManger$startUploadAnswerWork$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f10391e
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.f10393g
            r5 = 1
            if (r4 == 0) goto L45
            if (r4 != r5) goto L3d
            int r3 = r2.f10389c
            long r4 = r2.f10388b
            long r6 = r2.f10387a
            java.lang.Object r2 = r2.f10390d
            com.zykj.evaluation.bean.UploadData r2 = (com.zykj.evaluation.bean.UploadData) r2
            kotlin.ResultKt.throwOnFailure(r1)
            r16 = r6
            r7 = r4
            r5 = r16
            r10 = r3
            goto L74
        L3d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L45:
            kotlin.ResultKt.throwOnFailure(r1)
            com.zykj.evaluation.di.AppDatabase r1 = r0.f10311c
            n5.i r1 = r1.mo8676h()
            n5.h r6 = new n5.h
            java.lang.String r12 = r24.getUuid()
            r7 = r19
            r9 = r21
            r11 = r23
            r13 = r24
            r6.<init>(r7, r9, r11, r12, r13)
            r2.f10390d = r13
            r2.f10387a = r7
            r2.f10388b = r9
            r2.f10389c = r11
            r2.f10393g = r5
            java.lang.Object r1 = r1.mo8728c(r6, r2)
            if (r1 != r3) goto L70
            return r3
        L70:
            r5 = r7
            r7 = r9
            r10 = r11
            r2 = r13
        L74:
            com.zykj.evaluation.upload.AnswerUploadWork$a r4 = com.zykj.evaluation.upload.AnswerUploadWork.INSTANCE
            java.lang.String r9 = r2.getUuid()
            java.lang.String r11 = r2.getLocalPath()
            r14 = 96
            r15 = 0
            r12 = 0
            r13 = 0
            androidx.work.OneTimeWorkRequest$Builder r1 = com.zykj.evaluation.upload.AnswerUploadWork.Companion.m10456b(r4, r5, r7, r9, r10, r11, r12, r13, r14, r15)
            androidx.work.WorkRequest r1 = r1.build()
            androidx.work.OneTimeWorkRequest r1 = (androidx.work.OneTimeWorkRequest) r1
            java.lang.String r2 = r2.getUuid()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            java.lang.String r4 = "_"
            r3.append(r4)
            r3.append(r7)
            r3.append(r4)
            r3.append(r10)
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            androidx.work.WorkManager r3 = r0.m10480l()
            androidx.work.ExistingWorkPolicy r4 = androidx.work.ExistingWorkPolicy.REPLACE
            r3.enqueueUniqueWork(r2, r4, r1)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.upload.OssTaskManger.m10488t(long, long, int, com.zykj.evaluation.bean.UploadData, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/upload/OssTaskManger.smali:5990
    }

    /* renamed from: u */
    public final OneTimeWorkRequest m10489u(String fileAbsolutePath, int i10, String[] extras) {
        Intrinsics.checkNotNullParameter(fileAbsolutePath, "fileAbsolutePath");
        Intrinsics.checkNotNullParameter(extras, "extras");
        OneTimeWorkRequest oneTimeWorkRequestBuild = FileUploadWork.Companion.m10459b(FileUploadWork.INSTANCE, i10, fileAbsolutePath, extras, null, 8, null).build();
        m10480l().enqueueUniqueWork(fileAbsolutePath, ExistingWorkPolicy.REPLACE, oneTimeWorkRequestBuild);
        return oneTimeWorkRequestBuild;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10490w(long r19, long r21, int r23, java.util.List r24, kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.upload.OssTaskManger.m10490w(long, long, int, java.util.List, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/upload/OssTaskManger.smali:6466
    }
}
