.class public Lcom/luck/picture/lib/widget/BottomNavBar;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/luck/picture/lib/widget/BottomNavBar$b;
    }
.end annotation


# instance fields
.field public c:Landroid/widget/TextView;

.field public d:Landroid/widget/TextView;

.field public e:Landroid/widget/CheckBox;

.field public f:Lcom/luck/picture/lib/config/PictureSelectionConfig;

.field public g:Lcom/luck/picture/lib/widget/BottomNavBar$b;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {p0}, Lcom/luck/picture/lib/widget/BottomNavBar;->e()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    invoke-virtual {p0}, Lcom/luck/picture/lib/widget/BottomNavBar;->e()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    invoke-virtual {p0}, Lcom/luck/picture/lib/widget/BottomNavBar;->e()V

    return-void
.end method

.method public static synthetic a(Lcom/luck/picture/lib/widget/BottomNavBar;)Landroid/widget/CheckBox;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->e:Landroid/widget/CheckBox;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final b()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->f:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->C0:Z

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    move-wide v3, v0

    .line 11
    :goto_0
    invoke-static {}, Lu6/a;->l()I

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    if-ge v2, v5, :cond_0

    .line 16
    .line 17
    invoke-static {}, Lu6/a;->n()Ljava/util/ArrayList;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    check-cast v5, Lcom/luck/picture/lib/entity/LocalMedia;

    .line 26
    .line 27
    invoke-virtual {v5}, Lcom/luck/picture/lib/entity/LocalMedia;->B()J

    .line 28
    .line 29
    .line 30
    move-result-wide v5

    .line 31
    add-long/2addr v3, v5

    .line 32
    add-int/lit8 v2, v2, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    cmp-long v0, v3, v0

    .line 36
    .line 37
    if-lez v0, :cond_1

    .line 38
    .line 39
    invoke-static {v3, v4}, La7/i;->e(J)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v1, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->e:Landroid/widget/CheckBox;

    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    sget v3, Lcom/luck/picture/lib/R$string;->ps_original_image:I

    .line 50
    .line 51
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v2, v3, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_1
    iget-object v0, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->e:Landroid/widget/CheckBox;

    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    sget v2, Lcom/luck/picture/lib/R$string;->ps_default_original_image:I

    .line 70
    .line 71
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_2
    iget-object v0, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->e:Landroid/widget/CheckBox;

    .line 80
    .line 81
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    sget v2, Lcom/luck/picture/lib/R$string;->ps_default_original_image:I

    .line 86
    .line 87
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public c()V
    .locals 0

    .line 1
    return-void
.end method

