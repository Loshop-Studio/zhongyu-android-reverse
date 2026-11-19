.class public final synthetic Lw5/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

.field public final synthetic b:Lf6/j;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Lf6/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw5/q;->a:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    iput-object p2, p0, Lw5/q;->b:Lf6/j;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lw5/q;->a:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    iget-object v1, p0, Lw5/q;->b:Lf6/j;

    invoke-static {v0, v1}, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt;->a(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Lf6/j;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
