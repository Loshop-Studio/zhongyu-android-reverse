.class final Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.lecture.adapter.ViewSubjectiveAnswerAdapter$convert$1$1$1"
    f = "ViewSubjectiveAnswerAdapter.kt"
    l = {
        0x1e
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:I

.field public final synthetic e:Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;

.field public final synthetic f:Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;

.field public final synthetic g:Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;


# direct methods
.method public constructor <init>(Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1;->e:Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1;->f:Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1;->g:Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1;->e:Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1;->f:Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1;->g:Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1;-><init>(Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1;->d:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    sget-object p1, Lk2/q;->a:Lk2/q;

    .line 32
    .line 33
    iget-object v1, p0, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1;->e:Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;

    .line 34
    .line 35
    invoke-virtual {v1}, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->getRemoteUrl()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {p1, v1}, Lk2/q;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-static {}, Lsd/r0;->c()Lsd/t1;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    new-instance v3, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1$1;

    .line 48
    .line 49
    iget-object v5, p0, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1;->e:Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;

    .line 50
    .line 51
    iget-object v6, p0, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1;->f:Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;

    .line 52
    .line 53
    iget-object v7, p0, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1;->g:Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 54
    .line 55
    const/4 v8, 0x0

    .line 56
    invoke-direct/range {v3 .. v8}, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1$1;-><init>(Ljava/lang/String;Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lvc/c;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    iput-object v1, p0, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1;->c:Ljava/lang/Object;

    .line 64
    .line 65
    iput v2, p0, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1$1;->d:I

    .line 66
    .line 67
    invoke-static {p1, v3, p0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-ne p1, v0, :cond_2

    .line 72
    .line 73
    return-object v0

    .line 74
    :cond_2
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 75
    .line 76
    return-object p1
.end method
