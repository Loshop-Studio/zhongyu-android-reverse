.class public abstract Lcom/tendcloud/tenddata/ar;
.super Lcom/tendcloud/tenddata/ak;
.source "SourceFile"

# interfaces
.implements Lcom/tendcloud/tenddata/aj;
.implements Ljava/lang/Runnable;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "Assert"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/ar$a;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private closeLatch:Ljava/util/concurrent/CountDownLatch;

.field private connectLatch:Ljava/util/concurrent/CountDownLatch;

.field private connectTimeout:I

.field private draft:Lcom/tendcloud/tenddata/as;

.field private engine:Lcom/tendcloud/tenddata/am;

.field private headers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private istream:Ljava/io/InputStream;

.field private ostream:Ljava/io/OutputStream;

.field private proxy:Ljava/net/Proxy;

.field private socket:Ljava/net/Socket;

.field protected uri:Ljava/net/URI;

.field private writeThread:Ljava/lang/Thread;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/net/URI;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/tendcloud/tenddata/au;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/au;-><init>()V

    invoke-direct {p0, p1, v0}, Lcom/tendcloud/tenddata/ar;-><init>(Ljava/net/URI;Lcom/tendcloud/tenddata/as;)V

    return-void
.end method

.method public constructor <init>(Ljava/net/URI;Lcom/tendcloud/tenddata/as;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0, v1}, Lcom/tendcloud/tenddata/ar;-><init>(Ljava/net/URI;Lcom/tendcloud/tenddata/as;Ljava/util/Map;I)V

    return-void
.end method

.method public constructor <init>(Ljava/net/URI;Lcom/tendcloud/tenddata/as;Ljava/util/Map;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/URI;",
            "Lcom/tendcloud/tenddata/as;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;I)V"
        }
    .end annotation

    .line 3
    invoke-direct {p0}, Lcom/tendcloud/tenddata/ak;-><init>()V

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcom/tendcloud/tenddata/ar;->uri:Ljava/net/URI;

    .line 5
    iput-object v0, p0, Lcom/tendcloud/tenddata/ar;->engine:Lcom/tendcloud/tenddata/am;

    .line 6
    iput-object v0, p0, Lcom/tendcloud/tenddata/ar;->socket:Ljava/net/Socket;

    .line 7
    sget-object v0, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    iput-object v0, p0, Lcom/tendcloud/tenddata/ar;->proxy:Ljava/net/Proxy;

    .line 8
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Lcom/tendcloud/tenddata/ar;->connectLatch:Ljava/util/concurrent/CountDownLatch;

    .line 9
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Lcom/tendcloud/tenddata/ar;->closeLatch:Ljava/util/concurrent/CountDownLatch;

    const/4 v0, 0x0

    .line 10
    iput v0, p0, Lcom/tendcloud/tenddata/ar;->connectTimeout:I

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 11
    iput-object p1, p0, Lcom/tendcloud/tenddata/ar;->uri:Ljava/net/URI;

    .line 12
    iput-object p2, p0, Lcom/tendcloud/tenddata/ar;->draft:Lcom/tendcloud/tenddata/as;

    .line 13
    iput-object p3, p0, Lcom/tendcloud/tenddata/ar;->headers:Ljava/util/Map;

    .line 14
    iput p4, p0, Lcom/tendcloud/tenddata/ar;->connectTimeout:I

    .line 15
    new-instance p1, Lcom/tendcloud/tenddata/am;

    invoke-direct {p1, p0, p2}, Lcom/tendcloud/tenddata/am;-><init>(Lcom/tendcloud/tenddata/an;Lcom/tendcloud/tenddata/as;)V

    iput-object p1, p0, Lcom/tendcloud/tenddata/ar;->engine:Lcom/tendcloud/tenddata/am;

    return-void

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "null as draft is permitted for `WebSocketServer` only!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 17
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public static synthetic access$100(Lcom/tendcloud/tenddata/ar;)Lcom/tendcloud/tenddata/am;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tendcloud/tenddata/ar;->engine:Lcom/tendcloud/tenddata/am;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$200(Lcom/tendcloud/tenddata/ar;)Ljava/io/OutputStream;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tendcloud/tenddata/ar;->ostream:Ljava/io/OutputStream;

    .line 2
    .line 3
    return-object p0
