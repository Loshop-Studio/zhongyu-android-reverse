package com.xuexiang.xui.widget.textview.supertextview;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.widget.alpha.IAlphaViewHelper;
import com.xuexiang.xui.widget.alpha.XUIAlphaViewHelper;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class SuperButton extends AppCompatButton {
    public static final int BL_TR = 5;
    public static final int BOTTOM_TOP = 4;
    public static final int BR_TL = 3;
    public static final int LEFT_RIGHT = 6;
    public static final int LINE = 2;
    public static final int OVAL = 1;
    public static final int RECTANGLE = 0;
    public static final int RIGHT_LEFT = 2;
    public static final int RING = 3;
    public static final int TEXT_GRAVITY_BOTTOM = 4;
    public static final int TEXT_GRAVITY_CENTER = 0;
    public static final int TEXT_GRAVITY_LEFT = 1;
    public static final int TEXT_GRAVITY_RIGHT = 2;
    public static final int TEXT_GRAVITY_TOP = 3;
    public static final int TL_BR = 7;
    public static final int TOP_BOTTOM = 0;
    public static final int TR_BL = 1;
    private static final int linear = 0;
    private static final int radial = 1;
    private static final int sweep = 2;
    private float cornersBottomLeftRadius;
    private float cornersBottomRightRadius;
    private float cornersRadius;
    private float cornersTopLeftRadius;
    private float cornersTopRightRadius;
    private int defaultColor;
    private int defaultSelectorColor;
    private int gradientAngle;
    private int gradientCenterColor;
    private int gradientCenterX;
    private int gradientCenterY;
    private GradientDrawable gradientDrawable;
    private int gradientEndColor;
    private int gradientGradientRadius;
    private int gradientOrientation;
    private int gradientStartColor;
    private int gradientType;
    private boolean gradientUseLevel;
    private int gravity;
    private IAlphaViewHelper mAlphaViewHelper;
    private Context mContext;
    private int selectorDisableColor;
    private int selectorNormalColor;
    private int selectorPressedColor;
    private int shapeType;
    private int sizeHeight;
    private int sizeWidth;
    private int solidColor;
    private int strokeColor;
    private float strokeDashGap;
    private float strokeDashWidth;
    private int strokeWidth;
    private boolean useSelector;

    public SuperButton(Context context) {
        super(context);
        this.defaultColor = 536870912;
        this.defaultSelectorColor = 536870912;
        initAttrs(context, null);
    }

    private int dip2px(Context context, float f4) {
        return (int) ((f4 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private IAlphaViewHelper getAlphaViewHelper() {
        if (this.mAlphaViewHelper == null) {
            this.mAlphaViewHelper = new XUIAlphaViewHelper(this);
        }
        return this.mAlphaViewHelper;
    }

    private void getAttr(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = this.mContext.obtainStyledAttributes(attributeSet, C2042R.styleable.SuperButton);
        this.gravity = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.SuperButton_sGravity, 0);
        this.shapeType = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.SuperButton_sShapeType, 0);
        this.solidColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.SuperButton_sSolidColor, this.defaultColor);
        this.selectorPressedColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.SuperButton_sSelectorPressedColor, this.defaultSelectorColor);
        this.selectorDisableColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.SuperButton_sSelectorDisableColor, this.defaultSelectorColor);
        this.selectorNormalColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.SuperButton_sSelectorNormalColor, this.defaultSelectorColor);
        this.cornersRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperButton_sCornersRadius, 0);
        this.cornersTopLeftRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperButton_sCornersTopLeftRadius, 0);
        this.cornersTopRightRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperButton_sCornersTopRightRadius, 0);
        this.cornersBottomLeftRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperButton_sCornersBottomLeftRadius, 0);
        this.cornersBottomRightRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperButton_sCornersBottomRightRadius, 0);
        this.strokeWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperButton_sStrokeWidth, 0);
        this.strokeDashWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperButton_sStrokeDashWidth, 0);
        this.strokeDashGap = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperButton_sStrokeDashGap, 0);
        this.strokeColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.SuperButton_sStrokeColor, this.defaultColor);
        this.sizeWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperButton_sSizeWidth, 0);
        this.sizeHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperButton_sSizeHeight, dip2px(this.mContext, 48.0f));
        this.gradientOrientation = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.SuperButton_sGradientOrientation, -1);
        this.gradientAngle = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperButton_sGradientAngle, 0);
        this.gradientCenterX = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperButton_sGradientCenterX, 0);
        this.gradientCenterY = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperButton_sGradientCenterY, 0);
        this.gradientGradientRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperButton_sGradientGradientRadius, 0);
        this.gradientStartColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.SuperButton_sGradientStartColor, -1);
        this.gradientCenterColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.SuperButton_sGradientCenterColor, -1);
        this.gradientEndColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.SuperButton_sGradientEndColor, -1);
        this.gradientType = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.SuperButton_sGradientType, 0);
        this.gradientUseLevel = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.SuperButton_sGradientUseLevel, false);
        this.useSelector = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.SuperButton_sUseSelector, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private GradientDrawable.Orientation getOrientation(int i4) {
        switch (i4) {
            case 0:
                return GradientDrawable.Orientation.TOP_BOTTOM;
            case 1:
                return GradientDrawable.Orientation.TR_BL;
            case 2:
                return GradientDrawable.Orientation.RIGHT_LEFT;
            case 3:
                return GradientDrawable.Orientation.BR_TL;
            case 4:
                return GradientDrawable.Orientation.BOTTOM_TOP;
            case 5:
                return GradientDrawable.Orientation.BL_TR;
            case 6:
                return GradientDrawable.Orientation.LEFT_RIGHT;
            case 7:
                return GradientDrawable.Orientation.TL_BR;
            default:
                return null;
        }
    }

    private void init() {
        setClickable(true);
        setBackground(this.useSelector ? getSelector() : getDrawable(0));
        setSGravity();
    }

    private void initAttrs(Context context, AttributeSet attributeSet) {
        this.mContext = context;
        getAttr(attributeSet);
        init();
    }

    private boolean isEnableChangeAlpha() {
        return isUseGradientColor() || this.selectorNormalColor == this.selectorPressedColor;
    }

    private boolean isUseGradientColor() {
        return this.gradientOrientation != -1;
    }

    private void setBorder() {
        this.gradientDrawable.setStroke(this.strokeWidth, this.strokeColor, this.strokeDashWidth, this.strokeDashGap);
    }

    private void setOrientation() {
        int i4;
        if (!isUseGradientColor()) {
            this.gradientDrawable.setColor(this.solidColor);
            return;
        }
        this.gradientDrawable.setOrientation(getOrientation(this.gradientOrientation));
        int i5 = this.gradientCenterColor;
        if (i5 == -1) {
            this.gradientDrawable.setColors(new int[]{this.gradientStartColor, this.gradientEndColor});
        } else {
            this.gradientDrawable.setColors(new int[]{this.gradientStartColor, i5, this.gradientEndColor});
        }
        int i6 = this.gradientType;
        if (i6 == 0) {
            this.gradientDrawable.setGradientType(0);
        } else if (i6 == 1) {
            this.gradientDrawable.setGradientType(1);
            this.gradientDrawable.setGradientRadius(this.gradientGradientRadius);
        } else if (i6 == 2) {
            this.gradientDrawable.setGradientType(2);
        }
        this.gradientDrawable.setUseLevel(this.gradientUseLevel);
        int i7 = this.gradientCenterX;
        if (i7 == 0 || (i4 = this.gradientCenterY) == 0) {
            return;
        }
        this.gradientDrawable.setGradientCenter(i7, i4);
    }

    private void setRadius() {
        if (this.shapeType == 0) {
            float f4 = this.cornersRadius;
            if (f4 != IGoodView.DEFAULT_TO_ALPHA) {
                this.gradientDrawable.setCornerRadius(f4);
                return;
            }
            GradientDrawable gradientDrawable = this.gradientDrawable;
            float f5 = this.cornersTopLeftRadius;
            float f6 = this.cornersTopRightRadius;
            float f7 = this.cornersBottomRightRadius;
            float f8 = this.cornersBottomLeftRadius;
            gradientDrawable.setCornerRadii(new float[]{f5, f5, f6, f6, f7, f7, f8, f8});
        }
    }

    private void setSGravity() {
        int i4 = this.gravity;
        if (i4 == 0) {
            setGravity(17);
            return;
        }
        if (i4 == 1) {
            setGravity(8388627);
            return;
        }
        if (i4 == 2) {
            setGravity(8388629);
        } else if (i4 == 3) {
            setGravity(49);
        } else {
            if (i4 != 4) {
                return;
            }
            setGravity(81);
        }
    }

    private void setSelectorColor(int i4) {
        if (this.gradientOrientation == -1) {
            if (i4 == -16842910) {
                this.gradientDrawable.setColor(this.selectorDisableColor);
            } else if (i4 == 16842910) {
                this.gradientDrawable.setColor(this.selectorNormalColor);
            } else {
                if (i4 != 16842919) {
                    return;
                }
                this.gradientDrawable.setColor(this.selectorPressedColor);
            }
        }
    }

    private void setShape() {
        int i4 = this.shapeType;
        if (i4 == 0) {
            this.gradientDrawable.setShape(0);
            return;
        }
        if (i4 == 1) {
            this.gradientDrawable.setShape(1);
        } else if (i4 == 2) {
            this.gradientDrawable.setShape(2);
        } else {
            if (i4 != 3) {
                return;
            }
            this.gradientDrawable.setShape(3);
        }
    }

    private void setSize() {
        if (this.shapeType == 0) {
            this.gradientDrawable.setSize(this.sizeWidth, this.sizeHeight);
        }
    }

    public GradientDrawable getDrawable(int i4) {
        this.gradientDrawable = new GradientDrawable();
        setShape();
        setOrientation();
        setSize();
        setBorder();
        setRadius();
        setSelectorColor(i4);
        return this.gradientDrawable;
    }

    public StateListDrawable getSelector() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed, R.attr.state_enabled}, getDrawable(R.attr.state_pressed));
        stateListDrawable.addState(new int[]{-16842910}, getDrawable(-16842910));
        stateListDrawable.addState(new int[0], getDrawable(R.attr.state_enabled));
        return stateListDrawable;
    }

    public void setChangeAlphaWhenDisable(boolean z3) {
        if (isEnableChangeAlpha()) {
            getAlphaViewHelper().setChangeAlphaWhenDisable(z3);
        }
    }

    public void setChangeAlphaWhenPress(boolean z3) {
        if (isEnableChangeAlpha()) {
            getAlphaViewHelper().setChangeAlphaWhenPress(z3);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
        if (isEnableChangeAlpha()) {
            getAlphaViewHelper().onEnabledChanged(this, z3);
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z3) {
        super.setPressed(z3);
        if (isEnableChangeAlpha()) {
            getAlphaViewHelper().onPressedChanged(this, z3);
        }
    }

    public SuperButton setShapeCornersBottomLeftRadius(float f4) {
        this.cornersBottomLeftRadius = dip2px(this.mContext, f4);
        return this;
    }

    public SuperButton setShapeCornersBottomRightRadius(float f4) {
        this.cornersBottomRightRadius = dip2px(this.mContext, f4);
        return this;
    }

    public SuperButton setShapeCornersRadius(float f4) {
        this.cornersRadius = dip2px(this.mContext, f4);
        return this;
    }

    public SuperButton setShapeCornersTopLeftRadius(float f4) {
        this.cornersTopLeftRadius = dip2px(this.mContext, f4);
        return this;
    }

    public SuperButton setShapeCornersTopRightRadius(float f4) {
        this.cornersTopRightRadius = dip2px(this.mContext, f4);
        return this;
    }

    public SuperButton setShapeGradientCenterColor(int i4) {
        this.gradientCenterColor = i4;
        return this;
    }

    public SuperButton setShapeGradientCenterX(int i4) {
        this.gradientCenterX = i4;
        return this;
    }

    public SuperButton setShapeGradientCenterY(int i4) {
        this.gradientCenterY = i4;
        return this;
    }

    public SuperButton setShapeGradientEndColor(int i4) {
        this.gradientEndColor = i4;
        return this;
    }

    public SuperButton setShapeGradientGradientRadius(int i4) {
        this.gradientGradientRadius = i4;
        return this;
    }

    public SuperButton setShapeGradientOrientation(int i4) {
        this.gradientOrientation = i4;
        return this;
    }

    public SuperButton setShapeGradientStartColor(int i4) {
        this.gradientStartColor = i4;
        return this;
    }

    public SuperButton setShapeGradientType(int i4) {
        this.gradientType = i4;
        return this;
    }

    public SuperButton setShapeGradientUseLevel(boolean z3) {
        this.gradientUseLevel = z3;
        return this;
    }

    public SuperButton setShapeSelectorDisableColor(int i4) {
        this.selectorDisableColor = i4;
        return this;
    }

    public SuperButton setShapeSelectorNormalColor(int i4) {
        this.selectorNormalColor = i4;
        return this;
    }

    public SuperButton setShapeSelectorPressedColor(int i4) {
        this.selectorPressedColor = i4;
        return this;
    }

    public SuperButton setShapeSizeHeight(int i4) {
        this.sizeHeight = i4;
        return this;
    }

    public SuperButton setShapeSizeWidth(int i4) {
        this.sizeWidth = i4;
        return this;
    }

    public SuperButton setShapeSolidColor(int i4) {
        this.solidColor = i4;
        return this;
    }

    public SuperButton setShapeStrokeColor(int i4) {
        this.strokeColor = i4;
        return this;
    }

    public SuperButton setShapeStrokeDashGap(float f4) {
        this.strokeDashGap = dip2px(this.mContext, f4);
        return this;
    }

    public SuperButton setShapeStrokeDashWidth(float f4) {
        this.strokeDashWidth = dip2px(this.mContext, f4);
        return this;
    }

    public SuperButton setShapeStrokeWidth(int i4) {
        this.strokeWidth = dip2px(this.mContext, i4);
        return this;
    }

    public SuperButton setShapeType(int i4) {
        this.shapeType = i4;
        return this;
    }

    public SuperButton setShapeUseSelector(boolean z3) {
        this.useSelector = z3;
        return this;
    }

    public SuperButton setTextGravity(int i4) {
        this.gravity = i4;
        return this;
    }

    public void setUseShape() {
        init();
    }

    public SuperButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.defaultColor = 536870912;
        this.defaultSelectorColor = 536870912;
        initAttrs(context, attributeSet);
    }

    public SuperButton(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.defaultColor = 536870912;
        this.defaultSelectorColor = 536870912;
        initAttrs(context, attributeSet);
    }
}
