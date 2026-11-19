.class Lcom/tendcloud/tenddata/ee$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/ee;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tendcloud/tenddata/ee;


# direct methods
.method private constructor <init>(Lcom/tendcloud/tenddata/ee;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/ee$a;->this$0:Lcom/tendcloud/tenddata/ee;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/tendcloud/tenddata/ee;Lcom/tendcloud/tenddata/ee$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/ee$a;-><init>(Lcom/tendcloud/tenddata/ee;)V

    return-void
.end method

.method public static synthetic access$000(Lcom/tendcloud/tenddata/ee$a;[F)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/ee$a;->arrayToString([F)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private arrayToString([F)Ljava/lang/String;
    .locals 4

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    move v2, v1

    .line 10
    :goto_0
    array-length v3, p1

    .line 11
    if-ge v2, v3, :cond_0

    .line 12
    .line 13
    aget v3, p1, v2

    .line 14
    .line 15
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const/16 v3, 0x2c

    .line 19
    .line 20
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    add-int/lit8 v0, v0, -0x1

    .line 39
    .line 40
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1

    .line 45
    :cond_1
    const-string p1, ""

    .line 46
    .line 47
    return-object p1
.end method


# virtual methods
.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Lcom/tendcloud/tenddata/ee$a$1;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/tendcloud/tenddata/ee$a$1;-><init>(Lcom/tendcloud/tenddata/ee$a;Landroid/hardware/SensorEvent;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/tendcloud/tenddata/cq;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    :catchall_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/ee$a;->this$0:Lcom/tendcloud/tenddata/ee;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/tendcloud/tenddata/ee;->b(Lcom/tendcloud/tenddata/ee;)Landroid/hardware/SensorManager;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lcom/tendcloud/tenddata/ee$a;->this$0:Lcom/tendcloud/tenddata/ee;

    .line 16
    .line 17
    invoke-static {v1}, Lcom/tendcloud/tenddata/ee;->a(Lcom/tendcloud/tenddata/ee;)Lcom/tendcloud/tenddata/ee$a;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object p1, p1, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;

    .line 22
    .line 23
    invoke-virtual {v0, v1, p1}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
