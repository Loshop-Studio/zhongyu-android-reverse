.class public final synthetic Lcom/zykj/study/ui/home/find/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Landroid/content/DialogInterface;

.field public final synthetic b:Lcom/zykj/study/ui/home/find/MicroCodeFragment;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/content/DialogInterface;Lcom/zykj/study/ui/home/find/MicroCodeFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/study/ui/home/find/j;->a:Landroid/content/DialogInterface;

    iput-object p2, p0, Lcom/zykj/study/ui/home/find/j;->b:Lcom/zykj/study/ui/home/find/MicroCodeFragment;

    iput-object p3, p0, Lcom/zykj/study/ui/home/find/j;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/find/j;->a:Landroid/content/DialogInterface;

    iget-object v1, p0, Lcom/zykj/study/ui/home/find/j;->b:Lcom/zykj/study/ui/home/find/MicroCodeFragment;

    iget-object v2, p0, Lcom/zykj/study/ui/home/find/j;->c:Ljava/lang/String;

    check-cast p1, Landroidx/work/WorkInfo;

    invoke-static {v0, v1, v2, p1}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$uploadMicroThumbnail$1;->k(Landroid/content/DialogInterface;Lcom/zykj/study/ui/home/find/MicroCodeFragment;Ljava/lang/String;Landroidx/work/WorkInfo;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
