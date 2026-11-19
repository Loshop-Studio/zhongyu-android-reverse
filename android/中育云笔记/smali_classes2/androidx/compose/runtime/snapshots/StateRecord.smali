.class public abstract Landroidx/compose/runtime/snapshots/StateRecord;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private next:Landroidx/compose/runtime/snapshots/StateRecord;

.field private snapshotId:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 3
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->currentSnapshot()Landroidx/compose/runtime/snapshots/Snapshot;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/Snapshot;->getSnapshotId()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Landroidx/compose/runtime/snapshots/StateRecord;-><init>(J)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2
    .annotation runtime Lqc/a;
    .end annotation

    .line 4
    invoke-static {p1}, Landroidx/compose/runtime/snapshots/SnapshotId_jvmKt;->toSnapshotId(I)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Landroidx/compose/runtime/snapshots/StateRecord;-><init>(J)V

    return-void
.end method

.method public constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Landroidx/compose/runtime/snapshots/StateRecord;->snapshotId:J

    return-void
.end method


# virtual methods
.method public abstract assign(Landroidx/compose/runtime/snapshots/StateRecord;)V
.end method

.method public abstract create()Landroidx/compose/runtime/snapshots/StateRecord;
.end method

.method public synthetic create(I)Landroidx/compose/runtime/snapshots/StateRecord;
    .locals 3
    .annotation runtime Lqc/a;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/StateRecord;->create()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    invoke-static {p1}, Landroidx/compose/runtime/snapshots/SnapshotId_jvmKt;->toSnapshotId(I)J

    move-result-wide v1

    iput-wide v1, v0, Landroidx/compose/runtime/snapshots/StateRecord;->snapshotId:J

    return-object v0
.end method

.method public create(J)Landroidx/compose/runtime/snapshots/StateRecord;
    .locals 1

    .line 2
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/StateRecord;->create()Landroidx/compose/runtime/snapshots/StateRecord;

    move-result-object v0

    iput-wide p1, v0, Landroidx/compose/runtime/snapshots/StateRecord;->snapshotId:J

    return-object v0
.end method

.method public final getNext$runtime_release()Landroidx/compose/runtime/snapshots/StateRecord;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/StateRecord;->next:Landroidx/compose/runtime/snapshots/StateRecord;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSnapshotId$runtime_release()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/runtime/snapshots/StateRecord;->snapshotId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final setNext$runtime_release(Landroidx/compose/runtime/snapshots/StateRecord;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/runtime/snapshots/StateRecord;->next:Landroidx/compose/runtime/snapshots/StateRecord;

    .line 2
    .line 3
    return-void
.end method

.method public final setSnapshotId$runtime_release(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/compose/runtime/snapshots/StateRecord;->snapshotId:J

    .line 2
    .line 3
    return-void
.end method
