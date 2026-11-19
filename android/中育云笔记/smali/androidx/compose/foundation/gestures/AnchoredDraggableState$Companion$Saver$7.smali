.class final Landroidx/compose/foundation/gestures/AnchoredDraggableState$Companion$Saver$7;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/AnchoredDraggableState$Companion;->Saver(Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Lhd/l;Lhd/a;Lhd/l;)Landroidx/compose/runtime/saveable/Saver;
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


# static fields
.field public static final INSTANCE:Landroidx/compose/foundation/gestures/AnchoredDraggableState$Companion$Saver$7;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/gestures/AnchoredDraggableState$Companion$Saver$7;

    invoke-direct {v0}, Landroidx/compose/foundation/gestures/AnchoredDraggableState$Companion$Saver$7;-><init>()V

    sput-object v0, Landroidx/compose/foundation/gestures/AnchoredDraggableState$Companion$Saver$7;->INSTANCE:Landroidx/compose/foundation/gestures/AnchoredDraggableState$Companion$Saver$7;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/compose/runtime/saveable/SaverScope;Landroidx/compose/foundation/gestures/AnchoredDraggableState;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/saveable/SaverScope;",
            "Landroidx/compose/foundation/gestures/AnchoredDraggableState<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 2
    invoke-virtual {p2}, Landroidx/compose/foundation/gestures/AnchoredDraggableState;->getCurrentValue()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/runtime/saveable/SaverScope;

    check-cast p2, Landroidx/compose/foundation/gestures/AnchoredDraggableState;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/AnchoredDraggableState$Companion$Saver$7;->invoke(Landroidx/compose/runtime/saveable/SaverScope;Landroidx/compose/foundation/gestures/AnchoredDraggableState;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
