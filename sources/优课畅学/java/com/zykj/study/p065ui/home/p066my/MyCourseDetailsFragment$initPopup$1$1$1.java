package com.zykj.study.p065ui.home.p066my;

import androidx.navigation.fragment.FragmentKt;
import com.zykj.base.utils.XToastUtils;
import com.zykj.study.viewmodels.MyCourseDetailsViewModel;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p086e5.AbstractC8366o;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.MyCourseDetailsFragment$initPopup$1$1$1", m17801f = "MyCourseDetailsFragment.kt", m17802l = {555}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class MyCourseDetailsFragment$initPopup$1$1$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f13227a;

    /* renamed from: b */
    public final /* synthetic */ MyCourseDetailsFragment f13228b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyCourseDetailsFragment$initPopup$1$1$1(MyCourseDetailsFragment myCourseDetailsFragment, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f13228b = myCourseDetailsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new MyCourseDetailsFragment$initPopup$1$1$1(this.f13228b, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((MyCourseDetailsFragment$initPopup$1$1$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f13227a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            MyCourseDetailsViewModel myCourseDetailsViewModelM11532d0 = this.f13228b.m11532d0();
            int id = this.f13228b.m11528Y().m11543a().getId();
            this.f13227a = 1;
            obj = myCourseDetailsViewModelM11532d0.m12207e(id, this);
            if (obj == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        if (AbstractC9133u.m16128b(obj, AbstractC9536a.m17796a(true))) {
            AbstractC8366o.m13652d(XToastUtils.INSTANCE, "课程已删除");
            FragmentKt.findNavController(this.f13228b).navigateUp();
        }
        return C8736p.f16368a;
    }
}