.method public d()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Lcom/luck/picture/lib/R$layout;->ps_bottom_nav_bar:I

    .line 6
    .line 7
    invoke-static {v0, v1, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public e()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/widget/BottomNavBar;->d()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-virtual {p0, v0}, Landroid/view/View;->setClickable(Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->f:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 16
    .line 17
    sget v0, Lcom/luck/picture/lib/R$id;->ps_tv_preview:I

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Landroid/widget/TextView;

    .line 24
    .line 25
    iput-object v0, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->c:Landroid/widget/TextView;

    .line 26
    .line 27
    sget v0, Lcom/luck/picture/lib/R$id;->ps_tv_editor:I

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Landroid/widget/TextView;

    .line 34
    .line 35
    iput-object v0, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->d:Landroid/widget/TextView;

    .line 36
    .line 37
    sget v0, Lcom/luck/picture/lib/R$id;->cb_original:I

    .line 38
    .line 39
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Landroid/widget/CheckBox;

    .line 44
    .line 45
    iput-object v0, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->e:Landroid/widget/CheckBox;

    .line 46
    .line 47
    iget-object v0, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->c:Landroid/widget/TextView;

    .line 48
    .line 49
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->d:Landroid/widget/TextView;

    .line 53
    .line 54
    const/16 v1, 0x8

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sget v1, Lcom/luck/picture/lib/R$color;->ps_color_grey:I

    .line 64
    .line 65
    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->e:Landroid/widget/CheckBox;

    .line 73
    .line 74
    iget-object v1, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->f:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 75
    .line 76
    iget-boolean v1, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->T:Z

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 79
    .line 80
    .line 81
    iget-object v0, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->e:Landroid/widget/CheckBox;

    .line 82
    .line 83
    new-instance v1, Lcom/luck/picture/lib/widget/BottomNavBar$a;

    .line 84
    .line 85
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/widget/BottomNavBar$a;-><init>(Lcom/luck/picture/lib/widget/BottomNavBar;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Lcom/luck/picture/lib/widget/BottomNavBar;->c()V

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public f()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->f:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->e:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/16 v0, 0x8

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    .line 14
    .line 15
    invoke-virtual {v0}, Lz6/a;->b()Lcom/luck/picture/lib/style/BottomNavBarStyle;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->f:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 20
    .line 21
    iget-boolean v1, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->C0:Z

    .line 22
    .line 23
    if-eqz v1, :cond_4

    .line 24
    .line 25
    iget-object v1, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->e:Landroid/widget/CheckBox;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/BottomNavBarStyle;->i()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-static {v1}, La7/o;->c(I)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    iget-object v2, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->e:Landroid/widget/CheckBox;

    .line 42
    .line 43
    invoke-virtual {v2, v1}, Landroid/widget/CompoundButton;->setButtonDrawable(I)V

    .line 44
    .line 45
    .line 46
    :cond_1
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/BottomNavBarStyle;->j()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-static {v1}, La7/o;->f(Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_2

    .line 55
    .line 56
    iget-object v2, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->e:Landroid/widget/CheckBox;

    .line 57
    .line 58
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    .line 60
    .line 61
    :cond_2
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/BottomNavBarStyle;->l()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    invoke-static {v1}, La7/o;->b(I)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_3

    .line 70
    .line 71
    iget-object v2, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->e:Landroid/widget/CheckBox;

    .line 72
    .line 73
    int-to-float v1, v1

    .line 74
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 75
    .line 76
    .line 77
    :cond_3
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/BottomNavBarStyle;->k()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    invoke-static {v1}, La7/o;->c(I)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-eqz v2, :cond_4

    .line 86
    .line 87
    iget-object v2, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->e:Landroid/widget/CheckBox;

    .line 88
    .line 89
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 90
    .line 91
    .line 92
    :cond_4
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/BottomNavBarStyle;->h()I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    invoke-static {v1}, La7/o;->b(I)Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-eqz v2, :cond_5

    .line 101
    .line 102
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    const/high16 v3, 0x42380000    # 46.0f

    .line 118
    .line 119
    invoke-static {v2, v3}, La7/e;->a(Landroid/content/Context;F)I

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 124
    .line 125
    :goto_0
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/BottomNavBarStyle;->g()I

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    invoke-static {v1}, La7/o;->c(I)Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-eqz v2, :cond_6

    .line 134
    .line 135
    invoke-virtual {p0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 136
    .line 137
    .line 138
    :cond_6
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/BottomNavBarStyle;->o()I

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    invoke-static {v1}, La7/o;->c(I)Z

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    if-eqz v2, :cond_7

    .line 147
    .line 148
    iget-object v2, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->c:Landroid/widget/TextView;

    .line 149
    .line 150
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 151
    .line 152
    .line 153
    :cond_7
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/BottomNavBarStyle;->p()I

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    invoke-static {v1}, La7/o;->b(I)Z

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    if-eqz v2, :cond_8

    .line 162
    .line 163
    iget-object v2, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->c:Landroid/widget/TextView;

    .line 164
    .line 165
    int-to-float v1, v1

    .line 166
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 167
    .line 168
    .line 169
    :cond_8
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/BottomNavBarStyle;->n()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-static {v1}, La7/o;->f(Ljava/lang/String;)Z

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    if-eqz v2, :cond_9

    .line 178
    .line 179
    iget-object v2, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->c:Landroid/widget/TextView;

    .line 180
    .line 181
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 182
    .line 183
    .line 184
    :cond_9
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/BottomNavBarStyle;->a()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-static {v1}, La7/o;->f(Ljava/lang/String;)Z

    .line 189
    .line 190
    .line 191
    move-result v2

    .line 192
    if-eqz v2, :cond_a

    .line 193
    .line 194
    iget-object v2, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->d:Landroid/widget/TextView;

    .line 195
    .line 196
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 197
    .line 198
    .line 199
    :cond_a
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/BottomNavBarStyle;->c()I

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    invoke-static {v1}, La7/o;->b(I)Z

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    if-eqz v2, :cond_b

    .line 208
    .line 209
    iget-object v2, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->d:Landroid/widget/TextView;

    .line 210
    .line 211
    int-to-float v1, v1

    .line 212
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 213
    .line 214
    .line 215
    :cond_b
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/BottomNavBarStyle;->b()I

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    invoke-static {v1}, La7/o;->c(I)Z

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    if-eqz v2, :cond_c

    .line 224
    .line 225
    iget-object v2, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->d:Landroid/widget/TextView;

    .line 226
    .line 227
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 228
    .line 229
    .line 230
    :cond_c
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/BottomNavBarStyle;->i()I

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    invoke-static {v1}, La7/o;->c(I)Z

    .line 235
    .line 236
    .line 237
    move-result v2

    .line 238
    if-eqz v2, :cond_d

    .line 239
    .line 240
    iget-object v2, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->e:Landroid/widget/CheckBox;

    .line 241
    .line 242
    invoke-virtual {v2, v1}, Landroid/widget/CompoundButton;->setButtonDrawable(I)V

    .line 243
    .line 244
    .line 245
    :cond_d
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/BottomNavBarStyle;->j()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    invoke-static {v1}, La7/o;->f(Ljava/lang/String;)Z

    .line 250
    .line 251
    .line 252
    move-result v2

    .line 253
    if-eqz v2, :cond_e

    .line 254
    .line 255
    iget-object v2, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->e:Landroid/widget/CheckBox;

    .line 256
    .line 257
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 258
    .line 259
    .line 260
    :cond_e
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/BottomNavBarStyle;->l()I

    .line 261
    .line 262
    .line 263
    move-result v1

    .line 264
    invoke-static {v1}, La7/o;->b(I)Z

    .line 265
    .line 266
    .line 267
    move-result v2

    .line 268
    if-eqz v2, :cond_f

    .line 269
    .line 270
    iget-object v2, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->e:Landroid/widget/CheckBox;

    .line 271
    .line 272
    int-to-float v1, v1

    .line 273
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 274
    .line 275
    .line 276
    :cond_f
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/BottomNavBarStyle;->k()I

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    invoke-static {v0}, La7/o;->c(I)Z

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    if-eqz v1, :cond_10

    .line 285
    .line 286
    iget-object v1, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->e:Landroid/widget/CheckBox;

    .line 287
    .line 288
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 289
    .line 290
    .line 291
    :cond_10
    return-void
.end method

.method public g()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->e:Landroid/widget/CheckBox;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->f:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 4
    .line 5
    iget-boolean v1, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->T:Z

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public h()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/widget/BottomNavBar;->b()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    .line 5
    .line 6
    invoke-virtual {v0}, Lz6/a;->b()Lcom/luck/picture/lib/style/BottomNavBarStyle;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {}, Lu6/a;->l()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-lez v1, :cond_3

    .line 15
    .line 16
    iget-object v1, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->c:Landroid/widget/TextView;

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/BottomNavBarStyle;->r()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-static {v1}, La7/o;->c(I)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    iget-object v2, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->c:Landroid/widget/TextView;

    .line 33
    .line 34
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object v1, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->c:Landroid/widget/TextView;

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    sget v3, Lcom/luck/picture/lib/R$color;->ps_color_fa632d:I

    .line 45
    .line 46
    invoke-static {v2, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 51
    .line 52
    .line 53
    :goto_0
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/BottomNavBarStyle;->q()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0}, La7/o;->f(Ljava/lang/String;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_2

    .line 62
    .line 63
    invoke-static {v0}, La7/o;->d(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_1

    .line 68
    .line 69
    iget-object v1, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->c:Landroid/widget/TextView;

    .line 70
    .line 71
    invoke-static {}, Lu6/a;->l()I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_1
    iget-object v1, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->c:Landroid/widget/TextView;

    .line 92
    .line 93
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_2
    iget-object v0, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->c:Landroid/widget/TextView;

    .line 98
    .line 99
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    sget v2, Lcom/luck/picture/lib/R$string;->ps_preview_num:I

    .line 104
    .line 105
    invoke-static {}, Lu6/a;->l()I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :cond_3
    iget-object v1, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->c:Landroid/widget/TextView;

    .line 126
    .line 127
    const/4 v2, 0x0

    .line 128
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/BottomNavBarStyle;->o()I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    invoke-static {v1}, La7/o;->c(I)Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-eqz v2, :cond_4

    .line 140
    .line 141
    iget-object v2, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->c:Landroid/widget/TextView;

    .line 142
    .line 143
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_4
    iget-object v1, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->c:Landroid/widget/TextView;

    .line 148
    .line 149
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    sget v3, Lcom/luck/picture/lib/R$color;->ps_color_9b:I

    .line 154
    .line 155
    invoke-static {v2, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 160
    .line 161
    .line 162
    :goto_1
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/BottomNavBarStyle;->n()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-static {v0}, La7/o;->f(Ljava/lang/String;)Z

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-eqz v1, :cond_5

    .line 171
    .line 172
    iget-object v1, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->c:Landroid/widget/TextView;

    .line 173
    .line 174
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 175
    .line 176
    .line 177
    return-void

    .line 178
    :cond_5
    iget-object v0, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->c:Landroid/widget/TextView;

    .line 179
    .line 180
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    sget v2, Lcom/luck/picture/lib/R$string;->ps_preview:I

    .line 185
    .line 186
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 191
    .line 192
    .line 193
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->g:Lcom/luck/picture/lib/widget/BottomNavBar$b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    sget v0, Lcom/luck/picture/lib/R$id;->ps_tv_preview:I

    .line 11
    .line 12
    if-ne p1, v0, :cond_1

    .line 13
    .line 14
    iget-object p1, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->g:Lcom/luck/picture/lib/widget/BottomNavBar$b;

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/luck/picture/lib/widget/BottomNavBar$b;->d()V

    .line 17
    .line 18
    .line 19
    :cond_1
    :goto_0
    return-void
.end method

.method public setOnBottomNavBarListener(Lcom/luck/picture/lib/widget/BottomNavBar$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/widget/BottomNavBar;->g:Lcom/luck/picture/lib/widget/BottomNavBar$b;

    .line 2
    .line 3
    return-void
.end method
