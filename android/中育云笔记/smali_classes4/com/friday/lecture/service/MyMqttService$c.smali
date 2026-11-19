.class public final Lcom/friday/lecture/service/MyMqttService$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/lecture/service/MyMqttService;->onDestroy()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/friday/lecture/service/MyMqttService;


# direct methods
.method public constructor <init>(Lcom/friday/lecture/service/MyMqttService;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/lecture/service/MyMqttService$c;->a:Lcom/friday/lecture/service/MyMqttService;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onFailure(Lorg/eclipse/paho/client/mqttv3/IMqttToken;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/friday/lecture/service/MyMqttService$c;->a:Lcom/friday/lecture/service/MyMqttService;

    .line 2
    .line 3
    invoke-static {p1, p2}, Lcom/friday/lecture/service/MyMqttService;->d(Lcom/friday/lecture/service/MyMqttService;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance p2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v0, "MyMqttService -> onDestroy,onFailure, "

    .line 13
    .line 14
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public onSuccess(Lorg/eclipse/paho/client/mqttv3/IMqttToken;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/friday/lecture/service/MyMqttService$c;->a:Lcom/friday/lecture/service/MyMqttService;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/friday/lecture/service/MyMqttService;->g(Lcom/friday/lecture/service/MyMqttService;)Lorg/eclipse/paho/android/service/MqttAndroidClient;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->z()V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object p1, p0, Lcom/friday/lecture/service/MyMqttService$c;->a:Lcom/friday/lecture/service/MyMqttService;

    .line 13
    .line 14
    invoke-static {p1}, Lcom/friday/lecture/service/MyMqttService;->g(Lcom/friday/lecture/service/MyMqttService;)Lorg/eclipse/paho/android/service/MqttAndroidClient;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->close()V

    .line 21
    .line 22
    .line 23
    :cond_1
    iget-object p1, p0, Lcom/friday/lecture/service/MyMqttService$c;->a:Lcom/friday/lecture/service/MyMqttService;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-static {p1, v0}, Lcom/friday/lecture/service/MyMqttService;->p(Lcom/friday/lecture/service/MyMqttService;Lorg/eclipse/paho/android/service/MqttAndroidClient;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method
