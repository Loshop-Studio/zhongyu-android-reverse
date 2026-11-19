# RE note 本类字节码直接引用的读写或显示接口包括JSON。
.class public final Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li9/x;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor$a;
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final CONTENT_TYPE_JSON:Ljava/lang/String; = "application/json"

.field public static final Companion:Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor$a;


# instance fields
.field private final json:Lcom/google/gson/Gson;

.field private refreshRepository:Li3/a;

.field private final type:Ljava/lang/reflect/Type;

.field private unauthorizedFlow:Ll8/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll8/g;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor;->Companion:Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor;->$stable:I

    return-void
.end method

.method public constructor <init>(Ll8/g;Li3/a;)V
    .locals 1
    .param p1    # Ll8/g;
        .annotation runtime Lcom/zykj/http/annotation/UnauthorizedFlow;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll8/g;",
            "Li3/a;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .line 1
    const-string v0, "unauthorizedFlow"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "refreshRepository"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor;->unauthorizedFlow:Ll8/g;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor;->refreshRepository:Li3/a;

    .line 17
    .line 18
    new-instance p1, Lcom/google/gson/GsonBuilder;

    .line 19
    .line 20
    invoke-direct {p1}, Lcom/google/gson/GsonBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/google/gson/GsonBuilder;->setPrettyPrinting()Lcom/google/gson/GsonBuilder;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Lcom/google/gson/GsonBuilder;->disableHtmlEscaping()Lcom/google/gson/GsonBuilder;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const-string p2, "create(...)"

    .line 36
    .line 37
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor;->json:Lcom/google/gson/Gson;

    .line 41
    .line 42
    new-instance p1, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor$b;

    .line 43
    .line 44
    invoke-direct {p1}, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor$b;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iput-object p1, p0, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor;->type:Ljava/lang/reflect/Type;

    .line 52
    .line 53
    return-void
.end method

# RE I/O 读取 JSON（Gson.fromJson）。
.method private final parseJson(Ljava/lang/String;)Lcom/zykj/http/bean/ApiResp;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/zykj/http/bean/ApiResp<",
            "Lcom/google/gson/JsonElement;",
            ">;"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor;->json:Lcom/google/gson/Gson;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor;->type:Ljava/lang/reflect/Type;

    .line 4
    .line 5
    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/zykj/http/bean/ApiResp;
    :try_end_0
    .catch Lcom/google/gson/JsonParseException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    return-object p1

    .line 12
    :catch_0
    move-exception p1

    .line 13
    goto :goto_0

    .line 14
    :catch_1
    move-exception p1

    .line 15
    goto :goto_1

    .line 16
    :catch_2
    move-exception p1

    .line 17
    goto :goto_2

    .line 18
    :goto_0
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 19
    .line 20
    sget-object v1, Lcom/zykj/lib/error/code/ErrorCode;->CLASS_CAST_FAIL:Lcom/zykj/lib/error/code/ErrorCode;

    .line 21
    .line 22
    invoke-direct {v0, v1, p1}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :goto_1
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 27
    .line 28
    sget-object v1, Lcom/zykj/lib/error/code/ErrorCode;->ARGUMENT_SERIAL_FAIL:Lcom/zykj/lib/error/code/ErrorCode;

    .line 29
    .line 30
    invoke-direct {v0, v1, p1}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    throw v0

    .line 34
    :goto_2
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 35
    .line 36
    sget-object v1, Lcom/zykj/lib/error/code/ErrorCode;->JSON_PARSE_FAIL:Lcom/zykj/lib/error/code/ErrorCode;

    .line 37
    .line 38
    invoke-direct {v0, v1, p1}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    throw v0
.end method

