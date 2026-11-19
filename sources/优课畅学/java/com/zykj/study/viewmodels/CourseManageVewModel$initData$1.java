package com.zykj.study.viewmodels;

import com.tencent.ijk.media.player.IjkMediaMeta;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.CourseManageVewModel$initData$1", m17801f = "CourseManageVewModel.kt", m17802l = {76, IjkMediaMeta.FF_PROFILE_H264_MAIN}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class CourseManageVewModel$initData$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public Object f13951a;

    /* renamed from: b */
    public int f13952b;

    /* renamed from: c */
    public int f13953c;

    /* renamed from: d */
    public final /* synthetic */ CourseManageVewModel f13954d;

    /* renamed from: e */
    public final /* synthetic */ long f13955e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseManageVewModel$initData$1(CourseManageVewModel courseManageVewModel, long j10, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f13954d = courseManageVewModel;
        this.f13955e = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new CourseManageVewModel$initData$1(this.f13954d, this.f13955e, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((CourseManageVewModel$initData$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        if (r1.emit(r7, r6) == r0) goto L15;
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
            int r1 = r6.f13953c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r0 = r6.f13951a
            java.util.List r0 = (java.util.List) r0
            kotlin.AbstractC9079b.m15926b(r7)
            goto L57
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            kotlin.AbstractC9079b.m15926b(r7)
            goto L3d
        L22:
            kotlin.AbstractC9079b.m15926b(r7)
            com.zykj.study.viewmodels.CourseManageVewModel r7 = r6.f13954d
            long r4 = r6.f13955e
            com.zykj.study.viewmodels.CourseManageVewModel.m12051e(r7, r4)
            com.zykj.study.viewmodels.CourseManageVewModel r7 = r6.f13954d
            o4.b r7 = com.zykj.study.viewmodels.CourseManageVewModel.m12047a(r7)
            long r4 = r6.f13955e
            r6.f13953c = r3
            java.lang.Object r7 = r7.m17686a(r4, r6)
            if (r7 != r0) goto L3d
            goto L56
        L3d:
            com.zykj.study.viewmodels.CourseManageVewModel r1 = r6.f13954d
            java.util.List r7 = (java.util.List) r7
            l8.h r1 = com.zykj.study.viewmodels.CourseManageVewModel.m12049c(r1)
            java.lang.Object r3 = p201o7.AbstractC9543h.m17814a(r7)
            r6.f13951a = r3
            r3 = 0
            r6.f13952b = r3
            r6.f13953c = r2
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L57
        L56:
            return r0
        L57:
            h7.p r7 = p123h7.C8736p.f16368a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.viewmodels.CourseManageVewModel$initData$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/viewmodels/CourseManageVewModel$initData$1.smali:133
    }
}
