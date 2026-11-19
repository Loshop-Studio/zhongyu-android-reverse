.class public interface abstract Lcom/tendcloud/tenddata/bu$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tendcloud/tenddata/al;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/bu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "a"
.end annotation


# virtual methods
.method public abstract createWebSocket(Lcom/tendcloud/tenddata/ak;Lcom/tendcloud/tenddata/as;Ljava/net/Socket;)Lcom/tendcloud/tenddata/am;
.end method

.method public abstract createWebSocket(Lcom/tendcloud/tenddata/ak;Ljava/util/List;Ljava/net/Socket;)Lcom/tendcloud/tenddata/am;
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
.end method

.method public abstract wrapChannel(Ljava/nio/channels/SocketChannel;Ljava/nio/channels/SelectionKey;)Ljava/nio/channels/ByteChannel;
.end method
