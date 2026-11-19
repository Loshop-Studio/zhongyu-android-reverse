package com.zykj.study.viewmodels;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.CourseManageVewModel$setKnowledgeLocked$1", m17801f = "CourseManageVewModel.kt", m17802l = {149, 151, 154}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class CourseManageVewModel$setKnowledgeLocked$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f13967a;

    /* renamed from: b */
    public final /* synthetic */ boolean f13968b;

    /* renamed from: c */
    public final /* synthetic */ CourseManageVewModel f13969c;

    /* renamed from: d */
    public final /* synthetic */ long f13970d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseManageVewModel$setKnowledgeLocked$1(boolean z10, CourseManageVewModel courseManageVewModel, long j10, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f13968b = z10;
        this.f13969c = courseManageVewModel;
        this.f13970d = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new CourseManageVewModel$setKnowledgeLocked$1(this.f13968b, this.f13969c, this.f13970d, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((CourseManageVewModel$setKnowledgeLocked$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x012a, code lost:
    
        if (r2.emit(r7, r22) == r1) goto L46;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.viewmodels.CourseManageVewModel$setKnowledgeLocked$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/viewmodels/CourseManageVewModel$setKnowledgeLocked$1.smali:143
    }
}
