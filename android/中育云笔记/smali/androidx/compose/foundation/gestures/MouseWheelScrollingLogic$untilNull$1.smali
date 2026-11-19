.class final Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$untilNull$1;
.super Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic;->untilNull(Lhd/a;)Lpd/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$untilNull$1"
    f = "MouseWheelScrollable.kt"
    l = {
        0xb3
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $builderAction:Lhd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/a;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lhd/a;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/a;",
            "Lvc/c<",
            "-",
            "Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$untilNull$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$untilNull$1;->$builderAction:Lhd/a;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2
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
    new-instance v0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$untilNull$1;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$untilNull$1;->$builderAction:Lhd/a;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$untilNull$1;-><init>(Lhd/a;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$untilNull$1;->L$0:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lpd/i;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$untilNull$1;->invoke(Lpd/i;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lpd/i;Lvc/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpd/i;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$untilNull$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$untilNull$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$untilNull$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$untilNull$1;->label:I

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
    iget-object v1, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$untilNull$1;->L$1:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v3, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$untilNull$1;->L$0:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v3, Lpd/i;

    .line 17
    .line 18
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1

    .line 30
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$untilNull$1;->L$0:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Lpd/i;

    .line 36
    .line 37
    move-object v3, p1

    .line 38
    :cond_2
    iget-object p1, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$untilNull$1;->$builderAction:Lhd/a;

    .line 39
    .line 40
    invoke-interface {p1}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    if-eqz v1, :cond_3

    .line 45
    .line 46
    iput-object v3, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$untilNull$1;->L$0:Ljava/lang/Object;

    .line 47
    .line 48
    iput-object v1, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$untilNull$1;->L$1:Ljava/lang/Object;

    .line 49
    .line 50
    iput v2, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$untilNull$1;->label:I

    .line 51
    .line 52
    invoke-virtual {v3, v1, p0}, Lpd/i;->a(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-ne p1, v0, :cond_4

    .line 57
    .line 58
    return-object v0

    .line 59
    :cond_3
    const/4 v1, 0x0

    .line 60
    :cond_4
    :goto_0
    if-nez v1, :cond_2

    .line 61
    .line 62
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 63
    .line 64
    return-object p1
.end method
