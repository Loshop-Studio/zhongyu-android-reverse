.class public final Lcom/zykj/huiwei/launcher/app/a$b;
.super Lr3/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/huiwei/launcher/app/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lcom/zykj/huiwei/launcher/app/a$j;

.field public final b:Lcom/zykj/huiwei/launcher/app/a$d;

.field public final c:Lcom/zykj/huiwei/launcher/app/a$b;


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/app/a$j;Lcom/zykj/huiwei/launcher/app/a$d;Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lr3/c;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p0, p0, Lcom/zykj/huiwei/launcher/app/a$b;->c:Lcom/zykj/huiwei/launcher/app/a$b;

    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/app/a$b;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 7
    .line 8
    iput-object p2, p0, Lcom/zykj/huiwei/launcher/app/a$b;->b:Lcom/zykj/huiwei/launcher/app/a$d;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a()Lw4/a$c;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/app/a$b;->c()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/huiwei/launcher/app/a$k;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/zykj/huiwei/launcher/app/a$b;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 8
    .line 9
    iget-object v3, p0, Lcom/zykj/huiwei/launcher/app/a$b;->b:Lcom/zykj/huiwei/launcher/app/a$d;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    invoke-direct {v1, v2, v3, v4}, Lcom/zykj/huiwei/launcher/app/a$k;-><init>(Lcom/zykj/huiwei/launcher/app/a$j;Lcom/zykj/huiwei/launcher/app/a$d;Lr3/i;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lw4/b;->a(Ljava/util/Map;Lv4/e;)Lw4/a$c;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method public b(Lcom/zykj/gallery/ui/share/ShareActivity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public c()Ljava/util/Map;
    .locals 3

    .line 1
    const/16 v0, 0x12

    .line 2
    .line 3
    invoke-static {v0}, La5/d;->b(I)La5/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Ll4/c;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {}, Ll4/a;->a()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v0, v1, v2}, La5/d;->c(Ljava/lang/Object;Ljava/lang/Object;)La5/d;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget-object v1, Ll4/f;->a:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {}, Ll4/d;->a()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v0, v1, v2}, La5/d;->c(Ljava/lang/Object;Ljava/lang/Object;)La5/d;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sget-object v1, Ld4/p;->a:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {}, Ld4/n;->a()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v0, v1, v2}, La5/d;->c(Ljava/lang/Object;Ljava/lang/Object;)La5/d;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sget-object v1, Ll4/j;->a:Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {}, Ll4/h;->a()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v0, v1, v2}, La5/d;->c(Ljava/lang/Object;Ljava/lang/Object;)La5/d;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sget-object v1, Lh3/z;->a:Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {}, Lh3/x;->a()Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v0, v1, v2}, La5/d;->c(Ljava/lang/Object;Ljava/lang/Object;)La5/d;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    sget-object v1, Lk3/q0;->a:Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {}, Lk3/o0;->a()Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-virtual {v0, v1, v2}, La5/d;->c(Ljava/lang/Object;Ljava/lang/Object;)La5/d;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    sget-object v1, Ll4/s;->a:Ljava/lang/String;

    .line 92
    .line 93
    invoke-static {}, Ll4/q;->a()Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {v0, v1, v2}, La5/d;->c(Ljava/lang/Object;Ljava/lang/Object;)La5/d;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    sget-object v1, Lg4/g;->a:Ljava/lang/String;

    .line 106
    .line 107
    invoke-static {}, Lg4/e;->a()Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-virtual {v0, v1, v2}, La5/d;->c(Ljava/lang/Object;Ljava/lang/Object;)La5/d;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    sget-object v1, Lg4/k;->a:Ljava/lang/String;

    .line 120
    .line 121
    invoke-static {}, Lg4/i;->a()Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-virtual {v0, v1, v2}, La5/d;->c(Ljava/lang/Object;Ljava/lang/Object;)La5/d;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    sget-object v1, Ll4/v;->a:Ljava/lang/String;

    .line 134
    .line 135
    invoke-static {}, Ll4/t;->a()Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-virtual {v0, v1, v2}, La5/d;->c(Ljava/lang/Object;Ljava/lang/Object;)La5/d;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    sget-object v1, Ll4/z;->a:Ljava/lang/String;

    .line 148
    .line 149
    invoke-static {}, Ll4/x;->a()Z

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-virtual {v0, v1, v2}, La5/d;->c(Ljava/lang/Object;Ljava/lang/Object;)La5/d;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    sget-object v1, Ll4/c0;->a:Ljava/lang/String;

    .line 162
    .line 163
    invoke-static {}, Ll4/a0;->a()Z

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-virtual {v0, v1, v2}, La5/d;->c(Ljava/lang/Object;Ljava/lang/Object;)La5/d;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    sget-object v1, Ll4/f0;->a:Ljava/lang/String;

    .line 176
    .line 177
    invoke-static {}, Ll4/d0;->a()Z

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    invoke-virtual {v0, v1, v2}, La5/d;->c(Ljava/lang/Object;Ljava/lang/Object;)La5/d;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    sget-object v1, Ll4/i0;->a:Ljava/lang/String;

    .line 190
    .line 191
    invoke-static {}, Ll4/g0;->a()Z

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    invoke-virtual {v0, v1, v2}, La5/d;->c(Ljava/lang/Object;Ljava/lang/Object;)La5/d;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    sget-object v1, Lm3/w;->a:Ljava/lang/String;

    .line 204
    .line 205
    invoke-static {}, Lm3/u;->a()Z

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    invoke-virtual {v0, v1, v2}, La5/d;->c(Ljava/lang/Object;Ljava/lang/Object;)La5/d;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    sget-object v1, Ll4/l0;->a:Ljava/lang/String;

    .line 218
    .line 219
    invoke-static {}, Ll4/j0;->a()Z

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    invoke-virtual {v0, v1, v2}, La5/d;->c(Ljava/lang/Object;Ljava/lang/Object;)La5/d;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    sget-object v1, Ll4/o0;->a:Ljava/lang/String;

    .line 232
    .line 233
    invoke-static {}, Ll4/m0;->a()Z

    .line 234
    .line 235
    .line 236
    move-result v2

    .line 237
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    invoke-virtual {v0, v1, v2}, La5/d;->c(Ljava/lang/Object;Ljava/lang/Object;)La5/d;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    sget-object v1, Ll4/r0;->a:Ljava/lang/String;

    .line 246
    .line 247
    invoke-static {}, Ll4/p0;->a()Z

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    invoke-virtual {v0, v1, v2}, La5/d;->c(Ljava/lang/Object;Ljava/lang/Object;)La5/d;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-virtual {v0}, La5/d;->a()Ljava/util/Map;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-static {v0}, La5/c;->a(Ljava/util/Map;)Ljava/util/Map;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    return-object v0
.end method

