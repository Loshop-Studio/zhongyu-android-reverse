.class public Lcom/xuexiang/xui/widget/button/SwitchIconView;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/button/SwitchIconView$SwitchIconSavedState;
    }
.end annotation


# static fields
.field public static final r:F


# instance fields
.field public final a:J

.field public final b:F

.field public final c:I

.field public final d:I

.field public final e:Landroid/graphics/Path;

.field public final f:I

.field public final g:I

.field public final h:Z

.field public i:I

.field public j:I

.field public k:I

.field public final l:Landroid/animation/ArgbEvaluator;

.field public m:F

.field public n:Z

.field public final o:Landroid/graphics/Paint;

.field public final p:Landroid/graphics/Point;

.field public final q:Landroid/graphics/Point;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide v0, 0x4046800000000000L    # 45.0

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    double-to-float v0, v0

    .line 15
    sput v0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->r:F

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/button/SwitchIconView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->SwitchIconViewStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/button/SwitchIconView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance p3, Landroid/animation/ArgbEvaluator;

    invoke-direct {p3}, Landroid/animation/ArgbEvaluator;-><init>()V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->l:Landroid/animation/ArgbEvaluator;

    const/4 p3, 0x0

    .line 5
    iput p3, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->m:F

    .line 6
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->p:Landroid/graphics/Point;

    .line 7
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->q:Landroid/graphics/Point;

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 8
    invoke-virtual {p0, v1, v0}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget-object v2, Lcom/xuexiang/xui/R$styleable;->SwitchIconView:[I

    const/4 v3, 0x0

    invoke-virtual {v0, p2, v2, v3, v3}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 10
    :try_start_0
    sget v0, Lcom/xuexiang/xui/R$styleable;->SwitchIconView_siv_tint_color:I

    sget v2, Lcom/xuexiang/xui/R$attr;->colorAccent:I

    .line 11
    invoke-static {p1, v2, v3}, Lkotlin/collections/u;->F(Landroid/content/Context;II)I

    move-result p1

    .line 12
    invoke-virtual {p2, v0, p1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->f:I

    .line 13
    sget v0, Lcom/xuexiang/xui/R$styleable;->SwitchIconView_siv_animation_duration:I

    const/16 v2, 0x12c

    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v0

    int-to-long v4, v0

    iput-wide v4, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->a:J

    .line 14
    sget v0, Lcom/xuexiang/xui/R$styleable;->SwitchIconView_siv_disabled_alpha:I

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->b:F

    .line 15
    sget v2, Lcom/xuexiang/xui/R$styleable;->SwitchIconView_siv_disabled_color:I

    invoke-virtual {p2, v2, p1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->g:I

    .line 16
    sget v2, Lcom/xuexiang/xui/R$styleable;->SwitchIconView_siv_enabled:I

    invoke-virtual {p2, v2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->n:Z

    .line 17
    sget v2, Lcom/xuexiang/xui/R$styleable;->SwitchIconView_siv_no_dash:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    cmpg-float p2, v0, p3

    if-ltz p2, :cond_1

    const/high16 p2, 0x3f800000    # 1.0f

    cmpl-float v2, v0, p2

    if-gtz v2, :cond_1

    .line 19
    new-instance v0, Landroid/graphics/PorterDuffColorFilter;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, p1, v2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 20
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->c:I

    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->d:I

    .line 23
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->o:Landroid/graphics/Paint;

    .line 24
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 25
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 26
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->e:Landroid/graphics/Path;

    .line 27
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->b()V

    .line 28
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->n:Z

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move p3, p2

    :goto_0
    invoke-direct {p0, p3}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->setFraction(F)V

    return-void

    .line 29
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Wrong value for si_disabled_alpha ["

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p3, "]. Must be value from range [0, 1]"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 30
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 31
    throw p1
.end method

.method public static synthetic a(Lcom/xuexiang/xui/widget/button/SwitchIconView;F)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->setFraction(F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private setFraction(F)V
    .locals 4

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->m:F

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->o:Landroid/graphics/Paint;

    .line 4
    .line 5
    iget v1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->f:I

    .line 6
    .line 7
    iget v2, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->g:I

    .line 8
    .line 9
    if-eq v1, v2, :cond_0

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->l:Landroid/animation/ArgbEvaluator;

    .line 20
    .line 21
    invoke-virtual {v3, p1, v1, v2}, Landroid/animation/ArgbEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ljava/lang/Integer;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    new-instance v2, Landroid/graphics/PorterDuffColorFilter;

    .line 32
    .line 33
    sget-object v3, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 34
    .line 35
    invoke-direct {v2, v1, v3}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v2}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 42
    .line 43
    .line 44
    :cond_0
    const/high16 v1, 0x3f800000    # 1.0f

    .line 45
    .line 46
    sub-float p1, v1, p1

    .line 47
    .line 48
    iget v2, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->b:F

    .line 49
    .line 50
    sub-float/2addr v1, v2

    .line 51
    mul-float/2addr v1, p1

    .line 52
    add-float/2addr v1, v2

    .line 53
    const/high16 p1, 0x437f0000    # 255.0f

    .line 54
    .line 55
    mul-float/2addr v1, p1

    .line 56
    float-to-int p1, v1

    .line 57
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageAlpha(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->c()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 67
    .line 68
    .line 69
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 6

    .line 1
    sget v0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->r:F

    .line 2
    .line 3
    const/high16 v1, 0x3fc00000    # 1.5f

    .line 4
    .line 5
    mul-float/2addr v1, v0

    .line 6
    iget v2, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->i:I

    .line 7
    .line 8
    int-to-float v3, v2

    .line 9
    mul-float/2addr v1, v3

    .line 10
    const/high16 v3, 0x3f000000    # 0.5f

    .line 11
    .line 12
    mul-float/2addr v0, v3

    .line 13
    int-to-float v2, v2

    .line 14
    mul-float/2addr v0, v2

    .line 15
    iget v2, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->c:I

    .line 16
    .line 17
    int-to-float v3, v2

    .line 18
    add-float/2addr v3, v0

    .line 19
    float-to-int v3, v3

    .line 20
    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->p:Landroid/graphics/Point;

    .line 21
    .line 22
    iput v3, v4, Landroid/graphics/Point;->x:I

    .line 23
    .line 24
    float-to-int v3, v1

    .line 25
    iget v5, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->d:I

    .line 26
    .line 27
    add-int/2addr v3, v5

    .line 28
    iput v3, v4, Landroid/graphics/Point;->y:I

    .line 29
    .line 30
    iget v3, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->j:I

    .line 31
    .line 32
    add-int/2addr v2, v3

    .line 33
    int-to-float v2, v2

    .line 34
    sub-float/2addr v2, v1

    .line 35
    float-to-int v1, v2

    .line 36
    iget-object v2, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->q:Landroid/graphics/Point;

    .line 37
    .line 38
    iput v1, v2, Landroid/graphics/Point;->x:I

    .line 39
    .line 40
    iget v1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->k:I

    .line 41
    .line 42
    add-int/2addr v5, v1

    .line 43
    int-to-float v1, v5

    .line 44
    sub-float/2addr v1, v0

    .line 45
    float-to-int v0, v1

    .line 46
    iput v0, v2, Landroid/graphics/Point;->y:I

    .line 47
    .line 48
    return-void
.end method

.method public final c()V
    .locals 8

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->i:I

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    sget v1, Lcom/xuexiang/xui/widget/button/SwitchIconView;->r:F

    .line 5
    .line 6
    div-float/2addr v0, v1

    .line 7
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->e:Landroid/graphics/Path;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    .line 10
    .line 11
    .line 12
    iget v2, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->c:I

    .line 13
    .line 14
    int-to-float v3, v2

    .line 15
    iget v4, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->d:I

    .line 16
    .line 17
    int-to-float v5, v4

    .line 18
    add-float/2addr v5, v0

    .line 19
    invoke-virtual {v1, v3, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 20
    .line 21
    .line 22
    int-to-float v3, v2

    .line 23
    add-float/2addr v3, v0

    .line 24
    int-to-float v5, v4

    .line 25
    invoke-virtual {v1, v3, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 26
    .line 27
    .line 28
    int-to-float v3, v2

    .line 29
    iget v5, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->j:I

    .line 30
    .line 31
    int-to-float v5, v5

    .line 32
    iget v6, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->m:F

    .line 33
    .line 34
    mul-float/2addr v5, v6

    .line 35
    add-float/2addr v5, v3

    .line 36
    int-to-float v3, v4

    .line 37
    iget v7, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->k:I

    .line 38
    .line 39
    int-to-float v7, v7

    .line 40
    mul-float/2addr v7, v6

    .line 41
    add-float/2addr v7, v3

    .line 42
    sub-float/2addr v7, v0

    .line 43
    invoke-virtual {v1, v5, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 44
    .line 45
    .line 46
    int-to-float v2, v2

    .line 47
    iget v3, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->j:I

    .line 48
    .line 49
    int-to-float v3, v3

    .line 50
    iget v5, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->m:F

    .line 51
    .line 52
    mul-float/2addr v3, v5

    .line 53
    add-float/2addr v3, v2

    .line 54
    sub-float/2addr v3, v0

    .line 55
    int-to-float v0, v4

    .line 56
    iget v2, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->k:I

    .line 57
    .line 58
    int-to-float v2, v2

    .line 59
    mul-float/2addr v2, v5

    .line 60
    add-float/2addr v2, v0

    .line 61
    invoke-virtual {v1, v3, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 11

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->h:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->m:F

    .line 6
    .line 7
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->q:Landroid/graphics/Point;

    .line 8
    .line 9
    iget v2, v1, Landroid/graphics/Point;->x:I

    .line 10
    .line 11
    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->p:Landroid/graphics/Point;

    .line 12
    .line 13
    iget v4, v3, Landroid/graphics/Point;->x:I

    .line 14
    .line 15
    sub-int/2addr v2, v4

    .line 16
    int-to-float v2, v2

    .line 17
    mul-float/2addr v2, v0

    .line 18
    int-to-float v6, v4

    .line 19
    add-float v8, v2, v6

    .line 20
    .line 21
    iget v1, v1, Landroid/graphics/Point;->y:I

    .line 22
    .line 23
    iget v2, v3, Landroid/graphics/Point;->y:I

    .line 24
    .line 25
    sub-int/2addr v1, v2

    .line 26
    int-to-float v1, v1

    .line 27
    mul-float/2addr v0, v1

    .line 28
    int-to-float v7, v2

    .line 29
    add-float v9, v0, v7

    .line 30
    .line 31
    iget-object v10, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->o:Landroid/graphics/Paint;

    .line 32
    .line 33
    move-object v5, p1

    .line 34
    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 35
    .line 36
    .line 37
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 38
    .line 39
    const/16 v0, 0x1a

    .line 40
    .line 41
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->e:Landroid/graphics/Path;

    .line 42
    .line 43
    if-lt p1, v0, :cond_0

    .line 44
    .line 45
    invoke-static {v5, v1}, Landroidx/core/util/a;->r(Landroid/graphics/Canvas;Landroid/graphics/Path;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    sget-object p1, Landroid/graphics/Region$Op;->XOR:Landroid/graphics/Region$Op;

    .line 50
    .line 51
    invoke-virtual {v5, v1, p1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    move-object v5, p1

    .line 56
    :goto_0
    invoke-super {p0, v5}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/xuexiang/xui/widget/button/SwitchIconView$SwitchIconSavedState;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    check-cast p1, Lcom/xuexiang/xui/widget/button/SwitchIconView$SwitchIconSavedState;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 16
    .line 17
    .line 18
    iget-boolean p1, p1, Lcom/xuexiang/xui/widget/button/SwitchIconView$SwitchIconSavedState;->a:Z

    .line 19
    .line 20
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->n:Z

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/high16 p1, 0x3f800000    # 1.0f

    .line 27
    .line 28
    :goto_0
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->setFraction(F)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/xuexiang/xui/widget/button/SwitchIconView$SwitchIconSavedState;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    .line 8
    .line 9
    .line 10
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->n:Z

    .line 11
    .line 12
    iput-boolean v0, v1, Lcom/xuexiang/xui/widget/button/SwitchIconView$SwitchIconSavedState;->a:Z

    .line 13
    .line 14
    return-object v1
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 5
    .line 6
    .line 7
    move-result p3

    .line 8
    sub-int/2addr p1, p3

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    sub-int/2addr p1, p3

    .line 14
    iput p1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->j:I

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    sub-int/2addr p2, p1

    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    sub-int/2addr p2, p1

    .line 26
    iput p2, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->k:I

    .line 27
    .line 28
    iget p1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->j:I

    .line 29
    .line 30
    add-int/2addr p1, p2

    .line 31
    int-to-float p1, p1

    .line 32
    const p2, 0x3daaaaab

    .line 33
    .line 34
    .line 35
    mul-float/2addr p1, p2

    .line 36
    const/high16 p2, 0x40000000    # 2.0f

    .line 37
    .line 38
    div-float/2addr p1, p2

    .line 39
    float-to-int p1, p1

    .line 40
    iput p1, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->i:I

    .line 41
    .line 42
    iget-object p2, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->o:Landroid/graphics/Paint;

    .line 43
    .line 44
    int-to-float p1, p1

    .line 45
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->b()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/SwitchIconView;->c()V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public setIconEnabled(Z)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->n:Z

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    if-eqz v0, :cond_1

    .line 7
    .line 8
    const/high16 p1, 0x3f800000    # 1.0f

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    const/4 p1, 0x0

    .line 12
    :goto_0
    const/4 v1, 0x1

    .line 13
    xor-int/2addr v0, v1

    .line 14
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->n:Z

    .line 15
    .line 16
    iget v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->m:F

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    new-array v2, v2, [F

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    aput v0, v2, v3

    .line 23
    .line 24
    aput p1, v2, v1

    .line 25
    .line 26
    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    new-instance v0, Lcom/xuexiang/xui/widget/button/f;

    .line 31
    .line 32
    invoke-direct {v0, p0, v3}, Lcom/xuexiang/xui/widget/button/f;-><init>(Ljava/lang/Object;I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 36
    .line 37
    .line 38
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    .line 39
    .line 40
    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 44
    .line 45
    .line 46
    iget-wide v0, p0, Lcom/xuexiang/xui/widget/button/SwitchIconView;->a:J

    .line 47
    .line 48
    invoke-virtual {p1, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 52
    .line 53
    .line 54
    return-void
.end method
