.class public final synthetic Ly2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Lcom/zykj/view/board/play/SketchPlayFragment;

.field public final synthetic d:Lcom/friday/document/view/viewer/MicroClassPlayActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/play/SketchPlayFragment;Lcom/friday/document/view/viewer/MicroClassPlayActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly2/g;->c:Lcom/zykj/view/board/play/SketchPlayFragment;

    iput-object p2, p0, Ly2/g;->d:Lcom/friday/document/view/viewer/MicroClassPlayActivity;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ly2/g;->c:Lcom/zykj/view/board/play/SketchPlayFragment;

    iget-object v1, p0, Ly2/g;->d:Lcom/friday/document/view/viewer/MicroClassPlayActivity;

    invoke-static {v0, v1}, Lcom/friday/document/view/viewer/MicroClassPlayActivity;->P(Lcom/zykj/view/board/play/SketchPlayFragment;Lcom/friday/document/view/viewer/MicroClassPlayActivity;)Lqc/q;

    move-result-object v0

    return-object v0
.end method
