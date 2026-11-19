.class public final Ls5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls5/b;
.implements Lu5/a;


# instance fields
.field public final synthetic a:I

.field public volatile b:Z

.field public c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ls5/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ls5/b;)Z
    .locals 5

    .line 1
    iget v0, p0, Ls5/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Ls5/a;->b:Z

    .line 7
    .line 8
    if-nez v0, :cond_2

    .line 9
    .line 10
    monitor-enter p0

    .line 11
    :try_start_0
    iget-boolean v0, p0, Ls5/a;->b:Z

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Ls5/a;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ljava/util/LinkedList;

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    new-instance v0, Ljava/util/LinkedList;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Ls5/a;->c:Ljava/lang/Object;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    :goto_0
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    monitor-exit p0

    .line 35
    const/4 p1, 0x1

    .line 36
    goto :goto_3

    .line 37
    :cond_1
    monitor-exit p0

    .line 38
    goto :goto_2

    .line 39
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    throw p1

    .line 41
    :cond_2
    :goto_2
    invoke-interface {p1}, Ls5/b;->dispose()V

    .line 42
    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    :goto_3
    return p1

    .line 46
    :pswitch_0
    iget-boolean v0, p0, Ls5/a;->b:Z

    .line 47
    .line 48
    if-nez v0, :cond_5

    .line 49
    .line 50
    monitor-enter p0

    .line 51
    :try_start_1
    iget-boolean v0, p0, Ls5/a;->b:Z

    .line 52
    .line 53
    if-nez v0, :cond_4

    .line 54
    .line 55
    iget-object v0, p0, Ls5/a;->c:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, Lz5/a;

    .line 58
    .line 59
    const/4 v1, 0x1

    .line 60
    if-nez v0, :cond_3

    .line 61
    .line 62
    new-instance v0, Lz5/a;

    .line 63
    .line 64
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 65
    .line 66
    .line 67
    const/16 v2, 0xf

    .line 68
    .line 69
    invoke-static {v2}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    rsub-int/lit8 v2, v2, 0x20

    .line 74
    .line 75
    shl-int v2, v1, v2

    .line 76
    .line 77
    add-int/lit8 v3, v2, -0x1

    .line 78
    .line 79
    iput v3, v0, Lz5/a;->a:I

    .line 80
    .line 81
    int-to-float v3, v2

    .line 82
    const/high16 v4, 0x3f400000    # 0.75f

    .line 83
    .line 84
    mul-float/2addr v4, v3

    .line 85
    float-to-int v3, v4

    .line 86
    iput v3, v0, Lz5/a;->c:I

    .line 87
    .line 88
    new-array v2, v2, [Ljava/lang/Object;

    .line 89
    .line 90
    iput-object v2, v0, Lz5/a;->d:[Ljava/lang/Object;

    .line 91
    .line 92
    iput-object v0, p0, Ls5/a;->c:Ljava/lang/Object;

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :catchall_1
    move-exception p1

    .line 96
    goto :goto_5

    .line 97
    :cond_3
    :goto_4
    invoke-virtual {v0, p1}, Lz5/a;->a(Ls5/b;)V

    .line 98
    .line 99
    .line 100
    monitor-exit p0

    .line 101
    goto :goto_7

    .line 102
    :cond_4
    monitor-exit p0

    .line 103
    goto :goto_6

    .line 104
    :goto_5
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 105
    throw p1

    .line 106
    :cond_5
    :goto_6
    invoke-interface {p1}, Ls5/b;->dispose()V

    .line 107
    .line 108
    .line 109
    const/4 v1, 0x0

    .line 110
    :goto_7
    return v1

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ls5/b;)Z
    .locals 7

    .line 1
    iget v0, p0, Ls5/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Ls5/a;->b:Z

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    monitor-enter p0

    .line 13
    :try_start_0
    iget-boolean v0, p0, Ls5/a;->b:Z

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    monitor-exit p0

    .line 18
    goto :goto_1

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto :goto_2

    .line 21
    :cond_1
    iget-object v0, p0, Ls5/a;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Ljava/util/LinkedList;

    .line 24
    .line 25
    if-eqz v0, :cond_3

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_2

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    monitor-exit p0

    .line 35
    const/4 v1, 0x1

    .line 36
    goto :goto_1

    .line 37
    :cond_3
    :goto_0
    monitor-exit p0

    .line 38
    :goto_1
    return v1

    .line 39
    :goto_2
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    throw p1

    .line 41
    :pswitch_0
    iget-boolean v0, p0, Ls5/a;->b:Z

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    if-eqz v0, :cond_4

    .line 45
    .line 46
    goto :goto_5

    .line 47
    :cond_4
    monitor-enter p0

    .line 48
    :try_start_1
    iget-boolean v0, p0, Ls5/a;->b:Z

    .line 49
    .line 50
    if-eqz v0, :cond_5

    .line 51
    .line 52
    monitor-exit p0

    .line 53
    goto :goto_5

    .line 54
    :catchall_1
    move-exception p1

    .line 55
    goto :goto_6

    .line 56
    :cond_5
    iget-object v0, p0, Ls5/a;->c:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Lz5/a;

    .line 59
    .line 60
    if-eqz v0, :cond_9

    .line 61
    .line 62
    iget-object v2, v0, Lz5/a;->d:[Ljava/lang/Object;

    .line 63
    .line 64
    iget v3, v0, Lz5/a;->a:I

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    const v5, -0x61c88647

    .line 71
    .line 72
    .line 73
    mul-int/2addr v4, v5

    .line 74
    ushr-int/lit8 v5, v4, 0x10

    .line 75
    .line 76
    xor-int/2addr v4, v5

    .line 77
    and-int/2addr v4, v3

    .line 78
    aget-object v5, v2, v4

    .line 79
    .line 80
    if-nez v5, :cond_6

    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_6
    invoke-virtual {v5, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    const/4 v6, 0x1

    .line 88
    if-eqz v5, :cond_7

    .line 89
    .line 90
    invoke-virtual {v0, v4, v3, v2}, Lz5/a;->b(II[Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_7
    add-int/2addr v4, v6

    .line 95
    and-int/2addr v4, v3

    .line 96
    aget-object v5, v2, v4

    .line 97
    .line 98
    if-nez v5, :cond_8

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_8
    invoke-virtual {v5, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    if-eqz v5, :cond_7

    .line 106
    .line 107
    invoke-virtual {v0, v4, v3, v2}, Lz5/a;->b(II[Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    :goto_3
    monitor-exit p0

    .line 111
    move v1, v6

    .line 112
    goto :goto_5

    .line 113
    :cond_9
    :goto_4
    monitor-exit p0

    .line 114
    :goto_5
    return v1

    .line 115
    :goto_6
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 116
    throw p1

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Ls5/b;)Z
    .locals 1

    .line 1
    iget v0, p0, Ls5/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ls5/a;->b(Ls5/b;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p1}, Ls5/b;->dispose()V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    :goto_0
    return p1

    .line 19
    :pswitch_0
    invoke-virtual {p0, p1}, Ls5/a;->b(Ls5/b;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-interface {p1}, Ls5/b;->dispose()V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    const/4 p1, 0x0

    .line 31
    :goto_1
    return p1

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final dispose()V
    .locals 8

    .line 1
    iget v0, p0, Ls5/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Ls5/a;->b:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    monitor-enter p0

    .line 12
    :try_start_0
    iget-boolean v0, p0, Ls5/a;->b:Z

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    monitor-exit p0

    .line 17
    goto :goto_1

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    goto :goto_2

    .line 20
    :cond_1
    const/4 v0, 0x1

    .line 21
    iput-boolean v0, p0, Ls5/a;->b:Z

    .line 22
    .line 23
    iget-object v1, p0, Ls5/a;->c:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Ljava/util/LinkedList;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    iput-object v2, p0, Ls5/a;->c:Ljava/lang/Object;

    .line 29
    .line 30
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    if-nez v1, :cond_2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_4

    .line 43
    .line 44
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    check-cast v3, Ls5/b;

    .line 49
    .line 50
    :try_start_1
    invoke-interface {v3}, Ls5/b;->dispose()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_1
    move-exception v3

    .line 55
    invoke-static {v3}, Lh4/a;->p(Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    if-nez v2, :cond_3

    .line 59
    .line 60
    new-instance v2, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    :cond_3
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    if-eqz v2, :cond_6

    .line 70
    .line 71
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-ne v1, v0, :cond_5

    .line 76
    .line 77
    const/4 v0, 0x0

    .line 78
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, Ljava/lang/Throwable;

    .line 83
    .line 84
    invoke-static {v0}, Lio/reactivex/internal/util/a;->a(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    throw v0

    .line 89
    :cond_5
    new-instance v0, Lio/reactivex/exceptions/CompositeException;

    .line 90
    .line 91
    invoke-direct {v0, v2}, Lio/reactivex/exceptions/CompositeException;-><init>(Ljava/lang/Iterable;)V

    .line 92
    .line 93
    .line 94
    throw v0

    .line 95
    :cond_6
    :goto_1
    return-void

    .line 96
    :goto_2
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 97
    throw v0

    .line 98
    :pswitch_0
    iget-boolean v0, p0, Ls5/a;->b:Z

    .line 99
    .line 100
    if-eqz v0, :cond_7

    .line 101
    .line 102
    goto :goto_5

    .line 103
    :cond_7
    monitor-enter p0

    .line 104
    :try_start_3
    iget-boolean v0, p0, Ls5/a;->b:Z

    .line 105
    .line 106
    if-eqz v0, :cond_8

    .line 107
    .line 108
    monitor-exit p0

    .line 109
    goto :goto_5

    .line 110
    :catchall_2
    move-exception v0

    .line 111
    goto :goto_6

    .line 112
    :cond_8
    const/4 v0, 0x1

    .line 113
    iput-boolean v0, p0, Ls5/a;->b:Z

    .line 114
    .line 115
    iget-object v1, p0, Ls5/a;->c:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v1, Lz5/a;

    .line 118
    .line 119
    const/4 v2, 0x0

    .line 120
    iput-object v2, p0, Ls5/a;->c:Ljava/lang/Object;

    .line 121
    .line 122
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 123
    if-nez v1, :cond_9

    .line 124
    .line 125
    goto :goto_5

    .line 126
    :cond_9
    iget-object v1, v1, Lz5/a;->d:[Ljava/lang/Object;

    .line 127
    .line 128
    array-length v3, v1

    .line 129
    const/4 v4, 0x0

    .line 130
    move v5, v4

    .line 131
    :goto_3
    if-ge v5, v3, :cond_c

    .line 132
    .line 133
    aget-object v6, v1, v5

    .line 134
    .line 135
    instance-of v7, v6, Ls5/b;

    .line 136
    .line 137
    if-eqz v7, :cond_b

    .line 138
    .line 139
    :try_start_4
    check-cast v6, Ls5/b;

    .line 140
    .line 141
    invoke-interface {v6}, Ls5/b;->dispose()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 142
    .line 143
    .line 144
    goto :goto_4

    .line 145
    :catchall_3
    move-exception v6

    .line 146
    invoke-static {v6}, Lh4/a;->p(Ljava/lang/Throwable;)V

    .line 147
    .line 148
    .line 149
    if-nez v2, :cond_a

    .line 150
    .line 151
    new-instance v2, Ljava/util/ArrayList;

    .line 152
    .line 153
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 154
    .line 155
    .line 156
    :cond_a
    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    :cond_b
    :goto_4
    add-int/lit8 v5, v5, 0x1

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_c
    if-eqz v2, :cond_e

    .line 163
    .line 164
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    if-ne v1, v0, :cond_d

    .line 169
    .line 170
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    check-cast v0, Ljava/lang/Throwable;

    .line 175
    .line 176
    invoke-static {v0}, Lio/reactivex/internal/util/a;->a(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    throw v0

    .line 181
    :cond_d
    new-instance v0, Lio/reactivex/exceptions/CompositeException;

    .line 182
    .line 183
    invoke-direct {v0, v2}, Lio/reactivex/exceptions/CompositeException;-><init>(Ljava/lang/Iterable;)V

    .line 184
    .line 185
    .line 186
    throw v0

    .line 187
    :cond_e
    :goto_5
    return-void

    .line 188
    :goto_6
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 189
    throw v0

    .line 190
    nop

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
