.class public abstract Lcom/liulishuo/okdownload/StatusUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/liulishuo/okdownload/StatusUtil$Status;
    }
.end annotation


# direct methods
.method public static a(Lcom/liulishuo/okdownload/a;)Z
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/liulishuo/okdownload/StatusUtil;->b(Lcom/liulishuo/okdownload/a;)Lcom/liulishuo/okdownload/StatusUtil$Status;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lcom/liulishuo/okdownload/StatusUtil$Status;->c:Lcom/liulishuo/okdownload/StatusUtil$Status;

    .line 6
    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public static b(Lcom/liulishuo/okdownload/a;)Lcom/liulishuo/okdownload/StatusUtil$Status;
    .locals 9

    .line 1
    invoke-static {}, Lq1/d;->k()Lq1/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lq1/d;->a()Ls1/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Lcom/liulishuo/okdownload/a;->c()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-interface {v0, v1}, Ls1/f;->get(I)Ls1/c;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p0}, Lcom/liulishuo/okdownload/a;->b()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {p0}, Lcom/liulishuo/okdownload/a;->d()Ljava/io/File;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {p0}, Lcom/liulishuo/okdownload/a;->l()Ljava/io/File;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    if-eqz v1, :cond_3

    .line 30
    .line 31
    invoke-virtual {v1}, Ls1/c;->m()Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-nez p0, :cond_0

    .line 36
    .line 37
    invoke-virtual {v1}, Ls1/c;->j()J

    .line 38
    .line 39
    .line 40
    move-result-wide v5

    .line 41
    const-wide/16 v7, 0x0

    .line 42
    .line 43
    cmp-long p0, v5, v7

    .line 44
    .line 45
    if-gtz p0, :cond_0

    .line 46
    .line 47
    sget-object p0, Lcom/liulishuo/okdownload/StatusUtil$Status;->e:Lcom/liulishuo/okdownload/StatusUtil$Status;

    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_0
    if-eqz v4, :cond_1

    .line 51
    .line 52
    invoke-virtual {v1}, Ls1/c;->f()Ljava/io/File;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {v4, p0}, Ljava/io/File;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    if-eqz p0, :cond_1

    .line 61
    .line 62
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-eqz p0, :cond_1

    .line 67
    .line 68
    invoke-virtual {v1}, Ls1/c;->k()J

    .line 69
    .line 70
    .line 71
    move-result-wide v5

    .line 72
    invoke-virtual {v1}, Ls1/c;->j()J

    .line 73
    .line 74
    .line 75
    move-result-wide v7

    .line 76
    cmp-long p0, v5, v7

    .line 77
    .line 78
    if-nez p0, :cond_1

    .line 79
    .line 80
    sget-object p0, Lcom/liulishuo/okdownload/StatusUtil$Status;->c:Lcom/liulishuo/okdownload/StatusUtil$Status;

    .line 81
    .line 82
    return-object p0

    .line 83
    :cond_1
    if-nez v2, :cond_2

    .line 84
    .line 85
    invoke-virtual {v1}, Ls1/c;->f()Ljava/io/File;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    if-eqz p0, :cond_2

    .line 90
    .line 91
    invoke-virtual {v1}, Ls1/c;->f()Ljava/io/File;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    if-eqz p0, :cond_2

    .line 100
    .line 101
    sget-object p0, Lcom/liulishuo/okdownload/StatusUtil$Status;->d:Lcom/liulishuo/okdownload/StatusUtil$Status;

    .line 102
    .line 103
    return-object p0

    .line 104
    :cond_2
    if-eqz v4, :cond_6

    .line 105
    .line 106
    invoke-virtual {v1}, Ls1/c;->f()Ljava/io/File;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-virtual {v4, p0}, Ljava/io/File;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    if-eqz p0, :cond_6

    .line 115
    .line 116
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    if-eqz p0, :cond_6

    .line 121
    .line 122
    sget-object p0, Lcom/liulishuo/okdownload/StatusUtil$Status;->d:Lcom/liulishuo/okdownload/StatusUtil$Status;

    .line 123
    .line 124
    return-object p0

    .line 125
    :cond_3
    invoke-interface {v0}, Ls1/f;->l()Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-nez v1, :cond_7

    .line 130
    .line 131
    invoke-virtual {p0}, Lcom/liulishuo/okdownload/a;->c()I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    invoke-interface {v0, v1}, Ls1/f;->e(I)Z

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    if-eqz v1, :cond_4

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_4
    if-eqz v4, :cond_5

    .line 143
    .line 144
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-eqz v1, :cond_5

    .line 149
    .line 150
    sget-object p0, Lcom/liulishuo/okdownload/StatusUtil$Status;->c:Lcom/liulishuo/okdownload/StatusUtil$Status;

    .line 151
    .line 152
    return-object p0

    .line 153
    :cond_5
    invoke-virtual {p0}, Lcom/liulishuo/okdownload/a;->f()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    invoke-interface {v0, p0}, Ls1/f;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    if-eqz p0, :cond_6

    .line 162
    .line 163
    new-instance v0, Ljava/io/File;

    .line 164
    .line 165
    invoke-direct {v0, v3, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 169
    .line 170
    .line 171
    move-result p0

    .line 172
    if-eqz p0, :cond_6

    .line 173
    .line 174
    sget-object p0, Lcom/liulishuo/okdownload/StatusUtil$Status;->c:Lcom/liulishuo/okdownload/StatusUtil$Status;

    .line 175
    .line 176
    return-object p0

    .line 177
    :cond_6
    sget-object p0, Lcom/liulishuo/okdownload/StatusUtil$Status;->e:Lcom/liulishuo/okdownload/StatusUtil$Status;

    .line 178
    .line 179
    return-object p0

    .line 180
    :cond_7
    :goto_0
    sget-object p0, Lcom/liulishuo/okdownload/StatusUtil$Status;->e:Lcom/liulishuo/okdownload/StatusUtil$Status;

    .line 181
    .line 182
    return-object p0
.end method
