.class final Lcom/zykj/view/board/board/BoardViewModel$updatePenColorLevel$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/board/BoardViewModel;->Z0(I)V
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
    c = "com.zykj.view.board.board.BoardViewModel$updatePenColorLevel$1"
    f = "BoardViewModel.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:I

.field public final synthetic c:Lcom/zykj/view/board/board/BoardViewModel;


# direct methods
.method public constructor <init>(ILcom/zykj/view/board/board/BoardViewModel;Lm7/c;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/view/board/board/BoardViewModel$updatePenColorLevel$1;->b:I

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/view/board/board/BoardViewModel$updatePenColorLevel$1;->c:Lcom/zykj/view/board/board/BoardViewModel;

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
    new-instance p1, Lcom/zykj/view/board/board/BoardViewModel$updatePenColorLevel$1;

    .line 2
    .line 3
    iget v0, p0, Lcom/zykj/view/board/board/BoardViewModel$updatePenColorLevel$1;->b:I

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardViewModel$updatePenColorLevel$1;->c:Lcom/zykj/view/board/board/BoardViewModel;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/view/board/board/BoardViewModel$updatePenColorLevel$1;-><init>(ILcom/zykj/view/board/board/BoardViewModel;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$updatePenColorLevel$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/board/BoardViewModel$updatePenColorLevel$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$updatePenColorLevel$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel$updatePenColorLevel$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/view/board/board/BoardViewModel$updatePenColorLevel$1;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/zykj/view/board/board/h;->c()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget v0, p0, Lcom/zykj/view/board/board/BoardViewModel$updatePenColorLevel$1;->b:I

    .line 16
    .line 17
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    move-object v5, p1

    .line 22
    check-cast v5, Lcom/zykj/view/board/board/s;

    .line 23
    .line 24
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$updatePenColorLevel$1;->c:Lcom/zykj/view/board/board/BoardViewModel;

    .line 25
    .line 26
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardViewModel;->v(Lcom/zykj/view/board/board/BoardViewModel;)Ll8/h;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    :cond_0
    invoke-interface {p1}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v8

    .line 34
    move-object v0, v8

    .line 35
    check-cast v0, Lcom/zykj/view/board/board/t;

    .line 36
    .line 37
    const/16 v6, 0xf

    .line 38
    .line 39
    const/4 v7, 0x0

    .line 40
    const/4 v1, 0x0

    .line 41
    const/4 v2, 0x0

    .line 42
    const/4 v3, 0x0

    .line 43
    const/4 v4, 0x0

    .line 44
    invoke-static/range {v0 .. v7}, Lcom/zykj/view/board/board/t;->b(Lcom/zykj/view/board/board/t;ZZLcom/zykj/view/board/board/u;ILcom/zykj/view/board/board/s;ILjava/lang/Object;)Lcom/zykj/view/board/board/t;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-interface {p1, v8, v0}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$updatePenColorLevel$1;->c:Lcom/zykj/view/board/board/BoardViewModel;

    .line 55
    .line 56
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardViewModel;->w(Lcom/zykj/view/board/board/BoardViewModel;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v5}, Lcom/zykj/view/board/board/s;->a()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    invoke-static {p1}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-static {p1}, La6/n;->l(Ljava/lang/Integer;)V

    .line 68
    .line 69
    .line 70
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 71
    .line 72
    return-object p1

    .line 73
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 74
    .line 75
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 76
    .line 77
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p1
.end method
