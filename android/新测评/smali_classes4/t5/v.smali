.class public final synthetic Lt5/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/board/SketchDraftFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt5/v;->a:Lcom/zykj/evaluation/ui/board/SketchDraftFragment;

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lt5/v;->a:Lcom/zykj/evaluation/ui/board/SketchDraftFragment;

    invoke-static {v0, p1, p2}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->p(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
