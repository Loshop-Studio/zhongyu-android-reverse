package com.xuexiang.xui.widget.popupwindow;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.XUI;
import com.xuexiang.xui.utils.ThemeUtils;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class ViewTooltip {
    private final TooltipView mTooltipView;
    private final View mView;

    /* renamed from: com.xuexiang.xui.widget.popupwindow.ViewTooltip$2 */
    static /* synthetic */ class C22592 {
        static final /* synthetic */ int[] $SwitchMap$com$xuexiang$xui$widget$popupwindow$ViewTooltip$ALIGN;

        /* renamed from: $SwitchMap$com$xuexiang$xui$widget$popupwindow$ViewTooltip$Position */
        static final /* synthetic */ int[] f9694x46b7c7bf;

        static {
            int[] iArr = new int[ALIGN.values().length];
            $SwitchMap$com$xuexiang$xui$widget$popupwindow$ViewTooltip$ALIGN = iArr;
            try {
                iArr[ALIGN.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$popupwindow$ViewTooltip$ALIGN[ALIGN.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Position.values().length];
            f9694x46b7c7bf = iArr2;
            try {
                iArr2[Position.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9694x46b7c7bf[Position.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9694x46b7c7bf[Position.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9694x46b7c7bf[Position.RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum ALIGN {
        START,
        CENTER
    }

    public interface ListenerDisplay {
        void onDisplay(View view);
    }

    public interface ListenerHide {
        void onHide(View view);
    }

    public enum Position {
        LEFT,
        RIGHT,
        TOP,
        BOTTOM
    }

    public interface TooltipAnimation {
        void animateEnter(View view, Animator.AnimatorListener animatorListener);

        void animateExit(View view, Animator.AnimatorListener animatorListener);
    }

    public static class TooltipView extends FrameLayout {
        private static final int MARGIN_SCREEN_BORDER_TOOLTIP = 30;
        private final int ARROW_HEIGHT;
        private ALIGN mAlign;
        private boolean mAutoHide;
        private int mBubbleColor;
        private Paint mBubblePaint;
        private Path mBubblePath;
        protected View mChildView;
        private boolean mClickToHide;
        private int mCorner;
        private long mDuration;
        private ListenerDisplay mListenerDisplay;
        private ListenerHide mListenerHide;
        private int mPaddingBottom;
        private int mPaddingLeft;
        private int mPaddingRight;
        private int mPaddingTop;
        private Position mPosition;
        private TooltipAnimation mTooltipAnimation;
        private Rect mViewRect;

        public TooltipView(Context context) {
            super(context);
            this.ARROW_HEIGHT = 15;
            this.mBubbleColor = Color.parseColor("#B2299EE3");
            this.mPosition = Position.BOTTOM;
            this.mAlign = ALIGN.CENTER;
            this.mAutoHide = true;
            this.mDuration = 4000L;
            this.mTooltipAnimation = new FadeTooltipAnimation();
            this.mCorner = 30;
            setWillNotDraw(false);
            TextView textView = new TextView(context);
            this.mChildView = textView;
            textView.setTextColor(-1);
            addView(this.mChildView, -2, -2);
            this.mChildView.setPadding(0, 0, 0, 0);
            Paint paint = new Paint(1);
            this.mBubblePaint = paint;
            paint.setColor(this.mBubbleColor);
            this.mBubblePaint.setStyle(Paint.Style.FILL);
            int iResolveDimension = ThemeUtils.resolveDimension(getContext(), C2042R.attr.xui_tip_popup_padding_top);
            this.mPaddingBottom = iResolveDimension;
            this.mPaddingTop = iResolveDimension;
            int iResolveDimension2 = ThemeUtils.resolveDimension(getContext(), C2042R.attr.xui_tip_popup_padding_left);
            this.mPaddingLeft = iResolveDimension2;
            this.mPaddingRight = iResolveDimension2;
            setTextTypeFace(XUI.getDefaultTypeface());
        }

        private Path drawBubble(RectF rectF, float f4, float f5, float f6, float f7) {
            Path path = new Path();
            if (this.mViewRect == null) {
                return path;
            }
            float f8 = f4 < IGoodView.DEFAULT_TO_ALPHA ? IGoodView.DEFAULT_TO_ALPHA : f4;
            float f9 = f5 < IGoodView.DEFAULT_TO_ALPHA ? IGoodView.DEFAULT_TO_ALPHA : f5;
            float f10 = f7 < IGoodView.DEFAULT_TO_ALPHA ? IGoodView.DEFAULT_TO_ALPHA : f7;
            float f11 = f6 < IGoodView.DEFAULT_TO_ALPHA ? IGoodView.DEFAULT_TO_ALPHA : f6;
            Position position = this.mPosition;
            Position position2 = Position.RIGHT;
            float f12 = position == position2 ? 15.0f : IGoodView.DEFAULT_TO_ALPHA;
            Position position3 = Position.BOTTOM;
            float f13 = position == position3 ? 15.0f : IGoodView.DEFAULT_TO_ALPHA;
            Position position4 = Position.LEFT;
            float f14 = position == position4 ? 15.0f : IGoodView.DEFAULT_TO_ALPHA;
            Position position5 = Position.TOP;
            float f15 = position != position5 ? IGoodView.DEFAULT_TO_ALPHA : 15.0f;
            float f16 = f12 + rectF.left;
            float f17 = f13 + rectF.top;
            float f18 = rectF.right - f14;
            float f19 = rectF.bottom - f15;
            float fCenterX = r3.centerX() - getX();
            float f20 = f8 / 2.0f;
            float f21 = f16 + f20;
            path.moveTo(f21, f17);
            if (this.mPosition == position3) {
                float f22 = 15;
                path.lineTo(fCenterX - f22, f17);
                path.lineTo(fCenterX, rectF.top);
                path.lineTo(f22 + fCenterX, f17);
            }
            float f23 = f9 / 2.0f;
            path.lineTo(f18 - f23, f17);
            path.quadTo(f18, f17, f18, f23 + f17);
            if (this.mPosition == position4) {
                float f24 = f19 / 2.0f;
                float f25 = 15;
                path.lineTo(f18, f24 - f25);
                path.lineTo(rectF.right, f24);
                path.lineTo(f18, f24 + f25);
            }
            float f26 = f11 / 2.0f;
            path.lineTo(f18, f19 - f26);
            path.quadTo(f18, f19, f18 - f26, f19);
            if (this.mPosition == position5) {
                float f27 = 15;
                path.lineTo(fCenterX + f27, f19);
                path.lineTo(fCenterX, rectF.bottom);
                path.lineTo(fCenterX - f27, f19);
            }
            float f28 = f10 / 2.0f;
            path.lineTo(f16 + f28, f19);
            path.quadTo(f16, f19, f16, f19 - f28);
            if (this.mPosition == position2) {
                float f29 = f19 / 2.0f;
                float f30 = 15;
                path.lineTo(f16, f29 + f30);
                path.lineTo(rectF.left, f29);
                path.lineTo(f16, f29 - f30);
            }
            path.lineTo(f16, f17 + f20);
            path.quadTo(f16, f17, f21, f17);
            path.close();
            return path;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onSetup(Rect rect) {
            setupPosition(rect);
            RectF rectF = new RectF(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, getWidth(), getHeight());
            int i4 = this.mCorner;
            this.mBubblePath = drawBubble(rectF, i4, i4, i4, i4);
            startEnterAnimation();
            handleAutoRemove();
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean adjustSize(android.graphics.Rect r8, int r9) {
            /*
                r7 = this;
                android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
                com.xuexiang.xui.widget.popupwindow.ViewTooltip$Position r1 = r7.mPosition
                com.xuexiang.xui.widget.popupwindow.ViewTooltip$Position r2 = com.xuexiang.xui.widget.popupwindow.ViewTooltip.Position.LEFT
                r3 = 1
                if (r1 != r2) goto L18
                int r1 = r7.getWidth()
                int r2 = r8.left
                if (r1 <= r2) goto L18
                int r2 = r2 + (-30)
                r0.width = r2
                goto L7b
            L18:
                com.xuexiang.xui.widget.popupwindow.ViewTooltip$Position r1 = r7.mPosition
                com.xuexiang.xui.widget.popupwindow.ViewTooltip$Position r2 = com.xuexiang.xui.widget.popupwindow.ViewTooltip.Position.RIGHT
                if (r1 != r2) goto L2f
                int r1 = r8.right
                int r2 = r7.getWidth()
                int r1 = r1 + r2
                if (r1 <= r9) goto L2f
                int r8 = r8.right
                int r9 = r9 - r8
                int r9 = r9 + (-30)
                r0.width = r9
                goto L7b
            L2f:
                com.xuexiang.xui.widget.popupwindow.ViewTooltip$Position r1 = r7.mPosition
                com.xuexiang.xui.widget.popupwindow.ViewTooltip$Position r2 = com.xuexiang.xui.widget.popupwindow.ViewTooltip.Position.TOP
                if (r1 == r2) goto L39
                com.xuexiang.xui.widget.popupwindow.ViewTooltip$Position r2 = com.xuexiang.xui.widget.popupwindow.ViewTooltip.Position.BOTTOM
                if (r1 != r2) goto L7a
            L39:
                int r1 = r7.getWidth()
                int r2 = r8.width()
                int r1 = r1 - r2
                float r1 = (float) r1
                r2 = 1073741824(0x40000000, float:2.0)
                float r1 = r1 / r2
                int r2 = r8.right
                float r4 = (float) r2
                float r4 = r4 + r1
                float r9 = (float) r9
                r5 = 1106247680(0x41f00000, float:30.0)
                int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r4 <= 0) goto L62
                float r4 = (float) r2
                float r4 = r4 + r1
                float r4 = r4 - r9
                float r4 = r4 + r5
                int r9 = r8.left
                float r9 = (float) r9
                float r9 = r9 - r4
                int r9 = (int) r9
                r8.left = r9
                float r9 = (float) r2
                float r9 = r9 - r4
                int r9 = (int) r9
                r8.right = r9
                goto L7b
            L62:
                int r9 = r8.left
                float r4 = (float) r9
                float r4 = r4 - r1
                r6 = 0
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 >= 0) goto L7a
                float r4 = (float) r9
                float r4 = r4 - r1
                float r6 = r6 - r4
                float r6 = r6 + r5
                float r9 = (float) r9
                float r9 = r9 + r6
                int r9 = (int) r9
                r8.left = r9
                float r9 = (float) r2
                float r9 = r9 + r6
                int r9 = (int) r9
                r8.right = r9
                goto L7b
            L7a:
                r3 = 0
            L7b:
                r7.setLayoutParams(r0)
                r7.postInvalidate()
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.popupwindow.ViewTooltip.TooltipView.adjustSize(android.graphics.Rect, int):boolean");
        }

        public void close() {
            remove();
        }

        protected void handleAutoRemove() {
            if (this.mClickToHide) {
                setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.popupwindow.ViewTooltip.TooltipView.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (TooltipView.this.mClickToHide) {
                            TooltipView.this.remove();
                        }
                    }
                });
            }
            if (this.mAutoHide) {
                postDelayed(new Runnable() { // from class: com.xuexiang.xui.widget.popupwindow.ViewTooltip.TooltipView.4
                    @Override // java.lang.Runnable
                    public void run() {
                        TooltipView.this.remove();
                    }
                }, this.mDuration);
            }
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Path path = this.mBubblePath;
            if (path != null) {
                canvas.drawPath(path, this.mBubblePaint);
            }
        }

        @Override // android.view.View
        protected void onSizeChanged(int i4, int i5, int i6, int i7) {
            super.onSizeChanged(i4, i5, i6, i7);
            RectF rectF = new RectF(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, i4, i5);
            int i8 = this.mCorner;
            this.mBubblePath = drawBubble(rectF, i8, i8, i8, i8);
        }

        public void remove() {
            startExitAnimation(new AnimatorListenerAdapter() { // from class: com.xuexiang.xui.widget.popupwindow.ViewTooltip.TooltipView.5
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    if (TooltipView.this.getParent() != null) {
                        ((ViewGroup) TooltipView.this.getParent()).removeView(TooltipView.this);
                    }
                }
            });
        }

        public void setAlign(ALIGN align) {
            this.mAlign = align;
            postInvalidate();
        }

        public void setAutoHide(boolean z3) {
            this.mAutoHide = z3;
        }

        public void setClickToHide(boolean z3) {
            this.mClickToHide = z3;
        }

        public void setColor(int i4) {
            this.mBubbleColor = i4;
            this.mBubblePaint.setColor(i4);
            postInvalidate();
        }

        public void setCorner(int i4) {
            this.mCorner = i4;
        }

        public void setCustomView(View view) {
            removeView(this.mChildView);
            this.mChildView = view;
            addView(view, -2, -2);
        }

        public void setDuration(long j4) {
            this.mDuration = j4;
        }

        public void setListenerDisplay(ListenerDisplay listenerDisplay) {
            this.mListenerDisplay = listenerDisplay;
        }

        public void setListenerHide(ListenerHide listenerHide) {
            this.mListenerHide = listenerHide;
        }

        public void setPosition(Position position) {
            this.mPosition = position;
            int i4 = C22592.f9694x46b7c7bf[position.ordinal()];
            if (i4 == 1) {
                setPaddingRelative(this.mPaddingLeft, this.mPaddingTop, this.mPaddingRight, this.mPaddingBottom + 15);
            } else if (i4 == 2) {
                setPaddingRelative(this.mPaddingLeft, this.mPaddingTop + 15, this.mPaddingRight, this.mPaddingBottom);
            } else if (i4 == 3) {
                setPaddingRelative(this.mPaddingLeft, this.mPaddingTop, this.mPaddingRight + 15, this.mPaddingBottom);
            } else if (i4 == 4) {
                setPaddingRelative(this.mPaddingLeft + 15, this.mPaddingTop, this.mPaddingRight, this.mPaddingBottom);
            }
            postInvalidate();
        }

        public void setText(String str) {
            View view = this.mChildView;
            if (view instanceof TextView) {
                ((TextView) view).setText(Html.fromHtml(str));
            }
            postInvalidate();
        }

        public void setTextColor(int i4) {
            View view = this.mChildView;
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(i4);
            }
            postInvalidate();
        }

        public void setTextGravity(int i4) {
            View view = this.mChildView;
            if (view instanceof TextView) {
                ((TextView) view).setGravity(i4);
            }
            postInvalidate();
        }

        public void setTextSize(int i4, float f4) {
            View view = this.mChildView;
            if (view instanceof TextView) {
                ((TextView) view).setTextSize(i4, f4);
            }
            postInvalidate();
        }

        public void setTextTypeFace(Typeface typeface) {
            View view = this.mChildView;
            if (view instanceof TextView) {
                ((TextView) view).setTypeface(typeface);
            }
            postInvalidate();
        }

        public void setTooltipAnimation(TooltipAnimation tooltipAnimation) {
            this.mTooltipAnimation = tooltipAnimation;
        }

        public void setup(Rect rect, int i4) {
            this.mViewRect = new Rect(rect);
            final Rect rect2 = new Rect(rect);
            if (adjustSize(rect2, i4)) {
                getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.xuexiang.xui.widget.popupwindow.ViewTooltip.TooltipView.6
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public boolean onPreDraw() {
                        TooltipView.this.onSetup(rect2);
                        TooltipView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                        return false;
                    }
                });
            } else {
                onSetup(rect2);
            }
        }

        public void setupPosition(Rect rect) {
            Position position = this.mPosition;
            Position position2 = Position.LEFT;
            if (position != position2 && position != Position.RIGHT) {
                iWidth = this.mAlign == ALIGN.CENTER ? (int) ((rect.width() / 2.0f) - ((getWidth() * 1.0f) / 2.0f)) : 0;
                if (this.mPosition == Position.BOTTOM) {
                    setTranslationY(rect.bottom);
                    setTranslationX(rect.left + iWidth);
                    return;
                } else {
                    setTranslationY(rect.top - getHeight());
                    setTranslationX(rect.left + iWidth);
                    return;
                }
            }
            int height = getHeight();
            int iHeight = rect.height();
            int iMax = Math.max(iHeight, height);
            int iMin = Math.min(iHeight, height);
            int i4 = C22592.$SwitchMap$com$xuexiang$xui$widget$popupwindow$ViewTooltip$ALIGN[this.mAlign.ordinal()];
            if (i4 != 1 && i4 == 2) {
                iWidth = (int) (((iMax * (-1.0f)) / 2.0f) + (iMin / 2.0f));
            }
            if (this.mPosition == position2) {
                setTranslationY(rect.top + iWidth);
                setTranslationX(rect.left - getWidth());
            } else {
                setTranslationY(rect.top + iWidth);
                setTranslationX(rect.right);
            }
        }

        protected void startEnterAnimation() {
            this.mTooltipAnimation.animateEnter(this, new AnimatorListenerAdapter() { // from class: com.xuexiang.xui.widget.popupwindow.ViewTooltip.TooltipView.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    if (TooltipView.this.mListenerDisplay != null) {
                        TooltipView.this.mListenerDisplay.onDisplay(TooltipView.this);
                    }
                }
            });
        }

        protected void startExitAnimation(final Animator.AnimatorListener animatorListener) {
            this.mTooltipAnimation.animateExit(this, new AnimatorListenerAdapter() { // from class: com.xuexiang.xui.widget.popupwindow.ViewTooltip.TooltipView.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    animatorListener.onAnimationEnd(animator);
                    if (TooltipView.this.mListenerHide != null) {
                        TooltipView.this.mListenerHide.onHide(TooltipView.this);
                    }
                }
            });
        }
    }

    private ViewTooltip(View view) {
        this.mView = view;
        this.mTooltipView = new TooltipView(getActivityContext(view.getContext()));
    }

    /* renamed from: on */
    public static ViewTooltip m7972on(View view) {
        return new ViewTooltip(view);
    }

    public ViewTooltip align(ALIGN align) {
        this.mTooltipView.setAlign(align);
        return this;
    }

    public ViewTooltip animation(TooltipAnimation tooltipAnimation) {
        this.mTooltipView.setTooltipAnimation(tooltipAnimation);
        return this;
    }

    public ViewTooltip autoHide(boolean z3, long j4) {
        this.mTooltipView.setAutoHide(z3);
        this.mTooltipView.setDuration(j4);
        return this;
    }

    public ViewTooltip clickToHide(boolean z3) {
        this.mTooltipView.setClickToHide(z3);
        return this;
    }

    public void close() {
        this.mTooltipView.close();
    }

    public ViewTooltip color(int i4) {
        this.mTooltipView.setColor(i4);
        return this;
    }

    public ViewTooltip corner(int i4) {
        this.mTooltipView.setCorner(i4);
        return this;
    }

    public ViewTooltip customView(View view) {
        this.mTooltipView.setCustomView(view);
        return this;
    }

    public ViewTooltip duration(long j4) {
        this.mTooltipView.setDuration(j4);
        return this;
    }

    public Activity getActivityContext(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public ViewTooltip onDisplay(ListenerDisplay listenerDisplay) {
        this.mTooltipView.setListenerDisplay(listenerDisplay);
        return this;
    }

    public ViewTooltip onHide(ListenerHide listenerHide) {
        this.mTooltipView.setListenerHide(listenerHide);
        return this;
    }

    public ViewTooltip padding(int i4, int i5, int i6, int i7) {
        this.mTooltipView.mPaddingTop = i5;
        this.mTooltipView.mPaddingBottom = i7;
        this.mTooltipView.mPaddingLeft = i4;
        this.mTooltipView.mPaddingRight = i6;
        return this;
    }

    public ViewTooltip position(Position position) {
        this.mTooltipView.setPosition(position);
        return this;
    }

    public ViewTooltip setTextGravity(int i4) {
        this.mTooltipView.setTextGravity(i4);
        return this;
    }

    public TooltipView show() {
        Context context = this.mTooltipView.getContext();
        if (context != null && (context instanceof Activity)) {
            final ViewGroup viewGroup = (ViewGroup) ((Activity) context).getWindow().getDecorView();
            this.mView.postDelayed(new Runnable() { // from class: com.xuexiang.xui.widget.popupwindow.ViewTooltip.1
                @Override // java.lang.Runnable
                public void run() {
                    final Rect rect = new Rect();
                    ViewTooltip.this.mView.getGlobalVisibleRect(rect);
                    int[] iArr = new int[2];
                    ViewTooltip.this.mView.getLocationOnScreen(iArr);
                    rect.left = iArr[0];
                    viewGroup.addView(ViewTooltip.this.mTooltipView, -2, -2);
                    ViewTooltip.this.mTooltipView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.xuexiang.xui.widget.popupwindow.ViewTooltip.1.1
                        @Override // android.view.ViewTreeObserver.OnPreDrawListener
                        public boolean onPreDraw() {
                            ViewTooltip.this.mTooltipView.setup(rect, viewGroup.getWidth());
                            ViewTooltip.this.mTooltipView.getViewTreeObserver().removeOnPreDrawListener(this);
                            return false;
                        }
                    });
                }
            }, 100L);
        }
        return this.mTooltipView;
    }

    public ViewTooltip text(String str) {
        this.mTooltipView.setText(str);
        return this;
    }

    public ViewTooltip textColor(int i4) {
        this.mTooltipView.setTextColor(i4);
        return this;
    }

    public ViewTooltip textSize(int i4, float f4) {
        this.mTooltipView.setTextSize(i4, f4);
        return this;
    }

    public ViewTooltip textTypeFace(Typeface typeface) {
        this.mTooltipView.setTextTypeFace(typeface);
        return this;
    }

    public static class FadeTooltipAnimation implements TooltipAnimation {
        private long mFadeDuration;

        public FadeTooltipAnimation() {
            this.mFadeDuration = 400L;
        }

        @Override // com.xuexiang.xui.widget.popupwindow.ViewTooltip.TooltipAnimation
        public void animateEnter(View view, Animator.AnimatorListener animatorListener) {
            view.setAlpha(IGoodView.DEFAULT_TO_ALPHA);
            view.animate().alpha(1.0f).setDuration(this.mFadeDuration).setListener(animatorListener);
        }

        @Override // com.xuexiang.xui.widget.popupwindow.ViewTooltip.TooltipAnimation
        public void animateExit(View view, Animator.AnimatorListener animatorListener) {
            view.animate().alpha(IGoodView.DEFAULT_TO_ALPHA).setDuration(this.mFadeDuration).setListener(animatorListener);
        }

        public FadeTooltipAnimation(long j4) {
            this.mFadeDuration = j4;
        }
    }

    public ViewTooltip customView(int i4) {
        this.mTooltipView.setCustomView(((Activity) this.mView.getContext()).findViewById(i4));
        return this;
    }
}
