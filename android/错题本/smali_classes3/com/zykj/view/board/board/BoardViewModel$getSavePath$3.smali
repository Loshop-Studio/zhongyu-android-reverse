.class final Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/board/BoardViewModel;->getSavePath(ZZLr6/e;Lr6/e;)V
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
    c = "com.zykj.view.board.board.BoardViewModel$getSavePath$3"
    f = "BoardViewModel.kt"
    i = {}
    l = {
        0x5a2
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $callback:Lr6/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/e;"
        }
    .end annotation
.end field

.field final synthetic $error:Lr6/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/e;"
        }
    .end annotation
.end field

.field final synthetic $isContentThumbnail:Z

.field final synthetic $needClear:Z

.field label:I

.field final synthetic this$0:Lcom/zykj/view/board/board/BoardViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/board/BoardViewModel;ZZLr6/e;Lr6/e;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/view/board/board/BoardViewModel;",
            "ZZ",
            "Lr6/e;",
            "Lr6/e;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->this$0:Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->$needClear:Z

    .line 4
    .line 5
    iput-boolean p3, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->$isContentThumbnail:Z

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->$callback:Lr6/e;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->$error:Lr6/e;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static synthetic e(Lcom/zykj/view/board/board/BoardViewModel;Lr6/e;Ljava/lang/Throwable;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->invokeSuspend$lambda$1(Lcom/zykj/view/board/board/BoardViewModel;Lr6/e;Ljava/lang/Throwable;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/zykj/view/board/board/BoardViewModel;Lr6/e;Ljava/lang/String;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->invokeSuspend$lambda$0(Lcom/zykj/view/board/board/BoardViewModel;Lr6/e;Ljava/lang/String;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method private static final invokeSuspend$lambda$0(Lcom/zykj/view/board/board/BoardViewModel;Lr6/e;Ljava/lang/String;)Ld6/s;
    .locals 3

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lkotlinx/coroutines/f0;->a:Lg7/e;

    .line 6
    .line 7
    sget-object v0, Le7/k;->a:Ld7/d;

    .line 8
    .line 9
    new-instance v1, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3$2$1;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v1, p1, p2, v2}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3$2$1;-><init>(Lr6/e;Ljava/lang/String;Lh6/c;)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-static {p0, v0, v2, v1, p1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 17
    .line 18
    .line 19
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 20
    .line 21
    return-object p0
.end method

.method private static final invokeSuspend$lambda$1(Lcom/zykj/view/board/board/BoardViewModel;Lr6/e;Ljava/lang/Throwable;)Ld6/s;
    .locals 3

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lkotlinx/coroutines/f0;->a:Lg7/e;

    .line 6
    .line 7
    sget-object v0, Le7/k;->a:Ld7/d;

    .line 8
    .line 9
    new-instance v1, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3$3$1;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v1, p1, p2, v2}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3$3$1;-><init>(Lr6/e;Ljava/lang/Throwable;Lh6/c;)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-static {p0, v0, v2, v1, p1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 17
    .line 18
    .line 19
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 20
    .line 21
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 7
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
    new-instance v0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->this$0:Lcom/zykj/view/board/board/BoardViewModel;

    .line 4
    .line 5
    iget-boolean v2, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->$needClear:Z

    .line 6
    .line 7
    iget-boolean v3, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->$isContentThumbnail:Z

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->$callback:Lr6/e;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->$error:Lr6/e;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;-><init>(Lcom/zykj/view/board/board/BoardViewModel;ZZLr6/e;Lr6/e;Lh6/c;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->label:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->this$0:Lcom/zykj/view/board/board/BoardViewModel;

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/zykj/view/board/board/BoardViewModel;->getLoadFinished()Lkotlinx/coroutines/flow/m0;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    new-instance v1, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3$1;

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-direct {v1, v3}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3$1;-><init>(Lh6/c;)V

    .line 35
    .line 36
    .line 37
    iput v2, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->label:I

    .line 38
    .line 39
    invoke-static {p1, v1, p0}, Lkotlinx/coroutines/flow/h;->j(Lkotlinx/coroutines/flow/f;Lr6/e;Lh6/c;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-ne p1, v0, :cond_2

    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->this$0:Lcom/zykj/view/board/board/BoardViewModel;

    .line 47
    .line 48
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardViewModel;->access$getBoardControl$p(Lcom/zykj/view/board/board/BoardViewModel;)Lcom/zykj/blackboard/core/edit/IBoardControl;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-eqz p1, :cond_3

    .line 53
    .line 54
    iget-boolean v0, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->$needClear:Z

    .line 55
    .line 56
    iget-boolean v1, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->$isContentThumbnail:Z

    .line 57
    .line 58
    iget-object v2, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->this$0:Lcom/zykj/view/board/board/BoardViewModel;

    .line 59
    .line 60
    iget-object v3, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->$callback:Lr6/e;

    .line 61
    .line 62
    new-instance v4, Lcom/zykj/view/board/board/o;

    .line 63
    .line 64
    const/4 v5, 0x0

    .line 65
    invoke-direct {v4, v2, v3, v5}, Lcom/zykj/view/board/board/o;-><init>(Ljava/lang/Object;Ld6/d;I)V

    .line 66
    .line 67
    .line 68
    iget-object v3, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->$error:Lr6/e;

    .line 69
    .line 70
    new-instance v5, Lcom/zykj/view/board/board/o;

    .line 71
    .line 72
    const/4 v6, 0x1

    .line 73
    invoke-direct {v5, v2, v3, v6}, Lcom/zykj/view/board/board/o;-><init>(Ljava/lang/Object;Ld6/d;I)V

    .line 74
    .line 75
    .line 76
    invoke-interface {p1, v0, v1, v4, v5}, Lcom/zykj/blackboard/core/edit/IBoardControl;->save(ZZLr6/c;Lr6/c;)V

    .line 77
    .line 78
    .line 79
    :cond_3
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 80
    .line 81
    return-object p1
.end method
