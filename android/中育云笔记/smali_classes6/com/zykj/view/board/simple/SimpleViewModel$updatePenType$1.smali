.class final Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/simple/SimpleViewModel;->p(Lcom/zykj/view/board/simple/d;)V
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
    c = "com.zykj.view.board.simple.SimpleViewModel$updatePenType$1"
    f = "SimpleViewModel.kt"
    l = {
        0x53
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/zykj/view/board/simple/SimpleViewModel;

.field public final synthetic e:Lcom/zykj/view/board/simple/d;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/simple/SimpleViewModel;Lcom/zykj/view/board/simple/d;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;->d:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;->e:Lcom/zykj/view/board/simple/d;

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
    new-instance p1, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;->d:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;->e:Lcom/zykj/view/board/simple/d;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;-><init>(Lcom/zykj/view/board/simple/SimpleViewModel;Lcom/zykj/view/board/simple/d;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;->c:I

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
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;->d:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleViewModel;->b(Lcom/zykj/view/board/simple/SimpleViewModel;)Lvd/l;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object v7, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;->e:Lcom/zykj/view/board/simple/d;

    .line 34
    .line 35
    :cond_2
    invoke-interface {p1}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    move-object v3, v1

    .line 40
    check-cast v3, Lcom/zykj/view/board/simple/e;

    .line 41
    .line 42
    const/16 v12, 0xf7

    .line 43
    .line 44
    const/4 v13, 0x0

    .line 45
    const/4 v4, 0x0

    .line 46
    const/4 v5, 0x0

    .line 47
    const/4 v6, 0x0

    .line 48
    const/4 v8, 0x0

    .line 49
    const/4 v9, 0x0

    .line 50
    const/4 v10, 0x0

    .line 51
    const/4 v11, 0x0

    .line 52
    invoke-static/range {v3 .. v13}, Lcom/zykj/view/board/simple/e;->b(Lcom/zykj/view/board/simple/e;ZLcom/zykj/view/board/board/q;Lcom/zykj/view/board/board/r;Lcom/zykj/view/board/simple/d;Lcom/zykj/view/board/simple/c;Lcom/zykj/view/board/board/s;Lcom/zykj/view/board/board/j;Lcom/zykj/view/board/board/l;ILjava/lang/Object;)Lcom/zykj/view/board/simple/e;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-interface {p1, v1, v3}, Lvd/l;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;->d:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 63
    .line 64
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleViewModel;->a(Lcom/zykj/view/board/simple/SimpleViewModel;)Lvd/k;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    new-instance v1, Lcom/zykj/view/board/simple/b$f;

    .line 69
    .line 70
    iget-object v3, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;->e:Lcom/zykj/view/board/simple/d;

    .line 71
    .line 72
    invoke-virtual {v3}, Lcom/zykj/view/board/simple/d;->a()I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    iget-object v4, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;->e:Lcom/zykj/view/board/simple/d;

    .line 77
    .line 78
    invoke-virtual {v4}, Lcom/zykj/view/board/simple/d;->c()Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    invoke-direct {v1, v3, v4}, Lcom/zykj/view/board/simple/b$f;-><init>(IZ)V

    .line 83
    .line 84
    .line 85
    iput v2, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;->c:I

    .line 86
    .line 87
    invoke-interface {p1, v1, p0}, Lvd/k;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    if-ne p1, v0, :cond_3

    .line 92
    .line 93
    return-object v0

    .line 94
    :cond_3
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 95
    .line 96
    return-object p1
.end method
