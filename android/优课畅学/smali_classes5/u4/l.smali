.class public final synthetic Lu4/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final synthetic a:Landroidx/work/WorkManager;

.field public final synthetic b:Landroidx/work/OneTimeWorkRequest;


# direct methods
.method public synthetic constructor <init>(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu4/l;->a:Landroidx/work/WorkManager;

    iput-object p2, p0, Lu4/l;->b:Landroidx/work/OneTimeWorkRequest;

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lu4/l;->a:Landroidx/work/WorkManager;

    iget-object v1, p0, Lu4/l;->b:Landroidx/work/OneTimeWorkRequest;

    invoke-static {v0, v1, p1}, Lcom/zykj/study/ui/OpenFileFragment;->g(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Landroid/content/DialogInterface;)V

    return-void
.end method
