.class public final synthetic Lt5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/board/SketchDraftFragment;

.field public final synthetic b:Lcom/zykj/view/simpleBoard/SimpleBoardView;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Lcom/zykj/view/simpleBoard/SimpleBoardView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt5/c;->a:Lcom/zykj/evaluation/ui/board/SketchDraftFragment;

    iput-object p2, p0, Lt5/c;->b:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lt5/c;->a:Lcom/zykj/evaluation/ui/board/SketchDraftFragment;

    iget-object v1, p0, Lt5/c;->b:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    invoke-static {v0, v1, p1}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->g(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Lcom/zykj/view/simpleBoard/SimpleBoardView;Landroid/view/View;)V

    return-void
.end method
