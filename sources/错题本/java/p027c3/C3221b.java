package p027c3;

import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.widget.layout.linkage.LinkageScrollLayout;
import com.xuexiang.xui.widget.layout.linkage.view.LinkageRecyclerView;
import p019b3.InterfaceC3105a;
import p129o2.C6268a;

/* renamed from: c3.b */
/* loaded from: classes3.dex */
public final class C3221b extends RecyclerView.OnScrollListener {

    /* renamed from: a */
    public final /* synthetic */ LinkageRecyclerView f1785a;

    public C3221b(LinkageRecyclerView linkageRecyclerView) {
        this.f1785a = linkageRecyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i8) {
        InterfaceC3105a interfaceC3105a;
        InterfaceC3105a interfaceC3105a2;
        super.onScrolled(recyclerView, i, i8);
        LinkageRecyclerView linkageRecyclerView = this.f1785a;
        if (!linkageRecyclerView.canScrollVertically(-1) && (interfaceC3105a2 = linkageRecyclerView.f4541a) != null) {
            ((C6268a) interfaceC3105a2).m5866A(linkageRecyclerView);
        }
        if (!linkageRecyclerView.canScrollVertically(1) && (interfaceC3105a = linkageRecyclerView.f4541a) != null) {
            ((C6268a) interfaceC3105a).m5870z(linkageRecyclerView);
        }
        InterfaceC3105a interfaceC3105a3 = linkageRecyclerView.f4541a;
        if (interfaceC3105a3 != null) {
            ((LinkageScrollLayout) ((C6268a) interfaceC3105a3).f10022b).awakenScrollBars();
        }
    }
}
