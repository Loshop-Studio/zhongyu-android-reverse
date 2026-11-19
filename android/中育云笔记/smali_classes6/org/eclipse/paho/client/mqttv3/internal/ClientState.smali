.class public Lorg/eclipse/paho/client/mqttv3/internal/ClientState;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final CLASS_NAME:Ljava/lang/String; = "org.eclipse.paho.client.mqttv3.internal.ClientState"

.field private static final MAX_MSG_ID:I = 0xffff

.field private static final MIN_MSG_ID:I = 0x1

.field private static final PERSISTENCE_CONFIRMED_PREFIX:Ljava/lang/String; = "sc-"

.field private static final PERSISTENCE_RECEIVED_PREFIX:Ljava/lang/String; = "r-"

.field private static final PERSISTENCE_SENT_BUFFERED_PREFIX:Ljava/lang/String; = "sb-"

.field private static final PERSISTENCE_SENT_PREFIX:Ljava/lang/String; = "s-"


# instance fields
.field private actualInFlight:I

.field private callback:Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;

.field private cleanSession:Z

.field private clientComms:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

.field private connected:Z

.field private highResolutionTimer:Lorg/eclipse/paho/client/mqttv3/internal/HighResolutionTimer;

.field private inFlightPubRels:I

.field private inUseMsgIds:Ljava/util/Hashtable;

.field private inboundQoS2:Ljava/util/Hashtable;

.field private keepAliveNanos:J

.field private lastInboundActivity:J

.field private lastOutboundActivity:J

.field private lastPing:J

.field private log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

.field private maxInflight:I

.field private nextMsgId:I

.field private outboundQoS0:Ljava/util/Hashtable;

.field private outboundQoS1:Ljava/util/Hashtable;

.field private outboundQoS2:Ljava/util/Hashtable;

.field private volatile pendingFlows:Ljava/util/Vector;

.field private volatile pendingMessages:Ljava/util/Vector;

.field private persistence:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

.field private pingCommand:Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

.field private pingOutstanding:I

.field private final pingOutstandingLock:Ljava/lang/Object;

.field private pingSender:Lorg/eclipse/paho/client/mqttv3/MqttPingSender;

.field private final queueLock:Ljava/lang/Object;

.field private final quiesceLock:Ljava/lang/Object;

.field private quiescing:Z

