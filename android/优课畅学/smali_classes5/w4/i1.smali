.class public final synthetic Lw4/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final synthetic a:Landroidx/work/WorkManager;

.field public final synthetic b:Landroidx/work/OneTimeWorkRequest;

.field public final synthetic c:Lcom/zykj/study/ui/home/exercise/MicroEditFragment;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lcom/zykj/study/bean/OssData;

.field public final synthetic f:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;Lcom/zykj/study/bean/OssData;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw4/i1;->a:Landroidx/work/WorkManager;

    iput-object p2, p0, Lw4/i1;->b:Landroidx/work/OneTimeWorkRequest;

    iput-object p3, p0, Lw4/i1;->c:Lcom/zykj/study/ui/home/exercise/MicroEditFragment;

    iput-object p4, p0, Lw4/i1;->d:Ljava/lang/String;

    iput-object p5, p0, Lw4/i1;->e:Lcom/zykj/study/bean/OssData;

    iput-object p6, p0, Lw4/i1;->f:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lw4/i1;->a:Landroidx/work/WorkManager;

    iget-object v1, p0, Lw4/i1;->b:Landroidx/work/OneTimeWorkRequest;

    iget-object v2, p0, Lw4/i1;->c:Lcom/zykj/study/ui/home/exercise/MicroEditFragment;

    iget-object v3, p0, Lw4/i1;->d:Ljava/lang/String;

    iget-object v4, p0, Lw4/i1;->e:Lcom/zykj/study/bean/OssData;

    iget-object v5, p0, Lw4/i1;->f:Ljava/lang/String;

    move-object v6, p1

    invoke-static/range {v0 .. v6}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->l(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;Lcom/zykj/study/bean/OssData;Ljava/lang/String;Landroid/content/DialogInterface;)V

    return-void
.end method
