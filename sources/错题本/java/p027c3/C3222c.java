package p027c3;

import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.widget.layout.linkage.view.LinkageRecyclerView;
import p019b3.InterfaceC3107c;

/* renamed from: c3.c */
/* loaded from: classes3.dex */
public final class C3222c implements InterfaceC3107c {

    /* renamed from: a */
    public final /* synthetic */ LinkageRecyclerView f1786a;

    public C3222c(LinkageRecyclerView linkageRecyclerView) {
        this.f1786a = linkageRecyclerView;
    }

    @Override // p019b3.InterfaceC3107c
    /* renamed from: e */
    public final boolean mo2062e(int i) {
        return this.f1786a.canScrollVertically(i);
    }

    @Override // p019b3.InterfaceC3107c
    /* renamed from: h */
    public final int mo2063h() {
        return this.f1786a.computeVerticalScrollOffset();
    }

    @Override // p019b3.InterfaceC3107c
    /* renamed from: i */
    public final void mo2064i() {
        LinkageRecyclerView linkageRecyclerView = this.f1786a;
        RecyclerView.Adapter adapter = linkageRecyclerView.getAdapter();
        if (adapter == null || adapter.getItemCount() <= 0) {
            return;
        }
        linkageRecyclerView.scrollToPosition(adapter.getItemCount() - 1);
    }

    @Override // p019b3.InterfaceC3107c
    /* renamed from: j */
    public final void mo2065j(int i) {
        this.f1786a.fling(0, i);
    }

    @Override // p019b3.InterfaceC3107c
    /* renamed from: k */
    public final int mo2066k() {
        return this.f1786a.computeVerticalScrollRange();
    }

    @Override // p019b3.InterfaceC3107c
    /* renamed from: t */
    public final boolean mo2067t() {
        return true;
    }

    @Override // p019b3.InterfaceC3107c
    /* renamed from: v */
    public final void mo2068v() {
        this.f1786a.scrollToPosition(0);
    }
}
