.class final Landroidx/compose/foundation/gestures/AnchoredDraggableState$anchoredDrag$2$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/AnchoredDraggableState$anchoredDrag$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$2"
    f = "AnchoredDraggable.kt"
    l = {
        0x466
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $block:Lhd/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/q;"
        }
    .end annotation
.end field

.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Landroidx/compose/foundation/gestures/AnchoredDraggableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/foundation/gestures/AnchoredDraggableState<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhd/q;Landroidx/compose/foundation/gestures/AnchoredDraggableState;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/q;",
            "Landroidx/compose/foundation/gestures/AnchoredDraggableState<",
            "TT;>;",
            "Lvc/c<",
            "-",
            "Landroidx/compose/foundation/gestures/AnchoredDraggableState$anchoredDrag$2$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableState$anchoredDrag$2$2;->$block:Lhd/q;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableState$anchoredDrag$2$2;->this$0:Landroidx/compose/foundation/gestures/AnchoredDraggableState;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lvc/c<",
            "*>;)",
            "Lvc/c<",
            "Lqc/q;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/foundation/gestures/AnchoredDraggableState$anchoredDrag$2$2;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableState$anchoredDrag$2$2;->$block:Lhd/q;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableState$anchoredDrag$2$2;->this$0:Landroidx/compose/foundation/gestures/AnchoredDraggableState;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Landroidx/compose/foundation/gestures/AnchoredDraggableState$anchoredDrag$2$2;-><init>(Lhd/q;Landroidx/compose/foundation/gestures/AnchoredDraggableState;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Landroidx/compose/foundation/gestures/AnchoredDraggableState$anchoredDrag$2$2;->L$0:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Landroidx/compose/foundation/gestures/DraggableAnchors;Lvc/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/DraggableAnchors<",
            "TT;>;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/AnchoredDraggableState$anchoredDrag$2$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/gestures/AnchoredDraggableState$anchoredDrag$2$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/AnchoredDraggableState$anchoredDrag$2$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Landroidx/compose/foundation/gestures/DraggableAnchors;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/AnchoredDraggableState$anchoredDrag$2$2;->invoke(Landroidx/compose/foundation/gestures/DraggableAnchors;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableState$anchoredDrag$2$2;->label:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableState$anchoredDrag$2$2;->L$0:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Landroidx/compose/foundation/gestures/DraggableAnchors;

    .line 30
    .line 31
    iget-object v1, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableState$anchoredDrag$2$2;->$block:Lhd/q;

    .line 32
    .line 33
    iget-object v3, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableState$anchoredDrag$2$2;->this$0:Landroidx/compose/foundation/gestures/AnchoredDraggableState;

    .line 34
    .line 35
    invoke-static {v3}, Landroidx/compose/foundation/gestures/AnchoredDraggableState;->access$getAnchoredDragScope$p(Landroidx/compose/foundation/gestures/AnchoredDraggableState;)Landroidx/compose/foundation/gestures/AnchoredDraggableState$anchoredDragScope$1;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    iput v2, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableState$anchoredDrag$2$2;->label:I

    .line 40
    .line 41
    invoke-interface {v1, v3, p1, p0}, Lhd/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-ne p1, v0, :cond_2

    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_2
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 49
    .line 50
    return-object p1
.end method
