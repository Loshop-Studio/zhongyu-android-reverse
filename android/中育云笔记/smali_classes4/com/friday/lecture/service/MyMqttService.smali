.class public final Lcom/friday/lecture/service/MyMqttService;
.super Lcom/friday/common/service/BaseLifecycleService;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/lecture/service/MyMqttService$a;
    }
.end annotation


# static fields
.field public static final t:Lcom/friday/lecture/service/MyMqttService$a;

.field public static final u:I


# instance fields
.field public d:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public g:Z

.field public h:Ljava/lang/String;

.field public final i:Lqc/d;

.field public j:Ljava/lang/String;

.field public k:Lorg/eclipse/paho/android/service/MqttAndroidClient;

.field public final l:Z

.field public final m:Lsd/v;

.field public final n:Lsd/i0;

.field public o:Lkotlinx/coroutines/g;

.field public p:Z

.field public final q:Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;

.field public r:J

.field public final s:Lorg/eclipse/paho/client/mqttv3/MqttCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/friday/lecture/service/MyMqttService$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/friday/lecture/service/MyMqttService$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/friday/lecture/service/MyMqttService;->t:Lcom/friday/lecture/service/MyMqttService$a;

    const/16 v0, 0x8

    sput v0, Lcom/friday/lecture/service/MyMqttService;->u:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/friday/common/service/BaseLifecycleService;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "admin"

    .line 5
    .line 6
    iput-object v0, p0, Lcom/friday/lecture/service/MyMqttService;->e:Ljava/lang/String;

    .line 7
    .line 8
    const-string v0, "public"

    .line 9
    .line 10
    iput-object v0, p0, Lcom/friday/lecture/service/MyMqttService;->f:Ljava/lang/String;

    .line 11
    .line 12
    const-string v0, ""

    .line 13
    .line 14
    iput-object v0, p0, Lcom/friday/lecture/service/MyMqttService;->h:Ljava/lang/String;

    .line 15
    .line 16
    new-instance v1, Lk3/b;

    .line 17
    .line 18
    invoke-direct {v1}, Lk3/b;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-static {v1}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iput-object v1, p0, Lcom/friday/lecture/service/MyMqttService;->i:Lqc/d;

    .line 26
    .line 27
    iput-object v0, p0, Lcom/friday/lecture/service/MyMqttService;->j:Ljava/lang/String;

    .line 28
    .line 29
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Lcom/friday/common/helper/b;->v()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iput-boolean v0, p0, Lcom/friday/lecture/service/MyMqttService;->l:Z

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    const/4 v1, 0x1

    .line 43
    invoke-static {v0, v1, v0}, Lsd/o1;->b(Lkotlinx/coroutines/g;ILjava/lang/Object;)Lsd/v;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, Lcom/friday/lecture/service/MyMqttService;->m:Lsd/v;

    .line 48
    .line 49
    invoke-static {}, Lsd/r0;->c()Lsd/t1;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v1, v0}, Lkotlin/coroutines/a;->plus(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0}, Lkotlinx/coroutines/d;->a(Lkotlin/coroutines/d;)Lsd/i0;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iput-object v0, p0, Lcom/friday/lecture/service/MyMqttService;->n:Lsd/i0;

    .line 62
    .line 63
    new-instance v0, Lcom/friday/lecture/service/MyMqttService$b;

    .line 64
    .line 65
    invoke-direct {v0, p0}, Lcom/friday/lecture/service/MyMqttService$b;-><init>(Lcom/friday/lecture/service/MyMqttService;)V

    .line 66
    .line 67
    .line 68
    iput-object v0, p0, Lcom/friday/lecture/service/MyMqttService;->q:Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;

    .line 69
    .line 70
    new-instance v0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;

    .line 71
    .line 72
    invoke-direct {v0, p0}, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;-><init>(Lcom/friday/lecture/service/MyMqttService;)V

    .line 73
    .line 74
    .line 75
    iput-object v0, p0, Lcom/friday/lecture/service/MyMqttService;->s:Lorg/eclipse/paho/client/mqttv3/MqttCallback;

    .line 76
    .line 77
    return-void
