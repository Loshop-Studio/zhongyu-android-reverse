.class final Lcom/zykj/blackboard/core/canvas/view/BackgroundView$calculateOriginLinePath$hFun$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->d(FFFFFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;)Landroid/graphics/Path;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/a;"
    }
.end annotation


# instance fields
.field public final synthetic c:I

.field public final synthetic d:Landroid/graphics/Path;

.field public final synthetic e:F

.field public final synthetic f:F

.field public final synthetic g:F

.field public final synthetic h:F


# direct methods
.method public constructor <init>(ILandroid/graphics/Path;FFFF)V
    .locals 0

    iput p1, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView$calculateOriginLinePath$hFun$1;->c:I

    iput-object p2, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView$calculateOriginLinePath$hFun$1;->d:Landroid/graphics/Path;

    iput p3, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView$calculateOriginLinePath$hFun$1;->e:F

    iput p4, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView$calculateOriginLinePath$hFun$1;->f:F

    iput p5, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView$calculateOriginLinePath$hFun$1;->g:F

    iput p6, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView$calculateOriginLinePath$hFun$1;->h:F

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/canvas/view/BackgroundView$calculateOriginLinePath$hFun$1;->invoke()V

    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0
.end method

.method public final invoke()V
    .locals 9

    .line 2
    iget v0, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView$calculateOriginLinePath$hFun$1;->c:I

    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView$calculateOriginLinePath$hFun$1;->d:Landroid/graphics/Path;

    iget v2, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView$calculateOriginLinePath$hFun$1;->e:F

    iget v3, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView$calculateOriginLinePath$hFun$1;->f:F

    iget v4, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView$calculateOriginLinePath$hFun$1;->g:F

    iget v5, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView$calculateOriginLinePath$hFun$1;->h:F

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v0, :cond_0

    int-to-float v7, v6

    mul-float/2addr v7, v3

    add-float/2addr v7, v2

    .line 3
    invoke-virtual {v1, v7, v4}, Landroid/graphics/Path;->moveTo(FF)V

    add-float v8, v4, v5

    .line 4
    invoke-virtual {v1, v7, v8}, Landroid/graphics/Path;->lineTo(FF)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
