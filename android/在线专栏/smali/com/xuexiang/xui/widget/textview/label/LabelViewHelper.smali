.class public final Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final DEFAULT_BACKGROUND_COLOR:I = -0x60d83240

.field private static final DEFAULT_DISTANCE:I = 0x28

.field private static final DEFAULT_HEIGHT:I = 0x14

.field private static final DEFAULT_ORIENTATION:I = 0x1

.field private static final DEFAULT_STROKE_COLOR:I = 0x0

.field private static final DEFAULT_STROKE_WIDTH:I = 0x1

.field private static final DEFAULT_TEXT_COLOR:I = -0x1

.field private static final DEFAULT_TEXT_SIZE:I = 0xe

.field private static final DEFAULT_TEXT_STYLE:I = 0x0

.field private static final LEFT_BOTTOM:I = 0x3

.field private static final LEFT_TOP:I = 0x1

.field private static final RIGHT_BOTTOM:I = 0x4

.field private static final RIGHT_TOP:I = 0x2


# instance fields
.field private mAlpha:I

.field private mBackgroundColor:I

.field private mContext:Landroid/content/Context;

.field private mDistance:I

.field private mHeight:I

.field private mOrientation:I

.field private mRectPaint:Landroid/graphics/Paint;

.field private mRectPath:Landroid/graphics/Path;

.field private mRectStrokePaint:Landroid/graphics/Paint;

.field private mStrokeColor:I

.field private mStrokeWidth:I

.field private mText:Ljava/lang/String;

.field private mTextBound:Landroid/graphics/Rect;

.field private mTextColor:I

.field private mTextFont:Ljava/lang/String;

.field private mTextPaint:Landroid/graphics/Paint;

.field private mTextPath:Landroid/graphics/Path;

.field private mTextSize:I

.field private mTextStyle:I

.field private mVisual:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mContext:Landroid/content/Context;

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->initPaints()V

    return-void
.end method

