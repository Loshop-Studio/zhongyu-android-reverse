.class public final synthetic Lcom/zykj/view/board/play/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/zykj/view/board/play/SketchPlayFragment;

.field public final synthetic d:I

.field public final synthetic e:Z

.field public final synthetic f:Lhd/l;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/play/SketchPlayFragment;IZLhd/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/view/board/play/a;->c:Lcom/zykj/view/board/play/SketchPlayFragment;

    iput p2, p0, Lcom/zykj/view/board/play/a;->d:I

    iput-boolean p3, p0, Lcom/zykj/view/board/play/a;->e:Z

    iput-object p4, p0, Lcom/zykj/view/board/play/a;->f:Lhd/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/a;->c:Lcom/zykj/view/board/play/SketchPlayFragment;

    iget v1, p0, Lcom/zykj/view/board/play/a;->d:I

    iget-boolean v2, p0, Lcom/zykj/view/board/play/a;->e:Z

    iget-object v3, p0, Lcom/zykj/view/board/play/a;->f:Lhd/l;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, v1, v2, v3, p1}, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->n(Lcom/zykj/view/board/play/SketchPlayFragment;IZLhd/l;I)Lqc/q;

    move-result-object p1

    return-object p1
.end method
