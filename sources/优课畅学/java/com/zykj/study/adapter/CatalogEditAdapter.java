package com.zykj.study.adapter;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.chad.library.adapter.base.BaseNodeAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.zykj.study.R$layout;
import com.zykj.study.bean.course.CatalogBean;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p249t0.C10085a;
import p249t0.InterfaceC10087c;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CatalogEditAdapter extends BaseNodeAdapter implements InterfaceC10087c {

    /* renamed from: y */
    public static final C7601a f10855y = new C7601a(null);

    /* renamed from: z */
    public static final int f10856z = 8;

    /* renamed from: x */
    public final HashSet f10857x;

    /* renamed from: com.zykj.study.adapter.CatalogEditAdapter$a */
    public static final class C7601a {
        public /* synthetic */ C7601a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C7601a() {
        }
    }

    /* renamed from: com.zykj.study.adapter.CatalogEditAdapter$b */
    public interface InterfaceC7602b {
        /* renamed from: a */
        void mo9929a(View view, CatalogBean catalogBean);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogEditAdapter(HashSet selectModel, InterfaceC7602b addIconClickListener, InterfaceC10570l openKnowLedge) {
        super(null, 1, null);
        AbstractC9133u.m16133g(selectModel, "selectModel");
        AbstractC9133u.m16133g(addIconClickListener, "addIconClickListener");
        AbstractC9133u.m16133g(openKnowLedge, "openKnowLedge");
        this.f10857x = selectModel;
        m3461k0(new C7612a(0, R$layout.item_chapter_edit, selectModel, addIconClickListener));
        m3461k0(new C7613b(1, R$layout.item_knowledge_edit, addIconClickListener, openKnowLedge));
    }

    @Override // p249t0.InterfaceC10087c
    /* renamed from: a */
    public C10085a mo9928a(BaseQuickAdapter baseQuickAdapter) {
        return super.mo9928a(baseQuickAdapter);
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    /* renamed from: h0 */
    public int mo3479h0(List data, int i10) {
        AbstractC9133u.m16133g(data, "data");
        Object obj = data.get(i10);
        AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type com.zykj.study.bean.course.CatalogBean");
        return ((CatalogBean) obj).isLeaf() ? 1 : 0;
    }
}
