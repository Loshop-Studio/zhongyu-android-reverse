.class public final synthetic Lcom/zykj/view/board/play/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/play/SketchPlayFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/view/board/play/d;->a:Lcom/zykj/view/board/play/SketchPlayFragment;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/d;->a:Lcom/zykj/view/board/play/SketchPlayFragment;

    invoke-static {v0}, Lcom/zykj/view/board/play/SketchPlayFragment;->e(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/board/play/SketchPlayFragment$playStatusListener$2$1;

    move-result-object v0

    return-object v0
.end method
