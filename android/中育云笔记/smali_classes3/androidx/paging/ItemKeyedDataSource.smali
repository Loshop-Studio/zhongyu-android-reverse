.class public abstract Landroidx/paging/ItemKeyedDataSource;
.super Landroidx/paging/DataSource;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/paging/ItemKeyedDataSource$LoadCallback;,
        Landroidx/paging/ItemKeyedDataSource$LoadInitialCallback;,
        Landroidx/paging/ItemKeyedDataSource$LoadInitialParams;,
        Landroidx/paging/ItemKeyedDataSource$LoadParams;,
        Landroidx/paging/ItemKeyedDataSource$WhenMappings;
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


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Landroidx/paging/DataSource$KeyType;->ITEM_KEYED:Landroidx/paging/DataSource$KeyType;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroidx/paging/DataSource;-><init>(Landroidx/paging/DataSource$KeyType;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final synthetic access$asCallback(Landroidx/paging/ItemKeyedDataSource;Lsd/j;)Landroidx/paging/ItemKeyedDataSource$asCallback$1;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/paging/ItemKeyedDataSource;->asCallback(Lsd/j;)Landroidx/paging/ItemKeyedDataSource$asCallback$1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final asCallback(Lsd/j;)Landroidx/paging/ItemKeyedDataSource$asCallback$1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/j;",
            ")",
            "Landroidx/paging/ItemKeyedDataSource$asCallback$1;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/paging/ItemKeyedDataSource$asCallback$1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p0}, Landroidx/paging/ItemKeyedDataSource$asCallback$1;-><init>(Lsd/j;Landroidx/paging/ItemKeyedDataSource;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic f(Landroidx/arch/core/util/Function;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/paging/ItemKeyedDataSource;->map$lambda$0(Landroidx/arch/core/util/Function;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lhd/l;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/paging/ItemKeyedDataSource;->mapByPage$lambda$0(Lhd/l;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lhd/l;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/paging/ItemKeyedDataSource;->map$lambda$1(Lhd/l;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
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
.method public abstract getKey(Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TValue;)TKey;"
        }
    .end annotation
