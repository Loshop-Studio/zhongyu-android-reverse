.class public Lb/c/a/e/f/b/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/GestureDetector$OnDoubleTapListener;


# instance fields
.field public a:Lb/c/a/e/f/b/e;


# direct methods
.method public constructor <init>(Lb/c/a/e/f/b/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    iput-object p1, p0, Lb/c/a/e/f/b/a;->a:Lb/c/a/e/f/b/e;

    return-void
.end method


# virtual methods
.method public onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 6

    iget-object v0, p0, Lb/c/a/e/f/b/a;->a:Lb/c/a/e/f/b/e;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v1, 0x1

    :try_start_0
    invoke-virtual {v0}, Lb/c/a/e/f/b/e;->l()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iget-object v3, p0, Lb/c/a/e/f/b/a;->a:Lb/c/a/e/f/b/e;

    .line 1
    iget v4, v3, Lb/c/a/e/f/b/e;->e:F

    cmpg-float v5, v0, v4

    if-gez v5, :cond_1

    goto :goto_0

    :cond_1
    cmpl-float v4, v0, v4

    if-ltz v4, :cond_2

    .line 2
    iget v4, v3, Lb/c/a/e/f/b/e;->f:F

    cmpg-float v0, v0, v4

    if-gez v0, :cond_2

    .line 3
    :goto_0
    invoke-virtual {v3, v4, v2, p1, v1}, Lb/c/a/e/f/b/e;->q(FFFZ)V

    goto :goto_1

    .line 4
    :cond_2
    iget v0, v3, Lb/c/a/e/f/b/e;->d:F

    .line 5
    invoke-virtual {v3, v0, v2, p1, v1}, Lb/c/a/e/f/b/e;->q(FFFZ)V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_1
    return v1
.end method

.method public onDoubleTapEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
    .locals 4

    iget-object v0, p0, Lb/c/a/e/f/b/a;->a:Lb/c/a/e/f/b/e;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Lb/c/a/e/f/b/e;->i()Landroid/widget/ImageView;

    iget-object v0, p0, Lb/c/a/e/f/b/a;->a:Lb/c/a/e/f/b/e;

    .line 1
    iget-object v2, v0, Lb/c/a/e/f/b/e;->r:Lb/c/a/e/f/b/e$e;

    if-eqz v2, :cond_3

    .line 2
    invoke-virtual {v0}, Lb/c/a/e/f/b/e;->f()Landroid/graphics/RectF;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-virtual {v0, v2, v3}, Landroid/graphics/RectF;->contains(FF)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    iget-object p1, p0, Lb/c/a/e/f/b/a;->a:Lb/c/a/e/f/b/e;

    .line 3
    iget-object p1, p1, Lb/c/a/e/f/b/e;->r:Lb/c/a/e/f/b/e$e;

    .line 4
    check-cast p1, Lb/c/a/e/f/c/e/d;

    .line 5
    iget-object v0, p1, Lb/c/a/e/f/c/e/d;->a:Lb/c/a/e/f/c/e/h;

    iget-object v0, v0, Lb/c/a/e/f/c/e/h;->X:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p1, Lb/c/a/e/f/c/e/d;->a:Lb/c/a/e/f/c/e/h;

    invoke-static {p1}, Lb/c/a/e/f/c/e/h;->x0(Lb/c/a/e/f/c/e/h;)V

    :cond_1
    const/4 p1, 0x1

    return p1

    .line 6
    :cond_2
    iget-object v0, p0, Lb/c/a/e/f/b/a;->a:Lb/c/a/e/f/b/e;

    .line 7
    iget-object v0, v0, Lb/c/a/e/f/b/e;->r:Lb/c/a/e/f/b/e$e;

    .line 8
    check-cast v0, Lb/c/a/e/f/c/e/d;

    .line 9
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    :cond_3
    iget-object v0, p0, Lb/c/a/e/f/b/a;->a:Lb/c/a/e/f/b/e;

    .line 11
    iget-object v0, v0, Lb/c/a/e/f/b/e;->s:Lb/c/a/e/f/b/e$h;

    if-eqz v0, :cond_4

    .line 12
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    check-cast v0, Lb/c/a/e/f/c/e/c;

    .line 13
    iget-object p1, v0, Lb/c/a/e/f/c/e/c;->a:Lb/c/a/e/f/c/e/h;

    iget-object p1, p1, Lb/c/a/e/f/c/e/h;->X:Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/preview/view/SmoothImageView;->e()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, v0, Lb/c/a/e/f/c/e/c;->a:Lb/c/a/e/f/c/e/h;

    invoke-static {p1}, Lb/c/a/e/f/c/e/h;->x0(Lb/c/a/e/f/c/e/h;)V

    :cond_4
    return v1
.end method
