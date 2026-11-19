.class public final Li2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Interceptor;


# instance fields
.field private a:Lx2/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/l<",
            "-",
            "Lx2/l<",
            "-",
            "Ljava/lang/String;",
            "Lo2/r;",
            ">;",
            "Lo2/r;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Li2/a$a;->a:Li2/a$a;

    iput-object v0, p0, Li2/a;->a:Lx2/l;

    return-void
.end method


# virtual methods
.method public final a(Lx2/l;)V
    .locals 1
    .param p1    # Lx2/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx2/l<",
            "-",
            "Lx2/l<",
            "-",
            "Ljava/lang/String;",
            "Lo2/r;",
            ">;",
            "Lo2/r;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Li2/a;->a:Lx2/l;

    return-void
.end method

.method public intercept(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
    .locals 11
    .param p1    # Lokhttp3/Interceptor$Chain;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, ""

    const-string v1, "OkHttp"

    const-string v2, "chain"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p1}, Lokhttp3/Interceptor$Chain;->request()Lokhttp3/Request;

    move-result-object v2

    .line 2
    invoke-interface {p1, v2}, Lokhttp3/Interceptor$Chain;->proceed(Lokhttp3/Request;)Lokhttp3/Response;

    move-result-object v3

    .line 3
    invoke-virtual {v3}, Lokhttp3/Response;->code()I

    move-result v4

    const/16 v5, 0x191

    if-ne v4, v5, :cond_9

    .line 4
    invoke-virtual {v3}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v4

    const/4 v6, 0x0

    if-nez v4, :cond_0

    move-object v4, v6

    goto :goto_0

    :cond_0
    invoke-virtual {v4}, Lokhttp3/ResponseBody;->string()Ljava/lang/String;

    move-result-object v4

    .line 5
    :goto_0
    invoke-virtual {v3}, Lokhttp3/Response;->newBuilder()Lokhttp3/Response$Builder;

    move-result-object v7

    if-nez v4, :cond_1

    move-object v3, v6

    goto :goto_2

    .line 6
    :cond_1
    sget-object v8, Lokhttp3/ResponseBody;->Companion:Lokhttp3/ResponseBody$Companion;

    invoke-virtual {v3}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v3

    if-nez v3, :cond_2

    move-object v3, v6

    goto :goto_1

    :cond_2
    invoke-virtual {v3}, Lokhttp3/ResponseBody;->contentType()Lokhttp3/MediaType;

    move-result-object v3

    :goto_1
    invoke-virtual {v8, v4, v3}, Lokhttp3/ResponseBody$Companion;->create(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;

    move-result-object v3

    :goto_2
    invoke-virtual {v7, v3}, Lokhttp3/Response$Builder;->body(Lokhttp3/ResponseBody;)Lokhttp3/Response$Builder;

    move-result-object v3

    .line 7
    invoke-virtual {v3}, Lokhttp3/Response$Builder;->build()Lokhttp3/Response;

    move-result-object v3

    const/4 v7, 0x0

    if-nez v4, :cond_3

    const/4 v4, 0x0

    goto :goto_4

    .line 8
    :cond_3
    :try_start_0
    new-instance v8, Lcom/google/gson/Gson;

    invoke-direct {v8}, Lcom/google/gson/Gson;-><init>()V

    new-instance v9, Ljava/io/StringReader;

    invoke-direct {v9, v4}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    const-class v4, Lcom/zykj/subscriber/entity/resp/ApiResp;

    invoke-virtual {v8, v9, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/zykj/subscriber/entity/resp/ApiResp;

    if-nez v4, :cond_4

    goto :goto_3

    .line 9
    :cond_4
    invoke-virtual {v4}, Lcom/zykj/subscriber/entity/resp/ApiResp;->getErrorMessage()Ljava/lang/String;

    move-result-object v6

    :goto_3
    const-string v4, "CurrentUserDidNotLoginToTheApplication"

    invoke-static {v6, v4}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    :goto_4
    if-eqz v4, :cond_9

    const-string v4, "\u63a5\u53e3\u8fd4\u56de401"

    .line 10
    invoke-static {v1, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 11
    new-instance v4, Lkotlin/jvm/internal/u;

    invoke-direct {v4}, Lkotlin/jvm/internal/u;-><init>()V

    const/4 v6, 0x1

    iput-boolean v6, v4, Lkotlin/jvm/internal/u;->a:Z

    .line 12
    new-instance v8, Lkotlin/jvm/internal/x;

    invoke-direct {v8}, Lkotlin/jvm/internal/x;-><init>()V

    iput-object v0, v8, Lkotlin/jvm/internal/x;->a:Ljava/lang/Object;

    .line 13
    iget-object v9, p0, Li2/a;->a:Lx2/l;

    new-instance v10, Li2/a$b;

    invoke-direct {v10, v8, v4}, Li2/a$b;-><init>(Lkotlin/jvm/internal/x;Lkotlin/jvm/internal/u;)V

    invoke-interface {v9, v10}, Lx2/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    :goto_5
    iget-boolean v9, v4, Lkotlin/jvm/internal/u;->a:Z

    if-eqz v9, :cond_5

    goto :goto_5

    :cond_5
    const-string v4, "\u63a5\u53e3\u91cd\u65b0\u8bf7\u6c42"

    .line 15
    invoke-static {v1, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    iget-object v4, v8, Lkotlin/jvm/internal/x;->a:Ljava/lang/Object;

    check-cast v4, Ljava/lang/CharSequence;

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-lez v4, :cond_6

    const/4 v7, 0x1

    :cond_6
    if-eqz v7, :cond_8

    .line 17
    invoke-virtual {v2}, Lokhttp3/Request;->newBuilder()Lokhttp3/Request$Builder;

    move-result-object v2

    const-string v4, "AppName"

    const-string v6, "Browser"

    .line 18
    invoke-virtual {v2, v4, v6}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object v2

    const-string v4, "AppVersion"

    .line 19
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ld2/b;->a()Landroid/app/Application;

    move-result-object v7

    invoke-static {v7}, Ll2/a;->a(Landroid/content/Context;)I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 20
    invoke-virtual {v2, v4, v0}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object v0

    const-string v2, "Authorization"

    const-string v4, "bearer "

    .line 21
    iget-object v6, v8, Lkotlin/jvm/internal/x;->a:Ljava/lang/Object;

    invoke-static {v4, v6}, Lkotlin/jvm/internal/l;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v2, v4}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object v0

    .line 22
    invoke-virtual {v0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object v0

    .line 23
    invoke-interface {p1, v0}, Lokhttp3/Interceptor$Chain;->proceed(Lokhttp3/Request;)Lokhttp3/Response;

    move-result-object p1

    .line 24
    invoke-virtual {p1}, Lokhttp3/Response;->code()I

    move-result v0

    if-ne v0, v5, :cond_7

    const-string v0, "Token \u5237\u65b0\u6210\u529f\u4f46\u91cd\u8bd5\u8bf7\u6c42\u4ecd\u7136 401\uff0c\u89e6\u53d1\u767b\u51fa\u3002"

    .line 25
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    sget-object v0, Ll2/e;->a:Ll2/e;

    invoke-virtual {v0}, Ll2/e;->b()V

    :cond_7
    return-object p1

    :cond_8
    const-string p1, "Token \u5237\u65b0\u5931\u8d25\uff0c\u89e6\u53d1\u767b\u51fa\u3002"

    .line 27
    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    sget-object p1, Ll2/e;->a:Ll2/e;

    invoke-virtual {p1}, Ll2/e;->b()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_6

    :catch_0
    move-exception p1

    .line 29
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_9
    :goto_6
    return-object v3
.end method
