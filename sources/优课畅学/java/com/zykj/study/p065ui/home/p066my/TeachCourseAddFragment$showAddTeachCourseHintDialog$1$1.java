package com.zykj.study.p065ui.home.p066my;

import com.tencent.smtt.sdk.TbsListener;
import com.zykj.base.utils.XToastUtils;
import com.zykj.study.R$string;
import com.zykj.study.data.MyCourseEntity;
import com.zykj.study.viewmodels.MyCourseViewModel;
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

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.TeachCourseAddFragment$showAddTeachCourseHintDialog$1$1", m17801f = "TeachCourseAddFragment.kt", m17802l = {TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class TeachCourseAddFragment$showAddTeachCourseHintDialog$1$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f13448a;

    /* renamed from: b */
    public final /* synthetic */ TeachCourseAddFragment f13449b;

    /* renamed from: c */
    public final /* synthetic */ MyCourseEntity f13450c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeachCourseAddFragment$showAddTeachCourseHintDialog$1$1(TeachCourseAddFragment teachCourseAddFragment, MyCourseEntity myCourseEntity, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f13449b = teachCourseAddFragment;
        this.f13450c = myCourseEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new TeachCourseAddFragment$showAddTeachCourseHintDialog$1$1(this.f13449b, this.f13450c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((TeachCourseAddFragment$showAddTeachCourseHintDialog$1$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f13448a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            MyCourseViewModel myCourseViewModelM11690q = this.f13449b.m11690q();
            MyCourseEntity myCourseEntity = this.f13450c;
            this.f13448a = 1;
            obj = myCourseViewModelM11690q.m12230g(myCourseEntity, this);
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
            this.f13449b.m11690q().m12229f();
            XToastUtils xToastUtils = XToastUtils.INSTANCE;
            String string = this.f13449b.getString(R$string.couse_add_to_teach_success);
            AbstractC9133u.m16132f(string, "getString(...)");
            AbstractC8366o.m13652d(xToastUtils, string);
        }
        return C8736p.f16368a;
    }
}
