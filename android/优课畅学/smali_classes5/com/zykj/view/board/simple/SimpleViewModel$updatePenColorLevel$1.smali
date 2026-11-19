.class final Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/simple/SimpleViewModel;->n(I)V
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
    c = "com.zykj.view.board.simple.SimpleViewModel$updatePenColorLevel$1"
    f = "SimpleViewModel.kt"
    l = {
        0x73
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public final synthetic c:I

.field public final synthetic d:Lcom/zykj/view/board/simple/SimpleViewModel;


# direct methods
.method public constructor <init>(ILcom/zykj/view/board/simple/SimpleViewModel;Lm7/c;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;->c:I

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;->d:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;

    .line 2
    .line 3
    iget v0, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;->c:I

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;->d:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;-><init>(ILcom/zykj/view/board/simple/SimpleViewModel;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;->b:I

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
    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lcom/zykj/view/board/board/s;

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lcom/zykj/view/board/board/h;->c()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget v1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;->c:I

    .line 36
    .line 37
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    move-object v9, p1

    .line 42
    check-cast v9, Lcom/zykj/view/board/board/s;

    .line 43
    .line 44
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;->d:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 45
    .line 46
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleViewModel;->b(Lcom/zykj/view/board/simple/SimpleViewModel;)Ll8/h;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    :cond_2
    invoke-interface {p1}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    move-object v3, v1

    .line 55
    check-cast v3, Lcom/zykj/view/board/simple/e;

    .line 56
    .line 57
    const/16 v12, 0xdf

    .line 58
    .line 59
    const/4 v13, 0x0

    .line 60
    const/4 v4, 0x0

    .line 61
    const/4 v5, 0x0

    .line 62
    const/4 v6, 0x0

    .line 63
    const/4 v7, 0x0

    .line 64
    const/4 v8, 0x0

    .line 65
    const/4 v10, 0x0

    .line 66
    const/4 v11, 0x0

    .line 67
    invoke-static/range {v3 .. v13}, Lcom/zykj/view/board/simple/e;->b(Lcom/zykj/view/board/simple/e;ZLcom/zykj/view/board/board/q;Lcom/zykj/view/board/board/r;Lcom/zykj/view/board/simple/d;Lcom/zykj/view/board/simple/c;Lcom/zykj/view/board/board/s;Lcom/zykj/view/board/board/j;Lcom/zykj/view/board/board/l;ILjava/lang/Object;)Lcom/zykj/view/board/simple/e;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-interface {p1, v1, v3}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_2

    .line 76
    .line 77
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;->d:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 78
    .line 79
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleViewModel;->a(Lcom/zykj/view/board/simple/SimpleViewModel;)Ll8/g;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    new-instance v1, Lcom/zykj/view/board/simple/b$e;

    .line 84
    .line 85
    invoke-virtual {v9}, Lcom/zykj/view/board/board/s;->a()I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    invoke-direct {v1, v3}, Lcom/zykj/view/board/simple/b$e;-><init>(I)V

    .line 90
    .line 91
    .line 92
    invoke-static {v9}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    iput-object v3, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;->a:Ljava/lang/Object;

    .line 97
    .line 98
    iput v2, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;->b:I

    .line 99
    .line 100
    invoke-interface {p1, v1, p0}, Ll8/g;->emit(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    if-ne p1, v0, :cond_3

    .line 105
    .line 106
    return-object v0

    .line 107
    :cond_3
    :goto_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 108
    .line 109
    return-object p1
.end method
