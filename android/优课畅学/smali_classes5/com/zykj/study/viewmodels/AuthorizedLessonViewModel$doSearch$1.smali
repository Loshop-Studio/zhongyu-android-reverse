.class final Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$doSearch$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;->h(Ljava/lang/String;)V
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
    c = "com.zykj.study.viewmodels.AuthorizedLessonViewModel$doSearch$1"
    f = "AuthorizedLessonViewModel.kt"
    l = {
        0x36
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;Ljava/lang/String;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$doSearch$1;->b:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$doSearch$1;->c:Ljava/lang/String;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$doSearch$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$doSearch$1;->b:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$doSearch$1;->c:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$doSearch$1;-><init>(Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;Ljava/lang/String;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$doSearch$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$doSearch$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$doSearch$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$doSearch$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$doSearch$1;->a:I

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
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$doSearch$1;->b:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;->q()Ll8/h;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    :cond_2
    invoke-interface {p1}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    move-object v3, v1

    .line 38
    check-cast v3, Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-static {v2}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-interface {p1, v1, v3}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    iget-object p1, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$doSearch$1;->c:Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {p1}, Lg8/c0;->h0(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_4

    .line 60
    .line 61
    iget-object p1, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$doSearch$1;->b:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    .line 62
    .line 63
    invoke-static {p1}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;->e(Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;)Ll8/h;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    :cond_3
    invoke-interface {p1}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    move-object v1, v0

    .line 72
    check-cast v1, Lcom/zykj/study/bean/UiState;

    .line 73
    .line 74
    new-instance v1, Lcom/zykj/study/bean/UiState$Success;

    .line 75
    .line 76
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-direct {v1, v2}, Lcom/zykj/study/bean/UiState$Success;-><init>(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    invoke-interface {p1, v0, v1}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_3

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_4
    iget-object p1, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$doSearch$1;->b:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    .line 91
    .line 92
    invoke-static {p1}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;->a(Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;)Lt4/a;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    iget-object v1, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$doSearch$1;->c:Ljava/lang/String;

    .line 97
    .line 98
    iget-object v3, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$doSearch$1;->b:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    .line 99
    .line 100
    invoke-virtual {v3}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;->l()I

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    iput v2, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$doSearch$1;->a:I

    .line 105
    .line 106
    invoke-virtual {p1, v1, v3, p0}, Lt4/a;->c(Ljava/lang/String;ILm7/c;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    if-ne p1, v0, :cond_5

    .line 111
    .line 112
    return-object v0

    .line 113
    :cond_5
    :goto_0
    move-object v1, p1

    .line 114
    check-cast v1, Ljava/util/List;

    .line 115
    .line 116
    iget-object p1, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$doSearch$1;->b:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    .line 117
    .line 118
    invoke-static {p1}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;->e(Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;)Ll8/h;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    :cond_6
    invoke-interface {v3}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    move-object v0, p1

    .line 127
    check-cast v0, Lcom/zykj/study/bean/UiState;

    .line 128
    .line 129
    new-instance v0, Lcom/zykj/study/bean/UiState$Success;

    .line 130
    .line 131
    invoke-direct {v0, v1}, Lcom/zykj/study/bean/UiState$Success;-><init>(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    invoke-interface {v3, p1, v0}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    if-eqz p1, :cond_6

    .line 139
    .line 140
    :goto_1
    iget-object p1, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$doSearch$1;->b:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    .line 141
    .line 142
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;->q()Ll8/h;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    :cond_7
    invoke-interface {p1}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    move-object v1, v0

    .line 151
    check-cast v1, Ljava/lang/Boolean;

    .line 152
    .line 153
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    const/4 v1, 0x0

    .line 157
    invoke-static {v1}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-interface {p1, v0, v1}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    if-eqz v0, :cond_7

    .line 166
    .line 167
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 168
    .line 169
    return-object p1
.end method
