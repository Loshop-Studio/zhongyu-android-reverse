.class public final synthetic Lw5/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Landroidx/navigation/NavController;

.field public final synthetic b:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw5/a0;->a:Landroidx/navigation/NavController;

    iput-object p2, p0, Lw5/a0;->b:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lw5/a0;->a:Landroidx/navigation/NavController;

    iget-object v1, p0, Lw5/a0;->b:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt;->D(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
