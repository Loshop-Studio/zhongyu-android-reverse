.class public final Lcom/zykj/base/utils/ExceptionHandle;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0002\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0008\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/zykj/base/utils/ExceptionHandle;",
        "",
        "<init>",
        "()V",
        "handleException",
        "Lcom/zykj/http/exception/RemoteCodeException;",
        "e",
        "",
        "caseRemoteCodeException",
        "base_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/zykj/base/utils/ExceptionHandle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/base/utils/ExceptionHandle;

    invoke-direct {v0}, Lcom/zykj/base/utils/ExceptionHandle;-><init>()V

    sput-object v0, Lcom/zykj/base/utils/ExceptionHandle;->INSTANCE:Lcom/zykj/base/utils/ExceptionHandle;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final caseRemoteCodeException(Ljava/lang/Throwable;)Lcom/zykj/http/exception/RemoteCodeException;
    .locals 2

    .line 1
    const-string v0, "e"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lcom/zykj/http/exception/RemoteCodeException;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p1, Lcom/zykj/http/exception/RemoteCodeException;

    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_0
    instance-of v0, p1, Lretrofit2/HttpException;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 18
    .line 19
    sget-object v1, Lcom/zykj/lib/error/code/ErrorCodeHandler;->INSTANCE:Lcom/zykj/lib/error/code/ErrorCodeHandler;

    .line 20
    .line 21
    check-cast p1, Lretrofit2/HttpException;

    .line 22
    .line 23
    invoke-virtual {p1}, Lretrofit2/HttpException;->a()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-virtual {v1, p1}, Lcom/zykj/lib/error/code/ErrorCodeHandler;->getErrorCode(I)Lcom/zykj/lib/error/code/ErrorCode;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-direct {v0, p1}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;)V

    .line 32
    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_1
    instance-of v0, p1, Ljava/net/ConnectException;

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    new-instance p1, Lcom/zykj/http/exception/RemoteCodeException;

    .line 40
    .line 41
    sget-object v0, Lcom/zykj/lib/error/code/ErrorCode;->NET_NO_CONNECT:Lcom/zykj/lib/error/code/ErrorCode;

    .line 42
    .line 43
    invoke-direct {p1, v0}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;)V

    .line 44
    .line 45
    .line 46
    return-object p1

    .line 47
    :cond_2
    instance-of v0, p1, Ljava/net/SocketTimeoutException;

    .line 48
    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    new-instance p1, Lcom/zykj/http/exception/RemoteCodeException;

    .line 52
    .line 53
    sget-object v0, Lcom/zykj/lib/error/code/ErrorCode;->NET_SOCKET_TIME_OUT:Lcom/zykj/lib/error/code/ErrorCode;

    .line 54
    .line 55
    invoke-direct {p1, v0}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;)V

    .line 56
    .line 57
    .line 58
    return-object p1

    .line 59
    :cond_3
    instance-of v0, p1, Ljava/net/UnknownHostException;

    .line 60
    .line 61
    if-eqz v0, :cond_4

    .line 62
    .line 63
    new-instance p1, Lcom/zykj/http/exception/RemoteCodeException;

    .line 64
    .line 65
    sget-object v0, Lcom/zykj/lib/error/code/ErrorCode;->NET_NO_CONNECT:Lcom/zykj/lib/error/code/ErrorCode;

    .line 66
    .line 67
    invoke-direct {p1, v0}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;)V

    .line 68
    .line 69
    .line 70
    return-object p1

    .line 71
    :cond_4
    instance-of v0, p1, Lcom/google/gson/JsonParseException;

    .line 72
    .line 73
    if-nez v0, :cond_6

    .line 74
    .line 75
    instance-of v0, p1, Lorg/json/JSONException;

    .line 76
    .line 77
    if-nez v0, :cond_6

    .line 78
    .line 79
    instance-of v0, p1, Landroid/net/ParseException;

    .line 80
    .line 81
    if-eqz v0, :cond_5

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_5
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 85
    .line 86
    sget-object v1, Lcom/zykj/lib/error/code/ErrorCode;->DEFAULT_ERROR:Lcom/zykj/lib/error/code/ErrorCode;

    .line 87
    .line 88
    invoke-direct {v0, v1, p1}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    return-object v0

    .line 92
    :cond_6
    :goto_0
    new-instance p1, Lcom/zykj/http/exception/RemoteCodeException;

    .line 93
    .line 94
    sget-object v0, Lcom/zykj/lib/error/code/ErrorCode;->JSON_PARSE_FAIL:Lcom/zykj/lib/error/code/ErrorCode;

    .line 95
    .line 96
    invoke-direct {p1, v0}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;)V

    .line 97
    .line 98
    .line 99
    return-object p1
.end method

.method public final handleException(Ljava/lang/Throwable;)Lcom/zykj/http/exception/RemoteCodeException;
    .locals 1

    .line 1
    const-string v0, "e"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Ljava/lang/reflect/UndeclaredThrowableException;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p1

    .line 11
    check-cast v0, Ljava/lang/reflect/UndeclaredThrowableException;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/reflect/UndeclaredThrowableException;->getCause()Ljava/lang/Throwable;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sget-object p1, Lcom/zykj/base/utils/ExceptionHandle;->INSTANCE:Lcom/zykj/base/utils/ExceptionHandle;

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Lcom/zykj/base/utils/ExceptionHandle;->caseRemoteCodeException(Ljava/lang/Throwable;)Lcom/zykj/http/exception/RemoteCodeException;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    :cond_0
    invoke-virtual {p0, p1}, Lcom/zykj/base/utils/ExceptionHandle;->caseRemoteCodeException(Ljava/lang/Throwable;)Lcom/zykj/http/exception/RemoteCodeException;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1
.end method
