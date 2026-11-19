package com.xuexiang.xui.widget.layout.linkage.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import p421y8.InterfaceC11917a;
import p421y8.InterfaceC11918b;
import p421y8.InterfaceC11919c;

/* loaded from: classes5.dex */
public class LinkageScrollView extends NestedScrollView implements InterfaceC11918b {

    /* renamed from: c */
    public InterfaceC11917a f16400c;

    /* renamed from: com.xuexiang.xui.widget.layout.linkage.view.LinkageScrollView$a */
    public class C8172a implements InterfaceC11919c {
        public C8172a() {
        }

        @Override // p421y8.InterfaceC11919c
        /* renamed from: a */
        public boolean mo12950a(int i10) {
            return LinkageScrollView.this.canScrollVertically(i10);
        }

        @Override // p421y8.InterfaceC11919c
        /* renamed from: b */
        public int mo12946b() {
            return LinkageScrollView.this.computeVerticalScrollOffset();
        }

        @Override // p421y8.InterfaceC11919c
        /* renamed from: c */
        public void mo12951c() {
            LinkageScrollView.this.scrollTo(0, mo12947d());
        }

        @Override // p421y8.InterfaceC11919c
        /* renamed from: d */
        public int mo12947d() {
            return LinkageScrollView.this.computeVerticalScrollRange();
        }

        @Override // p421y8.InterfaceC11919c
        /* renamed from: e */
        public void mo12952e(View view, int i10) {
            LinkageScrollView.this.fling(i10);
        }

        @Override // p421y8.InterfaceC11919c
        /* renamed from: f */
        public boolean mo12948f() {
            return true;
        }

        @Override // p421y8.InterfaceC11919c
        /* renamed from: g */
        public void mo12953g() {
            LinkageScrollView.this.scrollTo(0, 0);
        }
    }

    public LinkageScrollView(Context context) {
        this(context, null);
    }

    @Override // p421y8.InterfaceC11918b
    /* renamed from: a */
    public InterfaceC11919c mo12945a() {
        return new C8172a();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        InterfaceC11917a interfaceC11917a;
        InterfaceC11917a interfaceC11917a2;
        super.onScrollChanged(i10, i11, i12, i13);
        setVerticalScrollBarEnabled(false);
        if (!canScrollVertically(-1) && (interfaceC11917a2 = this.f16400c) != null) {
            interfaceC11917a2.mo12944c(this);
        }
        if (!canScrollVertically(1) && (interfaceC11917a = this.f16400c) != null) {
            interfaceC11917a.mo12943b(this);
        }
        InterfaceC11917a interfaceC11917a3 = this.f16400c;
        if (interfaceC11917a3 != null) {
            interfaceC11917a3.mo12942a(this);
        }
    }

    @Override // p421y8.InterfaceC11918b
    public void setChildLinkageEvent(InterfaceC11917a interfaceC11917a) {
        this.f16400c = interfaceC11917a;
        if (interfaceC11917a != null) {
            interfaceC11917a.mo12942a(this);
        }
    }

    public LinkageScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinkageScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
