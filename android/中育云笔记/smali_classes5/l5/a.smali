.class public abstract Ll5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String; = "a"

.field public static b:Lm5/d;

.field public static final c:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ll5/a;->c:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Landroid/content/Context;)Lm5/d;
    .locals 5

    .line 1
    sget-object v0, Ll5/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Ll5/a;->b:Lm5/d;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-object v1

    .line 10
    :catchall_0
    move-exception p0

    .line 11
    goto/16 :goto_3

    .line 12
    .line 13
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lcom/huawei/hms/framework/network/grs/GrsApp;->getInstance()Lcom/huawei/hms/framework/network/grs/GrsApp;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const-string v3, "/"

    .line 23
    .line 24
    invoke-virtual {v2, v3}, Lcom/huawei/hms/framework/network/grs/GrsApp;->getBrand(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v2, "grs_sdk_server_config.json"

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {v1, p0}, Ln5/c;->a(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    const/4 v2, 0x0

    .line 49
    if-eqz v1, :cond_1

    .line 50
    .line 51
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    return-object v2

    .line 53
    :cond_1
    :try_start_1
    new-instance v1, Lorg/json/JSONObject;

    .line 54
    .line 55
    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const-string p0, "grs_server"

    .line 59
    .line 60
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    const-string v1, "grs_base_url"

    .line 65
    .line 66
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    if-eqz v1, :cond_2

    .line 71
    .line 72
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-lez v3, :cond_2

    .line 77
    .line 78
    new-instance v2, Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 81
    .line 82
    .line 83
    const/4 v3, 0x0

    .line 84
    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    if-ge v3, v4, :cond_2

    .line 89
    .line 90
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    add-int/lit8 v3, v3, 0x1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :catch_0
    move-exception p0

    .line 105
    goto :goto_1

    .line 106
    :cond_2
    new-instance v1, Lm5/d;

    .line 107
    .line 108
    invoke-direct {v1}, Lm5/d;-><init>()V

    .line 109
    .line 110
    .line 111
    sput-object v1, Ll5/a;->b:Lm5/d;

    .line 112
    .line 113
    invoke-virtual {v1, v2}, Lm5/d;->d(Ljava/util/List;)V

    .line 114
    .line 115
    .line 116
    const-string v1, "grs_query_endpoint_2.0"

    .line 117
    .line 118
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    sget-object v2, Ll5/a;->b:Lm5/d;

    .line 123
    .line 124
    invoke-virtual {v2, v1}, Lm5/d;->c(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    const-string v1, "grs_query_timeout"

    .line 128
    .line 129
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 130
    .line 131
    .line 132
    move-result p0

    .line 133
    sget-object v1, Ll5/a;->b:Lm5/d;

    .line 134
    .line 135
    invoke-virtual {v1, p0}, Lm5/d;->b(I)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :goto_1
    :try_start_2
    sget-object v1, Ll5/a;->a:Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 140
    .line 141
    const-string v2, "getGrsServerBean catch JSONException: %s"

    .line 142
    .line 143
    :try_start_3
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-static {p0}, Lcom/huawei/hms/framework/common/StringUtils;->anonymizeMessage(Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    invoke-static {v1, v2, p0}, Lcom/huawei/hms/framework/common/Logger;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    :goto_2
    sget-object p0, Ll5/a;->b:Lm5/d;

    .line 159
    .line 160
    monitor-exit v0

    .line 161
    return-object p0

    .line 162
    :goto_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 163
    throw p0
.end method
