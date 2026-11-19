.class public abstract Lk4/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk4/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static synthetic a(Lk4/c;Landroid/graphics/Matrix;ILjava/lang/Object;)V
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
    invoke-interface {p0, p1}, Lk4/c;->D(Landroid/graphics/Matrix;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 13
    .line 14
    const-string p1, "Super calls with default arguments not supported in this target, function: cameraChangeEnd"

    .line 15
    .line 16
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0
.end method

.method public static synthetic b(Lk4/c;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Li4/e;Li4/c;Ljava/util/List;Landroid/graphics/PointF;ILjava/lang/Object;)V
    .locals 9

    .line 1
    if-nez p9, :cond_1

    .line 2
    .line 3
    and-int/lit8 v0, p8, 0x40

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    move-object v8, v0

    .line 9
    :goto_0
    move-object v1, p0

    .line 10
    move-object v2, p1

    .line 11
    move-object v3, p2

    .line 12
    move-object v4, p3

    .line 13
    move-object v5, p4

    .line 14
    move-object v6, p5

    .line 15
    move-object v7, p6

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    move-object/from16 v8, p7

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :goto_1
    invoke-interface/range {v1 .. v8}, Lk4/c;->C(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Li4/e;Li4/c;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 25
    .line 26
    const-string p1, "Super calls with default arguments not supported in this target, function: newChangeHandleEnd"

    .line 27
    .line 28
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p0
.end method

.method public static synthetic c(Lk4/c;Lcom/zykj/blackboard/core/graph/group/GroupGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Li4/e;Li4/c;Ljava/util/List;Landroid/graphics/PointF;ILjava/lang/Object;)V
    .locals 10

    .line 1
    if-nez p10, :cond_1

    .line 2
    .line 3
    move/from16 v0, p9

    .line 4
    .line 5
    and-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    move-object v9, v0

    .line 11
    :goto_0
    move-object v1, p0

    .line 12
    move-object v2, p1

    .line 13
    move-object v3, p2

    .line 14
    move-object v4, p3

    .line 15
    move-object v5, p4

    .line 16
    move-object v6, p5

    .line 17
    move-object/from16 v7, p6

    .line 18
    .line 19
    move-object/from16 v8, p7

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    move-object/from16 v9, p8

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :goto_1
    invoke-interface/range {v1 .. v9}, Lk4/c;->l(Lcom/zykj/blackboard/core/graph/group/GroupGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Li4/e;Li4/c;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 30
    .line 31
    const-string p1, "Super calls with default arguments not supported in this target, function: newChangeHandleStart"

    .line 32
    .line 33
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p0
.end method

.method public static synthetic d(Lk4/c;Lcom/zykj/blackboard/core/graph/group/GroupGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Li4/e;Li4/c;Ljava/util/List;Landroid/graphics/PointF;ILjava/lang/Object;)V
    .locals 10

    .line 1
    if-nez p10, :cond_1

    .line 2
    .line 3
    move/from16 v0, p9

    .line 4
    .line 5
    and-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    move-object v9, v0

    .line 11
    :goto_0
    move-object v1, p0

    .line 12
    move-object v2, p1

    .line 13
    move-object v3, p2

    .line 14
    move-object v4, p3

    .line 15
    move-object v5, p4

    .line 16
    move-object v6, p5

    .line 17
    move-object/from16 v7, p6

    .line 18
    .line 19
    move-object/from16 v8, p7

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    move-object/from16 v9, p8

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :goto_1
    invoke-interface/range {v1 .. v9}, Lk4/c;->k(Lcom/zykj/blackboard/core/graph/group/GroupGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Li4/e;Li4/c;Ljava/util/List;Landroid/graphics/PointF;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 30
    .line 31
    const-string p1, "Super calls with default arguments not supported in this target, function: newChangeHandling"

    .line 32
    .line 33
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p0
.end method
