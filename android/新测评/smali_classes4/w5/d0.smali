.class public final synthetic Lw5/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/detail/b;

.field public final synthetic b:Landroidx/navigation/NavController;

.field public final synthetic c:Lf6/j;

.field public final synthetic d:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/detail/b;Landroidx/navigation/NavController;Lf6/j;Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw5/d0;->a:Lcom/zykj/evaluation/ui/detail/b;

    iput-object p2, p0, Lw5/d0;->b:Landroidx/navigation/NavController;

    iput-object p3, p0, Lw5/d0;->c:Lf6/j;

    iput-object p4, p0, Lw5/d0;->d:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lw5/d0;->a:Lcom/zykj/evaluation/ui/detail/b;

    iget-object v1, p0, Lw5/d0;->b:Landroidx/navigation/NavController;

    iget-object v2, p0, Lw5/d0;->c:Lf6/j;

    iget-object v3, p0, Lw5/d0;->d:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    invoke-static {v0, v1, v2, v3}, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt;->z(Lcom/zykj/evaluation/ui/detail/b;Landroidx/navigation/NavController;Lf6/j;Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
