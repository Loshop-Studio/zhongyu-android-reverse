.class public Lcom/taobao/sophix/a/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Ljava/io/File;

.field private c:Ljava/io/File;

.field private d:Ljava/io/File;

.field private e:Ljava/io/File;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Z

.field private i:Landroid/app/Application;

.field private j:Z

.field private volatile k:Lcom/taobao/sophix/a/d;

.field private l:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private m:Z

.field private n:Z

.field private o:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/taobao/sophix/a/c;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    iput-boolean v1, p0, Lcom/taobao/sophix/a/c;->m:Z

    .line 13
    .line 14
    iput-boolean v1, p0, Lcom/taobao/sophix/a/c;->n:Z

    .line 15
    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lcom/taobao/sophix/a/c;->o:Ljava/util/List;

    .line 22
    .line 23
    return-void
.end method

.method private a(Ljava/io/File;)Ljava/util/jar/Attributes;
    .locals 5

    const/4 v0, 0x0

    .line 205
    :try_start_0
    new-instance v1, Ljava/util/jar/JarFile;

    invoke-direct {v1, p1}, Ljava/util/jar/JarFile;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 206
    :try_start_1
    const-string p1, "META-INF/SOPHIX.MF"

    invoke-virtual {v1, p1}, Ljava/util/jar/JarFile;->getJarEntry(Ljava/lang/String;)Ljava/util/jar/JarEntry;

    move-result-object p1

    .line 207
    invoke-virtual {v1, p1}, Ljava/util/jar/JarFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object v0

    .line 208
    new-instance p1, Ljava/util/jar/Manifest;

    invoke-direct {p1, v0}, Ljava/util/jar/Manifest;-><init>(Ljava/io/InputStream;)V

    .line 209
    invoke-virtual {p1}, Ljava/util/jar/Manifest;->getMainAttributes()Ljava/util/jar/Attributes;

    move-result-object p1

    .line 210
    const-string v2, "Sophix-Version"

    invoke-virtual {p1, v2}, Ljava/util/jar/Attributes;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 211
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "2.0"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v3, :cond_0

    .line 212
    invoke-static {v0}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 213
    invoke-static {v1}, Lcom/taobao/sophix/e/c;->a(Ljava/util/zip/ZipFile;)V

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    .line 214
    :cond_0
    :try_start_2
    new-instance p1, Lcom/taobao/sophix/a/b;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "require version:2.0 but patch version:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x4c

    invoke-direct {p1, v3, v2}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/String;)V

    throw p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_1
    move-exception p1

    move-object v1, v0

    goto :goto_1

    :catch_1
    move-exception p1

    move-object v1, v0

    .line 215
    :goto_0
    :try_start_3
    new-instance v2, Lcom/taobao/sophix/a/b;

    const/16 v3, 0x49

    invoke-direct {v2, v3, p1}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/Throwable;)V

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 216
    :goto_1
    invoke-static {v0}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 217
    invoke-static {v1}, Lcom/taobao/sophix/e/c;->a(Ljava/util/zip/ZipFile;)V

    .line 218
    throw p1
.end method

.method public static synthetic a(Lcom/taobao/sophix/a/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/taobao/sophix/a/c;->k()V

    return-void
.end method

.method private a(Lcom/taobao/sophix/listener/PatchLoadStatusListener;)V
    .locals 5

    .line 50
    iget-boolean v0, p0, Lcom/taobao/sophix/a/c;->j:Z

    const-string v1, "handleLocalPatch"

    const-string v2, "PatchManager"

    if-eqz v0, :cond_1

    .line 51
    sget-object v0, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    const-string v3, "happ_crash_num"

    const/4 v4, 0x0

    invoke-static {v0, v3, v4}, Lcom/taobao/sophix/e/j;->a(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v0

    const/4 v3, 0x5

    if-lt v0, v3, :cond_0

    .line 52
    const-string v0, "continuous crash happened too mush, so cleaning patch by force"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v1, v0}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 53
    invoke-virtual {p0, v4}, Lcom/taobao/sophix/a/c;->b(Z)V

    .line 54
    :cond_0
    sget-object v0, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    const-string v3, "hpatch_clear"

    invoke-static {v0, v3, v4}, Lcom/taobao/sophix/e/j;->a(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 55
    const-string v0, "force cleaning patch as server require clear"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v1, v0}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    const/4 v0, 0x1

    .line 56
    invoke-virtual {p0, v0}, Lcom/taobao/sophix/a/c;->b(Z)V

    .line 57
    :cond_1
    invoke-virtual {p0}, Lcom/taobao/sophix/a/c;->a()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 58
    new-instance v1, Lcom/taobao/sophix/c/c;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Lcom/taobao/sophix/c/c;-><init>(I)V

    .line 59
    sget v2, Lcom/taobao/sophix/b/b;->a:I

    iput v2, v1, Lcom/taobao/sophix/c/c;->d:I

    .line 60
    sput-object v0, Lcom/taobao/sophix/b/b;->c:Ljava/io/File;

    .line 61
    invoke-direct {p0, v0, p1, v1}, Lcom/taobao/sophix/a/c;->a(Ljava/io/File;Lcom/taobao/sophix/listener/PatchLoadStatusListener;Lcom/taobao/sophix/c/c;)V

    goto :goto_0

    .line 62
    :cond_2
    const-string p1, "no any patch exists"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v2, v1, p1}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 63
    :goto_0
    iget-boolean p1, p0, Lcom/taobao/sophix/a/c;->j:Z

    if-eqz p1, :cond_3

    .line 64
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    .line 65
    new-instance v0, Lcom/taobao/sophix/a/c$2;

    invoke-direct {v0, p0}, Lcom/taobao/sophix/a/c$2;-><init>(Lcom/taobao/sophix/a/c;)V

    const-wide/16 v1, 0xbb8

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_3
    return-void
.end method

