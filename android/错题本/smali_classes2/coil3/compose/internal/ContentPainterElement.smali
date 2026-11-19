.class public final Lcoil3/compose/internal/ContentPainterElement;
.super Landroidx/compose/ui/node/ModifierNodeElement;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/compose/ui/node/ModifierNodeElement<",
        "Lcoil3/compose/internal/ContentPainterNode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0081\u0008\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "Lcoil3/compose/internal/ContentPainterElement;",
        "Landroidx/compose/ui/node/ModifierNodeElement;",
        "Lcoil3/compose/internal/ContentPainterNode;",
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


# instance fields
.field public final a:Ls/f;

.field public final b:Lcoil3/n;

.field public final c:Lcoil3/compose/c;

.field public final d:Lr6/c;

.field public final e:Lr6/c;

.field public final f:I

.field public final g:Landroidx/compose/ui/Alignment;

.field public final h:Landroidx/compose/ui/layout/ContentScale;

.field public final i:F

.field public final j:Z

.field public final k:Lcoil3/compose/j;


# direct methods
.method public constructor <init>(Ls/f;Lcoil3/n;Lcoil3/compose/c;Lr6/c;Lr6/c;ILandroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;Lcoil3/compose/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/node/ModifierNodeElement;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcoil3/compose/internal/ContentPainterElement;->a:Ls/f;

    .line 5
    .line 6
    iput-object p2, p0, Lcoil3/compose/internal/ContentPainterElement;->b:Lcoil3/n;

    .line 7
    .line 8
    iput-object p3, p0, Lcoil3/compose/internal/ContentPainterElement;->c:Lcoil3/compose/c;

    .line 9
    .line 10
    iput-object p4, p0, Lcoil3/compose/internal/ContentPainterElement;->d:Lr6/c;

    .line 11
    .line 12
    iput-object p5, p0, Lcoil3/compose/internal/ContentPainterElement;->e:Lr6/c;

    .line 13
    .line 14
    iput p6, p0, Lcoil3/compose/internal/ContentPainterElement;->f:I

    .line 15
    .line 16
    iput-object p7, p0, Lcoil3/compose/internal/ContentPainterElement;->g:Landroidx/compose/ui/Alignment;

    .line 17
    .line 18
    iput-object p8, p0, Lcoil3/compose/internal/ContentPainterElement;->h:Landroidx/compose/ui/layout/ContentScale;

    .line 19
    .line 20
    const/high16 p1, 0x3f800000    # 1.0f

    .line 21
    .line 22
    iput p1, p0, Lcoil3/compose/internal/ContentPainterElement;->i:F

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    iput-boolean p1, p0, Lcoil3/compose/internal/ContentPainterElement;->j:Z

    .line 26
    .line 27
    iput-object p9, p0, Lcoil3/compose/internal/ContentPainterElement;->k:Lcoil3/compose/j;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final create()Landroidx/compose/ui/Modifier$Node;
    .locals 11

    .line 1
    new-instance v0, Lcoil3/compose/d;

    .line 2
    .line 3
    iget-object v1, p0, Lcoil3/compose/internal/ContentPainterElement;->c:Lcoil3/compose/c;

    .line 4
    .line 5
    iget-object v2, p0, Lcoil3/compose/internal/ContentPainterElement;->b:Lcoil3/n;

    .line 6
    .line 7
    iget-object v3, p0, Lcoil3/compose/internal/ContentPainterElement;->a:Ls/f;

    .line 8
    .line 9
    invoke-direct {v0, v2, v3, v1}, Lcoil3/compose/d;-><init>(Lcoil3/n;Ls/f;Lcoil3/compose/c;)V

    .line 10
    .line 11
    .line 12
    new-instance v5, Lcoil3/compose/AsyncImagePainter;

    .line 13
    .line 14
    invoke-direct {v5, v0}, Lcoil3/compose/AsyncImagePainter;-><init>(Lcoil3/compose/d;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lcoil3/compose/internal/ContentPainterElement;->d:Lr6/c;

    .line 18
    .line 19
    iput-object v1, v5, Lcoil3/compose/AsyncImagePainter;->h:Lr6/c;

    .line 20
    .line 21
    iget-object v1, p0, Lcoil3/compose/internal/ContentPainterElement;->e:Lr6/c;

    .line 22
    .line 23
    iput-object v1, v5, Lcoil3/compose/AsyncImagePainter;->i:Lr6/c;

    .line 24
    .line 25
    iget-object v1, p0, Lcoil3/compose/internal/ContentPainterElement;->h:Landroidx/compose/ui/layout/ContentScale;

    .line 26
    .line 27
    iput-object v1, v5, Lcoil3/compose/AsyncImagePainter;->j:Landroidx/compose/ui/layout/ContentScale;

    .line 28
    .line 29
    iget v1, p0, Lcoil3/compose/internal/ContentPainterElement;->f:I

    .line 30
    .line 31
    iput v1, v5, Lcoil3/compose/AsyncImagePainter;->k:I

    .line 32
    .line 33
    iget-object v1, p0, Lcoil3/compose/internal/ContentPainterElement;->k:Lcoil3/compose/j;

    .line 34
    .line 35
    iput-object v1, v5, Lcoil3/compose/AsyncImagePainter;->l:Lcoil3/compose/j;

    .line 36
    .line 37
    invoke-virtual {v5, v0}, Lcoil3/compose/AsyncImagePainter;->d(Lcoil3/compose/d;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, v3, Ls/f;->o:Lt/g;

    .line 41
    .line 42
    instance-of v1, v0, Lcoil3/compose/ConstraintsSizeResolver;

    .line 43
    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    check-cast v0, Lcoil3/compose/ConstraintsSizeResolver;

    .line 47
    .line 48
    :goto_0
    move-object v10, v0

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    const/4 v0, 0x0

    .line 51
    goto :goto_0

    .line 52
    :goto_1
    new-instance v4, Lcoil3/compose/internal/ContentPainterNode;

    .line 53
    .line 54
    iget-object v6, p0, Lcoil3/compose/internal/ContentPainterElement;->g:Landroidx/compose/ui/Alignment;

    .line 55
    .line 56
    iget-object v7, p0, Lcoil3/compose/internal/ContentPainterElement;->h:Landroidx/compose/ui/layout/ContentScale;

    .line 57
    .line 58
    iget v8, p0, Lcoil3/compose/internal/ContentPainterElement;->i:F

    .line 59
    .line 60
    iget-boolean v9, p0, Lcoil3/compose/internal/ContentPainterElement;->j:Z

    .line 61
    .line 62
    invoke-direct/range {v4 .. v10}, Lcoil3/compose/internal/ContentPainterNode;-><init>(Lcoil3/compose/AsyncImagePainter;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FZLcoil3/compose/ConstraintsSizeResolver;)V

    .line 63
    .line 64
    .line 65
    return-object v4
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto/16 :goto_1

    :cond_0
    instance-of v0, p1, Lcoil3/compose/internal/ContentPainterElement;

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    check-cast p1, Lcoil3/compose/internal/ContentPainterElement;

    iget-object v0, p0, Lcoil3/compose/internal/ContentPainterElement;->a:Ls/f;

    iget-object v1, p1, Lcoil3/compose/internal/ContentPainterElement;->a:Ls/f;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    iget-object v0, p0, Lcoil3/compose/internal/ContentPainterElement;->b:Lcoil3/n;

    iget-object v1, p1, Lcoil3/compose/internal/ContentPainterElement;->b:Lcoil3/n;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcoil3/compose/internal/ContentPainterElement;->c:Lcoil3/compose/c;

    iget-object v1, p1, Lcoil3/compose/internal/ContentPainterElement;->c:Lcoil3/compose/c;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcoil3/compose/internal/ContentPainterElement;->d:Lr6/c;

    iget-object v1, p1, Lcoil3/compose/internal/ContentPainterElement;->d:Lr6/c;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lcoil3/compose/internal/ContentPainterElement;->e:Lr6/c;

    iget-object v1, p1, Lcoil3/compose/internal/ContentPainterElement;->e:Lr6/c;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    iget v0, p0, Lcoil3/compose/internal/ContentPainterElement;->f:I

    iget v1, p1, Lcoil3/compose/internal/ContentPainterElement;->f:I

    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/FilterQuality;->equals-impl0(II)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    iget-object v0, p0, Lcoil3/compose/internal/ContentPainterElement;->g:Landroidx/compose/ui/Alignment;

    iget-object v1, p1, Lcoil3/compose/internal/ContentPainterElement;->g:Landroidx/compose/ui/Alignment;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_0

    :cond_8
    iget-object v0, p0, Lcoil3/compose/internal/ContentPainterElement;->h:Landroidx/compose/ui/layout/ContentScale;

    iget-object v1, p1, Lcoil3/compose/internal/ContentPainterElement;->h:Landroidx/compose/ui/layout/ContentScale;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_0

    :cond_9
    iget v0, p0, Lcoil3/compose/internal/ContentPainterElement;->i:F

    iget v1, p1, Lcoil3/compose/internal/ContentPainterElement;->i:F

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_a

    goto :goto_0

    :cond_a
    iget-boolean v0, p0, Lcoil3/compose/internal/ContentPainterElement;->j:Z

    iget-boolean v1, p1, Lcoil3/compose/internal/ContentPainterElement;->j:Z

    if-eq v0, v1, :cond_b

    goto :goto_0

    :cond_b
    iget-object v0, p0, Lcoil3/compose/internal/ContentPainterElement;->k:Lcoil3/compose/j;

    iget-object p1, p1, Lcoil3/compose/internal/ContentPainterElement;->k:Lcoil3/compose/j;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_c
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, Lcoil3/compose/internal/ContentPainterElement;->a:Ls/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Ls/f;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lcoil3/compose/internal/ContentPainterElement;->b:Lcoil3/n;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, Lcoil3/compose/internal/ContentPainterElement;->c:Lcoil3/compose/c;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v2

    .line 25
    mul-int/2addr v0, v1

    .line 26
    iget-object v2, p0, Lcoil3/compose/internal/ContentPainterElement;->d:Lr6/c;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    add-int/2addr v2, v0

    .line 33
    mul-int/2addr v2, v1

    .line 34
    const/4 v0, 0x0

    .line 35
    iget-object v3, p0, Lcoil3/compose/internal/ContentPainterElement;->e:Lr6/c;

    .line 36
    .line 37
    if-nez v3, :cond_0

    .line 38
    .line 39
    move v3, v0

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    :goto_0
    add-int/2addr v2, v3

    .line 46
    mul-int/2addr v2, v1

    .line 47
    iget v3, p0, Lcoil3/compose/internal/ContentPainterElement;->f:I

    .line 48
    .line 49
    invoke-static {v3}, Landroidx/compose/ui/graphics/FilterQuality;->hashCode-impl(I)I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    add-int/2addr v3, v2

    .line 54
    mul-int/2addr v3, v1

    .line 55
    iget-object v2, p0, Lcoil3/compose/internal/ContentPainterElement;->g:Landroidx/compose/ui/Alignment;

    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    add-int/2addr v2, v3

    .line 62
    mul-int/2addr v2, v1

    .line 63
    iget-object v3, p0, Lcoil3/compose/internal/ContentPainterElement;->h:Landroidx/compose/ui/layout/ContentScale;

    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    add-int/2addr v3, v2

    .line 70
    mul-int/2addr v3, v1

    .line 71
    iget v2, p0, Lcoil3/compose/internal/ContentPainterElement;->i:F

    .line 72
    .line 73
    const/16 v4, 0x3c1

    .line 74
    .line 75
    invoke-static {v2, v3, v4}, Landroidx/collection/a;->b(FII)I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    iget-boolean v3, p0, Lcoil3/compose/internal/ContentPainterElement;->j:Z

    .line 80
    .line 81
    invoke-static {v3, v2, v1}, Landroidx/collection/a;->i(ZII)I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    iget-object v3, p0, Lcoil3/compose/internal/ContentPainterElement;->k:Lcoil3/compose/j;

    .line 86
    .line 87
    if-nez v3, :cond_1

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    :goto_1
    add-int/2addr v2, v0

    .line 95
    mul-int/2addr v2, v1

    .line 96
    return v2
.end method

.method public final inspectableProperties(Landroidx/compose/ui/platform/InspectorInfo;)V
    .locals 4

    .line 1
    const-string v0, "content"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroidx/compose/ui/platform/InspectorInfo;->setName(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string/jumbo v1, "request"

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lcoil3/compose/internal/ContentPainterElement;->a:Ls/f;

    .line 14
    .line 15
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "imageLoader"

    .line 23
    .line 24
    iget-object v2, p0, Lcoil3/compose/internal/ContentPainterElement;->b:Lcoil3/n;

    .line 25
    .line 26
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v1, "modelEqualityDelegate"

    .line 34
    .line 35
    iget-object v2, p0, Lcoil3/compose/internal/ContentPainterElement;->c:Lcoil3/compose/c;

    .line 36
    .line 37
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string/jumbo v1, "transform"

    .line 45
    .line 46
    .line 47
    iget-object v2, p0, Lcoil3/compose/internal/ContentPainterElement;->d:Lr6/c;

    .line 48
    .line 49
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const-string v1, "onState"

    .line 57
    .line 58
    iget-object v2, p0, Lcoil3/compose/internal/ContentPainterElement;->e:Lr6/c;

    .line 59
    .line 60
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iget v1, p0, Lcoil3/compose/internal/ContentPainterElement;->f:I

    .line 68
    .line 69
    invoke-static {v1}, Landroidx/compose/ui/graphics/FilterQuality;->box-impl(I)Landroidx/compose/ui/graphics/FilterQuality;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    const-string v2, "filterQuality"

    .line 74
    .line 75
    invoke-virtual {v0, v2, v1}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    const-string v1, "alignment"

    .line 83
    .line 84
    iget-object v2, p0, Lcoil3/compose/internal/ContentPainterElement;->g:Landroidx/compose/ui/Alignment;

    .line 85
    .line 86
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    const-string v1, "contentScale"

    .line 94
    .line 95
    iget-object v2, p0, Lcoil3/compose/internal/ContentPainterElement;->h:Landroidx/compose/ui/layout/ContentScale;

    .line 96
    .line 97
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    iget v1, p0, Lcoil3/compose/internal/ContentPainterElement;->i:F

    .line 105
    .line 106
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    const-string v2, "alpha"

    .line 111
    .line 112
    invoke-virtual {v0, v2, v1}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    const-string v1, "colorFilter"

    .line 120
    .line 121
    const/4 v2, 0x0

    .line 122
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    const-string v1, "clipToBounds"

    .line 130
    .line 131
    iget-boolean v3, p0, Lcoil3/compose/internal/ContentPainterElement;->j:Z

    .line 132
    .line 133
    invoke-static {v3, v0, v1, p1}, Landroidx/collection/a;->k(ZLandroidx/compose/ui/platform/ValueElementSequence;Ljava/lang/String;Landroidx/compose/ui/platform/InspectorInfo;)Landroidx/compose/ui/platform/ValueElementSequence;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    const-string v1, "previewHandler"

    .line 138
    .line 139
    iget-object v3, p0, Lcoil3/compose/internal/ContentPainterElement;->k:Lcoil3/compose/j;

    .line 140
    .line 141
    invoke-virtual {v0, v1, v3}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    const-string v0, "contentDescription"

    .line 149
    .line 150
    invoke-virtual {p1, v0, v2}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lcoil3/compose/internal/ContentPainterElement;->f:I

    invoke-static {v0}, Landroidx/compose/ui/graphics/FilterQuality;->toString-impl(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "ContentPainterElement(request="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcoil3/compose/internal/ContentPainterElement;->a:Ls/f;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", imageLoader="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcoil3/compose/internal/ContentPainterElement;->b:Lcoil3/n;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", modelEqualityDelegate="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcoil3/compose/internal/ContentPainterElement;->c:Lcoil3/compose/c;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", transform="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcoil3/compose/internal/ContentPainterElement;->d:Lr6/c;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", onState="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcoil3/compose/internal/ContentPainterElement;->e:Lr6/c;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", filterQuality="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", alignment="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcoil3/compose/internal/ContentPainterElement;->g:Landroidx/compose/ui/Alignment;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", contentScale="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcoil3/compose/internal/ContentPainterElement;->h:Landroidx/compose/ui/layout/ContentScale;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", alpha="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcoil3/compose/internal/ContentPainterElement;->i:F

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", colorFilter=null, clipToBounds="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Lcoil3/compose/internal/ContentPainterElement;->j:Z

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", previewHandler="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcoil3/compose/internal/ContentPainterElement;->k:Lcoil3/compose/j;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", contentDescription=null)"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final update(Landroidx/compose/ui/Modifier$Node;)V
    .locals 8

    .line 1
    check-cast p1, Lcoil3/compose/internal/ContentPainterNode;

    .line 2
    .line 3
    iget-object v0, p1, Lcoil3/compose/internal/ContentPainterNode;->f:Lcoil3/compose/AsyncImagePainter;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcoil3/compose/AsyncImagePainter;->getIntrinsicSize-NH-jbRc()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    iget-object v2, p1, Lcoil3/compose/internal/AbstractContentPainterNode;->e:Lcoil3/compose/ConstraintsSizeResolver;

    .line 10
    .line 11
    new-instance v3, Lcoil3/compose/d;

    .line 12
    .line 13
    iget-object v4, p0, Lcoil3/compose/internal/ContentPainterElement;->c:Lcoil3/compose/c;

    .line 14
    .line 15
    iget-object v5, p0, Lcoil3/compose/internal/ContentPainterElement;->b:Lcoil3/n;

    .line 16
    .line 17
    iget-object v6, p0, Lcoil3/compose/internal/ContentPainterElement;->a:Ls/f;

    .line 18
    .line 19
    invoke-direct {v3, v5, v6, v4}, Lcoil3/compose/d;-><init>(Lcoil3/n;Ls/f;Lcoil3/compose/c;)V

    .line 20
    .line 21
    .line 22
    iget-object v4, p1, Lcoil3/compose/internal/ContentPainterNode;->f:Lcoil3/compose/AsyncImagePainter;

    .line 23
    .line 24
    iget-object v5, p0, Lcoil3/compose/internal/ContentPainterElement;->d:Lr6/c;

    .line 25
    .line 26
    iput-object v5, v4, Lcoil3/compose/AsyncImagePainter;->h:Lr6/c;

    .line 27
    .line 28
    iget-object v5, p0, Lcoil3/compose/internal/ContentPainterElement;->e:Lr6/c;

    .line 29
    .line 30
    iput-object v5, v4, Lcoil3/compose/AsyncImagePainter;->i:Lr6/c;

    .line 31
    .line 32
    iget-object v5, p0, Lcoil3/compose/internal/ContentPainterElement;->h:Landroidx/compose/ui/layout/ContentScale;

    .line 33
    .line 34
    iput-object v5, v4, Lcoil3/compose/AsyncImagePainter;->j:Landroidx/compose/ui/layout/ContentScale;

    .line 35
    .line 36
    iget v7, p0, Lcoil3/compose/internal/ContentPainterElement;->f:I

    .line 37
    .line 38
    iput v7, v4, Lcoil3/compose/AsyncImagePainter;->k:I

    .line 39
    .line 40
    iget-object v7, p0, Lcoil3/compose/internal/ContentPainterElement;->k:Lcoil3/compose/j;

    .line 41
    .line 42
    iput-object v7, v4, Lcoil3/compose/AsyncImagePainter;->l:Lcoil3/compose/j;

    .line 43
    .line 44
    invoke-virtual {v4, v3}, Lcoil3/compose/AsyncImagePainter;->d(Lcoil3/compose/d;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v4}, Lcoil3/compose/AsyncImagePainter;->getIntrinsicSize-NH-jbRc()J

    .line 48
    .line 49
    .line 50
    move-result-wide v3

    .line 51
    invoke-static {v0, v1, v3, v4}, Landroidx/compose/ui/geometry/Size;->equals-impl0(JJ)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    iget-object v1, p0, Lcoil3/compose/internal/ContentPainterElement;->g:Landroidx/compose/ui/Alignment;

    .line 56
    .line 57
    iput-object v1, p1, Lcoil3/compose/internal/AbstractContentPainterNode;->a:Landroidx/compose/ui/Alignment;

    .line 58
    .line 59
    iget-object v1, v6, Ls/f;->o:Lt/g;

    .line 60
    .line 61
    instance-of v3, v1, Lcoil3/compose/ConstraintsSizeResolver;

    .line 62
    .line 63
    if-eqz v3, :cond_0

    .line 64
    .line 65
    check-cast v1, Lcoil3/compose/ConstraintsSizeResolver;

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    const/4 v1, 0x0

    .line 69
    :goto_0
    iput-object v1, p1, Lcoil3/compose/internal/AbstractContentPainterNode;->e:Lcoil3/compose/ConstraintsSizeResolver;

    .line 70
    .line 71
    iput-object v5, p1, Lcoil3/compose/internal/AbstractContentPainterNode;->b:Landroidx/compose/ui/layout/ContentScale;

    .line 72
    .line 73
    iget v1, p0, Lcoil3/compose/internal/ContentPainterElement;->i:F

    .line 74
    .line 75
    iput v1, p1, Lcoil3/compose/internal/AbstractContentPainterNode;->c:F

    .line 76
    .line 77
    iget-boolean v1, p0, Lcoil3/compose/internal/ContentPainterElement;->j:Z

    .line 78
    .line 79
    iput-boolean v1, p1, Lcoil3/compose/internal/AbstractContentPainterNode;->d:Z

    .line 80
    .line 81
    iget-object v1, p1, Lcoil3/compose/internal/AbstractContentPainterNode;->e:Lcoil3/compose/ConstraintsSizeResolver;

    .line 82
    .line 83
    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v0, :cond_1

    .line 88
    .line 89
    if-nez v1, :cond_2

    .line 90
    .line 91
    :cond_1
    invoke-static {p1}, Landroidx/compose/ui/node/LayoutModifierNodeKt;->invalidateMeasurement(Landroidx/compose/ui/node/LayoutModifierNode;)V

    .line 92
    .line 93
    .line 94
    :cond_2
    invoke-static {p1}, Landroidx/compose/ui/node/DrawModifierNodeKt;->invalidateDraw(Landroidx/compose/ui/node/DrawModifierNode;)V

    .line 95
    .line 96
    .line 97
    return-void
.end method
