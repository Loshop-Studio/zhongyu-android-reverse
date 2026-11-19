.class public final synthetic Ln6/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionListAdapter;

.field public final synthetic b:Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionListAdapter$MyViewHolder;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionListAdapter;Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionListAdapter$MyViewHolder;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln6/y;->a:Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionListAdapter;

    iput-object p2, p0, Ln6/y;->b:Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionListAdapter$MyViewHolder;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ln6/y;->a:Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionListAdapter;

    iget-object v1, p0, Ln6/y;->b:Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionListAdapter$MyViewHolder;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, v1, p1}, Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionListAdapter;->c(Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionListAdapter;Lcom/zykj/student/dialogue/ui/collect/SearchedQuestionListAdapter$MyViewHolder;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
