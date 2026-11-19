.class public final Lna/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lna/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lna/e;

    .line 2
    .line 3
    invoke-direct {v0}, Lna/e;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lna/e;->a:Lna/e;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;Landroid/graphics/Matrix;)V
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    const-string v3, "canvas"

    .line 8
    .line 9
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v3, "largeBitmap"

    .line 13
    .line 14
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v3, "matrix"

    .line 18
    .line 19
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/graphics/Canvas;->getMaximumBitmapWidth()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    invoke-virtual {v0}, Landroid/graphics/Canvas;->getMaximumBitmapHeight()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    new-instance v7, Landroid/graphics/Rect;

    .line 39
    .line 40
    invoke-direct {v7}, Landroid/graphics/Rect;-><init>()V

    .line 41
    .line 42
    .line 43
    new-instance v8, Landroid/graphics/RectF;

    .line 44
    .line 45
    invoke-direct {v8}, Landroid/graphics/RectF;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/graphics/Canvas;->save()I

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v2}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 52
    .line 53
    .line 54
    add-int v2, v5, v3

    .line 55
    .line 56
    add-int/lit8 v2, v2, -0x1

    .line 57
    .line 58
    div-int/2addr v2, v3

    .line 59
    add-int v9, v6, v4

    .line 60
    .line 61
    add-int/lit8 v9, v9, -0x1

    .line 62
    .line 63
    div-int/2addr v9, v4

    .line 64
    const/4 v11, 0x0

    .line 65
    :goto_0
    if-ge v11, v2, :cond_1

    .line 66
    .line 67
    const/4 v12, 0x0

    .line 68
    :goto_1
    if-ge v12, v9, :cond_0

    .line 69
    .line 70
    mul-int v13, v11, v3

    .line 71
    .line 72
    mul-int v14, v12, v4

    .line 73
    .line 74
    add-int v15, v13, v3

    .line 75
    .line 76
    invoke-static {v15, v5}, Ljava/lang/Math;->min(II)I

    .line 77
    .line 78
    .line 79
    move-result v15

    .line 80
    add-int v10, v14, v4

    .line 81
    .line 82
    invoke-static {v10, v6}, Ljava/lang/Math;->min(II)I

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    invoke-virtual {v7, v13, v14, v15, v10}, Landroid/graphics/Rect;->set(IIII)V

    .line 87
    .line 88
    .line 89
    iget v10, v7, Landroid/graphics/Rect;->left:I

    .line 90
    .line 91
    int-to-float v10, v10

    .line 92
    iget v13, v7, Landroid/graphics/Rect;->top:I

    .line 93
    .line 94
    int-to-float v13, v13

    .line 95
    iget v14, v7, Landroid/graphics/Rect;->right:I

    .line 96
    .line 97
    int-to-float v14, v14

    .line 98
    iget v15, v7, Landroid/graphics/Rect;->bottom:I

    .line 99
    .line 100
    int-to-float v15, v15

    .line 101
    invoke-virtual {v8, v10, v13, v14, v15}, Landroid/graphics/RectF;->set(FFFF)V

    .line 102
    .line 103
    .line 104
    const/4 v10, 0x0

    .line 105
    invoke-virtual {v0, v1, v7, v8, v10}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 106
    .line 107
    .line 108
    add-int/lit8 v12, v12, 0x1

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_0
    add-int/lit8 v11, v11, 0x1

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_1
    invoke-virtual {v0}, Landroid/graphics/Canvas;->restore()V

    .line 115
    .line 116
    .line 117
    return-void
.end method
