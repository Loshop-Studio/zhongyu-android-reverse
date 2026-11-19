.class public final Li0/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:Ly/e;

.field public static final g:Ly/e;

.field public static final h:Ly/e;

.field public static final i:Ly/e;

.field public static final j:Ljava/util/Set;

.field public static final k:Lio/reactivex/internal/operators/observable/c;

.field public static final l:Ljava/util/Set;

.field public static final m:Ljava/util/ArrayDeque;


# instance fields
.field public final a:Lc0/b;

.field public final b:Landroid/util/DisplayMetrics;

.field public final c:Lc0/g;

.field public final d:Ljava/util/ArrayList;

.field public final e:Li0/s;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat"

    .line 2
    .line 3
    sget-object v1, Lcom/bumptech/glide/load/DecodeFormat;->DEFAULT:Lcom/bumptech/glide/load/DecodeFormat;

    .line 4
    .line 5
    invoke-static {v1, v0}, Ly/e;->a(Ljava/lang/Object;Ljava/lang/String;)Ly/e;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Li0/m;->f:Ly/e;

    .line 10
    .line 11
    const-string v0, "com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace"

    .line 12
    .line 13
    sget-object v1, Lcom/bumptech/glide/load/PreferredColorSpace;->SRGB:Lcom/bumptech/glide/load/PreferredColorSpace;

    .line 14
    .line 15
    invoke-static {v1, v0}, Ly/e;->a(Ljava/lang/Object;Ljava/lang/String;)Ly/e;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Li0/m;->g:Ly/e;

    .line 20
    .line 21
    sget-object v0, Li0/k;->b:Li0/k;

    .line 22
    .line 23
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 24
    .line 25
    const-string v1, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize"

    .line 26
    .line 27
    invoke-static {v0, v1}, Ly/e;->a(Ljava/lang/Object;Ljava/lang/String;)Ly/e;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    sput-object v1, Li0/m;->h:Ly/e;

    .line 32
    .line 33
    const-string v1, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode"

    .line 34
    .line 35
    invoke-static {v0, v1}, Ly/e;->a(Ljava/lang/Object;Ljava/lang/String;)Ly/e;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Li0/m;->i:Ly/e;

    .line 40
    .line 41
    new-instance v0, Ljava/util/HashSet;

    .line 42
    .line 43
    const-string v1, "image/vnd.wap.wbmp"

    .line 44
    .line 45
    const-string v2, "image/x-ico"

    .line 46
    .line 47
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sput-object v0, Li0/m;->j:Ljava/util/Set;

    .line 63
    .line 64
    new-instance v0, Lio/reactivex/internal/operators/observable/c;

    .line 65
    .line 66
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 67
    .line 68
    .line 69
    sput-object v0, Li0/m;->k:Lio/reactivex/internal/operators/observable/c;

    .line 70
    .line 71
    sget-object v0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->JPEG:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 72
    .line 73
    sget-object v1, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->PNG_A:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 74
    .line 75
    sget-object v2, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->PNG:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 76
    .line 77
    invoke-static {v0, v1, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    sput-object v0, Li0/m;->l:Ljava/util/Set;

    .line 86
    .line 87
    sget-object v0, Lv0/k;->a:[C

    .line 88
    .line 89
    new-instance v0, Ljava/util/ArrayDeque;

    .line 90
    .line 91
    const/4 v1, 0x0

    .line 92
    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    .line 93
    .line 94
    .line 95
    sput-object v0, Li0/m;->m:Ljava/util/ArrayDeque;

    .line 96
    .line 97
    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Landroid/util/DisplayMetrics;Lc0/b;Lc0/g;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Li0/s;->a()Li0/s;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Li0/m;->e:Li0/s;

    .line 9
    .line 10
    iput-object p1, p0, Li0/m;->d:Ljava/util/ArrayList;

    .line 11
    .line 12
    const-string p1, "Argument must not be null"

    .line 13
    .line 14
    invoke-static {p2, p1}, Lv7/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, Li0/m;->b:Landroid/util/DisplayMetrics;

    .line 18
    .line 19
    iput-object p3, p0, Li0/m;->a:Lc0/b;

    .line 20
    .line 21
    iput-object p4, p0, Li0/m;->c:Lc0/g;

    .line 22
    .line 23
    return-void
.end method

.method public static c(Lb0/g;Landroid/graphics/BitmapFactory$Options;Li0/l;Lc0/b;)Landroid/graphics/Bitmap;
    .locals 9

    .line 1
    const-string v0, "Downsampler"

    .line 2
    .line 3
    iget-boolean v1, p1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    invoke-interface {p2}, Li0/l;->l()V

    .line 8
    .line 9
    .line 10
    iget v1, p0, Lb0/g;->a:I

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :pswitch_0
    iget-object v1, p0, Lb0/g;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Lz/h;

    .line 19
    .line 20
    iget-object v1, v1, Lz/h;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Lcom/bumptech/glide/load/resource/bitmap/a;

    .line 23
    .line 24
    monitor-enter v1

    .line 25
    :try_start_0
    iget-object v2, v1, Lcom/bumptech/glide/load/resource/bitmap/a;->a:[B

    .line 26
    .line 27
    array-length v2, v2

    .line 28
    iput v2, v1, Lcom/bumptech/glide/load/resource/bitmap/a;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    monitor-exit v1

    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    throw p0

    .line 35
    :cond_0
    :goto_0
    iget v1, p1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 36
    .line 37
    iget v2, p1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 38
    .line 39
    iget-object v3, p1, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    .line 40
    .line 41
    sget-object v4, Li0/u;->b:Ljava/util/concurrent/locks/Lock;

    .line 42
    .line 43
    invoke-interface {v4}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 44
    .line 45
    .line 46
    :try_start_2
    invoke-virtual {p0, p1}, Lb0/g;->c(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 47
    .line 48
    .line 49
    move-result-object p0
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 50
    invoke-interface {v4}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 51
    .line 52
    .line 53
    return-object p0

    .line 54
    :catch_0
    move-exception v4

    .line 55
    :try_start_3
    new-instance v5, Ljava/io/IOException;

    .line 56
    .line 57
    const-string v6, "Exception decoding bitmap, outWidth: "

    .line 58
    .line 59
    const-string v7, ", outHeight: "

    .line 60
    .line 61
    const-string v8, ", outMimeType: "

    .line 62
    .line 63
    invoke-static {v6, v7, v1, v8, v2}, Landroid/support/v4/media/f;->x(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v2, ", inBitmap: "

    .line 71
    .line 72
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    iget-object v2, p1, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    .line 76
    .line 77
    invoke-static {v2}, Li0/m;->d(Landroid/graphics/Bitmap;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-direct {v5, v1, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    const/4 v1, 0x3

    .line 92
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_1

    .line 97
    .line 98
    const-string v1, "Failed to decode with inBitmap, trying again without Bitmap re-use"

    .line 99
    .line 100
    invoke-static {v0, v1, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 101
    .line 102
    .line 103
    :cond_1
    iget-object v0, p1, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 104
    .line 105
    if-eqz v0, :cond_2

    .line 106
    .line 107
    :try_start_4
    invoke-interface {p3, v0}, Lc0/b;->b(Landroid/graphics/Bitmap;)V

    .line 108
    .line 109
    .line 110
    const/4 v0, 0x0

    .line 111
    iput-object v0, p1, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    .line 112
    .line 113
    invoke-static {p0, p1, p2, p3}, Li0/m;->c(Lb0/g;Landroid/graphics/BitmapFactory$Options;Li0/l;Lc0/b;)Landroid/graphics/Bitmap;

    .line 114
    .line 115
    .line 116
    move-result-object p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 117
    sget-object p1, Li0/u;->b:Ljava/util/concurrent/locks/Lock;

    .line 118
    .line 119
    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 120
    .line 121
    .line 122
    return-object p0

    .line 123
    :catch_1
    :try_start_5
    throw v5

    .line 124
    :cond_2
    throw v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 125
    :catchall_1
    move-exception p0

    .line 126
    sget-object p1, Li0/u;->b:Ljava/util/concurrent/locks/Lock;

    .line 127
    .line 128
    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 129
    .line 130
    .line 131
    throw p0

    .line 132
    nop

    .line 133
    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_0
    .end packed-switch
.end method

.method public static d(Landroid/graphics/Bitmap;)Ljava/lang/String;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v1, " ("

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, ")"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v2, "["

    .line 31
    .line 32
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string/jumbo v2, "x"

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v2, "] "

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0
.end method

.method public static e(Landroid/graphics/BitmapFactory$Options;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Landroid/graphics/BitmapFactory$Options;->inTempStorage:[B

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput-boolean v1, p0, Landroid/graphics/BitmapFactory$Options;->inDither:Z

    .line 6
    .line 7
    iput-boolean v1, p0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    iput v2, p0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 11
    .line 12
    iput-object v0, p0, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 13
    .line 14
    iput-boolean v1, p0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 15
    .line 16
    iput v1, p0, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 17
    .line 18
    iput v1, p0, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 19
    .line 20
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 21
    .line 22
    const/16 v4, 0x1a

    .line 23
    .line 24
    if-lt v3, v4, :cond_0

    .line 25
    .line 26
    invoke-static {p0}, Landroidx/core/util/a;->p(Landroid/graphics/BitmapFactory$Options;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p0}, Landroidx/core/util/a;->C(Landroid/graphics/BitmapFactory$Options;)V

    .line 30
    .line 31
    .line 32
    invoke-static {p0}, Landroidx/core/util/a;->D(Landroid/graphics/BitmapFactory$Options;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    iput v1, p0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 36
    .line 37
    iput v1, p0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 38
    .line 39
    iput-object v0, p0, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    .line 40
    .line 41
    iput-object v0, p0, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    .line 42
    .line 43
    iput-boolean v2, p0, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final a(Lb0/g;IILy/f;Li0/l;)Li0/c;
    .locals 14

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    iget-object v2, p0, Li0/m;->c:Lc0/g;

    .line 4
    .line 5
    const/high16 v3, 0x10000

    .line 6
    .line 7
    const-class v4, [B

    .line 8
    .line 9
    invoke-virtual {v2, v4, v3}, Lc0/g;->e(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    move-object v12, v2

    .line 14
    check-cast v12, [B

    .line 15
    .line 16
    const-class v2, Li0/m;

    .line 17
    .line 18
    monitor-enter v2

    .line 19
    :try_start_0
    sget-object v13, Li0/m;->m:Ljava/util/ArrayDeque;

    .line 20
    .line 21
    monitor-enter v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    :try_start_1
    invoke-virtual {v13}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Landroid/graphics/BitmapFactory$Options;

    .line 27
    .line 28
    monitor-exit v13
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 29
    if-nez v3, :cond_0

    .line 30
    .line 31
    :try_start_2
    new-instance v3, Landroid/graphics/BitmapFactory$Options;

    .line 32
    .line 33
    invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-static {v3}, Li0/m;->e(Landroid/graphics/BitmapFactory$Options;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    goto/16 :goto_3

    .line 42
    .line 43
    :cond_0
    :goto_0
    monitor-exit v2

    .line 44
    iput-object v12, v3, Landroid/graphics/BitmapFactory$Options;->inTempStorage:[B

    .line 45
    .line 46
    sget-object v2, Li0/m;->f:Ly/e;

    .line 47
    .line 48
    invoke-virtual {v0, v2}, Ly/f;->c(Ly/e;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    move-object v5, v2

    .line 53
    check-cast v5, Lcom/bumptech/glide/load/DecodeFormat;

    .line 54
    .line 55
    sget-object v2, Li0/m;->g:Ly/e;

    .line 56
    .line 57
    invoke-virtual {v0, v2}, Ly/f;->c(Ly/e;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    move-object v6, v2

    .line 62
    check-cast v6, Lcom/bumptech/glide/load/PreferredColorSpace;

    .line 63
    .line 64
    sget-object v2, Li0/k;->g:Ly/e;

    .line 65
    .line 66
    invoke-virtual {v0, v2}, Ly/f;->c(Ly/e;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    move-object v4, v2

    .line 71
    check-cast v4, Li0/k;

    .line 72
    .line 73
    sget-object v2, Li0/m;->h:Ly/e;

    .line 74
    .line 75
    invoke-virtual {v0, v2}, Ly/f;->c(Ly/e;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast v2, Ljava/lang/Boolean;

    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 82
    .line 83
    .line 84
    move-result v10

    .line 85
    sget-object v2, Li0/m;->i:Ly/e;

    .line 86
    .line 87
    invoke-virtual {v0, v2}, Ly/f;->c(Ly/e;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    if-eqz v7, :cond_1

    .line 92
    .line 93
    invoke-virtual {v0, v2}, Ly/f;->c(Ly/e;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, Ljava/lang/Boolean;

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_1

    .line 104
    .line 105
    const/4 v0, 0x1

    .line 106
    :goto_1
    move-object v1, p0

    .line 107
    move-object v2, p1

    .line 108
    move/from16 v8, p2

    .line 109
    .line 110
    move/from16 v9, p3

    .line 111
    .line 112
    move-object/from16 v11, p5

    .line 113
    .line 114
    move v7, v0

    .line 115
    goto :goto_2

    .line 116
    :cond_1
    const/4 v0, 0x0

    .line 117
    goto :goto_1

    .line 118
    :goto_2
    :try_start_3
    invoke-virtual/range {v1 .. v11}, Li0/m;->b(Lb0/g;Landroid/graphics/BitmapFactory$Options;Li0/k;Lcom/bumptech/glide/load/DecodeFormat;Lcom/bumptech/glide/load/PreferredColorSpace;ZIIZLi0/l;)Landroid/graphics/Bitmap;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    iget-object v2, p0, Li0/m;->a:Lc0/b;

    .line 123
    .line 124
    invoke-static {v0, v2}, Li0/c;->b(Landroid/graphics/Bitmap;Lc0/b;)Li0/c;

    .line 125
    .line 126
    .line 127
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 128
    invoke-static {v3}, Li0/m;->e(Landroid/graphics/BitmapFactory$Options;)V

    .line 129
    .line 130
    .line 131
    monitor-enter v13

    .line 132
    :try_start_4
    invoke-virtual {v13, v3}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    monitor-exit v13
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 136
    iget-object v2, p0, Li0/m;->c:Lc0/g;

    .line 137
    .line 138
    invoke-virtual {v2, v12}, Lc0/g;->j(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    return-object v0

    .line 142
    :catchall_1
    move-exception v0

    .line 143
    :try_start_5
    monitor-exit v13
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 144
    throw v0

    .line 145
    :catchall_2
    move-exception v0

    .line 146
    invoke-static {v3}, Li0/m;->e(Landroid/graphics/BitmapFactory$Options;)V

    .line 147
    .line 148
    .line 149
    sget-object v4, Li0/m;->m:Ljava/util/ArrayDeque;

    .line 150
    .line 151
    monitor-enter v4

    .line 152
    :try_start_6
    invoke-virtual {v4, v3}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    monitor-exit v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 156
    iget-object v2, p0, Li0/m;->c:Lc0/g;

    .line 157
    .line 158
    invoke-virtual {v2, v12}, Lc0/g;->j(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    throw v0

    .line 162
    :catchall_3
    move-exception v0

    .line 163
    :try_start_7
    monitor-exit v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 164
    throw v0

    .line 165
    :catchall_4
    move-exception v0

    .line 166
    :try_start_8
    monitor-exit v13
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 167
    :try_start_9
    throw v0

    .line 168
    :goto_3
    monitor-exit v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 169
    throw v0
.end method

.method public final b(Lb0/g;Landroid/graphics/BitmapFactory$Options;Li0/k;Lcom/bumptech/glide/load/DecodeFormat;Lcom/bumptech/glide/load/PreferredColorSpace;ZIIZLi0/l;)Landroid/graphics/Bitmap;
    .locals 43

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v0, p3

    .line 8
    .line 9
    move/from16 v5, p7

    .line 10
    .line 11
    move/from16 v6, p8

    .line 12
    .line 13
    move-object/from16 v7, p10

    .line 14
    .line 15
    const-string v8, ", target density: "

    .line 16
    .line 17
    const-string v9, ", density: "

    .line 18
    .line 19
    const-string/jumbo v10, "x"

    .line 20
    .line 21
    .line 22
    const-string v11, "Downsampler"

    .line 23
    .line 24
    sget v12, Lv0/f;->b:I

    .line 25
    .line 26
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 27
    .line 28
    .line 29
    move-result-wide v12

    .line 30
    iget-object v14, v1, Li0/m;->a:Lc0/b;

    .line 31
    .line 32
    const/4 v15, 0x1

    .line 33
    iput-boolean v15, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 34
    .line 35
    invoke-static {v2, v3, v7, v14}, Li0/m;->c(Lb0/g;Landroid/graphics/BitmapFactory$Options;Li0/l;Lc0/b;)Landroid/graphics/Bitmap;

    .line 36
    .line 37
    .line 38
    move/from16 v16, v15

    .line 39
    .line 40
    const/4 v15, 0x0

    .line 41
    iput-boolean v15, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 42
    .line 43
    move/from16 v17, v15

    .line 44
    .line 45
    iget v15, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 46
    .line 47
    move-wide/from16 v18, v12

    .line 48
    .line 49
    iget v12, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 50
    .line 51
    filled-new-array {v15, v12}, [I

    .line 52
    .line 53
    .line 54
    move-result-object v12

    .line 55
    aget v13, v12, v17

    .line 56
    .line 57
    aget v12, v12, v16

    .line 58
    .line 59
    iget-object v15, v3, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    .line 60
    .line 61
    move-object/from16 v20, v15

    .line 62
    .line 63
    const/4 v15, -0x1

    .line 64
    if-eq v13, v15, :cond_1

    .line 65
    .line 66
    if-ne v12, v15, :cond_0

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    move/from16 v21, p6

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    :goto_0
    move/from16 v21, v17

    .line 73
    .line 74
    :goto_1
    iget v15, v2, Lb0/g;->a:I

    .line 75
    .line 76
    const/16 v23, 0x0

    .line 77
    .line 78
    packed-switch v15, :pswitch_data_0

    .line 79
    .line 80
    .line 81
    iget-object v15, v2, Lb0/g;->c:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v15, Ljava/util/List;

    .line 84
    .line 85
    iget-object v4, v2, Lb0/g;->d:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v4, Lz/h;

    .line 88
    .line 89
    move-object/from16 p6, v4

    .line 90
    .line 91
    iget-object v4, v2, Lb0/g;->b:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v4, Lc0/g;

    .line 94
    .line 95
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    move-object/from16 v24, v9

    .line 100
    .line 101
    move/from16 v9, v17

    .line 102
    .line 103
    :goto_2
    if-ge v9, v1, :cond_4

    .line 104
    .line 105
    invoke-interface {v15, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v25

    .line 109
    move/from16 v26, v1

    .line 110
    .line 111
    move-object/from16 v1, v25

    .line 112
    .line 113
    check-cast v1, Ly/b;

    .line 114
    .line 115
    move/from16 v25, v9

    .line 116
    .line 117
    :try_start_0
    new-instance v9, Lcom/bumptech/glide/load/resource/bitmap/a;

    .line 118
    .line 119
    move-object/from16 v27, v15

    .line 120
    .line 121
    new-instance v15, Ljava/io/FileInputStream;

    .line 122
    .line 123
    invoke-virtual/range {p6 .. p6}, Lz/h;->e()Landroid/os/ParcelFileDescriptor;

    .line 124
    .line 125
    .line 126
    move-result-object v28

    .line 127
    move-object/from16 v29, v8

    .line 128
    .line 129
    invoke-virtual/range {v28 .. v28}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 130
    .line 131
    .line 132
    move-result-object v8

    .line 133
    invoke-direct {v15, v8}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    .line 134
    .line 135
    .line 136
    invoke-direct {v9, v15, v4}, Lcom/bumptech/glide/load/resource/bitmap/a;-><init>(Ljava/io/InputStream;Lc0/g;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 137
    .line 138
    .line 139
    :try_start_1
    invoke-interface {v1, v9, v4}, Ly/b;->c(Ljava/io/InputStream;Lc0/g;)I

    .line 140
    .line 141
    .line 142
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 143
    :try_start_2
    invoke-virtual {v9}, Lcom/bumptech/glide/load/resource/bitmap/a;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 144
    .line 145
    .line 146
    :catch_0
    invoke-virtual/range {p6 .. p6}, Lz/h;->e()Landroid/os/ParcelFileDescriptor;

    .line 147
    .line 148
    .line 149
    const/4 v8, -0x1

    .line 150
    if-eq v1, v8, :cond_2

    .line 151
    .line 152
    move v15, v1

    .line 153
    goto :goto_4

    .line 154
    :cond_2
    add-int/lit8 v9, v25, 0x1

    .line 155
    .line 156
    move/from16 v1, v26

    .line 157
    .line 158
    move-object/from16 v15, v27

    .line 159
    .line 160
    move-object/from16 v8, v29

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :catchall_0
    move-exception v0

    .line 164
    move-object/from16 v23, v9

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :catchall_1
    move-exception v0

    .line 168
    :goto_3
    if-eqz v23, :cond_3

    .line 169
    .line 170
    :try_start_3
    invoke-virtual/range {v23 .. v23}, Lcom/bumptech/glide/load/resource/bitmap/a;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 171
    .line 172
    .line 173
    :catch_1
    :cond_3
    invoke-virtual/range {p6 .. p6}, Lz/h;->e()Landroid/os/ParcelFileDescriptor;

    .line 174
    .line 175
    .line 176
    throw v0

    .line 177
    :cond_4
    move-object/from16 v29, v8

    .line 178
    .line 179
    const/4 v8, -0x1

    .line 180
    move v15, v8

    .line 181
    goto :goto_4

    .line 182
    :pswitch_0
    move-object/from16 v29, v8

    .line 183
    .line 184
    move-object/from16 v24, v9

    .line 185
    .line 186
    iget-object v1, v2, Lb0/g;->d:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v1, Ljava/util/List;

    .line 189
    .line 190
    iget-object v4, v2, Lb0/g;->b:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v4, Lz/h;

    .line 193
    .line 194
    iget-object v4, v4, Lz/h;->b:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v4, Lcom/bumptech/glide/load/resource/bitmap/a;

    .line 197
    .line 198
    invoke-virtual {v4}, Lcom/bumptech/glide/load/resource/bitmap/a;->reset()V

    .line 199
    .line 200
    .line 201
    iget-object v8, v2, Lb0/g;->c:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v8, Lc0/g;

    .line 204
    .line 205
    invoke-static {v1, v4, v8}, Lt6/a;->f(Ljava/util/List;Ljava/io/InputStream;Lc0/g;)I

    .line 206
    .line 207
    .line 208
    move-result v15

    .line 209
    :goto_4
    const/16 v1, 0x5a

    .line 210
    .line 211
    packed-switch v15, :pswitch_data_1

    .line 212
    .line 213
    .line 214
    move/from16 v8, v17

    .line 215
    .line 216
    goto :goto_5

    .line 217
    :pswitch_1
    const/16 v8, 0x10e

    .line 218
    .line 219
    goto :goto_5

    .line 220
    :pswitch_2
    move v8, v1

    .line 221
    goto :goto_5

    .line 222
    :pswitch_3
    const/16 v8, 0xb4

    .line 223
    .line 224
    :goto_5
    packed-switch v15, :pswitch_data_2

    .line 225
    .line 226
    .line 227
    move/from16 v9, v17

    .line 228
    .line 229
    goto :goto_6

    .line 230
    :pswitch_4
    move/from16 v9, v16

    .line 231
    .line 232
    :goto_6
    const/high16 v4, -0x80000000

    .line 233
    .line 234
    if-ne v5, v4, :cond_7

    .line 235
    .line 236
    if-eq v8, v1, :cond_6

    .line 237
    .line 238
    const/16 v1, 0x10e

    .line 239
    .line 240
    if-ne v8, v1, :cond_5

    .line 241
    .line 242
    goto :goto_7

    .line 243
    :cond_5
    move/from16 v30, v13

    .line 244
    .line 245
    goto :goto_8

    .line 246
    :cond_6
    const/16 v1, 0x10e

    .line 247
    .line 248
    :goto_7
    move/from16 v30, v12

    .line 249
    .line 250
    goto :goto_8

    .line 251
    :cond_7
    const/16 v1, 0x10e

    .line 252
    .line 253
    move/from16 v30, v5

    .line 254
    .line 255
    :goto_8
    if-ne v6, v4, :cond_a

    .line 256
    .line 257
    const/16 v4, 0x5a

    .line 258
    .line 259
    if-eq v8, v4, :cond_9

    .line 260
    .line 261
    if-ne v8, v1, :cond_8

    .line 262
    .line 263
    goto :goto_9

    .line 264
    :cond_8
    move v1, v12

    .line 265
    goto :goto_a

    .line 266
    :cond_9
    :goto_9
    move v1, v13

    .line 267
    goto :goto_a

    .line 268
    :cond_a
    move v1, v6

    .line 269
    :goto_a
    invoke-virtual {v2}, Lb0/g;->g()Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    move/from16 v25, v9

    .line 274
    .line 275
    const-string v9, "]"

    .line 276
    .line 277
    move/from16 v26, v15

    .line 278
    .line 279
    const/16 v28, 0x0

    .line 280
    .line 281
    if-lez v13, :cond_1f

    .line 282
    .line 283
    if-gtz v12, :cond_b

    .line 284
    .line 285
    move-object v0, v9

    .line 286
    move v9, v12

    .line 287
    move v8, v13

    .line 288
    move-object/from16 v32, v14

    .line 289
    .line 290
    move-object/from16 v6, v24

    .line 291
    .line 292
    move-object/from16 v5, v29

    .line 293
    .line 294
    move/from16 v15, v30

    .line 295
    .line 296
    const/4 v7, 0x3

    .line 297
    const/high16 v22, 0x3f800000    # 1.0f

    .line 298
    .line 299
    goto/16 :goto_18

    .line 300
    .line 301
    :cond_b
    const/16 v15, 0x5a

    .line 302
    .line 303
    const/high16 v22, 0x3f800000    # 1.0f

    .line 304
    .line 305
    if-eq v8, v15, :cond_d

    .line 306
    .line 307
    const/16 v15, 0x10e

    .line 308
    .line 309
    if-ne v8, v15, :cond_c

    .line 310
    .line 311
    goto :goto_c

    .line 312
    :cond_c
    move v5, v12

    .line 313
    move v6, v13

    .line 314
    :goto_b
    move-object/from16 p6, v9

    .line 315
    .line 316
    move/from16 v15, v30

    .line 317
    .line 318
    goto :goto_d

    .line 319
    :cond_d
    :goto_c
    move v6, v12

    .line 320
    move v5, v13

    .line 321
    goto :goto_b

    .line 322
    :goto_d
    invoke-virtual {v0, v6, v5, v15, v1}, Li0/k;->b(IIII)F

    .line 323
    .line 324
    .line 325
    move-result v9

    .line 326
    cmpg-float v30, v9, v28

    .line 327
    .line 328
    if-lez v30, :cond_1e

    .line 329
    .line 330
    move/from16 v30, v9

    .line 331
    .line 332
    invoke-virtual {v0, v6, v5, v15, v1}, Li0/k;->a(IIII)Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy$SampleSizeRounding;

    .line 333
    .line 334
    .line 335
    move-result-object v9

    .line 336
    if-eqz v9, :cond_1d

    .line 337
    .line 338
    move/from16 v31, v8

    .line 339
    .line 340
    int-to-float v8, v6

    .line 341
    move/from16 v32, v6

    .line 342
    .line 343
    mul-float v6, v30, v8

    .line 344
    .line 345
    move/from16 v34, v12

    .line 346
    .line 347
    move/from16 v33, v13

    .line 348
    .line 349
    float-to-double v12, v6

    .line 350
    const-wide/high16 v35, 0x3fe0000000000000L    # 0.5

    .line 351
    .line 352
    add-double v12, v12, v35

    .line 353
    .line 354
    double-to-int v6, v12

    .line 355
    int-to-float v12, v5

    .line 356
    mul-float v13, v30, v12

    .line 357
    .line 358
    move/from16 v37, v5

    .line 359
    .line 360
    move/from16 p6, v6

    .line 361
    .line 362
    float-to-double v5, v13

    .line 363
    add-double v5, v5, v35

    .line 364
    .line 365
    double-to-int v5, v5

    .line 366
    div-int v6, v32, p6

    .line 367
    .line 368
    div-int v5, v37, v5

    .line 369
    .line 370
    sget-object v13, Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy$SampleSizeRounding;->MEMORY:Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy$SampleSizeRounding;

    .line 371
    .line 372
    if-ne v9, v13, :cond_e

    .line 373
    .line 374
    invoke-static {v6, v5}, Ljava/lang/Math;->max(II)I

    .line 375
    .line 376
    .line 377
    move-result v5

    .line 378
    goto :goto_e

    .line 379
    :cond_e
    invoke-static {v6, v5}, Ljava/lang/Math;->min(II)I

    .line 380
    .line 381
    .line 382
    move-result v5

    .line 383
    :goto_e
    invoke-static {v5}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 384
    .line 385
    .line 386
    move-result v5

    .line 387
    move/from16 v6, v16

    .line 388
    .line 389
    invoke-static {v6, v5}, Ljava/lang/Math;->max(II)I

    .line 390
    .line 391
    .line 392
    move-result v5

    .line 393
    if-ne v9, v13, :cond_f

    .line 394
    .line 395
    int-to-float v6, v5

    .line 396
    div-float v9, v22, v30

    .line 397
    .line 398
    cmpg-float v6, v6, v9

    .line 399
    .line 400
    if-gez v6, :cond_f

    .line 401
    .line 402
    shl-int/lit8 v5, v5, 0x1

    .line 403
    .line 404
    :cond_f
    iput v5, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 405
    .line 406
    sget-object v6, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->JPEG:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 407
    .line 408
    if-ne v4, v6, :cond_10

    .line 409
    .line 410
    const/16 v4, 0x8

    .line 411
    .line 412
    invoke-static {v5, v4}, Ljava/lang/Math;->min(II)I

    .line 413
    .line 414
    .line 415
    move-result v4

    .line 416
    int-to-float v4, v4

    .line 417
    div-float/2addr v8, v4

    .line 418
    float-to-double v8, v8

    .line 419
    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    .line 420
    .line 421
    .line 422
    move-result-wide v8

    .line 423
    double-to-int v6, v8

    .line 424
    div-float/2addr v12, v4

    .line 425
    float-to-double v8, v12

    .line 426
    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    .line 427
    .line 428
    .line 429
    move-result-wide v8

    .line 430
    double-to-int v4, v8

    .line 431
    div-int/lit8 v8, v5, 0x8

    .line 432
    .line 433
    if-lez v8, :cond_17

    .line 434
    .line 435
    div-int/2addr v6, v8

    .line 436
    div-int/2addr v4, v8

    .line 437
    goto :goto_12

    .line 438
    :cond_10
    sget-object v6, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->PNG:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 439
    .line 440
    if-eq v4, v6, :cond_16

    .line 441
    .line 442
    sget-object v6, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->PNG_A:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 443
    .line 444
    if-ne v4, v6, :cond_11

    .line 445
    .line 446
    goto :goto_11

    .line 447
    :cond_11
    sget-object v6, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->WEBP:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 448
    .line 449
    if-eq v4, v6, :cond_15

    .line 450
    .line 451
    sget-object v6, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->WEBP_A:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 452
    .line 453
    if-ne v4, v6, :cond_12

    .line 454
    .line 455
    goto :goto_10

    .line 456
    :cond_12
    rem-int v6, v32, v5

    .line 457
    .line 458
    if-nez v6, :cond_13

    .line 459
    .line 460
    rem-int v4, v37, v5

    .line 461
    .line 462
    if-eqz v4, :cond_14

    .line 463
    .line 464
    :cond_13
    const/4 v6, 0x1

    .line 465
    goto :goto_f

    .line 466
    :cond_14
    div-int v6, v32, v5

    .line 467
    .line 468
    div-int v4, v37, v5

    .line 469
    .line 470
    goto :goto_12

    .line 471
    :goto_f
    iput-boolean v6, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 472
    .line 473
    invoke-static {v2, v3, v7, v14}, Li0/m;->c(Lb0/g;Landroid/graphics/BitmapFactory$Options;Li0/l;Lc0/b;)Landroid/graphics/Bitmap;

    .line 474
    .line 475
    .line 476
    move/from16 v4, v17

    .line 477
    .line 478
    iput-boolean v4, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 479
    .line 480
    iget v8, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 481
    .line 482
    iget v9, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 483
    .line 484
    filled-new-array {v8, v9}, [I

    .line 485
    .line 486
    .line 487
    move-result-object v8

    .line 488
    aget v9, v8, v4

    .line 489
    .line 490
    aget v4, v8, v6

    .line 491
    .line 492
    move v6, v9

    .line 493
    goto :goto_12

    .line 494
    :cond_15
    :goto_10
    int-to-float v4, v5

    .line 495
    div-float/2addr v8, v4

    .line 496
    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    .line 497
    .line 498
    .line 499
    move-result v6

    .line 500
    div-float/2addr v12, v4

    .line 501
    invoke-static {v12}, Ljava/lang/Math;->round(F)I

    .line 502
    .line 503
    .line 504
    move-result v4

    .line 505
    goto :goto_12

    .line 506
    :cond_16
    :goto_11
    int-to-float v4, v5

    .line 507
    div-float/2addr v8, v4

    .line 508
    float-to-double v8, v8

    .line 509
    invoke-static {v8, v9}, Ljava/lang/Math;->floor(D)D

    .line 510
    .line 511
    .line 512
    move-result-wide v8

    .line 513
    double-to-int v6, v8

    .line 514
    div-float/2addr v12, v4

    .line 515
    float-to-double v8, v12

    .line 516
    invoke-static {v8, v9}, Ljava/lang/Math;->floor(D)D

    .line 517
    .line 518
    .line 519
    move-result-wide v8

    .line 520
    double-to-int v4, v8

    .line 521
    :cond_17
    :goto_12
    invoke-virtual {v0, v6, v4, v15, v1}, Li0/k;->b(IIII)F

    .line 522
    .line 523
    .line 524
    move-result v0

    .line 525
    float-to-double v8, v0

    .line 526
    const-wide/high16 v12, 0x3ff0000000000000L    # 1.0

    .line 527
    .line 528
    cmpg-double v0, v8, v12

    .line 529
    .line 530
    if-gtz v0, :cond_18

    .line 531
    .line 532
    move-wide/from16 v37, v8

    .line 533
    .line 534
    goto :goto_13

    .line 535
    :cond_18
    div-double v37, v12, v8

    .line 536
    .line 537
    :goto_13
    const-wide v39, 0x41dfffffffc00000L    # 2.147483647E9

    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    mul-double v37, v37, v39

    .line 543
    .line 544
    move-wide/from16 v41, v12

    .line 545
    .line 546
    invoke-static/range {v37 .. v38}, Ljava/lang/Math;->round(D)J

    .line 547
    .line 548
    .line 549
    move-result-wide v12

    .line 550
    long-to-int v12, v12

    .line 551
    move-object/from16 v32, v14

    .line 552
    .line 553
    int-to-double v13, v12

    .line 554
    mul-double/2addr v13, v8

    .line 555
    add-double v13, v13, v35

    .line 556
    .line 557
    double-to-int v13, v13

    .line 558
    int-to-float v14, v13

    .line 559
    int-to-float v12, v12

    .line 560
    div-float/2addr v14, v12

    .line 561
    move-wide/from16 v37, v8

    .line 562
    .line 563
    float-to-double v7, v14

    .line 564
    div-double v8, v37, v7

    .line 565
    .line 566
    int-to-double v12, v13

    .line 567
    mul-double/2addr v8, v12

    .line 568
    add-double v8, v8, v35

    .line 569
    .line 570
    double-to-int v7, v8

    .line 571
    iput v7, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 572
    .line 573
    if-gtz v0, :cond_19

    .line 574
    .line 575
    move-wide/from16 v12, v37

    .line 576
    .line 577
    goto :goto_14

    .line 578
    :cond_19
    div-double v12, v41, v37

    .line 579
    .line 580
    :goto_14
    mul-double v12, v12, v39

    .line 581
    .line 582
    invoke-static {v12, v13}, Ljava/lang/Math;->round(D)J

    .line 583
    .line 584
    .line 585
    move-result-wide v7

    .line 586
    long-to-int v0, v7

    .line 587
    iput v0, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 588
    .line 589
    iget v7, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 590
    .line 591
    if-lez v7, :cond_1a

    .line 592
    .line 593
    if-lez v0, :cond_1a

    .line 594
    .line 595
    if-eq v7, v0, :cond_1a

    .line 596
    .line 597
    const/4 v7, 0x1

    .line 598
    iput-boolean v7, v3, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 599
    .line 600
    :goto_15
    const/4 v7, 0x2

    .line 601
    goto :goto_16

    .line 602
    :cond_1a
    const/4 v7, 0x0

    .line 603
    iput v7, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 604
    .line 605
    iput v7, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 606
    .line 607
    goto :goto_15

    .line 608
    :goto_16
    invoke-static {v11, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 609
    .line 610
    .line 611
    move-result v0

    .line 612
    if-eqz v0, :cond_1c

    .line 613
    .line 614
    const-string v0, "Calculate scaling, source: ["

    .line 615
    .line 616
    const-string v7, "], degreesToRotate: "

    .line 617
    .line 618
    move/from16 v8, v33

    .line 619
    .line 620
    move/from16 v9, v34

    .line 621
    .line 622
    invoke-static {v0, v10, v8, v7, v9}, Landroid/support/v4/media/f;->x(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/StringBuilder;

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    const-string v7, ", target: ["

    .line 627
    .line 628
    move/from16 v12, v31

    .line 629
    .line 630
    invoke-static {v0, v12, v7, v15, v10}, Landroidx/compose/material3/c;->w(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 631
    .line 632
    .line 633
    const-string v7, "], power of two scaled: ["

    .line 634
    .line 635
    invoke-static {v0, v1, v7, v6, v10}, Landroidx/compose/material3/c;->w(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 636
    .line 637
    .line 638
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 639
    .line 640
    .line 641
    const-string v4, "], exact scale factor: "

    .line 642
    .line 643
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 644
    .line 645
    .line 646
    move/from16 v4, v30

    .line 647
    .line 648
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 649
    .line 650
    .line 651
    const-string v4, ", power of 2 sample size: "

    .line 652
    .line 653
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 654
    .line 655
    .line 656
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 657
    .line 658
    .line 659
    const-string v4, ", adjusted scale factor: "

    .line 660
    .line 661
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 662
    .line 663
    .line 664
    move-wide/from16 v4, v37

    .line 665
    .line 666
    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 667
    .line 668
    .line 669
    move-object/from16 v5, v29

    .line 670
    .line 671
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 672
    .line 673
    .line 674
    iget v4, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 675
    .line 676
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 677
    .line 678
    .line 679
    move-object/from16 v6, v24

    .line 680
    .line 681
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 682
    .line 683
    .line 684
    iget v4, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 685
    .line 686
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 687
    .line 688
    .line 689
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    invoke-static {v11, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 694
    .line 695
    .line 696
    :cond_1b
    :goto_17
    move-object/from16 v4, p0

    .line 697
    .line 698
    goto/16 :goto_19

    .line 699
    .line 700
    :cond_1c
    move-object/from16 v6, v24

    .line 701
    .line 702
    move-object/from16 v5, v29

    .line 703
    .line 704
    move/from16 v8, v33

    .line 705
    .line 706
    move/from16 v9, v34

    .line 707
    .line 708
    goto :goto_17

    .line 709
    :cond_1d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 710
    .line 711
    const-string v1, "Cannot round with null rounding"

    .line 712
    .line 713
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 714
    .line 715
    .line 716
    throw v0

    .line 717
    :cond_1e
    move v4, v9

    .line 718
    move v9, v12

    .line 719
    move v8, v13

    .line 720
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 721
    .line 722
    new-instance v3, Ljava/lang/StringBuilder;

    .line 723
    .line 724
    const-string v5, "Cannot scale with factor: "

    .line 725
    .line 726
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 727
    .line 728
    .line 729
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 730
    .line 731
    .line 732
    const-string v4, " from: "

    .line 733
    .line 734
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 735
    .line 736
    .line 737
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 738
    .line 739
    .line 740
    const-string v0, ", source: ["

    .line 741
    .line 742
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 743
    .line 744
    .line 745
    const-string v0, "], target: ["

    .line 746
    .line 747
    invoke-static {v3, v8, v10, v9, v0}, Landroidx/compose/material3/c;->w(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 748
    .line 749
    .line 750
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 751
    .line 752
    .line 753
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 754
    .line 755
    .line 756
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 757
    .line 758
    .line 759
    move-object/from16 v0, p6

    .line 760
    .line 761
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 762
    .line 763
    .line 764
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 765
    .line 766
    .line 767
    move-result-object v0

    .line 768
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 769
    .line 770
    .line 771
    throw v2

    .line 772
    :cond_1f
    move-object v0, v9

    .line 773
    move v9, v12

    .line 774
    move v8, v13

    .line 775
    move-object/from16 v32, v14

    .line 776
    .line 777
    move-object/from16 v6, v24

    .line 778
    .line 779
    move-object/from16 v5, v29

    .line 780
    .line 781
    move/from16 v15, v30

    .line 782
    .line 783
    const/high16 v22, 0x3f800000    # 1.0f

    .line 784
    .line 785
    const/4 v7, 0x3

    .line 786
    :goto_18
    invoke-static {v11, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 787
    .line 788
    .line 789
    move-result v12

    .line 790
    if-eqz v12, :cond_1b

    .line 791
    .line 792
    new-instance v7, Ljava/lang/StringBuilder;

    .line 793
    .line 794
    const-string v12, "Unable to determine dimensions for: "

    .line 795
    .line 796
    invoke-direct {v7, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 797
    .line 798
    .line 799
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 800
    .line 801
    .line 802
    const-string v4, " with target ["

    .line 803
    .line 804
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 805
    .line 806
    .line 807
    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 808
    .line 809
    .line 810
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 811
    .line 812
    .line 813
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 814
    .line 815
    .line 816
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 817
    .line 818
    .line 819
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 820
    .line 821
    .line 822
    move-result-object v0

    .line 823
    invoke-static {v11, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 824
    .line 825
    .line 826
    goto/16 :goto_17

    .line 827
    .line 828
    :goto_19
    iget-object v7, v4, Li0/m;->e:Li0/s;

    .line 829
    .line 830
    const/16 v12, 0x1a

    .line 831
    .line 832
    if-eqz v21, :cond_23

    .line 833
    .line 834
    iget-boolean v0, v7, Li0/s;->a:Z

    .line 835
    .line 836
    if-eqz v0, :cond_24

    .line 837
    .line 838
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 839
    .line 840
    if-lt v0, v12, :cond_24

    .line 841
    .line 842
    if-eqz v25, :cond_20

    .line 843
    .line 844
    goto :goto_1d

    .line 845
    :cond_20
    iget v0, v7, Li0/s;->c:I

    .line 846
    .line 847
    if-lt v15, v0, :cond_24

    .line 848
    .line 849
    if-lt v1, v0, :cond_24

    .line 850
    .line 851
    const-string v0, "Excluding HARDWARE bitmap config because we\'re over the file descriptor limit, file descriptors "

    .line 852
    .line 853
    monitor-enter v7

    .line 854
    :try_start_4
    iget v13, v7, Li0/s;->d:I

    .line 855
    .line 856
    const/16 v16, 0x1

    .line 857
    .line 858
    add-int/lit8 v13, v13, 0x1

    .line 859
    .line 860
    iput v13, v7, Li0/s;->d:I

    .line 861
    .line 862
    const/16 v14, 0x32

    .line 863
    .line 864
    if-lt v13, v14, :cond_22

    .line 865
    .line 866
    const/4 v13, 0x0

    .line 867
    iput v13, v7, Li0/s;->d:I

    .line 868
    .line 869
    sget-object v13, Li0/s;->f:Ljava/io/File;

    .line 870
    .line 871
    invoke-virtual {v13}, Ljava/io/File;->list()[Ljava/lang/String;

    .line 872
    .line 873
    .line 874
    move-result-object v13

    .line 875
    array-length v13, v13

    .line 876
    iget v14, v7, Li0/s;->b:I

    .line 877
    .line 878
    if-ge v13, v14, :cond_21

    .line 879
    .line 880
    const/4 v14, 0x1

    .line 881
    goto :goto_1a

    .line 882
    :cond_21
    const/4 v14, 0x0

    .line 883
    :goto_1a
    iput-boolean v14, v7, Li0/s;->e:Z

    .line 884
    .line 885
    if-nez v14, :cond_22

    .line 886
    .line 887
    const-string v14, "Downsampler"

    .line 888
    .line 889
    const/4 v12, 0x5

    .line 890
    invoke-static {v14, v12}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 891
    .line 892
    .line 893
    move-result v12

    .line 894
    if-eqz v12, :cond_22

    .line 895
    .line 896
    const-string v12, "Downsampler"

    .line 897
    .line 898
    new-instance v14, Ljava/lang/StringBuilder;

    .line 899
    .line 900
    invoke-direct {v14, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 901
    .line 902
    .line 903
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 904
    .line 905
    .line 906
    const-string v0, ", limit "

    .line 907
    .line 908
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 909
    .line 910
    .line 911
    iget v0, v7, Li0/s;->b:I

    .line 912
    .line 913
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 914
    .line 915
    .line 916
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 917
    .line 918
    .line 919
    move-result-object v0

    .line 920
    invoke-static {v12, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 921
    .line 922
    .line 923
    goto :goto_1b

    .line 924
    :catchall_2
    move-exception v0

    .line 925
    goto :goto_1c

    .line 926
    :cond_22
    :goto_1b
    iget-boolean v0, v7, Li0/s;->e:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 927
    .line 928
    monitor-exit v7

    .line 929
    if-eqz v0, :cond_24

    .line 930
    .line 931
    const/4 v0, 0x1

    .line 932
    goto :goto_1e

    .line 933
    :goto_1c
    :try_start_5
    monitor-exit v7
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 934
    throw v0

    .line 935
    :cond_23
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 936
    .line 937
    .line 938
    :cond_24
    :goto_1d
    const/4 v0, 0x0

    .line 939
    :goto_1e
    if-eqz v0, :cond_25

    .line 940
    .line 941
    invoke-static {}, Landroidx/compose/ui/autofill/b;->c()Landroid/graphics/Bitmap$Config;

    .line 942
    .line 943
    .line 944
    move-result-object v7

    .line 945
    iput-object v7, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 946
    .line 947
    const/4 v7, 0x0

    .line 948
    iput-boolean v7, v3, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    .line 949
    .line 950
    goto :goto_1f

    .line 951
    :cond_25
    const/4 v7, 0x0

    .line 952
    :goto_1f
    if-eqz v0, :cond_27

    .line 953
    .line 954
    :cond_26
    const/4 v12, 0x1

    .line 955
    goto :goto_22

    .line 956
    :cond_27
    sget-object v0, Lcom/bumptech/glide/load/DecodeFormat;->PREFER_ARGB_8888:Lcom/bumptech/glide/load/DecodeFormat;

    .line 957
    .line 958
    move-object/from16 v12, p4

    .line 959
    .line 960
    if-eq v12, v0, :cond_2a

    .line 961
    .line 962
    :try_start_6
    invoke-virtual {v2}, Lb0/g;->g()Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 963
    .line 964
    .line 965
    move-result-object v0

    .line 966
    invoke-virtual {v0}, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->hasAlpha()Z

    .line 967
    .line 968
    .line 969
    move-result v0
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2

    .line 970
    goto :goto_20

    .line 971
    :catch_2
    move-exception v0

    .line 972
    const/4 v13, 0x3

    .line 973
    invoke-static {v11, v13}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 974
    .line 975
    .line 976
    move-result v13

    .line 977
    if-eqz v13, :cond_28

    .line 978
    .line 979
    new-instance v13, Ljava/lang/StringBuilder;

    .line 980
    .line 981
    const-string v14, "Cannot determine whether the image has alpha or not from header, format "

    .line 982
    .line 983
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 984
    .line 985
    .line 986
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 987
    .line 988
    .line 989
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 990
    .line 991
    .line 992
    move-result-object v12

    .line 993
    invoke-static {v11, v12, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 994
    .line 995
    .line 996
    :cond_28
    move v0, v7

    .line 997
    :goto_20
    if-eqz v0, :cond_29

    .line 998
    .line 999
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 1000
    .line 1001
    goto :goto_21

    .line 1002
    :cond_29
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 1003
    .line 1004
    :goto_21
    iput-object v0, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 1005
    .line 1006
    sget-object v12, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 1007
    .line 1008
    if-ne v0, v12, :cond_26

    .line 1009
    .line 1010
    const/4 v12, 0x1

    .line 1011
    iput-boolean v12, v3, Landroid/graphics/BitmapFactory$Options;->inDither:Z

    .line 1012
    .line 1013
    goto :goto_22

    .line 1014
    :cond_2a
    const/4 v12, 0x1

    .line 1015
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 1016
    .line 1017
    iput-object v0, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 1018
    .line 1019
    :goto_22
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1020
    .line 1021
    if-ltz v8, :cond_2b

    .line 1022
    .line 1023
    if-ltz v9, :cond_2b

    .line 1024
    .line 1025
    if-eqz p9, :cond_2b

    .line 1026
    .line 1027
    move v12, v15

    .line 1028
    goto/16 :goto_25

    .line 1029
    .line 1030
    :cond_2b
    iget v1, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 1031
    .line 1032
    if-lez v1, :cond_2c

    .line 1033
    .line 1034
    iget v13, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 1035
    .line 1036
    if-lez v13, :cond_2c

    .line 1037
    .line 1038
    if-eq v1, v13, :cond_2c

    .line 1039
    .line 1040
    move v13, v12

    .line 1041
    goto :goto_23

    .line 1042
    :cond_2c
    move v13, v7

    .line 1043
    :goto_23
    if-eqz v13, :cond_2d

    .line 1044
    .line 1045
    int-to-float v1, v1

    .line 1046
    iget v13, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 1047
    .line 1048
    int-to-float v13, v13

    .line 1049
    div-float/2addr v1, v13

    .line 1050
    goto :goto_24

    .line 1051
    :cond_2d
    move/from16 v1, v22

    .line 1052
    .line 1053
    :goto_24
    iget v13, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 1054
    .line 1055
    int-to-float v14, v8

    .line 1056
    int-to-float v15, v13

    .line 1057
    div-float/2addr v14, v15

    .line 1058
    move/from16 v17, v13

    .line 1059
    .line 1060
    float-to-double v12, v14

    .line 1061
    invoke-static {v12, v13}, Ljava/lang/Math;->ceil(D)D

    .line 1062
    .line 1063
    .line 1064
    move-result-wide v12

    .line 1065
    double-to-int v12, v12

    .line 1066
    int-to-float v13, v9

    .line 1067
    div-float/2addr v13, v15

    .line 1068
    float-to-double v13, v13

    .line 1069
    invoke-static {v13, v14}, Ljava/lang/Math;->ceil(D)D

    .line 1070
    .line 1071
    .line 1072
    move-result-wide v13

    .line 1073
    double-to-int v13, v13

    .line 1074
    int-to-float v12, v12

    .line 1075
    mul-float/2addr v12, v1

    .line 1076
    invoke-static {v12}, Ljava/lang/Math;->round(F)I

    .line 1077
    .line 1078
    .line 1079
    move-result v12

    .line 1080
    int-to-float v13, v13

    .line 1081
    mul-float/2addr v13, v1

    .line 1082
    invoke-static {v13}, Ljava/lang/Math;->round(F)I

    .line 1083
    .line 1084
    .line 1085
    move-result v13

    .line 1086
    const/4 v14, 0x2

    .line 1087
    invoke-static {v11, v14}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1088
    .line 1089
    .line 1090
    move-result v15

    .line 1091
    if-eqz v15, :cond_2e

    .line 1092
    .line 1093
    const-string v14, "Calculated target ["

    .line 1094
    .line 1095
    const-string v15, "] for source ["

    .line 1096
    .line 1097
    invoke-static {v14, v10, v12, v15, v13}, Landroid/support/v4/media/f;->x(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/StringBuilder;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v14

    .line 1101
    const-string v15, "], sampleSize: "

    .line 1102
    .line 1103
    invoke-static {v14, v8, v10, v9, v15}, Landroidx/compose/material3/c;->w(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 1104
    .line 1105
    .line 1106
    move/from16 v15, v17

    .line 1107
    .line 1108
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1109
    .line 1110
    .line 1111
    const-string v15, ", targetDensity: "

    .line 1112
    .line 1113
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1114
    .line 1115
    .line 1116
    iget v15, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 1117
    .line 1118
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1119
    .line 1120
    .line 1121
    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1122
    .line 1123
    .line 1124
    iget v15, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 1125
    .line 1126
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1127
    .line 1128
    .line 1129
    const-string v15, ", density multiplier: "

    .line 1130
    .line 1131
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1132
    .line 1133
    .line 1134
    invoke-virtual {v14, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 1135
    .line 1136
    .line 1137
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v1

    .line 1141
    invoke-static {v11, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1142
    .line 1143
    .line 1144
    :cond_2e
    move v1, v13

    .line 1145
    :goto_25
    if-lez v12, :cond_32

    .line 1146
    .line 1147
    if-lez v1, :cond_32

    .line 1148
    .line 1149
    const/16 v13, 0x1a

    .line 1150
    .line 1151
    if-lt v0, v13, :cond_30

    .line 1152
    .line 1153
    iget-object v13, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 1154
    .line 1155
    invoke-static {}, Landroidx/compose/ui/autofill/b;->c()Landroid/graphics/Bitmap$Config;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v14

    .line 1159
    if-ne v13, v14, :cond_2f

    .line 1160
    .line 1161
    goto :goto_27

    .line 1162
    :cond_2f
    invoke-static {v3}, Landroidx/core/util/a;->c(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap$Config;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v13

    .line 1166
    goto :goto_26

    .line 1167
    :cond_30
    move-object/from16 v13, v23

    .line 1168
    .line 1169
    :goto_26
    if-nez v13, :cond_31

    .line 1170
    .line 1171
    iget-object v13, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 1172
    .line 1173
    :cond_31
    move-object/from16 v14, v32

    .line 1174
    .line 1175
    invoke-interface {v14, v12, v1, v13}, Lc0/b;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v1

    .line 1179
    iput-object v1, v3, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    .line 1180
    .line 1181
    goto :goto_28

    .line 1182
    :cond_32
    :goto_27
    move-object/from16 v14, v32

    .line 1183
    .line 1184
    :goto_28
    const/16 v1, 0x1c

    .line 1185
    .line 1186
    if-lt v0, v1, :cond_36

    .line 1187
    .line 1188
    sget-object v0, Lcom/bumptech/glide/load/PreferredColorSpace;->DISPLAY_P3:Lcom/bumptech/glide/load/PreferredColorSpace;

    .line 1189
    .line 1190
    move-object/from16 v1, p5

    .line 1191
    .line 1192
    if-ne v1, v0, :cond_33

    .line 1193
    .line 1194
    invoke-static {v3}, Landroidx/core/util/a;->e(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/ColorSpace;

    .line 1195
    .line 1196
    .line 1197
    move-result-object v0

    .line 1198
    if-eqz v0, :cond_33

    .line 1199
    .line 1200
    invoke-static {v3}, Landroidx/core/util/a;->e(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/ColorSpace;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v0

    .line 1204
    invoke-static {v0}, Landroidx/core/util/a;->A(Landroid/graphics/ColorSpace;)Z

    .line 1205
    .line 1206
    .line 1207
    move-result v0

    .line 1208
    if-eqz v0, :cond_33

    .line 1209
    .line 1210
    const/4 v15, 0x1

    .line 1211
    goto :goto_29

    .line 1212
    :cond_33
    move v15, v7

    .line 1213
    :goto_29
    if-eqz v15, :cond_34

    .line 1214
    .line 1215
    invoke-static {}, Landroidx/compose/ui/autofill/b;->o()Landroid/graphics/ColorSpace$Named;

    .line 1216
    .line 1217
    .line 1218
    move-result-object v0

    .line 1219
    goto :goto_2a

    .line 1220
    :cond_34
    invoke-static {}, Landroidx/compose/ui/autofill/b;->q()Landroid/graphics/ColorSpace$Named;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v0

    .line 1224
    :goto_2a
    invoke-static {v0}, Landroidx/compose/ui/graphics/e;->g(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v0

    .line 1228
    invoke-static {v3, v0}, Landroidx/core/util/a;->q(Landroid/graphics/BitmapFactory$Options;Landroid/graphics/ColorSpace;)V

    .line 1229
    .line 1230
    .line 1231
    :cond_35
    :goto_2b
    move-object/from16 v7, p10

    .line 1232
    .line 1233
    goto :goto_2c

    .line 1234
    :cond_36
    const/16 v13, 0x1a

    .line 1235
    .line 1236
    if-lt v0, v13, :cond_35

    .line 1237
    .line 1238
    invoke-static {}, Landroidx/compose/ui/autofill/b;->q()Landroid/graphics/ColorSpace$Named;

    .line 1239
    .line 1240
    .line 1241
    invoke-static {}, Landroidx/core/app/c;->o()Landroid/graphics/ColorSpace;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v0

    .line 1245
    invoke-static {v3, v0}, Landroidx/core/util/a;->q(Landroid/graphics/BitmapFactory$Options;Landroid/graphics/ColorSpace;)V

    .line 1246
    .line 1247
    .line 1248
    goto :goto_2b

    .line 1249
    :goto_2c
    invoke-static {v2, v3, v7, v14}, Li0/m;->c(Lb0/g;Landroid/graphics/BitmapFactory$Options;Li0/l;Lc0/b;)Landroid/graphics/Bitmap;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v0

    .line 1253
    invoke-interface {v7, v0, v14}, Li0/l;->h(Landroid/graphics/Bitmap;Lc0/b;)V

    .line 1254
    .line 1255
    .line 1256
    const/4 v7, 0x2

    .line 1257
    invoke-static {v11, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1258
    .line 1259
    .line 1260
    move-result v1

    .line 1261
    if-eqz v1, :cond_37

    .line 1262
    .line 1263
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1264
    .line 1265
    const-string v2, "Decoded "

    .line 1266
    .line 1267
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1268
    .line 1269
    .line 1270
    invoke-static {v0}, Li0/m;->d(Landroid/graphics/Bitmap;)Ljava/lang/String;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v2

    .line 1274
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1275
    .line 1276
    .line 1277
    const-string v2, " from ["

    .line 1278
    .line 1279
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1280
    .line 1281
    .line 1282
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1283
    .line 1284
    .line 1285
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1286
    .line 1287
    .line 1288
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1289
    .line 1290
    .line 1291
    const-string v2, "] "

    .line 1292
    .line 1293
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1294
    .line 1295
    .line 1296
    move-object/from16 v2, v20

    .line 1297
    .line 1298
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1299
    .line 1300
    .line 1301
    const-string v2, " with inBitmap "

    .line 1302
    .line 1303
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1304
    .line 1305
    .line 1306
    iget-object v2, v3, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    .line 1307
    .line 1308
    invoke-static {v2}, Li0/m;->d(Landroid/graphics/Bitmap;)Ljava/lang/String;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v2

    .line 1312
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1313
    .line 1314
    .line 1315
    const-string v2, " for ["

    .line 1316
    .line 1317
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1318
    .line 1319
    .line 1320
    move/from16 v2, p7

    .line 1321
    .line 1322
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1323
    .line 1324
    .line 1325
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1326
    .line 1327
    .line 1328
    move/from16 v2, p8

    .line 1329
    .line 1330
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1331
    .line 1332
    .line 1333
    const-string v2, "], sample size: "

    .line 1334
    .line 1335
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1336
    .line 1337
    .line 1338
    iget v2, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 1339
    .line 1340
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1341
    .line 1342
    .line 1343
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1344
    .line 1345
    .line 1346
    iget v2, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    .line 1347
    .line 1348
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1349
    .line 1350
    .line 1351
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1352
    .line 1353
    .line 1354
    iget v2, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    .line 1355
    .line 1356
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1357
    .line 1358
    .line 1359
    const-string v2, ", thread: "

    .line 1360
    .line 1361
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1362
    .line 1363
    .line 1364
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 1365
    .line 1366
    .line 1367
    move-result-object v2

    .line 1368
    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 1369
    .line 1370
    .line 1371
    move-result-object v2

    .line 1372
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1373
    .line 1374
    .line 1375
    const-string v2, ", duration: "

    .line 1376
    .line 1377
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1378
    .line 1379
    .line 1380
    invoke-static/range {v18 .. v19}, Lv0/f;->a(J)D

    .line 1381
    .line 1382
    .line 1383
    move-result-wide v2

    .line 1384
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 1385
    .line 1386
    .line 1387
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1388
    .line 1389
    .line 1390
    move-result-object v1

    .line 1391
    invoke-static {v11, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 1392
    .line 1393
    .line 1394
    :cond_37
    if-eqz v0, :cond_3a

    .line 1395
    .line 1396
    iget-object v1, v4, Li0/m;->b:Landroid/util/DisplayMetrics;

    .line 1397
    .line 1398
    iget v1, v1, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 1399
    .line 1400
    invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->setDensity(I)V

    .line 1401
    .line 1402
    .line 1403
    packed-switch v26, :pswitch_data_3

    .line 1404
    .line 1405
    .line 1406
    move-object v3, v0

    .line 1407
    goto/16 :goto_2f

    .line 1408
    .line 1409
    :pswitch_5
    new-instance v1, Landroid/graphics/Matrix;

    .line 1410
    .line 1411
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 1412
    .line 1413
    .line 1414
    const/high16 v2, 0x43340000    # 180.0f

    .line 1415
    .line 1416
    const/high16 v3, 0x42b40000    # 90.0f

    .line 1417
    .line 1418
    const/high16 v5, -0x3d4c0000    # -90.0f

    .line 1419
    .line 1420
    const/high16 v6, -0x40800000    # -1.0f

    .line 1421
    .line 1422
    packed-switch v26, :pswitch_data_4

    .line 1423
    .line 1424
    .line 1425
    goto :goto_2d

    .line 1426
    :pswitch_6
    invoke-virtual {v1, v5}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 1427
    .line 1428
    .line 1429
    goto :goto_2d

    .line 1430
    :pswitch_7
    invoke-virtual {v1, v5}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 1431
    .line 1432
    .line 1433
    move/from16 v5, v22

    .line 1434
    .line 1435
    invoke-virtual {v1, v6, v5}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 1436
    .line 1437
    .line 1438
    goto :goto_2d

    .line 1439
    :pswitch_8
    invoke-virtual {v1, v3}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 1440
    .line 1441
    .line 1442
    goto :goto_2d

    .line 1443
    :pswitch_9
    move/from16 v5, v22

    .line 1444
    .line 1445
    invoke-virtual {v1, v3}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 1446
    .line 1447
    .line 1448
    invoke-virtual {v1, v6, v5}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 1449
    .line 1450
    .line 1451
    goto :goto_2d

    .line 1452
    :pswitch_a
    move/from16 v5, v22

    .line 1453
    .line 1454
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 1455
    .line 1456
    .line 1457
    invoke-virtual {v1, v6, v5}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 1458
    .line 1459
    .line 1460
    goto :goto_2d

    .line 1461
    :pswitch_b
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 1462
    .line 1463
    .line 1464
    goto :goto_2d

    .line 1465
    :pswitch_c
    move/from16 v5, v22

    .line 1466
    .line 1467
    invoke-virtual {v1, v6, v5}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 1468
    .line 1469
    .line 1470
    :goto_2d
    new-instance v2, Landroid/graphics/RectF;

    .line 1471
    .line 1472
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 1473
    .line 1474
    .line 1475
    move-result v3

    .line 1476
    int-to-float v3, v3

    .line 1477
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 1478
    .line 1479
    .line 1480
    move-result v5

    .line 1481
    int-to-float v5, v5

    .line 1482
    move/from16 v6, v28

    .line 1483
    .line 1484
    invoke-direct {v2, v6, v6, v3, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 1485
    .line 1486
    .line 1487
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 1488
    .line 1489
    .line 1490
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 1491
    .line 1492
    .line 1493
    move-result v3

    .line 1494
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 1495
    .line 1496
    .line 1497
    move-result v3

    .line 1498
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 1499
    .line 1500
    .line 1501
    move-result v5

    .line 1502
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 1503
    .line 1504
    .line 1505
    move-result v5

    .line 1506
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 1507
    .line 1508
    .line 1509
    move-result-object v6

    .line 1510
    if-eqz v6, :cond_38

    .line 1511
    .line 1512
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v6

    .line 1516
    goto :goto_2e

    .line 1517
    :cond_38
    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 1518
    .line 1519
    :goto_2e
    invoke-interface {v14, v3, v5, v6}, Lc0/b;->i(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 1520
    .line 1521
    .line 1522
    move-result-object v3

    .line 1523
    iget v5, v2, Landroid/graphics/RectF;->left:F

    .line 1524
    .line 1525
    neg-float v5, v5

    .line 1526
    iget v2, v2, Landroid/graphics/RectF;->top:F

    .line 1527
    .line 1528
    neg-float v2, v2

    .line 1529
    invoke-virtual {v1, v5, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 1530
    .line 1531
    .line 1532
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->hasAlpha()Z

    .line 1533
    .line 1534
    .line 1535
    move-result v2

    .line 1536
    invoke-virtual {v3, v2}, Landroid/graphics/Bitmap;->setHasAlpha(Z)V

    .line 1537
    .line 1538
    .line 1539
    invoke-static {v0, v3, v1}, Li0/u;->a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Matrix;)V

    .line 1540
    .line 1541
    .line 1542
    :goto_2f
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1543
    .line 1544
    .line 1545
    move-result v1

    .line 1546
    if-nez v1, :cond_39

    .line 1547
    .line 1548
    invoke-interface {v14, v0}, Lc0/b;->b(Landroid/graphics/Bitmap;)V

    .line 1549
    .line 1550
    .line 1551
    :cond_39
    move-object/from16 v23, v3

    .line 1552
    .line 1553
    :cond_3a
    return-object v23

    .line 1554
    nop

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x2
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x2
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x2
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch
.end method
