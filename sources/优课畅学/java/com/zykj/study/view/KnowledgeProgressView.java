package com.zykj.study.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.blankj.utilcode.util.AbstractC5361f;
import com.zykj.study.R$layout;
import com.zykj.study.bean.course.CatalogBean;
import com.zykj.study.databinding.ItemKnowledgeProgressBinding;
import com.zykj.study.view.KnowledgeProgressView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class KnowledgeProgressView extends LinearLayout {

    /* renamed from: a */
    public List f13760a;

    /* renamed from: b */
    public InterfaceC10570l f13761b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KnowledgeProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC9133u.m16133g(context, "context");
        setOrientation(1);
        this.f13760a = new ArrayList();
        this.f13761b = new InterfaceC10570l() { // from class: f5.k
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return KnowledgeProgressView.m11913f((CatalogBean) obj);
            }
        };
    }

    /* renamed from: d */
    public static final void m11912d(KnowledgeProgressView knowledgeProgressView, CatalogBean catalogBean, View view) {
        knowledgeProgressView.f13761b.invoke(catalogBean);
    }

    /* renamed from: f */
    public static final C8736p m11913f(CatalogBean it) {
        AbstractC9133u.m16133g(it, "it");
        return C8736p.f16368a;
    }

    /* renamed from: c */
    public final View m11914c(boolean z10, final CatalogBean catalogBean) {
        ItemKnowledgeProgressBinding itemKnowledgeProgressBinding = (ItemKnowledgeProgressBinding) DataBindingUtil.inflate(LayoutInflater.from(getContext()), R$layout.item_knowledge_progress, null, false);
        itemKnowledgeProgressBinding.setEntity(catalogBean);
        itemKnowledgeProgressBinding.setIsTeacher(Boolean.valueOf(z10));
        AbstractC5361f.m2451b(itemKnowledgeProgressBinding.getRoot(), new View.OnClickListener() { // from class: f5.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KnowledgeProgressView.m11912d(this.f16030a, catalogBean, view);
            }
        });
        itemKnowledgeProgressBinding.setLifecycleOwner(ViewTreeLifecycleOwner.get(this));
        View root = itemKnowledgeProgressBinding.getRoot();
        AbstractC9133u.m16132f(root, "getRoot(...)");
        return root;
    }

    /* renamed from: e */
    public final void m11915e(boolean z10) {
        Iterator it = this.f13760a.iterator();
        while (it.hasNext()) {
            addView(m11914c(z10, (CatalogBean) it.next()));
        }
    }

    /* renamed from: g */
    public final void m11916g(boolean z10, List list) {
        AbstractC9133u.m16133g(list, "list");
        this.f13760a.clear();
        this.f13760a.addAll(list);
        removeAllViews();
        m11915e(z10);
    }

    public final void setKnowLedgeClickListener(InterfaceC10570l knowledgeClick) {
        AbstractC9133u.m16133g(knowledgeClick, "knowledgeClick");
        this.f13761b = knowledgeClick;
    }
}
