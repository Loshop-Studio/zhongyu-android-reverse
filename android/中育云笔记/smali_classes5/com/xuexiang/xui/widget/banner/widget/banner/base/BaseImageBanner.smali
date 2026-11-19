.class public abstract Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner;
.super Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner<",
        "TT;>;>",
        "Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner<",
        "Ljava/lang/Object;",
        "TT;>;"
    }
.end annotation


# instance fields
.field public N:Landroid/graphics/drawable/Drawable;

.field public O:Z

.field public P:D


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner;->L(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner;->L(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner;->L(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public L(Landroid/content/Context;)V
    .locals 2

    .line 1
    new-instance p1, Landroid/graphics/drawable/ColorDrawable;

    .line 2
    .line 3
    sget v0, Lcom/xuexiang/xui/R$color;->default_image_banner_placeholder_color:I

    .line 4
    .line 5
    invoke-static {v0}, Lcom/xuexiang/xui/utils/f;->c(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-direct {p1, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner;->N:Landroid/graphics/drawable/Drawable;

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner;->O:Z

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->getContainerScale()F

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    float-to-double v0, p1

    .line 22
    iput-wide v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner;->P:D

    .line 23
    .line 24
    return-void
.end method

.method public getEnableCache()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner;->O:Z

    .line 2
    .line 3
    return v0
.end method

.method public abstract getImageViewId()I
.end method

.method public abstract getItemLayoutId()I
.end method

.method public getPlaceHolderDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner;->N:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object v0
.end method

.method public getScale()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner;->P:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->r()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public p(I)Landroid/view/View;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner;->getItemLayoutId()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseImageBanner;->getImageViewId()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Landroid/widget/ImageView;

    .line 23
    .line 24
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 25
    .line 26
    invoke-direct {v2, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Landroid/widget/ImageView;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->j(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {p1}, Lk/r;->a(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-object v0
.end method

.method public q(Landroid/widget/TextView;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->j(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Lk/r;->a(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
