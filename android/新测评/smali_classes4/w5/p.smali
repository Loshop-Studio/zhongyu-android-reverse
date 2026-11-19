.class public final synthetic Lw5/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

.field public final synthetic c:Lf6/j;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Lf6/j;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw5/p;->a:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lw5/p;->b:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    iput-object p3, p0, Lw5/p;->c:Lf6/j;

    iput-object p4, p0, Lw5/p;->d:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lw5/p;->a:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lw5/p;->b:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    iget-object v2, p0, Lw5/p;->c:Lf6/j;

    iget-object v3, p0, Lw5/p;->d:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2, v3}, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt;->n(Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Lf6/j;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
