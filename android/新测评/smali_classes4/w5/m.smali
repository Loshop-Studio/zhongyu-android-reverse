.class public final synthetic Lw5/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Landroidx/navigation/NavController;

.field public final synthetic b:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

.field public final synthetic c:Lf6/j;


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Lf6/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw5/m;->a:Landroidx/navigation/NavController;

    iput-object p2, p0, Lw5/m;->b:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    iput-object p3, p0, Lw5/m;->c:Lf6/j;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lw5/m;->a:Landroidx/navigation/NavController;

    iget-object v1, p0, Lw5/m;->b:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    iget-object v2, p0, Lw5/m;->c:Lf6/j;

    check-cast p1, Landroidx/compose/runtime/DisposableEffectScope;

    invoke-static {v0, v1, v2, p1}, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt;->K(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Lf6/j;Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;

    move-result-object p1

    return-object p1
.end method
