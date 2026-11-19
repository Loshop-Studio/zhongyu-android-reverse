.class final Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/board/BoardViewModel;->e1(Lcom/zykj/view/board/board/u;)V
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
    c = "com.zykj.view.board.board.BoardViewModel$updatePenType$1"
    f = "BoardViewModel.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/zykj/view/board/board/BoardViewModel;

.field public final synthetic e:Lcom/zykj/view/board/board/u;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/board/BoardViewModel;Lcom/zykj/view/board/board/u;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;->d:Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;->e:Lcom/zykj/view/board/board/u;

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
    .locals 2

    .line 1
    new-instance p1, Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;->d:Lcom/zykj/view/board/board/BoardViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;->e:Lcom/zykj/view/board/board/u;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;Lcom/zykj/view/board/board/u;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;->d:Lcom/zykj/view/board/board/BoardViewModel;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardViewModel;->v(Lcom/zykj/view/board/board/BoardViewModel;)Lvd/l;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v3, p0, Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;->e:Lcom/zykj/view/board/board/u;

    .line 18
    .line 19
    :cond_0
    invoke-interface {p1}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v8

    .line 23
    move-object v0, v8

    .line 24
    check-cast v0, Lcom/zykj/view/board/board/t;

    .line 25
    .line 26
    const/16 v6, 0x1b

    .line 27
    .line 28
    const/4 v7, 0x0

    .line 29
    const/4 v1, 0x0

    .line 30
    const/4 v2, 0x0

    .line 31
    const/4 v4, 0x0

    .line 32
    const/4 v5, 0x0

    .line 33
    invoke-static/range {v0 .. v7}, Lcom/zykj/view/board/board/t;->b(Lcom/zykj/view/board/board/t;ZZLcom/zykj/view/board/board/u;ILcom/zykj/view/board/board/s;ILjava/lang/Object;)Lcom/zykj/view/board/board/t;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {p1, v8, v0}, Lvd/l;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;->d:Lcom/zykj/view/board/board/BoardViewModel;

    .line 44
    .line 45
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardViewModel;->w(Lcom/zykj/view/board/board/BoardViewModel;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;->e:Lcom/zykj/view/board/board/u;

    .line 49
    .line 50
    invoke-virtual {p1}, Lcom/zykj/view/board/board/u;->b()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    invoke-static {p1}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {p1}, Lvb/n;->n(Ljava/lang/Integer;)V

    .line 59
    .line 60
    .line 61
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 62
    .line 63
    return-object p1

    .line 64
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 65
    .line 66
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 67
    .line 68
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw p1
.end method
