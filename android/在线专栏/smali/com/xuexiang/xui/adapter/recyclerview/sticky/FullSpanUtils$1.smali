.class final Lcom/xuexiang/xui/adapter/recyclerview/sticky/FullSpanUtils$1;
.super Landroidx/recyclerview/widget/GridLayoutManager$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/adapter/recyclerview/sticky/FullSpanUtils;->onAttachedToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$g;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$adapter:Landroidx/recyclerview/widget/RecyclerView$g;

.field final synthetic val$gridLayoutManager:Landroidx/recyclerview/widget/GridLayoutManager;

.field final synthetic val$oldSizeLookup:Landroidx/recyclerview/widget/GridLayoutManager$b;

.field final synthetic val$pinnedHeaderType:I


# direct methods
.method constructor <init>(Landroidx/recyclerview/widget/RecyclerView$g;ILandroidx/recyclerview/widget/GridLayoutManager;Landroidx/recyclerview/widget/GridLayoutManager$b;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/FullSpanUtils$1;->val$adapter:Landroidx/recyclerview/widget/RecyclerView$g;

    iput p2, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/FullSpanUtils$1;->val$pinnedHeaderType:I

    iput-object p3, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/FullSpanUtils$1;->val$gridLayoutManager:Landroidx/recyclerview/widget/GridLayoutManager;

    iput-object p4, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/FullSpanUtils$1;->val$oldSizeLookup:Landroidx/recyclerview/widget/GridLayoutManager$b;

    invoke-direct {p0}, Landroidx/recyclerview/widget/GridLayoutManager$b;-><init>()V

    return-void
.end method


# virtual methods
.method public getSpanSize(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/FullSpanUtils$1;->val$adapter:Landroidx/recyclerview/widget/RecyclerView$g;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$g;->getItemViewType(I)I

    move-result v0

    iget v1, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/FullSpanUtils$1;->val$pinnedHeaderType:I

    if-ne v0, v1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/FullSpanUtils$1;->val$gridLayoutManager:Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager;->getSpanCount()I

    move-result p1

    return p1

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/sticky/FullSpanUtils$1;->val$oldSizeLookup:Landroidx/recyclerview/widget/GridLayoutManager$b;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/GridLayoutManager$b;->getSpanSize(I)I

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method
