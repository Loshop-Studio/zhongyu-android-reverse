.class final Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/http/interceptor/RefreshTokenInterceptor;->refreshTokenAndContinueRequest(Lje/s$a;)Lje/y;
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
    c = "com.zykj.http.interceptor.RefreshTokenInterceptor$refreshTokenAndContinueRequest$1"
    f = "RefreshTokenInterceptor.kt"
    l = {
        0x3a
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:I

.field public final synthetic e:Lkotlin/jvm/internal/Ref$ObjectRef;

.field public final synthetic f:Lcom/zykj/http/interceptor/RefreshTokenInterceptor;

.field public final synthetic g:Lje/s$a;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/zykj/http/interceptor/RefreshTokenInterceptor;Lje/s$a;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->e:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->f:Lcom/zykj/http/interceptor/RefreshTokenInterceptor;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->g:Lje/s$a;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->e:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->f:Lcom/zykj/http/interceptor/RefreshTokenInterceptor;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->g:Lje/s$a;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/zykj/http/interceptor/RefreshTokenInterceptor;Lje/s$a;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->d:I

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
    iget-object v0, p0, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->c:Ljava/lang/Object;

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
    iget-object p1, p0, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->e:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 32
    .line 33
    iget-object v1, p0, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->f:Lcom/zykj/http/interceptor/RefreshTokenInterceptor;

    .line 34
    .line 35
    invoke-virtual {v1}, Lcom/zykj/http/interceptor/RefreshTokenInterceptor;->getRefreshRepository()Lab/a;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget-object v3, p0, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->g:Lje/s$a;

    .line 40
    .line 41
    invoke-interface {v3}, Lje/s$a;->request()Lje/w;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    const-string v4, "Authorization"

    .line 46
    .line 47
    invoke-virtual {v3, v4}, Lje/w;->d(Ljava/lang/String;)Ljava/lang/String;

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
    invoke-static {v3, v4}, Lqd/c0;->y0(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

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
    iput-object p1, p0, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->c:Ljava/lang/Object;

    .line 64
    .line 65
    iput v2, p0, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;->d:I

    .line 66
    .line 67
    invoke-virtual {v1, v3, p0}, Lab/a;->a(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

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
    iput-object p1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 77
    .line 78
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 79
    .line 80
    return-object p1
.end method
