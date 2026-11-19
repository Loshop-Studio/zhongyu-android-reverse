.class final Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/view/StudentPaintFragment;->handleHomework(Lcom/friday/common/classtest/MqttResponse;)V
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
    c = "com.friday.paint.view.StudentPaintFragment$handleHomework$1"
    f = "StudentPaintFragment.kt"
    l = {
        0x13b,
        0x144
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:I

.field public final synthetic f:Lcom/friday/paint/view/StudentPaintFragment;

.field public final synthetic g:Lcom/friday/common/classtest/MqttResponse;


# direct methods
.method public constructor <init>(Lcom/friday/paint/view/StudentPaintFragment;Lcom/friday/common/classtest/MqttResponse;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/StudentPaintFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->g:Lcom/friday/common/classtest/MqttResponse;

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

.method public static synthetic g(Lcom/friday/common/classtest/MqttResponse;Lcom/friday/paint/view/StudentPaintFragment;Lkotlin/jvm/internal/Ref$ObjectRef;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->m(Lcom/friday/common/classtest/MqttResponse;Lcom/friday/paint/view/StudentPaintFragment;Lkotlin/jvm/internal/Ref$ObjectRef;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Lcom/friday/common/classtest/MqttResponse;Lcom/friday/paint/view/StudentPaintFragment;Lkotlin/jvm/internal/Ref$ObjectRef;)Lqc/q;
    .locals 7

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
    if-eqz v1, :cond_5

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse$Data;->getQuestionInfo()Lcom/friday/common/classtest/MqttResponse$QuestionInfo;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const/4 v5, 0x0

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
    invoke-static {p1}, Lcom/friday/paint/view/StudentPaintFragment;->t1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

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
    invoke-static {p1}, Lcom/friday/paint/view/StudentPaintFragment;->t1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

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
    move-result v5

    .line 114
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    :cond_3
    invoke-static {v5}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    invoke-virtual {v1, v5}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->y(I)V

    .line 126
    .line 127
    .line 128
    invoke-static {p1}, Lcom/friday/paint/view/StudentPaintFragment;->t1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-virtual {p0}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    invoke-virtual {v5}, Lcom/friday/common/classtest/MqttResponse$Data;->getQstType()I

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    if-ne v5, v4, :cond_4

    .line 141
    .line 142
    move v5, v4

    .line 143
    goto :goto_3

    .line 144
    :cond_4
    move v5, v3

    .line 145
    :goto_3
    invoke-virtual {v1, v5}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->z(Z)V

    .line 146
    .line 147
    .line 148
    invoke-static {p1}, Lcom/friday/paint/view/StudentPaintFragment;->t1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v1, v3}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->v(Z)V

    .line 153
    .line 154
    .line 155
    invoke-static {p1}, Lcom/friday/paint/view/StudentPaintFragment;->t1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-virtual {v1}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->j()Landroidx/lifecycle/MutableLiveData;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-virtual {p0}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    invoke-virtual {p0}, Lcom/friday/common/classtest/MqttResponse$Data;->getCanSubmit()Z

    .line 168
    .line 169
    .line 170
    move-result p0

    .line 171
    xor-int/2addr p0, v4

    .line 172
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    invoke-virtual {v1, p0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    invoke-static {p1}, Lcom/friday/paint/view/StudentPaintFragment;->t1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    invoke-virtual {p0, v4}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->u(Z)V

    .line 184
    .line 185
    .line 186
    invoke-static {p1}, Lcom/friday/paint/view/StudentPaintFragment;->t1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    invoke-virtual {p0, v3}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->t(Z)V

    .line 191
    .line 192
    .line 193
    :try_start_0
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    invoke-virtual {p0, v1}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    const-string v1, "null cannot be cast to non-null type com.friday.paint.dialog.ObjectiveHomeworkSubmitDialog"

    .line 206
    .line 207
    invoke-static {p0, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    check-cast p0, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;

    .line 211
    .line 212
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->dismissAllowingStateLoss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 213
    .line 214
    .line 215
    :catch_0
    new-instance p0, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;

    .line 216
    .line 217
    invoke-direct {p0}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;-><init>()V

    .line 218
    .line 219
    .line 220
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    const-string v4, "getChildFragmentManager(...)"

    .line 225
    .line 226
    invoke-static {v1, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-virtual {p0, v1, v0}, Lcom/friday/common/base/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    invoke-static {p1}, Lcom/friday/paint/view/StudentPaintFragment;->r1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    iget-object p0, p0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->f:Landroid/widget/ImageView;

    .line 241
    .line 242
    invoke-virtual {p0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 243
    .line 244
    .line 245
    invoke-static {p1}, Lcom/friday/paint/view/StudentPaintFragment;->r1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 246
    .line 247
    .line 248
    move-result-object p0

    .line 249
    iget-object p0, p0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->w:Landroid/widget/ImageView;

    .line 250
    .line 251
    invoke-virtual {p0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 252
    .line 253
    .line 254
    goto :goto_4

    .line 255
    :cond_5
    invoke-static {p1}, Lcom/friday/paint/view/StudentPaintFragment;->r1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    iget-object p0, p0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->w:Landroid/widget/ImageView;

    .line 260
    .line 261
    invoke-virtual {p0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 262
    .line 263
    .line 264
    invoke-static {p1}, Lcom/friday/paint/view/StudentPaintFragment;->r1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 265
    .line 266
    .line 267
    move-result-object p0

    .line 268
    iget-object p0, p0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->w:Landroid/widget/ImageView;

    .line 269
    .line 270
    invoke-virtual {p0, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 271
    .line 272
    .line 273
    invoke-static {p1}, Lcom/friday/paint/view/StudentPaintFragment;->r1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    iget-object p0, p0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->f:Landroid/widget/ImageView;

    .line 278
    .line 279
    invoke-virtual {p0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 280
    .line 281
    .line 282
    :cond_6
    :goto_4
    iget-object p0, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast p0, Landroid/graphics/Bitmap;

    .line 285
    .line 286
    if-eqz p0, :cond_7

    .line 287
    .line 288
    const-string p1, "addBitmap"

    .line 289
    .line 290
    invoke-static {p1}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    const-wide/16 v0, 0xc8

    .line 295
    .line 296
    invoke-interface {p1, p0, v0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->postDelay(Ljava/lang/Object;J)V

    .line 297
    .line 298
    .line 299
    :cond_7
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 300
    .line 301
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/StudentPaintFragment;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->g:Lcom/friday/common/classtest/MqttResponse;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;-><init>(Lcom/friday/paint/view/StudentPaintFragment;Lcom/friday/common/classtest/MqttResponse;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    const-class v0, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;

    .line 2
    .line 3
    const-class v1, Lcom/friday/paint/dialog/ReceiveClassTestDialog;

    .line 4
    .line 5
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget v3, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->e:I

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
    if-eqz v3, :cond_2

    .line 16
    .line 17
    if-eq v3, v7, :cond_1

    .line 18
    .line 19
    if-ne v3, v4, :cond_0

    .line 20
    .line 21
    iget-object v2, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->d:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 24
    .line 25
    iget-object v3, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 28
    .line 29
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto/16 :goto_3

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
    iget-object p1, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/StudentPaintFragment;

    .line 50
    .line 51
    invoke-static {p1}, Lcom/friday/paint/view/StudentPaintFragment;->t1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

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
    iget-object v3, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->g:Lcom/friday/common/classtest/MqttResponse;

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
    invoke-virtual {v3}, Lcom/friday/common/classtest/MqttResponse;->getGuid()Ljava/lang/String;

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
    iput v7, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->e:I

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
    if-ne p1, v2, :cond_6

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_6
    :goto_1
    iget-object p1, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/StudentPaintFragment;

    .line 106
    .line 107
    invoke-static {p1}, Lcom/friday/paint/view/StudentPaintFragment;->t1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    iget-object v3, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->g:Lcom/friday/common/classtest/MqttResponse;

    .line 112
    .line 113
    invoke-virtual {p1, v3}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->w(Lcom/friday/common/classtest/MqttResponse;)V

    .line 114
    .line 115
    .line 116
    invoke-static {}, Lcom/blankj/utilcode/util/CacheMemoryUtils;->getInstance()Lcom/blankj/utilcode/util/CacheMemoryUtils;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    const-string v3, "answer_cache"

    .line 121
    .line 122
    invoke-virtual {p1, v3}, Lcom/blankj/utilcode/util/CacheMemoryUtils;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    new-instance p1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 126
    .line 127
    invoke-direct {p1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 128
    .line 129
    .line 130
    iget-object v3, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->g:Lcom/friday/common/classtest/MqttResponse;

    .line 131
    .line 132
    invoke-virtual {v3}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    invoke-virtual {v3}, Lcom/friday/common/classtest/MqttResponse$Data;->getCanSubmit()Z

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    if-eqz v3, :cond_9

    .line 141
    .line 142
    iget-object v3, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/StudentPaintFragment;

    .line 143
    .line 144
    invoke-static {v3}, Lcom/friday/paint/view/StudentPaintFragment;->u1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    invoke-virtual {v3}, Lcom/friday/paint/viewmodel/NoteViewModel;->x()Landroidx/lifecycle/MutableLiveData;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    invoke-virtual {v3}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    check-cast v3, Ljava/lang/Integer;

    .line 157
    .line 158
    if-eqz v3, :cond_7

    .line 159
    .line 160
    iget-object v8, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/StudentPaintFragment;

    .line 161
    .line 162
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    add-int/2addr v3, v7

    .line 167
    invoke-virtual {v8, v3, v5, v7}, Lcom/friday/paint/view/ThePaintFragment;->i0(ILandroid/graphics/Bitmap;Z)V

    .line 168
    .line 169
    .line 170
    :cond_7
    iget-object v3, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->g:Lcom/friday/common/classtest/MqttResponse;

    .line 171
    .line 172
    invoke-virtual {v3}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    invoke-virtual {v3}, Lcom/friday/common/classtest/MqttResponse$Data;->getImagePath()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    invoke-static {v3}, Lqd/c0;->h0(Ljava/lang/CharSequence;)Z

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    if-nez v3, :cond_9

    .line 185
    .line 186
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    new-instance v8, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1$3;

    .line 191
    .line 192
    iget-object v9, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->g:Lcom/friday/common/classtest/MqttResponse;

    .line 193
    .line 194
    invoke-direct {v8, v9, v5}, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1$3;-><init>(Lcom/friday/common/classtest/MqttResponse;Lvc/c;)V

    .line 195
    .line 196
    .line 197
    iput-object p1, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->c:Ljava/lang/Object;

    .line 198
    .line 199
    iput-object p1, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->d:Ljava/lang/Object;

    .line 200
    .line 201
    iput v4, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->e:I

    .line 202
    .line 203
    invoke-static {v3, v8, p0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    if-ne v3, v2, :cond_8

    .line 208
    .line 209
    :goto_2
    return-object v2

    .line 210
    :cond_8
    move-object v2, p1

    .line 211
    move-object p1, v3

    .line 212
    move-object v3, v2

    .line 213
    :goto_3
    iput-object p1, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 214
    .line 215
    move-object p1, v3

    .line 216
    :cond_9
    iget-object v2, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/StudentPaintFragment;

    .line 217
    .line 218
    invoke-static {v2}, Lcom/friday/paint/view/StudentPaintFragment;->u1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    invoke-virtual {v2}, Lcom/friday/paint/viewmodel/NoteViewModel;->x()Landroidx/lifecycle/MutableLiveData;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    invoke-virtual {v2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    check-cast v2, Ljava/lang/Integer;

    .line 231
    .line 232
    const/16 v3, 0x8

    .line 233
    .line 234
    if-eqz v2, :cond_e

    .line 235
    .line 236
    iget-object v4, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->g:Lcom/friday/common/classtest/MqttResponse;

    .line 237
    .line 238
    iget-object v8, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/StudentPaintFragment;

    .line 239
    .line 240
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    invoke-virtual {v4}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    .line 245
    .line 246
    .line 247
    move-result-object v4

    .line 248
    invoke-virtual {v4}, Lcom/friday/common/classtest/MqttResponse$Data;->getQstType()I

    .line 249
    .line 250
    .line 251
    move-result v4

    .line 252
    if-nez v4, :cond_d

    .line 253
    .line 254
    invoke-virtual {v8}, Lcom/friday/paint/view/ThePaintFragment;->u0()Lcom/friday/paint/adapter/ThumbnailListAdapter;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    invoke-virtual {v4}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    move v9, v6

    .line 267
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 268
    .line 269
    .line 270
    move-result v10

    .line 271
    if-eqz v10, :cond_b

    .line 272
    .line 273
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v10

    .line 277
    check-cast v10, Lcom/friday/paint/model/NoteListEntity;

    .line 278
    .line 279
    invoke-virtual {v10}, Lcom/friday/paint/model/NoteListEntity;->getInClass()Z

    .line 280
    .line 281
    .line 282
    move-result v10

    .line 283
    if-eqz v10, :cond_a

    .line 284
    .line 285
    goto :goto_5

    .line 286
    :cond_a
    add-int/lit8 v9, v9, 0x1

    .line 287
    .line 288
    goto :goto_4

    .line 289
    :cond_b
    const/4 v9, -0x1

    .line 290
    :goto_5
    if-ne v2, v9, :cond_c

    .line 291
    .line 292
    invoke-static {v8}, Lcom/friday/paint/view/StudentPaintFragment;->r1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    iget-object v2, v2, Lcom/friday/paint/databinding/FragmentThePaintBinding;->w:Landroid/widget/ImageView;

    .line 297
    .line 298
    invoke-virtual {v2, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 299
    .line 300
    .line 301
    goto :goto_6

    .line 302
    :cond_c
    invoke-static {v8}, Lcom/friday/paint/view/StudentPaintFragment;->r1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    iget-object v2, v2, Lcom/friday/paint/databinding/FragmentThePaintBinding;->w:Landroid/widget/ImageView;

    .line 307
    .line 308
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 309
    .line 310
    .line 311
    goto :goto_6

    .line 312
    :cond_d
    invoke-static {v8}, Lcom/friday/paint/view/StudentPaintFragment;->r1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    iget-object v2, v2, Lcom/friday/paint/databinding/FragmentThePaintBinding;->w:Landroid/widget/ImageView;

    .line 317
    .line 318
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 319
    .line 320
    .line 321
    :cond_e
    :goto_6
    iget-object v2, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/StudentPaintFragment;

    .line 322
    .line 323
    iget-object v4, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->g:Lcom/friday/common/classtest/MqttResponse;

    .line 324
    .line 325
    invoke-virtual {v4}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    .line 326
    .line 327
    .line 328
    move-result-object v4

    .line 329
    invoke-virtual {v4}, Lcom/friday/common/classtest/MqttResponse$Data;->getQstType()I

    .line 330
    .line 331
    .line 332
    move-result v4

    .line 333
    invoke-static {v2, v4}, Lcom/friday/paint/view/StudentPaintFragment;->w1(Lcom/friday/paint/view/StudentPaintFragment;I)V

    .line 334
    .line 335
    .line 336
    :try_start_0
    iget-object v2, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/StudentPaintFragment;

    .line 337
    .line 338
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v4

    .line 346
    invoke-virtual {v2, v4}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    const-string v4, "null cannot be cast to non-null type com.friday.paint.dialog.ReceiveClassTestDialog"

    .line 351
    .line 352
    invoke-static {v2, v4}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    check-cast v2, Lcom/friday/paint/dialog/ReceiveClassTestDialog;

    .line 356
    .line 357
    invoke-virtual {v2}, Landroidx/fragment/app/DialogFragment;->dismissAllowingStateLoss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 358
    .line 359
    .line 360
    :catch_0
    iget-object v2, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->g:Lcom/friday/common/classtest/MqttResponse;

    .line 361
    .line 362
    invoke-virtual {v2}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    invoke-virtual {v2}, Lcom/friday/common/classtest/MqttResponse$Data;->getCanSubmit()Z

    .line 367
    .line 368
    .line 369
    move-result v2

    .line 370
    if-eqz v2, :cond_f

    .line 371
    .line 372
    new-instance v0, Lcom/friday/paint/dialog/ReceiveClassTestDialog;

    .line 373
    .line 374
    invoke-direct {v0}, Lcom/friday/paint/dialog/ReceiveClassTestDialog;-><init>()V

    .line 375
    .line 376
    .line 377
    iget-object v2, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->g:Lcom/friday/common/classtest/MqttResponse;

    .line 378
    .line 379
    iget-object v3, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/StudentPaintFragment;

    .line 380
    .line 381
    new-instance v4, Lcom/friday/paint/view/a;

    .line 382
    .line 383
    invoke-direct {v4, v2, v3, p1}, Lcom/friday/paint/view/a;-><init>(Lcom/friday/common/classtest/MqttResponse;Lcom/friday/paint/view/StudentPaintFragment;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v0, v4}, Lcom/friday/paint/dialog/ReceiveClassTestDialog;->q(Lhd/a;)V

    .line 387
    .line 388
    .line 389
    iget-object p1, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/StudentPaintFragment;

    .line 390
    .line 391
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 392
    .line 393
    .line 394
    move-result-object p1

    .line 395
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    invoke-virtual {v0, p1, v1}, Landroidx/fragment/app/DialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    goto/16 :goto_b

    .line 403
    .line 404
    :cond_f
    iget-object p1, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->g:Lcom/friday/common/classtest/MqttResponse;

    .line 405
    .line 406
    invoke-virtual {p1}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    .line 407
    .line 408
    .line 409
    move-result-object p1

    .line 410
    invoke-virtual {p1}, Lcom/friday/common/classtest/MqttResponse$Data;->getQstType()I

    .line 411
    .line 412
    .line 413
    move-result p1

    .line 414
    if-eqz p1, :cond_15

    .line 415
    .line 416
    iget-object p1, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->g:Lcom/friday/common/classtest/MqttResponse;

    .line 417
    .line 418
    invoke-virtual {p1}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    .line 419
    .line 420
    .line 421
    move-result-object p1

    .line 422
    invoke-virtual {p1}, Lcom/friday/common/classtest/MqttResponse$Data;->getQuestionInfo()Lcom/friday/common/classtest/MqttResponse$QuestionInfo;

    .line 423
    .line 424
    .line 425
    move-result-object p1

    .line 426
    if-eqz p1, :cond_10

    .line 427
    .line 428
    invoke-virtual {p1}, Lcom/friday/common/classtest/MqttResponse$QuestionInfo;->getQstCount()I

    .line 429
    .line 430
    .line 431
    move-result p1

    .line 432
    invoke-static {p1}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 433
    .line 434
    .line 435
    move-result-object p1

    .line 436
    goto :goto_7

    .line 437
    :cond_10
    move-object p1, v5

    .line 438
    :goto_7
    if-eqz p1, :cond_15

    .line 439
    .line 440
    iget-object p1, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->g:Lcom/friday/common/classtest/MqttResponse;

    .line 441
    .line 442
    invoke-virtual {p1}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    .line 443
    .line 444
    .line 445
    move-result-object p1

    .line 446
    invoke-virtual {p1}, Lcom/friday/common/classtest/MqttResponse$Data;->getQuestionInfo()Lcom/friday/common/classtest/MqttResponse$QuestionInfo;

    .line 447
    .line 448
    .line 449
    move-result-object p1

    .line 450
    if-eqz p1, :cond_11

    .line 451
    .line 452
    invoke-virtual {p1}, Lcom/friday/common/classtest/MqttResponse$QuestionInfo;->getOptions()I

    .line 453
    .line 454
    .line 455
    move-result p1

    .line 456
    invoke-static {p1}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 457
    .line 458
    .line 459
    move-result-object p1

    .line 460
    goto :goto_8

    .line 461
    :cond_11
    move-object p1, v5

    .line 462
    :goto_8
    if-eqz p1, :cond_15

    .line 463
    .line 464
    iget-object p1, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/StudentPaintFragment;

    .line 465
    .line 466
    invoke-static {p1}, Lcom/friday/paint/view/StudentPaintFragment;->t1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 467
    .line 468
    .line 469
    move-result-object p1

    .line 470
    iget-object v1, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->g:Lcom/friday/common/classtest/MqttResponse;

    .line 471
    .line 472
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    .line 473
    .line 474
    .line 475
    move-result-object v1

    .line 476
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse$Data;->getQuestionInfo()Lcom/friday/common/classtest/MqttResponse$QuestionInfo;

    .line 477
    .line 478
    .line 479
    move-result-object v1

    .line 480
    if-eqz v1, :cond_12

    .line 481
    .line 482
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse$QuestionInfo;->getOptions()I

    .line 483
    .line 484
    .line 485
    move-result v1

    .line 486
    invoke-static {v1}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 487
    .line 488
    .line 489
    move-result-object v1

    .line 490
    goto :goto_9

    .line 491
    :cond_12
    move-object v1, v5

    .line 492
    :goto_9
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 493
    .line 494
    .line 495
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 496
    .line 497
    .line 498
    move-result v1

    .line 499
    invoke-virtual {p1, v1}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->x(I)V

    .line 500
    .line 501
    .line 502
    iget-object p1, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/StudentPaintFragment;

    .line 503
    .line 504
    invoke-static {p1}, Lcom/friday/paint/view/StudentPaintFragment;->t1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 505
    .line 506
    .line 507
    move-result-object p1

    .line 508
    iget-object v1, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->g:Lcom/friday/common/classtest/MqttResponse;

    .line 509
    .line 510
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    .line 511
    .line 512
    .line 513
    move-result-object v1

    .line 514
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse$Data;->getQuestionInfo()Lcom/friday/common/classtest/MqttResponse$QuestionInfo;

    .line 515
    .line 516
    .line 517
    move-result-object v1

    .line 518
    if-eqz v1, :cond_13

    .line 519
    .line 520
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse$QuestionInfo;->getQstCount()I

    .line 521
    .line 522
    .line 523
    move-result v1

    .line 524
    invoke-static {v1}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 525
    .line 526
    .line 527
    move-result-object v5

    .line 528
    :cond_13
    invoke-static {v5}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 529
    .line 530
    .line 531
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 532
    .line 533
    .line 534
    move-result v1

    .line 535
    invoke-virtual {p1, v1}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->y(I)V

    .line 536
    .line 537
    .line 538
    iget-object p1, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/StudentPaintFragment;

    .line 539
    .line 540
    invoke-static {p1}, Lcom/friday/paint/view/StudentPaintFragment;->t1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 541
    .line 542
    .line 543
    move-result-object p1

    .line 544
    iget-object v1, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->g:Lcom/friday/common/classtest/MqttResponse;

    .line 545
    .line 546
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    .line 547
    .line 548
    .line 549
    move-result-object v1

    .line 550
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse$Data;->getQstType()I

    .line 551
    .line 552
    .line 553
    move-result v1

    .line 554
    if-ne v1, v7, :cond_14

    .line 555
    .line 556
    move v1, v7

    .line 557
    goto :goto_a

    .line 558
    :cond_14
    move v1, v6

    .line 559
    :goto_a
    invoke-virtual {p1, v1}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->z(Z)V

    .line 560
    .line 561
    .line 562
    iget-object p1, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/StudentPaintFragment;

    .line 563
    .line 564
    invoke-static {p1}, Lcom/friday/paint/view/StudentPaintFragment;->t1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 565
    .line 566
    .line 567
    move-result-object p1

    .line 568
    invoke-virtual {p1, v6}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->v(Z)V

    .line 569
    .line 570
    .line 571
    iget-object p1, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/StudentPaintFragment;

    .line 572
    .line 573
    invoke-static {p1}, Lcom/friday/paint/view/StudentPaintFragment;->t1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 574
    .line 575
    .line 576
    move-result-object p1

    .line 577
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->j()Landroidx/lifecycle/MutableLiveData;

    .line 578
    .line 579
    .line 580
    move-result-object p1

    .line 581
    iget-object v1, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->g:Lcom/friday/common/classtest/MqttResponse;

    .line 582
    .line 583
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse;->getData()Lcom/friday/common/classtest/MqttResponse$Data;

    .line 584
    .line 585
    .line 586
    move-result-object v1

    .line 587
    invoke-virtual {v1}, Lcom/friday/common/classtest/MqttResponse$Data;->getCanSubmit()Z

    .line 588
    .line 589
    .line 590
    move-result v1

    .line 591
    xor-int/2addr v1, v7

    .line 592
    invoke-static {v1}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 593
    .line 594
    .line 595
    move-result-object v1

    .line 596
    invoke-virtual {p1, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 597
    .line 598
    .line 599
    iget-object p1, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/StudentPaintFragment;

    .line 600
    .line 601
    invoke-static {p1}, Lcom/friday/paint/view/StudentPaintFragment;->t1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 602
    .line 603
    .line 604
    move-result-object p1

    .line 605
    invoke-virtual {p1, v7}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->u(Z)V

    .line 606
    .line 607
    .line 608
    iget-object p1, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/StudentPaintFragment;

    .line 609
    .line 610
    invoke-static {p1}, Lcom/friday/paint/view/StudentPaintFragment;->t1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 611
    .line 612
    .line 613
    move-result-object p1

    .line 614
    invoke-virtual {p1, v6}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->t(Z)V

    .line 615
    .line 616
    .line 617
    :try_start_1
    iget-object p1, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/StudentPaintFragment;

    .line 618
    .line 619
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 620
    .line 621
    .line 622
    move-result-object p1

    .line 623
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object v1

    .line 627
    invoke-virtual {p1, v1}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 628
    .line 629
    .line 630
    move-result-object p1

    .line 631
    const-string v1, "null cannot be cast to non-null type com.friday.paint.dialog.ObjectiveHomeworkSubmitDialog"

    .line 632
    .line 633
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 634
    .line 635
    .line 636
    check-cast p1, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;

    .line 637
    .line 638
    invoke-virtual {p1}, Landroidx/fragment/app/DialogFragment;->dismissAllowingStateLoss()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 639
    .line 640
    .line 641
    :catch_1
    new-instance p1, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;

    .line 642
    .line 643
    invoke-direct {p1}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;-><init>()V

    .line 644
    .line 645
    .line 646
    iget-object v1, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/StudentPaintFragment;

    .line 647
    .line 648
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 649
    .line 650
    .line 651
    move-result-object v1

    .line 652
    const-string v2, "getChildFragmentManager(...)"

    .line 653
    .line 654
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 655
    .line 656
    .line 657
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    invoke-virtual {p1, v1, v0}, Lcom/friday/common/base/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 662
    .line 663
    .line 664
    iget-object p1, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/StudentPaintFragment;

    .line 665
    .line 666
    invoke-static {p1}, Lcom/friday/paint/view/StudentPaintFragment;->r1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 667
    .line 668
    .line 669
    move-result-object p1

    .line 670
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->f:Landroid/widget/ImageView;

    .line 671
    .line 672
    invoke-virtual {p1, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 673
    .line 674
    .line 675
    iget-object p1, p0, Lcom/friday/paint/view/StudentPaintFragment$handleHomework$1;->f:Lcom/friday/paint/view/StudentPaintFragment;

    .line 676
    .line 677
    invoke-static {p1}, Lcom/friday/paint/view/StudentPaintFragment;->r1(Lcom/friday/paint/view/StudentPaintFragment;)Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 678
    .line 679
    .line 680
    move-result-object p1

    .line 681
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->w:Landroid/widget/ImageView;

    .line 682
    .line 683
    invoke-virtual {p1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 684
    .line 685
    .line 686
    :cond_15
    :goto_b
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 687
    .line 688
    return-object p1
.end method
