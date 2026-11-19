.class Lcom/tendcloud/tenddata/zz$17;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tendcloud/tenddata/zz;->a(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/fx;Lcom/tendcloud/tenddata/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tendcloud/tenddata/zz;

.field final synthetic val$amount:I

.field final synthetic val$currencyType:Ljava/lang/String;

.field final synthetic val$order:Lcom/tendcloud/tenddata/fx;

.field final synthetic val$orderid:Ljava/lang/String;

.field final synthetic val$payType:Ljava/lang/String;

.field final synthetic val$profileId:Ljava/lang/String;

.field final synthetic val$service:Lcom/tendcloud/tenddata/a;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/zz;Lcom/tendcloud/tenddata/a;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/fx;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/zz$17;->this$0:Lcom/tendcloud/tenddata/zz;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/tendcloud/tenddata/zz$17;->val$service:Lcom/tendcloud/tenddata/a;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/tendcloud/tenddata/zz$17;->val$profileId:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/tendcloud/tenddata/zz$17;->val$orderid:Ljava/lang/String;

    .line 8
    .line 9
    iput p5, p0, Lcom/tendcloud/tenddata/zz$17;->val$amount:I

    .line 10
    .line 11
    iput-object p6, p0, Lcom/tendcloud/tenddata/zz$17;->val$currencyType:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p7, p0, Lcom/tendcloud/tenddata/zz$17;->val$payType:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p8, p0, Lcom/tendcloud/tenddata/zz$17;->val$order:Lcom/tendcloud/tenddata/fx;

    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 1
    const-string v0, "keyOrderDetail"

    .line 2
    .line 3
    const-string v1, "currencyType"

    .line 4
    .line 5
    const-string v2, "amount"

    .line 6
    .line 7
    const-string v3, "orderId"

    .line 8
    .line 9
    :try_start_0
    new-instance v4, Lcom/tendcloud/tenddata/zz$a;

    .line 10
    .line 11
    invoke-direct {v4}, Lcom/tendcloud/tenddata/zz$a;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-object v5, v4, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 15
    .line 16
    const-string v6, "apiType"

    .line 17
    .line 18
    const/16 v7, 0x8

    .line 19
    .line 20
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v7

    .line 24
    invoke-virtual {v5, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    iget-object v5, v4, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 28
    .line 29
    const-string v6, "service"

    .line 30
    .line 31
    iget-object v7, p0, Lcom/tendcloud/tenddata/zz$17;->val$service:Lcom/tendcloud/tenddata/a;

    .line 32
    .line 33
    invoke-virtual {v5, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    iget-object v5, v4, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 37
    .line 38
    const-string v6, "domain"

    .line 39
    .line 40
    const-string v7, "iap"

    .line 41
    .line 42
    invoke-virtual {v5, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    iget-object v5, v4, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 46
    .line 47
    const-string v6, "action"

    .line 48
    .line 49
    const-string v7, "recharge"

    .line 50
    .line 51
    invoke-virtual {v5, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    new-instance v5, Ljava/util/TreeMap;

    .line 55
    .line 56
    invoke-direct {v5}, Ljava/util/TreeMap;-><init>()V

    .line 57
    .line 58
    .line 59
    const-string v6, "accountId"

    .line 60
    .line 61
    iget-object v7, p0, Lcom/tendcloud/tenddata/zz$17;->val$profileId:Ljava/lang/String;

    .line 62
    .line 63
    invoke-interface {v5, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    iget-object v6, p0, Lcom/tendcloud/tenddata/zz$17;->val$orderid:Ljava/lang/String;

    .line 67
    .line 68
    invoke-interface {v5, v3, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    iget v6, p0, Lcom/tendcloud/tenddata/zz$17;->val$amount:I

    .line 72
    .line 73
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    invoke-interface {v5, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    iget-object v6, p0, Lcom/tendcloud/tenddata/zz$17;->val$currencyType:Ljava/lang/String;

    .line 81
    .line 82
    invoke-interface {v5, v1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    const-string v6, "payType"

    .line 86
    .line 87
    iget-object v7, p0, Lcom/tendcloud/tenddata/zz$17;->val$payType:Ljava/lang/String;

    .line 88
    .line 89
    invoke-interface {v5, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    new-instance v6, Lorg/json/JSONObject;

    .line 93
    .line 94
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 95
    .line 96
    .line 97
    iget-object v7, p0, Lcom/tendcloud/tenddata/zz$17;->val$order:Lcom/tendcloud/tenddata/fx;

    .line 98
    .line 99
    const-string v8, "keyOrderId"

    .line 100
    .line 101
    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    invoke-virtual {v6, v3, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 106
    .line 107
    .line 108
    iget-object v3, p0, Lcom/tendcloud/tenddata/zz$17;->val$order:Lcom/tendcloud/tenddata/fx;

    .line 109
    .line 110
    const-string v7, "keyTotalPrice"

    .line 111
    .line 112
    invoke-virtual {v3, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    invoke-virtual {v6, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 117
    .line 118
    .line 119
    iget-object v2, p0, Lcom/tendcloud/tenddata/zz$17;->val$order:Lcom/tendcloud/tenddata/fx;

    .line 120
    .line 121
    const-string v3, "keyCurrencyType"

    .line 122
    .line 123
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-virtual {v6, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 128
    .line 129
    .line 130
    iget-object v1, p0, Lcom/tendcloud/tenddata/zz$17;->val$order:Lcom/tendcloud/tenddata/fx;

    .line 131
    .line 132
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-eqz v1, :cond_0

    .line 137
    .line 138
    iget-object v1, p0, Lcom/tendcloud/tenddata/zz$17;->val$order:Lcom/tendcloud/tenddata/fx;

    .line 139
    .line 140
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    if-eqz v0, :cond_0

    .line 145
    .line 146
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    if-lez v1, :cond_0

    .line 151
    .line 152
    const-string v1, "items"

    .line 153
    .line 154
    invoke-virtual {v6, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 155
    .line 156
    .line 157
    :cond_0
    const-string v0, "order"

    .line 158
    .line 159
    invoke-interface {v5, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    iget-object v0, v4, Lcom/tendcloud/tenddata/zz$a;->paraMap:Ljava/util/HashMap;

    .line 163
    .line 164
    const-string v1, "data"

    .line 165
    .line 166
    invoke-virtual {v0, v1, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    invoke-static {}, Lcom/tendcloud/tenddata/zz;->c()Landroid/os/Handler;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    const/16 v1, 0x66

    .line 174
    .line 175
    invoke-static {v0, v1, v4}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 180
    .line 181
    .line 182
    :catchall_0
    return-void
.end method
