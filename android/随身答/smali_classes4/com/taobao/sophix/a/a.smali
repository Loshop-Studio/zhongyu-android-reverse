.class public Lcom/taobao/sophix/a/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# static fields
.field private static e:Lcom/taobao/sophix/a/a;


# instance fields
.field private volatile a:Z

.field private volatile b:Z

.field private volatile c:I

.field private d:Ljava/lang/Thread$UncaughtExceptionHandler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/taobao/sophix/a/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/taobao/sophix/a/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/taobao/sophix/a/a;->e:Lcom/taobao/sophix/a/a;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/taobao/sophix/a/a;->b:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/taobao/sophix/a/a;->a:Z

    .line 8
    .line 9
    sget-object v1, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    .line 10
    .line 11
    const-string v2, "happ_crash_num"

    .line 12
    .line 13
    invoke-static {v1, v2, v0}, Lcom/taobao/sophix/e/j;->a(Landroid/content/Context;Ljava/lang/String;I)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iput v0, p0, Lcom/taobao/sophix/a/a;->c:I

    .line 18
    .line 19
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lcom/taobao/sophix/a/a;->d:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 24
    .line 25
    return-void
.end method

.method public static a(Z)V
    .locals 9

    .line 1
    sget-object v0, Lcom/taobao/sophix/a/a;->e:Lcom/taobao/sophix/a/a;

    iget-boolean v0, v0, Lcom/taobao/sophix/a/a;->b:Z

    if-ne p0, v0, :cond_0

    goto/16 :goto_5

    .line 2
    :cond_0
    sget-object v0, Lcom/taobao/sophix/a/a;->e:Lcom/taobao/sophix/a/a;

    iput-boolean p0, v0, Lcom/taobao/sophix/a/a;->b:Z

    .line 3
    const-string v0, "CrashHandler"

    if-eqz p0, :cond_1

    .line 4
    sget-object p0, Lcom/taobao/sophix/a/a;->e:Lcom/taobao/sophix/a/a;

    invoke-static {p0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 5
    sget-object p0, Lcom/taobao/sophix/a/a;->e:Lcom/taobao/sophix/a/a;

    iget p0, p0, Lcom/taobao/sophix/a/a;->c:I

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    const-string v1, "crash number"

    filled-new-array {v1, p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string v1, "set"

    invoke-static {v0, v1, p0}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    return-void

    .line 6
    :cond_1
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object p0

    .line 7
    const-string v1, "null"

    if-nez p0, :cond_2

    move-object v4, v1

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    move-object v4, v2

    :goto_0
    sget-object v2, Lcom/taobao/sophix/a/a;->e:Lcom/taobao/sophix/a/a;

    if-nez v2, :cond_3

    move-object v6, v1

    goto :goto_1

    .line 8
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    move-object v6, v2

    :goto_1
    sget-object v2, Lcom/taobao/sophix/a/a;->e:Lcom/taobao/sophix/a/a;

    if-nez v2, :cond_4

    :goto_2
    move-object v8, v1

    goto :goto_3

    :cond_4
    iget-object v2, v2, Lcom/taobao/sophix/a/a;->d:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-nez v2, :cond_5

    goto :goto_2

    .line 9
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    move-object v8, v2

    :goto_3
    const-string v3, "current"

    const-string v5, "sophix"

    const-string v7, "origin"

    filled-new-array/range {v3 .. v8}, [Ljava/lang/Object;

    move-result-object v2

    .line 10
    const-string v3, "handlers"

    invoke-static {v0, v3, v2}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 11
    sget-object v0, Lcom/taobao/sophix/a/a;->e:Lcom/taobao/sophix/a/a;

    if-ne p0, v0, :cond_7

    .line 12
    iget-object p0, v0, Lcom/taobao/sophix/a/a;->d:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-nez p0, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_4
    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object p0

    const-string v0, "handler"

    const-string v1, "recove"

    invoke-static {v0, v1, p0}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 13
    sget-object p0, Lcom/taobao/sophix/a/a;->e:Lcom/taobao/sophix/a/a;

    iget-object p0, p0, Lcom/taobao/sophix/a/a;->d:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-static {p0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    :cond_7
    :goto_5
    return-void
.end method

.method public static a()Z
    .locals 1

    .line 14
    sget-object v0, Lcom/taobao/sophix/a/a;->e:Lcom/taobao/sophix/a/a;

    iget-boolean v0, v0, Lcom/taobao/sophix/a/a;->b:Z

    return v0
.end method

.method public static b()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/taobao/sophix/a/a;->e:Lcom/taobao/sophix/a/a;

    .line 2
    .line 3
    iget-boolean v0, v0, Lcom/taobao/sophix/a/a;->a:Z

    .line 4
    .line 5
    return v0
.end method


# virtual methods
.method public uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v2, "CrashHandler"

    .line 5
    .line 6
    const-string v3, "crash happend"

    .line 7
    .line 8
    invoke-static {v2, v3, v1}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 9
    .line 10
    .line 11
    sget-object v1, Lcom/taobao/sophix/a/a;->e:Lcom/taobao/sophix/a/a;

    .line 12
    .line 13
    iget-boolean v1, v1, Lcom/taobao/sophix/a/a;->b:Z

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    instance-of v1, p2, Ljava/lang/OutOfMemoryError;

    .line 18
    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    iput-boolean v1, p0, Lcom/taobao/sophix/a/a;->a:Z

    .line 23
    .line 24
    iget v3, p0, Lcom/taobao/sophix/a/a;->c:I

    .line 25
    .line 26
    add-int/2addr v3, v1

    .line 27
    iput v3, p0, Lcom/taobao/sophix/a/a;->c:I

    .line 28
    .line 29
    sget-object v1, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    .line 30
    .line 31
    const-string v3, "happ_crash_num"

    .line 32
    .line 33
    iget v4, p0, Lcom/taobao/sophix/a/a;->c:I

    .line 34
    .line 35
    invoke-static {v1, v3, v4}, Lcom/taobao/sophix/e/j;->b(Landroid/content/Context;Ljava/lang/String;I)V

    .line 36
    .line 37
    .line 38
    iget v1, p0, Lcom/taobao/sophix/a/a;->c:I

    .line 39
    .line 40
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const-string v3, "crashNum"

    .line 45
    .line 46
    filled-new-array {v3, v1}, [Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    const-string v3, "crash is found"

    .line 51
    .line 52
    invoke-static {v2, v3, v1}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 53
    .line 54
    .line 55
    :cond_0
    invoke-static {v0}, Lcom/taobao/sophix/a/a;->a(Z)V

    .line 56
    .line 57
    .line 58
    :cond_1
    iget-object v0, p0, Lcom/taobao/sophix/a/a;->d:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 59
    .line 60
    invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method
