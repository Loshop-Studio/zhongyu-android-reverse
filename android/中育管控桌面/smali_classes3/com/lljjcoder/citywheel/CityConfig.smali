.class public Lcom/lljjcoder/citywheel/CityConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lljjcoder/citywheel/CityConfig$Builder;,
        Lcom/lljjcoder/citywheel/CityConfig$WheelType;
    }
.end annotation


# static fields
.field public static final NONE:Ljava/lang/Integer;


# instance fields
.field private cancelText:Ljava/lang/String;

.field private cancelTextColorStr:Ljava/lang/String;

.field private cancelTextSize:I

.field private confirmText:Ljava/lang/String;

.field private confirmTextColorStr:Ljava/lang/String;

.field private confirmTextSize:I

.field private customItemLayout:Ljava/lang/Integer;

.field private customItemTextViewId:Ljava/lang/Integer;

.field private defaultCityName:Ljava/lang/String;

.field private defaultDistrict:Ljava/lang/String;

.field private defaultProvinceName:Ljava/lang/String;

.field private drawShadows:Z

.field private isCityCyclic:Z

.field private isDistrictCyclic:Z

.field private isProvinceCyclic:Z

.field private isShowBackground:Z

.field private lineColor:Ljava/lang/String;

.field private lineHeigh:I

.field private mTitle:Ljava/lang/String;

.field public mWheelType:Lcom/lljjcoder/citywheel/CityConfig$WheelType;

.field private showGAT:Z

.field private titleBackgroundColorStr:Ljava/lang/String;

.field private titleTextColorStr:Ljava/lang/String;

.field private titleTextSize:I

