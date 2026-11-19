.class public final synthetic Lcom/zykj/study/ui/home/my/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final synthetic a:Landroidx/work/WorkManager;

.field public final synthetic b:Landroidx/work/OneTimeWorkRequest;

.field public final synthetic c:Lcom/zykj/study/ui/home/my/EditCourseFragment;


# direct methods
.method public synthetic constructor <init>(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Lcom/zykj/study/ui/home/my/EditCourseFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/study/ui/home/my/e;->a:Landroidx/work/WorkManager;

    iput-object p2, p0, Lcom/zykj/study/ui/home/my/e;->b:Landroidx/work/OneTimeWorkRequest;

    iput-object p3, p0, Lcom/zykj/study/ui/home/my/e;->c:Lcom/zykj/study/ui/home/my/EditCourseFragment;

    return-void
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/e;->a:Landroidx/work/WorkManager;

    iget-object v1, p0, Lcom/zykj/study/ui/home/my/e;->b:Landroidx/work/OneTimeWorkRequest;

    iget-object v2, p0, Lcom/zykj/study/ui/home/my/e;->c:Lcom/zykj/study/ui/home/my/EditCourseFragment;

    invoke-static {v0, v1, v2, p1}, Lcom/zykj/study/ui/home/my/EditCourseFragment$uploadImage$1;->c(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Lcom/zykj/study/ui/home/my/EditCourseFragment;Landroid/content/DialogInterface;)V

    return-void
.end method
