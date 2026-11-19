package com.zykj.study.viewmodels;

import com.tencent.smtt.sdk.TbsListener;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.MyCourseDetailsViewModel$reorderCatalog$1", m17801f = "MyCourseDetailsViewModel.kt", m17802l = {120, TbsListener.ErrorCode.THREAD_INIT_ERROR, 127}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class MyCourseDetailsViewModel$reorderCatalog$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14269a;

    /* renamed from: b */
    public final /* synthetic */ MyCourseDetailsViewModel f14270b;

    /* renamed from: c */
    public final /* synthetic */ List f14271c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyCourseDetailsViewModel$reorderCatalog$1(MyCourseDetailsViewModel myCourseDetailsViewModel, List list, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14270b = myCourseDetailsViewModel;
        this.f14271c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new MyCourseDetailsViewModel$reorderCatalog$1(this.f14270b, this.f14271c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((MyCourseDetailsViewModel$reorderCatalog$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        if (r7.m12221s(r6) != r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r6.f14269a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.AbstractC9079b.m15926b(r7)
            goto L5a
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            kotlin.AbstractC9079b.m15926b(r7)
            goto L4f
        L21:
            kotlin.AbstractC9079b.m15926b(r7)
            goto L33
        L25:
            kotlin.AbstractC9079b.m15926b(r7)
            r6.f14269a = r4
            r4 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.m16227b(r4, r6)
            if (r7 != r0) goto L33
            goto L59
        L33:
            com.zykj.study.viewmodels.MyCourseDetailsViewModel r7 = r6.f14270b
            com.zykj.study.repository.CourseRepository r7 = com.zykj.study.viewmodels.MyCourseDetailsViewModel.m12203a(r7)
            com.zykj.study.bean.course.ReorderCatalogReq r1 = new com.zykj.study.bean.course.ReorderCatalogReq
            com.zykj.study.viewmodels.MyCourseDetailsViewModel r4 = r6.f14270b
            int r4 = r4.m12210h()
            java.util.List r5 = r6.f14271c
            r1.<init>(r4, r5)
            r6.f14269a = r3
            java.lang.Object r7 = r7.m10348v(r1, r6)
            if (r7 != r0) goto L4f
            goto L59
        L4f:
            com.zykj.study.viewmodels.MyCourseDetailsViewModel r7 = r6.f14270b
            r6.f14269a = r2
            java.lang.Object r7 = com.zykj.study.viewmodels.MyCourseDetailsViewModel.m12204b(r7, r6)
            if (r7 != r0) goto L5a
        L59:
            return r0
        L5a:
            h7.p r7 = p123h7.C8736p.f16368a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.viewmodels.MyCourseDetailsViewModel$reorderCatalog$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$1.smali:130
    }
}
