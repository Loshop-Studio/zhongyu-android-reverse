.class public Lcom/tendcloud/tenddata/ee;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/ee$a;
    }
.end annotation


# static fields
.field private static volatile d:Lcom/tendcloud/tenddata/ee;


# instance fields
.field private a:Landroid/hardware/SensorManager;

.field private b:Lcom/tendcloud/tenddata/ee$a;

.field private c:[I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/cr;->a()Lcom/tendcloud/tenddata/cr;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/tendcloud/tenddata/ee;->b()Lcom/tendcloud/tenddata/ee;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Lcom/tendcloud/tenddata/cr;->register(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    :catchall_0
    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/tendcloud/tenddata/ee;->a:Landroid/hardware/SensorManager;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/tendcloud/tenddata/ee;->b:Lcom/tendcloud/tenddata/ee$a;

    .line 8
    .line 9
    const/4 v1, 0x6

    .line 10
    new-array v1, v1, [I

    .line 11
    .line 12
    fill-array-data v1, :array_0

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Lcom/tendcloud/tenddata/ee;->c:[I

    .line 16
    .line 17
    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 18
    .line 19
    const-string v2, "sensor"

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Landroid/hardware/SensorManager;

    .line 26
    .line 27
    iput-object v1, p0, Lcom/tendcloud/tenddata/ee;->a:Landroid/hardware/SensorManager;

    .line 28
    .line 29
    new-instance v1, Lcom/tendcloud/tenddata/ee$a;

    .line 30
    .line 31
    invoke-direct {v1, p0, v0}, Lcom/tendcloud/tenddata/ee$a;-><init>(Lcom/tendcloud/tenddata/ee;Lcom/tendcloud/tenddata/ee$1;)V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Lcom/tendcloud/tenddata/ee;->b:Lcom/tendcloud/tenddata/ee$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    :catchall_0
    return-void

    .line 37
    :array_0
    .array-data 4
        0xd
        0xc
        0xb
        0x5
        0x6
        0x2
    .end array-data
.end method

.method public static synthetic a(Lcom/tendcloud/tenddata/ee;)Lcom/tendcloud/tenddata/ee$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tendcloud/tenddata/ee;->b:Lcom/tendcloud/tenddata/ee$a;

    return-object p0
.end method

.method private a(II)V
    .locals 2

    .line 7
    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/ee;->a:Landroid/hardware/SensorManager;

    .line 8
    invoke-virtual {v0, p1}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 9
    iget-object v0, p0, Lcom/tendcloud/tenddata/ee;->a:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lcom/tendcloud/tenddata/ee;->b:Lcom/tendcloud/tenddata/ee$a;

    invoke-virtual {v0, v1, p1, p2}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-void
.end method

.method private a(Lcom/tendcloud/tenddata/ej;)V
    .locals 1

    .line 2
    :try_start_0
    iget v0, p1, Lcom/tendcloud/tenddata/ej;->c:I

    iget p1, p1, Lcom/tendcloud/tenddata/ej;->d:I

    invoke-direct {p0, v0, p1}, Lcom/tendcloud/tenddata/ee;->a(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static synthetic b(Lcom/tendcloud/tenddata/ee;)Landroid/hardware/SensorManager;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tendcloud/tenddata/ee;->a:Landroid/hardware/SensorManager;

    return-object p0
.end method

.method public static b()Lcom/tendcloud/tenddata/ee;
    .locals 2

    .line 2
    sget-object v0, Lcom/tendcloud/tenddata/ee;->d:Lcom/tendcloud/tenddata/ee;

    if-nez v0, :cond_1

    .line 3
    const-class v0, Lcom/tendcloud/tenddata/ef;

    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/ee;->d:Lcom/tendcloud/tenddata/ee;

    if-nez v1, :cond_0

    .line 5
    new-instance v1, Lcom/tendcloud/tenddata/ee;

    invoke-direct {v1}, Lcom/tendcloud/tenddata/ee;-><init>()V

    sput-object v1, Lcom/tendcloud/tenddata/ee;->d:Lcom/tendcloud/tenddata/ee;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 6
    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 7
    :cond_1
    :goto_2
    sget-object v0, Lcom/tendcloud/tenddata/ee;->d:Lcom/tendcloud/tenddata/ee;

    return-object v0
.end method

.method private c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/ee;->a:Landroid/hardware/SensorManager;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/tendcloud/tenddata/ee;->b:Lcom/tendcloud/tenddata/ee$a;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    const/4 v0, 0x0

    .line 3
    :goto_0
    :try_start_0
    iget-object v1, p0, Lcom/tendcloud/tenddata/ee;->c:[I

    array-length v2, v1

    if-ge v0, v2, :cond_2

    .line 4
    aget v1, v1, v0

    const/16 v2, 0xd

    if-eq v1, v2, :cond_0

    const/16 v2, 0xc

    if-ne v1, v2, :cond_1

    :cond_0
    const/16 v1, 0xe

    .line 5
    invoke-static {v1}, Lcom/tendcloud/tenddata/cq;->a(I)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    .line 6
    :cond_1
    iget-object v1, p0, Lcom/tendcloud/tenddata/ee;->c:[I

    aget v1, v1, v0

    const/4 v2, 0x3

    invoke-direct {p0, v1, v2}, Lcom/tendcloud/tenddata/ee;->a(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catchall_0
    :cond_2
    return-void
.end method

.method public final onTDEBEventSensor(Landroid/util/SparseArray;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "Lcom/tendcloud/tenddata/ej;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    :try_start_0
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_2

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lcom/tendcloud/tenddata/ej;

    .line 13
    .line 14
    iget v2, v1, Lcom/tendcloud/tenddata/ej;->c:I

    .line 15
    .line 16
    const/16 v3, 0xc

    .line 17
    .line 18
    if-eq v2, v3, :cond_1

    .line 19
    .line 20
    const/16 v3, 0xd

    .line 21
    .line 22
    if-eq v2, v3, :cond_0

    .line 23
    .line 24
    iget v1, v1, Lcom/tendcloud/tenddata/ej;->d:I

    .line 25
    .line 26
    invoke-direct {p0, v2, v1}, Lcom/tendcloud/tenddata/ee;->a(II)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    invoke-direct {p0, v1}, Lcom/tendcloud/tenddata/ee;->a(Lcom/tendcloud/tenddata/ej;)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-direct {p0, v1}, Lcom/tendcloud/tenddata/ee;->a(Lcom/tendcloud/tenddata/ej;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    :cond_2
    return-void
.end method
