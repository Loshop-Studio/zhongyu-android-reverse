.class final Landroidx/paging/AccessorStateHolder;
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
.field private final _loadStates:Lvd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvd/l;"
        }
    .end annotation
.end field

.field private final internalState:Landroidx/paging/AccessorState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/AccessorState<",
            "TKey;TValue;>;"
        }
    .end annotation
.end field

.field private final lock:Landroidx/paging/internal/SynchronizedLock;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/paging/internal/SynchronizedLock;

    .line 5
    .line 6
    invoke-direct {v0}, Landroidx/paging/internal/SynchronizedLock;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/paging/AccessorStateHolder;->lock:Landroidx/paging/internal/SynchronizedLock;

    .line 10
    .line 11
    sget-object v0, Landroidx/paging/LoadStates;->Companion:Landroidx/paging/LoadStates$Companion;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/paging/LoadStates$Companion;->getIDLE()Landroidx/paging/LoadStates;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lvd/v;->a(Ljava/lang/Object;)Lvd/l;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Landroidx/paging/AccessorStateHolder;->_loadStates:Lvd/l;

    .line 22
    .line 23
    new-instance v0, Landroidx/paging/AccessorState;

    .line 24
    .line 25
    invoke-direct {v0}, Landroidx/paging/AccessorState;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Landroidx/paging/AccessorStateHolder;->internalState:Landroidx/paging/AccessorState;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final getLoadStates()Lvd/u;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lvd/u;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/AccessorStateHolder;->_loadStates:Lvd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final use(Lhd/l;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lhd/l;",
            ")TR;"
        }
    .end annotation

    .line 1
    const-string v0, "block"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/paging/AccessorStateHolder;->lock:Landroidx/paging/internal/SynchronizedLock;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, Landroidx/paging/AccessorStateHolder;->internalState:Landroidx/paging/AccessorState;

    .line 10
    .line 11
    invoke-interface {p1, v1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v1, p0, Landroidx/paging/AccessorStateHolder;->_loadStates:Lvd/l;

    .line 16
    .line 17
    iget-object v2, p0, Landroidx/paging/AccessorStateHolder;->internalState:Landroidx/paging/AccessorState;

    .line 18
    .line 19
    invoke-virtual {v2}, Landroidx/paging/AccessorState;->computeLoadStates()Landroidx/paging/LoadStates;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-interface {v1, v2}, Lvd/l;->setValue(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    monitor-exit v0

    .line 27
    return-object p1

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    monitor-exit v0

    .line 30
    throw p1
.end method
