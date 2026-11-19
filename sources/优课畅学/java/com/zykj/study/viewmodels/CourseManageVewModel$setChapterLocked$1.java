package com.zykj.study.viewmodels;

import com.tencent.smtt.sdk.TbsListener;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.CourseManageVewModel$setChapterLocked$1", m17801f = "CourseManageVewModel.kt", m17802l = {TbsListener.ErrorCode.DOWNLOAD_REDIRECT_EMPTY, 126, 129}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class CourseManageVewModel$setChapterLocked$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public Object f13961a;

    /* renamed from: b */
    public int f13962b;

    /* renamed from: c */
    public final /* synthetic */ CourseManageVewModel f13963c;

    /* renamed from: d */
    public final /* synthetic */ List f13964d;

    /* renamed from: e */
    public final /* synthetic */ boolean f13965e;

    /* renamed from: f */
    public final /* synthetic */ long f13966f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseManageVewModel$setChapterLocked$1(CourseManageVewModel courseManageVewModel, List list, boolean z10, long j10, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f13963c = courseManageVewModel;
        this.f13964d = list;
        this.f13965e = z10;
        this.f13966f = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new CourseManageVewModel$setChapterLocked$1(this.f13963c, this.f13964d, this.f13965e, this.f13966f, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((CourseManageVewModel$setChapterLocked$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0135, code lost:
    
        if (r4.emit(r8, r24) == r1) goto L37;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.viewmodels.CourseManageVewModel$setChapterLocked$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/viewmodels/CourseManageVewModel$setChapterLocked$1.smali:155
    }
}
