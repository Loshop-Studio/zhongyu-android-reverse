package com.xuexiang.xui.widget.layout.linkage.view;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p033c4.InterfaceC5225a;
import p033c4.InterfaceC5226b;
import p033c4.InterfaceC5227c;

/* loaded from: classes4.dex */
public class LinkageRecyclerView extends RecyclerView implements InterfaceC5226b {

    /* renamed from: com.xuexiang.xui.widget.layout.linkage.view.LinkageRecyclerView$a */
    public class C6874a implements InterfaceC5227c {
        public C6874a() {
        }

        @Override // p033c4.InterfaceC5227c
        /* renamed from: a */
        public boolean mo2338a(int i9) {
            return LinkageRecyclerView.this.canScrollVertically(i9);
        }

        @Override // p033c4.InterfaceC5227c
        /* renamed from: b */
        public int mo2339b() {
            return LinkageRecyclerView.this.computeVerticalScrollOffset();
        }

        @Override // p033c4.InterfaceC5227c
        /* renamed from: c */
        public void mo2340c() {
            RecyclerView.Adapter adapter = LinkageRecyclerView.this.getAdapter();
            if (adapter == null || adapter.getItemCount() <= 0) {
                return;
            }
            LinkageRecyclerView.this.scrollToPosition(adapter.getItemCount() - 1);
        }

        @Override // p033c4.InterfaceC5227c
        /* renamed from: d */
        public int mo2341d() {
            return LinkageRecyclerView.this.computeVerticalScrollRange();
        }

        @Override // p033c4.InterfaceC5227c
        /* renamed from: e */
        public void mo2342e(View view, int i9) {
            LinkageRecyclerView.this.fling(0, i9);
        }

        @Override // p033c4.InterfaceC5227c
        /* renamed from: f */
        public boolean mo2343f() {
            return true;
        }

        @Override // p033c4.InterfaceC5227c
        /* renamed from: g */
        public void mo2344g() {
            LinkageRecyclerView.this.scrollToPosition(0);
        }
    }

    @Override // p033c4.InterfaceC5226b
    /* renamed from: a */
    public InterfaceC5227c mo2337a() {
        return new C6874a();
    }

    @Override // p033c4.InterfaceC5226b
    public void setChildLinkageEvent(InterfaceC5225a interfaceC5225a) {
    }
}
