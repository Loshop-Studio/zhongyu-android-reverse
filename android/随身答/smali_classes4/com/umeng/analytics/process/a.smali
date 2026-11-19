.class public abstract Lcom/umeng/analytics/process/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/analytics/process/a$b;
    }
.end annotation


# static fields
.field public static a:Ljava/util/concurrent/ExecutorService;

.field public static b:Lz2/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lcom/umeng/analytics/process/a;->a:Ljava/util/concurrent/ExecutorService;

    .line 6
    .line 7
    new-instance v0, Lz2/b;

    .line 8
    .line 9
    invoke-direct {v0}, Lz2/b;-><init>()V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lcom/umeng/analytics/process/a;->b:Lz2/b;

    .line 13
    .line 14
    return-void
.end method

.method public static synthetic a()Lz2/b;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/analytics/process/a;->b:Lz2/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public static b(Ljava/lang/String;Lz2/a;Lcom/umeng/analytics/process/a$b;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    sget-object p0, Lcom/umeng/analytics/process/a;->a:Ljava/util/concurrent/ExecutorService;

    .line 19
    .line 20
    new-instance v1, Lcom/umeng/analytics/process/a$a;

    .line 21
    .line 22
    invoke-direct {v1, v0, p1, p2}, Lcom/umeng/analytics/process/a$a;-><init>(Ljava/io/File;Lz2/a;Lcom/umeng/analytics/process/a$b;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method
