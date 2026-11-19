.class public Lcom/zykj/message/client/ActivityCollectionHelper;
.super Ljava/lang/Object;
.source "ActivityCollectionHelper.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/message/client/ActivityCollectionHelper$ActivityResumeListener;
    }
.end annotation


# static fields
.field private static helper:Lcom/zykj/message/client/ActivityCollectionHelper;


# instance fields
.field private activityLifecycleCallbacks:Landroid/app/Application$ActivityLifecycleCallbacks;

.field private activityList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private isRegister:Z

.field private resumeListener:Lcom/zykj/message/client/ActivityCollectionHelper$ActivityResumeListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 18
    new-instance v0, Lcom/zykj/message/client/ActivityCollectionHelper;

    invoke-direct {v0}, Lcom/zykj/message/client/ActivityCollectionHelper;-><init>()V

    sput-object v0, Lcom/zykj/message/client/ActivityCollectionHelper;->helper:Lcom/zykj/message/client/ActivityCollectionHelper;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/zykj/message/client/ActivityCollectionHelper;->activityList:Ljava/util/List;

    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p0, Lcom/zykj/message/client/ActivityCollectionHelper;->isRegister:Z

    .line 48
    new-instance v0, Lcom/zykj/message/client/ActivityCollectionHelper$1;

    invoke-direct {v0, p0}, Lcom/zykj/message/client/ActivityCollectionHelper$1;-><init>(Lcom/zykj/message/client/ActivityCollectionHelper;)V

    iput-object v0, p0, Lcom/zykj/message/client/ActivityCollectionHelper;->activityLifecycleCallbacks:Landroid/app/Application$ActivityLifecycleCallbacks;

    return-void
.end method

.method static synthetic access$000(Lcom/zykj/message/client/ActivityCollectionHelper;)Ljava/util/List;
    .locals 0

    .line 14
    iget-object p0, p0, Lcom/zykj/message/client/ActivityCollectionHelper;->activityList:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$100(Lcom/zykj/message/client/ActivityCollectionHelper;)Lcom/zykj/message/client/ActivityCollectionHelper$ActivityResumeListener;
    .locals 0

    .line 14
    iget-object p0, p0, Lcom/zykj/message/client/ActivityCollectionHelper;->resumeListener:Lcom/zykj/message/client/ActivityCollectionHelper$ActivityResumeListener;

    return-object p0
.end method

.method public static with()Lcom/zykj/message/client/ActivityCollectionHelper;
    .locals 1

    .line 28
    sget-object v0, Lcom/zykj/message/client/ActivityCollectionHelper;->helper:Lcom/zykj/message/client/ActivityCollectionHelper;

    return-object v0
.end method


# virtual methods
.method public exitApp()V
    .locals 1

    .line 87
    invoke-virtual {p0}, Lcom/zykj/message/client/ActivityCollectionHelper;->finishAll()V

    .line 88
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    const/4 v0, 0x0

    .line 89
    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    return-void
.end method

.method public finishAll()V
    .locals 3

    .line 93
    iget-object v0, p0, Lcom/zykj/message/client/ActivityCollectionHelper;->activityList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    .line 94
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-nez v2, :cond_0

    .line 95
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public getTopActivity()Landroid/app/Activity;
    .locals 2

    .line 101
    iget-object v0, p0, Lcom/zykj/message/client/ActivityCollectionHelper;->activityList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 104
    :cond_0
    iget-object v0, p0, Lcom/zykj/message/client/ActivityCollectionHelper;->activityList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    return-object v0
.end method

.method public register(Landroid/app/Application;)V
    .locals 1

    .line 37
    iget-boolean v0, p0, Lcom/zykj/message/client/ActivityCollectionHelper;->isRegister:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 40
    iput-boolean v0, p0, Lcom/zykj/message/client/ActivityCollectionHelper;->isRegister:Z

    .line 41
    iget-object v0, p0, Lcom/zykj/message/client/ActivityCollectionHelper;->activityLifecycleCallbacks:Landroid/app/Application$ActivityLifecycleCallbacks;

    invoke-virtual {p1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method

.method public registerResumeListener(Lcom/zykj/message/client/ActivityCollectionHelper$ActivityResumeListener;)V
    .locals 0

    .line 108
    iput-object p1, p0, Lcom/zykj/message/client/ActivityCollectionHelper;->resumeListener:Lcom/zykj/message/client/ActivityCollectionHelper$ActivityResumeListener;

    return-void
.end method

.method public unRegister(Landroid/app/Application;)V
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/zykj/message/client/ActivityCollectionHelper;->activityLifecycleCallbacks:Landroid/app/Application$ActivityLifecycleCallbacks;

    invoke-virtual {p1, v0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method

.method public unRegisterResumeListener()V
    .locals 1

    const/4 v0, 0x0

    .line 112
    iput-object v0, p0, Lcom/zykj/message/client/ActivityCollectionHelper;->resumeListener:Lcom/zykj/message/client/ActivityCollectionHelper$ActivityResumeListener;

    return-void
.end method
