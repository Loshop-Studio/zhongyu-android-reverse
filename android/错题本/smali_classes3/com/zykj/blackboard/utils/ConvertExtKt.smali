# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/blackboard/utils/ConvertExtKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0006\u001a\n\u0010\u0007\u001a\u00020\u0008*\u00020\t\u001a\n\u0010\u0007\u001a\u00020\u0005*\u00020\u0004\u001a\n\u0010\u0007\u001a\u00020\n*\u00020\u000b\u001a\n\u0010\u000c\u001a\u00020\u0002*\u00020\u0001\u001a\n\u0010\r\u001a\u00020\u0006*\u00020\u0004\u00a8\u0006\u000e"
    }
    d2 = {
        "toBackgroundLineTypeEnum",
        "Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;",
        "Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;",
        "toConfig",
        "Lcom/zykj/blackboard/bean/BackgroundLineConfig;",
        "Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;",
        "Lcom/zykj/board/EzyHeader$BackgroundLineConfig;",
        "toEntity",
        "Lcom/zykj/blackboard/core/data/dao/AuthorEntity;",
        "Lcom/zykj/blackboard/bean/Author;",
        "Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;",
        "Lcom/zykj/blackboard/bean/MoveActionConfig;",
        "toEzyBackgroundLineTypeEnum",
        "toEzyConfig",
        "blackboard_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final toBackgroundLineTypeEnum(Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;)Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;
    .locals 1
    .param p0    # Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;->values()[Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0}, Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;->getNumber()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    aget-object p0, v0, p0

    .line 15
    .line 16
    return-object p0
.end method

.method public static final toConfig(Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;)Lcom/zykj/blackboard/bean/BackgroundLineConfig;
    .locals 4
    .param p0    # Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 2
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->getLineColor()I

    move-result v1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->getLineSpace()F

    move-result v2

    .line 4
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->getLineType()Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;

    move-result-object v3

    invoke-static {v3}, Lcom/zykj/blackboard/utils/ConvertExtKt;->toBackgroundLineTypeEnum(Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;)Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    move-result-object v3

    .line 5
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->getLineWidth()F

    move-result p0

    .line 6
    invoke-direct {v0, v1, v2, v3, p0}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;-><init>(IFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;F)V

    return-object v0
.end method

.method public static final toConfig(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/blackboard/bean/BackgroundLineConfig;
    .locals 5
    .param p0    # Lcom/zykj/board/EzyHeader$BackgroundLineConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    new-instance v0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 8
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->getLineColor()I

    move-result v1

    .line 9
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->getLineSpace()F

    move-result v2

    .line 10
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->getLineType()Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;

    move-result-object v3

    const-string v4, "lineType"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lcom/zykj/blackboard/utils/ConvertExtKt;->toBackgroundLineTypeEnum(Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;)Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    move-result-object v3

    .line 11
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->getLineWidth()F

    move-result p0

    .line 12
    invoke-direct {v0, v1, v2, v3, p0}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;-><init>(IFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;F)V

    return-object v0
.end method

.method public static final toEntity(Lcom/zykj/blackboard/bean/Author;)Lcom/zykj/blackboard/core/data/dao/AuthorEntity;
    .locals 12
    .param p0    # Lcom/zykj/blackboard/bean/Author;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    new-instance v1, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;

    .line 17
    invoke-virtual {p0}, Lcom/zykj/blackboard/bean/Author;->getAuthorName()Ljava/lang/String;

    move-result-object v4

    .line 18
    invoke-virtual {p0}, Lcom/zykj/blackboard/bean/Author;->getAuthorId()Ljava/lang/String;

    move-result-object v5

    .line 19
    invoke-virtual {p0}, Lcom/zykj/blackboard/bean/Author;->getSchoolId()Ljava/lang/String;

    move-result-object v6

    const/16 v10, 0x71

    const/4 v11, 0x0

    const-wide/16 v2, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 20
    invoke-direct/range {v1 .. v11}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;ILkotlin/jvm/internal/e;)V

    return-object v1
.end method

.method public static final toEntity(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;
    .locals 10
    .param p0    # Lcom/zykj/blackboard/bean/BackgroundLineConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    new-instance v1, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    .line 11
    invoke-virtual {p0}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->getLineColor()I

    move-result v4

    .line 12
    invoke-virtual {p0}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->getLineSpace()F

    move-result v5

    .line 13
    invoke-virtual {p0}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->getLineType()Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    move-result-object v0

    invoke-static {v0}, Lcom/zykj/blackboard/utils/ConvertExtKt;->toEzyBackgroundLineTypeEnum(Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;)Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;

    move-result-object v6

    .line 14
    invoke-virtual {p0}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->getLineWidth()F

    move-result v7

    const/4 v8, 0x1

    const/4 v9, 0x0

    const-wide/16 v2, 0x0

    .line 15
    invoke-direct/range {v1 .. v9}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;-><init>(JIFLcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;FILkotlin/jvm/internal/e;)V

    return-object v1
.end method

.method public static final toEntity(Lcom/zykj/blackboard/bean/MoveActionConfig;)Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;
    .locals 13
    .param p0    # Lcom/zykj/blackboard/bean/MoveActionConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v1, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;

    .line 2
    invoke-virtual {p0}, Lcom/zykj/blackboard/bean/MoveActionConfig;->isMoveActionEnable()Z

    move-result v4

    .line 3
    invoke-virtual {p0}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getVerticalTranslate()Z

    move-result v5

    .line 4
    invoke-virtual {p0}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getHorizontalTranslate()Z

    move-result v6

    .line 5
    invoke-virtual {p0}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getScale()Z

    move-result v7

    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getRotate()Z

    move-result v8

    .line 7
    invoke-virtual {p0}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getMaxHeightTimes()I

    move-result v9

    .line 8
    invoke-virtual {p0}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getMaxWidthTimes()I

    move-result v10

    const/4 v11, 0x1

    const/4 v12, 0x0

    const-wide/16 v2, 0x0

    .line 9
    invoke-direct/range {v1 .. v12}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;-><init>(JZZZZZIIILkotlin/jvm/internal/e;)V

    return-object v1
.end method

.method public static final toEzyBackgroundLineTypeEnum(Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;)Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;
    .locals 1
    .param p0    # Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    invoke-static {p0}, Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;->forNumber(I)Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string v0, "forNumber(ordinal)"

    .line 15
    .line 16
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-object p0
.end method

.method public static final toEzyConfig(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;
    .locals 2
    .param p0    # Lcom/zykj/blackboard/bean/BackgroundLineConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->newBuilder()Lb4/r;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->getLineSpace()F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iput v1, v0, Lb4/r;->c:F

    .line 15
    .line 16
    iget v1, v0, Lb4/r;->a:I

    .line 17
    .line 18
    or-int/lit8 v1, v1, 0x2

    .line 19
    .line 20
    iput v1, v0, Lb4/r;->a:I

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->getLineColor()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    iput v1, v0, Lb4/r;->b:I

    .line 30
    .line 31
    iget v1, v0, Lb4/r;->a:I

    .line 32
    .line 33
    or-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    iput v1, v0, Lb4/r;->a:I

    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->getLineWidth()F

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    iput v1, v0, Lb4/r;->e:F

    .line 45
    .line 46
    iget v1, v0, Lb4/r;->a:I

    .line 47
    .line 48
    or-int/lit8 v1, v1, 0x8

    .line 49
    .line 50
    iput v1, v0, Lb4/r;->a:I

    .line 51
    .line 52
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->getLineType()Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-static {p0}, Lcom/zykj/blackboard/utils/ConvertExtKt;->toEzyBackgroundLineTypeEnum(Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;)Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    iget v1, v0, Lb4/r;->a:I

    .line 67
    .line 68
    or-int/lit8 v1, v1, 0x4

    .line 69
    .line 70
    iput v1, v0, Lb4/r;->a:I

    .line 71
    .line 72
    invoke-virtual {p0}, Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;->getNumber()I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    iput p0, v0, Lb4/r;->d:I

    .line 77
    .line 78
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Lb4/r;->c()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0
.end method
