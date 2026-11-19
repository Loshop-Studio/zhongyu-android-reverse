.class public abstract Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source "SourceFile"


# static fields
.field private static final PORTER_DUFF_XFERMODE:Landroid/graphics/PorterDuffXfermode;


# instance fields
.field private mDrawableBitmap:Landroid/graphics/Bitmap;

.field private mDrawableCanvas:Landroid/graphics/Canvas;

.field private mDrawablePaint:Landroid/graphics/Paint;

.field private mInvalidated:Z

.field private mMaskBitmap:Landroid/graphics/Bitmap;

.field private mMaskCanvas:Landroid/graphics/Canvas;

.field private mMaskPaint:Landroid/graphics/Paint;

.field private mPaintColor:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->DST_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    sput-object v0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->PORTER_DUFF_XFERMODE:Landroid/graphics/PorterDuffXfermode;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;)V

    const p1, -0x777778

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mPaintColor:I

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mInvalidated:Z

    .line 4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const p1, -0x777778

    .line 6
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mPaintColor:I

    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mInvalidated:Z

    .line 8
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const p1, -0x777778

    .line 10
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mPaintColor:I

    const/4 p1, 0x1

    .line 11
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mInvalidated:Z

    .line 12
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->init()V

    return-void
.end method

.method private createMaskCanvas(IIII)V
    .locals 1

    const/4 v0, 0x1

    if-ne p1, p3, :cond_1

    if-eq p2, p4, :cond_0

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p3, 0x1

    :goto_1
    if-lez p1, :cond_3

    if-lez p2, :cond_3

    .line 1
    iget-object p4, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mMaskCanvas:Landroid/graphics/Canvas;

    if-eqz p4, :cond_2

    if-eqz p3, :cond_3

    .line 2
    :cond_2
    new-instance p3, Landroid/graphics/Canvas;

    invoke-direct {p3}, Landroid/graphics/Canvas;-><init>()V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mMaskCanvas:Landroid/graphics/Canvas;

    .line 3
    sget-object p3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p1, p2, p3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p3

    iput-object p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mMaskBitmap:Landroid/graphics/Bitmap;

    .line 4
    iget-object p4, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mMaskCanvas:Landroid/graphics/Canvas;

    invoke-virtual {p4, p3}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 5
    iget-object p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mMaskPaint:Landroid/graphics/Paint;

    invoke-virtual {p3}, Landroid/graphics/Paint;->reset()V

    .line 6
    iget-object p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mMaskCanvas:Landroid/graphics/Canvas;

    iget-object p4, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mMaskPaint:Landroid/graphics/Paint;

    invoke-virtual {p0, p3, p4, p1, p2}, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->paintMaskCanvas(Landroid/graphics/Canvas;Landroid/graphics/Paint;II)V

    .line 7
    new-instance p3, Landroid/graphics/Canvas;

    invoke-direct {p3}, Landroid/graphics/Canvas;-><init>()V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mDrawableCanvas:Landroid/graphics/Canvas;

    .line 8
    sget-object p3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p1, p2, p3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mDrawableBitmap:Landroid/graphics/Bitmap;

    .line 9
    iget-object p2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mDrawableCanvas:Landroid/graphics/Canvas;

    invoke-virtual {p2, p1}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 10
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mDrawablePaint:Landroid/graphics/Paint;

    .line 11
    iget p2, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mPaintColor:I

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 12
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mInvalidated:Z

    :cond_3
    return-void
.end method

.method private init()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object v0

    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    if-ne v0, v1, :cond_0

    .line 2
    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 3
    :cond_0
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mMaskPaint:Landroid/graphics/Paint;

    const/high16 v1, -0x1000000

    .line 4
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method


# virtual methods
.method public invalidate()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mInvalidated:Z

    .line 2
    invoke-super {p0}, Landroid/widget/ImageView;->invalidate()V

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/widget/ImageView;->getWidth()I

    move-result v0

    int-to-float v4, v0

    invoke-virtual {p0}, Landroid/widget/ImageView;->getHeight()I

    move-result v0

    int-to-float v5, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x1f

    move-object v1, p1

    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;I)I

    move-result v0

    .line 2
    :try_start_0
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mInvalidated:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 3
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_1

    const/4 v3, 0x0

    .line 4
    iput-boolean v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mInvalidated:Z

    .line 5
    invoke-virtual {p0}, Landroid/widget/ImageView;->getImageMatrix()Landroid/graphics/Matrix;

    move-result-object v4

    if-nez v4, :cond_0

    .line 6
    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mDrawableCanvas:Landroid/graphics/Canvas;

    invoke-virtual {v1, v4}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    goto :goto_0

    .line 7
    :cond_0
    iget-object v5, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mDrawableCanvas:Landroid/graphics/Canvas;

    invoke-virtual {v5}, Landroid/graphics/Canvas;->getSaveCount()I

    move-result v5

    .line 8
    iget-object v6, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mDrawableCanvas:Landroid/graphics/Canvas;

    invoke-virtual {v6}, Landroid/graphics/Canvas;->save()I

    .line 9
    iget-object v6, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mDrawableCanvas:Landroid/graphics/Canvas;

    invoke-virtual {v6, v4}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 10
    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mDrawableCanvas:Landroid/graphics/Canvas;

    invoke-virtual {v1, v4}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 11
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mDrawableCanvas:Landroid/graphics/Canvas;

    invoke-virtual {v1, v5}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 12
    :goto_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mDrawablePaint:Landroid/graphics/Paint;

    invoke-virtual {v1}, Landroid/graphics/Paint;->reset()V

    .line 13
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mDrawablePaint:Landroid/graphics/Paint;

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 14
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mDrawablePaint:Landroid/graphics/Paint;

    sget-object v3, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->PORTER_DUFF_XFERMODE:Landroid/graphics/PorterDuffXfermode;

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 15
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mDrawableCanvas:Landroid/graphics/Canvas;

    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mMaskBitmap:Landroid/graphics/Bitmap;

    iget-object v4, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mDrawablePaint:Landroid/graphics/Paint;

    invoke-virtual {v1, v3, v2, v2, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 16
    :cond_1
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mInvalidated:Z

    if-nez v1, :cond_2

    .line 17
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mDrawablePaint:Landroid/graphics/Paint;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 18
    iget-object v1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mDrawableBitmap:Landroid/graphics/Bitmap;

    iget-object v3, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mDrawablePaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :catch_0
    move-exception v1

    .line 19
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    :cond_2
    :goto_1
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return-void

    :goto_2
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 21
    throw v1
.end method

.method protected onMeasure(II)V
    .locals 1

    const/16 v0, 0x32

    if-nez p1, :cond_0

    const/16 p1, 0x32

    :cond_0
    if-nez p2, :cond_1

    const/16 p2, 0x32

    :cond_1
    invoke-super {p0, p1, p2}, Landroid/widget/ImageView;->onMeasure(II)V

    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ImageView;->onSizeChanged(IIII)V

    .line 2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->createMaskCanvas(IIII)V

    return-void
.end method

.method protected abstract paintMaskCanvas(Landroid/graphics/Canvas;Landroid/graphics/Paint;II)V
.end method

.method public setTintColor(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mPaintColor:I

    .line 2
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->mDrawablePaint:Landroid/graphics/Paint;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 5
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/button/shinebutton/PorterImageView;->invalidate()V

    :cond_0
    return-void
.end method
