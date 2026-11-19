.class public Lcom/xuexiang/xui/widget/picker/XSeekBar;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/picker/XSeekBar$OnSeekBarListener;
    }
.end annotation


# static fields
.field private static final DEFAULT_BIG_SCALE_WITH:F = 1.7f

.field private static final DEFAULT_MAX:I = 0x64

.field private static final DEFAULT_MIDDLE_SCALE_WITH:F = 1.2f

.field private static final DEFAULT_SMALL_SCALE_WITH:F = 1.0f

.field private static DEFAULT_TEXT_MIN_SPACE:I

.field private static DEFAULT_TOUCH_TARGET_SIZE:I


# instance fields
.field private mBubbleBitmap:Landroid/graphics/Bitmap;

.field private mConvertFactor:F

.field private mInsideRangeColor:I

.field private mInsideRangeLineStrokeWidth:F

.field private mIsFirstInit:Z

.field private mIsLineRound:Z

.field private mIsShowBubble:Z

.field private mIsShowNumber:Z

.field private mIsShowRuler:Z

.field private mIsTouching:Z

.field private mLastTouchedMin:Z

.field private mLineEndX:I

.field private mLineLength:I

.field private mLineStartX:I

.field private mMax:I

.field private mMaxPosition:I

.field private mMaxTextRect:Landroid/graphics/Rect;

.field private mMiddleY:I

.field private mMin:I

.field private mNumberMarginBottom:F

.field private mNumberTextColor:I

.field private mNumberTextSize:F

.field private mOnSeekBarListener:Lcom/xuexiang/xui/widget/picker/XSeekBar$OnSeekBarListener;

.field private mOutsideRangeColor:I

.field private mOutsideRangeLineStrokeWidth:F

.field private final mPaint:Landroid/graphics/Paint;

.field private mRange:I

.field private mRulerColor:I

.field private mRulerDividerHeight:F

.field private mRulerInterval:I

.field private mRulerMarginTop:F

.field private mRulerTextColor:I

.field private mRulerTextMarginTop:F

.field private mRulerTextRect:Landroid/graphics/Rect;

.field private mRulerTextSize:F

.field private mSelectedNumber:I

.field private mSliderIcon:Landroid/graphics/Bitmap;

.field private mSliderIconFocus:Landroid/graphics/Bitmap;

