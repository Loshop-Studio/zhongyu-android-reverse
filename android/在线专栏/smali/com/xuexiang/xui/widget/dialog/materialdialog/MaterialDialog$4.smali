.class Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->setInternalInputCallback()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$4;->this$0:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 1

    .line 1
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    .line 2
    iget-object p3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$4;->this$0:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    iget-object p4, p3, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->builder:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    iget-boolean p4, p4, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->inputAllowEmpty:Z

    const/4 v0, 0x0

    if-nez p4, :cond_1

    if-nez p2, :cond_0

    const/4 p4, 0x1

    const/4 v0, 0x1

    .line 3
    :cond_0
    sget-object p4, Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;->POSITIVE:Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;

    invoke-virtual {p3, p4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->getActionButton(Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    move-result-object p3

    xor-int/lit8 p4, v0, 0x1

    .line 4
    invoke-virtual {p3, p4}, Landroid/view/View;->setEnabled(Z)V

    .line 5
    :cond_1
    iget-object p3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$4;->this$0:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    invoke-virtual {p3, p2, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->invalidateInputMinMaxIndicator(IZ)V

    .line 6
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$4;->this$0:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    iget-object p3, p2, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->builder:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    iget-boolean p4, p3, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->alwaysCallInputCallback:Z

    if-eqz p4, :cond_2

    .line 7
    iget-object p3, p3, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->inputCallback:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$InputCallback;

    invoke-interface {p3, p2, p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$InputCallback;->onInput(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Ljava/lang/CharSequence;)V

    :cond_2
    return-void
.end method
