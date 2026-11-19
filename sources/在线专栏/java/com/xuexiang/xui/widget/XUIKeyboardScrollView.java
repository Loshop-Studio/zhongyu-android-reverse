package com.xuexiang.xui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ScrollView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.DensityUtils;
import com.xuexiang.xui.utils.KeyboardUtils;

/* loaded from: classes.dex */
public class XUIKeyboardScrollView extends ScrollView implements KeyboardUtils.SoftKeyboardToggleListener {
    private static final int DEFAULT_SCROLL_HEIGHT = 40;
    private boolean mAutoScroll;
    private int mScrollDelay;
    private int mScrollHeight;
    private boolean mScrollHide;

    public XUIKeyboardScrollView(Context context) {
        super(context);
        this.mScrollHide = true;
    }

    private void initAttrs(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.XUIKeyboardScrollView);
        if (typedArrayObtainStyledAttributes != null) {
            this.mAutoScroll = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.XUIKeyboardScrollView_ksv_auto_scroll, false);
            this.mScrollHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.XUIKeyboardScrollView_ksv_scroll_height, DensityUtils.dp2px(getContext(), 40.0f));
            this.mScrollDelay = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.XUIKeyboardScrollView_ksv_scroll_delay, 100);
            this.mScrollHide = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.XUIKeyboardScrollView_ksv_scroll_hide, true);
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.mAutoScroll) {
            KeyboardUtils.addKeyboardToggleListener(this, this);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        if (this.mAutoScroll) {
            KeyboardUtils.removeKeyboardToggleListener(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onScrollChanged(int i4, int i5, int i6, int i7) {
        super.onScrollChanged(i4, i5, i6, i7);
        if (this.mScrollHide) {
            KeyboardUtils.hideSoftInput(this);
        }
    }

    @Override // com.xuexiang.xui.utils.KeyboardUtils.SoftKeyboardToggleListener
    public void onToggleSoftKeyboard(boolean z3) {
        if (z3) {
            postDelayed(new Runnable() { // from class: com.xuexiang.xui.widget.XUIKeyboardScrollView.1
                @Override // java.lang.Runnable
                public void run() {
                    XUIKeyboardScrollView xUIKeyboardScrollView = XUIKeyboardScrollView.this;
                    xUIKeyboardScrollView.smoothScrollTo(0, xUIKeyboardScrollView.getScrollY() + XUIKeyboardScrollView.this.mScrollHeight);
                }
            }, this.mScrollDelay);
        } else {
            postDelayed(new Runnable() { // from class: com.xuexiang.xui.widget.XUIKeyboardScrollView.2
                @Override // java.lang.Runnable
                public void run() {
                    XUIKeyboardScrollView.this.smoothScrollTo(0, 0);
                }
            }, this.mScrollDelay);
        }
    }

    public XUIKeyboardScrollView setIsScrollHideKeyboard(boolean z3) {
        this.mScrollHide = z3;
        return this;
    }

    public XUIKeyboardScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initAttrs(context, attributeSet);
    }

    public XUIKeyboardScrollView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        initAttrs(context, attributeSet);
    }
}
