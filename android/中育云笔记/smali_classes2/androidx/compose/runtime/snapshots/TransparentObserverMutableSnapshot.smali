.class public final Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;
.super Landroidx/compose/runtime/snapshots/MutableSnapshot;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final mergeParentObservers:Z

.field private final ownsParentSnapshot:Z

.field private final parentSnapshot:Landroidx/compose/runtime/snapshots/MutableSnapshot;

.field private readObserver:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field private final threadId:J

.field private writeObserver:Lhd/l;
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

.method public constructor <init>(Landroidx/compose/runtime/snapshots/MutableSnapshot;Lhd/l;Lhd/l;ZZ)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/snapshots/MutableSnapshot;",
            "Lhd/l;",
            "Lhd/l;",
            "ZZ)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->access$getINVALID_SNAPSHOT$p()J

    .line 2
    .line 3
    .line 4
    move-result-wide v1

    .line 5
    sget-object v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->Companion:Landroidx/compose/runtime/snapshots/SnapshotIdSet$Companion;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotIdSet$Companion;->getEMPTY()Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/compose/runtime/snapshots/MutableSnapshot;->getReadObserver$runtime_release()Lhd/l;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    :cond_0
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->access$getGlobalSnapshot$p()Landroidx/compose/runtime/snapshots/GlobalSnapshot;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/MutableSnapshot;->getReadObserver$runtime_release()Lhd/l;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :cond_1
    invoke-static {p2, v0, p4}, Landroidx/compose/runtime/snapshots/SnapshotKt;->access$mergedReadObserver(Lhd/l;Lhd/l;Z)Lhd/l;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    invoke-virtual {p1}, Landroidx/compose/runtime/snapshots/MutableSnapshot;->getWriteObserver$runtime_release()Lhd/l;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    if-nez p2, :cond_3

    .line 38
    .line 39
    :cond_2
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->access$getGlobalSnapshot$p()Landroidx/compose/runtime/snapshots/GlobalSnapshot;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-virtual {p2}, Landroidx/compose/runtime/snapshots/MutableSnapshot;->getWriteObserver$runtime_release()Lhd/l;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    :cond_3
    invoke-static {p3, p2}, Landroidx/compose/runtime/snapshots/SnapshotKt;->access$mergedWriteObserver(Lhd/l;Lhd/l;)Lhd/l;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    move-object v0, p0

    .line 52
    invoke-direct/range {v0 .. v5}, Landroidx/compose/runtime/snapshots/MutableSnapshot;-><init>(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;Lhd/l;Lhd/l;)V

    .line 53
    .line 54
    .line 55
    iput-object p1, v0, Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;->parentSnapshot:Landroidx/compose/runtime/snapshots/MutableSnapshot;

    .line 56
    .line 57
    iput-boolean p4, v0, Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;->mergeParentObservers:Z

    .line 58
    .line 59
    iput-boolean p5, v0, Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;->ownsParentSnapshot:Z

    .line 60
    .line 61
    invoke-super {p0}, Landroidx/compose/runtime/snapshots/MutableSnapshot;->getReadObserver$runtime_release()Lhd/l;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iput-object p1, v0, Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;->readObserver:Lhd/l;

    .line 66
    .line 67
    invoke-super {p0}, Landroidx/compose/runtime/snapshots/MutableSnapshot;->getWriteObserver$runtime_release()Lhd/l;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iput-object p1, v0, Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;->writeObserver:Lhd/l;

    .line 72
    .line 73
    invoke-static {}, Landroidx/compose/runtime/internal/Thread_jvmKt;->currentThreadId()J

    .line 74
    .line 75
    .line 76
    move-result-wide p1

    .line 77
    iput-wide p1, v0, Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;->threadId:J

    .line 78
    .line 79
    return-void
.end method

.method private final getCurrentSnapshot()Landroidx/compose/runtime/snapshots/MutableSnapshot;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;->parentSnapshot:Landroidx/compose/runtime/snapshots/MutableSnapshot;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->access$getGlobalSnapshot$p()Landroidx/compose/runtime/snapshots/GlobalSnapshot;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method


