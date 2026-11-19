.class public final Lcoil3/compose/CrossfadePainter;
.super Landroidx/compose/ui/graphics/painter/Painter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/Stable;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0012\u0008\u0007\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0014\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00082\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0014\u00a2\u0006\u0004\u0008\r\u0010\u000eJ%\u0010\u0010\u001a\u00020\u0003*\u00020\u00022\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00018\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u001f\u001a\u00020\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u0017\u0010%\u001a\u00020 8\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010$R\u0017\u0010+\u001a\u00020&8\u0006\u00a2\u0006\u000c\n\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010*R\u0017\u00100\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008,\u0010-\u001a\u0004\u0008.\u0010/R+\u00107\u001a\u0002012\u0006\u00102\u001a\u0002018B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u00083\u00104\u001a\u0004\u0008!\u00105\"\u0004\u0008\'\u00106R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00089\u0010:R\u0016\u0010=\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008<\u0010-R\u0016\u0010@\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008>\u0010?R\u0018\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008A\u0010BR(\u0010F\u001a\u0004\u0018\u00010\u00012\u0008\u0010C\u001a\u0004\u0018\u00010\u00018\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008D\u0010\u0017\u001a\u0004\u0008E\u0010\u0019R\u001a\u0010I\u001a\u00020\u00128\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008G\u0010\"\u001a\u0004\u0008H\u0010$\u00a8\u0006J"
    }
    d2 = {
        "Lcoil3/compose/CrossfadePainter;",
        "Landroidx/compose/ui/graphics/painter/Painter;",
        "Landroidx/compose/ui/graphics/drawscope/DrawScope;",
        "",
        "onDraw",
        "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V",
        "",
        "alpha",
        "",
        "applyAlpha",
        "(F)Z",
        "Landroidx/compose/ui/graphics/ColorFilter;",
        "colorFilter",
        "applyColorFilter",
        "(Landroidx/compose/ui/graphics/ColorFilter;)Z",
        "painter",
        "b",
        "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/painter/Painter;F)V",
        "Landroidx/compose/ui/geometry/Size;",
        "srcSize",
        "dstSize",
        "a",
        "(JJ)J",
        "Landroidx/compose/ui/graphics/painter/Painter;",
        "getEnd",
        "()Landroidx/compose/ui/graphics/painter/Painter;",
        "end",
        "Landroidx/compose/ui/layout/ContentScale;",
        "Landroidx/compose/ui/layout/ContentScale;",
        "getContentScale",
        "()Landroidx/compose/ui/layout/ContentScale;",
        "contentScale",
        "Lkotlin/time/Duration;",
        "c",
        "J",
        "getDuration-UwyO8pc",
        "()J",
        "duration",
        "Lkotlin/time/TimeSource;",
        "d",
        "Lkotlin/time/TimeSource;",
        "getTimeSource",
        "()Lkotlin/time/TimeSource;",
        "timeSource",
        "e",
        "Z",
        "getFadeStart",
        "()Z",
        "fadeStart",
        "",
        "<set-?>",
        "f",
        "Landroidx/compose/runtime/MutableIntState;",
        "()I",
        "(I)V",
        "invalidateTick",
        "Lkotlin/time/TimeMark;",
        "g",
        "Lkotlin/time/TimeMark;",
        "startTime",
        "h",
        "isDone",
        "i",
        "F",
        "maxAlpha",
        "j",
        "Landroidx/compose/ui/graphics/ColorFilter;",
        "value",
        "k",
        "getStart",
        "start",
        "l",
        "getIntrinsicSize-NH-jbRc",
        "intrinsicSize",
        "coil-compose-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCrossfadePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossfadePainter.kt\ncoil3/compose/CrossfadePainter\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,141:1\n78#2:142\n107#2,2:143\n1#3:145\n148#4:146\n148#4:147\n33#4:154\n153#4:158\n153#4:173\n153#4:174\n57#5:148\n61#5:151\n57#5:159\n61#5:162\n60#6:149\n70#6:152\n53#6,3:155\n60#6:160\n70#6:163\n22#7:150\n22#7:153\n22#7:161\n22#7:164\n108#8:165\n68#8,7:166\n*S KotlinDebug\n*F\n+ 1 CrossfadePainter.kt\ncoil3/compose/CrossfadePainter\n*L\n50#1:142\n50#1:143,2\n100#1:146\n101#1:147\n103#1:154\n122#1:158\n136#1:173\n137#1:174\n104#1:148\n105#1:151\n126#1:159\n127#1:162\n104#1:149\n105#1:152\n103#1:155,3\n126#1:160\n127#1:163\n104#1:150\n105#1:153\n126#1:161\n127#1:164\n125#1:165\n125#1:166,7\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Landroidx/compose/ui/graphics/painter/Painter;

.field public final b:Landroidx/compose/ui/layout/ContentScale;

.field public final c:J

.field public final d:Lkotlin/time/TimeSource;

.field public final e:Z

.field public final f:Landroidx/compose/runtime/MutableIntState;

.field public g:Lkotlin/time/TimeMark;

.field public h:Z

.field public i:F

.field public j:Landroidx/compose/ui/graphics/ColorFilter;

.field public k:Landroidx/compose/ui/graphics/painter/Painter;

.field public final l:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final a(JJ)J
    .locals 3

    .line 1
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v2, p1, v0

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    return-wide p3

    .line 11
    :cond_0
    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Size;->isEmpty-impl(J)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    cmp-long v0, p3, v0

    .line 19
    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    return-wide p3

    .line 23
    :cond_2
    invoke-static {p3, p4}, Landroidx/compose/ui/geometry/Size;->isEmpty-impl(J)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    :goto_0
    return-wide p3

    .line 30
    :cond_3
    iget-object v0, p0, Lcoil3/compose/CrossfadePainter;->b:Landroidx/compose/ui/layout/ContentScale;

    .line 31
    .line 32
    invoke-interface {v0, p1, p2, p3, p4}, Landroidx/compose/ui/layout/ContentScale;->computeScaleFactor-H7hwNQA(JJ)J

    .line 33
    .line 34
    .line 35
    move-result-wide p3

    .line 36
    invoke-static {p1, p2, p3, p4}, Landroidx/compose/ui/layout/ScaleFactorKt;->times-UQTWf7w(JJ)J

    .line 37
    .line 38
    .line 39
    move-result-wide p1

    .line 40
    return-wide p1
.end method

.method public applyAlpha(F)Z
    .locals 0

    .line 1
    iput p1, p0, Lcoil3/compose/CrossfadePainter;->i:F

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1
.end method

.method public applyColorFilter(Landroidx/compose/ui/graphics/ColorFilter;)Z
    .locals 0

    .line 1
    iput-object p1, p0, Lcoil3/compose/CrossfadePainter;->j:Landroidx/compose/ui/graphics/ColorFilter;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1
.end method

.method public final b(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/painter/Painter;F)V
    .locals 10

    .line 1
    if-eqz p2, :cond_3

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    cmpg-float v0, p3, v0

    .line 5
    .line 6
    if-gtz v0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_1

    .line 9
    .line 10
    :cond_0
    invoke-interface {p1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    invoke-virtual {p2}, Landroidx/compose/ui/graphics/painter/Painter;->getIntrinsicSize-NH-jbRc()J

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    invoke-virtual {p0, v2, v3, v0, v1}, Lcoil3/compose/CrossfadePainter;->a(JJ)J

    .line 19
    .line 20
    .line 21
    move-result-wide v6

    .line 22
    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmp-long v2, v0, v2

    .line 28
    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Size;->isEmpty-impl(J)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    :goto_0
    iget-object v9, p0, Lcoil3/compose/CrossfadePainter;->j:Landroidx/compose/ui/graphics/ColorFilter;

    .line 39
    .line 40
    move-object v5, p1

    .line 41
    move-object v4, p2

    .line 42
    move v8, p3

    .line 43
    invoke-virtual/range {v4 .. v9}, Landroidx/compose/ui/graphics/painter/Painter;->draw-x_KDEd0(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFLandroidx/compose/ui/graphics/ColorFilter;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_2
    move-object v5, p1

    .line 48
    move-object v4, p2

    .line 49
    move v8, p3

    .line 50
    const/16 p1, 0x20

    .line 51
    .line 52
    shr-long p2, v0, p1

    .line 53
    .line 54
    long-to-int p2, p2

    .line 55
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    shr-long v2, v6, p1

    .line 60
    .line 61
    long-to-int p1, v2

    .line 62
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    sub-float/2addr p2, p1

    .line 67
    const/4 p1, 0x2

    .line 68
    int-to-float p1, p1

    .line 69
    div-float/2addr p2, p1

    .line 70
    const-wide v2, 0xffffffffL

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    and-long/2addr v0, v2

    .line 76
    long-to-int p3, v0

    .line 77
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 78
    .line 79
    .line 80
    move-result p3

    .line 81
    and-long v0, v6, v2

    .line 82
    .line 83
    long-to-int v0, v0

    .line 84
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    sub-float/2addr p3, v0

    .line 89
    div-float/2addr p3, p1

    .line 90
    invoke-interface {v5}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-interface {p1}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getTransform()Landroidx/compose/ui/graphics/drawscope/DrawTransform;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-interface {p1, p2, p3, p2, p3}, Landroidx/compose/ui/graphics/drawscope/DrawTransform;->inset(FFFF)V

    .line 99
    .line 100
    .line 101
    :try_start_0
    iget-object v9, p0, Lcoil3/compose/CrossfadePainter;->j:Landroidx/compose/ui/graphics/ColorFilter;

    .line 102
    .line 103
    invoke-virtual/range {v4 .. v9}, Landroidx/compose/ui/graphics/painter/Painter;->draw-x_KDEd0(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFLandroidx/compose/ui/graphics/ColorFilter;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    .line 105
    .line 106
    invoke-interface {v5}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-interface {p1}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getTransform()Landroidx/compose/ui/graphics/drawscope/DrawTransform;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    neg-float p2, p2

    .line 115
    neg-float p3, p3

    .line 116
    invoke-interface {p1, p2, p3, p2, p3}, Landroidx/compose/ui/graphics/drawscope/DrawTransform;->inset(FFFF)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :catchall_0
    move-exception v0

    .line 121
    move-object p1, v0

    .line 122
    invoke-interface {v5}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getDrawContext()Landroidx/compose/ui/graphics/drawscope/DrawContext;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-interface {v0}, Landroidx/compose/ui/graphics/drawscope/DrawContext;->getTransform()Landroidx/compose/ui/graphics/drawscope/DrawTransform;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    neg-float p2, p2

    .line 131
    neg-float p3, p3

    .line 132
    invoke-interface {v0, p2, p3, p2, p3}, Landroidx/compose/ui/graphics/drawscope/DrawTransform;->inset(FFFF)V

    .line 133
    .line 134
    .line 135
    throw p1

    .line 136
    :cond_3
    :goto_1
    return-void
.end method

.method public final c()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/compose/CrossfadePainter;->f:Landroidx/compose/runtime/MutableIntState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/IntState;->getIntValue()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final d(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/compose/CrossfadePainter;->f:Landroidx/compose/runtime/MutableIntState;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableIntState;->setIntValue(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getIntrinsicSize-NH-jbRc()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcoil3/compose/CrossfadePainter;->l:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public onDraw(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcoil3/compose/CrossfadePainter;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcoil3/compose/CrossfadePainter;->a:Landroidx/compose/ui/graphics/painter/Painter;

    .line 6
    .line 7
    iget v1, p0, Lcoil3/compose/CrossfadePainter;->i:F

    .line 8
    .line 9
    invoke-virtual {p0, p1, v0, v1}, Lcoil3/compose/CrossfadePainter;->b(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/painter/Painter;F)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, Lcoil3/compose/CrossfadePainter;->g:Lkotlin/time/TimeMark;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lcoil3/compose/CrossfadePainter;->d:Lkotlin/time/TimeSource;

    .line 18
    .line 19
    invoke-interface {v0}, Lkotlin/time/TimeSource;->markNow()Lkotlin/time/TimeMark;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lcoil3/compose/CrossfadePainter;->g:Lkotlin/time/TimeMark;

    .line 24
    .line 25
    :cond_1
    invoke-interface {v0}, Lkotlin/time/TimeMark;->elapsedNow-UwyO8pc()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    invoke-static {v0, v1}, Lkotlin/time/Duration;->getInWholeMilliseconds-impl(J)J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    long-to-float v0, v0

    .line 34
    iget-wide v1, p0, Lcoil3/compose/CrossfadePainter;->c:J

    .line 35
    .line 36
    invoke-static {v1, v2}, Lkotlin/time/Duration;->getInWholeMilliseconds-impl(J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v1

    .line 40
    long-to-float v1, v1

    .line 41
    div-float/2addr v0, v1

    .line 42
    const/4 v1, 0x0

    .line 43
    const/high16 v2, 0x3f800000    # 1.0f

    .line 44
    .line 45
    invoke-static {v0, v1, v2}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    iget v3, p0, Lcoil3/compose/CrossfadePainter;->i:F

    .line 50
    .line 51
    mul-float/2addr v1, v3

    .line 52
    iget-boolean v4, p0, Lcoil3/compose/CrossfadePainter;->e:Z

    .line 53
    .line 54
    if-eqz v4, :cond_2

    .line 55
    .line 56
    sub-float/2addr v3, v1

    .line 57
    :cond_2
    cmpl-float v0, v0, v2

    .line 58
    .line 59
    const/4 v2, 0x1

    .line 60
    if-ltz v0, :cond_3

    .line 61
    .line 62
    move v0, v2

    .line 63
    goto :goto_0

    .line 64
    :cond_3
    const/4 v0, 0x0

    .line 65
    :goto_0
    iput-boolean v0, p0, Lcoil3/compose/CrossfadePainter;->h:Z

    .line 66
    .line 67
    iget-object v0, p0, Lcoil3/compose/CrossfadePainter;->k:Landroidx/compose/ui/graphics/painter/Painter;

    .line 68
    .line 69
    invoke-virtual {p0, p1, v0, v3}, Lcoil3/compose/CrossfadePainter;->b(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/painter/Painter;F)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Lcoil3/compose/CrossfadePainter;->a:Landroidx/compose/ui/graphics/painter/Painter;

    .line 73
    .line 74
    invoke-virtual {p0, p1, v0, v1}, Lcoil3/compose/CrossfadePainter;->b(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/painter/Painter;F)V

    .line 75
    .line 76
    .line 77
    iget-boolean p1, p0, Lcoil3/compose/CrossfadePainter;->h:Z

    .line 78
    .line 79
    if-eqz p1, :cond_4

    .line 80
    .line 81
    const/4 p1, 0x0

    .line 82
    iput-object p1, p0, Lcoil3/compose/CrossfadePainter;->k:Landroidx/compose/ui/graphics/painter/Painter;

    .line 83
    .line 84
    return-void

    .line 85
    :cond_4
    invoke-virtual {p0}, Lcoil3/compose/CrossfadePainter;->c()I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    add-int/2addr p1, v2

    .line 90
    invoke-virtual {p0, p1}, Lcoil3/compose/CrossfadePainter;->d(I)V

    .line 91
    .line 92
    .line 93
    return-void
.end method
