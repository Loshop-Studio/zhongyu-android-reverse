.class public final Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter$ViewHolderViewer;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ViewHolderViewer"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter$ViewHolderViewer$a;
    }
.end annotation


# instance fields
.field public final a:Lcom/zykj/study/databinding/ViewMultipleChoiceViewerBinding;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/databinding/ViewMultipleChoiceViewerBinding;)V
    .locals 1

    .line 1
    const-string v0, "binding"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter$ViewHolderViewer;->a:Lcom/zykj/study/databinding/ViewMultipleChoiceViewerBinding;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Lcom/zykj/study/bean/SelectModel;Lcom/zykj/study/view/MultipleChoiceView$JudgingStatus;Ljava/util/List;Landroid/view/View$OnClickListener;)V
    .locals 3

    .line 1
    const-string v0, "answerList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "option"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "judgingStatus"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "rightList"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "createClickListener"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter$ViewHolderViewer;->a:Lcom/zykj/study/databinding/ViewMultipleChoiceViewerBinding;

    .line 27
    .line 28
    iget-object v1, v0, Lcom/zykj/study/databinding/ViewMultipleChoiceViewerBinding;->tvTitle:Landroid/widget/TextView;

    .line 29
    .line 30
    invoke-virtual {p2}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Ljava/lang/CharSequence;

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 37
    .line 38
    .line 39
    sget-object v1, Lcom/zykj/study/view/MultipleChoiceView$MultipleChoiceAdapter$ViewHolderViewer$a;->a:[I

    .line 40
    .line 41
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 42
    .line 43
    .line 44
    move-result p3

    .line 45
    aget p3, v1, p3

    .line 46
    .line 47
    packed-switch p3, :pswitch_data_0

    .line 48
    .line 49
    .line 50
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 51
    .line 52
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :pswitch_0
    invoke-virtual {p2}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p3

    .line 60
    invoke-interface {p1, p3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_1

    .line 65
    .line 66
    new-instance p1, Lcom/zykj/study/bean/exercise/ChoiceBean;

    .line 67
    .line 68
    invoke-virtual {p2}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    invoke-interface {p4, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    if-eqz p2, :cond_0

    .line 77
    .line 78
    sget-object p2, Lcom/zykj/study/bean/exercise/ChoiceStatus;->RIGHT:Lcom/zykj/study/bean/exercise/ChoiceStatus;

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    sget-object p2, Lcom/zykj/study/bean/exercise/ChoiceStatus;->ERROR:Lcom/zykj/study/bean/exercise/ChoiceStatus;

    .line 82
    .line 83
    :goto_0
    invoke-direct {p1, p2}, Lcom/zykj/study/bean/exercise/ChoiceBean;-><init>(Lcom/zykj/study/bean/exercise/ChoiceStatus;)V

    .line 84
    .line 85
    .line 86
    goto/16 :goto_4

    .line 87
    .line 88
    :cond_1
    new-instance p1, Lcom/zykj/study/bean/exercise/ChoiceBean;

    .line 89
    .line 90
    sget-object p2, Lcom/zykj/study/bean/exercise/ChoiceStatus;->NULL:Lcom/zykj/study/bean/exercise/ChoiceStatus;

    .line 91
    .line 92
    invoke-direct {p1, p2}, Lcom/zykj/study/bean/exercise/ChoiceBean;-><init>(Lcom/zykj/study/bean/exercise/ChoiceStatus;)V

    .line 93
    .line 94
    .line 95
    goto/16 :goto_4

    .line 96
    .line 97
    :pswitch_1
    invoke-static {p4, p1}, Li7/f0;->D0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object p3

    .line 101
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 102
    .line 103
    .line 104
    move-result p3

    .line 105
    if-eqz p3, :cond_3

    .line 106
    .line 107
    invoke-static {p1, p4}, Li7/f0;->D0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object p3

    .line 111
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result p3

    .line 115
    if-eqz p3, :cond_3

    .line 116
    .line 117
    new-instance p3, Lcom/zykj/study/bean/exercise/ChoiceBean;

    .line 118
    .line 119
    invoke-virtual {p2}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    if-eqz p1, :cond_2

    .line 128
    .line 129
    sget-object p1, Lcom/zykj/study/bean/exercise/ChoiceStatus;->RIGHT:Lcom/zykj/study/bean/exercise/ChoiceStatus;

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_2
    sget-object p1, Lcom/zykj/study/bean/exercise/ChoiceStatus;->CUSTOM:Lcom/zykj/study/bean/exercise/ChoiceStatus;

    .line 133
    .line 134
    :goto_1
    invoke-direct {p3, p1}, Lcom/zykj/study/bean/exercise/ChoiceBean;-><init>(Lcom/zykj/study/bean/exercise/ChoiceStatus;)V

    .line 135
    .line 136
    .line 137
    :goto_2
    move-object p1, p3

    .line 138
    goto/16 :goto_4

    .line 139
    .line 140
    :cond_3
    new-instance p3, Lcom/zykj/study/bean/exercise/ChoiceBean;

    .line 141
    .line 142
    invoke-virtual {p2}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    if-eqz p1, :cond_4

    .line 151
    .line 152
    sget-object p1, Lcom/zykj/study/bean/exercise/ChoiceStatus;->ERROR:Lcom/zykj/study/bean/exercise/ChoiceStatus;

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_4
    sget-object p1, Lcom/zykj/study/bean/exercise/ChoiceStatus;->CUSTOM:Lcom/zykj/study/bean/exercise/ChoiceStatus;

    .line 156
    .line 157
    :goto_3
    invoke-direct {p3, p1}, Lcom/zykj/study/bean/exercise/ChoiceBean;-><init>(Lcom/zykj/study/bean/exercise/ChoiceStatus;)V

    .line 158
    .line 159
    .line 160
    goto :goto_2

    .line 161
    :pswitch_2
    invoke-virtual {p2}, Lcom/zykj/study/bean/SelectModel;->getData()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-interface {p4, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    if-eqz p1, :cond_5

    .line 170
    .line 171
    new-instance p1, Lcom/zykj/study/bean/exercise/ChoiceBean;

    .line 172
    .line 173
    sget-object p2, Lcom/zykj/study/bean/exercise/ChoiceStatus;->RIGHT:Lcom/zykj/study/bean/exercise/ChoiceStatus;

    .line 174
    .line 175
    invoke-direct {p1, p2}, Lcom/zykj/study/bean/exercise/ChoiceBean;-><init>(Lcom/zykj/study/bean/exercise/ChoiceStatus;)V

    .line 176
    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_5
    new-instance p1, Lcom/zykj/study/bean/exercise/ChoiceBean;

    .line 180
    .line 181
    sget-object p2, Lcom/zykj/study/bean/exercise/ChoiceStatus;->ERROR:Lcom/zykj/study/bean/exercise/ChoiceStatus;

    .line 182
    .line 183
    invoke-direct {p1, p2}, Lcom/zykj/study/bean/exercise/ChoiceBean;-><init>(Lcom/zykj/study/bean/exercise/ChoiceStatus;)V

    .line 184
    .line 185
    .line 186
    goto :goto_4

    .line 187
    :pswitch_3
    invoke-virtual {p2}, Lcom/zykj/study/bean/SelectModel;->isSelectModel()Z

    .line 188
    .line 189
    .line 190
    move-result p1

    .line 191
    if-eqz p1, :cond_6

    .line 192
    .line 193
    new-instance p1, Lcom/zykj/study/bean/exercise/ChoiceBean;

    .line 194
    .line 195
    sget-object p2, Lcom/zykj/study/bean/exercise/ChoiceStatus;->RIGHT:Lcom/zykj/study/bean/exercise/ChoiceStatus;

    .line 196
    .line 197
    invoke-direct {p1, p2}, Lcom/zykj/study/bean/exercise/ChoiceBean;-><init>(Lcom/zykj/study/bean/exercise/ChoiceStatus;)V

    .line 198
    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_6
    new-instance p1, Lcom/zykj/study/bean/exercise/ChoiceBean;

    .line 202
    .line 203
    sget-object p2, Lcom/zykj/study/bean/exercise/ChoiceStatus;->CUSTOM:Lcom/zykj/study/bean/exercise/ChoiceStatus;

    .line 204
    .line 205
    invoke-direct {p1, p2}, Lcom/zykj/study/bean/exercise/ChoiceBean;-><init>(Lcom/zykj/study/bean/exercise/ChoiceStatus;)V

    .line 206
    .line 207
    .line 208
    goto :goto_4

    .line 209
    :pswitch_4
    invoke-virtual {p2}, Lcom/zykj/study/bean/SelectModel;->isSelectModel()Z

    .line 210
    .line 211
    .line 212
    move-result p1

    .line 213
    if-eqz p1, :cond_7

    .line 214
    .line 215
    new-instance p1, Lcom/zykj/study/bean/exercise/ChoiceBean;

    .line 216
    .line 217
    sget-object p2, Lcom/zykj/study/bean/exercise/ChoiceStatus;->ERROR:Lcom/zykj/study/bean/exercise/ChoiceStatus;

    .line 218
    .line 219
    invoke-direct {p1, p2}, Lcom/zykj/study/bean/exercise/ChoiceBean;-><init>(Lcom/zykj/study/bean/exercise/ChoiceStatus;)V

    .line 220
    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_7
    new-instance p1, Lcom/zykj/study/bean/exercise/ChoiceBean;

    .line 224
    .line 225
    sget-object p2, Lcom/zykj/study/bean/exercise/ChoiceStatus;->CUSTOM:Lcom/zykj/study/bean/exercise/ChoiceStatus;

    .line 226
    .line 227
    invoke-direct {p1, p2}, Lcom/zykj/study/bean/exercise/ChoiceBean;-><init>(Lcom/zykj/study/bean/exercise/ChoiceStatus;)V

    .line 228
    .line 229
    .line 230
    goto :goto_4

    .line 231
    :pswitch_5
    invoke-virtual {p2}, Lcom/zykj/study/bean/SelectModel;->isSelectModel()Z

    .line 232
    .line 233
    .line 234
    move-result p1

    .line 235
    if-eqz p1, :cond_8

    .line 236
    .line 237
    new-instance p1, Lcom/zykj/study/bean/exercise/ChoiceBean;

    .line 238
    .line 239
    sget-object p2, Lcom/zykj/study/bean/exercise/ChoiceStatus;->SELECTED:Lcom/zykj/study/bean/exercise/ChoiceStatus;

    .line 240
    .line 241
    invoke-direct {p1, p2}, Lcom/zykj/study/bean/exercise/ChoiceBean;-><init>(Lcom/zykj/study/bean/exercise/ChoiceStatus;)V

    .line 242
    .line 243
    .line 244
    goto :goto_4

    .line 245
    :cond_8
    new-instance p1, Lcom/zykj/study/bean/exercise/ChoiceBean;

    .line 246
    .line 247
    sget-object p2, Lcom/zykj/study/bean/exercise/ChoiceStatus;->CUSTOM:Lcom/zykj/study/bean/exercise/ChoiceStatus;

    .line 248
    .line 249
    invoke-direct {p1, p2}, Lcom/zykj/study/bean/exercise/ChoiceBean;-><init>(Lcom/zykj/study/bean/exercise/ChoiceStatus;)V

    .line 250
    .line 251
    .line 252
    :goto_4
    invoke-virtual {v0, p1}, Lcom/zykj/study/databinding/ViewMultipleChoiceViewerBinding;->setEntity(Lcom/zykj/study/bean/exercise/ChoiceBean;)V

    .line 253
    .line 254
    .line 255
    iget-object p1, v0, Lcom/zykj/study/databinding/ViewMultipleChoiceViewerBinding;->tvTitle:Landroid/widget/TextView;

    .line 256
    .line 257
    invoke-virtual {p1, p5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->executePendingBindings()V

    .line 261
    .line 262
    .line 263
    return-void

    .line 264
    nop

    .line 265
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
