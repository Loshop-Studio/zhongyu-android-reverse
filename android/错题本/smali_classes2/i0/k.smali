.class public final Li0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Li0/k;

.field public static final c:Li0/k;

.field public static final d:Li0/k;

.field public static final e:Li0/k;

.field public static final f:Li0/k;

.field public static final g:Ly/e;

.field public static final h:Z


# instance fields
.field public final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Li0/k;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Li0/k;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Li0/k;->b:Li0/k;

    .line 8
    .line 9
    new-instance v0, Li0/k;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, v1}, Li0/k;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Li0/k;->c:Li0/k;

    .line 16
    .line 17
    new-instance v0, Li0/k;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, v1}, Li0/k;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Li0/k;->d:Li0/k;

    .line 24
    .line 25
    new-instance v1, Li0/k;

    .line 26
    .line 27
    const/4 v2, 0x3

    .line 28
    invoke-direct {v1, v2}, Li0/k;-><init>(I)V

    .line 29
    .line 30
    .line 31
    sput-object v1, Li0/k;->e:Li0/k;

    .line 32
    .line 33
    sput-object v0, Li0/k;->f:Li0/k;

    .line 34
    .line 35
    const-string v1, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy"

    .line 36
    .line 37
    invoke-static {v0, v1}, Ly/e;->a(Ljava/lang/Object;Ljava/lang/String;)Ly/e;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Li0/k;->g:Ly/e;

    .line 42
    .line 43
    const/4 v0, 0x1

    .line 44
    sput-boolean v0, Li0/k;->h:Z

    .line 45
    .line 46
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Li0/k;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(IIII)Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy$SampleSizeRounding;
    .locals 2

    .line 1
    iget v0, p0, Li0/k;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p1, Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy$SampleSizeRounding;->QUALITY:Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy$SampleSizeRounding;

    .line 7
    .line 8
    return-object p1

    .line 9
    :pswitch_0
    sget-boolean p1, Li0/k;->h:Z

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    sget-object p1, Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy$SampleSizeRounding;->QUALITY:Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy$SampleSizeRounding;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-object p1, Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy$SampleSizeRounding;->MEMORY:Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy$SampleSizeRounding;

    .line 17
    .line 18
    :goto_0
    return-object p1

    .line 19
    :pswitch_1
    sget-object p1, Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy$SampleSizeRounding;->QUALITY:Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy$SampleSizeRounding;

    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_2
    invoke-virtual {p0, p1, p2, p3, p4}, Li0/k;->b(IIII)F

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/high16 v1, 0x3f800000    # 1.0f

    .line 27
    .line 28
    cmpl-float v0, v0, v1

    .line 29
    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    sget-object p1, Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy$SampleSizeRounding;->QUALITY:Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy$SampleSizeRounding;

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    sget-object v0, Li0/k;->b:Li0/k;

    .line 36
    .line 37
    invoke-virtual {v0, p1, p2, p3, p4}, Li0/k;->a(IIII)Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy$SampleSizeRounding;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    :goto_1
    return-object p1

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(IIII)F
    .locals 1

    .line 1
    iget v0, p0, Li0/k;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/high16 p1, 0x3f800000    # 1.0f

    .line 7
    .line 8
    return p1

    .line 9
    :pswitch_0
    sget-boolean v0, Li0/k;->h:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    int-to-float p3, p3

    .line 14
    int-to-float p1, p1

    .line 15
    div-float/2addr p3, p1

    .line 16
    int-to-float p1, p4

    .line 17
    int-to-float p2, p2

    .line 18
    div-float/2addr p1, p2

    .line 19
    invoke-static {p3, p1}, Ljava/lang/Math;->min(FF)F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    div-int/2addr p2, p4

    .line 25
    div-int/2addr p1, p3

    .line 26
    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    const/high16 p2, 0x3f800000    # 1.0f

    .line 31
    .line 32
    if-nez p1, :cond_1

    .line 33
    .line 34
    move p1, p2

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-static {p1}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    int-to-float p1, p1

    .line 41
    div-float p1, p2, p1

    .line 42
    .line 43
    :goto_0
    return p1

    .line 44
    :pswitch_1
    int-to-float p3, p3

    .line 45
    int-to-float p1, p1

    .line 46
    div-float/2addr p3, p1

    .line 47
    int-to-float p1, p4

    .line 48
    int-to-float p2, p2

    .line 49
    div-float/2addr p1, p2

    .line 50
    invoke-static {p3, p1}, Ljava/lang/Math;->max(FF)F

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    return p1

    .line 55
    :pswitch_2
    sget-object v0, Li0/k;->b:Li0/k;

    .line 56
    .line 57
    invoke-virtual {v0, p1, p2, p3, p4}, Li0/k;->b(IIII)F

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    const/high16 p2, 0x3f800000    # 1.0f

    .line 62
    .line 63
    invoke-static {p2, p1}, Ljava/lang/Math;->min(FF)F

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    return p1

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
