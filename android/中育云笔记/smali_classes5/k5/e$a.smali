.class public Lk5/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk5/e;->b(Ljava/util/ArrayList;JLorg/json/JSONArray;Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:J

.field public final synthetic d:Ljava/util/ArrayList;

.field public final synthetic e:Lorg/json/JSONArray;


# direct methods
.method public constructor <init>(JLjava/util/ArrayList;Lorg/json/JSONArray;)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lk5/e$a;->c:J

    .line 2
    .line 3
    iput-object p3, p0, Lk5/e$a;->d:Ljava/util/ArrayList;

    .line 4
    .line 5
    iput-object p4, p0, Lk5/e$a;->e:Lorg/json/JSONArray;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 1
    new-instance v0, Lm5/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lm5/a;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-wide v1, p0, Lk5/e$a;->c:J

    .line 7
    .line 8
    const-string v3, "total_time"

    .line 9
    .line 10
    invoke-virtual {v0, v3, v1, v2}, Lcom/huawei/hms/framework/common/hianalytics/HianalyticsBaseData;->put(Ljava/lang/String;J)Lcom/huawei/hms/framework/common/hianalytics/HianalyticsBaseData;

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lk5/e$a;->d:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Lk5/d;

    .line 30
    .line 31
    invoke-virtual {v2}, Lk5/d;->D()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-nez v3, :cond_1

    .line 36
    .line 37
    invoke-virtual {v2}, Lk5/d;->B()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    :cond_1
    invoke-static {v2}, Lk5/e;->a(Lk5/d;)Ljava/util/LinkedHashMap;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v0, v2}, Lcom/huawei/hms/framework/common/hianalytics/HianalyticsBaseData;->put(Ljava/util/LinkedHashMap;)Lcom/huawei/hms/framework/common/hianalytics/HianalyticsBaseData;

    .line 48
    .line 49
    .line 50
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    iget-object v1, p0, Lk5/e$a;->d:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-lez v1, :cond_3

    .line 61
    .line 62
    iget-object v1, p0, Lk5/e$a;->d:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    add-int/lit8 v2, v2, -0x1

    .line 69
    .line 70
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    check-cast v1, Lk5/d;

    .line 75
    .line 76
    invoke-static {v1}, Lk5/e;->a(Lk5/d;)Ljava/util/LinkedHashMap;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {v0, v2}, Lcom/huawei/hms/framework/common/hianalytics/HianalyticsBaseData;->put(Ljava/util/LinkedHashMap;)Lcom/huawei/hms/framework/common/hianalytics/HianalyticsBaseData;

    .line 81
    .line 82
    .line 83
    iget-object v2, p0, Lk5/e$a;->d:Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    :cond_3
    :goto_0
    iget-object v1, p0, Lk5/e$a;->d:Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-lez v1, :cond_4

    .line 95
    .line 96
    iget-object v1, p0, Lk5/e$a;->d:Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    const/4 v3, 0x0

    .line 103
    :goto_1
    if-ge v3, v2, :cond_4

    .line 104
    .line 105
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    add-int/lit8 v3, v3, 0x1

    .line 110
    .line 111
    check-cast v4, Lk5/d;

    .line 112
    .line 113
    new-instance v5, Lorg/json/JSONObject;

    .line 114
    .line 115
    invoke-static {v4}, Lk5/e;->a(Lk5/d;)Ljava/util/LinkedHashMap;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-direct {v5, v4}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 120
    .line 121
    .line 122
    iget-object v4, p0, Lk5/e$a;->e:Lorg/json/JSONArray;

    .line 123
    .line 124
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_4
    iget-object v1, p0, Lk5/e$a;->e:Lorg/json/JSONArray;

    .line 129
    .line 130
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-lez v1, :cond_5

    .line 135
    .line 136
    iget-object v1, p0, Lk5/e$a;->e:Lorg/json/JSONArray;

    .line 137
    .line 138
    invoke-virtual {v1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    const-string v2, "failed_info"

    .line 143
    .line 144
    invoke-virtual {v0, v2, v1}, Lcom/huawei/hms/framework/common/hianalytics/HianalyticsBaseData;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/hms/framework/common/hianalytics/HianalyticsBaseData;

    .line 145
    .line 146
    .line 147
    :cond_5
    new-instance v1, Lorg/json/JSONObject;

    .line 148
    .line 149
    invoke-virtual {v0}, Lcom/huawei/hms/framework/common/hianalytics/HianalyticsBaseData;->get()Ljava/util/LinkedHashMap;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 154
    .line 155
    .line 156
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    const-string v2, "HaReportHelper"

    .line 161
    .line 162
    const-string v3, "grssdk report data to aiops is: %s"

    .line 163
    .line 164
    invoke-static {v2, v3, v1}, Lcom/huawei/hms/framework/common/Logger;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    invoke-static {}, Lcom/huawei/hms/framework/common/hianalytics/HianalyticsHelper;->getInstance()Lcom/huawei/hms/framework/common/hianalytics/HianalyticsHelper;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-virtual {v0}, Lcom/huawei/hms/framework/common/hianalytics/HianalyticsBaseData;->get()Ljava/util/LinkedHashMap;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    const-string v2, "grs_request"

    .line 176
    .line 177
    invoke-virtual {v1, v0, v2}, Lcom/huawei/hms/framework/common/hianalytics/HianalyticsHelper;->onEvent(Ljava/util/LinkedHashMap;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    return-void
.end method
