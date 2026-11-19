.class Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView$OnImageChangedListener;
    }
.end annotation


# instance fields
.field private mOnImageChangedListener:Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView$OnImageChangedListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method getBitmap()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;->mOnImageChangedListener:Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView$OnImageChangedListener;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView$OnImageChangedListener;->onBitmapLoaded(Landroid/graphics/Bitmap;)V

    :cond_0
    return-void
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;->mOnImageChangedListener:Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView$OnImageChangedListener;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView$OnImageChangedListener;->onBitmapLoaded(Landroid/graphics/Bitmap;)V

    :cond_0
    return-void
.end method

.method public setImageIcon(Landroid/graphics/drawable/Icon;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageIcon(Landroid/graphics/drawable/Icon;)V

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;->mOnImageChangedListener:Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView$OnImageChangedListener;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView$OnImageChangedListener;->onBitmapLoaded(Landroid/graphics/Bitmap;)V

    :cond_0
    return-void
.end method

.method public setImageLevel(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageLevel(I)V

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;->mOnImageChangedListener:Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView$OnImageChangedListener;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView$OnImageChangedListener;->onBitmapLoaded(Landroid/graphics/Bitmap;)V

    :cond_0
    return-void
.end method

.method public setImageMatrix(Landroid/graphics/Matrix;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;->mOnImageChangedListener:Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView$OnImageChangedListener;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView$OnImageChangedListener;->onBitmapLoaded(Landroid/graphics/Bitmap;)V

    :cond_0
    return-void
.end method

.method public setImageResource(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;->mOnImageChangedListener:Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView$OnImageChangedListener;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView$OnImageChangedListener;->onBitmapLoaded(Landroid/graphics/Bitmap;)V

    :cond_0
    return-void
.end method

.method public setImageState([IZ)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/ImageView;->setImageState([IZ)V

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;->mOnImageChangedListener:Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView$OnImageChangedListener;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView$OnImageChangedListener;->onBitmapLoaded(Landroid/graphics/Bitmap;)V

    :cond_0
    return-void
.end method

.method public setImageTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;->mOnImageChangedListener:Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView$OnImageChangedListener;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView$OnImageChangedListener;->onBitmapLoaded(Landroid/graphics/Bitmap;)V

    :cond_0
    return-void
.end method

.method public setImageTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;->mOnImageChangedListener:Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView$OnImageChangedListener;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView$OnImageChangedListener;->onBitmapLoaded(Landroid/graphics/Bitmap;)V

    :cond_0
    return-void
.end method

.method public setImageURI(Landroid/net/Uri;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageURI(Landroid/net/Uri;)V

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;->mOnImageChangedListener:Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView$OnImageChangedListener;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView$OnImageChangedListener;->onBitmapLoaded(Landroid/graphics/Bitmap;)V

    :cond_0
    return-void
.end method

.method public setOnImageChangedListener(Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView$OnImageChangedListener;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView;->mOnImageChangedListener:Lcom/xuexiang/xui/widget/imageview/edit/FilterImageView$OnImageChangedListener;

    return-void
.end method
