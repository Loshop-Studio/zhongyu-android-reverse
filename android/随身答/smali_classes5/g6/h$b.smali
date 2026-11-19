.class public final Lg6/h$b;
.super Lg6/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg6/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lg6/h$h;

.field public final b:Lg6/h$d;

.field public final c:Lg6/h$b;


# direct methods
.method public constructor <init>(Lg6/h$h;Lg6/h$d;Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lg6/b;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p0, p0, Lg6/h$b;->c:Lg6/h$b;

    .line 5
    .line 6
    iput-object p1, p0, Lg6/h$b;->a:Lg6/h$h;

    .line 7
    .line 8
    iput-object p2, p0, Lg6/h$b;->b:Lg6/h$d;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a()Lv7/a$c;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lg6/h$b;->b()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lg6/h$i;

    .line 6
    .line 7
    iget-object v2, p0, Lg6/h$b;->a:Lg6/h$h;

    .line 8
    .line 9
    iget-object v3, p0, Lg6/h$b;->b:Lg6/h$d;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    invoke-direct {v1, v2, v3, v4}, Lg6/h$i;-><init>(Lg6/h$h;Lg6/h$d;Lg6/i;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lv7/b;->a(Ljava/util/Map;Lu7/d;)Lv7/a$c;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method public b()Ljava/util/Map;
    .locals 3

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    invoke-static {v0}, Lz7/d;->b(I)Lz7/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lp6/c;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {}, Lp6/a;->a()Z

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
    invoke-virtual {v0, v1, v2}, Lz7/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lz7/d;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget-object v1, Lm6/h0;->a:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {}, Lm6/f0;->a()Z

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
    invoke-virtual {v0, v1, v2}, Lz7/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lz7/d;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sget-object v1, Ln6/j;->a:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {}, Ln6/h;->a()Z

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
    invoke-virtual {v0, v1, v2}, Lz7/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lz7/d;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sget-object v1, Lp6/f;->a:Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {}, Lp6/d;->a()Z

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
    invoke-virtual {v0, v1, v2}, Lz7/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lz7/d;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sget-object v1, Lr6/c;->a:Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {}, Lr6/a;->a()Z

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
    invoke-virtual {v0, v1, v2}, Lz7/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lz7/d;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    sget-object v1, Lt6/l;->a:Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {}, Lt6/j;->a()Z

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
    invoke-virtual {v0, v1, v2}, Lz7/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lz7/d;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    sget-object v1, Ls6/o0;->a:Ljava/lang/String;

    .line 92
    .line 93
    invoke-static {}, Ls6/m0;->a()Z

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
    invoke-virtual {v0, v1, v2}, Lz7/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lz7/d;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    sget-object v1, Ls6/x1;->a:Ljava/lang/String;

    .line 106
    .line 107
    invoke-static {}, Ls6/v1;->a()Z

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
    invoke-virtual {v0, v1, v2}, Lz7/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lz7/d;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    sget-object v1, Ls6/w2;->a:Ljava/lang/String;

    .line 120
    .line 121
    invoke-static {}, Ls6/u2;->a()Z

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
    invoke-virtual {v0, v1, v2}, Lz7/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lz7/d;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    sget-object v1, Ll6/e;->a:Ljava/lang/String;

    .line 134
    .line 135
    invoke-static {}, Ll6/c;->a()Z

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
    invoke-virtual {v0, v1, v2}, Lz7/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lz7/d;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    sget-object v1, Lp6/i;->a:Ljava/lang/String;

    .line 148
    .line 149
    invoke-static {}, Lp6/g;->a()Z

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
    invoke-virtual {v0, v1, v2}, Lz7/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lz7/d;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    sget-object v1, Lm6/n0;->a:Ljava/lang/String;

    .line 162
    .line 163
    invoke-static {}, Lm6/l0;->a()Z

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
    invoke-virtual {v0, v1, v2}, Lz7/d;->c(Ljava/lang/Object;Ljava/lang/Object;)Lz7/d;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-virtual {v0}, Lz7/d;->a()Ljava/util/Map;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-static {v0}, Lz7/c;->a(Ljava/util/Map;)Ljava/util/Map;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    return-object v0
.end method

.method public c(Lcom/zykj/student/dialogue/ui/MainActivity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public d()Lu7/d;
    .locals 4

    .line 1
    new-instance v0, Lg6/h$i;

    .line 2
    .line 3
    iget-object v1, p0, Lg6/h$b;->a:Lg6/h$h;

    .line 4
    .line 5
    iget-object v2, p0, Lg6/h$b;->b:Lg6/h$d;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v1, v2, v3}, Lg6/h$i;-><init>(Lg6/h$h;Lg6/h$d;Lg6/i;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public e()Lu7/c;
    .locals 5

    .line 1
    new-instance v0, Lg6/h$f;

    .line 2
    .line 3
    iget-object v1, p0, Lg6/h$b;->a:Lg6/h$h;

    .line 4
    .line 5
    iget-object v2, p0, Lg6/h$b;->b:Lg6/h$d;

    .line 6
    .line 7
    iget-object v3, p0, Lg6/h$b;->c:Lg6/h$b;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Lg6/h$f;-><init>(Lg6/h$h;Lg6/h$d;Lg6/h$b;Lg6/i;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method