.method public d(Lcom/zykj/gallery/ui/activity/GalleryActivity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public e(Lcom/zykj/huiwei/launcher/ui/activity/CrashActivity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public f(Lcom/zykj/huiwei/launcher/ui/MainActivity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public g()Lv4/e;
    .locals 4

    .line 1
    new-instance v0, Lcom/zykj/huiwei/launcher/app/a$k;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/app/a$b;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/huiwei/launcher/app/a$b;->b:Lcom/zykj/huiwei/launcher/app/a$d;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/huiwei/launcher/app/a$k;-><init>(Lcom/zykj/huiwei/launcher/app/a$j;Lcom/zykj/huiwei/launcher/app/a$d;Lr3/i;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public h()Lv4/c;
    .locals 5

    .line 1
    new-instance v0, Lcom/zykj/huiwei/launcher/app/a$f;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/app/a$b;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/huiwei/launcher/app/a$b;->b:Lcom/zykj/huiwei/launcher/app/a$d;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/huiwei/launcher/app/a$b;->c:Lcom/zykj/huiwei/launcher/app/a$b;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/zykj/huiwei/launcher/app/a$f;-><init>(Lcom/zykj/huiwei/launcher/app/a$j;Lcom/zykj/huiwei/launcher/app/a$d;Lcom/zykj/huiwei/launcher/app/a$b;Lr3/i;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method
