package com.zykj.study.p065ui.home.p066my;

import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import com.zykj.base.utils.XToastUtils;
import com.zykj.study.bean.teach.CourseBindBean;
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

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.StudentViewFragment$addSuperviseGroup$1$dialog$2$1$1$1", m17801f = "StudentViewFragment.kt", m17802l = {102}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class StudentViewFragment$addSuperviseGroup$1$dialog$2$1$1$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f13385a;

    /* renamed from: b */
    public final /* synthetic */ StudentViewFragment f13386b;

    /* renamed from: c */
    public final /* synthetic */ CourseBindBean f13387c;

    /* renamed from: d */
    public final /* synthetic */ MaterialDialog f13388d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StudentViewFragment$addSuperviseGroup$1$dialog$2$1$1$1(StudentViewFragment studentViewFragment, CourseBindBean courseBindBean, MaterialDialog materialDialog, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f13386b = studentViewFragment;
        this.f13387c = courseBindBean;
        this.f13388d = materialDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new StudentViewFragment$addSuperviseGroup$1$dialog$2$1$1$1(this.f13386b, this.f13387c, this.f13388d, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((StudentViewFragment$addSuperviseGroup$1$dialog$2$1$1$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f13385a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            StudentViewViewModel studentViewViewModelM11641r = this.f13386b.m11641r();
            int id = this.f13387c.getId();
            this.f13385a = 1;
            obj = studentViewViewModelM11641r.m12266a(id, this);
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
            AbstractC8366o.m13652d(XToastUtils.INSTANCE, "添加学员组成功");
        }
        this.f13388d.dismiss();
        return C8736p.f16368a;
    }
}
