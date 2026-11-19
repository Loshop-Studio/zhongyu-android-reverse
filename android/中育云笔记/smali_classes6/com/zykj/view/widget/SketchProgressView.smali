.class public final Lcom/zykj/view/widget/SketchProgressView;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/widget/SketchProgressView$a;,
        Lcom/zykj/view/widget/SketchProgressView$b;
    }
.end annotation


# static fields
.field public static final r:Lcom/zykj/view/widget/SketchProgressView$a;


# instance fields
.field public c:F

.field public d:Lcom/zykj/view/widget/SketchProgressView$b;

.field public e:I

.field public f:F

.field public g:Landroid/graphics/RectF;

.field public h:Landroid/graphics/Paint;

.field public i:F

.field public j:F

.field public k:F

.field public l:F

.field public m:Z

.field public n:Z

.field public o:Lkotlinx/coroutines/g;

.field public p:Lkotlinx/coroutines/g;

.field public q:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/view/widget/SketchProgressView$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/view/widget/SketchProgressView$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/view/widget/SketchProgressView;->r:Lcom/zykj/view/widget/SketchProgressView$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/zykj/view/widget/SketchProgressView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/n;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/zykj/view/widget/SketchProgressView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/n;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p3, 0x1

    .line 5
    iput p3, p0, Lcom/zykj/view/widget/SketchProgressView;->e:I

    const/high16 v0, 0x3f800000    # 1.0f

    .line 6
    iput v0, p0, Lcom/zykj/view/widget/SketchProgressView;->f:F

    .line 7
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/zykj/view/widget/SketchProgressView;->g:Landroid/graphics/RectF;

    .line 8
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/zykj/view/widget/SketchProgressView;->h:Landroid/graphics/Paint;

    const/high16 v0, 0x40000000    # 2.0f

    .line 9
    iput v0, p0, Lcom/zykj/view/widget/SketchProgressView;->l:F

    .line 10
    iput-boolean p3, p0, Lcom/zykj/view/widget/SketchProgressView;->m:Z

    .line 11
    iput-boolean p3, p0, Lcom/zykj/view/widget/SketchProgressView;->n:Z

    .line 12
    iput-boolean p3, p0, Lcom/zykj/view/widget/SketchProgressView;->q:Z

    if-eqz p2, :cond_0

    .line 13
    sget-object v1, Lcom/zykj/view/R$styleable;->SketchProgressView:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string p2, "obtainStyledAttributes(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    sget p2, Lcom/zykj/view/R$styleable;->SketchProgressView_sp_orientation:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    invoke-virtual {p0, p2}, Lcom/zykj/view/widget/SketchProgressView;->setOrientation(I)V

    .line 15
    sget p2, Lcom/zykj/view/R$styleable;->SketchProgressView_sp_thumbRadius:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p0, Lcom/zykj/view/widget/SketchProgressView;->l:F

    .line 16
    iget-object p2, p0, Lcom/zykj/view/widget/SketchProgressView;->h:Landroid/graphics/Paint;

    sget v0, Lcom/zykj/view/R$styleable;->SketchProgressView_sp_thumbColor:I

    const-string v1, "#D9D9D9"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 17
    sget p2, Lcom/zykj/view/R$styleable;->SketchProgressView_sp_alwaysShow:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/zykj/view/widget/SketchProgressView;->m:Z

    .line 18
    sget p2, Lcom/zykj/view/R$styleable;->SketchProgressView_sp_touchable:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/zykj/view/widget/SketchProgressView;->q:Z

    .line 19
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 20
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/view/widget/SketchProgressView;->m()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 3
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/view/widget/SketchProgressView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic a(Lcom/zykj/view/widget/SketchProgressView;)Landroid/graphics/Paint;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/widget/SketchProgressView;->h:Landroid/graphics/Paint;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(Lcom/zykj/view/widget/SketchProgressView;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/widget/SketchProgressView;->l()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic c(Lcom/zykj/view/widget/SketchProgressView;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/view/widget/SketchProgressView;->n:Z

    .line 2
    .line 3
    return-void
.end method

.method private final getViewCrossLength()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/view/widget/SketchProgressView;->e:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
.end method

.method private final getViewMainLength()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/view/widget/SketchProgressView;->e:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
.end method


# virtual methods
.method public final d()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/widget/SketchProgressView;->getViewMainLength()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lcom/zykj/view/widget/SketchProgressView;->e:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/zykj/view/widget/SketchProgressView;->g:Landroid/graphics/RectF;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v1, p0, Lcom/zykj/view/widget/SketchProgressView;->g:Landroid/graphics/RectF;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    :goto_0
    const/4 v2, 0x2

    .line 24
    int-to-float v2, v2

    .line 25
    div-float/2addr v1, v2

    .line 26
    iget v3, p0, Lcom/zykj/view/widget/SketchProgressView;->k:F

    .line 27
    .line 28
    add-float/2addr v1, v3

    .line 29
    iput v1, p0, Lcom/zykj/view/widget/SketchProgressView;->i:F

    .line 30
    .line 31
    int-to-float v0, v0

    .line 32
    sub-float/2addr v0, v1

    .line 33
    mul-float/2addr v2, v3

    .line 34
    add-float/2addr v0, v2

    .line 35
    iput v0, p0, Lcom/zykj/view/widget/SketchProgressView;->j:F

    .line 36
    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    const-string v2, "minTouch -> "

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-string v1, "SketchProgressView"

    .line 55
    .line 56
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    iget v0, p0, Lcom/zykj/view/widget/SketchProgressView;->j:F

    .line 60
    .line 61
    new-instance v2, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    .line 66
    const-string v3, "maxTouch -> "

    .line 67
    .line 68
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public final e()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/widget/SketchProgressView;->getViewMainLength()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0}, Lcom/zykj/view/widget/SketchProgressView;->getViewCrossLength()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    int-to-float v2, v0

    .line 10
    iget v3, p0, Lcom/zykj/view/widget/SketchProgressView;->f:F

    .line 11
    .line 12
    mul-float/2addr v2, v3

    .line 13
    float-to-int v2, v2

    .line 14
    if-ge v2, v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v1, v2

    .line 18
    :goto_0
    sub-int/2addr v0, v1

    .line 19
    int-to-float v0, v0

    .line 20
    iget v2, p0, Lcom/zykj/view/widget/SketchProgressView;->c:F

    .line 21
    .line 22
    mul-float/2addr v0, v2

    .line 23
    iget v2, p0, Lcom/zykj/view/widget/SketchProgressView;->e:I

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    const/4 v4, 0x0

    .line 27
    if-ne v2, v3, :cond_1

    .line 28
    .line 29
    iget-object v2, p0, Lcom/zykj/view/widget/SketchProgressView;->g:Landroid/graphics/RectF;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    int-to-float v3, v3

    .line 36
    int-to-float v1, v1

    .line 37
    add-float/2addr v1, v0

    .line 38
    invoke-virtual {v2, v4, v0, v3, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    iget-object v2, p0, Lcom/zykj/view/widget/SketchProgressView;->g:Landroid/graphics/RectF;

    .line 43
    .line 44
    int-to-float v1, v1

    .line 45
    add-float/2addr v1, v0

    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    int-to-float v3, v3

    .line 51
    invoke-virtual {v2, v0, v4, v1, v3}, Landroid/graphics/RectF;->set(FFFF)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final f(Landroid/view/MotionEvent;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/view/widget/SketchProgressView;->e:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iget-object v0, p0, Lcom/zykj/view/widget/SketchProgressView;->g:Landroid/graphics/RectF;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerY()F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    :goto_0
    sub-float/2addr p1, v0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iget-object v0, p0, Lcom/zykj/view/widget/SketchProgressView;->g:Landroid/graphics/RectF;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    goto :goto_0

    .line 29
    :goto_1
    iput p1, p0, Lcom/zykj/view/widget/SketchProgressView;->k:F

    .line 30
    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    const-string v1, "touchOffset -> "

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const-string v0, "SketchProgressView"

    .line 49
    .line 50
    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final g(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/widget/SketchProgressView;->g:Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-virtual {v0, v1, p1}, Landroid/graphics/RectF;->contains(FF)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method

.method public final getOrientation()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/widget/SketchProgressView;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public final getProgress()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/widget/SketchProgressView;->c:F

    .line 2
    .line 3
    return v0
.end method

.method public final getProgressListener()Lcom/zykj/view/widget/SketchProgressView$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/widget/SketchProgressView;->d:Lcom/zykj/view/widget/SketchProgressView$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getThumbTime()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/widget/SketchProgressView;->f:F

    .line 2
    .line 3
    return v0
.end method

.method public final h()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/view/widget/SketchProgressView;->o:Lkotlinx/coroutines/g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/g$a;->a(Lkotlinx/coroutines/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    sget-object v3, Lsd/h1;->c:Lsd/h1;

    .line 11
    .line 12
    new-instance v6, Lcom/zykj/view/widget/SketchProgressView$closeVisible$1;

    .line 13
    .line 14
    invoke-direct {v6, p0, v1}, Lcom/zykj/view/widget/SketchProgressView$closeVisible$1;-><init>(Lcom/zykj/view/widget/SketchProgressView;Lvc/c;)V

    .line 15
    .line 16
    .line 17
    const/4 v7, 0x3

    .line 18
    const/4 v8, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v5, 0x0

    .line 21
    invoke-static/range {v3 .. v8}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Lcom/zykj/view/widget/SketchProgressView;->o:Lkotlinx/coroutines/g;

    .line 26
    .line 27
    return-void
.end method

.method public final i(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/widget/SketchProgressView;->g:Landroid/graphics/RectF;

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/view/widget/SketchProgressView;->l:F

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/view/widget/SketchProgressView;->h:Landroid/graphics/Paint;

    .line 6
    .line 7
    invoke-virtual {p1, v0, v1, v1, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final j(Landroid/view/MotionEvent;)F
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/view/widget/SketchProgressView;->e:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method

.method public final k(Landroid/view/MotionEvent;)F
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/view/widget/SketchProgressView;->j(Landroid/view/MotionEvent;)F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget v0, p0, Lcom/zykj/view/widget/SketchProgressView;->i:F

    .line 6
    .line 7
    cmpg-float v1, p1, v0

    .line 8
    .line 9
    if-gez v1, :cond_0

    .line 10
    .line 11
    move p1, v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget v1, p0, Lcom/zykj/view/widget/SketchProgressView;->j:F

    .line 14
    .line 15
    cmpl-float v2, p1, v1

    .line 16
    .line 17
    if-lez v2, :cond_1

    .line 18
    .line 19
    move p1, v1

    .line 20
    :cond_1
    :goto_0
    iget v1, p0, Lcom/zykj/view/widget/SketchProgressView;->j:F

    .line 21
    .line 22
    cmpg-float v2, v1, v0

    .line 23
    .line 24
    if-nez v2, :cond_2

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    return p1

    .line 28
    :cond_2
    sub-float/2addr p1, v0

    .line 29
    sub-float/2addr v1, v0

    .line 30
    div-float/2addr p1, v1

    .line 31
    return p1
.end method

.method public final l()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/view/widget/SketchProgressView;->p:Lkotlinx/coroutines/g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/g$a;->a(Lkotlinx/coroutines/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    sget-object v3, Lsd/h1;->c:Lsd/h1;

    .line 11
    .line 12
    new-instance v6, Lcom/zykj/view/widget/SketchProgressView$hideView$1;

    .line 13
    .line 14
    invoke-direct {v6, p0, v1}, Lcom/zykj/view/widget/SketchProgressView$hideView$1;-><init>(Lcom/zykj/view/widget/SketchProgressView;Lvc/c;)V

    .line 15
    .line 16
    .line 17
    const/4 v7, 0x3

    .line 18
    const/4 v8, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v5, 0x0

    .line 21
    invoke-static/range {v3 .. v8}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Lcom/zykj/view/widget/SketchProgressView;->p:Lkotlinx/coroutines/g;

    .line 26
    .line 27
    return-void
.end method

.method public final m()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/widget/SketchProgressView;->h:Landroid/graphics/Paint;

    .line 2
    .line 3
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 11
    .line 12
    .line 13
    sget-object v1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 16
    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 23
    .line 24
    .line 25
    iget-boolean v1, p0, Lcom/zykj/view/widget/SketchProgressView;->m:Z

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    const/16 v1, 0xff

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method public final n()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/view/widget/SketchProgressView;->p:Lkotlinx/coroutines/g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/g$a;->a(Lkotlinx/coroutines/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    sget-object v3, Lsd/h1;->c:Lsd/h1;

    .line 11
    .line 12
    new-instance v6, Lcom/zykj/view/widget/SketchProgressView$showView$1;

    .line 13
    .line 14
    invoke-direct {v6, p0, v1}, Lcom/zykj/view/widget/SketchProgressView$showView$1;-><init>(Lcom/zykj/view/widget/SketchProgressView;Lvc/c;)V

    .line 15
    .line 16
    .line 17
    const/4 v7, 0x3

    .line 18
    const/4 v8, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v5, 0x0

    .line 21
    invoke-static/range {v3 .. v8}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Lcom/zykj/view/widget/SketchProgressView;->p:Lkotlinx/coroutines/g;

    .line 26
    .line 27
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/view/widget/SketchProgressView;->p:Lkotlinx/coroutines/g;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-static {v0, v2, v1, v2}, Lkotlinx/coroutines/g$a;->a(Lkotlinx/coroutines/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/zykj/view/widget/SketchProgressView;->o:Lkotlinx/coroutines/g;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-static {v0, v2, v1, v2}, Lkotlinx/coroutines/g$a;->a(Lkotlinx/coroutines/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/view/widget/SketchProgressView;->e()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lcom/zykj/view/widget/SketchProgressView;->i(Landroid/graphics/Canvas;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public onMeasure(II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    if-le p1, p2, :cond_0

    .line 13
    .line 14
    iget p1, p0, Lcom/zykj/view/widget/SketchProgressView;->e:I

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    invoke-virtual {p0, p1}, Lcom/zykj/view/widget/SketchProgressView;->setOrientation(I)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-ge p1, p2, :cond_1

    .line 32
    .line 33
    iget p1, p0, Lcom/zykj/view/widget/SketchProgressView;->e:I

    .line 34
    .line 35
    const/4 p2, 0x1

    .line 36
    if-eq p1, p2, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0, p2}, Lcom/zykj/view/widget/SketchProgressView;->setOrientation(I)V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/zykj/view/widget/SketchProgressView;->q:Z

    .line 7
    .line 8
    if-eqz v0, :cond_6

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x1

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    if-eq v0, v1, :cond_1

    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    if-eq v0, v2, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    invoke-virtual {p0, p1}, Lcom/zykj/view/widget/SketchProgressView;->k(Landroid/view/MotionEvent;)F

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-virtual {p0, p1}, Lcom/zykj/view/widget/SketchProgressView;->setProgress(F)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/zykj/view/widget/SketchProgressView;->d:Lcom/zykj/view/widget/SketchProgressView$b;

    .line 31
    .line 32
    if-eqz p1, :cond_5

    .line 33
    .line 34
    iget v0, p0, Lcom/zykj/view/widget/SketchProgressView;->c:F

    .line 35
    .line 36
    invoke-interface {p1, v0}, Lcom/zykj/view/widget/SketchProgressView$b;->onProgress(F)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    invoke-virtual {p0, p1}, Lcom/zykj/view/widget/SketchProgressView;->k(Landroid/view/MotionEvent;)F

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    invoke-virtual {p0, p1}, Lcom/zykj/view/widget/SketchProgressView;->setProgress(F)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lcom/zykj/view/widget/SketchProgressView;->d:Lcom/zykj/view/widget/SketchProgressView$b;

    .line 48
    .line 49
    if-eqz p1, :cond_5

    .line 50
    .line 51
    iget v0, p0, Lcom/zykj/view/widget/SketchProgressView;->c:F

    .line 52
    .line 53
    invoke-interface {p1, v0}, Lcom/zykj/view/widget/SketchProgressView$b;->a(F)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    invoke-virtual {p0, p1}, Lcom/zykj/view/widget/SketchProgressView;->g(Landroid/view/MotionEvent;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    invoke-virtual {p0, p1}, Lcom/zykj/view/widget/SketchProgressView;->f(Landroid/view/MotionEvent;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    const/4 v0, 0x0

    .line 68
    iput v0, p0, Lcom/zykj/view/widget/SketchProgressView;->k:F

    .line 69
    .line 70
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/view/widget/SketchProgressView;->d()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, p1}, Lcom/zykj/view/widget/SketchProgressView;->k(Landroid/view/MotionEvent;)F

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    invoke-virtual {p0, p1}, Lcom/zykj/view/widget/SketchProgressView;->setProgress(F)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, Lcom/zykj/view/widget/SketchProgressView;->d:Lcom/zykj/view/widget/SketchProgressView$b;

    .line 81
    .line 82
    if-eqz p1, :cond_4

    .line 83
    .line 84
    invoke-interface {p1}, Lcom/zykj/view/widget/SketchProgressView$b;->b()V

    .line 85
    .line 86
    .line 87
    :cond_4
    iget-object p1, p0, Lcom/zykj/view/widget/SketchProgressView;->d:Lcom/zykj/view/widget/SketchProgressView$b;

    .line 88
    .line 89
    if-eqz p1, :cond_5

    .line 90
    .line 91
    iget v0, p0, Lcom/zykj/view/widget/SketchProgressView;->c:F

    .line 92
    .line 93
    invoke-interface {p1, v0}, Lcom/zykj/view/widget/SketchProgressView$b;->onProgress(F)V

    .line 94
    .line 95
    .line 96
    :cond_5
    :goto_1
    return v1

    .line 97
    :cond_6
    const/4 p1, 0x0

    .line 98
    return p1
.end method

.method public final setOrientation(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/view/widget/SketchProgressView;->e:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setProgress(F)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/widget/SketchProgressView;->m:Z

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget v0, p0, Lcom/zykj/view/widget/SketchProgressView;->f:F

    .line 8
    .line 9
    cmpg-float v0, v0, v1

    .line 10
    .line 11
    if-gez v0, :cond_0

    .line 12
    .line 13
    iget-boolean v0, p0, Lcom/zykj/view/widget/SketchProgressView;->n:Z

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Lcom/zykj/view/widget/SketchProgressView;->n:Z

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/zykj/view/widget/SketchProgressView;->n()V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/view/widget/SketchProgressView;->h()V

    .line 24
    .line 25
    .line 26
    :cond_1
    cmpl-float v0, p1, v1

    .line 27
    .line 28
    if-lez v0, :cond_2

    .line 29
    .line 30
    move p1, v1

    .line 31
    goto :goto_0

    .line 32
    :cond_2
    const/4 v0, 0x0

    .line 33
    cmpg-float v1, p1, v0

    .line 34
    .line 35
    if-gez v1, :cond_3

    .line 36
    .line 37
    move p1, v0

    .line 38
    :cond_3
    :goto_0
    iput p1, p0, Lcom/zykj/view/widget/SketchProgressView;->c:F

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final setProgressListener(Lcom/zykj/view/widget/SketchProgressView$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/widget/SketchProgressView;->d:Lcom/zykj/view/widget/SketchProgressView$b;

    .line 2
    .line 3
    return-void
.end method

.method public final setThumbTime(F)V
    .locals 2

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    cmpl-float v1, p1, v0

    .line 4
    .line 5
    if-lez v1, :cond_0

    .line 6
    .line 7
    :goto_0
    move p1, v0

    .line 8
    goto :goto_1

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    cmpg-float v1, p1, v0

    .line 11
    .line 12
    if-gez v1, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    :goto_1
    iput p1, p0, Lcom/zykj/view/widget/SketchProgressView;->f:F

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final setTouchable(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/view/widget/SketchProgressView;->q:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setViewAlwaysShow(Z)V
    .locals 3

    .line 1
    iput-boolean p1, p0, Lcom/zykj/view/widget/SketchProgressView;->m:Z

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/view/widget/SketchProgressView;->p:Lkotlinx/coroutines/g;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {v0, v2, v1, v2}, Lkotlinx/coroutines/g$a;->a(Lkotlinx/coroutines/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/zykj/view/widget/SketchProgressView;->o:Lkotlinx/coroutines/g;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-static {v0, v2, v1, v2}, Lkotlinx/coroutines/g$a;->a(Lkotlinx/coroutines/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    iget-object v0, p0, Lcom/zykj/view/widget/SketchProgressView;->h:Landroid/graphics/Paint;

    .line 20
    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    const/16 p1, 0xff

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_2
    const/4 p1, 0x0

    .line 27
    :goto_0
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 31
    .line 32
    .line 33
    return-void
.end method
