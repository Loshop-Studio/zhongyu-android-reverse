.class public Lcom/taobao/accs/data/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/String;",
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;>;"
        }
    .end annotation
.end field

.field public b:I

.field protected c:Lcom/taobao/accs/ut/monitor/TrafficsMonitor;

.field public d:Lcom/taobao/accs/flowcontrol/FlowControl;

.field public e:Ljava/lang/String;

.field private f:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Lcom/taobao/accs/data/Message$a;",
            "Lcom/taobao/accs/data/Message;",
            ">;"
        }
    .end annotation
.end field

.field private g:Z

.field private h:Landroid/content/Context;

.field private i:Lcom/taobao/accs/ut/a/d;

.field private j:Lcom/taobao/accs/data/Message;

.field private k:Lcom/taobao/accs/net/b;

.field private l:Ljava/lang/String;

.field private m:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private n:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/taobao/accs/data/a;",
            ">;"
        }
    .end annotation
.end field

.field private o:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/taobao/accs/net/b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/taobao/accs/data/d;->f:Ljava/util/concurrent/ConcurrentMap;

    .line 3
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/taobao/accs/data/d;->a:Ljava/util/concurrent/ConcurrentMap;

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/taobao/accs/data/d;->g:Z

    const-string v0, ""

    .line 5
    iput-object v0, p0, Lcom/taobao/accs/data/d;->e:Ljava/lang/String;

    const-string v0, "MsgRecv_"

    .line 6
    iput-object v0, p0, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    .line 7
    new-instance v0, Lcom/taobao/accs/data/MessageHandler$1;

    invoke-direct {v0, p0}, Lcom/taobao/accs/data/MessageHandler$1;-><init>(Lcom/taobao/accs/data/d;)V

    iput-object v0, p0, Lcom/taobao/accs/data/d;->m:Ljava/util/LinkedHashMap;

    .line 8
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/taobao/accs/data/d;->n:Ljava/util/Map;

    .line 9
    new-instance v0, Lcom/taobao/accs/data/f;

    invoke-direct {v0, p0}, Lcom/taobao/accs/data/f;-><init>(Lcom/taobao/accs/data/d;)V

    iput-object v0, p0, Lcom/taobao/accs/data/d;->o:Ljava/lang/Runnable;

    .line 10
    iput-object p1, p0, Lcom/taobao/accs/data/d;->h:Landroid/content/Context;

    .line 11
    iput-object p2, p0, Lcom/taobao/accs/data/d;->k:Lcom/taobao/accs/net/b;

    .line 12
    new-instance v0, Lcom/taobao/accs/ut/monitor/TrafficsMonitor;

    invoke-direct {v0, p1}, Lcom/taobao/accs/ut/monitor/TrafficsMonitor;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/taobao/accs/data/d;->c:Lcom/taobao/accs/ut/monitor/TrafficsMonitor;

    .line 13
    new-instance p1, Lcom/taobao/accs/flowcontrol/FlowControl;

    iget-object v0, p0, Lcom/taobao/accs/data/d;->h:Landroid/content/Context;

    invoke-direct {p1, v0}, Lcom/taobao/accs/flowcontrol/FlowControl;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/taobao/accs/data/d;->d:Lcom/taobao/accs/flowcontrol/FlowControl;

    if-nez p2, :cond_0

    .line 14
    iget-object p1, p0, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p2, Lcom/taobao/accs/net/b;->m:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    .line 15
    invoke-direct {p0}, Lcom/taobao/accs/data/d;->i()V

    .line 16
    invoke-virtual {p0}, Lcom/taobao/accs/data/d;->h()V

    return-void
.end method

