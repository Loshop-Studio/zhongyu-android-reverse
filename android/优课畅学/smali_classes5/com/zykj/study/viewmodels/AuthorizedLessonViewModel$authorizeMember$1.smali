.class final Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;->f(ILcom/zykj/study/bean/exercise/AuthorizeLesson;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lx7/p;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.study.viewmodels.AuthorizedLessonViewModel$authorizeMember$1"
    f = "AuthorizedLessonViewModel.kt"
    l = {
        0x5c,
        0x6b
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

.field public final synthetic c:Lcom/zykj/study/bean/exercise/AuthorizeLesson;

.field public final synthetic d:I


# direct methods
.method public constructor <init>(Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;Lcom/zykj/study/bean/exercise/AuthorizeLesson;ILm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$1;->b:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$1;->c:Lcom/zykj/study/bean/exercise/AuthorizeLesson;

    .line 4
    .line 5
    iput p3, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$1;->d:I

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$1;->b:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$1;->c:Lcom/zykj/study/bean/exercise/AuthorizeLesson;

    .line 6
    .line 7
    iget v2, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$1;->d:I

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$1;-><init>(Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;Lcom/zykj/study/bean/exercise/AuthorizeLesson;ILm7/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$1;->a:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto/16 :goto_3

    .line 19
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
    goto :goto_0

    .line 32
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$1;->b:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    .line 36
    .line 37
    invoke-static {p1}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;->a(Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;)Lt4/a;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iget-object v1, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$1;->c:Lcom/zykj/study/bean/exercise/AuthorizeLesson;

    .line 42
    .line 43
    invoke-virtual {v1}, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->getUserId()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    iget-object v4, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$1;->b:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    .line 48
    .line 49
    invoke-virtual {v4}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;->l()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    iput v3, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$1;->a:I

    .line 54
    .line 55
    invoke-virtual {p1, v1, v4, p0}, Lt4/a;->a(IILm7/c;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-ne p1, v0, :cond_3

    .line 60
    .line 61
    goto/16 :goto_2

    .line 62
    .line 63
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$1;->b:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;->i()V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$1;->b:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    .line 69
    .line 70
    invoke-static {p1}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;->e(Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;)Ll8/h;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-interface {p1}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    check-cast p1, Lcom/zykj/study/bean/UiState;

    .line 79
    .line 80
    iget-object v4, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$1;->c:Lcom/zykj/study/bean/exercise/AuthorizeLesson;

    .line 81
    .line 82
    iget v1, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$1;->d:I

    .line 83
    .line 84
    iget-object v12, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$1;->b:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    .line 85
    .line 86
    :try_start_0
    const-string v5, "null cannot be cast to non-null type com.zykj.study.bean.UiState.Success<*>"

    .line 87
    .line 88
    invoke-static {p1, v5}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    move-object v5, p1

    .line 92
    check-cast v5, Lcom/zykj/study/bean/UiState$Success;

    .line 93
    .line 94
    check-cast p1, Lcom/zykj/study/bean/UiState$Success;

    .line 95
    .line 96
    invoke-virtual {p1}, Lcom/zykj/study/bean/UiState$Success;->getT()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    if-eqz p1, :cond_5

    .line 101
    .line 102
    check-cast p1, Ljava/util/List;

    .line 103
    .line 104
    new-instance v13, Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-direct {v13, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v4}, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->getName()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    invoke-virtual {v4}, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->getUserName()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    invoke-virtual {v4}, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->getCreateTime()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    const/16 v10, 0x10

    .line 122
    .line 123
    const/4 v11, 0x0

    .line 124
    const/4 v8, 0x1

    .line 125
    const/4 v9, 0x0

    .line 126
    invoke-static/range {v4 .. v11}, Lcom/zykj/study/bean/exercise/AuthorizeLesson;->copy$default(Lcom/zykj/study/bean/exercise/AuthorizeLesson;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIILjava/lang/Object;)Lcom/zykj/study/bean/exercise/AuthorizeLesson;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-virtual {v13, v1, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    invoke-static {v12}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;->e(Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;)Ll8/h;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    :cond_4
    invoke-interface {p1}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    move-object v4, v1

    .line 142
    check-cast v4, Lcom/zykj/study/bean/UiState;

    .line 143
    .line 144
    new-instance v4, Lcom/zykj/study/bean/UiState$Success;

    .line 145
    .line 146
    invoke-direct {v4, v13}, Lcom/zykj/study/bean/UiState$Success;-><init>(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    invoke-interface {p1, v1, v4}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-eqz v1, :cond_4

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    .line 157
    .line 158
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<com.zykj.study.bean.exercise.AuthorizeLesson>"

    .line 159
    .line 160
    invoke-direct {p1, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    throw p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 164
    :catch_0
    :goto_1
    iget-object p1, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$1;->b:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    .line 165
    .line 166
    invoke-static {p1}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;->c(Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;)Ll8/g;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    new-instance v1, Lcom/zykj/study/bean/UiState$Success;

    .line 171
    .line 172
    invoke-static {v3}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    invoke-direct {v1, v3}, Lcom/zykj/study/bean/UiState$Success;-><init>(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    iput v2, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$authorizeMember$1;->a:I

    .line 180
    .line 181
    invoke-interface {p1, v1, p0}, Ll8/g;->emit(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    if-ne p1, v0, :cond_6

    .line 186
    .line 187
    :goto_2
    return-object v0

    .line 188
    :cond_6
    :goto_3
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 189
    .line 190
    return-object p1
.end method
