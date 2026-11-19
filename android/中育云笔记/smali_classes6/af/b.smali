.class public Laf/b;
.super Laf/d;
.source "SourceFile"

# interfaces
.implements Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;


# instance fields
.field public j:Lorg/eclipse/paho/client/mqttv3/MqttMessage;


# direct methods
.method public constructor <init>(Lorg/eclipse/paho/android/service/MqttAndroidClient;Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;Lorg/eclipse/paho/client/mqttv3/MqttMessage;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Laf/d;-><init>(Lorg/eclipse/paho/android/service/MqttAndroidClient;Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Laf/b;->j:Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getMessage()Lorg/eclipse/paho/client/mqttv3/MqttMessage;
    .locals 1

    .line 1
    iget-object v0, p0, Laf/b;->j:Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    .line 2
    .line 3
    return-object v0
.end method
