.class public Lcom/tendcloud/tenddata/cp;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Landroid/location/Location; = null

.field private static b:Z = false


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Landroid/location/Location;",
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
    sget-boolean v1, Lcom/tendcloud/tenddata/ab;->Q:Z

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    :try_start_0
    invoke-static {p0}, Lcom/tendcloud/tenddata/cp;->f(Landroid/content/Context;)Landroid/location/Location;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    :catchall_0
    :goto_0
    return-object v0
.end method

.method public static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 7

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/tendcloud/tenddata/cp;->a(Landroid/content/Context;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_5

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Landroid/location/Location;

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D

    .line 29
    .line 30
    .line 31
    move-result-wide v2

    .line 32
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const/16 v2, 0x2c

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Landroid/location/Location;->getLongitude()D

    .line 41
    .line 42
    .line 43
    move-result-wide v3

    .line 44
    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Landroid/location/Location;->hasAltitude()Z

    .line 51
    .line 52
    .line 53
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    const-string v4, ""

    .line 55
    .line 56
    if-eqz v3, :cond_1

    .line 57
    .line 58
    :try_start_1
    invoke-virtual {v1}, Landroid/location/Location;->getAltitude()D

    .line 59
    .line 60
    .line 61
    move-result-wide v5

    .line 62
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    goto :goto_1

    .line 67
    :cond_1
    move-object v3, v4

    .line 68
    :goto_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Landroid/location/Location;->getTime()J

    .line 75
    .line 76
    .line 77
    move-result-wide v5

    .line 78
    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Landroid/location/Location;->hasAccuracy()Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-eqz v3, :cond_2

    .line 89
    .line 90
    invoke-virtual {v1}, Landroid/location/Location;->getAccuracy()F

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    goto :goto_2

    .line 99
    :cond_2
    move-object v3, v4

    .line 100
    :goto_2
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Landroid/location/Location;->hasBearing()Z

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    if-eqz v3, :cond_3

    .line 111
    .line 112
    invoke-virtual {v1}, Landroid/location/Location;->getBearing()F

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    goto :goto_3

    .line 121
    :cond_3
    move-object v3, v4

    .line 122
    :goto_3
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1}, Landroid/location/Location;->hasSpeed()Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-eqz v3, :cond_4

    .line 133
    .line 134
    invoke-virtual {v1}, Landroid/location/Location;->getSpeed()F

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    :cond_4
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    const/16 v1, 0x3a

    .line 156
    .line 157
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    goto/16 :goto_0

    .line 161
    .line 162
    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 166
    return-object p0

    .line 167
    :catchall_0
    const/4 p0, 0x0

    .line 168
    return-object p0
.end method

