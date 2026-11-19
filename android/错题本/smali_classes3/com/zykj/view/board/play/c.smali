.class public final synthetic Lcom/zykj/view/board/play/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/play/SketchPlayFragment;

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:I

.field public final synthetic e:Lr6/c;

.field public final synthetic f:Lr6/c;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/play/SketchPlayFragment;ZLjava/lang/String;ILr6/c;Lr6/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/view/board/play/c;->a:Lcom/zykj/view/board/play/SketchPlayFragment;

    iput-boolean p2, p0, Lcom/zykj/view/board/play/c;->b:Z

    iput-object p3, p0, Lcom/zykj/view/board/play/c;->c:Ljava/lang/String;

    iput p4, p0, Lcom/zykj/view/board/play/c;->d:I

    iput-object p5, p0, Lcom/zykj/view/board/play/c;->e:Lr6/c;

    iput-object p6, p0, Lcom/zykj/view/board/play/c;->f:Lr6/c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v4, p0, Lcom/zykj/view/board/play/c;->e:Lr6/c;

    iget-object v5, p0, Lcom/zykj/view/board/play/c;->f:Lr6/c;

    iget-object v0, p0, Lcom/zykj/view/board/play/c;->a:Lcom/zykj/view/board/play/SketchPlayFragment;

    iget-boolean v1, p0, Lcom/zykj/view/board/play/c;->b:Z

    iget-object v2, p0, Lcom/zykj/view/board/play/c;->c:Ljava/lang/String;

    iget v3, p0, Lcom/zykj/view/board/play/c;->d:I

    invoke-static/range {v0 .. v5}, Lcom/zykj/view/board/play/SketchPlayFragment;->i(Lcom/zykj/view/board/play/SketchPlayFragment;ZLjava/lang/String;ILr6/c;Lr6/c;)Ld6/s;

    move-result-object v0

    return-object v0
.end method
