.class public Lcom/taobao/sophix/e/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/lang/String;

.field private static b:Ljava/lang/String;


# direct methods
.method private static a()V
    .locals 3

    .line 5
    sget-object v0, Lcom/taobao/sophix/e/g;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_1

    .line 7
    invoke-static {}, Lb0/a;->a()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/taobao/sophix/e/g;->b:Ljava/lang/String;

    .line 8
    const-string v1, "process name ap"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v2, "ProcessUtils"

    invoke-static {v2, v1, v0}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    :cond_1
    :goto_0
    return-void
.end method

.method public static a(Landroid/app/Application;)Z
    .locals 2

    const/4 v0, 0x0

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/taobao/sophix/e/g;->b(Landroid/app/Application;)V

    .line 2
    sget-object v1, Lcom/taobao/sophix/e/g;->a:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    iget-object p0, p0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->processName:Ljava/lang/String;

    sput-object p0, Lcom/taobao/sophix/e/g;->a:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    :catchall_0
    :cond_0
    sget-object p0, Lcom/taobao/sophix/e/g;->a:Ljava/lang/String;

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_1

    sget-object p0, Lcom/taobao/sophix/e/g;->a:Ljava/lang/String;

    sget-object v1, Lcom/taobao/sophix/e/g;->b:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method private static b()V
    .locals 3

    .line 7
    sget-object v0, Lcom/taobao/sophix/e/g;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 8
    :cond_0
    :try_start_0
    const-string v0, "android.app.ActivityThread"

    const-class v1, Landroid/app/Application;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "currentProcessName"

    new-array v2, v2, [Ljava/lang/Class;

    .line 9
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 12
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 13
    check-cast v0, Ljava/lang/String;

    sput-object v0, Lcom/taobao/sophix/e/g;->b:Ljava/lang/String;

    .line 14
    const-string v1, "ProcessUtils"

    const-string v2, "process name at"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, v2, v0}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    :goto_0
    return-void
.end method

.method private static b(Landroid/app/Application;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/taobao/sophix/e/g;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-static {}, Lcom/taobao/sophix/e/g;->a()V

    .line 3
    sget-object v0, Lcom/taobao/sophix/e/g;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 4
    :cond_1
    invoke-static {}, Lcom/taobao/sophix/e/g;->b()V

    .line 5
    sget-object v0, Lcom/taobao/sophix/e/g;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    :goto_0
    return-void

    .line 6
    :cond_2
    invoke-static {p0}, Lcom/taobao/sophix/e/g;->c(Landroid/app/Application;)V

    return-void
.end method

.method private static c(Landroid/app/Application;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/taobao/sophix/e/g;->b:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    :try_start_0
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const-string v1, "activity"

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Landroid/app/ActivityManager;

    .line 21
    .line 22
    if-eqz p0, :cond_2

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 43
    .line 44
    iget v2, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I

    .line 45
    .line 46
    if-ne v2, v0, :cond_1

    .line 47
    .line 48
    iget-object v1, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    .line 49
    .line 50
    sput-object v1, Lcom/taobao/sophix/e/g;->b:Ljava/lang/String;

    .line 51
    .line 52
    const-string v2, "ProcessUtils"

    .line 53
    .line 54
    const-string v3, "process name am"

    .line 55
    .line 56
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-static {v2, v3, v1}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catchall_0
    :cond_2
    :goto_1
    return-void
.end method
