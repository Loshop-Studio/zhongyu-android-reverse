.class final Landroidx/compose/ui/node/LayerPositionalProperties;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\u0008\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0000J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0019\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u000cR\u000e\u0010\r\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u0016"
    }
    d2 = {
        "Landroidx/compose/ui/node/LayerPositionalProperties;",
        "",
        "()V",
        "cameraDistance",
        "",
        "rotationX",
        "rotationY",
        "rotationZ",
        "scaleX",
        "scaleY",
        "transformOrigin",
        "Landroidx/compose/ui/graphics/TransformOrigin;",
        "J",
        "translationX",
        "translationY",
        "copyFrom",
        "",
        "scope",
        "Landroidx/compose/ui/graphics/GraphicsLayerScope;",
        "other",
        "hasSameValuesAs",
        "",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private cameraDistance:F

.field private rotationX:F

.field private rotationY:F

.field private rotationZ:F

.field private scaleX:F

.field private scaleY:F

.field private transformOrigin:J

.field private translationX:F

.field private translationY:F


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iput v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->scaleX:F

    .line 7
    .line 8
    iput v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->scaleY:F

    .line 9
    .line 10
    const/high16 v0, 0x41000000    # 8.0f

    .line 11
    .line 12
    iput v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->cameraDistance:F

    .line 13
    .line 14
    sget-object v0, Landroidx/compose/ui/graphics/TransformOrigin;->Companion:Landroidx/compose/ui/graphics/TransformOrigin$Companion;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/TransformOrigin$Companion;->getCenter-SzJe1aQ()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    iput-wide v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->transformOrigin:J

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final copyFrom(Landroidx/compose/ui/graphics/GraphicsLayerScope;)V
    .locals 2

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-interface {p1}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->getScaleX()F

    move-result v0

    iput v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->scaleX:F

    .line 11
    invoke-interface {p1}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->getScaleY()F

    move-result v0

    iput v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->scaleY:F

    .line 12
    invoke-interface {p1}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->getTranslationX()F

    move-result v0

    iput v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->translationX:F

    .line 13
    invoke-interface {p1}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->getTranslationY()F

    move-result v0

    iput v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->translationY:F

    .line 14
    invoke-interface {p1}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->getRotationX()F

    move-result v0

    iput v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->rotationX:F

    .line 15
    invoke-interface {p1}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->getRotationY()F

    move-result v0

    iput v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->rotationY:F

    .line 16
    invoke-interface {p1}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->getRotationZ()F

    move-result v0

    iput v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->rotationZ:F

    .line 17
    invoke-interface {p1}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->getCameraDistance()F

    move-result v0

    iput v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->cameraDistance:F

    .line 18
    invoke-interface {p1}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->getTransformOrigin-SzJe1aQ()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->transformOrigin:J

    return-void
.end method

.method public final copyFrom(Landroidx/compose/ui/node/LayerPositionalProperties;)V
    .locals 2

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget v0, p1, Landroidx/compose/ui/node/LayerPositionalProperties;->scaleX:F

    iput v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->scaleX:F

    .line 2
    iget v0, p1, Landroidx/compose/ui/node/LayerPositionalProperties;->scaleY:F

    iput v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->scaleY:F

    .line 3
    iget v0, p1, Landroidx/compose/ui/node/LayerPositionalProperties;->translationX:F

    iput v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->translationX:F

    .line 4
    iget v0, p1, Landroidx/compose/ui/node/LayerPositionalProperties;->translationY:F

    iput v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->translationY:F

    .line 5
    iget v0, p1, Landroidx/compose/ui/node/LayerPositionalProperties;->rotationX:F

    iput v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->rotationX:F

    .line 6
    iget v0, p1, Landroidx/compose/ui/node/LayerPositionalProperties;->rotationY:F

    iput v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->rotationY:F

    .line 7
    iget v0, p1, Landroidx/compose/ui/node/LayerPositionalProperties;->rotationZ:F

    iput v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->rotationZ:F

    .line 8
    iget v0, p1, Landroidx/compose/ui/node/LayerPositionalProperties;->cameraDistance:F

    iput v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->cameraDistance:F

    .line 9
    iget-wide v0, p1, Landroidx/compose/ui/node/LayerPositionalProperties;->transformOrigin:J

    iput-wide v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->transformOrigin:J

    return-void
.end method

.method public final hasSameValuesAs(Landroidx/compose/ui/node/LayerPositionalProperties;)Z
    .locals 7

    .line 1
    const-string v0, "other"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->scaleX:F

    .line 7
    .line 8
    iget v1, p1, Landroidx/compose/ui/node/LayerPositionalProperties;->scaleX:F

    .line 9
    .line 10
    cmpg-float v0, v0, v1

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    move v0, v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v2

    .line 19
    :goto_0
    if-eqz v0, :cond_8

    .line 20
    .line 21
    iget v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->scaleY:F

    .line 22
    .line 23
    iget v3, p1, Landroidx/compose/ui/node/LayerPositionalProperties;->scaleY:F

    .line 24
    .line 25
    cmpg-float v0, v0, v3

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    move v0, v1

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v0, v2

    .line 32
    :goto_1
    if-eqz v0, :cond_8

    .line 33
    .line 34
    iget v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->translationX:F

    .line 35
    .line 36
    iget v3, p1, Landroidx/compose/ui/node/LayerPositionalProperties;->translationX:F

    .line 37
    .line 38
    cmpg-float v0, v0, v3

    .line 39
    .line 40
    if-nez v0, :cond_2

    .line 41
    .line 42
    move v0, v1

    .line 43
    goto :goto_2

    .line 44
    :cond_2
    move v0, v2

    .line 45
    :goto_2
    if-eqz v0, :cond_8

    .line 46
    .line 47
    iget v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->translationY:F

    .line 48
    .line 49
    iget v3, p1, Landroidx/compose/ui/node/LayerPositionalProperties;->translationY:F

    .line 50
    .line 51
    cmpg-float v0, v0, v3

    .line 52
    .line 53
    if-nez v0, :cond_3

    .line 54
    .line 55
    move v0, v1

    .line 56
    goto :goto_3

    .line 57
    :cond_3
    move v0, v2

    .line 58
    :goto_3
    if-eqz v0, :cond_8

    .line 59
    .line 60
    iget v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->rotationX:F

    .line 61
    .line 62
    iget v3, p1, Landroidx/compose/ui/node/LayerPositionalProperties;->rotationX:F

    .line 63
    .line 64
    cmpg-float v0, v0, v3

    .line 65
    .line 66
    if-nez v0, :cond_4

    .line 67
    .line 68
    move v0, v1

    .line 69
    goto :goto_4

    .line 70
    :cond_4
    move v0, v2

    .line 71
    :goto_4
    if-eqz v0, :cond_8

    .line 72
    .line 73
    iget v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->rotationY:F

    .line 74
    .line 75
    iget v3, p1, Landroidx/compose/ui/node/LayerPositionalProperties;->rotationY:F

    .line 76
    .line 77
    cmpg-float v0, v0, v3

    .line 78
    .line 79
    if-nez v0, :cond_5

    .line 80
    .line 81
    move v0, v1

    .line 82
    goto :goto_5

    .line 83
    :cond_5
    move v0, v2

    .line 84
    :goto_5
    if-eqz v0, :cond_8

    .line 85
    .line 86
    iget v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->rotationZ:F

    .line 87
    .line 88
    iget v3, p1, Landroidx/compose/ui/node/LayerPositionalProperties;->rotationZ:F

    .line 89
    .line 90
    cmpg-float v0, v0, v3

    .line 91
    .line 92
    if-nez v0, :cond_6

    .line 93
    .line 94
    move v0, v1

    .line 95
    goto :goto_6

    .line 96
    :cond_6
    move v0, v2

    .line 97
    :goto_6
    if-eqz v0, :cond_8

    .line 98
    .line 99
    iget v0, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->cameraDistance:F

    .line 100
    .line 101
    iget v3, p1, Landroidx/compose/ui/node/LayerPositionalProperties;->cameraDistance:F

    .line 102
    .line 103
    cmpg-float v0, v0, v3

    .line 104
    .line 105
    if-nez v0, :cond_7

    .line 106
    .line 107
    move v0, v1

    .line 108
    goto :goto_7

    .line 109
    :cond_7
    move v0, v2

    .line 110
    :goto_7
    if-eqz v0, :cond_8

    .line 111
    .line 112
    iget-wide v3, p0, Landroidx/compose/ui/node/LayerPositionalProperties;->transformOrigin:J

    .line 113
    .line 114
    iget-wide v5, p1, Landroidx/compose/ui/node/LayerPositionalProperties;->transformOrigin:J

    .line 115
    .line 116
    invoke-static {v3, v4, v5, v6}, Landroidx/compose/ui/graphics/TransformOrigin;->equals-impl0(JJ)Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    if-eqz p1, :cond_8

    .line 121
    .line 122
    goto :goto_8

    .line 123
    :cond_8
    move v1, v2

    .line 124
    :goto_8
    return v1
.end method