.field private visibleItems:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, -0x457

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/lljjcoder/citywheel/CityConfig;->NONE:Ljava/lang/Integer;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/lljjcoder/citywheel/CityConfig$Builder;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x5

    .line 5
    iput v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->visibleItems:I

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->isProvinceCyclic:Z

    .line 9
    .line 10
    iput-boolean v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->isCityCyclic:Z

    .line 11
    .line 12
    iput-boolean v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->isDistrictCyclic:Z

    .line 13
    .line 14
    const-string v1, "#000000"

    .line 15
    .line 16
    iput-object v1, p0, Lcom/lljjcoder/citywheel/CityConfig;->cancelTextColorStr:Ljava/lang/String;

    .line 17
    .line 18
    const-string v1, "\u53d6\u6d88"

    .line 19
    .line 20
    iput-object v1, p0, Lcom/lljjcoder/citywheel/CityConfig;->cancelText:Ljava/lang/String;

    .line 21
    .line 22
    const/16 v1, 0x10

    .line 23
    .line 24
    iput v1, p0, Lcom/lljjcoder/citywheel/CityConfig;->cancelTextSize:I

    .line 25
    .line 26
    const-string v2, "#0000FF"

    .line 27
    .line 28
    iput-object v2, p0, Lcom/lljjcoder/citywheel/CityConfig;->confirmTextColorStr:Ljava/lang/String;

    .line 29
    .line 30
    const-string v2, "\u786e\u5b9a"

    .line 31
    .line 32
    iput-object v2, p0, Lcom/lljjcoder/citywheel/CityConfig;->confirmText:Ljava/lang/String;

    .line 33
    .line 34
    iput v1, p0, Lcom/lljjcoder/citywheel/CityConfig;->confirmTextSize:I

    .line 35
    .line 36
    const-string v1, "\u9009\u62e9\u5730\u533a"

    .line 37
    .line 38
    iput-object v1, p0, Lcom/lljjcoder/citywheel/CityConfig;->mTitle:Ljava/lang/String;

    .line 39
    .line 40
    const-string v1, "#E9E9E9"

    .line 41
    .line 42
    iput-object v1, p0, Lcom/lljjcoder/citywheel/CityConfig;->titleBackgroundColorStr:Ljava/lang/String;

    .line 43
    .line 44
    const-string v1, "#585858"

    .line 45
    .line 46
    iput-object v1, p0, Lcom/lljjcoder/citywheel/CityConfig;->titleTextColorStr:Ljava/lang/String;

    .line 47
    .line 48
    const/16 v1, 0x12

    .line 49
    .line 50
    iput v1, p0, Lcom/lljjcoder/citywheel/CityConfig;->titleTextSize:I

    .line 51
    .line 52
    const-string v1, "\u6d59\u6c5f"

    .line 53
    .line 54
    iput-object v1, p0, Lcom/lljjcoder/citywheel/CityConfig;->defaultProvinceName:Ljava/lang/String;

    .line 55
    .line 56
    const-string v1, "\u676d\u5dde"

    .line 57
    .line 58
    iput-object v1, p0, Lcom/lljjcoder/citywheel/CityConfig;->defaultCityName:Ljava/lang/String;

    .line 59
    .line 60
    const-string v1, "\u6ee8\u6c5f\u533a"

    .line 61
    .line 62
    iput-object v1, p0, Lcom/lljjcoder/citywheel/CityConfig;->defaultDistrict:Ljava/lang/String;

    .line 63
    .line 64
    iput-boolean v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->drawShadows:Z

    .line 65
    .line 66
    const/4 v1, 0x0

    .line 67
    iput-boolean v1, p0, Lcom/lljjcoder/citywheel/CityConfig;->showGAT:Z

    .line 68
    .line 69
    const-string v1, "#C7C7C7"

    .line 70
    .line 71
    iput-object v1, p0, Lcom/lljjcoder/citywheel/CityConfig;->lineColor:Ljava/lang/String;

    .line 72
    .line 73
    const/4 v1, 0x3

    .line 74
    iput v1, p0, Lcom/lljjcoder/citywheel/CityConfig;->lineHeigh:I

    .line 75
    .line 76
    iput-boolean v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->isShowBackground:Z

    .line 77
    .line 78
    sget-object v0, Lcom/lljjcoder/citywheel/CityConfig$WheelType;->PRO_CITY_DIS:Lcom/lljjcoder/citywheel/CityConfig$WheelType;

    .line 79
    .line 80
    iput-object v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->mWheelType:Lcom/lljjcoder/citywheel/CityConfig$WheelType;

    .line 81
    .line 82
    invoke-static {p1}, Lcom/lljjcoder/citywheel/CityConfig$Builder;->access$000(Lcom/lljjcoder/citywheel/CityConfig$Builder;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    iput-object v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->titleBackgroundColorStr:Ljava/lang/String;

    .line 87
    .line 88
    invoke-static {p1}, Lcom/lljjcoder/citywheel/CityConfig$Builder;->access$100(Lcom/lljjcoder/citywheel/CityConfig$Builder;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iput-object v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->mTitle:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {p1}, Lcom/lljjcoder/citywheel/CityConfig$Builder;->access$200(Lcom/lljjcoder/citywheel/CityConfig$Builder;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    iput-object v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->titleTextColorStr:Ljava/lang/String;

    .line 99
    .line 100
    invoke-static {p1}, Lcom/lljjcoder/citywheel/CityConfig$Builder;->access$300(Lcom/lljjcoder/citywheel/CityConfig$Builder;)I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    iput v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->titleTextSize:I

    .line 105
    .line 106
    invoke-static {p1}, Lcom/lljjcoder/citywheel/CityConfig$Builder;->access$400(Lcom/lljjcoder/citywheel/CityConfig$Builder;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    iput-object v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->cancelTextColorStr:Ljava/lang/String;

    .line 111
    .line 112
    invoke-static {p1}, Lcom/lljjcoder/citywheel/CityConfig$Builder;->access$500(Lcom/lljjcoder/citywheel/CityConfig$Builder;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    iput-object v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->cancelText:Ljava/lang/String;

    .line 117
    .line 118
    invoke-static {p1}, Lcom/lljjcoder/citywheel/CityConfig$Builder;->access$600(Lcom/lljjcoder/citywheel/CityConfig$Builder;)I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    iput v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->cancelTextSize:I

    .line 123
    .line 124
    invoke-static {p1}, Lcom/lljjcoder/citywheel/CityConfig$Builder;->access$700(Lcom/lljjcoder/citywheel/CityConfig$Builder;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    iput-object v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->confirmTextColorStr:Ljava/lang/String;

    .line 129
    .line 130
    invoke-static {p1}, Lcom/lljjcoder/citywheel/CityConfig$Builder;->access$800(Lcom/lljjcoder/citywheel/CityConfig$Builder;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    iput-object v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->confirmText:Ljava/lang/String;

    .line 135
    .line 136
    invoke-static {p1}, Lcom/lljjcoder/citywheel/CityConfig$Builder;->access$900(Lcom/lljjcoder/citywheel/CityConfig$Builder;)I

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    iput v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->confirmTextSize:I

    .line 141
    .line 142
    invoke-static {p1}, Lcom/lljjcoder/citywheel/CityConfig$Builder;->access$1000(Lcom/lljjcoder/citywheel/CityConfig$Builder;)I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    iput v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->visibleItems:I

    .line 147
    .line 148
    invoke-static {p1}, Lcom/lljjcoder/citywheel/CityConfig$Builder;->access$1100(Lcom/lljjcoder/citywheel/CityConfig$Builder;)Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    iput-boolean v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->isProvinceCyclic:Z

    .line 153
    .line 154
    invoke-static {p1}, Lcom/lljjcoder/citywheel/CityConfig$Builder;->access$1200(Lcom/lljjcoder/citywheel/CityConfig$Builder;)Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    iput-boolean v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->isDistrictCyclic:Z

    .line 159
    .line 160
    invoke-static {p1}, Lcom/lljjcoder/citywheel/CityConfig$Builder;->access$1300(Lcom/lljjcoder/citywheel/CityConfig$Builder;)Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    iput-boolean v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->isCityCyclic:Z

    .line 165
    .line 166
    invoke-static {p1}, Lcom/lljjcoder/citywheel/CityConfig$Builder;->access$1400(Lcom/lljjcoder/citywheel/CityConfig$Builder;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    iput-object v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->defaultDistrict:Ljava/lang/String;

    .line 171
    .line 172
    invoke-static {p1}, Lcom/lljjcoder/citywheel/CityConfig$Builder;->access$1500(Lcom/lljjcoder/citywheel/CityConfig$Builder;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    iput-object v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->defaultCityName:Ljava/lang/String;

    .line 177
    .line 178
    invoke-static {p1}, Lcom/lljjcoder/citywheel/CityConfig$Builder;->access$1600(Lcom/lljjcoder/citywheel/CityConfig$Builder;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    iput-object v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->defaultProvinceName:Ljava/lang/String;

    .line 183
    .line 184
    invoke-static {p1}, Lcom/lljjcoder/citywheel/CityConfig$Builder;->access$1700(Lcom/lljjcoder/citywheel/CityConfig$Builder;)Lcom/lljjcoder/citywheel/CityConfig$WheelType;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    iput-object v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->mWheelType:Lcom/lljjcoder/citywheel/CityConfig$WheelType;

    .line 189
    .line 190
    invoke-static {p1}, Lcom/lljjcoder/citywheel/CityConfig$Builder;->access$1800(Lcom/lljjcoder/citywheel/CityConfig$Builder;)Z

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    iput-boolean v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->isShowBackground:Z

    .line 195
    .line 196
    invoke-static {p1}, Lcom/lljjcoder/citywheel/CityConfig$Builder;->access$1900(Lcom/lljjcoder/citywheel/CityConfig$Builder;)Ljava/lang/Integer;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    iput-object v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->customItemLayout:Ljava/lang/Integer;

    .line 201
    .line 202
    invoke-static {p1}, Lcom/lljjcoder/citywheel/CityConfig$Builder;->access$2000(Lcom/lljjcoder/citywheel/CityConfig$Builder;)Ljava/lang/Integer;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    iput-object v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->customItemTextViewId:Ljava/lang/Integer;

    .line 207
    .line 208
    invoke-static {p1}, Lcom/lljjcoder/citywheel/CityConfig$Builder;->access$2100(Lcom/lljjcoder/citywheel/CityConfig$Builder;)Z

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    iput-boolean v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->drawShadows:Z

    .line 213
    .line 214
    invoke-static {p1}, Lcom/lljjcoder/citywheel/CityConfig$Builder;->access$2200(Lcom/lljjcoder/citywheel/CityConfig$Builder;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    iput-object v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->lineColor:Ljava/lang/String;

    .line 219
    .line 220
    invoke-static {p1}, Lcom/lljjcoder/citywheel/CityConfig$Builder;->access$2300(Lcom/lljjcoder/citywheel/CityConfig$Builder;)I

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    iput v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->lineHeigh:I

    .line 225
    .line 226
    invoke-static {p1}, Lcom/lljjcoder/citywheel/CityConfig$Builder;->access$2400(Lcom/lljjcoder/citywheel/CityConfig$Builder;)Z

    .line 227
    .line 228
    .line 229
    move-result p1

    .line 230
    iput-boolean p1, p0, Lcom/lljjcoder/citywheel/CityConfig;->showGAT:Z

    .line 231
    .line 232
    return-void
.end method


# virtual methods
.method public getCancelText()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->cancelText:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    :cond_0
    return-object v0
.end method

.method public getCancelTextColorStr()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->cancelTextColorStr:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    :cond_0
    return-object v0
.end method

.method public getCancelTextSize()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->cancelTextSize:I

    .line 2
    .line 3
    return v0
.end method

.method public getConfirmText()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->confirmText:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    :cond_0
    return-object v0
.end method

.method public getConfirmTextColorStr()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->confirmTextColorStr:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    :cond_0
    return-object v0
.end method

.method public getConfirmTextSize()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->confirmTextSize:I

    .line 2
    .line 3
    return v0
.end method

.method public getCustomItemLayout()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->customItemLayout:Ljava/lang/Integer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/lljjcoder/citywheel/CityConfig;->NONE:Ljava/lang/Integer;

    .line 6
    .line 7
    :cond_0
    return-object v0
.end method

.method public getCustomItemTextViewId()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->customItemTextViewId:Ljava/lang/Integer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/lljjcoder/citywheel/CityConfig;->NONE:Ljava/lang/Integer;

    .line 6
    .line 7
    :cond_0
    return-object v0
.end method

.method public getDefaultCityName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->defaultCityName:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    :cond_0
    return-object v0
.end method

.method public getDefaultDistrict()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->defaultDistrict:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    :cond_0
    return-object v0
.end method

.method public getDefaultProvinceName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->defaultProvinceName:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    :cond_0
    return-object v0
.end method

.method public getLineColor()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->lineColor:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    :cond_0
    return-object v0
.end method

.method public getLineHeigh()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->lineHeigh:I

    .line 2
    .line 3
    return v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->mTitle:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    :cond_0
    return-object v0
.end method

.method public getTitleBackgroundColorStr()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->titleBackgroundColorStr:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    :cond_0
    return-object v0
.end method

.method public getTitleTextColorStr()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->titleTextColorStr:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    :cond_0
    return-object v0
.end method

.method public getTitleTextSize()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->titleTextSize:I

    .line 2
    .line 3
    return v0
.end method

.method public getVisibleItems()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->visibleItems:I

    .line 2
    .line 3
    return v0
.end method

.method public getWheelType()Lcom/lljjcoder/citywheel/CityConfig$WheelType;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->mWheelType:Lcom/lljjcoder/citywheel/CityConfig$WheelType;

    .line 2
    .line 3
    return-object v0
.end method

.method public isCityCyclic()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->isCityCyclic:Z

    .line 2
    .line 3
    return v0
.end method

.method public isDistrictCyclic()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->isDistrictCyclic:Z

    .line 2
    .line 3
    return v0
.end method

.method public isDrawShadows()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->drawShadows:Z

    .line 2
    .line 3
    return v0
.end method

.method public isProvinceCyclic()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->isProvinceCyclic:Z

    .line 2
    .line 3
    return v0
.end method

.method public isShowBackground()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->isShowBackground:Z

    .line 2
    .line 3
    return v0
.end method

.method public isShowGAT()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/lljjcoder/citywheel/CityConfig;->showGAT:Z

    .line 2
    .line 3
    return v0
.end method

.method public setCancelText(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CityConfig;->cancelText:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setCancelTextColorStr(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CityConfig;->cancelTextColorStr:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setCancelTextSize(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/lljjcoder/citywheel/CityConfig;->cancelTextSize:I

    .line 2
    .line 3
    return-void
.end method

.method public setCityCyclic(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lljjcoder/citywheel/CityConfig;->isCityCyclic:Z

    .line 2
    .line 3
    return-void
.end method

.method public setConfirmText(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CityConfig;->confirmText:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setConfirmTextColorStr(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CityConfig;->confirmTextColorStr:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setConfirmTextSize(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/lljjcoder/citywheel/CityConfig;->confirmTextSize:I

    .line 2
    .line 3
    return-void
.end method

.method public setCustomItemLayout(I)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CityConfig;->customItemLayout:Ljava/lang/Integer;

    .line 6
    .line 7
    return-void
.end method

.method public setCustomItemTextViewId(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CityConfig;->customItemTextViewId:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public setDefaultCityName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CityConfig;->defaultCityName:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setDefaultDistrict(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CityConfig;->defaultDistrict:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setDefaultProvinceName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CityConfig;->defaultProvinceName:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setDistrictCyclic(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lljjcoder/citywheel/CityConfig;->isDistrictCyclic:Z

    .line 2
    .line 3
    return-void
.end method

.method public setDrawShadows(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lljjcoder/citywheel/CityConfig;->drawShadows:Z

    .line 2
    .line 3
    return-void
.end method

.method public setLineColor(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CityConfig;->lineColor:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setLineHeigh(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/lljjcoder/citywheel/CityConfig;->lineHeigh:I

    .line 2
    .line 3
    return-void
.end method

.method public setProvinceCyclic(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lljjcoder/citywheel/CityConfig;->isProvinceCyclic:Z

    .line 2
    .line 3
    return-void
.end method

.method public setShowBackground(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lljjcoder/citywheel/CityConfig;->isShowBackground:Z

    .line 2
    .line 3
    return-void
.end method

.method public setShowGAT(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lljjcoder/citywheel/CityConfig;->showGAT:Z

    .line 2
    .line 3
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CityConfig;->mTitle:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setTitleBackgroundColorStr(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CityConfig;->titleBackgroundColorStr:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setTitleTextColorStr(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CityConfig;->titleTextColorStr:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setTitleTextSize(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/lljjcoder/citywheel/CityConfig;->titleTextSize:I

    .line 2
    .line 3
    return-void
.end method

.method public setVisibleItems(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/lljjcoder/citywheel/CityConfig;->visibleItems:I

    .line 2
    .line 3
    return-void
.end method
