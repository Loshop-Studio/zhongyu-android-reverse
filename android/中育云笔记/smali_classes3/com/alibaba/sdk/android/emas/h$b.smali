.class Lcom/alibaba/sdk/android/emas/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alibaba/sdk/android/emas/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field private a:Lcom/alibaba/sdk/android/emas/d;

.field final synthetic a:Lcom/alibaba/sdk/android/emas/h;

.field private b:Z

.field private e:I


# direct methods
.method public constructor <init>(Lcom/alibaba/sdk/android/emas/h;Lcom/alibaba/sdk/android/emas/d;ZI)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/sdk/android/emas/h$b;->a:Lcom/alibaba/sdk/android/emas/h;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lcom/alibaba/sdk/android/emas/h$b;->a:Lcom/alibaba/sdk/android/emas/d;

    .line 7
    .line 8
    iput-boolean p3, p0, Lcom/alibaba/sdk/android/emas/h$b;->b:Z

    .line 9
    .line 10
    iput p4, p0, Lcom/alibaba/sdk/android/emas/h$b;->e:I

    .line 11
    .line 12
    return-void
.end method

.method private a(Ljava/util/List;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/alibaba/sdk/android/emas/e;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/alibaba/sdk/android/emas/e;

    .line 5
    iget-object v2, v1, Lcom/alibaba/sdk/android/emas/e;->e:Ljava/lang/String;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/StringBuilder;

    if-nez v2, :cond_0

    .line 6
    new-instance v2, Ljava/lang/StringBuilder;

    iget-object v3, v1, Lcom/alibaba/sdk/android/emas/e;->d:Ljava/lang/String;

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 7
    iget-object v1, v1, Lcom/alibaba/sdk/android/emas/e;->e:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 v3, 0x1

    .line 8
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, v1, Lcom/alibaba/sdk/android/emas/e;->d:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 9
    :cond_1
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 10
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 11
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    return-object p1
.end method

.method private a()Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/sdk/android/emas/h$b;->b:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/h$b;->a:Lcom/alibaba/sdk/android/emas/h;

    invoke-static {v0}, Lcom/alibaba/sdk/android/emas/h;->a(Lcom/alibaba/sdk/android/emas/h;)Lcom/alibaba/sdk/android/emas/EmasSender;

    move-result-object v0

    invoke-virtual {v0}, Lcom/alibaba/sdk/android/emas/EmasSender;->isBackground()Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-static {}, Lcom/alibaba/sdk/android/emas/h;->a()Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->getQueue()Ljava/util/concurrent/BlockingQueue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    iget v2, p0, Lcom/alibaba/sdk/android/emas/h$b;->e:I

    if-gt v0, v2, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    return v1
.end method

.method private b()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/h$b;->a:Lcom/alibaba/sdk/android/emas/d;

    invoke-virtual {v0}, Lcom/alibaba/sdk/android/emas/d;->a()Lcom/alibaba/sdk/android/emas/b;

    move-result-object v0

    sget-object v1, Lcom/alibaba/sdk/android/emas/b;->b:Lcom/alibaba/sdk/android/emas/b;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private d(Lcom/alibaba/sdk/android/emas/d;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/h$b;->a:Lcom/alibaba/sdk/android/emas/h;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/alibaba/sdk/android/emas/h;->a(Lcom/alibaba/sdk/android/emas/h;)Lcom/alibaba/sdk/android/emas/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {p1}, Lcom/alibaba/sdk/android/emas/d;->a()Lcom/alibaba/sdk/android/emas/b;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v1, Lcom/alibaba/sdk/android/emas/b;->b:Lcom/alibaba/sdk/android/emas/b;

    .line 15
    .line 16
    if-ne v0, v1, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/h$b;->a:Lcom/alibaba/sdk/android/emas/h;

    .line 19
    .line 20
    invoke-static {v0}, Lcom/alibaba/sdk/android/emas/h;->a(Lcom/alibaba/sdk/android/emas/h;)Lcom/alibaba/sdk/android/emas/c;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0, p1}, Lcom/alibaba/sdk/android/emas/c;->a(Lcom/alibaba/sdk/android/emas/d;)Z

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-direct {p0}, Lcom/alibaba/sdk/android/emas/h$b;->a()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_3

    .line 32
    .line 33
    const-string p1, "SendManager trying send disk cache."

    .line 34
    .line 35
    invoke-static {p1}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->d(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcom/alibaba/sdk/android/emas/h$b;->a:Lcom/alibaba/sdk/android/emas/h;

    .line 39
    .line 40
    invoke-static {p1}, Lcom/alibaba/sdk/android/emas/h;->a(Lcom/alibaba/sdk/android/emas/h;)Lcom/alibaba/sdk/android/emas/c;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Lcom/alibaba/sdk/android/emas/c;->a()Lcom/alibaba/sdk/android/emas/d;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    const-string v0, "SendManager sending disk cache."

    .line 51
    .line 52
    invoke-static {v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->d(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/h$b;->a:Lcom/alibaba/sdk/android/emas/h;

    .line 56
    .line 57
    invoke-static {v0, p1}, Lcom/alibaba/sdk/android/emas/h;->a(Lcom/alibaba/sdk/android/emas/h;Lcom/alibaba/sdk/android/emas/d;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_2
    const-string p1, "SendManager disk cache is empty."

    .line 62
    .line 63
    invoke-static {p1}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->d(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    const-string v0, "SendManager finish send. background: "

    .line 73
    .line 74
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/h$b;->a:Lcom/alibaba/sdk/android/emas/h;

    .line 78
    .line 79
    invoke-static {v0}, Lcom/alibaba/sdk/android/emas/h;->a(Lcom/alibaba/sdk/android/emas/h;)Lcom/alibaba/sdk/android/emas/EmasSender;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0}, Lcom/alibaba/sdk/android/emas/EmasSender;->isBackground()Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v0, ", queue size: "

    .line 91
    .line 92
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-static {}, Lcom/alibaba/sdk/android/emas/h;->a()Ljava/util/concurrent/ThreadPoolExecutor;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->getQueue()Ljava/util/concurrent/BlockingQueue;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string v0, ", limit: "

    .line 111
    .line 112
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    iget v0, p0, Lcom/alibaba/sdk/android/emas/h$b;->e:I

    .line 116
    .line 117
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-static {p1}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->d(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    return-void
.end method


# virtual methods
.method public b()Lcom/alibaba/sdk/android/emas/d;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/h$b;->a:Lcom/alibaba/sdk/android/emas/d;

    return-object v0
.end method

.method public e()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/h$b;->a:Lcom/alibaba/sdk/android/emas/h;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/alibaba/sdk/android/emas/h;->a(Lcom/alibaba/sdk/android/emas/h;)Lcom/alibaba/sdk/android/emas/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/alibaba/sdk/android/emas/h$b;->b()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    const-string v0, "SendManager send queue fill, write into disk cache."

    .line 16
    .line 17
    invoke-static {v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->d(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Lcom/alibaba/sdk/android/emas/h$b$1;

    .line 21
    .line 22
    invoke-direct {v0, p0}, Lcom/alibaba/sdk/android/emas/h$b$1;-><init>(Lcom/alibaba/sdk/android/emas/h$b;)V

    .line 23
    .line 24
    .line 25
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-ne v1, v2, :cond_0

    .line 34
    .line 35
    new-instance v1, Ljava/lang/Thread;

    .line 36
    .line 37
    invoke-direct {v1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    const-string v0, "SendManager send queue fill, already in disk cache. do nothing."

    .line 49
    .line 50
    invoke-static {v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->d(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    const-string v0, "SendManager send queue fill, disk cache not open, discard."

    .line 55
    .line 56
    invoke-static {v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->d(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/h$b;->a:Lcom/alibaba/sdk/android/emas/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/alibaba/sdk/android/emas/d;->a()Lcom/alibaba/sdk/android/emas/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lcom/alibaba/sdk/android/emas/b;->b:Lcom/alibaba/sdk/android/emas/b;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v1, "SendManager send disk log, location:"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/alibaba/sdk/android/emas/h$b;->a:Lcom/alibaba/sdk/android/emas/d;

    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/alibaba/sdk/android/emas/d;->getLocation()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->d(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/h$b;->a:Lcom/alibaba/sdk/android/emas/h;

    .line 38
    .line 39
    invoke-static {v0}, Lcom/alibaba/sdk/android/emas/h;->a(Lcom/alibaba/sdk/android/emas/h;)Lcom/alibaba/sdk/android/emas/PreSendHandler;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/h$b;->a:Lcom/alibaba/sdk/android/emas/h;

    .line 46
    .line 47
    invoke-static {v0}, Lcom/alibaba/sdk/android/emas/h;->a(Lcom/alibaba/sdk/android/emas/h;)Lcom/alibaba/sdk/android/emas/PreSendHandler;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object v1, p0, Lcom/alibaba/sdk/android/emas/h$b;->a:Lcom/alibaba/sdk/android/emas/d;

    .line 52
    .line 53
    invoke-virtual {v1}, Lcom/alibaba/sdk/android/emas/d;->a()Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iget-object v2, p0, Lcom/alibaba/sdk/android/emas/h$b;->a:Lcom/alibaba/sdk/android/emas/d;

    .line 58
    .line 59
    invoke-virtual {v2}, Lcom/alibaba/sdk/android/emas/d;->a()Lcom/alibaba/sdk/android/emas/b;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-interface {v0, v1, v2}, Lcom/alibaba/sdk/android/emas/PreSendHandler;->onHandlePreSend(Ljava/util/List;Lcom/alibaba/sdk/android/emas/b;)Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    goto :goto_0

    .line 68
    :cond_1
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/h$b;->a:Lcom/alibaba/sdk/android/emas/d;

    .line 69
    .line 70
    invoke-virtual {v0}, Lcom/alibaba/sdk/android/emas/d;->a()Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    :goto_0
    if-eqz v0, :cond_6

    .line 75
    .line 76
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-nez v1, :cond_6

    .line 81
    .line 82
    invoke-direct {p0, v0}, Lcom/alibaba/sdk/android/emas/h$b;->a(Ljava/util/List;)Ljava/util/Map;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    :try_start_0
    iget-object v1, p0, Lcom/alibaba/sdk/android/emas/h$b;->a:Lcom/alibaba/sdk/android/emas/h;

    .line 87
    .line 88
    invoke-static {v1}, Lcom/alibaba/sdk/android/emas/h;->a(Lcom/alibaba/sdk/android/emas/h;)Lcom/alibaba/sdk/android/tbrest/SendService;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    iget-object v1, v1, Lcom/alibaba/sdk/android/tbrest/SendService;->context:Landroid/content/Context;

    .line 93
    .line 94
    iget-object v2, p0, Lcom/alibaba/sdk/android/emas/h$b;->a:Lcom/alibaba/sdk/android/emas/h;

    .line 95
    .line 96
    invoke-static {v2}, Lcom/alibaba/sdk/android/emas/h;->a(Lcom/alibaba/sdk/android/emas/h;)Lcom/alibaba/sdk/android/tbrest/SendService;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-static {v1, v2, v0}, Lcom/alibaba/sdk/android/tbrest/request/BizRequest;->getPackRequest(Landroid/content/Context;Lcom/alibaba/sdk/android/tbrest/SendService;Ljava/util/Map;)[B

    .line 101
    .line 102
    .line 103
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 104
    goto :goto_1

    .line 105
    :catch_0
    move-exception v0

    .line 106
    const-string v1, "SendManager pack request failed"

    .line 107
    .line 108
    invoke-static {v1, v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->w(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 109
    .line 110
    .line 111
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/h$b;->a:Lcom/alibaba/sdk/android/emas/h;

    .line 112
    .line 113
    invoke-static {v0}, Lcom/alibaba/sdk/android/emas/h;->a(Lcom/alibaba/sdk/android/emas/h;)Lcom/alibaba/sdk/android/emas/c;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    if-eqz v0, :cond_2

    .line 118
    .line 119
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/h$b;->a:Lcom/alibaba/sdk/android/emas/h;

    .line 120
    .line 121
    invoke-static {v0}, Lcom/alibaba/sdk/android/emas/h;->a(Lcom/alibaba/sdk/android/emas/h;)Lcom/alibaba/sdk/android/emas/c;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    iget-object v1, p0, Lcom/alibaba/sdk/android/emas/h$b;->a:Lcom/alibaba/sdk/android/emas/d;

    .line 126
    .line 127
    invoke-virtual {v0, v1}, Lcom/alibaba/sdk/android/emas/c;->b(Lcom/alibaba/sdk/android/emas/d;)V

    .line 128
    .line 129
    .line 130
    :cond_2
    const/4 v0, 0x0

    .line 131
    :goto_1
    if-eqz v0, :cond_5

    .line 132
    .line 133
    iget-object v1, p0, Lcom/alibaba/sdk/android/emas/h$b;->a:Lcom/alibaba/sdk/android/emas/h;

    .line 134
    .line 135
    invoke-static {v1}, Lcom/alibaba/sdk/android/emas/h;->a(Lcom/alibaba/sdk/android/emas/h;)Lcom/alibaba/sdk/android/tbrest/SendService;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    iget-object v2, p0, Lcom/alibaba/sdk/android/emas/h$b;->a:Lcom/alibaba/sdk/android/emas/h;

    .line 140
    .line 141
    invoke-static {v2}, Lcom/alibaba/sdk/android/emas/h;->a(Lcom/alibaba/sdk/android/emas/h;)Lcom/alibaba/sdk/android/tbrest/SendService;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    iget-object v2, v2, Lcom/alibaba/sdk/android/tbrest/SendService;->host:Ljava/lang/String;

    .line 146
    .line 147
    invoke-static {v1, v2, v0}, Lcom/alibaba/sdk/android/tbrest/request/UrlWrapper;->sendRequest(Lcom/alibaba/sdk/android/tbrest/SendService;Ljava/lang/String;[B)Lcom/alibaba/sdk/android/tbrest/request/BizResponse;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-virtual {v0}, Lcom/alibaba/sdk/android/tbrest/request/BizResponse;->isSuccess()Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-eqz v0, :cond_3

    .line 156
    .line 157
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/h$b;->a:Lcom/alibaba/sdk/android/emas/d;

    .line 158
    .line 159
    invoke-direct {p0, v0}, Lcom/alibaba/sdk/android/emas/h$b;->d(Lcom/alibaba/sdk/android/emas/d;)V

    .line 160
    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_3
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/h$b;->a:Lcom/alibaba/sdk/android/emas/h;

    .line 164
    .line 165
    invoke-static {v0}, Lcom/alibaba/sdk/android/emas/h;->a(Lcom/alibaba/sdk/android/emas/h;)Lcom/alibaba/sdk/android/emas/c;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    if-eqz v0, :cond_4

    .line 170
    .line 171
    const-string v0, "SendManager request failed. put into cache."

    .line 172
    .line 173
    invoke-static {v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->d(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/h$b;->a:Lcom/alibaba/sdk/android/emas/h;

    .line 177
    .line 178
    invoke-static {v0}, Lcom/alibaba/sdk/android/emas/h;->a(Lcom/alibaba/sdk/android/emas/h;)Lcom/alibaba/sdk/android/emas/c;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    iget-object v1, p0, Lcom/alibaba/sdk/android/emas/h$b;->a:Lcom/alibaba/sdk/android/emas/d;

    .line 183
    .line 184
    invoke-virtual {v0, v1}, Lcom/alibaba/sdk/android/emas/c;->a(Lcom/alibaba/sdk/android/emas/d;)V

    .line 185
    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_4
    const-string v0, "SendManager request failed. do nothing."

    .line 189
    .line 190
    invoke-static {v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->d(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    goto :goto_2

    .line 194
    :cond_5
    const-string v0, "SendManager pack requst is null."

    .line 195
    .line 196
    invoke-static {v0}, Lcom/alibaba/sdk/android/tbrest/utils/LogUtil;->d(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/h$b;->a:Lcom/alibaba/sdk/android/emas/d;

    .line 200
    .line 201
    invoke-direct {p0, v0}, Lcom/alibaba/sdk/android/emas/h$b;->d(Lcom/alibaba/sdk/android/emas/d;)V

    .line 202
    .line 203
    .line 204
    :goto_2
    return-void

    .line 205
    :cond_6
    iget-object v0, p0, Lcom/alibaba/sdk/android/emas/h$b;->a:Lcom/alibaba/sdk/android/emas/d;

    .line 206
    .line 207
    invoke-direct {p0, v0}, Lcom/alibaba/sdk/android/emas/h$b;->d(Lcom/alibaba/sdk/android/emas/d;)V

    .line 208
    .line 209
    .line 210
    return-void
.end method
