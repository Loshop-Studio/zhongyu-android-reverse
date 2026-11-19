.class public Lr2/a0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr2/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Lr2/y;

.field public b:Lokhttp3/Protocol;

.field public c:I

.field public d:Ljava/lang/String;

.field public e:Lokhttp3/Handshake;

.field public f:Lr2/s$a;

.field public g:Lr2/b0;

.field public h:Lr2/a0;

.field public i:Lr2/a0;

.field public j:Lr2/a0;

.field public k:J

.field public l:J

.field public m:Lw2/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lr2/a0$a;->c:I

    .line 3
    new-instance v0, Lr2/s$a;

    invoke-direct {v0}, Lr2/s$a;-><init>()V

    iput-object v0, p0, Lr2/a0$a;->f:Lr2/s$a;

    return-void
.end method

.method public constructor <init>(Lr2/a0;)V
    .locals 2

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lr2/a0$a;->c:I

    .line 6
    invoke-virtual {p1}, Lr2/a0;->r()Lr2/y;

    move-result-object v0

    iput-object v0, p0, Lr2/a0$a;->a:Lr2/y;

    .line 7
    invoke-virtual {p1}, Lr2/a0;->p()Lokhttp3/Protocol;

    move-result-object v0

    iput-object v0, p0, Lr2/a0$a;->b:Lokhttp3/Protocol;

    .line 8
    invoke-virtual {p1}, Lr2/a0;->e()I

    move-result v0

    iput v0, p0, Lr2/a0$a;->c:I

    .line 9
    invoke-virtual {p1}, Lr2/a0;->l()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lr2/a0$a;->d:Ljava/lang/String;

    .line 10
    invoke-virtual {p1}, Lr2/a0;->g()Lokhttp3/Handshake;

    move-result-object v0

    iput-object v0, p0, Lr2/a0$a;->e:Lokhttp3/Handshake;

    .line 11
    invoke-virtual {p1}, Lr2/a0;->j()Lr2/s;

    move-result-object v0

    invoke-virtual {v0}, Lr2/s;->c()Lr2/s$a;

    move-result-object v0

    iput-object v0, p0, Lr2/a0$a;->f:Lr2/s$a;

    .line 12
    invoke-virtual {p1}, Lr2/a0;->a()Lr2/b0;

    move-result-object v0

    iput-object v0, p0, Lr2/a0$a;->g:Lr2/b0;

    .line 13
    invoke-virtual {p1}, Lr2/a0;->m()Lr2/a0;

    move-result-object v0

    iput-object v0, p0, Lr2/a0$a;->h:Lr2/a0;

    .line 14
    invoke-virtual {p1}, Lr2/a0;->c()Lr2/a0;

    move-result-object v0

    iput-object v0, p0, Lr2/a0$a;->i:Lr2/a0;

    .line 15
    invoke-virtual {p1}, Lr2/a0;->o()Lr2/a0;

    move-result-object v0

    iput-object v0, p0, Lr2/a0$a;->j:Lr2/a0;

    .line 16
    invoke-virtual {p1}, Lr2/a0;->s()J

    move-result-wide v0

    iput-wide v0, p0, Lr2/a0$a;->k:J

    .line 17
    invoke-virtual {p1}, Lr2/a0;->q()J

    move-result-wide v0

    iput-wide v0, p0, Lr2/a0$a;->l:J

    .line 18
    invoke-virtual {p1}, Lr2/a0;->f()Lw2/c;

    move-result-object p1

    iput-object p1, p0, Lr2/a0$a;->m:Lw2/c;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)Lr2/a0$a;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "value"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lr2/a0$a;->f:Lr2/s$a;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Lr2/s$a;->a(Ljava/lang/String;Ljava/lang/String;)Lr2/s$a;

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method public b(Lr2/b0;)Lr2/a0$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lr2/a0$a;->g:Lr2/b0;

    .line 2
    .line 3
    return-object p0
.end method

