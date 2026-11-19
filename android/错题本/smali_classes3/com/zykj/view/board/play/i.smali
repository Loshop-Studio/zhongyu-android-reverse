.class public final synthetic Lcom/zykj/view/board/play/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/view/board/play/SketchPlayFragment;

.field public final synthetic c:I

.field public final synthetic d:Z

.field public final synthetic e:Lr6/c;


# direct methods
.method public synthetic constructor <init>(ILcom/zykj/view/board/play/SketchPlayFragment;IZLr6/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/zykj/view/board/play/i;->a:I

    iput-object p2, p0, Lcom/zykj/view/board/play/i;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    iput p3, p0, Lcom/zykj/view/board/play/i;->c:I

    iput-boolean p4, p0, Lcom/zykj/view/board/play/i;->d:Z

    iput-object p5, p0, Lcom/zykj/view/board/play/i;->e:Lr6/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/play/i;->d:Z

    iget-object v1, p0, Lcom/zykj/view/board/play/i;->e:Lr6/c;

    iget v2, p0, Lcom/zykj/view/board/play/i;->a:I

    iget-object v3, p0, Lcom/zykj/view/board/play/i;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    iget v4, p0, Lcom/zykj/view/board/play/i;->c:I

    invoke-static {v2, v3, v4, v0, v1}, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->f(ILcom/zykj/view/board/play/SketchPlayFragment;IZLr6/c;)V

    return-void
.end method
