.class final Landroidx/compose/foundation/text/ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/ContextMenu_androidKt;->ContextMenuArea(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;ZLhd/p;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/p;"
    }
.end annotation


# instance fields
.field final synthetic $coroutineScope:Lsd/i0;


# direct methods
.method public constructor <init>(Lsd/i0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/text/ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1;->$coroutineScope:Lsd/i0;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;

    check-cast p2, Landroidx/compose/foundation/text/TextContextMenuItems;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/text/ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1;->invoke(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/TextContextMenuItems;)V

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/TextContextMenuItems;)V
    .locals 6

    .line 2
    iget-object v0, p0, Landroidx/compose/foundation/text/ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1;->$coroutineScope:Lsd/i0;

    sget-object v2, Lkotlinx/coroutines/CoroutineStart;->f:Lkotlinx/coroutines/CoroutineStart;

    new-instance v3, Landroidx/compose/foundation/text/ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1$1;

    const/4 v1, 0x0

    invoke-direct {v3, p2, p1, v1}, Landroidx/compose/foundation/text/ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1$1;-><init>(Landroidx/compose/foundation/text/TextContextMenuItems;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Lvc/c;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    return-void
.end method
