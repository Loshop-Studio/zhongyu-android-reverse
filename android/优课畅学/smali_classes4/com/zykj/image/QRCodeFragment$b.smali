.class public final Lcom/zykj/image/QRCodeFragment$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/ImageAnalysis$Analyzer;
.implements Lcom/google/zxing/ResultPointCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/image/QRCodeFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Lcom/zykj/image/ViewfinderView;

.field public final d:Lx7/l;

.field public e:F

.field public f:F

.field public g:F

.field public h:F

.field public final i:Lcom/google/zxing/MultiFormatReader;


# direct methods
.method public constructor <init>(IILcom/zykj/image/ViewfinderView;Lx7/l;)V
    .locals 1

    .line 1
    const-string v0, "viewFinder"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "handlerResult"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput p1, p0, Lcom/zykj/image/QRCodeFragment$b;->a:I

    .line 15
    .line 16
    iput p2, p0, Lcom/zykj/image/QRCodeFragment$b;->b:I

    .line 17
    .line 18
    iput-object p3, p0, Lcom/zykj/image/QRCodeFragment$b;->c:Lcom/zykj/image/ViewfinderView;

    .line 19
    .line 20
    iput-object p4, p0, Lcom/zykj/image/QRCodeFragment$b;->d:Lx7/l;

    .line 21
    .line 22
    const/high16 p1, 0x3f800000    # 1.0f

    .line 23
    .line 24
    iput p1, p0, Lcom/zykj/image/QRCodeFragment$b;->e:F

    .line 25
    .line 26
    iput p1, p0, Lcom/zykj/image/QRCodeFragment$b;->f:F

    .line 27
    .line 28
    new-instance p1, Lcom/google/zxing/MultiFormatReader;

    .line 29
    .line 30
    invoke-direct {p1}, Lcom/google/zxing/MultiFormatReader;-><init>()V

    .line 31
    .line 32
    .line 33
    new-instance p2, Ljava/util/Vector;

    .line 34
    .line 35
    invoke-direct {p2}, Ljava/util/Vector;-><init>()V

    .line 36
    .line 37
    .line 38
    new-instance p3, Ljava/util/Vector;

    .line 39
    .line 40
    invoke-direct {p3}, Ljava/util/Vector;-><init>()V

    .line 41
    .line 42
    .line 43
    sget-object p4, Lcom/google/zxing/BarcodeFormat;->UPC_A:Lcom/google/zxing/BarcodeFormat;

    .line 44
    .line 45
    invoke-virtual {p3, p4}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    sget-object p4, Lcom/google/zxing/BarcodeFormat;->UPC_E:Lcom/google/zxing/BarcodeFormat;

    .line 49
    .line 50
    invoke-virtual {p3, p4}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    sget-object p4, Lcom/google/zxing/BarcodeFormat;->EAN_13:Lcom/google/zxing/BarcodeFormat;

    .line 54
    .line 55
    invoke-virtual {p3, p4}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    sget-object p4, Lcom/google/zxing/BarcodeFormat;->EAN_8:Lcom/google/zxing/BarcodeFormat;

    .line 59
    .line 60
    invoke-virtual {p3, p4}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    sget-object p4, Lcom/google/zxing/BarcodeFormat;->CODE_39:Lcom/google/zxing/BarcodeFormat;

    .line 64
    .line 65
    invoke-virtual {p3, p4}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    sget-object p4, Lcom/google/zxing/BarcodeFormat;->CODE_93:Lcom/google/zxing/BarcodeFormat;

    .line 69
    .line 70
    invoke-virtual {p3, p4}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    sget-object p4, Lcom/google/zxing/BarcodeFormat;->CODE_128:Lcom/google/zxing/BarcodeFormat;

    .line 74
    .line 75
    invoke-virtual {p3, p4}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    sget-object p4, Lcom/google/zxing/BarcodeFormat;->ITF:Lcom/google/zxing/BarcodeFormat;

    .line 79
    .line 80
    invoke-virtual {p3, p4}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    sget-object p4, Lcom/google/zxing/BarcodeFormat;->QR_CODE:Lcom/google/zxing/BarcodeFormat;

    .line 84
    .line 85
    invoke-virtual {p3, p4}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    sget-object p4, Lcom/google/zxing/BarcodeFormat;->DATA_MATRIX:Lcom/google/zxing/BarcodeFormat;

    .line 89
    .line 90
    invoke-virtual {p3, p4}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2, p3}, Ljava/util/Vector;->addAll(Ljava/util/Collection;)Z

    .line 94
    .line 95
    .line 96
    new-instance p3, Ljava/util/Hashtable;

    .line 97
    .line 98
    const/4 p4, 0x3

    .line 99
    invoke-direct {p3, p4}, Ljava/util/Hashtable;-><init>(I)V

    .line 100
    .line 101
    .line 102
    sget-object p4, Lcom/google/zxing/DecodeHintType;->POSSIBLE_FORMATS:Lcom/google/zxing/DecodeHintType;

    .line 103
    .line 104
    invoke-interface {p3, p4, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    sget-object p2, Lcom/google/zxing/DecodeHintType;->NEED_RESULT_POINT_CALLBACK:Lcom/google/zxing/DecodeHintType;

    .line 108
    .line 109
    invoke-interface {p3, p2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, p3}, Lcom/google/zxing/MultiFormatReader;->setHints(Ljava/util/Map;)V

    .line 113
    .line 114
    .line 115
    sget-object p2, Lh7/p;->a:Lh7/p;

    .line 116
    .line 117
    iput-object p1, p0, Lcom/zykj/image/QRCodeFragment$b;->i:Lcom/google/zxing/MultiFormatReader;

    .line 118
    .line 119
    return-void
.end method


# virtual methods
.method public final a()Lx7/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/image/QRCodeFragment$b;->d:Lx7/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public analyze(Landroidx/camera/core/ImageProxy;)V
    .locals 12

    .line 1
    const-string v0, "imageProxy"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/16 v0, 0x23

    .line 7
    .line 8
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getFormat()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->close()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getWidth()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    int-to-float v0, v0

    .line 23
    const/high16 v1, 0x3f800000    # 1.0f

    .line 24
    .line 25
    mul-float/2addr v0, v1

    .line 26
    iget v2, p0, Lcom/zykj/image/QRCodeFragment$b;->a:I

    .line 27
    .line 28
    int-to-float v2, v2

    .line 29
    div-float/2addr v0, v2

    .line 30
    iput v0, p0, Lcom/zykj/image/QRCodeFragment$b;->e:F

    .line 31
    .line 32
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getHeight()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    int-to-float v0, v0

    .line 37
    mul-float/2addr v0, v1

    .line 38
    iget v1, p0, Lcom/zykj/image/QRCodeFragment$b;->b:I

    .line 39
    .line 40
    int-to-float v1, v1

    .line 41
    div-float/2addr v0, v1

    .line 42
    iput v0, p0, Lcom/zykj/image/QRCodeFragment$b;->f:F

    .line 43
    .line 44
    iget-object v0, p0, Lcom/zykj/image/QRCodeFragment$b;->c:Lcom/zykj/image/ViewfinderView;

    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    int-to-float v0, v0

    .line 51
    iget v1, p0, Lcom/zykj/image/QRCodeFragment$b;->e:F

    .line 52
    .line 53
    mul-float/2addr v0, v1

    .line 54
    iget-object v1, p0, Lcom/zykj/image/QRCodeFragment$b;->c:Lcom/zykj/image/ViewfinderView;

    .line 55
    .line 56
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    int-to-float v1, v1

    .line 61
    iget v2, p0, Lcom/zykj/image/QRCodeFragment$b;->f:F

    .line 62
    .line 63
    mul-float/2addr v1, v2

    .line 64
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getWidth()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    int-to-float v2, v2

    .line 69
    sub-float/2addr v2, v0

    .line 70
    const/4 v3, 0x2

    .line 71
    int-to-float v3, v3

    .line 72
    div-float/2addr v2, v3

    .line 73
    iput v2, p0, Lcom/zykj/image/QRCodeFragment$b;->g:F

    .line 74
    .line 75
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getHeight()I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    int-to-float v2, v2

    .line 80
    sub-float/2addr v2, v1

    .line 81
    div-float/2addr v2, v3

    .line 82
    iput v2, p0, Lcom/zykj/image/QRCodeFragment$b;->h:F

    .line 83
    .line 84
    :try_start_0
    new-instance v3, Lcom/google/zxing/PlanarYUVLuminanceSource;

    .line 85
    .line 86
    sget-object v2, Lcom/zykj/image/QRCodeFragment;->Companion:Lcom/zykj/image/QRCodeFragment$a;

    .line 87
    .line 88
    invoke-virtual {v2, p1}, Lcom/zykj/image/QRCodeFragment$a;->a(Landroidx/camera/core/ImageProxy;)[B

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getWidth()I

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->getHeight()I

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    iget v2, p0, Lcom/zykj/image/QRCodeFragment$b;->g:F

    .line 101
    .line 102
    float-to-int v7, v2

    .line 103
    iget v2, p0, Lcom/zykj/image/QRCodeFragment$b;->h:F

    .line 104
    .line 105
    float-to-int v8, v2

    .line 106
    float-to-int v9, v0

    .line 107
    float-to-int v10, v1

    .line 108
    const/4 v11, 0x0

    .line 109
    invoke-direct/range {v3 .. v11}, Lcom/google/zxing/PlanarYUVLuminanceSource;-><init>([BIIIIIIZ)V

    .line 110
    .line 111
    .line 112
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->close()V

    .line 113
    .line 114
    .line 115
    new-instance v0, Lcom/google/zxing/BinaryBitmap;

    .line 116
    .line 117
    new-instance v1, Lcom/google/zxing/common/HybridBinarizer;

    .line 118
    .line 119
    invoke-direct {v1, v3}, Lcom/google/zxing/common/HybridBinarizer;-><init>(Lcom/google/zxing/LuminanceSource;)V

    .line 120
    .line 121
    .line 122
    invoke-direct {v0, v1}, Lcom/google/zxing/BinaryBitmap;-><init>(Lcom/google/zxing/Binarizer;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 123
    .line 124
    .line 125
    :try_start_1
    iget-object v1, p0, Lcom/zykj/image/QRCodeFragment$b;->i:Lcom/google/zxing/MultiFormatReader;

    .line 126
    .line 127
    invoke-virtual {v1, v0}, Lcom/google/zxing/MultiFormatReader;->decodeWithState(Lcom/google/zxing/BinaryBitmap;)Lcom/google/zxing/Result;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v0}, Lcom/google/zxing/Result;->getText()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0}, Lcom/google/zxing/Result;->getTimestamp()J

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0}, Lcom/zykj/image/QRCodeFragment$b;->a()Lx7/l;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-virtual {v0}, Lcom/google/zxing/Result;->getText()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    const-string v2, "decode.text"

    .line 146
    .line 147
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-interface {v1, v0}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Lcom/google/zxing/NotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 151
    .line 152
    .line 153
    goto :goto_0

    .line 154
    :catchall_0
    move-exception v0

    .line 155
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->close()V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 159
    .line 160
    .line 161
    :catch_0
    :goto_0
    return-void
.end method

.method public final b()Lcom/zykj/image/ViewfinderView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/image/QRCodeFragment$b;->c:Lcom/zykj/image/ViewfinderView;

    .line 2
    .line 3
    return-object v0
.end method

.method public foundPossibleResultPoint(Lcom/google/zxing/ResultPoint;)V
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/image/QRCodeFragment$b;->b()Lcom/zykj/image/ViewfinderView;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, Lcom/google/zxing/ResultPoint;

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/google/zxing/ResultPoint;->getX()F

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    iget v3, p0, Lcom/zykj/image/QRCodeFragment$b;->e:F

    .line 15
    .line 16
    div-float/2addr v2, v3

    .line 17
    invoke-virtual {p1}, Lcom/google/zxing/ResultPoint;->getY()F

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iget v3, p0, Lcom/zykj/image/QRCodeFragment$b;->f:F

    .line 22
    .line 23
    div-float/2addr p1, v3

    .line 24
    invoke-direct {v1, v2, p1}, Lcom/google/zxing/ResultPoint;-><init>(FF)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lcom/zykj/image/ViewfinderView;->a(Lcom/google/zxing/ResultPoint;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method
