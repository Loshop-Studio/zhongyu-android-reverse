.class final Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.zykj.view.board.board.BoardViewModel$getSavePath$3$2$1"
    f = "BoardViewModel.kt"
    l = {
        0x473
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:I

.field public e:I

.field public synthetic f:Ljava/lang/Object;

.field public final synthetic g:Lhd/p;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lhd/p;Ljava/lang/String;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3$2$1;->g:Lhd/p;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3$2$1;->h:Ljava/lang/String;

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

    .line 1
    new-instance v0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3$2$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3$2$1;->g:Lhd/p;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3$2$1;->h:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3$2$1;-><init>(Lhd/p;Ljava/lang/String;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3$2$1;->f:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3$2$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3$2$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3$2$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3$2$1;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lsd/i0;

    .line 4
    .line 5
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v2, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3$2$1;->e:I

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    if-ne v2, v3, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3$2$1;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lsd/i0;

    .line 19
    .line 20
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 29
    .line 30
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p1

    .line 34
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3$2$1;->g:Lhd/p;

    .line 38
    .line 39
    iget-object v2, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3$2$1;->h:Ljava/lang/String;

    .line 40
    .line 41
    :try_start_1
    sget-object v4, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 42
    .line 43
    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    iput-object v4, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3$2$1;->f:Ljava/lang/Object;

    .line 48
    .line 49
    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3$2$1;->c:Ljava/lang/Object;

    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    iput v0, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3$2$1;->d:I

    .line 57
    .line 58
    iput v3, p0, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3$2$1;->e:I

    .line 59
    .line 60
    invoke-interface {p1, v2, p0}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-ne p1, v1, :cond_2

    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_2
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 68
    .line 69
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    goto :goto_2

    .line 74
    :goto_1
    sget-object v0, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 75
    .line 76
    invoke-static {p1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    :goto_2
    invoke-static {p1}, Lkotlin/Result;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-eqz p1, :cond_3

    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 91
    .line 92
    .line 93
    :cond_3
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 94
    .line 95
    return-object p1
.end method
