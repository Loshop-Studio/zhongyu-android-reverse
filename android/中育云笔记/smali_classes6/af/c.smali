.class public Laf/c;
.super Landroid/os/Binder;
.source "SourceFile"


# instance fields
.field public a:Lorg/eclipse/paho/android/service/MqttService;

.field public b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lorg/eclipse/paho/android/service/MqttService;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Laf/c;->a:Lorg/eclipse/paho/android/service/MqttService;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()Lorg/eclipse/paho/android/service/MqttService;
    .locals 1

    .line 1
    iget-object v0, p0, Laf/c;->a:Lorg/eclipse/paho/android/service/MqttService;

    .line 2
    .line 3
    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Laf/c;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method
