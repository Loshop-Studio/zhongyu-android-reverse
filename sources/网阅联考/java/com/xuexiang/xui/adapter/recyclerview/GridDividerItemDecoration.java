package com.xuexiang.xui.adapter.recyclerview;

import android.R;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* loaded from: classes2.dex */
public class GridDividerItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: e */
    public static final int[] f3095e = {R.attr.listDivider};

    /* renamed from: a */
    public Drawable f3096a;

    /* renamed from: b */
    public int f3097b;

    /* renamed from: c */
    public int f3098c;

    /* renamed from: d */
    public Paint f3099d;

    /* renamed from: a */
    public final boolean m4039a(RecyclerView recyclerView, int i4, int i5, int i6) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof GridLayoutManager)) {
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                return ((StaggeredGridLayoutManager) layoutManager).getOrientation() == 1 ? i4 >= i6 - (i6 % i5) : (i4 + 1) % i5 == 0;
            }
            return false;
        }
        int i7 = i6 % i5;
        int i8 = i6 / i5;
        if (i7 != 0) {
            i8++;
        }
        return i8 == (i4 / i5) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        if (recyclerView.getAdapter() == null) {
            if ((childLayoutPosition + 1) % this.f3097b <= 0) {
                rect.set(0, 0, 0, this.f3098c);
                return;
            } else {
                int i4 = this.f3098c;
                rect.set(0, 0, i4, i4);
                return;
            }
        }
        boolean zM4039a = m4039a(recyclerView, childLayoutPosition, this.f3097b, recyclerView.getAdapter().getItemCount());
        int i5 = this.f3097b;
        int i6 = this.f3098c;
        int i7 = ((i5 - 1) * i6) / i5;
        int i8 = (childLayoutPosition % i5) * (i6 - i7);
        int i9 = i7 - i8;
        if (zM4039a) {
            rect.set(i8, 0, i9, 0);
        } else {
            rect.set(i8, 0, i9, i6);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
        int childCount = recyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            int childLayoutPosition = (recyclerView.getChildLayoutPosition(childAt) + 1) % 3;
            if (childLayoutPosition == 0) {
                childLayoutPosition = this.f3097b;
            }
            int i5 = childLayoutPosition;
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + Math.round(ViewCompat.getTranslationY(childAt));
            int i6 = bottom + this.f3098c;
            int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + Math.round(ViewCompat.getTranslationX(childAt));
            int i7 = right + this.f3098c;
            if (this.f3099d != null) {
                this.f3096a.setBounds(childAt.getLeft(), bottom, i7, i6);
                this.f3096a.draw(canvas);
            }
            if (this.f3099d != null) {
                canvas.drawRect(childAt.getLeft(), bottom, i7, i6, this.f3099d);
            }
            if (i5 < this.f3097b) {
                if (this.f3099d != null) {
                    this.f3096a.setBounds(right, childAt.getTop(), i7, i6);
                    this.f3096a.draw(canvas);
                }
                if (this.f3099d != null) {
                    canvas.drawRect(right, childAt.getTop(), i7, i6, this.f3099d);
                }
            }
        }
    }
}
