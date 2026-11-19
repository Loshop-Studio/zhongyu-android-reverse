.class public Lcom/taobao/accs/data/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile a:Lcom/taobao/accs/data/g;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/taobao/accs/data/g;
    .locals 2

    .line 2
    sget-object v0, Lcom/taobao/accs/data/g;->a:Lcom/taobao/accs/data/g;

    if-nez v0, :cond_1

    .line 3
    const-class v0, Lcom/taobao/accs/data/g;

    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/taobao/accs/data/g;->a:Lcom/taobao/accs/data/g;

    if-nez v1, :cond_0

    .line 5
    new-instance v1, Lcom/taobao/accs/data/g;

    invoke-direct {v1}, Lcom/taobao/accs/data/g;-><init>()V

    sput-object v1, Lcom/taobao/accs/data/g;->a:Lcom/taobao/accs/data/g;

    .line 6
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 7
    :cond_1
    :goto_0
    sget-object v0, Lcom/taobao/accs/data/g;->a:Lcom/taobao/accs/data/g;

    return-object v0
.end method

.method public static a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    const/4 v0, 0x0

    .line 8
    invoke-static {p0, v0, p1}, Lcom/taobao/accs/data/g;->a(Landroid/content/Context;Lcom/taobao/accs/net/b;Landroid/content/Intent;)V

    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/taobao/accs/net/b;Landroid/content/Intent;)V
    .locals 3

    .line 9
    :try_start_0
    invoke-static {}, Lcom/taobao/accs/common/ThreadPoolExecutorFactory;->getScheduledExecutor()Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    move-result-object v0

    new-instance v1, Lcom/taobao/accs/data/h;

    invoke-direct {v1, p0, p1, p2}, Lcom/taobao/accs/data/h;-><init>(Landroid/content/Context;Lcom/taobao/accs/net/b;Landroid/content/Intent;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    const-string v0, "configTag"

    .line 10
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "dataId"

    .line 11
    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 12
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "serviceId"

    .line 13
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/taobao/accs/net/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x3

    .line 14
    invoke-static {v1, p2, v0, v2}, Lcom/taobao/accs/data/Message;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/taobao/accs/data/Message;

    move-result-object p2

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, Lcom/taobao/accs/net/b;->b(Lcom/taobao/accs/data/Message;Z)V

    :cond_0
    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "MsgDistribute"

    const-string v0, "distribMessage"

    .line 15
    invoke-static {p2, v0, p0, p1}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    .line 16
    invoke-static {}, Lcom/taobao/accs/utl/UTMini;->getInstance()Lcom/taobao/accs/utl/UTMini;

    move-result-object p1

    const p2, 0x101d1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/16 v0, 0xde

    .line 18
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "MsgToBuss8"

    .line 19
    invoke-virtual {p1, p2, v1, p0, v0}, Lcom/taobao/accs/utl/UTMini;->commitEvent(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method private a(Landroid/content/Intent;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lcom/alibaba/sdk/android/error/ErrorCode;)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Lcom/taobao/accs/IAppReceiver;",
            ">;",
            "Lcom/alibaba/sdk/android/error/ErrorCode;",
            ")V"
        }
    .end annotation

    move/from16 v0, p3

    move-object/from16 v1, p4

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    move-object/from16 v4, p8

    .line 37
    sget-object v5, Lcom/taobao/accs/utl/ALog$Level;->D:Lcom/taobao/accs/utl/ALog$Level;

    invoke-static {v5}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    move-result v5

    const-string v7, "errorCode"

    const-string v8, "command"

    const/4 v9, 0x4

    const/4 v10, 0x3

    const-string v11, "handleControlMsg"

    const/4 v12, 0x2

    const/4 v13, 0x1

    const/4 v14, 0x0

    const-string v15, "MsgDistribute"

    if-eqz v5, :cond_1

    const/16 v5, 0xa

    new-array v5, v5, [Ljava/lang/Object;

    const-string v16, "configTag"

    aput-object v16, v5, v14

    aput-object p2, v5, v13

    const-string v16, "dataId"

    aput-object v16, v5, v12

    aput-object v3, v5, v10

    const-string v16, "serviceId"

    aput-object v16, v5, v9

    const/16 v16, 0x5

    aput-object v2, v5, v16

    const/16 v16, 0x6

    aput-object v8, v5, v16

    const/16 v16, 0x7

    .line 38
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v17

    aput-object v17, v5, v16

    const/16 v16, 0x8

    aput-object v7, v5, v16

    const/16 v16, 0x9

    aput-object v4, v5, v16

    .line 39
    invoke-static {v15, v11, v5}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz p7, :cond_1

    .line 40
    invoke-virtual/range {p7 .. p7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lcom/taobao/accs/IAppReceiver;

    new-array v6, v12, [Ljava/lang/Object;

    const-string v18, "appReceiver"

    aput-object v18, v6, v14

    if-nez v16, :cond_0

    const/16 v16, 0x0

    goto :goto_1

    .line 41
    :cond_0
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v16

    :goto_1
    aput-object v16, v6, v13

    .line 42
    invoke-static {v15, v11, v6}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual/range {p8 .. p8}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v5

    sget-object v6, Lcom/taobao/accs/AccsErrorCode;->SUCCESS:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v6}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v6

    const/16 v10, 0x65

    const/16 v12, 0x67

    if-eq v5, v6, :cond_2

    if-eq v0, v12, :cond_2

    if-eq v0, v10, :cond_2

    new-array v5, v9, [Ljava/lang/Object;

    aput-object v8, v5, v14

    .line 44
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v13

    const/4 v6, 0x2

    aput-object v7, v5, v6

    const/4 v7, 0x3

    aput-object v4, v5, v7

    invoke-static {v15, v11, v5}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    const/4 v6, 0x2

    const/4 v7, 0x3

    :goto_2
    if-eqz p7, :cond_9

    const-string v5, "code"

    if-eq v0, v13, :cond_8

    if-eq v0, v6, :cond_7

    if-eq v0, v7, :cond_6

    if-eq v0, v9, :cond_5

    const/16 v6, 0x64

    if-eq v0, v6, :cond_4

    if-eq v0, v10, :cond_3

    goto/16 :goto_9

    .line 45
    :cond_3
    invoke-static/range {p5 .. p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_9

    new-array v6, v14, [Ljava/lang/Object;

    const-string v7, "handleControlMsg serviceId isEmpty"

    .line 46
    invoke-static {v15, v7, v6}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v6, "data"

    move-object/from16 v7, p1

    .line 47
    invoke-virtual {v7, v6}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    move-result-object v6

    if-eqz v6, :cond_9

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v5, v7, v14

    aput-object v4, v7, v13

    const-string v5, "onData"

    .line 48
    invoke-static {v15, v5, v7}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    invoke-virtual/range {p7 .. p7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/taobao/accs/IAppReceiver;

    .line 50
    invoke-interface {v7, v1, v3, v6}, Lcom/taobao/accs/IAppReceiver;->onData(Ljava/lang/String;Ljava/lang/String;[B)V

    goto :goto_3

    .line 51
    :cond_4
    invoke-static/range {p5 .. p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_9

    new-array v1, v14, [Ljava/lang/Object;

    const-string v6, "handleControlMsg COMMAND_SEND_DATA serviceId isEmpty"

    .line 52
    invoke-static {v15, v6, v1}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v5, v1, v14

    aput-object v4, v1, v13

    const-string v5, "onSendData"

    .line 53
    invoke-static {v15, v5, v1}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    invoke-virtual/range {p7 .. p7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/taobao/accs/IAppReceiver;

    .line 55
    invoke-virtual/range {p8 .. p8}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v6

    invoke-interface {v5, v3, v6}, Lcom/taobao/accs/IAppReceiver;->onSendData(Ljava/lang/String;I)V

    goto :goto_4

    :cond_5
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v5, v1, v14

    aput-object v4, v1, v13

    const-string v5, "onUnbindUser"

    .line 56
    invoke-static {v15, v5, v1}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    invoke-virtual/range {p7 .. p7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/taobao/accs/IAppReceiver;

    .line 58
    invoke-static {v4, v5}, Lcom/taobao/accs/utl/c;->b(Lcom/alibaba/sdk/android/error/ErrorCode;Lcom/taobao/accs/IAppReceiver;)V

    goto :goto_5

    :cond_6
    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v5, v6, v14

    aput-object v4, v6, v13

    const-string v5, "onBindUser"

    .line 59
    invoke-static {v15, v5, v6}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    invoke-virtual/range {p7 .. p7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/taobao/accs/IAppReceiver;

    .line 61
    invoke-static {v4, v6, v1}, Lcom/taobao/accs/utl/c;->b(Lcom/alibaba/sdk/android/error/ErrorCode;Lcom/taobao/accs/IAppReceiver;Ljava/lang/String;)V

    goto :goto_6

    :cond_7
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v5, v1, v14

    aput-object v4, v1, v13

    const-string v5, "onUnbindApp"

    .line 62
    invoke-static {v15, v5, v1}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    invoke-virtual/range {p7 .. p7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/taobao/accs/IAppReceiver;

    .line 64
    invoke-static {v4, v5}, Lcom/taobao/accs/utl/c;->a(Lcom/alibaba/sdk/android/error/ErrorCode;Lcom/taobao/accs/IAppReceiver;)V

    goto :goto_7

    :cond_8
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v5, v1, v14

    aput-object v4, v1, v13

    const-string v5, "onBindApp"

    .line 65
    invoke-static {v15, v5, v1}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "onBindApp code: "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v5, "ACCS_TEST"

    invoke-static {v5, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 67
    invoke-virtual/range {p7 .. p7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/taobao/accs/IAppReceiver;

    const/4 v6, 0x0

    .line 68
    invoke-static {v4, v5, v6}, Lcom/taobao/accs/utl/c;->a(Lcom/alibaba/sdk/android/error/ErrorCode;Lcom/taobao/accs/IAppReceiver;Ljava/lang/String;)V

    goto :goto_8

    :cond_9
    :goto_9
    if-eqz p7, :cond_a

    .line 69
    invoke-virtual/range {p7 .. p7}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_b

    :cond_a
    const/16 v1, 0x68

    if-eq v0, v1, :cond_b

    if-eq v0, v12, :cond_b

    const-string v1, "accs"

    const-string v5, "send_fail"

    const-string v6, "1"

    const-string v7, "appReceiver null return"

    .line 70
    invoke-static {v1, v5, v2, v6, v7}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitAlarmFail(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    invoke-static {}, Lcom/taobao/accs/utl/UTMini;->getInstance()Lcom/taobao/accs/utl/UTMini;

    move-result-object v1

    const v5, 0x101d1

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "commandId="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "serviceId="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " errorCode="

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " dataId="

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0xde

    .line 72
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "MsgToBuss7"

    move-object/from16 p1, v1

    move/from16 p2, v5

    move-object/from16 p3, v4

    move-object/from16 p4, v0

    move-object/from16 p5, v2

    move-object/from16 p6, v3

    .line 73
    invoke-virtual/range {p1 .. p6}, Lcom/taobao/accs/utl/UTMini;->commitEvent(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_b
    return-void
.end method

.method static synthetic a(Lcom/taobao/accs/data/g;Landroid/content/Context;Lcom/taobao/accs/net/b;Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/taobao/accs/data/g;->b(Landroid/content/Context;Lcom/taobao/accs/net/b;Landroid/content/Intent;)V

    return-void
.end method

.method private a(Landroid/content/Intent;)Z
    .locals 3

    const-string v0, "routingAck"

    const/4 v1, 0x0

    .line 140
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    const-string v2, "routingMsg"

    .line 141
    invoke-virtual {p1, v2, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    return v0
.end method

.method private b(Landroid/content/Context;Lcom/taobao/accs/net/b;Landroid/content/Intent;)V
    .locals 28

    move-object/from16 v10, p0

    move-object/from16 v0, p1

    move-object/from16 v11, p2

    move-object/from16 v12, p3

    const-string v13, "accs"

    const-string v14, "dataId"

    .line 1
    invoke-virtual {v12, v14}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    const-string v9, "serviceId"

    .line 2
    invoke-virtual {v12, v9}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 3
    invoke-virtual/range {p3 .. p3}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    .line 4
    sget-object v2, Lcom/taobao/accs/utl/ALog$Level;->D:Lcom/taobao/accs/utl/ALog$Level;

    invoke-static {v2}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    move-result v2

    const/4 v6, 0x2

    const/4 v5, 0x3

    const/4 v4, 0x1

    const-string v3, "MsgDistribute"

    const/4 v7, 0x0

    if-eqz v2, :cond_0

    const/4 v2, 0x6

    new-array v2, v2, [Ljava/lang/Object;

    const-string v18, "action"

    aput-object v18, v2, v7

    aput-object v1, v2, v4

    aput-object v14, v2, v6

    aput-object v15, v2, v5

    const/16 v17, 0x4

    aput-object v9, v2, v17

    const/16 v16, 0x5

    aput-object v8, v2, v16

    const-string v6, "distribute ready"

    .line 5
    invoke-static {v3, v6, v2}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6
    :cond_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    const/4 v6, 0x0

    if-eqz v2, :cond_2

    if-eqz v11, :cond_1

    .line 7
    invoke-virtual {v11, v6}, Lcom/taobao/accs/net/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v15, v8, v0, v5}, Lcom/taobao/accs/data/Message;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/taobao/accs/data/Message;

    move-result-object v0

    .line 8
    invoke-virtual {v11, v0, v4}, Lcom/taobao/accs/net/b;->b(Lcom/taobao/accs/data/Message;Z)V

    :cond_1
    new-array v0, v7, [Ljava/lang/Object;

    const-string v1, "action null"

    .line 9
    invoke-static {v3, v1, v0}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 10
    invoke-static {}, Lcom/taobao/accs/utl/UTMini;->getInstance()Lcom/taobao/accs/utl/UTMini;

    move-result-object v0

    const/16 v2, 0xde

    .line 11
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "MsgToBuss9"

    const v4, 0x101d1

    .line 12
    invoke-virtual {v0, v4, v3, v1, v2}, Lcom/taobao/accs/utl/UTMini;->commitEvent(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_2
    :try_start_0
    const-string v2, "com.taobao.accs.intent.action.RECEIVE"

    .line 13
    invoke-static {v1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_f

    if-eqz v2, :cond_e

    :try_start_1
    const-string v1, "command"

    const/4 v2, -0x1

    .line 14
    invoke-virtual {v12, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_a

    :try_start_2
    const-string v1, "userInfo"

    .line 15
    invoke-virtual {v12, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 16
    invoke-static/range {p3 .. p3}, Lcom/taobao/accs/common/Constants;->getErrorCode(Landroid/content/Intent;)Lcom/alibaba/sdk/android/error/ErrorCode;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_9

    :try_start_3
    const-string v6, "appKey"

    .line 17
    invoke-virtual {v12, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v5, "configTag"

    .line 18
    invoke-virtual {v12, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 19
    invoke-virtual/range {p3 .. p3}, Landroid/content/Intent;->getPackage()Ljava/lang/String;

    move-result-object v19
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_8

    if-nez v19, :cond_3

    .line 20
    :try_start_4
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v12, v4}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move v7, v2

    move-object v2, v8

    move-object/from16 v27, v9

    move-object/from16 v22, v13

    move-object/from16 v23, v14

    const/4 v1, 0x4

    const/4 v14, 0x0

    const/16 v24, 0x2

    move-object v13, v3

    goto/16 :goto_9

    .line 21
    :cond_3
    :goto_0
    :try_start_5
    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_8

    const-string v19, "config"

    const-string v20, "appkey"

    const-string v7, "distribute start"

    if-eqz v4, :cond_4

    move-object/from16 v25, v1

    const/4 v4, 0x4

    :try_start_6
    new-array v1, v4, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v20, v1, v4

    const/4 v4, 0x1

    aput-object v6, v1, v4

    const/4 v4, 0x2

    aput-object v19, v1, v4

    const/4 v4, 0x3

    aput-object v5, v1, v4

    .line 22
    invoke-static {v3, v7, v1}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    const/4 v4, 0x4

    goto :goto_1

    :cond_4
    move-object/from16 v25, v1

    const/4 v4, 0x4

    :try_start_7
    new-array v1, v4, [Ljava/lang/Object;

    const/16 v17, 0x0

    aput-object v20, v1, v17

    const/16 v17, 0x1

    aput-object v6, v1, v17

    const/4 v6, 0x2

    aput-object v19, v1, v6

    const/4 v6, 0x3

    aput-object v5, v1, v6

    .line 23
    invoke-static {v3, v7, v1}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 24
    :goto_1
    invoke-direct {v10, v12}, Lcom/taobao/accs/data/g;->a(Landroid/content/Intent;)Z

    move-result v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_8

    if-eqz v1, :cond_5

    :try_start_8
    const-string v0, "routingMsgAck, should not happen!"

    const/4 v1, 0x0

    new-array v5, v1, [Ljava/lang/Object;

    .line 25
    invoke-static {v3, v0, v5}, Lcom/taobao/accs/utl/ALog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    return-void

    :cond_5
    if-gez v2, :cond_7

    if-eqz v11, :cond_6

    const/4 v1, 0x0

    .line 26
    :try_start_9
    invoke-virtual {v11, v1}, Lcom/taobao/accs/net/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    const/4 v1, 0x3

    .line 27
    :try_start_a
    invoke-static {v15, v8, v0, v1}, Lcom/taobao/accs/data/Message;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/taobao/accs/data/Message;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v11, v0, v1}, Lcom/taobao/accs/net/b;->b(Lcom/taobao/accs/data/Message;Z)V

    goto :goto_2

    :catchall_1
    move-exception v0

    move v7, v2

    move-object v2, v8

    move-object/from16 v27, v9

    move-object/from16 v22, v13

    move-object/from16 v23, v14

    const/16 v24, 0x2

    move-object v14, v1

    move-object v13, v3

    goto/16 :goto_8

    .line 28
    :cond_6
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "command error:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v6, 0x2

    new-array v1, v6, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v9, v1, v5

    const/4 v5, 0x1

    aput-object v8, v1, v5

    invoke-static {v3, v0, v1}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    return-void

    :cond_7
    const/4 v6, 0x2

    .line 29
    :try_start_b
    invoke-virtual {v10, v2, v8}, Lcom/taobao/accs/data/g;->a(ILjava/lang/String;)Z

    move-result v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    if-eqz v1, :cond_9

    if-eqz v11, :cond_8

    const/4 v7, 0x0

    .line 30
    :try_start_c
    invoke-virtual {v11, v7}, Lcom/taobao/accs/net/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    .line 31
    invoke-static {v15, v8, v0, v1}, Lcom/taobao/accs/data/Message;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/taobao/accs/data/Message;

    move-result-object v0

    const/4 v5, 0x1

    invoke-virtual {v11, v0, v5}, Lcom/taobao/accs/net/b;->b(Lcom/taobao/accs/data/Message;Z)V

    goto :goto_3

    :catchall_2
    move-exception v0

    move-object/from16 v27, v9

    move-object/from16 v22, v13

    move-object/from16 v23, v14

    const/4 v1, 0x4

    const/16 v24, 0x2

    move-object v13, v3

    move-object v14, v7

    const/4 v3, 0x0

    move v7, v2

    move-object v2, v8

    goto/16 :goto_f

    :cond_8
    const/4 v1, 0x3

    const/4 v5, 0x1

    const/4 v7, 0x0

    :goto_3
    const-string v0, "check space failed"

    const/4 v12, 0x0

    new-array v1, v12, [Ljava/lang/Object;

    .line 32
    invoke-static {v3, v0, v1}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    return-void

    :cond_9
    const/4 v7, 0x0

    const/16 v17, 0x1

    .line 33
    :try_start_d
    invoke-direct {v10, v0, v12}, Lcom/taobao/accs/data/g;->b(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result v1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    if-eqz v1, :cond_a

    :try_start_e
    const-string v0, "routingMsg, should not happen!"

    const/4 v1, 0x0

    new-array v5, v1, [Ljava/lang/Object;

    .line 34
    invoke-static {v3, v0, v5}, Lcom/taobao/accs/utl/ALog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    return-void

    :cond_a
    const/4 v1, 0x0

    .line 35
    :try_start_f
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v18
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    if-nez v18, :cond_b

    .line 36
    :try_start_10
    invoke-static {}, Lcom/taobao/accs/client/a;->a()Lcom/taobao/accs/client/a;

    move-result-object v1

    invoke-virtual {v1, v5}, Lcom/taobao/accs/client/a;->a(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_2

    move-object/from16 v18, v1

    goto :goto_4

    :cond_b
    move-object/from16 v18, v7

    :goto_4
    const/16 v19, 0x3

    const/16 v20, 0x0

    move-object/from16 v1, p0

    move/from16 v21, v2

    move-object/from16 v2, p1

    move-object/from16 v22, v13

    move-object v13, v3

    move-object v3, v8

    move-object/from16 v23, v14

    const/4 v14, 0x1

    const/16 v17, 0x4

    move-object v4, v15

    move-object/from16 v19, v5

    move-object/from16 v5, p3

    const/16 v24, 0x2

    move-object/from16 v6, v18

    .line 37
    :try_start_11
    invoke-virtual/range {v1 .. v6}, Lcom/taobao/accs/data/g;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;Ljava/util/ArrayList;)Z

    move-result v1

    if-eqz v1, :cond_c

    return-void

    :cond_c
    const-string v1, "ACCS_TEST"

    const-string v2, "handleControlMsg"

    .line 38
    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_6

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, v19

    move/from16 v4, v21

    move-object/from16 v5, v16

    move-object v6, v8

    move-object v14, v7

    move-object v7, v15

    move-object/from16 v26, v8

    move-object/from16 v8, v18

    move-object/from16 v27, v9

    move-object/from16 v9, v25

    .line 39
    :try_start_12
    invoke-direct/range {v1 .. v9}, Lcom/taobao/accs/data/g;->a(Landroid/content/Intent;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lcom/alibaba/sdk/android/error/ErrorCode;)V

    .line 40
    invoke-static/range {v26 .. v26}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_5

    if-nez v1, :cond_d

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, v18

    move-object/from16 v5, p3

    move-object/from16 v6, v26

    move-object v7, v15

    move/from16 v8, v21

    move-object/from16 v9, v25

    .line 41
    :try_start_13
    invoke-virtual/range {v1 .. v9}, Lcom/taobao/accs/data/g;->a(Landroid/content/Context;Lcom/taobao/accs/net/b;Ljava/util/ArrayList;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;ILcom/alibaba/sdk/android/error/ErrorCode;)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_3

    goto/16 :goto_10

    :catchall_3
    move-exception v0

    move/from16 v7, v21

    goto :goto_6

    :cond_d
    move/from16 v1, v21

    move-object/from16 v2, v25

    .line 42
    :try_start_14
    invoke-virtual {v10, v0, v12, v1, v2}, Lcom/taobao/accs/data/g;->a(Landroid/content/Context;Landroid/content/Intent;ILcom/alibaba/sdk/android/error/ErrorCode;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_4

    goto/16 :goto_10

    :catchall_4
    move-exception v0

    goto :goto_5

    :catchall_5
    move-exception v0

    move/from16 v1, v21

    :goto_5
    move v7, v1

    :goto_6
    move-object/from16 v2, v26

    goto :goto_8

    :catchall_6
    move-exception v0

    move-object v14, v7

    move-object/from16 v27, v9

    move/from16 v1, v21

    goto :goto_7

    :catchall_7
    move-exception v0

    move v1, v2

    move-object/from16 v27, v9

    move-object/from16 v22, v13

    move-object/from16 v23, v14

    const/16 v24, 0x2

    move-object v13, v3

    move-object v14, v7

    goto :goto_7

    :catchall_8
    move-exception v0

    move v1, v2

    move-object/from16 v27, v9

    move-object/from16 v22, v13

    move-object/from16 v23, v14

    const/4 v14, 0x0

    const/16 v24, 0x2

    move-object v13, v3

    goto :goto_7

    :catchall_9
    move-exception v0

    move v1, v2

    move-object/from16 v27, v9

    move-object/from16 v22, v13

    move-object/from16 v23, v14

    const/16 v24, 0x2

    move-object v13, v3

    move-object v14, v6

    :goto_7
    move v7, v1

    move-object v2, v8

    :goto_8
    const/4 v1, 0x4

    :goto_9
    const/4 v3, 0x0

    goto/16 :goto_f

    :catchall_a
    move-exception v0

    move-object/from16 v27, v9

    move-object/from16 v22, v13

    move-object/from16 v23, v14

    const/16 v24, 0x2

    move-object v13, v3

    move-object v14, v6

    move-object v2, v8

    :goto_a
    const/4 v1, 0x4

    const/4 v3, 0x0

    goto :goto_e

    :cond_e
    move-object/from16 v26, v8

    move-object/from16 v27, v9

    move-object/from16 v22, v13

    move-object/from16 v23, v14

    const/16 v24, 0x2

    move-object v13, v3

    move-object v14, v6

    if-eqz v11, :cond_f

    .line 43
    :try_start_15
    invoke-virtual {v11, v14}, Lcom/taobao/accs/net/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_c

    move-object/from16 v2, v26

    const/4 v3, 0x5

    .line 44
    :try_start_16
    invoke-static {v15, v2, v0, v3}, Lcom/taobao/accs/data/Message;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/taobao/accs/data/Message;

    move-result-object v0

    const/4 v3, 0x1

    .line 45
    invoke-virtual {v11, v0, v3}, Lcom/taobao/accs/net/b;->b(Lcom/taobao/accs/data/Message;Z)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_b

    goto :goto_b

    :catchall_b
    move-exception v0

    goto :goto_a

    :catchall_c
    move-exception v0

    move-object/from16 v2, v26

    goto :goto_a

    :cond_f
    move-object/from16 v2, v26

    :goto_b
    :try_start_17
    const-string v0, "distribMessage action error"
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_e

    const/4 v3, 0x0

    :try_start_18
    new-array v4, v3, [Ljava/lang/Object;

    .line 46
    invoke-static {v13, v0, v4}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    invoke-static {}, Lcom/taobao/accs/utl/UTMini;->getInstance()Lcom/taobao/accs/utl/UTMini;

    move-result-object v0

    const-string v4, "MsgToBuss10"

    const/16 v5, 0xde

    .line 48
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const v6, 0x101d1

    .line 49
    invoke-virtual {v0, v6, v4, v1, v5}, Lcom/taobao/accs/utl/UTMini;->commitEvent(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_d

    goto :goto_10

    :catchall_d
    move-exception v0

    goto :goto_d

    :catchall_e
    move-exception v0

    goto :goto_c

    :catchall_f
    move-exception v0

    move-object v2, v8

    move-object/from16 v27, v9

    move-object/from16 v22, v13

    move-object/from16 v23, v14

    const/16 v24, 0x2

    move-object v13, v3

    move-object v14, v6

    :goto_c
    const/4 v3, 0x0

    :goto_d
    const/4 v1, 0x4

    :goto_e
    const/4 v7, 0x0

    :goto_f
    new-array v1, v1, [Ljava/lang/Object;

    aput-object v23, v1, v3

    const/4 v3, 0x1

    aput-object v15, v1, v3

    aput-object v27, v1, v24

    const/4 v4, 0x3

    aput-object v2, v1, v4

    const-string v5, "distribMessage"

    .line 50
    invoke-static {v13, v5, v0, v1}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    if-eqz v11, :cond_10

    .line 51
    invoke-virtual {v11, v14}, Lcom/taobao/accs/net/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v15, v2, v1, v4}, Lcom/taobao/accs/data/Message;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/taobao/accs/data/Message;

    move-result-object v1

    .line 52
    invoke-virtual {v11, v1, v3}, Lcom/taobao/accs/net/b;->b(Lcom/taobao/accs/data/Message;Z)V

    .line 53
    :cond_10
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "distribute error "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 54
    invoke-static {v0}, Lcom/taobao/accs/utl/UtilityImpl;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "send_fail"

    const-string v3, "1"

    move-object/from16 v4, v22

    .line 55
    invoke-static {v4, v1, v2, v3, v0}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitAlarmFail(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_10
    return-void
.end method

.method private b(Landroid/content/Context;Landroid/content/Intent;)Z
    .locals 0

    .line 57
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Landroid/content/Intent;->getPackage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method


# virtual methods
.method protected a(Landroid/content/Context;Landroid/content/Intent;ILcom/alibaba/sdk/android/error/ErrorCode;)V
    .locals 11

    const/4 v0, 0x2

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "command"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 99
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v4, 0x1

    aput-object v2, v1, v4

    const-string v2, "MsgDistribute"

    const-string v5, "handBroadCastMsg"

    invoke-static {v2, v5, v1}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 101
    invoke-static {}, Lcom/taobao/accs/client/a;->a()Lcom/taobao/accs/client/a;

    move-result-object v5

    invoke-virtual {v5}, Lcom/taobao/accs/client/a;->b()Ljava/util/ArrayList;

    move-result-object v5

    if-eqz v5, :cond_1

    .line 102
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/taobao/accs/IAppReceiver;

    .line 103
    invoke-interface {v6}, Lcom/taobao/accs/IAppReceiver;->getAllServices()Ljava/util/Map;

    move-result-object v6

    if-eqz v6, :cond_0

    .line 104
    invoke-interface {v1, v6}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    goto :goto_0

    :cond_1
    const/16 v5, 0x67

    if-ne p3, v5, :cond_9

    .line 105
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_2
    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const-string v6, "accs"

    .line 106
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    const-string v6, "windvane"

    .line 107
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    const-string v6, "motu-remote"

    .line 108
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 109
    :cond_3
    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 110
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_4

    .line 111
    invoke-static {p1}, Lcom/taobao/accs/client/GlobalClientInfo;->getInstance(Landroid/content/Context;)Lcom/taobao/accs/client/GlobalClientInfo;

    move-result-object v6

    invoke-virtual {v6, v5}, Lcom/taobao/accs/client/GlobalClientInfo;->getService(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 112
    :cond_4
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 113
    invoke-virtual {p2, p1, v6}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 114
    invoke-static {p1, p2, v6}, Lcom/taobao/accs/dispatch/IntentDispatch;->dispatchIntent(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    const-string p3, "connect_avail"

    .line 115
    invoke-virtual {p2, p3, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p3

    const-string v1, "host"

    .line 116
    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v1, "type_inapp"

    .line 117
    invoke-virtual {p2, v1, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v7

    const-string v1, "is_center_host"

    .line 118
    invoke-virtual {p2, v1, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v8

    const/4 p2, 0x0

    .line 119
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_7

    if-eqz p3, :cond_6

    .line 120
    new-instance p2, Lcom/taobao/accs/base/TaoBaseService$ConnectInfo;

    invoke-direct {p2, v6, v7, v8}, Lcom/taobao/accs/base/TaoBaseService$ConnectInfo;-><init>(Ljava/lang/String;ZZ)V

    goto :goto_2

    :cond_6
    new-array p2, v0, [Ljava/lang/Object;

    const-string v0, "error"

    aput-object v0, p2, v3

    aput-object p4, p2, v4

    const-string v0, "InAppConnection Not Available "

    .line 121
    invoke-static {v2, v0, p2}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    new-instance p2, Lcom/taobao/accs/base/TaoBaseService$ConnectInfo;

    .line 123
    invoke-virtual {p4}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v9

    invoke-virtual {p4}, Lcom/alibaba/sdk/android/error/ErrorCode;->getMsg()Ljava/lang/String;

    move-result-object v10

    move-object v5, p2

    invoke-direct/range {v5 .. v10}, Lcom/taobao/accs/base/TaoBaseService$ConnectInfo;-><init>(Ljava/lang/String;ZZILjava/lang/String;)V

    .line 124
    :goto_2
    iput-boolean p3, p2, Lcom/taobao/accs/base/TaoBaseService$ConnectInfo;->connected:Z

    :cond_7
    if-eqz p2, :cond_8

    new-array p3, v4, [Ljava/lang/Object;

    aput-object p2, p3, v3

    const-string p4, "handBroadCastMsg ACTION_CONNECT_INFO"

    .line 125
    invoke-static {v2, p4, p3}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    new-instance p3, Landroid/content/Intent;

    const-string p4, "com.taobao.accs.intent.action.CONNECTINFO"

    invoke-direct {p3, p4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 127
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const-string p4, "connect_info"

    .line 128
    invoke-virtual {p3, p4, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 129
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ".ACCS"

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    goto/16 :goto_5

    :cond_8
    new-array p1, v3, [Ljava/lang/Object;

    const-string p2, "handBroadCastMsg connect info null, host empty"

    .line 130
    invoke-static {v2, p2, p1}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_9
    const/16 p4, 0x68

    if-ne p3, p4, :cond_c

    .line 131
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_a
    :goto_3
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_f

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/String;

    .line 132
    invoke-interface {v1, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 133
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_b

    .line 134
    invoke-static {p1}, Lcom/taobao/accs/client/GlobalClientInfo;->getInstance(Landroid/content/Context;)Lcom/taobao/accs/client/GlobalClientInfo;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/taobao/accs/client/GlobalClientInfo;->getService(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 135
    :cond_b
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p4

    if-nez p4, :cond_a

    .line 136
    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 137
    invoke-static {p1, p2, v0}, Lcom/taobao/accs/dispatch/IntentDispatch;->dispatchIntent(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V

    goto :goto_3

    :cond_c
    const-string p1, "handBroadCastMsg not handled command "

    if-eq p3, v4, :cond_e

    if-eq p3, v0, :cond_e

    const/4 p2, 0x3

    if-eq p3, p2, :cond_e

    const/4 p2, 0x4

    if-eq p3, p2, :cond_e

    const/4 p2, 0x5

    if-eq p3, p2, :cond_e

    const/4 p2, 0x6

    if-ne p3, p2, :cond_d

    goto :goto_4

    .line 138
    :cond_d
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array p2, v3, [Ljava/lang/Object;

    invoke-static {v2, p1, p2}, Lcom/taobao/accs/utl/ALog;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_5

    .line 139
    :cond_e
    :goto_4
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array p2, v3, [Ljava/lang/Object;

    invoke-static {v2, p1, p2}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_f
    :goto_5
    return-void
.end method

.method protected a(Landroid/content/Context;Lcom/taobao/accs/net/b;Ljava/util/ArrayList;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;ILcom/alibaba/sdk/android/error/ErrorCode;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/taobao/accs/net/b;",
            "Ljava/util/ArrayList<",
            "Lcom/taobao/accs/IAppReceiver;",
            ">;",
            "Landroid/content/Intent;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Lcom/alibaba/sdk/android/error/ErrorCode;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "dataId"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object p6, v0, v1

    const-string v3, "serviceId"

    const/4 v4, 0x2

    aput-object v3, v0, v4

    const/4 v3, 0x3

    aput-object p5, v0, v3

    const/4 v3, 0x4

    const-string v5, "command"

    aput-object v5, v0, v3

    .line 74
    invoke-static {p7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v5, 0x5

    aput-object v3, v0, v5

    const-string v3, "MsgDistribute"

    const-string v5, "handleBusinessMsg start"

    .line 75
    invoke-static {v3, v5, v0}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    .line 76
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p3

    move-object v5, v0

    :cond_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/taobao/accs/IAppReceiver;

    .line 77
    invoke-interface {v5, p5}, Lcom/taobao/accs/IAppReceiver;->getService(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 78
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_0

    goto :goto_0

    :cond_1
    move-object v5, v0

    .line 79
    :cond_2
    :goto_0
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-eqz p3, :cond_3

    .line 80
    invoke-static {p1}, Lcom/taobao/accs/client/GlobalClientInfo;->getInstance(Landroid/content/Context;)Lcom/taobao/accs/client/GlobalClientInfo;

    move-result-object p3

    invoke-virtual {p3, p5}, Lcom/taobao/accs/client/GlobalClientInfo;->getService(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 81
    :cond_3
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    const-string v6, "accs"

    if-nez p3, :cond_5

    .line 82
    sget-object p2, Lcom/taobao/accs/utl/ALog$Level;->D:Lcom/taobao/accs/utl/ALog$Level;

    invoke-static {p2}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    move-result p2

    if-eqz p2, :cond_4

    new-array p2, v4, [Ljava/lang/Object;

    const-string p3, "className"

    aput-object p3, p2, v2

    aput-object v5, p2, v1

    const-string p3, "handleBusinessMsg to start service"

    .line 83
    invoke-static {v3, p3, p2}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    :cond_4
    invoke-virtual {p4, p1, v5}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 85
    invoke-static {p1, p4, v5}, Lcom/taobao/accs/dispatch/IntentDispatch;->dispatchIntent(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V

    goto :goto_1

    .line 86
    :cond_5
    invoke-static {p1}, Lcom/taobao/accs/client/GlobalClientInfo;->getInstance(Landroid/content/Context;)Lcom/taobao/accs/client/GlobalClientInfo;

    move-result-object p3

    invoke-virtual {p3, p5}, Lcom/taobao/accs/client/GlobalClientInfo;->getListener(Ljava/lang/String;)Lcom/taobao/accs/base/AccsAbstractDataListener;

    move-result-object p3

    if-eqz p3, :cond_7

    .line 87
    sget-object p2, Lcom/taobao/accs/utl/ALog$Level;->D:Lcom/taobao/accs/utl/ALog$Level;

    invoke-static {p2}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    move-result p2

    if-eqz p2, :cond_6

    new-array p2, v2, [Ljava/lang/Object;

    const-string v0, "handleBusinessMsg getListener not null"

    .line 88
    invoke-static {v3, v0, p2}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    :cond_6
    invoke-static {p1, p4, p3}, Lcom/taobao/accs/base/AccsAbstractDataListener;->onReceiveData(Landroid/content/Context;Landroid/content/Intent;Lcom/taobao/accs/base/AccsDataListenerV2;)I

    goto :goto_1

    :cond_7
    if-eqz p2, :cond_8

    .line 90
    invoke-virtual {p2, v0}, Lcom/taobao/accs/net/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 91
    invoke-static {p6, p5, p1, v2}, Lcom/taobao/accs/data/Message;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/taobao/accs/data/Message;

    move-result-object p1

    .line 92
    invoke-virtual {p2, p1, v1}, Lcom/taobao/accs/net/b;->b(Lcom/taobao/accs/data/Message;Z)V

    :cond_8
    new-array p1, v2, [Ljava/lang/Object;

    const-string p2, "handleBusinessMsg getListener also null"

    .line 93
    invoke-static {v3, p2, p1}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const-string p1, "send_fail"

    const-string p2, "1"

    const-string p3, "service is null"

    .line 94
    invoke-static {v6, p1, p5, p2, p3}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitAlarmFail(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    :goto_1
    invoke-static {}, Lcom/taobao/accs/utl/UTMini;->getInstance()Lcom/taobao/accs/utl/UTMini;

    move-result-object v0

    const v1, 0x101d1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "commandId="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "serviceId="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " errorCode="

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " dataId="

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/16 p1, 0xde

    .line 96
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v2, "MsgToBuss"

    .line 97
    invoke-virtual/range {v0 .. v5}, Lcom/taobao/accs/utl/UTMini;->commitEvent(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 98
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "2commandId="

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-wide/16 p2, 0x0

    const-string p4, "to_buss"

    invoke-static {v6, p4, p1, p2, p3}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitCount(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V

    return-void
.end method

.method protected a(ILjava/lang/String;)Z
    .locals 7

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/16 v2, 0x64

    if-eq p1, v2, :cond_0

    const-string p1, "agooSend"

    .line 20
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 21
    invoke-static {}, Lcom/taobao/accs/utl/UtilityImpl;->c()J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long p1, v2, v4

    if-eqz p1, :cond_0

    const-wide/32 v4, 0x500000

    cmp-long p1, v2, v4

    if-gtz p1, :cond_0

    .line 22
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "space low "

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v4, "accs"

    const-string v5, "send_fail"

    const-string v6, "1"

    invoke-static {v4, v5, p2, v6, p1}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitAlarmFail(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x4

    new-array p1, p1, [Ljava/lang/Object;

    const-string v4, "size"

    aput-object v4, p1, v1

    .line 23
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    aput-object v1, p1, v0

    const/4 v1, 0x2

    const-string v2, "serviceId"

    aput-object v2, p1, v1

    const/4 v1, 0x3

    aput-object p2, p1, v1

    const-string p2, "MsgDistribute"

    const-string v1, "user space low, don\'t distribute"

    invoke-static {p2, v1, p1}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;Ljava/util/ArrayList;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Landroid/content/Intent;",
            "Ljava/util/ArrayList<",
            "Lcom/taobao/accs/IAppReceiver;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "MsgDistribute"

    const/4 v1, 0x0

    .line 24
    :try_start_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-eqz p5, :cond_2

    .line 25
    invoke-virtual {p5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p5

    :cond_1
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/taobao/accs/IAppReceiver;

    .line 26
    invoke-interface {v2, p2}, Lcom/taobao/accs/IAppReceiver;->getService(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 27
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 28
    :cond_2
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p5

    if-eqz p5, :cond_3

    .line 29
    invoke-static {p1}, Lcom/taobao/accs/client/GlobalClientInfo;->getInstance(Landroid/content/Context;)Lcom/taobao/accs/client/GlobalClientInfo;

    move-result-object p5

    invoke-virtual {p5, p2}, Lcom/taobao/accs/client/GlobalClientInfo;->getService(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 30
    :cond_3
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p5

    const/4 v2, 0x1

    if-eqz p5, :cond_5

    invoke-static {p1}, Lcom/taobao/accs/utl/AdapterUtilityImpl;->isTargetProcess(Landroid/content/Context;)Z

    move-result p5

    if-nez p5, :cond_5

    const-string p5, "accs"

    .line 31
    invoke-virtual {p5, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string p5, "dataId"

    const/4 v3, 0x2

    const-string v4, "start MsgDistributeService"

    if-eqz p2, :cond_4

    :try_start_1
    new-array p2, v3, [Ljava/lang/Object;

    aput-object p5, p2, v1

    aput-object p3, p2, v2

    .line 32
    invoke-static {v0, v4, p2}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    new-array p2, v3, [Ljava/lang/Object;

    aput-object p5, p2, v1

    aput-object p3, p2, v2

    .line 33
    invoke-static {v0, v4, p2}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    :goto_0
    invoke-virtual {p4}, Landroid/content/Intent;->getPackage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lcom/taobao/accs/data/g;->b()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p4, p2, p3}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 35
    invoke-virtual {p0}, Lcom/taobao/accs/data/g;->b()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p4, p2}, Lcom/taobao/accs/dispatch/IntentDispatch;->dispatchIntent(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v1, 0x1

    goto :goto_1

    :catchall_0
    move-exception p1

    new-array p2, v1, [Ljava/lang/Object;

    const-string p3, "handleMsgInChannelProcess"

    .line 36
    invoke-static {v0, p3, p1, p2}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    :cond_5
    :goto_1
    return v1
.end method

.method protected b()Ljava/lang/String;
    .locals 1

    .line 56
    sget-object v0, Lcom/taobao/accs/utl/AdapterUtilityImpl;->msgService:Ljava/lang/String;

    return-object v0
.end method
