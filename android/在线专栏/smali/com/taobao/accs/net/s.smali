.class Lcom/taobao/accs/net/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lanet/channel/RequestCb;


# instance fields
.field final synthetic a:Lanet/channel/IAuth$AuthCallback;

.field final synthetic b:Lcom/taobao/accs/net/j$a;


# direct methods
.method constructor <init>(Lcom/taobao/accs/net/j$a;Lanet/channel/IAuth$AuthCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/taobao/accs/net/s;->b:Lcom/taobao/accs/net/j$a;

    iput-object p2, p0, Lcom/taobao/accs/net/s;->a:Lanet/channel/IAuth$AuthCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDataReceive(Lanet/channel/bytes/ByteArray;Z)V
    .locals 0

    return-void
.end method

.method public onFinish(ILjava/lang/String;Lanet/channel/statist/RequestStatistic;)V
    .locals 2

    if-gez p1, :cond_0

    .line 1
    iget-object p2, p0, Lcom/taobao/accs/net/s;->b:Lcom/taobao/accs/net/j$a;

    invoke-static {p2}, Lcom/taobao/accs/net/j$a;->a(Lcom/taobao/accs/net/j$a;)Lcom/alibaba/sdk/android/logger/ILog;

    move-result-object p2

    const/4 p3, 0x3

    new-array p3, p3, [Ljava/lang/Object;

    const/4 v0, 0x0

    const-string v1, "auth onFinish"

    aput-object v1, p3, v0

    const/4 v0, 0x1

    const-string v1, "statusCode"

    aput-object v1, p3, v0

    const/4 v0, 0x2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, p3, v0

    invoke-interface {p2, p3}, Lcom/alibaba/sdk/android/logger/ILog;->e([Ljava/lang/Object;)V

    .line 2
    iget-object p2, p0, Lcom/taobao/accs/net/s;->a:Lanet/channel/IAuth$AuthCallback;

    const-string p3, "onFinish auth fail"

    invoke-interface {p2, p1, p3}, Lanet/channel/IAuth$AuthCallback;->onAuthFail(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onResponseCode(ILjava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    invoke-static {p2}, Lcom/taobao/accs/utl/UtilityImpl;->a(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p2

    .line 2
    iget-object v0, p0, Lcom/taobao/accs/net/s;->b:Lcom/taobao/accs/net/j$a;

    invoke-static {v0}, Lcom/taobao/accs/net/j$a;->a(Lcom/taobao/accs/net/j$a;)Lcom/alibaba/sdk/android/logger/ILog;

    move-result-object v0

    const/4 v1, 0x3

    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "auth"

    aput-object v4, v2, v3

    const-string v5, "header"

    const/4 v6, 0x1

    aput-object v5, v2, v6

    const/4 v5, 0x2

    aput-object p2, v2, v5

    invoke-interface {v0, v2}, Lcom/alibaba/sdk/android/logger/ILog;->d([Ljava/lang/Object;)V

    const-string v0, "x-at"

    .line 3
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 4
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 5
    iget-object v2, p0, Lcom/taobao/accs/net/s;->b:Lcom/taobao/accs/net/j$a;

    invoke-static {v2}, Lcom/taobao/accs/net/j$a;->b(Lcom/taobao/accs/net/j$a;)Lcom/taobao/accs/net/b;

    move-result-object v2

    iput-object v0, v2, Lcom/taobao/accs/net/b;->k:Ljava/lang/String;

    :cond_0
    const/16 v0, 0xc8

    const-string v2, "httpStatusCode"

    if-ne p1, v0, :cond_1

    .line 6
    iget-object p2, p0, Lcom/taobao/accs/net/s;->b:Lcom/taobao/accs/net/j$a;

    invoke-static {p2}, Lcom/taobao/accs/net/j$a;->a(Lcom/taobao/accs/net/j$a;)Lcom/alibaba/sdk/android/logger/ILog;

    move-result-object p2

    new-array v0, v1, [Ljava/lang/Object;

    aput-object v4, v0, v3

    aput-object v2, v0, v6

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v0, v5

    invoke-interface {p2, v0}, Lcom/alibaba/sdk/android/logger/ILog;->i([Ljava/lang/Object;)V

    .line 7
    iget-object p1, p0, Lcom/taobao/accs/net/s;->a:Lanet/channel/IAuth$AuthCallback;

    invoke-interface {p1}, Lanet/channel/IAuth$AuthCallback;->onAuthSuccess()V

    .line 8
    iget-object p1, p0, Lcom/taobao/accs/net/s;->b:Lcom/taobao/accs/net/j$a;

    invoke-static {p1}, Lcom/taobao/accs/net/j$a;->b(Lcom/taobao/accs/net/j$a;)Lcom/taobao/accs/net/b;

    move-result-object p1

    instance-of p1, p1, Lcom/taobao/accs/net/j;

    if-eqz p1, :cond_2

    .line 9
    iget-object p1, p0, Lcom/taobao/accs/net/s;->b:Lcom/taobao/accs/net/j$a;

    invoke-static {p1}, Lcom/taobao/accs/net/j$a;->b(Lcom/taobao/accs/net/j$a;)Lcom/taobao/accs/net/b;

    move-result-object p1

    check-cast p1, Lcom/taobao/accs/net/j;

    invoke-static {p1}, Lcom/taobao/accs/net/j;->c(Lcom/taobao/accs/net/j;)V

    goto :goto_0

    :cond_1
    const-string v0, "s-accs-retcode"

    .line 10
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 11
    iget-object v0, p0, Lcom/taobao/accs/net/s;->b:Lcom/taobao/accs/net/j$a;

    invoke-static {v0}, Lcom/taobao/accs/net/j$a;->a(Lcom/taobao/accs/net/j$a;)Lcom/alibaba/sdk/android/logger/ILog;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v4, v1, v3

    aput-object v2, v1, v6

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v5

    invoke-interface {v0, v1}, Lcom/alibaba/sdk/android/logger/ILog;->e([Ljava/lang/Object;)V

    .line 12
    invoke-static {}, Lcom/taobao/accs/AccsState;->getInstance()Lcom/taobao/accs/AccsState;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "auth fail "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v1, "re"

    invoke-virtual {v0, v1, p2}, Lcom/taobao/accs/AccsState;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 13
    iget-object p2, p0, Lcom/taobao/accs/net/s;->a:Lanet/channel/IAuth$AuthCallback;

    const-string v0, "auth fail"

    invoke-interface {p2, p1, v0}, Lanet/channel/IAuth$AuthCallback;->onAuthFail(ILjava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method
