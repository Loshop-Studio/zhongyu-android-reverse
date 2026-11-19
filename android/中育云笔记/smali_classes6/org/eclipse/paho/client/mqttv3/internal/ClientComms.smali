.class public Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/eclipse/paho/client/mqttv3/internal/ClientComms$ConnectBG;,
        Lorg/eclipse/paho/client/mqttv3/internal/ClientComms$DisconnectBG;,
        Lorg/eclipse/paho/client/mqttv3/internal/ClientComms$MessageDiscardedCallback;,
        Lorg/eclipse/paho/client/mqttv3/internal/ClientComms$ReconnectDisconnectedBufferCallback;
    }
.end annotation


# static fields
.field public static BUILD_LEVEL:Ljava/lang/String; = "L${build.level}"

.field private static final CLOSED:B = 0x4t

.field private static final CONNECTED:B = 0x0t

.field private static final CONNECTING:B = 0x1t

.field private static final DISCONNECTED:B = 0x3t

.field private static final DISCONNECTING:B = 0x2t

.field public static VERSION:Ljava/lang/String; = "${project.version}"


# instance fields
.field private final CLASS_NAME:Ljava/lang/String;

.field private callback:Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;

.field private client:Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

.field private clientState:Lorg/eclipse/paho/client/mqttv3/internal/ClientState;

.field private closePending:Z

.field private final conLock:Ljava/lang/Object;

.field private conOptions:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

.field private conState:B

.field private disconnectedMessageBuffer:Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;

.field private executorService:Ljava/util/concurrent/ExecutorService;

.field private final log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

.field private networkModuleIndex:I

