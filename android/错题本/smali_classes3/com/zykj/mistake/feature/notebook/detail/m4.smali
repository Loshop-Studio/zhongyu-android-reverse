.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/m4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr6/c;


# direct methods
.method public synthetic constructor <init>(Lr6/c;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/mistake/feature/notebook/detail/m4;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/m4;->b:Lr6/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/notebook/detail/m4;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/m4;->b:Lr6/c;

    .line 7
    .line 8
    check-cast p1, Landroid/net/Uri;

    .line 9
    .line 10
    invoke-static {v0, p1}, Lcom/zykj/view/utils/ImagePicker;->f(Lr6/c;Landroid/net/Uri;)Ld6/s;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    new-instance v0, Lcom/zykj/mistake/main/drawer/a;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-direct {v0, p1, v1}, Lcom/zykj/mistake/main/drawer/a;-><init>(II)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/m4;->b:Lr6/c;

    .line 28
    .line 29
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 33
    .line 34
    return-object p1

    .line 35
    :pswitch_1
    check-cast p1, Ljava/lang/Integer;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    new-instance v0, Lcom/zykj/mistake/main/drawer/a;

    .line 42
    .line 43
    const/4 v1, 0x2

    .line 44
    invoke-direct {v0, p1, v1}, Lcom/zykj/mistake/main/drawer/a;-><init>(II)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/m4;->b:Lr6/c;

    .line 48
    .line 49
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 53
    .line 54
    return-object p1

    .line 55
    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    new-instance v0, Lcom/zykj/mistake/main/drawer/a;

    .line 62
    .line 63
    const/4 v1, 0x1

    .line 64
    invoke-direct {v0, p1, v1}, Lcom/zykj/mistake/main/drawer/a;-><init>(II)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/m4;->b:Lr6/c;

    .line 68
    .line 69
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 73
    .line 74
    return-object p1

    .line 75
    :pswitch_3
    check-cast p1, Ljava/lang/Long;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 78
    .line 79
    .line 80
    move-result-wide v0

    .line 81
    new-instance p1, Lcom/zykj/mistake/feature/notebook/list/h;

    .line 82
    .line 83
    const/4 v2, 0x1

    .line 84
    invoke-direct {p1, v0, v1, v2}, Lcom/zykj/mistake/feature/notebook/list/h;-><init>(JI)V

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/m4;->b:Lr6/c;

    .line 88
    .line 89
    invoke-interface {v0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 93
    .line 94
    return-object p1

    .line 95
    :pswitch_4
    check-cast p1, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 96
    .line 97
    const-string v0, "tag"

    .line 98
    .line 99
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    new-instance v0, Lcom/zykj/mistake/main/drawer/c;

    .line 103
    .line 104
    const/4 v1, 0x0

    .line 105
    invoke-direct {v0, p1, v1}, Lcom/zykj/mistake/main/drawer/c;-><init>(Lcom/zykj/mistake/entity/resp/CustomTagInfo;I)V

    .line 106
    .line 107
    .line 108
    iget-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/m4;->b:Lr6/c;

    .line 109
    .line 110
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 114
    .line 115
    return-object p1

    .line 116
    :pswitch_5
    check-cast p1, Ljava/lang/String;

    .line 117
    .line 118
    const-string v0, "it"

    .line 119
    .line 120
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    new-instance v0, Lcom/zykj/mistake/feature/notebook/list/f0;

    .line 124
    .line 125
    invoke-direct {v0, p1}, Lcom/zykj/mistake/feature/notebook/list/f0;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    iget-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/m4;->b:Lr6/c;

    .line 129
    .line 130
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 134
    .line 135
    return-object p1

    .line 136
    :pswitch_6
    check-cast p1, Ljava/lang/String;

    .line 137
    .line 138
    const-string v0, "it"

    .line 139
    .line 140
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    new-instance v0, Lcom/zykj/mistake/feature/notebook/list/y0;

    .line 144
    .line 145
    invoke-direct {v0, p1}, Lcom/zykj/mistake/feature/notebook/list/y0;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    iget-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/m4;->b:Lr6/c;

    .line 149
    .line 150
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 154
    .line 155
    return-object p1

    .line 156
    :pswitch_7
    check-cast p1, Ljava/lang/String;

    .line 157
    .line 158
    const-string v0, "itemId"

    .line 159
    .line 160
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    new-instance v0, Lcom/zykj/mistake/feature/notebook/list/g0;

    .line 164
    .line 165
    invoke-direct {v0, p1}, Lcom/zykj/mistake/feature/notebook/list/g0;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    iget-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/m4;->b:Lr6/c;

    .line 169
    .line 170
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 174
    .line 175
    return-object p1

    .line 176
    :pswitch_8
    check-cast p1, Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 177
    .line 178
    const-string v0, "it"

    .line 179
    .line 180
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-static {p1}, Landroidx/compose/ui/layout/LayoutCoordinatesKt;->boundsInRoot(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/m4;->b:Lr6/c;

    .line 188
    .line 189
    invoke-interface {v0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 193
    .line 194
    return-object p1

    .line 195
    :pswitch_9
    check-cast p1, Ljava/util/List;

    .line 196
    .line 197
    const-string v0, "it"

    .line 198
    .line 199
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/z2;

    .line 203
    .line 204
    invoke-direct {v0, p1}, Lcom/zykj/mistake/feature/notebook/detail/z2;-><init>(Ljava/util/List;)V

    .line 205
    .line 206
    .line 207
    iget-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/m4;->b:Lr6/c;

    .line 208
    .line 209
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 213
    .line 214
    return-object p1

    .line 215
    :pswitch_a
    check-cast p1, Ljava/lang/String;

    .line 216
    .line 217
    const-string v0, "it"

    .line 218
    .line 219
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/v2;

    .line 223
    .line 224
    invoke-direct {v0, p1}, Lcom/zykj/mistake/feature/notebook/detail/v2;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    iget-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/m4;->b:Lr6/c;

    .line 228
    .line 229
    invoke-interface {p1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 233
    .line 234
    return-object p1

    .line 235
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