.method public static c(Landroid/content/Context;)Lorg/json/JSONArray;
    .locals 5

    .line 1
    new-instance v0, Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-boolean v1, Lcom/tendcloud/tenddata/ab;->Q:Z

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_0

    .line 11
    .line 12
    :cond_0
    :try_start_0
    invoke-static {p0}, Lcom/tendcloud/tenddata/cp;->f(Landroid/content/Context;)Landroid/location/Location;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-eqz p0, :cond_6

    .line 17
    .line 18
    new-instance v1, Lorg/json/JSONObject;

    .line 19
    .line 20
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v2, "lat"

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/location/Location;->getLatitude()D

    .line 26
    .line 27
    .line 28
    move-result-wide v3

    .line 29
    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 30
    .line 31
    .line 32
    const-string v2, "lng"

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/location/Location;->getLongitude()D

    .line 35
    .line 36
    .line 37
    move-result-wide v3

    .line 38
    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 39
    .line 40
    .line 41
    const-string v2, "ts"

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/location/Location;->getTime()J

    .line 44
    .line 45
    .line 46
    move-result-wide v3

    .line 47
    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 48
    .line 49
    .line 50
    const/16 v2, 0x11

    .line 51
    .line 52
    invoke-static {v2}, Lcom/tendcloud/tenddata/cq;->a(I)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_1

    .line 57
    .line 58
    const-string v2, "elapsed"

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/location/Location;->getElapsedRealtimeNanos()J

    .line 61
    .line 62
    .line 63
    move-result-wide v3

    .line 64
    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 65
    .line 66
    .line 67
    :cond_1
    invoke-virtual {p0}, Landroid/location/Location;->hasAltitude()Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_2

    .line 72
    .line 73
    const-string v2, "altitude"

    .line 74
    .line 75
    invoke-virtual {p0}, Landroid/location/Location;->getAltitude()D

    .line 76
    .line 77
    .line 78
    move-result-wide v3

    .line 79
    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 80
    .line 81
    .line 82
    :cond_2
    invoke-virtual {p0}, Landroid/location/Location;->hasAccuracy()Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_3

    .line 87
    .line 88
    const-string v2, "hAccuracy"

    .line 89
    .line 90
    invoke-virtual {p0}, Landroid/location/Location;->getAccuracy()F

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    float-to-double v3, v3

    .line 95
    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 96
    .line 97
    .line 98
    :cond_3
    invoke-virtual {p0}, Landroid/location/Location;->hasBearing()Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-eqz v2, :cond_4

    .line 103
    .line 104
    const-string v2, "bearing"

    .line 105
    .line 106
    invoke-virtual {p0}, Landroid/location/Location;->getBearing()F

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    float-to-double v3, v3

    .line 111
    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 112
    .line 113
    .line 114
    :cond_4
    invoke-virtual {p0}, Landroid/location/Location;->hasSpeed()Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-eqz v2, :cond_5

    .line 119
    .line 120
    const-string v2, "speed"

    .line 121
    .line 122
    invoke-virtual {p0}, Landroid/location/Location;->getSpeed()F

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    float-to-double v3, v3

    .line 127
    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 128
    .line 129
    .line 130
    :cond_5
    const-string v2, "provider"

    .line 131
    .line 132
    invoke-virtual {p0}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-virtual {v1, v2, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    .line 141
    .line 142
    :catchall_0
    :cond_6
    :goto_0
    return-object v0
.end method

.method public static d(Landroid/content/Context;)Lorg/json/JSONArray;
    .locals 4

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lcom/tendcloud/tenddata/ch;->A(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    const-string v2, "type"

    .line 15
    .line 16
    if-lez v1, :cond_0

    .line 17
    .line 18
    :try_start_1
    new-instance v1, Lorg/json/JSONObject;

    .line 19
    .line 20
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v3, "sim"

    .line 24
    .line 25
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 26
    .line 27
    .line 28
    const-string v3, "extra"

    .line 29
    .line 30
    invoke-virtual {v1, v3, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 34
    .line 35
    .line 36
    :cond_0
    new-instance p0, Lorg/json/JSONObject;

    .line 37
    .line 38
    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string v1, "account"

    .line 42
    .line 43
    invoke-virtual {p0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 44
    .line 45
    .line 46
    sget-object v1, Lcom/tendcloud/tenddata/ab;->s:Ljava/lang/String;

    .line 47
    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    const-string v2, "accountId"

    .line 51
    .line 52
    invoke-virtual {p0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-static {}, Lcom/tendcloud/tenddata/cb;->l()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-static {v1}, Lcom/tendcloud/tenddata/cq;->b(Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_2

    .line 64
    .line 65
    filled-new-array {v1}, [Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-static {v2}, Lcom/tendcloud/tenddata/ca;->dForInternal([Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    new-instance v2, Lorg/json/JSONObject;

    .line 73
    .line 74
    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2}, Lorg/json/JSONObject;->length()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-lez v1, :cond_2

    .line 82
    .line 83
    const-string v1, "accountProp"

    .line 84
    .line 85
    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 86
    .line 87
    .line 88
    :cond_2
    invoke-virtual {p0}, Lorg/json/JSONObject;->length()I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    const/4 v2, 0x1

    .line 93
    if-le v1, v2, :cond_3

    .line 94
    .line 95
    invoke-virtual {v0, p0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 96
    .line 97
    .line 98
    :cond_3
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 99
    .line 100
    .line 101
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 102
    if-lez p0, :cond_4

    .line 103
    .line 104
    return-object v0

    .line 105
    :catchall_0
    :cond_4
    const/4 p0, 0x0

    .line 106
    return-object p0
.end method

.method public static e(Landroid/content/Context;)[[Ljava/lang/Long;
    .locals 0

    .line 1
    const/4 p0, 0x3

    .line 2
    new-array p0, p0, [[Ljava/lang/Long;

    .line 3
    .line 4
    return-object p0
.end method

.method private static f(Landroid/content/Context;)Landroid/location/Location;
    .locals 4

    .line 1
    sget-boolean v0, Lcom/tendcloud/tenddata/cp;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p0, Lcom/tendcloud/tenddata/cp;->a:Landroid/location/Location;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    .line 9
    .line 10
    invoke-static {p0, v0}, Lcom/tendcloud/tenddata/cq;->b(Landroid/content/Context;Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    const/4 v0, 0x0

    .line 15
    const/4 v1, 0x1

    .line 16
    if-nez p0, :cond_1

    .line 17
    .line 18
    sput-boolean v1, Lcom/tendcloud/tenddata/cp;->b:Z

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_1
    :try_start_0
    sget-object p0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 22
    .line 23
    const-string v2, "location"

    .line 24
    .line 25
    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Landroid/location/LocationManager;

    .line 30
    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    const-string v2, "gps"

    .line 34
    .line 35
    invoke-virtual {p0, v2}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    const-string v3, "network"

    .line 40
    .line 41
    invoke-virtual {p0, v3}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const/4 v2, 0x0

    .line 47
    move v3, v2

    .line 48
    :goto_0
    if-nez v2, :cond_3

    .line 49
    .line 50
    if-eqz v3, :cond_4

    .line 51
    .line 52
    :cond_3
    const-string v2, "passive"

    .line 53
    .line 54
    invoke-virtual {p0, v2}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    .line 55
    .line 56
    .line 57
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    :catchall_0
    :cond_4
    sput-object v0, Lcom/tendcloud/tenddata/cp;->a:Landroid/location/Location;

    .line 59
    .line 60
    sput-boolean v1, Lcom/tendcloud/tenddata/cp;->b:Z

    .line 61
    .line 62
    return-object v0
.end method
