.class public abstract Lcom/xuexiang/xui/widget/dialog/materialdialog/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/widget/ProgressBar;)V
    .locals 0

    .line 1
    return-void
.end method

.method public static b(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->s:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget p0, Lcom/xuexiang/xui/R$layout;->xmd_layout_dialog_custom:I

    .line 6
    .line 7
    return p0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->l:Ljava/util/ArrayList;

    .line 9
    .line 10
    if-nez v0, :cond_8

    .line 11
    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->T:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->g0:I

    .line 18
    .line 19
    const/4 v1, -0x2

    .line 20
    if-le v0, v1, :cond_2

    .line 21
    .line 22
    sget p0, Lcom/xuexiang/xui/R$layout;->xmd_layout_dialog_progress:I

    .line 23
    .line 24
    return p0

    .line 25
    :cond_2
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->e0:Z

    .line 26
    .line 27
    if-eqz v0, :cond_4

    .line 28
    .line 29
    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->x0:Z

    .line 30
    .line 31
    if-eqz p0, :cond_3

    .line 32
    .line 33
    sget p0, Lcom/xuexiang/xui/R$layout;->xmd_layout_dialog_progress_indeterminate_horizontal:I

    .line 34
    .line 35
    return p0

    .line 36
    :cond_3
    sget p0, Lcom/xuexiang/xui/R$layout;->xmd_layout_dialog_progress_indeterminate:I

    .line 37
    .line 38
    return p0

    .line 39
    :cond_4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->k0:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$h;

    .line 40
    .line 41
    if-eqz v0, :cond_6

    .line 42
    .line 43
    iget-object p0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->s0:Ljava/lang/CharSequence;

    .line 44
    .line 45
    if-eqz p0, :cond_5

    .line 46
    .line 47
    sget p0, Lcom/xuexiang/xui/R$layout;->xmd_layout_dialog_input_check:I

    .line 48
    .line 49
    return p0

    .line 50
    :cond_5
    sget p0, Lcom/xuexiang/xui/R$layout;->xmd_layout_dialog_input:I

    .line 51
    .line 52
    return p0

    .line 53
    :cond_6
    iget-object p0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->s0:Ljava/lang/CharSequence;

    .line 54
    .line 55
    if-eqz p0, :cond_7

    .line 56
    .line 57
    sget p0, Lcom/xuexiang/xui/R$layout;->xmd_layout_dialog_basic_check:I

    .line 58
    .line 59
    return p0

    .line 60
    :cond_7
    sget p0, Lcom/xuexiang/xui/R$layout;->xmd_layout_dialog_basic:I

    .line 61
    .line 62
    return p0

    .line 63
    :cond_8
    :goto_0
    iget-object p0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->s0:Ljava/lang/CharSequence;

    .line 64
    .line 65
    if-eqz p0, :cond_9

    .line 66
    .line 67
    sget p0, Lcom/xuexiang/xui/R$layout;->xmd_layout_dialog_list_check:I

    .line 68
    .line 69
    return p0

    .line 70
    :cond_9
    sget p0, Lcom/xuexiang/xui/R$layout;->xmd_layout_dialog_list:I

    .line 71
    .line 72
    return p0
.end method

.method public static c(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;)I
    .locals 4

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->G:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a:Landroid/content/Context;

    .line 8
    .line 9
    sget v1, Lcom/xuexiang/xui/R$attr;->md_dark_theme:I

    .line 10
    .line 11
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->F:Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;

    .line 12
    .line 13
    sget-object v3, Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;->b:Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;

    .line 14
    .line 15
    if-ne v2, v3, :cond_1

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 v2, 0x0

    .line 20
    :goto_0
    invoke-static {v0, v1, v2}, Lcom/xuexiang/xui/utils/g;->l(Landroid/content/Context;IZ)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_2
    sget-object v3, Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;

    .line 28
    .line 29
    :goto_1
    iput-object v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->F:Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;

    .line 30
    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    sget p0, Lcom/xuexiang/xui/R$style;->MD_Dark:I

    .line 34
    .line 35
    return p0

    .line 36
    :cond_3
    sget p0, Lcom/xuexiang/xui/R$style;->MD_Light:I

    .line 37
    .line 38
    return p0
.end method

.method public static d(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->H:Z

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->I:Z

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 11
    .line 12
    .line 13
    iget v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->c0:I

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a:Landroid/content/Context;

    .line 18
    .line 19
    sget v2, Lcom/xuexiang/xui/R$attr;->md_background_color:I

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    sget v4, Lcom/xuexiang/xui/R$attr;->colorBackgroundFloating:I

    .line 26
    .line 27
    invoke-static {v3, v4}, Lcom/xuexiang/xui/utils/g;->m(Landroid/content/Context;I)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    invoke-static {v1, v2, v3}, Lcom/xuexiang/xui/utils/g;->n(Landroid/content/Context;II)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    iput v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->c0:I

    .line 36
    .line 37
    :cond_0
    iget v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->c0:I

    .line 38
    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    .line 42
    .line 43
    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 44
    .line 45
    .line 46
    iget-object v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a:Landroid/content/Context;

    .line 47
    .line 48
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    sget v3, Lcom/xuexiang/xui/R$dimen;->md_bg_corner_radius:I

    .line 53
    .line 54
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    invoke-virtual {v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 59
    .line 60
    .line 61
    iget v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->c0:I

    .line 62
    .line 63
    invoke-virtual {v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v2, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 71
    .line 72
    .line 73
    :cond_1
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->B0:Z

    .line 74
    .line 75
    if-nez v1, :cond_2

    .line 76
    .line 77
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a:Landroid/content/Context;

    .line 78
    .line 79
    sget v2, Lcom/xuexiang/xui/R$attr;->md_positive_color:I

    .line 80
    .line 81
    iget-object v3, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->v:Landroid/content/res/ColorStateList;

    .line 82
    .line 83
    invoke-static {v1, v2, v3}, Lcom/xuexiang/xui/utils/g;->j(Landroid/content/Context;ILandroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    iput-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->v:Landroid/content/res/ColorStateList;

    .line 88
    .line 89
    :cond_2
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->C0:Z

    .line 90
    .line 91
    if-nez v1, :cond_3

    .line 92
    .line 93
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a:Landroid/content/Context;

    .line 94
    .line 95
    sget v2, Lcom/xuexiang/xui/R$attr;->md_neutral_color:I

    .line 96
    .line 97
    iget-object v3, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->x:Landroid/content/res/ColorStateList;

    .line 98
    .line 99
    invoke-static {v1, v2, v3}, Lcom/xuexiang/xui/utils/g;->j(Landroid/content/Context;ILandroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    iput-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->x:Landroid/content/res/ColorStateList;

    .line 104
    .line 105
    :cond_3
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->D0:Z

    .line 106
    .line 107
    if-nez v1, :cond_4

    .line 108
    .line 109
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a:Landroid/content/Context;

    .line 110
    .line 111
    sget v2, Lcom/xuexiang/xui/R$attr;->md_negative_color:I

    .line 112
    .line 113
    iget-object v3, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->w:Landroid/content/res/ColorStateList;

    .line 114
    .line 115
    invoke-static {v1, v2, v3}, Lcom/xuexiang/xui/utils/g;->j(Landroid/content/Context;ILandroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    iput-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->w:Landroid/content/res/ColorStateList;

    .line 120
    .line 121
    :cond_4
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->E0:Z

    .line 122
    .line 123
    if-nez v1, :cond_5

    .line 124
    .line 125
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a:Landroid/content/Context;

    .line 126
    .line 127
    sget v2, Lcom/xuexiang/xui/R$attr;->md_widget_color:I

    .line 128
    .line 129
    iget v3, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t:I

    .line 130
    .line 131
    invoke-static {v1, v2, v3}, Lcom/xuexiang/xui/utils/g;->n(Landroid/content/Context;II)I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    iput v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t:I

    .line 136
    .line 137
    :cond_5
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->y0:Z

    .line 138
    .line 139
    const v2, 0x1010036

    .line 140
    .line 141
    .line 142
    if-nez v1, :cond_6

    .line 143
    .line 144
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-static {v1, v2}, Lcom/xuexiang/xui/utils/g;->m(Landroid/content/Context;I)I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    iget-object v3, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a:Landroid/content/Context;

    .line 153
    .line 154
    sget v4, Lcom/xuexiang/xui/R$attr;->md_title_color:I

    .line 155
    .line 156
    invoke-static {v3, v4, v1}, Lcom/xuexiang/xui/utils/g;->n(Landroid/content/Context;II)I

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    iput v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->i:I

    .line 161
    .line 162
    :cond_6
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->z0:Z

    .line 163
    .line 164
    if-nez v1, :cond_7

    .line 165
    .line 166
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    const v3, 0x1010038

    .line 171
    .line 172
    .line 173
    invoke-static {v1, v3}, Lcom/xuexiang/xui/utils/g;->m(Landroid/content/Context;I)I

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    iget-object v3, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a:Landroid/content/Context;

    .line 178
    .line 179
    sget v4, Lcom/xuexiang/xui/R$attr;->md_content_color:I

    .line 180
    .line 181
    invoke-static {v3, v4, v1}, Lcom/xuexiang/xui/utils/g;->n(Landroid/content/Context;II)I

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    iput v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->j:I

    .line 186
    .line 187
    :cond_7
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->A0:Z

    .line 188
    .line 189
    if-nez v1, :cond_8

    .line 190
    .line 191
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a:Landroid/content/Context;

    .line 192
    .line 193
    sget v3, Lcom/xuexiang/xui/R$attr;->md_item_color:I

    .line 194
    .line 195
    iget v4, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->j:I

    .line 196
    .line 197
    invoke-static {v1, v3, v4}, Lcom/xuexiang/xui/utils/g;->n(Landroid/content/Context;II)I

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    iput v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->d0:I

    .line 202
    .line 203
    :cond_8
    iget-object v1, p0, Ly1/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 204
    .line 205
    sget v3, Lcom/xuexiang/xui/R$id;->md_title:I

    .line 206
    .line 207
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    check-cast v1, Landroid/widget/TextView;

    .line 212
    .line 213
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->f:Landroid/widget/TextView;

    .line 214
    .line 215
    iget-object v1, p0, Ly1/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 216
    .line 217
    sget v3, Lcom/xuexiang/xui/R$id;->md_icon:I

    .line 218
    .line 219
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    check-cast v1, Landroid/widget/ImageView;

    .line 224
    .line 225
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->e:Landroid/widget/ImageView;

    .line 226
    .line 227
    iget-object v1, p0, Ly1/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 228
    .line 229
    sget v3, Lcom/xuexiang/xui/R$id;->md_titleFrame:I

    .line 230
    .line 231
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->j:Landroid/view/View;

    .line 236
    .line 237
    iget-object v1, p0, Ly1/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 238
    .line 239
    sget v3, Lcom/xuexiang/xui/R$id;->md_content:I

    .line 240
    .line 241
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    check-cast v1, Landroid/widget/TextView;

    .line 246
    .line 247
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->g:Landroid/widget/TextView;

    .line 248
    .line 249
    iget-object v1, p0, Ly1/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 250
    .line 251
    sget v3, Lcom/xuexiang/xui/R$id;->md_contentRecyclerView:I

    .line 252
    .line 253
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 258
    .line 259
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 260
    .line 261
    iget-object v1, p0, Ly1/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 262
    .line 263
    sget v3, Lcom/xuexiang/xui/R$id;->md_promptCheckbox:I

    .line 264
    .line 265
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    check-cast v1, Landroid/widget/CheckBox;

    .line 270
    .line 271
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->p:Landroid/widget/CheckBox;

    .line 272
    .line 273
    iget-object v1, p0, Ly1/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 274
    .line 275
    sget v3, Lcom/xuexiang/xui/R$id;->md_buttonDefaultPositive:I

    .line 276
    .line 277
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    check-cast v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 282
    .line 283
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->q:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 284
    .line 285
    iget-object v1, p0, Ly1/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 286
    .line 287
    sget v3, Lcom/xuexiang/xui/R$id;->md_buttonDefaultNeutral:I

    .line 288
    .line 289
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    check-cast v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 294
    .line 295
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->r:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 296
    .line 297
    iget-object v1, p0, Ly1/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 298
    .line 299
    sget v3, Lcom/xuexiang/xui/R$id;->md_buttonDefaultNegative:I

    .line 300
    .line 301
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    check-cast v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 306
    .line 307
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->s:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 308
    .line 309
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->k0:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$h;

    .line 310
    .line 311
    if-eqz v1, :cond_9

    .line 312
    .line 313
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->m:Ljava/lang/CharSequence;

    .line 314
    .line 315
    if-nez v1, :cond_9

    .line 316
    .line 317
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a:Landroid/content/Context;

    .line 318
    .line 319
    const v3, 0x104000a

    .line 320
    .line 321
    .line 322
    invoke-virtual {v1, v3}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    iput-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->m:Ljava/lang/CharSequence;

    .line 327
    .line 328
    :cond_9
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->q:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 329
    .line 330
    iget-object v3, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->m:Ljava/lang/CharSequence;

    .line 331
    .line 332
    const/16 v4, 0x8

    .line 333
    .line 334
    const/4 v5, 0x0

    .line 335
    if-eqz v3, :cond_a

    .line 336
    .line 337
    move v3, v5

    .line 338
    goto :goto_0

    .line 339
    :cond_a
    move v3, v4

    .line 340
    :goto_0
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 341
    .line 342
    .line 343
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->r:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 344
    .line 345
    iget-object v3, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->n:Ljava/lang/CharSequence;

    .line 346
    .line 347
    if-eqz v3, :cond_b

    .line 348
    .line 349
    move v3, v5

    .line 350
    goto :goto_1

    .line 351
    :cond_b
    move v3, v4

    .line 352
    :goto_1
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 353
    .line 354
    .line 355
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->s:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 356
    .line 357
    iget-object v3, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->o:Ljava/lang/CharSequence;

    .line 358
    .line 359
    if-eqz v3, :cond_c

    .line 360
    .line 361
    move v3, v5

    .line 362
    goto :goto_2

    .line 363
    :cond_c
    move v3, v4

    .line 364
    :goto_2
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 365
    .line 366
    .line 367
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->q:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 368
    .line 369
    const/4 v3, 0x1

    .line 370
    invoke-virtual {v1, v3}, Landroid/view/View;->setFocusable(Z)V

    .line 371
    .line 372
    .line 373
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->r:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 374
    .line 375
    invoke-virtual {v1, v3}, Landroid/view/View;->setFocusable(Z)V

    .line 376
    .line 377
    .line 378
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->s:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 379
    .line 380
    invoke-virtual {v1, v3}, Landroid/view/View;->setFocusable(Z)V

    .line 381
    .line 382
    .line 383
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->p:Z

    .line 384
    .line 385
    if-eqz v1, :cond_d

    .line 386
    .line 387
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->q:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 388
    .line 389
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 390
    .line 391
    .line 392
    :cond_d
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->q:Z

    .line 393
    .line 394
    if-eqz v1, :cond_e

    .line 395
    .line 396
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->r:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 397
    .line 398
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 399
    .line 400
    .line 401
    :cond_e
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->r:Z

    .line 402
    .line 403
    if-eqz v1, :cond_f

    .line 404
    .line 405
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->s:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 406
    .line 407
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 408
    .line 409
    .line 410
    :cond_f
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->Q:Landroid/graphics/drawable/Drawable;

    .line 411
    .line 412
    if-eqz v1, :cond_10

    .line 413
    .line 414
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->e:Landroid/widget/ImageView;

    .line 415
    .line 416
    invoke-virtual {v1, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 417
    .line 418
    .line 419
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->e:Landroid/widget/ImageView;

    .line 420
    .line 421
    iget-object v6, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->Q:Landroid/graphics/drawable/Drawable;

    .line 422
    .line 423
    invoke-virtual {v1, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 424
    .line 425
    .line 426
    goto :goto_3

    .line 427
    :cond_10
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a:Landroid/content/Context;

    .line 428
    .line 429
    sget v6, Lcom/xuexiang/xui/R$attr;->md_icon:I

    .line 430
    .line 431
    invoke-static {v1, v6}, Lcom/xuexiang/xui/utils/g;->q(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    if-eqz v1, :cond_11

    .line 436
    .line 437
    iget-object v6, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->e:Landroid/widget/ImageView;

    .line 438
    .line 439
    invoke-virtual {v6, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 440
    .line 441
    .line 442
    iget-object v6, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->e:Landroid/widget/ImageView;

    .line 443
    .line 444
    invoke-virtual {v6, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 445
    .line 446
    .line 447
    goto :goto_3

    .line 448
    :cond_11
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->e:Landroid/widget/ImageView;

    .line 449
    .line 450
    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 451
    .line 452
    .line 453
    :goto_3
    iget v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->S:I

    .line 454
    .line 455
    const/4 v6, -0x1

    .line 456
    if-ne v1, v6, :cond_12

    .line 457
    .line 458
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a:Landroid/content/Context;

    .line 459
    .line 460
    sget v7, Lcom/xuexiang/xui/R$attr;->md_icon_max_size:I

    .line 461
    .line 462
    invoke-static {v1, v7}, Lcom/xuexiang/xui/utils/g;->o(Landroid/content/Context;I)I

    .line 463
    .line 464
    .line 465
    move-result v1

    .line 466
    :cond_12
    iget-boolean v7, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->R:Z

    .line 467
    .line 468
    if-nez v7, :cond_13

    .line 469
    .line 470
    iget-object v7, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a:Landroid/content/Context;

    .line 471
    .line 472
    sget v8, Lcom/xuexiang/xui/R$attr;->md_icon_limit_icon_to_default_size:I

    .line 473
    .line 474
    invoke-static {v7, v8}, Lcom/xuexiang/xui/utils/g;->k(Landroid/content/Context;I)Z

    .line 475
    .line 476
    .line 477
    move-result v7

    .line 478
    if-eqz v7, :cond_14

    .line 479
    .line 480
    :cond_13
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a:Landroid/content/Context;

    .line 481
    .line 482
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 483
    .line 484
    .line 485
    move-result-object v1

    .line 486
    sget v7, Lcom/xuexiang/xui/R$dimen;->default_md_icon_max_size:I

    .line 487
    .line 488
    invoke-virtual {v1, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 489
    .line 490
    .line 491
    move-result v1

    .line 492
    :cond_14
    if-le v1, v6, :cond_15

    .line 493
    .line 494
    iget-object v7, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->e:Landroid/widget/ImageView;

    .line 495
    .line 496
    invoke-virtual {v7, v3}, Landroid/widget/ImageView;->setAdjustViewBounds(Z)V

    .line 497
    .line 498
    .line 499
    iget-object v7, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->e:Landroid/widget/ImageView;

    .line 500
    .line 501
    invoke-virtual {v7, v1}, Landroid/widget/ImageView;->setMaxHeight(I)V

    .line 502
    .line 503
    .line 504
    iget-object v7, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->e:Landroid/widget/ImageView;

    .line 505
    .line 506
    invoke-virtual {v7, v1}, Landroid/widget/ImageView;->setMaxWidth(I)V

    .line 507
    .line 508
    .line 509
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->e:Landroid/widget/ImageView;

    .line 510
    .line 511
    invoke-virtual {v1}, Landroid/view/View;->requestLayout()V

    .line 512
    .line 513
    .line 514
    :cond_15
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->F0:Z

    .line 515
    .line 516
    if-nez v1, :cond_16

    .line 517
    .line 518
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    sget v7, Lcom/xuexiang/xui/R$attr;->md_divider:I

    .line 523
    .line 524
    invoke-static {v1, v7}, Lcom/xuexiang/xui/utils/g;->m(Landroid/content/Context;I)I

    .line 525
    .line 526
    .line 527
    move-result v1

    .line 528
    iget-object v7, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a:Landroid/content/Context;

    .line 529
    .line 530
    sget v8, Lcom/xuexiang/xui/R$attr;->md_divider_color:I

    .line 531
    .line 532
    invoke-static {v7, v8, v1}, Lcom/xuexiang/xui/utils/g;->n(Landroid/content/Context;II)I

    .line 533
    .line 534
    .line 535
    move-result v1

    .line 536
    iput v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->b0:I

    .line 537
    .line 538
    :cond_16
    iget-object v1, p0, Ly1/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 539
    .line 540
    iget v7, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->b0:I

    .line 541
    .line 542
    invoke-virtual {v1, v7}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->setDividerColor(I)V

    .line 543
    .line 544
    .line 545
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->f:Landroid/widget/TextView;

    .line 546
    .line 547
    if-eqz v1, :cond_18

    .line 548
    .line 549
    iget-object v7, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->P:Landroid/graphics/Typeface;

    .line 550
    .line 551
    invoke-virtual {p0, v1, v7}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->u(Landroid/widget/TextView;Landroid/graphics/Typeface;)V

    .line 552
    .line 553
    .line 554
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->f:Landroid/widget/TextView;

    .line 555
    .line 556
    iget v7, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->i:I

    .line 557
    .line 558
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 559
    .line 560
    .line 561
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->f:Landroid/widget/TextView;

    .line 562
    .line 563
    iget-object v7, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 564
    .line 565
    invoke-virtual {v7}, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->a()I

    .line 566
    .line 567
    .line 568
    move-result v7

    .line 569
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setGravity(I)V

    .line 570
    .line 571
    .line 572
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->f:Landroid/widget/TextView;

    .line 573
    .line 574
    iget-object v7, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 575
    .line 576
    invoke-virtual {v7}, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->b()I

    .line 577
    .line 578
    .line 579
    move-result v7

    .line 580
    invoke-virtual {v1, v7}, Landroid/view/View;->setTextAlignment(I)V

    .line 581
    .line 582
    .line 583
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->b:Ljava/lang/CharSequence;

    .line 584
    .line 585
    if-nez v1, :cond_17

    .line 586
    .line 587
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->j:Landroid/view/View;

    .line 588
    .line 589
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 590
    .line 591
    .line 592
    goto :goto_4

    .line 593
    :cond_17
    iget-object v7, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->f:Landroid/widget/TextView;

    .line 594
    .line 595
    invoke-virtual {v7, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 596
    .line 597
    .line 598
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->j:Landroid/view/View;

    .line 599
    .line 600
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 601
    .line 602
    .line 603
    :cond_18
    :goto_4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->g:Landroid/widget/TextView;

    .line 604
    .line 605
    if-eqz v1, :cond_1b

    .line 606
    .line 607
    new-instance v7, Landroid/text/method/LinkMovementMethod;

    .line 608
    .line 609
    invoke-direct {v7}, Landroid/text/method/LinkMovementMethod;-><init>()V

    .line 610
    .line 611
    .line 612
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 613
    .line 614
    .line 615
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->g:Landroid/widget/TextView;

    .line 616
    .line 617
    iget-object v7, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->O:Landroid/graphics/Typeface;

    .line 618
    .line 619
    invoke-virtual {p0, v1, v7}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->u(Landroid/widget/TextView;Landroid/graphics/Typeface;)V

    .line 620
    .line 621
    .line 622
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->g:Landroid/widget/TextView;

    .line 623
    .line 624
    const/4 v7, 0x0

    .line 625
    iget v8, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->J:F

    .line 626
    .line 627
    invoke-virtual {v1, v7, v8}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 628
    .line 629
    .line 630
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->y:Landroid/content/res/ColorStateList;

    .line 631
    .line 632
    if-nez v1, :cond_19

    .line 633
    .line 634
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->g:Landroid/widget/TextView;

    .line 635
    .line 636
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 637
    .line 638
    .line 639
    move-result-object v7

    .line 640
    invoke-static {v7, v2}, Lcom/xuexiang/xui/utils/g;->m(Landroid/content/Context;I)I

    .line 641
    .line 642
    .line 643
    move-result v2

    .line 644
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setLinkTextColor(I)V

    .line 645
    .line 646
    .line 647
    goto :goto_5

    .line 648
    :cond_19
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->g:Landroid/widget/TextView;

    .line 649
    .line 650
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setLinkTextColor(Landroid/content/res/ColorStateList;)V

    .line 651
    .line 652
    .line 653
    :goto_5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->g:Landroid/widget/TextView;

    .line 654
    .line 655
    iget v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->j:I

    .line 656
    .line 657
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 658
    .line 659
    .line 660
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->g:Landroid/widget/TextView;

    .line 661
    .line 662
    iget-object v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->d:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 663
    .line 664
    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->a()I

    .line 665
    .line 666
    .line 667
    move-result v2

    .line 668
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 669
    .line 670
    .line 671
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->g:Landroid/widget/TextView;

    .line 672
    .line 673
    iget-object v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->d:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 674
    .line 675
    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->b()I

    .line 676
    .line 677
    .line 678
    move-result v2

    .line 679
    invoke-virtual {v1, v2}, Landroid/view/View;->setTextAlignment(I)V

    .line 680
    .line 681
    .line 682
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->k:Ljava/lang/CharSequence;

    .line 683
    .line 684
    if-eqz v1, :cond_1a

    .line 685
    .line 686
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->g:Landroid/widget/TextView;

    .line 687
    .line 688
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 689
    .line 690
    .line 691
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->g:Landroid/widget/TextView;

    .line 692
    .line 693
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 694
    .line 695
    .line 696
    goto :goto_6

    .line 697
    :cond_1a
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->g:Landroid/widget/TextView;

    .line 698
    .line 699
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 700
    .line 701
    .line 702
    :cond_1b
    :goto_6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->p:Landroid/widget/CheckBox;

    .line 703
    .line 704
    if-eqz v1, :cond_1c

    .line 705
    .line 706
    iget-object v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->s0:Ljava/lang/CharSequence;

    .line 707
    .line 708
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 709
    .line 710
    .line 711
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->p:Landroid/widget/CheckBox;

    .line 712
    .line 713
    iget-boolean v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t0:Z

    .line 714
    .line 715
    invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 716
    .line 717
    .line 718
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->p:Landroid/widget/CheckBox;

    .line 719
    .line 720
    iget-object v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->u0:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 721
    .line 722
    invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 723
    .line 724
    .line 725
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->p:Landroid/widget/CheckBox;

    .line 726
    .line 727
    iget-object v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->O:Landroid/graphics/Typeface;

    .line 728
    .line 729
    invoke-virtual {p0, v1, v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->u(Landroid/widget/TextView;Landroid/graphics/Typeface;)V

    .line 730
    .line 731
    .line 732
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->p:Landroid/widget/CheckBox;

    .line 733
    .line 734
    iget v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->j:I

    .line 735
    .line 736
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 737
    .line 738
    .line 739
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->p:Landroid/widget/CheckBox;

    .line 740
    .line 741
    iget v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t:I

    .line 742
    .line 743
    invoke-static {v1, v2}, Lz1/b;->c(Landroid/widget/CheckBox;I)V

    .line 744
    .line 745
    .line 746
    :cond_1c
    iget-object v1, p0, Ly1/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 747
    .line 748
    iget-object v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->g:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 749
    .line 750
    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->setButtonGravity(Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;)V

    .line 751
    .line 752
    .line 753
    iget-object v1, p0, Ly1/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 754
    .line 755
    iget-object v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->e:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 756
    .line 757
    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->setButtonStackedGravity(Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;)V

    .line 758
    .line 759
    .line 760
    iget-object v1, p0, Ly1/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 761
    .line 762
    iget-object v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->Z:Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;

    .line 763
    .line 764
    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->setStackingBehavior(Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;)V

    .line 765
    .line 766
    .line 767
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a:Landroid/content/Context;

    .line 768
    .line 769
    const v2, 0x101038c

    .line 770
    .line 771
    .line 772
    invoke-static {v1, v2, v3}, Lcom/xuexiang/xui/utils/g;->l(Landroid/content/Context;IZ)Z

    .line 773
    .line 774
    .line 775
    move-result v1

    .line 776
    if-eqz v1, :cond_1d

    .line 777
    .line 778
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a:Landroid/content/Context;

    .line 779
    .line 780
    sget v2, Lcom/xuexiang/xui/R$attr;->textAllCaps:I

    .line 781
    .line 782
    invoke-static {v1, v2, v3}, Lcom/xuexiang/xui/utils/g;->l(Landroid/content/Context;IZ)Z

    .line 783
    .line 784
    .line 785
    move-result v1

    .line 786
    :cond_1d
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->q:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 787
    .line 788
    iget-object v4, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->P:Landroid/graphics/Typeface;

    .line 789
    .line 790
    invoke-virtual {p0, v2, v4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->u(Landroid/widget/TextView;Landroid/graphics/Typeface;)V

    .line 791
    .line 792
    .line 793
    invoke-virtual {v2, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->setAllCapsCompat(Z)V

    .line 794
    .line 795
    .line 796
    iget-object v4, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->m:Ljava/lang/CharSequence;

    .line 797
    .line 798
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 799
    .line 800
    .line 801
    iget-object v4, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->v:Landroid/content/res/ColorStateList;

    .line 802
    .line 803
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 804
    .line 805
    .line 806
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->q:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 807
    .line 808
    sget-object v4, Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;

    .line 809
    .line 810
    invoke-virtual {p0, v4, v3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->h(Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;Z)Landroid/graphics/drawable/Drawable;

    .line 811
    .line 812
    .line 813
    move-result-object v7

    .line 814
    invoke-virtual {v2, v7}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->setStackedSelector(Landroid/graphics/drawable/Drawable;)V

    .line 815
    .line 816
    .line 817
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->q:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 818
    .line 819
    invoke-virtual {p0, v4, v5}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->h(Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;Z)Landroid/graphics/drawable/Drawable;

    .line 820
    .line 821
    .line 822
    move-result-object v7

    .line 823
    invoke-virtual {v2, v7}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->setDefaultSelector(Landroid/graphics/drawable/Drawable;)V

    .line 824
    .line 825
    .line 826
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->q:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 827
    .line 828
    invoke-virtual {v2, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 829
    .line 830
    .line 831
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->q:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 832
    .line 833
    invoke-virtual {v2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 834
    .line 835
    .line 836
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->q:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 837
    .line 838
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 839
    .line 840
    .line 841
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->s:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 842
    .line 843
    iget-object v4, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->P:Landroid/graphics/Typeface;

    .line 844
    .line 845
    invoke-virtual {p0, v2, v4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->u(Landroid/widget/TextView;Landroid/graphics/Typeface;)V

    .line 846
    .line 847
    .line 848
    invoke-virtual {v2, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->setAllCapsCompat(Z)V

    .line 849
    .line 850
    .line 851
    iget-object v4, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->o:Ljava/lang/CharSequence;

    .line 852
    .line 853
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 854
    .line 855
    .line 856
    iget-object v4, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->w:Landroid/content/res/ColorStateList;

    .line 857
    .line 858
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 859
    .line 860
    .line 861
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->s:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 862
    .line 863
    sget-object v4, Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;

    .line 864
    .line 865
    invoke-virtual {p0, v4, v3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->h(Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;Z)Landroid/graphics/drawable/Drawable;

    .line 866
    .line 867
    .line 868
    move-result-object v7

    .line 869
    invoke-virtual {v2, v7}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->setStackedSelector(Landroid/graphics/drawable/Drawable;)V

    .line 870
    .line 871
    .line 872
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->s:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 873
    .line 874
    invoke-virtual {p0, v4, v5}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->h(Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;Z)Landroid/graphics/drawable/Drawable;

    .line 875
    .line 876
    .line 877
    move-result-object v7

    .line 878
    invoke-virtual {v2, v7}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->setDefaultSelector(Landroid/graphics/drawable/Drawable;)V

    .line 879
    .line 880
    .line 881
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->s:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 882
    .line 883
    invoke-virtual {v2, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 884
    .line 885
    .line 886
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->s:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 887
    .line 888
    invoke-virtual {v2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 889
    .line 890
    .line 891
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->s:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 892
    .line 893
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 894
    .line 895
    .line 896
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->r:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 897
    .line 898
    iget-object v4, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->P:Landroid/graphics/Typeface;

    .line 899
    .line 900
    invoke-virtual {p0, v2, v4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->u(Landroid/widget/TextView;Landroid/graphics/Typeface;)V

    .line 901
    .line 902
    .line 903
    invoke-virtual {v2, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->setAllCapsCompat(Z)V

    .line 904
    .line 905
    .line 906
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->n:Ljava/lang/CharSequence;

    .line 907
    .line 908
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 909
    .line 910
    .line 911
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->x:Landroid/content/res/ColorStateList;

    .line 912
    .line 913
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 914
    .line 915
    .line 916
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->r:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 917
    .line 918
    sget-object v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;->b:Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;

    .line 919
    .line 920
    invoke-virtual {p0, v2, v3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->h(Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;Z)Landroid/graphics/drawable/Drawable;

    .line 921
    .line 922
    .line 923
    move-result-object v3

    .line 924
    invoke-virtual {v1, v3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->setStackedSelector(Landroid/graphics/drawable/Drawable;)V

    .line 925
    .line 926
    .line 927
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->r:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 928
    .line 929
    invoke-virtual {p0, v2, v5}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->h(Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;Z)Landroid/graphics/drawable/Drawable;

    .line 930
    .line 931
    .line 932
    move-result-object v3

    .line 933
    invoke-virtual {v1, v3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->setDefaultSelector(Landroid/graphics/drawable/Drawable;)V

    .line 934
    .line 935
    .line 936
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->r:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 937
    .line 938
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 939
    .line 940
    .line 941
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->r:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 942
    .line 943
    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 944
    .line 945
    .line 946
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->r:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 947
    .line 948
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 949
    .line 950
    .line 951
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 952
    .line 953
    if-eqz v1, :cond_1f

    .line 954
    .line 955
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->T:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 956
    .line 957
    if-nez v1, :cond_1e

    .line 958
    .line 959
    sget-object v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$ListType;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$ListType;

    .line 960
    .line 961
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->t:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$ListType;

    .line 962
    .line 963
    new-instance v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;

    .line 964
    .line 965
    invoke-static {v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$ListType;->a(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$ListType;)I

    .line 966
    .line 967
    .line 968
    move-result v1

    .line 969
    invoke-direct {v2, p0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;-><init>(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;I)V

    .line 970
    .line 971
    .line 972
    iput-object v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->T:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 973
    .line 974
    goto :goto_7

    .line 975
    :cond_1e
    instance-of v2, v1, Lz1/a;

    .line 976
    .line 977
    if-eqz v2, :cond_1f

    .line 978
    .line 979
    check-cast v1, Lz1/a;

    .line 980
    .line 981
    invoke-interface {v1, p0}, Lz1/a;->b(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;)V

    .line 982
    .line 983
    .line 984
    :cond_1f
    :goto_7
    invoke-static {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/b;->f(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;)V

    .line 985
    .line 986
    .line 987
    invoke-static {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/b;->e(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;)V

    .line 988
    .line 989
    .line 990
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->s:Landroid/view/View;

    .line 991
    .line 992
    if-eqz v1, :cond_23

    .line 993
    .line 994
    iget-object v1, p0, Ly1/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 995
    .line 996
    sget v2, Lcom/xuexiang/xui/R$id;->md_root:I

    .line 997
    .line 998
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 999
    .line 1000
    .line 1001
    move-result-object v1

    .line 1002
    check-cast v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 1003
    .line 1004
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->t()V

    .line 1005
    .line 1006
    .line 1007
    iget-object v1, p0, Ly1/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 1008
    .line 1009
    sget v2, Lcom/xuexiang/xui/R$id;->md_customViewFrame:I

    .line 1010
    .line 1011
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v1

    .line 1015
    check-cast v1, Landroid/widget/FrameLayout;

    .line 1016
    .line 1017
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->k:Landroid/widget/FrameLayout;

    .line 1018
    .line 1019
    iget-object v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->s:Landroid/view/View;

    .line 1020
    .line 1021
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v3

    .line 1025
    if-eqz v3, :cond_20

    .line 1026
    .line 1027
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v3

    .line 1031
    check-cast v3, Landroid/view/ViewGroup;

    .line 1032
    .line 1033
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 1034
    .line 1035
    .line 1036
    :cond_20
    iget-boolean v3, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a0:Z

    .line 1037
    .line 1038
    const/4 v4, -0x2

    .line 1039
    if-eqz v3, :cond_22

    .line 1040
    .line 1041
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v3

    .line 1045
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v3

    .line 1049
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v7

    .line 1053
    sget v8, Lcom/xuexiang/xui/R$attr;->md_dialog_frame_margin:I

    .line 1054
    .line 1055
    sget v9, Lcom/xuexiang/xui/R$dimen;->default_md_dialog_frame_margin:I

    .line 1056
    .line 1057
    invoke-static {v7, v8, v9}, Lcom/xuexiang/xui/utils/g;->p(Landroid/content/Context;II)I

    .line 1058
    .line 1059
    .line 1060
    move-result v7

    .line 1061
    new-instance v8, Lo1/a;

    .line 1062
    .line 1063
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v9

    .line 1067
    invoke-direct {v8, v9}, Lo1/a;-><init>(Landroid/content/Context;)V

    .line 1068
    .line 1069
    .line 1070
    sget v9, Lcom/xuexiang/xui/R$dimen;->md_content_padding_top:I

    .line 1071
    .line 1072
    invoke-virtual {v3, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 1073
    .line 1074
    .line 1075
    move-result v9

    .line 1076
    sget v10, Lcom/xuexiang/xui/R$dimen;->md_content_padding_bottom:I

    .line 1077
    .line 1078
    invoke-virtual {v3, v10}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 1079
    .line 1080
    .line 1081
    move-result v3

    .line 1082
    invoke-virtual {v8, v5}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 1083
    .line 1084
    .line 1085
    instance-of v10, v2, Landroid/widget/EditText;

    .line 1086
    .line 1087
    if-eqz v10, :cond_21

    .line 1088
    .line 1089
    invoke-virtual {v8, v7, v9, v7, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 1090
    .line 1091
    .line 1092
    goto :goto_8

    .line 1093
    :cond_21
    invoke-virtual {v8, v5, v9, v5, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 1094
    .line 1095
    .line 1096
    invoke-virtual {v2, v7, v5, v7, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 1097
    .line 1098
    .line 1099
    :goto_8
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 1100
    .line 1101
    invoke-direct {v3, v6, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 1102
    .line 1103
    .line 1104
    invoke-virtual {v8, v2, v3}, Landroid/widget/ScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1105
    .line 1106
    .line 1107
    move-object v2, v8

    .line 1108
    :cond_22
    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    .line 1109
    .line 1110
    invoke-direct {v3, v6, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 1111
    .line 1112
    .line 1113
    invoke-virtual {v1, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1114
    .line 1115
    .line 1116
    :cond_23
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->Y:Landroid/content/DialogInterface$OnShowListener;

    .line 1117
    .line 1118
    if-eqz v1, :cond_24

    .line 1119
    .line 1120
    invoke-virtual {p0, v1}, Ly1/a;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 1121
    .line 1122
    .line 1123
    :cond_24
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->W:Landroid/content/DialogInterface$OnCancelListener;

    .line 1124
    .line 1125
    if-eqz v1, :cond_25

    .line 1126
    .line 1127
    invoke-virtual {p0, v1}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 1128
    .line 1129
    .line 1130
    :cond_25
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->V:Landroid/content/DialogInterface$OnDismissListener;

    .line 1131
    .line 1132
    if-eqz v1, :cond_26

    .line 1133
    .line 1134
    invoke-virtual {p0, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 1135
    .line 1136
    .line 1137
    :cond_26
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->X:Landroid/content/DialogInterface$OnKeyListener;

    .line 1138
    .line 1139
    if-eqz v1, :cond_27

    .line 1140
    .line 1141
    invoke-virtual {p0, v1}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 1142
    .line 1143
    .line 1144
    :cond_27
    invoke-virtual {p0}, Ly1/a;->b()V

    .line 1145
    .line 1146
    .line 1147
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->p()V

    .line 1148
    .line 1149
    .line 1150
    iget-object v1, p0, Ly1/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 1151
    .line 1152
    invoke-virtual {p0, v1}, Ly1/a;->c(Landroid/view/View;)V

    .line 1153
    .line 1154
    .line 1155
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->e()V

    .line 1156
    .line 1157
    .line 1158
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v1

    .line 1162
    invoke-virtual {v1}, Landroid/view/Window;->getWindowManager()Landroid/view/WindowManager;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v1

    .line 1166
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v1

    .line 1170
    new-instance v2, Landroid/graphics/Point;

    .line 1171
    .line 1172
    invoke-direct {v2}, Landroid/graphics/Point;-><init>()V

    .line 1173
    .line 1174
    .line 1175
    invoke-virtual {v1, v2}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 1176
    .line 1177
    .line 1178
    iget v1, v2, Landroid/graphics/Point;->x:I

    .line 1179
    .line 1180
    iget v2, v2, Landroid/graphics/Point;->y:I

    .line 1181
    .line 1182
    iget-object v3, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a:Landroid/content/Context;

    .line 1183
    .line 1184
    sget v4, Lcom/xuexiang/xui/R$attr;->md_dialog_vertical_margin:I

    .line 1185
    .line 1186
    sget v5, Lcom/xuexiang/xui/R$dimen;->default_md_dialog_vertical_margin_phone:I

    .line 1187
    .line 1188
    invoke-static {v3, v5}, Lcom/xuexiang/xui/utils/e;->f(Landroid/content/Context;I)I

    .line 1189
    .line 1190
    .line 1191
    move-result v5

    .line 1192
    invoke-static {v3, v4, v5}, Lcom/xuexiang/xui/utils/g;->p(Landroid/content/Context;II)I

    .line 1193
    .line 1194
    .line 1195
    move-result v3

    .line 1196
    iget-object v4, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a:Landroid/content/Context;

    .line 1197
    .line 1198
    sget v5, Lcom/xuexiang/xui/R$attr;->md_dialog_horizontal_margin:I

    .line 1199
    .line 1200
    sget v6, Lcom/xuexiang/xui/R$dimen;->default_md_dialog_horizontal_margin_phone:I

    .line 1201
    .line 1202
    invoke-static {v4, v6}, Lcom/xuexiang/xui/utils/e;->f(Landroid/content/Context;I)I

    .line 1203
    .line 1204
    .line 1205
    move-result v6

    .line 1206
    invoke-static {v4, v5, v6}, Lcom/xuexiang/xui/utils/g;->p(Landroid/content/Context;II)I

    .line 1207
    .line 1208
    .line 1209
    move-result v4

    .line 1210
    iget-object v0, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a:Landroid/content/Context;

    .line 1211
    .line 1212
    sget v5, Lcom/xuexiang/xui/R$attr;->md_dialog_max_width:I

    .line 1213
    .line 1214
    invoke-static {v0, v5}, Lcom/xuexiang/xui/utils/g;->o(Landroid/content/Context;I)I

    .line 1215
    .line 1216
    .line 1217
    move-result v0

    .line 1218
    mul-int/lit8 v4, v4, 0x2

    .line 1219
    .line 1220
    sub-int/2addr v1, v4

    .line 1221
    iget-object v4, p0, Ly1/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 1222
    .line 1223
    mul-int/lit8 v3, v3, 0x2

    .line 1224
    .line 1225
    sub-int/2addr v2, v3

    .line 1226
    invoke-virtual {v4, v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->setMaxHeight(I)V

    .line 1227
    .line 1228
    .line 1229
    new-instance v2, Landroid/view/WindowManager$LayoutParams;

    .line 1230
    .line 1231
    invoke-direct {v2}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 1232
    .line 1233
    .line 1234
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 1235
    .line 1236
    .line 1237
    move-result-object v3

    .line 1238
    invoke-virtual {v3}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v3

    .line 1242
    invoke-virtual {v2, v3}, Landroid/view/WindowManager$LayoutParams;->copyFrom(Landroid/view/WindowManager$LayoutParams;)I

    .line 1243
    .line 1244
    .line 1245
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 1246
    .line 1247
    .line 1248
    move-result v0

    .line 1249
    iput v0, v2, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 1250
    .line 1251
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 1252
    .line 1253
    .line 1254
    move-result-object p0

    .line 1255
    invoke-virtual {p0, v2}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 1256
    .line 1257
    .line 1258
    return-void
.end method

.method public static e(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 2
    .line 3
    iget-object v1, p0, Ly1/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 4
    .line 5
    const v2, 0x1020009

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Landroid/widget/EditText;

    .line 13
    .line 14
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->h:Landroid/widget/EditText;

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->O:Landroid/graphics/Typeface;

    .line 20
    .line 21
    invoke-virtual {p0, v1, v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->u(Landroid/widget/TextView;Landroid/graphics/Typeface;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->i0:Ljava/lang/CharSequence;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->h:Landroid/widget/EditText;

    .line 29
    .line 30
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->s()V

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->h:Landroid/widget/EditText;

    .line 37
    .line 38
    iget-object v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->j0:Ljava/lang/CharSequence;

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 41
    .line 42
    .line 43
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->h:Landroid/widget/EditText;

    .line 44
    .line 45
    invoke-virtual {v1}, Landroid/widget/TextView;->setSingleLine()V

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->h:Landroid/widget/EditText;

    .line 49
    .line 50
    iget v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->j:I

    .line 51
    .line 52
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->h:Landroid/widget/EditText;

    .line 56
    .line 57
    iget v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->j:I

    .line 58
    .line 59
    const v3, 0x3e99999a    # 0.3f

    .line 60
    .line 61
    .line 62
    invoke-static {v2, v3}, Lcom/xuexiang/xui/utils/g;->a(IF)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setHintTextColor(I)V

    .line 67
    .line 68
    .line 69
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->h:Landroid/widget/EditText;

    .line 70
    .line 71
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 72
    .line 73
    iget v2, v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t:I

    .line 74
    .line 75
    invoke-static {v1, v2}, Lz1/b;->e(Landroid/widget/EditText;I)V

    .line 76
    .line 77
    .line 78
    iget v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->m0:I

    .line 79
    .line 80
    const/4 v2, -0x1

    .line 81
    if-eq v1, v2, :cond_2

    .line 82
    .line 83
    iget-object v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->h:Landroid/widget/EditText;

    .line 84
    .line 85
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setInputType(I)V

    .line 86
    .line 87
    .line 88
    iget v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->m0:I

    .line 89
    .line 90
    const/16 v3, 0x90

    .line 91
    .line 92
    if-eq v1, v3, :cond_2

    .line 93
    .line 94
    const/16 v3, 0x80

    .line 95
    .line 96
    and-int/2addr v1, v3

    .line 97
    if-ne v1, v3, :cond_2

    .line 98
    .line 99
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->h:Landroid/widget/EditText;

    .line 100
    .line 101
    invoke-static {}, Landroid/text/method/PasswordTransformationMethod;->getInstance()Landroid/text/method/PasswordTransformationMethod;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 106
    .line 107
    .line 108
    :cond_2
    iget-object v1, p0, Ly1/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 109
    .line 110
    sget v3, Lcom/xuexiang/xui/R$id;->md_minMax:I

    .line 111
    .line 112
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    check-cast v1, Landroid/widget/TextView;

    .line 117
    .line 118
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->o:Landroid/widget/TextView;

    .line 119
    .line 120
    iget v3, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->o0:I

    .line 121
    .line 122
    if-gtz v3, :cond_4

    .line 123
    .line 124
    iget v3, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->p0:I

    .line 125
    .line 126
    if-le v3, v2, :cond_3

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_3
    const/16 v0, 0x8

    .line 130
    .line 131
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 132
    .line 133
    .line 134
    const/4 v0, 0x0

    .line 135
    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->o:Landroid/widget/TextView;

    .line 136
    .line 137
    return-void

    .line 138
    :cond_4
    :goto_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->h:Landroid/widget/EditText;

    .line 139
    .line 140
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    iget-boolean v0, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->l0:Z

    .line 153
    .line 154
    xor-int/lit8 v0, v0, 0x1

    .line 155
    .line 156
    invoke-virtual {p0, v1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->o(IZ)V

    .line 157
    .line 158
    .line 159
    return-void
.end method

.method public static f(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->e0:Z

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->g0:I

    .line 8
    .line 9
    const/4 v2, -0x2

    .line 10
    if-le v1, v2, :cond_9

    .line 11
    .line 12
    :cond_0
    iget-object v1, p0, Ly1/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 13
    .line 14
    const v2, 0x102000d

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Landroid/widget/ProgressBar;

    .line 22
    .line 23
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->l:Landroid/widget/ProgressBar;

    .line 24
    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    goto/16 :goto_3

    .line 28
    .line 29
    :cond_1
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->e0:Z

    .line 30
    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->x0:Z

    .line 34
    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    new-instance v1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;

    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->m()Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-direct {v1, v2}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;-><init>(Landroid/content/Context;)V

    .line 44
    .line 45
    .line 46
    iget v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t:I

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;->setTint(I)V

    .line 49
    .line 50
    .line 51
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->l:Landroid/widget/ProgressBar;

    .line 52
    .line 53
    invoke-virtual {v2, v1}, Landroid/widget/ProgressBar;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 54
    .line 55
    .line 56
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->l:Landroid/widget/ProgressBar;

    .line 57
    .line 58
    invoke-virtual {v2, v1}, Landroid/widget/ProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    new-instance v1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;

    .line 63
    .line 64
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->m()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-direct {v1, v2}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;-><init>(Landroid/content/Context;)V

    .line 69
    .line 70
    .line 71
    iget v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t:I

    .line 72
    .line 73
    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;->setTint(I)V

    .line 74
    .line 75
    .line 76
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->l:Landroid/widget/ProgressBar;

    .line 77
    .line 78
    invoke-virtual {v2, v1}, Landroid/widget/ProgressBar;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 79
    .line 80
    .line 81
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->l:Landroid/widget/ProgressBar;

    .line 82
    .line 83
    invoke-virtual {v2, v1}, Landroid/widget/ProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_3
    new-instance v1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/l;

    .line 88
    .line 89
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->m()Landroid/content/Context;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-direct {v1, v2}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/l;-><init>(Landroid/content/Context;)V

    .line 94
    .line 95
    .line 96
    iget v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t:I

    .line 97
    .line 98
    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/l;->setTint(I)V

    .line 99
    .line 100
    .line 101
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->l:Landroid/widget/ProgressBar;

    .line 102
    .line 103
    invoke-virtual {v2, v1}, Landroid/widget/ProgressBar;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 104
    .line 105
    .line 106
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->l:Landroid/widget/ProgressBar;

    .line 107
    .line 108
    invoke-virtual {v2, v1}, Landroid/widget/ProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 109
    .line 110
    .line 111
    :goto_0
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->e0:Z

    .line 112
    .line 113
    if-eqz v1, :cond_4

    .line 114
    .line 115
    iget-boolean v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->x0:Z

    .line 116
    .line 117
    if-eqz v2, :cond_9

    .line 118
    .line 119
    :cond_4
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->l:Landroid/widget/ProgressBar;

    .line 120
    .line 121
    const/4 v3, 0x0

    .line 122
    if-eqz v1, :cond_5

    .line 123
    .line 124
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->x0:Z

    .line 125
    .line 126
    if-eqz v1, :cond_5

    .line 127
    .line 128
    const/4 v1, 0x1

    .line 129
    goto :goto_1

    .line 130
    :cond_5
    move v1, v3

    .line 131
    :goto_1
    invoke-virtual {v2, v1}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    .line 132
    .line 133
    .line 134
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->l:Landroid/widget/ProgressBar;

    .line 135
    .line 136
    invoke-virtual {v1, v3}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 137
    .line 138
    .line 139
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->l:Landroid/widget/ProgressBar;

    .line 140
    .line 141
    iget v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->h0:I

    .line 142
    .line 143
    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 144
    .line 145
    .line 146
    iget-object v1, p0, Ly1/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 147
    .line 148
    sget v2, Lcom/xuexiang/xui/R$id;->md_label:I

    .line 149
    .line 150
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    check-cast v1, Landroid/widget/TextView;

    .line 155
    .line 156
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->m:Landroid/widget/TextView;

    .line 157
    .line 158
    if-eqz v1, :cond_6

    .line 159
    .line 160
    iget-object v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->P:Landroid/graphics/Typeface;

    .line 161
    .line 162
    invoke-virtual {p0, v1, v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->u(Landroid/widget/TextView;Landroid/graphics/Typeface;)V

    .line 163
    .line 164
    .line 165
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->m:Landroid/widget/TextView;

    .line 166
    .line 167
    iget-object v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->w0:Ljava/text/NumberFormat;

    .line 168
    .line 169
    const-wide/16 v4, 0x0

    .line 170
    .line 171
    invoke-virtual {v2, v4, v5}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 176
    .line 177
    .line 178
    :cond_6
    iget-object v1, p0, Ly1/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 179
    .line 180
    sget v2, Lcom/xuexiang/xui/R$id;->md_minMax:I

    .line 181
    .line 182
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    check-cast v1, Landroid/widget/TextView;

    .line 187
    .line 188
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->n:Landroid/widget/TextView;

    .line 189
    .line 190
    if-eqz v1, :cond_8

    .line 191
    .line 192
    iget-object v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->O:Landroid/graphics/Typeface;

    .line 193
    .line 194
    invoke-virtual {p0, v1, v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->u(Landroid/widget/TextView;Landroid/graphics/Typeface;)V

    .line 195
    .line 196
    .line 197
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->f0:Z

    .line 198
    .line 199
    if-eqz v1, :cond_7

    .line 200
    .line 201
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->n:Landroid/widget/TextView;

    .line 202
    .line 203
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 204
    .line 205
    .line 206
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->n:Landroid/widget/TextView;

    .line 207
    .line 208
    iget-object v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->v0:Ljava/lang/String;

    .line 209
    .line 210
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 211
    .line 212
    .line 213
    move-result-object v4

    .line 214
    iget v0, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->h0:I

    .line 215
    .line 216
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    filled-new-array {v4, v0}, [Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 229
    .line 230
    .line 231
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->l:Landroid/widget/ProgressBar;

    .line 232
    .line 233
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 238
    .line 239
    iput v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 240
    .line 241
    iput v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 242
    .line 243
    goto :goto_2

    .line 244
    :cond_7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->n:Landroid/widget/TextView;

    .line 245
    .line 246
    const/16 v1, 0x8

    .line 247
    .line 248
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 249
    .line 250
    .line 251
    goto :goto_2

    .line 252
    :cond_8
    iput-boolean v3, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->f0:Z

    .line 253
    .line 254
    :cond_9
    :goto_2
    iget-object p0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->l:Landroid/widget/ProgressBar;

    .line 255
    .line 256
    if-eqz p0, :cond_a

    .line 257
    .line 258
    invoke-static {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/b;->a(Landroid/widget/ProgressBar;)V

    .line 259
    .line 260
    .line 261
    :cond_a
    :goto_3
    return-void
.end method
