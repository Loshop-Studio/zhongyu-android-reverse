.class public final Lw/g$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Lokio/FileSystem;

.field public final b:Lkotlin/coroutines/d;

.field public final c:Lkotlin/coroutines/d;

.field public final d:Lkotlin/coroutines/d;

.field public final e:Lcoil3/request/CachePolicy;

.field public final f:Lcoil3/request/CachePolicy;

.field public final g:Lcoil3/request/CachePolicy;

.field public final h:Lhd/l;

.field public final i:Lhd/l;

.field public final j:Lhd/l;

.field public final k:Lx/g;

.field public final l:Lcoil3/size/Scale;

.field public final m:Lcoil3/size/Precision;


# direct methods
.method public constructor <init>(Lokio/FileSystem;Lkotlin/coroutines/d;Lkotlin/coroutines/d;Lkotlin/coroutines/d;Lcoil3/request/CachePolicy;Lcoil3/request/CachePolicy;Lcoil3/request/CachePolicy;Lhd/l;Lhd/l;Lhd/l;Lx/g;Lcoil3/size/Scale;Lcoil3/size/Precision;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw/g$c;->a:Lokio/FileSystem;

    .line 5
    .line 6
    iput-object p2, p0, Lw/g$c;->b:Lkotlin/coroutines/d;

    .line 7
    .line 8
    iput-object p3, p0, Lw/g$c;->c:Lkotlin/coroutines/d;

    .line 9
    .line 10
    iput-object p4, p0, Lw/g$c;->d:Lkotlin/coroutines/d;

    .line 11
    .line 12
    iput-object p5, p0, Lw/g$c;->e:Lcoil3/request/CachePolicy;

    .line 13
    .line 14
    iput-object p6, p0, Lw/g$c;->f:Lcoil3/request/CachePolicy;

    .line 15
    .line 16
    iput-object p7, p0, Lw/g$c;->g:Lcoil3/request/CachePolicy;

    .line 17
    .line 18
    iput-object p8, p0, Lw/g$c;->h:Lhd/l;

    .line 19
    .line 20
    iput-object p9, p0, Lw/g$c;->i:Lhd/l;

    .line 21
    .line 22
    iput-object p10, p0, Lw/g$c;->j:Lhd/l;

    .line 23
    .line 24
    iput-object p11, p0, Lw/g$c;->k:Lx/g;

    .line 25
    .line 26
    iput-object p12, p0, Lw/g$c;->l:Lcoil3/size/Scale;

    .line 27
    .line 28
    iput-object p13, p0, Lw/g$c;->m:Lcoil3/size/Precision;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final a()Lkotlin/coroutines/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/g$c;->d:Lkotlin/coroutines/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Lcoil3/request/CachePolicy;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/g$c;->f:Lcoil3/request/CachePolicy;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Lhd/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/g$c;->i:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Lhd/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/g$c;->j:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Lkotlin/coroutines/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/g$c;->c:Lkotlin/coroutines/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lw/g$c;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lw/g$c;

    .line 12
    .line 13
    iget-object v1, p0, Lw/g$c;->a:Lokio/FileSystem;

    .line 14
    .line 15
    iget-object v3, p1, Lw/g$c;->a:Lokio/FileSystem;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lw/g$c;->b:Lkotlin/coroutines/d;

    .line 25
    .line 26
    iget-object v3, p1, Lw/g$c;->b:Lkotlin/coroutines/d;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, Lw/g$c;->c:Lkotlin/coroutines/d;

    .line 36
    .line 37
    iget-object v3, p1, Lw/g$c;->c:Lkotlin/coroutines/d;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object v1, p0, Lw/g$c;->d:Lkotlin/coroutines/d;

    .line 47
    .line 48
    iget-object v3, p1, Lw/g$c;->d:Lkotlin/coroutines/d;

    .line 49
    .line 50
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    iget-object v1, p0, Lw/g$c;->e:Lcoil3/request/CachePolicy;

    .line 58
    .line 59
    iget-object v3, p1, Lw/g$c;->e:Lcoil3/request/CachePolicy;

    .line 60
    .line 61
    if-eq v1, v3, :cond_6

    .line 62
    .line 63
    return v2

    .line 64
    :cond_6
    iget-object v1, p0, Lw/g$c;->f:Lcoil3/request/CachePolicy;

    .line 65
    .line 66
    iget-object v3, p1, Lw/g$c;->f:Lcoil3/request/CachePolicy;

    .line 67
    .line 68
    if-eq v1, v3, :cond_7

    .line 69
    .line 70
    return v2

    .line 71
    :cond_7
    iget-object v1, p0, Lw/g$c;->g:Lcoil3/request/CachePolicy;

    .line 72
    .line 73
    iget-object v3, p1, Lw/g$c;->g:Lcoil3/request/CachePolicy;

    .line 74
    .line 75
    if-eq v1, v3, :cond_8

    .line 76
    .line 77
    return v2

    .line 78
    :cond_8
    iget-object v1, p0, Lw/g$c;->h:Lhd/l;

    .line 79
    .line 80
    iget-object v3, p1, Lw/g$c;->h:Lhd/l;

    .line 81
    .line 82
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-nez v1, :cond_9

    .line 87
    .line 88
    return v2

    .line 89
    :cond_9
    iget-object v1, p0, Lw/g$c;->i:Lhd/l;

    .line 90
    .line 91
    iget-object v3, p1, Lw/g$c;->i:Lhd/l;

    .line 92
    .line 93
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-nez v1, :cond_a

    .line 98
    .line 99
    return v2

    .line 100
    :cond_a
    iget-object v1, p0, Lw/g$c;->j:Lhd/l;

    .line 101
    .line 102
    iget-object v3, p1, Lw/g$c;->j:Lhd/l;

    .line 103
    .line 104
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-nez v1, :cond_b

    .line 109
    .line 110
    return v2

    .line 111
    :cond_b
    iget-object v1, p0, Lw/g$c;->k:Lx/g;

    .line 112
    .line 113
    iget-object v3, p1, Lw/g$c;->k:Lx/g;

    .line 114
    .line 115
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-nez v1, :cond_c

    .line 120
    .line 121
    return v2

    .line 122
    :cond_c
    iget-object v1, p0, Lw/g$c;->l:Lcoil3/size/Scale;

    .line 123
    .line 124
    iget-object v3, p1, Lw/g$c;->l:Lcoil3/size/Scale;

    .line 125
    .line 126
    if-eq v1, v3, :cond_d

    .line 127
    .line 128
    return v2

    .line 129
    :cond_d
    iget-object v1, p0, Lw/g$c;->m:Lcoil3/size/Precision;

    .line 130
    .line 131
    iget-object p1, p1, Lw/g$c;->m:Lcoil3/size/Precision;

    .line 132
    .line 133
    if-eq v1, p1, :cond_e

    .line 134
    .line 135
    return v2

    .line 136
    :cond_e
    return v0
.end method

.method public final f()Lokio/FileSystem;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/g$c;->a:Lokio/FileSystem;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Lkotlin/coroutines/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/g$c;->b:Lkotlin/coroutines/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Lcoil3/request/CachePolicy;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/g$c;->e:Lcoil3/request/CachePolicy;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lw/g$c;->a:Lokio/FileSystem;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 13
    .line 14
    iget-object v2, p0, Lw/g$c;->b:Lkotlin/coroutines/d;

    .line 15
    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    move v2, v1

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    :goto_1
    add-int/2addr v0, v2

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-object v2, p0, Lw/g$c;->c:Lkotlin/coroutines/d;

    .line 28
    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    move v2, v1

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    :goto_2
    add-int/2addr v0, v2

    .line 38
    mul-int/lit8 v0, v0, 0x1f

    .line 39
    .line 40
    iget-object v2, p0, Lw/g$c;->d:Lkotlin/coroutines/d;

    .line 41
    .line 42
    if-nez v2, :cond_3

    .line 43
    .line 44
    move v2, v1

    .line 45
    goto :goto_3

    .line 46
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    :goto_3
    add-int/2addr v0, v2

    .line 51
    mul-int/lit8 v0, v0, 0x1f

    .line 52
    .line 53
    iget-object v2, p0, Lw/g$c;->e:Lcoil3/request/CachePolicy;

    .line 54
    .line 55
    if-nez v2, :cond_4

    .line 56
    .line 57
    move v2, v1

    .line 58
    goto :goto_4

    .line 59
    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    :goto_4
    add-int/2addr v0, v2

    .line 64
    mul-int/lit8 v0, v0, 0x1f

    .line 65
    .line 66
    iget-object v2, p0, Lw/g$c;->f:Lcoil3/request/CachePolicy;

    .line 67
    .line 68
    if-nez v2, :cond_5

    .line 69
    .line 70
    move v2, v1

    .line 71
    goto :goto_5

    .line 72
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    :goto_5
    add-int/2addr v0, v2

    .line 77
    mul-int/lit8 v0, v0, 0x1f

    .line 78
    .line 79
    iget-object v2, p0, Lw/g$c;->g:Lcoil3/request/CachePolicy;

    .line 80
    .line 81
    if-nez v2, :cond_6

    .line 82
    .line 83
    move v2, v1

    .line 84
    goto :goto_6

    .line 85
    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    :goto_6
    add-int/2addr v0, v2

    .line 90
    mul-int/lit8 v0, v0, 0x1f

    .line 91
    .line 92
    iget-object v2, p0, Lw/g$c;->h:Lhd/l;

    .line 93
    .line 94
    if-nez v2, :cond_7

    .line 95
    .line 96
    move v2, v1

    .line 97
    goto :goto_7

    .line 98
    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    :goto_7
    add-int/2addr v0, v2

    .line 103
    mul-int/lit8 v0, v0, 0x1f

    .line 104
    .line 105
    iget-object v2, p0, Lw/g$c;->i:Lhd/l;

    .line 106
    .line 107
    if-nez v2, :cond_8

    .line 108
    .line 109
    move v2, v1

    .line 110
    goto :goto_8

    .line 111
    :cond_8
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    :goto_8
    add-int/2addr v0, v2

    .line 116
    mul-int/lit8 v0, v0, 0x1f

    .line 117
    .line 118
    iget-object v2, p0, Lw/g$c;->j:Lhd/l;

    .line 119
    .line 120
    if-nez v2, :cond_9

    .line 121
    .line 122
    move v2, v1

    .line 123
    goto :goto_9

    .line 124
    :cond_9
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    :goto_9
    add-int/2addr v0, v2

    .line 129
    mul-int/lit8 v0, v0, 0x1f

    .line 130
    .line 131
    iget-object v2, p0, Lw/g$c;->k:Lx/g;

    .line 132
    .line 133
    if-nez v2, :cond_a

    .line 134
    .line 135
    move v2, v1

    .line 136
    goto :goto_a

    .line 137
    :cond_a
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    :goto_a
    add-int/2addr v0, v2

    .line 142
    mul-int/lit8 v0, v0, 0x1f

    .line 143
    .line 144
    iget-object v2, p0, Lw/g$c;->l:Lcoil3/size/Scale;

    .line 145
    .line 146
    if-nez v2, :cond_b

    .line 147
    .line 148
    move v2, v1

    .line 149
    goto :goto_b

    .line 150
    :cond_b
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    :goto_b
    add-int/2addr v0, v2

    .line 155
    mul-int/lit8 v0, v0, 0x1f

    .line 156
    .line 157
    iget-object v2, p0, Lw/g$c;->m:Lcoil3/size/Precision;

    .line 158
    .line 159
    if-nez v2, :cond_c

    .line 160
    .line 161
    goto :goto_c

    .line 162
    :cond_c
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    :goto_c
    add-int/2addr v0, v1

    .line 167
    return v0
.end method

.method public final i()Lcoil3/request/CachePolicy;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/g$c;->g:Lcoil3/request/CachePolicy;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Lhd/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/g$c;->h:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()Lcoil3/size/Precision;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/g$c;->m:Lcoil3/size/Precision;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()Lcoil3/size/Scale;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/g$c;->l:Lcoil3/size/Scale;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()Lx/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/g$c;->k:Lx/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Defined(fileSystem="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lw/g$c;->a:Lokio/FileSystem;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", interceptorCoroutineContext="

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lw/g$c;->b:Lkotlin/coroutines/d;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, ", fetcherCoroutineContext="

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lw/g$c;->c:Lkotlin/coroutines/d;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, ", decoderCoroutineContext="

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lw/g$c;->d:Lkotlin/coroutines/d;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v1, ", memoryCachePolicy="

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Lw/g$c;->e:Lcoil3/request/CachePolicy;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v1, ", diskCachePolicy="

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    iget-object v1, p0, Lw/g$c;->f:Lcoil3/request/CachePolicy;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v1, ", networkCachePolicy="

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    iget-object v1, p0, Lw/g$c;->g:Lcoil3/request/CachePolicy;

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v1, ", placeholderFactory="

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    iget-object v1, p0, Lw/g$c;->h:Lhd/l;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v1, ", errorFactory="

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    iget-object v1, p0, Lw/g$c;->i:Lhd/l;

    .line 92
    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v1, ", fallbackFactory="

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    iget-object v1, p0, Lw/g$c;->j:Lhd/l;

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string v1, ", sizeResolver="

    .line 107
    .line 108
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    iget-object v1, p0, Lw/g$c;->k:Lx/g;

    .line 112
    .line 113
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string v1, ", scale="

    .line 117
    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    iget-object v1, p0, Lw/g$c;->l:Lcoil3/size/Scale;

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const-string v1, ", precision="

    .line 127
    .line 128
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    iget-object v1, p0, Lw/g$c;->m:Lcoil3/size/Precision;

    .line 132
    .line 133
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    const/16 v1, 0x29

    .line 137
    .line 138
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    return-object v0
.end method
