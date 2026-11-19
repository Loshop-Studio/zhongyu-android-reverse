.class public Lcom/lzy/okgo/exception/HttpException;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a()Lcom/lzy/okgo/exception/HttpException;
    .locals 2

    .line 1
    new-instance v0, Lcom/lzy/okgo/exception/HttpException;

    .line 2
    .line 3
    const-string v1, "network error! http response code is 404 or 5xx!"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/lzy/okgo/exception/HttpException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
