package androidx.customview.widget;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.C0358u;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.Arrays;

/* renamed from: androidx.customview.widget.c */
/* loaded from: classes.dex */
public class C0384c {

    /* renamed from: w */
    private static final Interpolator f2838w = new a();

    /* renamed from: a */
    private int f2839a;

    /* renamed from: b */
    private int f2840b;

    /* renamed from: d */
    private float[] f2842d;

    /* renamed from: e */
    private float[] f2843e;

    /* renamed from: f */
    private float[] f2844f;

    /* renamed from: g */
    private float[] f2845g;

    /* renamed from: h */
    private int[] f2846h;

    /* renamed from: i */
    private int[] f2847i;

    /* renamed from: j */
    private int[] f2848j;

    /* renamed from: k */
    private int f2849k;

    /* renamed from: l */
    private VelocityTracker f2850l;

    /* renamed from: m */
    private float f2851m;

    /* renamed from: n */
    private float f2852n;

    /* renamed from: o */
    private int f2853o;

    /* renamed from: p */
    private int f2854p;

    /* renamed from: q */
    private OverScroller f2855q;

    /* renamed from: r */
    private final c f2856r;

    /* renamed from: s */
    private View f2857s;

    /* renamed from: t */
    private boolean f2858t;

    /* renamed from: u */
    private final ViewGroup f2859u;

    /* renamed from: c */
    private int f2841c = -1;

    /* renamed from: v */
    private final Runnable f2860v = new b();

