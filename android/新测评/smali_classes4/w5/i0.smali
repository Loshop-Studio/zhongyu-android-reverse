.class public final synthetic Lw5/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/Observer;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw5/i0;->a:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw5/i0;->a:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, p1}, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt;->X(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Ljava/lang/Boolean;)V

    return-void
.end method
