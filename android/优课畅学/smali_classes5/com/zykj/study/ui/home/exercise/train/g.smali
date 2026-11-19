.class public final synthetic Lcom/zykj/study/ui/home/exercise/train/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;

.field public final synthetic b:Z

.field public final synthetic c:Lx7/a;

.field public final synthetic d:Landroid/content/DialogInterface;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;ZLx7/a;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/study/ui/home/exercise/train/g;->a:Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;

    iput-boolean p2, p0, Lcom/zykj/study/ui/home/exercise/train/g;->b:Z

    iput-object p3, p0, Lcom/zykj/study/ui/home/exercise/train/g;->c:Lx7/a;

    iput-object p4, p0, Lcom/zykj/study/ui/home/exercise/train/g;->d:Landroid/content/DialogInterface;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/g;->a:Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;

    iget-boolean v1, p0, Lcom/zykj/study/ui/home/exercise/train/g;->b:Z

    iget-object v2, p0, Lcom/zykj/study/ui/home/exercise/train/g;->c:Lx7/a;

    iget-object v3, p0, Lcom/zykj/study/ui/home/exercise/train/g;->d:Landroid/content/DialogInterface;

    check-cast p1, Landroidx/work/WorkInfo;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1;->k(Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;ZLx7/a;Landroid/content/DialogInterface;Landroidx/work/WorkInfo;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
