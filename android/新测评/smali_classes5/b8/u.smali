.class public abstract Lb8/u;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcom/zykj/view/EzySimpleBoardData$Paint;)Landroid/graphics/Paint;
    .locals 3

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/Paint;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 9
    .line 10
    .line 11
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    .line 17
    .line 18
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_OVER:Landroid/graphics/PorterDuff$Mode;

    .line 19
    .line 20
    invoke-direct {v1, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 24
    .line 25
    .line 26
    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 29
    .line 30
    .line 31
    sget-object v1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 34
    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/zykj/view/EzySimpleBoardData$Paint;->getColor()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/zykj/view/EzySimpleBoardData$Paint;->getWidth()F

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/zykj/view/EzySimpleBoardData$Paint;->getIsDashed()Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-eqz p0, :cond_0

    .line 62
    .line 63
    new-instance p0, Landroid/graphics/DashPathEffect;

    .line 64
    .line 65
    const/4 v1, 0x2

    .line 66
    new-array v1, v1, [F

    .line 67
    .line 68
    fill-array-data v1, :array_0

    .line 69
    .line 70
    .line 71
    const/4 v2, 0x0

    .line 72
    invoke-direct {p0, v1, v2}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    const/4 p0, 0x0

    .line 77
    :goto_0
    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 78
    .line 79
    .line 80
    return-object v0

    .line 81
    :array_0
    .array-data 4
        0x41f00000    # 30.0f
        0x41700000    # 15.0f
    .end array-data
.end method

.method public static final b(Landroid/graphics/Paint;)Lcom/zykj/view/EzySimpleBoardData$Paint;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/zykj/view/EzySimpleBoardData$Paint;->newBuilder()Lcom/zykj/view/EzySimpleBoardData$Paint$Builder;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0}, Landroid/graphics/Paint;->getColor()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {v0, v1}, Lcom/zykj/view/EzySimpleBoardData$Paint$Builder;->setColor(I)Lcom/zykj/view/EzySimpleBoardData$Paint$Builder;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-virtual {v0, v1}, Lcom/zykj/view/EzySimpleBoardData$Paint$Builder;->setWidth(F)Lcom/zykj/view/EzySimpleBoardData$Paint$Builder;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p0}, Landroid/graphics/Paint;->getPathEffect()Landroid/graphics/PathEffect;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    const/4 p0, 0x1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p0, 0x0

    .line 35
    :goto_0
    invoke-virtual {v0, p0}, Lcom/zykj/view/EzySimpleBoardData$Paint$Builder;->setIsDashed(Z)Lcom/zykj/view/EzySimpleBoardData$Paint$Builder;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const-string v0, "build(...)"

    .line 44
    .line 45
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$Paint;

    .line 49
    .line 50
    return-object p0
.end method

.method public static final c(Lcom/zykj/view/utils/ProtoPath;)Lcom/zykj/view/EzySimpleBoardData$Path;
    .locals 5

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/zykj/view/EzySimpleBoardData$Path;->newBuilder()Lcom/zykj/view/EzySimpleBoardData$Path$Builder;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0}, Lcom/zykj/view/utils/ProtoPath;->getPaint()Landroid/graphics/Paint;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v1}, Lb8/u;->b(Landroid/graphics/Paint;)Lcom/zykj/view/EzySimpleBoardData$Paint;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Lcom/zykj/view/EzySimpleBoardData$Path$Builder;->setPaint(Lcom/zykj/view/EzySimpleBoardData$Paint;)Lcom/zykj/view/EzySimpleBoardData$Path$Builder;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p0}, Lcom/zykj/view/utils/ProtoPath;->getPointList()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    new-instance v1, Ljava/util/ArrayList;

    .line 27
    .line 28
    const/16 v2, 0xa

    .line 29
    .line 30
    invoke-static {p0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Landroid/graphics/PointF;

    .line 52
    .line 53
    invoke-static {}, Lcom/zykj/view/EzySimpleBoardData$PointF;->newBuilder()Lcom/zykj/view/EzySimpleBoardData$PointF$Builder;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    iget v4, v2, Landroid/graphics/PointF;->x:F

    .line 58
    .line 59
    invoke-virtual {v3, v4}, Lcom/zykj/view/EzySimpleBoardData$PointF$Builder;->addValue(F)Lcom/zykj/view/EzySimpleBoardData$PointF$Builder;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 64
    .line 65
    invoke-virtual {v3, v2}, Lcom/zykj/view/EzySimpleBoardData$PointF$Builder;->addValue(F)Lcom/zykj/view/EzySimpleBoardData$PointF$Builder;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v2}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    check-cast v2, Lcom/zykj/view/EzySimpleBoardData$PointF;

    .line 74
    .line 75
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    invoke-virtual {v0, v1}, Lcom/zykj/view/EzySimpleBoardData$Path$Builder;->addAllPoint(Ljava/lang/Iterable;)Lcom/zykj/view/EzySimpleBoardData$Path$Builder;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    const-string v0, "build(...)"

    .line 88
    .line 89
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    check-cast p0, Lcom/zykj/view/EzySimpleBoardData$Path;

    .line 93
    .line 94
    return-object p0
