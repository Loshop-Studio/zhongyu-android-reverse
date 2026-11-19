package com.zykj.study.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.zykj.study.R$layout;
import com.zykj.study.bean.course.CatalogBean;
import com.zykj.study.databinding.ItemKnowledgeBinding;
import com.zykj.study.view.KnowledgeView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p086e5.AbstractC8354c;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class KnowledgeView extends LinearLayout {

    /* renamed from: a */
    public List f13762a;

    /* renamed from: b */
    public InterfaceC10570l f13763b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KnowledgeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC9133u.m16133g(context, "context");
        setOrientation(1);
        this.f13762a = new ArrayList();
        this.f13763b = new InterfaceC10570l() { // from class: f5.n
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return KnowledgeView.m11920f((CatalogBean) obj);
            }
        };
    }

    /* renamed from: d */
    public static final C8736p m11919d(KnowledgeView knowledgeView, CatalogBean catalogBean, View it) {
        AbstractC9133u.m16133g(it, "it");
        knowledgeView.f13763b.invoke(catalogBean);
        return C8736p.f16368a;
    }

    /* renamed from: f */
    public static final C8736p m11920f(CatalogBean it) {
        AbstractC9133u.m16133g(it, "it");
        return C8736p.f16368a;
    }

    /* renamed from: c */
    public final View m11921c(final CatalogBean catalogBean) {
        ItemKnowledgeBinding itemKnowledgeBinding = (ItemKnowledgeBinding) DataBindingUtil.inflate(LayoutInflater.from(getContext()), R$layout.item_knowledge, null, false);
        itemKnowledgeBinding.setEntity(catalogBean);
        View root = itemKnowledgeBinding.getRoot();
        AbstractC9133u.m16132f(root, "getRoot(...)");
        AbstractC8354c.m13615r(root, new InterfaceC10570l() { // from class: f5.m
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return KnowledgeView.m11919d(this.f16032a, catalogBean, (View) obj);
            }
        });
        itemKnowledgeBinding.setLifecycleOwner(ViewTreeLifecycleOwner.get(this));
        View root2 = itemKnowledgeBinding.getRoot();
        AbstractC9133u.m16132f(root2, "getRoot(...)");
        return root2;
    }

    /* renamed from: e */
    public final void m11922e() {
        Iterator it = this.f13762a.iterator();
        while (it.hasNext()) {
            addView(m11921c((CatalogBean) it.next()));
        }
    }

    public final void setKnowLedge(List<CatalogBean> list) {
        AbstractC9133u.m16133g(list, "list");
        this.f13762a.clear();
        this.f13762a.addAll(list);
        removeAllViews();
        m11922e();
    }

    public final void setKnowLedgeClickListener(InterfaceC10570l knowledgeClick) {
        AbstractC9133u.m16133g(knowledgeClick, "knowledgeClick");
        this.f13763b = knowledgeClick;
    }
}
