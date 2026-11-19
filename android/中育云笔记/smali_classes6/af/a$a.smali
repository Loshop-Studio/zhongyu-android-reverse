.class public Laf/a$a;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Laf/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public a:Landroid/os/PowerManager$WakeLock;

.field public final b:Ljava/lang/String;

.field public final synthetic c:Laf/a;


# direct methods
.method public constructor <init>(Laf/a;)V
    .locals 2

    .line 1
    iput-object p1, p0, Laf/a$a;->c:Laf/a;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, "MqttService.client."

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Laf/a;->a(Laf/a;)Laf/a;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {p1}, Laf/a;->b(Laf/a;)Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->getClient()Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-interface {p1}, Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;->getClientId()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, Laf/a$a;->b:Ljava/lang/String;

    .line 40
    .line 41
    return-void
.end method

.method public static synthetic a(Laf/a$a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Laf/a$a;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(Laf/a$a;)Landroid/os/PowerManager$WakeLock;
    .locals 0

    .line 1
    iget-object p0, p0, Laf/a$a;->a:Landroid/os/PowerManager$WakeLock;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Laf/a$a;->c:Laf/a;

    .line 5
    .line 6
    invoke-static {p1}, Laf/a;->c(Laf/a;)Lorg/eclipse/paho/android/service/MqttService;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string p2, "power"

    .line 11
    .line 12
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Landroid/os/PowerManager;

    .line 17
    .line 18
    const/4 p2, 0x1

    .line 19
    iget-object v0, p0, Laf/a$a;->b:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p1, p2, v0}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Laf/a$a;->a:Landroid/os/PowerManager$WakeLock;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/os/PowerManager$WakeLock;->acquire()V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Laf/a$a;->c:Laf/a;

    .line 31
    .line 32
    invoke-static {p1}, Laf/a;->b(Laf/a;)Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    new-instance p2, Laf/a$a$a;

    .line 37
    .line 38
    invoke-direct {p2, p0}, Laf/a$a$a;-><init>(Laf/a$a;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, p2}, Lorg/eclipse/paho/client/mqttv3/internal/ClientComms;->checkForActivity(Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/MqttToken;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-nez p1, :cond_0

    .line 46
    .line 47
    iget-object p1, p0, Laf/a$a;->a:Landroid/os/PowerManager$WakeLock;

    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_0

    .line 54
    .line 55
    iget-object p1, p0, Laf/a$a;->a:Landroid/os/PowerManager$WakeLock;

    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 58
    .line 59
    .line 60
    :cond_0
    return-void
.end method
