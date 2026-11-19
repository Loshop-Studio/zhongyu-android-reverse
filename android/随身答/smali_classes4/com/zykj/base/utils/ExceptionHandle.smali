.class public final Lcom/zykj/base/utils/ExceptionHandle;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0002\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/zykj/base/utils/ExceptionHandle;",
        "",
        "()V",
        "caseRemoteCodeException",
        "Lcom/zykj/http/exception/RemoteCodeException;",
        "e",
        "",
        "handleException",
        "base_release"
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
    const-string v0, "ExceptionHandle"

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v0, v1}, Lcom/tencent/mars/xlog/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    instance-of v0, p1, Lcom/zykj/http/exception/RemoteCodeException;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    check-cast p1, Lcom/zykj/http/exception/RemoteCodeException;

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    instance-of v0, p1, Lretrofit2/HttpException;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 27
    .line 28
    sget-object v1, Lcom/zykj/lib/error/code/ErrorCodeHandler;->INSTANCE:Lcom/zykj/lib/error/code/ErrorCodeHandler;

    .line 29
    .line 30
    check-cast p1, Lretrofit2/HttpException;

    .line 31
    .line 32
    invoke-virtual {p1}, Lretrofit2/HttpException;->a()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    invoke-virtual {v1, p1}, Lcom/zykj/lib/error/code/ErrorCodeHandler;->getErrorCode(I)Lcom/zykj/lib/error/code/ErrorCode;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-direct {v0, p1}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;)V

    .line 41
    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_1
    instance-of v0, p1, Ljava/net/ConnectException;

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    new-instance p1, Lcom/zykj/http/exception/RemoteCodeException;

    .line 49
    .line 50
    sget-object v0, Lcom/zykj/lib/error/code/ErrorCode;->NET_NO_CONNECT:Lcom/zykj/lib/error/code/ErrorCode;

    .line 51
    .line 52
    invoke-direct {p1, v0}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;)V

    .line 53
    .line 54
    .line 55
    return-object p1

    .line 56
    :cond_2
    instance-of v0, p1, Ljava/net/SocketTimeoutException;

    .line 57
    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    new-instance p1, Lcom/zykj/http/exception/RemoteCodeException;

    .line 61
    .line 62
    sget-object v0, Lcom/zykj/lib/error/code/ErrorCode;->NET_SOCKET_TIME_OUT:Lcom/zykj/lib/error/code/ErrorCode;

    .line 63
    .line 64
    invoke-direct {p1, v0}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;)V

    .line 65
    .line 66
    .line 67
    return-object p1

    .line 68
    :cond_3
    instance-of v0, p1, Ljava/net/UnknownHostException;

    .line 69
    .line 70
    if-eqz v0, :cond_4

    .line 71
    .line 72
    new-instance p1, Lcom/zykj/http/exception/RemoteCodeException;

    .line 73
    .line 74
    sget-object v0, Lcom/zykj/lib/error/code/ErrorCode;->NET_NO_CONNECT:Lcom/zykj/lib/error/code/ErrorCode;

    .line 75
    .line 76
    invoke-direct {p1, v0}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;)V

    .line 77
    .line 78
    .line 79
    return-object p1

    .line 80
    :cond_4
    instance-of v0, p1, Lcom/google/gson/JsonParseException;

    .line 81
    .line 82
    const/4 v1, 0x1

    .line 83
    if-eqz v0, :cond_5

    .line 84
    .line 85
    move v0, v1

    .line 86
    goto :goto_0

    .line 87
    :cond_5
    instance-of v0, p1, Lorg/json/JSONException;

    .line 88
    .line 89
    :goto_0
    if-eqz v0, :cond_6

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_6
    instance-of v1, p1, Landroid/net/ParseException;

    .line 93
    .line 94
    :goto_1
    if-eqz v1, :cond_7

    .line 95
    .line 96
    new-instance p1, Lcom/zykj/http/exception/RemoteCodeException;

    .line 97
    .line 98
    sget-object v0, Lcom/zykj/lib/error/code/ErrorCode;->JSON_PARSE_FAIL:Lcom/zykj/lib/error/code/ErrorCode;

    .line 99
    .line 100
    invoke-direct {p1, v0}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;)V

    .line 101
    .line 102
    .line 103
    return-object p1

    .line 104
    :cond_7
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 105
    .line 106
    sget-object v1, Lcom/zykj/lib/error/code/ErrorCode;->DEFAULT_ERROR:Lcom/zykj/lib/error/code/ErrorCode;

    .line 107
    .line 108
    invoke-direct {v0, v1, p1}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V

    .line 109
    .line 110
    .line 111
    return-object v0
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
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    sget-object p1, Lcom/zykj/base/utils/ExceptionHandle;->INSTANCE:Lcom/zykj/base/utils/ExceptionHandle;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Lcom/zykj/base/utils/ExceptionHandle;->caseRemoteCodeException(Ljava/lang/Throwable;)Lcom/zykj/http/exception/RemoteCodeException;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Lcom/zykj/base/utils/ExceptionHandle;->caseRemoteCodeException(Ljava/lang/Throwable;)Lcom/zykj/http/exception/RemoteCodeException;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
.end method
