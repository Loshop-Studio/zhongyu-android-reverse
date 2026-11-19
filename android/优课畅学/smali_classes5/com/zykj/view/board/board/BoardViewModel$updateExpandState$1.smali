.class final Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/board/BoardViewModel;->U0(Z)V
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
    c = "com.zykj.view.board.board.BoardViewModel$updateExpandState$1"
    f = "BoardViewModel.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/view/board/board/BoardViewModel;

.field public final synthetic c:Z


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/board/BoardViewModel;ZLm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;->b:Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;->c:Z

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
    new-instance p1, Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;->b:Lcom/zykj/view/board/board/BoardViewModel;

    .line 4
    .line 5
    iget-boolean v1, p0, Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;->c:Z

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;ZLm7/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_4

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;->b:Lcom/zykj/view/board/board/BoardViewModel;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardViewModel;->s(Lcom/zykj/view/board/board/BoardViewModel;)Ll8/h;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-boolean v0, p0, Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;->c:Z

    .line 18
    .line 19
    :cond_0
    invoke-interface {p1}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    move-object v2, v1

    .line 24
    check-cast v2, Lcom/zykj/view/board/board/k;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    sget-object v3, Lcom/zykj/view/board/board/l$b;->b:Lcom/zykj/view/board/board/l$b;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    sget-object v3, Lcom/zykj/view/board/board/l$a;->b:Lcom/zykj/view/board/board/l$a;

    .line 32
    .line 33
    :goto_0
    invoke-virtual {v2, v3}, Lcom/zykj/view/board/board/k;->a(Lcom/zykj/view/board/board/l;)Lcom/zykj/view/board/board/k;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-interface {p1, v1, v2}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    iget-boolean p1, p0, Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;->c:Z

    .line 44
    .line 45
    if-nez p1, :cond_3

    .line 46
    .line 47
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;->b:Lcom/zykj/view/board/board/BoardViewModel;

    .line 48
    .line 49
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardViewModel;->t(Lcom/zykj/view/board/board/BoardViewModel;)Ll8/h;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    :cond_2
    invoke-interface {p1}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    move-object v1, v0

    .line 58
    check-cast v1, Lcom/zykj/view/board/board/m;

    .line 59
    .line 60
    sget-object v2, Lcom/zykj/view/board/board/r$d;->e:Lcom/zykj/view/board/board/r$d;

    .line 61
    .line 62
    const/16 v11, 0x1fe

    .line 63
    .line 64
    const/4 v12, 0x0

    .line 65
    const/4 v3, 0x0

    .line 66
    const/4 v4, 0x0

    .line 67
    const/4 v5, 0x0

    .line 68
    const/4 v6, 0x0

    .line 69
    const/4 v7, 0x0

    .line 70
    const/4 v8, 0x0

    .line 71
    const/4 v9, 0x0

    .line 72
    const/4 v10, 0x0

    .line 73
    invoke-static/range {v1 .. v12}, Lcom/zykj/view/board/board/m;->b(Lcom/zykj/view/board/board/m;Lcom/zykj/view/board/board/r;Lcom/zykj/view/board/board/g;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/m;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-interface {p1, v0, v1}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_2

    .line 82
    .line 83
    :cond_3
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 84
    .line 85
    return-object p1

    .line 86
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 87
    .line 88
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 89
    .line 90
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw p1
.end method
