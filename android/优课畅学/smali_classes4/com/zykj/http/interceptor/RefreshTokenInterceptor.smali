.class public final Lcom/zykj/http/interceptor/RefreshTokenInterceptor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li9/x;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field public refreshRepository:Li3/a;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field public unauthorizedFlow:Ll8/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll8/g;"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic getUnauthorizedFlow$annotations()V
    .locals 0
    .annotation runtime Lcom/zykj/http/annotation/UnauthorizedFlow;
    .end annotation

    return-void
.end method

.method private final refreshTokenAndContinueRequest(Li9/x$a;)Li9/d0;
    .locals 5

    .line 1
    invoke-interface {p1}, Li9/x$a;->a()Li9/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Li9/b0;->i()Li9/b0$a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 10
    .line 11
    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v2, ""

    .line 15
    .line 16
    iput-object v2, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->a:Ljava/lang/Object;

    .line 17
    .line 18
    new-instance v2, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-direct {v2, v1, p0, p1, v3}, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$refreshTokenAndContinueRequest$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/zykj/http/interceptor/RefreshTokenInterceptor;Li9/x$a;Lm7/c;)V

    .line 22
    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    invoke-static {v3, v2, v4, v3}, Li8/f;->f(Lkotlin/coroutines/d;Lx7/p;ILjava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    iget-object v2, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->a:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, Ljava/lang/CharSequence;

    .line 31
    .line 32
    invoke-static {v2}, Lg8/c0;->h0(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    return-object v3

    .line 39
    :cond_0
    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->a:Ljava/lang/Object;

    .line 40
    .line 41
    new-instance v2, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    const-string v3, "Bearer "

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    const-string v2, "Authorization"

    .line 59
    .line 60
    invoke-virtual {v0, v2, v1}, Li9/b0$a;->o(Ljava/lang/String;Ljava/lang/String;)Li9/b0$a;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Li9/b0$a;->b()Li9/b0;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-interface {p1, v0}, Li9/x$a;->b(Li9/b0;)Li9/d0;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    return-object p1
.end method


# virtual methods
.method public final getRefreshRepository()Li3/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/http/interceptor/RefreshTokenInterceptor;->refreshRepository:Li3/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "refreshRepository"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final getUnauthorizedFlow()Ll8/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ll8/g;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/http/interceptor/RefreshTokenInterceptor;->unauthorizedFlow:Ll8/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "unauthorizedFlow"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public intercept(Li9/x$a;)Li9/d0;
    .locals 3

    .line 1
    const-string v0, "chain"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Li9/x$a;->a()Li9/b0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {p1, v0}, Li9/x$a;->b(Li9/b0;)Li9/d0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Li9/d0;->f()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/16 v2, 0x191

    .line 19
    .line 20
    if-ne v1, v2, :cond_2

    .line 21
    .line 22
    invoke-virtual {v0}, Li9/d0;->close()V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, p1}, Lcom/zykj/http/interceptor/RefreshTokenInterceptor;->refreshTokenAndContinueRequest(Li9/x$a;)Li9/d0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0}, Li9/d0;->f()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-ne p1, v2, :cond_0

    .line 36
    .line 37
    new-instance p1, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$intercept$1$1;

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-direct {p1, p0, v1}, Lcom/zykj/http/interceptor/RefreshTokenInterceptor$intercept$1$1;-><init>(Lcom/zykj/http/interceptor/RefreshTokenInterceptor;Lm7/c;)V

    .line 41
    .line 42
    .line 43
    const/4 v2, 0x1

    .line 44
    invoke-static {v1, p1, v2, v1}, Li8/f;->f(Lkotlin/coroutines/d;Lx7/p;ILjava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    :cond_0
    return-object v0

    .line 48
    :cond_1
    invoke-interface {p1}, Li9/x$a;->a()Li9/b0;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-interface {p1, v0}, Li9/x$a;->b(Li9/b0;)Li9/d0;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1

    .line 57
    :cond_2
    return-object v0
.end method

.method public final setRefreshRepository(Li3/a;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/http/interceptor/RefreshTokenInterceptor;->refreshRepository:Li3/a;

    .line 7
    .line 8
    return-void
.end method

.method public final setUnauthorizedFlow(Ll8/g;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll8/g;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/http/interceptor/RefreshTokenInterceptor;->unauthorizedFlow:Ll8/g;

    .line 7
    .line 8
    return-void
.end method
