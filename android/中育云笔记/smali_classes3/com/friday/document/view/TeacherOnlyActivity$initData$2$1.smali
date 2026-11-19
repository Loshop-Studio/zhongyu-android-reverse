.class final Lcom/friday/document/view/TeacherOnlyActivity$initData$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/TeacherOnlyActivity$initData$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.document.view.TeacherOnlyActivity$initData$2$1"
    f = "TeacherOnlyActivity.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lcom/friday/document/view/TeacherOnlyActivity;


# direct methods
.method public constructor <init>(Lcom/friday/document/view/TeacherOnlyActivity;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/TeacherOnlyActivity$initData$2$1;->e:Lcom/friday/document/view/TeacherOnlyActivity;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance v0, Lcom/friday/document/view/TeacherOnlyActivity$initData$2$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/document/view/TeacherOnlyActivity$initData$2$1;->e:Lcom/friday/document/view/TeacherOnlyActivity;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/friday/document/view/TeacherOnlyActivity$initData$2$1;-><init>(Lcom/friday/document/view/TeacherOnlyActivity;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/friday/document/view/TeacherOnlyActivity$initData$2$1;->d:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final g(Lcom/friday/document/viewmodel/d;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/TeacherOnlyActivity$initData$2$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/friday/document/view/TeacherOnlyActivity$initData$2$1;

    .line 6
    .line 7
    sget-object p2, Lqc/q;->a:Lqc/q;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/friday/document/view/TeacherOnlyActivity$initData$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/friday/document/viewmodel/d;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/TeacherOnlyActivity$initData$2$1;->g(Lcom/friday/document/viewmodel/d;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/TeacherOnlyActivity$initData$2$1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/friday/document/viewmodel/d;

    .line 4
    .line 5
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/friday/document/view/TeacherOnlyActivity$initData$2$1;->c:I

    .line 9
    .line 10
    if-nez v1, :cond_3

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    sget-object p1, Lcom/friday/document/viewmodel/d$a;->a:Lcom/friday/document/viewmodel/d$a;

    .line 16
    .line 17
    invoke-static {v0, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    const/4 v1, 0x1

    .line 22
    const-string v2, "groupSyncing"

    .line 23
    .line 24
    const-string v3, "ivCompleted"

    .line 25
    .line 26
    const-string v4, "groupRetry"

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    const/16 v6, 0x8

    .line 30
    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    iget-object p1, p0, Lcom/friday/document/view/TeacherOnlyActivity$initData$2$1;->e:Lcom/friday/document/view/TeacherOnlyActivity;

    .line 34
    .line 35
    invoke-static {p1}, Lcom/friday/document/view/TeacherOnlyActivity;->Q(Lcom/friday/document/view/TeacherOnlyActivity;)Lcom/friday/document/databinding/ActivityTeacherOnlyBinding;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget-object p1, p1, Lcom/friday/document/databinding/ActivityTeacherOnlyBinding;->d:Landroidx/constraintlayout/widget/Group;

    .line 40
    .line 41
    invoke-static {p1, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lcom/friday/document/view/TeacherOnlyActivity$initData$2$1;->e:Lcom/friday/document/view/TeacherOnlyActivity;

    .line 48
    .line 49
    invoke-static {p1}, Lcom/friday/document/view/TeacherOnlyActivity;->Q(Lcom/friday/document/view/TeacherOnlyActivity;)Lcom/friday/document/databinding/ActivityTeacherOnlyBinding;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iget-object p1, p1, Lcom/friday/document/databinding/ActivityTeacherOnlyBinding;->h:Landroid/widget/ImageView;

    .line 54
    .line 55
    invoke-static {p1, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, Lcom/friday/document/view/TeacherOnlyActivity$initData$2$1;->e:Lcom/friday/document/view/TeacherOnlyActivity;

    .line 62
    .line 63
    invoke-static {p1}, Lcom/friday/document/view/TeacherOnlyActivity;->Q(Lcom/friday/document/view/TeacherOnlyActivity;)Lcom/friday/document/databinding/ActivityTeacherOnlyBinding;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iget-object p1, p1, Lcom/friday/document/databinding/ActivityTeacherOnlyBinding;->e:Landroidx/constraintlayout/widget/Group;

    .line 68
    .line 69
    invoke-static {p1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 73
    .line 74
    .line 75
    iget-object p1, p0, Lcom/friday/document/view/TeacherOnlyActivity$initData$2$1;->e:Lcom/friday/document/view/TeacherOnlyActivity;

    .line 76
    .line 77
    invoke-static {p1}, Lcom/friday/document/view/TeacherOnlyActivity;->Q(Lcom/friday/document/view/TeacherOnlyActivity;)Lcom/friday/document/databinding/ActivityTeacherOnlyBinding;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iget-object p1, p1, Lcom/friday/document/databinding/ActivityTeacherOnlyBinding;->k:Landroid/widget/TextView;

    .line 82
    .line 83
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 84
    .line 85
    .line 86
    goto/16 :goto_0

    .line 87
    .line 88
    :cond_0
    instance-of p1, v0, Lcom/friday/document/viewmodel/d$b;

    .line 89
    .line 90
    if-eqz p1, :cond_1

    .line 91
    .line 92
    iget-object p1, p0, Lcom/friday/document/view/TeacherOnlyActivity$initData$2$1;->e:Lcom/friday/document/view/TeacherOnlyActivity;

    .line 93
    .line 94
    invoke-static {p1}, Lcom/friday/document/view/TeacherOnlyActivity;->Q(Lcom/friday/document/view/TeacherOnlyActivity;)Lcom/friday/document/databinding/ActivityTeacherOnlyBinding;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iget-object p1, p1, Lcom/friday/document/databinding/ActivityTeacherOnlyBinding;->d:Landroidx/constraintlayout/widget/Group;

    .line 99
    .line 100
    invoke-static {p1, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 104
    .line 105
    .line 106
    iget-object p1, p0, Lcom/friday/document/view/TeacherOnlyActivity$initData$2$1;->e:Lcom/friday/document/view/TeacherOnlyActivity;

    .line 107
    .line 108
    invoke-static {p1}, Lcom/friday/document/view/TeacherOnlyActivity;->Q(Lcom/friday/document/view/TeacherOnlyActivity;)Lcom/friday/document/databinding/ActivityTeacherOnlyBinding;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    iget-object p1, p1, Lcom/friday/document/databinding/ActivityTeacherOnlyBinding;->h:Landroid/widget/ImageView;

    .line 113
    .line 114
    invoke-static {p1, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 118
    .line 119
    .line 120
    iget-object p1, p0, Lcom/friday/document/view/TeacherOnlyActivity$initData$2$1;->e:Lcom/friday/document/view/TeacherOnlyActivity;

    .line 121
    .line 122
    invoke-static {p1}, Lcom/friday/document/view/TeacherOnlyActivity;->Q(Lcom/friday/document/view/TeacherOnlyActivity;)Lcom/friday/document/databinding/ActivityTeacherOnlyBinding;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    iget-object p1, p1, Lcom/friday/document/databinding/ActivityTeacherOnlyBinding;->e:Landroidx/constraintlayout/widget/Group;

    .line 127
    .line 128
    invoke-static {p1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 132
    .line 133
    .line 134
    iget-object p1, p0, Lcom/friday/document/view/TeacherOnlyActivity$initData$2$1;->e:Lcom/friday/document/view/TeacherOnlyActivity;

    .line 135
    .line 136
    invoke-static {p1}, Lcom/friday/document/view/TeacherOnlyActivity;->Q(Lcom/friday/document/view/TeacherOnlyActivity;)Lcom/friday/document/databinding/ActivityTeacherOnlyBinding;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    iget-object p1, p1, Lcom/friday/document/databinding/ActivityTeacherOnlyBinding;->k:Landroid/widget/TextView;

    .line 141
    .line 142
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 143
    .line 144
    .line 145
    iget-object p1, p0, Lcom/friday/document/view/TeacherOnlyActivity$initData$2$1;->e:Lcom/friday/document/view/TeacherOnlyActivity;

    .line 146
    .line 147
    invoke-static {p1}, Lcom/friday/document/view/TeacherOnlyActivity;->R(Lcom/friday/document/view/TeacherOnlyActivity;)Lcom/friday/document/adapter/SyncFailedAdapter;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    check-cast v0, Lcom/friday/document/viewmodel/d$b;

    .line 152
    .line 153
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/d$b;->a()Ljava/util/List;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    check-cast v0, Ljava/util/Collection;

    .line 158
    .line 159
    invoke-virtual {p1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setList(Ljava/util/Collection;)V

    .line 160
    .line 161
    .line 162
    goto :goto_0

    .line 163
    :cond_1
    sget-object p1, Lcom/friday/document/viewmodel/d$c;->a:Lcom/friday/document/viewmodel/d$c;

    .line 164
    .line 165
    invoke-static {v0, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    if-eqz p1, :cond_2

    .line 170
    .line 171
    iget-object p1, p0, Lcom/friday/document/view/TeacherOnlyActivity$initData$2$1;->e:Lcom/friday/document/view/TeacherOnlyActivity;

    .line 172
    .line 173
    invoke-static {p1}, Lcom/friday/document/view/TeacherOnlyActivity;->Q(Lcom/friday/document/view/TeacherOnlyActivity;)Lcom/friday/document/databinding/ActivityTeacherOnlyBinding;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    iget-object p1, p1, Lcom/friday/document/databinding/ActivityTeacherOnlyBinding;->d:Landroidx/constraintlayout/widget/Group;

    .line 178
    .line 179
    invoke-static {p1, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 183
    .line 184
    .line 185
    iget-object p1, p0, Lcom/friday/document/view/TeacherOnlyActivity$initData$2$1;->e:Lcom/friday/document/view/TeacherOnlyActivity;

    .line 186
    .line 187
    invoke-static {p1}, Lcom/friday/document/view/TeacherOnlyActivity;->Q(Lcom/friday/document/view/TeacherOnlyActivity;)Lcom/friday/document/databinding/ActivityTeacherOnlyBinding;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    iget-object p1, p1, Lcom/friday/document/databinding/ActivityTeacherOnlyBinding;->h:Landroid/widget/ImageView;

    .line 192
    .line 193
    invoke-static {p1, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 197
    .line 198
    .line 199
    iget-object p1, p0, Lcom/friday/document/view/TeacherOnlyActivity$initData$2$1;->e:Lcom/friday/document/view/TeacherOnlyActivity;

    .line 200
    .line 201
    invoke-static {p1}, Lcom/friday/document/view/TeacherOnlyActivity;->Q(Lcom/friday/document/view/TeacherOnlyActivity;)Lcom/friday/document/databinding/ActivityTeacherOnlyBinding;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    iget-object p1, p1, Lcom/friday/document/databinding/ActivityTeacherOnlyBinding;->e:Landroidx/constraintlayout/widget/Group;

    .line 206
    .line 207
    invoke-static {p1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 211
    .line 212
    .line 213
    iget-object p1, p0, Lcom/friday/document/view/TeacherOnlyActivity$initData$2$1;->e:Lcom/friday/document/view/TeacherOnlyActivity;

    .line 214
    .line 215
    invoke-static {p1}, Lcom/friday/document/view/TeacherOnlyActivity;->Q(Lcom/friday/document/view/TeacherOnlyActivity;)Lcom/friday/document/databinding/ActivityTeacherOnlyBinding;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    iget-object p1, p1, Lcom/friday/document/databinding/ActivityTeacherOnlyBinding;->k:Landroid/widget/TextView;

    .line 220
    .line 221
    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 222
    .line 223
    .line 224
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 225
    .line 226
    return-object p1

    .line 227
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 228
    .line 229
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 230
    .line 231
    .line 232
    throw p1

    .line 233
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 234
    .line 235
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 236
    .line 237
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    throw p1
.end method
