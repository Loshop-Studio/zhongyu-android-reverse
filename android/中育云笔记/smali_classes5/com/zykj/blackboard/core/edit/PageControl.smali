# RE note 管理 Blackboard 页面编辑状态及页面快照。
.class public final Lcom/zykj/blackboard/core/edit/PageControl;
.super Lcom/zykj/blackboard/core/edit/BasePageControl;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/edit/BoardControl;Lw9/h;Lcom/zykj/blackboard/core/data/dao/PageEntity;)V
    .locals 1

    const-string v0, "boardControl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "renderLayer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/edit/BasePageControl;-><init>(Lcom/zykj/blackboard/core/edit/BoardControl;Lw9/h;Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/edit/BoardControl;Lw9/h;Lcom/zykj/blackboard/core/data/dao/PageEntity;ILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/edit/PageControl;-><init>(Lcom/zykj/blackboard/core/edit/BoardControl;Lw9/h;Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    return-void
.end method

.method public static synthetic k0(Lcom/zykj/blackboard/core/edit/PageControl;Ljava/io/File;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Ljava/lang/Integer;Ljava/lang/Integer;ZILjava/lang/Object;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;
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
    invoke-virtual/range {p0 .. p6}, Lcom/zykj/blackboard/core/edit/PageControl;->j0(Ljava/io/File;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Ljava/lang/Integer;Ljava/lang/Integer;Z)Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public static synthetic m0(Lcom/zykj/blackboard/core/edit/PageControl;Ljava/lang/String;Ljava/lang/String;FFLandroid/graphics/Matrix;ZILjava/lang/Object;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;
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
    invoke-virtual/range {v0 .. v6}, Lcom/zykj/blackboard/core/edit/PageControl;->l0(Ljava/lang/String;Ljava/lang/String;FFLandroid/graphics/Matrix;Z)Lcom/zykj/blackboard/core/graph/group/ImageGraph;

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
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/PageControl;->y()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->O()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lq9/b;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Lq9/b;->x()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-ge v0, v1, :cond_3

    .line 23
    .line 24
    invoke-static {p0, p1}, Ly9/o;->h(Lcom/zykj/blackboard/core/edit/PageControl;Ljava/lang/String;)Ljava/io/File;

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->P()Lv9/b;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p1}, Lv9/b;->n()Lba/c;

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
    invoke-static {v5, p1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v7, v8}, Lcom/zykj/blackboard/core/edit/PageControl;->n0(FF)Landroid/graphics/Matrix;

    .line 80
    .line 81
    .line 82
    move-result-object v9

    .line 83
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->R()Lu9/a;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {p1}, Lu9/a;->d()Landroid/graphics/Matrix;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {v9, p1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 92
    .line 93
    .line 94
    sget-object p1, Lqc/q;->a:Lqc/q;

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
    invoke-static/range {v4 .. v12}, Lcom/zykj/blackboard/core/edit/PageControl;->m0(Lcom/zykj/blackboard/core/edit/PageControl;Ljava/lang/String;Ljava/lang/String;FFLandroid/graphics/Matrix;ZILjava/lang/Object;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->d0()V

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

.method public B(Lma/b;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->W()Lia/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lia/c;->c()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->g0(Lma/b;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public C(Lma/e;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->M()Lr9/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lr9/a;->x(Lma/e;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public D(Lma/b;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->W()Lia/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lia/c;->c()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->a0(Lma/b;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public E(Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZZ)Lcom/zykj/blackboard/core/graph/group/ImageGraph;
    .locals 9

    .line 1
    const-string v0, "bitmap"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "filename"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "position"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "scaleType"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/PageControl;->y()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->O()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lq9/b;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Lq9/b;->x()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-ge v0, v1, :cond_1

    .line 38
    .line 39
    invoke-static {p0, p1, p6, p2}, Ly9/o;->g(Lcom/zykj/blackboard/core/edit/PageControl;Landroid/graphics/Bitmap;ZLjava/lang/String;)Ljava/io/File;

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
    invoke-virtual/range {v2 .. v8}, Lcom/zykj/blackboard/core/edit/PageControl;->j0(Ljava/io/File;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Ljava/lang/Integer;Ljava/lang/Integer;Z)Lcom/zykj/blackboard/core/graph/group/ImageGraph;

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

.method public F(Ljava/util/List;)V
    .locals 2

    .line 1
    const-string v0, "graphIdList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->O()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lq9/b;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v1, Lcom/zykj/board/EzyModeEnum$ModeEnum;->m:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lq9/b;->h0(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->M()Lr9/a;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Lr9/a;->r()Lr9/c;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectAction"

    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    check-cast v0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->U(Ljava/util/List;)V

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
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->M()Lr9/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lr9/a;->u(Landroid/view/MotionEvent;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public areaMoveEnd(Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->M()Lr9/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lr9/a;->r()Lr9/c;

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->M()Lr9/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lr9/a;->r()Lr9/c;

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->M()Lr9/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lr9/a;->r()Lr9/c;

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

.method public c()Ljava/util/List;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->P()Lv9/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lv9/b;->n()Lba/c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_5

    .line 10
    .line 11
    invoke-interface {v0}, Lba/c;->f()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_5

    .line 16
    .line 17
    check-cast v0, Ljava/lang/Iterable;

    .line 18
    .line 19
    new-instance v1, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    instance-of v3, v2, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 39
    .line 40
    if-eqz v3, :cond_0

    .line 41
    .line 42
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 47
    .line 48
    const/16 v2, 0xa

    .line 49
    .line 50
    invoke-static {v1, v2}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    const/4 v3, 0x0

    .line 62
    :goto_1
    if-ge v3, v2, :cond_4

    .line 63
    .line 64
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    add-int/lit8 v3, v3, 0x1

    .line 69
    .line 70
    check-cast v4, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 71
    .line 72
    invoke-virtual {v4}, Lca/a;->E()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    if-nez v5, :cond_2

    .line 77
    .line 78
    invoke-virtual {v4}, Lca/a;->G()V

    .line 79
    .line 80
    .line 81
    :cond_2
    invoke-virtual {v4}, Lca/a;->E()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    if-nez v4, :cond_3

    .line 86
    .line 87
    const-string v4, ""

    .line 88
    .line 89
    :cond_3
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_4
    return-object v0

    .line 94
    :cond_5
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    return-object v0
.end method

.method public d()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/PageControl;->u()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->N()Ly9/a;

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
    invoke-virtual {v0, v1}, Ly9/a;->d(Lhd/l;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public e(Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Z)Lcom/zykj/blackboard/core/graph/group/ImageGraph;
    .locals 11

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "position"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "scaleType"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/PageControl;->y()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->O()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lq9/b;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, Lq9/b;->x()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-ge v0, v1, :cond_1

    .line 33
    .line 34
    invoke-static {p0, p1}, Ly9/o;->h(Lcom/zykj/blackboard/core/edit/PageControl;Ljava/lang/String;)Ljava/io/File;

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
    invoke-static/range {v2 .. v10}, Lcom/zykj/blackboard/core/edit/PageControl;->k0(Lcom/zykj/blackboard/core/edit/PageControl;Ljava/io/File;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Ljava/lang/Integer;Ljava/lang/Integer;ZILjava/lang/Object;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;

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

.method public f()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->Q()Ly9/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ly9/k;->b()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public g(ILcom/zykj/blackboard/bean/BackgroundLineConfig;)V
    .locals 9

    .line 1
    const-string v0, "backgroundLineConfig"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->P()Lv9/b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lv9/b;->L()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->P()Lv9/b;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Lv9/b;->M()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    if-ne v0, p1, :cond_0

    .line 23
    .line 24
    invoke-static {v5, p2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    :cond_0
    sget-object v0, Lna/i;->a:Lna/i;

    .line 31
    .line 32
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->f:Lcom/zykj/blackboard/utils/EventKey;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lna/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 35
    .line 36
    .line 37
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->g:Lcom/zykj/blackboard/utils/EventKey;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lna/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->P()Lv9/b;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0, p1}, Lv9/b;->d(I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->P()Lv9/b;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0, p2}, Lv9/b;->s(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->P()Lv9/b;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Lv9/b;->g()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->W()Lia/c;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v0}, Lia/c;->c()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->T()Lcom/zykj/blackboard/core/data/dao/PageEntity;

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
    invoke-virtual {p1}, Lio/objectbox/relation/ToOne;->d()Ljava/lang/Object;

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
    invoke-static {v6}, Lna/g;->d(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->f()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p2, v0}, Lio/objectbox/relation/ToOne;->o(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->q()V

    .line 115
    .line 116
    .line 117
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->d0()V

    .line 118
    .line 119
    .line 120
    return-void
.end method

.method public getBackgroundColor()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->P()Lv9/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lv9/b;->L()I

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->M()Lr9/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lr9/a;->r()Lr9/c;

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->M()Lr9/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lr9/a;->r()Lr9/c;

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

.method public h(Lma/g;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->N()Ly9/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Ly9/a;->c(Lma/g;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public i()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->N()Ly9/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ly9/a;->b()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public j()F
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->R()Lu9/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lu9/a;->d()Landroid/graphics/Matrix;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lna/n;->a(Landroid/graphics/Matrix;)F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final j0(Ljava/io/File;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Ljava/lang/Integer;Ljava/lang/Integer;Z)Lcom/zykj/blackboard/core/graph/group/ImageGraph;
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
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-static {p0, v0, v1, v2, v4}, Ly9/o;->f(Lcom/zykj/blackboard/core/edit/PageControl;Ljava/lang/String;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Ljava/lang/Integer;Ljava/lang/Integer;)[Ljava/lang/Float;

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
    invoke-static {v4, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-static/range {v6 .. v12}, Ly9/o;->e(Lcom/zykj/blackboard/core/edit/PageControl;FFLcom/zykj/board/EzyPositionEnum$PositionEnum;IILjava/lang/Object;)Landroid/graphics/Matrix;

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
    invoke-virtual/range {v3 .. v9}, Lcom/zykj/blackboard/core/edit/PageControl;->l0(Ljava/lang/String;Ljava/lang/String;FFLandroid/graphics/Matrix;Z)Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->d0()V

    .line 87
    .line 88
    .line 89
    return-object v0
.end method

.method public k(Lma/i;)V
    .locals 1

    .line 1
    const-string v0, "recordListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->Y()Lia/e;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lia/e;->f(Lma/i;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public l(Lma/c;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->M()Lr9/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lr9/a;->s()Ljava/util/ArrayList;

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

.method public final l0(Ljava/lang/String;Ljava/lang/String;FFLandroid/graphics/Matrix;Z)Lcom/zykj/blackboard/core/graph/group/ImageGraph;
    .locals 11

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->P()Lv9/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lv9/b;->b()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    if-eqz v2, :cond_3

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->W()Lia/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lia/c;->c()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    sget-object v4, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->f:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->O()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    invoke-virtual {p3}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lq9/b;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    invoke-virtual {p3}, Lq9/b;->Q()Z

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
    sget-object p3, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->c:Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;

    .line 56
    .line 57
    const-string p4, "graphData"

    .line 58
    .line 59
    invoke-static {p2, p4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->X()Lga/c;

    .line 63
    .line 64
    .line 65
    move-result-object p4

    .line 66
    invoke-virtual {p3, p2, p4}, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->c(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;Lga/d;)Lba/a;

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->R()Lu9/a;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-static {v0}, Lna/n;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->M()Lr9/a;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    filled-new-array {p3}, [Lba/a;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-static {v1}, Lrc/w;->g([Ljava/lang/Object;)Ljava/util/ArrayList;

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
    invoke-static {p4, v4, v5}, Lna/n;->f(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

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
    invoke-static {v2}, Lrc/w;->s([Ljava/lang/Object;)Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {v0, v1, v2}, Lr9/a;->c(Ljava/util/List;Ljava/util/List;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p3, p4}, Lba/a;->e(Landroid/graphics/Matrix;)V

    .line 128
    .line 129
    .line 130
    sget-object p4, Lna/i;->a:Lna/i;

    .line 131
    .line 132
    sget-object v0, Lcom/zykj/blackboard/utils/EventKey;->d:Lcom/zykj/blackboard/utils/EventKey;

    .line 133
    .line 134
    invoke-virtual {p4, v0}, Lna/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 135
    .line 136
    .line 137
    sget-object v0, Lcom/zykj/blackboard/utils/EventKey;->c:Lcom/zykj/blackboard/utils/EventKey;

    .line 138
    .line 139
    invoke-virtual {p4, v0}, Lna/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 140
    .line 141
    .line 142
    sget-object v0, Lcom/zykj/blackboard/utils/EventKey;->f:Lcom/zykj/blackboard/utils/EventKey;

    .line 143
    .line 144
    invoke-virtual {p4, v0}, Lna/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->O()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 148
    .line 149
    .line 150
    move-result-object p4

    .line 151
    invoke-virtual {p4}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lq9/b;

    .line 152
    .line 153
    .line 154
    move-result-object p4

    .line 155
    invoke-virtual {p4}, Lq9/b;->Q()Z

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->P()Lv9/b;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    move-object p4, p3

    .line 171
    check-cast p4, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 172
    .line 173
    invoke-virtual {p2, p4}, Lv9/b;->a(Lcom/zykj/blackboard/core/graph/group/ImageGraph;)V

    .line 174
    .line 175
    .line 176
    goto :goto_0

    .line 177
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->P()Lv9/b;

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
    invoke-virtual {p4, p2, p3}, Lv9/b;->f(Ljava/lang/String;Lba/c;)V

    .line 186
    .line 187
    .line 188
    :goto_0
    new-instance p2, Ljava/io/File;

    .line 189
    .line 190
    sget-object p4, Lia/c;->d:Lia/c$a;

    .line 191
    .line 192
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->U()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    sget-object v2, Lcom/zykj/blackboard/enums/DocumentType;->c:Lcom/zykj/blackboard/enums/DocumentType;

    .line 197
    .line 198
    invoke-virtual {p4, v1, v2}, Lia/c$a;->a(Ljava/lang/String;Lcom/zykj/blackboard/enums/DocumentType;)Ljava/lang/String;

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/PageControl;->u()Z

    .line 210
    .line 211
    .line 212
    move-result p2

    .line 213
    if-eqz p2, :cond_2

    .line 214
    .line 215
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->V()Ljava/util/ArrayList;

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->S()Ljava/util/ArrayList;

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
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

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

.method public m()Z
    .locals 5

    .line 1
    sget-object v0, Lna/i;->a:Lna/i;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->c:Lcom/zykj/blackboard/utils/EventKey;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lna/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->d:Lcom/zykj/blackboard/utils/EventKey;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lna/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->Q()Ly9/k;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ly9/k;->e()Ly9/l;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->W()Lia/c;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Lia/c;->c()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0}, Ly9/l;->c()Lba/a;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v0}, Ly9/l;->a()I

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
    invoke-virtual {v1, v2, v0, v3, v4}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->Y(Lba/a;IJ)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

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

.method public n(Lhd/l;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->M()Lr9/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lr9/a;->w(Lhd/l;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final n0(FF)Landroid/graphics/Matrix;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->O()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lq9/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lq9/b;->M()I

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
    sget-object v4, Lcom/zykj/board/EzyPositionEnum$PositionEnum;->e:Lcom/zykj/board/EzyPositionEnum$PositionEnum;

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
    invoke-static/range {v1 .. v7}, Ly9/o;->e(Lcom/zykj/blackboard/core/edit/PageControl;FFLcom/zykj/board/EzyPositionEnum$PositionEnum;IILjava/lang/Object;)Landroid/graphics/Matrix;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->P()Lv9/b;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-virtual {p2}, Lv9/b;->n()Lba/c;

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
    invoke-interface {p2}, Lba/c;->f()Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    if-eqz p2, :cond_1

    .line 61
    .line 62
    check-cast p2, Ljava/lang/Iterable;

    .line 63
    .line 64
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    move v1, v0

    .line 69
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_2

    .line 74
    .line 75
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast v2, Lba/c;

    .line 80
    .line 81
    instance-of v3, v2, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 82
    .line 83
    if-eqz v3, :cond_0

    .line 84
    .line 85
    invoke-interface {v2}, Lba/c;->d()Landroid/graphics/RectF;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    .line 90
    .line 91
    invoke-static {v2, v1}, Ljava/lang/Math;->max(FF)F

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    goto :goto_0

    .line 96
    :cond_1
    move v1, v0

    .line 97
    :cond_2
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 98
    .line 99
    .line 100
    return-object p1
.end method

.method public o(Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;I)Lca/d;
    .locals 10

    .line 1
    const-string v0, "content"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "position"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->O()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lq9/b;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Lq9/b;->b()I

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->O()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lq9/b;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v1}, Lq9/b;->e()F

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->O()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lq9/b;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v1}, Lq9/b;->f()Landroid/graphics/RectF;

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->O()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lq9/b;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v1}, Lq9/b;->f()Landroid/graphics/RectF;

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
    sget-object v3, Lna/t;->a:Lna/t;

    .line 104
    .line 105
    invoke-virtual {v3, p1, v0, v4}, Lna/t;->a(Ljava/lang/String;Landroid/graphics/Paint;F)Ljava/util/List;

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->P()Lv9/b;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-virtual {v1}, Lv9/b;->b()Ljava/lang/String;

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->W()Lia/c;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-virtual {v2}, Lia/c;->c()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

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
    invoke-static {v0, v6, v7}, Lna/m;->a(Landroid/graphics/Paint;FF)Lcom/zykj/board/EzyPaint$Paint;

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
    sget-object v0, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->c:Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;

    .line 170
    .line 171
    const-string v2, "graphData"

    .line 172
    .line 173
    invoke-static {p1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->X()Lga/c;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    invoke-virtual {v0, p1, v2}, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->c(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;Lga/d;)Lba/a;

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
    invoke-static {p0, v4, v5, p2, p3}, Ly9/o;->d(Lcom/zykj/blackboard/core/edit/PageControl;FFLcom/zykj/board/EzyPositionEnum$PositionEnum;I)Landroid/graphics/Matrix;

    .line 193
    .line 194
    .line 195
    move-result-object p2

    .line 196
    invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->R()Lu9/a;

    .line 200
    .line 201
    .line 202
    move-result-object p2

    .line 203
    invoke-virtual {p2}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 204
    .line 205
    .line 206
    move-result-object p2

    .line 207
    invoke-static {p2}, Lna/n;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 208
    .line 209
    .line 210
    move-result-object p2

    .line 211
    invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 212
    .line 213
    .line 214
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->M()Lr9/a;

    .line 215
    .line 216
    .line 217
    move-result-object p2

    .line 218
    filled-new-array {p1}, [Lba/a;

    .line 219
    .line 220
    .line 221
    move-result-object p3

    .line 222
    invoke-static {p3}, Lrc/w;->g([Ljava/lang/Object;)Ljava/util/ArrayList;

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
    invoke-static {v0, v1, v2}, Lna/n;->f(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

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
    invoke-static {v1}, Lrc/w;->s([Ljava/lang/Object;)Ljava/util/List;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    invoke-virtual {p2, p3, v1}, Lr9/a;->c(Ljava/util/List;Ljava/util/List;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p1, v0}, Lba/a;->e(Landroid/graphics/Matrix;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->P()Lv9/b;

    .line 249
    .line 250
    .line 251
    move-result-object p2

    .line 252
    invoke-virtual {p2, v3, p1}, Lv9/b;->f(Ljava/lang/String;Lba/c;)V

    .line 253
    .line 254
    .line 255
    check-cast p1, Lca/d;

    .line 256
    .line 257
    return-object p1
.end method

.method public final o0(Lhd/a;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/PageControl;->u()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/PageControl;->stopRecord()V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-interface {p1}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Landroid/graphics/Bitmap;

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    sget-object v0, Lna/p;->a:Lna/p$a;

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->U()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const-string v2, "screenshot.png"

    .line 25
    .line 26
    invoke-virtual {v0, v1, v2, p1}, Lna/p$a;->a(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->P()Lv9/b;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Lv9/b;->Y()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    invoke-static {}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->o()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0, p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;->y(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->R()Lu9/a;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v1}, Lu9/a;->d()Landroid/graphics/Matrix;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const-wide/16 v2, 0x0

    .line 55
    .line 56
    invoke-static {v1, v2, v3}, Lna/n;->f(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;->w(Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;

    .line 61
    .line 62
    .line 63
    new-instance v1, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    const-string v2, "[PageControl]:saveData -> ["

    .line 69
    .line 70
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getFileName()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v2, "] s:"

    .line 81
    .line 82
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getChildGraphList()Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string p1, ", g:"

    .line 97
    .line 98
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->P()Lv9/b;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p1}, Lv9/b;->n()Lba/c;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    if-eqz p1, :cond_2

    .line 110
    .line 111
    invoke-interface {p1}, Lba/c;->f()Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    if-eqz p1, :cond_2

    .line 116
    .line 117
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    goto :goto_0

    .line 126
    :cond_2
    const/4 p1, 0x0

    .line 127
    :goto_0
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string p1, "cm:"

    .line 131
    .line 132
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;->k()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getScaleX()F

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    sget-object p1, Lna/p;->a:Lna/p$a;

    .line 158
    .line 159
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->U()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-virtual {v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;->d()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    const-string v2, "builder.build()"

    .line 168
    .line 169
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    const-string v2, "snapshot.bin"

    .line 173
    .line 174
    invoke-virtual {p1, v1, v2, v0}, Lna/p$a;->b(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;)V

    .line 175
    .line 176
    .line 177
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->T()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->e()Lio/objectbox/relation/ToOne;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-virtual {p1}, Lio/objectbox/relation/ToOne;->d()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;

    .line 190
    .line 191
    if-eqz p1, :cond_4

    .line 192
    .line 193
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 194
    .line 195
    .line 196
    move-result-wide v0

    .line 197
    invoke-virtual {p1, v0, v1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->x(J)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->Y()Lia/e;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 205
    .line 206
    .line 207
    move-result-wide v1

    .line 208
    invoke-virtual {v0, v1, v2}, Lia/e;->c(J)J

    .line 209
    .line 210
    .line 211
    move-result-wide v0

    .line 212
    invoke-virtual {p1, v0, v1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->t(J)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->P()Lv9/b;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-virtual {v0}, Lv9/b;->N()I

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->s(I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->P()Lv9/b;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    invoke-virtual {v0}, Lv9/b;->L()I

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->w(I)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->e()Lio/objectbox/relation/ToOne;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->P()Lv9/b;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    invoke-virtual {v1}, Lv9/b;->O()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    invoke-static {v1}, Lna/g;->d(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->f()V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0, v1}, Lio/objectbox/relation/ToOne;->o(Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->j()Lio/objectbox/relation/ToOne;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->P()Lv9/b;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    invoke-virtual {v1}, Lv9/b;->M()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    invoke-static {v1}, Lna/g;->d(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->f()V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v0, v1}, Lio/objectbox/relation/ToOne;->o(Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->k()Lio/objectbox/relation/ToOne;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->O()Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lq9/b;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    invoke-virtual {v1}, Lq9/b;->z()Lq9/d;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    invoke-static {v1}, Lna/g;->e(Lq9/d;)Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->i()V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v0, v1}, Lio/objectbox/relation/ToOne;->o(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->q()V

    .line 308
    .line 309
    .line 310
    :cond_4
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->T()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 311
    .line 312
    .line 313
    move-result-object p1

    .line 314
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->h()Z

    .line 315
    .line 316
    .line 317
    move-result p1

    .line 318
    if-eqz p1, :cond_5

    .line 319
    .line 320
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->T()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    const/4 v0, 0x0

    .line 325
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->j(Z)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->T()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 329
    .line 330
    .line 331
    move-result-object p1

    .line 332
    const-string v0, ""

    .line 333
    .line 334
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->k(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->T()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 338
    .line 339
    .line 340
    move-result-object p1

    .line 341
    const/4 v0, -0x1

    .line 342
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->l(I)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->T()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 346
    .line 347
    .line 348
    move-result-object p1

    .line 349
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->i()V

    .line 350
    .line 351
    .line 352
    :cond_5
    return-void
.end method

.method public p(FFF)V
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->R()Lu9/a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lu9/a;->d()Landroid/graphics/Matrix;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lna/n;->a(Landroid/graphics/Matrix;)F

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
    invoke-static {v2}, Lna/n;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->R()Lu9/a;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Lu9/a;->d()Landroid/graphics/Matrix;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->R()Lu9/a;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-virtual {p2, v0}, Lu9/a;->j(Landroid/graphics/Matrix;)V

    .line 49
    .line 50
    .line 51
    const-wide/16 p2, 0x0

    .line 52
    .line 53
    invoke-static {p1, p2, p3}, Lna/n;->f(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->R()Lu9/a;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, Lu9/a;->d()Landroid/graphics/Matrix;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {v0, p2, p3}, Lna/n;->f(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-virtual {p0, p1, p2}, Lcom/zykj/blackboard/core/edit/BasePageControl;->e0(Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;)V

    .line 70
    .line 71
    .line 72
    sget-object p1, Lna/i;->a:Lna/i;

    .line 73
    .line 74
    sget-object p2, Lcom/zykj/blackboard/utils/EventKey;->d:Lcom/zykj/blackboard/utils/EventKey;

    .line 75
    .line 76
    invoke-virtual {p1, p2}, Lna/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 77
    .line 78
    .line 79
    sget-object p2, Lcom/zykj/blackboard/utils/EventKey;->c:Lcom/zykj/blackboard/utils/EventKey;

    .line 80
    .line 81
    invoke-virtual {p1, p2}, Lna/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 82
    .line 83
    .line 84
    sget-object p2, Lcom/zykj/blackboard/utils/EventKey;->f:Lcom/zykj/blackboard/utils/EventKey;

    .line 85
    .line 86
    invoke-virtual {p1, p2}, Lna/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->P()Lv9/b;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p1}, Lv9/b;->g()V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->P()Lv9/b;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {p1}, Lv9/b;->Z()V

    .line 101
    .line 102
    .line 103
    return-void
.end method

.method public q(Z)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->Y()Lia/e;

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
    invoke-virtual {v0, v1, v2}, Lia/e;->i(J)V

    .line 10
    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/PageControl;->d()V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->V()Ljava/util/ArrayList;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->S()Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->S()Ljava/util/ArrayList;

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

.method public r()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->N()Ly9/a;

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
    invoke-virtual {v0, v1}, Ly9/a;->e(Lhd/p;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public s()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/blackboard/core/edit/PageControl$saveWithContentThumbnail$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/blackboard/core/edit/PageControl$saveWithContentThumbnail$1;-><init>(Lcom/zykj/blackboard/core/edit/PageControl;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lcom/zykj/blackboard/core/edit/PageControl;->o0(Lhd/a;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public save()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/blackboard/core/edit/PageControl$save$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/blackboard/core/edit/PageControl$save$1;-><init>(Lcom/zykj/blackboard/core/edit/PageControl;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lcom/zykj/blackboard/core/edit/PageControl;->o0(Lhd/a;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setAreaMoveListener(Lma/d;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->M()Lr9/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lr9/a;->v(Lma/d;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public stopRecord()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/PageControl;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/PageControl;->r()V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->W()Lia/c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lia/c;->c()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->Y()Lia/e;

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
    invoke-static/range {v1 .. v6}, Lia/b$a;->a(Lia/b;JZILjava/lang/Object;)J

    .line 30
    .line 31
    .line 32
    move-result-wide v1

    .line 33
    invoke-virtual {v0, v1, v2}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->e0(J)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->Y()Lia/e;

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
    invoke-virtual {v0, v1, v2}, Lia/e;->k(J)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public t()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->M()Lr9/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lr9/a;->t()Lr9/e;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lr9/e;->d()Lcom/zykj/blackboard/core/action/WritingAction;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->R()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->W()Lia/c;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Lia/c;->b()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    return v0

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    return v0
.end method

.method public u()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->Y()Lia/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lia/e;->e()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public v(Lba/c;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->P()Lv9/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lv9/b;->n()Lba/c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    invoke-interface {v0}, Lba/c;->f()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    check-cast v0, Ljava/lang/Iterable;

    .line 18
    .line 19
    new-instance v1, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    move-object v3, v2

    .line 39
    check-cast v3, Lba/c;

    .line 40
    .line 41
    invoke-static {v3, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-nez v3, :cond_0

    .line 46
    .line 47
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->M()Lr9/a;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 56
    .line 57
    .line 58
    move-result-wide v2

    .line 59
    invoke-virtual {p1, v1, v2, v3}, Lr9/a;->o(Ljava/util/List;J)V

    .line 60
    .line 61
    .line 62
    sget-object p1, Lna/i;->a:Lna/i;

    .line 63
    .line 64
    sget-object v0, Lcom/zykj/blackboard/utils/EventKey;->d:Lcom/zykj/blackboard/utils/EventKey;

    .line 65
    .line 66
    invoke-virtual {p1, v0}, Lna/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 67
    .line 68
    .line 69
    sget-object v0, Lcom/zykj/blackboard/utils/EventKey;->c:Lcom/zykj/blackboard/utils/EventKey;

    .line 70
    .line 71
    invoke-virtual {p1, v0}, Lna/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->P()Lv9/b;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-static {v1}, Lkotlin/jvm/internal/d0;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {p1, v0}, Lv9/b;->p(Ljava/util/List;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->d0()V

    .line 86
    .line 87
    .line 88
    :cond_2
    return-void
.end method

.method public x(Lma/k;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->Q()Ly9/k;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Ly9/k;->a(Lma/k;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public y()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->P()Lv9/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lv9/b;->P()I

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
    sget-object v0, Lna/i;->a:Lna/i;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->c:Lcom/zykj/blackboard/utils/EventKey;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lna/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->d:Lcom/zykj/blackboard/utils/EventKey;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lna/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->Q()Ly9/k;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ly9/k;->c()Ly9/l;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->W()Lia/c;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Lia/c;->c()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0}, Ly9/l;->c()Lba/a;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v0}, Ly9/l;->a()I

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
    invoke-virtual {v1, v2, v0, v3, v4}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->Y(Lba/a;IJ)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

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
