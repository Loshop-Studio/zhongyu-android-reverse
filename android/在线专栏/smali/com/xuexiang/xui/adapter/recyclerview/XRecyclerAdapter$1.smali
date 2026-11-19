.class Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;

.field final synthetic val$holder:Landroidx/recyclerview/widget/RecyclerView$b0;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;Landroidx/recyclerview/widget/RecyclerView$b0;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter$1;->this$0:Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;

    iput-object p2, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter$1;->val$holder:Landroidx/recyclerview/widget/RecyclerView$b0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    iget-object p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter$1;->this$0:Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;

    invoke-static {p1}, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->access$000(Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;)Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$OnItemClickListener;

    move-result-object p1

    iget-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter$1;->val$holder:Landroidx/recyclerview/widget/RecyclerView$b0;

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView$b0;->itemView:Landroid/view/View;

    iget-object v2, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter$1;->this$0:Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$b0;->getLayoutPosition()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter$1;->val$holder:Landroidx/recyclerview/widget/RecyclerView$b0;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$b0;->getLayoutPosition()I

    move-result v2

    invoke-interface {p1, v1, v0, v2}, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$OnItemClickListener;->onItemClick(Landroid/view/View;Ljava/lang/Object;I)V

    return-void
.end method
