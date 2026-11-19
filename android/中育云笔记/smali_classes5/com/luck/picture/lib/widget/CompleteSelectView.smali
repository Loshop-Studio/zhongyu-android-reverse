.class public Lcom/luck/picture/lib/widget/CompleteSelectView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field public c:Landroid/widget/TextView;

.field public d:Landroid/widget/TextView;

.field public e:Landroid/view/animation/Animation;

.field public f:Lcom/luck/picture/lib/config/PictureSelectionConfig;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {p0}, Lcom/luck/picture/lib/widget/CompleteSelectView;->b()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    invoke-virtual {p0}, Lcom/luck/picture/lib/widget/CompleteSelectView;->b()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 5
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    invoke-virtual {p0}, Lcom/luck/picture/lib/widget/CompleteSelectView;->b()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget v1, Lcom/luck/picture/lib/R$layout;->ps_complete_selected_layout:I

    .line 10
    .line 11
    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/widget/CompleteSelectView;->a()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 6
    .line 7
    .line 8
    sget v0, Lcom/luck/picture/lib/R$id;->ps_tv_select_num:I

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Landroid/widget/TextView;

    .line 15
    .line 16
    iput-object v0, p0, Lcom/luck/picture/lib/widget/CompleteSelectView;->c:Landroid/widget/TextView;

    .line 17
    .line 18
    sget v0, Lcom/luck/picture/lib/R$id;->ps_tv_complete:I

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Landroid/widget/TextView;

    .line 25
    .line 26
    iput-object v0, p0, Lcom/luck/picture/lib/widget/CompleteSelectView;->d:Landroid/widget/TextView;

    .line 27
    .line 28
    const/16 v0, 0x10

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sget v1, Lcom/luck/picture/lib/R$anim;->ps_anim_modal_in:I

    .line 38
    .line 39
    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, Lcom/luck/picture/lib/widget/CompleteSelectView;->e:Landroid/view/animation/Animation;

    .line 44
    .line 45
    invoke-static {}, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iput-object v0, p0, Lcom/luck/picture/lib/widget/CompleteSelectView;->f:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 50
    .line 51
    return-void
.end method

