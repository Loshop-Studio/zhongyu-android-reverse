package com.zykj.study.p065ui.home.p066my;

import com.zykj.base.utils.XToastUtils;
import com.zykj.study.R$string;
import com.zykj.study.adapter.MyTeachCourseAddAdapter;
import com.zykj.study.data.MyCourseEntity;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p086e5.AbstractC8366o;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.TeachCourseAddFragment$initView$3$performAction$1", m17801f = "TeachCourseAddFragment.kt", m17802l = {78}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class TeachCourseAddFragment$initView$3$performAction$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f13444a;

    /* renamed from: b */
    public final /* synthetic */ TeachCourseAddFragment f13445b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeachCourseAddFragment$initView$3$performAction$1(TeachCourseAddFragment teachCourseAddFragment, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f13445b = teachCourseAddFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new TeachCourseAddFragment$initView$3$performAction$1(this.f13445b, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((TeachCourseAddFragment$initView$3$performAction$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f13444a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            MyTeachCourseAddAdapter myTeachCourseAddAdapter = this.f13445b.f13421h;
            if (myTeachCourseAddAdapter == null) {
                AbstractC9133u.m16151y("myCourseAdapter");
                myTeachCourseAddAdapter = null;
            }
            this.f13444a = 1;
            obj = myTeachCourseAddAdapter.m10065f(this);
            if (obj == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        TeachCourseAddFragment teachCourseAddFragment = this.f13445b;
        MyCourseEntity myCourseEntity = (MyCourseEntity) obj;
        if (myCourseEntity == null) {
            XToastUtils xToastUtils = XToastUtils.INSTANCE;
            String string = teachCourseAddFragment.getString(R$string.no_course_selected);
            AbstractC9133u.m16132f(string, "getString(...)");
            AbstractC8366o.m13652d(xToastUtils, string);
        } else {
            teachCourseAddFragment.m11695u(myCourseEntity);
        }
        return C8736p.f16368a;
    }
}
