.class public interface abstract Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/layout/MeasureScope;


# annotations
.annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
.end annotation

.annotation build Landroidx/compose/runtime/Stable;
.end annotation


# virtual methods
.method public abstract measure-0kLqBqw(IJ)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJ)",
            "Ljava/util/List<",
            "Landroidx/compose/ui/layout/Placeable;",
            ">;"
        }
    .end annotation
.end method

.method public toDp-GaN1DYA(J)F
    .locals 4
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    .line 1
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/TextUnit;->getType-UIouoOA(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sget-object v2, Landroidx/compose/ui/unit/TextUnitType;->Companion:Landroidx/compose/ui/unit/TextUnitType$Companion;

    .line 6
    .line 7
    invoke-virtual {v2}, Landroidx/compose/ui/unit/TextUnitType$Companion;->getSp-UIouoOA()J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/unit/TextUnitType;->equals-impl0(JJ)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const-string v0, "Only Sp can convert to Px"

    .line 18
    .line 19
    invoke-static {v0}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/TextUnit;->getValue-impl(J)F

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-interface {p0}, Landroidx/compose/ui/unit/FontScaling;->getFontScale()F

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    mul-float/2addr p1, p2

    .line 31
    invoke-static {p1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    return p1
.end method

.method public toDp-u2uoSUM(F)F
    .locals 1
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    .line 3
    invoke-interface {p0}, Landroidx/compose/ui/unit/Density;->getDensity()F

    move-result v0

    div-float/2addr p1, v0

    .line 4
    invoke-static {p1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result p1

    return p1
.end method

.method public toDp-u2uoSUM(I)F
    .locals 1
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    int-to-float p1, p1

    .line 1
    invoke-interface {p0}, Landroidx/compose/ui/unit/Density;->getDensity()F

    move-result v0

    div-float/2addr p1, v0

    .line 2
    invoke-static {p1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result p1

    return p1
.end method

.method public toDpSize-k-rfVVM(J)J
    .locals 3
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    .line 1
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v0, p1, v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/16 v0, 0x20

    .line 11
    .line 12
    shr-long v0, p1, v0

    .line 13
    .line 14
    long-to-int v0, v0

    .line 15
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-interface {p0, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->toDp-u2uoSUM(F)F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const-wide v1, 0xffffffffL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    and-long/2addr p1, v1

    .line 29
    long-to-int p1, p1

    .line 30
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-interface {p0, p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->toDp-u2uoSUM(F)F

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-static {v0, p1}, Landroidx/compose/ui/unit/DpKt;->DpSize-YgX7TsA(FF)J

    .line 39
    .line 40
    .line 41
    move-result-wide p1

    .line 42
    return-wide p1

    .line 43
    :cond_0
    sget-object p1, Landroidx/compose/ui/unit/DpSize;->Companion:Landroidx/compose/ui/unit/DpSize$Companion;

    .line 44
    .line 45
    invoke-virtual {p1}, Landroidx/compose/ui/unit/DpSize$Companion;->getUnspecified-MYxV2XQ()J

    .line 46
    .line 47
    .line 48
    move-result-wide p1

    .line 49
    return-wide p1
.end method

.method public toSize-XkaWNTQ(J)J
    .locals 4
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    .line 1
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v0, p1, v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/DpSize;->getWidth-D9Ej5fM(J)F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-interface {p0, v0}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/DpSize;->getHeight-D9Ej5fM(J)F

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-interface {p0, p1}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    int-to-long v0, p2

    .line 31
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    int-to-long p1, p1

    .line 36
    const/16 v2, 0x20

    .line 37
    .line 38
    shl-long/2addr v0, v2

    .line 39
    const-wide v2, 0xffffffffL

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    and-long/2addr p1, v2

    .line 45
    or-long/2addr p1, v0

    .line 46
    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Size;->constructor-impl(J)J

    .line 47
    .line 48
    .line 49
    move-result-wide p1

    .line 50
    return-wide p1

    .line 51
    :cond_0
    sget-object p1, Landroidx/compose/ui/geometry/Size;->Companion:Landroidx/compose/ui/geometry/Size$Companion;

    .line 52
    .line 53
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Size$Companion;->getUnspecified-NH-jbRc()J

    .line 54
    .line 55
    .line 56
    move-result-wide p1

    .line 57
    return-wide p1
.end method

.method public toSp-0xMU5do(F)J
    .locals 2
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    .line 1
    invoke-interface {p0}, Landroidx/compose/ui/unit/FontScaling;->getFontScale()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    div-float/2addr p1, v0

    .line 6
    invoke-static {p1}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(F)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    return-wide v0
.end method

.method public toSp-kPz2Gy4(F)J
    .locals 2
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    .line 1
    invoke-interface {p0}, Landroidx/compose/ui/unit/FontScaling;->getFontScale()F

    move-result v0

    invoke-interface {p0}, Landroidx/compose/ui/unit/Density;->getDensity()F

    move-result v1

    mul-float/2addr v0, v1

    div-float/2addr p1, v0

    invoke-static {p1}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public toSp-kPz2Gy4(I)J
    .locals 2
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    int-to-float p1, p1

    .line 2
    invoke-interface {p0}, Landroidx/compose/ui/unit/FontScaling;->getFontScale()F

    move-result v0

    invoke-interface {p0}, Landroidx/compose/ui/unit/Density;->getDensity()F

    move-result v1

    mul-float/2addr v0, v1

    div-float/2addr p1, v0

    invoke-static {p1}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(F)J

    move-result-wide v0

    return-wide v0
.end method
