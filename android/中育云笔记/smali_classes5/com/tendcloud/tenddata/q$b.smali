.class Lcom/tendcloud/tenddata/q$b;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final mEditorChanges:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            ">;>;"
        }
    .end annotation
.end field

.field private mEditorConnection:Lcom/tendcloud/tenddata/j;

.field private final mEditorEventBindings:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            ">;>;"
        }
    .end annotation
.end field

.field private final mProtocol:Lcom/tendcloud/tenddata/h;

.field private mSnapshot:Lcom/tendcloud/tenddata/s;

.field private final mStartLock:Ljava/util/concurrent/locks/Lock;

.field private final mToken:Ljava/lang/String;

.field final synthetic this$0:Lcom/tendcloud/tenddata/q;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/q;Landroid/content/Context;Ljava/lang/String;Landroid/os/Looper;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tendcloud/tenddata/q$b;->this$0:Lcom/tendcloud/tenddata/q;

    .line 2
    .line 3
    invoke-direct {p0, p4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lcom/tendcloud/tenddata/q$b;->mContext:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/tendcloud/tenddata/q$b;->mToken:Ljava/lang/String;

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Lcom/tendcloud/tenddata/q$b;->mSnapshot:Lcom/tendcloud/tenddata/s;

    .line 12
    .line 13
    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance p3, Lcom/tendcloud/tenddata/n$b;

    .line 18
    .line 19
    invoke-direct {p3, p1, p2}, Lcom/tendcloud/tenddata/n$b;-><init>(Ljava/lang/String;Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    new-instance p1, Lcom/tendcloud/tenddata/h;

    .line 23
    .line 24
    invoke-direct {p1, p3}, Lcom/tendcloud/tenddata/h;-><init>(Lcom/tendcloud/tenddata/n;)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lcom/tendcloud/tenddata/q$b;->mProtocol:Lcom/tendcloud/tenddata/h;

    .line 28
    .line 29
    new-instance p1, Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lcom/tendcloud/tenddata/q$b;->mEditorChanges:Ljava/util/Map;

    .line 35
    .line 36
    new-instance p1, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lcom/tendcloud/tenddata/q$b;->mEditorEventBindings:Ljava/util/List;

    .line 42
    .line 43
    new-instance p1, Ljava/util/concurrent/locks/ReentrantLock;

    .line 44
    .line 45
    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lcom/tendcloud/tenddata/q$b;->mStartLock:Ljava/util/concurrent/locks/Lock;

    .line 49
    .line 50
    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method private connectToEditor(Ljava/lang/String;)V
    .locals 5

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    iget-object v1, p0, Lcom/tendcloud/tenddata/q$b;->mEditorConnection:Lcom/tendcloud/tenddata/j;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/j;->a()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    sget-object v2, Lcom/tendcloud/tenddata/aa;->y:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v2, "/"

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    :try_start_0
    const-string v1, "wss"

    .line 37
    .line 38
    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const/4 v2, 0x0

    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    invoke-static {v0}, Lcom/tendcloud/tenddata/cq;->b(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-nez v1, :cond_1

    .line 50
    .line 51
    invoke-static {v0}, Lcom/tendcloud/tenddata/cv;->a(Ljava/lang/String;)Ljava/security/cert/X509Certificate;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0}, Lcom/tendcloud/tenddata/cv;->a(Ljava/security/cert/X509Certificate;)Ljavax/net/ssl/SSLSocketFactory;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    invoke-static {v2}, Lcom/tendcloud/tenddata/cv;->a(Ljava/security/cert/X509Certificate;)Ljavax/net/ssl/SSLSocketFactory;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    :goto_0
    if-nez v0, :cond_2

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    invoke-virtual {v0}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    new-instance v1, Lcom/tendcloud/tenddata/j;

    .line 72
    .line 73
    new-instance v3, Ljava/net/URI;

    .line 74
    .line 75
    invoke-direct {v3, p1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    new-instance p1, Lcom/tendcloud/tenddata/q$a;

    .line 79
    .line 80
    iget-object v4, p0, Lcom/tendcloud/tenddata/q$b;->this$0:Lcom/tendcloud/tenddata/q;

    .line 81
    .line 82
    invoke-direct {p1, v4, v2}, Lcom/tendcloud/tenddata/q$a;-><init>(Lcom/tendcloud/tenddata/q;Lcom/tendcloud/tenddata/q$1;)V

    .line 83
    .line 84
    .line 85
    invoke-direct {v1, v3, p1, v0}, Lcom/tendcloud/tenddata/j;-><init>(Ljava/net/URI;Lcom/tendcloud/tenddata/j$a;Ljava/net/Socket;)V

    .line 86
    .line 87
    .line 88
    iput-object v1, p0, Lcom/tendcloud/tenddata/q$b;->mEditorConnection:Lcom/tendcloud/tenddata/j;

    .line 89
    .line 90
    return-void

    .line 91
    :cond_3
    new-instance v0, Lcom/tendcloud/tenddata/j;

    .line 92
    .line 93
    new-instance v1, Ljava/net/URI;

    .line 94
    .line 95
    invoke-direct {v1, p1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    new-instance p1, Lcom/tendcloud/tenddata/q$a;

    .line 99
    .line 100
    iget-object v3, p0, Lcom/tendcloud/tenddata/q$b;->this$0:Lcom/tendcloud/tenddata/q;

    .line 101
    .line 102
    invoke-direct {p1, v3, v2}, Lcom/tendcloud/tenddata/q$a;-><init>(Lcom/tendcloud/tenddata/q;Lcom/tendcloud/tenddata/q$1;)V

    .line 103
    .line 104
    .line 105
    invoke-direct {v0, v1, p1, v2}, Lcom/tendcloud/tenddata/j;-><init>(Ljava/net/URI;Lcom/tendcloud/tenddata/j$a;Ljava/net/Socket;)V

    .line 106
    .line 107
    .line 108
    iput-object v0, p0, Lcom/tendcloud/tenddata/q$b;->mEditorConnection:Lcom/tendcloud/tenddata/j;
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    .line 110
    :catch_0
    :catchall_0
    :goto_1
    return-void
.end method

.method private handleEditorBindingsReceived(Lorg/json/JSONObject;)V
    .locals 0

    .line 1
    :try_start_0
    const-string p1, "handleEditorBindingsReceived: "

    .line 2
    .line 3
    filled-new-array {p1}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Lcom/tendcloud/tenddata/ca;->dForInternal([Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lcom/tendcloud/tenddata/l;->a()Lcom/tendcloud/tenddata/l;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Lcom/tendcloud/tenddata/l;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    invoke-static {p1}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method private handleEditorClosed()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/q$b;->mEditorChanges:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/tendcloud/tenddata/q$b;->mEditorEventBindings:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lcom/tendcloud/tenddata/q$b;->mSnapshot:Lcom/tendcloud/tenddata/s;

    .line 13
    .line 14
    const-string v0, "Closed."

    .line 15
    .line 16
    invoke-static {v0}, Lcom/tendcloud/tenddata/ca;->dForDeveloper(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    :catchall_0
    return-void
.end method

.method private sendDeviceInfo()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/q$b;->mEditorConnection:Lcom/tendcloud/tenddata/j;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_1

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/q$b;->this$0:Lcom/tendcloud/tenddata/q;

    .line 8
    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    invoke-static {v0, v1, v2}, Lcom/tendcloud/tenddata/q;->a(Lcom/tendcloud/tenddata/q;J)J

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/tendcloud/tenddata/q$b;->mEditorConnection:Lcom/tendcloud/tenddata/j;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/j;->b()Ljava/io/BufferedOutputStream;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, Landroid/util/JsonWriter;

    .line 23
    .line 24
    new-instance v2, Ljava/io/OutputStreamWriter;

    .line 25
    .line 26
    invoke-direct {v2, v0}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {v1, v2}, Landroid/util/JsonWriter;-><init>(Ljava/io/Writer;)V

    .line 30
    .line 31
    .line 32
    :try_start_0
    invoke-virtual {v1}, Landroid/util/JsonWriter;->beginObject()Landroid/util/JsonWriter;

    .line 33
    .line 34
    .line 35
    const-string v0, "type"

    .line 36
    .line 37
    invoke-virtual {v1, v0}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const-string v2, "device_info_response"

    .line 42
    .line 43
    invoke-virtual {v0, v2}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 44
    .line 45
    .line 46
    const-string v0, "payload"

    .line 47
    .line 48
    invoke-virtual {v1, v0}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Landroid/util/JsonWriter;->beginObject()Landroid/util/JsonWriter;

    .line 53
    .line 54
    .line 55
    const-string v0, "scaled_density"

    .line 56
    .line 57
    invoke-virtual {v1, v0}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {}, Lcom/tendcloud/tenddata/q;->b()Lcom/tendcloud/tenddata/q;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-static {v2}, Lcom/tendcloud/tenddata/q;->a(Lcom/tendcloud/tenddata/q;)F

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    float-to-double v2, v2

    .line 70
    invoke-virtual {v0, v2, v3}, Landroid/util/JsonWriter;->value(D)Landroid/util/JsonWriter;

    .line 71
    .line 72
    .line 73
    const-string v0, "ssid"

    .line 74
    .line 75
    invoke-virtual {v1, v0}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iget-object v2, p0, Lcom/tendcloud/tenddata/q$b;->mContext:Landroid/content/Context;

    .line 80
    .line 81
    invoke-static {v2}, Lcom/tendcloud/tenddata/ch;->w(Landroid/content/Context;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {v0, v2}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 86
    .line 87
    .line 88
    invoke-static {}, Lcom/tendcloud/tenddata/q;->a()Lcom/tendcloud/tenddata/q;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-static {v0}, Lcom/tendcloud/tenddata/q;->b(Lcom/tendcloud/tenddata/q;)Ljava/util/Map;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-eqz v2, :cond_1

    .line 109
    .line 110
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    check-cast v2, Ljava/util/Map$Entry;

    .line 115
    .line 116
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    check-cast v3, Ljava/lang/String;

    .line 121
    .line 122
    invoke-virtual {v1, v3}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    check-cast v2, Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {v3, v2}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_1
    const-string v0, "is_wifi_connected"

    .line 137
    .line 138
    invoke-virtual {v1, v0}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    sget-object v2, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 143
    .line 144
    invoke-static {v2}, Lcom/tendcloud/tenddata/ch;->i(Landroid/content/Context;)Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    invoke-virtual {v0, v2}, Landroid/util/JsonWriter;->value(Z)Landroid/util/JsonWriter;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1}, Landroid/util/JsonWriter;->endObject()Landroid/util/JsonWriter;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1}, Landroid/util/JsonWriter;->endObject()Landroid/util/JsonWriter;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 155
    .line 156
    .line 157
    :try_start_1
    invoke-virtual {v1}, Landroid/util/JsonWriter;->close()V

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :catchall_0
    invoke-virtual {v1}, Landroid/util/JsonWriter;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 162
    .line 163
    .line 164
    :catchall_1
    :goto_1
    return-void
.end method

.method private sendSnapshot(Lorg/json/JSONObject;)V
    .locals 6

    .line 1
    const-string p1, "}"

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, Lcom/tendcloud/tenddata/q$b;->mEditorConnection:Lcom/tendcloud/tenddata/j;

    .line 8
    .line 9
    invoke-virtual {v2}, Lcom/tendcloud/tenddata/j;->b()Ljava/io/BufferedOutputStream;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    new-instance v3, Ljava/io/OutputStreamWriter;

    .line 14
    .line 15
    invoke-direct {v3, v2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    .line 16
    .line 17
    .line 18
    :try_start_0
    iget-object v4, p0, Lcom/tendcloud/tenddata/q$b;->mProtocol:Lcom/tendcloud/tenddata/h;

    .line 19
    .line 20
    invoke-virtual {v4}, Lcom/tendcloud/tenddata/h;->a()Lcom/tendcloud/tenddata/s;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    iput-object v4, p0, Lcom/tendcloud/tenddata/q$b;->mSnapshot:Lcom/tendcloud/tenddata/s;

    .line 25
    .line 26
    const-string v4, "{"

    .line 27
    .line 28
    invoke-virtual {v3, v4}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v4, "\"type\": \"snapshot_response\","

    .line 32
    .line 33
    invoke-virtual {v3, v4}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v4, "\"payload\": {"

    .line 37
    .line 38
    invoke-virtual {v3, v4}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string v4, "\"serialized_objects\":"

    .line 42
    .line 43
    invoke-virtual {v3, v4}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/io/OutputStreamWriter;->flush()V

    .line 47
    .line 48
    .line 49
    iget-object v4, p0, Lcom/tendcloud/tenddata/q$b;->mSnapshot:Lcom/tendcloud/tenddata/s;

    .line 50
    .line 51
    invoke-static {}, Lcom/tendcloud/tenddata/q;->b()Lcom/tendcloud/tenddata/q;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-static {v5}, Lcom/tendcloud/tenddata/q;->c(Lcom/tendcloud/tenddata/q;)Lcom/tendcloud/tenddata/g;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-virtual {v4, v5, v2}, Lcom/tendcloud/tenddata/s;->a(Lcom/tendcloud/tenddata/g;Ljava/io/OutputStream;)V

    .line 60
    .line 61
    .line 62
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 63
    .line 64
    .line 65
    move-result-wide v4

    .line 66
    sub-long/2addr v4, v0

    .line 67
    const-string v0, ",\"snapshot_time_millis\": "

    .line 68
    .line 69
    invoke-virtual {v3, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v3, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    .line 84
    .line 85
    :try_start_1
    invoke-virtual {v3}, Ljava/io/OutputStreamWriter;->close()V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :catchall_0
    invoke-virtual {v3}, Ljava/io/OutputStreamWriter;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 90
    .line 91
    .line 92
    :catchall_1
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/q$b;->mStartLock:Ljava/util/concurrent/locks/Lock;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget v0, p1, Landroid/os/Message;->what:I

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eq v0, v1, :cond_5

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    if-eq v0, v1, :cond_4

    .line 13
    .line 14
    const/4 v1, 0x4

    .line 15
    if-eq v0, v1, :cond_3

    .line 16
    .line 17
    const/4 v1, 0x6

    .line 18
    if-eq v0, v1, :cond_2

    .line 19
    .line 20
    const/16 v1, 0x8

    .line 21
    .line 22
    if-eq v0, v1, :cond_1

    .line 23
    .line 24
    const/16 v1, 0xd

    .line 25
    .line 26
    if-eq v0, v1, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, Ljava/util/Hashtable;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Lcom/tendcloud/tenddata/q$b;->sendEvent(Ljava/util/Hashtable;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-direct {p0}, Lcom/tendcloud/tenddata/q$b;->handleEditorClosed()V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Lorg/json/JSONObject;

    .line 44
    .line 45
    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/q$b;->handleEditorBindingsReceived(Lorg/json/JSONObject;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    invoke-direct {p0}, Lcom/tendcloud/tenddata/q$b;->sendDeviceInfo()V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_4
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, Lorg/json/JSONObject;

    .line 56
    .line 57
    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/q$b;->sendSnapshot(Lorg/json/JSONObject;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_5
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p1, Ljava/lang/String;

    .line 64
    .line 65
    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/q$b;->connectToEditor(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    .line 68
    :catchall_0
    :goto_0
    iget-object p1, p0, Lcom/tendcloud/tenddata/q$b;->mStartLock:Ljava/util/concurrent/locks/Lock;

    .line 69
    .line 70
    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public sendEvent(Ljava/util/Hashtable;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Hashtable<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "id"

    .line 2
    .line 3
    iget-object v1, p0, Lcom/tendcloud/tenddata/q$b;->mEditorConnection:Lcom/tendcloud/tenddata/j;

    .line 4
    .line 5
    if-eqz v1, :cond_2

    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/j;->a()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/q$b;->mEditorConnection:Lcom/tendcloud/tenddata/j;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/j;->b()Ljava/io/BufferedOutputStream;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, Ljava/io/OutputStreamWriter;

    .line 21
    .line 22
    invoke-direct {v1, v0}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Landroid/util/JsonWriter;

    .line 26
    .line 27
    invoke-direct {v0, v1}, Landroid/util/JsonWriter;-><init>(Ljava/io/Writer;)V

    .line 28
    .line 29
    .line 30
    :try_start_0
    invoke-virtual {v0}, Landroid/util/JsonWriter;->beginObject()Landroid/util/JsonWriter;

    .line 31
    .line 32
    .line 33
    const-string v1, "type"

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const-string v2, "event_triggered_response"

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/util/Hashtable;->entrySet()Ljava/util/Set;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_1

    .line 57
    .line 58
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, Ljava/util/Map$Entry;

    .line 63
    .line 64
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    check-cast v2, Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    new-instance v3, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v1, ""

    .line 87
    .line 88
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v2, v1}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_1
    invoke-virtual {v0}, Landroid/util/JsonWriter;->endObject()Landroid/util/JsonWriter;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    .line 101
    .line 102
    :try_start_1
    invoke-virtual {v0}, Landroid/util/JsonWriter;->close()V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :catchall_0
    invoke-virtual {v0}, Landroid/util/JsonWriter;->close()V

    .line 107
    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_2
    :goto_1
    invoke-virtual {p1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {p1, v0}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 122
    .line 123
    const-wide/16 v2, 0x0

    .line 124
    .line 125
    invoke-static {v0, v1, v2, v3, p1}, Lcom/tendcloud/tenddata/TalkingDataSDK;->onEvent(Landroid/content/Context;Ljava/lang/String;DLjava/util/Map;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 126
    .line 127
    .line 128
    :catchall_1
    :goto_2
    return-void
.end method

.method public start()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/tenddata/q$b;->mStartLock:Ljava/util/concurrent/locks/Lock;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
