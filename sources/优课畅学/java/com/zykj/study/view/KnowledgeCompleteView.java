package com.zykj.study.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.blankj.utilcode.util.AbstractC5361f;
import com.zykj.study.R$layout;
import com.zykj.study.bean.course.CatalogBean;
import com.zykj.study.databinding.ItemKnowledgeCompleteBinding;
import com.zykj.study.view.KnowledgeCompleteView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class KnowledgeCompleteView extends LinearLayout {

    /* renamed from: a */
    public List f13755a;

    /* renamed from: b */
    public InterfaceC10570l f13756b;

    /* renamed from: c */
    public InterfaceC10570l f13757c;

    /* renamed from: d */
    public int f13758d;

    /* renamed from: e */
    public int f13759e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KnowledgeCompleteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC9133u.m16133g(context, "context");
        setOrientation(1);
        this.f13755a = new ArrayList();
        this.f13756b = new InterfaceC10570l() { // from class: f5.g
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return KnowledgeCompleteView.m11906i((CatalogBean) obj);
            }
        };
        this.f13757c = new InterfaceC10570l() { // from class: f5.h
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return KnowledgeCompleteView.m11907j((CatalogBean) obj);
            }
        };
        this.f13759e = -1;
    }

    /* renamed from: f */
    public static final void m11904f(KnowledgeCompleteView knowledgeCompleteView, CatalogBean catalogBean, View view) {
        knowledgeCompleteView.f13757c.invoke(catalogBean);
    }

    /* renamed from: g */
    public static final void m11905g(KnowledgeCompleteView knowledgeCompleteView, CatalogBean catalogBean, View view) {
        knowledgeCompleteView.f13756b.invoke(catalogBean);
    }

    /* renamed from: i */
    public static final C8736p m11906i(CatalogBean it) {
        AbstractC9133u.m16133g(it, "it");
        return C8736p.f16368a;
    }

    /* renamed from: j */
    public static final C8736p m11907j(CatalogBean it) {
        AbstractC9133u.m16133g(it, "it");
        return C8736p.f16368a;
    }

    /* renamed from: e */
    public final View m11908e(final CatalogBean catalogBean) {
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(LayoutInflater.from(getContext()), R$layout.item_knowledge_complete, null, false);
        AbstractC9133u.m16132f(viewDataBindingInflate, "inflate(...)");
        ItemKnowledgeCompleteBinding itemKnowledgeCompleteBinding = (ItemKnowledgeCompleteBinding) viewDataBindingInflate;
        itemKnowledgeCompleteBinding.setOnClick(new View.OnClickListener() { // from class: f5.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KnowledgeCompleteView.m11904f(this.f16026a, catalogBean, view);
            }
        });
        itemKnowledgeCompleteBinding.setEntity(catalogBean);
        itemKnowledgeCompleteBinding.setIsSelected(this.f13759e == catalogBean.getId());
        itemKnowledgeCompleteBinding.setTotalMember(this.f13758d);
        AbstractC5361f.m2451b(itemKnowledgeCompleteBinding.getRoot(), new View.OnClickListener() { // from class: f5.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KnowledgeCompleteView.m11905g(this.f16028a, catalogBean, view);
            }
        });
        View root = itemKnowledgeCompleteBinding.getRoot();
        AbstractC9133u.m16132f(root, "getRoot(...)");
        return root;
    }

    /* renamed from: h */
    public final void m11909h() {
        Iterator it = this.f13755a.iterator();
        while (it.hasNext()) {
            addView(m11908e((CatalogBean) it.next()));
        }
    }

    public final void setKnowLedge(List<CatalogBean> list) {
        AbstractC9133u.m16133g(list, "list");
        this.f13755a.clear();
        this.f13755a.addAll(list);
        removeAllViews();
        m11909h();
    }

    public final void setKnowLedgeClickListener(InterfaceC10570l knowledgeClick) {
        AbstractC9133u.m16133g(knowledgeClick, "knowledgeClick");
        this.f13756b = knowledgeClick;
    }

    public final void setProgressClickListener(InterfaceC10570l progressClickListener) {
        AbstractC9133u.m16133g(progressClickListener, "progressClickListener");
        this.f13757c = progressClickListener;
    }

    public final void setSelectCatalogId(int i10) {
        this.f13759e = i10;
    }

    public final void setTotalMember(int i10) {
        this.f13758d = i10;
    }
}
