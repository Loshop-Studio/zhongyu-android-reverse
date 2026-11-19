.class public Lt7/a$b;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt7/a;->m(ILjava/io/File;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lt7/a;


# direct methods
.method public constructor <init>(Lt7/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt7/a$b;->c:Lt7/a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a([SI)I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    goto :goto_1

    .line 5
    :cond_0
    move v1, v0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v1, p2, :cond_1

    .line 8
    .line 9
    aget-short v3, p1, v1

    .line 10
    .line 11
    mul-int/2addr v3, v3

    .line 12
    add-int/2addr v2, v3

    .line 13
    add-int/lit8 v1, v1, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    if-lez p2, :cond_2

    .line 17
    .line 18
    div-int/2addr v2, p2

    .line 19
    int-to-double p1, v2

    .line 20
    invoke-static {p1, p2}, Ljava/lang/Math;->sqrt(D)D

    .line 21
    .line 22
    .line 23
    move-result-wide p1

    .line 24
    double-to-int p1, p1

    .line 25
    return p1

    .line 26
    :cond_2
    :goto_1
    return v0
.end method

.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lt7/a$b;->c:Lt7/a;

    .line 2
    .line 3
    invoke-static {v0}, Lt7/a;->b(Lt7/a;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Lt7/a$b;->c:Lt7/a;

    .line 9
    .line 10
    invoke-static {v1}, Lt7/a;->e(Lt7/a;)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-lez v1, :cond_0

    .line 15
    .line 16
    new-instance v1, Landroid/os/Handler;

    .line 17
    .line 18
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 23
    .line 24
    .line 25
    new-instance v2, Lt7/a$b$a;

    .line 26
    .line 27
    invoke-direct {v2, p0}, Lt7/a$b$a;-><init>(Lt7/a$b;)V

    .line 28
    .line 29
    .line 30
    iget-object v3, p0, Lt7/a$b;->c:Lt7/a;

    .line 31
    .line 32
    invoke-static {v3}, Lt7/a;->e(Lt7/a;)I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    mul-int/lit16 v3, v3, 0x3e8

    .line 37
    .line 38
    add-int/lit8 v3, v3, 0x64

    .line 39
    .line 40
    int-to-long v3, v3

    .line 41
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception v1

    .line 46
    goto :goto_2

    .line 47
    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    const/16 v0, -0x13

    .line 49
    .line 50
    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 51
    .line 52
    .line 53
    :cond_1
    :goto_1
    iget-object v0, p0, Lt7/a$b;->c:Lt7/a;

    .line 54
    .line 55
    invoke-virtual {v0}, Lt7/a;->l()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    iget-object v0, p0, Lt7/a$b;->c:Lt7/a;

    .line 62
    .line 63
    invoke-static {v0}, Lt7/a;->g(Lt7/a;)Landroid/media/AudioRecord;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    if-eqz v0, :cond_1

    .line 68
    .line 69
    iget-object v0, p0, Lt7/a$b;->c:Lt7/a;

    .line 70
    .line 71
    invoke-virtual {v0}, Lt7/a;->l()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_1

    .line 76
    .line 77
    iget-object v0, p0, Lt7/a$b;->c:Lt7/a;

    .line 78
    .line 79
    invoke-static {v0}, Lt7/a;->g(Lt7/a;)Landroid/media/AudioRecord;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iget-object v1, p0, Lt7/a$b;->c:Lt7/a;

    .line 84
    .line 85
    invoke-static {v1}, Lt7/a;->h(Lt7/a;)[S

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iget-object v2, p0, Lt7/a$b;->c:Lt7/a;

    .line 90
    .line 91
    invoke-static {v2}, Lt7/a;->i(Lt7/a;)I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    const/4 v3, 0x0

    .line 96
    invoke-virtual {v0, v1, v3, v2}, Landroid/media/AudioRecord;->read([SII)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-lez v0, :cond_1

    .line 101
    .line 102
    iget-object v1, p0, Lt7/a$b;->c:Lt7/a;

    .line 103
    .line 104
    invoke-static {v1}, Lt7/a;->j(Lt7/a;)Lt7/b;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    iget-object v2, p0, Lt7/a$b;->c:Lt7/a;

    .line 109
    .line 110
    invoke-static {v2}, Lt7/a;->h(Lt7/a;)[S

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-virtual {v1, v2, v0}, Lt7/b;->c([SI)V

    .line 115
    .line 116
    .line 117
    iget-object v1, p0, Lt7/a$b;->c:Lt7/a;

    .line 118
    .line 119
    invoke-static {v1}, Lt7/a;->h(Lt7/a;)[S

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-virtual {p0, v2, v0}, Lt7/a$b;->a([SI)I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    invoke-static {v1, v0}, Lt7/a;->a(Lt7/a;I)I

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_2
    iget-object v0, p0, Lt7/a$b;->c:Lt7/a;

    .line 132
    .line 133
    invoke-static {v0}, Lt7/a;->k(Lt7/a;)V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 138
    throw v1
.end method
