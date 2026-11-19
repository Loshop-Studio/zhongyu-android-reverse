.class public final Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/eclipse/paho/client/mqttv3/MqttCallbackExtended;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/lecture/service/MyMqttService;-><init>()V
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
    iput-object p1, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public connectComplete(ZLjava/lang/String;)V
    .locals 13

    .line 1
    iget-object p2, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    const/4 v0, 0x0

    invoke-static {p2, v0}, Lcom/friday/lecture/service/MyMqttService;->o(Lcom/friday/lecture/service/MyMqttService;Z)V

    .line 2
    iget-object p2, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    invoke-static {p2}, Lcom/friday/lecture/service/MyMqttService;->j(Lcom/friday/lecture/service/MyMqttService;)Lkotlinx/coroutines/g;

    move-result-object p2

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    const/4 v2, 0x1

    invoke-static {p2, v1, v2, v1}, Lkotlinx/coroutines/g$a;->a(Lkotlinx/coroutines/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 3
    :cond_0
    iget-object p2, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    invoke-static {p2, v1}, Lcom/friday/lecture/service/MyMqttService;->s(Lcom/friday/lecture/service/MyMqttService;Lkotlinx/coroutines/g;)V

    if-eqz p1, :cond_5

    .line 4
    iget-object p1, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    invoke-static {p1}, Lcom/friday/lecture/service/MyMqttService;->i(Lcom/friday/lecture/service/MyMqttService;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_5

    .line 5
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    invoke-static {}, Lcom/friday/common/entity/MqttType;->values()[Lcom/friday/common/entity/MqttType;

    move-result-object p2

    iget-object v2, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    .line 7
    new-instance v3, Ljava/util/ArrayList;

    array-length v4, p2

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    array-length v4, p2

    move v5, v0

    :goto_0
    const-string v6, "/"

    if-ge v5, v4, :cond_1

    aget-object v7, p2, v5

    .line 9
    invoke-static {v2}, Lcom/friday/lecture/service/MyMqttService;->i(Lcom/friday/lecture/service/MyMqttService;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "/all"

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 10
    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 11
    :cond_1
    invoke-static {}, Lcom/friday/common/entity/MqttType;->values()[Lcom/friday/common/entity/MqttType;

    move-result-object p2

    iget-object v2, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    .line 12
    new-instance v4, Ljava/util/ArrayList;

    array-length v5, p2

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    array-length v5, p2

    move v7, v0

    :goto_1
    if-ge v7, v5, :cond_2

    aget-object v8, p2, v7

    .line 14
    invoke-static {v2}, Lcom/friday/lecture/service/MyMqttService;->i(Lcom/friday/lecture/service/MyMqttService;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    .line 15
    sget-object v10, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    invoke-virtual {v10}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    move-result-object v10

    invoke-virtual {v10}, Lcom/friday/common/helper/b;->t()J

    move-result-wide v10

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 16
    invoke-interface {v4, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 17
    :cond_2
    iget-object p2, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    invoke-static {p2}, Lcom/friday/lecture/service/MyMqttService;->f(Lcom/friday/lecture/service/MyMqttService;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    iget-object p2, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    invoke-static {p2}, Lcom/friday/lecture/service/MyMqttService;->f(Lcom/friday/lecture/service/MyMqttService;)Ljava/lang/String;

    move-result-object p2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "/REQUEST_SCREEN_CAPTURE"

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 20
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 21
    iget-object p2, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    invoke-static {p2}, Lcom/friday/lecture/service/MyMqttService;->g(Lcom/friday/lecture/service/MyMqttService;)Lorg/eclipse/paho/android/service/MqttAndroidClient;

    move-result-object p2

    const/4 v2, 0x2

    if-eqz p2, :cond_4

    .line 22
    new-array v3, v0, [Ljava/lang/String;

    invoke-interface {p1, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/lang/String;

    .line 23
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {p1, v5}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v5

    :goto_2
    if-ge v0, v5, :cond_3

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v0, v0, 0x1

    .line 25
    check-cast v6, Ljava/lang/String;

    .line 26
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    .line 27
    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 28
    :cond_3
    invoke-static {v4}, Lrc/g0;->W0(Ljava/util/Collection;)[I

    move-result-object p1

    .line 29
    invoke-virtual {p2, v3, p1}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->subscribe([Ljava/lang/String;[I)Lorg/eclipse/paho/client/mqttv3/IMqttToken;

    .line 30
    :cond_4
    const-class p1, Lcom/friday/common/entity/MqttEntity;

    invoke-static {p1}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    move-result-object p1

    .line 31
    new-instance v3, Lcom/friday/common/entity/MqttEntity;

    .line 32
    sget-object v4, Lcom/friday/common/entity/MqttType;->NONE:Lcom/friday/common/entity/MqttType;

    .line 33
    new-instance p2, Lcom/friday/common/classtest/MqttRequestEntity;

    const/16 v0, 0x2716

    invoke-direct {p2, v0, v1, v2, v1}, Lcom/friday/common/classtest/MqttRequestEntity;-><init>(ILcom/friday/common/classtest/RequestScreencastData;ILkotlin/jvm/internal/n;)V

    invoke-static {p2}, Lcom/blankj/utilcode/util/GsonUtils;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const-string p2, "toJson(...)"

    invoke-static {v5, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    .line 34
    invoke-direct/range {v3 .. v8}, Lcom/friday/common/entity/MqttEntity;-><init>(Lcom/friday/common/entity/MqttType;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 35
    invoke-interface {p1, v3}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    :cond_5
    return-void
.end method

.method public connectionLost(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lcom/friday/lecture/service/MyMqttService;->q(Lcom/friday/lecture/service/MyMqttService;Z)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    .line 8
    .line 9
    invoke-static {v0, v1}, Lcom/friday/lecture/service/MyMqttService;->o(Lcom/friday/lecture/service/MyMqttService;Z)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    .line 13
    .line 14
    invoke-static {v0, p1}, Lcom/friday/lecture/service/MyMqttService;->d(Lcom/friday/lecture/service/MyMqttService;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v2, "MyMqttService -> connectionLost,\u8fde\u63a5\u65ad\u5f00, "

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    instance-of p1, p1, Ljava/net/SocketException;

    .line 43
    .line 44
    if-eqz p1, :cond_0

    .line 45
    .line 46
    const-string p1, "stopApplicationByPc"

    .line 47
    .line 48
    invoke-static {p1}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    const/4 v0, 0x0

    .line 53
    invoke-interface {p1, v0}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    return-void
.end method

.method public deliveryComplete(Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;)V
    .locals 1

    const-string v0, "arg0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public messageArrived(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttMessage;)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const-string v0, "/"

    const-string v3, "topic"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "message"

    move-object/from16 v4, p2

    invoke-static {v4, v3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    :try_start_0
    invoke-virtual {v4}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->getPayload()[B

    move-result-object v3

    const-string v4, "getPayload(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v8, Ljava/lang/String;

    sget-object v4, Lqd/c;->b:Ljava/nio/charset/Charset;

    invoke-direct {v8, v3, v4}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 2
    const-string v3, "MyMqttService"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\u6536\u5230\u6d88\u606f\uff1amessage "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "  topic "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lqd/c0;->I0(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 4
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_a

    :cond_0
    const/4 v3, 0x0

    .line 5
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    iget-object v5, v1, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    invoke-static {v5}, Lcom/friday/lecture/service/MyMqttService;->f(Lcom/friday/lecture/service/MyMqttService;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v5, "toJson(...)"

    const-class v6, Lcom/friday/common/entity/MqttEntity;

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eqz v4, :cond_e

    .line 6
    :try_start_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    if-le v4, v9, :cond_1

    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    const-string v4, "REQUEST_SCREEN_CAPTURE"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 7
    iget-object v0, v1, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v2

    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    move-result-object v3

    new-instance v5, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$1;

    iget-object v0, v1, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    invoke-direct {v5, v0, v8, v10}, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$1;-><init>(Lcom/friday/lecture/service/MyMqttService;Ljava/lang/String;Lvc/c;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    return-void

    :catch_0
    move-exception v0

    goto/16 :goto_b

    .line 8
    :cond_1
    const-class v2, Lcom/friday/common/classtest/MqttResponseEntity;

    invoke-static {v8, v2}, Lcom/blankj/utilcode/util/GsonUtils;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/friday/common/classtest/MqttResponseEntity;

    if-eqz v2, :cond_2c

    .line 9
    invoke-virtual {v2}, Lcom/friday/common/classtest/MqttResponseEntity;->getType()I

    move-result v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const/16 v11, 0x4e20

    if-eq v4, v11, :cond_8

    const/16 v11, 0x4e27

    const-string v12, "EndInClassTest"

    if-eq v4, v11, :cond_6

    const/16 v11, 0x4e2d

    if-eq v4, v11, :cond_5

    const/16 v9, 0x4e23

    if-eq v4, v9, :cond_8

    const/16 v0, 0x4e24

    if-eq v4, v0, :cond_4

    const/16 v0, 0x4e2a

    if-eq v4, v0, :cond_3

    const/16 v0, 0x4e2b

    if-eq v4, v0, :cond_2

    goto/16 :goto_a

    .line 10
    :cond_2
    :try_start_2
    const-string v0, "StartScreencast"

    invoke-static {v0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    move-result-object v0

    invoke-interface {v0, v8}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    return-void

    .line 11
    :cond_3
    const-string v0, "\u4e0d\u5141\u8bb8\u591a\u4e2a\u8bbe\u5907\u540c\u65f6\u6295\u5c4f"

    invoke-static {v0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 12
    invoke-static {v12}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    move-result-object v0

    invoke-interface {v0, v10}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    return-void

    .line 13
    :cond_4
    invoke-virtual {v2}, Lcom/friday/common/classtest/MqttResponseEntity;->getData()Lcom/friday/common/classtest/ResponseScreencastData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/friday/common/classtest/ResponseScreencastData;->getTimeStamp()J

    move-result-wide v3

    iget-object v0, v1, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    invoke-static {v0}, Lcom/friday/lecture/service/MyMqttService;->k(Lcom/friday/lecture/service/MyMqttService;)J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-lez v0, :cond_2c

    .line 14
    iget-object v0, v1, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    invoke-virtual {v2}, Lcom/friday/common/classtest/MqttResponseEntity;->getData()Lcom/friday/common/classtest/ResponseScreencastData;

    move-result-object v3

    invoke-virtual {v3}, Lcom/friday/common/classtest/ResponseScreencastData;->getTimeStamp()J

    move-result-wide v3

    invoke-static {v0, v3, v4}, Lcom/friday/lecture/service/MyMqttService;->t(Lcom/friday/lecture/service/MyMqttService;J)V

    .line 15
    invoke-virtual {v2}, Lcom/friday/common/classtest/MqttResponseEntity;->getData()Lcom/friday/common/classtest/ResponseScreencastData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/friday/common/classtest/ResponseScreencastData;->getStudentList()Ljava/util/List;

    move-result-object v0

    .line 16
    sget-object v2, Lcom/friday/lecture/model/ClassTestHelper;->INSTANCE:Lcom/friday/lecture/model/ClassTestHelper;

    invoke-virtual {v2, v0}, Lcom/friday/lecture/model/ClassTestHelper;->setStudentList(Ljava/util/List;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    .line 17
    :cond_5
    :try_start_3
    iget-object v0, v1, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    const-string v2, ""

    invoke-static {v0}, Lcom/friday/lecture/service/MyMqttService;->f(Lcom/friday/lecture/service/MyMqttService;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3, v9}, Lcom/friday/lecture/service/MyMqttService;->n(Lcom/friday/lecture/service/MyMqttService;Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 18
    :catch_1
    :try_start_4
    const-string v0, "StopScreencast"

    invoke-static {v0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    move-result-object v0

    invoke-interface {v0, v10}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    goto/16 :goto_a

    .line 19
    :cond_6
    invoke-virtual {v2}, Lcom/friday/common/classtest/MqttResponseEntity;->getData()Lcom/friday/common/classtest/ResponseScreencastData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/friday/common/classtest/ResponseScreencastData;->getTopic()Ljava/lang/String;

    move-result-object v0

    const-string v2, "teEb3gnyru3QCnxv"

    .line 20
    invoke-static {v0, v2}, Lh2/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 21
    const-string v2, "zykj_ktzs"

    .line 22
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 23
    const-string v0, "IntranetMqttConnected"

    invoke-static {v0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    move-result-object v0

    invoke-interface {v0, v10}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 24
    iget-object v0, v1, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    invoke-static {v0, v9}, Lcom/friday/lecture/service/MyMqttService;->q(Lcom/friday/lecture/service/MyMqttService;Z)V

    return-void

    .line 25
    :cond_7
    invoke-static {v12}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    move-result-object v0

    invoke-interface {v0, v10}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    return-void

    .line 26
    :cond_8
    iget-object v4, v1, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    invoke-virtual {v2}, Lcom/friday/common/classtest/MqttResponseEntity;->getData()Lcom/friday/common/classtest/ResponseScreencastData;

    move-result-object v8

    invoke-virtual {v8}, Lcom/friday/common/classtest/ResponseScreencastData;->getTopic()Ljava/lang/String;

    move-result-object v8

    invoke-static {v4, v8}, Lcom/friday/lecture/service/MyMqttService;->r(Lcom/friday/lecture/service/MyMqttService;Ljava/lang/String;)V

    .line 27
    sget-object v4, Lk2/q;->a:Lk2/q;

    invoke-virtual {v2}, Lcom/friday/common/classtest/MqttResponseEntity;->getData()Lcom/friday/common/classtest/ResponseScreencastData;

    move-result-object v2

    invoke-virtual {v2}, Lcom/friday/common/classtest/ResponseScreencastData;->getFtpPort()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v4, v2}, Lk2/q;->b(Ljava/lang/Integer;)V

    .line 28
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 29
    invoke-static {}, Lcom/friday/common/entity/MqttType;->values()[Lcom/friday/common/entity/MqttType;

    move-result-object v4

    iget-object v8, v1, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    .line 30
    new-instance v9, Ljava/util/ArrayList;

    array-length v11, v4

    invoke-direct {v9, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 31
    array-length v11, v4

    move v12, v3

    :goto_0
    if-ge v12, v11, :cond_9

    aget-object v13, v4, v12

    .line 32
    invoke-static {v8}, Lcom/friday/lecture/service/MyMqttService;->i(Lcom/friday/lecture/service/MyMqttService;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v13

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, "/all"

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 33
    invoke-interface {v9, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    .line 34
    :cond_9
    invoke-static {}, Lcom/friday/common/entity/MqttType;->values()[Lcom/friday/common/entity/MqttType;

    move-result-object v4

    iget-object v8, v1, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    .line 35
    new-instance v11, Ljava/util/ArrayList;

    array-length v12, v4

    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 36
    array-length v12, v4

    move v13, v3

    :goto_1
    if-ge v13, v12, :cond_a

    aget-object v14, v4, v13

    .line 37
    invoke-static {v8}, Lcom/friday/lecture/service/MyMqttService;->i(Lcom/friday/lecture/service/MyMqttService;)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v14

    .line 38
    sget-object v16, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    invoke-virtual/range {v16 .. v16}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    move-result-object v16

    move-object/from16 p2, v8

    const/16 p1, 0x2

    invoke-virtual/range {v16 .. v16}, Lcom/friday/common/helper/b;->t()J

    move-result-wide v7

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 39
    invoke-interface {v11, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v8, p2

    const/4 v10, 0x0

    goto :goto_1

    :cond_a
    const/16 p1, 0x2

    .line 40
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 41
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 42
    iget-object v0, v1, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    invoke-static {v0}, Lcom/friday/lecture/service/MyMqttService;->g(Lcom/friday/lecture/service/MyMqttService;)Lorg/eclipse/paho/android/service/MqttAndroidClient;

    move-result-object v0

    if-eqz v0, :cond_c

    .line 43
    new-array v4, v3, [Ljava/lang/String;

    invoke-interface {v2, v4}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Ljava/lang/String;

    .line 44
    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v2, v8}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 45
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v8

    :goto_2
    if-ge v3, v8, :cond_b

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    add-int/lit8 v3, v3, 0x1

    .line 46
    check-cast v9, Ljava/lang/String;

    .line 47
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    .line 48
    invoke-interface {v7, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 49
    :cond_b
    invoke-static {v7}, Lrc/g0;->W0(Ljava/util/Collection;)[I

    move-result-object v2

    .line 50
    invoke-virtual {v0, v4, v2}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->subscribe([Ljava/lang/String;[I)Lorg/eclipse/paho/client/mqttv3/IMqttToken;

    .line 51
    :cond_c
    invoke-static {v6}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    move-result-object v0

    .line 52
    new-instance v6, Lcom/friday/common/entity/MqttEntity;

    .line 53
    sget-object v7, Lcom/friday/common/entity/MqttType;->NONE:Lcom/friday/common/entity/MqttType;

    .line 54
    new-instance v2, Lcom/friday/common/classtest/MqttRequestEntity;

    const/16 v3, 0x2716

    move/from16 v4, p1

    const/4 v8, 0x0

    invoke-direct {v2, v3, v8, v4, v8}, Lcom/friday/common/classtest/MqttRequestEntity;-><init>(ILcom/friday/common/classtest/RequestScreencastData;ILkotlin/jvm/internal/n;)V

    invoke-static {v2}, Lcom/blankj/utilcode/util/GsonUtils;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v9, 0x0

    .line 55
    invoke-direct/range {v6 .. v11}, Lcom/friday/common/entity/MqttEntity;-><init>(Lcom/friday/common/entity/MqttType;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 56
    invoke-interface {v0, v6}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 57
    iget-object v0, v1, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    invoke-static {v0}, Lcom/friday/lecture/service/MyMqttService;->m(Lcom/friday/lecture/service/MyMqttService;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 58
    sget-object v0, Lk2/v;->a:Lk2/v$a;

    const-string v2, "ClassSuccessful"

    invoke-virtual {v0, v2}, Lk2/v$a;->a(Ljava/lang/String;)V

    return-void

    .line 59
    :cond_d
    sget-object v0, Lk2/v;->a:Lk2/v$a;

    const-string v2, "ProjectionSuccessful"

    invoke-virtual {v0, v2}, Lk2/v$a;->a(Ljava/lang/String;)V

    return-void

    .line 60
    :cond_e
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-gt v0, v9, :cond_f

    goto/16 :goto_a

    .line 61
    :cond_f
    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 62
    iget-object v2, v1, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    invoke-static {v2}, Lcom/friday/lecture/service/MyMqttService;->m(Lcom/friday/lecture/service/MyMqttService;)Z

    move-result v2
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    const-string v3, "stopApplicationByPc"

    const-string v4, "STOP_APPLICATION_BY_PC"

    const-string v7, "stopScreencastByPc"

    const-string v9, "STOP_SCREENCAST_BY_PC"

    if-eqz v2, :cond_18

    .line 63
    :try_start_5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    goto/16 :goto_a

    :sswitch_0
    const-string v2, "IS_STUDENT_ONLINE"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto/16 :goto_a

    .line 64
    :cond_10
    iget-object v0, v1, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v2

    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    move-result-object v3

    new-instance v5, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$4;

    iget-object v0, v1, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    const/4 v4, 0x0

    invoke-direct {v5, v0, v8, v4}, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$4;-><init>(Lcom/friday/lecture/service/MyMqttService;Ljava/lang/String;Lvc/c;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    return-void

    .line 65
    :sswitch_1
    const-string v2, "END_CLASS"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto/16 :goto_a

    .line 66
    :cond_11
    const-string v0, "homeworkEndClass"

    invoke-static {v0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    move-result-object v0

    invoke-interface {v0, v8}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    return-void

    .line 67
    :sswitch_2
    const-string v2, "SUBMIT_HOMEWORK_REPLY"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    goto/16 :goto_a

    .line 68
    :cond_12
    const-string v0, "submitHomeworkReply"

    invoke-static {v0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    move-result-object v0

    invoke-interface {v0, v8}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    return-void

    .line 69
    :sswitch_3
    const-string v2, "REQUEST_HOMEWORK_STATUS_REPLY"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    goto/16 :goto_a

    .line 70
    :cond_13
    const-string v0, "requestHomeworkStatusReply"

    invoke-static {v0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    move-result-object v0

    invoke-interface {v0, v8}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    return-void

    .line 71
    :sswitch_4
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    goto/16 :goto_a

    .line 72
    :cond_14
    invoke-static {v7}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    move-result-object v0

    const/4 v4, 0x0

    invoke-interface {v0, v4}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    return-void

    .line 73
    :sswitch_5
    const-string v2, "TIME_UP"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    goto/16 :goto_a

    .line 74
    :cond_15
    const-string v0, "homeworkTimeUp"

    invoke-static {v0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    move-result-object v0

    const/4 v4, 0x0

    invoke-interface {v0, v4}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    return-void

    .line 75
    :sswitch_6
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    goto/16 :goto_a

    .line 76
    :cond_16
    invoke-static {v3}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    move-result-object v0

    const/4 v4, 0x0

    invoke-interface {v0, v4}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    return-void

    .line 77
    :sswitch_7
    const-string v2, "ARRANGE_HOMEWORK"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    goto/16 :goto_a

    .line 78
    :cond_17
    const-string v0, "receiveHomework"

    invoke-static {v0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    move-result-object v0

    invoke-interface {v0, v8}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 79
    invoke-static {v6}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    move-result-object v0

    .line 80
    new-instance v6, Lcom/friday/common/entity/MqttEntity;

    .line 81
    sget-object v7, Lcom/friday/common/entity/MqttType;->NONE:Lcom/friday/common/entity/MqttType;

    .line 82
    new-instance v2, Lcom/friday/common/classtest/MqttRequestEntity;

    const/16 v3, 0x271b

    const/4 v4, 0x2

    const/4 v8, 0x0

    invoke-direct {v2, v3, v8, v4, v8}, Lcom/friday/common/classtest/MqttRequestEntity;-><init>(ILcom/friday/common/classtest/RequestScreencastData;ILkotlin/jvm/internal/n;)V

    invoke-static {v2}, Lcom/blankj/utilcode/util/GsonUtils;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v9, 0x0

    .line 83
    invoke-direct/range {v6 .. v11}, Lcom/friday/common/entity/MqttEntity;-><init>(Lcom/friday/common/entity/MqttType;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 84
    invoke-interface {v0, v6}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    return-void

    .line 85
    :cond_18
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    const-class v10, Lcom/friday/common/util/ShowStudentState;

    const-class v11, Lcom/friday/common/entity/IfStudentOnline;

    sparse-switch v2, :sswitch_data_1

    goto/16 :goto_a

    :sswitch_8
    :try_start_6
    const-string v2, "STUDENT_ONLINE_NOW"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    goto/16 :goto_a

    .line 86
    :cond_19
    invoke-static {v8, v11}, Lcom/blankj/utilcode/util/GsonUtils;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/friday/common/entity/IfStudentOnline;

    .line 87
    invoke-static {v10}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    move-result-object v2

    .line 88
    new-instance v3, Lcom/friday/common/util/ShowStudentState;

    .line 89
    invoke-virtual {v0}, Lcom/friday/common/entity/IfStudentOnline;->getUuid()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lcom/friday/common/entity/IfStudentOnline;->getUserId()Ljava/lang/String;

    move-result-object v0

    sget-object v5, Lcom/friday/common/util/StudentState;->d:Lcom/friday/common/util/StudentState;

    .line 90
    invoke-direct {v3, v4, v0, v5}, Lcom/friday/common/util/ShowStudentState;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/friday/common/util/StudentState;)V

    .line 91
    invoke-interface {v2, v3}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    return-void

    .line 92
    :sswitch_9
    const-string v2, "STUDENT_SCREEN_OFF"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1a

    goto/16 :goto_a

    .line 93
    :cond_1a
    invoke-static {v8, v11}, Lcom/blankj/utilcode/util/GsonUtils;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/friday/common/entity/IfStudentOnline;

    .line 94
    invoke-static {v10}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    move-result-object v2

    .line 95
    new-instance v3, Lcom/friday/common/util/ShowStudentState;

    .line 96
    invoke-virtual {v0}, Lcom/friday/common/entity/IfStudentOnline;->getUuid()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lcom/friday/common/entity/IfStudentOnline;->getUserId()Ljava/lang/String;

    move-result-object v0

    sget-object v5, Lcom/friday/common/util/StudentState;->c:Lcom/friday/common/util/StudentState;

    .line 97
    invoke-direct {v3, v4, v0, v5}, Lcom/friday/common/util/ShowStudentState;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/friday/common/util/StudentState;)V

    .line 98
    invoke-interface {v2, v3}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    return-void

    .line 99
    :sswitch_a
    const-string v2, "REQUEST_HOMEWORK_STATUS"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1b

    goto/16 :goto_a

    .line 100
    :cond_1b
    sget-object v0, Lcom/friday/lecture/model/ClassTestHelper;->INSTANCE:Lcom/friday/lecture/model/ClassTestHelper;

    invoke-virtual {v0}, Lcom/friday/lecture/model/ClassTestHelper;->getRecentlyHomework()Lcom/friday/common/classtest/MqttResponse;

    move-result-object v2
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    const-string v3, "/REQUEST_HOMEWORK_STATUS_REPLY/"

    if-nez v2, :cond_1c

    .line 101
    :try_start_7
    iget-object v9, v1, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    .line 102
    sget-object v0, Lcom/friday/common/entity/HomeworkStatus;->END_CLASS:Lcom/friday/common/entity/HomeworkStatus;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 103
    iget-object v0, v1, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    invoke-static {v0}, Lcom/friday/lecture/service/MyMqttService;->i(Lcom/friday/lecture/service/MyMqttService;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    const/4 v13, 0x4

    const/4 v14, 0x0

    const/4 v12, 0x0

    .line 104
    invoke-static/range {v9 .. v14}, Lcom/friday/lecture/service/MyMqttService;->B(Lcom/friday/lecture/service/MyMqttService;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    return-void

    .line 105
    :cond_1c
    invoke-virtual {v0}, Lcom/friday/lecture/model/ClassTestHelper;->getRecentlyHomework()Lcom/friday/common/classtest/MqttResponse;

    move-result-object v2

    if-eqz v2, :cond_1d

    invoke-virtual {v2}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    move-result-object v2

    if-eqz v2, :cond_1d

    invoke-virtual {v2}, Lcom/friday/common/classtest/MqttResponse$Data;->getCanSubmit()Z

    move-result v2

    if-nez v2, :cond_1d

    .line 106
    iget-object v9, v1, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    .line 107
    sget-object v0, Lcom/friday/common/entity/HomeworkStatus;->TIME_UP:Lcom/friday/common/entity/HomeworkStatus;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 108
    iget-object v0, v1, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    invoke-static {v0}, Lcom/friday/lecture/service/MyMqttService;->i(Lcom/friday/lecture/service/MyMqttService;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    const/4 v13, 0x4

    const/4 v14, 0x0

    const/4 v12, 0x0

    .line 109
    invoke-static/range {v9 .. v14}, Lcom/friday/lecture/service/MyMqttService;->B(Lcom/friday/lecture/service/MyMqttService;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    return-void

    .line 110
    :cond_1d
    invoke-virtual {v0}, Lcom/friday/lecture/model/ClassTestHelper;->getSubmittedList()Ljava/util/LinkedHashSet;

    move-result-object v0

    .line 111
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lcom/friday/common/classtest/MqttResponse$Student;

    invoke-virtual {v4}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v8}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1e

    move-object v10, v2

    goto :goto_3

    :cond_1f
    const/4 v10, 0x0

    :goto_3
    if-eqz v10, :cond_20

    .line 112
    iget-object v11, v1, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    .line 113
    sget-object v0, Lcom/friday/common/entity/HomeworkStatus;->SUBMITTED:Lcom/friday/common/entity/HomeworkStatus;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    .line 114
    iget-object v0, v1, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    invoke-static {v0}, Lcom/friday/lecture/service/MyMqttService;->i(Lcom/friday/lecture/service/MyMqttService;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    const/4 v15, 0x4

    const/16 v16, 0x0

    const/4 v14, 0x0

    .line 115
    invoke-static/range {v11 .. v16}, Lcom/friday/lecture/service/MyMqttService;->B(Lcom/friday/lecture/service/MyMqttService;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    return-void

    .line 116
    :cond_20
    invoke-static {v6}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    move-result-object v0

    .line 117
    new-instance v2, Lcom/friday/common/entity/MqttEntity;

    .line 118
    sget-object v3, Lcom/friday/common/entity/MqttType;->ARRANGE_HOMEWORK:Lcom/friday/common/entity/MqttType;

    .line 119
    sget-object v4, Lcom/friday/lecture/model/ClassTestHelper;->INSTANCE:Lcom/friday/lecture/model/ClassTestHelper;

    invoke-virtual {v4}, Lcom/friday/lecture/model/ClassTestHelper;->getRecentlyHomework()Lcom/friday/common/classtest/MqttResponse;

    move-result-object v4

    invoke-static {v4}, Lcom/blankj/utilcode/util/GsonUtils;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    invoke-direct {v2, v3, v4, v8}, Lcom/friday/common/entity/MqttEntity;-><init>(Lcom/friday/common/entity/MqttType;Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    invoke-interface {v0, v2}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    return-void

    .line 122
    :sswitch_b
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_21

    goto/16 :goto_a

    .line 123
    :cond_21
    invoke-static {v7}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    move-result-object v0

    const/4 v4, 0x0

    invoke-interface {v0, v4}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    return-void

    .line 124
    :sswitch_c
    const-string v2, "REQUEST_SUBMIT_HOMEWORK"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_22

    goto/16 :goto_a

    .line 125
    :cond_22
    const-class v0, Lcom/friday/common/classtest/MqttResponse;

    invoke-static {v8, v0}, Lcom/blankj/utilcode/util/GsonUtils;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/friday/common/classtest/MqttResponse;

    .line 126
    sget-object v2, Lcom/friday/lecture/model/ClassTestHelper;->INSTANCE:Lcom/friday/lecture/model/ClassTestHelper;

    invoke-virtual {v2}, Lcom/friday/lecture/model/ClassTestHelper;->getRecentlyHomework()Lcom/friday/common/classtest/MqttResponse;

    move-result-object v3
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    const-string v4, "/SUBMIT_HOMEWORK_REPLY/"

    if-nez v3, :cond_24

    .line 127
    :try_start_8
    iget-object v5, v1, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    .line 128
    sget-object v2, Lcom/friday/common/entity/SubmitHomeworkStatus;->END_CLASS:Lcom/friday/common/entity/SubmitHomeworkStatus;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 129
    iget-object v2, v1, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    invoke-static {v2}, Lcom/friday/lecture/service/MyMqttService;->i(Lcom/friday/lecture/service/MyMqttService;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    move-result-object v0

    invoke-virtual {v0}, Lcom/friday/common/classtest/MqttResponse$Data;->getStudent()Lcom/friday/common/classtest/MqttResponse$Student;

    move-result-object v0

    if-eqz v0, :cond_23

    invoke-virtual {v0}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentId()Ljava/lang/String;

    move-result-object v10

    goto :goto_4

    :cond_23
    const/4 v10, 0x0

    :goto_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    .line 130
    invoke-static/range {v5 .. v10}, Lcom/friday/lecture/service/MyMqttService;->B(Lcom/friday/lecture/service/MyMqttService;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    return-void

    .line 131
    :cond_24
    invoke-virtual {v0}, Lcom/friday/common/classtest/MqttResponse;->getGuid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/friday/lecture/model/ClassTestHelper;->getRecentlyHomework()Lcom/friday/common/classtest/MqttResponse;

    move-result-object v5

    if-eqz v5, :cond_25

    invoke-virtual {v5}, Lcom/friday/common/classtest/MqttResponse;->getGuid()Ljava/lang/String;

    move-result-object v8

    goto :goto_5

    :cond_25
    const/4 v8, 0x0

    :goto_5
    invoke-static {v3, v8}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_27

    .line 132
    iget-object v5, v1, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    .line 133
    sget-object v2, Lcom/friday/common/entity/SubmitHomeworkStatus;->ID_ERROR:Lcom/friday/common/entity/SubmitHomeworkStatus;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 134
    iget-object v2, v1, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    invoke-static {v2}, Lcom/friday/lecture/service/MyMqttService;->i(Lcom/friday/lecture/service/MyMqttService;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    move-result-object v0

    invoke-virtual {v0}, Lcom/friday/common/classtest/MqttResponse$Data;->getStudent()Lcom/friday/common/classtest/MqttResponse$Student;

    move-result-object v0

    if-eqz v0, :cond_26

    invoke-virtual {v0}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentId()Ljava/lang/String;

    move-result-object v10

    goto :goto_6

    :cond_26
    const/4 v10, 0x0

    :goto_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    .line 135
    invoke-static/range {v5 .. v10}, Lcom/friday/lecture/service/MyMqttService;->B(Lcom/friday/lecture/service/MyMqttService;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    return-void

    .line 136
    :cond_27
    invoke-virtual {v2}, Lcom/friday/lecture/model/ClassTestHelper;->getRecentlyHomework()Lcom/friday/common/classtest/MqttResponse;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    move-result-object v3

    invoke-virtual {v3}, Lcom/friday/common/classtest/MqttResponse$Data;->getCanSubmit()Z

    move-result v3

    if-nez v3, :cond_29

    .line 137
    iget-object v5, v1, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    .line 138
    sget-object v2, Lcom/friday/common/entity/SubmitHomeworkStatus;->TIME_UP:Lcom/friday/common/entity/SubmitHomeworkStatus;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 139
    iget-object v2, v1, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    invoke-static {v2}, Lcom/friday/lecture/service/MyMqttService;->i(Lcom/friday/lecture/service/MyMqttService;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    move-result-object v0

    invoke-virtual {v0}, Lcom/friday/common/classtest/MqttResponse$Data;->getStudent()Lcom/friday/common/classtest/MqttResponse$Student;

    move-result-object v0

    if-eqz v0, :cond_28

    invoke-virtual {v0}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentId()Ljava/lang/String;

    move-result-object v10

    goto :goto_7

    :cond_28
    const/4 v10, 0x0

    :goto_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    .line 140
    invoke-static/range {v5 .. v10}, Lcom/friday/lecture/service/MyMqttService;->B(Lcom/friday/lecture/service/MyMqttService;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    return-void

    .line 141
    :cond_29
    invoke-virtual {v0}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    move-result-object v3

    invoke-virtual {v3}, Lcom/friday/common/classtest/MqttResponse$Data;->getStudent()Lcom/friday/common/classtest/MqttResponse$Student;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/friday/lecture/model/ClassTestHelper;->addSubmitted(Lcom/friday/common/classtest/MqttResponse$Student;)V

    .line 142
    sget-object v3, Lcom/friday/lecture/floatwindow/options/a;->g:Lcom/friday/lecture/floatwindow/options/a$a;

    invoke-virtual {v3}, Lcom/friday/lecture/floatwindow/options/a$a;->a()Lcom/friday/lecture/floatwindow/options/a;

    move-result-object v3

    invoke-virtual {v2}, Lcom/friday/lecture/model/ClassTestHelper;->getSubmittedCount()I

    move-result v2

    invoke-virtual {v3, v2}, Lcom/friday/lecture/floatwindow/options/a;->r(I)V

    .line 143
    invoke-virtual {v0}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    move-result-object v2

    invoke-virtual {v2}, Lcom/friday/common/classtest/MqttResponse$Data;->getQstType()I

    move-result v2

    if-nez v2, :cond_2a

    .line 144
    sget-object v2, Li3/i0;->d:Li3/i0$a;

    invoke-virtual {v2}, Li3/i0$a;->a()Li3/i0;

    move-result-object v2

    .line 145
    invoke-virtual {v0}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    move-result-object v3

    invoke-virtual {v3}, Lcom/friday/common/classtest/MqttResponse$Data;->getImagePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    move-result-object v5

    invoke-virtual {v5}, Lcom/friday/common/classtest/MqttResponse$Data;->getStudent()Lcom/friday/common/classtest/MqttResponse$Student;

    move-result-object v5

    .line 146
    invoke-virtual {v2, v3, v5}, Li3/i0;->d(Ljava/lang/String;Lcom/friday/common/classtest/MqttResponse$Student;)V

    goto :goto_8

    .line 147
    :cond_2a
    sget-object v2, Li3/q;->d:Li3/q$a;

    invoke-virtual {v2}, Li3/q$a;->a()Li3/q;

    move-result-object v2

    .line 148
    invoke-virtual {v0}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    move-result-object v3

    invoke-virtual {v3}, Lcom/friday/common/classtest/MqttResponse$Data;->getOptions()I

    move-result v3

    .line 149
    invoke-virtual {v0}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    move-result-object v5

    invoke-virtual {v5}, Lcom/friday/common/classtest/MqttResponse$Data;->getQstType()I

    move-result v5

    .line 150
    invoke-virtual {v0}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    move-result-object v6

    invoke-virtual {v6}, Lcom/friday/common/classtest/MqttResponse$Data;->getStudent()Lcom/friday/common/classtest/MqttResponse$Student;

    move-result-object v6

    .line 151
    invoke-virtual {v0}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    move-result-object v7

    invoke-virtual {v7}, Lcom/friday/common/classtest/MqttResponse$Data;->getAnswerList()Ljava/util/List;

    move-result-object v7

    .line 152
    invoke-virtual {v2, v3, v5, v6, v7}, Li3/q;->d(IILcom/friday/common/classtest/MqttResponse$Student;Ljava/util/List;)V

    .line 153
    :goto_8
    iget-object v8, v1, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    .line 154
    sget-object v2, Lcom/friday/common/entity/SubmitHomeworkStatus;->NORMAL:Lcom/friday/common/entity/SubmitHomeworkStatus;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 155
    iget-object v2, v1, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    invoke-static {v2}, Lcom/friday/lecture/service/MyMqttService;->i(Lcom/friday/lecture/service/MyMqttService;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    move-result-object v0

    invoke-virtual {v0}, Lcom/friday/common/classtest/MqttResponse$Data;->getStudent()Lcom/friday/common/classtest/MqttResponse$Student;

    move-result-object v0

    if-eqz v0, :cond_2b

    invoke-virtual {v0}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentId()Ljava/lang/String;

    move-result-object v10

    goto :goto_9

    :cond_2b
    const/4 v10, 0x0

    :goto_9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    const/4 v12, 0x4

    const/4 v13, 0x0

    const/4 v11, 0x0

    .line 156
    invoke-static/range {v8 .. v13}, Lcom/friday/lecture/service/MyMqttService;->B(Lcom/friday/lecture/service/MyMqttService;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    return-void

    .line 157
    :sswitch_d
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2d

    :cond_2c
    :goto_a
    return-void

    .line 158
    :cond_2d
    invoke-static {v3}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    move-result-object v0

    const/4 v4, 0x0

    invoke-interface {v0, v4}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    return-void

    .line 159
    :goto_b
    const-string v2, "\u6536\u53d1\u6d88\u606f\u65f6\u51fa\u73b0\u9519\u8bef"

    invoke-static {v2}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 160
    iget-object v2, v1, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->a:Lcom/friday/lecture/service/MyMqttService;

    invoke-static {v2, v0}, Lcom/friday/lecture/service/MyMqttService;->d(Lcom/friday/lecture/service/MyMqttService;Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "MyMqttService -> mqttCallback catch,\u6536\u53d1\u6d88\u606f\u65f6\u51fa\u73b0\u9519\u8bef, "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 161
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x76e59c3d -> :sswitch_7
        -0x5bed07f1 -> :sswitch_6
        -0x2384eab3 -> :sswitch_5
        -0x17689e1c -> :sswitch_4
        0x2937b1dc -> :sswitch_3
        0x46261542 -> :sswitch_2
        0x502568d4 -> :sswitch_1
        0x5aff40ac -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        -0x5bed07f1 -> :sswitch_d
        -0x1a6aad19 -> :sswitch_c
        -0x17689e1c -> :sswitch_b
        0x28afd4d1 -> :sswitch_a
        0x4eb8f7a0 -> :sswitch_9
        0x4fb29f6e -> :sswitch_8
    .end sparse-switch
.end method
