package com.xuexiang.xui.widget.layout.linkage.view;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import p113n2.InterfaceC7456a;
import p113n2.InterfaceC7457b;
import p113n2.InterfaceC7458c;

/* loaded from: classes3.dex */
public class LinkageScrollView extends NestedScrollView implements InterfaceC7457b {

    /* renamed from: com.xuexiang.xui.widget.layout.linkage.view.LinkageScrollView$a */
    public class C5934a implements InterfaceC7458c {
        public C5934a() {
        }

        @Override // p113n2.InterfaceC7458c
        /* renamed from: a */
        public boolean mo4856a(int i6) {
            return LinkageScrollView.this.canScrollVertically(i6);
        }

        @Override // p113n2.InterfaceC7458c
        /* renamed from: b */
        public int mo4857b() {
            return LinkageScrollView.this.computeVerticalScrollOffset();
        }

        @Override // p113n2.InterfaceC7458c
        /* renamed from: c */
        public void mo4858c() {
            LinkageScrollView.this.scrollTo(0, mo4859d());
        }

        @Override // p113n2.InterfaceC7458c
        /* renamed from: d */
        public int mo4859d() {
            return LinkageScrollView.this.computeVerticalScrollRange();
        }

        @Override // p113n2.InterfaceC7458c
        /* renamed from: e */
        public void mo4860e(View view, int i6) {
            LinkageScrollView.this.fling(i6);
        }

        @Override // p113n2.InterfaceC7458c
        /* renamed from: f */
        public boolean mo4861f() {
            return true;
        }

        @Override // p113n2.InterfaceC7458c
        /* renamed from: g */
        public void mo4862g() {
            LinkageScrollView.this.scrollTo(0, 0);
        }
    }

    @Override // p113n2.InterfaceC7457b
    /* renamed from: a */
    public InterfaceC7458c mo4855a() {
        return new C5934a();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i6, int i7, int i8, int i9) {
        super.onScrollChanged(i6, i7, i8, i9);
        setVerticalScrollBarEnabled(false);
        canScrollVertically(-1);
        canScrollVertically(1);
    }

    @Override // p113n2.InterfaceC7457b
    public void setChildLinkageEvent(InterfaceC7456a interfaceC7456a) {
    }
}
