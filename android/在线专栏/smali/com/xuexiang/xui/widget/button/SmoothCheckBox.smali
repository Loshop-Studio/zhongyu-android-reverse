.class public Lcom/xuexiang/xui/widget/button/SmoothCheckBox;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements Landroid/widget/Checkable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/button/SmoothCheckBox$OnCheckedChangeListener;
    }
.end annotation


# static fields
.field private static final COLOR_FLOOR_UNCHECKED:I

.field private static final DEF_ANIM_DURATION:I = 0x12c

.field private static final DEF_DRAW_SIZE:I = 0x19

.field private static final KEY_INSTANCE_STATE:Ljava/lang/String; = "InstanceState"


# instance fields
.field private mAnimDuration:I

.field private mCenterPoint:Landroid/graphics/Point;

.field private mChecked:Z

.field private mCheckedColor:I

.field private mDrewDistance:F

.field private mFloorColor:I

.field private mFloorPaint:Landroid/graphics/Paint;

.field private mFloorScale:F

.field private mFloorUnCheckedColor:I

.field private mLeftLineDistance:F

.field private mOnCheckedChangeListener:Lcom/xuexiang/xui/widget/button/SmoothCheckBox$OnCheckedChangeListener;

.field private mPaint:Landroid/graphics/Paint;

.field private mRightLineDistance:F

.field private mScaleVal:F

.field private mStrokeWidth:I

.field private mTickDrawing:Z

.field private mTickPaint:Landroid/graphics/Paint;

.field private mTickPath:Landroid/graphics/Path;

