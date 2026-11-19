.class Lanetwork/channel/aidl/NetworkService$1;
.super Lanetwork/channel/aidl/IRemoteNetworkGetter$Stub;
.source "SourceFile"


# instance fields
.field final synthetic this$0:Lanetwork/channel/aidl/NetworkService;


# direct methods
.method public constructor <init>(Lanetwork/channel/aidl/NetworkService;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lanetwork/channel/aidl/NetworkService$1;->this$0:Lanetwork/channel/aidl/NetworkService;

    .line 2
    .line 3
    invoke-direct {p0}, Lanetwork/channel/aidl/IRemoteNetworkGetter$Stub;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public get(I)Lanetwork/channel/aidl/RemoteNetwork;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    iget-object p1, p0, Lanetwork/channel/aidl/NetworkService$1;->this$0:Lanetwork/channel/aidl/NetworkService;

    .line 5
    .line 6
    invoke-static {p1}, Lanetwork/channel/aidl/NetworkService;->a(Lanetwork/channel/aidl/NetworkService;)Lanetwork/channel/aidl/RemoteNetwork$Stub;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :cond_0
    iget-object p1, p0, Lanetwork/channel/aidl/NetworkService$1;->this$0:Lanetwork/channel/aidl/NetworkService;

    .line 12
    .line 13
    invoke-static {p1}, Lanetwork/channel/aidl/NetworkService;->b(Lanetwork/channel/aidl/NetworkService;)Lanetwork/channel/aidl/RemoteNetwork$Stub;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
