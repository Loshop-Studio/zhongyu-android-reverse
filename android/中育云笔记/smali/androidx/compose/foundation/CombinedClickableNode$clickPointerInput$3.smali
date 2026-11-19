.class final Landroidx/compose/foundation/CombinedClickableNode$clickPointerInput$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/CombinedClickableNode;->clickPointerInput(Landroidx/compose/ui/input/pointer/PointerInputScope;Lvc/c;)Ljava/lang/Object;
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
.field final synthetic this$0:Landroidx/compose/foundation/CombinedClickableNode;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/CombinedClickableNode;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/CombinedClickableNode$clickPointerInput$3;->this$0:Landroidx/compose/foundation/CombinedClickableNode;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Landroidx/compose/ui/geometry/Offset;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-virtual {p0, v0, v1}, Landroidx/compose/foundation/CombinedClickableNode$clickPointerInput$3;->invoke-k-4lQ0M(J)V

    .line 8
    .line 9
    .line 10
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke-k-4lQ0M(J)V
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/compose/foundation/CombinedClickableNode$clickPointerInput$3;->this$0:Landroidx/compose/foundation/CombinedClickableNode;

    .line 2
    .line 3
    invoke-static {p1}, Landroidx/compose/foundation/CombinedClickableNode;->access$getOnLongClick$p(Landroidx/compose/foundation/CombinedClickableNode;)Lhd/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-interface {p1}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object p1, p0, Landroidx/compose/foundation/CombinedClickableNode$clickPointerInput$3;->this$0:Landroidx/compose/foundation/CombinedClickableNode;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroidx/compose/foundation/CombinedClickableNode;->getHapticFeedbackEnabled()Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    iget-object p1, p0, Landroidx/compose/foundation/CombinedClickableNode$clickPointerInput$3;->this$0:Landroidx/compose/foundation/CombinedClickableNode;

    .line 21
    .line 22
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalHapticFeedback()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-static {p1, p2}, Landroidx/compose/ui/node/CompositionLocalConsumerModifierNodeKt;->currentValueOf(Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Landroidx/compose/ui/hapticfeedback/HapticFeedback;

    .line 31
    .line 32
    sget-object p2, Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;->Companion:Landroidx/compose/ui/hapticfeedback/HapticFeedbackType$Companion;

    .line 33
    .line 34
    invoke-virtual {p2}, Landroidx/compose/ui/hapticfeedback/HapticFeedbackType$Companion;->getLongPress-5zf0vsI()I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    invoke-interface {p1, p2}, Landroidx/compose/ui/hapticfeedback/HapticFeedback;->performHapticFeedback-CdsT49E(I)V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void
.end method
