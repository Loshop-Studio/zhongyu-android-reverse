.class public Lcom/tendcloud/tenddata/bs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tendcloud/tenddata/bu$a;


# instance fields
.field protected a:Ljavax/net/ssl/SSLContext;

.field protected b:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>(Ljavax/net/ssl/SSLContext;)V
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/tendcloud/tenddata/bs;-><init>(Ljavax/net/ssl/SSLContext;Ljava/util/concurrent/ExecutorService;)V

    return-void
.end method

.method public constructor <init>(Ljavax/net/ssl/SSLContext;Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 3
    iput-object p1, p0, Lcom/tendcloud/tenddata/bs;->a:Ljavax/net/ssl/SSLContext;

    .line 4
    iput-object p2, p0, Lcom/tendcloud/tenddata/bs;->b:Ljava/util/concurrent/ExecutorService;

    return-void

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method


# virtual methods
.method public synthetic a(Lcom/tendcloud/tenddata/ak;Lcom/tendcloud/tenddata/as;Ljava/net/Socket;)Lcom/tendcloud/tenddata/aj;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/tendcloud/tenddata/bs;->createWebSocket(Lcom/tendcloud/tenddata/ak;Lcom/tendcloud/tenddata/as;Ljava/net/Socket;)Lcom/tendcloud/tenddata/am;

    move-result-object p1

    return-object p1
.end method

.method public synthetic a(Lcom/tendcloud/tenddata/ak;Ljava/util/List;Ljava/net/Socket;)Lcom/tendcloud/tenddata/aj;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/tendcloud/tenddata/bs;->createWebSocket(Lcom/tendcloud/tenddata/ak;Ljava/util/List;Ljava/net/Socket;)Lcom/tendcloud/tenddata/am;

    move-result-object p1

    return-object p1
.end method

.method public createWebSocket(Lcom/tendcloud/tenddata/ak;Lcom/tendcloud/tenddata/as;Ljava/net/Socket;)Lcom/tendcloud/tenddata/am;
    .locals 0

    .line 1
    new-instance p3, Lcom/tendcloud/tenddata/am;

    invoke-direct {p3, p1, p2}, Lcom/tendcloud/tenddata/am;-><init>(Lcom/tendcloud/tenddata/an;Lcom/tendcloud/tenddata/as;)V

    return-object p3
.end method

.method public createWebSocket(Lcom/tendcloud/tenddata/ak;Ljava/util/List;Ljava/net/Socket;)Lcom/tendcloud/tenddata/am;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tendcloud/tenddata/ak;",
            "Ljava/util/List<",
            "Lcom/tendcloud/tenddata/as;",
            ">;",
            "Ljava/net/Socket;",
            ")",
            "Lcom/tendcloud/tenddata/am;"
        }
    .end annotation

    .line 2
    new-instance p3, Lcom/tendcloud/tenddata/am;

    invoke-direct {p3, p1, p2}, Lcom/tendcloud/tenddata/am;-><init>(Lcom/tendcloud/tenddata/an;Ljava/util/List;)V

    return-object p3
.end method

.method public wrapChannel(Ljava/nio/channels/SocketChannel;Ljava/nio/channels/SelectionKey;)Ljava/nio/channels/ByteChannel;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/bs;->a:Ljavax/net/ssl/SSLContext;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->createSSLEngine()Ljavax/net/ssl/SSLEngine;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Ljavax/net/ssl/SSLEngine;->setUseClientMode(Z)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lcom/tendcloud/tenddata/ah;

    .line 12
    .line 13
    iget-object v2, p0, Lcom/tendcloud/tenddata/bs;->b:Ljava/util/concurrent/ExecutorService;

    .line 14
    .line 15
    invoke-direct {v1, p1, v0, v2, p2}, Lcom/tendcloud/tenddata/ah;-><init>(Ljava/nio/channels/SocketChannel;Ljavax/net/ssl/SSLEngine;Ljava/util/concurrent/ExecutorService;Ljava/nio/channels/SelectionKey;)V

    .line 16
    .line 17
    .line 18
    return-object v1
.end method
