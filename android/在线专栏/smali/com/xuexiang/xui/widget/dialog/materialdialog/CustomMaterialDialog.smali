.class public abstract Lcom/xuexiang/xui/widget/dialog/materialdialog/CustomMaterialDialog;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected mDialog:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/CustomMaterialDialog;->getDialogBuilder(Landroid/content/Context;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->build()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/CustomMaterialDialog;->mDialog:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 3
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/CustomMaterialDialog;->initViews(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public dismiss()Lcom/xuexiang/xui/widget/dialog/materialdialog/CustomMaterialDialog;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/xuexiang/xui/widget/dialog/materialdialog/CustomMaterialDialog;",
            ">()TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/CustomMaterialDialog;->mDialog:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->dismiss()V

    :cond_0
    return-object p0
.end method

.method public findViewById(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/CustomMaterialDialog;->mDialog:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public getDialog()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/CustomMaterialDialog;->mDialog:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    return-object v0
.end method

.method protected abstract getDialogBuilder(Landroid/content/Context;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;
.end method

.method protected abstract initViews(Landroid/content/Context;)V
.end method

.method public show()Lcom/xuexiang/xui/widget/dialog/materialdialog/CustomMaterialDialog;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/xuexiang/xui/widget/dialog/materialdialog/CustomMaterialDialog;",
            ">()TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/CustomMaterialDialog;->mDialog:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->show()V

    :cond_0
    return-object p0
.end method
