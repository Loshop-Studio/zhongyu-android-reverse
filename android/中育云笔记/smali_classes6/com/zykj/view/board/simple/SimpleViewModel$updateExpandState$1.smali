.class final Lcom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/simple/SimpleViewModel;->l(Z)V
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
    c = "com.zykj.view.board.simple.SimpleViewModel$updateExpandState$1"
    f = "SimpleViewModel.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/zykj/view/board/simple/SimpleViewModel;

.field public final synthetic e:Z


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/simple/SimpleViewModel;ZLvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1;->d:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1;->e:Z

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
    new-instance p1, Lcom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1;->d:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 4
    .line 5
    iget-boolean v1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1;->e:Z

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1;-><init>(Lcom/zykj/view/board/simple/SimpleViewModel;ZLvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_4

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1;->d:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleViewModel;->b(Lcom/zykj/view/board/simple/SimpleViewModel;)Lvd/l;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-boolean v0, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1;->e:Z

    .line 18
    .line 19
    :cond_0
    invoke-interface {p1}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    move-object v2, v1

    .line 24
    check-cast v2, Lcom/zykj/view/board/simple/e;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    sget-object v3, Lcom/zykj/view/board/board/l$b;->b:Lcom/zykj/view/board/board/l$b;

    .line 29
    .line 30
    :goto_0
    move-object v10, v3

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    sget-object v3, Lcom/zykj/view/board/board/l$a;->b:Lcom/zykj/view/board/board/l$a;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :goto_1
    const/16 v11, 0x7f

    .line 36
    .line 37
    const/4 v12, 0x0

    .line 38
    const/4 v3, 0x0

    .line 39
    const/4 v4, 0x0

    .line 40
    const/4 v5, 0x0

    .line 41
    const/4 v6, 0x0

    .line 42
    const/4 v7, 0x0

    .line 43
    const/4 v8, 0x0

    .line 44
    const/4 v9, 0x0

    .line 45
    invoke-static/range {v2 .. v12}, Lcom/zykj/view/board/simple/e;->b(Lcom/zykj/view/board/simple/e;ZLcom/zykj/view/board/board/q;Lcom/zykj/view/board/board/r;Lcom/zykj/view/board/simple/d;Lcom/zykj/view/board/simple/c;Lcom/zykj/view/board/board/s;Lcom/zykj/view/board/board/j;Lcom/zykj/view/board/board/l;ILjava/lang/Object;)Lcom/zykj/view/board/simple/e;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-interface {p1, v1, v2}, Lvd/l;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_0

    .line 54
    .line 55
    iget-boolean p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1;->e:Z

    .line 56
    .line 57
    if-nez p1, :cond_3

    .line 58
    .line 59
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1;->d:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 60
    .line 61
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleViewModel;->b(Lcom/zykj/view/board/simple/SimpleViewModel;)Lvd/l;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    :cond_2
    invoke-interface {p1}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    move-object v1, v0

    .line 70
    check-cast v1, Lcom/zykj/view/board/simple/e;

    .line 71
    .line 72
    sget-object v4, Lcom/zykj/view/board/board/r$d;->e:Lcom/zykj/view/board/board/r$d;

    .line 73
    .line 74
    const/16 v10, 0xfb

    .line 75
    .line 76
    const/4 v11, 0x0

    .line 77
    const/4 v2, 0x0

    .line 78
    const/4 v3, 0x0

    .line 79
    const/4 v5, 0x0

    .line 80
    const/4 v6, 0x0

    .line 81
    const/4 v7, 0x0

    .line 82
    const/4 v8, 0x0

    .line 83
    const/4 v9, 0x0

    .line 84
    invoke-static/range {v1 .. v11}, Lcom/zykj/view/board/simple/e;->b(Lcom/zykj/view/board/simple/e;ZLcom/zykj/view/board/board/q;Lcom/zykj/view/board/board/r;Lcom/zykj/view/board/simple/d;Lcom/zykj/view/board/simple/c;Lcom/zykj/view/board/board/s;Lcom/zykj/view/board/board/j;Lcom/zykj/view/board/board/l;ILjava/lang/Object;)Lcom/zykj/view/board/simple/e;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-interface {p1, v0, v1}, Lvd/l;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_2

    .line 93
    .line 94
    :cond_3
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 95
    .line 96
    return-object p1

    .line 97
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 98
    .line 99
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 100
    .line 101
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw p1
.end method
