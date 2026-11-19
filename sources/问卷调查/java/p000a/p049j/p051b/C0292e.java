package p000a.p049j.p051b;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.j.b.e */
/* loaded from: classes.dex */
public class C0292e {

    /* renamed from: v */
    public static final Interpolator f1737v = new a();

    /* renamed from: a */
    public int f1738a;

    /* renamed from: b */
    public int f1739b;

    /* renamed from: d */
    public float[] f1741d;

    /* renamed from: e */
    public float[] f1742e;

    /* renamed from: f */
    public float[] f1743f;

    /* renamed from: g */
    public float[] f1744g;

    /* renamed from: h */
    public int[] f1745h;

    /* renamed from: i */
    public int[] f1746i;

    /* renamed from: j */
    public int[] f1747j;

    /* renamed from: k */
    public int f1748k;

    /* renamed from: l */
    public VelocityTracker f1749l;

    /* renamed from: m */
    public float f1750m;

    /* renamed from: n */
    public float f1751n;

    /* renamed from: o */
    public int f1752o;

    /* renamed from: p */
    public OverScroller f1753p;

    /* renamed from: q */
    public final c f1754q;

    /* renamed from: r */
    public View f1755r;

    /* renamed from: s */
    public boolean f1756s;

    /* renamed from: t */
    public final ViewGroup f1757t;

    /* renamed from: c */
    public int f1740c = -1;

    /* renamed from: u */
    public final Runnable f1758u = new b();

    /* renamed from: a.j.b.e$a */
    public static class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    /* renamed from: a.j.b.e$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0292e.this.m960s(0);
        }
    }

    /* renamed from: a.j.b.e$c */
    public static abstract class c {
        /* renamed from: a */
        public abstract int mo964a(View view, int i, int i2);

        /* renamed from: b */
        public abstract int mo965b(View view, int i, int i2);

        /* renamed from: c */
        public int mo966c(View view) {
            return 0;
        }

        /* renamed from: d */
        public int mo967d(View view) {
            return 0;
        }

        /* renamed from: e */
        public void mo968e(View view, int i) {
        }

        /* renamed from: f */
        public abstract void mo969f(int i);

        /* renamed from: g */
        public abstract void mo970g(View view, int i, int i2, int i3, int i4);

        /* renamed from: h */
        public abstract void mo971h(View view, float f2, float f3);

        /* renamed from: i */
        public abstract boolean mo972i(View view, int i);
    }

    public C0292e(Context context, ViewGroup viewGroup, c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f1757t = viewGroup;
        this.f1754q = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1752o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f1739b = viewConfiguration.getScaledTouchSlop();
        this.f1750m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1751n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1753p = new OverScroller(context, f1737v);
    }

