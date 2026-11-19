.class public Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;
.super Landroid/widget/CompoundButton;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton$SavedState;
    }
.end annotation


# static fields
.field private static CHECKED_PRESSED_STATE:[I = null

.field public static final DEFAULT_ANIMATION_DURATION:I = 0xfa

.field public static final DEFAULT_THUMB_MARGIN_DP:I = 0x2

.field public static final DEFAULT_THUMB_RANGE_RATIO:F = 1.8f

.field public static final DEFAULT_THUMB_SIZE_DP:I = 0x14

.field public static final DEFAULT_TINT_COLOR:I = 0x327fc2

.field private static UNCHECKED_PRESSED_STATE:[I


# instance fields
.field private mAnimationDuration:J

.field private mBackColor:Landroid/content/res/ColorStateList;

.field private mBackDrawable:Landroid/graphics/drawable/Drawable;

.field private mBackHeight:I

.field private mBackRadius:F

.field private mBackRectF:Landroid/graphics/RectF;

.field private mBackWidth:I

.field private mCatch:Z

.field private mChildOnCheckedChangeListener:Landroid/widget/CompoundButton$OnCheckedChangeListener;

.field private mClickTimeout:I

.field private mCurrBackColor:I

.field private mCurrThumbColor:I

.field private mCurrentBackDrawable:Landroid/graphics/drawable/Drawable;

.field private mDrawDebugRect:Z

.field private mFadeBack:Z

.field private mIsBackUseDrawable:Z

.field private mIsThumbUseDrawable:Z

.field private mLastX:F

.field private mNextBackColor:I

.field private mNextBackDrawable:Landroid/graphics/drawable/Drawable;

.field private mOffLayout:Landroid/text/Layout;

.field private mOffTextColor:I

.field private mOnLayout:Landroid/text/Layout;

.field private mOnTextColor:I

.field private mPaint:Landroid/graphics/Paint;

.field private mPresentThumbRectF:Landroid/graphics/RectF;

.field private mProgress:F

.field private mProgressAnimator:Landroid/animation/ObjectAnimator;

.field private mReady:Z

.field private mRectPaint:Landroid/graphics/Paint;

.field private mRestoring:Z

.field private mSafeRectF:Landroid/graphics/RectF;

.field private mStartX:F

.field private mStartY:F

.field private mTextAdjust:I

.field private mTextExtra:I

.field private mTextHeight:F

.field private mTextOff:Ljava/lang/CharSequence;

.field private mTextOffRectF:Landroid/graphics/RectF;

.field private mTextOn:Ljava/lang/CharSequence;

.field private mTextOnRectF:Landroid/graphics/RectF;

.field private mTextPaint:Landroid/text/TextPaint;

.field private mTextThumbInset:I

.field private mTextWidth:F

.field private mThumbColor:Landroid/content/res/ColorStateList;

.field private mThumbDrawable:Landroid/graphics/drawable/Drawable;

.field private mThumbHeight:I

.field private mThumbMargin:Landroid/graphics/RectF;

.field private mThumbRadius:F

.field private mThumbRangeRatio:F

.field private mThumbRectF:Landroid/graphics/RectF;

.field private mThumbWidth:I

.field private mTintColor:I

.field private mTouchSlop:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x3

    new-array v1, v0, [I

    .line 1
    fill-array-data v1, :array_0

    sput-object v1, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->CHECKED_PRESSED_STATE:[I

    new-array v0, v0, [I

    .line 2
    fill-array-data v0, :array_1

    sput-object v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->UNCHECKED_PRESSED_STATE:[I

    return-void

    :array_0
    .array-data 4
        0x10100a0
        0x101009e
        0x10100a7
    .end array-data

    :array_1
    .array-data 4
        -0x10100a0
        0x101009e
        0x10100a7
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 13
    invoke-direct {p0, p1}, Landroid/widget/CompoundButton;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    .line 14
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mDrawDebugRect:Z

    .line 15
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mRestoring:Z

    .line 16
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mReady:Z

    .line 17
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mCatch:Z

    const/4 v0, 0x0

    .line 18
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 7
    invoke-direct {p0, p1, p2}, Landroid/widget/CompoundButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mDrawDebugRect:Z

    .line 9
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mRestoring:Z

    .line 10
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mReady:Z

    .line 11
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mCatch:Z

    .line 12
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/CompoundButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p3, 0x0

    .line 2
    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mDrawDebugRect:Z

    .line 3
    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mRestoring:Z

    .line 4
    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mReady:Z

    .line 5
    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mCatch:Z

    .line 6
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private catchView()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 3
    :cond_0
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mCatch:Z

    return-void
.end method

.method private ceil(D)I
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide p1

    double-to-int p1, p1

    return p1
.end method

.method private getProgress()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mProgress:F

    return v0
.end method

.method private getStatusBasedOnPos()Z
    .locals 2

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->getProgress()F

    move-result v0

    const/high16 v1, 0x3f000000    # 0.5f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private init(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 1
    invoke-static/range {p1 .. p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v3

    iput v3, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTouchSlop:I

    .line 2
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    move-result v3

    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    move-result v4

    add-int/2addr v3, v4

    iput v3, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mClickTimeout:I

    .line 3
    new-instance v3, Landroid/graphics/Paint;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v3, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mPaint:Landroid/graphics/Paint;

    .line 4
    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3, v4}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v3, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mRectPaint:Landroid/graphics/Paint;

    .line 5
    sget-object v5, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 6
    iget-object v3, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mRectPaint:Landroid/graphics/Paint;

    invoke-virtual/range {p0 .. p0}, Landroid/widget/CompoundButton;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 7
    invoke-virtual/range {p0 .. p0}, Landroid/widget/CompoundButton;->getPaint()Landroid/text/TextPaint;

    move-result-object v3

    iput-object v3, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextPaint:Landroid/text/TextPaint;

    .line 8
    new-instance v3, Landroid/graphics/RectF;

    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    iput-object v3, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbRectF:Landroid/graphics/RectF;

    .line 9
    new-instance v3, Landroid/graphics/RectF;

    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    iput-object v3, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackRectF:Landroid/graphics/RectF;

    .line 10
    new-instance v3, Landroid/graphics/RectF;

    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    iput-object v3, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mSafeRectF:Landroid/graphics/RectF;

    .line 11
    new-instance v3, Landroid/graphics/RectF;

    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    iput-object v3, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbMargin:Landroid/graphics/RectF;

    .line 12
    new-instance v3, Landroid/graphics/RectF;

    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    iput-object v3, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextOnRectF:Landroid/graphics/RectF;

    .line 13
    new-instance v3, Landroid/graphics/RectF;

    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    iput-object v3, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextOffRectF:Landroid/graphics/RectF;

    const/4 v3, 0x2

    new-array v5, v3, [F

    .line 14
    fill-array-data v5, :array_0

    const-string v6, "progress"

    invoke-static {v0, v6, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v5

    const-wide/16 v6, 0xfa

    invoke-virtual {v5, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v5

    iput-object v5, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mProgressAnimator:Landroid/animation/ObjectAnimator;

    .line 15
    new-instance v6, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v6}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    invoke-virtual {v5, v6}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 16
    new-instance v5, Landroid/graphics/RectF;

    invoke-direct {v5}, Landroid/graphics/RectF;-><init>()V

    iput-object v5, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mPresentThumbRectF:Landroid/graphics/RectF;

    .line 17
    invoke-virtual/range {p0 .. p0}, Landroid/widget/CompoundButton;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    .line 18
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    const/high16 v6, 0x40000000    # 2.0f

    mul-float v5, v5, v6

    .line 19
    sget-object v6, Lcom/xuexiang/xui/R$styleable;->SwitchButton:[I

    invoke-virtual {v1, v2, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v6

    .line 20
    sget v7, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_thumbDrawable:I

    invoke-static {v1, v6, v7}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    .line 21
    sget v8, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_thumbColor:I

    invoke-static {v1, v6, v8}, Lcom/xuexiang/xui/utils/ResUtils;->getColorStateListAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v8

    .line 22
    sget v9, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_thumbMargin:I

    invoke-virtual {v6, v9, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v5

    .line 23
    sget v9, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_thumbMarginLeft:I

    invoke-virtual {v6, v9, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v9

    .line 24
    sget v10, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_thumbMarginRight:I

    invoke-virtual {v6, v10, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v10

    .line 25
    sget v11, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_thumbMarginTop:I

    invoke-virtual {v6, v11, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v11

    .line 26
    sget v12, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_thumbMarginBottom:I

    invoke-virtual {v6, v12, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v5

    .line 27
    sget v12, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_thumbWidth:I

    const/4 v13, 0x0

    invoke-virtual {v6, v12, v13}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v12

    .line 28
    sget v14, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_thumbHeight:I

    invoke-virtual {v6, v14, v13}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v14

    .line 29
    sget v15, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_thumbRadius:I

    const/high16 v13, -0x40800000    # -1.0f

    invoke-virtual {v6, v15, v13}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v15

    .line 30
    sget v3, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_backRadius:I

    invoke-virtual {v6, v3, v13}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v3

    .line 31
    sget v13, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_backDrawable:I

    invoke-static {v1, v6, v13}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v13

    .line 32
    sget v4, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_backColor:I

    invoke-static {v1, v6, v4}, Lcom/xuexiang/xui/utils/ResUtils;->getColorStateListAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v4

    move/from16 v16, v3

    .line 33
    sget v3, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_thumbRangeRatio:I

    move/from16 v17, v15

    const v15, 0x3fe66666    # 1.8f

    invoke-virtual {v6, v3, v15}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    .line 34
    sget v15, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_animationDuration:I

    move/from16 v18, v3

    const/16 v3, 0xfa

    invoke-virtual {v6, v15, v3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v3

    .line 35
    sget v15, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_fadeBack:I

    move/from16 v19, v3

    const/4 v3, 0x1

    invoke-virtual {v6, v15, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v15

    .line 36
    sget v3, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_tintColor:I

    move/from16 v20, v15

    const/4 v15, 0x0

    invoke-virtual {v6, v3, v15}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    .line 37
    sget v15, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_textOn:I

    invoke-virtual {v6, v15}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v15

    move/from16 v22, v5

    .line 38
    sget v5, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_textOff:I

    invoke-virtual {v6, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    move/from16 v23, v9

    .line 39
    sget v9, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_textThumbInset:I

    move/from16 v24, v10

    const/4 v10, 0x0

    invoke-virtual {v6, v9, v10}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v9

    move/from16 v21, v11

    .line 40
    sget v11, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_textExtra:I

    invoke-virtual {v6, v11, v10}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v11

    move-object/from16 v25, v4

    .line 41
    sget v4, Lcom/xuexiang/xui/R$styleable;->SwitchButton_swb_textAdjust:I

    invoke-virtual {v6, v4, v10}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    .line 42
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    const/4 v6, 0x2

    new-array v6, v6, [I

    .line 43
    fill-array-data v6, :array_1

    invoke-virtual {v1, v2, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    const/4 v6, 0x1

    .line 44
    invoke-virtual {v2, v10, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    .line 45
    invoke-virtual {v2, v6, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v10

    .line 46
    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setFocusable(Z)V

    .line 47
    invoke-virtual {v0, v10}, Landroid/widget/CompoundButton;->setClickable(Z)V

    .line 48
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 49
    iput-object v15, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextOn:Ljava/lang/CharSequence;

    .line 50
    iput-object v5, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextOff:Ljava/lang/CharSequence;

    .line 51
    iput v9, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextThumbInset:I

    .line 52
    iput v11, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextExtra:I

    .line 53
    iput v4, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextAdjust:I

    .line 54
    iput-object v7, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbDrawable:Landroid/graphics/drawable/Drawable;

    .line 55
    iput-object v8, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbColor:Landroid/content/res/ColorStateList;

    if-eqz v7, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 56
    :goto_0
    iput-boolean v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mIsThumbUseDrawable:Z

    .line 57
    iput v3, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTintColor:I

    if-nez v3, :cond_2

    .line 58
    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    .line 59
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    sget v3, Lcom/xuexiang/xui/R$attr;->colorAccent:I

    const/4 v4, 0x1

    invoke-virtual {v2, v3, v1, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 60
    iget v1, v1, Landroid/util/TypedValue;->data:I

    iput v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTintColor:I

    goto :goto_1

    :cond_1
    const v1, 0x327fc2

    .line 61
    iput v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTintColor:I

    goto :goto_1

    :cond_2
    const/4 v4, 0x1

    .line 62
    :goto_1
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mIsThumbUseDrawable:Z

    if-nez v1, :cond_3

    iget-object v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbColor:Landroid/content/res/ColorStateList;

    if-nez v1, :cond_3

    .line 63
    iget v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTintColor:I

    invoke-static {v1}, Lcom/xuexiang/xui/widget/button/switchbutton/ColorUtils;->generateThumbColorWithTintColor(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    iput-object v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbColor:Landroid/content/res/ColorStateList;

    .line 64
    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v1

    iput v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mCurrThumbColor:I

    :cond_3
    float-to-double v1, v12

    .line 65
    invoke-direct {v0, v1, v2}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->ceil(D)I

    move-result v1

    iput v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbWidth:I

    float-to-double v1, v14

    .line 66
    invoke-direct {v0, v1, v2}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->ceil(D)I

    move-result v1

    iput v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbHeight:I

    .line 67
    iput-object v13, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackDrawable:Landroid/graphics/drawable/Drawable;

    move-object/from16 v1, v25

    .line 68
    iput-object v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackColor:Landroid/content/res/ColorStateList;

    if-eqz v13, :cond_4

    goto :goto_2

    :cond_4
    const/4 v4, 0x0

    .line 69
    :goto_2
    iput-boolean v4, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mIsBackUseDrawable:Z

    if-nez v4, :cond_5

    if-nez v1, :cond_5

    .line 70
    iget v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTintColor:I

    invoke-static {v1}, Lcom/xuexiang/xui/widget/button/switchbutton/ColorUtils;->generateBackColorWithTintColor(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    iput-object v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackColor:Landroid/content/res/ColorStateList;

    .line 71
    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v1

    iput v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mCurrBackColor:I

    .line 72
    iget-object v2, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackColor:Landroid/content/res/ColorStateList;

    sget-object v3, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->CHECKED_PRESSED_STATE:[I

    invoke-virtual {v2, v3, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v1

    iput v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mNextBackColor:I

    .line 73
    :cond_5
    iget-object v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbMargin:Landroid/graphics/RectF;

    move/from16 v4, v21

    move/from16 v5, v22

    move/from16 v2, v23

    move/from16 v3, v24

    invoke-virtual {v1, v2, v4, v3, v5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 74
    iget-object v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbMargin:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    cmpl-float v1, v1, v3

    if-ltz v1, :cond_6

    move/from16 v1, v18

    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v3

    goto :goto_3

    :cond_6
    move/from16 v1, v18

    move v3, v1

    :goto_3
    iput v3, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbRangeRatio:F

    move/from16 v1, v17

    .line 75
    iput v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbRadius:F

    move/from16 v1, v16

    .line 76
    iput v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackRadius:F

    move/from16 v1, v19

    int-to-long v3, v1

    .line 77
    iput-wide v3, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mAnimationDuration:J

    move/from16 v1, v20

    .line 78
    iput-boolean v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mFadeBack:Z

    .line 79
    iget-object v1, v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mProgressAnimator:Landroid/animation/ObjectAnimator;

    invoke-virtual {v1, v3, v4}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 80
    invoke-virtual/range {p0 .. p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 81
    invoke-direct {v0, v2}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setProgress(F)V

    :cond_7
    return-void

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x10100da
        0x10100e5
    .end array-data
.end method

.method private makeLayout(Ljava/lang/CharSequence;)Landroid/text/Layout;
    .locals 9

    new-instance v8, Landroid/text/StaticLayout;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextPaint:Landroid/text/TextPaint;

    invoke-static {p1, v2}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;Landroid/text/TextPaint;)F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v3, v0

    sget-object v4, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, v8

    move-object v1, p1

    invoke-direct/range {v0 .. v7}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    return-object v8
.end method

.method private measureHeight(I)I
    .locals 5

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 2
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p1

    .line 3
    iget v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbHeight:I

    if-nez v1, :cond_0

    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mIsThumbUseDrawable:Z

    if-eqz v1, :cond_0

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbHeight:I

    :cond_0
    const/high16 v1, 0x40000000    # 2.0f

    const/4 v2, 0x0

    if-ne p1, v1, :cond_4

    .line 5
    iget p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbHeight:I

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    int-to-float p1, p1

    .line 6
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbMargin:Landroid/graphics/RectF;

    iget v4, v3, Landroid/graphics/RectF;->top:F

    add-float/2addr p1, v4

    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    add-float/2addr p1, v3

    float-to-double v3, p1

    invoke-direct {p0, v3, v4}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->ceil(D)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackHeight:I

    int-to-float p1, p1

    .line 7
    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextHeight:F

    invoke-static {p1, v3}, Ljava/lang/Math;->max(FF)F

    move-result p1

    float-to-double v3, p1

    invoke-direct {p0, v3, v4}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->ceil(D)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackHeight:I

    .line 8
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getPaddingTop()I

    move-result v3

    add-int/2addr p1, v3

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getPaddingBottom()I

    move-result v3

    add-int/2addr p1, v3

    int-to-float p1, p1

    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbMargin:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->top:F

    invoke-static {v1, v3}, Ljava/lang/Math;->min(FF)F

    move-result v3

    sub-float/2addr p1, v3

    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbMargin:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    invoke-static {v1, v3}, Ljava/lang/Math;->min(FF)F

    move-result v3

    sub-float/2addr p1, v3

    int-to-float v3, v0

    cmpl-float p1, p1, v3

    if-lez p1, :cond_1

    .line 9
    iput v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbHeight:I

    .line 10
    :cond_1
    iget p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbHeight:I

    if-nez p1, :cond_3

    .line 11
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getPaddingTop()I

    move-result p1

    sub-int p1, v0, p1

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getPaddingBottom()I

    move-result v3

    sub-int/2addr p1, v3

    int-to-float p1, p1

    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbMargin:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->top:F

    invoke-static {v1, v3}, Ljava/lang/Math;->min(FF)F

    move-result v3

    add-float/2addr p1, v3

    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbMargin:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    invoke-static {v1, v3}, Ljava/lang/Math;->min(FF)F

    move-result v1

    add-float/2addr p1, v1

    float-to-double v3, p1

    invoke-direct {p0, v3, v4}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->ceil(D)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackHeight:I

    if-gez p1, :cond_2

    .line 12
    iput v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackHeight:I

    .line 13
    iput v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbHeight:I

    return v0

    :cond_2
    int-to-float p1, p1

    .line 14
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbMargin:Landroid/graphics/RectF;

    iget v3, v1, Landroid/graphics/RectF;->top:F

    sub-float/2addr p1, v3

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr p1, v1

    float-to-double v3, p1

    invoke-direct {p0, v3, v4}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->ceil(D)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbHeight:I

    .line 15
    :cond_3
    iget p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbHeight:I

    if-gez p1, :cond_8

    .line 16
    iput v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackHeight:I

    .line 17
    iput v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbHeight:I

    return v0

    .line 18
    :cond_4
    iget p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbHeight:I

    if-nez p1, :cond_5

    .line 19
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    const/high16 v1, 0x41a00000    # 20.0f

    mul-float p1, p1, v1

    float-to-double v3, p1

    invoke-direct {p0, v3, v4}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->ceil(D)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbHeight:I

    .line 20
    :cond_5
    iget p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbHeight:I

    int-to-float p1, p1

    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbMargin:Landroid/graphics/RectF;

    iget v3, v1, Landroid/graphics/RectF;->top:F

    add-float/2addr p1, v3

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    add-float/2addr p1, v1

    float-to-double v3, p1

    invoke-direct {p0, v3, v4}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->ceil(D)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackHeight:I

    if-gez p1, :cond_6

    .line 21
    iput v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackHeight:I

    .line 22
    iput v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbHeight:I

    return v0

    .line 23
    :cond_6
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextHeight:F

    int-to-float p1, p1

    sub-float/2addr v0, p1

    float-to-double v0, v0

    invoke-direct {p0, v0, v1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->ceil(D)I

    move-result p1

    if-lez p1, :cond_7

    .line 24
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackHeight:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackHeight:I

    .line 25
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbHeight:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbHeight:I

    .line 26
    :cond_7
    iget p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbHeight:I

    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackHeight:I

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 27
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getPaddingTop()I

    move-result v0

    add-int/2addr v0, p1

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getPaddingBottom()I

    move-result v1

    add-int/2addr v0, v1

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 28
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getSuggestedMinimumHeight()I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    :cond_8
    return v0
.end method

.method private measureWidth(I)I
    .locals 9

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 2
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p1

    .line 3
    iget v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbWidth:I

    if-nez v1, :cond_0

    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mIsThumbUseDrawable:Z

    if-eqz v1, :cond_0

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbWidth:I

    .line 5
    :cond_0
    iget v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextWidth:F

    float-to-double v1, v1

    invoke-direct {p0, v1, v2}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->ceil(D)I

    move-result v1

    .line 6
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbRangeRatio:F

    const v3, 0x3fe66666    # 1.8f

    const/4 v4, 0x0

    cmpl-float v2, v2, v4

    if-nez v2, :cond_1

    .line 7
    iput v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbRangeRatio:F

    :cond_1
    const/high16 v2, 0x40000000    # 2.0f

    const/4 v5, 0x0

    if-ne p1, v2, :cond_7

    .line 8
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getPaddingLeft()I

    move-result p1

    sub-int p1, v0, p1

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getPaddingRight()I

    move-result v2

    sub-int/2addr p1, v2

    .line 9
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbWidth:I

    if-eqz v2, :cond_3

    int-to-float v2, v2

    .line 10
    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbRangeRatio:F

    mul-float v2, v2, v3

    float-to-double v2, v2

    invoke-direct {p0, v2, v3}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->ceil(D)I

    move-result v2

    .line 11
    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextExtra:I

    add-int/2addr v3, v1

    iget v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbWidth:I

    sub-int v6, v2, v6

    iget-object v7, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbMargin:Landroid/graphics/RectF;

    iget v8, v7, Landroid/graphics/RectF;->left:F

    iget v7, v7, Landroid/graphics/RectF;->right:F

    invoke-static {v8, v7}, Ljava/lang/Math;->max(FF)F

    move-result v7

    float-to-double v7, v7

    invoke-direct {p0, v7, v8}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->ceil(D)I

    move-result v7

    add-int/2addr v6, v7

    sub-int/2addr v3, v6

    int-to-float v2, v2

    .line 12
    iget-object v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbMargin:Landroid/graphics/RectF;

    iget v7, v6, Landroid/graphics/RectF;->left:F

    add-float/2addr v7, v2

    iget v6, v6, Landroid/graphics/RectF;->right:F

    add-float/2addr v7, v6

    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v6

    int-to-float v6, v6

    add-float/2addr v7, v6

    float-to-double v6, v7

    invoke-direct {p0, v6, v7}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->ceil(D)I

    move-result v6

    iput v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackWidth:I

    if-gez v6, :cond_2

    .line 13
    iput v5, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbWidth:I

    .line 14
    :cond_2
    iget-object v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbMargin:Landroid/graphics/RectF;

    iget v6, v6, Landroid/graphics/RectF;->left:F

    invoke-static {v6, v4}, Ljava/lang/Math;->max(FF)F

    move-result v6

    add-float/2addr v2, v6

    iget-object v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbMargin:Landroid/graphics/RectF;

    iget v6, v6, Landroid/graphics/RectF;->right:F

    invoke-static {v6, v4}, Ljava/lang/Math;->max(FF)F

    move-result v6

    add-float/2addr v2, v6

    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v2, v3

    int-to-float p1, p1

    cmpl-float p1, v2, p1

    if-lez p1, :cond_3

    .line 15
    iput v5, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbWidth:I

    .line 16
    :cond_3
    iget p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbWidth:I

    if-nez p1, :cond_b

    .line 17
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getPaddingLeft()I

    move-result p1

    sub-int p1, v0, p1

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getPaddingRight()I

    move-result v2

    sub-int/2addr p1, v2

    int-to-float p1, p1

    .line 18
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbMargin:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->left:F

    invoke-static {v2, v4}, Ljava/lang/Math;->max(FF)F

    move-result v2

    sub-float/2addr p1, v2

    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbMargin:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->right:F

    invoke-static {v2, v4}, Ljava/lang/Math;->max(FF)F

    move-result v2

    sub-float/2addr p1, v2

    float-to-double v2, p1

    invoke-direct {p0, v2, v3}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->ceil(D)I

    move-result p1

    if-gez p1, :cond_4

    .line 19
    iput v5, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbWidth:I

    .line 20
    iput v5, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackWidth:I

    return v0

    :cond_4
    int-to-float v2, p1

    .line 21
    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbRangeRatio:F

    div-float v3, v2, v3

    float-to-double v3, v3

    invoke-direct {p0, v3, v4}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->ceil(D)I

    move-result v3

    iput v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbWidth:I

    .line 22
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbMargin:Landroid/graphics/RectF;

    iget v4, v3, Landroid/graphics/RectF;->left:F

    add-float/2addr v2, v4

    iget v3, v3, Landroid/graphics/RectF;->right:F

    add-float/2addr v2, v3

    float-to-double v2, v2

    invoke-direct {p0, v2, v3}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->ceil(D)I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackWidth:I

    if-gez v2, :cond_5

    .line 23
    iput v5, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbWidth:I

    .line 24
    iput v5, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackWidth:I

    return v0

    .line 25
    :cond_5
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextExtra:I

    add-int/2addr v1, v2

    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbWidth:I

    sub-int/2addr p1, v2

    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbMargin:Landroid/graphics/RectF;

    iget v3, v2, Landroid/graphics/RectF;->left:F

    iget v2, v2, Landroid/graphics/RectF;->right:F

    invoke-static {v3, v2}, Ljava/lang/Math;->max(FF)F

    move-result v2

    float-to-double v2, v2

    invoke-direct {p0, v2, v3}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->ceil(D)I

    move-result v2

    add-int/2addr p1, v2

    sub-int/2addr v1, p1

    if-lez v1, :cond_6

    .line 26
    iget p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbWidth:I

    sub-int/2addr p1, v1

    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbWidth:I

    .line 27
    :cond_6
    iget p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbWidth:I

    if-gez p1, :cond_b

    .line 28
    iput v5, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbWidth:I

    .line 29
    iput v5, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackWidth:I

    return v0

    .line 30
    :cond_7
    iget p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbWidth:I

    if-nez p1, :cond_8

    .line 31
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    const/high16 v2, 0x41a00000    # 20.0f

    mul-float p1, p1, v2

    float-to-double v6, p1

    invoke-direct {p0, v6, v7}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->ceil(D)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbWidth:I

    .line 32
    :cond_8
    iget p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbRangeRatio:F

    cmpl-float p1, p1, v4

    if-nez p1, :cond_9

    .line 33
    iput v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbRangeRatio:F

    .line 34
    :cond_9
    iget p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbWidth:I

    int-to-float p1, p1

    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbRangeRatio:F

    mul-float p1, p1, v2

    float-to-double v2, p1

    invoke-direct {p0, v2, v3}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->ceil(D)I

    move-result p1

    .line 35
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextExtra:I

    add-int/2addr v1, v2

    int-to-float v1, v1

    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbWidth:I

    sub-int v2, p1, v2

    int-to-float v2, v2

    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbMargin:Landroid/graphics/RectF;

    iget v6, v3, Landroid/graphics/RectF;->left:F

    iget v3, v3, Landroid/graphics/RectF;->right:F

    invoke-static {v6, v3}, Ljava/lang/Math;->max(FF)F

    move-result v3

    add-float/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextThumbInset:I

    int-to-float v3, v3

    add-float/2addr v2, v3

    sub-float/2addr v1, v2

    float-to-double v1, v1

    invoke-direct {p0, v1, v2}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->ceil(D)I

    move-result v1

    int-to-float p1, p1

    .line 36
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbMargin:Landroid/graphics/RectF;

    iget v3, v2, Landroid/graphics/RectF;->left:F

    add-float/2addr v3, p1

    iget v2, v2, Landroid/graphics/RectF;->right:F

    add-float/2addr v3, v2

    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v3, v2

    float-to-double v2, v3

    invoke-direct {p0, v2, v3}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->ceil(D)I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackWidth:I

    if-gez v2, :cond_a

    .line 37
    iput v5, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbWidth:I

    .line 38
    iput v5, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackWidth:I

    return v0

    .line 39
    :cond_a
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbMargin:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    invoke-static {v4, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    add-float/2addr p1, v0

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbMargin:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->right:F

    invoke-static {v4, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    add-float/2addr p1, v0

    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    int-to-float v0, v0

    add-float/2addr p1, v0

    float-to-double v0, p1

    invoke-direct {p0, v0, v1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->ceil(D)I

    move-result p1

    .line 40
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getPaddingLeft()I

    move-result v0

    add-int/2addr v0, p1

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getPaddingRight()I

    move-result v1

    add-int/2addr v0, v1

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    :cond_b
    return v0
.end method

.method private setDrawableState(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getDrawableState()[I

    move-result-object v0

    .line 2
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 3
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->invalidate()V

    :cond_0
    return-void
.end method

.method private setProgress(F)V
    .locals 3

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v2, p1, v1

    if-lez v2, :cond_0

    const/high16 p1, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    cmpg-float v1, p1, v0

    if-gez v1, :cond_1

    const/4 p1, 0x0

    .line 1
    :cond_1
    :goto_0
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mProgress:F

    .line 2
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->invalidate()V

    return-void
.end method

.method private setup()V
    .locals 9

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbWidth:I

    if-eqz v0, :cond_8

    iget v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbHeight:I

    if-eqz v1, :cond_8

    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackWidth:I

    if-eqz v2, :cond_8

    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackHeight:I

    if-nez v2, :cond_0

    goto/16 :goto_2

    .line 2
    :cond_0
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbRadius:F

    const/high16 v3, -0x40800000    # -1.0f

    const/high16 v4, 0x40000000    # 2.0f

    cmpl-float v2, v2, v3

    if-nez v2, :cond_1

    .line 3
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, v4

    iput v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbRadius:F

    .line 4
    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackRadius:F

    cmpl-float v0, v0, v3

    if-nez v0, :cond_2

    .line 5
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackWidth:I

    iget v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackHeight:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, v4

    iput v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackRadius:F

    .line 6
    :cond_2
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getPaddingLeft()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    .line 7
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    .line 8
    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackWidth:I

    int-to-float v2, v2

    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbMargin:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->left:F

    const/4 v5, 0x0

    invoke-static {v5, v3}, Ljava/lang/Math;->min(FF)F

    move-result v3

    sub-float/2addr v2, v3

    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbMargin:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->right:F

    invoke-static {v5, v3}, Ljava/lang/Math;->min(FF)F

    move-result v3

    sub-float/2addr v2, v3

    float-to-double v2, v2

    invoke-direct {p0, v2, v3}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->ceil(D)I

    move-result v2

    .line 9
    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackHeight:I

    int-to-float v3, v3

    iget-object v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbMargin:Landroid/graphics/RectF;

    iget v6, v6, Landroid/graphics/RectF;->top:F

    invoke-static {v5, v6}, Ljava/lang/Math;->min(FF)F

    move-result v6

    sub-float/2addr v3, v6

    iget-object v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbMargin:Landroid/graphics/RectF;

    iget v6, v6, Landroid/graphics/RectF;->bottom:F

    invoke-static {v5, v6}, Ljava/lang/Math;->min(FF)F

    move-result v6

    sub-float/2addr v3, v6

    float-to-double v6, v3

    invoke-direct {p0, v6, v7}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->ceil(D)I

    move-result v3

    const/4 v6, 0x1

    if-gt v1, v3, :cond_3

    .line 10
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getPaddingTop()I

    move-result v1

    int-to-float v1, v1

    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbMargin:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->top:F

    invoke-static {v5, v3}, Ljava/lang/Math;->max(FF)F

    move-result v3

    add-float/2addr v1, v3

    goto :goto_0

    .line 11
    :cond_3
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getPaddingTop()I

    move-result v7

    int-to-float v7, v7

    iget-object v8, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbMargin:Landroid/graphics/RectF;

    iget v8, v8, Landroid/graphics/RectF;->top:F

    invoke-static {v5, v8}, Ljava/lang/Math;->max(FF)F

    move-result v8

    add-float/2addr v7, v8

    sub-int/2addr v1, v3

    add-int/2addr v1, v6

    int-to-float v1, v1

    div-float/2addr v1, v4

    add-float/2addr v1, v7

    .line 12
    :goto_0
    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackWidth:I

    if-gt v0, v3, :cond_4

    .line 13
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getPaddingLeft()I

    move-result v0

    int-to-float v0, v0

    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbMargin:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->left:F

    invoke-static {v5, v2}, Ljava/lang/Math;->max(FF)F

    move-result v2

    add-float/2addr v0, v2

    goto :goto_1

    .line 14
    :cond_4
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getPaddingLeft()I

    move-result v3

    int-to-float v3, v3

    iget-object v7, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbMargin:Landroid/graphics/RectF;

    iget v7, v7, Landroid/graphics/RectF;->left:F

    invoke-static {v5, v7}, Ljava/lang/Math;->max(FF)F

    move-result v7

    add-float/2addr v3, v7

    sub-int/2addr v0, v2

    add-int/2addr v0, v6

    int-to-float v0, v0

    div-float/2addr v0, v4

    add-float/2addr v0, v3

    .line 15
    :goto_1
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbRectF:Landroid/graphics/RectF;

    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbWidth:I

    int-to-float v3, v3

    add-float/2addr v3, v0

    iget v7, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbHeight:I

    int-to-float v7, v7

    add-float/2addr v7, v1

    invoke-virtual {v2, v0, v1, v3, v7}, Landroid/graphics/RectF;->set(FFFF)V

    .line 16
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbRectF:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->left:F

    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbMargin:Landroid/graphics/RectF;

    iget v3, v2, Landroid/graphics/RectF;->left:F

    sub-float/2addr v1, v3

    .line 17
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackRectF:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->top:F

    iget v2, v2, Landroid/graphics/RectF;->top:F

    sub-float v7, v0, v2

    iget v8, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackWidth:I

    int-to-float v8, v8

    add-float/2addr v8, v1

    sub-float/2addr v0, v2

    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackHeight:I

    int-to-float v2, v2

    add-float/2addr v0, v2

    invoke-virtual {v3, v1, v7, v8, v0}, Landroid/graphics/RectF;->set(FFFF)V

    .line 18
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mSafeRectF:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbRectF:Landroid/graphics/RectF;

    iget v2, v1, Landroid/graphics/RectF;->left:F

    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackRectF:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->right:F

    iget-object v7, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbMargin:Landroid/graphics/RectF;

    iget v7, v7, Landroid/graphics/RectF;->right:F

    sub-float/2addr v3, v7

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    sub-float/2addr v3, v1

    invoke-virtual {v0, v2, v5, v3, v5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 19
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackRectF:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackRectF:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    div-float/2addr v0, v4

    .line 20
    iget v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackRadius:F

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackRadius:F

    .line 21
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackDrawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_5

    .line 22
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackRectF:Landroid/graphics/RectF;

    iget v2, v1, Landroid/graphics/RectF;->left:F

    float-to-int v2, v2

    iget v3, v1, Landroid/graphics/RectF;->top:F

    float-to-int v3, v3

    iget v1, v1, Landroid/graphics/RectF;->right:F

    float-to-double v7, v1

    invoke-direct {p0, v7, v8}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->ceil(D)I

    move-result v1

    iget-object v5, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackRectF:Landroid/graphics/RectF;

    iget v5, v5, Landroid/graphics/RectF;->bottom:F

    float-to-double v7, v5

    invoke-direct {p0, v7, v8}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->ceil(D)I

    move-result v5

    invoke-virtual {v0, v2, v3, v1, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 23
    :cond_5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mOnLayout:Landroid/text/Layout;

    if-eqz v0, :cond_6

    .line 24
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackRectF:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->left:F

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextThumbInset:I

    int-to-float v2, v2

    add-float/2addr v0, v2

    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbWidth:I

    int-to-float v2, v2

    sub-float/2addr v0, v2

    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbMargin:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->right:F

    sub-float/2addr v0, v2

    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mOnLayout:Landroid/text/Layout;

    invoke-virtual {v2}, Landroid/text/Layout;->getWidth()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v0, v2

    div-float/2addr v0, v4

    add-float/2addr v1, v0

    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextAdjust:I

    int-to-float v0, v0

    sub-float/2addr v1, v0

    .line 25
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackRectF:Landroid/graphics/RectF;

    iget v2, v0, Landroid/graphics/RectF;->top:F

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mOnLayout:Landroid/text/Layout;

    invoke-virtual {v3}, Landroid/text/Layout;->getHeight()I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v0, v3

    div-float/2addr v0, v4

    add-float/2addr v2, v0

    .line 26
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextOnRectF:Landroid/graphics/RectF;

    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mOnLayout:Landroid/text/Layout;

    invoke-virtual {v3}, Landroid/text/Layout;->getWidth()I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v3, v1

    iget-object v5, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mOnLayout:Landroid/text/Layout;

    invoke-virtual {v5}, Landroid/text/Layout;->getHeight()I

    move-result v5

    int-to-float v5, v5

    add-float/2addr v5, v2

    invoke-virtual {v0, v1, v2, v3, v5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 27
    :cond_6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mOffLayout:Landroid/text/Layout;

    if-eqz v0, :cond_7

    .line 28
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackRectF:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->right:F

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextThumbInset:I

    int-to-float v2, v2

    add-float/2addr v0, v2

    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbWidth:I

    int-to-float v2, v2

    sub-float/2addr v0, v2

    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbMargin:Landroid/graphics/RectF;

    iget v2, v2, Landroid/graphics/RectF;->left:F

    sub-float/2addr v0, v2

    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mOffLayout:Landroid/text/Layout;

    invoke-virtual {v2}, Landroid/text/Layout;->getWidth()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v0, v2

    div-float/2addr v0, v4

    sub-float/2addr v1, v0

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mOffLayout:Landroid/text/Layout;

    invoke-virtual {v0}, Landroid/text/Layout;->getWidth()I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr v1, v0

    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextAdjust:I

    int-to-float v0, v0

    add-float/2addr v1, v0

    .line 29
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackRectF:Landroid/graphics/RectF;

    iget v2, v0, Landroid/graphics/RectF;->top:F

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mOffLayout:Landroid/text/Layout;

    invoke-virtual {v3}, Landroid/text/Layout;->getHeight()I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v0, v3

    div-float/2addr v0, v4

    add-float/2addr v2, v0

    .line 30
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextOffRectF:Landroid/graphics/RectF;

    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mOffLayout:Landroid/text/Layout;

    invoke-virtual {v3}, Landroid/text/Layout;->getWidth()I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v3, v1

    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mOffLayout:Landroid/text/Layout;

    invoke-virtual {v4}, Landroid/text/Layout;->getHeight()I

    move-result v4

    int-to-float v4, v4

    add-float/2addr v4, v2

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 31
    :cond_7
    iput-boolean v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mReady:Z

    :cond_8
    :goto_2
    return-void
.end method


# virtual methods
.method protected animateToState(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mProgressAnimator:Landroid/animation/ObjectAnimator;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mProgressAnimator:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->cancel()V

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mProgressAnimator:Landroid/animation/ObjectAnimator;

    iget-wide v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mAnimationDuration:J

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-eqz p1, :cond_2

    .line 5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mProgressAnimator:Landroid/animation/ObjectAnimator;

    new-array v2, v2, [F

    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mProgress:F

    aput v3, v2, v1

    const/high16 v1, 0x3f800000    # 1.0f

    aput v1, v2, v0

    invoke-virtual {p1, v2}, Landroid/animation/ObjectAnimator;->setFloatValues([F)V

    goto :goto_0

    .line 6
    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mProgressAnimator:Landroid/animation/ObjectAnimator;

    new-array v2, v2, [F

    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mProgress:F

    aput v3, v2, v1

    const/4 v1, 0x0

    aput v1, v2, v0

    invoke-virtual {p1, v2}, Landroid/animation/ObjectAnimator;->setFloatValues([F)V

    .line 7
    :goto_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mProgressAnimator:Landroid/animation/ObjectAnimator;

    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    return-void
.end method

.method protected drawableStateChanged()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/widget/CompoundButton;->drawableStateChanged()V

    .line 2
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mIsThumbUseDrawable:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbColor:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getDrawableState()[I

    move-result-object v1

    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mCurrThumbColor:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mCurrThumbColor:I

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbDrawable:Landroid/graphics/drawable/Drawable;

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setDrawableState(Landroid/graphics/drawable/Drawable;)V

    .line 5
    :goto_0
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->UNCHECKED_PRESSED_STATE:[I

    goto :goto_1

    :cond_1
    sget-object v0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->CHECKED_PRESSED_STATE:[I

    .line 6
    :goto_1
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 7
    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v2

    .line 8
    sget-object v3, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->CHECKED_PRESSED_STATE:[I

    invoke-virtual {v1, v3, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v3

    iput v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mOnTextColor:I

    .line 9
    sget-object v3, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->UNCHECKED_PRESSED_STATE:[I

    invoke-virtual {v1, v3, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mOffTextColor:I

    .line 10
    :cond_2
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mIsBackUseDrawable:Z

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackColor:Landroid/content/res/ColorStateList;

    if-eqz v1, :cond_3

    .line 11
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getDrawableState()[I

    move-result-object v2

    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mCurrBackColor:I

    invoke-virtual {v1, v2, v3}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mCurrBackColor:I

    .line 12
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackColor:Landroid/content/res/ColorStateList;

    invoke-virtual {v2, v0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mNextBackColor:I

    goto :goto_3

    .line 13
    :cond_3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackDrawable:Landroid/graphics/drawable/Drawable;

    instance-of v2, v1, Landroid/graphics/drawable/StateListDrawable;

    if-eqz v2, :cond_4

    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mFadeBack:Z

    if-eqz v2, :cond_4

    .line 14
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 15
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getCurrent()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mNextBackDrawable:Landroid/graphics/drawable/Drawable;

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mNextBackDrawable:Landroid/graphics/drawable/Drawable;

    .line 17
    :goto_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackDrawable:Landroid/graphics/drawable/Drawable;

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setDrawableState(Landroid/graphics/drawable/Drawable;)V

    .line 18
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackDrawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_5

    .line 19
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getCurrent()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mCurrentBackDrawable:Landroid/graphics/drawable/Drawable;

    :cond_5
    :goto_3
    return-void
.end method

.method public getAnimationDuration()J
    .locals 2

    iget-wide v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mAnimationDuration:J

    return-wide v0
.end method

.method public getBackColor()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackColor:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public getBackDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackDrawable:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getBackRadius()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackRadius:F

    return v0
.end method

.method public getBackSizeF()Landroid/graphics/PointF;
    .locals 3

    new-instance v0, Landroid/graphics/PointF;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackRectF:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackRectF:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    return-object v0
.end method

.method public getTextOff()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextOff:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public getTextOn()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextOn:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public getThumbColor()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbColor:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public getThumbDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbDrawable:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getThumbHeight()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbHeight:I

    int-to-float v0, v0

    return v0
.end method

.method public getThumbMargin()Landroid/graphics/RectF;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbMargin:Landroid/graphics/RectF;

    return-object v0
.end method

.method public getThumbRadius()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbRadius:F

    return v0
.end method

.method public getThumbRangeRatio()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbRangeRatio:F

    return v0
.end method

.method public getThumbWidth()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbWidth:I

    int-to-float v0, v0

    return v0
.end method

.method public getTintColor()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTintColor:I

    return v0
.end method

.method public isDrawDebugRect()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mDrawDebugRect:Z

    return v0
.end method

.method public isFadeBack()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mFadeBack:Z

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 13

    .line 1
    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mReady:Z

    if-nez v0, :cond_0

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setup()V

    .line 4
    :cond_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mReady:Z

    if-nez v0, :cond_1

    return-void

    .line 5
    :cond_1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mIsBackUseDrawable:Z

    const/high16 v1, 0x437f0000    # 255.0f

    const/16 v2, 0xff

    if-eqz v0, :cond_5

    .line 6
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mFadeBack:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mCurrentBackDrawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mNextBackDrawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_4

    .line 7
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mCurrentBackDrawable:Landroid/graphics/drawable/Drawable;

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mNextBackDrawable:Landroid/graphics/drawable/Drawable;

    .line 8
    :goto_0
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mNextBackDrawable:Landroid/graphics/drawable/Drawable;

    goto :goto_1

    :cond_3
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mCurrentBackDrawable:Landroid/graphics/drawable/Drawable;

    .line 9
    :goto_1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->getProgress()F

    move-result v4

    mul-float v4, v4, v1

    float-to-int v4, v4

    .line 10
    invoke-virtual {v0, v4}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 11
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    rsub-int v0, v4, 0xff

    .line 12
    invoke-virtual {v3, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 13
    invoke-virtual {v3, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    goto/16 :goto_4

    .line 14
    :cond_4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 15
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    goto/16 :goto_4

    .line 16
    :cond_5
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mFadeBack:Z

    if-eqz v0, :cond_8

    .line 17
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_6

    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mCurrBackColor:I

    goto :goto_2

    :cond_6
    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mNextBackColor:I

    .line 18
    :goto_2
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v3

    if-eqz v3, :cond_7

    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mNextBackColor:I

    goto :goto_3

    :cond_7
    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mCurrBackColor:I

    .line 19
    :goto_3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->getProgress()F

    move-result v4

    mul-float v4, v4, v1

    float-to-int v4, v4

    .line 20
    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    move-result v5

    mul-int v5, v5, v4

    .line 21
    div-int/2addr v5, v2

    .line 22
    iget-object v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mPaint:Landroid/graphics/Paint;

    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    move-result v7

    invoke-static {v0}, Landroid/graphics/Color;->green(I)I

    move-result v8

    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    move-result v0

    invoke-virtual {v6, v5, v7, v8, v0}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 23
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackRectF:Landroid/graphics/RectF;

    iget v5, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackRadius:F

    iget-object v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v5, v5, v6}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    rsub-int v0, v4, 0xff

    .line 24
    invoke-static {v3}, Landroid/graphics/Color;->alpha(I)I

    move-result v4

    mul-int v4, v4, v0

    .line 25
    div-int/2addr v4, v2

    .line 26
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mPaint:Landroid/graphics/Paint;

    invoke-static {v3}, Landroid/graphics/Color;->red(I)I

    move-result v5

    invoke-static {v3}, Landroid/graphics/Color;->green(I)I

    move-result v6

    invoke-static {v3}, Landroid/graphics/Color;->blue(I)I

    move-result v3

    invoke-virtual {v0, v4, v5, v6, v3}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 27
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackRectF:Landroid/graphics/RectF;

    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackRadius:F

    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v3, v3, v4}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 28
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    goto :goto_4

    .line 29
    :cond_8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mPaint:Landroid/graphics/Paint;

    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mCurrBackColor:I

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 30
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackRectF:Landroid/graphics/RectF;

    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackRadius:F

    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v3, v3, v4}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 31
    :goto_4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->getProgress()F

    move-result v0

    float-to-double v3, v0

    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    cmpl-double v0, v3, v5

    if-lez v0, :cond_9

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mOnLayout:Landroid/text/Layout;

    goto :goto_5

    :cond_9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mOffLayout:Landroid/text/Layout;

    .line 32
    :goto_5
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->getProgress()F

    move-result v3

    float-to-double v3, v3

    cmpl-double v7, v3, v5

    if-lez v7, :cond_a

    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextOnRectF:Landroid/graphics/RectF;

    goto :goto_6

    :cond_a
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextOffRectF:Landroid/graphics/RectF;

    :goto_6
    const/4 v4, 0x0

    if-eqz v0, :cond_e

    if-eqz v3, :cond_e

    .line 33
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->getProgress()F

    move-result v7

    float-to-double v7, v7

    const-wide/high16 v9, 0x3fe8000000000000L    # 0.75

    const/high16 v11, 0x40800000    # 4.0f

    cmpl-double v12, v7, v9

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->getProgress()F

    move-result v7

    if-ltz v12, :cond_b

    mul-float v7, v7, v11

    const/high16 v8, 0x40400000    # 3.0f

    :goto_7
    sub-float/2addr v7, v8

    goto :goto_8

    :cond_b
    float-to-double v7, v7

    const-wide/high16 v9, 0x3fd0000000000000L    # 0.25

    cmpg-double v12, v7, v9

    if-gez v12, :cond_c

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->getProgress()F

    move-result v8

    mul-float v8, v8, v11

    goto :goto_7

    :cond_c
    const/4 v7, 0x0

    :goto_8
    mul-float v7, v7, v1

    float-to-int v1, v7

    .line 34
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->getProgress()F

    move-result v7

    float-to-double v7, v7

    cmpl-double v9, v7, v5

    if-lez v9, :cond_d

    iget v7, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mOnTextColor:I

    goto :goto_9

    :cond_d
    iget v7, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mOffTextColor:I

    .line 35
    :goto_9
    invoke-static {v7}, Landroid/graphics/Color;->alpha(I)I

    move-result v8

    mul-int v8, v8, v1

    .line 36
    div-int/2addr v8, v2

    .line 37
    invoke-virtual {v0}, Landroid/text/Layout;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    invoke-static {v7}, Landroid/graphics/Color;->red(I)I

    move-result v2

    invoke-static {v7}, Landroid/graphics/Color;->green(I)I

    move-result v9

    invoke-static {v7}, Landroid/graphics/Color;->blue(I)I

    move-result v7

    invoke-virtual {v1, v8, v2, v9, v7}, Landroid/text/TextPaint;->setARGB(IIII)V

    .line 38
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 39
    iget v1, v3, Landroid/graphics/RectF;->left:F

    iget v2, v3, Landroid/graphics/RectF;->top:F

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 40
    invoke-virtual {v0, p1}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    .line 41
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 42
    :cond_e
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mPresentThumbRectF:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbRectF:Landroid/graphics/RectF;

    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 43
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mPresentThumbRectF:Landroid/graphics/RectF;

    iget v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mProgress:F

    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mSafeRectF:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v2

    mul-float v1, v1, v2

    invoke-virtual {v0, v1, v4}, Landroid/graphics/RectF;->offset(FF)V

    .line 44
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mIsThumbUseDrawable:Z

    if-eqz v0, :cond_f

    .line 45
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbDrawable:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mPresentThumbRectF:Landroid/graphics/RectF;

    iget v2, v1, Landroid/graphics/RectF;->left:F

    float-to-int v2, v2

    iget v3, v1, Landroid/graphics/RectF;->top:F

    float-to-int v3, v3

    iget v1, v1, Landroid/graphics/RectF;->right:F

    float-to-double v7, v1

    invoke-direct {p0, v7, v8}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->ceil(D)I

    move-result v1

    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mPresentThumbRectF:Landroid/graphics/RectF;

    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    float-to-double v7, v4

    invoke-direct {p0, v7, v8}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->ceil(D)I

    move-result v4

    invoke-virtual {v0, v2, v3, v1, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 46
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    goto :goto_a

    .line 47
    :cond_f
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mCurrThumbColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 48
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mPresentThumbRectF:Landroid/graphics/RectF;

    iget v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbRadius:F

    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v1, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 49
    :goto_a
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mDrawDebugRect:Z

    if-eqz v0, :cond_11

    .line 50
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mRectPaint:Landroid/graphics/Paint;

    const-string v1, "#AA0000"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 51
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackRectF:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mRectPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 52
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mRectPaint:Landroid/graphics/Paint;

    const-string v1, "#0000FF"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 53
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mPresentThumbRectF:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mRectPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 54
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mRectPaint:Landroid/graphics/Paint;

    const-string v1, "#000000"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 55
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mSafeRectF:Landroid/graphics/RectF;

    iget v8, v0, Landroid/graphics/RectF;->left:F

    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbRectF:Landroid/graphics/RectF;

    iget v11, v1, Landroid/graphics/RectF;->top:F

    iget v10, v0, Landroid/graphics/RectF;->right:F

    iget-object v12, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mRectPaint:Landroid/graphics/Paint;

    move-object v7, p1

    move v9, v11

    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 56
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mRectPaint:Landroid/graphics/Paint;

    const-string v1, "#00CC00"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 57
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->getProgress()F

    move-result v0

    float-to-double v0, v0

    cmpl-double v2, v0, v5

    if-lez v2, :cond_10

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextOnRectF:Landroid/graphics/RectF;

    goto :goto_b

    :cond_10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextOffRectF:Landroid/graphics/RectF;

    :goto_b
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mRectPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    :cond_11
    return-void
.end method

.method protected onMeasure(II)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mOnLayout:Landroid/text/Layout;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextOn:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextOn:Ljava/lang/CharSequence;

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->makeLayout(Ljava/lang/CharSequence;)Landroid/text/Layout;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mOnLayout:Landroid/text/Layout;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mOffLayout:Landroid/text/Layout;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextOff:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextOff:Ljava/lang/CharSequence;

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->makeLayout(Ljava/lang/CharSequence;)Landroid/text/Layout;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mOffLayout:Landroid/text/Layout;

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mOnLayout:Landroid/text/Layout;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/text/Layout;->getWidth()I

    move-result v0

    int-to-float v0, v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 6
    :goto_0
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mOffLayout:Landroid/text/Layout;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroid/text/Layout;->getWidth()I

    move-result v2

    int-to-float v2, v2

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    cmpl-float v3, v0, v1

    if-nez v3, :cond_5

    cmpl-float v3, v2, v1

    if-eqz v3, :cond_4

    goto :goto_2

    .line 7
    :cond_4
    iput v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextWidth:F

    goto :goto_3

    .line 8
    :cond_5
    :goto_2
    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextWidth:F

    .line 9
    :goto_3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mOnLayout:Landroid/text/Layout;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Landroid/text/Layout;->getHeight()I

    move-result v0

    int-to-float v0, v0

    goto :goto_4

    :cond_6
    const/4 v0, 0x0

    .line 10
    :goto_4
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mOffLayout:Landroid/text/Layout;

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Landroid/text/Layout;->getHeight()I

    move-result v2

    int-to-float v2, v2

    goto :goto_5

    :cond_7
    const/4 v2, 0x0

    :goto_5
    cmpl-float v3, v0, v1

    if-nez v3, :cond_9

    cmpl-float v3, v2, v1

    if-eqz v3, :cond_8

    goto :goto_6

    .line 11
    :cond_8
    iput v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextHeight:F

    goto :goto_7

    .line 12
    :cond_9
    :goto_6
    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextHeight:F

    .line 13
    :goto_7
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->measureWidth(I)I

    move-result p1

    invoke-direct {p0, p2}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->measureHeight(I)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/widget/CompoundButton;->setMeasuredDimension(II)V

    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    .line 1
    check-cast p1, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton$SavedState;

    .line 2
    iget-object v0, p1, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton$SavedState;->onText:Ljava/lang/CharSequence;

    iget-object v1, p1, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton$SavedState;->offText:Ljava/lang/CharSequence;

    invoke-virtual {p0, v0, v1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mRestoring:Z

    .line 4
    invoke-virtual {p1}, Landroid/view/View$BaseSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mRestoring:Z

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/widget/CompoundButton;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    .line 2
    new-instance v1, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton$SavedState;

    invoke-direct {v1, v0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextOn:Ljava/lang/CharSequence;

    iput-object v0, v1, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton$SavedState;->onText:Ljava/lang/CharSequence;

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextOff:Ljava/lang/CharSequence;

    iput-object v0, v1, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton$SavedState;->offText:Ljava/lang/CharSequence;

    return-object v1
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/CompoundButton;->onSizeChanged(IIII)V

    if-ne p1, p3, :cond_0

    if-eq p2, p4, :cond_1

    .line 2
    :cond_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setup()V

    :cond_1
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_a

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isClickable()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isFocusable()Z

    move-result v0

    if-eqz v0, :cond_a

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mReady:Z

    if-nez v0, :cond_0

    goto/16 :goto_2

    .line 2
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    .line 3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mStartX:F

    sub-float/2addr v2, v3

    .line 4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    iget v4, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mStartY:F

    sub-float/2addr v3, v4

    const/4 v4, 0x1

    if-eqz v0, :cond_9

    if-eq v0, v4, :cond_6

    const/4 v5, 0x2

    if-eq v0, v5, :cond_1

    const/4 v5, 0x3

    if-eq v0, v5, :cond_6

    goto/16 :goto_1

    .line 5
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    .line 6
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->getProgress()F

    move-result v0

    iget v5, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mLastX:F

    sub-float v5, p1, v5

    iget-object v6, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mSafeRectF:Landroid/graphics/RectF;

    invoke-virtual {v6}, Landroid/graphics/RectF;->width()F

    move-result v6

    div-float/2addr v5, v6

    add-float/2addr v0, v5

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setProgress(F)V

    .line 7
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mCatch:Z

    if-nez v0, :cond_5

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v5, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTouchSlop:I

    int-to-float v5, v5

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    cmpl-float v0, v0, v5

    if-gtz v0, :cond_2

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v5, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTouchSlop:I

    int-to-float v5, v5

    div-float/2addr v5, v6

    cmpl-float v0, v0, v5

    if-lez v0, :cond_5

    :cond_2
    const/4 v0, 0x0

    cmpl-float v0, v3, v0

    if-eqz v0, :cond_4

    .line 8
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v0

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v5

    cmpl-float v0, v0, v5

    if-lez v0, :cond_3

    goto :goto_0

    .line 9
    :cond_3
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v0

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    cmpl-float v0, v0, v2

    if-lez v0, :cond_5

    return v1

    .line 10
    :cond_4
    :goto_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->catchView()V

    .line 11
    :cond_5
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mLastX:F

    goto :goto_1

    .line 12
    :cond_6
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mCatch:Z

    .line 13
    invoke-virtual {p0, v1}, Landroid/widget/CompoundButton;->setPressed(Z)V

    .line 14
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getDownTime()J

    move-result-wide v7

    sub-long/2addr v5, v7

    long-to-float p1, v5

    .line 15
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTouchSlop:I

    int-to-float v2, v2

    cmpg-float v0, v0, v2

    if-gez v0, :cond_7

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTouchSlop:I

    int-to-float v2, v2

    cmpg-float v0, v0, v2

    if-gez v0, :cond_7

    iget v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mClickTimeout:I

    int-to-float v0, v0

    cmpg-float p1, p1, v0

    if-gez p1, :cond_7

    .line 16
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->performClick()Z

    goto :goto_1

    .line 17
    :cond_7
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->getStatusBasedOnPos()Z

    move-result p1

    .line 18
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-eq p1, v0, :cond_8

    .line 19
    invoke-virtual {p0, v1}, Landroid/widget/CompoundButton;->playSoundEffect(I)V

    .line 20
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setChecked(Z)V

    goto :goto_1

    .line 21
    :cond_8
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->animateToState(Z)V

    goto :goto_1

    .line 22
    :cond_9
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mStartX:F

    .line 23
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mStartY:F

    .line 24
    iget p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mStartX:F

    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mLastX:F

    .line 25
    invoke-virtual {p0, v4}, Landroid/widget/CompoundButton;->setPressed(Z)V

    :goto_1
    return v4

    :cond_a
    :goto_2
    return v1
.end method

.method public performClick()Z
    .locals 1

    invoke-super {p0}, Landroid/widget/CompoundButton;->performClick()Z

    move-result v0

    return v0
.end method

.method public setAnimationDuration(J)V
    .locals 0

    iput-wide p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mAnimationDuration:J

    return-void
.end method

.method public setBackColor(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackColor:Landroid/content/res/ColorStateList;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setBackDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->invalidate()V

    return-void
.end method

.method public setBackColorRes(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Landroidx/core/content/a;->c(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setBackColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setBackDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackDrawable:Landroid/graphics/drawable/Drawable;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 2
    :goto_0
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mIsBackUseDrawable:Z

    .line 3
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->refreshDrawableState()V

    .line 4
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mReady:Z

    .line 5
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->requestLayout()V

    .line 6
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->invalidate()V

    return-void
.end method

.method public setBackDrawableRes(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Landroidx/core/content/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setBackDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setBackRadius(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackRadius:F

    .line 2
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mIsBackUseDrawable:Z

    if-nez p1, :cond_0

    .line 3
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->invalidate()V

    :cond_0
    return-void
.end method

.method public setChecked(Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-eq v0, p1, :cond_0

    .line 2
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->animateToState(Z)V

    .line 3
    :cond_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mRestoring:Z

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setCheckedImmediatelyNoEvent(Z)V

    goto :goto_0

    .line 5
    :cond_1
    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    :goto_0
    return-void
.end method

.method public setCheckedImmediately(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mProgressAnimator:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mProgressAnimator:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->cancel()V

    :cond_0
    if-eqz p1, :cond_1

    const/high16 p1, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 4
    :goto_0
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setProgress(F)V

    .line 5
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->invalidate()V

    return-void
.end method

.method public setCheckedImmediatelyNoEvent(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mChildOnCheckedChangeListener:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setCheckedImmediately(Z)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 3
    invoke-super {p0, v0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 4
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setCheckedImmediately(Z)V

    .line 5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mChildOnCheckedChangeListener:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    :goto_0
    return-void
.end method

.method public setCheckedNoEvent(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mChildOnCheckedChangeListener:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setChecked(Z)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 3
    invoke-super {p0, v0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 4
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setChecked(Z)V

    .line 5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mChildOnCheckedChangeListener:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    :goto_0
    return-void
.end method

.method public setDrawDebugRect(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mDrawDebugRect:Z

    .line 2
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->invalidate()V

    return-void
.end method

.method public setFadeBack(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mFadeBack:Z

    return-void
.end method

.method public setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 2
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mChildOnCheckedChangeListener:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    return-void
.end method

.method public setText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextOn:Ljava/lang/CharSequence;

    .line 2
    iput-object p2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextOff:Ljava/lang/CharSequence;

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mOnLayout:Landroid/text/Layout;

    .line 4
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mOffLayout:Landroid/text/Layout;

    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mReady:Z

    .line 6
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->requestLayout()V

    .line 7
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->invalidate()V

    return-void
.end method

.method public setTextAdjust(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextAdjust:I

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mReady:Z

    .line 3
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->requestLayout()V

    .line 4
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->invalidate()V

    return-void
.end method

.method public setTextExtra(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextExtra:I

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mReady:Z

    .line 3
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->requestLayout()V

    .line 4
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->invalidate()V

    return-void
.end method

.method public setTextThumbInset(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTextThumbInset:I

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mReady:Z

    .line 3
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->requestLayout()V

    .line 4
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->invalidate()V

    return-void
.end method

.method public setThumbColor(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbColor:Landroid/content/res/ColorStateList;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setThumbDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->invalidate()V

    return-void
.end method

.method public setThumbColorRes(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Landroidx/core/content/a;->c(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setThumbColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setThumbDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbDrawable:Landroid/graphics/drawable/Drawable;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 2
    :goto_0
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mIsThumbUseDrawable:Z

    .line 3
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->refreshDrawableState()V

    .line 4
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mReady:Z

    .line 5
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->requestLayout()V

    .line 6
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->invalidate()V

    return-void
.end method

.method public setThumbDrawableRes(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Landroidx/core/content/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setThumbDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setThumbMargin(FFFF)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbMargin:Landroid/graphics/RectF;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/RectF;->set(FFFF)V

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mReady:Z

    .line 5
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->requestLayout()V

    return-void
.end method

.method public setThumbMargin(Landroid/graphics/RectF;)V
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 1
    invoke-virtual {p0, p1, p1, p1, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setThumbMargin(FFFF)V

    goto :goto_0

    .line 2
    :cond_0
    iget v0, p1, Landroid/graphics/RectF;->left:F

    iget v1, p1, Landroid/graphics/RectF;->top:F

    iget v2, p1, Landroid/graphics/RectF;->right:F

    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p0, v0, v1, v2, p1}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setThumbMargin(FFFF)V

    :goto_0
    return-void
.end method

.method public setThumbRadius(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbRadius:F

    .line 2
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mIsThumbUseDrawable:Z

    if-nez p1, :cond_0

    .line 3
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->invalidate()V

    :cond_0
    return-void
.end method

.method public setThumbRangeRatio(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbRangeRatio:F

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mReady:Z

    .line 3
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->requestLayout()V

    return-void
.end method

.method public setThumbSize(II)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbWidth:I

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbHeight:I

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mReady:Z

    .line 4
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->requestLayout()V

    return-void
.end method

.method public setTintColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTintColor:I

    .line 2
    invoke-static {p1}, Lcom/xuexiang/xui/widget/button/switchbutton/ColorUtils;->generateThumbColorWithTintColor(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mThumbColor:Landroid/content/res/ColorStateList;

    .line 3
    iget p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mTintColor:I

    invoke-static {p1}, Lcom/xuexiang/xui/widget/button/switchbutton/ColorUtils;->generateBackColorWithTintColor(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mBackColor:Landroid/content/res/ColorStateList;

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mIsBackUseDrawable:Z

    .line 5
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mIsThumbUseDrawable:Z

    .line 6
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->refreshDrawableState()V

    .line 7
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->invalidate()V

    return-void
.end method

.method public toggleImmediately()V
    .locals 1

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->setCheckedImmediately(Z)V

    return-void
.end method

.method public toggleImmediatelyNoEvent()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mChildOnCheckedChangeListener:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->toggleImmediately()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 3
    invoke-super {p0, v0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->toggleImmediately()V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mChildOnCheckedChangeListener:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    invoke-super {p0, v0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    :goto_0
    return-void
.end method

.method public toggleNoEvent()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mChildOnCheckedChangeListener:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->toggle()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 3
    invoke-super {p0, v0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 4
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->toggle()V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/switchbutton/SwitchButton;->mChildOnCheckedChangeListener:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    invoke-super {p0, v0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    :goto_0
    return-void
.end method
