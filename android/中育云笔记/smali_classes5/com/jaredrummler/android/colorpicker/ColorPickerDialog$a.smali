.class public Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->D()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;


# direct methods
.method public constructor <init>(Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$a;->c:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 9

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
    iget-object p3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$a;->c:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 13
    .line 14
    iget-object p3, p3, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->o:Landroid/widget/TextView;

    .line 15
    .line 16
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 17
    .line 18
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-string v1, "%d%%"

    .line 27
    .line 28
    invoke-static {v0, v1, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    rsub-int p1, p2, 0xff

    .line 36
    .line 37
    const/4 p2, 0x0

    .line 38
    move p3, p2

    .line 39
    :goto_0
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$a;->c:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 40
    .line 41
    iget-object v0, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->l:Lcom/jaredrummler/android/colorpicker/a;

    .line 42
    .line 43
    iget-object v1, v0, Lcom/jaredrummler/android/colorpicker/a;->d:[I

    .line 44
    .line 45
    array-length v2, v1

    .line 46
    if-ge p3, v2, :cond_0

    .line 47
    .line 48
    aget v0, v1, p3

    .line 49
    .line 50
    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-static {v0}, Landroid/graphics/Color;->green(I)I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-object v3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$a;->c:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 63
    .line 64
    iget-object v3, v3, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->l:Lcom/jaredrummler/android/colorpicker/a;

    .line 65
    .line 66
    iget-object v3, v3, Lcom/jaredrummler/android/colorpicker/a;->d:[I

    .line 67
    .line 68
    invoke-static {p1, v1, v2, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    aput v0, v3, p3

    .line 73
    .line 74
    add-int/lit8 p3, p3, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 78
    .line 79
    .line 80
    :goto_1
    iget-object p3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$a;->c:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 81
    .line 82
    iget-object p3, p3, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->m:Landroid/widget/LinearLayout;

    .line 83
    .line 84
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getChildCount()I

    .line 85
    .line 86
    .line 87
    move-result p3

    .line 88
    if-ge p2, p3, :cond_6

    .line 89
    .line 90
    iget-object p3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$a;->c:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 91
    .line 92
    iget-object p3, p3, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->m:Landroid/widget/LinearLayout;

    .line 93
    .line 94
    invoke-virtual {p3, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 95
    .line 96
    .line 97
    move-result-object p3

    .line 98
    check-cast p3, Landroid/widget/FrameLayout;

    .line 99
    .line 100
    sget v0, Lcom/jaredrummler/android/colorpicker/R$id;->cpv_color_panel_view:I

    .line 101
    .line 102
    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    .line 107
    .line 108
    sget v1, Lcom/jaredrummler/android/colorpicker/R$id;->cpv_color_image_view:I

    .line 109
    .line 110
    invoke-virtual {p3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    check-cast v1, Landroid/widget/ImageView;

    .line 115
    .line 116
    invoke-virtual {p3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    if-nez v2, :cond_1

    .line 121
    .line 122
    invoke-virtual {v0}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->getBorderColor()I

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-virtual {p3, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    :cond_1
    invoke-virtual {v0}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->getColor()I

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    invoke-static {v2}, Landroid/graphics/Color;->red(I)I

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    invoke-static {v2}, Landroid/graphics/Color;->green(I)I

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    invoke-static {v2}, Landroid/graphics/Color;->blue(I)I

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    invoke-static {p1, v3, v4, v2}, Landroid/graphics/Color;->argb(IIII)I

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    const/16 v3, 0xa5

    .line 154
    .line 155
    const/high16 v4, -0x1000000

    .line 156
    .line 157
    if-gt p1, v3, :cond_2

    .line 158
    .line 159
    or-int p3, v2, v4

    .line 160
    .line 161
    invoke-virtual {v0, p3}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->setBorderColor(I)V

    .line 162
    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_2
    invoke-virtual {p3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p3

    .line 169
    check-cast p3, Ljava/lang/Integer;

    .line 170
    .line 171
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 172
    .line 173
    .line 174
    move-result p3

    .line 175
    invoke-virtual {v0, p3}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->setBorderColor(I)V

    .line 176
    .line 177
    .line 178
    :goto_2
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p3

    .line 182
    if-eqz p3, :cond_5

    .line 183
    .line 184
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p3

    .line 188
    check-cast p3, Ljava/lang/Boolean;

    .line 189
    .line 190
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 191
    .line 192
    .line 193
    move-result p3

    .line 194
    if-eqz p3, :cond_5

    .line 195
    .line 196
    if-gt p1, v3, :cond_3

    .line 197
    .line 198
    sget-object p3, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 199
    .line 200
    invoke-virtual {v1, v4, p3}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 201
    .line 202
    .line 203
    goto :goto_3

    .line 204
    :cond_3
    invoke-static {v2}, Landroidx/core/graphics/ColorUtils;->calculateLuminance(I)D

    .line 205
    .line 206
    .line 207
    move-result-wide v5

    .line 208
    const-wide v7, 0x3fe4cccccccccccdL    # 0.65

    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    cmpl-double p3, v5, v7

    .line 214
    .line 215
    if-ltz p3, :cond_4

    .line 216
    .line 217
    sget-object p3, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 218
    .line 219
    invoke-virtual {v1, v4, p3}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 220
    .line 221
    .line 222
    goto :goto_3

    .line 223
    :cond_4
    const/4 p3, -0x1

    .line 224
    sget-object v3, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 225
    .line 226
    invoke-virtual {v1, p3, v3}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 227
    .line 228
    .line 229
    :cond_5
    :goto_3
    invoke-virtual {v0, v2}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->setColor(I)V

    .line 230
    .line 231
    .line 232
    add-int/lit8 p2, p2, 0x1

    .line 233
    .line 234
    goto/16 :goto_1

    .line 235
    .line 236
    :cond_6
    iget-object p2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$a;->c:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 237
    .line 238
    iget p2, p2, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->g:I

    .line 239
    .line 240
    invoke-static {p2}, Landroid/graphics/Color;->red(I)I

    .line 241
    .line 242
    .line 243
    move-result p2

    .line 244
    iget-object p3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$a;->c:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 245
    .line 246
    iget p3, p3, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->g:I

    .line 247
    .line 248
    invoke-static {p3}, Landroid/graphics/Color;->green(I)I

    .line 249
    .line 250
    .line 251
    move-result p3

    .line 252
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$a;->c:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 253
    .line 254
    iget v0, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->g:I

    .line 255
    .line 256
    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog$a;->c:Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 261
    .line 262
    invoke-static {p1, p2, p3, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 263
    .line 264
    .line 265
    move-result p1

    .line 266
    iput p1, v1, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->g:I

    .line 267
    .line 268
    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method
