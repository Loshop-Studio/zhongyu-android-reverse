.class final Lcom/tendcloud/tenddata/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tendcloud/tenddata/i;


# direct methods
.method private constructor <init>(Lcom/tendcloud/tenddata/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/i$a;->this$0:Lcom/tendcloud/tenddata/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/tendcloud/tenddata/i;Lcom/tendcloud/tenddata/i$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/i$a;-><init>(Lcom/tendcloud/tenddata/i;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p0, Lcom/tendcloud/tenddata/i$a;->this$0:Lcom/tendcloud/tenddata/i;

    .line 6
    .line 7
    invoke-static {v2}, Lcom/tendcloud/tenddata/i;->a(Lcom/tendcloud/tenddata/i;)Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    monitor-enter v2

    .line 12
    :try_start_0
    iget-object v3, p0, Lcom/tendcloud/tenddata/i$a;->this$0:Lcom/tendcloud/tenddata/i;

    .line 13
    .line 14
    invoke-static {v3}, Lcom/tendcloud/tenddata/i;->a(Lcom/tendcloud/tenddata/i;)Ljava/util/Map;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_1

    .line 31
    .line 32
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, Ljava/util/Map$Entry;

    .line 37
    .line 38
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    check-cast v4, Lcom/tendcloud/tenddata/i$c;

    .line 43
    .line 44
    iget-wide v5, v4, Lcom/tendcloud/tenddata/i$c;->timeSentMillis:J

    .line 45
    .line 46
    sub-long v5, v0, v5

    .line 47
    .line 48
    const-wide/16 v7, 0x3e8

    .line 49
    .line 50
    cmp-long v5, v5, v7

    .line 51
    .line 52
    if-lez v5, :cond_0

    .line 53
    .line 54
    sget-object v5, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 55
    .line 56
    iget-object v6, v4, Lcom/tendcloud/tenddata/i$c;->eventName:Ljava/lang/String;

    .line 57
    .line 58
    iget-object v4, v4, Lcom/tendcloud/tenddata/i$c;->properties:Ljava/util/Hashtable;

    .line 59
    .line 60
    const-wide/16 v7, 0x0

    .line 61
    .line 62
    invoke-static {v5, v6, v7, v8, v4}, Lcom/tendcloud/tenddata/TalkingDataSDK;->onEvent(Landroid/content/Context;Ljava/lang/String;DLjava/util/Map;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catchall_0
    move-exception v0

    .line 70
    goto :goto_1

    .line 71
    :cond_1
    iget-object v0, p0, Lcom/tendcloud/tenddata/i$a;->this$0:Lcom/tendcloud/tenddata/i;

    .line 72
    .line 73
    invoke-static {v0}, Lcom/tendcloud/tenddata/i;->a(Lcom/tendcloud/tenddata/i;)Ljava/util/Map;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-nez v0, :cond_2

    .line 82
    .line 83
    iget-object v0, p0, Lcom/tendcloud/tenddata/i$a;->this$0:Lcom/tendcloud/tenddata/i;

    .line 84
    .line 85
    invoke-static {v0}, Lcom/tendcloud/tenddata/i;->b(Lcom/tendcloud/tenddata/i;)Landroid/os/Handler;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    const-wide/16 v3, 0x1f4

    .line 90
    .line 91
    invoke-virtual {v0, p0, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 92
    .line 93
    .line 94
    :cond_2
    monitor-exit v2

    .line 95
    return-void

    .line 96
    :goto_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    throw v0
.end method
