.class public abstract Landroidx/paging/DataSource;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/paging/DataSource$BaseResult;,
        Landroidx/paging/DataSource$Companion;,
        Landroidx/paging/DataSource$Factory;,
        Landroidx/paging/DataSource$InvalidatedCallback;,
        Landroidx/paging/DataSource$KeyType;,
        Landroidx/paging/DataSource$Params;
    }
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


# static fields
.field public static final Companion:Landroidx/paging/DataSource$Companion;


# instance fields
.field private final invalidateCallbackTracker:Landroidx/paging/InvalidateCallbackTracker;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/InvalidateCallbackTracker<",
            "Landroidx/paging/DataSource$InvalidatedCallback;",
            ">;"
        }
    .end annotation
.end field

.field private final isContiguous:Z

.field private final supportsPageDropping:Z

.field private final type:Landroidx/paging/DataSource$KeyType;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/paging/DataSource$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/paging/DataSource$Companion;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Landroidx/paging/DataSource;->Companion:Landroidx/paging/DataSource$Companion;

    return-void
.end method

.method public constructor <init>(Landroidx/paging/DataSource$KeyType;)V
    .locals 2

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Landroidx/paging/DataSource;->type:Landroidx/paging/DataSource$KeyType;

    .line 10
    .line 11
    new-instance p1, Landroidx/paging/InvalidateCallbackTracker;

    .line 12
    .line 13
    new-instance v0, Landroidx/paging/l;

    .line 14
    .line 15
    invoke-direct {v0}, Landroidx/paging/l;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance v1, Landroidx/paging/m;

    .line 19
    .line 20
    invoke-direct {v1, p0}, Landroidx/paging/m;-><init>(Landroidx/paging/DataSource;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p1, v0, v1}, Landroidx/paging/InvalidateCallbackTracker;-><init>(Lhd/l;Lhd/a;)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Landroidx/paging/DataSource;->invalidateCallbackTracker:Landroidx/paging/InvalidateCallbackTracker;

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    iput-boolean p1, p0, Landroidx/paging/DataSource;->isContiguous:Z

    .line 30
    .line 31
    iput-boolean p1, p0, Landroidx/paging/DataSource;->supportsPageDropping:Z

    .line 32
    .line 33
    return-void
.end method

