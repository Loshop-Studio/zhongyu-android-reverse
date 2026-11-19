.class public final synthetic Lw5/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

.field public final synthetic b:Landroidx/navigation/NavController;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Landroidx/navigation/NavController;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw5/a1;->a:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    iput-object p2, p0, Lw5/a1;->b:Landroidx/navigation/NavController;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lw5/a1;->a:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    iget-object v1, p0, Lw5/a1;->b:Landroidx/navigation/NavController;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt;->J(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Landroidx/navigation/NavController;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
