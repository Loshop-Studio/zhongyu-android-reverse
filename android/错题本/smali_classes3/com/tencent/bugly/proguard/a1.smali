.class public final Lcom/tencent/bugly/proguard/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/lang/Thread;

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Ljava/util/Map;


# direct methods
.method public constructor <init>(Ljava/lang/Thread;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/tencent/bugly/proguard/a1;->a:Ljava/lang/Thread;

    .line 5
    .line 6
    iput p2, p0, Lcom/tencent/bugly/proguard/a1;->b:I

    .line 7
    .line 8
    iput-object p3, p0, Lcom/tencent/bugly/proguard/a1;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/tencent/bugly/proguard/a1;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/tencent/bugly/proguard/a1;->e:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/tencent/bugly/proguard/a1;->f:Ljava/util/Map;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    :try_start_0
    invoke-static {}, Lcom/tencent/bugly/proguard/au;->a()Lcom/tencent/bugly/proguard/au;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "[ExtraCrashManager] Extra crash manager has not been initialized."

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    new-array v1, v1, [Ljava/lang/Object;

    .line 11
    .line 12
    invoke-static {v0, v1}, Lcom/tencent/bugly/proguard/al;->e(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/au;->a()Lcom/tencent/bugly/proguard/au;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v2, p0, Lcom/tencent/bugly/proguard/a1;->a:Ljava/lang/Thread;

    .line 23
    .line 24
    iget v3, p0, Lcom/tencent/bugly/proguard/a1;->b:I

    .line 25
    .line 26
    iget-object v4, p0, Lcom/tencent/bugly/proguard/a1;->c:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v5, p0, Lcom/tencent/bugly/proguard/a1;->d:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v6, p0, Lcom/tencent/bugly/proguard/a1;->e:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v7, p0, Lcom/tencent/bugly/proguard/a1;->f:Ljava/util/Map;

    .line 33
    .line 34
    invoke-static/range {v1 .. v7}, Lcom/tencent/bugly/proguard/au;->a(Lcom/tencent/bugly/proguard/au;Ljava/lang/Thread;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :goto_0
    invoke-static {v0}, Lcom/tencent/bugly/proguard/al;->b(Ljava/lang/Throwable;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_1

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 45
    .line 46
    .line 47
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/a1;->d:Ljava/lang/String;

    .line 48
    .line 49
    iget-object v1, p0, Lcom/tencent/bugly/proguard/a1;->e:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v2, p0, Lcom/tencent/bugly/proguard/a1;->c:Ljava/lang/String;

    .line 52
    .line 53
    filled-new-array {v2, v0, v1}, [Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const-string v1, "[ExtraCrashManager] Crash error %s %s %s"

    .line 58
    .line 59
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/al;->e(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    return-void
.end method
