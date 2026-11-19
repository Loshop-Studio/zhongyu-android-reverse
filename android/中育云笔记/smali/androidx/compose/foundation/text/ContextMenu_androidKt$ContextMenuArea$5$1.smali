.class final Landroidx/compose/foundation/text/ContextMenu_androidKt$ContextMenuArea$5$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


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
        "Lhd/a;"
    }
.end annotation


# instance fields
.field final synthetic $coroutineScope:Lsd/i0;

.field final synthetic $menuItemsAvailability:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/foundation/text/MenuItemsAvailability;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $selectionState:Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;


# direct methods
.method public constructor <init>(Lsd/i0;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/i0;",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/foundation/text/MenuItemsAvailability;",
            ">;",
            "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/text/ContextMenu_androidKt$ContextMenuArea$5$1;->$coroutineScope:Lsd/i0;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/text/ContextMenu_androidKt$ContextMenuArea$5$1;->$menuItemsAvailability:Landroidx/compose/runtime/MutableState;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/text/ContextMenu_androidKt$ContextMenuArea$5$1;->$selectionState:Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/text/ContextMenu_androidKt$ContextMenuArea$5$1;->invoke()V

    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0
.end method

.method public final invoke()V
    .locals 6

    .line 2
    iget-object v0, p0, Landroidx/compose/foundation/text/ContextMenu_androidKt$ContextMenuArea$5$1;->$coroutineScope:Lsd/i0;

    sget-object v2, Lkotlinx/coroutines/CoroutineStart;->f:Lkotlinx/coroutines/CoroutineStart;

    new-instance v3, Landroidx/compose/foundation/text/ContextMenu_androidKt$ContextMenuArea$5$1$1;

    iget-object v1, p0, Landroidx/compose/foundation/text/ContextMenu_androidKt$ContextMenuArea$5$1;->$menuItemsAvailability:Landroidx/compose/runtime/MutableState;

    iget-object v4, p0, Landroidx/compose/foundation/text/ContextMenu_androidKt$ContextMenuArea$5$1;->$selectionState:Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;

    const/4 v5, 0x0

    invoke-direct {v3, v1, v4, v5}, Landroidx/compose/foundation/text/ContextMenu_androidKt$ContextMenuArea$5$1$1;-><init>(Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Lvc/c;)V

    const/4 v4, 0x1

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    return-void
.end method
