.class final Landroidx/paging/HintHandler$State;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/paging/HintHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "State"
.end annotation


# instance fields
.field private final append:Landroidx/paging/HintHandler$HintFlow;

.field private lastAccessHint:Landroidx/paging/ViewportHint$Access;

.field private final lock:Landroidx/paging/internal/SynchronizedLock;

.field private final prepend:Landroidx/paging/HintHandler$HintFlow;

.field final synthetic this$0:Landroidx/paging/HintHandler;


# direct methods
.method public constructor <init>(Landroidx/paging/HintHandler;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/paging/HintHandler$State;->this$0:Landroidx/paging/HintHandler;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroidx/paging/HintHandler$HintFlow;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Landroidx/paging/HintHandler$HintFlow;-><init>(Landroidx/paging/HintHandler;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Landroidx/paging/HintHandler$State;->prepend:Landroidx/paging/HintHandler$HintFlow;

    .line 12
    .line 13
    new-instance v0, Landroidx/paging/HintHandler$HintFlow;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Landroidx/paging/HintHandler$HintFlow;-><init>(Landroidx/paging/HintHandler;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Landroidx/paging/HintHandler$State;->append:Landroidx/paging/HintHandler$HintFlow;

    .line 19
    .line 20
    new-instance p1, Landroidx/paging/internal/SynchronizedLock;

    .line 21
    .line 22
    invoke-direct {p1}, Landroidx/paging/internal/SynchronizedLock;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Landroidx/paging/HintHandler$State;->lock:Landroidx/paging/internal/SynchronizedLock;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final getAppendFlow()Lvd/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lvd/c;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/HintHandler$State;->append:Landroidx/paging/HintHandler$HintFlow;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/paging/HintHandler$HintFlow;->getFlow()Lvd/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final getLastAccessHint()Landroidx/paging/ViewportHint$Access;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/HintHandler$State;->lastAccessHint:Landroidx/paging/ViewportHint$Access;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPrependFlow()Lvd/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lvd/c;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/HintHandler$State;->prepend:Landroidx/paging/HintHandler$HintFlow;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/paging/HintHandler$HintFlow;->getFlow()Lvd/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final modify(Landroidx/paging/ViewportHint$Access;Lhd/p;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/ViewportHint$Access;",
            "Lhd/p;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "block"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/paging/HintHandler$State;->lock:Landroidx/paging/internal/SynchronizedLock;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    :try_start_0
    iput-object p1, p0, Landroidx/paging/HintHandler$State;->lastAccessHint:Landroidx/paging/ViewportHint$Access;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    :goto_0
    iget-object p1, p0, Landroidx/paging/HintHandler$State;->prepend:Landroidx/paging/HintHandler$HintFlow;

    .line 17
    .line 18
    iget-object v1, p0, Landroidx/paging/HintHandler$State;->append:Landroidx/paging/HintHandler$HintFlow;

    .line 19
    .line 20
    invoke-interface {p2, p1, v1}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    sget-object p1, Lqc/q;->a:Lqc/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    monitor-exit v0

    .line 26
    return-void

    .line 27
    :goto_1
    monitor-exit v0

    .line 28
    throw p1
.end method
