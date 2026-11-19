.class public final Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lr5/a;)Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;
    .locals 2

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "config"

    .line 7
    .line 8
    invoke-static {p2, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    new-instance p1, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 20
    .line 21
    invoke-direct {p1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-static {p1, p2}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->G(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Lr5/a;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 28
    .line 29
    .line 30
    return-object p1
.end method
