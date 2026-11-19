.class public final Lcom/zykj/blackboard/utils/EventConvert;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/zykj/blackboard/utils/EventConvert;


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
    new-array v2, v1, [Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties$b;

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
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->e()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties$b;

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
    invoke-virtual {v7, v8}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties$b;->r(I)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties$b;

    .line 45
    .line 46
    .line 47
    aget-object v7, v2, v6

    .line 48
    .line 49
    iget v8, v4, Landroid/view/MotionEvent$PointerProperties;->toolType:I

    .line 50
    .line 51
    invoke-virtual {v7, v8}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties$b;->t(I)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties$b;

    .line 52
    .line 53
    .line 54
    add-int/lit8 v6, v6, 0x1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    :goto_2
    if-ge v3, v1, :cond_2

    .line 58
    .line 59
    aget-object p1, v2, v3

    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties$b;->e()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    const-string v4, "it.build()"

    .line 66
    .line 67
    invoke-static {p1, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    add-int/lit8 v3, v3, 0x1

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_2
    return-object v0
.end method


# virtual methods
.method public final motionEventConvertTouchEvent(Landroid/view/MotionEvent;Landroid/graphics/Matrix;)Lcom/zykj/board/EzyTouchEvent$TouchEvent;
    .locals 11

    .line 1
    const-string v0, "touchEvent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    new-array v2, v1, [Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;

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
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->e()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;

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
    new-array v5, v5, [F

    .line 37
    .line 38
    const/4 v6, 0x0

    .line 39
    aput v6, v5, v3

    .line 40
    .line 41
    const/4 v7, 0x1

    .line 42
    aput v6, v5, v7

    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    move v8, v3

    .line 49
    :goto_1
    if-ge v8, v6, :cond_2

    .line 50
    .line 51
    invoke-virtual {p1, v8, v4}, Landroid/view/MotionEvent;->getPointerCoords(ILandroid/view/MotionEvent$PointerCoords;)V

    .line 52
    .line 53
    .line 54
    iget v9, v4, Landroid/view/MotionEvent$PointerCoords;->x:F

    .line 55
    .line 56
    aput v9, v5, v3

    .line 57
    .line 58
    iget v9, v4, Landroid/view/MotionEvent$PointerCoords;->y:F

    .line 59
    .line 60
    aput v9, v5, v7

    .line 61
    .line 62
    if-eqz p2, :cond_1

    .line 63
    .line 64
    invoke-virtual {p2, v5}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 65
    .line 66
    .line 67
    :cond_1
    aget-object v9, v2, v8

    .line 68
    .line 69
    aget v10, v5, v3

    .line 70
    .line 71
    invoke-virtual {v9, v10}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;->t(F)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;

    .line 72
    .line 73
    .line 74
    aget-object v9, v2, v8

    .line 75
    .line 76
    aget v10, v5, v7

    .line 77
    .line 78
    invoke-virtual {v9, v10}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;->u(F)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4}, Landroid/view/MotionEvent$PointerCoords;->clear()V

    .line 82
    .line 83
    .line 84
    add-int/lit8 v8, v8, 0x1

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    move v4, v3

    .line 88
    :goto_2
    if-ge v4, v1, :cond_3

    .line 89
    .line 90
    aget-object v6, v2, v4

    .line 91
    .line 92
    invoke-virtual {v6}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;->e()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    const-string v8, "it.build()"

    .line 97
    .line 98
    invoke-static {v6, v8}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    add-int/lit8 v4, v4, 0x1

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    aput v1, v5, v3

    .line 112
    .line 113
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    aput v1, v5, v7

    .line 118
    .line 119
    if-eqz p2, :cond_4

    .line 120
    .line 121
    invoke-virtual {p2, v5}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 122
    .line 123
    .line 124
    :cond_4
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->o()Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 129
    .line 130
    .line 131
    move-result-wide v1

    .line 132
    invoke-virtual {p2, v1, v2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->v(J)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    invoke-virtual {p2, v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->u(I)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    invoke-virtual {p2, v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->y(I)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 147
    .line 148
    .line 149
    aget v1, v5, v3

    .line 150
    .line 151
    invoke-virtual {p2, v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->B(F)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 152
    .line 153
    .line 154
    aget v1, v5, v7

    .line 155
    .line 156
    invoke-virtual {p2, v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->C(F)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 157
    .line 158
    .line 159
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/utils/EventConvert;->buildPointPropertiesList(Landroid/view/MotionEvent;)Ljava/util/List;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    invoke-virtual {p2, p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->e(Ljava/lang/Iterable;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 164
    .line 165
    .line 166
    invoke-virtual {p2, v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->c(Ljava/lang/Iterable;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 167
    .line 168
    .line 169
    invoke-virtual {p2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->g()Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 174
    .line 175
    .line 176
    const-string p2, "build"

    .line 177
    .line 178
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    return-object p1
.end method

.method public final updateTouchEventByNewMatrix(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Landroid/graphics/Matrix;)Lcom/zykj/board/EzyTouchEvent$TouchEvent;
    .locals 7

    .line 1
    const-string v0, "touchEvent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->r()Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/4 v0, 0x2

    .line 11
    new-array v0, v0, [F

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    aput v2, v0, v1

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    aput v2, v0, v3

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->getPointerCount()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    move v4, v1

    .line 25
    :goto_0
    if-ge v4, v2, :cond_1

    .line 26
    .line 27
    invoke-virtual {p1, v4}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->p(I)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-virtual {v5}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->i()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-virtual {v5}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;->getX()F

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    aput v6, v0, v1

    .line 40
    .line 41
    invoke-virtual {v5}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;->getY()F

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    aput v6, v0, v3

    .line 46
    .line 47
    if-eqz p2, :cond_0

    .line 48
    .line 49
    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 50
    .line 51
    .line 52
    :cond_0
    aget v6, v0, v1

    .line 53
    .line 54
    invoke-virtual {v5, v6}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;->t(F)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;

    .line 55
    .line 56
    .line 57
    aget v6, v0, v3

    .line 58
    .line 59
    invoke-virtual {v5, v6}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;->u(F)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v4, v5}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->x(ILcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 63
    .line 64
    .line 65
    add-int/lit8 v4, v4, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->getX()F

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    aput v2, v0, v1

    .line 73
    .line 74
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->getY()F

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    aput v2, v0, v3

    .line 79
    .line 80
    if-eqz p2, :cond_2

    .line 81
    .line 82
    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 83
    .line 84
    .line 85
    :cond_2
    aget p2, v0, v1

    .line 86
    .line 87
    invoke-virtual {p1, p2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->B(F)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 88
    .line 89
    .line 90
    aget p2, v0, v3

    .line 91
    .line 92
    invoke-virtual {p1, p2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->C(F)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->g()Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    const-string p2, "builder.build()"

    .line 100
    .line 101
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    return-object p1
.end method
