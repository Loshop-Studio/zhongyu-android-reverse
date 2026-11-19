.class public Lcom/xuexiang/xui/widget/dialog/LoadingDialog;
.super Lcom/xuexiang/xui/widget/dialog/BaseDialog;
.source "SourceFile"


# instance fields
.field public c:Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;


# direct methods
.method public static synthetic d(Lcom/xuexiang/xui/widget/dialog/LoadingDialog;)Lq2/a;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method


# virtual methods
.method public b()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/xuexiang/xui/widget/dialog/BaseDialog;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/LoadingDialog;->c:Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->g()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public dismiss()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/LoadingDialog;->c:Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/progress/loading/ARCLoadingView;->h()V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatDialog;->dismiss()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setCancelable(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    new-instance p1, Lcom/xuexiang/xui/widget/dialog/LoadingDialog$a;

    .line 7
    .line 8
    invoke-direct {p1, p0}, Lcom/xuexiang/xui/widget/dialog/LoadingDialog$a;-><init>(Lcom/xuexiang/xui/widget/dialog/LoadingDialog;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
