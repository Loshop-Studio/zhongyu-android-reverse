.class public Lcom/xuexiang/xui/widget/progress/CircleProgressView;
.super Landroid/view/View;
.source "SourceFile"


# static fields
.field public static final synthetic z:I


# instance fields
.field public a:F

.field public b:I

.field public c:I

.field public d:Z

.field public e:Z

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:Z

.field public k:I

.field public l:Z

.field public m:F

.field public final n:Landroid/graphics/Paint;

.field public final o:Landroid/graphics/Paint;

.field public p:Landroid/graphics/LinearGradient;

.field public q:Landroid/graphics/RectF;

.field public r:Landroid/view/animation/BaseInterpolator;

.field public final s:Landroid/graphics/Path;

.field public t:F

.field public u:F

.field public v:I

.field public w:Z

.field public x:I

.field public y:Landroid/graphics/PathDashPathEffect;


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
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->CircleProgressViewStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->a:F

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/xuexiang/xui/R$color;->xui_config_color_light_orange:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->b:I

    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/xuexiang/xui/R$color;->xui_config_color_dark_orange:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->c:I

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/xuexiang/xui/R$color;->default_pv_track_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->k:I

    .line 8
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->m:F

    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->w:Z

    .line 10
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->x:I

    .line 11
    sget-object v1, Lcom/xuexiang/xui/R$styleable;->CircleProgressView:[I

    invoke-virtual {p1, p2, v1, p3, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 12
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_start_progress:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    int-to-float p2, p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->a:F

    .line 13
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_end_progress:I

    const/16 p3, 0x3c

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 14
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_start_color:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget v1, Lcom/xuexiang/xui/R$color;->xui_config_color_light_orange:I

    invoke-virtual {p3, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->b:I

    .line 15
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_end_color:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget v1, Lcom/xuexiang/xui/R$color;->xui_config_color_dark_orange:I

    invoke-virtual {p3, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->c:I

    .line 16
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_isFilled:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->e:Z

    .line 17
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_isTracked:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->d:Z

    .line 18
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_circle_broken:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->j:Z

    .line 19
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_progress_textColor:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    sget v1, Lcom/xuexiang/xui/R$attr;->colorAccent:I

    .line 20
    invoke-static {p3, v1, v0}, Lkotlin/collections/u;->F(Landroid/content/Context;II)I

    move-result p3

    .line 21
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->i:I

    .line 22
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_progress_textSize:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget v1, Lcom/xuexiang/xui/R$dimen;->default_pv_progress_text_size:I

    invoke-virtual {p3, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->h:I

    .line 23
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_track_width:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget v1, Lcom/xuexiang/xui/R$dimen;->default_pv_trace_width:I

    invoke-virtual {p3, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->f:I

    .line 24
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_progress_width:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget v1, Lcom/xuexiang/xui/R$dimen;->default_pv_trace_width:I

    invoke-virtual {p3, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->g:I

    .line 25
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_animate_type:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 26
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_track_color:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget v1, Lcom/xuexiang/xui/R$color;->default_pv_track_color:I

    invoke-virtual {p3, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->k:I

    .line 27
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_progress_textVisibility:I

    const/4 p3, 0x1

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->l:Z

    .line 28
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_progress_duration:I

    const/16 v1, 0x4b0

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 29
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_scaleZone_length:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/xuexiang/xui/R$dimen;->default_pv_zone_length:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    int-to-float p2, p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->u:F

    .line 30
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_scaleZone_width:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/xuexiang/xui/R$dimen;->default_pv_zone_width:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    int-to-float p2, p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->t:F

    .line 31
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_scaleZone_padding:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/xuexiang/xui/R$dimen;->default_pv_zone_padding:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->v:I

    .line 32
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_scaleZone_corner_radius:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/xuexiang/xui/R$dimen;->default_pv_zone_corner_radius:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->x:I

    .line 33
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_isGraduated:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->w:Z

    .line 34
    iget p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->a:F

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->m:F

    .line 35
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 36
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, p3}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->n:Landroid/graphics/Paint;

    .line 37
    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 38
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->n:Landroid/graphics/Paint;

    sget-object v0, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 39
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->n:Landroid/graphics/Paint;

    iget v1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->g:I

    int-to-float v1, v1

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 40
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, p3}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->o:Landroid/graphics/Paint;

    .line 41
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 42
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->o:Landroid/graphics/Paint;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 43
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->o:Landroid/graphics/Paint;

    iget p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->f:I

    int-to-float p2, p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 44
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->s:Landroid/graphics/Path;

    .line 45
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->w:Z

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->a(Z)V

    return-void
.end method

.method private setObjectAnimatorType(I)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_8

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    if-eq p1, v1, :cond_6

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    if-eq p1, v1, :cond_4

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    if-eq p1, v1, :cond_2

    .line 12
    .line 13
    const/4 v1, 0x4

    .line 14
    if-eq p1, v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->r:Landroid/view/animation/BaseInterpolator;

    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->r:Landroid/view/animation/BaseInterpolator;

    .line 22
    .line 23
    :cond_1
    new-instance p1, Landroid/view/animation/OvershootInterpolator;

    .line 24
    .line 25
    invoke-direct {p1}, Landroid/view/animation/OvershootInterpolator;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->r:Landroid/view/animation/BaseInterpolator;

    .line 29
    .line 30
    return-void

    .line 31
    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->r:Landroid/view/animation/BaseInterpolator;

    .line 32
    .line 33
    if-eqz p1, :cond_3

    .line 34
    .line 35
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->r:Landroid/view/animation/BaseInterpolator;

    .line 36
    .line 37
    :cond_3
    new-instance p1, Landroid/view/animation/DecelerateInterpolator;

    .line 38
    .line 39
    invoke-direct {p1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->r:Landroid/view/animation/BaseInterpolator;

    .line 43
    .line 44
    return-void

    .line 45
    :cond_4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->r:Landroid/view/animation/BaseInterpolator;

    .line 46
    .line 47
    if-eqz p1, :cond_5

    .line 48
    .line 49
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->r:Landroid/view/animation/BaseInterpolator;

    .line 50
    .line 51
    new-instance p1, Landroid/view/animation/AccelerateInterpolator;

    .line 52
    .line 53
    invoke-direct {p1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->r:Landroid/view/animation/BaseInterpolator;

    .line 57
    .line 58
    :cond_5
    :goto_0
    return-void

    .line 59
    :cond_6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->r:Landroid/view/animation/BaseInterpolator;

    .line 60
    .line 61
    if-eqz p1, :cond_7

    .line 62
    .line 63
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->r:Landroid/view/animation/BaseInterpolator;

    .line 64
    .line 65
    :cond_7
    new-instance p1, Landroid/view/animation/LinearInterpolator;

    .line 66
    .line 67
    invoke-direct {p1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->r:Landroid/view/animation/BaseInterpolator;

    .line 71
    .line 72
    return-void

    .line 73
    :cond_8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->r:Landroid/view/animation/BaseInterpolator;

    .line 74
    .line 75
    if-eqz p1, :cond_9

    .line 76
    .line 77
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->r:Landroid/view/animation/BaseInterpolator;

    .line 78
    .line 79
    :cond_9
    new-instance p1, Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 80
    .line 81
    invoke-direct {p1}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 82
    .line 83
    .line 84
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->r:Landroid/view/animation/BaseInterpolator;

    .line 85
    .line 86
    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 4

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->y:Landroid/graphics/PathDashPathEffect;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    new-instance p1, Landroid/graphics/PathDashPathEffect;

    .line 8
    .line 9
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->v:I

    .line 10
    .line 11
    int-to-float v0, v0

    .line 12
    const/4 v1, 0x0

    .line 13
    sget-object v2, Landroid/graphics/PathDashPathEffect$Style;->ROTATE:Landroid/graphics/PathDashPathEffect$Style;

    .line 14
    .line 15
    iget-object v3, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->s:Landroid/graphics/Path;

    .line 16
    .line 17
    invoke-direct {p1, v3, v0, v1, v2}, Landroid/graphics/PathDashPathEffect;-><init>(Landroid/graphics/Path;FFLandroid/graphics/PathDashPathEffect$Style;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->y:Landroid/graphics/PathDashPathEffect;

    .line 21
    .line 22
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->n:Landroid/graphics/Paint;

    .line 23
    .line 24
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->y:Landroid/graphics/PathDashPathEffect;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    const/4 p1, 0x0

    .line 31
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->y:Landroid/graphics/PathDashPathEffect;

    .line 32
    .line 33
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->n:Landroid/graphics/Paint;

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final b()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final c()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->q:Landroid/graphics/RectF;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->q:Landroid/graphics/RectF;

    .line 7
    .line 8
    :cond_0
    new-instance v0, Landroid/graphics/RectF;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iget v2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->f:I

    .line 15
    .line 16
    add-int/2addr v1, v2

    .line 17
    int-to-float v1, v1

    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    iget v3, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->f:I

    .line 23
    .line 24
    add-int/2addr v2, v3

    .line 25
    int-to-float v2, v2

    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    sub-int/2addr v3, v4

    .line 35
    iget v4, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->f:I

    .line 36
    .line 37
    sub-int/2addr v3, v4

    .line 38
    int-to-float v3, v3

    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    sub-int/2addr v4, v5

    .line 48
    iget v5, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->f:I

    .line 49
    .line 50
    sub-int/2addr v4, v5

    .line 51
    int-to-float v4, v4

    .line 52
    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->q:Landroid/graphics/RectF;

    .line 56
    .line 57
    return-void
.end method

.method public getProgress()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->m:F

    .line 2
    .line 3
    return v0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->d:Z

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    iget-object v1, v0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->o:Landroid/graphics/Paint;

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 14
    .line 15
    .line 16
    iget-object v1, v0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->o:Landroid/graphics/Paint;

    .line 17
    .line 18
    iget v3, v0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->k:I

    .line 19
    .line 20
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 21
    .line 22
    .line 23
    iget-boolean v8, v0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->e:Z

    .line 24
    .line 25
    if-eqz v8, :cond_0

    .line 26
    .line 27
    iget-object v1, v0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->o:Landroid/graphics/Paint;

    .line 28
    .line 29
    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 30
    .line 31
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iget-object v1, v0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->o:Landroid/graphics/Paint;

    .line 36
    .line 37
    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 38
    .line 39
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->j:Z

    .line 43
    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    iget-object v5, v0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->q:Landroid/graphics/RectF;

    .line 47
    .line 48
    const/high16 v7, 0x43870000    # 270.0f

    .line 49
    .line 50
    iget-object v9, v0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->o:Landroid/graphics/Paint;

    .line 51
    .line 52
    const/high16 v6, 0x43070000    # 135.0f

    .line 53
    .line 54
    move-object/from16 v4, p1

    .line 55
    .line 56
    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    iget-object v5, v0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->q:Landroid/graphics/RectF;

    .line 61
    .line 62
    const/high16 v7, 0x43b40000    # 360.0f

    .line 63
    .line 64
    iget-object v9, v0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->o:Landroid/graphics/Paint;

    .line 65
    .line 66
    const/high16 v6, 0x42b40000    # 90.0f

    .line 67
    .line 68
    move-object/from16 v4, p1

    .line 69
    .line 70
    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 71
    .line 72
    .line 73
    :cond_2
    :goto_1
    iget-object v1, v0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->n:Landroid/graphics/Paint;

    .line 74
    .line 75
    iget-object v3, v0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->p:Landroid/graphics/LinearGradient;

    .line 76
    .line 77
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->c()V

    .line 81
    .line 82
    .line 83
    iget-boolean v14, v0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->e:Z

    .line 84
    .line 85
    if-eqz v14, :cond_3

    .line 86
    .line 87
    iget-object v1, v0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->n:Landroid/graphics/Paint;

    .line 88
    .line 89
    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 90
    .line 91
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_3
    iget-object v1, v0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->n:Landroid/graphics/Paint;

    .line 96
    .line 97
    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 98
    .line 99
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 100
    .line 101
    .line 102
    :goto_2
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->j:Z

    .line 103
    .line 104
    if-eqz v1, :cond_4

    .line 105
    .line 106
    iget-object v11, v0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->q:Landroid/graphics/RectF;

    .line 107
    .line 108
    iget v1, v0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->a:F

    .line 109
    .line 110
    const v3, 0x402ccccd    # 2.7f

    .line 111
    .line 112
    .line 113
    mul-float v4, v1, v3

    .line 114
    .line 115
    const/high16 v5, 0x43070000    # 135.0f

    .line 116
    .line 117
    add-float v12, v4, v5

    .line 118
    .line 119
    iget v4, v0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->m:F

    .line 120
    .line 121
    sub-float/2addr v4, v1

    .line 122
    mul-float v13, v4, v3

    .line 123
    .line 124
    iget-object v15, v0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->n:Landroid/graphics/Paint;

    .line 125
    .line 126
    move-object/from16 v10, p1

    .line 127
    .line 128
    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 129
    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_4
    iget-object v11, v0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->q:Landroid/graphics/RectF;

    .line 133
    .line 134
    iget v1, v0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->a:F

    .line 135
    .line 136
    const v3, 0x40666666    # 3.6f

    .line 137
    .line 138
    .line 139
    mul-float v4, v1, v3

    .line 140
    .line 141
    const/high16 v5, 0x43870000    # 270.0f

    .line 142
    .line 143
    add-float v12, v4, v5

    .line 144
    .line 145
    iget v4, v0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->m:F

    .line 146
    .line 147
    sub-float/2addr v4, v1

    .line 148
    mul-float v13, v4, v3

    .line 149
    .line 150
    iget-object v15, v0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->n:Landroid/graphics/Paint;

    .line 151
    .line 152
    move-object/from16 v10, p1

    .line 153
    .line 154
    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 155
    .line 156
    .line 157
    :goto_3
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->l:Z

    .line 158
    .line 159
    if-eqz v1, :cond_5

    .line 160
    .line 161
    new-instance v1, Landroid/graphics/Paint;

    .line 162
    .line 163
    const/4 v3, 0x1

    .line 164
    invoke-direct {v1, v3}, Landroid/graphics/Paint;-><init>(I)V

    .line 165
    .line 166
    .line 167
    sget-object v4, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 168
    .line 169
    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 170
    .line 171
    .line 172
    iget v4, v0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->h:I

    .line 173
    .line 174
    int-to-float v4, v4

    .line 175
    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 176
    .line 177
    .line 178
    iget v4, v0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->i:I

    .line 179
    .line 180
    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 181
    .line 182
    .line 183
    sget-object v4, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    .line 184
    .line 185
    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 186
    .line 187
    .line 188
    invoke-static {}, Lt1/a;->b()V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 192
    .line 193
    .line 194
    new-instance v2, Ljava/lang/StringBuilder;

    .line 195
    .line 196
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 197
    .line 198
    .line 199
    iget v4, v0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->m:F

    .line 200
    .line 201
    float-to-int v4, v4

    .line 202
    const-string v5, "%"

    .line 203
    .line 204
    invoke-static {v2, v5, v4}, Landroid/support/v4/media/f;->o(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 213
    .line 214
    .line 215
    move-result v5

    .line 216
    add-int/2addr v5, v4

    .line 217
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 218
    .line 219
    .line 220
    move-result v4

    .line 221
    sub-int/2addr v5, v4

    .line 222
    shr-int/lit8 v3, v5, 0x1

    .line 223
    .line 224
    int-to-float v3, v3

    .line 225
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 226
    .line 227
    .line 228
    move-result v4

    .line 229
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 230
    .line 231
    .line 232
    move-result v5

    .line 233
    add-int/2addr v5, v4

    .line 234
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 235
    .line 236
    .line 237
    move-result v4

    .line 238
    sub-int/2addr v5, v4

    .line 239
    int-to-float v4, v5

    .line 240
    invoke-virtual {v1}, Landroid/graphics/Paint;->descent()F

    .line 241
    .line 242
    .line 243
    move-result v5

    .line 244
    invoke-virtual {v1}, Landroid/graphics/Paint;->ascent()F

    .line 245
    .line 246
    .line 247
    move-result v6

    .line 248
    add-float/2addr v6, v5

    .line 249
    sub-float/2addr v4, v6

    .line 250
    const/high16 v5, 0x40000000    # 2.0f

    .line 251
    .line 252
    div-float/2addr v4, v5

    .line 253
    move-object/from16 v10, p1

    .line 254
    .line 255
    invoke-virtual {v10, v2, v3, v4, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 256
    .line 257
    .line 258
    :cond_5
    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 8

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->c()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Landroid/graphics/LinearGradient;

    .line 8
    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->q:Landroid/graphics/RectF;

    .line 10
    .line 11
    iget p2, p1, Landroid/graphics/RectF;->left:F

    .line 12
    .line 13
    const/high16 p3, 0x43480000    # 200.0f

    .line 14
    .line 15
    sub-float v1, p2, p3

    .line 16
    .line 17
    iget p2, p1, Landroid/graphics/RectF;->top:F

    .line 18
    .line 19
    sub-float v2, p2, p3

    .line 20
    .line 21
    iget p2, p1, Landroid/graphics/RectF;->right:F

    .line 22
    .line 23
    const/high16 p3, 0x41a00000    # 20.0f

    .line 24
    .line 25
    add-float v3, p2, p3

    .line 26
    .line 27
    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    .line 28
    .line 29
    add-float v4, p1, p3

    .line 30
    .line 31
    iget v5, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->b:I

    .line 32
    .line 33
    iget v6, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->c:I

    .line 34
    .line 35
    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 36
    .line 37
    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->p:Landroid/graphics/LinearGradient;

    .line 41
    .line 42
    new-instance p1, Landroid/graphics/RectF;

    .line 43
    .line 44
    iget p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->t:F

    .line 45
    .line 46
    iget p3, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->u:F

    .line 47
    .line 48
    const/4 p4, 0x0

    .line 49
    invoke-direct {p1, p4, p4, p2, p3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 50
    .line 51
    .line 52
    iget p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->x:I

    .line 53
    .line 54
    int-to-float p3, p2

    .line 55
    int-to-float p2, p2

    .line 56
    sget-object p4, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 57
    .line 58
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->s:Landroid/graphics/Path;

    .line 59
    .line 60
    invoke-virtual {v0, p1, p3, p2, p4}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public setAnimateType(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->setObjectAnimatorType(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setCircleBroken(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->j:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->b()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setEndColor(I)V
    .locals 8
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->c:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->c()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/LinearGradient;

    .line 7
    .line 8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->q:Landroid/graphics/RectF;

    .line 9
    .line 10
    iget v1, p1, Landroid/graphics/RectF;->left:F

    .line 11
    .line 12
    const/high16 v2, 0x43480000    # 200.0f

    .line 13
    .line 14
    sub-float/2addr v1, v2

    .line 15
    iget v3, p1, Landroid/graphics/RectF;->top:F

    .line 16
    .line 17
    sub-float v2, v3, v2

    .line 18
    .line 19
    iget v3, p1, Landroid/graphics/RectF;->right:F

    .line 20
    .line 21
    const/high16 v4, 0x41a00000    # 20.0f

    .line 22
    .line 23
    add-float/2addr v3, v4

    .line 24
    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    .line 25
    .line 26
    add-float/2addr v4, p1

    .line 27
    iget v5, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->b:I

    .line 28
    .line 29
    iget v6, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->c:I

    .line 30
    .line 31
    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 32
    .line 33
    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->p:Landroid/graphics/LinearGradient;

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->b()V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public setEndProgress(F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v0, p1, v0

    .line 3
    .line 4
    if-ltz v0, :cond_0

    .line 5
    .line 6
    const/high16 v0, 0x42c80000    # 100.0f

    .line 7
    .line 8
    cmpl-float p1, p1, v0

    .line 9
    .line 10
    if-gtz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->b()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    const-string v0, "Illegal progress value, please change it!"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1
.end method

.method public setFillEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->e:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->b()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setGraduatedEnabled(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->w:Z

    .line 2
    .line 3
    new-instance v0, Lj3/a;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lj3/a;-><init>(Lcom/xuexiang/xui/widget/progress/CircleProgressView;Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setProgress(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->m:F

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->b()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setProgressDuration(I)V
    .locals 0

    return-void
.end method

.method public setProgressTextColor(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->i:I

    .line 2
    .line 3
    return-void
.end method

.method public setProgressTextSize(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    int-to-float p1, p1

    .line 6
    invoke-static {v0, p1}, Lh4/a;->n(Landroid/content/Context;F)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->h:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->b()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setProgressTextVisibility(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->l:Z

    .line 2
    .line 3
    return-void
.end method

.method public setProgressViewUpdateListener(Lj3/b;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setProgressWidth(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    int-to-float p1, p1

    .line 6
    invoke-static {v0, p1}, Lh4/a;->h(Landroid/content/Context;F)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->g:I

    .line 11
    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->n:Landroid/graphics/Paint;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->b()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public setScaleZoneCornerRadius(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    int-to-float p1, p1

    .line 6
    invoke-static {v0, p1}, Lh4/a;->h(Landroid/content/Context;F)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->x:I

    .line 11
    .line 12
    return-void
.end method

.method public setScaleZoneLength(F)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lh4/a;->h(Landroid/content/Context;F)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    int-to-float p1, p1

    .line 10
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->u:F

    .line 11
    .line 12
    return-void
.end method

.method public setScaleZonePadding(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    int-to-float p1, p1

    .line 6
    invoke-static {v0, p1}, Lh4/a;->h(Landroid/content/Context;F)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->v:I

    .line 11
    .line 12
    return-void
.end method

.method public setScaleZoneWidth(F)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lh4/a;->h(Landroid/content/Context;F)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    int-to-float p1, p1

    .line 10
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->t:F

    .line 11
    .line 12
    return-void
.end method

.method public setStartColor(I)V
    .locals 8
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->b:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->c()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/LinearGradient;

    .line 7
    .line 8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->q:Landroid/graphics/RectF;

    .line 9
    .line 10
    iget v1, p1, Landroid/graphics/RectF;->left:F

    .line 11
    .line 12
    const/high16 v2, 0x43480000    # 200.0f

    .line 13
    .line 14
    sub-float/2addr v1, v2

    .line 15
    iget v3, p1, Landroid/graphics/RectF;->top:F

    .line 16
    .line 17
    sub-float v2, v3, v2

    .line 18
    .line 19
    iget v3, p1, Landroid/graphics/RectF;->right:F

    .line 20
    .line 21
    const/high16 v4, 0x41a00000    # 20.0f

    .line 22
    .line 23
    add-float/2addr v3, v4

    .line 24
    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    .line 25
    .line 26
    add-float/2addr v4, p1

    .line 27
    iget v5, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->b:I

    .line 28
    .line 29
    iget v6, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->c:I

    .line 30
    .line 31
    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 32
    .line 33
    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->p:Landroid/graphics/LinearGradient;

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->b()V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public setStartProgress(F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v0, p1, v0

    .line 3
    .line 4
    if-ltz v0, :cond_0

    .line 5
    .line 6
    const/high16 v0, 0x42c80000    # 100.0f

    .line 7
    .line 8
    cmpl-float v0, p1, v0

    .line 9
    .line 10
    if-gtz v0, :cond_0

    .line 11
    .line 12
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->a:F

    .line 13
    .line 14
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->m:F

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->b()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 21
    .line 22
    const-string v0, "Illegal progress value, please change it!"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1
.end method

.method public setTrackColor(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->k:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->b()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setTrackEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->d:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->b()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setTrackWidth(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    int-to-float p1, p1

    .line 6
    invoke-static {v0, p1}, Lh4/a;->h(Landroid/content/Context;F)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->f:I

    .line 11
    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->o:Landroid/graphics/Paint;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->c()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->b()V

    .line 21
    .line 22
    .line 23
    return-void
.end method
