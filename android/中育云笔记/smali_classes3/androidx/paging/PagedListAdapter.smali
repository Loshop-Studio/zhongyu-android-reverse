.class public abstract Landroidx/paging/PagedListAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "VH:",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        ">",
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "TVH;>;"
    }
.end annotation

.annotation runtime Lqc/a;
.end annotation


# instance fields
.field private final differ:Landroidx/paging/AsyncPagedListDiffer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/AsyncPagedListDiffer<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final listener:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/AsyncDifferConfig;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/AsyncDifferConfig<",
            "TT;>;)V"
        }
    .end annotation

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    .line 6
    new-instance v0, Landroidx/paging/n0;

    invoke-direct {v0, p0}, Landroidx/paging/n0;-><init>(Landroidx/paging/PagedListAdapter;)V

    iput-object v0, p0, Landroidx/paging/PagedListAdapter;->listener:Lhd/p;

    .line 7
    new-instance v1, Landroidx/paging/AsyncPagedListDiffer;

    new-instance v2, Landroidx/recyclerview/widget/AdapterListUpdateCallback;

    invoke-direct {v2, p0}, Landroidx/recyclerview/widget/AdapterListUpdateCallback;-><init>(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    invoke-direct {v1, v2, p1}, Landroidx/paging/AsyncPagedListDiffer;-><init>(Landroidx/recyclerview/widget/ListUpdateCallback;Landroidx/recyclerview/widget/AsyncDifferConfig;)V

    iput-object v1, p0, Landroidx/paging/PagedListAdapter;->differ:Landroidx/paging/AsyncPagedListDiffer;

    .line 8
    invoke-virtual {v1, v0}, Landroidx/paging/AsyncPagedListDiffer;->addPagedListListener(Lhd/p;)V

    return-void
.end method

.method public constructor <init>(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/DiffUtil$ItemCallback<",
            "TT;>;)V"
        }
    .end annotation

    const-string v0, "diffCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    .line 2
    new-instance v0, Landroidx/paging/n0;

    invoke-direct {v0, p0}, Landroidx/paging/n0;-><init>(Landroidx/paging/PagedListAdapter;)V

    iput-object v0, p0, Landroidx/paging/PagedListAdapter;->listener:Lhd/p;

    .line 3
    new-instance v1, Landroidx/paging/AsyncPagedListDiffer;

    invoke-direct {v1, p0, p1}, Landroidx/paging/AsyncPagedListDiffer;-><init>(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V

    iput-object v1, p0, Landroidx/paging/PagedListAdapter;->differ:Landroidx/paging/AsyncPagedListDiffer;

    .line 4
    invoke-virtual {v1, v0}, Landroidx/paging/AsyncPagedListDiffer;->addPagedListListener(Lhd/p;)V

    return-void
.end method

.method public static synthetic a(Landroidx/paging/LoadStateAdapter;Landroidx/paging/LoadStateAdapter;Landroidx/paging/LoadType;Landroidx/paging/LoadState;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/paging/PagedListAdapter;->withLoadStateHeaderAndFooter$lambda$0(Landroidx/paging/LoadStateAdapter;Landroidx/paging/LoadStateAdapter;Landroidx/paging/LoadType;Landroidx/paging/LoadState;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/paging/LoadStateAdapter;Landroidx/paging/LoadType;Landroidx/paging/LoadState;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/paging/PagedListAdapter;->withLoadStateFooter$lambda$0(Landroidx/paging/LoadStateAdapter;Landroidx/paging/LoadType;Landroidx/paging/LoadState;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/paging/LoadStateAdapter;Landroidx/paging/LoadType;Landroidx/paging/LoadState;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/paging/PagedListAdapter;->withLoadStateHeader$lambda$0(Landroidx/paging/LoadStateAdapter;Landroidx/paging/LoadType;Landroidx/paging/LoadState;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/paging/PagedListAdapter;Landroidx/paging/PagedList;Landroidx/paging/PagedList;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/paging/PagedListAdapter;->listener$lambda$0(Landroidx/paging/PagedListAdapter;Landroidx/paging/PagedList;Landroidx/paging/PagedList;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getCurrentList$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getDiffer$paging_runtime$annotations()V
    .locals 0

    return-void
.end method

.method private static synthetic getListener$annotations()V
    .locals 0

    return-void
.end method

.method private static final listener$lambda$0(Landroidx/paging/PagedListAdapter;Landroidx/paging/PagedList;Landroidx/paging/PagedList;)Lqc/q;
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, Landroidx/paging/PagedListAdapter;->onCurrentListChanged(Landroidx/paging/PagedList;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Landroidx/paging/PagedListAdapter;->onCurrentListChanged(Landroidx/paging/PagedList;Landroidx/paging/PagedList;)V

    .line 5
    .line 6
    .line 7
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 8
    .line 9
    return-object p0
.end method

.method private static final withLoadStateFooter$lambda$0(Landroidx/paging/LoadStateAdapter;Landroidx/paging/LoadType;Landroidx/paging/LoadState;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "loadType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "loadState"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    .line 12
    .line 13
    if-ne p1, v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p2}, Landroidx/paging/LoadStateAdapter;->setLoadState(Landroidx/paging/LoadState;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 19
    .line 20
    return-object p0
.end method

.method private static final withLoadStateHeader$lambda$0(Landroidx/paging/LoadStateAdapter;Landroidx/paging/LoadType;Landroidx/paging/LoadState;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "loadType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "loadState"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    .line 12
    .line 13
    if-ne p1, v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p2}, Landroidx/paging/LoadStateAdapter;->setLoadState(Landroidx/paging/LoadState;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 19
    .line 20
    return-object p0
.end method

.method private static final withLoadStateHeaderAndFooter$lambda$0(Landroidx/paging/LoadStateAdapter;Landroidx/paging/LoadStateAdapter;Landroidx/paging/LoadType;Landroidx/paging/LoadState;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "loadType"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "loadState"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    .line 12
    .line 13
    if-ne p2, v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p3}, Landroidx/paging/LoadStateAdapter;->setLoadState(Landroidx/paging/LoadState;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    sget-object p0, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    .line 20
    .line 21
    if-ne p2, p0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1, p3}, Landroidx/paging/LoadStateAdapter;->setLoadState(Landroidx/paging/LoadState;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    :goto_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 27
    .line 28
    return-object p0
.end method


# virtual methods
.method public addLoadStateListener(Lhd/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/p;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/paging/PagedListAdapter;->differ:Landroidx/paging/AsyncPagedListDiffer;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroidx/paging/AsyncPagedListDiffer;->addLoadStateListener(Lhd/p;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public getCurrentList()Landroidx/paging/PagedList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/paging/PagedList<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/PagedListAdapter;->differ:Landroidx/paging/AsyncPagedListDiffer;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/paging/AsyncPagedListDiffer;->getCurrentList()Landroidx/paging/PagedList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final getDiffer$paging_runtime()Landroidx/paging/AsyncPagedListDiffer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/paging/AsyncPagedListDiffer<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/PagedListAdapter;->differ:Landroidx/paging/AsyncPagedListDiffer;

    .line 2
    .line 3
    return-object v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/PagedListAdapter;->differ:Landroidx/paging/AsyncPagedListDiffer;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/paging/AsyncPagedListDiffer;->getItem(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/PagedListAdapter;->differ:Landroidx/paging/AsyncPagedListDiffer;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/paging/AsyncPagedListDiffer;->getItemCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public onCurrentListChanged(Landroidx/paging/PagedList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PagedList<",
            "TT;>;)V"
        }
    .end annotation

    .annotation runtime Lqc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public onCurrentListChanged(Landroidx/paging/PagedList;Landroidx/paging/PagedList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PagedList<",
            "TT;>;",
            "Landroidx/paging/PagedList<",
            "TT;>;)V"
        }
    .end annotation

    .line 2
    return-void
.end method

.method public removeLoadStateListener(Lhd/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/p;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/paging/PagedListAdapter;->differ:Landroidx/paging/AsyncPagedListDiffer;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroidx/paging/AsyncPagedListDiffer;->removeLoadStateListener(Lhd/p;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public submitList(Landroidx/paging/PagedList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PagedList<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/PagedListAdapter;->differ:Landroidx/paging/AsyncPagedListDiffer;

    invoke-virtual {v0, p1}, Landroidx/paging/AsyncPagedListDiffer;->submitList(Landroidx/paging/PagedList;)V

    return-void
.end method

.method public submitList(Landroidx/paging/PagedList;Ljava/lang/Runnable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PagedList<",
            "TT;>;",
            "Ljava/lang/Runnable;",
            ")V"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Landroidx/paging/PagedListAdapter;->differ:Landroidx/paging/AsyncPagedListDiffer;

    invoke-virtual {v0, p1, p2}, Landroidx/paging/AsyncPagedListDiffer;->submitList(Landroidx/paging/PagedList;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final withLoadStateFooter(Landroidx/paging/LoadStateAdapter;)Landroidx/recyclerview/widget/ConcatAdapter;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/LoadStateAdapter<",
            "*>;)",
            "Landroidx/recyclerview/widget/ConcatAdapter;"
        }
    .end annotation

    .line 1
    const-string v0, "footer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroidx/paging/p0;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Landroidx/paging/p0;-><init>(Landroidx/paging/LoadStateAdapter;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroidx/paging/PagedListAdapter;->addLoadStateListener(Lhd/p;)V

    .line 12
    .line 13
    .line 14
    new-instance v0, Landroidx/recyclerview/widget/ConcatAdapter;

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    new-array v1, v1, [Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    aput-object p0, v1, v2

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    aput-object p1, v1, v2

    .line 24
    .line 25
    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/ConcatAdapter;-><init>([Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public final withLoadStateHeader(Landroidx/paging/LoadStateAdapter;)Landroidx/recyclerview/widget/ConcatAdapter;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/LoadStateAdapter<",
            "*>;)",
            "Landroidx/recyclerview/widget/ConcatAdapter;"
        }
    .end annotation

    .line 1
    const-string v0, "header"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroidx/paging/o0;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Landroidx/paging/o0;-><init>(Landroidx/paging/LoadStateAdapter;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroidx/paging/PagedListAdapter;->addLoadStateListener(Lhd/p;)V

    .line 12
    .line 13
    .line 14
    new-instance v0, Landroidx/recyclerview/widget/ConcatAdapter;

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    new-array v1, v1, [Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    aput-object p1, v1, v2

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    aput-object p0, v1, p1

    .line 24
    .line 25
    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/ConcatAdapter;-><init>([Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public final withLoadStateHeaderAndFooter(Landroidx/paging/LoadStateAdapter;Landroidx/paging/LoadStateAdapter;)Landroidx/recyclerview/widget/ConcatAdapter;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/LoadStateAdapter<",
            "*>;",
            "Landroidx/paging/LoadStateAdapter<",
            "*>;)",
            "Landroidx/recyclerview/widget/ConcatAdapter;"
        }
    .end annotation

    .line 1
    const-string v0, "header"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "footer"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroidx/paging/q0;

    .line 12
    .line 13
    invoke-direct {v0, p1, p2}, Landroidx/paging/q0;-><init>(Landroidx/paging/LoadStateAdapter;Landroidx/paging/LoadStateAdapter;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroidx/paging/PagedListAdapter;->addLoadStateListener(Lhd/p;)V

    .line 17
    .line 18
    .line 19
    new-instance v0, Landroidx/recyclerview/widget/ConcatAdapter;

    .line 20
    .line 21
    const/4 v1, 0x3

    .line 22
    new-array v1, v1, [Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    aput-object p1, v1, v2

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    aput-object p0, v1, p1

    .line 29
    .line 30
    const/4 p1, 0x2

    .line 31
    aput-object p2, v1, p1

    .line 32
    .line 33
    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/ConcatAdapter;-><init>([Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method
