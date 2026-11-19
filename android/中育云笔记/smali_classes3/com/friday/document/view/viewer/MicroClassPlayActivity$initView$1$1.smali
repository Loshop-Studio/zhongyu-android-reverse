.class public final Lcom/friday/document/view/viewer/MicroClassPlayActivity$initView$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/LifecycleEventObserver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/viewer/MicroClassPlayActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/zykj/view/board/play/SketchPlayFragment;

.field public final synthetic d:Lcom/friday/document/view/viewer/MicroClassPlayActivity;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/play/SketchPlayFragment;Lcom/friday/document/view/viewer/MicroClassPlayActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/viewer/MicroClassPlayActivity$initView$1$1;->c:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/view/viewer/MicroClassPlayActivity$initView$1$1;->d:Lcom/friday/document/view/viewer/MicroClassPlayActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onStateChanged(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 8

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "event"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object p1, Landroidx/lifecycle/Lifecycle$Event;->ON_RESUME:Landroidx/lifecycle/Lifecycle$Event;

    .line 12
    .line 13
    if-ne p2, p1, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/friday/document/view/viewer/MicroClassPlayActivity$initView$1$1;->c:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 16
    .line 17
    iget-object p1, p0, Lcom/friday/document/view/viewer/MicroClassPlayActivity$initView$1$1;->d:Lcom/friday/document/view/viewer/MicroClassPlayActivity;

    .line 18
    .line 19
    iget-object v1, p1, Lcom/friday/document/view/viewer/MicroClassPlayActivity;->g:Ljava/lang/String;

    .line 20
    .line 21
    const/16 v6, 0x1e

    .line 22
    .line 23
    const/4 v7, 0x0

    .line 24
    const/4 v2, 0x0

    .line 25
    const/4 v3, 0x0

    .line 26
    const/4 v4, 0x0

    .line 27
    const/4 v5, 0x0

    .line 28
    invoke-static/range {v0 .. v7}, Lcom/zykj/view/board/play/SketchPlayFragment;->m0(Lcom/zykj/view/board/play/SketchPlayFragment;Ljava/lang/String;IZLhd/l;Lhd/l;ILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lcom/friday/document/view/viewer/MicroClassPlayActivity$initView$1$1;->c:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 32
    .line 33
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-interface {p1}, Landroidx/lifecycle/LifecycleOwner;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1, p0}, Landroidx/lifecycle/Lifecycle;->removeObserver(Landroidx/lifecycle/LifecycleObserver;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-void
.end method
