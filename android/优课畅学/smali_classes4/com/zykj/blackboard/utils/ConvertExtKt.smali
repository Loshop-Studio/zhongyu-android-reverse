.class public final Lcom/zykj/blackboard/utils/ConvertExtKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final toBackgroundLineTypeEnum(Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;)Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    new-instance v0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 8
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->i()I

    move-result v1

    .line 9
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->j()F

    move-result v2

    .line 10
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->k()Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;

    move-result-object v3

    const-string v4, "lineType"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lcom/zykj/blackboard/utils/ConvertExtKt;->toBackgroundLineTypeEnum(Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;)Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    move-result-object v3

    .line 11
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->m()F

    move-result p0

    .line 12
    invoke-direct {v0, v1, v2, v3, p0}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;-><init>(IFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;F)V

    return-object v0
.end method

.method public static final toEntity(Lcom/zykj/blackboard/bean/Author;)Lcom/zykj/blackboard/core/data/dao/AuthorEntity;
    .locals 12

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-direct/range {v1 .. v11}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;ILkotlin/jvm/internal/n;)V

    return-object v1
.end method

.method public static final toEntity(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-direct/range {v1 .. v9}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;-><init>(JIFLcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;FILkotlin/jvm/internal/n;)V

    return-object v1
.end method

.method public static final toEntity(Lcom/zykj/blackboard/bean/MoveActionConfig;)Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;
    .locals 13

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-direct/range {v1 .. v12}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;-><init>(JZZZZZIIILkotlin/jvm/internal/n;)V

    return-object v1
.end method

.method public static final toEzyBackgroundLineTypeEnum(Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;)Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    invoke-static {p0}, Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;->a(I)Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string v0, "forNumber(ordinal)"

    .line 15
    .line 16
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-object p0
.end method

.method public static final toEzyConfig(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->n()Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;

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
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;->s(F)Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->getLineColor()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;->r(I)Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p0}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->getLineWidth()F

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;->v(F)Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p0}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->getLineType()Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0}, Lcom/zykj/blackboard/utils/ConvertExtKt;->toEzyBackgroundLineTypeEnum(Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;)Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {v0, p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;->t(Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;->e()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const-string v0, "newBuilder()\n        .se\u2026eEnum())\n        .build()"

    .line 51
    .line 52
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object p0
.end method
