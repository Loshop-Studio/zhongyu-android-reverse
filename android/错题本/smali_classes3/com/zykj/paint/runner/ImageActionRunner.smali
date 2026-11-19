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
    const-string v0, "add image--->"

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyAction;->getData()Lcom/google/protobuf/Any;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-class v2, Lcom/zykj/paint/Actions$NewImageData;

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lcom/zykj/paint/Actions$NewImageData;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catch_0
    move-exception v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    :goto_0
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyAction;->getActionType()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    sget v2, Lcom/zykj/paint/exchange/ActionType;->ImageNew:I

    .line 26
    .line 27
    if-ne p1, v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {v1}, Lcom/zykj/paint/Actions$NewImageData;->getPoint()Lcom/zykj/paint/Actions$EzyPoint;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Lcom/zykj/paint/Actions$NewImageData;->getSize()Lcom/zykj/paint/Actions$EzySize;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {v1}, Lcom/zykj/paint/Actions$NewImageData;->getSrc()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    :try_start_1
    new-instance v2, Ljava/io/FileInputStream;

    .line 41
    .line 42
    new-instance v3, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    iget-object v4, p0, Lcom/zykj/paint/runner/ImageActionRunner;->sourceUrl:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-direct {v2, v3}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-static {v2}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    new-instance v3, Lcom/zykj/paint/graphic/RectBmp;

    .line 67
    .line 68
    iget-object v4, p0, Lcom/zykj/paint/runner/ActionRunner;->map:Lcom/zykj/paint/graphic/Map;

    .line 69
    .line 70
    invoke-direct {v3, v4, v2}, Lcom/zykj/paint/graphic/RectBmp;-><init>(Lcom/zykj/paint/graphic/Map;Landroid/graphics/Bitmap;)V

    .line 71
    .line 72
    .line 73
    iget v2, p0, Lcom/zykj/paint/runner/ImageActionRunner;->graphId:I

    .line 74
    .line 75
    iput v2, v3, Lcom/zykj/paint/graphic/Graph;->graphId:I

    .line 76
    .line 77
    invoke-virtual {v3, v1}, Lcom/zykj/paint/graphic/RectBmp;->setFilePath(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget-object v1, p0, Lcom/zykj/paint/runner/ActionRunner;->mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 81
    .line 82
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    iget-object v2, p0, Lcom/zykj/paint/runner/ActionRunner;->mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 87
    .line 88
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    const-string v4, "ActionRunner"

    .line 93
    .line 94
    new-instance v5, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    iget v0, v3, Lcom/zykj/paint/graphic/Graph;->graphId:I

    .line 100
    .line 101
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-static {v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 109
    .line 110
    .line 111
    new-instance v0, Lcom/zykj/paint/data/Vector2D;

    .line 112
    .line 113
    int-to-float v1, v1

    .line 114
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzySize;->getWidth()I

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    int-to-float v4, v4

    .line 119
    const/high16 v5, 0x40000000    # 2.0f

    .line 120
    .line 121
    const/high16 v6, 0x3f800000    # 1.0f

    .line 122
    .line 123
    invoke-static {v4, v6, v1, v5}, Landroidx/compose/material3/c;->a(FFFF)F

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    float-to-double v7, v4

    .line 128
    int-to-float v2, v2

    .line 129
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzySize;->getHeight()I

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    int-to-float v4, v4

    .line 134
    invoke-static {v4, v6, v2, v5}, Landroidx/compose/material3/c;->a(FFFF)F

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    float-to-double v9, v4

    .line 139
    invoke-direct {v0, v7, v8, v9, v10}, Lcom/zykj/paint/data/Vector2D;-><init>(DD)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v3, v0}, Lcom/zykj/paint/graphic/RectBmp;->setVector2D(Lcom/zykj/paint/data/Vector2D;)V

    .line 143
    .line 144
    .line 145
    new-instance v0, Lcom/zykj/paint/data/Vector2D;

    .line 146
    .line 147
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzySize;->getWidth()I

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    int-to-float v4, v4

    .line 152
    mul-float/2addr v4, v6

    .line 153
    add-float/2addr v4, v1

    .line 154
    div-float/2addr v4, v5

    .line 155
    float-to-double v7, v4

    .line 156
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzySize;->getHeight()I

    .line 157
    .line 158
    .line 159
    move-result p1

    .line 160
    int-to-float p1, p1

    .line 161
    mul-float/2addr p1, v6

    .line 162
    add-float/2addr p1, v2

    .line 163
    div-float/2addr p1, v5

    .line 164
    float-to-double v1, p1

    .line 165
    invoke-direct {v0, v7, v8, v1, v2}, Lcom/zykj/paint/data/Vector2D;-><init>(DD)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v3, v0}, Lcom/zykj/paint/graphic/RectBmp;->setDstVector(Lcom/zykj/paint/data/Vector2D;)V

    .line 169
    .line 170
    .line 171
    iget-object p1, p0, Lcom/zykj/paint/runner/ActionRunner;->mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 172
    .line 173
    iget-object p1, p1, Lcom/zykj/paint/render/MapViewer;->map:Lcom/zykj/paint/graphic/Map;

    .line 174
    .line 175
    invoke-virtual {p1}, Lcom/zykj/paint/graphic/Map;->getCurrentLayer()Lcom/zykj/paint/graphic/Layer;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    iget-object p1, p1, Lcom/zykj/paint/graphic/Layer;->graphList:Ljava/util/List;

    .line 180
    .line 181
    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    iget-object p1, p0, Lcom/zykj/paint/runner/ActionRunner;->mapViewer:Lcom/zykj/paint/render/MapViewer;

    .line 185
    .line 186
    invoke-virtual {p1}, Lcom/zykj/paint/render/MapViewer;->directRenderAll()V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 187
    .line 188
    .line 189
    goto :goto_1

    .line 190
    :catch_1
    move-exception p1

    .line 191
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 192
    .line 193
    .line 194
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
