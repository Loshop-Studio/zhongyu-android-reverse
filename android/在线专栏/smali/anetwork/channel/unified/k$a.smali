.class Lanetwork/channel/unified/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lanetwork/channel/interceptor/Interceptor$Chain;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lanetwork/channel/unified/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lanetwork/channel/unified/k;

.field private b:I

.field private c:Lanet/channel/request/Request;

.field private d:Lanetwork/channel/interceptor/Callback;


# direct methods
.method constructor <init>(Lanetwork/channel/unified/k;ILanet/channel/request/Request;Lanetwork/channel/interceptor/Callback;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lanetwork/channel/unified/k$a;->a:Lanetwork/channel/unified/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p2, p0, Lanetwork/channel/unified/k$a;->b:I

    .line 3
    iput-object p3, p0, Lanetwork/channel/unified/k$a;->c:Lanet/channel/request/Request;

    .line 4
    iput-object p4, p0, Lanetwork/channel/unified/k$a;->d:Lanetwork/channel/interceptor/Callback;

    return-void
.end method


# virtual methods
.method public callback()Lanetwork/channel/interceptor/Callback;
    .locals 1

    iget-object v0, p0, Lanetwork/channel/unified/k$a;->d:Lanetwork/channel/interceptor/Callback;

    return-object v0
.end method

.method public proceed(Lanet/channel/request/Request;Lanetwork/channel/interceptor/Callback;)Ljava/util/concurrent/Future;
    .locals 3

    .line 1
    iget-object v0, p0, Lanetwork/channel/unified/k$a;->a:Lanetwork/channel/unified/k;

    iget-object v0, v0, Lanetwork/channel/unified/k;->a:Lanetwork/channel/unified/j;

    iget-object v0, v0, Lanetwork/channel/unified/j;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1}, Lanet/channel/request/Request;->getSeq()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    const-string v0, "anet.UnifiedRequestTask"

    const-string v2, "request canneled or timeout in processing interceptor"

    invoke-static {v0, v2, p1, p2}, Lanet/channel/util/ALog;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1

    .line 3
    :cond_0
    iget v0, p0, Lanetwork/channel/unified/k$a;->b:I

    invoke-static {}, Lanetwork/channel/interceptor/InterceptorManager;->getSize()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 4
    new-instance v0, Lanetwork/channel/unified/k$a;

    iget-object v1, p0, Lanetwork/channel/unified/k$a;->a:Lanetwork/channel/unified/k;

    iget v2, p0, Lanetwork/channel/unified/k$a;->b:I

    add-int/lit8 v2, v2, 0x1

    invoke-direct {v0, v1, v2, p1, p2}, Lanetwork/channel/unified/k$a;-><init>(Lanetwork/channel/unified/k;ILanet/channel/request/Request;Lanetwork/channel/interceptor/Callback;)V

    .line 5
    iget p1, p0, Lanetwork/channel/unified/k$a;->b:I

    invoke-static {p1}, Lanetwork/channel/interceptor/InterceptorManager;->getInterceptor(I)Lanetwork/channel/interceptor/Interceptor;

    move-result-object p1

    invoke-interface {p1, v0}, Lanetwork/channel/interceptor/Interceptor;->intercept(Lanetwork/channel/interceptor/Interceptor$Chain;)Ljava/util/concurrent/Future;

    move-result-object p1

    return-object p1

    .line 6
    :cond_1
    iget-object v0, p0, Lanetwork/channel/unified/k$a;->a:Lanetwork/channel/unified/k;

    iget-object v0, v0, Lanetwork/channel/unified/k;->a:Lanetwork/channel/unified/j;

    iget-object v0, v0, Lanetwork/channel/unified/j;->a:Lanetwork/channel/entity/g;

    invoke-virtual {v0, p1}, Lanetwork/channel/entity/g;->a(Lanet/channel/request/Request;)V

    .line 7
    iget-object p1, p0, Lanetwork/channel/unified/k$a;->a:Lanetwork/channel/unified/k;

    iget-object p1, p1, Lanetwork/channel/unified/k;->a:Lanetwork/channel/unified/j;

    iput-object p2, p1, Lanetwork/channel/unified/j;->b:Lanetwork/channel/interceptor/Callback;

    .line 8
    invoke-static {}, Lanetwork/channel/config/NetworkConfigCenter;->isHttpCacheEnable()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 9
    iget-object p1, p0, Lanetwork/channel/unified/k$a;->a:Lanetwork/channel/unified/k;

    iget-object p1, p1, Lanetwork/channel/unified/k;->a:Lanetwork/channel/unified/j;

    iget-object p1, p1, Lanetwork/channel/unified/j;->a:Lanetwork/channel/entity/g;

    invoke-virtual {p1}, Lanetwork/channel/entity/g;->g()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lanetwork/channel/unified/k$a;->a:Lanetwork/channel/unified/k;

    iget-object p2, p2, Lanetwork/channel/unified/k;->a:Lanetwork/channel/unified/j;

    iget-object p2, p2, Lanetwork/channel/unified/j;->a:Lanetwork/channel/entity/g;

    invoke-virtual {p2}, Lanetwork/channel/entity/g;->h()Ljava/util/Map;

    move-result-object p2

    invoke-static {p1, p2}, Lanetwork/channel/cache/CacheManager;->getCache(Ljava/lang/String;Ljava/util/Map;)Lanetwork/channel/cache/Cache;

    move-result-object p1

    goto :goto_0

    :cond_2
    move-object p1, v1

    .line 10
    :goto_0
    iget-object p2, p0, Lanetwork/channel/unified/k$a;->a:Lanetwork/channel/unified/k;

    iget-object p2, p2, Lanetwork/channel/unified/k;->a:Lanetwork/channel/unified/j;

    if-eqz p1, :cond_3

    new-instance v0, Lanetwork/channel/unified/a;

    invoke-direct {v0, p2, p1}, Lanetwork/channel/unified/a;-><init>(Lanetwork/channel/unified/j;Lanetwork/channel/cache/Cache;)V

    goto :goto_1

    :cond_3
    new-instance v0, Lanetwork/channel/unified/e;

    invoke-direct {v0, p2, v1, v1}, Lanetwork/channel/unified/e;-><init>(Lanetwork/channel/unified/j;Lanetwork/channel/cache/Cache;Lanetwork/channel/cache/Cache$Entry;)V

    :goto_1
    iput-object v0, p2, Lanetwork/channel/unified/j;->e:Lanetwork/channel/unified/IUnifiedTask;

    .line 11
    iget-object p1, p0, Lanetwork/channel/unified/k$a;->a:Lanetwork/channel/unified/k;

    iget-object p1, p1, Lanetwork/channel/unified/k;->a:Lanetwork/channel/unified/j;

    iget-object p1, p1, Lanetwork/channel/unified/j;->e:Lanetwork/channel/unified/IUnifiedTask;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 12
    iget-object p1, p0, Lanetwork/channel/unified/k$a;->a:Lanetwork/channel/unified/k;

    invoke-static {p1}, Lanetwork/channel/unified/k;->a(Lanetwork/channel/unified/k;)V

    return-object v1
.end method

.method public request()Lanet/channel/request/Request;
    .locals 1

    iget-object v0, p0, Lanetwork/channel/unified/k$a;->c:Lanet/channel/request/Request;

    return-object v0
.end method
