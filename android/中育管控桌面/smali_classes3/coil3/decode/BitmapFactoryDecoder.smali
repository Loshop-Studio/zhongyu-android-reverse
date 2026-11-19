.class public final Lcoil3/decode/BitmapFactoryDecoder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcoil3/decode/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcoil3/decode/BitmapFactoryDecoder$a;,
        Lcoil3/decode/BitmapFactoryDecoder$b;,
        Lcoil3/decode/BitmapFactoryDecoder$c;
    }
.end annotation


# static fields
.field public static final e:Lcoil3/decode/BitmapFactoryDecoder$a;


# instance fields
.field public final a:Ln/r;

.field public final b:Ly/m;

.field public final c:Lkotlinx/coroutines/sync/Semaphore;

.field public final d:Ln/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcoil3/decode/BitmapFactoryDecoder$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcoil3/decode/BitmapFactoryDecoder$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcoil3/decode/BitmapFactoryDecoder;->e:Lcoil3/decode/BitmapFactoryDecoder$a;

    return-void
.end method

.method public constructor <init>(Ln/r;Ly/m;Lkotlinx/coroutines/sync/Semaphore;Ln/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcoil3/decode/BitmapFactoryDecoder;->a:Ln/r;

    .line 5
    .line 6
    iput-object p2, p0, Lcoil3/decode/BitmapFactoryDecoder;->b:Ly/m;

    .line 7
    .line 8
    iput-object p3, p0, Lcoil3/decode/BitmapFactoryDecoder;->c:Lkotlinx/coroutines/sync/Semaphore;

    .line 9
    .line 10
    iput-object p4, p0, Lcoil3/decode/BitmapFactoryDecoder;->d:Ln/n;

    .line 11
    .line 12
    return-void
.end method

.method public static synthetic b(Lcoil3/decode/BitmapFactoryDecoder;)Ln/g;
    .locals 0

    .line 1
    invoke-static {p0}, Lcoil3/decode/BitmapFactoryDecoder;->f(Lcoil3/decode/BitmapFactoryDecoder;)Ln/g;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lcoil3/decode/BitmapFactoryDecoder;)Ln/g;
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lcoil3/decode/BitmapFactoryDecoder;->e(Landroid/graphics/BitmapFactory$Options;)Ln/g;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method


