.class Lcom/aliyun/ams/emas/push/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;Landroid/content/Intent;Lcom/aliyun/ams/emas/push/b;)V
    .locals 8

    :try_start_0
    const-string v0, "messageId"

    .line 1
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "title"

    .line 2
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v1, "summary"

    .line 3
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v1, "extraMap"

    .line 4
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v1, "group"

    .line 5
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "notificationOpenType"

    const/4 v3, 0x1

    .line 6
    invoke-virtual {p1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v7

    .line 7
    sget-object p1, Lcom/aliyun/ams/emas/push/l;->a:Lcom/alibaba/sdk/android/logger/ILog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notification opened "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/alibaba/sdk/android/logger/ILog;->d(Ljava/lang/String;)V

    .line 8
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 9
    invoke-static {}, Lk1/a;->a()Lk1/a;

    move-result-object p1

    invoke-virtual {p1, v1}, Lk1/a;->d(Ljava/lang/String;)V

    :cond_0
    move-object v2, p2

    move-object v3, p0

    .line 10
    invoke-interface/range {v2 .. v7}, Lcom/aliyun/ams/emas/push/b;->onNotificationOpened(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "AgooPushHandler"

    const-string v0, "Handle notification open action failed."

    .line 11
    invoke-static {p2, v0, p0, p1}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public static b(Landroid/content/Context;Landroid/content/Intent;Lcom/aliyun/ams/emas/push/c;Lcom/aliyun/ams/emas/push/b;)V
    .locals 16

    move-object/from16 v0, p1

    const-string v1, "message_source"

    const-string v2, "extData"

    const-string v3, "task_id"

    const-string v4, "AgooPushHandler"

    const/4 v5, 0x0

    :try_start_0
    const-string v6, "id"

    .line 1
    invoke-virtual {v0, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 2
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_0

    const-string v0, "handle message Null messageId!"

    new-array v1, v5, [Ljava/lang/Object;

    .line 3
    invoke-static {v4, v0, v1}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    const-string v6, "body"

    .line 4
    invoke-virtual {v0, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 5
    invoke-virtual {v0, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 6
    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 8
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "handle message json body is Empty!"

    new-array v1, v5, [Ljava/lang/Object;

    .line 9
    invoke-static {v4, v0, v1}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    return-void

    :cond_1
    const/4 v11, 0x0

    .line 10
    :try_start_1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 11
    invoke-static {v0}, Lcom/taobao/accs/utl/JsonUtility;->toMap(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object v0
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v11, v0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_2
    const-string v12, "Parse json error:"

    new-array v13, v5, [Ljava/lang/Object;

    .line 12
    invoke-static {v4, v12, v0, v13}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_0
    :try_start_3
    const-string v0, "type"

    .line 13
    invoke-interface {v11, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v12
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 14
    :try_start_4
    sget-object v0, Lcom/aliyun/ams/emas/push/l;->a:Lcom/alibaba/sdk/android/logger/ILog;

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "handle message, messageId:"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v14, ", type:"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v14, ", msg receive:"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v6}, Lcom/alibaba/sdk/android/logger/ILog;->d(Ljava/lang/String;)V

    .line 15
    invoke-interface {v11}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .line 16
    sget-object v13, Lcom/aliyun/ams/emas/push/l;->a:Lcom/alibaba/sdk/android/logger/ILog;

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v15, " --> "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v13, v6}, Lcom/alibaba/sdk/android/logger/ILog;->d(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    const-string v0, "msg_id"

    .line 17
    invoke-interface {v11, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 18
    invoke-interface {v11, v3, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    invoke-interface {v11, v2, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    invoke-interface {v11, v1, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "_ALIYUN_NOTIFICATION_MSG_ID_"

    .line 21
    invoke-interface {v11, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    invoke-static {}, Lcom/aliyun/ams/emas/push/l;->j()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 23
    sget-object v0, Lcom/aliyun/ams/emas/push/l;->a:Lcom/alibaba/sdk/android/logger/ILog;

    const-string v1, "Push received in DoNotDisturb time window, ignored."

    invoke-interface {v0, v1}, Lcom/alibaba/sdk/android/logger/ILog;->d(Ljava/lang/String;)V

    return-void

    :cond_3
    move-object/from16 v7, p0

    move-object/from16 v8, p2

    move-object/from16 v9, p3

    .line 24
    invoke-static/range {v7 .. v12}, Lcom/aliyun/ams/emas/push/f;->c(Landroid/content/Context;Lcom/aliyun/ams/emas/push/c;Lcom/aliyun/ams/emas/push/b;Ljava/lang/String;Ljava/util/Map;I)V

    goto :goto_2

    :catchall_0
    move-exception v0

    const-string v1, "Wrong message Type Define!"

    new-array v2, v5, [Ljava/lang/Object;

    .line 25
    invoke-static {v4, v1, v0, v2}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    return-void

    :catchall_1
    move-exception v0

    new-array v1, v5, [Ljava/lang/Object;

    const-string v2, "onHandleCallException"

    .line 26
    invoke-static {v4, v2, v0, v1}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    :goto_2
    return-void
.end method

.method private static c(Landroid/content/Context;Lcom/aliyun/ams/emas/push/c;Lcom/aliyun/ams/emas/push/b;Ljava/lang/String;Ljava/util/Map;I)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/aliyun/ams/emas/push/c;",
            "Lcom/aliyun/ams/emas/push/b;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;I)V"
        }
    .end annotation

    move-object v7, p0

    move-object v0, p1

    move-object/from16 v1, p3

    move-object/from16 v8, p4

    move/from16 v2, p5

    .line 1
    new-instance v4, Ll1/b;

    invoke-direct {v4}, Ll1/b;-><init>()V

    const/4 v3, 0x1

    const/4 v9, 0x0

    const-string v10, "AgooPushHandler"

    if-eq v2, v3, :cond_1

    const/4 v0, 0x2

    if-eq v2, v0, :cond_0

    new-array v0, v9, [Ljava/lang/Object;

    const-string v1, "Wrong message Type Define!"

    .line 2
    invoke-static {v10, v1, v0}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 3
    :cond_0
    invoke-static {p0}, Lorg/android/agoo/common/Config;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    .line 4
    :try_start_0
    invoke-virtual {v4, v8, v5, v1}, Ll1/b;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/aliyun/ams/emas/push/notification/CPushMessage;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 5
    invoke-virtual {v1}, Lcom/aliyun/ams/emas/push/notification/CPushMessage;->c()Ljava/lang/String;

    move-result-object v4

    invoke-static {p0, v4, v2}, Lcom/aliyun/ams/emas/push/l;->d(Landroid/content/Context;Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 6
    :try_start_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "messageId="

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/aliyun/ams/emas/push/notification/CPushMessage;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ";appId="

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    invoke-virtual {v1}, Lcom/aliyun/ams/emas/push/notification/CPushMessage;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ";messageType=msg"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v4, v0, v9

    .line 8
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v0, v3

    .line 9
    invoke-static {v10, v2, v0}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_2
    const-string v2, "ut log error"

    new-array v3, v9, [Ljava/lang/Object;

    .line 10
    invoke-static {v10, v2, v0, v3}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    :goto_0
    move-object v6, p2

    .line 11
    invoke-interface {p2, p0, v1}, Lcom/aliyun/ams/emas/push/b;->onMessageArrived(Landroid/content/Context;Lcom/aliyun/ams/emas/push/notification/CPushMessage;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto/16 :goto_1

    :catchall_1
    move-exception v0

    new-array v1, v9, [Ljava/lang/Object;

    const-string v2, "Custom message parse error:"

    .line 12
    invoke-static {v10, v2, v0, v1}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_1
    move-object v6, p2

    .line 13
    :try_start_3
    invoke-static {p0}, Lorg/android/agoo/common/Config;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    .line 14
    invoke-virtual {v4, v8, v3, v1}, Ll1/b;->e(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Ll1/a;

    move-result-object v5

    if-eqz v5, :cond_4

    .line 15
    invoke-virtual {v5}, Ll1/a;->n()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1, v2}, Lcom/aliyun/ams/emas/push/l;->d(Landroid/content/Context;Ljava/lang/String;I)V

    .line 16
    invoke-interface {p1, p0, v8}, Lcom/aliyun/ams/emas/push/c;->showNotificationNow(Landroid/content/Context;Ljava/util/Map;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 17
    invoke-virtual {v5}, Ll1/a;->F()Ljava/lang/String;

    move-result-object v1

    .line 18
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 19
    invoke-static {}, Lk1/a;->a()Lk1/a;

    move-result-object v2

    invoke-virtual {v2, v1, v5}, Lk1/a;->e(Ljava/lang/String;Ll1/a;)V

    .line 20
    :cond_2
    new-instance v11, Lcom/aliyun/ams/emas/push/i;

    move-object v1, v11

    move-object/from16 v2, p4

    move-object v3, v5

    move-object v5, p0

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Lcom/aliyun/ams/emas/push/i;-><init>(Ljava/util/Map;Ll1/a;Ll1/b;Landroid/content/Context;Lcom/aliyun/ams/emas/push/b;)V

    invoke-static {p0, p1, v8, v11}, Lcom/aliyun/ams/emas/push/f;->d(Landroid/content/Context;Lcom/aliyun/ams/emas/push/c;Ljava/util/Map;Lcom/aliyun/ams/emas/push/k;)V

    goto :goto_1

    .line 21
    :cond_3
    sget-object v0, Lcom/aliyun/ams/emas/push/l;->a:Lcom/alibaba/sdk/android/logger/ILog;

    const-string v1, "do not build notification as user request"

    invoke-interface {v0, v1}, Lcom/alibaba/sdk/android/logger/ILog;->i(Ljava/lang/String;)V

    .line 22
    invoke-virtual {v5}, Ll1/a;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5}, Ll1/a;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5}, Ll1/a;->l()Ljava/util/Map;

    move-result-object v0

    .line 23
    invoke-virtual {v5}, Ll1/a;->a()I

    move-result v8

    invoke-virtual {v5}, Ll1/a;->r()Ljava/lang/String;

    move-result-object v11

    .line 24
    invoke-virtual {v5}, Ll1/a;->j()Ljava/lang/String;

    move-result-object v12

    move-object v1, p2

    move-object v2, p0

    move-object v5, v0

    move v6, v8

    move-object v7, v11

    move-object v8, v12

    .line 25
    invoke-interface/range {v1 .. v8}, Lcom/aliyun/ams/emas/push/b;->onNotificationReceivedWithoutShow(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 26
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Notify title is null or server push data Error appId =  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v9, [Ljava/lang/Object;

    invoke-static {v10, v0, v1}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception v0

    new-array v1, v9, [Ljava/lang/Object;

    const-string v2, "Notify message error:"

    .line 27
    invoke-static {v10, v2, v0, v1}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    :cond_5
    :goto_1
    return-void
.end method

.method private static d(Landroid/content/Context;Lcom/aliyun/ams/emas/push/c;Ljava/util/Map;Lcom/aliyun/ams/emas/push/k;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/aliyun/ams/emas/push/c;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/aliyun/ams/emas/push/k;",
            ")V"
        }
    .end annotation

    const-string v0, "image"

    .line 1
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "big_picture"

    .line 2
    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "tid"

    .line 3
    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ljava/lang/String;

    .line 4
    invoke-interface {p1, p2}, Lcom/aliyun/ams/emas/push/c;->checkNotificationShowInInnerGroup(Ljava/util/Map;)Z

    move-result v8

    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 6
    invoke-interface {p1, p0, p2}, Lcom/aliyun/ams/emas/push/c;->customNotificationUI(Landroid/content/Context;Ljava/util/Map;)Landroid/app/Notification;

    move-result-object v0

    .line 7
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v8, :cond_1

    .line 8
    :cond_0
    invoke-interface {p1, p0, p2}, Lcom/aliyun/ams/emas/push/c;->customSummaryNotification(Landroid/content/Context;Ljava/util/Map;)Landroid/app/Notification;

    move-result-object v2

    .line 9
    :cond_1
    invoke-interface {p3, v0, v2}, Lcom/aliyun/ams/emas/push/k;->a(Landroid/app/Notification;Landroid/app/Notification;)V

    goto :goto_1

    .line 10
    :cond_2
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 11
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    move-object v9, v0

    goto :goto_0

    :cond_3
    move-object v9, v2

    .line 12
    :goto_0
    new-instance v0, Lcom/aliyun/ams/emas/push/g;

    move-object v3, v0

    move-object v4, p1

    move-object v5, p0

    move-object v6, p2

    move-object v10, p3

    invoke-direct/range {v3 .. v10}, Lcom/aliyun/ams/emas/push/g;-><init>(Lcom/aliyun/ams/emas/push/c;Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;ZLandroid/os/Handler;Lcom/aliyun/ams/emas/push/k;)V

    invoke-static {v0}, Lcom/taobao/accs/common/ThreadPoolExecutorFactory;->execute(Ljava/lang/Runnable;)V

    :goto_1
    return-void
.end method

.method public static e(Landroid/content/Context;Landroid/content/Intent;Lcom/aliyun/ams/emas/push/b;)V
    .locals 8

    :try_start_0
    const-string v0, "messageId"

    .line 1
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v0, "title"

    .line 2
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v0, "summary"

    .line 3
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v0, "extraMap"

    .line 4
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v0, "notificationOpenType"

    const/4 v1, 0x1

    .line 5
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v6

    const-string v0, "group"

    .line 6
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 7
    sget-object v0, Lcom/aliyun/ams/emas/push/l;->a:Lcom/alibaba/sdk/android/logger/ILog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "notification deleted "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/alibaba/sdk/android/logger/ILog;->d(Ljava/lang/String;)V

    .line 8
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 9
    invoke-static {}, Lk1/a;->a()Lk1/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lk1/a;->d(Ljava/lang/String;)V

    :cond_0
    move-object v1, p2

    move-object v2, p0

    .line 10
    invoke-interface/range {v1 .. v7}, Lcom/aliyun/ams/emas/push/b;->onNotificationRemoved(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "AgooPushHandler"

    const-string v0, "Handle notification delete action failed."

    .line 11
    invoke-static {p2, v0, p0, p1}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
