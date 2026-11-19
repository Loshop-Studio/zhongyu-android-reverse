.class public final synthetic Lcom/zykj/huiwei/launcher/ui/fragment/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final synthetic a:Landroidx/work/WorkManager;

.field public final synthetic b:Landroidx/work/OneTimeWorkRequest;

.field public final synthetic c:Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/c;->a:Landroidx/work/WorkManager;

    iput-object p2, p0, Lcom/zykj/huiwei/launcher/ui/fragment/c;->b:Landroidx/work/OneTimeWorkRequest;

    iput-object p3, p0, Lcom/zykj/huiwei/launcher/ui/fragment/c;->c:Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment;

    iput-object p4, p0, Lcom/zykj/huiwei/launcher/ui/fragment/c;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/c;->a:Landroidx/work/WorkManager;

    iget-object v1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/c;->b:Landroidx/work/OneTimeWorkRequest;

    iget-object v2, p0, Lcom/zykj/huiwei/launcher/ui/fragment/c;->c:Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment;

    iget-object v3, p0, Lcom/zykj/huiwei/launcher/ui/fragment/c;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1;->a(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment;Ljava/lang/String;Landroid/content/DialogInterface;)V

    return-void
.end method
