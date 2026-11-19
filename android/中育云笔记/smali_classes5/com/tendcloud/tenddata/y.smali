.class public Lcom/tendcloud/tenddata/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tendcloud/dot/DotActivityLifeCycleManager$DotActivityLifecycleCallbacks;
.implements Lcom/tendcloud/dot/DotFragmentManager$DotFragmentMangerCallback;
.implements Lcom/tendcloud/dot/DotGroupRadioOnCheckedChangeListener$OnGroupRadioCheckChangedCallback;
.implements Lcom/tendcloud/dot/DotOnCheckedChangeListener$CheckChangedCallback;
.implements Lcom/tendcloud/dot/DotOnItemClickListener$DotOnItemClickCallBack;
.implements Lcom/tendcloud/dot/DotOnclickListener$DotClickCallBack;


# static fields
.field private static final a:Ljava/lang/String; = "ModuleCodelessInstrumentation"

.field private static volatile b:Lcom/tendcloud/tenddata/y;


# instance fields
.field private c:Landroid/os/HandlerThread;

.field private d:Landroid/os/Handler;

.field private e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/y;->a()Lcom/tendcloud/tenddata/y;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/tendcloud/tenddata/cr;->a()Lcom/tendcloud/tenddata/cr;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1, v0}, Lcom/tendcloud/tenddata/cr;->register(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catch_0
    move-exception v0

    .line 14
    invoke-static {v0}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/tendcloud/tenddata/y;->e:Ljava/lang/String;

    .line 6
    .line 7
    :try_start_0
    new-instance v0, Landroid/os/HandlerThread;

    .line 8
    .line 9
    const-string v1, "ModuleCodelessInstrumentation"

    .line 10
    .line 11
    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/tendcloud/tenddata/y;->c:Landroid/os/HandlerThread;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 17
    .line 18
    .line 19
    new-instance v0, Lcom/tendcloud/tenddata/x;

    .line 20
    .line 21
    iget-object v1, p0, Lcom/tendcloud/tenddata/y;->c:Landroid/os/HandlerThread;

    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-direct {v0, p0, v1}, Lcom/tendcloud/tenddata/x;-><init>(Lcom/tendcloud/tenddata/y;Landroid/os/Looper;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lcom/tendcloud/tenddata/y;->d:Landroid/os/Handler;

    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/y;->b()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catch_0
    move-exception v0

    .line 37
    invoke-static {v0}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public static a()Lcom/tendcloud/tenddata/y;
    .locals 2

    .line 2
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/y;->b:Lcom/tendcloud/tenddata/y;

    if-nez v0, :cond_1

    .line 3
    const-class v0, Lcom/tendcloud/tenddata/y;

    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    :try_start_1
    sget-object v1, Lcom/tendcloud/tenddata/y;->b:Lcom/tendcloud/tenddata/y;

    if-nez v1, :cond_0

    .line 5
    new-instance v1, Lcom/tendcloud/tenddata/y;

    invoke-direct {v1}, Lcom/tendcloud/tenddata/y;-><init>()V

    sput-object v1, Lcom/tendcloud/tenddata/y;->b:Lcom/tendcloud/tenddata/y;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 6
    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception v0

    .line 7
    invoke-static {v0}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    .line 8
    :cond_1
    :goto_2
    sget-object v0, Lcom/tendcloud/tenddata/y;->b:Lcom/tendcloud/tenddata/y;

    return-object v0
.end method

.method private a(Lcom/tendcloud/tenddata/w;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tendcloud/tenddata/w;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 9
    :try_start_0
    new-instance v0, Ljava/util/HashMap;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 10
    const-string v1, "_td_from_codeless"

    const-string v2, "1"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_0

    .line 11
    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 12
    invoke-interface {v0, p2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 13
    :cond_0
    :goto_0
    iget-object p2, p0, Lcom/tendcloud/tenddata/y;->d:Landroid/os/Handler;

    invoke-virtual {p2}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object p2

    const/4 v1, 0x1

    .line 14
    iput v1, p2, Landroid/os/Message;->what:I

    .line 15
    new-instance v1, Lcom/tendcloud/tenddata/ad;

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/w;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/w;->g()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, p1, v0}, Lcom/tendcloud/tenddata/ad;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    iput-object v1, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 16
    invoke-virtual {p2}, Landroid/os/Message;->sendToTarget()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 17
    :goto_1
    invoke-static {p1}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    return-void
.end method

.method private e()V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Lcom/tendcloud/dot/DotActivityLifeCycleManager;->getInstance()Lcom/tendcloud/dot/DotActivityLifeCycleManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lcom/tendcloud/dot/DotActivityLifeCycleManager;->registerDotActivityLifecycleCallbacks(Lcom/tendcloud/dot/DotActivityLifeCycleManager$DotActivityLifecycleCallbacks;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lcom/tendcloud/dot/DotOnclickListener;->setCallBack(Lcom/tendcloud/dot/DotOnclickListener$DotClickCallBack;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Lcom/tendcloud/dot/DotFragmentManager;->setCallback(Lcom/tendcloud/dot/DotFragmentManager$DotFragmentMangerCallback;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, Lcom/tendcloud/dot/DotOnItemClickListener;->setCallBack(Lcom/tendcloud/dot/DotOnItemClickListener$DotOnItemClickCallBack;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p0}, Lcom/tendcloud/dot/DotGroupRadioOnCheckedChangeListener;->setCallback(Lcom/tendcloud/dot/DotGroupRadioOnCheckedChangeListener$OnGroupRadioCheckChangedCallback;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p0}, Lcom/tendcloud/dot/DotOnCheckedChangeListener;->setCallback(Lcom/tendcloud/dot/DotOnCheckedChangeListener$CheckChangedCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catch_0
    move-exception v0

    .line 25
    invoke-static {v0}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public a(Landroid/os/Message;)V
    .locals 0

    .line 1
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/tendcloud/tenddata/y;->e()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 2
    invoke-static {v0}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    return-void
.end method

.method public b(Landroid/os/Message;)V
    .locals 4

    .line 3
    :try_start_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lcom/tendcloud/tenddata/ad;

    .line 4
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    iget-object v1, p1, Lcom/tendcloud/tenddata/ad;->a:Ljava/lang/String;

    iget-object p1, p1, Lcom/tendcloud/tenddata/ad;->c:Ljava/util/Map;

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3, p1}, Lcom/tendcloud/tenddata/TalkingDataSDK;->onEvent(Landroid/content/Context;Ljava/lang/String;DLjava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 5
    invoke-static {p1}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    return-void
.end method

.method public c()V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/o;->a()Lcom/tendcloud/tenddata/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/o;->b()V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/tendcloud/tenddata/ae;->a()V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/tendcloud/tenddata/o;->a()Lcom/tendcloud/tenddata/o;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "native_value"

    .line 16
    .line 17
    const-string v2, "currentElements"

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Lcom/tendcloud/tenddata/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    invoke-static {v0}, Lcom/tendcloud/tenddata/ae;->addConfigFromString(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catch_0
    move-exception v0

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    :goto_0
    invoke-static {}, Lcom/tendcloud/tenddata/o;->a()Lcom/tendcloud/tenddata/o;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v1, p0, Lcom/tendcloud/tenddata/y;->e:Ljava/lang/String;

    .line 40
    .line 41
    const-string v2, "native"

    .line 42
    .line 43
    invoke-virtual {v0, v1, v2}, Lcom/tendcloud/tenddata/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_1

    .line 52
    .line 53
    invoke-static {v0}, Lcom/tendcloud/tenddata/ae;->addConfigFromString(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-static {}, Lcom/tendcloud/tenddata/o;->a()Lcom/tendcloud/tenddata/o;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/o;->c()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :goto_1
    invoke-static {v0}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public d()Landroid/os/Handler;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/y;->d:Landroid/os/Handler;

    .line 2
    .line 3
    return-object v0
.end method

.method public enableXmlCLickHook(Z)V
    .locals 0

    .line 1
    :try_start_0
    sput-boolean p1, Lcom/tendcloud/dot/LayoutInflaterHooker;->hookLayoutXmlOnClick:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    return-void

    .line 4
    :catch_0
    move-exception p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public handleActivityResume(Landroid/os/Message;)V
    .locals 0

    .line 1
    :try_start_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Ljava/lang/String;

    .line 4
    .line 5
    iput-object p1, p0, Lcom/tendcloud/tenddata/y;->e:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/y;->c()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :catch_0
    move-exception p1

    .line 12
    invoke-static {p1}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public handleCodelessConfigSave(Lorg/json/JSONObject;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/l;->a()Lcom/tendcloud/tenddata/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/tendcloud/tenddata/l;->saveConfig(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catch_0
    move-exception p1

    .line 10
    invoke-static {p1}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/y;->d()Landroid/os/Handler;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x4

    .line 20
    iput v1, v0, Landroid/os/Message;->what:I

    .line 21
    .line 22
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catch_0
    move-exception p1

    .line 29
    invoke-static {p1}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 0

    const/4 p2, 0x0

    .line 6
    :try_start_0
    invoke-static {p1, p2}, Lcom/tendcloud/tenddata/ae;->a(Landroid/view/View;Z)Lcom/tendcloud/tenddata/w;

    move-result-object p2

    if-nez p2, :cond_0

    return-void

    .line 7
    :cond_0
    invoke-static {p1, p2}, Lcom/tendcloud/tenddata/v;->a(Landroid/view/View;Lcom/tendcloud/tenddata/w;)Ljava/util/Map;

    move-result-object p1

    .line 8
    invoke-direct {p0, p2, p1}, Lcom/tendcloud/tenddata/y;->a(Lcom/tendcloud/tenddata/w;Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 9
    invoke-static {p1}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 1

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    :try_start_0
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    const/4 v0, 0x0

    .line 2
    invoke-static {p2, v0}, Lcom/tendcloud/tenddata/ae;->a(Landroid/view/View;Z)Lcom/tendcloud/tenddata/w;

    move-result-object p2

    if-nez p2, :cond_1

    :goto_0
    return-void

    .line 3
    :cond_1
    invoke-static {p1, p2}, Lcom/tendcloud/tenddata/v;->a(Landroid/view/View;Lcom/tendcloud/tenddata/w;)Ljava/util/Map;

    move-result-object p1

    .line 4
    invoke-direct {p0, p2, p1}, Lcom/tendcloud/tenddata/y;->a(Lcom/tendcloud/tenddata/w;Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 5
    invoke-static {p1}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const/4 v0, 0x0

    .line 5
    :try_start_0
    invoke-static {p1, v0}, Lcom/tendcloud/tenddata/ae;->a(Landroid/view/View;Z)Lcom/tendcloud/tenddata/w;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    :goto_0
    return-void

    .line 12
    :cond_1
    invoke-static {p1, v0}, Lcom/tendcloud/tenddata/v;->a(Landroid/view/View;Lcom/tendcloud/tenddata/w;)Ljava/util/Map;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-direct {p0, v0, p1}, Lcom/tendcloud/tenddata/y;->a(Lcom/tendcloud/tenddata/w;Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :catch_0
    move-exception p1

    .line 21
    invoke-static {p1}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public onFragmentVisibilityChanged(Ljava/lang/Object;ZZ)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    :try_start_0
    instance-of p3, p1, Landroid/app/Fragment;

    .line 5
    .line 6
    if-eqz p3, :cond_1

    .line 7
    .line 8
    const/16 p3, 0xb

    .line 9
    .line 10
    invoke-static {p3}, Lcom/tendcloud/tenddata/cq;->a(I)Z

    .line 11
    .line 12
    .line 13
    move-result p3

    .line 14
    if-eqz p3, :cond_3

    .line 15
    .line 16
    move-object p3, p1

    .line 17
    check-cast p3, Landroid/app/Fragment;

    .line 18
    .line 19
    invoke-virtual {p3}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    invoke-virtual {p3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    goto :goto_0

    .line 32
    :catch_0
    move-exception p1

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-static {p1}, Lcom/tendcloud/tenddata/v;->a(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    if-eqz p3, :cond_2

    .line 39
    .line 40
    move-object p3, p1

    .line 41
    check-cast p3, Landroidx/fragment/app/Fragment;

    .line 42
    .line 43
    invoke-virtual {p3}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 44
    .line 45
    .line 46
    move-result-object p3

    .line 47
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object p3

    .line 51
    invoke-virtual {p3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p3

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    invoke-static {p1}, Lcom/tendcloud/tenddata/v;->b(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p3

    .line 60
    if-eqz p3, :cond_3

    .line 61
    .line 62
    move-object p3, p1

    .line 63
    check-cast p3, Landroidx/fragment/app/Fragment;

    .line 64
    .line 65
    invoke-virtual {p3}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 66
    .line 67
    .line 68
    move-result-object p3

    .line 69
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object p3

    .line 73
    invoke-virtual {p3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p3

    .line 77
    goto :goto_0

    .line 78
    :cond_3
    const/4 p3, 0x0

    .line 79
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    iget-object v0, p0, Lcom/tendcloud/tenddata/y;->d:Landroid/os/Handler;

    .line 88
    .line 89
    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    const/4 v1, 0x3

    .line 94
    iput v1, v0, Landroid/os/Message;->what:I

    .line 95
    .line 96
    new-instance v1, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string p3, "/"

    .line 105
    .line 106
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 117
    .line 118
    iput p2, v0, Landroid/os/Message;->arg1:I

    .line 119
    .line 120
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :goto_1
    invoke-static {p1}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 p1, 0x1

    .line 7
    :try_start_0
    invoke-static {p2, p1}, Lcom/tendcloud/tenddata/ae;->a(Landroid/view/View;Z)Lcom/tendcloud/tenddata/w;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    invoke-static {p2, p1}, Lcom/tendcloud/tenddata/v;->a(Landroid/view/View;Lcom/tendcloud/tenddata/w;)Ljava/util/Map;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-direct {p0, p1, p2}, Lcom/tendcloud/tenddata/y;->a(Lcom/tendcloud/tenddata/w;Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :catch_0
    move-exception p1

    .line 23
    invoke-static {p1}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    :cond_2
    :goto_0
    return-void
.end method

.method public onSaveConfig(Lorg/json/JSONObject;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    :try_start_0
    const-string v0, "process with config"

    .line 5
    .line 6
    filled-new-array {v0}, [Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, Lcom/tendcloud/tenddata/ca;->dForInternal([Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/tendcloud/tenddata/y;->d()Landroid/os/Handler;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x7

    .line 22
    iput v1, v0, Landroid/os/Message;->what:I

    .line 23
    .line 24
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :catch_0
    move-exception p1

    .line 31
    invoke-static {p1}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public onViewCreated(Ljava/lang/Object;Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p1}, Lcom/tendcloud/tenddata/v;->trackFragment(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catch_0
    move-exception p1

    .line 6
    invoke-static {p1}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
