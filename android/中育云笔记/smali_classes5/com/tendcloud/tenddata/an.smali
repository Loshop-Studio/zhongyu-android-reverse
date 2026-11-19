.class public interface abstract Lcom/tendcloud/tenddata/an;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract getFlashPolicy(Lcom/tendcloud/tenddata/aj;)Ljava/lang/String;
.end method

.method public abstract getLocalSocketAddress(Lcom/tendcloud/tenddata/aj;)Ljava/net/InetSocketAddress;
.end method

.method public abstract getRemoteSocketAddress(Lcom/tendcloud/tenddata/aj;)Ljava/net/InetSocketAddress;
.end method

.method public abstract onWebsocketClose(Lcom/tendcloud/tenddata/aj;ILjava/lang/String;Z)V
.end method

.method public abstract onWebsocketCloseInitiated(Lcom/tendcloud/tenddata/aj;ILjava/lang/String;)V
.end method

.method public abstract onWebsocketClosing(Lcom/tendcloud/tenddata/aj;ILjava/lang/String;Z)V
.end method

.method public abstract onWebsocketError(Lcom/tendcloud/tenddata/aj;Ljava/lang/Exception;)V
.end method

.method public abstract onWebsocketHandshakeReceivedAsClient(Lcom/tendcloud/tenddata/aj;Lcom/tendcloud/tenddata/bj;Lcom/tendcloud/tenddata/bq;)V
.end method

.method public abstract onWebsocketHandshakeReceivedAsServer(Lcom/tendcloud/tenddata/aj;Lcom/tendcloud/tenddata/as;Lcom/tendcloud/tenddata/bj;)Lcom/tendcloud/tenddata/br;
.end method

.method public abstract onWebsocketHandshakeSentAsClient(Lcom/tendcloud/tenddata/aj;Lcom/tendcloud/tenddata/bj;)V
.end method

.method public abstract onWebsocketMessage(Lcom/tendcloud/tenddata/aj;Ljava/lang/String;)V
.end method

.method public abstract onWebsocketMessage(Lcom/tendcloud/tenddata/aj;Ljava/nio/ByteBuffer;)V
.end method

.method public abstract onWebsocketMessageFragment(Lcom/tendcloud/tenddata/aj;Lcom/tendcloud/tenddata/bh;)V
.end method

.method public abstract onWebsocketOpen(Lcom/tendcloud/tenddata/aj;Lcom/tendcloud/tenddata/bo;)V
.end method

.method public abstract onWebsocketPing(Lcom/tendcloud/tenddata/aj;Lcom/tendcloud/tenddata/bh;)V
.end method

.method public abstract onWebsocketPong(Lcom/tendcloud/tenddata/aj;Lcom/tendcloud/tenddata/bh;)V
.end method

.method public abstract onWriteDemand(Lcom/tendcloud/tenddata/aj;)V
.end method
