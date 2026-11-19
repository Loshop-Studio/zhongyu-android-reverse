package com.xuexiang.xui.widget.layout.linkage.view;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import p163l2.InterfaceC9243a;
import p163l2.InterfaceC9244b;
import p163l2.InterfaceC9245c;

/* loaded from: classes4.dex */
public class LinkageScrollView extends NestedScrollView implements InterfaceC9244b {

    /* renamed from: com.xuexiang.xui.widget.layout.linkage.view.LinkageScrollView$a */
    public class C6961a implements InterfaceC9245c {
        public C6961a() {
        }

        @Override // p163l2.InterfaceC9245c
        /* renamed from: a */
        public boolean mo7031a(int i10) {
            return LinkageScrollView.this.canScrollVertically(i10);
        }

        @Override // p163l2.InterfaceC9245c
        /* renamed from: b */
        public int mo7032b() {
            return LinkageScrollView.this.computeVerticalScrollOffset();
        }

        @Override // p163l2.InterfaceC9245c
        /* renamed from: c */
        public void mo7033c() {
            LinkageScrollView.this.scrollTo(0, mo7034d());
        }

        @Override // p163l2.InterfaceC9245c
        /* renamed from: d */
        public int mo7034d() {
            return LinkageScrollView.this.computeVerticalScrollRange();
        }

        @Override // p163l2.InterfaceC9245c
        /* renamed from: e */
        public void mo7035e(View view, int i10) {
            LinkageScrollView.this.fling(i10);
        }

        @Override // p163l2.InterfaceC9245c
        /* renamed from: f */
        public boolean mo7036f() {
            return true;
        }

        @Override // p163l2.InterfaceC9245c
        /* renamed from: g */
        public void mo7037g() {
            LinkageScrollView.this.scrollTo(0, 0);
        }
    }

    @Override // p163l2.InterfaceC9244b
    /* renamed from: a */
    public InterfaceC9245c mo7030a() {
        return new C6961a();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        setVerticalScrollBarEnabled(false);
        canScrollVertically(-1);
        canScrollVertically(1);
    }

    @Override // p163l2.InterfaceC9244b
    public void setChildLinkageEvent(InterfaceC9243a interfaceC9243a) {
    }
}
