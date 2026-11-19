.class final Landroidx/compose/foundation/gestures/AnchoredDraggableState$Companion$Saver$5;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/AnchoredDraggableState$Companion;->Saver(Lhd/l;)Landroidx/compose/runtime/saveable/Saver;
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


# instance fields
.field final synthetic $confirmValueChange:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhd/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableState$Companion$Saver$5;->$confirmValueChange:Lhd/l;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Landroidx/compose/foundation/gestures/AnchoredDraggableState;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Landroidx/compose/foundation/gestures/AnchoredDraggableState<",
            "TT;>;"
        }
    .end annotation

    .line 2
    new-instance v0, Landroidx/compose/foundation/gestures/AnchoredDraggableState;

    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableState$Companion$Saver$5;->$confirmValueChange:Lhd/l;

    .line 4
    invoke-direct {v0, p1, v1}, Landroidx/compose/foundation/gestures/AnchoredDraggableState;-><init>(Ljava/lang/Object;Lhd/l;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/AnchoredDraggableState$Companion$Saver$5;->invoke(Ljava/lang/Object;)Landroidx/compose/foundation/gestures/AnchoredDraggableState;

    move-result-object p1

    return-object p1
.end method
