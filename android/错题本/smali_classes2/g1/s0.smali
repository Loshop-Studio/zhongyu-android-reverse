.class public Lg1/s0;
.super Lcom/google/gson/p;
.source "SourceFile"


# direct methods
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
.method public final b(Ll1/a;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-virtual {p1}, Ll1/a;->x()Lcom/google/gson/stream/JsonToken;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/google/gson/stream/JsonToken;->NULL:Lcom/google/gson/stream/JsonToken;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Ll1/a;->t()V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-virtual {p1}, Ll1/a;->b()V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    move v2, v0

    .line 19
    move v3, v2

    .line 20
    move v4, v3

    .line 21
    move v5, v4

    .line 22
    move v6, v5

    .line 23
    move v7, v6

    .line 24
    :goto_0
    invoke-virtual {p1}, Ll1/a;->x()Lcom/google/gson/stream/JsonToken;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    sget-object v8, Lcom/google/gson/stream/JsonToken;->END_OBJECT:Lcom/google/gson/stream/JsonToken;

    .line 29
    .line 30
    if-eq v1, v8, :cond_7

    .line 31
    .line 32
    invoke-virtual {p1}, Ll1/a;->r()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {p1}, Ll1/a;->p()I

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 44
    .line 45
    .line 46
    move-result v9

    .line 47
    const/4 v10, -0x1

    .line 48
    sparse-switch v9, :sswitch_data_0

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :sswitch_0
    const-string v9, "hourOfDay"

    .line 53
    .line 54
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-nez v1, :cond_1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    const/4 v10, 0x5

    .line 62
    goto :goto_1

    .line 63
    :sswitch_1
    const-string v9, "month"

    .line 64
    .line 65
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-nez v1, :cond_2

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    const/4 v10, 0x4

    .line 73
    goto :goto_1

    .line 74
    :sswitch_2
    const-string/jumbo v9, "year"

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-nez v1, :cond_3

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    const/4 v10, 0x3

    .line 85
    goto :goto_1

    .line 86
    :sswitch_3
    const-string/jumbo v9, "second"

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez v1, :cond_4

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_4
    const/4 v10, 0x2

    .line 97
    goto :goto_1

    .line 98
    :sswitch_4
    const-string v9, "minute"

    .line 99
    .line 100
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-nez v1, :cond_5

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_5
    const/4 v10, 0x1

    .line 108
    goto :goto_1

    .line 109
    :sswitch_5
    const-string v9, "dayOfMonth"

    .line 110
    .line 111
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-nez v1, :cond_6

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_6
    move v10, v0

    .line 119
    :goto_1
    packed-switch v10, :pswitch_data_0

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :pswitch_0
    move v5, v8

    .line 124
    goto :goto_0

    .line 125
    :pswitch_1
    move v3, v8

    .line 126
    goto :goto_0

    .line 127
    :pswitch_2
    move v2, v8

    .line 128
    goto :goto_0

    .line 129
    :pswitch_3
    move v7, v8

    .line 130
    goto :goto_0

    .line 131
    :pswitch_4
    move v6, v8

    .line 132
    goto :goto_0

    .line 133
    :pswitch_5
    move v4, v8

    .line 134
    goto :goto_0

    .line 135
    :cond_7
    invoke-virtual {p1}, Ll1/a;->f()V

    .line 136
    .line 137
    .line 138
    new-instance v1, Ljava/util/GregorianCalendar;

    .line 139
    .line 140
    invoke-direct/range {v1 .. v7}, Ljava/util/GregorianCalendar;-><init>(IIIIII)V

    .line 141
    .line 142
    .line 143
    return-object v1

    .line 144
    nop

    .line 145
    :sswitch_data_0
    .sparse-switch
        -0x4667c053 -> :sswitch_5
        -0x400459ec -> :sswitch_4
        -0x3604bb8c -> :sswitch_3
        0x38883d -> :sswitch_2
        0x6342280 -> :sswitch_1
        0x3ab9c2c1 -> :sswitch_0
    .end sparse-switch

    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Ll1/b;Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p2, Ljava/util/Calendar;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Ll1/b;->k()Ll1/b;

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p1}, Ll1/b;->c()V

    .line 10
    .line 11
    .line 12
    const-string/jumbo v0, "year"

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Ll1/b;->g(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    int-to-long v0, v0

    .line 24
    invoke-virtual {p1, v0, v1}, Ll1/b;->q(J)V

    .line 25
    .line 26
    .line 27
    const-string v0, "month"

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ll1/b;->g(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x2

    .line 33
    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    int-to-long v0, v0

    .line 38
    invoke-virtual {p1, v0, v1}, Ll1/b;->q(J)V

    .line 39
    .line 40
    .line 41
    const-string v0, "dayOfMonth"

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Ll1/b;->g(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x5

    .line 47
    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    int-to-long v0, v0

    .line 52
    invoke-virtual {p1, v0, v1}, Ll1/b;->q(J)V

    .line 53
    .line 54
    .line 55
    const-string v0, "hourOfDay"

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Ll1/b;->g(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const/16 v0, 0xb

    .line 61
    .line 62
    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    int-to-long v0, v0

    .line 67
    invoke-virtual {p1, v0, v1}, Ll1/b;->q(J)V

    .line 68
    .line 69
    .line 70
    const-string v0, "minute"

    .line 71
    .line 72
    invoke-virtual {p1, v0}, Ll1/b;->g(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const/16 v0, 0xc

    .line 76
    .line 77
    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    int-to-long v0, v0

    .line 82
    invoke-virtual {p1, v0, v1}, Ll1/b;->q(J)V

    .line 83
    .line 84
    .line 85
    const-string/jumbo v0, "second"

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, v0}, Ll1/b;->g(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    const/16 v0, 0xd

    .line 92
    .line 93
    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    int-to-long v0, p2

    .line 98
    invoke-virtual {p1, v0, v1}, Ll1/b;->q(J)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Ll1/b;->f()V

    .line 102
    .line 103
    .line 104
    return-void
.end method
