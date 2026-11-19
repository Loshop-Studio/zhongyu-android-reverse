.class Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView$1;
.super Landroidx/recyclerview/widget/RecyclerView$s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$s;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$s;->onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V

    return-void
.end method

.method public onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$s;->onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;

    const/4 p2, -0x1

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->canScrollVertically(I)Z

    move-result p1

    if-nez p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;->access$000(Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;)Lcom/xuexiang/xui/widget/layout/linkage/ChildLinkageEvent;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;->access$000(Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;)Lcom/xuexiang/xui/widget/layout/linkage/ChildLinkageEvent;

    move-result-object p1

    iget-object p2, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;

    invoke-interface {p1, p2}, Lcom/xuexiang/xui/widget/layout/linkage/ChildLinkageEvent;->onContentScrollToTop(Landroid/view/View;)V

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->canScrollVertically(I)Z

    move-result p1

    if-nez p1, :cond_1

    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;->access$000(Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;)Lcom/xuexiang/xui/widget/layout/linkage/ChildLinkageEvent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;->access$000(Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;)Lcom/xuexiang/xui/widget/layout/linkage/ChildLinkageEvent;

    move-result-object p1

    iget-object p2, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;

    invoke-interface {p1, p2}, Lcom/xuexiang/xui/widget/layout/linkage/ChildLinkageEvent;->onContentScrollToBottom(Landroid/view/View;)V

    .line 8
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;->access$000(Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;)Lcom/xuexiang/xui/widget/layout/linkage/ChildLinkageEvent;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;->access$000(Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;)Lcom/xuexiang/xui/widget/layout/linkage/ChildLinkageEvent;

    move-result-object p1

    iget-object p2, p0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView$1;->this$0:Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageRecyclerView;

    invoke-interface {p1, p2}, Lcom/xuexiang/xui/widget/layout/linkage/ChildLinkageEvent;->onContentScroll(Landroid/view/View;)V

    :cond_2
    return-void
.end method
