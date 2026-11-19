.class public Lcom/zykj/camera/view/AnswerSheetView;
.super Lg5/f;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/camera/view/AnswerSheetView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lg5/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    invoke-virtual {p0}, Lcom/zykj/camera/view/AnswerSheetView;->r()V

    return-void
.end method


# virtual methods
.method public a([BII)Lh5/a;
    .locals 22

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    const-string v3, "\u62cd\u7167\u5b8c\u6210"

    .line 8
    .line 9
    const-string v4, "processData"

    .line 10
    .line 11
    invoke-static {v4, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    array-length v3, v0

    .line 15
    const/4 v5, 0x0

    .line 16
    invoke-static {v0, v5, v3}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    new-instance v11, Landroid/graphics/Matrix;

    .line 21
    .line 22
    invoke-direct {v11}, Landroid/graphics/Matrix;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v0, Landroid/hardware/Camera$CameraInfo;

    .line 26
    .line 27
    invoke-direct {v0}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-static {v5, v0}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    .line 31
    .line 32
    .line 33
    iget v0, v0, Landroid/hardware/Camera$CameraInfo;->orientation:I

    .line 34
    .line 35
    int-to-float v0, v0

    .line 36
    invoke-virtual {v11, v0}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 37
    .line 38
    .line 39
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    .line 40
    .line 41
    .line 42
    move-result v9

    .line 43
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    .line 44
    .line 45
    .line 46
    move-result v10

    .line 47
    const/4 v12, 0x1

    .line 48
    const/4 v7, 0x0

    .line 49
    const/4 v8, 0x0

    .line 50
    invoke-static/range {v6 .. v12}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->recycle()V

    .line 55
    .line 56
    .line 57
    const-string v3, "\u65cb\u8f6c90\u00b0"

    .line 58
    .line 59
    invoke-static {v4, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    new-instance v3, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    const-string v4, "decodeByteArray times-->"

    .line 68
    .line 69
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 73
    .line 74
    .line 75
    move-result-wide v6

    .line 76
    sub-long/2addr v6, v1

    .line 77
    invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    const-string v4, "AnswerSheetView"

    .line 85
    .line 86
    invoke-static {v4, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 87
    .line 88
    .line 89
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 90
    .line 91
    .line 92
    move-result-wide v6

    .line 93
    const/16 v3, 0x64

    .line 94
    .line 95
    new-array v3, v3, [Landroid/graphics/Point;

    .line 96
    .line 97
    const/4 v8, 0x1

    .line 98
    new-array v8, v8, [Landroid/graphics/Bitmap;

    .line 99
    .line 100
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/camera/view/AnswerSheetView;->getLimitRectF()[Landroid/graphics/RectF;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    invoke-static {v0, v9, v3, v8}, Lcom/zykj/camera/AnswerSheetNative;->nativePreScanImageInfo(Landroid/graphics/Bitmap;[Landroid/graphics/RectF;[Landroid/graphics/Point;[Landroid/graphics/Bitmap;)I

    .line 105
    .line 106
    .line 107
    move-result v15

    .line 108
    new-instance v9, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 111
    .line 112
    .line 113
    const-string v10, "\u8bc6\u522b\u56db\u4e2a\u5b9a\u4f4d\u70b9 times-->"

    .line 114
    .line 115
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 119
    .line 120
    .line 121
    move-result-wide v10

    .line 122
    sub-long/2addr v10, v6

    .line 123
    invoke-virtual {v9, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    invoke-static {v4, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 131
    .line 132
    .line 133
    new-instance v6, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 136
    .line 137
    .line 138
    const-string v7, ">>>>count="

    .line 139
    .line 140
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v6, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    invoke-static {v4, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 151
    .line 152
    .line 153
    const/4 v6, 0x4

    .line 154
    if-ne v15, v6, :cond_0

    .line 155
    .line 156
    new-instance v13, Lh5/a;

    .line 157
    .line 158
    const-wide/16 v19, -0x1

    .line 159
    .line 160
    const/16 v21, -0x1

    .line 161
    .line 162
    const/4 v14, 0x1

    .line 163
    move-object/from16 v17, v0

    .line 164
    .line 165
    move-object/from16 v16, v0

    .line 166
    .line 167
    move-object/from16 v18, v3

    .line 168
    .line 169
    invoke-direct/range {v13 .. v21}, Lh5/a;-><init>(ZILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;[Landroid/graphics/Point;JI)V

    .line 170
    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_0
    move-object/from16 v16, v0

    .line 174
    .line 175
    move-object/from16 v18, v3

    .line 176
    .line 177
    new-instance v13, Lh5/a;

    .line 178
    .line 179
    aget-object v17, v8, v5

    .line 180
    .line 181
    const-wide/16 v19, -0x1

    .line 182
    .line 183
    const/16 v21, -0x1

    .line 184
    .line 185
    const/4 v14, 0x0

    .line 186
    invoke-direct/range {v13 .. v21}, Lh5/a;-><init>(ZILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;[Landroid/graphics/Point;JI)V

    .line 187
    .line 188
    .line 189
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 190
    .line 191
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 192
    .line 193
    .line 194
    const-string v3, "times-->"

    .line 195
    .line 196
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 200
    .line 201
    .line 202
    move-result-wide v5

    .line 203
    sub-long/2addr v5, v1

    .line 204
    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-static {v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 212
    .line 213
    .line 214
    return-object v13
.end method

.method public getLimitRectF()[Landroid/graphics/RectF;
    .locals 12

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x4

    .line 10
    new-array v2, v2, [Landroid/graphics/RectF;

    .line 11
    .line 12
    new-instance v3, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iget-object v4, p0, Lg5/f;->g:Landroid/view/View;

    .line 18
    .line 19
    sget v5, Lcom/zykj/camera/R$id;->view1:I

    .line 20
    .line 21
    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    iget-object v4, p0, Lg5/f;->g:Landroid/view/View;

    .line 29
    .line 30
    sget v5, Lcom/zykj/camera/R$id;->view2:I

    .line 31
    .line 32
    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    iget-object v4, p0, Lg5/f;->g:Landroid/view/View;

    .line 40
    .line 41
    sget v5, Lcom/zykj/camera/R$id;->view3:I

    .line 42
    .line 43
    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    iget-object v4, p0, Lg5/f;->g:Landroid/view/View;

    .line 51
    .line 52
    sget v5, Lcom/zykj/camera/R$id;->view4:I

    .line 53
    .line 54
    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    const/4 v4, 0x0

    .line 62
    :goto_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-ge v4, v5, :cond_0

    .line 67
    .line 68
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    check-cast v5, Landroid/view/View;

    .line 73
    .line 74
    new-instance v6, Landroid/graphics/RectF;

    .line 75
    .line 76
    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    int-to-float v7, v7

    .line 81
    int-to-float v8, v0

    .line 82
    div-float/2addr v7, v8

    .line 83
    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    .line 84
    .line 85
    .line 86
    move-result v9

    .line 87
    int-to-float v9, v9

    .line 88
    int-to-float v10, v1

    .line 89
    div-float/2addr v9, v10

    .line 90
    invoke-virtual {v5}, Landroid/view/View;->getRight()I

    .line 91
    .line 92
    .line 93
    move-result v11

    .line 94
    int-to-float v11, v11

    .line 95
    div-float/2addr v11, v8

    .line 96
    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    int-to-float v5, v5

    .line 101
    div-float/2addr v5, v10

    .line 102
    invoke-direct {v6, v7, v9, v11, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 103
    .line 104
    .line 105
    aput-object v6, v2, v4

    .line 106
    .line 107
    add-int/lit8 v4, v4, 0x1

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_0
    return-object v2
.end method

.method public getTipsView()Landroid/view/View;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget v1, Lcom/zykj/camera/R$layout;->camera_scan_box_tips:I

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public final r()V
    .locals 0

    .line 1
    return-void
.end method
