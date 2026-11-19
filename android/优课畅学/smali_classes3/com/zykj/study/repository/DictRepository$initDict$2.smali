.class final Lcom/zykj/study/repository/DictRepository$initDict$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/repository/DictRepository;->i(Lm7/c;)Ljava/lang/Object;
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
    c = "com.zykj.study.repository.DictRepository$initDict$2"
    f = "DictRepository.kt"
    l = {
        0x1f
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/study/repository/DictRepository;


# direct methods
.method public constructor <init>(Lcom/zykj/study/repository/DictRepository;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/repository/DictRepository$initDict$2;->c:Lcom/zykj/study/repository/DictRepository;

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
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/study/repository/DictRepository$initDict$2;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/repository/DictRepository$initDict$2;->c:Lcom/zykj/study/repository/DictRepository;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/zykj/study/repository/DictRepository$initDict$2;-><init>(Lcom/zykj/study/repository/DictRepository;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/zykj/study/repository/DictRepository$initDict$2;->b:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/repository/DictRepository$initDict$2;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/repository/DictRepository$initDict$2;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/repository/DictRepository$initDict$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/repository/DictRepository$initDict$2;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/study/repository/DictRepository$initDict$2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Li8/b0;

    .line 5
    .line 6
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget v2, p0, Lcom/zykj/study/repository/DictRepository$initDict$2;->a:I

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    if-ne v2, v3, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/zykj/study/repository/DictRepository$initDict$2;->c:Lcom/zykj/study/repository/DictRepository;

    .line 33
    .line 34
    invoke-static {p1}, Lcom/zykj/study/repository/DictRepository;->a(Lcom/zykj/study/repository/DictRepository;)Lo4/c;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object v1, p0, Lcom/zykj/study/repository/DictRepository$initDict$2;->b:Ljava/lang/Object;

    .line 39
    .line 40
    iput v3, p0, Lcom/zykj/study/repository/DictRepository$initDict$2;->a:I

    .line 41
    .line 42
    invoke-interface {p1, p0}, Lo4/c;->a(Lm7/c;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-ne p1, v0, :cond_2

    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_2
    :goto_0
    check-cast p1, Lcom/zykj/study/bean/dict/DictBean;

    .line 50
    .line 51
    new-instance v4, Lcom/zykj/study/repository/DictRepository$initDict$2$1;

    .line 52
    .line 53
    iget-object v0, p0, Lcom/zykj/study/repository/DictRepository$initDict$2;->c:Lcom/zykj/study/repository/DictRepository;

    .line 54
    .line 55
    const/4 v7, 0x0

    .line 56
    invoke-direct {v4, v0, p1, v7}, Lcom/zykj/study/repository/DictRepository$initDict$2$1;-><init>(Lcom/zykj/study/repository/DictRepository;Lcom/zykj/study/bean/dict/DictBean;Lm7/c;)V

    .line 57
    .line 58
    .line 59
    const/4 v5, 0x3

    .line 60
    const/4 v6, 0x0

    .line 61
    const/4 v2, 0x0

    .line 62
    const/4 v3, 0x0

    .line 63
    invoke-static/range {v1 .. v6}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 64
    .line 65
    .line 66
    new-instance v4, Lcom/zykj/study/repository/DictRepository$initDict$2$2;

    .line 67
    .line 68
    iget-object v0, p0, Lcom/zykj/study/repository/DictRepository$initDict$2;->c:Lcom/zykj/study/repository/DictRepository;

    .line 69
    .line 70
    invoke-direct {v4, v0, p1, v7}, Lcom/zykj/study/repository/DictRepository$initDict$2$2;-><init>(Lcom/zykj/study/repository/DictRepository;Lcom/zykj/study/bean/dict/DictBean;Lm7/c;)V

    .line 71
    .line 72
    .line 73
    invoke-static/range {v1 .. v6}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 74
    .line 75
    .line 76
    new-instance v4, Lcom/zykj/study/repository/DictRepository$initDict$2$3;

    .line 77
    .line 78
    iget-object v0, p0, Lcom/zykj/study/repository/DictRepository$initDict$2;->c:Lcom/zykj/study/repository/DictRepository;

    .line 79
    .line 80
    invoke-direct {v4, v0, p1, v7}, Lcom/zykj/study/repository/DictRepository$initDict$2$3;-><init>(Lcom/zykj/study/repository/DictRepository;Lcom/zykj/study/bean/dict/DictBean;Lm7/c;)V

    .line 81
    .line 82
    .line 83
    invoke-static/range {v1 .. v6}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    return-object p1
.end method
