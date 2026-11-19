.class public final Lcom/friday/lecture/service/MyMqttService$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/lecture/service/MyMqttService$b;->onSuccess(Lorg/eclipse/paho/client/mqttv3/IMqttToken;)V
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
    iput-object p1, p0, Lcom/friday/lecture/service/MyMqttService$b$a;->a:Lcom/friday/lecture/service/MyMqttService;

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
    const-string p1, "\u8fde\u63a5\u670d\u52a1\u5931\u8d25\uff0c\u8bf7\u91cd\u8bd5"

    .line 2
    .line 3
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/friday/lecture/service/MyMqttService$b$a;->a:Lcom/friday/lecture/service/MyMqttService;

    .line 7
    .line 8
    invoke-static {p1, p2}, Lcom/friday/lecture/service/MyMqttService;->d(Lcom/friday/lecture/service/MyMqttService;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    new-instance p2, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v0, "MyMqttService -> EndInClassTest,onFailure, "

    .line 18
    .line 19
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    const-string p1, "EndInClassTest"

    .line 37
    .line 38
    invoke-static {p1}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const/4 p2, 0x0

    .line 43
    invoke-interface {p1, p2}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public onSuccess(Lorg/eclipse/paho/client/mqttv3/IMqttToken;)V
    .locals 8

    .line 1
    iget-object p1, p0, Lcom/friday/lecture/service/MyMqttService$b$a;->a:Lcom/friday/lecture/service/MyMqttService;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/friday/lecture/service/MyMqttService;->m(Lcom/friday/lecture/service/MyMqttService;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const-string v0, "toJson(...)"

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/friday/lecture/service/MyMqttService$b$a;->a:Lcom/friday/lecture/service/MyMqttService;

    .line 12
    .line 13
    new-instance p1, Lcom/friday/common/classtest/MqttRequestEntity;

    .line 14
    .line 15
    const/16 v2, 0x2713

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    const/4 v7, 0x0

    .line 19
    invoke-direct {p1, v2, v7, v3, v7}, Lcom/friday/common/classtest/MqttRequestEntity;-><init>(ILcom/friday/common/classtest/RequestScreencastData;ILkotlin/jvm/internal/n;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Lcom/blankj/utilcode/util/GsonUtils;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-static {v2, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 v5, 0x6

    .line 30
    const/4 v6, 0x0

    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-static/range {v1 .. v6}, Lcom/friday/lecture/service/MyMqttService;->B(Lcom/friday/lecture/service/MyMqttService;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    const-string p1, "mqttConnected"

    .line 37
    .line 38
    invoke-static {p1}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-interface {p1, v7}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    move-object p1, v0

    .line 47
    iget-object v0, p0, Lcom/friday/lecture/service/MyMqttService$b$a;->a:Lcom/friday/lecture/service/MyMqttService;

    .line 48
    .line 49
    new-instance v1, Lcom/friday/common/classtest/MqttRequestEntity;

    .line 50
    .line 51
    new-instance v2, Lcom/friday/common/classtest/RequestScreencastData;

    .line 52
    .line 53
    const/4 v6, 0x7

    .line 54
    const/4 v7, 0x0

    .line 55
    const/4 v3, 0x0

    .line 56
    const/4 v4, 0x0

    .line 57
    const/4 v5, 0x0

    .line 58
    invoke-direct/range {v2 .. v7}, Lcom/friday/common/classtest/RequestScreencastData;-><init>(ZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 59
    .line 60
    .line 61
    const/16 v3, 0x2710

    .line 62
    .line 63
    invoke-direct {v1, v3, v2}, Lcom/friday/common/classtest/MqttRequestEntity;-><init>(ILcom/friday/common/classtest/RequestScreencastData;)V

    .line 64
    .line 65
    .line 66
    invoke-static {v1}, Lcom/blankj/utilcode/util/GsonUtils;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const/4 v4, 0x6

    .line 74
    const/4 v2, 0x0

    .line 75
    const/4 v3, 0x0

    .line 76
    invoke-static/range {v0 .. v5}, Lcom/friday/lecture/service/MyMqttService;->B(Lcom/friday/lecture/service/MyMqttService;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method
