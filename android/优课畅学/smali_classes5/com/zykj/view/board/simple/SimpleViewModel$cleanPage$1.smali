.class final Lcom/zykj/view/board/simple/SimpleViewModel$cleanPage$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/simple/SimpleViewModel;->c()V
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
    c = "com.zykj.view.board.simple.SimpleViewModel$cleanPage$1"
    f = "SimpleViewModel.kt"
    l = {
        0xed
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/view/board/simple/SimpleViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/simple/SimpleViewModel;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$cleanPage$1;->b:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/zykj/view/board/simple/SimpleViewModel$cleanPage$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleViewModel$cleanPage$1;->b:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$cleanPage$1;-><init>(Lcom/zykj/view/board/simple/SimpleViewModel;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$cleanPage$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/simple/SimpleViewModel$cleanPage$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$cleanPage$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$cleanPage$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$cleanPage$1;->a:I

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
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$cleanPage$1;->b:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleViewModel;->a(Lcom/zykj/view/board/simple/SimpleViewModel;)Ll8/g;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    sget-object v1, Lcom/zykj/view/board/simple/b$a;->a:Lcom/zykj/view/board/simple/b$a;

    .line 34
    .line 35
    iput v2, p0, Lcom/zykj/view/board/simple/SimpleViewModel$cleanPage$1;->a:I

    .line 36
    .line 37
    invoke-interface {p1, v1, p0}, Ll8/g;->emit(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-ne p1, v0, :cond_2

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_2
    :goto_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 45
    .line 46
    return-object p1
.end method
