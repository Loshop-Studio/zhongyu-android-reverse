.class public abstract Landroidx/paging/DataSource$Factory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/paging/DataSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Factory"
.end annotation

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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(Landroidx/arch/core/util/Function;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/paging/DataSource$Factory;->map$lambda$0(Landroidx/arch/core/util/Function;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic asPagingSourceFactory$default(Landroidx/paging/DataSource$Factory;Lsd/e0;ILjava/lang/Object;)Lhd/a;
    .locals 0

    .line 1
    if-nez p3, :cond_1

    .line 2
    .line 3
    and-int/lit8 p2, p2, 0x1

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/paging/DataSource$Factory;->asPagingSourceFactory(Lsd/e0;)Lhd/a;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 17
    .line 18
    const-string p1, "Super calls with default arguments not supported in this target, function: asPagingSourceFactory"

    .line 19
    .line 20
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p0
.end method

.method private static final asPagingSourceFactory$lambda$0(Lsd/e0;Landroidx/paging/DataSource$Factory;)Landroidx/paging/PagingSource;
    .locals 1

    .line 1
    new-instance v0, Landroidx/paging/LegacyPagingSource;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/paging/DataSource$Factory;->create()Landroidx/paging/DataSource;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {v0, p0, p1}, Landroidx/paging/LegacyPagingSource;-><init>(Lkotlin/coroutines/d;Landroidx/paging/DataSource;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static synthetic b(Lhd/l;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/paging/DataSource$Factory;->map$lambda$1(Lhd/l;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lsd/e0;Landroidx/paging/DataSource$Factory;)Landroidx/paging/PagingSource;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/paging/DataSource$Factory;->asPagingSourceFactory$lambda$0(Lsd/e0;Landroidx/paging/DataSource$Factory;)Landroidx/paging/PagingSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lhd/l;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/paging/DataSource$Factory;->mapByPage$lambda$0(Lhd/l;Ljava/util/List;)Ljava/util/List;

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
.method public final asPagingSourceFactory()Lhd/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/a;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-static {p0, v0, v1, v0}, Landroidx/paging/DataSource$Factory;->asPagingSourceFactory$default(Landroidx/paging/DataSource$Factory;Lsd/e0;ILjava/lang/Object;)Lhd/a;

    move-result-object v0

    return-object v0
.end method

.method public final asPagingSourceFactory(Lsd/e0;)Lhd/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/e0;",
            ")",
            "Lhd/a;"
        }
    .end annotation

    const-string v0, "fetchDispatcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Landroidx/paging/SuspendingPagingSourceFactory;

    .line 3
    new-instance v1, Landroidx/paging/o;

    invoke-direct {v1, p1, p0}, Landroidx/paging/o;-><init>(Lsd/e0;Landroidx/paging/DataSource$Factory;)V

    .line 4
    invoke-direct {v0, p1, v1}, Landroidx/paging/SuspendingPagingSourceFactory;-><init>(Lsd/e0;Lhd/a;)V

    return-object v0
.end method

.method public abstract create()Landroidx/paging/DataSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/paging/DataSource<",
            "TKey;TValue;>;"
        }
    .end annotation
.end method

.method public map(Landroidx/arch/core/util/Function;)Landroidx/paging/DataSource$Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ToValue:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/arch/core/util/Function<",
            "TValue;TToValue;>;)",
            "Landroidx/paging/DataSource$Factory<",
            "TKey;TToValue;>;"
        }
    .end annotation

    const-string v0, "function"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Landroidx/paging/n;

    invoke-direct {v0, p1}, Landroidx/paging/n;-><init>(Landroidx/arch/core/util/Function;)V

    invoke-virtual {p0, v0}, Landroidx/paging/DataSource$Factory;->mapByPage(Landroidx/arch/core/util/Function;)Landroidx/paging/DataSource$Factory;

    move-result-object p1

    return-object p1
.end method

.method public synthetic map(Lhd/l;)Landroidx/paging/DataSource$Factory;
    .locals 1

    const-string v0, "function"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Landroidx/paging/p;

    invoke-direct {v0, p1}, Landroidx/paging/p;-><init>(Lhd/l;)V

    invoke-virtual {p0, v0}, Landroidx/paging/DataSource$Factory;->mapByPage(Landroidx/arch/core/util/Function;)Landroidx/paging/DataSource$Factory;

    move-result-object p1

    return-object p1
.end method

.method public mapByPage(Landroidx/arch/core/util/Function;)Landroidx/paging/DataSource$Factory;
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
            "Landroidx/paging/DataSource$Factory<",
            "TKey;TToValue;>;"
        }
    .end annotation

    const-string v0, "function"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Landroidx/paging/DataSource$Factory$mapByPage$1;

    invoke-direct {v0, p0, p1}, Landroidx/paging/DataSource$Factory$mapByPage$1;-><init>(Landroidx/paging/DataSource$Factory;Landroidx/arch/core/util/Function;)V

    return-object v0
.end method

.method public synthetic mapByPage(Lhd/l;)Landroidx/paging/DataSource$Factory;
    .locals 1

    const-string v0, "function"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Landroidx/paging/q;

    invoke-direct {v0, p1}, Landroidx/paging/q;-><init>(Lhd/l;)V

    invoke-virtual {p0, v0}, Landroidx/paging/DataSource$Factory;->mapByPage(Landroidx/arch/core/util/Function;)Landroidx/paging/DataSource$Factory;

    move-result-object p1

    return-object p1
.end method
