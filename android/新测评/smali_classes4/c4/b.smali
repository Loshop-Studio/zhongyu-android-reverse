.class public abstract Lc4/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc4/b$b;
    }
.end annotation


# static fields
.field public static a:Landroid/widget/Toast;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public static A(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, p1, p2, v0}, Lc4/b;->B(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public static B(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;
    .locals 9

    .line 1
    sget v0, Lcom/xuexiang/xui/R$drawable;->xtoast_ic_error_outline_white_24dp:I

    .line 2
    .line 3
    invoke-static {p0, v0}, Lc4/a;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    sget v0, Lcom/xuexiang/xui/R$color;->toast_warning_color:I

    .line 8
    .line 9
    invoke-static {p0, v0}, Lc4/a;->a(Landroid/content/Context;I)I

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    sget v0, Lcom/xuexiang/xui/R$color;->toast_default_text_color:I

    .line 14
    .line 15
    invoke-static {p0, v0}, Lc4/a;->a(Landroid/content/Context;I)I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    const/4 v8, 0x1

    .line 20
    move-object v1, p0

    .line 21
    move-object v2, p1

    .line 22
    move v6, p2

    .line 23
    move v7, p3

    .line 24
    invoke-static/range {v1 .. v8}, Lc4/b;->c(Landroid/content/Context;Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;IIIZZ)Landroid/widget/Toast;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public static synthetic a()Landroid/widget/Toast;
    .locals 1

    .line 1
    sget-object v0, Lc4/b;->a:Landroid/widget/Toast;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic b(Landroid/widget/Toast;)Landroid/widget/Toast;
    .locals 0

    .line 1
    sput-object p0, Lc4/b;->a:Landroid/widget/Toast;

    .line 2
    .line 3
    return-object p0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;IIIZZ)Landroid/widget/Toast;
    .locals 3

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    invoke-static {p0, v0, p5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 4
    .line 5
    .line 6
    move-result-object p5

    .line 7
    const-string v0, "layout_inflater"

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/view/LayoutInflater;

    .line 14
    .line 15
    sget v1, Lcom/xuexiang/xui/R$layout;->xui_layout_xtoast:I

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget v1, Lcom/xuexiang/xui/R$id;->toast_icon:I

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Landroid/widget/ImageView;

    .line 29
    .line 30
    sget v2, Lcom/xuexiang/xui/R$id;->toast_text:I

    .line 31
    .line 32
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Landroid/widget/TextView;

    .line 37
    .line 38
    if-eqz p7, :cond_0

    .line 39
    .line 40
    invoke-static {p0, p3}, Lc4/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    sget p3, Lcom/xuexiang/xui/R$drawable;->xtoast_frame:I

    .line 46
    .line 47
    invoke-static {p0, p3}, Lc4/a;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    :goto_0
    invoke-static {v0, p0}, Lc4/a;->c(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 52
    .line 53
    .line 54
    if-eqz p6, :cond_4

    .line 55
    .line 56
    if-eqz p2, :cond_3

    .line 57
    .line 58
    invoke-static {}, Lc4/b$b;->k()Lc4/b$b;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {p0}, Lc4/b$b;->a(Lc4/b$b;)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-eqz p0, :cond_1

    .line 67
    .line 68
    const/4 p0, 0x1

    .line 69
    invoke-virtual {v0, p0}, Landroid/view/View;->setLayoutDirection(I)V

    .line 70
    .line 71
    .line 72
    :cond_1
    invoke-static {}, Lc4/b$b;->k()Lc4/b$b;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-static {p0}, Lc4/b$b;->b(Lc4/b$b;)Z

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    if-eqz p0, :cond_2

    .line 81
    .line 82
    invoke-static {p2, p4}, Lc4/a;->e(Landroid/graphics/drawable/Drawable;I)Landroid/graphics/drawable/Drawable;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    :cond_2
    invoke-static {v1, p2}, Lc4/a;->c(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 91
    .line 92
    const-string p1, "Avoid passing \'icon\' as null if \'withIcon\' is set to true"

    .line 93
    .line 94
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw p0

    .line 98
    :cond_4
    const/16 p0, 0x8

    .line 99
    .line 100
    invoke-virtual {v1, p0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 101
    .line 102
    .line 103
    :goto_1
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2, p4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 107
    .line 108
    .line 109
    invoke-static {}, Lc4/b$b;->k()Lc4/b$b;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-static {p0}, Lc4/b$b;->c(Lc4/b$b;)Landroid/graphics/Typeface;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    const/4 p1, 0x0

    .line 118
    invoke-virtual {v2, p0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 119
    .line 120
    .line 121
    invoke-static {}, Lc4/b$b;->k()Lc4/b$b;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-static {p0}, Lc4/b$b;->d(Lc4/b$b;)I

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    const/4 p1, -0x1

    .line 130
    if-eq p0, p1, :cond_5

    .line 131
    .line 132
    invoke-static {}, Lc4/b$b;->k()Lc4/b$b;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-static {p0}, Lc4/b$b;->d(Lc4/b$b;)I

    .line 137
    .line 138
    .line 139
    move-result p0

    .line 140
    int-to-float p0, p0

    .line 141
    const/4 p2, 0x2

    .line 142
    invoke-virtual {v2, p2, p0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 143
    .line 144
    .line 145
    :cond_5
    invoke-static {}, Lc4/b$b;->k()Lc4/b$b;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-static {p0}, Lc4/b$b;->e(Lc4/b$b;)I

    .line 150
    .line 151
    .line 152
    move-result p0

    .line 153
    if-eq p0, p1, :cond_6

    .line 154
    .line 155
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    invoke-static {}, Lc4/b$b;->k()Lc4/b$b;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    invoke-static {p2}, Lc4/b$b;->e(Lc4/b$b;)I

    .line 164
    .line 165
    .line 166
    move-result p2

    .line 167
    invoke-virtual {p0, p2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 168
    .line 169
    .line 170
    :cond_6
    invoke-virtual {p5, v0}, Landroid/widget/Toast;->setView(Landroid/view/View;)V

    .line 171
    .line 172
    .line 173
    invoke-static {}, Lc4/b$b;->k()Lc4/b$b;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    invoke-static {p0}, Lc4/b$b;->f(Lc4/b$b;)I

    .line 178
    .line 179
    .line 180
    move-result p0

    .line 181
    if-eq p0, p1, :cond_7

    .line 182
    .line 183
    invoke-static {}, Lc4/b$b;->k()Lc4/b$b;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-static {p0}, Lc4/b$b;->f(Lc4/b$b;)I

    .line 188
    .line 189
    .line 190
    move-result p0

    .line 191
    invoke-static {}, Lc4/b$b;->k()Lc4/b$b;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-static {p1}, Lc4/b$b;->g(Lc4/b$b;)I

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    invoke-static {}, Lc4/b$b;->k()Lc4/b$b;

    .line 200
    .line 201
    .line 202
    move-result-object p2

    .line 203
    invoke-static {p2}, Lc4/b$b;->h(Lc4/b$b;)I

    .line 204
    .line 205
    .line 206
    move-result p2

    .line 207
    invoke-virtual {p5, p0, p1, p2}, Landroid/widget/Toast;->setGravity(III)V

    .line 208
    .line 209
    .line 210
    :cond_7
    invoke-static {}, Lc4/b$b;->k()Lc4/b$b;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    invoke-static {p0}, Lc4/b$b;->i(Lc4/b$b;)Z

    .line 215
    .line 216
    .line 217
    move-result p0

    .line 218
    if-nez p0, :cond_9

    .line 219
    .line 220
    sget-object p0, Lc4/b;->a:Landroid/widget/Toast;

    .line 221
    .line 222
    if-eqz p0, :cond_8

    .line 223
    .line 224
    invoke-virtual {p0}, Landroid/widget/Toast;->cancel()V

    .line 225
    .line 226
    .line 227
    :cond_8
    sput-object p5, Lc4/b;->a:Landroid/widget/Toast;

    .line 228
    .line 229
    invoke-virtual {p5}, Landroid/widget/Toast;->getView()Landroid/view/View;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    new-instance p1, Lc4/b$a;

    .line 234
    .line 235
    invoke-direct {p1, p5}, Lc4/b$a;-><init>(Landroid/widget/Toast;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {p0, p1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 239
    .line 240
    .line 241
    :cond_9
    return-object p5
.end method

.method public static d(Landroid/content/Context;I)Landroid/widget/Toast;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-static {p0, p1, v0, v1}, Lc4/b;->h(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static e(Landroid/content/Context;II)Landroid/widget/Toast;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-static {p0, p1, p2, v0}, Lc4/b;->h(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static f(Landroid/content/Context;Ljava/lang/CharSequence;)Landroid/widget/Toast;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {p0, p1, v0, v1}, Lc4/b;->h(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static g(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, p1, p2, v0}, Lc4/b;->h(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public static h(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;
    .locals 9

    .line 1
    sget v0, Lcom/xuexiang/xui/R$drawable;->xtoast_ic_clear_white_24dp:I

    .line 2
    .line 3
    invoke-static {p0, v0}, Lc4/a;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    sget v0, Lcom/xuexiang/xui/R$color;->toast_error_color:I

    .line 8
    .line 9
    invoke-static {p0, v0}, Lc4/a;->a(Landroid/content/Context;I)I

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    sget v0, Lcom/xuexiang/xui/R$color;->toast_default_text_color:I

    .line 14
    .line 15
    invoke-static {p0, v0}, Lc4/a;->a(Landroid/content/Context;I)I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    const/4 v8, 0x1

    .line 20
    move-object v1, p0

    .line 21
    move-object v2, p1

    .line 22
    move v6, p2

    .line 23
    move v7, p3

    .line 24
    invoke-static/range {v1 .. v8}, Lc4/b;->c(Landroid/content/Context;Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;IIIZZ)Landroid/widget/Toast;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public static i(Landroid/content/Context;I)Landroid/widget/Toast;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-static {p0, p1, v0, v1}, Lc4/b;->m(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static j(Landroid/content/Context;II)Landroid/widget/Toast;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-static {p0, p1, p2, v0}, Lc4/b;->m(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static k(Landroid/content/Context;Ljava/lang/CharSequence;)Landroid/widget/Toast;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {p0, p1, v0, v1}, Lc4/b;->m(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static l(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, p1, p2, v0}, Lc4/b;->m(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public static m(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;
    .locals 9

    .line 1
    sget v0, Lcom/xuexiang/xui/R$drawable;->xtoast_ic_info_outline_white_24dp:I

    .line 2
    .line 3
    invoke-static {p0, v0}, Lc4/a;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    sget v0, Lcom/xuexiang/xui/R$color;->toast_info_color:I

    .line 8
    .line 9
    invoke-static {p0, v0}, Lc4/a;->a(Landroid/content/Context;I)I

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    sget v0, Lcom/xuexiang/xui/R$color;->toast_default_text_color:I

    .line 14
    .line 15
    invoke-static {p0, v0}, Lc4/a;->a(Landroid/content/Context;I)I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    const/4 v8, 0x1

    .line 20
    move-object v1, p0

    .line 21
    move-object v2, p1

    .line 22
    move v6, p2

    .line 23
    move v7, p3

    .line 24
    invoke-static/range {v1 .. v8}, Lc4/b;->c(Landroid/content/Context;Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;IIIZZ)Landroid/widget/Toast;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public static n(Landroid/content/Context;I)Landroid/widget/Toast;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-static {p0, p1, v0, v1, v0}, Lc4/b;->r(Landroid/content/Context;Ljava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Z)Landroid/widget/Toast;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static o(Landroid/content/Context;II)Landroid/widget/Toast;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-static {p0, p1, p2, v0, v1}, Lc4/b;->r(Landroid/content/Context;Ljava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Z)Landroid/widget/Toast;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static p(Landroid/content/Context;Ljava/lang/CharSequence;)Landroid/widget/Toast;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-static {p0, p1, v0, v1, v0}, Lc4/b;->r(Landroid/content/Context;Ljava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Z)Landroid/widget/Toast;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static q(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-static {p0, p1, p2, v0, v1}, Lc4/b;->r(Landroid/content/Context;Ljava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Z)Landroid/widget/Toast;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static r(Landroid/content/Context;Ljava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Z)Landroid/widget/Toast;
    .locals 9

    .line 1
    sget v0, Lcom/xuexiang/xui/R$color;->toast_normal_tint_color:I

    .line 2
    .line 3
    invoke-static {p0, v0}, Lc4/a;->a(Landroid/content/Context;I)I

    .line 4
    .line 5
    .line 6
    move-result v4

    .line 7
    sget v0, Lcom/xuexiang/xui/R$color;->toast_default_text_color:I

    .line 8
    .line 9
    invoke-static {p0, v0}, Lc4/a;->a(Landroid/content/Context;I)I

    .line 10
    .line 11
    .line 12
    move-result v5

    .line 13
    const/4 v8, 0x1

    .line 14
    move-object v1, p0

    .line 15
    move-object v2, p1

    .line 16
    move v6, p2

    .line 17
    move-object v3, p3

    .line 18
    move v7, p4

    .line 19
    invoke-static/range {v1 .. v8}, Lc4/b;->c(Landroid/content/Context;Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;IIIZZ)Landroid/widget/Toast;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public static s(Landroid/content/Context;I)Landroid/widget/Toast;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-static {p0, p1, v0, v1}, Lc4/b;->w(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static t(Landroid/content/Context;II)Landroid/widget/Toast;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-static {p0, p1, p2, v0}, Lc4/b;->w(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static u(Landroid/content/Context;Ljava/lang/CharSequence;)Landroid/widget/Toast;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {p0, p1, v0, v1}, Lc4/b;->w(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static v(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, p1, p2, v0}, Lc4/b;->w(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public static w(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;
    .locals 9

    .line 1
    sget v0, Lcom/xuexiang/xui/R$drawable;->xtoast_ic_check_white_24dp:I

    .line 2
    .line 3
    invoke-static {p0, v0}, Lc4/a;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    sget v0, Lcom/xuexiang/xui/R$color;->toast_success_color:I

    .line 8
    .line 9
    invoke-static {p0, v0}, Lc4/a;->a(Landroid/content/Context;I)I

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    sget v0, Lcom/xuexiang/xui/R$color;->toast_default_text_color:I

    .line 14
    .line 15
    invoke-static {p0, v0}, Lc4/a;->a(Landroid/content/Context;I)I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    const/4 v8, 0x1

    .line 20
    move-object v1, p0

    .line 21
    move-object v2, p1

    .line 22
    move v6, p2

    .line 23
    move v7, p3

    .line 24
    invoke-static/range {v1 .. v8}, Lc4/b;->c(Landroid/content/Context;Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;IIIZZ)Landroid/widget/Toast;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public static x(Landroid/content/Context;I)Landroid/widget/Toast;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-static {p0, p1, v0, v1}, Lc4/b;->B(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static y(Landroid/content/Context;II)Landroid/widget/Toast;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-static {p0, p1, p2, v0}, Lc4/b;->B(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static z(Landroid/content/Context;Ljava/lang/CharSequence;)Landroid/widget/Toast;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {p0, p1, v0, v1}, Lc4/b;->B(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
