.class public final Lo0/c;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lo0/d;


# direct methods
.method public constructor <init>(Lo0/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lo0/c;->a:Lo0/d;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 1
    iget-object p2, p0, Lo0/c;->a:Lo0/d;

    .line 2
    .line 3
    iget-boolean v0, p2, Lo0/d;->c:Z

    .line 4
    .line 5
    invoke-static {p1}, Lo0/d;->i(Landroid/content/Context;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iput-boolean p1, p2, Lo0/d;->c:Z

    .line 10
    .line 11
    iget-object p1, p0, Lo0/c;->a:Lo0/d;

    .line 12
    .line 13
    iget-boolean p1, p1, Lo0/d;->c:Z

    .line 14
    .line 15
    if-eq v0, p1, :cond_5

    .line 16
    .line 17
    const-string p1, "ConnectivityMonitor"

    .line 18
    .line 19
    const/4 p2, 0x3

    .line 20
    invoke-static {p1, p2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    const-string p1, "ConnectivityMonitor"

    .line 27
    .line 28
    new-instance p2, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v0, "connectivity changed, isConnected: "

    .line 31
    .line 32
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lo0/c;->a:Lo0/d;

    .line 36
    .line 37
    iget-boolean v0, v0, Lo0/d;->c:Z

    .line 38
    .line 39
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    :cond_0
    iget-object p1, p0, Lo0/c;->a:Lo0/d;

    .line 50
    .line 51
    iget-object p2, p1, Lo0/d;->b:Landroid/support/v4/media/h;

    .line 52
    .line 53
    iget-boolean p1, p1, Lo0/d;->c:Z

    .line 54
    .line 55
    if-eqz p1, :cond_4

    .line 56
    .line 57
    iget-object p1, p2, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, Lcom/bumptech/glide/h;

    .line 60
    .line 61
    monitor-enter p1

    .line 62
    :try_start_0
    iget-object p2, p2, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p2, Lcom/google/gson/internal/b;

    .line 65
    .line 66
    iget-object v0, p2, Lcom/google/gson/internal/b;->c:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Ljava/util/Set;

    .line 69
    .line 70
    invoke-static {v0}, Lv0/k;->d(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    const/4 v2, 0x0

    .line 79
    :cond_1
    :goto_0
    if-ge v2, v1, :cond_3

    .line 80
    .line 81
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    add-int/lit8 v2, v2, 0x1

    .line 86
    .line 87
    check-cast v3, Lr0/b;

    .line 88
    .line 89
    check-cast v3, Lcom/bumptech/glide/request/a;

    .line 90
    .line 91
    invoke-virtual {v3}, Lcom/bumptech/glide/request/a;->f()Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-nez v4, :cond_1

    .line 96
    .line 97
    invoke-virtual {v3}, Lcom/bumptech/glide/request/a;->e()Z

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    if-nez v4, :cond_1

    .line 102
    .line 103
    invoke-virtual {v3}, Lcom/bumptech/glide/request/a;->c()V

    .line 104
    .line 105
    .line 106
    iget-boolean v4, p2, Lcom/google/gson/internal/b;->b:Z

    .line 107
    .line 108
    if-nez v4, :cond_2

    .line 109
    .line 110
    invoke-virtual {v3}, Lcom/bumptech/glide/request/a;->a()V

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_2
    iget-object v4, p2, Lcom/google/gson/internal/b;->d:Ljava/util/List;

    .line 115
    .line 116
    check-cast v4, Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_3
    monitor-exit p1

    .line 123
    return-void

    .line 124
    :catchall_0
    move-exception p2

    .line 125
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 126
    throw p2

    .line 127
    :cond_4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    :cond_5
    return-void
.end method
