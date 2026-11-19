.class public abstract Lcom/tendcloud/tenddata/ak;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tendcloud/tenddata/an;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getFlashPolicy(Lcom/tendcloud/tenddata/aj;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-interface {p1}, Lcom/tendcloud/tenddata/aj;->getLocalSocketAddress()Ljava/net/InetSocketAddress;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuffer;

    .line 8
    .line 9
    const/16 v1, 0x5a

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(I)V

    .line 12
    .line 13
    .line 14
    const-string v1, "<cross-domain-policy><allow-access-from domain=\"*\" to-ports=\""

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/net/InetSocketAddress;->getPort()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 24
    .line 25
    .line 26
    const-string p1, "\" /></cross-domain-policy>\u0000"

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :cond_0
    new-instance p1, Lcom/tendcloud/tenddata/ba;

    .line 37
    .line 38
    const-string v0, "socket not bound"

    .line 39
    .line 40
    invoke-direct {p1, v0}, Lcom/tendcloud/tenddata/ba;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1
.end method

.method public onWebsocketHandshakeReceivedAsClient(Lcom/tendcloud/tenddata/aj;Lcom/tendcloud/tenddata/bj;Lcom/tendcloud/tenddata/bq;)V
    .locals 0

    return-void
.end method

.method public onWebsocketHandshakeReceivedAsServer(Lcom/tendcloud/tenddata/aj;Lcom/tendcloud/tenddata/as;Lcom/tendcloud/tenddata/bj;)Lcom/tendcloud/tenddata/br;
    .locals 0

    .line 1
    new-instance p1, Lcom/tendcloud/tenddata/bn;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/tendcloud/tenddata/bn;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method public onWebsocketHandshakeSentAsClient(Lcom/tendcloud/tenddata/aj;Lcom/tendcloud/tenddata/bj;)V
    .locals 0

    return-void
.end method

.method public onWebsocketMessageFragment(Lcom/tendcloud/tenddata/aj;Lcom/tendcloud/tenddata/bh;)V
    .locals 0

    return-void
.end method

.method public onWebsocketPing(Lcom/tendcloud/tenddata/aj;Lcom/tendcloud/tenddata/bh;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/tendcloud/tenddata/bi;

    .line 2
    .line 3
    invoke-direct {v0, p2}, Lcom/tendcloud/tenddata/bi;-><init>(Lcom/tendcloud/tenddata/bh;)V

    .line 4
    .line 5
    .line 6
    sget-object p2, Lcom/tendcloud/tenddata/bh$a;->PONG:Lcom/tendcloud/tenddata/bh$a;

    .line 7
    .line 8
    invoke-virtual {v0, p2}, Lcom/tendcloud/tenddata/bi;->setOptcode(Lcom/tendcloud/tenddata/bh$a;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1, v0}, Lcom/tendcloud/tenddata/aj;->sendFrame(Lcom/tendcloud/tenddata/bh;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public onWebsocketPong(Lcom/tendcloud/tenddata/aj;Lcom/tendcloud/tenddata/bh;)V
    .locals 0

    return-void
.end method
