.class public Lcom/luck/picture/lib/widget/TitleBar;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/luck/picture/lib/widget/TitleBar$a;
    }
.end annotation


# instance fields
.field public c:Landroid/widget/RelativeLayout;

.field public d:Landroid/widget/ImageView;

.field public e:Landroid/widget/ImageView;

.field public f:Landroid/widget/ImageView;

.field public g:Lcom/luck/picture/lib/widget/MarqueeTextView;

.field public h:Landroid/widget/TextView;

.field public i:Landroid/view/View;

.field public j:Landroid/view/View;

.field public k:Lcom/luck/picture/lib/config/PictureSelectionConfig;

.field public l:Landroid/view/View;

.field public m:Landroid/widget/RelativeLayout;

.field public n:Lcom/luck/picture/lib/widget/TitleBar$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {p0}, Lcom/luck/picture/lib/widget/TitleBar;->c()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    invoke-virtual {p0}, Lcom/luck/picture/lib/widget/TitleBar;->c()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    invoke-virtual {p0}, Lcom/luck/picture/lib/widget/TitleBar;->c()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 1
    return-void
.end method

.method public b()V
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
    sget v1, Lcom/luck/picture/lib/R$layout;->ps_title_bar:I

    .line 10
    .line 11
    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public c()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/widget/TitleBar;->b()V

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
    iput-object v0, p0, Lcom/luck/picture/lib/widget/TitleBar;->k:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 16
    .line 17
    sget v0, Lcom/luck/picture/lib/R$id;->top_status_bar:I

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lcom/luck/picture/lib/widget/TitleBar;->l:Landroid/view/View;

    .line 24
    .line 25
    sget v0, Lcom/luck/picture/lib/R$id;->rl_title_bar:I

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Landroid/widget/RelativeLayout;

    .line 32
    .line 33
    iput-object v0, p0, Lcom/luck/picture/lib/widget/TitleBar;->m:Landroid/widget/RelativeLayout;

    .line 34
    .line 35
    sget v0, Lcom/luck/picture/lib/R$id;->ps_iv_left_back:I

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Landroid/widget/ImageView;

    .line 42
    .line 43
    iput-object v0, p0, Lcom/luck/picture/lib/widget/TitleBar;->d:Landroid/widget/ImageView;

    .line 44
    .line 45
    sget v0, Lcom/luck/picture/lib/R$id;->ps_rl_album_bg:I

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Landroid/widget/RelativeLayout;

    .line 52
    .line 53
    iput-object v0, p0, Lcom/luck/picture/lib/widget/TitleBar;->c:Landroid/widget/RelativeLayout;

    .line 54
    .line 55
    sget v0, Lcom/luck/picture/lib/R$id;->ps_iv_delete:I

    .line 56
    .line 57
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Landroid/widget/ImageView;

    .line 62
    .line 63
    iput-object v0, p0, Lcom/luck/picture/lib/widget/TitleBar;->f:Landroid/widget/ImageView;

    .line 64
    .line 65
    sget v0, Lcom/luck/picture/lib/R$id;->ps_rl_album_click:I

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iput-object v0, p0, Lcom/luck/picture/lib/widget/TitleBar;->j:Landroid/view/View;

    .line 72
    .line 73
    sget v0, Lcom/luck/picture/lib/R$id;->ps_tv_title:I

    .line 74
    .line 75
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Lcom/luck/picture/lib/widget/MarqueeTextView;

    .line 80
    .line 81
    iput-object v0, p0, Lcom/luck/picture/lib/widget/TitleBar;->g:Lcom/luck/picture/lib/widget/MarqueeTextView;

    .line 82
    .line 83
    sget v0, Lcom/luck/picture/lib/R$id;->ps_iv_arrow:I

    .line 84
    .line 85
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Landroid/widget/ImageView;

    .line 90
    .line 91
    iput-object v0, p0, Lcom/luck/picture/lib/widget/TitleBar;->e:Landroid/widget/ImageView;

    .line 92
    .line 93
    sget v0, Lcom/luck/picture/lib/R$id;->ps_tv_cancel:I

    .line 94
    .line 95
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, Landroid/widget/TextView;

    .line 100
    .line 101
    iput-object v0, p0, Lcom/luck/picture/lib/widget/TitleBar;->h:Landroid/widget/TextView;

    .line 102
    .line 103
    sget v0, Lcom/luck/picture/lib/R$id;->title_bar_line:I

    .line 104
    .line 105
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    iput-object v0, p0, Lcom/luck/picture/lib/widget/TitleBar;->i:Landroid/view/View;

    .line 110
    .line 111
    iget-object v0, p0, Lcom/luck/picture/lib/widget/TitleBar;->d:Landroid/widget/ImageView;

    .line 112
    .line 113
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 114
    .line 115
    .line 116
    iget-object v0, p0, Lcom/luck/picture/lib/widget/TitleBar;->h:Landroid/widget/TextView;

    .line 117
    .line 118
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 119
    .line 120
    .line 121
    iget-object v0, p0, Lcom/luck/picture/lib/widget/TitleBar;->c:Landroid/widget/RelativeLayout;

    .line 122
    .line 123
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 124
    .line 125
    .line 126
    iget-object v0, p0, Lcom/luck/picture/lib/widget/TitleBar;->m:Landroid/widget/RelativeLayout;

    .line 127
    .line 128
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 129
    .line 130
    .line 131
    iget-object v0, p0, Lcom/luck/picture/lib/widget/TitleBar;->j:Landroid/view/View;

    .line 132
    .line 133
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    sget v1, Lcom/luck/picture/lib/R$color;->ps_color_grey:I

    .line 141
    .line 142
    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0}, Lcom/luck/picture/lib/widget/TitleBar;->a()V

    .line 150
    .line 151
    .line 152
    iget-object v0, p0, Lcom/luck/picture/lib/widget/TitleBar;->k:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 153
    .line 154
    iget-object v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->h0:Ljava/lang/String;

    .line 155
    .line 156
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-eqz v0, :cond_1

    .line 161
    .line 162
    iget-object v0, p0, Lcom/luck/picture/lib/widget/TitleBar;->k:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 163
    .line 164
    iget v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c:I

    .line 165
    .line 166
    invoke-static {}, Ll6/d;->b()I

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-ne v0, v1, :cond_0

    .line 171
    .line 172
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    sget v1, Lcom/luck/picture/lib/R$string;->ps_all_audio:I

    .line 177
    .line 178
    :goto_0
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    goto :goto_1

    .line 183
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    sget v1, Lcom/luck/picture/lib/R$string;->ps_camera_roll:I

    .line 188
    .line 189
    goto :goto_0

    .line 190
    :goto_1
    invoke-virtual {p0, v0}, Lcom/luck/picture/lib/widget/TitleBar;->setTitle(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    return-void

    .line 194
    :cond_1
    iget-object v0, p0, Lcom/luck/picture/lib/widget/TitleBar;->k:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 195
    .line 196
    iget-object v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->h0:Ljava/lang/String;

    .line 197
    .line 198
    invoke-virtual {p0, v0}, Lcom/luck/picture/lib/widget/TitleBar;->setTitle(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    return-void
.end method

.method public d()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/widget/TitleBar;->k:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 2
    .line 3
    iget-boolean v0, v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->L:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/luck/picture/lib/widget/TitleBar;->l:Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v1}, La7/e;->h(Landroid/content/Context;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 22
    .line 23
    :cond_0
    sget-object v0, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    .line 24
    .line 25
    invoke-virtual {v0}, Lz6/a;->d()Lcom/luck/picture/lib/style/TitleBarStyle;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/TitleBarStyle;->i()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-static {v1}, La7/o;->b(I)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    iget-object v2, p0, Lcom/luck/picture/lib/widget/TitleBar;->m:Landroid/widget/RelativeLayout;

    .line 40
    .line 41
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    iget-object v1, p0, Lcom/luck/picture/lib/widget/TitleBar;->m:Landroid/widget/RelativeLayout;

    .line 49
    .line 50
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    const/high16 v3, 0x42400000    # 48.0f

    .line 59
    .line 60
    invoke-static {v2, v3}, La7/e;->a(Landroid/content/Context;F)I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 65
    .line 66
    :goto_0
    iget-object v1, p0, Lcom/luck/picture/lib/widget/TitleBar;->i:Landroid/view/View;

    .line 67
    .line 68
    const/16 v2, 0x8

    .line 69
    .line 70
    const/4 v3, 0x0

    .line 71
    if-eqz v1, :cond_3

    .line 72
    .line 73
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/TitleBarStyle;->t()Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_2

    .line 78
    .line 79
    iget-object v1, p0, Lcom/luck/picture/lib/widget/TitleBar;->i:Landroid/view/View;

    .line 80
    .line 81
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/TitleBarStyle;->j()I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    invoke-static {v1}, La7/o;->c(I)Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_3

    .line 93
    .line 94
    iget-object v1, p0, Lcom/luck/picture/lib/widget/TitleBar;->i:Landroid/view/View;

    .line 95
    .line 96
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/TitleBarStyle;->j()I

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    invoke-virtual {v1, v4}, Landroid/view/View;->setBackgroundColor(I)V

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_2
    iget-object v1, p0, Lcom/luck/picture/lib/widget/TitleBar;->i:Landroid/view/View;

    .line 105
    .line 106
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 107
    .line 108
    .line 109
    :cond_3
    :goto_1
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/TitleBarStyle;->h()I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    invoke-static {v1}, La7/o;->c(I)Z

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    if-eqz v4, :cond_4

    .line 118
    .line 119
    invoke-virtual {p0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 120
    .line 121
    .line 122
    :cond_4
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/TitleBarStyle;->q()I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    invoke-static {v1}, La7/o;->c(I)Z

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    if-eqz v4, :cond_5

    .line 131
    .line 132
    iget-object v4, p0, Lcom/luck/picture/lib/widget/TitleBar;->d:Landroid/widget/ImageView;

    .line 133
    .line 134
    invoke-virtual {v4, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 135
    .line 136
    .line 137
    :cond_5
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/TitleBarStyle;->o()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-static {v1}, La7/o;->f(Ljava/lang/String;)Z

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    if-eqz v4, :cond_6

    .line 146
    .line 147
    iget-object v4, p0, Lcom/luck/picture/lib/widget/TitleBar;->g:Lcom/luck/picture/lib/widget/MarqueeTextView;

    .line 148
    .line 149
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 150
    .line 151
    .line 152
    :cond_6
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/TitleBarStyle;->s()I

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    invoke-static {v1}, La7/o;->b(I)Z

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    if-eqz v4, :cond_7

    .line 161
    .line 162
    iget-object v4, p0, Lcom/luck/picture/lib/widget/TitleBar;->g:Lcom/luck/picture/lib/widget/MarqueeTextView;

    .line 163
    .line 164
    int-to-float v1, v1

    .line 165
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 166
    .line 167
    .line 168
    :cond_7
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/TitleBarStyle;->r()I

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    invoke-static {v1}, La7/o;->c(I)Z

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    if-eqz v4, :cond_8

    .line 177
    .line 178
    iget-object v4, p0, Lcom/luck/picture/lib/widget/TitleBar;->g:Lcom/luck/picture/lib/widget/MarqueeTextView;

    .line 179
    .line 180
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 181
    .line 182
    .line 183
    :cond_8
    iget-object v1, p0, Lcom/luck/picture/lib/widget/TitleBar;->k:Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 184
    .line 185
    iget-boolean v1, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->t0:Z

    .line 186
    .line 187
    if-eqz v1, :cond_9

    .line 188
    .line 189
    iget-object v1, p0, Lcom/luck/picture/lib/widget/TitleBar;->e:Landroid/widget/ImageView;

    .line 190
    .line 191
    sget v4, Lcom/luck/picture/lib/R$drawable;->ps_ic_trans_1px:I

    .line 192
    .line 193
    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 194
    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_9
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/TitleBarStyle;->p()I

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    invoke-static {v1}, La7/o;->c(I)Z

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    if-eqz v4, :cond_a

    .line 206
    .line 207
    iget-object v4, p0, Lcom/luck/picture/lib/widget/TitleBar;->e:Landroid/widget/ImageView;

    .line 208
    .line 209
    invoke-virtual {v4, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 210
    .line 211
    .line 212
    :cond_a
    :goto_2
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/TitleBarStyle;->g()I

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    invoke-static {v1}, La7/o;->c(I)Z

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    if-eqz v4, :cond_b

    .line 221
    .line 222
    iget-object v4, p0, Lcom/luck/picture/lib/widget/TitleBar;->c:Landroid/widget/RelativeLayout;

    .line 223
    .line 224
    invoke-virtual {v4, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 225
    .line 226
    .line 227
    :cond_b
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/TitleBarStyle;->u()Z

    .line 228
    .line 229
    .line 230
    move-result v1

    .line 231
    if-eqz v1, :cond_c

    .line 232
    .line 233
    iget-object v1, p0, Lcom/luck/picture/lib/widget/TitleBar;->h:Landroid/widget/TextView;

    .line 234
    .line 235
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 236
    .line 237
    .line 238
    goto :goto_3

    .line 239
    :cond_c
    iget-object v1, p0, Lcom/luck/picture/lib/widget/TitleBar;->h:Landroid/widget/TextView;

    .line 240
    .line 241
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/TitleBarStyle;->k()I

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    invoke-static {v1}, La7/o;->c(I)Z

    .line 249
    .line 250
    .line 251
    move-result v2

    .line 252
    if-eqz v2, :cond_d

    .line 253
    .line 254
    iget-object v2, p0, Lcom/luck/picture/lib/widget/TitleBar;->h:Landroid/widget/TextView;

    .line 255
    .line 256
    invoke-virtual {v2, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 257
    .line 258
    .line 259
    :cond_d
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/TitleBarStyle;->l()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    invoke-static {v1}, La7/o;->f(Ljava/lang/String;)Z

    .line 264
    .line 265
    .line 266
    move-result v2

    .line 267
    if-eqz v2, :cond_e

    .line 268
    .line 269
    iget-object v2, p0, Lcom/luck/picture/lib/widget/TitleBar;->h:Landroid/widget/TextView;

    .line 270
    .line 271
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 272
    .line 273
    .line 274
    :cond_e
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/TitleBarStyle;->m()I

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    invoke-static {v1}, La7/o;->c(I)Z

    .line 279
    .line 280
    .line 281
    move-result v2

    .line 282
    if-eqz v2, :cond_f

    .line 283
    .line 284
    iget-object v2, p0, Lcom/luck/picture/lib/widget/TitleBar;->h:Landroid/widget/TextView;

    .line 285
    .line 286
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 287
    .line 288
    .line 289
    :cond_f
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/TitleBarStyle;->n()I

    .line 290
    .line 291
    .line 292
    move-result v1

    .line 293
    invoke-static {v1}, La7/o;->b(I)Z

    .line 294
    .line 295
    .line 296
    move-result v2

    .line 297
    if-eqz v2, :cond_10

    .line 298
    .line 299
    iget-object v2, p0, Lcom/luck/picture/lib/widget/TitleBar;->h:Landroid/widget/TextView;

    .line 300
    .line 301
    int-to-float v1, v1

    .line 302
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 303
    .line 304
    .line 305
    :cond_10
    :goto_3
    invoke-virtual {v0}, Lcom/luck/picture/lib/style/TitleBarStyle;->a()I

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    invoke-static {v0}, La7/o;->c(I)Z

    .line 310
    .line 311
    .line 312
    move-result v1

    .line 313
    if-eqz v1, :cond_11

    .line 314
    .line 315
    iget-object v1, p0, Lcom/luck/picture/lib/widget/TitleBar;->f:Landroid/widget/ImageView;

    .line 316
    .line 317
    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 318
    .line 319
    .line 320
    return-void

    .line 321
    :cond_11
    iget-object v0, p0, Lcom/luck/picture/lib/widget/TitleBar;->f:Landroid/widget/ImageView;

    .line 322
    .line 323
    sget v1, Lcom/luck/picture/lib/R$drawable;->ps_ic_delete:I

    .line 324
    .line 325
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 326
    .line 327
    .line 328
    return-void
.end method

.method public getImageArrow()Landroid/widget/ImageView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/widget/TitleBar;->e:Landroid/widget/ImageView;

    .line 2
    .line 3
    return-object v0
.end method

.method public getImageDelete()Landroid/widget/ImageView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/widget/TitleBar;->f:Landroid/widget/ImageView;

    .line 2
    .line 3
    return-object v0
.end method

.method public getTitleBarLine()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/widget/TitleBar;->i:Landroid/view/View;

    .line 2
    .line 3
    return-object v0
.end method

.method public getTitleCancelView()Landroid/widget/TextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/widget/TitleBar;->h:Landroid/widget/TextView;

    .line 2
    .line 3
    return-object v0
.end method

.method public getTitleText()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/widget/TitleBar;->g:Lcom/luck/picture/lib/widget/MarqueeTextView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    sget v0, Lcom/luck/picture/lib/R$id;->ps_iv_left_back:I

    .line 6
    .line 7
    if-eq p1, v0, :cond_3

    .line 8
    .line 9
    sget v0, Lcom/luck/picture/lib/R$id;->ps_tv_cancel:I

    .line 10
    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    sget v0, Lcom/luck/picture/lib/R$id;->ps_rl_album_bg:I

    .line 15
    .line 16
    if-eq p1, v0, :cond_2

    .line 17
    .line 18
    sget v0, Lcom/luck/picture/lib/R$id;->ps_rl_album_click:I

    .line 19
    .line 20
    if-ne p1, v0, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    sget v0, Lcom/luck/picture/lib/R$id;->rl_title_bar:I

    .line 24
    .line 25
    if-ne p1, v0, :cond_4

    .line 26
    .line 27
    iget-object p1, p0, Lcom/luck/picture/lib/widget/TitleBar;->n:Lcom/luck/picture/lib/widget/TitleBar$a;

    .line 28
    .line 29
    if-eqz p1, :cond_4

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/luck/picture/lib/widget/TitleBar$a;->c()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/luck/picture/lib/widget/TitleBar;->n:Lcom/luck/picture/lib/widget/TitleBar$a;

    .line 36
    .line 37
    if-eqz p1, :cond_4

    .line 38
    .line 39
    invoke-virtual {p1, p0}, Lcom/luck/picture/lib/widget/TitleBar$a;->b(Landroid/view/View;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/luck/picture/lib/widget/TitleBar;->n:Lcom/luck/picture/lib/widget/TitleBar$a;

    .line 44
    .line 45
    if-eqz p1, :cond_4

    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/luck/picture/lib/widget/TitleBar$a;->a()V

    .line 48
    .line 49
    .line 50
    :cond_4
    return-void
.end method

.method public setOnTitleBarListener(Lcom/luck/picture/lib/widget/TitleBar$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/widget/TitleBar;->n:Lcom/luck/picture/lib/widget/TitleBar$a;

    .line 2
    .line 3
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/widget/TitleBar;->g:Lcom/luck/picture/lib/widget/MarqueeTextView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
