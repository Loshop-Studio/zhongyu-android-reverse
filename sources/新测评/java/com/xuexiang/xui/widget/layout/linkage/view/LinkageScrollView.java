package com.xuexiang.xui.widget.layout.linkage.view;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import p165m3.InterfaceC8545a;
import p165m3.InterfaceC8546b;
import p165m3.InterfaceC8547c;

/* loaded from: classes4.dex */
public class LinkageScrollView extends NestedScrollView implements InterfaceC8546b {

    /* renamed from: com.xuexiang.xui.widget.layout.linkage.view.LinkageScrollView$a */
    public class C6555a implements InterfaceC8547c {
        public C6555a() {
        }

        @Override // p165m3.InterfaceC8547c
        /* renamed from: a */
        public boolean mo5837a(int i10) {
            return LinkageScrollView.this.canScrollVertically(i10);
        }

        @Override // p165m3.InterfaceC8547c
        /* renamed from: b */
        public int mo5838b() {
            return LinkageScrollView.this.computeVerticalScrollOffset();
        }

        @Override // p165m3.InterfaceC8547c
        /* renamed from: c */
        public void mo5839c() {
            LinkageScrollView.this.scrollTo(0, mo5840d());
        }

        @Override // p165m3.InterfaceC8547c
        /* renamed from: d */
        public int mo5840d() {
            return LinkageScrollView.this.computeVerticalScrollRange();
        }

        @Override // p165m3.InterfaceC8547c
        /* renamed from: e */
        public void mo5841e(View view, int i10) {
            LinkageScrollView.this.fling(i10);
        }

        @Override // p165m3.InterfaceC8547c
        /* renamed from: f */
        public boolean mo5842f() {
            return true;
        }

        @Override // p165m3.InterfaceC8547c
        /* renamed from: g */
        public void mo5843g() {
            LinkageScrollView.this.scrollTo(0, 0);
        }
    }

    @Override // p165m3.InterfaceC8546b
    /* renamed from: a */
    public InterfaceC8547c mo5836a() {
        return new C6555a();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        setVerticalScrollBarEnabled(false);
        canScrollVertically(-1);
        canScrollVertically(1);
    }

    @Override // p165m3.InterfaceC8546b
    public void setChildLinkageEvent(InterfaceC8545a interfaceC8545a) {
    }
}
