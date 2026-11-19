package com.zykj.study.view.itemtouchhelper;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes5.dex */
public class ItemTouchHelper extends RecyclerView.ItemDecoration implements RecyclerView.OnChildAttachStateChangeListener {

    /* renamed from: a */
    public final List f13805a;

    /* renamed from: b */
    public final float[] f13806b;

    /* renamed from: c */
    public RecyclerView.ViewHolder f13807c;

    /* renamed from: d */
    public RecyclerView.ViewHolder f13808d;

    /* renamed from: e */
    public float f13809e;

    /* renamed from: f */
    public float f13810f;

    /* renamed from: g */
    public float f13811g;

    /* renamed from: h */
    public float f13812h;

    /* renamed from: i */
    public int f13813i;

    /* renamed from: j */
    public int f13814j;

    /* renamed from: k */
    public List f13815k;

    /* renamed from: l */
    public RecyclerView f13816l;

    /* renamed from: m */
    public VelocityTracker f13817m;

    /* renamed from: n */
    public RecyclerView.ChildDrawingOrderCallback f13818n;

    /* renamed from: o */
    public View f13819o;

    /* renamed from: p */
    public int f13820p;

    /* renamed from: q */
    public long f13821q;

    /* renamed from: com.zykj.study.view.itemtouchhelper.ItemTouchHelper$a */
    public class C8140a extends C8142c {

        /* renamed from: n */
        public final /* synthetic */ int f13822n;

        /* renamed from: o */
        public final /* synthetic */ RecyclerView.ViewHolder f13823o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8140a(RecyclerView.ViewHolder viewHolder, int i10, int i11, float f10, float f11, float f12, float f13, int i12, RecyclerView.ViewHolder viewHolder2) {
            super(viewHolder, i10, i11, f10, f11, f12, f13);
            this.f13822n = i12;
            this.f13823o = viewHolder2;
        }

