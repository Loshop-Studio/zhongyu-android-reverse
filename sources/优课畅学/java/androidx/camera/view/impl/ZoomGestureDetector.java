package androidx.camera.view.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Px;
import androidx.annotation.UiThread;
import androidx.camera.video.AudioStats;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p322z7.AbstractC10729c;

/* loaded from: classes.dex */
public final class ZoomGestureDetector {
    private static final int ANCHORED_ZOOM_MODE_DOUBLE_TAP = 1;
    private static final int ANCHORED_ZOOM_MODE_NONE = 0;
    private static final int ANCHORED_ZOOM_MODE_STYLUS = 2;
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_MIN_SPAN = 0;
    private static final float SCALE_FACTOR = 0.5f;
    private int anchoredZoomMode;
    private float anchoredZoomStartX;
    private float anchoredZoomStartY;
    private final Context context;
    private float currentSpan;
    private float currentSpanX;
    private float currentSpanY;
    private boolean eventBeforeOrAboveStartingGestureEvent;
    private long eventTime;

    @Px
    private int focusX;

    @Px
    private int focusY;
    private GestureDetector gestureDetector;
    private float initialSpan;
    private boolean isInProgress;
    private boolean isQuickZoomEnabled;
    private boolean isStylusZoomEnabled;
    private final OnZoomGestureListener listener;
    private final int minSpan;
    private long prevTime;
    private float previousSpan;
    private float previousSpanX;
    private float previousSpanY;
    private final int spanSlop;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    public interface OnZoomGestureListener {
        @UiThread
        boolean onZoomEvent(ZoomEvent zoomEvent);
    }

    public static abstract class ZoomEvent {
        private final long eventTime;
        private final int focusX;
        private final int focusY;

        public static final class Begin extends ZoomEvent {
            public Begin(@IntRange(from = 0) long j10, @IntRange(from = 0) @Px int i10, @IntRange(from = 0) @Px int i11) {
                super(j10, i10, i11, null);
            }
        }

        public static final class End extends ZoomEvent {
            private final float incrementalScaleFactor;

            public End(@IntRange(from = 0) long j10, @IntRange(from = 0) @Px int i10, @IntRange(from = 0) @Px int i11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false) float f10) {
                super(j10, i10, i11, null);
                this.incrementalScaleFactor = f10;
            }

            public final float getIncrementalScaleFactor() {
                return this.incrementalScaleFactor;
            }
        }

        public static final class Move extends ZoomEvent {
            private final float incrementalScaleFactor;

            public Move(@IntRange(from = 0) long j10, @IntRange(from = 0) @Px int i10, @IntRange(from = 0) @Px int i11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false) float f10) {
                super(j10, i10, i11, null);
                this.incrementalScaleFactor = f10;
            }

