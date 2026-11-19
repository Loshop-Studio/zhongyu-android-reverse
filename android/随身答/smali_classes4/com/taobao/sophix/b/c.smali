.class public Lcom/taobao/sophix/b/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:[Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    const-string v0, "init"

    .line 2
    .line 3
    const-string v1, "NativeLibManager"

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    sget-object v2, Lcom/taobao/sophix/b/c;->a:[Ljava/lang/String;

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const/4 v2, 0x0

    .line 14
    :try_start_0
    sget-object v3, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    .line 15
    .line 16
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    sget-object v4, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    .line 23
    .line 24
    invoke-virtual {v4}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {v3, v4, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    const-class v4, Landroid/content/pm/ApplicationInfo;

    .line 39
    .line 40
    const-string v5, "primaryCpuAbi"

    .line 41
    .line 42
    invoke-static {v4, v5}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-virtual {v4, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Ljava/lang/String;

    .line 51
    .line 52
    filled-new-array {v3}, [Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    sput-object v3, Lcom/taobao/sophix/b/c;->a:[Ljava/lang/String;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catchall_0
    move-exception v3

    .line 60
    goto :goto_1

    .line 61
    :cond_1
    :goto_0
    const-string v3, "primaryCpuAbis"

    .line 62
    .line 63
    sget-object v4, Lcom/taobao/sophix/b/c;->a:[Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {v4}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-static {v1, v0, v3}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :goto_1
    new-array v2, v2, [Ljava/lang/Object;

    .line 78
    .line 79
    invoke-static {v1, v0, v3, v2}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)I

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method private a(Ljava/io/File;)Ljava/lang/Object;
    .locals 4

    .line 96
    const-string v0, "dalvik.system.DexPathList$Element"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const-class v2, Ldalvik/system/DexFile;

    const-class v3, Ljava/io/File;

    filled-new-array {v3, v1, v3, v2}, [Ljava/lang/Class;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 97
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v2, 0x0

    filled-new-array {p1, v1, v2, v2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 98
    :cond_0
    new-instance p1, Ljava/lang/Exception;

    const-string v0, "make nativeElement fail no such constructor"

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 3

    .line 99
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_0

    .line 100
    :try_start_0
    invoke-static {v0, p2}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 101
    :catch_0
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    goto :goto_0

    .line 102
    :cond_0
    new-instance v0, Ljava/lang/Exception;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Field "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " not found in "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static a(Ljava/lang/String;)Ljava/util/Map;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 27
    sget-object v0, Lcom/taobao/sophix/b/c;->a:[Ljava/lang/String;

    const-string v1, "getLibPatchMap"

    const-string v2, "NativeLibManager"

    if-eqz v0, :cond_4

    array-length v0, v0

    if-eqz v0, :cond_4

    .line 28
    :try_start_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 29
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 30
    invoke-virtual {v3}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object p0

    .line 31
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    .line 32
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 33
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    .line 34
    sget-object v6, Lcom/taobao/sophix/b/c;->a:[Ljava/lang/String;

    array-length v7, v6

    const/4 v8, 0x0

    move v9, v8

    :goto_1
    if-ge v9, v7, :cond_0

    aget-object v10, v6, v9

    move v11, v8

    .line 35
    :goto_2
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v12

    if-ge v11, v12, :cond_2

    .line 36
    invoke-virtual {v5, v11}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v12

    .line 37
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_1

    .line 38
    invoke-interface {v0, v4, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 39
    :cond_3
    const-string p0, "libPatchMap"

    filled-new-array {p0, v0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v2, v1, p0}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    .line 40
    new-instance v0, Lcom/taobao/sophix/a/b;

    const/16 v1, 0x85

    invoke-direct {v0, v1, p0}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/Throwable;)V

    throw v0

    .line 41
    :cond_4
    const-string p0, "primaryCpuAbis is null"

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v1, v0}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 42
    new-instance v0, Lcom/taobao/sophix/a/b;

    const/16 v1, 0x84

    invoke-direct {v0, v1, p0}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/String;)V

    throw v0
.end method

.method public static a()V
    .locals 15
    .annotation build Landroid/annotation/TargetApi;
        value = 0x12
    .end annotation

    .line 72
    const-class v0, Ljava/lang/String;

    const/16 v1, 0xe

    .line 73
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 74
    :try_start_0
    const-class v1, Lcom/taobao/sophix/b/c;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    .line 75
    sget-object v2, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    .line 76
    instance-of v4, v1, Ldalvik/system/BaseDexClassLoader;

    const/4 v5, 0x0

    if-eqz v4, :cond_3

    .line 77
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v6, "com.taobao.sophix"

    invoke-virtual {v4, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 78
    const-class v4, Ldalvik/system/BaseDexClassLoader;

    const-string v6, "getLdLibraryPath"

    new-array v5, v5, [Ljava/lang/Class;

    invoke-static {v4, v6, v5}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    const/4 v8, 0x0

    invoke-virtual {v4, v1, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    .line 79
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v5, 0x1f

    if-lt v1, v5, :cond_0

    return-void

    :cond_0
    const/16 v5, 0x1d

    .line 80
    const-string v6, "com.android.internal.os.ClassLoaderFactory"

    const-string v7, "createClassloaderNamespace"

    if-lt v1, v5, :cond_1

    .line 81
    :try_start_1
    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-class v9, Ljava/lang/ClassLoader;

    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v11, Ljava/lang/String;

    const-class v12, Ljava/lang/String;

    sget-object v13, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const-class v14, Ljava/lang/String;

    filled-new-array/range {v9 .. v14}, [Ljava/lang/Class;

    move-result-object v1

    invoke-static {v0, v7, v1}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 82
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v7, 0x0

    const/4 v5, 0x0

    filled-new-array/range {v2 .. v7}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v8, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_1
    const/16 v5, 0x1b

    if-lt v1, v5, :cond_2

    .line 83
    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-class v9, Ljava/lang/ClassLoader;

    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v11, Ljava/lang/String;

    const-class v12, Ljava/lang/String;

    sget-object v13, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    move-object v14, v13

    filled-new-array/range {v9 .. v14}, [Ljava/lang/Class;

    move-result-object v1

    invoke-static {v0, v7, v1}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 84
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v5, 0x0

    move-object v7, v6

    filled-new-array/range {v2 .. v7}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v8, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 85
    :cond_2
    const-string v1, "com.android.internal.os.PathClassLoaderFactory"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-class v5, Ljava/lang/ClassLoader;

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    sget-object v9, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {v5, v6, v0, v0, v9}, [Ljava/lang/Class;

    move-result-object v0

    invoke-static {v1, v7, v0}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 86
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    filled-new-array {v2, v3, v4, v8, v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v8, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 87
    :cond_3
    const-string v0, "NativeLibManager"

    const-string v1, "no need to process ld path"

    new-array v2, v5, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 88
    new-instance v1, Lcom/taobao/sophix/a/b;

    const/16 v2, 0x89

    invoke-direct {v1, v2, v0}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/Throwable;)V

    throw v1
.end method

.method private a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 4

    .line 89
    invoke-direct {p0, p1, p2}, Lcom/taobao/sophix/b/c;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p2

    .line 90
    invoke-virtual {p2, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    .line 91
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v1

    array-length v2, v0

    const/4 v3, 0x1

    add-int/2addr v2, v3

    .line 92
    invoke-static {v1, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    .line 93
    aput-object p3, v1, v2

    .line 94
    array-length p3, v0

    invoke-static {v0, v2, v1, v3, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 95
    invoke-virtual {p2, p1, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method private static a(Ljava/lang/String;Ljava/io/File;Ljava/util/Map;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/io/File;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .line 43
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_2

    .line 44
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 45
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/System;->mapLibraryName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 46
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 47
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_1

    return v1

    .line 48
    :cond_1
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_2
    return v1
.end method

.method private b(Ljava/io/File;)Ljava/lang/Object;
    .locals 2

    .line 4
    const-string v0, "dalvik.system.DexPathList$NativeLibraryElement"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljava/io/File;

    filled-new-array {v1}, [Ljava/lang/Class;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 6
    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 7
    :cond_0
    new-instance p1, Ljava/lang/Exception;

    const-string v0, "make nativeElement fail no such constructor"

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/taobao/sophix/b/c;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p2

    .line 2
    invoke-virtual {p2, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    const/4 p2, 0x0

    .line 3
    invoke-interface {p1, p2, p3}, Ljava/util/List;->add(ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/util/zip/ZipFile;Ljava/io/File;)V
    .locals 18

    move-object/from16 v1, p3

    .line 1
    const-string v0, "libPath"

    const-string v2, "libDir"

    move-object/from16 v3, p1

    filled-new-array {v0, v3, v2, v1}, [Ljava/lang/Object;

    move-result-object v0

    const-string v2, "NativeLibManager"

    const-string v4, "unZipLibFile"

    invoke-static {v2, v4, v0}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 2
    :try_start_0
    invoke-static {v3}, Lcom/taobao/sophix/b/c;->a(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    .line 3
    invoke-virtual/range {p2 .. p2}, Ljava/util/zip/ZipFile;->entries()Ljava/util/Enumeration;

    move-result-object v5

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 4
    invoke-interface {v5}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/zip/ZipEntry;

    .line 5
    invoke-virtual {v6}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v8

    .line 6
    invoke-static {v8, v1, v3}, Lcom/taobao/sophix/b/c;->a(Ljava/lang/String;Ljava/io/File;Ljava/util/Map;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v8, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v13, 0x1

    add-int/2addr v0, v13

    invoke-virtual {v8, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v10

    .line 8
    const-string v0, "entryName"

    const-string v7, "soName"

    filled-new-array {v0, v8, v7, v10}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v4, v0}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
    :try_end_0
    .catch Lcom/taobao/sophix/a/b; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v14, 0x0

    move v0, v14

    move v15, v0

    :goto_1
    const/4 v7, 0x3

    if-ge v0, v7, :cond_2

    if-nez v15, :cond_2

    add-int/lit8 v16, v0, 0x1

    const/4 v7, 0x0

    .line 9
    :try_start_1
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v1, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 10
    new-instance v9, Ljava/io/BufferedOutputStream;

    new-instance v11, Ljava/io/FileOutputStream;

    invoke-direct {v11, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v9, v11}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 11
    :try_start_2
    new-instance v11, Ljava/io/BufferedInputStream;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object/from16 v12, p2

    :try_start_3
    invoke-virtual {v12, v6}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object v0

    invoke-direct {v11, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    const/16 v0, 0x400

    .line 12
    :try_start_4
    new-array v0, v0, [B

    .line 13
    invoke-virtual {v11, v0}, Ljava/io/InputStream;->read([B)I

    move-result v7

    :goto_2
    const/4 v13, -0x1

    if-eq v7, v13, :cond_1

    .line 14
    invoke-virtual {v9, v0, v14, v7}, Ljava/io/BufferedOutputStream;->write([BII)V

    .line 15
    invoke-virtual {v11, v0}, Ljava/io/InputStream;->read([B)I

    move-result v7
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object v7, v9

    move-object/from16 v17, v11

    goto :goto_6

    :catch_0
    move-exception v0

    move-object v13, v9

    move-object/from16 v17, v11

    goto :goto_4

    .line 16
    :cond_1
    :try_start_5
    invoke-static {v9}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 17
    invoke-static {v11}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V
    :try_end_5
    .catch Lcom/taobao/sophix/a/b; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    const/4 v15, 0x1

    goto :goto_5

    :catchall_1
    move-exception v0

    goto :goto_7

    :catch_1
    move-exception v0

    goto/16 :goto_8

    :catchall_2
    move-exception v0

    move-object/from16 v17, v7

    move-object v7, v9

    goto :goto_6

    :catch_2
    move-exception v0

    :goto_3
    move-object/from16 v17, v7

    move-object v13, v9

    goto :goto_4

    :catch_3
    move-exception v0

    move-object/from16 v12, p2

    goto :goto_3

    :catchall_3
    move-exception v0

    move-object/from16 v17, v7

    goto :goto_6

    :catch_4
    move-exception v0

    move-object/from16 v12, p2

    move-object v13, v7

    move-object/from16 v17, v13

    .line 18
    :goto_4
    :try_start_6
    const-string v7, "entryName"

    const-string v9, "libName"

    const-string v11, "numAttempts"

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    filled-new-array/range {v7 .. v12}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v2, v4, v0, v7}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 19
    :try_start_7
    invoke-static {v13}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 20
    invoke-static/range {v17 .. v17}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    :goto_5
    move/from16 v0, v16

    const/4 v13, 0x1

    goto :goto_1

    :catchall_4
    move-exception v0

    move-object v7, v13

    .line 21
    :goto_6
    invoke-static {v7}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 22
    invoke-static/range {v17 .. v17}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 23
    throw v0

    :cond_2
    if-eqz v15, :cond_3

    goto/16 :goto_0

    .line 24
    :cond_3
    new-instance v0, Lcom/taobao/sophix/a/b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unZipLibFile entryName:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x87

    invoke-direct {v0, v2, v1}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/String;)V

    throw v0
    :try_end_7
    .catch Lcom/taobao/sophix/a/b; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :cond_4
    return-void

    .line 25
    :goto_7
    new-instance v1, Lcom/taobao/sophix/a/b;

    const/16 v2, 0x83

    invoke-direct {v1, v2, v0}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/Throwable;)V

    throw v1

    .line 26
    :goto_8
    throw v0
.end method

.method public a(Ljava/lang/String;Ljava/io/File;)Z
    .locals 8

    .line 49
    const-string v0, "libDir"

    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "NativeLibManager"

    const-string v2, "patch"

    invoke-static {v1, v2, v0}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 50
    invoke-virtual {p2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 51
    array-length v3, v0

    if-eqz v3, :cond_4

    .line 52
    invoke-static {p1}, Lcom/taobao/sophix/b/c;->a(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    .line 53
    array-length v3, v0

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->size()I

    move-result v4

    if-ne v3, v4, :cond_4

    .line 54
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 55
    array-length v4, v0

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_4

    aget-object v6, v0, v5

    .line 56
    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3}, Ljava/lang/System;->mapLibraryName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 57
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    .line 58
    const-string v0, "inject before classLoader"

    filled-new-array {v0, p1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, v2, v0}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 59
    const-string v0, "pathList"

    invoke-direct {p0, p1, v0}, Lcom/taobao/sophix/b/c;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    .line 60
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 61
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 62
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v4, 0x1a

    const-string v5, "nativeLibraryDirectories"

    const-string v6, "nativeLibraryPathElements"

    if-lt v3, v4, :cond_2

    .line 63
    :try_start_1
    invoke-direct {p0, p2}, Lcom/taobao/sophix/b/c;->b(Ljava/io/File;)Ljava/lang/Object;

    move-result-object v3

    .line 64
    invoke-direct {p0, v0, v6, v3}, Lcom/taobao/sophix/b/c;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 65
    invoke-direct {p0, v0, v5, p2}, Lcom/taobao/sophix/b/c;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    .line 66
    :cond_2
    invoke-direct {p0, p2}, Lcom/taobao/sophix/b/c;->a(Ljava/io/File;)Ljava/lang/Object;

    move-result-object v3

    .line 67
    invoke-direct {p0, v0, v6, v3}, Lcom/taobao/sophix/b/c;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 68
    invoke-direct {p0, v0, v5, p2}, Lcom/taobao/sophix/b/c;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 69
    :cond_3
    :goto_2
    const-string p2, "inject after classLoader"

    filled-new-array {p2, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v1, v2, p1}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 p1, 0x1

    return p1

    .line 70
    :goto_3
    new-instance p2, Lcom/taobao/sophix/a/b;

    const/16 v0, 0x88

    invoke-direct {p2, v0, p1}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/Throwable;)V

    throw p2

    .line 71
    :cond_4
    new-instance p1, Lcom/taobao/sophix/a/b;

    const/16 p2, 0x86

    const-string v0, "lost some libs"

    invoke-direct {p1, p2, v0}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/String;)V

    throw p1
.end method
