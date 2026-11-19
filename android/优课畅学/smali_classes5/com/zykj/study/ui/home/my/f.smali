.class public final synthetic Lcom/zykj/study/ui/home/my/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Landroid/content/DialogInterface;

.field public final synthetic b:Lcom/zykj/study/ui/home/my/EditCourseFragment;


# direct methods
.method public synthetic constructor <init>(Landroid/content/DialogInterface;Lcom/zykj/study/ui/home/my/EditCourseFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/study/ui/home/my/f;->a:Landroid/content/DialogInterface;

    iput-object p2, p0, Lcom/zykj/study/ui/home/my/f;->b:Lcom/zykj/study/ui/home/my/EditCourseFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/f;->a:Landroid/content/DialogInterface;

    iget-object v1, p0, Lcom/zykj/study/ui/home/my/f;->b:Lcom/zykj/study/ui/home/my/EditCourseFragment;

    check-cast p1, Landroidx/work/WorkInfo;

    invoke-static {v0, v1, p1}, Lcom/zykj/study/ui/home/my/EditCourseFragment$uploadImage$1;->d(Landroid/content/DialogInterface;Lcom/zykj/study/ui/home/my/EditCourseFragment;Landroidx/work/WorkInfo;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
