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
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/base/utils/ExceptionHandle;

    invoke-direct {v0}, Lcom/zykj/base/utils/ExceptionHandle;-><init>()V

    sput-object v0, Lcom/zykj/base/utils/ExceptionHandle;->INSTANCE:Lcom/zykj/base/utils/ExceptionHandle;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "ExceptionHandle"

    .line 11
    .line 12
    invoke-static {v1, v0}, Lcom/tencent/mars/xlog/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

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
    goto :goto_3

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
    :goto_0
    move-object p1, v0

    .line 44
    goto :goto_3

    .line 45
    :cond_1
    instance-of v0, p1, Ljava/net/ConnectException;

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    new-instance p1, Lcom/zykj/http/exception/RemoteCodeException;

    .line 50
    .line 51
    sget-object v0, Lcom/zykj/lib/error/code/ErrorCode;->NET_NO_CONNECT:Lcom/zykj/lib/error/code/ErrorCode;

    .line 52
    .line 53
    invoke-direct {p1, v0}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;)V

    .line 54
    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_2
    instance-of v0, p1, Ljava/net/SocketTimeoutException;

    .line 58
    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    new-instance p1, Lcom/zykj/http/exception/RemoteCodeException;

    .line 62
    .line 63
    sget-object v0, Lcom/zykj/lib/error/code/ErrorCode;->NET_SOCKET_TIME_OUT:Lcom/zykj/lib/error/code/ErrorCode;

    .line 64
    .line 65
    invoke-direct {p1, v0}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;)V

    .line 66
    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_3
    instance-of v0, p1, Ljava/net/UnknownHostException;

    .line 70
    .line 71
    if-eqz v0, :cond_4

    .line 72
    .line 73
    new-instance p1, Lcom/zykj/http/exception/RemoteCodeException;

    .line 74
    .line 75
    sget-object v0, Lcom/zykj/lib/error/code/ErrorCode;->NET_NO_CONNECT:Lcom/zykj/lib/error/code/ErrorCode;

    .line 76
    .line 77
    invoke-direct {p1, v0}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;)V

    .line 78
    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_4
    instance-of v0, p1, Lcom/google/gson/JsonParseException;

    .line 82
    .line 83
    const/4 v1, 0x1

    .line 84
    if-eqz v0, :cond_5

    .line 85
    .line 86
    move v0, v1

    .line 87
    goto :goto_1

    .line 88
    :cond_5
    instance-of v0, p1, Lorg/json/JSONException;

    .line 89
    .line 90
    :goto_1
    if-eqz v0, :cond_6

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_6
    instance-of v1, p1, Landroid/net/ParseException;

    .line 94
    .line 95
    :goto_2
    if-eqz v1, :cond_7

    .line 96
    .line 97
    new-instance p1, Lcom/zykj/http/exception/RemoteCodeException;

    .line 98
    .line 99
    sget-object v0, Lcom/zykj/lib/error/code/ErrorCode;->JSON_PARSE_FAIL:Lcom/zykj/lib/error/code/ErrorCode;

    .line 100
    .line 101
    invoke-direct {p1, v0}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;)V

    .line 102
    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_7
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 106
    .line 107
    sget-object v1, Lcom/zykj/lib/error/code/ErrorCode;->DEFAULT_ERROR:Lcom/zykj/lib/error/code/ErrorCode;

    .line 108
    .line 109
    invoke-direct {v0, v1, p1}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :goto_3
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
