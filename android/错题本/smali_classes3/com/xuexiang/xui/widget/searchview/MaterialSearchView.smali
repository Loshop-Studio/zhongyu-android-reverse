.class public Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Landroid/widget/Filter$FilterListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;
    }
.end annotation


# static fields
.field public static final synthetic t:I


# instance fields
.field public a:Z

.field public b:Z

.field public c:Landroid/view/View;

.field public d:Landroid/view/View;

.field public e:Landroid/widget/ListView;

.field public f:Landroid/widget/EditText;

.field public g:Landroid/widget/ImageButton;

.field public h:Landroid/widget/ImageButton;

.field public i:Landroid/widget/ImageButton;

.field public j:Landroid/widget/LinearLayout;

.field public k:Ljava/lang/CharSequence;

.field public l:Landroid/widget/ListAdapter;

.field public m:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Landroid/graphics/drawable/Drawable;

.field public r:Landroid/content/Context;

.field public final s:Lb1/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->a:Z

    .line 3
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->n:Z

    .line 4
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->o:Z

    .line 5
    new-instance v1, Lb1/c;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v2}, Lb1/c;-><init>(Landroid/view/KeyEvent$Callback;I)V

    iput-object v1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->s:Lb1/c;

    .line 6
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->c(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 7
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->b(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 8
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->a:Z

    .line 10
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->n:Z

    .line 11
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->o:Z

    .line 12
    new-instance v1, Lb1/c;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v2}, Lb1/c;-><init>(Landroid/view/KeyEvent$Callback;I)V

    iput-object v1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->s:Lb1/c;

    .line 13
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->c(Landroid/content/Context;)V

    .line 14
    invoke-virtual {p0, p2, v0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->b(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 15
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->a:Z

    .line 17
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->n:Z

    .line 18
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->o:Z

    .line 19
    new-instance v0, Lb1/c;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Lb1/c;-><init>(Landroid/view/KeyEvent$Callback;I)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->s:Lb1/c;

    .line 20
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->c(Landroid/content/Context;)V

    .line 21
    invoke-virtual {p0, p2, p3}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->b(Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->f:Landroid/widget/EditText;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->e:Landroid/widget/ListView;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/16 v1, 0x8

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->e:Landroid/widget/ListView;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->clearFocus()V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->c:Landroid/view/View;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->a:Z

    .line 37
    .line 38
    return-void
.end method

.method public final b(Landroid/util/AttributeSet;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->r:Landroid/content/Context;

    .line 2
    .line 3
    sget-object v1, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView:[I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-virtual {v0, p1, v1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_a

    .line 11
    .line 12
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_msv_searchBackground:I

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_msv_searchBackground:I

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_android_textColor:I

    .line 33
    .line 34
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    if-eqz p2, :cond_1

    .line 39
    .line 40
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_android_textColor:I

    .line 41
    .line 42
    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setTextColor(I)V

    .line 47
    .line 48
    .line 49
    :cond_1
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_android_textColorHint:I

    .line 50
    .line 51
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    if-eqz p2, :cond_2

    .line 56
    .line 57
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_android_textColorHint:I

    .line 58
    .line 59
    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setHintTextColor(I)V

    .line 64
    .line 65
    .line 66
    :cond_2
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_android_hint:I

    .line 67
    .line 68
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    if-eqz p2, :cond_3

    .line 73
    .line 74
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_android_hint:I

    .line 75
    .line 76
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setHint(Ljava/lang/CharSequence;)V

    .line 81
    .line 82
    .line 83
    :cond_3
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_msv_searchVoiceIcon:I

    .line 84
    .line 85
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    if-eqz p2, :cond_4

    .line 90
    .line 91
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 92
    .line 93
    .line 94
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_msv_searchVoiceIcon:I

    .line 95
    .line 96
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setVoiceIcon(Landroid/graphics/drawable/Drawable;)V

    .line 101
    .line 102
    .line 103
    :cond_4
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_msv_searchClearIcon:I

    .line 104
    .line 105
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 106
    .line 107
    .line 108
    move-result p2

    .line 109
    if-eqz p2, :cond_5

    .line 110
    .line 111
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 112
    .line 113
    .line 114
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_msv_searchClearIcon:I

    .line 115
    .line 116
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setCloseIcon(Landroid/graphics/drawable/Drawable;)V

    .line 121
    .line 122
    .line 123
    :cond_5
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_msv_searchBackIcon:I

    .line 124
    .line 125
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 126
    .line 127
    .line 128
    move-result p2

    .line 129
    if-eqz p2, :cond_6

    .line 130
    .line 131
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 132
    .line 133
    .line 134
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_msv_searchBackIcon:I

    .line 135
    .line 136
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setBackIcon(Landroid/graphics/drawable/Drawable;)V

    .line 141
    .line 142
    .line 143
    :cond_6
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_msv_searchSuggestionBackground:I

    .line 144
    .line 145
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 146
    .line 147
    .line 148
    move-result p2

    .line 149
    if-eqz p2, :cond_7

    .line 150
    .line 151
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 152
    .line 153
    .line 154
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_msv_searchSuggestionBackground:I

    .line 155
    .line 156
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setSuggestionBackground(Landroid/graphics/drawable/Drawable;)V

    .line 161
    .line 162
    .line 163
    :cond_7
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_msv_searchSuggestionIcon:I

    .line 164
    .line 165
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 166
    .line 167
    .line 168
    move-result p2

    .line 169
    if-eqz p2, :cond_8

    .line 170
    .line 171
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 172
    .line 173
    .line 174
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_msv_searchSuggestionIcon:I

    .line 175
    .line 176
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 177
    .line 178
    .line 179
    move-result-object p2

    .line 180
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setSuggestionIcon(Landroid/graphics/drawable/Drawable;)V

    .line 181
    .line 182
    .line 183
    :cond_8
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_android_inputType:I

    .line 184
    .line 185
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 186
    .line 187
    .line 188
    move-result p2

    .line 189
    if-eqz p2, :cond_9

    .line 190
    .line 191
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_android_inputType:I

    .line 192
    .line 193
    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 194
    .line 195
    .line 196
    move-result p2

    .line 197
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setInputType(I)V

    .line 198
    .line 199
    .line 200
    :cond_9
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 201
    .line 202
    .line 203
    :cond_a
    return-void
.end method

.method public final c(Landroid/content/Context;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->r:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget v0, Lcom/xuexiang/xui/R$layout;->xui_layout_search_view:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-virtual {p1, v0, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    sget p1, Lcom/xuexiang/xui/R$id;->search_layout:I

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->c:Landroid/view/View;

    .line 20
    .line 21
    sget v0, Lcom/xuexiang/xui/R$id;->search_top_bar:I

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Landroid/widget/LinearLayout;

    .line 28
    .line 29
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->j:Landroid/widget/LinearLayout;

    .line 30
    .line 31
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->c:Landroid/view/View;

    .line 32
    .line 33
    sget v0, Lcom/xuexiang/xui/R$id;->suggestion_list:I

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Landroid/widget/ListView;

    .line 40
    .line 41
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->e:Landroid/widget/ListView;

    .line 42
    .line 43
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->c:Landroid/view/View;

    .line 44
    .line 45
    sget v0, Lcom/xuexiang/xui/R$id;->searchTextView:I

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, Landroid/widget/EditText;

    .line 52
    .line 53
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->f:Landroid/widget/EditText;

    .line 54
    .line 55
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->c:Landroid/view/View;

    .line 56
    .line 57
    sget v0, Lcom/xuexiang/xui/R$id;->action_up_btn:I

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Landroid/widget/ImageButton;

    .line 64
    .line 65
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->g:Landroid/widget/ImageButton;

    .line 66
    .line 67
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->c:Landroid/view/View;

    .line 68
    .line 69
    sget v0, Lcom/xuexiang/xui/R$id;->action_voice_btn:I

    .line 70
    .line 71
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    check-cast p1, Landroid/widget/ImageButton;

    .line 76
    .line 77
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->h:Landroid/widget/ImageButton;

    .line 78
    .line 79
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->c:Landroid/view/View;

    .line 80
    .line 81
    sget v0, Lcom/xuexiang/xui/R$id;->action_clear_btn:I

    .line 82
    .line 83
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    check-cast p1, Landroid/widget/ImageButton;

    .line 88
    .line 89
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->i:Landroid/widget/ImageButton;

    .line 90
    .line 91
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->c:Landroid/view/View;

    .line 92
    .line 93
    sget v0, Lcom/xuexiang/xui/R$id;->transparent_view:I

    .line 94
    .line 95
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->d:Landroid/view/View;

    .line 100
    .line 101
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->f:Landroid/widget/EditText;

    .line 102
    .line 103
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->s:Lb1/c;

    .line 104
    .line 105
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 106
    .line 107
    .line 108
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->g:Landroid/widget/ImageButton;

    .line 109
    .line 110
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 111
    .line 112
    .line 113
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->h:Landroid/widget/ImageButton;

    .line 114
    .line 115
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 116
    .line 117
    .line 118
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->i:Landroid/widget/ImageButton;

    .line 119
    .line 120
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 121
    .line 122
    .line 123
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->d:Landroid/view/View;

    .line 124
    .line 125
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 126
    .line 127
    .line 128
    const/4 p1, 0x0

    .line 129
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->p:Z

    .line 130
    .line 131
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->g(Z)V

    .line 132
    .line 133
    .line 134
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->f:Landroid/widget/EditText;

    .line 135
    .line 136
    new-instance v0, Lcom/xuexiang/xui/widget/searchview/d;

    .line 137
    .line 138
    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/searchview/d;-><init>(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 142
    .line 143
    .line 144
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->f:Landroid/widget/EditText;

    .line 145
    .line 146
    new-instance v0, Lcom/xuexiang/xui/widget/searchview/e;

    .line 147
    .line 148
    const/4 v1, 0x0

    .line 149
    invoke-direct {v0, p0, v1}, Lcom/xuexiang/xui/widget/searchview/e;-><init>(Ljava/lang/Object;I)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 153
    .line 154
    .line 155
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->f:Landroid/widget/EditText;

    .line 156
    .line 157
    new-instance v0, Lcom/xuexiang/xui/widget/searchview/f;

    .line 158
    .line 159
    invoke-direct {v0, p0, v1}, Lcom/xuexiang/xui/widget/searchview/f;-><init>(Ljava/lang/Object;I)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 163
    .line 164
    .line 165
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->e:Landroid/widget/ListView;

    .line 166
    .line 167
    const/16 v0, 0x8

    .line 168
    .line 169
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 170
    .line 171
    .line 172
    const/16 p1, 0x190

    .line 173
    .line 174
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setAnimationDuration(I)V

    .line 175
    .line 176
    .line 177
    return-void
.end method

.method public final clearFocus()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->b:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "input_method"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 22
    .line 23
    .line 24
    invoke-super {p0}, Landroid/view/View;->clearFocus()V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->f:Landroid/widget/EditText;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/View;->clearFocus()V

    .line 30
    .line 31
    .line 32
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->b:Z

    .line 33
    .line 34
    return-void
.end method

.method public final d(Ljava/lang/CharSequence;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->f:Landroid/widget/EditText;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->f:Landroid/widget/EditText;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/widget/TextView;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->k:Ljava/lang/CharSequence;

    .line 18
    .line 19
    :cond_0
    if-eqz p2, :cond_1

    .line 20
    .line 21
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->f:Landroid/widget/EditText;

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    invoke-static {p1}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-lez p1, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->a()V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->f:Landroid/widget/EditText;

    .line 45
    .line 46
    const/4 p2, 0x0

    .line 47
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    return-void
.end method

.method public final e(Z)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->f:Landroid/widget/EditText;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->f:Landroid/widget/EditText;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    const/4 v1, 0x0

    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    new-instance p1, Lc8/c;

    .line 22
    .line 23
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    iget-object v2, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->c:Landroid/view/View;

    .line 27
    .line 28
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 29
    .line 30
    .line 31
    iget-object v2, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->j:Landroid/widget/LinearLayout;

    .line 32
    .line 33
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    const/high16 v5, 0x41c00000    # 24.0f

    .line 46
    .line 47
    invoke-static {v0, v5, v4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    float-to-int v4, v4

    .line 52
    sub-int/2addr v3, v4

    .line 53
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    div-int/lit8 v4, v4, 0x2

    .line 58
    .line 59
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    const/4 v6, 0x0

    .line 72
    int-to-float v5, v5

    .line 73
    invoke-static {v2, v3, v4, v6, v5}, Landroid/view/ViewAnimationUtils;->createCircularReveal(Landroid/view/View;IIFF)Landroid/animation/Animator;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 78
    .line 79
    .line 80
    new-instance v1, Lcom/xuexiang/xui/widget/searchview/b;

    .line 81
    .line 82
    invoke-direct {v1, p1, v2}, Lcom/xuexiang/xui/widget/searchview/b;-><init>(Lc8/c;Landroid/view/View;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v3}, Landroid/animation/Animator;->start()V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->c:Landroid/view/View;

    .line 93
    .line 94
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 95
    .line 96
    .line 97
    :goto_0
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->a:Z

    .line 98
    .line 99
    return-void
.end method

.method public final f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->l:Landroid/widget/ListAdapter;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->e:Landroid/widget/ListView;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/16 v1, 0x8

    .line 18
    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->e:Landroid/widget/ListView;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final g(Z)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance v1, Landroid/content/Intent;

    .line 20
    .line 21
    const-string v2, "android.speech.action.RECOGNIZE_SPEECH"

    .line 22
    .line 23
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v1, v0}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    :goto_0
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->p:Z

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->h:Landroid/widget/ImageButton;

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->h:Landroid/widget/ImageButton;

    .line 47
    .line 48
    const/16 v0, 0x8

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final onFilterComplete(I)V
    .locals 1

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->f()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->e:Landroid/widget/ListView;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->e:Landroid/widget/ListView;

    .line 16
    .line 17
    const/16 v0, 0x8

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    check-cast p1, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->m:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;

    .line 12
    .line 13
    iget-boolean p1, p1, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;->b:Z

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->e(Z)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->m:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;

    .line 22
    .line 23
    iget-object v0, v0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;->a:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p0, v0, p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->d(Ljava/lang/CharSequence;Z)V

    .line 26
    .line 27
    .line 28
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->m:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    .line 8
    .line 9
    .line 10
    iput-object v1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->m:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;

    .line 11
    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->k:Ljava/lang/CharSequence;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    iput-object v0, v1, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;->a:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->m:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;

    .line 25
    .line 26
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->a:Z

    .line 27
    .line 28
    iput-boolean v1, v0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;->b:Z

    .line 29
    .line 30
    return-object v0
.end method

.method public final requestFocus(ILandroid/graphics/Rect;)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isFocusable()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    :goto_0
    const/4 p1, 0x0

    .line 13
    return p1

    .line 14
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->f:Landroid/widget/EditText;

    .line 15
    .line 16
    invoke-virtual {v0, p1, p2}, Landroid/view/View;->requestFocus(ILandroid/graphics/Rect;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1
.end method

.method public setAdapter(Landroid/widget/ListAdapter;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->l:Landroid/widget/ListAdapter;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->e:Landroid/widget/ListView;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->f:Landroid/widget/EditText;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->l:Landroid/widget/ListAdapter;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    instance-of v1, v0, Landroid/widget/Filterable;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    check-cast v0, Landroid/widget/Filterable;

    .line 23
    .line 24
    invoke-interface {v0}, Landroid/widget/Filterable;->getFilter()Landroid/widget/Filter;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0, p1, p0}, Landroid/widget/Filter;->filter(Ljava/lang/CharSequence;Landroid/widget/Filter$FilterListener;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public setAnimationDuration(I)V
    .locals 0

    return-void
.end method

.method public setBackIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->g:Landroid/widget/ImageButton;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->j:Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setBackgroundColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->j:Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setCloseIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->i:Landroid/widget/ImageButton;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setCursorDrawable(I)V
    .locals 2

    .line 1
    :try_start_0
    const-class v0, Landroid/widget/TextView;

    .line 2
    .line 3
    const-string v1, "mCursorDrawableRes"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->f:Landroid/widget/EditText;

    .line 14
    .line 15
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catch_0
    move-exception p1

    .line 24
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public setEllipsize(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->o:Z

    .line 2
    .line 3
    return-void
.end method

.method public setHint(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->f:Landroid/widget/EditText;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setHintTextColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->f:Landroid/widget/EditText;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setHintTextColor(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setInputType(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->f:Landroid/widget/EditText;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setInputType(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setMenuItem(Landroid/view/MenuItem;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/searchview/h;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/searchview/h;-><init>(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->e:Landroid/widget/ListView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setOnQueryTextListener(Lcom/xuexiang/xui/widget/searchview/i;)V
    .locals 0

    return-void
.end method

.method public setOnSearchViewListener(Lcom/xuexiang/xui/widget/searchview/k;)V
    .locals 0

    return-void
.end method

.method public setSearchFilter(Lcom/xuexiang/xui/widget/searchview/a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->l:Landroid/widget/ListAdapter;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    instance-of v1, v0, Lcom/xuexiang/xui/widget/searchview/m;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lcom/xuexiang/xui/widget/searchview/m;

    .line 10
    .line 11
    iput-object p1, v0, Lcom/xuexiang/xui/widget/searchview/m;->f:Lcom/xuexiang/xui/widget/searchview/a;

    .line 12
    .line 13
    iget-object v1, v0, Lcom/xuexiang/xui/widget/searchview/m;->b:[Ljava/lang/String;

    .line 14
    .line 15
    iput-object v1, p1, Lcom/xuexiang/xui/widget/searchview/a;->a:[Ljava/lang/String;

    .line 16
    .line 17
    iput-object v0, p1, Lcom/xuexiang/xui/widget/searchview/a;->b:Lcom/xuexiang/xui/widget/searchview/m;

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public setSubmitOnClick(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->n:Z

    .line 2
    .line 3
    return-void
.end method

.method public setSuggestionBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->e:Landroid/widget/ListView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setSuggestionIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->q:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-void
.end method

.method public setSuggestions([Ljava/lang/String;)V
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    array-length v0, p1

    .line 4
    if-lez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->d:Landroid/view/View;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Lcom/xuexiang/xui/widget/searchview/m;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->r:Landroid/content/Context;

    .line 15
    .line 16
    iget-object v2, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->q:Landroid/graphics/drawable/Drawable;

    .line 17
    .line 18
    iget-boolean v3, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->o:Z

    .line 19
    .line 20
    invoke-direct {v0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iput-object v1, v0, Lcom/xuexiang/xui/widget/searchview/m;->d:Landroid/view/LayoutInflater;

    .line 28
    .line 29
    new-instance v1, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v1, v0, Lcom/xuexiang/xui/widget/searchview/m;->a:Ljava/util/List;

    .line 35
    .line 36
    iput-object p1, v0, Lcom/xuexiang/xui/widget/searchview/m;->b:[Ljava/lang/String;

    .line 37
    .line 38
    iput-object v2, v0, Lcom/xuexiang/xui/widget/searchview/m;->c:Landroid/graphics/drawable/Drawable;

    .line 39
    .line 40
    iput-boolean v3, v0, Lcom/xuexiang/xui/widget/searchview/m;->e:Z

    .line 41
    .line 42
    new-instance p1, Lcom/xuexiang/xui/widget/searchview/c;

    .line 43
    .line 44
    invoke-direct {p1}, Landroid/widget/Filter;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object p1, v0, Lcom/xuexiang/xui/widget/searchview/m;->f:Lcom/xuexiang/xui/widget/searchview/a;

    .line 48
    .line 49
    iget-object v1, v0, Lcom/xuexiang/xui/widget/searchview/m;->b:[Ljava/lang/String;

    .line 50
    .line 51
    iput-object v1, p1, Lcom/xuexiang/xui/widget/searchview/a;->a:[Ljava/lang/String;

    .line 52
    .line 53
    iput-object v0, p1, Lcom/xuexiang/xui/widget/searchview/a;->b:Lcom/xuexiang/xui/widget/searchview/m;

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 56
    .line 57
    .line 58
    new-instance p1, Lcom/xuexiang/xui/widget/searchview/g;

    .line 59
    .line 60
    invoke-direct {p1, p0, v0}, Lcom/xuexiang/xui/widget/searchview/g;-><init>(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;Lcom/xuexiang/xui/widget/searchview/m;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->d:Landroid/view/View;

    .line 68
    .line 69
    const/16 v0, 0x8

    .line 70
    .line 71
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public setTextColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->f:Landroid/widget/EditText;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setVoiceIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->h:Landroid/widget/ImageButton;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setVoiceSearch(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->p:Z

    .line 2
    .line 3
    return-void
.end method
