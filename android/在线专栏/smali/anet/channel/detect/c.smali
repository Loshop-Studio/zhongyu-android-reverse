.class Lanet/channel/detect/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lanet/channel/statist/RequestStatistic;

.field final synthetic b:Lanet/channel/detect/ExceptionDetector;


# direct methods
.method constructor <init>(Lanet/channel/detect/ExceptionDetector;Lanet/channel/statist/RequestStatistic;)V
    .locals 0

    iput-object p1, p0, Lanet/channel/detect/c;->b:Lanet/channel/detect/ExceptionDetector;

    iput-object p2, p0, Lanet/channel/detect/c;->a:Lanet/channel/statist/RequestStatistic;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    :try_start_0
    iget-object v0, p0, Lanet/channel/detect/c;->a:Lanet/channel/statist/RequestStatistic;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, v0, Lanet/channel/statist/RequestStatistic;->ip:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lanet/channel/detect/c;->a:Lanet/channel/statist/RequestStatistic;

    iget v0, v0, Lanet/channel/statist/RequestStatistic;->ret:I

    if-nez v0, :cond_3

    const-string v0, "guide-acs.m.taobao.com"

    .line 3
    iget-object v1, p0, Lanet/channel/detect/c;->a:Lanet/channel/statist/RequestStatistic;

    iget-object v1, v1, Lanet/channel/statist/RequestStatistic;->host:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lanet/channel/detect/c;->b:Lanet/channel/detect/ExceptionDetector;

    iget-object v1, p0, Lanet/channel/detect/c;->a:Lanet/channel/statist/RequestStatistic;

    iget-object v1, v1, Lanet/channel/statist/RequestStatistic;->ip:Ljava/lang/String;

    .line 5
    iput-object v1, v0, Lanet/channel/detect/ExceptionDetector;->b:Ljava/lang/String;

    goto :goto_0

    :cond_1
    const-string v0, "msgacs.m.taobao.com"

    .line 6
    iget-object v1, p0, Lanet/channel/detect/c;->a:Lanet/channel/statist/RequestStatistic;

    iget-object v1, v1, Lanet/channel/statist/RequestStatistic;->host:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 7
    iget-object v0, p0, Lanet/channel/detect/c;->b:Lanet/channel/detect/ExceptionDetector;

    iget-object v1, p0, Lanet/channel/detect/c;->a:Lanet/channel/statist/RequestStatistic;

    iget-object v1, v1, Lanet/channel/statist/RequestStatistic;->ip:Ljava/lang/String;

    .line 8
    iput-object v1, v0, Lanet/channel/detect/ExceptionDetector;->c:Ljava/lang/String;

    goto :goto_0

    :cond_2
    const-string v0, "gw.alicdn.com"

    .line 9
    iget-object v1, p0, Lanet/channel/detect/c;->a:Lanet/channel/statist/RequestStatistic;

    iget-object v1, v1, Lanet/channel/statist/RequestStatistic;->host:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 10
    iget-object v0, p0, Lanet/channel/detect/c;->b:Lanet/channel/detect/ExceptionDetector;

    iget-object v1, p0, Lanet/channel/detect/c;->a:Lanet/channel/statist/RequestStatistic;

    iget-object v1, v1, Lanet/channel/statist/RequestStatistic;->ip:Ljava/lang/String;

    .line 11
    iput-object v1, v0, Lanet/channel/detect/ExceptionDetector;->d:Ljava/lang/String;

    .line 12
    :cond_3
    :goto_0
    iget-object v0, p0, Lanet/channel/detect/c;->a:Lanet/channel/statist/RequestStatistic;

    iget-object v0, v0, Lanet/channel/statist/RequestStatistic;->url:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 13
    iget-object v0, p0, Lanet/channel/detect/c;->b:Lanet/channel/detect/ExceptionDetector;

    .line 14
    iget-object v0, v0, Lanet/channel/detect/ExceptionDetector;->e:Lanet/channel/detect/ExceptionDetector$LimitedQueue;

    .line 15
    iget-object v1, p0, Lanet/channel/detect/c;->a:Lanet/channel/statist/RequestStatistic;

    iget-object v1, v1, Lanet/channel/statist/RequestStatistic;->url:Ljava/lang/String;

    iget-object v2, p0, Lanet/channel/detect/c;->a:Lanet/channel/statist/RequestStatistic;

    iget v2, v2, Lanet/channel/statist/RequestStatistic;->statusCode:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v1

    invoke-virtual {v0, v1}, Lanet/channel/detect/ExceptionDetector$LimitedQueue;->add(Ljava/lang/Object;)Z

    .line 16
    :cond_4
    iget-object v0, p0, Lanet/channel/detect/c;->b:Lanet/channel/detect/ExceptionDetector;

    .line 17
    invoke-virtual {v0}, Lanet/channel/detect/ExceptionDetector;->c()Z

    move-result v0

    if-nez v0, :cond_5

    return-void

    .line 18
    :cond_5
    iget-object v0, p0, Lanet/channel/detect/c;->b:Lanet/channel/detect/ExceptionDetector;

    .line 19
    invoke-virtual {v0}, Lanet/channel/detect/ExceptionDetector;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "anet.ExceptionDetector"

    const-string v4, "network detect fail."

    .line 20
    invoke-static {v3, v4, v1, v0, v2}, Lanet/channel/util/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    :goto_1
    return-void
.end method
