.class final Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$2$1;
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

.field final synthetic $predictiveBackProgress:Landroidx/compose/animation/core/Animatable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/Animatable<",
            "Ljava/lang/Float;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $scope:Lsd/i0;

.field final synthetic $sheetState:Landroidx/compose/material3/SheetState;


# direct methods
.method public constructor <init>(Landroidx/compose/material3/SheetState;Lsd/i0;Landroidx/compose/animation/core/Animatable;Lhd/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/SheetState;",
            "Lsd/i0;",
            "Landroidx/compose/animation/core/Animatable<",
            "Ljava/lang/Float;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;",
            "Lhd/a;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$2$1;->$sheetState:Landroidx/compose/material3/SheetState;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$2$1;->$scope:Lsd/i0;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$2$1;->$predictiveBackProgress:Landroidx/compose/animation/core/Animatable;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$2$1;->$onDismissRequest:Lhd/a;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$2$1;->invoke()V

    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0
.end method

.method public final invoke()V
    .locals 15

    .line 2
    iget-object v0, p0, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$2$1;->$sheetState:Landroidx/compose/material3/SheetState;

    invoke-virtual {v0}, Landroidx/compose/material3/SheetState;->getCurrentValue()Landroidx/compose/material3/SheetValue;

    move-result-object v0

    sget-object v1, Landroidx/compose/material3/SheetValue;->Expanded:Landroidx/compose/material3/SheetValue;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$2$1;->$sheetState:Landroidx/compose/material3/SheetState;

    invoke-virtual {v0}, Landroidx/compose/material3/SheetState;->getHasPartiallyExpandedState()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v3, p0, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$2$1;->$scope:Lsd/i0;

    new-instance v6, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$2$1$1;

    iget-object v0, p0, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$2$1;->$predictiveBackProgress:Landroidx/compose/animation/core/Animatable;

    invoke-direct {v6, v0, v2}, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$2$1$1;-><init>(Landroidx/compose/animation/core/Animatable;Lvc/c;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 4
    iget-object v9, p0, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$2$1;->$scope:Lsd/i0;

    new-instance v12, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$2$1$2;

    iget-object v0, p0, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$2$1;->$sheetState:Landroidx/compose/material3/SheetState;

    invoke-direct {v12, v0, v2}, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$2$1$2;-><init>(Landroidx/compose/material3/SheetState;Lvc/c;)V

    const/4 v13, 0x3

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v9 .. v14}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    return-void

    .line 5
    :cond_0
    iget-object v0, p0, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$2$1;->$scope:Lsd/i0;

    new-instance v3, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$2$1$3;

    iget-object v1, p0, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$2$1;->$sheetState:Landroidx/compose/material3/SheetState;

    invoke-direct {v3, v1, v2}, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$2$1$3;-><init>(Landroidx/compose/material3/SheetState;Lvc/c;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    move-result-object v0

    new-instance v1, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$2$1$4;

    iget-object v2, p0, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$2$1;->$onDismissRequest:Lhd/a;

    invoke-direct {v1, v2}, Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$2$1$4;-><init>(Lhd/a;)V

    invoke-interface {v0, v1}, Lkotlinx/coroutines/g;->A(Lhd/l;)Lsd/t0;

    return-void
.end method
