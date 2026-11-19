.class public Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;
.super Lb/c/a/e/f/b/c;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;,
        Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;,
        Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$e;,
        Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$f;,
        Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;
    }
.end annotation


# static fields
.field public static B:I = 0x190


# instance fields
.field public A:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

.field public f:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

.field public g:Landroid/graphics/Paint;

.field public h:Landroid/graphics/Matrix;

.field public i:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

.field public j:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

.field public k:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

.field public l:Landroid/graphics/Rect;

.field public m:Z

.field public n:I

.field public o:I

.field public p:Z

.field public q:Landroid/animation/ValueAnimator;

.field public r:F

.field public s:I

.field public t:I

.field public u:Z

.field public v:Z

.field public w:I

.field public x:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$e;

.field public y:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$f;

.field public z:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lb/c/a/e/f/b/c;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    sget-object p1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;->b:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    const/high16 p1, 0x3f000000    # 0.5f

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->r:F

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->u:Z

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->v:Z

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->w:I

    .line 1
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Landroid/graphics/Paint;

    const/high16 p2, -0x1000000

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h:Landroid/graphics/Matrix;

    sget-object p1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, p1}, Lb/c/a/e/f/b/c;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    return-void
.end method

.method public static setDuration(I)V
    .locals 0

    sput p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->B:I

    return-void
.end method


