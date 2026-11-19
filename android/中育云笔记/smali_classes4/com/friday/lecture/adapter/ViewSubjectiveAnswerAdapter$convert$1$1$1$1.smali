.class final Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.lecture.adapter.ViewSubjectiveAnswerAdapter$convert$1$1$1$1"
    f = "ViewSubjectiveAnswerAdapter.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;

.field public final synthetic f:Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;

.field public final synthetic g:Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1$1;->d:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1$1;->e:Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1$1;->f:Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1$1;->g:Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 6

    .line 1
    new-instance v0, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1$1;->d:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1$1;->e:Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1$1;->f:Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1$1;->g:Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1$1;-><init>(Ljava/lang/String;Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lvc/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1$1;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1$1;->d:Ljava/lang/String;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1$1;->e:Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->setLocalPath(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1$1;->f:Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p1}, Lcom/bumptech/glide/b;->t(Landroid/content/Context;)Lcom/bumptech/glide/h;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object v0, p0, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1$1;->e:Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->getLocalPath()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p1, v0}, Lcom/bumptech/glide/h;->t(Ljava/lang/String;)Lcom/bumptech/glide/g;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget-object v0, p0, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1$1;->g:Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 41
    .line 42
    sget v1, Lcom/friday/lecture/R$id;->iv_answer:I

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Landroid/widget/ImageView;

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Lcom/bumptech/glide/g;->A0(Landroid/widget/ImageView;)La1/i;

    .line 51
    .line 52
    .line 53
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 54
    .line 55
    return-object p1

    .line 56
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p1
.end method
