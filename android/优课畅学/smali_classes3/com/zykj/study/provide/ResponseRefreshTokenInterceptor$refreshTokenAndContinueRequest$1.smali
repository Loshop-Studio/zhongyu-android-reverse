.class final Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor$refreshTokenAndContinueRequest$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor;->refreshTokenAndContinueRequest(Li9/x$a;)Li9/d0;
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
    c = "com.zykj.study.provide.ResponseRefreshTokenInterceptor$refreshTokenAndContinueRequest$1"
    f = "ResponseRefreshTokenInterceptor.kt"
    l = {
        0x4d
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public final synthetic c:Lkotlin/jvm/internal/Ref$ObjectRef;

.field public final synthetic d:Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor;

.field public final synthetic e:Li9/x$a;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor;Li9/x$a;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->c:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->d:Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->e:Li9/x$a;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor$refreshTokenAndContinueRequest$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->c:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->d:Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->e:Li9/x$a;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor$refreshTokenAndContinueRequest$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor;Li9/x$a;Lm7/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor$refreshTokenAndContinueRequest$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->b:I

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
    iget-object v0, p0, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lkotlin/jvm/internal/Ref$ObjectRef;

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
    iget-object p1, p0, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->c:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 32
    .line 33
    iget-object v1, p0, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->d:Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor;

    .line 34
    .line 35
    invoke-virtual {v1}, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor;->getRefreshRepository()Li3/a;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget-object v3, p0, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->e:Li9/x$a;

    .line 40
    .line 41
    invoke-interface {v3}, Li9/x$a;->a()Li9/b0;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    const-string v4, "Authorization"

    .line 46
    .line 47
    invoke-virtual {v3, v4}, Li9/b0;->e(Ljava/lang/String;)Ljava/lang/String;

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
    invoke-static {v3, v4}, Lg8/c0;->y0(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

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
    iput-object p1, p0, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->a:Ljava/lang/Object;

    .line 64
    .line 65
    iput v2, p0, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->b:I

    .line 66
    .line 67
    invoke-virtual {v1, v3, p0}, Li3/a;->a(Ljava/lang/String;Lm7/c;)Ljava/lang/Object;

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
    iput-object p1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->a:Ljava/lang/Object;

    .line 77
    .line 78
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 79
    .line 80
    return-object p1
.end method
