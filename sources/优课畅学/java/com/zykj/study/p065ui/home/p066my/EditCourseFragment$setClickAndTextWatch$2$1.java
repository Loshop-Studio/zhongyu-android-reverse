package com.zykj.study.p065ui.home.p066my;

import androidx.navigation.fragment.FragmentKt;
import com.zykj.base.utils.XToastUtils;
import com.zykj.study.R$string;
import com.zykj.study.data.MyCourseEntity;
import com.zykj.study.databinding.FragmentEditCourseBinding;
import com.zykj.study.viewmodels.EditCourseViewModel;
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

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.EditCourseFragment$setClickAndTextWatch$2$1", m17801f = "EditCourseFragment.kt", m17802l = {236}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class EditCourseFragment$setClickAndTextWatch$2$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f12958a;

    /* renamed from: b */
    public final /* synthetic */ EditCourseFragment f12959b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditCourseFragment$setClickAndTextWatch$2$1(EditCourseFragment editCourseFragment, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f12959b = editCourseFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new EditCourseFragment$setClickAndTextWatch$2$1(this.f12959b, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((EditCourseFragment$setClickAndTextWatch$2$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f12958a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            this.f12959b.m11332u().m12083a().setValue(((FragmentEditCourseBinding) this.f12959b.getMBindView()).etDesc.getContentText());
            EditCourseViewModel editCourseViewModelM11332u = this.f12959b.m11332u();
            this.f12958a = 1;
            obj = editCourseViewModelM11332u.m12098p(this);
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
            MyCourseEntity myCourseEntityM11342a = this.f12959b.m11331s().m11342a();
            if (myCourseEntityM11342a == null || myCourseEntityM11342a.getId() != 0) {
                AbstractC8366o.m13651c(XToastUtils.INSTANCE, R$string.course_update_success);
            } else {
                AbstractC8366o.m13651c(XToastUtils.INSTANCE, R$string.course_create_success);
            }
            FragmentKt.findNavController(this.f12959b).navigateUp();
        }
        return C8736p.f16368a;
    }
}
