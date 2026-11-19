# RE note 本类字节码直接引用的读写或显示接口包括JSON。
.class public final Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll8/s;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \'2\u00020\u0001:\u0001(B\t\u0008\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\u0008\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ!\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018R\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001d\"\u0004\u0008\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u001c\u0010%\u001a\n $*\u0004\u0018\u00010#0#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&\u00a8\u0006)"
    }
    d2 = {
        "Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;",
        "Ll8/s;",
        "<init>",
        "()V",
        "Ll8/y;",
        "response",
        "Ll8/s$a;",
        "chain",
        "refreshTokenAndContinueRequest",
        "(Ll8/y;Ll8/s$a;)Ll8/y;",
        "",
        "jsonStr",
        "Lcom/zykj/http/bean/ApiResp;",
        "Lcom/google/gson/JsonElement;",
        "parseJson",
        "(Ljava/lang/String;)Lcom/zykj/http/bean/ApiResp;",
        "intercept",
        "(Ll8/s$a;)Ll8/y;",
        "Lcom/zykj/http/bean/HeaderLiveData;",
        "headerLiveData",
        "Lcom/zykj/http/bean/HeaderLiveData;",
        "getHeaderLiveData",
        "()Lcom/zykj/http/bean/HeaderLiveData;",
        "setHeaderLiveData",
        "(Lcom/zykj/http/bean/HeaderLiveData;)V",
        "Lz5/a;",
        "refreshRepository",
        "Lz5/a;",
        "getRefreshRepository",
        "()Lz5/a;",
        "setRefreshRepository",
        "(Lz5/a;)V",
        "Lcom/google/gson/Gson;",
        "json",
        "Lcom/google/gson/Gson;",
        "Ljava/lang/reflect/Type;",
        "kotlin.jvm.PlatformType",
        "type",
        "Ljava/lang/reflect/Type;",
        "Companion",
        "a",
        "http_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor$a;

.field private static final TAG:Ljava/lang/String;


# instance fields
.field public headerLiveData:Lcom/zykj/http/bean/HeaderLiveData;

.field private final json:Lcom/google/gson/Gson;

.field public refreshRepository:Lz5/a;

.field private final type:Ljava/lang/reflect/Type;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;->Companion:Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor$a;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "this::class.java.name"

    .line 18
    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;->TAG:Ljava/lang/String;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/google/gson/GsonBuilder;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/google/gson/GsonBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/gson/GsonBuilder;->setPrettyPrinting()Lcom/google/gson/GsonBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lcom/google/gson/GsonBuilder;->disableHtmlEscaping()Lcom/google/gson/GsonBuilder;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create()"

    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;->json:Lcom/google/gson/Gson;

    .line 27
    .line 28
    new-instance v0, Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor$type$1;

    .line 29
    .line 30
    invoke-direct {v0}, Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor$type$1;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iput-object v0, p0, Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;->type:Ljava/lang/reflect/Type;

    .line 38
    .line 39
    return-void
.end method

.method public static final synthetic access$getTAG$cp()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;->TAG:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
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
    iget-object v0, p0, Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;->json:Lcom/google/gson/Gson;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;->type:Ljava/lang/reflect/Type;

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

.method private final refreshTokenAndContinueRequest(Ll8/y;Ll8/s$a;)Ll8/y;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ll8/y;->a()Ll8/z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_1

    .line 9
    .line 10
    :cond_0
    invoke-virtual {v0}, Ll8/z;->string()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-direct {p0, v0}, Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;->parseJson(Ljava/lang/String;)Lcom/zykj/http/bean/ApiResp;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    sget-object v2, Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;->TAG:Ljava/lang/String;

    .line 22
    .line 23
    const-string v3, "apiResp"

    .line 24
    .line 25
    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/zykj/http/bean/ApiResp;->getError()Lcom/zykj/http/bean/ErrorInfo;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    move-object v0, v1

    .line 35
    goto :goto_0

    .line 36
    :cond_2
    invoke-virtual {v0}, Lcom/zykj/http/bean/ErrorInfo;->getMessage()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :goto_0
    const-string v3, "CurrentUserDidNotLoginToTheApplication"

    .line 41
    .line 42
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_4

    .line 47
    .line 48
    const-string v0, "token expire"

    .line 49
    .line 50
    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    invoke-interface {p2}, Ll8/s$a;->a()Ll8/w;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Ll8/w;->h()Ll8/w$a;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    new-instance v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 62
    .line 63
    invoke-direct {v3}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 64
    .line 65
    .line 66
    const-string v4, ""

    .line 67
    .line 68
    iput-object v4, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 69
    .line 70
    new-instance v4, Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor$refreshTokenAndContinueRequest$1$1$1;

    .line 71
    .line 72
    invoke-direct {v4, v3, p0, v1}, Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor$refreshTokenAndContinueRequest$1$1$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;Lkotlin/coroutines/Continuation;)V

    .line 73
    .line 74
    .line 75
    const/4 v5, 0x1

    .line 76
    invoke-static {v1, v4, v5, v1}, Lkotlinx/coroutines/BuildersKt;->runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    iget-object v4, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v4, Ljava/lang/CharSequence;

    .line 82
    .line 83
    invoke-static {v4}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-eqz v4, :cond_3

    .line 88
    .line 89
    const-string p1, "token is null"

    .line 90
    .line 91
    invoke-static {v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    return-object v1

    .line 95
    :cond_3
    const-string v1, "Bearer "

    .line 96
    .line 97
    iget-object v3, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 98
    .line 99
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    const-string v3, "Authorization"

    .line 104
    .line 105
    invoke-virtual {v0, v3, v1}, Ll8/w$a;->h(Ljava/lang/String;Ljava/lang/String;)Ll8/w$a;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Ll8/w$a;->b()Ll8/w;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    const-string v1, "new request header="

    .line 113
    .line 114
    invoke-virtual {v0}, Ll8/w;->e()Ll8/q;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1}, Ll8/y;->close()V

    .line 126
    .line 127
    .line 128
    invoke-interface {p2, v0}, Ll8/s$a;->b(Ll8/w;)Ll8/y;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    return-object p1

    .line 133
    :cond_4
    :goto_1
    return-object v1
