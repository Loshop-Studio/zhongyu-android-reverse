.class Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient$MqttReconnectActionListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "MqttReconnectActionListener"
.end annotation


# instance fields
.field final methodName:Ljava/lang/String;

.field final synthetic this$0:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;


# direct methods
.method public constructor <init>(Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient$MqttReconnectActionListener;->this$0:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient$MqttReconnectActionListener;->methodName:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method private rescheduleReconnectCycle(I)V
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient$MqttReconnectActionListener;->methodName:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v1, ":rescheduleReconnectCycle"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient$MqttReconnectActionListener;->this$0:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 22
    .line 23
    invoke-static {v1}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->access$0(Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;)Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->access$1()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    const-string v3, "505"

    .line 32
    .line 33
    iget-object v4, p0, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient$MqttReconnectActionListener;->this$0:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 34
    .line 35
    invoke-static {v4}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->access$9(Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-static {}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->access$6()I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    filled-new-array {v4, v5}, [Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-interface {v1, v2, v0, v3, v4}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-static {}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->access$10()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    monitor-enter v0

    .line 59
    :try_start_0
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient$MqttReconnectActionListener;->this$0:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 60
    .line 61
    invoke-static {v1}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->access$7(Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;)Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v1}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->isAutomaticReconnect()Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_1

    .line 70
    .line 71
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient$MqttReconnectActionListener;->this$0:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 72
    .line 73
    invoke-static {v1}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->access$11(Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;)Ljava/util/Timer;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    if-eqz v1, :cond_0

    .line 78
    .line 79
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient$MqttReconnectActionListener;->this$0:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 80
    .line 81
    invoke-static {v1}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->access$11(Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;)Ljava/util/Timer;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    new-instance v2, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient$ReconnectTask;

    .line 86
    .line 87
    iget-object v3, p0, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient$MqttReconnectActionListener;->this$0:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 88
    .line 89
    const/4 v4, 0x0

    .line 90
    invoke-direct {v2, v3, v4}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient$ReconnectTask;-><init>(Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient$ReconnectTask;)V

    .line 91
    .line 92
    .line 93
    int-to-long v3, p1

    .line 94
    invoke-virtual {v1, v2, v3, v4}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :catchall_0
    move-exception p1

    .line 99
    goto :goto_1

    .line 100
    :cond_0
    invoke-static {p1}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->access$8(I)V

    .line 101
    .line 102
    .line 103
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient$MqttReconnectActionListener;->this$0:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 104
    .line 105
    invoke-static {p1}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->access$4(Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;)V

    .line 106
    .line 107
    .line 108
    :cond_1
    :goto_0
    monitor-exit v0

    .line 109
    return-void

    .line 110
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    throw p1
.end method


# virtual methods
.method public onFailure(Lorg/eclipse/paho/client/mqttv3/IMqttToken;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    iget-object p2, p0, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient$MqttReconnectActionListener;->this$0:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 2
    .line 3
    invoke-static {p2}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->access$0(Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;)Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-static {}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->access$1()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient$MqttReconnectActionListener;->methodName:Ljava/lang/String;

    .line 12
    .line 13
    invoke-interface {p1}, Lorg/eclipse/paho/client/mqttv3/IMqttToken;->getClient()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {p1}, Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;->getClientId()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v2, "502"

    .line 26
    .line 27
    invoke-interface {p2, v0, v1, v2, p1}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->access$6()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    iget-object p2, p0, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient$MqttReconnectActionListener;->this$0:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 35
    .line 36
    invoke-static {p2}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->access$7(Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;)Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-virtual {p2}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->getMaxReconnectDelay()I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-ge p1, p2, :cond_0

    .line 45
    .line 46
    invoke-static {}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->access$6()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    mul-int/lit8 p1, p1, 0x2

    .line 51
    .line 52
    invoke-static {p1}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->access$8(I)V

    .line 53
    .line 54
    .line 55
    :cond_0
    invoke-static {}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->access$6()I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    invoke-direct {p0, p1}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient$MqttReconnectActionListener;->rescheduleReconnectCycle(I)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public onSuccess(Lorg/eclipse/paho/client/mqttv3/IMqttToken;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient$MqttReconnectActionListener;->this$0:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 2
    .line 3
    invoke-static {v0}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->access$0(Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;)Lorg/eclipse/paho/client/mqttv3/logging/Logger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->access$1()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient$MqttReconnectActionListener;->methodName:Ljava/lang/String;

    .line 12
    .line 13
    invoke-interface {p1}, Lorg/eclipse/paho/client/mqttv3/IMqttToken;->getClient()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {p1}, Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;->getClientId()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v3, "501"

    .line 26
    .line 27
    invoke-interface {v0, v1, v2, v3, p1}, Lorg/eclipse/paho/client/mqttv3/logging/Logger;->fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient$MqttReconnectActionListener;->this$0:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 31
    .line 32
    iget-object p1, p1, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->comms:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    invoke-virtual {p1, v0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->setRestingState(Z)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient$MqttReconnectActionListener;->this$0:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 39
    .line 40
    invoke-static {p1}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->access$5(Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method
