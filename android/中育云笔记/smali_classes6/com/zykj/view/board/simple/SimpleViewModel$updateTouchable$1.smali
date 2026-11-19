.class final Lcom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/simple/SimpleViewModel;->q(Z)V
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
    c = "com.zykj.view.board.simple.SimpleViewModel$updateTouchable$1"
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
    iput-object p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1;->d:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1;->e:Z

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
    new-instance p1, Lcom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1;->d:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 4
    .line 5
    iget-boolean v1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1;->e:Z

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1;-><init>(Lcom/zykj/view/board/simple/SimpleViewModel;ZLvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1;->d:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleViewModel;->b(Lcom/zykj/view/board/simple/SimpleViewModel;)Lvd/l;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-boolean v1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1;->e:Z

    .line 18
    .line 19
    :cond_0
    invoke-interface {p1}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v11

    .line 23
    move-object v0, v11

    .line 24
    check-cast v0, Lcom/zykj/view/board/simple/e;

    .line 25
    .line 26
    const/16 v9, 0xfe

    .line 27
    .line 28
    const/4 v10, 0x0

    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x0

    .line 31
    const/4 v4, 0x0

    .line 32
    const/4 v5, 0x0

    .line 33
    const/4 v6, 0x0

    .line 34
    const/4 v7, 0x0

    .line 35
    const/4 v8, 0x0

    .line 36
    invoke-static/range {v0 .. v10}, Lcom/zykj/view/board/simple/e;->b(Lcom/zykj/view/board/simple/e;ZLcom/zykj/view/board/board/q;Lcom/zykj/view/board/board/r;Lcom/zykj/view/board/simple/d;Lcom/zykj/view/board/simple/c;Lcom/zykj/view/board/board/s;Lcom/zykj/view/board/board/j;Lcom/zykj/view/board/board/l;ILjava/lang/Object;)Lcom/zykj/view/board/simple/e;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {p1, v11, v0}, Lvd/l;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1;->d:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 47
    .line 48
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleViewModel;->a(Lcom/zykj/view/board/simple/SimpleViewModel;)Lvd/k;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    new-instance v0, Lcom/zykj/view/board/simple/b$d;

    .line 53
    .line 54
    iget-boolean v1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1;->e:Z

    .line 55
    .line 56
    invoke-direct {v0, v1}, Lcom/zykj/view/board/simple/b$d;-><init>(Z)V

    .line 57
    .line 58
    .line 59
    invoke-interface {p1, v0}, Lvd/k;->a(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 63
    .line 64
    return-object p1

    .line 65
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 68
    .line 69
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p1
.end method
