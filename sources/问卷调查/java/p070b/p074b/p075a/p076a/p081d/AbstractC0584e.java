package p070b.p074b.p075a.p076a.p081d;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* renamed from: b.b.a.a.d.e */
/* loaded from: classes.dex */
public abstract class AbstractC0584e<V extends View> extends C0586g<V> {

    /* renamed from: c */
    public Runnable f3565c;

    /* renamed from: d */
    public OverScroller f3566d;

    /* renamed from: e */
    public boolean f3567e;

    /* renamed from: f */
    public int f3568f;

    /* renamed from: g */
    public int f3569g;

    /* renamed from: h */
    public int f3570h;

    /* renamed from: i */
    public VelocityTracker f3571i;

    /* JADX WARN: Field signature parse error: c
    jadx.core.utils.exceptions.JadxRuntimeException: Can't parse type: TV at position 1 ('V'), unexpected: T
    	at jadx.core.dex.nodes.parser.SignatureParser.consumeType(SignatureParser.java:169)
    	at jadx.core.dex.visitors.SignatureProcessor.parseFieldSignature(SignatureProcessor.java:161)
    	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:37)
     */
    /* renamed from: b.b.a.a.d.e$a */
    public class a implements Runnable {

        /* renamed from: b */
        public final CoordinatorLayout f3572b;

        /* renamed from: c */
        public final View f3573c;

        public a(CoordinatorLayout coordinatorLayout, V v) {
            this.f3572b = coordinatorLayout;
            this.f3573c = v;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f3573c == null || (overScroller = AbstractC0584e.this.f3566d) == null) {
                return;
            }
            if (overScroller.computeScrollOffset()) {
                AbstractC0584e abstractC0584e = AbstractC0584e.this;
                abstractC0584e.m2111G(this.f3572b, this.f3573c, abstractC0584e.f3566d.getCurrY());
                this.f3573c.postOnAnimation(this);
                return;
            }
            AbstractC0584e abstractC0584e2 = AbstractC0584e.this;
            CoordinatorLayout coordinatorLayout = this.f3572b;
            View view = this.f3573c;
            AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior) abstractC0584e2;
            Objects.requireNonNull(baseBehavior);
            AppBarLayout appBarLayout = (AppBarLayout) view;
            baseBehavior.m2606O(coordinatorLayout, appBarLayout);
            if (appBarLayout.f4779j) {
                appBarLayout.m2597c(appBarLayout.m2598d(baseBehavior.m2602K(coordinatorLayout)));
            }
        }
    }

    public AbstractC0584e() {
        this.f3568f = -1;
        this.f3570h = -1;
    }

    public AbstractC0584e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3568f = -1;
        this.f3570h = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo1663A(androidx.coordinatorlayout.widget.CoordinatorLayout r21, V r22, android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p070b.p074b.p075a.p076a.p081d.AbstractC0584e.mo1663A(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: E */
    public abstract int mo2109E();

    /* renamed from: F */
    public final int m2110F(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo2112H(coordinatorLayout, v, mo2109E() - i, i2, i3);
    }

    /* renamed from: G */
    public int m2111G(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo2112H(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* renamed from: H */
    public abstract int mo2112H(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
    /* renamed from: j */
    public boolean mo1673j(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        View view;
        int iFindPointerIndex;
        if (this.f3570h < 0) {
            this.f3570h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f3567e) {
            int i = this.f3568f;
            if (i == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y - this.f3569g) > this.f3570h) {
                this.f3569g = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f3568f = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            WeakReference<View> weakReference = ((AppBarLayout.BaseBehavior) this).f4791p;
            boolean z = (weakReference == null || ((view = weakReference.get()) != null && view.isShown() && !view.canScrollVertically(-1))) && coordinatorLayout.m1653p(v, x, y2);
            this.f3567e = z;
            if (z) {
                this.f3569g = y2;
                this.f3568f = motionEvent.getPointerId(0);
                if (this.f3571i == null) {
                    this.f3571i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f3566d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f3566d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f3571i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }
}
