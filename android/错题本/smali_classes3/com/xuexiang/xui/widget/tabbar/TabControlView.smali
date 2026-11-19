.class public Lcom/xuexiang/xui/widget/tabbar/TabControlView;
.super Landroid/widget/RadioGroup;
.source "SourceFile"

# interfaces
.implements Lio/github/inflationx/calligraphy3/HasTypeface;


# static fields
.field public static final synthetic f:I


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:I

.field public final c:Ljava/util/LinkedHashMap;

.field public d:Ljava/util/ArrayList;

.field public final e:Lp3/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Landroid/widget/RadioGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabControlView;->b:I

    .line 3
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabControlView;->c:Ljava/util/LinkedHashMap;

    .line 4
    new-instance v0, Lp3/d;

    invoke-direct {v0, p0}, Lp3/d;-><init>(Lcom/xuexiang/xui/widget/tabbar/TabControlView;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabControlView;->e:Lp3/d;

    .line 5
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabControlView;->a:Landroid/content/Context;

    const/16 p1, 0xa

    .line 6
    invoke-virtual {p0, p1, p1, p1, p1}, Landroid/view/View;->setPadding(IIII)V

    .line 7
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/tabbar/TabControlView;->a()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 8
    invoke-direct {p0, p1, p2}, Landroid/widget/RadioGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, -0x1

    .line 9
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabControlView;->b:I

    .line 10
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabControlView;->c:Ljava/util/LinkedHashMap;

    .line 11
    new-instance v0, Lp3/d;

    invoke-direct {v0, p0}, Lp3/d;-><init>(Lcom/xuexiang/xui/widget/tabbar/TabControlView;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabControlView;->e:Lp3/d;

    .line 12
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/TabControlView;->a:Landroid/content/Context;

    const/16 v0, 0xa

    .line 13
    invoke-virtual {p0, v0, v0, v0, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 14
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    sget-object v0, Lcom/xuexiang/xui/R$styleable;->TabControlView:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, v1, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 15
    :try_start_0
    invoke-static {}, Lt1/a;->a()V

    const/4 p2, 0x0

    throw p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception p2

    .line 16
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 17
    throw p2
.end method


# virtual methods
.method public final a()V
    .locals 11

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabControlView;->d:Ljava/util/ArrayList;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabControlView;->c:Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const/4 v3, 0x0

    .line 26
    move v4, v0

    .line 27
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    const/4 v6, -0x1

    .line 32
    if-eqz v5, :cond_5

    .line 33
    .line 34
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    check-cast v5, Ljava/util/Map$Entry;

    .line 39
    .line 40
    new-instance v7, Landroid/widget/RadioButton;

    .line 41
    .line 42
    iget-object v8, p0, Lcom/xuexiang/xui/widget/tabbar/TabControlView;->a:Landroid/content/Context;

    .line 43
    .line 44
    invoke-direct {v7, v8}, Landroid/widget/RadioButton;-><init>(Landroid/content/Context;)V

    .line 45
    .line 46
    .line 47
    const/4 v8, 0x0

    .line 48
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 49
    .line 50
    .line 51
    new-instance v9, Landroid/widget/RadioGroup$LayoutParams;

    .line 52
    .line 53
    const/4 v10, -0x2

    .line 54
    invoke-direct {v9, v10, v6}, Landroid/widget/RadioGroup$LayoutParams;-><init>(II)V

    .line 55
    .line 56
    .line 57
    if-lez v4, :cond_0

    .line 58
    .line 59
    invoke-virtual {v9, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 60
    .line 61
    .line 62
    :cond_0
    invoke-virtual {v7, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 63
    .line 64
    .line 65
    new-instance v6, Landroid/graphics/drawable/StateListDrawable;

    .line 66
    .line 67
    invoke-direct {v6}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v7, v6}, Landroid/widget/CompoundButton;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 71
    .line 72
    .line 73
    const/4 v6, 0x1

    .line 74
    if-nez v4, :cond_2

    .line 75
    .line 76
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 77
    .line 78
    .line 79
    move-result-object v10

    .line 80
    invoke-virtual {v10}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 81
    .line 82
    .line 83
    move-result-object v10

    .line 84
    invoke-virtual {v10}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 85
    .line 86
    .line 87
    move-result v10

    .line 88
    if-ne v10, v6, :cond_1

    .line 89
    .line 90
    sget v6, Lcom/xuexiang/xui/R$drawable;->tcv_right_option:I

    .line 91
    .line 92
    sget v10, Lcom/xuexiang/xui/R$drawable;->tcv_right_option_selected:I

    .line 93
    .line 94
    invoke-virtual {p0, v7, v6, v10}, Lcom/xuexiang/xui/widget/tabbar/TabControlView;->b(Landroid/widget/RadioButton;II)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_1
    sget v6, Lcom/xuexiang/xui/R$drawable;->tcv_left_option:I

    .line 99
    .line 100
    sget v10, Lcom/xuexiang/xui/R$drawable;->tcv_left_option_selected:I

    .line 101
    .line 102
    invoke-virtual {p0, v7, v6, v10}, Lcom/xuexiang/xui/widget/tabbar/TabControlView;->b(Landroid/widget/RadioButton;II)V

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_2
    invoke-virtual {v1}, Ljava/util/AbstractMap;->size()I

    .line 107
    .line 108
    .line 109
    move-result v10

    .line 110
    sub-int/2addr v10, v6

    .line 111
    if-ne v4, v10, :cond_4

    .line 112
    .line 113
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 114
    .line 115
    .line 116
    move-result-object v10

    .line 117
    invoke-virtual {v10}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 118
    .line 119
    .line 120
    move-result-object v10

    .line 121
    invoke-virtual {v10}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 122
    .line 123
    .line 124
    move-result v10

    .line 125
    if-ne v10, v6, :cond_3

    .line 126
    .line 127
    sget v6, Lcom/xuexiang/xui/R$drawable;->tcv_left_option:I

    .line 128
    .line 129
    sget v10, Lcom/xuexiang/xui/R$drawable;->tcv_left_option_selected:I

    .line 130
    .line 131
    invoke-virtual {p0, v7, v6, v10}, Lcom/xuexiang/xui/widget/tabbar/TabControlView;->b(Landroid/widget/RadioButton;II)V

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_3
    sget v6, Lcom/xuexiang/xui/R$drawable;->tcv_right_option:I

    .line 136
    .line 137
    sget v10, Lcom/xuexiang/xui/R$drawable;->tcv_right_option_selected:I

    .line 138
    .line 139
    invoke-virtual {p0, v7, v6, v10}, Lcom/xuexiang/xui/widget/tabbar/TabControlView;->b(Landroid/widget/RadioButton;II)V

    .line 140
    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_4
    sget v6, Lcom/xuexiang/xui/R$drawable;->tcv_middle_option:I

    .line 144
    .line 145
    sget v10, Lcom/xuexiang/xui/R$drawable;->tcv_middle_option_selected:I

    .line 146
    .line 147
    invoke-virtual {p0, v7, v6, v10}, Lcom/xuexiang/xui/widget/tabbar/TabControlView;->b(Landroid/widget/RadioButton;II)V

    .line 148
    .line 149
    .line 150
    :goto_1
    invoke-virtual {v7, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v7, v0, v0, v0, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v7, v0, v0, v0, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setMinWidth(I)V

    .line 160
    .line 161
    .line 162
    const/16 v6, 0x11

    .line 163
    .line 164
    invoke-virtual {v7, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 165
    .line 166
    .line 167
    int-to-float v6, v0

    .line 168
    invoke-virtual {v7, v0, v6}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 169
    .line 170
    .line 171
    invoke-static {}, Lt1/a;->b()V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 175
    .line 176
    .line 177
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    check-cast v6, Ljava/lang/CharSequence;

    .line 182
    .line 183
    invoke-virtual {v7, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v7}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 187
    .line 188
    .line 189
    move-result-object v6

    .line 190
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v5

    .line 194
    check-cast v5, Ljava/lang/String;

    .line 195
    .line 196
    invoke-virtual {v6, v5}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 197
    .line 198
    .line 199
    move-result v5

    .line 200
    invoke-static {v5, v3}, Ljava/lang/Math;->max(FF)F

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    iget-object v5, p0, Lcom/xuexiang/xui/widget/tabbar/TabControlView;->d:Ljava/util/ArrayList;

    .line 205
    .line 206
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    add-int/lit8 v4, v4, 0x1

    .line 210
    .line 211
    goto/16 :goto_0

    .line 212
    .line 213
    :cond_5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabControlView;->d:Ljava/util/ArrayList;

    .line 214
    .line 215
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    :goto_2
    if-ge v0, v2, :cond_6

    .line 220
    .line 221
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    add-int/lit8 v0, v0, 0x1

    .line 226
    .line 227
    check-cast v3, Landroid/widget/RadioButton;

    .line 228
    .line 229
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 230
    .line 231
    .line 232
    goto :goto_2

    .line 233
    :cond_6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabControlView;->e:Lp3/d;

    .line 234
    .line 235
    invoke-virtual {p0, v0}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 236
    .line 237
    .line 238
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabControlView;->b:I

    .line 239
    .line 240
    if-le v0, v6, :cond_7

    .line 241
    .line 242
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    check-cast v0, Landroid/widget/RadioButton;

    .line 247
    .line 248
    if-eqz v0, :cond_7

    .line 249
    .line 250
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    invoke-virtual {p0, v0}, Landroid/widget/RadioGroup;->check(I)V

    .line 255
    .line 256
    .line 257
    :cond_7
    return-void
.end method

.method public final b(Landroid/widget/RadioButton;II)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabControlView;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    check-cast p2, Landroid/graphics/drawable/GradientDrawable;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p2, v0, v0}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {p2, v1}, Landroid/graphics/drawable/GradientDrawable;->setDither(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabControlView;->a:Landroid/content/Context;

    .line 29
    .line 30
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1, p3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    check-cast p3, Landroid/graphics/drawable/GradientDrawable;

    .line 43
    .line 44
    invoke-virtual {p3, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p3, v0, v0}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 48
    .line 49
    .line 50
    new-instance v0, Landroid/graphics/drawable/StateListDrawable;

    .line 51
    .line 52
    invoke-direct {v0}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 53
    .line 54
    .line 55
    const v1, -0x10100a0

    .line 56
    .line 57
    .line 58
    filled-new-array {v1}, [I

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v0, v1, p2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 63
    .line 64
    .line 65
    const p2, 0x10100a0

    .line 66
    .line 67
    .line 68
    filled-new-array {p2}, [I

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    invoke-virtual {v0, p2, p3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public getChecked()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/widget/RadioGroup;->getCheckedRadioButtonId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/widget/RadioButton;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabControlView;->c:Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ljava/lang/String;

    .line 26
    .line 27
    return-object v0
.end method

.method public getCheckedWithIdentifier()[Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/widget/RadioGroup;->getCheckedRadioButtonId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/widget/RadioButton;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabControlView;->c:Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ljava/lang/String;

    .line 26
    .line 27
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/tabbar/TabControlView;->a()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/TabControlView;->d:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabControlView;->d:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-ge v0, v1, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/TabControlView;->d:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Landroid/widget/RadioButton;

    .line 21
    .line 22
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 23
    .line 24
    .line 25
    add-int/lit8 v0, v0, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void
.end method
