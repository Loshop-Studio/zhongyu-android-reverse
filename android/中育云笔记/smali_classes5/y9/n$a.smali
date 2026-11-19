.class public abstract Ly9/n$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly9/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static synthetic a(Ly9/n;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZZILjava/lang/Object;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;
    .locals 7

    .line 1
    if-nez p8, :cond_2

    .line 2
    .line 3
    and-int/lit8 p8, p7, 0x10

    .line 4
    .line 5
    if-eqz p8, :cond_0

    .line 6
    .line 7
    const/4 p5, 0x0

    .line 8
    :cond_0
    move v5, p5

    .line 9
    and-int/lit8 p5, p7, 0x20

    .line 10
    .line 11
    if-eqz p5, :cond_1

    .line 12
    .line 13
    const/4 p6, 0x1

    .line 14
    :cond_1
    move-object v0, p0

    .line 15
    move-object v1, p1

    .line 16
    move-object v2, p2

    .line 17
    move-object v3, p3

    .line 18
    move-object v4, p4

    .line 19
    move v6, p6

    .line 20
    invoke-interface/range {v0 .. v6}, Ly9/n;->E(Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZZ)Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 26
    .line 27
    const-string p1, "Super calls with default arguments not supported in this target, function: addImage"

    .line 28
    .line 29
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p0
.end method

.method public static synthetic b(Ly9/n;Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZILjava/lang/Object;)Lcom/zykj/blackboard/core/graph/group/ImageGraph;
    .locals 0

    .line 1
    if-nez p6, :cond_1

    .line 2
    .line 3
    and-int/lit8 p5, p5, 0x8

    .line 4
    .line 5
    if-eqz p5, :cond_0

    .line 6
    .line 7
    const/4 p4, 0x0

    .line 8
    :cond_0
    invoke-interface {p0, p1, p2, p3, p4}, Ly9/n;->e(Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Z)Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    const-string p1, "Super calls with default arguments not supported in this target, function: addImage"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method

.method public static synthetic c(Ly9/n;Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;IILjava/lang/Object;)Lca/d;
    .locals 0

    .line 1
    if-nez p5, :cond_1

    .line 2
    .line 3
    and-int/lit8 p4, p4, 0x4

    .line 4
    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    const/4 p3, 0x0

    .line 8
    :cond_0
    invoke-interface {p0, p1, p2, p3}, Ly9/n;->o(Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;I)Lca/d;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    const-string p1, "Super calls with default arguments not supported in this target, function: addText"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method

.method public static synthetic d(Ly9/n;Ljava/lang/Float;Ljava/lang/Float;ILjava/lang/Object;)V
    .locals 1

    .line 1
    if-nez p4, :cond_2

    .line 2
    .line 3
    and-int/lit8 p4, p3, 0x1

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p4, :cond_0

    .line 7
    .line 8
    move-object p1, v0

    .line 9
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 10
    .line 11
    if-eqz p3, :cond_1

    .line 12
    .line 13
    move-object p2, v0

    .line 14
    :cond_1
    invoke-interface {p0, p1, p2}, Ly9/n;->areaMoveEnd(Ljava/lang/Float;Ljava/lang/Float;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 19
    .line 20
    const-string p1, "Super calls with default arguments not supported in this target, function: areaMoveEnd"

    .line 21
    .line 22
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p0
.end method

.method public static synthetic e(Ly9/n;Lba/c;ILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p3, :cond_1

    .line 2
    .line 3
    and-int/lit8 p2, p2, 0x1

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    :cond_0
    invoke-interface {p0, p1}, Ly9/n;->v(Lba/c;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 13
    .line 14
    const-string p1, "Super calls with default arguments not supported in this target, function: cleanPage"

    .line 15
    .line 16
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0
.end method
