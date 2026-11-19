package com.luck.picture.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p304q6.InterfaceC10749i;
import p304q6.InterfaceC10750j;
import p304q6.InterfaceC10751k;

/* loaded from: classes5.dex */
public class RecyclerPreloadView extends RecyclerView {

    /* renamed from: c */
    public boolean f12620c;

    /* renamed from: d */
    public boolean f12621d;

    /* renamed from: e */
    public int f12622e;

    /* renamed from: f */
    public int f12623f;

    /* renamed from: g */
    public int f12624g;

    /* renamed from: h */
    public InterfaceC10749i f12625h;

    /* renamed from: i */
    public InterfaceC10751k f12626i;

    /* renamed from: j */
    public InterfaceC10750j f12627j;

    public RecyclerPreloadView(@NonNull Context context) {
        super(context);
        this.f12620c = false;
        this.f12621d = false;
        this.f12624g = 1;
    }

    private void setLayoutManagerPosition(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            this.f12622e = gridLayoutManager.findFirstVisibleItemPosition();
            this.f12623f = gridLayoutManager.findLastVisibleItemPosition();
        } else if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            this.f12622e = linearLayoutManager.findFirstVisibleItemPosition();
            this.f12623f = linearLayoutManager.findLastVisibleItemPosition();
        }
    }

    /* renamed from: b */
    public boolean m9623b() {
        return this.f12621d;
    }

    public int getFirstVisiblePosition() {
        return this.f12622e;
    }

    public int getLastVisiblePosition() {
        return this.f12623f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i10) {
        InterfaceC10751k interfaceC10751k;
        super.onScrollStateChanged(i10);
        if (i10 == 0 || i10 == 1) {
            setLayoutManagerPosition(getLayoutManager());
        }
        InterfaceC10750j interfaceC10750j = this.f12627j;
        if (interfaceC10750j != null) {
            interfaceC10750j.mo8999a(i10);
        }
        if (i10 != 0 || (interfaceC10751k = this.f12626i) == null) {
            return;
        }
        interfaceC10751k.mo8997a();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    @Override // androidx.recyclerview.widget.RecyclerView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onScrolled(int r5, int r6) {
        /*
            r4 = this;
            super.onScrolled(r5, r6)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r4.getLayoutManager()
            if (r0 == 0) goto L76
            r4.setLayoutManagerPosition(r0)
            q6.i r1 = r4.f12625h
            if (r1 == 0) goto L57
            boolean r1 = r4.f12621d
            if (r1 == 0) goto L57
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = r4.getAdapter()
            if (r1 == 0) goto L4f
            boolean r2 = r0 instanceof androidx.recyclerview.widget.GridLayoutManager
            r3 = 0
            if (r2 == 0) goto L4c
            androidx.recyclerview.widget.GridLayoutManager r0 = (androidx.recyclerview.widget.GridLayoutManager) r0
            int r1 = r1.getItemCount()
            int r2 = r0.getSpanCount()
            int r1 = r1 / r2
            int r2 = r0.findLastVisibleItemPosition()
            int r0 = r0.getSpanCount()
            int r2 = r2 / r0
            int r0 = r4.f12624g
            int r1 = r1 - r0
            if (r2 < r1) goto L4c
            boolean r0 = r4.f12620c
            if (r0 != 0) goto L47
            q6.i r0 = r4.f12625h
            r0.mo8973h()
            if (r6 <= 0) goto L57
            r0 = 1
            r4.f12620c = r0
            goto L57
        L47:
            if (r6 != 0) goto L57
            r4.f12620c = r3
            goto L57
        L4c:
            r4.f12620c = r3
            goto L57
        L4f:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r6 = "Adapter is null,Please check it!"
            r5.<init>(r6)
            throw r5
        L57:
            q6.j r0 = r4.f12627j
            if (r0 == 0) goto L5e
            r0.mo9000b(r5, r6)
        L5e:
            q6.k r5 = r4.f12626i
            if (r5 == 0) goto L75
            int r5 = java.lang.Math.abs(r6)
            r6 = 150(0x96, float:2.1E-43)
            if (r5 >= r6) goto L70
            q6.k r5 = r4.f12626i
            r5.mo8997a()
            return
        L70:
            q6.k r5 = r4.f12626i
            r5.mo8998b()
        L75:
            return
        L76:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r6 = "LayoutManager is null,Please check it!"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.widget.RecyclerPreloadView.onScrolled(int, int):void");
    }

    public void setEnabledLoadMore(boolean z10) {
        this.f12621d = z10;
    }

    public void setLastVisiblePosition(int i10) {
        this.f12623f = i10;
    }

    public void setOnRecyclerViewPreloadListener(InterfaceC10749i interfaceC10749i) {
        this.f12625h = interfaceC10749i;
    }

    public void setOnRecyclerViewScrollListener(InterfaceC10750j interfaceC10750j) {
        this.f12627j = interfaceC10750j;
    }

    public void setOnRecyclerViewScrollStateListener(InterfaceC10751k interfaceC10751k) {
        this.f12626i = interfaceC10751k;
    }

    public void setReachBottomRow(int i10) {
        if (i10 < 1) {
            i10 = 1;
        }
        this.f12624g = i10;
    }

    public RecyclerPreloadView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12620c = false;
        this.f12621d = false;
        this.f12624g = 1;
    }

    public RecyclerPreloadView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12620c = false;
        this.f12621d = false;
        this.f12624g = 1;
    }
}
