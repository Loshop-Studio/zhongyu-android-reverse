.class public final Lcom/zykj/mistake/dialog/ConvertDialog;
.super Lcom/zykj/mistake/dialog/BaseDialogFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/mistake/dialog/BaseDialogFragment<",
        "Lcom/zykj/mistake/databinding/DialogConvertBinding;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/zykj/mistake/dialog/ConvertDialog;",
        "Lcom/zykj/mistake/dialog/BaseDialogFragment;",
        "Lcom/zykj/mistake/databinding/DialogConvertBinding;",
        "<init>",
        "()V",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nConvertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConvertDialog.kt\ncom/zykj/mistake/dialog/ConvertDialog\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,120:1\n257#2,2:121\n257#2,2:123\n257#2,2:125\n257#2,2:127\n257#2,2:129\n257#2,2:131\n*S KotlinDebug\n*F\n+ 1 ConvertDialog.kt\ncom/zykj/mistake/dialog/ConvertDialog\n*L\n40#1:121,2\n48#1:123,2\n56#1:125,2\n64#1:127,2\n74#1:129,2\n79#1:131,2\n*E\n"
    }
.end annotation


# instance fields
.field public c:Ljava/lang/String;

.field public d:Ll4/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/mistake/dialog/BaseDialogFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final e()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/mistake/R$drawable;->bg_white_corner_7:I

    .line 2
    .line 3
    return v0
.end method

.method public final f()I
    .locals 1

    .line 1
    const/4 v0, -0x2

    return v0
.end method

.method public final g()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/mistake/R$layout;->dialog_convert:I

    .line 2
    .line 3
    return v0
.end method

