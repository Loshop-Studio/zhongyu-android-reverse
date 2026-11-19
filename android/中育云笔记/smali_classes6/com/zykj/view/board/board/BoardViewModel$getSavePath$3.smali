.class final Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/board/BoardViewModel;->W(ZZLhd/p;Lhd/p;)V
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
    c = "com.zykj.view.board.board.BoardViewModel$getSavePath$3"
    f = "BoardViewModel.kt"
    l = {
        0x46b
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/zykj/view/board/board/BoardViewModel;

.field public final synthetic e:Z

.field public final synthetic f:Z

.field public final synthetic g:Lhd/p;

.field public final synthetic h:Lhd/p;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/board/BoardViewModel;ZZLhd/p;Lhd/p;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->d:Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->e:Z

    .line 4
    .line 5
    iput-boolean p3, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->f:Z

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->g:Lhd/p;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->h:Lhd/p;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static synthetic g(Lcom/zykj/view/board/board/BoardViewModel;Lhd/p;Ljava/lang/Throwable;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->p(Lcom/zykj/view/board/board/BoardViewModel;Lhd/p;Ljava/lang/Throwable;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lcom/zykj/view/board/board/BoardViewModel;Lhd/p;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->n(Lcom/zykj/view/board/board/BoardViewModel;Lhd/p;Ljava/lang/String;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final n(Lcom/zykj/view/board/board/BoardViewModel;Lhd/p;Ljava/lang/String;)Lqc/q;
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lsd/r0;->c()Lsd/t1;

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
    invoke-direct {v3, p1, p2, p0}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3$2$1;-><init>(Lhd/p;Ljava/lang/String;Lvc/c;)V

    .line 13
    .line 14
    .line 15
    const/4 v4, 0x2

    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 19
    .line 20
    .line 21
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 22
    .line 23
    return-object p0
.end method

.method public static final p(Lcom/zykj/view/board/board/BoardViewModel;Lhd/p;Ljava/lang/Throwable;)Lqc/q;
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lsd/r0;->c()Lsd/t1;

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
    invoke-direct {v3, p1, p2, p0}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3$3$1;-><init>(Lhd/p;Ljava/lang/Throwable;Lvc/c;)V

    .line 13
    .line 14
    .line 15
    const/4 v4, 0x2

    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 19
    .line 20
    .line 21
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 22
    .line 23
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 7

    .line 1
    new-instance v0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->d:Lcom/zykj/view/board/board/BoardViewModel;

    .line 4
    .line 5
    iget-boolean v2, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->e:Z

    .line 6
    .line 7
    iget-boolean v3, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->f:Z

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->g:Lhd/p;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->h:Lhd/p;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;-><init>(Lcom/zykj/view/board/board/BoardViewModel;ZZLhd/p;Lhd/p;Lvc/c;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->c:I

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
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->d:Lcom/zykj/view/board/board/BoardViewModel;

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/zykj/view/board/board/BoardViewModel;->Q()Lvd/u;

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
    invoke-direct {v1, v3}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3$1;-><init>(Lvc/c;)V

    .line 37
    .line 38
    .line 39
    iput v2, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->c:I

    .line 40
    .line 41
    invoke-static {p1, v1, p0}, Lvd/e;->w(Lvd/c;Lhd/p;Lvc/c;)Ljava/lang/Object;

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
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->d:Lcom/zykj/view/board/board/BoardViewModel;

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
    iget-boolean v0, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->e:Z

    .line 57
    .line 58
    iget-boolean v1, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->f:Z

    .line 59
    .line 60
    iget-object v2, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->d:Lcom/zykj/view/board/board/BoardViewModel;

    .line 61
    .line 62
    iget-object v3, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->g:Lhd/p;

    .line 63
    .line 64
    new-instance v4, Lcom/zykj/view/board/board/e;

    .line 65
    .line 66
    invoke-direct {v4, v2, v3}, Lcom/zykj/view/board/board/e;-><init>(Lcom/zykj/view/board/board/BoardViewModel;Lhd/p;)V

    .line 67
    .line 68
    .line 69
    iget-object v2, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->d:Lcom/zykj/view/board/board/BoardViewModel;

    .line 70
    .line 71
    iget-object v3, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->h:Lhd/p;

    .line 72
    .line 73
    new-instance v5, Lcom/zykj/view/board/board/f;

    .line 74
    .line 75
    invoke-direct {v5, v2, v3}, Lcom/zykj/view/board/board/f;-><init>(Lcom/zykj/view/board/board/BoardViewModel;Lhd/p;)V

    .line 76
    .line 77
    .line 78
    invoke-interface {p1, v0, v1, v4, v5}, Lcom/zykj/blackboard/core/edit/IBoardControl;->c(ZZLhd/l;Lhd/l;)V

    .line 79
    .line 80
    .line 81
    :cond_3
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 82
    .line 83
    return-object p1
.end method
