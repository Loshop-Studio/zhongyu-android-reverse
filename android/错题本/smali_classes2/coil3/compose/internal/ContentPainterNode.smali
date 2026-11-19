.class public final Lcoil3/compose/internal/ContentPainterNode;
.super Lcoil3/compose/internal/AbstractContentPainterNode;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lcoil3/compose/internal/ContentPainterNode;",
        "Lcoil3/compose/internal/AbstractContentPainterNode;",
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
.field public final f:Lcoil3/compose/AsyncImagePainter;


# direct methods
.method public constructor <init>(Lcoil3/compose/AsyncImagePainter;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FZLcoil3/compose/ConstraintsSizeResolver;)V
    .locals 6

    .line 1
    move-object v0, p0

    .line 2
    move-object v1, p2

    .line 3
    move-object v2, p3

    .line 4
    move v3, p4

    .line 5
    move v4, p5

    .line 6
    move-object v5, p6

    .line 7
    invoke-direct/range {v0 .. v5}, Lcoil3/compose/internal/AbstractContentPainterNode;-><init>(Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FZLcoil3/compose/ConstraintsSizeResolver;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lcoil3/compose/internal/ContentPainterNode;->f:Lcoil3/compose/AsyncImagePainter;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final getPainter()Landroidx/compose/ui/graphics/painter/Painter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/compose/internal/ContentPainterNode;->f:Lcoil3/compose/AsyncImagePainter;

    .line 2
    .line 3
    return-object v0
.end method

.method public final onAttach()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getCoroutineScope()Lkotlinx/coroutines/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcoil3/compose/internal/ContentPainterNode;->f:Lcoil3/compose/AsyncImagePainter;

    .line 6
    .line 7
    iput-object v0, v1, Lcoil3/compose/AsyncImagePainter;->g:Lkotlinx/coroutines/v;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcoil3/compose/AsyncImagePainter;->onRemembered()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final onDetach()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/compose/internal/ContentPainterNode;->f:Lcoil3/compose/AsyncImagePainter;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcoil3/compose/AsyncImagePainter;->onForgotten()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onReset()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcoil3/compose/internal/ContentPainterNode;->f:Lcoil3/compose/AsyncImagePainter;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lcoil3/compose/AsyncImagePainter;->d(Lcoil3/compose/d;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
