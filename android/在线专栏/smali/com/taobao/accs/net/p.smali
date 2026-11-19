.class Lcom/taobao/accs/net/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:I

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:I

.field final synthetic d:Z

.field final synthetic e:Lcom/taobao/accs/net/j;


# direct methods
.method constructor <init>(Lcom/taobao/accs/net/j;ILjava/lang/String;IZ)V
    .locals 0

    iput-object p1, p0, Lcom/taobao/accs/net/p;->e:Lcom/taobao/accs/net/j;

    iput p2, p0, Lcom/taobao/accs/net/p;->a:I

    iput-object p3, p0, Lcom/taobao/accs/net/p;->b:Ljava/lang/String;

    iput p4, p0, Lcom/taobao/accs/net/p;->c:I

    iput-boolean p5, p0, Lcom/taobao/accs/net/p;->d:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    invoke-static {}, Lcom/taobao/accs/AccsState;->getInstance()Lcom/taobao/accs/AccsState;

    move-result-object v0

    iget-object v1, p0, Lcom/taobao/accs/net/p;->e:Lcom/taobao/accs/net/j;

    iget-object v1, v1, Lcom/taobao/accs/net/b;->m:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "oe "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Lcom/taobao/accs/net/p;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/taobao/accs/net/p;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "re"

    invoke-virtual {v0, v1, v3, v2}, Lcom/taobao/accs/AccsState;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 2
    iget v0, p0, Lcom/taobao/accs/net/p;->c:I

    if-lez v0, :cond_4

    .line 3
    new-instance v1, Lcom/taobao/accs/data/Message$a;

    const-string v2, ""

    invoke-direct {v1, v0, v2}, Lcom/taobao/accs/data/Message$a;-><init>(ILjava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/taobao/accs/net/p;->e:Lcom/taobao/accs/net/j;

    iget-object v0, v0, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    invoke-virtual {v0}, Lcom/taobao/accs/data/d;->f()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/taobao/accs/data/Message$a;

    .line 5
    invoke-virtual {v2, v1}, Lcom/taobao/accs/data/Message$a;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v3

    :goto_0
    if-eqz v2, :cond_4

    .line 6
    iget-object v0, p0, Lcom/taobao/accs/net/p;->e:Lcom/taobao/accs/net/j;

    iget-object v0, v0, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    .line 7
    invoke-virtual {v2}, Lcom/taobao/accs/data/Message$a;->b()Ljava/lang/String;

    move-result-object v1

    .line 8
    invoke-virtual {v0, v1}, Lcom/taobao/accs/data/d;->b(Ljava/lang/String;)Lcom/taobao/accs/data/Message;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 9
    iget-boolean v1, p0, Lcom/taobao/accs/net/p;->d:Z

    if-eqz v1, :cond_3

    .line 10
    iget-object v1, p0, Lcom/taobao/accs/net/p;->e:Lcom/taobao/accs/net/j;

    const/16 v2, 0x7d0

    invoke-virtual {v1, v0, v2}, Lcom/taobao/accs/net/b;->a(Lcom/taobao/accs/data/Message;I)Z

    move-result v1

    if-nez v1, :cond_2

    .line 11
    iget-object v1, p0, Lcom/taobao/accs/net/p;->e:Lcom/taobao/accs/net/j;

    iget-object v1, v1, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    iget v2, p0, Lcom/taobao/accs/net/p;->a:I

    iget-object v4, p0, Lcom/taobao/accs/net/p;->b:Ljava/lang/String;

    .line 12
    invoke-static {v2, v4}, Lcom/taobao/accs/AccsErrorCode;->convertNetworkSdkError(ILjava/lang/String;)Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v2

    .line 13
    invoke-static {v3}, Lcom/taobao/accs/AccsErrorCode;->getAllDetails(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->detail(Ljava/lang/String;)Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v2

    invoke-virtual {v2}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->build()Lcom/alibaba/sdk/android/error/ErrorCode;

    move-result-object v2

    .line 14
    invoke-virtual {v1, v0, v2}, Lcom/taobao/accs/data/d;->a(Lcom/taobao/accs/data/Message;Lcom/alibaba/sdk/android/error/ErrorCode;)V

    .line 15
    :cond_2
    invoke-virtual {v0}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    move-result-object v0

    if-eqz v0, :cond_4

    const-wide/16 v0, 0x0

    const-string v2, "accs"

    const-string v3, "resend"

    const-string v4, "total_tnet"

    .line 16
    invoke-static {v2, v3, v4, v0, v1}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitCount(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V

    goto :goto_1

    .line 17
    :cond_3
    iget-object v1, p0, Lcom/taobao/accs/net/p;->e:Lcom/taobao/accs/net/j;

    iget-object v1, v1, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    iget v2, p0, Lcom/taobao/accs/net/p;->a:I

    iget-object v4, p0, Lcom/taobao/accs/net/p;->b:Ljava/lang/String;

    .line 18
    invoke-static {v2, v4}, Lcom/taobao/accs/AccsErrorCode;->convertNetworkSdkError(ILjava/lang/String;)Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v2

    .line 19
    invoke-static {v3}, Lcom/taobao/accs/AccsErrorCode;->getAllDetails(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->detail(Ljava/lang/String;)Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v2

    invoke-virtual {v2}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->build()Lcom/alibaba/sdk/android/error/ErrorCode;

    move-result-object v2

    .line 20
    invoke-virtual {v1, v0, v2}, Lcom/taobao/accs/data/d;->a(Lcom/taobao/accs/data/Message;Lcom/alibaba/sdk/android/error/ErrorCode;)V

    .line 21
    :cond_4
    :goto_1
    iget v0, p0, Lcom/taobao/accs/net/p;->c:I

    if-gez v0, :cond_5

    iget-boolean v1, p0, Lcom/taobao/accs/net/p;->d:Z

    if-eqz v1, :cond_5

    .line 22
    iget-object v1, p0, Lcom/taobao/accs/net/p;->e:Lcom/taobao/accs/net/j;

    invoke-virtual {v1, v0}, Lcom/taobao/accs/net/b;->b(I)V

    :cond_5
    return-void
.end method
