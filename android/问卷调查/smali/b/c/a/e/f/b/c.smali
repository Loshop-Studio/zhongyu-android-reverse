.class public Lb/c/a/e/f/b/c;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source ""

# interfaces
.implements Lb/c/a/e/f/b/b;


# instance fields
.field public d:Lb/c/a/e/f/b/e;

.field public e:Landroid/widget/ImageView$ScaleType;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    sget-object p1, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    invoke-super {p0, p1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    invoke-virtual {p0}, Lb/c/a/e/f/b/c;->c()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 1

    iget-object v0, p0, Lb/c/a/e/f/b/c;->d:Lb/c/a/e/f/b/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lb/c/a/e/f/b/e;->i()Landroid/widget/ImageView;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, Lb/c/a/e/f/b/e;

    invoke-direct {v0, p0}, Lb/c/a/e/f/b/e;-><init>(Landroid/widget/ImageView;)V

    iput-object v0, p0, Lb/c/a/e/f/b/c;->d:Lb/c/a/e/f/b/e;

    :cond_1
    iget-object v0, p0, Lb/c/a/e/f/b/c;->e:Landroid/widget/ImageView$ScaleType;

    if-eqz v0, :cond_2

    invoke-virtual {p0, v0}, Lb/c/a/e/f/b/c;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lb/c/a/e/f/b/c;->e:Landroid/widget/ImageView$ScaleType;

    :cond_2
    return-void
.end method

.method public getDisplayRect()Landroid/graphics/RectF;
    .locals 1

    iget-object v0, p0, Lb/c/a/e/f/b/c;->d:Lb/c/a/e/f/b/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lb/c/a/e/f/b/e;->f()Landroid/graphics/RectF;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getIPhotoViewImplementation()Lb/c/a/e/f/b/b;
    .locals 1

    iget-object v0, p0, Lb/c/a/e/f/b/c;->d:Lb/c/a/e/f/b/e;

    return-object v0
.end method

.method public getImageMatrix()Landroid/graphics/Matrix;
    .locals 1

    iget-object v0, p0, Lb/c/a/e/f/b/c;->d:Lb/c/a/e/f/b/e;

    if-eqz v0, :cond_0

    .line 1
    iget-object v0, v0, Lb/c/a/e/f/b/e;->m:Landroid/graphics/Matrix;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getMaximumScale()F
    .locals 1

    iget-object v0, p0, Lb/c/a/e/f/b/c;->d:Lb/c/a/e/f/b/e;

    if-eqz v0, :cond_0

    .line 1
    iget v0, v0, Lb/c/a/e/f/b/e;->f:F

    goto :goto_0

    :cond_0
    const/high16 v0, 0x40400000    # 3.0f

    :goto_0
    return v0
.end method

.method public getMediumScale()F
    .locals 1

    iget-object v0, p0, Lb/c/a/e/f/b/c;->d:Lb/c/a/e/f/b/e;

    if-eqz v0, :cond_0

    .line 1
    iget v0, v0, Lb/c/a/e/f/b/e;->e:F

    goto :goto_0

    :cond_0
    const/high16 v0, 0x3fe00000    # 1.75f

    :goto_0
    return v0
.end method

.method public getMinimumScale()F
    .locals 1

    iget-object v0, p0, Lb/c/a/e/f/b/c;->d:Lb/c/a/e/f/b/e;

    if-eqz v0, :cond_0

    .line 1
    iget v0, v0, Lb/c/a/e/f/b/e;->d:F

    goto :goto_0

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    :goto_0
    return v0
.end method

.method public getScale()F
    .locals 1

    iget-object v0, p0, Lb/c/a/e/f/b/c;->d:Lb/c/a/e/f/b/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lb/c/a/e/f/b/e;->l()F

    move-result v0

    goto :goto_0

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    :goto_0
    return v0
.end method

.method public getScaleType()Landroid/widget/ImageView$ScaleType;
    .locals 1

    iget-object v0, p0, Lb/c/a/e/f/b/c;->d:Lb/c/a/e/f/b/e;

    if-eqz v0, :cond_0

    .line 1
    iget-object v0, v0, Lb/c/a/e/f/b/e;->D:Landroid/widget/ImageView$ScaleType;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getVisibleRectangleBitmap()Landroid/graphics/Bitmap;
    .locals 2

    iget-object v0, p0, Lb/c/a/e/f/b/c;->d:Lb/c/a/e/f/b/e;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 1
    invoke-virtual {v0}, Lb/c/a/e/f/b/e;->i()Landroid/widget/ImageView;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawingCache()Landroid/graphics/Bitmap;

    move-result-object v0

    move-object v1, v0

    :cond_1
    :goto_0
    return-object v1
.end method

.method public onAttachedToWindow()V
    .locals 0

    invoke-virtual {p0}, Lb/c/a/e/f/b/c;->c()V

    invoke-super {p0}, Landroid/widget/ImageView;->onAttachedToWindow()V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    .line 1
    iget-object v0, p0, Lb/c/a/e/f/b/c;->d:Lb/c/a/e/f/b/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lb/c/a/e/f/b/e;->e()V

    iget-object v0, p0, Lb/c/a/e/f/b/c;->d:Lb/c/a/e/f/b/e;

    invoke-virtual {v0}, Lb/c/a/e/f/b/e;->n()V

    .line 2
    :cond_0
    invoke-super {p0}, Landroid/widget/ImageView;->onDetachedFromWindow()V

    return-void
.end method

.method public setAllowParentInterceptOnEdge(Z)V
    .locals 1

    iget-object v0, p0, Lb/c/a/e/f/b/c;->d:Lb/c/a/e/f/b/e;

    if-eqz v0, :cond_0

    .line 1
    iput-boolean p1, v0, Lb/c/a/e/f/b/e;->g:Z

    :cond_0
    return-void
.end method

.method public setFrame(IIII)Z
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ImageView;->setFrame(IIII)Z

    move-result p1

    iget-object p2, p0, Lb/c/a/e/f/b/c;->d:Lb/c/a/e/f/b/e;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lb/c/a/e/f/b/e;->s()V

    :cond_0
    return p1
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lb/c/a/e/f/b/c;->d:Lb/c/a/e/f/b/e;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lb/c/a/e/f/b/e;->s()V

    :cond_0
    return-void
.end method

.method public setImageResource(I)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    iget-object p1, p0, Lb/c/a/e/f/b/c;->d:Lb/c/a/e/f/b/e;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lb/c/a/e/f/b/e;->s()V

    :cond_0
    return-void
.end method

.method public setImageURI(Landroid/net/Uri;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageURI(Landroid/net/Uri;)V

    iget-object p1, p0, Lb/c/a/e/f/b/c;->d:Lb/c/a/e/f/b/e;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lb/c/a/e/f/b/e;->s()V

    :cond_0
    return-void
.end method

.method public setMaximumScale(F)V
    .locals 3

    iget-object v0, p0, Lb/c/a/e/f/b/c;->d:Lb/c/a/e/f/b/e;

    if-eqz v0, :cond_0

    .line 1
    iget v1, v0, Lb/c/a/e/f/b/e;->d:F

    iget v2, v0, Lb/c/a/e/f/b/e;->e:F

    invoke-static {v1, v2, p1}, Lb/c/a/e/f/b/e;->d(FFF)V

    iput p1, v0, Lb/c/a/e/f/b/e;->f:F

    :cond_0
    return-void
.end method

.method public setMediumScale(F)V
    .locals 3

    iget-object v0, p0, Lb/c/a/e/f/b/c;->d:Lb/c/a/e/f/b/e;

    if-eqz v0, :cond_0

    .line 1
    iget v1, v0, Lb/c/a/e/f/b/e;->d:F

    iget v2, v0, Lb/c/a/e/f/b/e;->f:F

    invoke-static {v1, p1, v2}, Lb/c/a/e/f/b/e;->d(FFF)V

    iput p1, v0, Lb/c/a/e/f/b/e;->e:F

    :cond_0
    return-void
.end method

.method public setMinimumScale(F)V
    .locals 3

    iget-object v0, p0, Lb/c/a/e/f/b/c;->d:Lb/c/a/e/f/b/e;

    if-eqz v0, :cond_0

    .line 1
    iget v1, v0, Lb/c/a/e/f/b/e;->e:F

    iget v2, v0, Lb/c/a/e/f/b/e;->f:F

    invoke-static {p1, v1, v2}, Lb/c/a/e/f/b/e;->d(FFF)V

    iput p1, v0, Lb/c/a/e/f/b/e;->d:F

    :cond_0
    return-void
.end method

.method public setOnDoubleTapListener(Landroid/view/GestureDetector$OnDoubleTapListener;)V
    .locals 2

    iget-object v0, p0, Lb/c/a/e/f/b/c;->d:Lb/c/a/e/f/b/e;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, v0, Lb/c/a/e/f/b/e;->j:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->setOnDoubleTapListener(Landroid/view/GestureDetector$OnDoubleTapListener;)V

    goto :goto_0

    :cond_0
    iget-object p1, v0, Lb/c/a/e/f/b/e;->j:Landroid/view/GestureDetector;

    new-instance v1, Lb/c/a/e/f/b/a;

    invoke-direct {v1, v0}, Lb/c/a/e/f/b/a;-><init>(Lb/c/a/e/f/b/e;)V

    invoke-virtual {p1, v1}, Landroid/view/GestureDetector;->setOnDoubleTapListener(Landroid/view/GestureDetector$OnDoubleTapListener;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
    .locals 1

    iget-object v0, p0, Lb/c/a/e/f/b/c;->d:Lb/c/a/e/f/b/e;

    if-eqz v0, :cond_0

    .line 1
    iput-object p1, v0, Lb/c/a/e/f/b/e;->t:Landroid/view/View$OnLongClickListener;

    :cond_0
    return-void
.end method

.method public setOnMatrixChangeListener(Lb/c/a/e/f/b/e$d;)V
    .locals 1

    iget-object v0, p0, Lb/c/a/e/f/b/c;->d:Lb/c/a/e/f/b/e;

    if-eqz v0, :cond_0

    .line 1
    iput-object p1, v0, Lb/c/a/e/f/b/e;->q:Lb/c/a/e/f/b/e$d;

    :cond_0
    return-void
.end method

.method public setOnPhotoTapListener(Lb/c/a/e/f/b/e$e;)V
    .locals 1

    iget-object v0, p0, Lb/c/a/e/f/b/c;->d:Lb/c/a/e/f/b/e;

    if-eqz v0, :cond_0

    .line 1
    iput-object p1, v0, Lb/c/a/e/f/b/e;->r:Lb/c/a/e/f/b/e$e;

    :cond_0
    return-void
.end method

.method public setOnScaleChangeListener(Lb/c/a/e/f/b/e$f;)V
    .locals 1

    iget-object v0, p0, Lb/c/a/e/f/b/c;->d:Lb/c/a/e/f/b/e;

    if-eqz v0, :cond_0

    .line 1
    iput-object p1, v0, Lb/c/a/e/f/b/e;->u:Lb/c/a/e/f/b/e$f;

    :cond_0
    return-void
.end method

.method public setOnSingleFlingListener(Lb/c/a/e/f/b/e$g;)V
    .locals 1

    iget-object v0, p0, Lb/c/a/e/f/b/c;->d:Lb/c/a/e/f/b/e;

    if-eqz v0, :cond_0

    .line 1
    iput-object p1, v0, Lb/c/a/e/f/b/e;->v:Lb/c/a/e/f/b/e$g;

    :cond_0
    return-void
.end method

.method public setOnViewTapListener(Lb/c/a/e/f/b/e$h;)V
    .locals 1

    iget-object v0, p0, Lb/c/a/e/f/b/c;->d:Lb/c/a/e/f/b/e;

    if-eqz v0, :cond_0

    .line 1
    iput-object p1, v0, Lb/c/a/e/f/b/e;->s:Lb/c/a/e/f/b/e$h;

    :cond_0
    return-void
.end method

.method public setRotationBy(F)V
    .locals 3

    iget-object v0, p0, Lb/c/a/e/f/b/c;->d:Lb/c/a/e/f/b/e;

    if-eqz v0, :cond_0

    .line 1
    iget-object v1, v0, Lb/c/a/e/f/b/e;->n:Landroid/graphics/Matrix;

    const/high16 v2, 0x43b40000    # 360.0f

    rem-float/2addr p1, v2

    invoke-virtual {v1, p1}, Landroid/graphics/Matrix;->postRotate(F)Z

    invoke-virtual {v0}, Lb/c/a/e/f/b/e;->b()V

    :cond_0
    return-void
.end method

.method public setRotationTo(F)V
    .locals 3

    iget-object v0, p0, Lb/c/a/e/f/b/c;->d:Lb/c/a/e/f/b/e;

    if-eqz v0, :cond_0

    .line 1
    iget-object v1, v0, Lb/c/a/e/f/b/e;->n:Landroid/graphics/Matrix;

    const/high16 v2, 0x43b40000    # 360.0f

    rem-float/2addr p1, v2

    invoke-virtual {v1, p1}, Landroid/graphics/Matrix;->setRotate(F)V

    invoke-virtual {v0}, Lb/c/a/e/f/b/e;->b()V

    :cond_0
    return-void
.end method

.method public setScale(F)V
    .locals 2

    iget-object v0, p0, Lb/c/a/e/f/b/c;->d:Lb/c/a/e/f/b/e;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 1
    invoke-virtual {v0, p1, v1}, Lb/c/a/e/f/b/e;->r(FZ)V

    :cond_0
    return-void
.end method

.method public setScaleType(Landroid/widget/ImageView$ScaleType;)V
    .locals 3

    iget-object v0, p0, Lb/c/a/e/f/b/c;->d:Lb/c/a/e/f/b/e;

    if-eqz v0, :cond_2

    .line 1
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    if-nez p1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 2
    :cond_0
    sget-object v1, Lb/c/a/e/f/b/e$a;->a:[I

    invoke-virtual {p1}, Landroid/widget/ImageView$ScaleType;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    move v1, v2

    :goto_0
    if-eqz v1, :cond_3

    .line 3
    iget-object v1, v0, Lb/c/a/e/f/b/e;->D:Landroid/widget/ImageView$ScaleType;

    if-eq p1, v1, :cond_3

    iput-object p1, v0, Lb/c/a/e/f/b/e;->D:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0}, Lb/c/a/e/f/b/e;->s()V

    goto :goto_1

    .line 4
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/widget/ImageView$ScaleType;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " is not supported in PhotoView"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 5
    :cond_2
    iput-object p1, p0, Lb/c/a/e/f/b/c;->e:Landroid/widget/ImageView$ScaleType;

    :cond_3
    :goto_1
    return-void
.end method

.method public setZoomTransitionDuration(I)V
    .locals 1

    iget-object v0, p0, Lb/c/a/e/f/b/c;->d:Lb/c/a/e/f/b/e;

    if-eqz v0, :cond_1

    if-gez p1, :cond_0

    const/16 p1, 0xc8

    .line 1
    :cond_0
    iput p1, v0, Lb/c/a/e/f/b/e;->c:I

    :cond_1
    return-void
.end method

.method public setZoomable(Z)V
    .locals 1

    iget-object v0, p0, Lb/c/a/e/f/b/c;->d:Lb/c/a/e/f/b/e;

    if-eqz v0, :cond_0

    .line 1
    iput-boolean p1, v0, Lb/c/a/e/f/b/e;->C:Z

    invoke-virtual {v0}, Lb/c/a/e/f/b/e;->s()V

    :cond_0
    return-void
.end method
