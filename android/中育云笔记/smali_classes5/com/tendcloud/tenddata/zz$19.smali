.class Lcom/tendcloud/tenddata/zz$19;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tendcloud/tenddata/zz;->a(Ljava/lang/String;Lcom/tendcloud/tenddata/fx;Ljava/util/Map;Lcom/tendcloud/tenddata/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tendcloud/tenddata/zz;

.field final synthetic val$eventValue:Ljava/util/Map;

.field final synthetic val$order:Lcom/tendcloud/tenddata/fx;

.field final synthetic val$profileId:Ljava/lang/String;

.field final synthetic val$service:Lcom/tendcloud/tenddata/a;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/zz;Lcom/tendcloud/tenddata/a;Ljava/lang/String;Lcom/tendcloud/tenddata/fx;Ljava/util/Map;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/zz$19;->this$0:Lcom/tendcloud/tenddata/zz;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/tendcloud/tenddata/zz$19;->val$service:Lcom/tendcloud/tenddata/a;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/tendcloud/tenddata/zz$19;->val$profileId:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/tendcloud/tenddata/zz$19;->val$order:Lcom/tendcloud/tenddata/fx;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/tendcloud/tenddata/zz$19;->val$eventValue:Ljava/util/Map;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1
    const-string v0, "keyOrderDetail"

    .line 2
    .line 3
    :try_start_0
    new-instance v1, Lcom/tendcloud/tenddata/zz$a;

    .line 4
    .line 5
    invoke-direct {v1}, Lcom/tendcloud/tenddata/zz$a;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, v1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 9
    .line 10
    const-string v3, "apiType"

    .line 11
    .line 12
    const/16 v4, 0x8

    .line 13
    .line 14
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    iget-object v2, v1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 22
    .line 23
    const-string v3, "service"

    .line 24
    .line 25
    iget-object v4, p0, Lcom/tendcloud/tenddata/zz$19;->val$service:Lcom/tendcloud/tenddata/a;

    .line 26
    .line 27
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    iget-object v2, v1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 31
    .line 32
    const-string v3, "domain"

    .line 33
    .line 34
    const-string v4, "iap"

    .line 35
    .line 36
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    iget-object v2, v1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 40
    .line 41
    const-string v3, "action"

    .line 42
    .line 43
    const-string v4, "placeOrder"

    .line 44
    .line 45
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    new-instance v2, Ljava/util/TreeMap;

    .line 49
    .line 50
    invoke-direct {v2}, Ljava/util/TreeMap;-><init>()V

    .line 51
    .line 52
    .line 53
    const-string v3, "accountId"

    .line 54
    .line 55
    iget-object v4, p0, Lcom/tendcloud/tenddata/zz$19;->val$profileId:Ljava/lang/String;

    .line 56
    .line 57
    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    const-string v3, "orderId"

    .line 61
    .line 62
    iget-object v4, p0, Lcom/tendcloud/tenddata/zz$19;->val$order:Lcom/tendcloud/tenddata/fx;

    .line 63
    .line 64
    const-string v5, "keyOrderId"

    .line 65
    .line 66
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    const-string v3, "amount"

    .line 74
    .line 75
    iget-object v4, p0, Lcom/tendcloud/tenddata/zz$19;->val$order:Lcom/tendcloud/tenddata/fx;

    .line 76
    .line 77
    const-string v5, "keyTotalPrice"

    .line 78
    .line 79
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    iget-object v3, p0, Lcom/tendcloud/tenddata/zz$19;->val$service:Lcom/tendcloud/tenddata/a;

    .line 91
    .line 92
    invoke-virtual {v3}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    const-string v4, "TRACKING"

    .line 97
    .line 98
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    const-string v4, "keyCurrencyType"

    .line 103
    .line 104
    const-string v5, "currencyType"

    .line 105
    .line 106
    if-eqz v3, :cond_0

    .line 107
    .line 108
    :try_start_1
    iget-object v3, p0, Lcom/tendcloud/tenddata/zz$19;->val$order:Lcom/tendcloud/tenddata/fx;

    .line 109
    .line 110
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-interface {v2, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_0
    iget-object v3, p0, Lcom/tendcloud/tenddata/zz$19;->val$service:Lcom/tendcloud/tenddata/a;

    .line 119
    .line 120
    invoke-virtual {v3}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    const-string v6, "APP"

    .line 125
    .line 126
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-eqz v3, :cond_2

    .line 131
    .line 132
    iget-object v3, p0, Lcom/tendcloud/tenddata/zz$19;->val$order:Lcom/tendcloud/tenddata/fx;

    .line 133
    .line 134
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    if-eqz v4, :cond_1

    .line 143
    .line 144
    const-string v3, "CNY"

    .line 145
    .line 146
    :cond_1
    invoke-interface {v2, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    :cond_2
    :goto_0
    iget-object v3, p0, Lcom/tendcloud/tenddata/zz$19;->val$order:Lcom/tendcloud/tenddata/fx;

    .line 150
    .line 151
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    if-eqz v3, :cond_3

    .line 156
    .line 157
    iget-object v3, p0, Lcom/tendcloud/tenddata/zz$19;->val$order:Lcom/tendcloud/tenddata/fx;

    .line 158
    .line 159
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    if-eqz v0, :cond_3

    .line 164
    .line 165
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    if-lez v3, :cond_3

    .line 170
    .line 171
    const-string v3, "items"

    .line 172
    .line 173
    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    :cond_3
    iget-object v0, p0, Lcom/tendcloud/tenddata/zz$19;->val$eventValue:Ljava/util/Map;

    .line 177
    .line 178
    if-eqz v0, :cond_4

    .line 179
    .line 180
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-nez v0, :cond_4

    .line 185
    .line 186
    const-string v0, "eventValue"

    .line 187
    .line 188
    iget-object v3, p0, Lcom/tendcloud/tenddata/zz$19;->val$eventValue:Ljava/util/Map;

    .line 189
    .line 190
    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    :cond_4
    iget-object v0, v1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 194
    .line 195
    const-string v3, "data"

    .line 196
    .line 197
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    invoke-static {}, Lcom/tendcloud/tenddata/zz;->c()Landroid/os/Handler;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    const/16 v2, 0x66

    .line 205
    .line 206
    invoke-static {v0, v2, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 211
    .line 212
    .line 213
    :catchall_0
    return-void
.end method
