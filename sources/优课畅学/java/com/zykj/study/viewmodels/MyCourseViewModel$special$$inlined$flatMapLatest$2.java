package com.zykj.study.viewmodels;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import com.zykj.study.data.MyCourseKeyEntity;
import com.zykj.study.repository.CourseRepository;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9543h;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10575q;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.MyCourseViewModel$special$$inlined$flatMapLatest$2", m17801f = "MyCourseViewModel.kt", m17802l = {189}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class MyCourseViewModel$special$$inlined$flatMapLatest$2 extends SuspendLambda implements InterfaceC10575q {

    /* renamed from: a */
    public int f14294a;

    /* renamed from: b */
    public /* synthetic */ Object f14295b;

    /* renamed from: c */
    public /* synthetic */ Object f14296c;

    /* renamed from: d */
    public final /* synthetic */ MyCourseViewModel f14297d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyCourseViewModel$special$$inlined$flatMapLatest$2(InterfaceC9324c interfaceC9324c, MyCourseViewModel myCourseViewModel) {
        super(3, interfaceC9324c);
        this.f14297d = myCourseViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14294a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            InterfaceC9267d interfaceC9267d = (InterfaceC9267d) this.f14295b;
            Object obj2 = this.f14296c;
            MyCourseKeyEntity myCourseKeyEntity = (MyCourseKeyEntity) obj2;
            CourseRepository courseRepositoryM12225b = this.f14297d.m12225b();
            AbstractC9133u.m16130d(myCourseKeyEntity);
            InterfaceC9266c interfaceC9266cM10346s = courseRepositoryM12225b.m10346s(myCourseKeyEntity);
            this.f14295b = AbstractC9543h.m17814a(interfaceC9267d);
            this.f14296c = AbstractC9543h.m17814a(obj2);
            this.f14294a = 1;
            if (AbstractC9268e.m17031u(interfaceC9267d, interfaceC9266cM10346s, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        return C8736p.f16368a;
    }

    @Override // p300x7.InterfaceC10575q
    public final Object invoke(InterfaceC9267d interfaceC9267d, Object obj, InterfaceC9324c interfaceC9324c) {
        MyCourseViewModel$special$$inlined$flatMapLatest$2 myCourseViewModel$special$$inlined$flatMapLatest$2 = new MyCourseViewModel$special$$inlined$flatMapLatest$2(interfaceC9324c, this.f14297d);
        myCourseViewModel$special$$inlined$flatMapLatest$2.f14295b = interfaceC9267d;
        myCourseViewModel$special$$inlined$flatMapLatest$2.f14296c = obj;
        return myCourseViewModel$special$$inlined$flatMapLatest$2.invokeSuspend(C8736p.f16368a);
    }
}
