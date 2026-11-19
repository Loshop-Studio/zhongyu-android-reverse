package com.xuexiang.xui.widget.layout.linkage.view;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import p048d1.InterfaceC3700a;
import p048d1.InterfaceC3701b;
import p048d1.InterfaceC3702c;

/* loaded from: classes2.dex */
public class LinkageScrollView extends NestedScrollView implements InterfaceC3701b {

    /* renamed from: com.xuexiang.xui.widget.layout.linkage.view.LinkageScrollView$a */
    public class C3595a implements InterfaceC3702c {
        public C3595a() {
        }

        @Override // p048d1.InterfaceC3702c
        /* renamed from: a */
        public boolean mo4478a(int i4) {
            return LinkageScrollView.this.canScrollVertically(i4);
        }

        @Override // p048d1.InterfaceC3702c
        /* renamed from: b */
        public void mo4479b(View view, int i4) {
            LinkageScrollView.this.fling(i4);
        }

        @Override // p048d1.InterfaceC3702c
        /* renamed from: c */
        public int mo4480c() {
            return LinkageScrollView.this.computeVerticalScrollOffset();
        }

        @Override // p048d1.InterfaceC3702c
        /* renamed from: d */
        public boolean mo4481d() {
            return true;
        }

        @Override // p048d1.InterfaceC3702c
        /* renamed from: e */
        public void mo4482e() {
            LinkageScrollView.this.scrollTo(0, mo4484g());
        }

        @Override // p048d1.InterfaceC3702c
        /* renamed from: f */
        public void mo4483f() {
            LinkageScrollView.this.scrollTo(0, 0);
        }

        @Override // p048d1.InterfaceC3702c
        /* renamed from: g */
        public int mo4484g() {
            return LinkageScrollView.this.computeVerticalScrollRange();
        }
    }

    @Override // p048d1.InterfaceC3701b
    /* renamed from: a */
    public InterfaceC3702c mo4477a() {
        return new C3595a();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i4, int i5, int i6, int i7) {
        super.onScrollChanged(i4, i5, i6, i7);
        setVerticalScrollBarEnabled(false);
        canScrollVertically(-1);
        canScrollVertically(1);
    }

    @Override // p048d1.InterfaceC3701b
    public void setChildLinkageEvent(InterfaceC3700a interfaceC3700a) {
    }
}
