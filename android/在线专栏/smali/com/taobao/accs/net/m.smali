.class Lcom/taobao/accs/net/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/taobao/accs/data/Message;

.field final synthetic b:Lcom/taobao/accs/net/j;


# direct methods
.method constructor <init>(Lcom/taobao/accs/net/j;Lcom/taobao/accs/data/Message;)V
    .locals 0

    iput-object p1, p0, Lcom/taobao/accs/net/m;->b:Lcom/taobao/accs/net/j;

    iput-object p2, p0, Lcom/taobao/accs/net/m;->a:Lcom/taobao/accs/data/Message;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 26

    move-object/from16 v1, p0

    const-string v2, "sendMessage"

    const-string v0, "type"

    const-string v3, "accs"

    const-string v4, "status"

    const-string v5, "sendMessage end"

    const-string v6, "dataId"

    .line 1
    iget-object v7, v1, Lcom/taobao/accs/net/m;->a:Lcom/taobao/accs/data/Message;

    if-eqz v7, :cond_10

    .line 2
    invoke-virtual {v7}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    move-result-object v7

    if-eqz v7, :cond_0

    .line 3
    iget-object v7, v1, Lcom/taobao/accs/net/m;->a:Lcom/taobao/accs/data/Message;

    invoke-virtual {v7}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    move-result-object v7

    invoke-virtual {v7}, Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;->onTakeFromQueue()V

    .line 4
    :cond_0
    sget-object v7, Lcom/taobao/accs/AccsErrorCode;->SUCCESS:Lcom/alibaba/sdk/android/error/ErrorCode;

    .line 5
    iget-object v8, v1, Lcom/taobao/accs/net/m;->a:Lcom/taobao/accs/data/Message;

    invoke-virtual {v8}, Lcom/taobao/accs/data/Message;->a()I

    move-result v8

    const/4 v10, 0x5

    const/4 v11, 0x3

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/4 v14, 0x1

    .line 6
    :try_start_0
    iget-object v15, v1, Lcom/taobao/accs/net/m;->b:Lcom/taobao/accs/net/j;

    invoke-static {v15}, Lcom/taobao/accs/net/j;->a(Lcom/taobao/accs/net/j;)Lcom/alibaba/sdk/android/logger/ILog;

    move-result-object v15

    new-array v9, v10, [Ljava/lang/Object;

    const-string v17, "sendMessage start"

    aput-object v17, v9, v13

    aput-object v6, v9, v14

    iget-object v10, v1, Lcom/taobao/accs/net/m;->a:Lcom/taobao/accs/data/Message;

    iget-object v10, v10, Lcom/taobao/accs/data/Message;->q:Ljava/lang/String;

    aput-object v10, v9, v12

    aput-object v0, v9, v11

    .line 7
    invoke-static {v8}, Lcom/taobao/accs/data/Message$c;->b(I)Ljava/lang/String;

    move-result-object v10

    const/16 v16, 0x4

    aput-object v10, v9, v16

    .line 8
    invoke-interface {v15, v9}, Lcom/alibaba/sdk/android/logger/ILog;->d([Ljava/lang/Object;)V

    if-ne v8, v14, :cond_a

    .line 9
    iget-object v0, v1, Lcom/taobao/accs/net/m;->a:Lcom/taobao/accs/data/Message;

    iget-object v10, v0, Lcom/taobao/accs/data/Message;->f:Ljava/net/URL;

    if-nez v10, :cond_1

    .line 10
    iget-object v10, v1, Lcom/taobao/accs/net/m;->b:Lcom/taobao/accs/net/j;

    iget-object v10, v10, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    sget-object v15, Lcom/taobao/accs/AccsErrorCode;->MESSAGE_HOST_NULL:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v10, v0, v15}, Lcom/taobao/accs/data/d;->a(Lcom/taobao/accs/data/Message;Lcom/alibaba/sdk/android/error/ErrorCode;)V

    :goto_0
    const/4 v0, 0x1

    goto/16 :goto_6

    .line 11
    :cond_1
    iget-object v0, v1, Lcom/taobao/accs/net/m;->b:Lcom/taobao/accs/net/j;

    iget-object v0, v0, Lcom/taobao/accs/net/b;->i:Lcom/taobao/accs/AccsClientConfig;

    .line 12
    invoke-virtual {v0}, Lcom/taobao/accs/AccsClientConfig;->getAppKey()Ljava/lang/String;

    move-result-object v0

    .line 13
    invoke-static {v0}, Lanet/channel/SessionCenter;->getInstance(Ljava/lang/String;)Lanet/channel/SessionCenter;

    move-result-object v0

    .line 14
    iget-object v10, v1, Lcom/taobao/accs/net/m;->b:Lcom/taobao/accs/net/j;

    iget-object v15, v1, Lcom/taobao/accs/net/m;->a:Lcom/taobao/accs/data/Message;

    iget-object v15, v15, Lcom/taobao/accs/data/Message;->f:Ljava/net/URL;

    invoke-virtual {v15}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v10, v0, v15, v13}, Lcom/taobao/accs/net/j;->a(Lanet/channel/SessionCenter;Ljava/lang/String;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 15
    :try_start_1
    iget-object v10, v1, Lcom/taobao/accs/net/m;->a:Lcom/taobao/accs/data/Message;

    iget-object v10, v10, Lcom/taobao/accs/data/Message;->f:Ljava/net/URL;

    .line 16
    invoke-virtual {v10}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v10

    sget-object v15, Lanet/channel/entity/ConnType$TypeLevel;->SPDY:Lanet/channel/entity/ConnType$TypeLevel;

    const-wide/32 v11, 0xea60

    .line 17
    invoke-virtual {v0, v10, v15, v11, v12}, Lanet/channel/SessionCenter;->getThrowsException(Ljava/lang/String;Lanet/channel/entity/ConnType$TypeLevel;J)Lanet/channel/Session;

    move-result-object v0
    :try_end_1
    .catch Ljava/security/InvalidParameterException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/net/ConnectException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lanet/channel/NoAvailStrategyException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_2

    :catchall_0
    move-exception v0

    .line 18
    :try_start_2
    iget-object v7, v1, Lcom/taobao/accs/net/m;->b:Lcom/taobao/accs/net/j;

    iget-object v7, v7, Lcom/taobao/accs/net/b;->d:Landroid/content/Context;

    invoke-static {v7}, Lcom/taobao/accs/utl/UtilityImpl;->g(Landroid/content/Context;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 19
    sget-object v7, Lcom/taobao/accs/AccsErrorCode;->NETWORK_INAPP_EXCEPTION:Lcom/alibaba/sdk/android/error/ErrorCode;

    .line 20
    invoke-virtual {v7}, Lcom/alibaba/sdk/android/error/ErrorCode;->copy()Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v7

    .line 21
    invoke-static {v0}, Lcom/taobao/accs/AccsErrorCode;->getExceptionInfo(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    .line 22
    invoke-static {v0}, Lcom/taobao/accs/AccsErrorCode;->getAllDetails(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->detail(Ljava/lang/String;)Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v0

    .line 23
    invoke-virtual {v0}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->build()Lcom/alibaba/sdk/android/error/ErrorCode;

    move-result-object v7

    goto :goto_1

    .line 24
    :cond_2
    sget-object v7, Lcom/taobao/accs/AccsErrorCode;->NO_NETWORK:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v7}, Lcom/alibaba/sdk/android/error/ErrorCode;->copy()Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v7

    .line 25
    invoke-static {v0}, Lcom/taobao/accs/AccsErrorCode;->getExceptionInfo(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    .line 26
    invoke-virtual {v7, v0}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->detail(Ljava/lang/String;)Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v0

    .line 27
    invoke-virtual {v0}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->build()Lcom/alibaba/sdk/android/error/ErrorCode;

    move-result-object v7

    goto :goto_1

    :catch_0
    move-exception v0

    .line 28
    sget-object v7, Lcom/taobao/accs/AccsErrorCode;->NETWORK_INAPP_NO_STRATEGY:Lcom/alibaba/sdk/android/error/ErrorCode;

    .line 29
    invoke-virtual {v7}, Lcom/alibaba/sdk/android/error/ErrorCode;->copy()Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v7

    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->detail(Ljava/lang/String;)Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->build()Lcom/alibaba/sdk/android/error/ErrorCode;

    move-result-object v7

    goto :goto_1

    :catch_1
    move-exception v0

    .line 30
    sget-object v7, Lcom/taobao/accs/AccsErrorCode;->NETWORK_INAPP_CONNECT_FAIL:Lcom/alibaba/sdk/android/error/ErrorCode;

    .line 31
    invoke-virtual {v7}, Lcom/alibaba/sdk/android/error/ErrorCode;->copy()Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v7

    .line 32
    invoke-virtual {v0}, Ljava/net/ConnectException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/taobao/accs/AccsErrorCode;->getAllDetails(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 33
    invoke-virtual {v7, v0}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->detail(Ljava/lang/String;)Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v0

    .line 34
    invoke-virtual {v0}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->build()Lcom/alibaba/sdk/android/error/ErrorCode;

    move-result-object v7

    goto :goto_1

    :catch_2
    move-exception v0

    .line 35
    sget-object v7, Lcom/taobao/accs/AccsErrorCode;->NETWORK_INAPP_TIMEOUT:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v7}, Lcom/alibaba/sdk/android/error/ErrorCode;->copy()Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v7

    .line 36
    invoke-virtual {v0}, Ljava/util/concurrent/TimeoutException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/taobao/accs/AccsErrorCode;->getAllDetails(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->detail(Ljava/lang/String;)Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v0

    .line 37
    invoke-virtual {v0}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->build()Lcom/alibaba/sdk/android/error/ErrorCode;

    move-result-object v7

    goto :goto_1

    :catch_3
    move-exception v0

    .line 38
    sget-object v7, Lcom/taobao/accs/AccsErrorCode;->NETWORK_INAPP_ARGS_INVALID:Lcom/alibaba/sdk/android/error/ErrorCode;

    .line 39
    invoke-virtual {v7}, Lcom/alibaba/sdk/android/error/ErrorCode;->copy()Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v7

    invoke-virtual {v0}, Ljava/security/InvalidParameterException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->detail(Ljava/lang/String;)Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->build()Lcom/alibaba/sdk/android/error/ErrorCode;

    move-result-object v7

    :goto_1
    const/4 v0, 0x0

    :goto_2
    if-eqz v0, :cond_8

    .line 40
    iget-object v10, v1, Lcom/taobao/accs/net/m;->a:Lcom/taobao/accs/data/Message;

    iget-object v11, v1, Lcom/taobao/accs/net/m;->b:Lcom/taobao/accs/net/j;

    iget-object v12, v11, Lcom/taobao/accs/net/b;->d:Landroid/content/Context;

    iget v11, v11, Lcom/taobao/accs/net/b;->c:I

    invoke-virtual {v10, v12, v11}, Lcom/taobao/accs/data/Message;->a(Landroid/content/Context;I)[B

    move-result-object v10

    .line 41
    iget-object v11, v1, Lcom/taobao/accs/net/m;->b:Lcom/taobao/accs/net/j;

    invoke-static {v11}, Lcom/taobao/accs/net/j;->a(Lcom/taobao/accs/net/j;)Lcom/alibaba/sdk/android/logger/ILog;

    move-result-object v11

    const/16 v12, 0xb

    new-array v12, v12, [Ljava/lang/Object;

    aput-object v2, v12, v13

    aput-object v6, v12, v14

    iget-object v15, v1, Lcom/taobao/accs/net/m;->a:Lcom/taobao/accs/data/Message;

    invoke-virtual {v15}, Lcom/taobao/accs/data/Message;->b()Ljava/lang/String;

    move-result-object v15

    const/16 v19, 0x2

    aput-object v15, v12, v19

    const-string v15, "command"

    const/16 v18, 0x3

    aput-object v15, v12, v18

    iget-object v15, v1, Lcom/taobao/accs/net/m;->a:Lcom/taobao/accs/data/Message;

    iget-object v9, v15, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    const/16 v16, 0x4

    aput-object v9, v12, v16

    const-string v9, "host"

    const/16 v17, 0x5

    aput-object v9, v12, v17

    const/4 v9, 0x6

    iget-object v15, v15, Lcom/taobao/accs/data/Message;->f:Ljava/net/URL;

    aput-object v15, v12, v9

    const/4 v9, 0x7

    const-string v15, "len"

    aput-object v15, v12, v9

    const/16 v9, 0x8

    if-nez v10, :cond_3

    const/4 v15, 0x0

    goto :goto_3

    :cond_3
    array-length v15, v10

    .line 42
    :goto_3
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    aput-object v15, v12, v9

    const/16 v9, 0x9

    const-string v15, "utdid"

    aput-object v15, v12, v9

    const/16 v9, 0xa

    iget-object v15, v1, Lcom/taobao/accs/net/m;->b:Lcom/taobao/accs/net/j;

    iget-object v15, v15, Lcom/taobao/accs/net/b;->j:Ljava/lang/String;

    aput-object v15, v12, v9

    .line 43
    invoke-interface {v11, v12}, Lcom/alibaba/sdk/android/logger/ILog;->i([Ljava/lang/Object;)V

    .line 44
    iget-object v9, v1, Lcom/taobao/accs/net/m;->a:Lcom/taobao/accs/data/Message;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    invoke-virtual {v9, v11, v12}, Lcom/taobao/accs/data/Message;->a(J)V

    .line 45
    array-length v9, v10

    const/16 v11, 0x4000

    if-le v9, v11, :cond_4

    iget-object v9, v1, Lcom/taobao/accs/net/m;->a:Lcom/taobao/accs/data/Message;

    iget-object v9, v9, Lcom/taobao/accs/data/Message;->t:Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    const/16 v11, 0x66

    if-eq v9, v11, :cond_4

    .line 46
    iget-object v0, v1, Lcom/taobao/accs/net/m;->b:Lcom/taobao/accs/net/j;

    iget-object v0, v0, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    iget-object v9, v1, Lcom/taobao/accs/net/m;->a:Lcom/taobao/accs/data/Message;

    sget-object v10, Lcom/taobao/accs/AccsErrorCode;->MESSAGE_TOO_LARGE:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v0, v9, v10}, Lcom/taobao/accs/data/d;->a(Lcom/taobao/accs/data/Message;Lcom/alibaba/sdk/android/error/ErrorCode;)V

    goto/16 :goto_0

    .line 47
    :cond_4
    iget-object v9, v1, Lcom/taobao/accs/net/m;->b:Lcom/taobao/accs/net/j;

    iget-object v9, v9, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    iget-object v11, v1, Lcom/taobao/accs/net/m;->a:Lcom/taobao/accs/data/Message;

    invoke-virtual {v9, v11}, Lcom/taobao/accs/data/d;->a(Lcom/taobao/accs/data/Message;)V

    .line 48
    iget-object v9, v1, Lcom/taobao/accs/net/m;->a:Lcom/taobao/accs/data/Message;

    iget-boolean v11, v9, Lcom/taobao/accs/data/Message;->c:Z

    if-eqz v11, :cond_5

    invoke-virtual {v9}, Lcom/taobao/accs/data/Message;->d()Lcom/taobao/accs/data/Message$a;

    move-result-object v9

    .line 49
    invoke-virtual {v9}, Lcom/taobao/accs/data/Message$a;->a()I

    move-result v9

    neg-int v9, v9

    goto :goto_4

    :cond_5
    invoke-virtual {v9}, Lcom/taobao/accs/data/Message;->d()Lcom/taobao/accs/data/Message$a;

    move-result-object v9

    invoke-virtual {v9}, Lcom/taobao/accs/data/Message$a;->a()I

    move-result v9

    .line 50
    :goto_4
    iget-object v11, v1, Lcom/taobao/accs/net/m;->a:Lcom/taobao/accs/data/Message;

    iget-boolean v11, v11, Lcom/taobao/accs/data/Message;->c:Z

    if-eqz v11, :cond_6

    .line 51
    iget-object v11, v1, Lcom/taobao/accs/net/m;->b:Lcom/taobao/accs/net/j;

    iget-object v11, v11, Lcom/taobao/accs/net/b;->l:Ljava/util/LinkedHashMap;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    iget-object v15, v1, Lcom/taobao/accs/net/m;->a:Lcom/taobao/accs/data/Message;

    invoke-virtual {v11, v12, v15}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    :cond_6
    invoke-static {}, Lcom/taobao/accs/AccsState;->getInstance()Lcom/taobao/accs/AccsState;

    move-result-object v11

    iget-object v12, v1, Lcom/taobao/accs/net/m;->b:Lcom/taobao/accs/net/j;

    iget-object v12, v12, Lcom/taobao/accs/net/b;->m:Ljava/lang/String;

    const-string v15, "lmst"

    .line 53
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    .line 54
    invoke-virtual {v11, v12, v15, v14}, Lcom/taobao/accs/AccsState;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    const/16 v11, 0xc8

    .line 55
    invoke-virtual {v0, v9, v10, v11}, Lanet/channel/Session;->sendCustomFrame(I[BI)V

    .line 56
    iget-object v0, v1, Lcom/taobao/accs/net/m;->a:Lcom/taobao/accs/data/Message;

    invoke-virtual {v0}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 57
    iget-object v0, v1, Lcom/taobao/accs/net/m;->a:Lcom/taobao/accs/data/Message;

    invoke-virtual {v0}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;->onSendData()V

    .line 58
    :cond_7
    iget-object v0, v1, Lcom/taobao/accs/net/m;->b:Lcom/taobao/accs/net/j;

    iget-object v9, v1, Lcom/taobao/accs/net/m;->a:Lcom/taobao/accs/data/Message;

    invoke-virtual {v9}, Lcom/taobao/accs/data/Message;->b()Ljava/lang/String;

    move-result-object v9

    iget-object v11, v1, Lcom/taobao/accs/net/m;->b:Lcom/taobao/accs/net/j;

    iget-object v11, v11, Lcom/taobao/accs/net/b;->i:Lcom/taobao/accs/AccsClientConfig;

    .line 59
    invoke-virtual {v11}, Lcom/taobao/accs/AccsClientConfig;->isQuickReconnect()Z

    move-result v11

    iget-object v12, v1, Lcom/taobao/accs/net/m;->a:Lcom/taobao/accs/data/Message;

    iget v12, v12, Lcom/taobao/accs/data/Message;->S:I

    int-to-long v14, v12

    .line 60
    invoke-virtual {v0, v9, v11, v14, v15}, Lcom/taobao/accs/net/j;->a(Ljava/lang/String;ZJ)V

    .line 61
    iget-object v0, v1, Lcom/taobao/accs/net/m;->b:Lcom/taobao/accs/net/j;

    iget-object v0, v0, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    new-instance v9, Lcom/taobao/accs/ut/monitor/TrafficsMonitor$a;

    iget-object v11, v1, Lcom/taobao/accs/net/m;->a:Lcom/taobao/accs/data/Message;

    iget-object v11, v11, Lcom/taobao/accs/data/Message;->H:Ljava/lang/String;

    .line 62
    invoke-static {}, Lanet/channel/GlobalAppRuntimeInfo;->isAppBackground()Z

    move-result v22

    iget-object v12, v1, Lcom/taobao/accs/net/m;->a:Lcom/taobao/accs/data/Message;

    iget-object v12, v12, Lcom/taobao/accs/data/Message;->f:Ljava/net/URL;

    .line 63
    invoke-virtual {v12}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v23

    array-length v10, v10

    int-to-long v14, v10

    move-object/from16 v20, v9

    move-object/from16 v21, v11

    move-wide/from16 v24, v14

    invoke-direct/range {v20 .. v25}, Lcom/taobao/accs/ut/monitor/TrafficsMonitor$a;-><init>(Ljava/lang/String;ZLjava/lang/String;J)V

    .line 64
    invoke-virtual {v0, v9}, Lcom/taobao/accs/data/d;->a(Lcom/taobao/accs/ut/monitor/TrafficsMonitor$a;)V

    goto/16 :goto_0

    .line 65
    :cond_8
    invoke-virtual {v7}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v0

    sget-object v9, Lcom/taobao/accs/AccsErrorCode;->SUCCESS:Lcom/alibaba/sdk/android/error/ErrorCode;

    .line 66
    invoke-virtual {v9}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const-string v10, "re"

    if-eq v0, v9, :cond_9

    .line 67
    :try_start_3
    iget-object v0, v1, Lcom/taobao/accs/net/m;->b:Lcom/taobao/accs/net/j;

    invoke-static {v0}, Lcom/taobao/accs/net/j;->a(Lcom/taobao/accs/net/j;)Lcom/alibaba/sdk/android/logger/ILog;

    move-result-object v0

    invoke-virtual {v7}, Lcom/alibaba/sdk/android/error/ErrorCode;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v0, v9}, Lcom/alibaba/sdk/android/logger/ILog;->e(Ljava/lang/String;)V

    .line 68
    invoke-static {}, Lcom/taobao/accs/AccsState;->getInstance()Lcom/taobao/accs/AccsState;

    move-result-object v0

    iget-object v9, v1, Lcom/taobao/accs/net/m;->b:Lcom/taobao/accs/net/j;

    iget-object v9, v9, Lcom/taobao/accs/net/b;->m:Ljava/lang/String;

    .line 69
    invoke-virtual {v7}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    .line 70
    invoke-virtual {v0, v9, v10, v11}, Lcom/taobao/accs/AccsState;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_5

    .line 71
    :cond_9
    iget-object v0, v1, Lcom/taobao/accs/net/m;->b:Lcom/taobao/accs/net/j;

    invoke-static {v0}, Lcom/taobao/accs/net/j;->a(Lcom/taobao/accs/net/j;)Lcom/alibaba/sdk/android/logger/ILog;

    move-result-object v0

    const-string v9, "sendMessage session is null"

    invoke-interface {v0, v9}, Lcom/alibaba/sdk/android/logger/ILog;->e(Ljava/lang/String;)V

    .line 72
    invoke-static {}, Lcom/taobao/accs/AccsState;->getInstance()Lcom/taobao/accs/AccsState;

    move-result-object v0

    iget-object v9, v1, Lcom/taobao/accs/net/m;->b:Lcom/taobao/accs/net/j;

    iget-object v9, v9, Lcom/taobao/accs/net/b;->m:Ljava/lang/String;

    const-string v11, "send session null"

    invoke-virtual {v0, v9, v10, v11}, Lcom/taobao/accs/AccsState;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_5
    const/4 v0, 0x0

    goto :goto_6

    .line 73
    :cond_a
    iget-object v9, v1, Lcom/taobao/accs/net/m;->b:Lcom/taobao/accs/net/j;

    invoke-static {v9}, Lcom/taobao/accs/net/j;->a(Lcom/taobao/accs/net/j;)Lcom/alibaba/sdk/android/logger/ILog;

    move-result-object v9

    const/4 v10, 0x3

    new-array v11, v10, [Ljava/lang/Object;

    const-string v10, "sendMessage skip"

    aput-object v10, v11, v13

    const/4 v10, 0x1

    aput-object v0, v11, v10

    invoke-static {v8}, Lcom/taobao/accs/data/Message$c;->b(I)Ljava/lang/String;

    move-result-object v0

    const/4 v10, 0x2

    aput-object v0, v11, v10

    invoke-interface {v9, v11}, Lcom/alibaba/sdk/android/logger/ILog;->w([Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto/16 :goto_0

    :goto_6
    if-nez v0, :cond_f

    .line 74
    invoke-virtual {v7}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v2

    sget-object v9, Lcom/taobao/accs/AccsErrorCode;->SUCCESS:Lcom/alibaba/sdk/android/error/ErrorCode;

    .line 75
    invoke-virtual {v9}, Lcom/alibaba/sdk/android/error/ErrorCode;->getCodeInt()I

    move-result v9

    if-ne v2, v9, :cond_b

    .line 76
    sget-object v2, Lcom/taobao/accs/AccsErrorCode;->INAPP_CON_DISCONNECTED:Lcom/alibaba/sdk/android/error/ErrorCode;

    invoke-virtual {v2}, Lcom/alibaba/sdk/android/error/ErrorCode;->copy()Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v2

    const/4 v7, 0x0

    .line 77
    invoke-static {v7}, Lcom/taobao/accs/AccsErrorCode;->getAllDetails(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->detail(Ljava/lang/String;)Lcom/alibaba/sdk/android/error/ErrorBuilder;

    move-result-object v2

    invoke-virtual {v2}, Lcom/alibaba/sdk/android/error/ErrorBuilder;->build()Lcom/alibaba/sdk/android/error/ErrorCode;

    move-result-object v7

    :cond_b
    const/4 v2, 0x1

    if-ne v8, v2, :cond_e

    .line 78
    iget-object v2, v1, Lcom/taobao/accs/net/m;->a:Lcom/taobao/accs/data/Message;

    invoke-virtual {v2}, Lcom/taobao/accs/data/Message;->g()Z

    move-result v2

    if-nez v2, :cond_c

    iget-object v2, v1, Lcom/taobao/accs/net/m;->b:Lcom/taobao/accs/net/j;

    iget-object v8, v1, Lcom/taobao/accs/net/m;->a:Lcom/taobao/accs/data/Message;

    const/16 v9, 0x7d0

    invoke-virtual {v2, v8, v9}, Lcom/taobao/accs/net/b;->a(Lcom/taobao/accs/data/Message;I)Z

    move-result v2

    if-nez v2, :cond_d

    .line 79
    :cond_c
    iget-object v2, v1, Lcom/taobao/accs/net/m;->b:Lcom/taobao/accs/net/j;

    iget-object v2, v2, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    iget-object v8, v1, Lcom/taobao/accs/net/m;->a:Lcom/taobao/accs/data/Message;

    invoke-virtual {v2, v8, v7}, Lcom/taobao/accs/data/d;->a(Lcom/taobao/accs/data/Message;Lcom/alibaba/sdk/android/error/ErrorCode;)V

    .line 80
    :cond_d
    iget-object v2, v1, Lcom/taobao/accs/net/m;->a:Lcom/taobao/accs/data/Message;

    iget v7, v2, Lcom/taobao/accs/data/Message;->R:I

    const/4 v8, 0x1

    if-ne v7, v8, :cond_f

    .line 81
    invoke-virtual {v2}, Lcom/taobao/accs/data/Message;->e()Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    move-result-object v2

    if-eqz v2, :cond_f

    const-wide/16 v7, 0x0

    const-string v2, "resend"

    const-string v9, "total_accs"

    .line 82
    invoke-static {v3, v2, v9, v7, v8}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitCount(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V

    goto :goto_7

    .line 83
    :cond_e
    iget-object v2, v1, Lcom/taobao/accs/net/m;->b:Lcom/taobao/accs/net/j;

    iget-object v2, v2, Lcom/taobao/accs/net/b;->e:Lcom/taobao/accs/data/d;

    iget-object v3, v1, Lcom/taobao/accs/net/m;->a:Lcom/taobao/accs/data/Message;

    invoke-virtual {v2, v3, v7}, Lcom/taobao/accs/data/d;->a(Lcom/taobao/accs/data/Message;Lcom/alibaba/sdk/android/error/ErrorCode;)V

    .line 84
    :cond_f
    :goto_7
    iget-object v2, v1, Lcom/taobao/accs/net/m;->b:Lcom/taobao/accs/net/j;

    invoke-static {v2}, Lcom/taobao/accs/net/j;->a(Lcom/taobao/accs/net/j;)Lcom/alibaba/sdk/android/logger/ILog;

    move-result-object v2

    const/4 v3, 0x5

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v5, v3, v13

    const/4 v5, 0x1

    aput-object v6, v3, v5

    iget-object v5, v1, Lcom/taobao/accs/net/m;->a:Lcom/taobao/accs/data/Message;

    invoke-virtual {v5}, Lcom/taobao/accs/data/Message;->b()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x2

    aput-object v5, v3, v6

    const/4 v5, 0x3

    aput-object v4, v3, v5

    .line 85
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/4 v4, 0x4

    aput-object v0, v3, v4

    .line 86
    invoke-interface {v2, v3}, Lcom/alibaba/sdk/android/logger/ILog;->i([Ljava/lang/Object;)V

    goto :goto_8

    :catchall_1
    move-exception v0

    :try_start_4
    const-string v7, "send_fail"

    .line 87
    iget-object v8, v1, Lcom/taobao/accs/net/m;->a:Lcom/taobao/accs/data/Message;

    iget-object v8, v8, Lcom/taobao/accs/data/Message;->H:Ljava/lang/String;

    const-string v9, ""

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v11, v1, Lcom/taobao/accs/net/m;->b:Lcom/taobao/accs/net/j;

    iget v11, v11, Lcom/taobao/accs/net/b;->c:I

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 88
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 89
    invoke-static {v3, v7, v8, v9, v10}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitAlarmFail(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    iget-object v3, v1, Lcom/taobao/accs/net/m;->b:Lcom/taobao/accs/net/j;

    invoke-static {v3}, Lcom/taobao/accs/net/j;->a(Lcom/taobao/accs/net/j;)Lcom/alibaba/sdk/android/logger/ILog;

    move-result-object v3

    invoke-interface {v3, v2, v0}, Lcom/alibaba/sdk/android/logger/ILog;->e(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 91
    iget-object v0, v1, Lcom/taobao/accs/net/m;->b:Lcom/taobao/accs/net/j;

    invoke-static {v0}, Lcom/taobao/accs/net/j;->a(Lcom/taobao/accs/net/j;)Lcom/alibaba/sdk/android/logger/ILog;

    move-result-object v0

    const/4 v2, 0x5

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v5, v2, v13

    const/4 v3, 0x1

    aput-object v6, v2, v3

    iget-object v5, v1, Lcom/taobao/accs/net/m;->a:Lcom/taobao/accs/data/Message;

    invoke-virtual {v5}, Lcom/taobao/accs/data/Message;->b()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x2

    aput-object v5, v2, v6

    const/4 v5, 0x3

    aput-object v4, v2, v5

    .line 92
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x4

    aput-object v3, v2, v4

    .line 93
    invoke-interface {v0, v2}, Lcom/alibaba/sdk/android/logger/ILog;->i([Ljava/lang/Object;)V

    goto :goto_8

    :catchall_2
    move-exception v0

    iget-object v2, v1, Lcom/taobao/accs/net/m;->b:Lcom/taobao/accs/net/j;

    invoke-static {v2}, Lcom/taobao/accs/net/j;->a(Lcom/taobao/accs/net/j;)Lcom/alibaba/sdk/android/logger/ILog;

    move-result-object v2

    const/4 v3, 0x5

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v5, v3, v13

    const/4 v5, 0x1

    aput-object v6, v3, v5

    iget-object v6, v1, Lcom/taobao/accs/net/m;->a:Lcom/taobao/accs/data/Message;

    invoke-virtual {v6}, Lcom/taobao/accs/data/Message;->b()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x2

    aput-object v6, v3, v7

    const/4 v6, 0x3

    aput-object v4, v3, v6

    .line 94
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    const/4 v5, 0x4

    aput-object v4, v3, v5

    .line 95
    invoke-interface {v2, v3}, Lcom/alibaba/sdk/android/logger/ILog;->i([Ljava/lang/Object;)V

    .line 96
    throw v0

    :cond_10
    :goto_8
    return-void
.end method