.end method

.method public static final d(Lcom/zykj/view/EzySimpleBoardData$Path;)Lcom/zykj/view/utils/ProtoPath;
    .locals 7

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/view/EzySimpleBoardData$Path;->hasPaint()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x1

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/zykj/view/EzySimpleBoardData$Path;->getPaint()Lcom/zykj/view/EzySimpleBoardData$Paint;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v2, "getPaint(...)"

    .line 18
    .line 19
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lb8/u;->a(Lcom/zykj/view/EzySimpleBoardData$Paint;)Landroid/graphics/Paint;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance v0, Landroid/graphics/Paint;

    .line 28
    .line 29
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 30
    .line 31
    .line 32
    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 33
    .line 34
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 35
    .line 36
    .line 37
    new-instance v2, Landroid/graphics/PorterDuffXfermode;

    .line 38
    .line 39
    sget-object v3, Landroid/graphics/PorterDuff$Mode;->SRC_OVER:Landroid/graphics/PorterDuff$Mode;

    .line 40
    .line 41
    invoke-direct {v2, v3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 45
    .line 46
    .line 47
    sget-object v2, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 48
    .line 49
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 50
    .line 51
    .line 52
    sget-object v2, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 53
    .line 54
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 61
    .line 62
    .line 63
    const/high16 v2, -0x1000000

    .line 64
    .line 65
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 66
    .line 67
    .line 68
    const/high16 v2, 0x40400000    # 3.0f

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 71
    .line 72
    .line 73
    const/4 v2, 0x0

    .line 74
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 75
    .line 76
    .line 77
    :goto_0
    new-instance v2, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Lcom/zykj/view/EzySimpleBoardData$Path;->getPointList()Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    const-string v3, "getPointList(...)"

    .line 87
    .line 88
    invoke-static {p0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    new-instance v3, Ljava/util/ArrayList;

    .line 92
    .line 93
    const/16 v4, 0xa

    .line 94
    .line 95
    invoke-static {p0, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 100
    .line 101
    .line 102
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    if-eqz v4, :cond_1

    .line 111
    .line 112
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    check-cast v4, Lcom/zykj/view/EzySimpleBoardData$PointF;

    .line 117
    .line 118
    new-instance v5, Landroid/graphics/PointF;

    .line 119
    .line 120
    const/4 v6, 0x0

    .line 121
    invoke-virtual {v4, v6}, Lcom/zykj/view/EzySimpleBoardData$PointF;->getValue(I)F

    .line 122
    .line 123
    .line 124
    move-result v6

    .line 125
    invoke-virtual {v4, v1}, Lcom/zykj/view/EzySimpleBoardData$PointF;->getValue(I)F

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    invoke-direct {v5, v6, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 130
    .line 131
    .line 132
    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_1
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 137
    .line 138
    .line 139
    new-instance p0, Lcom/zykj/view/utils/ProtoPath;

    .line 140
    .line 141
    invoke-direct {p0, v0, v2}, Lcom/zykj/view/utils/ProtoPath;-><init>(Landroid/graphics/Paint;Ljava/util/List;)V

    .line 142
    .line 143
    .line 144
    return-object p0
.end method