            public final float getIncrementalScaleFactor() {
                return this.incrementalScaleFactor;
            }
        }

        public /* synthetic */ ZoomEvent(long j10, int i10, int i11, AbstractC9126n abstractC9126n) {
            this(j10, i10, i11);
        }

        public final long getEventTime() {
            return this.eventTime;
        }

        public final int getFocusX() {
            return this.focusX;
        }

        public final int getFocusY() {
            return this.focusY;
        }

        private ZoomEvent(@IntRange(from = 0) long j10, @IntRange(from = 0) @Px int i10, @IntRange(from = 0) @Px int i11) {
            this.eventTime = j10;
            this.focusX = i10;
            this.focusY = i11;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"ExecutorRegistration"})
    public ZoomGestureDetector(Context context, @Px int i10, OnZoomGestureListener listener) {
        this(context, i10, 0, listener, 4, null);
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(listener, "listener");
    }

    private final float getIncrementalScaleFactor() {
        if (!inAnchoredZoomMode()) {
            float f10 = this.previousSpan;
            if (f10 > 0.0f) {
                return this.currentSpan / f10;
            }
            return 1.0f;
        }
        boolean z10 = this.eventBeforeOrAboveStartingGestureEvent;
        boolean z11 = (z10 && this.currentSpan < this.previousSpan) || (!z10 && this.currentSpan > this.previousSpan);
        float fAbs = Math.abs(1 - (this.currentSpan / this.previousSpan)) * 0.5f;
        if (this.previousSpan <= this.spanSlop) {
            return 1.0f;
        }
        return z11 ? fAbs + 1.0f : 1.0f - fAbs;
    }

    private final boolean inAnchoredZoomMode() {
        return this.anchoredZoomMode != 0;
    }

    public final long getTimeDelta() {
        return this.eventTime - this.prevTime;
    }

    public final boolean isQuickZoomEnabled() {
        return this.isQuickZoomEnabled;
    }

    public final boolean isStylusZoomEnabled() {
        return this.isStylusZoomEnabled;
    }

    @UiThread
    public final boolean onTouchEvent(MotionEvent event) {
        boolean z10;
        float f10;
        float f11;
        AbstractC9133u.m16133g(event, "event");
        this.eventTime = event.getEventTime();
        int actionMasked = event.getActionMasked();
        if (this.isQuickZoomEnabled) {
            this.gestureDetector.onTouchEvent(event);
        }
        int pointerCount = event.getPointerCount();
        boolean z11 = (event.getButtonState() & 32) != 0;
        boolean z12 = this.anchoredZoomMode == 2 && !z11;
        boolean z13 = actionMasked == 1 || actionMasked == 3 || z12;
        float fAbs = 0.0f;
        if (actionMasked == 0 || z13) {
            if (this.isInProgress) {
                z10 = true;
                this.listener.onZoomEvent(new ZoomEvent.End(this.eventTime, this.focusX, this.focusY, getIncrementalScaleFactor()));
                this.isInProgress = false;
                this.initialSpan = 0.0f;
                this.anchoredZoomMode = 0;
            } else {
                z10 = true;
                if (inAnchoredZoomMode() && z13) {
                    this.isInProgress = false;
                    this.initialSpan = 0.0f;
                    this.anchoredZoomMode = 0;
                }
            }
            if (z13) {
                return z10;
            }
        } else {
            z10 = true;
        }
        if (!this.isInProgress && this.isStylusZoomEnabled && !inAnchoredZoomMode() && !z13 && z11) {
            this.anchoredZoomStartX = event.getX();
            this.anchoredZoomStartY = event.getY();
            this.anchoredZoomMode = 2;
            this.initialSpan = 0.0f;
        }
        boolean z14 = (actionMasked == 0 || actionMasked == 6 || actionMasked == 5 || z12) ? z10 : false;
        boolean z15 = actionMasked == 6 ? z10 : false;
        int actionIndex = z15 ? event.getActionIndex() : -1;
        int i10 = z15 ? pointerCount - 1 : pointerCount;
        if (inAnchoredZoomMode()) {
            f11 = this.anchoredZoomStartX;
            f10 = this.anchoredZoomStartY;
            this.eventBeforeOrAboveStartingGestureEvent = event.getY() < f10 ? z10 : false;
        } else {
            float x10 = 0.0f;
            float y10 = 0.0f;
            for (int i11 = 0; i11 < pointerCount; i11++) {
                if (actionIndex != i11) {
                    x10 += event.getX(i11);
                    y10 += event.getY(i11);
                }
            }
            float f12 = i10;
            float f13 = x10 / f12;
            f10 = y10 / f12;
            f11 = f13;
        }
        float fAbs2 = 0.0f;
        for (int i12 = 0; i12 < pointerCount; i12++) {
            if (actionIndex != i12) {
                fAbs += Math.abs(event.getX(i12) - f11);
                fAbs2 += Math.abs(event.getY(i12) - f10);
            }
        }
        float f14 = i10;
        float f15 = fAbs / f14;
        float f16 = fAbs2 / f14;
        float f17 = 2;
        float f18 = f15 * f17;
        float f19 = f16 * f17;
        float fHypot = inAnchoredZoomMode() ? f19 : (float) Math.hypot(f18, f19);
        boolean z16 = this.isInProgress;
        this.focusX = AbstractC10729c.m20035d(f11);
        this.focusY = AbstractC10729c.m20035d(f10);
        if (!inAnchoredZoomMode() && this.isInProgress && (fHypot < this.minSpan || z14)) {
            this.listener.onZoomEvent(new ZoomEvent.End(this.eventTime, this.focusX, this.focusY, getIncrementalScaleFactor()));
            this.isInProgress = false;
            this.initialSpan = fHypot;
        }
        if (z14) {
            this.currentSpanX = f18;
            this.previousSpanX = f18;
            this.currentSpanY = f19;
            this.previousSpanY = f19;
            this.currentSpan = fHypot;
            this.previousSpan = fHypot;
            this.initialSpan = fHypot;
        }
        int i13 = inAnchoredZoomMode() ? this.spanSlop : this.minSpan;
        if (!this.isInProgress && fHypot >= i13 && (z16 || Math.abs(fHypot - this.initialSpan) > this.spanSlop)) {
            this.currentSpanX = f18;
            this.previousSpanX = f18;
            this.currentSpanY = f19;
            this.previousSpanY = f19;
            this.currentSpan = fHypot;
            this.previousSpan = fHypot;
            long j10 = this.eventTime;
            this.prevTime = j10;
            this.isInProgress = this.listener.onZoomEvent(new ZoomEvent.Begin(j10, this.focusX, this.focusY));
        }
        if (actionMasked == 2) {
            this.currentSpanX = f18;
            this.currentSpanY = f19;
            this.currentSpan = fHypot;
            if (this.isInProgress ? this.listener.onZoomEvent(new ZoomEvent.Move(this.eventTime, this.focusX, this.focusY, getIncrementalScaleFactor())) : z10) {
                this.previousSpanX = this.currentSpanX;
                this.previousSpanY = this.currentSpanY;
                this.previousSpan = this.currentSpan;
                this.prevTime = this.eventTime;
            }
        }
        return z10;
    }

    public final void setQuickZoomEnabled(boolean z10) {
        this.isQuickZoomEnabled = z10;
    }

    public final void setStylusZoomEnabled(boolean z10) {
        this.isStylusZoomEnabled = z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"ExecutorRegistration"})
    public ZoomGestureDetector(Context context, OnZoomGestureListener listener) {
        this(context, 0, 0, listener, 6, null);
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(listener, "listener");
    }

    @SuppressLint({"ExecutorRegistration"})
    public ZoomGestureDetector(Context context, @Px int i10, @Px int i11, OnZoomGestureListener listener) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(listener, "listener");
        this.context = context;
        this.spanSlop = i10;
        this.minSpan = i11;
        this.listener = listener;
        this.isQuickZoomEnabled = true;
        this.isStylusZoomEnabled = true;
        this.gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: androidx.camera.view.impl.ZoomGestureDetector$gestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent e10) {
                AbstractC9133u.m16133g(e10, "e");
                this.this$0.anchoredZoomStartX = e10.getX();
                this.this$0.anchoredZoomStartY = e10.getY();
                this.this$0.anchoredZoomMode = 1;
                return true;
            }
        });
    }

    public /* synthetic */ ZoomGestureDetector(Context context, int i10, int i11, OnZoomGestureListener onZoomGestureListener, int i12, AbstractC9126n abstractC9126n) {
        this(context, (i12 & 2) != 0 ? ViewConfiguration.get(context).getScaledTouchSlop() * 2 : i10, (i12 & 4) != 0 ? 0 : i11, onZoomGestureListener);
    }
}
