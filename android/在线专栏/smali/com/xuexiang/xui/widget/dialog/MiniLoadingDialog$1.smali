.class Lcom/xuexiang/xui/widget/dialog/MiniLoadingDialog$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/dialog/MiniLoadingDialog;->setCancelable(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/dialog/MiniLoadingDialog;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/dialog/MiniLoadingDialog;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/MiniLoadingDialog$1;->this$0:Lcom/xuexiang/xui/widget/dialog/MiniLoadingDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/MiniLoadingDialog$1;->this$0:Lcom/xuexiang/xui/widget/dialog/MiniLoadingDialog;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/dialog/MiniLoadingDialog;->access$000(Lcom/xuexiang/xui/widget/dialog/MiniLoadingDialog;)Lcom/xuexiang/xui/widget/progress/loading/LoadingCancelListener;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/MiniLoadingDialog$1;->this$0:Lcom/xuexiang/xui/widget/dialog/MiniLoadingDialog;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/dialog/MiniLoadingDialog;->access$000(Lcom/xuexiang/xui/widget/dialog/MiniLoadingDialog;)Lcom/xuexiang/xui/widget/progress/loading/LoadingCancelListener;

    move-result-object p1

    invoke-interface {p1}, Lcom/xuexiang/xui/widget/progress/loading/LoadingCancelListener;->onCancelLoading()V

    :cond_0
    return-void
.end method
