.class public Lb/c/a/e/a/b;
.super Landroid/widget/LinearLayout;
.source ""


# instance fields
.field public b:Lb/c/a/e/a/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private getAlphaViewHelper()Lb/c/a/e/a/a;
    .locals 1

    iget-object v0, p0, Lb/c/a/e/a/b;->b:Lb/c/a/e/a/a;

    if-nez v0, :cond_0

    new-instance v0, Lb/c/a/e/a/c;

    invoke-direct {v0, p0}, Lb/c/a/e/a/c;-><init>(Landroid/view/View;)V

    iput-object v0, p0, Lb/c/a/e/a/b;->b:Lb/c/a/e/a/a;

    :cond_0
    iget-object v0, p0, Lb/c/a/e/a/b;->b:Lb/c/a/e/a/a;

    return-object v0
.end method


# virtual methods
.method public setChangeAlphaWhenDisable(Z)V
    .locals 1

    invoke-direct {p0}, Lb/c/a/e/a/b;->getAlphaViewHelper()Lb/c/a/e/a/a;

    move-result-object v0

    check-cast v0, Lb/c/a/e/a/c;

    invoke-virtual {v0, p1}, Lb/c/a/e/a/c;->c(Z)V

    return-void
.end method

.method public setChangeAlphaWhenPress(Z)V
    .locals 1

    invoke-direct {p0}, Lb/c/a/e/a/b;->getAlphaViewHelper()Lb/c/a/e/a/a;

    move-result-object v0

    check-cast v0, Lb/c/a/e/a/c;

    .line 1
    iput-boolean p1, v0, Lb/c/a/e/a/c;->b:Z

    return-void
.end method

.method public setEnabled(Z)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    invoke-direct {p0}, Lb/c/a/e/a/b;->getAlphaViewHelper()Lb/c/a/e/a/a;

    move-result-object v0

    check-cast v0, Lb/c/a/e/a/c;

    invoke-virtual {v0, p0, p1}, Lb/c/a/e/a/c;->a(Landroid/view/View;Z)V

    return-void
.end method

.method public setPressed(Z)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->setPressed(Z)V

    invoke-direct {p0}, Lb/c/a/e/a/b;->getAlphaViewHelper()Lb/c/a/e/a/a;

    move-result-object v0

    check-cast v0, Lb/c/a/e/a/c;

    invoke-virtual {v0, p0, p1}, Lb/c/a/e/a/c;->b(Landroid/view/View;Z)V

    return-void
.end method
