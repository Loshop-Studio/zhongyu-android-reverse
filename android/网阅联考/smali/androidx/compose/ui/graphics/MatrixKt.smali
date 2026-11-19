.class public final Landroidx/compose/ui/graphics/MatrixKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0017\u0010\n\u001a\u00020\u000b*\u00020\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u000e"
    }
    d2 = {
        "dot",
        "",
        "m1",
        "Landroidx/compose/ui/graphics/Matrix;",
        "row",
        "",
        "m2",
        "column",
        "dot-p89u6pk",
        "([FI[FI)F",
        "isIdentity",
        "",
        "isIdentity-58bKbWc",
        "([F)Z",
        "ui-graphics_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/MatrixKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,440:1\n39#2:441\n39#2:442\n39#2:443\n39#2:444\n39#2:445\n*S KotlinDebug\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/MatrixKt\n*L\n423#1:441\n424#1:442\n425#1:443\n426#1:444\n434#1:445\n*E\n"
    }
.end annotation


# direct methods
.method public static final synthetic access$dot-p89u6pk([FI[FI)F
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/ui/graphics/MatrixKt;->dot-p89u6pk([FI[FI)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final dot-p89u6pk([FI[FI)F
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    mul-int/2addr p1, v0

    .line 3
    add-int/lit8 v1, p1, 0x0

    .line 4
    .line 5
    aget v1, p0, v1

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    add-int/2addr v2, p3

    .line 9
    aget v2, p2, v2

    .line 10
    .line 11
    mul-float/2addr v1, v2

    .line 12
    add-int/lit8 v2, p1, 0x1

    .line 13
    .line 14
    aget v2, p0, v2

    .line 15
    .line 16
    add-int/2addr v0, p3

    .line 17
    aget v0, p2, v0

    .line 18
    .line 19
    mul-float/2addr v2, v0

    .line 20
    add-float/2addr v1, v2

    .line 21
    add-int/lit8 v0, p1, 0x2

    .line 22
    .line 23
    aget v0, p0, v0

    .line 24
    .line 25
    const/16 v2, 0x8

    .line 26
    .line 27
    add-int/2addr v2, p3

    .line 28
    aget v2, p2, v2

    .line 29
    .line 30
    mul-float/2addr v0, v2

    .line 31
    add-float/2addr v1, v0

    .line 32
    add-int/lit8 p1, p1, 0x3

    .line 33
    .line 34
    aget p0, p0, p1

    .line 35
    .line 36
    const/16 p1, 0xc

    .line 37
    .line 38
    add-int/2addr p1, p3

    .line 39
    aget p1, p2, p1

    .line 40
    .line 41
    mul-float/2addr p0, p1

    .line 42
    add-float/2addr v1, p0

    .line 43
    return v1
.end method

.method public static final isIdentity-58bKbWc([F)Z
    .locals 7

    .line 1
    const-string v0, "$this$isIdentity"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    move v1, v0

    .line 8
    :goto_0
    const/4 v2, 0x4

    .line 9
    const/4 v3, 0x1

    .line 10
    if-ge v1, v2, :cond_4

    .line 11
    .line 12
    move v4, v0

    .line 13
    :goto_1
    if-ge v4, v2, :cond_3

    .line 14
    .line 15
    if-ne v1, v4, :cond_0

    .line 16
    .line 17
    const/high16 v5, 0x3f800000    # 1.0f

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_0
    const/4 v5, 0x0

    .line 21
    :goto_2
    mul-int/lit8 v6, v1, 0x4

    .line 22
    .line 23
    add-int/2addr v6, v4

    .line 24
    aget v6, p0, v6

    .line 25
    .line 26
    cmpg-float v5, v6, v5

    .line 27
    .line 28
    if-nez v5, :cond_1

    .line 29
    .line 30
    move v5, v3

    .line 31
    goto :goto_3

    .line 32
    :cond_1
    move v5, v0

    .line 33
    :goto_3
    if-nez v5, :cond_2

    .line 34
    .line 35
    return v0

    .line 36
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_4
    return v3
.end method
