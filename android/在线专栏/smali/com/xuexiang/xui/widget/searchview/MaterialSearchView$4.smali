.class Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$4;->this$0:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$4;->this$0:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->access$500(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)Landroid/widget/ImageButton;

    move-result-object v0

    if-ne p1, v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$4;->this$0:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->closeSearch()V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$4;->this$0:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->access$600(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)Landroid/widget/ImageButton;

    move-result-object v0

    if-ne p1, v0, :cond_1

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$4;->this$0:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->access$700(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)V

    goto :goto_0

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$4;->this$0:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->access$800(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)Landroid/widget/ImageButton;

    move-result-object v0

    if-ne p1, v0, :cond_2

    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$4;->this$0:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->access$400(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)Landroid/widget/EditText;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$4;->this$0:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->access$400(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)Landroid/widget/EditText;

    move-result-object v0

    if-ne p1, v0, :cond_3

    .line 8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$4;->this$0:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->showSuggestions()V

    goto :goto_0

    .line 9
    :cond_3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$4;->this$0:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;

    invoke-static {v0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->access$900(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)Landroid/view/View;

    move-result-object v0

    if-ne p1, v0, :cond_4

    .line 10
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$4;->this$0:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->closeSearch()V

    :cond_4
    :goto_0
    return-void
.end method
