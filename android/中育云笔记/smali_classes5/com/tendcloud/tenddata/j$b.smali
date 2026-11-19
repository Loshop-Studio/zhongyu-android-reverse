.class Lcom/tendcloud/tenddata/j$b;
.super Lcom/tendcloud/tenddata/ar;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tendcloud/tenddata/j;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/j;Ljava/net/URI;ILjava/net/Socket;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/j$b;->this$0:Lcom/tendcloud/tenddata/j;

    .line 2
    .line 3
    new-instance p1, Lcom/tendcloud/tenddata/au;

    .line 4
    .line 5
    invoke-direct {p1}, Lcom/tendcloud/tenddata/au;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {p0, p2, p1, v0, p3}, Lcom/tendcloud/tenddata/ar;-><init>(Ljava/net/URI;Lcom/tendcloud/tenddata/as;Ljava/util/Map;I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p4}, Lcom/tendcloud/tenddata/ar;->setSocket(Ljava/net/Socket;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public onClose(ILjava/lang/String;Z)V
    .locals 0

    .line 1
    :try_start_0
    iget-object p1, p0, Lcom/tendcloud/tenddata/j$b;->this$0:Lcom/tendcloud/tenddata/j;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/tendcloud/tenddata/j;->a(Lcom/tendcloud/tenddata/j;)Lcom/tendcloud/tenddata/j$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p1}, Lcom/tendcloud/tenddata/j$a;->cleanup()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    :catchall_0
    return-void
.end method

.method public onError(Ljava/lang/Exception;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public onMessage(Ljava/lang/String;)V
    .locals 7

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "type"

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x4

    .line 17
    const/4 v3, 0x2

    .line 18
    const/4 v4, 0x1

    .line 19
    const/4 v5, 0x5

    .line 20
    const/4 v6, 0x3

    .line 21
    sparse-switch v1, :sswitch_data_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :sswitch_0
    const-string v1, "dynamic_event_request"

    .line 26
    .line 27
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    move p1, v6

    .line 34
    goto :goto_1

    .line 35
    :sswitch_1
    const-string v1, "tweak_request"

    .line 36
    .line 37
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    move p1, v5

    .line 44
    goto :goto_1

    .line 45
    :sswitch_2
    const-string v1, "snapshot_request"

    .line 46
    .line 47
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_0

    .line 52
    .line 53
    move p1, v4

    .line 54
    goto :goto_1

    .line 55
    :sswitch_3
    const-string v1, "change_request"

    .line 56
    .line 57
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_0

    .line 62
    .line 63
    move p1, v3

    .line 64
    goto :goto_1

    .line 65
    :sswitch_4
    const-string v1, "clear_request"

    .line 66
    .line 67
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_0

    .line 72
    .line 73
    move p1, v2

    .line 74
    goto :goto_1

    .line 75
    :sswitch_5
    const-string v1, "device_info_request"

    .line 76
    .line 77
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_0

    .line 82
    .line 83
    const/4 p1, 0x0

    .line 84
    goto :goto_1

    .line 85
    :cond_0
    :goto_0
    const/4 p1, -0x1

    .line 86
    :goto_1
    if-eqz p1, :cond_6

    .line 87
    .line 88
    if-eq p1, v4, :cond_5

    .line 89
    .line 90
    if-eq p1, v3, :cond_4

    .line 91
    .line 92
    if-eq p1, v6, :cond_3

    .line 93
    .line 94
    if-eq p1, v2, :cond_2

    .line 95
    .line 96
    if-eq p1, v5, :cond_1

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_1
    iget-object p1, p0, Lcom/tendcloud/tenddata/j$b;->this$0:Lcom/tendcloud/tenddata/j;

    .line 100
    .line 101
    invoke-static {p1}, Lcom/tendcloud/tenddata/j;->a(Lcom/tendcloud/tenddata/j;)Lcom/tendcloud/tenddata/j$a;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-interface {p1, v0}, Lcom/tendcloud/tenddata/j$a;->setTweaks(Lorg/json/JSONObject;)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :cond_2
    iget-object p1, p0, Lcom/tendcloud/tenddata/j$b;->this$0:Lcom/tendcloud/tenddata/j;

    .line 110
    .line 111
    invoke-static {p1}, Lcom/tendcloud/tenddata/j;->a(Lcom/tendcloud/tenddata/j;)Lcom/tendcloud/tenddata/j$a;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-interface {p1, v0}, Lcom/tendcloud/tenddata/j$a;->clearEdits(Lorg/json/JSONObject;)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_3
    iget-object p1, p0, Lcom/tendcloud/tenddata/j$b;->this$0:Lcom/tendcloud/tenddata/j;

    .line 120
    .line 121
    invoke-static {p1}, Lcom/tendcloud/tenddata/j;->a(Lcom/tendcloud/tenddata/j;)Lcom/tendcloud/tenddata/j$a;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-interface {p1, v0}, Lcom/tendcloud/tenddata/j$a;->bindEvents(Lorg/json/JSONObject;)V

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :cond_4
    iget-object p1, p0, Lcom/tendcloud/tenddata/j$b;->this$0:Lcom/tendcloud/tenddata/j;

    .line 130
    .line 131
    invoke-static {p1}, Lcom/tendcloud/tenddata/j;->a(Lcom/tendcloud/tenddata/j;)Lcom/tendcloud/tenddata/j$a;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-interface {p1, v0}, Lcom/tendcloud/tenddata/j$a;->performEdit(Lorg/json/JSONObject;)V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :cond_5
    iget-object p1, p0, Lcom/tendcloud/tenddata/j$b;->this$0:Lcom/tendcloud/tenddata/j;

    .line 140
    .line 141
    invoke-static {p1}, Lcom/tendcloud/tenddata/j;->a(Lcom/tendcloud/tenddata/j;)Lcom/tendcloud/tenddata/j$a;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-interface {p1, v0}, Lcom/tendcloud/tenddata/j$a;->sendSnapshot(Lorg/json/JSONObject;)V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :cond_6
    iget-object p1, p0, Lcom/tendcloud/tenddata/j$b;->this$0:Lcom/tendcloud/tenddata/j;

    .line 150
    .line 151
    invoke-static {p1}, Lcom/tendcloud/tenddata/j;->a(Lcom/tendcloud/tenddata/j;)Lcom/tendcloud/tenddata/j$a;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-interface {p1}, Lcom/tendcloud/tenddata/j$a;->sendDeviceInfo()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 156
    .line 157
    .line 158
    :catchall_0
    :goto_2
    return-void

    .line 159
    :sswitch_data_0
    .sparse-switch
        -0x7ad9c8b9 -> :sswitch_5
        -0x61fc4d63 -> :sswitch_4
        -0x47010300 -> :sswitch_3
        -0x466694ec -> :sswitch_2
        -0x4485ccc4 -> :sswitch_1
        0x84829ea -> :sswitch_0
    .end sparse-switch
.end method

.method public onOpen(Lcom/tendcloud/tenddata/bq;)V
    .locals 0

    .line 1
    :try_start_0
    const-string p1, "Websocket connected"

    .line 2
    .line 3
    invoke-static {p1}, Lcom/tendcloud/tenddata/ca;->iForDeveloper(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    invoke-static {p1}, Lcom/tendcloud/tenddata/ab;->setDeveloperMode(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    :catchall_0
    return-void
.end method