.method private declared-synchronized a(Ljava/io/File;Lcom/taobao/sophix/listener/PatchLoadStatusListener;Lcom/taobao/sophix/c/c;)V
    .locals 23

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    monitor-enter p0

    .line 135
    :try_start_0
    const-string v4, "PatchManager"

    const-string v5, "loadPatch"

    const-string v6, "patchFile"

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v7

    filled-new-array {v6, v7}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4, v5, v6}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 136
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/4 v7, 0x0

    .line 137
    :try_start_1
    iget-boolean v8, v1, Lcom/taobao/sophix/a/c;->h:Z

    if-nez v8, :cond_1

    .line 138
    invoke-static {v0}, Lcom/taobao/sophix/e/i;->a(Ljava/io/File;)Z

    move-result v8

    if-eqz v8, :cond_0

    goto :goto_0

    .line 139
    :cond_0
    new-instance v0, Lcom/taobao/sophix/a/b;

    const-string v4, "patch signInfo not match to apk"

    const/16 v5, 0x4b

    invoke-direct {v0, v5, v4}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    goto/16 :goto_c

    :catch_0
    move-exception v0

    goto/16 :goto_e

    .line 140
    :cond_1
    const-string v8, "PatchManager"

    const-string v9, "loadPatch"

    const-string v10, "skip verifyPatchLegal in debug mode"

    filled-new-array {v10}, [Ljava/lang/Object;

    move-result-object v10

    invoke-static {v8, v9, v10}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
    :try_end_1
    .catch Lcom/taobao/sophix/a/b; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 141
    :goto_0
    :try_start_2
    new-instance v8, Ljava/util/zip/ZipFile;

    invoke-direct {v8, v0}, Ljava/util/zip/ZipFile;-><init>(Ljava/io/File;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Lcom/taobao/sophix/a/b; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 142
    :try_start_3
    invoke-direct/range {p0 .. p1}, Lcom/taobao/sophix/a/c;->a(Ljava/io/File;)Ljava/util/jar/Attributes;

    move-result-object v7

    .line 143
    const-string v9, "Modified-So"

    invoke-virtual {v7, v9}, Ljava/util/jar/Attributes;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 144
    const-string v10, "Has-Res"

    invoke-virtual {v7, v10}, Ljava/util/jar/Attributes;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    if-nez v10, :cond_3

    const-string v10, "resources.arsc"

    .line 145
    invoke-virtual {v8, v10}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v10

    if-nez v10, :cond_3

    const-string v10, "assets"

    .line 146
    invoke-virtual {v8, v10}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v10

    if-eqz v10, :cond_2

    goto :goto_1

    :cond_2
    const/4 v10, 0x0

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v7, v8

    goto/16 :goto_c

    :catch_1
    move-exception v0

    move-object v7, v8

    goto/16 :goto_e

    :cond_3
    :goto_1
    const/4 v10, 0x1

    .line 147
    :goto_2
    const-string v12, "classes.dex"

    invoke-virtual {v8, v12}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v12

    if-eqz v12, :cond_4

    const/4 v12, 0x1

    goto :goto_3

    :cond_4
    const/4 v12, 0x0

    :goto_3
    if-eqz v10, :cond_5

    or-int/lit8 v12, v12, 0x4

    .line 148
    :cond_5
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_6

    or-int/lit8 v12, v12, 0x2

    .line 149
    :cond_6
    iput v12, v3, Lcom/taobao/sophix/c/c;->f:I

    .line 150
    invoke-direct {v1, v7}, Lcom/taobao/sophix/a/c;->a(Ljava/util/jar/Attributes;)Z

    move-result v7

    if-eqz v7, :cond_7

    iget-boolean v7, v1, Lcom/taobao/sophix/a/c;->n:Z

    if-nez v7, :cond_7

    .line 151
    invoke-static {}, Lcom/taobao/sophix/b/a/b/b;->a()Z

    move-result v7

    if-eqz v7, :cond_7

    const/4 v7, 0x1

    goto :goto_4

    :cond_7
    const/4 v7, 0x0

    .line 152
    :goto_4
    iput v7, v3, Lcom/taobao/sophix/c/c;->h:I

    .line 153
    invoke-direct {v1}, Lcom/taobao/sophix/a/c;->j()V

    .line 154
    const-string v12, "classes.dex"

    invoke-virtual {v8, v12}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v12

    if-eqz v12, :cond_a

    .line 155
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 156
    const-string v14, "PatchManager"

    const-string v15, "loadPatch"

    const-string v16, "start patch dex file"

    filled-new-array/range {v16 .. v16}, [Ljava/lang/Object;

    move-result-object v11

    invoke-static {v14, v15, v11}, Lcom/taobao/sophix/e/e;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 157
    new-instance v11, Lcom/taobao/sophix/b/a;

    invoke-direct {v11}, Lcom/taobao/sophix/b/a;-><init>()V

    .line 158
    invoke-virtual {v11, v0, v7, v2, v3}, Lcom/taobao/sophix/b/a;->a(Ljava/io/File;ZLcom/taobao/sophix/listener/PatchLoadStatusListener;Lcom/taobao/sophix/c/c;)Z

    move-result v11

    if-eqz v11, :cond_8

    .line 159
    const-string v14, "PatchManager"

    const-string v15, "loadPatch"

    const-string v6, "finish patch dex file(ms)"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v17

    sub-long v17, v17, v12

    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    filled-new-array {v6, v12}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v14, v15, v6}, Lcom/taobao/sophix/e/e;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 160
    invoke-direct {v1}, Lcom/taobao/sophix/a/c;->l()V

    goto :goto_5

    .line 161
    :cond_8
    const-string v6, "PatchManager"

    const-string v12, "loadPatch"

    const-string v13, "wait preload dex file complete"

    filled-new-array {v13}, [Ljava/lang/Object;

    move-result-object v13

    invoke-static {v6, v12, v13}, Lcom/taobao/sophix/e/e;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 162
    sget-object v6, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    invoke-static {v6}, Lcom/taobao/sophix/e/g;->a(Landroid/app/Application;)Z

    move-result v6

    if-eqz v6, :cond_9

    .line 163
    invoke-direct {v1}, Lcom/taobao/sophix/a/c;->k()V

    :cond_9
    :goto_5
    const/4 v6, 0x0

    goto :goto_6

    .line 164
    :cond_a
    const-string v6, "PatchManager"

    const-string v11, "loadPatch"

    const-string v12, "no dex file found"

    filled-new-array {v12}, [Ljava/lang/Object;

    move-result-object v12

    invoke-static {v6, v11, v12}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    const/4 v6, 0x1

    const/4 v11, 0x0

    :goto_6
    if-nez v11, :cond_b

    if-eqz v6, :cond_c

    :cond_b
    if-eqz v10, :cond_c

    .line 165
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 166
    const-string v10, "PatchManager"

    const-string v14, "loadPatch"

    const-string v15, "start patch res file"

    filled-new-array {v15}, [Ljava/lang/Object;

    move-result-object v15

    invoke-static {v10, v14, v15}, Lcom/taobao/sophix/e/e;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 167
    new-instance v10, Lcom/taobao/sophix/b/d;

    invoke-direct {v10}, Lcom/taobao/sophix/b/d;-><init>()V

    .line 168
    invoke-virtual {v10, v0}, Lcom/taobao/sophix/b/d;->a(Ljava/io/File;)Z

    move-result v0

    .line 169
    const-string v10, "PatchManager"

    const-string v14, "loadPatch"

    const-string v15, "finish patch res file(ms)"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v17

    sub-long v17, v17, v12

    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    filled-new-array {v15, v12}, [Ljava/lang/Object;

    move-result-object v12

    invoke-static {v10, v14, v12}, Lcom/taobao/sophix/e/e;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    goto :goto_7

    :cond_c
    const/4 v0, 0x0

    :goto_7
    if-eqz v11, :cond_e

    .line 170
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_d

    .line 171
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 172
    const-string v10, "PatchManager"

    const-string v14, "loadPatch"

    const-string v15, "start patch lib file"

    filled-new-array {v15}, [Ljava/lang/Object;

    move-result-object v15

    invoke-static {v10, v14, v15}, Lcom/taobao/sophix/e/e;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 173
    new-instance v10, Lcom/taobao/sophix/b/c;

    invoke-direct {v10}, Lcom/taobao/sophix/b/c;-><init>()V

    .line 174
    iget-object v14, v1, Lcom/taobao/sophix/a/c;->c:Ljava/io/File;

    invoke-virtual {v10, v9, v14}, Lcom/taobao/sophix/b/c;->a(Ljava/lang/String;Ljava/io/File;)Z

    move-result v9

    .line 175
    const-string v10, "PatchManager"

    const-string v14, "loadPatch"

    const-string v15, "finish patch lib file(ms)"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v17

    sub-long v17, v17, v12

    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    filled-new-array {v15, v12}, [Ljava/lang/Object;

    move-result-object v12

    invoke-static {v10, v14, v12}, Lcom/taobao/sophix/e/e;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    goto :goto_8

    :cond_d
    const/4 v9, 0x0

    .line 176
    :goto_8
    invoke-static {}, Lcom/taobao/sophix/b/c;->a()V

    goto :goto_9

    :cond_e
    const/4 v9, 0x0

    :goto_9
    if-nez v11, :cond_10

    if-nez v0, :cond_10

    if-eqz v9, :cond_f

    goto :goto_a

    :cond_f
    if-eqz v6, :cond_12

    .line 177
    const-string v0, "PatchManager"

    const-string v4, "loadPatch fail"

    const-string v5, "invalid patch"

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v0, v4, v5}, Lcom/taobao/sophix/e/e;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 178
    const-string v0, "did not load anything"

    iget v4, v3, Lcom/taobao/sophix/c/c;->d:I

    const/16 v5, 0x14

    const/4 v6, 0x0

    invoke-interface {v2, v6, v5, v0, v4}, Lcom/taobao/sophix/listener/PatchLoadStatusListener;->onLoad(IILjava/lang/String;I)V

    goto :goto_b

    .line 179
    :cond_10
    :goto_a
    iget-object v6, v1, Lcom/taobao/sophix/a/c;->k:Lcom/taobao/sophix/a/d;

    if-nez v6, :cond_11

    .line 180
    new-instance v6, Lcom/taobao/sophix/a/d;

    invoke-direct {v6, v11, v0, v9, v7}, Lcom/taobao/sophix/a/d;-><init>(ZZZZ)V

    iput-object v6, v1, Lcom/taobao/sophix/a/c;->k:Lcom/taobao/sophix/a/d;

    .line 181
    :cond_11
    invoke-virtual {v3}, Lcom/taobao/sophix/c/c;->a()V

    .line 182
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sub-long/2addr v6, v4

    iput-wide v6, v3, Lcom/taobao/sophix/c/c;->e:J

    .line 183
    const-string v4, "200"

    iput-object v4, v3, Lcom/taobao/sophix/c/c;->c:Ljava/lang/String;

    .line 184
    invoke-static {v3}, Lcom/taobao/sophix/c/b;->a(Lcom/taobao/sophix/c/c;)V

    .line 185
    const-string v4, "PatchManager"

    const-string v5, "loadPatch success"

    const-string v17, "hasDexPatched"

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v18

    const-string v19, "hasResPatched"

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v20

    const-string v21, "hasSOPatched"

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v22

    filled-new-array/range {v17 .. v22}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v4, v5, v0}, Lcom/taobao/sophix/e/e;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 186
    const-string v0, "load success"

    iget v4, v3, Lcom/taobao/sophix/c/c;->d:I

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-interface {v2, v6, v5, v0, v4}, Lcom/taobao/sophix/listener/PatchLoadStatusListener;->onLoad(IILjava/lang/String;I)V
    :try_end_3
    .catch Lcom/taobao/sophix/a/b; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 187
    :cond_12
    :goto_b
    :try_start_4
    invoke-static {v8}, Lcom/taobao/sophix/e/c;->a(Ljava/util/zip/ZipFile;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_f

    :catchall_2
    move-exception v0

    goto :goto_11

    :catch_2
    move-exception v0

    .line 188
    :try_start_5
    new-instance v4, Lcom/taobao/sophix/a/b;

    const/16 v5, 0x4d

    invoke-direct {v4, v5, v0}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/Throwable;)V

    throw v4
    :try_end_5
    .catch Lcom/taobao/sophix/a/b; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 189
    :goto_c
    :try_start_6
    invoke-virtual {v3}, Lcom/taobao/sophix/c/c;->a()V

    .line 190
    const-string v4, "201"

    iput-object v4, v3, Lcom/taobao/sophix/c/c;->c:Ljava/lang/String;

    const/16 v4, 0x47

    .line 191
    iput v4, v3, Lcom/taobao/sophix/c/c;->i:I

    .line 192
    invoke-static {v3}, Lcom/taobao/sophix/c/b;->a(Lcom/taobao/sophix/c/c;)V

    .line 193
    const-string v5, "PatchManager"

    const-string v6, "loadPatch fail"

    const/4 v8, 0x0

    new-array v9, v8, [Ljava/lang/Object;

    invoke-static {v5, v6, v0, v9}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)I

    .line 194
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    iget v3, v3, Lcom/taobao/sophix/c/c;->d:I

    invoke-interface {v2, v8, v4, v0, v3}, Lcom/taobao/sophix/listener/PatchLoadStatusListener;->onLoad(IILjava/lang/String;I)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 195
    :goto_d
    :try_start_7
    invoke-static {v7}, Lcom/taobao/sophix/e/c;->a(Ljava/util/zip/ZipFile;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    goto :goto_f

    :catchall_3
    move-exception v0

    goto :goto_10

    .line 196
    :goto_e
    :try_start_8
    invoke-virtual {v3}, Lcom/taobao/sophix/c/c;->a()V

    .line 197
    const-string v4, "201"

    iput-object v4, v3, Lcom/taobao/sophix/c/c;->c:Ljava/lang/String;

    .line 198
    invoke-virtual {v0}, Lcom/taobao/sophix/a/b;->a()I

    move-result v4

    iput v4, v3, Lcom/taobao/sophix/c/c;->i:I

    .line 199
    invoke-static {v3}, Lcom/taobao/sophix/c/b;->a(Lcom/taobao/sophix/c/c;)V

    .line 200
    const-string v4, "PatchManager"

    const-string v5, "loadPatch fail"

    const-string v6, "code"

    invoke-virtual {v0}, Lcom/taobao/sophix/a/b;->a()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const-string v9, "msg"

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v10

    filled-new-array {v6, v8, v9, v10}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4, v5, v0, v6}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)I

    .line 201
    invoke-virtual {v0}, Lcom/taobao/sophix/a/b;->a()I

    move-result v4

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    iget v3, v3, Lcom/taobao/sophix/c/c;->d:I

    const/4 v6, 0x0

    invoke-interface {v2, v6, v4, v0, v3}, Lcom/taobao/sophix/listener/PatchLoadStatusListener;->onLoad(IILjava/lang/String;I)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    goto :goto_d

    .line 202
    :goto_f
    monitor-exit p0

    return-void

    .line 203
    :goto_10
    :try_start_9
    invoke-static {v7}, Lcom/taobao/sophix/e/c;->a(Ljava/util/zip/ZipFile;)V

    .line 204
    throw v0

    :goto_11
    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    throw v0
.end method

.method private a(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 3

    .line 234
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "abandon initialization: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method private a(I)Z
    .locals 1

    .line 46
    iget v0, p0, Lcom/taobao/sophix/a/c;->a:I

    and-int/2addr v0, p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private a(Ljava/util/jar/Attributes;)Z
    .locals 9

    .line 219
    const-string v0, "Support-Hot"

    invoke-virtual {p1, v0}, Ljava/util/jar/Attributes;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 220
    const-string v1, "System-Reference"

    invoke-virtual {p1, v1}, Ljava/util/jar/Attributes;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 221
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 222
    const-string v1, "systemReferences"

    filled-new-array {v1, p1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "PatchManager"

    const-string v3, "checkSupportHotfix"

    invoke-static {v2, v3, v1}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 223
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 224
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    const/4 v4, 0x0

    move v5, v4

    .line 225
    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v6

    if-ge v5, v6, :cond_1

    .line 226
    invoke-virtual {v1, v5}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 227
    :try_start_0
    invoke-virtual {p1, v6}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    .line 228
    invoke-virtual {v7}, Ljava/lang/Class;->getModifiers()I

    move-result v7

    and-int/lit8 v7, v7, 0x1

    if-nez v7, :cond_0

    .line 229
    const-string v7, "systemClzName"

    const-string v8, "not public"

    filled-new-array {v7, v6, v8}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v2, v3, v6}, Lcom/taobao/sophix/e/e;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return v4

    :catch_0
    move-exception v6

    .line 230
    new-array v7, v4, [Ljava/lang/Object;

    invoke-static {v2, v3, v6, v7}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)I

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method private g()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/taobao/sophix/a/c;->a:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    iput v0, p0, Lcom/taobao/sophix/a/c;->a:I

    .line 6
    .line 7
    sget-object v1, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    .line 8
    .line 9
    const-string v2, "SP_SOPHIX_DIR_STATE"

    .line 10
    .line 11
    invoke-static {v1, v2, v0}, Lcom/taobao/sophix/e/j;->b(Landroid/content/Context;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private h()Z
    .locals 5

    .line 1
    sget-object v0, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    .line 2
    .line 3
    const-string v1, "happ_version"

    .line 4
    .line 5
    const-string v2, "NO_FOUND_SOPHIX_APP_VERSION"

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lcom/taobao/sophix/e/j;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lcom/taobao/sophix/a/c;->f:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x1

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    iget-boolean v0, p0, Lcom/taobao/sophix/a/c;->j:Z

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    const-string v3, "checkAppUpdatedForContinue"

    .line 24
    .line 25
    const-string v4, "PatchManager"

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    const-string v0, "app is updated. clean old patch."

    .line 30
    .line 31
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v4, v3, v0}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v2}, Lcom/taobao/sophix/a/c;->b(Z)V

    .line 39
    .line 40
    .line 41
    return v1

    .line 42
    :cond_0
    const-string v0, "app is updated"

    .line 43
    .line 44
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v4, v3, v0}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 49
    .line 50
    .line 51
    return v2

    .line 52
    :cond_1
    return v1
.end method

.method private i()Z
    .locals 4

    .line 1
    sget-object v0, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    .line 2
    .line 3
    const-string v1, "sophix_system_fingerprint"

    .line 4
    .line 5
    const-string v2, "INVALID_SYSTEM_FINGERPRINT"

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lcom/taobao/sophix/e/j;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    sget-object v1, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    iget-boolean v0, p0, Lcom/taobao/sophix/a/c;->j:Z

    .line 27
    .line 28
    const-string v1, "checkSystemOTAHappenedForContinue"

    .line 29
    .line 30
    const-string v3, "PatchManager"

    .line 31
    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    const-string v0, "OTA happened, so clear odex files"

    .line 35
    .line 36
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v3, v1, v0}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/taobao/sophix/a/c;->a()Ljava/io/File;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    filled-new-array {v0}, [Ljava/io/File;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object v1, p0, Lcom/taobao/sophix/a/c;->b:Ljava/io/File;

    .line 52
    .line 53
    invoke-static {v1, v0}, Lcom/taobao/sophix/e/c;->a(Ljava/io/File;[Ljava/io/File;)V

    .line 54
    .line 55
    .line 56
    return v2

    .line 57
    :cond_0
    const-string v0, "OTA happened"

    .line 58
    .line 59
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v3, v1, v0}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 64
    .line 65
    .line 66
    const/4 v0, 0x0

    .line 67
    return v0

    .line 68
    :cond_1
    return v2
.end method

.method private j()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/taobao/sophix/a/c;->j:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "skip"

    .line 6
    .line 7
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "PatchManager"

    .line 12
    .line 13
    const-string v2, "prepareCrashHandler"

    .line 14
    .line 15
    invoke-static {v1, v2, v0}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    sget-object v0, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    const-string v2, "happ_crash_num"

    .line 23
    .line 24
    invoke-static {v0, v2, v1}, Lcom/taobao/sophix/e/j;->a(Landroid/content/Context;Ljava/lang/String;I)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/4 v1, 0x1

    .line 29
    add-int/2addr v0, v1

    .line 30
    sget-object v3, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    .line 31
    .line 32
    invoke-static {v3, v2, v0}, Lcom/taobao/sophix/e/j;->b(Landroid/content/Context;Ljava/lang/String;I)V

    .line 33
    .line 34
    .line 35
    invoke-static {v1}, Lcom/taobao/sophix/a/a;->a(Z)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method private k()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/taobao/sophix/a/a;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/taobao/sophix/a/a;->b()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-static {v0}, Lcom/taobao/sophix/a/a;->a(Z)V

    .line 15
    .line 16
    .line 17
    sget-object v0, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    .line 18
    .line 19
    const-string v1, "happ_crash_num"

    .line 20
    .line 21
    invoke-static {v0, v1}, Lcom/taobao/sophix/e/j;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v0, "clear crash flag"

    .line 25
    .line 26
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v1, "PatchManager"

    .line 31
    .line 32
    const-string v2, "clearCrashHandler"

    .line 33
    .line 34
    invoke-static {v1, v2, v0}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
.end method

.method private l()V
    .locals 3

    .line 1
    sget-object v0, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    .line 2
    .line 3
    const-string v1, "happ_ishotfix"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {v0, v1, v2}, Lcom/taobao/sophix/e/j;->a(Landroid/content/Context;Ljava/lang/String;Z)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const-string v0, "skip clear at hot"

    .line 13
    .line 14
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "PatchManager"

    .line 19
    .line 20
    const-string v2, "clearPreVerified"

    .line 21
    .line 22
    invoke-static {v1, v2, v0}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p0, v0}, Lcom/taobao/sophix/a/c;->a(Ljava/lang/Class;)V

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lcom/taobao/sophix/b/a/a/b;->a()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Ljava/lang/Class;

    .line 52
    .line 53
    invoke-virtual {p0, v1}, Lcom/taobao/sophix/a/c;->a(Ljava/lang/Class;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    return-void
.end method

.method private m()V
    .locals 4

    .line 1
    :try_start_0
    sget-object v0, Lcom/taobao/sophix/e/h;->a:Ljava/lang/Class;

    .line 2
    .line 3
    const-string v1, "mOuterContext"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    .line 10
    .line 11
    invoke-virtual {v2}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object v3, p0, Lcom/taobao/sophix/a/c;->i:Landroid/app/Application;

    .line 16
    .line 17
    invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    const-string v1, "mPackageInfo"

    .line 21
    .line 22
    invoke-static {v0, v1}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sget-object v1, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const-string v2, "mApplication"

    .line 41
    .line 42
    invoke-static {v1, v2}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iget-object v2, p0, Lcom/taobao/sophix/a/c;->i:Landroid/app/Application;

    .line 47
    .line 48
    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    const-string v2, "mActivityThread"

    .line 56
    .line 57
    invoke-static {v1, v2}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    const-string v2, "mInitialApplication"

    .line 70
    .line 71
    invoke-static {v1, v2}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    iget-object v2, p0, Lcom/taobao/sophix/a/c;->i:Landroid/app/Application;

    .line 76
    .line 77
    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    const-string v2, "mAllApplications"

    .line 85
    .line 86
    invoke-static {v1, v2}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Ljava/util/List;

    .line 95
    .line 96
    const/4 v1, 0x0

    .line 97
    move v2, v1

    .line 98
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-ge v2, v3, :cond_0

    .line 103
    .line 104
    iget-object v3, p0, Lcom/taobao/sophix/a/c;->i:Landroid/app/Application;

    .line 105
    .line 106
    invoke-interface {v0, v2, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    add-int/lit8 v2, v2, 0x1

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :catch_0
    move-exception v0

    .line 113
    goto :goto_1

    .line 114
    :cond_0
    const-string v0, "PatchManager"

    .line 115
    .line 116
    const-string v2, "replaceRealApplication finish"

    .line 117
    .line 118
    new-array v1, v1, [Ljava/lang/Object;

    .line 119
    .line 120
    invoke-static {v0, v2, v1}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :goto_1
    const-string v1, "replaceRealApplication fail"

    .line 125
    .line 126
    invoke-direct {p0, v1, v0}, Lcom/taobao/sophix/a/c;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 127
    .line 128
    .line 129
    return-void
.end method

.method private n()V
    .locals 7

    .line 1
    const-string v0, "callRealAppAttach"

    .line 2
    .line 3
    const-string v1, "$RealApplicationStub"

    .line 4
    .line 5
    :try_start_0
    sget-object v2, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 15
    :try_start_1
    sget-object v3, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    .line 16
    .line 17
    invoke-virtual {v3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    new-instance v4, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v3, v4}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 40
    goto :goto_0

    .line 41
    :catch_0
    :try_start_2
    sget-object v3, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    .line 42
    .line 43
    invoke-virtual {v3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    new-instance v4, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    const-string v5, "_modified_name"

    .line 53
    .line 54
    const-string v6, ""

    .line 55
    .line 56
    invoke-virtual {v2, v5, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v3, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    :goto_0
    const-class v2, Lcom/taobao/sophix/SophixEntry;

    .line 75
    .line 76
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    check-cast v1, Lcom/taobao/sophix/SophixEntry;

    .line 81
    .line 82
    invoke-interface {v1}, Lcom/taobao/sophix/SophixEntry;->value()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    check-cast v1, Landroid/app/Application;

    .line 91
    .line 92
    const-class v2, Landroid/app/Application;

    .line 93
    .line 94
    const-string v3, "attach"

    .line 95
    .line 96
    const-class v4, Landroid/content/Context;

    .line 97
    .line 98
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-static {v2, v3, v4}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    sget-object v3, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    .line 107
    .line 108
    invoke-virtual {v3}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    invoke-virtual {v2, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    iput-object v1, p0, Lcom/taobao/sophix/a/c;->i:Landroid/app/Application;

    .line 120
    .line 121
    const-string v2, "PatchManager"

    .line 122
    .line 123
    const-string v3, "finish call real App.attach, app"

    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    filled-new-array {v3, v1}, [Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-static {v2, v0, v1}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 138
    .line 139
    .line 140
    goto :goto_1

    .line 141
    :catch_1
    move-exception v1

    .line 142
    invoke-direct {p0, v0, v1}, Lcom/taobao/sophix/a/c;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 143
    .line 144
    .line 145
    :goto_1
    return-void
.end method

.method private o()V
    .locals 4

    .line 1
    :try_start_0
    sget-object v0, Lcom/taobao/sophix/e/h;->b:Ljava/lang/Class;

    .line 2
    .line 3
    const-string v1, "mBoundApplication"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "currentActivityThread"

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    new-array v3, v3, [Ljava/lang/Class;

    .line 13
    .line 14
    invoke-static {v0, v2, v3}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v0, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-string v2, "providers"

    .line 32
    .line 33
    invoke-static {v1, v2}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Ljava/util/List;

    .line 42
    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    iget-object v1, p0, Lcom/taobao/sophix/a/c;->o:Ljava/util/List;

    .line 46
    .line 47
    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 48
    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :catch_0
    move-exception v0

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    return-void

    .line 57
    :goto_0
    const-string v1, "removeProvidersTemporarily"

    .line 58
    .line 59
    invoke-direct {p0, v1, v0}, Lcom/taobao/sophix/a/c;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method private p()V
    .locals 6

    .line 1
    const-string v0, "currentActivityThread"

    .line 2
    .line 3
    :try_start_0
    sget-object v1, Lcom/taobao/sophix/e/h;->b:Ljava/lang/Class;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    new-array v3, v2, [Ljava/lang/Class;

    .line 7
    .line 8
    invoke-static {v1, v0, v3}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    const/4 v4, 0x0

    .line 13
    invoke-virtual {v3, v4, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    const-string v5, "mBoundApplication"

    .line 18
    .line 19
    invoke-static {v1, v5}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    new-array v2, v2, [Ljava/lang/Class;

    .line 24
    .line 25
    invoke-static {v1, v0, v2}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v4, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v5, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    const-string v4, "providers"

    .line 42
    .line 43
    invoke-static {v2, v4}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Ljava/util/List;

    .line 52
    .line 53
    if-eqz v0, :cond_0

    .line 54
    .line 55
    iget-object v2, p0, Lcom/taobao/sophix/a/c;->o:Ljava/util/List;

    .line 56
    .line 57
    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 58
    .line 59
    .line 60
    iget-object v2, p0, Lcom/taobao/sophix/a/c;->o:Ljava/util/List;

    .line 61
    .line 62
    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 63
    .line 64
    .line 65
    const-string v2, "installContentProviders"

    .line 66
    .line 67
    const-class v4, Landroid/content/Context;

    .line 68
    .line 69
    const-class v5, Ljava/util/List;

    .line 70
    .line 71
    filled-new-array {v4, v5}, [Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-static {v1, v2, v4}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    iget-object v2, p0, Lcom/taobao/sophix/a/c;->i:Landroid/app/Application;

    .line 80
    .line 81
    filled-new-array {v2, v0}, [Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v1, v3, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :catch_0
    move-exception v0

    .line 90
    goto :goto_0

    .line 91
    :cond_0
    return-void

    .line 92
    :goto_0
    const-string v1, "installProviders"

    .line 93
    .line 94
    invoke-direct {p0, v1, v0}, Lcom/taobao/sophix/a/c;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 95
    .line 96
    .line 97
    return-void
.end method


# virtual methods
.method public a()Ljava/io/File;
    .locals 2

    .line 47
    iget-object v0, p0, Lcom/taobao/sophix/a/c;->b:Ljava/io/File;

    new-instance v1, Lcom/taobao/sophix/a/c$1;

    invoke-direct {v1, p0}, Lcom/taobao/sophix/a/c$1;-><init>(Lcom/taobao/sophix/a/c;)V

    invoke-virtual {v0, v1}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 48
    array-length v1, v0

    if-lez v1, :cond_0

    const/4 v1, 0x0

    .line 49
    aget-object v0, v0, v1

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Lcom/taobao/sophix/c/a;)V
    .locals 0

    .line 235
    invoke-static {p1}, Lcom/taobao/sophix/c/b;->a(Lcom/taobao/sophix/c/a;)V

    return-void
.end method

.method public a(Ljava/lang/Class;)V
    .locals 0

    .line 233
    invoke-static {p1}, Lcom/taobao/sophix/b/a/a/b;->a(Ljava/lang/Class;)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 6

    .line 26
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 27
    sget-object p1, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    const/4 v1, 0x0

    const-string v2, "SP_SOPHIX_DIR_STATE"

    invoke-static {p1, v2, v1}, Lcom/taobao/sophix/e/j;->a(Landroid/content/Context;Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/taobao/sophix/a/c;->a:I

    .line 28
    sget-object p1, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    invoke-static {p1}, Lcom/taobao/sophix/e/g;->a(Landroid/app/Application;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x2

    .line 29
    invoke-direct {p0, v1}, Lcom/taobao/sophix/a/c;->a(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 30
    iget v1, p0, Lcom/taobao/sophix/a/c;->a:I

    not-int v1, v1

    and-int/lit8 v1, v1, 0x3

    iput v1, p0, Lcom/taobao/sophix/a/c;->a:I

    .line 31
    sget-object v3, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    invoke-static {v3, v2, v1}, Lcom/taobao/sophix/e/j;->b(Landroid/content/Context;Ljava/lang/String;I)V

    :cond_0
    const/4 v1, 0x1

    .line 32
    invoke-direct {p0, v1}, Lcom/taobao/sophix/a/c;->a(I)Z

    move-result v1

    const-string v2, "libs"

    const-string v3, "patch"

    const-string v4, "libs_"

    const-string v5, "patch_"

    if-eqz v1, :cond_1

    .line 33
    invoke-static {v0, v5}, Lcom/taobao/sophix/e/c;->a(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    iput-object v1, p0, Lcom/taobao/sophix/a/c;->b:Ljava/io/File;

    .line 34
    invoke-static {v0, v4}, Lcom/taobao/sophix/e/c;->a(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    iput-object v1, p0, Lcom/taobao/sophix/a/c;->c:Ljava/io/File;

    .line 35
    invoke-static {v0, v3}, Lcom/taobao/sophix/e/c;->a(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    iput-object v1, p0, Lcom/taobao/sophix/a/c;->d:Ljava/io/File;

    .line 36
    invoke-static {v0, v2}, Lcom/taobao/sophix/e/c;->a(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    iput-object v0, p0, Lcom/taobao/sophix/a/c;->e:Ljava/io/File;

    goto :goto_0

    .line 37
    :cond_1
    invoke-static {v0, v3}, Lcom/taobao/sophix/e/c;->a(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    iput-object v1, p0, Lcom/taobao/sophix/a/c;->b:Ljava/io/File;

    .line 38
    invoke-static {v0, v2}, Lcom/taobao/sophix/e/c;->a(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    iput-object v1, p0, Lcom/taobao/sophix/a/c;->c:Ljava/io/File;

    .line 39
    invoke-static {v0, v5}, Lcom/taobao/sophix/e/c;->a(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    iput-object v1, p0, Lcom/taobao/sophix/a/c;->d:Ljava/io/File;

    .line 40
    invoke-static {v0, v4}, Lcom/taobao/sophix/e/c;->a(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    iput-object v0, p0, Lcom/taobao/sophix/a/c;->e:Ljava/io/File;

    .line 41
    :goto_0
    iget-object v0, p0, Lcom/taobao/sophix/a/c;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/taobao/sophix/a/c;->c:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "patchDir"

    const-string v3, "nativeLibDir"

    filled-new-array {v2, v0, v3, v1}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "PatchManager"

    const-string v2, "initPatchDir"

    invoke-static {v1, v2, v0}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 42
    iget-object v0, p0, Lcom/taobao/sophix/a/c;->b:Ljava/io/File;

    sput-object v0, Lcom/taobao/sophix/b/b;->d:Ljava/io/File;

    .line 43
    iget-object v0, p0, Lcom/taobao/sophix/a/c;->c:Ljava/io/File;

    sput-object v0, Lcom/taobao/sophix/b/b;->e:Ljava/io/File;

    if-eqz p1, :cond_2

    .line 44
    iget-object p1, p0, Lcom/taobao/sophix/a/c;->d:Ljava/io/File;

    invoke-static {p1}, Lcom/taobao/sophix/e/c;->a(Ljava/io/File;)V

    .line 45
    iget-object p1, p0, Lcom/taobao/sophix/a/c;->e:Ljava/io/File;

    invoke-static {p1}, Lcom/taobao/sophix/e/c;->a(Ljava/io/File;)V

    :cond_2
    return-void
.end method

.method public a(Ljava/lang/String;I)V
    .locals 0

    .line 232
    invoke-static {p1, p2}, Lcom/taobao/sophix/e/k;->a(Ljava/lang/String;I)V

    return-void
.end method

.method public declared-synchronized a(Ljava/lang/String;Lcom/taobao/sophix/listener/PatchLoadStatusListener;)V
    .locals 4

    monitor-enter p0

    .line 2
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 3
    sget-object v0, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    if-eqz v0, :cond_6

    .line 4
    iget-object v0, p0, Lcom/taobao/sophix/a/c;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_5

    .line 5
    const-string v0, "PatchManager"

    const-string v1, "init"

    const-string v2, "appVersion"

    filled-new-array {v2, p1}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/taobao/sophix/e/e;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 6
    sget-object v0, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    instance-of v0, v0, Lcom/taobao/sophix/SophixApplication;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 7
    sput-boolean v1, Lcom/taobao/sophix/b/b;->f:Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 8
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1c

    if-lt v0, v3, :cond_1

    .line 9
    const-string p1, "PatchManager"

    const-string p2, "should use stable initialize when android version >= 9.0."

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p1, p2, v0}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    monitor-exit p0

    return-void

    .line 11
    :cond_1
    :goto_0
    :try_start_1
    iput-object p1, p0, Lcom/taobao/sophix/a/c;->f:Ljava/lang/String;

    .line 12
    sget-object p1, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    invoke-static {p1}, Lcom/taobao/sophix/e/g;->a(Landroid/app/Application;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/taobao/sophix/a/c;->j:Z

    .line 13
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    if-eq p1, v0, :cond_2

    .line 14
    const-string p1, "PatchManager"

    const-string v0, "init recommend to best call in main thread"

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {p1, v0, v3}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 15
    :cond_2
    invoke-direct {p0}, Lcom/taobao/sophix/a/c;->h()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-direct {p0}, Lcom/taobao/sophix/a/c;->i()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 16
    invoke-direct {p0, p2}, Lcom/taobao/sophix/a/c;->a(Lcom/taobao/sophix/listener/PatchLoadStatusListener;)V

    goto :goto_1

    .line 17
    :cond_3
    const-string p1, "PatchManager"

    const-string p2, "patch is not the newest, skip loading in sub-process"

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p1, p2, v0}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 18
    :goto_1
    sget-boolean p1, Lcom/taobao/sophix/b/b;->f:Z

    if-eqz p1, :cond_4

    .line 19
    invoke-direct {p0}, Lcom/taobao/sophix/a/c;->o()V

    .line 20
    invoke-direct {p0}, Lcom/taobao/sophix/a/c;->n()V

    .line 21
    :cond_4
    iget-object p1, p0, Lcom/taobao/sophix/a/c;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    :cond_5
    monitor-exit p0

    return-void

    .line 23
    :cond_6
    :try_start_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "app is null"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 24
    :cond_7
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "app version is null"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 25
    :goto_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public declared-synchronized a(Ljava/lang/String;Lcom/taobao/sophix/listener/PatchLoadStatusListener;Lcom/taobao/sophix/c/c;)V
    .locals 12

    monitor-enter p0

    .line 66
    :try_start_0
    const-string v0, "PatchManager"

    const-string v1, "addPatch"

    const-string v2, "src patch"

    filled-new-array {v2, p1}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 67
    iget-object v0, p0, Lcom/taobao/sophix/a/c;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 68
    const-string p1, "PatchManager"

    const-string p2, "addPatch"

    const-string p3, "did not init before!!"

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    invoke-static {p1, p2, p3}, Lcom/taobao/sophix/e/e;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto/16 :goto_10

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 70
    :try_start_1
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 71
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_10

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_10

    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result p1

    if-eqz p1, :cond_10

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v3, ".jar"

    invoke-virtual {p1, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_10

    .line 72
    invoke-static {}, Lcom/taobao/sophix/e/k;->a()Z

    move-result p1

    if-eqz p1, :cond_f

    .line 73
    invoke-virtual {p0}, Lcom/taobao/sophix/a/c;->a()Ljava/io/File;

    move-result-object p1

    const/4 v3, 0x1

    if-eqz p1, :cond_1

    move p1, v3

    goto :goto_0

    :cond_1
    move p1, v1

    :goto_0
    if-eqz p1, :cond_2

    .line 74
    iget-object v4, p0, Lcom/taobao/sophix/a/c;->d:Ljava/io/File;

    goto :goto_1

    :catchall_1
    move-exception p1

    move-object v6, v0

    goto/16 :goto_b

    :catch_0
    move-exception p1

    move-object v6, v0

    goto/16 :goto_d

    :cond_2
    iget-object v4, p0, Lcom/taobao/sophix/a/c;->b:Ljava/io/File;

    .line 75
    :goto_1
    invoke-static {v4}, Lcom/taobao/sophix/e/c;->a(Ljava/io/File;)V

    .line 76
    new-instance v5, Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v4, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_1
    .catch Lcom/taobao/sophix/a/b; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 77
    :try_start_2
    invoke-static {v2, v5}, Lcom/taobao/sophix/e/c;->a(Ljava/io/File;Ljava/io/File;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Lcom/taobao/sophix/a/b; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 78
    :try_start_3
    const-string v2, "PatchManager"

    const-string v4, "addPatch"

    const-string v6, "dest patch"

    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v7

    filled-new-array {v6, v7}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v2, v4, v6}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 79
    iget v2, p3, Lcom/taobao/sophix/c/c;->d:I

    invoke-static {v2}, Lcom/taobao/sophix/b/b;->a(I)V

    .line 80
    iget-object v2, p0, Lcom/taobao/sophix/a/c;->g:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 81
    const-string v2, "PatchManager"

    const-string v4, "addPatch"

    const-string v6, "aes key is set, do decrypt..."

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v2, v4, v6}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 82
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 83
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lcom/taobao/sophix/a/c;->g:Ljava/lang/String;

    invoke-static {v2, v4}, Lcom/taobao/sophix/e/a;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 84
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 85
    const-string v2, "PatchManager"

    const-string v4, "addPatch"

    const-string v8, "finish local aes decrypt patch(ms)"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    sub-long/2addr v9, v6

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    filled-new-array {v8, v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v2, v4, v6}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    goto :goto_4

    :catchall_2
    move-exception p1

    move-object v6, v0

    :goto_2
    move-object v0, v5

    goto/16 :goto_b

    :catch_1
    move-exception p1

    move-object v6, v0

    :goto_3
    move-object v0, v5

    goto/16 :goto_d

    .line 86
    :cond_3
    new-instance p1, Lcom/taobao/sophix/a/b;

    const-string v2, "aes decrypt fail"

    const/16 v3, 0x48

    invoke-direct {p1, v3, v2}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/String;)V

    throw p1

    .line 87
    :cond_4
    :goto_4
    invoke-direct {p0, v5}, Lcom/taobao/sophix/a/c;->a(Ljava/io/File;)Ljava/util/jar/Attributes;

    move-result-object v2

    .line 88
    const-string v4, "Modified-So"

    invoke-virtual {v2, v4}, Ljava/util/jar/Attributes;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 89
    new-instance v6, Ljava/util/zip/ZipFile;

    invoke-direct {v6, v5}, Ljava/util/zip/ZipFile;-><init>(Ljava/io/File;)V
    :try_end_3
    .catch Lcom/taobao/sophix/a/b; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 90
    :try_start_4
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 91
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 92
    const-string v0, "PatchManager"

    const-string v9, "addPatch"

    const-string v10, "start unzip lib file"

    filled-new-array {v10}, [Ljava/lang/Object;

    move-result-object v10

    invoke-static {v0, v9, v10}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    if-eqz p1, :cond_5

    .line 93
    iget-object v0, p0, Lcom/taobao/sophix/a/c;->e:Ljava/io/File;

    goto :goto_5

    :catchall_3
    move-exception p1

    goto :goto_2

    :catch_2
    move-exception p1

    goto :goto_3

    :cond_5
    iget-object v0, p0, Lcom/taobao/sophix/a/c;->c:Ljava/io/File;

    .line 94
    :goto_5
    new-instance v9, Lcom/taobao/sophix/b/c;

    invoke-direct {v9}, Lcom/taobao/sophix/b/c;-><init>()V

    .line 95
    invoke-virtual {v9, v4, v6, v0}, Lcom/taobao/sophix/b/c;->a(Ljava/lang/String;Ljava/util/zip/ZipFile;Ljava/io/File;)V

    .line 96
    const-string v0, "PatchManager"

    const-string v4, "addPatch"

    const-string v9, "finish unzip lib file(ms)"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    sub-long/2addr v10, v7

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    filled-new-array {v9, v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v0, v4, v7}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    move v0, v3

    goto :goto_6

    :cond_6
    move v0, v1

    :goto_6
    if-eqz p1, :cond_7

    .line 97
    invoke-direct {p0}, Lcom/taobao/sophix/a/c;->g()V

    .line 98
    :cond_7
    invoke-direct {p0, v2}, Lcom/taobao/sophix/a/c;->a(Ljava/util/jar/Attributes;)Z

    move-result v4

    if-eqz v4, :cond_8

    iget-boolean v4, p0, Lcom/taobao/sophix/a/c;->n:Z

    if-nez v4, :cond_8

    .line 99
    invoke-static {}, Lcom/taobao/sophix/b/a/b/b;->a()Z

    move-result v4

    if-eqz v4, :cond_8

    move v4, v3

    goto :goto_7

    :cond_8
    move v4, v1

    .line 100
    :goto_7
    iget-boolean v7, p0, Lcom/taobao/sophix/a/c;->m:Z

    const/16 v8, 0xc

    if-nez v7, :cond_9

    if-eqz p1, :cond_9

    if-eqz v4, :cond_9

    .line 101
    const-string p1, "PatchManager"

    const-string v0, "addPatch is hotfix patch, but app exist old patch, please relaunch app"

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v2}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 102
    const-string p1, "relaunch app"

    iget v0, p3, Lcom/taobao/sophix/c/c;->d:I

    invoke-interface {p2, v1, v8, p1, v0}, Lcom/taobao/sophix/listener/PatchLoadStatusListener;->onLoad(IILjava/lang/String;I)V
    :try_end_4
    .catch Lcom/taobao/sophix/a/b; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 103
    :try_start_5
    invoke-static {v6}, Lcom/taobao/sophix/e/c;->a(Ljava/util/zip/ZipFile;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 104
    monitor-exit p0

    return-void

    .line 105
    :cond_9
    :try_start_6
    const-string v4, "classes.dex"

    invoke-virtual {v6, v4}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v4

    if-eqz v4, :cond_a

    move v4, v3

    goto :goto_8

    :cond_a
    move v4, v1

    .line 106
    :goto_8
    const-string v7, "Has-Res"

    invoke-virtual {v2, v7}, Ljava/util/jar/Attributes;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_c

    const-string v2, "resources.arsc"

    .line 107
    invoke-virtual {v6, v2}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v2

    if-nez v2, :cond_c

    const-string v2, "assets"

    .line 108
    invoke-virtual {v6, v2}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v2

    if-eqz v2, :cond_b

    goto :goto_9

    :cond_b
    move v3, v1

    :cond_c
    :goto_9
    if-nez v4, :cond_e

    if-nez v0, :cond_d

    if-eqz v3, :cond_e

    if-eqz p1, :cond_e

    .line 109
    :cond_d
    const-string p1, "PatchManager"

    const-string v0, "addPatch only need to patch so lib, please relaunch app"

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v2}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 110
    const-string p1, "relaunch app"

    iget v0, p3, Lcom/taobao/sophix/c/c;->d:I

    invoke-interface {p2, v1, v8, p1, v0}, Lcom/taobao/sophix/listener/PatchLoadStatusListener;->onLoad(IILjava/lang/String;I)V
    :try_end_6
    .catch Lcom/taobao/sophix/a/b; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 111
    :try_start_7
    invoke-static {v6}, Lcom/taobao/sophix/e/c;->a(Ljava/util/zip/ZipFile;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 112
    monitor-exit p0

    return-void

    .line 113
    :cond_e
    :try_start_8
    invoke-direct {p0, v5, p2, p3}, Lcom/taobao/sophix/a/c;->a(Ljava/io/File;Lcom/taobao/sophix/listener/PatchLoadStatusListener;Lcom/taobao/sophix/c/c;)V
    :try_end_8
    .catch Lcom/taobao/sophix/a/b; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 114
    :goto_a
    :try_start_9
    invoke-static {v6}, Lcom/taobao/sophix/e/c;->a(Ljava/util/zip/ZipFile;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    goto/16 :goto_e

    :catch_3
    move-exception p1

    .line 115
    :try_start_a
    new-instance v2, Lcom/taobao/sophix/a/b;

    const/16 v3, 0x4a

    invoke-direct {v2, v3, p1}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/Throwable;)V

    throw v2
    :try_end_a
    .catch Lcom/taobao/sophix/a/b; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 116
    :cond_f
    :try_start_b
    new-instance p1, Lcom/taobao/sophix/a/b;

    const-string v2, "device is not support"

    const/4 v3, 0x4

    invoke-direct {p1, v3, v2}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/String;)V

    throw p1

    .line 117
    :cond_10
    new-instance p1, Lcom/taobao/sophix/a/b;

    const-string v2, "patch is illegal"

    const/16 v3, 0x14

    invoke-direct {p1, v3, v2}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/String;)V

    throw p1
    :try_end_b
    .catch Lcom/taobao/sophix/a/b; {:try_start_b .. :try_end_b} :catch_0
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    :goto_b
    if-eqz v0, :cond_11

    .line 118
    :try_start_c
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    goto :goto_c

    :catchall_4
    move-exception p1

    goto :goto_f

    .line 119
    :cond_11
    :goto_c
    invoke-virtual {p3}, Lcom/taobao/sophix/c/c;->a()V

    .line 120
    const-string v0, "201"

    iput-object v0, p3, Lcom/taobao/sophix/c/c;->c:Ljava/lang/String;

    const/16 v0, 0x47

    .line 121
    iput v0, p3, Lcom/taobao/sophix/c/c;->i:I

    .line 122
    invoke-static {p3}, Lcom/taobao/sophix/c/b;->a(Lcom/taobao/sophix/c/c;)V

    .line 123
    const-string v2, "PatchManager"

    const-string v3, "addPatch fail"

    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {v2, v3, p1, v4}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)I

    .line 124
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    iget p3, p3, Lcom/taobao/sophix/c/c;->d:I

    invoke-interface {p2, v1, v0, p1, p3}, Lcom/taobao/sophix/listener/PatchLoadStatusListener;->onLoad(IILjava/lang/String;I)V

    goto :goto_a

    :goto_d
    if-eqz v0, :cond_12

    .line 125
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 126
    :cond_12
    invoke-virtual {p3}, Lcom/taobao/sophix/c/c;->a()V

    .line 127
    const-string v0, "201"

    iput-object v0, p3, Lcom/taobao/sophix/c/c;->c:Ljava/lang/String;

    .line 128
    invoke-virtual {p1}, Lcom/taobao/sophix/a/b;->a()I

    move-result v0

    iput v0, p3, Lcom/taobao/sophix/c/c;->i:I

    .line 129
    invoke-static {p3}, Lcom/taobao/sophix/c/b;->a(Lcom/taobao/sophix/c/c;)V

    .line 130
    const-string v0, "PatchManager"

    const-string v2, "addPatch fail"

    const-string v3, "code"

    invoke-virtual {p1}, Lcom/taobao/sophix/a/b;->a()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "msg"

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v7

    filled-new-array {v3, v4, v5, v7}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0, v2, p1, v3}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)I

    .line 131
    invoke-virtual {p1}, Lcom/taobao/sophix/a/b;->a()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    iget p3, p3, Lcom/taobao/sophix/c/c;->d:I

    invoke-interface {p2, v1, v0, p1, p3}, Lcom/taobao/sophix/listener/PatchLoadStatusListener;->onLoad(IILjava/lang/String;I)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    goto/16 :goto_a

    .line 132
    :goto_e
    monitor-exit p0

    return-void

    .line 133
    :goto_f
    :try_start_d
    invoke-static {v6}, Lcom/taobao/sophix/e/c;->a(Ljava/util/zip/ZipFile;)V

    .line 134
    throw p1

    :goto_10
    monitor-exit p0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    throw p1
.end method

.method public a(Z)V
    .locals 0

    .line 231
    iput-boolean p1, p0, Lcom/taobao/sophix/a/c;->h:Z

    return-void
.end method

.method public b()V
    .locals 3

    .line 1
    sget-boolean v0, Lcom/taobao/sophix/b/b;->f:Z

    const/4 v1, 0x0

    const-string v2, "PatchManager"

    if-nez v0, :cond_0

    .line 2
    const-string v0, "do not call real App.onCreate"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v2, v0, v1}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/taobao/sophix/a/c;->i:Landroid/app/Application;

    if-eqz v0, :cond_1

    .line 4
    invoke-direct {p0}, Lcom/taobao/sophix/a/c;->m()V

    .line 5
    invoke-direct {p0}, Lcom/taobao/sophix/a/c;->p()V

    .line 6
    iget-object v0, p0, Lcom/taobao/sophix/a/c;->i:Landroid/app/Application;

    invoke-virtual {v0}, Landroid/app/Application;->onCreate()V

    return-void

    .line 7
    :cond_1
    const-string v0, "real application is null, fail to call onCreate"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v2, v0, v1}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method public b(Ljava/lang/Class;)V
    .locals 0

    .line 26
    invoke-static {p1}, Lcom/taobao/sophix/b/a/a/b;->b(Ljava/lang/Class;)V

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 8
    iput-object p1, p0, Lcom/taobao/sophix/a/c;->g:Ljava/lang/String;

    return-void
.end method

.method public declared-synchronized b(Z)V
    .locals 4

    monitor-enter p0

    .line 9
    :try_start_0
    const-string v0, "PatchManager"

    const-string v1, "cleanPatches"

    const-string v2, "positive"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 10
    invoke-virtual {p0}, Lcom/taobao/sophix/a/c;->a()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 11
    new-instance v0, Lcom/taobao/sophix/c/c;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lcom/taobao/sophix/c/c;-><init>(I)V

    .line 12
    sget v1, Lcom/taobao/sophix/b/b;->a:I

    iput v1, v0, Lcom/taobao/sophix/c/c;->d:I

    if-eqz p1, :cond_0

    .line 13
    const-string p1, "300"

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    const-string p1, "301"

    :goto_0
    iput-object p1, v0, Lcom/taobao/sophix/c/c;->c:Ljava/lang/String;

    .line 14
    invoke-static {v0}, Lcom/taobao/sophix/c/b;->a(Lcom/taobao/sophix/c/c;)V

    .line 15
    :cond_1
    iget-object p1, p0, Lcom/taobao/sophix/a/c;->b:Ljava/io/File;

    invoke-static {p1}, Lcom/taobao/sophix/e/c;->a(Ljava/io/File;)V

    .line 16
    iget-object p1, p0, Lcom/taobao/sophix/a/c;->c:Ljava/io/File;

    invoke-static {p1}, Lcom/taobao/sophix/e/c;->a(Ljava/io/File;)V

    .line 17
    sget-object p1, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    const-string v0, "happ_ishotfix"

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lcom/taobao/sophix/e/j;->a(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result p1

    .line 18
    sget-object v0, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    const-string v1, "SP_SOPHIX_DEVICE_ID"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/taobao/sophix/e/j;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 19
    sget-object v1, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    invoke-static {v1}, Lcom/taobao/sophix/e/j;->a(Landroid/content/Context;)V

    .line 20
    sget v1, Lcom/taobao/sophix/b/b;->a:I

    invoke-static {v1}, Lcom/taobao/sophix/b/b;->a(I)V

    .line 21
    sget-object v1, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    const-string v2, "happ_version"

    iget-object v3, p0, Lcom/taobao/sophix/a/c;->f:Ljava/lang/String;

    invoke-static {v1, v2, v3}, Lcom/taobao/sophix/e/j;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    sget-object v1, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    const-string v2, "SP_SOPHIX_DEVICE_ID"

    invoke-static {v1, v2, v0}, Lcom/taobao/sophix/e/j;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    sget-object v0, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    const-string v1, "happ_ishotfix"

    invoke-static {v0, v1, p1}, Lcom/taobao/sophix/e/j;->b(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 24
    const-string p1, "PatchManager"

    const-string v0, "cleanPatches"

    const-string v1, "finish clean"

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public c(Z)V
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/taobao/sophix/a/c;->m:Z

    return-void
.end method

.method public c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/taobao/sophix/a/c;->h:Z

    return v0
.end method

.method public d()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/taobao/sophix/a/c;->k:Lcom/taobao/sophix/a/d;

    return-object v0
.end method

.method public d(Z)V
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/taobao/sophix/a/c;->n:Z

    return-void
.end method

.method public e()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "PatchManager"

    .line 5
    .line 6
    const-string v2, "killProcessSafely"

    .line 7
    .line 8
    invoke-static {v1, v2, v0}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 9
    .line 10
    .line 11
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public f()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/taobao/sophix/e/b;->a()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
