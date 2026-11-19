.class public Lcom/taobao/sophix/d/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/taobao/sophix/c/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/taobao/sophix/d/a$a;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private volatile i:Z

.field private j:J

.field private k:Ljava/lang/String;

.field private l:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/taobao/sophix/d/a;->i:Z

    .line 6
    .line 7
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/taobao/sophix/d/a;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 14
    .line 15
    return-void
.end method

.method private a(Ljava/lang/String;Lcom/taobao/sophix/c/c;)Lcom/taobao/sophix/d/b/a;
    .locals 18

    move-object/from16 v1, p0

    .line 111
    const-string v2, "x-hotfix-hmac"

    const-string v3, "x-hotfix-cur-time"

    const-string v4, "x-hotfix-retcode"

    const-string v5, "getPatchRemote"

    const-string v6, "NetworkManager"

    const/4 v8, 0x0

    move v10, v8

    const/4 v9, 0x0

    :goto_0
    const/4 v12, 0x1

    .line 112
    :try_start_0
    new-instance v14, Lcom/taobao/sophix/d/a/b;

    invoke-direct {v14}, Lcom/taobao/sophix/d/a/b;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_a

    move-object/from16 v15, p1

    move-object/from16 v9, p2

    .line 113
    :try_start_1
    invoke-direct {v1, v14, v15, v9}, Lcom/taobao/sophix/d/a;->a(Lcom/taobao/sophix/d/a/c;Ljava/lang/String;Lcom/taobao/sophix/c/c;)V

    .line 114
    invoke-interface {v14}, Lcom/taobao/sophix/d/a/c;->a()V

    .line 115
    invoke-interface {v14}, Lcom/taobao/sophix/d/a/c;->b()I

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_9

    const/16 v7, 0xc8

    if-ne v0, v7, :cond_a

    .line 116
    :try_start_2
    invoke-interface {v14}, Lcom/taobao/sophix/d/a/c;->c()Ljava/util/Map;

    move-result-object v0
    :try_end_2
    .catch Lcom/taobao/sophix/a/b; {:try_start_2 .. :try_end_2} :catch_a
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v0, :cond_3

    .line 117
    :try_start_3
    invoke-interface {v0, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    .line 118
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    if-eqz v7, :cond_3

    .line 119
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "query retCode:"

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11
    :try_end_3
    .catch Lcom/taobao/sophix/a/b; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/16 v13, 0x15

    .line 120
    const-string v16, "no update"

    if-eq v7, v13, :cond_2

    const/16 v13, 0x16

    if-eq v7, v13, :cond_1

    packed-switch v7, :pswitch_data_0

    packed-switch v7, :pswitch_data_1

    const/16 v13, 0x1f

    goto/16 :goto_3

    .line 121
    :pswitch_0
    :try_start_4
    const-string v11, "clear patch"
    :try_end_4
    .catch Lcom/taobao/sophix/a/b; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    const/16 v13, 0x12

    goto :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_11

    :catch_0
    move-exception v0

    move-object/from16 v17, v3

    move/from16 v16, v12

    move-object v9, v14

    move v12, v8

    goto/16 :goto_10

    :pswitch_1
    const/16 v13, 0x11

    goto :goto_3

    :goto_1
    :pswitch_2
    move-object/from16 v11, v16

    const/4 v13, 0x6

    goto :goto_3

    :pswitch_3
    const/16 v13, 0xf

    goto :goto_3

    .line 122
    :pswitch_4
    :try_start_5
    invoke-interface {v0, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 123
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 124
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_0

    iget-object v7, v1, Lcom/taobao/sophix/d/a;->k:Ljava/lang/String;

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_0

    .line 125
    const-string v7, "base date"

    iget-object v13, v1, Lcom/taobao/sophix/d/a;->k:Ljava/lang/String;

    const-string v8, "correct date"

    filled-new-array {v7, v13, v8, v0}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6, v5, v7}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 126
    iput-object v0, v1, Lcom/taobao/sophix/d/a;->k:Ljava/lang/String;

    goto :goto_2

    :catch_1
    move-exception v0

    move-object/from16 v17, v3

    move/from16 v16, v12

    move-object v9, v14

    const/4 v12, 0x0

    goto/16 :goto_10

    :cond_0
    :goto_2
    const/16 v13, 0x10

    goto :goto_3

    .line 127
    :cond_1
    iput-boolean v12, v1, Lcom/taobao/sophix/d/a;->i:Z

    goto :goto_1

    :cond_2
    move v7, v8

    .line 128
    iput-boolean v7, v1, Lcom/taobao/sophix/d/a;->i:Z

    goto :goto_1

    .line 129
    :goto_3
    :pswitch_5
    new-instance v0, Lcom/taobao/sophix/a/b;

    invoke-direct {v0, v13, v11}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/String;)V

    throw v0
    :try_end_5
    .catch Lcom/taobao/sophix/a/b; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 130
    :cond_3
    :try_start_6
    invoke-interface {v14}, Lcom/taobao/sophix/d/a/c;->d()Ljava/io/InputStream;

    move-result-object v7
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_9
    .catchall {:try_start_6 .. :try_end_6} :catchall_7

    .line 131
    :try_start_7
    new-instance v8, Ljava/io/BufferedInputStream;

    invoke-direct {v8, v7}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_8
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 132
    :try_start_8
    new-instance v11, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v11}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_7
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    const/16 v13, 0x2000

    .line 133
    :try_start_9
    new-array v13, v13, [B
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_6
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    move/from16 v16, v12

    .line 134
    :goto_4
    :try_start_a
    invoke-virtual {v8, v13}, Ljava/io/InputStream;->read([B)I

    move-result v12
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_5
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    move-object/from16 v17, v3

    const/4 v3, -0x1

    if-eq v12, v3, :cond_4

    const/4 v3, 0x0

    .line 135
    :try_start_b
    invoke-virtual {v11, v13, v3, v12}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    move-object/from16 v3, v17

    goto :goto_4

    :catchall_1
    move-exception v0

    :goto_5
    const/4 v12, 0x0

    goto/16 :goto_e

    :catch_2
    move-exception v0

    :goto_6
    const/4 v12, 0x0

    goto/16 :goto_d

    .line 136
    :cond_4
    new-instance v3, Ljava/lang/String;

    invoke-virtual {v11}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v12

    invoke-direct {v3, v12}, Ljava/lang/String;-><init>([B)V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_2
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 137
    :try_start_c
    invoke-static {v7}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 138
    invoke-static {v8}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 139
    invoke-static {v11}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 140
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_9

    .line 141
    sget-boolean v7, Lcom/taobao/sophix/d/a/a;->c:Z

    if-eqz v7, :cond_7

    .line 142
    iget-object v7, v1, Lcom/taobao/sophix/d/a;->c:Ljava/lang/String;

    invoke-static {v3, v7}, Lcom/taobao/sophix/e/d;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v0, :cond_6

    .line 143
    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    .line 144
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;
    :try_end_c
    .catch Lcom/taobao/sophix/a/b; {:try_start_c .. :try_end_c} :catch_4
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    const/4 v12, 0x0

    :try_start_d
    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 145
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_5

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_8

    :catch_3
    move-exception v0

    :goto_7
    move-object v9, v14

    goto/16 :goto_10

    .line 146
    :cond_5
    new-instance v0, Lcom/taobao/sophix/a/b;

    const-string v3, "query broken"

    const/16 v7, 0x23

    invoke-direct {v0, v7, v3}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/String;)V

    throw v0

    :catch_4
    move-exception v0

    const/4 v12, 0x0

    goto :goto_7

    :cond_6
    const/4 v12, 0x0

    .line 147
    const-string v0, "not found remote hmac"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v6, v5, v0}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
    :try_end_d
    .catch Lcom/taobao/sophix/a/b; {:try_start_d .. :try_end_d} :catch_3
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    goto :goto_8

    :cond_7
    const/4 v12, 0x0

    .line 148
    :goto_8
    :try_start_e
    new-instance v0, Lcom/taobao/sophix/d/b/a;

    invoke-direct {v0}, Lcom/taobao/sophix/d/b/a;-><init>()V

    .line 149
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 150
    const-string v3, "file_token"

    invoke-virtual {v7, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lcom/taobao/sophix/d/b/a;->c:Ljava/lang/String;

    .line 151
    const-string v3, "file_url"

    invoke-virtual {v7, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lcom/taobao/sophix/d/b/a;->a:Ljava/lang/String;

    .line 152
    const-string v3, "patch_version"

    invoke-virtual {v7, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    iput v3, v0, Lcom/taobao/sophix/d/b/a;->b:I

    .line 153
    const-string v3, "file_hmac"

    invoke-virtual {v7, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lcom/taobao/sophix/d/b/a;->d:Ljava/lang/String;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    .line 154
    :try_start_f
    iget-object v3, v0, Lcom/taobao/sophix/d/b/a;->c:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_8

    iget-object v3, v0, Lcom/taobao/sophix/d/b/a;->a:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3
    :try_end_f
    .catch Lcom/taobao/sophix/a/b; {:try_start_f .. :try_end_f} :catch_3
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    if-nez v3, :cond_8

    .line 155
    invoke-interface {v14}, Lcom/taobao/sophix/d/a/c;->e()V

    return-object v0

    .line 156
    :cond_8
    :try_start_10
    new-instance v0, Lcom/taobao/sophix/a/b;

    const-string v3, "query lack token or url"

    const/16 v7, 0x25

    invoke-direct {v0, v7, v3}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/String;)V

    throw v0

    .line 157
    :catchall_2
    new-instance v0, Lcom/taobao/sophix/a/b;

    const-string v3, "query parse json fail"

    const/16 v7, 0x24

    invoke-direct {v0, v7, v3}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/String;)V

    throw v0

    :cond_9
    const/4 v12, 0x0

    .line 158
    new-instance v0, Lcom/taobao/sophix/a/b;

    const-string v3, "no content"

    const/16 v7, 0x22

    invoke-direct {v0, v7, v3}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/String;)V

    throw v0
    :try_end_10
    .catch Lcom/taobao/sophix/a/b; {:try_start_10 .. :try_end_10} :catch_3
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    :catchall_3
    move-exception v0

    move-object/from16 v17, v3

    goto/16 :goto_5

    :catch_5
    move-exception v0

    move-object/from16 v17, v3

    goto/16 :goto_6

    :catchall_4
    move-exception v0

    move-object/from16 v17, v3

    move/from16 v16, v12

    goto/16 :goto_5

    :catch_6
    move-exception v0

    move-object/from16 v17, v3

    move/from16 v16, v12

    goto/16 :goto_6

    :catchall_5
    move-exception v0

    move-object/from16 v17, v3

    move/from16 v16, v12

    const/4 v12, 0x0

    :goto_9
    const/4 v11, 0x0

    goto :goto_e

    :catch_7
    move-exception v0

    move-object/from16 v17, v3

    move/from16 v16, v12

    const/4 v12, 0x0

    :goto_a
    const/4 v11, 0x0

    goto :goto_d

    :catchall_6
    move-exception v0

    move-object/from16 v17, v3

    move/from16 v16, v12

    const/4 v12, 0x0

    :goto_b
    const/4 v8, 0x0

    goto :goto_9

    :catch_8
    move-exception v0

    move-object/from16 v17, v3

    move/from16 v16, v12

    const/4 v12, 0x0

    :goto_c
    const/4 v8, 0x0

    goto :goto_a

    :catchall_7
    move-exception v0

    move-object/from16 v17, v3

    move/from16 v16, v12

    const/4 v12, 0x0

    const/4 v7, 0x0

    goto :goto_b

    :catch_9
    move-exception v0

    move-object/from16 v17, v3

    move/from16 v16, v12

    const/4 v12, 0x0

    const/4 v7, 0x0

    goto :goto_c

    .line 159
    :goto_d
    :try_start_11
    new-instance v3, Lcom/taobao/sophix/a/b;

    const/16 v13, 0x21

    invoke-direct {v3, v13, v0}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/Throwable;)V

    throw v3
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    :catchall_8
    move-exception v0

    .line 160
    :goto_e
    :try_start_12
    invoke-static {v7}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 161
    invoke-static {v8}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 162
    invoke-static {v11}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 163
    throw v0

    :catch_a
    move-exception v0

    move-object/from16 v17, v3

    move/from16 v16, v12

    move v12, v8

    goto/16 :goto_7

    :cond_a
    move-object/from16 v17, v3

    move/from16 v16, v12

    move v12, v8

    .line 164
    new-instance v3, Lcom/taobao/sophix/a/b;

    const-string v7, "query fail as response code"

    invoke-direct {v3, v0, v7}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/String;)V

    throw v3
    :try_end_12
    .catch Lcom/taobao/sophix/a/b; {:try_start_12 .. :try_end_12} :catch_3
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    :catchall_9
    move-exception v0

    move-object/from16 v17, v3

    move/from16 v16, v12

    move v12, v8

    move-object v9, v14

    goto :goto_f

    :catchall_a
    move-exception v0

    move-object/from16 v15, p1

    move-object/from16 v17, v3

    move/from16 v16, v12

    move v12, v8

    .line 165
    :goto_f
    :try_start_13
    new-instance v3, Lcom/taobao/sophix/a/b;

    const/16 v7, 0x20

    invoke-direct {v3, v7, v0}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/Throwable;)V

    throw v3
    :try_end_13
    .catch Lcom/taobao/sophix/a/b; {:try_start_13 .. :try_end_13} :catch_b
    .catchall {:try_start_13 .. :try_end_13} :catchall_b

    :catchall_b
    move-exception v0

    move-object v14, v9

    goto :goto_11

    :catch_b
    move-exception v0

    :goto_10
    add-int/lit8 v10, v10, 0x1

    const/4 v3, 0x2

    if-gt v10, v3, :cond_d

    .line 166
    :try_start_14
    invoke-virtual {v0}, Lcom/taobao/sophix/a/b;->a()I

    move-result v3

    const/4 v7, 0x6

    if-eq v3, v7, :cond_c

    .line 167
    invoke-virtual {v0}, Lcom/taobao/sophix/a/b;->a()I

    move-result v3
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_b

    const/16 v7, 0x12

    if-eq v3, v7, :cond_c

    const-wide/16 v7, 0x1f4

    .line 168
    :try_start_15
    invoke-static {v7, v8}, Ljava/lang/Thread;->sleep(J)V
    :try_end_15
    .catch Ljava/lang/InterruptedException; {:try_start_15 .. :try_end_15} :catch_c
    .catchall {:try_start_15 .. :try_end_15} :catchall_b

    .line 169
    :catch_c
    :try_start_16
    const-string v0, "retry num"

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v6, v5, v0}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_b

    if-eqz v9, :cond_b

    .line 170
    invoke-interface {v9}, Lcom/taobao/sophix/d/a/c;->e()V

    :cond_b
    move v8, v12

    move-object/from16 v3, v17

    goto/16 :goto_0

    .line 171
    :cond_c
    :try_start_17
    throw v0

    .line 172
    :cond_d
    throw v0
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_b

    :goto_11
    if-eqz v14, :cond_e

    .line 173
    invoke-interface {v14}, Lcom/taobao/sophix/d/a/c;->e()V

    .line 174
    :cond_e
    throw v0

    :pswitch_data_0
    .packed-switch -0x66
        :pswitch_4
        :pswitch_3
        :pswitch_5
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0xa
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private a(Lcom/taobao/sophix/d/b/a;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    const/4 v0, 0x0

    .line 209
    :try_start_0
    new-instance v1, Lcom/taobao/sophix/d/a/b;

    invoke-direct {v1}, Lcom/taobao/sophix/d/a/b;-><init>()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    .line 210
    :try_start_1
    iget-object v2, p1, Lcom/taobao/sophix/d/b/a;->a:Ljava/lang/String;

    invoke-interface {v1, v2}, Lcom/taobao/sophix/d/a/c;->a(Ljava/lang/String;)V

    .line 211
    invoke-interface {v1}, Lcom/taobao/sophix/d/a/c;->a()V

    .line 212
    invoke-interface {v1}, Lcom/taobao/sophix/d/a/c;->b()I

    move-result v2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/16 v3, 0xc8

    if-ne v2, v3, :cond_4

    .line 213
    :try_start_2
    new-instance v2, Ljava/io/File;

    iget-object v3, p1, Lcom/taobao/sophix/d/b/a;->a:Ljava/lang/String;

    iget v4, p1, Lcom/taobao/sophix/d/b/a;->b:I

    invoke-direct {p0, v3, v4}, Lcom/taobao/sophix/d/a;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, p2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 214
    :try_start_3
    invoke-interface {v1}, Lcom/taobao/sophix/d/a/c;->d()Ljava/io/InputStream;

    move-result-object p2
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 215
    :try_start_4
    new-instance v3, Ljava/io/BufferedInputStream;

    invoke-direct {v3, p2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 216
    :try_start_5
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 217
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    goto :goto_2

    :catchall_0
    move-exception p1

    move-object v4, v0

    :goto_0
    move-object v0, p2

    goto/16 :goto_6

    :catch_0
    move-exception p1

    move-object v4, v0

    :goto_1
    move-object v0, p2

    goto/16 :goto_5

    .line 218
    :cond_0
    :goto_2
    new-instance v4, Ljava/io/FileOutputStream;

    invoke-direct {v4, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    const/16 v0, 0x2000

    .line 219
    :try_start_6
    new-array v0, v0, [B

    .line 220
    :goto_3
    invoke-virtual {v3, v0}, Ljava/io/InputStream;->read([B)I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_1

    const/4 v6, 0x0

    .line 221
    invoke-virtual {v4, v0, v6, v5}, Ljava/io/OutputStream;->write([BII)V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    .line 222
    :cond_1
    :try_start_7
    invoke-static {p2}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 223
    invoke-static {v3}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 224
    invoke-static {v4}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 225
    sget-boolean p2, Lcom/taobao/sophix/d/a/a;->c:Z

    if-eqz p2, :cond_3

    .line 226
    iget-object p2, p0, Lcom/taobao/sophix/d/a;->c:Ljava/lang/String;

    invoke-static {v2, p2}, Lcom/taobao/sophix/e/d;->a(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 227
    iget-object p1, p1, Lcom/taobao/sophix/d/b/a;->d:Ljava/lang/String;

    .line 228
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_4

    .line 229
    :cond_2
    new-instance p1, Lcom/taobao/sophix/a/b;

    const-string p2, "download broken"

    const/16 v0, 0xa

    invoke-direct {p1, v0, p2}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/String;)V

    throw p1

    :catchall_2
    move-exception p1

    move-object v0, v1

    goto :goto_8

    .line 230
    :cond_3
    :goto_4
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 231
    invoke-interface {v1}, Lcom/taobao/sophix/d/a/c;->e()V

    return-object p1

    :catchall_3
    move-exception p1

    move-object v3, v0

    move-object v4, v3

    goto :goto_0

    :catch_2
    move-exception p1

    move-object v3, v0

    move-object v4, v3

    goto :goto_1

    :catchall_4
    move-exception p1

    move-object v3, v0

    move-object v4, v3

    goto :goto_6

    :catch_3
    move-exception p1

    move-object v3, v0

    move-object v4, v3

    .line 232
    :goto_5
    :try_start_8
    new-instance p2, Lcom/taobao/sophix/a/b;

    const/16 v2, 0x34

    invoke-direct {p2, v2, p1}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/Throwable;)V

    throw p2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    :catchall_5
    move-exception p1

    .line 233
    :goto_6
    :try_start_9
    invoke-static {v0}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 234
    invoke-static {v3}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 235
    invoke-static {v4}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 236
    throw p1

    .line 237
    :cond_4
    new-instance p1, Lcom/taobao/sophix/a/b;

    const-string p2, "download fail as response code"

    invoke-direct {p1, v2, p2}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/String;)V

    throw p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :catch_4
    move-exception p1

    move-object v0, v1

    goto :goto_7

    :catchall_6
    move-exception p1

    goto :goto_8

    :catch_5
    move-exception p1

    .line 238
    :goto_7
    :try_start_a
    new-instance p2, Lcom/taobao/sophix/a/b;

    const/16 v1, 0x33

    invoke-direct {p2, v1, p1}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/Throwable;)V

    throw p2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    :goto_8
    if-eqz v0, :cond_5

    .line 239
    invoke-interface {v0}, Lcom/taobao/sophix/d/a/c;->e()V

    .line 240
    :cond_5
    throw p1
.end method

.method private a(Ljava/lang/String;I)Ljava/lang/String;
    .locals 5

    .line 241
    const-string v0, "/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    add-int/2addr v0, v1

    .line 242
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 243
    const-string v0, "\\."

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 244
    const-string v2, "_"

    if-eqz v0, :cond_0

    array-length v3, v0

    const/4 v4, 0x2

    if-lt v3, v4, :cond_0

    .line 245
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v3, 0x0

    aget-object v3, v0, v3

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object p2, v0, v1

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 246
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ".patch"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic a(Lcom/taobao/sophix/d/a;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/taobao/sophix/d/a;->h:Ljava/util/List;

    return-object p0
.end method

.method private a()V
    .locals 5

    .line 90
    const-string v0, "NetworkManager"

    const/4 v1, 0x0

    :try_start_0
    sget-object v2, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    const-string v3, "com.ta.utdid2.device.UTDevice"

    .line 91
    invoke-virtual {v2, v3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const-string v3, "getUtdid"

    const-class v4, Landroid/content/Context;

    filled-new-array {v4}, [Ljava/lang/Class;

    move-result-object v4

    .line 92
    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    sget-object v3, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    .line 93
    invoke-virtual {v3}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v2, v4, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "UTF-8"

    .line 94
    invoke-static {v2, v3}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    iget-object v3, p0, Lcom/taobao/sophix/d/a;->f:Ljava/lang/String;

    if-eqz v3, :cond_1

    .line 96
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 97
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "device id changed! "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/taobao/sophix/d/a;->f:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v1}, Lcom/taobao/sophix/e/e;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    :cond_0
    return-void

    .line 98
    :cond_1
    sget-object v0, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    const-string v1, "SP_SOPHIX_DEVICE_ID"

    invoke-static {v0, v1, v2}, Lcom/taobao/sophix/e/j;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    iput-object v2, p0, Lcom/taobao/sophix/d/a;->f:Ljava/lang/String;

    return-void

    :catchall_0
    move-exception v2

    .line 100
    const-string v3, "initDeviceId"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v3, v2, v1}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)I

    .line 101
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "fail to include utdid"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private a(Lcom/taobao/sophix/d/a/c;Ljava/lang/String;Lcom/taobao/sophix/c/c;)V
    .locals 8

    .line 175
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, "3.3.5"

    const-string v2, "x-hotfix-sdk-version"

    const-string v3, "android"

    const-string v4, "x-hotfix-os"

    const-string v5, "openConnection"

    const-string v6, "NetworkManager"

    if-nez v0, :cond_0

    .line 176
    const-string p3, "cdn reqUrl"

    filled-new-array {p3, p2}, [Ljava/lang/Object;

    move-result-object p3

    invoke-static {v6, v5, p3}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 177
    invoke-interface {p1, p2}, Lcom/taobao/sophix/d/a/c;->a(Ljava/lang/String;)V

    .line 178
    invoke-interface {p1, v4, v3}, Lcom/taobao/sophix/d/a/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    invoke-interface {p1, v2, v1}, Lcom/taobao/sophix/d/a/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 180
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 181
    iget-object v0, p3, Lcom/taobao/sophix/c/c;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 182
    const-string v0, "/u/"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/taobao/sophix/d/a;->b:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, p0, Lcom/taobao/sophix/d/a;->f:Ljava/lang/String;

    .line 183
    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 184
    :cond_1
    const-string v0, "/r/"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/taobao/sophix/d/a;->b:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, p0, Lcom/taobao/sophix/d/a;->f:Ljava/lang/String;

    .line 185
    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    iget-object v7, p3, Lcom/taobao/sophix/c/c;->c:Ljava/lang/String;

    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    :goto_0
    iget-object v0, p0, Lcom/taobao/sophix/d/a;->a:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v7, p3, Lcom/taobao/sophix/c/c;->d:I

    .line 188
    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v7, Lcom/taobao/sophix/d/a/a;->b:Ljava/lang/String;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v7, Lcom/taobao/sophix/d/a/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 190
    const-string v7, "auth reqUrl"

    filled-new-array {v7, v0}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6, v5, v7}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 191
    invoke-interface {p1, v0}, Lcom/taobao/sophix/d/a/c;->a(Ljava/lang/String;)V

    .line 192
    invoke-interface {p1, v4, v3}, Lcom/taobao/sophix/d/a/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    invoke-interface {p1, v2, v1}, Lcom/taobao/sophix/d/a/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    const-string v0, "x-hotfix-info"

    iget-object v1, p0, Lcom/taobao/sophix/d/a;->e:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/taobao/sophix/d/a/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    iget-object v0, p0, Lcom/taobao/sophix/d/a;->k:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 196
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyyMMdd"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 197
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/taobao/sophix/d/a;->k:Ljava/lang/String;

    .line 198
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lcom/taobao/sophix/d/a;->k:Ljava/lang/String;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lcom/taobao/sophix/d/a;->c:Ljava/lang/String;

    invoke-static {p2, v0}, Lcom/taobao/sophix/e/d;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 199
    const-string v0, "x-hotfix-token"

    invoke-interface {p1, v0, p2}, Lcom/taobao/sophix/d/a/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    iget-object p2, p3, Lcom/taobao/sophix/c/c;->c:Ljava/lang/String;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 201
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "cdate="

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/taobao/sophix/d/a;->k:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    .line 202
    :cond_3
    invoke-virtual {p3}, Lcom/taobao/sophix/c/c;->b()Ljava/lang/String;

    move-result-object p2

    .line 203
    iget v0, p3, Lcom/taobao/sophix/c/c;->i:I

    const/16 v1, -0x270f

    if-eq v0, v1, :cond_4

    .line 204
    const-string v1, "x-hotfix-error"

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lcom/taobao/sophix/d/a/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    :cond_4
    :goto_1
    const-string v0, "x-hotfix-request-id"

    iget-object p3, p3, Lcom/taobao/sophix/c/c;->a:Ljava/lang/String;

    invoke-interface {p1, v0, p3}, Lcom/taobao/sophix/d/a/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    const-string p3, "x-hotfix-ext"

    invoke-interface {p1, p3, p2}, Lcom/taobao/sophix/d/a/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 207
    :try_start_0
    const-string p2, "x-hotfix-env"

    new-instance p3, Lcom/taobao/sophix/d/a$a;

    const/4 v0, 0x0

    invoke-direct {p3, p0, v0}, Lcom/taobao/sophix/d/a$a;-><init>(Lcom/taobao/sophix/d/a;Lcom/taobao/sophix/d/a$1;)V

    invoke-virtual {p3}, Lcom/taobao/sophix/d/a$a;->a()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Lcom/taobao/sophix/d/a/c;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 208
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v6, p2, p1}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method public static synthetic a(Lcom/taobao/sophix/d/a;Lcom/taobao/sophix/d/a/c;Ljava/lang/String;Lcom/taobao/sophix/c/c;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/taobao/sophix/d/a;->a(Lcom/taobao/sophix/d/a/c;Ljava/lang/String;Lcom/taobao/sophix/c/c;)V

    return-void
.end method

.method private b()V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "osversion"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, "="

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v2, ","

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v3, "manufacturer"

    .line 27
    .line 28
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    sget-object v3, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v3, "brand"

    .line 43
    .line 44
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    sget-object v3, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v3, "model"

    .line 59
    .line 60
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v2, "os"

    .line 75
    .line 76
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v1, "android"

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iput-object v0, p0, Lcom/taobao/sophix/d/a;->e:Ljava/lang/String;

    .line 92
    .line 93
    sget-object v0, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    .line 94
    .line 95
    const-string v1, "SP_SOPHIX_DEVICE_ID"

    .line 96
    .line 97
    const/4 v2, 0x0

    .line 98
    invoke-static {v0, v1, v2}, Lcom/taobao/sophix/e/j;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    iput-object v0, p0, Lcom/taobao/sophix/d/a;->f:Ljava/lang/String;

    .line 103
    .line 104
    return-void
.end method

.method private c()V
    .locals 4

    .line 1
    :try_start_0
    sget-object v0, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "com.ta.utdid2.device.SophixInvoker"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "invokeAlicloudReport"

    .line 14
    .line 15
    const-class v2, Landroid/app/Application;

    .line 16
    .line 17
    const-class v3, Ljava/lang/String;

    .line 18
    .line 19
    filled-new-array {v2, v3}, [Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sget-object v1, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    .line 28
    .line 29
    iget-object v2, p0, Lcom/taobao/sophix/d/a;->b:Ljava/lang/String;

    .line 30
    .line 31
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catch_0
    move-exception v0

    .line 41
    const/4 v1, 0x0

    .line 42
    new-array v1, v1, [Ljava/lang/Object;

    .line 43
    .line 44
    const-string v2, "NetworkManager"

    .line 45
    .line 46
    const-string v3, "reportDailyActive fail to invoke ams reporter"

    .line 47
    .line 48
    invoke-static {v2, v3, v0, v1}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)I

    .line 49
    .line 50
    .line 51
    new-instance v0, Ljava/lang/RuntimeException;

    .line 52
    .line 53
    const-string v1, "may not keep com.alibaba.sdk.android.sender"

    .line 54
    .line 55
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v0
.end method


# virtual methods
.method public declared-synchronized a(Ljava/lang/String;Lcom/taobao/sophix/c/c;Lcom/taobao/sophix/listener/PatchLoadStatusListener;)Ljava/lang/String;
    .locals 8

    monitor-enter p0

    .line 29
    :try_start_0
    iget-object v0, p0, Lcom/taobao/sophix/d/a;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    .line 30
    const-string p1, "NetworkManager"

    const-string p2, "query fail as not init"

    new-array p3, v2, [Ljava/lang/Object;

    invoke-static {p1, p2, p3}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    .line 32
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/taobao/sophix/d/a;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 33
    const-string p1, "NetworkManager"

    const-string p2, "query fail as appId is empty"

    new-array p3, v2, [Ljava/lang/Object;

    invoke-static {p1, p2, p3}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    monitor-exit p0

    return-object v1

    .line 35
    :cond_1
    :try_start_2
    sget-boolean v0, Lcom/taobao/sophix/d/a/a;->c:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/taobao/sophix/d/a;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/taobao/sophix/d/a;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 36
    :cond_2
    const-string p1, "NetworkManager"

    const-string p2, "query fail as appSecret/rsaSecret is empty"

    new-array p3, v2, [Ljava/lang/Object;

    invoke-static {p1, p2, p3}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 37
    monitor-exit p0

    return-object v1

    .line 38
    :cond_3
    :try_start_3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    if-nez p2, :cond_4

    .line 39
    const-string p1, "NetworkManager"

    const-string p2, "query fail as param is empty"

    new-array p3, v2, [Ljava/lang/Object;

    invoke-static {p1, p2, p3}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 40
    monitor-exit p0

    return-object v1

    .line 41
    :cond_4
    :try_start_4
    invoke-direct {p0}, Lcom/taobao/sophix/d/a;->a()V

    .line 42
    iget-object v0, p0, Lcom/taobao/sophix/d/a;->f:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 43
    const-string p1, "NetworkManager"

    const-string p2, "query fail as can\'t get device id"

    new-array p3, v2, [Ljava/lang/Object;

    invoke-static {p1, p2, p3}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 44
    monitor-exit p0

    return-object v1

    .line 45
    :cond_5
    :try_start_5
    iget-wide v3, p0, Lcom/taobao/sophix/d/a;->j:J

    const-wide/16 v5, 0x0

    cmp-long v0, v3, v5

    if-eqz v0, :cond_6

    .line 46
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v5, p0, Lcom/taobao/sophix/d/a;->j:J

    sub-long/2addr v3, v5

    const-wide/16 v5, 0xbb8

    cmp-long v0, v3, v5

    if-gtz v0, :cond_6

    .line 47
    const-string p1, "NetworkManager"

    const-string p2, "query fail as two consecutive query should not short than 3s"

    new-array p3, v2, [Ljava/lang/Object;

    invoke-static {p1, p2, p3}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 48
    monitor-exit p0

    return-object v1

    .line 49
    :cond_6
    :try_start_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iput-wide v3, p0, Lcom/taobao/sophix/d/a;->j:J

    .line 50
    sget-boolean v0, Lcom/taobao/sophix/d/a/a;->c:Z

    if-eqz v0, :cond_7

    .line 51
    invoke-direct {p0}, Lcom/taobao/sophix/d/a;->c()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 52
    :cond_7
    :try_start_7
    const-string v0, "NetworkManager"

    const-string v3, "query start"

    new-array v4, v2, [Ljava/lang/Object;

    invoke-static {v0, v3, v4}, Lcom/taobao/sophix/e/e;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 53
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 54
    invoke-direct {p0, p1, p2}, Lcom/taobao/sophix/d/a;->a(Ljava/lang/String;Lcom/taobao/sophix/c/c;)Lcom/taobao/sophix/d/b/a;

    move-result-object p1

    .line 55
    const-string v0, "NetworkManager"

    const-string v5, "query"

    const-string v6, "get remote patch"

    filled-new-array {v6, p1}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v0, v5, v6}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 56
    iget v0, p2, Lcom/taobao/sophix/c/c;->d:I

    const/4 v5, -0x1

    if-eq v0, v5, :cond_9

    iget v6, p1, Lcom/taobao/sophix/d/b/a;->b:I

    if-le v6, v0, :cond_8

    goto :goto_0

    .line 57
    :cond_8
    new-instance p1, Lcom/taobao/sophix/a/b;

    const-string v0, "patch version is smaller than current"

    const/4 v3, 0x7

    invoke-direct {p1, v3, v0}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/String;)V

    throw p1

    :catchall_1
    move-exception p1

    goto/16 :goto_1

    :catch_0
    move-exception p1

    goto/16 :goto_2

    :cond_9
    :goto_0
    if-eq v0, v5, :cond_a

    .line 58
    iget v0, p1, Lcom/taobao/sophix/d/b/a;->b:I

    iput v0, p2, Lcom/taobao/sophix/c/c;->d:I

    .line 59
    :cond_a
    new-instance v0, Ljava/io/File;

    iget-object v5, p0, Lcom/taobao/sophix/d/a;->g:Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    .line 60
    invoke-direct {p0, p1, v0}, Lcom/taobao/sophix/d/a;->a(Lcom/taobao/sophix/d/b/a;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 61
    const-string v5, "NetworkManager"

    const-string v6, "query"

    const-string v7, "local server decrypt patch"

    filled-new-array {v7, v0}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v5, v6, v7}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 62
    iget-object v5, p0, Lcom/taobao/sophix/d/a;->g:Ljava/lang/String;

    iget-object v6, p1, Lcom/taobao/sophix/d/b/a;->c:Ljava/lang/String;

    iget-object v7, p0, Lcom/taobao/sophix/d/a;->d:Ljava/lang/String;

    invoke-static {v0, v5, v6, v7}, Lcom/taobao/sophix/e/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 63
    new-instance v0, Ljava/io/File;

    iget-object v5, p0, Lcom/taobao/sophix/d/a;->g:Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 64
    const-string v0, "NetworkManager"

    const-string v5, "query"

    const-string v6, "download success"

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v0, v5, v6}, Lcom/taobao/sophix/e/e;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 65
    const-string v0, "download success"

    iget p1, p1, Lcom/taobao/sophix/d/b/a;->b:I

    const/16 v5, 0x9

    invoke-interface {p3, v2, v5, v0, p1}, Lcom/taobao/sophix/listener/PatchLoadStatusListener;->onLoad(IILjava/lang/String;I)V

    .line 66
    sget-object p1, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    const-string v0, "hpatch_clear"

    invoke-static {p1, v0, v2}, Lcom/taobao/sophix/e/j;->b(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 67
    new-instance p1, Ljava/io/File;

    iget-object v0, p0, Lcom/taobao/sophix/d/a;->g:Ljava/lang/String;

    invoke-direct {p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 68
    const-string v0, "100"

    iput-object v0, p2, Lcom/taobao/sophix/c/c;->c:Ljava/lang/String;

    .line 69
    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v5

    iput-wide v5, p2, Lcom/taobao/sophix/c/c;->g:J

    .line 70
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    sub-long/2addr v5, v3

    iput-wide v5, p2, Lcom/taobao/sophix/c/c;->e:J

    .line 71
    invoke-virtual {p0, p2}, Lcom/taobao/sophix/d/a;->a(Lcom/taobao/sophix/c/c;)V

    .line 72
    new-instance p1, Ljava/io/File;

    iget-object v0, p0, Lcom/taobao/sophix/d/a;->g:Ljava/lang/String;

    invoke-direct {p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_b

    iget-object v1, p0, Lcom/taobao/sophix/d/a;->g:Ljava/lang/String;
    :try_end_7
    .catch Lcom/taobao/sophix/a/b; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :cond_b
    monitor-exit p0

    return-object v1

    .line 73
    :cond_c
    :try_start_8
    new-instance p1, Lcom/taobao/sophix/a/b;

    const-string v0, "server decrypt fail"

    const/16 v3, 0xb

    invoke-direct {p1, v3, v0}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/String;)V

    throw p1
    :try_end_8
    .catch Lcom/taobao/sophix/a/b; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 74
    :goto_1
    :try_start_9
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    iget v0, p2, Lcom/taobao/sophix/c/c;->d:I

    const/16 v3, 0x1f

    invoke-interface {p3, v2, v3, p1, v0}, Lcom/taobao/sophix/listener/PatchLoadStatusListener;->onLoad(IILjava/lang/String;I)V

    .line 75
    const-string p1, "101"

    iput-object p1, p2, Lcom/taobao/sophix/c/c;->c:Ljava/lang/String;

    .line 76
    iput v3, p2, Lcom/taobao/sophix/c/c;->i:I

    .line 77
    invoke-virtual {p0, p2}, Lcom/taobao/sophix/d/a;->a(Lcom/taobao/sophix/c/c;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 78
    monitor-exit p0

    return-object v1

    .line 79
    :goto_2
    :try_start_a
    invoke-virtual {p1}, Lcom/taobao/sophix/a/b;->a()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    iget v4, p2, Lcom/taobao/sophix/c/c;->d:I

    invoke-interface {p3, v2, v0, v3, v4}, Lcom/taobao/sophix/listener/PatchLoadStatusListener;->onLoad(IILjava/lang/String;I)V

    .line 80
    invoke-virtual {p1}, Lcom/taobao/sophix/a/b;->a()I

    move-result p3

    const/4 v0, 0x6

    if-ne p3, v0, :cond_d

    .line 81
    const-string p2, "NetworkManager"

    const-string p3, "query"

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p3, p1}, Lcom/taobao/sophix/e/e;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    goto :goto_3

    .line 82
    :cond_d
    invoke-virtual {p1}, Lcom/taobao/sophix/a/b;->a()I

    move-result p3

    const/16 v0, 0x12

    if-ne p3, v0, :cond_e

    .line 83
    const-string p2, "NetworkManager"

    const-string p3, "query"

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p3, p1}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 84
    sget-object p1, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    const-string p2, "hpatch_clear"

    const/4 p3, 0x1

    invoke-static {p1, p2, p3}, Lcom/taobao/sophix/e/j;->b(Landroid/content/Context;Ljava/lang/String;Z)V

    goto :goto_3

    .line 85
    :cond_e
    const-string p3, "NetworkManager"

    const-string v0, "query fail"

    const-string v2, "code"

    invoke-virtual {p1}, Lcom/taobao/sophix/a/b;->a()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "msg"

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    filled-new-array {v2, v3, v4, v5}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {p3, v0, p1, v2}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)I

    .line 86
    const-string p3, "101"

    iput-object p3, p2, Lcom/taobao/sophix/c/c;->c:Ljava/lang/String;

    .line 87
    invoke-virtual {p1}, Lcom/taobao/sophix/a/b;->a()I

    move-result p1

    iput p1, p2, Lcom/taobao/sophix/c/c;->i:I

    .line 88
    invoke-virtual {p0, p2}, Lcom/taobao/sophix/d/a;->a(Lcom/taobao/sophix/c/c;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 89
    :goto_3
    monitor-exit p0

    return-object v1

    :goto_4
    :try_start_b
    monitor-exit p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    throw p1
.end method

.method public a(Lcom/taobao/sophix/c/c;)V
    .locals 4

    .line 102
    iget-object v0, p0, Lcom/taobao/sophix/d/a;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 103
    :cond_0
    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "NetworkManager"

    const-string v2, "commit"

    invoke-static {v1, v2, v0}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 104
    iget-boolean v0, p0, Lcom/taobao/sophix/d/a;->i:Z

    if-eqz v0, :cond_5

    sget-object v0, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    invoke-static {v0}, Lcom/taobao/sophix/e/g;->a(Landroid/app/Application;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    if-eqz p1, :cond_5

    .line 105
    iget-object v0, p1, Lcom/taobao/sophix/c/c;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    iget v0, p1, Lcom/taobao/sophix/c/c;->d:I

    const/4 v3, -0x1

    if-ne v0, v3, :cond_2

    goto :goto_1

    .line 106
    :cond_2
    iget-object v0, p0, Lcom/taobao/sophix/d/a;->f:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 107
    const-string p1, "device id is empty"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v1, v2, p1}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    return-void

    .line 108
    :cond_3
    new-instance v0, Lcom/taobao/sophix/c/c;

    invoke-direct {v0, p1}, Lcom/taobao/sophix/c/c;-><init>(Lcom/taobao/sophix/c/c;)V

    .line 109
    const-string p1, "301"

    iget-object v1, v0, Lcom/taobao/sophix/c/c;->c:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const-wide/16 v1, 0x0

    goto :goto_0

    :cond_4
    const-wide/16 v1, 0xbb8

    .line 110
    :goto_0
    new-instance p1, Lcom/taobao/sophix/d/a$1;

    invoke-direct {p1, p0, v0}, Lcom/taobao/sophix/d/a$1;-><init>(Lcom/taobao/sophix/d/a;Lcom/taobao/sophix/c/c;)V

    invoke-static {p1, v1, v2}, Lcom/taobao/sophix/e/l;->a(Ljava/lang/Runnable;J)V

    :cond_5
    :goto_1
    return-void
.end method

.method public declared-synchronized a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    monitor-enter p0

    .line 3
    :try_start_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 4
    iget-object v0, p0, Lcom/taobao/sophix/d/a;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_5

    .line 5
    const-string v0, "NetworkManager"

    const-string v1, "init"

    const-string v2, "appVersion"

    filled-new-array {v2, p2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/taobao/sophix/e/e;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 6
    iput-object p2, p0, Lcom/taobao/sophix/d/a;->a:Ljava/lang/String;

    .line 7
    new-instance p2, Ljava/io/File;

    const-string v0, "download"

    invoke-direct {p2, p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    move-result p1

    if-nez p1, :cond_0

    .line 9
    invoke-virtual {p2}, Ljava/io/File;->mkdirs()Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    .line 10
    :cond_0
    sget-object p1, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    invoke-static {p1}, Lcom/taobao/sophix/e/g;->a(Landroid/app/Application;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 11
    invoke-static {p2}, Lcom/taobao/sophix/e/c;->a(Ljava/io/File;)V

    .line 12
    :cond_1
    :goto_0
    new-instance p1, Ljava/io/File;

    const-string v0, "sophix-patch.jar"

    invoke-direct {p1, p2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/taobao/sophix/d/a;->g:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    :try_start_1
    sget-object p1, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    sget-object p2, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    invoke-virtual {p2}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p2

    const/16 v0, 0x80

    invoke-virtual {p1, p2, v0}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    .line 14
    iget-object p2, p0, Lcom/taobao/sophix/d/a;->b:Ljava/lang/String;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 15
    iget-object p2, p1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v0, "com.taobao.android.hotfix.IDSECRET"

    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/taobao/sophix/d/a;->b:Ljava/lang/String;

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_2

    .line 16
    :cond_2
    :goto_1
    iget-object p2, p0, Lcom/taobao/sophix/d/a;->c:Ljava/lang/String;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 17
    iget-object p2, p1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v0, "com.taobao.android.hotfix.APPSECRET"

    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/taobao/sophix/d/a;->c:Ljava/lang/String;

    .line 18
    :cond_3
    iget-object p2, p0, Lcom/taobao/sophix/d/a;->d:Ljava/lang/String;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 19
    iget-object p1, p1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string p2, "com.taobao.android.hotfix.RSASECRET"

    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/taobao/sophix/d/a;->d:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    .line 20
    :goto_2
    :try_start_2
    const-string p2, "NetworkManager"

    const-string v0, "init"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p2, v0, p1, v1}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)I

    .line 21
    :cond_4
    :goto_3
    invoke-direct {p0}, Lcom/taobao/sophix/d/a;->b()V

    .line 22
    iget-object p1, p0, Lcom/taobao/sophix/d/a;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 23
    :cond_5
    monitor-exit p0

    return-void

    .line 24
    :cond_6
    :try_start_3
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "app version is null"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 25
    :goto_4
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/taobao/sophix/d/a;->b:Ljava/lang/String;

    .line 27
    iput-object p2, p0, Lcom/taobao/sophix/d/a;->c:Ljava/lang/String;

    .line 28
    iput-object p3, p0, Lcom/taobao/sophix/d/a;->d:Ljava/lang/String;

    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 247
    iput-object p1, p0, Lcom/taobao/sophix/d/a;->h:Ljava/util/List;

    return-void
.end method
