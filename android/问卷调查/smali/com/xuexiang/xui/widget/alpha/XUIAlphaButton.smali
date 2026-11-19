.class public Lcom/xuexiang/xui/widget/alpha/XUIAlphaButton;
.super La/b/h/f;
.source ""


# instance fields
.field public d:Lb/c/a/e/a/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, La/b/h/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private getAlphaViewHelper()Lb/c/a/e/a/a;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaButton;->d:Lb/c/a/e/a/a;

    if-nez v0, :cond_0

    new-instance v0, Lb/c/a/e/a/c;

    invoke-direct {v0, p0}, Lb/c/a/e/a/c;-><init>(Landroid/view/View;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaButton;->d:Lb/c/a/e/a/a;

    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaButton;->d:Lb/c/a/e/a/a;

    return-object v0
.end method


# virtual methods
.method public setChangeAlphaWhenDisable(Z)V
    .locals 1

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaButton;->getAlphaViewHelper()Lb/c/a/e/a/a;

    move-result-object v0

    check-cast v0, Lb/c/a/e/a/c;

    invoke-virtual {v0, p1}, Lb/c/a/e/a/c;->c(Z)V

    return-void
.end method

.method public setChangeAlphaWhenPress(Z)V
    .locals 1

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaButton;->getAlphaViewHelper()Lb/c/a/e/a/a;

    move-result-object v0

    check-cast v0, Lb/c/a/e/a/c;

    .line 1
    iput-boolean p1, v0, Lb/c/a/e/a/c;->b:Z

    return-void
.end method

.method public setEnabled(Z)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/Button;->setEnabled(Z)V

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaButton;->getAlphaViewHelper()Lb/c/a/e/a/a;

    move-result-object v0

    check-cast v0, Lb/c/a/e/a/c;

    invoke-virtual {v0, p0, p1}, Lb/c/a/e/a/c;->a(Landroid/view/View;Z)V

    return-void
.end method

.method public setPressed(Z)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/Button;->setPressed(Z)V

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaButton;->getAlphaViewHelper()Lb/c/a/e/a/a;

    move-result-object v0

    check-cast v0, Lb/c/a/e/a/c;

    invoke-virtual {v0, p0, p1}, Lb/c/a/e/a/c;->b(Landroid/view/View;Z)V

    return-void
.end method
