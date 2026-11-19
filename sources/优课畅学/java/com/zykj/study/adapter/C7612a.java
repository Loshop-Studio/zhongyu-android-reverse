package com.zykj.study.adapter;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import com.chad.library.adapter.base.BaseNodeAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.zykj.study.adapter.C7612a;
import com.zykj.study.adapter.CatalogEditAdapter;
import com.zykj.study.bean.SelectModel;
import com.zykj.study.bean.course.CatalogBean;
import com.zykj.study.databinding.ItemChapterEditBinding;
import java.util.HashSet;
import kotlin.jvm.internal.AbstractC9133u;
import p086e5.AbstractC8354c;
import p123h7.C8736p;
import p227r0.AbstractC9901b;
import p260u0.AbstractC10163a;
import p300x7.InterfaceC10570l;

/* renamed from: com.zykj.study.adapter.a */
/* loaded from: classes4.dex */
public final class C7612a extends AbstractC10163a {

    /* renamed from: e */
    public final int f10978e;

    /* renamed from: f */
    public final int f10979f;

    /* renamed from: g */
    public final HashSet f10980g;

    /* renamed from: h */
    public final CatalogEditAdapter.InterfaceC7602b f10981h;

    public C7612a(int i10, int i11, HashSet selectModel, CatalogEditAdapter.InterfaceC7602b addIconClickListener) {
        AbstractC9133u.m16133g(selectModel, "selectModel");
        AbstractC9133u.m16133g(addIconClickListener, "addIconClickListener");
        this.f10978e = i10;
        this.f10979f = i11;
        this.f10980g = selectModel;
        this.f10981h = addIconClickListener;
    }

    /* renamed from: x */
    public static final void m10146x(C7612a c7612a, AbstractC9901b abstractC9901b, View view) {
        CatalogEditAdapter.InterfaceC7602b interfaceC7602b = c7612a.f10981h;
        AbstractC9133u.m16130d(view);
        interfaceC7602b.mo9929a(view, (CatalogBean) abstractC9901b);
    }

    /* renamed from: y */
    public static final C8736p m10147y(C7612a c7612a, BaseViewHolder baseViewHolder, AbstractC9901b abstractC9901b, View it) {
        AbstractC9133u.m16133g(it, "it");
        BaseNodeAdapter baseNodeAdapterM19028t = c7612a.m19028t();
        AbstractC9133u.m16130d(baseNodeAdapterM19028t);
        BaseNodeAdapter.m3456o0(baseNodeAdapterM19028t, baseViewHolder.getBindingAdapterPosition(), false, false, null, 14, null);
        CatalogBean catalogBean = (CatalogBean) abstractC9901b;
        if (catalogBean.isExpanded()) {
            c7612a.f10980g.add(Integer.valueOf(catalogBean.getId()));
        } else {
            c7612a.f10980g.remove(Integer.valueOf(catalogBean.getId()));
        }
        return C8736p.f16368a;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* renamed from: g */
    public int mo3530g() {
        return this.f10978e;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* renamed from: h */
    public int mo3531h() {
        return this.f10979f;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* renamed from: q */
    public void mo3540q(BaseViewHolder viewHolder, int i10) {
        AbstractC9133u.m16133g(viewHolder, "viewHolder");
        DataBindingUtil.bind(viewHolder.itemView);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void mo3524a(final BaseViewHolder helper, final AbstractC9901b item) {
        ItemChapterEditBinding itemChapterEditBinding;
        AbstractC9133u.m16133g(helper, "helper");
        AbstractC9133u.m16133g(item, "item");
        if (!(item instanceof CatalogBean) || (itemChapterEditBinding = (ItemChapterEditBinding) DataBindingUtil.getBinding(helper.itemView)) == null) {
            return;
        }
        itemChapterEditBinding.setEntity(new SelectModel<>(((CatalogBean) item).isExpanded(), item));
        itemChapterEditBinding.ivAdd.setOnClickListener(new View.OnClickListener() { // from class: n4.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7612a.m10146x(this.f18559a, item, view);
            }
        });
        View root = itemChapterEditBinding.getRoot();
        AbstractC9133u.m16132f(root, "getRoot(...)");
        AbstractC8354c.m13615r(root, new InterfaceC10570l() { // from class: n4.p
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return C7612a.m10147y(this.f18564a, helper, item, (View) obj);
            }
        });
    }
}
