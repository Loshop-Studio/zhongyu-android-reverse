.class public Lcom/lzy/okgo/exception/OkGoException;
.super Ljava/lang/Exception;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a()Lcom/lzy/okgo/exception/OkGoException;
    .locals 2

    .line 1
    new-instance v0, Lcom/lzy/okgo/exception/OkGoException;

    .line 2
    .line 3
    const-string v1, "breakpoint file has expired!"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/lzy/okgo/exception/OkGoException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static c()Lcom/lzy/okgo/exception/OkGoException;
    .locals 2

    .line 1
    new-instance v0, Lcom/lzy/okgo/exception/OkGoException;

    .line 2
    .line 3
    const-string v1, "breakpoint file does not exist!"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/lzy/okgo/exception/OkGoException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static d()Lcom/lzy/okgo/exception/OkGoException;
    .locals 2

    .line 1
    new-instance v0, Lcom/lzy/okgo/exception/OkGoException;

    .line 2
    .line 3
    const-string v1, "unknown exception!"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/lzy/okgo/exception/OkGoException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