# RE I/O 写入 JSON（Gson.toJson）。
.method private final reBuildResponse(Lcom/zykj/http/bean/ApiResp;)Li9/e0;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/http/bean/ApiResp<",
            "Lcom/google/gson/JsonElement;",
            ">;)",
            "Li9/e0;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/zykj/http/bean/ApiResp;->getCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/zykj/http/bean/ApiResp;->getResult()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "application/json"

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/zykj/http/bean/ApiResp;->getResult()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    check-cast v0, Lcom/google/gson/JsonElement;

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/google/gson/JsonElement;->isJsonPrimitive()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    sget-object v0, Li9/e0;->Companion:Li9/e0$b;

    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/zykj/http/bean/ApiResp;->getResult()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    check-cast p1, Lcom/google/gson/JsonElement;

    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const-string v2, "getAsString(...)"

    .line 46
    .line 47
    invoke-static {p1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    sget-object v2, Li9/y;->e:Li9/y$a;

    .line 51
    .line 52
    invoke-virtual {v2, v1}, Li9/y$a;->a(Ljava/lang/String;)Li9/y;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v0, p1, v1}, Li9/e0$b;->e(Ljava/lang/String;Li9/y;)Li9/e0;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    return-object p1

    .line 61
    :cond_0
    iget-object v0, p0, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor;->json:Lcom/google/gson/Gson;

    .line 62
    .line 63
    invoke-virtual {p1}, Lcom/zykj/http/bean/ApiResp;->getResult()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    check-cast p1, Lcom/google/gson/JsonElement;

    .line 68
    .line 69
    invoke-virtual {v0, p1}, Lcom/google/gson/Gson;->toJson(Lcom/google/gson/JsonElement;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    sget-object v0, Li9/e0;->Companion:Li9/e0$b;

    .line 74
    .line 75
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    sget-object v2, Li9/y;->e:Li9/y$a;

    .line 79
    .line 80
    invoke-virtual {v2, v1}, Li9/y$a;->a(Ljava/lang/String;)Li9/y;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v0, p1, v1}, Li9/e0$b;->e(Ljava/lang/String;Li9/y;)Li9/e0;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    return-object p1

    .line 89
    :cond_1
    sget-object p1, Li9/e0;->Companion:Li9/e0$b;

    .line 90
    .line 91
    iget-object v0, p0, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor;->json:Lcom/google/gson/Gson;

    .line 92
    .line 93
    const-string v2, ""

    .line 94
    .line 95
    invoke-virtual {v0, v2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    const-string v2, "toJson(...)"

    .line 100
    .line 101
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    sget-object v2, Li9/y;->e:Li9/y$a;

    .line 105
    .line 106
    invoke-virtual {v2, v1}, Li9/y$a;->a(Ljava/lang/String;)Li9/y;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {p1, v0, v1}, Li9/e0$b;->e(Ljava/lang/String;Li9/y;)Li9/e0;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    return-object p1

    .line 115
    :cond_2
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 116
    .line 117
    new-instance v1, Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 118
    .line 119
    invoke-virtual {p1}, Lcom/zykj/http/bean/ApiResp;->getCode()I

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    invoke-virtual {p1}, Lcom/zykj/http/bean/ApiResp;->getMsg()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    const/4 v6, 0x4

    .line 128
    const/4 v7, 0x0

    .line 129
    const-string v3, "\u8bf7\u6c42\u5931\u8d25"

    .line 130
    .line 131
    const/4 v4, 0x0

    .line 132
    invoke-direct/range {v1 .. v7}, Lcom/zykj/lib/error/code/ErrorCodeInfo;-><init>(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 133
    .line 134
    .line 135
    invoke-direct {v0, v1}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCodeInfo;)V

    .line 136
    .line 137
    .line 138
    throw v0
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
    new-instance v2, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor$refreshTokenAndContinueRequest$1;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-direct {v2, v1, p0, p1, v3}, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor$refreshTokenAndContinueRequest$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor;Li9/x$a;Lm7/c;)V

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
    iget-object v0, p0, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor;->refreshRepository:Li3/a;

    .line 2
    .line 3
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
    iget-object v0, p0, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor;->unauthorizedFlow:Ll8/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public intercept(Li9/x$a;)Li9/d0;
    .locals 5

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
    if-ne v1, v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0}, Li9/d0;->close()V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, p1}, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor;->refreshTokenAndContinueRequest(Li9/x$a;)Li9/d0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object v0, p0, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor;->unauthorizedFlow:Ll8/g;

    .line 33
    .line 34
    sget-object v1, Lcom/zykj/lib/error/code/ErrorCode;->NET_TOKEN_ERROR:Lcom/zykj/lib/error/code/ErrorCode;

    .line 35
    .line 36
    invoke-interface {v0, v1}, Ll8/g;->a(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    invoke-interface {p1}, Li9/x$a;->a()Li9/b0;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {p1, v0}, Li9/x$a;->b(Li9/b0;)Li9/d0;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1

    .line 48
    :cond_1
    :goto_0
    invoke-virtual {v0}, Li9/d0;->f()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-ne p1, v2, :cond_2

    .line 53
    .line 54
    iget-object p1, p0, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor;->unauthorizedFlow:Ll8/g;

    .line 55
    .line 56
    sget-object v1, Lcom/zykj/lib/error/code/ErrorCode;->NET_TOKEN_ERROR:Lcom/zykj/lib/error/code/ErrorCode;

    .line 57
    .line 58
    invoke-interface {p1, v1}, Ll8/g;->a(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    :cond_2
    invoke-virtual {v0}, Li9/d0;->m()Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    invoke-virtual {v0}, Li9/d0;->b()Li9/e0;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p1}, Li9/e0;->contentType()Li9/y;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 80
    .line 81
    const-string v2, "ROOT"

    .line 82
    .line 83
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    const-string v1, "toLowerCase(...)"

    .line 91
    .line 92
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    const/4 v1, 0x2

    .line 96
    const/4 v2, 0x0

    .line 97
    const-string v3, "application/json"

    .line 98
    .line 99
    const/4 v4, 0x0

    .line 100
    invoke-static {p1, v3, v4, v1, v2}, Lg8/c0;->S(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_4

    .line 105
    .line 106
    invoke-virtual {v0}, Li9/d0;->b()Li9/e0;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {p1}, Li9/e0;->string()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-direct {p0, p1}, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor;->parseJson(Ljava/lang/String;)Lcom/zykj/http/bean/ApiResp;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    if-eqz p1, :cond_3

    .line 119
    .line 120
    invoke-direct {p0, p1}, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor;->reBuildResponse(Lcom/zykj/http/bean/ApiResp;)Li9/e0;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-virtual {v0}, Li9/d0;->p()Li9/d0$a;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {v0, p1}, Li9/d0$a;->b(Li9/e0;)Li9/d0$a;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-virtual {p1}, Li9/d0$a;->c()Li9/d0;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    return-object p1

    .line 137
    :cond_3
    new-instance p1, Lcom/zykj/http/exception/RemoteCodeException;

    .line 138
    .line 139
    sget-object v0, Lcom/zykj/lib/error/code/ErrorCode;->NET_RESPONSE_NULL:Lcom/zykj/lib/error/code/ErrorCode;

    .line 140
    .line 141
    invoke-direct {p1, v0}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;)V

    .line 142
    .line 143
    .line 144
    throw p1

    .line 145
    :cond_4
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
    iput-object p1, p0, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor;->refreshRepository:Li3/a;

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
    iput-object p1, p0, Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor;->unauthorizedFlow:Ll8/g;

    .line 7
    .line 8
    return-void
.end method
