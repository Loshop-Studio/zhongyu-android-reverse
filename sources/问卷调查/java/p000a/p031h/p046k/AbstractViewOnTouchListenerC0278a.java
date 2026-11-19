package p000a.p031h.p046k;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;

/* renamed from: a.h.k.a */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0278a implements View.OnTouchListener {

    /* renamed from: r */
    public static final int f1666r = ViewConfiguration.getTapTimeout();

    /* renamed from: b */
    public final a f1667b;

    /* renamed from: c */
    public final Interpolator f1668c;

    /* renamed from: d */
    public final View f1669d;

    /* renamed from: e */
    public Runnable f1670e;

    /* renamed from: f */
    public float[] f1671f;

    /* renamed from: g */
    public float[] f1672g;

    /* renamed from: h */
    public int f1673h;

    /* renamed from: i */
    public int f1674i;

    /* renamed from: j */
    public float[] f1675j;

    /* renamed from: k */
    public float[] f1676k;

    /* renamed from: l */
    public float[] f1677l;

    /* renamed from: m */
    public boolean f1678m;

    /* renamed from: n */
    public boolean f1679n;

    /* renamed from: o */
    public boolean f1680o;

    /* renamed from: p */
    public boolean f1681p;

    /* renamed from: q */
    public boolean f1682q;

    /* renamed from: a.h.k.a$a */
    public static class a {

        /* renamed from: a */
        public int f1683a;

        /* renamed from: b */
        public int f1684b;

        /* renamed from: c */
        public float f1685c;

        /* renamed from: d */
        public float f1686d;

        /* renamed from: j */
        public float f1692j;

        /* renamed from: k */
        public int f1693k;

        /* renamed from: e */
        public long f1687e = Long.MIN_VALUE;

        /* renamed from: i */
        public long f1691i = -1;

        /* renamed from: f */
        public long f1688f = 0;

        /* renamed from: g */
        public int f1689g = 0;

        /* renamed from: h */
        public int f1690h = 0;

        /* renamed from: a */
        public final float m925a(long j) {
            if (j < this.f1687e) {
                return 0.0f;
            }
            long j2 = this.f1691i;
            if (j2 < 0 || j < j2) {
                return AbstractViewOnTouchListenerC0278a.m920b((j - r0) / this.f1683a, 0.0f, 1.0f) * 0.5f;
            }
            float f2 = this.f1692j;
            return (AbstractViewOnTouchListenerC0278a.m920b((j - j2) / this.f1693k, 0.0f, 1.0f) * f2) + (1.0f - f2);
        }
    }

    /* renamed from: a.h.k.a$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC0278a abstractViewOnTouchListenerC0278a = AbstractViewOnTouchListenerC0278a.this;
            if (abstractViewOnTouchListenerC0278a.f1681p) {
                if (abstractViewOnTouchListenerC0278a.f1679n) {
                    abstractViewOnTouchListenerC0278a.f1679n = false;
                    a aVar = abstractViewOnTouchListenerC0278a.f1667b;
                    Objects.requireNonNull(aVar);
                    long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    aVar.f1687e = jCurrentAnimationTimeMillis;
                    aVar.f1691i = -1L;
                    aVar.f1688f = jCurrentAnimationTimeMillis;
                    aVar.f1692j = 0.5f;
                    aVar.f1689g = 0;
                    aVar.f1690h = 0;
                }
                a aVar2 = AbstractViewOnTouchListenerC0278a.this.f1667b;
                if ((aVar2.f1691i > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar2.f1691i + ((long) aVar2.f1693k)) || !AbstractViewOnTouchListenerC0278a.this.m924e()) {
                    AbstractViewOnTouchListenerC0278a.this.f1681p = false;
                    return;
                }
                AbstractViewOnTouchListenerC0278a abstractViewOnTouchListenerC0278a2 = AbstractViewOnTouchListenerC0278a.this;
                if (abstractViewOnTouchListenerC0278a2.f1680o) {
                    abstractViewOnTouchListenerC0278a2.f1680o = false;
                    Objects.requireNonNull(abstractViewOnTouchListenerC0278a2);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    abstractViewOnTouchListenerC0278a2.f1669d.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (aVar2.f1688f == 0) {
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                float fM925a = aVar2.m925a(jCurrentAnimationTimeMillis2);
                long j = jCurrentAnimationTimeMillis2 - aVar2.f1688f;
                aVar2.f1688f = jCurrentAnimationTimeMillis2;
                float f2 = j * ((fM925a * 4.0f) + ((-4.0f) * fM925a * fM925a));
                aVar2.f1689g = (int) (aVar2.f1685c * f2);
                int i = (int) (f2 * aVar2.f1686d);
                aVar2.f1690h = i;
                ((C0280c) AbstractViewOnTouchListenerC0278a.this).f1696s.scrollListBy(i);
                View view = AbstractViewOnTouchListenerC0278a.this.f1669d;
                WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                view.postOnAnimation(this);
            }
        }
    }

    public AbstractViewOnTouchListenerC0278a(View view) {
        a aVar = new a();
        this.f1667b = aVar;
        this.f1668c = new AccelerateInterpolator();
        this.f1671f = new float[]{0.0f, 0.0f};
        this.f1672g = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1675j = new float[]{0.0f, 0.0f};
        this.f1676k = new float[]{0.0f, 0.0f};
        this.f1677l = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1669d = view;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.f1677l;
        float f3 = ((int) ((1575.0f * f2) + 0.5f)) / 1000.0f;
        fArr[0] = f3;
        fArr[1] = f3;
        float[] fArr2 = this.f1676k;
        float f4 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr2[0] = f4;
        fArr2[1] = f4;
        this.f1673h = 1;
        float[] fArr3 = this.f1672g;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f1671f;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.f1675j;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f1674i = f1666r;
        aVar.f1683a = 500;
        aVar.f1684b = 500;
    }

    /* renamed from: b */
    public static float m920b(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float m921a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f1671f
            r0 = r0[r4]
            float[] r1 = r3.f1672g
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = m920b(r0, r2, r1)
            float r1 = r3.m922c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.m922c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 >= 0) goto L25
            android.view.animation.Interpolator r6 = r3.f1668c
            float r5 = -r5
            float r5 = r6.getInterpolation(r5)
            float r5 = -r5
            goto L2f
        L25:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L38
            android.view.animation.Interpolator r6 = r3.f1668c
            float r5 = r6.getInterpolation(r5)
        L2f:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = m920b(r5, r6, r0)
            goto L39
        L38:
            r5 = r2
        L39:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3e
            return r2
        L3e:
            float[] r0 = r3.f1675j
            r0 = r0[r4]
            float[] r1 = r3.f1676k
            r1 = r1[r4]
            float[] r2 = r3.f1677l
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L53
            float r5 = r5 * r0
            float r4 = m920b(r5, r1, r4)
            return r4
        L53:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = m920b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p031h.p046k.AbstractViewOnTouchListenerC0278a.m921a(int, float, float, float):float");
    }

    /* renamed from: c */
    public final float m922c(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i = this.f1673h;
        if (i == 0 || i == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                if (this.f1681p && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
        return 0.0f;
    }

    /* renamed from: d */
    public final void m923d() {
        int i = 0;
        if (this.f1679n) {
            this.f1681p = false;
            return;
        }
        a aVar = this.f1667b;
        Objects.requireNonNull(aVar);
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (jCurrentAnimationTimeMillis - aVar.f1687e);
        int i3 = aVar.f1684b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        aVar.f1693k = i;
        aVar.f1692j = aVar.m925a(jCurrentAnimationTimeMillis);
        aVar.f1691i = jCurrentAnimationTimeMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m924e() {
        /*
            r9 = this;
            a.h.k.a$a r0 = r9.f1667b
            float r1 = r0.f1686d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f1685c
            float r2 = java.lang.Math.abs(r0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L53
            r4 = r9
            a.h.k.c r4 = (p000a.p031h.p046k.C0280c) r4
            android.widget.ListView r4 = r4.f1696s
            int r5 = r4.getCount()
            if (r5 != 0) goto L23
        L21:
            r1 = r3
            goto L51
        L23:
            int r6 = r4.getChildCount()
            int r7 = r4.getFirstVisiblePosition()
            int r8 = r7 + r6
            if (r1 <= 0) goto L41
            if (r8 < r5) goto L50
            int r6 = r6 - r2
            android.view.View r1 = r4.getChildAt(r6)
            int r1 = r1.getBottom()
            int r4 = r4.getHeight()
            if (r1 > r4) goto L50
            goto L21
        L41:
            if (r1 >= 0) goto L21
            if (r7 > 0) goto L50
            android.view.View r1 = r4.getChildAt(r3)
            int r1 = r1.getTop()
            if (r1 < 0) goto L50
            goto L21
        L50:
            r1 = r2
        L51:
            if (r1 != 0) goto L54
        L53:
            r2 = r3
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p031h.p046k.AbstractViewOnTouchListenerC0278a.m924e():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f1682q
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L7f
        L16:
            r5.m923d()
            goto L7f
        L1a:
            r5.f1680o = r2
            r5.f1678m = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f1669d
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m921a(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f1669d
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m921a(r2, r7, r6, r3)
            a.h.k.a$a r7 = r5.f1667b
            r7.f1685c = r0
            r7.f1686d = r6
            boolean r6 = r5.f1681p
            if (r6 != 0) goto L7f
            boolean r6 = r5.m924e()
            if (r6 == 0) goto L7f
            java.lang.Runnable r6 = r5.f1670e
            if (r6 != 0) goto L61
            a.h.k.a$b r6 = new a.h.k.a$b
            r6.<init>()
            r5.f1670e = r6
        L61:
            r5.f1681p = r2
            r5.f1679n = r2
            boolean r6 = r5.f1678m
            if (r6 != 0) goto L78
            int r6 = r5.f1674i
            if (r6 <= 0) goto L78
            android.view.View r7 = r5.f1669d
            java.lang.Runnable r0 = r5.f1670e
            long r3 = (long) r6
            java.util.WeakHashMap<android.view.View, a.h.j.v> r6 = p000a.p031h.p043j.C0266o.f1616a
            r7.postOnAnimationDelayed(r0, r3)
            goto L7d
        L78:
            java.lang.Runnable r6 = r5.f1670e
            r6.run()
        L7d:
            r5.f1678m = r2
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p031h.p046k.AbstractViewOnTouchListenerC0278a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
