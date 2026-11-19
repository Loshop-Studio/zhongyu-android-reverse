.class public Lcom/xuexiang/xui/widget/progress/materialprogressbar/CircularProgressDrawable;
.super Lcom/xuexiang/xui/widget/progress/materialprogressbar/BaseProgressLayerDrawable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/xuexiang/xui/widget/progress/materialprogressbar/BaseProgressLayerDrawable<",
        "Lcom/xuexiang/xui/widget/progress/materialprogressbar/SingleCircularProgressDrawable;",
        "Lcom/xuexiang/xui/widget/progress/materialprogressbar/CircularProgressBackgroundDrawable;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(ILandroid/content/Context;)V
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Landroid/graphics/drawable/Drawable;

    new-instance v1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/CircularProgressBackgroundDrawable;

    invoke-direct {v1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/CircularProgressBackgroundDrawable;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/SingleCircularProgressDrawable;

    invoke-direct {v1, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/SingleCircularProgressDrawable;-><init>(I)V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    new-instance v1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/SingleCircularProgressDrawable;

    invoke-direct {v1, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/SingleCircularProgressDrawable;-><init>(I)V

    const/4 p1, 0x2

    aput-object v1, v0, p1

    invoke-direct {p0, v0, p2}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/BaseProgressLayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic getShowBackground()Z
    .locals 1

    invoke-super {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/BaseProgressLayerDrawable;->getShowBackground()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic getUseIntrinsicPadding()Z
    .locals 1

    invoke-super {p0}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/BaseProgressLayerDrawable;->getUseIntrinsicPadding()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic setShowBackground(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/BaseProgressLayerDrawable;->setShowBackground(Z)V

    return-void
.end method

.method public bridge synthetic setTint(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/BaseProgressLayerDrawable;->setTint(I)V

    return-void
.end method

.method public bridge synthetic setTintList(Landroid/content/res/ColorStateList;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/BaseProgressLayerDrawable;->setTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public bridge synthetic setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/BaseProgressLayerDrawable;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public bridge synthetic setUseIntrinsicPadding(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/BaseProgressLayerDrawable;->setUseIntrinsicPadding(Z)V

    return-void
.end method
