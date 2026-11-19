.class public final synthetic Lx4/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Landroid/content/DialogInterface;

.field public final synthetic b:Lcom/zykj/study/ui/home/exercise/train/MicroPlayDialogFragment;

.field public final synthetic c:Lcom/zykj/view/board/play/SketchPlayFragment;


# direct methods
.method public synthetic constructor <init>(Landroid/content/DialogInterface;Lcom/zykj/study/ui/home/exercise/train/MicroPlayDialogFragment;Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx4/z;->a:Landroid/content/DialogInterface;

    iput-object p2, p0, Lx4/z;->b:Lcom/zykj/study/ui/home/exercise/train/MicroPlayDialogFragment;

    iput-object p3, p0, Lx4/z;->c:Lcom/zykj/view/board/play/SketchPlayFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lx4/z;->a:Landroid/content/DialogInterface;

    iget-object v1, p0, Lx4/z;->b:Lcom/zykj/study/ui/home/exercise/train/MicroPlayDialogFragment;

    iget-object v2, p0, Lx4/z;->c:Lcom/zykj/view/board/play/SketchPlayFragment;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, v1, v2, p1}, Lcom/zykj/study/ui/home/exercise/train/MicroPlayDialogFragment;->g(Landroid/content/DialogInterface;Lcom/zykj/study/ui/home/exercise/train/MicroPlayDialogFragment;Lcom/zykj/view/board/play/SketchPlayFragment;Ljava/util/List;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
