.class Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->checkIfListInitScroll()V
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

    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$1;->this$0:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$1;->this$0:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$1;->this$0:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->listType:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$ListType;

    sget-object v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$ListType;->SINGLE:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$ListType;

    if-eq v1, v2, :cond_0

    sget-object v3, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$ListType;->MULTI:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$ListType;

    if-ne v1, v3, :cond_4

    :cond_0
    if-ne v1, v2, :cond_1

    .line 3
    iget-object v0, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->builder:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;

    iget v0, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$Builder;->selectedIndex:I

    if-gez v0, :cond_3

    return-void

    .line 4
    :cond_1
    iget-object v0, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->selectedIndicesList:Ljava/util/List;

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    .line 5
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$1;->this$0:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->selectedIndicesList:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$1;->this$0:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    iget-object v0, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->selectedIndicesList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 7
    :cond_3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$1;->this$0:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    iget-object v1, v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$1$1;

    invoke-direct {v2, p0, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$1$1;-><init>(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$1;I)V

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    :cond_4
    :goto_0
    return-void
.end method
