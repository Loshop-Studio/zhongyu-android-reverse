package com.xuexiang.xui.widget.layout.linkage.view;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p048d1.InterfaceC3700a;
import p048d1.InterfaceC3701b;
import p048d1.InterfaceC3702c;

/* loaded from: classes2.dex */
public class LinkageRecyclerView extends RecyclerView implements InterfaceC3701b {

    /* renamed from: com.xuexiang.xui.widget.layout.linkage.view.LinkageRecyclerView$a */
    public class C3594a implements InterfaceC3702c {
        public C3594a() {
        }

        @Override // p048d1.InterfaceC3702c
        /* renamed from: a */
        public boolean mo4478a(int i4) {
            return LinkageRecyclerView.this.canScrollVertically(i4);
        }

        @Override // p048d1.InterfaceC3702c
        /* renamed from: b */
        public void mo4479b(View view, int i4) {
            LinkageRecyclerView.this.fling(0, i4);
        }

        @Override // p048d1.InterfaceC3702c
        /* renamed from: c */
        public int mo4480c() {
            return LinkageRecyclerView.this.computeVerticalScrollOffset();
        }

        @Override // p048d1.InterfaceC3702c
        /* renamed from: d */
        public boolean mo4481d() {
            return true;
        }

        @Override // p048d1.InterfaceC3702c
        /* renamed from: e */
        public void mo4482e() {
            RecyclerView.Adapter adapter = LinkageRecyclerView.this.getAdapter();
            if (adapter == null || adapter.getItemCount() <= 0) {
                return;
            }
            LinkageRecyclerView.this.scrollToPosition(adapter.getItemCount() - 1);
        }

        @Override // p048d1.InterfaceC3702c
        /* renamed from: f */
        public void mo4483f() {
            LinkageRecyclerView.this.scrollToPosition(0);
        }

        @Override // p048d1.InterfaceC3702c
        /* renamed from: g */
        public int mo4484g() {
            return LinkageRecyclerView.this.computeVerticalScrollRange();
        }
    }

    @Override // p048d1.InterfaceC3701b
    /* renamed from: a */
    public InterfaceC3702c mo4477a() {
        return new C3594a();
    }

    @Override // p048d1.InterfaceC3701b
    public void setChildLinkageEvent(InterfaceC3700a interfaceC3700a) {
    }
}
