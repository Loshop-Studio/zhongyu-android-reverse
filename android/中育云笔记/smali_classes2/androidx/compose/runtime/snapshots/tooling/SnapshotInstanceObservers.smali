.class public final Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/ExperimentalComposeRuntimeApi;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final readObserver:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field private final writeObserver:Lhd/l;
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

.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;-><init>(Lhd/l;Lhd/l;ILkotlin/jvm/internal/n;)V

    return-void
.end method

.method public constructor <init>(Lhd/l;Lhd/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;->readObserver:Lhd/l;

    .line 4
    iput-object p2, p0, Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;->writeObserver:Lhd/l;

    return-void
.end method

.method public synthetic constructor <init>(Lhd/l;Lhd/l;ILkotlin/jvm/internal/n;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    .line 5
    :cond_1
    invoke-direct {p0, p1, p2}, Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;-><init>(Lhd/l;Lhd/l;)V

    return-void
.end method


# virtual methods
.method public final getReadObserver()Lhd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;->readObserver:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getWriteObserver()Lhd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;->writeObserver:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method