.method private a(Lcom/taobao/accs/utl/h;)Ljava/util/Map;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/taobao/accs/utl/h;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    const/4 v1, 0x0

    .line 217
    :try_start_0
    invoke-virtual {p1}, Lcom/taobao/accs/utl/h;->b()I

    move-result v2

    .line 218
    sget-object v3, Lcom/taobao/accs/utl/ALog$Level;->D:Lcom/taobao/accs/utl/ALog$Level;

    invoke-static {v3}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 219
    iget-object v3, p0, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "extHeaderLen:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-array v5, v1, [Ljava/lang/Object;

    invoke-static {v3, v4, v5}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    const/4 v3, 0x0

    :cond_2
    :goto_0
    if-ge v3, v2, :cond_4

    .line 220
    invoke-virtual {p1}, Lcom/taobao/accs/utl/h;->b()I

    move-result v4

    add-int/lit8 v3, v3, 0x2

    const v5, 0xfc00

    and-int/2addr v5, v4

    shr-int/lit8 v5, v5, 0xa

    and-int/lit16 v4, v4, 0x3ff

    .line 221
    invoke-virtual {p1, v4}, Lcom/taobao/accs/utl/h;->a(I)Ljava/lang/String;

    move-result-object v6

    add-int/2addr v3, v4

    if-nez v0, :cond_3

    .line 222
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    move-object v0, v4

    .line 223
    :cond_3
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    sget-object v4, Lcom/taobao/accs/utl/ALog$Level;->D:Lcom/taobao/accs/utl/ALog$Level;

    invoke-static {v4}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 225
    iget-object v4, p0, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    const-string v7, ""

    const/4 v8, 0x4

    new-array v8, v8, [Ljava/lang/Object;

    const-string v9, "extHeaderType"

    aput-object v9, v8, v1

    const/4 v9, 0x1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v8, v9

    const-string v5, "value"

    const/4 v9, 0x2

    aput-object v5, v8, v9

    const/4 v5, 0x3

    aput-object v6, v8, v5

    invoke-static {v4, v7, v8}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 226
    iget-object v2, p0, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    new-array v1, v1, [Ljava/lang/Object;

    const-string v3, "parseExtHeader"

    invoke-static {v2, v3, p1, v1}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    :cond_4
    return-object v0
.end method

.method private a(I[BLjava/lang/String;I)V
    .locals 45
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v7, p0

    move/from16 v8, p1

    move-object/from16 v9, p2

    move-object/from16 v14, p3

    const-string v15, "1"

    const-string v13, "send_fail"

    const-string v12, "accs"

    const-string v11, ""

    .line 26
    new-instance v1, Lcom/taobao/accs/utl/h;

    invoke-direct {v1, v9}, Lcom/taobao/accs/utl/h;-><init>([B)V

    .line 27
    invoke-virtual {v1}, Lcom/taobao/accs/utl/h;->b()I

    move-result v0

    int-to-long v5, v0

    .line 28
    sget-object v0, Lcom/taobao/accs/utl/ALog$Level;->D:Lcom/taobao/accs/utl/ALog$Level;

    invoke-static {v0}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    move-result v2

    const/4 v10, 0x0

    if-eqz v2, :cond_0

    .line 29
    iget-object v2, v7, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "flag:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    long-to-int v4, v5

    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v4, v10, [Ljava/lang/Object;

    invoke-static {v2, v3, v4}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 30
    :cond_0
    invoke-virtual {v1}, Lcom/taobao/accs/utl/h;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/taobao/accs/utl/h;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 31
    invoke-static {v0}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 32
    iget-object v2, v7, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "target:"

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v17, v13

    const/4 v10, 0x0

    new-array v13, v10, [Ljava/lang/Object;

    invoke-static {v2, v3, v13}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    move-object/from16 v17, v13

    .line 33
    :goto_0
    invoke-virtual {v1}, Lcom/taobao/accs/utl/h;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/taobao/accs/utl/h;->a(I)Ljava/lang/String;

    move-result-object v10

    .line 34
    invoke-static {v0}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 35
    iget-object v2, v7, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "source:"

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v18, v15

    const/4 v13, 0x0

    new-array v15, v13, [Ljava/lang/Object;

    invoke-static {v2, v3, v15}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    move-object/from16 v18, v15

    .line 36
    :goto_1
    :try_start_0
    invoke-virtual {v1}, Lcom/taobao/accs/utl/h;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/taobao/accs/utl/h;->a(I)Ljava/lang/String;

    move-result-object v15
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_19

    .line 37
    invoke-static {v0}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 38
    iget-object v2, v7, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "dataId:"

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v19, v12

    const/4 v13, 0x0

    new-array v12, v13, [Ljava/lang/Object;

    invoke-static {v2, v3, v12}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    move-object/from16 v19, v12

    .line 39
    :goto_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 40
    invoke-virtual {v1}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v2

    const/4 v3, 0x2

    const/4 v13, 0x1

    if-lez v2, :cond_9

    move/from16 v2, p4

    if-ne v2, v3, :cond_5

    .line 41
    invoke-direct {v7, v1}, Lcom/taobao/accs/data/d;->a(Lcom/taobao/accs/utl/h;)Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_4

    const/16 v21, 0x10

    .line 42
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x11

    .line 43
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    move-object v3, v2

    const/4 v2, 0x1

    goto :goto_3

    :cond_4
    move-object v3, v2

    const/4 v2, 0x0

    goto :goto_3

    :cond_5
    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_3
    if-eqz v8, :cond_8

    if-eqz v2, :cond_6

    goto :goto_4

    :cond_6
    if-ne v8, v13, :cond_7

    .line 44
    invoke-direct {v7, v1}, Lcom/taobao/accs/data/d;->a(Ljava/io/InputStream;)[B

    move-result-object v21

    goto :goto_5

    :cond_7
    move/from16 v21, v2

    const/4 v2, 0x0

    goto :goto_6

    .line 45
    :cond_8
    :goto_4
    invoke-virtual {v1}, Lcom/taobao/accs/utl/h;->c()[B

    move-result-object v21

    :goto_5
    move-object/from16 v44, v21

    move/from16 v21, v2

    move-object/from16 v2, v44

    goto :goto_6

    :cond_9
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/16 v21, 0x0

    .line 46
    :goto_6
    invoke-virtual {v1}, Ljava/io/ByteArrayInputStream;->close()V

    const-string v1, "handleMessage"

    if-nez v2, :cond_a

    .line 47
    :try_start_1
    iget-object v0, v7, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    const-string v13, "oriData is null"

    move-object/from16 v24, v3

    const/4 v3, 0x0

    new-array v8, v3, [Ljava/lang/Object;

    invoke-static {v0, v13, v8}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_b

    :catch_0
    move-exception v0

    move-object v2, v11

    :goto_7
    move-object v4, v15

    move-object/from16 v6, v17

    move-object/from16 v43, v18

    move-object/from16 v5, v19

    :goto_8
    const/4 v3, 0x1

    :goto_9
    const/4 v9, 0x0

    goto/16 :goto_27

    :cond_a
    move-object/from16 v24, v3

    .line 48
    invoke-static {v0}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz v0, :cond_b

    .line 49
    :try_start_2
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>([B)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_a

    .line 50
    :catch_1
    :try_start_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "binary "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v3, v2

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 51
    :goto_a
    iget-object v3, v7, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "oriData:"

    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v8, 0x0

    new-array v13, v8, [Ljava/lang/Object;

    invoke-static {v3, v0, v13}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_b
    :goto_b
    const/16 v0, 0xf

    shr-long v25, v5, v0

    const-wide/16 v27, 0x1

    move-object v8, v12

    and-long v12, v25, v27

    long-to-int v0, v12

    .line 52
    invoke-static {v0}, Lcom/taobao/accs/data/Message$c;->a(I)I

    move-result v12
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    const/16 v0, 0xd

    shr-long v25, v5, v0

    const-wide/16 v29, 0x3

    move-object/from16 v31, v10

    move-object v13, v11

    and-long v10, v25, v29

    long-to-int v0, v10

    .line 53
    :try_start_4
    invoke-static {v0}, Lcom/taobao/accs/data/Message$ReqType;->valueOf(I)Lcom/taobao/accs/data/Message$ReqType;

    move-result-object v10
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_18

    const/16 v0, 0xc

    shr-long v25, v5, v0

    move-object v11, v13

    and-long v13, v25, v27

    long-to-int v3, v13

    const/16 v0, 0xb

    shr-long v13, v5, v0

    and-long v13, v13, v27

    long-to-int v0, v13

    if-nez v0, :cond_c

    const/4 v13, 0x0

    goto :goto_c

    :cond_c
    const/4 v13, 0x1

    :goto_c
    const/4 v14, 0x6

    shr-long v25, v5, v14

    move-object/from16 v29, v15

    and-long v14, v25, v27

    long-to-int v0, v14

    const/4 v14, 0x1

    if-ne v0, v14, :cond_d

    const/4 v15, 0x1

    goto :goto_d

    :cond_d
    const/4 v15, 0x0

    .line 54
    :goto_d
    :try_start_5
    sget-object v0, Lcom/taobao/accs/utl/ALog$Level;->I:Lcom/taobao/accs/utl/ALog$Level;

    invoke-static {v0}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    move-result v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_17

    const-string v14, "target"

    move-object/from16 v25, v11

    const-string v11, "dataId"

    if-eqz v0, :cond_e

    .line 55
    :try_start_6
    iget-object v0, v7, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    move-wide/from16 v32, v5

    const/16 v5, 0xa

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v11, v5, v6

    const/4 v6, 0x1

    aput-object v29, v5, v6

    const-string v6, "type"

    const/16 v22, 0x2

    aput-object v6, v5, v22

    .line 56
    invoke-static {v12}, Lcom/taobao/accs/data/Message$c;->b(I)Ljava/lang/String;

    move-result-object v6

    const/16 v27, 0x3

    aput-object v6, v5, v27

    const-string v6, "reqType"

    const/16 v26, 0x4

    aput-object v6, v5, v26

    .line 57
    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    const/16 v28, 0x5

    aput-object v6, v5, v28

    const-string v6, "resType"

    const/16 v28, 0x6

    aput-object v6, v5, v28

    const/4 v6, 0x7

    .line 58
    invoke-static {v13}, Lcom/taobao/accs/data/Message$b;->a(I)Ljava/lang/String;

    move-result-object v28

    aput-object v28, v5, v6

    const/16 v6, 0x8

    aput-object v14, v5, v6

    const/16 v6, 0x9

    aput-object v4, v5, v6

    .line 59
    invoke-static {v0, v1, v5}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_f

    :catch_2
    move-exception v0

    move-object/from16 v6, v17

    move-object/from16 v43, v18

    move-object/from16 v5, v19

    :goto_e
    move-object/from16 v2, v25

    goto/16 :goto_26

    :cond_e
    move-wide/from16 v32, v5

    :goto_f
    const/4 v5, 0x1

    if-ne v12, v5, :cond_15

    .line 60
    sget-object v0, Lcom/taobao/accs/data/Message$ReqType;->ACK:Lcom/taobao/accs/data/Message$ReqType;

    if-eq v10, v0, :cond_f

    sget-object v0, Lcom/taobao/accs/data/Message$ReqType;->RES:Lcom/taobao/accs/data/Message$ReqType;

    if-ne v10, v0, :cond_15

    .line 61
    :cond_f
    iget-object v0, v7, Lcom/taobao/accs/data/d;->f:Ljava/util/concurrent/ConcurrentMap;

    new-instance v5, Lcom/taobao/accs/data/Message$a;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    move-object/from16 v28, v4

    move-object/from16 v6, v29

    const/4 v4, 0x0

    :try_start_7
    invoke-direct {v5, v4, v6}, Lcom/taobao/accs/data/Message$a;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v5}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/taobao/accs/data/Message;

    if-eqz v5, :cond_14

    .line 62
    sget-object v0, Lcom/taobao/accs/utl/ALog$Level;->D:Lcom/taobao/accs/utl/ALog$Level;

    invoke-static {v0}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 63
    iget-object v0, v7, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    const-string v4, "handleMessage reqMessage not null"
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5

    move-object/from16 v29, v6

    move/from16 v34, v13

    const/4 v6, 0x0

    :try_start_8
    new-array v13, v6, [Ljava/lang/Object;

    invoke-static {v0, v4, v13}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_10

    :cond_10
    move-object/from16 v29, v6

    move/from16 v34, v13

    .line 64
    :goto_10
    sget-object v0, Lcom/taobao/accs/AccsErrorCode;->SUCCESS:Lcom/alibaba/sdk/android/error/ErrorCode;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2

    const/4 v4, 0x1

    if-ne v3, v4, :cond_11

    .line 65
    :try_start_9
    new-instance v0, Lorg/json/JSONObject;

    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, v2}, Ljava/lang/String;-><init>([B)V

    invoke-direct {v0, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v4, "code"

    .line 66
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    .line 67
    invoke-static {v0}, Lcom/taobao/accs/AccsErrorCode;->parseHttpCode(I)Lcom/alibaba/sdk/android/error/ErrorCode;

    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    goto :goto_11

    :catchall_0
    move-exception v0

    .line 68
    :try_start_a
    sget-object v4, Lcom/taobao/accs/AccsErrorCode;->RESPONSE_PARSE_ERROR:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v4}, Lcom/alibaba/sdk/android/error/ErrorCode;->copy()Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "data:"

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v13, Ljava/lang/String;

    invoke-direct {v13, v2}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, ", tr:"

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->detail(Ljava/lang/String;)Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->build()Lcom/alibaba/sdk/android/error/ErrorCode;

    move-result-object v0

    .line 69
    :goto_11
    invoke-virtual {v0}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v4

    sget-object v6, Lcom/taobao/accs/AccsErrorCode;->SUCCESS:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v6}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v6

    if-eq v4, v6, :cond_11

    .line 70
    iget-object v4, v7, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    const/4 v6, 0x2

    new-array v13, v6, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/16 v16, 0x0

    aput-object v3, v13, v16
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_2

    const/4 v3, 0x1

    :try_start_b
    aput-object v0, v13, v3
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_3

    :try_start_c
    invoke-static {v4, v1, v13}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_12

    :catch_3
    move-exception v0

    move-object/from16 v6, v17

    move-object/from16 v43, v18

    move-object/from16 v5, v19

    move-object/from16 v2, v25

    move-object/from16 v4, v29

    goto/16 :goto_9

    :cond_11
    const/4 v6, 0x2

    :goto_12
    move-object v3, v0

    .line 71
    invoke-virtual {v5}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    move-result-object v0

    if-eqz v0, :cond_12

    .line 72
    invoke-virtual {v5}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;->onRecAck()V

    .line 73
    :cond_12
    sget-object v0, Lcom/taobao/accs/data/Message$ReqType;->RES:Lcom/taobao/accs/data/Message$ReqType;
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_2

    if-ne v10, v0, :cond_13

    move-object v13, v1

    move-object/from16 v1, p0

    move-object v4, v2

    move-object v2, v5

    move-object/from16 v22, v24

    move-object/from16 v24, v13

    move-object/from16 v13, v28

    move-object/from16 v28, v4

    move-object v4, v10

    move-wide/from16 v35, v32

    move/from16 v32, v15

    move-object v15, v5

    move-object/from16 v5, v28

    move-object/from16 v33, v14

    move-object/from16 v14, v29

    move-object/from16 v29, v8

    const/4 v8, 0x2

    move-object/from16 v6, v22

    .line 74
    :try_start_d
    invoke-virtual/range {v1 .. v6}, Lcom/taobao/accs/data/d;->a(Lcom/taobao/accs/data/Message;Lcom/alibaba/sdk/android/error/ErrorCode;Lcom/taobao/accs/data/Message$ReqType;[BLjava/util/Map;)V

    move-object/from16 v5, v22

    goto :goto_13

    :cond_13
    move-object/from16 v13, v28

    move-wide/from16 v35, v32

    move-object/from16 v28, v2

    move-object/from16 v33, v14

    move/from16 v32, v15

    move-object/from16 v14, v29

    move-object v15, v5

    move-object/from16 v29, v8

    move-object/from16 v5, v24

    const/4 v8, 0x2

    move-object/from16 v24, v1

    .line 75
    invoke-virtual {v7, v15, v3, v5}, Lcom/taobao/accs/data/d;->a(Lcom/taobao/accs/data/Message;Lcom/alibaba/sdk/android/error/ErrorCode;Ljava/util/Map;)V

    .line 76
    :goto_13
    new-instance v0, Lcom/taobao/accs/ut/monitor/TrafficsMonitor$a;

    iget-object v2, v15, Lcom/taobao/accs/data/Message;->H:Ljava/lang/String;

    invoke-static {}, Lanet/channel/GlobalAppRuntimeInfo;->isAppBackground()Z

    move-result v3

    array-length v1, v9

    int-to-long v8, v1

    move-object v1, v0

    move-object/from16 v4, p3

    move-object v15, v5

    move-wide v5, v8

    invoke-direct/range {v1 .. v6}, Lcom/taobao/accs/ut/monitor/TrafficsMonitor$a;-><init>(Ljava/lang/String;ZLjava/lang/String;J)V

    invoke-virtual {v7, v0}, Lcom/taobao/accs/data/d;->a(Lcom/taobao/accs/ut/monitor/TrafficsMonitor$a;)V

    goto/16 :goto_16

    :cond_14
    move-object/from16 v29, v8

    move/from16 v34, v13

    move-object/from16 v13, v28

    move-wide/from16 v35, v32

    move-object/from16 v28, v2

    move-object/from16 v33, v14

    move/from16 v32, v15

    move-object/from16 v15, v24

    move-object/from16 v24, v1

    move-object v14, v6

    .line 77
    iget-object v0, v7, Lcom/taobao/accs/data/d;->k:Lcom/taobao/accs/net/b;
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_7

    const/4 v1, 0x0

    .line 78
    :try_start_e
    invoke-virtual {v0, v1}, Lcom/taobao/accs/net/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_4

    const/4 v1, 0x5

    :try_start_f
    invoke-static {v14, v13, v2, v1}, Lcom/taobao/accs/data/Message;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/taobao/accs/data/Message;

    move-result-object v2

    const/4 v1, 0x1

    .line 79
    invoke-virtual {v0, v2, v1}, Lcom/taobao/accs/net/b;->b(Lcom/taobao/accs/data/Message;Z)V

    .line 80
    iget-object v0, v7, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    const-string v2, "handleMessage data ack/res reqMessage is null"

    const/4 v3, 0x2

    new-array v4, v3, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v11, v4, v3

    aput-object v14, v4, v1

    invoke-static {v0, v2, v4}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_16

    :catch_4
    move-exception v0

    move-object v9, v1

    :goto_14
    move-object v4, v14

    move-object/from16 v6, v17

    move-object/from16 v43, v18

    move-object/from16 v5, v19

    move-object/from16 v1, v24

    move-object/from16 v2, v25

    :goto_15
    const/4 v3, 0x1

    goto/16 :goto_27

    :catch_5
    move-exception v0

    move-object v4, v6

    move-object/from16 v6, v17

    move-object/from16 v43, v18

    move-object/from16 v5, v19

    goto/16 :goto_19

    :cond_15
    move-object/from16 v28, v2

    move/from16 v34, v13

    move-wide/from16 v35, v32

    move-object v13, v4

    move-object/from16 v33, v14

    move/from16 v32, v15

    move-object/from16 v15, v24

    move-object/from16 v14, v29

    move-object/from16 v24, v1

    move-object/from16 v29, v8

    :goto_16
    if-nez v12, :cond_18

    .line 81
    sget-object v0, Lcom/taobao/accs/data/Message$ReqType;->RES:Lcom/taobao/accs/data/Message$ReqType;

    if-ne v10, v0, :cond_18

    .line 82
    iget-object v0, v7, Lcom/taobao/accs/data/d;->f:Ljava/util/concurrent/ConcurrentMap;

    new-instance v1, Lcom/taobao/accs/data/Message$a;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v14}, Lcom/taobao/accs/data/Message$a;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/taobao/accs/data/Message;

    if-eqz v0, :cond_16

    move-object/from16 v1, p2

    move-object/from16 v9, p3

    move-object/from16 v2, v28

    .line 83
    invoke-direct {v7, v0, v2, v1, v9}, Lcom/taobao/accs/data/d;->a(Lcom/taobao/accs/data/Message;[B[BLjava/lang/String;)V

    return-void

    :cond_16
    move-object/from16 v1, p2

    move-object/from16 v9, p3

    move-object/from16 v2, v28

    const-string v0, "4|sal|st"

    move-object/from16 v8, v31

    .line 84
    invoke-virtual {v8, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_17

    .line 85
    iget-object v0, v7, Lcom/taobao/accs/data/d;->k:Lcom/taobao/accs/net/b;
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_7

    const/4 v3, 0x0

    .line 86
    :try_start_10
    invoke-virtual {v0, v3}, Lcom/taobao/accs/net/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_6

    const/4 v3, 0x5

    :try_start_11
    invoke-static {v14, v13, v4, v3}, Lcom/taobao/accs/data/Message;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/taobao/accs/data/Message;

    move-result-object v4
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_7

    const/4 v3, 0x1

    .line 87
    :try_start_12
    invoke-virtual {v0, v4, v3}, Lcom/taobao/accs/net/b;->b(Lcom/taobao/accs/data/Message;Z)V
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_16

    goto :goto_17

    :catch_6
    move-exception v0

    move-object v9, v3

    goto :goto_14

    .line 88
    :cond_17
    :goto_17
    :try_start_13
    iget-object v0, v7, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    const-string v3, "handleMessage contorl ACK reqMessage is null"

    const/4 v4, 0x2

    new-array v5, v4, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v11, v5, v4

    const/4 v4, 0x1

    aput-object v14, v5, v4

    invoke-static {v0, v3, v5}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    sget-object v0, Lcom/taobao/accs/utl/ALog$Level;->D:Lcom/taobao/accs/utl/ALog$Level;

    invoke-static {v0}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    move-result v0

    if-eqz v0, :cond_19

    .line 90
    iget-object v0, v7, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    const-string v3, "handleMessage not handled"

    const/4 v4, 0x2

    new-array v5, v4, [Ljava/lang/Object;

    const-string v4, "body"

    const/4 v6, 0x0

    aput-object v4, v5, v6

    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, v2}, Ljava/lang/String;-><init>([B)V

    const/4 v6, 0x1

    aput-object v4, v5, v6

    invoke-static {v0, v3, v5}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_7

    goto :goto_1a

    :catch_7
    move-exception v0

    move-object v4, v14

    move-object/from16 v6, v17

    move-object/from16 v43, v18

    move-object/from16 v5, v19

    :goto_18
    move-object/from16 v1, v24

    :goto_19
    move-object/from16 v2, v25

    goto/16 :goto_8

    :cond_18
    move-object/from16 v1, p2

    move-object/from16 v9, p3

    move-object/from16 v2, v28

    move-object/from16 v8, v31

    :cond_19
    :goto_1a
    const/4 v3, 0x1

    if-ne v12, v3, :cond_2b

    .line 91
    :try_start_14
    sget-object v0, Lcom/taobao/accs/data/Message$ReqType;->DATA:Lcom/taobao/accs/data/Message$ReqType;

    if-ne v10, v0, :cond_2b

    if-nez v13, :cond_1a

    .line 92
    iget-object v0, v7, Lcom/taobao/accs/data/d;->k:Lcom/taobao/accs/net/b;
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_16

    const/4 v1, 0x0

    :try_start_15
    invoke-virtual {v0, v1}, Lcom/taobao/accs/net/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_9

    move-object/from16 v12, v25

    :try_start_16
    invoke-static {v14, v12, v2, v3}, Lcom/taobao/accs/data/Message;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/taobao/accs/data/Message;

    move-result-object v1

    invoke-virtual {v0, v1, v3}, Lcom/taobao/accs/net/b;->b(Lcom/taobao/accs/data/Message;Z)V
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_8

    return-void

    :catch_8
    move-exception v0

    move-object v2, v12

    move-object v4, v14

    move-object/from16 v6, v17

    move-object/from16 v43, v18

    move-object/from16 v5, v19

    move-object/from16 v1, v24

    goto/16 :goto_9

    :catch_9
    move-exception v0

    move-object v9, v1

    move-object v4, v14

    move-object/from16 v6, v17

    move-object/from16 v43, v18

    move-object/from16 v5, v19

    move-object/from16 v1, v24

    move-object/from16 v2, v25

    goto/16 :goto_27

    :cond_1a
    move-object/from16 v12, v25

    :try_start_17
    const-string v0, "\\|"

    .line 93
    invoke-virtual {v13, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 94
    array-length v3, v0

    const/4 v4, 0x2

    if-ge v3, v4, :cond_1b

    .line 95
    iget-object v0, v7, Lcom/taobao/accs/data/d;->k:Lcom/taobao/accs/net/b;
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_15

    const/4 v1, 0x0

    :try_start_18
    invoke-virtual {v0, v1}, Lcom/taobao/accs/net/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_a

    const/4 v1, 0x1

    :try_start_19
    invoke-static {v14, v12, v2, v1}, Lcom/taobao/accs/data/Message;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/taobao/accs/data/Message;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lcom/taobao/accs/net/b;->b(Lcom/taobao/accs/data/Message;Z)V

    return-void

    :catch_a
    move-exception v0

    move-object v9, v1

    move-object v2, v12

    move-object v4, v14

    move-object/from16 v6, v17

    move-object/from16 v43, v18

    move-object/from16 v5, v19

    move-object/from16 v1, v24

    goto/16 :goto_15

    .line 96
    :cond_1b
    sget-object v3, Lcom/taobao/accs/utl/ALog$Level;->D:Lcom/taobao/accs/utl/ALog$Level;

    invoke-static {v3}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    move-result v4

    if-eqz v4, :cond_1c

    .line 97
    iget-object v4, v7, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    const-string v5, "handleMessage onPush"

    const/4 v6, 0x2

    new-array v10, v6, [Ljava/lang/Object;

    const-string v6, "isBurstData"

    const/16 v16, 0x0

    aput-object v6, v10, v16

    invoke-static/range {v21 .. v21}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    const/16 v23, 0x1

    aput-object v6, v10, v23

    invoke-static {v4, v5, v10}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    :cond_1c
    iget-object v4, v7, Lcom/taobao/accs/data/d;->i:Lcom/taobao/accs/ut/a/d;

    if-eqz v4, :cond_1d

    .line 99
    invoke-virtual {v4}, Lcom/taobao/accs/ut/a/d;->a()V

    .line 100
    :cond_1d
    new-instance v4, Lcom/taobao/accs/ut/a/d;

    invoke-direct {v4}, Lcom/taobao/accs/ut/a/d;-><init>()V

    iput-object v4, v7, Lcom/taobao/accs/data/d;->i:Lcom/taobao/accs/ut/a/d;

    .line 101
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Lcom/taobao/accs/ut/a/d;->c:Ljava/lang/String;

    .line 102
    iget-object v4, v7, Lcom/taobao/accs/data/d;->h:Landroid/content/Context;

    const/4 v5, 0x1

    aget-object v6, v0, v5

    invoke-static {v4, v6}, Lcom/taobao/accs/utl/UtilityImpl;->c(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2a

    .line 103
    array-length v4, v0

    const/4 v5, 0x3

    if-lt v4, v5, :cond_1e

    const/4 v4, 0x2

    aget-object v5, v0, v4

    move-object v10, v5

    goto :goto_1b

    :cond_1e
    const/4 v10, 0x0

    .line 104
    :goto_1b
    iget-object v4, v7, Lcom/taobao/accs/data/d;->i:Lcom/taobao/accs/ut/a/d;

    iput-object v10, v4, Lcom/taobao/accs/ut/a/d;->e:Ljava/lang/String;

    move-object/from16 v4, v29

    .line 105
    invoke-direct {v7, v4}, Lcom/taobao/accs/data/d;->c(Ljava/lang/String;)Z

    move-result v5
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_15

    move-object/from16 v25, v12

    move-object/from16 v28, v13

    if-eqz v5, :cond_1f

    .line 106
    :try_start_1a
    iget-object v0, v7, Lcom/taobao/accs/data/d;->k:Lcom/taobao/accs/net/b;
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_7

    const/4 v1, 0x0

    :try_start_1b
    invoke-virtual {v0, v1}, Lcom/taobao/accs/net/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_4

    const/4 v1, 0x2

    :try_start_1c
    invoke-static {v14, v10, v2, v1}, Lcom/taobao/accs/data/Message;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/taobao/accs/data/Message;

    move-result-object v2
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_1c} :catch_7

    const/4 v3, 0x1

    :try_start_1d
    invoke-virtual {v0, v2, v3}, Lcom/taobao/accs/net/b;->b(Lcom/taobao/accs/data/Message;Z)V

    .line 107
    iget-object v0, v7, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    const-string v2, "handleMessage msg duplicate"

    new-array v4, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v11, v4, v1

    aput-object v14, v4, v3

    invoke-static {v0, v2, v4}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    iget-object v0, v7, Lcom/taobao/accs/data/d;->i:Lcom/taobao/accs/ut/a/d;

    iput-boolean v3, v0, Lcom/taobao/accs/ut/a/d;->h:Z
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_1d} :catch_16

    move-object/from16 v31, v8

    move-object/from16 v20, v14

    move-object/from16 v12, v19

    move-object/from16 v27, v25

    move-object/from16 v19, v28

    move/from16 v21, v32

    move/from16 v1, v34

    move-wide/from16 v13, v35

    const/4 v2, 0x1

    const-wide/16 v8, 0x0

    const/16 v28, 0x0

    goto/16 :goto_21

    :cond_1f
    if-eqz v21, :cond_22

    .line 109
    :try_start_1e
    invoke-direct {v7, v4, v15, v2}, Lcom/taobao/accs/data/d;->a(Ljava/lang/String;Ljava/util/Map;[B)[B

    move-result-object v2

    if-nez v2, :cond_20

    .line 110
    iget-object v0, v7, Lcom/taobao/accs/data/d;->k:Lcom/taobao/accs/net/b;
    :try_end_1e
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_1e} :catch_7

    const/4 v5, 0x0

    :try_start_1f
    invoke-virtual {v0, v5}, Lcom/taobao/accs/net/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v6, 0x1

    invoke-static {v14, v10, v1, v6}, Lcom/taobao/accs/data/Message;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/taobao/accs/data/Message;

    move-result-object v1

    invoke-virtual {v0, v1, v6}, Lcom/taobao/accs/net/b;->b(Lcom/taobao/accs/data/Message;Z)V
    :try_end_1f
    .catch Ljava/lang/Exception; {:try_start_1f .. :try_end_1f} :catch_b

    return-void

    :catch_b
    move-exception v0

    move-object v9, v5

    goto/16 :goto_14

    :cond_20
    move/from16 v5, p1

    const/4 v6, 0x1

    if-ne v5, v6, :cond_22

    .line 111
    :try_start_20
    new-instance v5, Lcom/taobao/accs/utl/h;

    invoke-direct {v5, v2}, Lcom/taobao/accs/utl/h;-><init>([B)V

    .line 112
    invoke-direct {v7, v5}, Lcom/taobao/accs/data/d;->a(Ljava/io/InputStream;)[B

    move-result-object v2

    .line 113
    invoke-static {v3}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    move-result v3

    if-eqz v3, :cond_21

    .line 114
    iget-object v3, v7, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    const-string v6, "handleMessage gzip completeOriData"

    const/4 v12, 0x4

    new-array v13, v12, [Ljava/lang/Object;

    const/4 v12, 0x0

    aput-object v11, v13, v12

    const/4 v12, 0x1

    aput-object v4, v13, v12

    const-string v12, "length"

    const/16 v21, 0x2

    aput-object v12, v13, v21

    array-length v12, v2

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    const/16 v21, 0x3

    aput-object v12, v13, v21

    invoke-static {v3, v6, v13}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    :cond_21
    invoke-virtual {v5}, Ljava/io/ByteArrayInputStream;->close()V

    .line 116
    :cond_22
    invoke-direct {v7, v4}, Lcom/taobao/accs/data/d;->d(Ljava/lang/String;)V
    :try_end_20
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_20} :catch_7

    move-object/from16 v12, v19

    .line 117
    :try_start_21
    invoke-virtual {v12, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_21
    .catch Ljava/lang/Exception; {:try_start_21 .. :try_end_21} :catch_12

    const-string v4, "handleMessage try deliverMsg"

    const-string v5, "serviceId"

    if-eqz v3, :cond_23

    .line 118
    :try_start_22
    iget-object v3, v7, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    const/4 v6, 0x6

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v13, 0x0

    aput-object v11, v6, v13

    const/4 v13, 0x1

    aput-object v14, v6, v13

    const/16 v19, 0x2

    aput-object v33, v6, v19

    aget-object v19, v0, v13

    const/4 v13, 0x3

    aput-object v19, v6, v13

    const/4 v13, 0x4

    aput-object v5, v6, v13

    const/4 v13, 0x5

    aput-object v10, v6, v13

    invoke-static {v3, v4, v6}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1c

    .line 119
    :cond_23
    sget-object v3, Lcom/taobao/accs/utl/ALog$Level;->I:Lcom/taobao/accs/utl/ALog$Level;

    invoke-static {v3}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    move-result v3

    if-eqz v3, :cond_24

    .line 120
    iget-object v3, v7, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    const/4 v6, 0x6

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v13, 0x0

    aput-object v11, v6, v13

    const/4 v13, 0x1

    aput-object v14, v6, v13

    const/16 v19, 0x2

    aput-object v33, v6, v19

    aget-object v19, v0, v13

    const/4 v13, 0x3

    aput-object v19, v6, v13

    const/4 v13, 0x4

    aput-object v5, v6, v13

    const/4 v13, 0x5

    aput-object v10, v6, v13

    invoke-static {v3, v4, v6}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1d

    :cond_24
    :goto_1c
    const/4 v13, 0x5

    .line 121
    :goto_1d
    new-instance v3, Landroid/content/Intent;

    const-string v4, "com.taobao.accs.intent.action.RECEIVE"

    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x1

    .line 122
    aget-object v6, v0, v4

    invoke-virtual {v3, v6}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const-string v4, "command"

    const/16 v6, 0x65

    .line 123
    invoke-virtual {v3, v4, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 124
    array-length v4, v0

    const/4 v6, 0x3

    if-lt v4, v6, :cond_25

    const/4 v4, 0x2

    .line 125
    aget-object v6, v0, v4

    invoke-virtual {v3, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 126
    :cond_25
    array-length v4, v0

    const/4 v5, 0x4

    if-lt v4, v5, :cond_26

    const/4 v4, 0x3

    .line 127
    aget-object v0, v0, v4

    const-string v4, "userInfo"

    .line 128
    invoke-virtual {v3, v4, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_1e

    :cond_26
    move-object/from16 v0, v25

    :goto_1e
    const-string v4, "data"

    .line 129
    invoke-virtual {v3, v4, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    .line 130
    invoke-virtual {v3, v11, v14}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v4, "packageName"

    .line 131
    iget-object v5, v7, Lcom/taobao/accs/data/d;->h:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v4, "host"

    .line 132
    invoke-virtual {v3, v4, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v4, "conn_type"

    .line 133
    iget v5, v7, Lcom/taobao/accs/data/d;->b:I

    invoke-virtual {v3, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v4, "bizAck"

    move/from16 v5, v32

    .line 134
    invoke-virtual {v3, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string v4, "appKey"

    .line 135
    iget-object v6, v7, Lcom/taobao/accs/data/d;->k:Lcom/taobao/accs/net/b;

    invoke-virtual {v6}, Lcom/taobao/accs/net/b;->i()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v4, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v4, "configTag"

    .line 136
    iget-object v6, v7, Lcom/taobao/accs/data/d;->k:Lcom/taobao/accs/net/b;

    iget-object v6, v6, Lcom/taobao/accs/net/b;->m:Ljava/lang/String;

    invoke-virtual {v3, v4, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 137
    new-instance v4, Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    invoke-direct {v4}, Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;-><init>()V

    const/4 v6, 0x4

    .line 138
    invoke-virtual {v4, v6}, Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;->setMsgType(I)V

    .line 139
    invoke-virtual {v4}, Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;->onReceiveData()V

    const-string v6, "monitor"

    .line 140
    invoke-virtual {v3, v6, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 141
    invoke-direct {v7, v15, v3}, Lcom/taobao/accs/data/d;->a(Ljava/util/Map;Landroid/content/Intent;)V
    :try_end_22
    .catch Ljava/lang/Exception; {:try_start_22 .. :try_end_22} :catch_12

    if-eqz v5, :cond_27

    move-object/from16 v29, v14

    move-wide/from16 v13, v35

    long-to-int v4, v13

    int-to-short v4, v4

    move-object/from16 v6, v28

    .line 142
    :try_start_23
    invoke-direct {v7, v3, v8, v6, v4}, Lcom/taobao/accs/data/d;->a(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;S)V

    goto :goto_1f

    :cond_27
    move-object/from16 v29, v14

    move-object/from16 v6, v28

    move-wide/from16 v13, v35

    :goto_1f
    const-string v4, "ACCS_TEST"

    move/from16 v32, v5

    const-string v5, "start to MsgDistribute.distribMessage"

    .line 143
    invoke-static {v4, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 144
    iget-object v4, v7, Lcom/taobao/accs/data/d;->h:Landroid/content/Context;

    iget-object v5, v7, Lcom/taobao/accs/data/d;->k:Lcom/taobao/accs/net/b;

    invoke-static {v4, v5, v3}, Lcom/taobao/accs/data/g;->a(Landroid/content/Context;Lcom/taobao/accs/net/b;Landroid/content/Intent;)V

    .line 145
    invoke-static {}, Lcom/taobao/accs/utl/UTMini;->getInstance()Lcom/taobao/accs/utl/UTMini;

    move-result-object v37

    const v38, 0x101d1

    const-string v39, "MsgToBussPush"

    const-string v40, "commandId=101"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "serviceId="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " dataId="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_23
    .catch Ljava/lang/Exception; {:try_start_23 .. :try_end_23} :catch_11

    move-object/from16 v5, v29

    :try_start_24
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v41

    const/16 v3, 0xde

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v42

    invoke-virtual/range {v37 .. v42}, Lcom/taobao/accs/utl/UTMini;->commitEvent(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v3, "to_buss"

    .line 146
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v28, v6

    const-string v6, "1commandId=101serviceId="

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v31, v8

    const-wide/16 v8, 0x0

    invoke-static {v12, v3, v4, v8, v9}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitCount(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V

    .line 147
    iget-object v3, v7, Lcom/taobao/accs/data/d;->i:Lcom/taobao/accs/ut/a/d;

    iput-object v5, v3, Lcom/taobao/accs/ut/a/d;->b:Ljava/lang/String;

    .line 148
    iput-object v0, v3, Lcom/taobao/accs/ut/a/d;->i:Ljava/lang/String;

    .line 149
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    if-nez v2, :cond_28

    const/4 v2, 0x0

    goto :goto_20

    :cond_28
    array-length v2, v2

    :goto_20
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    :try_end_24
    .catch Ljava/lang/Exception; {:try_start_24 .. :try_end_24} :catch_10

    move-object/from16 v6, v25

    :try_start_25
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Lcom/taobao/accs/ut/a/d;->f:Ljava/lang/String;

    .line 150
    iget-object v0, v7, Lcom/taobao/accs/data/d;->i:Lcom/taobao/accs/ut/a/d;

    iget-object v2, v7, Lcom/taobao/accs/data/d;->h:Landroid/content/Context;

    invoke-static {v2}, Lcom/taobao/accs/utl/UtilityImpl;->getDeviceId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/taobao/accs/ut/a/d;->a:Ljava/lang/String;

    .line 151
    iget-object v0, v7, Lcom/taobao/accs/data/d;->i:Lcom/taobao/accs/ut/a/d;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/taobao/accs/ut/a/d;->d:Ljava/lang/String;

    .line 152
    new-instance v0, Lcom/taobao/accs/ut/monitor/TrafficsMonitor$a;

    invoke-static {}, Lanet/channel/GlobalAppRuntimeInfo;->isAppBackground()Z

    move-result v3

    array-length v1, v1
    :try_end_25
    .catch Ljava/lang/Exception; {:try_start_25 .. :try_end_25} :catch_f

    int-to-long v1, v1

    move-wide/from16 v25, v1

    move-object v1, v0

    move-object v2, v10

    move-object/from16 v4, p3

    move-object/from16 v20, v5

    move-object/from16 v27, v6

    move-object/from16 v19, v28

    move/from16 v21, v32

    const/16 v28, 0x0

    move-wide/from16 v5, v25

    :try_start_26
    invoke-direct/range {v1 .. v6}, Lcom/taobao/accs/ut/monitor/TrafficsMonitor$a;-><init>(Ljava/lang/String;ZLjava/lang/String;J)V

    invoke-virtual {v7, v0}, Lcom/taobao/accs/data/d;->a(Lcom/taobao/accs/ut/monitor/TrafficsMonitor$a;)V

    move/from16 v1, v34

    const/4 v2, 0x1

    :goto_21
    if-ne v1, v2, :cond_2b

    .line 153
    invoke-virtual {v12, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_26
    .catch Ljava/lang/Exception; {:try_start_26 .. :try_end_26} :catch_e

    const-string v1, "handleMessage try sendAck dataId"

    if-eqz v0, :cond_29

    .line 154
    :try_start_27
    iget-object v0, v7, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v11, v2, v3
    :try_end_27
    .catch Ljava/lang/Exception; {:try_start_27 .. :try_end_27} :catch_d

    const/4 v3, 0x1

    :try_start_28
    aput-object v20, v2, v3
    :try_end_28
    .catch Ljava/lang/Exception; {:try_start_28 .. :try_end_28} :catch_c

    :try_start_29
    invoke-static {v0, v1, v2}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_29
    .catch Ljava/lang/Exception; {:try_start_29 .. :try_end_29} :catch_d

    const/4 v3, 0x0

    const/4 v4, 0x1

    goto :goto_22

    :catch_c
    move-exception v0

    move-object v5, v12

    move-object/from16 v6, v17

    move-object/from16 v43, v18

    move-object/from16 v4, v20

    move-object/from16 v1, v24

    move-object/from16 v2, v27

    goto/16 :goto_23

    :catch_d
    move-exception v0

    move-object v5, v12

    move-object/from16 v6, v17

    move-object/from16 v43, v18

    move-object/from16 v4, v20

    move-object/from16 v1, v24

    move-object/from16 v2, v27

    move-object/from16 v9, v28

    goto/16 :goto_15

    .line 155
    :cond_29
    :try_start_2a
    iget-object v0, v7, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v11, v2, v3

    const/4 v4, 0x1

    aput-object v20, v2, v4

    invoke-static {v0, v1, v2}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    :goto_22
    iget-object v0, v7, Lcom/taobao/accs/data/d;->k:Lcom/taobao/accs/net/b;
    :try_end_2a
    .catch Ljava/lang/Exception; {:try_start_2a .. :try_end_2a} :catch_e

    const/4 v1, 0x0

    long-to-int v2, v13

    int-to-short v13, v2

    move-wide v5, v8

    move-object/from16 v2, v31

    move-object v8, v0

    move-object/from16 v9, v19

    move-object v0, v10

    move-object v10, v2

    move-object/from16 v2, v27

    move-object/from16 v11, v20

    move-wide v3, v5

    move-object v5, v12

    move v12, v1

    move-object/from16 v6, v17

    move-object/from16 v1, v24

    const/4 v3, 0x1

    const/4 v14, 0x5

    move-object/from16 v4, v20

    move-object/from16 v14, p3

    move-object/from16 v43, v18

    move/from16 v23, v21

    :try_start_2b
    invoke-static/range {v8 .. v15}, Lcom/taobao/accs/data/Message;->a(Lcom/taobao/accs/net/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZSLjava/lang/String;Ljava/util/Map;)Lcom/taobao/accs/data/Message;

    move-result-object v8

    .line 157
    iget-object v9, v7, Lcom/taobao/accs/data/d;->k:Lcom/taobao/accs/net/b;

    invoke-virtual {v9, v8, v3}, Lcom/taobao/accs/net/b;->b(Lcom/taobao/accs/data/Message;Z)V

    .line 158
    iget-object v8, v8, Lcom/taobao/accs/data/Message;->q:Ljava/lang/String;

    invoke-direct {v7, v8, v0}, Lcom/taobao/accs/data/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v23, :cond_2b

    const-string v0, "ack"

    const-wide/16 v8, 0x0

    .line 159
    invoke-static {v5, v0, v2, v8, v9}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitCount(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V

    goto/16 :goto_28

    :catch_e
    move-exception v0

    move-object v5, v12

    move-object/from16 v6, v17

    move-object/from16 v43, v18

    move-object/from16 v4, v20

    move-object/from16 v1, v24

    move-object/from16 v2, v27

    const/4 v3, 0x1

    :goto_23
    move-object/from16 v9, v28

    goto/16 :goto_27

    :catch_f
    move-exception v0

    move-object v4, v5

    move-object v2, v6

    move-object v5, v12

    move-object/from16 v6, v17

    move-object/from16 v43, v18

    goto/16 :goto_25

    :catch_10
    move-exception v0

    move-object v4, v5

    move-object v5, v12

    goto :goto_24

    :catch_11
    move-exception v0

    move-object v5, v12

    move-object/from16 v6, v17

    move-object/from16 v43, v18

    move-object/from16 v1, v24

    goto/16 :goto_e

    :catch_12
    move-exception v0

    move-object v5, v12

    move-object v4, v14

    :goto_24
    move-object/from16 v6, v17

    move-object/from16 v43, v18

    goto/16 :goto_18

    :cond_2a
    move-object v2, v12

    move-object v4, v14

    move-object/from16 v6, v17

    move-object/from16 v43, v18

    move-object/from16 v5, v19

    move-object/from16 v1, v24

    const/4 v3, 0x1

    .line 160
    iget-object v8, v7, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    const-string v9, "handleMessage not exist, unbind it"

    const/4 v10, 0x2

    new-array v10, v10, [Ljava/lang/Object;

    const-string v11, "package"

    const/4 v12, 0x0

    aput-object v11, v10, v12

    aget-object v11, v0, v3

    aput-object v11, v10, v3

    invoke-static {v8, v9, v10}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    iget-object v8, v7, Lcom/taobao/accs/data/d;->k:Lcom/taobao/accs/net/b;
    :try_end_2b
    .catch Ljava/lang/Exception; {:try_start_2b .. :try_end_2b} :catch_14

    const/4 v9, 0x0

    :try_start_2c
    invoke-virtual {v8, v9}, Lcom/taobao/accs/net/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x4

    invoke-static {v4, v2, v10, v11}, Lcom/taobao/accs/data/Message;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/taobao/accs/data/Message;

    move-result-object v10

    invoke-virtual {v8, v10, v3}, Lcom/taobao/accs/net/b;->b(Lcom/taobao/accs/data/Message;Z)V

    .line 162
    iget-object v8, v7, Lcom/taobao/accs/data/d;->k:Lcom/taobao/accs/net/b;

    aget-object v0, v0, v3

    invoke-static {v8, v0}, Lcom/taobao/accs/data/Message;->a(Lcom/taobao/accs/net/b;Ljava/lang/String;)Lcom/taobao/accs/data/Message;

    move-result-object v0

    invoke-virtual {v8, v0, v3}, Lcom/taobao/accs/net/b;->b(Lcom/taobao/accs/data/Message;Z)V
    :try_end_2c
    .catch Ljava/lang/Exception; {:try_start_2c .. :try_end_2c} :catch_13

    goto/16 :goto_28

    :catch_13
    move-exception v0

    goto :goto_27

    :catch_14
    move-exception v0

    goto/16 :goto_9

    :catch_15
    move-exception v0

    move-object v2, v12

    move-object v4, v14

    move-object/from16 v6, v17

    move-object/from16 v43, v18

    move-object/from16 v5, v19

    :goto_25
    move-object/from16 v1, v24

    goto/16 :goto_8

    :catch_16
    move-exception v0

    move-object v4, v14

    move-object/from16 v6, v17

    move-object/from16 v43, v18

    move-object/from16 v5, v19

    move-object/from16 v1, v24

    move-object/from16 v2, v25

    goto/16 :goto_9

    :catch_17
    move-exception v0

    move-object v2, v11

    move-object/from16 v6, v17

    move-object/from16 v43, v18

    move-object/from16 v5, v19

    :goto_26
    move-object/from16 v4, v29

    goto/16 :goto_8

    :catch_18
    move-exception v0

    move-object v2, v13

    goto/16 :goto_7

    .line 163
    :goto_27
    iget-object v8, v7, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    const/4 v10, 0x0

    new-array v10, v10, [Ljava/lang/Object;

    invoke-static {v8, v1, v0, v10}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    .line 164
    iget-object v1, v7, Lcom/taobao/accs/data/d;->k:Lcom/taobao/accs/net/b;

    invoke-virtual {v1, v9}, Lcom/taobao/accs/net/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x5

    invoke-static {v4, v2, v8, v9}, Lcom/taobao/accs/data/Message;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/taobao/accs/data/Message;

    move-result-object v4

    invoke-virtual {v1, v4, v3}, Lcom/taobao/accs/net/b;->b(Lcom/taobao/accs/data/Message;Z)V

    .line 165
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v3, v7, Lcom/taobao/accs/data/d;->b:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v3, v43

    invoke-static {v5, v6, v2, v3, v0}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitAlarmFail(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2b
    :goto_28
    return-void

    :catch_19
    move-exception v0

    move-object v2, v11

    move-object v5, v12

    move-object/from16 v6, v17

    move-object/from16 v3, v18

    .line 166
    iget-object v4, v7, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "dataId read error "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    new-array v9, v9, [Ljava/lang/Object;

    invoke-static {v4, v8, v9}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    invoke-virtual {v1}, Ljava/io/ByteArrayInputStream;->close()V

    .line 168
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v4, v7, Lcom/taobao/accs/data/d;->b:I

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "data id read error"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v6, v2, v3, v0}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitAlarmFail(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private a(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;S)V
    .locals 1

    if-eqz p1, :cond_2

    .line 323
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "source"

    .line 324
    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 325
    :cond_0
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_1

    const-string p2, "target"

    .line 326
    invoke-virtual {p1, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_1
    const-string p2, "flags"

    .line 327
    invoke-virtual {p1, p2, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;S)Landroid/content/Intent;

    :cond_2
    return-void
.end method

.method private a(Lcom/taobao/accs/data/Message;[B[BLjava/lang/String;)V
    .locals 17

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    .line 183
    sget-object v1, Lcom/taobao/accs/AccsErrorCode;->SUCCESS:Lcom/alibaba/sdk/android/error/ErrorCode;

    const/4 v2, 0x0

    .line 184
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    new-instance v0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    move-object/from16 v5, p2

    :try_start_1
    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([B)V

    invoke-direct {v3, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 185
    sget-object v0, Lcom/taobao/accs/utl/ALog$Level;->D:Lcom/taobao/accs/utl/ALog$Level;

    invoke-static {v0}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const-string v4, "json"

    const-string v6, "handleControlMessage parse"

    const/4 v9, 0x2

    const/4 v10, 0x1

    if-eqz v0, :cond_0

    .line 186
    :try_start_2
    iget-object v0, v7, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    new-array v11, v9, [Ljava/lang/Object;

    aput-object v4, v11, v2

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v12

    aput-object v12, v11, v10

    invoke-static {v0, v6, v11}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    :cond_0
    iget-object v0, v8, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v11, 0x64

    if-ne v0, v11, :cond_1

    move-object v12, v1

    goto :goto_0

    :cond_1
    const-string v0, "code"

    .line 188
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    .line 189
    invoke-static {v0}, Lcom/taobao/accs/AccsErrorCode;->parseHttpCode(I)Lcom/alibaba/sdk/android/error/ErrorCode;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object v12, v0

    .line 190
    :goto_0
    :try_start_3
    invoke-virtual {v12}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v0

    invoke-virtual {v1}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v1

    if-ne v0, v1, :cond_6

    .line 191
    iget-object v0, v8, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eq v0, v10, :cond_4

    if-eq v0, v9, :cond_3

    if-eq v0, v11, :cond_2

    goto/16 :goto_3

    .line 192
    :cond_2
    iget-object v0, v7, Lcom/taobao/accs/data/d;->k:Lcom/taobao/accs/net/b;

    instance-of v0, v0, Lcom/taobao/accs/net/j;

    if-eqz v0, :cond_7

    iget-object v0, v8, Lcom/taobao/accs/data/Message;->n:Ljava/lang/String;

    const-string v1, "4|sal|st"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 193
    iget-object v0, v7, Lcom/taobao/accs/data/d;->k:Lcom/taobao/accs/net/b;

    check-cast v0, Lcom/taobao/accs/net/j;

    .line 194
    invoke-virtual {v0, v3}, Lcom/taobao/accs/net/j;->a(Lorg/json/JSONObject;)V

    goto/16 :goto_3

    .line 195
    :cond_3
    iget-object v0, v7, Lcom/taobao/accs/data/d;->k:Lcom/taobao/accs/net/b;

    invoke-virtual {v0}, Lcom/taobao/accs/net/b;->j()Lcom/taobao/accs/client/c;

    move-result-object v0

    iget-object v1, v8, Lcom/taobao/accs/data/Message;->s:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/taobao/accs/client/c;->b(Ljava/lang/String;)V

    goto/16 :goto_3

    .line 196
    :cond_4
    invoke-static {}, Lcom/taobao/accs/AccsState;->getInstance()Lcom/taobao/accs/AccsState;

    move-result-object v0

    iget-object v1, v7, Lcom/taobao/accs/data/d;->k:Lcom/taobao/accs/net/b;

    iget-object v1, v1, Lcom/taobao/accs/net/b;->m:Ljava/lang/String;

    const-string v11, "bfc"

    sget-object v13, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1, v11, v13}, Lcom/taobao/accs/AccsState;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "EMAS_ACCS_SDK"

    .line 197
    iget-object v1, v7, Lcom/taobao/accs/data/d;->h:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/taobao/accs/utl/UtilityImpl;->saveUtdid(Ljava/lang/String;Landroid/content/Context;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 198
    :try_start_4
    iget-object v0, v7, Lcom/taobao/accs/data/d;->k:Lcom/taobao/accs/net/b;

    invoke-virtual {v0}, Lcom/taobao/accs/net/b;->j()Lcom/taobao/accs/client/c;

    move-result-object v0

    iget-object v1, v7, Lcom/taobao/accs/data/d;->h:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/taobao/accs/client/c;->a(Ljava/lang/String;)V

    const-string v0, "data"

    .line 199
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "accsToken"

    const/4 v11, 0x0

    .line 200
    invoke-static {v0, v1, v11}, Lcom/taobao/accs/utl/JsonUtility;->getString(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v7, Lcom/taobao/accs/data/d;->e:Ljava/lang/String;

    if-eqz v0, :cond_7

    const-string v1, "packageNames"

    .line 201
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    if-eqz v0, :cond_7

    const/4 v1, 0x0

    .line 202
    :goto_1
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v11

    if-ge v1, v11, :cond_7

    .line 203
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v11

    .line 204
    iget-object v13, v7, Lcom/taobao/accs/data/d;->h:Landroid/content/Context;

    invoke-static {v13, v11}, Lcom/taobao/accs/utl/UtilityImpl;->c(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_5

    .line 205
    iget-object v11, v7, Lcom/taobao/accs/data/d;->k:Lcom/taobao/accs/net/b;

    invoke-virtual {v11}, Lcom/taobao/accs/net/b;->j()Lcom/taobao/accs/client/c;

    move-result-object v11

    iget-object v13, v8, Lcom/taobao/accs/data/Message;->s:Ljava/lang/String;

    invoke-virtual {v11, v13}, Lcom/taobao/accs/client/c;->a(Ljava/lang/String;)V

    goto :goto_2

    .line 206
    :cond_5
    iget-object v13, v7, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    const-string v14, "unbind app"

    new-array v15, v9, [Ljava/lang/Object;

    const-string v16, "pkg"

    aput-object v16, v15, v2

    aput-object v11, v15, v10

    invoke-static {v13, v14, v15}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 207
    iget-object v13, v7, Lcom/taobao/accs/data/d;->k:Lcom/taobao/accs/net/b;

    invoke-static {v13, v11}, Lcom/taobao/accs/data/Message;->a(Lcom/taobao/accs/net/b;Ljava/lang/String;)Lcom/taobao/accs/data/Message;

    move-result-object v11

    invoke-virtual {v13, v11, v10}, Lcom/taobao/accs/net/b;->b(Lcom/taobao/accs/data/Message;Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :catchall_0
    move-exception v0

    .line 208
    :try_start_5
    iget-object v1, v7, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    const-string v11, "no token/invalid app"

    new-array v13, v10, [Ljava/lang/Object;

    aput-object v0, v13, v2

    invoke-static {v1, v11, v13}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    .line 209
    :cond_6
    invoke-virtual {v12}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v0

    sget-object v1, Lcom/taobao/accs/AccsErrorCode;->APP_NOT_BIND:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v1}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v1

    if-ne v0, v1, :cond_7

    .line 210
    iget-object v0, v7, Lcom/taobao/accs/data/d;->k:Lcom/taobao/accs/net/b;

    invoke-virtual {v0}, Lcom/taobao/accs/net/b;->j()Lcom/taobao/accs/client/c;

    move-result-object v0

    iget-object v1, v8, Lcom/taobao/accs/data/Message;->s:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/taobao/accs/client/c;->b(Ljava/lang/String;)V

    .line 211
    :cond_7
    :goto_3
    invoke-virtual {v12}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v0

    sget-object v1, Lcom/taobao/accs/AccsErrorCode;->SUCCESS:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v1}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v1

    if-eq v0, v1, :cond_8

    .line 212
    iget-object v0, v7, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    new-array v1, v9, [Ljava/lang/Object;

    aput-object v4, v1, v2

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v10

    invoke-static {v0, v6, v1}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :cond_8
    move-object v3, v12

    goto :goto_5

    :catchall_1
    move-exception v0

    move-object v1, v12

    goto :goto_4

    :catchall_2
    move-exception v0

    goto :goto_4

    :catchall_3
    move-exception v0

    move-object/from16 v5, p2

    .line 213
    :goto_4
    iget-object v3, v7, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    new-array v2, v2, [Ljava/lang/Object;

    const-string v4, "handleControlMessage"

    invoke-static {v3, v4, v0, v2}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    .line 214
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget v3, v7, Lcom/taobao/accs/data/d;->b:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "accs"

    const-string v3, "send_fail"

    const-string v6, ""

    invoke-static {v2, v3, v4, v6, v0}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitAlarmFail(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v3, v1

    :goto_5
    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v5, p2

    .line 215
    invoke-virtual/range {v1 .. v6}, Lcom/taobao/accs/data/d;->a(Lcom/taobao/accs/data/Message;Lcom/alibaba/sdk/android/error/ErrorCode;Lcom/taobao/accs/data/Message$ReqType;[BLjava/util/Map;)V

    .line 216
    new-instance v0, Lcom/taobao/accs/ut/monitor/TrafficsMonitor$a;

    iget-object v9, v8, Lcom/taobao/accs/data/Message;->H:Ljava/lang/String;

    invoke-static {}, Lanet/channel/GlobalAppRuntimeInfo;->isAppBackground()Z

    move-result v10

    move-object/from16 v1, p3

    array-length v1, v1

    int-to-long v12, v1

    move-object v8, v0

    move-object/from16 v11, p4

    invoke-direct/range {v8 .. v13}, Lcom/taobao/accs/ut/monitor/TrafficsMonitor$a;-><init>(Ljava/lang/String;ZLjava/lang/String;J)V

    invoke-virtual {v7, v0}, Lcom/taobao/accs/data/d;->a(Lcom/taobao/accs/ut/monitor/TrafficsMonitor$a;)V

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 328
    new-instance v0, Lcom/taobao/accs/ut/a/e;

    invoke-direct {v0}, Lcom/taobao/accs/ut/a/e;-><init>()V

    .line 329
    iget-object v1, p0, Lcom/taobao/accs/data/d;->h:Landroid/content/Context;

    invoke-static {v1}, Lcom/taobao/accs/utl/UtilityImpl;->getDeviceId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/taobao/accs/ut/a/e;->a:Ljava/lang/String;

    .line 330
    iput-object p1, v0, Lcom/taobao/accs/ut/a/e;->c:Ljava/lang/String;

    .line 331
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/taobao/accs/ut/a/e;->d:Ljava/lang/String;

    .line 332
    iput-object v1, v0, Lcom/taobao/accs/ut/a/e;->f:Ljava/lang/String;

    .line 333
    iput-object p2, v0, Lcom/taobao/accs/ut/a/e;->e:Ljava/lang/String;

    .line 334
    iput-object v1, v0, Lcom/taobao/accs/ut/a/e;->b:Ljava/lang/String;

    .line 335
    invoke-virtual {v0}, Lcom/taobao/accs/ut/a/e;->a()V

    return-void
.end method

.method private a(Ljava/util/Map;Landroid/content/Intent;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;",
            "Landroid/content/Intent;",
            ")V"
        }
    .end annotation

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 322
    check-cast p1, Ljava/util/HashMap;

    const-string v0, "ext_header"

    invoke-virtual {p2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    :cond_0
    return-void
.end method

.method private a(Ljava/io/InputStream;)[B
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 169
    :cond_0
    new-instance v1, Ljava/util/zip/GZIPInputStream;

    invoke-direct {v1, p1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    .line 170
    new-instance p1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v2, 0x2000

    const/4 v3, 0x0

    :try_start_0
    new-array v2, v2, [B

    .line 171
    :goto_0
    invoke-virtual {v1, v2}, Ljava/util/zip/GZIPInputStream;->read([B)I

    move-result v4

    if-lez v4, :cond_1

    .line 172
    invoke-virtual {p1, v2, v3, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    .line 173
    :cond_1
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 174
    :try_start_1
    invoke-virtual {v1}, Ljava/util/zip/GZIPInputStream;->close()V

    .line 175
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v2

    .line 176
    :try_start_2
    iget-object v4, p0, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "uncompress data error "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v4, v5, v3}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v3, "accs"

    const-string v4, "send_fail"

    const-string v5, ""

    const-string v6, "1"

    .line 177
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    iget v8, p0, Lcom/taobao/accs/data/d;->b:I

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, " uncompress data error "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v4, v5, v6, v2}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitAlarmFail(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 178
    :try_start_3
    invoke-virtual {v1}, Ljava/util/zip/GZIPInputStream;->close()V

    .line 179
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    :catch_2
    return-object v0

    .line 180
    :goto_1
    :try_start_4
    invoke-virtual {v1}, Ljava/util/zip/GZIPInputStream;->close()V

    .line 181
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 182
    :catch_3
    throw v0
.end method

.method private a(Ljava/lang/String;Ljava/util/Map;[B)[B
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;[B)[B"
        }
    .end annotation

    const-string v0, "putBurstMessage"

    const/4 v1, 0x0

    if-eqz p3, :cond_5

    .line 303
    :try_start_0
    array-length v2, p3

    if-eqz v2, :cond_5

    const/16 v2, 0x11

    .line 304
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    const/16 v3, 0x10

    .line 305
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {p2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    const/4 v4, 0x1

    if-le v3, v4, :cond_4

    const/4 v5, 0x2

    if-ltz v2, :cond_3

    if-ge v2, v3, :cond_3

    const/16 v6, 0x12

    .line 306
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {p2, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const-wide/16 v7, 0x0

    const/16 v9, 0xf

    .line 307
    :try_start_1
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {p2, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 308
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_0

    .line 309
    invoke-static {p2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    .line 310
    :try_start_2
    iget-object v9, p0, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    new-array v10, v1, [Ljava/lang/Object;

    invoke-static {v9, v0, p2, v10}, Lcom/taobao/accs/utl/ALog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    .line 311
    :cond_0
    :goto_0
    iget-object p2, p0, Lcom/taobao/accs/data/d;->n:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/taobao/accs/data/a;

    if-nez p2, :cond_2

    .line 312
    sget-object p2, Lcom/taobao/accs/utl/ALog$Level;->I:Lcom/taobao/accs/utl/ALog$Level;

    invoke-static {p2}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 313
    iget-object p2, p0, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    const/4 v9, 0x4

    new-array v9, v9, [Ljava/lang/Object;

    const-string v10, "dataId"

    aput-object v10, v9, v1

    aput-object p1, v9, v4

    const-string v4, "burstLength"

    aput-object v4, v9, v5

    const/4 v4, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v9, v4

    invoke-static {p2, v0, v9}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 314
    :cond_1
    new-instance p2, Lcom/taobao/accs/data/a;

    invoke-direct {p2, p1, v3, v6}, Lcom/taobao/accs/data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 315
    invoke-virtual {p2, v7, v8}, Lcom/taobao/accs/data/a;->a(J)V

    .line 316
    iget-object v4, p0, Lcom/taobao/accs/data/d;->n:Ljava/util/Map;

    invoke-interface {v4, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 317
    :cond_2
    invoke-virtual {p2, v2, v3, p3}, Lcom/taobao/accs/data/a;->a(II[B)[B

    move-result-object p1

    return-object p1

    .line 318
    :cond_3
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "burstNums:%s burstIndex:%s"

    new-array p3, v5, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, p3, v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, p3, v4

    invoke-static {p2, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 319
    :cond_4
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "burstNums <= 1"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 320
    :cond_5
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "burstLength == 0"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p1

    .line 321
    iget-object p2, p0, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    new-array p3, v1, [Ljava/lang/Object;

    invoke-static {p2, v0, p1, p3}, Lcom/taobao/accs/utl/ALog;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private b(Lcom/taobao/accs/data/Message;Lcom/alibaba/sdk/android/error/ErrorCode;)V
    .locals 5

    if-nez p1, :cond_0

    return-void

    .line 35
    :cond_0
    iget-object v0, p0, Lcom/taobao/accs/data/d;->h:Landroid/content/Context;

    invoke-static {v0}, Lcom/taobao/accs/utl/UtilityImpl;->getDeviceId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 36
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 37
    invoke-virtual {p2}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v2

    sget-object v3, Lcom/taobao/accs/AccsErrorCode;->SUCCESS:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v3}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v3

    const/4 v4, 0x1

    if-eq v2, v3, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    const/4 v2, 0x1

    .line 38
    :goto_0
    iget-object v3, p1, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-eq v3, v4, :cond_3

    const/4 v4, 0x3

    if-eq v3, v4, :cond_2

    goto :goto_1

    .line 39
    :cond_2
    new-instance v3, Lcom/taobao/accs/ut/a/b;

    invoke-direct {v3}, Lcom/taobao/accs/ut/a/b;-><init>()V

    .line 40
    iput-object v0, v3, Lcom/taobao/accs/ut/a/b;->a:Ljava/lang/String;

    .line 41
    iput-object v1, v3, Lcom/taobao/accs/ut/a/b;->b:Ljava/lang/String;

    .line 42
    iput-boolean v2, v3, Lcom/taobao/accs/ut/a/b;->c:Z

    .line 43
    iget-object p1, p1, Lcom/taobao/accs/data/Message;->G:Ljava/lang/String;

    iput-object p1, v3, Lcom/taobao/accs/ut/a/b;->e:Ljava/lang/String;

    .line 44
    invoke-virtual {v3, p2}, Lcom/taobao/accs/ut/a/b;->a(Lcom/alibaba/sdk/android/error/ErrorCode;)V

    .line 45
    invoke-virtual {v3}, Lcom/taobao/accs/ut/a/b;->a()V

    goto :goto_1

    .line 46
    :cond_3
    new-instance p1, Lcom/taobao/accs/ut/a/a;

    invoke-direct {p1}, Lcom/taobao/accs/ut/a/a;-><init>()V

    .line 47
    iput-object v0, p1, Lcom/taobao/accs/ut/a/a;->a:Ljava/lang/String;

    .line 48
    iput-object v1, p1, Lcom/taobao/accs/ut/a/a;->b:Ljava/lang/String;

    .line 49
    iput-boolean v2, p1, Lcom/taobao/accs/ut/a/a;->c:Z

    .line 50
    invoke-virtual {p1, p2}, Lcom/taobao/accs/ut/a/a;->a(Lcom/alibaba/sdk/android/error/ErrorCode;)V

    .line 51
    invoke-virtual {p1}, Lcom/taobao/accs/ut/a/a;->a()V

    :goto_1
    return-void
.end method

.method private b(Lcom/alibaba/sdk/android/error/ErrorCode;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v0

    sget-object v1, Lcom/taobao/accs/AccsErrorCode;->SPDY_CONNECTION_DISCONNECTED_WHEN_SEND_DATA:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v1}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 2
    invoke-virtual {p1}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v0

    sget-object v1, Lcom/taobao/accs/AccsErrorCode;->REQ_TIME_OUT:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v1}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 3
    invoke-virtual {p1}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v0

    sget-object v1, Lcom/taobao/accs/AccsErrorCode;->SPDY_CON_DISCONNECTED:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v1}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 4
    invoke-virtual {p1}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v0

    sget-object v1, Lcom/taobao/accs/AccsErrorCode;->INAPP_CON_DISCONNECTED:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v1}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 5
    invoke-virtual {p1}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v0

    sget-object v1, Lcom/taobao/accs/AccsErrorCode;->SPDY_PING_TIME_OUT:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v1}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 6
    invoke-virtual {p1}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v0

    sget-object v1, Lcom/taobao/accs/AccsErrorCode;->NO_NETWORK:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v1}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 7
    invoke-virtual {p1}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v0

    sget-object v1, Lcom/taobao/accs/AccsErrorCode;->NETWORKSDK_SPDY_CLOSE_ERROR:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v1}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 8
    invoke-virtual {p1}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v0

    sget-object v1, Lcom/taobao/accs/AccsErrorCode;->NETWORK_INAPP_TIMEOUT:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v1}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 9
    invoke-virtual {p1}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v0

    sget-object v1, Lcom/taobao/accs/AccsErrorCode;->NETWORK_INAPP_CONNECT_FAIL:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v1}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 10
    invoke-virtual {p1}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v0

    sget-object v1, Lcom/taobao/accs/AccsErrorCode;->NETWORK_INAPP_NO_STRATEGY:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v1}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 11
    invoke-virtual {p1}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result p1

    sget-object v0, Lcom/taobao/accs/AccsErrorCode;->NETWORK_INAPP_EXCEPTION:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v0}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v0

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method private c(Lcom/taobao/accs/data/Message;)Landroid/content/Intent;
    .locals 3

    .line 4
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.taobao.accs.intent.action.RECEIVE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 5
    iget-object v1, p1, Lcom/taobao/accs/data/Message;->s:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 6
    iget-object v1, p1, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    const-string v2, "command"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 7
    iget-object v1, p1, Lcom/taobao/accs/data/Message;->H:Ljava/lang/String;

    const-string v2, "serviceId"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 8
    iget-object v1, p1, Lcom/taobao/accs/data/Message;->G:Ljava/lang/String;

    const-string v2, "userInfo"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 9
    iget-object v1, p1, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0x64

    if-ne v1, v2, :cond_0

    .line 10
    iget-object p1, p1, Lcom/taobao/accs/data/Message;->O:Ljava/lang/String;

    const-string v1, "dataId"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_0
    return-object v0
.end method

.method private c(Ljava/lang/String;)Z
    .locals 1

    .line 2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/taobao/accs/data/d;->m:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method private d(Ljava/lang/String;)V
    .locals 1

    .line 2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/taobao/accs/data/d;->m:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/taobao/accs/data/d;->m:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1, p1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    invoke-direct {p0}, Lcom/taobao/accs/data/d;->j()V

    :cond_1
    :goto_0
    return-void
.end method

.method private i()V
    .locals 5

    .line 1
    :try_start_0
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/taobao/accs/data/d;->h:Landroid/content/Context;

    const-string v2, "emas_accs"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "message"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/taobao/accs/data/d;->k:Lcom/taobao/accs/net/b;

    invoke-virtual {v4}, Lcom/taobao/accs/net/b;->i()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    iget-object v0, p0, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    const-string v1, "message file not exist"

    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 4
    :cond_0
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/FileReader;

    invoke-direct {v2, v0}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 5
    :goto_0
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 6
    iget-object v2, p0, Lcom/taobao/accs/data/d;->m:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, v0, v0}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 7
    :cond_1
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method

.method private j()V
    .locals 5

    .line 1
    :try_start_0
    new-instance v0, Ljava/io/FileWriter;

    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/taobao/accs/data/d;->h:Landroid/content/Context;

    const-string v3, "emas_accs"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "message"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/taobao/accs/data/d;->k:Lcom/taobao/accs/net/b;

    invoke-virtual {v4}, Lcom/taobao/accs/net/b;->i()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V

    const-string v1, ""

    .line 2
    invoke-virtual {v0, v1}, Ljava/io/FileWriter;->write(Ljava/lang/String;)V

    .line 3
    iget-object v1, p0, Lcom/taobao/accs/data/d;->m:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 4
    invoke-virtual {v0, v2}, Ljava/io/FileWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    move-result-object v2

    const-string v3, "\r\n"

    invoke-virtual {v2, v3}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {v0}, Ljava/io/FileWriter;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 6
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    :goto_1
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/taobao/accs/data/Message;
    .locals 3

    .line 302
    iget-object v0, p0, Lcom/taobao/accs/data/d;->f:Ljava/util/concurrent/ConcurrentMap;

    new-instance v1, Lcom/taobao/accs/data/Message$a;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p1}, Lcom/taobao/accs/data/Message$a;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/taobao/accs/data/Message;

    return-object p1
.end method

.method public a()V
    .locals 3

    .line 284
    iget-object v0, p0, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    const-string v1, "onSendPing"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 285
    const-class v0, Lcom/taobao/accs/data/d;

    monitor-enter v0

    const/4 v1, 0x1

    .line 286
    :try_start_0
    iput-boolean v1, p0, Lcom/taobao/accs/data/d;->g:Z

    .line 287
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public a(Lcom/alibaba/sdk/android/error/ErrorCode;)V
    .locals 5

    const/4 v0, 0x0

    .line 295
    iput-boolean v0, p0, Lcom/taobao/accs/data/d;->g:Z

    .line 296
    iget-object v1, p0, Lcom/taobao/accs/data/d;->f:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1}, Ljava/util/concurrent/ConcurrentMap;->keySet()Ljava/util/Set;

    move-result-object v1

    new-array v2, v0, [Lcom/taobao/accs/data/Message$a;

    invoke-interface {v1, v2}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lcom/taobao/accs/data/Message$a;

    .line 297
    array-length v2, v1

    if-lez v2, :cond_1

    .line 298
    iget-object v2, p0, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    new-array v3, v0, [Ljava/lang/Object;

    const-string v4, "onNetworkFail"

    invoke-static {v2, v4, v3}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 299
    array-length v2, v1

    :goto_0
    if-ge v0, v2, :cond_1

    aget-object v3, v1, v0

    .line 300
    iget-object v4, p0, Lcom/taobao/accs/data/d;->f:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v4, v3}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/taobao/accs/data/Message;

    if-eqz v3, :cond_0

    .line 301
    invoke-virtual {p0, v3, p1}, Lcom/taobao/accs/data/d;->a(Lcom/taobao/accs/data/Message;Lcom/alibaba/sdk/android/error/ErrorCode;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public a(Lcom/taobao/accs/data/Message;)V
    .locals 8

    const-string v0, "ACCS_TEST"

    const-string v1, "MessageHandler onSend"

    .line 288
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 289
    iget-object v0, p0, Lcom/taobao/accs/data/d;->j:Lcom/taobao/accs/data/Message;

    if-eqz v0, :cond_0

    iget-object v1, p1, Lcom/taobao/accs/data/Message;->O:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v2, p1, Lcom/taobao/accs/data/Message;->H:Ljava/lang/String;

    if-eqz v2, :cond_0

    iget-object v0, v0, Lcom/taobao/accs/data/Message;->O:Ljava/lang/String;

    .line 290
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/taobao/accs/data/d;->j:Lcom/taobao/accs/data/Message;

    iget-object v0, v0, Lcom/taobao/accs/data/Message;->H:Ljava/lang/String;

    iget-object v1, p1, Lcom/taobao/accs/data/Message;->H:Ljava/lang/String;

    .line 291
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 292
    invoke-static {}, Lcom/taobao/accs/utl/UTMini;->getInstance()Lcom/taobao/accs/utl/UTMini;

    move-result-object v1

    const v2, 0x101d1

    iget-object v4, p1, Lcom/taobao/accs/data/Message;->H:Ljava/lang/String;

    iget-object v5, p1, Lcom/taobao/accs/data/Message;->O:Ljava/lang/String;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const-string v3, "SEND_REPEAT"

    invoke-virtual/range {v1 .. v6}, Lcom/taobao/accs/utl/UTMini;->commitEvent(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 293
    :cond_0
    invoke-virtual {p1}, Lcom/taobao/accs/data/Message;->a()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    invoke-virtual {p1}, Lcom/taobao/accs/data/Message;->a()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    iget-boolean v0, p1, Lcom/taobao/accs/data/Message;->c:Z

    if-eqz v0, :cond_1

    goto :goto_0

    .line 294
    :cond_1
    iget-object v0, p0, Lcom/taobao/accs/data/d;->f:Ljava/util/concurrent/ConcurrentMap;

    invoke-virtual {p1}, Lcom/taobao/accs/data/Message;->d()Lcom/taobao/accs/data/Message$a;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :goto_0
    return-void
.end method

.method public a(Lcom/taobao/accs/data/Message;Lcom/alibaba/sdk/android/error/ErrorCode;)V
    .locals 6

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 227
    invoke-virtual/range {v0 .. v5}, Lcom/taobao/accs/data/d;->a(Lcom/taobao/accs/data/Message;Lcom/alibaba/sdk/android/error/ErrorCode;Lcom/taobao/accs/data/Message$ReqType;[BLjava/util/Map;)V

    return-void
.end method

.method public a(Lcom/taobao/accs/data/Message;Lcom/alibaba/sdk/android/error/ErrorCode;Lcom/taobao/accs/data/Message$ReqType;[BLjava/util/Map;)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/taobao/accs/data/Message;",
            "Lcom/alibaba/sdk/android/error/ErrorCode;",
            "Lcom/taobao/accs/data/Message$ReqType;",
            "[B",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 229
    iget-object v2, v1, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    const/4 v3, 0x0

    if-eqz v2, :cond_16

    invoke-virtual/range {p1 .. p1}, Lcom/taobao/accs/data/Message;->a()I

    move-result v2

    if-ltz v2, :cond_16

    invoke-virtual/range {p1 .. p1}, Lcom/taobao/accs/data/Message;->a()I

    move-result v2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_0

    goto/16 :goto_6

    .line 230
    :cond_0
    iget-object v2, v1, Lcom/taobao/accs/data/Message;->O:Ljava/lang/String;

    if-eqz v2, :cond_1

    .line 231
    iget-object v5, v0, Lcom/taobao/accs/data/d;->a:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v5, v2}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    :cond_1
    iget-object v2, v0, Lcom/taobao/accs/data/d;->d:Lcom/taobao/accs/flowcontrol/FlowControl;

    iget-object v5, v1, Lcom/taobao/accs/data/Message;->H:Ljava/lang/String;

    move-object/from16 v6, p5

    invoke-virtual {v2, v6, v5}, Lcom/taobao/accs/flowcontrol/FlowControl;->a(Ljava/util/Map;Ljava/lang/String;)I

    move-result v2

    const/4 v5, 0x3

    if-eqz v2, :cond_4

    if-ne v2, v4, :cond_2

    .line 233
    sget-object v2, Lcom/taobao/accs/AccsErrorCode;->SERVIER_HIGH_LIMIT:Lcom/alibaba/sdk/android/error/ErrorCode;

    goto :goto_0

    :cond_2
    if-ne v2, v5, :cond_3

    .line 234
    sget-object v2, Lcom/taobao/accs/AccsErrorCode;->SERVIER_HIGH_LIMIT_BRUSH:Lcom/alibaba/sdk/android/error/ErrorCode;

    goto :goto_0

    .line 235
    :cond_3
    sget-object v2, Lcom/taobao/accs/AccsErrorCode;->SERVIER_LOW_LIMIT:Lcom/alibaba/sdk/android/error/ErrorCode;

    :goto_0
    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    goto :goto_1

    :cond_4
    move-object/from16 v2, p2

    move-object/from16 v8, p4

    move-object v9, v6

    move-object/from16 v6, p3

    .line 236
    :goto_1
    sget-object v10, Lcom/taobao/accs/utl/ALog$Level;->D:Lcom/taobao/accs/utl/ALog$Level;

    invoke-static {v10}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    move-result v10

    const-string v11, "command"

    const-string v12, "onResult"

    const/4 v13, 0x1

    if-eqz v10, :cond_5

    .line 237
    iget-object v10, v0, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    const/4 v14, 0x4

    new-array v14, v14, [Ljava/lang/Object;

    aput-object v11, v14, v3

    iget-object v15, v1, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    aput-object v15, v14, v13

    const-string v15, "erorcode"

    aput-object v15, v14, v4

    aput-object v2, v14, v5

    invoke-static {v10, v12, v14}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    :cond_5
    iget-object v10, v1, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    const/16 v14, 0x66

    if-ne v10, v14, :cond_6

    return-void

    .line 239
    :cond_6
    iget-object v10, v1, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    if-ne v10, v13, :cond_7

    invoke-virtual {v2}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v10

    sget-object v14, Lcom/taobao/accs/AccsErrorCode;->SUCCESS:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v14}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v14

    if-ne v10, v14, :cond_8

    .line 240
    :cond_7
    invoke-virtual {v2}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v10

    sget-object v14, Lcom/taobao/accs/AccsErrorCode;->APP_NOT_BIND:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v14}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v14

    if-ne v10, v14, :cond_9

    .line 241
    :cond_8
    iget-object v10, v0, Lcom/taobao/accs/data/d;->k:Lcom/taobao/accs/net/b;

    invoke-virtual {v10}, Lcom/taobao/accs/net/b;->j()Lcom/taobao/accs/client/c;

    move-result-object v10

    iget-object v14, v1, Lcom/taobao/accs/data/Message;->s:Ljava/lang/String;

    invoke-virtual {v10, v14}, Lcom/taobao/accs/client/c;->b(Ljava/lang/String;)V

    .line 242
    :cond_9
    iget-boolean v10, v1, Lcom/taobao/accs/data/Message;->e:Z

    const-wide/16 v14, 0x0

    const-string v7, "accs"

    if-nez v10, :cond_e

    .line 243
    invoke-direct {v0, v2}, Lcom/taobao/accs/data/d;->b(Lcom/alibaba/sdk/android/error/ErrorCode;)Z

    move-result v10

    if-eqz v10, :cond_a

    iget-object v10, v1, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    .line 244
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    const/16 v11, 0x64

    if-eq v10, v11, :cond_a

    iget v10, v1, Lcom/taobao/accs/data/Message;->R:I

    sget v11, Lcom/taobao/accs/data/Message;->a:I

    if-gt v10, v11, :cond_a

    .line 245
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    iput-wide v5, v1, Lcom/taobao/accs/data/Message;->T:J

    .line 246
    iget v5, v1, Lcom/taobao/accs/data/Message;->R:I

    add-int/2addr v5, v13

    iput v5, v1, Lcom/taobao/accs/data/Message;->R:I

    .line 247
    iget-object v6, v0, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    new-array v4, v4, [Ljava/lang/Object;

    const-string v8, "retryTimes"

    aput-object v8, v4, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v13

    invoke-static {v6, v12, v4}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 248
    iget-object v4, v0, Lcom/taobao/accs/data/d;->k:Lcom/taobao/accs/net/b;

    invoke-virtual {v4, v1, v13}, Lcom/taobao/accs/net/b;->b(Lcom/taobao/accs/data/Message;Z)V

    goto/16 :goto_2

    .line 249
    :cond_a
    invoke-direct/range {p0 .. p1}, Lcom/taobao/accs/data/d;->c(Lcom/taobao/accs/data/Message;)Landroid/content/Intent;

    move-result-object v4

    const-string v10, "errorObj"

    .line 250
    invoke-virtual {v4, v10, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 251
    iget-short v10, v1, Lcom/taobao/accs/data/Message;->k:S

    shr-int/lit8 v10, v10, 0xd

    and-int/2addr v5, v10

    invoke-static {v5}, Lcom/taobao/accs/data/Message$ReqType;->valueOf(I)Lcom/taobao/accs/data/Message$ReqType;

    move-result-object v5

    .line 252
    sget-object v10, Lcom/taobao/accs/data/Message$ReqType;->RES:Lcom/taobao/accs/data/Message$ReqType;

    if-eq v6, v10, :cond_b

    sget-object v6, Lcom/taobao/accs/data/Message$ReqType;->REQ:Lcom/taobao/accs/data/Message$ReqType;

    if-ne v5, v6, :cond_c

    :cond_b
    const-string v5, "send_type"

    const-string v6, "res"

    .line 253
    invoke-virtual {v4, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 254
    :cond_c
    invoke-virtual {v2}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v5

    sget-object v6, Lcom/taobao/accs/AccsErrorCode;->SUCCESS:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v6}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v6

    if-ne v5, v6, :cond_d

    const-string v5, "data"

    .line 255
    invoke-virtual {v4, v5, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    .line 256
    :cond_d
    iget-object v5, v0, Lcom/taobao/accs/data/d;->k:Lcom/taobao/accs/net/b;

    iget-object v5, v5, Lcom/taobao/accs/net/b;->b:Ljava/lang/String;

    const-string v6, "appKey"

    invoke-virtual {v4, v6, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 257
    iget-object v5, v0, Lcom/taobao/accs/data/d;->k:Lcom/taobao/accs/net/b;

    iget-object v5, v5, Lcom/taobao/accs/net/b;->m:Ljava/lang/String;

    const-string v6, "configTag"

    invoke-virtual {v4, v6, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 258
    invoke-direct {v0, v9, v4}, Lcom/taobao/accs/data/d;->a(Ljava/util/Map;Landroid/content/Intent;)V

    .line 259
    iget-object v5, v0, Lcom/taobao/accs/data/d;->h:Landroid/content/Context;

    iget-object v6, v0, Lcom/taobao/accs/data/d;->k:Lcom/taobao/accs/net/b;

    invoke-static {v5, v6, v4}, Lcom/taobao/accs/data/g;->a(Landroid/content/Context;Lcom/taobao/accs/net/b;Landroid/content/Intent;)V

    .line 260
    iget-object v4, v1, Lcom/taobao/accs/data/Message;->H:Ljava/lang/String;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_f

    .line 261
    invoke-static {}, Lcom/taobao/accs/utl/UTMini;->getInstance()Lcom/taobao/accs/utl/UTMini;

    move-result-object v16

    const v17, 0x101d1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "commandId="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v1, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "serviceId="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v1, Lcom/taobao/accs/data/Message;->H:Ljava/lang/String;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " errorCode="

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " dataId="

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v1, Lcom/taobao/accs/data/Message;->q:Ljava/lang/String;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    const/16 v4, 0xde

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v21

    const-string v18, "MsgToBuss0"

    invoke-virtual/range {v16 .. v21}, Lcom/taobao/accs/utl/UTMini;->commitEvent(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 262
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "1commandId="

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v1, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v1, Lcom/taobao/accs/data/Message;->H:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "to_buss"

    invoke-static {v7, v5, v4, v14, v15}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitCount(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V

    goto :goto_2

    .line 263
    :cond_e
    iget-object v5, v0, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v11, v4, v3

    iget-object v6, v1, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    aput-object v6, v4, v13

    const-string v6, "onResult message is cancel"

    invoke-static {v5, v6, v4}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 264
    :cond_f
    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    move-result-object v4

    if-eqz v4, :cond_15

    .line 265
    invoke-virtual {v4}, Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;->onToBizDate()V

    .line 266
    iget-object v5, v1, Lcom/taobao/accs/data/Message;->f:Ljava/net/URL;

    if-nez v5, :cond_10

    const/4 v5, 0x0

    goto :goto_3

    :cond_10
    invoke-virtual {v5}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v5

    .line 267
    :goto_3
    invoke-virtual {v2}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v6

    sget-object v8, Lcom/taobao/accs/AccsErrorCode;->SUCCESS:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v8}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v8

    const-string v9, "Request_Success_Rate"

    const-string v10, "resend"

    if-ne v6, v8, :cond_12

    .line 268
    invoke-virtual {v4, v13}, Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;->setRet(Z)V

    .line 269
    iget v3, v1, Lcom/taobao/accs/data/Message;->R:I

    if-lez v3, :cond_11

    const-string v3, "succ"

    .line 270
    invoke-static {v7, v10, v3, v14, v15}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitCount(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V

    .line 271
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "succ_"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v1, Lcom/taobao/accs/data/Message;->R:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v7, v10, v3, v14, v15}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitCount(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V

    goto :goto_5

    .line 272
    :cond_11
    invoke-static {v7, v9, v5}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitAlarmSuccess(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    .line 273
    :cond_12
    iget v6, v1, Lcom/taobao/accs/data/Message;->R:I

    if-lez v6, :cond_13

    .line 274
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "fail\uff3f"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v7, v10, v5, v14, v15}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitCount(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V

    const-string v5, "fail"

    .line 275
    invoke-static {v7, v10, v5, v14, v15}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitCount(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V

    goto :goto_4

    .line 276
    :cond_13
    invoke-virtual {v2}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v6

    sget-object v8, Lcom/taobao/accs/AccsErrorCode;->NO_NETWORK:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v8}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v8

    if-eq v6, v8, :cond_14

    .line 277
    invoke-virtual {v2}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v6

    invoke-static {v6}, Lcom/taobao/accs/utl/UtilityImpl;->a(I)Ljava/lang/String;

    move-result-object v6

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    iget v10, v0, Lcom/taobao/accs/data/d;->b:I

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v10, v1, Lcom/taobao/accs/data/Message;->H:Ljava/lang/String;

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v10, v1, Lcom/taobao/accs/data/Message;->S:I

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 278
    invoke-static {v7, v9, v5, v6, v8}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitAlarmFail(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 279
    :cond_14
    :goto_4
    invoke-virtual {v4, v3}, Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;->setRet(Z)V

    .line 280
    invoke-virtual {v4, v2}, Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;->setFailReason(Lcom/alibaba/sdk/android/error/ErrorCode;)V

    .line 281
    :goto_5
    invoke-static {}, Lanet/channel/appmonitor/AppMonitor;->getInstance()Lanet/channel/appmonitor/IAppMonitor;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    move-result-object v4

    invoke-interface {v3, v4}, Lanet/channel/appmonitor/IAppMonitor;->commitStat(Lanet/channel/statist/StatObject;)V

    .line 282
    :cond_15
    invoke-direct {v0, v1, v2}, Lcom/taobao/accs/data/d;->b(Lcom/taobao/accs/data/Message;Lcom/alibaba/sdk/android/error/ErrorCode;)V

    return-void

    .line 283
    :cond_16
    :goto_6
    iget-object v1, v0, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    new-array v2, v3, [Ljava/lang/Object;

    const-string v3, "onError, skip ping/ack"

    invoke-static {v1, v3, v2}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public a(Lcom/taobao/accs/data/Message;Lcom/alibaba/sdk/android/error/ErrorCode;Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/taobao/accs/data/Message;",
            "Lcom/alibaba/sdk/android/error/ErrorCode;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p3

    .line 228
    invoke-virtual/range {v0 .. v5}, Lcom/taobao/accs/data/d;->a(Lcom/taobao/accs/data/Message;Lcom/alibaba/sdk/android/error/ErrorCode;Lcom/taobao/accs/data/Message$ReqType;[BLjava/util/Map;)V

    return-void
.end method

.method public a(Lcom/taobao/accs/ut/monitor/TrafficsMonitor$a;)V
    .locals 3

    .line 336
    :try_start_0
    invoke-static {}, Lcom/taobao/accs/common/ThreadPoolExecutorFactory;->getScheduledExecutor()Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    move-result-object v0

    new-instance v1, Lcom/taobao/accs/data/e;

    invoke-direct {v1, p0, p1}, Lcom/taobao/accs/data/e;-><init>(Lcom/taobao/accs/data/d;Lcom/taobao/accs/ut/monitor/TrafficsMonitor$a;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 337
    iget-object v0, p0, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addTrafficsInfo"

    invoke-static {v0, v2, p1, v1}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public a([B)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/taobao/accs/data/d;->a([BLjava/lang/String;)V

    return-void
.end method

.method public a([BLjava/lang/String;)V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, ""

    .line 2
    sget-object v1, Lcom/taobao/accs/utl/ALog$Level;->I:Lcom/taobao/accs/utl/ALog$Level;

    invoke-static {v1}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 3
    iget-object v1, p0, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "host"

    aput-object v4, v3, v2

    const/4 v4, 0x1

    aput-object p2, v3, v4

    const-string v4, "onMessage"

    invoke-static {v1, v4, v3}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4
    :cond_0
    new-instance v1, Lcom/taobao/accs/utl/h;

    invoke-direct {v1, p1}, Lcom/taobao/accs/utl/h;-><init>([B)V

    .line 5
    :try_start_0
    invoke-virtual {v1}, Lcom/taobao/accs/utl/h;->a()I

    move-result p1

    and-int/lit16 v3, p1, 0xf0

    shr-int/lit8 v3, v3, 0x4

    .line 6
    sget-object v4, Lcom/taobao/accs/utl/ALog$Level;->D:Lcom/taobao/accs/utl/ALog$Level;

    invoke-static {v4}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 7
    iget-object v5, p0, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "version:"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-array v7, v2, [Ljava/lang/Object;

    invoke-static {v5, v6, v7}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    and-int/lit8 p1, p1, 0xf

    .line 8
    invoke-static {v4}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 9
    iget-object v5, p0, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "compress:"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-array v7, v2, [Ljava/lang/Object;

    invoke-static {v5, v6, v7}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 10
    :cond_2
    invoke-virtual {v1}, Lcom/taobao/accs/utl/h;->a()I

    .line 11
    invoke-virtual {v1}, Lcom/taobao/accs/utl/h;->b()I

    move-result v5

    .line 12
    invoke-static {v4}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 13
    iget-object v4, p0, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "totalLen:"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-array v7, v2, [Ljava/lang/Object;

    invoke-static {v4, v6, v7}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v5, :cond_6

    .line 14
    invoke-virtual {v1}, Lcom/taobao/accs/utl/h;->b()I

    move-result v6

    add-int/lit8 v4, v4, 0x2

    if-lez v6, :cond_5

    .line 15
    new-array v7, v6, [B

    .line 16
    invoke-virtual {v1, v7}, Ljava/io/ByteArrayInputStream;->read([B)I

    .line 17
    sget-object v8, Lcom/taobao/accs/utl/ALog$Level;->D:Lcom/taobao/accs/utl/ALog$Level;

    invoke-static {v8}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    move-result v8

    if-eqz v8, :cond_4

    .line 18
    iget-object v8, p0, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "buf len:"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    new-array v10, v2, [Ljava/lang/Object;

    invoke-static {v8, v9, v10}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_4
    add-int/2addr v4, v6

    .line 19
    invoke-direct {p0, p1, v7, p2, v3}, Lcom/taobao/accs/data/d;->a(I[BLjava/lang/String;I)V

    goto :goto_0

    .line 20
    :cond_5
    new-instance p1, Ljava/io/IOException;

    const-string p2, "data format error"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    :cond_6
    :goto_1
    invoke-virtual {v1}, Ljava/io/ByteArrayInputStream;->close()V

    goto :goto_2

    :catchall_0
    move-exception p1

    :try_start_1
    const-string p2, "accs"

    const-string v3, "send_fail"

    const-string v4, "1"

    .line 22
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget v6, p0, Lcom/taobao/accs/data/d;->b:I

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {p2, v3, v0, v4, v5}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitAlarmFail(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    iget-object p2, p0, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p2, v0, p1, v2}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :goto_2
    return-void

    :catchall_1
    move-exception p1

    .line 24
    invoke-virtual {v1}, Ljava/io/ByteArrayInputStream;->close()V

    .line 25
    throw p1
.end method

.method public b(Ljava/lang/String;)Lcom/taobao/accs/data/Message;
    .locals 3

    .line 33
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 34
    iget-object v0, p0, Lcom/taobao/accs/data/d;->f:Ljava/util/concurrent/ConcurrentMap;

    new-instance v1, Lcom/taobao/accs/data/Message$a;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p1}, Lcom/taobao/accs/data/Message$a;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/taobao/accs/data/Message;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public b()V
    .locals 4

    .line 12
    iget-object v0, p0, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    const-string v1, "onRcvPing"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v3}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 13
    const-class v0, Lcom/taobao/accs/data/d;

    monitor-enter v0

    .line 14
    :try_start_0
    iput-boolean v2, p0, Lcom/taobao/accs/data/d;->g:Z

    .line 15
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public b(Lcom/taobao/accs/data/Message;)V
    .locals 7

    .line 16
    iget-object v0, p0, Lcom/taobao/accs/data/d;->f:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    if-lez v0, :cond_5

    .line 17
    iget-object v0, p0, Lcom/taobao/accs/data/d;->f:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/taobao/accs/data/Message$a;

    .line 18
    iget-object v2, p0, Lcom/taobao/accs/data/d;->f:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v2, v1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/taobao/accs/data/Message;

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_4

    .line 19
    iget-object v4, v1, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    if-eqz v4, :cond_4

    .line 20
    invoke-virtual {v1}, Lcom/taobao/accs/data/Message;->f()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/taobao/accs/data/Message;->f()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 21
    iget-object v4, p1, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    packed-switch v4, :pswitch_data_0

    goto :goto_1

    .line 22
    :pswitch_0
    iget-object v4, v1, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v5, 0x5

    if-eq v4, v5, :cond_1

    iget-object v4, v1, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    .line 23
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v5, 0x6

    if-ne v4, v5, :cond_4

    .line 24
    :cond_1
    iput-boolean v3, v1, Lcom/taobao/accs/data/Message;->e:Z

    goto :goto_1

    .line 25
    :pswitch_1
    iget-object v4, v1, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v5, 0x3

    if-eq v4, v5, :cond_2

    iget-object v4, v1, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    .line 26
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v5, 0x4

    if-ne v4, v5, :cond_4

    .line 27
    :cond_2
    iput-boolean v3, v1, Lcom/taobao/accs/data/Message;->e:Z

    goto :goto_1

    .line 28
    :pswitch_2
    iget-object v4, v1, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-eq v4, v3, :cond_3

    iget-object v4, v1, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    .line 29
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ne v4, v2, :cond_4

    .line 30
    :cond_3
    iput-boolean v3, v1, Lcom/taobao/accs/data/Message;->e:Z

    :cond_4
    :goto_1
    if-eqz v1, :cond_0

    .line 31
    iget-boolean v4, v1, Lcom/taobao/accs/data/Message;->e:Z

    if-eqz v4, :cond_0

    .line 32
    iget-object v4, p0, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v5, 0x0

    const-string v6, "command"

    aput-object v6, v2, v5

    iget-object v1, v1, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    aput-object v1, v2, v3

    const-string v1, "cancelControlMessage"

    invoke-static {v4, v1, v2}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_5
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/taobao/accs/data/d;->g:Z

    return v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/taobao/accs/data/d;->f:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->size()I

    move-result v0

    return v0
.end method

.method public e()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/taobao/accs/data/Message;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/taobao/accs/data/d;->f:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/taobao/accs/data/Message$a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/taobao/accs/data/d;->f:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public g()Lcom/taobao/accs/ut/a/d;
    .locals 1

    iget-object v0, p0, Lcom/taobao/accs/data/d;->i:Lcom/taobao/accs/ut/a/d;

    return-object v0
.end method

.method public h()V
    .locals 4

    .line 1
    :try_start_0
    invoke-static {}, Lcom/taobao/accs/common/ThreadPoolExecutorFactory;->getScheduledExecutor()Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    move-result-object v0

    iget-object v1, p0, Lcom/taobao/accs/data/d;->o:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 2
    iget-object v1, p0, Lcom/taobao/accs/data/d;->l:Ljava/lang/String;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "restoreTraffics"

    invoke-static {v1, v3, v0, v2}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