.field private mTouchingMaxTarget:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private mTouchingMinTarget:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private mVerticalPadding:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/picker/XSeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->XSeekBarStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/picker/XSeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mPaint:Landroid/graphics/Paint;

    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMaxPosition:I

    .line 6
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMiddleY:I

    .line 7
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    iput-object v2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMaxTextRect:Landroid/graphics/Rect;

    .line 8
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    iput-object v2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerTextRect:Landroid/graphics/Rect;

    .line 9
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mTouchingMinTarget:Ljava/util/Set;

    .line 10
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mTouchingMaxTarget:Ljava/util/Set;

    .line 11
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mIsTouching:Z

    const/4 v2, -0x1

    .line 12
    iput v2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mSelectedNumber:I

    .line 13
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mIsFirstInit:Z

    const/16 v1, 0x64

    .line 14
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMax:I

    .line 15
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMin:I

    .line 16
    invoke-virtual {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private calculateConvertFactor()V
    .locals 2

    iget v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRange:I

    int-to-float v0, v0

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mLineLength:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mConvertFactor:F

    return-void
.end method

.method private callMaxChangedCallbacks()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mOnSeekBarListener:Lcom/xuexiang/xui/widget/picker/XSeekBar$OnSeekBarListener;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->getSelectedNumber()I

    move-result v1

    invoke-interface {v0, p0, v1}, Lcom/xuexiang/xui/widget/picker/XSeekBar$OnSeekBarListener;->onValueChanged(Lcom/xuexiang/xui/widget/picker/XSeekBar;I)V

    :cond_0
    return-void
.end method

.method private checkTouchingMaxTarget(ILandroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->isTouchingMaxTarget(ILandroid/view/MotionEvent;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mLastTouchedMin:Z

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mTouchingMaxTarget:Ljava/util/Set;

    invoke-virtual {p2, p1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method private checkTouchingMinTarget(ILandroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->isTouchingMinTarget(ILandroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mLastTouchedMin:Z

    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mTouchingMinTarget:Ljava/util/Set;

    invoke-virtual {p2, p1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private clamp(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/Number;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Number;",
            ">(TT;TT;TT;)TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p3}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    cmpl-double v4, v0, v2

    if-lez v4, :cond_0

    return-object p3

    .line 2
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    cmpg-double p3, v0, v2

    if-gez p3, :cond_1

    return-object p2

    :cond_1
    return-object p1
.end method

.method private drawEntireRangeLine(Landroid/graphics/Canvas;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mOutsideRangeColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mOutsideRangeLineStrokeWidth:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 3
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mLineStartX:I

    int-to-float v2, v0

    iget v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMiddleY:I

    int-to-float v3, v0

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mLineEndX:I

    int-to-float v4, v1

    int-to-float v5, v0

    iget-object v6, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mPaint:Landroid/graphics/Paint;

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 4
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mIsLineRound:Z

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mInsideRangeColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 6
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mLineStartX:I

    int-to-float v0, v0

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMiddleY:I

    int-to-float v1, v1

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mOutsideRangeLineStrokeWidth:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    iget-object v4, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mOutsideRangeColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 8
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mLineEndX:I

    int-to-float v0, v0

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMiddleY:I

    int-to-float v1, v1

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mOutsideRangeLineStrokeWidth:F

    div-float/2addr v2, v3

    iget-object v3, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :cond_0
    return-void
.end method

.method private drawRuler(Landroid/graphics/Canvas;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    .line 1
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mIsShowRuler:Z

    if-eqz v1, :cond_a

    .line 2
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mLineStartX:I

    int-to-float v1, v1

    .line 3
    iget v2, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerInterval:I

    int-to-float v2, v2

    const/high16 v3, 0x41200000    # 10.0f

    div-float/2addr v2, v3

    .line 4
    iget v3, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mLineLength:I

    int-to-float v3, v3

    iget v4, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMax:I

    iget v5, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMin:I

    sub-int/2addr v4, v5

    int-to-float v4, v4

    div-float/2addr v4, v2

    div-float/2addr v3, v4

    div-float v8, v3, v2

    const/4 v2, 0x0

    move v9, v1

    move v12, v5

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 5
    :goto_0
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMax:I

    if-gt v12, v1, :cond_a

    .line 6
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerInterval:I

    rem-int v2, v12, v1

    const/high16 v13, 0x40400000    # 3.0f

    const/4 v14, 0x1

    const/high16 v15, 0x40000000    # 2.0f

    if-nez v2, :cond_2

    .line 7
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMiddleY:I

    int-to-float v1, v1

    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mSliderIcon:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v15

    add-float/2addr v1, v2

    iget v2, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerMarginTop:F

    add-float v16, v1, v2

    .line 8
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerDividerHeight:F

    mul-float v1, v1, v13

    add-float v5, v16, v1

    .line 9
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mPaint:Landroid/graphics/Paint;

    iget v2, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerTextColor:I

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 10
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mPaint:Landroid/graphics/Paint;

    iget v2, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerTextSize:F

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 11
    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerTextRect:Landroid/graphics/Rect;

    invoke-direct {v0, v1, v2}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->getRulerTextBounds(Ljava/lang/String;Landroid/graphics/Rect;)V

    .line 12
    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerTextRect:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v15

    sub-float v2, v9, v2

    iget-object v3, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerTextRect:Landroid/graphics/Rect;

    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v3, v5

    iget v4, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerTextMarginTop:F

    add-float/2addr v3, v4

    iget-object v4, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {v7, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 13
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMin:I

    if-ne v12, v1, :cond_0

    const/4 v11, 0x1

    .line 14
    :cond_0
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMax:I

    if-ne v12, v1, :cond_1

    const/4 v10, 0x1

    .line 15
    :cond_1
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mPaint:Landroid/graphics/Paint;

    const v2, 0x3fd9999a    # 1.7f

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 16
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mPaint:Landroid/graphics/Paint;

    iget v2, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerColor:I

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 17
    iget-object v6, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mPaint:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move v2, v9

    move/from16 v3, v16

    move v4, v9

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    goto/16 :goto_1

    .line 18
    :cond_2
    div-int/lit8 v2, v1, 0x2

    rem-int v2, v12, v2

    if-nez v2, :cond_3

    rem-int/lit8 v1, v1, 0xa

    if-nez v1, :cond_3

    .line 19
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMiddleY:I

    int-to-float v1, v1

    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mSliderIcon:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v15

    add-float/2addr v1, v2

    iget v2, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerMarginTop:F

    add-float v16, v1, v2

    .line 20
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerDividerHeight:F

    mul-float v1, v1, v15

    add-float v5, v16, v1

    .line 21
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mPaint:Landroid/graphics/Paint;

    const v2, 0x3f99999a    # 1.2f

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 22
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mPaint:Landroid/graphics/Paint;

    iget v2, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerColor:I

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 23
    iget-object v6, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mPaint:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move v2, v9

    move/from16 v3, v16

    move v4, v9

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    goto :goto_1

    .line 24
    :cond_3
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMiddleY:I

    int-to-float v1, v1

    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mSliderIcon:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v15

    add-float/2addr v1, v2

    iget v2, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerMarginTop:F

    add-float v16, v1, v2

    .line 25
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerDividerHeight:F

    add-float v5, v16, v1

    .line 26
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mPaint:Landroid/graphics/Paint;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 27
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerInterval:I

    div-int/lit8 v1, v1, 0xa

    rem-int v1, v12, v1

    if-nez v1, :cond_4

    .line 28
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mPaint:Landroid/graphics/Paint;

    iget v2, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerColor:I

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 29
    iget-object v6, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mPaint:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move v2, v9

    move/from16 v3, v16

    move v4, v9

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 30
    :cond_4
    :goto_1
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMax:I

    if-ne v12, v1, :cond_5

    if-eqz v10, :cond_6

    :cond_5
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMin:I

    if-ne v12, v1, :cond_9

    if-nez v11, :cond_9

    .line 31
    :cond_6
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mPaint:Landroid/graphics/Paint;

    iget v2, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerTextColor:I

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 32
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mPaint:Landroid/graphics/Paint;

    iget v2, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerTextSize:F

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 33
    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerTextRect:Landroid/graphics/Rect;

    invoke-direct {v0, v1, v2}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->getRulerTextBounds(Ljava/lang/String;Landroid/graphics/Rect;)V

    .line 34
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerTextRect:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v1, v15

    sub-float v1, v9, v1

    .line 35
    iget v2, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMax:I

    if-ne v12, v2, :cond_7

    iget v2, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerInterval:I

    rem-int v2, v12, v2

    if-ne v2, v14, :cond_7

    .line 36
    sget v1, Lcom/xuexiang/xui/widget/picker/XSeekBar;->DEFAULT_TEXT_MIN_SPACE:I

    int-to-float v1, v1

    add-float/2addr v1, v9

    .line 37
    :cond_7
    iget v2, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMin:I

    if-ne v12, v2, :cond_8

    iget v2, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerInterval:I

    rem-int v3, v12, v2

    sub-int/2addr v2, v14

    if-ne v3, v2, :cond_8

    .line 38
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerTextRect:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v1, v15

    sub-float v1, v9, v1

    sget v2, Lcom/xuexiang/xui/widget/picker/XSeekBar;->DEFAULT_TEXT_MIN_SPACE:I

    int-to-float v2, v2

    sub-float/2addr v1, v2

    .line 39
    :cond_8
    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    iget v3, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerDividerHeight:F

    mul-float v3, v3, v13

    add-float v16, v16, v3

    iget-object v3, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerTextRect:Landroid/graphics/Rect;

    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v3

    int-to-float v3, v3

    add-float v16, v16, v3

    iget v3, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerTextMarginTop:F

    add-float v3, v16, v3

    iget-object v4, v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {v7, v2, v1, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_9
    add-float/2addr v9, v8

    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_0

    :cond_a
    return-void
.end method

.method private drawSelectedNumber(Landroid/graphics/Canvas;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->getSelectedNumber()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMaxTextRect:Landroid/graphics/Rect;

    invoke-direct {p0, v0, v1}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->getTextBounds(Ljava/lang/String;Landroid/graphics/Rect;)V

    .line 3
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mIsShowBubble:Z

    const/high16 v2, 0x40000000    # 2.0f

    if-eqz v1, :cond_0

    .line 4
    iget v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMiddleY:I

    int-to-float v1, v1

    iget-object v3, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mSliderIcon:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v3, v2

    sub-float/2addr v1, v3

    iget-object v3, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mBubbleBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v1, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mNumberMarginBottom:F

    sub-float/2addr v1, v3

    .line 5
    iget-object v3, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mBubbleBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v3, v2

    add-float/2addr v3, v1

    iget-object v4, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMaxTextRect:Landroid/graphics/Rect;

    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v4, v2

    add-float/2addr v3, v4

    const/high16 v4, 0x40c00000    # 6.0f

    sub-float/2addr v3, v4

    .line 6
    iget-object v4, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mBubbleBitmap:Landroid/graphics/Bitmap;

    iget v5, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMaxPosition:I

    int-to-float v5, v5

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    int-to-float v6, v6

    div-float/2addr v6, v2

    sub-float/2addr v5, v6

    iget-object v6, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v4, v5, v1, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    goto :goto_0

    .line 7
    :cond_0
    iget v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMiddleY:I

    int-to-float v1, v1

    iget-object v3, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mSliderIcon:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v3, v2

    sub-float/2addr v1, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mNumberMarginBottom:F

    sub-float v3, v1, v3

    .line 8
    :goto_0
    iget v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMaxPosition:I

    int-to-float v1, v1

    iget-object v4, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMaxTextRect:Landroid/graphics/Rect;

    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v4, v2

    sub-float/2addr v1, v4

    .line 9
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mPaint:Landroid/graphics/Paint;

    iget v4, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mNumberTextSize:F

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 10
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mPaint:Landroid/graphics/Paint;

    iget v4, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mNumberTextColor:I

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 11
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v3, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method private drawSelectedRangeLine(Landroid/graphics/Canvas;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mInsideRangeLineStrokeWidth:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mInsideRangeColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 3
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mLineStartX:I

    int-to-float v2, v0

    iget v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMiddleY:I

    int-to-float v3, v0

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMaxPosition:I

    int-to-float v4, v1

    int-to-float v5, v0

    iget-object v6, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mPaint:Landroid/graphics/Paint;

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method private drawSelectedTargets(Landroid/graphics/Canvas;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mInsideRangeColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 2
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMaxPosition:I

    int-to-float v0, v0

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMiddleY:I

    int-to-float v1, v1

    const/high16 v2, 0x40400000    # 3.0f

    invoke-static {v2}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(F)I

    move-result v2

    int-to-float v2, v2

    iget-object v3, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 3
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mIsTouching:Z

    const/high16 v1, 0x40000000    # 2.0f

    if-nez v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mSliderIcon:Landroid/graphics/Bitmap;

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMaxPosition:I

    int-to-float v2, v2

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v3, v1

    sub-float/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMiddleY:I

    int-to-float v3, v3

    iget-object v4, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mSliderIcon:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v4, v1

    sub-float/2addr v3, v4

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v2, v3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mSliderIconFocus:Landroid/graphics/Bitmap;

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMaxPosition:I

    int-to-float v2, v2

    iget-object v3, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mSliderIcon:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v3, v1

    sub-float/2addr v2, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMiddleY:I

    int-to-float v3, v3

    iget-object v4, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mSliderIcon:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v4, v1

    sub-float/2addr v3, v4

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v2, v3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    :goto_0
    return-void
.end method

.method private getRulerTextBounds(Ljava/lang/String;Landroid/graphics/Rect;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerTextSize:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2, v1, p2}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    return-void
.end method

.method private getTextBounds(Ljava/lang/String;Landroid/graphics/Rect;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mNumberTextSize:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2, v1, p2}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    return-void
.end method

.method private isTouchingMaxTarget(ILandroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p2, p1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMaxPosition:I

    sget v2, Lcom/xuexiang/xui/widget/picker/XSeekBar;->DEFAULT_TOUCH_TARGET_SIZE:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 2
    invoke-virtual {p2, p1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMaxPosition:I

    sget v2, Lcom/xuexiang/xui/widget/picker/XSeekBar;->DEFAULT_TOUCH_TARGET_SIZE:I

    add-int/2addr v1, v2

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMiddleY:I

    sget v2, Lcom/xuexiang/xui/widget/picker/XSeekBar;->DEFAULT_TOUCH_TARGET_SIZE:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 4
    invoke-virtual {p2, p1}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    iget p2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMiddleY:I

    sget v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->DEFAULT_TOUCH_TARGET_SIZE:I

    add-int/2addr p2, v0

    int-to-float p2, p2

    cmpg-float p1, p1, p2

    if-gez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private isTouchingMinTarget(ILandroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method private jumpToPosition(ILandroid/view/MotionEvent;)V
    .locals 2

    .line 1
    invoke-virtual {p2, p1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMaxPosition:I

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    invoke-virtual {p2, p1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mLineEndX:I

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    .line 2
    invoke-virtual {p2, p1}, Landroid/view/MotionEvent;->getX(I)F

    move-result p1

    float-to-int p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMaxPosition:I

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->callMaxChangedCallbacks()V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p2, p1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMaxPosition:I

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    invoke-virtual {p2, p1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mLineStartX:I

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_1

    .line 6
    invoke-virtual {p2, p1}, Landroid/view/MotionEvent;->getX(I)F

    move-result p1

    float-to-int p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMaxPosition:I

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 8
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->callMaxChangedCallbacks()V

    :cond_1
    :goto_0
    return-void
.end method

.method private setSelectedValue(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMin:I

    sub-int/2addr p1, v0

    int-to-float p1, p1

    iget v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mConvertFactor:F

    div-float/2addr p1, v0

    iget v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mLineStartX:I

    int-to-float v0, v0

    add-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMaxPosition:I

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->callMaxChangedCallbacks()V

    return-void
.end method

.method private updateTouchStatus(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mIsTouching:Z

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0, p1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_0
    return-void
.end method


# virtual methods
.method public getMax()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMax:I

    return v0
.end method

.method public getMin()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMin:I

    return v0
.end method

.method public getSelectedNumber()I
    .locals 2

    iget v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMaxPosition:I

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mLineStartX:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mConvertFactor:F

    mul-float v0, v0, v1

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMin:I

    int-to-float v1, v1

    add-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0
.end method

.method public initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 6

    const/high16 v0, 0x41a00000    # 20.0f

    .line 1
    invoke-static {v0}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(F)I

    move-result v0

    sput v0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->DEFAULT_TOUCH_TARGET_SIZE:I

    const/high16 v0, 0x40000000    # 2.0f

    .line 2
    invoke-static {v0}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(F)I

    move-result v1

    sput v1, Lcom/xuexiang/xui/widget/picker/XSeekBar;->DEFAULT_TEXT_MIN_SPACE:I

    .line 3
    sget v1, Lcom/xuexiang/xui/R$attr;->colorAccent:I

    invoke-static {p1, v1}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveColor(Landroid/content/Context;I)I

    move-result v1

    .line 4
    sget v2, Lcom/xuexiang/xui/R$attr;->colorControlNormal:I

    invoke-static {p1, v2}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveColor(Landroid/content/Context;I)I

    move-result v2

    if-eqz p2, :cond_3

    .line 5
    sget-object v3, Lcom/xuexiang/xui/R$styleable;->XSeekBar:[I

    const/4 v4, 0x0

    invoke-virtual {p1, p2, v3, p3, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 6
    sget p2, Lcom/xuexiang/xui/R$styleable;->XSeekBar_xsb_verticalPadding:I

    const/high16 p3, 0x41200000    # 10.0f

    invoke-static {p3}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(F)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mVerticalPadding:I

    .line 7
    sget p2, Lcom/xuexiang/xui/R$styleable;->XSeekBar_xsb_insideRangeLineColor:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mInsideRangeColor:I

    .line 8
    sget p2, Lcom/xuexiang/xui/R$styleable;->XSeekBar_xsb_outsideRangeLineColor:I

    sget p3, Lcom/xuexiang/xui/R$color;->default_xrs_outside_line_color:I

    invoke-static {p3}, Lcom/xuexiang/xui/utils/ResUtils;->getColor(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mOutsideRangeColor:I

    .line 9
    sget p2, Lcom/xuexiang/xui/R$styleable;->XSeekBar_xsb_insideRangeLineStrokeWidth:I

    const/high16 p3, 0x40a00000    # 5.0f

    invoke-static {p3}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(F)I

    move-result v3

    invoke-virtual {p1, p2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    int-to-float p2, p2

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mInsideRangeLineStrokeWidth:F

    .line 10
    sget p2, Lcom/xuexiang/xui/R$styleable;->XSeekBar_xsb_outsideRangeLineStrokeWidth:I

    invoke-static {p3}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(F)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    int-to-float p2, p2

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mOutsideRangeLineStrokeWidth:F

    .line 11
    sget p2, Lcom/xuexiang/xui/R$styleable;->XSeekBar_xsb_min:I

    iget p3, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMin:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMin:I

    .line 12
    sget p2, Lcom/xuexiang/xui/R$styleable;->XSeekBar_xsb_max:I

    iget p3, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMax:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMax:I

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget p3, Lcom/xuexiang/xui/R$styleable;->XSeekBar_xsb_sliderIcon:I

    sget v3, Lcom/xuexiang/xui/R$drawable;->xui_ic_slider_icon:I

    invoke-virtual {p1, p3, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p3

    invoke-static {p2, p3}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object p2

    iput-object p2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mSliderIcon:Landroid/graphics/Bitmap;

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget p3, Lcom/xuexiang/xui/R$styleable;->XSeekBar_xsb_sliderIconFocus:I

    invoke-virtual {p1, p3, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p3

    invoke-static {p2, p3}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object p2

    iput-object p2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mSliderIconFocus:Landroid/graphics/Bitmap;

    .line 15
    sget p2, Lcom/xuexiang/xui/R$styleable;->XSeekBar_xsb_isLineRound:I

    const/4 p3, 0x1

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mIsLineRound:Z

    .line 16
    sget p2, Lcom/xuexiang/xui/R$styleable;->XSeekBar_xsb_isShowBubble:I

    invoke-virtual {p1, p2, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mIsShowBubble:Z

    .line 17
    sget p2, Lcom/xuexiang/xui/R$styleable;->XSeekBar_xsb_isFitColor:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    .line 18
    sget v3, Lcom/xuexiang/xui/R$styleable;->XSeekBar_xsb_isShowNumber:I

    invoke-virtual {p1, v3, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    iput-boolean v3, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mIsShowNumber:Z

    .line 19
    sget v3, Lcom/xuexiang/xui/R$styleable;->XSeekBar_xsb_numberTextColor:I

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mNumberTextColor:I

    .line 20
    sget v1, Lcom/xuexiang/xui/R$styleable;->XSeekBar_xsb_numberTextSize:I

    const/high16 v3, 0x41400000    # 12.0f

    invoke-static {v3}, Lcom/xuexiang/xui/utils/DensityUtils;->sp2px(F)I

    move-result v5

    invoke-virtual {p1, v1, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    int-to-float v1, v1

    iput v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mNumberTextSize:F

    .line 21
    sget v1, Lcom/xuexiang/xui/R$styleable;->XSeekBar_xsb_numberMarginBottom:I

    invoke-static {v0}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(F)I

    move-result v0

    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mNumberMarginBottom:F

    if-eqz p2, :cond_1

    .line 22
    iget-boolean p2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mIsShowBubble:Z

    if-eqz p2, :cond_0

    const/4 p2, -0x1

    .line 23
    iput p2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mNumberTextColor:I

    .line 24
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget v0, Lcom/xuexiang/xui/R$styleable;->XSeekBar_xsb_bubbleResource:I

    sget v1, Lcom/xuexiang/xui/R$drawable;->xui_bg_bubble_blue:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    invoke-static {p2, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 25
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-virtual {p2, v0, p3}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object p2

    iput-object p2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mBubbleBitmap:Landroid/graphics/Bitmap;

    .line 26
    new-instance p2, Landroid/graphics/Canvas;

    iget-object p3, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mBubbleBitmap:Landroid/graphics/Bitmap;

    invoke-direct {p2, p3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 27
    iget p3, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mInsideRangeColor:I

    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p2, p3, v0}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    goto :goto_0

    .line 28
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget p3, Lcom/xuexiang/xui/R$styleable;->XSeekBar_xsb_bubbleResource:I

    sget v0, Lcom/xuexiang/xui/R$drawable;->xui_bg_bubble_blue:I

    invoke-virtual {p1, p3, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p3

    invoke-static {p2, p3}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object p2

    iput-object p2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mBubbleBitmap:Landroid/graphics/Bitmap;

    .line 29
    :cond_2
    :goto_0
    sget p2, Lcom/xuexiang/xui/R$styleable;->XSeekBar_xsb_isShowRuler:I

    invoke-virtual {p1, p2, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mIsShowRuler:Z

    .line 30
    sget p2, Lcom/xuexiang/xui/R$styleable;->XSeekBar_xsb_rulerColor:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerColor:I

    .line 31
    sget p2, Lcom/xuexiang/xui/R$styleable;->XSeekBar_xsb_rulerTextColor:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerTextColor:I

    .line 32
    sget p2, Lcom/xuexiang/xui/R$styleable;->XSeekBar_xsb_rulerTextSize:I

    invoke-static {v3}, Lcom/xuexiang/xui/utils/DensityUtils;->sp2px(F)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    int-to-float p2, p2

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerTextSize:F

    .line 33
    sget p2, Lcom/xuexiang/xui/R$styleable;->XSeekBar_xsb_rulerMarginTop:I

    const/high16 p3, 0x40800000    # 4.0f

    invoke-static {p3}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(F)I

    move-result v0

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    int-to-float p2, p2

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerMarginTop:F

    .line 34
    sget p2, Lcom/xuexiang/xui/R$styleable;->XSeekBar_xsb_rulerDividerHeight:I

    invoke-static {p3}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(F)I

    move-result v0

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    int-to-float p2, p2

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerDividerHeight:F

    .line 35
    sget p2, Lcom/xuexiang/xui/R$styleable;->XSeekBar_xsb_rulerTextMarginTop:I

    invoke-static {p3}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(F)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    int-to-float p2, p2

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerTextMarginTop:F

    .line 36
    sget p2, Lcom/xuexiang/xui/R$styleable;->XSeekBar_xsb_rulerInterval:I

    const/16 p3, 0x14

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerInterval:I

    .line 37
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 38
    :cond_3
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMax:I

    iget p2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMin:I

    sub-int/2addr p1, p2

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRange:I

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->drawEntireRangeLine(Landroid/graphics/Canvas;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->drawSelectedRangeLine(Landroid/graphics/Canvas;)V

    .line 3
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mIsShowNumber:Z

    if-eqz v0, :cond_0

    .line 4
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->drawSelectedNumber(Landroid/graphics/Canvas;)V

    .line 5
    :cond_0
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->drawRuler(Landroid/graphics/Canvas;)V

    .line 6
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->drawSelectedTargets(Landroid/graphics/Canvas;)V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 6

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 2
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 3
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    .line 4
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    .line 5
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    .line 6
    iget v2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMax:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMaxTextRect:Landroid/graphics/Rect;

    invoke-direct {p0, v2, v3}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->getTextBounds(Ljava/lang/String;Landroid/graphics/Rect;)V

    .line 7
    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mIsShowNumber:Z

    if-eqz v2, :cond_0

    iget-boolean v3, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mIsShowBubble:Z

    if-eqz v3, :cond_0

    .line 8
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mSliderIcon:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-float v2, v2

    iget v3, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mNumberMarginBottom:F

    add-float/2addr v2, v3

    float-to-int v2, v2

    iget-object v3, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mBubbleBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    add-int/2addr v2, v3

    goto :goto_0

    :cond_0
    if-eqz v2, :cond_1

    .line 9
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mSliderIcon:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-float v2, v2

    iget v3, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mNumberMarginBottom:F

    add-float/2addr v2, v3

    float-to-int v2, v2

    goto :goto_0

    .line 10
    :cond_1
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mSliderIcon:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    .line 11
    :goto_0
    iget v3, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerMarginTop:F

    iget v4, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerDividerHeight:F

    const/high16 v5, 0x40400000    # 3.0f

    mul-float v4, v4, v5

    add-float/2addr v3, v4

    iget v4, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerTextMarginTop:F

    add-float/2addr v3, v4

    iget-object v4, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerTextRect:Landroid/graphics/Rect;

    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    move-result v4

    int-to-float v4, v4

    add-float/2addr v3, v4

    float-to-int v3, v3

    .line 12
    iget-boolean v4, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mIsShowRuler:Z

    if-eqz v4, :cond_2

    .line 13
    iget v4, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMin:I

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerTextRect:Landroid/graphics/Rect;

    invoke-direct {p0, v4, v5}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->getRulerTextBounds(Ljava/lang/String;Landroid/graphics/Rect;)V

    add-int/2addr v2, v3

    :cond_2
    const/high16 v4, 0x40000000    # 2.0f

    if-ne v0, v4, :cond_3

    goto :goto_1

    :cond_3
    const/high16 v5, -0x80000000

    if-ne v0, v5, :cond_4

    .line 14
    invoke-static {p1, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    :cond_4
    :goto_1
    if-ne v1, v4, :cond_5

    goto :goto_2

    :cond_5
    move p2, v2

    .line 15
    :goto_2
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mVerticalPadding:I

    add-int/2addr p2, v0

    .line 16
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mIsShowBubble:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mBubbleBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    goto :goto_3

    :cond_6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mSliderIcon:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMaxTextRect:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    :goto_3
    sub-int v1, p1, v0

    .line 17
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mLineLength:I

    .line 18
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mIsShowRuler:Z

    if-eqz v1, :cond_7

    sub-int v1, p2, v3

    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mSliderIcon:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    goto :goto_4

    :cond_7
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mSliderIcon:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    sub-int v1, p2, v1

    :goto_4
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMiddleY:I

    .line 19
    div-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mLineStartX:I

    .line 20
    iget v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mLineLength:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mLineEndX:I

    .line 21
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->calculateConvertFactor()V

    .line 22
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mIsFirstInit:Z

    if-eqz v0, :cond_9

    .line 23
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mSelectedNumber:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_8

    goto :goto_5

    :cond_8
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMax:I

    :goto_5
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->setSelectedValue(I)V

    .line 24
    :cond_9
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mVerticalPadding:I

    add-int/2addr p2, v0

    .line 25
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mIsFirstInit:Z

    .line 3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    .line 4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_a

    if-eq v2, v3, :cond_9

    const/4 v4, 0x2

    if-eq v2, v4, :cond_5

    const/4 v4, 0x3

    if-eq v2, v4, :cond_4

    const/4 v4, 0x5

    if-eq v2, v4, :cond_1

    const/4 v4, 0x6

    if-eq v2, v4, :cond_9

    goto/16 :goto_4

    .line 5
    :cond_1
    invoke-direct {p0, v3}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->updateTouchStatus(Z)V

    .line 6
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    if-ge v1, v0, :cond_d

    .line 7
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mLastTouchedMin:Z

    if-eqz v0, :cond_2

    .line 8
    invoke-direct {p0, v1, p1}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->checkTouchingMinTarget(ILandroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 9
    invoke-direct {p0, v1, p1}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->checkTouchingMaxTarget(ILandroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 10
    invoke-direct {p0, v1, p1}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->jumpToPosition(ILandroid/view/MotionEvent;)V

    goto :goto_1

    .line 11
    :cond_2
    invoke-direct {p0, v1, p1}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->checkTouchingMaxTarget(ILandroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 12
    invoke-direct {p0, v1, p1}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->checkTouchingMinTarget(ILandroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 13
    invoke-direct {p0, v1, p1}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->jumpToPosition(ILandroid/view/MotionEvent;)V

    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 14
    :cond_4
    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->updateTouchStatus(Z)V

    .line 15
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mTouchingMinTarget:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->clear()V

    .line 16
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mTouchingMaxTarget:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->clear()V

    .line 17
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    goto/16 :goto_4

    .line 18
    :cond_5
    invoke-direct {p0, v3}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->updateTouchStatus(Z)V

    .line 19
    :goto_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    if-ge v1, v0, :cond_8

    .line 20
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mTouchingMinTarget:Ljava/util/Set;

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 21
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    float-to-int v0, v0

    .line 22
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mLineStartX:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v4, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mLineEndX:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {p0, v0, v2, v4}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->clamp(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/Number;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 23
    iget v2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMaxPosition:I

    if-lt v0, v2, :cond_6

    .line 24
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMaxPosition:I

    .line 25
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->callMaxChangedCallbacks()V

    .line 26
    :cond_6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mTouchingMaxTarget:Ljava/util/Set;

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 27
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    float-to-int v0, v0

    .line 28
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mLineStartX:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v4, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mLineEndX:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {p0, v0, v2, v4}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->clamp(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/Number;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 29
    iput v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMaxPosition:I

    .line 30
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->callMaxChangedCallbacks()V

    :cond_7
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 31
    :cond_8
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    goto :goto_4

    .line 32
    :cond_9
    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->updateTouchStatus(Z)V

    .line 33
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mTouchingMinTarget:Ljava/util/Set;

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 34
    iget-object v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mTouchingMaxTarget:Ljava/util/Set;

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 35
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    goto :goto_4

    .line 36
    :cond_a
    invoke-direct {p0, v3}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->updateTouchStatus(Z)V

    .line 37
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mLastTouchedMin:Z

    if-eqz v1, :cond_b

    .line 38
    invoke-direct {p0, v0, p1}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->checkTouchingMinTarget(ILandroid/view/MotionEvent;)Z

    move-result v1

    if-nez v1, :cond_c

    .line 39
    invoke-direct {p0, v0, p1}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->checkTouchingMaxTarget(ILandroid/view/MotionEvent;)Z

    move-result v1

    if-nez v1, :cond_c

    .line 40
    invoke-direct {p0, v0, p1}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->jumpToPosition(ILandroid/view/MotionEvent;)V

    goto :goto_3

    .line 41
    :cond_b
    invoke-direct {p0, v0, p1}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->checkTouchingMaxTarget(ILandroid/view/MotionEvent;)Z

    move-result v1

    if-nez v1, :cond_c

    .line 42
    invoke-direct {p0, v0, p1}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->checkTouchingMinTarget(ILandroid/view/MotionEvent;)Z

    move-result v1

    if-nez v1, :cond_c

    .line 43
    invoke-direct {p0, v0, p1}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->jumpToPosition(ILandroid/view/MotionEvent;)V

    .line 44
    :cond_c
    :goto_3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_d
    :goto_4
    return v3
.end method

.method public reset()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mLineEndX:I

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMaxPosition:I

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mOnSeekBarListener:Lcom/xuexiang/xui/widget/picker/XSeekBar$OnSeekBarListener;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->getSelectedNumber()I

    move-result v1

    invoke-interface {v0, p0, v1}, Lcom/xuexiang/xui/widget/picker/XSeekBar$OnSeekBarListener;->onValueChanged(Lcom/xuexiang/xui/widget/picker/XSeekBar;I)V

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setDefaultValue(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mSelectedNumber:I

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/picker/XSeekBar;->setSelectedValue(I)V

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setInterval(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRulerInterval:I

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setMax(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMax:I

    .line 2
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMin:I

    sub-int/2addr p1, v0

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRange:I

    return-void
.end method

.method public setMin(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMin:I

    .line 2
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mMax:I

    sub-int/2addr v0, p1

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mRange:I

    return-void
.end method

.method public setOnSeekBarListener(Lcom/xuexiang/xui/widget/picker/XSeekBar$OnSeekBarListener;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/XSeekBar;->mOnSeekBarListener:Lcom/xuexiang/xui/widget/picker/XSeekBar$OnSeekBarListener;

    return-void
.end method
