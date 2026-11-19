.class public Lcom/alibaba/sdk/android/tbrest/rest/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lcom/alibaba/sdk/android/tbrest/SendService;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;JLjava/lang/String;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/sdk/android/tbrest/SendService;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Landroid/content/Context;",
            "J",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v1, 0x0

    .line 14
    :try_start_0
    const-string v0, "sendLogByUrl RestAPI start send log!"

    invoke-static {v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->i(Ljava/lang/String;)V

    move-object v2, p2

    move-object p2, p1

    move-object p1, v2

    .line 15
    invoke-static/range {p0 .. p11}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Lcom/alibaba/sdk/android/tbrest/SendService;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;JLjava/lang/String;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;)Lcom/alibaba/sdk/android/tbrest/rest/d;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 16
    const-string p1, "sendLogByUrl RestAPI build data succ!"

    invoke-static {p1}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->i(Ljava/lang/String;)V

    .line 17
    invoke-virtual {p0}, Lcom/alibaba/sdk/android/tbrest/rest/d;->a()Ljava/util/Map;

    move-result-object p1

    if-nez p1, :cond_0

    .line 18
    const-string p0, "sendLogByUrl postReqData is null!"

    invoke-static {p0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->i(Ljava/lang/String;)V

    return-object v1

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/sdk/android/tbrest/rest/d;->a()Ljava/lang/String;

    move-result-object p0

    .line 20
    invoke-static {p0}, Lcom/alibaba/sdk/android/tbrest/utils/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 21
    const-string p0, "sendLogByUrl reqUrl is null!"

    invoke-static {p0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->i(Ljava/lang/String;)V

    return-object v1

    :cond_1
    const/4 p2, 0x2

    const/4 p3, 0x1

    .line 22
    invoke-static {p2, p0, p1, p3}, Lcom/alibaba/sdk/android/tbrest/rest/b;->a(ILjava/lang/String;Ljava/util/Map;Z)[B

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_3

    .line 23
    :try_start_1
    new-instance p1, Ljava/lang/String;

    const-string p2, "UTF-8"

    invoke-direct {p1, p0, p2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 24
    invoke-static {p1}, Lcom/alibaba/sdk/android/tbrest/utils/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result p0
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez p0, :cond_3

    return-object p1

    :catch_0
    move-exception v0

    move-object p0, v0

    .line 25
    :try_start_2
    const-string p1, "sendLogByUrl result encoding UTF-8 error!"

    invoke-static {p1, p0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 26
    :cond_2
    const-string p0, "sendLogByUrl UTRestAPI build data failure!"

    invoke-static {p0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->i(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    .line 27
    :goto_0
    const-string p1, "sendLogByUrl system error!"

    invoke-static {p1, p0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    :goto_1
    return-object v1
.end method

.method public static a(Lcom/alibaba/sdk/android/tbrest/SendService;Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;)Z
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/sdk/android/tbrest/SendService;",
            "Ljava/lang/String;",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "J",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .line 1
    :try_start_0
    const-string v0, "RestAPI start send log!"

    invoke-static {v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->i(Ljava/lang/String;)V

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p4

    move-object/from16 v5, p6

    move/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move-object/from16 v9, p10

    move-object/from16 v10, p11

    .line 2
    invoke-static/range {v1 .. v10}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Lcom/alibaba/sdk/android/tbrest/SendService;Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {v0}, Lcom/alibaba/sdk/android/tbrest/utils/StringUtils;->isNotBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 4
    const-string v3, "RestAPI build data succ!"

    invoke-static {v3}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->i(Ljava/lang/String;)V

    .line 5
    new-instance v3, Ljava/util/HashMap;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Ljava/util/HashMap;-><init>(I)V

    .line 6
    invoke-static/range {p7 .. p7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    :try_start_1
    invoke-static {p0, p1, p2, v3}, Lcom/alibaba/sdk/android/tbrest/request/BizRequest;->getPackRequest(Lcom/alibaba/sdk/android/tbrest/SendService;Ljava/lang/String;Landroid/content/Context;Ljava/util/Map;)[B

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p1, v0

    .line 8
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;)V

    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    .line 9
    const-string p2, "packRequest success!"

    invoke-static {p2}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->i(Ljava/lang/String;)V

    .line 10
    invoke-static {p0, p3, p1}, Lcom/alibaba/sdk/android/tbrest/request/UrlWrapper;->sendRequest(Lcom/alibaba/sdk/android/tbrest/SendService;Ljava/lang/String;[B)Lcom/alibaba/sdk/android/tbrest/request/BizResponse;

    move-result-object p0

    .line 11
    invoke-virtual {p0}, Lcom/alibaba/sdk/android/tbrest/request/BizResponse;->isSuccess()Z

    move-result p0

    return p0

    .line 12
    :cond_0
    const-string p0, "UTRestAPI build data failure!"

    invoke-static {p0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->i(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    .line 13
    const-string p1, "system error!"

    invoke-static {p1, p0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    const/4 p0, 0x0

    return p0
.end method

.method public static b(Lcom/alibaba/sdk/android/tbrest/SendService;Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;)Z
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/sdk/android/tbrest/SendService;",
            "Ljava/lang/String;",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "J",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .line 1
    :try_start_0
    const-string v0, "RestAPI start send log by url!"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->i(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    move-object v1, p0

    .line 7
    move-object v2, p1

    .line 8
    move-wide v3, p4

    .line 9
    move-object/from16 v5, p6

    .line 10
    .line 11
    move/from16 v6, p7

    .line 12
    .line 13
    move-object/from16 v7, p8

    .line 14
    .line 15
    move-object/from16 v8, p9

    .line 16
    .line 17
    move-object/from16 v9, p10

    .line 18
    .line 19
    move-object/from16 v10, p11

    .line 20
    .line 21
    invoke-static/range {v1 .. v10}, Lcom/alibaba/sdk/android/tbrest/rest/e;->a(Lcom/alibaba/sdk/android/tbrest/SendService;Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Lcom/alibaba/sdk/android/tbrest/utils/StringUtils;->isNotBlank(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    const-string v3, "RestAPI build data succ by url!"

    .line 32
    .line 33
    invoke-static {v3}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->i(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    new-instance v3, Ljava/util/HashMap;

    .line 37
    .line 38
    const/4 v4, 0x1

    .line 39
    invoke-direct {v3, v4}, Ljava/util/HashMap;-><init>(I)V

    .line 40
    .line 41
    .line 42
    invoke-static/range {p7 .. p7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-interface {v3, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    :try_start_1
    invoke-static {p0, p1, p2, v3}, Lcom/alibaba/sdk/android/tbrest/request/BizRequest;->getPackRequest(Lcom/alibaba/sdk/android/tbrest/SendService;Ljava/lang/String;Landroid/content/Context;Ljava/util/Map;)[B

    .line 50
    .line 51
    .line 52
    move-result-object p2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    goto :goto_0

    .line 54
    :catch_0
    move-exception v0

    .line 55
    move-object p2, v0

    .line 56
    :try_start_2
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-static {p2}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const/4 p2, 0x0

    .line 64
    :goto_0
    if-eqz p2, :cond_1

    .line 65
    .line 66
    const-string v0, "packRequest success by url!"

    .line 67
    .line 68
    invoke-static {v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->i(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-static {p0, p1, p3, p2}, Lcom/alibaba/sdk/android/tbrest/request/UrlWrapper;->sendRequest(Lcom/alibaba/sdk/android/tbrest/SendService;Ljava/lang/String;Ljava/lang/String;[B)Lcom/alibaba/sdk/android/tbrest/request/BizResponse;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p0}, Lcom/alibaba/sdk/android/tbrest/request/BizResponse;->isSuccess()Z

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    return p0

    .line 80
    :cond_0
    const-string p0, "UTRestAPI build data failure by url!"

    .line 81
    .line 82
    invoke-static {p0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->i(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :catchall_0
    move-exception v0

    .line 87
    move-object p0, v0

    .line 88
    const-string p1, "system error by url!"

    .line 89
    .line 90
    invoke-static {p1, p0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    :cond_1
    :goto_1
    const/4 p0, 0x0

    .line 94
    return p0
.end method
