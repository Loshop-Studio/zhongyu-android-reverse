.class public Lb/c/a/e/f/b/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb/c/a/e/f/b/b;
.implements Landroid/view/View$OnTouchListener;
.implements Lb/c/a/e/f/b/f/d;
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb/c/a/e/f/b/e$c;,
        Lb/c/a/e/f/b/e$b;,
        Lb/c/a/e/f/b/e$g;,
        Lb/c/a/e/f/b/e$h;,
        Lb/c/a/e/f/b/e$e;,
        Lb/c/a/e/f/b/e$f;,
        Lb/c/a/e/f/b/e$d;
    }
.end annotation


# static fields
.field public static final E:Z

.field public static F:I


# instance fields
.field public A:Lb/c/a/e/f/b/e$c;

.field public B:I

.field public C:Z

.field public D:Landroid/widget/ImageView$ScaleType;

.field public b:Landroid/view/animation/Interpolator;

.field public c:I

.field public d:F

.field public e:F

.field public f:F

.field public g:Z

.field public h:Z

.field public i:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/widget/ImageView;",
            ">;"
        }
    .end annotation
.end field

.field public j:Landroid/view/GestureDetector;

.field public k:Lb/c/a/e/f/b/f/a;

.field public final l:Landroid/graphics/Matrix;

.field public final m:Landroid/graphics/Matrix;

.field public final n:Landroid/graphics/Matrix;

.field public final o:Landroid/graphics/RectF;

