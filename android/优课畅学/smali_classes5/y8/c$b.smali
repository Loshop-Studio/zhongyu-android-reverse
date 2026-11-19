.class public Ly8/c$b;
.super Ly8/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly8/c;->T()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ly8/c;


# direct methods
.method public constructor <init>(Ly8/c;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly8/c$b;->b:Ly8/c;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Ly8/i;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 1
    invoke-static {}, Lf9/c;->b()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    :goto_0
    invoke-virtual {p0}, Ly8/i;->a()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_5

    .line 10
    .line 11
    iget-object v2, p0, Ly8/c$b;->b:Ly8/c;

    .line 12
    .line 13
    invoke-static {v2}, Ly8/c;->k(Ly8/c;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_5

    .line 18
    .line 19
    invoke-static {}, Lf9/c;->b()J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    invoke-static {}, Lf9/c;->b()J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    sub-long/2addr v4, v0

    .line 28
    iget-object v6, p0, Ly8/c$b;->b:Ly8/c;

    .line 29
    .line 30
    invoke-static {v6}, Ly8/c;->l(Ly8/c;)J

    .line 31
    .line 32
    .line 33
    move-result-wide v6

    .line 34
    sub-long/2addr v6, v4

    .line 35
    const-wide/16 v4, 0x1

    .line 36
    .line 37
    cmp-long v6, v6, v4

    .line 38
    .line 39
    if-lez v6, :cond_0

    .line 40
    .line 41
    invoke-static {v4, v5}, Lf9/c;->a(J)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    iget-object v0, p0, Ly8/c$b;->b:Ly8/c;

    .line 46
    .line 47
    invoke-static {v0, v2, v3}, Ly8/c;->m(Ly8/c;J)J

    .line 48
    .line 49
    .line 50
    move-result-wide v0

    .line 51
    const-wide/16 v4, 0x0

    .line 52
    .line 53
    cmp-long v4, v0, v4

    .line 54
    .line 55
    if-gez v4, :cond_1

    .line 56
    .line 57
    const-wide/16 v4, 0x3c

    .line 58
    .line 59
    sub-long/2addr v4, v0

    .line 60
    invoke-static {v4, v5}, Lf9/c;->a(J)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    iget-object v0, p0, Ly8/c$b;->b:Ly8/c;

    .line 65
    .line 66
    invoke-static {v0}, Ly8/c;->n(Ly8/c;)Ly8/g;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-interface {v0}, Ly8/g;->a()J

    .line 71
    .line 72
    .line 73
    move-result-wide v0

    .line 74
    iget-object v4, p0, Ly8/c$b;->b:Ly8/c;

    .line 75
    .line 76
    invoke-static {v4}, Ly8/c;->o(Ly8/c;)J

    .line 77
    .line 78
    .line 79
    move-result-wide v4

    .line 80
    cmp-long v4, v0, v4

    .line 81
    .line 82
    if-lez v4, :cond_2

    .line 83
    .line 84
    iget-object v4, p0, Ly8/c$b;->b:Ly8/c;

    .line 85
    .line 86
    invoke-static {v4}, Ly8/c;->p(Ly8/c;)Lz8/e;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-virtual {v4, v0, v1}, Lz8/e;->a(J)J

    .line 91
    .line 92
    .line 93
    iget-object v0, p0, Ly8/c$b;->b:Ly8/c;

    .line 94
    .line 95
    invoke-static {v0}, Ly8/c;->q(Ly8/c;)Ljava/util/LinkedList;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    .line 100
    .line 101
    .line 102
    :cond_2
    iget-object v0, p0, Ly8/c$b;->b:Ly8/c;

    .line 103
    .line 104
    invoke-static {v0}, Ly8/c;->b(Ly8/c;)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-nez v0, :cond_3

    .line 109
    .line 110
    iget-object v0, p0, Ly8/c$b;->b:Ly8/c;

    .line 111
    .line 112
    const-wide/32 v4, 0x989680

    .line 113
    .line 114
    .line 115
    invoke-static {v0, v4, v5}, Ly8/c;->d(Ly8/c;J)V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_3
    iget-object v0, p0, Ly8/c$b;->b:Ly8/c;

    .line 120
    .line 121
    invoke-static {v0}, Ly8/c;->e(Ly8/c;)Ld9/a$b;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    iget-boolean v0, v0, Ld9/a$b;->p:Z

    .line 126
    .line 127
    if-eqz v0, :cond_4

    .line 128
    .line 129
    iget-object v0, p0, Ly8/c$b;->b:Ly8/c;

    .line 130
    .line 131
    invoke-static {v0}, Ly8/c;->f(Ly8/c;)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_4

    .line 136
    .line 137
    iget-object v0, p0, Ly8/c$b;->b:Ly8/c;

    .line 138
    .line 139
    invoke-static {v0}, Ly8/c;->e(Ly8/c;)Ld9/a$b;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    iget-wide v0, v0, Ld9/a$b;->o:J

    .line 144
    .line 145
    iget-object v4, p0, Ly8/c$b;->b:Ly8/c;

    .line 146
    .line 147
    invoke-static {v4}, Ly8/c;->p(Ly8/c;)Lz8/e;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    iget-wide v4, v4, Lz8/e;->a:J

    .line 152
    .line 153
    sub-long/2addr v0, v4

    .line 154
    const-wide/16 v4, 0x1f4

    .line 155
    .line 156
    cmp-long v4, v0, v4

    .line 157
    .line 158
    if-lez v4, :cond_4

    .line 159
    .line 160
    iget-object v4, p0, Ly8/c$b;->b:Ly8/c;

    .line 161
    .line 162
    invoke-static {v4}, Ly8/c;->g(Ly8/c;)V

    .line 163
    .line 164
    .line 165
    iget-object v4, p0, Ly8/c$b;->b:Ly8/c;

    .line 166
    .line 167
    const-wide/16 v5, 0xa

    .line 168
    .line 169
    sub-long/2addr v0, v5

    .line 170
    invoke-static {v4, v0, v1}, Ly8/c;->d(Ly8/c;J)V

    .line 171
    .line 172
    .line 173
    :cond_4
    :goto_1
    move-wide v0, v2

    .line 174
    goto/16 :goto_0

    .line 175
    .line 176
    :cond_5
    return-void
.end method