.end method

.method public static synthetic B(Lcom/friday/lecture/service/MyMqttService;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const-string p2, "board"

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    const/4 p3, 0x0

    .line 12
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/friday/lecture/service/MyMqttService;->A(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static synthetic D(Lcom/friday/lecture/service/MyMqttService;JILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x1

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const-wide/16 p1, 0xbb8

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/friday/lecture/service/MyMqttService;->C(J)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static synthetic b()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lcom/friday/lecture/service/MyMqttService;->v()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lcom/friday/lecture/service/MyMqttService;Lcom/friday/common/entity/MqttEntity;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/lecture/service/MyMqttService;->z(Lcom/friday/lecture/service/MyMqttService;Lcom/friday/common/entity/MqttEntity;)V

    return-void
.end method

.method public static final synthetic d(Lcom/friday/lecture/service/MyMqttService;Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/friday/lecture/service/MyMqttService;->u(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic e(Lcom/friday/lecture/service/MyMqttService;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/lecture/service/MyMqttService;->w()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic f(Lcom/friday/lecture/service/MyMqttService;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/lecture/service/MyMqttService;->x()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic g(Lcom/friday/lecture/service/MyMqttService;)Lorg/eclipse/paho/android/service/MqttAndroidClient;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/lecture/service/MyMqttService;->k:Lorg/eclipse/paho/android/service/MqttAndroidClient;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic h(Lcom/friday/lecture/service/MyMqttService;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/friday/lecture/service/MyMqttService;->g:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic i(Lcom/friday/lecture/service/MyMqttService;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/lecture/service/MyMqttService;->j:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic j(Lcom/friday/lecture/service/MyMqttService;)Lkotlinx/coroutines/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/lecture/service/MyMqttService;->o:Lkotlinx/coroutines/g;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic k(Lcom/friday/lecture/service/MyMqttService;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/friday/lecture/service/MyMqttService;->r:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final synthetic l(Lcom/friday/lecture/service/MyMqttService;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/lecture/service/MyMqttService;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic m(Lcom/friday/lecture/service/MyMqttService;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/friday/lecture/service/MyMqttService;->l:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic n(Lcom/friday/lecture/service/MyMqttService;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/friday/lecture/service/MyMqttService;->A(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic o(Lcom/friday/lecture/service/MyMqttService;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/friday/lecture/service/MyMqttService;->p:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic p(Lcom/friday/lecture/service/MyMqttService;Lorg/eclipse/paho/android/service/MqttAndroidClient;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/lecture/service/MyMqttService;->k:Lorg/eclipse/paho/android/service/MqttAndroidClient;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic q(Lcom/friday/lecture/service/MyMqttService;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/friday/lecture/service/MyMqttService;->g:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic r(Lcom/friday/lecture/service/MyMqttService;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/lecture/service/MyMqttService;->j:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic s(Lcom/friday/lecture/service/MyMqttService;Lkotlinx/coroutines/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/lecture/service/MyMqttService;->o:Lkotlinx/coroutines/g;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic t(Lcom/friday/lecture/service/MyMqttService;J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/friday/lecture/service/MyMqttService;->r:J

    .line 2
    .line 3
    return-void
.end method

.method public static final v()Ljava/lang/String;
    .locals 8

    .line 1
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lcom/friday/common/helper/b;->i()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2}, Lcom/friday/common/helper/b;->t()J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {v4}, Lcom/friday/common/helper/b;->u()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-virtual {v5}, Lcom/friday/common/helper/b;->o()I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    invoke-static {}, Lk2/u;->a()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Lcom/friday/common/helper/b;->f()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    new-instance v7, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v1, "_"

    .line 56
    .line 57
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v7, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    return-object v0
.end method

.method public static final z(Lcom/friday/lecture/service/MyMqttService;Lcom/friday/common/entity/MqttEntity;)V
    .locals 14

    .line 1
    invoke-virtual {p1}, Lcom/friday/common/entity/MqttEntity;->getSpecifiedId()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const-string v1, "/"

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/friday/common/entity/MqttEntity;->getMessage()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    iget-object v0, p0, Lcom/friday/lecture/service/MyMqttService;->j:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/friday/common/entity/MqttEntity;->getType()Lcom/friday/common/entity/MqttType;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    new-instance v2, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string p1, "/all"

    .line 42
    .line 43
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    const/4 v6, 0x4

    .line 51
    const/4 v7, 0x0

    .line 52
    const/4 v5, 0x0

    .line 53
    move-object v2, p0

    .line 54
    invoke-static/range {v2 .. v7}, Lcom/friday/lecture/service/MyMqttService;->B(Lcom/friday/lecture/service/MyMqttService;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_0
    move-object v8, p0

    .line 59
    invoke-virtual {p1}, Lcom/friday/common/entity/MqttEntity;->getSpecifiedId()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    const-string v0, "board"

    .line 64
    .line 65
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-eqz p0, :cond_1

    .line 70
    .line 71
    invoke-virtual {p1}, Lcom/friday/common/entity/MqttEntity;->getMessage()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    const/4 v12, 0x6

    .line 76
    const/4 v13, 0x0

    .line 77
    const/4 v10, 0x0

    .line 78
    const/4 v11, 0x0

    .line 79
    invoke-static/range {v8 .. v13}, Lcom/friday/lecture/service/MyMqttService;->B(Lcom/friday/lecture/service/MyMqttService;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_1
    invoke-virtual {p1}, Lcom/friday/common/entity/MqttEntity;->getMessage()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    iget-object p0, v8, Lcom/friday/lecture/service/MyMqttService;->j:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {p1}, Lcom/friday/common/entity/MqttEntity;->getType()Lcom/friday/common/entity/MqttType;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {p1}, Lcom/friday/common/entity/MqttEntity;->getSpecifiedId()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    new-instance v2, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v10

    .line 125
    const/4 v12, 0x4

    .line 126
    const/4 v13, 0x0

    .line 127
    const/4 v11, 0x0

    .line 128
    invoke-static/range {v8 .. v13}, Lcom/friday/lecture/service/MyMqttService;->B(Lcom/friday/lecture/service/MyMqttService;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/friday/lecture/service/MyMqttService;->k:Lorg/eclipse/paho/android/service/MqttAndroidClient;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->isConnected()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne v0, v1, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lcom/friday/lecture/service/MyMqttService;->k:Lorg/eclipse/paho/android/service/MqttAndroidClient;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    sget-object v1, Lqd/c;->b:Ljava/nio/charset/Charset;

    .line 17
    .line 18
    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string v1, "getBytes(...)"

    .line 23
    .line 24
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    invoke-virtual {v0, p2, p1, v1, p3}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->publish(Ljava/lang/String;[BIZ)Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :catch_0
    move-exception p1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return-void

    .line 35
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string p3, "MyMqttService,publish,\u5f53\u524d MQTT \u672a\u8fde\u63a5\uff0ctopic="

    .line 41
    .line 42
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, p1}, Lcom/friday/lecture/service/MyMqttService;->u(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    new-instance p3, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    const-string v0, "MyMqttService -> publish() catch, topic="

    .line 73
    .line 74
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string p2, ", "

    .line 81
    .line 82
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public final C(J)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/service/MyMqttService;->o:Lkotlinx/coroutines/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lkotlinx/coroutines/g;->isActive()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    const-string p1, "MyMqttService,scheduleReconnect,\u5df2\u6709\u91cd\u8fde\u4efb\u52a1\uff0c\u8df3\u8fc7\u91cd\u590d\u8c03\u5ea6"

    .line 13
    .line 14
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iget-object v0, p0, Lcom/friday/lecture/service/MyMqttService;->n:Lsd/i0;

    .line 23
    .line 24
    new-instance v3, Lcom/friday/lecture/service/MyMqttService$scheduleReconnect$1;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-direct {v3, p1, p2, p0, v1}, Lcom/friday/lecture/service/MyMqttService$scheduleReconnect$1;-><init>(JLcom/friday/lecture/service/MyMqttService;Lvc/c;)V

    .line 28
    .line 29
    .line 30
    const/4 v4, 0x3

    .line 31
    const/4 v5, 0x0

    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lcom/friday/lecture/service/MyMqttService;->o:Lkotlinx/coroutines/g;

    .line 38
    .line 39
    return-void
.end method

.method public onCreate()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/friday/common/service/BaseLifecycleService;->onCreate()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/friday/lecture/service/MyMqttService;->y()V

    .line 5
    .line 6
    .line 7
    const-class v0, Lcom/friday/common/entity/MqttEntity;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Lk3/a;

    .line 14
    .line 15
    invoke-direct {v1, p0}, Lk3/a;-><init>(Lcom/friday/lecture/service/MyMqttService;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, p0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "mqttServiceStatus"

    .line 22
    .line 23
    invoke-static {v0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-interface {v0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public onDestroy()V
    .locals 5

    .line 1
    sget-object v0, Lk2/q;->a:Lk2/q;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lk2/q;->b(Ljava/lang/Integer;)V

    .line 5
    .line 6
    .line 7
    const-string v0, "mqttServiceStatus"

    .line 8
    .line 9
    invoke-static {v0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-interface {v0, v2}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    sget-object v0, Lcom/friday/lecture/model/ClassTestHelper;->INSTANCE:Lcom/friday/lecture/model/ClassTestHelper;

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/friday/lecture/model/ClassTestHelper;->resetState()V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/friday/lecture/service/MyMqttService;->o:Lkotlinx/coroutines/g;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/g$a;->a(Lkotlinx/coroutines/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    iput-object v1, p0, Lcom/friday/lecture/service/MyMqttService;->o:Lkotlinx/coroutines/g;

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    iput-boolean v0, p0, Lcom/friday/lecture/service/MyMqttService;->p:Z

    .line 35
    .line 36
    const-class v0, Lcom/friday/common/activity/PusherService;

    .line 37
    .line 38
    invoke-static {v0}, Lcom/blankj/utilcode/util/ServiceUtils;->isServiceRunning(Ljava/lang/Class;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    invoke-static {v0}, Lcom/blankj/utilcode/util/ServiceUtils;->stopService(Ljava/lang/Class;)Z

    .line 45
    .line 46
    .line 47
    :cond_1
    const-string v0, "SimpleCanvasFingerMode"

    .line 48
    .line 49
    invoke-static {v0}, Lcom/blankj/utilcode/util/CacheMemoryStaticUtils;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    :try_start_0
    iget-object v0, p0, Lcom/friday/lecture/service/MyMqttService;->k:Lorg/eclipse/paho/android/service/MqttAndroidClient;

    .line 53
    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    new-instance v2, Lcom/friday/lecture/service/MyMqttService$c;

    .line 57
    .line 58
    invoke-direct {v2, p0}, Lcom/friday/lecture/service/MyMqttService$c;-><init>(Lcom/friday/lecture/service/MyMqttService;)V

    .line 59
    .line 60
    .line 61
    const-wide/16 v3, 0x0

    .line 62
    .line 63
    invoke-virtual {v0, v3, v4, v1, v2}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->disconnect(JLjava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :catch_0
    move-exception v0

    .line 68
    invoke-virtual {p0, v0}, Lcom/friday/lecture/service/MyMqttService;->u(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    new-instance v2, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 75
    .line 76
    .line 77
    const-string v3, "MyMqttService -> onDestroy catch, "

    .line 78
    .line 79
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 97
    .line 98
    .line 99
    :cond_2
    :goto_0
    invoke-super {p0}, Lcom/friday/common/service/BaseLifecycleService;->onDestroy()V

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public final u(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const-string p1, "cause=null"

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v2, "cause="

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
    const-string v0, ", message="

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    return-object p1
.end method

.method public final w()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/service/MyMqttService;->k:Lorg/eclipse/paho/android/service/MqttAndroidClient;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "MyMqttService,doClientConnection,client \u4e3a\u7a7a\uff0c\u8df3\u8fc7\u8fde\u63a5"

    .line 6
    .line 7
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->isConnected()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    const/4 v2, 0x1

    .line 24
    const/4 v3, 0x0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    iget-object v0, p0, Lcom/friday/lecture/service/MyMqttService;->o:Lkotlinx/coroutines/g;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-static {v0, v3, v2, v3}, Lkotlinx/coroutines/g$a;->a(Lkotlinx/coroutines/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    iput-object v3, p0, Lcom/friday/lecture/service/MyMqttService;->o:Lkotlinx/coroutines/g;

    .line 35
    .line 36
    iput-boolean v1, p0, Lcom/friday/lecture/service/MyMqttService;->p:Z

    .line 37
    .line 38
    const-string v0, "MyMqttService,doClientConnection,\u5df2\u8fde\u63a5\uff0c\u8df3\u8fc7\u91cd\u590d connect"

    .line 39
    .line 40
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_2
    iget-boolean v0, p0, Lcom/friday/lecture/service/MyMqttService;->p:Z

    .line 49
    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    const-string v0, "MyMqttService,doClientConnection,\u5df2\u6709\u8fde\u63a5\u8bf7\u6c42\u5728\u6267\u884c\uff0c\u8df3\u8fc7\u91cd\u590d connect"

    .line 53
    .line 54
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_3
    invoke-static {}, Lcom/blankj/utilcode/util/NetworkUtils;->isWifiConnected()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_4

    .line 67
    .line 68
    const-string v0, "MyMqttService,doClientConnection,wifi \u672a\u8fde\u63a5\uff0c\u7b49\u5f85\u4e0b\u6b21\u91cd\u8bd5"

    .line 69
    .line 70
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_4
    iget-object v0, p0, Lcom/friday/lecture/service/MyMqttService;->k:Lorg/eclipse/paho/android/service/MqttAndroidClient;

    .line 79
    .line 80
    if-eqz v0, :cond_5

    .line 81
    .line 82
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->isConnected()Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-nez v0, :cond_5

    .line 90
    .line 91
    invoke-static {}, Lcom/blankj/utilcode/util/NetworkUtils;->isWifiConnected()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_5

    .line 96
    .line 97
    :try_start_0
    iput-boolean v2, p0, Lcom/friday/lecture/service/MyMqttService;->p:Z

    .line 98
    .line 99
    iget-object v0, p0, Lcom/friday/lecture/service/MyMqttService;->k:Lorg/eclipse/paho/android/service/MqttAndroidClient;

    .line 100
    .line 101
    if-eqz v0, :cond_5

    .line 102
    .line 103
    iget-object v2, p0, Lcom/friday/lecture/service/MyMqttService;->d:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    .line 104
    .line 105
    iget-object v4, p0, Lcom/friday/lecture/service/MyMqttService;->q:Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;

    .line 106
    .line 107
    invoke-virtual {v0, v2, v3, v4}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->connect(Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    :try_end_0
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :catch_0
    move-exception v0

    .line 112
    iput-boolean v1, p0, Lcom/friday/lecture/service/MyMqttService;->p:Z

    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 115
    .line 116
    .line 117
    iget-object v1, p0, Lcom/friday/lecture/service/MyMqttService;->h:Ljava/lang/String;

    .line 118
    .line 119
    invoke-virtual {p0, v0}, Lcom/friday/lecture/service/MyMqttService;->u(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    new-instance v2, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    .line 128
    const-string v3, "MyMqttService -> doClientConnection() catch, url="

    .line 129
    .line 130
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    const-string v1, ", "

    .line 137
    .line 138
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    :cond_5
    return-void
.end method

.method public final x()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/service/MyMqttService;->i:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    return-object v0
.end method

.method public final y()V
    .locals 7

    .line 1
    sget-object v0, Lk2/q;->a:Lk2/q;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lk2/q;->b(Ljava/lang/Integer;)V

    .line 5
    .line 6
    .line 7
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lcom/friday/common/helper/b;->k()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v2, "tcp://"

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v0, ":61136"

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, Lcom/friday/lecture/service/MyMqttService;->h:Ljava/lang/String;

    .line 40
    .line 41
    new-instance v1, Lorg/eclipse/paho/android/service/MqttAndroidClient;

    .line 42
    .line 43
    iget-object v3, p0, Lcom/friday/lecture/service/MyMqttService;->h:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/friday/lecture/service/MyMqttService;->x()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    new-instance v5, Lorg/eclipse/paho/client/mqttv3/persist/MemoryPersistence;

    .line 50
    .line 51
    invoke-direct {v5}, Lorg/eclipse/paho/client/mqttv3/persist/MemoryPersistence;-><init>()V

    .line 52
    .line 53
    .line 54
    sget-object v6, Lorg/eclipse/paho/android/service/MqttAndroidClient$Ack;->c:Lorg/eclipse/paho/android/service/MqttAndroidClient$Ack;

    .line 55
    .line 56
    move-object v2, p0

    .line 57
    invoke-direct/range {v1 .. v6}, Lorg/eclipse/paho/android/service/MqttAndroidClient;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;Lorg/eclipse/paho/android/service/MqttAndroidClient$Ack;)V

    .line 58
    .line 59
    .line 60
    iput-object v1, v2, Lcom/friday/lecture/service/MyMqttService;->k:Lorg/eclipse/paho/android/service/MqttAndroidClient;

    .line 61
    .line 62
    iget-object v0, v2, Lcom/friday/lecture/service/MyMqttService;->s:Lorg/eclipse/paho/client/mqttv3/MqttCallback;

    .line 63
    .line 64
    invoke-virtual {v1, v0}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->setCallback(Lorg/eclipse/paho/client/mqttv3/MqttCallback;)V

    .line 65
    .line 66
    .line 67
    new-instance v0, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    .line 68
    .line 69
    invoke-direct {v0}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object v0, v2, Lcom/friday/lecture/service/MyMqttService;->d:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    .line 73
    .line 74
    const/4 v1, 0x1

    .line 75
    invoke-virtual {v0, v1}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->setCleanSession(Z)V

    .line 76
    .line 77
    .line 78
    iget-object v0, v2, Lcom/friday/lecture/service/MyMqttService;->d:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    .line 79
    .line 80
    if-eqz v0, :cond_0

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->setAutomaticReconnect(Z)V

    .line 83
    .line 84
    .line 85
    :cond_0
    iget-object v0, v2, Lcom/friday/lecture/service/MyMqttService;->d:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    .line 86
    .line 87
    if-eqz v0, :cond_1

    .line 88
    .line 89
    const/16 v1, 0xa

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->setConnectionTimeout(I)V

    .line 92
    .line 93
    .line 94
    :cond_1
    iget-object v0, v2, Lcom/friday/lecture/service/MyMqttService;->d:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    .line 95
    .line 96
    if-eqz v0, :cond_2

    .line 97
    .line 98
    const/16 v1, 0x3c

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->setKeepAliveInterval(I)V

    .line 101
    .line 102
    .line 103
    :cond_2
    iget-object v0, v2, Lcom/friday/lecture/service/MyMqttService;->d:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    .line 104
    .line 105
    if-eqz v0, :cond_3

    .line 106
    .line 107
    iget-object v1, v2, Lcom/friday/lecture/service/MyMqttService;->e:Ljava/lang/String;

    .line 108
    .line 109
    invoke-virtual {v0, v1}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->setUserName(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    :cond_3
    iget-object v0, v2, Lcom/friday/lecture/service/MyMqttService;->d:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    .line 113
    .line 114
    if-eqz v0, :cond_4

    .line 115
    .line 116
    iget-object v1, v2, Lcom/friday/lecture/service/MyMqttService;->f:Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    const-string v3, "toCharArray(...)"

    .line 123
    .line 124
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v1}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;->setPassword([C)V

    .line 128
    .line 129
    .line 130
    :cond_4
    invoke-virtual {p0}, Lcom/friday/lecture/service/MyMqttService;->w()V

    .line 131
    .line 132
    .line 133
    return-void
.end method
