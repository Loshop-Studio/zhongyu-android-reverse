.class public final Lcoil3/compose/CrossfadePainter;
.super Landroidx/compose/ui/graphics/painter/Painter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/Stable;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lcoil3/compose/CrossfadePainter;",
        "Landroidx/compose/ui/graphics/painter/Painter;",
        "coil-compose-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCrossfadePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossfadePainter.kt\ncoil3/compose/CrossfadePainter\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,142:1\n78#2:143\n107#2,2:144\n1#3:146\n148#4:147\n148#4:148\n33#4:155\n153#4:159\n153#4:174\n153#4:175\n57#5:149\n61#5:152\n57#5:160\n61#5:163\n60#6:150\n70#6:153\n53#6,3:156\n60#6:161\n70#6:164\n22#7:151\n22#7:154\n22#7:162\n22#7:165\n108#8:166\n68#8,7:167\n*S KotlinDebug\n*F\n+ 1 CrossfadePainter.kt\ncoil3/compose/CrossfadePainter\n*L\n50#1:143\n50#1:144,2\n101#1:147\n102#1:148\n104#1:155\n123#1:159\n137#1:174\n138#1:175\n105#1:149\n106#1:152\n127#1:160\n128#1:163\n105#1:150\n106#1:153\n104#1:156,3\n127#1:161\n128#1:164\n105#1:151\n106#1:154\n127#1:162\n128#1:165\n126#1:166\n126#1:167,7\n*E\n"
    }
.end annotation


# instance fields
.field public a:Z


# virtual methods
.method public final applyAlpha(F)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final applyColorFilter(Landroidx/compose/ui/graphics/ColorFilter;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final getIntrinsicSize-NH-jbRc()J
    .locals 10

    .line 1
    sget-object v0, Landroidx/compose/ui/geometry/Size;->Companion:Landroidx/compose/ui/geometry/Size$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Size$Companion;->getZero-NH-jbRc()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Size$Companion;->getZero-NH-jbRc()J

    .line 8
    .line 9
    .line 10
    move-result-wide v3

    .line 11
    const-wide v5, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    cmp-long v7, v1, v5

    .line 17
    .line 18
    const/4 v8, 0x0

    .line 19
    const/4 v9, 0x1

    .line 20
    if-eqz v7, :cond_0

    .line 21
    .line 22
    move v7, v9

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v7, v8

    .line 25
    :goto_0
    cmp-long v5, v3, v5

    .line 26
    .line 27
    if-eqz v5, :cond_1

    .line 28
    .line 29
    move v8, v9

    .line 30
    :cond_1
    if-eqz v7, :cond_2

    .line 31
    .line 32
    if-eqz v8, :cond_2

    .line 33
    .line 34
    const/16 v0, 0x20

    .line 35
    .line 36
    shr-long v5, v1, v0

    .line 37
    .line 38
    long-to-int v5, v5

    .line 39
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    shr-long v6, v3, v0

    .line 44
    .line 45
    long-to-int v6, v6

    .line 46
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    invoke-static {v5, v6}, Ljava/lang/Math;->max(FF)F

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    const-wide v6, 0xffffffffL

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    and-long/2addr v1, v6

    .line 60
    long-to-int v1, v1

    .line 61
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    and-long v2, v3, v6

    .line 66
    .line 67
    long-to-int v2, v2

    .line 68
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    int-to-long v2, v2

    .line 81
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    int-to-long v4, v1

    .line 86
    shl-long v0, v2, v0

    .line 87
    .line 88
    and-long v2, v4, v6

    .line 89
    .line 90
    or-long/2addr v0, v2

    .line 91
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Size;->constructor-impl(J)J

    .line 92
    .line 93
    .line 94
    move-result-wide v0

    .line 95
    return-wide v0

    .line 96
    :cond_2
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Size$Companion;->getUnspecified-NH-jbRc()J

    .line 97
    .line 98
    .line 99
    move-result-wide v0

    .line 100
    return-wide v0
.end method

.method public final onDraw(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V
    .locals 0

    .line 1
    iget-boolean p1, p0, Lcoil3/compose/CrossfadePainter;->a:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 p1, 0x0

    .line 7
    throw p1
.end method
