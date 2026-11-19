.class public final Landroidx/paging/MutableCombinedLoadStateCollection;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final _stateFlow:Lvd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvd/l;"
        }
    .end annotation
.end field

.field private final listeners:Landroidx/paging/internal/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/internal/CopyOnWriteArrayList<",
            "Lhd/l;",
            ">;"
        }
    .end annotation
.end field

.field private final stateFlow:Lvd/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvd/u;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/paging/internal/CopyOnWriteArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Landroidx/paging/internal/CopyOnWriteArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/paging/MutableCombinedLoadStateCollection;->listeners:Landroidx/paging/internal/CopyOnWriteArrayList;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-static {v0}, Lvd/v;->a(Ljava/lang/Object;)Lvd/l;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Landroidx/paging/MutableCombinedLoadStateCollection;->_stateFlow:Lvd/l;

    .line 17
    .line 18
    invoke-static {v0}, Lvd/e;->b(Lvd/l;)Lvd/u;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Landroidx/paging/MutableCombinedLoadStateCollection;->stateFlow:Lvd/u;

    .line 23
    .line 24
    return-void
.end method

.method public static synthetic a(Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;Landroidx/paging/CombinedLoadStates;)Landroidx/paging/CombinedLoadStates;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/paging/MutableCombinedLoadStateCollection;->set$lambda$0(Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;Landroidx/paging/CombinedLoadStates;)Landroidx/paging/CombinedLoadStates;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ZLandroidx/paging/LoadType;Landroidx/paging/LoadState;Landroidx/paging/CombinedLoadStates;)Landroidx/paging/CombinedLoadStates;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/paging/MutableCombinedLoadStateCollection;->set$lambda$1(ZLandroidx/paging/LoadType;Landroidx/paging/LoadState;Landroidx/paging/CombinedLoadStates;)Landroidx/paging/CombinedLoadStates;

    move-result-object p0

    return-object p0
.end method

.method private final dispatchNewState(Lhd/l;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/MutableCombinedLoadStateCollection;->_stateFlow:Lvd/l;

    .line 2
    .line 3
    :cond_0
    invoke-interface {v0}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, Landroidx/paging/CombinedLoadStates;

    .line 9
    .line 10
    invoke-interface {p1, v2}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    check-cast v3, Landroidx/paging/CombinedLoadStates;

    .line 15
    .line 16
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    invoke-interface {v0, v1, v3}, Lvd/l;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    iget-object p1, p0, Landroidx/paging/MutableCombinedLoadStateCollection;->listeners:Landroidx/paging/internal/CopyOnWriteArrayList;

    .line 31
    .line 32
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Lhd/l;

    .line 47
    .line 48
    invoke-interface {v0, v3}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    return-void
.end method

.method private static final set$lambda$0(Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;Landroidx/paging/CombinedLoadStates;)Landroidx/paging/CombinedLoadStates;
    .locals 0

    .line 1
    invoke-static {p2, p0, p1}, Landroidx/paging/MutableCombinedLoadStateCollectionKt;->computeNewState(Landroidx/paging/CombinedLoadStates;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)Landroidx/paging/CombinedLoadStates;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final set$lambda$1(ZLandroidx/paging/LoadType;Landroidx/paging/LoadState;Landroidx/paging/CombinedLoadStates;)Landroidx/paging/CombinedLoadStates;
    .locals 2

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-virtual {p3}, Landroidx/paging/CombinedLoadStates;->getSource()Landroidx/paging/LoadStates;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    :cond_0
    sget-object v0, Landroidx/paging/LoadStates;->Companion:Landroidx/paging/LoadStates$Companion;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/paging/LoadStates$Companion;->getIDLE()Landroidx/paging/LoadStates;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :cond_1
    if-eqz p3, :cond_2

    .line 16
    .line 17
    invoke-virtual {p3}, Landroidx/paging/CombinedLoadStates;->getMediator()Landroidx/paging/LoadStates;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    goto :goto_0

    .line 22
    :cond_2
    const/4 v1, 0x0

    .line 23
    :goto_0
    if-eqz p0, :cond_3

    .line 24
    .line 25
    sget-object p0, Landroidx/paging/LoadStates;->Companion:Landroidx/paging/LoadStates$Companion;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroidx/paging/LoadStates$Companion;->getIDLE()Landroidx/paging/LoadStates;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0, p1, p2}, Landroidx/paging/LoadStates;->modifyState$paging_common(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)Landroidx/paging/LoadStates;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    goto :goto_1

    .line 36
    :cond_3
    invoke-virtual {v0, p1, p2}, Landroidx/paging/LoadStates;->modifyState$paging_common(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)Landroidx/paging/LoadStates;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :goto_1
    invoke-static {p3, v0, v1}, Landroidx/paging/MutableCombinedLoadStateCollectionKt;->computeNewState(Landroidx/paging/CombinedLoadStates;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)Landroidx/paging/CombinedLoadStates;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method


# virtual methods
.method public final addListener(Lhd/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
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
    iget-object v0, p0, Landroidx/paging/MutableCombinedLoadStateCollection;->listeners:Landroidx/paging/internal/CopyOnWriteArrayList;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroidx/paging/internal/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/paging/MutableCombinedLoadStateCollection;->_stateFlow:Lvd/l;

    .line 12
    .line 13
    invoke-interface {v0}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroidx/paging/CombinedLoadStates;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-interface {p1, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final get(Landroidx/paging/LoadType;Z)Landroidx/paging/LoadState;
    .locals 2

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/paging/MutableCombinedLoadStateCollection;->_stateFlow:Lvd/l;

    .line 7
    .line 8
    invoke-interface {v0}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Landroidx/paging/CombinedLoadStates;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz p2, :cond_1

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/paging/CombinedLoadStates;->getMediator()Landroidx/paging/LoadStates;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object p2, v1

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Landroidx/paging/CombinedLoadStates;->getSource()Landroidx/paging/LoadStates;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    :goto_0
    if-eqz p2, :cond_2

    .line 33
    .line 34
    invoke-virtual {p2, p1}, Landroidx/paging/LoadStates;->get$paging_common(Landroidx/paging/LoadType;)Landroidx/paging/LoadState;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1

    .line 39
    :cond_2
    return-object v1
.end method

.method public final getStateFlow()Lvd/u;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lvd/u;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/MutableCombinedLoadStateCollection;->stateFlow:Lvd/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final removeListener(Lhd/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
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
    iget-object v0, p0, Landroidx/paging/MutableCombinedLoadStateCollection;->listeners:Landroidx/paging/internal/CopyOnWriteArrayList;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroidx/paging/internal/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final set(Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V
    .locals 1

    const-string v0, "sourceLoadStates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Landroidx/paging/d0;

    invoke-direct {v0, p1, p2}, Landroidx/paging/d0;-><init>(Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V

    invoke-direct {p0, v0}, Landroidx/paging/MutableCombinedLoadStateCollection;->dispatchNewState(Lhd/l;)V

    return-void
.end method

.method public final set(Landroidx/paging/LoadType;ZLandroidx/paging/LoadState;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Landroidx/paging/c0;

    invoke-direct {v0, p2, p1, p3}, Landroidx/paging/c0;-><init>(ZLandroidx/paging/LoadType;Landroidx/paging/LoadState;)V

    invoke-direct {p0, v0}, Landroidx/paging/MutableCombinedLoadStateCollection;->dispatchNewState(Lhd/l;)V

    return-void
.end method
