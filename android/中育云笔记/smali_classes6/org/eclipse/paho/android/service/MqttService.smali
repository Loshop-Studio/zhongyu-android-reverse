.class public Lorg/eclipse/paho/android/service/MqttService;
.super Landroid/app/Service;
.source "SourceFile"

# interfaces
.implements Laf/e;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "Registered"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/eclipse/paho/android/service/MqttService$b;
    }
.end annotation


# instance fields
.field public c:Ljava/lang/String;

.field public d:Z

.field public e:Lorg/eclipse/paho/android/service/b;

.field public f:Lorg/eclipse/paho/android/service/MqttService$b;

.field public volatile g:Z

.field public h:Laf/c;

.field public i:Ljava/util/Map;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lorg/eclipse/paho/android/service/MqttService;->d:Z

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lorg/eclipse/paho/android/service/MqttService;->g:Z

    .line 9
    .line 10
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lorg/eclipse/paho/android/service/MqttService;->i:Ljava/util/Map;

    .line 16
    .line 17
    return-void
.end method

.method public static synthetic d(Lorg/eclipse/paho/android/service/MqttService;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/eclipse/paho/android/service/MqttService;->s()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public A(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lorg/eclipse/paho/android/service/MqttService;->o(Ljava/lang/String;)Lorg/eclipse/paho/android/service/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1, p2, p3, p4, p5}, Lorg/eclipse/paho/android/service/c;->D(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public B(Ljava/lang/String;[Ljava/lang/String;[ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lorg/eclipse/paho/android/service/MqttService;->o(Ljava/lang/String;)Lorg/eclipse/paho/android/service/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1, p2, p3, p4, p5}, Lorg/eclipse/paho/android/service/c;->E([Ljava/lang/String;[ILjava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public C(Ljava/lang/String;[Ljava/lang/String;[ILjava/lang/String;Ljava/lang/String;[Lorg/eclipse/paho/client/mqttv3/IMqttMessageListener;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lorg/eclipse/paho/android/service/MqttService;->o(Ljava/lang/String;)Lorg/eclipse/paho/android/service/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual/range {p1 .. p6}, Lorg/eclipse/paho/android/service/c;->F([Ljava/lang/String;[ILjava/lang/String;Ljava/lang/String;[Lorg/eclipse/paho/client/mqttv3/IMqttMessageListener;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final D(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttService;->c:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lorg/eclipse/paho/android/service/MqttService;->d:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Landroid/os/Bundle;

    .line 10
    .line 11
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v1, "MqttService.callbackAction"

    .line 15
    .line 16
    const-string v2, "trace"

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v1, "MqttService.traceSeverity"

    .line 22
    .line 23
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string p1, "MqttService.traceTag"

    .line 27
    .line 28
    invoke-virtual {v0, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string p1, "MqttService.errorMessage"

    .line 32
    .line 33
    invoke-virtual {v0, p1, p3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lorg/eclipse/paho/android/service/MqttService;->c:Ljava/lang/String;

    .line 37
    .line 38
    sget-object p2, Lorg/eclipse/paho/android/service/Status;->d:Lorg/eclipse/paho/android/service/Status;

    .line 39
    .line 40
    invoke-virtual {p0, p1, p2, v0}, Lorg/eclipse/paho/android/service/MqttService;->f(Ljava/lang/String;Lorg/eclipse/paho/android/service/Status;Landroid/os/Bundle;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    return-void
.end method

.method public final E()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttService;->f:Lorg/eclipse/paho/android/service/MqttService$b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lorg/eclipse/paho/android/service/MqttService;->f:Lorg/eclipse/paho/android/service/MqttService$b;

    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lorg/eclipse/paho/android/service/MqttService;->o(Ljava/lang/String;)Lorg/eclipse/paho/android/service/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1, p2, p3, p4}, Lorg/eclipse/paho/android/service/c;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public G(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lorg/eclipse/paho/android/service/MqttService;->o(Ljava/lang/String;)Lorg/eclipse/paho/android/service/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1, p2, p3, p4}, Lorg/eclipse/paho/android/service/c;->H([Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "error"

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1, p2}, Lorg/eclipse/paho/android/service/MqttService;->D(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "debug"

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1, p2}, Lorg/eclipse/paho/android/service/MqttService;->D(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttService;->c:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v1, "MqttService.callbackAction"

    .line 11
    .line 12
    const-string v2, "trace"

    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v1, "MqttService.traceSeverity"

    .line 18
    .line 19
    const-string v2, "exception"

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v1, "MqttService.errorMessage"

    .line 25
    .line 26
    invoke-virtual {v0, v1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string p2, "MqttService.exception"

    .line 30
    .line 31
    invoke-virtual {v0, p2, p3}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 32
    .line 33
    .line 34
    const-string p2, "MqttService.traceTag"

    .line 35
    .line 36
    invoke-virtual {v0, p2, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lorg/eclipse/paho/android/service/MqttService;->c:Ljava/lang/String;

    .line 40
    .line 41
    sget-object p2, Lorg/eclipse/paho/android/service/Status;->d:Lorg/eclipse/paho/android/service/Status;

    .line 42
    .line 43
    invoke-virtual {p0, p1, p2, v0}, Lorg/eclipse/paho/android/service/MqttService;->f(Ljava/lang/String;Lorg/eclipse/paho/android/service/Status;Landroid/os/Bundle;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/paho/android/service/Status;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttService;->e:Lorg/eclipse/paho/android/service/b;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lorg/eclipse/paho/android/service/b;->b(Ljava/lang/String;Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    sget-object p1, Lorg/eclipse/paho/android/service/Status;->c:Lorg/eclipse/paho/android/service/Status;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    sget-object p1, Lorg/eclipse/paho/android/service/Status;->d:Lorg/eclipse/paho/android/service/Status;

    .line 13
    .line 14
    return-object p1
.end method

.method public f(Ljava/lang/String;Lorg/eclipse/paho/android/service/Status;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-string v1, "MqttService.callbackToActivity.v0"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const-string v1, "MqttService.clientHandle"

    .line 11
    .line 12
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 13
    .line 14
    .line 15
    :cond_0
    const-string p1, "MqttService.callbackStatus"

    .line 16
    .line 17
    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 18
    .line 19
    .line 20
    if-eqz p3, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0, p3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 23
    .line 24
    .line 25
    :cond_1
    invoke-static {p0}, Landroidx/localbroadcastmanager/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroidx/localbroadcastmanager/content/LocalBroadcastManager;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1, v0}, Landroidx/localbroadcastmanager/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public g(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lorg/eclipse/paho/android/service/MqttService;->o(Ljava/lang/String;)Lorg/eclipse/paho/android/service/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lorg/eclipse/paho/android/service/c;->f()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public h(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lorg/eclipse/paho/android/service/MqttService;->o(Ljava/lang/String;)Lorg/eclipse/paho/android/service/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 p3, 0x0

    .line 6
    invoke-virtual {p1, p2, p3, p4}, Lorg/eclipse/paho/android/service/c;->g(Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public i(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lorg/eclipse/paho/android/service/MqttService;->o(Ljava/lang/String;)Lorg/eclipse/paho/android/service/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1, p2}, Lorg/eclipse/paho/android/service/c;->h(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public j(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lorg/eclipse/paho/android/service/MqttService;->o(Ljava/lang/String;)Lorg/eclipse/paho/android/service/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p2, p3, p4, p5}, Lorg/eclipse/paho/android/service/c;->j(JLjava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p2, p0, Lorg/eclipse/paho/android/service/MqttService;->i:Ljava/util/Map;

    .line 9
    .line 10
    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lorg/eclipse/paho/android/service/MqttService;->o(Ljava/lang/String;)Lorg/eclipse/paho/android/service/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p2, p3}, Lorg/eclipse/paho/android/service/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p2, p0, Lorg/eclipse/paho/android/service/MqttService;->i:Ljava/util/Map;

    .line 9
    .line 10
    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public l(Ljava/lang/String;I)Lorg/eclipse/paho/client/mqttv3/MqttMessage;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lorg/eclipse/paho/android/service/MqttService;->o(Ljava/lang/String;)Lorg/eclipse/paho/android/service/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1, p2}, Lorg/eclipse/paho/android/service/c;->n(I)Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public m(Ljava/lang/String;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lorg/eclipse/paho/android/service/MqttService;->o(Ljava/lang/String;)Lorg/eclipse/paho/android/service/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lorg/eclipse/paho/android/service/c;->o()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;)Ljava/lang/String;
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string v1, ":"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    iget-object p3, p0, Lorg/eclipse/paho/android/service/MqttService;->i:Ljava/util/Map;

    .line 28
    .line 29
    invoke-interface {p3, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p3

    .line 33
    if-nez p3, :cond_0

    .line 34
    .line 35
    new-instance v2, Lorg/eclipse/paho/android/service/c;

    .line 36
    .line 37
    move-object v3, p0

    .line 38
    move-object v4, p1

    .line 39
    move-object v5, p2

    .line 40
    move-object v6, p4

    .line 41
    invoke-direct/range {v2 .. v7}, Lorg/eclipse/paho/android/service/c;-><init>(Lorg/eclipse/paho/android/service/MqttService;Ljava/lang/String;Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, v3, Lorg/eclipse/paho/android/service/MqttService;->i:Ljava/util/Map;

    .line 45
    .line 46
    invoke-interface {p1, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    return-object v7

    .line 50
    :cond_0
    move-object v3, p0

    .line 51
    return-object v7
.end method

.method public final o(Ljava/lang/String;)Lorg/eclipse/paho/android/service/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttService;->i:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lorg/eclipse/paho/android/service/c;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    const-string v0, "Invalid ClientHandle"

    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .line 1
    const-string v0, "MqttService.activityToken"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttService;->h:Laf/c;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Laf/c;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lorg/eclipse/paho/android/service/MqttService;->h:Laf/c;

    .line 13
    .line 14
    return-object p1
.end method

.method public onCreate()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Laf/c;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Laf/c;-><init>(Lorg/eclipse/paho/android/service/MqttService;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lorg/eclipse/paho/android/service/MqttService;->h:Laf/c;

    .line 10
    .line 11
    new-instance v0, Lorg/eclipse/paho/android/service/a;

    .line 12
    .line 13
    invoke-direct {v0, p0, p0}, Lorg/eclipse/paho/android/service/a;-><init>(Lorg/eclipse/paho/android/service/MqttService;Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lorg/eclipse/paho/android/service/MqttService;->e:Lorg/eclipse/paho/android/service/b;

    .line 17
    .line 18
    return-void
.end method

.method public onDestroy()V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttService;->i:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

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
    const/4 v2, 0x0

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lorg/eclipse/paho/android/service/c;

    .line 23
    .line 24
    invoke-virtual {v1, v2, v2}, Lorg/eclipse/paho/android/service/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttService;->h:Laf/c;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iput-object v2, p0, Lorg/eclipse/paho/android/service/MqttService;->h:Laf/c;

    .line 33
    .line 34
    :cond_1
    invoke-virtual {p0}, Lorg/eclipse/paho/android/service/MqttService;->E()V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttService;->e:Lorg/eclipse/paho/android/service/b;

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-interface {v0}, Lorg/eclipse/paho/android/service/b;->close()V

    .line 42
    .line 43
    .line 44
    :cond_2
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/eclipse/paho/android/service/MqttService;->w()V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    return p1
.end method

.method public p(Ljava/lang/String;)[Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lorg/eclipse/paho/android/service/MqttService;->o(Ljava/lang/String;)Lorg/eclipse/paho/android/service/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lorg/eclipse/paho/android/service/c;->q()[Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public q(Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lorg/eclipse/paho/android/service/MqttService;->o(Ljava/lang/String;)Lorg/eclipse/paho/android/service/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lorg/eclipse/paho/android/service/c;->t()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public r()Z
    .locals 2

    .line 1
    const-string v0, "connectivity"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isAvailable()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-boolean v0, p0, Lorg/eclipse/paho/android/service/MqttService;->g:Z

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    return v0

    .line 33
    :cond_0
    const/4 v0, 0x0

    .line 34
    return v0
.end method

.method public final s()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttService;->i:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

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
    check-cast v1, Lorg/eclipse/paho/android/service/c;

    .line 22
    .line 23
    invoke-virtual {v1}, Lorg/eclipse/paho/android/service/c;->v()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method public t(Ljava/lang/String;Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttMessage;Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lorg/eclipse/paho/android/service/MqttService;->o(Ljava/lang/String;)Lorg/eclipse/paho/android/service/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1, p2, p3, p4, p5}, Lorg/eclipse/paho/android/service/c;->w(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttMessage;Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public u(Ljava/lang/String;Ljava/lang/String;[BIZLjava/lang/String;Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lorg/eclipse/paho/android/service/MqttService;->o(Ljava/lang/String;)Lorg/eclipse/paho/android/service/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual/range {p1 .. p7}, Lorg/eclipse/paho/android/service/c;->x(Ljava/lang/String;[BIZLjava/lang/String;Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public v()V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Reconnect to server, client size="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lorg/eclipse/paho/android/service/MqttService;->i:Ljava/util/Map;

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "MqttService"

    .line 25
    .line 26
    invoke-virtual {p0, v1, v0}, Lorg/eclipse/paho/android/service/MqttService;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttService;->i:Ljava/util/Map;

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Lorg/eclipse/paho/android/service/c;

    .line 50
    .line 51
    new-instance v2, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Lorg/eclipse/paho/android/service/c;->p()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const/16 v3, 0x2f

    .line 64
    .line 65
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Lorg/eclipse/paho/android/service/c;->r()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    const-string v3, "Reconnect Client:"

    .line 80
    .line 81
    invoke-virtual {p0, v3, v2}, Lorg/eclipse/paho/android/service/MqttService;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Lorg/eclipse/paho/android/service/MqttService;->r()Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz v2, :cond_0

    .line 89
    .line 90
    invoke-virtual {v1}, Lorg/eclipse/paho/android/service/c;->y()V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_1
    return-void
.end method

.method public final w()V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttService;->f:Lorg/eclipse/paho/android/service/MqttService$b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lorg/eclipse/paho/android/service/MqttService$b;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, Lorg/eclipse/paho/android/service/MqttService$b;-><init>(Lorg/eclipse/paho/android/service/MqttService;Lorg/eclipse/paho/android/service/MqttService$a;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lorg/eclipse/paho/android/service/MqttService;->f:Lorg/eclipse/paho/android/service/MqttService$b;

    .line 12
    .line 13
    new-instance v1, Landroid/content/IntentFilter;

    .line 14
    .line 15
    const-string v2, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 16
    .line 17
    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public x(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/DisconnectedBufferOptions;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lorg/eclipse/paho/android/service/MqttService;->o(Ljava/lang/String;)Lorg/eclipse/paho/android/service/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1, p2}, Lorg/eclipse/paho/android/service/c;->A(Lorg/eclipse/paho/client/mqttv3/DisconnectedBufferOptions;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public y(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/eclipse/paho/android/service/MqttService;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public z(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/eclipse/paho/android/service/MqttService;->d:Z

    .line 2
    .line 3
    return-void
.end method
