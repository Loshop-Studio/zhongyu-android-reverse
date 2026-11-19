.class final Lcoil3/intercept/EngineInterceptor$intercept$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcoil3/intercept/EngineInterceptor;->a(Lcoil3/intercept/a$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Ly/o;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/CoroutineScope;",
        "Ly/o;",
        "<anonymous>",
        "(Lkotlinx/coroutines/CoroutineScope;)Ly/o;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "coil3.intercept.EngineInterceptor$intercept$2"
    f = "EngineInterceptor.kt"
    i = {}
    l = {
        0x4d
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nEngineInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EngineInterceptor.kt\ncoil3/intercept/EngineInterceptor$intercept$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcoil3/intercept/EngineInterceptor;

.field public final synthetic c:Ly/e;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ly/k;

.field public final synthetic f:Lcoil3/b;

.field public final synthetic g:Lt/d$b;

.field public final synthetic h:Lcoil3/intercept/a$a;


# direct methods
.method public constructor <init>(Lcoil3/intercept/EngineInterceptor;Ly/e;Ljava/lang/Object;Ly/k;Lcoil3/b;Lt/d$b;Lcoil3/intercept/a$a;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->b:Lcoil3/intercept/EngineInterceptor;

    .line 2
    .line 3
    iput-object p2, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->c:Ly/e;

    .line 4
    .line 5
    iput-object p3, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->d:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p4, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->e:Ly/k;

    .line 8
    .line 9
    iput-object p5, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->f:Lcoil3/b;

    .line 10
    .line 11
    iput-object p6, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->g:Lt/d$b;

    .line 12
    .line 13
    iput-object p7, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->h:Lcoil3/intercept/a$a;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p8}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 9

    new-instance v0, Lcoil3/intercept/EngineInterceptor$intercept$2;

    iget-object v1, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->b:Lcoil3/intercept/EngineInterceptor;

    iget-object v2, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->c:Ly/e;

    iget-object v3, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->d:Ljava/lang/Object;

    iget-object v4, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->e:Ly/k;

    iget-object v5, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->f:Lcoil3/b;

    iget-object v6, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->g:Lt/d$b;

    iget-object v7, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->h:Lcoil3/intercept/a$a;

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lcoil3/intercept/EngineInterceptor$intercept$2;-><init>(Lcoil3/intercept/EngineInterceptor;Ly/e;Ljava/lang/Object;Ly/k;Lcoil3/b;Lt/d$b;Lcoil3/intercept/a$a;Lkotlin/coroutines/Continuation;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcoil3/intercept/EngineInterceptor$intercept$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcoil3/intercept/EngineInterceptor$intercept$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcoil3/intercept/EngineInterceptor$intercept$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcoil3/intercept/EngineInterceptor$intercept$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v6

    .line 5
    iget v0, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->a:I

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    move-object v0, p1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v0

    .line 25
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->b:Lcoil3/intercept/EngineInterceptor;

    .line 29
    .line 30
    iget-object v2, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->c:Ly/e;

    .line 31
    .line 32
    move-object v3, v2

    .line 33
    iget-object v2, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->d:Ljava/lang/Object;

    .line 34
    .line 35
    move-object v4, v3

    .line 36
    iget-object v3, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->e:Ly/k;

    .line 37
    .line 38
    move-object v7, v4

    .line 39
    iget-object v4, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->f:Lcoil3/b;

    .line 40
    .line 41
    iput v1, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->a:I

    .line 42
    .line 43
    move-object v5, p0

    .line 44
    move-object v1, v7

    .line 45
    invoke-static/range {v0 .. v5}, Lcoil3/intercept/EngineInterceptor;->c(Lcoil3/intercept/EngineInterceptor;Ly/e;Ljava/lang/Object;Ly/k;Lcoil3/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-ne v0, v6, :cond_2

    .line 50
    .line 51
    return-object v6

    .line 52
    :cond_2
    :goto_0
    check-cast v0, Lcoil3/intercept/EngineInterceptor$b;

    .line 53
    .line 54
    iget-object v1, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->b:Lcoil3/intercept/EngineInterceptor;

    .line 55
    .line 56
    invoke-static {v1}, Lcoil3/intercept/EngineInterceptor;->f(Lcoil3/intercept/EngineInterceptor;)Lc0/x;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-interface {v1}, Lc0/x;->a()V

    .line 61
    .line 62
    .line 63
    iget-object v1, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->b:Lcoil3/intercept/EngineInterceptor;

    .line 64
    .line 65
    invoke-static {v1}, Lcoil3/intercept/EngineInterceptor;->e(Lcoil3/intercept/EngineInterceptor;)Lt/e;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    iget-object v2, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->g:Lt/d$b;

    .line 70
    .line 71
    iget-object v3, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->c:Ly/e;

    .line 72
    .line 73
    invoke-virtual {v1, v2, v3, v0}, Lt/e;->h(Lt/d$b;Ly/e;Lcoil3/intercept/EngineInterceptor$b;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    invoke-virtual {v0}, Lcoil3/intercept/EngineInterceptor$b;->e()Lk/j;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    iget-object v8, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->c:Ly/e;

    .line 82
    .line 83
    invoke-virtual {v0}, Lcoil3/intercept/EngineInterceptor$b;->c()Lcoil3/decode/DataSource;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    iget-object v2, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->g:Lt/d$b;

    .line 88
    .line 89
    if-eqz v1, :cond_3

    .line 90
    .line 91
    :goto_1
    move-object v10, v2

    .line 92
    goto :goto_2

    .line 93
    :cond_3
    const/4 v2, 0x0

    .line 94
    goto :goto_1

    .line 95
    :goto_2
    invoke-virtual {v0}, Lcoil3/intercept/EngineInterceptor$b;->d()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v11

    .line 99
    invoke-virtual {v0}, Lcoil3/intercept/EngineInterceptor$b;->f()Z

    .line 100
    .line 101
    .line 102
    move-result v12

    .line 103
    iget-object v0, p0, Lcoil3/intercept/EngineInterceptor$intercept$2;->h:Lcoil3/intercept/a$a;

    .line 104
    .line 105
    invoke-static {v0}, Lcoil3/util/c;->o(Lcoil3/intercept/a$a;)Z

    .line 106
    .line 107
    .line 108
    move-result v13

    .line 109
    new-instance v6, Ly/o;

    .line 110
    .line 111
    invoke-direct/range {v6 .. v13}, Ly/o;-><init>(Lk/j;Ly/e;Lcoil3/decode/DataSource;Lt/d$b;Ljava/lang/String;ZZ)V

    .line 112
    .line 113
    .line 114
    return-object v6
.end method
