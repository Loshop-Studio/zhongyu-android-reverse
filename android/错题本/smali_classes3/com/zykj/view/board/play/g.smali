.class public final synthetic Lcom/zykj/view/board/play/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/play/SketchPlayFragment;

.field public final synthetic b:I

.field public final synthetic c:Z

.field public final synthetic d:Lr6/c;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/play/SketchPlayFragment;IZLr6/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/view/board/play/g;->a:Lcom/zykj/view/board/play/SketchPlayFragment;

    iput p2, p0, Lcom/zykj/view/board/play/g;->b:I

    iput-boolean p3, p0, Lcom/zykj/view/board/play/g;->c:Z

    iput-object p4, p0, Lcom/zykj/view/board/play/g;->d:Lr6/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget v0, p0, Lcom/zykj/view/board/play/g;->b:I

    iget-object v1, p0, Lcom/zykj/view/board/play/g;->a:Lcom/zykj/view/board/play/SketchPlayFragment;

    iget-boolean v2, p0, Lcom/zykj/view/board/play/g;->c:Z

    iget-object v3, p0, Lcom/zykj/view/board/play/g;->d:Lr6/c;

    invoke-static {v0, v1, p1, v2, v3}, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->g(ILcom/zykj/view/board/play/SketchPlayFragment;IZLr6/c;)Ld6/s;

    move-result-object p1

    return-object p1
.end method
