.class final Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$userScroll$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic;->userScroll(Landroidx/compose/foundation/gestures/ScrollingLogic;Lhd/p;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic"
    f = "MouseWheelScrollable.kt"
    l = {
        0x7a
    }
    m = "userScroll"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic;",
            "Lvc/c<",
            "-",
            "Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$userScroll$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$userScroll$1;->this$0:Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lvc/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$userScroll$1;->result:Ljava/lang/Object;

    iget p1, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$userScroll$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$userScroll$1;->label:I

    iget-object p1, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$userScroll$1;->this$0:Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic;->access$userScroll(Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic;Landroidx/compose/foundation/gestures/ScrollingLogic;Lhd/p;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
