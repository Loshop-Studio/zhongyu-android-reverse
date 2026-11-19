.class public Lcom/zykj/paint/record/model/PictureSnapShot;
.super Lcom/zykj/paint/record/model/GraphSnapShot;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "PictureSnapShot"


# instance fields
.field private height:I

.field public localDisplayList:Lcom/zykj/paint/Actions$EzyActionList$Builder;

.field private mapSnapShot:Lcom/zykj/paint/record/model/MapSnapShot;

.field public midSketchMatrix:Landroid/graphics/Matrix;

.field private width:I


# direct methods
.method public constructor <init>(Lcom/zykj/paint/SketchSyncView;ILandroid/graphics/Bitmap;Lcom/zykj/paint/record/model/MapSnapShot;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/paint/record/model/GraphSnapShot;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/zykj/paint/Actions$EzyActionList;->newBuilder()Lcom/zykj/paint/Actions$EzyActionList$Builder;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lcom/zykj/paint/record/model/PictureSnapShot;->localDisplayList:Lcom/zykj/paint/Actions$EzyActionList$Builder;

    .line 9
    .line 10
    new-instance v0, Landroid/graphics/Matrix;

    .line 11
    .line 12
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/zykj/paint/record/model/PictureSnapShot;->midSketchMatrix:Landroid/graphics/Matrix;

    .line 16
    .line 17
    iput-object p3, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchBitmap:Landroid/graphics/Bitmap;

    .line 18
    .line 19
    const/16 p3, 0x780

    .line 20
    .line 21
    iput p3, p0, Lcom/zykj/paint/record/model/PictureSnapShot;->width:I

    .line 22
    .line 23
    const/16 p3, 0x4b0

    .line 24
    .line 25
    iput p3, p0, Lcom/zykj/paint/record/model/PictureSnapShot;->height:I

    .line 26
    .line 27
    iput-object p1, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchView:Lcom/zykj/paint/SketchSyncView;

    .line 28
    .line 29
    iput p2, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->graphId:I

    .line 30
    .line 31
    iput-object p4, p0, Lcom/zykj/paint/record/model/PictureSnapShot;->mapSnapShot:Lcom/zykj/paint/record/model/MapSnapShot;

    .line 32
    .line 33
    invoke-direct {p0}, Lcom/zykj/paint/record/model/PictureSnapShot;->init()V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method private init()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchMatrix:Landroid/graphics/Matrix;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/paint/record/model/PictureSnapShot;->midSketchMatrix:Landroid/graphics/Matrix;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->midMatrix:Landroid/graphics/Matrix;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 13
    .line 14
    .line 15
    iget v0, p0, Lcom/zykj/paint/record/model/PictureSnapShot;->width:I

    .line 16
    .line 17
    iget v1, p0, Lcom/zykj/paint/record/model/PictureSnapShot;->height:I

    .line 18
    .line 19
    invoke-direct {p0, v0, v1}, Lcom/zykj/paint/record/model/PictureSnapShot;->updateSketchSnapshot(II)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static randomColor(I)I
    .locals 4

    .line 1
    new-instance v0, Ljava/util/Random;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-static {v1, p0}, Ljava/lang/Math;->max(II)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    const/16 v1, 0xff

    .line 12
    .line 13
    invoke-static {p0, v1}, Ljava/lang/Math;->min(II)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    const/16 v1, 0x100

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-static {p0, v2, v3, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0
.end method

.method private updateSketchSnapshot(II)V
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->mCanvas:Landroid/graphics/Canvas;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_4444:Landroid/graphics/Bitmap$Config;

    .line 7
    .line 8
    invoke-static {p1, p2, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->bitmap:Landroid/graphics/Bitmap;

    .line 13
    .line 14
    new-instance p1, Landroid/graphics/Canvas;

    .line 15
    .line 16
    iget-object p2, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->bitmap:Landroid/graphics/Bitmap;

    .line 17
    .line 18
    invoke-direct {p1, p2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->mCanvas:Landroid/graphics/Canvas;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sget-object p1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 25
    .line 26
    invoke-virtual {v0, v1, p1}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    new-instance p1, Landroid/graphics/Matrix;

    .line 30
    .line 31
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 32
    .line 33
    .line 34
    iget-object p2, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchMatrix:Landroid/graphics/Matrix;

    .line 35
    .line 36
    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 37
    .line 38
    .line 39
    const/16 p2, 0x9

    .line 40
    .line 41
    new-array p2, p2, [F

    .line 42
    .line 43
    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->getValues([F)V

    .line 44
    .line 45
    .line 46
    new-instance v0, Landroid/graphics/Matrix;

    .line 47
    .line 48
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->setValues([F)V

    .line 52
    .line 53
    .line 54
    iget-object p2, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->mCanvas:Landroid/graphics/Canvas;

    .line 55
    .line 56
    iget-object v2, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchBitmap:Landroid/graphics/Bitmap;

    .line 57
    .line 58
    const/4 v3, 0x0

    .line 59
    invoke-virtual {p2, v2, v0, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 60
    .line 61
    .line 62
    iget-boolean p2, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->isSelect:Z

    .line 63
    .line 64
    if-eqz p2, :cond_1

    .line 65
    .line 66
    iget-object p2, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchBitmap:Landroid/graphics/Bitmap;

    .line 67
    .line 68
    invoke-virtual {p0, p2, p1}, Lcom/zykj/paint/record/model/PictureSnapShot;->getBitmapPoints(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;)[F

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    aget v3, p2, v1

    .line 73
    .line 74
    const/4 v0, 0x1

    .line 75
    aget v4, p2, v0

    .line 76
    .line 77
    const/4 v0, 0x2

    .line 78
    aget v5, p2, v0

    .line 79
    .line 80
    const/4 v0, 0x3

    .line 81
    aget v6, p2, v0

    .line 82
    .line 83
    const/4 v0, 0x4

    .line 84
    aget v0, p2, v0

    .line 85
    .line 86
    const/4 v1, 0x5

    .line 87
    aget v11, p2, v1

    .line 88
    .line 89
    const/4 v1, 0x6

    .line 90
    aget v8, p2, v1

    .line 91
    .line 92
    const/4 v1, 0x7

    .line 93
    aget v9, p2, v1

    .line 94
    .line 95
    iget-object v2, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->mCanvas:Landroid/graphics/Canvas;

    .line 96
    .line 97
    iget-object v7, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->snapShotPaint:Landroid/graphics/Paint;

    .line 98
    .line 99
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 100
    .line 101
    .line 102
    iget-object p2, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->mCanvas:Landroid/graphics/Canvas;

    .line 103
    .line 104
    iget-object v10, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->snapShotPaint:Landroid/graphics/Paint;

    .line 105
    .line 106
    move v7, v6

    .line 107
    move v6, v5

    .line 108
    move-object v5, p2

    .line 109
    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 110
    .line 111
    .line 112
    iget-object v7, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->mCanvas:Landroid/graphics/Canvas;

    .line 113
    .line 114
    iget-object v12, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->snapShotPaint:Landroid/graphics/Paint;

    .line 115
    .line 116
    move v10, v0

    .line 117
    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 118
    .line 119
    .line 120
    iget-object v2, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->mCanvas:Landroid/graphics/Canvas;

    .line 121
    .line 122
    iget-object v7, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->snapShotPaint:Landroid/graphics/Paint;

    .line 123
    .line 124
    move v5, v3

    .line 125
    move v6, v4

    .line 126
    move v3, v10

    .line 127
    move v4, v11

    .line 128
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 129
    .line 130
    .line 131
    :cond_1
    iget-object p2, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->mCanvas:Landroid/graphics/Canvas;

    .line 132
    .line 133
    iget-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->snapShotPaint:Landroid/graphics/Paint;

    .line 134
    .line 135
    invoke-direct {p0, p2, v0, p1}, Lcom/zykj/paint/record/model/PictureSnapShot;->updateSketchWithLocalProtobufData(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Matrix;)V

    .line 136
    .line 137
    .line 138
    return-void
.end method

.method private updateSketchWithLocalProtobufData(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Matrix;)V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/record/model/PictureSnapShot;->localDisplayList:Lcom/zykj/paint/Actions$EzyActionList$Builder;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyActionList$Builder;->getActionList()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_6

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lcom/zykj/paint/Actions$EzyAction;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyAction;->getActionType()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    sget v3, Lcom/zykj/paint/exchange/ActionType;->ImageDel:I

    .line 28
    .line 29
    if-eq v2, v3, :cond_5

    .line 30
    .line 31
    sget v3, Lcom/zykj/paint/exchange/ActionType;->LayerDel:I

    .line 32
    .line 33
    if-eq v2, v3, :cond_5

    .line 34
    .line 35
    sget v3, Lcom/zykj/paint/exchange/ActionType;->PolylineDel:I

    .line 36
    .line 37
    if-eq v2, v3, :cond_5

    .line 38
    .line 39
    sget v3, Lcom/zykj/paint/exchange/ActionType;->ImageHide:I

    .line 40
    .line 41
    if-eq v2, v3, :cond_5

    .line 42
    .line 43
    sget v3, Lcom/zykj/paint/exchange/ActionType;->LayerHide:I

    .line 44
    .line 45
    if-eq v2, v3, :cond_5

    .line 46
    .line 47
    sget v3, Lcom/zykj/paint/exchange/ActionType;->PolylineHide:I

    .line 48
    .line 49
    if-ne v2, v3, :cond_1

    .line 50
    .line 51
    goto/16 :goto_4

    .line 52
    .line 53
    :cond_1
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyAction;->getData()Lcom/google/protobuf/Any;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v2}, Lcom/google/protobuf/Any;->getTypeUrl()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-nez v3, :cond_0

    .line 66
    .line 67
    const-string v3, "/"

    .line 68
    .line 69
    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    const/4 v3, 0x1

    .line 74
    aget-object v2, v2, v3

    .line 75
    .line 76
    const-string v3, "NewPolylineData"

    .line 77
    .line 78
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-eqz v2, :cond_0

    .line 83
    .line 84
    const/4 v2, 0x0

    .line 85
    :try_start_0
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyAction;->getData()Lcom/google/protobuf/Any;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    const-class v3, Lcom/zykj/paint/Actions$NewPolylineData;

    .line 90
    .line 91
    invoke-virtual {v0, v3}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    move-object v3, v0

    .line 96
    check-cast v3, Lcom/zykj/paint/Actions$NewPolylineData;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1

    .line 97
    .line 98
    :try_start_1
    invoke-virtual {v3}, Lcom/zykj/paint/Actions$NewPolylineData;->getColor()Lcom/zykj/paint/Actions$EzyColor;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyColor;->getAlpha()I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyColor;->getRed()I

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyColor;->getGreen()I

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$EzyColor;->getBlue()I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    invoke-virtual {p2, v2, v4, v5, v0}, Landroid/graphics/Paint;->setARGB(IIII)V
    :try_end_1
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_1 .. :try_end_1} :catch_0

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :catch_0
    move-exception v0

    .line 123
    move-object v2, v3

    .line 124
    goto :goto_1

    .line 125
    :catch_1
    move-exception v0

    .line 126
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 127
    .line 128
    .line 129
    move-object v3, v2

    .line 130
    :goto_2
    invoke-virtual {v3}, Lcom/zykj/paint/Actions$NewPolylineData;->getPointsCount()I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-gtz v0, :cond_2

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_2
    new-instance v2, Landroid/graphics/Path;

    .line 138
    .line 139
    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 143
    .line 144
    .line 145
    const/4 v4, 0x0

    .line 146
    :goto_3
    add-int/lit8 v5, v0, -0x1

    .line 147
    .line 148
    if-ge v4, v5, :cond_4

    .line 149
    .line 150
    invoke-virtual {v3, v4}, Lcom/zykj/paint/Actions$NewPolylineData;->getPoints(I)Lcom/zykj/paint/Actions$EzyPoint;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    add-int/lit8 v6, v4, 0x1

    .line 155
    .line 156
    invoke-virtual {v3, v6}, Lcom/zykj/paint/Actions$NewPolylineData;->getPoints(I)Lcom/zykj/paint/Actions$EzyPoint;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    invoke-virtual {v5}, Lcom/zykj/paint/Actions$EzyPoint;->getX()D

    .line 161
    .line 162
    .line 163
    move-result-wide v8

    .line 164
    double-to-float v8, v8

    .line 165
    invoke-virtual {v5}, Lcom/zykj/paint/Actions$EzyPoint;->getY()D

    .line 166
    .line 167
    .line 168
    move-result-wide v9

    .line 169
    double-to-float v5, v9

    .line 170
    invoke-virtual {v7}, Lcom/zykj/paint/Actions$EzyPoint;->getX()D

    .line 171
    .line 172
    .line 173
    move-result-wide v9

    .line 174
    double-to-float v9, v9

    .line 175
    invoke-virtual {v7}, Lcom/zykj/paint/Actions$EzyPoint;->getY()D

    .line 176
    .line 177
    .line 178
    move-result-wide v10

    .line 179
    double-to-float v7, v10

    .line 180
    if-nez v4, :cond_3

    .line 181
    .line 182
    invoke-virtual {v2, v8, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 183
    .line 184
    .line 185
    :cond_3
    add-float/2addr v9, v8

    .line 186
    const/high16 v4, 0x40000000    # 2.0f

    .line 187
    .line 188
    div-float/2addr v9, v4

    .line 189
    add-float/2addr v7, v5

    .line 190
    div-float/2addr v7, v4

    .line 191
    invoke-virtual {v2, v8, v5, v9, v7}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 192
    .line 193
    .line 194
    move v4, v6

    .line 195
    goto :goto_3

    .line 196
    :cond_4
    invoke-virtual {v2, p3}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p1, v2, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 200
    .line 201
    .line 202
    goto/16 :goto_0

    .line 203
    .line 204
    :cond_5
    :goto_4
    const-string v0, "PictureSnapShot"

    .line 205
    .line 206
    const-string v2, "\u8bfb\u5230\u5220\u9664\u7684\u7ebf\u6bb5--"

    .line 207
    .line 208
    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 209
    .line 210
    .line 211
    goto/16 :goto_0

    .line 212
    .line 213
    :cond_6
    return-void
.end method


# virtual methods
.method public addStickyEzyPath(Lcom/zykj/paint/Actions$NewPolylineData$Builder;)V
    .locals 11

    .line 1
    invoke-static {}, Lcom/zykj/paint/Actions$NewPolylineData;->newBuilder()Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->graphId:I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->setStickyGraphId(I)Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->getColor()Lcom/zykj/paint/Actions$EzyColor;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->setColor(Lcom/zykj/paint/Actions$EzyColor;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    .line 15
    .line 16
    .line 17
    new-instance v1, Landroid/graphics/Matrix;

    .line 18
    .line 19
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance v2, Landroid/graphics/Matrix;

    .line 23
    .line 24
    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 25
    .line 26
    .line 27
    iget-object v3, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchMatrix:Landroid/graphics/Matrix;

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 30
    .line 31
    .line 32
    iget-object v3, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->midMatrix:Landroid/graphics/Matrix;

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v1}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->getPointsCount()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    const/4 v3, 0x0

    .line 45
    move v4, v3

    .line 46
    :goto_0
    if-ge v4, v2, :cond_0

    .line 47
    .line 48
    invoke-virtual {p1, v4}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->getPoints(I)Lcom/zykj/paint/Actions$EzyPoint;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    const/4 v6, 0x2

    .line 53
    new-array v7, v6, [F

    .line 54
    .line 55
    invoke-virtual {v5}, Lcom/zykj/paint/Actions$EzyPoint;->getX()D

    .line 56
    .line 57
    .line 58
    move-result-wide v8

    .line 59
    double-to-float v8, v8

    .line 60
    invoke-virtual {v5}, Lcom/zykj/paint/Actions$EzyPoint;->getY()D

    .line 61
    .line 62
    .line 63
    move-result-wide v9

    .line 64
    double-to-float v5, v9

    .line 65
    new-array v6, v6, [F

    .line 66
    .line 67
    aput v8, v6, v3

    .line 68
    .line 69
    const/4 v8, 0x1

    .line 70
    aput v5, v6, v8

    .line 71
    .line 72
    invoke-virtual {v1, v7, v6}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 73
    .line 74
    .line 75
    invoke-static {}, Lcom/zykj/paint/Actions$EzyPoint;->newBuilder()Lcom/zykj/paint/Actions$EzyPoint$Builder;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    aget v6, v7, v3

    .line 80
    .line 81
    float-to-double v9, v6

    .line 82
    invoke-virtual {v5, v9, v10}, Lcom/zykj/paint/Actions$EzyPoint$Builder;->setX(D)Lcom/zykj/paint/Actions$EzyPoint$Builder;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    aget v7, v7, v8

    .line 87
    .line 88
    float-to-double v7, v7

    .line 89
    invoke-virtual {v6, v7, v8}, Lcom/zykj/paint/Actions$EzyPoint$Builder;->setY(D)Lcom/zykj/paint/Actions$EzyPoint$Builder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v5}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->addPoints(Lcom/zykj/paint/Actions$EzyPoint$Builder;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    .line 93
    .line 94
    .line 95
    add-int/lit8 v4, v4, 0x1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_0
    invoke-static {}, Lcom/zykj/paint/Actions$EzyAction;->newBuilder()Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    iget-object v1, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchView:Lcom/zykj/paint/SketchSyncView;

    .line 103
    .line 104
    iget-wide v2, v1, Lcom/zykj/paint/SketchSyncView;->mCurrentStartAt:J

    .line 105
    .line 106
    iget-wide v4, v1, Lcom/zykj/paint/SketchSyncView;->mStartTime:J

    .line 107
    .line 108
    sub-long/2addr v2, v4

    .line 109
    long-to-int v1, v2

    .line 110
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 111
    .line 112
    .line 113
    move-result-wide v2

    .line 114
    iget-object v4, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchView:Lcom/zykj/paint/SketchSyncView;

    .line 115
    .line 116
    iget-wide v4, v4, Lcom/zykj/paint/SketchSyncView;->mCurrentStartAt:J

    .line 117
    .line 118
    sub-long/2addr v2, v4

    .line 119
    long-to-int v2, v2

    .line 120
    invoke-virtual {p1, v1}, Lcom/zykj/paint/Actions$EzyAction$Builder;->setStartAt(I)Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1, v2}, Lcom/zykj/paint/Actions$EzyAction$Builder;->setDuration(I)Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->build()Lcom/zykj/paint/Actions$NewPolylineData;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-static {v1}, Lcom/google/protobuf/Any;->pack(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Any;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {p1, v1}, Lcom/zykj/paint/Actions$EzyAction$Builder;->setData(Lcom/google/protobuf/Any;)Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 135
    .line 136
    .line 137
    iget-object v1, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchView:Lcom/zykj/paint/SketchSyncView;

    .line 138
    .line 139
    iget v1, v1, Lcom/zykj/paint/SketchSyncView;->graphId:I

    .line 140
    .line 141
    invoke-virtual {p1, v1}, Lcom/zykj/paint/Actions$EzyAction$Builder;->setGraphId(I)Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 142
    .line 143
    .line 144
    sget v1, Lcom/zykj/paint/exchange/ActionType;->PolylineNew:I

    .line 145
    .line 146
    invoke-virtual {p1, v1}, Lcom/zykj/paint/Actions$EzyAction$Builder;->setActionType(I)Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 147
    .line 148
    .line 149
    iget-object v1, p0, Lcom/zykj/paint/record/model/PictureSnapShot;->localDisplayList:Lcom/zykj/paint/Actions$EzyActionList$Builder;

    .line 150
    .line 151
    invoke-virtual {v1, p1}, Lcom/zykj/paint/Actions$EzyActionList$Builder;->addAction(Lcom/zykj/paint/Actions$EzyAction$Builder;)Lcom/zykj/paint/Actions$EzyActionList$Builder;

    .line 152
    .line 153
    .line 154
    iget-object p1, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchView:Lcom/zykj/paint/SketchSyncView;

    .line 155
    .line 156
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->build()Lcom/zykj/paint/Actions$NewPolylineData;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-static {v0}, Lcom/google/protobuf/Any;->pack(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Any;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    sget v1, Lcom/zykj/paint/exchange/ActionType;->PolylineNew:I

    .line 165
    .line 166
    invoke-virtual {p1, v0, v1}, Lcom/zykj/paint/SketchSyncView;->addSketchAction(Lcom/google/protobuf/Any;I)V

    .line 167
    .line 168
    .line 169
    return-void
.end method

.method public delByLines(Landroid/view/MotionEvent;)V
    .locals 5

    .line 1
    const-string v0, "PictureSnapShot"

    .line 2
    .line 3
    const-string v1, "\u56fe\u7247\u5220\u9664\u7ebf\u6bb5"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    new-instance v0, Landroid/graphics/Matrix;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v1, Landroid/graphics/Matrix;

    .line 14
    .line 15
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v2, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchMatrix:Landroid/graphics/Matrix;

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 21
    .line 22
    .line 23
    iget-object v2, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->midMatrix:Landroid/graphics/Matrix;

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x2

    .line 32
    new-array v2, v1, [F

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    new-array v1, v1, [F

    .line 43
    .line 44
    const/4 v4, 0x0

    .line 45
    aput v3, v1, v4

    .line 46
    .line 47
    const/4 v3, 0x1

    .line 48
    aput p1, v1, v3

    .line 49
    .line 50
    invoke-virtual {v0, v2, v1}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchView:Lcom/zykj/paint/SketchSyncView;

    .line 54
    .line 55
    iget-object v0, p0, Lcom/zykj/paint/record/model/PictureSnapShot;->localDisplayList:Lcom/zykj/paint/Actions$EzyActionList$Builder;

    .line 56
    .line 57
    aget v1, v2, v4

    .line 58
    .line 59
    aget v2, v2, v3

    .line 60
    .line 61
    invoke-virtual {p1, v0, v1, v2}, Lcom/zykj/paint/SketchSyncView;->delByLine(Lcom/zykj/paint/Actions$EzyActionList$Builder;FF)V

    .line 62
    .line 63
    .line 64
    const/4 p1, 0x0

    .line 65
    invoke-virtual {p0, p1}, Lcom/zykj/paint/record/model/PictureSnapShot;->updateMatrix(Landroid/graphics/Matrix;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public getBitmapPoints(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;)[F
    .locals 7

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    new-array v1, v0, [F

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    int-to-float v2, v2

    .line 10
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    int-to-float v3, v3

    .line 15
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    int-to-float v4, v4

    .line 20
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    int-to-float p1, p1

    .line 25
    new-array v0, v0, [F

    .line 26
    .line 27
    const/4 v5, 0x0

    .line 28
    const/4 v6, 0x0

    .line 29
    aput v6, v0, v5

    .line 30
    .line 31
    const/4 v5, 0x1

    .line 32
    aput v6, v0, v5

    .line 33
    .line 34
    const/4 v5, 0x2

    .line 35
    aput v2, v0, v5

    .line 36
    .line 37
    const/4 v2, 0x3

    .line 38
    aput v6, v0, v2

    .line 39
    .line 40
    const/4 v2, 0x4

    .line 41
    aput v6, v0, v2

    .line 42
    .line 43
    const/4 v2, 0x5

    .line 44
    aput v3, v0, v2

    .line 45
    .line 46
    const/4 v2, 0x6

    .line 47
    aput v4, v0, v2

    .line 48
    .line 49
    const/4 v2, 0x7

    .line 50
    aput p1, v0, v2

    .line 51
    .line 52
    invoke-virtual {p2, v1, v0}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 53
    .line 54
    .line 55
    return-object v1
.end method

.method public setSelect(Z)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/zykj/paint/record/model/GraphSnapShot;->setSelect(Z)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string v1, "[\u8981\u6c42\u91cd\u7ed8]=====>>>>>>>>>>>>select="

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v0, "PictureSnapShot"

    .line 22
    .line 23
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    invoke-virtual {p0, p1}, Lcom/zykj/paint/record/model/PictureSnapShot;->updateMatrix(Landroid/graphics/Matrix;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public updateMatrix(Landroid/graphics/Matrix;)V
    .locals 2

    .line 1
    const-string v0, "PictureSnapShot"

    .line 2
    .line 3
    const-string v1, "\u6536\u5230\u91cd\u7ed8\u8bf7\u6c42\uff0c\u8fdb\u884c\u5feb\u7167\u91cd\u7ed8"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    new-instance v0, Landroid/graphics/Matrix;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/zykj/paint/record/model/PictureSnapShot;->midSketchMatrix:Landroid/graphics/Matrix;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 21
    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object p1, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchMatrix:Landroid/graphics/Matrix;

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 31
    .line 32
    .line 33
    iget p1, p0, Lcom/zykj/paint/record/model/PictureSnapShot;->width:I

    .line 34
    .line 35
    iget v0, p0, Lcom/zykj/paint/record/model/PictureSnapShot;->height:I

    .line 36
    .line 37
    invoke-direct {p0, p1, v0}, Lcom/zykj/paint/record/model/PictureSnapShot;->updateSketchSnapshot(II)V

    .line 38
    .line 39
    .line 40
    new-instance p1, Landroid/graphics/Matrix;

    .line 41
    .line 42
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 46
    .line 47
    iget-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->midMatrix:Landroid/graphics/Matrix;

    .line 48
    .line 49
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public updateSketchPicture(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchBitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-virtual {p0, p1}, Lcom/zykj/paint/record/model/PictureSnapShot;->updateMatrix(Landroid/graphics/Matrix;)V

    .line 5
    .line 6
    .line 7
    const-string p1, "PictureSnapShot"

    .line 8
    .line 9
    const-string v0, "updateSketchPicture-->"

    .line 10
    .line 11
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    return-void
.end method
