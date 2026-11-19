.class public Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->s()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$d;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
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
    .locals 0

    .line 1
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$d;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 10
    .line 11
    iget-object p3, p2, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 12
    .line 13
    iget-boolean p3, p3, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->k0:Z

    .line 14
    .line 15
    const/4 p4, 0x0

    .line 16
    if-nez p3, :cond_1

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    const/4 p4, 0x1

    .line 21
    :cond_0
    sget-object p3, Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;

    .line 22
    .line 23
    invoke-virtual {p2, p3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->f(Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    xor-int/lit8 p3, p4, 0x1

    .line 28
    .line 29
    invoke-virtual {p2, p3}, Landroid/view/View;->setEnabled(Z)V

    .line 30
    .line 31
    .line 32
    :cond_1
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$d;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 33
    .line 34
    invoke-virtual {p2, p1, p4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->o(IZ)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$d;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 38
    .line 39
    iget-object p1, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 40
    .line 41
    iget-boolean p2, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->m0:Z

    .line 42
    .line 43
    if-nez p2, :cond_2

    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    const/4 p1, 0x0

    .line 50
    throw p1
.end method
