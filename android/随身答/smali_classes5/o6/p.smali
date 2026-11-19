.class public final synthetic Lo6/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/material/tabs/TabLayoutMediator$TabConfigurationStrategy;


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo6/p;->a:Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;

    return-void
.end method


# virtual methods
.method public final onConfigureTab(Lcom/google/android/material/tabs/TabLayout$Tab;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo6/p;->a:Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;

    invoke-static {v0, p1, p2}, Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;->g(Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;Lcom/google/android/material/tabs/TabLayout$Tab;I)V

    return-void
.end method
