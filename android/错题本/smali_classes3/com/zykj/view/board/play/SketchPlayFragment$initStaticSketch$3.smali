.class public final Lcom/zykj/view/board/play/SketchPlayFragment$initStaticSketch$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/view/widget/SketchProgressView$ProgressListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/play/SketchPlayFragment;->initStaticSketch()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "com/zykj/view/board/play/SketchPlayFragment$initStaticSketch$3",
        "Lcom/zykj/view/widget/SketchProgressView$ProgressListener;",
        "Ld6/s;",
        "onTouchStart",
        "()V",
        "",
        "progress",
        "onProgress",
        "(F)V",
        "onTouchEnd",
        "view_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/view/board/play/SketchPlayFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$initStaticSketch$3;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onProgress(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment$initStaticSketch$3;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$getMBinding$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchView:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 11
    .line 12
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-static {v0, v1, p1, v2, v1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->areaMoving$default(Lcom/zykj/merge/sketch/view/MergeSketchPlayView;Ljava/lang/Float;Ljava/lang/Float;ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const-string p1, "mBinding"

    .line 22
    .line 23
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw v1
.end method

.method public onTouchEnd(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment$initStaticSketch$3;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$getMBinding$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchView:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 11
    .line 12
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-static {v0, v1, p1, v2, v1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->areaMoveEnd$default(Lcom/zykj/merge/sketch/view/MergeSketchPlayView;Ljava/lang/Float;Ljava/lang/Float;ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const-string p1, "mBinding"

    .line 22
    .line 23
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw v1
.end method

.method public onTouchStart()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment$initStaticSketch$3;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$getMBinding$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchView:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->areaMoveStart()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-string v0, "mBinding"

    .line 16
    .line 17
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    throw v0
.end method