.end method

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
    invoke-virtual {p0, p1}, Landroidx/paging/ItemKeyedDataSource;->getKey(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public final getNextKey$paging_common(Ljava/util/List;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TValue;>;)TKey;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lrc/g0;->z0(Ljava/util/List;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroidx/paging/ItemKeyedDataSource;->getKey(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return-object p1
.end method

.method public final getPrevKey$paging_common(Ljava/util/List;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TValue;>;)TKey;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lrc/g0;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroidx/paging/ItemKeyedDataSource;->getKey(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return-object p1
.end method

.method public final load$paging_common(Landroidx/paging/DataSource$Params;Lvc/c;)Ljava/lang/Object;
    .locals 3
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
    sget-object v1, Landroidx/paging/ItemKeyedDataSource$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    aget v0, v1, v0

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-eq v0, v1, :cond_2

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    if-eq v0, v1, :cond_1

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    if-ne v0, v1, :cond_0

    .line 21
    .line 22
    new-instance v0, Landroidx/paging/ItemKeyedDataSource$LoadParams;

    .line 23
    .line 24
    invoke-virtual {p1}, Landroidx/paging/DataSource$Params;->getKey()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Landroidx/paging/DataSource$Params;->getPageSize()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    invoke-direct {v0, v1, p1}, Landroidx/paging/ItemKeyedDataSource$LoadParams;-><init>(Ljava/lang/Object;I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0, p2}, Landroidx/paging/ItemKeyedDataSource;->loadAfter$paging_common(Landroidx/paging/ItemKeyedDataSource$LoadParams;Lvc/c;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 44
    .line 45
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 46
    .line 47
    .line 48
    throw p1

    .line 49
    :cond_1
    new-instance v0, Landroidx/paging/ItemKeyedDataSource$LoadParams;

    .line 50
    .line 51
    invoke-virtual {p1}, Landroidx/paging/DataSource$Params;->getKey()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Landroidx/paging/DataSource$Params;->getPageSize()I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    invoke-direct {v0, v1, p1}, Landroidx/paging/ItemKeyedDataSource$LoadParams;-><init>(Ljava/lang/Object;I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v0, p2}, Landroidx/paging/ItemKeyedDataSource;->loadBefore$paging_common(Landroidx/paging/ItemKeyedDataSource$LoadParams;Lvc/c;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    return-object p1

    .line 70
    :cond_2
    new-instance v0, Landroidx/paging/ItemKeyedDataSource$LoadInitialParams;

    .line 71
    .line 72
    invoke-virtual {p1}, Landroidx/paging/DataSource$Params;->getKey()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {p1}, Landroidx/paging/DataSource$Params;->getInitialLoadSize()I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    invoke-virtual {p1}, Landroidx/paging/DataSource$Params;->getPlaceholdersEnabled()Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    invoke-direct {v0, v1, v2, p1}, Landroidx/paging/ItemKeyedDataSource$LoadInitialParams;-><init>(Ljava/lang/Object;IZ)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, v0, p2}, Landroidx/paging/ItemKeyedDataSource;->loadInitial$paging_common(Landroidx/paging/ItemKeyedDataSource$LoadInitialParams;Lvc/c;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    return-object p1
.end method

.method public abstract loadAfter(Landroidx/paging/ItemKeyedDataSource$LoadParams;Landroidx/paging/ItemKeyedDataSource$LoadCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/ItemKeyedDataSource$LoadParams<",
            "TKey;>;",
            "Landroidx/paging/ItemKeyedDataSource$LoadCallback<",
            "TValue;>;)V"
        }
    .end annotation
.end method

.method public final loadAfter$paging_common(Landroidx/paging/ItemKeyedDataSource$LoadParams;Lvc/c;)Ljava/lang/Object;
    .locals 3
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/ItemKeyedDataSource$LoadParams<",
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

    .line 2
    .line 3
    invoke-static {p2}, Lkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt;->d(Lvc/c;)Lvc/c;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/c;-><init>(Lvc/c;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lkotlinx/coroutines/c;->F()V

    .line 12
    .line 13
    .line 14
    invoke-static {p0, v0}, Landroidx/paging/ItemKeyedDataSource;->access$asCallback(Landroidx/paging/ItemKeyedDataSource;Lsd/j;)Landroidx/paging/ItemKeyedDataSource$asCallback$1;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {p0, p1, v1}, Landroidx/paging/ItemKeyedDataSource;->loadAfter(Landroidx/paging/ItemKeyedDataSource$LoadParams;Landroidx/paging/ItemKeyedDataSource$LoadCallback;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lkotlinx/coroutines/c;->x()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-ne p1, v0, :cond_0

    .line 30
    .line 31
    invoke-static {p2}, Lxc/f;->c(Lvc/c;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-object p1
.end method

.method public abstract loadBefore(Landroidx/paging/ItemKeyedDataSource$LoadParams;Landroidx/paging/ItemKeyedDataSource$LoadCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/ItemKeyedDataSource$LoadParams<",
            "TKey;>;",
            "Landroidx/paging/ItemKeyedDataSource$LoadCallback<",
            "TValue;>;)V"
        }
    .end annotation
.end method

.method public final loadBefore$paging_common(Landroidx/paging/ItemKeyedDataSource$LoadParams;Lvc/c;)Ljava/lang/Object;
    .locals 3
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/ItemKeyedDataSource$LoadParams<",
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

    .line 2
    .line 3
    invoke-static {p2}, Lkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt;->d(Lvc/c;)Lvc/c;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/c;-><init>(Lvc/c;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lkotlinx/coroutines/c;->F()V

    .line 12
    .line 13
    .line 14
    invoke-static {p0, v0}, Landroidx/paging/ItemKeyedDataSource;->access$asCallback(Landroidx/paging/ItemKeyedDataSource;Lsd/j;)Landroidx/paging/ItemKeyedDataSource$asCallback$1;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {p0, p1, v1}, Landroidx/paging/ItemKeyedDataSource;->loadBefore(Landroidx/paging/ItemKeyedDataSource$LoadParams;Landroidx/paging/ItemKeyedDataSource$LoadCallback;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lkotlinx/coroutines/c;->x()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-ne p1, v0, :cond_0

    .line 30
    .line 31
    invoke-static {p2}, Lxc/f;->c(Lvc/c;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-object p1
.end method

.method public abstract loadInitial(Landroidx/paging/ItemKeyedDataSource$LoadInitialParams;Landroidx/paging/ItemKeyedDataSource$LoadInitialCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/ItemKeyedDataSource$LoadInitialParams<",
            "TKey;>;",
            "Landroidx/paging/ItemKeyedDataSource$LoadInitialCallback<",
            "TValue;>;)V"
        }
    .end annotation
.end method

.method public final loadInitial$paging_common(Landroidx/paging/ItemKeyedDataSource$LoadInitialParams;Lvc/c;)Ljava/lang/Object;
    .locals 3
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/ItemKeyedDataSource$LoadInitialParams<",
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

    .line 2
    .line 3
    invoke-static {p2}, Lkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt;->d(Lvc/c;)Lvc/c;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/c;-><init>(Lvc/c;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lkotlinx/coroutines/c;->F()V

    .line 12
    .line 13
    .line 14
    new-instance v1, Landroidx/paging/ItemKeyedDataSource$loadInitial$2$1;

    .line 15
    .line 16
    invoke-direct {v1, v0, p0}, Landroidx/paging/ItemKeyedDataSource$loadInitial$2$1;-><init>(Lsd/j;Landroidx/paging/ItemKeyedDataSource;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1, v1}, Landroidx/paging/ItemKeyedDataSource;->loadInitial(Landroidx/paging/ItemKeyedDataSource$LoadInitialParams;Landroidx/paging/ItemKeyedDataSource$LoadInitialCallback;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lkotlinx/coroutines/c;->x()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-ne p1, v0, :cond_0

    .line 31
    .line 32
    invoke-static {p2}, Lxc/f;->c(Lvc/c;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-object p1
.end method

.method public bridge synthetic map(Landroidx/arch/core/util/Function;)Landroidx/paging/DataSource;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/paging/ItemKeyedDataSource;->map(Landroidx/arch/core/util/Function;)Landroidx/paging/ItemKeyedDataSource;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic map(Lhd/l;)Landroidx/paging/DataSource;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Landroidx/paging/ItemKeyedDataSource;->map(Lhd/l;)Landroidx/paging/ItemKeyedDataSource;

    move-result-object p1

    return-object p1
.end method

.method public final map(Landroidx/arch/core/util/Function;)Landroidx/paging/ItemKeyedDataSource;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ToValue:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/arch/core/util/Function<",
            "TValue;TToValue;>;)",
            "Landroidx/paging/ItemKeyedDataSource<",
            "TKey;TToValue;>;"
        }
    .end annotation

    const-string v0, "function"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Landroidx/paging/v;

    invoke-direct {v0, p1}, Landroidx/paging/v;-><init>(Landroidx/arch/core/util/Function;)V

    invoke-virtual {p0, v0}, Landroidx/paging/ItemKeyedDataSource;->mapByPage(Landroidx/arch/core/util/Function;)Landroidx/paging/ItemKeyedDataSource;

    move-result-object p1

    return-object p1
.end method

.method public final map(Lhd/l;)Landroidx/paging/ItemKeyedDataSource;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ToValue:",
            "Ljava/lang/Object;",
            ">(",
            "Lhd/l;",
            ")",
            "Landroidx/paging/ItemKeyedDataSource<",
            "TKey;TToValue;>;"
        }
    .end annotation

    const-string v0, "function"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    new-instance v0, Landroidx/paging/t;

    invoke-direct {v0, p1}, Landroidx/paging/t;-><init>(Lhd/l;)V

    invoke-virtual {p0, v0}, Landroidx/paging/ItemKeyedDataSource;->mapByPage(Landroidx/arch/core/util/Function;)Landroidx/paging/ItemKeyedDataSource;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mapByPage(Landroidx/arch/core/util/Function;)Landroidx/paging/DataSource;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/paging/ItemKeyedDataSource;->mapByPage(Landroidx/arch/core/util/Function;)Landroidx/paging/ItemKeyedDataSource;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mapByPage(Lhd/l;)Landroidx/paging/DataSource;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Landroidx/paging/ItemKeyedDataSource;->mapByPage(Lhd/l;)Landroidx/paging/ItemKeyedDataSource;

    move-result-object p1

    return-object p1
.end method

.method public final mapByPage(Landroidx/arch/core/util/Function;)Landroidx/paging/ItemKeyedDataSource;
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
            "Landroidx/paging/ItemKeyedDataSource<",
            "TKey;TToValue;>;"
        }
    .end annotation

    const-string v0, "function"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Landroidx/paging/WrapperItemKeyedDataSource;

    invoke-direct {v0, p0, p1}, Landroidx/paging/WrapperItemKeyedDataSource;-><init>(Landroidx/paging/ItemKeyedDataSource;Landroidx/arch/core/util/Function;)V

    return-object v0
.end method

.method public final mapByPage(Lhd/l;)Landroidx/paging/ItemKeyedDataSource;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ToValue:",
            "Ljava/lang/Object;",
            ">(",
            "Lhd/l;",
            ")",
            "Landroidx/paging/ItemKeyedDataSource<",
            "TKey;TToValue;>;"
        }
    .end annotation

    const-string v0, "function"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    new-instance v0, Landroidx/paging/u;

    invoke-direct {v0, p1}, Landroidx/paging/u;-><init>(Lhd/l;)V

    invoke-virtual {p0, v0}, Landroidx/paging/ItemKeyedDataSource;->mapByPage(Landroidx/arch/core/util/Function;)Landroidx/paging/ItemKeyedDataSource;

    move-result-object p1

    return-object p1
.end method
