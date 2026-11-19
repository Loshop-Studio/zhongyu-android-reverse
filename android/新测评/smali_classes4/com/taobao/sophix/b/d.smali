.class public Lcom/taobao/sophix/b/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/Class;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    const-string v0, "android.content.res.AssetManager"

    .line 5
    .line 6
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lcom/taobao/sophix/b/d;->a:Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    return-void

    .line 13
    :catch_0
    move-exception v0

    .line 14
    new-instance v1, Lcom/taobao/sophix/a/b;

    .line 15
    .line 16
    const/16 v2, 0x52

    .line 17
    .line 18
    invoke-direct {v1, v2, v0}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    throw v1
.end method

.method private varargs a(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/reflect/Method;"
        }
    .end annotation

    .line 50
    :try_start_0
    iget-object v0, p0, Lcom/taobao/sophix/b/d;->a:Ljava/lang/Class;

    invoke-static {v0, p1, p2}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 51
    new-instance p2, Lcom/taobao/sophix/a/b;

    const/16 v0, 0x54

    invoke-direct {p2, v0, p1}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/Throwable;)V

    throw p2
.end method

.method private a()V
    .locals 5

    .line 24
    const-string v0, "android.app.ResourcesManager"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    .line 25
    new-array v2, v1, [Ljava/lang/Class;

    const-string v3, "getInstance"

    invoke-static {v0, v3, v2}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 26
    :try_start_0
    const-string v3, "mActiveResources"

    .line 27
    invoke-static {v0, v3}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/util/ArrayMap;

    .line 28
    invoke-virtual {v3}, Landroid/util/ArrayMap;->values()Ljava/util/Collection;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 29
    :catch_0
    const-string v3, "mResourceReferences"

    invoke-static {v0, v3}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    .line 30
    :goto_0
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 31
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/res/Resources;

    if-eqz v2, :cond_0

    .line 32
    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v3

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    .line 33
    const-string v2, "update successfully"

    new-array v3, v1, [Ljava/lang/Object;

    const-string v4, "ResourceManager"

    invoke-static {v4, v2, v3}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    goto :goto_1

    :cond_1
    return-void
.end method

.method private a(Landroid/content/res/AssetManager;Ljava/lang/reflect/Method;Ljava/lang/String;)V
    .locals 11

    .line 34
    const-string v0, "init"

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Class;

    const-string v3, "destroy"

    invoke-direct {p0, v3, v2}, Lcom/taobao/sophix/b/d;->a(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    .line 35
    const-string v3, "getStringBlockCount"

    new-array v4, v1, [Ljava/lang/Class;

    invoke-direct {p0, v3, v4}, Lcom/taobao/sophix/b/d;->a(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    .line 36
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v4}, [Ljava/lang/Class;

    move-result-object v4

    const-string v5, "getCookieName"

    invoke-direct {p0, v5, v4}, Lcom/taobao/sophix/b/d;->a(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    .line 37
    const-string v5, "mStringBlocks"

    invoke-direct {p0, v5}, Lcom/taobao/sophix/b/d;->b(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v5

    .line 38
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    const/4 v7, 0x0

    .line 39
    invoke-virtual {v3, p1, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    move v8, v1

    :cond_0
    :goto_0
    if-ge v8, v3, :cond_1

    add-int/lit8 v8, v8, 0x1

    .line 40
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    filled-new-array {v9}, [Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v4, p1, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    .line 41
    invoke-virtual {v9, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_0

    .line 42
    invoke-interface {v6, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {v2, p1, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    invoke-virtual {v5, p1, v7}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    :try_start_0
    new-array p3, v1, [Ljava/lang/Class;

    invoke-direct {p0, v0, p3}, Lcom/taobao/sophix/b/d;->a(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p3

    invoke-virtual {p3, p1, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 46
    :catch_0
    sget-object p3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {p3}, [Ljava/lang/Class;

    move-result-object p3

    invoke-direct {p0, v0, p3}, Lcom/taobao/sophix/b/d;->a(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p3

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p3, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    :goto_1
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result p3

    move v0, v1

    :goto_2
    if-ge v0, p3, :cond_2

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v0, v0, 0x1

    check-cast v2, Ljava/lang/String;

    .line 48
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "add asset "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v4, v1, [Ljava/lang/Object;

    const-string v5, "ResourceManager"

    invoke-static {v5, v3, v4}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 49
    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p2, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_2
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x18
    .end annotation

    .line 15
    sget-object v0, Lcom/taobao/sophix/e/h;->a:Ljava/lang/Class;

    const-string v1, "mPackageInfo"

    invoke-static {v0, v1}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    sget-object v1, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    .line 16
    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-string v2, "mSplitResDirs"

    invoke-static {v1, v2}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    .line 18
    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/String;

    .line 19
    invoke-direct {p0, v2, p1}, Lcom/taobao/sophix/b/d;->a([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method private a([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 20
    array-length v1, p1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    add-int/lit8 v2, v1, 0x1

    .line 21
    new-array v2, v2, [Ljava/lang/String;

    if-eqz p1, :cond_1

    .line 22
    array-length v3, p1

    invoke-static {p1, v0, v2, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 23
    :cond_1
    aput-object p2, v2, v1

    return-object v2
.end method

.method private b(Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/taobao/sophix/b/d;->a:Ljava/lang/Class;

    invoke-static {v0, p1}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 2
    new-instance v0, Lcom/taobao/sophix/a/b;

    const/16 v1, 0x55

    invoke-direct {v0, v1, p1}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/Throwable;)V

    throw v0
.end method

.method private b(Ljava/io/File;)Z
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 3
    const-string v0, "start patch res file"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "ResourceManager"

    const-string v2, "patchV30"

    invoke-static {v1, v2, v0}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    const/high16 v0, 0x10000000

    const/4 v3, 0x0

    .line 4
    :try_start_0
    invoke-static {p1, v0}, Landroid/os/ParcelFileDescriptor;->open(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;

    move-result-object p1

    invoke-static {p1}, Lm2/a;->a(Landroid/os/ParcelFileDescriptor;)Landroid/content/res/loader/ResourcesProvider;

    move-result-object p1

    .line 5
    invoke-static {}, Lcom/google/android/material/color/h;->a()V

    invoke-static {}, Lcom/google/android/material/color/g;->a()Landroid/content/res/loader/ResourcesLoader;

    move-result-object v0

    .line 6
    invoke-static {v0, p1}, Lcom/google/android/material/color/f;->a(Landroid/content/res/loader/ResourcesLoader;Landroid/content/res/loader/ResourcesProvider;)V

    .line 7
    sget-object p1, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const/4 v4, 0x1

    new-array v5, v4, [Landroid/content/res/loader/ResourcesLoader;

    aput-object v0, v5, v3

    invoke-static {p1, v5}, Lcom/google/android/material/color/i;->a(Landroid/content/res/Resources;[Landroid/content/res/loader/ResourcesLoader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    const-string p1, "patch res file success"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v1, v2, p1}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    return v4

    .line 9
    :catchall_0
    const-string p1, "patch res file error"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v1, v2, p1}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    return v3
.end method


# virtual methods
.method public a(Ljava/io/File;)Z
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    const/4 v2, 0x1

    if-lt v0, v1, :cond_0

    .line 2
    invoke-direct {p0, p1}, Lcom/taobao/sophix/b/d;->b(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v2

    .line 3
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    .line 4
    :try_start_0
    invoke-direct {p0, p1}, Lcom/taobao/sophix/b/d;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 5
    sget-object v0, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    .line 6
    monitor-enter v0

    .line 7
    :try_start_1
    const-string v1, "addAssetPath"

    const-class v3, Ljava/lang/String;

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v3

    invoke-direct {p0, v1, v3}, Lcom/taobao/sophix/b/d;->a(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    :try_start_2
    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 9
    :try_start_3
    invoke-direct {p0}, Lcom/taobao/sophix/b/d;->a()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 10
    :try_start_4
    monitor-exit v0

    return v2

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 11
    new-instance v1, Lcom/taobao/sophix/a/b;

    const/16 v2, 0x7a

    invoke-direct {v1, v2, p1}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception p1

    .line 12
    new-instance v1, Lcom/taobao/sophix/a/b;

    const/16 v2, 0x7b

    invoke-direct {v1, v2, p1}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/Throwable;)V

    throw v1

    .line 13
    :goto_0
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1

    :catch_2
    move-exception p1

    .line 14
    new-instance v0, Lcom/taobao/sophix/a/b;

    const/16 v1, 0x79

    invoke-direct {v0, v1, p1}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/Throwable;)V

    throw v0
.end method
