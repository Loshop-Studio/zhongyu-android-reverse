.class final Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/board/BoardViewModel;->updatePenType(Lcom/zykj/view/board/board/PenType;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lr6/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/v;",
        "Ld6/s;",
        "<anonymous>",
        "(Lkotlinx/coroutines/v;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.view.board.board.BoardViewModel$updatePenType$1"
    f = "BoardViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBoardViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel$updatePenType$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1494:1\n226#2,5:1495\n*S KotlinDebug\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel$updatePenType$1\n*L\n944#1:1495,5\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $penType:Lcom/zykj/view/board/board/PenType;

.field label:I

.field final synthetic this$0:Lcom/zykj/view/board/board/BoardViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/board/BoardViewModel;Lcom/zykj/view/board/board/PenType;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/view/board/board/BoardViewModel;",
            "Lcom/zykj/view/board/board/PenType;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;->this$0:Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;->$penType:Lcom/zykj/view/board/board/PenType;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lh6/c<",
            "*>;)",
            "Lh6/c<",
            "Ld6/s;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;->this$0:Lcom/zykj/view/board/board/BoardViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;->$penType:Lcom/zykj/view/board/board/PenType;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;Lcom/zykj/view/board/board/PenType;Lh6/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/v;",
            "Lh6/c<",
            "-",
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v0, p0, Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;->label:I

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;->this$0:Lcom/zykj/view/board/board/BoardViewModel;

    .line 11
    .line 12
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardViewModel;->access$get_penToolState$p(Lcom/zykj/view/board/board/BoardViewModel;)Lkotlinx/coroutines/flow/y;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object v3, p0, Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;->$penType:Lcom/zykj/view/board/board/PenType;

    .line 17
    .line 18
    :cond_0
    move-object v10, p1

    .line 19
    check-cast v10, Lkotlinx/coroutines/flow/n0;

    .line 20
    .line 21
    invoke-virtual {v10}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v11

    .line 25
    move-object v0, v11

    .line 26
    check-cast v0, Lcom/zykj/view/board/board/PenToolState;

    .line 27
    .line 28
    const/16 v8, 0x7b

    .line 29
    .line 30
    const/4 v9, 0x0

    .line 31
    const/4 v1, 0x0

    .line 32
    const/4 v2, 0x0

    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x0

    .line 35
    const/4 v6, 0x0

    .line 36
    const/4 v7, 0x0

    .line 37
    invoke-static/range {v0 .. v9}, Lcom/zykj/view/board/board/PenToolState;->copy$default(Lcom/zykj/view/board/board/PenToolState;ZZLcom/zykj/view/board/board/PenType;ILcom/zykj/view/board/board/PenColor;IZILjava/lang/Object;)Lcom/zykj/view/board/board/PenToolState;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v10, v11, v0}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;->this$0:Lcom/zykj/view/board/board/BoardViewModel;

    .line 48
    .line 49
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardViewModel;->access$updateConfigAboutPen(Lcom/zykj/view/board/board/BoardViewModel;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;->$penType:Lcom/zykj/view/board/board/PenType;

    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/zykj/view/board/board/PenType;->getOrdinal()I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    new-instance v0, Ljava/lang/Integer;

    .line 59
    .line 60
    invoke-direct {v0, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 61
    .line 62
    .line 63
    invoke-static {v0}, Lcom/zykj/view/utils/SPDataKt;->setSpPenTypeLevel(Ljava/lang/Integer;)V

    .line 64
    .line 65
    .line 66
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 67
    .line 68
    return-object p1

    .line 69
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 70
    .line 71
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 72
    .line 73
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw p1
.end method
