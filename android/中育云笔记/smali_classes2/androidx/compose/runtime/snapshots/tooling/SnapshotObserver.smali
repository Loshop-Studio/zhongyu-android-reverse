.class public interface abstract Landroidx/compose/runtime/snapshots/tooling/SnapshotObserver;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/ExperimentalComposeRuntimeApi;
.end annotation


# virtual methods
.method public onApplied(Landroidx/compose/runtime/snapshots/Snapshot;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/snapshots/Snapshot;",
            "Ljava/util/Set<",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public onCreated(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;)V
    .locals 0

    return-void
.end method

.method public onCreating(Landroidx/compose/runtime/snapshots/Snapshot;Z)Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;
    .locals 0
    .annotation runtime Lqc/a;
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public onDisposing(Landroidx/compose/runtime/snapshots/Snapshot;)V
    .locals 0
    .annotation runtime Lqc/a;
    .end annotation

    return-void
.end method

.method public onPreCreate(Landroidx/compose/runtime/snapshots/Snapshot;Z)Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;
    .locals 0

    .line 1
    invoke-interface {p0, p1, p2}, Landroidx/compose/runtime/snapshots/tooling/SnapshotObserver;->onCreating(Landroidx/compose/runtime/snapshots/Snapshot;Z)Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public onPreDispose(Landroidx/compose/runtime/snapshots/Snapshot;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Landroidx/compose/runtime/snapshots/tooling/SnapshotObserver;->onDisposing(Landroidx/compose/runtime/snapshots/Snapshot;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
