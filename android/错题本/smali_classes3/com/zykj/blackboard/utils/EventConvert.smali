# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/blackboard/utils/EventConvert;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0018\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0018\u0010\u000c\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\t2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000b\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/zykj/blackboard/utils/EventConvert;",
        "",
        "()V",
        "buildPointPropertiesList",
        "",
        "Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;",
        "touchEvent",
        "Landroid/view/MotionEvent;",
        "motionEventConvertTouchEvent",
        "Lcom/zykj/board/EzyTouchEvent$TouchEvent;",
        "matrix",
        "Landroid/graphics/Matrix;",
        "updateTouchEventByNewMatrix",
        "newMatrix",
        "blackboard_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/zykj/blackboard/utils/EventConvert;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/blackboard/utils/EventConvert;

    invoke-direct {v0}, Lcom/zykj/blackboard/utils/EventConvert;-><init>()V

    sput-object v0, Lcom/zykj/blackboard/utils/EventConvert;->INSTANCE:Lcom/zykj/blackboard/utils/EventConvert;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final buildPointPropertiesList(Landroid/view/MotionEvent;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/MotionEvent;",
            ")",
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    new-array v2, v1, [Lcom/zykj/board/b1;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    move v4, v3

    .line 14
    :goto_0
    if-ge v4, v1, :cond_0

    .line 15
    .line 16
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->newBuilder()Lcom/zykj/board/b1;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    aput-object v5, v2, v4

    .line 21
    .line 22
    add-int/lit8 v4, v4, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v4, Landroid/view/MotionEvent$PointerProperties;

    .line 26
    .line 27
    invoke-direct {v4}, Landroid/view/MotionEvent$PointerProperties;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    move v6, v3

    .line 35
    :goto_1
    if-ge v6, v5, :cond_1

    .line 36
    .line 37
    invoke-virtual {p1, v6, v4}, Landroid/view/MotionEvent;->getPointerProperties(ILandroid/view/MotionEvent$PointerProperties;)V

    .line 38
    .line 39
    .line 40
    aget-object v7, v2, v6

    .line 41
    .line 42
    iget v8, v4, Landroid/view/MotionEvent$PointerProperties;->id:I

    .line 43
    .line 44
    iput v8, v7, Lcom/zykj/board/b1;->b:I

    .line 45
    .line 46
    iget v8, v7, Lcom/zykj/board/b1;->a:I

    .line 47
    .line 48
    or-int/lit8 v8, v8, 0x1

    .line 49
    .line 50
    iput v8, v7, Lcom/zykj/board/b1;->a:I

    .line 51
    .line 52
    invoke-virtual {v7}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 53
    .line 54
    .line 55
    aget-object v7, v2, v6

    .line 56
    .line 57
    iget v8, v4, Landroid/view/MotionEvent$PointerProperties;->toolType:I

    .line 58
    .line 59
    iput v8, v7, Lcom/zykj/board/b1;->c:I

    .line 60
    .line 61
    iget v8, v7, Lcom/zykj/board/b1;->a:I

    .line 62
    .line 63
    or-int/lit8 v8, v8, 0x2

    .line 64
    .line 65
    iput v8, v7, Lcom/zykj/board/b1;->a:I

    .line 66
    .line 67
    invoke-virtual {v7}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 68
    .line 69
    .line 70
    add-int/lit8 v6, v6, 0x1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    :goto_2
    if-ge v3, v1, :cond_3

    .line 74
    .line 75
    aget-object p1, v2, v3

    .line 76
    .line 77
    invoke-virtual {p1}, Lcom/zykj/board/b1;->c()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->isInitialized()Z

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    if-eqz v4, :cond_2

    .line 86
    .line 87
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    add-int/lit8 v3, v3, 0x1

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_2
    invoke-static {p1}, Lcom/google/protobuf/AbstractMessage$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    throw p1

    .line 98
    :cond_3
    return-object v0
.end method


# virtual methods
.method public final motionEventConvertTouchEvent(Landroid/view/MotionEvent;Landroid/graphics/Matrix;)Lcom/zykj/board/EzyTouchEvent$TouchEvent;
    .locals 12
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "touchEvent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    new-array v2, v1, [Lcom/zykj/board/z0;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    move v4, v3

    .line 19
    :goto_0
    if-ge v4, v1, :cond_0

    .line 20
    .line 21
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->newBuilder()Lcom/zykj/board/z0;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    aput-object v5, v2, v4

    .line 26
    .line 27
    add-int/lit8 v4, v4, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance v4, Landroid/view/MotionEvent$PointerCoords;

    .line 31
    .line 32
    invoke-direct {v4}, Landroid/view/MotionEvent$PointerCoords;-><init>()V

    .line 33
    .line 34
    .line 35
    const/4 v5, 0x2

    .line 36
    new-array v6, v5, [F

    .line 37
    .line 38
    const/4 v7, 0x0

    .line 39
    aput v7, v6, v3

    .line 40
    .line 41
    const/4 v8, 0x1

    .line 42
    aput v7, v6, v8

    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    move v9, v3

    .line 49
    :goto_1
    if-ge v9, v7, :cond_2

    .line 50
    .line 51
    invoke-virtual {p1, v9, v4}, Landroid/view/MotionEvent;->getPointerCoords(ILandroid/view/MotionEvent$PointerCoords;)V

    .line 52
    .line 53
    .line 54
    iget v10, v4, Landroid/view/MotionEvent$PointerCoords;->x:F

    .line 55
    .line 56
    aput v10, v6, v3

    .line 57
    .line 58
    iget v10, v4, Landroid/view/MotionEvent$PointerCoords;->y:F

    .line 59
    .line 60
    aput v10, v6, v8

    .line 61
    .line 62
    if-eqz p2, :cond_1

    .line 63
    .line 64
    invoke-virtual {p2, v6}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 65
    .line 66
    .line 67
    :cond_1
    aget-object v10, v2, v9

    .line 68
    .line 69
    aget v11, v6, v3

    .line 70
    .line 71
    iput v11, v10, Lcom/zykj/board/z0;->b:F

    .line 72
    .line 73
    iget v11, v10, Lcom/zykj/board/z0;->a:I

    .line 74
    .line 75
    or-int/2addr v11, v8

    .line 76
    iput v11, v10, Lcom/zykj/board/z0;->a:I

    .line 77
    .line 78
    invoke-virtual {v10}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 79
    .line 80
    .line 81
    aget-object v10, v2, v9

    .line 82
    .line 83
    aget v11, v6, v8

    .line 84
    .line 85
    iput v11, v10, Lcom/zykj/board/z0;->c:F

    .line 86
    .line 87
    iget v11, v10, Lcom/zykj/board/z0;->a:I

    .line 88
    .line 89
    or-int/2addr v11, v5

    .line 90
    iput v11, v10, Lcom/zykj/board/z0;->a:I

    .line 91
    .line 92
    invoke-virtual {v10}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v4}, Landroid/view/MotionEvent$PointerCoords;->clear()V

    .line 96
    .line 97
    .line 98
    add-int/lit8 v9, v9, 0x1

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_2
    move v4, v3

    .line 102
    :goto_2
    if-ge v4, v1, :cond_3

    .line 103
    .line 104
    aget-object v7, v2, v4

    .line 105
    .line 106
    invoke-virtual {v7}, Lcom/zykj/board/z0;->c()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    add-int/lit8 v4, v4, 0x1

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    aput v1, v6, v3

    .line 121
    .line 122
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    aput v1, v6, v8

    .line 127
    .line 128
    if-eqz p2, :cond_4

    .line 129
    .line 130
    invoke-virtual {p2, v6}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 131
    .line 132
    .line 133
    :cond_4
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->newBuilder()Lcom/zykj/board/x0;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 138
    .line 139
    .line 140
    move-result-wide v1

    .line 141
    invoke-virtual {p2, v1, v2}, Lcom/zykj/board/x0;->i(J)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    iput v1, p2, Lcom/zykj/board/x0;->c:I

    .line 149
    .line 150
    iget v1, p2, Lcom/zykj/board/x0;->a:I

    .line 151
    .line 152
    or-int/2addr v1, v5

    .line 153
    iput v1, p2, Lcom/zykj/board/x0;->a:I

    .line 154
    .line 155
    invoke-virtual {p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    iput v1, p2, Lcom/zykj/board/x0;->f:I

    .line 163
    .line 164
    iget v1, p2, Lcom/zykj/board/x0;->a:I

    .line 165
    .line 166
    or-int/lit8 v1, v1, 0x10

    .line 167
    .line 168
    iput v1, p2, Lcom/zykj/board/x0;->a:I

    .line 169
    .line 170
    invoke-virtual {p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 171
    .line 172
    .line 173
    aget v1, v6, v3

    .line 174
    .line 175
    invoke-virtual {p2, v1}, Lcom/zykj/board/x0;->j(F)V

    .line 176
    .line 177
    .line 178
    aget v1, v6, v8

    .line 179
    .line 180
    invoke-virtual {p2, v1}, Lcom/zykj/board/x0;->k(F)V

    .line 181
    .line 182
    .line 183
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/utils/EventConvert;->buildPointPropertiesList(Landroid/view/MotionEvent;)Ljava/util/List;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    iget-object v1, p2, Lcom/zykj/board/x0;->h:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 188
    .line 189
    if-nez v1, :cond_5

    .line 190
    .line 191
    invoke-virtual {p2}, Lcom/zykj/board/x0;->ensurePointerPropertiesIsMutable()V

    .line 192
    .line 193
    .line 194
    iget-object v1, p2, Lcom/zykj/board/x0;->g:Ljava/util/List;

    .line 195
    .line 196
    invoke-static {p1, v1}, Lcom/google/protobuf/AbstractMessageLite$Builder;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 200
    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_5
    invoke-virtual {v1, p1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 204
    .line 205
    .line 206
    :goto_3
    iget-object p1, p2, Lcom/zykj/board/x0;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 207
    .line 208
    if-nez p1, :cond_6

    .line 209
    .line 210
    invoke-virtual {p2}, Lcom/zykj/board/x0;->ensurePointerCoordsIsMutable()V

    .line 211
    .line 212
    .line 213
    iget-object p1, p2, Lcom/zykj/board/x0;->i:Ljava/util/List;

    .line 214
    .line 215
    invoke-static {v0, p1}, Lcom/google/protobuf/AbstractMessageLite$Builder;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 219
    .line 220
    .line 221
    goto :goto_4

    .line 222
    :cond_6
    invoke-virtual {p1, v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 223
    .line 224
    .line 225
    :goto_4
    invoke-virtual {p2}, Lcom/zykj/board/x0;->c()Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 230
    .line 231
    .line 232
    return-object p1
.end method

.method public final updateTouchEventByNewMatrix(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Landroid/graphics/Matrix;)Lcom/zykj/board/EzyTouchEvent$TouchEvent;
    .locals 8
    .param p1    # Lcom/zykj/board/EzyTouchEvent$TouchEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "touchEvent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->toBuilder()Lcom/zykj/board/x0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/4 v0, 0x2

    .line 11
    new-array v1, v0, [F

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    aput v3, v1, v2

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    aput v3, v1, v4

    .line 19
    .line 20
    iget v3, p1, Lcom/zykj/board/x0;->f:I

    .line 21
    .line 22
    move v5, v2

    .line 23
    :goto_0
    if-ge v5, v3, :cond_3

    .line 24
    .line 25
    iget-object v6, p1, Lcom/zykj/board/x0;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 26
    .line 27
    if-nez v6, :cond_0

    .line 28
    .line 29
    iget-object v6, p1, Lcom/zykj/board/x0;->i:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    check-cast v6, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    invoke-virtual {v6, v5}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getMessage(I)Lcom/google/protobuf/AbstractMessage;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    check-cast v6, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 43
    .line 44
    :goto_1
    invoke-virtual {v6}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->toBuilder()Lcom/zykj/board/z0;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    iget v7, v6, Lcom/zykj/board/z0;->b:F

    .line 49
    .line 50
    aput v7, v1, v2

    .line 51
    .line 52
    iget v7, v6, Lcom/zykj/board/z0;->c:F

    .line 53
    .line 54
    aput v7, v1, v4

    .line 55
    .line 56
    if-eqz p2, :cond_1

    .line 57
    .line 58
    invoke-virtual {p2, v1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 59
    .line 60
    .line 61
    :cond_1
    aget v7, v1, v2

    .line 62
    .line 63
    iput v7, v6, Lcom/zykj/board/z0;->b:F

    .line 64
    .line 65
    iget v7, v6, Lcom/zykj/board/z0;->a:I

    .line 66
    .line 67
    or-int/2addr v7, v4

    .line 68
    iput v7, v6, Lcom/zykj/board/z0;->a:I

    .line 69
    .line 70
    invoke-virtual {v6}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 71
    .line 72
    .line 73
    aget v7, v1, v4

    .line 74
    .line 75
    iput v7, v6, Lcom/zykj/board/z0;->c:F

    .line 76
    .line 77
    iget v7, v6, Lcom/zykj/board/z0;->a:I

    .line 78
    .line 79
    or-int/2addr v7, v0

    .line 80
    iput v7, v6, Lcom/zykj/board/z0;->a:I

    .line 81
    .line 82
    invoke-virtual {v6}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 83
    .line 84
    .line 85
    iget-object v7, p1, Lcom/zykj/board/x0;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 86
    .line 87
    if-nez v7, :cond_2

    .line 88
    .line 89
    invoke-virtual {p1}, Lcom/zykj/board/x0;->ensurePointerCoordsIsMutable()V

    .line 90
    .line 91
    .line 92
    iget-object v7, p1, Lcom/zykj/board/x0;->i:Ljava/util/List;

    .line 93
    .line 94
    invoke-virtual {v6}, Lcom/zykj/board/z0;->c()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    invoke-interface {v7, v5, v6}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_2
    invoke-virtual {v6}, Lcom/zykj/board/z0;->c()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    invoke-virtual {v7, v5, v6}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->setMessage(ILcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 110
    .line 111
    .line 112
    :goto_2
    add-int/lit8 v5, v5, 0x1

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_3
    iget v0, p1, Lcom/zykj/board/x0;->d:F

    .line 116
    .line 117
    aput v0, v1, v2

    .line 118
    .line 119
    iget v0, p1, Lcom/zykj/board/x0;->e:F

    .line 120
    .line 121
    aput v0, v1, v4

    .line 122
    .line 123
    if-eqz p2, :cond_4

    .line 124
    .line 125
    invoke-virtual {p2, v1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 126
    .line 127
    .line 128
    :cond_4
    aget p2, v1, v2

    .line 129
    .line 130
    invoke-virtual {p1, p2}, Lcom/zykj/board/x0;->j(F)V

    .line 131
    .line 132
    .line 133
    aget p2, v1, v4

    .line 134
    .line 135
    invoke-virtual {p1, p2}, Lcom/zykj/board/x0;->k(F)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1}, Lcom/zykj/board/x0;->c()Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    return-object p1
.end method
