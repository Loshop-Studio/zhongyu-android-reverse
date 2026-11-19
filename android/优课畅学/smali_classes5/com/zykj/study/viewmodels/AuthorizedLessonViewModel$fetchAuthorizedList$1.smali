.class final Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$fetchAuthorizedList$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;->i()V
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
    c = "com.zykj.study.viewmodels.AuthorizedLessonViewModel$fetchAuthorizedList$1"
    f = "AuthorizedLessonViewModel.kt"
    l = {
        0x48,
        0x4c
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:J

.field public b:J

.field public c:Ljava/lang/Object;

.field public d:I

.field public final synthetic e:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$fetchAuthorizedList$1;->e:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$fetchAuthorizedList$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$fetchAuthorizedList$1;->e:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$fetchAuthorizedList$1;-><init>(Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$fetchAuthorizedList$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$fetchAuthorizedList$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$fetchAuthorizedList$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$fetchAuthorizedList$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$fetchAuthorizedList$1;->d:I

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
    iget-object v0, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$fetchAuthorizedList$1;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ljava/util/List;

    .line 18
    .line 19
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    iget-wide v3, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$fetchAuthorizedList$1;->a:J

    .line 32
    .line 33
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 41
    .line 42
    .line 43
    move-result-wide v4

    .line 44
    iget-object p1, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$fetchAuthorizedList$1;->e:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;->p()Ll8/h;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    :cond_3
    invoke-interface {p1}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    move-object v6, v1

    .line 55
    check-cast v6, Ljava/lang/Boolean;

    .line 56
    .line 57
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-static {v3}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    invoke-interface {p1, v1, v6}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_3

    .line 69
    .line 70
    iget-object p1, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$fetchAuthorizedList$1;->e:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    .line 71
    .line 72
    invoke-static {p1}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;->a(Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;)Lt4/a;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iget-object v1, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$fetchAuthorizedList$1;->e:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    .line 77
    .line 78
    invoke-virtual {v1}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;->l()I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    iput-wide v4, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$fetchAuthorizedList$1;->a:J

    .line 83
    .line 84
    iput v3, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$fetchAuthorizedList$1;->d:I

    .line 85
    .line 86
    invoke-virtual {p1, v1, p0}, Lt4/a;->d(ILm7/c;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-ne p1, v0, :cond_4

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_4
    move-wide v3, v4

    .line 94
    :goto_0
    check-cast p1, Ljava/util/List;

    .line 95
    .line 96
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 97
    .line 98
    .line 99
    move-result-wide v5

    .line 100
    sub-long v7, v5, v3

    .line 101
    .line 102
    const-wide/16 v9, 0x1f4

    .line 103
    .line 104
    cmp-long v1, v7, v9

    .line 105
    .line 106
    if-gtz v1, :cond_6

    .line 107
    .line 108
    const/16 v1, 0x1f4

    .line 109
    .line 110
    int-to-long v9, v1

    .line 111
    sub-long/2addr v9, v7

    .line 112
    iput-object p1, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$fetchAuthorizedList$1;->c:Ljava/lang/Object;

    .line 113
    .line 114
    iput-wide v3, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$fetchAuthorizedList$1;->a:J

    .line 115
    .line 116
    iput-wide v5, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$fetchAuthorizedList$1;->b:J

    .line 117
    .line 118
    iput v2, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$fetchAuthorizedList$1;->d:I

    .line 119
    .line 120
    invoke-static {v9, v10, p0}, Lkotlinx/coroutines/DelayKt;->b(JLm7/c;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    if-ne v1, v0, :cond_5

    .line 125
    .line 126
    :goto_1
    return-object v0

    .line 127
    :cond_5
    move-object v0, p1

    .line 128
    :goto_2
    move-object v1, v0

    .line 129
    goto :goto_3

    .line 130
    :cond_6
    move-object v1, p1

    .line 131
    :goto_3
    iget-object p1, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$fetchAuthorizedList$1;->e:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    .line 132
    .line 133
    invoke-static {p1}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;->b(Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;)Ll8/h;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    :cond_7
    invoke-interface {v6}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    move-object v0, p1

    .line 142
    check-cast v0, Lcom/zykj/study/bean/UiState;

    .line 143
    .line 144
    new-instance v0, Lcom/zykj/study/bean/UiState$Success;

    .line 145
    .line 146
    invoke-direct {v0, v1}, Lcom/zykj/study/bean/UiState$Success;-><init>(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    invoke-interface {v6, p1, v0}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    if-eqz p1, :cond_7

    .line 154
    .line 155
    iget-object p1, p0, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel$fetchAuthorizedList$1;->e:Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;

    .line 156
    .line 157
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;->p()Ll8/h;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    :cond_8
    invoke-interface {p1}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    move-object v1, v0

    .line 166
    check-cast v1, Ljava/lang/Boolean;

    .line 167
    .line 168
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    const/4 v1, 0x0

    .line 172
    invoke-static {v1}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-interface {p1, v0, v1}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-eqz v0, :cond_8

    .line 181
    .line 182
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 183
    .line 184
    return-object p1
.end method
