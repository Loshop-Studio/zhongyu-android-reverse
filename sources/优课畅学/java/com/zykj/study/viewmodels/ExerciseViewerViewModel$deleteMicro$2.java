package com.zykj.study.viewmodels;

import com.tencent.ijk.media.player.IjkMediaMeta;
import com.zykj.study.repository.ExerciseRepository;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.ExerciseViewerViewModel$deleteMicro$2", m17801f = "ExerciseViewerViewModel.kt", m17802l = {IjkMediaMeta.FF_PROFILE_H264_MAIN}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ExerciseViewerViewModel$deleteMicro$2 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14167a;

    /* renamed from: b */
    public final /* synthetic */ ExerciseViewerViewModel f14168b;

    /* renamed from: c */
    public final /* synthetic */ int f14169c;

    /* renamed from: d */
    public final /* synthetic */ String f14170d;

    /* renamed from: e */
    public final /* synthetic */ int f14171e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExerciseViewerViewModel$deleteMicro$2(ExerciseViewerViewModel exerciseViewerViewModel, int i10, String str, int i11, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14168b = exerciseViewerViewModel;
        this.f14169c = i10;
        this.f14170d = str;
        this.f14171e = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ExerciseViewerViewModel$deleteMicro$2(this.f14168b, this.f14169c, this.f14170d, this.f14171e, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ExerciseViewerViewModel$deleteMicro$2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14167a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            ExerciseRepository exerciseRepositoryM12168s = this.f14168b.m12168s();
            int i11 = this.f14169c;
            String str = this.f14170d;
            int i12 = this.f14171e;
            this.f14167a = 1;
            if (exerciseRepositoryM12168s.m10367c(i11, str, i12, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        return AbstractC9536a.m17796a(true);
    }
}
