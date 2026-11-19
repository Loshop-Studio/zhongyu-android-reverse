.class public final Lcom/zykj/sketch/widgets/DrawTempView;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/sketch/core/listener/ImitateDraw;


# instance fields
.field public _$_findViewCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private bitmap:Landroid/graphics/Bitmap;

.field private graphMatrix:Landroid/graphics/Matrix;

.field private limitDrawArea:Landroid/graphics/RectF;

.field private paint:Landroid/graphics/Paint;

.field private paintTableArea:Landroid/graphics/RectF;

.field private path:Landroid/graphics/Path;

.field private rendRectF:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/zykj/sketch/widgets/DrawTempView;->_$_findViewCache:Ljava/util/Map;

    .line 12
    .line 13
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 14
    .line 15
    .line 16
    new-instance p1, Landroid/graphics/RectF;

    .line 17
    .line 18
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lcom/zykj/sketch/widgets/DrawTempView;->rendRectF:Landroid/graphics/RectF;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/zykj/sketch/widgets/DrawTempView;->_$_findViewCache:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/zykj/sketch/widgets/DrawTempView;->_$_findViewCache:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-nez v1, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1

    :cond_0
    const/4 p1, 0x0

    return-object p1

    :cond_1
    return-object v1
.end method

.method public clearGraph()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/zykj/sketch/widgets/DrawTempView;->path:Landroid/graphics/Path;

    .line 3
    .line 4
    iput-object v0, p0, Lcom/zykj/sketch/widgets/DrawTempView;->paint:Landroid/graphics/Paint;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/zykj/sketch/widgets/DrawTempView;->bitmap:Landroid/graphics/Bitmap;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iput-object v0, p0, Lcom/zykj/sketch/widgets/DrawTempView;->bitmap:Landroid/graphics/Bitmap;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V
    .locals 1

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "paint"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/zykj/sketch/widgets/DrawTempView;->path:Landroid/graphics/Path;

    .line 12
    .line 13
    iput-object p2, p0, Lcom/zykj/sketch/widgets/DrawTempView;->paint:Landroid/graphics/Paint;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public drawThumbnail(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/widgets/DrawTempView;->bitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public graphMatrix(Landroid/graphics/Matrix;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/widgets/DrawTempView;->graphMatrix:Landroid/graphics/Matrix;

    .line 2
    .line 3
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DrawAllocation"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, Landroid/graphics/PaintFlagsDrawFilter;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x3

    .line 8
    invoke-direct {v0, v1, v2}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 12
    .line 13
    .line 14
    :goto_0
    if-eqz p1, :cond_6

    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/sketch/widgets/DrawTempView;->paintTableArea:Landroid/graphics/RectF;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-ne v0, v1, :cond_2

    .line 28
    .line 29
    :cond_1
    new-instance v0, Landroid/graphics/RectF;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    int-to-float v2, v2

    .line 36
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    int-to-float v3, v3

    .line 41
    const/4 v4, 0x0

    .line 42
    invoke-direct {v0, v4, v4, v2, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, Lcom/zykj/sketch/widgets/DrawTempView;->paintTableArea:Landroid/graphics/RectF;

    .line 46
    .line 47
    :cond_2
    iget-object v0, p0, Lcom/zykj/sketch/widgets/DrawTempView;->graphMatrix:Landroid/graphics/Matrix;

    .line 48
    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    iget-object v2, p0, Lcom/zykj/sketch/widgets/DrawTempView;->limitDrawArea:Landroid/graphics/RectF;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    new-instance v3, Landroid/graphics/RectF;

    .line 56
    .line 57
    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object v3, p0, Lcom/zykj/sketch/widgets/DrawTempView;->rendRectF:Landroid/graphics/RectF;

    .line 61
    .line 62
    invoke-virtual {v0, v3, v2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    iget-object v0, p0, Lcom/zykj/sketch/widgets/DrawTempView;->rendRectF:Landroid/graphics/RectF;

    .line 69
    .line 70
    iget-object v2, p0, Lcom/zykj/sketch/widgets/DrawTempView;->paintTableArea:Landroid/graphics/RectF;

    .line 71
    .line 72
    invoke-virtual {v0, v2}, Landroid/graphics/RectF;->intersect(Landroid/graphics/RectF;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_3

    .line 77
    .line 78
    iget-object v0, p0, Lcom/zykj/sketch/widgets/DrawTempView;->rendRectF:Landroid/graphics/RectF;

    .line 79
    .line 80
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    .line 81
    .line 82
    .line 83
    :cond_3
    iget-object v0, p0, Lcom/zykj/sketch/widgets/DrawTempView;->path:Landroid/graphics/Path;

    .line 84
    .line 85
    if-eqz v0, :cond_4

    .line 86
    .line 87
    iget-object v2, p0, Lcom/zykj/sketch/widgets/DrawTempView;->paint:Landroid/graphics/Paint;

    .line 88
    .line 89
    if-eqz v2, :cond_4

    .line 90
    .line 91
    invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 92
    .line 93
    .line 94
    :cond_4
    iget-object v0, p0, Lcom/zykj/sketch/widgets/DrawTempView;->bitmap:Landroid/graphics/Bitmap;

    .line 95
    .line 96
    if-eqz v0, :cond_6

    .line 97
    .line 98
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-nez v2, :cond_6

    .line 103
    .line 104
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    int-to-float v2, v2

    .line 109
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    int-to-float v3, v3

    .line 114
    div-float/2addr v2, v3

    .line 115
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    int-to-float v3, v3

    .line 120
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    int-to-float v4, v4

    .line 125
    div-float/2addr v3, v4

    .line 126
    cmpl-float v4, v2, v3

    .line 127
    .line 128
    if-lez v4, :cond_5

    .line 129
    .line 130
    move v2, v3

    .line 131
    :cond_5
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    int-to-float v3, v3

    .line 136
    mul-float/2addr v3, v2

    .line 137
    float-to-int v3, v3

    .line 138
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    int-to-float v4, v4

    .line 143
    mul-float/2addr v4, v2

    .line 144
    float-to-int v2, v4

    .line 145
    invoke-static {v0, v3, v2, v1}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    sub-int/2addr v1, v2

    .line 158
    int-to-float v1, v1

    .line 159
    const/high16 v2, 0x40000000    # 2.0f

    .line 160
    .line 161
    div-float/2addr v1, v2

    .line 162
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 167
    .line 168
    .line 169
    move-result v4

    .line 170
    sub-int/2addr v3, v4

    .line 171
    int-to-float v3, v3

    .line 172
    div-float/2addr v3, v2

    .line 173
    const/4 v2, 0x0

    .line 174
    invoke-virtual {p1, v0, v1, v3, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 175
    .line 176
    .line 177
    goto :goto_1

    .line 178
    :catchall_0
    move-exception v0

    .line 179
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 180
    .line 181
    .line 182
    :cond_6
    :goto_1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 183
    .line 184
    .line 185
    return-void
.end method

.method public setLimitDrawArea(Landroid/graphics/RectF;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/widgets/DrawTempView;->limitDrawArea:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-void
.end method
