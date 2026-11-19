.class public final Lokhttp3/internal/connection/l;
.super Lr7/a;
.source "SourceFile"


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Lokhttp3/internal/connection/l;->e:I

    iput-object p1, p0, Lokhttp3/internal/connection/l;->f:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p2, p1}, Lr7/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Lokhttp3/internal/connection/m;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lokhttp3/internal/connection/l;->e:I

    iput-object p1, p0, Lokhttp3/internal/connection/l;->f:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 2
    invoke-direct {p0, p2, p1}, Lr7/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 13

    .line 1
    iget v0, p0, Lokhttp3/internal/connection/l;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/internal/connection/l;->f:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lu7/o;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    :try_start_0
    iget-object v1, v0, Lu7/o;->w:Lu7/x;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x2

    .line 17
    invoke-virtual {v1, v2, v3, v2}, Lu7/x;->f(ZII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catch_0
    move-exception v1

    .line 22
    invoke-virtual {v0, v1}, Lu7/o;->b(Ljava/io/IOException;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    const-wide/16 v0, -0x1

    .line 26
    .line 27
    return-wide v0

    .line 28
    :pswitch_0
    iget-object v0, p0, Lokhttp3/internal/connection/l;->f:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Lr6/a;

    .line 31
    .line 32
    invoke-interface {v0}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    const-wide/16 v0, -0x1

    .line 36
    .line 37
    return-wide v0

    .line 38
    :pswitch_1
    iget-object v0, p0, Lokhttp3/internal/connection/l;->f:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Lokhttp3/internal/connection/m;

    .line 41
    .line 42
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 43
    .line 44
    .line 45
    move-result-wide v1

    .line 46
    iget-object v3, v0, Lokhttp3/internal/connection/m;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    const/4 v4, 0x0

    .line 53
    const/4 v5, 0x0

    .line 54
    const-wide/high16 v6, -0x8000000000000000L

    .line 55
    .line 56
    move-wide v7, v6

    .line 57
    move-object v6, v5

    .line 58
    move v5, v4

    .line 59
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    if-eqz v9, :cond_2

    .line 64
    .line 65
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    check-cast v9, Lokhttp3/internal/connection/k;

    .line 70
    .line 71
    const-string v10, "connection"

    .line 72
    .line 73
    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    monitor-enter v9

    .line 77
    :try_start_1
    invoke-virtual {v0, v9, v1, v2}, Lokhttp3/internal/connection/m;->b(Lokhttp3/internal/connection/k;J)I

    .line 78
    .line 79
    .line 80
    move-result v10

    .line 81
    if-lez v10, :cond_0

    .line 82
    .line 83
    add-int/lit8 v5, v5, 0x1

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 87
    .line 88
    iget-wide v10, v9, Lokhttp3/internal/connection/k;->q:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 89
    .line 90
    sub-long v10, v1, v10

    .line 91
    .line 92
    cmp-long v12, v10, v7

    .line 93
    .line 94
    if-lez v12, :cond_1

    .line 95
    .line 96
    move-object v6, v9

    .line 97
    move-wide v7, v10

    .line 98
    :cond_1
    :goto_2
    monitor-exit v9

    .line 99
    goto :goto_1

    .line 100
    :catchall_0
    move-exception v0

    .line 101
    monitor-exit v9

    .line 102
    throw v0

    .line 103
    :cond_2
    iget-wide v9, v0, Lokhttp3/internal/connection/m;->a:J

    .line 104
    .line 105
    cmp-long v3, v7, v9

    .line 106
    .line 107
    if-gez v3, :cond_6

    .line 108
    .line 109
    const/4 v3, 0x5

    .line 110
    if-le v4, v3, :cond_3

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_3
    if-lez v4, :cond_4

    .line 114
    .line 115
    sub-long/2addr v9, v7

    .line 116
    goto :goto_6

    .line 117
    :cond_4
    if-lez v5, :cond_5

    .line 118
    .line 119
    goto :goto_6

    .line 120
    :cond_5
    const-wide/16 v9, -0x1

    .line 121
    .line 122
    goto :goto_6

    .line 123
    :cond_6
    :goto_3
    invoke-static {v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    monitor-enter v6

    .line 127
    :try_start_2
    iget-object v3, v6, Lokhttp3/internal/connection/k;->p:Ljava/util/ArrayList;

    .line 128
    .line 129
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 130
    .line 131
    .line 132
    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 133
    const-wide/16 v9, 0x0

    .line 134
    .line 135
    if-nez v3, :cond_7

    .line 136
    .line 137
    monitor-exit v6

    .line 138
    goto :goto_6

    .line 139
    :cond_7
    :try_start_3
    iget-wide v3, v6, Lokhttp3/internal/connection/k;->q:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 140
    .line 141
    add-long/2addr v3, v7

    .line 142
    cmp-long v1, v3, v1

    .line 143
    .line 144
    if-eqz v1, :cond_8

    .line 145
    .line 146
    monitor-exit v6

    .line 147
    goto :goto_6

    .line 148
    :cond_8
    const/4 v1, 0x1

    .line 149
    :try_start_4
    iput-boolean v1, v6, Lokhttp3/internal/connection/k;->j:Z

    .line 150
    .line 151
    iget-object v1, v0, Lokhttp3/internal/connection/m;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 152
    .line 153
    invoke-virtual {v1, v6}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 154
    .line 155
    .line 156
    monitor-exit v6

    .line 157
    iget-object v1, v6, Lokhttp3/internal/connection/k;->d:Ljava/net/Socket;

    .line 158
    .line 159
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    invoke-static {v1}, Lp7/c;->d(Ljava/net/Socket;)V

    .line 163
    .line 164
    .line 165
    iget-object v1, v0, Lokhttp3/internal/connection/m;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 166
    .line 167
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    if-eqz v1, :cond_a

    .line 172
    .line 173
    iget-object v0, v0, Lokhttp3/internal/connection/m;->b:Lr7/b;

    .line 174
    .line 175
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    iget-object v1, v0, Lr7/b;->a:Lr7/c;

    .line 179
    .line 180
    monitor-enter v1

    .line 181
    :try_start_5
    invoke-virtual {v0}, Lr7/b;->a()Z

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    if-eqz v2, :cond_9

    .line 186
    .line 187
    iget-object v2, v0, Lr7/b;->a:Lr7/c;

    .line 188
    .line 189
    invoke-virtual {v2, v0}, Lr7/c;->d(Lr7/b;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 190
    .line 191
    .line 192
    goto :goto_4

    .line 193
    :catchall_1
    move-exception v0

    .line 194
    goto :goto_5

    .line 195
    :cond_9
    :goto_4
    monitor-exit v1

    .line 196
    goto :goto_6

    .line 197
    :goto_5
    monitor-exit v1

    .line 198
    throw v0

    .line 199
    :cond_a
    :goto_6
    return-wide v9

    .line 200
    :catchall_2
    move-exception v0

    .line 201
    monitor-exit v6

    .line 202
    throw v0

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
