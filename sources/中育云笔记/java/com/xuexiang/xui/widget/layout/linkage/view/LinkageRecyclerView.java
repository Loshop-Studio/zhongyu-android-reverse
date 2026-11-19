package com.xuexiang.xui.widget.layout.linkage.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import p421y8.InterfaceC11917a;
import p421y8.InterfaceC11918b;
import p421y8.InterfaceC11919c;

/* loaded from: classes5.dex */
public class LinkageRecyclerView extends RecyclerView implements InterfaceC11918b {

    /* renamed from: c */
    public InterfaceC11917a f16397c;

    /* renamed from: com.xuexiang.xui.widget.layout.linkage.view.LinkageRecyclerView$a */
    public class C8170a extends RecyclerView.OnScrollListener {
        public C8170a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            super.onScrollStateChanged(recyclerView, i10);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            super.onScrolled(recyclerView, i10, i11);
            if (!LinkageRecyclerView.this.canScrollVertically(-1) && LinkageRecyclerView.this.f16397c != null) {
                LinkageRecyclerView.this.f16397c.mo12944c(LinkageRecyclerView.this);
            }
            if (!LinkageRecyclerView.this.canScrollVertically(1) && LinkageRecyclerView.this.f16397c != null) {
                LinkageRecyclerView.this.f16397c.mo12943b(LinkageRecyclerView.this);
            }
            if (LinkageRecyclerView.this.f16397c != null) {
                LinkageRecyclerView.this.f16397c.mo12942a(LinkageRecyclerView.this);
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.layout.linkage.view.LinkageRecyclerView$b */
    public class C8171b implements InterfaceC11919c {
        public C8171b() {
        }

        @Override // p421y8.InterfaceC11919c
        /* renamed from: a */
        public boolean mo12950a(int i10) {
            return LinkageRecyclerView.this.canScrollVertically(i10);
        }

        @Override // p421y8.InterfaceC11919c
        /* renamed from: b */
        public int mo12946b() {
            return LinkageRecyclerView.this.computeVerticalScrollOffset();
        }

        @Override // p421y8.InterfaceC11919c
        /* renamed from: c */
        public void mo12951c() {
            RecyclerView.Adapter adapter = LinkageRecyclerView.this.getAdapter();
            if (adapter == null || adapter.getItemCount() <= 0) {
                return;
            }
            LinkageRecyclerView.this.scrollToPosition(adapter.getItemCount() - 1);
        }

        @Override // p421y8.InterfaceC11919c
        /* renamed from: d */
        public int mo12947d() {
            return LinkageRecyclerView.this.computeVerticalScrollRange();
        }

        @Override // p421y8.InterfaceC11919c
        /* renamed from: e */
        public void mo12952e(View view, int i10) {
            LinkageRecyclerView.this.fling(0, i10);
        }

        @Override // p421y8.InterfaceC11919c
        /* renamed from: f */
        public boolean mo12948f() {
            return true;
        }

        @Override // p421y8.InterfaceC11919c
        /* renamed from: g */
        public void mo12953g() {
            LinkageRecyclerView.this.scrollToPosition(0);
        }
    }

    public LinkageRecyclerView(@NonNull Context context) {
        this(context, null);
    }

    @Override // p421y8.InterfaceC11918b
    /* renamed from: a */
    public InterfaceC11919c mo12945a() {
        return new C8171b();
    }

    @Override // p421y8.InterfaceC11918b
    public void setChildLinkageEvent(InterfaceC11917a interfaceC11917a) {
        this.f16397c = interfaceC11917a;
    }

    public LinkageRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public LinkageRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        addOnScrollListener(new C8170a());
    }
}