.method public final h()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Lcom/zykj/mistake/R$dimen;->view_200:I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public final j(Landroid/view/View;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Ll4/f;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v1}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->i()Landroidx/databinding/ViewDataBinding;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lcom/zykj/mistake/databinding/DialogConvertBinding;

    .line 27
    .line 28
    iget-object p1, p1, Lcom/zykj/mistake/databinding/DialogConvertBinding;->g:Landroid/widget/TextView;

    .line 29
    .line 30
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    const/16 v1, 0x8

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->i()Landroidx/databinding/ViewDataBinding;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, Lcom/zykj/mistake/databinding/DialogConvertBinding;

    .line 43
    .line 44
    iget-object p1, p1, Lcom/zykj/mistake/databinding/DialogConvertBinding;->e:Landroid/widget/TextView;

    .line 45
    .line 46
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object v2, p0, Lcom/zykj/mistake/dialog/ConvertDialog;->c:Ljava/lang/String;

    .line 50
    .line 51
    if-eqz v2, :cond_1

    .line 52
    .line 53
    move v2, v0

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    move v2, v1

    .line 56
    :goto_0
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 57
    .line 58
    .line 59
    iget-object v2, p0, Lcom/zykj/mistake/dialog/ConvertDialog;->c:Ljava/lang/String;

    .line 60
    .line 61
    if-eqz v2, :cond_2

    .line 62
    .line 63
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 64
    .line 65
    .line 66
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->i()Landroidx/databinding/ViewDataBinding;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    check-cast p1, Lcom/zykj/mistake/databinding/DialogConvertBinding;

    .line 71
    .line 72
    iget-object p1, p1, Lcom/zykj/mistake/databinding/DialogConvertBinding;->b:Lcom/zykj/mistake/widget/LineBottomProView;

    .line 73
    .line 74
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->i()Landroidx/databinding/ViewDataBinding;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    check-cast p1, Lcom/zykj/mistake/databinding/DialogConvertBinding;

    .line 85
    .line 86
    iget-object p1, p1, Lcom/zykj/mistake/databinding/DialogConvertBinding;->f:Landroid/widget/TextView;

    .line 87
    .line 88
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    iget-object v2, p0, Lcom/zykj/mistake/dialog/ConvertDialog;->d:Ll4/c;

    .line 92
    .line 93
    const/4 v3, 0x0

    .line 94
    if-eqz v2, :cond_3

    .line 95
    .line 96
    iget-object v2, v2, Ll4/c;->a:Ljava/lang/String;

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    move-object v2, v3

    .line 100
    :goto_1
    if-nez v2, :cond_4

    .line 101
    .line 102
    move v2, v0

    .line 103
    goto :goto_2

    .line 104
    :cond_4
    move v2, v1

    .line 105
    :goto_2
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 106
    .line 107
    .line 108
    iget-object v2, p0, Lcom/zykj/mistake/dialog/ConvertDialog;->d:Ll4/c;

    .line 109
    .line 110
    if-eqz v2, :cond_5

    .line 111
    .line 112
    iget-object v2, v2, Ll4/c;->c:Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 115
    .line 116
    .line 117
    :cond_5
    iget-object v2, p0, Lcom/zykj/mistake/dialog/ConvertDialog;->d:Ll4/c;

    .line 118
    .line 119
    if-eqz v2, :cond_6

    .line 120
    .line 121
    iget-object v2, v2, Ll4/c;->d:Lr6/a;

    .line 122
    .line 123
    new-instance v4, Lcom/zykj/mistake/feature/notebook/detail/a;

    .line 124
    .line 125
    const/4 v5, 0x3

    .line 126
    invoke-direct {v4, v2, v5}, Lcom/zykj/mistake/feature/notebook/detail/a;-><init>(Lr6/a;I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 130
    .line 131
    .line 132
    :cond_6
    invoke-virtual {p0}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->i()Landroidx/databinding/ViewDataBinding;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    check-cast p1, Lcom/zykj/mistake/databinding/DialogConvertBinding;

    .line 137
    .line 138
    iget-object p1, p1, Lcom/zykj/mistake/databinding/DialogConvertBinding;->a:Landroid/widget/LinearLayout;

    .line 139
    .line 140
    const-string v2, "llButton"

    .line 141
    .line 142
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    iget-object v2, p0, Lcom/zykj/mistake/dialog/ConvertDialog;->d:Ll4/c;

    .line 146
    .line 147
    if-eqz v2, :cond_7

    .line 148
    .line 149
    iget-object v2, v2, Ll4/c;->a:Ljava/lang/String;

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_7
    move-object v2, v3

    .line 153
    :goto_3
    if-eqz v2, :cond_8

    .line 154
    .line 155
    move v2, v0

    .line 156
    goto :goto_4

    .line 157
    :cond_8
    move v2, v1

    .line 158
    :goto_4
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->i()Landroidx/databinding/ViewDataBinding;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    check-cast p1, Lcom/zykj/mistake/databinding/DialogConvertBinding;

    .line 166
    .line 167
    iget-object p1, p1, Lcom/zykj/mistake/databinding/DialogConvertBinding;->c:Landroid/widget/TextView;

    .line 168
    .line 169
    iget-object v2, p0, Lcom/zykj/mistake/dialog/ConvertDialog;->d:Ll4/c;

    .line 170
    .line 171
    if-eqz v2, :cond_9

    .line 172
    .line 173
    iget-object v2, v2, Ll4/c;->c:Ljava/lang/String;

    .line 174
    .line 175
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 176
    .line 177
    .line 178
    :cond_9
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    iget-object v2, p0, Lcom/zykj/mistake/dialog/ConvertDialog;->d:Ll4/c;

    .line 182
    .line 183
    if-eqz v2, :cond_a

    .line 184
    .line 185
    iget-object v3, v2, Ll4/c;->c:Ljava/lang/String;

    .line 186
    .line 187
    :cond_a
    if-eqz v3, :cond_b

    .line 188
    .line 189
    invoke-static {v3}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    if-eqz v2, :cond_c

    .line 194
    .line 195
    :cond_b
    move v0, v1

    .line 196
    :cond_c
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 197
    .line 198
    .line 199
    iget-object v0, p0, Lcom/zykj/mistake/dialog/ConvertDialog;->d:Ll4/c;

    .line 200
    .line 201
    if-eqz v0, :cond_d

    .line 202
    .line 203
    iget-object v0, v0, Ll4/c;->d:Lr6/a;

    .line 204
    .line 205
    new-instance v1, Lcom/zykj/mistake/feature/notebook/detail/a;

    .line 206
    .line 207
    const/4 v2, 0x4

    .line 208
    invoke-direct {v1, v0, v2}, Lcom/zykj/mistake/feature/notebook/detail/a;-><init>(Lr6/a;I)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 212
    .line 213
    .line 214
    :cond_d
    invoke-virtual {p0}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->i()Landroidx/databinding/ViewDataBinding;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    check-cast p1, Lcom/zykj/mistake/databinding/DialogConvertBinding;

    .line 219
    .line 220
    iget-object p1, p1, Lcom/zykj/mistake/databinding/DialogConvertBinding;->d:Landroid/widget/TextView;

    .line 221
    .line 222
    iget-object v0, p0, Lcom/zykj/mistake/dialog/ConvertDialog;->d:Ll4/c;

    .line 223
    .line 224
    if-eqz v0, :cond_e

    .line 225
    .line 226
    iget-object v0, v0, Ll4/c;->a:Ljava/lang/String;

    .line 227
    .line 228
    if-eqz v0, :cond_e

    .line 229
    .line 230
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 231
    .line 232
    .line 233
    :cond_e
    iget-object v0, p0, Lcom/zykj/mistake/dialog/ConvertDialog;->d:Ll4/c;

    .line 234
    .line 235
    if-eqz v0, :cond_f

    .line 236
    .line 237
    iget-object v0, v0, Ll4/c;->b:Lcom/zykj/mistake/activity/f;

    .line 238
    .line 239
    new-instance v1, Landroidx/navigation/j;

    .line 240
    .line 241
    const/4 v2, 0x5

    .line 242
    invoke-direct {v1, v0, v2}, Landroidx/navigation/j;-><init>(Ljava/lang/Object;I)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 246
    .line 247
    .line 248
    :cond_f
    return-void
.end method
