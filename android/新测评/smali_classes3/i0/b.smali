.class public abstract Li0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lf0/a;Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;)Z
    .locals 11

    .line 1
    :try_start_0
    const-string v0, "RestAPI start send log!"

    invoke-static {v0}, Lj0/e;->d(Ljava/lang/String;)V

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
    invoke-static/range {v1 .. v10}, Li0/a;->a(Lf0/a;Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {v0}, Lj0/h;->e(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 4
    const-string v3, "RestAPI build data succ!"

    invoke-static {v3}, Lj0/e;->d(Ljava/lang/String;)V

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
    invoke-static {p0, p1, p2, v3}, Lh0/a;->b(Lf0/a;Ljava/lang/String;Landroid/content/Context;Ljava/util/Map;)[B

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

    invoke-static {p1}, Lj0/e;->b(Ljava/lang/String;)V

    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    .line 9
    const-string p2, "packRequest success!"

    invoke-static {p2}, Lj0/e;->d(Ljava/lang/String;)V

    .line 10
    invoke-static {p0, p3, p1}, Lh0/c;->b(Lf0/a;Ljava/lang/String;[B)Lh0/b;

    move-result-object p0

    .line 11
    invoke-virtual {p0}, Lh0/b;->a()Z

    move-result p0

    return p0

    .line 12
    :cond_0
    const-string p0, "UTRestAPI build data failure!"

    invoke-static {p0}, Lj0/e;->d(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p0, v0

    .line 13
    const-string p1, "system error!"

    invoke-static {p1, p0}, Lj0/e;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    const/4 p0, 0x0

    return p0
.end method
