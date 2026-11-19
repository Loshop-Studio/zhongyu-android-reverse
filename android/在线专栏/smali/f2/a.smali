.class public Lf2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf2/a$a;
    }
.end annotation


# direct methods
.method public static a(Ljava/lang/Throwable;)Lf2/a$a;
    .locals 2

    .line 1
    new-instance v0, Lf2/a$a;

    invoke-direct {v0, p0}, Lf2/a$a;-><init>(Ljava/lang/Throwable;)V

    .line 2
    instance-of v1, p0, Lretrofit2/adapter/rxjava/HttpException;

    if-eqz v1, :cond_1

    .line 3
    check-cast p0, Lretrofit2/adapter/rxjava/HttpException;

    .line 4
    invoke-virtual {p0}, Lretrofit2/HttpException;->code()I

    move-result p0

    const/16 v1, 0x191

    if-eq p0, v1, :cond_0

    const-string p0, "\u7f51\u7edc\u9519\u8bef"

    .line 5
    iput-object p0, v0, Lf2/a$a;->a:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string p0, "\u7528\u6237\u672a\u767b\u5f55"

    .line 6
    iput-object p0, v0, Lf2/a$a;->a:Ljava/lang/String;

    :goto_0
    return-object v0

    .line 7
    :cond_1
    instance-of v1, p0, Lcom/google/gson/JsonParseException;

    if-nez v1, :cond_6

    instance-of v1, p0, Lorg/json/JSONException;

    if-nez v1, :cond_6

    instance-of v1, p0, Landroid/net/ParseException;

    if-eqz v1, :cond_2

    goto :goto_1

    .line 8
    :cond_2
    instance-of v1, p0, Ljava/net/ConnectException;

    if-eqz v1, :cond_3

    const-string p0, "\u8fde\u63a5\u5931\u8d25"

    .line 9
    iput-object p0, v0, Lf2/a$a;->a:Ljava/lang/String;

    return-object v0

    .line 10
    :cond_3
    instance-of v1, p0, Ljava/net/SocketTimeoutException;

    if-eqz v1, :cond_4

    const-string p0, "\u8fde\u63a5\u8d85\u65f6"

    .line 11
    iput-object p0, v0, Lf2/a$a;->a:Ljava/lang/String;

    return-object v0

    .line 12
    :cond_4
    instance-of p0, p0, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz p0, :cond_5

    const-string p0, "\u8bc1\u4e66\u9a8c\u8bc1\u5931\u8d25"

    .line 13
    iput-object p0, v0, Lf2/a$a;->a:Ljava/lang/String;

    return-object v0

    :cond_5
    const-string p0, "\u672a\u77e5\u9519\u8bef"

    .line 14
    iput-object p0, v0, Lf2/a$a;->a:Ljava/lang/String;

    return-object v0

    :cond_6
    :goto_1
    const-string p0, "\u89e3\u6790\u9519\u8bef"

    .line 15
    iput-object p0, v0, Lf2/a$a;->a:Ljava/lang/String;

    return-object v0
.end method
