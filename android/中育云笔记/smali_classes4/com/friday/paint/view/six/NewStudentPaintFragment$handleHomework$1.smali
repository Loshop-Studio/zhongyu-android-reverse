.class final Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/view/six/NewStudentPaintFragment;->handleHomework(Lcom/friday/common/classtest/MqttResponse;)V
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
    c = "com.friday.paint.view.six.NewStudentPaintFragment$handleHomework$1"
    f = "NewStudentPaintFragment.kt"
    l = {
        0x13c,
        0x15a
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:I

.field public final synthetic f:Lcom/friday/paint/view/six/NewStudentPaintFragment;

.field public final synthetic g:Lcom/friday/common/classtest/MqttResponse;


# direct methods
.method public constructor <init>(Lcom/friday/paint/view/six/NewStudentPaintFragment;Lcom/friday/common/classtest/MqttResponse;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->g:Lcom/friday/common/classtest/MqttResponse;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic g(Lcom/friday/common/classtest/MqttResponse;Lcom/friday/paint/view/six/NewStudentPaintFragment;Lkotlin/jvm/internal/Ref$ObjectRef;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->m(Lcom/friday/common/classtest/MqttResponse;Lcom/friday/paint/view/six/NewStudentPaintFragment;Lkotlin/jvm/internal/Ref$ObjectRef;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Lcom/friday/common/classtest/MqttResponse;Lcom/friday/paint/view/six/NewStudentPaintFragment;Lkotlin/jvm/internal/Ref$ObjectRef;)Lqc/q;
    .locals 12

    .line 1
    const-class v0, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse$Data;->getQstType()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/16 v2, 0x8

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x1

    .line 15
    const/4 v5, 0x0

    .line 16
    if-eqz v1, :cond_5

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse$Data;->getQuestionInfo()Lcom/friday/common/classtest/MqttResponse$QuestionInfo;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse$QuestionInfo;->getQstCount()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object v1, v5

    .line 38
    :goto_0
    if-eqz v1, :cond_6

    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse$Data;->getQuestionInfo()Lcom/friday/common/classtest/MqttResponse$QuestionInfo;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse$QuestionInfo;->getOptions()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    goto :goto_1

    .line 59
    :cond_1
    move-object v1, v5

    .line 60
    :goto_1
    if-eqz v1, :cond_6

    .line 61
    .line 62
    invoke-static {p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {p0}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    invoke-virtual {v6}, Lcom/friday/common/classtest/MqttResponse$Data;->getQuestionInfo()Lcom/friday/common/classtest/MqttResponse$QuestionInfo;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    if-eqz v6, :cond_2

    .line 75
    .line 76
    invoke-virtual {v6}, Lcom/friday/common/classtest/MqttResponse$QuestionInfo;->getOptions()I

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    goto :goto_2

    .line 85
    :cond_2
    move-object v6, v5

    .line 86
    :goto_2
    invoke-static {v6}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    invoke-virtual {v1, v6}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->x(I)V

    .line 94
    .line 95
    .line 96
    invoke-static {p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {p0}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    invoke-virtual {v6}, Lcom/friday/common/classtest/MqttResponse$Data;->getQuestionInfo()Lcom/friday/common/classtest/MqttResponse$QuestionInfo;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    if-eqz v6, :cond_3

    .line 109
    .line 110
    invoke-virtual {v6}, Lcom/friday/common/classtest/MqttResponse$QuestionInfo;->getQstCount()I

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    goto :goto_3

    .line 119
    :cond_3
    move-object v6, v5

    .line 120
    :goto_3
    invoke-static {v6}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    invoke-virtual {v1, v6}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->y(I)V

    .line 128
    .line 129
    .line 130
    invoke-static {p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {p0}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    invoke-virtual {v6}, Lcom/friday/common/classtest/MqttResponse$Data;->getQstType()I

    .line 139
    .line 140
    .line 141
    move-result v6

    .line 142
    if-ne v6, v4, :cond_4

    .line 143
    .line 144
    move v6, v4

    .line 145
    goto :goto_4

    .line 146
    :cond_4
    move v6, v3

    .line 147
    :goto_4
    invoke-virtual {v1, v6}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->z(Z)V

    .line 148
    .line 149
    .line 150
    invoke-static {p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-virtual {v1, v3}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->v(Z)V

    .line 155
    .line 156
    .line 157
    invoke-static {p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-virtual {v1}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->j()Landroidx/lifecycle/MutableLiveData;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-virtual {p0}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    invoke-virtual {p0}, Lcom/friday/common/classtest/MqttResponse$Data;->getCanSubmit()Z

    .line 170
    .line 171
    .line 172
    move-result p0

    .line 173
    xor-int/2addr p0, v4

    .line 174
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    invoke-virtual {v1, p0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    invoke-static {p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    invoke-virtual {p0, v4}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->u(Z)V

    .line 186
    .line 187
    .line 188
    invoke-static {p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    invoke-virtual {p0, v3}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->t(Z)V

    .line 193
    .line 194
    .line 195
    :try_start_0
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-virtual {p0, v1}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    const-string v1, "null cannot be cast to non-null type com.friday.paint.dialog.ObjectiveHomeworkSubmitDialog"

    .line 208
    .line 209
    invoke-static {p0, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    check-cast p0, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;

    .line 213
    .line 214
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->dismissAllowingStateLoss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 215
    .line 216
    .line 217
    :catch_0
    new-instance p0, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;

    .line 218
    .line 219
    invoke-direct {p0}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;-><init>()V

    .line 220
    .line 221
    .line 222
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    const-string v4, "getChildFragmentManager(...)"

    .line 227
    .line 228
    invoke-static {v1, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-virtual {p0, v1, v0}, Lcom/friday/common/base/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    invoke-static {p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getMBinding(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    iget-object p0, p0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->f:Landroid/widget/ImageView;

    .line 243
    .line 244
    invoke-virtual {p0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 245
    .line 246
    .line 247
    invoke-static {p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getMBinding(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    iget-object p0, p0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->p:Landroid/widget/ImageView;

    .line 252
    .line 253
    invoke-virtual {p0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 254
    .line 255
    .line 256
    goto :goto_5

    .line 257
    :cond_5
    invoke-static {p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getMBinding(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 258
    .line 259
    .line 260
    move-result-object p0

    .line 261
    iget-object p0, p0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->p:Landroid/widget/ImageView;

    .line 262
    .line 263
    invoke-virtual {p0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 264
    .line 265
    .line 266
    invoke-static {p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getMBinding(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    iget-object p0, p0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->p:Landroid/widget/ImageView;

    .line 271
    .line 272
    invoke-virtual {p0, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 273
    .line 274
    .line 275
    invoke-static {p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getMBinding(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    iget-object p0, p0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->f:Landroid/widget/ImageView;

    .line 280
    .line 281
    invoke-virtual {p0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 282
    .line 283
    .line 284
    :cond_6
    :goto_5
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 285
    .line 286
    .line 287
    move-result-object v6

    .line 288
    new-instance v9, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1$5$2;

    .line 289
    .line 290
    invoke-direct {v9, p2, p1, v5}, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1$5$2;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/friday/paint/view/six/NewStudentPaintFragment;Lvc/c;)V

    .line 291
    .line 292
    .line 293
    const/4 v10, 0x3

    .line 294
    const/4 v11, 0x0

    .line 295
    const/4 v7, 0x0

    .line 296
    const/4 v8, 0x0

    .line 297
    invoke-static/range {v6 .. v11}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 298
    .line 299
    .line 300
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 301
    .line 302
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->g:Lcom/friday/common/classtest/MqttResponse;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;-><init>(Lcom/friday/paint/view/six/NewStudentPaintFragment;Lcom/friday/common/classtest/MqttResponse;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    const-class v0, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;

    .line 2
    .line 3
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->e:I

    .line 8
    .line 9
    const-class v3, Lcom/friday/paint/dialog/ReceiveClassTestDialog;

    .line 10
    .line 11
    const/4 v4, 0x2

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x1

    .line 15
    if-eqz v2, :cond_2

    .line 16
    .line 17
    if-eq v2, v7, :cond_1

    .line 18
    .line 19
    if-ne v2, v4, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->d:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 24
    .line 25
    iget-object v1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 28
    .line 29
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto/16 :goto_6

    .line 33
    .line 34
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 37
    .line 38
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p1

    .line 42
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 50
    .line 51
    invoke-static {p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->h()Ljava/util/ArrayList;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iget-object v2, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->g:Lcom/friday/common/classtest/MqttResponse;

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    move v9, v6

    .line 66
    :cond_3
    if-ge v9, v8, :cond_4

    .line 67
    .line 68
    invoke-virtual {p1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v10

    .line 72
    add-int/lit8 v9, v9, 0x1

    .line 73
    .line 74
    move-object v11, v10

    .line 75
    check-cast v11, Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v2}, Lcom/friday/common/classtest/MqttResponse;->getGuid()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v12

    .line 81
    invoke-static {v12, v11}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v11

    .line 85
    if-eqz v11, :cond_3

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_4
    move-object v10, v5

    .line 89
    :goto_0
    if-eqz v10, :cond_5

    .line 90
    .line 91
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 92
    .line 93
    return-object p1

    .line 94
    :cond_5
    iput v7, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->e:I

    .line 95
    .line 96
    const-wide/16 v8, 0x1f4

    .line 97
    .line 98
    invoke-static {v8, v9, p0}, Lkotlinx/coroutines/DelayKt;->b(JLvc/c;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    if-ne p1, v1, :cond_6

    .line 103
    .line 104
    goto/16 :goto_5

    .line 105
    .line 106
    :cond_6
    :goto_1
    iget-object p1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 107
    .line 108
    invoke-static {p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    iget-object v2, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->g:Lcom/friday/common/classtest/MqttResponse;

    .line 113
    .line 114
    invoke-virtual {p1, v2}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->w(Lcom/friday/common/classtest/MqttResponse;)V

    .line 115
    .line 116
    .line 117
    invoke-static {}, Lcom/blankj/utilcode/util/CacheMemoryUtils;->getInstance()Lcom/blankj/utilcode/util/CacheMemoryUtils;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    const-string v2, "answer_cache"

    .line 122
    .line 123
    invoke-virtual {p1, v2}, Lcom/blankj/utilcode/util/CacheMemoryUtils;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    iget-object p1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->g:Lcom/friday/common/classtest/MqttResponse;

    .line 127
    .line 128
    invoke-virtual {p1}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-virtual {p1}, Lcom/friday/common/classtest/MqttResponse$Data;->getCanSubmit()Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-eqz p1, :cond_7

    .line 137
    .line 138
    iget-object p1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 139
    .line 140
    invoke-static {p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getViewModel2(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->B()Landroidx/lifecycle/MutableLiveData;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    check-cast p1, Ljava/lang/Integer;

    .line 153
    .line 154
    if-eqz p1, :cond_7

    .line 155
    .line 156
    iget-object v2, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 157
    .line 158
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    add-int/2addr p1, v7

    .line 163
    invoke-virtual {v2, p1, v7}, Lcom/friday/paint/view/six/NewPaintFragment;->addNote(IZ)V

    .line 164
    .line 165
    .line 166
    :cond_7
    iget-object p1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 167
    .line 168
    invoke-static {p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getViewModel2(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->B()Landroidx/lifecycle/MutableLiveData;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    check-cast p1, Ljava/lang/Integer;

    .line 181
    .line 182
    const/16 v2, 0x8

    .line 183
    .line 184
    if-eqz p1, :cond_b

    .line 185
    .line 186
    iget-object v8, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->g:Lcom/friday/common/classtest/MqttResponse;

    .line 187
    .line 188
    iget-object v9, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 189
    .line 190
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 191
    .line 192
    .line 193
    move-result p1

    .line 194
    invoke-virtual {v8}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    .line 195
    .line 196
    .line 197
    move-result-object v8

    .line 198
    invoke-virtual {v8}, Lcom/friday/common/classtest/MqttResponse$Data;->getQstType()I

    .line 199
    .line 200
    .line 201
    move-result v8

    .line 202
    if-nez v8, :cond_b

    .line 203
    .line 204
    invoke-virtual {v9}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 205
    .line 206
    .line 207
    move-result-object v8

    .line 208
    invoke-virtual {v8}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 209
    .line 210
    .line 211
    move-result-object v8

    .line 212
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 213
    .line 214
    .line 215
    move-result-object v8

    .line 216
    move v10, v6

    .line 217
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 218
    .line 219
    .line 220
    move-result v11

    .line 221
    if-eqz v11, :cond_9

    .line 222
    .line 223
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v11

    .line 227
    check-cast v11, Lcom/friday/paint/model/NoteListEntity;

    .line 228
    .line 229
    invoke-virtual {v11}, Lcom/friday/paint/model/NoteListEntity;->getInClass()Z

    .line 230
    .line 231
    .line 232
    move-result v11

    .line 233
    if-eqz v11, :cond_8

    .line 234
    .line 235
    goto :goto_3

    .line 236
    :cond_8
    add-int/lit8 v10, v10, 0x1

    .line 237
    .line 238
    goto :goto_2

    .line 239
    :cond_9
    const/4 v10, -0x1

    .line 240
    :goto_3
    if-ne p1, v10, :cond_a

    .line 241
    .line 242
    invoke-static {v9}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getMBinding(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    iget-object p1, p1, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->p:Landroid/widget/ImageView;

    .line 247
    .line 248
    invoke-virtual {p1, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 249
    .line 250
    .line 251
    goto :goto_4

    .line 252
    :cond_a
    invoke-static {v9}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getMBinding(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    iget-object p1, p1, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->p:Landroid/widget/ImageView;

    .line 257
    .line 258
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 259
    .line 260
    .line 261
    :cond_b
    :goto_4
    iget-object p1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 262
    .line 263
    iget-object v8, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->g:Lcom/friday/common/classtest/MqttResponse;

    .line 264
    .line 265
    invoke-virtual {v8}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    .line 266
    .line 267
    .line 268
    move-result-object v8

    .line 269
    invoke-virtual {v8}, Lcom/friday/common/classtest/MqttResponse$Data;->getQstType()I

    .line 270
    .line 271
    .line 272
    move-result v8

    .line 273
    invoke-static {p1, v8}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$setQstType$p(Lcom/friday/paint/view/six/NewStudentPaintFragment;I)V

    .line 274
    .line 275
    .line 276
    :try_start_0
    iget-object p1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 277
    .line 278
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v8

    .line 286
    invoke-virtual {p1, v8}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    const-string v8, "null cannot be cast to non-null type com.friday.paint.dialog.ReceiveClassTestDialog"

    .line 291
    .line 292
    invoke-static {p1, v8}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    check-cast p1, Lcom/friday/paint/dialog/ReceiveClassTestDialog;

    .line 296
    .line 297
    invoke-virtual {p1}, Landroidx/fragment/app/DialogFragment;->dismissAllowingStateLoss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 298
    .line 299
    .line 300
    :catch_0
    iget-object p1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->g:Lcom/friday/common/classtest/MqttResponse;

    .line 301
    .line 302
    invoke-virtual {p1}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    invoke-virtual {p1}, Lcom/friday/common/classtest/MqttResponse$Data;->getCanSubmit()Z

    .line 307
    .line 308
    .line 309
    move-result p1

    .line 310
    if-eqz p1, :cond_e

    .line 311
    .line 312
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 313
    .line 314
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 315
    .line 316
    .line 317
    iget-object p1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->g:Lcom/friday/common/classtest/MqttResponse;

    .line 318
    .line 319
    invoke-virtual {p1}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    invoke-virtual {p1}, Lcom/friday/common/classtest/MqttResponse$Data;->getImagePath()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    invoke-static {p1}, Lqd/c0;->h0(Ljava/lang/CharSequence;)Z

    .line 328
    .line 329
    .line 330
    move-result p1

    .line 331
    if-nez p1, :cond_d

    .line 332
    .line 333
    iget-object p1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->g:Lcom/friday/common/classtest/MqttResponse;

    .line 334
    .line 335
    invoke-virtual {p1}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    .line 336
    .line 337
    .line 338
    move-result-object p1

    .line 339
    invoke-virtual {p1}, Lcom/friday/common/classtest/MqttResponse$Data;->getCanSubmit()Z

    .line 340
    .line 341
    .line 342
    move-result p1

    .line 343
    if-eqz p1, :cond_d

    .line 344
    .line 345
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 346
    .line 347
    .line 348
    move-result-object p1

    .line 349
    new-instance v2, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1$4;

    .line 350
    .line 351
    iget-object v6, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->g:Lcom/friday/common/classtest/MqttResponse;

    .line 352
    .line 353
    invoke-direct {v2, v6, v5}, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1$4;-><init>(Lcom/friday/common/classtest/MqttResponse;Lvc/c;)V

    .line 354
    .line 355
    .line 356
    iput-object v0, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->c:Ljava/lang/Object;

    .line 357
    .line 358
    iput-object v0, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->d:Ljava/lang/Object;

    .line 359
    .line 360
    iput v4, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->e:I

    .line 361
    .line 362
    invoke-static {p1, v2, p0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object p1

    .line 366
    if-ne p1, v1, :cond_c

    .line 367
    .line 368
    :goto_5
    return-object v1

    .line 369
    :cond_c
    move-object v1, v0

    .line 370
    :goto_6
    iput-object p1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 371
    .line 372
    move-object v0, v1

    .line 373
    :cond_d
    new-instance p1, Lcom/friday/paint/dialog/ReceiveClassTestDialog;

    .line 374
    .line 375
    invoke-direct {p1}, Lcom/friday/paint/dialog/ReceiveClassTestDialog;-><init>()V

    .line 376
    .line 377
    .line 378
    iget-object v1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->g:Lcom/friday/common/classtest/MqttResponse;

    .line 379
    .line 380
    iget-object v2, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 381
    .line 382
    new-instance v4, Lcom/friday/paint/view/six/j;

    .line 383
    .line 384
    invoke-direct {v4, v1, v2, v0}, Lcom/friday/paint/view/six/j;-><init>(Lcom/friday/common/classtest/MqttResponse;Lcom/friday/paint/view/six/NewStudentPaintFragment;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {p1, v4}, Lcom/friday/paint/dialog/ReceiveClassTestDialog;->q(Lhd/a;)V

    .line 388
    .line 389
    .line 390
    iget-object v0, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 391
    .line 392
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v1

    .line 400
    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/DialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    goto/16 :goto_b

    .line 404
    .line 405
    :cond_e
    iget-object p1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->g:Lcom/friday/common/classtest/MqttResponse;

    .line 406
    .line 407
    invoke-virtual {p1}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    .line 408
    .line 409
    .line 410
    move-result-object p1

    .line 411
    invoke-virtual {p1}, Lcom/friday/common/classtest/MqttResponse$Data;->getQstType()I

    .line 412
    .line 413
    .line 414
    move-result p1

    .line 415
    if-eqz p1, :cond_14

    .line 416
    .line 417
    iget-object p1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->g:Lcom/friday/common/classtest/MqttResponse;

    .line 418
    .line 419
    invoke-virtual {p1}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    .line 420
    .line 421
    .line 422
    move-result-object p1

    .line 423
    invoke-virtual {p1}, Lcom/friday/common/classtest/MqttResponse$Data;->getQuestionInfo()Lcom/friday/common/classtest/MqttResponse$QuestionInfo;

    .line 424
    .line 425
    .line 426
    move-result-object p1

    .line 427
    if-eqz p1, :cond_f

    .line 428
    .line 429
    invoke-virtual {p1}, Lcom/friday/common/classtest/MqttResponse$QuestionInfo;->getQstCount()I

    .line 430
    .line 431
    .line 432
    move-result p1

    .line 433
    invoke-static {p1}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 434
    .line 435
    .line 436
    move-result-object p1

    .line 437
    goto :goto_7

    .line 438
    :cond_f
    move-object p1, v5

    .line 439
    :goto_7
    if-eqz p1, :cond_14

    .line 440
    .line 441
    iget-object p1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->g:Lcom/friday/common/classtest/MqttResponse;

    .line 442
    .line 443
    invoke-virtual {p1}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    .line 444
    .line 445
    .line 446
    move-result-object p1

    .line 447
    invoke-virtual {p1}, Lcom/friday/common/classtest/MqttResponse$Data;->getQuestionInfo()Lcom/friday/common/classtest/MqttResponse$QuestionInfo;

    .line 448
    .line 449
    .line 450
    move-result-object p1

    .line 451
    if-eqz p1, :cond_10

    .line 452
    .line 453
    invoke-virtual {p1}, Lcom/friday/common/classtest/MqttResponse$QuestionInfo;->getOptions()I

    .line 454
    .line 455
    .line 456
    move-result p1

    .line 457
    invoke-static {p1}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 458
    .line 459
    .line 460
    move-result-object p1

    .line 461
    goto :goto_8

    .line 462
    :cond_10
    move-object p1, v5

    .line 463
    :goto_8
    if-eqz p1, :cond_14

    .line 464
    .line 465
    iget-object p1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 466
    .line 467
    invoke-static {p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 468
    .line 469
    .line 470
    move-result-object p1

    .line 471
    iget-object v1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->g:Lcom/friday/common/classtest/MqttResponse;

    .line 472
    .line 473
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    .line 474
    .line 475
    .line 476
    move-result-object v1

    .line 477
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse$Data;->getQuestionInfo()Lcom/friday/common/classtest/MqttResponse$QuestionInfo;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    if-eqz v1, :cond_11

    .line 482
    .line 483
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse$QuestionInfo;->getOptions()I

    .line 484
    .line 485
    .line 486
    move-result v1

    .line 487
    invoke-static {v1}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 488
    .line 489
    .line 490
    move-result-object v1

    .line 491
    goto :goto_9

    .line 492
    :cond_11
    move-object v1, v5

    .line 493
    :goto_9
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 497
    .line 498
    .line 499
    move-result v1

    .line 500
    invoke-virtual {p1, v1}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->x(I)V

    .line 501
    .line 502
    .line 503
    iget-object p1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 504
    .line 505
    invoke-static {p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 506
    .line 507
    .line 508
    move-result-object p1

    .line 509
    iget-object v1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->g:Lcom/friday/common/classtest/MqttResponse;

    .line 510
    .line 511
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    .line 512
    .line 513
    .line 514
    move-result-object v1

    .line 515
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse$Data;->getQuestionInfo()Lcom/friday/common/classtest/MqttResponse$QuestionInfo;

    .line 516
    .line 517
    .line 518
    move-result-object v1

    .line 519
    if-eqz v1, :cond_12

    .line 520
    .line 521
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse$QuestionInfo;->getQstCount()I

    .line 522
    .line 523
    .line 524
    move-result v1

    .line 525
    invoke-static {v1}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 526
    .line 527
    .line 528
    move-result-object v5

    .line 529
    :cond_12
    invoke-static {v5}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 530
    .line 531
    .line 532
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 533
    .line 534
    .line 535
    move-result v1

    .line 536
    invoke-virtual {p1, v1}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->y(I)V

    .line 537
    .line 538
    .line 539
    iget-object p1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 540
    .line 541
    invoke-static {p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 542
    .line 543
    .line 544
    move-result-object p1

    .line 545
    iget-object v1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->g:Lcom/friday/common/classtest/MqttResponse;

    .line 546
    .line 547
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    .line 548
    .line 549
    .line 550
    move-result-object v1

    .line 551
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse$Data;->getQstType()I

    .line 552
    .line 553
    .line 554
    move-result v1

    .line 555
    if-ne v1, v7, :cond_13

    .line 556
    .line 557
    move v1, v7

    .line 558
    goto :goto_a

    .line 559
    :cond_13
    move v1, v6

    .line 560
    :goto_a
    invoke-virtual {p1, v1}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->z(Z)V

    .line 561
    .line 562
    .line 563
    iget-object p1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 564
    .line 565
    invoke-static {p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 566
    .line 567
    .line 568
    move-result-object p1

    .line 569
    invoke-virtual {p1, v6}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->v(Z)V

    .line 570
    .line 571
    .line 572
    iget-object p1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 573
    .line 574
    invoke-static {p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 575
    .line 576
    .line 577
    move-result-object p1

    .line 578
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->j()Landroidx/lifecycle/MutableLiveData;

    .line 579
    .line 580
    .line 581
    move-result-object p1

    .line 582
    iget-object v1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->g:Lcom/friday/common/classtest/MqttResponse;

    .line 583
    .line 584
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    .line 585
    .line 586
    .line 587
    move-result-object v1

    .line 588
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse$Data;->getCanSubmit()Z

    .line 589
    .line 590
    .line 591
    move-result v1

    .line 592
    xor-int/2addr v1, v7

    .line 593
    invoke-static {v1}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 594
    .line 595
    .line 596
    move-result-object v1

    .line 597
    invoke-virtual {p1, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 598
    .line 599
    .line 600
    iget-object p1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 601
    .line 602
    invoke-static {p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 603
    .line 604
    .line 605
    move-result-object p1

    .line 606
    invoke-virtual {p1, v7}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->u(Z)V

    .line 607
    .line 608
    .line 609
    iget-object p1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 610
    .line 611
    invoke-static {p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 612
    .line 613
    .line 614
    move-result-object p1

    .line 615
    invoke-virtual {p1, v6}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->t(Z)V

    .line 616
    .line 617
    .line 618
    :try_start_1
    iget-object p1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 619
    .line 620
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 621
    .line 622
    .line 623
    move-result-object p1

    .line 624
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v1

    .line 628
    invoke-virtual {p1, v1}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 629
    .line 630
    .line 631
    move-result-object p1

    .line 632
    const-string v1, "null cannot be cast to non-null type com.friday.paint.dialog.ObjectiveHomeworkSubmitDialog"

    .line 633
    .line 634
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 635
    .line 636
    .line 637
    check-cast p1, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;

    .line 638
    .line 639
    invoke-virtual {p1}, Landroidx/fragment/app/DialogFragment;->dismissAllowingStateLoss()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 640
    .line 641
    .line 642
    :catch_1
    new-instance p1, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;

    .line 643
    .line 644
    invoke-direct {p1}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;-><init>()V

    .line 645
    .line 646
    .line 647
    iget-object v1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 648
    .line 649
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 650
    .line 651
    .line 652
    move-result-object v1

    .line 653
    const-string v3, "getChildFragmentManager(...)"

    .line 654
    .line 655
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 659
    .line 660
    .line 661
    move-result-object v0

    .line 662
    invoke-virtual {p1, v1, v0}, Lcom/friday/common/base/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 663
    .line 664
    .line 665
    iget-object p1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 666
    .line 667
    invoke-static {p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getMBinding(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 668
    .line 669
    .line 670
    move-result-object p1

    .line 671
    iget-object p1, p1, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->f:Landroid/widget/ImageView;

    .line 672
    .line 673
    invoke-virtual {p1, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 674
    .line 675
    .line 676
    iget-object p1, p0, Lcom/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 677
    .line 678
    invoke-static {p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->access$getMBinding(Lcom/friday/paint/view/six/NewStudentPaintFragment;)Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 679
    .line 680
    .line 681
    move-result-object p1

    .line 682
    iget-object p1, p1, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->p:Landroid/widget/ImageView;

    .line 683
    .line 684
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 685
    .line 686
    .line 687
    :cond_14
    :goto_b
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 688
    .line 689
    return-object p1
.end method
