.class public Lr5/d1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/util/List;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr5/d1;->a:Ljava/util/List;

    .line 5
    .line 6
    iput-object p2, p0, Lr5/d1;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lr5/d1;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lr5/d1;->d:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a()V
    .locals 13

    .line 1
    iget-object v0, p0, Lr5/d1;->c:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "_default_config_tag"

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_6

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v2, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance v3, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    new-instance v4, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    iget-object v5, p0, Lr5/d1;->a:Ljava/util/List;

    .line 32
    .line 33
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    const-string v7, "diffprivacy"

    .line 42
    .line 43
    const-string v8, "preins"

    .line 44
    .line 45
    const-string v9, "maint"

    .line 46
    .line 47
    const-string v10, "oper"

    .line 48
    .line 49
    if-eqz v6, :cond_5

    .line 50
    .line 51
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    check-cast v6, Lr5/f;

    .line 56
    .line 57
    invoke-virtual {v6}, Lr5/f;->f()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v11

    .line 61
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 62
    .line 63
    .line 64
    move-result v12

    .line 65
    if-nez v12, :cond_4

    .line 66
    .line 67
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v10

    .line 71
    if-eqz v10, :cond_1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v9

    .line 78
    if-eqz v9, :cond_2

    .line 79
    .line 80
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    if-eqz v8, :cond_3

    .line 89
    .line 90
    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_3
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    if-eqz v7, :cond_0

    .line 99
    .line 100
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_4
    :goto_1
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_5
    invoke-virtual {p0, v4, v10, v1}, Lr5/d1;->b(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0, v0, v9, v1}, Lr5/d1;->b(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0, v2, v8, v1}, Lr5/d1;->b(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0, v3, v7, v1}, Lr5/d1;->b(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :cond_6
    iget-object v0, p0, Lr5/d1;->a:Ljava/util/List;

    .line 122
    .line 123
    iget-object v1, p0, Lr5/d1;->c:Ljava/lang/String;

    .line 124
    .line 125
    iget-object v2, p0, Lr5/d1;->b:Ljava/lang/String;

    .line 126
    .line 127
    invoke-virtual {p0, v0, v1, v2}, Lr5/d1;->b(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    return-void
.end method

.method public final b(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    .locals 12

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_3

    .line 8
    .line 9
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    div-int/lit16 v0, v0, 0x1f4

    .line 14
    .line 15
    add-int/lit8 v0, v0, 0x1

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    :goto_0
    if-ge v1, v0, :cond_4

    .line 19
    .line 20
    mul-int/lit16 v2, v1, 0x1f4

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    add-int/lit16 v4, v2, 0x1f4

    .line 27
    .line 28
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    invoke-interface {p1, v2, v3}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    const-string v4, "-"

    .line 45
    .line 46
    const-string v5, ""

    .line 47
    .line 48
    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v11

    .line 52
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 53
    .line 54
    .line 55
    move-result-wide v3

    .line 56
    invoke-static {p3, p2}, Lr5/c;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    int-to-long v5, v5

    .line 61
    const-wide/32 v7, 0x5265c00

    .line 62
    .line 63
    .line 64
    mul-long/2addr v5, v7

    .line 65
    new-instance v10, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    if-eqz v7, :cond_2

    .line 79
    .line 80
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    check-cast v7, Lr5/f;

    .line 85
    .line 86
    invoke-virtual {v7}, Lr5/f;->d()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    invoke-static {v8, v3, v4, v5, v6}, Lr5/h;->d(Ljava/lang/String;JJ)Z

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    if-nez v8, :cond_1

    .line 95
    .line 96
    invoke-interface {v10, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_2
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-lez v2, :cond_3

    .line 105
    .line 106
    new-instance v6, Lr5/h0;

    .line 107
    .line 108
    iget-object v9, p0, Lr5/d1;->d:Ljava/lang/String;

    .line 109
    .line 110
    move-object v8, p2

    .line 111
    move-object v7, p3

    .line 112
    invoke-direct/range {v6 .. v11}, Lr5/h0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v6}, Lr5/h0;->b()V

    .line 116
    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_3
    move-object v8, p2

    .line 120
    move-object v7, p3

    .line 121
    const-string p2, "hmsSdk"

    .line 122
    .line 123
    const-string p3, "No data to report handler"

    .line 124
    .line 125
    invoke-static {p2, p3}, Lr5/f1;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 129
    .line 130
    move-object p3, v7

    .line 131
    move-object p2, v8

    .line 132
    goto :goto_0

    .line 133
    :cond_4
    :goto_3
    return-void
.end method
