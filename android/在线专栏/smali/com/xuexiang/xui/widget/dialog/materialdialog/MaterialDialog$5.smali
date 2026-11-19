.class Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->showKeyboard(Landroid/content/DialogInterface;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

.field final synthetic val$builder:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

.field final synthetic val$dialog:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$5;->this$0:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$5;->val$dialog:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    iput-object p3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$5;->val$builder:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$5;->val$dialog:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->getInputEditText()Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$5;->val$builder:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    .line 3
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    if-eqz v0, :cond_0

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$5;->val$dialog:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->getInputEditText()Landroid/widget/EditText;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    :cond_0
    return-void
.end method
