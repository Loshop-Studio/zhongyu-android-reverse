package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.j */
/* loaded from: classes.dex */
public abstract class AbstractC0596j {

    /* renamed from: a */
    protected final RecyclerView.AbstractC0570o f3876a;

    /* renamed from: b */
    private int f3877b;

    /* renamed from: c */
    final Rect f3878c;

    /* renamed from: androidx.recyclerview.widget.j$a */
    static class a extends AbstractC0596j {
        a(RecyclerView.AbstractC0570o abstractC0570o) {
            super(abstractC0570o, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC0596j
        /* renamed from: d */
        public int mo3395d(View view) {
            return this.f3876a.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0596j
        /* renamed from: e */
        public int mo3396e(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f3876a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0596j
        /* renamed from: f */
        public int mo3397f(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f3876a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0596j
        /* renamed from: g */
        public int mo3398g(View view) {
            return this.f3876a.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0596j
        /* renamed from: h */
        public int mo3399h() {
            return this.f3876a.getWidth();
        }

        @Override // androidx.recyclerview.widget.AbstractC0596j
        /* renamed from: i */
        public int mo3400i() {
            return this.f3876a.getWidth() - this.f3876a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.AbstractC0596j
        /* renamed from: j */
        public int mo3401j() {
            return this.f3876a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.AbstractC0596j
        /* renamed from: k */
        public int mo3402k() {
            return this.f3876a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.AbstractC0596j
        /* renamed from: l */
        public int mo3403l() {
            return this.f3876a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.AbstractC0596j
        /* renamed from: m */
        public int mo3404m() {
            return this.f3876a.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.AbstractC0596j
        /* renamed from: n */
        public int mo3405n() {
            return (this.f3876a.getWidth() - this.f3876a.getPaddingLeft()) - this.f3876a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.AbstractC0596j
        /* renamed from: p */
        public int mo3407p(View view) {
            this.f3876a.getTransformedBoundingBox(view, true, this.f3878c);
            return this.f3878c.right;
        }

        @Override // androidx.recyclerview.widget.AbstractC0596j
        /* renamed from: q */
        public int mo3408q(View view) {
            this.f3876a.getTransformedBoundingBox(view, true, this.f3878c);
            return this.f3878c.left;
        }

        @Override // androidx.recyclerview.widget.AbstractC0596j
        /* renamed from: r */
        public void mo3409r(int i4) {
            this.f3876a.offsetChildrenHorizontal(i4);
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$b */
    static class b extends AbstractC0596j {
        b(RecyclerView.AbstractC0570o abstractC0570o) {
            super(abstractC0570o, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC0596j
        /* renamed from: d */
        public int mo3395d(View view) {
            return this.f3876a.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0596j
        /* renamed from: e */
        public int mo3396e(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f3876a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0596j
        /* renamed from: f */
        public int mo3397f(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f3876a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0596j
        /* renamed from: g */
        public int mo3398g(View view) {
            return this.f3876a.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0596j
        /* renamed from: h */
        public int mo3399h() {
            return this.f3876a.getHeight();
        }

        @Override // androidx.recyclerview.widget.AbstractC0596j
        /* renamed from: i */
        public int mo3400i() {
            return this.f3876a.getHeight() - this.f3876a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.AbstractC0596j
        /* renamed from: j */
        public int mo3401j() {
            return this.f3876a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.AbstractC0596j
        /* renamed from: k */
        public int mo3402k() {
            return this.f3876a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.AbstractC0596j
        /* renamed from: l */
        public int mo3403l() {
            return this.f3876a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.AbstractC0596j
        /* renamed from: m */
        public int mo3404m() {
            return this.f3876a.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.AbstractC0596j
        /* renamed from: n */
        public int mo3405n() {
            return (this.f3876a.getHeight() - this.f3876a.getPaddingTop()) - this.f3876a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.AbstractC0596j
        /* renamed from: p */
        public int mo3407p(View view) {
            this.f3876a.getTransformedBoundingBox(view, true, this.f3878c);
            return this.f3878c.bottom;
        }

        @Override // androidx.recyclerview.widget.AbstractC0596j
        /* renamed from: q */
        public int mo3408q(View view) {
            this.f3876a.getTransformedBoundingBox(view, true, this.f3878c);
            return this.f3878c.top;
        }

        @Override // androidx.recyclerview.widget.AbstractC0596j
        /* renamed from: r */
        public void mo3409r(int i4) {
            this.f3876a.offsetChildrenVertical(i4);
        }
    }

    /* synthetic */ AbstractC0596j(RecyclerView.AbstractC0570o abstractC0570o, a aVar) {
        this(abstractC0570o);
    }

    /* renamed from: a */
    public static AbstractC0596j m3392a(RecyclerView.AbstractC0570o abstractC0570o) {
        return new a(abstractC0570o);
    }

    /* renamed from: b */
    public static AbstractC0596j m3393b(RecyclerView.AbstractC0570o abstractC0570o, int i4) {
        if (i4 == 0) {
            return m3392a(abstractC0570o);
        }
        if (i4 == 1) {
            return m3394c(abstractC0570o);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: c */
    public static AbstractC0596j m3394c(RecyclerView.AbstractC0570o abstractC0570o) {
        return new b(abstractC0570o);
    }

    /* renamed from: d */
    public abstract int mo3395d(View view);

    /* renamed from: e */
    public abstract int mo3396e(View view);

    /* renamed from: f */
    public abstract int mo3397f(View view);

    /* renamed from: g */
    public abstract int mo3398g(View view);

    /* renamed from: h */
    public abstract int mo3399h();

    /* renamed from: i */
    public abstract int mo3400i();

    /* renamed from: j */
    public abstract int mo3401j();

    /* renamed from: k */
    public abstract int mo3402k();

    /* renamed from: l */
    public abstract int mo3403l();

    /* renamed from: m */
    public abstract int mo3404m();

    /* renamed from: n */
    public abstract int mo3405n();

    /* renamed from: o */
    public int m3406o() {
        if (Integer.MIN_VALUE == this.f3877b) {
            return 0;
        }
        return mo3405n() - this.f3877b;
    }

    /* renamed from: p */
    public abstract int mo3407p(View view);

    /* renamed from: q */
    public abstract int mo3408q(View view);

    /* renamed from: r */
    public abstract void mo3409r(int i4);

    /* renamed from: s */
    public void m3410s() {
        this.f3877b = mo3405n();
    }

    private AbstractC0596j(RecyclerView.AbstractC0570o abstractC0570o) {
        this.f3877b = Integer.MIN_VALUE;
        this.f3878c = new Rect();
        this.f3876a = abstractC0570o;
    }
}
