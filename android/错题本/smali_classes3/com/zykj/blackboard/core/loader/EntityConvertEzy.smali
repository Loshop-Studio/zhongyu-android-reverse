# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/blackboard/core/loader/EntityConvertEzy;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0008\u0010\u0005\u001a\u0004\u0018\u00010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u000cJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/loader/EntityConvertEzy;",
        "",
        "()V",
        "commandInfoConvertEzyCommandInfo",
        "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;",
        "entity",
        "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
        "fileInfoConvertEzyFileInfo",
        "Lcom/zykj/board/EzySource$FileSource$FileInfo;",
        "Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;",
        "geometryInfoConvertEzyGeometryInfo",
        "Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;",
        "Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;",
        "matrixEventConvertEzyMatrixInfo",
        "Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;",
        "Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;",
        "textInfoConvertEzyTextInfo",
        "Lcom/zykj/board/EzySource$TextSource$TextInfo;",
        "Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;",
        "touchInfoConvertEzyTouchInfo",
        "Lcom/zykj/board/EzySource$TouchSource$TouchInfo;",
        "Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;",
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
.field public static final INSTANCE:Lcom/zykj/blackboard/core/loader/EntityConvertEzy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


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
    .param p1    # Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->newBuilder()Lcom/zykj/board/e;

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
    invoke-virtual {v0, v1, v2}, Lcom/zykj/board/e;->k(J)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getDuration()J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    invoke-virtual {v0, v1, v2}, Lcom/zykj/board/e;->l(J)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->isPlay()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {v0, v1}, Lcom/zykj/board/e;->m(Z)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getCommandEnum()Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Lcom/zykj/board/e;->i(Lcom/zykj/board/EzyCommandEnum$CommandEnum;)V

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
    invoke-virtual {v0, p1}, Lcom/zykj/board/e;->j(Lcom/google/protobuf/ByteString;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Lcom/zykj/board/e;->c()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;

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
    .param p1    # Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {}, Lcom/zykj/board/EzySource$FileSource$FileInfo;->newBuilder()Lcom/zykj/board/k0;

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
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iput-object v1, v0, Lcom/zykj/board/k0;->b:Ljava/lang/Object;

    .line 18
    .line 19
    iget v1, v0, Lcom/zykj/board/k0;->a:I

    .line 20
    .line 21
    or-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    iput v1, v0, Lcom/zykj/board/k0;->a:I

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;->getWidth()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    iput v1, v0, Lcom/zykj/board/k0;->c:I

    .line 33
    .line 34
    iget v1, v0, Lcom/zykj/board/k0;->a:I

    .line 35
    .line 36
    or-int/lit8 v1, v1, 0x2

    .line 37
    .line 38
    iput v1, v0, Lcom/zykj/board/k0;->a:I

    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;->getHeight()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    iput v1, v0, Lcom/zykj/board/k0;->d:I

    .line 48
    .line 49
    iget v1, v0, Lcom/zykj/board/k0;->a:I

    .line 50
    .line 51
    or-int/lit8 v1, v1, 0x4

    .line 52
    .line 53
    iput v1, v0, Lcom/zykj/board/k0;->a:I

    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;->getValidate()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    iput-object p1, v0, Lcom/zykj/board/k0;->e:Ljava/lang/Object;

    .line 66
    .line 67
    iget p1, v0, Lcom/zykj/board/k0;->a:I

    .line 68
    .line 69
    or-int/lit8 p1, p1, 0x8

    .line 70
    .line 71
    iput p1, v0, Lcom/zykj/board/k0;->a:I

    .line 72
    .line 73
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Lcom/zykj/board/k0;->c()Lcom/zykj/board/EzySource$FileSource$FileInfo;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    return-object p1

    .line 81
    :cond_0
    const/4 p1, 0x0

    .line 82
    return-object p1
.end method

.method public final geometryInfoConvertEzyGeometryInfo(Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;)Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;
    .locals 4
    .param p1    # Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-static {}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->newBuilder()Lcom/zykj/board/n0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/zykj/board/n0;->h()Lb4/p0;

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
    invoke-virtual {v1, v2}, Lb4/p0;->i(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/zykj/board/n0;->h()Lb4/p0;

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
    invoke-virtual {v1, v2}, Lb4/p0;->n(F)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/zykj/board/n0;->h()Lb4/p0;

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
    invoke-virtual {v1, v2}, Lb4/p0;->l(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/zykj/board/n0;->h()Lb4/p0;

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
    invoke-virtual {v1, v2}, Lb4/p0;->m(F)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->getGeometryType()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    iput v1, v0, Lcom/zykj/board/n0;->b:I

    .line 56
    .line 57
    iget v1, v0, Lcom/zykj/board/n0;->a:I

    .line 58
    .line 59
    or-int/lit8 v1, v1, 0x1

    .line 60
    .line 61
    iput v1, v0, Lcom/zykj/board/n0;->a:I

    .line 62
    .line 63
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->getPointList()Lio/objectbox/relation/ToMany;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_1

    .line 79
    .line 80
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;

    .line 85
    .line 86
    invoke-static {}, Lcom/zykj/board/EzyPointF$PointF;->newBuilder()Lb4/u0;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;->getX()F

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    invoke-virtual {v2, v3}, Lb4/u0;->i(F)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;->getY()F

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    invoke-virtual {v2, v1}, Lb4/u0;->j(F)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2}, Lb4/u0;->c()Lcom/zykj/board/EzyPointF$PointF;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    iget-object v2, v0, Lcom/zykj/board/n0;->d:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 109
    .line 110
    if-nez v2, :cond_0

    .line 111
    .line 112
    invoke-virtual {v0}, Lcom/zykj/board/n0;->g()V

    .line 113
    .line 114
    .line 115
    iget-object v2, v0, Lcom/zykj/board/n0;->c:Ljava/util/List;

    .line 116
    .line 117
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_0
    invoke-virtual {v2, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_1
    invoke-virtual {v0}, Lcom/zykj/board/n0;->c()Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    return-object p1

    .line 133
    :cond_2
    const/4 p1, 0x0

    .line 134
    return-object p1
.end method

.method public final matrixEventConvertEzyMatrixInfo(Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;)Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;
    .locals 5
    .param p1    # Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-static {}, Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;->newBuilder()Lcom/zykj/board/q0;

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
    if-eqz v1, :cond_1

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
    invoke-static {}, Lcom/zykj/board/EzyMatrix$Matrix;->newBuilder()Lb4/b0;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    const-string v3, "newBuilder()"

    .line 32
    .line 33
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getEventTime()J

    .line 37
    .line 38
    .line 39
    move-result-wide v3

    .line 40
    invoke-virtual {v2, v3, v4}, Lb4/b0;->i(J)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getScaleX()F

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-virtual {v2, v3}, Lb4/b0;->m(F)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getSkewX()F

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    invoke-virtual {v2, v3}, Lb4/b0;->o(F)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getTransX()F

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    invoke-virtual {v2, v3}, Lb4/b0;->q(F)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getSkewY()F

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    invoke-virtual {v2, v3}, Lb4/b0;->p(F)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getScaleY()F

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    invoke-virtual {v2, v3}, Lb4/b0;->n(F)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getTransY()F

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    invoke-virtual {v2, v3}, Lb4/b0;->r(F)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getPerSp0()F

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    invoke-virtual {v2, v3}, Lb4/b0;->j(F)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getPerSp1()F

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    invoke-virtual {v2, v3}, Lb4/b0;->k(F)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getPerSp2()F

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    invoke-virtual {v2, v1}, Lb4/b0;->l(F)V

    .line 104
    .line 105
    .line 106
    iget-object v1, v0, Lcom/zykj/board/q0;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 107
    .line 108
    if-nez v1, :cond_0

    .line 109
    .line 110
    invoke-virtual {v0}, Lcom/zykj/board/q0;->ensureMatrixIsMutable()V

    .line 111
    .line 112
    .line 113
    iget-object v1, v0, Lcom/zykj/board/q0;->b:Ljava/util/List;

    .line 114
    .line 115
    invoke-virtual {v2}, Lb4/b0;->c()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_0
    invoke-virtual {v2}, Lb4/b0;->c()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-virtual {v1, v2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 131
    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_1
    invoke-virtual {v0}, Lcom/zykj/board/q0;->c()Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    return-object p1

    .line 139
    :cond_2
    const/4 p1, 0x0

    .line 140
    return-object p1
.end method

.method public final textInfoConvertEzyTextInfo(Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;)Lcom/zykj/board/EzySource$TextSource$TextInfo;
    .locals 3
    .param p1    # Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {}, Lcom/zykj/board/EzySource$TextSource$TextInfo;->newBuilder()Lcom/zykj/board/t0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/zykj/board/t0;->g()Lb4/p0;

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
    invoke-virtual {v1, v2}, Lb4/p0;->i(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/zykj/board/t0;->g()Lb4/p0;

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
    invoke-virtual {v1, v2}, Lb4/p0;->n(F)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/zykj/board/t0;->g()Lb4/p0;

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
    invoke-virtual {v1, v2}, Lb4/p0;->l(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/zykj/board/t0;->g()Lb4/p0;

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
    invoke-virtual {v1, v2}, Lb4/p0;->m(F)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->getContent()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    iput-object p1, v0, Lcom/zykj/board/t0;->b:Ljava/lang/Object;

    .line 59
    .line 60
    iget p1, v0, Lcom/zykj/board/t0;->a:I

    .line 61
    .line 62
    or-int/lit8 p1, p1, 0x1

    .line 63
    .line 64
    iput p1, v0, Lcom/zykj/board/t0;->a:I

    .line 65
    .line 66
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Lcom/zykj/board/t0;->c()Lcom/zykj/board/EzySource$TextSource$TextInfo;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1

    .line 74
    :cond_0
    const/4 p1, 0x0

    .line 75
    return-object p1
.end method

.method public final touchInfoConvertEzyTouchInfo(Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo;
    .locals 5
    .param p1    # Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-static {}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->newBuilder()Lcom/zykj/board/w0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/zykj/board/w0;->g()Lb4/p0;

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
    invoke-virtual {v1, v2}, Lb4/p0;->i(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/zykj/board/w0;->g()Lb4/p0;

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
    invoke-virtual {v1, v2}, Lb4/p0;->n(F)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/zykj/board/w0;->g()Lb4/p0;

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
    invoke-virtual {v1, v2}, Lb4/p0;->k(F)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/zykj/board/w0;->g()Lb4/p0;

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
    invoke-virtual {v1, v2}, Lb4/p0;->j(F)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Lcom/zykj/board/w0;->g()Lb4/p0;

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
    invoke-virtual {v1, v2}, Lb4/p0;->l(I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/zykj/board/w0;->g()Lb4/p0;

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
    invoke-virtual {v1, v2}, Lb4/p0;->m(F)V

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
    if-eqz v1, :cond_1

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
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->newBuilder()Lcom/zykj/board/x0;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    const-string v3, "newBuilder()"

    .line 98
    .line 99
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->getEventTime()J

    .line 103
    .line 104
    .line 105
    move-result-wide v3

    .line 106
    invoke-virtual {v2, v3, v4}, Lcom/zykj/board/x0;->i(J)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->getX()F

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    invoke-virtual {v2, v3}, Lcom/zykj/board/x0;->j(F)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->getY()F

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    invoke-virtual {v2, v1}, Lcom/zykj/board/x0;->k(F)V

    .line 121
    .line 122
    .line 123
    iget-object v1, v0, Lcom/zykj/board/w0;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 124
    .line 125
    if-nez v1, :cond_0

    .line 126
    .line 127
    invoke-virtual {v0}, Lcom/zykj/board/w0;->ensureTouchEventIsMutable()V

    .line 128
    .line 129
    .line 130
    iget-object v1, v0, Lcom/zykj/board/w0;->b:Ljava/util/List;

    .line 131
    .line 132
    invoke-virtual {v2}, Lcom/zykj/board/x0;->c()Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 140
    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_0
    invoke-virtual {v2}, Lcom/zykj/board/x0;->c()Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-virtual {v1, v2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 148
    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_1
    invoke-virtual {v0}, Lcom/zykj/board/w0;->c()Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    return-object p1

    .line 156
    :cond_2
    const/4 p1, 0x0

    .line 157
    return-object p1
.end method
