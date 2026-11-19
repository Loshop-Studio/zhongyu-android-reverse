.class public Lcom/xuexiang/xui/widget/dialog/MiniLoadingDialog;
.super Lcom/xuexiang/xui/widget/dialog/BaseDialog;
.source "SourceFile"


# static fields
.field public static final synthetic a:I


# virtual methods
.method public final setCancelable(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    new-instance p1, Lh2/a;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-direct {p1, p0, v0}, Lh2/a;-><init>(Lcom/xuexiang/xui/widget/dialog/BaseDialog;I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method
