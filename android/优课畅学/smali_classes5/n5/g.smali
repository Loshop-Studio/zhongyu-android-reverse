.class public abstract Ln5/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lcom/tencent/rtmp/TXBitrateItem;I)Lj5/g;
    .locals 2

    .line 1
    new-instance v0, Lj5/g;

    .line 2
    .line 3
    invoke-direct {v0}, Lj5/g;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lcom/tencent/rtmp/TXBitrateItem;->bitrate:I

    .line 7
    .line 8
    iput v1, v0, Lj5/g;->b:I

    .line 9
    .line 10
    iget p0, p0, Lcom/tencent/rtmp/TXBitrateItem;->index:I

    .line 11
    .line 12
    iput p0, v0, Lj5/g;->a:I

    .line 13
    .line 14
    packed-switch p1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_0
    const-string p0, "8K"

    .line 19
    .line 20
    iput-object p0, v0, Lj5/g;->c:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p0, v0, Lj5/g;->d:Ljava/lang/String;

    .line 23
    .line 24
    return-object v0

    .line 25
    :pswitch_1
    const-string p0, "4K"

    .line 26
    .line 27
    iput-object p0, v0, Lj5/g;->c:Ljava/lang/String;

    .line 28
    .line 29
    iput-object p0, v0, Lj5/g;->d:Ljava/lang/String;

    .line 30
    .line 31
    return-object v0

    .line 32
    :pswitch_2
    const-string p0, "2K"

    .line 33
    .line 34
    iput-object p0, v0, Lj5/g;->c:Ljava/lang/String;

    .line 35
    .line 36
    iput-object p0, v0, Lj5/g;->d:Ljava/lang/String;

    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_3
    const-string p0, "FHD"

    .line 40
    .line 41
    iput-object p0, v0, Lj5/g;->c:Ljava/lang/String;

    .line 42
    .line 43
    const-string p0, "\u8d85\u6e05"

    .line 44
    .line 45
    iput-object p0, v0, Lj5/g;->d:Ljava/lang/String;

    .line 46
    .line 47
    return-object v0

    .line 48
    :pswitch_4
    const-string p0, "HD"

    .line 49
    .line 50
    iput-object p0, v0, Lj5/g;->c:Ljava/lang/String;

    .line 51
    .line 52
    const-string p0, "\u9ad8\u6e05"

    .line 53
    .line 54
    iput-object p0, v0, Lj5/g;->d:Ljava/lang/String;

    .line 55
    .line 56
    return-object v0

    .line 57
    :pswitch_5
    const-string p0, "SD"

    .line 58
    .line 59
    iput-object p0, v0, Lj5/g;->c:Ljava/lang/String;

    .line 60
    .line 61
    const-string p0, "\u6807\u6e05"

    .line 62
    .line 63
    iput-object p0, v0, Lj5/g;->d:Ljava/lang/String;

    .line 64
    .line 65
    return-object v0

    .line 66
    :pswitch_6
    const-string p0, "FLU"

    .line 67
    .line 68
    iput-object p0, v0, Lj5/g;->c:Ljava/lang/String;

    .line 69
    .line 70
    const-string p0, "\u6d41\u7545"

    .line 71
    .line 72
    iput-object p0, v0, Lj5/g;->d:Ljava/lang/String;

    .line 73
    .line 74
    return-object v0

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static b(Lcom/tencent/rtmp/TXBitrateItem;Ljava/util/List;)Lj5/g;
    .locals 6

    .line 1
    new-instance v0, Lj5/g;

    .line 2
    .line 3
    invoke-direct {v0}, Lj5/g;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lcom/tencent/rtmp/TXBitrateItem;->bitrate:I

    .line 7
    .line 8
    iput v1, v0, Lj5/g;->b:I

    .line 9
    .line 10
    iget v1, p0, Lcom/tencent/rtmp/TXBitrateItem;->index:I

    .line 11
    .line 12
    iput v1, v0, Lj5/g;->a:I

    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_3

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Lj5/e;

    .line 29
    .line 30
    iget v2, v1, Lj5/e;->c:I

    .line 31
    .line 32
    iget v3, p0, Lcom/tencent/rtmp/TXBitrateItem;->width:I

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget v4, v1, Lj5/e;->d:I

    .line 37
    .line 38
    iget v5, p0, Lcom/tencent/rtmp/TXBitrateItem;->height:I

    .line 39
    .line 40
    if-eq v4, v5, :cond_2

    .line 41
    .line 42
    :cond_1
    iget v4, p0, Lcom/tencent/rtmp/TXBitrateItem;->height:I

    .line 43
    .line 44
    if-ne v2, v4, :cond_0

    .line 45
    .line 46
    iget v2, v1, Lj5/e;->d:I

    .line 47
    .line 48
    if-ne v2, v3, :cond_0

    .line 49
    .line 50
    :cond_2
    const-string v2, "video"

    .line 51
    .line 52
    iget-object v3, v1, Lj5/e;->b:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_0

    .line 59
    .line 60
    iget-object p0, v1, Lj5/e;->a:Ljava/lang/String;

    .line 61
    .line 62
    iput-object p0, v0, Lj5/g;->d:Ljava/lang/String;

    .line 63
    .line 64
    return-object v0

    .line 65
    :cond_3
    const-string p0, "TCVideoQualityUtil"

    .line 66
    .line 67
    const-string p1, "error: could not get quality name!"

    .line 68
    .line 69
    invoke-static {p0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-object v0
.end method

.method public static c(Lj5/c;)Lj5/g;
    .locals 2

    .line 1
    new-instance v0, Lj5/g;

    .line 2
    .line 3
    invoke-direct {v0}, Lj5/g;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lj5/c;->a()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    iput v1, v0, Lj5/g;->b:I

    .line 11
    .line 12
    iget-object v1, p0, Lj5/c;->g:Ljava/lang/String;

    .line 13
    .line 14
    iput-object v1, v0, Lj5/g;->c:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v1, p0, Lj5/c;->h:Ljava/lang/String;

    .line 17
    .line 18
    iput-object v1, v0, Lj5/g;->d:Ljava/lang/String;

    .line 19
    .line 20
    iget-object p0, p0, Lj5/c;->i:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p0, v0, Lj5/g;->e:Ljava/lang/String;

    .line 23
    .line 24
    const/4 p0, -0x1

    .line 25
    iput p0, v0, Lj5/g;->a:I

    .line 26
    .line 27
    return-object v0
.end method

.method public static d(Lj5/c;Ljava/lang/String;)Lj5/g;
    .locals 3

    .line 1
    new-instance v0, Lj5/g;

    .line 2
    .line 3
    invoke-direct {v0}, Lj5/g;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lj5/c;->a()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    iput v1, v0, Lj5/g;->b:I

    .line 11
    .line 12
    const-string v1, "FLU"

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    iput-object v1, v0, Lj5/g;->c:Ljava/lang/String;

    .line 21
    .line 22
    const-string p1, "\u6d41\u7545"

    .line 23
    .line 24
    iput-object p1, v0, Lj5/g;->d:Ljava/lang/String;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string v1, "SD"

    .line 28
    .line 29
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    iput-object v1, v0, Lj5/g;->c:Ljava/lang/String;

    .line 36
    .line 37
    const-string p1, "\u6807\u6e05"

    .line 38
    .line 39
    iput-object p1, v0, Lj5/g;->d:Ljava/lang/String;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const-string v1, "HD"

    .line 43
    .line 44
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    iput-object v1, v0, Lj5/g;->c:Ljava/lang/String;

    .line 51
    .line 52
    const-string p1, "\u9ad8\u6e05"

    .line 53
    .line 54
    iput-object p1, v0, Lj5/g;->d:Ljava/lang/String;

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    const-string v1, "FHD"

    .line 58
    .line 59
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_3

    .line 64
    .line 65
    iput-object v1, v0, Lj5/g;->c:Ljava/lang/String;

    .line 66
    .line 67
    const-string p1, "\u5168\u9ad8\u6e05"

    .line 68
    .line 69
    iput-object p1, v0, Lj5/g;->d:Ljava/lang/String;

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    const-string v1, "2K"

    .line 73
    .line 74
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_4

    .line 79
    .line 80
    iput-object v1, v0, Lj5/g;->c:Ljava/lang/String;

    .line 81
    .line 82
    iput-object v1, v0, Lj5/g;->d:Ljava/lang/String;

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_4
    const-string v1, "4K"

    .line 86
    .line 87
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_5

    .line 92
    .line 93
    iput-object v1, v0, Lj5/g;->c:Ljava/lang/String;

    .line 94
    .line 95
    iput-object v1, v0, Lj5/g;->d:Ljava/lang/String;

    .line 96
    .line 97
    :cond_5
    :goto_0
    iget-object p0, p0, Lj5/c;->i:Ljava/lang/String;

    .line 98
    .line 99
    iput-object p0, v0, Lj5/g;->e:Ljava/lang/String;

    .line 100
    .line 101
    const/4 p0, -0x1

    .line 102
    iput p0, v0, Lj5/g;->a:I

    .line 103
    .line 104
    return-object v0
.end method

.method public static e(Ljava/util/HashMap;)Ljava/util/List;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lj5/c;

    .line 31
    .line 32
    invoke-static {v2}, Ln5/g;->c(Lj5/c;)Lj5/g;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    return-object v0
.end method
