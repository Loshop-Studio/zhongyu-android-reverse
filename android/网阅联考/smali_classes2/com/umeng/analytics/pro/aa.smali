.class public Lcom/umeng/analytics/pro/aa;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/umeng/analytics/pro/y;
    .locals 3

    .line 1
    sget-object p0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    new-array v0, v0, [Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const-string v2, "Brand"

    .line 8
    .line 9
    aput-object v2, v0, v1

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    aput-object p0, v0, v1

    .line 13
    .line 14
    const-string v1, "Device"

    .line 15
    .line 16
    invoke-static {v1, v0}, Lcom/umeng/analytics/pro/ah;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    return-object v1

    .line 27
    :cond_0
    const-string v0, "huawei"

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_a

    .line 34
    .line 35
    const-string v0, "honor"

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_a

    .line 42
    .line 43
    const-string v0, "\u534e\u4e3a"

    .line 44
    .line 45
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    goto/16 :goto_3

    .line 52
    .line 53
    :cond_1
    const-string v0, "xiaomi"

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_9

    .line 60
    .line 61
    const-string v0, "redmi"

    .line 62
    .line 63
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_9

    .line 68
    .line 69
    const-string v0, "meitu"

    .line 70
    .line 71
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_9

    .line 76
    .line 77
    const-string v0, "\u5c0f\u7c73"

    .line 78
    .line 79
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_2

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_2
    const-string v0, "vivo"

    .line 87
    .line 88
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_3

    .line 93
    .line 94
    new-instance p0, Lcom/umeng/analytics/pro/af;

    .line 95
    .line 96
    invoke-direct {p0}, Lcom/umeng/analytics/pro/af;-><init>()V

    .line 97
    .line 98
    .line 99
    return-object p0

    .line 100
    :cond_3
    const-string v0, "oppo"

    .line 101
    .line 102
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-nez v0, :cond_8

    .line 107
    .line 108
    const-string v0, "oneplus"

    .line 109
    .line 110
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_4

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_4
    const-string v0, "lenovo"

    .line 118
    .line 119
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-nez v0, :cond_7

    .line 124
    .line 125
    const-string v0, "zuk"

    .line 126
    .line 127
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 128
    .line 129
    .line 130
    move-result p0

    .line 131
    if-eqz p0, :cond_5

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_5
    sget-object p0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 135
    .line 136
    const-string v0, "SAMSUNG"

    .line 137
    .line 138
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 139
    .line 140
    .line 141
    move-result p0

    .line 142
    if-eqz p0, :cond_6

    .line 143
    .line 144
    new-instance p0, Lcom/umeng/analytics/pro/ae;

    .line 145
    .line 146
    invoke-direct {p0}, Lcom/umeng/analytics/pro/ae;-><init>()V

    .line 147
    .line 148
    .line 149
    return-object p0

    .line 150
    :cond_6
    return-object v1

    .line 151
    :cond_7
    :goto_0
    new-instance p0, Lcom/umeng/analytics/pro/ac;

    .line 152
    .line 153
    invoke-direct {p0}, Lcom/umeng/analytics/pro/ac;-><init>()V

    .line 154
    .line 155
    .line 156
    return-object p0

    .line 157
    :cond_8
    :goto_1
    new-instance p0, Lcom/umeng/analytics/pro/ad;

    .line 158
    .line 159
    invoke-direct {p0}, Lcom/umeng/analytics/pro/ad;-><init>()V

    .line 160
    .line 161
    .line 162
    return-object p0

    .line 163
    :cond_9
    :goto_2
    new-instance p0, Lcom/umeng/analytics/pro/ag;

    .line 164
    .line 165
    invoke-direct {p0}, Lcom/umeng/analytics/pro/ag;-><init>()V

    .line 166
    .line 167
    .line 168
    return-object p0

    .line 169
    :cond_a
    :goto_3
    new-instance p0, Lcom/umeng/analytics/pro/ab;

    .line 170
    .line 171
    invoke-direct {p0}, Lcom/umeng/analytics/pro/ab;-><init>()V

    .line 172
    .line 173
    .line 174
    return-object p0
.end method
