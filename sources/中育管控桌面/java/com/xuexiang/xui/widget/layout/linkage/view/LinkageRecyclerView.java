package com.xuexiang.xui.widget.layout.linkage.view;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p113n2.InterfaceC7456a;
import p113n2.InterfaceC7457b;
import p113n2.InterfaceC7458c;

/* loaded from: classes3.dex */
public class LinkageRecyclerView extends RecyclerView implements InterfaceC7457b {

    /* renamed from: com.xuexiang.xui.widget.layout.linkage.view.LinkageRecyclerView$a */
    public class C5933a implements InterfaceC7458c {
        public C5933a() {
        }

        @Override // p113n2.InterfaceC7458c
        /* renamed from: a */
        public boolean mo4856a(int i6) {
            return LinkageRecyclerView.this.canScrollVertically(i6);
        }

        @Override // p113n2.InterfaceC7458c
        /* renamed from: b */
        public int mo4857b() {
            return LinkageRecyclerView.this.computeVerticalScrollOffset();
        }

        @Override // p113n2.InterfaceC7458c
        /* renamed from: c */
        public void mo4858c() {
            RecyclerView.Adapter adapter = LinkageRecyclerView.this.getAdapter();
            if (adapter == null || adapter.getItemCount() <= 0) {
                return;
            }
            LinkageRecyclerView.this.scrollToPosition(adapter.getItemCount() - 1);
        }

        @Override // p113n2.InterfaceC7458c
        /* renamed from: d */
        public int mo4859d() {
            return LinkageRecyclerView.this.computeVerticalScrollRange();
        }

        @Override // p113n2.InterfaceC7458c
        /* renamed from: e */
        public void mo4860e(View view, int i6) {
            LinkageRecyclerView.this.fling(0, i6);
        }

        @Override // p113n2.InterfaceC7458c
        /* renamed from: f */
        public boolean mo4861f() {
            return true;
        }

        @Override // p113n2.InterfaceC7458c
        /* renamed from: g */
        public void mo4862g() {
            LinkageRecyclerView.this.scrollToPosition(0);
        }
    }

    @Override // p113n2.InterfaceC7457b
    /* renamed from: a */
    public InterfaceC7458c mo4855a() {
        return new C5933a();
    }

    @Override // p113n2.InterfaceC7457b
    public void setChildLinkageEvent(InterfaceC7456a interfaceC7456a) {
    }
}
