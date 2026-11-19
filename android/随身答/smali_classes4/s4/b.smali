.class public abstract Ls4/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls4/b$a;
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

.method public static a(Landroid/content/Context;Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;IIIZZ)Landroid/widget/Toast;
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
    invoke-static {p0, p3}, Ls4/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

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
    invoke-static {p0, p3}, Ls4/a;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    :goto_0
    invoke-static {v0, p0}, Ls4/a;->c(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 52
    .line 53
    .line 54
    if-eqz p6, :cond_3

    .line 55
    .line 56
    if-eqz p2, :cond_2

    .line 57
    .line 58
    invoke-static {}, Ls4/b$a;->j()Ls4/b$a;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {p0}, Ls4/b$a;->a(Ls4/b$a;)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-eqz p0, :cond_1

    .line 67
    .line 68
    invoke-static {p2, p4}, Ls4/a;->e(Landroid/graphics/drawable/Drawable;I)Landroid/graphics/drawable/Drawable;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    :cond_1
    invoke-static {v1, p2}, Ls4/a;->c(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 77
    .line 78
    const-string p1, "Avoid passing \'icon\' as null if \'withIcon\' is set to true"

    .line 79
    .line 80
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p0

    .line 84
    :cond_3
    const/16 p0, 0x8

    .line 85
    .line 86
    invoke-virtual {v1, p0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 87
    .line 88
    .line 89
    :goto_1
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, p4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 93
    .line 94
    .line 95
    invoke-static {}, Ls4/b$a;->j()Ls4/b$a;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-static {p0}, Ls4/b$a;->b(Ls4/b$a;)Landroid/graphics/Typeface;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    const/4 p1, 0x0

    .line 104
    invoke-virtual {v2, p0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 105
    .line 106
    .line 107
    invoke-static {}, Ls4/b$a;->j()Ls4/b$a;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-static {p0}, Ls4/b$a;->c(Ls4/b$a;)I

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    const/4 p1, -0x1

    .line 116
    if-eq p0, p1, :cond_4

    .line 117
    .line 118
    invoke-static {}, Ls4/b$a;->j()Ls4/b$a;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-static {p0}, Ls4/b$a;->c(Ls4/b$a;)I

    .line 123
    .line 124
    .line 125
    move-result p0

    .line 126
    int-to-float p0, p0

    .line 127
    const/4 p2, 0x2

    .line 128
    invoke-virtual {v2, p2, p0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 129
    .line 130
    .line 131
    :cond_4
    invoke-static {}, Ls4/b$a;->j()Ls4/b$a;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-static {p0}, Ls4/b$a;->d(Ls4/b$a;)I

    .line 136
    .line 137
    .line 138
    move-result p0

    .line 139
    if-eq p0, p1, :cond_5

    .line 140
    .line 141
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-static {}, Ls4/b$a;->j()Ls4/b$a;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    invoke-static {p2}, Ls4/b$a;->d(Ls4/b$a;)I

    .line 150
    .line 151
    .line 152
    move-result p2

    .line 153
    invoke-virtual {p0, p2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 154
    .line 155
    .line 156
    :cond_5
    invoke-virtual {p5, v0}, Landroid/widget/Toast;->setView(Landroid/view/View;)V

    .line 157
    .line 158
    .line 159
    invoke-static {}, Ls4/b$a;->j()Ls4/b$a;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    invoke-static {p0}, Ls4/b$a;->e(Ls4/b$a;)Z

    .line 164
    .line 165
    .line 166
    move-result p0

    .line 167
    if-nez p0, :cond_7

    .line 168
    .line 169
    sget-object p0, Ls4/b;->a:Landroid/widget/Toast;

    .line 170
    .line 171
    if-eqz p0, :cond_6

    .line 172
    .line 173
    invoke-virtual {p0}, Landroid/widget/Toast;->cancel()V

    .line 174
    .line 175
    .line 176
    :cond_6
    sput-object p5, Ls4/b;->a:Landroid/widget/Toast;

    .line 177
    .line 178
    :cond_7
    invoke-static {}, Ls4/b$a;->j()Ls4/b$a;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    invoke-static {p0}, Ls4/b$a;->f(Ls4/b$a;)I

    .line 183
    .line 184
    .line 185
    move-result p0

    .line 186
    if-eq p0, p1, :cond_8

    .line 187
    .line 188
    invoke-static {}, Ls4/b$a;->j()Ls4/b$a;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    invoke-static {p0}, Ls4/b$a;->f(Ls4/b$a;)I

    .line 193
    .line 194
    .line 195
    move-result p0

    .line 196
    invoke-static {}, Ls4/b$a;->j()Ls4/b$a;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    invoke-static {p1}, Ls4/b$a;->g(Ls4/b$a;)I

    .line 201
    .line 202
    .line 203
    move-result p1

    .line 204
    invoke-static {}, Ls4/b$a;->j()Ls4/b$a;

    .line 205
    .line 206
    .line 207
    move-result-object p2

    .line 208
    invoke-static {p2}, Ls4/b$a;->h(Ls4/b$a;)I

    .line 209
    .line 210
    .line 211
    move-result p2

    .line 212
    invoke-virtual {p5, p0, p1, p2}, Landroid/widget/Toast;->setGravity(III)V

    .line 213
    .line 214
    .line 215
    :cond_8
    return-object p5
.end method

.method public static b(Landroid/content/Context;I)Landroid/widget/Toast;
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
    invoke-static {p0, p1, v0, v1}, Ls4/b;->f(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static c(Landroid/content/Context;II)Landroid/widget/Toast;
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
    invoke-static {p0, p1, p2, v0}, Ls4/b;->f(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static d(Landroid/content/Context;Ljava/lang/CharSequence;)Landroid/widget/Toast;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {p0, p1, v0, v1}, Ls4/b;->f(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static e(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, p1, p2, v0}, Ls4/b;->f(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public static f(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;
    .locals 9

    .line 1
    sget v0, Lcom/xuexiang/xui/R$drawable;->xtoast_ic_clear_white_24dp:I

    .line 2
    .line 3
    invoke-static {p0, v0}, Ls4/a;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    sget v0, Lcom/xuexiang/xui/R$color;->toast_error_color:I

    .line 8
    .line 9
    invoke-static {p0, v0}, Ls4/a;->a(Landroid/content/Context;I)I

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    sget v0, Lcom/xuexiang/xui/R$color;->toast_default_text_color:I

    .line 14
    .line 15
    invoke-static {p0, v0}, Ls4/a;->a(Landroid/content/Context;I)I

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
    invoke-static/range {v1 .. v8}, Ls4/b;->a(Landroid/content/Context;Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;IIIZZ)Landroid/widget/Toast;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public static g(Landroid/content/Context;I)Landroid/widget/Toast;
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
    invoke-static {p0, p1, v0, v1}, Ls4/b;->k(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static h(Landroid/content/Context;II)Landroid/widget/Toast;
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
    invoke-static {p0, p1, p2, v0}, Ls4/b;->k(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static i(Landroid/content/Context;Ljava/lang/CharSequence;)Landroid/widget/Toast;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {p0, p1, v0, v1}, Ls4/b;->k(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static j(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, p1, p2, v0}, Ls4/b;->k(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public static k(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;
    .locals 9

    .line 1
    sget v0, Lcom/xuexiang/xui/R$drawable;->xtoast_ic_info_outline_white_24dp:I

    .line 2
    .line 3
    invoke-static {p0, v0}, Ls4/a;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    sget v0, Lcom/xuexiang/xui/R$color;->toast_info_color:I

    .line 8
    .line 9
    invoke-static {p0, v0}, Ls4/a;->a(Landroid/content/Context;I)I

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    sget v0, Lcom/xuexiang/xui/R$color;->toast_default_text_color:I

    .line 14
    .line 15
    invoke-static {p0, v0}, Ls4/a;->a(Landroid/content/Context;I)I

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
    invoke-static/range {v1 .. v8}, Ls4/b;->a(Landroid/content/Context;Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;IIIZZ)Landroid/widget/Toast;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public static l(Landroid/content/Context;I)Landroid/widget/Toast;
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
    invoke-static {p0, p1, v0, v1, v0}, Ls4/b;->p(Landroid/content/Context;Ljava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Z)Landroid/widget/Toast;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static m(Landroid/content/Context;II)Landroid/widget/Toast;
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
    invoke-static {p0, p1, p2, v0, v1}, Ls4/b;->p(Landroid/content/Context;Ljava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Z)Landroid/widget/Toast;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static n(Landroid/content/Context;Ljava/lang/CharSequence;)Landroid/widget/Toast;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-static {p0, p1, v0, v1, v0}, Ls4/b;->p(Landroid/content/Context;Ljava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Z)Landroid/widget/Toast;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static o(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-static {p0, p1, p2, v0, v1}, Ls4/b;->p(Landroid/content/Context;Ljava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Z)Landroid/widget/Toast;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static p(Landroid/content/Context;Ljava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Z)Landroid/widget/Toast;
    .locals 9

    .line 1
    sget v0, Lcom/xuexiang/xui/R$color;->toast_normal_tint_color:I

    .line 2
    .line 3
    invoke-static {p0, v0}, Ls4/a;->a(Landroid/content/Context;I)I

    .line 4
    .line 5
    .line 6
    move-result v4

    .line 7
    sget v0, Lcom/xuexiang/xui/R$color;->toast_default_text_color:I

    .line 8
    .line 9
    invoke-static {p0, v0}, Ls4/a;->a(Landroid/content/Context;I)I

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
    invoke-static/range {v1 .. v8}, Ls4/b;->a(Landroid/content/Context;Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;IIIZZ)Landroid/widget/Toast;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public static q(Landroid/content/Context;I)Landroid/widget/Toast;
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
    invoke-static {p0, p1, v0, v1}, Ls4/b;->u(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static r(Landroid/content/Context;II)Landroid/widget/Toast;
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
    invoke-static {p0, p1, p2, v0}, Ls4/b;->u(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static s(Landroid/content/Context;Ljava/lang/CharSequence;)Landroid/widget/Toast;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {p0, p1, v0, v1}, Ls4/b;->u(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static t(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, p1, p2, v0}, Ls4/b;->u(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public static u(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;
    .locals 9

    .line 1
    sget v0, Lcom/xuexiang/xui/R$drawable;->xtoast_ic_check_white_24dp:I

    .line 2
    .line 3
    invoke-static {p0, v0}, Ls4/a;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    sget v0, Lcom/xuexiang/xui/R$color;->toast_success_color:I

    .line 8
    .line 9
    invoke-static {p0, v0}, Ls4/a;->a(Landroid/content/Context;I)I

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    sget v0, Lcom/xuexiang/xui/R$color;->toast_default_text_color:I

    .line 14
    .line 15
    invoke-static {p0, v0}, Ls4/a;->a(Landroid/content/Context;I)I

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
    invoke-static/range {v1 .. v8}, Ls4/b;->a(Landroid/content/Context;Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;IIIZZ)Landroid/widget/Toast;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public static v(Landroid/content/Context;I)Landroid/widget/Toast;
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
    invoke-static {p0, p1, v0, v1}, Ls4/b;->z(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static w(Landroid/content/Context;II)Landroid/widget/Toast;
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
    invoke-static {p0, p1, p2, v0}, Ls4/b;->z(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static x(Landroid/content/Context;Ljava/lang/CharSequence;)Landroid/widget/Toast;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {p0, p1, v0, v1}, Ls4/b;->z(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static y(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, p1, p2, v0}, Ls4/b;->z(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public static z(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;
    .locals 9

    .line 1
    sget v0, Lcom/xuexiang/xui/R$drawable;->xtoast_ic_error_outline_white_24dp:I

    .line 2
    .line 3
    invoke-static {p0, v0}, Ls4/a;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    sget v0, Lcom/xuexiang/xui/R$color;->toast_warning_color:I

    .line 8
    .line 9
    invoke-static {p0, v0}, Ls4/a;->a(Landroid/content/Context;I)I

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    sget v0, Lcom/xuexiang/xui/R$color;->toast_default_text_color:I

    .line 14
    .line 15
    invoke-static {p0, v0}, Ls4/a;->a(Landroid/content/Context;I)I

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
    invoke-static/range {v1 .. v8}, Ls4/b;->a(Landroid/content/Context;Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;IIIZZ)Landroid/widget/Toast;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method
