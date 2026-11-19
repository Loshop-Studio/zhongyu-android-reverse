.class final Lcom/tencent/liteav/network/a/a/a$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/liteav/network/a/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/liteav/network/a/a/a;->c()Lcom/tencent/liteav/network/a/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/tencent/liteav/network/a/b;Lcom/tencent/liteav/network/a/d;)[Lcom/tencent/liteav/network/a/e;
    .locals 3

    .line 1
    invoke-static {}, Lcom/tencent/liteav/network/a/a/a;->b()[Ljava/net/InetAddress;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/tencent/liteav/network/a/a/a;->a()[Ljava/net/InetAddress;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    if-eqz v0, :cond_1

    .line 12
    .line 13
    new-instance v1, Lcom/tencent/liteav/network/a/a/c;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    aget-object v0, v0, v2

    .line 17
    .line 18
    invoke-direct {v1, v0}, Lcom/tencent/liteav/network/a/a/c;-><init>(Ljava/net/InetAddress;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {v1, p1, p2}, Lcom/tencent/liteav/network/a/c;->a(Lcom/tencent/liteav/network/a/b;Lcom/tencent/liteav/network/a/d;)[Lcom/tencent/liteav/network/a/e;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    :cond_1
    new-instance p1, Ljava/io/IOException;

    .line 27
    .line 28
    const-string p2, "cant get local dns server"

    .line 29
    .line 30
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p1
.end method
