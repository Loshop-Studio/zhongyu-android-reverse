package com.xuexiang.xui.widget.popupwindow.popup;

import android.content.Context;
import android.graphics.Point;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.XUI;
import com.xuexiang.xui.utils.ResUtils;

/* loaded from: classes.dex */
public class XUIPopup extends XUIBasePopup {
    public static final int ANIM_AUTO = 4;
    public static final int ANIM_GROW_FROM_CENTER = 3;
    public static final int ANIM_GROW_FROM_LEFT = 1;
    public static final int ANIM_GROW_FROM_RIGHT = 2;
    public static final int DIRECTION_BOTTOM = 1;
    public static final int DIRECTION_NONE = 2;
    public static final int DIRECTION_TOP = 0;
    protected int mAnimStyle;
    protected int mArrowCenter;
    protected ImageView mArrowDown;
    protected ImageView mArrowUp;
    protected int mDirection;
    private int mOffsetX;
    private int mOffsetYWhenBottom;
    private int mOffsetYWhenTop;
    private int mPopupLeftRightMinMargin;
    private int mPopupTopBottomMinMargin;
    private int mPreferredDirection;

    /* renamed from: mX */
    protected int f9695mX;

    /* renamed from: mY */
    protected int f9696mY;

    public XUIPopup(Context context) {
        this(context, 2);
    }

    private void calculatePosition(View view) {
        if (view == null) {
            Point point = this.mScreenSize;
            this.f9695mX = (point.x - this.mWindowWidth) / 2;
            this.f9696mY = (point.y - this.mWindowHeight) / 2;
            this.mDirection = 2;
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int width = iArr[0] + (view.getWidth() / 2);
        this.mArrowCenter = width;
        int i4 = this.mScreenSize.x;
        if (width < i4 / 2) {
            this.f9695mX = Math.max(width - (this.mWindowWidth / 2), this.mPopupLeftRightMinMargin);
        } else {
            int i5 = this.mWindowWidth;
            int i6 = (i5 / 2) + width;
            int i7 = this.mPopupLeftRightMinMargin;
            if (i6 < i4 - i7) {
                this.f9695mX = width - (i5 / 2);
            } else {
                this.f9695mX = (i4 - i7) - i5;
            }
        }
        int i8 = this.mPreferredDirection;
        this.mDirection = i8;
        if (i8 == 0) {
            int i9 = iArr[1] - this.mWindowHeight;
            this.f9696mY = i9;
            if (i9 < this.mPopupTopBottomMinMargin) {
                this.f9696mY = iArr[1] + view.getHeight();
                this.mDirection = 1;
                return;
            }
            return;
        }
        if (i8 != 1) {
            if (i8 != 2) {
                return;
            }
            this.f9696mY = iArr[1];
        } else {
            int height = iArr[1] + view.getHeight();
            this.f9696mY = height;
            if (height > this.mScreenSize.y - this.mPopupTopBottomMinMargin) {
                this.f9696mY = iArr[1] - this.mWindowHeight;
                this.mDirection = 0;
            }
        }
    }

    private void initAnimationStyle(int i4, int i5) {
        ImageView imageView = this.mArrowUp;
        if (imageView != null) {
            i5 -= imageView.getMeasuredWidth() / 2;
        }
        boolean z3 = this.mDirection == 0;
        int i6 = this.mAnimStyle;
        if (i6 == 1) {
            getPopupWindow().setAnimationStyle(z3 ? C2042R.style.XUI_Animation_PopUpMenu_Left : C2042R.style.XUI_Animation_PopDownMenu_Left);
            return;
        }
        if (i6 == 2) {
            getPopupWindow().setAnimationStyle(z3 ? C2042R.style.XUI_Animation_PopUpMenu_Right : C2042R.style.XUI_Animation_PopDownMenu_Right);
            return;
        }
        if (i6 == 3) {
            getPopupWindow().setAnimationStyle(z3 ? C2042R.style.XUI_Animation_PopUpMenu_Center : C2042R.style.XUI_Animation_PopDownMenu_Center);
            return;
        }
        if (i6 != 4) {
            return;
        }
        int i7 = i4 / 4;
        if (i5 <= i7) {
            getPopupWindow().setAnimationStyle(z3 ? C2042R.style.XUI_Animation_PopUpMenu_Left : C2042R.style.XUI_Animation_PopDownMenu_Left);
        } else if (i5 <= i7 || i5 >= i7 * 3) {
            getPopupWindow().setAnimationStyle(z3 ? C2042R.style.XUI_Animation_PopUpMenu_Right : C2042R.style.XUI_Animation_PopDownMenu_Right);
        } else {
            getPopupWindow().setAnimationStyle(z3 ? C2042R.style.XUI_Animation_PopUpMenu_Center : C2042R.style.XUI_Animation_PopDownMenu_Center);
        }
    }

    private void setViewVisibility(View view, boolean z3) {
        if (view != null) {
            view.setVisibility(z3 ? 0 : 4);
        }
    }

    private void showArrow() {
        ImageView imageView;
        int i4 = this.mDirection;
        if (i4 == 0) {
            setViewVisibility(this.mArrowDown, true);
            setViewVisibility(this.mArrowUp, false);
            imageView = this.mArrowDown;
        } else if (i4 != 1) {
            if (i4 == 2) {
                setViewVisibility(this.mArrowDown, false);
                setViewVisibility(this.mArrowUp, false);
            }
            imageView = null;
        } else {
            setViewVisibility(this.mArrowUp, true);
            setViewVisibility(this.mArrowDown, false);
            imageView = this.mArrowUp;
        }
        if (imageView != null) {
            int measuredWidth = this.mArrowUp.getMeasuredWidth();
            ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).leftMargin = (this.mArrowCenter - this.f9695mX) - (measuredWidth / 2);
        }
    }

