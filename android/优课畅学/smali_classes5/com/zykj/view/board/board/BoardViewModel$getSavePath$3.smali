.class final Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/board/BoardViewModel;->V(ZZLx7/p;Lx7/p;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lx7/p;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.view.board.board.BoardViewModel$getSavePath$3"
    f = "BoardViewModel.kt"
    l = {
        0x46b
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/view/board/board/BoardViewModel;

.field public final synthetic c:Z

.field public final synthetic d:Z

.field public final synthetic e:Lx7/p;

.field public final synthetic f:Lx7/p;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/board/BoardViewModel;ZZLx7/p;Lx7/p;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->b:Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->c:Z

    .line 4
    .line 5
    iput-boolean p3, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->d:Z

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->e:Lx7/p;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->f:Lx7/p;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static synthetic c(Lcom/zykj/view/board/board/BoardViewModel;Lx7/p;Ljava/lang/Throwable;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->l(Lcom/zykj/view/board/board/BoardViewModel;Lx7/p;Ljava/lang/Throwable;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/zykj/view/board/board/BoardViewModel;Lx7/p;Ljava/lang/String;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->k(Lcom/zykj/view/board/board/BoardViewModel;Lx7/p;Ljava/lang/String;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final k(Lcom/zykj/view/board/board/BoardViewModel;Lx7/p;Ljava/lang/String;)Lh7/p;
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Li8/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Li8/i0;->c()Li8/h1;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v3, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3$2$1;

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    invoke-direct {v3, p1, p2, p0}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3$2$1;-><init>(Lx7/p;Ljava/lang/String;Lm7/c;)V

    .line 13
    .line 14
    .line 15
    const/4 v4, 0x2

    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-static/range {v0 .. v5}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 19
    .line 20
    .line 21
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 22
    .line 23
    return-object p0
.end method

.method public static final l(Lcom/zykj/view/board/board/BoardViewModel;Lx7/p;Ljava/lang/Throwable;)Lh7/p;
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Li8/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Li8/i0;->c()Li8/h1;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v3, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3$3$1;

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    invoke-direct {v3, p1, p2, p0}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3$3$1;-><init>(Lx7/p;Ljava/lang/Throwable;Lm7/c;)V

    .line 13
    .line 14
    .line 15
    const/4 v4, 0x2

    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-static/range {v0 .. v5}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 19
    .line 20
    .line 21
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 22
    .line 23
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 7

    .line 1
    new-instance v0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->b:Lcom/zykj/view/board/board/BoardViewModel;

    .line 4
    .line 5
    iget-boolean v2, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->c:Z

    .line 6
    .line 7
    iget-boolean v3, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->d:Z

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->e:Lx7/p;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->f:Lx7/p;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;-><init>(Lcom/zykj/view/board/board/BoardViewModel;ZZLx7/p;Lx7/p;Lm7/c;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->a:I

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
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->b:Lcom/zykj/view/board/board/BoardViewModel;

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/zykj/view/board/board/BoardViewModel;->Q()Ll8/q;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    new-instance v1, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3$1;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    invoke-direct {v1, v3}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3$1;-><init>(Lm7/c;)V

    .line 37
    .line 38
    .line 39
    iput v2, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->a:I

    .line 40
    .line 41
    invoke-static {p1, v1, p0}, Ll8/e;->y(Ll8/c;Lx7/p;Lm7/c;)Ljava/lang/Object;

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
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->b:Lcom/zykj/view/board/board/BoardViewModel;

    .line 49
    .line 50
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardViewModel;->p(Lcom/zykj/view/board/board/BoardViewModel;)Lcom/zykj/blackboard/core/edit/IBoardControl;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-eqz p1, :cond_3

    .line 55
    .line 56
    iget-boolean v0, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->c:Z

    .line 57
    .line 58
    iget-boolean v1, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->d:Z

    .line 59
    .line 60
    iget-object v2, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->b:Lcom/zykj/view/board/board/BoardViewModel;

    .line 61
    .line 62
    iget-object v3, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->e:Lx7/p;

    .line 63
    .line 64
    new-instance v4, Lcom/zykj/view/board/board/e;

    .line 65
    .line 66
    invoke-direct {v4, v2, v3}, Lcom/zykj/view/board/board/e;-><init>(Lcom/zykj/view/board/board/BoardViewModel;Lx7/p;)V

    .line 67
    .line 68
    .line 69
    iget-object v2, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->b:Lcom/zykj/view/board/board/BoardViewModel;

    .line 70
    .line 71
    iget-object v3, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->f:Lx7/p;

    .line 72
    .line 73
    new-instance v5, Lcom/zykj/view/board/board/f;

    .line 74
    .line 75
    invoke-direct {v5, v2, v3}, Lcom/zykj/view/board/board/f;-><init>(Lcom/zykj/view/board/board/BoardViewModel;Lx7/p;)V

    .line 76
    .line 77
    .line 78
    invoke-interface {p1, v0, v1, v4, v5}, Lcom/zykj/blackboard/core/edit/IBoardControl;->save(ZZLx7/l;Lx7/l;)V

    .line 79
    .line 80
    .line 81
    :cond_3
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 82
    .line 83
    return-object p1
.end method
