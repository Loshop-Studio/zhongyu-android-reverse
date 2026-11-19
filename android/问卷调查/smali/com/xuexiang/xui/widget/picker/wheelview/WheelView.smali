.class public Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;
.super Landroid/view/View;
.source ""

# interfaces
.implements Lio/github/inflationx/calligraphy3/HasTypeface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$b;,
        Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$a;
    }
.end annotation


# instance fields
.field public A:F

.field public B:F

.field public C:F

.field public D:F

.field public E:I

.field public F:I

.field public G:I

.field public H:I

.field public I:I

.field public J:I

.field public K:I

.field public L:I

.field public M:F

.field public N:J

.field public O:I

.field public P:I

.field public Q:I

.field public R:I

.field public S:F

.field public b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$b;

.field public c:Landroid/content/Context;

.field public d:Landroid/os/Handler;

.field public e:Landroid/view/GestureDetector;

.field public f:Lb/c/a/e/g/a/d/b;

.field public g:Z

.field public h:Z

.field public i:Ljava/util/concurrent/ScheduledExecutorService;

.field public j:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field public k:Landroid/text/TextPaint;

.field public l:Landroid/text/TextPaint;

.field public m:Landroid/graphics/Paint;

.field public n:Lb/c/a/e/g/a/b/a;

.field public o:Ljava/lang/String;

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:F

.field public u:Landroid/graphics/Typeface;

.field public v:I

.field public w:I

.field public x:I

.field public y:F

