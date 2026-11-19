.class public Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/progress/HorizontalProgressView$HorizontalProgressUpdateListener;
    }
.end annotation


# static fields
.field public static final ACCELERATE_DECELERATE_INTERPOLATOR:I = 0x0

.field public static final ACCELERATE_INTERPOLATOR:I = 0x2

.field public static final DECELERATE_INTERPOLATOR:I = 0x3

.field public static final LINEAR_INTERPOLATOR:I = 0x1

.field public static final OVERSHOOT_INTERPOLATOR:I = 0x4


# instance fields
.field private animatorUpdateListener:Lcom/xuexiang/xui/widget/progress/HorizontalProgressView$HorizontalProgressUpdateListener;

.field private isTextMoved:Z

.field private mAnimateType:I

.field private mCornerRadius:I

.field private mEndColor:I

.field private mEndProgress:F

.field private mInterpolator:Landroid/view/animation/Interpolator;

.field private mProgressDuration:I

.field private mProgressTextColor:I

.field private mProgressTextSize:I

.field private mRect:Landroid/graphics/RectF;

.field private mShader:Landroid/graphics/LinearGradient;

.field private mStartColor:I

.field private mStartProgress:F

.field private mTextPaddingBottomOffset:I

.field private mTrackColor:I

.field private mTrackRect:Landroid/graphics/RectF;

.field private mTrackWidth:I

.field private moveProgress:F

.field private progressAnimator:Landroid/animation/ObjectAnimator;

.field private progressPaint:Landroid/graphics/Paint;

.field private textVisibility:Z

.field private trackEnabled:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->HorizontalProgressViewStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mAnimateType:I

    const/4 v1, 0x0

    .line 5
    iput v1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mStartProgress:F

    const/high16 v2, 0x42700000    # 60.0f

    .line 6
    iput v2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mEndProgress:F

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/xuexiang/xui/R$color;->xui_config_color_light_orange:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mStartColor:I

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/xuexiang/xui/R$color;->xui_config_color_dark_orange:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mEndColor:I

    .line 9
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->trackEnabled:Z

    const/4 v0, 0x6

    .line 10
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mTrackWidth:I

    const/16 v0, 0x30

    .line 11
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mProgressTextSize:I

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, Lcom/xuexiang/xui/R$color;->default_pv_track_color:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mTrackColor:I

    const/16 v0, 0x4b0

    .line 13
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mProgressDuration:I

    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->textVisibility:Z

    const/16 v2, 0x1e

    .line 15
    iput v2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mCornerRadius:I

    const/4 v2, 0x5

    .line 16
    iput v2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mTextPaddingBottomOffset:I

    .line 17
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->isTextMoved:Z

    .line 18
    iput v1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->moveProgress:F

    .line 19
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->obtainAttrs(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 20
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->init()V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;)Lcom/xuexiang/xui/widget/progress/HorizontalProgressView$HorizontalProgressUpdateListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->animatorUpdateListener:Lcom/xuexiang/xui/widget/progress/HorizontalProgressView$HorizontalProgressUpdateListener;

    return-object p0
.end method

