package com.xuexiang.xui.widget.layout.linkage.view;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import p033c4.InterfaceC5225a;
import p033c4.InterfaceC5226b;
import p033c4.InterfaceC5227c;

/* loaded from: classes4.dex */
public class LinkageScrollView extends NestedScrollView implements InterfaceC5226b {

    /* renamed from: com.xuexiang.xui.widget.layout.linkage.view.LinkageScrollView$a */
    public class C6875a implements InterfaceC5227c {
        public C6875a() {
        }

        @Override // p033c4.InterfaceC5227c
        /* renamed from: a */
        public boolean mo2338a(int i9) {
            return LinkageScrollView.this.canScrollVertically(i9);
        }

        @Override // p033c4.InterfaceC5227c
        /* renamed from: b */
        public int mo2339b() {
            return LinkageScrollView.this.computeVerticalScrollOffset();
        }

        @Override // p033c4.InterfaceC5227c
        /* renamed from: c */
        public void mo2340c() {
            LinkageScrollView.this.scrollTo(0, mo2341d());
        }

        @Override // p033c4.InterfaceC5227c
        /* renamed from: d */
        public int mo2341d() {
            return LinkageScrollView.this.computeVerticalScrollRange();
        }

        @Override // p033c4.InterfaceC5227c
        /* renamed from: e */
        public void mo2342e(View view, int i9) {
            LinkageScrollView.this.fling(i9);
        }

        @Override // p033c4.InterfaceC5227c
        /* renamed from: f */
        public boolean mo2343f() {
            return true;
        }

        @Override // p033c4.InterfaceC5227c
        /* renamed from: g */
        public void mo2344g() {
            LinkageScrollView.this.scrollTo(0, 0);
        }
    }

    @Override // p033c4.InterfaceC5226b
    /* renamed from: a */
    public InterfaceC5227c mo2337a() {
        return new C6875a();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i9, int i10, int i11, int i12) {
        super.onScrollChanged(i9, i10, i11, i12);
        setVerticalScrollBarEnabled(false);
        canScrollVertically(-1);
        canScrollVertically(1);
    }

    @Override // p033c4.InterfaceC5226b
    public void setChildLinkageEvent(InterfaceC5225a interfaceC5225a) {
    }
}
