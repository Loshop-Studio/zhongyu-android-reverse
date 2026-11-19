package com.zykj.study.viewmodels;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.MyCourseDetailsViewModel$addCatalog$1", m17801f = "MyCourseDetailsViewModel.kt", m17802l = {90, 91}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class MyCourseDetailsViewModel$addCatalog$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14248a;

    /* renamed from: b */
    public final /* synthetic */ MyCourseDetailsViewModel f14249b;

    /* renamed from: c */
    public final /* synthetic */ int f14250c;

    /* renamed from: d */
    public final /* synthetic */ String f14251d;

    /* renamed from: e */
    public final /* synthetic */ int f14252e;

    /* renamed from: f */
    public final /* synthetic */ boolean f14253f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyCourseDetailsViewModel$addCatalog$1(MyCourseDetailsViewModel myCourseDetailsViewModel, int i10, String str, int i11, boolean z10, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14249b = myCourseDetailsViewModel;
        this.f14250c = i10;
        this.f14251d = str;
        this.f14252e = i11;
        this.f14253f = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new MyCourseDetailsViewModel$addCatalog$1(this.f14249b, this.f14250c, this.f14251d, this.f14252e, this.f14253f, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((MyCourseDetailsViewModel$addCatalog$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r11.m12221s(r10) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r10.f14248a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            kotlin.AbstractC9079b.m15926b(r11)
            r9 = r10
            goto L46
        L13:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1b:
            kotlin.AbstractC9079b.m15926b(r11)
            r9 = r10
            goto L3b
        L20:
            kotlin.AbstractC9079b.m15926b(r11)
            com.zykj.study.viewmodels.MyCourseDetailsViewModel r11 = r10.f14249b
            com.zykj.study.repository.CourseRepository r4 = com.zykj.study.viewmodels.MyCourseDetailsViewModel.m12203a(r11)
            int r5 = r10.f14250c
            java.lang.String r6 = r10.f14251d
            int r7 = r10.f14252e
            boolean r8 = r10.f14253f
            r10.f14248a = r3
            r9 = r10
            java.lang.Object r11 = r4.m10334d(r5, r6, r7, r8, r9)
            if (r11 != r0) goto L3b
            goto L45
        L3b:
            com.zykj.study.viewmodels.MyCourseDetailsViewModel r11 = r9.f14249b
            r9.f14248a = r2
            java.lang.Object r11 = com.zykj.study.viewmodels.MyCourseDetailsViewModel.m12204b(r11, r10)
            if (r11 != r0) goto L46
        L45:
            return r0
        L46:
            h7.p r11 = p123h7.C8736p.f16368a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.viewmodels.MyCourseDetailsViewModel$addCatalog$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/viewmodels/MyCourseDetailsViewModel$addCatalog$1.smali:162
    }
}
