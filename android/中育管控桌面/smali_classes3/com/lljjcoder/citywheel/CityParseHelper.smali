.class public Lcom/lljjcoder/citywheel/CityParseHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mCityBean:Lcom/lljjcoder/bean/CityBean;

.field private mCityBeanArrayList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/util/ArrayList<",
            "Lcom/lljjcoder/bean/CityBean;",
            ">;>;"
        }
    .end annotation
.end field

.field private mCity_DisMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/lljjcoder/bean/DistrictBean;",
            ">;>;"
        }
    .end annotation
.end field

.field private mDisMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/lljjcoder/bean/DistrictBean;",
            ">;"
        }
    .end annotation
.end field

.field private mDistrictBean:Lcom/lljjcoder/bean/DistrictBean;

.field private mDistrictBeanArrayList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/util/ArrayList<",
            "Ljava/util/ArrayList<",
            "Lcom/lljjcoder/bean/DistrictBean;",
            ">;>;>;"
        }
    .end annotation
.end field

.field private mPro_CityMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/lljjcoder/bean/CityBean;",
            ">;>;"
        }
    .end annotation
.end field

.field private mProvinceBean:Lcom/lljjcoder/bean/ProvinceBean;

.field private mProvinceBeanArrayList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/lljjcoder/bean/ProvinceBean;",
            ">;"
        }
    .end annotation
.end field

.field private mProvinceBeenArray:Ljava/util/List;
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
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mProvinceBeanArrayList:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mPro_CityMap:Ljava/util/Map;

    .line 17
    .line 18
    new-instance v0, Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mCity_DisMap:Ljava/util/Map;

    .line 24
    .line 25
    new-instance v0, Ljava/util/HashMap;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mDisMap:Ljava/util/Map;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public getCityBean()Lcom/lljjcoder/bean/CityBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mCityBean:Lcom/lljjcoder/bean/CityBean;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCityBeanArrayList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/util/ArrayList<",
            "Lcom/lljjcoder/bean/CityBean;",
            ">;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mCityBeanArrayList:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCity_DisMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/lljjcoder/bean/DistrictBean;",
            ">;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mCity_DisMap:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDisMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/lljjcoder/bean/DistrictBean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mDisMap:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDistrictBean()Lcom/lljjcoder/bean/DistrictBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mDistrictBean:Lcom/lljjcoder/bean/DistrictBean;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDistrictBeanArrayList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/util/ArrayList<",
            "Ljava/util/ArrayList<",
            "Lcom/lljjcoder/bean/DistrictBean;",
            ">;>;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mDistrictBeanArrayList:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPro_CityMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/lljjcoder/bean/CityBean;",
            ">;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mPro_CityMap:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public getProvinceBean()Lcom/lljjcoder/bean/ProvinceBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mProvinceBean:Lcom/lljjcoder/bean/ProvinceBean;

    .line 2
    .line 3
    return-object v0
.end method

