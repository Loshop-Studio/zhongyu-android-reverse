.class public Lcom/xuexiang/xui/widget/progress/CircleProgressView;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/progress/CircleProgressView$b;
    }
.end annotation


# instance fields
.field public A:I

.field public B:Z

.field public C:I

.field public D:Landroid/graphics/PathEffect;

.field public c:I

.field public d:F

.field public e:F

.field public f:I

.field public g:I

.field public h:Z

.field public i:Z

.field public j:I

.field public k:I

.field public l:I

.field public m:I

.field public n:Z

.field public o:I

.field public p:I

.field public q:Z

.field public r:F

.field public s:Landroid/graphics/Paint;

.field public t:Landroid/graphics/Paint;

.field public u:Landroid/graphics/LinearGradient;

.field public v:Landroid/graphics/RectF;

.field public w:Landroid/view/animation/Interpolator;

.field public x:Landroid/graphics/Path;

.field public y:F

.field public z:F


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
    .locals 4
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->c:I

    const/4 v1, 0x0

    .line 5
    iput v1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->d:F

    const/high16 v2, 0x42700000    # 60.0f

    .line 6
    iput v2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->e:F

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/xuexiang/xui/R$color;->xui_config_color_light_orange:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->f:I

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/xuexiang/xui/R$color;->xui_config_color_dark_orange:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->g:I

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/xuexiang/xui/R$color;->default_pv_track_color:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->o:I

    const/16 v2, 0x4b0

    .line 10
    iput v2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->p:I

    .line 11
    iput v1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->r:F

    .line 12
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->B:Z

    .line 13
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->C:I

    .line 14
    invoke-virtual {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->i(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 15
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->f()V

    return-void
.end method

.method public static synthetic a(Lcom/xuexiang/xui/widget/progress/CircleProgressView;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->d(Z)V

    .line 2
    .line 3
    .line 4
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
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->w:Landroid/view/animation/Interpolator;

    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->w:Landroid/view/animation/Interpolator;

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
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->w:Landroid/view/animation/Interpolator;

    .line 29
    .line 30
    return-void

    .line 31
    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->w:Landroid/view/animation/Interpolator;

    .line 32
    .line 33
    if-eqz p1, :cond_3

    .line 34
    .line 35
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->w:Landroid/view/animation/Interpolator;

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
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->w:Landroid/view/animation/Interpolator;

    .line 43
    .line 44
    return-void

    .line 45
    :cond_4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->w:Landroid/view/animation/Interpolator;

    .line 46
    .line 47
    if-eqz p1, :cond_5

    .line 48
    .line 49
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->w:Landroid/view/animation/Interpolator;

    .line 50
    .line 51
    new-instance p1, Landroid/view/animation/AccelerateInterpolator;

    .line 52
    .line 53
    invoke-direct {p1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->w:Landroid/view/animation/Interpolator;

    .line 57
    .line 58
    :cond_5
    :goto_0
    return-void

    .line 59
    :cond_6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->w:Landroid/view/animation/Interpolator;

    .line 60
    .line 61
    if-eqz p1, :cond_7

    .line 62
    .line 63
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->w:Landroid/view/animation/Interpolator;

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
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->w:Landroid/view/animation/Interpolator;

    .line 71
    .line 72
    return-void

    .line 73
    :cond_8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->w:Landroid/view/animation/Interpolator;

    .line 74
    .line 75
    if-eqz p1, :cond_9

    .line 76
    .line 77
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->w:Landroid/view/animation/Interpolator;

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
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->w:Landroid/view/animation/Interpolator;

    .line 85
    .line 86
    return-void
.end method


# virtual methods
.method public final b(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->s:Landroid/graphics/Paint;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->u:Landroid/graphics/LinearGradient;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->k()V

    .line 9
    .line 10
    .line 11
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->i:Z

    .line 12
    .line 13
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->g(Landroid/graphics/Canvas;Z)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final c(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->q:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/Paint;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 9
    .line 10
    .line 11
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 14
    .line 15
    .line 16
    iget v2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->l:I

    .line 17
    .line 18
    int-to-float v2, v2

    .line 19
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 20
    .line 21
    .line 22
    iget v2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->m:I

    .line 23
    .line 24
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 25
    .line 26
    .line 27
    sget-object v2, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 30
    .line 31
    .line 32
    invoke-static {}, Ly7/b;->c()Landroid/graphics/Typeface;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 37
    .line 38
    .line 39
    new-instance v2, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    iget v3, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->r:F

    .line 45
    .line 46
    float-to-int v3, v3

    .line 47
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v3, "%"

    .line 51
    .line 52
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    add-int/2addr v3, v4

    .line 68
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    sub-int/2addr v3, v4

    .line 73
    shr-int/lit8 v1, v3, 0x1

    .line 74
    .line 75
    int-to-float v1, v1

    .line 76
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    add-int/2addr v3, v4

    .line 85
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    sub-int/2addr v3, v4

    .line 90
    int-to-float v3, v3

    .line 91
    invoke-virtual {v0}, Landroid/graphics/Paint;->descent()F

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    invoke-virtual {v0}, Landroid/graphics/Paint;->ascent()F

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    add-float/2addr v4, v5

    .line 100
    sub-float/2addr v3, v4

    .line 101
    const/high16 v4, 0x40000000    # 2.0f

    .line 102
    .line 103
    div-float/2addr v3, v4

    .line 104
    invoke-virtual {p1, v2, v1, v3, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 105
    .line 106
    .line 107
    :cond_0
    return-void
.end method

.method public final d(Z)V
    .locals 4

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->D:Landroid/graphics/PathEffect;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    new-instance p1, Landroid/graphics/PathDashPathEffect;

    .line 8
    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->x:Landroid/graphics/Path;

    .line 10
    .line 11
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->A:I

    .line 12
    .line 13
    int-to-float v1, v1

    .line 14
    const/4 v2, 0x0

    .line 15
    sget-object v3, Landroid/graphics/PathDashPathEffect$Style;->ROTATE:Landroid/graphics/PathDashPathEffect$Style;

    .line 16
    .line 17
    invoke-direct {p1, v0, v1, v2, v3}, Landroid/graphics/PathDashPathEffect;-><init>(Landroid/graphics/Path;FFLandroid/graphics/PathDashPathEffect$Style;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->D:Landroid/graphics/PathEffect;

    .line 21
    .line 22
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->s:Landroid/graphics/Paint;

    .line 23
    .line 24
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->D:Landroid/graphics/PathEffect;

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
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->D:Landroid/graphics/PathEffect;

    .line 32
    .line 33
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->s:Landroid/graphics/Paint;

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final e(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->t:Landroid/graphics/Paint;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->t:Landroid/graphics/Paint;

    .line 12
    .line 13
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->o:I

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 16
    .line 17
    .line 18
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->i:Z

    .line 19
    .line 20
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->h(Landroid/graphics/Canvas;Z)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final f()V
    .locals 5

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->s:Landroid/graphics/Paint;

    .line 8
    .line 9
    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 10
    .line 11
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->s:Landroid/graphics/Paint;

    .line 15
    .line 16
    sget-object v3, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 17
    .line 18
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->s:Landroid/graphics/Paint;

    .line 22
    .line 23
    iget v4, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->k:I

    .line 24
    .line 25
    int-to-float v4, v4

    .line 26
    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 27
    .line 28
    .line 29
    new-instance v0, Landroid/graphics/Paint;

    .line 30
    .line 31
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->t:Landroid/graphics/Paint;

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->t:Landroid/graphics/Paint;

    .line 40
    .line 41
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->t:Landroid/graphics/Paint;

    .line 45
    .line 46
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->j:I

    .line 47
    .line 48
    int-to-float v1, v1

    .line 49
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 50
    .line 51
    .line 52
    new-instance v0, Landroid/graphics/Path;

    .line 53
    .line 54
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->x:Landroid/graphics/Path;

    .line 58
    .line 59
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->B:Z

    .line 60
    .line 61
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->d(Z)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final g(Landroid/graphics/Canvas;Z)V
    .locals 13

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->s:Landroid/graphics/Paint;

    .line 4
    .line 5
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->s:Landroid/graphics/Paint;

    .line 12
    .line 13
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 16
    .line 17
    .line 18
    :goto_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->n:Z

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->v:Landroid/graphics/RectF;

    .line 23
    .line 24
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->d:F

    .line 25
    .line 26
    const v1, 0x402ccccd    # 2.7f

    .line 27
    .line 28
    .line 29
    mul-float v3, v0, v1

    .line 30
    .line 31
    const/high16 v4, 0x43070000    # 135.0f

    .line 32
    .line 33
    add-float/2addr v3, v4

    .line 34
    iget v4, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->r:F

    .line 35
    .line 36
    sub-float/2addr v4, v0

    .line 37
    mul-float/2addr v4, v1

    .line 38
    iget-object v6, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->s:Landroid/graphics/Paint;

    .line 39
    .line 40
    move-object v1, p1

    .line 41
    move v5, p2

    .line 42
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    move-object v1, p1

    .line 47
    move v5, p2

    .line 48
    iget-object v8, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->v:Landroid/graphics/RectF;

    .line 49
    .line 50
    iget p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->d:F

    .line 51
    .line 52
    const p2, 0x40666666    # 3.6f

    .line 53
    .line 54
    .line 55
    mul-float v0, p1, p2

    .line 56
    .line 57
    const/high16 v2, 0x43870000    # 270.0f

    .line 58
    .line 59
    add-float v9, v0, v2

    .line 60
    .line 61
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->r:F

    .line 62
    .line 63
    sub-float/2addr v0, p1

    .line 64
    mul-float v10, v0, p2

    .line 65
    .line 66
    iget-object v12, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->s:Landroid/graphics/Paint;

    .line 67
    .line 68
    move-object v7, v1

    .line 69
    move v11, v5

    .line 70
    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public getProgress()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->r:F

    .line 2
    .line 3
    return v0
.end method

.method public final h(Landroid/graphics/Canvas;Z)V
    .locals 13

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->t:Landroid/graphics/Paint;

    .line 4
    .line 5
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->t:Landroid/graphics/Paint;

    .line 12
    .line 13
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 16
    .line 17
    .line 18
    :goto_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->n:Z

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->v:Landroid/graphics/RectF;

    .line 23
    .line 24
    const/high16 v4, 0x43870000    # 270.0f

    .line 25
    .line 26
    iget-object v6, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->t:Landroid/graphics/Paint;

    .line 27
    .line 28
    const/high16 v3, 0x43070000    # 135.0f

    .line 29
    .line 30
    move-object v1, p1

    .line 31
    move v5, p2

    .line 32
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    move-object v1, p1

    .line 37
    move v5, p2

    .line 38
    iget-object v8, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->v:Landroid/graphics/RectF;

    .line 39
    .line 40
    const/high16 v10, 0x43b40000    # 360.0f

    .line 41
    .line 42
    iget-object v12, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->t:Landroid/graphics/Paint;

    .line 43
    .line 44
    const/high16 v9, 0x42b40000    # 90.0f

    .line 45
    .line 46
    move-object v7, v1

    .line 47
    move v11, v5

    .line 48
    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final i(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->CircleProgressView:[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_start_progress:I

    .line 9
    .line 10
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    int-to-float p2, p2

    .line 15
    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->d:F

    .line 16
    .line 17
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_end_progress:I

    .line 18
    .line 19
    const/16 p3, 0x3c

    .line 20
    .line 21
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    int-to-float p2, p2

    .line 26
    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->e:F

    .line 27
    .line 28
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_start_color:I

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 31
    .line 32
    .line 33
    move-result-object p3

    .line 34
    sget v0, Lcom/xuexiang/xui/R$color;->xui_config_color_light_orange:I

    .line 35
    .line 36
    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getColor(I)I

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->f:I

    .line 45
    .line 46
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_end_color:I

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    sget v0, Lcom/xuexiang/xui/R$color;->xui_config_color_dark_orange:I

    .line 53
    .line 54
    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getColor(I)I

    .line 55
    .line 56
    .line 57
    move-result p3

    .line 58
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->g:I

    .line 63
    .line 64
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_isFilled:I

    .line 65
    .line 66
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->i:Z

    .line 71
    .line 72
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_isTracked:I

    .line 73
    .line 74
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->h:Z

    .line 79
    .line 80
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_circle_broken:I

    .line 81
    .line 82
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->n:Z

    .line 87
    .line 88
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_progress_textColor:I

    .line 89
    .line 90
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 91
    .line 92
    .line 93
    move-result-object p3

    .line 94
    sget v0, Lcom/xuexiang/xui/R$attr;->colorAccent:I

    .line 95
    .line 96
    invoke-static {p3, v0}, Lcom/xuexiang/xui/utils/g;->d(Landroid/content/Context;I)I

    .line 97
    .line 98
    .line 99
    move-result p3

    .line 100
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->m:I

    .line 105
    .line 106
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_progress_textSize:I

    .line 107
    .line 108
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 109
    .line 110
    .line 111
    move-result-object p3

    .line 112
    sget v0, Lcom/xuexiang/xui/R$dimen;->default_pv_progress_text_size:I

    .line 113
    .line 114
    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 115
    .line 116
    .line 117
    move-result p3

    .line 118
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->l:I

    .line 123
    .line 124
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_track_width:I

    .line 125
    .line 126
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 127
    .line 128
    .line 129
    move-result-object p3

    .line 130
    sget v0, Lcom/xuexiang/xui/R$dimen;->default_pv_trace_width:I

    .line 131
    .line 132
    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 133
    .line 134
    .line 135
    move-result p3

    .line 136
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 137
    .line 138
    .line 139
    move-result p2

    .line 140
    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->j:I

    .line 141
    .line 142
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_progress_width:I

    .line 143
    .line 144
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 145
    .line 146
    .line 147
    move-result-object p3

    .line 148
    sget v0, Lcom/xuexiang/xui/R$dimen;->default_pv_trace_width:I

    .line 149
    .line 150
    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 151
    .line 152
    .line 153
    move-result p3

    .line 154
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 155
    .line 156
    .line 157
    move-result p2

    .line 158
    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->k:I

    .line 159
    .line 160
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_animate_type:I

    .line 161
    .line 162
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 163
    .line 164
    .line 165
    move-result p2

    .line 166
    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->c:I

    .line 167
    .line 168
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_track_color:I

    .line 169
    .line 170
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 171
    .line 172
    .line 173
    move-result-object p3

    .line 174
    sget v0, Lcom/xuexiang/xui/R$color;->default_pv_track_color:I

    .line 175
    .line 176
    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getColor(I)I

    .line 177
    .line 178
    .line 179
    move-result p3

    .line 180
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 181
    .line 182
    .line 183
    move-result p2

    .line 184
    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->o:I

    .line 185
    .line 186
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_progress_textVisibility:I

    .line 187
    .line 188
    const/4 p3, 0x1

    .line 189
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 190
    .line 191
    .line 192
    move-result p2

    .line 193
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->q:Z

    .line 194
    .line 195
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_progress_duration:I

    .line 196
    .line 197
    const/16 p3, 0x4b0

    .line 198
    .line 199
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 200
    .line 201
    .line 202
    move-result p2

    .line 203
    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->p:I

    .line 204
    .line 205
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_scaleZone_length:I

    .line 206
    .line 207
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 208
    .line 209
    .line 210
    move-result-object p3

    .line 211
    sget v0, Lcom/xuexiang/xui/R$dimen;->default_pv_zone_length:I

    .line 212
    .line 213
    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 214
    .line 215
    .line 216
    move-result p3

    .line 217
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 218
    .line 219
    .line 220
    move-result p2

    .line 221
    int-to-float p2, p2

    .line 222
    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->z:F

    .line 223
    .line 224
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_scaleZone_width:I

    .line 225
    .line 226
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 227
    .line 228
    .line 229
    move-result-object p3

    .line 230
    sget v0, Lcom/xuexiang/xui/R$dimen;->default_pv_zone_width:I

    .line 231
    .line 232
    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 233
    .line 234
    .line 235
    move-result p3

    .line 236
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 237
    .line 238
    .line 239
    move-result p2

    .line 240
    int-to-float p2, p2

    .line 241
    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->y:F

    .line 242
    .line 243
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_scaleZone_padding:I

    .line 244
    .line 245
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 246
    .line 247
    .line 248
    move-result-object p3

    .line 249
    sget v0, Lcom/xuexiang/xui/R$dimen;->default_pv_zone_padding:I

    .line 250
    .line 251
    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 252
    .line 253
    .line 254
    move-result p3

    .line 255
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 256
    .line 257
    .line 258
    move-result p2

    .line 259
    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->A:I

    .line 260
    .line 261
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_scaleZone_corner_radius:I

    .line 262
    .line 263
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 264
    .line 265
    .line 266
    move-result-object p3

    .line 267
    sget v0, Lcom/xuexiang/xui/R$dimen;->default_pv_zone_corner_radius:I

    .line 268
    .line 269
    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 270
    .line 271
    .line 272
    move-result p3

    .line 273
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 274
    .line 275
    .line 276
    move-result p2

    .line 277
    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->C:I

    .line 278
    .line 279
    sget p2, Lcom/xuexiang/xui/R$styleable;->CircleProgressView_cpv_isGraduated:I

    .line 280
    .line 281
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 282
    .line 283
    .line 284
    move-result p2

    .line 285
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->B:Z

    .line 286
    .line 287
    iget p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->d:F

    .line 288
    .line 289
    iput p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->r:F

    .line 290
    .line 291
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 292
    .line 293
    .line 294
    return-void
.end method

.method public final j()V
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

.method public final k()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->v:Landroid/graphics/RectF;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->v:Landroid/graphics/RectF;

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
    iget v2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->j:I

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
    iget v3, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->j:I

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
    iget v4, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->j:I

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
    iget v5, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->j:I

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
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->v:Landroid/graphics/RectF;

    .line 56
    .line 57
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->e(Landroid/graphics/Canvas;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->b(Landroid/graphics/Canvas;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->c(Landroid/graphics/Canvas;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 8

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->k()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Landroid/graphics/LinearGradient;

    .line 8
    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->v:Landroid/graphics/RectF;

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
    iget v5, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->f:I

    .line 32
    .line 33
    iget v6, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->g:I

    .line 34
    .line 35
    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 36
    .line 37
    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->u:Landroid/graphics/LinearGradient;

    .line 41
    .line 42
    new-instance p1, Landroid/graphics/RectF;

    .line 43
    .line 44
    iget p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->y:F

    .line 45
    .line 46
    iget p3, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->z:F

    .line 47
    .line 48
    const/4 p4, 0x0

    .line 49
    invoke-direct {p1, p4, p4, p2, p3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 50
    .line 51
    .line 52
    iget-object p2, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->x:Landroid/graphics/Path;

    .line 53
    .line 54
    iget p3, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->C:I

    .line 55
    .line 56
    int-to-float p4, p3

    .line 57
    int-to-float p3, p3

    .line 58
    sget-object v0, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 59
    .line 60
    invoke-virtual {p2, p1, p4, p3, v0}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public setAnimateType(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->c:I

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->setObjectAnimatorType(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setCircleBroken(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->n:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->j()V

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
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->g:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->k()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/LinearGradient;

    .line 7
    .line 8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->v:Landroid/graphics/RectF;

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
    iget v5, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->f:I

    .line 28
    .line 29
    iget v6, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->g:I

    .line 30
    .line 31
    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 32
    .line 33
    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->u:Landroid/graphics/LinearGradient;

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->j()V

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
    cmpl-float v0, p1, v0

    .line 9
    .line 10
    if-gtz v0, :cond_0

    .line 11
    .line 12
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->e:F

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->j()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 19
    .line 20
    const-string v0, "Illegal progress value, please change it!"

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1
.end method

.method public setFillEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->i:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->j()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setGraduatedEnabled(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->B:Z

    .line 2
    .line 3
    new-instance v0, Lcom/xuexiang/xui/widget/progress/CircleProgressView$a;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lcom/xuexiang/xui/widget/progress/CircleProgressView$a;-><init>(Lcom/xuexiang/xui/widget/progress/CircleProgressView;Z)V

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
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->r:F

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->j()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setProgressDuration(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->p:I

    .line 2
    .line 3
    return-void
.end method

.method public setProgressTextColor(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->m:I

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
    invoke-static {v0, p1}, Lcom/xuexiang/xui/utils/c;->d(Landroid/content/Context;F)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->l:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->j()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setProgressTextVisibility(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->q:Z

    .line 2
    .line 3
    return-void
.end method

.method public setProgressViewUpdateListener(Lcom/xuexiang/xui/widget/progress/CircleProgressView$b;)V
    .locals 0

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
    invoke-static {v0, p1}, Lcom/xuexiang/xui/utils/c;->b(Landroid/content/Context;F)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->k:I

    .line 11
    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->s:Landroid/graphics/Paint;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->j()V

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
    invoke-static {v0, p1}, Lcom/xuexiang/xui/utils/c;->b(Landroid/content/Context;F)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->C:I

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
    invoke-static {v0, p1}, Lcom/xuexiang/xui/utils/c;->b(Landroid/content/Context;F)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    int-to-float p1, p1

    .line 10
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->z:F

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
    invoke-static {v0, p1}, Lcom/xuexiang/xui/utils/c;->b(Landroid/content/Context;F)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->A:I

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
    invoke-static {v0, p1}, Lcom/xuexiang/xui/utils/c;->b(Landroid/content/Context;F)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    int-to-float p1, p1

    .line 10
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->y:F

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
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->f:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->k()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/LinearGradient;

    .line 7
    .line 8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->v:Landroid/graphics/RectF;

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
    iget v5, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->f:I

    .line 28
    .line 29
    iget v6, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->g:I

    .line 30
    .line 31
    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 32
    .line 33
    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->u:Landroid/graphics/LinearGradient;

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->j()V

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
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->d:F

    .line 13
    .line 14
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->r:F

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->j()V

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
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->o:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->j()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setTrackEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->h:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->j()V

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
    invoke-static {v0, p1}, Lcom/xuexiang/xui/utils/c;->b(Landroid/content/Context;F)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->j:I

    .line 11
    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->t:Landroid/graphics/Paint;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->k()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/CircleProgressView;->j()V

    .line 21
    .line 22
    .line 23
    return-void
.end method
