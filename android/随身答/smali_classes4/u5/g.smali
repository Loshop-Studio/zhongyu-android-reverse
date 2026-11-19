.class public abstract Lu5/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;)Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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

.method public static final b(Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;)Lcom/zykj/blackboard/bean/BackgroundLineConfig;
    .locals 4

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->b()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->c()F

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->d()Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-static {v3}, Lu5/g;->a(Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;)Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->e()F

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    invoke-direct {v0, v1, v2, v3, p0}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;-><init>(IFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;F)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method

.method public static final c(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/blackboard/bean/BackgroundLineConfig;
    .locals 5

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->u()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->v()F

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->w()Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    const-string v4, "lineType"

    .line 21
    .line 22
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v3}, Lu5/g;->a(Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;)Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->y()F

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    invoke-direct {v0, v1, v2, v3, p0}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;-><init>(IFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;F)V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method

.method public static final d(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;
    .locals 10

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->a()I

    .line 9
    .line 10
    .line 11
    move-result v4

    .line 12
    invoke-virtual {p0}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->b()F

    .line 13
    .line 14
    .line 15
    move-result v5

    .line 16
    invoke-virtual {p0}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->c()Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, Lu5/g;->f(Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;)Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    invoke-virtual {p0}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->d()F

    .line 25
    .line 26
    .line 27
    move-result v7

    .line 28
    const/4 v8, 0x1

    .line 29
    const/4 v9, 0x0

    .line 30
    const-wide/16 v2, 0x0

    .line 31
    .line 32
    invoke-direct/range {v1 .. v9}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;-><init>(JIFLcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 33
    .line 34
    .line 35
    return-object v1
.end method

.method public static final e(Lv4/d;)Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;
    .locals 13

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;

    .line 7
    .line 8
    invoke-virtual {p0}, Lv4/d;->g()Z

    .line 9
    .line 10
    .line 11
    move-result v4

    .line 12
    invoke-virtual {p0}, Lv4/d;->f()Z

    .line 13
    .line 14
    .line 15
    move-result v5

    .line 16
    invoke-virtual {p0}, Lv4/d;->a()Z

    .line 17
    .line 18
    .line 19
    move-result v6

    .line 20
    invoke-virtual {p0}, Lv4/d;->e()Z

    .line 21
    .line 22
    .line 23
    move-result v7

    .line 24
    invoke-virtual {p0}, Lv4/d;->d()Z

    .line 25
    .line 26
    .line 27
    move-result v8

    .line 28
    invoke-virtual {p0}, Lv4/d;->b()I

    .line 29
    .line 30
    .line 31
    move-result v9

    .line 32
    invoke-virtual {p0}, Lv4/d;->c()I

    .line 33
    .line 34
    .line 35
    move-result v10

    .line 36
    const/4 v11, 0x1

    .line 37
    const/4 v12, 0x0

    .line 38
    const-wide/16 v2, 0x0

    .line 39
    .line 40
    invoke-direct/range {v1 .. v12}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;-><init>(JZZZZZIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 41
    .line 42
    .line 43
    return-object v1
.end method

.method public static final f(Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;)Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    invoke-static {p0}, Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;->c(I)Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string v0, "forNumber(ordinal)"

    .line 15
    .line 16
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-object p0
.end method

.method public static final g(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig;->z()Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->b()F

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->a()I

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->d()F

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->c()Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0}, Lu5/g;->f(Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;)Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$BackgroundLineConfig$b;->d()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const-string v0, "newBuilder()\n        .se\u2026eEnum())\n        .build()"

    .line 51
    .line 52
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object p0
.end method