# virtual methods
.method public final d()V
    .locals 4

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->z:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->a()Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    move-result-object v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->z:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iget v1, v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->c:F

    invoke-virtual {p0}, Landroid/widget/ImageView;->getTop()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v1, v2

    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->c:F

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->z:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iget v1, v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->b:F

    invoke-virtual {p0}, Landroid/widget/ImageView;->getLeft()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v1, v2

    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->b:F

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->w:I

    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->f:I

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->z:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iget v1, v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->g:F

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {p0}, Landroid/widget/ImageView;->getScaleX()F

    move-result v3

    sub-float/2addr v2, v3

    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->z:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iget v3, v3, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->g:F

    mul-float/2addr v2, v3

    sub-float/2addr v1, v2

    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->g:F

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->a()Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    move-result-object v1

    iput-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->k:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->a()Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->j:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    :cond_0
    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 8

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    invoke-virtual {p0}, Lb/c/a/e/f/b/c;->getScale()F

    move-result v2

    const/high16 v3, 0x3f800000    # 1.0f

    cmpl-float v2, v2, v3

    const v4, 0x7f090120

    const/4 v5, 0x3

    const/4 v6, 0x1

    if-nez v2, :cond_e

    const/4 v2, 0x0

    if-eqz v1, :cond_b

    if-eq v1, v6, :cond_8

    const/4 v7, 0x2

    if-eq v1, v7, :cond_0

    if-eq v1, v5, :cond_8

    goto/16 :goto_3

    :cond_0
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->v:Z

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    if-ne v0, v6, :cond_1

    goto/16 :goto_3

    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    float-to-int v1, v1

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->s:I

    sub-int/2addr v0, v4

    iget v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->t:I

    sub-int/2addr v1, v4

    iget-boolean v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->u:Z

    if-nez v4, :cond_3

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v4

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v5

    if-gt v4, v5, :cond_2

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v4

    const/4 v5, 0x5

    if-ge v4, v5, :cond_3

    :cond_2
    move v4, v6

    goto :goto_0

    :cond_3
    move v4, v2

    :goto_0
    if-eqz v4, :cond_4

    invoke-super {p0, p1}, Landroid/widget/ImageView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_4
    iget-boolean v4, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->p:Z

    if-eqz v4, :cond_5

    invoke-super {p0, p1}, Landroid/widget/ImageView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v4

    if-ne v4, v6, :cond_12

    sget-object p1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;->e:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->offsetLeftAndRight(I)V

    invoke-virtual {p0, v1}, Landroid/widget/ImageView;->offsetTopAndBottom(I)V

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g()F

    move-result p1

    const v0, 0x3dcccccd    # 0.1f

    mul-float/2addr v0, p1

    sub-float v0, v3, v0

    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setScaleY(F)V

    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setScaleX(F)V

    iput-boolean v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->u:Z

    const/high16 v0, 0x437f0000    # 255.0f

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float/2addr p1, v1

    sub-float/2addr v3, p1

    mul-float/2addr v3, v0

    float-to-int p1, v3

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->w:I

    invoke-virtual {p0}, Landroid/widget/ImageView;->invalidate()V

    iget p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->w:I

    if-gez p1, :cond_6

    iput v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->w:I

    :cond_6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->x:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$e;

    if-eqz p1, :cond_7

    iget v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->w:I

    check-cast p1, Lb/c/a/e/f/c/e/e;

    invoke-virtual {p1, v0}, Lb/c/a/e/f/c/e/e;->a(I)V

    :cond_7
    return v6

    :cond_8
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->u:Z

    if-eqz v1, :cond_12

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g()F

    move-result p1

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->r:F

    cmpg-float p1, p1, v1

    if-gtz p1, :cond_9

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h()V

    goto :goto_1

    :cond_9
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->d()V

    invoke-virtual {p0, v4, v0}, Landroid/widget/ImageView;->setTag(ILjava/lang/Object;)V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->y:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$f;

    if-eqz p1, :cond_a

    check-cast p1, Lb/c/a/e/f/c/e/f;

    .line 1
    iget-object p1, p1, Lb/c/a/e/f/c/e/f;->a:Lb/c/a/e/f/c/e/h;

    invoke-static {p1}, Lb/c/a/e/f/c/e/h;->x0(Lb/c/a/e/f/c/e/h;)V

    :cond_a
    :goto_1
    return v6

    .line 2
    :cond_b
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->s:I

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->t:I

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->z:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    if-nez v0, :cond_c

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f()V

    :cond_c
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->v:Z

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->z:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    if-eqz v0, :cond_d

    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->c:F

    float-to-int v3, v1

    iget v0, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->e:F

    add-float/2addr v0, v1

    float-to-int v0, v0

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->t:I

    if-lt v1, v3, :cond_d

    if-lt v0, v1, :cond_d

    iput-boolean v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->v:Z

    :cond_d
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->u:Z

    goto :goto_3

    :cond_e
    if-eq v1, v6, :cond_f

    if-eq v1, v5, :cond_f

    goto :goto_3

    :cond_f
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->u:Z

    if-eqz v1, :cond_12

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g()F

    move-result p1

    iget v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->r:F

    cmpg-float p1, p1, v1

    if-gtz p1, :cond_10

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h()V

    goto :goto_2

    :cond_10
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->d()V

    invoke-virtual {p0, v4, v0}, Landroid/widget/ImageView;->setTag(ILjava/lang/Object;)V

    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->y:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$f;

    if-eqz p1, :cond_11

    check-cast p1, Lb/c/a/e/f/c/e/f;

    .line 3
    iget-object p1, p1, Lb/c/a/e/f/c/e/f;->a:Lb/c/a/e/f/c/e/h;

    invoke-static {p1}, Lb/c/a/e/f/c/e/h;->x0(Lb/c/a/e/f/c/e/h;)V

    :cond_11
    :goto_2
    return v6

    .line 4
    :cond_12
    :goto_3
    invoke-super {p0, p1}, Landroid/widget/ImageView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public e()Z
    .locals 3

    invoke-virtual {p0}, Lb/c/a/e/f/b/c;->getScale()F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    .line 1
    iget-object v0, p0, Lb/c/a/e/f/b/c;->d:Lb/c/a/e/f/b/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1, v2}, Lb/c/a/e/f/b/e;->r(FZ)V

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    return v2
.end method

