# RE note 本类字节码直接引用的读写或显示接口包括JSON。
.class public final Lcom/zykj/evaluation/di/converter/UploadDataConverter;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
# RE I/O 读取 JSON（Gson.fromJson）。
.method public final a(Ljava/lang/String;)Lcom/zykj/evaluation/bean/UploadData;
    .locals 15

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v6

    .line 7
    :cond_0
    const-string v1, "\"a\":"

    .line 8
    .line 9
    const/4 v7, 0x0

    .line 10
    const/4 v8, 0x2

    .line 11
    invoke-static {v0, v1, v7, v8, v6}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    const-string v1, "\"b\":"

    .line 18
    .line 19
    invoke-static {v0, v1, v7, v8, v6}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    const/4 v4, 0x4

    .line 26
    const/4 v5, 0x0

    .line 27
    const-string v1, "\"a\":"

    .line 28
    .line 29
    const-string v2, "\"uuid\":"

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v9

    .line 36
    const/4 v13, 0x4

    .line 37
    const/4 v14, 0x0

    .line 38
    const-string v10, "\"b\":"

    .line 39
    .line 40
    const-string v11, "\"localPath\":"

    .line 41
    .line 42
    const/4 v12, 0x0

    .line 43
    invoke-static/range {v9 .. v14}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v1, "\"e\":"

    .line 48
    .line 49
    invoke-static {v0, v1, v7, v8, v6}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_1

    .line 54
    .line 55
    const/4 v4, 0x4

    .line 56
    const/4 v5, 0x0

    .line 57
    const-string v1, "\"d\":"

    .line 58
    .line 59
    const-string v2, "\"uploadUrl\":"

    .line 60
    .line 61
    const/4 v3, 0x0

    .line 62
    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    const/4 v10, 0x4

    .line 67
    const/4 v11, 0x0

    .line 68
    const-string v7, "\"e\":"

    .line 69
    .line 70
    const-string v8, "\"commitState\":"

    .line 71
    .line 72
    const/4 v9, 0x0

    .line 73
    invoke-static/range {v6 .. v11}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    goto :goto_0

    .line 78
    :cond_1
    const/4 v4, 0x4

    .line 79
    const/4 v5, 0x0

    .line 80
    const-string v1, "\"c\":"

    .line 81
    .line 82
    const-string v2, "\"uploadUrl\":"

    .line 83
    .line 84
    const/4 v3, 0x0

    .line 85
    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    const/4 v10, 0x4

    .line 90
    const/4 v11, 0x0

    .line 91
    const-string v7, "\"d\":"

    .line 92
    .line 93
    const-string v8, "\"commitState\":"

    .line 94
    .line 95
    const/4 v9, 0x0

    .line 96
    invoke-static/range {v6 .. v11}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    goto :goto_0

    .line 101
    :cond_2
    move-object/from16 v0, p1

    .line 102
    .line 103
    :goto_0
    new-instance v1, Lcom/google/gson/Gson;

    .line 104
    .line 105
    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    .line 106
    .line 107
    .line 108
    const-class v2, Lcom/zykj/evaluation/bean/UploadData;

    .line 109
    .line 110
    invoke-virtual {v1, v0, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    check-cast v0, Lcom/zykj/evaluation/bean/UploadData;

    .line 115
    .line 116
    return-object v0
.end method

# RE I/O 读取 JSON（Gson.fromJson）。
.method public final b(Ljava/lang/String;)Ljava/util/List;
    .locals 15

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v6

    .line 7
    :cond_0
    const-string v1, "\"a\":"

    .line 8
    .line 9
    const/4 v7, 0x0

    .line 10
    const/4 v8, 0x2

    .line 11
    invoke-static {v0, v1, v7, v8, v6}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    const-string v1, "\"b\":"

    .line 18
    .line 19
    invoke-static {v0, v1, v7, v8, v6}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    const/4 v4, 0x4

    .line 26
    const/4 v5, 0x0

    .line 27
    const-string v1, "\"a\":"

    .line 28
    .line 29
    const-string v2, "\"uuid\":"

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v9

    .line 36
    const/4 v13, 0x4

    .line 37
    const/4 v14, 0x0

    .line 38
    const-string v10, "\"b\":"

    .line 39
    .line 40
    const-string v11, "\"localPath\":"

    .line 41
    .line 42
    const/4 v12, 0x0

    .line 43
    invoke-static/range {v9 .. v14}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v1, "\"e\":"

    .line 48
    .line 49
    invoke-static {v0, v1, v7, v8, v6}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_1

    .line 54
    .line 55
    const/4 v4, 0x4

    .line 56
    const/4 v5, 0x0

    .line 57
    const-string v1, "\"d\":"

    .line 58
    .line 59
    const-string v2, "\"uploadUrl\":"

    .line 60
    .line 61
    const/4 v3, 0x0

    .line 62
    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    const/4 v10, 0x4

    .line 67
    const/4 v11, 0x0

    .line 68
    const-string v7, "\"e\":"

    .line 69
    .line 70
    const-string v8, "\"commitState\":"

    .line 71
    .line 72
    const/4 v9, 0x0

    .line 73
    invoke-static/range {v6 .. v11}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    goto :goto_0

    .line 78
    :cond_1
    const/4 v4, 0x4

    .line 79
    const/4 v5, 0x0

    .line 80
    const-string v1, "\"c\":"

    .line 81
    .line 82
    const-string v2, "\"uploadUrl\":"

    .line 83
    .line 84
    const/4 v3, 0x0

    .line 85
    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    const/4 v10, 0x4

    .line 90
    const/4 v11, 0x0

    .line 91
    const-string v7, "\"d\":"

    .line 92
    .line 93
    const-string v8, "\"commitState\":"

    .line 94
    .line 95
    const/4 v9, 0x0

    .line 96
    invoke-static/range {v6 .. v11}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    goto :goto_0

    .line 101
    :cond_2
    move-object/from16 v0, p1

    .line 102
    .line 103
    :goto_0
    new-instance v1, Lcom/google/gson/Gson;

    .line 104
    .line 105
    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    .line 106
    .line 107
    .line 108
    new-instance v2, Lcom/zykj/evaluation/di/converter/UploadDataConverter$stringToUploadDataList$1;

    .line 109
    .line 110
    invoke-direct {v2}, Lcom/zykj/evaluation/di/converter/UploadDataConverter$stringToUploadDataList$1;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-virtual {v1, v0, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    check-cast v0, Ljava/util/List;

    .line 122
    .line 123
    return-object v0
.end method

# RE I/O 写入 JSON（Gson.toJson）。
.method public final c(Ljava/util/List;)Ljava/lang/String;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Lcom/google/gson/Gson;

    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return-object p1
.end method

# RE I/O 写入 JSON（Gson.toJson）。
.method public final d(Lcom/zykj/evaluation/bean/UploadData;)Ljava/lang/String;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Lcom/google/gson/Gson;

    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return-object p1
.end method
