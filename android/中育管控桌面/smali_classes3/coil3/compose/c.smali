.class public abstract Lcoil3/compose/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/layout/ContentScale;ILandroidx/compose/runtime/Composer;II)Lcoil3/compose/AsyncImagePainter;
    .locals 9

    .line 1
    and-int/lit8 v1, p7, 0x2

    .line 2
    .line 3
    if-eqz v1, :cond_0

    .line 4
    .line 5
    sget-object p1, Lcoil3/compose/AsyncImagePainter;->s:Lcoil3/compose/AsyncImagePainter$a;

    .line 6
    .line 7
    invoke-virtual {p1}, Lcoil3/compose/AsyncImagePainter$a;->a()Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :cond_0
    move-object v2, p1

    .line 12
    and-int/lit8 p1, p7, 0x4

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    :cond_1
    move-object v3, p2

    .line 18
    and-int/lit8 p1, p7, 0x8

    .line 19
    .line 20
    if-eqz p1, :cond_2

    .line 21
    .line 22
    sget-object p1, Landroidx/compose/ui/layout/ContentScale;->Companion:Landroidx/compose/ui/layout/ContentScale$Companion;

    .line 23
    .line 24
    invoke-virtual {p1}, Landroidx/compose/ui/layout/ContentScale$Companion;->getFit()Landroidx/compose/ui/layout/ContentScale;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    :cond_2
    move-object v4, p3

    .line 29
    and-int/lit8 p1, p7, 0x10

    .line 30
    .line 31
    if-eqz p1, :cond_3

    .line 32
    .line 33
    sget-object p1, Landroidx/compose/ui/graphics/drawscope/DrawScope;->Companion:Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;

    .line 34
    .line 35
    invoke-virtual {p1}, Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;->getDefaultFilterQuality-f-v9h1I()I

    .line 36
    .line 37
    .line 38
    move-result p4

    .line 39
    :cond_3
    move v5, p4

    .line 40
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_4

    .line 45
    .line 46
    const/4 p1, -0x1

    .line 47
    const-string p2, "coil3.compose.rememberAsyncImagePainter (SingletonAsyncImagePainter.kt:82)"

    .line 48
    .line 49
    const p3, -0x4125e770

    .line 50
    .line 51
    .line 52
    invoke-static {p3, p6, p1, p2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :cond_4
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-interface {p5, p1}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Landroid/content/Context;

    .line 64
    .line 65
    invoke-static {p1}, Lcoil3/l;->a(Landroid/content/Context;)Lcoil3/e;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    and-int/lit8 p1, p6, 0xe

    .line 70
    .line 71
    shl-int/lit8 p2, p6, 0x3

    .line 72
    .line 73
    and-int/lit16 p3, p2, 0x380

    .line 74
    .line 75
    or-int/2addr p1, p3

    .line 76
    and-int/lit16 p3, p2, 0x1c00

    .line 77
    .line 78
    or-int/2addr p1, p3

    .line 79
    const p3, 0xe000

    .line 80
    .line 81
    .line 82
    and-int/2addr p3, p2

    .line 83
    or-int/2addr p1, p3

    .line 84
    const/high16 p3, 0x70000

    .line 85
    .line 86
    and-int/2addr p2, p3

    .line 87
    or-int v7, p1, p2

    .line 88
    .line 89
    const/4 v8, 0x0

    .line 90
    move-object v0, p0

    .line 91
    move-object v6, p5

    .line 92
    invoke-static/range {v0 .. v8}, Lcoil3/compose/a;->a(Ljava/lang/Object;Lcoil3/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/layout/ContentScale;ILandroidx/compose/runtime/Composer;II)Lcoil3/compose/AsyncImagePainter;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-eqz p1, :cond_5

    .line 101
    .line 102
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 103
    .line 104
    .line 105
    :cond_5
    return-object p0
.end method
