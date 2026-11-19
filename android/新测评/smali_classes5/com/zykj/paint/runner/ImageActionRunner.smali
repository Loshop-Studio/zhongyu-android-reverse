# RE note 本类字节码直接引用的读写或显示接口包括文件流。
.class public Lcom/zykj/paint/runner/ImageActionRunner;
.super Lcom/zykj/paint/runner/ActionRunner;
.source "SourceFile"


# instance fields
.field private graphId:I

.field private sourceUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/zykj/paint/render/MapViewer;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/paint/runner/ActionRunner;-><init>(Lcom/zykj/paint/render/MapViewer;)V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Lcom/zykj/paint/runner/ImageActionRunner;->graphId:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getSourceUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/runner/ImageActionRunner;->sourceUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public pause()V
    .locals 0

    return-void
.end method

.method public resume()V
    .locals 0

    return-void
.end method

# RE I/O 从数据流解码图片（BitmapFactory.decodeStream）。
.method public run(Lcom/zykj/paint/Actions$EzyAction;)V
    .locals 11

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyAction;->getData()Lcom/google/protobuf/Any;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/paint/Actions$NewImageData;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/zykj/paint/Actions$NewImageData;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catch_0
    move-exception v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    :goto_0
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyAction;->getActionType()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    sget v1, Lcom/zykj/paint/exchange/ActionType;->ImageNew:I

    .line 24
    .line 25
    if-ne p1, v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$NewImageData;->getPoint()Lcom/zykj/paint/Actions$EzyPoint;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$NewImageData;->getSize()Lcom/zykj/paint/Actions$EzySize;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$NewImageData;->getSrc()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :try_start_1
    new-instance v1, Ljava/io/FileInputStream;

    .line 39
    .line 40
    new-instance v2, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    iget-object v3, p0, Lcom/zykj/paint/runner/ImageActionRunner;->sourceUrl:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-direct {v1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    new-instance v2, Lcom/zykj/paint/graphic/RectBmp;

    .line 65
    .line 66
    iget-object v3, p0, Lcom/zykj/paint/runner/ActionRunner;->map:Lcom/zykj/paint/graphic/Map;

    .line 67
    .line 68
    invoke-direct {v2, v3, v1}, Lcom/zykj/paint/graphic/RectBmp;-><init>(Lcom/zykj/paint/graphic/Map;Landroid/graphics/Bitmap;)V

    .line 69
    .line 70
    .line 71
    iget v1, p0, Lcom/zykj/paint/runner/ImageActionRunner;->graphId:I

    .line 72
    .line 73
    iput v1, v2, Lcom/zykj/paint/graphic/Graph;->graphId:I

    .line 74
    .line 75
    invoke-virtual {v2, v0}, Lcom/zykj/paint/graphic/RectBmp;->setFilePath(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Lcom/zykj/paint/runner/ActionRunner;->mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 79
    .line 80
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    iget-object v1, p0, Lcom/zykj/paint/runner/ActionRunner;->mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 85
    .line 86
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    const-string v3, "ActionRunner"

    .line 91
    .line 92
    new-instance v4, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 95
    .line 96
    .line 97
    const-string v5, "add image--->"

    .line 98
    .line 99
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    iget v5, v2, Lcom/zykj/paint/graphic/Graph;->graphId:I

    .line 103
    .line 104
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 112
    .line 113
    .line 114
    new-instance v3, Lcom/zykj/paint/data/Vector2D;

    .line 115
    .line 116
    int-to-float v0, v0

    .line 117
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzySize;->getWidth()I

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    int-to-float v4, v4

    .line 122
    const/high16 v5, 0x3f800000    # 1.0f

    .line 123
    .line 124
    mul-float/2addr v4, v5

    .line 125
    sub-float v4, v0, v4

    .line 126
    .line 127
    const/high16 v6, 0x40000000    # 2.0f

    .line 128
    .line 129
    div-float/2addr v4, v6

    .line 130
    float-to-double v7, v4

    .line 131
    int-to-float v1, v1

    .line 132
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzySize;->getHeight()I

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    int-to-float v4, v4

    .line 137
    mul-float/2addr v4, v5

    .line 138
    sub-float v4, v1, v4

    .line 139
    .line 140
    div-float/2addr v4, v6

    .line 141
    float-to-double v9, v4

    .line 142
    invoke-direct {v3, v7, v8, v9, v10}, Lcom/zykj/paint/data/Vector2D;-><init>(DD)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2, v3}, Lcom/zykj/paint/graphic/RectBmp;->setVector2D(Lcom/zykj/paint/data/Vector2D;)V

    .line 146
    .line 147
    .line 148
    new-instance v3, Lcom/zykj/paint/data/Vector2D;

    .line 149
    .line 150
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzySize;->getWidth()I

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    int-to-float v4, v4

    .line 155
    mul-float/2addr v4, v5

    .line 156
    add-float/2addr v0, v4

    .line 157
    div-float/2addr v0, v6

    .line 158
    float-to-double v7, v0

    .line 159
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzySize;->getHeight()I

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    int-to-float p1, p1

    .line 164
    mul-float/2addr p1, v5

    .line 165
    add-float/2addr v1, p1

    .line 166
    div-float/2addr v1, v6

    .line 167
    float-to-double v0, v1

    .line 168
    invoke-direct {v3, v7, v8, v0, v1}, Lcom/zykj/paint/data/Vector2D;-><init>(DD)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2, v3}, Lcom/zykj/paint/graphic/RectBmp;->setDstVector(Lcom/zykj/paint/data/Vector2D;)V

    .line 172
    .line 173
    .line 174
    iget-object p1, p0, Lcom/zykj/paint/runner/ActionRunner;->mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 175
    .line 176
    iget-object p1, p1, Lcom/zykj/paint/render/MapViewer;->map:Lcom/zykj/paint/graphic/Map;

    .line 177
    .line 178
    invoke-virtual {p1}, Lcom/zykj/paint/graphic/Map;->getCurrentLayer()Lcom/zykj/paint/graphic/Layer;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    iget-object p1, p1, Lcom/zykj/paint/graphic/Layer;->graphList:Ljava/util/List;

    .line 183
    .line 184
    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    iget-object p1, p0, Lcom/zykj/paint/runner/ActionRunner;->mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 188
    .line 189
    invoke-virtual {p1}, Lcom/zykj/paint/render/MapViewer;->directRenderAll()V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 190
    .line 191
    .line 192
    goto :goto_1

    .line 193
    :catch_1
    move-exception p1

    .line 194
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 195
    .line 196
    .line 197
    :cond_0
    :goto_1
    return-void
.end method

.method public setSourceUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/runner/ImageActionRunner;->sourceUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public stop()V
    .locals 0

    return-void
.end method
