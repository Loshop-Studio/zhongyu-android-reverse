.class public Lcom/xuexiang/xui/widget/alpha/XUIAlphaImageButton;
.super Landroidx/appcompat/widget/AppCompatImageButton;
.source "SourceFile"


# instance fields
.field public a:Ll0/a;


# direct methods
.method private getAlphaViewHelper()Ll0/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaImageButton;->a:Ll0/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ll0/c;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Ll0/c;-><init>(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaImageButton;->a:Ll0/a;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaImageButton;->a:Ll0/a;

    .line 13
    .line 14
    return-object v0
.end method


# virtual methods
.method public setChangeAlphaWhenDisable(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaImageButton;->getAlphaViewHelper()Ll0/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Ll0/a;->b(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setChangeAlphaWhenPress(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaImageButton;->getAlphaViewHelper()Ll0/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Ll0/a;->a(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setEnabled(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/ImageButton;->setEnabled(Z)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaImageButton;->getAlphaViewHelper()Ll0/a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0, p0, p1}, Ll0/a;->c(Landroid/view/View;Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setPressed(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/ImageButton;->setPressed(Z)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaImageButton;->getAlphaViewHelper()Ll0/a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0, p0, p1}, Ll0/a;->d(Landroid/view/View;Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
