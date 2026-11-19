.class public final synthetic Ln6/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln6/p;->a:Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ln6/p;->a:Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment;

    invoke-static {v0}, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment;->i(Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionFragment;)Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionListAdapter;

    move-result-object v0

    return-object v0
.end method
