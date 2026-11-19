.class public final Lm1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field public final synthetic a:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;


# direct methods
.method public constructor <init>(Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm1/f;->a:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 10

    .line 1
    int-to-double v0, p2

    .line 2
    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    .line 3
    .line 4
    mul-double/2addr v0, v2

    .line 5
    const-wide v2, 0x406fe00000000000L    # 255.0

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    div-double/2addr v0, v2

    .line 11
    double-to-int p1, v0

    .line 12
    iget-object p3, p0, Lm1/f;->a:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 13
    .line 14
    iget-object v0, p3, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->k:Landroid/widget/TextView;

    .line 15
    .line 16
    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 17
    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string p1, "%"

    .line 27
    .line 28
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 36
    .line 37
    .line 38
    rsub-int p1, p2, 0xff

    .line 39
    .line 40
    const/4 p2, 0x0

    .line 41
    move v0, p2

    .line 42
    :goto_0
    iget-object v1, p3, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->h:Lm1/e;

    .line 43
    .line 44
    iget-object v2, v1, Lm1/e;->b:[I

    .line 45
    .line 46
    array-length v3, v2

    .line 47
    if-ge v0, v3, :cond_0

    .line 48
    .line 49
    aget v1, v2, v0

    .line 50
    .line 51
    invoke-static {v1}, Landroid/graphics/Color;->red(I)I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    invoke-static {v1}, Landroid/graphics/Color;->green(I)I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    invoke-static {v1}, Landroid/graphics/Color;->blue(I)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    iget-object v4, p3, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->h:Lm1/e;

    .line 64
    .line 65
    iget-object v4, v4, Lm1/e;->b:[I

    .line 66
    .line 67
    invoke-static {p1, v2, v3, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    aput v1, v4, v0

    .line 72
    .line 73
    add-int/lit8 v0, v0, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    invoke-virtual {v1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 77
    .line 78
    .line 79
    :goto_1
    iget-object v0, p3, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->i:Landroid/widget/LinearLayout;

    .line 80
    .line 81
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-ge p2, v0, :cond_6

    .line 86
    .line 87
    iget-object v0, p3, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->i:Landroid/widget/LinearLayout;

    .line 88
    .line 89
    invoke-virtual {v0, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    check-cast v0, Landroid/widget/FrameLayout;

    .line 94
    .line 95
    sget v1, Lcom/jaredrummler/android/colorpicker/R$id;->cpv_color_panel_view:I

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    check-cast v1, Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    .line 102
    .line 103
    sget v2, Lcom/jaredrummler/android/colorpicker/R$id;->cpv_color_image_view:I

    .line 104
    .line 105
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    check-cast v2, Landroid/widget/ImageView;

    .line 110
    .line 111
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    if-nez v3, :cond_1

    .line 116
    .line 117
    invoke-virtual {v1}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->getBorderColor()I

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    invoke-virtual {v0, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    :cond_1
    invoke-virtual {v1}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->getColor()I

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    invoke-static {v3}, Landroid/graphics/Color;->red(I)I

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    invoke-static {v3}, Landroid/graphics/Color;->green(I)I

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    invoke-static {v3}, Landroid/graphics/Color;->blue(I)I

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    invoke-static {p1, v4, v5, v3}, Landroid/graphics/Color;->argb(IIII)I

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    const/16 v4, 0xa5

    .line 149
    .line 150
    const/high16 v5, -0x1000000

    .line 151
    .line 152
    if-gt p1, v4, :cond_2

    .line 153
    .line 154
    or-int v0, v3, v5

    .line 155
    .line 156
    invoke-virtual {v1, v0}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->setBorderColor(I)V

    .line 157
    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    check-cast v0, Ljava/lang/Integer;

    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    invoke-virtual {v1, v0}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->setBorderColor(I)V

    .line 171
    .line 172
    .line 173
    :goto_2
    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    if-eqz v0, :cond_5

    .line 178
    .line 179
    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    check-cast v0, Ljava/lang/Boolean;

    .line 184
    .line 185
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-eqz v0, :cond_5

    .line 190
    .line 191
    if-gt p1, v4, :cond_3

    .line 192
    .line 193
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 194
    .line 195
    invoke-virtual {v2, v5, v0}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 196
    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_3
    invoke-static {v3}, Landroidx/core/graphics/ColorUtils;->calculateLuminance(I)D

    .line 200
    .line 201
    .line 202
    move-result-wide v6

    .line 203
    const-wide v8, 0x3fe4cccccccccccdL    # 0.65

    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    cmpl-double v0, v6, v8

    .line 209
    .line 210
    if-ltz v0, :cond_4

    .line 211
    .line 212
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 213
    .line 214
    invoke-virtual {v2, v5, v0}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 215
    .line 216
    .line 217
    goto :goto_3

    .line 218
    :cond_4
    const/4 v0, -0x1

    .line 219
    sget-object v4, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 220
    .line 221
    invoke-virtual {v2, v0, v4}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 222
    .line 223
    .line 224
    :cond_5
    :goto_3
    invoke-virtual {v1, v3}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->setColor(I)V

    .line 225
    .line 226
    .line 227
    add-int/lit8 p2, p2, 0x1

    .line 228
    .line 229
    goto/16 :goto_1

    .line 230
    .line 231
    :cond_6
    iget p2, p3, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->d:I

    .line 232
    .line 233
    invoke-static {p2}, Landroid/graphics/Color;->red(I)I

    .line 234
    .line 235
    .line 236
    move-result p2

    .line 237
    iget v0, p3, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->d:I

    .line 238
    .line 239
    invoke-static {v0}, Landroid/graphics/Color;->green(I)I

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    iget v1, p3, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->d:I

    .line 244
    .line 245
    invoke-static {v1}, Landroid/graphics/Color;->blue(I)I

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    invoke-static {p1, p2, v0, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 250
    .line 251
    .line 252
    move-result p1

    .line 253
    iput p1, p3, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->d:I

    .line 254
    .line 255
    return-void
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .line 1
    return-void
.end method