.method public getProvinceBeanArrayList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/lljjcoder/bean/ProvinceBean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mProvinceBeanArrayList:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public getProvinceBeenArray()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/lljjcoder/bean/ProvinceBean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mProvinceBeenArray:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public initData(Landroid/content/Context;)V
    .locals 10

    .line 1
    const-string v0, "china_city_data.json"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lcom/lljjcoder/utils/utils;->getJson(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance v0, Lcom/lljjcoder/citywheel/CityParseHelper$1;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lcom/lljjcoder/citywheel/CityParseHelper$1;-><init>(Lcom/lljjcoder/citywheel/CityParseHelper;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, Lcom/google/gson/Gson;

    .line 17
    .line 18
    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p1, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Ljava/util/ArrayList;

    .line 26
    .line 27
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mProvinceBeanArrayList:Ljava/util/ArrayList;

    .line 28
    .line 29
    if-eqz p1, :cond_6

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_0

    .line 36
    .line 37
    goto/16 :goto_5

    .line 38
    .line 39
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 40
    .line 41
    iget-object v0, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mProvinceBeanArrayList:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mCityBeanArrayList:Ljava/util/ArrayList;

    .line 51
    .line 52
    new-instance p1, Ljava/util/ArrayList;

    .line 53
    .line 54
    iget-object v0, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mProvinceBeanArrayList:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mDistrictBeanArrayList:Ljava/util/ArrayList;

    .line 64
    .line 65
    iget-object p1, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mProvinceBeanArrayList:Ljava/util/ArrayList;

    .line 66
    .line 67
    const/4 v0, 0x0

    .line 68
    if-eqz p1, :cond_1

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-nez p1, :cond_1

    .line 75
    .line 76
    iget-object p1, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mProvinceBeanArrayList:Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    check-cast p1, Lcom/lljjcoder/bean/ProvinceBean;

    .line 83
    .line 84
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mProvinceBean:Lcom/lljjcoder/bean/ProvinceBean;

    .line 85
    .line 86
    invoke-virtual {p1}, Lcom/lljjcoder/bean/ProvinceBean;->getCityList()Ljava/util/ArrayList;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-eqz p1, :cond_1

    .line 91
    .line 92
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-nez v1, :cond_1

    .line 97
    .line 98
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-lez v1, :cond_1

    .line 103
    .line 104
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    check-cast p1, Lcom/lljjcoder/bean/CityBean;

    .line 109
    .line 110
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mCityBean:Lcom/lljjcoder/bean/CityBean;

    .line 111
    .line 112
    invoke-virtual {p1}, Lcom/lljjcoder/bean/CityBean;->getCityList()Ljava/util/ArrayList;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    if-eqz p1, :cond_1

    .line 117
    .line 118
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-nez v1, :cond_1

    .line 123
    .line 124
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-lez v1, :cond_1

    .line 129
    .line 130
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    check-cast p1, Lcom/lljjcoder/bean/DistrictBean;

    .line 135
    .line 136
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mDistrictBean:Lcom/lljjcoder/bean/DistrictBean;

    .line 137
    .line 138
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    .line 139
    .line 140
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 141
    .line 142
    .line 143
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mProvinceBeenArray:Ljava/util/List;

    .line 144
    .line 145
    move p1, v0

    .line 146
    :goto_0
    iget-object v1, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mProvinceBeanArrayList:Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-ge p1, v1, :cond_6

    .line 153
    .line 154
    iget-object v1, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mProvinceBeanArrayList:Ljava/util/ArrayList;

    .line 155
    .line 156
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    check-cast v1, Lcom/lljjcoder/bean/ProvinceBean;

    .line 161
    .line 162
    invoke-virtual {v1}, Lcom/lljjcoder/bean/ProvinceBean;->getCityList()Ljava/util/ArrayList;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    move v3, v0

    .line 167
    :goto_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    if-ge v3, v4, :cond_4

    .line 172
    .line 173
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    check-cast v4, Lcom/lljjcoder/bean/CityBean;

    .line 178
    .line 179
    invoke-virtual {v4}, Lcom/lljjcoder/bean/CityBean;->getCityList()Ljava/util/ArrayList;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    if-nez v4, :cond_2

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_2
    move v5, v0

    .line 187
    :goto_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 188
    .line 189
    .line 190
    move-result v6

    .line 191
    if-ge v5, v6, :cond_3

    .line 192
    .line 193
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v6

    .line 197
    check-cast v6, Lcom/lljjcoder/bean/DistrictBean;

    .line 198
    .line 199
    iget-object v7, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mDisMap:Ljava/util/Map;

    .line 200
    .line 201
    new-instance v8, Ljava/lang/StringBuilder;

    .line 202
    .line 203
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v1}, Lcom/lljjcoder/bean/ProvinceBean;->getName()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v9

    .line 210
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v9

    .line 217
    check-cast v9, Lcom/lljjcoder/bean/CityBean;

    .line 218
    .line 219
    invoke-virtual {v9}, Lcom/lljjcoder/bean/CityBean;->getName()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v9

    .line 223
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v9

    .line 230
    check-cast v9, Lcom/lljjcoder/bean/DistrictBean;

    .line 231
    .line 232
    invoke-virtual {v9}, Lcom/lljjcoder/bean/DistrictBean;->getName()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v9

    .line 236
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v8

    .line 243
    invoke-interface {v7, v8, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    add-int/lit8 v5, v5, 0x1

    .line 247
    .line 248
    goto :goto_2

    .line 249
    :cond_3
    iget-object v5, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mCity_DisMap:Ljava/util/Map;

    .line 250
    .line 251
    new-instance v6, Ljava/lang/StringBuilder;

    .line 252
    .line 253
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v1}, Lcom/lljjcoder/bean/ProvinceBean;->getName()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v7

    .line 260
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v7

    .line 267
    check-cast v7, Lcom/lljjcoder/bean/CityBean;

    .line 268
    .line 269
    invoke-virtual {v7}, Lcom/lljjcoder/bean/CityBean;->getName()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v7

    .line 273
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v6

    .line 280
    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    add-int/lit8 v3, v3, 0x1

    .line 284
    .line 285
    goto :goto_1

    .line 286
    :cond_4
    :goto_3
    iget-object v3, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mPro_CityMap:Ljava/util/Map;

    .line 287
    .line 288
    invoke-virtual {v1}, Lcom/lljjcoder/bean/ProvinceBean;->getName()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v4

    .line 292
    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    iget-object v3, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mCityBeanArrayList:Ljava/util/ArrayList;

    .line 296
    .line 297
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    new-instance v3, Ljava/util/ArrayList;

    .line 301
    .line 302
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 303
    .line 304
    .line 305
    move-result v4

    .line 306
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 307
    .line 308
    .line 309
    move v4, v0

    .line 310
    :goto_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 311
    .line 312
    .line 313
    move-result v5

    .line 314
    if-ge v4, v5, :cond_5

    .line 315
    .line 316
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v5

    .line 320
    check-cast v5, Lcom/lljjcoder/bean/CityBean;

    .line 321
    .line 322
    invoke-virtual {v5}, Lcom/lljjcoder/bean/CityBean;->getCityList()Ljava/util/ArrayList;

    .line 323
    .line 324
    .line 325
    move-result-object v5

    .line 326
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    add-int/lit8 v4, v4, 0x1

    .line 330
    .line 331
    goto :goto_4

    .line 332
    :cond_5
    iget-object v2, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mDistrictBeanArrayList:Ljava/util/ArrayList;

    .line 333
    .line 334
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    iget-object v2, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mProvinceBeenArray:Ljava/util/List;

    .line 338
    .line 339
    invoke-interface {v2, p1, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    add-int/lit8 p1, p1, 0x1

    .line 343
    .line 344
    goto/16 :goto_0

    .line 345
    .line 346
    :cond_6
    :goto_5
    return-void
.end method

.method public setCityBean(Lcom/lljjcoder/bean/CityBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mCityBean:Lcom/lljjcoder/bean/CityBean;

    .line 2
    .line 3
    return-void
.end method

.method public setCityBeanArrayList(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/util/ArrayList<",
            "Lcom/lljjcoder/bean/CityBean;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mCityBeanArrayList:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-void
.end method

.method public setCity_DisMap(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/lljjcoder/bean/DistrictBean;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mCity_DisMap:Ljava/util/Map;

    .line 2
    .line 3
    return-void
.end method

.method public setDisMap(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/lljjcoder/bean/DistrictBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mDisMap:Ljava/util/Map;

    .line 2
    .line 3
    return-void
.end method

.method public setDistrictBean(Lcom/lljjcoder/bean/DistrictBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mDistrictBean:Lcom/lljjcoder/bean/DistrictBean;

    .line 2
    .line 3
    return-void
.end method

.method public setDistrictBeanArrayList(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/util/ArrayList<",
            "Ljava/util/ArrayList<",
            "Lcom/lljjcoder/bean/DistrictBean;",
            ">;>;>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mDistrictBeanArrayList:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-void
.end method

.method public setPro_CityMap(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/lljjcoder/bean/CityBean;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mPro_CityMap:Ljava/util/Map;

    .line 2
    .line 3
    return-void
.end method

.method public setProvinceBean(Lcom/lljjcoder/bean/ProvinceBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mProvinceBean:Lcom/lljjcoder/bean/ProvinceBean;

    .line 2
    .line 3
    return-void
.end method

.method public setProvinceBeanArrayList(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/lljjcoder/bean/ProvinceBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mProvinceBeanArrayList:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-void
.end method

.method public setProvinceBeenArray(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/lljjcoder/bean/ProvinceBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/citywheel/CityParseHelper;->mProvinceBeenArray:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method
