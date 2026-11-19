.class final Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/http/interceptor/RefreshTokenInterceptor;->refreshTokenAndContinueRequest(Lf5/x$a;)Lf5/d0;
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
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.http.interceptor.RefreshTokenInterceptor$refreshTokenAndContinueRequest$1"
    f = "RefreshTokenInterceptor.kt"
    i = {}
    l = {
        0x3a
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public final synthetic c:Lkotlin/jvm/internal/Ref$ObjectRef;

.field public final synthetic d:Lcom/zykj/http/interceptor/RefreshTokenInterceptor;

.field public final synthetic e:Lf5/x$a;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/zykj/http/interceptor/RefreshTokenInterceptor;Lf5/x$a;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->c:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->d:Lcom/zykj/http/interceptor/RefreshTokenInterceptor;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->e:Lf5/x$a;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3

    new-instance p1, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;

    iget-object v0, p0, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->c:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, p0, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->d:Lcom/zykj/http/interceptor/RefreshTokenInterceptor;

    iget-object v2, p0, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->e:Lf5/x$a;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/zykj/http/interceptor/RefreshTokenInterceptor;Lf5/x$a;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->b:I

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
    iget-object v0, p0, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

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
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->c:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 32
    .line 33
    iget-object v1, p0, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->d:Lcom/zykj/http/interceptor/RefreshTokenInterceptor;

    .line 34
    .line 35
    invoke-virtual {v1}, Lcom/zykj/http/interceptor/RefreshTokenInterceptor;->getRefreshRepository()Lq3/a;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget-object v3, p0, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->e:Lf5/x$a;

    .line 40
    .line 41
    invoke-interface {v3}, Lf5/x$a;->a()Lf5/b0;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    const-string v4, "Authorization"

    .line 46
    .line 47
    invoke-virtual {v3, v4}, Lf5/b0;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    const-string v4, "Bearer "

    .line 54
    .line 55
    invoke-static {v3, v4}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    if-nez v3, :cond_3

    .line 60
    .line 61
    :cond_2
    const-string v3, ""

    .line 62
    .line 63
    :cond_3
    iput-object p1, p0, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->a:Ljava/lang/Object;

    .line 64
    .line 65
    iput v2, p0, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->b:I

    .line 66
    .line 67
    invoke-virtual {v1, v3, p0}, Lq3/a;->a(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    if-ne v1, v0, :cond_4

    .line 72
    .line 73
    return-object v0

    .line 74
    :cond_4
    move-object v0, p1

    .line 75
    move-object p1, v1

    .line 76
    :goto_0
    iput-object p1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 77
    .line 78
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 79
    .line 80
    return-object p1
.end method
