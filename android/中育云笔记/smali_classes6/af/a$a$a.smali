.class public Laf/a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laf/a$a;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Laf/a$a;


# direct methods
.method public constructor <init>(Laf/a$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Laf/a$a$a;->a:Laf/a$a;

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
    .locals 0

    .line 1
    iget-object p1, p0, Laf/a$a$a;->a:Laf/a$a;

    .line 2
    .line 3
    invoke-static {p1}, Laf/a$a;->a(Laf/a$a;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Laf/a$a$a;->a:Laf/a$a;

    .line 10
    .line 11
    invoke-static {p1}, Laf/a$a;->b(Laf/a$a;)Landroid/os/PowerManager$WakeLock;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public onSuccess(Lorg/eclipse/paho/client/mqttv3/IMqttToken;)V
    .locals 0

    .line 1
    iget-object p1, p0, Laf/a$a$a;->a:Laf/a$a;

    .line 2
    .line 3
    invoke-static {p1}, Laf/a$a;->a(Laf/a$a;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Laf/a$a$a;->a:Laf/a$a;

    .line 10
    .line 11
    invoke-static {p1}, Laf/a$a;->b(Laf/a$a;)Landroid/os/PowerManager$WakeLock;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 16
    .line 17
    .line 18
    return-void
.end method
