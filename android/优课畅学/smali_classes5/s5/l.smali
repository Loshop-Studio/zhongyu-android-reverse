.class public final synthetic Ls5/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/play/SketchPlayFragment;

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:I

.field public final synthetic e:Lx7/l;

.field public final synthetic f:Lx7/l;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/play/SketchPlayFragment;ZLjava/lang/String;ILx7/l;Lx7/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls5/l;->a:Lcom/zykj/view/board/play/SketchPlayFragment;

    iput-boolean p2, p0, Ls5/l;->b:Z

    iput-object p3, p0, Ls5/l;->c:Ljava/lang/String;

    iput p4, p0, Ls5/l;->d:I

    iput-object p5, p0, Ls5/l;->e:Lx7/l;

    iput-object p6, p0, Ls5/l;->f:Lx7/l;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Ls5/l;->a:Lcom/zykj/view/board/play/SketchPlayFragment;

    iget-boolean v1, p0, Ls5/l;->b:Z

    iget-object v2, p0, Ls5/l;->c:Ljava/lang/String;

    iget v3, p0, Ls5/l;->d:I

    iget-object v4, p0, Ls5/l;->e:Lx7/l;

    iget-object v5, p0, Ls5/l;->f:Lx7/l;

    invoke-static/range {v0 .. v5}, Lcom/zykj/view/board/play/SketchPlayFragment;->j(Lcom/zykj/view/board/play/SketchPlayFragment;ZLjava/lang/String;ILx7/l;Lx7/l;)Lh7/p;

    move-result-object v0

    return-object v0
.end method
