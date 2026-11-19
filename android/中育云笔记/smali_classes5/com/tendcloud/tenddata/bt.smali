.class public Lcom/tendcloud/tenddata/bt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tendcloud/tenddata/bu$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lcom/tendcloud/tenddata/ak;Lcom/tendcloud/tenddata/as;Ljava/net/Socket;)Lcom/tendcloud/tenddata/aj;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/tendcloud/tenddata/bt;->createWebSocket(Lcom/tendcloud/tenddata/ak;Lcom/tendcloud/tenddata/as;Ljava/net/Socket;)Lcom/tendcloud/tenddata/am;

    move-result-object p1

    return-object p1
.end method

.method public synthetic a(Lcom/tendcloud/tenddata/ak;Ljava/util/List;Ljava/net/Socket;)Lcom/tendcloud/tenddata/aj;
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lcom/tendcloud/tenddata/bt;->createWebSocket(Lcom/tendcloud/tenddata/ak;Ljava/util/List;Ljava/net/Socket;)Lcom/tendcloud/tenddata/am;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/nio/channels/SocketChannel;Ljava/nio/channels/SelectionKey;)Ljava/nio/channels/SocketChannel;
    .locals 0

    .line 1
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

.method public synthetic wrapChannel(Ljava/nio/channels/SocketChannel;Ljava/nio/channels/SelectionKey;)Ljava/nio/channels/ByteChannel;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/tendcloud/tenddata/bt;->a(Ljava/nio/channels/SocketChannel;Ljava/nio/channels/SelectionKey;)Ljava/nio/channels/SocketChannel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
