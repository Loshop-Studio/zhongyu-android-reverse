.class public Lorg/eclipse/paho/android/service/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/eclipse/paho/client/mqttv3/MqttCallbackExtended;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/eclipse/paho/android/service/c$d;
    }
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

.field public d:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

.field public h:Laf/a;

.field public i:Lorg/eclipse/paho/android/service/MqttService;

.field public volatile j:Z

.field public k:Z

.field public volatile l:Z

.field public m:Ljava/util/Map;

.field public n:Ljava/util/Map;

.field public o:Ljava/util/Map;

.field public p:Ljava/util/Map;

.field public q:Landroid/os/PowerManager$WakeLock;

.field public r:Ljava/lang/String;

.field public s:Lorg/eclipse/paho/client/mqttv3/DisconnectedBufferOptions;


# direct methods
.method public constructor <init>(Lorg/eclipse/paho/android/service/MqttService;Ljava/lang/String;Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lorg/eclipse/paho/android/service/c;->c:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 6
    .line 7
    iput-object v0, p0, Lorg/eclipse/paho/android/service/c;->f:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, Lorg/eclipse/paho/android/service/c;->g:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 10
    .line 11
    iput-object v0, p0, Lorg/eclipse/paho/android/service/c;->h:Laf/a;

    .line 12
    .line 13
    iput-object v0, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    iput-boolean v1, p0, Lorg/eclipse/paho/android/service/c;->j:Z

    .line 17
    .line 18
    iput-boolean v1, p0, Lorg/eclipse/paho/android/service/c;->k:Z

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    iput-boolean v1, p0, Lorg/eclipse/paho/android/service/c;->l:Z

    .line 22
    .line 23
    new-instance v1, Ljava/util/HashMap;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lorg/eclipse/paho/android/service/c;->m:Ljava/util/Map;

    .line 29
    .line 30
    new-instance v1, Ljava/util/HashMap;

    .line 31
    .line 32
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Lorg/eclipse/paho/android/service/c;->n:Ljava/util/Map;

    .line 36
    .line 37
    new-instance v1, Ljava/util/HashMap;

    .line 38
    .line 39
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v1, p0, Lorg/eclipse/paho/android/service/c;->o:Ljava/util/Map;

    .line 43
    .line 44
    new-instance v1, Ljava/util/HashMap;

    .line 45
    .line 46
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object v1, p0, Lorg/eclipse/paho/android/service/c;->p:Ljava/util/Map;

    .line 50
    .line 51
    iput-object v0, p0, Lorg/eclipse/paho/android/service/c;->q:Landroid/os/PowerManager$WakeLock;

    .line 52
    .line 53
    iput-object v0, p0, Lorg/eclipse/paho/android/service/c;->r:Ljava/lang/String;

    .line 54
    .line 55
    iput-object v0, p0, Lorg/eclipse/paho/android/service/c;->s:Lorg/eclipse/paho/client/mqttv3/DisconnectedBufferOptions;

    .line 56
    .line 57
    iput-object p2, p0, Lorg/eclipse/paho/android/service/c;->a:Ljava/lang/String;

    .line 58
    .line 59
    iput-object p1, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 60
    .line 61
    iput-object p3, p0, Lorg/eclipse/paho/android/service/c;->b:Ljava/lang/String;

    .line 62
    .line 63
    iput-object p4, p0, Lorg/eclipse/paho/android/service/c;->c:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 64
    .line 65
    iput-object p5, p0, Lorg/eclipse/paho/android/service/c;->e:Ljava/lang/String;

    .line 66
    .line 67
    new-instance p1, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object p4

    .line 73
    invoke-virtual {p4}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p4

    .line 77
    invoke-direct {p1, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const-string p4, " "

    .line 81
    .line 82
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string p3, "on host "

    .line 92
    .line 93
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    iput-object p1, p0, Lorg/eclipse/paho/android/service/c;->r:Ljava/lang/String;

    .line 104
    .line 105
    return-void
.end method

.method public static synthetic a(Lorg/eclipse/paho/android/service/c;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lorg/eclipse/paho/android/service/c;->m(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Lorg/eclipse/paho/android/service/c;)Lorg/eclipse/paho/android/service/MqttService;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic c(Lorg/eclipse/paho/android/service/c;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lorg/eclipse/paho/android/service/c;->l(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(Lorg/eclipse/paho/android/service/c;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/eclipse/paho/android/service/c;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public A(Lorg/eclipse/paho/client/mqttv3/DisconnectedBufferOptions;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lorg/eclipse/paho/android/service/c;->s:Lorg/eclipse/paho/client/mqttv3/DisconnectedBufferOptions;

    .line 2
    .line 3
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->g:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->setBufferOpts(Lorg/eclipse/paho/client/mqttv3/DisconnectedBufferOptions;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final declared-synchronized B(Z)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-boolean p1, p0, Lorg/eclipse/paho/android/service/c;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method

.method public final C(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttMessage;Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->m:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lorg/eclipse/paho/android/service/c;->n:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {p1, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lorg/eclipse/paho/android/service/c;->o:Ljava/util/Map;

    .line 12
    .line 13
    invoke-interface {p1, p3, p5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lorg/eclipse/paho/android/service/c;->p:Ljava/util/Map;

    .line 17
    .line 18
    invoke-interface {p1, p3, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public D(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "subscribe({"

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v2, "},"

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v2, ",{"

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v2, "}, {"

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v2, "}"

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const-string v2, "MqttConnection"

    .line 50
    .line 51
    invoke-virtual {v0, v2, v1}, Lorg/eclipse/paho/android/service/MqttService;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    new-instance v0, Landroid/os/Bundle;

    .line 55
    .line 56
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 57
    .line 58
    .line 59
    const-string v1, "MqttService.callbackAction"

    .line 60
    .line 61
    const-string v2, "subscribe"

    .line 62
    .line 63
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string v1, "MqttService.activityToken"

    .line 67
    .line 68
    invoke-virtual {v0, v1, p4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const-string p4, "MqttService.invocationContext"

    .line 72
    .line 73
    invoke-virtual {v0, p4, p3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    iget-object p4, p0, Lorg/eclipse/paho/android/service/c;->g:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 77
    .line 78
    if-eqz p4, :cond_0

    .line 79
    .line 80
    invoke-virtual {p4}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->isConnected()Z

    .line 81
    .line 82
    .line 83
    move-result p4

    .line 84
    if-eqz p4, :cond_0

    .line 85
    .line 86
    new-instance p4, Lorg/eclipse/paho/android/service/c$d;

    .line 87
    .line 88
    const/4 v1, 0x0

    .line 89
    invoke-direct {p4, p0, v0, v1}, Lorg/eclipse/paho/android/service/c$d;-><init>(Lorg/eclipse/paho/android/service/c;Landroid/os/Bundle;Lorg/eclipse/paho/android/service/c$a;)V

    .line 90
    .line 91
    .line 92
    :try_start_0
    iget-object v1, p0, Lorg/eclipse/paho/android/service/c;->g:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 93
    .line 94
    invoke-virtual {v1, p1, p2, p3, p4}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->subscribe(Ljava/lang/String;ILjava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :catch_0
    move-exception p1

    .line 99
    invoke-virtual {p0, v0, p1}, Lorg/eclipse/paho/android/service/c;->s(Landroid/os/Bundle;Ljava/lang/Exception;)V

    .line 100
    .line 101
    .line 102
    :goto_0
    return-void

    .line 103
    :cond_0
    const-string p1, "MqttService.errorMessage"

    .line 104
    .line 105
    const-string p2, "not connected"

    .line 106
    .line 107
    invoke-virtual {v0, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    iget-object p1, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 111
    .line 112
    invoke-virtual {p1, v2, p2}, Lorg/eclipse/paho/android/service/MqttService;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    iget-object p1, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 116
    .line 117
    iget-object p2, p0, Lorg/eclipse/paho/android/service/c;->e:Ljava/lang/String;

    .line 118
    .line 119
    sget-object p3, Lorg/eclipse/paho/android/service/Status;->d:Lorg/eclipse/paho/android/service/Status;

    .line 120
    .line 121
    invoke-virtual {p1, p2, p3, v0}, Lorg/eclipse/paho/android/service/MqttService;->f(Ljava/lang/String;Lorg/eclipse/paho/android/service/Status;Landroid/os/Bundle;)V

    .line 122
    .line 123
    .line 124
    return-void
.end method

.method public E([Ljava/lang/String;[ILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "subscribe({"

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v2, "},"

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-static {p2}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v2, ",{"

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v2, "}, {"

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v2, "}"

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    const-string v2, "MqttConnection"

    .line 58
    .line 59
    invoke-virtual {v0, v2, v1}, Lorg/eclipse/paho/android/service/MqttService;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    new-instance v0, Landroid/os/Bundle;

    .line 63
    .line 64
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 65
    .line 66
    .line 67
    const-string v1, "MqttService.callbackAction"

    .line 68
    .line 69
    const-string v2, "subscribe"

    .line 70
    .line 71
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const-string v1, "MqttService.activityToken"

    .line 75
    .line 76
    invoke-virtual {v0, v1, p4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const-string p4, "MqttService.invocationContext"

    .line 80
    .line 81
    invoke-virtual {v0, p4, p3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    iget-object p4, p0, Lorg/eclipse/paho/android/service/c;->g:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 85
    .line 86
    if-eqz p4, :cond_0

    .line 87
    .line 88
    invoke-virtual {p4}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->isConnected()Z

    .line 89
    .line 90
    .line 91
    move-result p4

    .line 92
    if-eqz p4, :cond_0

    .line 93
    .line 94
    new-instance p4, Lorg/eclipse/paho/android/service/c$d;

    .line 95
    .line 96
    const/4 v1, 0x0

    .line 97
    invoke-direct {p4, p0, v0, v1}, Lorg/eclipse/paho/android/service/c$d;-><init>(Lorg/eclipse/paho/android/service/c;Landroid/os/Bundle;Lorg/eclipse/paho/android/service/c$a;)V

    .line 98
    .line 99
    .line 100
    :try_start_0
    iget-object v1, p0, Lorg/eclipse/paho/android/service/c;->g:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 101
    .line 102
    invoke-virtual {v1, p1, p2, p3, p4}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->subscribe([Ljava/lang/String;[ILjava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :catch_0
    move-exception p1

    .line 107
    invoke-virtual {p0, v0, p1}, Lorg/eclipse/paho/android/service/c;->s(Landroid/os/Bundle;Ljava/lang/Exception;)V

    .line 108
    .line 109
    .line 110
    :goto_0
    return-void

    .line 111
    :cond_0
    const-string p1, "MqttService.errorMessage"

    .line 112
    .line 113
    const-string p2, "not connected"

    .line 114
    .line 115
    invoke-virtual {v0, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    iget-object p1, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 119
    .line 120
    invoke-virtual {p1, v2, p2}, Lorg/eclipse/paho/android/service/MqttService;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    iget-object p1, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 124
    .line 125
    iget-object p2, p0, Lorg/eclipse/paho/android/service/c;->e:Ljava/lang/String;

    .line 126
    .line 127
    sget-object p3, Lorg/eclipse/paho/android/service/Status;->d:Lorg/eclipse/paho/android/service/Status;

    .line 128
    .line 129
    invoke-virtual {p1, p2, p3, v0}, Lorg/eclipse/paho/android/service/MqttService;->f(Ljava/lang/String;Lorg/eclipse/paho/android/service/Status;Landroid/os/Bundle;)V

    .line 130
    .line 131
    .line 132
    return-void
.end method

.method public F([Ljava/lang/String;[ILjava/lang/String;Ljava/lang/String;[Lorg/eclipse/paho/client/mqttv3/IMqttMessageListener;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "subscribe({"

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v2, "},"

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-static {p2}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v2, ",{"

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v2, "}, {"

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v2, "}"

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    const-string v2, "MqttConnection"

    .line 58
    .line 59
    invoke-virtual {v0, v2, v1}, Lorg/eclipse/paho/android/service/MqttService;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    new-instance v0, Landroid/os/Bundle;

    .line 63
    .line 64
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 65
    .line 66
    .line 67
    const-string v1, "MqttService.callbackAction"

    .line 68
    .line 69
    const-string v2, "subscribe"

    .line 70
    .line 71
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const-string v1, "MqttService.activityToken"

    .line 75
    .line 76
    invoke-virtual {v0, v1, p4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const-string p4, "MqttService.invocationContext"

    .line 80
    .line 81
    invoke-virtual {v0, p4, p3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    iget-object p3, p0, Lorg/eclipse/paho/android/service/c;->g:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 85
    .line 86
    if-eqz p3, :cond_0

    .line 87
    .line 88
    invoke-virtual {p3}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->isConnected()Z

    .line 89
    .line 90
    .line 91
    move-result p3

    .line 92
    if-eqz p3, :cond_0

    .line 93
    .line 94
    new-instance p3, Lorg/eclipse/paho/android/service/c$d;

    .line 95
    .line 96
    const/4 p4, 0x0

    .line 97
    invoke-direct {p3, p0, v0, p4}, Lorg/eclipse/paho/android/service/c$d;-><init>(Lorg/eclipse/paho/android/service/c;Landroid/os/Bundle;Lorg/eclipse/paho/android/service/c$a;)V

    .line 98
    .line 99
    .line 100
    :try_start_0
    iget-object p3, p0, Lorg/eclipse/paho/android/service/c;->g:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 101
    .line 102
    invoke-virtual {p3, p1, p2, p5}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->subscribe([Ljava/lang/String;[I[Lorg/eclipse/paho/client/mqttv3/IMqttMessageListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :catch_0
    move-exception p1

    .line 107
    invoke-virtual {p0, v0, p1}, Lorg/eclipse/paho/android/service/c;->s(Landroid/os/Bundle;Ljava/lang/Exception;)V

    .line 108
    .line 109
    .line 110
    :goto_0
    return-void

    .line 111
    :cond_0
    const-string p1, "MqttService.errorMessage"

    .line 112
    .line 113
    const-string p2, "not connected"

    .line 114
    .line 115
    invoke-virtual {v0, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    iget-object p1, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 119
    .line 120
    invoke-virtual {p1, v2, p2}, Lorg/eclipse/paho/android/service/MqttService;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    iget-object p1, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 124
    .line 125
    iget-object p2, p0, Lorg/eclipse/paho/android/service/c;->e:Ljava/lang/String;

    .line 126
    .line 127
    sget-object p3, Lorg/eclipse/paho/android/service/Status;->d:Lorg/eclipse/paho/android/service/Status;

    .line 128
    .line 129
    invoke-virtual {p1, p2, p3, v0}, Lorg/eclipse/paho/android/service/MqttService;->f(Ljava/lang/String;Lorg/eclipse/paho/android/service/Status;Landroid/os/Bundle;)V

    .line 130
    .line 131
    .line 132
    return-void
.end method

.method public G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "unsubscribe({"

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v2, "},{"

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v2, "}, {"

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v2, "})"

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const-string v2, "MqttConnection"

    .line 42
    .line 43
    invoke-virtual {v0, v2, v1}, Lorg/eclipse/paho/android/service/MqttService;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    new-instance v0, Landroid/os/Bundle;

    .line 47
    .line 48
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 49
    .line 50
    .line 51
    const-string v1, "MqttService.callbackAction"

    .line 52
    .line 53
    const-string v2, "unsubscribe"

    .line 54
    .line 55
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const-string v1, "MqttService.activityToken"

    .line 59
    .line 60
    invoke-virtual {v0, v1, p3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const-string p3, "MqttService.invocationContext"

    .line 64
    .line 65
    invoke-virtual {v0, p3, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    iget-object p3, p0, Lorg/eclipse/paho/android/service/c;->g:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 69
    .line 70
    if-eqz p3, :cond_0

    .line 71
    .line 72
    invoke-virtual {p3}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->isConnected()Z

    .line 73
    .line 74
    .line 75
    move-result p3

    .line 76
    if-eqz p3, :cond_0

    .line 77
    .line 78
    new-instance p3, Lorg/eclipse/paho/android/service/c$d;

    .line 79
    .line 80
    const/4 v1, 0x0

    .line 81
    invoke-direct {p3, p0, v0, v1}, Lorg/eclipse/paho/android/service/c$d;-><init>(Lorg/eclipse/paho/android/service/c;Landroid/os/Bundle;Lorg/eclipse/paho/android/service/c$a;)V

    .line 82
    .line 83
    .line 84
    :try_start_0
    iget-object v1, p0, Lorg/eclipse/paho/android/service/c;->g:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 85
    .line 86
    invoke-virtual {v1, p1, p2, p3}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->unsubscribe(Ljava/lang/String;Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :catch_0
    move-exception p1

    .line 91
    invoke-virtual {p0, v0, p1}, Lorg/eclipse/paho/android/service/c;->s(Landroid/os/Bundle;Ljava/lang/Exception;)V

    .line 92
    .line 93
    .line 94
    :goto_0
    return-void

    .line 95
    :cond_0
    const-string p1, "MqttService.errorMessage"

    .line 96
    .line 97
    const-string p2, "not connected"

    .line 98
    .line 99
    invoke-virtual {v0, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    iget-object p1, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 103
    .line 104
    const-string p3, "subscribe"

    .line 105
    .line 106
    invoke-virtual {p1, p3, p2}, Lorg/eclipse/paho/android/service/MqttService;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    iget-object p1, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 110
    .line 111
    iget-object p2, p0, Lorg/eclipse/paho/android/service/c;->e:Ljava/lang/String;

    .line 112
    .line 113
    sget-object p3, Lorg/eclipse/paho/android/service/Status;->d:Lorg/eclipse/paho/android/service/Status;

    .line 114
    .line 115
    invoke-virtual {p1, p2, p3, v0}, Lorg/eclipse/paho/android/service/MqttService;->f(Ljava/lang/String;Lorg/eclipse/paho/android/service/Status;Landroid/os/Bundle;)V

    .line 116
    .line 117
    .line 118
    return-void
.end method

.method public H([Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "unsubscribe({"

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v2, "},{"

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v2, "}, {"

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v2, "})"

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-string v2, "MqttConnection"

    .line 46
    .line 47
    invoke-virtual {v0, v2, v1}, Lorg/eclipse/paho/android/service/MqttService;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    new-instance v0, Landroid/os/Bundle;

    .line 51
    .line 52
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 53
    .line 54
    .line 55
    const-string v1, "MqttService.callbackAction"

    .line 56
    .line 57
    const-string v2, "unsubscribe"

    .line 58
    .line 59
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const-string v1, "MqttService.activityToken"

    .line 63
    .line 64
    invoke-virtual {v0, v1, p3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const-string p3, "MqttService.invocationContext"

    .line 68
    .line 69
    invoke-virtual {v0, p3, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    iget-object p3, p0, Lorg/eclipse/paho/android/service/c;->g:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 73
    .line 74
    if-eqz p3, :cond_0

    .line 75
    .line 76
    invoke-virtual {p3}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->isConnected()Z

    .line 77
    .line 78
    .line 79
    move-result p3

    .line 80
    if-eqz p3, :cond_0

    .line 81
    .line 82
    new-instance p3, Lorg/eclipse/paho/android/service/c$d;

    .line 83
    .line 84
    const/4 v1, 0x0

    .line 85
    invoke-direct {p3, p0, v0, v1}, Lorg/eclipse/paho/android/service/c$d;-><init>(Lorg/eclipse/paho/android/service/c;Landroid/os/Bundle;Lorg/eclipse/paho/android/service/c$a;)V

    .line 86
    .line 87
    .line 88
    :try_start_0
    iget-object v1, p0, Lorg/eclipse/paho/android/service/c;->g:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 89
    .line 90
    invoke-virtual {v1, p1, p2, p3}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->unsubscribe([Ljava/lang/String;Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :catch_0
    move-exception p1

    .line 95
    invoke-virtual {p0, v0, p1}, Lorg/eclipse/paho/android/service/c;->s(Landroid/os/Bundle;Ljava/lang/Exception;)V

    .line 96
    .line 97
    .line 98
    :goto_0
    return-void

    .line 99
    :cond_0
    const-string p1, "MqttService.errorMessage"

    .line 100
    .line 101
    const-string p2, "not connected"

    .line 102
    .line 103
    invoke-virtual {v0, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    iget-object p1, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 107
    .line 108
    const-string p3, "subscribe"

    .line 109
    .line 110
    invoke-virtual {p1, p3, p2}, Lorg/eclipse/paho/android/service/MqttService;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    iget-object p1, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 114
    .line 115
    iget-object p2, p0, Lorg/eclipse/paho/android/service/c;->e:Ljava/lang/String;

    .line 116
    .line 117
    sget-object p3, Lorg/eclipse/paho/android/service/Status;->d:Lorg/eclipse/paho/android/service/Status;

    .line 118
    .line 119
    invoke-virtual {p1, p2, p3, v0}, Lorg/eclipse/paho/android/service/MqttService;->f(Ljava/lang/String;Lorg/eclipse/paho/android/service/Status;Landroid/os/Bundle;)V

    .line 120
    .line 121
    .line 122
    return-void
.end method

.method public connectComplete(ZLjava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "MqttService.callbackAction"

    .line 7
    .line 8
    const-string v2, "connectExtended"

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v1, "MqttService.reconnect"

    .line 14
    .line 15
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 16
    .line 17
    .line 18
    const-string p1, "MqttService.serverURI"

    .line 19
    .line 20
    invoke-virtual {v0, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 24
    .line 25
    iget-object p2, p0, Lorg/eclipse/paho/android/service/c;->e:Ljava/lang/String;

    .line 26
    .line 27
    sget-object v1, Lorg/eclipse/paho/android/service/Status;->c:Lorg/eclipse/paho/android/service/Status;

    .line 28
    .line 29
    invoke-virtual {p1, p2, v1, v0}, Lorg/eclipse/paho/android/service/MqttService;->f(Ljava/lang/String;Lorg/eclipse/paho/android/service/Status;Landroid/os/Bundle;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public connectionLost(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "connectionLost("

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v2, ")"

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const-string v2, "MqttConnection"

    .line 30
    .line 31
    invoke-virtual {v0, v2, v1}, Lorg/eclipse/paho/android/service/MqttService;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    iput-boolean v0, p0, Lorg/eclipse/paho/android/service/c;->j:Z

    .line 36
    .line 37
    :try_start_0
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->d:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    .line 38
    .line 39
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->isAutomaticReconnect()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_0

    .line 44
    .line 45
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->g:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 46
    .line 47
    new-instance v1, Lorg/eclipse/paho/android/service/c$b;

    .line 48
    .line 49
    invoke-direct {v1, p0}, Lorg/eclipse/paho/android/service/c$b;-><init>(Lorg/eclipse/paho/android/service/c;)V

    .line 50
    .line 51
    .line 52
    const/4 v2, 0x0

    .line 53
    invoke-virtual {v0, v2, v1}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->disconnect(Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->h:Laf/a;

    .line 58
    .line 59
    const-wide/16 v1, 0x64

    .line 60
    .line 61
    invoke-virtual {v0, v1, v2}, Laf/a;->schedule(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    .line 63
    .line 64
    :catch_0
    :goto_0
    new-instance v0, Landroid/os/Bundle;

    .line 65
    .line 66
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 67
    .line 68
    .line 69
    const-string v1, "MqttService.callbackAction"

    .line 70
    .line 71
    const-string v2, "onConnectionLost"

    .line 72
    .line 73
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const-string v1, "MqttService.errorMessage"

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    instance-of v1, p1, Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 86
    .line 87
    if-eqz v1, :cond_1

    .line 88
    .line 89
    const-string v1, "MqttService.exception"

    .line 90
    .line 91
    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 92
    .line 93
    .line 94
    :cond_1
    const-string v1, "MqttService.exceptionStack"

    .line 95
    .line 96
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    iget-object p1, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 104
    .line 105
    iget-object v1, p0, Lorg/eclipse/paho/android/service/c;->e:Ljava/lang/String;

    .line 106
    .line 107
    sget-object v2, Lorg/eclipse/paho/android/service/Status;->c:Lorg/eclipse/paho/android/service/Status;

    .line 108
    .line 109
    invoke-virtual {p1, v1, v2, v0}, Lorg/eclipse/paho/android/service/MqttService;->f(Ljava/lang/String;Lorg/eclipse/paho/android/service/Status;Landroid/os/Bundle;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, Lorg/eclipse/paho/android/service/c;->z()V

    .line 113
    .line 114
    .line 115
    return-void
.end method

.method public deliveryComplete(Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "deliveryComplete("

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v2, ")"

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v2, "MqttConnection"

    .line 26
    .line 27
    invoke-virtual {v0, v2, v1}, Lorg/eclipse/paho/android/service/MqttService;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->n:Ljava/util/Map;

    .line 31
    .line 32
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    iget-object v1, p0, Lorg/eclipse/paho/android/service/c;->m:Ljava/util/Map;

    .line 41
    .line 42
    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Ljava/lang/String;

    .line 47
    .line 48
    iget-object v2, p0, Lorg/eclipse/paho/android/service/c;->o:Ljava/util/Map;

    .line 49
    .line 50
    invoke-interface {v2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Ljava/lang/String;

    .line 55
    .line 56
    iget-object v3, p0, Lorg/eclipse/paho/android/service/c;->p:Ljava/util/Map;

    .line 57
    .line 58
    invoke-interface {v3, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    check-cast p1, Ljava/lang/String;

    .line 63
    .line 64
    const/4 v3, 0x0

    .line 65
    invoke-virtual {p0, v3, v1, v0}, Lorg/eclipse/paho/android/service/c;->u(Ljava/lang/String;Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttMessage;)Landroid/os/Bundle;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    const-string v1, "MqttService.callbackAction"

    .line 70
    .line 71
    if-eqz v2, :cond_0

    .line 72
    .line 73
    const-string v3, "send"

    .line 74
    .line 75
    invoke-virtual {v0, v1, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const-string v3, "MqttService.activityToken"

    .line 79
    .line 80
    invoke-virtual {v0, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    const-string v2, "MqttService.invocationContext"

    .line 84
    .line 85
    invoke-virtual {v0, v2, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    iget-object p1, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 89
    .line 90
    iget-object v2, p0, Lorg/eclipse/paho/android/service/c;->e:Ljava/lang/String;

    .line 91
    .line 92
    sget-object v3, Lorg/eclipse/paho/android/service/Status;->c:Lorg/eclipse/paho/android/service/Status;

    .line 93
    .line 94
    invoke-virtual {p1, v2, v3, v0}, Lorg/eclipse/paho/android/service/MqttService;->f(Ljava/lang/String;Lorg/eclipse/paho/android/service/Status;Landroid/os/Bundle;)V

    .line 95
    .line 96
    .line 97
    :cond_0
    const-string p1, "messageDelivered"

    .line 98
    .line 99
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    iget-object p1, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 103
    .line 104
    iget-object v1, p0, Lorg/eclipse/paho/android/service/c;->e:Ljava/lang/String;

    .line 105
    .line 106
    sget-object v2, Lorg/eclipse/paho/android/service/Status;->c:Lorg/eclipse/paho/android/service/Status;

    .line 107
    .line 108
    invoke-virtual {p1, v1, v2, v0}, Lorg/eclipse/paho/android/service/MqttService;->f(Ljava/lang/String;Lorg/eclipse/paho/android/service/Status;Landroid/os/Bundle;)V

    .line 109
    .line 110
    .line 111
    :cond_1
    return-void
.end method

.method public final e()V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->q:Landroid/os/PowerManager$WakeLock;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 6
    .line 7
    const-string v1, "power"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/os/PowerManager;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    iget-object v2, p0, Lorg/eclipse/paho/android/service/c;->r:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lorg/eclipse/paho/android/service/c;->q:Landroid/os/PowerManager$WakeLock;

    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->q:Landroid/os/PowerManager$WakeLock;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public f()V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 2
    .line 3
    const-string v1, "MqttConnection"

    .line 4
    .line 5
    const-string v2, "close()"

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lorg/eclipse/paho/android/service/MqttService;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :try_start_0
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->g:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->close()V
    :try_end_0
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :catch_0
    move-exception v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-void

    .line 21
    :goto_0
    new-instance v1, Landroid/os/Bundle;

    .line 22
    .line 23
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v1, v0}, Lorg/eclipse/paho/android/service/c;->s(Landroid/os/Bundle;Ljava/lang/Exception;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public g(Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    .line 1
    iput-object p1, p0, Lorg/eclipse/paho/android/service/c;->d:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    .line 2
    .line 3
    iput-object p3, p0, Lorg/eclipse/paho/android/service/c;->f:Ljava/lang/String;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->isCleanSession()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iput-boolean p1, p0, Lorg/eclipse/paho/android/service/c;->k:Z

    .line 12
    .line 13
    :cond_0
    iget-object p1, p0, Lorg/eclipse/paho/android/service/c;->d:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    .line 14
    .line 15
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->isCleanSession()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    iget-object p1, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 22
    .line 23
    iget-object p1, p1, Lorg/eclipse/paho/android/service/MqttService;->e:Lorg/eclipse/paho/android/service/b;

    .line 24
    .line 25
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->e:Ljava/lang/String;

    .line 26
    .line 27
    invoke-interface {p1, v0}, Lorg/eclipse/paho/android/service/b;->c(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    iget-object p1, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 31
    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string v1, "Connecting {"

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Lorg/eclipse/paho/android/service/c;->a:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v1, "} as {"

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, Lorg/eclipse/paho/android/service/c;->b:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v1, "}"

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const-string v1, "MqttConnection"

    .line 67
    .line 68
    invoke-virtual {p1, v1, v0}, Lorg/eclipse/paho/android/service/MqttService;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    new-instance p1, Landroid/os/Bundle;

    .line 72
    .line 73
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 74
    .line 75
    .line 76
    const-string v0, "MqttService.activityToken"

    .line 77
    .line 78
    invoke-virtual {p1, v0, p3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const-string p3, "MqttService.invocationContext"

    .line 82
    .line 83
    invoke-virtual {p1, p3, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    const-string p3, "MqttService.callbackAction"

    .line 87
    .line 88
    const-string v0, "connect"

    .line 89
    .line 90
    invoke-virtual {p1, p3, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const/4 p3, 0x0

    .line 94
    :try_start_0
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->c:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 95
    .line 96
    if-nez v0, :cond_3

    .line 97
    .line 98
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    if-nez v0, :cond_2

    .line 105
    .line 106
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 107
    .line 108
    invoke-virtual {v0, v1, p3}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    if-nez v0, :cond_2

    .line 113
    .line 114
    const-string p2, "MqttService.errorMessage"

    .line 115
    .line 116
    const-string v0, "Error! No external and internal storage available"

    .line 117
    .line 118
    invoke-virtual {p1, p2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    const-string p2, "MqttService.exception"

    .line 122
    .line 123
    new-instance v0, Lorg/eclipse/paho/client/mqttv3/MqttPersistenceException;

    .line 124
    .line 125
    invoke-direct {v0}, Lorg/eclipse/paho/client/mqttv3/MqttPersistenceException;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1, p2, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 129
    .line 130
    .line 131
    iget-object p2, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 132
    .line 133
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->e:Ljava/lang/String;

    .line 134
    .line 135
    sget-object v2, Lorg/eclipse/paho/android/service/Status;->d:Lorg/eclipse/paho/android/service/Status;

    .line 136
    .line 137
    invoke-virtual {p2, v0, v2, p1}, Lorg/eclipse/paho/android/service/MqttService;->f(Ljava/lang/String;Lorg/eclipse/paho/android/service/Status;Landroid/os/Bundle;)V

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :catch_0
    move-exception p2

    .line 142
    goto/16 :goto_0

    .line 143
    .line 144
    :cond_2
    new-instance v2, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;

    .line 145
    .line 146
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-direct {v2, v0}, Lorg/eclipse/paho/client/mqttv3/persist/MqttDefaultFilePersistence;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    iput-object v2, p0, Lorg/eclipse/paho/android/service/c;->c:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 154
    .line 155
    :cond_3
    new-instance v0, Lorg/eclipse/paho/android/service/c$a;

    .line 156
    .line 157
    invoke-direct {v0, p0, p1, p1}, Lorg/eclipse/paho/android/service/c$a;-><init>(Lorg/eclipse/paho/android/service/c;Landroid/os/Bundle;Landroid/os/Bundle;)V

    .line 158
    .line 159
    .line 160
    iget-object v2, p0, Lorg/eclipse/paho/android/service/c;->g:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 161
    .line 162
    const/4 v3, 0x1

    .line 163
    const-string v4, "Do Real connect!"

    .line 164
    .line 165
    if-eqz v2, :cond_6

    .line 166
    .line 167
    :try_start_1
    iget-boolean v2, p0, Lorg/eclipse/paho/android/service/c;->l:Z

    .line 168
    .line 169
    if-eqz v2, :cond_4

    .line 170
    .line 171
    iget-object p2, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 172
    .line 173
    const-string v0, "myClient != null and the client is connecting. Connect return directly."

    .line 174
    .line 175
    invoke-virtual {p2, v1, v0}, Lorg/eclipse/paho/android/service/MqttService;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    iget-object p2, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 179
    .line 180
    new-instance v0, Ljava/lang/StringBuilder;

    .line 181
    .line 182
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 183
    .line 184
    .line 185
    const-string v2, "Connect return:isConnecting:"

    .line 186
    .line 187
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    iget-boolean v2, p0, Lorg/eclipse/paho/android/service/c;->l:Z

    .line 191
    .line 192
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    const-string v2, ".disconnected:"

    .line 196
    .line 197
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    iget-boolean v2, p0, Lorg/eclipse/paho/android/service/c;->j:Z

    .line 201
    .line 202
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {p2, v1, v0}, Lorg/eclipse/paho/android/service/MqttService;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    return-void

    .line 213
    :cond_4
    iget-boolean v2, p0, Lorg/eclipse/paho/android/service/c;->j:Z

    .line 214
    .line 215
    if-nez v2, :cond_5

    .line 216
    .line 217
    iget-object p2, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 218
    .line 219
    const-string v0, "myClient != null and the client is connected and notify!"

    .line 220
    .line 221
    invoke-virtual {p2, v1, v0}, Lorg/eclipse/paho/android/service/MqttService;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p0, p1}, Lorg/eclipse/paho/android/service/c;->m(Landroid/os/Bundle;)V

    .line 225
    .line 226
    .line 227
    return-void

    .line 228
    :cond_5
    iget-object v2, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 229
    .line 230
    const-string v5, "myClient != null and the client is not connected"

    .line 231
    .line 232
    invoke-virtual {v2, v1, v5}, Lorg/eclipse/paho/android/service/MqttService;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    iget-object v2, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 236
    .line 237
    invoke-virtual {v2, v1, v4}, Lorg/eclipse/paho/android/service/MqttService;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {p0, v3}, Lorg/eclipse/paho/android/service/c;->B(Z)V

    .line 241
    .line 242
    .line 243
    iget-object v2, p0, Lorg/eclipse/paho/android/service/c;->g:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 244
    .line 245
    iget-object v3, p0, Lorg/eclipse/paho/android/service/c;->d:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    .line 246
    .line 247
    invoke-virtual {v2, v3, p2, v0}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->connect(Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;

    .line 248
    .line 249
    .line 250
    return-void

    .line 251
    :cond_6
    new-instance v2, Laf/a;

    .line 252
    .line 253
    iget-object v5, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 254
    .line 255
    invoke-direct {v2, v5}, Laf/a;-><init>(Lorg/eclipse/paho/android/service/MqttService;)V

    .line 256
    .line 257
    .line 258
    iput-object v2, p0, Lorg/eclipse/paho/android/service/c;->h:Laf/a;

    .line 259
    .line 260
    new-instance v2, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 261
    .line 262
    iget-object v5, p0, Lorg/eclipse/paho/android/service/c;->a:Ljava/lang/String;

    .line 263
    .line 264
    iget-object v6, p0, Lorg/eclipse/paho/android/service/c;->b:Ljava/lang/String;

    .line 265
    .line 266
    iget-object v7, p0, Lorg/eclipse/paho/android/service/c;->c:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 267
    .line 268
    iget-object v8, p0, Lorg/eclipse/paho/android/service/c;->h:Laf/a;

    .line 269
    .line 270
    invoke-direct {v2, v5, v6, v7, v8}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;Lorg/eclipse/paho/client/mqttv3/MqttPingSender;)V

    .line 271
    .line 272
    .line 273
    iput-object v2, p0, Lorg/eclipse/paho/android/service/c;->g:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 274
    .line 275
    invoke-virtual {v2, p0}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->setCallback(Lorg/eclipse/paho/client/mqttv3/MqttCallback;)V

    .line 276
    .line 277
    .line 278
    iget-object v2, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 279
    .line 280
    invoke-virtual {v2, v1, v4}, Lorg/eclipse/paho/android/service/MqttService;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {p0, v3}, Lorg/eclipse/paho/android/service/c;->B(Z)V

    .line 284
    .line 285
    .line 286
    iget-object v2, p0, Lorg/eclipse/paho/android/service/c;->g:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 287
    .line 288
    iget-object v3, p0, Lorg/eclipse/paho/android/service/c;->d:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    .line 289
    .line 290
    invoke-virtual {v2, v3, p2, v0}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->connect(Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 291
    .line 292
    .line 293
    return-void

    .line 294
    :goto_0
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 295
    .line 296
    new-instance v2, Ljava/lang/StringBuilder;

    .line 297
    .line 298
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 299
    .line 300
    .line 301
    const-string v3, "Exception occurred attempting to connect: "

    .line 302
    .line 303
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v3

    .line 310
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    invoke-virtual {v0, v1, v2}, Lorg/eclipse/paho/android/service/MqttService;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {p0, p3}, Lorg/eclipse/paho/android/service/c;->B(Z)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {p0, p1, p2}, Lorg/eclipse/paho/android/service/c;->s(Landroid/os/Bundle;Ljava/lang/Exception;)V

    .line 324
    .line 325
    .line 326
    return-void
.end method

.method public h(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->g:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->deleteBufferedMessage(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final i()V
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 2
    .line 3
    iget-object v0, v0, Lorg/eclipse/paho/android/service/MqttService;->e:Lorg/eclipse/paho/android/service/b;

    .line 4
    .line 5
    iget-object v1, p0, Lorg/eclipse/paho/android/service/c;->e:Ljava/lang/String;

    .line 6
    .line 7
    invoke-interface {v0, v1}, Lorg/eclipse/paho/android/service/b;->a(Ljava/lang/String;)Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lorg/eclipse/paho/android/service/b$a;

    .line 22
    .line 23
    invoke-interface {v1}, Lorg/eclipse/paho/android/service/b$a;->getMessageId()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-interface {v1}, Lorg/eclipse/paho/android/service/b$a;->a()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-interface {v1}, Lorg/eclipse/paho/android/service/b$a;->getMessage()Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {p0, v2, v3, v1}, Lorg/eclipse/paho/android/service/c;->u(Ljava/lang/String;Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttMessage;)Landroid/os/Bundle;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const-string v2, "MqttService.callbackAction"

    .line 40
    .line 41
    const-string v3, "messageArrived"

    .line 42
    .line 43
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-object v2, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 47
    .line 48
    iget-object v3, p0, Lorg/eclipse/paho/android/service/c;->e:Ljava/lang/String;

    .line 49
    .line 50
    sget-object v4, Lorg/eclipse/paho/android/service/Status;->c:Lorg/eclipse/paho/android/service/Status;

    .line 51
    .line 52
    invoke-virtual {v2, v3, v4, v1}, Lorg/eclipse/paho/android/service/MqttService;->f(Ljava/lang/String;Lorg/eclipse/paho/android/service/Status;Landroid/os/Bundle;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    return-void
.end method

.method public j(JLjava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 2
    .line 3
    const-string v1, "MqttConnection"

    .line 4
    .line 5
    const-string v2, "disconnect()"

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lorg/eclipse/paho/android/service/MqttService;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lorg/eclipse/paho/android/service/c;->j:Z

    .line 12
    .line 13
    new-instance v0, Landroid/os/Bundle;

    .line 14
    .line 15
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v1, "MqttService.activityToken"

    .line 19
    .line 20
    invoke-virtual {v0, v1, p4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string p4, "MqttService.invocationContext"

    .line 24
    .line 25
    invoke-virtual {v0, p4, p3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string p4, "MqttService.callbackAction"

    .line 29
    .line 30
    const-string v1, "disconnect"

    .line 31
    .line 32
    invoke-virtual {v0, p4, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object p4, p0, Lorg/eclipse/paho/android/service/c;->g:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 36
    .line 37
    if-eqz p4, :cond_0

    .line 38
    .line 39
    invoke-virtual {p4}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->isConnected()Z

    .line 40
    .line 41
    .line 42
    move-result p4

    .line 43
    if-eqz p4, :cond_0

    .line 44
    .line 45
    new-instance p4, Lorg/eclipse/paho/android/service/c$d;

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-direct {p4, p0, v0, v1}, Lorg/eclipse/paho/android/service/c$d;-><init>(Lorg/eclipse/paho/android/service/c;Landroid/os/Bundle;Lorg/eclipse/paho/android/service/c$a;)V

    .line 49
    .line 50
    .line 51
    :try_start_0
    iget-object v1, p0, Lorg/eclipse/paho/android/service/c;->g:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 52
    .line 53
    invoke-virtual {v1, p1, p2, p3, p4}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->disconnect(JLjava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catch_0
    move-exception p1

    .line 58
    invoke-virtual {p0, v0, p1}, Lorg/eclipse/paho/android/service/c;->s(Landroid/os/Bundle;Ljava/lang/Exception;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    const-string p1, "MqttService.errorMessage"

    .line 63
    .line 64
    const-string p2, "not connected"

    .line 65
    .line 66
    invoke-virtual {v0, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 70
    .line 71
    invoke-virtual {p1, v1, p2}, Lorg/eclipse/paho/android/service/MqttService;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 75
    .line 76
    iget-object p2, p0, Lorg/eclipse/paho/android/service/c;->e:Ljava/lang/String;

    .line 77
    .line 78
    sget-object p3, Lorg/eclipse/paho/android/service/Status;->d:Lorg/eclipse/paho/android/service/Status;

    .line 79
    .line 80
    invoke-virtual {p1, p2, p3, v0}, Lorg/eclipse/paho/android/service/MqttService;->f(Ljava/lang/String;Lorg/eclipse/paho/android/service/Status;Landroid/os/Bundle;)V

    .line 81
    .line 82
    .line 83
    :goto_0
    iget-object p1, p0, Lorg/eclipse/paho/android/service/c;->d:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    .line 84
    .line 85
    if-eqz p1, :cond_1

    .line 86
    .line 87
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->isCleanSession()Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_1

    .line 92
    .line 93
    iget-object p1, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 94
    .line 95
    iget-object p1, p1, Lorg/eclipse/paho/android/service/MqttService;->e:Lorg/eclipse/paho/android/service/b;

    .line 96
    .line 97
    iget-object p2, p0, Lorg/eclipse/paho/android/service/c;->e:Ljava/lang/String;

    .line 98
    .line 99
    invoke-interface {p1, p2}, Lorg/eclipse/paho/android/service/b;->c(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    :cond_1
    invoke-virtual {p0}, Lorg/eclipse/paho/android/service/c;->z()V

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public k(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 2
    .line 3
    const-string v1, "MqttConnection"

    .line 4
    .line 5
    const-string v2, "disconnect()"

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lorg/eclipse/paho/android/service/MqttService;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lorg/eclipse/paho/android/service/c;->j:Z

    .line 12
    .line 13
    new-instance v0, Landroid/os/Bundle;

    .line 14
    .line 15
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v1, "MqttService.activityToken"

    .line 19
    .line 20
    invoke-virtual {v0, v1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string p2, "MqttService.invocationContext"

    .line 24
    .line 25
    invoke-virtual {v0, p2, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string p2, "MqttService.callbackAction"

    .line 29
    .line 30
    const-string v1, "disconnect"

    .line 31
    .line 32
    invoke-virtual {v0, p2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object p2, p0, Lorg/eclipse/paho/android/service/c;->g:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 36
    .line 37
    if-eqz p2, :cond_0

    .line 38
    .line 39
    invoke-virtual {p2}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->isConnected()Z

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    if-eqz p2, :cond_0

    .line 44
    .line 45
    new-instance p2, Lorg/eclipse/paho/android/service/c$d;

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-direct {p2, p0, v0, v1}, Lorg/eclipse/paho/android/service/c$d;-><init>(Lorg/eclipse/paho/android/service/c;Landroid/os/Bundle;Lorg/eclipse/paho/android/service/c$a;)V

    .line 49
    .line 50
    .line 51
    :try_start_0
    iget-object v1, p0, Lorg/eclipse/paho/android/service/c;->g:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 52
    .line 53
    invoke-virtual {v1, p1, p2}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->disconnect(Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catch_0
    move-exception p1

    .line 58
    invoke-virtual {p0, v0, p1}, Lorg/eclipse/paho/android/service/c;->s(Landroid/os/Bundle;Ljava/lang/Exception;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    const-string p1, "MqttService.errorMessage"

    .line 63
    .line 64
    const-string p2, "not connected"

    .line 65
    .line 66
    invoke-virtual {v0, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 70
    .line 71
    invoke-virtual {p1, v1, p2}, Lorg/eclipse/paho/android/service/MqttService;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 75
    .line 76
    iget-object p2, p0, Lorg/eclipse/paho/android/service/c;->e:Ljava/lang/String;

    .line 77
    .line 78
    sget-object v1, Lorg/eclipse/paho/android/service/Status;->d:Lorg/eclipse/paho/android/service/Status;

    .line 79
    .line 80
    invoke-virtual {p1, p2, v1, v0}, Lorg/eclipse/paho/android/service/MqttService;->f(Ljava/lang/String;Lorg/eclipse/paho/android/service/Status;Landroid/os/Bundle;)V

    .line 81
    .line 82
    .line 83
    :goto_0
    iget-object p1, p0, Lorg/eclipse/paho/android/service/c;->d:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    .line 84
    .line 85
    if-eqz p1, :cond_1

    .line 86
    .line 87
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->isCleanSession()Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_1

    .line 92
    .line 93
    iget-object p1, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 94
    .line 95
    iget-object p1, p1, Lorg/eclipse/paho/android/service/MqttService;->e:Lorg/eclipse/paho/android/service/b;

    .line 96
    .line 97
    iget-object p2, p0, Lorg/eclipse/paho/android/service/c;->e:Ljava/lang/String;

    .line 98
    .line 99
    invoke-interface {p1, p2}, Lorg/eclipse/paho/android/service/b;->c(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    :cond_1
    invoke-virtual {p0}, Lorg/eclipse/paho/android/service/c;->z()V

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public final l(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lorg/eclipse/paho/android/service/c;->e()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lorg/eclipse/paho/android/service/c;->j:Z

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0}, Lorg/eclipse/paho/android/service/c;->B(Z)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 12
    .line 13
    iget-object v1, p0, Lorg/eclipse/paho/android/service/c;->e:Ljava/lang/String;

    .line 14
    .line 15
    sget-object v2, Lorg/eclipse/paho/android/service/Status;->d:Lorg/eclipse/paho/android/service/Status;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2, p1}, Lorg/eclipse/paho/android/service/MqttService;->f(Ljava/lang/String;Lorg/eclipse/paho/android/service/Status;Landroid/os/Bundle;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lorg/eclipse/paho/android/service/c;->z()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final m(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lorg/eclipse/paho/android/service/c;->e()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 5
    .line 6
    iget-object v1, p0, Lorg/eclipse/paho/android/service/c;->e:Ljava/lang/String;

    .line 7
    .line 8
    sget-object v2, Lorg/eclipse/paho/android/service/Status;->c:Lorg/eclipse/paho/android/service/Status;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2, p1}, Lorg/eclipse/paho/android/service/MqttService;->f(Ljava/lang/String;Lorg/eclipse/paho/android/service/Status;Landroid/os/Bundle;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lorg/eclipse/paho/android/service/c;->i()V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    invoke-virtual {p0, p1}, Lorg/eclipse/paho/android/service/c;->B(Z)V

    .line 18
    .line 19
    .line 20
    iput-boolean p1, p0, Lorg/eclipse/paho/android/service/c;->j:Z

    .line 21
    .line 22
    invoke-virtual {p0}, Lorg/eclipse/paho/android/service/c;->z()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public messageArrived(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttMessage;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "messageArrived("

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v2, ",{"

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v2, "})"

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const-string v2, "MqttConnection"

    .line 38
    .line 39
    invoke-virtual {v0, v2, v1}, Lorg/eclipse/paho/android/service/MqttService;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 43
    .line 44
    iget-object v0, v0, Lorg/eclipse/paho/android/service/MqttService;->e:Lorg/eclipse/paho/android/service/b;

    .line 45
    .line 46
    iget-object v1, p0, Lorg/eclipse/paho/android/service/c;->e:Ljava/lang/String;

    .line 47
    .line 48
    invoke-interface {v0, v1, p1, p2}, Lorg/eclipse/paho/android/service/b;->d(Ljava/lang/String;Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttMessage;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p0, v0, p1, p2}, Lorg/eclipse/paho/android/service/c;->u(Ljava/lang/String;Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttMessage;)Landroid/os/Bundle;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const-string p2, "MqttService.callbackAction"

    .line 57
    .line 58
    const-string v1, "messageArrived"

    .line 59
    .line 60
    invoke-virtual {p1, p2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const-string p2, "MqttService.messageId"

    .line 64
    .line 65
    invoke-virtual {p1, p2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    iget-object p2, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 69
    .line 70
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->e:Ljava/lang/String;

    .line 71
    .line 72
    sget-object v1, Lorg/eclipse/paho/android/service/Status;->c:Lorg/eclipse/paho/android/service/Status;

    .line 73
    .line 74
    invoke-virtual {p2, v0, v1, p1}, Lorg/eclipse/paho/android/service/MqttService;->f(Ljava/lang/String;Lorg/eclipse/paho/android/service/Status;Landroid/os/Bundle;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public n(I)Lorg/eclipse/paho/client/mqttv3/MqttMessage;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->g:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->getBufferedMessage(I)Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public o()I
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->g:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->getBufferedMessageCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public p()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public q()[Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->g:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->getPendingDeliveryTokens()[Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public r()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s(Landroid/os/Bundle;Ljava/lang/Exception;)V
    .locals 2

    .line 1
    const-string v0, "MqttService.errorMessage"

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v0, "MqttService.exception"

    .line 11
    .line 12
    invoke-virtual {p1, v0, p2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 13
    .line 14
    .line 15
    iget-object p2, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 16
    .line 17
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->e:Ljava/lang/String;

    .line 18
    .line 19
    sget-object v1, Lorg/eclipse/paho/android/service/Status;->d:Lorg/eclipse/paho/android/service/Status;

    .line 20
    .line 21
    invoke-virtual {p2, v0, v1, p1}, Lorg/eclipse/paho/android/service/MqttService;->f(Ljava/lang/String;Lorg/eclipse/paho/android/service/Status;Landroid/os/Bundle;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public t()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->g:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->isConnected()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public final u(Ljava/lang/String;Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttMessage;)Landroid/os/Bundle;
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "MqttService.messageId"

    .line 7
    .line 8
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "MqttService.destinationName"

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance p1, Lorg/eclipse/paho/android/service/ParcelableMqttMessage;

    .line 17
    .line 18
    invoke-direct {p1, p3}, Lorg/eclipse/paho/android/service/ParcelableMqttMessage;-><init>(Lorg/eclipse/paho/client/mqttv3/MqttMessage;)V

    .line 19
    .line 20
    .line 21
    const-string p2, "MqttService.PARCEL"

    .line 22
    .line 23
    invoke-virtual {v0, p2, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method public v()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lorg/eclipse/paho/android/service/c;->j:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lorg/eclipse/paho/android/service/c;->k:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Ljava/lang/Exception;

    .line 10
    .line 11
    const-string v1, "Android offline"

    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lorg/eclipse/paho/android/service/c;->connectionLost(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public w(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttMessage;Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;
    .locals 9

    .line 1
    new-instance v7, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v0, "MqttService.callbackAction"

    .line 7
    .line 8
    const-string v4, "send"

    .line 9
    .line 10
    invoke-virtual {v7, v0, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v0, "MqttService.activityToken"

    .line 14
    .line 15
    invoke-virtual {v7, v0, p4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v0, "MqttService.invocationContext"

    .line 19
    .line 20
    invoke-virtual {v7, v0, p3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->g:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 24
    .line 25
    const/4 v8, 0x0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->isConnected()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    new-instance v0, Lorg/eclipse/paho/android/service/c$d;

    .line 35
    .line 36
    invoke-direct {v0, p0, v7, v8}, Lorg/eclipse/paho/android/service/c$d;-><init>(Lorg/eclipse/paho/android/service/c;Landroid/os/Bundle;Lorg/eclipse/paho/android/service/c$a;)V

    .line 37
    .line 38
    .line 39
    :try_start_0
    iget-object v4, p0, Lorg/eclipse/paho/android/service/c;->g:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 40
    .line 41
    invoke-virtual {v4, p1, p2, p3, v0}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->publish(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttMessage;Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;

    .line 42
    .line 43
    .line 44
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 45
    move-object v1, p0

    .line 46
    move-object v2, p1

    .line 47
    move-object v3, p2

    .line 48
    move-object v5, p3

    .line 49
    move-object v6, p4

    .line 50
    :try_start_1
    invoke-virtual/range {v1 .. v6}, Lorg/eclipse/paho/android/service/c;->C(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttMessage;Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 51
    .line 52
    .line 53
    goto :goto_3

    .line 54
    :catch_0
    move-exception v0

    .line 55
    move-object v8, v4

    .line 56
    goto :goto_0

    .line 57
    :catch_1
    move-exception v0

    .line 58
    :goto_0
    invoke-virtual {p0, v7, v0}, Lorg/eclipse/paho/android/service/c;->s(Landroid/os/Bundle;Ljava/lang/Exception;)V

    .line 59
    .line 60
    .line 61
    :goto_1
    move-object v4, v8

    .line 62
    goto :goto_3

    .line 63
    :cond_0
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->g:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 64
    .line 65
    if-eqz v0, :cond_1

    .line 66
    .line 67
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->s:Lorg/eclipse/paho/client/mqttv3/DisconnectedBufferOptions;

    .line 68
    .line 69
    if-eqz v0, :cond_1

    .line 70
    .line 71
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/DisconnectedBufferOptions;->isBufferEnabled()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_1

    .line 76
    .line 77
    new-instance v0, Lorg/eclipse/paho/android/service/c$d;

    .line 78
    .line 79
    invoke-direct {v0, p0, v7, v8}, Lorg/eclipse/paho/android/service/c$d;-><init>(Lorg/eclipse/paho/android/service/c;Landroid/os/Bundle;Lorg/eclipse/paho/android/service/c$a;)V

    .line 80
    .line 81
    .line 82
    :try_start_2
    iget-object v4, p0, Lorg/eclipse/paho/android/service/c;->g:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 83
    .line 84
    invoke-virtual {v4, p1, p2, p3, v0}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->publish(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttMessage;Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;

    .line 85
    .line 86
    .line 87
    move-result-object v4
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    .line 88
    move-object v1, p0

    .line 89
    move-object v2, p1

    .line 90
    move-object v3, p2

    .line 91
    move-object v5, p3

    .line 92
    move-object v6, p4

    .line 93
    :try_start_3
    invoke-virtual/range {v1 .. v6}, Lorg/eclipse/paho/android/service/c;->C(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttMessage;Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 94
    .line 95
    .line 96
    goto :goto_3

    .line 97
    :catch_2
    move-exception v0

    .line 98
    move-object v8, v4

    .line 99
    goto :goto_2

    .line 100
    :catch_3
    move-exception v0

    .line 101
    :goto_2
    invoke-virtual {p0, v7, v0}, Lorg/eclipse/paho/android/service/c;->s(Landroid/os/Bundle;Ljava/lang/Exception;)V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :goto_3
    return-object v4

    .line 106
    :cond_1
    const-string v0, "MqttConnection"

    .line 107
    .line 108
    const-string v2, "Client is not connected, so not sending message"

    .line 109
    .line 110
    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 111
    .line 112
    .line 113
    const-string v0, "MqttService.errorMessage"

    .line 114
    .line 115
    const-string v2, "not connected"

    .line 116
    .line 117
    invoke-virtual {v7, v0, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 121
    .line 122
    invoke-virtual {v0, v4, v2}, Lorg/eclipse/paho/android/service/MqttService;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 126
    .line 127
    iget-object v2, p0, Lorg/eclipse/paho/android/service/c;->e:Ljava/lang/String;

    .line 128
    .line 129
    sget-object v3, Lorg/eclipse/paho/android/service/Status;->d:Lorg/eclipse/paho/android/service/Status;

    .line 130
    .line 131
    invoke-virtual {v0, v2, v3, v7}, Lorg/eclipse/paho/android/service/MqttService;->f(Ljava/lang/String;Lorg/eclipse/paho/android/service/Status;Landroid/os/Bundle;)V

    .line 132
    .line 133
    .line 134
    return-object v8
.end method

.method public x(Ljava/lang/String;[BIZLjava/lang/String;Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;
    .locals 15

    .line 1
    new-instance v7, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v0, "MqttService.callbackAction"

    .line 7
    .line 8
    const-string v2, "send"

    .line 9
    .line 10
    invoke-virtual {v7, v0, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v0, "MqttService.activityToken"

    .line 14
    .line 15
    move-object/from16 v6, p6

    .line 16
    .line 17
    invoke-virtual {v7, v0, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v0, "MqttService.invocationContext"

    .line 21
    .line 22
    move-object/from16 v13, p5

    .line 23
    .line 24
    invoke-virtual {v7, v0, v13}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->g:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->isConnected()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    new-instance v14, Lorg/eclipse/paho/android/service/c$d;

    .line 39
    .line 40
    invoke-direct {v14, p0, v7, v3}, Lorg/eclipse/paho/android/service/c$d;-><init>(Lorg/eclipse/paho/android/service/c;Landroid/os/Bundle;Lorg/eclipse/paho/android/service/c$a;)V

    .line 41
    .line 42
    .line 43
    move-object v4, v3

    .line 44
    :try_start_0
    new-instance v3, Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    .line 45
    .line 46
    move-object/from16 v10, p2

    .line 47
    .line 48
    invoke-direct {v3, v10}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;-><init>([B)V

    .line 49
    .line 50
    .line 51
    move/from16 v11, p3

    .line 52
    .line 53
    invoke-virtual {v3, v11}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->setQos(I)V

    .line 54
    .line 55
    .line 56
    move/from16 v12, p4

    .line 57
    .line 58
    invoke-virtual {v3, v12}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->setRetained(Z)V

    .line 59
    .line 60
    .line 61
    iget-object v8, p0, Lorg/eclipse/paho/android/service/c;->g:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 62
    .line 63
    move-object/from16 v9, p1

    .line 64
    .line 65
    invoke-virtual/range {v8 .. v14}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->publish(Ljava/lang/String;[BIZLjava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    move-object v1, p0

    .line 70
    move-object/from16 v2, p1

    .line 71
    .line 72
    move-object/from16 v5, p5

    .line 73
    .line 74
    invoke-virtual/range {v1 .. v6}, Lorg/eclipse/paho/android/service/c;->C(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttMessage;Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :catch_0
    move-exception v0

    .line 79
    move-object v3, v4

    .line 80
    invoke-virtual {p0, v7, v0}, Lorg/eclipse/paho/android/service/c;->s(Landroid/os/Bundle;Ljava/lang/Exception;)V

    .line 81
    .line 82
    .line 83
    move-object v4, v3

    .line 84
    :goto_0
    return-object v4

    .line 85
    :cond_0
    move-object v4, v3

    .line 86
    const-string v0, "MqttService.errorMessage"

    .line 87
    .line 88
    const-string v3, "not connected"

    .line 89
    .line 90
    invoke-virtual {v7, v0, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 94
    .line 95
    invoke-virtual {v0, v2, v3}, Lorg/eclipse/paho/android/service/MqttService;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 99
    .line 100
    iget-object v2, p0, Lorg/eclipse/paho/android/service/c;->e:Ljava/lang/String;

    .line 101
    .line 102
    sget-object v3, Lorg/eclipse/paho/android/service/Status;->d:Lorg/eclipse/paho/android/service/Status;

    .line 103
    .line 104
    invoke-virtual {v0, v2, v3, v7}, Lorg/eclipse/paho/android/service/MqttService;->f(Ljava/lang/String;Lorg/eclipse/paho/android/service/Status;Landroid/os/Bundle;)V

    .line 105
    .line 106
    .line 107
    return-object v4
.end method

.method public declared-synchronized y()V
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->g:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 7
    .line 8
    const-string v1, "MqttConnection"

    .line 9
    .line 10
    const-string v2, "Reconnect myClient = null. Will not do reconnect"

    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Lorg/eclipse/paho/android/service/MqttService;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    monitor-exit p0

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    goto/16 :goto_3

    .line 19
    .line 20
    :cond_0
    :try_start_1
    iget-boolean v0, p0, Lorg/eclipse/paho/android/service/c;->l:Z

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 25
    .line 26
    const-string v1, "MqttConnection"

    .line 27
    .line 28
    const-string v2, "The client is connecting. Reconnect return directly."

    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, Lorg/eclipse/paho/android/service/MqttService;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    .line 32
    .line 33
    monitor-exit p0

    .line 34
    return-void

    .line 35
    :cond_1
    :try_start_2
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 36
    .line 37
    invoke-virtual {v0}, Lorg/eclipse/paho/android/service/MqttService;->r()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 44
    .line 45
    const-string v1, "MqttConnection"

    .line 46
    .line 47
    const-string v2, "The network is not reachable. Will not do reconnect"

    .line 48
    .line 49
    invoke-virtual {v0, v1, v2}, Lorg/eclipse/paho/android/service/MqttService;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 50
    .line 51
    .line 52
    monitor-exit p0

    .line 53
    return-void

    .line 54
    :cond_2
    :try_start_3
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->d:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    .line 55
    .line 56
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->isAutomaticReconnect()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    const/4 v1, 0x0

    .line 61
    const/4 v2, 0x0

    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    const-string v0, "MqttConnection"

    .line 65
    .line 66
    const-string v3, "Requesting Automatic reconnect using New Java AC"

    .line 67
    .line 68
    invoke-static {v0, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 69
    .line 70
    .line 71
    new-instance v0, Landroid/os/Bundle;

    .line 72
    .line 73
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 74
    .line 75
    .line 76
    const-string v3, "MqttService.activityToken"

    .line 77
    .line 78
    iget-object v4, p0, Lorg/eclipse/paho/android/service/c;->f:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v0, v3, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    const-string v3, "MqttService.invocationContext"

    .line 84
    .line 85
    invoke-virtual {v0, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    const-string v2, "MqttService.callbackAction"

    .line 89
    .line 90
    const-string v3, "connect"

    .line 91
    .line 92
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 93
    .line 94
    .line 95
    :try_start_4
    iget-object v2, p0, Lorg/eclipse/paho/android/service/c;->g:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 96
    .line 97
    invoke-virtual {v2}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->reconnect()V
    :try_end_4
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 98
    .line 99
    .line 100
    goto/16 :goto_2

    .line 101
    .line 102
    :catch_0
    move-exception v2

    .line 103
    :try_start_5
    const-string v3, "MqttConnection"

    .line 104
    .line 105
    new-instance v4, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 108
    .line 109
    .line 110
    const-string v5, "Exception occurred attempting to reconnect: "

    .line 111
    .line 112
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2}, Lorg/eclipse/paho/client/mqttv3/MqttException;->getMessage()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0, v1}, Lorg/eclipse/paho/android/service/c;->B(Z)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0, v0, v2}, Lorg/eclipse/paho/android/service/c;->s(Landroid/os/Bundle;Ljava/lang/Exception;)V

    .line 133
    .line 134
    .line 135
    goto/16 :goto_2

    .line 136
    .line 137
    :cond_3
    iget-boolean v0, p0, Lorg/eclipse/paho/android/service/c;->j:Z

    .line 138
    .line 139
    if-eqz v0, :cond_4

    .line 140
    .line 141
    iget-boolean v0, p0, Lorg/eclipse/paho/android/service/c;->k:Z

    .line 142
    .line 143
    if-nez v0, :cond_4

    .line 144
    .line 145
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 146
    .line 147
    const-string v3, "MqttConnection"

    .line 148
    .line 149
    const-string v4, "Do Real Reconnect!"

    .line 150
    .line 151
    invoke-virtual {v0, v3, v4}, Lorg/eclipse/paho/android/service/MqttService;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    new-instance v0, Landroid/os/Bundle;

    .line 155
    .line 156
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 157
    .line 158
    .line 159
    const-string v3, "MqttService.activityToken"

    .line 160
    .line 161
    iget-object v4, p0, Lorg/eclipse/paho/android/service/c;->f:Ljava/lang/String;

    .line 162
    .line 163
    invoke-virtual {v0, v3, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    const-string v3, "MqttService.invocationContext"

    .line 167
    .line 168
    invoke-virtual {v0, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    const-string v3, "MqttService.callbackAction"

    .line 172
    .line 173
    const-string v4, "connect"

    .line 174
    .line 175
    invoke-virtual {v0, v3, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 176
    .line 177
    .line 178
    :try_start_6
    new-instance v3, Lorg/eclipse/paho/android/service/c$c;

    .line 179
    .line 180
    invoke-direct {v3, p0, v0, v0}, Lorg/eclipse/paho/android/service/c$c;-><init>(Lorg/eclipse/paho/android/service/c;Landroid/os/Bundle;Landroid/os/Bundle;)V

    .line 181
    .line 182
    .line 183
    iget-object v4, p0, Lorg/eclipse/paho/android/service/c;->g:Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;

    .line 184
    .line 185
    iget-object v5, p0, Lorg/eclipse/paho/android/service/c;->d:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    .line 186
    .line 187
    invoke-virtual {v4, v5, v2, v3}, Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;->connect(Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;

    .line 188
    .line 189
    .line 190
    const/4 v2, 0x1

    .line 191
    invoke-virtual {p0, v2}, Lorg/eclipse/paho/android/service/c;->B(Z)V
    :try_end_6
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 192
    .line 193
    .line 194
    goto :goto_2

    .line 195
    :catch_1
    move-exception v2

    .line 196
    goto :goto_0

    .line 197
    :catch_2
    move-exception v2

    .line 198
    goto :goto_1

    .line 199
    :goto_0
    :try_start_7
    iget-object v3, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 200
    .line 201
    const-string v4, "MqttConnection"

    .line 202
    .line 203
    new-instance v5, Ljava/lang/StringBuilder;

    .line 204
    .line 205
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 206
    .line 207
    .line 208
    const-string v6, "Cannot reconnect to remote server."

    .line 209
    .line 210
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v6

    .line 217
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    invoke-virtual {v3, v4, v5}, Lorg/eclipse/paho/android/service/MqttService;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p0, v1}, Lorg/eclipse/paho/android/service/c;->B(Z)V

    .line 228
    .line 229
    .line 230
    new-instance v1, Lorg/eclipse/paho/client/mqttv3/MqttException;

    .line 231
    .line 232
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    const/4 v3, 0x6

    .line 237
    invoke-direct {v1, v3, v2}, Lorg/eclipse/paho/client/mqttv3/MqttException;-><init>(ILjava/lang/Throwable;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {p0, v0, v1}, Lorg/eclipse/paho/android/service/c;->s(Landroid/os/Bundle;Ljava/lang/Exception;)V

    .line 241
    .line 242
    .line 243
    goto :goto_2

    .line 244
    :goto_1
    iget-object v3, p0, Lorg/eclipse/paho/android/service/c;->i:Lorg/eclipse/paho/android/service/MqttService;

    .line 245
    .line 246
    const-string v4, "MqttConnection"

    .line 247
    .line 248
    new-instance v5, Ljava/lang/StringBuilder;

    .line 249
    .line 250
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 251
    .line 252
    .line 253
    const-string v6, "Cannot reconnect to remote server."

    .line 254
    .line 255
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2}, Lorg/eclipse/paho/client/mqttv3/MqttException;->getMessage()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v6

    .line 262
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v5

    .line 269
    invoke-virtual {v3, v4, v5}, Lorg/eclipse/paho/android/service/MqttService;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p0, v1}, Lorg/eclipse/paho/android/service/c;->B(Z)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {p0, v0, v2}, Lorg/eclipse/paho/android/service/c;->s(Landroid/os/Bundle;Ljava/lang/Exception;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 276
    .line 277
    .line 278
    :cond_4
    :goto_2
    monitor-exit p0

    .line 279
    return-void

    .line 280
    :goto_3
    :try_start_8
    monitor-exit p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 281
    throw v0
.end method

.method public final z()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->q:Landroid/os/PowerManager$WakeLock;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c;->q:Landroid/os/PowerManager$WakeLock;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