.end method


# virtual methods
.method public final getHeaderLiveData()Lcom/zykj/http/bean/HeaderLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;->headerLiveData:Lcom/zykj/http/bean/HeaderLiveData;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "headerLiveData"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
.end method

.method public final getRefreshRepository()Lz5/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;->refreshRepository:Lz5/a;

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
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
.end method

.method public intercept(Ll8/s$a;)Ll8/y;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/zykj/http/exception/RemoteCodeException;
        }
    .end annotation

    .line 1
    const-string v0, "chain"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ll8/s$a;->a()Ll8/w;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {p1, v0}, Ll8/s$a;->b(Ll8/w;)Ll8/y;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ll8/y;->i()I

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
    sget-object v1, Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;->TAG:Ljava/lang/String;

    .line 23
    .line 24
    new-instance v3, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string v4, "url="

    .line 30
    .line 31
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-interface {p1}, Ll8/s$a;->a()Ll8/w;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v4}, Ll8/w;->j()Ll8/r;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v4, " header="

    .line 46
    .line 47
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-interface {p1}, Ll8/s$a;->a()Ll8/w;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-virtual {v4}, Ll8/w;->e()Ll8/q;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-static {v1, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    invoke-direct {p0, v0, p1}, Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;->refreshTokenAndContinueRequest(Ll8/y;Ll8/s$a;)Ll8/y;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    if-nez v1, :cond_0

    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;->getHeaderLiveData()Lcom/zykj/http/bean/HeaderLiveData;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v1}, Lcom/zykj/http/bean/HeaderLiveData;->getUnauthorized()Landroidx/lifecycle/MutableLiveData;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    sget-object v2, Lcom/zykj/lib/error/code/ErrorCode;->NET_TOKEN_ERROR:Lcom/zykj/lib/error/code/ErrorCode;

    .line 83
    .line 84
    invoke-virtual {v1, v2}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Ll8/y;->close()V

    .line 88
    .line 89
    .line 90
    invoke-interface {p1}, Ll8/s$a;->a()Ll8/w;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-interface {p1, v0}, Ll8/s$a;->b(Ll8/w;)Ll8/y;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    return-object p1

    .line 99
    :cond_0
    move-object v0, v1

    .line 100
    :cond_1
    invoke-virtual {v0}, Ll8/y;->i()I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-ne p1, v2, :cond_2

    .line 105
    .line 106
    invoke-virtual {p0}, Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;->getHeaderLiveData()Lcom/zykj/http/bean/HeaderLiveData;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {p1}, Lcom/zykj/http/bean/HeaderLiveData;->getUnauthorized()Landroidx/lifecycle/MutableLiveData;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    sget-object v1, Lcom/zykj/lib/error/code/ErrorCode;->NET_TOKEN_ERROR:Lcom/zykj/lib/error/code/ErrorCode;

    .line 115
    .line 116
    invoke-virtual {p1, v1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    :cond_2
    return-object v0
.end method

.method public final setHeaderLiveData(Lcom/zykj/http/bean/HeaderLiveData;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;->headerLiveData:Lcom/zykj/http/bean/HeaderLiveData;

    .line 7
    .line 8
    return-void
.end method

.method public final setRefreshRepository(Lz5/a;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;->refreshRepository:Lz5/a;

    .line 7
    .line 8
    return-void
.end method
