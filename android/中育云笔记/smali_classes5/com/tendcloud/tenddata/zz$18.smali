.class Lcom/tendcloud/tenddata/zz$18;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tendcloud/tenddata/zz;->a(Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/fx;Lcom/tendcloud/tenddata/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tendcloud/tenddata/zz;

.field final synthetic val$order:Lcom/tendcloud/tenddata/fx;

.field final synthetic val$payType:Ljava/lang/String;

.field final synthetic val$profileId:Ljava/lang/String;

.field final synthetic val$service:Lcom/tendcloud/tenddata/a;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/zz;Lcom/tendcloud/tenddata/a;Ljava/lang/String;Lcom/tendcloud/tenddata/fx;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/zz$18;->this$0:Lcom/tendcloud/tenddata/zz;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/tendcloud/tenddata/zz$18;->val$service:Lcom/tendcloud/tenddata/a;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/tendcloud/tenddata/zz$18;->val$profileId:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/tendcloud/tenddata/zz$18;->val$order:Lcom/tendcloud/tenddata/fx;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/tendcloud/tenddata/zz$18;->val$payType:Ljava/lang/String;

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
    .locals 11

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
    iget-object v4, p0, Lcom/tendcloud/tenddata/zz$18;->val$service:Lcom/tendcloud/tenddata/a;

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
    const-string v4, "pay"

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
    iget-object v4, p0, Lcom/tendcloud/tenddata/zz$18;->val$profileId:Ljava/lang/String;

    .line 56
    .line 57
    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    iget-object v3, p0, Lcom/tendcloud/tenddata/zz$18;->val$service:Lcom/tendcloud/tenddata/a;

    .line 61
    .line 62
    invoke-virtual {v3}, Lcom/tendcloud/tenddata/a;->name()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    const-string v4, "APP"

    .line 67
    .line 68
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    const-string v4, "currencyType"

    .line 73
    .line 74
    const-string v5, "keyCurrencyType"

    .line 75
    .line 76
    const-string v6, "keyTotalPrice"

    .line 77
    .line 78
    const-string v7, "amount"

    .line 79
    .line 80
    const-string v8, "payType"

    .line 81
    .line 82
    const-string v9, "keyOrderId"

    .line 83
    .line 84
    const-string v10, "orderId"

    .line 85
    .line 86
    if-eqz v3, :cond_2

    .line 87
    .line 88
    :try_start_1
    iget-object v3, p0, Lcom/tendcloud/tenddata/zz$18;->val$order:Lcom/tendcloud/tenddata/fx;

    .line 89
    .line 90
    invoke-virtual {v3, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-interface {v2, v10, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    iget-object v3, p0, Lcom/tendcloud/tenddata/zz$18;->val$payType:Ljava/lang/String;

    .line 98
    .line 99
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-nez v3, :cond_0

    .line 104
    .line 105
    iget-object v3, p0, Lcom/tendcloud/tenddata/zz$18;->val$payType:Ljava/lang/String;

    .line 106
    .line 107
    invoke-interface {v2, v8, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    :cond_0
    iget-object v3, p0, Lcom/tendcloud/tenddata/zz$18;->val$order:Lcom/tendcloud/tenddata/fx;

    .line 111
    .line 112
    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-interface {v2, v7, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    iget-object v3, p0, Lcom/tendcloud/tenddata/zz$18;->val$order:Lcom/tendcloud/tenddata/fx;

    .line 124
    .line 125
    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    if-eqz v5, :cond_1

    .line 134
    .line 135
    const-string v3, "CNY"

    .line 136
    .line 137
    :cond_1
    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_2
    iget-object v3, p0, Lcom/tendcloud/tenddata/zz$18;->val$payType:Ljava/lang/String;

    .line 142
    .line 143
    invoke-interface {v2, v8, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    iget-object v3, p0, Lcom/tendcloud/tenddata/zz$18;->val$order:Lcom/tendcloud/tenddata/fx;

    .line 147
    .line 148
    invoke-virtual {v3, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    invoke-interface {v2, v10, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    iget-object v3, p0, Lcom/tendcloud/tenddata/zz$18;->val$order:Lcom/tendcloud/tenddata/fx;

    .line 156
    .line 157
    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    invoke-interface {v2, v7, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    iget-object v3, p0, Lcom/tendcloud/tenddata/zz$18;->val$order:Lcom/tendcloud/tenddata/fx;

    .line 169
    .line 170
    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    :goto_0
    iget-object v3, p0, Lcom/tendcloud/tenddata/zz$18;->val$order:Lcom/tendcloud/tenddata/fx;

    .line 178
    .line 179
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    if-eqz v3, :cond_3

    .line 184
    .line 185
    iget-object v3, p0, Lcom/tendcloud/tenddata/zz$18;->val$order:Lcom/tendcloud/tenddata/fx;

    .line 186
    .line 187
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    if-eqz v0, :cond_3

    .line 192
    .line 193
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    if-lez v3, :cond_3

    .line 198
    .line 199
    const-string v3, "items"

    .line 200
    .line 201
    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    :cond_3
    iget-object v0, v1, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 205
    .line 206
    const-string v3, "data"

    .line 207
    .line 208
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    invoke-static {}, Lcom/tendcloud/tenddata/zz;->c()Landroid/os/Handler;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    const/16 v2, 0x66

    .line 216
    .line 217
    invoke-static {v0, v2, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 222
    .line 223
    .line 224
    :catchall_0
    return-void
.end method
