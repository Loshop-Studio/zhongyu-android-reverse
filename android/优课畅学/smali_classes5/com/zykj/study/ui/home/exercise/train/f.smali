.class public final synthetic Lcom/zykj/study/ui/home/exercise/train/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final synthetic a:Landroidx/work/WorkManager;

.field public final synthetic b:Landroidx/work/OneTimeWorkRequest;

.field public final synthetic c:Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;

.field public final synthetic d:Z

.field public final synthetic e:Lx7/a;


# direct methods
.method public synthetic constructor <init>(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;ZLx7/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/study/ui/home/exercise/train/f;->a:Landroidx/work/WorkManager;

    iput-object p2, p0, Lcom/zykj/study/ui/home/exercise/train/f;->b:Landroidx/work/OneTimeWorkRequest;

    iput-object p3, p0, Lcom/zykj/study/ui/home/exercise/train/f;->c:Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;

    iput-boolean p4, p0, Lcom/zykj/study/ui/home/exercise/train/f;->d:Z

    iput-object p5, p0, Lcom/zykj/study/ui/home/exercise/train/f;->e:Lx7/a;

    return-void
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/f;->a:Landroidx/work/WorkManager;

    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/train/f;->b:Landroidx/work/OneTimeWorkRequest;

    iget-object v2, p0, Lcom/zykj/study/ui/home/exercise/train/f;->c:Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;

    iget-boolean v3, p0, Lcom/zykj/study/ui/home/exercise/train/f;->d:Z

    iget-object v4, p0, Lcom/zykj/study/ui/home/exercise/train/f;->e:Lx7/a;

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1;->c(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;ZLx7/a;Landroid/content/DialogInterface;)V

    return-void
.end method
