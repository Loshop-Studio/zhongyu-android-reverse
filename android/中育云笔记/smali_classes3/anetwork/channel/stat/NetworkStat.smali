.class public Lanetwork/channel/stat/NetworkStat;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getNetworkStat()Lanetwork/channel/stat/INetworkStat;
    .locals 1

    .line 1
    invoke-static {}, Lanetwork/channel/stat/NetworkStatCache;->getInstance()Lanetwork/channel/stat/NetworkStatCache;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
