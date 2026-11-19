package androidx.compose.material.ripple;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p211jd.AbstractC9719c;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class RippleHostView extends View {
    private static final long MinimumRippleStateChangeTime = 5;
    private static final long ResetRippleDelayDuration = 50;
    private Boolean bounded;
    private Long lastRippleStateChangeTimeMillis;
    private InterfaceC9529a onInvalidateRipple;
    private Runnable resetRippleRunnable;
    private UnprojectedRipple ripple;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int[] PressedState = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    private static final int[] RestingState = new int[0];

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    public RippleHostView(Context context) {
        super(context);
    }

    private final void createRipple(boolean z10) {
        UnprojectedRipple unprojectedRipple = new UnprojectedRipple(z10);
        setBackground(unprojectedRipple);
        this.ripple = unprojectedRipple;
    }

    private final void setRippleState(boolean z10) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.resetRippleRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l10 = this.lastRippleStateChangeTimeMillis;
        long jLongValue = jCurrentAnimationTimeMillis - (l10 != null ? l10.longValue() : 0L);
        if (z10 || jLongValue >= 5) {
            int[] iArr = z10 ? PressedState : RestingState;
            UnprojectedRipple unprojectedRipple = this.ripple;
            if (unprojectedRipple != null) {
                unprojectedRipple.setState(iArr);
            }
        } else {
            Runnable runnable2 = new Runnable() { // from class: androidx.compose.material.ripple.a
                @Override // java.lang.Runnable
                public final void run() {
                    RippleHostView.setRippleState$lambda$2(this.f1125c);
                }
            };
            this.resetRippleRunnable = runnable2;
            postDelayed(runnable2, ResetRippleDelayDuration);
        }
        this.lastRippleStateChangeTimeMillis = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(RippleHostView rippleHostView) {
        UnprojectedRipple unprojectedRipple = rippleHostView.ripple;
        if (unprojectedRipple != null) {
            unprojectedRipple.setState(RestingState);
        }
        rippleHostView.resetRippleRunnable = null;
    }

    /* renamed from: addRipple-KOepWvA, reason: not valid java name */
    public final void m28321addRippleKOepWvA(PressInteraction.Press press, boolean z10, long j10, int i10, long j11, float f10, InterfaceC9529a interfaceC9529a) {
        if (this.ripple == null || !AbstractC9979u.m20289b(Boolean.valueOf(z10), this.bounded)) {
            createRipple(z10);
            this.bounded = Boolean.valueOf(z10);
        }
        UnprojectedRipple unprojectedRipple = this.ripple;
        AbstractC9979u.m20291d(unprojectedRipple);
        this.onInvalidateRipple = interfaceC9529a;
        m28322setRipplePropertiesbiQXAtU(j10, i10, j11, f10);
        if (z10) {
            unprojectedRipple.setHotspot(Offset.m30637getXimpl(press.m27280getPressPositionF1C5BW0()), Offset.m30638getYimpl(press.m27280getPressPositionF1C5BW0()));
        } else {
            unprojectedRipple.setHotspot(unprojectedRipple.getBounds().centerX(), unprojectedRipple.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void disposeRipple() {
        this.onInvalidateRipple = null;
        Runnable runnable = this.resetRippleRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.resetRippleRunnable;
            AbstractC9979u.m20291d(runnable2);
            runnable2.run();
        } else {
            UnprojectedRipple unprojectedRipple = this.ripple;
            if (unprojectedRipple != null) {
                unprojectedRipple.setState(RestingState);
            }
        }
        UnprojectedRipple unprojectedRipple2 = this.ripple;
        if (unprojectedRipple2 == null) {
            return;
        }
        unprojectedRipple2.setVisible(false, false);
        unscheduleDrawable(unprojectedRipple2);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            disposeRipple();
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        InterfaceC9529a interfaceC9529a = this.onInvalidateRipple;
        if (interfaceC9529a != null) {
            interfaceC9529a.invoke();
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }

    public final void removeRipple() {
        setRippleState(false);
    }

    /* renamed from: setRippleProperties-biQXAtU, reason: not valid java name */
    public final void m28322setRipplePropertiesbiQXAtU(long j10, int i10, long j11, float f10) {
        UnprojectedRipple unprojectedRipple = this.ripple;
        if (unprojectedRipple == null) {
            return;
        }
        unprojectedRipple.trySetRadius(i10);
        unprojectedRipple.m28333setColorDxMtmZc(j11, f10);
        Rect rect = new Rect(0, 0, AbstractC9719c.m19282d(Size.m30706getWidthimpl(j10)), AbstractC9719c.m19282d(Size.m30703getHeightimpl(j10)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        unprojectedRipple.setBounds(rect);
    }
}
