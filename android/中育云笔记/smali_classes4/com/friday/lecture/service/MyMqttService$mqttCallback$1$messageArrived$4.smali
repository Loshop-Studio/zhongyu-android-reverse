.class final Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$4;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->messageArrived(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttMessage;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.lecture.service.MyMqttService$mqttCallback$1$messageArrived$4"
    f = "MyMqttService.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/lecture/service/MyMqttService;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/friday/lecture/service/MyMqttService;Ljava/lang/String;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$4;->d:Lcom/friday/lecture/service/MyMqttService;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$4;->e:Ljava/lang/String;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$4;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$4;->d:Lcom/friday/lecture/service/MyMqttService;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$4;->e:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$4;-><init>(Lcom/friday/lecture/service/MyMqttService;Ljava/lang/String;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$4;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$4;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$4;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$4;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/blankj/utilcode/util/ScreenUtils;->isScreenLock()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    const-string p1, "STUDENT_ONLINE_NOW"

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-string p1, "STUDENT_SCREEN_OFF"

    .line 21
    .line 22
    :goto_0
    iget-object v0, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$4;->d:Lcom/friday/lecture/service/MyMqttService;

    .line 23
    .line 24
    new-instance v1, Lcom/friday/common/entity/IfStudentOnline;

    .line 25
    .line 26
    iget-object v2, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$4;->e:Ljava/lang/String;

    .line 27
    .line 28
    sget-object v3, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 29
    .line 30
    invoke-virtual {v3}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v3}, Lcom/friday/common/helper/b;->t()J

    .line 35
    .line 36
    .line 37
    move-result-wide v3

    .line 38
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-direct {v1, v2, v3}, Lcom/friday/common/entity/IfStudentOnline;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v1}, Lcom/blankj/utilcode/util/GsonUtils;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const-string v2, "toJson(...)"

    .line 50
    .line 51
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-object v2, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$4;->d:Lcom/friday/lecture/service/MyMqttService;

    .line 55
    .line 56
    invoke-static {v2}, Lcom/friday/lecture/service/MyMqttService;->i(Lcom/friday/lecture/service/MyMqttService;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    new-instance v3, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v2, "/"

    .line 69
    .line 70
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string p1, "/all"

    .line 77
    .line 78
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    const/4 v4, 0x4

    .line 86
    const/4 v5, 0x0

    .line 87
    const/4 v3, 0x0

    .line 88
    invoke-static/range {v0 .. v5}, Lcom/friday/lecture/service/MyMqttService;->B(Lcom/friday/lecture/service/MyMqttService;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 92
    .line 93
    return-object p1

    .line 94
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 95
    .line 96
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 97
    .line 98
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw p1
.end method
