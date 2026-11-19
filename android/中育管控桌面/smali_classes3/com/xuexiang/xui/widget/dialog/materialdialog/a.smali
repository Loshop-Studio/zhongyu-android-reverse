.class public Lcom/xuexiang/xui/widget/dialog/materialdialog/a;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/dialog/materialdialog/a$b;,
        Lcom/xuexiang/xui/widget/dialog/materialdialog/a$c;
    }
.end annotation


# instance fields
.field public final a:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

.field public final b:I

.field public final c:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

.field public d:Lcom/xuexiang/xui/widget/dialog/materialdialog/a$c;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 5
    .line 6
    iput p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->b:I

    .line 7
    .line 8
    iget-object p1, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 9
    .line 10
    iget-object p1, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->f:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 11
    .line 12
    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 13
    .line 14
    return-void
.end method

.method public static synthetic b(Lcom/xuexiang/xui/widget/dialog/materialdialog/a;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic c(Lcom/xuexiang/xui/widget/dialog/materialdialog/a;)Lcom/xuexiang/xui/widget/dialog/materialdialog/a$c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->d:Lcom/xuexiang/xui/widget/dialog/materialdialog/a$c;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final d()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->g()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->f()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x1

    .line 24
    if-ne v0, v1, :cond_0

    .line 25
    .line 26
    return v1

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    return v0
.end method

.method public e(Lcom/xuexiang/xui/widget/dialog/materialdialog/a$b;I)V
    .locals 10

    .line 1
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 2
    .line 3
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 8
    .line 9
    iget-object v2, v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 10
    .line 11
    iget-object v2, v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->I:[Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-static {v1, v2}, Lcom/xuexiang/xui/utils/g;->i(Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 20
    .line 21
    iget-object v2, v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 22
    .line 23
    iget v2, v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->Z:I

    .line 24
    .line 25
    const v3, 0x3ecccccd    # 0.4f

    .line 26
    .line 27
    .line 28
    invoke-static {v2, v3}, Lcom/xuexiang/xui/utils/g;->a(IF)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-object v2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 34
    .line 35
    iget-object v2, v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 36
    .line 37
    iget v2, v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->Z:I

    .line 38
    .line 39
    :goto_0
    iget-object v3, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 40
    .line 41
    xor-int/lit8 v4, v1, 0x1

    .line 42
    .line 43
    invoke-virtual {v3, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 44
    .line 45
    .line 46
    sget-object v3, Lcom/xuexiang/xui/widget/dialog/materialdialog/a$a;->a:[I

    .line 47
    .line 48
    iget-object v4, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 49
    .line 50
    iget-object v4, v4, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->t:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$ListType;

    .line 51
    .line 52
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    aget v3, v3, v4

    .line 57
    .line 58
    const/4 v4, 0x2

    .line 59
    const/4 v5, 0x0

    .line 60
    const/4 v6, 0x1

    .line 61
    if-eq v3, v6, :cond_3

    .line 62
    .line 63
    if-eq v3, v4, :cond_1

    .line 64
    .line 65
    goto :goto_4

    .line 66
    :cond_1
    iget-object v3, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/a$b;->a:Landroid/widget/CompoundButton;

    .line 67
    .line 68
    check-cast v3, Landroid/widget/CheckBox;

    .line 69
    .line 70
    iget-object v7, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 71
    .line 72
    iget-object v7, v7, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->u:Ljava/util/List;

    .line 73
    .line 74
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    invoke-interface {v7, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    iget-object v8, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 83
    .line 84
    iget-object v8, v8, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 85
    .line 86
    iget-object v9, v8, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->u:Landroid/content/res/ColorStateList;

    .line 87
    .line 88
    if-eqz v9, :cond_2

    .line 89
    .line 90
    invoke-static {v3, v9}, Lb2/b;->d(Landroid/widget/CheckBox;Landroid/content/res/ColorStateList;)V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_2
    iget v8, v8, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t:I

    .line 95
    .line 96
    invoke-static {v3, v8}, Lb2/b;->c(Landroid/widget/CheckBox;I)V

    .line 97
    .line 98
    .line 99
    :goto_1
    invoke-virtual {v3, v7}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 100
    .line 101
    .line 102
    xor-int/2addr v1, v6

    .line 103
    invoke-virtual {v3, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 104
    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_3
    iget-object v3, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/a$b;->a:Landroid/widget/CompoundButton;

    .line 108
    .line 109
    check-cast v3, Landroid/widget/RadioButton;

    .line 110
    .line 111
    iget-object v7, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 112
    .line 113
    iget-object v7, v7, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 114
    .line 115
    iget v8, v7, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->G:I

    .line 116
    .line 117
    if-ne v8, p2, :cond_4

    .line 118
    .line 119
    move v8, v6

    .line 120
    goto :goto_2

    .line 121
    :cond_4
    move v8, v5

    .line 122
    :goto_2
    iget-object v9, v7, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->u:Landroid/content/res/ColorStateList;

    .line 123
    .line 124
    if-eqz v9, :cond_5

    .line 125
    .line 126
    invoke-static {v3, v9}, Lb2/b;->g(Landroid/widget/RadioButton;Landroid/content/res/ColorStateList;)V

    .line 127
    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_5
    iget v7, v7, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t:I

    .line 131
    .line 132
    invoke-static {v3, v7}, Lb2/b;->f(Landroid/widget/RadioButton;I)V

    .line 133
    .line 134
    .line 135
    :goto_3
    invoke-virtual {v3, v8}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 136
    .line 137
    .line 138
    xor-int/2addr v1, v6

    .line 139
    invoke-virtual {v3, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 140
    .line 141
    .line 142
    :goto_4
    iget-object v1, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/a$b;->b:Landroid/widget/TextView;

    .line 143
    .line 144
    iget-object v3, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 145
    .line 146
    iget-object v3, v3, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 147
    .line 148
    iget-object v3, v3, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->l:Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-virtual {v3, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    check-cast v3, Ljava/lang/CharSequence;

    .line 155
    .line 156
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 157
    .line 158
    .line 159
    iget-object v1, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/a$b;->b:Landroid/widget/TextView;

    .line 160
    .line 161
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 162
    .line 163
    .line 164
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 165
    .line 166
    iget-object p1, p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/a$b;->b:Landroid/widget/TextView;

    .line 167
    .line 168
    iget-object v2, v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 169
    .line 170
    iget-object v2, v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->K:Landroid/graphics/Typeface;

    .line 171
    .line 172
    invoke-virtual {v1, p1, v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->u(Landroid/widget/TextView;Landroid/graphics/Typeface;)V

    .line 173
    .line 174
    .line 175
    move-object p1, v0

    .line 176
    check-cast p1, Landroid/view/ViewGroup;

    .line 177
    .line 178
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->h(Landroid/view/ViewGroup;)V

    .line 179
    .line 180
    .line 181
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 182
    .line 183
    iget-object v1, v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 184
    .line 185
    iget-object v1, v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->m0:[I

    .line 186
    .line 187
    if-eqz v1, :cond_7

    .line 188
    .line 189
    array-length v2, v1

    .line 190
    if-ge p2, v2, :cond_6

    .line 191
    .line 192
    aget p2, v1, p2

    .line 193
    .line 194
    invoke-virtual {v0, p2}, Landroid/view/View;->setId(I)V

    .line 195
    .line 196
    .line 197
    goto :goto_5

    .line 198
    :cond_6
    const/4 p2, -0x1

    .line 199
    invoke-virtual {v0, p2}, Landroid/view/View;->setId(I)V

    .line 200
    .line 201
    .line 202
    :cond_7
    :goto_5
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 203
    .line 204
    .line 205
    move-result p2

    .line 206
    if-ne p2, v4, :cond_9

    .line 207
    .line 208
    invoke-virtual {p1, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 209
    .line 210
    .line 211
    move-result-object p2

    .line 212
    instance-of p2, p2, Landroid/widget/CompoundButton;

    .line 213
    .line 214
    const/4 v0, 0x0

    .line 215
    if-eqz p2, :cond_8

    .line 216
    .line 217
    invoke-virtual {p1, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 222
    .line 223
    .line 224
    return-void

    .line 225
    :cond_8
    invoke-virtual {p1, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 226
    .line 227
    .line 228
    move-result-object p2

    .line 229
    instance-of p2, p2, Landroid/widget/CompoundButton;

    .line 230
    .line 231
    if-eqz p2, :cond_9

    .line 232
    .line 233
    invoke-virtual {p1, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 238
    .line 239
    .line 240
    :cond_9
    return-void
.end method

.method public f(Landroid/view/ViewGroup;I)Lcom/xuexiang/xui/widget/dialog/materialdialog/a$b;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    iget v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->b:I

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object p2, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 17
    .line 18
    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->k()Landroid/graphics/drawable/Drawable;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-static {p1, p2}, Lcom/xuexiang/xui/utils/g;->v(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 23
    .line 24
    .line 25
    new-instance p2, Lcom/xuexiang/xui/widget/dialog/materialdialog/a$b;

    .line 26
    .line 27
    invoke-direct {p2, p1, p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/a$b;-><init>(Landroid/view/View;Lcom/xuexiang/xui/widget/dialog/materialdialog/a;)V

    .line 28
    .line 29
    .line 30
    return-object p2
.end method

.method public g(Lcom/xuexiang/xui/widget/dialog/materialdialog/a$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->d:Lcom/xuexiang/xui/widget/dialog/materialdialog/a$c;

    .line 2
    .line 3
    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 4
    .line 5
    iget-object v0, v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->l:Ljava/util/ArrayList;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0
.end method

.method public final h(Landroid/view/ViewGroup;)V
    .locals 6

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Landroid/widget/LinearLayout;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 5
    .line 6
    invoke-virtual {v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->a()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    or-int/lit8 v1, v1, 0x10

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x2

    .line 20
    if-ne v0, v1, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 23
    .line 24
    sget-object v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    if-ne v0, v1, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->d()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    instance-of v0, v0, Landroid/widget/CompoundButton;

    .line 40
    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Landroid/widget/CompoundButton;

    .line 48
    .line 49
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Landroid/widget/TextView;

    .line 57
    .line 58
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 88
    .line 89
    sget-object v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 90
    .line 91
    if-ne v0, v1, :cond_1

    .line 92
    .line 93
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->d()Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_1

    .line 98
    .line 99
    const/4 v0, 0x1

    .line 100
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    instance-of v1, v1, Landroid/widget/CompoundButton;

    .line 105
    .line 106
    if-eqz v1, :cond_1

    .line 107
    .line 108
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    check-cast v0, Landroid/widget/CompoundButton;

    .line 113
    .line 114
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    check-cast v1, Landroid/widget/TextView;

    .line 122
    .line 123
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 149
    .line 150
    .line 151
    :cond_1
    return-void
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/a$b;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->e(Lcom/xuexiang/xui/widget/dialog/materialdialog/a$b;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/a;->f(Landroid/view/ViewGroup;I)Lcom/xuexiang/xui/widget/dialog/materialdialog/a$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
