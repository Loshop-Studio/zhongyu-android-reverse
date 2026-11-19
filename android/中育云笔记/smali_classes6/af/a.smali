.class public Laf/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/eclipse/paho/client/mqttv3/MqttPingSender;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Laf/a$a;
    }
.end annotation


# instance fields
.field public a:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

.field public b:Lorg/eclipse/paho/android/service/MqttService;

.field public c:Landroid/content/BroadcastReceiver;

.field public d:Laf/a;

.field public e:Landroid/app/PendingIntent;

.field public volatile f:Z


# direct methods
.method public constructor <init>(Lorg/eclipse/paho/android/service/MqttService;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Laf/a;->f:Z

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Laf/a;->b:Lorg/eclipse/paho/android/service/MqttService;

    .line 10
    .line 11
    iput-object p0, p0, Laf/a;->d:Laf/a;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 15
    .line 16
    const-string v0, "Neither service nor client can be null."

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1
.end method

.method public static synthetic a(Laf/a;)Laf/a;
    .locals 0

    .line 1
    iget-object p0, p0, Laf/a;->d:Laf/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(Laf/a;)Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;
    .locals 0

    .line 1
    iget-object p0, p0, Laf/a;->a:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic c(Laf/a;)Lorg/eclipse/paho/android/service/MqttService;
    .locals 0

    .line 1
    iget-object p0, p0, Laf/a;->b:Lorg/eclipse/paho/android/service/MqttService;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public init(Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;)V
    .locals 0

    .line 1
    iput-object p1, p0, Laf/a;->a:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    .line 2
    .line 3
    new-instance p1, Laf/a$a;

    .line 4
    .line 5
    invoke-direct {p1, p0}, Laf/a$a;-><init>(Laf/a;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Laf/a;->c:Landroid/content/BroadcastReceiver;

    .line 9
    .line 10
    return-void
.end method

.method public schedule(J)V
    .locals 3

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    add-long/2addr v0, p1

    .line 6
    iget-object p1, p0, Laf/a;->b:Lorg/eclipse/paho/android/service/MqttService;

    .line 7
    .line 8
    const-string p2, "alarm"

    .line 9
    .line 10
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Landroid/app/AlarmManager;

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    iget-object v2, p0, Laf/a;->e:Landroid/app/PendingIntent;

    .line 18
    .line 19
    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/app/AlarmManager;->setExactAndAllowWhileIdle(IJLandroid/app/PendingIntent;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public start()V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "MqttService.pingSender."

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Laf/a;->a:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    .line 12
    .line 13
    invoke-virtual {v1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->getClient()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1}, Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;->getClientId()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v1, p0, Laf/a;->b:Lorg/eclipse/paho/android/service/MqttService;

    .line 29
    .line 30
    iget-object v2, p0, Laf/a;->c:Landroid/content/BroadcastReceiver;

    .line 31
    .line 32
    new-instance v3, Landroid/content/IntentFilter;

    .line 33
    .line 34
    invoke-direct {v3, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Laf/a;->b:Lorg/eclipse/paho/android/service/MqttService;

    .line 41
    .line 42
    new-instance v2, Landroid/content/Intent;

    .line 43
    .line 44
    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/high16 v0, 0x8000000

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    invoke-static {v1, v3, v2, v0}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, Laf/a;->e:Landroid/app/PendingIntent;

    .line 55
    .line 56
    iget-object v0, p0, Laf/a;->a:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    .line 57
    .line 58
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->getKeepAlive()J

    .line 59
    .line 60
    .line 61
    move-result-wide v0

    .line 62
    invoke-virtual {p0, v0, v1}, Laf/a;->schedule(J)V

    .line 63
    .line 64
    .line 65
    const/4 v0, 0x1

    .line 66
    iput-boolean v0, p0, Laf/a;->f:Z

    .line 67
    .line 68
    return-void
.end method

.method public stop()V
    .locals 2

    .line 1
    iget-object v0, p0, Laf/a;->a:Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->getClient()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;->getClientId()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    iget-boolean v0, p0, Laf/a;->f:Z

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Laf/a;->e:Landroid/app/PendingIntent;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Laf/a;->b:Lorg/eclipse/paho/android/service/MqttService;

    .line 19
    .line 20
    const-string v1, "alarm"

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Landroid/app/AlarmManager;

    .line 27
    .line 28
    iget-object v1, p0, Laf/a;->e:Landroid/app/PendingIntent;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    const/4 v0, 0x0

    .line 34
    iput-boolean v0, p0, Laf/a;->f:Z

    .line 35
    .line 36
    :try_start_0
    iget-object v0, p0, Laf/a;->b:Lorg/eclipse/paho/android/service/MqttService;

    .line 37
    .line 38
    iget-object v1, p0, Laf/a;->c:Landroid/content/BroadcastReceiver;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    :catch_0
    :cond_1
    return-void
.end method
