.class public final synthetic Lw5/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/Observer;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

.field public final synthetic b:Lf6/j;

.field public final synthetic c:Landroidx/lifecycle/SavedStateHandle;

.field public final synthetic d:Landroidx/navigation/NavController;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Lf6/j;Landroidx/lifecycle/SavedStateHandle;Landroidx/navigation/NavController;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw5/h0;->a:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    iput-object p2, p0, Lw5/h0;->b:Lf6/j;

    iput-object p3, p0, Lw5/h0;->c:Landroidx/lifecycle/SavedStateHandle;

    iput-object p4, p0, Lw5/h0;->d:Landroidx/navigation/NavController;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lw5/h0;->a:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    iget-object v1, p0, Lw5/h0;->b:Lf6/j;

    iget-object v2, p0, Lw5/h0;->c:Landroidx/lifecycle/SavedStateHandle;

    iget-object v3, p0, Lw5/h0;->d:Landroidx/navigation/NavController;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt;->f(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Lf6/j;Landroidx/lifecycle/SavedStateHandle;Landroidx/navigation/NavController;Ljava/lang/String;)V

    return-void
.end method