    /* renamed from: androidx.customview.widget.c$a */
    static class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            float f5 = f4 - 1.0f;
            return (f5 * f5 * f5 * f5 * f5) + 1.0f;
        }
    }

    /* renamed from: androidx.customview.widget.c$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0384c.this.m2266K(0);
        }
    }

    /* renamed from: androidx.customview.widget.c$c */
    public static abstract class c {
        public int clampViewPositionHorizontal(View view, int i4, int i5) {
            return 0;
        }

        public int clampViewPositionVertical(View view, int i4, int i5) {
            return 0;
        }

        public int getOrderedChildIndex(int i4) {
            return i4;
        }

        public int getViewHorizontalDragRange(View view) {
            return 0;
        }

        public int getViewVerticalDragRange(View view) {
            return 0;
        }

        public void onEdgeDragStarted(int i4, int i5) {
        }

        public boolean onEdgeLock(int i4) {
            return false;
        }

        public void onEdgeTouched(int i4, int i5) {
        }

        public void onViewCaptured(View view, int i4) {
        }

        public void onViewDragStateChanged(int i4) {
        }

        public void onViewPositionChanged(View view, int i4, int i5, int i6, int i7) {
        }

        public void onViewReleased(View view, float f4, float f5) {
        }

        public abstract boolean tryCaptureView(View view, int i4);
    }

    private C0384c(Context context, ViewGroup viewGroup, c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f2859u = viewGroup;
        this.f2856r = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2853o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f2840b = viewConfiguration.getScaledTouchSlop();
        this.f2851m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f2852n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2855q = new OverScroller(context, f2838w);
    }

    /* renamed from: D */
    private boolean m2240D(int i4) {
        if (m2263C(i4)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i4 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: G */
    private void m2241G() {
        this.f2850l.computeCurrentVelocity(1000, this.f2851m);
        m2255q(m2247h(this.f2850l.getXVelocity(this.f2841c), this.f2852n, this.f2851m), m2247h(this.f2850l.getYVelocity(this.f2841c), this.f2852n, this.f2851m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.customview.widget.c$c] */
    /* renamed from: H */
    private void m2242H(float f4, float f5, int i4) {
        boolean zM2245d = m2245d(f4, f5, i4, 1);
        boolean z3 = zM2245d;
        if (m2245d(f5, f4, i4, 4)) {
            z3 = (zM2245d ? 1 : 0) | 4;
        }
        boolean z4 = z3;
        if (m2245d(f4, f5, i4, 2)) {
            z4 = (z3 ? 1 : 0) | 2;
        }
        ?? r02 = z4;
        if (m2245d(f5, f4, i4, 8)) {
            r02 = (z4 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.f2847i;
            iArr[i4] = iArr[i4] | r02;
            this.f2856r.onEdgeDragStarted(r02, i4);
        }
    }

    /* renamed from: I */
    private void m2243I(float f4, float f5, int i4) {
        m2258t(i4);
        float[] fArr = this.f2842d;
        this.f2844f[i4] = f4;
        fArr[i4] = f4;
        float[] fArr2 = this.f2843e;
        this.f2845g[i4] = f5;
        fArr2[i4] = f5;
        this.f2846h[i4] = m2260y((int) f4, (int) f5);
        this.f2849k |= 1 << i4;
    }

    /* renamed from: J */
    private void m2244J(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i4 = 0; i4 < pointerCount; i4++) {
            int pointerId = motionEvent.getPointerId(i4);
            if (m2240D(pointerId)) {
                float x3 = motionEvent.getX(i4);
                float y3 = motionEvent.getY(i4);
                this.f2844f[pointerId] = x3;
                this.f2845g[pointerId] = y3;
            }
        }
    }

    /* renamed from: d */
    private boolean m2245d(float f4, float f5, int i4, int i5) {
        float fAbs = Math.abs(f4);
        float fAbs2 = Math.abs(f5);
        if ((this.f2846h[i4] & i5) != i5 || (this.f2854p & i5) == 0 || (this.f2848j[i4] & i5) == i5 || (this.f2847i[i4] & i5) == i5) {
            return false;
        }
        int i6 = this.f2840b;
        if (fAbs <= i6 && fAbs2 <= i6) {
            return false;
        }
        if (fAbs >= fAbs2 * 0.5f || !this.f2856r.onEdgeLock(i5)) {
            return (this.f2847i[i4] & i5) == 0 && fAbs > ((float) this.f2840b);
        }
        int[] iArr = this.f2848j;
        iArr[i4] = iArr[i4] | i5;
        return false;
    }

    /* renamed from: g */
    private boolean m2246g(View view, float f4, float f5) {
        if (view == null) {
            return false;
        }
        boolean z3 = this.f2856r.getViewHorizontalDragRange(view) > 0;
        boolean z4 = this.f2856r.getViewVerticalDragRange(view) > 0;
        if (!z3 || !z4) {
            return z3 ? Math.abs(f4) > ((float) this.f2840b) : z4 && Math.abs(f5) > ((float) this.f2840b);
        }
        float f6 = (f4 * f4) + (f5 * f5);
        int i4 = this.f2840b;
        return f6 > ((float) (i4 * i4));
    }

    /* renamed from: h */
    private float m2247h(float f4, float f5, float f6) {
        float fAbs = Math.abs(f4);
        return fAbs < f5 ? IGoodView.DEFAULT_TO_ALPHA : fAbs > f6 ? f4 > IGoodView.DEFAULT_TO_ALPHA ? f6 : -f6 : f4;
    }

    /* renamed from: i */
    private int m2248i(int i4, int i5, int i6) {
        int iAbs = Math.abs(i4);
        if (iAbs < i5) {
            return 0;
        }
        return iAbs > i6 ? i4 > 0 ? i6 : -i6 : i4;
    }

    /* renamed from: j */
    private void m2249j() {
        float[] fArr = this.f2842d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, IGoodView.DEFAULT_TO_ALPHA);
        Arrays.fill(this.f2843e, IGoodView.DEFAULT_TO_ALPHA);
        Arrays.fill(this.f2844f, IGoodView.DEFAULT_TO_ALPHA);
        Arrays.fill(this.f2845g, IGoodView.DEFAULT_TO_ALPHA);
        Arrays.fill(this.f2846h, 0);
        Arrays.fill(this.f2847i, 0);
        Arrays.fill(this.f2848j, 0);
        this.f2849k = 0;
    }

    /* renamed from: k */
    private void m2250k(int i4) {
        if (this.f2842d == null || !m2263C(i4)) {
            return;
        }
        this.f2842d[i4] = 0.0f;
        this.f2843e[i4] = 0.0f;
        this.f2844f[i4] = 0.0f;
        this.f2845g[i4] = 0.0f;
        this.f2846h[i4] = 0;
        this.f2847i[i4] = 0;
        this.f2848j[i4] = 0;
        this.f2849k = (~(1 << i4)) & this.f2849k;
    }

    /* renamed from: l */
    private int m2251l(int i4, int i5, int i6) {
        if (i4 == 0) {
            return 0;
        }
        int width = this.f2859u.getWidth();
        float f4 = width / 2;
        float fM2256r = f4 + (m2256r(Math.min(1.0f, Math.abs(i4) / width)) * f4);
        int iAbs = Math.abs(i5);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fM2256r / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i4) / i6) + 1.0f) * 256.0f), 600);
    }

    /* renamed from: m */
    private int m2252m(View view, int i4, int i5, int i6, int i7) {
        float f4;
        float f5;
        float f6;
        float f7;
        int iM2248i = m2248i(i6, (int) this.f2852n, (int) this.f2851m);
        int iM2248i2 = m2248i(i7, (int) this.f2852n, (int) this.f2851m);
        int iAbs = Math.abs(i4);
        int iAbs2 = Math.abs(i5);
        int iAbs3 = Math.abs(iM2248i);
        int iAbs4 = Math.abs(iM2248i2);
        int i8 = iAbs3 + iAbs4;
        int i9 = iAbs + iAbs2;
        if (iM2248i != 0) {
            f4 = iAbs3;
            f5 = i8;
        } else {
            f4 = iAbs;
            f5 = i9;
        }
        float f8 = f4 / f5;
        if (iM2248i2 != 0) {
            f6 = iAbs4;
            f7 = i8;
        } else {
            f6 = iAbs2;
            f7 = i9;
        }
        return (int) ((m2251l(i4, iM2248i, this.f2856r.getViewHorizontalDragRange(view)) * f8) + (m2251l(i5, iM2248i2, this.f2856r.getViewVerticalDragRange(view)) * (f6 / f7)));
    }

    /* renamed from: o */
    public static C0384c m2253o(ViewGroup viewGroup, float f4, c cVar) {
        C0384c c0384cM2254p = m2254p(viewGroup, cVar);
        c0384cM2254p.f2840b = (int) (c0384cM2254p.f2840b * (1.0f / f4));
        return c0384cM2254p;
    }

    /* renamed from: p */
    public static C0384c m2254p(ViewGroup viewGroup, c cVar) {
        return new C0384c(viewGroup.getContext(), viewGroup, cVar);
    }

    /* renamed from: q */
    private void m2255q(float f4, float f5) {
        this.f2858t = true;
        this.f2856r.onViewReleased(this.f2857s, f4, f5);
        this.f2858t = false;
        if (this.f2839a == 1) {
            m2266K(0);
        }
    }

    /* renamed from: r */
    private float m2256r(float f4) {
        return (float) Math.sin((f4 - 0.5f) * 0.47123894f);
    }

    /* renamed from: s */
    private void m2257s(int i4, int i5, int i6, int i7) {
        int left = this.f2857s.getLeft();
        int top = this.f2857s.getTop();
        if (i6 != 0) {
            i4 = this.f2856r.clampViewPositionHorizontal(this.f2857s, i4, i6);
            C0358u.m2019a0(this.f2857s, i4 - left);
        }
        int i8 = i4;
        if (i7 != 0) {
            i5 = this.f2856r.clampViewPositionVertical(this.f2857s, i5, i7);
            C0358u.m2021b0(this.f2857s, i5 - top);
        }
        int i9 = i5;
        if (i6 == 0 && i7 == 0) {
            return;
        }
        this.f2856r.onViewPositionChanged(this.f2857s, i8, i9, i8 - left, i9 - top);
    }

    /* renamed from: t */
    private void m2258t(int i4) {
        float[] fArr = this.f2842d;
        if (fArr == null || fArr.length <= i4) {
            int i5 = i4 + 1;
            float[] fArr2 = new float[i5];
            float[] fArr3 = new float[i5];
            float[] fArr4 = new float[i5];
            float[] fArr5 = new float[i5];
            int[] iArr = new int[i5];
            int[] iArr2 = new int[i5];
            int[] iArr3 = new int[i5];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f2843e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f2844f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f2845g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f2846h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f2847i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f2848j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f2842d = fArr2;
            this.f2843e = fArr3;
            this.f2844f = fArr4;
            this.f2845g = fArr5;
            this.f2846h = iArr;
            this.f2847i = iArr2;
            this.f2848j = iArr3;
        }
    }

    /* renamed from: v */
    private boolean m2259v(int i4, int i5, int i6, int i7) {
        int left = this.f2857s.getLeft();
        int top = this.f2857s.getTop();
        int i8 = i4 - left;
        int i9 = i5 - top;
        if (i8 == 0 && i9 == 0) {
            this.f2855q.abortAnimation();
            m2266K(0);
            return false;
        }
        this.f2855q.startScroll(left, top, i8, i9, m2252m(this.f2857s, i8, i9, i6, i7));
        m2266K(2);
        return true;
    }

    /* renamed from: y */
    private int m2260y(int i4, int i5) {
        int i6 = i4 < this.f2859u.getLeft() + this.f2853o ? 1 : 0;
        if (i5 < this.f2859u.getTop() + this.f2853o) {
            i6 |= 4;
        }
        if (i4 > this.f2859u.getRight() - this.f2853o) {
            i6 |= 2;
        }
        return i5 > this.f2859u.getBottom() - this.f2853o ? i6 | 8 : i6;
    }

    /* renamed from: A */
    public int m2261A() {
        return this.f2839a;
    }

    /* renamed from: B */
    public boolean m2262B(int i4, int i5) {
        return m2264E(this.f2857s, i4, i5);
    }

    /* renamed from: C */
    public boolean m2263C(int i4) {
        return ((1 << i4) & this.f2849k) != 0;
    }

    /* renamed from: E */
    public boolean m2264E(View view, int i4, int i5) {
        return view != null && i4 >= view.getLeft() && i4 < view.getRight() && i5 >= view.getTop() && i5 < view.getBottom();
    }

    /* renamed from: F */
    public void m2265F(MotionEvent motionEvent) {
        int i4;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m2274b();
        }
        if (this.f2850l == null) {
            this.f2850l = VelocityTracker.obtain();
        }
        this.f2850l.addMovement(motionEvent);
        int i5 = 0;
        if (actionMasked == 0) {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewM2279u = m2279u((int) x3, (int) y3);
            m2243I(x3, y3, pointerId);
            m2272Q(viewM2279u, pointerId);
            int i6 = this.f2846h[pointerId];
            int i7 = this.f2854p;
            if ((i6 & i7) != 0) {
                this.f2856r.onEdgeTouched(i6 & i7, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f2839a == 1) {
                m2241G();
            }
            m2274b();
            return;
        }
        if (actionMasked == 2) {
            if (this.f2839a == 1) {
                if (m2240D(this.f2841c)) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f2841c);
                    float x4 = motionEvent.getX(iFindPointerIndex);
                    float y4 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f2844f;
                    int i8 = this.f2841c;
                    int i9 = (int) (x4 - fArr[i8]);
                    int i10 = (int) (y4 - this.f2845g[i8]);
                    m2257s(this.f2857s.getLeft() + i9, this.f2857s.getTop() + i10, i9, i10);
                    m2244J(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i5 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i5);
                if (m2240D(pointerId2)) {
                    float x5 = motionEvent.getX(i5);
                    float y5 = motionEvent.getY(i5);
                    float f4 = x5 - this.f2842d[pointerId2];
                    float f5 = y5 - this.f2843e[pointerId2];
                    m2242H(f4, f5, pointerId2);
                    if (this.f2839a != 1) {
                        View viewM2279u2 = m2279u((int) x5, (int) y5);
                        if (m2246g(viewM2279u2, f4, f5) && m2272Q(viewM2279u2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i5++;
            }
            m2244J(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f2839a == 1) {
                m2255q(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA);
            }
            m2274b();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x6 = motionEvent.getX(actionIndex);
            float y6 = motionEvent.getY(actionIndex);
            m2243I(x6, y6, pointerId3);
            if (this.f2839a != 0) {
                if (m2262B((int) x6, (int) y6)) {
                    m2272Q(this.f2857s, pointerId3);
                    return;
                }
                return;
            } else {
                m2272Q(m2279u((int) x6, (int) y6), pointerId3);
                int i11 = this.f2846h[pointerId3];
                int i12 = this.f2854p;
                if ((i11 & i12) != 0) {
                    this.f2856r.onEdgeTouched(i11 & i12, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f2839a == 1 && pointerId4 == this.f2841c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i5 >= pointerCount2) {
                    i4 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i5);
                if (pointerId5 != this.f2841c) {
                    View viewM2279u3 = m2279u((int) motionEvent.getX(i5), (int) motionEvent.getY(i5));
                    View view = this.f2857s;
                    if (viewM2279u3 == view && m2272Q(view, pointerId5)) {
                        i4 = this.f2841c;
                        break;
                    }
                }
                i5++;
            }
            if (i4 == -1) {
                m2241G();
            }
        }
        m2250k(pointerId4);
    }

    /* renamed from: K */
    void m2266K(int i4) {
        this.f2859u.removeCallbacks(this.f2860v);
        if (this.f2839a != i4) {
            this.f2839a = i4;
            this.f2856r.onViewDragStateChanged(i4);
            if (this.f2839a == 0) {
                this.f2857s = null;
            }
        }
    }

    /* renamed from: L */
    public void m2267L(int i4) {
        this.f2854p = i4;
    }

    /* renamed from: M */
    public void m2268M(float f4) {
        this.f2852n = f4;
    }

    /* renamed from: N */
    public boolean m2269N(int i4, int i5) {
        if (this.f2858t) {
            return m2259v(i4, i5, (int) this.f2850l.getXVelocity(this.f2841c), (int) this.f2850l.getYVelocity(this.f2841c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ff  */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m2270O(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.C0384c.m2270O(android.view.MotionEvent):boolean");
    }

    /* renamed from: P */
    public boolean m2271P(View view, int i4, int i5) {
        this.f2857s = view;
        this.f2841c = -1;
        boolean zM2259v = m2259v(i4, i5, 0, 0);
        if (!zM2259v && this.f2839a == 0 && this.f2857s != null) {
            this.f2857s = null;
        }
        return zM2259v;
    }

    /* renamed from: Q */
    boolean m2272Q(View view, int i4) {
        if (view == this.f2857s && this.f2841c == i4) {
            return true;
        }
        if (view == null || !this.f2856r.tryCaptureView(view, i4)) {
            return false;
        }
        this.f2841c = i4;
        m2275c(view, i4);
        return true;
    }

    /* renamed from: a */
    public void m2273a() {
        m2274b();
        if (this.f2839a == 2) {
            int currX = this.f2855q.getCurrX();
            int currY = this.f2855q.getCurrY();
            this.f2855q.abortAnimation();
            int currX2 = this.f2855q.getCurrX();
            int currY2 = this.f2855q.getCurrY();
            this.f2856r.onViewPositionChanged(this.f2857s, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        m2266K(0);
    }

    /* renamed from: b */
    public void m2274b() {
        this.f2841c = -1;
        m2249j();
        VelocityTracker velocityTracker = this.f2850l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2850l = null;
        }
    }

    /* renamed from: c */
    public void m2275c(View view, int i4) {
        if (view.getParent() == this.f2859u) {
            this.f2857s = view;
            this.f2841c = i4;
            this.f2856r.onViewCaptured(view, i4);
            m2266K(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f2859u + ")");
    }

    /* renamed from: e */
    public boolean m2276e(int i4) {
        int length = this.f2842d.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (m2277f(i4, i5)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public boolean m2277f(int i4, int i5) {
        if (!m2263C(i5)) {
            return false;
        }
        boolean z3 = (i4 & 1) == 1;
        boolean z4 = (i4 & 2) == 2;
        float f4 = this.f2844f[i5] - this.f2842d[i5];
        float f5 = this.f2845g[i5] - this.f2843e[i5];
        if (!z3 || !z4) {
            return z3 ? Math.abs(f4) > ((float) this.f2840b) : z4 && Math.abs(f5) > ((float) this.f2840b);
        }
        float f6 = (f4 * f4) + (f5 * f5);
        int i6 = this.f2840b;
        return f6 > ((float) (i6 * i6));
    }

    /* renamed from: n */
    public boolean m2278n(boolean z3) {
        if (this.f2839a == 2) {
            boolean zComputeScrollOffset = this.f2855q.computeScrollOffset();
            int currX = this.f2855q.getCurrX();
            int currY = this.f2855q.getCurrY();
            int left = currX - this.f2857s.getLeft();
            int top = currY - this.f2857s.getTop();
            if (left != 0) {
                C0358u.m2019a0(this.f2857s, left);
            }
            if (top != 0) {
                C0358u.m2021b0(this.f2857s, top);
            }
            if (left != 0 || top != 0) {
                this.f2856r.onViewPositionChanged(this.f2857s, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f2855q.getFinalX() && currY == this.f2855q.getFinalY()) {
                this.f2855q.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z3) {
                    this.f2859u.post(this.f2860v);
                } else {
                    m2266K(0);
                }
            }
        }
        return this.f2839a == 2;
    }

    /* renamed from: u */
    public View m2279u(int i4, int i5) {
        for (int childCount = this.f2859u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f2859u.getChildAt(this.f2856r.getOrderedChildIndex(childCount));
            if (i4 >= childAt.getLeft() && i4 < childAt.getRight() && i5 >= childAt.getTop() && i5 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: w */
    public View m2280w() {
        return this.f2857s;
    }

    /* renamed from: x */
    public int m2281x() {
        return this.f2853o;
    }

    /* renamed from: z */
    public int m2282z() {
        return this.f2840b;
    }
}