.method public c()Lr2/a0;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v5, v0, Lr2/a0$a;->c:I

    .line 4
    .line 5
    if-ltz v5, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-eqz v1, :cond_4

    .line 11
    .line 12
    iget-object v2, v0, Lr2/a0$a;->a:Lr2/y;

    .line 13
    .line 14
    if-eqz v2, :cond_3

    .line 15
    .line 16
    iget-object v3, v0, Lr2/a0$a;->b:Lokhttp3/Protocol;

    .line 17
    .line 18
    if-eqz v3, :cond_2

    .line 19
    .line 20
    iget-object v4, v0, Lr2/a0$a;->d:Ljava/lang/String;

    .line 21
    .line 22
    if-eqz v4, :cond_1

    .line 23
    .line 24
    iget-object v6, v0, Lr2/a0$a;->e:Lokhttp3/Handshake;

    .line 25
    .line 26
    iget-object v1, v0, Lr2/a0$a;->f:Lr2/s$a;

    .line 27
    .line 28
    invoke-virtual {v1}, Lr2/s$a;->e()Lr2/s;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    iget-object v8, v0, Lr2/a0$a;->g:Lr2/b0;

    .line 33
    .line 34
    iget-object v9, v0, Lr2/a0$a;->h:Lr2/a0;

    .line 35
    .line 36
    iget-object v10, v0, Lr2/a0$a;->i:Lr2/a0;

    .line 37
    .line 38
    iget-object v11, v0, Lr2/a0$a;->j:Lr2/a0;

    .line 39
    .line 40
    iget-wide v12, v0, Lr2/a0$a;->k:J

    .line 41
    .line 42
    iget-wide v14, v0, Lr2/a0$a;->l:J

    .line 43
    .line 44
    iget-object v1, v0, Lr2/a0$a;->m:Lw2/c;

    .line 45
    .line 46
    new-instance v17, Lr2/a0;

    .line 47
    .line 48
    move-object/from16 v16, v1

    .line 49
    .line 50
    move-object/from16 v1, v17

    .line 51
    .line 52
    invoke-direct/range {v1 .. v16}, Lr2/a0;-><init>(Lr2/y;Lokhttp3/Protocol;Ljava/lang/String;ILokhttp3/Handshake;Lr2/s;Lr2/b0;Lr2/a0;Lr2/a0;Lr2/a0;JJLw2/c;)V

    .line 53
    .line 54
    .line 55
    return-object v17

    .line 56
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string v2, "message == null"

    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v1

    .line 68
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 69
    .line 70
    const-string v2, "protocol == null"

    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v1

    .line 80
    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 81
    .line 82
    const-string v2, "request == null"

    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw v1

    .line 92
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 95
    .line 96
    .line 97
    const-string v2, "code < 0: "

    .line 98
    .line 99
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    iget v2, v0, Lr2/a0$a;->c:I

    .line 103
    .line 104
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw v2
.end method

