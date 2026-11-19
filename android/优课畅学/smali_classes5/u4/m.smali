.class public final synthetic Lu4/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final synthetic a:Landroidx/work/WorkManager;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcom/zykj/study/ui/OpenFileFragment;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroidx/work/WorkManager;Ljava/lang/String;Lcom/zykj/study/ui/OpenFileFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu4/m;->a:Landroidx/work/WorkManager;

    iput-object p2, p0, Lu4/m;->b:Ljava/lang/String;

    iput-object p3, p0, Lu4/m;->c:Lcom/zykj/study/ui/OpenFileFragment;

    iput-object p4, p0, Lu4/m;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lu4/m;->a:Landroidx/work/WorkManager;

    iget-object v1, p0, Lu4/m;->b:Ljava/lang/String;

    iget-object v2, p0, Lu4/m;->c:Lcom/zykj/study/ui/OpenFileFragment;

    iget-object v3, p0, Lu4/m;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/zykj/study/ui/OpenFileFragment;->i(Landroidx/work/WorkManager;Ljava/lang/String;Lcom/zykj/study/ui/OpenFileFragment;Ljava/lang/String;Landroid/content/DialogInterface;)V

    return-void
.end method
