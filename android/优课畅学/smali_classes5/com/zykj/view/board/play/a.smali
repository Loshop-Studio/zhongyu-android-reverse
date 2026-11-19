.class public final synthetic Lcom/zykj/view/board/play/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/play/SketchPlayFragment;

.field public final synthetic b:I

.field public final synthetic c:Z

.field public final synthetic d:Lx7/l;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/play/SketchPlayFragment;IZLx7/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/view/board/play/a;->a:Lcom/zykj/view/board/play/SketchPlayFragment;

    iput p2, p0, Lcom/zykj/view/board/play/a;->b:I

    iput-boolean p3, p0, Lcom/zykj/view/board/play/a;->c:Z

    iput-object p4, p0, Lcom/zykj/view/board/play/a;->d:Lx7/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/a;->a:Lcom/zykj/view/board/play/SketchPlayFragment;

    iget v1, p0, Lcom/zykj/view/board/play/a;->b:I

    iget-boolean v2, p0, Lcom/zykj/view/board/play/a;->c:Z

    iget-object v3, p0, Lcom/zykj/view/board/play/a;->d:Lx7/l;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, v1, v2, v3, p1}, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->k(Lcom/zykj/view/board/play/SketchPlayFragment;IZLx7/l;I)Lh7/p;

    move-result-object p1

    return-object p1
.end method
