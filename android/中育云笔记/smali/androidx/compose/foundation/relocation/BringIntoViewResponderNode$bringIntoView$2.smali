.class final Landroidx/compose/foundation/relocation/BringIntoViewResponderNode$bringIntoView$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;->bringIntoView(Landroidx/compose/ui/layout/LayoutCoordinates;Lhd/a;Lvc/c;)Ljava/lang/Object;
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
    c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2"
    f = "BringIntoViewResponder.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $boundsProvider:Lhd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/a;"
        }
    .end annotation
.end field

.field final synthetic $childCoordinates:Landroidx/compose/ui/layout/LayoutCoordinates;

.field final synthetic $parentRect:Lhd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/a;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lhd/a;Lhd/a;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;",
            "Landroidx/compose/ui/layout/LayoutCoordinates;",
            "Lhd/a;",
            "Lhd/a;",
            "Lvc/c<",
            "-",
            "Landroidx/compose/foundation/relocation/BringIntoViewResponderNode$bringIntoView$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/relocation/BringIntoViewResponderNode$bringIntoView$2;->this$0:Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/relocation/BringIntoViewResponderNode$bringIntoView$2;->$childCoordinates:Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/relocation/BringIntoViewResponderNode$bringIntoView$2;->$boundsProvider:Lhd/a;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/compose/foundation/relocation/BringIntoViewResponderNode$bringIntoView$2;->$parentRect:Lhd/a;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 6
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
    new-instance v0, Landroidx/compose/foundation/relocation/BringIntoViewResponderNode$bringIntoView$2;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/relocation/BringIntoViewResponderNode$bringIntoView$2;->this$0:Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/compose/foundation/relocation/BringIntoViewResponderNode$bringIntoView$2;->$childCoordinates:Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 6
    .line 7
    iget-object v3, p0, Landroidx/compose/foundation/relocation/BringIntoViewResponderNode$bringIntoView$2;->$boundsProvider:Lhd/a;

    .line 8
    .line 9
    iget-object v4, p0, Landroidx/compose/foundation/relocation/BringIntoViewResponderNode$bringIntoView$2;->$parentRect:Lhd/a;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/relocation/BringIntoViewResponderNode$bringIntoView$2;-><init>(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lhd/a;Lhd/a;Lvc/c;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Landroidx/compose/foundation/relocation/BringIntoViewResponderNode$bringIntoView$2;->L$0:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/relocation/BringIntoViewResponderNode$bringIntoView$2;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/i0;",
            "Lvc/c<",
            "-",
            "Lkotlinx/coroutines/g;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/relocation/BringIntoViewResponderNode$bringIntoView$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/relocation/BringIntoViewResponderNode$bringIntoView$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/relocation/BringIntoViewResponderNode$bringIntoView$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Landroidx/compose/foundation/relocation/BringIntoViewResponderNode$bringIntoView$2;->label:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/compose/foundation/relocation/BringIntoViewResponderNode$bringIntoView$2;->L$0:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v0, p1

    .line 14
    check-cast v0, Lsd/i0;

    .line 15
    .line 16
    new-instance v3, Landroidx/compose/foundation/relocation/BringIntoViewResponderNode$bringIntoView$2$1;

    .line 17
    .line 18
    iget-object p1, p0, Landroidx/compose/foundation/relocation/BringIntoViewResponderNode$bringIntoView$2;->this$0:Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;

    .line 19
    .line 20
    iget-object v1, p0, Landroidx/compose/foundation/relocation/BringIntoViewResponderNode$bringIntoView$2;->$childCoordinates:Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 21
    .line 22
    iget-object v2, p0, Landroidx/compose/foundation/relocation/BringIntoViewResponderNode$bringIntoView$2;->$boundsProvider:Lhd/a;

    .line 23
    .line 24
    const/4 v6, 0x0

    .line 25
    invoke-direct {v3, p1, v1, v2, v6}, Landroidx/compose/foundation/relocation/BringIntoViewResponderNode$bringIntoView$2$1;-><init>(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lhd/a;Lvc/c;)V

    .line 26
    .line 27
    .line 28
    const/4 v4, 0x3

    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v1, 0x0

    .line 31
    const/4 v2, 0x0

    .line 32
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 33
    .line 34
    .line 35
    new-instance v3, Landroidx/compose/foundation/relocation/BringIntoViewResponderNode$bringIntoView$2$2;

    .line 36
    .line 37
    iget-object p1, p0, Landroidx/compose/foundation/relocation/BringIntoViewResponderNode$bringIntoView$2;->this$0:Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;

    .line 38
    .line 39
    iget-object v1, p0, Landroidx/compose/foundation/relocation/BringIntoViewResponderNode$bringIntoView$2;->$parentRect:Lhd/a;

    .line 40
    .line 41
    invoke-direct {v3, p1, v1, v6}, Landroidx/compose/foundation/relocation/BringIntoViewResponderNode$bringIntoView$2$2;-><init>(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Lhd/a;Lvc/c;)V

    .line 42
    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    return-object p1

    .line 50
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p1
.end method
