.class public Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/imageview/photoview/IPhotoView;


# instance fields
.field private mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

.field private mPendingScaleType:Landroid/widget/ImageView$ScaleType;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    sget-object p1, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    invoke-super {p0, p1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 5
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->init()V

    return-void
.end method


# virtual methods
.method public canZoom()Z
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;->canZoom()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getDisplayMatrix(Landroid/graphics/Matrix;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;->getDisplayMatrix(Landroid/graphics/Matrix;)V

    :cond_0
    return-void
.end method

.method public getDisplayRect()Landroid/graphics/RectF;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;->getDisplayRect()Landroid/graphics/RectF;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getIPhotoViewImplementation()Lcom/xuexiang/xui/widget/imageview/photoview/IPhotoView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    return-object v0
.end method

.method public getImageMatrix()Landroid/graphics/Matrix;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;->getImageMatrix()Landroid/graphics/Matrix;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getMaximumScale()F
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;->getMaximumScale()F

    move-result v0

    goto :goto_0

    :cond_0
    const/high16 v0, 0x40400000    # 3.0f

    :goto_0
    return v0
.end method

.method public getMediumScale()F
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;->getMediumScale()F

    move-result v0

    goto :goto_0

    :cond_0
    const/high16 v0, 0x3fe00000    # 1.75f

    :goto_0
    return v0
.end method

.method public getMinimumScale()F
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;->getMinimumScale()F

    move-result v0

    goto :goto_0

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    :goto_0
    return v0
.end method

.method public getScale()F
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;->getScale()F

    move-result v0

    goto :goto_0

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    :goto_0
    return v0
.end method

.method public getScaleType()Landroid/widget/ImageView$ScaleType;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getVisibleRectangleBitmap()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;->getVisibleRectangleBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method protected init()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;->getImageView()Landroid/widget/ImageView;

    move-result-object v0

    if-nez v0, :cond_1

    .line 2
    :cond_0
    new-instance v0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;-><init>(Landroid/widget/ImageView;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    .line 3
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mPendingScaleType:Landroid/widget/ImageView$ScaleType;

    if-eqz v0, :cond_2

    .line 4
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mPendingScaleType:Landroid/widget/ImageView$ScaleType;

    :cond_2
    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->init()V

    .line 2
    invoke-super {p0}, Landroid/widget/ImageView;->onAttachedToWindow()V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->resetMatrix()V

    .line 2
    invoke-super {p0}, Landroid/widget/ImageView;->onDetachedFromWindow()V

    return-void
.end method

.method public resetMatrix()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;->cleanup()V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;->resetMatrix()V

    :cond_0
    return-void
.end method

.method public setAllowParentInterceptOnEdge(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;->setAllowParentInterceptOnEdge(Z)V

    :cond_0
    return-void
.end method

.method public setDisplayMatrix(Landroid/graphics/Matrix;)Z
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;->setDisplayMatrix(Landroid/graphics/Matrix;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method protected setFrame(IIII)Z
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ImageView;->setFrame(IIII)Z

    move-result p1

    .line 2
    iget-object p2, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;->update()V

    :cond_0
    return p1
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;->update()V

    :cond_0
    return-void
.end method

.method public setImageResource(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;->update()V

    :cond_0
    return-void
.end method

.method public setImageURI(Landroid/net/Uri;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageURI(Landroid/net/Uri;)V

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;->update()V

    :cond_0
    return-void
.end method

.method public setMaximumScale(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;->setMaximumScale(F)V

    :cond_0
    return-void
.end method

.method public setMediumScale(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;->setMediumScale(F)V

    :cond_0
    return-void
.end method

.method public setMinimumScale(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;->setMinimumScale(F)V

    :cond_0
    return-void
.end method

.method public setOnDoubleTapListener(Landroid/view/GestureDetector$OnDoubleTapListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;->setOnDoubleTapListener(Landroid/view/GestureDetector$OnDoubleTapListener;)V

    :cond_0
    return-void
.end method

.method public setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    :cond_0
    return-void
.end method

.method public setOnMatrixChangeListener(Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher$OnMatrixChangedListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;->setOnMatrixChangeListener(Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher$OnMatrixChangedListener;)V

    :cond_0
    return-void
.end method

.method public setOnPhotoTapListener(Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher$OnPhotoTapListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;->setOnPhotoTapListener(Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher$OnPhotoTapListener;)V

    :cond_0
    return-void
.end method

.method public setOnScaleChangeListener(Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher$OnScaleChangeListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;->setOnScaleChangeListener(Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher$OnScaleChangeListener;)V

    :cond_0
    return-void
.end method

.method public setOnSingleFlingListener(Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher$OnSingleFlingListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;->setOnSingleFlingListener(Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher$OnSingleFlingListener;)V

    :cond_0
    return-void
.end method

.method public setOnViewTapListener(Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher$OnViewTapListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;->setOnViewTapListener(Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher$OnViewTapListener;)V

    :cond_0
    return-void
.end method

.method public setRotationBy(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;->setRotationBy(F)V

    :cond_0
    return-void
.end method

.method public setRotationTo(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;->setRotationTo(F)V

    :cond_0
    return-void
.end method

.method public setScale(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;->setScale(F)V

    :cond_0
    return-void
.end method

.method public setScale(FFFZ)V
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;->setScale(FFFZ)V

    :cond_0
    return-void
.end method

.method public setScale(FZ)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, p1, p2}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;->setScale(FZ)V

    :cond_0
    return-void
.end method

.method public setScaleLevels(FFF)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1, p2, p3}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;->setScaleLevels(FFF)V

    :cond_0
    return-void
.end method

.method public setScaleType(Landroid/widget/ImageView$ScaleType;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    goto :goto_0

    .line 3
    :cond_0
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mPendingScaleType:Landroid/widget/ImageView$ScaleType;

    :goto_0
    return-void
.end method

.method public setZoomTransitionDuration(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;->setZoomTransitionDuration(I)V

    :cond_0
    return-void
.end method

.method public setZoomable(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoView;->mAttacher:Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/photoview/PhotoViewAttacher;->setZoomable(Z)V

    :cond_0
    return-void
.end method