# virtual methods
.method public apply()Landroidx/compose/runtime/snapshots/SnapshotApplyResult;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;->getCurrentSnapshot()Landroidx/compose/runtime/snapshots/MutableSnapshot;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/MutableSnapshot;->apply()Landroidx/compose/runtime/snapshots/SnapshotApplyResult;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public dispose()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Landroidx/compose/runtime/snapshots/Snapshot;->setDisposed$runtime_release(Z)V

    .line 3
    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;->ownsParentSnapshot:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;->parentSnapshot:Landroidx/compose/runtime/snapshots/MutableSnapshot;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/MutableSnapshot;->dispose()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public getInvalid$runtime_release()Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;->getCurrentSnapshot()Landroidx/compose/runtime/snapshots/MutableSnapshot;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/Snapshot;->getInvalid$runtime_release()Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
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

    .line 1
    invoke-direct {p0}, Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;->getCurrentSnapshot()Landroidx/compose/runtime/snapshots/MutableSnapshot;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/MutableSnapshot;->getModified$runtime_release()Landroidx/collection/MutableScatterSet;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public bridge synthetic getReadObserver()Lhd/l;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;->getReadObserver$runtime_release()Lhd/l;

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
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;->readObserver:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public getReadOnly()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;->getCurrentSnapshot()Landroidx/compose/runtime/snapshots/MutableSnapshot;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/MutableSnapshot;->getReadOnly()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public getSnapshotId()J
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;->getCurrentSnapshot()Landroidx/compose/runtime/snapshots/MutableSnapshot;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/Snapshot;->getSnapshotId()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public final getThreadId$runtime_release()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;->threadId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getWriteCount$runtime_release()I
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;->getCurrentSnapshot()Landroidx/compose/runtime/snapshots/MutableSnapshot;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/MutableSnapshot;->getWriteCount$runtime_release()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
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
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;->writeObserver:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public hasPendingChanges()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;->getCurrentSnapshot()Landroidx/compose/runtime/snapshots/MutableSnapshot;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/MutableSnapshot;->hasPendingChanges()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
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
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;->nestedActivated$runtime_release(Landroidx/compose/runtime/snapshots/Snapshot;)Ljava/lang/Void;

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
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;->nestedDeactivated$runtime_release(Landroidx/compose/runtime/snapshots/Snapshot;)Ljava/lang/Void;

    return-void
.end method

