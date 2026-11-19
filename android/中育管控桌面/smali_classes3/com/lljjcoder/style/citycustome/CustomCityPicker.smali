.class public Lcom/lljjcoder/style/citycustome/CustomCityPicker;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/lljjcoder/style/citypickerview/widget/CanShow;
.implements Lcom/lljjcoder/style/citypickerview/widget/wheel/OnWheelChangedListener;


# instance fields
.field private config:Lcom/lljjcoder/citywheel/CustomConfig;

.field private listener:Lcom/lljjcoder/Interface/OnCustomCityPickerItemClickListener;

.field private mContext:Landroid/content/Context;

.field private mRelativeTitleBg:Landroid/widget/RelativeLayout;

.field private mTvCancel:Landroid/widget/TextView;

.field private mTvOK:Landroid/widget/TextView;

.field private mTvTitle:Landroid/widget/TextView;

.field private mViewCity:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

.field private mViewDistrict:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

.field private mViewProvince:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

.field private popview:Landroid/view/View;

.field private popwindow:Landroid/widget/PopupWindow;

.field private type:Lcom/lljjcoder/citywheel/CustomConfig$WheelType;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->listener:Lcom/lljjcoder/Interface/OnCustomCityPickerItemClickListener;

    .line 6
    .line 7
    sget-object v0, Lcom/lljjcoder/citywheel/CustomConfig$WheelType;->PRO_CITY_DIS:Lcom/lljjcoder/citywheel/CustomConfig$WheelType;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->type:Lcom/lljjcoder/citywheel/CustomConfig$WheelType;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mContext:Landroid/content/Context;

    .line 12
    .line 13
    return-void
.end method