.method public final f()V
    .locals 8

    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->j:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->k:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    if-eqz v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0}, Landroid/widget/ImageView;->getWidth()I

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p0}, Landroid/widget/ImageView;->getHeight()I

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_3

    :cond_2
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v0, v0, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v0, v0, Landroid/graphics/drawable/ColorDrawable;

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/ColorDrawable;->getIntrinsicWidth()I

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->n:I

    invoke-virtual {v0}, Landroid/graphics/drawable/ColorDrawable;->getIntrinsicHeight()I

    move-result v0

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    :goto_0
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    iput v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->n:I

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    :goto_1
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->o:I

    new-instance v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$a;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    const/4 v2, 0x0

    iput v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->f:I

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->l:Landroid/graphics/Rect;

    if-nez v0, :cond_5

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->l:Landroid/graphics/Rect;

    :cond_5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->l:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    int-to-float v4, v4

    iput v4, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->b:F

    iget v3, v3, Landroid/graphics/Rect;->top:I

    .line 1
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v4

    const-string v5, "status_bar_height"

    const-string v6, "dimen"

    const-string v7, "android"

    .line 2
    invoke-virtual {v4, v5, v6, v7}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v5

    if-lez v5, :cond_6

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    :cond_6
    sub-int/2addr v3, v2

    int-to-float v2, v3

    .line 3
    iput v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->c:F

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->l:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-float v2, v2

    iput v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->d:F

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->l:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    int-to-float v2, v2

    iput v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->e:F

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->l:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-float v0, v0

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->n:I

    int-to-float v2, v2

    div-float/2addr v0, v2

    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->l:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    int-to-float v2, v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->o:I

    int-to-float v3, v3

    div-float/2addr v2, v3

    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iput v0, v3, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->g:F

    invoke-virtual {p0}, Landroid/widget/ImageView;->getWidth()I

    move-result v0

    int-to-float v0, v0

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->n:I

    int-to-float v2, v2

    div-float/2addr v0, v2

    invoke-virtual {p0}, Landroid/widget/ImageView;->getHeight()I

    move-result v2

    int-to-float v2, v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->o:I

    int-to-float v3, v3

    div-float/2addr v2, v3

    new-instance v3, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    invoke-direct {v3, v1}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$a;)V

    iput-object v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->j:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    invoke-static {v0, v2}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, v3, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->g:F

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->j:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    const/16 v1, 0xff

    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->f:I

    iget v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->g:F

    iget v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->n:I

    int-to-float v2, v2

    mul-float/2addr v2, v1

    float-to-int v2, v2

    iget v3, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->o:I

    int-to-float v3, v3

    mul-float/2addr v1, v3

    float-to-int v1, v1

    invoke-virtual {p0}, Landroid/widget/ImageView;->getWidth()I

    move-result v3

    sub-int/2addr v3, v2

    int-to-float v3, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    iput v3, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->b:F

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->j:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    invoke-virtual {p0}, Landroid/widget/ImageView;->getHeight()I

    move-result v3

    sub-int/2addr v3, v1

    int-to-float v3, v3

    div-float/2addr v3, v4

    iput v3, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->c:F

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->j:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    int-to-float v2, v2

    iput v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->d:F

    int-to-float v1, v1

    iput v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->e:F

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    sget-object v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    if-ne v1, v2, :cond_7

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    goto :goto_2

    :cond_7
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;->d:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    if-ne v1, v2, :cond_8

    :goto_2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->a()Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->k:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    :cond_8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->j:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->z:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    :cond_9
    :goto_3
    return-void
.end method

.method public final g()F
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->z:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f()V

    :cond_0
    invoke-virtual {p0}, Landroid/widget/ImageView;->getTop()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->z:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iget v1, v1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->e:F

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    return v0
.end method

