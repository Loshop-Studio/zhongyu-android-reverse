.class public final synthetic Lt7/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/play/SketchPlayFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt7/a0;->a:Lcom/zykj/view/board/play/SketchPlayFragment;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lt7/a0;->a:Lcom/zykj/view/board/play/SketchPlayFragment;

    invoke-static {v0}, Lcom/zykj/view/board/play/SketchPlayFragment$g;->e(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    return-void
.end method
