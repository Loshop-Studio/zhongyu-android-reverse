.class public final synthetic Lw5/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

.field public final synthetic b:Lf6/j;

.field public final synthetic c:Landroidx/navigation/NavController;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Lf6/j;Landroidx/navigation/NavController;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw5/r;->a:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    iput-object p2, p0, Lw5/r;->b:Lf6/j;

    iput-object p3, p0, Lw5/r;->c:Landroidx/navigation/NavController;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lw5/r;->a:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    iget-object v1, p0, Lw5/r;->b:Lf6/j;

    iget-object v2, p0, Lw5/r;->c:Landroidx/navigation/NavController;

    invoke-static {v0, v1, v2}, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt;->P(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Lf6/j;Landroidx/navigation/NavController;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