.method public static synthetic a(Landroidx/arch/core/util/Function;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/paging/DataSource;->map$lambda$0(Landroidx/arch/core/util/Function;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lhd/l;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/paging/DataSource;->map$lambda$1(Lhd/l;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lhd/l;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/paging/DataSource;->mapByPage$lambda$0(Lhd/l;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/paging/DataSource;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/paging/DataSource;->invalidateCallbackTracker$lambda$1(Landroidx/paging/DataSource;)Z

    move-result p0

    return p0
.end method

.method public static synthetic e(Landroidx/paging/DataSource$InvalidatedCallback;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/paging/DataSource;->invalidateCallbackTracker$lambda$0(Landroidx/paging/DataSource$InvalidatedCallback;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method private static final invalidateCallbackTracker$lambda$0(Landroidx/paging/DataSource$InvalidatedCallback;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Landroidx/paging/DataSource$InvalidatedCallback;->onInvalidated()V

    .line 7
    .line 8
    .line 9
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 10
    .line 11
    return-object p0
.end method

.method private static final invalidateCallbackTracker$lambda$1(Landroidx/paging/DataSource;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/paging/DataSource;->isInvalid()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final map$lambda$0(Landroidx/arch/core/util/Function;Ljava/util/List;)Ljava/util/List;
    .locals 2

    .line 1
    const-string v0, "list"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Iterable;

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    const/16 v1, 0xa

    .line 11
    .line 12
    invoke-static {p1, v1}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-interface {p0, v1}, Landroidx/arch/core/util/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    return-object v0
.end method

.method private static final map$lambda$1(Lhd/l;Ljava/lang/Object;)Ljava/lang/Object;
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
    return-object p0
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
.method public addInvalidatedCallback(Landroidx/paging/DataSource$InvalidatedCallback;)V
    .locals 1
    .annotation build Landroidx/annotation/AnyThread;
    .end annotation

    .line 1
    const-string v0, "onInvalidatedCallback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/paging/DataSource;->invalidateCallbackTracker:Landroidx/paging/InvalidateCallbackTracker;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroidx/paging/InvalidateCallbackTracker;->registerInvalidatedCallback$paging_common(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final getInvalidateCallbackCount$paging_common()I
    .locals 1
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/DataSource;->invalidateCallbackTracker:Landroidx/paging/InvalidateCallbackTracker;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/paging/InvalidateCallbackTracker;->callbackCount$paging_common()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public abstract getKeyInternal$paging_common(Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TValue;)TKey;"
        }
    .end annotation
.end method

.method public getSupportsPageDropping$paging_common()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/paging/DataSource;->supportsPageDropping:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getType$paging_common()Landroidx/paging/DataSource$KeyType;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/DataSource;->type:Landroidx/paging/DataSource$KeyType;

    .line 2
    .line 3
    return-object v0
.end method

.method public invalidate()V
    .locals 1
    .annotation build Landroidx/annotation/AnyThread;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/DataSource;->invalidateCallbackTracker:Landroidx/paging/InvalidateCallbackTracker;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/paging/InvalidateCallbackTracker;->invalidate$paging_common()Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public isContiguous$paging_common()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/paging/DataSource;->isContiguous:Z

    .line 2
    .line 3
    return v0
.end method

.method public isInvalid()Z
    .locals 1
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/DataSource;->invalidateCallbackTracker:Landroidx/paging/InvalidateCallbackTracker;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/paging/InvalidateCallbackTracker;->getInvalid$paging_common()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public abstract load$paging_common(Landroidx/paging/DataSource$Params;Lvc/c;)Ljava/lang/Object;
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
.end method

.method public map(Landroidx/arch/core/util/Function;)Landroidx/paging/DataSource;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ToValue:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/arch/core/util/Function<",
            "TValue;TToValue;>;)",
            "Landroidx/paging/DataSource<",
            "TKey;TToValue;>;"
        }
    .end annotation

    const-string v0, "function"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Landroidx/paging/i;

    invoke-direct {v0, p1}, Landroidx/paging/i;-><init>(Landroidx/arch/core/util/Function;)V

    invoke-virtual {p0, v0}, Landroidx/paging/DataSource;->mapByPage(Lhd/l;)Landroidx/paging/DataSource;

    move-result-object p1

    return-object p1
.end method

.method public synthetic map(Lhd/l;)Landroidx/paging/DataSource;
    .locals 1

    const-string v0, "function"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Landroidx/paging/j;

    invoke-direct {v0, p1}, Landroidx/paging/j;-><init>(Lhd/l;)V

    invoke-virtual {p0, v0}, Landroidx/paging/DataSource;->map(Landroidx/arch/core/util/Function;)Landroidx/paging/DataSource;

    move-result-object p1

    return-object p1
.end method

.method public mapByPage(Landroidx/arch/core/util/Function;)Landroidx/paging/DataSource;
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
            "Landroidx/paging/DataSource<",
            "TKey;TToValue;>;"
        }
    .end annotation

    const-string v0, "function"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Landroidx/paging/WrapperDataSource;

    invoke-direct {v0, p0, p1}, Landroidx/paging/WrapperDataSource;-><init>(Landroidx/paging/DataSource;Landroidx/arch/core/util/Function;)V

    return-object v0
.end method

.method public synthetic mapByPage(Lhd/l;)Landroidx/paging/DataSource;
    .locals 1

    const-string v0, "function"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Landroidx/paging/k;

    invoke-direct {v0, p1}, Landroidx/paging/k;-><init>(Lhd/l;)V

    invoke-virtual {p0, v0}, Landroidx/paging/DataSource;->mapByPage(Landroidx/arch/core/util/Function;)Landroidx/paging/DataSource;

    move-result-object p1

    return-object p1
.end method

.method public removeInvalidatedCallback(Landroidx/paging/DataSource$InvalidatedCallback;)V
    .locals 1
    .annotation build Landroidx/annotation/AnyThread;
    .end annotation

    .line 1
    const-string v0, "onInvalidatedCallback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/paging/DataSource;->invalidateCallbackTracker:Landroidx/paging/InvalidateCallbackTracker;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroidx/paging/InvalidateCallbackTracker;->unregisterInvalidatedCallback$paging_common(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
