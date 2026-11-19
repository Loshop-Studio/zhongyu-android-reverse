.class public final synthetic Landroidx/compose/runtime/snapshots/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/runtime/snapshots/ObserverHandle;


# instance fields
.field public final synthetic a:Lhd/l;


# direct methods
.method public synthetic constructor <init>(Lhd/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/runtime/snapshots/b;->a:Lhd/l;

    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/b;->a:Lhd/l;

    invoke-static {v0}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->b(Lhd/l;)V

    return-void
.end method
