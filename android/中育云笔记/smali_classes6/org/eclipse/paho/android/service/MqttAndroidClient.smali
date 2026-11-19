.class public Lorg/eclipse/paho/android/service/MqttAndroidClient;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"

# interfaces
.implements Lorg/eclipse/paho/client/mqttv3/IMqttAsyncClient;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/eclipse/paho/android/service/MqttAndroidClient$b;,
        Lorg/eclipse/paho/android/service/MqttAndroidClient$Ack;
    }
.end annotation


# static fields
.field public static final t:Ljava/util/concurrent/ExecutorService;


# instance fields
.field public final c:Lorg/eclipse/paho/android/service/MqttAndroidClient$b;

.field public d:Lorg/eclipse/paho/android/service/MqttService;

.field public e:Ljava/lang/String;

.field public f:Landroid/content/Context;

.field public final g:Landroid/util/SparseArray;

.field public h:I

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

.field public l:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

.field public m:Lorg/eclipse/paho/client/mqttv3/IMqttToken;

.field public n:Lorg/eclipse/paho/client/mqttv3/MqttCallback;

.field public o:Laf/e;

.field public final p:Lorg/eclipse/paho/android/service/MqttAndroidClient$Ack;

.field public q:Z

.field public volatile r:Z

.field public volatile s:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->t:Ljava/util/concurrent/ExecutorService;

    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;Lorg/eclipse/paho/android/service/MqttAndroidClient$Ack;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/eclipse/paho/android/service/MqttAndroidClient$b;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Lorg/eclipse/paho/android/service/MqttAndroidClient$b;-><init>(Lorg/eclipse/paho/android/service/MqttAndroidClient;Lorg/eclipse/paho/android/service/MqttAndroidClient$a;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->c:Lorg/eclipse/paho/android/service/MqttAndroidClient$b;

    .line 11
    .line 12
    new-instance v0, Landroid/util/SparseArray;

    .line 13
    .line 14
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->g:Landroid/util/SparseArray;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->h:I

    .line 21
    .line 22
    iput-object v1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 23
    .line 24
    iput-boolean v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->q:Z

    .line 25
    .line 26
    iput-boolean v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->r:Z

    .line 27
    .line 28
    iput-boolean v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->s:Z

    .line 29
    .line 30
    iput-object p1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->f:Landroid/content/Context;

    .line 31
    .line 32
    iput-object p2, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->i:Ljava/lang/String;

    .line 33
    .line 34
    iput-object p3, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->j:Ljava/lang/String;

    .line 35
    .line 36
    iput-object p4, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 37
    .line 38
    iput-object p5, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->p:Lorg/eclipse/paho/android/service/MqttAndroidClient$Ack;

    .line 39
    .line 40
    return-void
.end method

.method public static synthetic a(Lorg/eclipse/paho/android/service/MqttAndroidClient;Lorg/eclipse/paho/android/service/MqttService;)Lorg/eclipse/paho/android/service/MqttService;
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->d:Lorg/eclipse/paho/android/service/MqttService;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic c(Lorg/eclipse/paho/android/service/MqttAndroidClient;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->s:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic d(Lorg/eclipse/paho/android/service/MqttAndroidClient;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->l()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(Lorg/eclipse/paho/android/service/MqttAndroidClient;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->r:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic f(Lorg/eclipse/paho/android/service/MqttAndroidClient;Landroid/content/BroadcastReceiver;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->r(Landroid/content/BroadcastReceiver;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public close()V
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->d:Lorg/eclipse/paho/android/service/MqttService;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->e:Ljava/lang/String;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->i:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v2, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->j:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v3, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->f:Landroid/content/Context;

    .line 14
    .line 15
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v4, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 22
    .line 23
    invoke-virtual {v0, v1, v2, v3, v4}, Lorg/eclipse/paho/android/service/MqttService;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->e:Ljava/lang/String;

    .line 28
    .line 29
    :cond_0
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->d:Lorg/eclipse/paho/android/service/MqttService;

    .line 30
    .line 31
    iget-object v1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->e:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lorg/eclipse/paho/android/service/MqttService;->g(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-void
.end method

.method public connect()Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0, v0}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->connect(Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;

    move-result-object v0

    return-object v0
.end method

.method public connect(Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    .locals 1

    .line 3
    new-instance v0, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    invoke-direct {v0}, Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;-><init>()V

    invoke-virtual {p0, v0, p1, p2}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->connect(Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;

    move-result-object p1

    return-object p1
.end method

.method public connect(Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0, v0}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->connect(Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;

    move-result-object p1

    return-object p1
.end method

.method public connect(Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    .locals 2

    .line 4
    new-instance v0, Laf/d;

    invoke-direct {v0, p0, p2, p3}, Laf/d;-><init>(Lorg/eclipse/paho/android/service/MqttAndroidClient;Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)V

    .line 5
    iput-object p1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->l:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    .line 6
    iput-object v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->m:Lorg/eclipse/paho/client/mqttv3/IMqttToken;

    .line 7
    iget-object p1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->d:Lorg/eclipse/paho/android/service/MqttService;

    if-nez p1, :cond_2

    .line 8
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    .line 9
    iget-object p2, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->f:Landroid/content/Context;

    const-string p3, "org.eclipse.paho.android.service.MqttService"

    invoke-virtual {p1, p2, p3}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 10
    iget-object p2, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->f:Landroid/content/Context;

    invoke-virtual {p2, p1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    move-result-object p2

    if-nez p2, :cond_0

    .line 11
    invoke-interface {v0}, Lorg/eclipse/paho/client/mqttv3/IMqttToken;->getActionCallback()Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 12
    new-instance p3, Ljava/lang/RuntimeException;

    const-string v1, "cannot start service org.eclipse.paho.android.service.MqttService"

    invoke-direct {p3, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, v0, p3}, Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;->onFailure(Lorg/eclipse/paho/client/mqttv3/IMqttToken;Ljava/lang/Throwable;)V

    .line 13
    :cond_0
    iget-object p2, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->f:Landroid/content/Context;

    iget-object p3, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->c:Lorg/eclipse/paho/android/service/MqttAndroidClient$b;

    const/4 v1, 0x1

    invoke-virtual {p2, p1, p3, v1}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 14
    iget-boolean p1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->r:Z

    if-nez p1, :cond_1

    invoke-virtual {p0, p0}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->r(Landroid/content/BroadcastReceiver;)V

    :cond_1
    return-object v0

    .line 15
    :cond_2
    sget-object p1, Lorg/eclipse/paho/android/service/MqttAndroidClient;->t:Ljava/util/concurrent/ExecutorService;

    new-instance p2, Lorg/eclipse/paho/android/service/MqttAndroidClient$a;

    invoke-direct {p2, p0}, Lorg/eclipse/paho/android/service/MqttAndroidClient$a;-><init>(Lorg/eclipse/paho/android/service/MqttAndroidClient;)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public deleteBufferedMessage(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->d:Lorg/eclipse/paho/android/service/MqttService;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->e:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Lorg/eclipse/paho/android/service/MqttService;->i(Ljava/lang/String;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public disconnect()Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    .locals 5

    .line 1
    new-instance v0, Laf/d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, v1}, Laf/d;-><init>(Lorg/eclipse/paho/android/service/MqttAndroidClient;Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)V

    .line 2
    invoke-virtual {p0, v0}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->v(Lorg/eclipse/paho/client/mqttv3/IMqttToken;)Ljava/lang/String;

    move-result-object v2

    .line 3
    iget-object v3, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->d:Lorg/eclipse/paho/android/service/MqttService;

    iget-object v4, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->e:Ljava/lang/String;

    invoke-virtual {v3, v4, v1, v2}, Lorg/eclipse/paho/android/service/MqttService;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public disconnect(J)Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    .locals 8

    .line 4
    new-instance v0, Laf/d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, v1}, Laf/d;-><init>(Lorg/eclipse/paho/android/service/MqttAndroidClient;Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)V

    .line 5
    invoke-virtual {p0, v0}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->v(Lorg/eclipse/paho/client/mqttv3/IMqttToken;)Ljava/lang/String;

    move-result-object v7

    .line 6
    iget-object v2, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->d:Lorg/eclipse/paho/android/service/MqttService;

    iget-object v3, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->e:Ljava/lang/String;

    const/4 v6, 0x0

    move-wide v4, p1

    invoke-virtual/range {v2 .. v7}, Lorg/eclipse/paho/android/service/MqttService;->j(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public disconnect(JLjava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    .locals 7

    .line 10
    new-instance v0, Laf/d;

    invoke-direct {v0, p0, p3, p4}, Laf/d;-><init>(Lorg/eclipse/paho/android/service/MqttAndroidClient;Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)V

    .line 11
    invoke-virtual {p0, v0}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->v(Lorg/eclipse/paho/client/mqttv3/IMqttToken;)Ljava/lang/String;

    move-result-object v6

    .line 12
    iget-object v1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->d:Lorg/eclipse/paho/android/service/MqttService;

    iget-object v2, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->e:Ljava/lang/String;

    const/4 v5, 0x0

    move-wide v3, p1

    invoke-virtual/range {v1 .. v6}, Lorg/eclipse/paho/android/service/MqttService;->j(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public disconnect(Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    .locals 3

    .line 7
    new-instance v0, Laf/d;

    invoke-direct {v0, p0, p1, p2}, Laf/d;-><init>(Lorg/eclipse/paho/android/service/MqttAndroidClient;Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)V

    .line 8
    invoke-virtual {p0, v0}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->v(Lorg/eclipse/paho/client/mqttv3/IMqttToken;)Ljava/lang/String;

    move-result-object p1

    .line 9
    iget-object p2, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->d:Lorg/eclipse/paho/android/service/MqttService;

    iget-object v1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->e:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {p2, v1, v2, p1}, Lorg/eclipse/paho/android/service/MqttService;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public disconnectForcibly()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public disconnectForcibly(J)V
    .locals 0

    .line 2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public disconnectForcibly(JJ)V
    .locals 0

    .line 3
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final g(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->m:Lorg/eclipse/paho/client/mqttv3/IMqttToken;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->s(Landroid/os/Bundle;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0, p1}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->u(Lorg/eclipse/paho/client/mqttv3/IMqttToken;Landroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public getBufferedMessage(I)Lorg/eclipse/paho/client/mqttv3/MqttMessage;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->d:Lorg/eclipse/paho/android/service/MqttService;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->e:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Lorg/eclipse/paho/android/service/MqttService;->l(Ljava/lang/String;I)Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public getBufferedMessageCount()I
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->d:Lorg/eclipse/paho/android/service/MqttService;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->e:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lorg/eclipse/paho/android/service/MqttService;->m(Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public getClientId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->j:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPendingDeliveryTokens()[Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->d:Lorg/eclipse/paho/android/service/MqttService;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->e:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lorg/eclipse/paho/android/service/MqttService;->p(Ljava/lang/String;)[Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getServerURI()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->n:Lorg/eclipse/paho/client/mqttv3/MqttCallback;

    .line 2
    .line 3
    instance-of v0, v0, Lorg/eclipse/paho/client/mqttv3/MqttCallbackExtended;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "MqttService.reconnect"

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const-string v1, "MqttService.serverURI"

    .line 15
    .line 16
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object v1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->n:Lorg/eclipse/paho/client/mqttv3/MqttCallback;

    .line 21
    .line 22
    check-cast v1, Lorg/eclipse/paho/client/mqttv3/MqttCallbackExtended;

    .line 23
    .line 24
    invoke-interface {v1, v0, p1}, Lorg/eclipse/paho/client/mqttv3/MqttCallbackExtended;->connectComplete(ZLjava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public isConnected()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->e:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->d:Lorg/eclipse/paho/android/service/MqttService;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lorg/eclipse/paho/android/service/MqttService;->q(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public final j(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->n:Lorg/eclipse/paho/client/mqttv3/MqttCallback;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "MqttService.exception"

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/lang/Exception;

    .line 12
    .line 13
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->n:Lorg/eclipse/paho/client/mqttv3/MqttCallback;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Lorg/eclipse/paho/client/mqttv3/MqttCallback;->connectionLost(Ljava/lang/Throwable;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final k(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->e:Ljava/lang/String;

    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->s(Landroid/os/Bundle;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    check-cast p1, Laf/d;

    .line 11
    .line 12
    invoke-virtual {p1}, Laf/d;->a()V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object p1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->n:Lorg/eclipse/paho/client/mqttv3/MqttCallback;

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    invoke-interface {p1, v0}, Lorg/eclipse/paho/client/mqttv3/MqttCallback;->connectionLost(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
.end method

.method public final l()V
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->e:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->d:Lorg/eclipse/paho/android/service/MqttService;

    .line 6
    .line 7
    iget-object v1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->i:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->j:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v3, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->f:Landroid/content/Context;

    .line 12
    .line 13
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v4, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->k:Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2, v3, v4}, Lorg/eclipse/paho/android/service/MqttService;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttClientPersistence;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->e:Ljava/lang/String;

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->d:Lorg/eclipse/paho/android/service/MqttService;

    .line 28
    .line 29
    iget-boolean v1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->q:Z

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lorg/eclipse/paho/android/service/MqttService;->z(Z)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->d:Lorg/eclipse/paho/android/service/MqttService;

    .line 35
    .line 36
    iget-object v1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->e:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lorg/eclipse/paho/android/service/MqttService;->y(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->m:Lorg/eclipse/paho/client/mqttv3/IMqttToken;

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->v(Lorg/eclipse/paho/client/mqttv3/IMqttToken;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :try_start_0
    iget-object v1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->d:Lorg/eclipse/paho/android/service/MqttService;

    .line 48
    .line 49
    iget-object v2, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->e:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v3, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->l:Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;

    .line 52
    .line 53
    const/4 v4, 0x0

    .line 54
    invoke-virtual {v1, v2, v3, v4, v0}, Lorg/eclipse/paho/android/service/MqttService;->h(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/eclipse/paho/client/mqttv3/MqttException; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :catch_0
    move-exception v0

    .line 59
    iget-object v1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->m:Lorg/eclipse/paho/client/mqttv3/IMqttToken;

    .line 60
    .line 61
    invoke-interface {v1}, Lorg/eclipse/paho/client/mqttv3/IMqttToken;->getActionCallback()Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    if-eqz v1, :cond_1

    .line 66
    .line 67
    iget-object v2, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->m:Lorg/eclipse/paho/client/mqttv3/IMqttToken;

    .line 68
    .line 69
    invoke-interface {v1, v2, v0}, Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;->onFailure(Lorg/eclipse/paho/client/mqttv3/IMqttToken;Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    :cond_1
    return-void
.end method

.method public final declared-synchronized m(Landroid/os/Bundle;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "MqttService.activityToken"

    .line 3
    .line 4
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->g:Landroid/util/SparseArray;

    .line 9
    .line 10
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    monitor-exit p0

    .line 21
    return-object p1

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    throw p1
.end method

.method public messageArrivedComplete(II)V
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p1
.end method

.method public final n(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->n:Lorg/eclipse/paho/client/mqttv3/MqttCallback;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const-string v0, "MqttService.messageId"

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "MqttService.destinationName"

    .line 12
    .line 13
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "MqttService.PARCEL"

    .line 18
    .line 19
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Lorg/eclipse/paho/android/service/ParcelableMqttMessage;

    .line 24
    .line 25
    :try_start_0
    iget-object v2, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->p:Lorg/eclipse/paho/android/service/MqttAndroidClient$Ack;

    .line 26
    .line 27
    sget-object v3, Lorg/eclipse/paho/android/service/MqttAndroidClient$Ack;->c:Lorg/eclipse/paho/android/service/MqttAndroidClient$Ack;

    .line 28
    .line 29
    if-ne v2, v3, :cond_0

    .line 30
    .line 31
    iget-object v2, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->n:Lorg/eclipse/paho/client/mqttv3/MqttCallback;

    .line 32
    .line 33
    invoke-interface {v2, v1, p1}, Lorg/eclipse/paho/client/mqttv3/MqttCallback;->messageArrived(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttMessage;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->d:Lorg/eclipse/paho/android/service/MqttService;

    .line 37
    .line 38
    iget-object v1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->e:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {p1, v1, v0}, Lorg/eclipse/paho/android/service/MqttService;->e(Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/paho/android/service/Status;

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    iput-object v0, p1, Lorg/eclipse/paho/android/service/ParcelableMqttMessage;->c:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->n:Lorg/eclipse/paho/client/mqttv3/MqttCallback;

    .line 47
    .line 48
    invoke-interface {v0, v1, p1}, Lorg/eclipse/paho/client/mqttv3/MqttCallback;->messageArrived(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttMessage;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    .line 51
    :catch_0
    :cond_1
    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string p2, "MqttService.clientHandle"

    .line 6
    .line 7
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-eqz p2, :cond_b

    .line 12
    .line 13
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->e:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-nez p2, :cond_0

    .line 20
    .line 21
    goto/16 :goto_0

    .line 22
    .line 23
    :cond_0
    const-string p2, "MqttService.callbackAction"

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    const-string v0, "connect"

    .line 30
    .line 31
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->g(Landroid/os/Bundle;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    const-string v0, "connectExtended"

    .line 42
    .line 43
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    invoke-virtual {p0, p1}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->i(Landroid/os/Bundle;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    const-string v0, "messageArrived"

    .line 54
    .line 55
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    invoke-virtual {p0, p1}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->n(Landroid/os/Bundle;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_3
    const-string v0, "subscribe"

    .line 66
    .line 67
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_4

    .line 72
    .line 73
    invoke-virtual {p0, p1}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->w(Landroid/os/Bundle;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_4
    const-string v0, "unsubscribe"

    .line 78
    .line 79
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_5

    .line 84
    .line 85
    invoke-virtual {p0, p1}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->y(Landroid/os/Bundle;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_5
    const-string v0, "send"

    .line 90
    .line 91
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_6

    .line 96
    .line 97
    invoke-virtual {p0, p1}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->t(Landroid/os/Bundle;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_6
    const-string v0, "messageDelivered"

    .line 102
    .line 103
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_7

    .line 108
    .line 109
    invoke-virtual {p0, p1}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->p(Landroid/os/Bundle;)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :cond_7
    const-string v0, "onConnectionLost"

    .line 114
    .line 115
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-eqz v0, :cond_8

    .line 120
    .line 121
    invoke-virtual {p0, p1}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->j(Landroid/os/Bundle;)V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :cond_8
    const-string v0, "disconnect"

    .line 126
    .line 127
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_9

    .line 132
    .line 133
    invoke-virtual {p0, p1}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->k(Landroid/os/Bundle;)V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :cond_9
    const-string v0, "trace"

    .line 138
    .line 139
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result p2

    .line 143
    if-eqz p2, :cond_a

    .line 144
    .line 145
    invoke-virtual {p0, p1}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->x(Landroid/os/Bundle;)V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :cond_a
    iget-object p1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->d:Lorg/eclipse/paho/android/service/MqttService;

    .line 150
    .line 151
    const-string p2, "MqttService"

    .line 152
    .line 153
    const-string v0, "Callback action doesn\'t exist."

    .line 154
    .line 155
    invoke-virtual {p1, p2, v0}, Lorg/eclipse/paho/android/service/MqttService;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    :cond_b
    :goto_0
    return-void
.end method

.method public final p(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->s(Landroid/os/Bundle;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->n:Lorg/eclipse/paho/client/mqttv3/MqttCallback;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const-string v1, "MqttService.callbackStatus"

    .line 12
    .line 13
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lorg/eclipse/paho/android/service/Status;

    .line 18
    .line 19
    sget-object v1, Lorg/eclipse/paho/android/service/Status;->c:Lorg/eclipse/paho/android/service/Status;

    .line 20
    .line 21
    if-ne p1, v1, :cond_0

    .line 22
    .line 23
    instance-of p1, v0, Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    iget-object p1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->n:Lorg/eclipse/paho/client/mqttv3/MqttCallback;

    .line 28
    .line 29
    check-cast v0, Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;

    .line 30
    .line 31
    invoke-interface {p1, v0}, Lorg/eclipse/paho/client/mqttv3/MqttCallback;->deliveryComplete(Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method public publish(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttMessage;)Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, v0, v0}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->publish(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttMessage;Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;

    move-result-object p1

    return-object p1
.end method

.method public publish(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttMessage;Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;
    .locals 7

    .line 10
    new-instance v0, Laf/b;

    invoke-direct {v0, p0, p3, p4, p2}, Laf/b;-><init>(Lorg/eclipse/paho/android/service/MqttAndroidClient;Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;Lorg/eclipse/paho/client/mqttv3/MqttMessage;)V

    .line 11
    invoke-virtual {p0, v0}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->v(Lorg/eclipse/paho/client/mqttv3/IMqttToken;)Ljava/lang/String;

    move-result-object v6

    .line 12
    iget-object v1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->d:Lorg/eclipse/paho/android/service/MqttService;

    iget-object v2, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->e:Ljava/lang/String;

    const/4 v5, 0x0

    move-object v3, p1

    move-object v4, p2

    invoke-virtual/range {v1 .. v6}, Lorg/eclipse/paho/android/service/MqttService;->t(Ljava/lang/String;Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttMessage;Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;

    move-result-object p1

    .line 13
    invoke-virtual {v0, p1}, Laf/d;->c(Lorg/eclipse/paho/client/mqttv3/IMqttToken;)V

    return-object v0
.end method

.method public publish(Ljava/lang/String;[BIZ)Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;
    .locals 7

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    .line 1
    invoke-virtual/range {v0 .. v6}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->publish(Ljava/lang/String;[BIZLjava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;

    move-result-object p1

    return-object p1
.end method

.method public publish(Ljava/lang/String;[BIZLjava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;
    .locals 10

    .line 3
    new-instance v0, Lorg/eclipse/paho/client/mqttv3/MqttMessage;

    invoke-direct {v0, p2}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;-><init>([B)V

    .line 4
    invoke-virtual {v0, p3}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->setQos(I)V

    .line 5
    invoke-virtual {v0, p4}, Lorg/eclipse/paho/client/mqttv3/MqttMessage;->setRetained(Z)V

    .line 6
    new-instance v1, Laf/b;

    move-object/from16 v2, p6

    invoke-direct {v1, p0, p5, v2, v0}, Laf/b;-><init>(Lorg/eclipse/paho/android/service/MqttAndroidClient;Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;Lorg/eclipse/paho/client/mqttv3/MqttMessage;)V

    .line 7
    invoke-virtual {p0, v1}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->v(Lorg/eclipse/paho/client/mqttv3/IMqttToken;)Ljava/lang/String;

    move-result-object v9

    .line 8
    iget-object v2, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->d:Lorg/eclipse/paho/android/service/MqttService;

    iget-object v3, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->e:Ljava/lang/String;

    const/4 v8, 0x0

    move-object v4, p1

    move-object v5, p2

    move v6, p3

    move v7, p4

    invoke-virtual/range {v2 .. v9}, Lorg/eclipse/paho/android/service/MqttService;->u(Ljava/lang/String;Ljava/lang/String;[BIZLjava/lang/String;Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;

    move-result-object p1

    .line 9
    invoke-virtual {v1, p1}, Laf/d;->c(Lorg/eclipse/paho/client/mqttv3/IMqttToken;)V

    return-object v1
.end method

.method public final r(Landroid/content/BroadcastReceiver;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/content/IntentFilter;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "MqttService.callbackToActivity.v0"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->f:Landroid/content/Context;

    .line 12
    .line 13
    invoke-static {v1}, Landroidx/localbroadcastmanager/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroidx/localbroadcastmanager/content/LocalBroadcastManager;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1, p1, v0}, Landroidx/localbroadcastmanager/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    iput-boolean p1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->r:Z

    .line 22
    .line 23
    return-void
.end method

.method public final declared-synchronized s(Landroid/os/Bundle;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "MqttService.activityToken"

    .line 3
    .line 4
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->g:Landroid/util/SparseArray;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lorg/eclipse/paho/client/mqttv3/IMqttToken;

    .line 21
    .line 22
    iget-object v1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->g:Landroid/util/SparseArray;

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->delete(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    monitor-exit p0

    .line 28
    return-object v0

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    monitor-exit p0

    .line 32
    const/4 p1, 0x0

    .line 33
    return-object p1

    .line 34
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    throw p1
.end method

.method public setBufferOpts(Lorg/eclipse/paho/client/mqttv3/DisconnectedBufferOptions;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->d:Lorg/eclipse/paho/android/service/MqttService;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->e:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Lorg/eclipse/paho/android/service/MqttService;->x(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/DisconnectedBufferOptions;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setCallback(Lorg/eclipse/paho/client/mqttv3/MqttCallback;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->n:Lorg/eclipse/paho/client/mqttv3/MqttCallback;

    .line 2
    .line 3
    return-void
.end method

.method public setManualAcks(Z)V
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p1
.end method

.method public subscribe(Ljava/lang/String;I)Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, v0, v0}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->subscribe(Ljava/lang/String;ILjava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;

    move-result-object p1

    return-object p1
.end method

.method public subscribe(Ljava/lang/String;ILjava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    .locals 8

    .line 3
    new-instance v0, Laf/d;

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, p3, p4, v1}, Laf/d;-><init>(Lorg/eclipse/paho/android/service/MqttAndroidClient;Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;[Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0, v0}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->v(Lorg/eclipse/paho/client/mqttv3/IMqttToken;)Ljava/lang/String;

    move-result-object v7

    .line 5
    iget-object v2, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->d:Lorg/eclipse/paho/android/service/MqttService;

    iget-object v3, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->e:Ljava/lang/String;

    const/4 v6, 0x0

    move-object v4, p1

    move v5, p2

    invoke-virtual/range {v2 .. v7}, Lorg/eclipse/paho/android/service/MqttService;->A(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public subscribe(Ljava/lang/String;ILjava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;Lorg/eclipse/paho/client/mqttv3/IMqttMessageListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    .locals 6

    .line 9
    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v1

    filled-new-array {p2}, [I

    move-result-object v2

    const/4 p1, 0x1

    new-array v5, p1, [Lorg/eclipse/paho/client/mqttv3/IMqttMessageListener;

    const/4 p1, 0x0

    aput-object p5, v5, p1

    move-object v0, p0

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->subscribe([Ljava/lang/String;[ILjava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;[Lorg/eclipse/paho/client/mqttv3/IMqttMessageListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;

    move-result-object p1

    return-object p1
.end method

.method public subscribe(Ljava/lang/String;ILorg/eclipse/paho/client/mqttv3/IMqttMessageListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    .locals 6

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v5, p3

    .line 10
    invoke-virtual/range {v0 .. v5}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->subscribe(Ljava/lang/String;ILjava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;Lorg/eclipse/paho/client/mqttv3/IMqttMessageListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;

    move-result-object p1

    return-object p1
.end method

.method public subscribe([Ljava/lang/String;[I)Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, v0, v0}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->subscribe([Ljava/lang/String;[ILjava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;

    move-result-object p1

    return-object p1
.end method

.method public subscribe([Ljava/lang/String;[ILjava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    .locals 7

    .line 6
    new-instance v0, Laf/d;

    invoke-direct {v0, p0, p3, p4, p1}, Laf/d;-><init>(Lorg/eclipse/paho/android/service/MqttAndroidClient;Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;[Ljava/lang/String;)V

    .line 7
    invoke-virtual {p0, v0}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->v(Lorg/eclipse/paho/client/mqttv3/IMqttToken;)Ljava/lang/String;

    move-result-object v6

    .line 8
    iget-object v1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->d:Lorg/eclipse/paho/android/service/MqttService;

    iget-object v2, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->e:Ljava/lang/String;

    const/4 v5, 0x0

    move-object v3, p1

    move-object v4, p2

    invoke-virtual/range {v1 .. v6}, Lorg/eclipse/paho/android/service/MqttService;->B(Ljava/lang/String;[Ljava/lang/String;[ILjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public subscribe([Ljava/lang/String;[ILjava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;[Lorg/eclipse/paho/client/mqttv3/IMqttMessageListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    .locals 8

    .line 12
    new-instance v0, Laf/d;

    invoke-direct {v0, p0, p3, p4, p1}, Laf/d;-><init>(Lorg/eclipse/paho/android/service/MqttAndroidClient;Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;[Ljava/lang/String;)V

    .line 13
    invoke-virtual {p0, v0}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->v(Lorg/eclipse/paho/client/mqttv3/IMqttToken;)Ljava/lang/String;

    move-result-object v6

    .line 14
    iget-object v1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->d:Lorg/eclipse/paho/android/service/MqttService;

    iget-object v2, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->e:Ljava/lang/String;

    const/4 v5, 0x0

    move-object v3, p1

    move-object v4, p2

    move-object v7, p5

    invoke-virtual/range {v1 .. v7}, Lorg/eclipse/paho/android/service/MqttService;->C(Ljava/lang/String;[Ljava/lang/String;[ILjava/lang/String;Ljava/lang/String;[Lorg/eclipse/paho/client/mqttv3/IMqttMessageListener;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public subscribe([Ljava/lang/String;[I[Lorg/eclipse/paho/client/mqttv3/IMqttMessageListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    .locals 6

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p3

    .line 11
    invoke-virtual/range {v0 .. v5}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->subscribe([Ljava/lang/String;[ILjava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;[Lorg/eclipse/paho/client/mqttv3/IMqttMessageListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;

    move-result-object p1

    return-object p1
.end method

.method public final t(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->m(Landroid/os/Bundle;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0, p1}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->u(Lorg/eclipse/paho/client/mqttv3/IMqttToken;Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final u(Lorg/eclipse/paho/client/mqttv3/IMqttToken;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    const-string v0, "MqttService.callbackStatus"

    .line 4
    .line 5
    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lorg/eclipse/paho/android/service/Status;

    .line 10
    .line 11
    sget-object v1, Lorg/eclipse/paho/android/service/Status;->c:Lorg/eclipse/paho/android/service/Status;

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    check-cast p1, Laf/d;

    .line 16
    .line 17
    invoke-virtual {p1}, Laf/d;->a()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const-string v0, "MqttService.exception"

    .line 22
    .line 23
    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    check-cast p2, Ljava/lang/Exception;

    .line 28
    .line 29
    check-cast p1, Laf/d;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Laf/d;->b(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    iget-object p1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->d:Lorg/eclipse/paho/android/service/MqttService;

    .line 36
    .line 37
    const-string p2, "MqttService"

    .line 38
    .line 39
    const-string v0, "simpleAction : token is null"

    .line 40
    .line 41
    invoke-virtual {p1, p2, v0}, Lorg/eclipse/paho/android/service/MqttService;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public unsubscribe(Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0, v0}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->unsubscribe(Ljava/lang/String;Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;

    move-result-object p1

    return-object p1
.end method

.method public unsubscribe(Ljava/lang/String;Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    .locals 3

    .line 3
    new-instance v0, Laf/d;

    invoke-direct {v0, p0, p2, p3}, Laf/d;-><init>(Lorg/eclipse/paho/android/service/MqttAndroidClient;Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)V

    .line 4
    invoke-virtual {p0, v0}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->v(Lorg/eclipse/paho/client/mqttv3/IMqttToken;)Ljava/lang/String;

    move-result-object p2

    .line 5
    iget-object p3, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->d:Lorg/eclipse/paho/android/service/MqttService;

    iget-object v1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->e:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {p3, v1, p1, v2, p2}, Lorg/eclipse/paho/android/service/MqttService;->F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public unsubscribe([Ljava/lang/String;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0, v0}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->unsubscribe([Ljava/lang/String;Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;

    move-result-object p1

    return-object p1
.end method

.method public unsubscribe([Ljava/lang/String;Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    .locals 3

    .line 6
    new-instance v0, Laf/d;

    invoke-direct {v0, p0, p2, p3}, Laf/d;-><init>(Lorg/eclipse/paho/android/service/MqttAndroidClient;Ljava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)V

    .line 7
    invoke-virtual {p0, v0}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->v(Lorg/eclipse/paho/client/mqttv3/IMqttToken;)Ljava/lang/String;

    move-result-object p2

    .line 8
    iget-object p3, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->d:Lorg/eclipse/paho/android/service/MqttService;

    iget-object v1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->e:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {p3, v1, p1, v2, p2}, Lorg/eclipse/paho/android/service/MqttService;->G(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final declared-synchronized v(Lorg/eclipse/paho/client/mqttv3/IMqttToken;)Ljava/lang/String;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->g:Landroid/util/SparseArray;

    .line 3
    .line 4
    iget v1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->h:I

    .line 5
    .line 6
    invoke-virtual {v0, v1, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->h:I

    .line 10
    .line 11
    add-int/lit8 v0, p1, 0x1

    .line 12
    .line 13
    iput v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->h:I

    .line 14
    .line 15
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    monitor-exit p0

    .line 20
    return-object p1

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw p1
.end method

.method public final w(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->s(Landroid/os/Bundle;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0, p1}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->u(Lorg/eclipse/paho/client/mqttv3/IMqttToken;Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final x(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->o:Laf/e;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    const-string v0, "MqttService.traceSeverity"

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "MqttService.errorMessage"

    .line 12
    .line 13
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "MqttService.traceTag"

    .line 18
    .line 19
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const-string v3, "debug"

    .line 24
    .line 25
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    iget-object p1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->o:Laf/e;

    .line 32
    .line 33
    invoke-interface {p1, v2, v1}, Laf/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    const-string v3, "error"

    .line 38
    .line 39
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    iget-object p1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->o:Laf/e;

    .line 46
    .line 47
    invoke-interface {p1, v2, v1}, Laf/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    const-string v0, "MqttService.exception"

    .line 52
    .line 53
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, Ljava/lang/Exception;

    .line 58
    .line 59
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->o:Laf/e;

    .line 60
    .line 61
    invoke-interface {v0, v2, v1, p1}, Laf/e;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 62
    .line 63
    .line 64
    :cond_2
    return-void
.end method

.method public final y(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->s(Landroid/os/Bundle;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0, p1}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->u(Lorg/eclipse/paho/client/mqttv3/IMqttToken;Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public z()V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->f:Landroid/content/Context;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->r:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    monitor-enter p0

    .line 10
    :try_start_0
    iget-object v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->f:Landroid/content/Context;

    .line 11
    .line 12
    invoke-static {v0}, Landroidx/localbroadcastmanager/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroidx/localbroadcastmanager/content/LocalBroadcastManager;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0, p0}, Landroidx/localbroadcastmanager/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->r:Z

    .line 21
    .line 22
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    iget-boolean v1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->s:Z

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    :try_start_1
    iget-object v1, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->f:Landroid/content/Context;

    .line 28
    .line 29
    iget-object v2, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->c:Lorg/eclipse/paho/android/service/MqttAndroidClient$b;

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 32
    .line 33
    .line 34
    iput-boolean v0, p0, Lorg/eclipse/paho/android/service/MqttAndroidClient;->s:Z
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    .line 35
    .line 36
    return-void

    .line 37
    :catchall_0
    move-exception v0

    .line 38
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 39
    throw v0

    .line 40
    :catch_0
    :cond_0
    return-void
.end method
