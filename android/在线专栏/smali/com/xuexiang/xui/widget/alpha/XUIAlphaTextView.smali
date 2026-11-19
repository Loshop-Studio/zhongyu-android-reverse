.class public Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;
.super Landroidx/appcompat/widget/AppCompatTextView;
.source "SourceFile"


# instance fields
.field private mAlphaViewHelper:Lcom/xuexiang/xui/widget/alpha/IAlphaViewHelper;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private getAlphaViewHelper()Lcom/xuexiang/xui/widget/alpha/IAlphaViewHelper;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;->mAlphaViewHelper:Lcom/xuexiang/xui/widget/alpha/IAlphaViewHelper;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaViewHelper;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaViewHelper;-><init>(Landroid/view/View;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;->mAlphaViewHelper:Lcom/xuexiang/xui/widget/alpha/IAlphaViewHelper;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;->mAlphaViewHelper:Lcom/xuexiang/xui/widget/alpha/IAlphaViewHelper;

    return-object v0
.end method


# virtual methods
.method public setChangeAlphaWhenDisable(Z)V
    .locals 1

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;->getAlphaViewHelper()Lcom/xuexiang/xui/widget/alpha/IAlphaViewHelper;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/alpha/IAlphaViewHelper;->setChangeAlphaWhenDisable(Z)V

    return-void
.end method

.method public setChangeAlphaWhenPress(Z)V
    .locals 1

    invoke-direct {p0}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;->getAlphaViewHelper()Lcom/xuexiang/xui/widget/alpha/IAlphaViewHelper;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/alpha/IAlphaViewHelper;->setChangeAlphaWhenPress(Z)V

    return-void
.end method

.method public setEnabled(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;->getAlphaViewHelper()Lcom/xuexiang/xui/widget/alpha/IAlphaViewHelper;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lcom/xuexiang/xui/widget/alpha/IAlphaViewHelper;->onEnabledChanged(Landroid/view/View;Z)V

    return-void
.end method

.method public setPressed(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/TextView;->setPressed(Z)V

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;->getAlphaViewHelper()Lcom/xuexiang/xui/widget/alpha/IAlphaViewHelper;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lcom/xuexiang/xui/widget/alpha/IAlphaViewHelper;->onPressedChanged(Landroid/view/View;Z)V

    return-void
.end method
