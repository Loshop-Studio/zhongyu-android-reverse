.class public Lcom/xuexiang/xui/widget/progress/CircleProgressView;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/progress/CircleProgressView$CircleProgressUpdateListener;
    }
.end annotation


# static fields
.field public static final ACCELERATE_DECELERATE_INTERPOLATOR:I = 0x0

.field public static final ACCELERATE_INTERPOLATOR:I = 0x2

.field public static final DECELERATE_INTERPOLATOR:I = 0x3

.field public static final LINEAR_INTERPOLATOR:I = 0x1

.field public static final OVERSHOOT_INTERPOLATOR:I = 0x4


# instance fields
.field private circleBroken:Z

.field private fillEnabled:Z

.field private isGraduated:Z

.field private mAnimateType:I

.field private mEndColor:I

.field private mEndProgress:F

.field private mInterpolator:Landroid/view/animation/Interpolator;

.field private mOval:Landroid/graphics/RectF;

.field private mProgressDuration:I

.field private mProgressTextColor:I

.field private mProgressTextSize:I

.field private mProgressWidth:I

.field private mScaleZoneCornerRadius:I

.field private mScaleZoneLength:F

.field private mScaleZonePadding:I

.field private mScaleZonePath:Landroid/graphics/Path;

.field private mScaleZoneWidth:F

.field private mShader:Landroid/graphics/LinearGradient;

.field private mStartColor:I

.field private mStartProgress:F

.field private mTrackColor:I

.field private mTrackWidth:I

.field private mUpdateListener:Lcom/xuexiang/xui/widget/progress/CircleProgressView$CircleProgressUpdateListener;

.field private moveProgress:F

.field pathEffect:Landroid/graphics/PathEffect;

.field private progressAnimator:Landroid/animation/ObjectAnimator;

.field private progressPaint:Landroid/graphics/Paint;

.field private textVisibility:Z

.field private trackEnabled:Z

.field private trackPaint:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->CircleProgressViewStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mAnimateType:I

    const/4 v1, 0x0

    .line 5
    iput v1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mStartProgress:F

    const/high16 v2, 0x42700000    # 60.0f

    .line 6
    iput v2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mEndProgress:F

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/xuexiang/xui/R$color;->xui_config_color_light_orange:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mStartColor:I

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/xuexiang/xui/R$color;->xui_config_color_dark_orange:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mEndColor:I

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/xuexiang/xui/R$color;->default_pv_track_color:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mTrackColor:I

    const/16 v2, 0x4b0

    .line 10
    iput v2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mProgressDuration:I

    .line 11
    iput v1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->moveProgress:F

    .line 12
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->isGraduated:Z

    .line 13
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mScaleZoneCornerRadius:I

    .line 14
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->obtainAttrs(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 15
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->init()V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/progress/CircleProgressView;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->drawScaleZones(Z)V

    return-void
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/progress/CircleProgressView;)Lcom/xuexiang/xui/widget/progress/CircleProgressView$CircleProgressUpdateListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mUpdateListener:Lcom/xuexiang/xui/widget/progress/CircleProgressView$CircleProgressUpdateListener;

    return-object p0
.end method

