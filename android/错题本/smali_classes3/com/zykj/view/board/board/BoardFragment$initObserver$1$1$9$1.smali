.class final Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$9$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$9;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lr6/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcom/zykj/view/board/board/ExtraUIState;",
        "state",
        "Ld6/s;",
        "<anonymous>",
        "(Lcom/zykj/view/board/board/ExtraUIState;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$9$1"
    f = "BoardFragment.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBoardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$9$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1030:1\n257#2,2:1031\n257#2,2:1033\n257#2,2:1035\n257#2,2:1037\n257#2,2:1039\n257#2,2:1041\n257#2,2:1043\n257#2,2:1045\n*S KotlinDebug\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$9$1\n*L\n718#1:1031,2\n719#1:1033,2\n720#1:1035,2\n721#1:1037,2\n722#1:1039,2\n725#1:1041,2\n727#1:1043,2\n730#1:1045,2\n*E\n"
    }
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/zykj/view/board/board/BoardFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/board/BoardFragment;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/view/board/board/BoardFragment;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$9$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$9$1;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lh6/c<",
            "*>;)",
            "Lh6/c<",
            "Ld6/s;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$9$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$9$1;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$9$1;-><init>(Lcom/zykj/view/board/board/BoardFragment;Lh6/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$9$1;->L$0:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Lcom/zykj/view/board/board/ExtraUIState;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/view/board/board/ExtraUIState;",
            "Lh6/c<",
            "-",
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$9$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$9$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$9$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/zykj/view/board/board/ExtraUIState;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$9$1;->invoke(Lcom/zykj/view/board/board/ExtraUIState;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$9$1;->L$0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/view/board/board/ExtraUIState;

    .line 4
    .line 5
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 6
    .line 7
    iget v1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$9$1;->label:I

    .line 8
    .line 9
    if-nez v1, :cond_12

    .line 10
    .line 11
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$9$1;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 15
    .line 16
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardFragment;->access$getMBinding$p(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const/4 v1, 0x0

    .line 21
    const-string v2, "mBinding"

    .line 22
    .line 23
    if-eqz p1, :cond_11

    .line 24
    .line 25
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeSelect:Lcom/zykj/view/databinding/ViewIncludeSelectTypeBinding;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const-string v3, "getRoot(...)"

    .line 32
    .line 33
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/zykj/view/board/board/ExtraUIState;->getMinorToolType()Lcom/zykj/view/board/board/MinorToolType;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-virtual {v4}, Lcom/zykj/view/board/board/MinorToolType;->getSelectVisible()Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    const/16 v5, 0x8

    .line 45
    .line 46
    const/4 v6, 0x0

    .line 47
    if-eqz v4, :cond_0

    .line 48
    .line 49
    move v4, v6

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    move v4, v5

    .line 52
    :goto_0
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$9$1;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 56
    .line 57
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardFragment;->access$getMBinding$p(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-eqz p1, :cond_10

    .line 62
    .line 63
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includePen:Lcom/zykj/view/databinding/ViewIncludePenBinding;

    .line 64
    .line 65
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Lcom/zykj/view/board/board/ExtraUIState;->getMinorToolType()Lcom/zykj/view/board/board/MinorToolType;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-virtual {v4}, Lcom/zykj/view/board/board/MinorToolType;->getPenVisible()Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-eqz v4, :cond_1

    .line 81
    .line 82
    move v4, v6

    .line 83
    goto :goto_1

    .line 84
    :cond_1
    move v4, v5

    .line 85
    :goto_1
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 86
    .line 87
    .line 88
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$9$1;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 89
    .line 90
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardFragment;->access$getMBinding$p(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    if-eqz p1, :cond_f

    .line 95
    .line 96
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeEraser:Lcom/zykj/view/databinding/ViewIncludeEraserBinding;

    .line 97
    .line 98
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Lcom/zykj/view/board/board/ExtraUIState;->getMinorToolType()Lcom/zykj/view/board/board/MinorToolType;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    invoke-virtual {v4}, Lcom/zykj/view/board/board/MinorToolType;->getEraserVisible()Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-eqz v4, :cond_2

    .line 114
    .line 115
    move v4, v6

    .line 116
    goto :goto_2

    .line 117
    :cond_2
    move v4, v5

    .line 118
    :goto_2
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 119
    .line 120
    .line 121
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$9$1;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 122
    .line 123
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardFragment;->access$getMBinding$p(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    if-eqz p1, :cond_e

    .line 128
    .line 129
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeGraph:Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;

    .line 130
    .line 131
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0}, Lcom/zykj/view/board/board/ExtraUIState;->getMinorToolType()Lcom/zykj/view/board/board/MinorToolType;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    invoke-virtual {v4}, Lcom/zykj/view/board/board/MinorToolType;->getGraphVisible()Z

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    if-eqz v4, :cond_3

    .line 147
    .line 148
    move v4, v6

    .line 149
    goto :goto_3

    .line 150
    :cond_3
    move v4, v5

    .line 151
    :goto_3
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 152
    .line 153
    .line 154
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$9$1;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 155
    .line 156
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardFragment;->access$getMBinding$p(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    if-eqz p1, :cond_d

    .line 161
    .line 162
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeBackground:Lcom/zykj/view/databinding/ViewIncludeBackgroundColorBinding;

    .line 163
    .line 164
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0}, Lcom/zykj/view/board/board/ExtraUIState;->getMinorToolType()Lcom/zykj/view/board/board/MinorToolType;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    invoke-virtual {v4}, Lcom/zykj/view/board/board/MinorToolType;->getBackgroundVisible()Z

    .line 176
    .line 177
    .line 178
    move-result v4

    .line 179
    if-eqz v4, :cond_4

    .line 180
    .line 181
    move v4, v6

    .line 182
    goto :goto_4

    .line 183
    :cond_4
    move v4, v5

    .line 184
    :goto_4
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 185
    .line 186
    .line 187
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$9$1;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 188
    .line 189
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardFragment;->access$getMBinding$p(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    if-eqz p1, :cond_c

    .line 194
    .line 195
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeCommit:Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;

    .line 196
    .line 197
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0}, Lcom/zykj/view/board/board/ExtraUIState;->getConfirmButtonType()Lcom/zykj/view/board/board/ConfirmButtonType;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    invoke-virtual {v4}, Lcom/zykj/view/board/board/ConfirmButtonType;->isCommitVisible()Z

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    if-eqz v4, :cond_5

    .line 213
    .line 214
    move v4, v6

    .line 215
    goto :goto_5

    .line 216
    :cond_5
    move v4, v5

    .line 217
    :goto_5
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 218
    .line 219
    .line 220
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$9$1;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 221
    .line 222
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardFragment;->access$getMBinding$p(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    if-eqz p1, :cond_b

    .line 227
    .line 228
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeRecord:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    .line 229
    .line 230
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0}, Lcom/zykj/view/board/board/ExtraUIState;->getConfirmButtonType()Lcom/zykj/view/board/board/ConfirmButtonType;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    invoke-virtual {v3}, Lcom/zykj/view/board/board/ConfirmButtonType;->isRecordVisible()Z

    .line 242
    .line 243
    .line 244
    move-result v3

    .line 245
    if-eqz v3, :cond_6

    .line 246
    .line 247
    move v3, v6

    .line 248
    goto :goto_6

    .line 249
    :cond_6
    move v3, v5

    .line 250
    :goto_6
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 251
    .line 252
    .line 253
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$9$1;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 254
    .line 255
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardFragment;->access$getMBinding$p(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    if-eqz p1, :cond_a

    .line 260
    .line 261
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeRecord:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    .line 262
    .line 263
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;->llDeleteDraft:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 264
    .line 265
    const-string v3, "llDeleteDraft"

    .line 266
    .line 267
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v0}, Lcom/zykj/view/board/board/ExtraUIState;->isDeleteDraftVisible()Z

    .line 271
    .line 272
    .line 273
    move-result v3

    .line 274
    if-eqz v3, :cond_7

    .line 275
    .line 276
    move v5, v6

    .line 277
    :cond_7
    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 278
    .line 279
    .line 280
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$9$1;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 281
    .line 282
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardFragment;->access$getMBinding$p(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 283
    .line 284
    .line 285
    move-result-object p1

    .line 286
    if-eqz p1, :cond_9

    .line 287
    .line 288
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->sketchProgressVertical:Lcom/zykj/view/widget/SketchProgressView;

    .line 289
    .line 290
    invoke-virtual {v0}, Lcom/zykj/view/board/board/ExtraUIState;->isVerticalProgressTouchable()Z

    .line 291
    .line 292
    .line 293
    move-result v3

    .line 294
    invoke-virtual {p1, v3}, Lcom/zykj/view/widget/SketchProgressView;->setTouchable(Z)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v0}, Lcom/zykj/view/board/board/ExtraUIState;->getVerticalProgress()F

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    invoke-virtual {p1, v3}, Lcom/zykj/view/widget/SketchProgressView;->setProgress(F)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v0}, Lcom/zykj/view/board/board/ExtraUIState;->getVerticalThumbTime()F

    .line 305
    .line 306
    .line 307
    move-result v3

    .line 308
    invoke-virtual {p1, v3}, Lcom/zykj/view/widget/SketchProgressView;->setThumbTime(F)V

    .line 309
    .line 310
    .line 311
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$9$1;->this$0:Lcom/zykj/view/board/board/BoardFragment;

    .line 312
    .line 313
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardFragment;->access$getMBinding$p(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 314
    .line 315
    .line 316
    move-result-object p1

    .line 317
    if-eqz p1, :cond_8

    .line 318
    .line 319
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->sketchProgressHorizontal:Lcom/zykj/view/widget/SketchProgressView;

    .line 320
    .line 321
    invoke-virtual {v0}, Lcom/zykj/view/board/board/ExtraUIState;->isHorizontalProgressTouchable()Z

    .line 322
    .line 323
    .line 324
    move-result v1

    .line 325
    invoke-virtual {p1, v1}, Lcom/zykj/view/widget/SketchProgressView;->setTouchable(Z)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v0}, Lcom/zykj/view/board/board/ExtraUIState;->getHorizontalProgress()F

    .line 329
    .line 330
    .line 331
    move-result v1

    .line 332
    invoke-virtual {p1, v1}, Lcom/zykj/view/widget/SketchProgressView;->setProgress(F)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v0}, Lcom/zykj/view/board/board/ExtraUIState;->getHorizontalThumbTime()F

    .line 336
    .line 337
    .line 338
    move-result v0

    .line 339
    invoke-virtual {p1, v0}, Lcom/zykj/view/widget/SketchProgressView;->setThumbTime(F)V

    .line 340
    .line 341
    .line 342
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 343
    .line 344
    return-object p1

    .line 345
    :cond_8
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    throw v1

    .line 349
    :cond_9
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    throw v1

    .line 353
    :cond_a
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    throw v1

    .line 357
    :cond_b
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    throw v1

    .line 361
    :cond_c
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    throw v1

    .line 365
    :cond_d
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    throw v1

    .line 369
    :cond_e
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    throw v1

    .line 373
    :cond_f
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    throw v1

    .line 377
    :cond_10
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    throw v1

    .line 381
    :cond_11
    invoke-static {v2}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    throw v1

    .line 385
    :cond_12
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 386
    .line 387
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 388
    .line 389
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    throw p1
.end method
