.class public final Lcom/friday/lecture/service/MyMqttService$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/lecture/service/MyMqttService;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/friday/lecture/service/MyMqttService;


# direct methods
.method public constructor <init>(Lcom/friday/lecture/service/MyMqttService;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/lecture/service/MyMqttService$b;->a:Lcom/friday/lecture/service/MyMqttService;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onFailure(Lorg/eclipse/paho/client/mqttv3/IMqttToken;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    const-string v0, "arg0"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "arg1"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/friday/lecture/service/MyMqttService$b;->a:Lcom/friday/lecture/service/MyMqttService;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-static {p1, v0}, Lcom/friday/lecture/service/MyMqttService;->q(Lcom/friday/lecture/service/MyMqttService;Z)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lcom/friday/lecture/service/MyMqttService$b;->a:Lcom/friday/lecture/service/MyMqttService;

    .line 18
    .line 19
    invoke-static {p1, v0}, Lcom/friday/lecture/service/MyMqttService;->o(Lcom/friday/lecture/service/MyMqttService;Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lcom/friday/lecture/service/MyMqttService$b;->a:Lcom/friday/lecture/service/MyMqttService;

    .line 26
    .line 27
    invoke-static {p1}, Lcom/friday/lecture/service/MyMqttService;->l(Lcom/friday/lecture/service/MyMqttService;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object v0, p0, Lcom/friday/lecture/service/MyMqttService$b;->a:Lcom/friday/lecture/service/MyMqttService;

    .line 32
    .line 33
    invoke-static {v0, p2}, Lcom/friday/lecture/service/MyMqttService;->d(Lcom/friday/lecture/service/MyMqttService;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    const-string v1, "MyMqttService -> onFailure,\u8fde\u63a5\u5931\u8d25, url="

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string p1, ", "

    .line 51
    .line 52
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Lcom/friday/lecture/service/MyMqttService$b;->a:Lcom/friday/lecture/service/MyMqttService;

    .line 70
    .line 71
    const/4 p2, 0x1

    .line 72
    const/4 v0, 0x0

    .line 73
    const-wide/16 v1, 0x0

    .line 74
    .line 75
    invoke-static {p1, v1, v2, p2, v0}, Lcom/friday/lecture/service/MyMqttService;->D(Lcom/friday/lecture/service/MyMqttService;JILjava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public onSuccess(Lorg/eclipse/paho/client/mqttv3/IMqttToken;)V
    .locals 7

    .line 1
    const-string v0, "arg0"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/friday/lecture/service/MyMqttService$b;->a:Lcom/friday/lecture/service/MyMqttService;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {p1, v0}, Lcom/friday/lecture/service/MyMqttService;->o(Lcom/friday/lecture/service/MyMqttService;Z)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lcom/friday/lecture/service/MyMqttService$b;->a:Lcom/friday/lecture/service/MyMqttService;

    .line 13
    .line 14
    invoke-static {p1}, Lcom/friday/lecture/service/MyMqttService;->j(Lcom/friday/lecture/service/MyMqttService;)Lkotlinx/coroutines/g;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const/4 v1, 0x0

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-static {p1, v1, v2, v1}, Lkotlinx/coroutines/g$a;->a(Lkotlinx/coroutines/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object p1, p0, Lcom/friday/lecture/service/MyMqttService$b;->a:Lcom/friday/lecture/service/MyMqttService;

    .line 26
    .line 27
    invoke-static {p1, v1}, Lcom/friday/lecture/service/MyMqttService;->s(Lcom/friday/lecture/service/MyMqttService;Lkotlinx/coroutines/g;)V

    .line 28
    .line 29
    .line 30
    const-string p1, "MyMqttService"

    .line 31
    .line 32
    const-string v2, "\u8fde\u63a5\u6210\u529f "

    .line 33
    .line 34
    filled-new-array {p1, v2}, [Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :try_start_0
    new-instance p1, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    iget-object v2, p0, Lcom/friday/lecture/service/MyMqttService$b;->a:Lcom/friday/lecture/service/MyMqttService;

    .line 47
    .line 48
    invoke-static {v2}, Lcom/friday/lecture/service/MyMqttService;->f(Lcom/friday/lecture/service/MyMqttService;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    iget-object v2, p0, Lcom/friday/lecture/service/MyMqttService$b;->a:Lcom/friday/lecture/service/MyMqttService;

    .line 56
    .line 57
    invoke-static {v2}, Lcom/friday/lecture/service/MyMqttService;->f(Lcom/friday/lecture/service/MyMqttService;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    new-instance v3, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v2, "/REQUEST_SCREEN_CAPTURE"

    .line 70
    .line 71
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    iget-object v2, p0, Lcom/friday/lecture/service/MyMqttService$b;->a:Lcom/friday/lecture/service/MyMqttService;

    .line 82
    .line 83
    invoke-static {v2}, Lcom/friday/lecture/service/MyMqttService;->g(Lcom/friday/lecture/service/MyMqttService;)Lorg/eclipse/paho/android/service/MqttAndroidClient;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    if-eqz v2, :cond_2

    .line 88
    .line 89
    new-array v3, v0, [Ljava/lang/String;

    .line 90
    .line 91
    invoke-interface {p1, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    check-cast v3, [Ljava/lang/String;

    .line 96
    .line 97
    new-instance v4, Ljava/util/ArrayList;

    .line 98
    .line 99
    const/16 v5, 0xa

    .line 100
    .line 101
    invoke-static {p1, v5}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    :goto_0
    if-ge v0, v5, :cond_1

    .line 113
    .line 114
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    add-int/lit8 v0, v0, 0x1

    .line 119
    .line 120
    check-cast v6, Ljava/lang/String;

    .line 121
    .line 122
    const/4 v6, 0x2

    .line 123
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    goto :goto_0

    .line 131
    :catch_0
    move-exception p1

    .line 132
    goto :goto_1

    .line 133
    :cond_1
    invoke-static {v4}, Lrc/g0;->W0(Ljava/util/Collection;)[I

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    new-instance v0, Lcom/friday/lecture/service/MyMqttService$b$a;

    .line 138
    .line 139
    iget-object v4, p0, Lcom/friday/lecture/service/MyMqttService$b;->a:Lcom/friday/lecture/service/MyMqttService;

    .line 140
    .line 141
    invoke-direct {v0, v4}, Lcom/friday/lecture/service/MyMqttService$b$a;-><init>(Lcom/friday/lecture/service/MyMqttService;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, v3, p1, v1, v0}, Lorg/eclipse/paho/android/service/MqttAndroidClient;->subscribe([Ljava/lang/String;[ILjava/lang/Object;Lorg/eclipse/paho/client/mqttv3/IMqttActionListener;)Lorg/eclipse/paho/client/mqttv3/IMqttToken;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 145
    .line 146
    .line 147
    :cond_2
    return-void

    .line 148
    :goto_1
    const-string v0, "\u8fde\u63a5\u670d\u52a1\u5931\u8d25\uff0c\u8bf7\u91cd\u8bd5"

    .line 149
    .line 150
    invoke-static {v0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 151
    .line 152
    .line 153
    const-string v0, "EndInClassTest"

    .line 154
    .line 155
    invoke-static {v0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-interface {v0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 163
    .line 164
    .line 165
    iget-object v0, p0, Lcom/friday/lecture/service/MyMqttService$b;->a:Lcom/friday/lecture/service/MyMqttService;

    .line 166
    .line 167
    invoke-static {v0, p1}, Lcom/friday/lecture/service/MyMqttService;->d(Lcom/friday/lecture/service/MyMqttService;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    new-instance v0, Ljava/lang/StringBuilder;

    .line 172
    .line 173
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 174
    .line 175
    .line 176
    const-string v1, "MyMqttService -> iMqttActionListener catch, "

    .line 177
    .line 178
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    return-void
.end method