    public ViewGroup.LayoutParams generateLayoutParam(int i4, int i5) {
        return new FrameLayout.LayoutParams(i4, i5);
    }

    protected int getPopupWidth() {
        int screenType = XUI.getScreenType();
        return screenType != 1 ? screenType != 2 ? screenType != 3 ? ResUtils.getDimensionPixelSize(C2042R.dimen.xui_popup_width_tablet_small) : ResUtils.getDimensionPixelSize(C2042R.dimen.xui_popup_width_tablet_big) : ResUtils.getDimensionPixelSize(C2042R.dimen.xui_popup_width_tablet_small) : ResUtils.getDimensionPixelSize(C2042R.dimen.xui_popup_width_phone);
    }

    @Override // com.xuexiang.xui.widget.popupwindow.popup.XUIBasePopup
    protected Point onShow(View view) {
        calculatePosition(view);
        showArrow();
        initAnimationStyle(this.mScreenSize.x, this.mArrowCenter);
        int i4 = this.mDirection;
        return new Point(this.f9695mX + this.mOffsetX, this.f9696mY + (i4 == 0 ? this.mOffsetYWhenTop : i4 == 1 ? this.mOffsetYWhenBottom : 0));
    }

    public void setAnimStyle(int i4) {
        this.mAnimStyle = i4;
    }

    @Override // com.xuexiang.xui.widget.popupwindow.popup.XUIBasePopup
    public void setContentView(View view) {
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(getContext()).inflate(C2042R.layout.xui_layout_popup, (ViewGroup) null, false);
        this.mArrowDown = (ImageView) frameLayout.findViewById(C2042R.id.arrow_down);
        this.mArrowUp = (ImageView) frameLayout.findViewById(C2042R.id.arrow_up);
        ((FrameLayout) frameLayout.findViewById(C2042R.id.box)).addView(view);
        super.setContentView(frameLayout);
    }

    public void setPopupLeftRightMinMargin(int i4) {
        this.mPopupLeftRightMinMargin = i4;
    }

    public void setPopupTopBottomMinMargin(int i4) {
        this.mPopupTopBottomMinMargin = i4;
    }

    public XUIPopup setPositionOffsetX(int i4) {
        this.mOffsetX = i4;
        return this;
    }

    public XUIPopup setPositionOffsetYWhenBottom(int i4) {
        this.mOffsetYWhenBottom = i4;
        return this;
    }

    public XUIPopup setPositionOffsetYWhenTop(int i4) {
        this.mOffsetYWhenTop = i4;
        return this;
    }

    public XUIPopup setPreferredDirection(int i4) {
        this.mPreferredDirection = i4;
        return this;
    }

    public void showDown(View view) {
        setPreferredDirection(1);
        show(view);
    }

    public void showUp(View view) {
        setPreferredDirection(0);
        show(view);
    }

    public XUIPopup(Context context, int i4) {
        super(context);
        this.mPopupLeftRightMinMargin = 0;
        this.mPopupTopBottomMinMargin = 0;
        this.f9695mX = -1;
        this.f9696mY = -1;
        this.mOffsetX = 0;
        this.mOffsetYWhenTop = 0;
        this.mOffsetYWhenBottom = 0;
        this.mAnimStyle = 4;
        this.mPreferredDirection = i4;
        this.mDirection = i4;
    }
}
