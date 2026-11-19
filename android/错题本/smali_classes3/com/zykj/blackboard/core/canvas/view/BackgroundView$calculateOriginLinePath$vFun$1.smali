.class final Lcom/zykj/blackboard/core/canvas/view/BackgroundView$calculateOriginLinePath$vFun$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/canvas/view/BackgroundView;->calculateOriginLinePath(FFFFFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;)Landroid/graphics/Path;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lr6/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Ld6/s;",
        "invoke",
        "()V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field final synthetic $newWidth:F

.field final synthetic $path:Landroid/graphics/Path;

.field final synthetic $space:F

.field final synthetic $startX:F

.field final synthetic $startY:F

.field final synthetic $verticalNum:I


# direct methods
.method public constructor <init>(ILandroid/graphics/Path;FFFF)V
    .locals 0

    iput p1, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView$calculateOriginLinePath$vFun$1;->$verticalNum:I

    iput-object p2, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView$calculateOriginLinePath$vFun$1;->$path:Landroid/graphics/Path;

    iput p3, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView$calculateOriginLinePath$vFun$1;->$startX:F

    iput p4, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView$calculateOriginLinePath$vFun$1;->$startY:F

    iput p5, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView$calculateOriginLinePath$vFun$1;->$space:F

    iput p6, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView$calculateOriginLinePath$vFun$1;->$newWidth:F

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/canvas/view/BackgroundView$calculateOriginLinePath$vFun$1;->invoke()V

    sget-object v0, Ld6/s;->a:Ld6/s;

    return-object v0
.end method

.method public final invoke()V
    .locals 9

    .line 2
    iget v0, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView$calculateOriginLinePath$vFun$1;->$verticalNum:I

    iget-object v1, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView$calculateOriginLinePath$vFun$1;->$path:Landroid/graphics/Path;

    iget v2, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView$calculateOriginLinePath$vFun$1;->$startX:F

    iget v3, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView$calculateOriginLinePath$vFun$1;->$startY:F

    iget v4, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView$calculateOriginLinePath$vFun$1;->$space:F

    iget v5, p0, Lcom/zykj/blackboard/core/canvas/view/BackgroundView$calculateOriginLinePath$vFun$1;->$newWidth:F

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v0, :cond_0

    int-to-float v7, v6

    mul-float/2addr v7, v4

    add-float/2addr v7, v3

    .line 3
    invoke-virtual {v1, v2, v7}, Landroid/graphics/Path;->moveTo(FF)V

    add-float v8, v2, v5

    .line 4
    invoke-virtual {v1, v8, v7}, Landroid/graphics/Path;->lineTo(FF)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
