package com.zykj.study.viewmodels;

import com.tencent.ijk.media.player.IjkMediaMeta;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.CourseManageVewModel$setChapterExpanded$1", m17801f = "CourseManageVewModel.kt", m17802l = {IjkMediaMeta.FF_PROFILE_H264_EXTENDED, 96}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class CourseManageVewModel$setChapterExpanded$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public Object f13956a;

    /* renamed from: b */
    public int f13957b;

    /* renamed from: c */
    public final /* synthetic */ CourseManageVewModel f13958c;

    /* renamed from: d */
    public final /* synthetic */ boolean f13959d;

    /* renamed from: e */
    public final /* synthetic */ long f13960e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseManageVewModel$setChapterExpanded$1(CourseManageVewModel courseManageVewModel, boolean z10, long j10, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f13958c = courseManageVewModel;
        this.f13959d = z10;
        this.f13960e = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new CourseManageVewModel$setChapterExpanded$1(this.f13958c, this.f13959d, this.f13960e, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((CourseManageVewModel$setChapterExpanded$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        if (r1.emit(r2, r6) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008b, code lost:
    
        if (r1.emit(r3, r6) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
    
        return r0;
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
            int r1 = r6.f13957b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L17:
            java.lang.Object r0 = r6.f13956a
            java.util.List r0 = (java.util.List) r0
            kotlin.AbstractC9079b.m15926b(r7)
            goto L8e
        L1f:
            kotlin.AbstractC9079b.m15926b(r7)
            com.zykj.study.viewmodels.CourseManageVewModel r7 = r6.f13958c
            l8.h r7 = com.zykj.study.viewmodels.CourseManageVewModel.m12050d(r7)
            java.lang.Object r7 = r7.getValue()
            java.util.List r7 = (java.util.List) r7
            boolean r1 = r6.f13959d
            if (r1 == 0) goto L60
            long r1 = r6.f13960e
            java.lang.Long r1 = p201o7.AbstractC9536a.m17799d(r1)
            boolean r1 = r7.contains(r1)
            if (r1 != 0) goto L8e
            com.zykj.study.viewmodels.CourseManageVewModel r1 = r6.f13958c
            l8.h r1 = com.zykj.study.viewmodels.CourseManageVewModel.m12050d(r1)
            java.util.List r2 = p134i7.AbstractC8778f0.m14547X0(r7)
            long r4 = r6.f13960e
            java.lang.Long r4 = p201o7.AbstractC9536a.m17799d(r4)
            r2.add(r4)
            java.lang.Object r7 = p201o7.AbstractC9543h.m17814a(r7)
            r6.f13956a = r7
            r6.f13957b = r3
            java.lang.Object r7 = r1.emit(r2, r6)
            if (r7 != r0) goto L8e
            goto L8d
        L60:
            long r3 = r6.f13960e
            java.lang.Long r1 = p201o7.AbstractC9536a.m17799d(r3)
            boolean r1 = r7.contains(r1)
            if (r1 == 0) goto L8e
            com.zykj.study.viewmodels.CourseManageVewModel r1 = r6.f13958c
            l8.h r1 = com.zykj.study.viewmodels.CourseManageVewModel.m12050d(r1)
            java.util.List r3 = p134i7.AbstractC8778f0.m14547X0(r7)
            long r4 = r6.f13960e
            java.lang.Long r4 = p201o7.AbstractC9536a.m17799d(r4)
            r3.remove(r4)
            java.lang.Object r7 = p201o7.AbstractC9543h.m17814a(r7)
            r6.f13956a = r7
            r6.f13957b = r2
            java.lang.Object r7 = r1.emit(r3, r6)
            if (r7 != r0) goto L8e
        L8d:
            return r0
        L8e:
            h7.p r7 = p123h7.C8736p.f16368a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.viewmodels.CourseManageVewModel$setChapterExpanded$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/viewmodels/CourseManageVewModel$setChapterExpanded$1.smali:144
    }
}
