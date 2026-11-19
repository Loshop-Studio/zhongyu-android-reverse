.class Lcom/tencent/liteav/basic/util/TXHttpRequest$a;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/liteav/basic/util/TXHttpRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "[B",
        "Ljava/lang/Void;",
        "Lcom/tencent/liteav/basic/util/TXHttpRequest$b;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/tencent/liteav/basic/util/TXHttpRequest;",
            ">;"
        }
    .end annotation
.end field

.field private b:Landroid/os/Handler;

.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/basic/util/TXHttpRequest;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/liteav/basic/util/TXHttpRequest;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/tencent/liteav/basic/util/TXHttpRequest$a;->b:Landroid/os/Handler;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/tencent/liteav/basic/util/TXHttpRequest$a;->c:Ljava/util/Map;

    .line 8
    .line 9
    new-instance p2, Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, Lcom/tencent/liteav/basic/util/TXHttpRequest$a;->a:Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    new-instance p2, Landroid/os/Handler;

    .line 23
    .line 24
    invoke-direct {p2, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 25
    .line 26
    .line 27
    iput-object p2, p0, Lcom/tencent/liteav/basic/util/TXHttpRequest$a;->b:Landroid/os/Handler;

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    iput-object v0, p0, Lcom/tencent/liteav/basic/util/TXHttpRequest$a;->b:Landroid/os/Handler;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public varargs a([[B)Lcom/tencent/liteav/basic/util/TXHttpRequest$b;
    .locals 6

    .line 1
    new-instance v0, Lcom/tencent/liteav/basic/util/TXHttpRequest$b;

    invoke-direct {v0}, Lcom/tencent/liteav/basic/util/TXHttpRequest$b;-><init>()V

    const/4 v1, 0x1

    .line 2
    :try_start_0
    new-instance v2, Ljava/lang/String;

    const/4 v3, 0x0

    aget-object v4, p1, v3

    invoke-direct {v2, v4}, Ljava/lang/String;-><init>([B)V

    const-string v4, "https"

    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    iget-object v2, p0, Lcom/tencent/liteav/basic/util/TXHttpRequest$a;->c:Ljava/util/Map;

    new-instance v4, Ljava/lang/String;

    aget-object v5, p1, v3

    invoke-direct {v4, v5}, Ljava/lang/String;-><init>([B)V

    aget-object p1, p1, v1

    invoke-static {v2, v4, p1}, Lcom/tencent/liteav/basic/util/TXHttpRequest;->getHttpsPostRsp(Ljava/util/Map;Ljava/lang/String;[B)[B

    move-result-object p1

    iput-object p1, v0, Lcom/tencent/liteav/basic/util/TXHttpRequest$b;->c:[B

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    .line 4
    :cond_0
    iget-object v2, p0, Lcom/tencent/liteav/basic/util/TXHttpRequest$a;->c:Ljava/util/Map;

    new-instance v4, Ljava/lang/String;

    aget-object v5, p1, v3

    invoke-direct {v4, v5}, Ljava/lang/String;-><init>([B)V

    aget-object p1, p1, v1

    invoke-static {v2, v4, p1}, Lcom/tencent/liteav/basic/util/TXHttpRequest;->getHttpPostRsp(Ljava/util/Map;Ljava/lang/String;[B)[B

    move-result-object p1

    iput-object p1, v0, Lcom/tencent/liteav/basic/util/TXHttpRequest$b;->c:[B

    .line 5
    :goto_0
    iput v3, v0, Lcom/tencent/liteav/basic/util/TXHttpRequest$b;->a:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 6
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/tencent/liteav/basic/util/TXHttpRequest$b;->b:Ljava/lang/String;

    .line 7
    iput v1, v0, Lcom/tencent/liteav/basic/util/TXHttpRequest$b;->a:I

    .line 8
    :goto_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TXPostRequest->result: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, v0, Lcom/tencent/liteav/basic/util/TXHttpRequest$b;->a:I

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "|"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v0, Lcom/tencent/liteav/basic/util/TXHttpRequest$b;->b:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "TXHttpRequest"

    invoke-static {v1, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public a(Lcom/tencent/liteav/basic/util/TXHttpRequest$b;)V
    .locals 5

    .line 9
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 10
    iget-object v0, p0, Lcom/tencent/liteav/basic/util/TXHttpRequest$a;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/liteav/basic/util/TXHttpRequest;

    if-eqz v0, :cond_1

    .line 11
    invoke-static {v0}, Lcom/tencent/liteav/basic/util/TXHttpRequest;->access$000(Lcom/tencent/liteav/basic/util/TXHttpRequest;)J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-eqz v1, :cond_1

    .line 12
    iget-object v1, p0, Lcom/tencent/liteav/basic/util/TXHttpRequest$a;->b:Landroid/os/Handler;

    if-eqz v1, :cond_0

    .line 13
    new-instance v2, Lcom/tencent/liteav/basic/util/TXHttpRequest$a$1;

    invoke-direct {v2, p0, p1, v0}, Lcom/tencent/liteav/basic/util/TXHttpRequest$a$1;-><init>(Lcom/tencent/liteav/basic/util/TXHttpRequest$a;Lcom/tencent/liteav/basic/util/TXHttpRequest$b;Lcom/tencent/liteav/basic/util/TXHttpRequest;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 14
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "TXPostRequest->recvMsg: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p1, Lcom/tencent/liteav/basic/util/TXHttpRequest$b;->a:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "|"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p1, Lcom/tencent/liteav/basic/util/TXHttpRequest$b;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "TXHttpRequest"

    invoke-static {v2, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    invoke-static {v0}, Lcom/tencent/liteav/basic/util/TXHttpRequest;->access$000(Lcom/tencent/liteav/basic/util/TXHttpRequest;)J

    move-result-wide v1

    iget v3, p1, Lcom/tencent/liteav/basic/util/TXHttpRequest$b;->a:I

    iget-object p1, p1, Lcom/tencent/liteav/basic/util/TXHttpRequest$b;->c:[B

    invoke-static {v0, v1, v2, v3, p1}, Lcom/tencent/liteav/basic/util/TXHttpRequest;->access$100(Lcom/tencent/liteav/basic/util/TXHttpRequest;JI[B)V

    :cond_1
    return-void
.end method

.method public synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [[B

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/basic/util/TXHttpRequest$a;->a([[B)Lcom/tencent/liteav/basic/util/TXHttpRequest$b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/tencent/liteav/basic/util/TXHttpRequest$b;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/basic/util/TXHttpRequest$a;->a(Lcom/tencent/liteav/basic/util/TXHttpRequest$b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
