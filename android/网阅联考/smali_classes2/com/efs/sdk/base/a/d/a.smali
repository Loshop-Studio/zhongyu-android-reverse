.class public final Lcom/efs/sdk/base/a/d/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# static fields
.field public static a:Lcom/efs/sdk/base/a/c/a;


# instance fields
.field private b:I

.field private final c:I

.field private final d:I

.field private final e:I

.field private final f:I

.field private volatile g:Z

.field private h:Lcom/efs/sdk/base/a/d/a/a;

.field private i:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Lcom/efs/sdk/base/EfsReporter$Builder;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/efs/sdk/base/a/d/a;->b:I

    .line 6
    .line 7
    iput v0, p0, Lcom/efs/sdk/base/a/d/a;->c:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    iput v1, p0, Lcom/efs/sdk/base/a/d/a;->d:I

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    iput v1, p0, Lcom/efs/sdk/base/a/d/a;->e:I

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    iput v1, p0, Lcom/efs/sdk/base/a/d/a;->f:I

    .line 17
    .line 18
    iput-boolean v0, p0, Lcom/efs/sdk/base/a/d/a;->g:Z

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/efs/sdk/base/EfsReporter$Builder;->getGlobalEnvStruct()Lcom/efs/sdk/base/a/c/a;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    sput-object p1, Lcom/efs/sdk/base/a/d/a;->a:Lcom/efs/sdk/base/a/c/a;

    .line 25
    .line 26
    new-instance p1, Landroid/os/Handler;

    .line 27
    .line 28
    sget-object v1, Lcom/efs/sdk/base/a/h/a/a;->a:Landroid/os/HandlerThread;

    .line 29
    .line 30
    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-direct {p1, v1, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lcom/efs/sdk/base/a/d/a;->i:Landroid/os/Handler;

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public static a()Lcom/efs/sdk/base/a/c/a;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/efs/sdk/base/a/d/a;->a:Lcom/efs/sdk/base/a/c/a;

    return-object v0
.end method

.method public static a(Ljava/lang/String;ILjava/lang/String;ZLjava/io/File;)Lcom/efs/sdk/base/http/HttpResponse;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 8
    new-instance v0, Lcom/efs/sdk/base/a/f/b;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lcom/efs/sdk/base/a/f/b;-><init>(Ljava/lang/String;B)V

    const/4 p0, 0x1

    .line 9
    invoke-virtual {v0, p0}, Lcom/efs/sdk/base/a/f/b;->b(I)V

    .line 10
    iput-object p4, v0, Lcom/efs/sdk/base/a/f/b;->d:Ljava/io/File;

    .line 11
    invoke-virtual {v0, p2}, Lcom/efs/sdk/base/a/f/b;->a(Ljava/lang/String;)V

    .line 12
    invoke-virtual {v0, p1}, Lcom/efs/sdk/base/a/f/b;->a(I)V

    .line 13
    iget-object p0, v0, Lcom/efs/sdk/base/a/f/b;->b:Lcom/efs/sdk/base/a/f/c;

    iput-boolean p3, p0, Lcom/efs/sdk/base/a/f/c;->b:Z

    .line 14
    invoke-virtual {v0}, Lcom/efs/sdk/base/a/f/b;->d()V

    .line 15
    invoke-static {}, Lcom/efs/sdk/base/a/g/d$a;->a()Lcom/efs/sdk/base/a/g/d;

    move-result-object p0

    .line 16
    iget-object p0, p0, Lcom/efs/sdk/base/a/g/d;->a:Lcom/efs/sdk/base/a/g/a;

    invoke-virtual {p0, v0}, Lcom/efs/sdk/base/a/g/a;->a(Lcom/efs/sdk/base/a/f/b;)V

    .line 17
    iget-object p0, v0, Lcom/efs/sdk/base/a/f/b;->b:Lcom/efs/sdk/base/a/f/c;

    iget-object p0, p0, Lcom/efs/sdk/base/a/f/c;->c:Lcom/efs/sdk/base/http/HttpResponse;

    return-object p0
.end method

.method private b()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/efs/sdk/base/a/d/a;->h:Lcom/efs/sdk/base/a/d/a/a;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/efs/sdk/base/a/d/a/a;

    invoke-direct {v0}, Lcom/efs/sdk/base/a/d/a/a;-><init>()V

    iput-object v0, p0, Lcom/efs/sdk/base/a/d/a;->h:Lcom/efs/sdk/base/a/d/a/a;

    .line 3
    :cond_0
    :try_start_0
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 4
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 5
    sget-object v1, Lcom/efs/sdk/base/a/d/a;->a:Lcom/efs/sdk/base/a/c/a;

    iget-object v1, v1, Lcom/efs/sdk/base/a/c/a;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/efs/sdk/base/a/d/a;->h:Lcom/efs/sdk/base/a/d/a/a;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    const-string v1, "efs.base"

    const-string v2, "register network change receiver error"

    .line 6
    invoke-static {v1, v2, v0}, Lcom/efs/sdk/base/a/h/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 7
    iget v0, p0, Lcom/efs/sdk/base/a/d/a;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/efs/sdk/base/a/d/a;->b:I

    const/4 v1, 0x3

    if-ge v0, v1, :cond_1

    .line 8
    iget-object v0, p0, Lcom/efs/sdk/base/a/d/a;->i:Landroid/os/Handler;

    const-wide/16 v2, 0x1770

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_1
    return-void
.end method

.method public static synthetic b(Lcom/efs/sdk/base/protocol/ILogProtocol;)V
    .locals 6

    .line 9
    sget-object v0, Lcom/efs/sdk/base/a/d/a;->a:Lcom/efs/sdk/base/a/c/a;

    const/16 v1, 0x9

    .line 10
    invoke-virtual {v0, v1}, Lcom/efs/sdk/base/a/c/a;->a(I)Ljava/util/List;

    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/webkit/ValueCallback;

    .line 12
    new-instance v3, Ljava/util/HashMap;

    const/4 v4, 0x4

    invoke-direct {v3, v4}, Ljava/util/HashMap;-><init>(I)V

    .line 13
    invoke-interface {p0}, Lcom/efs/sdk/base/protocol/ILogProtocol;->getLogType()Ljava/lang/String;

    move-result-object v4

    const-string v5, "log_type"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "log_data"

    .line 14
    invoke-interface {p0}, Lcom/efs/sdk/base/protocol/ILogProtocol;->generateString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "link_key"

    .line 15
    invoke-interface {p0}, Lcom/efs/sdk/base/protocol/ILogProtocol;->getLinkKey()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "link_id"

    .line 16
    invoke-interface {p0}, Lcom/efs/sdk/base/protocol/ILogProtocol;->getLinkId()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v4, 0x0

    .line 17
    invoke-static {v4, v1, v3}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v3

    .line 18
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 19
    new-instance v5, Landroid/util/Pair;

    invoke-direct {v5, v3, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v2, v5}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 20
    invoke-virtual {v3}, Landroid/os/Message;->recycle()V

    .line 21
    invoke-virtual {v4}, Landroid/os/Message;->recycle()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private c(Lcom/efs/sdk/base/protocol/ILogProtocol;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Lcom/efs/sdk/base/a/d/a$1;

    .line 5
    .line 6
    invoke-direct {v0, p0, p1}, Lcom/efs/sdk/base/a/d/a$1;-><init>(Lcom/efs/sdk/base/a/d/a;Lcom/efs/sdk/base/protocol/ILogProtocol;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lcom/efs/sdk/base/a/h/a/d;->a(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Lcom/efs/sdk/base/protocol/ILogProtocol;)V
    .locals 2

    .line 2
    iget-boolean v0, p0, Lcom/efs/sdk/base/a/d/a;->g:Z

    if-nez v0, :cond_0

    .line 3
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    const/4 v1, 0x1

    .line 4
    iput v1, v0, Landroid/os/Message;->what:I

    .line 5
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 6
    iget-object p1, p0, Lcom/efs/sdk/base/a/d/a;->i:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void

    .line 7
    :cond_0
    invoke-direct {p0, p1}, Lcom/efs/sdk/base/a/d/a;->c(Lcom/efs/sdk/base/protocol/ILogProtocol;)V

    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 6
    .param p1    # Landroid/os/Message;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    const/4 p1, 0x3

    .line 9
    if-eq v0, p1, :cond_0

    .line 10
    .line 11
    goto/16 :goto_3

    .line 12
    .line 13
    :cond_0
    invoke-direct {p0}, Lcom/efs/sdk/base/a/d/a;->b()V

    .line 14
    .line 15
    .line 16
    goto/16 :goto_3

    .line 17
    .line 18
    :cond_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 19
    .line 20
    if-eqz p1, :cond_7

    .line 21
    .line 22
    instance-of v0, p1, Lcom/efs/sdk/base/protocol/ILogProtocol;

    .line 23
    .line 24
    if-eqz v0, :cond_7

    .line 25
    .line 26
    check-cast p1, Lcom/efs/sdk/base/protocol/ILogProtocol;

    .line 27
    .line 28
    invoke-direct {p0, p1}, Lcom/efs/sdk/base/a/d/a;->c(Lcom/efs/sdk/base/protocol/ILogProtocol;)V

    .line 29
    .line 30
    .line 31
    goto/16 :goto_3

    .line 32
    .line 33
    :cond_2
    invoke-static {}, Lcom/efs/sdk/base/a/c/c$a;->a()Lcom/efs/sdk/base/a/c/c;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance v0, Lcom/efs/sdk/base/a/c/b;

    .line 38
    .line 39
    invoke-direct {v0}, Lcom/efs/sdk/base/a/c/b;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v0, p1, Lcom/efs/sdk/base/a/c/c;->a:Lcom/efs/sdk/base/a/c/b;

    .line 43
    .line 44
    sget-object v2, Lcom/efs/sdk/base/a/d/a;->a:Lcom/efs/sdk/base/a/c/a;

    .line 45
    .line 46
    iget-object v2, v2, Lcom/efs/sdk/base/a/c/a;->a:Ljava/lang/String;

    .line 47
    .line 48
    const-string v3, "appid"

    .line 49
    .line 50
    invoke-virtual {v0, v3, v2}, Lcom/efs/sdk/base/a/c/b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-static {}, Lcom/efs/sdk/base/a/h/g;->a()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    iget-object v2, p1, Lcom/efs/sdk/base/a/c/c;->a:Lcom/efs/sdk/base/a/c/b;

    .line 58
    .line 59
    const-string v3, "pid"

    .line 60
    .line 61
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-virtual {v2, v3, v4}, Lcom/efs/sdk/base/a/c/b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object v2, p1, Lcom/efs/sdk/base/a/c/c;->a:Lcom/efs/sdk/base/a/c/b;

    .line 69
    .line 70
    const-string v3, "ps"

    .line 71
    .line 72
    invoke-static {v0}, Lcom/efs/sdk/base/a/h/g;->a(I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v2, v3, v0}, Lcom/efs/sdk/base/a/c/b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p1, Lcom/efs/sdk/base/a/c/c;->b:Landroid/content/Context;

    .line 80
    .line 81
    invoke-static {v0}, Lcom/efs/sdk/base/a/h/h;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iget-object v2, p1, Lcom/efs/sdk/base/a/c/c;->a:Lcom/efs/sdk/base/a/c/b;

    .line 86
    .line 87
    const-string v3, "wid"

    .line 88
    .line 89
    invoke-virtual {v2, v3, v0}, Lcom/efs/sdk/base/a/c/b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    sget-object v2, Lcom/efs/sdk/base/a/d/a;->a:Lcom/efs/sdk/base/a/c/a;

    .line 93
    .line 94
    iget-object v2, v2, Lcom/efs/sdk/base/a/c/a;->h:Ljava/lang/String;

    .line 95
    .line 96
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    const-string v3, "uid"

    .line 101
    .line 102
    if-eqz v2, :cond_3

    .line 103
    .line 104
    iget-object v2, p1, Lcom/efs/sdk/base/a/c/c;->a:Lcom/efs/sdk/base/a/c/b;

    .line 105
    .line 106
    invoke-virtual {v2, v3, v0}, Lcom/efs/sdk/base/a/c/b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_3
    iget-object v0, p1, Lcom/efs/sdk/base/a/c/c;->a:Lcom/efs/sdk/base/a/c/b;

    .line 111
    .line 112
    sget-object v2, Lcom/efs/sdk/base/a/d/a;->a:Lcom/efs/sdk/base/a/c/a;

    .line 113
    .line 114
    iget-object v2, v2, Lcom/efs/sdk/base/a/c/a;->h:Ljava/lang/String;

    .line 115
    .line 116
    invoke-virtual {v0, v3, v2}, Lcom/efs/sdk/base/a/c/b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    :goto_0
    iget-object v0, p1, Lcom/efs/sdk/base/a/c/c;->a:Lcom/efs/sdk/base/a/c/b;

    .line 120
    .line 121
    invoke-static {}, Lcom/efs/sdk/base/a/a/a;->a()Lcom/efs/sdk/base/a/a/a;

    .line 122
    .line 123
    .line 124
    invoke-static {}, Lcom/efs/sdk/base/a/a/a;->b()J

    .line 125
    .line 126
    .line 127
    move-result-wide v2

    .line 128
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 129
    .line 130
    .line 131
    move-result-wide v4

    .line 132
    sub-long/2addr v2, v4

    .line 133
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    const-string v3, "stime"

    .line 138
    .line 139
    invoke-virtual {v0, v3, v2}, Lcom/efs/sdk/base/a/c/b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    iget-object v0, p1, Lcom/efs/sdk/base/a/c/c;->a:Lcom/efs/sdk/base/a/c/b;

    .line 143
    .line 144
    iget-object v2, p1, Lcom/efs/sdk/base/a/c/c;->b:Landroid/content/Context;

    .line 145
    .line 146
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    const-string v3, "pkg"

    .line 151
    .line 152
    invoke-virtual {v0, v3, v2}, Lcom/efs/sdk/base/a/c/b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    iget-object v0, p1, Lcom/efs/sdk/base/a/c/c;->a:Lcom/efs/sdk/base/a/c/b;

    .line 156
    .line 157
    iget-object v2, p1, Lcom/efs/sdk/base/a/c/c;->b:Landroid/content/Context;

    .line 158
    .line 159
    invoke-static {v2}, Lcom/efs/sdk/base/a/h/f;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    const-string v3, "ver"

    .line 164
    .line 165
    invoke-virtual {v0, v3, v2}, Lcom/efs/sdk/base/a/c/b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    iget-object v0, p1, Lcom/efs/sdk/base/a/c/c;->a:Lcom/efs/sdk/base/a/c/b;

    .line 169
    .line 170
    iget-object v2, p1, Lcom/efs/sdk/base/a/c/c;->b:Landroid/content/Context;

    .line 171
    .line 172
    invoke-static {v2}, Lcom/efs/sdk/base/a/h/f;->b(Landroid/content/Context;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    const-string v3, "vcode"

    .line 177
    .line 178
    invoke-virtual {v0, v3, v2}, Lcom/efs/sdk/base/a/c/b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    iget-object v0, p1, Lcom/efs/sdk/base/a/c/c;->a:Lcom/efs/sdk/base/a/c/b;

    .line 182
    .line 183
    const-string v2, "sdk_ver"

    .line 184
    .line 185
    const-string v3, "1.3.3.umeng"

    .line 186
    .line 187
    invoke-virtual {v0, v2, v3}, Lcom/efs/sdk/base/a/c/b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    iget-object v0, p1, Lcom/efs/sdk/base/a/c/c;->a:Lcom/efs/sdk/base/a/c/b;

    .line 191
    .line 192
    sget-object v2, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 193
    .line 194
    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    const-string v3, "brand"

    .line 199
    .line 200
    invoke-virtual {v0, v3, v2}, Lcom/efs/sdk/base/a/c/b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    iget-object v0, p1, Lcom/efs/sdk/base/a/c/c;->a:Lcom/efs/sdk/base/a/c/b;

    .line 204
    .line 205
    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 206
    .line 207
    if-nez v2, :cond_4

    .line 208
    .line 209
    const-string v2, "unknown"

    .line 210
    .line 211
    goto :goto_1

    .line 212
    :cond_4
    const-string v3, " "

    .line 213
    .line 214
    const-string v4, "-"

    .line 215
    .line 216
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    const-string v3, "_"

    .line 221
    .line 222
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    :goto_1
    const-string v3, "model"

    .line 231
    .line 232
    invoke-virtual {v0, v3, v2}, Lcom/efs/sdk/base/a/c/b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    iget-object v0, p1, Lcom/efs/sdk/base/a/c/c;->b:Landroid/content/Context;

    .line 236
    .line 237
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    iget-object v2, p1, Lcom/efs/sdk/base/a/c/c;->a:Lcom/efs/sdk/base/a/c/b;

    .line 246
    .line 247
    iget v3, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 248
    .line 249
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    const-string v4, "dsp_w"

    .line 254
    .line 255
    invoke-virtual {v2, v4, v3}, Lcom/efs/sdk/base/a/c/b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    iget-object v2, p1, Lcom/efs/sdk/base/a/c/c;->a:Lcom/efs/sdk/base/a/c/b;

    .line 259
    .line 260
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 261
    .line 262
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    const-string v3, "dsp_h"

    .line 267
    .line 268
    invoke-virtual {v2, v3, v0}, Lcom/efs/sdk/base/a/c/b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    iget-object v0, p1, Lcom/efs/sdk/base/a/c/c;->a:Lcom/efs/sdk/base/a/c/b;

    .line 272
    .line 273
    const-string v2, "fr"

    .line 274
    .line 275
    const-string v3, "android"

    .line 276
    .line 277
    invoke-virtual {v0, v2, v3}, Lcom/efs/sdk/base/a/c/b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    iget-object v0, p1, Lcom/efs/sdk/base/a/c/c;->a:Lcom/efs/sdk/base/a/c/b;

    .line 281
    .line 282
    const-string v2, "rom"

    .line 283
    .line 284
    sget-object v3, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 285
    .line 286
    invoke-virtual {v0, v2, v3}, Lcom/efs/sdk/base/a/c/b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    iget-object v0, p1, Lcom/efs/sdk/base/a/c/c;->a:Lcom/efs/sdk/base/a/c/b;

    .line 290
    .line 291
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 292
    .line 293
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    const-string v3, "sdk"

    .line 298
    .line 299
    invoke-virtual {v0, v3, v2}, Lcom/efs/sdk/base/a/c/b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    iget-object v0, p1, Lcom/efs/sdk/base/a/c/c;->a:Lcom/efs/sdk/base/a/c/b;

    .line 303
    .line 304
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    const-string v3, "lang"

    .line 313
    .line 314
    invoke-virtual {v0, v3, v2}, Lcom/efs/sdk/base/a/c/b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    iget-object v0, p1, Lcom/efs/sdk/base/a/c/c;->a:Lcom/efs/sdk/base/a/c/b;

    .line 318
    .line 319
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    invoke-virtual {v2}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v2

    .line 327
    const-string v3, "tzone"

    .line 328
    .line 329
    invoke-virtual {v0, v3, v2}, Lcom/efs/sdk/base/a/c/b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    iget-object v0, p1, Lcom/efs/sdk/base/a/c/c;->a:Lcom/efs/sdk/base/a/c/b;

    .line 333
    .line 334
    iget-object p1, p1, Lcom/efs/sdk/base/a/c/c;->b:Landroid/content/Context;

    .line 335
    .line 336
    invoke-static {p1}, Lcom/efs/sdk/base/a/h/e;->b(Landroid/content/Context;)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    const-string v2, "net"

    .line 341
    .line 342
    invoke-virtual {v0, v2, p1}, Lcom/efs/sdk/base/a/c/b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 343
    .line 344
    .line 345
    invoke-static {}, Lcom/efs/sdk/base/a/e/f$a;->a()Lcom/efs/sdk/base/a/e/f;

    .line 346
    .line 347
    .line 348
    invoke-static {}, Lcom/efs/sdk/base/a/c/a/c;->a()Lcom/efs/sdk/base/a/c/a/c;

    .line 349
    .line 350
    .line 351
    move-result-object p1

    .line 352
    invoke-virtual {p1}, Lcom/efs/sdk/base/a/c/a/c;->b()V

    .line 353
    .line 354
    .line 355
    invoke-direct {p0}, Lcom/efs/sdk/base/a/d/a;->b()V

    .line 356
    .line 357
    .line 358
    invoke-static {}, Lcom/efs/sdk/base/a/i/f$a;->a()Lcom/efs/sdk/base/a/i/f;

    .line 359
    .line 360
    .line 361
    move-result-object p1

    .line 362
    sget-object v0, Lcom/efs/sdk/base/a/d/a;->a:Lcom/efs/sdk/base/a/c/a;

    .line 363
    .line 364
    iget-boolean v0, v0, Lcom/efs/sdk/base/a/c/a;->i:Z

    .line 365
    .line 366
    iget-object v2, p1, Lcom/efs/sdk/base/a/i/f;->a:Lcom/efs/sdk/base/a/i/c;

    .line 367
    .line 368
    if-eqz v0, :cond_5

    .line 369
    .line 370
    const-string v0, "https://errlogos.umeng.com/api/crashsdk/logcollect"

    .line 371
    .line 372
    iput-object v0, v2, Lcom/efs/sdk/base/a/i/c;->a:Ljava/lang/String;

    .line 373
    .line 374
    const-string v0, "4ea4e41a3993"

    .line 375
    .line 376
    iput-object v0, v2, Lcom/efs/sdk/base/a/i/c;->b:Ljava/lang/String;

    .line 377
    .line 378
    goto :goto_2

    .line 379
    :cond_5
    const-string v0, "https://errlog.umeng.com/api/crashsdk/logcollect"

    .line 380
    .line 381
    iput-object v0, v2, Lcom/efs/sdk/base/a/i/c;->a:Ljava/lang/String;

    .line 382
    .line 383
    const-string v0, "28ef1713347d"

    .line 384
    .line 385
    iput-object v0, v2, Lcom/efs/sdk/base/a/i/c;->b:Ljava/lang/String;

    .line 386
    .line 387
    :goto_2
    iput-object p0, p1, Lcom/efs/sdk/base/a/i/f;->b:Lcom/efs/sdk/base/a/d/a;

    .line 388
    .line 389
    iget-object v0, p1, Lcom/efs/sdk/base/a/i/f;->c:Lcom/efs/sdk/base/a/i/d;

    .line 390
    .line 391
    iput-object p0, v0, Lcom/efs/sdk/base/a/i/a;->a:Lcom/efs/sdk/base/a/d/a;

    .line 392
    .line 393
    iget-object p1, p1, Lcom/efs/sdk/base/a/i/f;->d:Lcom/efs/sdk/base/a/i/g;

    .line 394
    .line 395
    iput-object p0, p1, Lcom/efs/sdk/base/a/i/a;->a:Lcom/efs/sdk/base/a/d/a;

    .line 396
    .line 397
    iput-boolean v1, p0, Lcom/efs/sdk/base/a/d/a;->g:Z

    .line 398
    .line 399
    invoke-static {}, Lcom/efs/sdk/base/a/e/d;->a()Lcom/efs/sdk/base/a/e/d;

    .line 400
    .line 401
    .line 402
    move-result-object p1

    .line 403
    sget-object v0, Lcom/efs/sdk/base/a/d/a;->a:Lcom/efs/sdk/base/a/c/a;

    .line 404
    .line 405
    iget-wide v2, v0, Lcom/efs/sdk/base/a/c/a;->k:J

    .line 406
    .line 407
    const/4 v0, 0x0

    .line 408
    invoke-virtual {p1, v0, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 409
    .line 410
    .line 411
    invoke-static {}, Lcom/efs/sdk/base/a/i/f$a;->a()Lcom/efs/sdk/base/a/i/f;

    .line 412
    .line 413
    .line 414
    move-result-object p1

    .line 415
    iget-object v0, p1, Lcom/efs/sdk/base/a/i/f;->b:Lcom/efs/sdk/base/a/d/a;

    .line 416
    .line 417
    if-eqz v0, :cond_7

    .line 418
    .line 419
    sget-object v0, Lcom/efs/sdk/base/a/d/a;->a:Lcom/efs/sdk/base/a/c/a;

    .line 420
    .line 421
    iget-boolean v0, v0, Lcom/efs/sdk/base/a/c/a;->d:Z

    .line 422
    .line 423
    if-nez v0, :cond_6

    .line 424
    .line 425
    goto :goto_3

    .line 426
    :cond_6
    new-instance v0, Lcom/efs/sdk/base/a/i/b;

    .line 427
    .line 428
    iget-object v2, p1, Lcom/efs/sdk/base/a/i/f;->a:Lcom/efs/sdk/base/a/i/c;

    .line 429
    .line 430
    iget-object v2, v2, Lcom/efs/sdk/base/a/i/c;->c:Ljava/lang/String;

    .line 431
    .line 432
    const-string v3, "efs_core"

    .line 433
    .line 434
    const-string v4, "pvuv"

    .line 435
    .line 436
    invoke-direct {v0, v3, v4, v2}, Lcom/efs/sdk/base/a/i/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 437
    .line 438
    .line 439
    iget-object p1, p1, Lcom/efs/sdk/base/a/i/f;->b:Lcom/efs/sdk/base/a/d/a;

    .line 440
    .line 441
    invoke-virtual {p1, v0}, Lcom/efs/sdk/base/a/d/a;->a(Lcom/efs/sdk/base/protocol/ILogProtocol;)V

    .line 442
    .line 443
    .line 444
    :cond_7
    :goto_3
    return v1
.end method
