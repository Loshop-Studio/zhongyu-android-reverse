.class Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;->viewClick(ILcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$OnViewItemClickListener;Ljava/lang/Object;I)Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;

.field final synthetic val$item:Ljava/lang/Object;

.field final synthetic val$listener:Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$OnViewItemClickListener;

.field final synthetic val$position:I


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$OnViewItemClickListener;Ljava/lang/Object;I)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$1;->this$0:Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;

    iput-object p2, p0, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$1;->val$listener:Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$OnViewItemClickListener;

    iput-object p3, p0, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$1;->val$item:Ljava/lang/Object;

    iput p4, p0, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$1;->val$position:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$1;->val$listener:Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$OnViewItemClickListener;

    iget-object v1, p0, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$1;->val$item:Ljava/lang/Object;

    iget v2, p0, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$1;->val$position:I

    invoke-interface {v0, p1, v1, v2}, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$OnViewItemClickListener;->onViewItemClick(Landroid/view/View;Ljava/lang/Object;I)V

    return-void
.end method
