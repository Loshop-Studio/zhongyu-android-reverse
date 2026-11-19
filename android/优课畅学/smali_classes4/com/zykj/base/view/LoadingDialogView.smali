.class public final Lcom/zykj/base/view/LoadingDialogView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public a:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

.field public b:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 7
    .line 8
    .line 9
    const/16 p2, 0x8

    .line 10
    .line 11
    iput p2, p0, Lcom/zykj/base/view/LoadingDialogView;->b:I

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/zykj/base/view/LoadingDialogView;->a(Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private final setDialogVisibility(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/base/view/LoadingDialogView;->b:I

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/zykj/base/view/LoadingDialogView;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 6
    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->show()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object p1, p0, Lcom/zykj/base/view/LoadingDialogView;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->dismiss()V

    .line 18
    .line 19
    .line 20
    :cond_1
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->s()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string v0, "\u63d0\u793a"

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->H(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v0, "\u6b63\u5728\u52a0\u8f7d"

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->j(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const/4 v0, 0x1

    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-virtual {p1, v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->B(ZI)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->D(Z)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->c()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Lcom/zykj/base/view/LoadingDialogView;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 37
    .line 38
    return-void
.end method

.method public getVisibility()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/base/view/LoadingDialogView;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public onDetachedFromWindow()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/base/view/LoadingDialogView;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->dismiss()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/zykj/base/view/LoadingDialogView;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 10
    .line 11
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public onMeasure(II)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public setVisibility(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/base/view/LoadingDialogView;->setDialogVisibility(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
