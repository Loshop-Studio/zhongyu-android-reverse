.class public final Landroidx/paging/Pager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Key:",
        "Ljava/lang/Object;",
        "Value:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final flow:Lvd/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvd/c;"
        }
    .end annotation
.end field

.field private final pageFetcher:Landroidx/paging/PageFetcher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/PageFetcher<",
            "TKey;TValue;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/paging/PagingConfig;Lhd/a;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PagingConfig;",
            "Lhd/a;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pagingSourceFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v6}, Landroidx/paging/Pager;-><init>(Landroidx/paging/PagingConfig;Ljava/lang/Object;Lhd/a;ILkotlin/jvm/internal/n;)V

    return-void
.end method

.method public constructor <init>(Landroidx/paging/PagingConfig;Ljava/lang/Object;Landroidx/paging/RemoteMediator;Lhd/a;)V
    .locals 3
    .annotation build Landroidx/paging/ExperimentalPagingApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PagingConfig;",
            "TKey;",
            "Landroidx/paging/RemoteMediator<",
            "TKey;TValue;>;",
            "Lhd/a;",
            ")V"
        }
    .end annotation

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pagingSourceFactory"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Landroidx/paging/PageFetcher;

    .line 4
    instance-of v1, p4, Landroidx/paging/SuspendingPagingSourceFactory;

    if-eqz v1, :cond_0

    .line 5
    new-instance v1, Landroidx/paging/Pager$pageFetcher$1;

    check-cast p4, Landroidx/paging/SuspendingPagingSourceFactory;

    invoke-direct {v1, p4}, Landroidx/paging/Pager$pageFetcher$1;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    .line 6
    :cond_0
    new-instance v1, Landroidx/paging/Pager$pageFetcher$2;

    const/4 v2, 0x0

    invoke-direct {v1, p4, v2}, Landroidx/paging/Pager$pageFetcher$2;-><init>(Lhd/a;Lvc/c;)V

    .line 7
    :goto_0
    invoke-direct {v0, v1, p2, p1, p3}, Landroidx/paging/PageFetcher;-><init>(Lhd/l;Ljava/lang/Object;Landroidx/paging/PagingConfig;Landroidx/paging/RemoteMediator;)V

    iput-object v0, p0, Landroidx/paging/Pager;->pageFetcher:Landroidx/paging/PageFetcher;

    .line 8
    invoke-virtual {v0}, Landroidx/paging/PageFetcher;->getFlow()Lvd/c;

    move-result-object p1

    iput-object p1, p0, Landroidx/paging/Pager;->flow:Lvd/c;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/paging/PagingConfig;Ljava/lang/Object;Landroidx/paging/RemoteMediator;Lhd/a;ILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    .line 9
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/paging/Pager;-><init>(Landroidx/paging/PagingConfig;Ljava/lang/Object;Landroidx/paging/RemoteMediator;Lhd/a;)V

    return-void
.end method

.method public constructor <init>(Landroidx/paging/PagingConfig;Ljava/lang/Object;Lhd/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PagingConfig;",
            "TKey;",
            "Lhd/a;",
            ")V"
        }
    .end annotation

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pagingSourceFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 11
    invoke-direct {p0, p1, p2, v0, p3}, Landroidx/paging/Pager;-><init>(Landroidx/paging/PagingConfig;Ljava/lang/Object;Landroidx/paging/RemoteMediator;Lhd/a;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/paging/PagingConfig;Ljava/lang/Object;Lhd/a;ILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    .line 10
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Landroidx/paging/Pager;-><init>(Landroidx/paging/PagingConfig;Ljava/lang/Object;Lhd/a;)V

    return-void
.end method

.method public static synthetic getFlow$annotations()V
    .locals 0

    return-void
.end method

.method private static synthetic getPageFetcher$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final append()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/paging/Pager;->pageFetcher:Landroidx/paging/PageFetcher;

    .line 2
    .line 3
    sget-object v1, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroidx/paging/PageFetcher;->load(Landroidx/paging/LoadType;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final getFlow()Lvd/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lvd/c;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/Pager;->flow:Lvd/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final prepend()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/paging/Pager;->pageFetcher:Landroidx/paging/PageFetcher;

    .line 2
    .line 3
    sget-object v1, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroidx/paging/PageFetcher;->load(Landroidx/paging/LoadType;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final refresh()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/Pager;->pageFetcher:Landroidx/paging/PageFetcher;

    invoke-virtual {v0}, Landroidx/paging/PageFetcher;->refreshAll()V

    return-void
.end method

.method public final refresh(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TValue;)V"
        }
    .end annotation

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Landroidx/paging/Pager;->pageFetcher:Landroidx/paging/PageFetcher;

    invoke-virtual {v0, p1}, Landroidx/paging/PageFetcher;->refresh(Ljava/lang/Object;)V

    return-void
.end method

.method public final retry()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/Pager;->pageFetcher:Landroidx/paging/PageFetcher;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/paging/PageFetcher;->retry()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