.field public final p:[F

.field public q:Lb/c/a/e/f/b/e$d;

.field public r:Lb/c/a/e/f/b/e$e;

.field public s:Lb/c/a/e/f/b/e$h;

.field public t:Landroid/view/View$OnLongClickListener;

.field public u:Lb/c/a/e/f/b/e$f;

.field public v:Lb/c/a/e/f/b/e$g;

.field public w:I

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "PhotoViewAttacher"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    sput-boolean v0, Lb/c/a/e/f/b/e;->E:Z

    const/4 v0, 0x1

    sput v0, Lb/c/a/e/f/b/e;->F:I

    return-void
.end method

.method public constructor <init>(Landroid/widget/ImageView;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    iput-object v0, p0, Lb/c/a/e/f/b/e;->b:Landroid/view/animation/Interpolator;

    const/16 v0, 0xc8

    iput v0, p0, Lb/c/a/e/f/b/e;->c:I

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lb/c/a/e/f/b/e;->d:F

    const/high16 v0, 0x3fe00000    # 1.75f

    iput v0, p0, Lb/c/a/e/f/b/e;->e:F

    const/high16 v0, 0x40400000    # 3.0f

    iput v0, p0, Lb/c/a/e/f/b/e;->f:F

    const/4 v0, 0x1

    iput-boolean v0, p0, Lb/c/a/e/f/b/e;->g:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, Lb/c/a/e/f/b/e;->h:Z

    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, p0, Lb/c/a/e/f/b/e;->l:Landroid/graphics/Matrix;

    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, p0, Lb/c/a/e/f/b/e;->m:Landroid/graphics/Matrix;

    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, p0, Lb/c/a/e/f/b/e;->n:Landroid/graphics/Matrix;

    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    iput-object v1, p0, Lb/c/a/e/f/b/e;->o:Landroid/graphics/RectF;

    const/16 v1, 0x9

    new-array v1, v1, [F

    iput-object v1, p0, Lb/c/a/e/f/b/e;->p:[F

    const/4 v1, 0x2

    iput v1, p0, Lb/c/a/e/f/b/e;->B:I

    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    iput-object v1, p0, Lb/c/a/e/f/b/e;->D:Landroid/widget/ImageView$ScaleType;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lb/c/a/e/f/b/e;->i:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setDrawingCacheEnabled(Z)V

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    invoke-virtual {p1}, Landroid/widget/ImageView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_0
    invoke-static {p1}, Lb/c/a/e/f/b/e;->p(Landroid/widget/ImageView;)V

    invoke-virtual {p1}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 2
    new-instance v2, Lb/c/a/e/f/b/f/c;

    invoke-direct {v2, v1}, Lb/c/a/e/f/b/f/c;-><init>(Landroid/content/Context;)V

    .line 3
    iput-object p0, v2, Lb/c/a/e/f/b/f/a;->a:Lb/c/a/e/f/b/f/d;

    .line 4
    iput-object v2, p0, Lb/c/a/e/f/b/e;->k:Lb/c/a/e/f/b/f/a;

    new-instance v1, Landroid/view/GestureDetector;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object p1

    new-instance v2, Lb/c/a/e/f/b/d;

    invoke-direct {v2, p0}, Lb/c/a/e/f/b/d;-><init>(Lb/c/a/e/f/b/e;)V

    invoke-direct {v1, p1, v2}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v1, p0, Lb/c/a/e/f/b/e;->j:Landroid/view/GestureDetector;

    new-instance p1, Lb/c/a/e/f/b/a;

    invoke-direct {p1, p0}, Lb/c/a/e/f/b/a;-><init>(Lb/c/a/e/f/b/e;)V

    invoke-virtual {v1, p1}, Landroid/view/GestureDetector;->setOnDoubleTapListener(Landroid/view/GestureDetector$OnDoubleTapListener;)V

    .line 5
    iput-boolean v0, p0, Lb/c/a/e/f/b/e;->C:Z

    invoke-virtual {p0}, Lb/c/a/e/f/b/e;->s()V

    return-void
.end method

.method public static d(FFF)V
    .locals 0

    cmpl-float p0, p0, p1

    if-gez p0, :cond_1

    cmpl-float p0, p1, p2

    if-gez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static p(Landroid/widget/ImageView;)V
    .locals 2

    if-eqz p0, :cond_0

    instance-of v0, p0, Lb/c/a/e/f/b/b;

    if-nez v0, :cond_0

    sget-object v0, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView$ScaleType;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lb/c/a/e/f/b/e;->A:Lb/c/a/e/f/b/e$c;

    if-eqz v0, :cond_0

    .line 1
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v0, Lb/c/a/e/f/b/e$c;->b:Lb/c/a/e/f/b/g/c;

    const/4 v1, 0x1

    check-cast v0, Lb/c/a/e/f/b/g/a;

    .line 2
    iget-object v0, v0, Lb/c/a/e/f/b/g/a;->a:Landroid/widget/OverScroller;

    invoke-virtual {v0, v1}, Landroid/widget/OverScroller;->forceFinished(Z)V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lb/c/a/e/f/b/e;->A:Lb/c/a/e/f/b/e$c;

    :cond_0
    return-void
.end method

.method public final b()V
    .locals 1

    invoke-virtual {p0}, Lb/c/a/e/f/b/e;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lb/c/a/e/f/b/e;->h()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {p0, v0}, Lb/c/a/e/f/b/e;->o(Landroid/graphics/Matrix;)V

    :cond_0
    return-void
.end method

.method public final c()Z
    .locals 12

    invoke-virtual {p0}, Lb/c/a/e/f/b/e;->i()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Lb/c/a/e/f/b/e;->h()Landroid/graphics/Matrix;

    move-result-object v2

    invoke-virtual {p0, v2}, Lb/c/a/e/f/b/e;->g(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    move-result-object v2

    if-nez v2, :cond_1

    return v1

    :cond_1
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v3

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v4

    invoke-virtual {p0, v0}, Lb/c/a/e/f/b/e;->j(Landroid/widget/ImageView;)I

    move-result v5

    int-to-float v5, v5

    cmpg-float v6, v3, v5

    const/high16 v7, 0x40000000    # 2.0f

    const/4 v8, 0x3

    const/4 v9, 0x2

    const/4 v10, 0x0

    if-gtz v6, :cond_4

    sget-object v6, Lb/c/a/e/f/b/e$a;->a:[I

    iget-object v11, p0, Lb/c/a/e/f/b/e;->D:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v11}, Landroid/widget/ImageView$ScaleType;->ordinal()I

    move-result v11

    aget v6, v6, v11

    if-eq v6, v9, :cond_3

    sub-float/2addr v5, v3

    if-eq v6, v8, :cond_2

    div-float/2addr v5, v7

    :cond_2
    iget v3, v2, Landroid/graphics/RectF;->top:F

    :goto_0
    sub-float/2addr v5, v3

    goto :goto_2

    :cond_3
    iget v3, v2, Landroid/graphics/RectF;->top:F

    goto :goto_1

    :cond_4
    iget v3, v2, Landroid/graphics/RectF;->top:F

    cmpl-float v6, v3, v10

    if-lez v6, :cond_5

    :goto_1
    neg-float v5, v3

    goto :goto_2

    :cond_5
    iget v3, v2, Landroid/graphics/RectF;->bottom:F

    cmpg-float v6, v3, v5

    if-gez v6, :cond_6

    goto :goto_0

    :cond_6
    move v5, v10

    :goto_2
    invoke-virtual {p0, v0}, Lb/c/a/e/f/b/e;->k(Landroid/widget/ImageView;)I

    move-result v0

    int-to-float v0, v0

    cmpg-float v3, v4, v0

    const/4 v6, 0x1

    if-gtz v3, :cond_9

    sget-object v1, Lb/c/a/e/f/b/e$a;->a:[I

    iget-object v3, p0, Lb/c/a/e/f/b/e;->D:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v3}, Landroid/widget/ImageView$ScaleType;->ordinal()I

    move-result v3

    aget v1, v1, v3

    if-eq v1, v9, :cond_8

    sub-float/2addr v0, v4

    if-eq v1, v8, :cond_7

    div-float/2addr v0, v7

    :cond_7
    iget v1, v2, Landroid/graphics/RectF;->left:F

    sub-float/2addr v0, v1

    goto :goto_3

    :cond_8
    iget v0, v2, Landroid/graphics/RectF;->left:F

    neg-float v0, v0

    :goto_3
    move v10, v0

    iput v9, p0, Lb/c/a/e/f/b/e;->B:I

    goto :goto_4

    :cond_9
    iget v3, v2, Landroid/graphics/RectF;->left:F

    cmpl-float v4, v3, v10

    if-lez v4, :cond_a

    iput v1, p0, Lb/c/a/e/f/b/e;->B:I

    neg-float v10, v3

    goto :goto_4

    :cond_a
    iget v1, v2, Landroid/graphics/RectF;->right:F

    cmpg-float v2, v1, v0

    if-gez v2, :cond_b

    sub-float v10, v0, v1

    iput v6, p0, Lb/c/a/e/f/b/e;->B:I

    goto :goto_4

    :cond_b
    const/4 v0, -0x1

    iput v0, p0, Lb/c/a/e/f/b/e;->B:I

    :goto_4
    iget-object v0, p0, Lb/c/a/e/f/b/e;->n:Landroid/graphics/Matrix;

    invoke-virtual {v0, v10, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    return v6
.end method

.method public e()V
    .locals 4

    iget-object v0, p0, Lb/c/a/e/f/b/e;->i:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/widget/ImageView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_1
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    invoke-virtual {p0}, Lb/c/a/e/f/b/e;->a()V

    :cond_2
    iget-object v0, p0, Lb/c/a/e/f/b/e;->j:Landroid/view/GestureDetector;

    if-eqz v0, :cond_3

    invoke-virtual {v0, v1}, Landroid/view/GestureDetector;->setOnDoubleTapListener(Landroid/view/GestureDetector$OnDoubleTapListener;)V

    :cond_3
    iput-object v1, p0, Lb/c/a/e/f/b/e;->q:Lb/c/a/e/f/b/e$d;

    iput-object v1, p0, Lb/c/a/e/f/b/e;->r:Lb/c/a/e/f/b/e$e;

    iput-object v1, p0, Lb/c/a/e/f/b/e;->s:Lb/c/a/e/f/b/e$h;

    iput-object v1, p0, Lb/c/a/e/f/b/e;->t:Landroid/view/View$OnLongClickListener;

    iput-object v1, p0, Lb/c/a/e/f/b/e;->u:Lb/c/a/e/f/b/e$f;

    iput-object v1, p0, Lb/c/a/e/f/b/e;->v:Lb/c/a/e/f/b/e$g;

    iput-object v1, p0, Lb/c/a/e/f/b/e;->i:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public f()Landroid/graphics/RectF;
    .locals 1

    invoke-virtual {p0}, Lb/c/a/e/f/b/e;->c()Z

    invoke-virtual {p0}, Lb/c/a/e/f/b/e;->h()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {p0, v0}, Lb/c/a/e/f/b/e;->g(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    move-result-object v0

    return-object v0
.end method

.method public final g(Landroid/graphics/Matrix;)Landroid/graphics/RectF;
    .locals 4

    invoke-virtual {p0}, Lb/c/a/e/f/b/e;->i()Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lb/c/a/e/f/b/e;->o:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    int-to-float v0, v0

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v3, v2, v0}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v0, p0, Lb/c/a/e/f/b/e;->o:Landroid/graphics/RectF;

    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    iget-object p1, p0, Lb/c/a/e/f/b/e;->o:Landroid/graphics/RectF;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final h()Landroid/graphics/Matrix;
    .locals 2

    iget-object v0, p0, Lb/c/a/e/f/b/e;->m:Landroid/graphics/Matrix;

    iget-object v1, p0, Lb/c/a/e/f/b/e;->l:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    iget-object v0, p0, Lb/c/a/e/f/b/e;->m:Landroid/graphics/Matrix;

    iget-object v1, p0, Lb/c/a/e/f/b/e;->n:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    iget-object v0, p0, Lb/c/a/e/f/b/e;->m:Landroid/graphics/Matrix;

    return-object v0
.end method

.method public i()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lb/c/a/e/f/b/e;->i:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    invoke-virtual {p0}, Lb/c/a/e/f/b/e;->e()V

    :cond_1
    return-object v0
.end method

.method public final j(Landroid/widget/ImageView;)I
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, Landroid/widget/ImageView;->getHeight()I

    move-result v0

    invoke-virtual {p1}, Landroid/widget/ImageView;->getPaddingTop()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p1}, Landroid/widget/ImageView;->getPaddingBottom()I

    move-result p1

    sub-int/2addr v0, p1

    return v0
.end method

.method public final k(Landroid/widget/ImageView;)I
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, Landroid/widget/ImageView;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/widget/ImageView;->getPaddingLeft()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p1}, Landroid/widget/ImageView;->getPaddingRight()I

    move-result p1

    sub-int/2addr v0, p1

    return v0
.end method

.method public l()F
    .locals 6

    iget-object v0, p0, Lb/c/a/e/f/b/e;->n:Landroid/graphics/Matrix;

    .line 1
    iget-object v1, p0, Lb/c/a/e/f/b/e;->p:[F

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->getValues([F)V

    iget-object v0, p0, Lb/c/a/e/f/b/e;->p:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    float-to-double v0, v0

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    .line 2
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    double-to-float v0, v0

    iget-object v1, p0, Lb/c/a/e/f/b/e;->n:Landroid/graphics/Matrix;

    .line 3
    iget-object v4, p0, Lb/c/a/e/f/b/e;->p:[F

    invoke-virtual {v1, v4}, Landroid/graphics/Matrix;->getValues([F)V

    iget-object v1, p0, Lb/c/a/e/f/b/e;->p:[F

    const/4 v4, 0x3

    aget v1, v1, v4

    float-to-double v4, v1

    .line 4
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    double-to-float v1, v1

    add-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    return v0
.end method

.method public m(FFF)V
    .locals 3

    sget-boolean v0, Lb/c/a/e/f/b/e;->E:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    aput-object v2, v0, v1

    const-string v1, "onScale: scale: %.2f. fX: %.2f. fY: %.2f"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    invoke-virtual {p0}, Lb/c/a/e/f/b/e;->l()F

    move-result v0

    iget v1, p0, Lb/c/a/e/f/b/e;->f:F

    cmpg-float v0, v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    if-ltz v0, :cond_1

    cmpg-float v0, p1, v1

    if-gez v0, :cond_4

    :cond_1
    invoke-virtual {p0}, Lb/c/a/e/f/b/e;->l()F

    move-result v0

    iget v2, p0, Lb/c/a/e/f/b/e;->d:F

    cmpl-float v0, v0, v2

    if-gtz v0, :cond_2

    cmpl-float v0, p1, v1

    if-lez v0, :cond_4

    :cond_2
    iget-object v0, p0, Lb/c/a/e/f/b/e;->u:Lb/c/a/e/f/b/e$f;

    if-eqz v0, :cond_3

    invoke-interface {v0, p1, p2, p3}, Lb/c/a/e/f/b/e$f;->a(FFF)V

    :cond_3
    iget-object v0, p0, Lb/c/a/e/f/b/e;->n:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1, p1, p2, p3}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    invoke-virtual {p0}, Lb/c/a/e/f/b/e;->b()V

    :cond_4
    return-void
.end method

.method public n()V
    .locals 2

    iget-object v0, p0, Lb/c/a/e/f/b/e;->n:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 1
    iget-object v0, p0, Lb/c/a/e/f/b/e;->n:Landroid/graphics/Matrix;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postRotate(F)Z

    invoke-virtual {p0}, Lb/c/a/e/f/b/e;->b()V

    .line 2
    invoke-virtual {p0}, Lb/c/a/e/f/b/e;->h()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {p0, v0}, Lb/c/a/e/f/b/e;->o(Landroid/graphics/Matrix;)V

    invoke-virtual {p0}, Lb/c/a/e/f/b/e;->c()Z

    return-void
.end method

.method public final o(Landroid/graphics/Matrix;)V
    .locals 3

    invoke-virtual {p0}, Lb/c/a/e/f/b/e;->i()Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 1
    invoke-virtual {p0}, Lb/c/a/e/f/b/e;->i()Landroid/widget/ImageView;

    move-result-object v1

    if-eqz v1, :cond_1

    instance-of v2, v1, Lb/c/a/e/f/b/b;

    if-nez v2, :cond_1

    sget-object v2, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/ImageView$ScaleType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "The ImageView\'s ScaleType has been changed since attaching a PhotoViewAttacher. You should call setScaleType on the PhotoViewAttacher instead of on the ImageView"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 2
    :cond_1
    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    iget-object v0, p0, Lb/c/a/e/f/b/e;->q:Lb/c/a/e/f/b/e$d;

    if-eqz v0, :cond_2

    invoke-virtual {p0, p1}, Lb/c/a/e/f/b/e;->g(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v0, p0, Lb/c/a/e/f/b/e;->q:Lb/c/a/e/f/b/e$d;

    invoke-interface {v0, p1}, Lb/c/a/e/f/b/e$d;->a(Landroid/graphics/RectF;)V

    :cond_2
    return-void
.end method

.method public onGlobalLayout()V
    .locals 6

    invoke-virtual {p0}, Lb/c/a/e/f/b/e;->i()Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-boolean v1, p0, Lb/c/a/e/f/b/e;->C:Z

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/widget/ImageView;->getTop()I

    move-result v1

    invoke-virtual {v0}, Landroid/widget/ImageView;->getRight()I

    move-result v2

    invoke-virtual {v0}, Landroid/widget/ImageView;->getBottom()I

    move-result v3

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLeft()I

    move-result v4

    iget v5, p0, Lb/c/a/e/f/b/e;->w:I

    if-ne v1, v5, :cond_0

    iget v5, p0, Lb/c/a/e/f/b/e;->y:I

    if-ne v3, v5, :cond_0

    iget v5, p0, Lb/c/a/e/f/b/e;->z:I

    if-ne v4, v5, :cond_0

    iget v5, p0, Lb/c/a/e/f/b/e;->x:I

    if-eq v2, v5, :cond_2

    :cond_0
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lb/c/a/e/f/b/e;->t(Landroid/graphics/drawable/Drawable;)V

    iput v1, p0, Lb/c/a/e/f/b/e;->w:I

    iput v2, p0, Lb/c/a/e/f/b/e;->x:I

    iput v3, p0, Lb/c/a/e/f/b/e;->y:I

    iput v4, p0, Lb/c/a/e/f/b/e;->z:I

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lb/c/a/e/f/b/e;->t(Landroid/graphics/drawable/Drawable;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 10
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    iget-boolean v0, p0, Lb/c/a/e/f/b/e;->C:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_9

    move-object v0, p1

    check-cast v0, Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 1
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_9

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    if-eqz v3, :cond_2

    if-eq v3, v2, :cond_1

    const/4 v0, 0x3

    if-eq v3, v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lb/c/a/e/f/b/e;->l()F

    move-result v0

    iget v3, p0, Lb/c/a/e/f/b/e;->d:F

    cmpg-float v0, v0, v3

    if-gez v0, :cond_4

    invoke-virtual {p0}, Lb/c/a/e/f/b/e;->f()Landroid/graphics/RectF;

    move-result-object v0

    if-eqz v0, :cond_4

    new-instance v9, Lb/c/a/e/f/b/e$b;

    invoke-virtual {p0}, Lb/c/a/e/f/b/e;->l()F

    move-result v5

    iget v6, p0, Lb/c/a/e/f/b/e;->d:F

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v7

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerY()F

    move-result v8

    move-object v3, v9

    move-object v4, p0

    invoke-direct/range {v3 .. v8}, Lb/c/a/e/f/b/e$b;-><init>(Lb/c/a/e/f/b/e;FFFF)V

    invoke-virtual {p1, v9}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    move p1, v2

    goto :goto_2

    :cond_2
    if-eqz v0, :cond_3

    invoke-interface {v0, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_3
    invoke-virtual {p0}, Lb/c/a/e/f/b/e;->a()V

    :cond_4
    :goto_1
    move p1, v1

    :goto_2
    iget-object v0, p0, Lb/c/a/e/f/b/e;->k:Lb/c/a/e/f/b/f/a;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lb/c/a/e/f/b/f/a;->c()Z

    move-result p1

    iget-object v0, p0, Lb/c/a/e/f/b/e;->k:Lb/c/a/e/f/b/f/a;

    .line 3
    iget-boolean v3, v0, Lb/c/a/e/f/b/f/a;->g:Z

    .line 4
    invoke-virtual {v0, p2}, Lb/c/a/e/f/b/f/a;->d(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez p1, :cond_5

    iget-object p1, p0, Lb/c/a/e/f/b/e;->k:Lb/c/a/e/f/b/f/a;

    invoke-virtual {p1}, Lb/c/a/e/f/b/f/a;->c()Z

    move-result p1

    if-nez p1, :cond_5

    move p1, v2

    goto :goto_3

    :cond_5
    move p1, v1

    :goto_3
    if-nez v3, :cond_6

    iget-object v3, p0, Lb/c/a/e/f/b/e;->k:Lb/c/a/e/f/b/f/a;

    .line 5
    iget-boolean v3, v3, Lb/c/a/e/f/b/f/a;->g:Z

    if-nez v3, :cond_6

    move v3, v2

    goto :goto_4

    :cond_6
    move v3, v1

    :goto_4
    if-eqz p1, :cond_7

    if-eqz v3, :cond_7

    move v1, v2

    .line 6
    :cond_7
    iput-boolean v1, p0, Lb/c/a/e/f/b/e;->h:Z

    move v1, v0

    goto :goto_5

    :cond_8
    move v1, p1

    :goto_5
    iget-object p1, p0, Lb/c/a/e/f/b/e;->j:Landroid/view/GestureDetector;

    if-eqz p1, :cond_9

    invoke-virtual {p1, p2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_9

    move v1, v2

    :cond_9
    return v1
.end method

.method public q(FFFZ)V
    .locals 8

    invoke-virtual {p0}, Lb/c/a/e/f/b/e;->i()Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_2

    iget v1, p0, Lb/c/a/e/f/b/e;->d:F

    cmpg-float v1, p1, v1

    if-ltz v1, :cond_2

    iget v1, p0, Lb/c/a/e/f/b/e;->f:F

    cmpl-float v1, p1, v1

    if-lez v1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p4, :cond_1

    new-instance p4, Lb/c/a/e/f/b/e$b;

    invoke-virtual {p0}, Lb/c/a/e/f/b/e;->l()F

    move-result v4

    move-object v2, p4

    move-object v3, p0

    move v5, p1

    move v6, p2

    move v7, p3

    invoke-direct/range {v2 .. v7}, Lb/c/a/e/f/b/e$b;-><init>(Lb/c/a/e/f/b/e;FFFF)V

    invoke-virtual {v0, p4}, Landroid/widget/ImageView;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_1
    iget-object p4, p0, Lb/c/a/e/f/b/e;->n:Landroid/graphics/Matrix;

    invoke-virtual {p4, p1, p1, p2, p3}, Landroid/graphics/Matrix;->setScale(FFFF)V

    invoke-virtual {p0}, Lb/c/a/e/f/b/e;->b()V

    :cond_2
    :goto_0
    return-void
.end method

.method public r(FZ)V
    .locals 3

    invoke-virtual {p0}, Lb/c/a/e/f/b/e;->i()Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getRight()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    invoke-virtual {v0}, Landroid/widget/ImageView;->getBottom()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, v2

    invoke-virtual {p0, p1, v1, v0, p2}, Lb/c/a/e/f/b/e;->q(FFFZ)V

    :cond_0
    return-void
.end method

.method public s()V
    .locals 2

    invoke-virtual {p0}, Lb/c/a/e/f/b/e;->i()Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Lb/c/a/e/f/b/e;->C:Z

    if-eqz v1, :cond_0

    invoke-static {v0}, Lb/c/a/e/f/b/e;->p(Landroid/widget/ImageView;)V

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lb/c/a/e/f/b/e;->t(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lb/c/a/e/f/b/e;->n()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final t(Landroid/graphics/drawable/Drawable;)V
    .locals 8

    invoke-virtual {p0}, Lb/c/a/e/f/b/e;->i()Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_9

    if-nez p1, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p0, v0}, Lb/c/a/e/f/b/e;->k(Landroid/widget/ImageView;)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p0, v0}, Lb/c/a/e/f/b/e;->j(Landroid/widget/ImageView;)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result p1

    iget-object v3, p0, Lb/c/a/e/f/b/e;->l:Landroid/graphics/Matrix;

    invoke-virtual {v3}, Landroid/graphics/Matrix;->reset()V

    int-to-float v2, v2

    div-float v3, v1, v2

    int-to-float p1, p1

    div-float v4, v0, p1

    iget-object v5, p0, Lb/c/a/e/f/b/e;->D:Landroid/widget/ImageView$ScaleType;

    sget-object v6, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    const/high16 v7, 0x40000000    # 2.0f

    if-ne v5, v6, :cond_1

    iget-object v3, p0, Lb/c/a/e/f/b/e;->l:Landroid/graphics/Matrix;

    sub-float/2addr v1, v2

    div-float/2addr v1, v7

    sub-float/2addr v0, p1

    div-float/2addr v0, v7

    invoke-virtual {v3, v1, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    goto/16 :goto_2

    :cond_1
    sget-object v6, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    if-ne v5, v6, :cond_2

    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    move-result v3

    goto :goto_0

    :cond_2
    sget-object v6, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    if-ne v5, v6, :cond_3

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F

    move-result v3

    invoke-static {v5, v3}, Ljava/lang/Math;->min(FF)F

    move-result v3

    :goto_0
    iget-object v4, p0, Lb/c/a/e/f/b/e;->l:Landroid/graphics/Matrix;

    invoke-virtual {v4, v3, v3}, Landroid/graphics/Matrix;->postScale(FF)Z

    iget-object v4, p0, Lb/c/a/e/f/b/e;->l:Landroid/graphics/Matrix;

    mul-float/2addr v2, v3

    sub-float/2addr v1, v2

    div-float/2addr v1, v7

    mul-float/2addr p1, v3

    sub-float/2addr v0, p1

    div-float/2addr v0, v7

    invoke-virtual {v4, v1, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    goto :goto_2

    :cond_3
    new-instance v3, Landroid/graphics/RectF;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v4, v2, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    new-instance v5, Landroid/graphics/RectF;

    invoke-direct {v5, v4, v4, v1, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    float-to-int v0, v4

    rem-int/lit16 v0, v0, 0xb4

    if-eqz v0, :cond_4

    new-instance v3, Landroid/graphics/RectF;

    invoke-direct {v3, v4, v4, p1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    :cond_4
    sget-object p1, Lb/c/a/e/f/b/e$a;->a:[I

    iget-object v0, p0, Lb/c/a/e/f/b/e;->D:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0}, Landroid/widget/ImageView$ScaleType;->ordinal()I

    move-result v0

    aget p1, p1, v0

    const/4 v0, 0x2

    if-eq p1, v0, :cond_8

    const/4 v0, 0x3

    if-eq p1, v0, :cond_7

    const/4 v0, 0x4

    if-eq p1, v0, :cond_6

    const/4 v0, 0x5

    if-eq p1, v0, :cond_5

    goto :goto_2

    :cond_5
    iget-object p1, p0, Lb/c/a/e/f/b/e;->l:Landroid/graphics/Matrix;

    sget-object v0, Landroid/graphics/Matrix$ScaleToFit;->FILL:Landroid/graphics/Matrix$ScaleToFit;

    goto :goto_1

    :cond_6
    iget-object p1, p0, Lb/c/a/e/f/b/e;->l:Landroid/graphics/Matrix;

    sget-object v0, Landroid/graphics/Matrix$ScaleToFit;->CENTER:Landroid/graphics/Matrix$ScaleToFit;

    goto :goto_1

    :cond_7
    iget-object p1, p0, Lb/c/a/e/f/b/e;->l:Landroid/graphics/Matrix;

    sget-object v0, Landroid/graphics/Matrix$ScaleToFit;->END:Landroid/graphics/Matrix$ScaleToFit;

    goto :goto_1

    :cond_8
    iget-object p1, p0, Lb/c/a/e/f/b/e;->l:Landroid/graphics/Matrix;

    sget-object v0, Landroid/graphics/Matrix$ScaleToFit;->START:Landroid/graphics/Matrix$ScaleToFit;

    :goto_1
    invoke-virtual {p1, v3, v5, v0}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    :goto_2
    invoke-virtual {p0}, Lb/c/a/e/f/b/e;->n()V

    :cond_9
    :goto_3
    return-void
.end method
