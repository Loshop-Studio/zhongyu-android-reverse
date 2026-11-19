.class Lcom/tendcloud/tenddata/ee$a$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tendcloud/tenddata/ee$a;->onSensorChanged(Landroid/hardware/SensorEvent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/tendcloud/tenddata/ee$a;

.field final synthetic val$event:Landroid/hardware/SensorEvent;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/ee$a;Landroid/hardware/SensorEvent;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/ee$a$1;->this$1:Lcom/tendcloud/tenddata/ee$a;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/tendcloud/tenddata/ee$a$1;->val$event:Landroid/hardware/SensorEvent;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lcom/tendcloud/tenddata/ee$a$1;->val$event:Landroid/hardware/SensorEvent;

    .line 12
    .line 13
    iget-object v2, v2, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;

    .line 14
    .line 15
    invoke-virtual {v2}, Landroid/hardware/Sensor;->getType()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v2, ""

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-string v2, "type"

    .line 32
    .line 33
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lcom/tendcloud/tenddata/ee$a$1;->this$1:Lcom/tendcloud/tenddata/ee$a;

    .line 37
    .line 38
    iget-object v2, p0, Lcom/tendcloud/tenddata/ee$a$1;->val$event:Landroid/hardware/SensorEvent;

    .line 39
    .line 40
    iget-object v2, v2, Landroid/hardware/SensorEvent;->values:[F

    .line 41
    .line 42
    invoke-static {v1, v2}, Lcom/tendcloud/tenddata/ee$a;->access$000(Lcom/tendcloud/tenddata/ee$a;[F)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const-string v2, "values"

    .line 47
    .line 48
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Lcom/tendcloud/tenddata/ee$a$1;->val$event:Landroid/hardware/SensorEvent;

    .line 52
    .line 53
    iget-wide v1, v1, Landroid/hardware/SensorEvent;->timestamp:J

    .line 54
    .line 55
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    const-string v2, "ts"

    .line 60
    .line 61
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    iget-object v1, p0, Lcom/tendcloud/tenddata/ee$a$1;->val$event:Landroid/hardware/SensorEvent;

    .line 65
    .line 66
    iget v1, v1, Landroid/hardware/SensorEvent;->accuracy:I

    .line 67
    .line 68
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    const-string v2, "accuracy"

    .line 73
    .line 74
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    new-instance v1, Lcom/tendcloud/tenddata/el;

    .line 78
    .line 79
    invoke-direct {v1}, Lcom/tendcloud/tenddata/el;-><init>()V

    .line 80
    .line 81
    .line 82
    const-string v2, "env"

    .line 83
    .line 84
    iput-object v2, v1, Lcom/tendcloud/tenddata/el;->b:Ljava/lang/String;

    .line 85
    .line 86
    const-string v2, "sensorPoint"

    .line 87
    .line 88
    iput-object v2, v1, Lcom/tendcloud/tenddata/el;->c:Ljava/lang/String;

    .line 89
    .line 90
    iput-object v0, v1, Lcom/tendcloud/tenddata/el;->d:Ljava/util/Map;

    .line 91
    .line 92
    sget-object v0, Lcom/tendcloud/tenddata/a;->ENV:Lcom/tendcloud/tenddata/a;

    .line 93
    .line 94
    iput-object v0, v1, Lcom/tendcloud/tenddata/el;->a:Lcom/tendcloud/tenddata/a;

    .line 95
    .line 96
    invoke-static {}, Lcom/tendcloud/tenddata/cr;->a()Lcom/tendcloud/tenddata/cr;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {v0, v1}, Lcom/tendcloud/tenddata/cr;->post(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    return-void
.end method
