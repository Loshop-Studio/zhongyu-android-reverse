.class public final Lz2/d$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz2/f$c;
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz2/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "e"
.end annotation


# instance fields
.field public final a:Lz2/f;

.field public final synthetic b:Lz2/d;


# direct methods
.method public constructor <init>(Lz2/d;Lz2/f;)V
    .locals 1

    .line 1
    const-string v0, "reader"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lz2/d$e;->b:Lz2/d;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Lz2/d$e;->a:Lz2/f;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 1
    return-void
.end method

.method public b(ZIILjava/util/List;)V
    .locals 16

    .line 1
    move-object/from16 v12, p0

    .line 2
    .line 3
    move/from16 v0, p1

    .line 4
    .line 5
    move/from16 v9, p2

    .line 6
    .line 7
    move-object/from16 v10, p4

    .line 8
    .line 9
    const-string v1, "headerBlock"

    .line 10
    .line 11
    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, v12, Lz2/d$e;->b:Lz2/d;

    .line 15
    .line 16
    invoke-virtual {v1, v9}, Lz2/d;->M(I)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    iget-object v1, v12, Lz2/d$e;->b:Lz2/d;

    .line 23
    .line 24
    invoke-virtual {v1, v9, v10, v0}, Lz2/d;->J(ILjava/util/List;Z)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    iget-object v13, v12, Lz2/d$e;->b:Lz2/d;

    .line 29
    .line 30
    monitor-enter v13

    .line 31
    :try_start_0
    iget-object v1, v12, Lz2/d$e;->b:Lz2/d;

    .line 32
    .line 33
    invoke-virtual {v1, v9}, Lz2/d;->B(I)Lz2/g;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    if-nez v8, :cond_4

    .line 38
    .line 39
    iget-object v1, v12, Lz2/d$e;->b:Lz2/d;

    .line 40
    .line 41
    invoke-static {v1}, Lz2/d;->l(Lz2/d;)Z

    .line 42
    .line 43
    .line 44
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    monitor-exit v13

    .line 48
    return-void

    .line 49
    :cond_1
    :try_start_1
    iget-object v1, v12, Lz2/d$e;->b:Lz2/d;

    .line 50
    .line 51
    invoke-virtual {v1}, Lz2/d;->w()I

    .line 52
    .line 53
    .line 54
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    if-gt v9, v1, :cond_2

    .line 56
    .line 57
    monitor-exit v13

    .line 58
    return-void

    .line 59
    :cond_2
    :try_start_2
    rem-int/lit8 v1, v9, 0x2

    .line 60
    .line 61
    iget-object v2, v12, Lz2/d$e;->b:Lz2/d;

    .line 62
    .line 63
    invoke-virtual {v2}, Lz2/d;->y()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    rem-int/lit8 v2, v2, 0x2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 68
    .line 69
    if-ne v1, v2, :cond_3

    .line 70
    .line 71
    monitor-exit v13

    .line 72
    return-void

    .line 73
    :cond_3
    :try_start_3
    invoke-static/range {p4 .. p4}, Ls2/b;->K(Ljava/util/List;)Lr2/s;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    new-instance v7, Lz2/g;

    .line 78
    .line 79
    iget-object v3, v12, Lz2/d$e;->b:Lz2/d;

    .line 80
    .line 81
    const/4 v4, 0x0

    .line 82
    move-object v1, v7

    .line 83
    move/from16 v2, p2

    .line 84
    .line 85
    move/from16 v5, p1

    .line 86
    .line 87
    invoke-direct/range {v1 .. v6}, Lz2/g;-><init>(ILz2/d;ZZLr2/s;)V

    .line 88
    .line 89
    .line 90
    iget-object v1, v12, Lz2/d$e;->b:Lz2/d;

    .line 91
    .line 92
    invoke-virtual {v1, v9}, Lz2/d;->P(I)V

    .line 93
    .line 94
    .line 95
    iget-object v1, v12, Lz2/d$e;->b:Lz2/d;

    .line 96
    .line 97
    invoke-virtual {v1}, Lz2/d;->C()Ljava/util/Map;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-interface {v1, v2, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    iget-object v1, v12, Lz2/d$e;->b:Lz2/d;

    .line 109
    .line 110
    invoke-static {v1}, Lz2/d;->j(Lz2/d;)Lv2/e;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {v1}, Lv2/e;->i()Lv2/d;

    .line 115
    .line 116
    .line 117
    move-result-object v14

    .line 118
    new-instance v1, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 121
    .line 122
    .line 123
    iget-object v2, v12, Lz2/d$e;->b:Lz2/d;

    .line 124
    .line 125
    invoke-virtual {v2}, Lz2/d;->v()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const/16 v2, 0x5b

    .line 133
    .line 134
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const-string v2, "] onStream"

    .line 141
    .line 142
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    const/4 v5, 0x1

    .line 150
    new-instance v15, Lz2/d$e$b;

    .line 151
    .line 152
    move-object v1, v15

    .line 153
    move-object v2, v4

    .line 154
    move v3, v5

    .line 155
    move-object v6, v7

    .line 156
    move-object/from16 v7, p0

    .line 157
    .line 158
    move/from16 v9, p2

    .line 159
    .line 160
    move-object/from16 v10, p4

    .line 161
    .line 162
    move/from16 v11, p1

    .line 163
    .line 164
    invoke-direct/range {v1 .. v11}, Lz2/d$e$b;-><init>(Ljava/lang/String;ZLjava/lang/String;ZLz2/g;Lz2/d$e;Lz2/g;ILjava/util/List;Z)V

    .line 165
    .line 166
    .line 167
    const-wide/16 v0, 0x0

    .line 168
    .line 169
    invoke-virtual {v14, v15, v0, v1}, Lv2/d;->i(Lv2/a;J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 170
    .line 171
    .line 172
    monitor-exit v13

    .line 173
    return-void

    .line 174
    :cond_4
    :try_start_4
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 175
    .line 176
    monitor-exit v13

    .line 177
    invoke-static/range {p4 .. p4}, Ls2/b;->K(Ljava/util/List;)Lr2/s;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    invoke-virtual {v8, v1, v0}, Lz2/g;->x(Lr2/s;Z)V

    .line 182
    .line 183
    .line 184
    return-void

    .line 185
    :catchall_0
    move-exception v0

    .line 186
    monitor-exit v13

    .line 187
    throw v0
.end method

.method public c(IJ)V
    .locals 3

    .line 1
    if-nez p1, :cond_1

    .line 2
    .line 3
    iget-object p1, p0, Lz2/d$e;->b:Lz2/d;

    .line 4
    .line 5
    monitor-enter p1

    .line 6
    :try_start_0
    iget-object v0, p0, Lz2/d$e;->b:Lz2/d;

    .line 7
    .line 8
    invoke-virtual {v0}, Lz2/d;->D()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    add-long/2addr v1, p2

    .line 13
    invoke-static {v0, v1, v2}, Lz2/d;->r(Lz2/d;J)V

    .line 14
    .line 15
    .line 16
    iget-object p2, p0, Lz2/d$e;->b:Lz2/d;

    .line 17
    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/lang/Object;->notifyAll()V

    .line 21
    .line 22
    .line 23
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    monitor-exit p1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    :try_start_1
    new-instance p2, Ljava/lang/NullPointerException;

    .line 28
    .line 29
    const-string p3, "null cannot be cast to non-null type java.lang.Object"

    .line 30
    .line 31
    invoke-direct {p2, p3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    :catchall_0
    move-exception p2

    .line 36
    monitor-exit p1

    .line 37
    throw p2

    .line 38
    :cond_1
    iget-object v0, p0, Lz2/d$e;->b:Lz2/d;

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Lz2/d;->B(I)Lz2/g;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    monitor-enter p1

    .line 47
    :try_start_2
    invoke-virtual {p1, p2, p3}, Lz2/g;->a(J)V

    .line 48
    .line 49
    .line 50
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 51
    .line 52
    monitor-exit p1

    .line 53
    goto :goto_0

    .line 54
    :catchall_1
    move-exception p2

    .line 55
    monitor-exit p1

    .line 56
    throw p2

    .line 57
    :cond_2
    :goto_0
    return-void
.end method

.method public d(ZILokio/BufferedSource;I)V
    .locals 2

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lz2/d$e;->b:Lz2/d;

    .line 7
    .line 8
    invoke-virtual {v0, p2}, Lz2/d;->M(I)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lz2/d$e;->b:Lz2/d;

    .line 15
    .line 16
    invoke-virtual {v0, p2, p3, p4, p1}, Lz2/d;->I(ILokio/BufferedSource;IZ)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v0, p0, Lz2/d$e;->b:Lz2/d;

    .line 21
    .line 22
    invoke-virtual {v0, p2}, Lz2/d;->B(I)Lz2/g;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    iget-object p1, p0, Lz2/d$e;->b:Lz2/d;

    .line 29
    .line 30
    sget-object v0, Lokhttp3/internal/http2/ErrorCode;->c:Lokhttp3/internal/http2/ErrorCode;

    .line 31
    .line 32
    invoke-virtual {p1, p2, v0}, Lz2/d;->Z(ILokhttp3/internal/http2/ErrorCode;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lz2/d$e;->b:Lz2/d;

    .line 36
    .line 37
    int-to-long v0, p4

    .line 38
    invoke-virtual {p1, v0, v1}, Lz2/d;->U(J)V

    .line 39
    .line 40
    .line 41
    invoke-interface {p3, v0, v1}, Lokio/BufferedSource;->skip(J)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    invoke-virtual {v0, p3, p4}, Lz2/g;->w(Lokio/BufferedSource;I)V

    .line 46
    .line 47
    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    sget-object p1, Ls2/b;->b:Lr2/s;

    .line 51
    .line 52
    const/4 p2, 0x1

    .line 53
    invoke-virtual {v0, p1, p2}, Lz2/g;->x(Lr2/s;Z)V

    .line 54
    .line 55
    .line 56
    :cond_2
    return-void
.end method

.method public e(ZII)V
    .locals 10

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    iget-object p1, p0, Lz2/d$e;->b:Lz2/d;

    .line 4
    .line 5
    monitor-enter p1

    .line 6
    const/4 p3, 0x1

    .line 7
    const-wide/16 v0, 0x1

    .line 8
    .line 9
    if-eq p2, p3, :cond_3

    .line 10
    .line 11
    const/4 p3, 0x2

    .line 12
    if-eq p2, p3, :cond_2

    .line 13
    .line 14
    const/4 p3, 0x3

    .line 15
    if-eq p2, p3, :cond_0

    .line 16
    .line 17
    :goto_0
    :try_start_0
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    iget-object p2, p0, Lz2/d$e;->b:Lz2/d;

    .line 21
    .line 22
    invoke-static {p2}, Lz2/d;->b(Lz2/d;)J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    add-long/2addr v2, v0

    .line 27
    invoke-static {p2, v2, v3}, Lz2/d;->m(Lz2/d;J)V

    .line 28
    .line 29
    .line 30
    iget-object p2, p0, Lz2/d$e;->b:Lz2/d;

    .line 31
    .line 32
    if-eqz p2, :cond_1

    .line 33
    .line 34
    invoke-virtual {p2}, Ljava/lang/Object;->notifyAll()V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    new-instance p2, Ljava/lang/NullPointerException;

    .line 39
    .line 40
    const-string p3, "null cannot be cast to non-null type java.lang.Object"

    .line 41
    .line 42
    invoke-direct {p2, p3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p2

    .line 46
    :cond_2
    iget-object p2, p0, Lz2/d$e;->b:Lz2/d;

    .line 47
    .line 48
    invoke-static {p2}, Lz2/d;->e(Lz2/d;)J

    .line 49
    .line 50
    .line 51
    move-result-wide v2

    .line 52
    add-long/2addr v2, v0

    .line 53
    invoke-static {p2, v2, v3}, Lz2/d;->n(Lz2/d;J)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    iget-object p2, p0, Lz2/d$e;->b:Lz2/d;

    .line 58
    .line 59
    invoke-static {p2}, Lz2/d;->g(Lz2/d;)J

    .line 60
    .line 61
    .line 62
    move-result-wide v2

    .line 63
    add-long/2addr v2, v0

    .line 64
    invoke-static {p2, v2, v3}, Lz2/d;->p(Lz2/d;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    .line 67
    :goto_1
    monitor-exit p1

    .line 68
    goto :goto_2

    .line 69
    :catchall_0
    move-exception p2

    .line 70
    monitor-exit p1

    .line 71
    throw p2

    .line 72
    :cond_4
    iget-object p1, p0, Lz2/d$e;->b:Lz2/d;

    .line 73
    .line 74
    invoke-static {p1}, Lz2/d;->k(Lz2/d;)Lv2/d;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    new-instance v0, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    iget-object v1, p0, Lz2/d$e;->b:Lz2/d;

    .line 84
    .line 85
    invoke-virtual {v1}, Lz2/d;->v()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v1, " ping"

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    const/4 v6, 0x1

    .line 102
    new-instance v0, Lz2/d$e$c;

    .line 103
    .line 104
    move-object v2, v0

    .line 105
    move-object v3, v5

    .line 106
    move v4, v6

    .line 107
    move-object v7, p0

    .line 108
    move v8, p2

    .line 109
    move v9, p3

    .line 110
    invoke-direct/range {v2 .. v9}, Lz2/d$e$c;-><init>(Ljava/lang/String;ZLjava/lang/String;ZLz2/d$e;II)V

    .line 111
    .line 112
    .line 113
    const-wide/16 p2, 0x0

    .line 114
    .line 115
    invoke-virtual {p1, v0, p2, p3}, Lv2/d;->i(Lv2/a;J)V

    .line 116
    .line 117
    .line 118
    :goto_2
    return-void
.end method

.method public f(IIIZ)V
    .locals 0

    .line 1
    return-void
.end method

.method public g(ILokhttp3/internal/http2/ErrorCode;)V
    .locals 1

    .line 1
    const-string v0, "errorCode"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lz2/d$e;->b:Lz2/d;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lz2/d;->M(I)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lz2/d$e;->b:Lz2/d;

    .line 15
    .line 16
    invoke-virtual {v0, p1, p2}, Lz2/d;->L(ILokhttp3/internal/http2/ErrorCode;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v0, p0, Lz2/d$e;->b:Lz2/d;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lz2/d;->N(I)Lz2/g;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Lz2/g;->y(Lokhttp3/internal/http2/ErrorCode;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
.end method

.method public h(ZLz2/k;)V
    .locals 11

    .line 1
    const-string v0, "settings"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lz2/d$e;->b:Lz2/d;

    .line 7
    .line 8
    invoke-static {v0}, Lz2/d;->k(Lz2/d;)Lv2/d;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    iget-object v2, p0, Lz2/d$e;->b:Lz2/d;

    .line 18
    .line 19
    invoke-virtual {v2}, Lz2/d;->v()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v2, " applyAndAckSettings"

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    const/4 v7, 0x1

    .line 36
    new-instance v1, Lz2/d$e$d;

    .line 37
    .line 38
    move-object v3, v1

    .line 39
    move-object v4, v6

    .line 40
    move v5, v7

    .line 41
    move-object v8, p0

    .line 42
    move v9, p1

    .line 43
    move-object v10, p2

    .line 44
    invoke-direct/range {v3 .. v10}, Lz2/d$e$d;-><init>(Ljava/lang/String;ZLjava/lang/String;ZLz2/d$e;ZLz2/k;)V

    .line 45
    .line 46
    .line 47
    const-wide/16 p1, 0x0

    .line 48
    .line 49
    invoke-virtual {v0, v1, p1, p2}, Lv2/d;->i(Lv2/a;J)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public i(IILjava/util/List;)V
    .locals 0

    .line 1
    const-string p1, "requestHeaders"

    .line 2
    .line 3
    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lz2/d$e;->b:Lz2/d;

    .line 7
    .line 8
    invoke-virtual {p1, p2, p3}, Lz2/d;->K(ILjava/util/List;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lz2/d$e;->l()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 5
    .line 6
    return-object v0
.end method

.method public j(ILokhttp3/internal/http2/ErrorCode;Lokio/ByteString;)V
    .locals 3

    .line 1
    const-string v0, "errorCode"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p2, "debugData"

    .line 7
    .line 8
    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p3}, Lokio/ByteString;->size()I

    .line 12
    .line 13
    .line 14
    iget-object p2, p0, Lz2/d$e;->b:Lz2/d;

    .line 15
    .line 16
    monitor-enter p2

    .line 17
    :try_start_0
    iget-object p3, p0, Lz2/d$e;->b:Lz2/d;

    .line 18
    .line 19
    invoke-virtual {p3}, Lz2/d;->C()Ljava/util/Map;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    invoke-interface {p3}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    const/4 v0, 0x0

    .line 28
    new-array v1, v0, [Lz2/g;

    .line 29
    .line 30
    invoke-interface {p3, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p3

    .line 34
    if-eqz p3, :cond_2

    .line 35
    .line 36
    check-cast p3, [Lz2/g;

    .line 37
    .line 38
    iget-object v1, p0, Lz2/d$e;->b:Lz2/d;

    .line 39
    .line 40
    const/4 v2, 0x1

    .line 41
    invoke-static {v1, v2}, Lz2/d;->q(Lz2/d;Z)V

    .line 42
    .line 43
    .line 44
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    monitor-exit p2

    .line 47
    array-length p2, p3

    .line 48
    :goto_0
    if-ge v0, p2, :cond_1

    .line 49
    .line 50
    aget-object v1, p3, v0

    .line 51
    .line 52
    invoke-virtual {v1}, Lz2/g;->j()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-le v2, p1, :cond_0

    .line 57
    .line 58
    invoke-virtual {v1}, Lz2/g;->t()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_0

    .line 63
    .line 64
    sget-object v2, Lokhttp3/internal/http2/ErrorCode;->i:Lokhttp3/internal/http2/ErrorCode;

    .line 65
    .line 66
    invoke-virtual {v1, v2}, Lz2/g;->y(Lokhttp3/internal/http2/ErrorCode;)V

    .line 67
    .line 68
    .line 69
    iget-object v2, p0, Lz2/d$e;->b:Lz2/d;

    .line 70
    .line 71
    invoke-virtual {v1}, Lz2/g;->j()I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    invoke-virtual {v2, v1}, Lz2/d;->N(I)Lz2/g;

    .line 76
    .line 77
    .line 78
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    return-void

    .line 82
    :cond_2
    :try_start_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 83
    .line 84
    const-string p3, "null cannot be cast to non-null type kotlin.Array<T>"

    .line 85
    .line 86
    invoke-direct {p1, p3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 90
    :catchall_0
    move-exception p1

    .line 91
    monitor-exit p2

    .line 92
    throw p1
.end method

.method public final k(ZLz2/k;)V
    .locals 21

    .line 1
    move-object/from16 v12, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    const-string v1, "settings"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance v13, Lkotlin/jvm/internal/Ref$LongRef;

    .line 11
    .line 12
    invoke-direct {v13}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v14, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 16
    .line 17
    invoke-direct {v14}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v15, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 21
    .line 22
    invoke-direct {v15}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 23
    .line 24
    .line 25
    iget-object v1, v12, Lz2/d$e;->b:Lz2/d;

    .line 26
    .line 27
    invoke-virtual {v1}, Lz2/d;->E()Lz2/h;

    .line 28
    .line 29
    .line 30
    move-result-object v16

    .line 31
    monitor-enter v16

    .line 32
    :try_start_0
    iget-object v11, v12, Lz2/d$e;->b:Lz2/d;

    .line 33
    .line 34
    monitor-enter v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 35
    :try_start_1
    iget-object v1, v12, Lz2/d$e;->b:Lz2/d;

    .line 36
    .line 37
    invoke-virtual {v1}, Lz2/d;->A()Lz2/k;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    move-object v2, v0

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    new-instance v2, Lz2/k;

    .line 46
    .line 47
    invoke-direct {v2}, Lz2/k;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v1}, Lz2/k;->g(Lz2/k;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v0}, Lz2/k;->g(Lz2/k;)V

    .line 54
    .line 55
    .line 56
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 57
    .line 58
    :goto_0
    iput-object v2, v15, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 59
    .line 60
    invoke-virtual {v2}, Lz2/k;->c()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    int-to-long v2, v2

    .line 65
    invoke-virtual {v1}, Lz2/k;->c()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    int-to-long v4, v1

    .line 70
    sub-long/2addr v2, v4

    .line 71
    iput-wide v2, v13, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 72
    .line 73
    const-wide/16 v9, 0x0

    .line 74
    .line 75
    cmp-long v1, v2, v9

    .line 76
    .line 77
    const/4 v8, 0x0

    .line 78
    if-eqz v1, :cond_3

    .line 79
    .line 80
    iget-object v1, v12, Lz2/d$e;->b:Lz2/d;

    .line 81
    .line 82
    invoke-virtual {v1}, Lz2/d;->C()Ljava/util/Map;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    iget-object v1, v12, Lz2/d$e;->b:Lz2/d;

    .line 94
    .line 95
    invoke-virtual {v1}, Lz2/d;->C()Ljava/util/Map;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    new-array v2, v8, [Lz2/g;

    .line 104
    .line 105
    invoke-interface {v1, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    if-eqz v1, :cond_2

    .line 110
    .line 111
    check-cast v1, [Lz2/g;

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_2
    new-instance v0, Ljava/lang/NullPointerException;

    .line 115
    .line 116
    const-string v1, "null cannot be cast to non-null type kotlin.Array<T>"

    .line 117
    .line 118
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw v0

    .line 122
    :cond_3
    :goto_1
    const/4 v1, 0x0

    .line 123
    :goto_2
    iput-object v1, v14, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 124
    .line 125
    iget-object v1, v12, Lz2/d$e;->b:Lz2/d;

    .line 126
    .line 127
    iget-object v2, v15, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v2, Lz2/k;

    .line 130
    .line 131
    invoke-virtual {v1, v2}, Lz2/d;->Q(Lz2/k;)V

    .line 132
    .line 133
    .line 134
    iget-object v1, v12, Lz2/d$e;->b:Lz2/d;

    .line 135
    .line 136
    invoke-static {v1}, Lz2/d;->i(Lz2/d;)Lv2/d;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    new-instance v1, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 143
    .line 144
    .line 145
    iget-object v2, v12, Lz2/d$e;->b:Lz2/d;

    .line 146
    .line 147
    invoke-virtual {v2}, Lz2/d;->v()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const-string v2, " onSettings"

    .line 155
    .line 156
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    const/4 v5, 0x1

    .line 164
    new-instance v6, Lz2/d$e$a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 165
    .line 166
    move-object v1, v6

    .line 167
    move-object v2, v4

    .line 168
    move v3, v5

    .line 169
    move-object/from16 v17, v6

    .line 170
    .line 171
    move-object/from16 v6, p0

    .line 172
    .line 173
    move-object/from16 v18, v7

    .line 174
    .line 175
    move-object v7, v15

    .line 176
    move/from16 v19, v8

    .line 177
    .line 178
    move/from16 v8, p1

    .line 179
    .line 180
    move-object/from16 v9, p2

    .line 181
    .line 182
    move-object v10, v13

    .line 183
    move-object/from16 v20, v11

    .line 184
    .line 185
    move-object v11, v14

    .line 186
    :try_start_2
    invoke-direct/range {v1 .. v11}, Lz2/d$e$a;-><init>(Ljava/lang/String;ZLjava/lang/String;ZLz2/d$e;Lkotlin/jvm/internal/Ref$ObjectRef;ZLz2/k;Lkotlin/jvm/internal/Ref$LongRef;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    .line 187
    .line 188
    .line 189
    move-object/from16 v1, v17

    .line 190
    .line 191
    move-object/from16 v0, v18

    .line 192
    .line 193
    const-wide/16 v2, 0x0

    .line 194
    .line 195
    invoke-virtual {v0, v1, v2, v3}, Lv2/d;->i(Lv2/a;J)V

    .line 196
    .line 197
    .line 198
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 199
    .line 200
    :try_start_3
    monitor-exit v20
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 201
    :try_start_4
    iget-object v0, v12, Lz2/d$e;->b:Lz2/d;

    .line 202
    .line 203
    invoke-virtual {v0}, Lz2/d;->E()Lz2/h;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    iget-object v1, v15, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v1, Lz2/k;

    .line 210
    .line 211
    invoke-virtual {v0, v1}, Lz2/h;->a(Lz2/k;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 212
    .line 213
    .line 214
    goto :goto_3

    .line 215
    :catch_0
    move-exception v0

    .line 216
    :try_start_5
    iget-object v1, v12, Lz2/d$e;->b:Lz2/d;

    .line 217
    .line 218
    invoke-static {v1, v0}, Lz2/d;->a(Lz2/d;Ljava/io/IOException;)V

    .line 219
    .line 220
    .line 221
    :goto_3
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 222
    .line 223
    monitor-exit v16

    .line 224
    iget-object v0, v14, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 225
    .line 226
    move-object v1, v0

    .line 227
    check-cast v1, [Lz2/g;

    .line 228
    .line 229
    if-eqz v1, :cond_4

    .line 230
    .line 231
    check-cast v0, [Lz2/g;

    .line 232
    .line 233
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    array-length v1, v0

    .line 237
    move/from16 v8, v19

    .line 238
    .line 239
    :goto_4
    if-ge v8, v1, :cond_4

    .line 240
    .line 241
    aget-object v2, v0, v8

    .line 242
    .line 243
    monitor-enter v2

    .line 244
    :try_start_6
    iget-wide v3, v13, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 245
    .line 246
    invoke-virtual {v2, v3, v4}, Lz2/g;->a(J)V

    .line 247
    .line 248
    .line 249
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 250
    .line 251
    monitor-exit v2

    .line 252
    add-int/lit8 v8, v8, 0x1

    .line 253
    .line 254
    goto :goto_4

    .line 255
    :catchall_0
    move-exception v0

    .line 256
    monitor-exit v2

    .line 257
    throw v0

    .line 258
    :cond_4
    return-void

    .line 259
    :catchall_1
    move-exception v0

    .line 260
    goto :goto_5

    .line 261
    :catchall_2
    move-exception v0

    .line 262
    move-object/from16 v20, v11

    .line 263
    .line 264
    :goto_5
    :try_start_7
    monitor-exit v20

    .line 265
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 266
    :catchall_3
    move-exception v0

    .line 267
    monitor-exit v16

    .line 268
    throw v0
.end method

.method public l()V
    .locals 5

    .line 1
    sget-object v0, Lokhttp3/internal/http2/ErrorCode;->d:Lokhttp3/internal/http2/ErrorCode;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    iget-object v2, p0, Lz2/d$e;->a:Lz2/f;

    .line 5
    .line 6
    invoke-virtual {v2, p0}, Lz2/f;->c(Lz2/f$c;)V

    .line 7
    .line 8
    .line 9
    :goto_0
    iget-object v2, p0, Lz2/d$e;->a:Lz2/f;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-virtual {v2, v3, p0}, Lz2/f;->b(ZLz2/f$c;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    sget-object v2, Lokhttp3/internal/http2/ErrorCode;->b:Lokhttp3/internal/http2/ErrorCode;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    :try_start_1
    sget-object v0, Lokhttp3/internal/http2/ErrorCode;->j:Lokhttp3/internal/http2/ErrorCode;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 22
    .line 23
    iget-object v3, p0, Lz2/d$e;->b:Lz2/d;

    .line 24
    .line 25
    invoke-virtual {v3, v2, v0, v1}, Lz2/d;->s(Lokhttp3/internal/http2/ErrorCode;Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V

    .line 26
    .line 27
    .line 28
    goto :goto_2

    .line 29
    :catch_0
    move-exception v1

    .line 30
    goto :goto_1

    .line 31
    :catchall_0
    move-exception v3

    .line 32
    move-object v2, v0

    .line 33
    goto :goto_3

    .line 34
    :catch_1
    move-exception v1

    .line 35
    move-object v2, v0

    .line 36
    :goto_1
    :try_start_2
    sget-object v0, Lokhttp3/internal/http2/ErrorCode;->c:Lokhttp3/internal/http2/ErrorCode;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 37
    .line 38
    iget-object v2, p0, Lz2/d$e;->b:Lz2/d;

    .line 39
    .line 40
    invoke-virtual {v2, v0, v0, v1}, Lz2/d;->s(Lokhttp3/internal/http2/ErrorCode;Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V

    .line 41
    .line 42
    .line 43
    :goto_2
    iget-object v0, p0, Lz2/d$e;->a:Lz2/f;

    .line 44
    .line 45
    invoke-static {v0}, Ls2/b;->j(Ljava/io/Closeable;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :catchall_1
    move-exception v3

    .line 50
    :goto_3
    iget-object v4, p0, Lz2/d$e;->b:Lz2/d;

    .line 51
    .line 52
    invoke-virtual {v4, v2, v0, v1}, Lz2/d;->s(Lokhttp3/internal/http2/ErrorCode;Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lz2/d$e;->a:Lz2/f;

    .line 56
    .line 57
    invoke-static {v0}, Ls2/b;->j(Ljava/io/Closeable;)V

    .line 58
    .line 59
    .line 60
    throw v3
.end method
