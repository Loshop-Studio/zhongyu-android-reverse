# RE note 管理 Blackboard 页面编辑状态及页面快照。
.class public final Lcom/zykj/blackboard/core/edit/PageControl;
.super Lcom/zykj/blackboard/core/edit/BasePageControl;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/edit/BoardControl;Ll4/j;Lcom/zykj/blackboard/core/data/dao/PageEntity;)V
    .locals 1

    const-string v0, "boardControl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "renderLayer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/edit/BasePageControl;-><init>(Lcom/zykj/blackboard/core/edit/BoardControl;Ll4/j;Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/edit/BoardControl;Ll4/j;Lcom/zykj/blackboard/core/data/dao/PageEntity;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/edit/PageControl;-><init>(Lcom/zykj/blackboard/core/edit/BoardControl;Ll4/j;Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    return-void
.end method

.method public static synthetic j0(Lcom/zykj/blackboard/core/edit/PageControl;Ljava/io/File;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Ljava/lang/Integer;Ljava/lang/Integer;ZILjava/lang/Object;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;
    .locals 1

    .line 1
    and-int/lit8 p8, p7, 0x8

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p8, :cond_0

    .line 5
    .line 6
    move-object p4, v0

    .line 7
    :cond_0
    and-int/lit8 p8, p7, 0x10

    .line 8
    .line 9
    if-eqz p8, :cond_1

    .line 10
    .line 11
    move-object p5, v0

    .line 12
    :cond_1
    and-int/lit8 p7, p7, 0x20

    .line 13
    .line 14
    if-eqz p7, :cond_2

    .line 15
    .line 16
    const/4 p6, 0x0

    .line 17
    :cond_2
    invoke-virtual/range {p0 .. p6}, Lcom/zykj/blackboard/core/edit/PageControl;->i0(Ljava/io/File;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Ljava/lang/Integer;Ljava/lang/Integer;Z)Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public static synthetic l0(Lcom/zykj/blackboard/core/edit/PageControl;Ljava/lang/String;Ljava/lang/String;FFLandroid/graphics/Matrix;ZILjava/lang/Object;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;
    .locals 7

    .line 1
    and-int/lit8 p7, p7, 0x20

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    const/4 p6, 0x0

    .line 6
    :cond_0
    move-object v0, p0

    .line 7
    move-object v1, p1

    .line 8
    move-object v2, p2

    .line 9
    move v3, p3

    .line 10
    move v4, p4

    .line 11
    move-object v5, p5

    .line 12
    move v6, p6

    .line 13
    invoke-virtual/range {v0 .. v6}, Lcom/zykj/blackboard/core/edit/PageControl;->k0(Ljava/lang/String;Ljava/lang/String;FFLandroid/graphics/Matrix;Z)Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method


# virtual methods
# RE I/O 解码本地图片（BitmapFactory.decodeFile）。
.method public A(Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;
    .locals 13

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/PageControl;->y()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->N()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getMaxImageSize()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-ge v0, v1, :cond_3

    .line 23
    .line 24
    invoke-static {p0, p1}, Ln4/j;->i(Lcom/zykj/blackboard/core/edit/PageControl;Ljava/lang/String;)Ljava/io/File;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const/4 v1, 0x0

    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    return-object v1

    .line 32
    :cond_0
    sget-object v2, Lcom/zykj/blackboard/utils/FileValidateUtils;->a:Lcom/zykj/blackboard/utils/FileValidateUtils;

    .line 33
    .line 34
    const/4 v3, 0x2

    .line 35
    invoke-static {v2, v0, v1, v3, v1}, Lcom/zykj/blackboard/utils/FileValidateUtils;->b(Lcom/zykj/blackboard/utils/FileValidateUtils;Ljava/io/File;Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;ILjava/lang/Object;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    if-nez v6, :cond_1

    .line 40
    .line 41
    return-object v1

    .line 42
    :cond_1
    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    .line 43
    .line 44
    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 45
    .line 46
    .line 47
    const/4 v3, 0x1

    .line 48
    iput-boolean v3, v2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 49
    .line 50
    invoke-static {p1, v2}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 51
    .line 52
    .line 53
    iget p1, v2, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 54
    .line 55
    int-to-float v7, p1

    .line 56
    iget p1, v2, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 57
    .line 58
    int-to-float v8, p1

    .line 59
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->O()Lk4/b;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p1}, Lk4/b;->n()Lq4/c;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    if-nez p1, :cond_2

    .line 68
    .line 69
    return-object v1

    .line 70
    :cond_2
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    const-string p1, "newFile.name"

    .line 75
    .line 76
    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v7, v8}, Lcom/zykj/blackboard/core/edit/PageControl;->m0(FF)Landroid/graphics/Matrix;

    .line 80
    .line 81
    .line 82
    move-result-object v9

    .line 83
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->Q()Lj4/a;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {p1}, Lj4/a;->d()Landroid/graphics/Matrix;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {v9, p1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 92
    .line 93
    .line 94
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 95
    .line 96
    const/16 v11, 0x20

    .line 97
    .line 98
    const/4 v12, 0x0

    .line 99
    const/4 v10, 0x0

    .line 100
    move-object v4, p0

    .line 101
    invoke-static/range {v4 .. v12}, Lcom/zykj/blackboard/core/edit/PageControl;->l0(Lcom/zykj/blackboard/core/edit/PageControl;Ljava/lang/String;Ljava/lang/String;FFLandroid/graphics/Matrix;ZILjava/lang/Object;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->c0()V

    .line 106
    .line 107
    .line 108
    return-object p1

    .line 109
    :cond_3
    new-instance p1, Lcom/zykj/blackboard/utils/OutOfMaxImageCountException;

    .line 110
    .line 111
    invoke-direct {p1}, Lcom/zykj/blackboard/utils/OutOfMaxImageCountException;-><init>()V

    .line 112
    .line 113
    .line 114
    throw p1
.end method

.method public B(Lc5/b;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->V()Lx4/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lx4/c;->b()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->f0(Lc5/b;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public C(Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZZ)Lcom/zykj/blackboard/core/graph/group/ImageGraph;
    .locals 9

    .line 1
    const-string v0, "bitmap"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "filename"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "position"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "scaleType"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/PageControl;->y()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->N()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getMaxImageSize()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-ge v0, v1, :cond_1

    .line 38
    .line 39
    invoke-static {p0, p1, p6, p2}, Ln4/j;->g(Lcom/zykj/blackboard/core/edit/PageControl;Landroid/graphics/Bitmap;ZLjava/lang/String;)Ljava/io/File;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    if-nez v3, :cond_0

    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    return-object p1

    .line 47
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    move-object v2, p0

    .line 64
    move-object v4, p3

    .line 65
    move-object v5, p4

    .line 66
    move v8, p5

    .line 67
    invoke-virtual/range {v2 .. v8}, Lcom/zykj/blackboard/core/edit/PageControl;->i0(Ljava/io/File;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Ljava/lang/Integer;Ljava/lang/Integer;Z)Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    return-object p1

    .line 72
    :cond_1
    new-instance p1, Lcom/zykj/blackboard/utils/OutOfMaxImageCountException;

    .line 73
    .line 74
    invoke-direct {p1}, Lcom/zykj/blackboard/utils/OutOfMaxImageCountException;-><init>()V

    .line 75
    .line 76
    .line 77
    throw p1
.end method

.method public D(Lc5/f;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->L()Lg4/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lg4/a;->z(Lc5/f;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public E(Ljava/util/List;)V
    .locals 2

    .line 1
    const-string v0, "graphIdList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->N()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v1, Lcom/zykj/board/EzyModeEnum$ModeEnum;->k:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/bean/BoardConfig;->setMode(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->L()Lg4/a;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Lg4/a;->s()Lg4/c;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectAction"

    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    check-cast v0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->V(Ljava/util/List;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public a(Landroid/view/MotionEvent;)V
    .locals 1

    .line 1
    const-string v0, "motionEvent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->L()Lg4/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lg4/a;->w(Landroid/view/MotionEvent;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public areaMoveEnd(Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->L()Lg4/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lg4/a;->s()Lg4/c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, Lcom/zykj/blackboard/core/action/b;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Lcom/zykj/blackboard/core/action/b;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, Lcom/zykj/blackboard/core/action/b;->m(Ljava/lang/Float;Ljava/lang/Float;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public areaMoveStart()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->L()Lg4/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lg4/a;->s()Lg4/c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, Lcom/zykj/blackboard/core/action/b;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Lcom/zykj/blackboard/core/action/b;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/b;->n()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public areaMoving(Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->L()Lg4/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lg4/a;->s()Lg4/c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, Lcom/zykj/blackboard/core/action/b;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Lcom/zykj/blackboard/core/action/b;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, Lcom/zykj/blackboard/core/action/b;->o(Ljava/lang/Float;Ljava/lang/Float;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public c(Landroid/graphics/Bitmap;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;
    .locals 9

    .line 1
    const-string v0, "bitmap"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/PageControl;->y()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->N()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getMaxImageSize()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-ge v0, v1, :cond_3

    .line 23
    .line 24
    const/4 v6, 0x4

    .line 25
    const/4 v7, 0x0

    .line 26
    const/4 v4, 0x0

    .line 27
    const/4 v5, 0x0

    .line 28
    move-object v2, p0

    .line 29
    move-object v3, p1

    .line 30
    invoke-static/range {v2 .. v7}, Ln4/j;->h(Lcom/zykj/blackboard/core/edit/PageControl;Landroid/graphics/Bitmap;ZLjava/lang/String;ILjava/lang/Object;)Ljava/io/File;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    move-object v0, v2

    .line 35
    const/4 v1, 0x0

    .line 36
    if-nez p1, :cond_0

    .line 37
    .line 38
    return-object v1

    .line 39
    :cond_0
    sget-object v2, Lcom/zykj/blackboard/utils/FileValidateUtils;->a:Lcom/zykj/blackboard/utils/FileValidateUtils;

    .line 40
    .line 41
    const/4 v4, 0x2

    .line 42
    invoke-static {v2, p1, v1, v4, v1}, Lcom/zykj/blackboard/utils/FileValidateUtils;->b(Lcom/zykj/blackboard/utils/FileValidateUtils;Ljava/io/File;Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;ILjava/lang/Object;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    if-nez v2, :cond_1

    .line 47
    .line 48
    return-object v1

    .line 49
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->O()Lk4/b;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-virtual {v4}, Lk4/b;->n()Lq4/c;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    if-nez v4, :cond_2

    .line 58
    .line 59
    return-object v1

    .line 60
    :cond_2
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    const-string p1, "newFile.name"

    .line 65
    .line 66
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    int-to-float p1, p1

    .line 74
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    int-to-float v4, v4

    .line 79
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    int-to-float v5, v5

    .line 84
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    int-to-float v3, v3

    .line 89
    invoke-virtual {p0, v5, v3}, Lcom/zykj/blackboard/core/edit/PageControl;->m0(FF)Landroid/graphics/Matrix;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->Q()Lj4/a;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {v3}, Lj4/a;->d()Landroid/graphics/Matrix;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-virtual {v5, v3}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 102
    .line 103
    .line 104
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 105
    .line 106
    const/16 v7, 0x20

    .line 107
    .line 108
    const/4 v8, 0x0

    .line 109
    const/4 v6, 0x0

    .line 110
    move v3, p1

    .line 111
    invoke-static/range {v0 .. v8}, Lcom/zykj/blackboard/core/edit/PageControl;->l0(Lcom/zykj/blackboard/core/edit/PageControl;Ljava/lang/String;Ljava/lang/String;FFLandroid/graphics/Matrix;ZILjava/lang/Object;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->c0()V

    .line 116
    .line 117
    .line 118
    return-object p1

    .line 119
    :cond_3
    new-instance p1, Lcom/zykj/blackboard/utils/OutOfMaxImageCountException;

    .line 120
    .line 121
    invoke-direct {p1}, Lcom/zykj/blackboard/utils/OutOfMaxImageCountException;-><init>()V

    .line 122
    .line 123
    .line 124
    throw p1
.end method

.method public d(Lc5/c;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->L()Lg4/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lg4/a;->t()Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public e()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/PageControl;->w()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->M()Ln4/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Lcom/zykj/blackboard/core/edit/PageControl$turnOnMicro$1;

    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/zykj/blackboard/core/edit/PageControl$turnOnMicro$1;-><init>(Lcom/zykj/blackboard/core/edit/PageControl;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ln4/a;->d(Lkotlin/jvm/functions/Function1;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public f(Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Z)Lcom/zykj/blackboard/core/graph/group/ImageGraph;
    .locals 11

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "position"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "scaleType"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/PageControl;->y()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->N()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getMaxImageSize()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-ge v0, v1, :cond_1

    .line 33
    .line 34
    invoke-static {p0, p1}, Ln4/j;->i(Lcom/zykj/blackboard/core/edit/PageControl;Ljava/lang/String;)Ljava/io/File;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    if-nez v3, :cond_0

    .line 39
    .line 40
    const/4 p1, 0x0

    .line 41
    return-object p1

    .line 42
    :cond_0
    const/16 v9, 0x18

    .line 43
    .line 44
    const/4 v10, 0x0

    .line 45
    const/4 v6, 0x0

    .line 46
    const/4 v7, 0x0

    .line 47
    move-object v2, p0

    .line 48
    move-object v4, p2

    .line 49
    move-object v5, p3

    .line 50
    move v8, p4

    .line 51
    invoke-static/range {v2 .. v10}, Lcom/zykj/blackboard/core/edit/PageControl;->j0(Lcom/zykj/blackboard/core/edit/PageControl;Ljava/io/File;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Ljava/lang/Integer;Ljava/lang/Integer;ZILjava/lang/Object;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    return-object p1

    .line 56
    :cond_1
    new-instance p1, Lcom/zykj/blackboard/utils/OutOfMaxImageCountException;

    .line 57
    .line 58
    invoke-direct {p1}, Lcom/zykj/blackboard/utils/OutOfMaxImageCountException;-><init>()V

    .line 59
    .line 60
    .line 61
    throw p1
.end method

.method public g(Lc5/g;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->M()Ln4/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Ln4/a;->c(Lc5/g;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public getBackgroundColor()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->O()Lk4/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lk4/b;->getBackgroundColor()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public getMoveHorizontalProgress()F
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->L()Lg4/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lg4/a;->s()Lg4/c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, Lcom/zykj/blackboard/core/action/b;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Lcom/zykj/blackboard/core/action/b;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/b;->u()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    return v0
.end method

.method public getMoveVerticalProgress()F
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->L()Lg4/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lg4/a;->s()Lg4/c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "MoveProgress"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    instance-of v1, v0, Lcom/zykj/blackboard/core/action/b;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    check-cast v0, Lcom/zykj/blackboard/core/action/b;

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/b;->w()F

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    return v0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    return v0
.end method

.method public h(Lc5/j;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->P()Ln4/f;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Ln4/f;->a(Lc5/j;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public i(Lq4/c;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->O()Lk4/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lk4/b;->n()Lq4/c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    invoke-interface {v0}, Lq4/c;->f()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    new-instance v1, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    move-object v3, v2

    .line 37
    check-cast v3, Lq4/c;

    .line 38
    .line 39
    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-nez v3, :cond_0

    .line 44
    .line 45
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->L()Lg4/a;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 54
    .line 55
    .line 56
    move-result-wide v2

    .line 57
    invoke-virtual {p1, v1, v2, v3}, Lg4/a;->n(Ljava/util/List;J)V

    .line 58
    .line 59
    .line 60
    sget-object p1, Le5/h;->a:Le5/h;

    .line 61
    .line 62
    sget-object v0, Lcom/zykj/blackboard/utils/EventKey;->b:Lcom/zykj/blackboard/utils/EventKey;

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Le5/h;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 65
    .line 66
    .line 67
    sget-object v0, Lcom/zykj/blackboard/utils/EventKey;->a:Lcom/zykj/blackboard/utils/EventKey;

    .line 68
    .line 69
    invoke-virtual {p1, v0}, Le5/h;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->O()Lk4/b;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-static {v1}, Lkotlin/jvm/internal/TypeIntrinsics;->asMutableList(Ljava/lang/Object;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {p1, v0}, Lk4/b;->q(Ljava/util/List;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->c0()V

    .line 84
    .line 85
    .line 86
    :cond_2
    return-void
.end method

.method public final i0(Ljava/io/File;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Ljava/lang/Integer;Ljava/lang/Integer;Z)Lcom/zykj/blackboard/core/graph/group/ImageGraph;
    .locals 14

    .line 1
    sget-object v0, Lcom/zykj/blackboard/utils/FileValidateUtils;->a:Lcom/zykj/blackboard/utils/FileValidateUtils;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-static {v0, p1, v2, v1, v2}, Lcom/zykj/blackboard/utils/FileValidateUtils;->b(Lcom/zykj/blackboard/utils/FileValidateUtils;Ljava/io/File;Lcom/zykj/blackboard/utils/FileValidateUtils$TypeEnum;ILjava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v5

    .line 9
    if-nez v5, :cond_0

    .line 10
    .line 11
    return-object v2

    .line 12
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "localFile.absolutePath"

    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    move-object/from16 v1, p3

    .line 22
    .line 23
    move-object/from16 v2, p4

    .line 24
    .line 25
    move-object/from16 v4, p5

    .line 26
    .line 27
    invoke-static {p0, v0, v1, v2, v4}, Ln4/j;->f(Lcom/zykj/blackboard/core/edit/PageControl;Ljava/lang/String;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Ljava/lang/Integer;Ljava/lang/Integer;)[Ljava/lang/Float;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    const-string v1, "localFile.name"

    .line 36
    .line 37
    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    aget-object v2, v0, v1

    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    const/4 v3, 0x1

    .line 48
    aget-object v7, v0, v3

    .line 49
    .line 50
    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    .line 51
    .line 52
    .line 53
    move-result v13

    .line 54
    aget-object v1, v0, v1

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    aget-object v0, v0, v3

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    const/16 v11, 0x8

    .line 67
    .line 68
    const/4 v12, 0x0

    .line 69
    const/4 v10, 0x0

    .line 70
    move-object v6, p0

    .line 71
    move-object/from16 v9, p2

    .line 72
    .line 73
    invoke-static/range {v6 .. v12}, Ln4/j;->e(Lcom/zykj/blackboard/core/edit/PageControl;FFLcom/zykj/board/EzyPositionEnum$PositionEnum;IILjava/lang/Object;)Landroid/graphics/Matrix;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    move/from16 v9, p6

    .line 78
    .line 79
    move-object v3, v6

    .line 80
    move v7, v13

    .line 81
    move v6, v2

    .line 82
    invoke-virtual/range {v3 .. v9}, Lcom/zykj/blackboard/core/edit/PageControl;->k0(Ljava/lang/String;Ljava/lang/String;FFLandroid/graphics/Matrix;Z)Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->c0()V

    .line 87
    .line 88
    .line 89
    return-object v0
.end method

.method public j(ILcom/zykj/blackboard/bean/BackgroundLineConfig;)V
    .locals 9

    .line 1
    const-string v0, "backgroundLineConfig"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->O()Lk4/b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lk4/b;->getBackgroundColor()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->O()Lk4/b;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Lk4/b;->J()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    if-ne v0, p1, :cond_0

    .line 23
    .line 24
    invoke-static {v5, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    :cond_0
    sget-object v0, Le5/h;->a:Le5/h;

    .line 31
    .line 32
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->d:Lcom/zykj/blackboard/utils/EventKey;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Le5/h;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 35
    .line 36
    .line 37
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->e:Lcom/zykj/blackboard/utils/EventKey;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Le5/h;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->O()Lk4/b;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0, p1}, Lk4/b;->c(I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->O()Lk4/b;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0, p2}, Lk4/b;->t(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->O()Lk4/b;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Lk4/b;->e()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->V()Lx4/c;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v0}, Lx4/c;->b()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 72
    .line 73
    .line 74
    move-result-wide v7

    .line 75
    move v4, p1

    .line 76
    move v3, p1

    .line 77
    move-object v6, p2

    .line 78
    invoke-virtual/range {v2 .. v8}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->H(IILcom/zykj/blackboard/bean/BackgroundLineConfig;Lcom/zykj/blackboard/bean/BackgroundLineConfig;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->S()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->e()Lio/objectbox/relation/ToOne;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {p1}, Lio/objectbox/relation/ToOne;->j()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;

    .line 94
    .line 95
    if-eqz p1, :cond_2

    .line 96
    .line 97
    invoke-virtual {p1, v3}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->w(I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->j()Lio/objectbox/relation/ToOne;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    invoke-static {v6}, Le5/f;->d(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->f()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p2, v0}, Lio/objectbox/relation/ToOne;->t(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->q()V

    .line 115
    .line 116
    .line 117
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->c0()V

    .line 118
    .line 119
    .line 120
    return-void
.end method

.method public k(Lc5/b;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->V()Lx4/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lx4/c;->b()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->Z(Lc5/b;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final k0(Ljava/lang/String;Ljava/lang/String;FFLandroid/graphics/Matrix;Z)Lcom/zykj/blackboard/core/graph/group/ImageGraph;
    .locals 11

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->O()Lk4/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lk4/b;->b()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    if-eqz v2, :cond_3

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->V()Lx4/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lx4/c;->b()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    sget-object v4, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->d:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 20
    .line 21
    float-to-int v6, p3

    .line 22
    float-to-int v7, p4

    .line 23
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 24
    .line 25
    .line 26
    move-result-wide v8

    .line 27
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->N()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    invoke-virtual {p3}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    invoke-virtual {p3}, Lcom/zykj/blackboard/bean/BoardConfig;->isImageBackground()Z

    .line 36
    .line 37
    .line 38
    move-result v10

    .line 39
    move-object v3, p1

    .line 40
    move-object v5, p2

    .line 41
    invoke-virtual/range {v1 .. v10}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->D(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/lang/String;IIJZ)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    if-eqz p2, :cond_3

    .line 46
    .line 47
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->b()[B

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-static {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->M([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    sget-object p3, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->a:Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;

    .line 56
    .line 57
    const-string p4, "graphData"

    .line 58
    .line 59
    invoke-static {p2, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->W()Lv4/c;

    .line 63
    .line 64
    .line 65
    move-result-object p4

    .line 66
    invoke-virtual {p3, p2, p4}, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->f(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;Lv4/d;)Lq4/a;

    .line 67
    .line 68
    .line 69
    move-result-object p3

    .line 70
    if-eqz p3, :cond_3

    .line 71
    .line 72
    new-instance p4, Landroid/graphics/Matrix;

    .line 73
    .line 74
    move-object/from16 v0, p5

    .line 75
    .line 76
    invoke-direct {p4, v0}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 77
    .line 78
    .line 79
    if-nez p6, :cond_0

    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->Q()Lj4/a;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0}, Lj4/a;->b()Landroid/graphics/Matrix;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-static {v0}, Le5/m;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {p4, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 94
    .line 95
    .line 96
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->L()Lg4/a;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    filled-new-array {p3}, [Lq4/a;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->arrayListOf([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 109
    .line 110
    .line 111
    move-result-wide v4

    .line 112
    invoke-static {p4, v4, v5}, Le5/m;->c(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    filled-new-array {v2}, [Lcom/zykj/board/EzyMatrix$Matrix;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {v0, v1, v2}, Lg4/a;->c(Ljava/util/List;Ljava/util/List;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p3, p4}, Lq4/a;->e(Landroid/graphics/Matrix;)V

    .line 128
    .line 129
    .line 130
    sget-object p4, Le5/h;->a:Le5/h;

    .line 131
    .line 132
    sget-object v0, Lcom/zykj/blackboard/utils/EventKey;->b:Lcom/zykj/blackboard/utils/EventKey;

    .line 133
    .line 134
    invoke-virtual {p4, v0}, Le5/h;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 135
    .line 136
    .line 137
    sget-object v0, Lcom/zykj/blackboard/utils/EventKey;->a:Lcom/zykj/blackboard/utils/EventKey;

    .line 138
    .line 139
    invoke-virtual {p4, v0}, Le5/h;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 140
    .line 141
    .line 142
    sget-object v0, Lcom/zykj/blackboard/utils/EventKey;->d:Lcom/zykj/blackboard/utils/EventKey;

    .line 143
    .line 144
    invoke-virtual {p4, v0}, Le5/h;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->N()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 148
    .line 149
    .line 150
    move-result-object p4

    .line 151
    invoke-virtual {p4}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 152
    .line 153
    .line 154
    move-result-object p4

    .line 155
    invoke-virtual {p4}, Lcom/zykj/blackboard/bean/BoardConfig;->isImageBackground()Z

    .line 156
    .line 157
    .line 158
    move-result p4

    .line 159
    const-string v0, "null cannot be cast to non-null type com.zykj.blackboard.core.graph.group.ImageGraph"

    .line 160
    .line 161
    if-eqz p4, :cond_1

    .line 162
    .line 163
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->O()Lk4/b;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    move-object p4, p3

    .line 171
    check-cast p4, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 172
    .line 173
    invoke-virtual {p2, p4}, Lk4/b;->a(Lcom/zykj/blackboard/core/graph/group/ImageGraph;)V

    .line 174
    .line 175
    .line 176
    goto :goto_0

    .line 177
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->O()Lk4/b;

    .line 178
    .line 179
    .line 180
    move-result-object p4

    .line 181
    invoke-virtual {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->F()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    invoke-virtual {p4, p2, p3}, Lk4/b;->y(Ljava/lang/String;Lq4/c;)V

    .line 186
    .line 187
    .line 188
    :goto_0
    new-instance p2, Ljava/io/File;

    .line 189
    .line 190
    sget-object p4, Lx4/c;->d:Lx4/c$a;

    .line 191
    .line 192
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->T()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    sget-object v2, Lcom/zykj/blackboard/enums/DocumentType;->a:Lcom/zykj/blackboard/enums/DocumentType;

    .line 197
    .line 198
    invoke-virtual {p4, v1, v2}, Lx4/c$a;->a(Ljava/lang/String;Lcom/zykj/blackboard/enums/DocumentType;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p4

    .line 202
    invoke-direct {p2, p4, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/PageControl;->w()Z

    .line 210
    .line 211
    .line 212
    move-result p2

    .line 213
    if-eqz p2, :cond_2

    .line 214
    .line 215
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->U()Ljava/util/ArrayList;

    .line 216
    .line 217
    .line 218
    move-result-object p2

    .line 219
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    goto :goto_1

    .line 223
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->R()Ljava/util/ArrayList;

    .line 224
    .line 225
    .line 226
    move-result-object p2

    .line 227
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    :goto_1
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    check-cast p3, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 234
    .line 235
    return-object p3

    .line 236
    :cond_3
    const/4 p1, 0x0

    .line 237
    return-object p1
.end method

.method public l(IIIIZZZLq4/c;)Landroid/graphics/Bitmap;
    .locals 9

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->O()Lk4/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    move v1, p1

    .line 6
    move v2, p2

    .line 7
    move v3, p3

    .line 8
    move v4, p4

    .line 9
    move v5, p5

    .line 10
    move v6, p6

    .line 11
    move/from16 v7, p7

    .line 12
    .line 13
    move-object/from16 v8, p8

    .line 14
    .line 15
    invoke-virtual/range {v0 .. v8}, Lk4/b;->L(IIIIZZZLq4/c;)Landroid/graphics/Bitmap;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method

.method public m()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->O()Lk4/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lk4/b;->n()Lq4/c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {v0}, Lq4/c;->f()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v2, 0x1

    .line 23
    xor-int/2addr v0, v2

    .line 24
    if-ne v0, v2, :cond_0

    .line 25
    .line 26
    return v2

    .line 27
    :cond_0
    return v1
.end method

.method public final m0(FF)Landroid/graphics/Matrix;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->N()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getWidth()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    int-to-float v0, v0

    .line 14
    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    div-float v0, v2, p1

    .line 19
    .line 20
    mul-float/2addr p2, v2

    .line 21
    div-float v3, p2, p1

    .line 22
    .line 23
    new-instance p1, Landroid/graphics/Matrix;

    .line 24
    .line 25
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0, v0}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 29
    .line 30
    .line 31
    sget-object v4, Lcom/zykj/board/EzyPositionEnum$PositionEnum;->c:Lcom/zykj/board/EzyPositionEnum$PositionEnum;

    .line 32
    .line 33
    const/16 v6, 0x8

    .line 34
    .line 35
    const/4 v7, 0x0

    .line 36
    const/4 v5, 0x0

    .line 37
    move-object v1, p0

    .line 38
    invoke-static/range {v1 .. v7}, Ln4/j;->e(Lcom/zykj/blackboard/core/edit/PageControl;FFLcom/zykj/board/EzyPositionEnum$PositionEnum;IILjava/lang/Object;)Landroid/graphics/Matrix;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->O()Lk4/b;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-virtual {p2}, Lk4/b;->n()Lq4/c;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    const/4 v0, 0x0

    .line 54
    if-eqz p2, :cond_1

    .line 55
    .line 56
    invoke-interface {p2}, Lq4/c;->f()Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    if-eqz p2, :cond_1

    .line 61
    .line 62
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    move v1, v0

    .line 67
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_2

    .line 72
    .line 73
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, Lq4/c;

    .line 78
    .line 79
    instance-of v3, v2, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 80
    .line 81
    if-eqz v3, :cond_0

    .line 82
    .line 83
    invoke-interface {v2}, Lq4/c;->d()Landroid/graphics/RectF;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    .line 88
    .line 89
    invoke-static {v2, v1}, Ljava/lang/Math;->max(FF)F

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    goto :goto_0

    .line 94
    :cond_1
    move v1, v0

    .line 95
    :cond_2
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 96
    .line 97
    .line 98
    return-object p1
.end method

.method public n()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->M()Ln4/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ln4/a;->b()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public o()F
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->Q()Lj4/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lj4/a;->d()Landroid/graphics/Matrix;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Le5/m;->a(Landroid/graphics/Matrix;)F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public p(Lc5/i;)V
    .locals 1

    .line 1
    const-string v0, "recordListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->X()Lx4/e;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lx4/e;->f(Lc5/i;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public q()Z
    .locals 5

    .line 1
    sget-object v0, Le5/h;->a:Le5/h;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->a:Lcom/zykj/blackboard/utils/EventKey;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Le5/h;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->b:Lcom/zykj/blackboard/utils/EventKey;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Le5/h;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->P()Ln4/f;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ln4/f;->d()Ln4/g;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->V()Lx4/c;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Lx4/c;->b()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0}, Ln4/g;->c()Lq4/a;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v0}, Ln4/g;->a()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 40
    .line 41
    .line 42
    move-result-wide v3

    .line 43
    invoke-virtual {v1, v2, v0, v3, v4}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->X(Lq4/a;IJ)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    return v0

    .line 48
    :cond_0
    const/4 v0, 0x0

    .line 49
    return v0
.end method

.method public r(Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;I)Lr4/d;
    .locals 10

    .line 1
    const-string v0, "content"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "position"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Paint;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->N()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getAddTextOriginalTextColor()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 29
    .line 30
    .line 31
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->N()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getAddTextOriginalTextSize()F

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 49
    .line 50
    .line 51
    const/4 v1, 0x1

    .line 52
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->N()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getAddTextRectF()Landroid/graphics/RectF;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->N()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getAddTextRectF()Landroid/graphics/RectF;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    iget v2, v2, Landroid/graphics/Paint$FontMetrics;->bottom:F

    .line 95
    .line 96
    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    iget v3, v3, Landroid/graphics/Paint$FontMetrics;->top:F

    .line 101
    .line 102
    sub-float/2addr v2, v3

    .line 103
    sget-object v3, Le5/s;->a:Le5/s;

    .line 104
    .line 105
    invoke-virtual {v3, p1, v0, v4}, Le5/s;->a(Ljava/lang/String;Landroid/graphics/Paint;F)Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    int-to-float v3, v3

    .line 114
    mul-float/2addr v2, v3

    .line 115
    cmpl-float v3, v2, v1

    .line 116
    .line 117
    if-lez v3, :cond_0

    .line 118
    .line 119
    move v5, v2

    .line 120
    goto :goto_0

    .line 121
    :cond_0
    move v5, v1

    .line 122
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->O()Lk4/b;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-virtual {v1}, Lk4/b;->b()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    const/4 v1, 0x0

    .line 131
    if-nez v3, :cond_1

    .line 132
    .line 133
    return-object v1

    .line 134
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->V()Lx4/c;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-virtual {v2}, Lx4/c;->b()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    const/high16 v6, 0x3f800000    # 1.0f

    .line 143
    .line 144
    const/4 v7, 0x0

    .line 145
    invoke-static {v0, v6, v7}, Le5/l;->a(Landroid/graphics/Paint;FF)Lcom/zykj/board/EzyPaint$Paint;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 150
    .line 151
    .line 152
    move-result-wide v8

    .line 153
    move-object v7, p1

    .line 154
    invoke-virtual/range {v2 .. v9}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->N(Ljava/lang/String;FFLcom/zykj/board/EzyPaint$Paint;Ljava/lang/String;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    if-nez p1, :cond_2

    .line 159
    .line 160
    return-object v1

    .line 161
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->b()[B

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->M([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    sget-object v0, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->a:Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;

    .line 170
    .line 171
    const-string v2, "graphData"

    .line 172
    .line 173
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->W()Lv4/c;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    invoke-virtual {v0, p1, v2}, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->f(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;Lv4/d;)Lq4/a;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    if-nez p1, :cond_3

    .line 185
    .line 186
    return-object v1

    .line 187
    :cond_3
    new-instance v0, Landroid/graphics/Matrix;

    .line 188
    .line 189
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 190
    .line 191
    .line 192
    invoke-static {p0, v4, v5, p2, p3}, Ln4/j;->d(Lcom/zykj/blackboard/core/edit/PageControl;FFLcom/zykj/board/EzyPositionEnum$PositionEnum;I)Landroid/graphics/Matrix;

    .line 193
    .line 194
    .line 195
    move-result-object p2

    .line 196
    invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->Q()Lj4/a;

    .line 200
    .line 201
    .line 202
    move-result-object p2

    .line 203
    invoke-virtual {p2}, Lj4/a;->b()Landroid/graphics/Matrix;

    .line 204
    .line 205
    .line 206
    move-result-object p2

    .line 207
    invoke-static {p2}, Le5/m;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 208
    .line 209
    .line 210
    move-result-object p2

    .line 211
    invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 212
    .line 213
    .line 214
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->L()Lg4/a;

    .line 215
    .line 216
    .line 217
    move-result-object p2

    .line 218
    filled-new-array {p1}, [Lq4/a;

    .line 219
    .line 220
    .line 221
    move-result-object p3

    .line 222
    invoke-static {p3}, Lkotlin/collections/CollectionsKt;->arrayListOf([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 223
    .line 224
    .line 225
    move-result-object p3

    .line 226
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 227
    .line 228
    .line 229
    move-result-wide v1

    .line 230
    invoke-static {v0, v1, v2}, Le5/m;->c(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    filled-new-array {v1}, [Lcom/zykj/board/EzyMatrix$Matrix;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    invoke-virtual {p2, p3, v1}, Lg4/a;->c(Ljava/util/List;Ljava/util/List;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p1, v0}, Lq4/a;->e(Landroid/graphics/Matrix;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->O()Lk4/b;

    .line 249
    .line 250
    .line 251
    move-result-object p2

    .line 252
    invoke-virtual {p2, v3, p1}, Lk4/b;->y(Ljava/lang/String;Lq4/c;)V

    .line 253
    .line 254
    .line 255
    check-cast p1, Lr4/d;

    .line 256
    .line 257
    return-object p1
.end method

.method public s(FFF)V
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->Q()Lj4/a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lj4/a;->d()Landroid/graphics/Matrix;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Le5/m;->a(Landroid/graphics/Matrix;)F

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    new-instance v2, Landroid/graphics/Matrix;

    .line 19
    .line 20
    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v1, v1, p1, p2}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 24
    .line 25
    .line 26
    invoke-static {v2}, Le5/m;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p3, p3, p1, p2}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->Q()Lj4/a;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Lj4/a;->d()Landroid/graphics/Matrix;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->Q()Lj4/a;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-virtual {p2, v0}, Lj4/a;->j(Landroid/graphics/Matrix;)V

    .line 49
    .line 50
    .line 51
    const-wide/16 p2, 0x0

    .line 52
    .line 53
    invoke-static {p1, p2, p3}, Le5/m;->c(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->Q()Lj4/a;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, Lj4/a;->d()Landroid/graphics/Matrix;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {v0, p2, p3}, Le5/m;->c(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-virtual {p0, p1, p2}, Lcom/zykj/blackboard/core/edit/BasePageControl;->d0(Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;)V

    .line 70
    .line 71
    .line 72
    sget-object p1, Le5/h;->a:Le5/h;

    .line 73
    .line 74
    sget-object p2, Lcom/zykj/blackboard/utils/EventKey;->b:Lcom/zykj/blackboard/utils/EventKey;

    .line 75
    .line 76
    invoke-virtual {p1, p2}, Le5/h;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 77
    .line 78
    .line 79
    sget-object p2, Lcom/zykj/blackboard/utils/EventKey;->a:Lcom/zykj/blackboard/utils/EventKey;

    .line 80
    .line 81
    invoke-virtual {p1, p2}, Le5/h;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 82
    .line 83
    .line 84
    sget-object p2, Lcom/zykj/blackboard/utils/EventKey;->d:Lcom/zykj/blackboard/utils/EventKey;

    .line 85
    .line 86
    invoke-virtual {p1, p2}, Le5/h;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->O()Lk4/b;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p1}, Lk4/b;->e()V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->O()Lk4/b;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {p1}, Lk4/b;->V()V

    .line 101
    .line 102
    .line 103
    return-void
.end method

.method public setAreaMoveListener(Lc5/d;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->L()Lg4/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lg4/a;->x(Lc5/d;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public stopRecord()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/PageControl;->n()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/PageControl;->u()V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->V()Lx4/c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lx4/c;->b()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->X()Lx4/e;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    const/4 v5, 0x2

    .line 27
    const/4 v6, 0x0

    .line 28
    const/4 v4, 0x0

    .line 29
    invoke-static/range {v1 .. v6}, Lx4/b$a;->a(Lx4/b;JZILjava/lang/Object;)J

    .line 30
    .line 31
    .line 32
    move-result-wide v1

    .line 33
    invoke-virtual {v0, v1, v2}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->d0(J)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->X()Lx4/e;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 41
    .line 42
    .line 43
    move-result-wide v1

    .line 44
    invoke-virtual {v0, v1, v2}, Lx4/e;->k(J)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public t(Z)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->X()Lx4/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-virtual {v0, v1, v2}, Lx4/e;->i(J)V

    .line 10
    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/PageControl;->e()V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->U()Ljava/util/ArrayList;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->R()Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->R()Ljava/util/ArrayList;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public u()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->M()Ln4/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/blackboard/core/edit/PageControl$turnOffMicro$1;

    .line 6
    .line 7
    invoke-direct {v1, p0}, Lcom/zykj/blackboard/core/edit/PageControl$turnOffMicro$1;-><init>(Lcom/zykj/blackboard/core/edit/PageControl;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ln4/a;->e(Lkotlin/jvm/functions/Function2;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public v(Lc5/e;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->L()Lg4/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lg4/a;->y(Lc5/e;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public w()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->X()Lx4/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lx4/e;->e()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public y()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->O()Lk4/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lk4/b;->K()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public z()Z
    .locals 5

    .line 1
    sget-object v0, Le5/h;->a:Le5/h;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->a:Lcom/zykj/blackboard/utils/EventKey;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Le5/h;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->b:Lcom/zykj/blackboard/utils/EventKey;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Le5/h;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->P()Ln4/f;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ln4/f;->b()Ln4/g;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->V()Lx4/c;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Lx4/c;->b()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0}, Ln4/g;->c()Lq4/a;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v0}, Ln4/g;->a()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 40
    .line 41
    .line 42
    move-result-wide v3

    .line 43
    invoke-virtual {v1, v2, v0, v3, v4}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->X(Lq4/a;IJ)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    return v0

    .line 48
    :cond_0
    const/4 v0, 0x0

    .line 49
    return v0
.end method
