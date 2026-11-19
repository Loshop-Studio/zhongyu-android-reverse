.class public Lorg/eclipse/paho/android/service/c$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/eclipse/paho/android/service/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public final a:Landroid/os/Bundle;

.field public final synthetic b:Lorg/eclipse/paho/android/service/c;


# direct methods
.method public constructor <init>(Lorg/eclipse/paho/android/service/c;Landroid/os/Bundle;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lorg/eclipse/paho/android/service/c$d;->b:Lorg/eclipse/paho/android/service/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Lorg/eclipse/paho/android/service/c$d;->a:Landroid/os/Bundle;

    return-void
.end method

.method public synthetic constructor <init>(Lorg/eclipse/paho/android/service/c;Landroid/os/Bundle;Lorg/eclipse/paho/android/service/c$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lorg/eclipse/paho/android/service/c$d;-><init>(Lorg/eclipse/paho/android/service/c;Landroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method public onFailure(Lorg/eclipse/paho/client/mqttv3/IMqttToken;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lorg/eclipse/paho/android/service/c$d;->a:Landroid/os/Bundle;

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
    iget-object p1, p0, Lorg/eclipse/paho/android/service/c$d;->a:Landroid/os/Bundle;

    .line 13
    .line 14
    const-string v0, "MqttService.exception"

    .line 15
    .line 16
    invoke-virtual {p1, v0, p2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lorg/eclipse/paho/android/service/c$d;->b:Lorg/eclipse/paho/android/service/c;

    .line 20
    .line 21
    invoke-static {p1}, Lorg/eclipse/paho/android/service/c;->b(Lorg/eclipse/paho/android/service/c;)Lorg/eclipse/paho/android/service/MqttService;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object p2, p0, Lorg/eclipse/paho/android/service/c$d;->b:Lorg/eclipse/paho/android/service/c;

    .line 26
    .line 27
    invoke-static {p2}, Lorg/eclipse/paho/android/service/c;->d(Lorg/eclipse/paho/android/service/c;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    sget-object v0, Lorg/eclipse/paho/android/service/Status;->d:Lorg/eclipse/paho/android/service/Status;

    .line 32
    .line 33
    iget-object v1, p0, Lorg/eclipse/paho/android/service/c$d;->a:Landroid/os/Bundle;

    .line 34
    .line 35
    invoke-virtual {p1, p2, v0, v1}, Lorg/eclipse/paho/android/service/MqttService;->f(Ljava/lang/String;Lorg/eclipse/paho/android/service/Status;Landroid/os/Bundle;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public onSuccess(Lorg/eclipse/paho/client/mqttv3/IMqttToken;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lorg/eclipse/paho/android/service/c$d;->b:Lorg/eclipse/paho/android/service/c;

    .line 2
    .line 3
    invoke-static {p1}, Lorg/eclipse/paho/android/service/c;->b(Lorg/eclipse/paho/android/service/c;)Lorg/eclipse/paho/android/service/MqttService;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lorg/eclipse/paho/android/service/c$d;->b:Lorg/eclipse/paho/android/service/c;

    .line 8
    .line 9
    invoke-static {v0}, Lorg/eclipse/paho/android/service/c;->d(Lorg/eclipse/paho/android/service/c;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Lorg/eclipse/paho/android/service/Status;->c:Lorg/eclipse/paho/android/service/Status;

    .line 14
    .line 15
    iget-object v2, p0, Lorg/eclipse/paho/android/service/c$d;->a:Landroid/os/Bundle;

    .line 16
    .line 17
    invoke-virtual {p1, v0, v1, v2}, Lorg/eclipse/paho/android/service/MqttService;->f(Ljava/lang/String;Lorg/eclipse/paho/android/service/Status;Landroid/os/Bundle;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
