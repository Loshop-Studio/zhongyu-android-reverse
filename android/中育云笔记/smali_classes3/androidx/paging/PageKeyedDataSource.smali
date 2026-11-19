.class public abstract Landroidx/paging/PageKeyedDataSource;
.super Landroidx/paging/DataSource;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/paging/PageKeyedDataSource$LoadCallback;,
        Landroidx/paging/PageKeyedDataSource$LoadInitialCallback;,
        Landroidx/paging/PageKeyedDataSource$LoadInitialParams;,
        Landroidx/paging/PageKeyedDataSource$LoadParams;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Key:",
        "Ljava/lang/Object;",
        "Value:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/paging/DataSource<",
        "TKey;TValue;>;"
    }
.end annotation

.annotation runtime Lqc/a;
.end annotation


# instance fields
.field private final supportsPageDropping:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Landroidx/paging/DataSource$KeyType;->PAGE_KEYED:Landroidx/paging/DataSource$KeyType;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroidx/paging/DataSource;-><init>(Landroidx/paging/DataSource$KeyType;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final synthetic access$continuationAsCallback(Landroidx/paging/PageKeyedDataSource;Lsd/j;Z)Landroidx/paging/PageKeyedDataSource$LoadCallback;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/paging/PageKeyedDataSource;->continuationAsCallback(Lsd/j;Z)Landroidx/paging/PageKeyedDataSource$LoadCallback;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$loadAfter(Landroidx/paging/PageKeyedDataSource;Landroidx/paging/PageKeyedDataSource$LoadParams;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/paging/PageKeyedDataSource;->loadAfter(Landroidx/paging/PageKeyedDataSource$LoadParams;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$loadBefore(Landroidx/paging/PageKeyedDataSource;Landroidx/paging/PageKeyedDataSource$LoadParams;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/paging/PageKeyedDataSource;->loadBefore(Landroidx/paging/PageKeyedDataSource$LoadParams;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$loadInitial(Landroidx/paging/PageKeyedDataSource;Landroidx/paging/PageKeyedDataSource$LoadInitialParams;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/paging/PageKeyedDataSource;->loadInitial(Landroidx/paging/PageKeyedDataSource$LoadInitialParams;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final continuationAsCallback(Lsd/j;Z)Landroidx/paging/PageKeyedDataSource$LoadCallback;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/j;",
            "Z)",
            "Landroidx/paging/PageKeyedDataSource$LoadCallback<",
            "TKey;TValue;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/paging/PageKeyedDataSource$continuationAsCallback$1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Landroidx/paging/PageKeyedDataSource$continuationAsCallback$1;-><init>(Lsd/j;Z)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic f(Landroidx/arch/core/util/Function;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/paging/PageKeyedDataSource;->map$lambda$0(Landroidx/arch/core/util/Function;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lhd/l;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/paging/PageKeyedDataSource;->map$lambda$1(Lhd/l;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getSupportsPageDropping$paging_common$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic h(Lhd/l;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/paging/PageKeyedDataSource;->mapByPage$lambda$0(Lhd/l;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final loadAfter(Landroidx/paging/PageKeyedDataSource$LoadParams;Lvc/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PageKeyedDataSource$LoadParams<",
            "TKey;>;",
            "Lvc/c<",
            "-",
            "Landroidx/paging/DataSource$BaseResult<",
            "TValue;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lkotlinx/coroutines/c;

    invoke-static {p2}, Lkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt;->d(Lvc/c;)Lvc/c;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/c;-><init>(Lvc/c;I)V

    .line 2
    invoke-virtual {v0}, Lkotlinx/coroutines/c;->F()V

    .line 3
    invoke-static {p0, v0, v2}, Landroidx/paging/PageKeyedDataSource;->access$continuationAsCallback(Landroidx/paging/PageKeyedDataSource;Lsd/j;Z)Landroidx/paging/PageKeyedDataSource$LoadCallback;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Landroidx/paging/PageKeyedDataSource;->loadAfter(Landroidx/paging/PageKeyedDataSource$LoadParams;Landroidx/paging/PageKeyedDataSource$LoadCallback;)V

    .line 4
    invoke-virtual {v0}, Lkotlinx/coroutines/c;->x()Ljava/lang/Object;

    move-result-object p1

    .line 5
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, Lxc/f;->c(Lvc/c;)V

    :cond_0
    return-object p1
.end method

.method private final loadBefore(Landroidx/paging/PageKeyedDataSource$LoadParams;Lvc/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PageKeyedDataSource$LoadParams<",
            "TKey;>;",
            "Lvc/c<",
            "-",
            "Landroidx/paging/DataSource$BaseResult<",
            "TValue;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lkotlinx/coroutines/c;

    invoke-static {p2}, Lkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt;->d(Lvc/c;)Lvc/c;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/c;-><init>(Lvc/c;I)V

    .line 2
    invoke-virtual {v0}, Lkotlinx/coroutines/c;->F()V

    const/4 v1, 0x0

    .line 3
    invoke-static {p0, v0, v1}, Landroidx/paging/PageKeyedDataSource;->access$continuationAsCallback(Landroidx/paging/PageKeyedDataSource;Lsd/j;Z)Landroidx/paging/PageKeyedDataSource$LoadCallback;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Landroidx/paging/PageKeyedDataSource;->loadBefore(Landroidx/paging/PageKeyedDataSource$LoadParams;Landroidx/paging/PageKeyedDataSource$LoadCallback;)V

    .line 4
    invoke-virtual {v0}, Lkotlinx/coroutines/c;->x()Ljava/lang/Object;

    move-result-object p1

    .line 5
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, Lxc/f;->c(Lvc/c;)V

    :cond_0
    return-object p1
.end method

.method private final loadInitial(Landroidx/paging/PageKeyedDataSource$LoadInitialParams;Lvc/c;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PageKeyedDataSource$LoadInitialParams<",
            "TKey;>;",
            "Lvc/c<",
            "-",
            "Landroidx/paging/DataSource$BaseResult<",
            "TValue;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lkotlinx/coroutines/c;

    invoke-static {p2}, Lkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt;->d(Lvc/c;)Lvc/c;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/c;-><init>(Lvc/c;I)V

    .line 2
    invoke-virtual {v0}, Lkotlinx/coroutines/c;->F()V

    .line 3
    new-instance v1, Landroidx/paging/PageKeyedDataSource$loadInitial$2$1;

    invoke-direct {v1, v0}, Landroidx/paging/PageKeyedDataSource$loadInitial$2$1;-><init>(Lsd/j;)V

    .line 4
    invoke-virtual {p0, p1, v1}, Landroidx/paging/PageKeyedDataSource;->loadInitial(Landroidx/paging/PageKeyedDataSource$LoadInitialParams;Landroidx/paging/PageKeyedDataSource$LoadInitialCallback;)V

    .line 5
    invoke-virtual {v0}, Lkotlinx/coroutines/c;->x()Ljava/lang/Object;

    move-result-object p1

    .line 6
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, Lxc/f;->c(Lvc/c;)V

    :cond_0
    return-object p1
.end method

.method private static final map$lambda$0(Landroidx/arch/core/util/Function;Ljava/util/List;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    check-cast p1, Ljava/lang/Iterable;

    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    const/16 v1, 0xa

    .line 9
    .line 10
    invoke-static {p1, v1}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-interface {p0, v1}, Landroidx/arch/core/util/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    return-object v0
.end method

.method private static final map$lambda$1(Lhd/l;Ljava/util/List;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    check-cast p1, Ljava/lang/Iterable;

    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    const/16 v1, 0xa

    .line 9
    .line 10
    invoke-static {p1, v1}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-interface {p0, v1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    return-object v0
.end method

.method private static final mapByPage$lambda$0(Lhd/l;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Ljava/util/List;

    .line 9
    .line 10
    return-object p0
.end method


# virtual methods
.method public getKeyInternal$paging_common(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TValue;)TKey;"
        }
    .end annotation

    .line 1
    const-string v0, "item"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v0, "Cannot get key by item in pageKeyedDataSource"

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1
.end method

.method public getSupportsPageDropping$paging_common()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/paging/PageKeyedDataSource;->supportsPageDropping:Z

    .line 2
    .line 3
    return v0
.end method

.method public final load$paging_common(Landroidx/paging/DataSource$Params;Lvc/c;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/DataSource$Params<",
            "TKey;>;",
            "Lvc/c<",
            "-",
            "Landroidx/paging/DataSource$BaseResult<",
            "TValue;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroidx/paging/DataSource$Params;->getType$paging_common()Landroidx/paging/LoadType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    new-instance v0, Landroidx/paging/PageKeyedDataSource$LoadInitialParams;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/paging/DataSource$Params;->getInitialLoadSize()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {p1}, Landroidx/paging/DataSource$Params;->getPlaceholdersEnabled()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-direct {v0, v1, p1}, Landroidx/paging/PageKeyedDataSource$LoadInitialParams;-><init>(IZ)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, v0, p2}, Landroidx/paging/PageKeyedDataSource;->loadInitial(Landroidx/paging/PageKeyedDataSource$LoadInitialParams;Lvc/c;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :cond_0
    invoke-virtual {p1}, Landroidx/paging/DataSource$Params;->getKey()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    sget-object p1, Landroidx/paging/DataSource$BaseResult;->Companion:Landroidx/paging/DataSource$BaseResult$Companion;

    .line 34
    .line 35
    invoke-virtual {p1}, Landroidx/paging/DataSource$BaseResult$Companion;->empty$paging_common()Landroidx/paging/DataSource$BaseResult;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    :cond_1
    invoke-virtual {p1}, Landroidx/paging/DataSource$Params;->getType$paging_common()Landroidx/paging/LoadType;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    sget-object v1, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    .line 45
    .line 46
    if-ne v0, v1, :cond_2

    .line 47
    .line 48
    new-instance v0, Landroidx/paging/PageKeyedDataSource$LoadParams;

    .line 49
    .line 50
    invoke-virtual {p1}, Landroidx/paging/DataSource$Params;->getKey()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {p1}, Landroidx/paging/DataSource$Params;->getPageSize()I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    invoke-direct {v0, v1, p1}, Landroidx/paging/PageKeyedDataSource$LoadParams;-><init>(Ljava/lang/Object;I)V

    .line 59
    .line 60
    .line 61
    invoke-direct {p0, v0, p2}, Landroidx/paging/PageKeyedDataSource;->loadBefore(Landroidx/paging/PageKeyedDataSource$LoadParams;Lvc/c;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    return-object p1

    .line 66
    :cond_2
    invoke-virtual {p1}, Landroidx/paging/DataSource$Params;->getType$paging_common()Landroidx/paging/LoadType;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    sget-object v1, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    .line 71
    .line 72
    if-ne v0, v1, :cond_3

    .line 73
    .line 74
    new-instance v0, Landroidx/paging/PageKeyedDataSource$LoadParams;

    .line 75
    .line 76
    invoke-virtual {p1}, Landroidx/paging/DataSource$Params;->getKey()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {p1}, Landroidx/paging/DataSource$Params;->getPageSize()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    invoke-direct {v0, v1, p1}, Landroidx/paging/PageKeyedDataSource$LoadParams;-><init>(Ljava/lang/Object;I)V

    .line 85
    .line 86
    .line 87
    invoke-direct {p0, v0, p2}, Landroidx/paging/PageKeyedDataSource;->loadAfter(Landroidx/paging/PageKeyedDataSource$LoadParams;Lvc/c;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    return-object p1

    .line 92
    :cond_3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 93
    .line 94
    new-instance v0, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    .line 98
    .line 99
    const-string v1, "Unsupported type "

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Landroidx/paging/DataSource$Params;->getType$paging_common()Landroidx/paging/LoadType;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw p2
.end method

.method public abstract loadAfter(Landroidx/paging/PageKeyedDataSource$LoadParams;Landroidx/paging/PageKeyedDataSource$LoadCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PageKeyedDataSource$LoadParams<",
            "TKey;>;",
            "Landroidx/paging/PageKeyedDataSource$LoadCallback<",
            "TKey;TValue;>;)V"
        }
    .end annotation
.end method

.method public abstract loadBefore(Landroidx/paging/PageKeyedDataSource$LoadParams;Landroidx/paging/PageKeyedDataSource$LoadCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PageKeyedDataSource$LoadParams<",
            "TKey;>;",
            "Landroidx/paging/PageKeyedDataSource$LoadCallback<",
            "TKey;TValue;>;)V"
        }
    .end annotation
.end method

.method public abstract loadInitial(Landroidx/paging/PageKeyedDataSource$LoadInitialParams;Landroidx/paging/PageKeyedDataSource$LoadInitialCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PageKeyedDataSource$LoadInitialParams<",
            "TKey;>;",
            "Landroidx/paging/PageKeyedDataSource$LoadInitialCallback<",
            "TKey;TValue;>;)V"
        }
    .end annotation
.end method

.method public bridge synthetic map(Landroidx/arch/core/util/Function;)Landroidx/paging/DataSource;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/paging/PageKeyedDataSource;->map(Landroidx/arch/core/util/Function;)Landroidx/paging/PageKeyedDataSource;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic map(Lhd/l;)Landroidx/paging/DataSource;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Landroidx/paging/PageKeyedDataSource;->map(Lhd/l;)Landroidx/paging/PageKeyedDataSource;

    move-result-object p1

    return-object p1
.end method

.method public final map(Landroidx/arch/core/util/Function;)Landroidx/paging/PageKeyedDataSource;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ToValue:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/arch/core/util/Function<",
            "TValue;TToValue;>;)",
            "Landroidx/paging/PageKeyedDataSource<",
            "TKey;TToValue;>;"
        }
    .end annotation

    const-string v0, "function"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Landroidx/paging/f0;

    invoke-direct {v0, p1}, Landroidx/paging/f0;-><init>(Landroidx/arch/core/util/Function;)V

    invoke-virtual {p0, v0}, Landroidx/paging/PageKeyedDataSource;->mapByPage(Landroidx/arch/core/util/Function;)Landroidx/paging/PageKeyedDataSource;

    move-result-object p1

    return-object p1
.end method

.method public final map(Lhd/l;)Landroidx/paging/PageKeyedDataSource;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ToValue:",
            "Ljava/lang/Object;",
            ">(",
            "Lhd/l;",
            ")",
            "Landroidx/paging/PageKeyedDataSource<",
            "TKey;TToValue;>;"
        }
    .end annotation

    const-string v0, "function"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    new-instance v0, Landroidx/paging/h0;

    invoke-direct {v0, p1}, Landroidx/paging/h0;-><init>(Lhd/l;)V

    invoke-virtual {p0, v0}, Landroidx/paging/PageKeyedDataSource;->mapByPage(Landroidx/arch/core/util/Function;)Landroidx/paging/PageKeyedDataSource;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mapByPage(Landroidx/arch/core/util/Function;)Landroidx/paging/DataSource;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/paging/PageKeyedDataSource;->mapByPage(Landroidx/arch/core/util/Function;)Landroidx/paging/PageKeyedDataSource;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mapByPage(Lhd/l;)Landroidx/paging/DataSource;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Landroidx/paging/PageKeyedDataSource;->mapByPage(Lhd/l;)Landroidx/paging/PageKeyedDataSource;

    move-result-object p1

    return-object p1
.end method

.method public final mapByPage(Landroidx/arch/core/util/Function;)Landroidx/paging/PageKeyedDataSource;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ToValue:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/arch/core/util/Function<",
            "Ljava/util/List<",
            "TValue;>;",
            "Ljava/util/List<",
            "TToValue;>;>;)",
            "Landroidx/paging/PageKeyedDataSource<",
            "TKey;TToValue;>;"
        }
    .end annotation

    const-string v0, "function"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Landroidx/paging/WrapperPageKeyedDataSource;

    invoke-direct {v0, p0, p1}, Landroidx/paging/WrapperPageKeyedDataSource;-><init>(Landroidx/paging/PageKeyedDataSource;Landroidx/arch/core/util/Function;)V

    return-object v0
.end method

.method public final mapByPage(Lhd/l;)Landroidx/paging/PageKeyedDataSource;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ToValue:",
            "Ljava/lang/Object;",
            ">(",
            "Lhd/l;",
            ")",
            "Landroidx/paging/PageKeyedDataSource<",
            "TKey;TToValue;>;"
        }
    .end annotation

    const-string v0, "function"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    new-instance v0, Landroidx/paging/g0;

    invoke-direct {v0, p1}, Landroidx/paging/g0;-><init>(Lhd/l;)V

    invoke-virtual {p0, v0}, Landroidx/paging/PageKeyedDataSource;->mapByPage(Landroidx/arch/core/util/Function;)Landroidx/paging/PageKeyedDataSource;

    move-result-object p1

    return-object p1
.end method
