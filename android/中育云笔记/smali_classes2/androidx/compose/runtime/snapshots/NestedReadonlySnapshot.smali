.class public final Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;
.super Landroidx/compose/runtime/snapshots/Snapshot;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final parent:Landroidx/compose/runtime/snapshots/Snapshot;

.field private final readObserver:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;Lhd/l;Landroidx/compose/runtime/snapshots/Snapshot;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Landroidx/compose/runtime/snapshots/SnapshotIdSet;",
            "Lhd/l;",
            "Landroidx/compose/runtime/snapshots/Snapshot;",
            ")V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/compose/runtime/snapshots/Snapshot;-><init>(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/internal/n;)V

    .line 3
    .line 4
    .line 5
    iput-object p4, p0, Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;->readObserver:Lhd/l;

    .line 6
    .line 7
    iput-object p5, p0, Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;->parent:Landroidx/compose/runtime/snapshots/Snapshot;

    .line 8
    .line 9
    invoke-virtual {p5, p0}, Landroidx/compose/runtime/snapshots/Snapshot;->nestedActivated$runtime_release(Landroidx/compose/runtime/snapshots/Snapshot;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/Snapshot;->getDisposed$runtime_release()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/Snapshot;->getSnapshotId()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    iget-object v2, p0, Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;->parent:Landroidx/compose/runtime/snapshots/Snapshot;

    .line 12
    .line 13
    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/Snapshot;->getSnapshotId()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    cmp-long v0, v0, v2

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/Snapshot;->closeAndReleasePinning$runtime_release()V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;->parent:Landroidx/compose/runtime/snapshots/Snapshot;

    .line 25
    .line 26
    invoke-virtual {v0, p0}, Landroidx/compose/runtime/snapshots/Snapshot;->nestedDeactivated$runtime_release(Landroidx/compose/runtime/snapshots/Snapshot;)V

    .line 27
    .line 28
    .line 29
    invoke-super {p0}, Landroidx/compose/runtime/snapshots/Snapshot;->dispose()V

    .line 30
    .line 31
    .line 32
    invoke-static {p0}, Landroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt;->dispatchObserverOnPreDispose(Landroidx/compose/runtime/snapshots/Snapshot;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void
.end method

.method public getModified$runtime_release()Landroidx/collection/MutableScatterSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/collection/MutableScatterSet<",
            "Landroidx/compose/runtime/snapshots/StateObject;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getParent()Landroidx/compose/runtime/snapshots/Snapshot;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;->parent:Landroidx/compose/runtime/snapshots/Snapshot;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic getReadObserver()Lhd/l;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;->getReadObserver$runtime_release()Lhd/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getReadObserver$runtime_release()Lhd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;->readObserver:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public getReadOnly()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getRoot()Landroidx/compose/runtime/snapshots/Snapshot;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;->parent:Landroidx/compose/runtime/snapshots/Snapshot;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/Snapshot;->getRoot()Landroidx/compose/runtime/snapshots/Snapshot;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getWriteObserver$runtime_release()Lhd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public hasPendingChanges()Z
    .locals 1

    const/4 v0, 0x0

    return v0
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
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;->nestedActivated$runtime_release(Landroidx/compose/runtime/snapshots/Snapshot;)Ljava/lang/Void;

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
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;->nestedDeactivated$runtime_release(Landroidx/compose/runtime/snapshots/Snapshot;)Ljava/lang/Void;

    return-void
.end method

.method public notifyObjectsInitialized$runtime_release()V
    .locals 0

    return-void
.end method

.method public recordModified$runtime_release(Landroidx/compose/runtime/snapshots/StateObject;)Ljava/lang/Void;
    .locals 0

    .line 2
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->access$reportReadonlySnapshotWrite()Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public bridge synthetic recordModified$runtime_release(Landroidx/compose/runtime/snapshots/StateObject;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;->recordModified$runtime_release(Landroidx/compose/runtime/snapshots/StateObject;)Ljava/lang/Void;

    return-void
.end method

.method public takeNestedSnapshot(Lhd/l;)Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")",
            "Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;"
        }
    .end annotation

    .line 2
    invoke-static {}, Landroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt;->access$getObservers$p()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    .line 3
    invoke-static {v0, p0, v2, p1, v1}, Landroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt;->mergeObservers(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Landroidx/compose/runtime/snapshots/Snapshot;ZLhd/l;Lhd/l;)Lkotlin/Pair;

    move-result-object p1

    .line 4
    invoke-virtual {p1}, Lkotlin/Pair;->f()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;

    .line 5
    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;->getReadObserver()Lhd/l;

    move-result-object v3

    .line 6
    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;->getWriteObserver()Lhd/l;

    .line 7
    invoke-virtual {p1}, Lkotlin/Pair;->g()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    move-object v2, p1

    move-object p1, v3

    goto :goto_0

    :cond_0
    move-object v2, v1

    .line 8
    :goto_0
    new-instance v3, Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;

    .line 9
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/Snapshot;->getSnapshotId()J

    move-result-wide v4

    .line 10
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/Snapshot;->getInvalid$runtime_release()Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    move-result-object v6

    .line 11
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;->getReadObserver$runtime_release()Lhd/l;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x4

    invoke-static {p1, v7, v8, v9, v1}, Landroidx/compose/runtime/snapshots/SnapshotKt;->mergedReadObserver$default(Lhd/l;Lhd/l;ZILjava/lang/Object;)Lhd/l;

    move-result-object v7

    .line 12
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;->getParent()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v8

    .line 13
    invoke-direct/range {v3 .. v8}, Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;-><init>(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;Lhd/l;Landroidx/compose/runtime/snapshots/Snapshot;)V

    if-eqz v0, :cond_1

    .line 14
    invoke-static {v0, p0, v3, v2}, Landroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt;->dispatchCreatedObservers(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Ljava/util/Map;)V

    :cond_1
    return-object v3
.end method

.method public bridge synthetic takeNestedSnapshot(Lhd/l;)Landroidx/compose/runtime/snapshots/Snapshot;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;->takeNestedSnapshot(Lhd/l;)Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;

    move-result-object p1

    return-object p1
.end method
