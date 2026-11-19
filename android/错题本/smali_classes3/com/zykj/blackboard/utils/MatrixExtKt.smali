.class public final Lcom/zykj/blackboard/utils/MatrixExtKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002\u001a\u0012\u0010\u0007\u001a\u00020\u0008*\u00020\u00022\u0006\u0010\t\u001a\u00020\n\u001a\n\u0010\u000b\u001a\u00020\u0002*\u00020\u0008\u00a8\u0006\u000c"
    }
    d2 = {
        "getScaleX",
        "",
        "Landroid/graphics/Matrix;",
        "invert",
        "mapRect",
        "Landroid/graphics/RectF;",
        "matrix",
        "toEzyMatrix",
        "Lcom/zykj/board/EzyMatrix$Matrix;",
        "eventTime",
        "",
        "toMatrix",
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
.method public static final getScaleX(Landroid/graphics/Matrix;)F
    .locals 1
    .param p0    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/16 v0, 0x9

    .line 7
    .line 8
    new-array v0, v0, [F

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/graphics/Matrix;->getValues([F)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    aget p0, v0, p0

    .line 15
    .line 16
    return p0
.end method

.method public static final invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;
    .locals 1
    .param p0    # Landroid/graphics/Matrix;
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
    new-instance v0, Landroid/graphics/Matrix;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public static final mapRect(Landroid/graphics/RectF;Landroid/graphics/Matrix;)Landroid/graphics/RectF;
    .locals 1
    .param p0    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Landroid/graphics/Matrix;
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
    const-string v0, "matrix"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroid/graphics/RectF;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0, p0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public static final toEzyMatrix(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;
    .locals 2
    .param p0    # Landroid/graphics/Matrix;
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
    invoke-static {}, Lcom/zykj/board/EzyMatrix$Matrix;->newBuilder()Lb4/b0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/16 v1, 0x9

    .line 11
    .line 12
    new-array v1, v1, [F

    .line 13
    .line 14
    invoke-virtual {p0, v1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x2

    .line 18
    aget p0, v1, p0

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Lb4/b0;->q(F)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x5

    .line 24
    aget p0, v1, p0

    .line 25
    .line 26
    invoke-virtual {v0, p0}, Lb4/b0;->r(F)V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    aget p0, v1, p0

    .line 31
    .line 32
    invoke-virtual {v0, p0}, Lb4/b0;->m(F)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x4

    .line 36
    aget p0, v1, p0

    .line 37
    .line 38
    invoke-virtual {v0, p0}, Lb4/b0;->n(F)V

    .line 39
    .line 40
    .line 41
    const/4 p0, 0x1

    .line 42
    aget p0, v1, p0

    .line 43
    .line 44
    invoke-virtual {v0, p0}, Lb4/b0;->o(F)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x3

    .line 48
    aget p0, v1, p0

    .line 49
    .line 50
    invoke-virtual {v0, p0}, Lb4/b0;->p(F)V

    .line 51
    .line 52
    .line 53
    const/4 p0, 0x6

    .line 54
    aget p0, v1, p0

    .line 55
    .line 56
    invoke-virtual {v0, p0}, Lb4/b0;->j(F)V

    .line 57
    .line 58
    .line 59
    const/4 p0, 0x7

    .line 60
    aget p0, v1, p0

    .line 61
    .line 62
    invoke-virtual {v0, p0}, Lb4/b0;->k(F)V

    .line 63
    .line 64
    .line 65
    const/16 p0, 0x8

    .line 66
    .line 67
    aget p0, v1, p0

    .line 68
    .line 69
    invoke-virtual {v0, p0}, Lb4/b0;->l(F)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, p1, p2}, Lb4/b0;->i(J)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Lb4/b0;->c()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0
.end method

.method public static final toMatrix(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;
    .locals 11
    .param p0    # Lcom/zykj/board/EzyMatrix$Matrix;
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
    new-instance v0, Landroid/graphics/Matrix;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->getTransX()F

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->getTransY()F

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->getScaleX()F

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->getScaleY()F

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->getSkewX()F

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->getSkewY()F

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->getPerSp0()F

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->getPerSp1()F

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix;->getPerSp2()F

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    const/16 v9, 0x9

    .line 48
    .line 49
    new-array v9, v9, [F

    .line 50
    .line 51
    const/4 v10, 0x0

    .line 52
    aput v3, v9, v10

    .line 53
    .line 54
    const/4 v3, 0x1

    .line 55
    aput v5, v9, v3

    .line 56
    .line 57
    const/4 v3, 0x2

    .line 58
    aput v1, v9, v3

    .line 59
    .line 60
    const/4 v1, 0x3

    .line 61
    aput v6, v9, v1

    .line 62
    .line 63
    const/4 v1, 0x4

    .line 64
    aput v4, v9, v1

    .line 65
    .line 66
    const/4 v1, 0x5

    .line 67
    aput v2, v9, v1

    .line 68
    .line 69
    const/4 v1, 0x6

    .line 70
    aput v7, v9, v1

    .line 71
    .line 72
    const/4 v1, 0x7

    .line 73
    aput v8, v9, v1

    .line 74
    .line 75
    const/16 v1, 0x8

    .line 76
    .line 77
    aput p0, v9, v1

    .line 78
    .line 79
    invoke-virtual {v0, v9}, Landroid/graphics/Matrix;->setValues([F)V

    .line 80
    .line 81
    .line 82
    return-object v0
.end method
