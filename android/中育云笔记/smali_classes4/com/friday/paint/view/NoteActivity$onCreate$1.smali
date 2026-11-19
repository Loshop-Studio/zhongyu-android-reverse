.class final Lcom/friday/paint/view/NoteActivity$onCreate$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/view/NoteActivity;->onCreate(Landroid/os/Bundle;)V
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
    c = "com.friday.paint.view.NoteActivity$onCreate$1"
    f = "NoteActivity.kt"
    l = {
        0x4d
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/paint/view/NoteActivity;


# direct methods
.method public constructor <init>(Lcom/friday/paint/view/NoteActivity;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/NoteActivity$onCreate$1;->d:Lcom/friday/paint/view/NoteActivity;

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
    .locals 1

    .line 1
    new-instance p1, Lcom/friday/paint/view/NoteActivity$onCreate$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/paint/view/NoteActivity$onCreate$1;->d:Lcom/friday/paint/view/NoteActivity;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/paint/view/NoteActivity$onCreate$1;-><init>(Lcom/friday/paint/view/NoteActivity;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/NoteActivity$onCreate$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/NoteActivity$onCreate$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/view/NoteActivity$onCreate$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/view/NoteActivity$onCreate$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/paint/view/NoteActivity$onCreate$1;->c:I

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
    goto/16 :goto_0

    .line 16
    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1

    .line 25
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lcom/friday/paint/view/NoteActivity$onCreate$1;->d:Lcom/friday/paint/view/NoteActivity;

    .line 29
    .line 30
    iget-object v1, p1, Lcom/friday/paint/view/NoteActivity;->k:Ljava/lang/String;

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-nez v3, :cond_2

    .line 37
    .line 38
    invoke-static {}, Lk2/u;->a()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const-string v3, "get32UUID(...)"

    .line 43
    .line 44
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    iput-object v1, p1, Lcom/friday/paint/view/NoteActivity;->k:Ljava/lang/String;

    .line 48
    .line 49
    iget-object p1, p0, Lcom/friday/paint/view/NoteActivity$onCreate$1;->d:Lcom/friday/paint/view/NoteActivity;

    .line 50
    .line 51
    invoke-static {p1}, Lcom/friday/paint/view/NoteActivity;->P(Lcom/friday/paint/view/NoteActivity;)Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iget-object v1, p0, Lcom/friday/paint/view/NoteActivity$onCreate$1;->d:Lcom/friday/paint/view/NoteActivity;

    .line 56
    .line 57
    iget-object v1, v1, Lcom/friday/paint/view/NoteActivity;->k:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {p1, v1}, Lcom/friday/paint/viewmodel/NoteViewModel;->R(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Lcom/friday/paint/view/NoteActivity$onCreate$1;->d:Lcom/friday/paint/view/NoteActivity;

    .line 63
    .line 64
    invoke-static {p1}, Lcom/friday/paint/view/NoteActivity;->P(Lcom/friday/paint/view/NoteActivity;)Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iget-object v1, p0, Lcom/friday/paint/view/NoteActivity$onCreate$1;->d:Lcom/friday/paint/view/NoteActivity;

    .line 69
    .line 70
    iget-object v1, v1, Lcom/friday/paint/view/NoteActivity;->l:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {p1, v1}, Lcom/friday/paint/viewmodel/NoteViewModel;->T(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    iget-object p1, p0, Lcom/friday/paint/view/NoteActivity$onCreate$1;->d:Lcom/friday/paint/view/NoteActivity;

    .line 76
    .line 77
    invoke-static {p1}, Lcom/friday/paint/view/NoteActivity;->P(Lcom/friday/paint/view/NoteActivity;)Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    sget-object v1, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 82
    .line 83
    invoke-virtual {v1}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v1}, Lcom/friday/common/helper/b;->l()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    iget-object v3, p0, Lcom/friday/paint/view/NoteActivity$onCreate$1;->d:Lcom/friday/paint/view/NoteActivity;

    .line 92
    .line 93
    invoke-static {v3}, Lcom/friday/paint/view/NoteActivity;->P(Lcom/friday/paint/view/NoteActivity;)Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {v3}, Lcom/friday/paint/viewmodel/NoteViewModel;->B()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    sget-object v4, Ljava/io/File;->separator:Ljava/lang/String;

    .line 102
    .line 103
    new-instance v5, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {p1, v1}, Lcom/friday/paint/viewmodel/NoteViewModel;->Q(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    iget-object p1, p0, Lcom/friday/paint/view/NoteActivity$onCreate$1;->d:Lcom/friday/paint/view/NoteActivity;

    .line 125
    .line 126
    invoke-static {p1}, Lcom/friday/paint/view/NoteActivity;->P(Lcom/friday/paint/view/NoteActivity;)Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    iget-object v1, p0, Lcom/friday/paint/view/NoteActivity$onCreate$1;->d:Lcom/friday/paint/view/NoteActivity;

    .line 131
    .line 132
    iget-object v1, v1, Lcom/friday/paint/view/NoteActivity;->j:Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {p1, v1}, Lcom/friday/paint/viewmodel/NoteViewModel;->S(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    iget-object p1, p0, Lcom/friday/paint/view/NoteActivity$onCreate$1;->d:Lcom/friday/paint/view/NoteActivity;

    .line 138
    .line 139
    invoke-static {p1}, Lcom/friday/paint/view/NoteActivity;->P(Lcom/friday/paint/view/NoteActivity;)Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    iget-object v1, p0, Lcom/friday/paint/view/NoteActivity$onCreate$1;->d:Lcom/friday/paint/view/NoteActivity;

    .line 144
    .line 145
    iget-object v1, v1, Lcom/friday/paint/view/NoteActivity;->i:Ljava/lang/String;

    .line 146
    .line 147
    invoke-virtual {p1, v1}, Lcom/friday/paint/viewmodel/NoteViewModel;->U(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    iget-object p1, p0, Lcom/friday/paint/view/NoteActivity$onCreate$1;->d:Lcom/friday/paint/view/NoteActivity;

    .line 151
    .line 152
    invoke-virtual {p1, v2}, Lcom/friday/common/base/BaseActivity;->isShowLoading(Z)V

    .line 153
    .line 154
    .line 155
    iget-object p1, p0, Lcom/friday/paint/view/NoteActivity$onCreate$1;->d:Lcom/friday/paint/view/NoteActivity;

    .line 156
    .line 157
    invoke-static {p1}, Lcom/friday/paint/view/NoteActivity;->P(Lcom/friday/paint/view/NoteActivity;)Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    iget-object v1, p0, Lcom/friday/paint/view/NoteActivity$onCreate$1;->d:Lcom/friday/paint/view/NoteActivity;

    .line 162
    .line 163
    iget-object v1, v1, Lcom/friday/paint/view/NoteActivity;->k:Ljava/lang/String;

    .line 164
    .line 165
    iput v2, p0, Lcom/friday/paint/view/NoteActivity$onCreate$1;->c:I

    .line 166
    .line 167
    invoke-virtual {p1, v1, p0}, Lcom/friday/paint/viewmodel/NoteViewModel;->H(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    if-ne p1, v0, :cond_3

    .line 172
    .line 173
    return-object v0

    .line 174
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/friday/paint/view/NoteActivity$onCreate$1;->d:Lcom/friday/paint/view/NoteActivity;

    .line 175
    .line 176
    check-cast p1, Ljava/util/List;

    .line 177
    .line 178
    invoke-static {v0}, Lcom/friday/paint/view/NoteActivity;->P(Lcom/friday/paint/view/NoteActivity;)Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/NoteViewModel;->C()Ljava/util/List;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    check-cast p1, Ljava/util/Collection;

    .line 187
    .line 188
    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 189
    .line 190
    .line 191
    iget-object p1, p0, Lcom/friday/paint/view/NoteActivity$onCreate$1;->d:Lcom/friday/paint/view/NoteActivity;

    .line 192
    .line 193
    const/4 v0, 0x0

    .line 194
    invoke-virtual {p1, v0}, Lcom/friday/common/base/BaseActivity;->isShowLoading(Z)V

    .line 195
    .line 196
    .line 197
    iget-object p1, p0, Lcom/friday/paint/view/NoteActivity$onCreate$1;->d:Lcom/friday/paint/view/NoteActivity;

    .line 198
    .line 199
    invoke-static {p1}, Lcom/friday/paint/view/NoteActivity;->O(Lcom/friday/paint/view/NoteActivity;)Landroidx/fragment/app/Fragment;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->isAdded()Z

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    if-nez p1, :cond_4

    .line 208
    .line 209
    iget-object p1, p0, Lcom/friday/paint/view/NoteActivity$onCreate$1;->d:Lcom/friday/paint/view/NoteActivity;

    .line 210
    .line 211
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    sget v0, Lcom/friday/paint/R$id;->paint_common_fragment:I

    .line 220
    .line 221
    iget-object v1, p0, Lcom/friday/paint/view/NoteActivity$onCreate$1;->d:Lcom/friday/paint/view/NoteActivity;

    .line 222
    .line 223
    invoke-static {v1}, Lcom/friday/paint/view/NoteActivity;->O(Lcom/friday/paint/view/NoteActivity;)Landroidx/fragment/app/Fragment;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    const-string v2, "the_paint_fragment"

    .line 228
    .line 229
    invoke-virtual {p1, v0, v1, v2}, Landroidx/fragment/app/FragmentTransaction;->add(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/FragmentTransaction;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 234
    .line 235
    .line 236
    :cond_4
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 237
    .line 238
    return-object p1
.end method
