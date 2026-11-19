.class public Lcom/zykj/paint/util/LineUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static lineSpace(IIII)D
    .locals 0

    .line 1
    sub-int/2addr p0, p2

    .line 2
    mul-int/2addr p0, p0

    .line 3
    sub-int/2addr p1, p3

    .line 4
    mul-int/2addr p1, p1

    .line 5
    add-int/2addr p0, p1

    .line 6
    int-to-double p0, p0

    .line 7
    invoke-static {p0, p1}, Ljava/lang/Math;->sqrt(D)D

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    return-wide p0
.end method

.method public static point2Line(Lcom/zykj/paint/Actions$EzyPoint;Lcom/zykj/paint/Actions$EzyPoint;DD)D
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$EzyPoint;->getX()D

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    double-to-int v0, v0

    .line 6
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$EzyPoint;->getY()D

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    double-to-int p0, v1

    .line 11
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyPoint;->getX()D

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    double-to-int v1, v1

    .line 16
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyPoint;->getY()D

    .line 17
    .line 18
    .line 19
    move-result-wide v2

    .line 20
    double-to-int p1, v2

    .line 21
    double-to-int p2, p2

    .line 22
    double-to-int p5, p4

    .line 23
    move p3, p1

    .line 24
    move p4, p2

    .line 25
    move p2, v1

    .line 26
    move p1, p0

    .line 27
    move p0, v0

    .line 28
    invoke-static/range {p0 .. p5}, Lcom/zykj/paint/util/LineUtils;->pointToLine(IIIIII)D

    .line 29
    .line 30
    .line 31
    move-result-wide p0

    .line 32
    return-wide p0
.end method

.method public static point2Polyline(Lcom/zykj/paint/Actions$NewPolylineData;DD)D
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$NewPolylineData;->getPointsCount()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v4, 0x0

    .line 8
    const-wide/16 v5, 0x0

    .line 9
    .line 10
    :cond_0
    :goto_0
    add-int/lit8 v7, v1, -0x1

    .line 11
    .line 12
    if-ge v4, v7, :cond_2

    .line 13
    .line 14
    invoke-virtual {v0, v4}, Lcom/zykj/paint/Actions$NewPolylineData;->getPoints(I)Lcom/zykj/paint/Actions$EzyPoint;

    .line 15
    .line 16
    .line 17
    move-result-object v7

    .line 18
    add-int/lit8 v4, v4, 0x1

    .line 19
    .line 20
    invoke-virtual {v0, v4}, Lcom/zykj/paint/Actions$NewPolylineData;->getPoints(I)Lcom/zykj/paint/Actions$EzyPoint;

    .line 21
    .line 22
    .line 23
    move-result-object v8

    .line 24
    invoke-virtual {v7}, Lcom/zykj/paint/Actions$EzyPoint;->getX()D

    .line 25
    .line 26
    .line 27
    move-result-wide v9

    .line 28
    double-to-int v11, v9

    .line 29
    invoke-virtual {v7}, Lcom/zykj/paint/Actions$EzyPoint;->getY()D

    .line 30
    .line 31
    .line 32
    move-result-wide v9

    .line 33
    double-to-int v12, v9

    .line 34
    invoke-virtual {v8}, Lcom/zykj/paint/Actions$EzyPoint;->getX()D

    .line 35
    .line 36
    .line 37
    move-result-wide v9

    .line 38
    double-to-int v13, v9

    .line 39
    invoke-virtual {v8}, Lcom/zykj/paint/Actions$EzyPoint;->getY()D

    .line 40
    .line 41
    .line 42
    move-result-wide v7

    .line 43
    double-to-int v14, v7

    .line 44
    move-wide/from16 v7, p1

    .line 45
    .line 46
    double-to-int v15, v7

    .line 47
    move-wide/from16 v9, p3

    .line 48
    .line 49
    const-wide/16 v17, 0x0

    .line 50
    .line 51
    double-to-int v2, v9

    .line 52
    move/from16 v16, v2

    .line 53
    .line 54
    invoke-static/range {v11 .. v16}, Lcom/zykj/paint/util/LineUtils;->pointToLine(IIIIII)D

    .line 55
    .line 56
    .line 57
    move-result-wide v2

    .line 58
    cmpl-double v11, v5, v17

    .line 59
    .line 60
    if-nez v11, :cond_1

    .line 61
    .line 62
    move-wide v5, v2

    .line 63
    :cond_1
    cmpl-double v11, v5, v2

    .line 64
    .line 65
    if-lez v11, :cond_0

    .line 66
    .line 67
    move-wide v5, v2

    .line 68
    goto :goto_0

    .line 69
    :cond_2
    return-wide v5
.end method

.method public static pointToLine(IIIIII)D
    .locals 8

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/paint/util/LineUtils;->lineSpace(IIII)D

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {p0, p1, p4, p5}, Lcom/zykj/paint/util/LineUtils;->lineSpace(IIII)D

    .line 6
    .line 7
    .line 8
    move-result-wide p0

    .line 9
    invoke-static {p2, p3, p4, p5}, Lcom/zykj/paint/util/LineUtils;->lineSpace(IIII)D

    .line 10
    .line 11
    .line 12
    move-result-wide p2

    .line 13
    add-double p4, p2, p0

    .line 14
    .line 15
    cmpl-double p4, p4, v0

    .line 16
    .line 17
    if-nez p4, :cond_0

    .line 18
    .line 19
    const-wide/16 p0, 0x0

    .line 20
    .line 21
    return-wide p0

    .line 22
    :cond_0
    const-wide p4, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmpg-double p4, v0, p4

    .line 28
    .line 29
    if-gtz p4, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    mul-double p4, p2, p2

    .line 33
    .line 34
    mul-double v2, v0, v0

    .line 35
    .line 36
    mul-double v4, p0, p0

    .line 37
    .line 38
    add-double v6, v2, v4

    .line 39
    .line 40
    cmpl-double v6, p4, v6

    .line 41
    .line 42
    if-ltz v6, :cond_2

    .line 43
    .line 44
    :goto_0
    return-wide p0

    .line 45
    :cond_2
    add-double/2addr v2, p4

    .line 46
    cmpl-double p4, v4, v2

    .line 47
    .line 48
    if-ltz p4, :cond_3

    .line 49
    .line 50
    return-wide p2

    .line 51
    :cond_3
    add-double p4, v0, p0

    .line 52
    .line 53
    add-double/2addr p4, p2

    .line 54
    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    .line 55
    .line 56
    div-double/2addr p4, v2

    .line 57
    sub-double v4, p4, v0

    .line 58
    .line 59
    mul-double/2addr v4, p4

    .line 60
    sub-double p0, p4, p0

    .line 61
    .line 62
    mul-double/2addr v4, p0

    .line 63
    sub-double/2addr p4, p2

    .line 64
    mul-double/2addr v4, p4

    .line 65
    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    .line 66
    .line 67
    .line 68
    move-result-wide p0

    .line 69
    mul-double/2addr p0, v2

    .line 70
    div-double/2addr p0, v0

    .line 71
    return-wide p0
.end method
