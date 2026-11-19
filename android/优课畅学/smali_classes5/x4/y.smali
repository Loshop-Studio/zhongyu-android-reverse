.class public final synthetic Lx4/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final synthetic a:Landroidx/work/WorkManager;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcom/zykj/study/ui/home/exercise/train/MicroPlayDialogFragment;

.field public final synthetic d:Lcom/zykj/view/board/play/SketchPlayFragment;


# direct methods
.method public synthetic constructor <init>(Landroidx/work/WorkManager;Ljava/lang/String;Lcom/zykj/study/ui/home/exercise/train/MicroPlayDialogFragment;Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx4/y;->a:Landroidx/work/WorkManager;

    iput-object p2, p0, Lx4/y;->b:Ljava/lang/String;

    iput-object p3, p0, Lx4/y;->c:Lcom/zykj/study/ui/home/exercise/train/MicroPlayDialogFragment;

    iput-object p4, p0, Lx4/y;->d:Lcom/zykj/view/board/play/SketchPlayFragment;

    return-void
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lx4/y;->a:Landroidx/work/WorkManager;

    iget-object v1, p0, Lx4/y;->b:Ljava/lang/String;

    iget-object v2, p0, Lx4/y;->c:Lcom/zykj/study/ui/home/exercise/train/MicroPlayDialogFragment;

    iget-object v3, p0, Lx4/y;->d:Lcom/zykj/view/board/play/SketchPlayFragment;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/zykj/study/ui/home/exercise/train/MicroPlayDialogFragment;->h(Landroidx/work/WorkManager;Ljava/lang/String;Lcom/zykj/study/ui/home/exercise/train/MicroPlayDialogFragment;Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/content/DialogInterface;)V

    return-void
.end method