        @Override // com.zykj.study.view.itemtouchhelper.ItemTouchHelper.C8142c, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f13837j) {
                return;
            }
            if (this.f13822n <= 0) {
                ItemTouchHelper.this.getClass();
                RecyclerView recyclerView = ItemTouchHelper.this.f13816l;
                throw null;
            }
            ItemTouchHelper.this.f13805a.add(this.f13823o.itemView);
            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
            itemTouchHelper.f13808d = this.f13823o;
            this.f13836i = true;
            int i10 = this.f13822n;
            if (i10 > 0) {
                itemTouchHelper.m11976b(this, i10);
            }
            ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
            View view = itemTouchHelper2.f13819o;
            View view2 = this.f13823o.itemView;
            if (view == view2) {
                itemTouchHelper2.removeChildDrawingOrderCallbackIfNecessary(view2);
            }
        }
    }

    /* renamed from: com.zykj.study.view.itemtouchhelper.ItemTouchHelper$b */
    public class RunnableC8141b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C8142c f13825a;

        /* renamed from: b */
        public final /* synthetic */ int f13826b;

        public RunnableC8141b(C8142c c8142c, int i10) {
            this.f13825a = c8142c;
            this.f13826b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = ItemTouchHelper.this.f13816l;
            if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            C8142c c8142c = this.f13825a;
            if (c8142c.f13837j || c8142c.f13832e.getAdapterPosition() == -1) {
                return;
            }
            RecyclerView.ItemAnimator itemAnimator = ItemTouchHelper.this.f13816l.getItemAnimator();
            if ((itemAnimator != null && itemAnimator.isRunning(null)) || ItemTouchHelper.this.hasRunningRecoverAnim()) {
                ItemTouchHelper.this.f13816l.post(this);
            } else {
                ItemTouchHelper.this.getClass();
                RecyclerView.ViewHolder viewHolder = this.f13825a.f13832e;
                throw null;
            }
        }
    }

    /* renamed from: com.zykj.study.view.itemtouchhelper.ItemTouchHelper$c */
    public class C8142c implements Animator.AnimatorListener {

        /* renamed from: a */
        public final float f13828a;

        /* renamed from: b */
        public final float f13829b;

        /* renamed from: c */
        public final float f13830c;

        /* renamed from: d */
        public final float f13831d;

        /* renamed from: e */
        public final RecyclerView.ViewHolder f13832e;

        /* renamed from: f */
        public final int f13833f;

        /* renamed from: g */
        public final ValueAnimator f13834g;

        /* renamed from: h */
        public final int f13835h;

        /* renamed from: i */
        public boolean f13836i;

        /* renamed from: j */
        public boolean f13837j = false;

        /* renamed from: k */
        public boolean f13838k = false;

        /* renamed from: l */
        public float f13839l;

        /* renamed from: com.zykj.study.view.itemtouchhelper.ItemTouchHelper$c$a */
        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            public final /* synthetic */ ItemTouchHelper f13841a;

            public a(ItemTouchHelper itemTouchHelper) {
                this.f13841a = itemTouchHelper;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C8142c.this.m11978b(valueAnimator.getAnimatedFraction());
            }
        }

        public C8142c(RecyclerView.ViewHolder viewHolder, int i10, int i11, float f10, float f11, float f12, float f13) {
            this.f13833f = i11;
            this.f13835h = i10;
            this.f13832e = viewHolder;
            this.f13828a = f10;
            this.f13829b = f11;
            this.f13830c = f12;
            this.f13831d = f13;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f13834g = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new a(ItemTouchHelper.this));
            valueAnimatorOfFloat.setTarget(viewHolder.itemView);
            valueAnimatorOfFloat.addListener(this);
            m11978b(0.0f);
        }

        /* renamed from: a */
        public void m11977a() {
            this.f13834g.cancel();
        }

        /* renamed from: b */
        public void m11978b(float f10) {
            this.f13839l = f10;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            m11978b(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f13838k) {
                this.f13832e.setIsRecyclable(true);
            }
            this.f13838k = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: a */
    public int m11975a(RecyclerView.ViewHolder viewHolder, boolean z10) {
        for (int size = this.f13815k.size() - 1; size >= 0; size--) {
            C8142c c8142c = (C8142c) this.f13815k.get(size);
            if (c8142c.f13832e == viewHolder) {
                c8142c.f13837j |= z10;
                if (!c8142c.f13838k) {
                    c8142c.m11977a();
                }
                this.f13815k.remove(size);
                return c8142c.f13835h;
            }
        }
        return 0;
    }

    public final void addChildDrawingOrderCallback() {
    }

    /* renamed from: b */
    public void m11976b(C8142c c8142c, int i10) {
        this.f13816l.post(new RunnableC8141b(c8142c, i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.setEmpty();
    }

    public final void getSelectedDxDy(float[] fArr) {
        if ((this.f13814j & 12) != 0) {
            fArr[0] = (this.f13811g + this.f13809e) - this.f13807c.itemView.getLeft();
        } else {
            fArr[0] = this.f13807c.itemView.getTranslationX();
        }
        if ((this.f13814j & 3) != 0) {
            fArr[1] = (this.f13812h + this.f13810f) - this.f13807c.itemView.getTop();
        } else {
            fArr[1] = this.f13807c.itemView.getTranslationY();
        }
    }

    public boolean hasRunningRecoverAnim() {
        int size = this.f13815k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((C8142c) this.f13815k.get(i10)).f13838k) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewAttachedToWindow(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewDetachedFromWindow(View view) {
        removeChildDrawingOrderCallbackIfNecessary(view);
        RecyclerView.ViewHolder childViewHolder = this.f13816l.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        RecyclerView.ViewHolder viewHolder = this.f13807c;
        if (viewHolder != null && childViewHolder == viewHolder) {
            select(null, 0);
            return;
        }
        m11975a(childViewHolder, false);
        if (this.f13805a.remove(childViewHolder.itemView)) {
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        this.f13820p = -1;
        if (this.f13807c != null) {
            getSelectedDxDy(this.f13806b);
            float[] fArr = this.f13806b;
            float f10 = fArr[0];
            float f11 = fArr[1];
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (this.f13807c != null) {
            getSelectedDxDy(this.f13806b);
            float[] fArr = this.f13806b;
            float f10 = fArr[0];
            float f11 = fArr[1];
        }
        throw null;
    }

    public final void releaseVelocityTracker() {
        VelocityTracker velocityTracker = this.f13817m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f13817m = null;
        }
    }

    public void removeChildDrawingOrderCallbackIfNecessary(View view) {
        if (view == this.f13819o) {
            this.f13819o = null;
            if (this.f13818n != null) {
                this.f13816l.setChildDrawingOrderCallback(null);
            }
        }
    }

    public void select(RecyclerView.ViewHolder viewHolder, int i10) {
        float fSignum;
        if (viewHolder == this.f13807c && i10 == this.f13813i) {
            return;
        }
        this.f13821q = Long.MIN_VALUE;
        int i11 = this.f13813i;
        m11975a(viewHolder, true);
        this.f13813i = i10;
        int i12 = 2;
        if (i10 == 2) {
            this.f13819o = viewHolder.itemView;
            addChildDrawingOrderCallback();
        }
        RecyclerView.ViewHolder viewHolder2 = this.f13807c;
        if (viewHolder2 == null) {
            if (viewHolder != null) {
                throw null;
            }
            ViewParent parent = this.f13816l.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(this.f13807c != null);
            }
            this.f13816l.getLayoutManager().requestSimpleAnimationsInNextLayout();
            throw null;
        }
        if (viewHolder2.itemView.getParent() == null) {
            removeChildDrawingOrderCallbackIfNecessary(viewHolder2.itemView);
            throw null;
        }
        int iSwipeIfNecessary = i11 == 2 ? 0 : swipeIfNecessary(viewHolder2);
        releaseVelocityTracker();
        float fSignum2 = 0.0f;
        if (iSwipeIfNecessary == 1 || iSwipeIfNecessary == 2) {
            fSignum = Math.signum(this.f13810f) * this.f13816l.getHeight();
        } else if (iSwipeIfNecessary == 4 || iSwipeIfNecessary == 8 || iSwipeIfNecessary == 16 || iSwipeIfNecessary == 32) {
            fSignum = 0.0f;
            fSignum2 = Math.signum(this.f13809e) * this.f13816l.getWidth();
        } else {
            fSignum = 0.0f;
        }
        if (i11 == 2) {
            i12 = 8;
        } else if (iSwipeIfNecessary <= 0) {
            i12 = 4;
        }
        getSelectedDxDy(this.f13806b);
        float[] fArr = this.f13806b;
        new C8140a(viewHolder2, i12, i11, fArr[0], fArr[1], fSignum2, fSignum, iSwipeIfNecessary, viewHolder2);
        throw null;
    }

    public final int swipeIfNecessary(RecyclerView.ViewHolder viewHolder) {
        if (this.f13813i == 2) {
            return 0;
        }
        throw null;
    }
}
