.class public abstract Lcom/xuexiang/xui/widget/dialog/materialdialog/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/widget/ProgressBar;)V
    .locals 0

    .line 1
    return-void
.end method

.method public static b(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->s:Landroid/view/View;

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->l:Ljava/util/ArrayList;

    .line 9
    .line 10
    if-nez v0, :cond_6

    .line 11
    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->P:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    iget v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->c0:I

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
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->a0:Z

    .line 26
    .line 27
    if-eqz v0, :cond_4

    .line 28
    .line 29
    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->s0:Z

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
    iget-object p0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->n0:Ljava/lang/CharSequence;

    .line 40
    .line 41
    if-eqz p0, :cond_5

    .line 42
    .line 43
    sget p0, Lcom/xuexiang/xui/R$layout;->xmd_layout_dialog_basic_check:I

    .line 44
    .line 45
    return p0

    .line 46
    :cond_5
    sget p0, Lcom/xuexiang/xui/R$layout;->xmd_layout_dialog_basic:I

    .line 47
    .line 48
    return p0

    .line 49
    :cond_6
    :goto_0
    iget-object p0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->n0:Ljava/lang/CharSequence;

    .line 50
    .line 51
    if-eqz p0, :cond_7

    .line 52
    .line 53
    sget p0, Lcom/xuexiang/xui/R$layout;->xmd_layout_dialog_list_check:I

    .line 54
    .line 55
    return p0

    .line 56
    :cond_7
    sget p0, Lcom/xuexiang/xui/R$layout;->xmd_layout_dialog_list:I

    .line 57
    .line 58
    return p0
.end method

.method public static c(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;)I
    .locals 4

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->C:I

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->a:Landroid/content/Context;

    .line 8
    .line 9
    sget v1, Lcom/xuexiang/xui/R$attr;->md_dark_theme:I

    .line 10
    .line 11
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->B:Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;

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
    iput-object v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->B:Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->D:Z

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->E:Z

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 11
    .line 12
    .line 13
    iget v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->Y:I

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->a:Landroid/content/Context;

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
    iput v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->Y:I

    .line 36
    .line 37
    :cond_0
    iget v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->Y:I

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
    iget-object v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->a:Landroid/content/Context;

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
    iget v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->Y:I

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
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->w0:Z

    .line 74
    .line 75
    if-nez v1, :cond_2

    .line 76
    .line 77
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->a:Landroid/content/Context;

    .line 78
    .line 79
    sget v2, Lcom/xuexiang/xui/R$attr;->md_positive_color:I

    .line 80
    .line 81
    iget-object v3, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->v:Landroid/content/res/ColorStateList;

    .line 82
    .line 83
    invoke-static {v1, v2, v3}, Lcom/xuexiang/xui/utils/g;->j(Landroid/content/Context;ILandroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    iput-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->v:Landroid/content/res/ColorStateList;

    .line 88
    .line 89
    :cond_2
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->x0:Z

    .line 90
    .line 91
    if-nez v1, :cond_3

    .line 92
    .line 93
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->a:Landroid/content/Context;

    .line 94
    .line 95
    sget v2, Lcom/xuexiang/xui/R$attr;->md_neutral_color:I

    .line 96
    .line 97
    iget-object v3, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->x:Landroid/content/res/ColorStateList;

    .line 98
    .line 99
    invoke-static {v1, v2, v3}, Lcom/xuexiang/xui/utils/g;->j(Landroid/content/Context;ILandroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    iput-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->x:Landroid/content/res/ColorStateList;

    .line 104
    .line 105
    :cond_3
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->y0:Z

    .line 106
    .line 107
    if-nez v1, :cond_4

    .line 108
    .line 109
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->a:Landroid/content/Context;

    .line 110
    .line 111
    sget v2, Lcom/xuexiang/xui/R$attr;->md_negative_color:I

    .line 112
    .line 113
    iget-object v3, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->w:Landroid/content/res/ColorStateList;

    .line 114
    .line 115
    invoke-static {v1, v2, v3}, Lcom/xuexiang/xui/utils/g;->j(Landroid/content/Context;ILandroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    iput-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->w:Landroid/content/res/ColorStateList;

    .line 120
    .line 121
    :cond_4
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->z0:Z

    .line 122
    .line 123
    if-nez v1, :cond_5

    .line 124
    .line 125
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->a:Landroid/content/Context;

    .line 126
    .line 127
    sget v2, Lcom/xuexiang/xui/R$attr;->md_widget_color:I

    .line 128
    .line 129
    iget v3, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->t:I

    .line 130
    .line 131
    invoke-static {v1, v2, v3}, Lcom/xuexiang/xui/utils/g;->n(Landroid/content/Context;II)I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    iput v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->t:I

    .line 136
    .line 137
    :cond_5
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->t0:Z

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
    iget-object v3, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->a:Landroid/content/Context;

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
    iput v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->i:I

    .line 161
    .line 162
    :cond_6
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->u0:Z

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
    iget-object v3, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->a:Landroid/content/Context;

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
    iput v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->j:I

    .line 186
    .line 187
    :cond_7
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->v0:Z

    .line 188
    .line 189
    if-nez v1, :cond_8

    .line 190
    .line 191
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->a:Landroid/content/Context;

    .line 192
    .line 193
    sget v3, Lcom/xuexiang/xui/R$attr;->md_item_color:I

    .line 194
    .line 195
    iget v4, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->j:I

    .line 196
    .line 197
    invoke-static {v1, v3, v4}, Lcom/xuexiang/xui/utils/g;->n(Landroid/content/Context;II)I

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    iput v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->Z:I

    .line 202
    .line 203
    :cond_8
    iget-object v1, p0, Lz2/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

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
    iget-object v1, p0, Lz2/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

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
    iget-object v1, p0, Lz2/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

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
    iget-object v1, p0, Lz2/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

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
    iget-object v1, p0, Lz2/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

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
    iget-object v1, p0, Lz2/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

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
    iget-object v1, p0, Lz2/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

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
    iget-object v1, p0, Lz2/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

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
    iget-object v1, p0, Lz2/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

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
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->q:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 310
    .line 311
    iget-object v3, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->m:Ljava/lang/CharSequence;

    .line 312
    .line 313
    const/16 v4, 0x8

    .line 314
    .line 315
    const/4 v5, 0x0

    .line 316
    if-eqz v3, :cond_9

    .line 317
    .line 318
    move v3, v5

    .line 319
    goto :goto_0

    .line 320
    :cond_9
    move v3, v4

    .line 321
    :goto_0
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 322
    .line 323
    .line 324
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->r:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 325
    .line 326
    iget-object v3, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->n:Ljava/lang/CharSequence;

    .line 327
    .line 328
    if-eqz v3, :cond_a

    .line 329
    .line 330
    move v3, v5

    .line 331
    goto :goto_1

    .line 332
    :cond_a
    move v3, v4

    .line 333
    :goto_1
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 334
    .line 335
    .line 336
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->s:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 337
    .line 338
    iget-object v3, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->o:Ljava/lang/CharSequence;

    .line 339
    .line 340
    if-eqz v3, :cond_b

    .line 341
    .line 342
    move v3, v5

    .line 343
    goto :goto_2

    .line 344
    :cond_b
    move v3, v4

    .line 345
    :goto_2
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 346
    .line 347
    .line 348
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->q:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 349
    .line 350
    const/4 v3, 0x1

    .line 351
    invoke-virtual {v1, v3}, Landroid/view/View;->setFocusable(Z)V

    .line 352
    .line 353
    .line 354
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->r:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 355
    .line 356
    invoke-virtual {v1, v3}, Landroid/view/View;->setFocusable(Z)V

    .line 357
    .line 358
    .line 359
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->s:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 360
    .line 361
    invoke-virtual {v1, v3}, Landroid/view/View;->setFocusable(Z)V

    .line 362
    .line 363
    .line 364
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->p:Z

    .line 365
    .line 366
    if-eqz v1, :cond_c

    .line 367
    .line 368
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->q:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 369
    .line 370
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 371
    .line 372
    .line 373
    :cond_c
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->q:Z

    .line 374
    .line 375
    if-eqz v1, :cond_d

    .line 376
    .line 377
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->r:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 378
    .line 379
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 380
    .line 381
    .line 382
    :cond_d
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->r:Z

    .line 383
    .line 384
    if-eqz v1, :cond_e

    .line 385
    .line 386
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->s:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 387
    .line 388
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 389
    .line 390
    .line 391
    :cond_e
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->M:Landroid/graphics/drawable/Drawable;

    .line 392
    .line 393
    if-eqz v1, :cond_f

    .line 394
    .line 395
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->e:Landroid/widget/ImageView;

    .line 396
    .line 397
    invoke-virtual {v1, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 398
    .line 399
    .line 400
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->e:Landroid/widget/ImageView;

    .line 401
    .line 402
    iget-object v6, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->M:Landroid/graphics/drawable/Drawable;

    .line 403
    .line 404
    invoke-virtual {v1, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 405
    .line 406
    .line 407
    goto :goto_3

    .line 408
    :cond_f
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->a:Landroid/content/Context;

    .line 409
    .line 410
    sget v6, Lcom/xuexiang/xui/R$attr;->md_icon:I

    .line 411
    .line 412
    invoke-static {v1, v6}, Lcom/xuexiang/xui/utils/g;->q(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 413
    .line 414
    .line 415
    move-result-object v1

    .line 416
    if-eqz v1, :cond_10

    .line 417
    .line 418
    iget-object v6, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->e:Landroid/widget/ImageView;

    .line 419
    .line 420
    invoke-virtual {v6, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 421
    .line 422
    .line 423
    iget-object v6, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->e:Landroid/widget/ImageView;

    .line 424
    .line 425
    invoke-virtual {v6, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 426
    .line 427
    .line 428
    goto :goto_3

    .line 429
    :cond_10
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->e:Landroid/widget/ImageView;

    .line 430
    .line 431
    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 432
    .line 433
    .line 434
    :goto_3
    iget v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->O:I

    .line 435
    .line 436
    const/4 v6, -0x1

    .line 437
    if-ne v1, v6, :cond_11

    .line 438
    .line 439
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->a:Landroid/content/Context;

    .line 440
    .line 441
    sget v7, Lcom/xuexiang/xui/R$attr;->md_icon_max_size:I

    .line 442
    .line 443
    invoke-static {v1, v7}, Lcom/xuexiang/xui/utils/g;->o(Landroid/content/Context;I)I

    .line 444
    .line 445
    .line 446
    move-result v1

    .line 447
    :cond_11
    iget-boolean v7, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->N:Z

    .line 448
    .line 449
    if-nez v7, :cond_12

    .line 450
    .line 451
    iget-object v7, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->a:Landroid/content/Context;

    .line 452
    .line 453
    sget v8, Lcom/xuexiang/xui/R$attr;->md_icon_limit_icon_to_default_size:I

    .line 454
    .line 455
    invoke-static {v7, v8}, Lcom/xuexiang/xui/utils/g;->k(Landroid/content/Context;I)Z

    .line 456
    .line 457
    .line 458
    move-result v7

    .line 459
    if-eqz v7, :cond_13

    .line 460
    .line 461
    :cond_12
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->a:Landroid/content/Context;

    .line 462
    .line 463
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 464
    .line 465
    .line 466
    move-result-object v1

    .line 467
    sget v7, Lcom/xuexiang/xui/R$dimen;->default_md_icon_max_size:I

    .line 468
    .line 469
    invoke-virtual {v1, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 470
    .line 471
    .line 472
    move-result v1

    .line 473
    :cond_13
    if-le v1, v6, :cond_14

    .line 474
    .line 475
    iget-object v7, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->e:Landroid/widget/ImageView;

    .line 476
    .line 477
    invoke-virtual {v7, v3}, Landroid/widget/ImageView;->setAdjustViewBounds(Z)V

    .line 478
    .line 479
    .line 480
    iget-object v7, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->e:Landroid/widget/ImageView;

    .line 481
    .line 482
    invoke-virtual {v7, v1}, Landroid/widget/ImageView;->setMaxHeight(I)V

    .line 483
    .line 484
    .line 485
    iget-object v7, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->e:Landroid/widget/ImageView;

    .line 486
    .line 487
    invoke-virtual {v7, v1}, Landroid/widget/ImageView;->setMaxWidth(I)V

    .line 488
    .line 489
    .line 490
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->e:Landroid/widget/ImageView;

    .line 491
    .line 492
    invoke-virtual {v1}, Landroid/view/View;->requestLayout()V

    .line 493
    .line 494
    .line 495
    :cond_14
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->A0:Z

    .line 496
    .line 497
    if-nez v1, :cond_15

    .line 498
    .line 499
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 500
    .line 501
    .line 502
    move-result-object v1

    .line 503
    sget v7, Lcom/xuexiang/xui/R$attr;->md_divider:I

    .line 504
    .line 505
    invoke-static {v1, v7}, Lcom/xuexiang/xui/utils/g;->m(Landroid/content/Context;I)I

    .line 506
    .line 507
    .line 508
    move-result v1

    .line 509
    iget-object v7, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->a:Landroid/content/Context;

    .line 510
    .line 511
    sget v8, Lcom/xuexiang/xui/R$attr;->md_divider_color:I

    .line 512
    .line 513
    invoke-static {v7, v8, v1}, Lcom/xuexiang/xui/utils/g;->n(Landroid/content/Context;II)I

    .line 514
    .line 515
    .line 516
    move-result v1

    .line 517
    iput v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->X:I

    .line 518
    .line 519
    :cond_15
    iget-object v1, p0, Lz2/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 520
    .line 521
    iget v7, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->X:I

    .line 522
    .line 523
    invoke-virtual {v1, v7}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->setDividerColor(I)V

    .line 524
    .line 525
    .line 526
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->f:Landroid/widget/TextView;

    .line 527
    .line 528
    if-eqz v1, :cond_17

    .line 529
    .line 530
    iget-object v7, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->L:Landroid/graphics/Typeface;

    .line 531
    .line 532
    invoke-virtual {p0, v1, v7}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->r(Landroid/widget/TextView;Landroid/graphics/Typeface;)V

    .line 533
    .line 534
    .line 535
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->f:Landroid/widget/TextView;

    .line 536
    .line 537
    iget v7, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->i:I

    .line 538
    .line 539
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 540
    .line 541
    .line 542
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->f:Landroid/widget/TextView;

    .line 543
    .line 544
    iget-object v7, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 545
    .line 546
    invoke-virtual {v7}, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->a()I

    .line 547
    .line 548
    .line 549
    move-result v7

    .line 550
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setGravity(I)V

    .line 551
    .line 552
    .line 553
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->f:Landroid/widget/TextView;

    .line 554
    .line 555
    iget-object v7, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 556
    .line 557
    invoke-virtual {v7}, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->f()I

    .line 558
    .line 559
    .line 560
    move-result v7

    .line 561
    invoke-virtual {v1, v7}, Landroid/view/View;->setTextAlignment(I)V

    .line 562
    .line 563
    .line 564
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->b:Ljava/lang/CharSequence;

    .line 565
    .line 566
    if-nez v1, :cond_16

    .line 567
    .line 568
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->j:Landroid/view/View;

    .line 569
    .line 570
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 571
    .line 572
    .line 573
    goto :goto_4

    .line 574
    :cond_16
    iget-object v7, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->f:Landroid/widget/TextView;

    .line 575
    .line 576
    invoke-virtual {v7, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 577
    .line 578
    .line 579
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->j:Landroid/view/View;

    .line 580
    .line 581
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 582
    .line 583
    .line 584
    :cond_17
    :goto_4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->g:Landroid/widget/TextView;

    .line 585
    .line 586
    if-eqz v1, :cond_1a

    .line 587
    .line 588
    new-instance v7, Landroid/text/method/LinkMovementMethod;

    .line 589
    .line 590
    invoke-direct {v7}, Landroid/text/method/LinkMovementMethod;-><init>()V

    .line 591
    .line 592
    .line 593
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 594
    .line 595
    .line 596
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->g:Landroid/widget/TextView;

    .line 597
    .line 598
    iget-object v7, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->K:Landroid/graphics/Typeface;

    .line 599
    .line 600
    invoke-virtual {p0, v1, v7}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->r(Landroid/widget/TextView;Landroid/graphics/Typeface;)V

    .line 601
    .line 602
    .line 603
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->g:Landroid/widget/TextView;

    .line 604
    .line 605
    const/4 v7, 0x0

    .line 606
    iget v8, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->F:F

    .line 607
    .line 608
    invoke-virtual {v1, v7, v8}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 609
    .line 610
    .line 611
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->y:Landroid/content/res/ColorStateList;

    .line 612
    .line 613
    if-nez v1, :cond_18

    .line 614
    .line 615
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->g:Landroid/widget/TextView;

    .line 616
    .line 617
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 618
    .line 619
    .line 620
    move-result-object v7

    .line 621
    invoke-static {v7, v2}, Lcom/xuexiang/xui/utils/g;->m(Landroid/content/Context;I)I

    .line 622
    .line 623
    .line 624
    move-result v2

    .line 625
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setLinkTextColor(I)V

    .line 626
    .line 627
    .line 628
    goto :goto_5

    .line 629
    :cond_18
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->g:Landroid/widget/TextView;

    .line 630
    .line 631
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setLinkTextColor(Landroid/content/res/ColorStateList;)V

    .line 632
    .line 633
    .line 634
    :goto_5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->g:Landroid/widget/TextView;

    .line 635
    .line 636
    iget v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->j:I

    .line 637
    .line 638
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 639
    .line 640
    .line 641
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->g:Landroid/widget/TextView;

    .line 642
    .line 643
    iget-object v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->d:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 644
    .line 645
    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->a()I

    .line 646
    .line 647
    .line 648
    move-result v2

    .line 649
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 650
    .line 651
    .line 652
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->g:Landroid/widget/TextView;

    .line 653
    .line 654
    iget-object v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->d:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 655
    .line 656
    invoke-virtual {v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->f()I

    .line 657
    .line 658
    .line 659
    move-result v2

    .line 660
    invoke-virtual {v1, v2}, Landroid/view/View;->setTextAlignment(I)V

    .line 661
    .line 662
    .line 663
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->k:Ljava/lang/CharSequence;

    .line 664
    .line 665
    if-eqz v1, :cond_19

    .line 666
    .line 667
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->g:Landroid/widget/TextView;

    .line 668
    .line 669
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 670
    .line 671
    .line 672
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->g:Landroid/widget/TextView;

    .line 673
    .line 674
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 675
    .line 676
    .line 677
    goto :goto_6

    .line 678
    :cond_19
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->g:Landroid/widget/TextView;

    .line 679
    .line 680
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 681
    .line 682
    .line 683
    :cond_1a
    :goto_6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->p:Landroid/widget/CheckBox;

    .line 684
    .line 685
    if-eqz v1, :cond_1b

    .line 686
    .line 687
    iget-object v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->n0:Ljava/lang/CharSequence;

    .line 688
    .line 689
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 690
    .line 691
    .line 692
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->p:Landroid/widget/CheckBox;

    .line 693
    .line 694
    iget-boolean v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->o0:Z

    .line 695
    .line 696
    invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 697
    .line 698
    .line 699
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->p:Landroid/widget/CheckBox;

    .line 700
    .line 701
    iget-object v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->p0:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 702
    .line 703
    invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 704
    .line 705
    .line 706
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->p:Landroid/widget/CheckBox;

    .line 707
    .line 708
    iget-object v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->K:Landroid/graphics/Typeface;

    .line 709
    .line 710
    invoke-virtual {p0, v1, v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->r(Landroid/widget/TextView;Landroid/graphics/Typeface;)V

    .line 711
    .line 712
    .line 713
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->p:Landroid/widget/CheckBox;

    .line 714
    .line 715
    iget v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->j:I

    .line 716
    .line 717
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 718
    .line 719
    .line 720
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->p:Landroid/widget/CheckBox;

    .line 721
    .line 722
    iget v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->t:I

    .line 723
    .line 724
    invoke-static {v1, v2}, La3/b;->c(Landroid/widget/CheckBox;I)V

    .line 725
    .line 726
    .line 727
    :cond_1b
    iget-object v1, p0, Lz2/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 728
    .line 729
    iget-object v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->g:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 730
    .line 731
    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->setButtonGravity(Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;)V

    .line 732
    .line 733
    .line 734
    iget-object v1, p0, Lz2/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 735
    .line 736
    iget-object v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->e:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 737
    .line 738
    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->setButtonStackedGravity(Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;)V

    .line 739
    .line 740
    .line 741
    iget-object v1, p0, Lz2/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 742
    .line 743
    iget-object v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->V:Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;

    .line 744
    .line 745
    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->setStackingBehavior(Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;)V

    .line 746
    .line 747
    .line 748
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->a:Landroid/content/Context;

    .line 749
    .line 750
    const v2, 0x101038c

    .line 751
    .line 752
    .line 753
    invoke-static {v1, v2, v3}, Lcom/xuexiang/xui/utils/g;->l(Landroid/content/Context;IZ)Z

    .line 754
    .line 755
    .line 756
    move-result v1

    .line 757
    if-eqz v1, :cond_1c

    .line 758
    .line 759
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->a:Landroid/content/Context;

    .line 760
    .line 761
    sget v2, Lcom/xuexiang/xui/R$attr;->textAllCaps:I

    .line 762
    .line 763
    invoke-static {v1, v2, v3}, Lcom/xuexiang/xui/utils/g;->l(Landroid/content/Context;IZ)Z

    .line 764
    .line 765
    .line 766
    move-result v1

    .line 767
    :cond_1c
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->q:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 768
    .line 769
    iget-object v4, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->L:Landroid/graphics/Typeface;

    .line 770
    .line 771
    invoke-virtual {p0, v2, v4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->r(Landroid/widget/TextView;Landroid/graphics/Typeface;)V

    .line 772
    .line 773
    .line 774
    invoke-virtual {v2, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->setAllCapsCompat(Z)V

    .line 775
    .line 776
    .line 777
    iget-object v4, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->m:Ljava/lang/CharSequence;

    .line 778
    .line 779
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 780
    .line 781
    .line 782
    iget-object v4, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->v:Landroid/content/res/ColorStateList;

    .line 783
    .line 784
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 785
    .line 786
    .line 787
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->q:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 788
    .line 789
    sget-object v4, Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;

    .line 790
    .line 791
    invoke-virtual {p0, v4, v3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->h(Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;Z)Landroid/graphics/drawable/Drawable;

    .line 792
    .line 793
    .line 794
    move-result-object v7

    .line 795
    invoke-virtual {v2, v7}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->setStackedSelector(Landroid/graphics/drawable/Drawable;)V

    .line 796
    .line 797
    .line 798
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->q:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 799
    .line 800
    invoke-virtual {p0, v4, v5}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->h(Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;Z)Landroid/graphics/drawable/Drawable;

    .line 801
    .line 802
    .line 803
    move-result-object v7

    .line 804
    invoke-virtual {v2, v7}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->setDefaultSelector(Landroid/graphics/drawable/Drawable;)V

    .line 805
    .line 806
    .line 807
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->q:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 808
    .line 809
    invoke-virtual {v2, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 810
    .line 811
    .line 812
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->q:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 813
    .line 814
    invoke-virtual {v2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 815
    .line 816
    .line 817
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->q:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 818
    .line 819
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 820
    .line 821
    .line 822
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->s:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 823
    .line 824
    iget-object v4, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->L:Landroid/graphics/Typeface;

    .line 825
    .line 826
    invoke-virtual {p0, v2, v4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->r(Landroid/widget/TextView;Landroid/graphics/Typeface;)V

    .line 827
    .line 828
    .line 829
    invoke-virtual {v2, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->setAllCapsCompat(Z)V

    .line 830
    .line 831
    .line 832
    iget-object v4, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->o:Ljava/lang/CharSequence;

    .line 833
    .line 834
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 835
    .line 836
    .line 837
    iget-object v4, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->w:Landroid/content/res/ColorStateList;

    .line 838
    .line 839
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 840
    .line 841
    .line 842
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->s:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 843
    .line 844
    sget-object v4, Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;

    .line 845
    .line 846
    invoke-virtual {p0, v4, v3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->h(Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;Z)Landroid/graphics/drawable/Drawable;

    .line 847
    .line 848
    .line 849
    move-result-object v7

    .line 850
    invoke-virtual {v2, v7}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->setStackedSelector(Landroid/graphics/drawable/Drawable;)V

    .line 851
    .line 852
    .line 853
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->s:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 854
    .line 855
    invoke-virtual {p0, v4, v5}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->h(Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;Z)Landroid/graphics/drawable/Drawable;

    .line 856
    .line 857
    .line 858
    move-result-object v7

    .line 859
    invoke-virtual {v2, v7}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->setDefaultSelector(Landroid/graphics/drawable/Drawable;)V

    .line 860
    .line 861
    .line 862
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->s:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 863
    .line 864
    invoke-virtual {v2, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 865
    .line 866
    .line 867
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->s:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 868
    .line 869
    invoke-virtual {v2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 870
    .line 871
    .line 872
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->s:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 873
    .line 874
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 875
    .line 876
    .line 877
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->r:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 878
    .line 879
    iget-object v4, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->L:Landroid/graphics/Typeface;

    .line 880
    .line 881
    invoke-virtual {p0, v2, v4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->r(Landroid/widget/TextView;Landroid/graphics/Typeface;)V

    .line 882
    .line 883
    .line 884
    invoke-virtual {v2, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->setAllCapsCompat(Z)V

    .line 885
    .line 886
    .line 887
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->n:Ljava/lang/CharSequence;

    .line 888
    .line 889
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 890
    .line 891
    .line 892
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->x:Landroid/content/res/ColorStateList;

    .line 893
    .line 894
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 895
    .line 896
    .line 897
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->r:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 898
    .line 899
    sget-object v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;->b:Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;

    .line 900
    .line 901
    invoke-virtual {p0, v2, v3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->h(Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;Z)Landroid/graphics/drawable/Drawable;

    .line 902
    .line 903
    .line 904
    move-result-object v3

    .line 905
    invoke-virtual {v1, v3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->setStackedSelector(Landroid/graphics/drawable/Drawable;)V

    .line 906
    .line 907
    .line 908
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->r:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 909
    .line 910
    invoke-virtual {p0, v2, v5}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->h(Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;Z)Landroid/graphics/drawable/Drawable;

    .line 911
    .line 912
    .line 913
    move-result-object v3

    .line 914
    invoke-virtual {v1, v3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;->setDefaultSelector(Landroid/graphics/drawable/Drawable;)V

    .line 915
    .line 916
    .line 917
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->r:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 918
    .line 919
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 920
    .line 921
    .line 922
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->r:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 923
    .line 924
    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 925
    .line 926
    .line 927
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->r:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDButton;

    .line 928
    .line 929
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 930
    .line 931
    .line 932
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 933
    .line 934
    if-eqz v1, :cond_1e

    .line 935
    .line 936
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->P:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 937
    .line 938
    if-nez v1, :cond_1d

    .line 939
    .line 940
    sget-object v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$ListType;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$ListType;

    .line 941
    .line 942
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->t:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$ListType;

    .line 943
    .line 944
    new-instance v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;

    .line 945
    .line 946
    invoke-static {v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$ListType;->a(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$ListType;)I

    .line 947
    .line 948
    .line 949
    move-result v1

    .line 950
    invoke-direct {v2, p0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;-><init>(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;I)V

    .line 951
    .line 952
    .line 953
    iput-object v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->P:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 954
    .line 955
    goto :goto_7

    .line 956
    :cond_1d
    instance-of v2, v1, La3/a;

    .line 957
    .line 958
    if-eqz v2, :cond_1e

    .line 959
    .line 960
    check-cast v1, La3/a;

    .line 961
    .line 962
    invoke-interface {v1, p0}, La3/a;->a(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;)V

    .line 963
    .line 964
    .line 965
    :cond_1e
    :goto_7
    invoke-static {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/b;->f(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;)V

    .line 966
    .line 967
    .line 968
    invoke-static {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/b;->e(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;)V

    .line 969
    .line 970
    .line 971
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->s:Landroid/view/View;

    .line 972
    .line 973
    if-eqz v1, :cond_22

    .line 974
    .line 975
    iget-object v1, p0, Lz2/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 976
    .line 977
    sget v2, Lcom/xuexiang/xui/R$id;->md_root:I

    .line 978
    .line 979
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 980
    .line 981
    .line 982
    move-result-object v1

    .line 983
    check-cast v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 984
    .line 985
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->t()V

    .line 986
    .line 987
    .line 988
    iget-object v1, p0, Lz2/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 989
    .line 990
    sget v2, Lcom/xuexiang/xui/R$id;->md_customViewFrame:I

    .line 991
    .line 992
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 993
    .line 994
    .line 995
    move-result-object v1

    .line 996
    check-cast v1, Landroid/widget/FrameLayout;

    .line 997
    .line 998
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->k:Landroid/widget/FrameLayout;

    .line 999
    .line 1000
    iget-object v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->s:Landroid/view/View;

    .line 1001
    .line 1002
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v3

    .line 1006
    if-eqz v3, :cond_1f

    .line 1007
    .line 1008
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v3

    .line 1012
    check-cast v3, Landroid/view/ViewGroup;

    .line 1013
    .line 1014
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 1015
    .line 1016
    .line 1017
    :cond_1f
    iget-boolean v3, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->W:Z

    .line 1018
    .line 1019
    const/4 v4, -0x2

    .line 1020
    if-eqz v3, :cond_21

    .line 1021
    .line 1022
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v3

    .line 1026
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v3

    .line 1030
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v7

    .line 1034
    sget v8, Lcom/xuexiang/xui/R$attr;->md_dialog_frame_margin:I

    .line 1035
    .line 1036
    sget v9, Lcom/xuexiang/xui/R$dimen;->default_md_dialog_frame_margin:I

    .line 1037
    .line 1038
    invoke-static {v7, v8, v9}, Lcom/xuexiang/xui/utils/g;->p(Landroid/content/Context;II)I

    .line 1039
    .line 1040
    .line 1041
    move-result v7

    .line 1042
    new-instance v8, Lq2/a;

    .line 1043
    .line 1044
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v9

    .line 1048
    invoke-direct {v8, v9}, Lq2/a;-><init>(Landroid/content/Context;)V

    .line 1049
    .line 1050
    .line 1051
    sget v9, Lcom/xuexiang/xui/R$dimen;->md_content_padding_top:I

    .line 1052
    .line 1053
    invoke-virtual {v3, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 1054
    .line 1055
    .line 1056
    move-result v9

    .line 1057
    sget v10, Lcom/xuexiang/xui/R$dimen;->md_content_padding_bottom:I

    .line 1058
    .line 1059
    invoke-virtual {v3, v10}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 1060
    .line 1061
    .line 1062
    move-result v3

    .line 1063
    invoke-virtual {v8, v5}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 1064
    .line 1065
    .line 1066
    instance-of v10, v2, Landroid/widget/EditText;

    .line 1067
    .line 1068
    if-eqz v10, :cond_20

    .line 1069
    .line 1070
    invoke-virtual {v8, v7, v9, v7, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 1071
    .line 1072
    .line 1073
    goto :goto_8

    .line 1074
    :cond_20
    invoke-virtual {v8, v5, v9, v5, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 1075
    .line 1076
    .line 1077
    invoke-virtual {v2, v7, v5, v7, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 1078
    .line 1079
    .line 1080
    :goto_8
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 1081
    .line 1082
    invoke-direct {v3, v6, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 1083
    .line 1084
    .line 1085
    invoke-virtual {v8, v2, v3}, Landroid/widget/ScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1086
    .line 1087
    .line 1088
    move-object v2, v8

    .line 1089
    :cond_21
    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    .line 1090
    .line 1091
    invoke-direct {v3, v6, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 1092
    .line 1093
    .line 1094
    invoke-virtual {v1, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1095
    .line 1096
    .line 1097
    :cond_22
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->U:Landroid/content/DialogInterface$OnShowListener;

    .line 1098
    .line 1099
    if-eqz v1, :cond_23

    .line 1100
    .line 1101
    invoke-virtual {p0, v1}, Lz2/a;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 1102
    .line 1103
    .line 1104
    :cond_23
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->S:Landroid/content/DialogInterface$OnCancelListener;

    .line 1105
    .line 1106
    if-eqz v1, :cond_24

    .line 1107
    .line 1108
    invoke-virtual {p0, v1}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 1109
    .line 1110
    .line 1111
    :cond_24
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->R:Landroid/content/DialogInterface$OnDismissListener;

    .line 1112
    .line 1113
    if-eqz v1, :cond_25

    .line 1114
    .line 1115
    invoke-virtual {p0, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 1116
    .line 1117
    .line 1118
    :cond_25
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->T:Landroid/content/DialogInterface$OnKeyListener;

    .line 1119
    .line 1120
    if-eqz v1, :cond_26

    .line 1121
    .line 1122
    invoke-virtual {p0, v1}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 1123
    .line 1124
    .line 1125
    :cond_26
    invoke-virtual {p0}, Lz2/a;->b()V

    .line 1126
    .line 1127
    .line 1128
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->n()V

    .line 1129
    .line 1130
    .line 1131
    iget-object v1, p0, Lz2/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 1132
    .line 1133
    invoke-virtual {p0, v1}, Lz2/a;->c(Landroid/view/View;)V

    .line 1134
    .line 1135
    .line 1136
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->e()V

    .line 1137
    .line 1138
    .line 1139
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v1

    .line 1143
    invoke-virtual {v1}, Landroid/view/Window;->getWindowManager()Landroid/view/WindowManager;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v1

    .line 1147
    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v1

    .line 1151
    new-instance v2, Landroid/graphics/Point;

    .line 1152
    .line 1153
    invoke-direct {v2}, Landroid/graphics/Point;-><init>()V

    .line 1154
    .line 1155
    .line 1156
    invoke-virtual {v1, v2}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 1157
    .line 1158
    .line 1159
    iget v1, v2, Landroid/graphics/Point;->x:I

    .line 1160
    .line 1161
    iget v2, v2, Landroid/graphics/Point;->y:I

    .line 1162
    .line 1163
    iget-object v3, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->a:Landroid/content/Context;

    .line 1164
    .line 1165
    sget v4, Lcom/xuexiang/xui/R$attr;->md_dialog_vertical_margin:I

    .line 1166
    .line 1167
    sget v5, Lcom/xuexiang/xui/R$dimen;->default_md_dialog_vertical_margin_phone:I

    .line 1168
    .line 1169
    invoke-static {v3, v5}, Lcom/xuexiang/xui/utils/e;->e(Landroid/content/Context;I)I

    .line 1170
    .line 1171
    .line 1172
    move-result v5

    .line 1173
    invoke-static {v3, v4, v5}, Lcom/xuexiang/xui/utils/g;->p(Landroid/content/Context;II)I

    .line 1174
    .line 1175
    .line 1176
    move-result v3

    .line 1177
    iget-object v4, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->a:Landroid/content/Context;

    .line 1178
    .line 1179
    sget v5, Lcom/xuexiang/xui/R$attr;->md_dialog_horizontal_margin:I

    .line 1180
    .line 1181
    sget v6, Lcom/xuexiang/xui/R$dimen;->default_md_dialog_horizontal_margin_phone:I

    .line 1182
    .line 1183
    invoke-static {v4, v6}, Lcom/xuexiang/xui/utils/e;->e(Landroid/content/Context;I)I

    .line 1184
    .line 1185
    .line 1186
    move-result v6

    .line 1187
    invoke-static {v4, v5, v6}, Lcom/xuexiang/xui/utils/g;->p(Landroid/content/Context;II)I

    .line 1188
    .line 1189
    .line 1190
    move-result v4

    .line 1191
    iget-object v0, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->a:Landroid/content/Context;

    .line 1192
    .line 1193
    sget v5, Lcom/xuexiang/xui/R$attr;->md_dialog_max_width:I

    .line 1194
    .line 1195
    invoke-static {v0, v5}, Lcom/xuexiang/xui/utils/g;->o(Landroid/content/Context;I)I

    .line 1196
    .line 1197
    .line 1198
    move-result v0

    .line 1199
    mul-int/lit8 v4, v4, 0x2

    .line 1200
    .line 1201
    sub-int/2addr v1, v4

    .line 1202
    iget-object v4, p0, Lz2/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

    .line 1203
    .line 1204
    mul-int/lit8 v3, v3, 0x2

    .line 1205
    .line 1206
    sub-int/2addr v2, v3

    .line 1207
    invoke-virtual {v4, v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;->setMaxHeight(I)V

    .line 1208
    .line 1209
    .line 1210
    new-instance v2, Landroid/view/WindowManager$LayoutParams;

    .line 1211
    .line 1212
    invoke-direct {v2}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 1213
    .line 1214
    .line 1215
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 1216
    .line 1217
    .line 1218
    move-result-object v3

    .line 1219
    invoke-virtual {v3}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v3

    .line 1223
    invoke-virtual {v2, v3}, Landroid/view/WindowManager$LayoutParams;->copyFrom(Landroid/view/WindowManager$LayoutParams;)I

    .line 1224
    .line 1225
    .line 1226
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 1227
    .line 1228
    .line 1229
    move-result v0

    .line 1230
    iput v0, v2, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 1231
    .line 1232
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 1233
    .line 1234
    .line 1235
    move-result-object p0

    .line 1236
    invoke-virtual {p0, v2}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 1237
    .line 1238
    .line 1239
    return-void
.end method

.method public static e(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;

    .line 2
    .line 3
    iget-object v1, p0, Lz2/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

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
    iget-object v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->K:Landroid/graphics/Typeface;

    .line 20
    .line 21
    invoke-virtual {p0, v1, v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->r(Landroid/widget/TextView;Landroid/graphics/Typeface;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->e0:Ljava/lang/CharSequence;

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
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->q()V

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->h:Landroid/widget/EditText;

    .line 37
    .line 38
    iget-object v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->f0:Ljava/lang/CharSequence;

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
    iget v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->j:I

    .line 51
    .line 52
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->h:Landroid/widget/EditText;

    .line 56
    .line 57
    iget v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->j:I

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
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;

    .line 72
    .line 73
    iget v2, v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->t:I

    .line 74
    .line 75
    invoke-static {v1, v2}, La3/b;->e(Landroid/widget/EditText;I)V

    .line 76
    .line 77
    .line 78
    iget v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->h0:I

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
    iget v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->h0:I

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
    iget-object v1, p0, Lz2/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

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
    iget v3, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->j0:I

    .line 121
    .line 122
    if-gtz v3, :cond_4

    .line 123
    .line 124
    iget v3, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->k0:I

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
    iget-boolean v0, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->g0:Z

    .line 153
    .line 154
    xor-int/lit8 v0, v0, 0x1

    .line 155
    .line 156
    invoke-virtual {p0, v1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->m(IZ)V

    .line 157
    .line 158
    .line 159
    return-void
.end method

.method public static f(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->a0:Z

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->c0:I

    .line 8
    .line 9
    const/4 v2, -0x2

    .line 10
    if-le v1, v2, :cond_9

    .line 11
    .line 12
    :cond_0
    iget-object v1, p0, Lz2/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

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
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->a0:Z

    .line 30
    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->s0:Z

    .line 34
    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    new-instance v1, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;

    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->d()Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-direct {v1, v2}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateHorizontalProgressDrawable;-><init>(Landroid/content/Context;)V

    .line 44
    .line 45
    .line 46
    iget v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->t:I

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
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->d()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-direct {v1, v2}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/IndeterminateCircularProgressDrawable;-><init>(Landroid/content/Context;)V

    .line 69
    .line 70
    .line 71
    iget v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->t:I

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
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->d()Landroid/content/Context;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-direct {v1, v2}, Lcom/xuexiang/xui/widget/progress/materialprogressbar/l;-><init>(Landroid/content/Context;)V

    .line 94
    .line 95
    .line 96
    iget v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->t:I

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
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->a0:Z

    .line 112
    .line 113
    if-eqz v1, :cond_4

    .line 114
    .line 115
    iget-boolean v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->s0:Z

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
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->s0:Z

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
    iget v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->d0:I

    .line 142
    .line 143
    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 144
    .line 145
    .line 146
    iget-object v1, p0, Lz2/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

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
    iget-object v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->L:Landroid/graphics/Typeface;

    .line 161
    .line 162
    invoke-virtual {p0, v1, v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->r(Landroid/widget/TextView;Landroid/graphics/Typeface;)V

    .line 163
    .line 164
    .line 165
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->m:Landroid/widget/TextView;

    .line 166
    .line 167
    iget-object v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->r0:Ljava/text/NumberFormat;

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
    iget-object v1, p0, Lz2/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/internal/MDRootLayout;

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
    iget-object v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->K:Landroid/graphics/Typeface;

    .line 193
    .line 194
    invoke-virtual {p0, v1, v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->r(Landroid/widget/TextView;Landroid/graphics/Typeface;)V

    .line 195
    .line 196
    .line 197
    iget-boolean v1, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->b0:Z

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
    iget-object v2, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->q0:Ljava/lang/String;

    .line 209
    .line 210
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 211
    .line 212
    .line 213
    move-result-object v4

    .line 214
    iget v0, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->d0:I

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
    iput-boolean v3, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$f;->b0:Z

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
