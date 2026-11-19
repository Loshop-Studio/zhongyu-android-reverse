.class Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$1;->onGlobalLayout()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$1;

.field final synthetic val$fSelectedIndex:I


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$1;I)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$1$1;->this$1:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$1;

    iput p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$1$1;->val$fSelectedIndex:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$1$1;->this$1:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$1;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$1;->this$0:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->requestFocus()Z

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$1$1;->this$1:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$1;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$1;->this$0:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->builder:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->layoutManager:Landroidx/recyclerview/widget/RecyclerView$o;

    iget v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$1$1;->val$fSelectedIndex:I

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$o;->scrollToPosition(I)V

    return-void
.end method
