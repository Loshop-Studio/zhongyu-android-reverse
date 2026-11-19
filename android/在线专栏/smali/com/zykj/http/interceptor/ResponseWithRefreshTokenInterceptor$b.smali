.class final Lcom/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor$b;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lx2/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor;->refreshTokenAndContinueRequest(Lokhttp3/Response;Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/k;",
        "Lx2/p<",
        "Lf3/h0;",
        "Lq2/d<",
        "-",
        "Lo2/r;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "com.zykj.http.interceptor.ResponseWithRefreshTokenInterceptor$refreshTokenAndContinueRequest$1$1$1"
    f = "ResponseWithRefreshTokenInterceptor.kt"
    l = {
        0x5e
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field b:Ljava/lang/Object;

.field c:I

.field final synthetic d:Lkotlin/jvm/internal/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/x<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic e:Lcom/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/x;Lcom/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor;Lq2/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/x<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor;",
            "Lq2/d<",
            "-",
            "Lcom/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor$b;->d:Lkotlin/jvm/internal/x;

    iput-object p2, p0, Lcom/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor$b;->e:Lcom/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILq2/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq2/d;)Lq2/d;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq2/d<",
            "*>;)",
            "Lq2/d<",
            "Lo2/r;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance p1, Lcom/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor$b;

    iget-object v0, p0, Lcom/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor$b;->d:Lkotlin/jvm/internal/x;

    iget-object v1, p0, Lcom/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor$b;->e:Lcom/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor;

    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor$b;-><init>(Lkotlin/jvm/internal/x;Lcom/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor;Lq2/d;)V

    return-object p1
.end method

.method public bridge synthetic d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lf3/h0;

    check-cast p2, Lq2/d;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor$b;->e(Lf3/h0;Lq2/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final e(Lf3/h0;Lq2/d;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lf3/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lq2/d;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf3/h0;",
            "Lq2/d<",
            "-",
            "Lo2/r;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor$b;->create(Ljava/lang/Object;Lq2/d;)Lq2/d;

    move-result-object p1

    check-cast p1, Lcom/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor$b;

    sget-object p2, Lo2/r;->a:Lo2/r;

    invoke-virtual {p1, p2}, Lcom/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lr2/b;->c()Ljava/lang/Object;

    .line 1
    iget v0, p0, Lcom/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor$b;->c:I

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor$b;->b:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/x;

    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V

    iput-object p1, v0, Lkotlin/jvm/internal/x;->a:Ljava/lang/Object;

    .line 2
    sget-object p1, Lo2/r;->a:Lo2/r;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3
    :cond_1
    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V

    .line 4
    iget-object p1, p0, Lcom/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor$b;->d:Lkotlin/jvm/internal/x;

    iget-object v0, p0, Lcom/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor$b;->e:Lcom/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor;

    invoke-virtual {v0}, Lcom/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor;->getRefreshRepository()Lw1/a;

    iput-object p1, p0, Lcom/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor$b;->b:Ljava/lang/Object;

    iput v1, p0, Lcom/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor$b;->c:I

    const/4 p1, 0x0

    throw p1
.end method
