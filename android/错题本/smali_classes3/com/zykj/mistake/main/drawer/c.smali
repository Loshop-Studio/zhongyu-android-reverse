.class public final synthetic Lcom/zykj/mistake/main/drawer/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/entity/resp/CustomTagInfo;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/entity/resp/CustomTagInfo;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/mistake/main/drawer/c;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/main/drawer/c;->b:Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lcom/zykj/mistake/main/drawer/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 7
    .line 8
    const-string v0, "it"

    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iget-object v0, p0, Lcom/zykj/mistake/main/drawer/c;->b:Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-ne p1, v0, :cond_0

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p1, 0x0

    .line 28
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1

    .line 33
    :pswitch_0
    check-cast p1, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 34
    .line 35
    const-string v0, "it"

    .line 36
    .line 37
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    iget-object v2, p0, Lcom/zykj/mistake/main/drawer/c;->b:Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 45
    .line 46
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 47
    .line 48
    .line 49
    move-result-wide v3

    .line 50
    cmp-long v0, v0, v3

    .line 51
    .line 52
    if-nez v0, :cond_1

    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-ne p1, v0, :cond_1

    .line 63
    .line 64
    const/4 p1, 0x1

    .line 65
    goto :goto_1

    .line 66
    :cond_1
    const/4 p1, 0x0

    .line 67
    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    return-object p1

    .line 72
    :pswitch_1
    check-cast p1, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 73
    .line 74
    const-string v0, "it"

    .line 75
    .line 76
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 80
    .line 81
    .line 82
    move-result-wide v0

    .line 83
    iget-object p1, p0, Lcom/zykj/mistake/main/drawer/c;->b:Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 84
    .line 85
    invoke-virtual {p1}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 86
    .line 87
    .line 88
    move-result-wide v2

    .line 89
    cmp-long p1, v0, v2

    .line 90
    .line 91
    if-nez p1, :cond_2

    .line 92
    .line 93
    const/4 p1, 0x1

    .line 94
    goto :goto_2

    .line 95
    :cond_2
    const/4 p1, 0x0

    .line 96
    :goto_2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    return-object p1

    .line 101
    :pswitch_2
    move-object v0, p1

    .line 102
    check-cast v0, Lcom/zykj/mistake/main/p;

    .line 103
    .line 104
    const-string p1, "draft"

    .line 105
    .line 106
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    iget-object p1, v0, Lcom/zykj/mistake/main/p;->l:Ljava/util/List;

    .line 110
    .line 111
    invoke-static {p1}, Lkotlin/collections/t;->E0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 112
    .line 113
    .line 114
    move-result-object v12

    .line 115
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    iget-object v1, p0, Lcom/zykj/mistake/main/drawer/c;->b:Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 120
    .line 121
    if-eqz p1, :cond_3

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_3
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    const/4 v2, 0x0

    .line 129
    :cond_4
    if-ge v2, p1, :cond_5

    .line 130
    .line 131
    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    add-int/lit8 v2, v2, 0x1

    .line 136
    .line 137
    check-cast v3, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 138
    .line 139
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 140
    .line 141
    .line 142
    move-result-wide v3

    .line 143
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 144
    .line 145
    .line 146
    move-result-wide v5

    .line 147
    cmp-long v3, v3, v5

    .line 148
    .line 149
    if-nez v3, :cond_4

    .line 150
    .line 151
    new-instance p1, Lcom/zykj/mistake/main/drawer/c;

    .line 152
    .line 153
    const/4 v2, 0x1

    .line 154
    invoke-direct {p1, v1, v2}, Lcom/zykj/mistake/main/drawer/c;-><init>(Lcom/zykj/mistake/entity/resp/CustomTagInfo;I)V

    .line 155
    .line 156
    .line 157
    invoke-static {v12, p1}, Lkotlin/collections/y;->Z(Ljava/util/List;Lr6/c;)V

    .line 158
    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_5
    :goto_3
    invoke-virtual {v12, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    :goto_4
    const/4 v11, 0x0

    .line 165
    const/16 v13, 0x7ff

    .line 166
    .line 167
    const/4 v1, 0x0

    .line 168
    const/4 v2, 0x0

    .line 169
    const/4 v3, 0x0

    .line 170
    const/4 v4, 0x0

    .line 171
    const/4 v5, 0x0

    .line 172
    const/4 v6, 0x0

    .line 173
    const/4 v7, 0x0

    .line 174
    const/4 v8, 0x0

    .line 175
    const/4 v9, 0x0

    .line 176
    const/4 v10, 0x0

    .line 177
    invoke-static/range {v0 .. v13}, Lcom/zykj/mistake/main/p;->a(Lcom/zykj/mistake/main/p;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/util/List;I)Lcom/zykj/mistake/main/p;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    return-object p1

    .line 182
    nop

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