.field private tokenStore:Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;Lorg/eclipse/paho/client/mqttv3/MqttPingSender;Lorg/eclipse/paho/client/mqttv3/internal/HighResolutionTimer;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 5
    .line 6
    const-string v1, "org.eclipse.paho.client.mqttv3.internal.nls.logcat"

    .line 7
    .line 8
    invoke-static {v1, v0}, Lorg/eclipse/paho/client/mqttv3/logging/LoggerFactory;->getLogger(Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iput-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    iput v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->nextMsgId:I

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    iput-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->clientComms:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    .line 19
    .line 20
    iput-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->callback:Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;

    .line 21
    .line 22
    iput v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->maxInflight:I

    .line 23
    .line 24
    iput v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->actualInFlight:I

    .line 25
    .line 26
    iput v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->inFlightPubRels:I

    .line 27
    .line 28
    new-instance v4, Ljava/lang/Object;

    .line 29
    .line 30
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v4, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->queueLock:Ljava/lang/Object;

    .line 34
    .line 35
    new-instance v4, Ljava/lang/Object;

    .line 36
    .line 37
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v4, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->quiesceLock:Ljava/lang/Object;

    .line 41
    .line 42
    iput-boolean v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->quiescing:Z

    .line 43
    .line 44
    const-wide/16 v4, 0x0

    .line 45
    .line 46
    iput-wide v4, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->lastOutboundActivity:J

    .line 47
    .line 48
    iput-wide v4, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->lastInboundActivity:J

    .line 49
    .line 50
    iput-wide v4, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->lastPing:J

    .line 51
    .line 52
    new-instance v4, Ljava/lang/Object;

    .line 53
    .line 54
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object v4, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pingOutstandingLock:Ljava/lang/Object;

    .line 58
    .line 59
    iput v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pingOutstanding:I

    .line 60
    .line 61
    iput-boolean v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->connected:Z

    .line 62
    .line 63
    iput-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS2:Ljava/util/Hashtable;

    .line 64
    .line 65
    iput-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS1:Ljava/util/Hashtable;

    .line 66
    .line 67
    iput-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS0:Ljava/util/Hashtable;

    .line 68
    .line 69
    iput-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->inboundQoS2:Ljava/util/Hashtable;

    .line 70
    .line 71
    iput-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pingSender:Lorg/eclipse/paho/client/mqttv3/MqttPingSender;

    .line 72
    .line 73
    invoke-virtual {p4}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->getClient()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-interface {v3}, Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;->getClientId()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-interface {v1, v3}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->setResourceName(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 85
    .line 86
    const-string v3, "<Init>"

    .line 87
    .line 88
    const-string v4, ""

    .line 89
    .line 90
    invoke-interface {v1, v0, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->finer(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    new-instance v0, Ljava/util/Hashtable;

    .line 94
    .line 95
    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    .line 96
    .line 97
    .line 98
    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->inUseMsgIds:Ljava/util/Hashtable;

    .line 99
    .line 100
    new-instance v0, Ljava/util/Vector;

    .line 101
    .line 102
    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    .line 103
    .line 104
    .line 105
    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingFlows:Ljava/util/Vector;

    .line 106
    .line 107
    new-instance v0, Ljava/util/Hashtable;

    .line 108
    .line 109
    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    .line 110
    .line 111
    .line 112
    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS2:Ljava/util/Hashtable;

    .line 113
    .line 114
    new-instance v0, Ljava/util/Hashtable;

    .line 115
    .line 116
    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    .line 117
    .line 118
    .line 119
    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS1:Ljava/util/Hashtable;

    .line 120
    .line 121
    new-instance v0, Ljava/util/Hashtable;

    .line 122
    .line 123
    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    .line 124
    .line 125
    .line 126
    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS0:Ljava/util/Hashtable;

    .line 127
    .line 128
    new-instance v0, Ljava/util/Hashtable;

    .line 129
    .line 130
    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    .line 131
    .line 132
    .line 133
    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->inboundQoS2:Ljava/util/Hashtable;

    .line 134
    .line 135
    new-instance v0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPingReq;

    .line 136
    .line 137
    invoke-direct {v0}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPingReq;-><init>()V

    .line 138
    .line 139
    .line 140
    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pingCommand:Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

    .line 141
    .line 142
    iput v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->inFlightPubRels:I

    .line 143
    .line 144
    iput v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->actualInFlight:I

    .line 145
    .line 146
    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->persistence:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 147
    .line 148
    iput-object p3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->callback:Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;

    .line 149
    .line 150
    iput-object p2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->tokenStore:Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;

    .line 151
    .line 152
    iput-object p4, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->clientComms:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    .line 153
    .line 154
    iput-object p5, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pingSender:Lorg/eclipse/paho/client/mqttv3/MqttPingSender;

    .line 155
    .line 156
    iput-object p6, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->highResolutionTimer:Lorg/eclipse/paho/client/mqttv3/internal/HighResolutionTimer;

    .line 157
    .line 158
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->restoreState()V

    .line 159
    .line 160
    .line 161
    return-void
.end method

.method private decrementInFlight()V
    .locals 6

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->queueLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->actualInFlight:I

    .line 5
    .line 6
    add-int/lit8 v1, v1, -0x1

    .line 7
    .line 8
    iput v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->actualInFlight:I

    .line 9
    .line 10
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 11
    .line 12
    sget-object v3, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 13
    .line 14
    const-string v4, "decrementInFlight"

    .line 15
    .line 16
    const-string v5, "646"

    .line 17
    .line 18
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {v2, v3, v4, v5, v1}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->checkQuiesceLock()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_0

    .line 34
    .line 35
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->queueLock:Ljava/lang/Object;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception v1

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    :goto_0
    monitor-exit v0

    .line 44
    return-void

    .line 45
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    throw v1
.end method

.method private declared-synchronized getNextMessageId()I
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->nextMsgId:I

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    :cond_0
    iget v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->nextMsgId:I

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    add-int/2addr v2, v3

    .line 9
    iput v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->nextMsgId:I

    .line 10
    .line 11
    const v4, 0xffff

    .line 12
    .line 13
    .line 14
    if-le v2, v4, :cond_1

    .line 15
    .line 16
    iput v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->nextMsgId:I

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    goto :goto_2

    .line 21
    :cond_1
    :goto_0
    iget v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->nextMsgId:I

    .line 22
    .line 23
    if-ne v2, v0, :cond_3

    .line 24
    .line 25
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    if-eq v1, v3, :cond_2

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_2
    const/16 v0, 0x7d01

    .line 32
    .line 33
    invoke-static {v0}, Lorg/eclipse/paho/client/mqttv3/internal/ExceptionHelper;->createMqttException(I)Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    throw v0

    .line 38
    :cond_3
    :goto_1
    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->inUseMsgIds:Ljava/util/Hashtable;

    .line 39
    .line 40
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v3, v2}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_0

    .line 49
    .line 50
    iget v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->nextMsgId:I

    .line 51
    .line 52
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->inUseMsgIds:Ljava/util/Hashtable;

    .line 57
    .line 58
    invoke-virtual {v1, v0, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    iget v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->nextMsgId:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    .line 63
    monitor-exit p0

    .line 64
    return v0

    .line 65
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    throw v0
.end method

.method private getReceivedPersistenceKey(I)Ljava/lang/String;
    .locals 2

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "r-"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private getReceivedPersistenceKey(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "r-"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private getSendBufferedPersistenceKey(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "sb-"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method

.method private getSendConfirmPersistenceKey(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "sc-"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method

.method private getSendPersistenceKey(I)Ljava/lang/String;
    .locals 2

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "s-"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private getSendPersistenceKey(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "s-"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private insertInOrder(Ljava/util/Vector;Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    invoke-virtual {p1}, Ljava/util/Vector;->size()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-lt v1, v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1, p2}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {p1, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

    .line 21
    .line 22
    invoke-virtual {v2}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-le v2, v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p1, p2, v1}, Ljava/util/Vector;->insertElementAt(Ljava/lang/Object;I)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0
.end method

.method private reOrder(Ljava/util/Vector;)Ljava/util/Vector;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/Vector;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/util/Vector;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    goto :goto_4

    .line 13
    :cond_0
    const/4 v1, 0x0

    .line 14
    move v2, v1

    .line 15
    move v3, v2

    .line 16
    move v4, v3

    .line 17
    move v5, v4

    .line 18
    :goto_0
    invoke-virtual {p1}, Ljava/util/Vector;->size()I

    .line 19
    .line 20
    .line 21
    move-result v6

    .line 22
    if-lt v2, v6, :cond_4

    .line 23
    .line 24
    invoke-virtual {p1, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

    .line 29
    .line 30
    invoke-virtual {v2}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    const v6, 0xffff

    .line 35
    .line 36
    .line 37
    sub-int/2addr v6, v3

    .line 38
    add-int/2addr v6, v2

    .line 39
    if-le v6, v4, :cond_1

    .line 40
    .line 41
    move v6, v1

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move v6, v5

    .line 44
    :goto_1
    move v2, v6

    .line 45
    :goto_2
    invoke-virtual {p1}, Ljava/util/Vector;->size()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-lt v2, v3, :cond_3

    .line 50
    .line 51
    :goto_3
    if-lt v1, v6, :cond_2

    .line 52
    .line 53
    :goto_4
    return-object v0

    .line 54
    :cond_2
    invoke-virtual {p1, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v0, v2}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    add-int/lit8 v1, v1, 0x1

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_3
    invoke-virtual {p1, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {v0, v3}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    add-int/lit8 v2, v2, 0x1

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_4
    invoke-virtual {p1, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    check-cast v6, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

    .line 79
    .line 80
    invoke-virtual {v6}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    sub-int v3, v6, v3

    .line 85
    .line 86
    if-le v3, v4, :cond_5

    .line 87
    .line 88
    move v5, v2

    .line 89
    move v4, v3

    .line 90
    :cond_5
    add-int/lit8 v2, v2, 0x1

    .line 91
    .line 92
    move v3, v6

    .line 93
    goto :goto_0
.end method

.method private declared-synchronized releaseMessageId(I)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->inUseMsgIds:Ljava/util/Hashtable;

    .line 3
    .line 4
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    throw p1
.end method

.method private restoreInflightMessages()V
    .locals 8

    .line 1
    new-instance v0, Ljava/util/Vector;

    .line 2
    .line 3
    iget v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->maxInflight:I

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/Vector;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingMessages:Ljava/util/Vector;

    .line 9
    .line 10
    new-instance v0, Ljava/util/Vector;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingFlows:Ljava/util/Vector;

    .line 16
    .line 17
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS2:Ljava/util/Hashtable;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v2, 0x1

    .line 28
    const-string v3, "restoreInflightMessages"

    .line 29
    .line 30
    if-nez v1, :cond_3

    .line 31
    .line 32
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS1:Ljava/util/Hashtable;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    :goto_1
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS0:Ljava/util/Hashtable;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    :goto_2
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_1

    .line 55
    .line 56
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingFlows:Ljava/util/Vector;

    .line 57
    .line 58
    invoke-direct {p0, v0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->reOrder(Ljava/util/Vector;)Ljava/util/Vector;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingFlows:Ljava/util/Vector;

    .line 63
    .line 64
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingMessages:Ljava/util/Vector;

    .line 65
    .line 66
    invoke-direct {p0, v0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->reOrder(Ljava/util/Vector;)Ljava/util/Vector;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingMessages:Ljava/util/Vector;

    .line 71
    .line 72
    return-void

    .line 73
    :cond_1
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS0:Ljava/util/Hashtable;

    .line 78
    .line 79
    invoke-virtual {v2, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    check-cast v2, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;

    .line 84
    .line 85
    iget-object v4, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 86
    .line 87
    sget-object v5, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 88
    .line 89
    const-string v6, "512"

    .line 90
    .line 91
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-interface {v4, v5, v3, v6, v1}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingMessages:Ljava/util/Vector;

    .line 99
    .line 100
    invoke-direct {p0, v1, v2}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->insertInOrder(Ljava/util/Vector;Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)V

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_2
    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    iget-object v4, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS1:Ljava/util/Hashtable;

    .line 109
    .line 110
    invoke-virtual {v4, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    check-cast v4, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;

    .line 115
    .line 116
    invoke-virtual {v4, v2}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->setDuplicate(Z)V

    .line 117
    .line 118
    .line 119
    iget-object v5, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 120
    .line 121
    sget-object v6, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 122
    .line 123
    const-string v7, "612"

    .line 124
    .line 125
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-interface {v5, v6, v3, v7, v0}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingMessages:Ljava/util/Vector;

    .line 133
    .line 134
    invoke-direct {p0, v0, v4}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->insertInOrder(Ljava/util/Vector;Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)V

    .line 135
    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_3
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    iget-object v4, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS2:Ljava/util/Hashtable;

    .line 143
    .line 144
    invoke-virtual {v4, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    check-cast v4, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

    .line 149
    .line 150
    instance-of v5, v4, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;

    .line 151
    .line 152
    if-eqz v5, :cond_4

    .line 153
    .line 154
    iget-object v5, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 155
    .line 156
    sget-object v6, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 157
    .line 158
    const-string v7, "610"

    .line 159
    .line 160
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-interface {v5, v6, v3, v7, v1}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v4, v2}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->setDuplicate(Z)V

    .line 168
    .line 169
    .line 170
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingMessages:Ljava/util/Vector;

    .line 171
    .line 172
    check-cast v4, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;

    .line 173
    .line 174
    invoke-direct {p0, v1, v4}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->insertInOrder(Ljava/util/Vector;Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)V

    .line 175
    .line 176
    .line 177
    goto/16 :goto_0

    .line 178
    .line 179
    :cond_4
    instance-of v2, v4, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPubRel;

    .line 180
    .line 181
    if-eqz v2, :cond_0

    .line 182
    .line 183
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 184
    .line 185
    sget-object v5, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 186
    .line 187
    const-string v6, "611"

    .line 188
    .line 189
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-interface {v2, v5, v3, v6, v1}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingFlows:Ljava/util/Vector;

    .line 197
    .line 198
    check-cast v4, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPubRel;

    .line 199
    .line 200
    invoke-direct {p0, v1, v4}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->insertInOrder(Ljava/util/Vector;Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)V

    .line 201
    .line 202
    .line 203
    goto/16 :goto_0
.end method

.method private restoreMessage(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttPersistable;)Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;
    .locals 6

    .line 1
    :try_start_0
    invoke-static {p2}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->createWireMessage(Lorg/eclipse/paho/client/mqttv3/MqttPersistable;)Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

    .line 2
    .line 3
    .line 4
    move-result-object p2
    :try_end_0
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    goto :goto_0

    .line 6
    :catch_0
    move-exception v0

    .line 7
    move-object v5, v0

    .line 8
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 9
    .line 10
    sget-object v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 11
    .line 12
    const-string v3, "602"

    .line 13
    .line 14
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    const-string v2, "restoreMessage"

    .line 19
    .line 20
    invoke-interface/range {v0 .. v5}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v5}, Lorg/eclipse/paho/client/mqttv3/MqttException;->getCause()Ljava/lang/Throwable;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    instance-of p2, p2, Ljava/io/EOFException;

    .line 28
    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    iget-object p2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->persistence:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 34
    .line 35
    invoke-interface {p2, p1}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->remove(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    const/4 p2, 0x0

    .line 39
    :goto_0
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 40
    .line 41
    sget-object v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 42
    .line 43
    const-string v2, "601"

    .line 44
    .line 45
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const-string v3, "restoreMessage"

    .line 50
    .line 51
    invoke-interface {v0, v1, v3, v2, p1}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    return-object p2

    .line 55
    :cond_1
    throw v5
.end method


# virtual methods
.method public checkForActivity(Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/MqttToken;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 6
    .line 7
    sget-object v3, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 8
    .line 9
    const-string v4, "checkForActivity"

    .line 10
    .line 11
    const-string v5, "616"

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    new-array v7, v6, [Ljava/lang/Object;

    .line 15
    .line 16
    invoke-interface {v2, v3, v4, v5, v7}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object v2, v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->quiesceLock:Ljava/lang/Object;

    .line 20
    .line 21
    monitor-enter v2

    .line 22
    :try_start_0
    iget-boolean v4, v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->quiescing:Z

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    monitor-exit v2

    .line 28
    return-object v5

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    goto/16 :goto_4

    .line 31
    .line 32
    :cond_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 34
    .line 35
    iget-wide v7, v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->keepAliveNanos:J

    .line 36
    .line 37
    invoke-virtual {v2, v7, v8}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 38
    .line 39
    .line 40
    iget-boolean v4, v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->connected:Z

    .line 41
    .line 42
    if-eqz v4, :cond_9

    .line 43
    .line 44
    iget-wide v7, v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->keepAliveNanos:J

    .line 45
    .line 46
    const-wide/16 v9, 0x0

    .line 47
    .line 48
    cmp-long v4, v7, v9

    .line 49
    .line 50
    if-lez v4, :cond_9

    .line 51
    .line 52
    iget-object v4, v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->highResolutionTimer:Lorg/eclipse/paho/client/mqttv3/internal/HighResolutionTimer;

    .line 53
    .line 54
    invoke-interface {v4}, Lorg/eclipse/paho/client/mqttv3/internal/HighResolutionTimer;->nanoTime()J

    .line 55
    .line 56
    .line 57
    move-result-wide v7

    .line 58
    iget-object v4, v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pingOutstandingLock:Ljava/lang/Object;

    .line 59
    .line 60
    monitor-enter v4

    .line 61
    :try_start_1
    iget v9, v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pingOutstanding:I

    .line 62
    .line 63
    const v10, 0x186a0

    .line 64
    .line 65
    .line 66
    if-lez v9, :cond_2

    .line 67
    .line 68
    iget-wide v11, v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->lastInboundActivity:J

    .line 69
    .line 70
    sub-long v11, v7, v11

    .line 71
    .line 72
    iget-wide v13, v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->keepAliveNanos:J

    .line 73
    .line 74
    int-to-long v5, v10

    .line 75
    add-long/2addr v5, v13

    .line 76
    cmp-long v5, v11, v5

    .line 77
    .line 78
    if-gez v5, :cond_1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    iget-object v0, v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 82
    .line 83
    const-string v2, "checkForActivity"

    .line 84
    .line 85
    const-string v5, "619"

    .line 86
    .line 87
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    iget-wide v9, v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->lastOutboundActivity:J

    .line 92
    .line 93
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 94
    .line 95
    .line 96
    move-result-object v9

    .line 97
    iget-wide v10, v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->lastInboundActivity:J

    .line 98
    .line 99
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 100
    .line 101
    .line 102
    move-result-object v10

    .line 103
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    iget-wide v11, v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->lastPing:J

    .line 108
    .line 109
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    filled-new-array {v6, v9, v10, v7, v8}, [Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    invoke-interface {v0, v3, v2, v5, v6}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->severe(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    const/16 v0, 0x7d00

    .line 121
    .line 122
    invoke-static {v0}, Lorg/eclipse/paho/client/mqttv3/internal/ExceptionHelper;->createMqttException(I)Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    throw v0

    .line 127
    :catchall_1
    move-exception v0

    .line 128
    goto/16 :goto_3

    .line 129
    .line 130
    :cond_2
    :goto_0
    if-nez v9, :cond_4

    .line 131
    .line 132
    iget-wide v5, v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->lastOutboundActivity:J

    .line 133
    .line 134
    sub-long v5, v7, v5

    .line 135
    .line 136
    iget-wide v11, v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->keepAliveNanos:J

    .line 137
    .line 138
    const-wide/16 v13, 0x2

    .line 139
    .line 140
    mul-long/2addr v13, v11

    .line 141
    cmp-long v5, v5, v13

    .line 142
    .line 143
    if-gez v5, :cond_3

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_3
    iget-object v0, v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 147
    .line 148
    const-string v2, "checkForActivity"

    .line 149
    .line 150
    const-string v5, "642"

    .line 151
    .line 152
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    iget-wide v9, v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->lastOutboundActivity:J

    .line 157
    .line 158
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 159
    .line 160
    .line 161
    move-result-object v9

    .line 162
    iget-wide v10, v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->lastInboundActivity:J

    .line 163
    .line 164
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 165
    .line 166
    .line 167
    move-result-object v10

    .line 168
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    iget-wide v11, v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->lastPing:J

    .line 173
    .line 174
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 175
    .line 176
    .line 177
    move-result-object v8

    .line 178
    filled-new-array {v6, v9, v10, v7, v8}, [Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v6

    .line 182
    invoke-interface {v0, v3, v2, v5, v6}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->severe(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    const/16 v0, 0x7d02

    .line 186
    .line 187
    invoke-static {v0}, Lorg/eclipse/paho/client/mqttv3/internal/ExceptionHelper;->createMqttException(I)Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    throw v0

    .line 192
    :cond_4
    :goto_1
    if-nez v9, :cond_5

    .line 193
    .line 194
    iget-wide v5, v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->lastInboundActivity:J

    .line 195
    .line 196
    sub-long v5, v7, v5

    .line 197
    .line 198
    iget-wide v11, v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->keepAliveNanos:J

    .line 199
    .line 200
    int-to-long v13, v10

    .line 201
    sub-long/2addr v11, v13

    .line 202
    cmp-long v5, v5, v11

    .line 203
    .line 204
    if-gez v5, :cond_6

    .line 205
    .line 206
    :cond_5
    iget-wide v5, v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->lastOutboundActivity:J

    .line 207
    .line 208
    sub-long v5, v7, v5

    .line 209
    .line 210
    iget-wide v11, v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->keepAliveNanos:J

    .line 211
    .line 212
    int-to-long v9, v10

    .line 213
    sub-long/2addr v11, v9

    .line 214
    cmp-long v5, v5, v11

    .line 215
    .line 216
    if-ltz v5, :cond_8

    .line 217
    .line 218
    :cond_6
    iget-object v2, v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 219
    .line 220
    const-string v5, "checkForActivity"

    .line 221
    .line 222
    const-string v6, "620"

    .line 223
    .line 224
    iget-wide v7, v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->keepAliveNanos:J

    .line 225
    .line 226
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 227
    .line 228
    .line 229
    move-result-object v7

    .line 230
    iget-wide v8, v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->lastOutboundActivity:J

    .line 231
    .line 232
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 233
    .line 234
    .line 235
    move-result-object v8

    .line 236
    iget-wide v9, v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->lastInboundActivity:J

    .line 237
    .line 238
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 239
    .line 240
    .line 241
    move-result-object v9

    .line 242
    filled-new-array {v7, v8, v9}, [Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v7

    .line 246
    invoke-interface {v2, v3, v5, v6, v7}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    new-instance v5, Lorg/eclipse/paho/client/mqttv3/MqttToken;

    .line 250
    .line 251
    iget-object v2, v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->clientComms:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    .line 252
    .line 253
    invoke-virtual {v2}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->getClient()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    invoke-interface {v2}, Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;->getClientId()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    invoke-direct {v5, v2}, Lorg/eclipse/paho/client/mqttv3/MqttToken;-><init>(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    if-eqz v0, :cond_7

    .line 265
    .line 266
    invoke-virtual {v5, v0}, Lorg/eclipse/paho/client/mqttv3/MqttToken;->setActionCallback(Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)V

    .line 267
    .line 268
    .line 269
    :cond_7
    iget-object v0, v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->tokenStore:Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;

    .line 270
    .line 271
    iget-object v2, v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pingCommand:Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

    .line 272
    .line 273
    invoke-virtual {v0, v5, v2}, Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;->saveToken(Lorg/eclipse/paho/client/mqttv3/MqttToken;Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)V

    .line 274
    .line 275
    .line 276
    iget-object v0, v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingFlows:Ljava/util/Vector;

    .line 277
    .line 278
    iget-object v2, v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pingCommand:Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

    .line 279
    .line 280
    const/4 v15, 0x0

    .line 281
    invoke-virtual {v0, v2, v15}, Ljava/util/Vector;->insertElementAt(Ljava/lang/Object;I)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->getKeepAlive()J

    .line 285
    .line 286
    .line 287
    move-result-wide v6

    .line 288
    invoke-virtual {v1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->notifyQueueLock()V

    .line 289
    .line 290
    .line 291
    goto :goto_2

    .line 292
    :cond_8
    iget-object v0, v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 293
    .line 294
    const-string v5, "checkForActivity"

    .line 295
    .line 296
    const-string v6, "634"

    .line 297
    .line 298
    const/4 v9, 0x0

    .line 299
    invoke-interface {v0, v3, v5, v6, v9}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    iget-wide v5, v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->lastOutboundActivity:J

    .line 303
    .line 304
    sub-long/2addr v7, v5

    .line 305
    invoke-virtual {v2, v7, v8}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 306
    .line 307
    .line 308
    move-result-wide v5

    .line 309
    invoke-virtual {v1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->getKeepAlive()J

    .line 310
    .line 311
    .line 312
    move-result-wide v7

    .line 313
    sub-long/2addr v7, v5

    .line 314
    const-wide/16 v5, 0x1

    .line 315
    .line 316
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 317
    .line 318
    .line 319
    move-result-wide v6

    .line 320
    const/4 v5, 0x0

    .line 321
    :goto_2
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 322
    iget-object v0, v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 323
    .line 324
    const-string v2, "checkForActivity"

    .line 325
    .line 326
    const-string v4, "624"

    .line 327
    .line 328
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 329
    .line 330
    .line 331
    move-result-object v8

    .line 332
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v8

    .line 336
    invoke-interface {v0, v3, v2, v4, v8}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    iget-object v0, v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pingSender:Lorg/eclipse/paho/client/mqttv3/MqttPingSender;

    .line 340
    .line 341
    invoke-interface {v0, v6, v7}, Lorg/eclipse/paho/client/mqttv3/MqttPingSender;->schedule(J)V

    .line 342
    .line 343
    .line 344
    return-object v5

    .line 345
    :goto_3
    :try_start_2
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 346
    throw v0

    .line 347
    :cond_9
    move-object/from16 v16, v5

    .line 348
    .line 349
    return-object v16

    .line 350
    :goto_4
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 351
    throw v0
.end method

.method public checkQuiesceLock()Z
    .locals 12

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->tokenStore:Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;->count()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-boolean v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->quiescing:Z

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingFlows:Ljava/util/Vector;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->callback:Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;

    .line 22
    .line 23
    invoke-virtual {v1}, Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;->isQuiesced()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 30
    .line 31
    sget-object v2, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 32
    .line 33
    const-string v3, "checkQuiesceLock"

    .line 34
    .line 35
    const-string v4, "626"

    .line 36
    .line 37
    iget-boolean v5, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->quiescing:Z

    .line 38
    .line 39
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    iget v5, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->actualInFlight:I

    .line 44
    .line 45
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    iget-object v5, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingFlows:Ljava/util/Vector;

    .line 50
    .line 51
    invoke-virtual {v5}, Ljava/util/Vector;->size()I

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    iget v5, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->inFlightPubRels:I

    .line 60
    .line 61
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v9

    .line 65
    iget-object v5, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->callback:Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;

    .line 66
    .line 67
    invoke-virtual {v5}, Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;->isQuiesced()Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 72
    .line 73
    .line 74
    move-result-object v10

    .line 75
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v11

    .line 79
    filled-new-array/range {v6 .. v11}, [Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-interface {v1, v2, v3, v4, v0}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->quiesceLock:Ljava/lang/Object;

    .line 87
    .line 88
    monitor-enter v1

    .line 89
    :try_start_0
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->quiesceLock:Ljava/lang/Object;

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 92
    .line 93
    .line 94
    monitor-exit v1

    .line 95
    const/4 v0, 0x1

    .line 96
    return v0

    .line 97
    :catchall_0
    move-exception v0

    .line 98
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    throw v0

    .line 100
    :cond_0
    const/4 v0, 0x0

    .line 101
    return v0
.end method

.method public clearState()V
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 2
    .line 3
    sget-object v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, "clearState"

    .line 6
    .line 7
    const-string v3, ">"

    .line 8
    .line 9
    invoke-interface {v0, v1, v2, v3}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->persistence:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 13
    .line 14
    invoke-interface {v0}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->clear()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->inUseMsgIds:Ljava/util/Hashtable;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingMessages:Ljava/util/Vector;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/Vector;->clear()V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingFlows:Ljava/util/Vector;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/util/Vector;->clear()V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS2:Ljava/util/Hashtable;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS1:Ljava/util/Hashtable;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS0:Ljava/util/Hashtable;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->inboundQoS2:Ljava/util/Hashtable;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->tokenStore:Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;

    .line 53
    .line 54
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;->clear()V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->inUseMsgIds:Ljava/util/Hashtable;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingMessages:Ljava/util/Vector;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingMessages:Ljava/util/Vector;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/Vector;->clear()V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingFlows:Ljava/util/Vector;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/Vector;->clear()V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS2:Ljava/util/Hashtable;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS1:Ljava/util/Hashtable;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS0:Ljava/util/Hashtable;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->inboundQoS2:Ljava/util/Hashtable;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->tokenStore:Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;

    .line 41
    .line 42
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;->clear()V

    .line 43
    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->inUseMsgIds:Ljava/util/Hashtable;

    .line 47
    .line 48
    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingMessages:Ljava/util/Vector;

    .line 49
    .line 50
    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingFlows:Ljava/util/Vector;

    .line 51
    .line 52
    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS2:Ljava/util/Hashtable;

    .line 53
    .line 54
    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS1:Ljava/util/Hashtable;

    .line 55
    .line 56
    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS0:Ljava/util/Hashtable;

    .line 57
    .line 58
    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->inboundQoS2:Ljava/util/Hashtable;

    .line 59
    .line 60
    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->tokenStore:Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;

    .line 61
    .line 62
    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->callback:Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;

    .line 63
    .line 64
    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->clientComms:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    .line 65
    .line 66
    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->persistence:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 67
    .line 68
    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pingCommand:Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

    .line 69
    .line 70
    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->highResolutionTimer:Lorg/eclipse/paho/client/mqttv3/internal/HighResolutionTimer;

    .line 71
    .line 72
    return-void
.end method

.method public connected()V
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 2
    .line 3
    sget-object v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, "connected"

    .line 6
    .line 7
    const-string v3, "631"

    .line 8
    .line 9
    invoke-interface {v0, v1, v2, v3}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->connected:Z

    .line 14
    .line 15
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pingSender:Lorg/eclipse/paho/client/mqttv3/MqttPingSender;

    .line 16
    .line 17
    invoke-interface {v0}, Lorg/eclipse/paho/client/mqttv3/MqttPingSender;->start()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public deliveryComplete(I)V
    .locals 5

    .line 4
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    sget-object v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "deliveryComplete"

    const-string v4, "641"

    invoke-interface {v0, v1, v3, v4, v2}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->persistence:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    invoke-direct {p0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->getReceivedPersistenceKey(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->remove(Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->inboundQoS2:Ljava/util/Hashtable;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public deliveryComplete(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    sget-object v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "deliveryComplete"

    const-string v4, "641"

    invoke-interface {v0, v1, v3, v4, v2}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->persistence:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    invoke-direct {p0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->getReceivedPersistenceKey(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->remove(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->inboundQoS2:Ljava/util/Hashtable;

    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public disconnected(Lorg/eclipse/paho/client/mqttv3/MqttException;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 2
    .line 3
    sget-object v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, "disconnected"

    .line 6
    .line 7
    const-string v3, "633"

    .line 8
    .line 9
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {v0, v1, v2, v3, p1}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    iput-boolean p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->connected:Z

    .line 18
    .line 19
    :try_start_0
    iget-boolean v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->cleanSession:Z

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->clearState()V

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingMessages:Ljava/util/Vector;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/Vector;->clear()V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingFlows:Ljava/util/Vector;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/util/Vector;->clear()V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pingOutstandingLock:Ljava/lang/Object;

    .line 37
    .line 38
    monitor-enter v0
    :try_end_0
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    :try_start_1
    iput p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pingOutstanding:I

    .line 40
    .line 41
    monitor-exit v0

    .line 42
    return-void

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    :try_start_2
    throw p1
    :try_end_2
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_2 .. :try_end_2} :catch_0

    .line 46
    :catch_0
    return-void
.end method

.method public get()Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;
    .locals 8

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->queueLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    move-object v2, v1

    .line 6
    :cond_0
    :goto_0
    if-eqz v2, :cond_1

    .line 7
    .line 8
    :try_start_0
    monitor-exit v0

    .line 9
    return-object v2

    .line 10
    :catchall_0
    move-exception v1

    .line 11
    goto/16 :goto_2

    .line 12
    .line 13
    :cond_1
    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingMessages:Ljava/util/Vector;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/util/Vector;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_2

    .line 20
    .line 21
    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingFlows:Ljava/util/Vector;

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/util/Vector;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-nez v3, :cond_3

    .line 28
    .line 29
    :cond_2
    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingFlows:Ljava/util/Vector;

    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/util/Vector;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_4

    .line 36
    .line 37
    iget v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->actualInFlight:I

    .line 38
    .line 39
    iget v4, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->maxInflight:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    if-lt v3, v4, :cond_4

    .line 42
    .line 43
    :cond_3
    :try_start_1
    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 44
    .line 45
    sget-object v4, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 46
    .line 47
    const-string v5, "get"

    .line 48
    .line 49
    const-string v6, "644"

    .line 50
    .line 51
    invoke-interface {v3, v4, v5, v6}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->queueLock:Ljava/lang/Object;

    .line 55
    .line 56
    invoke-virtual {v3}, Ljava/lang/Object;->wait()V

    .line 57
    .line 58
    .line 59
    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 60
    .line 61
    const-string v5, "get"

    .line 62
    .line 63
    const-string v6, "647"

    .line 64
    .line 65
    invoke-interface {v3, v4, v5, v6}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    .line 67
    .line 68
    :catch_0
    :cond_4
    :try_start_2
    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingFlows:Ljava/util/Vector;

    .line 69
    .line 70
    if-eqz v3, :cond_9

    .line 71
    .line 72
    iget-boolean v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->connected:Z

    .line 73
    .line 74
    const/4 v4, 0x0

    .line 75
    if-nez v3, :cond_5

    .line 76
    .line 77
    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingFlows:Ljava/util/Vector;

    .line 78
    .line 79
    invoke-virtual {v3}, Ljava/util/Vector;->isEmpty()Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-nez v3, :cond_9

    .line 84
    .line 85
    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingFlows:Ljava/util/Vector;

    .line 86
    .line 87
    invoke-virtual {v3, v4}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    check-cast v3, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

    .line 92
    .line 93
    instance-of v3, v3, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttConnect;

    .line 94
    .line 95
    if-nez v3, :cond_5

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_5
    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingFlows:Ljava/util/Vector;

    .line 99
    .line 100
    invoke-virtual {v3}, Ljava/util/Vector;->isEmpty()Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-nez v3, :cond_7

    .line 105
    .line 106
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingFlows:Ljava/util/Vector;

    .line 107
    .line 108
    invoke-virtual {v2, v4}, Ljava/util/Vector;->remove(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    check-cast v2, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

    .line 113
    .line 114
    instance-of v3, v2, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPubRel;

    .line 115
    .line 116
    if-eqz v3, :cond_6

    .line 117
    .line 118
    iget v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->inFlightPubRels:I

    .line 119
    .line 120
    add-int/lit8 v3, v3, 0x1

    .line 121
    .line 122
    iput v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->inFlightPubRels:I

    .line 123
    .line 124
    iget-object v4, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 125
    .line 126
    sget-object v5, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 127
    .line 128
    const-string v6, "get"

    .line 129
    .line 130
    const-string v7, "617"

    .line 131
    .line 132
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    invoke-interface {v4, v5, v6, v7, v3}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :cond_6
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->checkQuiesceLock()Z

    .line 144
    .line 145
    .line 146
    goto/16 :goto_0

    .line 147
    .line 148
    :cond_7
    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingMessages:Ljava/util/Vector;

    .line 149
    .line 150
    invoke-virtual {v3}, Ljava/util/Vector;->isEmpty()Z

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    if-nez v3, :cond_0

    .line 155
    .line 156
    iget v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->actualInFlight:I

    .line 157
    .line 158
    iget v5, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->maxInflight:I

    .line 159
    .line 160
    if-ge v3, v5, :cond_8

    .line 161
    .line 162
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingMessages:Ljava/util/Vector;

    .line 163
    .line 164
    invoke-virtual {v2, v4}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    check-cast v2, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

    .line 169
    .line 170
    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingMessages:Ljava/util/Vector;

    .line 171
    .line 172
    invoke-virtual {v3, v4}, Ljava/util/Vector;->removeElementAt(I)V

    .line 173
    .line 174
    .line 175
    iget v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->actualInFlight:I

    .line 176
    .line 177
    add-int/lit8 v3, v3, 0x1

    .line 178
    .line 179
    iput v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->actualInFlight:I

    .line 180
    .line 181
    iget-object v4, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 182
    .line 183
    sget-object v5, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 184
    .line 185
    const-string v6, "get"

    .line 186
    .line 187
    const-string v7, "623"

    .line 188
    .line 189
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    invoke-interface {v4, v5, v6, v7, v3}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    goto/16 :goto_0

    .line 201
    .line 202
    :cond_8
    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 203
    .line 204
    sget-object v4, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 205
    .line 206
    const-string v5, "get"

    .line 207
    .line 208
    const-string v6, "622"

    .line 209
    .line 210
    invoke-interface {v3, v4, v5, v6}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    goto/16 :goto_0

    .line 214
    .line 215
    :cond_9
    :goto_1
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 216
    .line 217
    sget-object v3, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 218
    .line 219
    const-string v4, "get"

    .line 220
    .line 221
    const-string v5, "621"

    .line 222
    .line 223
    invoke-interface {v2, v3, v4, v5}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    monitor-exit v0

    .line 227
    return-object v1

    .line 228
    :goto_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 229
    throw v1
.end method

.method public getActualInFlight()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->actualInFlight:I

    .line 2
    .line 3
    return v0
.end method

.method public getCleanSession()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->cleanSession:Z

    .line 2
    .line 3
    return v0
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
    const-string v1, "In use msgids"

    .line 7
    .line 8
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->inUseMsgIds:Ljava/util/Hashtable;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    const-string v1, "pendingMessages"

    .line 14
    .line 15
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingMessages:Ljava/util/Vector;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    const-string v1, "pendingFlows"

    .line 21
    .line 22
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingFlows:Ljava/util/Vector;

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    iget v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->maxInflight:I

    .line 28
    .line 29
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const-string v2, "maxInflight"

    .line 34
    .line 35
    invoke-virtual {v0, v2, v1}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    iget v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->nextMsgId:I

    .line 39
    .line 40
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const-string v2, "nextMsgID"

    .line 45
    .line 46
    invoke-virtual {v0, v2, v1}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    iget v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->actualInFlight:I

    .line 50
    .line 51
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    const-string v2, "actualInFlight"

    .line 56
    .line 57
    invoke-virtual {v0, v2, v1}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    iget v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->inFlightPubRels:I

    .line 61
    .line 62
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    const-string v2, "inFlightPubRels"

    .line 67
    .line 68
    invoke-virtual {v0, v2, v1}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    iget-boolean v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->quiescing:Z

    .line 72
    .line 73
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    const-string v2, "quiescing"

    .line 78
    .line 79
    invoke-virtual {v0, v2, v1}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    iget v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pingOutstanding:I

    .line 83
    .line 84
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    const-string v2, "pingoutstanding"

    .line 89
    .line 90
    invoke-virtual {v0, v2, v1}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    iget-wide v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->lastOutboundActivity:J

    .line 94
    .line 95
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    const-string v2, "lastOutboundActivity"

    .line 100
    .line 101
    invoke-virtual {v0, v2, v1}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    iget-wide v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->lastInboundActivity:J

    .line 105
    .line 106
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    const-string v2, "lastInboundActivity"

    .line 111
    .line 112
    invoke-virtual {v0, v2, v1}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    const-string v1, "outboundQoS2"

    .line 116
    .line 117
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS2:Ljava/util/Hashtable;

    .line 118
    .line 119
    invoke-virtual {v0, v1, v2}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    const-string v1, "outboundQoS1"

    .line 123
    .line 124
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS1:Ljava/util/Hashtable;

    .line 125
    .line 126
    invoke-virtual {v0, v1, v2}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    const-string v1, "outboundQoS0"

    .line 130
    .line 131
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS0:Ljava/util/Hashtable;

    .line 132
    .line 133
    invoke-virtual {v0, v1, v2}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    const-string v1, "inboundQoS2"

    .line 137
    .line 138
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->inboundQoS2:Ljava/util/Hashtable;

    .line 139
    .line 140
    invoke-virtual {v0, v1, v2}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    const-string v1, "tokens"

    .line 144
    .line 145
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->tokenStore:Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;

    .line 146
    .line 147
    invoke-virtual {v0, v1, v2}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    return-object v0
.end method

.method public getKeepAlive()J
    .locals 3

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    iget-wide v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->keepAliveNanos:J

    .line 4
    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public getMaxInFlight()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->maxInflight:I

    .line 2
    .line 3
    return v0
.end method

.method public notifyComplete(Lorg/eclipse/paho/client/mqttv3/MqttToken;)V
    .locals 5

    .line 1
    iget-object v0, p1, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lorg/eclipse/paho/client/mqttv3/internal/Token;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->getWireMessage()Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    instance-of v1, v0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttAck;

    .line 10
    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 14
    .line 15
    sget-object v2, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    filled-new-array {v3, p1, v0}, [Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const-string v3, "notifyComplete"

    .line 30
    .line 31
    const-string v4, "629"

    .line 32
    .line 33
    invoke-interface {v1, v2, v3, v4, p1}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    move-object p1, v0

    .line 37
    check-cast p1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttAck;

    .line 38
    .line 39
    instance-of v1, p1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPubAck;

    .line 40
    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->persistence:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 44
    .line 45
    invoke-direct {p0, v0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->getSendPersistenceKey(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-interface {v1, v4}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->remove(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->persistence:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 53
    .line 54
    invoke-direct {p0, v0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->getSendBufferedPersistenceKey(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-interface {v1, v4}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->remove(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS1:Ljava/util/Hashtable;

    .line 62
    .line 63
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-virtual {v1, v4}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    invoke-direct {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->decrementInFlight()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    invoke-direct {p0, v1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->releaseMessageId(I)V

    .line 82
    .line 83
    .line 84
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->tokenStore:Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;

    .line 85
    .line 86
    invoke-virtual {v1, v0}, Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;->removeToken(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)Lorg/eclipse/paho/client/mqttv3/MqttToken;

    .line 87
    .line 88
    .line 89
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 90
    .line 91
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    const-string v1, "650"

    .line 104
    .line 105
    invoke-interface {v0, v2, v3, v1, p1}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_0
    instance-of v1, p1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPubComp;

    .line 110
    .line 111
    if-eqz v1, :cond_1

    .line 112
    .line 113
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->persistence:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 114
    .line 115
    invoke-direct {p0, v0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->getSendPersistenceKey(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-interface {v1, v4}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->remove(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->persistence:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 123
    .line 124
    invoke-direct {p0, v0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->getSendConfirmPersistenceKey(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    invoke-interface {v1, v4}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->remove(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->persistence:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 132
    .line 133
    invoke-direct {p0, v0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->getSendBufferedPersistenceKey(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    invoke-interface {v1, v4}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->remove(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS2:Ljava/util/Hashtable;

    .line 141
    .line 142
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    invoke-virtual {v1, v4}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    iget v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->inFlightPubRels:I

    .line 154
    .line 155
    add-int/lit8 v1, v1, -0x1

    .line 156
    .line 157
    iput v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->inFlightPubRels:I

    .line 158
    .line 159
    invoke-direct {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->decrementInFlight()V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    invoke-direct {p0, v1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->releaseMessageId(I)V

    .line 167
    .line 168
    .line 169
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->tokenStore:Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;

    .line 170
    .line 171
    invoke-virtual {v1, v0}, Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;->removeToken(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)Lorg/eclipse/paho/client/mqttv3/MqttToken;

    .line 172
    .line 173
    .line 174
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 175
    .line 176
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    iget v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->inFlightPubRels:I

    .line 185
    .line 186
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    filled-new-array {p1, v1}, [Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    const-string v1, "645"

    .line 195
    .line 196
    invoke-interface {v0, v2, v3, v1, p1}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->checkQuiesceLock()Z

    .line 200
    .line 201
    .line 202
    :cond_2
    return-void
.end method

.method public notifyQueueLock()V
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->queueLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 5
    .line 6
    sget-object v2, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 7
    .line 8
    const-string v3, "notifyQueueLock"

    .line 9
    .line 10
    const-string v4, "638"

    .line 11
    .line 12
    invoke-interface {v1, v2, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->queueLock:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 18
    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception v1

    .line 23
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw v1
.end method

.method public notifyReceivedAck(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttAck;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->highResolutionTimer:Lorg/eclipse/paho/client/mqttv3/internal/HighResolutionTimer;

    .line 2
    .line 3
    invoke-interface {v0}, Lorg/eclipse/paho/client/mqttv3/internal/HighResolutionTimer;->nanoTime()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iput-wide v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->lastInboundActivity:J

    .line 8
    .line 9
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 10
    .line 11
    sget-object v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 12
    .line 13
    const-string v2, "notifyReceivedAck"

    .line 14
    .line 15
    const-string v3, "627"

    .line 16
    .line 17
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    filled-new-array {v4, p1}, [Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-interface {v0, v1, v2, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->tokenStore:Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;->getToken(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)Lorg/eclipse/paho/client/mqttv3/MqttToken;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-nez v0, :cond_0

    .line 39
    .line 40
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 41
    .line 42
    const-string v2, "notifyReceivedAck"

    .line 43
    .line 44
    const-string v3, "662"

    .line 45
    .line 46
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-interface {v0, v1, v2, v3, p1}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto/16 :goto_5

    .line 62
    .line 63
    :cond_0
    instance-of v2, p1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPubRec;

    .line 64
    .line 65
    if-eqz v2, :cond_1

    .line 66
    .line 67
    new-instance v1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPubRel;

    .line 68
    .line 69
    check-cast p1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPubRec;

    .line 70
    .line 71
    invoke-direct {v1, p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPubRel;-><init>(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPubRec;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v1, v0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->send(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    .line 75
    .line 76
    .line 77
    goto/16 :goto_5

    .line 78
    .line 79
    :cond_1
    instance-of v2, p1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPubAck;

    .line 80
    .line 81
    const/4 v3, 0x0

    .line 82
    if-nez v2, :cond_8

    .line 83
    .line 84
    instance-of v2, p1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPubComp;

    .line 85
    .line 86
    if-eqz v2, :cond_2

    .line 87
    .line 88
    goto/16 :goto_4

    .line 89
    .line 90
    :cond_2
    instance-of v2, p1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPingResp;

    .line 91
    .line 92
    const/4 v4, 0x0

    .line 93
    if-eqz v2, :cond_4

    .line 94
    .line 95
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pingOutstandingLock:Ljava/lang/Object;

    .line 96
    .line 97
    monitor-enter v2

    .line 98
    :try_start_0
    iget v5, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pingOutstanding:I

    .line 99
    .line 100
    add-int/lit8 v5, v5, -0x1

    .line 101
    .line 102
    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    iput v4, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pingOutstanding:I

    .line 107
    .line 108
    invoke-virtual {p0, p1, v0, v3}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->notifyResult(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;Lorg/eclipse/paho/client/mqttv3/MqttToken;Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    .line 109
    .line 110
    .line 111
    iget v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pingOutstanding:I

    .line 112
    .line 113
    if-nez v0, :cond_3

    .line 114
    .line 115
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->tokenStore:Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;

    .line 116
    .line 117
    invoke-virtual {v0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;->removeToken(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)Lorg/eclipse/paho/client/mqttv3/MqttToken;

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :catchall_0
    move-exception p1

    .line 122
    goto :goto_1

    .line 123
    :cond_3
    :goto_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 125
    .line 126
    const-string v0, "notifyReceivedAck"

    .line 127
    .line 128
    const-string v2, "636"

    .line 129
    .line 130
    iget v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pingOutstanding:I

    .line 131
    .line 132
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    invoke-interface {p1, v1, v0, v2, v3}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    goto :goto_5

    .line 144
    :goto_1
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 145
    throw p1

    .line 146
    :cond_4
    instance-of v1, p1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttConnack;

    .line 147
    .line 148
    if-eqz v1, :cond_7

    .line 149
    .line 150
    move-object v1, p1

    .line 151
    check-cast v1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttConnack;

    .line 152
    .line 153
    invoke-virtual {v1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttConnack;->getReturnCode()I

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    if-nez v2, :cond_6

    .line 158
    .line 159
    iget-object v5, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->queueLock:Ljava/lang/Object;

    .line 160
    .line 161
    monitor-enter v5

    .line 162
    :try_start_2
    iget-boolean v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->cleanSession:Z

    .line 163
    .line 164
    if-eqz v2, :cond_5

    .line 165
    .line 166
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->clearState()V

    .line 167
    .line 168
    .line 169
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->tokenStore:Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;

    .line 170
    .line 171
    invoke-virtual {v2, v0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;->saveToken(Lorg/eclipse/paho/client/mqttv3/MqttToken;Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)V

    .line 172
    .line 173
    .line 174
    goto :goto_2

    .line 175
    :catchall_1
    move-exception p1

    .line 176
    goto :goto_3

    .line 177
    :cond_5
    :goto_2
    iput v4, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->inFlightPubRels:I

    .line 178
    .line 179
    iput v4, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->actualInFlight:I

    .line 180
    .line 181
    invoke-direct {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->restoreInflightMessages()V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->connected()V

    .line 185
    .line 186
    .line 187
    monitor-exit v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 188
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->clientComms:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    .line 189
    .line 190
    invoke-virtual {v2, v1, v3}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->connectComplete(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttConnack;Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0, p1, v0, v3}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->notifyResult(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;Lorg/eclipse/paho/client/mqttv3/MqttToken;Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    .line 194
    .line 195
    .line 196
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->tokenStore:Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;

    .line 197
    .line 198
    invoke-virtual {v0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;->removeToken(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)Lorg/eclipse/paho/client/mqttv3/MqttToken;

    .line 199
    .line 200
    .line 201
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->queueLock:Ljava/lang/Object;

    .line 202
    .line 203
    monitor-enter p1

    .line 204
    :try_start_3
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->queueLock:Ljava/lang/Object;

    .line 205
    .line 206
    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 207
    .line 208
    .line 209
    monitor-exit p1

    .line 210
    goto :goto_5

    .line 211
    :catchall_2
    move-exception v0

    .line 212
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 213
    throw v0

    .line 214
    :goto_3
    :try_start_4
    monitor-exit v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 215
    throw p1

    .line 216
    :cond_6
    invoke-static {v2}, Lorg/eclipse/paho/client/mqttv3/internal/ExceptionHelper;->createMqttException(I)Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    throw p1

    .line 221
    :cond_7
    invoke-virtual {p0, p1, v0, v3}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->notifyResult(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;Lorg/eclipse/paho/client/mqttv3/MqttToken;Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    invoke-direct {p0, v0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->releaseMessageId(I)V

    .line 229
    .line 230
    .line 231
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->tokenStore:Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;

    .line 232
    .line 233
    invoke-virtual {v0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;->removeToken(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)Lorg/eclipse/paho/client/mqttv3/MqttToken;

    .line 234
    .line 235
    .line 236
    goto :goto_5

    .line 237
    :cond_8
    :goto_4
    invoke-virtual {p0, p1, v0, v3}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->notifyResult(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;Lorg/eclipse/paho/client/mqttv3/MqttToken;Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    .line 238
    .line 239
    .line 240
    :goto_5
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->checkQuiesceLock()Z

    .line 241
    .line 242
    .line 243
    return-void
.end method

.method public notifyReceivedBytes(I)V
    .locals 4

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->highResolutionTimer:Lorg/eclipse/paho/client/mqttv3/internal/HighResolutionTimer;

    .line 4
    .line 5
    invoke-interface {v0}, Lorg/eclipse/paho/client/mqttv3/internal/HighResolutionTimer;->nanoTime()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    iput-wide v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->lastInboundActivity:J

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 12
    .line 13
    sget-object v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string v2, "notifyReceivedBytes"

    .line 24
    .line 25
    const-string v3, "630"

    .line 26
    .line 27
    invoke-interface {v0, v1, v2, v3, p1}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public notifyReceivedMsg(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->highResolutionTimer:Lorg/eclipse/paho/client/mqttv3/internal/HighResolutionTimer;

    .line 2
    .line 3
    invoke-interface {v0}, Lorg/eclipse/paho/client/mqttv3/internal/HighResolutionTimer;->nanoTime()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iput-wide v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->lastInboundActivity:J

    .line 8
    .line 9
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 10
    .line 11
    sget-object v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    filled-new-array {v2, p1}, [Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const-string v3, "notifyReceivedMsg"

    .line 26
    .line 27
    const-string v4, "651"

    .line 28
    .line 29
    invoke-interface {v0, v1, v3, v4, v2}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-boolean v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->quiescing:Z

    .line 33
    .line 34
    if-nez v0, :cond_4

    .line 35
    .line 36
    instance-of v0, p1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    move-object v0, p1

    .line 42
    check-cast v0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;

    .line 43
    .line 44
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;->getMessage()Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v2}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->getQos()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_1

    .line 53
    .line 54
    const/4 v3, 0x1

    .line 55
    if-eq v2, v3, :cond_1

    .line 56
    .line 57
    const/4 v3, 0x2

    .line 58
    if-eq v2, v3, :cond_0

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->persistence:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 62
    .line 63
    invoke-direct {p0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->getReceivedPersistenceKey(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-interface {v2, p1, v0}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->put(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttPersistable;)V

    .line 68
    .line 69
    .line 70
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->inboundQoS2:Ljava/util/Hashtable;

    .line 71
    .line 72
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {p1, v2, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    new-instance p1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPubRec;

    .line 84
    .line 85
    invoke-direct {p1, v0}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPubRec;-><init>(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, p1, v1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->send(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_1
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->callback:Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;

    .line 93
    .line 94
    if-eqz p1, :cond_4

    .line 95
    .line 96
    invoke-virtual {p1, v0}, Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;->messageArrived(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_2
    instance-of v0, p1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPubRel;

    .line 101
    .line 102
    if-eqz v0, :cond_4

    .line 103
    .line 104
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->inboundQoS2:Ljava/util/Hashtable;

    .line 105
    .line 106
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-virtual {v0, v2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    check-cast v0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;

    .line 119
    .line 120
    if-eqz v0, :cond_3

    .line 121
    .line 122
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->callback:Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;

    .line 123
    .line 124
    if-eqz p1, :cond_4

    .line 125
    .line 126
    invoke-virtual {p1, v0}, Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;->messageArrived(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :cond_3
    new-instance v0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPubComp;

    .line 131
    .line 132
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    invoke-direct {v0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPubComp;-><init>(I)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0, v0, v1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->send(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    .line 140
    .line 141
    .line 142
    :cond_4
    :goto_0
    return-void
.end method

.method public notifyResult(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;Lorg/eclipse/paho/client/mqttv3/MqttToken;Lorg/eclipse/paho/client/mqttv3/MqttException;)V
    .locals 5

    .line 1
    iget-object v0, p2, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lorg/eclipse/paho/client/mqttv3/internal/Token;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p3}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->markComplete(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p2, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lorg/eclipse/paho/client/mqttv3/internal/Token;

    .line 7
    .line 8
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->notifyComplete()V

    .line 9
    .line 10
    .line 11
    const-string v0, "notifyResult"

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    instance-of v1, p1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttAck;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    instance-of v1, p1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPubRec;

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 24
    .line 25
    sget-object v2, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v3, p2, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lorg/eclipse/paho/client/mqttv3/internal/Token;

    .line 28
    .line 29
    invoke-virtual {v3}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->getKey()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    filled-new-array {v3, p1, p3}, [Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    const-string v4, "648"

    .line 38
    .line 39
    invoke-interface {v1, v2, v0, v4, v3}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->callback:Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;

    .line 43
    .line 44
    invoke-virtual {v1, p2}, Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;->asyncOperationComplete(Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    if-nez p1, :cond_1

    .line 48
    .line 49
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 50
    .line 51
    sget-object v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v2, p2, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lorg/eclipse/paho/client/mqttv3/internal/Token;

    .line 54
    .line 55
    invoke-virtual {v2}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->getKey()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    filled-new-array {v2, p3}, [Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    const-string v2, "649"

    .line 64
    .line 65
    invoke-interface {p1, v1, v0, v2, p3}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->callback:Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;

    .line 69
    .line 70
    invoke-virtual {p1, p2}, Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;->asyncOperationComplete(Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    .line 71
    .line 72
    .line 73
    :cond_1
    return-void
.end method

.method public notifySent(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->highResolutionTimer:Lorg/eclipse/paho/client/mqttv3/internal/HighResolutionTimer;

    .line 2
    .line 3
    invoke-interface {v0}, Lorg/eclipse/paho/client/mqttv3/internal/HighResolutionTimer;->nanoTime()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iput-wide v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->lastOutboundActivity:J

    .line 8
    .line 9
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 10
    .line 11
    sget-object v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 12
    .line 13
    const-string v2, "notifySent"

    .line 14
    .line 15
    const-string v3, "625"

    .line 16
    .line 17
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getKey()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-interface {v0, v1, v2, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getToken()Lorg/eclipse/paho/client/mqttv3/MqttToken;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->tokenStore:Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;->getToken(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)Lorg/eclipse/paho/client/mqttv3/MqttToken;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-nez v0, :cond_0

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_0
    iget-object v2, v0, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lorg/eclipse/paho/client/mqttv3/internal/Token;

    .line 44
    .line 45
    invoke-virtual {v2}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->notifySent()V

    .line 46
    .line 47
    .line 48
    instance-of v2, p1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPingReq;

    .line 49
    .line 50
    if-eqz v2, :cond_1

    .line 51
    .line 52
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pingOutstandingLock:Ljava/lang/Object;

    .line 53
    .line 54
    monitor-enter v2

    .line 55
    :try_start_0
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->highResolutionTimer:Lorg/eclipse/paho/client/mqttv3/internal/HighResolutionTimer;

    .line 56
    .line 57
    invoke-interface {p1}, Lorg/eclipse/paho/client/mqttv3/internal/HighResolutionTimer;->nanoTime()J

    .line 58
    .line 59
    .line 60
    move-result-wide v3

    .line 61
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pingOutstandingLock:Ljava/lang/Object;

    .line 62
    .line 63
    monitor-enter p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    :try_start_1
    iput-wide v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->lastPing:J

    .line 65
    .line 66
    iget v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pingOutstanding:I

    .line 67
    .line 68
    add-int/lit8 v0, v0, 0x1

    .line 69
    .line 70
    iput v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pingOutstanding:I

    .line 71
    .line 72
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 73
    :try_start_2
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 74
    .line 75
    const-string v3, "notifySent"

    .line 76
    .line 77
    const-string v4, "635"

    .line 78
    .line 79
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-interface {p1, v1, v3, v4, v0}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 91
    return-void

    .line 92
    :catchall_0
    move-exception p1

    .line 93
    goto :goto_0

    .line 94
    :catchall_1
    move-exception v0

    .line 95
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 96
    :try_start_4
    throw v0

    .line 97
    :goto_0
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 98
    throw p1

    .line 99
    :cond_1
    instance-of v1, p1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;

    .line 100
    .line 101
    if-eqz v1, :cond_2

    .line 102
    .line 103
    move-object v1, p1

    .line 104
    check-cast v1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;

    .line 105
    .line 106
    invoke-virtual {v1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;->getMessage()Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {v1}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->getQos()I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-nez v1, :cond_2

    .line 115
    .line 116
    iget-object v1, v0, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lorg/eclipse/paho/client/mqttv3/internal/Token;

    .line 117
    .line 118
    const/4 v2, 0x0

    .line 119
    invoke-virtual {v1, v2, v2}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->markComplete(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    .line 120
    .line 121
    .line 122
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->callback:Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;

    .line 123
    .line 124
    invoke-virtual {v1, v0}, Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;->asyncOperationComplete(Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    .line 125
    .line 126
    .line 127
    invoke-direct {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->decrementInFlight()V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    invoke-direct {p0, v0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->releaseMessageId(I)V

    .line 135
    .line 136
    .line 137
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->tokenStore:Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;

    .line 138
    .line 139
    invoke-virtual {v0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;->removeToken(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)Lorg/eclipse/paho/client/mqttv3/MqttToken;

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->checkQuiesceLock()Z

    .line 143
    .line 144
    .line 145
    :cond_2
    :goto_1
    return-void
.end method

.method public notifySentBytes(I)V
    .locals 4

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->highResolutionTimer:Lorg/eclipse/paho/client/mqttv3/internal/HighResolutionTimer;

    .line 4
    .line 5
    invoke-interface {v0}, Lorg/eclipse/paho/client/mqttv3/internal/HighResolutionTimer;->nanoTime()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    iput-wide v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->lastOutboundActivity:J

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 12
    .line 13
    sget-object v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string v2, "notifySentBytes"

    .line 24
    .line 25
    const-string v3, "643"

    .line 26
    .line 27
    invoke-interface {v0, v1, v2, v3, p1}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public persistBufferedMessage(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)V
    .locals 5

    .line 1
    const-string v0, "persistBufferedMessage"

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->getSendBufferedPersistenceKey(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    :try_start_0
    invoke-direct {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->getNextMessageId()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {p1, v2}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->setMessageId(I)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->getSendBufferedPersistenceKey(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1
    :try_end_0
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    :try_start_1
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->persistence:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 19
    .line 20
    move-object v3, p1

    .line 21
    check-cast v3, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;

    .line 22
    .line 23
    invoke-interface {v2, v1, v3}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->put(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttPersistable;)V
    :try_end_1
    .catch Lorg/eclipse/paho/client/mqttv3/MqttPersistenceException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_1 .. :try_end_1} :catch_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catch_0
    move-exception p1

    .line 28
    goto :goto_1

    .line 29
    :catch_1
    :try_start_2
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 30
    .line 31
    sget-object v3, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 32
    .line 33
    const-string v4, "515"

    .line 34
    .line 35
    invoke-interface {v2, v3, v0, v4}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->persistence:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 39
    .line 40
    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->clientComms:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    .line 41
    .line 42
    invoke-virtual {v3}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->getClient()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-interface {v3}, Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;->getClientId()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    iget-object v4, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->clientComms:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    .line 51
    .line 52
    invoke-virtual {v4}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->getClient()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-interface {v4}, Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;->getServerURI()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-interface {v2, v3, v4}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->open(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->persistence:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 64
    .line 65
    check-cast p1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;

    .line 66
    .line 67
    invoke-interface {v2, v1, p1}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->put(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttPersistable;)V

    .line 68
    .line 69
    .line 70
    :goto_0
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 71
    .line 72
    sget-object v2, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 73
    .line 74
    const-string v3, "513"

    .line 75
    .line 76
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-interface {p1, v2, v0, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_2 .. :try_end_2} :catch_0

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :goto_1
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 85
    .line 86
    sget-object v3, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 87
    .line 88
    const-string v4, "514"

    .line 89
    .line 90
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-interface {v2, v3, v0, v4, v1}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->warning(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    throw p1
.end method

.method public quiesce(J)V
    .locals 9

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-lez v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 8
    .line 9
    sget-object v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 10
    .line 11
    const-string v2, "quiesce"

    .line 12
    .line 13
    const-string v3, "637"

    .line 14
    .line 15
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-interface {v0, v1, v2, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->queueLock:Ljava/lang/Object;

    .line 27
    .line 28
    monitor-enter v0

    .line 29
    const/4 v2, 0x1

    .line 30
    :try_start_0
    iput-boolean v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->quiescing:Z

    .line 31
    .line 32
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 33
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->callback:Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;

    .line 34
    .line 35
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;->quiesce()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->notifyQueueLock()V

    .line 39
    .line 40
    .line 41
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->quiesceLock:Ljava/lang/Object;

    .line 42
    .line 43
    monitor-enter v2

    .line 44
    :try_start_1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->tokenStore:Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;

    .line 45
    .line 46
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;->count()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-gtz v0, :cond_0

    .line 51
    .line 52
    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingFlows:Ljava/util/Vector;

    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/util/Vector;->size()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-gtz v3, :cond_0

    .line 59
    .line 60
    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->callback:Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;

    .line 61
    .line 62
    invoke-virtual {v3}, Lorg/eclipse/paho/client/mqttv3/internal/CommsCallback;->isQuiesced()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-nez v3, :cond_1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catchall_0
    move-exception p1

    .line 70
    goto :goto_1

    .line 71
    :cond_0
    :goto_0
    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 72
    .line 73
    const-string v4, "quiesce"

    .line 74
    .line 75
    const-string v5, "639"

    .line 76
    .line 77
    iget v6, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->actualInFlight:I

    .line 78
    .line 79
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    iget-object v7, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingFlows:Ljava/util/Vector;

    .line 84
    .line 85
    invoke-virtual {v7}, Ljava/util/Vector;->size()I

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    iget v8, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->inFlightPubRels:I

    .line 94
    .line 95
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    filled-new-array {v6, v7, v8, v0}, [Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-interface {v3, v1, v4, v5, v0}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->quiesceLock:Ljava/lang/Object;

    .line 111
    .line 112
    invoke-virtual {v0, p1, p2}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 113
    .line 114
    .line 115
    :catch_0
    :cond_1
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 116
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->queueLock:Ljava/lang/Object;

    .line 117
    .line 118
    monitor-enter p1

    .line 119
    :try_start_3
    iget-object p2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingMessages:Ljava/util/Vector;

    .line 120
    .line 121
    invoke-virtual {p2}, Ljava/util/Vector;->clear()V

    .line 122
    .line 123
    .line 124
    iget-object p2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingFlows:Ljava/util/Vector;

    .line 125
    .line 126
    invoke-virtual {p2}, Ljava/util/Vector;->clear()V

    .line 127
    .line 128
    .line 129
    const/4 p2, 0x0

    .line 130
    iput-boolean p2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->quiescing:Z

    .line 131
    .line 132
    iput p2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->actualInFlight:I

    .line 133
    .line 134
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 135
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 136
    .line 137
    sget-object p2, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 138
    .line 139
    const-string v0, "quiesce"

    .line 140
    .line 141
    const-string v1, "640"

    .line 142
    .line 143
    invoke-interface {p1, p2, v0, v1}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :catchall_1
    move-exception p2

    .line 148
    :try_start_4
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 149
    throw p2

    .line 150
    :goto_1
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 151
    throw p1

    .line 152
    :catchall_2
    move-exception p1

    .line 153
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 154
    throw p1

    .line 155
    :cond_2
    return-void
.end method

.method public removeMessage(Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;)Z
    .locals 6

    .line 1
    invoke-interface {p1}, Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;->getMessage()Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p1}, Lorg/eclipse/paho/client/mqttv3/IMqttToken;->getMessageId()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->queueLock:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v1

    .line 12
    :try_start_0
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->getQos()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x1

    .line 17
    if-ne v2, v3, :cond_0

    .line 18
    .line 19
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS1:Ljava/util/Hashtable;

    .line 20
    .line 21
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {v2, v4}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    move v2, v3

    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto :goto_2

    .line 35
    :cond_0
    const/4 v2, 0x0

    .line 36
    :goto_0
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->getQos()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    const/4 v5, 0x2

    .line 41
    if-ne v4, v5, :cond_1

    .line 42
    .line 43
    iget-object v4, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS2:Ljava/util/Hashtable;

    .line 44
    .line 45
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-virtual {v4, v5}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    if-eqz v4, :cond_1

    .line 54
    .line 55
    move v2, v3

    .line 56
    :cond_1
    iget-object v4, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingMessages:Ljava/util/Vector;

    .line 57
    .line 58
    invoke-virtual {v4, v0}, Ljava/util/Vector;->removeElement(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    move v3, v2

    .line 66
    :goto_1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->persistence:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 67
    .line 68
    invoke-direct {p0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->getSendPersistenceKey(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-interface {v0, v2}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->remove(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->tokenStore:Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;

    .line 80
    .line 81
    invoke-virtual {v2, v0}, Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;->removeToken(Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/MqttToken;

    .line 82
    .line 83
    .line 84
    invoke-direct {p0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->releaseMessageId(I)V

    .line 85
    .line 86
    .line 87
    invoke-direct {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->decrementInFlight()V

    .line 88
    .line 89
    .line 90
    monitor-exit v1

    .line 91
    return v3

    .line 92
    :goto_2
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    throw p1
.end method

.method public resolveOldTokens(Lorg/eclipse/paho/client/mqttv3/MqttException;)Ljava/util/Vector;
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 2
    .line 3
    sget-object v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, "resolveOldTokens"

    .line 6
    .line 7
    const-string v3, "632"

    .line 8
    .line 9
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-interface {v0, v1, v2, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    new-instance p1, Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 19
    .line 20
    const/16 v0, 0x7d66

    .line 21
    .line 22
    invoke-direct {p1, v0}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(I)V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->tokenStore:Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;

    .line 26
    .line 27
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;->getOutstandingTokens()Ljava/util/Vector;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Ljava/util/Vector;->elements()Ljava/util/Enumeration;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_2

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_2
    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, Lorg/eclipse/paho/client/mqttv3/MqttToken;

    .line 47
    .line 48
    monitor-enter v2

    .line 49
    :try_start_0
    invoke-virtual {v2}, Lorg/eclipse/paho/client/mqttv3/MqttToken;->isComplete()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-nez v3, :cond_3

    .line 54
    .line 55
    iget-object v3, v2, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lorg/eclipse/paho/client/mqttv3/internal/Token;

    .line 56
    .line 57
    invoke-virtual {v3}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->isCompletePending()Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-nez v3, :cond_3

    .line 62
    .line 63
    invoke-virtual {v2}, Lorg/eclipse/paho/client/mqttv3/MqttToken;->getException()Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    if-nez v3, :cond_3

    .line 68
    .line 69
    iget-object v3, v2, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lorg/eclipse/paho/client/mqttv3/internal/Token;

    .line 70
    .line 71
    invoke-virtual {v3, p1}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->setException(Lorg/eclipse/paho/client/mqttv3/MqttException;)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :catchall_0
    move-exception p1

    .line 76
    goto :goto_2

    .line 77
    :cond_3
    :goto_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    instance-of v3, v2, Lorg/eclipse/paho/client/mqttv3/MqttDeliveryToken;

    .line 79
    .line 80
    if-nez v3, :cond_1

    .line 81
    .line 82
    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->tokenStore:Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;

    .line 83
    .line 84
    iget-object v2, v2, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lorg/eclipse/paho/client/mqttv3/internal/Token;

    .line 85
    .line 86
    invoke-virtual {v2}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->getKey()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {v3, v2}, Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;->removeToken(Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/MqttToken;

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :goto_2
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 95
    throw p1
.end method

.method public restoreState()V
    .locals 13

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->persistence:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 2
    .line 3
    invoke-interface {v0}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->keys()Ljava/util/Enumeration;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->nextMsgId:I

    .line 8
    .line 9
    new-instance v2, Ljava/util/Vector;

    .line 10
    .line 11
    invoke-direct {v2}, Ljava/util/Vector;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 15
    .line 16
    sget-object v4, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 17
    .line 18
    const-string v5, "600"

    .line 19
    .line 20
    const-string v6, "restoreState"

    .line 21
    .line 22
    invoke-interface {v3, v4, v6, v5}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-nez v3, :cond_2

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/util/Vector;->elements()Ljava/util/Enumeration;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    :goto_1
    invoke-interface {v3}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    iput v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->nextMsgId:I

    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    invoke-interface {v3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Ljava/lang/String;

    .line 49
    .line 50
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 51
    .line 52
    sget-object v4, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 53
    .line 54
    const-string v5, "609"

    .line 55
    .line 56
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    invoke-interface {v2, v4, v6, v5, v7}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->persistence:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 64
    .line 65
    invoke-interface {v2, v0}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->remove(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    check-cast v3, Ljava/lang/String;

    .line 74
    .line 75
    iget-object v4, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->persistence:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 76
    .line 77
    invoke-interface {v4, v3}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->get(Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/MqttPersistable;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-direct {p0, v3, v4}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->restoreMessage(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttPersistable;)Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    if-eqz v4, :cond_0

    .line 86
    .line 87
    const-string v5, "r-"

    .line 88
    .line 89
    invoke-virtual {v3, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-eqz v5, :cond_3

    .line 94
    .line 95
    iget-object v5, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 96
    .line 97
    sget-object v7, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 98
    .line 99
    const-string v8, "604"

    .line 100
    .line 101
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-interface {v5, v7, v6, v8, v3}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->inboundQoS2:Ljava/util/Hashtable;

    .line 109
    .line 110
    invoke-virtual {v4}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    invoke-virtual {v3, v5, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_3
    const-string v5, "s-"

    .line 123
    .line 124
    invoke-virtual {v3, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    const-string v7, "608"

    .line 129
    .line 130
    const-string v8, "607"

    .line 131
    .line 132
    const/4 v9, 0x2

    .line 133
    const/4 v10, 0x1

    .line 134
    if-eqz v5, :cond_7

    .line 135
    .line 136
    move-object v5, v4

    .line 137
    check-cast v5, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;

    .line 138
    .line 139
    invoke-virtual {v5}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 140
    .line 141
    .line 142
    move-result v11

    .line 143
    invoke-static {v11, v1}, Ljava/lang/Math;->max(II)I

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    iget-object v11, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->persistence:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 148
    .line 149
    invoke-direct {p0, v5}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->getSendConfirmPersistenceKey(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v12

    .line 153
    invoke-interface {v11, v12}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->containsKey(Ljava/lang/String;)Z

    .line 154
    .line 155
    .line 156
    move-result v11

    .line 157
    if-eqz v11, :cond_5

    .line 158
    .line 159
    iget-object v7, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->persistence:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 160
    .line 161
    invoke-direct {p0, v5}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->getSendConfirmPersistenceKey(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v8

    .line 165
    invoke-interface {v7, v8}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->get(Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/MqttPersistable;

    .line 166
    .line 167
    .line 168
    move-result-object v7

    .line 169
    invoke-direct {p0, v3, v7}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->restoreMessage(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttPersistable;)Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    check-cast v7, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPubRel;

    .line 174
    .line 175
    if-eqz v7, :cond_4

    .line 176
    .line 177
    iget-object v8, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 178
    .line 179
    sget-object v9, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 180
    .line 181
    const-string v10, "605"

    .line 182
    .line 183
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    invoke-interface {v8, v9, v6, v10, v3}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS2:Ljava/util/Hashtable;

    .line 191
    .line 192
    invoke-virtual {v7}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 193
    .line 194
    .line 195
    move-result v4

    .line 196
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    invoke-virtual {v3, v4, v7}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_4
    iget-object v7, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 205
    .line 206
    sget-object v8, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 207
    .line 208
    const-string v9, "606"

    .line 209
    .line 210
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    invoke-interface {v7, v8, v6, v9, v3}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    goto :goto_2

    .line 218
    :cond_5
    invoke-virtual {v5, v10}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->setDuplicate(Z)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v5}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;->getMessage()Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    .line 222
    .line 223
    .line 224
    move-result-object v10

    .line 225
    invoke-virtual {v10}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->getQos()I

    .line 226
    .line 227
    .line 228
    move-result v10

    .line 229
    if-ne v10, v9, :cond_6

    .line 230
    .line 231
    iget-object v7, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 232
    .line 233
    sget-object v9, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 234
    .line 235
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    invoke-interface {v7, v9, v6, v8, v3}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS2:Ljava/util/Hashtable;

    .line 243
    .line 244
    invoke-virtual {v5}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 245
    .line 246
    .line 247
    move-result v4

    .line 248
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    invoke-virtual {v3, v4, v5}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    goto :goto_2

    .line 256
    :cond_6
    iget-object v8, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 257
    .line 258
    sget-object v9, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 259
    .line 260
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    invoke-interface {v8, v9, v6, v7, v3}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS1:Ljava/util/Hashtable;

    .line 268
    .line 269
    invoke-virtual {v5}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 270
    .line 271
    .line 272
    move-result v4

    .line 273
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 274
    .line 275
    .line 276
    move-result-object v4

    .line 277
    invoke-virtual {v3, v4, v5}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    :goto_2
    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->tokenStore:Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;

    .line 281
    .line 282
    invoke-virtual {v3, v5}, Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;->restoreToken(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;)Lorg/eclipse/paho/client/mqttv3/MqttDeliveryToken;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    iget-object v3, v3, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lorg/eclipse/paho/client/mqttv3/internal/Token;

    .line 287
    .line 288
    iget-object v4, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->clientComms:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    .line 289
    .line 290
    invoke-virtual {v4}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->getClient()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    .line 291
    .line 292
    .line 293
    move-result-object v4

    .line 294
    invoke-virtual {v3, v4}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->setClient(Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;)V

    .line 295
    .line 296
    .line 297
    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->inUseMsgIds:Ljava/util/Hashtable;

    .line 298
    .line 299
    invoke-virtual {v5}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 300
    .line 301
    .line 302
    move-result v4

    .line 303
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 304
    .line 305
    .line 306
    move-result-object v4

    .line 307
    invoke-virtual {v5}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 308
    .line 309
    .line 310
    move-result v5

    .line 311
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 312
    .line 313
    .line 314
    move-result-object v5

    .line 315
    invoke-virtual {v3, v4, v5}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    goto/16 :goto_0

    .line 319
    .line 320
    :cond_7
    const-string v5, "sb-"

    .line 321
    .line 322
    invoke-virtual {v3, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 323
    .line 324
    .line 325
    move-result v5

    .line 326
    if-eqz v5, :cond_a

    .line 327
    .line 328
    move-object v5, v4

    .line 329
    check-cast v5, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;

    .line 330
    .line 331
    invoke-virtual {v5}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 332
    .line 333
    .line 334
    move-result v11

    .line 335
    invoke-static {v11, v1}, Ljava/lang/Math;->max(II)I

    .line 336
    .line 337
    .line 338
    move-result v1

    .line 339
    invoke-virtual {v5}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;->getMessage()Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    .line 340
    .line 341
    .line 342
    move-result-object v11

    .line 343
    invoke-virtual {v11}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->getQos()I

    .line 344
    .line 345
    .line 346
    move-result v11

    .line 347
    if-ne v11, v9, :cond_8

    .line 348
    .line 349
    iget-object v7, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 350
    .line 351
    sget-object v9, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 352
    .line 353
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v3

    .line 357
    invoke-interface {v7, v9, v6, v8, v3}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS2:Ljava/util/Hashtable;

    .line 361
    .line 362
    invoke-virtual {v5}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 363
    .line 364
    .line 365
    move-result v4

    .line 366
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 367
    .line 368
    .line 369
    move-result-object v4

    .line 370
    invoke-virtual {v3, v4, v5}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    goto :goto_3

    .line 374
    :cond_8
    invoke-virtual {v5}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;->getMessage()Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    .line 375
    .line 376
    .line 377
    move-result-object v8

    .line 378
    invoke-virtual {v8}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->getQos()I

    .line 379
    .line 380
    .line 381
    move-result v8

    .line 382
    if-ne v8, v10, :cond_9

    .line 383
    .line 384
    iget-object v8, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 385
    .line 386
    sget-object v9, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 387
    .line 388
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v3

    .line 392
    invoke-interface {v8, v9, v6, v7, v3}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 393
    .line 394
    .line 395
    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS1:Ljava/util/Hashtable;

    .line 396
    .line 397
    invoke-virtual {v5}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 398
    .line 399
    .line 400
    move-result v4

    .line 401
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 402
    .line 403
    .line 404
    move-result-object v4

    .line 405
    invoke-virtual {v3, v4, v5}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    goto :goto_3

    .line 409
    :cond_9
    iget-object v7, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 410
    .line 411
    sget-object v8, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 412
    .line 413
    const-string v9, "511"

    .line 414
    .line 415
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v4

    .line 419
    invoke-interface {v7, v8, v6, v9, v4}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 420
    .line 421
    .line 422
    iget-object v4, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS0:Ljava/util/Hashtable;

    .line 423
    .line 424
    invoke-virtual {v5}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 425
    .line 426
    .line 427
    move-result v7

    .line 428
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 429
    .line 430
    .line 431
    move-result-object v7

    .line 432
    invoke-virtual {v4, v7, v5}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    iget-object v4, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->persistence:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 436
    .line 437
    invoke-interface {v4, v3}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->remove(Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    :goto_3
    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->tokenStore:Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;

    .line 441
    .line 442
    invoke-virtual {v3, v5}, Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;->restoreToken(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;)Lorg/eclipse/paho/client/mqttv3/MqttDeliveryToken;

    .line 443
    .line 444
    .line 445
    move-result-object v3

    .line 446
    iget-object v3, v3, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lorg/eclipse/paho/client/mqttv3/internal/Token;

    .line 447
    .line 448
    iget-object v4, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->clientComms:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    .line 449
    .line 450
    invoke-virtual {v4}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->getClient()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    .line 451
    .line 452
    .line 453
    move-result-object v4

    .line 454
    invoke-virtual {v3, v4}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->setClient(Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;)V

    .line 455
    .line 456
    .line 457
    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->inUseMsgIds:Ljava/util/Hashtable;

    .line 458
    .line 459
    invoke-virtual {v5}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 460
    .line 461
    .line 462
    move-result v4

    .line 463
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 464
    .line 465
    .line 466
    move-result-object v4

    .line 467
    invoke-virtual {v5}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 468
    .line 469
    .line 470
    move-result v5

    .line 471
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 472
    .line 473
    .line 474
    move-result-object v5

    .line 475
    invoke-virtual {v3, v4, v5}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    goto/16 :goto_0

    .line 479
    .line 480
    :cond_a
    const-string v5, "sc-"

    .line 481
    .line 482
    invoke-virtual {v3, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 483
    .line 484
    .line 485
    move-result v5

    .line 486
    if-eqz v5, :cond_0

    .line 487
    .line 488
    check-cast v4, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPubRel;

    .line 489
    .line 490
    iget-object v5, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->persistence:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 491
    .line 492
    invoke-direct {p0, v4}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->getSendPersistenceKey(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v4

    .line 496
    invoke-interface {v5, v4}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->containsKey(Ljava/lang/String;)Z

    .line 497
    .line 498
    .line 499
    move-result v4

    .line 500
    if-nez v4, :cond_0

    .line 501
    .line 502
    invoke-virtual {v2, v3}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 503
    .line 504
    .line 505
    goto/16 :goto_0
.end method

.method public send(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;Lorg/eclipse/paho/client/mqttv3/MqttToken;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->isMessageIdRequired()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_2

    .line 12
    .line 13
    instance-of v0, p1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    move-object v0, p1

    .line 18
    check-cast v0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;

    .line 19
    .line 20
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;->getMessage()Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->getQos()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-direct {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->getNextMessageId()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-virtual {p1, v0}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->setMessageId(I)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    instance-of v0, p1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPubAck;

    .line 39
    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    instance-of v0, p1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPubRec;

    .line 43
    .line 44
    if-nez v0, :cond_1

    .line 45
    .line 46
    instance-of v0, p1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPubRel;

    .line 47
    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    instance-of v0, p1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPubComp;

    .line 51
    .line 52
    if-nez v0, :cond_1

    .line 53
    .line 54
    instance-of v0, p1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttSubscribe;

    .line 55
    .line 56
    if-nez v0, :cond_1

    .line 57
    .line 58
    instance-of v0, p1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttSuback;

    .line 59
    .line 60
    if-nez v0, :cond_1

    .line 61
    .line 62
    instance-of v0, p1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttUnsubscribe;

    .line 63
    .line 64
    if-nez v0, :cond_1

    .line 65
    .line 66
    instance-of v0, p1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttUnsubAck;

    .line 67
    .line 68
    if-eqz v0, :cond_2

    .line 69
    .line 70
    :cond_1
    invoke-direct {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->getNextMessageId()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    invoke-virtual {p1, v0}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->setMessageId(I)V

    .line 75
    .line 76
    .line 77
    :cond_2
    :goto_0
    if-eqz p2, :cond_3

    .line 78
    .line 79
    invoke-virtual {p1, p2}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->setToken(Lorg/eclipse/paho/client/mqttv3/MqttToken;)V

    .line 80
    .line 81
    .line 82
    :try_start_0
    iget-object v0, p2, Lorg/eclipse/paho/client/mqttv3/MqttToken;->internalTok:Lorg/eclipse/paho/client/mqttv3/internal/Token;

    .line 83
    .line 84
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    invoke-virtual {v0, v1}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->setMessageID(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    .line 90
    .line 91
    :catch_0
    :cond_3
    instance-of v0, p1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;

    .line 92
    .line 93
    if-eqz v0, :cond_7

    .line 94
    .line 95
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->queueLock:Ljava/lang/Object;

    .line 96
    .line 97
    monitor-enter v0

    .line 98
    :try_start_1
    iget v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->actualInFlight:I

    .line 99
    .line 100
    iget v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->maxInflight:I

    .line 101
    .line 102
    if-ge v1, v2, :cond_6

    .line 103
    .line 104
    move-object v1, p1

    .line 105
    check-cast v1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;

    .line 106
    .line 107
    invoke-virtual {v1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;->getMessage()Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 112
    .line 113
    sget-object v3, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 114
    .line 115
    const-string v4, "send"

    .line 116
    .line 117
    const-string v5, "628"

    .line 118
    .line 119
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    invoke-virtual {v1}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->getQos()I

    .line 128
    .line 129
    .line 130
    move-result v7

    .line 131
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    filled-new-array {v6, v7, p1}, [Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    invoke-interface {v2, v3, v4, v5, v6}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->getQos()I

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    const/4 v2, 0x1

    .line 147
    if-eq v1, v2, :cond_5

    .line 148
    .line 149
    const/4 v2, 0x2

    .line 150
    if-eq v1, v2, :cond_4

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_4
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS2:Ljava/util/Hashtable;

    .line 154
    .line 155
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-virtual {v1, v2, p1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->persistence:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 167
    .line 168
    invoke-direct {p0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->getSendPersistenceKey(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    move-object v3, p1

    .line 173
    check-cast v3, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;

    .line 174
    .line 175
    invoke-interface {v1, v2, v3}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->put(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttPersistable;)V

    .line 176
    .line 177
    .line 178
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->tokenStore:Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;

    .line 179
    .line 180
    invoke-virtual {v1, p2, p1}, Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;->saveToken(Lorg/eclipse/paho/client/mqttv3/MqttToken;Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)V

    .line 181
    .line 182
    .line 183
    goto :goto_1

    .line 184
    :catchall_0
    move-exception p1

    .line 185
    goto :goto_2

    .line 186
    :cond_5
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS1:Ljava/util/Hashtable;

    .line 187
    .line 188
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 189
    .line 190
    .line 191
    move-result v2

    .line 192
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    invoke-virtual {v1, v2, p1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->persistence:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 200
    .line 201
    invoke-direct {p0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->getSendPersistenceKey(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    move-object v3, p1

    .line 206
    check-cast v3, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;

    .line 207
    .line 208
    invoke-interface {v1, v2, v3}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->put(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttPersistable;)V

    .line 209
    .line 210
    .line 211
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->tokenStore:Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;

    .line 212
    .line 213
    invoke-virtual {v1, p2, p1}, Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;->saveToken(Lorg/eclipse/paho/client/mqttv3/MqttToken;Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)V

    .line 214
    .line 215
    .line 216
    :goto_1
    iget-object p2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingMessages:Ljava/util/Vector;

    .line 217
    .line 218
    invoke-virtual {p2, p1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->queueLock:Ljava/lang/Object;

    .line 222
    .line 223
    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 224
    .line 225
    .line 226
    monitor-exit v0

    .line 227
    goto/16 :goto_5

    .line 228
    .line 229
    :cond_6
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 230
    .line 231
    sget-object p2, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 232
    .line 233
    const-string v2, "send"

    .line 234
    .line 235
    const-string v3, "613"

    .line 236
    .line 237
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    invoke-interface {p1, p2, v2, v3, v1}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    new-instance p1, Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 249
    .line 250
    const/16 p2, 0x7dca

    .line 251
    .line 252
    invoke-direct {p1, p2}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(I)V

    .line 253
    .line 254
    .line 255
    throw p1

    .line 256
    :goto_2
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 257
    throw p1

    .line 258
    :cond_7
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 259
    .line 260
    sget-object v1, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 261
    .line 262
    const-string v2, "send"

    .line 263
    .line 264
    const-string v3, "615"

    .line 265
    .line 266
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 267
    .line 268
    .line 269
    move-result v4

    .line 270
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    filled-new-array {v4, p1}, [Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v4

    .line 278
    invoke-interface {v0, v1, v2, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    instance-of v0, p1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttConnect;

    .line 282
    .line 283
    if-eqz v0, :cond_8

    .line 284
    .line 285
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->queueLock:Ljava/lang/Object;

    .line 286
    .line 287
    monitor-enter v0

    .line 288
    :try_start_2
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->tokenStore:Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;

    .line 289
    .line 290
    invoke-virtual {v1, p2, p1}, Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;->saveToken(Lorg/eclipse/paho/client/mqttv3/MqttToken;Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)V

    .line 291
    .line 292
    .line 293
    iget-object p2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingFlows:Ljava/util/Vector;

    .line 294
    .line 295
    const/4 v1, 0x0

    .line 296
    invoke-virtual {p2, p1, v1}, Ljava/util/Vector;->insertElementAt(Ljava/lang/Object;I)V

    .line 297
    .line 298
    .line 299
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->queueLock:Ljava/lang/Object;

    .line 300
    .line 301
    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 302
    .line 303
    .line 304
    monitor-exit v0

    .line 305
    goto :goto_5

    .line 306
    :catchall_1
    move-exception p1

    .line 307
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 308
    throw p1

    .line 309
    :cond_8
    instance-of v0, p1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPingReq;

    .line 310
    .line 311
    if-eqz v0, :cond_9

    .line 312
    .line 313
    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pingCommand:Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

    .line 314
    .line 315
    goto :goto_3

    .line 316
    :cond_9
    instance-of v0, p1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPubRel;

    .line 317
    .line 318
    if-eqz v0, :cond_a

    .line 319
    .line 320
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS2:Ljava/util/Hashtable;

    .line 321
    .line 322
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 323
    .line 324
    .line 325
    move-result v1

    .line 326
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    invoke-virtual {v0, v1, p1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->persistence:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 334
    .line 335
    invoke-direct {p0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->getSendConfirmPersistenceKey(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v1

    .line 339
    move-object v2, p1

    .line 340
    check-cast v2, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPubRel;

    .line 341
    .line 342
    invoke-interface {v0, v1, v2}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->put(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttPersistable;)V

    .line 343
    .line 344
    .line 345
    goto :goto_3

    .line 346
    :cond_a
    instance-of v0, p1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPubComp;

    .line 347
    .line 348
    if-eqz v0, :cond_b

    .line 349
    .line 350
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->persistence:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 351
    .line 352
    invoke-direct {p0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->getReceivedPersistenceKey(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v1

    .line 356
    invoke-interface {v0, v1}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->remove(Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    :cond_b
    :goto_3
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->queueLock:Ljava/lang/Object;

    .line 360
    .line 361
    monitor-enter v0

    .line 362
    :try_start_3
    instance-of v1, p1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttAck;

    .line 363
    .line 364
    if-nez v1, :cond_c

    .line 365
    .line 366
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->tokenStore:Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;

    .line 367
    .line 368
    invoke-virtual {v1, p2, p1}, Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;->saveToken(Lorg/eclipse/paho/client/mqttv3/MqttToken;Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)V

    .line 369
    .line 370
    .line 371
    goto :goto_4

    .line 372
    :catchall_2
    move-exception p1

    .line 373
    goto :goto_6

    .line 374
    :cond_c
    :goto_4
    iget-object p2, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingFlows:Ljava/util/Vector;

    .line 375
    .line 376
    invoke-virtual {p2, p1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->queueLock:Ljava/lang/Object;

    .line 380
    .line 381
    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 382
    .line 383
    .line 384
    monitor-exit v0

    .line 385
    :goto_5
    return-void

    .line 386
    :goto_6
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 387
    throw p1
.end method

.method public setCleanSession(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->cleanSession:Z

    .line 2
    .line 3
    return-void
.end method

.method public setKeepAliveInterval(J)V
    .locals 1

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    iput-wide p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->keepAliveNanos:J

    .line 8
    .line 9
    return-void
.end method

.method public setKeepAliveSecs(J)V
    .locals 1

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    iput-wide p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->keepAliveNanos:J

    .line 8
    .line 9
    return-void
.end method

.method public setMaxInflight(I)V
    .locals 1

    .line 1
    iput p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->maxInflight:I

    .line 2
    .line 3
    new-instance p1, Ljava/util/Vector;

    .line 4
    .line 5
    iget v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->maxInflight:I

    .line 6
    .line 7
    invoke-direct {p1, v0}, Ljava/util/Vector;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingMessages:Ljava/util/Vector;

    .line 11
    .line 12
    return-void
.end method

.method public unPersistBufferedMessage(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)V
    .locals 5

    .line 1
    const-string v0, "unPersistBufferedMessage"

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 4
    .line 5
    sget-object v2, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 6
    .line 7
    const-string v3, "517"

    .line 8
    .line 9
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getKey()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-interface {v1, v2, v0, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->persistence:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 21
    .line 22
    invoke-direct {p0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->getSendBufferedPersistenceKey(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-interface {v1, v2}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->remove(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/eclipse/paho/client/mqttv3/MqttPersistenceException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :catch_0
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 31
    .line 32
    sget-object v2, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getKey()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const-string v3, "518"

    .line 43
    .line 44
    invoke-interface {v1, v2, v0, v3, p1}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public undo(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->queueLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 5
    .line 6
    sget-object v2, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->CLASS_NAME:Ljava/lang/String;

    .line 7
    .line 8
    const-string v3, "undo"

    .line 9
    .line 10
    const-string v4, "618"

    .line 11
    .line 12
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 13
    .line 14
    .line 15
    move-result v5

    .line 16
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;->getMessage()Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    invoke-virtual {v6}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->getQos()I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    filled-new-array {v5, v6}, [Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-interface {v1, v2, v3, v4, v5}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;->getMessage()Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->getQos()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    const/4 v2, 0x1

    .line 48
    if-ne v1, v2, :cond_0

    .line 49
    .line 50
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS1:Ljava/util/Hashtable;

    .line 51
    .line 52
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v1, v2}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catchall_0
    move-exception p1

    .line 65
    goto :goto_1

    .line 66
    :cond_0
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->outboundQoS2:Ljava/util/Hashtable;

    .line 67
    .line 68
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {v1, v2}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    :goto_0
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->pendingMessages:Ljava/util/Vector;

    .line 80
    .line 81
    invoke-virtual {v1, p1}, Ljava/util/Vector;->removeElement(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->persistence:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 85
    .line 86
    invoke-direct {p0, p1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->getSendPersistenceKey(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-interface {v1, v2}, Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;->remove(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->tokenStore:Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;

    .line 94
    .line 95
    invoke-virtual {v1, p1}, Lorg/eclipse/paho/client/mqttv3/internal/CommsTokenStore;->removeToken(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;)Lorg/eclipse/paho/client/mqttv3/MqttToken;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;->getMessage()Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v1}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->getQos()I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-lez v1, :cond_1

    .line 107
    .line 108
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;->getMessageId()I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    invoke-direct {p0, v1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->releaseMessageId(I)V

    .line 113
    .line 114
    .line 115
    const/4 v1, 0x0

    .line 116
    invoke-virtual {p1, v1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttPublish;->setMessageId(I)V

    .line 117
    .line 118
    .line 119
    :cond_1
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientState;->checkQuiesceLock()Z

    .line 120
    .line 121
    .line 122
    monitor-exit v0

    .line 123
    return-void

    .line 124
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 125
    throw p1
.end method