.end method

.method private getPort()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ar;->uri:Ljava/net/URI;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/net/URI;->getPort()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, -0x1

    .line 8
    if-ne v0, v1, :cond_2

    .line 9
    .line 10
    iget-object v0, p0, Lcom/tendcloud/tenddata/ar;->uri:Ljava/net/URI;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "wss"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    const/16 v0, 0x1bb

    .line 25
    .line 26
    return v0

    .line 27
    :cond_0
    const-string v1, "ws"

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    const/16 v0, 0x50

    .line 36
    .line 37
    return v0

    .line 38
    :cond_1
    new-instance v1, Ljava/lang/RuntimeException;

    .line 39
    .line 40
    new-instance v2, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    const-string v3, "unkonow scheme"

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v1

    .line 61
    :cond_2
    return v0
.end method

.method private sendHandshake()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ar;->uri:Ljava/net/URI;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/net/URI;->getPath()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/tendcloud/tenddata/ar;->uri:Ljava/net/URI;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/net/URI;->getQuery()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_1

    .line 20
    .line 21
    :cond_0
    const-string v0, "/"

    .line 22
    .line 23
    :cond_1
    if-eqz v1, :cond_2

    .line 24
    .line 25
    new-instance v2, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v0, "?"

    .line 34
    .line 35
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    :cond_2
    invoke-direct {p0}, Lcom/tendcloud/tenddata/ar;->getPort()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    new-instance v2, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    iget-object v3, p0, Lcom/tendcloud/tenddata/ar;->uri:Ljava/net/URI;

    .line 55
    .line 56
    invoke-virtual {v3}, Ljava/net/URI;->getHost()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const/16 v3, 0x50

    .line 64
    .line 65
    if-eq v1, v3, :cond_3

    .line 66
    .line 67
    new-instance v3, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    const-string v4, ":"

    .line 73
    .line 74
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    goto :goto_0

    .line 85
    :cond_3
    const-string v1, ""

    .line 86
    .line 87
    :goto_0
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    new-instance v2, Lcom/tendcloud/tenddata/bm;

    .line 95
    .line 96
    invoke-direct {v2}, Lcom/tendcloud/tenddata/bm;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, v0}, Lcom/tendcloud/tenddata/bm;->setResourceDescriptor(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    const-string v0, "Host"

    .line 103
    .line 104
    invoke-virtual {v2, v0, v1}, Lcom/tendcloud/tenddata/bp;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    iget-object v0, p0, Lcom/tendcloud/tenddata/ar;->headers:Ljava/util/Map;

    .line 108
    .line 109
    if-eqz v0, :cond_4

    .line 110
    .line 111
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-eqz v1, :cond_4

    .line 124
    .line 125
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    check-cast v1, Ljava/util/Map$Entry;

    .line 130
    .line 131
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    check-cast v3, Ljava/lang/String;

    .line 136
    .line 137
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    check-cast v1, Ljava/lang/String;

    .line 142
    .line 143
    invoke-virtual {v2, v3, v1}, Lcom/tendcloud/tenddata/bp;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_4
    iget-object v0, p0, Lcom/tendcloud/tenddata/ar;->engine:Lcom/tendcloud/tenddata/am;

    .line 148
    .line 149
    invoke-virtual {v0, v2}, Lcom/tendcloud/tenddata/am;->startHandshake(Lcom/tendcloud/tenddata/bk;)V

    .line 150
    .line 151
    .line 152
    return-void
.end method


# virtual methods
.method public close()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ar;->writeThread:Ljava/lang/Thread;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/tendcloud/tenddata/ar;->engine:Lcom/tendcloud/tenddata/am;

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Lcom/tendcloud/tenddata/am;->close(I)V

    :cond_0
    return-void
.end method

.method public close(I)V
    .locals 0

    .line 3
    iget-object p1, p0, Lcom/tendcloud/tenddata/ar;->engine:Lcom/tendcloud/tenddata/am;

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/am;->close()V

    return-void
.end method

.method public close(ILjava/lang/String;)V
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/tendcloud/tenddata/ar;->engine:Lcom/tendcloud/tenddata/am;

    invoke-virtual {v0, p1, p2}, Lcom/tendcloud/tenddata/am;->close(ILjava/lang/String;)V

    return-void
.end method

.method public closeBlocking()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/ar;->close()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/tendcloud/tenddata/ar;->closeLatch:Ljava/util/concurrent/CountDownLatch;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public closeConnection(ILjava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ar;->engine:Lcom/tendcloud/tenddata/am;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lcom/tendcloud/tenddata/am;->closeConnection(ILjava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public connect()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ar;->writeThread:Ljava/lang/Thread;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/Thread;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/tendcloud/tenddata/ar;->writeThread:Ljava/lang/Thread;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v1, "WebSocketClient objects are not reuseable"

    .line 19
    .line 20
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw v0
.end method

.method public connectBlocking()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/ar;->connect()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/tendcloud/tenddata/ar;->connectLatch:Ljava/util/concurrent/CountDownLatch;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/tendcloud/tenddata/ar;->engine:Lcom/tendcloud/tenddata/am;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/am;->isOpen()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
.end method

.method public getConnection()Lcom/tendcloud/tenddata/aj;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ar;->engine:Lcom/tendcloud/tenddata/am;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDraft()Lcom/tendcloud/tenddata/as;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ar;->draft:Lcom/tendcloud/tenddata/as;

    .line 2
    .line 3
    return-object v0
.end method

.method public getLocalSocketAddress()Ljava/net/InetSocketAddress;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/tendcloud/tenddata/ar;->engine:Lcom/tendcloud/tenddata/am;

    invoke-virtual {v0}, Lcom/tendcloud/tenddata/am;->getLocalSocketAddress()Ljava/net/InetSocketAddress;

    move-result-object v0

    return-object v0
.end method

.method public getLocalSocketAddress(Lcom/tendcloud/tenddata/aj;)Ljava/net/InetSocketAddress;
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/tendcloud/tenddata/ar;->socket:Ljava/net/Socket;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Ljava/net/Socket;->getLocalSocketAddress()Ljava/net/SocketAddress;

    move-result-object p1

    check-cast p1, Ljava/net/InetSocketAddress;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getReadyState()Lcom/tendcloud/tenddata/aj$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ar;->engine:Lcom/tendcloud/tenddata/am;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/am;->getReadyState()Lcom/tendcloud/tenddata/aj$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getRemoteSocketAddress()Ljava/net/InetSocketAddress;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/tendcloud/tenddata/ar;->engine:Lcom/tendcloud/tenddata/am;

    invoke-virtual {v0}, Lcom/tendcloud/tenddata/am;->getRemoteSocketAddress()Ljava/net/InetSocketAddress;

    move-result-object v0

    return-object v0
.end method

.method public getRemoteSocketAddress(Lcom/tendcloud/tenddata/aj;)Ljava/net/InetSocketAddress;
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/tendcloud/tenddata/ar;->socket:Ljava/net/Socket;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Ljava/net/Socket;->getRemoteSocketAddress()Ljava/net/SocketAddress;

    move-result-object p1

    check-cast p1, Ljava/net/InetSocketAddress;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getResourceDescriptor()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ar;->uri:Ljava/net/URI;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/net/URI;->getPath()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getURI()Ljava/net/URI;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ar;->uri:Ljava/net/URI;

    .line 2
    .line 3
    return-object v0
.end method

.method public hasBufferedData()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ar;->engine:Lcom/tendcloud/tenddata/am;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/am;->hasBufferedData()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public isClosed()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ar;->engine:Lcom/tendcloud/tenddata/am;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/am;->isClosed()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public isClosing()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ar;->engine:Lcom/tendcloud/tenddata/am;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/am;->isClosing()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public isConnecting()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ar;->engine:Lcom/tendcloud/tenddata/am;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/am;->isConnecting()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public isFlushAndClose()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ar;->engine:Lcom/tendcloud/tenddata/am;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/am;->isFlushAndClose()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public isOpen()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ar;->engine:Lcom/tendcloud/tenddata/am;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/am;->isOpen()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public abstract onClose(ILjava/lang/String;Z)V
.end method

.method public onCloseInitiated(ILjava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onClosing(ILjava/lang/String;Z)V
    .locals 0

    return-void
.end method

.method public abstract onError(Ljava/lang/Exception;)V
.end method

.method public onFragment(Lcom/tendcloud/tenddata/bh;)V
    .locals 0

    return-void
.end method

.method public abstract onMessage(Ljava/lang/String;)V
.end method

.method public onMessage(Ljava/nio/ByteBuffer;)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract onOpen(Lcom/tendcloud/tenddata/bq;)V
.end method

.method public final onWebsocketClose(Lcom/tendcloud/tenddata/aj;ILjava/lang/String;Z)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/tendcloud/tenddata/ar;->connectLatch:Ljava/util/concurrent/CountDownLatch;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/tendcloud/tenddata/ar;->closeLatch:Ljava/util/concurrent/CountDownLatch;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/tendcloud/tenddata/ar;->writeThread:Ljava/lang/Thread;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 16
    .line 17
    .line 18
    :cond_0
    :try_start_0
    iget-object p1, p0, Lcom/tendcloud/tenddata/ar;->socket:Ljava/net/Socket;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/net/Socket;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catch_0
    move-exception p1

    .line 27
    invoke-virtual {p0, p0, p1}, Lcom/tendcloud/tenddata/ar;->onWebsocketError(Lcom/tendcloud/tenddata/aj;Ljava/lang/Exception;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    :goto_0
    invoke-virtual {p0, p2, p3, p4}, Lcom/tendcloud/tenddata/ar;->onClose(ILjava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public onWebsocketCloseInitiated(Lcom/tendcloud/tenddata/aj;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p2, p3}, Lcom/tendcloud/tenddata/ar;->onCloseInitiated(ILjava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onWebsocketClosing(Lcom/tendcloud/tenddata/aj;ILjava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p2, p3, p4}, Lcom/tendcloud/tenddata/ar;->onClosing(ILjava/lang/String;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onWebsocketError(Lcom/tendcloud/tenddata/aj;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, Lcom/tendcloud/tenddata/ar;->onError(Ljava/lang/Exception;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onWebsocketMessage(Lcom/tendcloud/tenddata/aj;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, Lcom/tendcloud/tenddata/ar;->onMessage(Ljava/lang/String;)V

    return-void
.end method

.method public final onWebsocketMessage(Lcom/tendcloud/tenddata/aj;Ljava/nio/ByteBuffer;)V
    .locals 0

    .line 2
    invoke-virtual {p0, p2}, Lcom/tendcloud/tenddata/ar;->onMessage(Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method public onWebsocketMessageFragment(Lcom/tendcloud/tenddata/aj;Lcom/tendcloud/tenddata/bh;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, Lcom/tendcloud/tenddata/ar;->onFragment(Lcom/tendcloud/tenddata/bh;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onWebsocketOpen(Lcom/tendcloud/tenddata/aj;Lcom/tendcloud/tenddata/bo;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/tendcloud/tenddata/ar;->connectLatch:Ljava/util/concurrent/CountDownLatch;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 4
    .line 5
    .line 6
    check-cast p2, Lcom/tendcloud/tenddata/bq;

    .line 7
    .line 8
    invoke-virtual {p0, p2}, Lcom/tendcloud/tenddata/ar;->onOpen(Lcom/tendcloud/tenddata/bq;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onWriteDemand(Lcom/tendcloud/tenddata/aj;)V
    .locals 0

    return-void
.end method

.method public run()V
    .locals 5

    .line 1
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/cv;->a:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Thread;->getId()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/ar;->getURI()Ljava/net/URI;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2}, Ljava/net/URI;->getHost()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    const/4 v0, -0x1

    .line 27
    :try_start_1
    iget-object v1, p0, Lcom/tendcloud/tenddata/ar;->socket:Ljava/net/Socket;

    .line 28
    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    new-instance v1, Ljava/net/Socket;

    .line 32
    .line 33
    iget-object v2, p0, Lcom/tendcloud/tenddata/ar;->proxy:Ljava/net/Proxy;

    .line 34
    .line 35
    invoke-direct {v1, v2}, Ljava/net/Socket;-><init>(Ljava/net/Proxy;)V

    .line 36
    .line 37
    .line 38
    iput-object v1, p0, Lcom/tendcloud/tenddata/ar;->socket:Ljava/net/Socket;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catch_0
    move-exception v1

    .line 42
    goto/16 :goto_3

    .line 43
    .line 44
    :cond_0
    invoke-virtual {v1}, Ljava/net/Socket;->isClosed()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-nez v1, :cond_3

    .line 49
    .line 50
    :goto_0
    iget-object v1, p0, Lcom/tendcloud/tenddata/ar;->socket:Ljava/net/Socket;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/net/Socket;->isBound()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-nez v1, :cond_1

    .line 57
    .line 58
    iget-object v1, p0, Lcom/tendcloud/tenddata/ar;->socket:Ljava/net/Socket;

    .line 59
    .line 60
    new-instance v2, Ljava/net/InetSocketAddress;

    .line 61
    .line 62
    iget-object v3, p0, Lcom/tendcloud/tenddata/ar;->uri:Ljava/net/URI;

    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/net/URI;->getHost()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-direct {p0}, Lcom/tendcloud/tenddata/ar;->getPort()I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    invoke-direct {v2, v3, v4}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    .line 73
    .line 74
    .line 75
    iget v3, p0, Lcom/tendcloud/tenddata/ar;->connectTimeout:I

    .line 76
    .line 77
    invoke-virtual {v1, v2, v3}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    .line 78
    .line 79
    .line 80
    :cond_1
    iget-object v1, p0, Lcom/tendcloud/tenddata/ar;->socket:Ljava/net/Socket;

    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    iput-object v1, p0, Lcom/tendcloud/tenddata/ar;->istream:Ljava/io/InputStream;

    .line 87
    .line 88
    iget-object v1, p0, Lcom/tendcloud/tenddata/ar;->socket:Ljava/net/Socket;

    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    iput-object v1, p0, Lcom/tendcloud/tenddata/ar;->ostream:Ljava/io/OutputStream;

    .line 95
    .line 96
    invoke-direct {p0}, Lcom/tendcloud/tenddata/ar;->sendHandshake()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 97
    .line 98
    .line 99
    :try_start_2
    new-instance v1, Ljava/lang/Thread;

    .line 100
    .line 101
    new-instance v2, Lcom/tendcloud/tenddata/ar$a;

    .line 102
    .line 103
    const/4 v3, 0x0

    .line 104
    invoke-direct {v2, p0, v3}, Lcom/tendcloud/tenddata/ar$a;-><init>(Lcom/tendcloud/tenddata/ar;Lcom/tendcloud/tenddata/ar$1;)V

    .line 105
    .line 106
    .line 107
    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 108
    .line 109
    .line 110
    iput-object v1, p0, Lcom/tendcloud/tenddata/ar;->writeThread:Ljava/lang/Thread;

    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 113
    .line 114
    .line 115
    sget v1, Lcom/tendcloud/tenddata/am;->c:I

    .line 116
    .line 117
    new-array v1, v1, [B
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 118
    .line 119
    :goto_1
    :try_start_3
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/ar;->isClosed()Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-nez v2, :cond_2

    .line 124
    .line 125
    iget-object v2, p0, Lcom/tendcloud/tenddata/ar;->istream:Ljava/io/InputStream;

    .line 126
    .line 127
    invoke-virtual {v2, v1}, Ljava/io/InputStream;->read([B)I

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    if-eq v2, v0, :cond_2

    .line 132
    .line 133
    iget-object v3, p0, Lcom/tendcloud/tenddata/ar;->engine:Lcom/tendcloud/tenddata/am;

    .line 134
    .line 135
    const/4 v4, 0x0

    .line 136
    invoke-static {v1, v4, v2}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-virtual {v3, v2}, Lcom/tendcloud/tenddata/am;->decode(Ljava/nio/ByteBuffer;)V

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :catch_1
    move-exception v0

    .line 145
    goto :goto_2

    .line 146
    :cond_2
    iget-object v0, p0, Lcom/tendcloud/tenddata/ar;->engine:Lcom/tendcloud/tenddata/am;

    .line 147
    .line 148
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/am;->b()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 149
    .line 150
    .line 151
    goto :goto_4

    .line 152
    :goto_2
    :try_start_4
    invoke-virtual {p0, v0}, Lcom/tendcloud/tenddata/ar;->onError(Ljava/lang/Exception;)V

    .line 153
    .line 154
    .line 155
    iget-object v1, p0, Lcom/tendcloud/tenddata/ar;->engine:Lcom/tendcloud/tenddata/am;

    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    const/16 v2, 0x3ee

    .line 162
    .line 163
    invoke-virtual {v1, v2, v0}, Lcom/tendcloud/tenddata/am;->closeConnection(ILjava/lang/String;)V

    .line 164
    .line 165
    .line 166
    goto :goto_4

    .line 167
    :catch_2
    iget-object v0, p0, Lcom/tendcloud/tenddata/ar;->engine:Lcom/tendcloud/tenddata/am;

    .line 168
    .line 169
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/am;->b()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 170
    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_3
    :try_start_5
    new-instance v1, Ljava/io/IOException;

    .line 174
    .line 175
    invoke-direct {v1}, Ljava/io/IOException;-><init>()V

    .line 176
    .line 177
    .line 178
    throw v1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 179
    :goto_3
    :try_start_6
    iget-object v2, p0, Lcom/tendcloud/tenddata/ar;->engine:Lcom/tendcloud/tenddata/am;

    .line 180
    .line 181
    invoke-virtual {p0, v2, v1}, Lcom/tendcloud/tenddata/ar;->onWebsocketError(Lcom/tendcloud/tenddata/aj;Ljava/lang/Exception;)V

    .line 182
    .line 183
    .line 184
    iget-object v2, p0, Lcom/tendcloud/tenddata/ar;->engine:Lcom/tendcloud/tenddata/am;

    .line 185
    .line 186
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-virtual {v2, v0, v1}, Lcom/tendcloud/tenddata/am;->closeConnection(ILjava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 191
    .line 192
    .line 193
    :catchall_0
    :goto_4
    return-void
.end method

.method public send(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ar;->engine:Lcom/tendcloud/tenddata/am;

    invoke-virtual {v0, p1}, Lcom/tendcloud/tenddata/am;->send(Ljava/lang/String;)V

    return-void
.end method

.method public send(Ljava/nio/ByteBuffer;)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/tendcloud/tenddata/ar;->engine:Lcom/tendcloud/tenddata/am;

    invoke-virtual {v0, p1}, Lcom/tendcloud/tenddata/am;->send(Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method public send([B)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/tendcloud/tenddata/ar;->engine:Lcom/tendcloud/tenddata/am;

    invoke-virtual {v0, p1}, Lcom/tendcloud/tenddata/am;->send([B)V

    return-void
.end method

.method public sendFragmentedFrame(Lcom/tendcloud/tenddata/bh$a;Ljava/nio/ByteBuffer;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ar;->engine:Lcom/tendcloud/tenddata/am;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lcom/tendcloud/tenddata/am;->sendFragmentedFrame(Lcom/tendcloud/tenddata/bh$a;Ljava/nio/ByteBuffer;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public sendFrame(Lcom/tendcloud/tenddata/bh;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ar;->engine:Lcom/tendcloud/tenddata/am;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/tendcloud/tenddata/am;->sendFrame(Lcom/tendcloud/tenddata/bh;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setProxy(Ljava/net/Proxy;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lcom/tendcloud/tenddata/ar;->proxy:Ljava/net/Proxy;

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 9
    .line 10
    .line 11
    throw p1
.end method

.method public setSocket(Ljava/net/Socket;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ar;->socket:Ljava/net/Socket;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lcom/tendcloud/tenddata/ar;->socket:Ljava/net/Socket;

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v0, "socket has already been set"

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw p1
.end method
