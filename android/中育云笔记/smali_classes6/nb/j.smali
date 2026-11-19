.class public final synthetic Lnb/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Lcom/zykj/view/board/play/SketchPlayFragment;

.field public final synthetic d:Z

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:I

.field public final synthetic g:Lhd/l;

.field public final synthetic h:Lhd/l;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/play/SketchPlayFragment;ZLjava/lang/String;ILhd/l;Lhd/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb/j;->c:Lcom/zykj/view/board/play/SketchPlayFragment;

    iput-boolean p2, p0, Lnb/j;->d:Z

    iput-object p3, p0, Lnb/j;->e:Ljava/lang/String;

    iput p4, p0, Lnb/j;->f:I

    iput-object p5, p0, Lnb/j;->g:Lhd/l;

    iput-object p6, p0, Lnb/j;->h:Lhd/l;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lnb/j;->c:Lcom/zykj/view/board/play/SketchPlayFragment;

    iget-boolean v1, p0, Lnb/j;->d:Z

    iget-object v2, p0, Lnb/j;->e:Ljava/lang/String;

    iget v3, p0, Lnb/j;->f:I

    iget-object v4, p0, Lnb/j;->g:Lhd/l;

    iget-object v5, p0, Lnb/j;->h:Lhd/l;

    invoke-static/range {v0 .. v5}, Lcom/zykj/view/board/play/SketchPlayFragment;->s(Lcom/zykj/view/board/play/SketchPlayFragment;ZLjava/lang/String;ILhd/l;Lhd/l;)Lqc/q;

    move-result-object v0

    return-object v0
.end method