.method public c()V
    .locals 6

    .line 1
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz6/a;->c()Lcom/luck/picture/lib/style/SelectMainStyle;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lcom/luck/picture/lib/style/SelectMainStyle;->L()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-static {v2}, La7/o;->c(I)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/luck/picture/lib/style/SelectMainStyle;->L()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-virtual {p0, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {v1}, Lcom/luck/picture/lib/style/SelectMainStyle;->M()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-static {v2}, La7/o;->f(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_2

    .line 33
    .line 34
    invoke-static {v2}, La7/o;->e(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_1

    .line 39
    .line 40
    iget-object v3, p0, Lcom/luck/picture/lib/widget/CompleteSelectView;->d:Landroid/widget/TextView;

    .line 41
    .line 42
    invoke-static {}, Lu6/a;->l()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    iget-object v5, p0, Lcom/luck/picture/lib/widget/CompleteSelectView;->f:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 51
    .line 52
    iget v5, v5, Lcom/luck/picture/lib/config/PictureSelectionConfig;->m:I

    .line 53
    .line 54
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    filled-new-array {v4, v5}, [Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-static {v2, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    iget-object v3, p0, Lcom/luck/picture/lib/widget/CompleteSelectView;->d:Landroid/widget/TextView;

    .line 71
    .line 72
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    :goto_0
    invoke-virtual {v1}, Lcom/luck/picture/lib/style/SelectMainStyle;->O()I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    invoke-static {v2}, La7/o;->b(I)Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-eqz v3, :cond_3

    .line 84
    .line 85
    iget-object v3, p0, Lcom/luck/picture/lib/widget/CompleteSelectView;->d:Landroid/widget/TextView;

    .line 86
    .line 87
    int-to-float v2, v2

    .line 88
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 89
    .line 90
    .line 91
    :cond_3
    invoke-virtual {v1}, Lcom/luck/picture/lib/style/SelectMainStyle;->N()I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    invoke-static {v1}, La7/o;->c(I)Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-eqz v2, :cond_4

    .line 100
    .line 101
    iget-object v2, p0, Lcom/luck/picture/lib/widget/CompleteSelectView;->d:Landroid/widget/TextView;

    .line 102
    .line 103
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 104
    .line 105
    .line 106
    :cond_4
    invoke-virtual {v0}, Lz6/a;->b()Lcom/luck/picture/lib/style/BottomNavBarStyle;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/BottomNavBarStyle;->v()Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-eqz v1, :cond_7

    .line 115
    .line 116
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/BottomNavBarStyle;->s()I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    invoke-static {v1}, La7/o;->c(I)Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-eqz v2, :cond_5

    .line 125
    .line 126
    iget-object v2, p0, Lcom/luck/picture/lib/widget/CompleteSelectView;->c:Landroid/widget/TextView;

    .line 127
    .line 128
    invoke-virtual {v2, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 129
    .line 130
    .line 131
    :cond_5
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/BottomNavBarStyle;->u()I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    invoke-static {v1}, La7/o;->b(I)Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-eqz v2, :cond_6

    .line 140
    .line 141
    iget-object v2, p0, Lcom/luck/picture/lib/widget/CompleteSelectView;->c:Landroid/widget/TextView;

    .line 142
    .line 143
    int-to-float v1, v1

    .line 144
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 145
    .line 146
    .line 147
    :cond_6
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/BottomNavBarStyle;->t()I

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    invoke-static {v0}, La7/o;->c(I)Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-eqz v1, :cond_7

    .line 156
    .line 157
    iget-object v1, p0, Lcom/luck/picture/lib/widget/CompleteSelectView;->c:Landroid/widget/TextView;

    .line 158
    .line 159
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 160
    .line 161
    .line 162
    :cond_7
    return-void
.end method

.method public setSelectedChange(Z)V
    .locals 6

    .line 1
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz6/a;->c()Lcom/luck/picture/lib/style/SelectMainStyle;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {}, Lu6/a;->l()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x1

    .line 12
    const/16 v4, 0x8

    .line 13
    .line 14
    if-lez v2, :cond_9

    .line 15
    .line 16
    invoke-virtual {p0, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/luck/picture/lib/style/SelectMainStyle;->K()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-static {p1}, La7/o;->c(I)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    sget p1, Lcom/luck/picture/lib/R$drawable;->ps_ic_trans_1px:I

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-virtual {v1}, Lcom/luck/picture/lib/style/SelectMainStyle;->P()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {p1}, La7/o;->f(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    invoke-static {p1}, La7/o;->e(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_1

    .line 53
    .line 54
    iget-object v2, p0, Lcom/luck/picture/lib/widget/CompleteSelectView;->d:Landroid/widget/TextView;

    .line 55
    .line 56
    invoke-static {}, Lu6/a;->l()I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    iget-object v5, p0, Lcom/luck/picture/lib/widget/CompleteSelectView;->f:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 65
    .line 66
    iget v5, v5, Lcom/luck/picture/lib/config/PictureSelectionConfig;->m:I

    .line 67
    .line 68
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    filled-new-array {v3, v5}, [Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-static {p1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    iget-object v2, p0, Lcom/luck/picture/lib/widget/CompleteSelectView;->d:Landroid/widget/TextView;

    .line 85
    .line 86
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    iget-object p1, p0, Lcom/luck/picture/lib/widget/CompleteSelectView;->d:Landroid/widget/TextView;

    .line 91
    .line 92
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    sget v3, Lcom/luck/picture/lib/R$string;->ps_completed:I

    .line 97
    .line 98
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 103
    .line 104
    .line 105
    :goto_1
    invoke-virtual {v1}, Lcom/luck/picture/lib/style/SelectMainStyle;->R()I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    invoke-static {p1}, La7/o;->b(I)Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-eqz v2, :cond_3

    .line 114
    .line 115
    iget-object v2, p0, Lcom/luck/picture/lib/widget/CompleteSelectView;->d:Landroid/widget/TextView;

    .line 116
    .line 117
    int-to-float p1, p1

    .line 118
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 119
    .line 120
    .line 121
    :cond_3
    invoke-virtual {v1}, Lcom/luck/picture/lib/style/SelectMainStyle;->Q()I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    invoke-static {p1}, La7/o;->c(I)Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-eqz v1, :cond_4

    .line 130
    .line 131
    iget-object v1, p0, Lcom/luck/picture/lib/widget/CompleteSelectView;->d:Landroid/widget/TextView;

    .line 132
    .line 133
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_4
    iget-object p1, p0, Lcom/luck/picture/lib/widget/CompleteSelectView;->d:Landroid/widget/TextView;

    .line 138
    .line 139
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    sget v2, Lcom/luck/picture/lib/R$color;->ps_color_fa632d:I

    .line 144
    .line 145
    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 150
    .line 151
    .line 152
    :goto_2
    invoke-virtual {v0}, Lz6/a;->b()Lcom/luck/picture/lib/style/BottomNavBarStyle;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-virtual {p1}, Lcom/luck/picture/lib/style/BottomNavBarStyle;->v()Z

    .line 157
    .line 158
    .line 159
    move-result p1

    .line 160
    if-eqz p1, :cond_8

    .line 161
    .line 162
    iget-object p1, p0, Lcom/luck/picture/lib/widget/CompleteSelectView;->c:Landroid/widget/TextView;

    .line 163
    .line 164
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    if-eq p1, v4, :cond_5

    .line 169
    .line 170
    iget-object p1, p0, Lcom/luck/picture/lib/widget/CompleteSelectView;->c:Landroid/widget/TextView;

    .line 171
    .line 172
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 173
    .line 174
    .line 175
    move-result p1

    .line 176
    const/4 v0, 0x4

    .line 177
    if-ne p1, v0, :cond_6

    .line 178
    .line 179
    :cond_5
    iget-object p1, p0, Lcom/luck/picture/lib/widget/CompleteSelectView;->c:Landroid/widget/TextView;

    .line 180
    .line 181
    const/4 v0, 0x0

    .line 182
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 183
    .line 184
    .line 185
    :cond_6
    invoke-static {}, Lu6/a;->l()I

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    invoke-static {p1}, La7/q;->g(Ljava/lang/Object;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    iget-object v0, p0, Lcom/luck/picture/lib/widget/CompleteSelectView;->c:Landroid/widget/TextView;

    .line 198
    .line 199
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    if-eqz p1, :cond_7

    .line 208
    .line 209
    goto/16 :goto_7

    .line 210
    .line 211
    :cond_7
    iget-object p1, p0, Lcom/luck/picture/lib/widget/CompleteSelectView;->c:Landroid/widget/TextView;

    .line 212
    .line 213
    invoke-static {}, Lu6/a;->l()I

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-static {v0}, La7/q;->g(Ljava/lang/Object;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 226
    .line 227
    .line 228
    iget-object p1, p0, Lcom/luck/picture/lib/widget/CompleteSelectView;->c:Landroid/widget/TextView;

    .line 229
    .line 230
    iget-object v0, p0, Lcom/luck/picture/lib/widget/CompleteSelectView;->e:Landroid/view/animation/Animation;

    .line 231
    .line 232
    invoke-virtual {p1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 233
    .line 234
    .line 235
    return-void

    .line 236
    :cond_8
    iget-object p1, p0, Lcom/luck/picture/lib/widget/CompleteSelectView;->c:Landroid/widget/TextView;

    .line 237
    .line 238
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 239
    .line 240
    .line 241
    return-void

    .line 242
    :cond_9
    if-eqz p1, :cond_c

    .line 243
    .line 244
    invoke-virtual {v1}, Lcom/luck/picture/lib/style/SelectMainStyle;->U()Z

    .line 245
    .line 246
    .line 247
    move-result p1

    .line 248
    if-eqz p1, :cond_c

    .line 249
    .line 250
    invoke-virtual {p0, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v1}, Lcom/luck/picture/lib/style/SelectMainStyle;->K()I

    .line 254
    .line 255
    .line 256
    move-result p1

    .line 257
    invoke-static {p1}, La7/o;->c(I)Z

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    if-eqz v0, :cond_a

    .line 262
    .line 263
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 264
    .line 265
    .line 266
    goto :goto_3

    .line 267
    :cond_a
    sget p1, Lcom/luck/picture/lib/R$drawable;->ps_ic_trans_1px:I

    .line 268
    .line 269
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 270
    .line 271
    .line 272
    :goto_3
    invoke-virtual {v1}, Lcom/luck/picture/lib/style/SelectMainStyle;->Q()I

    .line 273
    .line 274
    .line 275
    move-result p1

    .line 276
    invoke-static {p1}, La7/o;->c(I)Z

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    if-eqz v0, :cond_b

    .line 281
    .line 282
    iget-object v0, p0, Lcom/luck/picture/lib/widget/CompleteSelectView;->d:Landroid/widget/TextView;

    .line 283
    .line 284
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 285
    .line 286
    .line 287
    goto :goto_5

    .line 288
    :cond_b
    iget-object p1, p0, Lcom/luck/picture/lib/widget/CompleteSelectView;->d:Landroid/widget/TextView;

    .line 289
    .line 290
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    sget v2, Lcom/luck/picture/lib/R$color;->ps_color_9b:I

    .line 295
    .line 296
    invoke-static {v0, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 297
    .line 298
    .line 299
    move-result v0

    .line 300
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 301
    .line 302
    .line 303
    goto :goto_5

    .line 304
    :cond_c
    iget-object p1, p0, Lcom/luck/picture/lib/widget/CompleteSelectView;->f:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 305
    .line 306
    iget-boolean p1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->O:Z

    .line 307
    .line 308
    invoke-virtual {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v1}, Lcom/luck/picture/lib/style/SelectMainStyle;->L()I

    .line 312
    .line 313
    .line 314
    move-result p1

    .line 315
    invoke-static {p1}, La7/o;->c(I)Z

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    if-eqz v0, :cond_d

    .line 320
    .line 321
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 322
    .line 323
    .line 324
    goto :goto_4

    .line 325
    :cond_d
    sget p1, Lcom/luck/picture/lib/R$drawable;->ps_ic_trans_1px:I

    .line 326
    .line 327
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 328
    .line 329
    .line 330
    :goto_4
    invoke-virtual {v1}, Lcom/luck/picture/lib/style/SelectMainStyle;->N()I

    .line 331
    .line 332
    .line 333
    move-result p1

    .line 334
    invoke-static {p1}, La7/o;->c(I)Z

    .line 335
    .line 336
    .line 337
    move-result v0

    .line 338
    if-eqz v0, :cond_e

    .line 339
    .line 340
    iget-object v0, p0, Lcom/luck/picture/lib/widget/CompleteSelectView;->d:Landroid/widget/TextView;

    .line 341
    .line 342
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 343
    .line 344
    .line 345
    goto :goto_5

    .line 346
    :cond_e
    iget-object p1, p0, Lcom/luck/picture/lib/widget/CompleteSelectView;->d:Landroid/widget/TextView;

    .line 347
    .line 348
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    sget v2, Lcom/luck/picture/lib/R$color;->ps_color_9b:I

    .line 353
    .line 354
    invoke-static {v0, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 355
    .line 356
    .line 357
    move-result v0

    .line 358
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 359
    .line 360
    .line 361
    :goto_5
    iget-object p1, p0, Lcom/luck/picture/lib/widget/CompleteSelectView;->c:Landroid/widget/TextView;

    .line 362
    .line 363
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v1}, Lcom/luck/picture/lib/style/SelectMainStyle;->M()Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object p1

    .line 370
    invoke-static {p1}, La7/o;->f(Ljava/lang/String;)Z

    .line 371
    .line 372
    .line 373
    move-result v0

    .line 374
    if-eqz v0, :cond_10

    .line 375
    .line 376
    invoke-static {p1}, La7/o;->e(Ljava/lang/String;)Z

    .line 377
    .line 378
    .line 379
    move-result v0

    .line 380
    if-eqz v0, :cond_f

    .line 381
    .line 382
    iget-object v0, p0, Lcom/luck/picture/lib/widget/CompleteSelectView;->d:Landroid/widget/TextView;

    .line 383
    .line 384
    invoke-static {}, Lu6/a;->l()I

    .line 385
    .line 386
    .line 387
    move-result v2

    .line 388
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    iget-object v3, p0, Lcom/luck/picture/lib/widget/CompleteSelectView;->f:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 393
    .line 394
    iget v3, v3, Lcom/luck/picture/lib/config/PictureSelectionConfig;->m:I

    .line 395
    .line 396
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 397
    .line 398
    .line 399
    move-result-object v3

    .line 400
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v2

    .line 404
    invoke-static {p1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object p1

    .line 408
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 409
    .line 410
    .line 411
    goto :goto_6

    .line 412
    :cond_f
    iget-object v0, p0, Lcom/luck/picture/lib/widget/CompleteSelectView;->d:Landroid/widget/TextView;

    .line 413
    .line 414
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 415
    .line 416
    .line 417
    goto :goto_6

    .line 418
    :cond_10
    iget-object p1, p0, Lcom/luck/picture/lib/widget/CompleteSelectView;->d:Landroid/widget/TextView;

    .line 419
    .line 420
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    sget v2, Lcom/luck/picture/lib/R$string;->ps_please_select:I

    .line 425
    .line 426
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 431
    .line 432
    .line 433
    :goto_6
    invoke-virtual {v1}, Lcom/luck/picture/lib/style/SelectMainStyle;->O()I

    .line 434
    .line 435
    .line 436
    move-result p1

    .line 437
    invoke-static {p1}, La7/o;->b(I)Z

    .line 438
    .line 439
    .line 440
    move-result v0

    .line 441
    if-eqz v0, :cond_11

    .line 442
    .line 443
    iget-object v0, p0, Lcom/luck/picture/lib/widget/CompleteSelectView;->d:Landroid/widget/TextView;

    .line 444
    .line 445
    int-to-float p1, p1

    .line 446
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 447
    .line 448
    .line 449
    :cond_11
    :goto_7
    return-void
.end method
