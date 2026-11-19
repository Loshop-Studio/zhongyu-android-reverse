.class public abstract Li0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sput-wide v0, Li0/a;->a:J

    .line 6
    .line 7
    return-void
.end method

.method public static a(Lf0/a;Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/String;
    .locals 24

    move-object/from16 v0, p0

    .line 1
    const-string v1, ""

    const-string v2, "-"

    const/4 v3, 0x0

    if-nez p5, :cond_0

    return-object v3

    .line 2
    :cond_0
    :try_start_0
    iget-object v4, v0, Lf0/a;->a:Landroid/content/Context;

    invoke-static {v4}, Lj0/c;->l(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_1

    .line 3
    const-string v0, "get utdid failure, so build report failure, now return"

    invoke-static {v0}, Lj0/e;->b(Ljava/lang/String;)V

    return-object v3

    :catch_0
    move-exception v0

    move-object v4, v1

    goto/16 :goto_3

    .line 4
    :cond_1
    iget-object v5, v0, Lf0/a;->a:Landroid/content/Context;

    invoke-static {v5}, Lj0/c;->i(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    .line 5
    aget-object v6, v5, v6

    .line 6
    array-length v7, v5

    const/4 v8, 0x1

    if-le v7, v8, :cond_2

    if-eqz v6, :cond_2

    const-string v7, "Wi-Fi"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2

    .line 7
    aget-object v3, v5, v8

    :cond_2
    const-wide/16 v7, 0x0

    cmp-long v5, p2, v7

    if-lez v5, :cond_3

    move-wide/from16 v7, p2

    goto :goto_0

    .line 8
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 9
    :goto_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 10
    invoke-static/range {p4 .. p4}, Li0/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 11
    invoke-static/range {p5 .. p5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Li0/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 12
    invoke-static/range {p6 .. p6}, Lj0/h;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Li0/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 13
    invoke-static/range {p7 .. p7}, Lj0/h;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Li0/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 14
    invoke-static/range {p8 .. p8}, Lj0/h;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Li0/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 15
    invoke-static/range {p9 .. p9}, Lj0/h;->a(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Li0/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 16
    iget-object v13, v0, Lf0/a;->a:Landroid/content/Context;

    invoke-static {v13}, Lj0/c;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Li0/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 17
    iget-object v14, v0, Lf0/a;->a:Landroid/content/Context;

    invoke-static {v14}, Lj0/c;->f(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Li0/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 18
    sget-object v15, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-static {v15}, Li0/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 19
    invoke-static {}, Lj0/c;->d()Ljava/lang/String;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Li0/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    invoke-static {v13}, Li0/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    sget-object v16, Landroid/os/Build;->MODEL:Ljava/lang/String;

    move-object/from16 v17, v3

    invoke-static/range {v16 .. v16}, Li0/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v16, v4

    .line 22
    iget-object v4, v0, Lf0/a;->a:Landroid/content/Context;

    invoke-static {v4}, Lj0/c;->j(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Li0/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v18, v6

    .line 23
    iget-object v6, v0, Lf0/a;->a:Landroid/content/Context;

    invoke-static {v6}, Lj0/c;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Li0/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 p2, v12

    .line 24
    invoke-static/range {v18 .. v18}, Li0/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    move-object/from16 p3, v11

    .line 25
    invoke-static/range {v17 .. v17}, Li0/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    move-object/from16 p4, v10

    .line 26
    invoke-static/range {p1 .. p1}, Li0/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    move-object/from16 p5, v9

    .line 27
    iget-object v9, v0, Lf0/a;->e:Ljava/lang/String;

    invoke-static {v9}, Li0/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v17, v8

    .line 28
    iget-object v8, v0, Lf0/a;->f:Ljava/lang/String;

    invoke-static {v8}, Li0/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v18, v7

    .line 29
    iget-object v7, v0, Lf0/a;->g:Ljava/lang/String;

    invoke-static {v7}, Li0/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v19, v5

    .line 30
    iget-object v5, v0, Lf0/a;->g:Ljava/lang/String;

    invoke-static {v5}, Li0/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 31
    invoke-static {}, Lj0/c;->c()Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v20 .. v20}, Li0/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    invoke-static {}, Lj0/c;->g()Ljava/lang/String;

    move-result-object v20
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v21, v1

    :try_start_1
    invoke-static/range {v20 .. v20}, Li0/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 p1, v1

    .line 33
    iget-object v1, v0, Lf0/a;->b:Ljava/lang/String;

    .line 34
    const-string v20, "a"

    .line 35
    sget-object v22, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    move-object/from16 v23, v2

    invoke-static/range {v22 .. v22}, Li0/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 p6, v2

    .line 36
    const-string v2, "mini"

    move-object/from16 p7, v2

    .line 37
    const-string v2, "1.0"

    move-object/from16 p8, v2

    .line 38
    invoke-static/range {v16 .. v16}, Li0/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 39
    iget-object v0, v0, Lf0/a;->j:Ljava/lang/String;

    invoke-static {v0}, Li0/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 40
    invoke-static/range {v21 .. v21}, Lj0/h;->c(Ljava/lang/CharSequence;)Z

    if-eqz v1, :cond_5

    move-object/from16 p0, v0

    .line 41
    const-string v0, "aliyunos"

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 42
    const-string v20, "y"

    :cond_4
    :goto_1
    move-object/from16 v0, v20

    goto :goto_2

    :catch_1
    move-exception v0

    move-object/from16 v4, v21

    goto/16 :goto_3

    :cond_5
    move-object/from16 p0, v0

    goto :goto_1

    .line 43
    :goto_2
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 44
    sget-object v16, Lcom/alibaba/sdk/android/tbrest/rest/a;->a:Lcom/alibaba/sdk/android/tbrest/rest/a;

    move-object/from16 p9, v2

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    sget-object v2, Lcom/alibaba/sdk/android/tbrest/rest/a;->b:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    sget-object v2, Lcom/alibaba/sdk/android/tbrest/rest/a;->c:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    sget-object v2, Lcom/alibaba/sdk/android/tbrest/rest/a;->d:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    sget-object v2, Lcom/alibaba/sdk/android/tbrest/rest/a;->e:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    sget-object v2, Lcom/alibaba/sdk/android/tbrest/rest/a;->f:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    sget-object v2, Lcom/alibaba/sdk/android/tbrest/rest/a;->g:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    sget-object v2, Lcom/alibaba/sdk/android/tbrest/rest/a;->h:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    sget-object v2, Lcom/alibaba/sdk/android/tbrest/rest/a;->i:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    sget-object v2, Lcom/alibaba/sdk/android/tbrest/rest/a;->j:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    sget-object v2, Lcom/alibaba/sdk/android/tbrest/rest/a;->k:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    sget-object v2, Lcom/alibaba/sdk/android/tbrest/rest/a;->l:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    sget-object v2, Lcom/alibaba/sdk/android/tbrest/rest/a;->m:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    sget-object v2, Lcom/alibaba/sdk/android/tbrest/rest/a;->n:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v3, v23

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    sget-object v2, Lcom/alibaba/sdk/android/tbrest/rest/a;->o:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    sget-object v2, Lcom/alibaba/sdk/android/tbrest/rest/a;->p:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v4, p1

    invoke-interface {v1, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    sget-object v2, Lcom/alibaba/sdk/android/tbrest/rest/a;->q:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    sget-object v0, Lcom/alibaba/sdk/android/tbrest/rest/a;->r:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v2, p6

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    sget-object v0, Lcom/alibaba/sdk/android/tbrest/rest/a;->s:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v2, p8

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    sget-object v0, Lcom/alibaba/sdk/android/tbrest/rest/a;->t:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object/from16 v4, v21

    :try_start_2
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-wide v5, Li0/a;->a:J

    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    sget-object v0, Lcom/alibaba/sdk/android/tbrest/rest/a;->u:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v2, p9

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    sget-object v0, Lcom/alibaba/sdk/android/tbrest/rest/a;->v:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v5, p7

    invoke-interface {v1, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    sget-object v0, Lcom/alibaba/sdk/android/tbrest/rest/a;->w:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    sget-object v0, Lcom/alibaba/sdk/android/tbrest/rest/a;->x:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    sget-object v0, Lcom/alibaba/sdk/android/tbrest/rest/a;->y:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    sget-object v0, Lcom/alibaba/sdk/android/tbrest/rest/a;->z:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    sget-object v0, Lcom/alibaba/sdk/android/tbrest/rest/a;->A:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v2, p0

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    sget-object v0, Lcom/alibaba/sdk/android/tbrest/rest/a;->B:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v2, v19

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    sget-object v0, Lcom/alibaba/sdk/android/tbrest/rest/a;->C:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v2, v18

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    sget-object v0, Lcom/alibaba/sdk/android/tbrest/rest/a;->D:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v2, v17

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    sget-object v0, Lcom/alibaba/sdk/android/tbrest/rest/a;->E:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v2, p5

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    sget-object v0, Lcom/alibaba/sdk/android/tbrest/rest/a;->F:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v2, p4

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    sget-object v0, Lcom/alibaba/sdk/android/tbrest/rest/a;->G:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v2, p3

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    sget-object v0, Lcom/alibaba/sdk/android/tbrest/rest/a;->H:Lcom/alibaba/sdk/android/tbrest/rest/a;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v2, p2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    invoke-static {v1}, Li0/a;->c(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    return-object v0

    :catch_2
    move-exception v0

    .line 79
    :goto_3
    const-string v1, "UTRestAPI buildTracePostReqDataObj catch!"

    invoke-static {v1, v0}, Lj0/e;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v4
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {p0}, Lj0/h;->c(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p0, "-"

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    if-eqz p0, :cond_4

    .line 11
    .line 12
    const-string v0, ""

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_4

    .line 19
    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const/4 v1, 0x0

    .line 34
    :goto_0
    array-length v2, p0

    .line 35
    if-ge v1, v2, :cond_3

    .line 36
    .line 37
    aget-char v2, p0, v1

    .line 38
    .line 39
    const/16 v3, 0xa

    .line 40
    .line 41
    if-eq v2, v3, :cond_2

    .line 42
    .line 43
    const/16 v3, 0xd

    .line 44
    .line 45
    if-eq v2, v3, :cond_2

    .line 46
    .line 47
    const/16 v3, 0x9

    .line 48
    .line 49
    if-eq v2, v3, :cond_2

    .line 50
    .line 51
    const/16 v3, 0x7c

    .line 52
    .line 53
    if-ne v2, v3, :cond_1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    :cond_4
    return-object p0
.end method

.method public static c(Ljava/util/Map;)Ljava/lang/String;
    .locals 12

    .line 1
    new-instance v0, Ljava/lang/StringBuffer;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/alibaba/sdk/android/tbrest/rest/a;->values()[Lcom/alibaba/sdk/android/tbrest/rest/a;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    array-length v2, v1

    .line 11
    const/4 v3, 0x0

    .line 12
    move v4, v3

    .line 13
    :goto_0
    const-string v5, "||"

    .line 14
    .line 15
    const/4 v6, 0x0

    .line 16
    if-ge v4, v2, :cond_2

    .line 17
    .line 18
    aget-object v7, v1, v4

    .line 19
    .line 20
    sget-object v8, Lcom/alibaba/sdk/android/tbrest/rest/a;->H:Lcom/alibaba/sdk/android/tbrest/rest/a;

    .line 21
    .line 22
    if-ne v7, v8, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v8

    .line 29
    invoke-interface {p0, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v8

    .line 33
    if-eqz v8, :cond_1

    .line 34
    .line 35
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    invoke-interface {p0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    invoke-static {v6}, Lj0/h;->b(Ljava/lang/Object;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    invoke-interface {p0, v7}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    :cond_1
    invoke-static {v6}, Li0/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    invoke-virtual {v0, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 62
    .line 63
    .line 64
    add-int/lit8 v4, v4, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    :goto_1
    sget-object v1, Lcom/alibaba/sdk/android/tbrest/rest/a;->H:Lcom/alibaba/sdk/android/tbrest/rest/a;

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-interface {p0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_3

    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-static {v2}, Lj0/h;->b(Ljava/lang/Object;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-static {v2}, Li0/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-interface {p0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move v1, v3

    .line 106
    goto :goto_2

    .line 107
    :cond_3
    const/4 v1, 0x1

    .line 108
    :goto_2
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    if-eqz v4, :cond_8

    .line 121
    .line 122
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    check-cast v4, Ljava/lang/String;

    .line 127
    .line 128
    invoke-interface {p0, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v7

    .line 132
    if-eqz v7, :cond_4

    .line 133
    .line 134
    invoke-interface {p0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    invoke-static {v7}, Lj0/h;->b(Ljava/lang/Object;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    goto :goto_4

    .line 143
    :cond_4
    move-object v7, v6

    .line 144
    :goto_4
    const-string v8, "="

    .line 145
    .line 146
    const-string v9, "StackTrace=====>"

    .line 147
    .line 148
    const-string v10, "StackTrace"

    .line 149
    .line 150
    if-eqz v1, :cond_6

    .line 151
    .line 152
    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    if-eqz v1, :cond_5

    .line 157
    .line 158
    invoke-virtual {v0, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 162
    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_5
    invoke-static {v4}, Li0/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 176
    .line 177
    .line 178
    :goto_5
    move v1, v3

    .line 179
    goto :goto_3

    .line 180
    :cond_6
    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v10

    .line 184
    const-string v11, ","

    .line 185
    .line 186
    if-eqz v10, :cond_7

    .line 187
    .line 188
    invoke-virtual {v0, v11}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 195
    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_7
    invoke-virtual {v0, v11}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 199
    .line 200
    .line 201
    invoke-static {v4}, Li0/a;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 212
    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_8
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    invoke-static {p0}, Lj0/h;->d(Ljava/lang/String;)Z

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    if-nez v0, :cond_9

    .line 224
    .line 225
    invoke-virtual {p0, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    if-eqz v0, :cond_9

    .line 230
    .line 231
    new-instance v0, Ljava/lang/StringBuilder;

    .line 232
    .line 233
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    const-string p0, "-"

    .line 240
    .line 241
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    :cond_9
    return-object p0
.end method
