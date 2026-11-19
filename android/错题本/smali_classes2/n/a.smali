.class public final Ln/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln/f;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ln/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ls/l;Lcoil3/r;)Ln/g;
    .locals 7

    .line 1
    iget p3, p0, Ln/a;->a:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    const/4 v2, 0x2

    .line 6
    const-string v3, "android_asset"

    .line 7
    .line 8
    const-string v4, "file"

    .line 9
    .line 10
    const/4 v5, 0x3

    .line 11
    const/4 v6, 0x0

    .line 12
    packed-switch p3, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p1, Lcoil3/x;

    .line 16
    .line 17
    iget-object p3, p1, Lcoil3/x;->c:Ljava/lang/String;

    .line 18
    .line 19
    const-string v0, "android.resource"

    .line 20
    .line 21
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    if-nez p3, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v6, Ln/b;

    .line 29
    .line 30
    invoke-direct {v6, p1, p2, v5}, Ln/b;-><init>(Lcoil3/x;Ls/l;I)V

    .line 31
    .line 32
    .line 33
    :goto_0
    return-object v6

    .line 34
    :pswitch_0
    check-cast p1, Lcoil3/x;

    .line 35
    .line 36
    iget-object p3, p1, Lcoil3/x;->c:Ljava/lang/String;

    .line 37
    .line 38
    const-string v0, "jar:file"

    .line 39
    .line 40
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    if-nez p3, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    new-instance v6, Ln/j;

    .line 48
    .line 49
    invoke-direct {v6, p1, p2}, Ln/j;-><init>(Lcoil3/x;Ls/l;)V

    .line 50
    .line 51
    .line 52
    :goto_1
    return-object v6

    .line 53
    :pswitch_1
    check-cast p1, Lcoil3/x;

    .line 54
    .line 55
    iget-object p3, p1, Lcoil3/x;->c:Ljava/lang/String;

    .line 56
    .line 57
    if-eqz p3, :cond_2

    .line 58
    .line 59
    invoke-virtual {p3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p3

    .line 63
    if-eqz p3, :cond_4

    .line 64
    .line 65
    :cond_2
    iget-object p3, p1, Lcoil3/x;->e:Ljava/lang/String;

    .line 66
    .line 67
    if-eqz p3, :cond_4

    .line 68
    .line 69
    sget-object p3, Lcoil3/util/l;->a:[Landroid/graphics/Bitmap$Config;

    .line 70
    .line 71
    iget-object p3, p1, Lcoil3/x;->c:Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {p3, v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p3

    .line 77
    if-eqz p3, :cond_3

    .line 78
    .line 79
    invoke-static {p1}, Lcoil3/o;->h(Lcoil3/x;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object p3

    .line 83
    invoke-static {p3}, Lkotlin/collections/t;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p3

    .line 87
    invoke-static {p3, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result p3

    .line 91
    if-eqz p3, :cond_3

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_3
    new-instance v6, Ln/h;

    .line 95
    .line 96
    invoke-direct {v6, p1, p2}, Ln/h;-><init>(Lcoil3/x;Ls/l;)V

    .line 97
    .line 98
    .line 99
    :cond_4
    :goto_2
    return-object v6

    .line 100
    :pswitch_2
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 101
    .line 102
    new-instance p3, Ln/c;

    .line 103
    .line 104
    invoke-direct {p3, p1, p2, v5}, Ln/c;-><init>(Ljava/lang/Object;Ls/l;I)V

    .line 105
    .line 106
    .line 107
    return-object p3

    .line 108
    :pswitch_3
    check-cast p1, Lcoil3/x;

    .line 109
    .line 110
    iget-object p3, p1, Lcoil3/x;->c:Ljava/lang/String;

    .line 111
    .line 112
    const-string v0, "data"

    .line 113
    .line 114
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result p3

    .line 118
    if-nez p3, :cond_5

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_5
    new-instance v6, Ln/b;

    .line 122
    .line 123
    invoke-direct {v6, p1, p2, v2}, Ln/b;-><init>(Lcoil3/x;Ls/l;I)V

    .line 124
    .line 125
    .line 126
    :goto_3
    return-object v6

    .line 127
    :pswitch_4
    check-cast p1, Lcoil3/x;

    .line 128
    .line 129
    iget-object p3, p1, Lcoil3/x;->c:Ljava/lang/String;

    .line 130
    .line 131
    const-string v0, "content"

    .line 132
    .line 133
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result p3

    .line 137
    if-nez p3, :cond_6

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_6
    new-instance v6, Ln/b;

    .line 141
    .line 142
    invoke-direct {v6, p1, p2, v1}, Ln/b;-><init>(Lcoil3/x;Ls/l;I)V

    .line 143
    .line 144
    .line 145
    :goto_4
    return-object v6

    .line 146
    :pswitch_5
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 147
    .line 148
    new-instance p3, Ln/c;

    .line 149
    .line 150
    invoke-direct {p3, p1, p2, v2}, Ln/c;-><init>(Ljava/lang/Object;Ls/l;I)V

    .line 151
    .line 152
    .line 153
    return-object p3

    .line 154
    :pswitch_6
    check-cast p1, [B

    .line 155
    .line 156
    new-instance p3, Ln/c;

    .line 157
    .line 158
    invoke-direct {p3, p1, p2, v1}, Ln/c;-><init>(Ljava/lang/Object;Ls/l;I)V

    .line 159
    .line 160
    .line 161
    return-object p3

    .line 162
    :pswitch_7
    check-cast p1, Landroid/graphics/Bitmap;

    .line 163
    .line 164
    new-instance p3, Ln/c;

    .line 165
    .line 166
    invoke-direct {p3, p1, p2, v0}, Ln/c;-><init>(Ljava/lang/Object;Ls/l;I)V

    .line 167
    .line 168
    .line 169
    return-object p3

    .line 170
    :pswitch_8
    check-cast p1, Lcoil3/x;

    .line 171
    .line 172
    sget-object p3, Lcoil3/util/l;->a:[Landroid/graphics/Bitmap$Config;

    .line 173
    .line 174
    iget-object p3, p1, Lcoil3/x;->c:Ljava/lang/String;

    .line 175
    .line 176
    invoke-static {p3, v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result p3

    .line 180
    if-eqz p3, :cond_7

    .line 181
    .line 182
    invoke-static {p1}, Lcoil3/o;->h(Lcoil3/x;)Ljava/util/List;

    .line 183
    .line 184
    .line 185
    move-result-object p3

    .line 186
    invoke-static {p3}, Lkotlin/collections/t;->i0(Ljava/util/List;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object p3

    .line 190
    invoke-static {p3, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result p3

    .line 194
    if-eqz p3, :cond_7

    .line 195
    .line 196
    new-instance v6, Ln/b;

    .line 197
    .line 198
    invoke-direct {v6, p1, p2, v0}, Ln/b;-><init>(Lcoil3/x;Ls/l;I)V

    .line 199
    .line 200
    .line 201
    :cond_7
    return-object v6

    .line 202
    nop

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
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