.field public z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->g:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->h:Z

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v2

    iput-object v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->i:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v2, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    iput-object v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->u:Landroid/graphics/Typeface;

    const v2, 0x3fcccccd    # 1.6f

    iput v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->y:F

    const/16 v2, 0xb

    iput v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->H:I

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->L:I

    const/4 v2, 0x0

    iput v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->M:F

    const-wide/16 v3, 0x0

    iput-wide v3, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->N:J

    const/16 v3, 0x11

    iput v3, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->P:I

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->Q:I

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->R:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0700e5

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->p:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    const/high16 v5, 0x3f800000    # 1.0f

    cmpg-float v6, v4, v5

    if-gez v6, :cond_0

    const v4, 0x4019999a    # 2.4f

    :goto_0
    iput v4, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->S:F

    goto :goto_1

    :cond_0
    cmpg-float v5, v5, v4

    const/high16 v6, 0x3fc00000    # 1.5f

    if-gtz v5, :cond_1

    cmpg-float v5, v4, v6

    if-gez v5, :cond_1

    const v4, 0x40666666    # 3.6f

    goto :goto_0

    :cond_1
    cmpg-float v5, v6, v4

    const/high16 v6, 0x40000000    # 2.0f

    if-gtz v5, :cond_2

    cmpg-float v5, v4, v6

    if-gez v5, :cond_2

    const/high16 v4, 0x40900000    # 4.5f

    goto :goto_0

    :cond_2
    cmpg-float v5, v6, v4

    const/high16 v6, 0x40400000    # 3.0f

    if-gtz v5, :cond_3

    cmpg-float v5, v4, v6

    if-gez v5, :cond_3

    const/high16 v4, 0x40c00000    # 6.0f

    goto :goto_0

    :cond_3
    cmpl-float v5, v4, v6

    if-ltz v5, :cond_4

    const/high16 v5, 0x40200000    # 2.5f

    mul-float/2addr v4, v5

    goto :goto_0

    :cond_4
    :goto_1
    if-eqz p2, :cond_5

    sget-object v4, Lb/c/a/b;->j:[I

    invoke-virtual {p1, p2, v4, v0, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    invoke-virtual {p2, v1, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    iput v3, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->P:I

    const/4 v3, 0x4

    const v4, -0x575758

    invoke-virtual {p2, v3, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    iput v3, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->v:I

    const/4 v3, 0x3

    const v4, -0xd5d5d6

    invoke-virtual {p2, v3, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    iput v3, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->w:I

    const v3, -0x2a2a2b

    invoke-virtual {p2, v0, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    iput v3, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->x:I

    const/4 v3, 0x5

    iget v4, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->p:I

    invoke-virtual {p2, v3, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    iput v3, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->p:I

    const/4 v3, 0x2

    iget v4, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->y:F

    invoke-virtual {p2, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->y:F

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    :cond_5
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->d()V

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->c:Landroid/content/Context;

    new-instance p2, Lb/c/a/e/g/a/e/b;

    invoke-direct {p2, p0}, Lb/c/a/e/g/a/e/b;-><init>(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->d:Landroid/os/Handler;

    new-instance p2, Landroid/view/GestureDetector;

    new-instance v3, Lb/c/a/e/g/a/d/a;

    invoke-direct {v3, p0}, Lb/c/a/e/g/a/d/a;-><init>(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V

    invoke-direct {p2, p1, v3}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->e:Landroid/view/GestureDetector;

    invoke-virtual {p2, v0}, Landroid/view/GestureDetector;->setIsLongpressEnabled(Z)V

    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->z:Z

    iput v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->D:F

    const/4 p1, -0x1

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->E:I

    .line 2
    new-instance p1, Landroid/text/TextPaint;

    invoke-direct {p1}, Landroid/text/TextPaint;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

    iget p2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->v:I

    invoke-virtual {p1, p2}, Landroid/text/TextPaint;->setColor(I)V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

    invoke-virtual {p1, v1}, Landroid/text/TextPaint;->setAntiAlias(Z)V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

    iget-object p2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->u:Landroid/graphics/Typeface;

    invoke-virtual {p1, p2}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

    iget p2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->p:I

    int-to-float p2, p2

    invoke-virtual {p1, p2}, Landroid/text/TextPaint;->setTextSize(F)V

    new-instance p1, Landroid/text/TextPaint;

    invoke-direct {p1}, Landroid/text/TextPaint;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:Landroid/text/TextPaint;

    iget p2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->w:I

    invoke-virtual {p1, p2}, Landroid/text/TextPaint;->setColor(I)V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:Landroid/text/TextPaint;

    invoke-virtual {p1, v1}, Landroid/text/TextPaint;->setAntiAlias(Z)V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:Landroid/text/TextPaint;

    const p2, 0x3f8ccccd    # 1.1f

    invoke-virtual {p1, p2}, Landroid/text/TextPaint;->setTextScaleX(F)V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:Landroid/text/TextPaint;

    iget-object p2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->u:Landroid/graphics/Typeface;

    invoke-virtual {p1, p2}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:Landroid/text/TextPaint;

    iget p2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->p:I

    int-to-float p2, p2

    invoke-virtual {p1, p2}, Landroid/text/TextPaint;->setTextSize(F)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:Landroid/graphics/Paint;

    iget p2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->x:I

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:Landroid/graphics/Paint;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    const/4 p1, 0x0

    invoke-virtual {p0, v1, p1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledFuture;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j:Ljava/util/concurrent/ScheduledFuture;

    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    if-nez p1, :cond_0

    const-string p1, ""

    return-object p1

    :cond_0
    instance-of v0, p1, Lb/c/a/e/g/a/c/a;

    if-eqz v0, :cond_1

    check-cast p1, Lb/c/a/e/g/a/c/a;

    invoke-interface {p1}, Lb/c/a/e/g/a/c/a;->a()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "%02d"

    invoke-static {v0, p1, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final c(I)I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:Lb/c/a/e/g/a/b/a;

    invoke-interface {v0}, Lb/c/a/e/g/a/b/a;->a()I

    move-result v0

    if-gez p1, :cond_0

    add-int/2addr v0, p1

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->c(I)I

    move-result p1

    goto :goto_0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    if-le p1, v0, :cond_1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:Lb/c/a/e/g/a/b/a;

    invoke-interface {v0}, Lb/c/a/e/g/a/b/a;->a()I

    move-result v0

    sub-int/2addr p1, v0

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->c(I)I

    move-result p1

    :cond_1
    :goto_0
    return p1
.end method

.method public final d()V
    .locals 3

    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->y:F

    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float v2, v0, v1

    if-gez v2, :cond_0

    :goto_0
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->y:F

    goto :goto_1

    :cond_0
    const/high16 v1, 0x40800000    # 4.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final e()V
    .locals 7

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:Lb/c/a/e/g/a/b/a;

    if-nez v0, :cond_0

    return-void

    .line 1
    :cond_0
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget-object v3, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:Lb/c/a/e/g/a/b/a;

    invoke-interface {v3}, Lb/c/a/e/g/a/b/a;->a()I

    move-result v3

    const/4 v4, 0x2

    if-ge v2, v3, :cond_2

    iget-object v3, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:Lb/c/a/e/g/a/b/a;

    invoke-interface {v3, v2}, Lb/c/a/e/g/a/b/a;->getItem(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    iget-object v5, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:Landroid/text/TextPaint;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    invoke-virtual {v5, v3, v1, v6, v0}, Landroid/text/TextPaint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v3

    iget v5, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->q:I

    if-le v3, v5, :cond_1

    iput v3, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->q:I

    :cond_1
    iget-object v3, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:Landroid/text/TextPaint;

    const-string v5, "\u661f\u671f"

    invoke-virtual {v3, v5, v1, v4, v0}, Landroid/text/TextPaint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v3

    add-int/2addr v3, v4

    iput v3, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->r:I

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->y:F

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->r:I

    int-to-float v2, v2

    mul-float/2addr v0, v2

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->t:F

    .line 2
    iget v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->H:I

    add-int/lit8 v2, v2, -0x1

    int-to-float v2, v2

    mul-float/2addr v0, v2

    float-to-int v0, v0

    mul-int/lit8 v2, v0, 0x2

    int-to-double v2, v2

    const-wide v5, 0x400921fb54442d18L    # Math.PI

    div-double/2addr v2, v5

    double-to-int v2, v2

    iput v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->I:I

    int-to-double v2, v0

    div-double/2addr v2, v5

    double-to-int v0, v2

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->K:I

    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->O:I

    invoke-static {v0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->J:I

    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->I:I

    int-to-float v2, v0

    iget v3, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->t:F

    sub-float/2addr v2, v3

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v2, v5

    iput v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->A:F

    int-to-float v0, v0

    add-float/2addr v0, v3

    div-float/2addr v0, v5

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->B:F

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->r:I

    int-to-float v2, v2

    sub-float/2addr v3, v2

    div-float/2addr v3, v5

    sub-float/2addr v0, v3

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->S:F

    sub-float/2addr v0, v2

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->C:F

    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->E:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_4

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->z:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:Lb/c/a/e/g/a/b/a;

    invoke-interface {v0}, Lb/c/a/e/g/a/b/a;->a()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    div-int/2addr v0, v4

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->E:I

    goto :goto_1

    :cond_3
    iput v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->E:I

    :cond_4
    :goto_1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->E:I

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->G:I

    return-void
.end method

.method public f(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$a;)V
    .locals 7

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->a()V

    sget-object v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$a;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$a;

    if-eq p1, v0, :cond_0

    sget-object v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$a;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$a;

    if-ne p1, v0, :cond_2

    :cond_0
    iget p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->D:F

    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->t:F

    rem-float/2addr p1, v0

    add-float/2addr p1, v0

    rem-float/2addr p1, v0

    float-to-int p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->L:I

    int-to-float v1, p1

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, v0, v2

    cmpl-float v2, v1, v2

    if-lez v2, :cond_1

    sub-float/2addr v0, v1

    float-to-int p1, v0

    goto :goto_0

    :cond_1
    neg-int p1, p1

    :goto_0
    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->L:I

    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->i:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lb/c/a/e/g/a/e/c;

    iget p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->L:I

    invoke-direct {v1, p0, p1}, Lb/c/a/e/g/a/e/c;-><init>(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;I)V

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0xa

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->j:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method public final getAdapter()Lb/c/a/e/g/a/b/a;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:Lb/c/a/e/g/a/b/a;

    return-object v0
.end method

.method public final getCurrentItem()I
    .locals 3

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:Lb/c/a/e/g/a/b/a;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->z:Z

    if-eqz v2, :cond_2

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->F:I

    if-ltz v2, :cond_1

    invoke-interface {v0}, Lb/c/a/e/g/a/b/a;->a()I

    move-result v0

    if-lt v2, v0, :cond_2

    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->F:I

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:Lb/c/a/e/g/a/b/a;

    invoke-interface {v2}, Lb/c/a/e/g/a/b/a;->a()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    :goto_0
    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:Lb/c/a/e/g/a/b/a;

    invoke-interface {v2}, Lb/c/a/e/g/a/b/a;->a()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0

    :cond_2
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->F:I

    goto :goto_0
.end method

.method public getHandler()Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->d:Landroid/os/Handler;

    return-object v0
.end method

.method public getInitPosition()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->E:I

    return v0
.end method

.method public getItemHeight()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->t:F

    return v0
.end method

.method public getItemsCount()I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:Lb/c/a/e/g/a/b/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lb/c/a/e/g/a/b/a;->a()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getTotalScrollY()F
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->D:F

    return v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:Lb/c/a/e/g/a/b/a;

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->E:I

    const/4 v8, 0x0

    invoke-static {v8, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:Lb/c/a/e/g/a/b/a;

    invoke-interface {v2}, Lb/c/a/e/g/a/b/a;->a()I

    move-result v2

    const/4 v9, 0x1

    sub-int/2addr v2, v9

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    iput v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->E:I

    iget v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->H:I

    new-array v10, v2, [Ljava/lang/Object;

    iget v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->D:F

    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->t:F

    div-float/2addr v2, v3

    float-to-int v2, v2

    :try_start_0
    iget-object v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:Lb/c/a/e/g/a/b/a;

    invoke-interface {v3}, Lb/c/a/e/g/a/b/a;->a()I

    move-result v3

    rem-int/2addr v2, v3

    add-int/2addr v1, v2

    iput v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->G:I
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->z:Z

    if-nez v1, :cond_2

    iget v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->G:I

    if-gez v1, :cond_1

    iput v8, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->G:I

    :cond_1
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->G:I

    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:Lb/c/a/e/g/a/b/a;

    invoke-interface {v2}, Lb/c/a/e/g/a/b/a;->a()I

    move-result v2

    sub-int/2addr v2, v9

    if-le v1, v2, :cond_4

    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:Lb/c/a/e/g/a/b/a;

    invoke-interface {v1}, Lb/c/a/e/g/a/b/a;->a()I

    move-result v1

    sub-int/2addr v1, v9

    goto :goto_0

    :cond_2
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->G:I

    if-gez v1, :cond_3

    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:Lb/c/a/e/g/a/b/a;

    invoke-interface {v1}, Lb/c/a/e/g/a/b/a;->a()I

    move-result v1

    iget v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->G:I

    add-int/2addr v1, v2

    iput v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->G:I

    :cond_3
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->G:I

    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:Lb/c/a/e/g/a/b/a;

    invoke-interface {v2}, Lb/c/a/e/g/a/b/a;->a()I

    move-result v2

    sub-int/2addr v2, v9

    if-le v1, v2, :cond_4

    iget v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->G:I

    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:Lb/c/a/e/g/a/b/a;

    invoke-interface {v2}, Lb/c/a/e/g/a/b/a;->a()I

    move-result v2

    sub-int/2addr v1, v2

    :goto_0
    iput v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->G:I

    :cond_4
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->D:F

    iget v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->t:F

    rem-float v11, v1, v2

    move v1, v8

    :goto_1
    iget v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->H:I

    const-string v12, ""

    if-ge v1, v2, :cond_8

    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->G:I

    div-int/lit8 v2, v2, 0x2

    sub-int/2addr v2, v1

    sub-int/2addr v3, v2

    iget-boolean v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->z:Z

    if-eqz v2, :cond_5

    invoke-virtual {v0, v3}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->c(I)I

    move-result v2

    iget-object v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:Lb/c/a/e/g/a/b/a;

    invoke-interface {v3, v2}, Lb/c/a/e/g/a/b/a;->getItem(I)Ljava/lang/Object;

    move-result-object v2

    aput-object v2, v10, v1

    goto :goto_2

    :cond_5
    if-gez v3, :cond_6

    aput-object v12, v10, v1

    goto :goto_2

    :cond_6
    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:Lb/c/a/e/g/a/b/a;

    invoke-interface {v2}, Lb/c/a/e/g/a/b/a;->a()I

    move-result v2

    sub-int/2addr v2, v9

    if-le v3, v2, :cond_7

    aput-object v12, v10, v1

    goto :goto_2

    :cond_7
    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:Lb/c/a/e/g/a/b/a;

    invoke-interface {v2, v3}, Lb/c/a/e/g/a/b/a;->getItem(I)Ljava/lang/Object;

    move-result-object v2

    aput-object v2, v10, v1

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_8
    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$b;

    sget-object v2, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$b;->c:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$b;

    const/4 v13, 0x0

    if-ne v1, v2, :cond_b

    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->o:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/high16 v2, 0x41400000    # 12.0f

    if-eqz v1, :cond_9

    iget v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->J:I

    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->q:I

    sub-int/2addr v1, v3

    int-to-float v1, v1

    const/high16 v3, 0x40000000    # 2.0f

    goto :goto_3

    :cond_9
    iget v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->J:I

    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->q:I

    sub-int/2addr v1, v3

    int-to-float v1, v1

    const/high16 v3, 0x40800000    # 4.0f

    :goto_3
    div-float/2addr v1, v3

    sub-float/2addr v1, v2

    cmpg-float v2, v1, v13

    if-gtz v2, :cond_a

    const/high16 v1, 0x41200000    # 10.0f

    :cond_a
    move v14, v1

    iget v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->J:I

    int-to-float v1, v1

    sub-float v15, v1, v14

    iget v5, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->A:F

    iget-object v6, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move v2, v14

    move v3, v5

    move v4, v15

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v5, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->B:F

    iget-object v6, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:Landroid/graphics/Paint;

    goto :goto_4

    :cond_b
    const/4 v2, 0x0

    iget v5, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->A:F

    iget v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->J:I

    int-to-float v4, v1

    iget-object v6, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move v3, v5

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v5, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->B:F

    iget v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->J:I

    int-to-float v4, v1

    iget-object v6, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    :goto_4
    move v3, v5

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget-object v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->o:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_e

    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->h:Z

    if-eqz v1, :cond_e

    iget v1, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->J:I

    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:Landroid/text/TextPaint;

    iget-object v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->o:Ljava/lang/String;

    if-eqz v3, :cond_c

    .line 1
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_c

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    new-array v5, v4, [F

    invoke-virtual {v2, v3, v5}, Landroid/graphics/Paint;->getTextWidths(Ljava/lang/String;[F)I

    move v2, v8

    move v3, v2

    :goto_5
    if-ge v2, v4, :cond_d

    aget v6, v5, v2

    float-to-double v14, v6

    invoke-static {v14, v15}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v14

    double-to-int v6, v14

    add-int/2addr v3, v6

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_c
    move v3, v8

    :cond_d
    sub-int/2addr v1, v3

    .line 2
    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->o:Ljava/lang/String;

    int-to-float v1, v1

    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->S:F

    sub-float/2addr v1, v3

    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->C:F

    iget-object v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:Landroid/text/TextPaint;

    invoke-virtual {v7, v2, v1, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_e
    move v1, v8

    :goto_6
    iget v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->H:I

    if-ge v1, v2, :cond_23

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    iget v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->t:F

    int-to-float v3, v1

    mul-float/2addr v2, v3

    sub-float/2addr v2, v11

    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->K:I

    int-to-float v3, v3

    div-float/2addr v2, v3

    float-to-double v2, v2

    const-wide v4, 0x4056800000000000L    # 90.0

    const-wide v14, 0x400921fb54442d18L    # Math.PI

    div-double v14, v2, v14

    const-wide v16, 0x4066800000000000L    # 180.0

    mul-double v14, v14, v16

    sub-double/2addr v4, v14

    double-to-float v4, v4

    const/high16 v5, 0x42b40000    # 90.0f

    cmpl-float v6, v4, v5

    if-gez v6, :cond_22

    const/high16 v6, -0x3d4c0000    # -90.0f

    cmpg-float v6, v4, v6

    if-gtz v6, :cond_f

    goto/16 :goto_18

    :cond_f
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v6

    div-float/2addr v6, v5

    float-to-double v5, v6

    const-wide v14, 0x400199999999999aL    # 2.2

    invoke-static {v5, v6, v14, v15}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v5

    double-to-float v5, v5

    iget-boolean v6, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->h:Z

    if-nez v6, :cond_10

    iget-object v6, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->o:Ljava/lang/String;

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_10

    aget-object v6, v10, v1

    invoke-virtual {v0, v6}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_10

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v14, v10, v1

    invoke-virtual {v0, v14}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v14, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->o:Ljava/lang/String;

    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    goto :goto_7

    :cond_10
    aget-object v6, v10, v1

    invoke-virtual {v0, v6}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 3
    :goto_7
    new-instance v14, Landroid/graphics/Rect;

    invoke-direct {v14}, Landroid/graphics/Rect;-><init>()V

    iget-object v15, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:Landroid/text/TextPaint;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v9

    invoke-virtual {v15, v6, v8, v9, v14}, Landroid/text/TextPaint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    invoke-virtual {v14}, Landroid/graphics/Rect;->width()I

    move-result v9

    iget v15, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->p:I

    :goto_8
    iget v13, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->J:I

    if-le v9, v13, :cond_11

    add-int/lit8 v15, v15, -0x1

    iget-object v9, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:Landroid/text/TextPaint;

    int-to-float v13, v15

    invoke-virtual {v9, v13}, Landroid/text/TextPaint;->setTextSize(F)V

    iget-object v9, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:Landroid/text/TextPaint;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v13

    invoke-virtual {v9, v6, v8, v13, v14}, Landroid/text/TextPaint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    invoke-virtual {v14}, Landroid/graphics/Rect;->width()I

    move-result v9

    goto :goto_8

    :cond_11
    iget-object v9, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

    int-to-float v13, v15

    invoke-virtual {v9, v13}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 4
    new-instance v9, Landroid/graphics/Rect;

    invoke-direct {v9}, Landroid/graphics/Rect;-><init>()V

    iget-object v13, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:Landroid/text/TextPaint;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v14

    invoke-virtual {v13, v6, v8, v14, v9}, Landroid/text/TextPaint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    iget v13, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->P:I

    const-wide/high16 v18, 0x3fe0000000000000L    # 0.5

    const/16 v14, 0x11

    const/4 v15, 0x5

    const/4 v8, 0x3

    if-eq v13, v8, :cond_16

    if-eq v13, v15, :cond_15

    if-eq v13, v14, :cond_12

    goto :goto_c

    :cond_12
    iget-boolean v13, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->g:Z

    if-nez v13, :cond_14

    iget-object v13, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->o:Ljava/lang/String;

    if-eqz v13, :cond_14

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_14

    iget-boolean v13, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->h:Z

    if-nez v13, :cond_13

    goto :goto_9

    :cond_13
    iget v13, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->J:I

    invoke-virtual {v9}, Landroid/graphics/Rect;->width()I

    move-result v9

    sub-int/2addr v13, v9

    int-to-double v14, v13

    const-wide/high16 v20, 0x3fd0000000000000L    # 0.25

    goto :goto_a

    :cond_14
    :goto_9
    iget v13, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->J:I

    invoke-virtual {v9}, Landroid/graphics/Rect;->width()I

    move-result v9

    sub-int/2addr v13, v9

    int-to-double v14, v13

    move-wide/from16 v20, v18

    :goto_a
    mul-double v14, v14, v20

    double-to-int v9, v14

    goto :goto_b

    :cond_15
    iget v13, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->J:I

    invoke-virtual {v9}, Landroid/graphics/Rect;->width()I

    move-result v9

    sub-int/2addr v13, v9

    iget v9, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->S:F

    float-to-int v9, v9

    sub-int v9, v13, v9

    :goto_b
    iput v9, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->Q:I

    :goto_c
    const/4 v9, 0x0

    goto :goto_d

    :cond_16
    const/4 v9, 0x0

    iput v9, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->Q:I

    .line 5
    :goto_d
    new-instance v13, Landroid/graphics/Rect;

    invoke-direct {v13}, Landroid/graphics/Rect;-><init>()V

    iget-object v14, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v15

    invoke-virtual {v14, v6, v9, v15, v13}, Landroid/text/TextPaint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    iget v9, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->P:I

    if-eq v9, v8, :cond_1b

    const/4 v8, 0x5

    if-eq v9, v8, :cond_1a

    const/16 v8, 0x11

    if-eq v9, v8, :cond_17

    goto :goto_11

    :cond_17
    iget-boolean v8, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->g:Z

    if-nez v8, :cond_19

    iget-object v8, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->o:Ljava/lang/String;

    if-eqz v8, :cond_19

    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_19

    iget-boolean v8, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->h:Z

    if-nez v8, :cond_18

    goto :goto_e

    :cond_18
    iget v8, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->J:I

    invoke-virtual {v13}, Landroid/graphics/Rect;->width()I

    move-result v9

    sub-int/2addr v8, v9

    int-to-double v8, v8

    const-wide/high16 v14, 0x3fd0000000000000L    # 0.25

    goto :goto_f

    :cond_19
    :goto_e
    iget v8, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->J:I

    invoke-virtual {v13}, Landroid/graphics/Rect;->width()I

    move-result v9

    sub-int/2addr v8, v9

    int-to-double v8, v8

    move-wide/from16 v14, v18

    :goto_f
    mul-double/2addr v8, v14

    double-to-int v8, v8

    goto :goto_10

    :cond_1a
    iget v8, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->J:I

    invoke-virtual {v13}, Landroid/graphics/Rect;->width()I

    move-result v9

    sub-int/2addr v8, v9

    iget v9, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->S:F

    float-to-int v9, v9

    sub-int/2addr v8, v9

    goto :goto_10

    :cond_1b
    const/4 v8, 0x0

    :goto_10
    iput v8, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->R:I

    .line 6
    :goto_11
    iget v8, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->K:I

    int-to-double v8, v8

    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v13

    iget v15, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->K:I

    move-object/from16 v18, v10

    move/from16 v19, v11

    int-to-double v10, v15

    mul-double/2addr v13, v10

    sub-double/2addr v8, v13

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v10

    iget v13, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->r:I

    int-to-double v13, v13

    mul-double/2addr v10, v13

    const-wide/high16 v13, 0x4000000000000000L    # 2.0

    div-double/2addr v10, v13

    sub-double/2addr v8, v10

    double-to-float v8, v8

    const/4 v9, 0x0

    invoke-virtual {v7, v9, v8}, Landroid/graphics/Canvas;->translate(FF)V

    iget v9, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->A:F

    cmpg-float v10, v8, v9

    const v11, 0x3f4ccccd    # 0.8f

    const/high16 v13, 0x3f800000    # 1.0f

    if-gtz v10, :cond_1c

    iget v10, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->r:I

    int-to-float v10, v10

    add-float/2addr v10, v8

    cmpl-float v10, v10, v9

    if-ltz v10, :cond_1c

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    iget v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->J:I

    int-to-float v4, v4

    iget v5, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->A:F

    sub-float/2addr v5, v8

    const/4 v9, 0x0

    invoke-virtual {v7, v9, v9, v4, v5}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    double-to-float v4, v4

    mul-float/2addr v4, v11

    invoke-virtual {v7, v13, v4}, Landroid/graphics/Canvas;->scale(FF)V

    iget v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->R:I

    int-to-float v4, v4

    iget v5, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->r:I

    int-to-float v5, v5

    iget-object v9, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

    invoke-virtual {v7, v6, v4, v5, v9}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    iget v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->A:F

    sub-float/2addr v4, v8

    iget v5, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->J:I

    int-to-float v5, v5

    iget v8, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->t:F

    float-to-int v8, v8

    int-to-float v8, v8

    const/4 v9, 0x0

    invoke-virtual {v7, v9, v4, v5, v8}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v2, v13

    invoke-virtual {v7, v13, v2}, Landroid/graphics/Canvas;->scale(FF)V

    iget v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->Q:I

    int-to-float v2, v2

    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->r:I

    int-to-float v3, v3

    iget v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->S:F

    sub-float/2addr v3, v4

    iget-object v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:Landroid/text/TextPaint;

    :goto_12
    invoke-virtual {v7, v6, v2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    :goto_13
    const/4 v8, 0x0

    const/4 v10, 0x0

    goto/16 :goto_17

    :cond_1c
    iget v10, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->B:F

    cmpg-float v14, v8, v10

    if-gtz v14, :cond_1d

    iget v14, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->r:I

    int-to-float v14, v14

    add-float/2addr v14, v8

    cmpl-float v14, v14, v10

    if-ltz v14, :cond_1d

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    iget v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->J:I

    int-to-float v4, v4

    iget v5, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->B:F

    sub-float/2addr v5, v8

    const/4 v9, 0x0

    invoke-virtual {v7, v9, v9, v4, v5}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    double-to-float v4, v4

    mul-float/2addr v4, v13

    invoke-virtual {v7, v13, v4}, Landroid/graphics/Canvas;->scale(FF)V

    iget v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->Q:I

    int-to-float v4, v4

    iget v5, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->r:I

    int-to-float v5, v5

    iget v9, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->S:F

    sub-float/2addr v5, v9

    iget-object v9, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:Landroid/text/TextPaint;

    invoke-virtual {v7, v6, v4, v5, v9}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    iget v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->B:F

    sub-float/2addr v4, v8

    iget v5, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->J:I

    int-to-float v5, v5

    iget v8, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->t:F

    float-to-int v8, v8

    int-to-float v8, v8

    const/4 v9, 0x0

    invoke-virtual {v7, v9, v4, v5, v8}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v2, v11

    invoke-virtual {v7, v13, v2}, Landroid/graphics/Canvas;->scale(FF)V

    iget v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->R:I

    int-to-float v2, v2

    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->r:I

    int-to-float v3, v3

    iget-object v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

    goto :goto_12

    :cond_1d
    cmpl-float v9, v8, v9

    if-ltz v9, :cond_1e

    iget v9, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->r:I

    int-to-float v14, v9

    add-float/2addr v14, v8

    cmpg-float v8, v14, v10

    if-gtz v8, :cond_1e

    int-to-float v2, v9

    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->S:F

    sub-float/2addr v2, v3

    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->Q:I

    int-to-float v3, v3

    iget-object v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:Landroid/text/TextPaint;

    invoke-virtual {v7, v6, v3, v2, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    iget v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->G:I

    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->H:I

    div-int/lit8 v3, v3, 0x2

    sub-int/2addr v3, v1

    sub-int/2addr v2, v3

    iput v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->F:I

    goto :goto_13

    :cond_1e
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    iget v8, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->J:I

    iget v9, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->t:F

    float-to-int v9, v9

    const/4 v10, 0x0

    invoke-virtual {v7, v10, v10, v8, v9}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v2, v11

    invoke-virtual {v7, v13, v2}, Landroid/graphics/Canvas;->scale(FF)V

    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->s:I

    const/4 v9, -0x1

    if-nez v3, :cond_1f

    move v3, v10

    :goto_14
    const/4 v8, 0x0

    goto :goto_15

    :cond_1f
    if-lez v3, :cond_20

    const/4 v3, 0x1

    goto :goto_14

    :cond_20
    move v3, v9

    goto :goto_14

    :goto_15
    cmpl-float v4, v4, v8

    if-lez v4, :cond_21

    goto :goto_16

    :cond_21
    const/4 v9, 0x1

    :goto_16
    mul-int/2addr v3, v9

    int-to-float v3, v3

    const/high16 v4, 0x3f000000    # 0.5f

    mul-float/2addr v3, v4

    mul-float/2addr v3, v5

    invoke-virtual {v2, v3}, Landroid/text/TextPaint;->setTextSkewX(F)V

    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

    sub-float/2addr v13, v5

    const/high16 v3, 0x437f0000    # 255.0f

    mul-float/2addr v13, v3

    float-to-int v3, v13

    invoke-virtual {v2, v3}, Landroid/text/TextPaint;->setAlpha(I)V

    iget v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->R:I

    int-to-float v2, v2

    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->s:I

    int-to-float v3, v3

    mul-float/2addr v3, v5

    add-float/2addr v3, v2

    iget v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->r:I

    int-to-float v2, v2

    iget-object v4, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

    invoke-virtual {v7, v6, v3, v2, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    :goto_17
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    iget-object v2, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:Landroid/text/TextPaint;

    iget v3, v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->p:I

    int-to-float v3, v3

    invoke-virtual {v2, v3}, Landroid/text/TextPaint;->setTextSize(F)V

    goto :goto_19

    :cond_22
    :goto_18
    move-object/from16 v18, v10

    move/from16 v19, v11

    move v10, v8

    move v8, v13

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    :goto_19
    add-int/lit8 v1, v1, 0x1

    move v13, v8

    move v8, v10

    move-object/from16 v10, v18

    move/from16 v11, v19

    const/4 v9, 0x1

    goto/16 :goto_6

    :cond_23
    return-void
.end method

.method public onMeasure(II)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->O:I

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->e()V

    iget p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->J:I

    iget p2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->I:I

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 9

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->e:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->E:I

    neg-int v1, v1

    int-to-float v1, v1

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->t:F

    mul-float/2addr v1, v2

    iget-object v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:Lb/c/a/e/g/a/b/a;

    invoke-interface {v2}, Lb/c/a/e/g/a/b/a;->a()I

    move-result v2

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    iget v4, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->E:I

    sub-int/2addr v2, v4

    int-to-float v2, v2

    iget v4, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->t:F

    mul-float/2addr v2, v4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_4

    const/4 v6, 0x2

    if-eq v4, v6, :cond_1

    if-nez v0, :cond_5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->K:I

    int-to-float v2, v1

    sub-float/2addr v2, v0

    int-to-float v0, v1

    div-float/2addr v2, v0

    float-to-double v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->acos(D)D

    move-result-wide v0

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->K:I

    int-to-double v7, v2

    mul-double/2addr v0, v7

    iget v2, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->t:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, v2, v4

    float-to-double v7, v4

    add-double/2addr v0, v7

    float-to-double v7, v2

    div-double/2addr v0, v7

    double-to-int v0, v0

    iget v1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->D:F

    rem-float/2addr v1, v2

    add-float/2addr v1, v2

    rem-float/2addr v1, v2

    iget v4, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->H:I

    div-int/2addr v4, v6

    sub-int/2addr v0, v4

    int-to-float v0, v0

    mul-float/2addr v0, v2

    sub-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->L:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v6, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->N:J

    sub-long/2addr v0, v6

    const-wide/16 v6, 0x78

    cmp-long v0, v0, v6

    if-lez v0, :cond_0

    sget-object v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$a;->d:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$a;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$a;->b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$a;

    :goto_0
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->f(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$a;)V

    goto :goto_1

    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->M:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v4

    sub-float/2addr v0, v4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v4

    iput v4, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->M:F

    iget v4, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->D:F

    add-float/2addr v4, v0

    iput v4, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->D:F

    iget-boolean v6, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->z:Z

    if-nez v6, :cond_5

    iget v6, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->t:F

    const/high16 v7, 0x3e800000    # 0.25f

    mul-float v8, v6, v7

    sub-float v8, v4, v8

    cmpg-float v1, v8, v1

    const/4 v8, 0x0

    if-gez v1, :cond_2

    cmpg-float v1, v0, v8

    if-ltz v1, :cond_3

    :cond_2
    mul-float/2addr v6, v7

    add-float/2addr v6, v4

    cmpl-float v1, v6, v2

    if-lez v1, :cond_5

    cmpl-float v1, v0, v8

    if-lez v1, :cond_5

    :cond_3
    sub-float/2addr v4, v0

    iput v4, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->D:F

    move v5, v3

    goto :goto_1

    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->N:J

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->a()V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->M:F

    :cond_5
    :goto_1
    if-nez v5, :cond_6

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_6
    return v3
.end method

.method public final setAdapter(Lb/c/a/e/g/a/b/a;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->n:Lb/c/a/e/g/a/b/a;

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->e()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setCurrentItem(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->F:I

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->E:I

    const/4 p1, 0x0

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->D:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setCyclic(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->z:Z

    return-void
.end method

.method public setDividerColor(I)V
    .locals 1

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->x:I

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->m:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public setDividerType(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$b;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->b:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$b;

    return-void
.end method

.method public setGravity(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->P:I

    return-void
.end method

.method public setIsOptions(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->g:Z

    return-void
.end method

.method public setLabel(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->o:Ljava/lang/String;

    return-void
.end method

.method public setLineSpacingMultiplier(F)V
    .locals 1

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->y:F

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->d()V

    :cond_0
    return-void
.end method

.method public final setOnItemSelectedListener(Lb/c/a/e/g/a/d/b;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->f:Lb/c/a/e/g/a/d/b;

    return-void
.end method

.method public setTextColorCenter(I)V
    .locals 1

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->w:I

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:Landroid/text/TextPaint;

    invoke-virtual {v0, p1}, Landroid/text/TextPaint;->setColor(I)V

    return-void
.end method

.method public setTextColorOut(I)V
    .locals 1

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->v:I

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

    invoke-virtual {v0, p1}, Landroid/text/TextPaint;->setColor(I)V

    return-void
.end method

.method public final setTextSize(F)V
    .locals 1

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v0, p1

    float-to-int p1, v0

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->p:I

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

    int-to-float p1, p1

    invoke-virtual {v0, p1}, Landroid/text/TextPaint;->setTextSize(F)V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:Landroid/text/TextPaint;

    iget v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->p:I

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setTextSize(F)V

    :cond_0
    return-void
.end method

.method public setTextXOffset(I)V
    .locals 1

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->s:I

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:Landroid/text/TextPaint;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setTextScaleX(F)V

    :cond_0
    return-void
.end method

.method public setTotalScrollY(F)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->D:F

    return-void
.end method

.method public final setTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->u:Landroid/graphics/Typeface;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->k:Landroid/text/TextPaint;

    invoke-virtual {v0, p1}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->l:Landroid/text/TextPaint;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->u:Landroid/graphics/Typeface;

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    return-void
.end method
