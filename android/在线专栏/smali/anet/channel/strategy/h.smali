.class Lanet/channel/strategy/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lanet/channel/strategy/IStrategyFilter;


# instance fields
.field final synthetic a:Lanet/channel/strategy/g;


# direct methods
.method constructor <init>(Lanet/channel/strategy/g;)V
    .locals 0

    iput-object p1, p0, Lanet/channel/strategy/h;->a:Lanet/channel/strategy/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Lanet/channel/strategy/IConnStrategy;)Z
    .locals 9

    .line 1
    invoke-interface {p1}, Lanet/channel/strategy/IConnStrategy;->getProtocol()Lanet/channel/strategy/ConnProtocol;

    move-result-object v0

    iget-object v0, v0, Lanet/channel/strategy/ConnProtocol;->protocol:Ljava/lang/String;

    const-string v1, "quic"

    .line 2
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "strategy"

    const/4 v3, 0x2

    const/4 v4, 0x0

    const-string v5, "awcn.StrategyCenter"

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-nez v1, :cond_4

    const-string v1, "quicplain"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    invoke-static {}, Lanet/channel/AwcnConfig;->isHttp3Enable()Z

    move-result v1

    .line 4
    invoke-static {}, Lanet/channel/e/a;->b()Z

    move-result v8

    if-eqz v1, :cond_1

    if-nez v8, :cond_2

    :cond_1
    const-string v1, "http3"

    .line 5
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "http3plain"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    return v6

    :cond_3
    :goto_0
    new-array v0, v3, [Ljava/lang/Object;

    aput-object v2, v0, v7

    aput-object p1, v0, v6

    const-string p1, "http3 strategy disabled"

    .line 6
    invoke-static {v5, p1, v4, v0}, Lanet/channel/util/ALog;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return v7

    :cond_4
    :goto_1
    new-array v0, v3, [Ljava/lang/Object;

    aput-object v2, v0, v7

    aput-object p1, v0, v6

    const-string p1, "gquic strategy disabled"

    .line 7
    invoke-static {v5, p1, v4, v0}, Lanet/channel/util/ALog;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return v7
.end method
