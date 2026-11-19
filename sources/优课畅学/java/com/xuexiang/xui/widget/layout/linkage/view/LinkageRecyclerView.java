package com.xuexiang.xui.widget.layout.linkage.view;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p163l2.InterfaceC9243a;
import p163l2.InterfaceC9244b;
import p163l2.InterfaceC9245c;

/* loaded from: classes4.dex */
public class LinkageRecyclerView extends RecyclerView implements InterfaceC9244b {

    /* renamed from: com.xuexiang.xui.widget.layout.linkage.view.LinkageRecyclerView$a */
    public class C6960a implements InterfaceC9245c {
        public C6960a() {
        }

        @Override // p163l2.InterfaceC9245c
        /* renamed from: a */
        public boolean mo7031a(int i10) {
            return LinkageRecyclerView.this.canScrollVertically(i10);
        }

        @Override // p163l2.InterfaceC9245c
        /* renamed from: b */
        public int mo7032b() {
            return LinkageRecyclerView.this.computeVerticalScrollOffset();
        }

        @Override // p163l2.InterfaceC9245c
        /* renamed from: c */
        public void mo7033c() {
            RecyclerView.Adapter adapter = LinkageRecyclerView.this.getAdapter();
            if (adapter == null || adapter.getItemCount() <= 0) {
                return;
            }
            LinkageRecyclerView.this.scrollToPosition(adapter.getItemCount() - 1);
        }

        @Override // p163l2.InterfaceC9245c
        /* renamed from: d */
        public int mo7034d() {
            return LinkageRecyclerView.this.computeVerticalScrollRange();
        }

        @Override // p163l2.InterfaceC9245c
        /* renamed from: e */
        public void mo7035e(View view, int i10) {
            LinkageRecyclerView.this.fling(0, i10);
        }

        @Override // p163l2.InterfaceC9245c
        /* renamed from: f */
        public boolean mo7036f() {
            return true;
        }

        @Override // p163l2.InterfaceC9245c
        /* renamed from: g */
        public void mo7037g() {
            LinkageRecyclerView.this.scrollToPosition(0);
        }
    }

    @Override // p163l2.InterfaceC9244b
    /* renamed from: a */
    public InterfaceC9245c mo7030a() {
        return new C6960a();
    }

    @Override // p163l2.InterfaceC9244b
    public void setChildLinkageEvent(InterfaceC9243a interfaceC9243a) {
    }
}