# virtual methods
.method public a(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p1, Lcoil3/decode/BitmapFactoryDecoder$decode$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcoil3/decode/BitmapFactoryDecoder$decode$1;

    .line 7
    .line 8
    iget v1, v0, Lcoil3/decode/BitmapFactoryDecoder$decode$1;->f:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcoil3/decode/BitmapFactoryDecoder$decode$1;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcoil3/decode/BitmapFactoryDecoder$decode$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcoil3/decode/BitmapFactoryDecoder$decode$1;-><init>(Lcoil3/decode/BitmapFactoryDecoder;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcoil3/decode/BitmapFactoryDecoder$decode$1;->d:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcoil3/decode/BitmapFactoryDecoder$decode$1;->f:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v5, :cond_2

    .line 39
    .line 40
    if-ne v2, v4, :cond_1

    .line 41
    .line 42
    iget-object v0, v0, Lcoil3/decode/BitmapFactoryDecoder$decode$1;->a:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Lkotlinx/coroutines/sync/Semaphore;

    .line 45
    .line 46
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    goto :goto_3

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    goto :goto_4

    .line 52
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_2
    iget v2, v0, Lcoil3/decode/BitmapFactoryDecoder$decode$1;->b:I

    .line 61
    .line 62
    iget-object v6, v0, Lcoil3/decode/BitmapFactoryDecoder$decode$1;->a:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v6, Lkotlinx/coroutines/sync/Semaphore;

    .line 65
    .line 66
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move-object p1, v6

    .line 70
    goto :goto_1

    .line 71
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, Lcoil3/decode/BitmapFactoryDecoder;->c:Lkotlinx/coroutines/sync/Semaphore;

    .line 75
    .line 76
    iput-object p1, v0, Lcoil3/decode/BitmapFactoryDecoder$decode$1;->a:Ljava/lang/Object;

    .line 77
    .line 78
    iput v3, v0, Lcoil3/decode/BitmapFactoryDecoder$decode$1;->b:I

    .line 79
    .line 80
    iput v5, v0, Lcoil3/decode/BitmapFactoryDecoder$decode$1;->f:I

    .line 81
    .line 82
    invoke-interface {p1, v0}, Lkotlinx/coroutines/sync/Semaphore;->acquire(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    if-ne v2, v1, :cond_4

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_4
    move v2, v3

    .line 90
    :goto_1
    :try_start_1
    new-instance v6, Ln/d;

    .line 91
    .line 92
    invoke-direct {v6, p0}, Ln/d;-><init>(Lcoil3/decode/BitmapFactoryDecoder;)V

    .line 93
    .line 94
    .line 95
    iput-object p1, v0, Lcoil3/decode/BitmapFactoryDecoder$decode$1;->a:Ljava/lang/Object;

    .line 96
    .line 97
    iput v2, v0, Lcoil3/decode/BitmapFactoryDecoder$decode$1;->b:I

    .line 98
    .line 99
    iput v3, v0, Lcoil3/decode/BitmapFactoryDecoder$decode$1;->c:I

    .line 100
    .line 101
    iput v4, v0, Lcoil3/decode/BitmapFactoryDecoder$decode$1;->f:I

    .line 102
    .line 103
    const/4 v2, 0x0

    .line 104
    invoke-static {v2, v6, v0, v5, v2}, Lkotlinx/coroutines/InterruptibleKt;->runInterruptible$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 108
    if-ne v0, v1, :cond_5

    .line 109
    .line 110
    :goto_2
    return-object v1

    .line 111
    :cond_5
    move-object v7, v0

    .line 112
    move-object v0, p1

    .line 113
    move-object p1, v7

    .line 114
    :goto_3
    :try_start_2
    check-cast p1, Ln/g;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 115
    .line 116
    invoke-interface {v0}, Lkotlinx/coroutines/sync/Semaphore;->release()V

    .line 117
    .line 118
    .line 119
    return-object p1

    .line 120
    :catchall_1
    move-exception v0

    .line 121
    move-object v7, v0

    .line 122
    move-object v0, p1

    .line 123
    move-object p1, v7

    .line 124
    :goto_4
    invoke-interface {v0}, Lkotlinx/coroutines/sync/Semaphore;->release()V

    .line 125
    .line 126
    .line 127
    throw p1
.end method

.method public final c(Landroid/graphics/BitmapFactory$Options;Ln/i;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcoil3/decode/BitmapFactoryDecoder;->b:Ly/m;

    .line 2
    .line 3
    invoke-static {v0}, Ly/i;->j(Ly/m;)Landroid/graphics/Bitmap$Config;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p2}, Ln/i;->b()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-static {p2}, Ln/p;->a(Ln/i;)Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-eqz p2, :cond_1

    .line 18
    .line 19
    :cond_0
    invoke-static {v0}, Lc0/a;->e(Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap$Config;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :cond_1
    iget-object p2, p0, Lcoil3/decode/BitmapFactoryDecoder;->b:Ly/m;

    .line 24
    .line 25
    invoke-static {p2}, Ly/i;->h(Ly/m;)Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-eqz p2, :cond_2

    .line 30
    .line 31
    sget-object p2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 32
    .line 33
    if-ne v0, p2, :cond_2

    .line 34
    .line 35
    iget-object p2, p1, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    .line 36
    .line 37
    const-string v1, "image/jpeg"

    .line 38
    .line 39
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    if-eqz p2, :cond_2

    .line 44
    .line 45
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 46
    .line 47
    :cond_2
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 48
    .line 49
    const/16 v1, 0x1a

    .line 50
    .line 51
    if-lt p2, v1, :cond_3

    .line 52
    .line 53
    invoke-static {p1}, Ln/c;->a(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap$Config;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-static {}, Landroidx/compose/ui/graphics/m0;->a()Landroid/graphics/Bitmap$Config;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    if-ne p2, v1, :cond_3

    .line 62
    .line 63
    invoke-static {}, Landroidx/compose/ui/graphics/l0;->a()Landroid/graphics/Bitmap$Config;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    if-eq v0, p2, :cond_3

    .line 68
    .line 69
    invoke-static {}, Landroidx/compose/ui/graphics/m0;->a()Landroid/graphics/Bitmap$Config;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    :cond_3
    iput-object v0, p1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 74
    .line 75
    return-void
.end method

.method public final d(Landroid/graphics/BitmapFactory$Options;Ln/i;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    if-lez v2, :cond_7

    .line 10
    .line 11
    iget v2, v1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 12
    .line 13
    if-gtz v2, :cond_0

    .line 14
    .line 15
    goto/16 :goto_2

    .line 16
    .line 17
    :cond_0
    invoke-static/range {p2 .. p2}, Ln/p;->b(Ln/i;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    iget v2, v1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    iget v2, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 27
    .line 28
    :goto_0
    invoke-static/range {p2 .. p2}, Ln/p;->b(Ln/i;)Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-eqz v5, :cond_2

    .line 33
    .line 34
    iget v5, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    iget v5, v1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 38
    .line 39
    :goto_1
    iget-object v6, v0, Lcoil3/decode/BitmapFactoryDecoder;->b:Ly/m;

    .line 40
    .line 41
    invoke-virtual {v6}, Ly/m;->k()Lz/e;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    iget-object v7, v0, Lcoil3/decode/BitmapFactoryDecoder;->b:Ly/m;

    .line 46
    .line 47
    invoke-virtual {v7}, Ly/m;->j()Lcoil3/size/Scale;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    iget-object v8, v0, Lcoil3/decode/BitmapFactoryDecoder;->b:Ly/m;

    .line 52
    .line 53
    invoke-static {v8}, Ly/f;->d(Ly/m;)Lz/e;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    invoke-static {v2, v5, v6, v7, v8}, Ln/h;->b(IILz/e;Lcoil3/size/Scale;Lz/e;)J

    .line 58
    .line 59
    .line 60
    move-result-wide v6

    .line 61
    invoke-static {v6, v7}, Lc0/o;->c(J)I

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    invoke-static {v6, v7}, Lc0/o;->d(J)I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    iget-object v7, v0, Lcoil3/decode/BitmapFactoryDecoder;->b:Ly/m;

    .line 70
    .line 71
    invoke-virtual {v7}, Ly/m;->j()Lcoil3/size/Scale;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    invoke-static {v2, v5, v8, v6, v7}, Ln/h;->a(IIIILcoil3/size/Scale;)I

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    iput v7, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 80
    .line 81
    int-to-double v9, v2

    .line 82
    int-to-double v11, v7

    .line 83
    div-double v13, v9, v11

    .line 84
    .line 85
    int-to-double v9, v5

    .line 86
    int-to-double v11, v7

    .line 87
    div-double v15, v9, v11

    .line 88
    .line 89
    int-to-double v7, v8

    .line 90
    int-to-double v5, v6

    .line 91
    iget-object v2, v0, Lcoil3/decode/BitmapFactoryDecoder;->b:Ly/m;

    .line 92
    .line 93
    invoke-virtual {v2}, Ly/m;->j()Lcoil3/size/Scale;

    .line 94
    .line 95
    .line 96
    move-result-object v21

    .line 97
    move-wide/from16 v19, v5

    .line 98
    .line 99
    move-wide/from16 v17, v7

    .line 100
    .line 101
    invoke-static/range {v13 .. v21}, Ln/h;->c(DDDDLcoil3/size/Scale;)D

    .line 102
    .line 103
    .line 104
    move-result-wide v5

    .line 105
    iget-object v2, v0, Lcoil3/decode/BitmapFactoryDecoder;->b:Ly/m;

    .line 106
    .line 107
    invoke-virtual {v2}, Ly/m;->i()Lcoil3/size/Precision;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    sget-object v7, Lcoil3/size/Precision;->b:Lcoil3/size/Precision;

    .line 112
    .line 113
    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    .line 114
    .line 115
    if-ne v2, v7, :cond_3

    .line 116
    .line 117
    invoke-static {v5, v6, v8, v9}, Lkotlin/ranges/RangesKt;->coerceAtMost(DD)D

    .line 118
    .line 119
    .line 120
    move-result-wide v5

    .line 121
    :cond_3
    cmpg-double v2, v5, v8

    .line 122
    .line 123
    if-nez v2, :cond_4

    .line 124
    .line 125
    move v3, v4

    .line 126
    :cond_4
    xor-int/lit8 v2, v3, 0x1

    .line 127
    .line 128
    iput-boolean v2, v1, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 129
    .line 130
    if-nez v3, :cond_6

    .line 131
    .line 132
    cmpl-double v2, v5, v8

    .line 133
    .line 134
    const v3, 0x7fffffff

    .line 135
    .line 136
    .line 137
    if-lez v2, :cond_5

    .line 138
    .line 139
    int-to-double v7, v3

    .line 140
    div-double/2addr v7, v5

    .line 141
    invoke-static {v7, v8}, Lkotlin/math/MathKt;->roundToInt(D)I

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    iput v2, v1, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 146
    .line 147
    iput v3, v1, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 148
    .line 149
    return-void

    .line 150
    :cond_5
    iput v3, v1, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 151
    .line 152
    int-to-double v2, v3

    .line 153
    mul-double/2addr v2, v5

    .line 154
    invoke-static {v2, v3}, Lkotlin/math/MathKt;->roundToInt(D)I

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    iput v2, v1, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 159
    .line 160
    :cond_6
    return-void

    .line 161
    :cond_7
    :goto_2
    iput v4, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 162
    .line 163
    iput-boolean v3, v1, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 164
    .line 165
    return-void
.end method

.method public final e(Landroid/graphics/BitmapFactory$Options;)Ln/g;
    .locals 9

    .line 1
    new-instance v0, Lcoil3/decode/BitmapFactoryDecoder$b;

    .line 2
    .line 3
    iget-object v1, p0, Lcoil3/decode/BitmapFactoryDecoder;->a:Ln/r;

    .line 4
    .line 5
    invoke-interface {v1}, Ln/r;->source()Lokio/BufferedSource;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Lcoil3/decode/BitmapFactoryDecoder$b;-><init>(Lokio/Source;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x1

    .line 17
    iput-boolean v2, p1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 18
    .line 19
    invoke-interface {v1}, Lokio/BufferedSource;->peek()Lokio/BufferedSource;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-interface {v3}, Lokio/BufferedSource;->inputStream()Ljava/io/InputStream;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const/4 v4, 0x0

    .line 28
    invoke-static {v3, v4, p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lcoil3/decode/BitmapFactoryDecoder$b;->a()Ljava/lang/Exception;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    if-nez v3, :cond_6

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    iput-boolean v3, p1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 39
    .line 40
    sget-object v5, Ln/o;->a:Ln/o;

    .line 41
    .line 42
    iget-object v6, p1, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v7, p0, Lcoil3/decode/BitmapFactoryDecoder;->d:Ln/n;

    .line 45
    .line 46
    invoke-virtual {v5, v6, v1, v7}, Ln/o;->a(Ljava/lang/String;Lokio/BufferedSource;Ln/n;)Ln/i;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    invoke-virtual {v0}, Lcoil3/decode/BitmapFactoryDecoder$b;->a()Ljava/lang/Exception;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    if-nez v7, :cond_5

    .line 55
    .line 56
    iput-boolean v3, p1, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    .line 57
    .line 58
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 59
    .line 60
    const/16 v8, 0x1a

    .line 61
    .line 62
    if-lt v7, v8, :cond_0

    .line 63
    .line 64
    iget-object v7, p0, Lcoil3/decode/BitmapFactoryDecoder;->b:Ly/m;

    .line 65
    .line 66
    invoke-static {v7}, Ly/i;->l(Ly/m;)Landroid/graphics/ColorSpace;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    if-eqz v7, :cond_0

    .line 71
    .line 72
    iget-object v7, p0, Lcoil3/decode/BitmapFactoryDecoder;->b:Ly/m;

    .line 73
    .line 74
    invoke-static {v7}, Ly/i;->l(Ly/m;)Landroid/graphics/ColorSpace;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    invoke-static {p1, v7}, Ln/b;->a(Landroid/graphics/BitmapFactory$Options;Landroid/graphics/ColorSpace;)V

    .line 79
    .line 80
    .line 81
    :cond_0
    iget-object v7, p0, Lcoil3/decode/BitmapFactoryDecoder;->b:Ly/m;

    .line 82
    .line 83
    invoke-static {v7}, Ly/i;->n(Ly/m;)Z

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    iput-boolean v7, p1, Landroid/graphics/BitmapFactory$Options;->inPremultiplied:Z

    .line 88
    .line 89
    invoke-virtual {p0, p1, v6}, Lcoil3/decode/BitmapFactoryDecoder;->c(Landroid/graphics/BitmapFactory$Options;Ln/i;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, p1, v6}, Lcoil3/decode/BitmapFactoryDecoder;->d(Landroid/graphics/BitmapFactory$Options;Ln/i;)V

    .line 93
    .line 94
    .line 95
    :try_start_0
    invoke-interface {v1}, Lokio/BufferedSource;->inputStream()Ljava/io/InputStream;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    invoke-static {v7, v4, p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 100
    .line 101
    .line 102
    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 103
    invoke-static {v1, v4}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Lcoil3/decode/BitmapFactoryDecoder$b;->a()Ljava/lang/Exception;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    if-nez v0, :cond_4

    .line 111
    .line 112
    if-eqz v7, :cond_3

    .line 113
    .line 114
    iget-object v0, p0, Lcoil3/decode/BitmapFactoryDecoder;->b:Ly/m;

    .line 115
    .line 116
    invoke-virtual {v0}, Ly/m;->c()Landroid/content/Context;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    iget v0, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 129
    .line 130
    invoke-virtual {v7, v0}, Landroid/graphics/Bitmap;->setDensity(I)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v5, v7, v6}, Ln/o;->b(Landroid/graphics/Bitmap;Ln/i;)Landroid/graphics/Bitmap;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    new-instance v1, Ln/g;

    .line 138
    .line 139
    iget-object v4, p0, Lcoil3/decode/BitmapFactoryDecoder;->b:Ly/m;

    .line 140
    .line 141
    invoke-virtual {v4}, Ly/m;->c()Landroid/content/Context;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    new-instance v5, Landroid/graphics/drawable/BitmapDrawable;

    .line 150
    .line 151
    invoke-direct {v5, v4, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 152
    .line 153
    .line 154
    invoke-static {v5}, Lk/o;->c(Landroid/graphics/drawable/Drawable;)Lk/j;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    iget v4, p1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 159
    .line 160
    if-gt v4, v2, :cond_2

    .line 161
    .line 162
    iget-boolean p1, p1, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 163
    .line 164
    if-eqz p1, :cond_1

    .line 165
    .line 166
    goto :goto_0

    .line 167
    :cond_1
    move v2, v3

    .line 168
    :cond_2
    :goto_0
    invoke-direct {v1, v0, v2}, Ln/g;-><init>(Lk/j;Z)V

    .line 169
    .line 170
    .line 171
    return-object v1

    .line 172
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 173
    .line 174
    const-string v0, "BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it\'s not encoded as a valid image format."

    .line 175
    .line 176
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    throw p1

    .line 180
    :cond_4
    throw v0

    .line 181
    :catchall_0
    move-exception p1

    .line 182
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 183
    :catchall_1
    move-exception v0

    .line 184
    invoke-static {v1, p1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 185
    .line 186
    .line 187
    throw v0

    .line 188
    :cond_5
    throw v7

    .line 189
    :cond_6
    throw v3
.end method