.method public notifyObjectsInitialized$runtime_release()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;->getCurrentSnapshot()Landroidx/compose/runtime/snapshots/MutableSnapshot;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/MutableSnapshot;->notifyObjectsInitialized$runtime_release()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public recordModified$runtime_release(Landroidx/compose/runtime/snapshots/StateObject;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;->getCurrentSnapshot()Landroidx/compose/runtime/snapshots/MutableSnapshot;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroidx/compose/runtime/snapshots/MutableSnapshot;->recordModified$runtime_release(Landroidx/compose/runtime/snapshots/StateObject;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setInvalid$runtime_release(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V
    .locals 0

    .line 1
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotStateMapKt;->unsupported()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    new-instance p1, Lkotlin/KotlinNothingValueException;

    .line 5
    .line 6
    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 7
    .line 8
    .line 9
    throw p1
.end method

.method public setModified(Landroidx/collection/MutableScatterSet;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/MutableScatterSet<",
            "Landroidx/compose/runtime/snapshots/StateObject;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotStateMapKt;->unsupported()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    new-instance p1, Lkotlin/KotlinNothingValueException;

    .line 5
    .line 6
    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 7
    .line 8
    .line 9
    throw p1
.end method

.method public setReadObserver(Lhd/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;->readObserver:Lhd/l;

    .line 2
    .line 3
    return-void
.end method

.method public setSnapshotId$runtime_release(J)V
    .locals 0

    .line 1
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotStateMapKt;->unsupported()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    new-instance p1, Lkotlin/KotlinNothingValueException;

    .line 5
    .line 6
    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 7
    .line 8
    .line 9
    throw p1
.end method

.method public setWriteCount$runtime_release(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;->getCurrentSnapshot()Landroidx/compose/runtime/snapshots/MutableSnapshot;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroidx/compose/runtime/snapshots/MutableSnapshot;->setWriteCount$runtime_release(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setWriteObserver(Lhd/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;->writeObserver:Lhd/l;

    .line 2
    .line 3
    return-void
.end method

.method public takeNestedMutableSnapshot(Lhd/l;Lhd/l;)Landroidx/compose/runtime/snapshots/MutableSnapshot;
    .locals 10
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
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;->getReadObserver$runtime_release()Lhd/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x4

    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-static {p1, v0, v1, v2, v3}, Landroidx/compose/runtime/snapshots/SnapshotKt;->mergedReadObserver$default(Lhd/l;Lhd/l;ZILjava/lang/Object;)Lhd/l;

    .line 9
    .line 10
    .line 11
    move-result-object v6

    .line 12
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;->getWriteObserver$runtime_release()Lhd/l;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p2, p1}, Landroidx/compose/runtime/snapshots/SnapshotKt;->access$mergedWriteObserver(Lhd/l;Lhd/l;)Lhd/l;

    .line 17
    .line 18
    .line 19
    move-result-object v7

    .line 20
    iget-boolean p1, p0, Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;->mergeParentObservers:Z

    .line 21
    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    invoke-direct {p0}, Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;->getCurrentSnapshot()Landroidx/compose/runtime/snapshots/MutableSnapshot;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1, v3, v7}, Landroidx/compose/runtime/snapshots/MutableSnapshot;->takeNestedMutableSnapshot(Lhd/l;Lhd/l;)Landroidx/compose/runtime/snapshots/MutableSnapshot;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    new-instance v4, Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;

    .line 33
    .line 34
    const/4 v8, 0x0

    .line 35
    const/4 v9, 0x1

    .line 36
    invoke-direct/range {v4 .. v9}, Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;-><init>(Landroidx/compose/runtime/snapshots/MutableSnapshot;Lhd/l;Lhd/l;ZZ)V

    .line 37
    .line 38
    .line 39
    return-object v4

    .line 40
    :cond_0
    invoke-direct {p0}, Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;->getCurrentSnapshot()Landroidx/compose/runtime/snapshots/MutableSnapshot;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1, v6, v7}, Landroidx/compose/runtime/snapshots/MutableSnapshot;->takeNestedMutableSnapshot(Lhd/l;Lhd/l;)Landroidx/compose/runtime/snapshots/MutableSnapshot;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
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
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;->getReadObserver$runtime_release()Lhd/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x4

    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-static {p1, v0, v1, v2, v3}, Landroidx/compose/runtime/snapshots/SnapshotKt;->mergedReadObserver$default(Lhd/l;Lhd/l;ZILjava/lang/Object;)Lhd/l;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-boolean v0, p0, Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;->mergeParentObservers:Z

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-direct {p0}, Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;->getCurrentSnapshot()Landroidx/compose/runtime/snapshots/MutableSnapshot;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0, v3}, Landroidx/compose/runtime/snapshots/MutableSnapshot;->takeNestedSnapshot(Lhd/l;)Landroidx/compose/runtime/snapshots/Snapshot;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-static {v0, p1, v1}, Landroidx/compose/runtime/snapshots/SnapshotKt;->access$createTransparentSnapshotWithNoParentReadObserver(Landroidx/compose/runtime/snapshots/Snapshot;Lhd/l;Z)Landroidx/compose/runtime/snapshots/Snapshot;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    :cond_0
    invoke-direct {p0}, Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;->getCurrentSnapshot()Landroidx/compose/runtime/snapshots/MutableSnapshot;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0, p1}, Landroidx/compose/runtime/snapshots/MutableSnapshot;->takeNestedSnapshot(Lhd/l;)Landroidx/compose/runtime/snapshots/Snapshot;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
.end method
