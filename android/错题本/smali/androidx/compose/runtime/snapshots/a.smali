.class public final synthetic Landroidx/compose/runtime/snapshots/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/runtime/snapshots/ObserverHandle;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/compose/runtime/snapshots/a;->a:I

    iput-object p1, p0, Landroidx/compose/runtime/snapshots/a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/runtime/snapshots/a;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/compose/runtime/snapshots/a;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/runtime/snapshots/tooling/SnapshotObserver;

    invoke-static {v0}, Landroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt;->a(Landroidx/compose/runtime/snapshots/tooling/SnapshotObserver;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/a;->b:Ljava/lang/Object;

    check-cast v0, Lr6/c;

    invoke-static {v0}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->b(Lr6/c;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/a;->b:Ljava/lang/Object;

    check-cast v0, Lr6/e;

    invoke-static {v0}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->a(Lr6/e;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
