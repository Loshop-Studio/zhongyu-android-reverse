# RE note 本类字节码直接引用的读写或显示接口包括DataStore、WebView。
.class final Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
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
    c = "com.zykj.study.ui.home.exercise.ExerciseTrainFragment$initView$3$1"
    f = "ExerciseTrainFragment.kt"
    l = {
        0x7e,
        0x85
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:I

.field public final synthetic f:Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;

.field public final synthetic g:Lcom/zykj/study/bean/exercise/QuestionBean;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Lcom/zykj/study/bean/exercise/QuestionBean;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->f:Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->g:Lcom/zykj/study/bean/exercise/QuestionBean;

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
    new-instance p1, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->f:Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->g:Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;-><init>(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;Lcom/zykj/study/bean/exercise/QuestionBean;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->e:I

    .line 6
    .line 7
    const-string v2, "thumbnail_dir"

    .line 8
    .line 9
    const-string v3, ""

    .line 10
    .line 11
    const/4 v4, 0x2

    .line 12
    const/4 v5, 0x1

    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    if-eq v1, v5, :cond_1

    .line 16
    .line 17
    if-ne v1, v4, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->d:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/lang/String;

    .line 22
    .line 23
    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->c:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Ljava/lang/String;

    .line 26
    .line 27
    iget-object v4, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v4, Ljava/io/File;

    .line 30
    .line 31
    iget-object v5, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->a:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v5, Landroidx/lifecycle/MutableLiveData;

    .line 34
    .line 35
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto/16 :goto_2

    .line 39
    .line 40
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->d:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Ljava/lang/String;

    .line 51
    .line 52
    iget-object v5, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->c:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v5, Ljava/lang/String;

    .line 55
    .line 56
    iget-object v6, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v6, Ljava/io/File;

    .line 59
    .line 60
    iget-object v7, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->a:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v7, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 63
    .line 64
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->f:Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;

    .line 72
    .line 73
    invoke-virtual {p1}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseTrainBinding;

    .line 78
    .line 79
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentExerciseTrainBinding;->exerciseSubject:Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;

    .line 80
    .line 81
    iget-object p1, p1, Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;->webView:Lcom/zykj/study/view/CustomWebView;

    .line 82
    .line 83
    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->g:Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 84
    .line 85
    invoke-virtual {v1}, Lcom/zykj/study/bean/exercise/QuestionBean;->fetchAdaptContent()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    const-string v6, "text/html; charset=UTF-8"

    .line 90
    .line 91
    const/4 v7, 0x0

    .line 92
    invoke-virtual {p1, v1, v6, v7}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    iget-object p1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->f:Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;

    .line 96
    .line 97
    invoke-virtual {p1}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseTrainBinding;

    .line 102
    .line 103
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentExerciseTrainBinding;->exerciseSubject:Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;

    .line 104
    .line 105
    iget-object p1, p1, Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;->webViewAnalysis:Lcom/zykj/study/view/CustomWebView;

    .line 106
    .line 107
    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->g:Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 108
    .line 109
    invoke-virtual {v1}, Lcom/zykj/study/bean/exercise/QuestionBean;->fetchAdaptAnalysis()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-virtual {p1, v1, v6, v7}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    iget-object p1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->f:Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;

    .line 117
    .line 118
    invoke-virtual {p1}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    check-cast p1, Lcom/zykj/study/databinding/FragmentExerciseTrainBinding;

    .line 123
    .line 124
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentExerciseTrainBinding;->exerciseSubject:Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;

    .line 125
    .line 126
    iget-object p1, p1, Lcom/zykj/study/databinding/LayoutExerciseSubjectBinding;->webViewCorrectAnswer:Lcom/zykj/study/view/CustomWebView;

    .line 127
    .line 128
    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->g:Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 129
    .line 130
    invoke-virtual {v1}, Lcom/zykj/study/bean/exercise/QuestionBean;->getAdaptStandardAnswerStr()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {p1, v1, v6, v7}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    iget-object p1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->f:Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;

    .line 138
    .line 139
    invoke-static {p1}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->t(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;)Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    iget-object p1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->f:Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;

    .line 144
    .line 145
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-virtual {p1}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 154
    .line 155
    iget-object p1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->f:Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;

    .line 156
    .line 157
    invoke-static {p1}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->u(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;)Lcom/zykj/lib/login/ui/main/LoginViewModel;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-virtual {p1}, Lcom/zykj/lib/login/ui/main/LoginViewModel;->c()Landroidx/datastore/core/DataStore;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-interface {p1}, Landroidx/datastore/core/DataStore;->getData()Ll8/c;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    iput-object v7, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->a:Ljava/lang/Object;

    .line 170
    .line 171
    iput-object v6, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->b:Ljava/lang/Object;

    .line 172
    .line 173
    iput-object v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->c:Ljava/lang/Object;

    .line 174
    .line 175
    iput-object v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->d:Ljava/lang/Object;

    .line 176
    .line 177
    iput v5, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->e:I

    .line 178
    .line 179
    invoke-static {p1, p0}, Ll8/e;->z(Ll8/c;Lm7/c;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    if-ne p1, v0, :cond_3

    .line 184
    .line 185
    goto :goto_1

    .line 186
    :cond_3
    move-object v5, v1

    .line 187
    :goto_0
    check-cast p1, Lcom/zykj/lib/login/proto/UserBean;

    .line 188
    .line 189
    if-eqz p1, :cond_4

    .line 190
    .line 191
    invoke-virtual {p1}, Lcom/zykj/lib/login/proto/UserBean;->getId()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    if-nez p1, :cond_5

    .line 196
    .line 197
    :cond_4
    move-object p1, v3

    .line 198
    :cond_5
    new-instance v8, Ljava/lang/StringBuilder;

    .line 199
    .line 200
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->g:Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 223
    .line 224
    invoke-virtual {v1}, Lcom/zykj/study/bean/exercise/QuestionBean;->getId()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    new-instance v5, Ljava/io/File;

    .line 229
    .line 230
    invoke-direct {v5, p1, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    const-string v1, "getAbsolutePath(...)"

    .line 238
    .line 239
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v7, p1}, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->H(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    iget-object p1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->f:Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;

    .line 246
    .line 247
    invoke-static {p1}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->t(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;)Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/ExerciseTrainViewModel;->A()Landroidx/lifecycle/MutableLiveData;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    iget-object p1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->f:Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;

    .line 256
    .line 257
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    invoke-virtual {p1}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 266
    .line 267
    iget-object v6, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->f:Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;

    .line 268
    .line 269
    invoke-static {v6}, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;->u(Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment;)Lcom/zykj/lib/login/ui/main/LoginViewModel;

    .line 270
    .line 271
    .line 272
    move-result-object v6

    .line 273
    invoke-virtual {v6}, Lcom/zykj/lib/login/ui/main/LoginViewModel;->c()Landroidx/datastore/core/DataStore;

    .line 274
    .line 275
    .line 276
    move-result-object v6

    .line 277
    invoke-interface {v6}, Landroidx/datastore/core/DataStore;->getData()Ll8/c;

    .line 278
    .line 279
    .line 280
    move-result-object v6

    .line 281
    iput-object v5, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->a:Ljava/lang/Object;

    .line 282
    .line 283
    iput-object p1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->b:Ljava/lang/Object;

    .line 284
    .line 285
    iput-object v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->c:Ljava/lang/Object;

    .line 286
    .line 287
    iput-object v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->d:Ljava/lang/Object;

    .line 288
    .line 289
    iput v4, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->e:I

    .line 290
    .line 291
    invoke-static {v6, p0}, Ll8/e;->z(Ll8/c;Lm7/c;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    if-ne v4, v0, :cond_6

    .line 296
    .line 297
    :goto_1
    return-object v0

    .line 298
    :cond_6
    move-object v0, v4

    .line 299
    move-object v4, p1

    .line 300
    move-object p1, v0

    .line 301
    move-object v0, v1

    .line 302
    :goto_2
    check-cast p1, Lcom/zykj/lib/login/proto/UserBean;

    .line 303
    .line 304
    if-eqz p1, :cond_8

    .line 305
    .line 306
    invoke-virtual {p1}, Lcom/zykj/lib/login/proto/UserBean;->getId()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    if-nez p1, :cond_7

    .line 311
    .line 312
    goto :goto_3

    .line 313
    :cond_7
    move-object v3, p1

    .line 314
    :cond_8
    :goto_3
    sget-object p1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 315
    .line 316
    iget-object v6, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->g:Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 317
    .line 318
    invoke-virtual {v6}, Lcom/zykj/study/bean/exercise/QuestionBean;->getId()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v6

    .line 322
    new-instance v7, Ljava/lang/StringBuilder;

    .line 323
    .line 324
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object p1

    .line 352
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseTrainFragment$initView$3$1;->g:Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 353
    .line 354
    invoke-virtual {v0}, Lcom/zykj/study/bean/exercise/QuestionBean;->getId()Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    new-instance v1, Ljava/lang/StringBuilder;

    .line 359
    .line 360
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    const-string v0, ".png"

    .line 367
    .line 368
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    new-instance v1, Ljava/io/File;

    .line 376
    .line 377
    invoke-direct {v1, p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object p1

    .line 384
    invoke-virtual {v5, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 388
    .line 389
    return-object p1
.end method
