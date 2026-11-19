.class public Lorg/eclipse/paho/android/service/c$a;
.super Lorg/eclipse/paho/android/service/c$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/eclipse/paho/android/service/c;->g(Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Landroid/os/Bundle;

.field public final synthetic d:Lorg/eclipse/paho/android/service/c;


# direct methods
.method public constructor <init>(Lorg/eclipse/paho/android/service/c;Landroid/os/Bundle;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/eclipse/paho/android/service/c$a;->d:Lorg/eclipse/paho/android/service/c;

    .line 2
    .line 3
    iput-object p3, p0, Lorg/eclipse/paho/android/service/c$a;->c:Landroid/os/Bundle;

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    invoke-direct {p0, p1, p2, p3}, Lorg/eclipse/paho/android/service/c$d;-><init>(Lorg/eclipse/paho/android/service/c;Landroid/os/Bundle;Lorg/eclipse/paho/android/service/c$a;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public onFailure(Lorg/eclipse/paho/client/mqttv3/IMqttToken;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lorg/eclipse/paho/android/service/c$a;->c:Landroid/os/Bundle;

    .line 2
    .line 3
    const-string v0, "MqttService.errorMessage"

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lorg/eclipse/paho/android/service/c$a;->c:Landroid/os/Bundle;

    .line 13
    .line 14
    const-string v0, "MqttService.exception"

    .line 15
    .line 16
    invoke-virtual {p1, v0, p2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lorg/eclipse/paho/android/service/c$a;->d:Lorg/eclipse/paho/android/service/c;

    .line 20
    .line 21
    invoke-static {p1}, Lorg/eclipse/paho/android/service/c;->b(Lorg/eclipse/paho/android/service/c;)Lorg/eclipse/paho/android/service/MqttService;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v1, "connect fail, call connect to reconnect.reason:"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    const-string v0, "MqttConnection"

    .line 47
    .line 48
    invoke-virtual {p1, v0, p2}, Lorg/eclipse/paho/android/service/MqttService;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lorg/eclipse/paho/android/service/c$a;->d:Lorg/eclipse/paho/android/service/c;

    .line 52
    .line 53
    iget-object p2, p0, Lorg/eclipse/paho/android/service/c$a;->c:Landroid/os/Bundle;

    .line 54
    .line 55
    invoke-static {p1, p2}, Lorg/eclipse/paho/android/service/c;->c(Lorg/eclipse/paho/android/service/c;Landroid/os/Bundle;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public onSuccess(Lorg/eclipse/paho/client/mqttv3/IMqttToken;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lorg/eclipse/paho/android/service/c$a;->d:Lorg/eclipse/paho/android/service/c;

    .line 2
    .line 3
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c$a;->c:Landroid/os/Bundle;

    .line 4
    .line 5
    invoke-static {p1, v0}, Lorg/eclipse/paho/android/service/c;->a(Lorg/eclipse/paho/android/service/c;Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lorg/eclipse/paho/android/service/c$a;->d:Lorg/eclipse/paho/android/service/c;

    .line 9
    .line 10
    invoke-static {p1}, Lorg/eclipse/paho/android/service/c;->b(Lorg/eclipse/paho/android/service/c;)Lorg/eclipse/paho/android/service/MqttService;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-string v0, "MqttConnection"

    .line 15
    .line 16
    const-string v1, "connect success!"

    .line 17
    .line 18
    invoke-virtual {p1, v0, v1}, Lorg/eclipse/paho/android/service/MqttService;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
