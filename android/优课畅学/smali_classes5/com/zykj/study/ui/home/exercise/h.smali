.class public final synthetic Lcom/zykj/study/ui/home/exercise/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/exercise/MicroEditFragment;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Landroid/content/DialogInterface;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/study/ui/home/exercise/h;->a:Lcom/zykj/study/ui/home/exercise/MicroEditFragment;

    iput-object p2, p0, Lcom/zykj/study/ui/home/exercise/h;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/zykj/study/ui/home/exercise/h;->c:Landroid/content/DialogInterface;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/h;->a:Lcom/zykj/study/ui/home/exercise/MicroEditFragment;

    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/h;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/zykj/study/ui/home/exercise/h;->c:Landroid/content/DialogInterface;

    check-cast p1, Landroidx/work/WorkInfo;

    invoke-static {v0, v1, v2, p1}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicroThumbnail$1;->d(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;Landroid/content/DialogInterface;Landroidx/work/WorkInfo;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