.method public static synthetic access$000(Lcom/lljjcoder/style/citycustome/CustomCityPicker;)Lcom/lljjcoder/citywheel/CustomConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$100(Lcom/lljjcoder/style/citycustome/CustomCityPicker;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mContext:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$200(Lcom/lljjcoder/style/citycustome/CustomCityPicker;)Lcom/lljjcoder/Interface/OnCustomCityPickerItemClickListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->listener:Lcom/lljjcoder/Interface/OnCustomCityPickerItemClickListener;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$300(Lcom/lljjcoder/style/citycustome/CustomCityPicker;)Lcom/lljjcoder/citywheel/CustomConfig$WheelType;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->type:Lcom/lljjcoder/citywheel/CustomConfig$WheelType;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$400(Lcom/lljjcoder/style/citycustome/CustomCityPicker;)Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewProvince:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$500(Lcom/lljjcoder/style/citycustome/CustomCityPicker;)Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewCity:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$600(Lcom/lljjcoder/style/citycustome/CustomCityPicker;)Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewDistrict:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 2
    .line 3
    return-object p0
.end method

.method private initView()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mContext:Landroid/content/Context;

    .line 6
    .line 7
    const-string v1, "\u8bf7\u8bbe\u7f6e\u76f8\u5173\u7684config"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lcom/lljjcoder/style/citylist/Toast/ToastUtils;->showLongToast(Landroid/content/Context;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mContext:Landroid/content/Context;

    .line 14
    .line 15
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sget v1, Lcom/lljjcoder/style/citypickerview/R$layout;->pop_citypicker:I

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->popview:Landroid/view/View;

    .line 27
    .line 28
    sget v1, Lcom/lljjcoder/style/citypickerview/R$id;->id_province:I

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 35
    .line 36
    iput-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewProvince:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 37
    .line 38
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->popview:Landroid/view/View;

    .line 39
    .line 40
    sget v1, Lcom/lljjcoder/style/citypickerview/R$id;->id_city:I

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 47
    .line 48
    iput-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewCity:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 49
    .line 50
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->popview:Landroid/view/View;

    .line 51
    .line 52
    sget v1, Lcom/lljjcoder/style/citypickerview/R$id;->id_district:I

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 59
    .line 60
    iput-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewDistrict:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 61
    .line 62
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->popview:Landroid/view/View;

    .line 63
    .line 64
    sget v1, Lcom/lljjcoder/style/citypickerview/R$id;->rl_title:I

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    check-cast v0, Landroid/widget/RelativeLayout;

    .line 71
    .line 72
    iput-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mRelativeTitleBg:Landroid/widget/RelativeLayout;

    .line 73
    .line 74
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->popview:Landroid/view/View;

    .line 75
    .line 76
    sget v1, Lcom/lljjcoder/style/citypickerview/R$id;->tv_confirm:I

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, Landroid/widget/TextView;

    .line 83
    .line 84
    iput-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mTvOK:Landroid/widget/TextView;

    .line 85
    .line 86
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->popview:Landroid/view/View;

    .line 87
    .line 88
    sget v1, Lcom/lljjcoder/style/citypickerview/R$id;->tv_title:I

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Landroid/widget/TextView;

    .line 95
    .line 96
    iput-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mTvTitle:Landroid/widget/TextView;

    .line 97
    .line 98
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->popview:Landroid/view/View;

    .line 99
    .line 100
    sget v1, Lcom/lljjcoder/style/citypickerview/R$id;->tv_cancel:I

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, Landroid/widget/TextView;

    .line 107
    .line 108
    iput-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mTvCancel:Landroid/widget/TextView;

    .line 109
    .line 110
    new-instance v0, Landroid/widget/PopupWindow;

    .line 111
    .line 112
    iget-object v1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->popview:Landroid/view/View;

    .line 113
    .line 114
    const/4 v2, -0x1

    .line 115
    const/4 v3, -0x2

    .line 116
    invoke-direct {v0, v1, v2, v3}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;II)V

    .line 117
    .line 118
    .line 119
    iput-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->popwindow:Landroid/widget/PopupWindow;

    .line 120
    .line 121
    sget v1, Lcom/lljjcoder/style/citypickerview/R$style;->AnimBottom:I

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 124
    .line 125
    .line 126
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->popwindow:Landroid/widget/PopupWindow;

    .line 127
    .line 128
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    .line 129
    .line 130
    invoke-direct {v1}, Landroid/graphics/drawable/ColorDrawable;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 134
    .line 135
    .line 136
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->popwindow:Landroid/widget/PopupWindow;

    .line 137
    .line 138
    const/4 v1, 0x1

    .line 139
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setTouchable(Z)V

    .line 140
    .line 141
    .line 142
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->popwindow:Landroid/widget/PopupWindow;

    .line 143
    .line 144
    const/4 v2, 0x0

    .line 145
    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 146
    .line 147
    .line 148
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->popwindow:Landroid/widget/PopupWindow;

    .line 149
    .line 150
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 151
    .line 152
    .line 153
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->popwindow:Landroid/widget/PopupWindow;

    .line 154
    .line 155
    new-instance v1, Lcom/lljjcoder/style/citycustome/CustomCityPicker$1;

    .line 156
    .line 157
    invoke-direct {v1, p0}, Lcom/lljjcoder/style/citycustome/CustomCityPicker$1;-><init>(Lcom/lljjcoder/style/citycustome/CustomCityPicker;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 161
    .line 162
    .line 163
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 164
    .line 165
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CustomConfig;->getWheelType()Lcom/lljjcoder/citywheel/CustomConfig$WheelType;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    iput-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->type:Lcom/lljjcoder/citywheel/CustomConfig$WheelType;

    .line 170
    .line 171
    invoke-direct {p0, v0}, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->setWheelShowLevel(Lcom/lljjcoder/citywheel/CustomConfig$WheelType;)V

    .line 172
    .line 173
    .line 174
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 175
    .line 176
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CustomConfig;->getTitleBackgroundColorStr()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    const-string v1, "#"

    .line 185
    .line 186
    if-nez v0, :cond_2

    .line 187
    .line 188
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 189
    .line 190
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CustomConfig;->getTitleBackgroundColorStr()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    if-eqz v0, :cond_1

    .line 199
    .line 200
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mRelativeTitleBg:Landroid/widget/RelativeLayout;

    .line 201
    .line 202
    iget-object v2, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 203
    .line 204
    invoke-virtual {v2}, Lcom/lljjcoder/citywheel/CustomConfig;->getTitleBackgroundColorStr()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 213
    .line 214
    .line 215
    goto :goto_0

    .line 216
    :cond_1
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mRelativeTitleBg:Landroid/widget/RelativeLayout;

    .line 217
    .line 218
    new-instance v2, Ljava/lang/StringBuilder;

    .line 219
    .line 220
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    iget-object v3, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 227
    .line 228
    invoke-virtual {v3}, Lcom/lljjcoder/citywheel/CustomConfig;->getTitleBackgroundColorStr()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 244
    .line 245
    .line 246
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 247
    .line 248
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CustomConfig;->getTitle()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    if-nez v0, :cond_3

    .line 257
    .line 258
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mTvTitle:Landroid/widget/TextView;

    .line 259
    .line 260
    iget-object v2, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 261
    .line 262
    invoke-virtual {v2}, Lcom/lljjcoder/citywheel/CustomConfig;->getTitle()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 267
    .line 268
    .line 269
    :cond_3
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 270
    .line 271
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CustomConfig;->getTitleTextSize()I

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    if-lez v0, :cond_4

    .line 276
    .line 277
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mTvTitle:Landroid/widget/TextView;

    .line 278
    .line 279
    iget-object v2, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 280
    .line 281
    invoke-virtual {v2}, Lcom/lljjcoder/citywheel/CustomConfig;->getTitleTextSize()I

    .line 282
    .line 283
    .line 284
    move-result v2

    .line 285
    int-to-float v2, v2

    .line 286
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 287
    .line 288
    .line 289
    :cond_4
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 290
    .line 291
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CustomConfig;->getTitleTextColorStr()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    if-nez v0, :cond_6

    .line 300
    .line 301
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 302
    .line 303
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CustomConfig;->getTitleTextColorStr()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 308
    .line 309
    .line 310
    move-result v0

    .line 311
    if-eqz v0, :cond_5

    .line 312
    .line 313
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mTvTitle:Landroid/widget/TextView;

    .line 314
    .line 315
    iget-object v2, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 316
    .line 317
    invoke-virtual {v2}, Lcom/lljjcoder/citywheel/CustomConfig;->getTitleTextColorStr()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 322
    .line 323
    .line 324
    move-result v2

    .line 325
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 326
    .line 327
    .line 328
    goto :goto_1

    .line 329
    :cond_5
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mTvTitle:Landroid/widget/TextView;

    .line 330
    .line 331
    new-instance v2, Ljava/lang/StringBuilder;

    .line 332
    .line 333
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    iget-object v3, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 340
    .line 341
    invoke-virtual {v3}, Lcom/lljjcoder/citywheel/CustomConfig;->getTitleTextColorStr()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v3

    .line 345
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 353
    .line 354
    .line 355
    move-result v2

    .line 356
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 357
    .line 358
    .line 359
    :cond_6
    :goto_1
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 360
    .line 361
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CustomConfig;->getConfirmTextColorStr()Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 366
    .line 367
    .line 368
    move-result v0

    .line 369
    if-nez v0, :cond_8

    .line 370
    .line 371
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 372
    .line 373
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CustomConfig;->getConfirmTextColorStr()Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 378
    .line 379
    .line 380
    move-result v0

    .line 381
    if-eqz v0, :cond_7

    .line 382
    .line 383
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mTvOK:Landroid/widget/TextView;

    .line 384
    .line 385
    iget-object v2, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 386
    .line 387
    invoke-virtual {v2}, Lcom/lljjcoder/citywheel/CustomConfig;->getConfirmTextColorStr()Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 392
    .line 393
    .line 394
    move-result v2

    .line 395
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 396
    .line 397
    .line 398
    goto :goto_2

    .line 399
    :cond_7
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mTvOK:Landroid/widget/TextView;

    .line 400
    .line 401
    new-instance v2, Ljava/lang/StringBuilder;

    .line 402
    .line 403
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 407
    .line 408
    .line 409
    iget-object v3, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 410
    .line 411
    invoke-virtual {v3}, Lcom/lljjcoder/citywheel/CustomConfig;->getConfirmTextColorStr()Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v3

    .line 415
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v2

    .line 422
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 423
    .line 424
    .line 425
    move-result v2

    .line 426
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 427
    .line 428
    .line 429
    :cond_8
    :goto_2
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 430
    .line 431
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CustomConfig;->getConfirmText()Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 436
    .line 437
    .line 438
    move-result v0

    .line 439
    if-nez v0, :cond_9

    .line 440
    .line 441
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mTvOK:Landroid/widget/TextView;

    .line 442
    .line 443
    iget-object v2, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 444
    .line 445
    invoke-virtual {v2}, Lcom/lljjcoder/citywheel/CustomConfig;->getConfirmText()Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 450
    .line 451
    .line 452
    :cond_9
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 453
    .line 454
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CustomConfig;->getConfirmTextSize()I

    .line 455
    .line 456
    .line 457
    move-result v0

    .line 458
    if-lez v0, :cond_a

    .line 459
    .line 460
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mTvOK:Landroid/widget/TextView;

    .line 461
    .line 462
    iget-object v2, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 463
    .line 464
    invoke-virtual {v2}, Lcom/lljjcoder/citywheel/CustomConfig;->getConfirmTextSize()I

    .line 465
    .line 466
    .line 467
    move-result v2

    .line 468
    int-to-float v2, v2

    .line 469
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 470
    .line 471
    .line 472
    :cond_a
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 473
    .line 474
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CustomConfig;->getCancelTextColorStr()Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 479
    .line 480
    .line 481
    move-result v0

    .line 482
    if-nez v0, :cond_c

    .line 483
    .line 484
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 485
    .line 486
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CustomConfig;->getCancelTextColorStr()Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 491
    .line 492
    .line 493
    move-result v0

    .line 494
    if-eqz v0, :cond_b

    .line 495
    .line 496
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mTvCancel:Landroid/widget/TextView;

    .line 497
    .line 498
    iget-object v1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 499
    .line 500
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CustomConfig;->getCancelTextColorStr()Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object v1

    .line 504
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 505
    .line 506
    .line 507
    move-result v1

    .line 508
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 509
    .line 510
    .line 511
    goto :goto_3

    .line 512
    :cond_b
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mTvCancel:Landroid/widget/TextView;

    .line 513
    .line 514
    new-instance v2, Ljava/lang/StringBuilder;

    .line 515
    .line 516
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 517
    .line 518
    .line 519
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 520
    .line 521
    .line 522
    iget-object v1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 523
    .line 524
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CustomConfig;->getCancelTextColorStr()Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object v1

    .line 528
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v1

    .line 535
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 536
    .line 537
    .line 538
    move-result v1

    .line 539
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 540
    .line 541
    .line 542
    :cond_c
    :goto_3
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 543
    .line 544
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CustomConfig;->getCancelText()Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 549
    .line 550
    .line 551
    move-result v0

    .line 552
    if-nez v0, :cond_d

    .line 553
    .line 554
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mTvCancel:Landroid/widget/TextView;

    .line 555
    .line 556
    iget-object v1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 557
    .line 558
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CustomConfig;->getCancelText()Ljava/lang/String;

    .line 559
    .line 560
    .line 561
    move-result-object v1

    .line 562
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 563
    .line 564
    .line 565
    :cond_d
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 566
    .line 567
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CustomConfig;->getCancelTextSize()I

    .line 568
    .line 569
    .line 570
    move-result v0

    .line 571
    if-lez v0, :cond_e

    .line 572
    .line 573
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mTvCancel:Landroid/widget/TextView;

    .line 574
    .line 575
    iget-object v1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 576
    .line 577
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CustomConfig;->getCancelTextSize()I

    .line 578
    .line 579
    .line 580
    move-result v1

    .line 581
    int-to-float v1, v1

    .line 582
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 583
    .line 584
    .line 585
    :cond_e
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewProvince:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 586
    .line 587
    invoke-virtual {v0, p0}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->addChangingListener(Lcom/lljjcoder/style/citypickerview/widget/wheel/OnWheelChangedListener;)V

    .line 588
    .line 589
    .line 590
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewCity:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 591
    .line 592
    invoke-virtual {v0, p0}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->addChangingListener(Lcom/lljjcoder/style/citypickerview/widget/wheel/OnWheelChangedListener;)V

    .line 593
    .line 594
    .line 595
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewDistrict:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 596
    .line 597
    invoke-virtual {v0, p0}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->addChangingListener(Lcom/lljjcoder/style/citypickerview/widget/wheel/OnWheelChangedListener;)V

    .line 598
    .line 599
    .line 600
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mTvCancel:Landroid/widget/TextView;

    .line 601
    .line 602
    new-instance v1, Lcom/lljjcoder/style/citycustome/CustomCityPicker$2;

    .line 603
    .line 604
    invoke-direct {v1, p0}, Lcom/lljjcoder/style/citycustome/CustomCityPicker$2;-><init>(Lcom/lljjcoder/style/citycustome/CustomCityPicker;)V

    .line 605
    .line 606
    .line 607
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 608
    .line 609
    .line 610
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mTvOK:Landroid/widget/TextView;

    .line 611
    .line 612
    new-instance v1, Lcom/lljjcoder/style/citycustome/CustomCityPicker$3;

    .line 613
    .line 614
    invoke-direct {v1, p0}, Lcom/lljjcoder/style/citycustome/CustomCityPicker$3;-><init>(Lcom/lljjcoder/style/citycustome/CustomCityPicker;)V

    .line 615
    .line 616
    .line 617
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 618
    .line 619
    .line 620
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 621
    .line 622
    if-eqz v0, :cond_f

    .line 623
    .line 624
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CustomConfig;->isShowBackground()Z

    .line 625
    .line 626
    .line 627
    move-result v0

    .line 628
    if-eqz v0, :cond_f

    .line 629
    .line 630
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mContext:Landroid/content/Context;

    .line 631
    .line 632
    const/high16 v1, 0x3f000000    # 0.5f

    .line 633
    .line 634
    invoke-static {v0, v1}, Lcom/lljjcoder/utils/utils;->setBackgroundAlpha(Landroid/content/Context;F)V

    .line 635
    .line 636
    .line 637
    :cond_f
    invoke-direct {p0}, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->setUpData()V

    .line 638
    .line 639
    .line 640
    return-void
.end method

.method private setUpData()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CustomConfig;->getCityDataList()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_3

    .line 10
    .line 11
    :cond_0
    iget-object v1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CustomConfig;->getDefaultProvinceName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, -0x1

    .line 22
    if-nez v1, :cond_2

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-lez v1, :cond_2

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-ge v1, v3, :cond_2

    .line 36
    .line 37
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, Lcom/lljjcoder/bean/CustomCityData;

    .line 42
    .line 43
    invoke-virtual {v3}, Lcom/lljjcoder/bean/CustomCityData;->getName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    iget-object v4, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 48
    .line 49
    invoke-virtual {v4}, Lcom/lljjcoder/citywheel/CustomConfig;->getDefaultProvinceName()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    move v1, v2

    .line 64
    :goto_1
    new-instance v3, Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/ArrayWheelAdapter;

    .line 65
    .line 66
    iget-object v4, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mContext:Landroid/content/Context;

    .line 67
    .line 68
    invoke-direct {v3, v4, v0}, Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/ArrayWheelAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 72
    .line 73
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CustomConfig;->getCustomItemLayout()Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    sget-object v4, Lcom/lljjcoder/citywheel/CityConfig;->NONE:Ljava/lang/Integer;

    .line 78
    .line 79
    if-eq v0, v4, :cond_3

    .line 80
    .line 81
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 82
    .line 83
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CustomConfig;->getCustomItemTextViewId()Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    if-eq v0, v4, :cond_3

    .line 88
    .line 89
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 90
    .line 91
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CustomConfig;->getCustomItemLayout()Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    invoke-virtual {v3, v0}, Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/AbstractWheelTextAdapter;->setItemResource(I)V

    .line 100
    .line 101
    .line 102
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 103
    .line 104
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CustomConfig;->getCustomItemTextViewId()Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    invoke-virtual {v3, v0}, Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/AbstractWheelTextAdapter;->setItemTextResource(I)V

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_3
    sget v0, Lcom/lljjcoder/style/citypickerview/R$layout;->default_item_city:I

    .line 117
    .line 118
    invoke-virtual {v3, v0}, Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/AbstractWheelTextAdapter;->setItemResource(I)V

    .line 119
    .line 120
    .line 121
    sget v0, Lcom/lljjcoder/style/citypickerview/R$id;->default_item_city_name_tv:I

    .line 122
    .line 123
    invoke-virtual {v3, v0}, Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/AbstractWheelTextAdapter;->setItemTextResource(I)V

    .line 124
    .line 125
    .line 126
    :goto_2
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewProvince:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 127
    .line 128
    invoke-virtual {v0, v3}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setViewAdapter(Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/WheelViewAdapter;)V

    .line 129
    .line 130
    .line 131
    if-eq v2, v1, :cond_4

    .line 132
    .line 133
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewProvince:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 134
    .line 135
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setCurrentItem(I)V

    .line 136
    .line 137
    .line 138
    :cond_4
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewProvince:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 139
    .line 140
    iget-object v1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 141
    .line 142
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CustomConfig;->getVisibleItems()I

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setVisibleItems(I)V

    .line 147
    .line 148
    .line 149
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewCity:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 150
    .line 151
    iget-object v1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 152
    .line 153
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CustomConfig;->getVisibleItems()I

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setVisibleItems(I)V

    .line 158
    .line 159
    .line 160
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewDistrict:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 161
    .line 162
    iget-object v1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 163
    .line 164
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CustomConfig;->getVisibleItems()I

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setVisibleItems(I)V

    .line 169
    .line 170
    .line 171
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewProvince:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 172
    .line 173
    iget-object v1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 174
    .line 175
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CustomConfig;->isProvinceCyclic()Z

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setCyclic(Z)V

    .line 180
    .line 181
    .line 182
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewCity:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 183
    .line 184
    iget-object v1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 185
    .line 186
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CustomConfig;->isCityCyclic()Z

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setCyclic(Z)V

    .line 191
    .line 192
    .line 193
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewDistrict:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 194
    .line 195
    iget-object v1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 196
    .line 197
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CustomConfig;->isDistrictCyclic()Z

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setCyclic(Z)V

    .line 202
    .line 203
    .line 204
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewProvince:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 205
    .line 206
    iget-object v1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 207
    .line 208
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CustomConfig;->isDrawShadows()Z

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setDrawShadows(Z)V

    .line 213
    .line 214
    .line 215
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewCity:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 216
    .line 217
    iget-object v1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 218
    .line 219
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CustomConfig;->isDrawShadows()Z

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setDrawShadows(Z)V

    .line 224
    .line 225
    .line 226
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewDistrict:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 227
    .line 228
    iget-object v1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 229
    .line 230
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CustomConfig;->isDrawShadows()Z

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setDrawShadows(Z)V

    .line 235
    .line 236
    .line 237
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewProvince:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 238
    .line 239
    iget-object v1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 240
    .line 241
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CustomConfig;->getLineColor()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setLineColorStr(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewProvince:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 249
    .line 250
    iget-object v1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 251
    .line 252
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CustomConfig;->getLineHeigh()I

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setLineWidth(I)V

    .line 257
    .line 258
    .line 259
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewCity:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 260
    .line 261
    iget-object v1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 262
    .line 263
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CustomConfig;->getLineColor()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setLineColorStr(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewCity:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 271
    .line 272
    iget-object v1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 273
    .line 274
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CustomConfig;->getLineHeigh()I

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setLineWidth(I)V

    .line 279
    .line 280
    .line 281
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewDistrict:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 282
    .line 283
    iget-object v1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 284
    .line 285
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CustomConfig;->getLineColor()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setLineColorStr(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewDistrict:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 293
    .line 294
    iget-object v1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 295
    .line 296
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CustomConfig;->getLineHeigh()I

    .line 297
    .line 298
    .line 299
    move-result v1

    .line 300
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setLineWidth(I)V

    .line 301
    .line 302
    .line 303
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->type:Lcom/lljjcoder/citywheel/CustomConfig$WheelType;

    .line 304
    .line 305
    sget-object v1, Lcom/lljjcoder/citywheel/CustomConfig$WheelType;->PRO_CITY:Lcom/lljjcoder/citywheel/CustomConfig$WheelType;

    .line 306
    .line 307
    if-eq v0, v1, :cond_6

    .line 308
    .line 309
    sget-object v1, Lcom/lljjcoder/citywheel/CustomConfig$WheelType;->PRO_CITY_DIS:Lcom/lljjcoder/citywheel/CustomConfig$WheelType;

    .line 310
    .line 311
    if-ne v0, v1, :cond_5

    .line 312
    .line 313
    goto :goto_4

    .line 314
    :cond_5
    :goto_3
    return-void

    .line 315
    :cond_6
    :goto_4
    invoke-direct {p0}, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->updateCities()V

    .line 316
    .line 317
    .line 318
    return-void
.end method

.method private setWheelShowLevel(Lcom/lljjcoder/citywheel/CustomConfig$WheelType;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/lljjcoder/citywheel/CustomConfig$WheelType;->PRO:Lcom/lljjcoder/citywheel/CustomConfig$WheelType;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    iget-object p1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewProvince:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 9
    .line 10
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewCity:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewDistrict:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 19
    .line 20
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    sget-object v0, Lcom/lljjcoder/citywheel/CustomConfig$WheelType;->PRO_CITY:Lcom/lljjcoder/citywheel/CustomConfig$WheelType;

    .line 25
    .line 26
    if-ne p1, v0, :cond_1

    .line 27
    .line 28
    iget-object p1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewProvince:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 29
    .line 30
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewCity:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 34
    .line 35
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewDistrict:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 39
    .line 40
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    iget-object p1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewProvince:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 45
    .line 46
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewCity:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 50
    .line 51
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewDistrict:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 55
    .line 56
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method private updateAreas()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewProvince:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->getCurrentItem()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewCity:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->getCurrentItem()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v2, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 14
    .line 15
    invoke-virtual {v2}, Lcom/lljjcoder/citywheel/CustomConfig;->getCityDataList()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lcom/lljjcoder/bean/CustomCityData;

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/lljjcoder/bean/CustomCityData;->getList()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_6

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-gt v2, v1, :cond_0

    .line 36
    .line 37
    goto/16 :goto_4

    .line 38
    .line 39
    :cond_0
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Lcom/lljjcoder/bean/CustomCityData;

    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/lljjcoder/bean/CustomCityData;->getList()Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-nez v0, :cond_1

    .line 50
    .line 51
    goto/16 :goto_4

    .line 52
    .line 53
    :cond_1
    iget-object v1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 54
    .line 55
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CustomConfig;->getDefaultDistrict()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    const/4 v2, 0x0

    .line 64
    const/4 v3, -0x1

    .line 65
    if-nez v1, :cond_3

    .line 66
    .line 67
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-lez v1, :cond_3

    .line 72
    .line 73
    move v1, v2

    .line 74
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-ge v1, v4, :cond_3

    .line 79
    .line 80
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    check-cast v4, Lcom/lljjcoder/bean/CustomCityData;

    .line 85
    .line 86
    invoke-virtual {v4}, Lcom/lljjcoder/bean/CustomCityData;->getName()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    iget-object v5, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 91
    .line 92
    invoke-virtual {v5}, Lcom/lljjcoder/citywheel/CustomConfig;->getDefaultDistrict()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    if-eqz v4, :cond_2

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_3
    move v1, v3

    .line 107
    :goto_1
    new-instance v4, Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/ArrayWheelAdapter;

    .line 108
    .line 109
    iget-object v5, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mContext:Landroid/content/Context;

    .line 110
    .line 111
    invoke-direct {v4, v5, v0}, Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/ArrayWheelAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 112
    .line 113
    .line 114
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 115
    .line 116
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CustomConfig;->getCustomItemLayout()Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    sget-object v5, Lcom/lljjcoder/citywheel/CityConfig;->NONE:Ljava/lang/Integer;

    .line 121
    .line 122
    if-eq v0, v5, :cond_4

    .line 123
    .line 124
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 125
    .line 126
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CustomConfig;->getCustomItemTextViewId()Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    if-eq v0, v5, :cond_4

    .line 131
    .line 132
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 133
    .line 134
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CustomConfig;->getCustomItemLayout()Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    invoke-virtual {v4, v0}, Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/AbstractWheelTextAdapter;->setItemResource(I)V

    .line 143
    .line 144
    .line 145
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 146
    .line 147
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CustomConfig;->getCustomItemTextViewId()Ljava/lang/Integer;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    invoke-virtual {v4, v0}, Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/AbstractWheelTextAdapter;->setItemTextResource(I)V

    .line 156
    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_4
    sget v0, Lcom/lljjcoder/style/citypickerview/R$layout;->default_item_city:I

    .line 160
    .line 161
    invoke-virtual {v4, v0}, Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/AbstractWheelTextAdapter;->setItemResource(I)V

    .line 162
    .line 163
    .line 164
    sget v0, Lcom/lljjcoder/style/citypickerview/R$id;->default_item_city_name_tv:I

    .line 165
    .line 166
    invoke-virtual {v4, v0}, Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/AbstractWheelTextAdapter;->setItemTextResource(I)V

    .line 167
    .line 168
    .line 169
    :goto_2
    if-eq v3, v1, :cond_5

    .line 170
    .line 171
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewDistrict:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 172
    .line 173
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setCurrentItem(I)V

    .line 174
    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_5
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewDistrict:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 178
    .line 179
    invoke-virtual {v0, v2}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setCurrentItem(I)V

    .line 180
    .line 181
    .line 182
    :goto_3
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewDistrict:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 183
    .line 184
    invoke-virtual {v0, v4}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setViewAdapter(Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/WheelViewAdapter;)V

    .line 185
    .line 186
    .line 187
    :cond_6
    :goto_4
    return-void
.end method

.method private updateCities()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewProvince:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->getCurrentItem()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CustomConfig;->getCityDataList()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lcom/lljjcoder/bean/CustomCityData;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/lljjcoder/bean/CustomCityData;->getList()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    goto/16 :goto_4

    .line 26
    .line 27
    :cond_0
    iget-object v1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 28
    .line 29
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CustomConfig;->getDefaultCityName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    const/4 v2, 0x0

    .line 38
    const/4 v3, -0x1

    .line 39
    if-nez v1, :cond_2

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-lez v1, :cond_2

    .line 46
    .line 47
    move v1, v2

    .line 48
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-ge v1, v4, :cond_2

    .line 53
    .line 54
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    check-cast v4, Lcom/lljjcoder/bean/CustomCityData;

    .line 59
    .line 60
    invoke-virtual {v4}, Lcom/lljjcoder/bean/CustomCityData;->getName()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    iget-object v5, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 65
    .line 66
    invoke-virtual {v5}, Lcom/lljjcoder/citywheel/CustomConfig;->getDefaultCityName()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-eqz v4, :cond_1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    move v1, v3

    .line 81
    :goto_1
    new-instance v4, Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/ArrayWheelAdapter;

    .line 82
    .line 83
    iget-object v5, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mContext:Landroid/content/Context;

    .line 84
    .line 85
    invoke-direct {v4, v5, v0}, Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/ArrayWheelAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 86
    .line 87
    .line 88
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 89
    .line 90
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CustomConfig;->getCustomItemLayout()Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    sget-object v5, Lcom/lljjcoder/citywheel/CityConfig;->NONE:Ljava/lang/Integer;

    .line 95
    .line 96
    if-eq v0, v5, :cond_3

    .line 97
    .line 98
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 99
    .line 100
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CustomConfig;->getCustomItemTextViewId()Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    if-eq v0, v5, :cond_3

    .line 105
    .line 106
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 107
    .line 108
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CustomConfig;->getCustomItemLayout()Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    invoke-virtual {v4, v0}, Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/AbstractWheelTextAdapter;->setItemResource(I)V

    .line 117
    .line 118
    .line 119
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 120
    .line 121
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CustomConfig;->getCustomItemTextViewId()Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    invoke-virtual {v4, v0}, Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/AbstractWheelTextAdapter;->setItemTextResource(I)V

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_3
    sget v0, Lcom/lljjcoder/style/citypickerview/R$layout;->default_item_city:I

    .line 134
    .line 135
    invoke-virtual {v4, v0}, Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/AbstractWheelTextAdapter;->setItemResource(I)V

    .line 136
    .line 137
    .line 138
    sget v0, Lcom/lljjcoder/style/citypickerview/R$id;->default_item_city_name_tv:I

    .line 139
    .line 140
    invoke-virtual {v4, v0}, Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/AbstractWheelTextAdapter;->setItemTextResource(I)V

    .line 141
    .line 142
    .line 143
    :goto_2
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewCity:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 144
    .line 145
    invoke-virtual {v0, v4}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setViewAdapter(Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/WheelViewAdapter;)V

    .line 146
    .line 147
    .line 148
    if-eq v3, v1, :cond_4

    .line 149
    .line 150
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewCity:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 151
    .line 152
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setCurrentItem(I)V

    .line 153
    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_4
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewCity:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 157
    .line 158
    invoke-virtual {v0, v2}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setCurrentItem(I)V

    .line 159
    .line 160
    .line 161
    :goto_3
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewCity:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 162
    .line 163
    invoke-virtual {v0, v4}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setViewAdapter(Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/WheelViewAdapter;)V

    .line 164
    .line 165
    .line 166
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->type:Lcom/lljjcoder/citywheel/CustomConfig$WheelType;

    .line 167
    .line 168
    sget-object v1, Lcom/lljjcoder/citywheel/CustomConfig$WheelType;->PRO_CITY_DIS:Lcom/lljjcoder/citywheel/CustomConfig$WheelType;

    .line 169
    .line 170
    if-ne v0, v1, :cond_5

    .line 171
    .line 172
    invoke-direct {p0}, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->updateAreas()V

    .line 173
    .line 174
    .line 175
    :cond_5
    :goto_4
    return-void
.end method


# virtual methods
.method public hide()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->isShow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->popwindow:Landroid/widget/PopupWindow;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public isShow()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->popwindow:Landroid/widget/PopupWindow;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public onChanged(Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;II)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewProvince:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 2
    .line 3
    if-ne p1, p2, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->updateCities()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object p2, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->mViewCity:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 10
    .line 11
    if-ne p1, p2, :cond_1

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->updateAreas()V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public setCustomConfig(Lcom/lljjcoder/citywheel/CustomConfig;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->config:Lcom/lljjcoder/citywheel/CustomConfig;

    .line 2
    .line 3
    return-void
.end method

.method public setOnCustomCityPickerItemClickListener(Lcom/lljjcoder/Interface/OnCustomCityPickerItemClickListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->listener:Lcom/lljjcoder/Interface/OnCustomCityPickerItemClickListener;

    .line 2
    .line 3
    return-void
.end method

.method public showCityPicker()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->initView()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->isShow()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->popwindow:Landroid/widget/PopupWindow;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/lljjcoder/style/citycustome/CustomCityPicker;->popview:Landroid/view/View;

    .line 13
    .line 14
    const/16 v2, 0x50

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-virtual {v0, v1, v2, v3, v3}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method
