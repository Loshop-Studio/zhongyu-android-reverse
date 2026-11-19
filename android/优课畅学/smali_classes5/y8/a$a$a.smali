.class public Ly8/a$a$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly8/a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public a:Z

.field public b:Z

.field public c:Z

.field public d:Z

.field public final synthetic e:Ly8/a$a;


# direct methods
.method public constructor <init>(Ly8/a$a;Landroid/os/Looper;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lz8/c;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Lz8/c;->w()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_3

    .line 6
    .line 7
    invoke-virtual {p1}, Lz8/c;->b()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    iget-object v2, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 12
    .line 13
    iget-object v2, v2, Ly8/a$a;->j:Ly8/a;

    .line 14
    .line 15
    invoke-static {v2}, Ly8/a;->v(Ly8/a;)Lz8/e;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-wide v2, v2, Lz8/e;->a:J

    .line 20
    .line 21
    iget-object v4, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 22
    .line 23
    iget-object v4, v4, Ly8/a$a;->j:Ly8/a;

    .line 24
    .line 25
    iget-object v4, v4, Ly8/e;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 26
    .line 27
    iget-object v4, v4, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->A:La9/c;

    .line 28
    .line 29
    iget-wide v4, v4, La9/c;->e:J

    .line 30
    .line 31
    add-long/2addr v2, v4

    .line 32
    cmp-long v0, v0, v2

    .line 33
    .line 34
    if-lez v0, :cond_0

    .line 35
    .line 36
    iget-boolean v0, p1, Lz8/c;->y:Z

    .line 37
    .line 38
    if-nez v0, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iget-byte v0, p1, Lz8/c;->n:B

    .line 42
    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    invoke-virtual {p1}, Lz8/c;->o()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    invoke-virtual {p1}, Lz8/c;->e()Lz8/n;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    invoke-interface {v0}, Lz8/n;->get()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-nez v0, :cond_3

    .line 63
    .line 64
    :cond_2
    const/4 v0, 0x1

    .line 65
    invoke-virtual {p0, p1, v0}, Ly8/a$a$a;->c(Lz8/c;Z)B

    .line 66
    .line 67
    .line 68
    :cond_3
    :goto_0
    return-void
.end method

.method public b()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 6
    .line 7
    iget-object v0, v0, Ly8/a$a;->j:Ly8/a;

    .line 8
    .line 9
    iget-object v0, v0, Ly8/e;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 10
    .line 11
    iget-object v0, v0, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->A:La9/c;

    .line 12
    .line 13
    iget-wide v0, v0, La9/c;->e:J

    .line 14
    .line 15
    const/4 v2, 0x4

    .line 16
    invoke-virtual {p0, v2, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final c(Lz8/c;Z)B
    .locals 6

    .line 1
    invoke-virtual {p1}, Lz8/c;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 9
    .line 10
    iget-object v0, v0, Ly8/a$a;->j:Ly8/a;

    .line 11
    .line 12
    iget-object v0, v0, Ly8/e;->b:Lz8/a;

    .line 13
    .line 14
    invoke-virtual {p1, v0, v1}, Lz8/c;->z(Lz8/m;Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :try_start_0
    iget-object v2, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 19
    .line 20
    const/16 v3, 0x14

    .line 21
    .line 22
    invoke-static {v2, p1, v1, v3}, Ly8/a$a;->c(Ly8/a$a;Lz8/c;ZI)Lz8/c;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    iget-object v2, v2, Lz8/c;->x:Lz8/n;

    .line 29
    .line 30
    check-cast v2, La9/e;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move-object v2, v0

    .line 34
    :goto_0
    const/4 v3, 0x0

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    :try_start_1
    invoke-virtual {v2}, La9/e;->k()V

    .line 38
    .line 39
    .line 40
    iput-object v2, p1, Lz8/c;->x:Lz8/n;

    .line 41
    .line 42
    iget-object v0, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 43
    .line 44
    iget-object v0, v0, Ly8/a$a;->j:Ly8/a;

    .line 45
    .line 46
    invoke-static {v0}, Ly8/a;->u(Ly8/a;)Ly8/a$a;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {v0, p1, v3, p2}, Ly8/a$a;->f(Ly8/a$a;Lz8/c;IZ)Z

    .line 51
    .line 52
    .line 53
    return v3

    .line 54
    :catch_0
    move-object v0, v2

    .line 55
    goto/16 :goto_1

    .line 56
    .line 57
    :catch_1
    move-object v0, v2

    .line 58
    goto/16 :goto_2

    .line 59
    .line 60
    :cond_2
    iget-object v4, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 61
    .line 62
    const/16 v5, 0x32

    .line 63
    .line 64
    invoke-static {v4, p1, v3, v5}, Ly8/a$a;->c(Ly8/a$a;Lz8/c;ZI)Lz8/c;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    if-eqz v4, :cond_3

    .line 69
    .line 70
    iget-object v5, v4, Lz8/c;->x:Lz8/n;

    .line 71
    .line 72
    check-cast v5, La9/e;

    .line 73
    .line 74
    move-object v2, v5

    .line 75
    :cond_3
    if-eqz v2, :cond_4

    .line 76
    .line 77
    iput-object v0, v4, Lz8/c;->x:Lz8/n;

    .line 78
    .line 79
    iget-object v0, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 80
    .line 81
    iget-object v0, v0, Ly8/a$a;->j:Ly8/a;

    .line 82
    .line 83
    iget-object v0, v0, Ly8/e;->b:Lz8/a;

    .line 84
    .line 85
    invoke-static {p1, v0, v2}, Lf9/b;->a(Lz8/c;Lz8/m;La9/e;)La9/e;

    .line 86
    .line 87
    .line 88
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 89
    :try_start_2
    iput-object v0, p1, Lz8/c;->x:Lz8/n;

    .line 90
    .line 91
    iget-object v2, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 92
    .line 93
    iget-object v2, v2, Ly8/a$a;->j:Ly8/a;

    .line 94
    .line 95
    invoke-static {v2}, Ly8/a;->u(Ly8/a;)Ly8/a$a;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-static {v2, p1, v3, p2}, Ly8/a$a;->f(Ly8/a$a;Lz8/c;IZ)Z
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 100
    .line 101
    .line 102
    return v3

    .line 103
    :cond_4
    if-nez p2, :cond_5

    .line 104
    .line 105
    :try_start_3
    iget v0, p1, Lz8/c;->o:F

    .line 106
    .line 107
    float-to-int v0, v0

    .line 108
    iget v3, p1, Lz8/c;->p:F

    .line 109
    .line 110
    float-to-int v3, v3

    .line 111
    invoke-static {v0, v3}, Lf9/b;->f(II)I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    iget-object v3, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 116
    .line 117
    invoke-static {v3}, Ly8/a$a;->d(Ly8/a$a;)I

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    add-int/2addr v3, v0

    .line 122
    iget-object v0, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 123
    .line 124
    invoke-static {v0}, Ly8/a$a;->e(Ly8/a$a;)I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-le v3, v0, :cond_5

    .line 129
    .line 130
    return v1

    .line 131
    :cond_5
    iget-object v0, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 132
    .line 133
    iget-object v0, v0, Ly8/a$a;->d:Lb9/b;

    .line 134
    .line 135
    invoke-interface {v0}, Lb9/b;->acquire()Lb9/c;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    check-cast v0, La9/e;
    :try_end_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 140
    .line 141
    :try_start_4
    iget-object v2, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 142
    .line 143
    iget-object v2, v2, Ly8/a$a;->j:Ly8/a;

    .line 144
    .line 145
    iget-object v2, v2, Ly8/e;->b:Lz8/a;

    .line 146
    .line 147
    invoke-static {p1, v2, v0}, Lf9/b;->a(Lz8/c;Lz8/m;La9/e;)La9/e;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    iput-object v0, p1, Lz8/c;->x:Lz8/n;

    .line 152
    .line 153
    iget-object v2, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 154
    .line 155
    iget-object v2, v2, Ly8/a$a;->j:Ly8/a;

    .line 156
    .line 157
    invoke-static {v2}, Ly8/a;->u(Ly8/a;)Ly8/a$a;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    iget-object v3, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 162
    .line 163
    invoke-virtual {v3, p1}, Ly8/a$a;->F(Lz8/c;)I

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    invoke-static {v2, p1, v3, p2}, Ly8/a$a;->f(Ly8/a$a;Lz8/c;IZ)Z

    .line 168
    .line 169
    .line 170
    move-result p2

    .line 171
    if-nez p2, :cond_6

    .line 172
    .line 173
    invoke-virtual {p0, p1, v0}, Ly8/a$a$a;->j(Lz8/c;La9/e;)V
    :try_end_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 174
    .line 175
    .line 176
    :cond_6
    xor-int/lit8 p1, p2, 0x1

    .line 177
    .line 178
    return p1

    .line 179
    :catch_2
    :goto_1
    invoke-virtual {p0, p1, v0}, Ly8/a$a$a;->j(Lz8/c;La9/e;)V

    .line 180
    .line 181
    .line 182
    return v1

    .line 183
    :catch_3
    :goto_2
    invoke-virtual {p0, p1, v0}, Ly8/a$a$a;->j(Lz8/c;La9/e;)V

    .line 184
    .line 185
    .line 186
    return v1
.end method

.method public d(Lz8/c;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Lz8/c;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 9
    .line 10
    iget-object v0, v0, Ly8/a$a;->j:Ly8/a;

    .line 11
    .line 12
    iget-object v0, v0, Ly8/e;->b:Lz8/a;

    .line 13
    .line 14
    invoke-virtual {p1, v0, v1}, Lz8/c;->z(Lz8/m;Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    :try_start_0
    iget-object v3, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 20
    .line 21
    iget-object v3, v3, Ly8/a$a;->d:Lb9/b;

    .line 22
    .line 23
    invoke-interface {v3}, Lb9/b;->acquire()Lb9/c;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, La9/e;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    :try_start_1
    iget-object v4, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 30
    .line 31
    iget-object v4, v4, Ly8/a$a;->j:Ly8/a;

    .line 32
    .line 33
    iget-object v4, v4, Ly8/e;->b:Lz8/a;

    .line 34
    .line 35
    invoke-static {p1, v4, v3}, Lf9/b;->a(Lz8/c;Lz8/m;La9/e;)La9/e;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    iput-object v3, p1, Lz8/c;->x:Lz8/n;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 40
    .line 41
    return v1

    .line 42
    :catch_0
    move-object v3, v2

    .line 43
    goto :goto_0

    .line 44
    :catch_1
    move-object v3, v2

    .line 45
    goto :goto_1

    .line 46
    :catch_2
    :goto_0
    if-eqz v3, :cond_1

    .line 47
    .line 48
    iget-object v1, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 49
    .line 50
    iget-object v1, v1, Ly8/a$a;->d:Lb9/b;

    .line 51
    .line 52
    invoke-interface {v1, v3}, Lb9/b;->a(Lb9/c;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    iput-object v2, p1, Lz8/c;->x:Lz8/n;

    .line 56
    .line 57
    return v0

    .line 58
    :catch_3
    :goto_1
    if-eqz v3, :cond_2

    .line 59
    .line 60
    iget-object v1, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 61
    .line 62
    iget-object v1, v1, Ly8/a$a;->d:Lb9/b;

    .line 63
    .line 64
    invoke-interface {v1, v3}, Lb9/b;->a(Lb9/c;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    iput-object v2, p1, Lz8/c;->x:Lz8/n;

    .line 68
    .line 69
    return v0
.end method

.method public final e()J
    .locals 13

    .line 1
    iget-object v0, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 2
    .line 3
    iget-object v0, v0, Ly8/a$a;->j:Ly8/a;

    .line 4
    .line 5
    invoke-static {v0}, Ly8/a;->v(Ly8/a;)Lz8/e;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-wide v0, v0, Lz8/e;->a:J

    .line 10
    .line 11
    iget-object v2, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 12
    .line 13
    iget-object v3, v2, Ly8/a$a;->j:Ly8/a;

    .line 14
    .line 15
    iget-object v4, v3, Ly8/e;->g:Lz8/e;

    .line 16
    .line 17
    iget-wide v4, v4, Lz8/e;->a:J

    .line 18
    .line 19
    iget-object v3, v3, Ly8/e;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 20
    .line 21
    iget-object v3, v3, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->A:La9/c;

    .line 22
    .line 23
    iget-wide v6, v3, La9/c;->e:J

    .line 24
    .line 25
    sub-long/2addr v4, v6

    .line 26
    cmp-long v0, v0, v4

    .line 27
    .line 28
    const/4 v1, 0x3

    .line 29
    const-wide/16 v3, 0x0

    .line 30
    .line 31
    if-gtz v0, :cond_0

    .line 32
    .line 33
    invoke-static {v2}, Ly8/a$a;->b(Ly8/a$a;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 37
    .line 38
    iget-object v0, v0, Ly8/a$a;->j:Ly8/a;

    .line 39
    .line 40
    invoke-static {v0}, Ly8/a;->v(Ly8/a;)Lz8/e;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-object v2, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 45
    .line 46
    iget-object v2, v2, Ly8/a$a;->j:Ly8/a;

    .line 47
    .line 48
    iget-object v2, v2, Ly8/e;->g:Lz8/e;

    .line 49
    .line 50
    iget-wide v5, v2, Lz8/e;->a:J

    .line 51
    .line 52
    invoke-virtual {v0, v5, v6}, Lz8/e;->b(J)J

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 56
    .line 57
    .line 58
    return-wide v3

    .line 59
    :cond_0
    invoke-virtual {v2}, Ly8/a$a;->y()F

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    iget-object v2, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 64
    .line 65
    iget-object v2, v2, Ly8/a$a;->b:La9/d;

    .line 66
    .line 67
    invoke-virtual {v2}, La9/d;->first()Lz8/c;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    if-eqz v2, :cond_1

    .line 72
    .line 73
    invoke-virtual {v2}, Lz8/c;->b()J

    .line 74
    .line 75
    .line 76
    move-result-wide v5

    .line 77
    iget-object v7, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 78
    .line 79
    iget-object v7, v7, Ly8/a$a;->j:Ly8/a;

    .line 80
    .line 81
    iget-object v7, v7, Ly8/e;->g:Lz8/e;

    .line 82
    .line 83
    iget-wide v7, v7, Lz8/e;->a:J

    .line 84
    .line 85
    sub-long/2addr v5, v7

    .line 86
    goto :goto_0

    .line 87
    :cond_1
    move-wide v5, v3

    .line 88
    :goto_0
    iget-object v7, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 89
    .line 90
    iget-object v7, v7, Ly8/a$a;->j:Ly8/a;

    .line 91
    .line 92
    iget-object v8, v7, Ly8/e;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 93
    .line 94
    iget-object v8, v8, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->A:La9/c;

    .line 95
    .line 96
    iget-wide v8, v8, La9/c;->e:J

    .line 97
    .line 98
    const-wide/16 v10, 0x2

    .line 99
    .line 100
    mul-long/2addr v10, v8

    .line 101
    const v12, 0x3f19999a    # 0.6f

    .line 102
    .line 103
    .line 104
    cmpg-float v12, v0, v12

    .line 105
    .line 106
    if-gez v12, :cond_2

    .line 107
    .line 108
    cmp-long v8, v5, v8

    .line 109
    .line 110
    if-lez v8, :cond_2

    .line 111
    .line 112
    invoke-static {v7}, Ly8/a;->v(Ly8/a;)Lz8/e;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    iget-object v2, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 117
    .line 118
    iget-object v2, v2, Ly8/a$a;->j:Ly8/a;

    .line 119
    .line 120
    iget-object v2, v2, Ly8/e;->g:Lz8/e;

    .line 121
    .line 122
    iget-wide v5, v2, Lz8/e;->a:J

    .line 123
    .line 124
    invoke-virtual {v0, v5, v6}, Lz8/e;->b(J)J

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 131
    .line 132
    .line 133
    return-wide v3

    .line 134
    :cond_2
    const v8, 0x3ecccccd    # 0.4f

    .line 135
    .line 136
    .line 137
    cmpl-float v8, v0, v8

    .line 138
    .line 139
    if-lez v8, :cond_3

    .line 140
    .line 141
    neg-long v8, v10

    .line 142
    cmp-long v5, v5, v8

    .line 143
    .line 144
    if-gez v5, :cond_3

    .line 145
    .line 146
    const/4 v0, 0x4

    .line 147
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 151
    .line 152
    .line 153
    return-wide v3

    .line 154
    :cond_3
    const v5, 0x3f666666    # 0.9f

    .line 155
    .line 156
    .line 157
    cmpl-float v0, v0, v5

    .line 158
    .line 159
    if-ltz v0, :cond_4

    .line 160
    .line 161
    return-wide v3

    .line 162
    :cond_4
    invoke-static {v7}, Ly8/a;->v(Ly8/a;)Lz8/e;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    iget-wide v5, v0, Lz8/e;->a:J

    .line 167
    .line 168
    iget-object v0, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 169
    .line 170
    iget-object v0, v0, Ly8/a$a;->j:Ly8/a;

    .line 171
    .line 172
    iget-object v0, v0, Ly8/e;->g:Lz8/e;

    .line 173
    .line 174
    iget-wide v7, v0, Lz8/e;->a:J

    .line 175
    .line 176
    sub-long/2addr v5, v7

    .line 177
    if-eqz v2, :cond_5

    .line 178
    .line 179
    invoke-virtual {v2}, Lz8/c;->w()Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    if-eqz v0, :cond_5

    .line 184
    .line 185
    iget-object v0, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 186
    .line 187
    iget-object v0, v0, Ly8/a$a;->j:Ly8/a;

    .line 188
    .line 189
    iget-object v2, v0, Ly8/e;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 190
    .line 191
    iget-object v2, v2, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->A:La9/c;

    .line 192
    .line 193
    iget-wide v7, v2, La9/c;->e:J

    .line 194
    .line 195
    neg-long v7, v7

    .line 196
    cmp-long v2, v5, v7

    .line 197
    .line 198
    if-gez v2, :cond_5

    .line 199
    .line 200
    invoke-static {v0}, Ly8/a;->v(Ly8/a;)Lz8/e;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    iget-object v2, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 205
    .line 206
    iget-object v2, v2, Ly8/a$a;->j:Ly8/a;

    .line 207
    .line 208
    iget-object v2, v2, Ly8/e;->g:Lz8/e;

    .line 209
    .line 210
    iget-wide v5, v2, Lz8/e;->a:J

    .line 211
    .line 212
    invoke-virtual {v0, v5, v6}, Lz8/e;->b(J)J

    .line 213
    .line 214
    .line 215
    const/16 v0, 0x8

    .line 216
    .line 217
    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 218
    .line 219
    .line 220
    invoke-virtual {p0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 221
    .line 222
    .line 223
    return-wide v3

    .line 224
    :cond_5
    cmp-long v0, v5, v10

    .line 225
    .line 226
    if-lez v0, :cond_6

    .line 227
    .line 228
    return-wide v3

    .line 229
    :cond_6
    invoke-virtual {p0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {p0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 233
    .line 234
    .line 235
    return-wide v3
.end method

.method public f(Z)V
    .locals 0

    .line 1
    xor-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    iput-boolean p1, p0, Ly8/a$a$a;->b:Z

    .line 4
    .line 5
    return-void
.end method

.method public g()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ly8/a$a$a;->a:Z

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x6

    .line 9
    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final h()V
    .locals 9

    .line 1
    :try_start_0
    iget-object v0, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 2
    .line 3
    iget-object v0, v0, Ly8/a$a;->j:Ly8/a;

    .line 4
    .line 5
    iget-object v1, v0, Ly8/e;->g:Lz8/e;

    .line 6
    .line 7
    iget-wide v1, v1, Lz8/e;->a:J

    .line 8
    .line 9
    iget-object v3, v0, Ly8/e;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 10
    .line 11
    iget-object v3, v3, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->A:La9/c;

    .line 12
    .line 13
    iget-wide v3, v3, La9/c;->e:J

    .line 14
    .line 15
    const-wide/16 v5, 0x2

    .line 16
    .line 17
    mul-long/2addr v5, v3

    .line 18
    add-long/2addr v5, v1

    .line 19
    iget-object v0, v0, Ly8/e;->c:Lz8/l;

    .line 20
    .line 21
    sub-long/2addr v1, v3

    .line 22
    invoke-interface {v0, v1, v2, v5, v6}, Lz8/l;->a(JJ)Lz8/l;

    .line 23
    .line 24
    .line 25
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    goto :goto_0

    .line 27
    :catch_0
    const/4 v0, 0x0

    .line 28
    :goto_0
    if-eqz v0, :cond_5

    .line 29
    .line 30
    invoke-interface {v0}, Lz8/l;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_0
    invoke-interface {v0}, Lz8/l;->iterator()Lz8/k;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :cond_1
    :goto_1
    invoke-interface {v0}, Lz8/k;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_5

    .line 46
    .line 47
    iget-boolean v1, p0, Ly8/a$a$a;->a:Z

    .line 48
    .line 49
    if-nez v1, :cond_5

    .line 50
    .line 51
    invoke-interface {v0}, Lz8/k;->next()Lz8/c;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {v3}, Lz8/c;->n()Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_2

    .line 60
    .line 61
    iget-object v1, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 62
    .line 63
    iget-object v1, v1, Ly8/a$a;->j:Ly8/a;

    .line 64
    .line 65
    iget-object v8, v1, Ly8/e;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 66
    .line 67
    iget-object v2, v8, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->z:Ly8/b;

    .line 68
    .line 69
    const/4 v6, 0x0

    .line 70
    const/4 v7, 0x1

    .line 71
    const/4 v4, 0x0

    .line 72
    const/4 v5, 0x0

    .line 73
    invoke-virtual/range {v2 .. v8}, Ly8/b;->b(Lz8/c;IILz8/e;ZLmaster/flame/danmaku/danmaku/model/android/DanmakuContext;)V

    .line 74
    .line 75
    .line 76
    :cond_2
    invoke-virtual {v3}, Lz8/c;->o()Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-eqz v1, :cond_3

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    invoke-virtual {v3}, Lz8/c;->q()Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    const/4 v2, 0x1

    .line 88
    if-nez v1, :cond_4

    .line 89
    .line 90
    iget-object v1, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 91
    .line 92
    iget-object v1, v1, Ly8/a$a;->j:Ly8/a;

    .line 93
    .line 94
    iget-object v1, v1, Ly8/e;->b:Lz8/a;

    .line 95
    .line 96
    invoke-virtual {v3, v1, v2}, Lz8/c;->z(Lz8/m;Z)V

    .line 97
    .line 98
    .line 99
    :cond_4
    invoke-virtual {v3}, Lz8/c;->u()Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-nez v1, :cond_1

    .line 104
    .line 105
    iget-object v1, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 106
    .line 107
    iget-object v1, v1, Ly8/a$a;->j:Ly8/a;

    .line 108
    .line 109
    iget-object v1, v1, Ly8/e;->b:Lz8/a;

    .line 110
    .line 111
    invoke-virtual {v3, v1, v2}, Lz8/c;->A(Lz8/m;Z)V

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_5
    :goto_2
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 8

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    packed-switch v0, :pswitch_data_1

    .line 10
    .line 11
    .line 12
    goto/16 :goto_4

    .line 13
    .line 14
    :pswitch_0
    iput-boolean v2, p0, Ly8/a$a$a;->d:Z

    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p1, Lz8/c;

    .line 20
    .line 21
    invoke-virtual {p1}, Lz8/c;->w()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_a

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Ly8/a$a$a;->d(Lz8/c;)Z

    .line 28
    .line 29
    .line 30
    iget-object v0, p1, Lz8/c;->x:Lz8/n;

    .line 31
    .line 32
    if-eqz v0, :cond_a

    .line 33
    .line 34
    iget-object v1, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 35
    .line 36
    invoke-interface {v0}, Lz8/n;->size()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-static {v1, p1, v0, v3}, Ly8/a$a;->f(Ly8/a$a;Lz8/c;IZ)Z

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_2
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Lz8/c;

    .line 47
    .line 48
    if-eqz p1, :cond_a

    .line 49
    .line 50
    invoke-virtual {p1}, Lz8/c;->e()Lz8/n;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget v4, p1, Lz8/c;->I:I

    .line 55
    .line 56
    and-int/2addr v4, v3

    .line 57
    if-eqz v4, :cond_0

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    if-eqz v0, :cond_1

    .line 61
    .line 62
    invoke-interface {v0}, Lz8/n;->get()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    if-eqz v4, :cond_1

    .line 67
    .line 68
    invoke-interface {v0}, Lz8/n;->hasReferences()Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-nez v4, :cond_1

    .line 73
    .line 74
    iget-object v0, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 75
    .line 76
    iget-object v0, v0, Ly8/a$a;->j:Ly8/a;

    .line 77
    .line 78
    iget-object v0, v0, Ly8/e;->b:Lz8/a;

    .line 79
    .line 80
    iget-object v1, p1, Lz8/c;->x:Lz8/n;

    .line 81
    .line 82
    check-cast v1, La9/e;

    .line 83
    .line 84
    invoke-static {p1, v0, v1}, Lf9/b;->a(Lz8/c;Lz8/m;La9/e;)La9/e;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iput-object v0, p1, Lz8/c;->x:Lz8/n;

    .line 89
    .line 90
    iget-object v0, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 91
    .line 92
    invoke-static {v0, p1, v2, v3}, Ly8/a$a;->f(Ly8/a$a;Lz8/c;IZ)Z

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_1
    :goto_0
    iget-boolean v2, p1, Lz8/c;->y:Z

    .line 97
    .line 98
    if-eqz v2, :cond_2

    .line 99
    .line 100
    iget-object v0, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 101
    .line 102
    invoke-static {v0, p1}, Ly8/a$a;->g(Ly8/a$a;Lz8/c;)J

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0, p1}, Ly8/a$a$a;->d(Lz8/c;)Z

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :cond_2
    if-eqz v0, :cond_3

    .line 110
    .line 111
    invoke-interface {v0}, Lz8/n;->hasReferences()Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-eqz v2, :cond_3

    .line 116
    .line 117
    invoke-interface {v0}, Lz8/n;->destroy()V

    .line 118
    .line 119
    .line 120
    :cond_3
    iget-object v0, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 121
    .line 122
    invoke-virtual {v0, v3, p1, v1}, Ly8/a$a;->s(ZLz8/c;Lz8/c;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, p1}, Ly8/a$a$a;->a(Lz8/c;)V

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :pswitch_3
    iget-object p1, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 130
    .line 131
    invoke-static {p1, v3}, Ly8/a$a;->k(Ly8/a$a;Z)V

    .line 132
    .line 133
    .line 134
    iget-object p1, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 135
    .line 136
    iget-object p1, p1, Ly8/a$a;->j:Ly8/a;

    .line 137
    .line 138
    invoke-static {p1}, Ly8/a;->v(Ly8/a;)Lz8/e;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    iget-object v0, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 143
    .line 144
    iget-object v0, v0, Ly8/a$a;->j:Ly8/a;

    .line 145
    .line 146
    iget-object v0, v0, Ly8/e;->g:Lz8/e;

    .line 147
    .line 148
    iget-wide v0, v0, Lz8/e;->a:J

    .line 149
    .line 150
    invoke-virtual {p1, v0, v1}, Lz8/e;->b(J)J

    .line 151
    .line 152
    .line 153
    iget-object p1, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 154
    .line 155
    iget-object p1, p1, Ly8/a$a;->j:Ly8/a;

    .line 156
    .line 157
    invoke-virtual {p1}, Ly8/e;->e()V

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :pswitch_4
    iget-object p1, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 162
    .line 163
    invoke-static {p1, v3}, Ly8/a$a;->k(Ly8/a$a;Z)V

    .line 164
    .line 165
    .line 166
    iget-object p1, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 167
    .line 168
    iget-object p1, p1, Ly8/a$a;->j:Ly8/a;

    .line 169
    .line 170
    invoke-static {p1}, Ly8/a;->v(Ly8/a;)Lz8/e;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    iget-object v0, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 175
    .line 176
    iget-object v0, v0, Ly8/a$a;->j:Ly8/a;

    .line 177
    .line 178
    iget-object v0, v0, Ly8/e;->g:Lz8/e;

    .line 179
    .line 180
    iget-wide v0, v0, Lz8/e;->a:J

    .line 181
    .line 182
    invoke-virtual {p1, v0, v1}, Lz8/e;->b(J)J

    .line 183
    .line 184
    .line 185
    return-void

    .line 186
    :pswitch_5
    iget-object p1, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 187
    .line 188
    invoke-static {p1}, Ly8/a$a;->i(Ly8/a$a;)V

    .line 189
    .line 190
    .line 191
    iget-object p1, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 192
    .line 193
    iget-object p1, p1, Ly8/a$a;->j:Ly8/a;

    .line 194
    .line 195
    invoke-static {p1}, Ly8/a;->v(Ly8/a;)Lz8/e;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    iget-object v0, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 200
    .line 201
    iget-object v0, v0, Ly8/a$a;->j:Ly8/a;

    .line 202
    .line 203
    iget-object v1, v0, Ly8/e;->g:Lz8/e;

    .line 204
    .line 205
    iget-wide v1, v1, Lz8/e;->a:J

    .line 206
    .line 207
    iget-object v0, v0, Ly8/e;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 208
    .line 209
    iget-object v0, v0, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->A:La9/c;

    .line 210
    .line 211
    iget-wide v4, v0, La9/c;->e:J

    .line 212
    .line 213
    sub-long/2addr v1, v4

    .line 214
    invoke-virtual {p1, v1, v2}, Lz8/e;->b(J)J

    .line 215
    .line 216
    .line 217
    iput-boolean v3, p0, Ly8/a$a$a;->c:Z

    .line 218
    .line 219
    return-void

    .line 220
    :pswitch_6
    invoke-virtual {p0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    iput-boolean v3, p0, Ly8/a$a$a;->a:Z

    .line 224
    .line 225
    iget-object p1, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 226
    .line 227
    invoke-static {p1}, Ly8/a$a;->i(Ly8/a$a;)V

    .line 228
    .line 229
    .line 230
    iget-object p1, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 231
    .line 232
    invoke-static {p1}, Ly8/a$a;->j(Ly8/a$a;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {p0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    invoke-virtual {p1}, Landroid/os/Looper;->quit()V

    .line 240
    .line 241
    .line 242
    return-void

    .line 243
    :pswitch_7
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast p1, Ljava/lang/Long;

    .line 246
    .line 247
    if-eqz p1, :cond_a

    .line 248
    .line 249
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 250
    .line 251
    .line 252
    move-result-wide v0

    .line 253
    iget-object p1, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 254
    .line 255
    iget-object p1, p1, Ly8/a$a;->j:Ly8/a;

    .line 256
    .line 257
    invoke-static {p1}, Ly8/a;->v(Ly8/a;)Lz8/e;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    iget-wide v4, p1, Lz8/e;->a:J

    .line 262
    .line 263
    iget-object p1, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 264
    .line 265
    iget-object p1, p1, Ly8/a$a;->j:Ly8/a;

    .line 266
    .line 267
    invoke-static {p1}, Ly8/a;->v(Ly8/a;)Lz8/e;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    invoke-virtual {p1, v0, v1}, Lz8/e;->b(J)J

    .line 272
    .line 273
    .line 274
    iput-boolean v3, p0, Ly8/a$a$a;->c:Z

    .line 275
    .line 276
    iget-object p1, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 277
    .line 278
    invoke-virtual {p1}, Ly8/a$a;->x()J

    .line 279
    .line 280
    .line 281
    move-result-wide v6

    .line 282
    cmp-long p1, v0, v4

    .line 283
    .line 284
    if-gtz p1, :cond_5

    .line 285
    .line 286
    sub-long/2addr v6, v0

    .line 287
    iget-object p1, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 288
    .line 289
    iget-object v0, p1, Ly8/a$a;->j:Ly8/a;

    .line 290
    .line 291
    iget-object v0, v0, Ly8/e;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 292
    .line 293
    iget-object v0, v0, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->A:La9/c;

    .line 294
    .line 295
    iget-wide v0, v0, La9/c;->e:J

    .line 296
    .line 297
    cmp-long v0, v6, v0

    .line 298
    .line 299
    if-lez v0, :cond_4

    .line 300
    .line 301
    goto :goto_1

    .line 302
    :cond_4
    invoke-static {p1}, Ly8/a$a;->h(Ly8/a$a;)V

    .line 303
    .line 304
    .line 305
    goto :goto_2

    .line 306
    :cond_5
    :goto_1
    iget-object p1, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 307
    .line 308
    invoke-static {p1}, Ly8/a$a;->b(Ly8/a$a;)V

    .line 309
    .line 310
    .line 311
    :goto_2
    invoke-virtual {p0, v3}, Ly8/a$a$a;->i(Z)J

    .line 312
    .line 313
    .line 314
    invoke-virtual {p0}, Ly8/a$a$a;->m()V

    .line 315
    .line 316
    .line 317
    return-void

    .line 318
    :pswitch_8
    iget-object p1, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 319
    .line 320
    invoke-static {p1}, Ly8/a$a;->h(Ly8/a$a;)V

    .line 321
    .line 322
    .line 323
    return-void

    .line 324
    :pswitch_9
    const/4 p1, 0x3

    .line 325
    invoke-virtual {p0, p1}, Landroid/os/Handler;->removeMessages(I)V

    .line 326
    .line 327
    .line 328
    iget-object p1, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 329
    .line 330
    iget-object p1, p1, Ly8/a$a;->j:Ly8/a;

    .line 331
    .line 332
    iget-object v0, p1, Ly8/e;->e:Ly8/h$a;

    .line 333
    .line 334
    if-eqz v0, :cond_6

    .line 335
    .line 336
    iget-boolean p1, p1, Ly8/e;->l:Z

    .line 337
    .line 338
    if-eqz p1, :cond_7

    .line 339
    .line 340
    :cond_6
    iget-boolean p1, p0, Ly8/a$a$a;->c:Z

    .line 341
    .line 342
    if-eqz p1, :cond_8

    .line 343
    .line 344
    :cond_7
    move p1, v3

    .line 345
    goto :goto_3

    .line 346
    :cond_8
    move p1, v2

    .line 347
    :goto_3
    invoke-virtual {p0, p1}, Ly8/a$a$a;->i(Z)J

    .line 348
    .line 349
    .line 350
    if-eqz p1, :cond_9

    .line 351
    .line 352
    iput-boolean v2, p0, Ly8/a$a$a;->c:Z

    .line 353
    .line 354
    :cond_9
    iget-object p1, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 355
    .line 356
    iget-object p1, p1, Ly8/a$a;->j:Ly8/a;

    .line 357
    .line 358
    iget-object v0, p1, Ly8/e;->e:Ly8/h$a;

    .line 359
    .line 360
    if-eqz v0, :cond_a

    .line 361
    .line 362
    iget-boolean p1, p1, Ly8/e;->l:Z

    .line 363
    .line 364
    if-nez p1, :cond_a

    .line 365
    .line 366
    invoke-interface {v0}, Ly8/h$a;->b()V

    .line 367
    .line 368
    .line 369
    iget-object p1, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 370
    .line 371
    iget-object p1, p1, Ly8/a$a;->j:Ly8/a;

    .line 372
    .line 373
    iput-boolean v3, p1, Ly8/e;->l:Z

    .line 374
    .line 375
    :cond_a
    :goto_4
    return-void

    .line 376
    :pswitch_a
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 377
    .line 378
    check-cast p1, Lz8/c;

    .line 379
    .line 380
    invoke-virtual {p0, p1}, Ly8/a$a$a;->a(Lz8/c;)V

    .line 381
    .line 382
    .line 383
    return-void

    .line 384
    :pswitch_b
    iget-object p1, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 385
    .line 386
    invoke-static {p1}, Ly8/a$a;->b(Ly8/a$a;)V

    .line 387
    .line 388
    .line 389
    :goto_5
    const/16 p1, 0x12c

    .line 390
    .line 391
    if-ge v2, p1, :cond_b

    .line 392
    .line 393
    iget-object p1, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 394
    .line 395
    iget-object p1, p1, Ly8/a$a;->d:Lb9/b;

    .line 396
    .line 397
    new-instance v0, La9/e;

    .line 398
    .line 399
    invoke-direct {v0}, La9/e;-><init>()V

    .line 400
    .line 401
    .line 402
    invoke-interface {p1, v0}, Lb9/b;->a(Lb9/c;)V

    .line 403
    .line 404
    .line 405
    add-int/lit8 v2, v2, 0x1

    .line 406
    .line 407
    goto :goto_5

    .line 408
    :cond_b
    :pswitch_c
    invoke-virtual {p0}, Ly8/a$a$a;->e()J

    .line 409
    .line 410
    .line 411
    move-result-wide v0

    .line 412
    const-wide/16 v2, 0x0

    .line 413
    .line 414
    cmp-long p1, v0, v2

    .line 415
    .line 416
    if-gtz p1, :cond_c

    .line 417
    .line 418
    iget-object p1, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 419
    .line 420
    iget-object p1, p1, Ly8/a$a;->j:Ly8/a;

    .line 421
    .line 422
    iget-object p1, p1, Ly8/e;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 423
    .line 424
    iget-object p1, p1, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->A:La9/c;

    .line 425
    .line 426
    iget-wide v0, p1, La9/c;->e:J

    .line 427
    .line 428
    const-wide/16 v2, 0x2

    .line 429
    .line 430
    div-long/2addr v0, v2

    .line 431
    :cond_c
    const/16 p1, 0x10

    .line 432
    .line 433
    invoke-virtual {p0, p1, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 434
    .line 435
    .line 436
    return-void

    .line 437
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    :pswitch_data_1
    .packed-switch 0x10
        :pswitch_c
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Z)J
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-virtual {v1}, Ly8/a$a$a;->h()V

    .line 4
    .line 5
    .line 6
    iget-object v0, v1, Ly8/a$a$a;->e:Ly8/a$a;

    .line 7
    .line 8
    iget-object v0, v0, Ly8/a$a;->j:Ly8/a;

    .line 9
    .line 10
    invoke-static {v0}, Ly8/a;->v(Ly8/a;)Lz8/e;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-wide v2, v0, Lz8/e;->a:J

    .line 15
    .line 16
    iget-object v0, v1, Ly8/a$a$a;->e:Ly8/a$a;

    .line 17
    .line 18
    iget-object v4, v0, Ly8/a$a;->j:Ly8/a;

    .line 19
    .line 20
    iget-object v4, v4, Ly8/e;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 21
    .line 22
    iget-object v4, v4, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->A:La9/c;

    .line 23
    .line 24
    iget-wide v4, v4, La9/c;->e:J

    .line 25
    .line 26
    invoke-static {v0}, Ly8/a$a;->l(Ly8/a$a;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    int-to-long v6, v0

    .line 31
    mul-long/2addr v4, v6

    .line 32
    add-long/2addr v4, v2

    .line 33
    iget-object v0, v1, Ly8/a$a$a;->e:Ly8/a$a;

    .line 34
    .line 35
    iget-object v0, v0, Ly8/a$a;->j:Ly8/a;

    .line 36
    .line 37
    iget-object v0, v0, Ly8/e;->g:Lz8/e;

    .line 38
    .line 39
    iget-wide v6, v0, Lz8/e;->a:J

    .line 40
    .line 41
    cmp-long v0, v4, v6

    .line 42
    .line 43
    const-wide/16 v6, 0x0

    .line 44
    .line 45
    if-gez v0, :cond_0

    .line 46
    .line 47
    return-wide v6

    .line 48
    :cond_0
    invoke-static {}, Lf9/c;->b()J

    .line 49
    .line 50
    .line 51
    move-result-wide v8

    .line 52
    const/4 v11, 0x0

    .line 53
    const/4 v12, 0x0

    .line 54
    const/4 v13, 0x0

    .line 55
    :goto_0
    const-wide/16 v14, 0xa

    .line 56
    .line 57
    const/4 v0, 0x1

    .line 58
    move-wide/from16 v17, v6

    .line 59
    .line 60
    :try_start_0
    iget-object v6, v1, Ly8/a$a$a;->e:Ly8/a$a;

    .line 61
    .line 62
    iget-object v6, v6, Ly8/a$a;->j:Ly8/a;

    .line 63
    .line 64
    iget-object v6, v6, Ly8/e;->c:Lz8/l;

    .line 65
    .line 66
    invoke-interface {v6, v2, v3, v4, v5}, Lz8/l;->a(JJ)Lz8/l;

    .line 67
    .line 68
    .line 69
    move-result-object v11
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    goto :goto_1

    .line 71
    :catch_0
    invoke-static {v14, v15}, Lf9/c;->a(J)V

    .line 72
    .line 73
    .line 74
    move v13, v0

    .line 75
    :goto_1
    add-int/2addr v12, v0

    .line 76
    const/4 v6, 0x3

    .line 77
    if-ge v12, v6, :cond_2

    .line 78
    .line 79
    if-nez v11, :cond_2

    .line 80
    .line 81
    if-nez v13, :cond_1

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_1
    move-wide/from16 v6, v17

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_2
    :goto_2
    if-nez v11, :cond_3

    .line 88
    .line 89
    iget-object v0, v1, Ly8/a$a$a;->e:Ly8/a$a;

    .line 90
    .line 91
    iget-object v0, v0, Ly8/a$a;->j:Ly8/a;

    .line 92
    .line 93
    invoke-static {v0}, Ly8/a;->v(Ly8/a;)Lz8/e;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v0, v4, v5}, Lz8/e;->b(J)J

    .line 98
    .line 99
    .line 100
    return-wide v17

    .line 101
    :cond_3
    invoke-interface {v11}, Lz8/l;->first()Lz8/c;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    invoke-interface {v11}, Lz8/l;->last()Lz8/c;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    if-eqz v6, :cond_14

    .line 110
    .line 111
    if-nez v7, :cond_4

    .line 112
    .line 113
    goto/16 :goto_c

    .line 114
    .line 115
    :cond_4
    invoke-virtual {v6}, Lz8/c;->b()J

    .line 116
    .line 117
    .line 118
    move-result-wide v12

    .line 119
    iget-object v6, v1, Ly8/a$a$a;->e:Ly8/a$a;

    .line 120
    .line 121
    iget-object v6, v6, Ly8/a$a;->j:Ly8/a;

    .line 122
    .line 123
    move-wide/from16 v19, v14

    .line 124
    .line 125
    iget-object v14, v6, Ly8/e;->g:Lz8/e;

    .line 126
    .line 127
    iget-wide v14, v14, Lz8/e;->a:J

    .line 128
    .line 129
    sub-long/2addr v12, v14

    .line 130
    mul-long v12, v12, v19

    .line 131
    .line 132
    iget-object v6, v6, Ly8/e;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 133
    .line 134
    iget-object v6, v6, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->A:La9/c;

    .line 135
    .line 136
    iget-wide v14, v6, La9/c;->e:J

    .line 137
    .line 138
    div-long/2addr v12, v14

    .line 139
    const-wide/16 v14, 0x1e

    .line 140
    .line 141
    add-long/2addr v12, v14

    .line 142
    const-wide/16 v14, 0x64

    .line 143
    .line 144
    invoke-static {v14, v15, v12, v13}, Ljava/lang/Math;->min(JJ)J

    .line 145
    .line 146
    .line 147
    move-result-wide v12

    .line 148
    if-eqz p1, :cond_5

    .line 149
    .line 150
    move-wide/from16 v12, v17

    .line 151
    .line 152
    :cond_5
    invoke-interface {v11}, Lz8/l;->iterator()Lz8/k;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    invoke-interface {v11}, Lz8/l;->size()I

    .line 157
    .line 158
    .line 159
    move-result v20

    .line 160
    const/4 v11, 0x0

    .line 161
    const/16 v16, 0x0

    .line 162
    .line 163
    const/16 v19, 0x0

    .line 164
    .line 165
    :goto_3
    iget-boolean v14, v1, Ly8/a$a$a;->a:Z

    .line 166
    .line 167
    if-nez v14, :cond_12

    .line 168
    .line 169
    iget-boolean v14, v1, Ly8/a$a$a;->d:Z

    .line 170
    .line 171
    if-nez v14, :cond_12

    .line 172
    .line 173
    invoke-interface {v6}, Lz8/k;->hasNext()Z

    .line 174
    .line 175
    .line 176
    move-result v14

    .line 177
    if-nez v14, :cond_6

    .line 178
    .line 179
    goto/16 :goto_a

    .line 180
    .line 181
    :cond_6
    invoke-interface {v6}, Lz8/k;->next()Lz8/c;

    .line 182
    .line 183
    .line 184
    move-result-object v18

    .line 185
    invoke-virtual {v7}, Lz8/c;->b()J

    .line 186
    .line 187
    .line 188
    move-result-wide v14

    .line 189
    iget-object v10, v1, Ly8/a$a$a;->e:Ly8/a$a;

    .line 190
    .line 191
    iget-object v10, v10, Ly8/a$a;->j:Ly8/a;

    .line 192
    .line 193
    iget-object v10, v10, Ly8/e;->g:Lz8/e;

    .line 194
    .line 195
    iget-wide v0, v10, Lz8/e;->a:J

    .line 196
    .line 197
    cmp-long v0, v14, v0

    .line 198
    .line 199
    if-gez v0, :cond_7

    .line 200
    .line 201
    move-object/from16 v1, p0

    .line 202
    .line 203
    move-object/from16 v10, v18

    .line 204
    .line 205
    goto/16 :goto_9

    .line 206
    .line 207
    :cond_7
    invoke-virtual/range {v18 .. v18}, Lz8/c;->e()Lz8/n;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    if-eqz v0, :cond_9

    .line 212
    .line 213
    invoke-interface {v0}, Lz8/n;->get()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    if-eqz v0, :cond_9

    .line 218
    .line 219
    :cond_8
    :goto_4
    move-object/from16 v1, p0

    .line 220
    .line 221
    move-object/from16 v10, v18

    .line 222
    .line 223
    goto :goto_5

    .line 224
    :cond_9
    if-nez p1, :cond_a

    .line 225
    .line 226
    invoke-virtual/range {v18 .. v18}, Lz8/c;->w()Z

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    if-nez v0, :cond_8

    .line 231
    .line 232
    invoke-virtual/range {v18 .. v18}, Lz8/c;->s()Z

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    if-nez v0, :cond_a

    .line 237
    .line 238
    goto :goto_4

    .line 239
    :cond_a
    invoke-virtual/range {v18 .. v18}, Lz8/c;->n()Z

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    move-object/from16 v1, p0

    .line 244
    .line 245
    if-nez v0, :cond_b

    .line 246
    .line 247
    iget-object v0, v1, Ly8/a$a$a;->e:Ly8/a$a;

    .line 248
    .line 249
    iget-object v0, v0, Ly8/a$a;->j:Ly8/a;

    .line 250
    .line 251
    iget-object v0, v0, Ly8/e;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 252
    .line 253
    iget-object v10, v0, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->z:Ly8/b;

    .line 254
    .line 255
    const/16 v21, 0x0

    .line 256
    .line 257
    const/16 v22, 0x1

    .line 258
    .line 259
    move-object/from16 v23, v0

    .line 260
    .line 261
    move-object/from16 v17, v10

    .line 262
    .line 263
    invoke-virtual/range {v17 .. v23}, Ly8/b;->b(Lz8/c;IILz8/e;ZLmaster/flame/danmaku/danmaku/model/android/DanmakuContext;)V

    .line 264
    .line 265
    .line 266
    :cond_b
    move-object/from16 v10, v18

    .line 267
    .line 268
    iget-byte v0, v10, Lz8/c;->n:B

    .line 269
    .line 270
    if-nez v0, :cond_c

    .line 271
    .line 272
    invoke-virtual {v10}, Lz8/c;->o()Z

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    if-eqz v0, :cond_c

    .line 277
    .line 278
    :goto_5
    move-object/from16 v16, v10

    .line 279
    .line 280
    :goto_6
    const/4 v0, 0x1

    .line 281
    goto :goto_3

    .line 282
    :cond_c
    invoke-virtual {v10}, Lz8/c;->m()I

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    const/4 v14, 0x1

    .line 287
    if-ne v0, v14, :cond_e

    .line 288
    .line 289
    invoke-virtual {v10}, Lz8/c;->b()J

    .line 290
    .line 291
    .line 292
    move-result-wide v14

    .line 293
    sub-long/2addr v14, v2

    .line 294
    iget-object v0, v1, Ly8/a$a$a;->e:Ly8/a$a;

    .line 295
    .line 296
    iget-object v0, v0, Ly8/a$a;->j:Ly8/a;

    .line 297
    .line 298
    iget-object v0, v0, Ly8/e;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 299
    .line 300
    iget-object v0, v0, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->A:La9/c;

    .line 301
    .line 302
    move-wide/from16 v21, v2

    .line 303
    .line 304
    iget-wide v2, v0, La9/c;->e:J

    .line 305
    .line 306
    div-long/2addr v14, v2

    .line 307
    long-to-int v0, v14

    .line 308
    if-ne v11, v0, :cond_d

    .line 309
    .line 310
    add-int/lit8 v19, v19, 0x1

    .line 311
    .line 312
    goto :goto_7

    .line 313
    :cond_d
    move v11, v0

    .line 314
    const/16 v19, 0x0

    .line 315
    .line 316
    goto :goto_7

    .line 317
    :cond_e
    move-wide/from16 v21, v2

    .line 318
    .line 319
    :goto_7
    if-nez p1, :cond_f

    .line 320
    .line 321
    iget-boolean v0, v1, Ly8/a$a$a;->b:Z

    .line 322
    .line 323
    if-nez v0, :cond_f

    .line 324
    .line 325
    :try_start_1
    iget-object v0, v1, Ly8/a$a$a;->e:Ly8/a$a;

    .line 326
    .line 327
    iget-object v0, v0, Ly8/a$a;->j:Ly8/a;

    .line 328
    .line 329
    invoke-static {v0}, Ly8/a;->t(Ly8/a;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    monitor-enter v2
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 334
    :try_start_2
    iget-object v0, v1, Ly8/a$a$a;->e:Ly8/a$a;

    .line 335
    .line 336
    iget-object v0, v0, Ly8/a$a;->j:Ly8/a;

    .line 337
    .line 338
    invoke-static {v0}, Ly8/a;->t(Ly8/a;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    invoke-virtual {v0, v12, v13}, Ljava/lang/Object;->wait(J)V

    .line 343
    .line 344
    .line 345
    monitor-exit v2

    .line 346
    :cond_f
    const/4 v0, 0x0

    .line 347
    goto :goto_8

    .line 348
    :catchall_0
    move-exception v0

    .line 349
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 350
    :try_start_3
    throw v0
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_1

    .line 351
    :catch_1
    move-exception v0

    .line 352
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 353
    .line 354
    .line 355
    goto :goto_9

    .line 356
    :goto_8
    invoke-virtual {v1, v10, v0}, Ly8/a$a$a;->c(Lz8/c;Z)B

    .line 357
    .line 358
    .line 359
    move-result v2

    .line 360
    const/4 v14, 0x1

    .line 361
    if-ne v2, v14, :cond_10

    .line 362
    .line 363
    goto :goto_9

    .line 364
    :cond_10
    if-nez p1, :cond_11

    .line 365
    .line 366
    invoke-static {}, Lf9/c;->b()J

    .line 367
    .line 368
    .line 369
    move-result-wide v2

    .line 370
    sub-long/2addr v2, v8

    .line 371
    iget-object v15, v1, Ly8/a$a$a;->e:Ly8/a$a;

    .line 372
    .line 373
    iget-object v0, v15, Ly8/a$a;->j:Ly8/a;

    .line 374
    .line 375
    iget-object v0, v0, Ly8/e;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 376
    .line 377
    iget-object v0, v0, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->A:La9/c;

    .line 378
    .line 379
    invoke-static {v15}, Ly8/a$a;->l(Ly8/a$a;)I

    .line 380
    .line 381
    .line 382
    move-result v0

    .line 383
    int-to-long v14, v0

    .line 384
    const-wide/16 v16, 0xed8

    .line 385
    .line 386
    mul-long v14, v14, v16

    .line 387
    .line 388
    cmp-long v0, v2, v14

    .line 389
    .line 390
    if-ltz v0, :cond_11

    .line 391
    .line 392
    :goto_9
    move-object/from16 v16, v10

    .line 393
    .line 394
    goto :goto_a

    .line 395
    :cond_11
    move-object/from16 v16, v10

    .line 396
    .line 397
    move-wide/from16 v2, v21

    .line 398
    .line 399
    goto :goto_6

    .line 400
    :cond_12
    :goto_a
    invoke-static {}, Lf9/c;->b()J

    .line 401
    .line 402
    .line 403
    move-result-wide v2

    .line 404
    sub-long/2addr v2, v8

    .line 405
    if-eqz v16, :cond_13

    .line 406
    .line 407
    iget-object v0, v1, Ly8/a$a$a;->e:Ly8/a$a;

    .line 408
    .line 409
    iget-object v0, v0, Ly8/a$a;->j:Ly8/a;

    .line 410
    .line 411
    invoke-static {v0}, Ly8/a;->v(Ly8/a;)Lz8/e;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    invoke-virtual/range {v16 .. v16}, Lz8/c;->b()J

    .line 416
    .line 417
    .line 418
    move-result-wide v4

    .line 419
    invoke-virtual {v0, v4, v5}, Lz8/e;->b(J)J

    .line 420
    .line 421
    .line 422
    goto :goto_b

    .line 423
    :cond_13
    iget-object v0, v1, Ly8/a$a$a;->e:Ly8/a$a;

    .line 424
    .line 425
    iget-object v0, v0, Ly8/a$a;->j:Ly8/a;

    .line 426
    .line 427
    invoke-static {v0}, Ly8/a;->v(Ly8/a;)Lz8/e;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    invoke-virtual {v0, v4, v5}, Lz8/e;->b(J)J

    .line 432
    .line 433
    .line 434
    :goto_b
    return-wide v2

    .line 435
    :cond_14
    :goto_c
    iget-object v0, v1, Ly8/a$a$a;->e:Ly8/a$a;

    .line 436
    .line 437
    iget-object v0, v0, Ly8/a$a;->j:Ly8/a;

    .line 438
    .line 439
    invoke-static {v0}, Ly8/a;->v(Ly8/a;)Lz8/e;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    invoke-virtual {v0, v4, v5}, Lz8/e;->b(J)J

    .line 444
    .line 445
    .line 446
    return-wide v17
.end method

.method public final j(Lz8/c;La9/e;)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    iget-object p2, p1, Lz8/c;->x:Lz8/n;

    .line 4
    .line 5
    check-cast p2, La9/e;

    .line 6
    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    iput-object v0, p1, Lz8/c;->x:Lz8/n;

    .line 9
    .line 10
    if-nez p2, :cond_1

    .line 11
    .line 12
    return-void

    .line 13
    :cond_1
    invoke-virtual {p2}, La9/e;->destroy()V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 17
    .line 18
    iget-object p1, p1, Ly8/a$a;->d:Lb9/b;

    .line 19
    .line 20
    invoke-interface {p1, p2}, Lb9/b;->a(Lb9/c;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public k(J)V
    .locals 4

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 3
    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    iput-boolean v1, p0, Ly8/a$a$a;->c:Z

    .line 7
    .line 8
    const/16 v1, 0x13

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 14
    .line 15
    iget-object v1, v1, Ly8/a$a;->j:Ly8/a;

    .line 16
    .line 17
    invoke-static {v1}, Ly8/a;->v(Ly8/a;)Lz8/e;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v2, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 22
    .line 23
    iget-object v2, v2, Ly8/a$a;->j:Ly8/a;

    .line 24
    .line 25
    iget-object v2, v2, Ly8/e;->g:Lz8/e;

    .line 26
    .line 27
    iget-wide v2, v2, Lz8/e;->a:J

    .line 28
    .line 29
    add-long/2addr v2, p1

    .line 30
    invoke-virtual {v1, v2, v3}, Lz8/e;->b(J)J

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public l()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ly8/a$a$a;->d:Z

    .line 3
    .line 4
    return-void
.end method

.method public m()V
    .locals 3

    .line 1
    const/16 v0, 0x13

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Ly8/a$a$a;->a:Z

    .line 8
    .line 9
    const/16 v0, 0x10

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Ly8/a$a$a;->e:Ly8/a$a;

    .line 18
    .line 19
    iget-object v0, v0, Ly8/a$a;->j:Ly8/a;

    .line 20
    .line 21
    iget-object v0, v0, Ly8/e;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 22
    .line 23
    iget-object v0, v0, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->A:La9/c;

    .line 24
    .line 25
    iget-wide v0, v0, La9/c;->e:J

    .line 26
    .line 27
    const/4 v2, 0x4

    .line 28
    invoke-virtual {p0, v2, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 29
    .line 30
    .line 31
    return-void
.end method
