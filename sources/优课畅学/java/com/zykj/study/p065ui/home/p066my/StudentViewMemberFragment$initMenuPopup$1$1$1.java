package com.zykj.study.p065ui.home.p066my;

import com.tencent.smtt.sdk.TbsListener;
import com.zykj.base.utils.XToastUtils;
import com.zykj.study.R$string;
import com.zykj.study.bean.teach.SuperviseGroup;
import com.zykj.study.viewmodels.StudentViewViewModel;
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

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.StudentViewMemberFragment$initMenuPopup$1$1$1", m17801f = "StudentViewMemberFragment.kt", m17802l = {TbsListener.ErrorCode.INCR_UPDATE_EXCEPTION}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class StudentViewMemberFragment$initMenuPopup$1$1$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f13413a;

    /* renamed from: b */
    public final /* synthetic */ StudentViewMemberFragment f13414b;

    /* renamed from: c */
    public final /* synthetic */ SuperviseGroup f13415c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StudentViewMemberFragment$initMenuPopup$1$1$1(StudentViewMemberFragment studentViewMemberFragment, SuperviseGroup superviseGroup, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f13414b = studentViewMemberFragment;
        this.f13415c = superviseGroup;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new StudentViewMemberFragment$initMenuPopup$1$1$1(this.f13414b, this.f13415c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((StudentViewMemberFragment$initMenuPopup$1$1$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f13413a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            StudentViewViewModel studentViewViewModelM11670u = this.f13414b.m11670u();
            int id = this.f13415c.getId();
            this.f13413a = 1;
            obj = studentViewViewModelM11670u.m12276k(id, this);
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
            XToastUtils xToastUtils = XToastUtils.INSTANCE;
            String string = this.f13414b.getString(R$string.refresh_member_success);
            AbstractC9133u.m16132f(string, "getString(...)");
            AbstractC8366o.m13652d(xToastUtils, string);
        }
        return C8736p.f16368a;
    }
}
