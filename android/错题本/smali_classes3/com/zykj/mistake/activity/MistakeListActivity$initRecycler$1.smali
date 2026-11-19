.class public final Lcom/zykj/mistake/activity/MistakeListActivity$initRecycler$1;
.super Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\n\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "com/zykj/mistake/activity/MistakeListActivity$initRecycler$1",
        "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/mistake/activity/MistakeListActivity;

.field public final synthetic b:Landroidx/recyclerview/widget/GridLayoutManager;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/activity/MistakeListActivity;Landroidx/recyclerview/widget/GridLayoutManager;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/activity/MistakeListActivity$initRecycler$1;->a:Lcom/zykj/mistake/activity/MistakeListActivity;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/activity/MistakeListActivity$initRecycler$1;->b:Landroidx/recyclerview/widget/GridLayoutManager;

    .line 4
    .line 5
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 1

    .line 1
    const-string v0, "recyclerView"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;->onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 7
    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/mistake/activity/MistakeListActivity$initRecycler$1;->a:Lcom/zykj/mistake/activity/MistakeListActivity;

    .line 12
    .line 13
    iget p2, p1, Lcom/zykj/mistake/activity/MistakeListActivity;->j:I

    .line 14
    .line 15
    iget v0, p1, Lcom/zykj/mistake/activity/MistakeListActivity;->i:I

    .line 16
    .line 17
    add-int/2addr p2, v0

    .line 18
    iget-object v0, p0, Lcom/zykj/mistake/activity/MistakeListActivity$initRecycler$1;->b:Landroidx/recyclerview/widget/GridLayoutManager;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getItemCount()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-lt p2, v0, :cond_0

    .line 25
    .line 26
    iget-boolean p2, p1, Lcom/zykj/mistake/activity/MistakeListActivity;->k:Z

    .line 27
    .line 28
    if-eqz p2, :cond_0

    .line 29
    .line 30
    iget-boolean p2, p1, Lcom/zykj/mistake/activity/MistakeListActivity;->m:Z

    .line 31
    .line 32
    if-nez p2, :cond_0

    .line 33
    .line 34
    iget-boolean p2, p1, Lcom/zykj/mistake/activity/MistakeListActivity;->l:Z

    .line 35
    .line 36
    if-eqz p2, :cond_0

    .line 37
    .line 38
    iget-object p2, p1, Lcom/zykj/mistake/activity/MistakeListActivity;->n:Lcom/zykj/mistake/entity/req/MistakeListReq;

    .line 39
    .line 40
    invoke-virtual {p2}, Lcom/zykj/mistake/entity/req/MistakeListReq;->getSkipCount()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    add-int/lit8 v0, v0, 0x14

    .line 45
    .line 46
    invoke-virtual {p2, v0}, Lcom/zykj/mistake/entity/req/MistakeListReq;->setSkipCount(I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/zykj/mistake/base/BaseMVPActivity;->r()Lcom/zykj/mistake/base/BasePresenter;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Lcom/zykj/mistake/presenter/MistakeListPresenter;

    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    invoke-virtual {p1, p2, v0}, Lcom/zykj/mistake/presenter/MistakeListPresenter;->d(Lcom/zykj/mistake/entity/req/MistakeListReq;Z)V

    .line 57
    .line 58
    .line 59
    :cond_0
    return-void
.end method

.method public final onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 1

    .line 1
    const-string v0, "recyclerView"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;->onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lcom/zykj/mistake/activity/MistakeListActivity$initRecycler$1;->b:Landroidx/recyclerview/widget/GridLayoutManager;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iget-object p2, p0, Lcom/zykj/mistake/activity/MistakeListActivity$initRecycler$1;->a:Lcom/zykj/mistake/activity/MistakeListActivity;

    .line 16
    .line 17
    iput p1, p2, Lcom/zykj/mistake/activity/MistakeListActivity;->j:I

    .line 18
    .line 19
    if-lez p3, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    :goto_0
    iput-boolean p1, p2, Lcom/zykj/mistake/activity/MistakeListActivity;->l:Z

    .line 25
    .line 26
    return-void
.end method
