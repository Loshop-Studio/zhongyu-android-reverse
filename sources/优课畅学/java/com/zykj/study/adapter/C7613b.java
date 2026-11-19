package com.zykj.study.adapter;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import com.blankj.utilcode.util.AbstractC5361f;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.zykj.study.adapter.C7613b;
import com.zykj.study.adapter.CatalogEditAdapter;
import com.zykj.study.bean.course.CatalogBean;
import com.zykj.study.databinding.ItemKnowledgeEditBinding;
import kotlin.jvm.internal.AbstractC9133u;
import p227r0.AbstractC9901b;
import p260u0.AbstractC10163a;
import p300x7.InterfaceC10570l;

/* renamed from: com.zykj.study.adapter.b */
/* loaded from: classes4.dex */
public final class C7613b extends AbstractC10163a {

    /* renamed from: e */
    public final int f10982e;

    /* renamed from: f */
    public final int f10983f;

    /* renamed from: g */
    public final CatalogEditAdapter.InterfaceC7602b f10984g;

    /* renamed from: h */
    public final InterfaceC10570l f10985h;

    public C7613b(int i10, int i11, CatalogEditAdapter.InterfaceC7602b addIconClickListener, InterfaceC10570l openKnowLedge) {
        AbstractC9133u.m16133g(addIconClickListener, "addIconClickListener");
        AbstractC9133u.m16133g(openKnowLedge, "openKnowLedge");
        this.f10982e = i10;
        this.f10983f = i11;
        this.f10984g = addIconClickListener;
        this.f10985h = openKnowLedge;
    }

    /* renamed from: x */
    public static final void m10151x(C7613b c7613b, AbstractC9901b abstractC9901b, View view) {
        CatalogEditAdapter.InterfaceC7602b interfaceC7602b = c7613b.f10984g;
        AbstractC9133u.m16130d(view);
        interfaceC7602b.mo9929a(view, (CatalogBean) abstractC9901b);
    }

    /* renamed from: y */
    public static final void m10152y(C7613b c7613b, AbstractC9901b abstractC9901b, View view) {
        c7613b.f10985h.invoke(abstractC9901b);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* renamed from: g */
    public int mo3530g() {
        return this.f10982e;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* renamed from: h */
    public int mo3531h() {
        return this.f10983f;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* renamed from: q */
    public void mo3540q(BaseViewHolder viewHolder, int i10) {
        AbstractC9133u.m16133g(viewHolder, "viewHolder");
        DataBindingUtil.bind(viewHolder.itemView);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void mo3524a(BaseViewHolder helper, final AbstractC9901b item) {
        ItemKnowledgeEditBinding itemKnowledgeEditBinding;
        AbstractC9133u.m16133g(helper, "helper");
        AbstractC9133u.m16133g(item, "item");
        if (!(item instanceof CatalogBean) || (itemKnowledgeEditBinding = (ItemKnowledgeEditBinding) DataBindingUtil.getBinding(helper.itemView)) == null) {
            return;
        }
        CatalogBean catalogBean = (CatalogBean) item;
        itemKnowledgeEditBinding.setEntity(catalogBean);
        itemKnowledgeEditBinding.setIsChild(catalogBean.isChild());
        itemKnowledgeEditBinding.ivAdd.setOnClickListener(new View.OnClickListener() { // from class: n4.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7613b.m10151x(this.f18513a, item, view);
            }
        });
        AbstractC5361f.m2451b(itemKnowledgeEditBinding.getRoot(), new View.OnClickListener() { // from class: n4.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7613b.m10152y(this.f18517a, item, view);
            }
        });
    }
}
