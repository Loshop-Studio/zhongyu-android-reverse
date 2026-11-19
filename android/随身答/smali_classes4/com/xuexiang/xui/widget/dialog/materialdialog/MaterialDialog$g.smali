.class public Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "g"
.end annotation


# instance fields
.field public A:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$h;

.field public A0:Z

.field public B:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$h;

.field public B0:Z

.field public C:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$h;

.field public C0:Z

.field public D:Z

.field public D0:Z

.field public E:Z

.field public E0:Z

.field public F:Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;

.field public F0:I

.field public G:I

.field public G0:I

.field public H:Z

.field public H0:I

.field public I:Z

.field public I0:I

.field public J:F

.field public J0:I

.field public K:I

.field public K0:Z

.field public L:[Ljava/lang/Integer;

.field public M:[Ljava/lang/Integer;

.field public N:Z

.field public O:Landroid/graphics/Typeface;

.field public P:Landroid/graphics/Typeface;

.field public Q:Landroid/graphics/drawable/Drawable;

.field public R:Z

.field public S:I

.field public T:Landroidx/recyclerview/widget/RecyclerView$Adapter;

.field public U:Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

.field public V:Landroid/content/DialogInterface$OnDismissListener;

.field public W:Landroid/content/DialogInterface$OnCancelListener;

.field public X:Landroid/content/DialogInterface$OnKeyListener;

.field public Y:Landroid/content/DialogInterface$OnShowListener;

.field public Z:Lcom/xuexiang/xui/widget/dialog/materialdialog/StackingBehavior;

.field public final a:Landroid/content/Context;

.field public a0:Z

.field public b:Ljava/lang/CharSequence;

.field public b0:I

.field public c:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

.field public c0:I

.field public d:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

.field public d0:I

.field public e:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

.field public e0:Z

.field public f:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

.field public f0:Z

.field public g:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

.field public g0:I

.field public h:I

.field public h0:I

.field public i:I

.field public i0:Ljava/lang/CharSequence;

.field public j:I

.field public j0:Ljava/lang/CharSequence;

.field public k:Ljava/lang/CharSequence;

.field public k0:Z

.field public l:Ljava/util/ArrayList;

.field public l0:I

.field public m:Ljava/lang/CharSequence;

.field public m0:Z

.field public n:Ljava/lang/CharSequence;

.field public n0:I

.field public o:Ljava/lang/CharSequence;

.field public o0:I

.field public p:Z

.field public p0:I

.field public q:Z

.field public q0:[I

.field public r:Z

.field public r0:Ljava/lang/CharSequence;

.field public s:Landroid/view/View;

.field public s0:Z

.field public t:I

.field public t0:Landroid/widget/CompoundButton$OnCheckedChangeListener;

.field public u:Landroid/content/res/ColorStateList;

.field public u0:Ljava/lang/String;

.field public v:Landroid/content/res/ColorStateList;

.field public v0:Ljava/text/NumberFormat;

.field public w:Landroid/content/res/ColorStateList;

.field public w0:Z

.field public x:Landroid/content/res/ColorStateList;

.field public x0:Z

.field public y:Landroid/content/res/ColorStateList;

.field public y0:Z

.field public z:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$h;

.field public z0:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->d:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 9
    .line 10
    sget-object v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 11
    .line 12
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->e:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 13
    .line 14
    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->f:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 15
    .line 16
    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->g:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->h:I

    .line 20
    .line 21
    const/4 v1, -0x1

    .line 22
    iput v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->i:I

    .line 23
    .line 24
    iput v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->j:I

    .line 25
    .line 26
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->D:Z

    .line 27
    .line 28
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->E:Z

    .line 29
    .line 30
    sget-object v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;

    .line 31
    .line 32
    iput-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->F:Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;

    .line 33
    .line 34
    iput v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->G:I

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    iput-boolean v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->H:Z

    .line 38
    .line 39
    iput-boolean v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->I:Z

    .line 40
    .line 41
    const v4, 0x3f99999a    # 1.2f

    .line 42
    .line 43
    .line 44
    iput v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->J:F

    .line 45
    .line 46
    iput v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->K:I

    .line 47
    .line 48
    const/4 v4, 0x0

    .line 49
    iput-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->L:[Ljava/lang/Integer;

    .line 50
    .line 51
    iput-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->M:[Ljava/lang/Integer;

    .line 52
    .line 53
    iput-boolean v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->N:Z

    .line 54
    .line 55
    iput v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->S:I

    .line 56
    .line 57
    const/4 v3, -0x2

    .line 58
    iput v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->g0:I

    .line 59
    .line 60
    iput v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->h0:I

    .line 61
    .line 62
    iput v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->l0:I

    .line 63
    .line 64
    iput v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->n0:I

    .line 65
    .line 66
    iput v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->o0:I

    .line 67
    .line 68
    iput v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->p0:I

    .line 69
    .line 70
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->x0:Z

    .line 71
    .line 72
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->y0:Z

    .line 73
    .line 74
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->z0:Z

    .line 75
    .line 76
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->A0:Z

    .line 77
    .line 78
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->B0:Z

    .line 79
    .line 80
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->C0:Z

    .line 81
    .line 82
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->D0:Z

    .line 83
    .line 84
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->E0:Z

    .line 85
    .line 86
    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a:Landroid/content/Context;

    .line 87
    .line 88
    sget v1, Lcom/xuexiang/xui/R$color;->md_material_blue_600:I

    .line 89
    .line 90
    invoke-static {p1, v1}, Lcom/xuexiang/xui/utils/g;->c(Landroid/content/Context;I)I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    sget v3, Lcom/xuexiang/xui/R$attr;->colorAccent:I

    .line 95
    .line 96
    invoke-static {p1, v3, v1}, Lcom/xuexiang/xui/utils/g;->m(Landroid/content/Context;II)I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    iput v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t:I

    .line 101
    .line 102
    const v3, 0x1010435

    .line 103
    .line 104
    .line 105
    invoke-static {p1, v3, v1}, Lcom/xuexiang/xui/utils/g;->m(Landroid/content/Context;II)I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    iput v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t:I

    .line 110
    .line 111
    invoke-static {p1, v1}, Lcom/xuexiang/xui/utils/g;->b(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->v:Landroid/content/res/ColorStateList;

    .line 116
    .line 117
    iget v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t:I

    .line 118
    .line 119
    invoke-static {p1, v1}, Lcom/xuexiang/xui/utils/g;->b(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->w:Landroid/content/res/ColorStateList;

    .line 124
    .line 125
    iget v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t:I

    .line 126
    .line 127
    invoke-static {p1, v1}, Lcom/xuexiang/xui/utils/g;->b(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->x:Landroid/content/res/ColorStateList;

    .line 132
    .line 133
    sget v1, Lcom/xuexiang/xui/R$attr;->md_link_color:I

    .line 134
    .line 135
    iget v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t:I

    .line 136
    .line 137
    invoke-static {p1, v1, v3}, Lcom/xuexiang/xui/utils/g;->m(Landroid/content/Context;II)I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    invoke-static {p1, v1}, Lcom/xuexiang/xui/utils/g;->b(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->y:Landroid/content/res/ColorStateList;

    .line 146
    .line 147
    const v1, 0x101042c

    .line 148
    .line 149
    .line 150
    invoke-static {p1, v1}, Lcom/xuexiang/xui/utils/g;->l(Landroid/content/Context;I)I

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    sget v3, Lcom/xuexiang/xui/R$attr;->md_btn_ripple_color:I

    .line 155
    .line 156
    sget v4, Lcom/xuexiang/xui/R$attr;->colorControlHighlight:I

    .line 157
    .line 158
    invoke-static {p1, v4, v1}, Lcom/xuexiang/xui/utils/g;->m(Landroid/content/Context;II)I

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    invoke-static {p1, v3, v1}, Lcom/xuexiang/xui/utils/g;->m(Landroid/content/Context;II)I

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    iput v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->h:I

    .line 167
    .line 168
    invoke-static {}, Ljava/text/NumberFormat;->getPercentInstance()Ljava/text/NumberFormat;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->v0:Ljava/text/NumberFormat;

    .line 173
    .line 174
    const-string v1, "%1d/%2d"

    .line 175
    .line 176
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->u0:Ljava/lang/String;

    .line 177
    .line 178
    const v1, 0x1010036

    .line 179
    .line 180
    .line 181
    invoke-static {p1, v1}, Lcom/xuexiang/xui/utils/g;->l(Landroid/content/Context;I)I

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    invoke-static {v1}, Lcom/xuexiang/xui/utils/g;->g(I)Z

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    if-eqz v1, :cond_0

    .line 190
    .line 191
    goto :goto_0

    .line 192
    :cond_0
    sget-object v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;->b:Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;

    .line 193
    .line 194
    :goto_0
    iput-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->F:Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;

    .line 195
    .line 196
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->e()V

    .line 197
    .line 198
    .line 199
    sget v1, Lcom/xuexiang/xui/R$attr;->md_title_gravity:I

    .line 200
    .line 201
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 202
    .line 203
    invoke-static {p1, v1, v2}, Lcom/xuexiang/xui/utils/g;->s(Landroid/content/Context;ILcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;)Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 208
    .line 209
    sget v1, Lcom/xuexiang/xui/R$attr;->md_content_gravity:I

    .line 210
    .line 211
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->d:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 212
    .line 213
    invoke-static {p1, v1, v2}, Lcom/xuexiang/xui/utils/g;->s(Landroid/content/Context;ILcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;)Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->d:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 218
    .line 219
    sget v1, Lcom/xuexiang/xui/R$attr;->md_btnstacked_gravity:I

    .line 220
    .line 221
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->e:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 222
    .line 223
    invoke-static {p1, v1, v2}, Lcom/xuexiang/xui/utils/g;->s(Landroid/content/Context;ILcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;)Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->e:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 228
    .line 229
    sget v1, Lcom/xuexiang/xui/R$attr;->md_items_gravity:I

    .line 230
    .line 231
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->f:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 232
    .line 233
    invoke-static {p1, v1, v2}, Lcom/xuexiang/xui/utils/g;->s(Landroid/content/Context;ILcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;)Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->f:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 238
    .line 239
    sget v1, Lcom/xuexiang/xui/R$attr;->md_buttons_gravity:I

    .line 240
    .line 241
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->g:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 242
    .line 243
    invoke-static {p1, v1, v2}, Lcom/xuexiang/xui/utils/g;->s(Landroid/content/Context;ILcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;)Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->g:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 248
    .line 249
    sget v1, Lcom/xuexiang/xui/R$attr;->md_medium_font:I

    .line 250
    .line 251
    invoke-static {}, Le3/b;->b()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    invoke-static {p1, v1, v2}, Lcom/xuexiang/xui/utils/g;->t(Landroid/content/Context;ILjava/lang/String;)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    sget v2, Lcom/xuexiang/xui/R$attr;->md_regular_font:I

    .line 260
    .line 261
    invoke-static {}, Le3/b;->b()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    invoke-static {p1, v2, v3}, Lcom/xuexiang/xui/utils/g;->t(Landroid/content/Context;ILjava/lang/String;)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    :try_start_0
    invoke-virtual {p0, v1, p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->p(Ljava/lang/String;Ljava/lang/String;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 270
    .line 271
    .line 272
    :catchall_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->P:Landroid/graphics/Typeface;

    .line 273
    .line 274
    if-nez p1, :cond_1

    .line 275
    .line 276
    :try_start_1
    const-string p1, "sans-serif-medium"

    .line 277
    .line 278
    invoke-static {p1, v0}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->P:Landroid/graphics/Typeface;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 283
    .line 284
    goto :goto_1

    .line 285
    :catchall_1
    sget-object p1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 286
    .line 287
    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->P:Landroid/graphics/Typeface;

    .line 288
    .line 289
    :cond_1
    :goto_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->O:Landroid/graphics/Typeface;

    .line 290
    .line 291
    if-nez p1, :cond_2

    .line 292
    .line 293
    :try_start_2
    const-string p1, "sans-serif"

    .line 294
    .line 295
    invoke-static {p1, v0}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->O:Landroid/graphics/Typeface;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 300
    .line 301
    goto :goto_2

    .line 302
    :catchall_2
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    .line 303
    .line 304
    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->O:Landroid/graphics/Typeface;

    .line 305
    .line 306
    if-nez p1, :cond_2

    .line 307
    .line 308
    sget-object p1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 309
    .line 310
    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->O:Landroid/graphics/Typeface;

    .line 311
    .line 312
    :cond_2
    :goto_2
    return-void
.end method


# virtual methods
.method public a()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;
    .locals 1

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;-><init>(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public b(Landroid/content/DialogInterface$OnCancelListener;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->W:Landroid/content/DialogInterface$OnCancelListener;

    .line 2
    .line 3
    return-object p0
.end method

.method public c(Z)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->H:Z

    .line 2
    .line 3
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->I:Z

    .line 4
    .line 5
    return-object p0
.end method

.method public d(Z)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->I:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public final e()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Lq3/c;->b(Z)Lq3/c;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-static {}, Lq3/c;->a()Lq3/c;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-boolean v1, v0, Lq3/c;->a:Z

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    sget-object v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;->b:Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;

    .line 18
    .line 19
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->F:Lcom/xuexiang/xui/widget/dialog/materialdialog/Theme;

    .line 20
    .line 21
    :cond_1
    iget v1, v0, Lq3/c;->b:I

    .line 22
    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    iput v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->i:I

    .line 26
    .line 27
    :cond_2
    iget v1, v0, Lq3/c;->c:I

    .line 28
    .line 29
    if-eqz v1, :cond_3

    .line 30
    .line 31
    iput v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->j:I

    .line 32
    .line 33
    :cond_3
    iget-object v1, v0, Lq3/c;->d:Landroid/content/res/ColorStateList;

    .line 34
    .line 35
    if-eqz v1, :cond_4

    .line 36
    .line 37
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->v:Landroid/content/res/ColorStateList;

    .line 38
    .line 39
    :cond_4
    iget-object v1, v0, Lq3/c;->e:Landroid/content/res/ColorStateList;

    .line 40
    .line 41
    if-eqz v1, :cond_5

    .line 42
    .line 43
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->x:Landroid/content/res/ColorStateList;

    .line 44
    .line 45
    :cond_5
    iget-object v1, v0, Lq3/c;->f:Landroid/content/res/ColorStateList;

    .line 46
    .line 47
    if-eqz v1, :cond_6

    .line 48
    .line 49
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->w:Landroid/content/res/ColorStateList;

    .line 50
    .line 51
    :cond_6
    iget v1, v0, Lq3/c;->h:I

    .line 52
    .line 53
    if-eqz v1, :cond_7

    .line 54
    .line 55
    iput v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->d0:I

    .line 56
    .line 57
    :cond_7
    iget-object v1, v0, Lq3/c;->i:Landroid/graphics/drawable/Drawable;

    .line 58
    .line 59
    if-eqz v1, :cond_8

    .line 60
    .line 61
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->Q:Landroid/graphics/drawable/Drawable;

    .line 62
    .line 63
    :cond_8
    iget v1, v0, Lq3/c;->j:I

    .line 64
    .line 65
    if-eqz v1, :cond_9

    .line 66
    .line 67
    iput v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->c0:I

    .line 68
    .line 69
    :cond_9
    iget v1, v0, Lq3/c;->k:I

    .line 70
    .line 71
    if-eqz v1, :cond_a

    .line 72
    .line 73
    iput v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->b0:I

    .line 74
    .line 75
    :cond_a
    iget v1, v0, Lq3/c;->n:I

    .line 76
    .line 77
    if-eqz v1, :cond_b

    .line 78
    .line 79
    iput v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->G0:I

    .line 80
    .line 81
    :cond_b
    iget v1, v0, Lq3/c;->m:I

    .line 82
    .line 83
    if-eqz v1, :cond_c

    .line 84
    .line 85
    iput v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->F0:I

    .line 86
    .line 87
    :cond_c
    iget v1, v0, Lq3/c;->o:I

    .line 88
    .line 89
    if-eqz v1, :cond_d

    .line 90
    .line 91
    iput v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->H0:I

    .line 92
    .line 93
    :cond_d
    iget v1, v0, Lq3/c;->p:I

    .line 94
    .line 95
    if-eqz v1, :cond_e

    .line 96
    .line 97
    iput v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->I0:I

    .line 98
    .line 99
    :cond_e
    iget v1, v0, Lq3/c;->q:I

    .line 100
    .line 101
    if-eqz v1, :cond_f

    .line 102
    .line 103
    iput v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->J0:I

    .line 104
    .line 105
    :cond_f
    iget v1, v0, Lq3/c;->g:I

    .line 106
    .line 107
    if-eqz v1, :cond_10

    .line 108
    .line 109
    iput v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t:I

    .line 110
    .line 111
    :cond_10
    iget-object v1, v0, Lq3/c;->l:Landroid/content/res/ColorStateList;

    .line 112
    .line 113
    if-eqz v1, :cond_11

    .line 114
    .line 115
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->y:Landroid/content/res/ColorStateList;

    .line 116
    .line 117
    :cond_11
    iget-object v1, v0, Lq3/c;->r:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 118
    .line 119
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 120
    .line 121
    iget-object v1, v0, Lq3/c;->s:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 122
    .line 123
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->d:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 124
    .line 125
    iget-object v1, v0, Lq3/c;->t:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 126
    .line 127
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->e:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 128
    .line 129
    iget-object v1, v0, Lq3/c;->u:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 130
    .line 131
    iput-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->f:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 132
    .line 133
    iget-object v0, v0, Lq3/c;->v:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 134
    .line 135
    iput-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->g:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 136
    .line 137
    return-void
.end method

.method public f(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->s:Landroid/view/View;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->k:Ljava/lang/CharSequence;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v0, "You cannot set content() when you\'re using a custom view."

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw p1
.end method

.method public g(Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->d:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
.end method

.method public i(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->o:Ljava/lang/CharSequence;

    .line 2
    .line 3
    return-object p0
.end method

.method public j(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$h;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->z:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$h;

    .line 2
    .line 3
    return-object p0
.end method

.method public k(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->m:Ljava/lang/CharSequence;

    .line 2
    .line 3
    return-object p0
.end method

.method public l(ZI)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->s:Landroid/view/View;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->e0:Z

    .line 9
    .line 10
    const/4 p1, -0x2

    .line 11
    iput p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->g0:I

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->w0:Z

    .line 16
    .line 17
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->e0:Z

    .line 18
    .line 19
    const/4 p1, -0x1

    .line 20
    iput p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->g0:I

    .line 21
    .line 22
    iput p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->h0:I

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string p2, "You cannot set progress() when you\'re using a custom view."

    .line 28
    .line 29
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1
.end method

.method public m(ZIZ)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;
    .locals 0

    .line 1
    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->f0:Z

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->l(ZI)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public n()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->a()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->show()V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public o(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->b:Ljava/lang/CharSequence;

    .line 2
    .line 3
    return-object p0
.end method

.method public p(Ljava/lang/String;Ljava/lang/String;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;
    .locals 3

    .line 1
    const-string v0, "\""

    .line 2
    .line 3
    const-string v1, "No font asset found for \""

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    invoke-static {p1}, Le3/b;->d(Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iput-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->P:Landroid/graphics/Typeface;

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 27
    .line 28
    new-instance v2, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p2

    .line 50
    :cond_1
    :goto_0
    if-eqz p2, :cond_3

    .line 51
    .line 52
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-nez p1, :cond_3

    .line 61
    .line 62
    invoke-static {p2}, Le3/b;->d(Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->O:Landroid/graphics/Typeface;

    .line 67
    .line 68
    if-eqz p1, :cond_2

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 72
    .line 73
    new-instance v2, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw p1

    .line 95
    :cond_3
    :goto_1
    return-object p0
.end method
