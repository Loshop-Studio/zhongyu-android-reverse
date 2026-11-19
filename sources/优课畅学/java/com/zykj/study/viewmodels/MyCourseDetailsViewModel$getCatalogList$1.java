package com.zykj.study.viewmodels;

import androidx.databinding.library.baseAdapters.C3721BR;
import com.zykj.study.bean.course.CatalogBean;
import com.zykj.study.repository.CourseRepository;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC9079b;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p134i7.AbstractC8811w;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9271h;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p220q4.AbstractC9801a;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.MyCourseDetailsViewModel$getCatalogList$1", m17801f = "MyCourseDetailsViewModel.kt", m17802l = {C3721BR.versionName}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class MyCourseDetailsViewModel$getCatalogList$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14260a;

    /* renamed from: b */
    public final /* synthetic */ MyCourseDetailsViewModel f14261b;

    /* renamed from: c */
    public final /* synthetic */ int f14262c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyCourseDetailsViewModel$getCatalogList$1(MyCourseDetailsViewModel myCourseDetailsViewModel, int i10, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14261b = myCourseDetailsViewModel;
        this.f14262c = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new MyCourseDetailsViewModel$getCatalogList$1(this.f14261b, this.f14262c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((MyCourseDetailsViewModel$getCatalogList$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14260a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            CourseRepository courseRepository = this.f14261b.f14240a;
            int i11 = this.f14262c;
            this.f14260a = 1;
            obj = courseRepository.m10340j(i11, this);
            if (obj == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        InterfaceC9271h interfaceC9271hM12208f = this.f14261b.m12208f();
        Result.C9076a c9076a = Result.f17350b;
        List<CatalogBean> listM18353a = AbstractC9801a.m18353a((List) obj);
        MyCourseDetailsViewModel myCourseDetailsViewModel = this.f14261b;
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(listM18353a, 10));
        for (CatalogBean catalogBean : listM18353a) {
            catalogBean.setExpanded(myCourseDetailsViewModel.m12213k().contains(AbstractC9536a.m17798c(catalogBean.getId())));
            arrayList.add(catalogBean);
        }
        interfaceC9271hM12208f.setValue(Result.m15908a(Result.m15909b(arrayList)));
        return C8736p.f16368a;
    }
}
