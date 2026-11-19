.class public Lcb/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcb/a$b;
    }
.end annotation


# static fields
.field public static e:Lcb/a;


# instance fields
.field public a:Ljava/util/List;

.field public b:Z

.field public c:Lcb/a$b;

.field public d:Landroid/app/Application$ActivityLifecycleCallbacks;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcb/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lcb/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcb/a;->e:Lcb/a;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcb/a;->a:Ljava/util/List;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcb/a;->b:Z

    .line 13
    .line 14
    new-instance v0, Lcb/a$a;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lcb/a$a;-><init>(Lcb/a;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcb/a;->d:Landroid/app/Application$ActivityLifecycleCallbacks;

    .line 20
    .line 21
    return-void
.end method

.method public static synthetic a(Lcb/a;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcb/a;->a:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(Lcb/a;)Lcb/a$b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcb/a;->c:Lcb/a$b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static i()Lcb/a;
    .locals 1

    .line 1
    sget-object v0, Lcb/a;->e:Lcb/a;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public c()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcb/a;->d()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public d()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcb/a;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroid/app/Activity;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    return-void
.end method

.method public e()Landroid/app/Activity;
    .locals 2

    .line 1
    iget-object v0, p0, Lcb/a;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return-object v0

    .line 11
    :cond_0
    iget-object v0, p0, Lcb/a;->a:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/lit8 v1, v1, -0x1

    .line 18
    .line 19
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Landroid/app/Activity;

    .line 24
    .line 25
    return-object v0
.end method

.method public f(Landroid/app/Application;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcb/a;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcb/a;->b:Z

    .line 8
    .line 9
    iget-object v0, p0, Lcb/a;->d:Landroid/app/Application$ActivityLifecycleCallbacks;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public g(Lcb/a$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcb/a;->c:Lcb/a$b;

    .line 2
    .line 3
    return-void
.end method

.method public h(Landroid/app/Application;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcb/a;->d:Landroid/app/Application$ActivityLifecycleCallbacks;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
