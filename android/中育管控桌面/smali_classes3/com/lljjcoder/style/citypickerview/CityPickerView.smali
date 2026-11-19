.class public Lcom/lljjcoder/style/citypickerview/CityPickerView;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/lljjcoder/style/citypickerview/widget/CanShow;
.implements Lcom/lljjcoder/style/citypickerview/widget/wheel/OnWheelChangedListener;


# instance fields
.field private TAG:Ljava/lang/String;

.field private config:Lcom/lljjcoder/citywheel/CityConfig;

.field private context:Landroid/content/Context;

.field private mBaseListener:Lcom/lljjcoder/Interface/OnCityItemClickListener;

.field private mRelativeTitleBg:Landroid/widget/RelativeLayout;

.field private mTvCancel:Landroid/widget/TextView;

.field private mTvOK:Landroid/widget/TextView;

.field private mTvTitle:Landroid/widget/TextView;

.field private mViewCity:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

.field private mViewDistrict:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

.field private mViewProvince:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

.field private parseHelper:Lcom/lljjcoder/citywheel/CityParseHelper;

.field private popview:Landroid/view/View;

.field private popwindow:Landroid/widget/PopupWindow;

.field private proArra:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/lljjcoder/bean/ProvinceBean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "citypicker_log"

    .line 5
    .line 6
    iput-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->TAG:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic access$000(Lcom/lljjcoder/style/citypickerview/CityPickerView;)Lcom/lljjcoder/citywheel/CityConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$100(Lcom/lljjcoder/style/citypickerview/CityPickerView;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->context:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$200(Lcom/lljjcoder/style/citypickerview/CityPickerView;)Lcom/lljjcoder/Interface/OnCityItemClickListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mBaseListener:Lcom/lljjcoder/Interface/OnCityItemClickListener;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$300(Lcom/lljjcoder/style/citypickerview/CityPickerView;)Lcom/lljjcoder/citywheel/CityParseHelper;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->parseHelper:Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 2
    .line 3
    return-object p0
.end method

.method private getProArrData(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/lljjcoder/bean/ProvinceBean;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/lljjcoder/bean/ProvinceBean;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    move v2, v1

    .line 8
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-ge v2, v3, :cond_0

    .line 13
    .line 14
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object p1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/lljjcoder/citywheel/CityConfig;->isShowGAT()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-nez p1, :cond_1

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    add-int/lit8 p1, p1, -0x1

    .line 37
    .line 38
    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    add-int/lit8 p1, p1, -0x1

    .line 46
    .line 47
    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    add-int/lit8 p1, p1, -0x1

    .line 55
    .line 56
    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 62
    .line 63
    .line 64
    iput-object p1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->proArra:Ljava/util/List;

    .line 65
    .line 66
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-ge v1, p1, :cond_2

    .line 71
    .line 72
    iget-object p1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->proArra:Ljava/util/List;

    .line 73
    .line 74
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    add-int/lit8 v1, v1, 0x1

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    iget-object p1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->proArra:Ljava/util/List;

    .line 85
    .line 86
    return-object p1
.end method

.method private initCityPickerPopwindow()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 2
    .line 3
    if-eqz v0, :cond_13

    .line 4
    .line 5
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->parseHelper:Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 10
    .line 11
    invoke-direct {v0}, Lcom/lljjcoder/citywheel/CityParseHelper;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->parseHelper:Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->parseHelper:Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CityParseHelper;->getProvinceBeanArrayList()Ljava/util/ArrayList;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->context:Landroid/content/Context;

    .line 29
    .line 30
    const-string v1, "\u8bf7\u5728Activity\u4e2d\u589e\u52a0init\u64cd\u4f5c"

    .line 31
    .line 32
    invoke-static {v0, v1}, Lcom/lljjcoder/style/citylist/Toast/ToastUtils;->showLongToast(Landroid/content/Context;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->context:Landroid/content/Context;

    .line 37
    .line 38
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sget v1, Lcom/lljjcoder/style/citypickerview/R$layout;->pop_citypicker:I

    .line 43
    .line 44
    const/4 v2, 0x0

    .line 45
    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iput-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->popview:Landroid/view/View;

    .line 50
    .line 51
    sget v1, Lcom/lljjcoder/style/citypickerview/R$id;->id_province:I

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 58
    .line 59
    iput-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewProvince:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 60
    .line 61
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->popview:Landroid/view/View;

    .line 62
    .line 63
    sget v1, Lcom/lljjcoder/style/citypickerview/R$id;->id_city:I

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 70
    .line 71
    iput-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewCity:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 72
    .line 73
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->popview:Landroid/view/View;

    .line 74
    .line 75
    sget v1, Lcom/lljjcoder/style/citypickerview/R$id;->id_district:I

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 82
    .line 83
    iput-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewDistrict:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 84
    .line 85
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->popview:Landroid/view/View;

    .line 86
    .line 87
    sget v1, Lcom/lljjcoder/style/citypickerview/R$id;->rl_title:I

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    check-cast v0, Landroid/widget/RelativeLayout;

    .line 94
    .line 95
    iput-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mRelativeTitleBg:Landroid/widget/RelativeLayout;

    .line 96
    .line 97
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->popview:Landroid/view/View;

    .line 98
    .line 99
    sget v1, Lcom/lljjcoder/style/citypickerview/R$id;->tv_confirm:I

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    check-cast v0, Landroid/widget/TextView;

    .line 106
    .line 107
    iput-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mTvOK:Landroid/widget/TextView;

    .line 108
    .line 109
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->popview:Landroid/view/View;

    .line 110
    .line 111
    sget v1, Lcom/lljjcoder/style/citypickerview/R$id;->tv_title:I

    .line 112
    .line 113
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    check-cast v0, Landroid/widget/TextView;

    .line 118
    .line 119
    iput-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mTvTitle:Landroid/widget/TextView;

    .line 120
    .line 121
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->popview:Landroid/view/View;

    .line 122
    .line 123
    sget v1, Lcom/lljjcoder/style/citypickerview/R$id;->tv_cancel:I

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    check-cast v0, Landroid/widget/TextView;

    .line 130
    .line 131
    iput-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mTvCancel:Landroid/widget/TextView;

    .line 132
    .line 133
    new-instance v0, Landroid/widget/PopupWindow;

    .line 134
    .line 135
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->popview:Landroid/view/View;

    .line 136
    .line 137
    const/4 v2, -0x1

    .line 138
    const/4 v3, -0x2

    .line 139
    invoke-direct {v0, v1, v2, v3}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;II)V

    .line 140
    .line 141
    .line 142
    iput-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->popwindow:Landroid/widget/PopupWindow;

    .line 143
    .line 144
    sget v1, Lcom/lljjcoder/style/citypickerview/R$style;->AnimBottom:I

    .line 145
    .line 146
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 147
    .line 148
    .line 149
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->popwindow:Landroid/widget/PopupWindow;

    .line 150
    .line 151
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    .line 152
    .line 153
    invoke-direct {v1}, Landroid/graphics/drawable/ColorDrawable;-><init>()V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 157
    .line 158
    .line 159
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->popwindow:Landroid/widget/PopupWindow;

    .line 160
    .line 161
    const/4 v1, 0x1

    .line 162
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setTouchable(Z)V

    .line 163
    .line 164
    .line 165
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->popwindow:Landroid/widget/PopupWindow;

    .line 166
    .line 167
    const/4 v2, 0x0

    .line 168
    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 169
    .line 170
    .line 171
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->popwindow:Landroid/widget/PopupWindow;

    .line 172
    .line 173
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 174
    .line 175
    .line 176
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->popwindow:Landroid/widget/PopupWindow;

    .line 177
    .line 178
    new-instance v1, Lcom/lljjcoder/style/citypickerview/CityPickerView$1;

    .line 179
    .line 180
    invoke-direct {v1, p0}, Lcom/lljjcoder/style/citypickerview/CityPickerView$1;-><init>(Lcom/lljjcoder/style/citypickerview/CityPickerView;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 184
    .line 185
    .line 186
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 187
    .line 188
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CityConfig;->getTitleBackgroundColorStr()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    const-string v1, "#"

    .line 197
    .line 198
    if-nez v0, :cond_3

    .line 199
    .line 200
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 201
    .line 202
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CityConfig;->getTitleBackgroundColorStr()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    if-eqz v0, :cond_2

    .line 211
    .line 212
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mRelativeTitleBg:Landroid/widget/RelativeLayout;

    .line 213
    .line 214
    iget-object v3, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 215
    .line 216
    invoke-virtual {v3}, Lcom/lljjcoder/citywheel/CityConfig;->getTitleBackgroundColorStr()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 221
    .line 222
    .line 223
    move-result v3

    .line 224
    invoke-virtual {v0, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 225
    .line 226
    .line 227
    goto :goto_0

    .line 228
    :cond_2
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mRelativeTitleBg:Landroid/widget/RelativeLayout;

    .line 229
    .line 230
    new-instance v3, Ljava/lang/StringBuilder;

    .line 231
    .line 232
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    iget-object v4, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 239
    .line 240
    invoke-virtual {v4}, Lcom/lljjcoder/citywheel/CityConfig;->getTitleBackgroundColorStr()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    invoke-virtual {v0, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 256
    .line 257
    .line 258
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 259
    .line 260
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CityConfig;->getTitle()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 265
    .line 266
    .line 267
    move-result v0

    .line 268
    if-nez v0, :cond_4

    .line 269
    .line 270
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mTvTitle:Landroid/widget/TextView;

    .line 271
    .line 272
    iget-object v3, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 273
    .line 274
    invoke-virtual {v3}, Lcom/lljjcoder/citywheel/CityConfig;->getTitle()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 279
    .line 280
    .line 281
    :cond_4
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 282
    .line 283
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CityConfig;->getTitleTextSize()I

    .line 284
    .line 285
    .line 286
    move-result v0

    .line 287
    if-lez v0, :cond_5

    .line 288
    .line 289
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mTvTitle:Landroid/widget/TextView;

    .line 290
    .line 291
    iget-object v3, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 292
    .line 293
    invoke-virtual {v3}, Lcom/lljjcoder/citywheel/CityConfig;->getTitleTextSize()I

    .line 294
    .line 295
    .line 296
    move-result v3

    .line 297
    int-to-float v3, v3

    .line 298
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 299
    .line 300
    .line 301
    :cond_5
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 302
    .line 303
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CityConfig;->getTitleTextColorStr()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 308
    .line 309
    .line 310
    move-result v0

    .line 311
    if-nez v0, :cond_7

    .line 312
    .line 313
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 314
    .line 315
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CityConfig;->getTitleTextColorStr()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 320
    .line 321
    .line 322
    move-result v0

    .line 323
    if-eqz v0, :cond_6

    .line 324
    .line 325
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mTvTitle:Landroid/widget/TextView;

    .line 326
    .line 327
    iget-object v3, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 328
    .line 329
    invoke-virtual {v3}, Lcom/lljjcoder/citywheel/CityConfig;->getTitleTextColorStr()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v3

    .line 333
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 334
    .line 335
    .line 336
    move-result v3

    .line 337
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 338
    .line 339
    .line 340
    goto :goto_1

    .line 341
    :cond_6
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mTvTitle:Landroid/widget/TextView;

    .line 342
    .line 343
    new-instance v3, Ljava/lang/StringBuilder;

    .line 344
    .line 345
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    iget-object v4, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 352
    .line 353
    invoke-virtual {v4}, Lcom/lljjcoder/citywheel/CityConfig;->getTitleTextColorStr()Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v4

    .line 357
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v3

    .line 364
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 365
    .line 366
    .line 367
    move-result v3

    .line 368
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 369
    .line 370
    .line 371
    :cond_7
    :goto_1
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 372
    .line 373
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CityConfig;->getConfirmTextColorStr()Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 378
    .line 379
    .line 380
    move-result v0

    .line 381
    if-nez v0, :cond_9

    .line 382
    .line 383
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 384
    .line 385
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CityConfig;->getConfirmTextColorStr()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 390
    .line 391
    .line 392
    move-result v0

    .line 393
    if-eqz v0, :cond_8

    .line 394
    .line 395
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mTvOK:Landroid/widget/TextView;

    .line 396
    .line 397
    iget-object v3, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 398
    .line 399
    invoke-virtual {v3}, Lcom/lljjcoder/citywheel/CityConfig;->getConfirmTextColorStr()Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v3

    .line 403
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 404
    .line 405
    .line 406
    move-result v3

    .line 407
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 408
    .line 409
    .line 410
    goto :goto_2

    .line 411
    :cond_8
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mTvOK:Landroid/widget/TextView;

    .line 412
    .line 413
    new-instance v3, Ljava/lang/StringBuilder;

    .line 414
    .line 415
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    iget-object v4, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 422
    .line 423
    invoke-virtual {v4}, Lcom/lljjcoder/citywheel/CityConfig;->getConfirmTextColorStr()Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v4

    .line 427
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v3

    .line 434
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 435
    .line 436
    .line 437
    move-result v3

    .line 438
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 439
    .line 440
    .line 441
    :cond_9
    :goto_2
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 442
    .line 443
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CityConfig;->getConfirmText()Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 448
    .line 449
    .line 450
    move-result v0

    .line 451
    if-nez v0, :cond_a

    .line 452
    .line 453
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mTvOK:Landroid/widget/TextView;

    .line 454
    .line 455
    iget-object v3, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 456
    .line 457
    invoke-virtual {v3}, Lcom/lljjcoder/citywheel/CityConfig;->getConfirmText()Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v3

    .line 461
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 462
    .line 463
    .line 464
    :cond_a
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 465
    .line 466
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CityConfig;->getConfirmTextSize()I

    .line 467
    .line 468
    .line 469
    move-result v0

    .line 470
    if-lez v0, :cond_b

    .line 471
    .line 472
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mTvOK:Landroid/widget/TextView;

    .line 473
    .line 474
    iget-object v3, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 475
    .line 476
    invoke-virtual {v3}, Lcom/lljjcoder/citywheel/CityConfig;->getConfirmTextSize()I

    .line 477
    .line 478
    .line 479
    move-result v3

    .line 480
    int-to-float v3, v3

    .line 481
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 482
    .line 483
    .line 484
    :cond_b
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 485
    .line 486
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CityConfig;->getCancelTextColorStr()Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 491
    .line 492
    .line 493
    move-result v0

    .line 494
    if-nez v0, :cond_d

    .line 495
    .line 496
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 497
    .line 498
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CityConfig;->getCancelTextColorStr()Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 503
    .line 504
    .line 505
    move-result v0

    .line 506
    if-eqz v0, :cond_c

    .line 507
    .line 508
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mTvCancel:Landroid/widget/TextView;

    .line 509
    .line 510
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 511
    .line 512
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CityConfig;->getCancelTextColorStr()Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object v1

    .line 516
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 517
    .line 518
    .line 519
    move-result v1

    .line 520
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 521
    .line 522
    .line 523
    goto :goto_3

    .line 524
    :cond_c
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mTvCancel:Landroid/widget/TextView;

    .line 525
    .line 526
    new-instance v3, Ljava/lang/StringBuilder;

    .line 527
    .line 528
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 529
    .line 530
    .line 531
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 532
    .line 533
    .line 534
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 535
    .line 536
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CityConfig;->getCancelTextColorStr()Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v1

    .line 540
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 541
    .line 542
    .line 543
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object v1

    .line 547
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 548
    .line 549
    .line 550
    move-result v1

    .line 551
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 552
    .line 553
    .line 554
    :cond_d
    :goto_3
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 555
    .line 556
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CityConfig;->getCancelText()Ljava/lang/String;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 561
    .line 562
    .line 563
    move-result v0

    .line 564
    if-nez v0, :cond_e

    .line 565
    .line 566
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mTvCancel:Landroid/widget/TextView;

    .line 567
    .line 568
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 569
    .line 570
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CityConfig;->getCancelText()Ljava/lang/String;

    .line 571
    .line 572
    .line 573
    move-result-object v1

    .line 574
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 575
    .line 576
    .line 577
    :cond_e
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 578
    .line 579
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CityConfig;->getCancelTextSize()I

    .line 580
    .line 581
    .line 582
    move-result v0

    .line 583
    if-lez v0, :cond_f

    .line 584
    .line 585
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mTvCancel:Landroid/widget/TextView;

    .line 586
    .line 587
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 588
    .line 589
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CityConfig;->getCancelTextSize()I

    .line 590
    .line 591
    .line 592
    move-result v1

    .line 593
    int-to-float v1, v1

    .line 594
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 595
    .line 596
    .line 597
    :cond_f
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 598
    .line 599
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CityConfig;->getWheelType()Lcom/lljjcoder/citywheel/CityConfig$WheelType;

    .line 600
    .line 601
    .line 602
    move-result-object v0

    .line 603
    sget-object v1, Lcom/lljjcoder/citywheel/CityConfig$WheelType;->PRO:Lcom/lljjcoder/citywheel/CityConfig$WheelType;

    .line 604
    .line 605
    const/16 v3, 0x8

    .line 606
    .line 607
    if-ne v0, v1, :cond_10

    .line 608
    .line 609
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewCity:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 610
    .line 611
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 612
    .line 613
    .line 614
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewDistrict:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 615
    .line 616
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 617
    .line 618
    .line 619
    goto :goto_4

    .line 620
    :cond_10
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 621
    .line 622
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CityConfig;->getWheelType()Lcom/lljjcoder/citywheel/CityConfig$WheelType;

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    sget-object v1, Lcom/lljjcoder/citywheel/CityConfig$WheelType;->PRO_CITY:Lcom/lljjcoder/citywheel/CityConfig$WheelType;

    .line 627
    .line 628
    if-ne v0, v1, :cond_11

    .line 629
    .line 630
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewDistrict:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 631
    .line 632
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 633
    .line 634
    .line 635
    goto :goto_4

    .line 636
    :cond_11
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewProvince:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 637
    .line 638
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 639
    .line 640
    .line 641
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewCity:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 642
    .line 643
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 644
    .line 645
    .line 646
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewDistrict:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 647
    .line 648
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 649
    .line 650
    .line 651
    :goto_4
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewProvince:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 652
    .line 653
    invoke-virtual {v0, p0}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->addChangingListener(Lcom/lljjcoder/style/citypickerview/widget/wheel/OnWheelChangedListener;)V

    .line 654
    .line 655
    .line 656
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewCity:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 657
    .line 658
    invoke-virtual {v0, p0}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->addChangingListener(Lcom/lljjcoder/style/citypickerview/widget/wheel/OnWheelChangedListener;)V

    .line 659
    .line 660
    .line 661
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewDistrict:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 662
    .line 663
    invoke-virtual {v0, p0}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->addChangingListener(Lcom/lljjcoder/style/citypickerview/widget/wheel/OnWheelChangedListener;)V

    .line 664
    .line 665
    .line 666
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mTvCancel:Landroid/widget/TextView;

    .line 667
    .line 668
    new-instance v1, Lcom/lljjcoder/style/citypickerview/CityPickerView$2;

    .line 669
    .line 670
    invoke-direct {v1, p0}, Lcom/lljjcoder/style/citypickerview/CityPickerView$2;-><init>(Lcom/lljjcoder/style/citypickerview/CityPickerView;)V

    .line 671
    .line 672
    .line 673
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 674
    .line 675
    .line 676
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mTvOK:Landroid/widget/TextView;

    .line 677
    .line 678
    new-instance v1, Lcom/lljjcoder/style/citypickerview/CityPickerView$3;

    .line 679
    .line 680
    invoke-direct {v1, p0}, Lcom/lljjcoder/style/citypickerview/CityPickerView$3;-><init>(Lcom/lljjcoder/style/citypickerview/CityPickerView;)V

    .line 681
    .line 682
    .line 683
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 684
    .line 685
    .line 686
    invoke-direct {p0}, Lcom/lljjcoder/style/citypickerview/CityPickerView;->setUpData()V

    .line 687
    .line 688
    .line 689
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 690
    .line 691
    if-eqz v0, :cond_12

    .line 692
    .line 693
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CityConfig;->isShowBackground()Z

    .line 694
    .line 695
    .line 696
    move-result v0

    .line 697
    if-eqz v0, :cond_12

    .line 698
    .line 699
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->context:Landroid/content/Context;

    .line 700
    .line 701
    const/high16 v1, 0x3f000000    # 0.5f

    .line 702
    .line 703
    invoke-static {v0, v1}, Lcom/lljjcoder/utils/utils;->setBackgroundAlpha(Landroid/content/Context;F)V

    .line 704
    .line 705
    .line 706
    :cond_12
    return-void

    .line 707
    :cond_13
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 708
    .line 709
    const-string v1, "please set config first..."

    .line 710
    .line 711
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 712
    .line 713
    .line 714
    throw v0
.end method

.method private setUpData()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->parseHelper:Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_3

    .line 10
    .line 11
    :cond_0
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CityParseHelper;->getProvinceBeenArray()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-direct {p0, v0}, Lcom/lljjcoder/style/citypickerview/CityPickerView;->getProArrData(Ljava/util/List;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CityConfig;->getDefaultProvinceName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/4 v1, -0x1

    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->proArra:Ljava/util/List;

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-lez v0, :cond_2

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    :goto_0
    iget-object v2, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->proArra:Ljava/util/List;

    .line 41
    .line 42
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-ge v0, v2, :cond_2

    .line 47
    .line 48
    iget-object v2, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->proArra:Ljava/util/List;

    .line 49
    .line 50
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Lcom/lljjcoder/bean/ProvinceBean;

    .line 55
    .line 56
    invoke-virtual {v2}, Lcom/lljjcoder/bean/ProvinceBean;->getName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    iget-object v3, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 61
    .line 62
    invoke-virtual {v3}, Lcom/lljjcoder/citywheel/CityConfig;->getDefaultProvinceName()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    move v0, v1

    .line 77
    :goto_1
    new-instance v2, Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/ArrayWheelAdapter;

    .line 78
    .line 79
    iget-object v3, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->context:Landroid/content/Context;

    .line 80
    .line 81
    iget-object v4, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->proArra:Ljava/util/List;

    .line 82
    .line 83
    invoke-direct {v2, v3, v4}, Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/ArrayWheelAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 84
    .line 85
    .line 86
    iget-object v3, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewProvince:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 87
    .line 88
    invoke-virtual {v3, v2}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setViewAdapter(Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/WheelViewAdapter;)V

    .line 89
    .line 90
    .line 91
    iget-object v3, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 92
    .line 93
    invoke-virtual {v3}, Lcom/lljjcoder/citywheel/CityConfig;->getCustomItemLayout()Ljava/lang/Integer;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    sget-object v4, Lcom/lljjcoder/citywheel/CityConfig;->NONE:Ljava/lang/Integer;

    .line 98
    .line 99
    if-eq v3, v4, :cond_3

    .line 100
    .line 101
    iget-object v3, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 102
    .line 103
    invoke-virtual {v3}, Lcom/lljjcoder/citywheel/CityConfig;->getCustomItemTextViewId()Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    if-eq v3, v4, :cond_3

    .line 108
    .line 109
    iget-object v3, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 110
    .line 111
    invoke-virtual {v3}, Lcom/lljjcoder/citywheel/CityConfig;->getCustomItemLayout()Ljava/lang/Integer;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    invoke-virtual {v2, v3}, Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/AbstractWheelTextAdapter;->setItemResource(I)V

    .line 120
    .line 121
    .line 122
    iget-object v3, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 123
    .line 124
    invoke-virtual {v3}, Lcom/lljjcoder/citywheel/CityConfig;->getCustomItemTextViewId()Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    invoke-virtual {v2, v3}, Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/AbstractWheelTextAdapter;->setItemTextResource(I)V

    .line 133
    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_3
    sget v3, Lcom/lljjcoder/style/citypickerview/R$layout;->default_item_city:I

    .line 137
    .line 138
    invoke-virtual {v2, v3}, Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/AbstractWheelTextAdapter;->setItemResource(I)V

    .line 139
    .line 140
    .line 141
    sget v3, Lcom/lljjcoder/style/citypickerview/R$id;->default_item_city_name_tv:I

    .line 142
    .line 143
    invoke-virtual {v2, v3}, Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/AbstractWheelTextAdapter;->setItemTextResource(I)V

    .line 144
    .line 145
    .line 146
    :goto_2
    if-eq v1, v0, :cond_4

    .line 147
    .line 148
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewProvince:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 149
    .line 150
    invoke-virtual {v1, v0}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setCurrentItem(I)V

    .line 151
    .line 152
    .line 153
    :cond_4
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewProvince:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 154
    .line 155
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 156
    .line 157
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CityConfig;->getVisibleItems()I

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setVisibleItems(I)V

    .line 162
    .line 163
    .line 164
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewCity:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 165
    .line 166
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 167
    .line 168
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CityConfig;->getVisibleItems()I

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setVisibleItems(I)V

    .line 173
    .line 174
    .line 175
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewDistrict:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 176
    .line 177
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 178
    .line 179
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CityConfig;->getVisibleItems()I

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setVisibleItems(I)V

    .line 184
    .line 185
    .line 186
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewProvince:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 187
    .line 188
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 189
    .line 190
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CityConfig;->isProvinceCyclic()Z

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setCyclic(Z)V

    .line 195
    .line 196
    .line 197
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewCity:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 198
    .line 199
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 200
    .line 201
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CityConfig;->isCityCyclic()Z

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setCyclic(Z)V

    .line 206
    .line 207
    .line 208
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewDistrict:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 209
    .line 210
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 211
    .line 212
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CityConfig;->isDistrictCyclic()Z

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setCyclic(Z)V

    .line 217
    .line 218
    .line 219
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewProvince:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 220
    .line 221
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 222
    .line 223
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CityConfig;->isDrawShadows()Z

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setDrawShadows(Z)V

    .line 228
    .line 229
    .line 230
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewCity:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 231
    .line 232
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 233
    .line 234
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CityConfig;->isDrawShadows()Z

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setDrawShadows(Z)V

    .line 239
    .line 240
    .line 241
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewDistrict:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 242
    .line 243
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 244
    .line 245
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CityConfig;->isDrawShadows()Z

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setDrawShadows(Z)V

    .line 250
    .line 251
    .line 252
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewProvince:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 253
    .line 254
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 255
    .line 256
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CityConfig;->getLineColor()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setLineColorStr(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewProvince:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 264
    .line 265
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 266
    .line 267
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CityConfig;->getLineHeigh()I

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setLineWidth(I)V

    .line 272
    .line 273
    .line 274
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewCity:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 275
    .line 276
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 277
    .line 278
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CityConfig;->getLineColor()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setLineColorStr(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewCity:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 286
    .line 287
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 288
    .line 289
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CityConfig;->getLineHeigh()I

    .line 290
    .line 291
    .line 292
    move-result v1

    .line 293
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setLineWidth(I)V

    .line 294
    .line 295
    .line 296
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewDistrict:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 297
    .line 298
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 299
    .line 300
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CityConfig;->getLineColor()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setLineColorStr(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewDistrict:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 308
    .line 309
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 310
    .line 311
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CityConfig;->getLineHeigh()I

    .line 312
    .line 313
    .line 314
    move-result v1

    .line 315
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setLineWidth(I)V

    .line 316
    .line 317
    .line 318
    invoke-direct {p0}, Lcom/lljjcoder/style/citypickerview/CityPickerView;->updateCities()V

    .line 319
    .line 320
    .line 321
    invoke-direct {p0}, Lcom/lljjcoder/style/citypickerview/CityPickerView;->updateAreas()V

    .line 322
    .line 323
    .line 324
    :cond_5
    :goto_3
    return-void
.end method

.method private updateAreas()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewCity:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->getCurrentItem()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->parseHelper:Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CityParseHelper;->getPro_CityMap()Ljava/util/Map;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_9

    .line 14
    .line 15
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->parseHelper:Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CityParseHelper;->getCity_DisMap()Ljava/util/Map;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    goto/16 :goto_4

    .line 24
    .line 25
    :cond_0
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 26
    .line 27
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CityConfig;->getWheelType()Lcom/lljjcoder/citywheel/CityConfig$WheelType;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    sget-object v2, Lcom/lljjcoder/citywheel/CityConfig$WheelType;->PRO_CITY:Lcom/lljjcoder/citywheel/CityConfig$WheelType;

    .line 32
    .line 33
    if-eq v1, v2, :cond_1

    .line 34
    .line 35
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 36
    .line 37
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CityConfig;->getWheelType()Lcom/lljjcoder/citywheel/CityConfig$WheelType;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    sget-object v2, Lcom/lljjcoder/citywheel/CityConfig$WheelType;->PRO_CITY_DIS:Lcom/lljjcoder/citywheel/CityConfig$WheelType;

    .line 42
    .line 43
    if-ne v1, v2, :cond_9

    .line 44
    .line 45
    :cond_1
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->parseHelper:Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 46
    .line 47
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CityParseHelper;->getPro_CityMap()Ljava/util/Map;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iget-object v2, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->parseHelper:Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 52
    .line 53
    invoke-virtual {v2}, Lcom/lljjcoder/citywheel/CityParseHelper;->getProvinceBean()Lcom/lljjcoder/bean/ProvinceBean;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v2}, Lcom/lljjcoder/bean/ProvinceBean;->getName()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, Ljava/util/List;

    .line 66
    .line 67
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Lcom/lljjcoder/bean/CityBean;

    .line 72
    .line 73
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->parseHelper:Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 74
    .line 75
    invoke-virtual {v1, v0}, Lcom/lljjcoder/citywheel/CityParseHelper;->setCityBean(Lcom/lljjcoder/bean/CityBean;)V

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 79
    .line 80
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CityConfig;->getWheelType()Lcom/lljjcoder/citywheel/CityConfig$WheelType;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    sget-object v2, Lcom/lljjcoder/citywheel/CityConfig$WheelType;->PRO_CITY_DIS:Lcom/lljjcoder/citywheel/CityConfig$WheelType;

    .line 85
    .line 86
    if-ne v1, v2, :cond_9

    .line 87
    .line 88
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->parseHelper:Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 89
    .line 90
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CityParseHelper;->getCity_DisMap()Ljava/util/Map;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    new-instance v2, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    .line 98
    .line 99
    iget-object v3, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->parseHelper:Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 100
    .line 101
    invoke-virtual {v3}, Lcom/lljjcoder/citywheel/CityParseHelper;->getProvinceBean()Lcom/lljjcoder/bean/ProvinceBean;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-virtual {v3}, Lcom/lljjcoder/bean/ProvinceBean;->getName()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Lcom/lljjcoder/bean/CityBean;->getName()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    check-cast v1, Ljava/util/List;

    .line 128
    .line 129
    if-nez v1, :cond_2

    .line 130
    .line 131
    goto/16 :goto_4

    .line 132
    .line 133
    :cond_2
    iget-object v2, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 134
    .line 135
    invoke-virtual {v2}, Lcom/lljjcoder/citywheel/CityConfig;->getDefaultDistrict()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    const/4 v3, -0x1

    .line 144
    const/4 v4, 0x0

    .line 145
    if-nez v2, :cond_4

    .line 146
    .line 147
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    if-lez v2, :cond_4

    .line 152
    .line 153
    move v2, v4

    .line 154
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    if-ge v2, v5, :cond_4

    .line 159
    .line 160
    iget-object v5, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 161
    .line 162
    invoke-virtual {v5}, Lcom/lljjcoder/citywheel/CityConfig;->getDefaultDistrict()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    check-cast v6, Lcom/lljjcoder/bean/DistrictBean;

    .line 171
    .line 172
    invoke-virtual {v6}, Lcom/lljjcoder/bean/DistrictBean;->getName()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v6

    .line 176
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    if-eqz v5, :cond_3

    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 184
    .line 185
    goto :goto_0

    .line 186
    :cond_4
    move v2, v3

    .line 187
    :goto_1
    new-instance v5, Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/ArrayWheelAdapter;

    .line 188
    .line 189
    iget-object v6, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->context:Landroid/content/Context;

    .line 190
    .line 191
    invoke-direct {v5, v6, v1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/ArrayWheelAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 192
    .line 193
    .line 194
    iget-object v6, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 195
    .line 196
    invoke-virtual {v6}, Lcom/lljjcoder/citywheel/CityConfig;->getCustomItemLayout()Ljava/lang/Integer;

    .line 197
    .line 198
    .line 199
    move-result-object v6

    .line 200
    sget-object v7, Lcom/lljjcoder/citywheel/CityConfig;->NONE:Ljava/lang/Integer;

    .line 201
    .line 202
    if-eq v6, v7, :cond_5

    .line 203
    .line 204
    iget-object v6, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 205
    .line 206
    invoke-virtual {v6}, Lcom/lljjcoder/citywheel/CityConfig;->getCustomItemTextViewId()Ljava/lang/Integer;

    .line 207
    .line 208
    .line 209
    move-result-object v6

    .line 210
    if-eq v6, v7, :cond_5

    .line 211
    .line 212
    iget-object v6, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 213
    .line 214
    invoke-virtual {v6}, Lcom/lljjcoder/citywheel/CityConfig;->getCustomItemLayout()Ljava/lang/Integer;

    .line 215
    .line 216
    .line 217
    move-result-object v6

    .line 218
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 219
    .line 220
    .line 221
    move-result v6

    .line 222
    invoke-virtual {v5, v6}, Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/AbstractWheelTextAdapter;->setItemResource(I)V

    .line 223
    .line 224
    .line 225
    iget-object v6, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 226
    .line 227
    invoke-virtual {v6}, Lcom/lljjcoder/citywheel/CityConfig;->getCustomItemTextViewId()Ljava/lang/Integer;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 232
    .line 233
    .line 234
    move-result v6

    .line 235
    invoke-virtual {v5, v6}, Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/AbstractWheelTextAdapter;->setItemTextResource(I)V

    .line 236
    .line 237
    .line 238
    goto :goto_2

    .line 239
    :cond_5
    sget v6, Lcom/lljjcoder/style/citypickerview/R$layout;->default_item_city:I

    .line 240
    .line 241
    invoke-virtual {v5, v6}, Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/AbstractWheelTextAdapter;->setItemResource(I)V

    .line 242
    .line 243
    .line 244
    sget v6, Lcom/lljjcoder/style/citypickerview/R$id;->default_item_city_name_tv:I

    .line 245
    .line 246
    invoke-virtual {v5, v6}, Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/AbstractWheelTextAdapter;->setItemTextResource(I)V

    .line 247
    .line 248
    .line 249
    :goto_2
    iget-object v6, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewDistrict:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 250
    .line 251
    invoke-virtual {v6, v5}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setViewAdapter(Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/WheelViewAdapter;)V

    .line 252
    .line 253
    .line 254
    iget-object v5, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->parseHelper:Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 255
    .line 256
    invoke-virtual {v5}, Lcom/lljjcoder/citywheel/CityParseHelper;->getDisMap()Ljava/util/Map;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    if-nez v5, :cond_6

    .line 261
    .line 262
    goto :goto_4

    .line 263
    :cond_6
    if-eq v3, v2, :cond_7

    .line 264
    .line 265
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewDistrict:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 266
    .line 267
    invoke-virtual {v1, v2}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setCurrentItem(I)V

    .line 268
    .line 269
    .line 270
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->parseHelper:Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 271
    .line 272
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CityParseHelper;->getDisMap()Ljava/util/Map;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    new-instance v2, Ljava/lang/StringBuilder;

    .line 277
    .line 278
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 279
    .line 280
    .line 281
    iget-object v3, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->parseHelper:Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 282
    .line 283
    invoke-virtual {v3}, Lcom/lljjcoder/citywheel/CityParseHelper;->getProvinceBean()Lcom/lljjcoder/bean/ProvinceBean;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    invoke-virtual {v3}, Lcom/lljjcoder/bean/ProvinceBean;->getName()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v3

    .line 291
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v0}, Lcom/lljjcoder/bean/CityBean;->getName()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 302
    .line 303
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CityConfig;->getDefaultDistrict()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    check-cast v0, Lcom/lljjcoder/bean/DistrictBean;

    .line 319
    .line 320
    goto :goto_3

    .line 321
    :cond_7
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewDistrict:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 322
    .line 323
    invoke-virtual {v0, v4}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setCurrentItem(I)V

    .line 324
    .line 325
    .line 326
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    if-lez v0, :cond_8

    .line 331
    .line 332
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    check-cast v0, Lcom/lljjcoder/bean/DistrictBean;

    .line 337
    .line 338
    goto :goto_3

    .line 339
    :cond_8
    const/4 v0, 0x0

    .line 340
    :goto_3
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->parseHelper:Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 341
    .line 342
    invoke-virtual {v1, v0}, Lcom/lljjcoder/citywheel/CityParseHelper;->setDistrictBean(Lcom/lljjcoder/bean/DistrictBean;)V

    .line 343
    .line 344
    .line 345
    :cond_9
    :goto_4
    return-void
.end method

.method private updateCities()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->parseHelper:Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_4

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewProvince:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->getCurrentItem()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->proArra:Ljava/util/List;

    .line 18
    .line 19
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lcom/lljjcoder/bean/ProvinceBean;

    .line 24
    .line 25
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->parseHelper:Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Lcom/lljjcoder/citywheel/CityParseHelper;->setProvinceBean(Lcom/lljjcoder/bean/ProvinceBean;)V

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->parseHelper:Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 31
    .line 32
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CityParseHelper;->getPro_CityMap()Ljava/util/Map;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-nez v1, :cond_1

    .line 37
    .line 38
    goto/16 :goto_4

    .line 39
    .line 40
    :cond_1
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->parseHelper:Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 41
    .line 42
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CityParseHelper;->getPro_CityMap()Ljava/util/Map;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v0}, Lcom/lljjcoder/bean/ProvinceBean;->getName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Ljava/util/List;

    .line 55
    .line 56
    if-nez v0, :cond_2

    .line 57
    .line 58
    goto/16 :goto_4

    .line 59
    .line 60
    :cond_2
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 61
    .line 62
    invoke-virtual {v1}, Lcom/lljjcoder/citywheel/CityConfig;->getDefaultCityName()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    const/4 v2, 0x0

    .line 71
    const/4 v3, -0x1

    .line 72
    if-nez v1, :cond_4

    .line 73
    .line 74
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-lez v1, :cond_4

    .line 79
    .line 80
    move v1, v2

    .line 81
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    if-ge v1, v4, :cond_4

    .line 86
    .line 87
    iget-object v4, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 88
    .line 89
    invoke-virtual {v4}, Lcom/lljjcoder/citywheel/CityConfig;->getDefaultCityName()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    check-cast v5, Lcom/lljjcoder/bean/CityBean;

    .line 98
    .line 99
    invoke-virtual {v5}, Lcom/lljjcoder/bean/CityBean;->getName()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-eqz v4, :cond_3

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_4
    move v1, v3

    .line 114
    :goto_1
    new-instance v4, Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/ArrayWheelAdapter;

    .line 115
    .line 116
    iget-object v5, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->context:Landroid/content/Context;

    .line 117
    .line 118
    invoke-direct {v4, v5, v0}, Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/ArrayWheelAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 119
    .line 120
    .line 121
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 122
    .line 123
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CityConfig;->getCustomItemLayout()Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    sget-object v5, Lcom/lljjcoder/citywheel/CityConfig;->NONE:Ljava/lang/Integer;

    .line 128
    .line 129
    if-eq v0, v5, :cond_5

    .line 130
    .line 131
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 132
    .line 133
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CityConfig;->getCustomItemTextViewId()Ljava/lang/Integer;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    if-eq v0, v5, :cond_5

    .line 138
    .line 139
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 140
    .line 141
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CityConfig;->getCustomItemLayout()Ljava/lang/Integer;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    invoke-virtual {v4, v0}, Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/AbstractWheelTextAdapter;->setItemResource(I)V

    .line 150
    .line 151
    .line 152
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 153
    .line 154
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CityConfig;->getCustomItemTextViewId()Ljava/lang/Integer;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    invoke-virtual {v4, v0}, Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/AbstractWheelTextAdapter;->setItemTextResource(I)V

    .line 163
    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_5
    sget v0, Lcom/lljjcoder/style/citypickerview/R$layout;->default_item_city:I

    .line 167
    .line 168
    invoke-virtual {v4, v0}, Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/AbstractWheelTextAdapter;->setItemResource(I)V

    .line 169
    .line 170
    .line 171
    sget v0, Lcom/lljjcoder/style/citypickerview/R$id;->default_item_city_name_tv:I

    .line 172
    .line 173
    invoke-virtual {v4, v0}, Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/AbstractWheelTextAdapter;->setItemTextResource(I)V

    .line 174
    .line 175
    .line 176
    :goto_2
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewCity:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 177
    .line 178
    invoke-virtual {v0, v4}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setViewAdapter(Lcom/lljjcoder/style/citypickerview/widget/wheel/adapters/WheelViewAdapter;)V

    .line 179
    .line 180
    .line 181
    if-eq v3, v1, :cond_6

    .line 182
    .line 183
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewCity:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 184
    .line 185
    invoke-virtual {v0, v1}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setCurrentItem(I)V

    .line 186
    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_6
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewCity:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 190
    .line 191
    invoke-virtual {v0, v2}, Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;->setCurrentItem(I)V

    .line 192
    .line 193
    .line 194
    :goto_3
    invoke-direct {p0}, Lcom/lljjcoder/style/citypickerview/CityPickerView;->updateAreas()V

    .line 195
    .line 196
    .line 197
    :cond_7
    :goto_4
    return-void
.end method


# virtual methods
.method public hide()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/lljjcoder/style/citypickerview/CityPickerView;->isShow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->popwindow:Landroid/widget/PopupWindow;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public init(Landroid/content/Context;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->context:Landroid/content/Context;

    .line 2
    .line 3
    new-instance v0, Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 4
    .line 5
    invoke-direct {v0}, Lcom/lljjcoder/citywheel/CityParseHelper;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->parseHelper:Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CityParseHelper;->getProvinceBeanArrayList()Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->parseHelper:Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lcom/lljjcoder/citywheel/CityParseHelper;->initData(Landroid/content/Context;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public isShow()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->popwindow:Landroid/widget/PopupWindow;

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
    .locals 1

    .line 1
    iget-object p2, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewProvince:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 2
    .line 3
    if-ne p1, p2, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/lljjcoder/style/citypickerview/CityPickerView;->updateCities()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object p2, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewCity:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 10
    .line 11
    if-ne p1, p2, :cond_1

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/lljjcoder/style/citypickerview/CityPickerView;->updateAreas()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    iget-object p2, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mViewDistrict:Lcom/lljjcoder/style/citypickerview/widget/wheel/WheelView;

    .line 18
    .line 19
    if-ne p1, p2, :cond_2

    .line 20
    .line 21
    iget-object p1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->parseHelper:Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 22
    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/lljjcoder/citywheel/CityParseHelper;->getCity_DisMap()Ljava/util/Map;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    iget-object p1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->parseHelper:Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/lljjcoder/citywheel/CityParseHelper;->getCity_DisMap()Ljava/util/Map;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance p2, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->parseHelper:Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CityParseHelper;->getProvinceBean()Lcom/lljjcoder/bean/ProvinceBean;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Lcom/lljjcoder/bean/ProvinceBean;->getName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->parseHelper:Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 56
    .line 57
    invoke-virtual {v0}, Lcom/lljjcoder/citywheel/CityParseHelper;->getCityBean()Lcom/lljjcoder/bean/CityBean;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, Lcom/lljjcoder/bean/CityBean;->getName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    check-cast p1, Ljava/util/List;

    .line 77
    .line 78
    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    check-cast p1, Lcom/lljjcoder/bean/DistrictBean;

    .line 83
    .line 84
    iget-object p2, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->parseHelper:Lcom/lljjcoder/citywheel/CityParseHelper;

    .line 85
    .line 86
    invoke-virtual {p2, p1}, Lcom/lljjcoder/citywheel/CityParseHelper;->setDistrictBean(Lcom/lljjcoder/bean/DistrictBean;)V

    .line 87
    .line 88
    .line 89
    :cond_2
    return-void
.end method

.method public setConfig(Lcom/lljjcoder/citywheel/CityConfig;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->config:Lcom/lljjcoder/citywheel/CityConfig;

    .line 2
    .line 3
    return-void
.end method

.method public setOnCityItemClickListener(Lcom/lljjcoder/Interface/OnCityItemClickListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->mBaseListener:Lcom/lljjcoder/Interface/OnCityItemClickListener;

    .line 2
    .line 3
    return-void
.end method

.method public showCityPicker()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/lljjcoder/style/citypickerview/CityPickerView;->initCityPickerPopwindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/lljjcoder/style/citypickerview/CityPickerView;->isShow()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->popwindow:Landroid/widget/PopupWindow;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/lljjcoder/style/citypickerview/CityPickerView;->popview:Landroid/view/View;

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
