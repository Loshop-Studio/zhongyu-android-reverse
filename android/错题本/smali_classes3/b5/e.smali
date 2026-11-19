.class public final Lb5/e;
.super La/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lcom/zykj/mistake/presenter/MistakeListPresenter;

.field public final synthetic b:Z


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/presenter/MistakeListPresenter;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb5/e;->a:Lcom/zykj/mistake/presenter/MistakeListPresenter;

    .line 5
    .line 6
    iput-boolean p2, p0, Lb5/e;->b:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final m(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "e"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb5/e;->a:Lcom/zykj/mistake/presenter/MistakeListPresenter;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lcom/zykj/mistake/activity/MistakeListActivity;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 19
    .line 20
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->l:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 21
    .line 22
    invoke-virtual {v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->isRefreshing()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 33
    .line 34
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->l:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    invoke-virtual {v1, v2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-virtual {v0, p1}, Lcom/zykj/mistake/base/BaseMVPActivity;->b(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void
.end method

.method public final n(Ljava/lang/Object;)V
    .locals 5

    .line 1
    check-cast p1, Lcom/zykj/mistake/entity/resp/MistakeListResp;

    .line 2
    .line 3
    const-string v0, "resp"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lb5/e;->a:Lcom/zykj/mistake/presenter/MistakeListPresenter;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lcom/zykj/mistake/activity/MistakeListActivity;

    .line 13
    .line 14
    if-eqz v0, :cond_5

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/zykj/mistake/entity/resp/MistakeListResp;->getResult()Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeListInfo;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Lcom/zykj/mistake/entity/resp/MistakeListResp$MistakeListInfo;->getItems()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object v1, v0, Lcom/zykj/mistake/activity/MistakeListActivity;->e:Ljava/util/ArrayList;

    .line 25
    .line 26
    const-string v2, "result"

    .line 27
    .line 28
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-boolean v2, p0, Lb5/e;->b:Z

    .line 32
    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    xor-int/lit8 v3, v3, 0x1

    .line 43
    .line 44
    iput-boolean v3, v0, Lcom/zykj/mistake/activity/MistakeListActivity;->k:Z

    .line 45
    .line 46
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 47
    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    const-string v4, "mMistakeListAdapter"

    .line 51
    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    iget-object p1, v0, Lcom/zykj/mistake/activity/MistakeListActivity;->f:Lcom/zykj/mistake/adapter/MistakeListAdapter;

    .line 55
    .line 56
    if-eqz p1, :cond_1

    .line 57
    .line 58
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 66
    .line 67
    iget-object p1, p1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->l:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 68
    .line 69
    invoke-virtual {p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->isRefreshing()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_3

    .line 74
    .line 75
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    check-cast p1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 80
    .line 81
    iget-object p1, p1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->l:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 82
    .line 83
    const/4 v1, 0x0

    .line 84
    invoke-virtual {p1, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_1
    invoke-static {v4}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw v3

    .line 92
    :cond_2
    iget-object v2, v0, Lcom/zykj/mistake/activity/MistakeListActivity;->f:Lcom/zykj/mistake/adapter/MistakeListAdapter;

    .line 93
    .line 94
    if-eqz v2, :cond_4

    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    invoke-virtual {v2, v1, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemRangeInserted(II)V

    .line 105
    .line 106
    .line 107
    :cond_3
    :goto_0
    invoke-virtual {v0}, Lcom/zykj/mistake/activity/MistakeListActivity;->u()V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_4
    invoke-static {v4}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw v3

    .line 115
    :cond_5
    return-void
.end method
