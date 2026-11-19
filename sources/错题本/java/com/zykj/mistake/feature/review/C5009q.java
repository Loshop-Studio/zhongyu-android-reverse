package com.zykj.mistake.feature.review;

import com.zykj.mistake.entity.resp.CustomTagInfo;
import com.zykj.mistake.entity.resp.MistakeDetail;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: com.zykj.mistake.feature.review.q */
/* loaded from: classes3.dex */
public final class C5009q {

    /* renamed from: a */
    public static final C5009q f7711a = new C5009q();

    /* renamed from: b */
    public static final LinkedHashMap f7712b = new LinkedHashMap();

    /* renamed from: c */
    public static final LinkedHashMap f7713c = new LinkedHashMap();

    /* renamed from: a */
    public static void m4324a(MistakeDetail mistakeDetail, ArrayList arrayList) {
        Object obj;
        Object obj2;
        Object obj3;
        int size = arrayList.size();
        int i = 0;
        int i8 = 0;
        while (true) {
            obj = null;
            if (i8 >= size) {
                obj2 = null;
                break;
            }
            obj2 = arrayList.get(i8);
            i8++;
            if (((CustomTagInfo) obj2).getLocalType() == 0) {
                break;
            }
        }
        CustomTagInfo customTagInfo = (CustomTagInfo) obj2;
        mistakeDetail.setDiff(customTagInfo != null ? (int) customTagInfo.getId() : 0);
        int size2 = arrayList.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size2) {
                obj3 = null;
                break;
            }
            obj3 = arrayList.get(i9);
            i9++;
            if (((CustomTagInfo) obj3).getLocalType() == 1) {
                break;
            }
        }
        CustomTagInfo customTagInfo2 = (CustomTagInfo) obj3;
        mistakeDetail.setAttainedLevel(customTagInfo2 != null ? (int) customTagInfo2.getId() : 0);
        int size3 = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size3) {
                break;
            }
            Object obj4 = arrayList.get(i10);
            i10++;
            if (((CustomTagInfo) obj4).getLocalType() == 2) {
                obj = obj4;
                break;
            }
        }
        CustomTagInfo customTagInfo3 = (CustomTagInfo) obj;
        mistakeDetail.setErrorReason(customTagInfo3 != null ? (int) customTagInfo3.getId() : 0);
        mistakeDetail.getMistakeTags().clear();
        ArrayList<CustomTagInfo> mistakeTags = mistakeDetail.getMistakeTags();
        ArrayList arrayList2 = new ArrayList();
        int size4 = arrayList.size();
        while (i < size4) {
            Object obj5 = arrayList.get(i);
            i++;
            if (((CustomTagInfo) obj5).getLocalType() == -1) {
                arrayList2.add(obj5);
            }
        }
        mistakeTags.addAll(arrayList2);
    }

    /* renamed from: b */
    public static String m4325b(int i, String str) {
        return str + ":" + i;
    }

    /* renamed from: f */
    public static C5007o m4326f(String sessionId) {
        AbstractC5830k.m5330g(sessionId, "sessionId");
        C5006n c5006n = (C5006n) f7712b.get(sessionId);
        return c5006n != null ? c5006n.f7699e : new C5007o(0, 63);
    }

    /* renamed from: g */
    public static void m4327g(String str, int i, ArrayList arrayList) {
        C5004l c5004l = (C5004l) f7713c.get(m4325b(i, str));
        if (c5004l == null) {
            return;
        }
        MistakeDetail mistakeDetail = c5004l.f7689a;
        if (mistakeDetail != null) {
            m4324a(mistakeDetail, arrayList);
        }
        for (MistakeDetail mistakeDetail2 : c5004l.f7690b) {
            if (mistakeDetail2.getItemId() == i) {
                m4324a(mistakeDetail2, arrayList);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m4328c(java.lang.String r19, boolean r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.review.C5009q.m4328c(java.lang.String, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/review/q.smali:654
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m4329d(int r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            boolean r3 = r2 instanceof com.zykj.mistake.feature.review.ReviewPracticeSessionStore$startPractice$1
            if (r3 == 0) goto L19
            r3 = r2
            com.zykj.mistake.feature.review.ReviewPracticeSessionStore$startPractice$1 r3 = (com.zykj.mistake.feature.review.ReviewPracticeSessionStore$startPractice$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.label = r4
            goto L1e
        L19:
            com.zykj.mistake.feature.review.ReviewPracticeSessionStore$startPractice$1 r3 = new com.zykj.mistake.feature.review.ReviewPracticeSessionStore$startPractice$1
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r5 = r3.label
            r6 = 2
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L52
            if (r5 == r7) goto L45
            if (r5 != r6) goto L3d
            java.lang.Object r1 = r3.L$2
            com.zykj.mistake.feature.review.ReviewContract$PracticeScene r1 = (com.zykj.mistake.feature.review.ReviewContract$PracticeScene) r1
            java.lang.Object r1 = r3.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.L$0
            com.zykj.mistake.entity.resp.StartReviewSessionResult r1 = (com.zykj.mistake.entity.resp.StartReviewSessionResult) r1
            kotlin.AbstractC5774b.m5119b(r2)
            return r2
        L3d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L45:
            int r1 = r3.I$0
            kotlin.AbstractC5774b.m5119b(r2)
            kotlin.Result r2 = (kotlin.Result) r2
            java.lang.Object r2 = r2.getValue()
        L50:
            r11 = r1
            goto L6b
        L52:
            kotlin.AbstractC5774b.m5119b(r2)
            com.zykj.mistake.feature.review.ReviewPracticeSessionStore$startPractice$start$1 r2 = new com.zykj.mistake.feature.review.ReviewPracticeSessionStore$startPractice$start$1
            r2.<init>(r1, r8)
            com.zykj.mistake.feature.notebook.list.k1 r5 = new com.zykj.mistake.feature.notebook.list.k1
            r9 = 2
            r5.<init>(r9)
            r3.I$0 = r1
            r3.label = r7
            java.lang.Object r2 = com.zykj.mistake.data.AbstractC4496e.m3979b(r2, r5, r3)
            if (r2 != r4) goto L50
            goto Lc0
        L6b:
            kotlin.AbstractC5774b.m5119b(r2)
            com.zykj.mistake.entity.resp.StartReviewSessionResult r2 = (com.zykj.mistake.entity.resp.StartReviewSessionResult) r2
            boolean r1 = r2.getHasQuestion()
            if (r1 == 0) goto Lc2
            long r9 = r2.getSessionId()
            r12 = 0
            int r1 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r1 > 0) goto L81
            goto Lc2
        L81:
            long r9 = r2.getSessionId()
            java.lang.String r10 = java.lang.String.valueOf(r9)
            if (r11 != r7) goto L8f
            com.zykj.mistake.feature.review.ReviewContract$PracticeScene r1 = com.zykj.mistake.feature.review.ReviewContract$PracticeScene.RECOMMEND
        L8d:
            r12 = r1
            goto L92
        L8f:
            com.zykj.mistake.feature.review.ReviewContract$PracticeScene r1 = com.zykj.mistake.feature.review.ReviewContract$PracticeScene.POOL
            goto L8d
        L92:
            com.zykj.mistake.feature.review.n r9 = new com.zykj.mistake.feature.review.n
            com.zykj.mistake.feature.review.o r14 = new com.zykj.mistake.feature.review.o
            int r1 = r2.getTotalCount()
            r2 = 31
            r14.<init>(r1, r2)
            r17 = 0
            r18 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.util.LinkedHashMap r1 = com.zykj.mistake.feature.review.C5009q.f7712b
            r1.put(r10, r9)
            r3.L$0 = r8
            r3.L$1 = r8
            r3.L$2 = r8
            r3.I$0 = r11
            r3.label = r6
            r1 = 0
            java.lang.Object r1 = r0.m4328c(r10, r1, r3)
            if (r1 != r4) goto Lc1
        Lc0:
            return r4
        Lc1:
            return r1
        Lc2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.review.C5009q.m4329d(int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/review/q.smali:1201
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m4330e(java.lang.String r17, int r18, com.zykj.mistake.feature.notebook.detail.MistakeDetailNewContract$AnswerResult r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.review.C5009q.m4330e(java.lang.String, int, com.zykj.mistake.feature.notebook.detail.MistakeDetailNewContract$AnswerResult, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/review/q.smali:1621
    }
}
