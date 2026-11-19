package p156s2;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.core.view.MotionEventCompat;
import p148r2.RunnableC6451e;
import p148r2.ViewOnTouchListenerC6457k;

/* renamed from: s2.b */
/* loaded from: classes3.dex */
public final class C6553b {

    /* renamed from: a */
    public ViewOnTouchListenerC6457k f10935a;

    /* renamed from: b */
    public float f10936b;

    /* renamed from: c */
    public float f10937c;

    /* renamed from: d */
    public final float f10938d;

    /* renamed from: e */
    public final float f10939e;

    /* renamed from: f */
    public VelocityTracker f10940f;

    /* renamed from: g */
    public boolean f10941g;

    /* renamed from: h */
    public int f10942h;

    /* renamed from: i */
    public int f10943i;

    /* renamed from: j */
    public final ScaleGestureDetector f10944j;

    public C6553b(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f10939e = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f10938d = viewConfiguration.getScaledTouchSlop();
        this.f10942h = -1;
        this.f10943i = 0;
        this.f10944j = new ScaleGestureDetector(context, new ScaleGestureDetectorOnScaleGestureListenerC6552a(this));
    }

    /* renamed from: a */
    public final float m6191a(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.f10943i);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    /* renamed from: b */
    public final float m6192b(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.f10943i);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    /* renamed from: c */
    public final void m6193c(MotionEvent motionEvent) {
        int iRound;
        int i;
        int iRound2;
        int i8;
        VelocityTracker velocityTracker;
        int action = motionEvent.getAction();
        if (action == 0) {
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.f10940f = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            }
            this.f10936b = m6191a(motionEvent);
            this.f10937c = m6192b(motionEvent);
            this.f10941g = false;
            return;
        }
        if (action != 1) {
            if (action != 2) {
                if (action == 3 && (velocityTracker = this.f10940f) != null) {
                    velocityTracker.recycle();
                    this.f10940f = null;
                    return;
                }
                return;
            }
            float fM6191a = m6191a(motionEvent);
            float fM6192b = m6192b(motionEvent);
            float f = fM6191a - this.f10936b;
            float f7 = fM6192b - this.f10937c;
            if (!this.f10941g) {
                this.f10941g = Math.sqrt((double) ((f7 * f7) + (f * f))) >= ((double) this.f10938d);
            }
            if (this.f10941g) {
                ViewOnTouchListenerC6457k viewOnTouchListenerC6457k = this.f10935a;
                C6553b c6553b = viewOnTouchListenerC6457k.f10608j;
                if (!c6553b.f10944j.isInProgress()) {
                    if (ViewOnTouchListenerC6457k.f10598z) {
                        String.format("onDrag: dx: %.2f. dy: %.2f", Float.valueOf(f), Float.valueOf(f7));
                    }
                    ImageView imageViewM6117g = viewOnTouchListenerC6457k.m6117g();
                    viewOnTouchListenerC6457k.f10611m.postTranslate(f, f7);
                    viewOnTouchListenerC6457k.m6112a();
                    ViewParent parent = imageViewM6117g.getParent();
                    if (viewOnTouchListenerC6457k.f10604f && !c6553b.f10944j.isInProgress() && !viewOnTouchListenerC6457k.f10605g) {
                        int i9 = viewOnTouchListenerC6457k.f10621w;
                        if ((i9 == 2 || ((i9 == 0 && f >= 1.0f) || (i9 == 1 && f <= -1.0f))) && parent != null) {
                            parent.requestDisallowInterceptTouchEvent(false);
                        }
                    } else if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                }
                this.f10936b = fM6191a;
                this.f10937c = fM6192b;
                VelocityTracker velocityTracker2 = this.f10940f;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                    return;
                }
                return;
            }
            return;
        }
        if (this.f10941g && this.f10940f != null) {
            this.f10936b = m6191a(motionEvent);
            this.f10937c = m6192b(motionEvent);
            this.f10940f.addMovement(motionEvent);
            this.f10940f.computeCurrentVelocity(1000);
            float xVelocity = this.f10940f.getXVelocity();
            float yVelocity = this.f10940f.getYVelocity();
            if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f10939e) {
                ViewOnTouchListenerC6457k viewOnTouchListenerC6457k2 = this.f10935a;
                ImageView imageViewM6117g2 = viewOnTouchListenerC6457k2.m6117g();
                RunnableC6451e runnableC6451e = new RunnableC6451e(viewOnTouchListenerC6457k2, imageViewM6117g2.getContext());
                viewOnTouchListenerC6457k2.f10620v = runnableC6451e;
                int iM6111i = ViewOnTouchListenerC6457k.m6111i(imageViewM6117g2);
                int iM6110h = ViewOnTouchListenerC6457k.m6110h(imageViewM6117g2);
                int i10 = (int) (-xVelocity);
                int i11 = (int) (-yVelocity);
                viewOnTouchListenerC6457k2.m6113b();
                RectF rectFM6115e = viewOnTouchListenerC6457k2.m6115e(viewOnTouchListenerC6457k2.m6116f());
                if (rectFM6115e != null) {
                    int iRound3 = Math.round(-rectFM6115e.left);
                    float f8 = iM6111i;
                    if (f8 < rectFM6115e.width()) {
                        iRound = Math.round(rectFM6115e.width() - f8);
                        i = 0;
                    } else {
                        iRound = iRound3;
                        i = iRound;
                    }
                    int iRound4 = Math.round(-rectFM6115e.top);
                    float f9 = iM6110h;
                    if (f9 < rectFM6115e.height()) {
                        iRound2 = Math.round(rectFM6115e.height() - f9);
                        i8 = 0;
                    } else {
                        iRound2 = iRound4;
                        i8 = iRound2;
                    }
                    runnableC6451e.f10595b = iRound3;
                    runnableC6451e.f10596c = iRound4;
                    if (iRound3 != iRound || iRound4 != iRound2) {
                        runnableC6451e.f10594a.f10989b.fling(iRound3, iRound4, i10, i11, i, iRound, i8, iRound2, 0, 0);
                    }
                }
                imageViewM6117g2.post(viewOnTouchListenerC6457k2.f10620v);
            }
        }
        VelocityTracker velocityTracker3 = this.f10940f;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
            this.f10940f = null;
        }
    }

    /* renamed from: d */
    public final void m6194d(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action == 1 || action == 3) {
                this.f10942h = -1;
            } else if (action == 6) {
                int action2 = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                if (motionEvent.getPointerId(action2) == this.f10942h) {
                    int i = action2 != 0 ? 0 : 1;
                    this.f10942h = motionEvent.getPointerId(i);
                    this.f10936b = motionEvent.getX(i);
                    this.f10937c = motionEvent.getY(i);
                }
            }
        } else {
            this.f10942h = motionEvent.getPointerId(0);
        }
        int i8 = this.f10942h;
        this.f10943i = motionEvent.findPointerIndex(i8 != -1 ? i8 : 0);
        try {
            m6193c(motionEvent);
        } catch (IllegalArgumentException unused) {
        }
    }
}
