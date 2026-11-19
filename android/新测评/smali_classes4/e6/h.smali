.class public final synthetic Le6/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/Observer;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;

.field public final synthetic b:Landroidx/lifecycle/SavedStateHandle;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Landroidx/lifecycle/SavedStateHandle;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le6/h;->a:Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;

    iput-object p2, p0, Le6/h;->b:Landroidx/lifecycle/SavedStateHandle;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Le6/h;->a:Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;

    iget-object v1, p0, Le6/h;->b:Landroidx/lifecycle/SavedStateHandle;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailPageKt;->c(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;)V

    return-void
.end method