.method private drawProgress(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->progressPaint:Landroid/graphics/Paint;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mShader:Landroid/graphics/LinearGradient;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->updateTheTrack()V

    .line 3
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->fillEnabled:Z

    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->initProgressDrawing(Landroid/graphics/Canvas;Z)V

    return-void
.end method

.method private drawProgressText(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->textVisibility:Z

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 3
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 4
    iget v2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mProgressTextSize:I

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 5
    iget v2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mProgressTextColor:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 6
    sget-object v2, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 7
    invoke-static {}, Lcom/xuexiang/xui/XUI;->getDefaultTypeface()Landroid/graphics/Typeface;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 8
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget v3, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->moveProgress:F

    float-to-int v3, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "%"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v4

    sub-int/2addr v3, v4

    shr-int/lit8 v1, v3, 0x1

    int-to-float v1, v1

    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    int-to-float v3, v3

    invoke-virtual {v0}, Landroid/graphics/Paint;->descent()F

    move-result v4

    invoke-virtual {v0}, Landroid/graphics/Paint;->ascent()F

    move-result v5

    add-float/2addr v4, v5

    sub-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    .line 11
    invoke-virtual {p1, v2, v1, v3, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_0
    return-void
.end method

.method private drawScaleZones(Z)V
    .locals 4

    if-eqz p1, :cond_1

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->pathEffect:Landroid/graphics/PathEffect;

    if-nez p1, :cond_0

    .line 2
    new-instance p1, Landroid/graphics/PathDashPathEffect;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mScaleZonePath:Landroid/graphics/Path;

    iget v1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mScaleZonePadding:I

    int-to-float v1, v1

    const/4 v2, 0x0

    sget-object v3, Landroid/graphics/PathDashPathEffect$Style;->ROTATE:Landroid/graphics/PathDashPathEffect$Style;

    invoke-direct {p1, v0, v1, v2, v3}, Landroid/graphics/PathDashPathEffect;-><init>(Landroid/graphics/Path;FFLandroid/graphics/PathDashPathEffect$Style;)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->pathEffect:Landroid/graphics/PathEffect;

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->progressPaint:Landroid/graphics/Paint;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->pathEffect:Landroid/graphics/PathEffect;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->pathEffect:Landroid/graphics/PathEffect;

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->progressPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    :goto_0
    return-void
.end method

.method private drawTrack(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->trackEnabled:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->trackPaint:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->trackPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mTrackColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 4
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->fillEnabled:Z

    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->initTrack(Landroid/graphics/Canvas;Z)V

    :cond_0
    return-void
.end method

.method private init()V
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->progressPaint:Landroid/graphics/Paint;

    .line 2
    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->progressPaint:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->progressPaint:Landroid/graphics/Paint;

    iget v2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mProgressWidth:I

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 5
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->trackPaint:Landroid/graphics/Paint;

    .line 6
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->trackPaint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->trackPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mTrackWidth:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 9
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mScaleZonePath:Landroid/graphics/Path;

    .line 10
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->isGraduated:Z

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->drawScaleZones(Z)V

    return-void
.end method

.method private initProgressDrawing(Landroid/graphics/Canvas;Z)V
    .locals 13

    if-eqz p2, :cond_0

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->progressPaint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->progressPaint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 3
    :goto_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->circleBroken:Z

    if-eqz v0, :cond_1

    .line 4
    iget-object v2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mOval:Landroid/graphics/RectF;

    const/high16 v0, 0x43070000    # 135.0f

    iget v1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mStartProgress:F

    const v3, 0x402ccccd    # 2.7f

    mul-float v4, v1, v3

    add-float/2addr v0, v4

    iget v4, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->moveProgress:F

    sub-float/2addr v4, v1

    mul-float v4, v4, v3

    iget-object v6, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->progressPaint:Landroid/graphics/Paint;

    move-object v1, p1

    move v3, v0

    move v5, p2

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    goto :goto_1

    .line 5
    :cond_1
    iget-object v8, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mOval:Landroid/graphics/RectF;

    const/high16 v0, 0x43870000    # 270.0f

    iget v1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mStartProgress:F

    const v2, 0x40666666    # 3.6f

    mul-float v3, v1, v2

    add-float v9, v3, v0

    iget v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->moveProgress:F

    sub-float/2addr v0, v1

    mul-float v10, v0, v2

    iget-object v12, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->progressPaint:Landroid/graphics/Paint;

    move-object v7, p1

    move v11, p2

    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    :goto_1
    return-void
.end method

.method private initTrack(Landroid/graphics/Canvas;Z)V
    .locals 13

    if-eqz p2, :cond_0

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->trackPaint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->trackPaint:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 3
    :goto_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->circleBroken:Z

    if-eqz v0, :cond_1

    .line 4
    iget-object v2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mOval:Landroid/graphics/RectF;

    const/high16 v3, 0x43070000    # 135.0f

    const/high16 v4, 0x43870000    # 270.0f

    iget-object v6, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->trackPaint:Landroid/graphics/Paint;

    move-object v1, p1

    move v5, p2

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    goto :goto_1

    .line 5
    :cond_1
    iget-object v8, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mOval:Landroid/graphics/RectF;

    const/high16 v9, 0x42b40000    # 90.0f

    const/high16 v10, 0x43b40000    # 360.0f

    iget-object v12, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->trackPaint:Landroid/graphics/Paint;

    move-object v7, p1

    move v11, p2

    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    :goto_1
    return-void
.end method

.method private obtainAttrs(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->CircleProgressView:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 2
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_start_progress:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    int-to-float p2, p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mStartProgress:F

    .line 3
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_end_progress:I

    const/16 p3, 0x3c

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    int-to-float p2, p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mEndProgress:F

    .line 4
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_start_color:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget v0, Lcom/xuexiang/xui/R$color;->xui_config_color_light_orange:I

    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mStartColor:I

    .line 5
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_end_color:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget v0, Lcom/xuexiang/xui/R$color;->xui_config_color_dark_orange:I

    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mEndColor:I

    .line 6
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_isFilled:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->fillEnabled:Z

    .line 7
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_isTracked:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->trackEnabled:Z

    .line 8
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_circle_broken:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->circleBroken:Z

    .line 9
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_progress_textColor:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3}, Lcom/xuexiang/xui/utils/ThemeUtils;->getMainThemeColor(Landroid/content/Context;)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mProgressTextColor:I

    .line 10
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_progress_textSize:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget v0, Lcom/xuexiang/xui/R$dimen;->default_pv_progress_text_size:I

    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mProgressTextSize:I

    .line 11
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_track_width:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget v0, Lcom/xuexiang/xui/R$dimen;->default_pv_trace_width:I

    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mTrackWidth:I

    .line 12
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_progress_width:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mProgressWidth:I

    .line 13
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_animate_type:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mAnimateType:I

    .line 14
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_track_color:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget v0, Lcom/xuexiang/xui/R$color;->default_pv_track_color:I

    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mTrackColor:I

    .line 15
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_progress_textVisibility:I

    const/4 p3, 0x1

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->textVisibility:Z

    .line 16
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_progress_duration:I

    const/16 p3, 0x4b0

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mProgressDuration:I

    .line 17
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_scaleZone_length:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget v0, Lcom/xuexiang/xui/R$dimen;->default_pv_zone_length:I

    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    int-to-float p2, p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mScaleZoneLength:F

    .line 18
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_scaleZone_width:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget v0, Lcom/xuexiang/xui/R$dimen;->default_pv_zone_width:I

    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    int-to-float p2, p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mScaleZoneWidth:F

    .line 19
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_scaleZone_padding:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget v0, Lcom/xuexiang/xui/R$dimen;->default_pv_zone_padding:I

    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mScaleZonePadding:I

    .line 20
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_scaleZone_corner_radius:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget v0, Lcom/xuexiang/xui/R$dimen;->default_pv_zone_corner_radius:I

    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mScaleZoneCornerRadius:I

    .line 21
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_isGraduated:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->isGraduated:Z

    .line 22
    iget p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mStartProgress:F

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->moveProgress:F

    .line 23
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private refreshTheView()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method private setObjectAnimatorType(I)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_7

    const/4 v1, 0x1

    if-eq p1, v1, :cond_5

    const/4 v1, 0x2

    if-eq p1, v1, :cond_4

    const/4 v1, 0x3

    if-eq p1, v1, :cond_2

    const/4 v1, 0x4

    if-eq p1, v1, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mInterpolator:Landroid/view/animation/Interpolator;

    if-eqz p1, :cond_1

    .line 2
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mInterpolator:Landroid/view/animation/Interpolator;

    .line 3
    :cond_1
    new-instance p1, Landroid/view/animation/OvershootInterpolator;

    invoke-direct {p1}, Landroid/view/animation/OvershootInterpolator;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mInterpolator:Landroid/view/animation/Interpolator;

    goto :goto_0

    .line 4
    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mInterpolator:Landroid/view/animation/Interpolator;

    if-eqz p1, :cond_3

    .line 5
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mInterpolator:Landroid/view/animation/Interpolator;

    .line 6
    :cond_3
    new-instance p1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {p1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mInterpolator:Landroid/view/animation/Interpolator;

    goto :goto_0

    .line 7
    :cond_4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mInterpolator:Landroid/view/animation/Interpolator;

    if-eqz p1, :cond_9

    .line 8
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mInterpolator:Landroid/view/animation/Interpolator;

    .line 9
    new-instance p1, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {p1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mInterpolator:Landroid/view/animation/Interpolator;

    goto :goto_0

    .line 10
    :cond_5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mInterpolator:Landroid/view/animation/Interpolator;

    if-eqz p1, :cond_6

    .line 11
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mInterpolator:Landroid/view/animation/Interpolator;

    .line 12
    :cond_6
    new-instance p1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {p1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mInterpolator:Landroid/view/animation/Interpolator;

    goto :goto_0

    .line 13
    :cond_7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mInterpolator:Landroid/view/animation/Interpolator;

    if-eqz p1, :cond_8

    .line 14
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mInterpolator:Landroid/view/animation/Interpolator;

    .line 15
    :cond_8
    new-instance p1, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {p1}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mInterpolator:Landroid/view/animation/Interpolator;

    :cond_9
    :goto_0
    return-void
.end method

.method private updateTheTrack()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mOval:Landroid/graphics/RectF;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mOval:Landroid/graphics/RectF;

    .line 3
    :cond_0
    new-instance v0, Landroid/graphics/RectF;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    iget v2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mTrackWidth:I

    add-int/2addr v1, v2

    int-to-float v1, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mTrackWidth:I

    add-int/2addr v2, v3

    int-to-float v2, v2

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v4

    sub-int/2addr v3, v4

    iget v4, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mTrackWidth:I

    sub-int/2addr v3, v4

    int-to-float v3, v3

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v5

    sub-int/2addr v4, v5

    iget v5, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mTrackWidth:I

    sub-int/2addr v4, v5

    int-to-float v4, v4

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mOval:Landroid/graphics/RectF;

    return-void
.end method


# virtual methods
.method public getProgress()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->moveProgress:F

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->drawTrack(Landroid/graphics/Canvas;)V

    .line 3
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->drawProgress(Landroid/graphics/Canvas;)V

    .line 4
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->drawProgressText(Landroid/graphics/Canvas;)V

    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 8

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->updateTheTrack()V

    .line 3
    new-instance p1, Landroid/graphics/LinearGradient;

    iget-object p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mOval:Landroid/graphics/RectF;

    iget p3, p2, Landroid/graphics/RectF;->left:F

    const/high16 p4, 0x43480000    # 200.0f

    sub-float v1, p3, p4

    iget p3, p2, Landroid/graphics/RectF;->top:F

    sub-float v2, p3, p4

    iget p3, p2, Landroid/graphics/RectF;->right:F

    const/high16 p4, 0x41a00000    # 20.0f

    add-float v3, p3, p4

    iget p2, p2, Landroid/graphics/RectF;->bottom:F

    add-float v4, p2, p4

    iget v5, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mStartColor:I

    iget v6, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mEndColor:I

    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    move-object v0, p1

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mShader:Landroid/graphics/LinearGradient;

    .line 4
    new-instance p1, Landroid/graphics/RectF;

    iget p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mScaleZoneWidth:F

    iget p3, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mScaleZoneLength:F

    const/4 p4, 0x0

    invoke-direct {p1, p4, p4, p2, p3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 5
    iget-object p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mScaleZonePath:Landroid/graphics/Path;

    iget p3, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mScaleZoneCornerRadius:I

    int-to-float p4, p3

    int-to-float p3, p3

    sget-object v0, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {p2, p1, p4, p3, v0}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    return-void
.end method

.method public setAnimateType(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mAnimateType:I

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->setObjectAnimatorType(I)V

    return-void
.end method

.method public setCircleBroken(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->circleBroken:Z

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->refreshTheView()V

    return-void
.end method

.method public setEndColor(I)V
    .locals 8

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mEndColor:I

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->updateTheTrack()V

    .line 3
    new-instance p1, Landroid/graphics/LinearGradient;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mOval:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->left:F

    const/high16 v2, 0x43480000    # 200.0f

    sub-float/2addr v1, v2

    iget v3, v0, Landroid/graphics/RectF;->top:F

    sub-float v2, v3, v2

    iget v3, v0, Landroid/graphics/RectF;->right:F

    const/high16 v4, 0x41a00000    # 20.0f

    add-float/2addr v3, v4

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    add-float/2addr v4, v0

    iget v5, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mStartColor:I

    iget v6, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mEndColor:I

    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    move-object v0, p1

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mShader:Landroid/graphics/LinearGradient;

    .line 4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->refreshTheView()V

    return-void
.end method

.method public setEndProgress(F)V
    .locals 1

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-ltz v0, :cond_0

    const/high16 v0, 0x42c80000    # 100.0f

    cmpl-float v0, p1, v0

    if-gtz v0, :cond_0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mEndProgress:F

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->refreshTheView()V

    return-void

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Illegal progress value, please change it!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setFillEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->fillEnabled:Z

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->refreshTheView()V

    return-void
.end method

.method public setGraduatedEnabled(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->isGraduated:Z

    .line 2
    new-instance v0, Lcom/xuexiang/xui/widget/progress/CircleProgressView$1;

    invoke-direct {v0, p0, p1}, Lcom/xuexiang/xui/widget/progress/CircleProgressView$1;-><init>(Lcom/xuexiang/xui/widget/progress/CircleProgressView;Z)V

    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public setProgress(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->moveProgress:F

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->refreshTheView()V

    return-void
.end method

.method public setProgressDuration(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mProgressDuration:I

    return-void
.end method

.method public setProgressTextColor(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mProgressTextColor:I

    return-void
.end method

.method public setProgressTextSize(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    int-to-float p1, p1

    invoke-static {v0, p1}, Lcom/xuexiang/xui/utils/DensityUtils;->sp2px(Landroid/content/Context;F)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mProgressTextSize:I

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->refreshTheView()V

    return-void
.end method

.method public setProgressTextVisibility(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->textVisibility:Z

    return-void
.end method

.method public setProgressViewUpdateListener(Lcom/xuexiang/xui/widget/progress/CircleProgressView$CircleProgressUpdateListener;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mUpdateListener:Lcom/xuexiang/xui/widget/progress/CircleProgressView$CircleProgressUpdateListener;

    return-void
.end method

.method public setProgressWidth(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    int-to-float p1, p1

    invoke-static {v0, p1}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mProgressWidth:I

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->progressPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->refreshTheView()V

    return-void
.end method

.method public setScaleZoneCornerRadius(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    int-to-float p1, p1

    invoke-static {v0, p1}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mScaleZoneCornerRadius:I

    return-void
.end method

.method public setScaleZoneLength(F)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mScaleZoneLength:F

    return-void
.end method

.method public setScaleZonePadding(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    int-to-float p1, p1

    invoke-static {v0, p1}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mScaleZonePadding:I

    return-void
.end method

.method public setScaleZoneWidth(F)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mScaleZoneWidth:F

    return-void
.end method

.method public setStartColor(I)V
    .locals 8

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mStartColor:I

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->updateTheTrack()V

    .line 3
    new-instance p1, Landroid/graphics/LinearGradient;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mOval:Landroid/graphics/RectF;

    iget v1, v0, Landroid/graphics/RectF;->left:F

    const/high16 v2, 0x43480000    # 200.0f

    sub-float/2addr v1, v2

    iget v3, v0, Landroid/graphics/RectF;->top:F

    sub-float v2, v3, v2

    iget v3, v0, Landroid/graphics/RectF;->right:F

    const/high16 v4, 0x41a00000    # 20.0f

    add-float/2addr v3, v4

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    add-float/2addr v4, v0

    iget v5, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mStartColor:I

    iget v6, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mEndColor:I

    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    move-object v0, p1

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mShader:Landroid/graphics/LinearGradient;

    .line 4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->refreshTheView()V

    return-void
.end method

.method public setStartProgress(F)V
    .locals 1

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-ltz v0, :cond_0

    const/high16 v0, 0x42c80000    # 100.0f

    cmpl-float v0, p1, v0

    if-gtz v0, :cond_0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mStartProgress:F

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->moveProgress:F

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->refreshTheView()V

    return-void

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Illegal progress value, please change it!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setTrackColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mTrackColor:I

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->refreshTheView()V

    return-void
.end method

.method public setTrackEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->trackEnabled:Z

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->refreshTheView()V

    return-void
.end method

.method public setTrackWidth(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    int-to-float p1, p1

    invoke-static {v0, p1}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mTrackWidth:I

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->trackPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->updateTheTrack()V

    .line 4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->refreshTheView()V

    return-void
.end method

.method public startProgressAnimation()V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [F

    .line 1
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mStartProgress:F

    const/4 v2, 0x0

    aput v1, v0, v2

    iget v1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mEndProgress:F

    const/4 v2, 0x1

    aput v1, v0, v2

    const-string v1, "progress"

    invoke-static {p0, v1, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->progressAnimator:Landroid/animation/ObjectAnimator;

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mInterpolator:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->progressAnimator:Landroid/animation/ObjectAnimator;

    iget v1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->mProgressDuration:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->progressAnimator:Landroid/animation/ObjectAnimator;

    new-instance v1, Lcom/xuexiang/xui/widget/progress/CircleProgressView$2;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView$2;-><init>(Lcom/xuexiang/xui/widget/progress/CircleProgressView;)V

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->progressAnimator:Landroid/animation/ObjectAnimator;

    new-instance v1, Lcom/xuexiang/xui/widget/progress/CircleProgressView$3;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView$3;-><init>(Lcom/xuexiang/xui/widget/progress/CircleProgressView;)V

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->progressAnimator:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    return-void
.end method

.method public stopProgressAnimation()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->progressAnimator:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->cancel()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->progressAnimator:Landroid/animation/ObjectAnimator;

    :cond_0
    return-void
.end method
