.class public Lorg/eclipse/paho/android/service/MqttAndroidClient$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/eclipse/paho/android/service/MqttAndroidClient;->connect(Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lorg/eclipse/paho/android/service/MqttAndroidClient;


# direct methods
.method public constructor <init>(Lorg/eclipse/paho/android/service/MqttAndroidClient;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient$a;->c:Lorg/eclipse/paho/android/service/MqttAndroidClient;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient$a;->c:Lorg/eclipse/paho/android/service/MqttAndroidClient;

    .line 2
    .line 3
    invoke-static {v0}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->d(Lorg/eclipse/paho/android/service/MqttAndroidClient;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient$a;->c:Lorg/eclipse/paho/android/service/MqttAndroidClient;

    .line 7
    .line 8
    invoke-static {v0}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->e(Lorg/eclipse/paho/android/service/MqttAndroidClient;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient$a;->c:Lorg/eclipse/paho/android/service/MqttAndroidClient;

    .line 15
    .line 16
    invoke-static {v0, v0}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->f(Lorg/eclipse/paho/android/service/MqttAndroidClient;Landroid/content/BroadcastReceiver;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method
