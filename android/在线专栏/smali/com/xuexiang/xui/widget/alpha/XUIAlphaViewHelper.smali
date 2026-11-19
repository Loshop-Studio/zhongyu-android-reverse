.class public Lcom/xuexiang/xui/widget/alpha/XUIAlphaViewHelper;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/alpha/IAlphaViewHelper;


# instance fields
.field private mChangeAlphaWhenDisable:Z

.field private mChangeAlphaWhenPress:Z

.field private mDisabledAlpha:F

.field private mNormalAlpha:F

.field private mPressedAlpha:F

.field private mTarget:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    iput v0, p0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaViewHelper;->mNormalAlpha:F

    .line 3
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaViewHelper;->mTarget:Ljava/lang/ref/WeakReference;

    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$attr;->xui_switch_alpha_pressed:I

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveBoolean(Landroid/content/Context;IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaViewHelper;->mChangeAlphaWhenPress:Z

    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$attr;->xui_switch_alpha_disabled:I

    invoke-static {v0, v1, v2}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveBoolean(Landroid/content/Context;IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaViewHelper;->mChangeAlphaWhenDisable:Z

    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$attr;->xui_alpha_pressed:I

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-static {v0, v1, v2}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveFloat(Landroid/content/Context;IF)F

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaViewHelper;->mPressedAlpha:F

    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v0, Lcom/xuexiang/xui/R$attr;->xui_alpha_disabled:I

    invoke-static {p1, v0, v2}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveFloat(Landroid/content/Context;IF)F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaViewHelper;->mDisabledAlpha:F

    return-void
.end method

.method public constructor <init>(Landroid/view/View;FF)V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 9
    iput v0, p0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaViewHelper;->mNormalAlpha:F

    .line 10
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaViewHelper;->mTarget:Ljava/lang/ref/WeakReference;

    .line 11
    iput p2, p0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaViewHelper;->mPressedAlpha:F

    .line 12
    iput p3, p0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaViewHelper;->mDisabledAlpha:F

    return-void
.end method


# virtual methods
.method public onEnabledChanged(Landroid/view/View;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaViewHelper;->mTarget:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaViewHelper;->mChangeAlphaWhenDisable:Z

    if-eqz v1, :cond_2

    if-eqz p2, :cond_1

    .line 3
    iget v1, p0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaViewHelper;->mNormalAlpha:F

    goto :goto_0

    :cond_1
    iget v1, p0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaViewHelper;->mDisabledAlpha:F

    goto :goto_0

    .line 4
    :cond_2
    iget v1, p0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaViewHelper;->mNormalAlpha:F

    :goto_0
    if-eq p1, v0, :cond_3

    .line 5
    invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z

    move-result p1

    if-eq p1, p2, :cond_3

    .line 6
    invoke-virtual {v0, p2}, Landroid/view/View;->setEnabled(Z)V

    .line 7
    :cond_3
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method public onPressedChanged(Landroid/view/View;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaViewHelper;->mTarget:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 3
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaViewHelper;->mChangeAlphaWhenPress:Z

    if-eqz v1, :cond_1

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->isClickable()Z

    move-result p1

    if-eqz p1, :cond_1

    iget p1, p0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaViewHelper;->mPressedAlpha:F

    goto :goto_0

    :cond_1
    iget p1, p0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaViewHelper;->mNormalAlpha:F

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    goto :goto_1

    .line 4
    :cond_2
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaViewHelper;->mChangeAlphaWhenDisable:Z

    if-eqz p1, :cond_3

    .line 5
    iget p1, p0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaViewHelper;->mDisabledAlpha:F

    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    :cond_3
    :goto_1
    return-void
.end method

.method public setChangeAlphaWhenDisable(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaViewHelper;->mChangeAlphaWhenDisable:Z

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaViewHelper;->mTarget:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->isEnabled()Z

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaViewHelper;->onEnabledChanged(Landroid/view/View;Z)V

    :cond_0
    return-void
.end method

.method public setChangeAlphaWhenPress(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaViewHelper;->mChangeAlphaWhenPress:Z

    return-void
.end method
