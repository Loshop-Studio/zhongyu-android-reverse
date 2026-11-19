.class public Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/dialog/strategy/IDialogStrategy;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public showConfirmDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;Ljava/lang/String;)Landroid/app/Dialog;
    .locals 1

    .line 20
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    invoke-direct {v0, p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 21
    invoke-virtual {v0, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->content(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 22
    invoke-virtual {p1, p3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->positiveText(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    new-instance p2, Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy$7;

    invoke-direct {p2, p0, p4}, Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy$7;-><init>(Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy;Landroid/content/DialogInterface$OnClickListener;)V

    .line 23
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->onPositive(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$SingleButtonCallback;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 24
    invoke-virtual {p1, p5}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->negativeText(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    new-instance p2, Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy$6;

    invoke-direct {p2, p0}, Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy$6;-><init>(Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy;)V

    .line 25
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->onNegative(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$SingleButtonCallback;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    const/4 p2, 0x0

    .line 26
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->cancelable(Z)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 27
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->autoDismiss(Z)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 28
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->show()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    move-result-object p1

    return-object p1
.end method

.method public showConfirmDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/Dialog;
    .locals 1

    .line 11
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    invoke-direct {v0, p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 12
    invoke-virtual {v0, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->content(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 13
    invoke-virtual {p1, p3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->positiveText(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    new-instance p2, Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy$5;

    invoke-direct {p2, p0, p4}, Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy$5;-><init>(Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy;Landroid/content/DialogInterface$OnClickListener;)V

    .line 14
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->onPositive(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$SingleButtonCallback;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 15
    invoke-virtual {p1, p5}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->negativeText(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    new-instance p2, Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy$4;

    invoke-direct {p2, p0, p6}, Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy$4;-><init>(Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy;Landroid/content/DialogInterface$OnClickListener;)V

    .line 16
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->onNegative(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$SingleButtonCallback;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    const/4 p2, 0x0

    .line 17
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->cancelable(Z)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 18
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->autoDismiss(Z)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 19
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->show()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    move-result-object p1

    return-object p1
.end method

.method public showConfirmDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/Dialog;
    .locals 1

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    invoke-direct {v0, p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {v0, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->title(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 3
    invoke-virtual {p1, p3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->content(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 4
    invoke-virtual {p1, p4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->positiveText(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    new-instance p2, Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy$3;

    invoke-direct {p2, p0, p5}, Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy$3;-><init>(Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy;Landroid/content/DialogInterface$OnClickListener;)V

    .line 5
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->onPositive(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$SingleButtonCallback;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 6
    invoke-virtual {p1, p6}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->negativeText(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    new-instance p2, Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy$2;

    invoke-direct {p2, p0, p7}, Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy$2;-><init>(Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy;Landroid/content/DialogInterface$OnClickListener;)V

    .line 7
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->onNegative(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$SingleButtonCallback;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    const/4 p2, 0x0

    .line 8
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->cancelable(Z)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 9
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->autoDismiss(Z)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 10
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->show()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    move-result-object p1

    return-object p1
.end method

.method public showContextMenuDialog(Landroid/content/Context;Ljava/lang/String;ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/Dialog;
    .locals 1

    .line 6
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    invoke-direct {v0, p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 7
    invoke-virtual {v0, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->title(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 8
    invoke-virtual {p1, p3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->items(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    new-instance p2, Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy$12;

    invoke-direct {p2, p0, p4}, Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy$12;-><init>(Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy;Landroid/content/DialogInterface$OnClickListener;)V

    .line 9
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->itemsCallback(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$ListCallback;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 10
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->show()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    move-result-object p1

    return-object p1
.end method

.method public showContextMenuDialog(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/Dialog;
    .locals 1

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    invoke-direct {v0, p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {v0, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->title(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 3
    invoke-virtual {p1, p3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->items([Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    new-instance p2, Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy$11;

    invoke-direct {p2, p0, p4}, Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy$11;-><init>(Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy;Landroid/content/DialogInterface$OnClickListener;)V

    .line 4
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->itemsCallback(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$ListCallback;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->show()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    move-result-object p1

    return-object p1
.end method

.method public showInputDialog(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Lcom/xuexiang/xui/widget/dialog/strategy/InputInfo;Lcom/xuexiang/xui/widget/dialog/strategy/InputCallback;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/Dialog;
    .locals 1

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    invoke-direct {v0, p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {v0, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->iconRes(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 3
    invoke-virtual {p1, p3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->title(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 4
    invoke-virtual {p1, p4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->content(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 5
    invoke-virtual {p5}, Lcom/xuexiang/xui/widget/dialog/strategy/InputInfo;->getInputType()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->inputType(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 6
    invoke-virtual {p5}, Lcom/xuexiang/xui/widget/dialog/strategy/InputInfo;->getHint()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p5}, Lcom/xuexiang/xui/widget/dialog/strategy/InputInfo;->getPreFill()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p5}, Lcom/xuexiang/xui/widget/dialog/strategy/InputInfo;->isAllowEmptyInput()Z

    move-result p4

    new-instance p5, Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy$10;

    invoke-direct {p5, p0, p6}, Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy$10;-><init>(Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy;Lcom/xuexiang/xui/widget/dialog/strategy/InputCallback;)V

    invoke-virtual {p1, p2, p3, p4, p5}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->input(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZLcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$InputCallback;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 7
    invoke-virtual {p1, p7}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->positiveText(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    new-instance p2, Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy$9;

    invoke-direct {p2, p0, p8}, Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy$9;-><init>(Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy;Landroid/content/DialogInterface$OnClickListener;)V

    .line 8
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->onPositive(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$SingleButtonCallback;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 9
    invoke-virtual {p1, p9}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->negativeText(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    new-instance p2, Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy$8;

    invoke-direct {p2, p0, p10}, Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy$8;-><init>(Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy;Landroid/content/DialogInterface$OnClickListener;)V

    .line 10
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->onNegative(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$SingleButtonCallback;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    const/4 p2, 0x0

    .line 11
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->cancelable(Z)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 12
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->autoDismiss(Z)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 13
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->show()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    move-result-object p1

    return-object p1
.end method

.method public showSingleChoiceDialog(Landroid/content/Context;Ljava/lang/String;IILandroid/content/DialogInterface$OnClickListener;Ljava/lang/String;Ljava/lang/String;)Landroid/app/Dialog;
    .locals 1

    .line 9
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    invoke-direct {v0, p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 10
    invoke-virtual {v0, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->title(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 11
    invoke-virtual {p1, p3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->items(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    new-instance p2, Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy$14;

    invoke-direct {p2, p0, p5}, Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy$14;-><init>(Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy;Landroid/content/DialogInterface$OnClickListener;)V

    .line 12
    invoke-virtual {p1, p4, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->itemsCallbackSingleChoice(ILcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$ListCallbackSingleChoice;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 13
    invoke-virtual {p1, p6}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->positiveText(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 14
    invoke-virtual {p1, p7}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->negativeText(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    const/4 p2, 0x0

    .line 15
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->cancelable(Z)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 16
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->show()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    move-result-object p1

    return-object p1
.end method

.method public showSingleChoiceDialog(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;ILandroid/content/DialogInterface$OnClickListener;Ljava/lang/String;Ljava/lang/String;)Landroid/app/Dialog;
    .locals 1

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    invoke-direct {v0, p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {v0, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->title(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 3
    invoke-virtual {p1, p3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->items([Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    new-instance p2, Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy$13;

    invoke-direct {p2, p0, p5}, Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy$13;-><init>(Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy;Landroid/content/DialogInterface$OnClickListener;)V

    .line 4
    invoke-virtual {p1, p4, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->itemsCallbackSingleChoice(ILcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$ListCallbackSingleChoice;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 5
    invoke-virtual {p1, p6}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->positiveText(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 6
    invoke-virtual {p1, p7}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->negativeText(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    const/4 p2, 0x0

    .line 7
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->cancelable(Z)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 8
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->show()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    move-result-object p1

    return-object p1
.end method

.method public showTipDialog(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/Dialog;
    .locals 1

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    invoke-direct {v0, p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {v0, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->iconRes(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 3
    invoke-virtual {p1, p3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->title(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 4
    invoke-virtual {p1, p4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->content(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 5
    invoke-virtual {p1, p5}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->positiveText(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    new-instance p2, Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy$1;

    invoke-direct {p2, p0, p6}, Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy$1;-><init>(Lcom/xuexiang/xui/widget/dialog/strategy/impl/MaterialDialogStrategy;Landroid/content/DialogInterface$OnClickListener;)V

    .line 6
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->onPositive(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$SingleButtonCallback;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    const/4 p2, 0x0

    .line 7
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->cancelable(Z)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 8
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->autoDismiss(Z)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 9
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->show()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    move-result-object p1

    return-object p1
.end method

.method public showTipDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/app/Dialog;
    .locals 1

    .line 10
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    invoke-direct {v0, p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 11
    invoke-virtual {v0, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->title(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 12
    invoke-virtual {p1, p3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->content(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 13
    invoke-virtual {p1, p4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->positiveText(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    move-result-object p1

    .line 14
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->show()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    move-result-object p1

    return-object p1
.end method
