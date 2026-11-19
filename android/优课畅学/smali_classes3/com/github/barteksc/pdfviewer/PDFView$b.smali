.class public Lcom/github/barteksc/pdfviewer/PDFView$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/github/barteksc/pdfviewer/PDFView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final a:Lc1/a;

.field public b:[I

.field public c:Z

.field public d:Z

.field public e:Lz0/d;

.field public f:Lz0/f;

.field public g:Lz0/g;

.field public h:Ly0/b;

.field public i:I

.field public j:Z

.field public k:Z

.field public l:Ljava/lang/String;

.field public m:Lb1/b;

.field public n:Z

.field public o:I

.field public p:Z

.field public q:Lcom/github/barteksc/pdfviewer/util/FitPolicy;

.field public r:Z

.field public s:Z

.field public t:Z

.field public u:Z

.field public final synthetic v:Lcom/github/barteksc/pdfviewer/PDFView;


# direct methods
.method public constructor <init>(Lcom/github/barteksc/pdfviewer/PDFView;Lc1/a;)V
    .locals 3

    .line 2
    iput-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->b:[I

    const/4 v1, 0x1

    .line 4
    iput-boolean v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->c:Z

    .line 5
    iput-boolean v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->d:Z

    .line 6
    new-instance v2, Ly0/a;

    invoke-direct {v2, p1}, Ly0/a;-><init>(Lcom/github/barteksc/pdfviewer/PDFView;)V

    iput-object v2, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->h:Ly0/b;

    const/4 p1, 0x0

    .line 7
    iput p1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->i:I

    .line 8
    iput-boolean p1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->j:Z

    .line 9
    iput-boolean p1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->k:Z

    .line 10
    iput-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->l:Ljava/lang/String;

    .line 11
    iput-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->m:Lb1/b;

    .line 12
    iput-boolean v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->n:Z

    .line 13
    iput p1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->o:I

    .line 14
    iput-boolean p1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->p:Z

    .line 15
    sget-object v0, Lcom/github/barteksc/pdfviewer/util/FitPolicy;->a:Lcom/github/barteksc/pdfviewer/util/FitPolicy;

    iput-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->q:Lcom/github/barteksc/pdfviewer/util/FitPolicy;

    .line 16
    iput-boolean p1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->r:Z

    .line 17
    iput-boolean p1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->s:Z

    .line 18
    iput-boolean p1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->t:Z

    .line 19
    iput-boolean p1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->u:Z

    .line 20
    iput-object p2, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->a:Lc1/a;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/github/barteksc/pdfviewer/PDFView;Lc1/a;Lcom/github/barteksc/pdfviewer/PDFView$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/github/barteksc/pdfviewer/PDFView$b;-><init>(Lcom/github/barteksc/pdfviewer/PDFView;Lc1/a;)V

    return-void
.end method


# virtual methods
.method public a(I)Lcom/github/barteksc/pdfviewer/PDFView$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->i:I

    .line 2
    .line 3
    return-object p0
.end method

.method public b(Z)Lcom/github/barteksc/pdfviewer/PDFView$b;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->k:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public c()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/github/barteksc/pdfviewer/PDFView;->d(Lcom/github/barteksc/pdfviewer/PDFView;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    .line 10
    .line 11
    invoke-static {v0, p0}, Lcom/github/barteksc/pdfviewer/PDFView;->e(Lcom/github/barteksc/pdfviewer/PDFView;Lcom/github/barteksc/pdfviewer/PDFView$b;)Lcom/github/barteksc/pdfviewer/PDFView$b;

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/github/barteksc/pdfviewer/PDFView;->T()V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    .line 21
    .line 22
    iget-object v0, v0, Lcom/github/barteksc/pdfviewer/PDFView;->s:Lz0/a;

    .line 23
    .line 24
    iget-object v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->e:Lz0/d;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lz0/a;->p(Lz0/d;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    .line 30
    .line 31
    iget-object v0, v0, Lcom/github/barteksc/pdfviewer/PDFView;->s:Lz0/a;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-virtual {v0, v1}, Lz0/a;->o(Lz0/c;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    .line 38
    .line 39
    iget-object v0, v0, Lcom/github/barteksc/pdfviewer/PDFView;->s:Lz0/a;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Lz0/a;->m(Lz0/b;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    .line 45
    .line 46
    iget-object v0, v0, Lcom/github/barteksc/pdfviewer/PDFView;->s:Lz0/a;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Lz0/a;->n(Lz0/b;)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    .line 52
    .line 53
    iget-object v0, v0, Lcom/github/barteksc/pdfviewer/PDFView;->s:Lz0/a;

    .line 54
    .line 55
    iget-object v2, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->f:Lz0/f;

    .line 56
    .line 57
    invoke-virtual {v0, v2}, Lz0/a;->r(Lz0/f;)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    .line 61
    .line 62
    iget-object v0, v0, Lcom/github/barteksc/pdfviewer/PDFView;->s:Lz0/a;

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Lz0/a;->t(Lz0/h;)V

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    .line 68
    .line 69
    iget-object v0, v0, Lcom/github/barteksc/pdfviewer/PDFView;->s:Lz0/a;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Lz0/a;->u(Lz0/i;)V

    .line 72
    .line 73
    .line 74
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    .line 75
    .line 76
    iget-object v0, v0, Lcom/github/barteksc/pdfviewer/PDFView;->s:Lz0/a;

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Lz0/a;->v(Lz0/j;)V

    .line 79
    .line 80
    .line 81
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    .line 82
    .line 83
    iget-object v0, v0, Lcom/github/barteksc/pdfviewer/PDFView;->s:Lz0/a;

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Lz0/a;->q(Lz0/e;)V

    .line 86
    .line 87
    .line 88
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    .line 89
    .line 90
    iget-object v0, v0, Lcom/github/barteksc/pdfviewer/PDFView;->s:Lz0/a;

    .line 91
    .line 92
    iget-object v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->g:Lz0/g;

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Lz0/a;->s(Lz0/g;)V

    .line 95
    .line 96
    .line 97
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    .line 98
    .line 99
    iget-object v0, v0, Lcom/github/barteksc/pdfviewer/PDFView;->s:Lz0/a;

    .line 100
    .line 101
    iget-object v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->h:Ly0/b;

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Lz0/a;->l(Ly0/b;)V

    .line 104
    .line 105
    .line 106
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    .line 107
    .line 108
    iget-boolean v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->c:Z

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Lcom/github/barteksc/pdfviewer/PDFView;->setSwipeEnabled(Z)V

    .line 111
    .line 112
    .line 113
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    .line 114
    .line 115
    iget-boolean v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->u:Z

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Lcom/github/barteksc/pdfviewer/PDFView;->setNightMode(Z)V

    .line 118
    .line 119
    .line 120
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    .line 121
    .line 122
    iget-boolean v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->d:Z

    .line 123
    .line 124
    invoke-virtual {v0, v1}, Lcom/github/barteksc/pdfviewer/PDFView;->r(Z)V

    .line 125
    .line 126
    .line 127
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    .line 128
    .line 129
    iget v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->i:I

    .line 130
    .line 131
    invoke-static {v0, v1}, Lcom/github/barteksc/pdfviewer/PDFView;->f(Lcom/github/barteksc/pdfviewer/PDFView;I)V

    .line 132
    .line 133
    .line 134
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    .line 135
    .line 136
    iget-boolean v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->j:Z

    .line 137
    .line 138
    xor-int/lit8 v1, v1, 0x1

    .line 139
    .line 140
    invoke-static {v0, v1}, Lcom/github/barteksc/pdfviewer/PDFView;->g(Lcom/github/barteksc/pdfviewer/PDFView;Z)V

    .line 141
    .line 142
    .line 143
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    .line 144
    .line 145
    iget-boolean v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->k:Z

    .line 146
    .line 147
    invoke-virtual {v0, v1}, Lcom/github/barteksc/pdfviewer/PDFView;->p(Z)V

    .line 148
    .line 149
    .line 150
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    .line 151
    .line 152
    iget-object v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->m:Lb1/b;

    .line 153
    .line 154
    invoke-static {v0, v1}, Lcom/github/barteksc/pdfviewer/PDFView;->h(Lcom/github/barteksc/pdfviewer/PDFView;Lb1/b;)V

    .line 155
    .line 156
    .line 157
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    .line 158
    .line 159
    iget-boolean v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->n:Z

    .line 160
    .line 161
    invoke-virtual {v0, v1}, Lcom/github/barteksc/pdfviewer/PDFView;->q(Z)V

    .line 162
    .line 163
    .line 164
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    .line 165
    .line 166
    iget v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->o:I

    .line 167
    .line 168
    invoke-static {v0, v1}, Lcom/github/barteksc/pdfviewer/PDFView;->i(Lcom/github/barteksc/pdfviewer/PDFView;I)V

    .line 169
    .line 170
    .line 171
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    .line 172
    .line 173
    iget-boolean v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->p:Z

    .line 174
    .line 175
    invoke-static {v0, v1}, Lcom/github/barteksc/pdfviewer/PDFView;->j(Lcom/github/barteksc/pdfviewer/PDFView;Z)V

    .line 176
    .line 177
    .line 178
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    .line 179
    .line 180
    iget-object v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->q:Lcom/github/barteksc/pdfviewer/util/FitPolicy;

    .line 181
    .line 182
    invoke-static {v0, v1}, Lcom/github/barteksc/pdfviewer/PDFView;->k(Lcom/github/barteksc/pdfviewer/PDFView;Lcom/github/barteksc/pdfviewer/util/FitPolicy;)V

    .line 183
    .line 184
    .line 185
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    .line 186
    .line 187
    iget-boolean v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->r:Z

    .line 188
    .line 189
    invoke-static {v0, v1}, Lcom/github/barteksc/pdfviewer/PDFView;->a(Lcom/github/barteksc/pdfviewer/PDFView;Z)V

    .line 190
    .line 191
    .line 192
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    .line 193
    .line 194
    iget-boolean v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->t:Z

    .line 195
    .line 196
    invoke-virtual {v0, v1}, Lcom/github/barteksc/pdfviewer/PDFView;->setPageSnap(Z)V

    .line 197
    .line 198
    .line 199
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    .line 200
    .line 201
    iget-boolean v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->s:Z

    .line 202
    .line 203
    invoke-virtual {v0, v1}, Lcom/github/barteksc/pdfviewer/PDFView;->setPageFling(Z)V

    .line 204
    .line 205
    .line 206
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->b:[I

    .line 207
    .line 208
    if-eqz v0, :cond_1

    .line 209
    .line 210
    iget-object v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    .line 211
    .line 212
    iget-object v2, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->a:Lc1/a;

    .line 213
    .line 214
    iget-object v3, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->l:Ljava/lang/String;

    .line 215
    .line 216
    invoke-static {v1, v2, v3, v0}, Lcom/github/barteksc/pdfviewer/PDFView;->b(Lcom/github/barteksc/pdfviewer/PDFView;Lc1/a;Ljava/lang/String;[I)V

    .line 217
    .line 218
    .line 219
    return-void

    .line 220
    :cond_1
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    .line 221
    .line 222
    iget-object v1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->a:Lc1/a;

    .line 223
    .line 224
    iget-object v2, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->l:Ljava/lang/String;

    .line 225
    .line 226
    invoke-static {v0, v1, v2}, Lcom/github/barteksc/pdfviewer/PDFView;->c(Lcom/github/barteksc/pdfviewer/PDFView;Lc1/a;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    return-void
.end method

.method public d(Lz0/d;)Lcom/github/barteksc/pdfviewer/PDFView$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->e:Lz0/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public e(Lz0/f;)Lcom/github/barteksc/pdfviewer/PDFView$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->f:Lz0/f;

    .line 2
    .line 3
    return-object p0
.end method

.method public f(Lz0/g;)Lcom/github/barteksc/pdfviewer/PDFView$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->g:Lz0/g;

    .line 2
    .line 3
    return-object p0
.end method

.method public g(Z)Lcom/github/barteksc/pdfviewer/PDFView$b;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->s:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public h(Z)Lcom/github/barteksc/pdfviewer/PDFView$b;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->t:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public i(Lb1/b;)Lcom/github/barteksc/pdfviewer/PDFView$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->m:Lb1/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public j(I)Lcom/github/barteksc/pdfviewer/PDFView$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b;->o:I

    .line 2
    .line 3
    return-object p0
.end method
