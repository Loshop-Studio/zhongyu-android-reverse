package com.xuexiang.xui.widget.layout.linkage.view;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p165m3.InterfaceC8545a;
import p165m3.InterfaceC8546b;
import p165m3.InterfaceC8547c;

/* loaded from: classes4.dex */
public class LinkageRecyclerView extends RecyclerView implements InterfaceC8546b {

    /* renamed from: com.xuexiang.xui.widget.layout.linkage.view.LinkageRecyclerView$a */
    public class C6554a implements InterfaceC8547c {
        public C6554a() {
        }

        @Override // p165m3.InterfaceC8547c
        /* renamed from: a */
        public boolean mo5837a(int i10) {
            return LinkageRecyclerView.this.canScrollVertically(i10);
        }

        @Override // p165m3.InterfaceC8547c
        /* renamed from: b */
        public int mo5838b() {
            return LinkageRecyclerView.this.computeVerticalScrollOffset();
        }

        @Override // p165m3.InterfaceC8547c
        /* renamed from: c */
        public void mo5839c() {
            RecyclerView.Adapter adapter = LinkageRecyclerView.this.getAdapter();
            if (adapter == null || adapter.getItemCount() <= 0) {
                return;
            }
            LinkageRecyclerView.this.scrollToPosition(adapter.getItemCount() - 1);
        }

        @Override // p165m3.InterfaceC8547c
        /* renamed from: d */
        public int mo5840d() {
            return LinkageRecyclerView.this.computeVerticalScrollRange();
        }

        @Override // p165m3.InterfaceC8547c
        /* renamed from: e */
        public void mo5841e(View view, int i10) {
            LinkageRecyclerView.this.fling(0, i10);
        }

        @Override // p165m3.InterfaceC8547c
        /* renamed from: f */
        public boolean mo5842f() {
            return true;
        }

        @Override // p165m3.InterfaceC8547c
        /* renamed from: g */
        public void mo5843g() {
            LinkageRecyclerView.this.scrollToPosition(0);
        }
    }

    @Override // p165m3.InterfaceC8546b
    /* renamed from: a */
    public InterfaceC8547c mo5836a() {
        return new C6554a();
    }

    @Override // p165m3.InterfaceC8546b
    public void setChildLinkageEvent(InterfaceC8545a interfaceC8545a) {
    }
}
