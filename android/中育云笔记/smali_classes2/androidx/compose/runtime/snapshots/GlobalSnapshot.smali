.class public final Landroidx/compose/runtime/snapshots/GlobalSnapshot;
.super Landroidx/compose/runtime/snapshots/MutableSnapshot;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation


# static fields
.field public static final $stable:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;)V
    .locals 6

    .line 1
    const/4 v4, 0x0

    .line 2
    sget-object v5, Landroidx/compose/runtime/snapshots/GlobalSnapshot$1;->INSTANCE:Landroidx/compose/runtime/snapshots/GlobalSnapshot$1;

    .line 3
    .line 4
    move-object v0, p0

    .line 5
    move-wide v1, p1

    .line 6
    move-object v3, p3

    .line 7
    invoke-direct/range {v0 .. v5}, Landroidx/compose/runtime/snapshots/MutableSnapshot;-><init>(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;Lhd/l;Lhd/l;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public apply()Landroidx/compose/runtime/snapshots/SnapshotApplyResult;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v1, "Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public dispose()V
    .locals 2

    .line 1
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->getLock()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/Snapshot;->releasePinnedSnapshotLocked$runtime_release()V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lqc/q;->a:Lqc/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    monitor-exit v0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v1

    .line 14
    monitor-exit v0

    .line 15
    throw v1
.end method

.method public nestedActivated$runtime_release(Landroidx/compose/runtime/snapshots/Snapshot;)Ljava/lang/Void;
    .locals 0

    .line 2
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotStateMapKt;->unsupported()Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public bridge synthetic nestedActivated$runtime_release(Landroidx/compose/runtime/snapshots/Snapshot;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/GlobalSnapshot;->nestedActivated$runtime_release(Landroidx/compose/runtime/snapshots/Snapshot;)Ljava/lang/Void;

    return-void
.end method

.method public nestedDeactivated$runtime_release(Landroidx/compose/runtime/snapshots/Snapshot;)Ljava/lang/Void;
    .locals 0

    .line 2
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotStateMapKt;->unsupported()Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public bridge synthetic nestedDeactivated$runtime_release(Landroidx/compose/runtime/snapshots/Snapshot;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/GlobalSnapshot;->nestedDeactivated$runtime_release(Landroidx/compose/runtime/snapshots/Snapshot;)Ljava/lang/Void;

    return-void
.end method

.method public notifyObjectsInitialized$runtime_release()V
    .locals 0

    .line 1
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->access$advanceGlobalSnapshot()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public takeNestedMutableSnapshot(Lhd/l;Lhd/l;)Landroidx/compose/runtime/snapshots/MutableSnapshot;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            "Lhd/l;",
            ")",
            "Landroidx/compose/runtime/snapshots/MutableSnapshot;"
        }
    .end annotation

    .line 1
    invoke-static {}, Landroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt;->access$getObservers$p()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-static {v0, v1, v2, p1, p2}, Landroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt;->mergeObservers(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Landroidx/compose/runtime/snapshots/Snapshot;ZLhd/l;Lhd/l;)Lkotlin/Pair;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Lkotlin/Pair;->f()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    check-cast p2, Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;

    .line 18
    .line 19
    invoke-virtual {p2}, Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;->getReadObserver()Lhd/l;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {p2}, Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;->getWriteObserver()Lhd/l;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {p1}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Ljava/util/Map;

    .line 32
    .line 33
    move-object v4, p2

    .line 34
    move-object p2, p1

    .line 35
    move-object p1, v2

    .line 36
    move-object v2, v4

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move-object v2, p2

    .line 39
    move-object p2, v1

    .line 40
    :goto_0
    new-instance v3, Landroidx/compose/runtime/snapshots/GlobalSnapshot$takeNestedMutableSnapshot$1$1;

    .line 41
    .line 42
    invoke-direct {v3, p1, v2}, Landroidx/compose/runtime/snapshots/GlobalSnapshot$takeNestedMutableSnapshot$1$1;-><init>(Lhd/l;Lhd/l;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v3}, Landroidx/compose/runtime/snapshots/SnapshotKt;->access$takeNewSnapshot(Lhd/l;)Landroidx/compose/runtime/snapshots/Snapshot;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Landroidx/compose/runtime/snapshots/MutableSnapshot;

    .line 50
    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    invoke-static {v0, v1, p1, p2}, Landroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt;->dispatchCreatedObservers(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Ljava/util/Map;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    return-object p1
.end method

.method public takeNestedSnapshot(Lhd/l;)Landroidx/compose/runtime/snapshots/Snapshot;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")",
            "Landroidx/compose/runtime/snapshots/Snapshot;"
        }
    .end annotation

    .line 1
    invoke-static {}, Landroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt;->access$getObservers$p()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-static {v0, v1, v2, p1, v1}, Landroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt;->mergeObservers(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Landroidx/compose/runtime/snapshots/Snapshot;ZLhd/l;Lhd/l;)Lkotlin/Pair;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Lkotlin/Pair;->f()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;

    .line 18
    .line 19
    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;->getReadObserver()Lhd/l;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;->getWriteObserver()Lhd/l;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Ljava/util/Map;

    .line 31
    .line 32
    move-object v2, p1

    .line 33
    move-object p1, v3

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object v2, v1

    .line 36
    :goto_0
    new-instance v3, Landroidx/compose/runtime/snapshots/GlobalSnapshot$takeNestedSnapshot$1$1;

    .line 37
    .line 38
    invoke-direct {v3, p1}, Landroidx/compose/runtime/snapshots/GlobalSnapshot$takeNestedSnapshot$1$1;-><init>(Lhd/l;)V

    .line 39
    .line 40
    .line 41
    invoke-static {v3}, Landroidx/compose/runtime/snapshots/SnapshotKt;->access$takeNewSnapshot(Lhd/l;)Landroidx/compose/runtime/snapshots/Snapshot;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Landroidx/compose/runtime/snapshots/ReadonlySnapshot;

    .line 46
    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    invoke-static {v0, v1, p1, v2}, Landroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt;->dispatchCreatedObservers(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Ljava/util/Map;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    return-object p1
.end method
