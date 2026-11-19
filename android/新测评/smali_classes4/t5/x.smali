.class public final synthetic Lt5/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/zykj/view/simpleBoard/SimpleBoardView;

.field public final synthetic b:Lcom/zykj/evaluation/ui/board/SketchDraftFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/simpleBoard/SimpleBoardView;Lcom/zykj/evaluation/ui/board/SketchDraftFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt5/x;->a:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    iput-object p2, p0, Lt5/x;->b:Lcom/zykj/evaluation/ui/board/SketchDraftFragment;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lt5/x;->a:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    iget-object v1, p0, Lt5/x;->b:Lcom/zykj/evaluation/ui/board/SketchDraftFragment;

    invoke-static {v0, v1, p1}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->m(Lcom/zykj/view/simpleBoard/SimpleBoardView;Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/view/View;)V

    return-void
.end method