    /* renamed from: a */
    public void m942a() {
        this.f1740c = -1;
        float[] fArr = this.f1741d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f1742e, 0.0f);
            Arrays.fill(this.f1743f, 0.0f);
            Arrays.fill(this.f1744g, 0.0f);
            Arrays.fill(this.f1745h, 0);
            Arrays.fill(this.f1746i, 0);
            Arrays.fill(this.f1747j, 0);
            this.f1748k = 0;
        }
        VelocityTracker velocityTracker = this.f1749l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1749l = null;
        }
    }

    /* renamed from: b */
    public void m943b(View view, int i) {
        if (view.getParent() != this.f1757t) {
            StringBuilder sbM2079g = C0561a.m2079g("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
            sbM2079g.append(this.f1757t);
            sbM2079g.append(")");
            throw new IllegalArgumentException(sbM2079g.toString());
        }
        this.f1755r = view;
        this.f1740c = i;
        this.f1754q.mo968e(view, i);
        m960s(1);
    }

    /* renamed from: c */
    public final boolean m944c(float f2, float f3, int i, int i2) {
        float fAbs = Math.abs(f2);
        float fAbs2 = Math.abs(f3);
        if ((this.f1745h[i] & i2) != i2 || (0 & i2) == 0 || (this.f1747j[i] & i2) == i2 || (this.f1746i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f1739b;
        if (fAbs <= i3 && fAbs2 <= i3) {
            return false;
        }
        if (fAbs < fAbs2 * 0.5f) {
            Objects.requireNonNull(this.f1754q);
        }
        return (this.f1746i[i] & i2) == 0 && fAbs > ((float) this.f1739b);
    }

    /* renamed from: d */
    public final boolean m945d(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        boolean z = this.f1754q.mo966c(view) > 0;
        boolean z2 = this.f1754q.mo967d(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f2) > ((float) this.f1739b) : z2 && Math.abs(f3) > ((float) this.f1739b);
        }
        float f4 = (f3 * f3) + (f2 * f2);
        int i = this.f1739b;
        return f4 > ((float) (i * i));
    }

    /* renamed from: e */
    public final float m946e(float f2, float f3, float f4) {
        float fAbs = Math.abs(f2);
        if (fAbs < f3) {
            return 0.0f;
        }
        return fAbs > f4 ? f2 > 0.0f ? f4 : -f4 : f2;
    }

    /* renamed from: f */
    public final int m947f(int i, int i2, int i3) {
        int iAbs = Math.abs(i);
        if (iAbs < i2) {
            return 0;
        }
        return iAbs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    /* renamed from: g */
    public final void m948g(int i) {
        float[] fArr = this.f1741d;
        if (fArr != null) {
            int i2 = this.f1748k;
            int i3 = 1 << i;
            if ((i3 & i2) != 0) {
                fArr[i] = 0.0f;
                this.f1742e[i] = 0.0f;
                this.f1743f[i] = 0.0f;
                this.f1744g[i] = 0.0f;
                this.f1745h[i] = 0;
                this.f1746i[i] = 0;
                this.f1747j[i] = 0;
                this.f1748k = (~i3) & i2;
            }
        }
    }

    /* renamed from: h */
    public final int m949h(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        float width = this.f1757t.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    /* renamed from: i */
    public boolean m950i(boolean z) {
        if (this.f1738a == 2) {
            boolean zComputeScrollOffset = this.f1753p.computeScrollOffset();
            int currX = this.f1753p.getCurrX();
            int currY = this.f1753p.getCurrY();
            int left = currX - this.f1755r.getLeft();
            int top = currY - this.f1755r.getTop();
            if (left != 0) {
                View view = this.f1755r;
                WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f1755r;
                WeakHashMap<View, C0273v> weakHashMap2 = C0266o.f1616a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f1754q.mo970g(this.f1755r, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f1753p.getFinalX() && currY == this.f1753p.getFinalY()) {
                this.f1753p.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z) {
                    this.f1757t.post(this.f1758u);
                } else {
                    m960s(0);
                }
            }
        }
        return this.f1738a == 2;
    }

    /* renamed from: j */
    public final void m951j(float f2, float f3) {
        this.f1756s = true;
        this.f1754q.mo971h(this.f1755r, f2, f3);
        this.f1756s = false;
        if (this.f1738a == 1) {
            m960s(0);
        }
    }

    /* renamed from: k */
    public View m952k(int i, int i2) {
        for (int childCount = this.f1757t.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f1757t;
            Objects.requireNonNull(this.f1754q);
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: l */
    public final boolean m953l(int i, int i2, int i3, int i4) {
        float f2;
        float f3;
        float f4;
        float f5;
        int left = this.f1755r.getLeft();
        int top = this.f1755r.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f1753p.abortAnimation();
            m960s(0);
            return false;
        }
        View view = this.f1755r;
        int iM947f = m947f(i3, (int) this.f1751n, (int) this.f1750m);
        int iM947f2 = m947f(i4, (int) this.f1751n, (int) this.f1750m);
        int iAbs = Math.abs(i5);
        int iAbs2 = Math.abs(i6);
        int iAbs3 = Math.abs(iM947f);
        int iAbs4 = Math.abs(iM947f2);
        int i7 = iAbs3 + iAbs4;
        int i8 = iAbs + iAbs2;
        if (iM947f != 0) {
            f2 = iAbs3;
            f3 = i7;
        } else {
            f2 = iAbs;
            f3 = i8;
        }
        float f6 = f2 / f3;
        if (iM947f2 != 0) {
            f4 = iAbs4;
            f5 = i7;
        } else {
            f4 = iAbs2;
            f5 = i8;
        }
        int iM949h = m949h(i5, iM947f, this.f1754q.mo966c(view));
        this.f1753p.startScroll(left, top, i5, i6, (int) ((m949h(i6, iM947f2, this.f1754q.mo967d(view)) * (f4 / f5)) + (iM949h * f6)));
        m960s(2);
        return true;
    }

    /* renamed from: m */
    public final boolean m954m(int i) {
        if ((this.f1748k & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: n */
    public void m955n(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m942a();
        }
        if (this.f1749l == null) {
            this.f1749l = VelocityTracker.obtain();
        }
        this.f1749l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f1738a != 1) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (i2 < pointerCount) {
                            int pointerId = motionEvent.getPointerId(i2);
                            if (m954m(pointerId)) {
                                float x = motionEvent.getX(i2);
                                float y = motionEvent.getY(i2);
                                float f2 = x - this.f1741d[pointerId];
                                float f3 = y - this.f1742e[pointerId];
                                m957p(f2, f3, pointerId);
                                if (this.f1738a != 1) {
                                    View viewM952k = m952k((int) x, (int) y);
                                    if (m945d(viewM952k, f2, f3) && m963v(viewM952k, pointerId)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i2++;
                        }
                    } else {
                        if (!m954m(this.f1740c)) {
                            return;
                        }
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.f1740c);
                        float x2 = motionEvent.getX(iFindPointerIndex);
                        float y2 = motionEvent.getY(iFindPointerIndex);
                        float[] fArr = this.f1743f;
                        int i3 = this.f1740c;
                        int i4 = (int) (x2 - fArr[i3]);
                        int i5 = (int) (y2 - this.f1744g[i3]);
                        int left = this.f1755r.getLeft() + i4;
                        int top = this.f1755r.getTop() + i5;
                        int left2 = this.f1755r.getLeft();
                        int top2 = this.f1755r.getTop();
                        if (i4 != 0) {
                            left = this.f1754q.mo964a(this.f1755r, left, i4);
                            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                            this.f1755r.offsetLeftAndRight(left - left2);
                        }
                        int i6 = left;
                        if (i5 != 0) {
                            top = this.f1754q.mo965b(this.f1755r, top, i5);
                            WeakHashMap<View, C0273v> weakHashMap2 = C0266o.f1616a;
                            this.f1755r.offsetTopAndBottom(top - top2);
                        }
                        int i7 = top;
                        if (i4 != 0 || i5 != 0) {
                            this.f1754q.mo970g(this.f1755r, i6, i7, i6 - left2, i7 - top2);
                        }
                    }
                    m959r(motionEvent);
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 5) {
                        if (actionMasked != 6) {
                            return;
                        }
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        if (this.f1738a == 1 && pointerId2 == this.f1740c) {
                            int pointerCount2 = motionEvent.getPointerCount();
                            while (true) {
                                if (i2 >= pointerCount2) {
                                    i = -1;
                                    break;
                                }
                                int pointerId3 = motionEvent.getPointerId(i2);
                                if (pointerId3 != this.f1740c) {
                                    View viewM952k2 = m952k((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                    View view = this.f1755r;
                                    if (viewM952k2 == view && m963v(view, pointerId3)) {
                                        i = this.f1740c;
                                        break;
                                    }
                                }
                                i2++;
                            }
                            if (i == -1) {
                                m956o();
                            }
                        }
                        m948g(pointerId2);
                        return;
                    }
                    int pointerId4 = motionEvent.getPointerId(actionIndex);
                    float x3 = motionEvent.getX(actionIndex);
                    float y3 = motionEvent.getY(actionIndex);
                    m958q(x3, y3, pointerId4);
                    if (this.f1738a != 0) {
                        int i8 = (int) x3;
                        int i9 = (int) y3;
                        View view2 = this.f1755r;
                        if (view2 != null && i8 >= view2.getLeft() && i8 < view2.getRight() && i9 >= view2.getTop() && i9 < view2.getBottom()) {
                            i2 = 1;
                        }
                        if (i2 != 0) {
                            m963v(this.f1755r, pointerId4);
                            return;
                        }
                        return;
                    }
                    m963v(m952k((int) x3, (int) y3), pointerId4);
                    if ((this.f1745h[pointerId4] & 0) == 0) {
                        return;
                    }
                } else if (this.f1738a == 1) {
                    m951j(0.0f, 0.0f);
                }
            } else if (this.f1738a == 1) {
                m956o();
            }
            m942a();
            return;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View viewM952k3 = m952k((int) x4, (int) y4);
        m958q(x4, y4, pointerId5);
        m963v(viewM952k3, pointerId5);
        if ((this.f1745h[pointerId5] & 0) == 0) {
            return;
        }
        Objects.requireNonNull(this.f1754q);
    }

    /* renamed from: o */
    public final void m956o() {
        this.f1749l.computeCurrentVelocity(1000, this.f1750m);
        m951j(m946e(this.f1749l.getXVelocity(this.f1740c), this.f1751n, this.f1750m), m946e(this.f1749l.getYVelocity(this.f1740c), this.f1751n, this.f1750m));
    }

    /* renamed from: p */
    public final void m957p(float f2, float f3, int i) {
        int i2 = m944c(f2, f3, i, 1) ? 1 : 0;
        if (m944c(f3, f2, i, 4)) {
            i2 |= 4;
        }
        if (m944c(f2, f3, i, 2)) {
            i2 |= 2;
        }
        if (m944c(f3, f2, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f1746i;
            iArr[i] = iArr[i] | i2;
            Objects.requireNonNull(this.f1754q);
        }
    }

    /* renamed from: q */
    public final void m958q(float f2, float f3, int i) {
        float[] fArr = this.f1741d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f1742e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f1743f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f1744g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f1745h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f1746i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f1747j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f1741d = fArr2;
            this.f1742e = fArr3;
            this.f1743f = fArr4;
            this.f1744g = fArr5;
            this.f1745h = iArr;
            this.f1746i = iArr2;
            this.f1747j = iArr3;
        }
        float[] fArr9 = this.f1741d;
        this.f1743f[i] = f2;
        fArr9[i] = f2;
        float[] fArr10 = this.f1742e;
        this.f1744g[i] = f3;
        fArr10[i] = f3;
        int[] iArr7 = this.f1745h;
        int i3 = (int) f2;
        int i4 = (int) f3;
        int i5 = i3 < this.f1757t.getLeft() + this.f1752o ? 1 : 0;
        if (i4 < this.f1757t.getTop() + this.f1752o) {
            i5 |= 4;
        }
        if (i3 > this.f1757t.getRight() - this.f1752o) {
            i5 |= 2;
        }
        if (i4 > this.f1757t.getBottom() - this.f1752o) {
            i5 |= 8;
        }
        iArr7[i] = i5;
        this.f1748k |= 1 << i;
    }

    /* renamed from: r */
    public final void m959r(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m954m(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f1743f[pointerId] = x;
                this.f1744g[pointerId] = y;
            }
        }
    }

    /* renamed from: s */
    public void m960s(int i) {
        this.f1757t.removeCallbacks(this.f1758u);
        if (this.f1738a != i) {
            this.f1738a = i;
            this.f1754q.mo969f(i);
            if (this.f1738a == 0) {
                this.f1755r = null;
            }
        }
    }

    /* renamed from: t */
    public boolean m961t(int i, int i2) {
        if (this.f1756s) {
            return m953l(i, i2, (int) this.f1749l.getXVelocity(this.f1740c), (int) this.f1749l.getYVelocity(this.f1740c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ff  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m962u(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p049j.p051b.C0292e.m962u(android.view.MotionEvent):boolean");
    }

    /* renamed from: v */
    public boolean m963v(View view, int i) {
        if (view == this.f1755r && this.f1740c == i) {
            return true;
        }
        if (view == null || !this.f1754q.mo972i(view, i)) {
            return false;
        }
        this.f1740c = i;
        m943b(view, i);
        return true;
    }
}