.method private calcOffset(II)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mDistance:I

    sub-int v1, p1, v0

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mHeight:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    int-to-float p1, p1

    sub-int v0, p2, v0

    sub-int/2addr v0, v2

    int-to-float v0, v0

    int-to-float p2, p2

    int-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    .line 2
    iget v3, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mOrientation:I

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eq v3, v4, :cond_3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_2

    const/4 v4, 0x3

    if-eq v3, v4, :cond_1

    const/4 v4, 0x4

    if-eq v3, v4, :cond_0

    goto/16 :goto_0

    .line 3
    :cond_0
    iget-object v3, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectPath:Landroid/graphics/Path;

    invoke-virtual {v3}, Landroid/graphics/Path;->reset()V

    .line 4
    iget-object v3, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectPath:Landroid/graphics/Path;

    invoke-virtual {v3, v1, p2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 5
    iget-object v3, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectPath:Landroid/graphics/Path;

    invoke-virtual {v3, p1, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 6
    iget-object v3, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectPath:Landroid/graphics/Path;

    iget v4, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mHeight:I

    int-to-float v4, v4

    add-float/2addr v4, v0

    invoke-virtual {v3, p1, v4}, Landroid/graphics/Path;->lineTo(FF)V

    .line 7
    iget-object v3, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectPath:Landroid/graphics/Path;

    iget v4, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mHeight:I

    int-to-float v4, v4

    add-float/2addr v4, v1

    invoke-virtual {v3, v4, p2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 8
    iget-object v3, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectPath:Landroid/graphics/Path;

    invoke-virtual {v3}, Landroid/graphics/Path;->close()V

    .line 9
    iget-object v3, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextPath:Landroid/graphics/Path;

    invoke-virtual {v3}, Landroid/graphics/Path;->reset()V

    .line 10
    iget-object v3, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextPath:Landroid/graphics/Path;

    add-float/2addr v1, v2

    invoke-virtual {v3, v1, p2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 11
    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextPath:Landroid/graphics/Path;

    add-float/2addr v0, v2

    invoke-virtual {p2, p1, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 12
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextPath:Landroid/graphics/Path;

    invoke-virtual {p1}, Landroid/graphics/Path;->close()V

    goto/16 :goto_0

    .line 13
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectPath:Landroid/graphics/Path;

    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    .line 14
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectPath:Landroid/graphics/Path;

    invoke-virtual {p1, v5, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 15
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectPath:Landroid/graphics/Path;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mDistance:I

    iget v3, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mHeight:I

    add-int/2addr v1, v3

    int-to-float v1, v1

    invoke-virtual {p1, v1, p2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 16
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectPath:Landroid/graphics/Path;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mDistance:I

    int-to-float v1, v1

    invoke-virtual {p1, v1, p2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 17
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectPath:Landroid/graphics/Path;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mHeight:I

    int-to-float v1, v1

    add-float/2addr v1, v0

    invoke-virtual {p1, v5, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 18
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectPath:Landroid/graphics/Path;

    invoke-virtual {p1}, Landroid/graphics/Path;->close()V

    .line 19
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextPath:Landroid/graphics/Path;

    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    .line 20
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextPath:Landroid/graphics/Path;

    add-float/2addr v0, v2

    invoke-virtual {p1, v5, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 21
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextPath:Landroid/graphics/Path;

    iget v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mDistance:I

    int-to-float v0, v0

    add-float/2addr v0, v2

    invoke-virtual {p1, v0, p2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 22
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextPath:Landroid/graphics/Path;

    invoke-virtual {p1}, Landroid/graphics/Path;->close()V

    goto/16 :goto_0

    .line 23
    :cond_2
    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectPath:Landroid/graphics/Path;

    invoke-virtual {p2}, Landroid/graphics/Path;->reset()V

    .line 24
    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectPath:Landroid/graphics/Path;

    invoke-virtual {p2, v1, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 25
    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectPath:Landroid/graphics/Path;

    iget v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mHeight:I

    int-to-float v0, v0

    add-float/2addr v0, v1

    invoke-virtual {p2, v0, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 26
    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectPath:Landroid/graphics/Path;

    iget v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mDistance:I

    int-to-float v0, v0

    invoke-virtual {p2, p1, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 27
    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectPath:Landroid/graphics/Path;

    iget v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mDistance:I

    iget v3, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mHeight:I

    add-int/2addr v0, v3

    int-to-float v0, v0

    invoke-virtual {p2, p1, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 28
    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectPath:Landroid/graphics/Path;

    invoke-virtual {p2}, Landroid/graphics/Path;->close()V

    .line 29
    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextPath:Landroid/graphics/Path;

    invoke-virtual {p2}, Landroid/graphics/Path;->reset()V

    .line 30
    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextPath:Landroid/graphics/Path;

    add-float/2addr v1, v2

    invoke-virtual {p2, v1, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 31
    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextPath:Landroid/graphics/Path;

    iget v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mDistance:I

    int-to-float v0, v0

    add-float/2addr v0, v2

    invoke-virtual {p2, p1, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 32
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextPath:Landroid/graphics/Path;

    invoke-virtual {p1}, Landroid/graphics/Path;->close()V

    goto :goto_0

    .line 33
    :cond_3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectPath:Landroid/graphics/Path;

    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    .line 34
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectPath:Landroid/graphics/Path;

    iget p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mDistance:I

    int-to-float p2, p2

    invoke-virtual {p1, v5, p2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 35
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectPath:Landroid/graphics/Path;

    iget p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mDistance:I

    int-to-float p2, p2

    invoke-virtual {p1, p2, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 36
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectPath:Landroid/graphics/Path;

    iget p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mDistance:I

    iget v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mHeight:I

    add-int/2addr p2, v0

    int-to-float p2, p2

    invoke-virtual {p1, p2, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 37
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectPath:Landroid/graphics/Path;

    iget p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mDistance:I

    iget v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mHeight:I

    add-int/2addr p2, v0

    int-to-float p2, p2

    invoke-virtual {p1, v5, p2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 38
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectPath:Landroid/graphics/Path;

    invoke-virtual {p1}, Landroid/graphics/Path;->close()V

    .line 39
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextPath:Landroid/graphics/Path;

    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    .line 40
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextPath:Landroid/graphics/Path;

    iget p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mDistance:I

    int-to-float p2, p2

    add-float/2addr p2, v2

    invoke-virtual {p1, v5, p2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 41
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextPath:Landroid/graphics/Path;

    iget p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mDistance:I

    int-to-float p2, p2

    add-float/2addr p2, v2

    invoke-virtual {p1, p2, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 42
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextPath:Landroid/graphics/Path;

    invoke-virtual {p1}, Landroid/graphics/Path;->close()V

    :goto_0
    return-void
.end method

.method private dip2Px(F)I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float p1, p1, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p1, v0

    float-to-int p1, p1

    return p1
.end method

.method private initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->LabelView:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 2
    sget p2, Lcom/xuexiang/xui/R$styleable;->LabelView_label_distance:I

    const/high16 p3, 0x42200000    # 40.0f

    invoke-direct {p0, p3}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->dip2Px(F)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mDistance:I

    .line 3
    sget p2, Lcom/xuexiang/xui/R$styleable;->LabelView_label_height:I

    const/high16 p3, 0x41a00000    # 20.0f

    invoke-direct {p0, p3}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->dip2Px(F)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mHeight:I

    .line 4
    sget p2, Lcom/xuexiang/xui/R$styleable;->LabelView_label_backgroundColor:I

    const p3, -0x60d83240

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mBackgroundColor:I

    .line 5
    sget p2, Lcom/xuexiang/xui/R$styleable;->LabelView_label_strokeWidth:I

    const/high16 p3, 0x3f800000    # 1.0f

    invoke-direct {p0, p3}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->dip2Px(F)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mStrokeWidth:I

    .line 6
    sget p2, Lcom/xuexiang/xui/R$styleable;->LabelView_label_strokeColor:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mStrokeColor:I

    .line 7
    sget p2, Lcom/xuexiang/xui/R$styleable;->LabelView_label_text:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mText:Ljava/lang/String;

    .line 8
    sget p2, Lcom/xuexiang/xui/R$styleable;->LabelView_label_textSize:I

    const/high16 p3, 0x41600000    # 14.0f

    invoke-direct {p0, p3}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->dip2Px(F)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextSize:I

    .line 9
    sget p2, Lcom/xuexiang/xui/R$styleable;->LabelView_label_textStyle:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextStyle:I

    .line 10
    sget p2, Lcom/xuexiang/xui/R$styleable;->LabelView_label_textFont:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextFont:Ljava/lang/String;

    .line 11
    sget p2, Lcom/xuexiang/xui/R$styleable;->LabelView_label_textColor:I

    const/4 p3, -0x1

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextColor:I

    .line 12
    sget p2, Lcom/xuexiang/xui/R$styleable;->LabelView_label_visual:I

    const/4 p3, 0x1

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mVisual:Z

    .line 13
    sget p2, Lcom/xuexiang/xui/R$styleable;->LabelView_label_orientation:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mOrientation:I

    .line 14
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private initPaints()V
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectPaint:Landroid/graphics/Paint;

    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectPaint:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 5
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectStrokePaint:Landroid/graphics/Paint;

    .line 6
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectStrokePaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectStrokePaint:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 9
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectPath:Landroid/graphics/Path;

    .line 10
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 11
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextPath:Landroid/graphics/Path;

    .line 12
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 13
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextPaint:Landroid/graphics/Paint;

    .line 14
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 15
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 16
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextPaint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 17
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextPaint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 18
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextBound:Landroid/graphics/Rect;

    return-void
.end method

.method private px2Dip(F)I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr p1, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p1, v0

    float-to-int p1, p1

    return p1
.end method


# virtual methods
.method public getLabelBackgroundColor()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mBackgroundColor:I

    return v0
.end method

.method public getLabelDistance()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mDistance:I

    int-to-float v0, v0

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->px2Dip(F)I

    move-result v0

    return v0
.end method

.method public getLabelHeight()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mHeight:I

    int-to-float v0, v0

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->px2Dip(F)I

    move-result v0

    return v0
.end method

.method public getLabelOrientation()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mOrientation:I

    return v0
.end method

.method public getLabelStrokeColor()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mStrokeColor:I

    return v0
.end method

.method public getLabelStrokeWidth()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mStrokeWidth:I

    int-to-float v0, v0

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->px2Dip(F)I

    move-result v0

    return v0
.end method

.method public getLabelText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mText:Ljava/lang/String;

    return-object v0
.end method

.method public getLabelTextColor()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextColor:I

    return v0
.end method

.method public getLabelTextFont()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextFont:Ljava/lang/String;

    return-object v0
.end method

.method public getLabelTextSize()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextSize:I

    int-to-float v0, v0

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->px2Dip(F)I

    move-result v0

    return v0
.end method

.method public getLabelTextStyle()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextStyle:I

    return v0
.end method

.method public isLabelVisual()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mVisual:Z

    return v0
.end method

.method public onDraw(Landroid/graphics/Canvas;II)V
    .locals 9

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mVisual:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mText:Ljava/lang/String;

    if-nez v0, :cond_0

    goto/16 :goto_2

    .line 2
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mDistance:I

    int-to-float v0, v0

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mHeight:I

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float/2addr v0, v1

    .line 3
    invoke-direct {p0, p2, p3}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->calcOffset(II)V

    .line 4
    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectPaint:Landroid/graphics/Paint;

    iget p3, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mBackgroundColor:I

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 5
    iget p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mAlpha:I

    if-eqz p2, :cond_1

    .line 6
    iget-object p3, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectPaint:Landroid/graphics/Paint;

    invoke-virtual {p3, p2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 7
    :cond_1
    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectStrokePaint:Landroid/graphics/Paint;

    iget p3, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mStrokeColor:I

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 8
    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectStrokePaint:Landroid/graphics/Paint;

    iget p3, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mStrokeWidth:I

    int-to-float p3, p3

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 9
    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectPath:Landroid/graphics/Path;

    iget-object p3, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 10
    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectPath:Landroid/graphics/Path;

    iget-object p3, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mRectStrokePaint:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 11
    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextPaint:Landroid/graphics/Paint;

    iget p3, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextSize:I

    int-to-float p3, p3

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 12
    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextPaint:Landroid/graphics/Paint;

    iget p3, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextColor:I

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 13
    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextPaint:Landroid/graphics/Paint;

    iget-object p3, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mText:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v3

    iget-object v4, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextBound:Landroid/graphics/Rect;

    invoke-virtual {p2, p3, v1, v3, v4}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 14
    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextFont:Ljava/lang/String;

    invoke-static {p2}, Lcom/xuexiang/xui/utils/Utils;->isNullOrEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 15
    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextPaint:Landroid/graphics/Paint;

    iget p3, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextStyle:I

    invoke-static {p3}, Landroid/graphics/Typeface;->defaultFromStyle(I)Landroid/graphics/Typeface;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    goto :goto_0

    .line 16
    :cond_2
    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextPaint:Landroid/graphics/Paint;

    iget-object p3, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextFont:Ljava/lang/String;

    invoke-static {p3}, Lcom/xuexiang/xui/XUI;->getDefaultTypeface(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    :goto_0
    const p2, 0x3fb504f3

    mul-float v0, v0, p2

    div-float/2addr v0, v2

    .line 17
    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextBound:Landroid/graphics/Rect;

    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result p2

    int-to-float p2, p2

    div-float/2addr p2, v2

    sub-float/2addr v0, p2

    const/4 p2, 0x0

    cmpg-float p3, v0, p2

    if-gez p3, :cond_3

    const/4 v6, 0x0

    goto :goto_1

    :cond_3
    move v6, v0

    .line 18
    :goto_1
    iget-object v4, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mText:Ljava/lang/String;

    iget-object v5, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextPath:Landroid/graphics/Path;

    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextBound:Landroid/graphics/Rect;

    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result p2

    int-to-float p2, p2

    div-float v7, p2, v2

    iget-object v8, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextPaint:Landroid/graphics/Paint;

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawTextOnPath(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V

    :cond_4
    :goto_2
    return-void
.end method

.method public setLabelBackgroundAlpha(Landroid/view/View;I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mAlpha:I

    if-eq v0, p2, :cond_0

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mAlpha:I

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public setLabelBackgroundColor(Landroid/view/View;I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mBackgroundColor:I

    if-eq v0, p2, :cond_0

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mBackgroundColor:I

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public setLabelDistance(Landroid/view/View;I)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mDistance:I

    int-to-float p2, p2

    invoke-direct {p0, p2}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->dip2Px(F)I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 2
    invoke-direct {p0, p2}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->dip2Px(F)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mDistance:I

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public setLabelHeight(Landroid/view/View;I)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mHeight:I

    int-to-float p2, p2

    invoke-direct {p0, p2}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->dip2Px(F)I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 2
    invoke-direct {p0, p2}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->dip2Px(F)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mHeight:I

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public setLabelOrientation(Landroid/view/View;I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mOrientation:I

    if-eq v0, p2, :cond_0

    const/4 v0, 0x4

    if-gt p2, v0, :cond_0

    const/4 v0, 0x1

    if-lt p2, v0, :cond_0

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mOrientation:I

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public setLabelStrokeColor(Landroid/view/View;I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mStrokeColor:I

    if-eq v0, p2, :cond_0

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mStrokeColor:I

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public setLabelStrokeWidth(Landroid/view/View;I)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mStrokeWidth:I

    int-to-float p2, p2

    invoke-direct {p0, p2}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->dip2Px(F)I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 2
    invoke-direct {p0, p2}, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->dip2Px(F)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mStrokeWidth:I

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public setLabelText(Landroid/view/View;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mText:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2
    :cond_0
    iput-object p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mText:Ljava/lang/String;

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_1
    return-void
.end method

.method public setLabelTextColor(Landroid/view/View;I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextColor:I

    if-eq v0, p2, :cond_0

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextColor:I

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public setLabelTextFont(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextFont:Ljava/lang/String;

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setLabelTextSize(Landroid/view/View;I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextSize:I

    if-eq v0, p2, :cond_0

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextSize:I

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public setLabelTextStyle(Landroid/view/View;I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextStyle:I

    if-ne v0, p2, :cond_0

    return-void

    .line 2
    :cond_0
    iput p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mTextStyle:I

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setLabelVisual(Landroid/view/View;Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mVisual:Z

    if-eq v0, p2, :cond_0

    .line 2
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/textview/label/LabelViewHelper;->mVisual:Z

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method
