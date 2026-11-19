.class public Lorg/eclipse/paho/android/service/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/eclipse/paho/android/service/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/eclipse/paho/android/service/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Lorg/eclipse/paho/client/mqttv3/MqttMessage;

.field public final synthetic d:Lorg/eclipse/paho/android/service/a;


# direct methods
.method public constructor <init>(Lorg/eclipse/paho/android/service/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttMessage;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/eclipse/paho/android/service/a$b;->d:Lorg/eclipse/paho/android/service/a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lorg/eclipse/paho/android/service/a$b;->a:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p4, p0, Lorg/eclipse/paho/android/service/a$b;->b:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p5, p0, Lorg/eclipse/paho/android/service/a$b;->c:Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/a$b;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMessage()Lorg/eclipse/paho/client/mqttv3/MqttMessage;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/a$b;->c:Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMessageId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/a$b;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