.method public d(Lr2/a0;)Lr2/a0$a;
    .locals 1

    .line 1
    const-string v0, "cacheResponse"

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lr2/a0$a;->f(Ljava/lang/String;Lr2/a0;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lr2/a0$a;->i:Lr2/a0;

    .line 7
    .line 8
    return-object p0
.end method

.method public final e(Lr2/a0;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-virtual {p1}, Lr2/a0;->a()Lr2/b0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    :goto_0
    if-eqz p1, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 16
    .line 17
    const-string v0, "priorResponse.body != null"

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_2
    :goto_1
    return-void
.end method

.method public final f(Ljava/lang/String;Lr2/a0;)V
    .locals 3

    .line 1
    if-eqz p2, :cond_8

    .line 2
    .line 3
    invoke-virtual {p2}, Lr2/a0;->a()Lr2/b0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    move v0, v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v0, v2

    .line 14
    :goto_0
    if-eqz v0, :cond_7

    .line 15
    .line 16
    invoke-virtual {p2}, Lr2/a0;->m()Lr2/a0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    move v0, v1

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move v0, v2

    .line 25
    :goto_1
    if-eqz v0, :cond_6

    .line 26
    .line 27
    invoke-virtual {p2}, Lr2/a0;->c()Lr2/a0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    move v0, v1

    .line 34
    goto :goto_2

    .line 35
    :cond_2
    move v0, v2

    .line 36
    :goto_2
    if-eqz v0, :cond_5

    .line 37
    .line 38
    invoke-virtual {p2}, Lr2/a0;->o()Lr2/a0;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    if-nez p2, :cond_3

    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_3
    move v1, v2

    .line 46
    :goto_3
    if-eqz v1, :cond_4

    .line 47
    .line 48
    goto :goto_4

    .line 49
    :cond_4
    new-instance p2, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string p1, ".priorResponse != null"

    .line 58
    .line 59
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw p2

    .line 76
    :cond_5
    new-instance p2, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string p1, ".cacheResponse != null"

    .line 85
    .line 86
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw p2

    .line 103
    :cond_6
    new-instance p2, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const-string p1, ".networkResponse != null"

    .line 112
    .line 113
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw p2

    .line 130
    :cond_7
    new-instance p2, Ljava/lang/StringBuilder;

    .line 131
    .line 132
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    const-string p1, ".body != null"

    .line 139
    .line 140
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 148
    .line 149
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    throw p2

    .line 157
    :cond_8
    :goto_4
    return-void
.end method

.method public g(I)Lr2/a0$a;
    .locals 0

    .line 1
    iput p1, p0, Lr2/a0$a;->c:I

    .line 2
    .line 3
    return-object p0
.end method

.method public final h()I
    .locals 1

    .line 1
    iget v0, p0, Lr2/a0$a;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public i(Lokhttp3/Handshake;)Lr2/a0$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lr2/a0$a;->e:Lokhttp3/Handshake;

    .line 2
    .line 3
    return-object p0
.end method

.method public j(Ljava/lang/String;Ljava/lang/String;)Lr2/a0$a;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "value"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lr2/a0$a;->f:Lr2/s$a;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Lr2/s$a;->h(Ljava/lang/String;Ljava/lang/String;)Lr2/s$a;

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method public k(Lr2/s;)Lr2/a0$a;
    .locals 1

    .line 1
    const-string v0, "headers"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lr2/s;->c()Lr2/s$a;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lr2/a0$a;->f:Lr2/s$a;

    .line 11
    .line 12
    return-object p0
.end method

.method public final l(Lw2/c;)V
    .locals 1

    .line 1
    const-string v0, "deferredTrailers"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lr2/a0$a;->m:Lw2/c;

    .line 7
    .line 8
    return-void
.end method

.method public m(Ljava/lang/String;)Lr2/a0$a;
    .locals 1

    .line 1
    const-string v0, "message"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lr2/a0$a;->d:Ljava/lang/String;

    .line 7
    .line 8
    return-object p0
.end method

.method public n(Lr2/a0;)Lr2/a0$a;
    .locals 1

    .line 1
    const-string v0, "networkResponse"

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lr2/a0$a;->f(Ljava/lang/String;Lr2/a0;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lr2/a0$a;->h:Lr2/a0;

    .line 7
    .line 8
    return-object p0
.end method

.method public o(Lr2/a0;)Lr2/a0$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lr2/a0$a;->e(Lr2/a0;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr2/a0$a;->j:Lr2/a0;

    .line 5
    .line 6
    return-object p0
.end method

.method public p(Lokhttp3/Protocol;)Lr2/a0$a;
    .locals 1

    .line 1
    const-string v0, "protocol"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lr2/a0$a;->b:Lokhttp3/Protocol;

    .line 7
    .line 8
    return-object p0
.end method

.method public q(J)Lr2/a0$a;
    .locals 0

    .line 1
    iput-wide p1, p0, Lr2/a0$a;->l:J

    .line 2
    .line 3
    return-object p0
.end method

.method public r(Lr2/y;)Lr2/a0$a;
    .locals 1

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lr2/a0$a;->a:Lr2/y;

    .line 7
    .line 8
    return-object p0
.end method

.method public s(J)Lr2/a0$a;
    .locals 0

    .line 1
    iput-wide p1, p0, Lr2/a0$a;->k:J

    .line 2
    .line 3
    return-object p0
.end method
