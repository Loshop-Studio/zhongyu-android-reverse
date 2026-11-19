.class final Lcom/zykj/view/board/board/BoardFragment$getSavePath$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/board/BoardFragment;->z0(ZZLhd/l;Lhd/l;)V
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
    c = "com.zykj.view.board.board.BoardFragment$getSavePath$2"
    f = "BoardFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lhd/l;

.field public final synthetic f:Lhd/l;


# direct methods
.method public constructor <init>(Lhd/l;Lhd/l;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$getSavePath$2;->e:Lhd/l;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/view/board/board/BoardFragment$getSavePath$2;->f:Lhd/l;

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
    new-instance v0, Lcom/zykj/view/board/board/BoardFragment$getSavePath$2;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardFragment$getSavePath$2;->e:Lhd/l;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/view/board/board/BoardFragment$getSavePath$2;->f:Lhd/l;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lcom/zykj/view/board/board/BoardFragment$getSavePath$2;-><init>(Lhd/l;Lhd/l;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lcom/zykj/view/board/board/BoardFragment$getSavePath$2;->d:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final g(Ljava/lang/Throwable;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment$getSavePath$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/view/board/board/BoardFragment$getSavePath$2;

    .line 6
    .line 7
    sget-object p2, Lqc/q;->a:Lqc/q;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/zykj/view/board/board/BoardFragment$getSavePath$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment$getSavePath$2;->g(Ljava/lang/Throwable;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment$getSavePath$2;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Throwable;

    .line 4
    .line 5
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/view/board/board/BoardFragment$getSavePath$2;->c:I

    .line 9
    .line 10
    if-nez v1, :cond_2

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$getSavePath$2;->e:Lhd/l;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-interface {p1, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    new-array v0, v0, [Ljava/lang/Object;

    .line 31
    .line 32
    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$getSavePath$2;->f:Lhd/l;

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    invoke-interface {p1, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 42
    .line 43
    return-object p1

    .line 44
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1
.end method
