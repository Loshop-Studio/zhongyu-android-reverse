.class public final Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt$contextMenuBuilder$1;->invoke(Landroidx/compose/foundation/contextmenu/ContextMenuScope;)V
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
.field final synthetic $onMenuItemClicked$inlined:Lhd/p;

.field final synthetic $state:Landroidx/compose/foundation/contextmenu/ContextMenuState;

.field final synthetic $this_contextMenuBuilder$inlined:Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/contextmenu/ContextMenuState;Lhd/p;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$1;->$state:Landroidx/compose/foundation/contextmenu/ContextMenuState;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$1;->$onMenuItemClicked$inlined:Lhd/p;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$1;->$this_contextMenuBuilder$inlined:Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;

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
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$1;->invoke()V

    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 2
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$1;->$onMenuItemClicked$inlined:Lhd/p;

    iget-object v1, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$1;->$this_contextMenuBuilder$inlined:Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;

    sget-object v2, Landroidx/compose/foundation/text/TextContextMenuItems;->Cut:Landroidx/compose/foundation/text/TextContextMenuItems;

    invoke-interface {v0, v1, v2}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$1;->$state:Landroidx/compose/foundation/contextmenu/ContextMenuState;

    invoke-static {v0}, Landroidx/compose/foundation/contextmenu/ContextMenuState_androidKt;->close(Landroidx/compose/foundation/contextmenu/ContextMenuState;)V

    return-void
.end method