.method private drawProgressText(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->textVisibility:Z

    if-eqz v0, :cond_1

    .line 2
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 3
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 4
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mProgressTextSize:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 5
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mProgressTextColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 6
    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->moveProgress:F

    float-to-int v2, v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "%"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 8
    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->isTextMoved:Z

    const/high16 v3, 0x40000000    # 2.0f

    if-eqz v2, :cond_0

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    sub-int/2addr v2, v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v4

    sub-int/2addr v2, v4

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const/high16 v5, 0x41e00000    # 28.0f

    invoke-static {v4, v5}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result v4

    sub-int/2addr v2, v4

    int-to-float v2, v2

    iget v4, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->moveProgress:F

    const/high16 v5, 0x42c80000    # 100.0f

    div-float/2addr v4, v5

    mul-float v2, v2, v4

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const/high16 v5, 0x41200000    # 10.0f

    invoke-static {v4, v5}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result v4

    int-to-float v4, v4

    add-float/2addr v2, v4

    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v4, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v4, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mTextPaddingBottomOffset:I

    int-to-float v3, v3

    sub-float/2addr v4, v3

    .line 11
    invoke-virtual {p1, v1, v2, v4, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    sub-int/2addr v2, v4

    int-to-float v2, v2

    div-float/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v4, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v4, v3

    iget v3, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mTextPaddingBottomOffset:I

    int-to-float v3, v3

    sub-float/2addr v4, v3

    invoke-virtual {p1, v1, v2, v4, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private drawTrack(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->trackEnabled:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->progressPaint:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->progressPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mTrackColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mTrackRect:Landroid/graphics/RectF;

    iget v1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mCornerRadius:I

    int-to-float v2, v1

    int-to-float v1, v1

    iget-object v3, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->progressPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    :cond_0
    return-void
.end method

.method private init()V
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->progressPaint:Landroid/graphics/Paint;

    .line 2
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    return-void
.end method

.method private obtainAttrs(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 2
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_start_progress:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    int-to-float p2, p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mStartProgress:F

    .line 3
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_end_progress:I

    const/16 p3, 0x3c

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    int-to-float p2, p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mEndProgress:F

    .line 4
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_start_color:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget v0, Lcom/xuexiang/xui/R$color;->xui_config_color_light_orange:I

    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mStartColor:I

    .line 5
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_end_color:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget v0, Lcom/xuexiang/xui/R$color;->xui_config_color_dark_orange:I

    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mEndColor:I

    .line 6
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_isTracked:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->trackEnabled:Z

    .line 7
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_progress_textColor:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3}, Lcom/xuexiang/xui/utils/ThemeUtils;->getMainThemeColor(Landroid/content/Context;)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mProgressTextColor:I

    .line 8
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_progress_textSize:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget v0, Lcom/xuexiang/xui/R$dimen;->default_pv_horizontal_text_size:I

    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mProgressTextSize:I

    .line 9
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_track_width:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget v0, Lcom/xuexiang/xui/R$dimen;->default_pv_trace_width:I

    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mTrackWidth:I

    .line 10
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_animate_type:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mAnimateType:I

    .line 11
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_track_color:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget v0, Lcom/xuexiang/xui/R$color;->default_pv_track_color:I

    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mTrackColor:I

    .line 12
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_progress_textVisibility:I

    const/4 p3, 0x1

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->textVisibility:Z

    .line 13
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_progress_duration:I

    const/16 v0, 0x4b0

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mProgressDuration:I

    .line 14
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_corner_radius:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$dimen;->default_pv_corner_radius:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mCornerRadius:I

    .line 15
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_text_padding_bottom:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mTextPaddingBottomOffset:I

    .line 16
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_text_movedEnable:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->isTextMoved:Z

    .line 17
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 18
    iget p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mStartProgress:F

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->moveProgress:F

    .line 19
    iget p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mAnimateType:I

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->setAnimateType(I)V

    return-void
.end method

.method private refreshTheView()V
    .locals 0

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mInterpolator:Landroid/view/animation/Interpolator;

    if-eqz p1, :cond_1

    .line 2
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mInterpolator:Landroid/view/animation/Interpolator;

    .line 3
    :cond_1
    new-instance p1, Landroid/view/animation/OvershootInterpolator;

    invoke-direct {p1}, Landroid/view/animation/OvershootInterpolator;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mInterpolator:Landroid/view/animation/Interpolator;

    goto :goto_0

    .line 4
    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mInterpolator:Landroid/view/animation/Interpolator;

    if-eqz p1, :cond_3

    .line 5
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mInterpolator:Landroid/view/animation/Interpolator;

    .line 6
    :cond_3
    new-instance p1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {p1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mInterpolator:Landroid/view/animation/Interpolator;

    goto :goto_0

    .line 7
    :cond_4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mInterpolator:Landroid/view/animation/Interpolator;

    if-eqz p1, :cond_9

    .line 8
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mInterpolator:Landroid/view/animation/Interpolator;

    .line 9
    new-instance p1, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {p1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mInterpolator:Landroid/view/animation/Interpolator;

    goto :goto_0

    .line 10
    :cond_5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mInterpolator:Landroid/view/animation/Interpolator;

    if-eqz p1, :cond_6

    .line 11
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mInterpolator:Landroid/view/animation/Interpolator;

    .line 12
    :cond_6
    new-instance p1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {p1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mInterpolator:Landroid/view/animation/Interpolator;

    goto :goto_0

    .line 13
    :cond_7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mInterpolator:Landroid/view/animation/Interpolator;

    if-eqz p1, :cond_8

    .line 14
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mInterpolator:Landroid/view/animation/Interpolator;

    .line 15
    :cond_8
    new-instance p1, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {p1}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mInterpolator:Landroid/view/animation/Interpolator;

    :cond_9
    :goto_0
    return-void
.end method

.method private updateTheTrack()V
    .locals 7

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mStartProgress:F

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v4

    sub-int/2addr v3, v4

    add-int/lit8 v3, v3, 0x3c

    int-to-float v3, v3

    mul-float v2, v2, v3

    const/high16 v3, 0x42c80000    # 100.0f

    div-float/2addr v2, v3

    add-float/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v2, v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    int-to-float v5, v5

    sub-float/2addr v2, v5

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v5

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v6

    sub-int/2addr v5, v6

    add-int/lit8 v5, v5, -0x14

    int-to-float v5, v5

    iget v6, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->moveProgress:F

    div-float/2addr v6, v3

    mul-float v5, v5, v6

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v3, v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v6

    int-to-float v6, v6

    add-float/2addr v3, v6

    iget v6, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mTrackWidth:I

    int-to-float v6, v6

    add-float/2addr v3, v6

    invoke-direct {v0, v1, v2, v5, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mRect:Landroid/graphics/RectF;

    .line 4
    new-instance v0, Landroid/graphics/RectF;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v2, v3

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v5

    sub-int/2addr v3, v5

    add-int/lit8 v3, v3, -0x14

    int-to-float v3, v3

    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v5, v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    int-to-float v4, v4

    add-float/2addr v5, v4

    iget v4, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mTrackWidth:I

    int-to-float v4, v4

    add-float/2addr v5, v4

    invoke-direct {v0, v1, v2, v3, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mTrackRect:Landroid/graphics/RectF;

    return-void
.end method


# virtual methods
.method public getProgress()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->moveProgress:F

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->updateTheTrack()V

    .line 3
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->drawTrack(Landroid/graphics/Canvas;)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->progressPaint:Landroid/graphics/Paint;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mShader:Landroid/graphics/LinearGradient;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mRect:Landroid/graphics/RectF;

    iget v1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mCornerRadius:I

    int-to-float v2, v1

    int-to-float v1, v1

    iget-object v3, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->progressPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 6
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->drawProgressText(Landroid/graphics/Canvas;)V

    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 8

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    new-instance p1, Landroid/graphics/LinearGradient;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p2

    add-int/lit8 p2, p2, -0x32

    int-to-float v1, p2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p3

    sub-int/2addr p2, p3

    add-int/lit8 p2, p2, -0x32

    int-to-float v2, p2

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p3

    sub-int/2addr p2, p3

    int-to-float v3, p2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p2

    int-to-float p2, p2

    const/high16 p3, 0x40000000    # 2.0f

    div-float/2addr p2, p3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p3

    int-to-float p3, p3

    add-float/2addr p2, p3

    iget p3, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mTrackWidth:I

    int-to-float p3, p3

    add-float v4, p2, p3

    iget v5, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mStartColor:I

    iget v6, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mEndColor:I

    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    move-object v0, p1

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mShader:Landroid/graphics/LinearGradient;

    return-void
.end method

.method public setAnimateType(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mAnimateType:I

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->setObjectAnimatorType(I)V

    return-void
.end method

.method public setEndColor(I)V
    .locals 8

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mEndColor:I

    .line 2
    new-instance p1, Landroid/graphics/LinearGradient;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    add-int/lit8 v0, v0, -0x32

    int-to-float v1, v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    sub-int/2addr v0, v2

    add-int/lit8 v0, v0, -0x32

    int-to-float v2, v0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    sub-int/2addr v0, v3

    int-to-float v3, v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v0, v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    int-to-float v4, v4

    add-float/2addr v0, v4

    iget v4, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mTrackWidth:I

    int-to-float v4, v4

    add-float/2addr v4, v0

    iget v5, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mStartColor:I

    iget v6, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mEndColor:I

    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    move-object v0, p1

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mShader:Landroid/graphics/LinearGradient;

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->refreshTheView()V

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
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mEndProgress:F

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->refreshTheView()V

    return-void

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Illegal progress value, please change it!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setProgress(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->moveProgress:F

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->refreshTheView()V

    return-void
.end method

.method public setProgressCornerRadius(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    int-to-float p1, p1

    invoke-static {v0, p1}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mCornerRadius:I

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->refreshTheView()V

    return-void
.end method

.method public setProgressDuration(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mProgressDuration:I

    return-void
.end method

.method public setProgressTextColor(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mProgressTextColor:I

    return-void
.end method

.method public setProgressTextMoved(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->isTextMoved:Z

    return-void
.end method

.method public setProgressTextPaddingBottom(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    int-to-float p1, p1

    invoke-static {v0, p1}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mTextPaddingBottomOffset:I

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

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mProgressTextSize:I

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->refreshTheView()V

    return-void
.end method

.method public setProgressTextVisibility(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->textVisibility:Z

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->refreshTheView()V

    return-void
.end method

.method public setProgressViewUpdateListener(Lcom/xuexiang/xui/widget/progress/HorizontalProgressView$HorizontalProgressUpdateListener;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->animatorUpdateListener:Lcom/xuexiang/xui/widget/progress/HorizontalProgressView$HorizontalProgressUpdateListener;

    return-void
.end method

.method public setStartColor(I)V
    .locals 8

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mStartColor:I

    .line 2
    new-instance p1, Landroid/graphics/LinearGradient;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    add-int/lit8 v0, v0, -0x32

    int-to-float v1, v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    sub-int/2addr v0, v2

    add-int/lit8 v0, v0, -0x32

    int-to-float v2, v0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    sub-int/2addr v0, v3

    int-to-float v3, v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v0, v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    int-to-float v4, v4

    add-float/2addr v0, v4

    iget v4, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mTrackWidth:I

    int-to-float v4, v4

    add-float/2addr v4, v0

    iget v5, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mStartColor:I

    iget v6, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mEndColor:I

    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    move-object v0, p1

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mShader:Landroid/graphics/LinearGradient;

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->refreshTheView()V

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
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mStartProgress:F

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->moveProgress:F

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->refreshTheView()V

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
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mTrackColor:I

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->refreshTheView()V

    return-void
.end method

.method public setTrackEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->trackEnabled:Z

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->refreshTheView()V

    return-void
.end method

.method public setTrackWidth(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    int-to-float p1, p1

    invoke-static {v0, p1}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mTrackWidth:I

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->refreshTheView()V

    return-void
.end method

.method public startProgressAnimation()V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [F

    .line 1
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mStartProgress:F

    const/4 v2, 0x0

    aput v1, v0, v2

    iget v1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mEndProgress:F

    const/4 v2, 0x1

    aput v1, v0, v2

    const-string v1, "progress"

    invoke-static {p0, v1, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->progressAnimator:Landroid/animation/ObjectAnimator;

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mInterpolator:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->progressAnimator:Landroid/animation/ObjectAnimator;

    iget v1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->mProgressDuration:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->progressAnimator:Landroid/animation/ObjectAnimator;

    new-instance v1, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView$1;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView$1;-><init>(Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;)V

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->progressAnimator:Landroid/animation/ObjectAnimator;

    new-instance v1, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView$2;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView$2;-><init>(Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;)V

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->progressAnimator:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    return-void
.end method

.method public stopProgressAnimation()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->progressAnimator:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->cancel()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->progressAnimator:Landroid/animation/ObjectAnimator;

    :cond_0
    return-void
.end method
