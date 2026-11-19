.class public Lorg/eclipse/paho/client/mqttv3/internal/Token;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final CLASS_NAME:Ljava/lang/String; = "org.eclipse.paho.client.mqttv3.internal.Token"


# instance fields
.field private callback:Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;

.field private client:Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

.field private volatile completed:Z

.field private exception:Lorg/eclipse/paho/client/mqttv3/MqttException;

.field private key:Ljava/lang/String;

.field private log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

.field protected message:Lorg/eclipse/paho/client/mqttv3/MqttMessage;

.field private messageID:I

.field private notified:Z

.field private pendingComplete:Z

.field private response:Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

.field private final responseLock:Ljava/lang/Object;

.field private sent:Z

.field private final sentLock:Ljava/lang/Object;

.field private topics:[Ljava/lang/String;

.field private userContext:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "org.eclipse.paho.client.mqttv3.internal.nls.logcat"

    .line 5
    .line 6
    sget-object v1, Lorg/eclipse/paho/client/mqttv3/internal/Token;->CLASS_NAME:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {v0, v1}, Lorg/eclipse/paho/client/mqttv3/logging/LoggerFactory;->getLogger(Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-boolean v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->completed:Z

    .line 16
    .line 17
    iput-boolean v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->pendingComplete:Z

    .line 18
    .line 19
    iput-boolean v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->sent:Z

    .line 20
    .line 21
    new-instance v1, Ljava/lang/Object;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->responseLock:Ljava/lang/Object;

    .line 27
    .line 28
    new-instance v1, Ljava/lang/Object;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->sentLock:Ljava/lang/Object;

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    iput-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->message:Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    .line 37
    .line 38
    iput-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->response:Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

    .line 39
    .line 40
    iput-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->exception:Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 41
    .line 42
    iput-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->topics:[Ljava/lang/String;

    .line 43
    .line 44
    iput-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->client:Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    .line 45
    .line 46
    iput-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->callback:Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;

    .line 47
    .line 48
    iput-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->userContext:Ljava/lang/Object;

    .line 49
    .line 50
    iput v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->messageID:I

    .line 51
    .line 52
    iput-boolean v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->notified:Z

    .line 53
    .line 54
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 55
    .line 56
    invoke-interface {v0, p1}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->setResourceName(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method


# virtual methods
.method public checkResult()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->getException()Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->getException()Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    throw v0
.end method

.method public getActionCallback()Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->callback:Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;

    .line 2
    .line 3
    return-object v0
.end method

.method public getClient()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->client:Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    .line 2
    .line 3
    return-object v0
.end method

.method public getException()Lorg/eclipse/paho/client/mqttv3/MqttException;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->exception:Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 2
    .line 3
    return-object v0
.end method

.method public getGrantedQos()[I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->response:Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

    .line 5
    .line 6
    instance-of v2, v1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttSuback;

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    check-cast v1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttSuback;

    .line 11
    .line 12
    invoke-virtual {v1}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttSuback;->getGrantedQos()[I

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_0
    return-object v0
.end method

.method public getKey()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->key:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMessage()Lorg/eclipse/paho/client/mqttv3/MqttMessage;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->message:Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMessageID()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->messageID:I

    .line 2
    .line 3
    return v0
.end method

.method public getResponse()Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->response:Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSessionPresent()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->response:Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

    .line 2
    .line 3
    instance-of v1, v0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttConnack;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttConnack;

    .line 8
    .line 9
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttConnack;->getSessionPresent()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0
.end method

.method public getTopics()[Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->topics:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getUserContext()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->userContext:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public getWireMessage()Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->response:Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

    .line 2
    .line 3
    return-object v0
.end method

.method public isComplete()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->completed:Z

    .line 2
    .line 3
    return v0
.end method

.method public isCompletePending()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->pendingComplete:Z

    .line 2
    .line 3
    return v0
.end method

.method public isInUse()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->getClient()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->isComplete()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public isNotified()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->notified:Z

    .line 2
    .line 3
    return v0
.end method

.method public markComplete(Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;Lorg/eclipse/paho/client/mqttv3/MqttException;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 2
    .line 3
    sget-object v1, Lorg/eclipse/paho/client/mqttv3/internal/Token;->CLASS_NAME:Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, "markComplete"

    .line 6
    .line 7
    const-string v3, "404"

    .line 8
    .line 9
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->getKey()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    filled-new-array {v4, p1, p2}, [Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-interface {v0, v1, v2, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->responseLock:Ljava/lang/Object;

    .line 21
    .line 22
    monitor-enter v0

    .line 23
    :try_start_0
    instance-of v1, p1, Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttAck;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    iput-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->message:Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    :goto_0
    const/4 v1, 0x1

    .line 34
    iput-boolean v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->pendingComplete:Z

    .line 35
    .line 36
    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->response:Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

    .line 37
    .line 38
    iput-object p2, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->exception:Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 39
    .line 40
    monitor-exit v0

    .line 41
    return-void

    .line 42
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    throw p1
.end method

.method public notifyComplete()V
    .locals 7

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 2
    .line 3
    sget-object v1, Lorg/eclipse/paho/client/mqttv3/internal/Token;->CLASS_NAME:Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, "notifyComplete"

    .line 6
    .line 7
    const-string v3, "404"

    .line 8
    .line 9
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->getKey()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    iget-object v5, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->response:Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

    .line 14
    .line 15
    iget-object v6, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->exception:Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 16
    .line 17
    filled-new-array {v4, v5, v6}, [Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-interface {v0, v1, v2, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->responseLock:Ljava/lang/Object;

    .line 25
    .line 26
    monitor-enter v0

    .line 27
    :try_start_0
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->exception:Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    iget-boolean v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->pendingComplete:Z

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    iput-boolean v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->completed:Z

    .line 38
    .line 39
    iput-boolean v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->pendingComplete:Z

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v1

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    iput-boolean v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->pendingComplete:Z

    .line 45
    .line 46
    :goto_0
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->responseLock:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 49
    .line 50
    .line 51
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->sentLock:Ljava/lang/Object;

    .line 53
    .line 54
    monitor-enter v1

    .line 55
    :try_start_1
    iput-boolean v3, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->sent:Z

    .line 56
    .line 57
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->sentLock:Ljava/lang/Object;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 60
    .line 61
    .line 62
    monitor-exit v1

    .line 63
    return-void

    .line 64
    :catchall_1
    move-exception v0

    .line 65
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 66
    throw v0

    .line 67
    :goto_1
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 68
    throw v1
.end method

.method public notifySent()V
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 2
    .line 3
    sget-object v1, Lorg/eclipse/paho/client/mqttv3/internal/Token;->CLASS_NAME:Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, "notifySent"

    .line 6
    .line 7
    const-string v3, "403"

    .line 8
    .line 9
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->getKey()Ljava/lang/String;

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
    invoke-interface {v0, v1, v2, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->responseLock:Ljava/lang/Object;

    .line 21
    .line 22
    monitor-enter v0

    .line 23
    const/4 v1, 0x0

    .line 24
    :try_start_0
    iput-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->response:Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    iput-boolean v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->completed:Z

    .line 28
    .line 29
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 30
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->sentLock:Ljava/lang/Object;

    .line 31
    .line 32
    monitor-enter v1

    .line 33
    const/4 v0, 0x1

    .line 34
    :try_start_1
    iput-boolean v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->sent:Z

    .line 35
    .line 36
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->sentLock:Ljava/lang/Object;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 39
    .line 40
    .line 41
    monitor-exit v1

    .line 42
    return-void

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    throw v0

    .line 46
    :catchall_1
    move-exception v1

    .line 47
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 48
    throw v1
.end method

.method public reset()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->isInUse()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 8
    .line 9
    sget-object v1, Lorg/eclipse/paho/client/mqttv3/internal/Token;->CLASS_NAME:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->getKey()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, "reset"

    .line 20
    .line 21
    const-string v4, "410"

    .line 22
    .line 23
    invoke-interface {v0, v1, v3, v4, v2}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->client:Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    iput-boolean v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->completed:Z

    .line 31
    .line 32
    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->response:Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

    .line 33
    .line 34
    iput-boolean v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->sent:Z

    .line 35
    .line 36
    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->exception:Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 37
    .line 38
    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->userContext:Ljava/lang/Object;

    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    new-instance v0, Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 42
    .line 43
    const/16 v1, 0x7dc9

    .line 44
    .line 45
    invoke-direct {v0, v1}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(I)V

    .line 46
    .line 47
    .line 48
    throw v0
.end method

.method public setActionCallback(Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->callback:Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;

    .line 2
    .line 3
    return-void
.end method

.method public setClient(Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->client:Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    .line 2
    .line 3
    return-void
.end method

.method public setException(Lorg/eclipse/paho/client/mqttv3/MqttException;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->responseLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->exception:Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-void

    .line 8
    :catchall_0
    move-exception p1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw p1
.end method

.method public setKey(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->key:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setMessage(Lorg/eclipse/paho/client/mqttv3/MqttMessage;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->message:Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    .line 2
    .line 3
    return-void
.end method

.method public setMessageID(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->messageID:I

    .line 2
    .line 3
    return-void
.end method

.method public setNotified(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->notified:Z

    .line 2
    .line 3
    return-void
.end method

.method public setTopics([Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, [Ljava/lang/String;

    .line 6
    .line 7
    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->topics:[Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method

.method public setUserContext(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->userContext:Ljava/lang/Object;

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuffer;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "key="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->getKey()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 16
    .line 17
    .line 18
    const-string v1, " ,topics="

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->getTopics()[Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    :goto_0
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->getTopics()[Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    array-length v2, v2

    .line 35
    if-lt v1, v2, :cond_0

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->getTopics()[Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    aget-object v2, v2, v1

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 45
    .line 46
    .line 47
    const-string v2, ", "

    .line 48
    .line 49
    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 50
    .line 51
    .line 52
    add-int/lit8 v1, v1, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    :goto_1
    const-string v1, " ,usercontext="

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->getUserContext()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 65
    .line 66
    .line 67
    const-string v1, " ,isComplete="

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->isComplete()Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Z)Ljava/lang/StringBuffer;

    .line 77
    .line 78
    .line 79
    const-string v1, " ,isNotified="

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->isNotified()Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Z)Ljava/lang/StringBuffer;

    .line 89
    .line 90
    .line 91
    const-string v1, " ,exception="

    .line 92
    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->getException()Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 101
    .line 102
    .line 103
    const-string v1, " ,actioncallback="

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->getActionCallback()Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    return-object v0
.end method

.method public waitForCompletion()V
    .locals 2

    const-wide/16 v0, -0x1

    .line 1
    invoke-virtual {p0, v0, v1}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->waitForCompletion(J)V

    return-void
.end method

.method public waitForCompletion(J)V
    .locals 5

    .line 2
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    sget-object v1, Lorg/eclipse/paho/client/mqttv3/internal/Token;->CLASS_NAME:Ljava/lang/String;

    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    filled-new-array {v2, v3, p0}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "waitForCompletion"

    const-string v4, "407"

    invoke-interface {v0, v1, v3, v4, v2}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3
    invoke-virtual {p0, p1, p2}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->waitForResponse(J)Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

    move-result-object p1

    if-nez p1, :cond_1

    .line 4
    iget-boolean p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->completed:Z

    if-eqz p1, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->getKey()Ljava/lang/String;

    move-result-object p2

    filled-new-array {p2, p0}, [Ljava/lang/Object;

    move-result-object p2

    const-string v0, "406"

    invoke-interface {p1, v1, v3, v0, p2}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6
    new-instance p1, Lorg/eclipse/paho/client/mqttv3/MqttException;

    const/16 p2, 0x7d00

    invoke-direct {p1, p2}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(I)V

    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->exception:Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 7
    throw p1

    .line 8
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->checkResult()Z

    return-void
.end method

.method public waitForResponse()Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;
    .locals 2

    const-wide/16 v0, -0x1

    .line 1
    invoke-virtual {p0, v0, v1}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->waitForResponse(J)Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

    move-result-object v0

    return-object v0
.end method

.method public waitForResponse(J)Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;
    .locals 13

    .line 2
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->responseLock:Ljava/lang/Object;

    monitor-enter v1

    .line 3
    :try_start_0
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    sget-object v3, Lorg/eclipse/paho/client/mqttv3/internal/Token;->CLASS_NAME:Ljava/lang/String;

    const-string v4, "waitForResponse"

    const-string v5, "400"

    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->getKey()Ljava/lang/String;

    move-result-object v6

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    iget-boolean v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->sent:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    iget-boolean v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->completed:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->exception:Lorg/eclipse/paho/client/mqttv3/MqttException;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-nez v0, :cond_0

    :try_start_1
    const-string v10, "false"
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    move-object v12, p0

    goto/16 :goto_5

    :cond_0
    :try_start_2
    const-string v10, "true"

    :goto_0
    iget-object v11, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->response:Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object v12, p0

    :try_start_3
    filled-new-array/range {v6 .. v12}, [Ljava/lang/Object;

    move-result-object v6

    move-object v7, v0

    invoke-interface/range {v2 .. v7}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 4
    :cond_1
    iget-boolean v0, v12, Lorg/eclipse/paho/client/mqttv3/internal/Token;->completed:Z

    if-eqz v0, :cond_2

    goto :goto_4

    .line 5
    :cond_2
    iget-object v0, v12, Lorg/eclipse/paho/client/mqttv3/internal/Token;->exception:Lorg/eclipse/paho/client/mqttv3/MqttException;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    const-wide/16 v2, 0x0

    if-nez v0, :cond_4

    .line 6
    :try_start_4
    iget-object v0, v12, Lorg/eclipse/paho/client/mqttv3/internal/Token;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    sget-object v4, Lorg/eclipse/paho/client/mqttv3/internal/Token;->CLASS_NAME:Ljava/lang/String;

    const-string v5, "waitForResponse"

    const-string v6, "408"

    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->getKey()Ljava/lang/String;

    move-result-object v7

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    filled-new-array {v7, v8}, [Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v0, v4, v5, v6, v7}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    cmp-long v0, p1, v2

    if-gtz v0, :cond_3

    .line 7
    iget-object v0, v12, Lorg/eclipse/paho/client/mqttv3/internal/Token;->responseLock:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->wait()V

    goto :goto_3

    :catchall_1
    move-exception v0

    :goto_1
    move-object p1, v0

    goto :goto_5

    :catch_0
    move-exception v0

    goto :goto_2

    .line 8
    :cond_3
    iget-object v0, v12, Lorg/eclipse/paho/client/mqttv3/internal/Token;->responseLock:Ljava/lang/Object;

    invoke-virtual {v0, p1, p2}, Ljava/lang/Object;->wait(J)V
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_3

    .line 9
    :goto_2
    :try_start_5
    new-instance v4, Lorg/eclipse/paho/client/mqttv3/MqttException;

    invoke-direct {v4, v0}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(Ljava/lang/Throwable;)V

    iput-object v4, v12, Lorg/eclipse/paho/client/mqttv3/internal/Token;->exception:Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 10
    :cond_4
    :goto_3
    iget-boolean v0, v12, Lorg/eclipse/paho/client/mqttv3/internal/Token;->completed:Z

    if-nez v0, :cond_1

    .line 11
    iget-object v9, v12, Lorg/eclipse/paho/client/mqttv3/internal/Token;->exception:Lorg/eclipse/paho/client/mqttv3/MqttException;

    if-nez v9, :cond_5

    cmp-long v0, p1, v2

    if-lez v0, :cond_1

    .line 12
    :goto_4
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 13
    iget-object p1, v12, Lorg/eclipse/paho/client/mqttv3/internal/Token;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    sget-object p2, Lorg/eclipse/paho/client/mqttv3/internal/Token;->CLASS_NAME:Ljava/lang/String;

    const-string v0, "waitForResponse"

    const-string v1, "402"

    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->getKey()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v12, Lorg/eclipse/paho/client/mqttv3/internal/Token;->response:Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

    filled-new-array {v2, v3}, [Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1, p2, v0, v1, v2}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 14
    iget-object p1, v12, Lorg/eclipse/paho/client/mqttv3/internal/Token;->response:Lorg/eclipse/paho/client/mqttv3/internal/wire/MqttWireMessage;

    return-object p1

    .line 15
    :cond_5
    :try_start_6
    iget-object v4, v12, Lorg/eclipse/paho/client/mqttv3/internal/Token;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    sget-object v5, Lorg/eclipse/paho/client/mqttv3/internal/Token;->CLASS_NAME:Ljava/lang/String;

    const-string v6, "waitForResponse"

    const-string v7, "401"

    const/4 v8, 0x0

    invoke-interface/range {v4 .. v9}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 16
    iget-object p1, v12, Lorg/eclipse/paho/client/mqttv3/internal/Token;->exception:Lorg/eclipse/paho/client/mqttv3/MqttException;

    throw p1

    :catchall_2
    move-exception v0

    move-object v12, p0

    goto :goto_1

    .line 17
    :goto_5
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw p1
.end method

.method public waitUntilSent()V
    .locals 6

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->sentLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->responseLock:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    :try_start_1
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->exception:Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 8
    .line 9
    if-nez v2, :cond_3

    .line 10
    .line 11
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 12
    :catch_0
    :goto_0
    :try_start_2
    iget-boolean v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->sent:Z

    .line 13
    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->exception:Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    const/4 v1, 0x6

    .line 23
    invoke-static {v1}, Lorg/eclipse/paho/client/mqttv3/internal/ExceptionHelper;->createMqttException(I)Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    throw v1

    .line 28
    :catchall_0
    move-exception v1

    .line 29
    goto :goto_2

    .line 30
    :cond_0
    throw v1

    .line 31
    :cond_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 32
    return-void

    .line 33
    :cond_2
    :try_start_3
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->log:Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 34
    .line 35
    sget-object v2, Lorg/eclipse/paho/client/mqttv3/internal/Token;->CLASS_NAME:Ljava/lang/String;

    .line 36
    .line 37
    const-string v3, "waitUntilSent"

    .line 38
    .line 39
    const-string v4, "409"

    .line 40
    .line 41
    invoke-virtual {p0}, Lorg/eclipse/paho/client/mqttv3/internal/Token;->getKey()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-interface {v1, v2, v3, v4, v5}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/internal/Token;->sentLock:Ljava/lang/Object;

    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :catchall_1
    move-exception v2

    .line 59
    goto :goto_1

    .line 60
    :cond_3
    :try_start_4
    throw v2

    .line 61
    :goto_1
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 62
    :try_start_5
    throw v2

    .line 63
    :goto_2
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 64
    throw v1
.end method
