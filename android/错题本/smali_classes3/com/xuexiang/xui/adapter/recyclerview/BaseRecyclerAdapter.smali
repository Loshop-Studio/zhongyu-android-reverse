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
.method public final b(Landroid/view/ViewGroup;I)Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;
    .locals 3

    .line 1
    new-instance p2, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/adapter/recyclerview/BaseRecyclerAdapter;->c()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {v1, v0, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {p2, p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 21
    .line 22
    .line 23
    new-instance p1, Landroid/util/SparseArray;

    .line 24
    .line 25
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 26
    .line 27
    .line 28
    return-object p2
.end method

.method public abstract c()I
.end method
