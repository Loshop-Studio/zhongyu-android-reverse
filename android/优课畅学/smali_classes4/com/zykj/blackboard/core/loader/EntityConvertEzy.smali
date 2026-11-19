.class public final Lcom/zykj/blackboard/core/loader/EntityConvertEzy;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/zykj/blackboard/core/loader/EntityConvertEzy;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/blackboard/core/loader/EntityConvertEzy;

    invoke-direct {v0}, Lcom/zykj/blackboard/core/loader/EntityConvertEzy;-><init>()V

    sput-object v0, Lcom/zykj/blackboard/core/loader/EntityConvertEzy;->INSTANCE:Lcom/zykj/blackboard/core/loader/EntityConvertEzy;

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


# virtual methods
.method public final commandInfoConvertEzyCommandInfo(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->p()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getDelayTime()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    invoke-virtual {v0, v1, v2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->t(J)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getDuration()J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    invoke-virtual {v0, v1, v2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->u(J)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->isPlay()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->w(Z)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getCommandEnum()Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->q(Lcom/zykj/board/EzyCommandEnum$CommandEnum;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getData()[B

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {p1}, Lcom/google/protobuf/ByteString;->copyFrom([B)Lcom/google/protobuf/ByteString;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {v0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->s(Lcom/google/protobuf/ByteString;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->e()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1

    .line 51
    :cond_0
    const/4 p1, 0x0

    .line 52
    return-object p1
.end method

.method public final fileInfoConvertEzyFileInfo(Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;)Lcom/zykj/board/EzySource$FileSource$FileInfo;
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {}, Lcom/zykj/board/EzySource$FileSource$FileInfo;->k()Lcom/zykj/board/EzySource$FileSource$FileInfo$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;->getFileName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzySource$FileSource$FileInfo$b;->s(Ljava/lang/String;)Lcom/zykj/board/EzySource$FileSource$FileInfo$b;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;->getWidth()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzySource$FileSource$FileInfo$b;->w(I)Lcom/zykj/board/EzySource$FileSource$FileInfo$b;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;->getHeight()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzySource$FileSource$FileInfo$b;->r(I)Lcom/zykj/board/EzySource$FileSource$FileInfo$b;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;->getValidate()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v0, p1}, Lcom/zykj/board/EzySource$FileSource$FileInfo$b;->v(Ljava/lang/String;)Lcom/zykj/board/EzySource$FileSource$FileInfo$b;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$FileSource$FileInfo$b;->e()Lcom/zykj/board/EzySource$FileSource$FileInfo;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    :cond_0
    const/4 p1, 0x0

    .line 41
    return-object p1
.end method

.method public final geometryInfoConvertEzyGeometryInfo(Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;)Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;
    .locals 4

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-static {}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->q()Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo$b;->q()Lcom/zykj/board/EzyPaint$Paint$b;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->getColor()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyPaint$Paint$b;->q(I)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo$b;->q()Lcom/zykj/board/EzyPaint$Paint$b;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->getWidth()F

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyPaint$Paint$b;->y(F)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo$b;->q()Lcom/zykj/board/EzyPaint$Paint$b;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->getStyle()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyPaint$Paint$b;->v(I)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo$b;->q()Lcom/zykj/board/EzyPaint$Paint$b;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->getTextSize()F

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyPaint$Paint$b;->w(F)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->getGeometryType()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo$b;->z(I)Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo$b;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->getPointList()Lio/objectbox/relation/ToMany;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_0

    .line 71
    .line 72
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    check-cast v1, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;

    .line 77
    .line 78
    invoke-static {}, Lcom/zykj/board/EzyPointF$PointF;->e()Lcom/zykj/board/EzyPointF$PointF$b;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;->getX()F

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    invoke-virtual {v2, v3}, Lcom/zykj/board/EzyPointF$PointF$b;->t(F)Lcom/zykj/board/EzyPointF$PointF$b;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;->getY()F

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    invoke-virtual {v2, v1}, Lcom/zykj/board/EzyPointF$PointF$b;->u(F)Lcom/zykj/board/EzyPointF$PointF$b;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {v1}, Lcom/zykj/board/EzyPointF$PointF$b;->e()Lcom/zykj/board/EzyPointF$PointF;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo$b;->c(Lcom/zykj/board/EzyPointF$PointF;)Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo$b;

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo$b;->f()Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    return-object p1

    .line 111
    :cond_1
    const/4 p1, 0x0

    .line 112
    return-object p1
.end method

.method public final matrixEventConvertEzyMatrixInfo(Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;)Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;
    .locals 5

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-static {}, Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;->g()Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;->getMatrixInfo()Lio/objectbox/relation/ToMany;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;

    .line 26
    .line 27
    invoke-static {}, Lcom/zykj/board/EzyMatrix$Matrix;->u()Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    const-string v3, "newBuilder()"

    .line 32
    .line 33
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getEventTime()J

    .line 37
    .line 38
    .line 39
    move-result-wide v3

    .line 40
    invoke-virtual {v2, v3, v4}, Lcom/zykj/board/EzyMatrix$Matrix$b;->q(J)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getScaleX()F

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-virtual {v2, v3}, Lcom/zykj/board/EzyMatrix$Matrix$b;->w(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getSkewX()F

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    invoke-virtual {v2, v3}, Lcom/zykj/board/EzyMatrix$Matrix$b;->y(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getTransX()F

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    invoke-virtual {v2, v3}, Lcom/zykj/board/EzyMatrix$Matrix$b;->A(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getSkewY()F

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    invoke-virtual {v2, v3}, Lcom/zykj/board/EzyMatrix$Matrix$b;->z(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getScaleY()F

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    invoke-virtual {v2, v3}, Lcom/zykj/board/EzyMatrix$Matrix$b;->x(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getTransY()F

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    invoke-virtual {v2, v3}, Lcom/zykj/board/EzyMatrix$Matrix$b;->B(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getPerSp0()F

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    invoke-virtual {v2, v3}, Lcom/zykj/board/EzyMatrix$Matrix$b;->s(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getPerSp1()F

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    invoke-virtual {v2, v3}, Lcom/zykj/board/EzyMatrix$Matrix$b;->t(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getPerSp2()F

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    invoke-virtual {v2, v1}, Lcom/zykj/board/EzyMatrix$Matrix$b;->u(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v2}, Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo$b;->c(Lcom/zykj/board/EzyMatrix$Matrix$b;)Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo$b;

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo$b;->g()Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    return-object p1

    .line 115
    :cond_1
    const/4 p1, 0x0

    .line 116
    return-object p1
.end method

.method public final textInfoConvertEzyTextInfo(Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;)Lcom/zykj/board/EzySource$TextSource$TextInfo;
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {}, Lcom/zykj/board/EzySource$TextSource$TextInfo;->k()Lcom/zykj/board/EzySource$TextSource$TextInfo$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$TextSource$TextInfo$b;->n()Lcom/zykj/board/EzyPaint$Paint$b;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->getColor()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyPaint$Paint$b;->q(I)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$TextSource$TextInfo$b;->n()Lcom/zykj/board/EzyPaint$Paint$b;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->getWidth()F

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyPaint$Paint$b;->y(F)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$TextSource$TextInfo$b;->n()Lcom/zykj/board/EzyPaint$Paint$b;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->getStyle()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyPaint$Paint$b;->v(I)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$TextSource$TextInfo$b;->n()Lcom/zykj/board/EzyPaint$Paint$b;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->getTextSize()F

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyPaint$Paint$b;->w(F)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->getContent()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {v0, p1}, Lcom/zykj/board/EzySource$TextSource$TextInfo$b;->u(Ljava/lang/String;)Lcom/zykj/board/EzySource$TextSource$TextInfo$b;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$TextSource$TextInfo$b;->e()Lcom/zykj/board/EzySource$TextSource$TextInfo;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1

    .line 63
    :cond_0
    const/4 p1, 0x0

    .line 64
    return-object p1
.end method

.method public final touchInfoConvertEzyTouchInfo(Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo;
    .locals 5

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-static {}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->l()Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->q()Lcom/zykj/board/EzyPaint$Paint$b;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->getColor()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyPaint$Paint$b;->q(I)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->q()Lcom/zykj/board/EzyPaint$Paint$b;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->getWidth()F

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyPaint$Paint$b;->y(F)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->q()Lcom/zykj/board/EzyPaint$Paint$b;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->getSpacing()F

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyPaint$Paint$b;->u(F)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->q()Lcom/zykj/board/EzyPaint$Paint$b;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->getItemLength()F

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyPaint$Paint$b;->s(F)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->q()Lcom/zykj/board/EzyPaint$Paint$b;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->getStyle()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyPaint$Paint$b;->v(I)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->q()Lcom/zykj/board/EzyPaint$Paint$b;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->getTextSize()F

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-virtual {v1, v2}, Lcom/zykj/board/EzyPaint$Paint$b;->w(F)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->getTouchInfoList()Lio/objectbox/relation/ToMany;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_0

    .line 86
    .line 87
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    check-cast v1, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;

    .line 92
    .line 93
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->o()Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    const-string v3, "newBuilder()"

    .line 98
    .line 99
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->getEventTime()J

    .line 103
    .line 104
    .line 105
    move-result-wide v3

    .line 106
    invoke-virtual {v2, v3, v4}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->v(J)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->getX()F

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    invoke-virtual {v2, v3}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->B(F)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->getY()F

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    invoke-virtual {v2, v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->C(F)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v2}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->e(Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->g()Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    return-object p1

    .line 132
    :cond_1
    const/4 p1, 0x0

    .line 133
    return-object p1
.end method
