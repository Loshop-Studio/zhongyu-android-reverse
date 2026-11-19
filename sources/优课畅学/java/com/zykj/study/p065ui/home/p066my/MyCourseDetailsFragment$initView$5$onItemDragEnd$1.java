package com.zykj.study.p065ui.home.p066my;

import com.zykj.study.adapter.CatalogEditAdapter;
import com.zykj.study.bean.course.CatalogBean;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.AbstractC9079b;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8807u;
import p134i7.AbstractC8809v;
import p134i7.AbstractC8811w;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.MyCourseDetailsFragment$initView$5$onItemDragEnd$1", m17801f = "MyCourseDetailsFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class MyCourseDetailsFragment$initView$5$onItemDragEnd$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f13240a;

    /* renamed from: b */
    public final /* synthetic */ MyCourseDetailsFragment f13241b;

    /* renamed from: c */
    public final /* synthetic */ CatalogBean f13242c;

    /* renamed from: d */
    public final /* synthetic */ CatalogBean f13243d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyCourseDetailsFragment$initView$5$onItemDragEnd$1(MyCourseDetailsFragment myCourseDetailsFragment, CatalogBean catalogBean, CatalogBean catalogBean2, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f13241b = myCourseDetailsFragment;
        this.f13242c = catalogBean;
        this.f13243d = catalogBean2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new MyCourseDetailsFragment$initView$5$onItemDragEnd$1(this.f13241b, this.f13242c, this.f13243d, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((MyCourseDetailsFragment$initView$5$onItemDragEnd$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List listM14755e;
        AbstractC9434a.m17291f();
        if (this.f13240a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        Object objM15916j = ((Result) this.f13241b.m11532d0().m12208f().getValue()).m15916j();
        List listM14771n = AbstractC8809v.m14771n();
        if (Result.m15913g(objM15916j)) {
            objM15916j = listM14771n;
        }
        List<CatalogBean> listM14547X0 = AbstractC8778f0.m14547X0((Collection) objM15916j);
        CatalogBean catalogBean = this.f13242c;
        CatalogBean catalogBean2 = this.f13243d;
        MyCourseDetailsFragment myCourseDetailsFragment = this.f13241b;
        List<CatalogBean> children = catalogBean.getChildren();
        CatalogBean catalogBean3 = children != null ? (CatalogBean) AbstractC8778f0.m14579y0(children) : null;
        if (catalogBean3 != null && catalogBean3.getId() == catalogBean2.getId()) {
            CatalogEditAdapter catalogEditAdapterM11529Z = myCourseDetailsFragment.m11529Z();
            Object objM15916j2 = ((Result) myCourseDetailsFragment.m11532d0().m12208f().getValue()).m15916j();
            catalogEditAdapterM11529Z.mo3459R((Collection) (Result.m15913g(objM15916j2) ? null : objM15916j2));
            return C8736p.f16368a;
        }
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(listM14547X0, 10));
        for (CatalogBean catalogBeanCopy$default : listM14547X0) {
            List<CatalogBean> children2 = catalogBeanCopy$default.getChildren();
            if (children2 != null && children2.contains(catalogBean2)) {
                catalogBeanCopy$default = CatalogBean.copy$default(catalogBeanCopy$default, 0, null, false, 0, AbstractC8778f0.m14528E0(catalogBeanCopy$default.getChildren(), catalogBean2), null, 0, null, false, 0, 0, 2031, null);
            }
            arrayList.add(catalogBeanCopy$default);
        }
        ArrayList<CatalogBean> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((CatalogBean) obj2).getId() != catalogBean2.getId()) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC8811w.m14786x(arrayList2, 10));
        for (CatalogBean catalogBeanCopy$default2 : arrayList2) {
            if (catalogBeanCopy$default2.getId() == catalogBean.getId()) {
                List<CatalogBean> children3 = catalogBeanCopy$default2.getChildren();
                if (children3 == null || (listM14755e = AbstractC8778f0.m14530G0(children3, catalogBean2)) == null) {
                    listM14755e = AbstractC8807u.m14755e(catalogBean2);
                }
                catalogBeanCopy$default2 = CatalogBean.copy$default(catalogBeanCopy$default2, 0, null, false, 0, listM14755e, null, 0, null, false, 0, 0, 2031, null);
            }
            arrayList3.add(catalogBeanCopy$default2);
        }
        myCourseDetailsFragment.m11532d0().m12217o(myCourseDetailsFragment.m11523E0(arrayList3));
        myCourseDetailsFragment.m11537z0(new Pair(null, null));
        return C8736p.f16368a;
    }
}
