.class public final synthetic Lw5/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw5/f0;->a:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lw5/f0;->a:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    invoke-static {v0}, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt;->C(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