.field private networkModules:[Lorg/eclipse/paho/client/mqttv3/internal/NetworkModule;

.field private persistence:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

.field private pingSender:Lorg/eclipse/paho/client/mqttv3/MqttPingSender;

.field private receiver:Lorg/eclipse/paho/client/mqttv3/internal/CommsReceiver;

.field private resting:Z

.field private sender:Lorg/eclipse/paho/client/mqttv3/internal/CommsSender;

.field private stoppingComms:Z

.field private tokenStore:Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;Lorg/eclipse/paho/client/mqttv3/MqttPingSender;Ljava/util/concurrent/ExecutorService;Lorg/eclipse/paho/client/mqttv3/internal/HighResolutionTimer;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->CLASS_NAME:Ljava/lang/String;

    .line 11
    .line 12
    const-string v1, "org.eclipse.paho.client.mqttv3.internal.nls.logcat"

    .line 13
    .line 14
    invoke-static {v1, v0}, Lorg/eclipse/paho/client/mqttv3/logging/LoggerFactory;->getLogger(Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    iput-boolean v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->stoppingComms:Z

    .line 22
    .line 23
    new-instance v2, Ljava/lang/Object;

    .line 24
    .line 25
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conLock:Ljava/lang/Object;

    .line 29
    .line 30
    iput-boolean v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->closePending:Z

    .line 31
    .line 32
    iput-boolean v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->resting:Z

    .line 33
    .line 34
    const/4 v1, 0x3

    .line 35
    iput-byte v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conState:B

    .line 36
    .line 37
    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->client:Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    .line 38
    .line 39
    iput-object p2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->persistence:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 40
    .line 41
    iput-object p3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->pingSender:Lorg/eclipse/paho/client/mqttv3/MqttPingSender;

    .line 42
    .line 43
    invoke-interface {p3, p0}, Lorg/eclipse/paho/client/mqttv3/MqttPingSender;->init(Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;)V

    .line 44
    .line 45
    .line 46
    iput-object p4, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 47
    .line 48
    new-instance p1, Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;

    .line 49
    .line 50
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->getClient()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    .line 51
    .line 52
    .line 53
    move-result-object p4

    .line 54
    invoke-interface {p4}, Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;->getClientId()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p4

    .line 58
    invoke-direct {p1, p4}, Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->tokenStore:Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;

    .line 62
    .line 63
    new-instance p1, Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;

    .line 64
    .line 65
    invoke-direct {p1, p0}, Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;-><init>(Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;)V

    .line 66
    .line 67
    .line 68
    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->callback:Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;

    .line 69
    .line 70
    new-instance v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;

    .line 71
    .line 72
    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->tokenStore:Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;

    .line 73
    .line 74
    iget-object v4, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->callback:Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;

    .line 75
    .line 76
    move-object v5, p0

    .line 77
    move-object v2, p2

    .line 78
    move-object v6, p3

    .line 79
    move-object v7, p5

    .line 80
    invoke-direct/range {v1 .. v7}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;-><init>(Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;Lorg/eclipse/paho/client/mqttv3/MqttPingSender;Lorg/eclipse/paho/client/mqttv3/internal/HighResolutionTimer;)V

    .line 81
    .line 82
    .line 83
    iput-object v1, v5, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->clientState:Lorg/eclipse/paho/client/mqttv3/internal/ClientState;

    .line 84
    .line 85
    iget-object p1, v5, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->callback:Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;

    .line 86
    .line 87
    invoke-virtual {p1, v1}, Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;->setClientState(Lorg/eclipse/paho/client/mqttv3/internal/ClientState;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->getClient()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-interface {p1}, Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;->getClientId()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-interface {v0, p1}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->setResourceName(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public static synthetic access$0(Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;)Ljava/util/concurrent/ExecutorService;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1(Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;)Lorg/eclipse/paho/client/mqttv3/logging/Logger;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$10(Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;)Lorg/eclipse/paho/client/mqttv3/internal/CommsSender;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->sender:Lorg/eclipse/paho/client/mqttv3/internal/CommsSender;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$11(Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;)Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->callback:Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$12(Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;)Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->disconnectedMessageBuffer:Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$2(Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->CLASS_NAME:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$3(Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;)Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->tokenStore:Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$4(Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;)[Lorg/eclipse/paho/client/mqttv3/internal/NetworkModule;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->networkModules:[Lorg/eclipse/paho/client/mqttv3/internal/NetworkModule;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$5(Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;)I
    .locals 0

    .line 1
    iget p0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->networkModuleIndex:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$6(Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;)Lorg/eclipse/paho/client/mqttv3/internal/ClientState;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->clientState:Lorg/eclipse/paho/client/mqttv3/internal/ClientState;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$7(Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;Lorg/eclipse/paho/client/mqttv3/internal/CommsReceiver;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->receiver:Lorg/eclipse/paho/client/mqttv3/internal/CommsReceiver;

    .line 2
    .line 3
    return-void
.end method

.method public static synthetic access$8(Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;)Lorg/eclipse/paho/client/mqttv3/internal/CommsReceiver;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->receiver:Lorg/eclipse/paho/client/mqttv3/internal/CommsReceiver;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$9(Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;Lorg/eclipse/paho/client/mqttv3/internal/CommsSender;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->sender:Lorg/eclipse/paho/client/mqttv3/internal/CommsSender;

    .line 2
    .line 3
    return-void
.end method

.method private handleOldTokens(Lorg/eclipse/paho/client/mqttv3/MqttToken;Lorg/eclipse/paho/client/mqttv3/MqttException;)Lorg/eclipse/paho/client/mqttv3/MqttToken;
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->CLASS_NAME:Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, "handleOldTokens"

    .line 6
    .line 7
    const-string v3, "222"

    .line 8
    .line 9
    invoke-interface {v0, v1, v2, v3}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    :try_start_0
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/MqttToken;->isComplete()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->tokenStore:Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;

    .line 22
    .line 23
    iget-object v2, p1, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lorg/eclipse/paho/client/mqttv3/internal/Token;

    .line 24
    .line 25
    invoke-virtual {v2}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->getKey()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v2}, Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;->getToken(Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/MqttToken;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-nez v1, :cond_0

    .line 34
    .line 35
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->tokenStore:Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;

    .line 36
    .line 37
    iget-object v2, p1, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lorg/eclipse/paho/client/mqttv3/internal/Token;

    .line 38
    .line 39
    invoke-virtual {v2}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->getKey()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v1, p1, v2}, Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;->saveToken(Lorg/eclipse/paho/client/mqttv3/MqttToken;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->clientState:Lorg/eclipse/paho/client/mqttv3/internal/ClientState;

    .line 47
    .line 48
    invoke-virtual {p1, p2}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->resolveOldTokens(Lorg/eclipse/paho/client/mqttv3/MqttException;)Ljava/util/Vector;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p1}, Ljava/util/Vector;->elements()Ljava/util/Enumeration;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    :goto_0
    invoke-interface {p1}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    if-nez p2, :cond_1

    .line 61
    .line 62
    return-object v0

    .line 63
    :cond_1
    invoke-interface {p1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    check-cast p2, Lorg/eclipse/paho/client/mqttv3/MqttToken;

    .line 68
    .line 69
    iget-object v1, p2, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lorg/eclipse/paho/client/mqttv3/internal/Token;

    .line 70
    .line 71
    invoke-virtual {v1}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->getKey()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    const-string v2, "Disc"

    .line 76
    .line 77
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-nez v1, :cond_3

    .line 82
    .line 83
    iget-object v1, p2, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lorg/eclipse/paho/client/mqttv3/internal/Token;

    .line 84
    .line 85
    invoke-virtual {v1}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->getKey()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    const-string v2, "Con"

    .line 90
    .line 91
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_2

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_2
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->callback:Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;

    .line 99
    .line 100
    invoke-virtual {v1, p2}, Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;->asyncOperationComplete(Lorg/eclipse/paho/client/mqttv3/MqttToken;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_3
    :goto_1
    move-object v0, p2

    .line 105
    goto :goto_0

    .line 106
    :catch_0
    return-object v0
.end method

.method private handleRunException(Ljava/lang/Exception;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->CLASS_NAME:Ljava/lang/String;

    .line 4
    .line 5
    const-string v3, "804"

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    const-string v2, "handleRunException"

    .line 9
    .line 10
    move-object v5, p1

    .line 11
    invoke-interface/range {v0 .. v5}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    instance-of p1, v5, Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    new-instance p1, Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 19
    .line 20
    const/16 v0, 0x7d6d

    .line 21
    .line 22
    invoke-direct {p1, v0, v5}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(ILjava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object p1, v5

    .line 27
    check-cast p1, Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 28
    .line 29
    :goto_0
    const/4 v0, 0x0

    .line 30
    invoke-virtual {p0, v0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->shutdownConnection(Lorg/eclipse/paho/client/mqttv3/MqttToken;Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method private shutdownExecutorService()V
    .locals 5

    .line 1
    const-string v0, "shutdownExecutorService"

    .line 2
    .line 3
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conOptions:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {v2}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->getExecutorServiceTimeout()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    int-to-long v2, v2

    .line 21
    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 22
    .line 23
    invoke-interface {v1, v2, v3, v4}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 35
    .line 36
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conOptions:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    .line 37
    .line 38
    invoke-virtual {v2}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->getExecutorServiceTimeout()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    int-to-long v2, v2

    .line 43
    invoke-interface {v1, v2, v3, v4}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-nez v1, :cond_0

    .line 48
    .line 49
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 50
    .line 51
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->CLASS_NAME:Ljava/lang/String;

    .line 52
    .line 53
    const-string v3, "executorService did not terminate"

    .line 54
    .line 55
    invoke-interface {v1, v2, v0, v3}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    .line 57
    .line 58
    :cond_0
    return-void

    .line 59
    :catch_0
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 60
    .line 61
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 62
    .line 63
    .line 64
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 69
    .line 70
    .line 71
    return-void
.end method


# virtual methods
.method public checkForActivity()Lorg/eclipse/paho/client/mqttv3/MqttToken;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->checkForActivity(Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/MqttToken;

    move-result-object v0

    return-object v0
.end method

.method public checkForActivity(Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/MqttToken;
    .locals 1

    .line 2
    :try_start_0
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->clientState:Lorg/eclipse/paho/client/mqttv3/internal/ClientState;

    invoke-virtual {v0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->checkForActivity(Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/MqttToken;

    move-result-object p1
    :try_end_0
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    .line 3
    :goto_0
    invoke-direct {p0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->handleRunException(Ljava/lang/Exception;)V

    goto :goto_2

    .line 4
    :goto_1
    invoke-direct {p0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->handleRunException(Ljava/lang/Exception;)V

    :goto_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public close(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->isClosed()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_4

    .line 9
    .line 10
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->isDisconnected()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    :cond_0
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 19
    .line 20
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->CLASS_NAME:Ljava/lang/String;

    .line 21
    .line 22
    const-string v2, "close"

    .line 23
    .line 24
    const-string v3, "224"

    .line 25
    .line 26
    invoke-interface {p1, v1, v2, v3}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->isConnecting()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-nez p1, :cond_3

    .line 34
    .line 35
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->isConnected()Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-nez p1, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->isDisconnecting()Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_1

    .line 46
    .line 47
    const/4 p1, 0x1

    .line 48
    iput-boolean p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->closePending:Z

    .line 49
    .line 50
    monitor-exit v0

    .line 51
    return-void

    .line 52
    :catchall_0
    move-exception p1

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    const/4 p1, 0x4

    .line 55
    iput-byte p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conState:B

    .line 56
    .line 57
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->clientState:Lorg/eclipse/paho/client/mqttv3/internal/ClientState;

    .line 58
    .line 59
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->close()V

    .line 60
    .line 61
    .line 62
    const/4 p1, 0x0

    .line 63
    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->clientState:Lorg/eclipse/paho/client/mqttv3/internal/ClientState;

    .line 64
    .line 65
    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->callback:Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;

    .line 66
    .line 67
    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->persistence:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 68
    .line 69
    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->sender:Lorg/eclipse/paho/client/mqttv3/internal/CommsSender;

    .line 70
    .line 71
    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->pingSender:Lorg/eclipse/paho/client/mqttv3/MqttPingSender;

    .line 72
    .line 73
    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->receiver:Lorg/eclipse/paho/client/mqttv3/internal/CommsReceiver;

    .line 74
    .line 75
    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->networkModules:[Lorg/eclipse/paho/client/mqttv3/internal/NetworkModule;

    .line 76
    .line 77
    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conOptions:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    .line 78
    .line 79
    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->tokenStore:Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    const/16 p1, 0x7d64

    .line 83
    .line 84
    invoke-static {p1}, Lorg/eclipse/paho/client/mqttv3/internal/ExceptionHelper;->createMqttException(I)Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    throw p1

    .line 89
    :cond_3
    new-instance p1, Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 90
    .line 91
    const/16 v1, 0x7d6e

    .line 92
    .line 93
    invoke-direct {p1, v1}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(I)V

    .line 94
    .line 95
    .line 96
    throw p1

    .line 97
    :cond_4
    :goto_0
    monitor-exit v0

    .line 98
    return-void

    .line 99
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    throw p1
.end method

.method public connect(Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V
    .locals 11

    .line 1
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->isDisconnected()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-boolean v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->closePending:Z

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 15
    .line 16
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->CLASS_NAME:Ljava/lang/String;

    .line 17
    .line 18
    const-string v3, "connect"

    .line 19
    .line 20
    const-string v4, "214"

    .line 21
    .line 22
    invoke-interface {v0, v2, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    iput-byte v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conState:B

    .line 27
    .line 28
    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conOptions:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    .line 29
    .line 30
    new-instance v2, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttConnect;

    .line 31
    .line 32
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->client:Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    .line 33
    .line 34
    invoke-interface {p1}, Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;->getClientId()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conOptions:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    .line 39
    .line 40
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->getMqttVersion()I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conOptions:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    .line 45
    .line 46
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->isCleanSession()Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conOptions:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    .line 51
    .line 52
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->getKeepAliveInterval()I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conOptions:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    .line 57
    .line 58
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->getUserName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conOptions:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    .line 63
    .line 64
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->getPassword()[C

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conOptions:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    .line 69
    .line 70
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->getWillMessage()Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    .line 71
    .line 72
    .line 73
    move-result-object v9

    .line 74
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conOptions:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    .line 75
    .line 76
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->getWillDestination()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v10

    .line 80
    invoke-direct/range {v2 .. v10}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttConnect;-><init>(Ljava/lang/String;IZILjava/lang/String;[CLorg/eclipse/paho/client/mqttv3/MqttMessage;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->clientState:Lorg/eclipse/paho/client/mqttv3/internal/ClientState;

    .line 84
    .line 85
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conOptions:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    .line 86
    .line 87
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->getKeepAliveInterval()I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    int-to-long v3, v0

    .line 92
    invoke-virtual {p1, v3, v4}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->setKeepAliveSecs(J)V

    .line 93
    .line 94
    .line 95
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->clientState:Lorg/eclipse/paho/client/mqttv3/internal/ClientState;

    .line 96
    .line 97
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conOptions:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    .line 98
    .line 99
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->isCleanSession()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    invoke-virtual {p1, v0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->setCleanSession(Z)V

    .line 104
    .line 105
    .line 106
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->clientState:Lorg/eclipse/paho/client/mqttv3/internal/ClientState;

    .line 107
    .line 108
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conOptions:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    .line 109
    .line 110
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->getMaxInflight()I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    invoke-virtual {p1, v0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->setMaxInflight(I)V

    .line 115
    .line 116
    .line 117
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->tokenStore:Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;

    .line 118
    .line 119
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;->open()V

    .line 120
    .line 121
    .line 122
    move-object v6, v2

    .line 123
    new-instance v2, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms$ConnectBG;

    .line 124
    .line 125
    iget-object v7, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->executorService:Ljava/util/concurrent/ExecutorService;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 126
    .line 127
    move-object v4, p0

    .line 128
    move-object v3, p0

    .line 129
    move-object v5, p2

    .line 130
    :try_start_1
    invoke-direct/range {v2 .. v7}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms$ConnectBG;-><init>(Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;Lorg/eclipse/paho/client/mqttv3/MqttToken;Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttConnect;Ljava/util/concurrent/ExecutorService;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms$ConnectBG;->start()V

    .line 134
    .line 135
    .line 136
    monitor-exit v1

    .line 137
    return-void

    .line 138
    :catchall_0
    move-exception v0

    .line 139
    :goto_0
    move-object p1, v0

    .line 140
    goto :goto_1

    .line 141
    :catchall_1
    move-exception v0

    .line 142
    move-object v3, p0

    .line 143
    goto :goto_0

    .line 144
    :cond_0
    move-object v3, p0

    .line 145
    iget-object p1, v3, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 146
    .line 147
    iget-object p2, v3, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->CLASS_NAME:Ljava/lang/String;

    .line 148
    .line 149
    const-string v0, "connect"

    .line 150
    .line 151
    const-string v2, "207"

    .line 152
    .line 153
    iget-byte v4, v3, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conState:B

    .line 154
    .line 155
    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    invoke-interface {p1, p2, v0, v2, v4}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->isClosed()Z

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    if-nez p1, :cond_3

    .line 171
    .line 172
    iget-boolean p1, v3, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->closePending:Z

    .line 173
    .line 174
    if-nez p1, :cond_3

    .line 175
    .line 176
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->isConnecting()Z

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    if-nez p1, :cond_2

    .line 181
    .line 182
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->isDisconnecting()Z

    .line 183
    .line 184
    .line 185
    move-result p1

    .line 186
    if-eqz p1, :cond_1

    .line 187
    .line 188
    new-instance p1, Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 189
    .line 190
    const/16 p2, 0x7d66

    .line 191
    .line 192
    invoke-direct {p1, p2}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(I)V

    .line 193
    .line 194
    .line 195
    throw p1

    .line 196
    :cond_1
    const/16 p1, 0x7d64

    .line 197
    .line 198
    invoke-static {p1}, Lorg/eclipse/paho/client/mqttv3/internal/ExceptionHelper;->createMqttException(I)Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    throw p1

    .line 203
    :cond_2
    new-instance p1, Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 204
    .line 205
    const/16 p2, 0x7d6e

    .line 206
    .line 207
    invoke-direct {p1, p2}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(I)V

    .line 208
    .line 209
    .line 210
    throw p1

    .line 211
    :cond_3
    new-instance p1, Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 212
    .line 213
    const/16 p2, 0x7d6f

    .line 214
    .line 215
    invoke-direct {p1, p2}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(I)V

    .line 216
    .line 217
    .line 218
    throw p1

    .line 219
    :goto_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 220
    throw p1
.end method

.method public connectComplete(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttConnack;Lorg/eclipse/paho/client/mqttv3/MqttException;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttConnack;->getReturnCode()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conLock:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    :try_start_0
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 11
    .line 12
    iget-object p2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->CLASS_NAME:Ljava/lang/String;

    .line 13
    .line 14
    const-string v1, "connectComplete"

    .line 15
    .line 16
    const-string v2, "215"

    .line 17
    .line 18
    invoke-interface {p1, p2, v1, v2}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    iput-byte p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conState:B

    .line 23
    .line 24
    monitor-exit v0

    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 30
    .line 31
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->CLASS_NAME:Ljava/lang/String;

    .line 32
    .line 33
    const-string v2, "connectComplete"

    .line 34
    .line 35
    const-string v3, "204"

    .line 36
    .line 37
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-interface {v0, v1, v2, v3, p1}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    throw p2

    .line 49
    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    throw p1
.end method

.method public deleteBufferedMessage(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->disconnectedMessageBuffer:Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;->deleteMessage(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public deliveryComplete(I)V
    .locals 1

    .line 2
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->clientState:Lorg/eclipse/paho/client/mqttv3/internal/ClientState;

    invoke-virtual {v0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->deliveryComplete(I)V

    return-void
.end method

.method public deliveryComplete(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->clientState:Lorg/eclipse/paho/client/mqttv3/internal/ClientState;

    invoke-virtual {v0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->deliveryComplete(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;)V

    return-void
.end method

.method public disconnect(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttDisconnect;JLorg/eclipse/paho/client/mqttv3/MqttToken;)V
    .locals 9

    .line 1
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->isClosed()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_3

    .line 9
    .line 10
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->isDisconnected()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_2

    .line 15
    .line 16
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->isDisconnecting()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->callback:Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;

    .line 27
    .line 28
    invoke-virtual {v2}, Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;->getThread()Ljava/lang/Thread;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-eq v0, v2, :cond_0

    .line 33
    .line 34
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 35
    .line 36
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->CLASS_NAME:Ljava/lang/String;

    .line 37
    .line 38
    const-string v3, "disconnect"

    .line 39
    .line 40
    const-string v4, "218"

    .line 41
    .line 42
    invoke-interface {v0, v2, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 v0, 0x2

    .line 46
    iput-byte v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conState:B

    .line 47
    .line 48
    new-instance v2, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms$DisconnectBG;

    .line 49
    .line 50
    iget-object v8, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->executorService:Ljava/util/concurrent/ExecutorService;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 51
    .line 52
    move-object v3, p0

    .line 53
    move-object v4, p1

    .line 54
    move-wide v5, p2

    .line 55
    move-object v7, p4

    .line 56
    :try_start_1
    invoke-direct/range {v2 .. v8}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms$DisconnectBG;-><init>(Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttDisconnect;JLorg/eclipse/paho/client/mqttv3/MqttToken;Ljava/util/concurrent/ExecutorService;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms$DisconnectBG;->start()V

    .line 60
    .line 61
    .line 62
    monitor-exit v1

    .line 63
    return-void

    .line 64
    :catchall_0
    move-exception v0

    .line 65
    :goto_0
    move-object p1, v0

    .line 66
    goto :goto_1

    .line 67
    :catchall_1
    move-exception v0

    .line 68
    move-object v3, p0

    .line 69
    goto :goto_0

    .line 70
    :cond_0
    move-object v3, p0

    .line 71
    iget-object p1, v3, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 72
    .line 73
    iget-object p2, v3, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->CLASS_NAME:Ljava/lang/String;

    .line 74
    .line 75
    const-string p3, "disconnect"

    .line 76
    .line 77
    const-string p4, "210"

    .line 78
    .line 79
    invoke-interface {p1, p2, p3, p4}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    const/16 p1, 0x7d6b

    .line 83
    .line 84
    invoke-static {p1}, Lorg/eclipse/paho/client/mqttv3/internal/ExceptionHelper;->createMqttException(I)Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    throw p1

    .line 89
    :cond_1
    move-object v3, p0

    .line 90
    iget-object p1, v3, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 91
    .line 92
    iget-object p2, v3, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->CLASS_NAME:Ljava/lang/String;

    .line 93
    .line 94
    const-string p3, "disconnect"

    .line 95
    .line 96
    const-string p4, "219"

    .line 97
    .line 98
    invoke-interface {p1, p2, p3, p4}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    const/16 p1, 0x7d66

    .line 102
    .line 103
    invoke-static {p1}, Lorg/eclipse/paho/client/mqttv3/internal/ExceptionHelper;->createMqttException(I)Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    throw p1

    .line 108
    :cond_2
    move-object v3, p0

    .line 109
    iget-object p1, v3, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 110
    .line 111
    iget-object p2, v3, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->CLASS_NAME:Ljava/lang/String;

    .line 112
    .line 113
    const-string p3, "disconnect"

    .line 114
    .line 115
    const-string p4, "211"

    .line 116
    .line 117
    invoke-interface {p1, p2, p3, p4}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    const/16 p1, 0x7d65

    .line 121
    .line 122
    invoke-static {p1}, Lorg/eclipse/paho/client/mqttv3/internal/ExceptionHelper;->createMqttException(I)Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    throw p1

    .line 127
    :cond_3
    move-object v3, p0

    .line 128
    iget-object p1, v3, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 129
    .line 130
    iget-object p2, v3, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->CLASS_NAME:Ljava/lang/String;

    .line 131
    .line 132
    const-string p3, "disconnect"

    .line 133
    .line 134
    const-string p4, "223"

    .line 135
    .line 136
    invoke-interface {p1, p2, p3, p4}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    const/16 p1, 0x7d6f

    .line 140
    .line 141
    invoke-static {p1}, Lorg/eclipse/paho/client/mqttv3/internal/ExceptionHelper;->createMqttException(I)Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    throw p1

    .line 146
    :goto_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 147
    throw p1
.end method

.method public disconnectForcibly(JJ)V
    .locals 6

    const/4 v5, 0x1

    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    .line 1
    invoke-virtual/range {v0 .. v5}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->disconnectForcibly(JJZ)V

    return-void
.end method

.method public disconnectForcibly(JJZ)V
    .locals 1

    const/4 v0, 0x2

    .line 2
    iput-byte v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conState:B

    .line 3
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->clientState:Lorg/eclipse/paho/client/mqttv3/internal/ClientState;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, p1, p2}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->quiesce(J)V

    .line 5
    :cond_0
    new-instance p1, Lorg/eclipse/paho/client/mqttv3/MqttToken;

    iget-object p2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->client:Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    invoke-interface {p2}, Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;->getClientId()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/eclipse/paho/client/mqttv3/MqttToken;-><init>(Ljava/lang/String;)V

    const/4 p2, 0x0

    if-eqz p5, :cond_1

    .line 6
    :try_start_0
    new-instance p5, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttDisconnect;

    invoke-direct {p5}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttDisconnect;-><init>()V

    invoke-virtual {p0, p5, p1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->internalSend(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    .line 7
    invoke-virtual {p1, p3, p4}, Lorg/eclipse/paho/client/mqttv3/MqttToken;->waitForCompletion(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p3

    .line 8
    iget-object p4, p1, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lorg/eclipse/paho/client/mqttv3/internal/Token;

    invoke-virtual {p4, p2, p2}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->markComplete(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    .line 9
    invoke-virtual {p0, p1, p2}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->shutdownConnection(Lorg/eclipse/paho/client/mqttv3/MqttToken;Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    .line 10
    throw p3

    .line 11
    :catch_0
    :cond_1
    :goto_0
    iget-object p3, p1, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lorg/eclipse/paho/client/mqttv3/internal/Token;

    invoke-virtual {p3, p2, p2}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->markComplete(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    .line 12
    invoke-virtual {p0, p1, p2}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->shutdownConnection(Lorg/eclipse/paho/client/mqttv3/MqttToken;Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    return-void
.end method

.method public getActualInFlight()I
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->clientState:Lorg/eclipse/paho/client/mqttv3/internal/ClientState;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->getActualInFlight()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getBufferedMessage(I)Lorg/eclipse/paho/client/mqttv3/MqttMessage;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->disconnectedMessageBuffer:Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;->getMessage(I)Lorg/eclipse/paho/client/mqttv3/BufferedMessage;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/BufferedMessage;->getMessage()Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;

    .line 12
    .line 13
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;->getMessage()Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public getBufferedMessageCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->disconnectedMessageBuffer:Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;->getMessageCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getClient()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->client:Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    .line 2
    .line 3
    return-object v0
.end method

.method public getClientState()Lorg/eclipse/paho/client/mqttv3/internal/ClientState;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->clientState:Lorg/eclipse/paho/client/mqttv3/internal/ClientState;

    .line 2
    .line 3
    return-object v0
.end method

.method public getConOptions()Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conOptions:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDebug()Ljava/util/Properties;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/Properties;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/Properties;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-byte v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conState:B

    .line 7
    .line 8
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "conState"

    .line 13
    .line 14
    invoke-virtual {v0, v2, v1}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->getClient()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-interface {v1}, Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;->getServerURI()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v2, "serverURI"

    .line 26
    .line 27
    invoke-virtual {v0, v2, v1}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    const-string v1, "callback"

    .line 31
    .line 32
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->callback:Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;

    .line 33
    .line 34
    invoke-virtual {v0, v1, v2}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    iget-boolean v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->stoppingComms:Z

    .line 38
    .line 39
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const-string v2, "stoppingComms"

    .line 44
    .line 45
    invoke-virtual {v0, v2, v1}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    return-object v0
.end method

.method public getKeepAlive()J
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->clientState:Lorg/eclipse/paho/client/mqttv3/internal/ClientState;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->getKeepAlive()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public getNetworkModuleIndex()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->networkModuleIndex:I

    .line 2
    .line 3
    return v0
.end method

.method public getNetworkModules()[Lorg/eclipse/paho/client/mqttv3/internal/NetworkModule;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->networkModules:[Lorg/eclipse/paho/client/mqttv3/internal/NetworkModule;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPendingDeliveryTokens()[Lorg/eclipse/paho/client/mqttv3/MqttDeliveryToken;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->tokenStore:Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;->getOutstandingDelTokens()[Lorg/eclipse/paho/client/mqttv3/MqttDeliveryToken;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getReceiver()Lorg/eclipse/paho/client/mqttv3/internal/CommsReceiver;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->receiver:Lorg/eclipse/paho/client/mqttv3/internal/CommsReceiver;

    .line 2
    .line 3
    return-object v0
.end method

.method public getTopic(Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/MqttTopic;
    .locals 1

    .line 1
    new-instance v0, Lorg/eclipse/paho/client/mqttv3/MqttTopic;

    .line 2
    .line 3
    invoke-direct {v0, p1, p0}, Lorg/eclipse/paho/client/mqttv3/MqttTopic;-><init>(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public internalSend(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->CLASS_NAME:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getKey()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    filled-new-array {v2, p1, p2}, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const-string v3, "internalSend"

    .line 14
    .line 15
    const-string v4, "200"

    .line 16
    .line 17
    invoke-interface {v0, v1, v3, v4, v2}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2}, Lorg/eclipse/paho/client/mqttv3/MqttToken;->getClient()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    iget-object v0, p2, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lorg/eclipse/paho/client/mqttv3/internal/Token;

    .line 27
    .line 28
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->getClient()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->setClient(Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;)V

    .line 33
    .line 34
    .line 35
    :try_start_0
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->clientState:Lorg/eclipse/paho/client/mqttv3/internal/ClientState;

    .line 36
    .line 37
    invoke-virtual {v0, p1, p2}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->send(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V
    :try_end_0
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :catch_0
    move-exception v0

    .line 42
    iget-object p2, p2, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lorg/eclipse/paho/client/mqttv3/internal/Token;

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    invoke-virtual {p2, v1}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->setClient(Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;)V

    .line 46
    .line 47
    .line 48
    instance-of p2, p1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;

    .line 49
    .line 50
    if-eqz p2, :cond_0

    .line 51
    .line 52
    iget-object p2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->clientState:Lorg/eclipse/paho/client/mqttv3/internal/ClientState;

    .line 53
    .line 54
    check-cast p1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;

    .line 55
    .line 56
    invoke-virtual {p2, p1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->undo(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;)V

    .line 57
    .line 58
    .line 59
    :cond_0
    throw v0

    .line 60
    :cond_1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 61
    .line 62
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->CLASS_NAME:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getKey()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    filled-new-array {v2, p1, p2}, [Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    const-string p2, "213"

    .line 73
    .line 74
    invoke-interface {v0, v1, v3, p2, p1}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    new-instance p1, Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 78
    .line 79
    const/16 p2, 0x7dc9

    .line 80
    .line 81
    invoke-direct {p1, p2}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(I)V

    .line 82
    .line 83
    .line 84
    throw p1
.end method

.method public isClosed()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-byte v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conState:B

    .line 5
    .line 6
    const/4 v2, 0x4

    .line 7
    if-ne v1, v2, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    :goto_0
    monitor-exit v0

    .line 13
    return v1

    .line 14
    :catchall_0
    move-exception v1

    .line 15
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw v1
.end method

.method public isConnected()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-byte v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conState:B

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    :goto_0
    monitor-exit v0

    .line 12
    return v1

    .line 13
    :catchall_0
    move-exception v1

    .line 14
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    throw v1
.end method

.method public isConnecting()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-byte v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conState:B

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-ne v1, v2, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v2, 0x0

    .line 11
    :goto_0
    monitor-exit v0

    .line 12
    return v2

    .line 13
    :catchall_0
    move-exception v1

    .line 14
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    throw v1
.end method

.method public isDisconnected()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-byte v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conState:B

    .line 5
    .line 6
    const/4 v2, 0x3

    .line 7
    if-ne v1, v2, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    :goto_0
    monitor-exit v0

    .line 13
    return v1

    .line 14
    :catchall_0
    move-exception v1

    .line 15
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw v1
.end method

.method public isDisconnecting()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-byte v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conState:B

    .line 5
    .line 6
    const/4 v2, 0x2

    .line 7
    if-ne v1, v2, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    :goto_0
    monitor-exit v0

    .line 13
    return v1

    .line 14
    :catchall_0
    move-exception v1

    .line 15
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw v1
.end method

.method public isResting()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->resting:Z

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw v1
.end method

.method public messageArrivedComplete(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->callback:Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;->messageArrivedComplete(II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public notifyConnect()V
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->disconnectedMessageBuffer:Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 6
    .line 7
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->CLASS_NAME:Ljava/lang/String;

    .line 8
    .line 9
    const-string v2, "509"

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    const-string v4, "notifyConnect"

    .line 13
    .line 14
    invoke-interface {v0, v1, v4, v2, v3}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->disconnectedMessageBuffer:Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;

    .line 18
    .line 19
    new-instance v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms$ReconnectDisconnectedBufferCallback;

    .line 20
    .line 21
    invoke-direct {v1, p0, v4}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms$ReconnectDisconnectedBufferCallback;-><init>(Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;->setPublishCallback(Lorg/eclipse/paho/client/mqttv3/internal/IDisconnectedBufferCallback;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->disconnectedMessageBuffer:Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;

    .line 28
    .line 29
    new-instance v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms$MessageDiscardedCallback;

    .line 30
    .line 31
    invoke-direct {v1, p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms$MessageDiscardedCallback;-><init>(Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;->setMessageDiscardedCallBack(Lorg/eclipse/paho/client/mqttv3/internal/IDiscardedBufferMessageCallback;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 38
    .line 39
    if-nez v0, :cond_0

    .line 40
    .line 41
    new-instance v0, Ljava/lang/Thread;

    .line 42
    .line 43
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->disconnectedMessageBuffer:Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;

    .line 44
    .line 45
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_0
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->disconnectedMessageBuffer:Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;

    .line 53
    .line 54
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    return-void
.end method

.method public removeMessage(Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->clientState:Lorg/eclipse/paho/client/mqttv3/internal/ClientState;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->removeMessage(Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public removeMessageListener(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->callback:Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;->removeMessageListener(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public sendNoWait(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->isConnected()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "sendNoWait"

    .line 6
    .line 7
    if-nez v0, :cond_4

    .line 8
    .line 9
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->isConnected()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    instance-of v0, p1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttConnect;

    .line 16
    .line 17
    if-nez v0, :cond_4

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->isDisconnecting()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    instance-of v0, p1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttDisconnect;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->disconnectedMessageBuffer:Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;

    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 35
    .line 36
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->CLASS_NAME:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getKey()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    const-string v4, "508"

    .line 47
    .line 48
    invoke-interface {v0, v2, v1, v4, v3}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->disconnectedMessageBuffer:Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;

    .line 52
    .line 53
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;->isPersistBuffer()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->clientState:Lorg/eclipse/paho/client/mqttv3/internal/ClientState;

    .line 60
    .line 61
    invoke-virtual {v0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->persistBufferedMessage(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)V

    .line 62
    .line 63
    .line 64
    :cond_2
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->disconnectedMessageBuffer:Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;

    .line 65
    .line 66
    invoke-virtual {v0, p1, p2}, Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;->putMessage(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_3
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 71
    .line 72
    iget-object p2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->CLASS_NAME:Ljava/lang/String;

    .line 73
    .line 74
    const-string v0, "208"

    .line 75
    .line 76
    invoke-interface {p1, p2, v1, v0}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const/16 p1, 0x7d68

    .line 80
    .line 81
    invoke-static {p1}, Lorg/eclipse/paho/client/mqttv3/internal/ExceptionHelper;->createMqttException(I)Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    throw p1

    .line 86
    :cond_4
    :goto_0
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->disconnectedMessageBuffer:Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;

    .line 87
    .line 88
    if-eqz v0, :cond_6

    .line 89
    .line 90
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;->getMessageCount()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_6

    .line 95
    .line 96
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 97
    .line 98
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->CLASS_NAME:Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getKey()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    const-string v4, "507"

    .line 109
    .line 110
    invoke-interface {v0, v2, v1, v4, v3}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->disconnectedMessageBuffer:Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;

    .line 114
    .line 115
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;->isPersistBuffer()Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-eqz v0, :cond_5

    .line 120
    .line 121
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->clientState:Lorg/eclipse/paho/client/mqttv3/internal/ClientState;

    .line 122
    .line 123
    invoke-virtual {v0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->persistBufferedMessage(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)V

    .line 124
    .line 125
    .line 126
    :cond_5
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->disconnectedMessageBuffer:Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;

    .line 127
    .line 128
    invoke-virtual {v0, p1, p2}, Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;->putMessage(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_6
    invoke-virtual {p0, p1, p2}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->internalSend(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    .line 133
    .line 134
    .line 135
    return-void
.end method

.method public setCallback(Lorg/eclipse/paho/client/mqttv3/MqttCallback;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->callback:Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;->setCallback(Lorg/eclipse/paho/client/mqttv3/MqttCallback;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setDisconnectedMessageBuffer(Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->disconnectedMessageBuffer:Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;

    .line 2
    .line 3
    return-void
.end method

.method public setManualAcks(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->callback:Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;->setManualAcks(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setMessageListener(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/IMqttMessageListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->callback:Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;->setMessageListener(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/IMqttMessageListener;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setNetworkModuleIndex(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->networkModuleIndex:I

    .line 2
    .line 3
    return-void
.end method

.method public setNetworkModules([Lorg/eclipse/paho/client/mqttv3/internal/NetworkModule;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, [Lorg/eclipse/paho/client/mqttv3/internal/NetworkModule;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, [Lorg/eclipse/paho/client/mqttv3/internal/NetworkModule;

    .line 6
    .line 7
    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->networkModules:[Lorg/eclipse/paho/client/mqttv3/internal/NetworkModule;

    .line 8
    .line 9
    return-void
.end method

.method public setReconnectCallback(Lorg/eclipse/paho/client/mqttv3/MqttCallbackExtended;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->callback:Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;->setReconnectCallback(Lorg/eclipse/paho/client/mqttv3/MqttCallbackExtended;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setRestingState(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->resting:Z

    .line 2
    .line 3
    return-void
.end method

.method public shutdownConnection(Lorg/eclipse/paho/client/mqttv3/MqttToken;Lorg/eclipse/paho/client/mqttv3/MqttException;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->stoppingComms:Z

    .line 5
    .line 6
    if-nez v1, :cond_d

    .line 7
    .line 8
    iget-boolean v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->closePending:Z

    .line 9
    .line 10
    if-nez v1, :cond_d

    .line 11
    .line 12
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->isClosed()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    goto/16 :goto_3

    .line 19
    .line 20
    :cond_0
    const/4 v1, 0x1

    .line 21
    iput-boolean v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->stoppingComms:Z

    .line 22
    .line 23
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 24
    .line 25
    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->CLASS_NAME:Ljava/lang/String;

    .line 26
    .line 27
    const-string v4, "shutdownConnection"

    .line 28
    .line 29
    const-string v5, "216"

    .line 30
    .line 31
    invoke-interface {v2, v3, v4, v5}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->isConnected()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    const/4 v3, 0x0

    .line 39
    if-nez v2, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->isDisconnecting()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-nez v2, :cond_1

    .line 46
    .line 47
    move v2, v3

    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    goto/16 :goto_4

    .line 51
    .line 52
    :cond_1
    move v2, v1

    .line 53
    :goto_0
    const/4 v4, 0x2

    .line 54
    iput-byte v4, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conState:B

    .line 55
    .line 56
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    if-eqz p1, :cond_2

    .line 58
    .line 59
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/MqttToken;->isComplete()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_2

    .line 64
    .line 65
    iget-object v0, p1, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lorg/eclipse/paho/client/mqttv3/internal/Token;

    .line 66
    .line 67
    invoke-virtual {v0, p2}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->setException(Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->callback:Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;

    .line 71
    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;->stop()V

    .line 75
    .line 76
    .line 77
    :cond_3
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->receiver:Lorg/eclipse/paho/client/mqttv3/internal/CommsReceiver;

    .line 78
    .line 79
    if-eqz v0, :cond_4

    .line 80
    .line 81
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/CommsReceiver;->stop()V

    .line 82
    .line 83
    .line 84
    :cond_4
    :try_start_1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->networkModules:[Lorg/eclipse/paho/client/mqttv3/internal/NetworkModule;

    .line 85
    .line 86
    if-eqz v0, :cond_5

    .line 87
    .line 88
    iget v4, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->networkModuleIndex:I

    .line 89
    .line 90
    aget-object v0, v0, v4

    .line 91
    .line 92
    if-eqz v0, :cond_5

    .line 93
    .line 94
    invoke-interface {v0}, Lorg/eclipse/paho/client/mqttv3/internal/NetworkModule;->stop()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 95
    .line 96
    .line 97
    :catch_0
    :cond_5
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->tokenStore:Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;

    .line 98
    .line 99
    new-instance v4, Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 100
    .line 101
    const/16 v5, 0x7d66

    .line 102
    .line 103
    invoke-direct {v4, v5}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v4}, Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;->quiesce(Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    .line 107
    .line 108
    .line 109
    invoke-direct {p0, p1, p2}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->handleOldTokens(Lorg/eclipse/paho/client/mqttv3/MqttToken;Lorg/eclipse/paho/client/mqttv3/MqttException;)Lorg/eclipse/paho/client/mqttv3/MqttToken;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    :try_start_2
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->clientState:Lorg/eclipse/paho/client/mqttv3/internal/ClientState;

    .line 114
    .line 115
    invoke-virtual {v0, p2}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->disconnected(Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    .line 116
    .line 117
    .line 118
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->clientState:Lorg/eclipse/paho/client/mqttv3/internal/ClientState;

    .line 119
    .line 120
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->getCleanSession()Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-eqz v0, :cond_6

    .line 125
    .line 126
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->callback:Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;

    .line 127
    .line 128
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;->removeMessageListeners()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 129
    .line 130
    .line 131
    :catch_1
    :cond_6
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->sender:Lorg/eclipse/paho/client/mqttv3/internal/CommsSender;

    .line 132
    .line 133
    if-eqz v0, :cond_7

    .line 134
    .line 135
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/CommsSender;->stop()V

    .line 136
    .line 137
    .line 138
    :cond_7
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->pingSender:Lorg/eclipse/paho/client/mqttv3/MqttPingSender;

    .line 139
    .line 140
    if-eqz v0, :cond_8

    .line 141
    .line 142
    invoke-interface {v0}, Lorg/eclipse/paho/client/mqttv3/MqttPingSender;->stop()V

    .line 143
    .line 144
    .line 145
    :cond_8
    :try_start_3
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->disconnectedMessageBuffer:Lorg/eclipse/paho/client/mqttv3/internal/DisconnectedMessageBuffer;

    .line 146
    .line 147
    if-nez v0, :cond_9

    .line 148
    .line 149
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->persistence:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 150
    .line 151
    if-eqz v0, :cond_9

    .line 152
    .line 153
    invoke-interface {v0}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 154
    .line 155
    .line 156
    :catch_2
    :cond_9
    iget-object v4, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conLock:Ljava/lang/Object;

    .line 157
    .line 158
    monitor-enter v4

    .line 159
    :try_start_4
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 160
    .line 161
    iget-object v5, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->CLASS_NAME:Ljava/lang/String;

    .line 162
    .line 163
    const-string v6, "shutdownConnection"

    .line 164
    .line 165
    const-string v7, "217"

    .line 166
    .line 167
    invoke-interface {v0, v5, v6, v7}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    const/4 v0, 0x3

    .line 171
    iput-byte v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conState:B

    .line 172
    .line 173
    iput-boolean v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->stoppingComms:Z

    .line 174
    .line 175
    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 176
    if-eqz p1, :cond_a

    .line 177
    .line 178
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->callback:Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;

    .line 179
    .line 180
    if-eqz v0, :cond_a

    .line 181
    .line 182
    invoke-virtual {v0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;->asyncOperationComplete(Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    .line 183
    .line 184
    .line 185
    :cond_a
    if-eqz v2, :cond_b

    .line 186
    .line 187
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->callback:Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;

    .line 188
    .line 189
    if-eqz p1, :cond_b

    .line 190
    .line 191
    invoke-virtual {p1, p2}, Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;->connectionLost(Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    .line 192
    .line 193
    .line 194
    :cond_b
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->conLock:Ljava/lang/Object;

    .line 195
    .line 196
    monitor-enter p1

    .line 197
    :try_start_5
    iget-boolean p2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->closePending:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 198
    .line 199
    if-eqz p2, :cond_c

    .line 200
    .line 201
    :try_start_6
    invoke-virtual {p0, v1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->close(Z)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 202
    .line 203
    .line 204
    goto :goto_1

    .line 205
    :catchall_1
    move-exception p2

    .line 206
    goto :goto_2

    .line 207
    :catch_3
    :cond_c
    :goto_1
    :try_start_7
    monitor-exit p1

    .line 208
    return-void

    .line 209
    :goto_2
    monitor-exit p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 210
    throw p2

    .line 211
    :catchall_2
    move-exception p1

    .line 212
    :try_start_8
    monitor-exit v4
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 213
    throw p1

    .line 214
    :cond_d
    :goto_3
    :try_start_9
    monitor-exit v0

    .line 215
    return-void

    .line 216
    :goto_4
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 217
    throw p1
.end method
