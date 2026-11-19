.class final Landroidx/compose/runtime/snapshots/GlobalSnapshot$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/runtime/snapshots/GlobalSnapshot;-><init>(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/l;"
    }
.end annotation


# static fields
.field public static final INSTANCE:Landroidx/compose/runtime/snapshots/GlobalSnapshot$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/runtime/snapshots/GlobalSnapshot$1;

    invoke-direct {v0}, Landroidx/compose/runtime/snapshots/GlobalSnapshot$1;-><init>()V

    sput-object v0, Landroidx/compose/runtime/snapshots/GlobalSnapshot$1;->INSTANCE:Landroidx/compose/runtime/snapshots/GlobalSnapshot$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/GlobalSnapshot$1;->invoke(Ljava/lang/Object;)V

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;)V
    .locals 5

    .line 2
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->getLock()Ljava/lang/Object;

    move-result-object v0

    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->access$getGlobalWriteObservers$p()Ljava/util/List;

    move-result-object v1

    .line 5
    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    .line 6
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    .line 7
    check-cast v4, Lhd/l;

    .line 8
    invoke-interface {v4, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method
