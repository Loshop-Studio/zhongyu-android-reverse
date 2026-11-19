.class public Lg2/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg2/i0$a;
    }
.end annotation


# static fields
.field public static g:Lg2/i0;


# instance fields
.field public final a:I

.field public b:Z

.field public c:Z

.field public d:Landroid/os/Handler;

.field public e:Ljava/util/ArrayList;

.field public f:Lg2/i0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lg2/i0;

    .line 2
    .line 3
    invoke-direct {v0}, Lg2/i0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lg2/i0;->g:Lg2/i0;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0xbb8

    .line 5
    .line 6
    iput v0, p0, Lg2/i0;->a:I

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lg2/i0;->b:Z

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lg2/i0;->c:Z

    .line 13
    .line 14
    new-instance v0, Landroid/os/Handler;

    .line 15
    .line 16
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lg2/i0;->d:Landroid/os/Handler;

    .line 24
    .line 25
    new-instance v0, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lg2/i0;->e:Ljava/util/ArrayList;

    .line 31
    .line 32
    new-instance v0, Lg2/i0$a;

    .line 33
    .line 34
    invoke-direct {v0, p0}, Lg2/i0$a;-><init>(Lg2/i0;)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lg2/i0;->f:Lg2/i0$a;

    .line 38
    .line 39
    return-void
.end method

.method public static a()Lg2/i0;
    .locals 1

    .line 1
    sget-object v0, Lg2/i0;->g:Lg2/i0;

    .line 2
    .line 3
    return-object v0
.end method

.method public static b(Landroid/content/Context;)V
    .locals 1

    .line 1
    instance-of v0, p0, Landroid/app/Application;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Landroid/app/Application;

    .line 6
    .line 7
    sget-object v0, Lg2/i0;->g:Lg2/i0;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public static synthetic d(Lg2/i0;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lg2/i0;->b:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic e(Lg2/i0;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lg2/i0;->b:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic f(Lg2/i0;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lg2/i0;->c:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic g(Lg2/i0;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lg2/i0;->e:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public declared-synchronized c(Lg2/j0;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Lg2/i0;->e:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    throw p1

    .line 13
    :cond_0
    :goto_0
    monitor-exit p0

    .line 14
    return-void
.end method

.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 3

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lg2/i0;->c:Z

    .line 3
    .line 4
    iget-object p1, p0, Lg2/i0;->f:Lg2/i0$a;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lg2/i0;->d:Landroid/os/Handler;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lg2/i0;->d:Landroid/os/Handler;

    .line 14
    .line 15
    iget-object v0, p0, Lg2/i0;->f:Lg2/i0$a;

    .line 16
    .line 17
    const-wide/16 v1, 0xbb8

    .line 18
    .line 19
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 1

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lg2/i0;->c:Z

    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lg2/i0;->b:Z

    .line 6
    .line 7
    iget-object p1, p0, Lg2/i0;->f:Lg2/i0$a;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lg2/i0;->d:Landroid/os/Handler;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method