.method public final h()V
    .locals 10

    const/4 v0, 0x2

    new-array v1, v0, [I

    invoke-virtual {p0}, Landroid/widget/ImageView;->getTop()I

    move-result v2

    const/4 v3, 0x0

    aput v2, v1, v3

    const/4 v2, 0x1

    aput v3, v1, v2

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v1

    new-instance v4, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$a;

    invoke-direct {v4, p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$a;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;)V

    invoke-virtual {v1, v4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-array v4, v0, [I

    invoke-virtual {p0}, Landroid/widget/ImageView;->getLeft()I

    move-result v5

    aput v5, v4, v3

    aput v3, v4, v2

    invoke-static {v4}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v4

    new-instance v5, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$b;

    invoke-direct {v5, p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$b;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;)V

    invoke-virtual {v4, v5}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-array v5, v0, [I

    iget v6, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->w:I

    aput v6, v5, v3

    const/16 v6, 0xff

    aput v6, v5, v2

    invoke-static {v5}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v5

    new-instance v6, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$c;

    invoke-direct {v6, p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$c;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;)V

    invoke-virtual {v5, v6}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-array v6, v0, [F

    invoke-virtual {p0}, Landroid/widget/ImageView;->getScaleX()F

    move-result v7

    aput v7, v6, v3

    const/high16 v7, 0x3f800000    # 1.0f

    aput v7, v6, v2

    invoke-static {v6}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v6

    new-instance v7, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$d;

    invoke-direct {v7, p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$d;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;)V

    invoke-virtual {v6, v7}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance v7, Landroid/animation/AnimatorSet;

    invoke-direct {v7}, Landroid/animation/AnimatorSet;-><init>()V

    sget v8, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->B:I

    int-to-long v8, v8

    invoke-virtual {v7, v8, v9}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    new-instance v8, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v8}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    invoke-virtual {v7, v8}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    const/4 v8, 0x4

    new-array v8, v8, [Landroid/animation/Animator;

    aput-object v1, v8, v3

    aput-object v4, v8, v2

    aput-object v6, v8, v0

    const/4 v0, 0x3

    aput-object v5, v8, v0

    invoke-virtual {v7, v8}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    invoke-virtual {v7}, Landroid/animation/AnimatorSet;->start()V

    return-void
.end method

.method public i(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;)V
    .locals 2

    invoke-virtual {p0}, Landroid/widget/ImageView;->getTop()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/widget/ImageView;->getTop()I

    move-result v0

    neg-int v0, v0

    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->offsetTopAndBottom(I)V

    :cond_0
    invoke-virtual {p0}, Landroid/widget/ImageView;->getLeft()I

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/widget/ImageView;->getLeft()I

    move-result v0

    neg-int v0, v0

    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->offsetLeftAndRight(I)V

    :cond_1
    invoke-virtual {p0}, Landroid/widget/ImageView;->getScaleX()F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_2

    invoke-virtual {p0, v1}, Landroid/widget/ImageView;->setScaleX(F)V

    invoke-virtual {p0, v1}, Landroid/widget/ImageView;->setScaleY(F)V

    :cond_2
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->setOnTransformListener(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->m:Z

    sget-object p1, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;->d:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    invoke-virtual {p0}, Landroid/widget/ImageView;->invalidate()V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 2

    invoke-super {p0}, Lb/c/a/e/f/b/c;->onDetachedFromWindow()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->n:I

    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->o:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->l:Landroid/graphics/Rect;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Landroid/graphics/Paint;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h:Landroid/graphics/Matrix;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->j:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->k:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->q:Landroid/animation/ValueAnimator;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->cancel()V

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->q:Landroid/animation/ValueAnimator;

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->clone()Landroid/animation/ValueAnimator;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->q:Landroid/animation/ValueAnimator;

    :cond_0
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sget-object v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;->c:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    invoke-virtual/range {p0 .. p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-nez v3, :cond_0

    return-void

    :cond_0
    iget-object v3, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    sget-object v4, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;->d:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    const/4 v5, 0x0

    if-eq v3, v4, :cond_3

    if-ne v3, v2, :cond_1

    goto :goto_1

    :cond_1
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;->e:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    if-ne v3, v2, :cond_2

    iget-object v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Landroid/graphics/Paint;

    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setAlpha(I)V

    goto :goto_0

    :cond_2
    iget-object v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Landroid/graphics/Paint;

    const/16 v3, 0xff

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    :goto_0
    iget-object v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Landroid/graphics/Paint;

    invoke-virtual {v1, v2}, Landroid/graphics/Canvas;->drawPaint(Landroid/graphics/Paint;)V

    invoke-super/range {p0 .. p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    goto/16 :goto_3

    :cond_3
    :goto_1
    iget-object v3, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    if-eqz v3, :cond_4

    iget-object v3, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->j:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    if-eqz v3, :cond_4

    iget-object v3, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->k:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    if-nez v3, :cond_5

    :cond_4
    invoke-virtual/range {p0 .. p0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f()V

    :cond_5
    iget-object v3, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->k:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    if-nez v3, :cond_6

    invoke-super/range {p0 .. p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    return-void

    :cond_6
    iget-object v6, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Landroid/graphics/Paint;

    iget v3, v3, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->f:I

    invoke-virtual {v6, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v3, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->g:Landroid/graphics/Paint;

    invoke-virtual {v1, v3}, Landroid/graphics/Canvas;->drawPaint(Landroid/graphics/Paint;)V

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->getSaveCount()I

    move-result v3

    iget-object v6, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h:Landroid/graphics/Matrix;

    iget-object v7, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->k:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iget v7, v7, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->g:F

    invoke-virtual {v6, v7, v7}, Landroid/graphics/Matrix;->setScale(FF)V

    iget v6, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->n:I

    int-to-float v6, v6

    iget-object v7, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->k:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iget v8, v7, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->g:F

    mul-float/2addr v6, v8

    iget v9, v7, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->d:F

    sub-float/2addr v6, v9

    neg-float v6, v6

    const/high16 v9, 0x40000000    # 2.0f

    div-float/2addr v6, v9

    iget v10, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->o:I

    int-to-float v10, v10

    mul-float/2addr v10, v8

    iget v7, v7, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->e:F

    sub-float/2addr v10, v7

    neg-float v7, v10

    div-float/2addr v7, v9

    iget-object v8, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h:Landroid/graphics/Matrix;

    invoke-virtual {v8, v6, v7}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    iget-object v6, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->k:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iget v7, v6, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->b:F

    iget v6, v6, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->c:F

    invoke-virtual {v1, v7, v6}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object v6, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->k:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iget v7, v6, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->d:F

    iget v6, v6, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->e:F

    const/4 v8, 0x0

    invoke-virtual {v1, v8, v8, v7, v6}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    iget-object v6, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->h:Landroid/graphics/Matrix;

    invoke-virtual {v1, v6}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    invoke-virtual/range {p0 .. p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v6

    invoke-virtual {v6, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {v1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->m:Z

    if-eqz v1, :cond_a

    .line 1
    iput-boolean v5, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->m:Z

    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->k:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    if-nez v1, :cond_7

    goto/16 :goto_3

    :cond_7
    new-instance v1, Landroid/animation/ValueAnimator;

    invoke-direct {v1}, Landroid/animation/ValueAnimator;-><init>()V

    iput-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->q:Landroid/animation/ValueAnimator;

    sget v3, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->B:I

    int-to-long v6, v3

    invoke-virtual {v1, v6, v7}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->q:Landroid/animation/ValueAnimator;

    new-instance v3, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v3}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    invoke-virtual {v1, v3}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->f:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$g;

    const/4 v6, 0x4

    const/4 v7, 0x3

    const/4 v8, 0x6

    const-string v9, "animHeight"

    const-string v10, "animWidth"

    const-string v11, "animTop"

    const-string v12, "animLeft"

    const-string v13, "animAlpha"

    const-string v14, "animScale"

    const/4 v15, 0x1

    const/4 v3, 0x2

    if-ne v1, v2, :cond_8

    new-array v1, v3, [F

    iget-object v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iget v2, v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->g:F

    aput v2, v1, v5

    iget-object v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->j:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iget v2, v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->g:F

    aput v2, v1, v15

    invoke-static {v14, v1}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v1

    new-array v2, v3, [I

    iget-object v4, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iget v4, v4, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->f:I

    aput v4, v2, v5

    iget-object v4, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->j:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iget v4, v4, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->f:I

    aput v4, v2, v15

    invoke-static {v13, v2}, Landroid/animation/PropertyValuesHolder;->ofInt(Ljava/lang/String;[I)Landroid/animation/PropertyValuesHolder;

    move-result-object v2

    new-array v4, v3, [F

    iget-object v13, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iget v13, v13, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->b:F

    aput v13, v4, v5

    iget-object v13, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->j:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iget v13, v13, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->b:F

    aput v13, v4, v15

    invoke-static {v12, v4}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v4

    new-array v12, v3, [F

    iget-object v13, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iget v13, v13, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->c:F

    aput v13, v12, v5

    iget-object v13, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->j:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iget v13, v13, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->c:F

    aput v13, v12, v15

    invoke-static {v11, v12}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v11

    new-array v12, v3, [F

    iget-object v13, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iget v13, v13, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->d:F

    aput v13, v12, v5

    iget-object v13, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->j:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iget v13, v13, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->d:F

    aput v13, v12, v15

    invoke-static {v10, v12}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v10

    new-array v12, v3, [F

    iget-object v13, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iget v13, v13, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->e:F

    aput v13, v12, v5

    iget-object v13, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->j:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iget v13, v13, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->e:F

    aput v13, v12, v15

    invoke-static {v9, v12}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v9

    iget-object v12, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->q:Landroid/animation/ValueAnimator;

    new-array v8, v8, [Landroid/animation/PropertyValuesHolder;

    aput-object v1, v8, v5

    aput-object v2, v8, v15

    aput-object v4, v8, v3

    aput-object v11, v8, v7

    aput-object v10, v8, v6

    const/4 v1, 0x5

    aput-object v9, v8, v1

    invoke-virtual {v12, v8}, Landroid/animation/ValueAnimator;->setValues([Landroid/animation/PropertyValuesHolder;)V

    goto/16 :goto_2

    :cond_8
    if-ne v1, v4, :cond_9

    new-array v1, v3, [F

    iget-object v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->j:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iget v2, v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->g:F

    aput v2, v1, v5

    iget-object v2, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iget v2, v2, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->g:F

    aput v2, v1, v15

    invoke-static {v14, v1}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v1

    new-array v2, v3, [I

    iget-object v4, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->j:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iget v4, v4, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->f:I

    aput v4, v2, v5

    iget-object v4, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iget v4, v4, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->f:I

    aput v4, v2, v15

    invoke-static {v13, v2}, Landroid/animation/PropertyValuesHolder;->ofInt(Ljava/lang/String;[I)Landroid/animation/PropertyValuesHolder;

    move-result-object v2

    new-array v4, v3, [F

    iget-object v13, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->j:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iget v13, v13, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->b:F

    aput v13, v4, v5

    iget-object v13, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iget v13, v13, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->b:F

    aput v13, v4, v15

    invoke-static {v12, v4}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v4

    new-array v12, v3, [F

    iget-object v13, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->j:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iget v13, v13, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->c:F

    aput v13, v12, v5

    iget-object v13, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iget v13, v13, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->c:F

    aput v13, v12, v15

    invoke-static {v11, v12}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v11

    new-array v12, v3, [F

    iget-object v13, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->j:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iget v13, v13, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->d:F

    aput v13, v12, v5

    iget-object v13, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iget v13, v13, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->d:F

    aput v13, v12, v15

    invoke-static {v10, v12}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v10

    new-array v12, v3, [F

    iget-object v13, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->j:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iget v13, v13, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->e:F

    aput v13, v12, v5

    iget-object v13, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->i:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;

    iget v13, v13, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$h;->e:F

    aput v13, v12, v15

    invoke-static {v9, v12}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v9

    iget-object v12, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->q:Landroid/animation/ValueAnimator;

    new-array v8, v8, [Landroid/animation/PropertyValuesHolder;

    aput-object v1, v8, v5

    aput-object v2, v8, v15

    aput-object v4, v8, v3

    aput-object v11, v8, v7

    aput-object v10, v8, v6

    const/4 v1, 0x5

    aput-object v9, v8, v1

    invoke-virtual {v12, v8}, Landroid/animation/ValueAnimator;->setValues([Landroid/animation/PropertyValuesHolder;)V

    :cond_9
    :goto_2
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->q:Landroid/animation/ValueAnimator;

    new-instance v2, Lb/c/a/e/f/c/f/a;

    invoke-direct {v2, v0}, Lb/c/a/e/f/c/f/a;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;)V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->q:Landroid/animation/ValueAnimator;

    new-instance v2, Lb/c/a/e/f/c/f/b;

    invoke-direct {v2, v0}, Lb/c/a/e/f/c/f/b;-><init>(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;)V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->q:Landroid/animation/ValueAnimator;

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    :cond_a
    :goto_3
    return-void
.end method

.method public setAlphaChangeListener(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$e;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->x:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$e;

    return-void
.end method

.method public setOnTransformListener(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->A:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$i;

    return-void
.end method

.method public setThumbRect(Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->l:Landroid/graphics/Rect;

    return-void
.end method

.method public setTransformOutListener(Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$f;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->y:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView$f;

    return-void
.end method
