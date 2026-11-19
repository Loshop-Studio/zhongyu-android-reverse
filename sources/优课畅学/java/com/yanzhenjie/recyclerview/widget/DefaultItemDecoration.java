package com.yanzhenjie.recyclerview.widget;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* loaded from: classes4.dex */
public class DefaultItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a */
    public final int f8542a;

    /* renamed from: b */
    public final int f8543b;

    /* renamed from: a */
    public final void m7323a(Canvas canvas, View view, int i10, int i11, int i12) {
        boolean zM7328f = m7328f(0, i10, i11, i12);
        boolean zM7330h = m7330h(0, i10, i11, i12);
        boolean zM7327e = m7327e(0, i10, i11, i12);
        boolean zM7329g = m7329g(0, i10, i11, i12);
        if (i11 == 1) {
            if (zM7328f && zM7329g) {
                return;
            }
            if (!zM7327e && !zM7329g) {
                throw null;
            }
            throw null;
        }
        if (zM7327e && zM7328f) {
            throw null;
        }
        if (zM7327e && zM7330h) {
            throw null;
        }
        if (zM7329g && zM7328f) {
            throw null;
        }
        if ((!zM7329g || !zM7330h) && !zM7327e && !zM7329g && !zM7328f && zM7330h) {
            throw null;
        }
        throw null;
    }

    /* renamed from: b */
    public final void m7324b(Canvas canvas, View view, int i10, int i11, int i12) {
        boolean zM7328f = m7328f(1, i10, i11, i12);
        boolean zM7330h = m7330h(1, i10, i11, i12);
        boolean zM7327e = m7327e(1, i10, i11, i12);
        boolean zM7329g = m7329g(1, i10, i11, i12);
        if (i11 == 1) {
            if (zM7328f && zM7330h) {
                return;
            }
            if (!zM7328f && !zM7330h) {
                throw null;
            }
            throw null;
        }
        if (zM7328f && zM7327e) {
            throw null;
        }
        if (zM7328f && zM7329g) {
            throw null;
        }
        if (zM7330h && zM7327e) {
            throw null;
        }
        if ((!zM7330h || !zM7329g) && !zM7328f && !zM7330h && !zM7327e && zM7329g) {
            throw null;
        }
        throw null;
    }

    /* renamed from: c */
    public final int m7325c(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).getOrientation();
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) layoutManager).getOrientation();
        }
        return 1;
    }

    /* renamed from: d */
    public final int m7326d(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).getSpanCount();
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) layoutManager).getSpanCount();
        }
        return 1;
    }

    /* renamed from: e */
    public final boolean m7327e(int i10, int i11, int i12, int i13) {
        return i10 == 1 ? i12 == 1 || i11 % i12 == 0 : i11 < i12;
    }

    /* renamed from: f */
    public final boolean m7328f(int i10, int i11, int i12, int i13) {
        return i10 == 1 ? i11 < i12 : i12 == 1 || i11 % i12 == 0;
    }

    /* renamed from: g */
    public final boolean m7329g(int i10, int i11, int i12, int i13) {
        if (i10 == 1) {
            return i12 == 1 || (i11 + 1) % i12 == 0;
        }
        if (i12 == 1) {
            return i11 + 1 == i13;
        }
        int i14 = i13 % i12;
        int i15 = ((i13 - i14) / i12) + (i14 > 0 ? 1 : 0);
        int i16 = i11 + 1;
        int i17 = i16 % i12;
        return i17 == 0 ? i15 == i16 / i12 : i15 == ((i16 - i17) / i12) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                int i10 = this.f8542a;
                int i11 = this.f8543b;
                rect.set(i10, i11, i10, i11);
                return;
            }
            return;
        }
        int iM7325c = m7325c(layoutManager);
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        int iM7326d = m7326d(layoutManager);
        int itemCount = layoutManager.getItemCount();
        if (iM7325c == 1) {
            m7332j(rect, childLayoutPosition, iM7326d, itemCount);
        } else {
            m7331i(rect, childLayoutPosition, iM7326d, itemCount);
        }
    }

    /* renamed from: h */
    public final boolean m7330h(int i10, int i11, int i12, int i13) {
        if (i10 != 1) {
            return i12 == 1 || (i11 + 1) % i12 == 0;
        }
        if (i12 == 1) {
            return i11 + 1 == i13;
        }
        int i14 = i13 % i12;
        int i15 = ((i13 - i14) / i12) + (i14 > 0 ? 1 : 0);
        int i16 = i11 + 1;
        int i17 = i16 % i12;
        return i17 == 0 ? i15 == i16 / i12 : i15 == ((i16 - i17) / i12) + 1;
    }

    /* renamed from: i */
    public final void m7331i(Rect rect, int i10, int i11, int i12) {
        boolean zM7328f = m7328f(0, i10, i11, i12);
        boolean zM7330h = m7330h(0, i10, i11, i12);
        boolean zM7327e = m7327e(0, i10, i11, i12);
        boolean zM7329g = m7329g(0, i10, i11, i12);
        if (i11 == 1) {
            if (zM7327e && zM7329g) {
                rect.set(0, 0, 0, 0);
                return;
            }
            if (zM7327e) {
                rect.set(0, 0, this.f8542a, 0);
                return;
            } else if (zM7329g) {
                rect.set(this.f8542a, 0, 0, 0);
                return;
            } else {
                int i13 = this.f8542a;
                rect.set(i13, 0, i13, 0);
                return;
            }
        }
        if (zM7327e && zM7328f) {
            rect.set(0, 0, this.f8542a, this.f8543b);
            return;
        }
        if (zM7327e && zM7330h) {
            rect.set(0, this.f8543b, this.f8542a, 0);
            return;
        }
        if (zM7329g && zM7328f) {
            rect.set(this.f8542a, 0, 0, this.f8543b);
            return;
        }
        if (zM7329g && zM7330h) {
            rect.set(this.f8542a, this.f8543b, 0, 0);
            return;
        }
        if (zM7327e) {
            int i14 = this.f8543b;
            rect.set(0, i14, this.f8542a, i14);
            return;
        }
        if (zM7329g) {
            int i15 = this.f8542a;
            int i16 = this.f8543b;
            rect.set(i15, i16, 0, i16);
        } else if (zM7328f) {
            int i17 = this.f8542a;
            rect.set(i17, 0, i17, this.f8543b);
        } else if (zM7330h) {
            int i18 = this.f8542a;
            rect.set(i18, this.f8543b, i18, 0);
        } else {
            int i19 = this.f8542a;
            int i20 = this.f8543b;
            rect.set(i19, i20, i19, i20);
        }
    }

    /* renamed from: j */
    public final void m7332j(Rect rect, int i10, int i11, int i12) {
        boolean zM7328f = m7328f(1, i10, i11, i12);
        boolean zM7330h = m7330h(1, i10, i11, i12);
        boolean zM7327e = m7327e(1, i10, i11, i12);
        boolean zM7329g = m7329g(1, i10, i11, i12);
        if (i11 == 1) {
            if (zM7328f && zM7330h) {
                rect.set(0, 0, 0, 0);
                return;
            }
            if (zM7328f) {
                rect.set(0, 0, 0, this.f8543b);
                return;
            } else if (zM7330h) {
                rect.set(0, this.f8543b, 0, 0);
                return;
            } else {
                int i13 = this.f8543b;
                rect.set(0, i13, 0, i13);
                return;
            }
        }
        if (zM7328f && zM7327e) {
            rect.set(0, 0, this.f8542a, this.f8543b);
            return;
        }
        if (zM7328f && zM7329g) {
            rect.set(this.f8542a, 0, 0, this.f8543b);
            return;
        }
        if (zM7330h && zM7327e) {
            rect.set(0, this.f8543b, this.f8542a, 0);
            return;
        }
        if (zM7330h && zM7329g) {
            rect.set(this.f8542a, this.f8543b, 0, 0);
            return;
        }
        if (zM7328f) {
            int i14 = this.f8542a;
            rect.set(i14, 0, i14, this.f8543b);
            return;
        }
        if (zM7330h) {
            int i15 = this.f8542a;
            rect.set(i15, this.f8543b, i15, 0);
            return;
        }
        if (zM7327e) {
            int i16 = this.f8543b;
            rect.set(0, i16, this.f8542a, i16);
        } else if (zM7329g) {
            int i17 = this.f8542a;
            int i18 = this.f8543b;
            rect.set(i17, i18, 0, i18);
        } else {
            int i19 = this.f8542a;
            int i20 = this.f8543b;
            rect.set(i19, i20, i19, i20);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        int iM7325c = m7325c(layoutManager);
        int iM7326d = m7326d(layoutManager);
        int childCount = layoutManager.getChildCount();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                canvas.save();
                if (childCount <= 0) {
                    canvas.restore();
                    return;
                } else {
                    layoutManager.getChildAt(0);
                    throw null;
                }
            }
            return;
        }
        canvas.save();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = layoutManager.getChildAt(i10);
            int childLayoutPosition = recyclerView.getChildLayoutPosition(childAt);
            if (iM7325c == 1) {
                m7324b(canvas, childAt, childLayoutPosition, iM7326d, childCount);
            } else {
                m7323a(canvas, childAt, childLayoutPosition, iM7326d, childCount);
            }
        }
        canvas.restore();
    }
}
