.class public abstract Lcom/xuexiang/xui/adapter/recyclerview/BaseRecyclerAdapter;
.super Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter<",
        "TT;",
        "Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic b(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/adapter/recyclerview/BaseRecyclerAdapter;->e(Landroid/view/ViewGroup;I)Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public abstract d(I)I
.end method

.method public e(Landroid/view/ViewGroup;I)Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;
    .locals 1

    .line 1
    new-instance v0, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/adapter/recyclerview/BaseRecyclerAdapter;->d(I)I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->c(Landroid/view/ViewGroup;I)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {v0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;-><init>(Landroid/view/View;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method
