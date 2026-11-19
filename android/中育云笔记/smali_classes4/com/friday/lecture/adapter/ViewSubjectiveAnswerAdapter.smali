.class public final Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;
.super Lcom/chad/library/adapter/base/BaseQuickAdapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
        "Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;",
        "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;",
        ">;"
    }
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x2

    .line 3
    invoke-direct {p0, p1, v0, v1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;-><init>(ILjava/util/List;ILkotlin/jvm/internal/n;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic convert(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;->i(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public i(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;)V
    .locals 6

    .line 1
    const-string v0, "holder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "i"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerSubjectiveLayout$a;->b()Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    sget v0, Lcom/friday/lecture/R$id;->tv_name:I

    .line 16
    .line 17
    invoke-virtual {p2}, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->getStudent()Lcom/friday/common/classtest/MqttResponse$Student;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const/4 v2, 0x0

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse$Student;->getStudentName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v1, v2

    .line 30
    :goto_0
    invoke-virtual {p1, v0, v1}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2}, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->getRemoteUrl()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const/4 v1, 0x0

    .line 38
    const/4 v3, 0x2

    .line 39
    const-string v4, "http"

    .line 40
    .line 41
    invoke-static {v0, v4, v1, v3, v2}, Lqd/z;->O(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getContext()Landroid/content/Context;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-static {p2}, Lcom/bumptech/glide/b;->t(Landroid/content/Context;)Lcom/bumptech/glide/h;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-virtual {p2, v0}, Lcom/bumptech/glide/h;->t(Ljava/lang/String;)Lcom/bumptech/glide/g;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    sget v0, Lcom/friday/lecture/R$id;->iv_answer:I

    .line 60
    .line 61
    invoke-virtual {p1, v0}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, Landroid/widget/ImageView;

    .line 66
    .line 67
    invoke-virtual {p2, p1}, Lcom/bumptech/glide/g;->A0(Landroid/widget/ImageView;)La1/i;

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_1
    invoke-virtual {p2}, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->getLocalPath()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getContext()Landroid/content/Context;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {v0}, Lcom/bumptech/glide/b;->t(Landroid/content/Context;)Lcom/bumptech/glide/h;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {p2}, Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;->getLocalPath()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    invoke-virtual {v0, p2}, Lcom/bumptech/glide/h;->t(Ljava/lang/String;)Lcom/bumptech/glide/g;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    sget v0, Lcom/friday/lecture/R$id;->iv_answer:I

    .line 98
    .line 99
    invoke-virtual {p1, v0}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    check-cast p1, Landroid/widget/ImageView;

    .line 104
    .line 105
    invoke-virtual {p2, p1}, Lcom/bumptech/glide/g;->A0(Landroid/widget/ImageView;)La1/i;

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :cond_2
    invoke-static {}, Lkotlinx/coroutines/d;->b()Lsd/i0;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    new-instance v3, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1;

    .line 114
    .line 115
    invoke-direct {v3, p2, p0, p1, v2}, Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter$convert$1$1;-><init>(Lcom/friday/lecture/model/SubjectiveHomeworkAnswer;Lcom/friday/lecture/adapter/ViewSubjectiveAnswerAdapter;Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lvc/c;)V

    .line 116
    .line 117
    .line 118
    const/4 v4, 0x3

    .line 119
    const/4 v5, 0x0

    .line 120
    const/4 v1, 0x0

    .line 121
    const/4 v2, 0x0

    .line 122
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 123
    .line 124
    .line 125
    return-void
.end method
