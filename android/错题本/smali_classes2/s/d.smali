.class public final Ls/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final o:Ls/d;


# instance fields
.field public final a:Lokio/FileSystem;

.field public final b:Lh6/h;

.field public final c:Lh6/h;

.field public final d:Lh6/h;

.field public final e:Lcoil3/request/CachePolicy;

.field public final f:Lcoil3/request/CachePolicy;

.field public final g:Lcoil3/request/CachePolicy;

.field public final h:Lr6/c;

.field public final i:Lr6/c;

.field public final j:Lr6/c;

.field public final k:Lt/g;

.field public final l:Lcoil3/size/Scale;

.field public final m:Lcoil3/size/Precision;

.field public final n:Lcoil3/j;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v0, Ls/d;

    .line 2
    .line 3
    sget-object v1, Lokio/FileSystem;->SYSTEM:Lokio/FileSystem;

    .line 4
    .line 5
    sget-object v2, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 6
    .line 7
    sget-object v3, Lkotlinx/coroutines/f0;->a:Lg7/e;

    .line 8
    .line 9
    sget-object v3, Lg7/d;->a:Lg7/d;

    .line 10
    .line 11
    sget-object v5, Lcoil3/request/CachePolicy;->ENABLED:Lcoil3/request/CachePolicy;

    .line 12
    .line 13
    sget-object v11, Lt/g;->b0:Lt/d;

    .line 14
    .line 15
    sget-object v12, Lcoil3/size/Scale;->FIT:Lcoil3/size/Scale;

    .line 16
    .line 17
    sget-object v13, Lcoil3/size/Precision;->EXACT:Lcoil3/size/Precision;

    .line 18
    .line 19
    sget-object v14, Lcoil3/j;->b:Lcoil3/j;

    .line 20
    .line 21
    sget-object v8, Lcoil3/util/k;->a:Lcoil3/util/k;

    .line 22
    .line 23
    move-object v4, v3

    .line 24
    move-object v6, v5

    .line 25
    move-object v7, v5

    .line 26
    move-object v9, v8

    .line 27
    move-object v10, v8

    .line 28
    invoke-direct/range {v0 .. v14}, Ls/d;-><init>(Lokio/FileSystem;Lh6/h;Lh6/h;Lh6/h;Lcoil3/request/CachePolicy;Lcoil3/request/CachePolicy;Lcoil3/request/CachePolicy;Lr6/c;Lr6/c;Lr6/c;Lt/g;Lcoil3/size/Scale;Lcoil3/size/Precision;Lcoil3/j;)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Ls/d;->o:Ls/d;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>(Lokio/FileSystem;Lh6/h;Lh6/h;Lh6/h;Lcoil3/request/CachePolicy;Lcoil3/request/CachePolicy;Lcoil3/request/CachePolicy;Lr6/c;Lr6/c;Lr6/c;Lt/g;Lcoil3/size/Scale;Lcoil3/size/Precision;Lcoil3/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls/d;->a:Lokio/FileSystem;

    .line 5
    .line 6
    iput-object p2, p0, Ls/d;->b:Lh6/h;

    .line 7
    .line 8
    iput-object p3, p0, Ls/d;->c:Lh6/h;

    .line 9
    .line 10
    iput-object p4, p0, Ls/d;->d:Lh6/h;

    .line 11
    .line 12
    iput-object p5, p0, Ls/d;->e:Lcoil3/request/CachePolicy;

    .line 13
    .line 14
    iput-object p6, p0, Ls/d;->f:Lcoil3/request/CachePolicy;

    .line 15
    .line 16
    iput-object p7, p0, Ls/d;->g:Lcoil3/request/CachePolicy;

    .line 17
    .line 18
    iput-object p8, p0, Ls/d;->h:Lr6/c;

    .line 19
    .line 20
    iput-object p9, p0, Ls/d;->i:Lr6/c;

    .line 21
    .line 22
    iput-object p10, p0, Ls/d;->j:Lr6/c;

    .line 23
    .line 24
    iput-object p11, p0, Ls/d;->k:Lt/g;

    .line 25
    .line 26
    iput-object p12, p0, Ls/d;->l:Lcoil3/size/Scale;

    .line 27
    .line 28
    iput-object p13, p0, Ls/d;->m:Lcoil3/size/Precision;

    .line 29
    .line 30
    iput-object p14, p0, Ls/d;->n:Lcoil3/j;

    .line 31
    .line 32
    return-void
.end method

.method public static a(Ls/d;Lcoil3/request/CachePolicy;Lcoil3/j;I)Ls/d;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p3

    .line 4
    .line 5
    iget-object v2, v0, Ls/d;->a:Lokio/FileSystem;

    .line 6
    .line 7
    move-object v3, v2

    .line 8
    iget-object v2, v0, Ls/d;->b:Lh6/h;

    .line 9
    .line 10
    move-object v4, v3

    .line 11
    iget-object v3, v0, Ls/d;->c:Lh6/h;

    .line 12
    .line 13
    move-object v5, v4

    .line 14
    iget-object v4, v0, Ls/d;->d:Lh6/h;

    .line 15
    .line 16
    move-object v6, v5

    .line 17
    iget-object v5, v0, Ls/d;->e:Lcoil3/request/CachePolicy;

    .line 18
    .line 19
    and-int/lit8 v7, v1, 0x20

    .line 20
    .line 21
    if-eqz v7, :cond_0

    .line 22
    .line 23
    iget-object v7, v0, Ls/d;->f:Lcoil3/request/CachePolicy;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object/from16 v7, p1

    .line 27
    .line 28
    :goto_0
    iget-object v8, v0, Ls/d;->g:Lcoil3/request/CachePolicy;

    .line 29
    .line 30
    move-object v9, v6

    .line 31
    move-object v6, v7

    .line 32
    move-object v7, v8

    .line 33
    iget-object v8, v0, Ls/d;->h:Lr6/c;

    .line 34
    .line 35
    move-object v10, v9

    .line 36
    iget-object v9, v0, Ls/d;->i:Lr6/c;

    .line 37
    .line 38
    move-object v11, v10

    .line 39
    iget-object v10, v0, Ls/d;->j:Lr6/c;

    .line 40
    .line 41
    move-object v12, v11

    .line 42
    iget-object v11, v0, Ls/d;->k:Lt/g;

    .line 43
    .line 44
    move-object v13, v12

    .line 45
    iget-object v12, v0, Ls/d;->l:Lcoil3/size/Scale;

    .line 46
    .line 47
    move-object v14, v13

    .line 48
    iget-object v13, v0, Ls/d;->m:Lcoil3/size/Precision;

    .line 49
    .line 50
    and-int/lit16 v1, v1, 0x2000

    .line 51
    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    iget-object v1, v0, Ls/d;->n:Lcoil3/j;

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    move-object/from16 v1, p2

    .line 58
    .line 59
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    new-instance v0, Ls/d;

    .line 63
    .line 64
    move-object v15, v14

    .line 65
    move-object v14, v1

    .line 66
    move-object v1, v15

    .line 67
    invoke-direct/range {v0 .. v14}, Ls/d;-><init>(Lokio/FileSystem;Lh6/h;Lh6/h;Lh6/h;Lcoil3/request/CachePolicy;Lcoil3/request/CachePolicy;Lcoil3/request/CachePolicy;Lr6/c;Lr6/c;Lr6/c;Lt/g;Lcoil3/size/Scale;Lcoil3/size/Precision;Lcoil3/j;)V

    .line 68
    .line 69
    .line 70
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
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
    instance-of v1, p1, Ls/d;

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
    check-cast p1, Ls/d;

    .line 12
    .line 13
    iget-object v1, p0, Ls/d;->a:Lokio/FileSystem;

    .line 14
    .line 15
    iget-object v3, p1, Ls/d;->a:Lokio/FileSystem;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v1, p0, Ls/d;->b:Lh6/h;

    .line 25
    .line 26
    iget-object v3, p1, Ls/d;->b:Lh6/h;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v1, p0, Ls/d;->c:Lh6/h;

    .line 36
    .line 37
    iget-object v3, p1, Ls/d;->c:Lh6/h;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v1, p0, Ls/d;->d:Lh6/h;

    .line 47
    .line 48
    iget-object v3, p1, Ls/d;->d:Lh6/h;

    .line 49
    .line 50
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v1, p0, Ls/d;->e:Lcoil3/request/CachePolicy;

    .line 58
    .line 59
    iget-object v3, p1, Ls/d;->e:Lcoil3/request/CachePolicy;

    .line 60
    .line 61
    if-eq v1, v3, :cond_6

    .line 62
    .line 63
    return v2

    .line 64
    :cond_6
    iget-object v1, p0, Ls/d;->f:Lcoil3/request/CachePolicy;

    .line 65
    .line 66
    iget-object v3, p1, Ls/d;->f:Lcoil3/request/CachePolicy;

    .line 67
    .line 68
    if-eq v1, v3, :cond_7

    .line 69
    .line 70
    return v2

    .line 71
    :cond_7
    iget-object v1, p0, Ls/d;->g:Lcoil3/request/CachePolicy;

    .line 72
    .line 73
    iget-object v3, p1, Ls/d;->g:Lcoil3/request/CachePolicy;

    .line 74
    .line 75
    if-eq v1, v3, :cond_8

    .line 76
    .line 77
    return v2

    .line 78
    :cond_8
    iget-object v1, p0, Ls/d;->h:Lr6/c;

    .line 79
    .line 80
    iget-object v3, p1, Ls/d;->h:Lr6/c;

    .line 81
    .line 82
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v1, p0, Ls/d;->i:Lr6/c;

    .line 90
    .line 91
    iget-object v3, p1, Ls/d;->i:Lr6/c;

    .line 92
    .line 93
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v1, p0, Ls/d;->j:Lr6/c;

    .line 101
    .line 102
    iget-object v3, p1, Ls/d;->j:Lr6/c;

    .line 103
    .line 104
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v1, p0, Ls/d;->k:Lt/g;

    .line 112
    .line 113
    iget-object v3, p1, Ls/d;->k:Lt/g;

    .line 114
    .line 115
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v1, p0, Ls/d;->l:Lcoil3/size/Scale;

    .line 123
    .line 124
    iget-object v3, p1, Ls/d;->l:Lcoil3/size/Scale;

    .line 125
    .line 126
    if-eq v1, v3, :cond_d

    .line 127
    .line 128
    return v2

    .line 129
    :cond_d
    iget-object v1, p0, Ls/d;->m:Lcoil3/size/Precision;

    .line 130
    .line 131
    iget-object v3, p1, Ls/d;->m:Lcoil3/size/Precision;

    .line 132
    .line 133
    if-eq v1, v3, :cond_e

    .line 134
    .line 135
    return v2

    .line 136
    :cond_e
    iget-object v1, p0, Ls/d;->n:Lcoil3/j;

    .line 137
    .line 138
    iget-object p1, p1, Ls/d;->n:Lcoil3/j;

    .line 139
    .line 140
    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    if-nez p1, :cond_f

    .line 145
    .line 146
    return v2

    .line 147
    :cond_f
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Ls/d;->a:Lokio/FileSystem;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Ls/d;->b:Lh6/h;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget-object v0, p0, Ls/d;->c:Lh6/h;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v1

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-object v1, p0, Ls/d;->d:Lh6/h;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v1, v0

    .line 34
    mul-int/lit8 v1, v1, 0x1f

    .line 35
    .line 36
    iget-object v0, p0, Ls/d;->e:Lcoil3/request/CachePolicy;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    add-int/2addr v0, v1

    .line 43
    mul-int/lit8 v0, v0, 0x1f

    .line 44
    .line 45
    iget-object v1, p0, Ls/d;->f:Lcoil3/request/CachePolicy;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    add-int/2addr v1, v0

    .line 52
    mul-int/lit8 v1, v1, 0x1f

    .line 53
    .line 54
    iget-object v0, p0, Ls/d;->g:Lcoil3/request/CachePolicy;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    add-int/2addr v0, v1

    .line 61
    mul-int/lit8 v0, v0, 0x1f

    .line 62
    .line 63
    iget-object v1, p0, Ls/d;->h:Lr6/c;

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    add-int/2addr v1, v0

    .line 70
    mul-int/lit8 v1, v1, 0x1f

    .line 71
    .line 72
    iget-object v0, p0, Ls/d;->i:Lr6/c;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    add-int/2addr v0, v1

    .line 79
    mul-int/lit8 v0, v0, 0x1f

    .line 80
    .line 81
    iget-object v1, p0, Ls/d;->j:Lr6/c;

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    add-int/2addr v1, v0

    .line 88
    mul-int/lit8 v1, v1, 0x1f

    .line 89
    .line 90
    iget-object v0, p0, Ls/d;->k:Lt/g;

    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    add-int/2addr v0, v1

    .line 97
    mul-int/lit8 v0, v0, 0x1f

    .line 98
    .line 99
    iget-object v1, p0, Ls/d;->l:Lcoil3/size/Scale;

    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    add-int/2addr v1, v0

    .line 106
    mul-int/lit8 v1, v1, 0x1f

    .line 107
    .line 108
    iget-object v0, p0, Ls/d;->m:Lcoil3/size/Precision;

    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    add-int/2addr v0, v1

    .line 115
    mul-int/lit8 v0, v0, 0x1f

    .line 116
    .line 117
    iget-object v1, p0, Ls/d;->n:Lcoil3/j;

    .line 118
    .line 119
    iget-object v1, v1, Lcoil3/j;->a:Ljava/util/Map;

    .line 120
    .line 121
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    add-int/2addr v1, v0

    .line 126
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Defaults(fileSystem="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Ls/d;->a:Lokio/FileSystem;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", interceptorCoroutineContext="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Ls/d;->b:Lh6/h;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", fetcherCoroutineContext="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Ls/d;->c:Lh6/h;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", decoderCoroutineContext="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Ls/d;->d:Lh6/h;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", memoryCachePolicy="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Ls/d;->e:Lcoil3/request/CachePolicy;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", diskCachePolicy="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Ls/d;->f:Lcoil3/request/CachePolicy;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", networkCachePolicy="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, Ls/d;->g:Lcoil3/request/CachePolicy;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", placeholderFactory="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, Ls/d;->h:Lr6/c;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, ", errorFactory="

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget-object v1, p0, Ls/d;->i:Lr6/c;

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v1, ", fallbackFactory="

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget-object v1, p0, Ls/d;->j:Lr6/c;

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v1, ", sizeResolver="

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget-object v1, p0, Ls/d;->k:Lt/g;

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string v1, ", scale="

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    iget-object v1, p0, Ls/d;->l:Lcoil3/size/Scale;

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string v1, ", precision="

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    iget-object v1, p0, Ls/d;->m:Lcoil3/size/Precision;

    .line 129
    .line 130
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string v1, ", extras="

    .line 134
    .line 135
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    iget-object v1, p0, Ls/d;->n:Lcoil3/j;

    .line 139
    .line 140
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const/16 v1, 0x29

    .line 144
    .line 145
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    return-object v0
.end method
