.class final Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/ModalBottomSheetKt;->ModalBottomSheet-dYc4hso(Lhd/a;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFJLhd/p;Lhd/p;Landroidx/compose/material3/ModalBottomSheetProperties;Lhd/q;Landroidx/compose/runtime/Composer;III)V
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
.field final synthetic $onDismissRequest:Lhd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/a;"
        }
    .end annotation
.end field

.field final synthetic $scope:Lsd/i0;

.field final synthetic $sheetState:Landroidx/compose/material3/SheetState;


# direct methods
.method public constructor <init>(Landroidx/compose/material3/SheetState;Lsd/i0;Lhd/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/SheetState;",
            "Lsd/i0;",
            "Lhd/a;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1;->$sheetState:Landroidx/compose/material3/SheetState;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1;->$scope:Lsd/i0;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1;->$onDismissRequest:Lhd/a;

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
    invoke-virtual {p0}, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1;->invoke()V

    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0
.end method

.method public final invoke()V
    .locals 7

    .line 2
    iget-object v0, p0, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1;->$sheetState:Landroidx/compose/material3/SheetState;

    invoke-virtual {v0}, Landroidx/compose/material3/SheetState;->getAnchoredDraggableState$material3_release()Landroidx/compose/material3/internal/AnchoredDraggableState;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/material3/internal/AnchoredDraggableState;->getConfirmValueChange$material3_release()Lhd/l;

    move-result-object v0

    sget-object v1, Landroidx/compose/material3/SheetValue;->Hidden:Landroidx/compose/material3/SheetValue;

    invoke-interface {v0, v1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1;->$scope:Lsd/i0;

    .line 4
    new-instance v4, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$1;

    iget-object v0, p0, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1;->$sheetState:Landroidx/compose/material3/SheetState;

    const/4 v2, 0x0

    invoke-direct {v4, v0, v2}, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$1;-><init>(Landroidx/compose/material3/SheetState;Lvc/c;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    move-result-object v0

    .line 5
    new-instance v1, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$2;

    iget-object v2, p0, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1;->$sheetState:Landroidx/compose/material3/SheetState;

    iget-object v3, p0, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1;->$onDismissRequest:Lhd/a;

    invoke-direct {v1, v2, v3}, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$2;-><init>(Landroidx/compose/material3/SheetState;Lhd/a;)V

    invoke-interface {v0, v1}, Lkotlinx/coroutines/g;->A(Lhd/l;)Lsd/t0;

    :cond_0
    return-void
.end method
