.class public final Lcom/zykj/policy/ui/PolicyDialogFragment;
.super Landroidx/fragment/app/DialogFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/policy/ui/PolicyDialogFragment$a;
    }
.end annotation


# static fields
.field public static final d:Lcom/zykj/policy/ui/PolicyDialogFragment$a;


# instance fields
.field public final a:Lh7/d;

.field public b:Lx7/a;

.field public c:Lx7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/policy/ui/PolicyDialogFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/policy/ui/PolicyDialogFragment$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/policy/ui/PolicyDialogFragment;->d:Lcom/zykj/policy/ui/PolicyDialogFragment$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/DialogFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/zykj/policy/ui/PolicyDialogFragment$binding$2;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/zykj/policy/ui/PolicyDialogFragment$binding$2;-><init>(Lcom/zykj/policy/ui/PolicyDialogFragment;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/zykj/policy/ui/PolicyDialogFragment;->a:Lh7/d;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final f()Lcom/zykj/policy/databinding/PolicyDialogPolicyBinding;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/policy/ui/PolicyDialogFragment;->a:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/policy/databinding/PolicyDialogPolicyBinding;

    .line 8
    .line 9
    return-object v0
.end method

.method public final g()Lx7/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/policy/ui/PolicyDialogFragment;->b:Lx7/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Lx7/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/policy/ui/PolicyDialogFragment;->c:Lx7/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i(Lx7/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/policy/ui/PolicyDialogFragment;->b:Lx7/a;

    .line 2
    .line 3
    return-void
.end method

.method public final j(Lx7/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/policy/ui/PolicyDialogFragment;->c:Lx7/a;

    .line 2
    .line 3
    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/DialogFragment;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "super.onCreateDialog(savedInstanceState)"

    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const v1, 0x106000d

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    const-string p2, "inflater"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/policy/ui/PolicyDialogFragment;->f()Lcom/zykj/policy/databinding/PolicyDialogPolicyBinding;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Lcom/zykj/policy/databinding/PolicyDialogPolicyBinding;->b()Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-string p2, "binding.root"

    .line 15
    .line 16
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-object p1
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 6

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-virtual {p0, p1}, Landroidx/fragment/app/DialogFragment;->setCancelable(Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    if-eqz p2, :cond_3

    .line 18
    .line 19
    const-string v0, "TITLE"

    .line 20
    .line 21
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const-string v1, "getString(TITLE)"

    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Lg8/c0;->h0(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_0

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/zykj/policy/ui/PolicyDialogFragment;->f()Lcom/zykj/policy/databinding/PolicyDialogPolicyBinding;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iget-object v1, v1, Lcom/zykj/policy/databinding/PolicyDialogPolicyBinding;->e:Landroid/widget/TextView;

    .line 43
    .line 44
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    const-string v0, "CONTENT"

    .line 48
    .line 49
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    const-string v1, "getString(CONTENT)"

    .line 56
    .line 57
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, Lg8/c0;->h0(Ljava/lang/CharSequence;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-nez v1, :cond_1

    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/zykj/policy/ui/PolicyDialogFragment;->f()Lcom/zykj/policy/databinding/PolicyDialogPolicyBinding;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iget-object v1, v1, Lcom/zykj/policy/databinding/PolicyDialogPolicyBinding;->d:Landroid/widget/TextView;

    .line 71
    .line 72
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 73
    .line 74
    .line 75
    :cond_1
    const-string v0, "CANCEL"

    .line 76
    .line 77
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    if-eqz v0, :cond_2

    .line 82
    .line 83
    const-string v1, "getString(CANCEL)"

    .line 84
    .line 85
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-static {v0}, Lg8/c0;->h0(Ljava/lang/CharSequence;)Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-nez v1, :cond_2

    .line 93
    .line 94
    invoke-virtual {p0}, Lcom/zykj/policy/ui/PolicyDialogFragment;->f()Lcom/zykj/policy/databinding/PolicyDialogPolicyBinding;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    iget-object v1, v1, Lcom/zykj/policy/databinding/PolicyDialogPolicyBinding;->b:Landroidx/appcompat/widget/AppCompatButton;

    .line 99
    .line 100
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 101
    .line 102
    .line 103
    :cond_2
    const-string v0, "CONFIRM"

    .line 104
    .line 105
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    if-eqz p2, :cond_3

    .line 110
    .line 111
    const-string v0, "getString(CONFIRM)"

    .line 112
    .line 113
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-static {p2}, Lg8/c0;->h0(Ljava/lang/CharSequence;)Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-nez v0, :cond_3

    .line 121
    .line 122
    invoke-virtual {p0}, Lcom/zykj/policy/ui/PolicyDialogFragment;->f()Lcom/zykj/policy/databinding/PolicyDialogPolicyBinding;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    iget-object v0, v0, Lcom/zykj/policy/databinding/PolicyDialogPolicyBinding;->c:Landroidx/appcompat/widget/AppCompatButton;

    .line 127
    .line 128
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 129
    .line 130
    .line 131
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/policy/ui/PolicyDialogFragment;->f()Lcom/zykj/policy/databinding/PolicyDialogPolicyBinding;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    iget-object p2, p2, Lcom/zykj/policy/databinding/PolicyDialogPolicyBinding;->d:Landroid/widget/TextView;

    .line 136
    .line 137
    invoke-virtual {p2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    invoke-virtual {p0}, Lcom/zykj/policy/ui/PolicyDialogFragment;->f()Lcom/zykj/policy/databinding/PolicyDialogPolicyBinding;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    iget-object v0, v0, Lcom/zykj/policy/databinding/PolicyDialogPolicyBinding;->d:Landroid/widget/TextView;

    .line 150
    .line 151
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0}, Lcom/zykj/policy/ui/PolicyDialogFragment;->f()Lcom/zykj/policy/databinding/PolicyDialogPolicyBinding;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    iget-object v0, v0, Lcom/zykj/policy/databinding/PolicyDialogPolicyBinding;->d:Landroid/widget/TextView;

    .line 163
    .line 164
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setHighlightColor(I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0}, Lcom/zykj/policy/ui/PolicyDialogFragment;->f()Lcom/zykj/policy/databinding/PolicyDialogPolicyBinding;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    iget-object p1, p1, Lcom/zykj/policy/databinding/PolicyDialogPolicyBinding;->d:Landroid/widget/TextView;

    .line 172
    .line 173
    new-instance v0, Landroid/text/SpannableStringBuilder;

    .line 174
    .line 175
    invoke-direct {v0, p2}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    const-string v2, "#1576FF"

    .line 183
    .line 184
    const-string v3, "SPAN_COLOR"

    .line 185
    .line 186
    if-eqz v1, :cond_4

    .line 187
    .line 188
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    goto :goto_0

    .line 193
    :cond_4
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    :goto_0
    sget v4, Lcom/zykj/policy/R$string;->policy_agreement:I

    .line 198
    .line 199
    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    const-string v5, "getString(R.string.policy_agreement)"

    .line 204
    .line 205
    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    new-instance v5, Lcom/zykj/policy/ui/PolicyDialogFragment$onViewCreated$2$1;

    .line 209
    .line 210
    invoke-direct {v5, p0}, Lcom/zykj/policy/ui/PolicyDialogFragment$onViewCreated$2$1;-><init>(Lcom/zykj/policy/ui/PolicyDialogFragment;)V

    .line 211
    .line 212
    .line 213
    invoke-static {v0, v1, p2, v4, v5}, Lk4/b;->b(Landroid/text/SpannableStringBuilder;ILjava/lang/String;Ljava/lang/String;Lx7/a;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    if-eqz v1, :cond_5

    .line 221
    .line 222
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    goto :goto_1

    .line 227
    :cond_5
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 228
    .line 229
    .line 230
    move-result v1

    .line 231
    :goto_1
    sget v2, Lcom/zykj/policy/R$string;->policy_private:I

    .line 232
    .line 233
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    const-string v3, "getString(R.string.policy_private)"

    .line 238
    .line 239
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    new-instance v3, Lcom/zykj/policy/ui/PolicyDialogFragment$onViewCreated$2$2;

    .line 243
    .line 244
    invoke-direct {v3, p0}, Lcom/zykj/policy/ui/PolicyDialogFragment$onViewCreated$2$2;-><init>(Lcom/zykj/policy/ui/PolicyDialogFragment;)V

    .line 245
    .line 246
    .line 247
    invoke-static {v0, v1, p2, v2, v3}, Lk4/b;->b(Landroid/text/SpannableStringBuilder;ILjava/lang/String;Ljava/lang/String;Lx7/a;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p0}, Lcom/zykj/policy/ui/PolicyDialogFragment;->f()Lcom/zykj/policy/databinding/PolicyDialogPolicyBinding;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    iget-object p1, p1, Lcom/zykj/policy/databinding/PolicyDialogPolicyBinding;->b:Landroidx/appcompat/widget/AppCompatButton;

    .line 258
    .line 259
    const-string p2, "binding.btnCancel"

    .line 260
    .line 261
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    new-instance p2, Lcom/zykj/policy/ui/PolicyDialogFragment$onViewCreated$3;

    .line 265
    .line 266
    invoke-direct {p2, p0}, Lcom/zykj/policy/ui/PolicyDialogFragment$onViewCreated$3;-><init>(Lcom/zykj/policy/ui/PolicyDialogFragment;)V

    .line 267
    .line 268
    .line 269
    invoke-static {p1, p2}, Lk4/b;->e(Landroid/view/View;Lx7/l;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p0}, Lcom/zykj/policy/ui/PolicyDialogFragment;->f()Lcom/zykj/policy/databinding/PolicyDialogPolicyBinding;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    iget-object p1, p1, Lcom/zykj/policy/databinding/PolicyDialogPolicyBinding;->c:Landroidx/appcompat/widget/AppCompatButton;

    .line 277
    .line 278
    const-string p2, "binding.btnConfirm"

    .line 279
    .line 280
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    new-instance p2, Lcom/zykj/policy/ui/PolicyDialogFragment$onViewCreated$4;

    .line 284
    .line 285
    invoke-direct {p2, p0}, Lcom/zykj/policy/ui/PolicyDialogFragment$onViewCreated$4;-><init>(Lcom/zykj/policy/ui/PolicyDialogFragment;)V

    .line 286
    .line 287
    .line 288
    invoke-static {p1, p2}, Lk4/b;->e(Landroid/view/View;Lx7/l;)V

    .line 289
    .line 290
    .line 291
    return-void
.end method
