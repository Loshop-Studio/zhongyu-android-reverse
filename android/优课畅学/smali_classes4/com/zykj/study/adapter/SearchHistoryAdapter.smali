.class public final Lcom/zykj/study/adapter/SearchHistoryAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/adapter/SearchHistoryAdapter$ViewHolderHistory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/zykj/study/adapter/SearchHistoryAdapter$ViewHolderHistory;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lcom/zykj/study/viewmodels/SearchViewModel;

.field public final b:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/viewmodels/SearchViewModel;)V
    .locals 1

    .line 1
    const-string v0, "searchViewModel"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/study/adapter/SearchHistoryAdapter;->a:Lcom/zykj/study/viewmodels/SearchViewModel;

    .line 10
    .line 11
    new-instance p1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/zykj/study/adapter/SearchHistoryAdapter;->b:Ljava/util/List;

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic c(Lcom/zykj/study/adapter/SearchHistoryAdapter;Lcom/zykj/study/data/SearchHistoryEntity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/adapter/SearchHistoryAdapter;->f(Lcom/zykj/study/adapter/SearchHistoryAdapter;Lcom/zykj/study/data/SearchHistoryEntity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic d(Lcom/zykj/study/adapter/SearchHistoryAdapter;Lcom/zykj/study/data/SearchHistoryEntity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/adapter/SearchHistoryAdapter;->h(Lcom/zykj/study/adapter/SearchHistoryAdapter;Lcom/zykj/study/data/SearchHistoryEntity;Landroid/view/View;)V

    return-void
.end method

.method public static final f(Lcom/zykj/study/adapter/SearchHistoryAdapter;Lcom/zykj/study/data/SearchHistoryEntity;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/adapter/SearchHistoryAdapter;->a:Lcom/zykj/study/viewmodels/SearchViewModel;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/study/viewmodels/SearchViewModel;->c(Lcom/zykj/study/data/SearchHistoryEntity;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final h(Lcom/zykj/study/adapter/SearchHistoryAdapter;Lcom/zykj/study/data/SearchHistoryEntity;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/zykj/study/adapter/SearchHistoryAdapter;->a:Lcom/zykj/study/viewmodels/SearchViewModel;

    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/zykj/study/viewmodels/SearchViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p1}, Lcom/zykj/study/data/SearchHistoryEntity;->getSearchKey()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p2, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lcom/zykj/study/adapter/SearchHistoryAdapter;->a:Lcom/zykj/study/viewmodels/SearchViewModel;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/study/viewmodels/SearchViewModel;->k()V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final e(Lcom/zykj/study/data/SearchHistoryEntity;)Landroid/view/View$OnClickListener;
    .locals 1

    .line 1
    new-instance v0, Ln4/n0;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Ln4/n0;-><init>(Lcom/zykj/study/adapter/SearchHistoryAdapter;Lcom/zykj/study/data/SearchHistoryEntity;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final g(Lcom/zykj/study/data/SearchHistoryEntity;)Landroid/view/View$OnClickListener;
    .locals 1

    .line 1
    new-instance v0, Ln4/m0;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Ln4/m0;-><init>(Lcom/zykj/study/adapter/SearchHistoryAdapter;Lcom/zykj/study/data/SearchHistoryEntity;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/adapter/SearchHistoryAdapter;->b:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public i(Lcom/zykj/study/adapter/SearchHistoryAdapter$ViewHolderHistory;I)V
    .locals 2

    .line 1
    const-string v0, "holder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/adapter/SearchHistoryAdapter;->b:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    check-cast p2, Lcom/zykj/study/data/SearchHistoryEntity;

    .line 13
    .line 14
    invoke-virtual {p0, p2}, Lcom/zykj/study/adapter/SearchHistoryAdapter;->e(Lcom/zykj/study/data/SearchHistoryEntity;)Landroid/view/View$OnClickListener;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0, p2}, Lcom/zykj/study/adapter/SearchHistoryAdapter;->g(Lcom/zykj/study/data/SearchHistoryEntity;)Landroid/view/View$OnClickListener;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {p1, p2, v0, v1}, Lcom/zykj/study/adapter/SearchHistoryAdapter$ViewHolderHistory;->a(Lcom/zykj/study/data/SearchHistoryEntity;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public j(Landroid/view/ViewGroup;I)Lcom/zykj/study/adapter/SearchHistoryAdapter$ViewHolderHistory;
    .locals 2

    .line 1
    const-string p2, "parent"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p2, Lcom/zykj/study/adapter/SearchHistoryAdapter$ViewHolderHistory;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-static {v0, p1, v1}, Lcom/zykj/study/databinding/ItemHistorySearchBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/study/databinding/ItemHistorySearchBinding;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v0, "inflate(...)"

    .line 22
    .line 23
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p2, p1}, Lcom/zykj/study/adapter/SearchHistoryAdapter$ViewHolderHistory;-><init>(Lcom/zykj/study/databinding/ItemHistorySearchBinding;)V

    .line 27
    .line 28
    .line 29
    return-object p2
.end method

.method public final k(Ljava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "newList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/study/adapter/SearchHistoryAdapter;->b:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/study/adapter/SearchHistoryAdapter;->b:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/study/adapter/SearchHistoryAdapter$ViewHolderHistory;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/adapter/SearchHistoryAdapter;->i(Lcom/zykj/study/adapter/SearchHistoryAdapter$ViewHolderHistory;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/adapter/SearchHistoryAdapter;->j(Landroid/view/ViewGroup;I)Lcom/zykj/study/adapter/SearchHistoryAdapter$ViewHolderHistory;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