.field private mTickPoints:[Landroid/graphics/Point;

.field private mUnCheckedColor:I

.field private mWidth:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "#DFDFDF"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->COLOR_FLOOR_UNCHECKED:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->SmoothCheckBoxStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mScaleVal:F

    iput v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mFloorScale:F

    .line 5
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method static synthetic access$002(Lcom/xuexiang/xui/widget/button/SmoothCheckBox;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickDrawing:Z

    return p1
.end method

.method static synthetic access$1000(Lcom/xuexiang/xui/widget/button/SmoothCheckBox;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mFloorUnCheckedColor:I

    return p0
.end method

.method static synthetic access$102(Lcom/xuexiang/xui/widget/button/SmoothCheckBox;F)F
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mDrewDistance:F

    return p1
.end method

.method static synthetic access$200(Lcom/xuexiang/xui/widget/button/SmoothCheckBox;)V
    .locals 0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->startCheckedAnimation()V

    return-void
.end method

.method static synthetic access$300(Lcom/xuexiang/xui/widget/button/SmoothCheckBox;)V
    .locals 0

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->startUnCheckedAnimation()V

    return-void
.end method

.method static synthetic access$400(Lcom/xuexiang/xui/widget/button/SmoothCheckBox;)F
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mScaleVal:F

    return p0
.end method

.method static synthetic access$402(Lcom/xuexiang/xui/widget/button/SmoothCheckBox;F)F
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mScaleVal:F

    return p1
.end method

.method static synthetic access$502(Lcom/xuexiang/xui/widget/button/SmoothCheckBox;I)I
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mFloorColor:I

    return p1
.end method

.method static synthetic access$600(Lcom/xuexiang/xui/widget/button/SmoothCheckBox;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mUnCheckedColor:I

    return p0
.end method

.method static synthetic access$700(Lcom/xuexiang/xui/widget/button/SmoothCheckBox;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mCheckedColor:I

    return p0
.end method

.method static synthetic access$800(IIF)I
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->getGradientColor(IIF)I

    move-result p0

    return p0
.end method

.method static synthetic access$902(Lcom/xuexiang/xui/widget/button/SmoothCheckBox;F)F
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mFloorScale:F

    return p1
.end method

.method private drawBorder(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mFloorPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mFloorColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mCenterPoint:Landroid/graphics/Point;

    iget v1, v0, Landroid/graphics/Point;->x:I

    int-to-float v2, v1

    .line 3
    iget v0, v0, Landroid/graphics/Point;->y:I

    int-to-float v0, v0

    int-to-float v1, v1

    iget v3, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mFloorScale:F

    mul-float v1, v1, v3

    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mFloorPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v0, v1, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return-void
.end method

.method private drawCenter(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mUnCheckedColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mCenterPoint:Landroid/graphics/Point;

    iget v1, v0, Landroid/graphics/Point;->x:I

    iget v2, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mStrokeWidth:I

    sub-int v2, v1, v2

    int-to-float v2, v2

    iget v3, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mScaleVal:F

    mul-float v2, v2, v3

    int-to-float v1, v1

    .line 3
    iget v0, v0, Landroid/graphics/Point;->y:I

    int-to-float v0, v0

    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v0, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return-void
.end method

.method private drawTick(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickDrawing:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->drawTickPath(Landroid/graphics/Canvas;)V

    :cond_0
    return-void
.end method

.method private drawTickDelayed()V
    .locals 3

    new-instance v0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox$7;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox$7;-><init>(Lcom/xuexiang/xui/widget/button/SmoothCheckBox;)V

    iget v1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mAnimDuration:I

    int-to-long v1, v1

    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private drawTickPath(Landroid/graphics/Canvas;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPath:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 2
    iget v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mDrewDistance:F

    iget v1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mLeftLineDistance:F

    const/4 v2, 0x0

    const/4 v3, 0x1

    cmpg-float v4, v0, v1

    if-gez v4, :cond_1

    .line 3
    iget v4, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mWidth:I

    int-to-float v5, v4

    const/high16 v6, 0x41a00000    # 20.0f

    div-float/2addr v5, v6

    const/high16 v7, 0x40400000    # 3.0f

    cmpg-float v5, v5, v7

    if-gez v5, :cond_0

    goto :goto_0

    :cond_0
    int-to-float v4, v4

    div-float v7, v4, v6

    :goto_0
    add-float/2addr v0, v7

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mDrewDistance:F

    .line 5
    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPoints:[Landroid/graphics/Point;

    aget-object v5, v4, v2

    iget v5, v5, Landroid/graphics/Point;->x:I

    int-to-float v5, v5

    aget-object v6, v4, v3

    iget v6, v6, Landroid/graphics/Point;->x:I

    aget-object v7, v4, v2

    iget v7, v7, Landroid/graphics/Point;->x:I

    sub-int/2addr v6, v7

    int-to-float v6, v6

    mul-float v6, v6, v0

    div-float/2addr v6, v1

    add-float/2addr v5, v6

    .line 6
    aget-object v6, v4, v2

    iget v6, v6, Landroid/graphics/Point;->y:I

    int-to-float v6, v6

    aget-object v3, v4, v3

    iget v3, v3, Landroid/graphics/Point;->y:I

    aget-object v7, v4, v2

    iget v7, v7, Landroid/graphics/Point;->y:I

    sub-int/2addr v3, v7

    int-to-float v3, v3

    mul-float v3, v3, v0

    div-float/2addr v3, v1

    add-float/2addr v6, v3

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPath:Landroid/graphics/Path;

    aget-object v1, v4, v2

    iget v1, v1, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    aget-object v2, v4, v2

    iget v2, v2, Landroid/graphics/Point;->y:I

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPath:Landroid/graphics/Path;

    invoke-virtual {v0, v5, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPath:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 10
    iget p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mDrewDistance:F

    iget v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mLeftLineDistance:F

    cmpl-float p1, p1, v0

    if-lez p1, :cond_3

    .line 11
    iput v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mDrewDistance:F

    goto/16 :goto_1

    .line 12
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPath:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPoints:[Landroid/graphics/Point;

    aget-object v4, v1, v2

    iget v4, v4, Landroid/graphics/Point;->x:I

    int-to-float v4, v4

    aget-object v1, v1, v2

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    invoke-virtual {v0, v4, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 13
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPath:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPoints:[Landroid/graphics/Point;

    aget-object v2, v1, v3

    iget v2, v2, Landroid/graphics/Point;->x:I

    int-to-float v2, v2

    aget-object v1, v1, v3

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 14
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPath:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 15
    iget v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mDrewDistance:F

    iget v1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mLeftLineDistance:F

    iget v2, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mRightLineDistance:F

    add-float v4, v1, v2

    const/4 v5, 0x2

    cmpg-float v4, v0, v4

    if-gez v4, :cond_2

    .line 16
    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPoints:[Landroid/graphics/Point;

    aget-object v6, v4, v3

    iget v6, v6, Landroid/graphics/Point;->x:I

    int-to-float v6, v6

    aget-object v7, v4, v5

    iget v7, v7, Landroid/graphics/Point;->x:I

    aget-object v8, v4, v3

    iget v8, v8, Landroid/graphics/Point;->x:I

    sub-int/2addr v7, v8

    int-to-float v7, v7

    sub-float v8, v0, v1

    mul-float v7, v7, v8

    div-float/2addr v7, v2

    add-float/2addr v6, v7

    .line 17
    aget-object v7, v4, v3

    iget v7, v7, Landroid/graphics/Point;->y:I

    int-to-float v7, v7

    aget-object v8, v4, v3

    iget v8, v8, Landroid/graphics/Point;->y:I

    aget-object v4, v4, v5

    iget v4, v4, Landroid/graphics/Point;->y:I

    sub-int/2addr v8, v4

    int-to-float v4, v8

    sub-float/2addr v0, v1

    mul-float v4, v4, v0

    div-float/2addr v4, v2

    sub-float/2addr v7, v4

    .line 18
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPath:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 19
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPath:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPoints:[Landroid/graphics/Point;

    aget-object v2, v1, v3

    iget v2, v2, Landroid/graphics/Point;->x:I

    int-to-float v2, v2

    aget-object v1, v1, v3

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 20
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPath:Landroid/graphics/Path;

    invoke-virtual {v0, v6, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 21
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPath:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 22
    iget p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mWidth:I

    div-int/lit8 p1, p1, 0x14

    const/4 v0, 0x3

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    int-to-float p1, p1

    .line 23
    iget v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mDrewDistance:F

    add-float/2addr v0, p1

    iput v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mDrewDistance:F

    goto :goto_1

    .line 24
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPath:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 25
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPath:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPoints:[Landroid/graphics/Point;

    aget-object v2, v1, v3

    iget v2, v2, Landroid/graphics/Point;->x:I

    int-to-float v2, v2

    aget-object v1, v1, v3

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 26
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPath:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPoints:[Landroid/graphics/Point;

    aget-object v2, v1, v5

    iget v2, v2, Landroid/graphics/Point;->x:I

    int-to-float v2, v2

    aget-object v1, v1, v5

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 27
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPath:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 28
    :cond_3
    :goto_1
    iget p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mDrewDistance:F

    iget v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mLeftLineDistance:F

    iget v1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mRightLineDistance:F

    add-float/2addr v0, v1

    cmpg-float p1, p1, v0

    if-gez p1, :cond_4

    .line 29
    new-instance p1, Lcom/xuexiang/xui/widget/button/SmoothCheckBox$2;

    invoke-direct {p1, p0}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox$2;-><init>(Lcom/xuexiang/xui/widget/button/SmoothCheckBox;)V

    const-wide/16 v0, 0xa

    invoke-virtual {p0, p1, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_4
    return-void
.end method

.method private static getGradientColor(IIF)I
    .locals 7

    .line 1
    invoke-static {p0}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    .line 2
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    move-result v1

    .line 3
    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    move-result v2

    .line 4
    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    move-result p0

    .line 5
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v3

    .line 6
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v4

    .line 7
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v5

    .line 8
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result p1

    int-to-float v0, v0

    const/high16 v6, 0x3f800000    # 1.0f

    sub-float/2addr v6, p2

    mul-float v0, v0, v6

    int-to-float v3, v3

    mul-float v3, v3, p2

    add-float/2addr v0, v3

    float-to-int v0, v0

    int-to-float v1, v1

    mul-float v1, v1, v6

    int-to-float v3, v4

    mul-float v3, v3, p2

    add-float/2addr v1, v3

    float-to-int v1, v1

    int-to-float v2, v2

    mul-float v2, v2, v6

    int-to-float v3, v5

    mul-float v3, v3, p2

    add-float/2addr v2, v3

    float-to-int v2, v2

    int-to-float p0, p0

    mul-float p0, p0, v6

    int-to-float p1, p1

    mul-float p1, p1, p2

    add-float/2addr p0, p1

    float-to-int p0, p0

    .line 9
    invoke-static {v0, v1, v2, p0}, Landroid/graphics/Color;->argb(IIII)I

    move-result p0

    return p0
.end method

.method private initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->SmoothCheckBox:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 2
    sget p3, Lcom/xuexiang/xui/R$styleable;->SmoothCheckBox_scb_color_tick:I

    const/4 v0, -0x1

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    .line 3
    sget v2, Lcom/xuexiang/xui/R$styleable;->SmoothCheckBox_scb_duration:I

    const/16 v3, 0x12c

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mAnimDuration:I

    .line 4
    sget v2, Lcom/xuexiang/xui/R$styleable;->SmoothCheckBox_scb_color_unchecked_stroke:I

    sget v3, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->COLOR_FLOOR_UNCHECKED:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mFloorColor:I

    .line 5
    sget v2, Lcom/xuexiang/xui/R$styleable;->SmoothCheckBox_scb_color_checked:I

    invoke-static {p1}, Lcom/xuexiang/xui/utils/ThemeUtils;->getMainThemeColor(Landroid/content/Context;)I

    move-result p1

    invoke-virtual {p2, v2, p1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mCheckedColor:I

    .line 6
    sget p1, Lcom/xuexiang/xui/R$styleable;->SmoothCheckBox_scb_color_unchecked:I

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mUnCheckedColor:I

    .line 7
    sget p1, Lcom/xuexiang/xui/R$styleable;->SmoothCheckBox_scb_stroke_width:I

    invoke-virtual {p2, p1, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mStrokeWidth:I

    .line 8
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 9
    iget p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mFloorColor:I

    iput p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mFloorUnCheckedColor:I

    .line 10
    new-instance p1, Landroid/graphics/Paint;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPaint:Landroid/graphics/Paint;

    .line 11
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 12
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPaint:Landroid/graphics/Paint;

    sget-object v0, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 13
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 14
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mFloorPaint:Landroid/graphics/Paint;

    .line 15
    sget-object p3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 16
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mFloorPaint:Landroid/graphics/Paint;

    iget p3, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mFloorColor:I

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 17
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mPaint:Landroid/graphics/Paint;

    .line 18
    sget-object p3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 19
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mPaint:Landroid/graphics/Paint;

    iget p3, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mCheckedColor:I

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 20
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPath:Landroid/graphics/Path;

    .line 21
    new-instance p1, Landroid/graphics/Point;

    invoke-direct {p1}, Landroid/graphics/Point;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mCenterPoint:Landroid/graphics/Point;

    const/4 p1, 0x3

    new-array p1, p1, [Landroid/graphics/Point;

    .line 22
    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPoints:[Landroid/graphics/Point;

    .line 23
    new-instance p3, Landroid/graphics/Point;

    invoke-direct {p3}, Landroid/graphics/Point;-><init>()V

    aput-object p3, p1, v1

    .line 24
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPoints:[Landroid/graphics/Point;

    new-instance p3, Landroid/graphics/Point;

    invoke-direct {p3}, Landroid/graphics/Point;-><init>()V

    aput-object p3, p1, p2

    .line 25
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPoints:[Landroid/graphics/Point;

    new-instance p2, Landroid/graphics/Point;

    invoke-direct {p2}, Landroid/graphics/Point;-><init>()V

    const/4 p3, 0x2

    aput-object p2, p1, p3

    .line 26
    new-instance p1, Lcom/xuexiang/xui/widget/button/SmoothCheckBox$1;

    invoke-direct {p1, p0}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox$1;-><init>(Lcom/xuexiang/xui/widget/button/SmoothCheckBox;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private measureSize(I)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41c80000    # 25.0f

    invoke-static {v0, v1}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result v0

    .line 2
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    .line 3
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p1

    const/high16 v2, -0x80000000

    if-eq p1, v2, :cond_0

    if-eqz p1, :cond_0

    const/high16 v0, 0x40000000    # 2.0f

    if-eq p1, v0, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_1
    :goto_0
    return v1
.end method

.method private reset()V
    .locals 3

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickDrawing:Z

    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    iput v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mFloorScale:F

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->isChecked()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    iput v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mScaleVal:F

    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mCheckedColor:I

    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mFloorUnCheckedColor:I

    :goto_0
    iput v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mFloorColor:I

    .line 5
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mLeftLineDistance:F

    iget v1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mRightLineDistance:F

    add-float v2, v0, v1

    :cond_2
    iput v2, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mDrewDistance:F

    return-void
.end method

.method private startCheckedAnimation()V
    .locals 6

    const/4 v0, 0x2

    new-array v1, v0, [F

    .line 1
    fill-array-data v1, :array_0

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    .line 2
    iget v2, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mAnimDuration:I

    const/4 v3, 0x3

    div-int/2addr v2, v3

    mul-int/lit8 v2, v2, 0x2

    int-to-long v4, v2

    invoke-virtual {v1, v4, v5}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 3
    new-instance v0, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v1, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 4
    new-instance v0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox$3;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox$3;-><init>(Lcom/xuexiang/xui/widget/button/SmoothCheckBox;)V

    invoke-virtual {v1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 5
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    new-array v0, v3, [F

    .line 6
    fill-array-data v0, :array_1

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    .line 7
    iget v1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mAnimDuration:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 8
    new-instance v1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 9
    new-instance v1, Lcom/xuexiang/xui/widget/button/SmoothCheckBox$4;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox$4;-><init>(Lcom/xuexiang/xui/widget/button/SmoothCheckBox;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 10
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 11
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->drawTickDelayed()V

    return-void

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x3f4ccccd    # 0.8f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private startUnCheckedAnimation()V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [F

    .line 1
    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    .line 2
    iget v1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mAnimDuration:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 3
    new-instance v1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 4
    new-instance v1, Lcom/xuexiang/xui/widget/button/SmoothCheckBox$5;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox$5;-><init>(Lcom/xuexiang/xui/widget/button/SmoothCheckBox;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 5
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    const/4 v0, 0x3

    new-array v0, v0, [F

    .line 6
    fill-array-data v0, :array_1

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    .line 7
    iget v1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mAnimDuration:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 8
    new-instance v1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 9
    new-instance v1, Lcom/xuexiang/xui/widget/button/SmoothCheckBox$6;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox$6;-><init>(Lcom/xuexiang/xui/widget/button/SmoothCheckBox;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 10
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x3f4ccccd    # 0.8f
        0x3f800000    # 1.0f
    .end array-data
.end method


# virtual methods
.method public isChecked()Z
    .locals 1

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mChecked:Z

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->drawBorder(Landroid/graphics/Canvas;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->drawCenter(Landroid/graphics/Canvas;)V

    .line 3
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->drawTick(Landroid/graphics/Canvas;)V

    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mWidth:I

    .line 2
    iget p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mStrokeWidth:I

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    div-int/lit8 p1, p1, 0xa

    :cond_0
    iput p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mStrokeWidth:I

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    div-int/lit8 p2, p2, 0x5

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mStrokeWidth:I

    const/4 p2, 0x3

    .line 4
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mStrokeWidth:I

    .line 5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mCenterPoint:Landroid/graphics/Point;

    iget p2, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mWidth:I

    const/4 p3, 0x2

    div-int/2addr p2, p3

    iput p2, p1, Landroid/graphics/Point;->x:I

    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    div-int/2addr p2, p3

    iput p2, p1, Landroid/graphics/Point;->y:I

    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPoints:[Landroid/graphics/Point;

    const/4 p2, 0x0

    aget-object p1, p1, p2

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p4

    int-to-float p4, p4

    const/high16 p5, 0x41f00000    # 30.0f

    div-float/2addr p4, p5

    const/high16 v0, 0x40e00000    # 7.0f

    mul-float p4, p4, v0

    invoke-static {p4}, Ljava/lang/Math;->round(F)I

    move-result p4

    iput p4, p1, Landroid/graphics/Point;->x:I

    .line 8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPoints:[Landroid/graphics/Point;

    aget-object p1, p1, p2

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p4

    int-to-float p4, p4

    div-float/2addr p4, p5

    const/high16 v0, 0x41600000    # 14.0f

    mul-float p4, p4, v0

    invoke-static {p4}, Ljava/lang/Math;->round(F)I

    move-result p4

    iput p4, p1, Landroid/graphics/Point;->y:I

    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPoints:[Landroid/graphics/Point;

    const/4 p4, 0x1

    aget-object p1, p1, p4

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, p5

    const/high16 v1, 0x41500000    # 13.0f

    mul-float v0, v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p1, Landroid/graphics/Point;->x:I

    .line 10
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPoints:[Landroid/graphics/Point;

    aget-object p1, p1, p4

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, p5

    const/high16 v1, 0x41a00000    # 20.0f

    mul-float v0, v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p1, Landroid/graphics/Point;->y:I

    .line 11
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPoints:[Landroid/graphics/Point;

    aget-object p1, p1, p3

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, p5

    const/high16 v1, 0x41b00000    # 22.0f

    mul-float v0, v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p1, Landroid/graphics/Point;->x:I

    .line 12
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPoints:[Landroid/graphics/Point;

    aget-object p1, p1, p3

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, p5

    const/high16 p5, 0x41200000    # 10.0f

    mul-float v0, v0, p5

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result p5

    iput p5, p1, Landroid/graphics/Point;->y:I

    .line 13
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPoints:[Landroid/graphics/Point;

    aget-object p5, p1, p4

    iget p5, p5, Landroid/graphics/Point;->x:I

    aget-object p1, p1, p2

    iget p1, p1, Landroid/graphics/Point;->x:I

    sub-int/2addr p5, p1

    int-to-double v0, p5

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPoints:[Landroid/graphics/Point;

    aget-object p5, p1, p4

    iget p5, p5, Landroid/graphics/Point;->y:I

    aget-object p1, p1, p2

    iget p1, p1, Landroid/graphics/Point;->y:I

    sub-int/2addr p5, p1

    int-to-double p1, p5

    .line 14
    invoke-static {p1, p2, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p1

    add-double/2addr v0, p1

    .line 15
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p1

    double-to-float p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mLeftLineDistance:F

    .line 16
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPoints:[Landroid/graphics/Point;

    aget-object p2, p1, p3

    iget p2, p2, Landroid/graphics/Point;->x:I

    aget-object p1, p1, p4

    iget p1, p1, Landroid/graphics/Point;->x:I

    sub-int/2addr p2, p1

    int-to-double p1, p2

    invoke-static {p1, p2, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p1

    iget-object p5, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPoints:[Landroid/graphics/Point;

    aget-object p3, p5, p3

    iget p3, p3, Landroid/graphics/Point;->y:I

    aget-object p4, p5, p4

    iget p4, p4, Landroid/graphics/Point;->y:I

    sub-int/2addr p3, p4

    int-to-double p3, p3

    .line 17
    invoke-static {p3, p4, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p3

    add-double/2addr p1, p3

    .line 18
    invoke-static {p1, p2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p1

    double-to-float p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mRightLineDistance:F

    .line 19
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickPaint:Landroid/graphics/Paint;

    iget p2, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mStrokeWidth:I

    int-to-float p2, p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->measureSize(I)I

    move-result p1

    invoke-direct {p0, p2}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->measureSize(I)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method protected onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    .line 1
    instance-of v0, p1, Landroid/os/Bundle;

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Landroid/os/Bundle;

    const-string v0, "InstanceState"

    .line 3
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    .line 4
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->setChecked(Z)V

    .line 5
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    .line 6
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void
.end method

.method protected onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 2
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    const-string v2, "InstanceState"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->isChecked()Z

    move-result v1

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-object v0
.end method

.method public setChecked(Z)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->setCheckedSilent(Z)V

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mOnCheckedChangeListener:Lcom/xuexiang/xui/widget/button/SmoothCheckBox$OnCheckedChangeListener;

    if-eqz p1, :cond_0

    .line 3
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mChecked:Z

    invoke-interface {p1, p0, v0}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox$OnCheckedChangeListener;->onCheckedChanged(Lcom/xuexiang/xui/widget/button/SmoothCheckBox;Z)V

    :cond_0
    return-void
.end method

.method public setChecked(ZZ)V
    .locals 0

    if-eqz p2, :cond_1

    const/4 p2, 0x0

    .line 4
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mTickDrawing:Z

    .line 5
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mChecked:Z

    const/4 p2, 0x0

    .line 6
    iput p2, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mDrewDistance:F

    if-eqz p1, :cond_0

    .line 7
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->startCheckedAnimation()V

    goto :goto_0

    .line 8
    :cond_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->startUnCheckedAnimation()V

    .line 9
    :goto_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mOnCheckedChangeListener:Lcom/xuexiang/xui/widget/button/SmoothCheckBox$OnCheckedChangeListener;

    if-eqz p1, :cond_2

    .line 10
    iget-boolean p2, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mChecked:Z

    invoke-interface {p1, p0, p2}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox$OnCheckedChangeListener;->onCheckedChanged(Lcom/xuexiang/xui/widget/button/SmoothCheckBox;Z)V

    goto :goto_1

    .line 11
    :cond_1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->setChecked(Z)V

    :cond_2
    :goto_1
    return-void
.end method

.method public setCheckedSilent(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mChecked:Z

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->reset()V

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setOnCheckedChangeListener(Lcom/xuexiang/xui/widget/button/SmoothCheckBox$OnCheckedChangeListener;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->mOnCheckedChangeListener:Lcom/xuexiang/xui/widget/button/SmoothCheckBox$OnCheckedChangeListener;

    return-void
.end method

.method public toggle()V
    .locals 1

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->isChecked()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/button/SmoothCheckBox;->setChecked(Z)V

    return-void
.end method
