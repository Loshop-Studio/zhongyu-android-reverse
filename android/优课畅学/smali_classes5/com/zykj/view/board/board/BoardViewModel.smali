.class public final Lcom/zykj/view/board/board/BoardViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/board/board/BoardViewModel$a;
    }
.end annotation


# instance fields
.field public final A:Ll8/q;

.field public B:Z

.field public a:Lp5/b1;

.field public b:Lp5/a;

.field public c:Lcom/zykj/blackboard/core/edit/IBoardControl;

.field public d:Lcom/zykj/blackboard/listener/TextEditView;

.field public e:Lcom/zykj/blackboard/listener/ImageCropView;

.field public f:I

.field public final g:Landroid/graphics/PointF;

.field public final h:Ll8/g;

.field public final i:Ll8/l;

.field public final j:Ll8/h;

.field public final k:Ll8/q;

.field public final l:Ll8/h;

.field public final m:Ll8/q;

.field public final n:Ll8/h;

.field public final o:Ll8/q;

.field public final p:Ll8/h;

.field public final q:Ll8/q;

.field public final r:Ll8/h;

.field public final s:Ll8/q;

.field public final t:Ll8/h;

.field public final u:Ll8/q;

.field public final v:Ll8/h;

.field public final w:Ll8/q;

.field public final x:Ll8/h;

.field public final y:Ll8/q;

.field public final z:Ll8/h;


# direct methods
.method public constructor <init>()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/zykj/view/board/board/h;->e()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    sget-object v2, Lcom/zykj/view/board/board/x$d;->c:Lcom/zykj/view/board/board/x$d;

    .line 11
    .line 12
    invoke-interface {v1, v2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    iput v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->f:I

    .line 17
    .line 18
    new-instance v1, Landroid/graphics/PointF;

    .line 19
    .line 20
    invoke-direct {v1}, Landroid/graphics/PointF;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->g:Landroid/graphics/PointF;

    .line 24
    .line 25
    const/4 v1, 0x7

    .line 26
    const/4 v2, 0x0

    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-static {v2, v2, v3, v1, v3}, Ll8/m;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Ll8/g;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->h:Ll8/g;

    .line 33
    .line 34
    invoke-static {v1}, Ll8/e;->a(Ll8/g;)Ll8/l;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->i:Ll8/l;

    .line 39
    .line 40
    new-instance v4, Lcom/zykj/view/board/board/p;

    .line 41
    .line 42
    const/16 v11, 0x3f

    .line 43
    .line 44
    const/4 v12, 0x0

    .line 45
    const/4 v5, 0x0

    .line 46
    const/4 v6, 0x0

    .line 47
    const/4 v7, 0x0

    .line 48
    const/4 v8, 0x0

    .line 49
    const/4 v9, 0x0

    .line 50
    const/4 v10, 0x0

    .line 51
    invoke-direct/range {v4 .. v12}, Lcom/zykj/view/board/board/p;-><init>(ZZZZZLcom/zykj/view/board/board/q;ILkotlin/jvm/internal/n;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v4}, Ll8/r;->a(Ljava/lang/Object;)Ll8/h;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->j:Ll8/h;

    .line 59
    .line 60
    invoke-static {v1}, Ll8/e;->b(Ll8/h;)Ll8/q;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->k:Ll8/q;

    .line 65
    .line 66
    new-instance v4, Lcom/zykj/view/board/board/t;

    .line 67
    .line 68
    const/16 v10, 0x1f

    .line 69
    .line 70
    const/4 v11, 0x0

    .line 71
    const/4 v7, 0x0

    .line 72
    const/4 v9, 0x0

    .line 73
    invoke-direct/range {v4 .. v11}, Lcom/zykj/view/board/board/t;-><init>(ZZLcom/zykj/view/board/board/u;ILcom/zykj/view/board/board/s;ILkotlin/jvm/internal/n;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v4}, Ll8/r;->a(Ljava/lang/Object;)Ll8/h;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->l:Ll8/h;

    .line 81
    .line 82
    invoke-static {v1}, Ll8/e;->b(Ll8/h;)Ll8/q;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->m:Ll8/q;

    .line 87
    .line 88
    new-instance v1, Lcom/zykj/view/board/board/i;

    .line 89
    .line 90
    const/4 v4, 0x1

    .line 91
    invoke-direct {v1, v3, v4, v3}, Lcom/zykj/view/board/board/i;-><init>(Lcom/zykj/view/board/board/j;ILkotlin/jvm/internal/n;)V

    .line 92
    .line 93
    .line 94
    invoke-static {v1}, Ll8/r;->a(Ljava/lang/Object;)Ll8/h;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->n:Ll8/h;

    .line 99
    .line 100
    invoke-static {v1}, Ll8/e;->b(Ll8/h;)Ll8/q;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->o:Ll8/q;

    .line 105
    .line 106
    new-instance v5, Lcom/zykj/view/board/board/n;

    .line 107
    .line 108
    const/16 v11, 0x1f

    .line 109
    .line 110
    const/4 v7, 0x0

    .line 111
    const/4 v9, 0x0

    .line 112
    const/4 v10, 0x0

    .line 113
    invoke-direct/range {v5 .. v12}, Lcom/zykj/view/board/board/n;-><init>(ZZZZLcom/zykj/view/board/board/o;ILkotlin/jvm/internal/n;)V

    .line 114
    .line 115
    .line 116
    invoke-static {v5}, Ll8/r;->a(Ljava/lang/Object;)Ll8/h;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->p:Ll8/h;

    .line 121
    .line 122
    invoke-static {v1}, Ll8/e;->b(Ll8/h;)Ll8/q;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->q:Ll8/q;

    .line 127
    .line 128
    new-instance v1, Lcom/zykj/view/board/board/a;

    .line 129
    .line 130
    const/4 v5, 0x3

    .line 131
    invoke-direct {v1, v2, v3, v5, v3}, Lcom/zykj/view/board/board/a;-><init>(ZLcom/zykj/view/board/board/b;ILkotlin/jvm/internal/n;)V

    .line 132
    .line 133
    .line 134
    invoke-static {v1}, Ll8/r;->a(Ljava/lang/Object;)Ll8/h;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->r:Ll8/h;

    .line 139
    .line 140
    invoke-static {v1}, Ll8/e;->b(Ll8/h;)Ll8/q;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->s:Ll8/q;

    .line 145
    .line 146
    new-instance v5, Lcom/zykj/view/board/board/m;

    .line 147
    .line 148
    const/16 v15, 0x1ff

    .line 149
    .line 150
    const/16 v16, 0x0

    .line 151
    .line 152
    const/4 v6, 0x0

    .line 153
    const/4 v7, 0x0

    .line 154
    const/4 v10, 0x0

    .line 155
    const/4 v11, 0x0

    .line 156
    const/4 v12, 0x0

    .line 157
    const/4 v13, 0x0

    .line 158
    const/4 v14, 0x0

    .line 159
    invoke-direct/range {v5 .. v16}, Lcom/zykj/view/board/board/m;-><init>(Lcom/zykj/view/board/board/r;Lcom/zykj/view/board/board/g;ZZFFZFFILkotlin/jvm/internal/n;)V

    .line 160
    .line 161
    .line 162
    invoke-static {v5}, Ll8/r;->a(Ljava/lang/Object;)Ll8/h;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->t:Ll8/h;

    .line 167
    .line 168
    invoke-static {v1}, Ll8/e;->b(Ll8/h;)Ll8/q;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->u:Ll8/q;

    .line 173
    .line 174
    new-instance v5, Lcom/zykj/view/board/board/v;

    .line 175
    .line 176
    const/4 v9, 0x7

    .line 177
    const/4 v10, 0x0

    .line 178
    const/4 v7, 0x0

    .line 179
    const/4 v8, 0x0

    .line 180
    invoke-direct/range {v5 .. v10}, Lcom/zykj/view/board/board/v;-><init>(Lcom/zykj/view/board/board/w;ZLjava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 181
    .line 182
    .line 183
    invoke-static {v5}, Ll8/r;->a(Ljava/lang/Object;)Ll8/h;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->v:Ll8/h;

    .line 188
    .line 189
    invoke-static {v1}, Ll8/e;->b(Ll8/h;)Ll8/q;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->w:Ll8/q;

    .line 194
    .line 195
    new-instance v1, Lcom/zykj/view/board/board/k;

    .line 196
    .line 197
    invoke-direct {v1, v3, v4, v3}, Lcom/zykj/view/board/board/k;-><init>(Lcom/zykj/view/board/board/l;ILkotlin/jvm/internal/n;)V

    .line 198
    .line 199
    .line 200
    invoke-static {v1}, Ll8/r;->a(Ljava/lang/Object;)Ll8/h;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->x:Ll8/h;

    .line 205
    .line 206
    invoke-static {v1}, Ll8/e;->b(Ll8/h;)Ll8/q;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->y:Ll8/q;

    .line 211
    .line 212
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 213
    .line 214
    invoke-static {v1}, Ll8/r;->a(Ljava/lang/Object;)Ll8/h;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->z:Ll8/h;

    .line 219
    .line 220
    invoke-static {v1}, Ll8/e;->b(Ll8/h;)Ll8/q;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->A:Ll8/q;

    .line 225
    .line 226
    iput-boolean v4, v0, Lcom/zykj/view/board/board/BoardViewModel;->B:Z

    .line 227
    .line 228
    return-void
.end method

.method public static synthetic B(Lcom/zykj/view/board/board/BoardViewModel;Ljava/lang/Float;Ljava/lang/Float;ILjava/lang/Object;)V
    .locals 1

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    move-object p1, v0

    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    move-object p2, v0

    .line 12
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel;->A(Ljava/lang/Float;Ljava/lang/Float;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static final B0(Lcom/zykj/view/board/board/BoardViewModel;I)Lh7/p;
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La6/n;->o(Ljava/lang/Integer;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->K()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/bean/BoardConfig;->setAddTextOriginalTextColor(I)V

    .line 15
    .line 16
    .line 17
    :cond_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 18
    .line 19
    return-object p0
.end method

.method public static final C0(Lcom/zykj/view/board/board/BoardViewModel;F)Lh7/p;
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La6/n;->p(Ljava/lang/Float;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->K()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/bean/BoardConfig;->setAddTextOriginalTextSize(F)V

    .line 15
    .line 16
    .line 17
    :cond_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 18
    .line 19
    return-object p0
.end method

.method public static synthetic E(Lcom/zykj/view/board/board/BoardViewModel;Ljava/lang/Float;Ljava/lang/Float;ILjava/lang/Object;)V
    .locals 1

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    move-object p1, v0

    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    move-object p2, v0

    .line 12
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel;->D(Ljava/lang/Float;Ljava/lang/Float;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static final H(Lcom/zykj/view/board/board/BoardViewModel;)Lh7/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->S()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lcom/zykj/view/board/board/BoardViewModel;->r0(Lcom/zykj/blackboard/core/edit/IPageControl;)V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    new-array p0, p0, [Ljava/lang/Object;

    .line 13
    .line 14
    const-string v0, "\u753b\u677f\u521d\u59cb\u5316\u5931\u8d25\uff0c\u8bf7\u9000\u51fa\u540e\u91cd\u8bd5"

    .line 15
    .line 16
    invoke-static {v0, p0}, Lcom/blankj/utilcode/util/ToastUtils;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 20
    .line 21
    return-object p0
.end method

.method public static synthetic W(Lcom/zykj/view/board/board/BoardViewModel;ZZLx7/p;Lx7/p;ILjava/lang/Object;)V
    .locals 1

    .line 1
    and-int/lit8 p6, p5, 0x1

    .line 2
    .line 3
    if-eqz p6, :cond_1

    .line 4
    .line 5
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel;->a:Lp5/b1;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Lp5/b1;->c()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x1

    .line 15
    :cond_1
    :goto_0
    and-int/lit8 p6, p5, 0x2

    .line 16
    .line 17
    if-eqz p6, :cond_3

    .line 18
    .line 19
    iget-object p2, p0, Lcom/zykj/view/board/board/BoardViewModel;->a:Lp5/b1;

    .line 20
    .line 21
    if-eqz p2, :cond_2

    .line 22
    .line 23
    invoke-virtual {p2}, Lp5/b1;->f()Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    goto :goto_1

    .line 28
    :cond_2
    const/4 p2, 0x0

    .line 29
    :cond_3
    :goto_1
    and-int/lit8 p6, p5, 0x4

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    if-eqz p6, :cond_4

    .line 33
    .line 34
    new-instance p3, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$1;

    .line 35
    .line 36
    invoke-direct {p3, v0}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$1;-><init>(Lm7/c;)V

    .line 37
    .line 38
    .line 39
    :cond_4
    and-int/lit8 p5, p5, 0x8

    .line 40
    .line 41
    if-eqz p5, :cond_5

    .line 42
    .line 43
    new-instance p4, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$2;

    .line 44
    .line 45
    invoke-direct {p4, v0}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$2;-><init>(Lm7/c;)V

    .line 46
    .line 47
    .line 48
    :cond_5
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/zykj/view/board/board/BoardViewModel;->V(ZZLx7/p;Lx7/p;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public static synthetic X0(Lcom/zykj/view/board/board/BoardViewModel;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel;->v:Ll8/h;

    .line 6
    .line 7
    invoke-interface {p1}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lcom/zykj/view/board/board/v;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/zykj/view/board/board/v;->e()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    xor-int/lit8 p1, p1, 0x1

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->W0(Z)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static synthetic a(Lcom/zykj/view/board/board/BoardViewModel;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/board/BoardViewModel;->c0(Lcom/zykj/view/board/board/BoardViewModel;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final a0(Lcom/zykj/view/board/board/BoardViewModel;)Lh7/p;
    .locals 13

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->t:Ll8/h;

    .line 2
    .line 3
    :cond_0
    invoke-interface {p0}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lcom/zykj/view/board/board/m;

    .line 9
    .line 10
    const/16 v11, 0x1b7

    .line 11
    .line 12
    const/4 v12, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v7, 0x0

    .line 19
    const/4 v8, 0x0

    .line 20
    const/4 v9, 0x0

    .line 21
    const/4 v10, 0x0

    .line 22
    invoke-static/range {v1 .. v12}, Lcom/zykj/view/board/board/m;->b(Lcom/zykj/view/board/board/m;Lcom/zykj/view/board/board/r;Lcom/zykj/view/board/board/g;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/m;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {p0, v0, v1}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 33
    .line 34
    return-object p0
.end method

.method public static synthetic b(Lcom/zykj/view/board/board/BoardViewModel;F)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->C0(Lcom/zykj/view/board/board/BoardViewModel;F)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final b0(Lcom/zykj/view/board/board/BoardViewModel;FF)Lh7/p;
    .locals 13

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->t:Ll8/h;

    .line 2
    .line 3
    :goto_0
    invoke-interface {p0}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lcom/zykj/view/board/board/m;

    .line 9
    .line 10
    const/16 v11, 0x16f

    .line 11
    .line 12
    const/4 v12, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v7, 0x0

    .line 18
    const/4 v8, 0x0

    .line 19
    const/4 v10, 0x0

    .line 20
    move v6, p1

    .line 21
    move v9, p2

    .line 22
    invoke-static/range {v1 .. v12}, Lcom/zykj/view/board/board/m;->b(Lcom/zykj/view/board/board/m;Lcom/zykj/view/board/board/r;Lcom/zykj/view/board/board/g;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/m;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-interface {p0, v0, p1}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_0
    move p1, v6

    .line 36
    move p2, v9

    .line 37
    goto :goto_0
.end method

.method public static synthetic c(Lcom/zykj/view/board/board/BoardViewModel;I)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->B0(Lcom/zykj/view/board/board/BoardViewModel;I)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final c0(Lcom/zykj/view/board/board/BoardViewModel;)Lh7/p;
    .locals 13

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->t:Ll8/h;

    .line 2
    .line 3
    :cond_0
    invoke-interface {p0}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lcom/zykj/view/board/board/m;

    .line 9
    .line 10
    const/16 v11, 0x1b7

    .line 11
    .line 12
    const/4 v12, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x1

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v7, 0x0

    .line 19
    const/4 v8, 0x1

    .line 20
    const/4 v9, 0x0

    .line 21
    const/4 v10, 0x0

    .line 22
    invoke-static/range {v1 .. v12}, Lcom/zykj/view/board/board/m;->b(Lcom/zykj/view/board/board/m;Lcom/zykj/view/board/board/r;Lcom/zykj/view/board/board/g;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/m;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {p0, v0, v1}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 33
    .line 34
    return-object p0
.end method

.method public static synthetic d(Lcom/zykj/view/board/board/BoardViewModel;Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->k0(Lcom/zykj/view/board/board/BoardViewModel;Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d1(Lcom/zykj/view/board/board/BoardViewModel;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel;->j:Ll8/h;

    .line 6
    .line 7
    invoke-interface {p1}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lcom/zykj/view/board/board/p;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/zykj/view/board/board/p;->g()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    xor-int/lit8 p1, p1, 0x1

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->c1(Z)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static synthetic e(Lcom/zykj/view/board/board/BoardViewModel;Z)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->p0(Lcom/zykj/view/board/board/BoardViewModel;Z)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/zykj/view/board/board/BoardViewModel;Lcom/zykj/blackboard/core/edit/IPageControl;Ljava/lang/String;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel;->m0(Lcom/zykj/view/board/board/BoardViewModel;Lcom/zykj/blackboard/core/edit/IPageControl;Ljava/lang/String;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final f0(Lcom/zykj/view/board/board/BoardViewModel;Lcom/zykj/blackboard/core/edit/IPageControl;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->r0(Lcom/zykj/blackboard/core/edit/IPageControl;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel;->z:Ll8/h;

    .line 10
    .line 11
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-interface {p1, v0}, Ll8/g;->a(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->b:Lp5/a;

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Lp5/a;->h()Lx7/a;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    invoke-interface {p0}, Lx7/a;->invoke()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    :cond_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 30
    .line 31
    return-object p0
.end method

.method public static synthetic g(Lcom/zykj/view/board/board/BoardViewModel;J)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel;->v0(Lcom/zykj/view/board/board/BoardViewModel;J)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final g0(Lcom/zykj/view/board/board/BoardViewModel;Lx7/l;)Lh7/p;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->S()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1, p0}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    new-array p0, p0, [Ljava/lang/Object;

    .line 13
    .line 14
    const-string p1, "\u753b\u677f\u52a0\u8f7d\u5931\u8d25\uff0c\u8bf7\u9000\u51fa\u540e\u91cd\u8bd5"

    .line 15
    .line 16
    invoke-static {p1, p0}, Lcom/blankj/utilcode/util/ToastUtils;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 20
    .line 21
    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/view/board/board/BoardViewModel;ZZ)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel;->y0(Lcom/zykj/view/board/board/BoardViewModel;ZZ)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/zykj/view/board/board/BoardViewModel;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/board/BoardViewModel;->w0(Lcom/zykj/view/board/board/BoardViewModel;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcom/zykj/view/board/board/BoardViewModel;Lx7/l;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->g0(Lcom/zykj/view/board/board/BoardViewModel;Lx7/l;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcom/zykj/view/board/board/BoardViewModel;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/board/BoardViewModel;->a0(Lcom/zykj/view/board/board/BoardViewModel;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final k0(Lcom/zykj/view/board/board/BoardViewModel;Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)Lh7/p;
    .locals 12

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->t:Ll8/h;

    .line 7
    .line 8
    :cond_0
    invoke-interface {p0}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    move-object v0, p1

    .line 13
    check-cast v0, Lcom/zykj/view/board/board/m;

    .line 14
    .line 15
    const/16 v10, 0x1fb

    .line 16
    .line 17
    const/4 v11, 0x0

    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x0

    .line 23
    const/4 v6, 0x0

    .line 24
    const/4 v7, 0x0

    .line 25
    const/4 v8, 0x0

    .line 26
    const/4 v9, 0x0

    .line 27
    invoke-static/range {v0 .. v11}, Lcom/zykj/view/board/board/m;->b(Lcom/zykj/view/board/board/m;Lcom/zykj/view/board/board/r;Lcom/zykj/view/board/board/g;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/m;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {p0, p1, v0}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_0

    .line 36
    .line 37
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 38
    .line 39
    return-object p0
.end method

.method public static synthetic l(Lcom/zykj/view/board/board/BoardViewModel;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/board/BoardViewModel;->H(Lcom/zykj/view/board/board/BoardViewModel;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lcom/zykj/view/board/board/BoardViewModel;Lcom/zykj/blackboard/core/edit/IPageControl;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->f0(Lcom/zykj/view/board/board/BoardViewModel;Lcom/zykj/blackboard/core/edit/IPageControl;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final m0(Lcom/zykj/view/board/board/BoardViewModel;Lcom/zykj/blackboard/core/edit/IPageControl;Ljava/lang/String;)Lh7/p;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "graph"

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-static {v2, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->j:Ll8/h;

    .line 11
    .line 12
    :goto_0
    invoke-interface {v1}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    move-object v4, v3

    .line 17
    check-cast v4, Lcom/zykj/view/board/board/p;

    .line 18
    .line 19
    sget-object v10, Lcom/zykj/view/board/board/q$d;->e:Lcom/zykj/view/board/board/q$d;

    .line 20
    .line 21
    const/16 v11, 0x1f

    .line 22
    .line 23
    const/4 v12, 0x0

    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v6, 0x0

    .line 26
    const/4 v7, 0x0

    .line 27
    const/4 v8, 0x0

    .line 28
    const/4 v9, 0x0

    .line 29
    invoke-static/range {v4 .. v12}, Lcom/zykj/view/board/board/p;->b(Lcom/zykj/view/board/board/p;ZZZZZLcom/zykj/view/board/board/q;ILjava/lang/Object;)Lcom/zykj/view/board/board/p;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-interface {v1, v3, v4}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    iget-object v3, v0, Lcom/zykj/view/board/board/BoardViewModel;->t:Ll8/h;

    .line 40
    .line 41
    :goto_1
    invoke-interface {v3}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    move-object v4, v0

    .line 46
    check-cast v4, Lcom/zykj/view/board/board/m;

    .line 47
    .line 48
    sget-object v5, Lcom/zykj/view/board/board/r$d;->e:Lcom/zykj/view/board/board/r$d;

    .line 49
    .line 50
    const/16 v14, 0x1fe

    .line 51
    .line 52
    const/4 v15, 0x0

    .line 53
    const/4 v6, 0x0

    .line 54
    const/4 v7, 0x0

    .line 55
    const/4 v8, 0x0

    .line 56
    const/4 v9, 0x0

    .line 57
    const/4 v10, 0x0

    .line 58
    const/4 v11, 0x0

    .line 59
    const/4 v12, 0x0

    .line 60
    const/4 v13, 0x0

    .line 61
    invoke-static/range {v4 .. v15}, Lcom/zykj/view/board/board/m;->b(Lcom/zykj/view/board/board/m;Lcom/zykj/view/board/board/r;Lcom/zykj/view/board/board/g;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/m;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-interface {v3, v0, v1}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_0

    .line 70
    .line 71
    invoke-static {v2}, Li7/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    move-object/from16 v4, p1

    .line 76
    .line 77
    invoke-interface {v4, v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->newSelectGraph(Ljava/util/List;)V

    .line 78
    .line 79
    .line 80
    sget-object v0, Lh7/p;->a:Lh7/p;

    .line 81
    .line 82
    return-object v0

    .line 83
    :cond_0
    move-object/from16 v4, p1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_1
    move-object/from16 v4, p1

    .line 87
    .line 88
    goto :goto_0
.end method

.method public static synthetic n(Lcom/zykj/view/board/board/BoardViewModel;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/board/BoardViewModel;->u0(Lcom/zykj/view/board/board/BoardViewModel;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lcom/zykj/view/board/board/BoardViewModel;FF)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel;->b0(Lcom/zykj/view/board/board/BoardViewModel;FF)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic p(Lcom/zykj/view/board/board/BoardViewModel;)Lcom/zykj/blackboard/core/edit/IBoardControl;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->c:Lcom/zykj/blackboard/core/edit/IBoardControl;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final p0(Lcom/zykj/view/board/board/BoardViewModel;Z)Lh7/p;
    .locals 7

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->v:Ll8/h;

    .line 2
    .line 3
    :goto_0
    invoke-interface {p0}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lcom/zykj/view/board/board/v;

    .line 9
    .line 10
    const/4 v5, 0x5

    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    move v3, p1

    .line 15
    invoke-static/range {v1 .. v6}, Lcom/zykj/view/board/board/v;->b(Lcom/zykj/view/board/board/v;Lcom/zykj/view/board/board/w;ZLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/view/board/board/v;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {p0, v0, p1}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_0
    move p1, v3

    .line 29
    goto :goto_0
.end method

.method public static final synthetic q(Lcom/zykj/view/board/board/BoardViewModel;)Lcom/zykj/blackboard/core/edit/IPageControl;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->S()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic r(Lcom/zykj/view/board/board/BoardViewModel;)Ll8/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->h:Ll8/g;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic s(Lcom/zykj/view/board/board/BoardViewModel;)Ll8/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->x:Ll8/h;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic t(Lcom/zykj/view/board/board/BoardViewModel;)Ll8/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->t:Ll8/h;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic u(Lcom/zykj/view/board/board/BoardViewModel;)Ll8/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->j:Ll8/h;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final u0(Lcom/zykj/view/board/board/BoardViewModel;)Lh7/p;
    .locals 7

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->v:Ll8/h;

    .line 2
    .line 3
    :cond_0
    invoke-interface {p0}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lcom/zykj/view/board/board/v;

    .line 9
    .line 10
    sget-object v2, Lcom/zykj/view/board/board/w$c;->f:Lcom/zykj/view/board/board/w$c;

    .line 11
    .line 12
    const/4 v5, 0x6

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x0

    .line 16
    invoke-static/range {v1 .. v6}, Lcom/zykj/view/board/board/v;->b(Lcom/zykj/view/board/board/v;Lcom/zykj/view/board/board/w;ZLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/view/board/board/v;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-interface {p0, v0, v1}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 27
    .line 28
    return-object p0
.end method

.method public static final synthetic v(Lcom/zykj/view/board/board/BoardViewModel;)Ll8/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->l:Ll8/h;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final v0(Lcom/zykj/view/board/board/BoardViewModel;J)Lh7/p;
    .locals 7

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->v:Ll8/h;

    .line 2
    .line 3
    :cond_0
    invoke-interface {p0}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lcom/zykj/view/board/board/v;

    .line 9
    .line 10
    sget-object v2, La6/o;->a:La6/o;

    .line 11
    .line 12
    invoke-virtual {v2, p1, p2}, La6/o;->b(J)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    const/4 v5, 0x3

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static/range {v1 .. v6}, Lcom/zykj/view/board/board/v;->b(Lcom/zykj/view/board/board/v;Lcom/zykj/view/board/board/w;ZLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/view/board/board/v;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {p0, v0, v1}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 31
    .line 32
    return-object p0
.end method

.method public static final synthetic w(Lcom/zykj/view/board/board/BoardViewModel;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->S0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final w0(Lcom/zykj/view/board/board/BoardViewModel;)Lh7/p;
    .locals 7

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/board/BoardViewModel;->v:Ll8/h;

    .line 2
    .line 3
    :cond_0
    invoke-interface {p0}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lcom/zykj/view/board/board/v;

    .line 9
    .line 10
    sget-object v2, Lcom/zykj/view/board/board/w$a;->f:Lcom/zykj/view/board/board/w$a;

    .line 11
    .line 12
    const/4 v5, 0x6

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x0

    .line 16
    invoke-static/range {v1 .. v6}, Lcom/zykj/view/board/board/v;->b(Lcom/zykj/view/board/board/v;Lcom/zykj/view/board/board/w;ZLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/view/board/board/v;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-interface {p0, v0, v1}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 27
    .line 28
    return-object p0
.end method

.method public static synthetic y(Lcom/zykj/view/board/board/BoardViewModel;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZLjava/lang/String;Lx7/l;ILjava/lang/Object;)V
    .locals 1

    .line 1
    and-int/lit8 p8, p7, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p8, :cond_0

    .line 5
    .line 6
    move-object p1, v0

    .line 7
    :cond_0
    and-int/lit8 p8, p7, 0x2

    .line 8
    .line 9
    if-eqz p8, :cond_1

    .line 10
    .line 11
    move-object p2, v0

    .line 12
    :cond_1
    and-int/lit8 p8, p7, 0x4

    .line 13
    .line 14
    if-eqz p8, :cond_2

    .line 15
    .line 16
    sget-object p3, Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;->g:Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;

    .line 17
    .line 18
    :cond_2
    and-int/lit8 p8, p7, 0x8

    .line 19
    .line 20
    if-eqz p8, :cond_3

    .line 21
    .line 22
    const/4 p4, 0x0

    .line 23
    :cond_3
    and-int/lit8 p8, p7, 0x10

    .line 24
    .line 25
    if-eqz p8, :cond_4

    .line 26
    .line 27
    const-string p5, ""

    .line 28
    .line 29
    :cond_4
    and-int/lit8 p7, p7, 0x20

    .line 30
    .line 31
    if-eqz p7, :cond_5

    .line 32
    .line 33
    move-object p6, v0

    .line 34
    :cond_5
    invoke-virtual/range {p0 .. p6}, Lcom/zykj/view/board/board/BoardViewModel;->x(Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZLjava/lang/String;Lx7/l;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public static final y0(Lcom/zykj/view/board/board/BoardViewModel;ZZ)Lh7/p;
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->j:Ll8/h;

    .line 2
    .line 3
    :goto_0
    invoke-interface {v0}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, Lcom/zykj/view/board/board/p;

    .line 9
    .line 10
    const/16 v9, 0x33

    .line 11
    .line 12
    const/4 v10, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v8, 0x0

    .line 17
    move v5, p1

    .line 18
    move v6, p2

    .line 19
    invoke-static/range {v2 .. v10}, Lcom/zykj/view/board/board/p;->b(Lcom/zykj/view/board/board/p;ZZZZZLcom/zykj/view/board/board/q;ILjava/lang/Object;)Lcom/zykj/view/board/board/p;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {v0, v1, p1}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->G0()V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_0
    move p1, v5

    .line 36
    move p2, v6

    .line 37
    goto :goto_0
.end method


# virtual methods
.method public final A(Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->S()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1, p2}, Lcom/zykj/blackboard/core/edit/IPageControl;->areaMoveEnd(Ljava/lang/Float;Ljava/lang/Float;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final A0(Lcom/zykj/blackboard/core/edit/IPageControl;)V
    .locals 2

    .line 1
    new-instance v0, Lp5/p1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lp5/p1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lp5/q1;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Lp5/q1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v0, v1}, Lp5/x1;->f(Lcom/zykj/blackboard/core/edit/IPageControl;Lx7/l;Lx7/l;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final C()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->S()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->areaMoveStart()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final D(Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->S()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1, p2}, Lcom/zykj/blackboard/core/edit/IPageControl;->areaMoving(Ljava/lang/Float;Ljava/lang/Float;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final D0(Lcom/zykj/blackboard/bean/BoardConfig;)V
    .locals 2

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/bean/BoardConfig;->setAddTextOriginalText(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, La6/n;->f()Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->l:Ll8/h;

    .line 18
    .line 19
    invoke-interface {v0}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lcom/zykj/view/board/board/t;

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/zykj/view/board/board/t;->e()Lcom/zykj/view/board/board/s;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Lcom/zykj/view/board/board/s;->a()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    :goto_0
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/bean/BoardConfig;->setAddTextOriginalTextColor(I)V

    .line 34
    .line 35
    .line 36
    invoke-static {}, La6/n;->g()Ljava/lang/Float;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/bean/BoardConfig;->setAddTextOriginalTextSize(F)V

    .line 47
    .line 48
    .line 49
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BoardConfig;->getAddTextRectF()Landroid/graphics/RectF;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    const/high16 v1, 0x44160000    # 600.0f

    .line 54
    .line 55
    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 56
    .line 57
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->d:Lcom/zykj/blackboard/listener/TextEditView;

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/bean/BoardConfig;->setTextEditView(Lcom/zykj/blackboard/listener/TextEditView;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public final E0(FF)V
    .locals 5

    .line 1
    const/4 v0, 0x2

    .line 2
    int-to-float v0, v0

    .line 3
    div-float v1, p1, v0

    .line 4
    .line 5
    div-float v0, p2, v0

    .line 6
    .line 7
    iget-object v2, p0, Lcom/zykj/view/board/board/BoardViewModel;->g:Landroid/graphics/PointF;

    .line 8
    .line 9
    iget-object v3, p0, Lcom/zykj/view/board/board/BoardViewModel;->a:Lp5/b1;

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    invoke-virtual {v3}, Lp5/b1;->e()Lcom/zykj/view/utils/ZoomPointSolution;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v3, 0x0

    .line 19
    :goto_0
    if-nez v3, :cond_1

    .line 20
    .line 21
    const/4 v3, -0x1

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    sget-object v4, Lcom/zykj/view/board/board/BoardViewModel$a;->a:[I

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    aget v3, v4, v3

    .line 30
    .line 31
    :goto_1
    const/4 v4, 0x0

    .line 32
    packed-switch v3, :pswitch_data_0

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v1, v4}, Landroid/graphics/PointF;->set(FF)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_0
    invoke-virtual {v2, v1, v0}, Landroid/graphics/PointF;->set(FF)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_1
    invoke-virtual {v2, v1, p2}, Landroid/graphics/PointF;->set(FF)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :pswitch_2
    invoke-virtual {v2, p1, v0}, Landroid/graphics/PointF;->set(FF)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_3
    invoke-virtual {v2, v1, v4}, Landroid/graphics/PointF;->set(FF)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_4
    invoke-virtual {v2, v4, v0}, Landroid/graphics/PointF;->set(FF)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :pswitch_5
    invoke-virtual {v2, p1, p2}, Landroid/graphics/PointF;->set(FF)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :pswitch_6
    invoke-virtual {v2, v4, p2}, Landroid/graphics/PointF;->set(FF)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_7
    invoke-virtual {v2, p1, v4}, Landroid/graphics/PointF;->set(FF)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :pswitch_8
    invoke-virtual {v2, v4, v4}, Landroid/graphics/PointF;->set(FF)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :pswitch_data_0
    .packed-switch 0x1
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

.method public final F()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->S()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-static {v0, v2, v1, v2}, Lcom/zykj/blackboard/core/edit/IPageControl$DefaultImpls;->cleanPage$default(Lcom/zykj/blackboard/core/edit/IPageControl;Lcom/zykj/blackboard/core/graph/IGraph;ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final F0()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->S()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->getImageGraphCount()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v0, v1

    .line 14
    :goto_0
    iget-object v2, p0, Lcom/zykj/view/board/board/BoardViewModel;->a:Lp5/b1;

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {v2}, Lp5/b1;->b()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    const/4 v2, 0x3

    .line 24
    :goto_1
    if-lt v0, v2, :cond_2

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    return v0

    .line 28
    :cond_2
    return v1
.end method

.method public final G()V
    .locals 15

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->c:Lcom/zykj/blackboard/core/edit/IBoardControl;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardViewModel;->t:Ll8/h;

    .line 7
    .line 8
    :cond_1
    invoke-interface {v1}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    move-object v3, v2

    .line 13
    check-cast v3, Lcom/zykj/view/board/board/m;

    .line 14
    .line 15
    const/16 v13, 0x1fb

    .line 16
    .line 17
    const/4 v14, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v7, 0x0

    .line 22
    const/4 v8, 0x0

    .line 23
    const/4 v9, 0x0

    .line 24
    const/4 v10, 0x0

    .line 25
    const/4 v11, 0x0

    .line 26
    const/4 v12, 0x0

    .line 27
    invoke-static/range {v3 .. v14}, Lcom/zykj/view/board/board/m;->b(Lcom/zykj/view/board/board/m;Lcom/zykj/view/board/board/r;Lcom/zykj/view/board/board/g;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/m;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-interface {v1, v2, v3}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    iget-object v2, p0, Lcom/zykj/view/board/board/BoardViewModel;->v:Ll8/h;

    .line 38
    .line 39
    :cond_2
    invoke-interface {v2}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    move-object v3, v1

    .line 44
    check-cast v3, Lcom/zykj/view/board/board/v;

    .line 45
    .line 46
    sget-object v4, Lcom/zykj/view/board/board/w$b;->f:Lcom/zykj/view/board/board/w$b;

    .line 47
    .line 48
    const/4 v7, 0x6

    .line 49
    const/4 v8, 0x0

    .line 50
    const/4 v5, 0x0

    .line 51
    const/4 v6, 0x0

    .line 52
    invoke-static/range {v3 .. v8}, Lcom/zykj/view/board/board/v;->b(Lcom/zykj/view/board/board/v;Lcom/zykj/view/board/board/w;ZLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/view/board/board/v;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-interface {v2, v1, v3}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    const/4 v1, 0x2

    .line 63
    const/4 v2, 0x0

    .line 64
    const/4 v3, 0x0

    .line 65
    invoke-static {v0, v2, v3, v1, v3}, Lcom/zykj/blackboard/core/edit/IBoardControl$DefaultImpls;->deletePage$default(Lcom/zykj/blackboard/core/edit/IBoardControl;ILx7/a;ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    new-instance v1, Lp5/c1;

    .line 69
    .line 70
    invoke-direct {v1, p0}, Lp5/c1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;)V

    .line 71
    .line 72
    .line 73
    const/4 v4, 0x1

    .line 74
    invoke-static {v0, v2, v1, v4, v3}, Lcom/zykj/blackboard/core/edit/IBoardControl$DefaultImpls;->createPage$default(Lcom/zykj/blackboard/core/edit/IBoardControl;ZLx7/a;ILjava/lang/Object;)Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public final G0()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->S()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->getBackgroundColor()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardViewModel;->r:Ll8/h;

    .line 13
    .line 14
    :cond_1
    invoke-interface {v1}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    move-object v3, v2

    .line 19
    check-cast v3, Lcom/zykj/view/board/board/a;

    .line 20
    .line 21
    invoke-static {}, Lcom/zykj/view/board/board/h;->a()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-eqz v5, :cond_3

    .line 34
    .line 35
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    check-cast v5, Lcom/zykj/view/board/board/b;

    .line 40
    .line 41
    invoke-virtual {v5}, Lcom/zykj/view/board/board/b;->a()I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-ne v6, v0, :cond_2

    .line 46
    .line 47
    const/4 v4, 0x1

    .line 48
    const/4 v6, 0x0

    .line 49
    const/4 v7, 0x0

    .line 50
    invoke-static {v3, v7, v5, v4, v6}, Lcom/zykj/view/board/board/a;->b(Lcom/zykj/view/board/board/a;ZLcom/zykj/view/board/board/b;ILjava/lang/Object;)Lcom/zykj/view/board/board/a;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-interface {v1, v2, v3}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_1

    .line 59
    .line 60
    :goto_0
    return-void

    .line 61
    :cond_3
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 62
    .line 63
    const-string v1, "Collection contains no element matching the predicate."

    .line 64
    .line 65
    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v0
.end method

.method public final H0()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->S()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_2

    .line 10
    .line 11
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->K()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_1
    invoke-interface {v1}, Lcom/zykj/blackboard/core/edit/IPageControl;->getZoomLevel()F

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    invoke-static {}, Lcom/zykj/view/board/board/h;->e()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    const/4 v5, 0x0

    .line 31
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    const/4 v7, -0x1

    .line 36
    if-eqz v6, :cond_3

    .line 37
    .line 38
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    check-cast v6, Lcom/zykj/view/board/board/x;

    .line 43
    .line 44
    invoke-virtual {v6}, Lcom/zykj/view/board/board/x;->a()F

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    cmpg-float v6, v6, v3

    .line 49
    .line 50
    if-nez v6, :cond_2

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    move v5, v7

    .line 57
    :goto_1
    if-ne v5, v7, :cond_4

    .line 58
    .line 59
    const/4 v5, 0x3

    .line 60
    :cond_4
    iput v5, v0, Lcom/zykj/view/board/board/BoardViewModel;->f:I

    .line 61
    .line 62
    const/4 v4, 0x1

    .line 63
    int-to-float v4, v4

    .line 64
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-virtual {v5}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getMaxHeightTimes()I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    int-to-float v5, v5

    .line 73
    mul-float/2addr v5, v3

    .line 74
    div-float v12, v4, v5

    .line 75
    .line 76
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getMaxWidthTimes()I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    int-to-float v2, v2

    .line 85
    mul-float/2addr v2, v3

    .line 86
    div-float v15, v4, v2

    .line 87
    .line 88
    iget-object v2, v0, Lcom/zykj/view/board/board/BoardViewModel;->t:Ll8/h;

    .line 89
    .line 90
    :cond_5
    invoke-interface {v2}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    move-object v6, v3

    .line 95
    check-cast v6, Lcom/zykj/view/board/board/m;

    .line 96
    .line 97
    invoke-interface {v1}, Lcom/zykj/blackboard/core/edit/IPageControl;->getMoveVerticalProgress()F

    .line 98
    .line 99
    .line 100
    move-result v11

    .line 101
    invoke-interface {v1}, Lcom/zykj/blackboard/core/edit/IPageControl;->getMoveHorizontalProgress()F

    .line 102
    .line 103
    .line 104
    move-result v14

    .line 105
    const/16 v16, 0x4f

    .line 106
    .line 107
    const/16 v17, 0x0

    .line 108
    .line 109
    const/4 v7, 0x0

    .line 110
    const/4 v8, 0x0

    .line 111
    const/4 v9, 0x0

    .line 112
    const/4 v10, 0x0

    .line 113
    const/4 v13, 0x0

    .line 114
    invoke-static/range {v6 .. v17}, Lcom/zykj/view/board/board/m;->b(Lcom/zykj/view/board/board/m;Lcom/zykj/view/board/board/r;Lcom/zykj/view/board/board/g;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/m;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    invoke-interface {v2, v3, v4}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    if-eqz v3, :cond_5

    .line 123
    .line 124
    :goto_2
    return-void
.end method

.method public final I()Ll8/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->s:Ll8/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final I0(Lcom/zykj/blackboard/listener/ImageCropView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel;->e:Lcom/zykj/blackboard/listener/ImageCropView;

    .line 2
    .line 3
    return-void
.end method

.method public final J()Lp5/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->b:Lp5/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final J0(Lcom/zykj/blackboard/listener/TextEditView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel;->d:Lcom/zykj/blackboard/listener/TextEditView;

    .line 2
    .line 3
    return-void
.end method

.method public final K()Lcom/zykj/blackboard/bean/BoardConfig;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->c:Lcom/zykj/blackboard/core/edit/IBoardControl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IBoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public final K0(Z)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->S()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    invoke-interface {p1}, Lcom/zykj/blackboard/core/edit/IPageControl;->withdraw()Z

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->S()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    invoke-interface {p1}, Lcom/zykj/blackboard/core/edit/IPageControl;->recover()Z

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
.end method

.method public final L()Ll8/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->o:Ll8/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final L0()V
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->t:Ll8/h;

    .line 2
    .line 3
    :cond_0
    invoke-interface {v0}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, Lcom/zykj/view/board/board/m;

    .line 9
    .line 10
    invoke-virtual {v2}, Lcom/zykj/view/board/board/m;->f()Lcom/zykj/view/board/board/r;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    sget-object v4, Lcom/zykj/view/board/board/r$a;->e:Lcom/zykj/view/board/board/r$a;

    .line 15
    .line 16
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    :goto_0
    move-object v3, v4

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    sget-object v4, Lcom/zykj/view/board/board/r$d;->e:Lcom/zykj/view/board/board/r$d;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    const/16 v12, 0x1fe

    .line 28
    .line 29
    const/4 v13, 0x0

    .line 30
    const/4 v4, 0x0

    .line 31
    const/4 v5, 0x0

    .line 32
    const/4 v6, 0x0

    .line 33
    const/4 v7, 0x0

    .line 34
    const/4 v8, 0x0

    .line 35
    const/4 v9, 0x0

    .line 36
    const/4 v10, 0x0

    .line 37
    const/4 v11, 0x0

    .line 38
    invoke-static/range {v2 .. v13}, Lcom/zykj/view/board/board/m;->b(Lcom/zykj/view/board/board/m;Lcom/zykj/view/board/board/r;Lcom/zykj/view/board/board/g;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/m;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-interface {v0, v1, v2}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    return-void
.end method

.method public final M()Ll8/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->i:Ll8/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final M0()V
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->t:Ll8/h;

    .line 2
    .line 3
    :cond_0
    invoke-interface {v0}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, Lcom/zykj/view/board/board/m;

    .line 9
    .line 10
    invoke-virtual {v2}, Lcom/zykj/view/board/board/m;->f()Lcom/zykj/view/board/board/r;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    sget-object v4, Lcom/zykj/view/board/board/r$b;->e:Lcom/zykj/view/board/board/r$b;

    .line 15
    .line 16
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    :goto_0
    move-object v3, v4

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    sget-object v4, Lcom/zykj/view/board/board/r$d;->e:Lcom/zykj/view/board/board/r$d;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    const/16 v12, 0x1fe

    .line 28
    .line 29
    const/4 v13, 0x0

    .line 30
    const/4 v4, 0x0

    .line 31
    const/4 v5, 0x0

    .line 32
    const/4 v6, 0x0

    .line 33
    const/4 v7, 0x0

    .line 34
    const/4 v8, 0x0

    .line 35
    const/4 v9, 0x0

    .line 36
    const/4 v10, 0x0

    .line 37
    const/4 v11, 0x0

    .line 38
    invoke-static/range {v2 .. v13}, Lcom/zykj/view/board/board/m;->b(Lcom/zykj/view/board/board/m;Lcom/zykj/view/board/board/r;Lcom/zykj/view/board/board/g;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/m;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-interface {v0, v1, v2}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    return-void
.end method

.method public final N()Ll8/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->y:Ll8/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final N0()V
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->t:Ll8/h;

    .line 2
    .line 3
    :cond_0
    invoke-interface {v0}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, Lcom/zykj/view/board/board/m;

    .line 9
    .line 10
    invoke-virtual {v2}, Lcom/zykj/view/board/board/m;->f()Lcom/zykj/view/board/board/r;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    sget-object v4, Lcom/zykj/view/board/board/r$c;->e:Lcom/zykj/view/board/board/r$c;

    .line 15
    .line 16
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    :goto_0
    move-object v3, v4

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    sget-object v4, Lcom/zykj/view/board/board/r$d;->e:Lcom/zykj/view/board/board/r$d;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    const/16 v12, 0x1fe

    .line 28
    .line 29
    const/4 v13, 0x0

    .line 30
    const/4 v4, 0x0

    .line 31
    const/4 v5, 0x0

    .line 32
    const/4 v6, 0x0

    .line 33
    const/4 v7, 0x0

    .line 34
    const/4 v8, 0x0

    .line 35
    const/4 v9, 0x0

    .line 36
    const/4 v10, 0x0

    .line 37
    const/4 v11, 0x0

    .line 38
    invoke-static/range {v2 .. v13}, Lcom/zykj/view/board/board/m;->b(Lcom/zykj/view/board/board/m;Lcom/zykj/view/board/board/r;Lcom/zykj/view/board/board/g;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/m;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-interface {v0, v1, v2}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    return-void
.end method

.method public final O()Ll8/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->u:Ll8/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final O0()V
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->t:Ll8/h;

    .line 2
    .line 3
    :cond_0
    invoke-interface {v0}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, Lcom/zykj/view/board/board/m;

    .line 9
    .line 10
    invoke-virtual {v2}, Lcom/zykj/view/board/board/m;->f()Lcom/zykj/view/board/board/r;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    sget-object v4, Lcom/zykj/view/board/board/r$e;->e:Lcom/zykj/view/board/board/r$e;

    .line 15
    .line 16
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    :goto_0
    move-object v3, v4

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    sget-object v4, Lcom/zykj/view/board/board/r$d;->e:Lcom/zykj/view/board/board/r$d;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    const/16 v12, 0x1fe

    .line 28
    .line 29
    const/4 v13, 0x0

    .line 30
    const/4 v4, 0x0

    .line 31
    const/4 v5, 0x0

    .line 32
    const/4 v6, 0x0

    .line 33
    const/4 v7, 0x0

    .line 34
    const/4 v8, 0x0

    .line 35
    const/4 v9, 0x0

    .line 36
    const/4 v10, 0x0

    .line 37
    const/4 v11, 0x0

    .line 38
    invoke-static/range {v2 .. v13}, Lcom/zykj/view/board/board/m;->b(Lcom/zykj/view/board/board/m;Lcom/zykj/view/board/board/r;Lcom/zykj/view/board/board/g;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/m;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-interface {v0, v1, v2}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    return-void
.end method

.method public final P()Ll8/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->q:Ll8/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final P0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->S()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->isRecording()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->isMicroTurnOn()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iput-boolean v1, p0, Lcom/zykj/view/board/board/BoardViewModel;->B:Z

    .line 19
    .line 20
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->stopRecord()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    iget-boolean v1, p0, Lcom/zykj/view/board/board/BoardViewModel;->B:Z

    .line 25
    .line 26
    invoke-interface {v0, v1}, Lcom/zykj/blackboard/core/edit/IPageControl;->startRecord(Z)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final Q()Ll8/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->A:Ll8/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final Q0(I)V
    .locals 6

    .line 1
    invoke-static {}, Lcom/zykj/view/board/board/h;->a()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/zykj/view/board/board/b;

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->r:Ll8/h;

    .line 12
    .line 13
    :cond_0
    invoke-interface {v0}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    move-object v2, v1

    .line 18
    check-cast v2, Lcom/zykj/view/board/board/a;

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x0

    .line 23
    invoke-static {v2, v5, p1, v3, v4}, Lcom/zykj/view/board/board/a;->b(Lcom/zykj/view/board/board/a;ZLcom/zykj/view/board/board/b;ILjava/lang/Object;)Lcom/zykj/view/board/board/a;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-interface {v0, v1, v2}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->K()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/view/board/board/b;->a()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/bean/BoardConfig;->setBackgroundColor(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {p1}, Lcom/zykj/view/board/board/b;->b()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->setLineColor(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Lcom/zykj/view/board/board/b;->d()Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->setLineType(Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/zykj/view/board/board/b;->c()F

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->setLineSpace(F)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->S()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    if-nez v1, :cond_2

    .line 77
    .line 78
    :goto_0
    return-void

    .line 79
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/view/board/board/b;->a()I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    invoke-interface {v1}, Lcom/zykj/blackboard/core/edit/IPageControl;->getBackgroundColor()I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-eq v2, v3, :cond_3

    .line 88
    .line 89
    invoke-virtual {p1}, Lcom/zykj/view/board/board/b;->a()I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-interface {v1, v2, v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->setBackgroundColorWithLineConfig(ILcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 98
    .line 99
    .line 100
    :cond_3
    invoke-virtual {p1}, Lcom/zykj/view/board/board/b;->a()I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-static {p1}, La6/n;->j(Ljava/lang/Integer;)V

    .line 109
    .line 110
    .line 111
    return-void
.end method

.method public final R()Ll8/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->k:Ll8/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final R0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->n:Ll8/h;

    .line 2
    .line 3
    invoke-interface {v0}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/view/board/board/i;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->K()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    sget-object v2, Lcom/zykj/board/EzyModeEnum$ModeEnum;->f:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/bean/BoardConfig;->setMode(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/zykj/view/board/board/i;->b()Lcom/zykj/view/board/board/j;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lcom/zykj/view/board/board/j;->b()F

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-virtual {v1, v0}, Lcom/zykj/blackboard/bean/BoardConfig;->setEraserWidth(F)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public final S()Lcom/zykj/blackboard/core/edit/IPageControl;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->c:Lcom/zykj/blackboard/core/edit/IBoardControl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IBoardControl;->getPages()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {v0}, Li7/f0;->n0(Ljava/util/List;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return-object v0
.end method

.method public final S0()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->l:Ll8/h;

    .line 2
    .line 3
    invoke-interface {v0}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/view/board/board/t;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->K()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/zykj/view/board/board/t;->g()Lcom/zykj/view/board/board/u;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2}, Lcom/zykj/view/board/board/u;->a()Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/bean/BoardConfig;->setMode(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/zykj/view/board/board/t;->g()Lcom/zykj/view/board/board/u;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2}, Lcom/zykj/view/board/board/u;->e()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    const/4 v5, 0x6

    .line 35
    const/4 v6, 0x0

    .line 36
    const/4 v3, 0x0

    .line 37
    const/4 v4, 0x0

    .line 38
    invoke-static/range {v1 .. v6}, Lcom/zykj/blackboard/bean/BoardConfig;->setDottedLine$default(Lcom/zykj/blackboard/bean/BoardConfig;ZFFILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/zykj/view/board/board/t;->g()Lcom/zykj/view/board/board/u;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v2}, Lcom/zykj/view/board/board/u;->d()Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v0}, Lcom/zykj/view/board/board/t;->f()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Ljava/lang/Number;

    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/bean/BoardConfig;->setPaintWidth(F)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/bean/BoardConfig;->setBeelinePaintWidth(F)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Lcom/zykj/view/board/board/t;->e()Lcom/zykj/view/board/board/s;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v2}, Lcom/zykj/view/board/board/s;->a()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    invoke-virtual {v0}, Lcom/zykj/view/board/board/t;->g()Lcom/zykj/view/board/board/u;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0}, Lcom/zykj/view/board/board/u;->c()F

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    invoke-static {v2, v0}, La6/a;->e(IF)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    invoke-virtual {v1, v0}, Lcom/zykj/blackboard/bean/BoardConfig;->setPaintColor(I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, v0}, Lcom/zykj/blackboard/bean/BoardConfig;->setBeelinePaintColor(I)V

    .line 93
    .line 94
    .line 95
    invoke-static {}, La6/n;->f()Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    if-nez v2, :cond_0

    .line 100
    .line 101
    invoke-virtual {v1, v0}, Lcom/zykj/blackboard/bean/BoardConfig;->setAddTextOriginalTextColor(I)V

    .line 102
    .line 103
    .line 104
    :cond_0
    return-void
.end method

.method public final T()Ll8/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->m:Ll8/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final T0(I)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/view/board/board/h;->b()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/zykj/view/board/board/j;

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->n:Ll8/h;

    .line 12
    .line 13
    :cond_0
    invoke-interface {v0}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    move-object v2, v1

    .line 18
    check-cast v2, Lcom/zykj/view/board/board/i;

    .line 19
    .line 20
    invoke-virtual {v2, p1}, Lcom/zykj/view/board/board/i;->a(Lcom/zykj/view/board/board/j;)Lcom/zykj/view/board/board/i;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-interface {v0, v1, v2}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->R0()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/zykj/view/board/board/j;->b()F

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {p1}, La6/n;->k(Ljava/lang/Float;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final U()Ll8/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->w:Ll8/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final U0(Z)V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Li8/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, p1, v1}, Lcom/zykj/view/board/board/BoardViewModel$updateExpandState$1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;ZLm7/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final V(ZZLx7/p;Lx7/p;)V
    .locals 9

    .line 1
    const-string v0, "error"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Li8/b0;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v2, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;

    .line 16
    .line 17
    const/4 v8, 0x0

    .line 18
    move-object v3, p0

    .line 19
    move v4, p1

    .line 20
    move v5, p2

    .line 21
    move-object v7, p3

    .line 22
    move-object v6, p4

    .line 23
    invoke-direct/range {v2 .. v8}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;-><init>(Lcom/zykj/view/board/board/BoardViewModel;ZZLx7/p;Lx7/p;Lm7/c;)V

    .line 24
    .line 25
    .line 26
    const/4 v5, 0x3

    .line 27
    const/4 v6, 0x0

    .line 28
    move-object v4, v2

    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-static/range {v1 .. v6}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final V0(Lcom/zykj/view/board/board/o;)V
    .locals 10

    .line 1
    const-string v0, "graphType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/zykj/view/board/board/q$b;->e:Lcom/zykj/view/board/board/q$b;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/zykj/view/board/board/BoardViewModel;->Y0(Lcom/zykj/view/board/board/q;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->p:Ll8/h;

    .line 12
    .line 13
    :goto_0
    invoke-interface {v0}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    move-object v2, v1

    .line 18
    check-cast v2, Lcom/zykj/view/board/board/n;

    .line 19
    .line 20
    const/16 v8, 0xf

    .line 21
    .line 22
    const/4 v9, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v4, 0x0

    .line 25
    const/4 v5, 0x0

    .line 26
    const/4 v6, 0x0

    .line 27
    move-object v7, p1

    .line 28
    invoke-static/range {v2 .. v9}, Lcom/zykj/view/board/board/n;->b(Lcom/zykj/view/board/board/n;ZZZZLcom/zykj/view/board/board/o;ILjava/lang/Object;)Lcom/zykj/view/board/board/n;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {v0, v1, p1}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->K()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-eqz p1, :cond_0

    .line 43
    .line 44
    sget-object v0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->l:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/bean/BoardConfig;->setMode(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v7}, Lcom/zykj/view/board/board/o;->a()Lcom/zykj/blackboard/core/action/GeometryActionEnum;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/bean/BoardConfig;->setGeometryActionEnum(Lcom/zykj/blackboard/core/action/GeometryActionEnum;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    return-void

    .line 57
    :cond_1
    move-object p1, v7

    .line 58
    goto :goto_0
.end method

.method public final W0(Z)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->S()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardViewModel;->v:Ll8/h;

    .line 9
    .line 10
    :goto_0
    invoke-interface {v1}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    move-object v3, v2

    .line 15
    check-cast v3, Lcom/zykj/view/board/board/v;

    .line 16
    .line 17
    const/4 v7, 0x5

    .line 18
    const/4 v8, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    move v5, p1

    .line 22
    invoke-static/range {v3 .. v8}, Lcom/zykj/view/board/board/v;->b(Lcom/zykj/view/board/board/v;Lcom/zykj/view/board/board/w;ZLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/view/board/board/v;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-interface {v1, v2, p1}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->turnOnMicro()V

    .line 35
    .line 36
    .line 37
    sget p1, Lcom/zykj/view/R$string;->turn_on_micro_phone:I

    .line 38
    .line 39
    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->r(I)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->turnOffMicro()V

    .line 44
    .line 45
    .line 46
    sget p1, Lcom/zykj/view/R$string;->turn_off_micro_phone:I

    .line 47
    .line 48
    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->r(I)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    move p1, v5

    .line 53
    goto :goto_0
.end method

.method public final X()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Li8/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/view/board/board/BoardViewModel$handleExpandClick$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/zykj/view/board/board/BoardViewModel$handleExpandClick$1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;Lm7/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final Y()V
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->t:Ll8/h;

    .line 2
    .line 3
    :cond_0
    invoke-interface {v0}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, Lcom/zykj/view/board/board/m;

    .line 9
    .line 10
    sget-object v3, Lcom/zykj/view/board/board/r$d;->e:Lcom/zykj/view/board/board/r$d;

    .line 11
    .line 12
    const/16 v12, 0x1fe

    .line 13
    .line 14
    const/4 v13, 0x0

    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v7, 0x0

    .line 19
    const/4 v8, 0x0

    .line 20
    const/4 v9, 0x0

    .line 21
    const/4 v10, 0x0

    .line 22
    const/4 v11, 0x0

    .line 23
    invoke-static/range {v2 .. v13}, Lcom/zykj/view/board/board/m;->b(Lcom/zykj/view/board/board/m;Lcom/zykj/view/board/board/r;Lcom/zykj/view/board/board/g;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/m;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-interface {v0, v1, v2}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    return-void
.end method

.method public final Y0(Lcom/zykj/view/board/board/q;)V
    .locals 11

    .line 1
    const-string v0, "mainToolType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->j:Ll8/h;

    .line 7
    .line 8
    :goto_0
    invoke-interface {v0}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    move-object v2, v1

    .line 13
    check-cast v2, Lcom/zykj/view/board/board/p;

    .line 14
    .line 15
    const/16 v9, 0x1f

    .line 16
    .line 17
    const/4 v10, 0x0

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v5, 0x0

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v7, 0x0

    .line 23
    move-object v8, p1

    .line 24
    invoke-static/range {v2 .. v10}, Lcom/zykj/view/board/board/p;->b(Lcom/zykj/view/board/board/p;ZZZZZLcom/zykj/view/board/board/q;ILjava/lang/Object;)Lcom/zykj/view/board/board/p;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-interface {v0, v1, p1}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_5

    .line 33
    .line 34
    sget-object p1, Lcom/zykj/view/board/board/q$d;->e:Lcom/zykj/view/board/board/q$d;

    .line 35
    .line 36
    invoke-static {v8, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_0

    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->K()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    sget-object v0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->k:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/bean/BoardConfig;->setMode(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_0
    sget-object p1, Lcom/zykj/view/board/board/q$c;->e:Lcom/zykj/view/board/board/q$c;

    .line 55
    .line 56
    invoke-static {v8, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_1

    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->S0()V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_1
    sget-object p1, Lcom/zykj/view/board/board/q$a;->e:Lcom/zykj/view/board/board/q$a;

    .line 67
    .line 68
    invoke-static {v8, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_2

    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->R0()V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_2
    sget-object p1, Lcom/zykj/view/board/board/q$b;->e:Lcom/zykj/view/board/board/q$b;

    .line 79
    .line 80
    invoke-static {v8, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_4

    .line 85
    .line 86
    :cond_3
    return-void

    .line 87
    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 88
    .line 89
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 90
    .line 91
    .line 92
    throw p1

    .line 93
    :cond_5
    move-object p1, v8

    .line 94
    goto :goto_0
.end method

.method public final Z(Lcom/zykj/blackboard/core/edit/IPageControl;)V
    .locals 3

    .line 1
    new-instance v0, Lp5/f1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lp5/f1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lp5/g1;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Lp5/g1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;)V

    .line 9
    .line 10
    .line 11
    new-instance v2, Lp5/h1;

    .line 12
    .line 13
    invoke-direct {v2, p0}, Lp5/h1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1, v0, v1, v2}, Lp5/x1;->c(Lcom/zykj/blackboard/core/edit/IPageControl;Lx7/a;Lx7/p;Lx7/a;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final Z0(I)V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Li8/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/view/board/board/BoardViewModel$updatePenColorLevel$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p1, p0, v1}, Lcom/zykj/view/board/board/BoardViewModel$updatePenColorLevel$1;-><init>(ILcom/zykj/view/board/board/BoardViewModel;Lm7/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final a1(I)V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Li8/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/view/board/board/BoardViewModel$updatePenSizeLevel$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, p1, v1}, Lcom/zykj/view/board/board/BoardViewModel$updatePenSizeLevel$1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;ILm7/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final b1(Lcom/zykj/view/board/board/u;)V
    .locals 7

    .line 1
    const-string v0, "penType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Li8/b0;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v4, Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {v4, p0, p1, v0}, Lcom/zykj/view/board/board/BoardViewModel$updatePenType$1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;Lcom/zykj/view/board/board/u;Lm7/c;)V

    .line 14
    .line 15
    .line 16
    const/4 v5, 0x3

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static/range {v1 .. v6}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final c1(Z)V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->j:Ll8/h;

    .line 2
    .line 3
    :goto_0
    invoke-interface {v0}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, Lcom/zykj/view/board/board/p;

    .line 9
    .line 10
    const/16 v9, 0x2f

    .line 11
    .line 12
    const/4 v10, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v8, 0x0

    .line 18
    move v7, p1

    .line 19
    invoke-static/range {v2 .. v10}, Lcom/zykj/view/board/board/p;->b(Lcom/zykj/view/board/board/p;ZZZZZLcom/zykj/view/board/board/q;ILjava/lang/Object;)Lcom/zykj/view/board/board/p;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {v0, v1, p1}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->K()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    invoke-virtual {p1, v7}, Lcom/zykj/blackboard/bean/BoardConfig;->setFingerDraw(Z)V

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {p1}, La6/n;->q(Ljava/lang/Boolean;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    move p1, v7

    .line 47
    goto :goto_0
.end method

.method public final d0(Lcom/zykj/blackboard/bean/BoardConfig;)V
    .locals 7

    .line 1
    invoke-static {}, La6/n;->a()Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {}, Lcom/zykj/view/board/board/h;->a()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    move v3, v1

    .line 21
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    const/4 v5, -0x1

    .line 26
    if-eqz v4, :cond_1

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    check-cast v4, Lcom/zykj/view/board/board/b;

    .line 33
    .line 34
    invoke-virtual {v4}, Lcom/zykj/view/board/board/b;->a()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-ne v4, v0, :cond_0

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    move v3, v5

    .line 45
    :goto_1
    if-ne v3, v5, :cond_3

    .line 46
    .line 47
    :cond_2
    move v3, v1

    .line 48
    :cond_3
    invoke-static {}, Lcom/zykj/view/board/board/h;->a()Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Lcom/zykj/view/board/board/b;

    .line 57
    .line 58
    iget-object v2, p0, Lcom/zykj/view/board/board/BoardViewModel;->r:Ll8/h;

    .line 59
    .line 60
    :cond_4
    invoke-interface {v2}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    move-object v4, v3

    .line 65
    check-cast v4, Lcom/zykj/view/board/board/a;

    .line 66
    .line 67
    const/4 v5, 0x0

    .line 68
    const/4 v6, 0x1

    .line 69
    invoke-static {v4, v1, v0, v6, v5}, Lcom/zykj/view/board/board/a;->b(Lcom/zykj/view/board/board/a;ZLcom/zykj/view/board/board/b;ILjava/lang/Object;)Lcom/zykj/view/board/board/a;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-interface {v2, v3, v4}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v3, :cond_4

    .line 78
    .line 79
    invoke-virtual {v0}, Lcom/zykj/view/board/board/b;->a()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    invoke-virtual {p1, v1}, Lcom/zykj/blackboard/bean/BoardConfig;->setBackgroundColor(I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BoardConfig;->getBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {v0}, Lcom/zykj/view/board/board/b;->b()I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    invoke-virtual {p1, v1}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->setLineColor(I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Lcom/zykj/view/board/board/b;->d()Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {p1, v1}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->setLineType(Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Lcom/zykj/view/board/board/b;->c()F

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->setLineSpace(F)V

    .line 109
    .line 110
    .line 111
    return-void
.end method

.method public final e0(Lcom/zykj/blackboard/core/edit/IBoardControl;ZJ)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v2, p3

    .line 6
    .line 7
    const-string v4, "boardControl"

    .line 8
    .line 9
    invoke-static {v1, v4}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v4, "initBoardControl Start"

    .line 13
    .line 14
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-static {v4}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iput-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->c:Lcom/zykj/blackboard/core/edit/IBoardControl;

    .line 22
    .line 23
    iget-object v4, v0, Lcom/zykj/view/board/board/BoardViewModel;->t:Ll8/h;

    .line 24
    .line 25
    :cond_0
    invoke-interface {v4}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    move-object v6, v5

    .line 30
    check-cast v6, Lcom/zykj/view/board/board/m;

    .line 31
    .line 32
    const/16 v16, 0x1fb

    .line 33
    .line 34
    const/16 v17, 0x0

    .line 35
    .line 36
    const/4 v7, 0x0

    .line 37
    const/4 v8, 0x0

    .line 38
    const/4 v10, 0x0

    .line 39
    const/4 v11, 0x0

    .line 40
    const/4 v12, 0x0

    .line 41
    const/4 v13, 0x0

    .line 42
    const/4 v14, 0x0

    .line 43
    const/4 v15, 0x0

    .line 44
    move/from16 v9, p2

    .line 45
    .line 46
    invoke-static/range {v6 .. v17}, Lcom/zykj/view/board/board/m;->b(Lcom/zykj/view/board/board/m;Lcom/zykj/view/board/board/r;Lcom/zykj/view/board/board/g;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/m;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    invoke-interface {v4, v5, v6}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-eqz v5, :cond_0

    .line 55
    .line 56
    const-wide/16 v4, 0x0

    .line 57
    .line 58
    cmp-long v4, v2, v4

    .line 59
    .line 60
    if-lez v4, :cond_2

    .line 61
    .line 62
    iget-object v4, v0, Lcom/zykj/view/board/board/BoardViewModel;->v:Ll8/h;

    .line 63
    .line 64
    :cond_1
    invoke-interface {v4}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    move-object v6, v5

    .line 69
    check-cast v6, Lcom/zykj/view/board/board/v;

    .line 70
    .line 71
    sget-object v7, Lcom/zykj/view/board/board/w$a;->f:Lcom/zykj/view/board/board/w$a;

    .line 72
    .line 73
    sget-object v8, La6/o;->a:La6/o;

    .line 74
    .line 75
    invoke-virtual {v8, v2, v3}, La6/o;->b(J)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    const/4 v10, 0x2

    .line 80
    const/4 v11, 0x0

    .line 81
    const/4 v8, 0x0

    .line 82
    invoke-static/range {v6 .. v11}, Lcom/zykj/view/board/board/v;->b(Lcom/zykj/view/board/board/v;Lcom/zykj/view/board/board/w;ZLjava/lang/String;ILjava/lang/Object;)Lcom/zykj/view/board/board/v;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-interface {v4, v5, v6}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-eqz v5, :cond_1

    .line 91
    .line 92
    :cond_2
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->K()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    const/4 v3, 0x1

    .line 97
    if-eqz v2, :cond_4

    .line 98
    .line 99
    const/high16 v4, 0x42400000    # 48.0f

    .line 100
    .line 101
    invoke-virtual {v2, v4}, Lcom/zykj/blackboard/bean/BoardConfig;->setSelectIconWidth(F)V

    .line 102
    .line 103
    .line 104
    iget-object v4, v0, Lcom/zykj/view/board/board/BoardViewModel;->a:Lp5/b1;

    .line 105
    .line 106
    if-eqz v4, :cond_3

    .line 107
    .line 108
    invoke-virtual {v4}, Lp5/b1;->b()I

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    invoke-virtual {v2, v4}, Lcom/zykj/blackboard/bean/BoardConfig;->setMaxImageSize(I)V

    .line 113
    .line 114
    .line 115
    :cond_3
    invoke-static {}, La6/n;->h()Ljava/lang/Boolean;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 120
    .line 121
    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    xor-int/2addr v4, v3

    .line 126
    invoke-virtual {v0, v4}, Lcom/zykj/view/board/board/BoardViewModel;->c1(Z)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v2}, Lcom/zykj/view/board/board/BoardViewModel;->D0(Lcom/zykj/blackboard/bean/BoardConfig;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v2}, Lcom/zykj/view/board/board/BoardViewModel;->d0(Lcom/zykj/blackboard/bean/BoardConfig;)V

    .line 133
    .line 134
    .line 135
    iget-object v4, v0, Lcom/zykj/view/board/board/BoardViewModel;->e:Lcom/zykj/blackboard/listener/ImageCropView;

    .line 136
    .line 137
    invoke-virtual {v2, v4}, Lcom/zykj/blackboard/bean/BoardConfig;->setImageCropView(Lcom/zykj/blackboard/listener/ImageCropView;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, v2}, Lcom/zykj/view/board/board/BoardViewModel;->q0(Lcom/zykj/blackboard/bean/BoardConfig;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v2}, Lcom/zykj/view/board/board/BoardViewModel;->i0(Lcom/zykj/blackboard/bean/BoardConfig;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, v2}, Lcom/zykj/view/board/board/BoardViewModel;->s0(Lcom/zykj/blackboard/bean/BoardConfig;)V

    .line 147
    .line 148
    .line 149
    sget-object v2, Lcom/zykj/view/board/board/q$c;->e:Lcom/zykj/view/board/board/q$c;

    .line 150
    .line 151
    invoke-virtual {v0, v2}, Lcom/zykj/view/board/board/BoardViewModel;->Y0(Lcom/zykj/view/board/board/q;)V

    .line 152
    .line 153
    .line 154
    :cond_4
    new-instance v2, Lp5/k1;

    .line 155
    .line 156
    invoke-direct {v2, v0}, Lp5/k1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->S()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    if-eqz v4, :cond_5

    .line 164
    .line 165
    const-string v1, "pageControl is not Null"

    .line 166
    .line 167
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-static {v1}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    invoke-interface {v2, v4}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    goto :goto_0

    .line 178
    :cond_5
    const-string v4, "pageControl is Null"

    .line 179
    .line 180
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    invoke-static {v4}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    new-instance v4, Lp5/l1;

    .line 188
    .line 189
    invoke-direct {v4, v0, v2}, Lp5/l1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;Lx7/l;)V

    .line 190
    .line 191
    .line 192
    const/4 v2, 0x0

    .line 193
    const/4 v5, 0x0

    .line 194
    invoke-static {v1, v5, v4, v3, v2}, Lcom/zykj/blackboard/core/edit/IBoardControl$DefaultImpls;->createPage$default(Lcom/zykj/blackboard/core/edit/IBoardControl;ZLx7/a;ILjava/lang/Object;)Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 195
    .line 196
    .line 197
    :goto_0
    const-string v1, "initBoardControl Finished"

    .line 198
    .line 199
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-static {v1}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    return-void
.end method

.method public final e1(Lcom/zykj/view/board/board/d;)V
    .locals 14

    .line 1
    const-string v0, "boardViewConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->j:Ll8/h;

    .line 7
    .line 8
    :cond_0
    invoke-interface {v0}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    move-object v2, v1

    .line 13
    check-cast v2, Lcom/zykj/view/board/board/p;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/zykj/view/board/board/d;->h()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-virtual {p1}, Lcom/zykj/view/board/board/d;->j()Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    const/16 v9, 0x3c

    .line 24
    .line 25
    const/4 v10, 0x0

    .line 26
    const/4 v5, 0x0

    .line 27
    const/4 v6, 0x0

    .line 28
    const/4 v7, 0x0

    .line 29
    const/4 v8, 0x0

    .line 30
    invoke-static/range {v2 .. v10}, Lcom/zykj/view/board/board/p;->b(Lcom/zykj/view/board/board/p;ZZZZZLcom/zykj/view/board/board/q;ILjava/lang/Object;)Lcom/zykj/view/board/board/p;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-interface {v0, v1, v2}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardViewModel;->l:Ll8/h;

    .line 41
    .line 42
    :cond_1
    invoke-interface {v1}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    move-object v2, v0

    .line 47
    check-cast v2, Lcom/zykj/view/board/board/t;

    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/zykj/view/board/board/d;->d()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    invoke-virtual {p1}, Lcom/zykj/view/board/board/d;->g()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    const/16 v8, 0x1c

    .line 58
    .line 59
    const/4 v9, 0x0

    .line 60
    const/4 v5, 0x0

    .line 61
    const/4 v6, 0x0

    .line 62
    const/4 v7, 0x0

    .line 63
    invoke-static/range {v2 .. v9}, Lcom/zykj/view/board/board/t;->b(Lcom/zykj/view/board/board/t;ZZLcom/zykj/view/board/board/u;ILcom/zykj/view/board/board/s;ILjava/lang/Object;)Lcom/zykj/view/board/board/t;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-interface {v1, v0, v2}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_1

    .line 72
    .line 73
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->p:Ll8/h;

    .line 74
    .line 75
    :cond_2
    invoke-interface {v0}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    move-object v2, v1

    .line 80
    check-cast v2, Lcom/zykj/view/board/board/n;

    .line 81
    .line 82
    invoke-virtual {p1}, Lcom/zykj/view/board/board/d;->e()Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    invoke-virtual {p1}, Lcom/zykj/view/board/board/d;->c()Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    invoke-virtual {p1}, Lcom/zykj/view/board/board/d;->i()Z

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    invoke-virtual {p1}, Lcom/zykj/view/board/board/d;->f()Z

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    const/16 v8, 0x10

    .line 99
    .line 100
    const/4 v9, 0x0

    .line 101
    const/4 v7, 0x0

    .line 102
    invoke-static/range {v2 .. v9}, Lcom/zykj/view/board/board/n;->b(Lcom/zykj/view/board/board/n;ZZZZLcom/zykj/view/board/board/o;ILjava/lang/Object;)Lcom/zykj/view/board/board/n;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-interface {v0, v1, v2}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-eqz v1, :cond_2

    .line 111
    .line 112
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardViewModel;->r:Ll8/h;

    .line 113
    .line 114
    :cond_3
    invoke-interface {v1}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    move-object v2, v0

    .line 119
    check-cast v2, Lcom/zykj/view/board/board/a;

    .line 120
    .line 121
    invoke-virtual {p1}, Lcom/zykj/view/board/board/d;->b()Z

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    const/4 v4, 0x2

    .line 126
    const/4 v5, 0x0

    .line 127
    invoke-static {v2, v3, v5, v4, v5}, Lcom/zykj/view/board/board/a;->b(Lcom/zykj/view/board/board/a;ZLcom/zykj/view/board/board/b;ILjava/lang/Object;)Lcom/zykj/view/board/board/a;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-interface {v1, v0, v2}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_3

    .line 136
    .line 137
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->t:Ll8/h;

    .line 138
    .line 139
    :cond_4
    invoke-interface {v0}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    move-object v2, v1

    .line 144
    check-cast v2, Lcom/zykj/view/board/board/m;

    .line 145
    .line 146
    invoke-virtual {p1}, Lcom/zykj/view/board/board/d;->a()Lcom/zykj/view/board/board/g;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    const/16 v12, 0x1fd

    .line 151
    .line 152
    const/4 v13, 0x0

    .line 153
    const/4 v3, 0x0

    .line 154
    const/4 v5, 0x0

    .line 155
    const/4 v6, 0x0

    .line 156
    const/4 v7, 0x0

    .line 157
    const/4 v8, 0x0

    .line 158
    const/4 v9, 0x0

    .line 159
    const/4 v10, 0x0

    .line 160
    const/4 v11, 0x0

    .line 161
    invoke-static/range {v2 .. v13}, Lcom/zykj/view/board/board/m;->b(Lcom/zykj/view/board/board/m;Lcom/zykj/view/board/board/r;Lcom/zykj/view/board/board/g;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/m;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    invoke-interface {v0, v1, v2}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    if-eqz v1, :cond_4

    .line 170
    .line 171
    return-void
.end method

.method public final f1(Z)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->f:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-static {}, Lcom/zykj/view/board/board/h;->e()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    sub-int/2addr v3, v2

    .line 17
    if-ge v1, v3, :cond_0

    .line 18
    .line 19
    iget v3, v0, Lcom/zykj/view/board/board/BoardViewModel;->f:I

    .line 20
    .line 21
    add-int/2addr v3, v2

    .line 22
    iput v3, v0, Lcom/zykj/view/board/board/BoardViewModel;->f:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    if-nez p1, :cond_1

    .line 26
    .line 27
    iget v3, v0, Lcom/zykj/view/board/board/BoardViewModel;->f:I

    .line 28
    .line 29
    if-lez v3, :cond_1

    .line 30
    .line 31
    add-int/lit8 v3, v3, -0x1

    .line 32
    .line 33
    iput v3, v0, Lcom/zykj/view/board/board/BoardViewModel;->f:I

    .line 34
    .line 35
    :cond_1
    :goto_0
    iget v3, v0, Lcom/zykj/view/board/board/BoardViewModel;->f:I

    .line 36
    .line 37
    if-ne v1, v3, :cond_2

    .line 38
    .line 39
    goto/16 :goto_4

    .line 40
    .line 41
    :cond_2
    invoke-static {}, Lcom/zykj/view/board/board/h;->e()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget v3, v0, Lcom/zykj/view/board/board/BoardViewModel;->f:I

    .line 46
    .line 47
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Lcom/zykj/view/board/board/x;

    .line 52
    .line 53
    invoke-virtual {v1}, Lcom/zykj/view/board/board/x;->a()F

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->S()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    if-nez v3, :cond_3

    .line 62
    .line 63
    goto/16 :goto_4

    .line 64
    .line 65
    :cond_3
    iget-object v4, v0, Lcom/zykj/view/board/board/BoardViewModel;->g:Landroid/graphics/PointF;

    .line 66
    .line 67
    iget v5, v4, Landroid/graphics/PointF;->x:F

    .line 68
    .line 69
    iget v4, v4, Landroid/graphics/PointF;->y:F

    .line 70
    .line 71
    invoke-interface {v3, v5, v4, v1}, Lcom/zykj/blackboard/core/edit/IPageControl;->zoomLevel(FFF)V

    .line 72
    .line 73
    .line 74
    invoke-interface {v3}, Lcom/zykj/blackboard/core/edit/IPageControl;->getMoveVerticalProgress()F

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    invoke-interface {v3}, Lcom/zykj/blackboard/core/edit/IPageControl;->getMoveHorizontalProgress()F

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    const/high16 v6, 0x3f800000    # 1.0f

    .line 83
    .line 84
    cmpl-float v7, v4, v6

    .line 85
    .line 86
    const/4 v8, 0x0

    .line 87
    if-lez v7, :cond_4

    .line 88
    .line 89
    move v7, v6

    .line 90
    goto :goto_1

    .line 91
    :cond_4
    cmpg-float v7, v4, v8

    .line 92
    .line 93
    if-gez v7, :cond_5

    .line 94
    .line 95
    move v7, v8

    .line 96
    goto :goto_1

    .line 97
    :cond_5
    move v7, v4

    .line 98
    :goto_1
    cmpl-float v9, v5, v6

    .line 99
    .line 100
    if-lez v9, :cond_6

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_6
    cmpg-float v9, v5, v8

    .line 104
    .line 105
    if-gez v9, :cond_7

    .line 106
    .line 107
    move v6, v8

    .line 108
    goto :goto_2

    .line 109
    :cond_7
    cmpg-float v6, v1, v6

    .line 110
    .line 111
    if-gtz v6, :cond_8

    .line 112
    .line 113
    const/high16 v6, 0x3f000000    # 0.5f

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_8
    move v6, v5

    .line 117
    :goto_2
    cmpg-float v4, v7, v4

    .line 118
    .line 119
    if-nez v4, :cond_9

    .line 120
    .line 121
    cmpg-float v4, v6, v5

    .line 122
    .line 123
    if-nez v4, :cond_9

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_9
    invoke-interface {v3}, Lcom/zykj/blackboard/core/edit/IPageControl;->areaMoveStart()V

    .line 127
    .line 128
    .line 129
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    invoke-interface {v3, v4, v5}, Lcom/zykj/blackboard/core/edit/IPageControl;->areaMoveEnd(Ljava/lang/Float;Ljava/lang/Float;)V

    .line 138
    .line 139
    .line 140
    :goto_3
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->K()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    if-nez v3, :cond_a

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_a
    int-to-float v2, v2

    .line 148
    invoke-virtual {v3}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getMaxHeightTimes()I

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    int-to-float v4, v4

    .line 157
    mul-float/2addr v4, v1

    .line 158
    div-float v11, v2, v4

    .line 159
    .line 160
    invoke-virtual {v3}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    invoke-virtual {v3}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getMaxWidthTimes()I

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    int-to-float v3, v3

    .line 169
    mul-float/2addr v3, v1

    .line 170
    div-float v14, v2, v3

    .line 171
    .line 172
    iget-object v1, v0, Lcom/zykj/view/board/board/BoardViewModel;->t:Ll8/h;

    .line 173
    .line 174
    :cond_b
    invoke-interface {v1}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    move-object v5, v2

    .line 179
    check-cast v5, Lcom/zykj/view/board/board/m;

    .line 180
    .line 181
    const/16 v15, 0xdf

    .line 182
    .line 183
    const/16 v16, 0x0

    .line 184
    .line 185
    const/4 v6, 0x0

    .line 186
    const/4 v7, 0x0

    .line 187
    const/4 v8, 0x0

    .line 188
    const/4 v9, 0x0

    .line 189
    const/4 v10, 0x0

    .line 190
    const/4 v12, 0x0

    .line 191
    const/4 v13, 0x0

    .line 192
    invoke-static/range {v5 .. v16}, Lcom/zykj/view/board/board/m;->b(Lcom/zykj/view/board/board/m;Lcom/zykj/view/board/board/r;Lcom/zykj/view/board/board/g;ZZFFZFFILjava/lang/Object;)Lcom/zykj/view/board/board/m;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    invoke-interface {v1, v2, v3}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    if-eqz v2, :cond_b

    .line 201
    .line 202
    :goto_4
    return-void
.end method

.method public final h0(Lp5/a;)V
    .locals 1

    .line 1
    const-string v0, "boardCallbackConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel;->b:Lp5/a;

    .line 7
    .line 8
    return-void
.end method

.method public final i0(Lcom/zykj/blackboard/bean/BoardConfig;)V
    .locals 5

    .line 1
    invoke-static {}, La6/n;->b()Ljava/lang/Float;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_3

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-static {}, Lcom/zykj/view/board/board/h;->b()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    move v2, v0

    .line 21
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    const/4 v4, -0x1

    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Lcom/zykj/view/board/board/j;

    .line 33
    .line 34
    invoke-virtual {v3}, Lcom/zykj/view/board/board/j;->b()F

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    cmpg-float v3, v3, p1

    .line 39
    .line 40
    if-nez v3, :cond_0

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move v2, v4

    .line 47
    :goto_1
    if-ne v2, v4, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move v0, v2

    .line 51
    :cond_3
    :goto_2
    invoke-static {}, Lcom/zykj/view/board/board/h;->b()Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, Lcom/zykj/view/board/board/j;

    .line 60
    .line 61
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->n:Ll8/h;

    .line 62
    .line 63
    :cond_4
    invoke-interface {v0}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    move-object v2, v1

    .line 68
    check-cast v2, Lcom/zykj/view/board/board/i;

    .line 69
    .line 70
    invoke-virtual {v2, p1}, Lcom/zykj/view/board/board/i;->a(Lcom/zykj/view/board/board/j;)Lcom/zykj/view/board/board/i;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-interface {v0, v1, v2}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_4

    .line 79
    .line 80
    return-void
.end method

.method public final j0(Lcom/zykj/blackboard/core/edit/IPageControl;)V
    .locals 1

    .line 1
    new-instance v0, Lp5/i1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lp5/i1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lp5/x1;->b(Lcom/zykj/blackboard/core/edit/IPageControl;Lx7/l;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final l0(Lcom/zykj/blackboard/core/edit/IPageControl;)V
    .locals 1

    .line 1
    new-instance v0, Lp5/d1;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lp5/d1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;Lcom/zykj/blackboard/core/edit/IPageControl;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->setGeometryCreateListener(Lx7/l;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final n0(Lcom/zykj/blackboard/core/edit/IPageControl;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/view/board/board/BoardViewModel$b;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/view/board/board/BoardViewModel$b;-><init>(Lcom/zykj/view/board/board/BoardViewModel;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->addGraphDeleteListener(Lcom/zykj/blackboard/listener/GraphDeleteListener;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final o0(Lcom/zykj/blackboard/core/edit/IPageControl;)V
    .locals 1

    .line 1
    new-instance v0, Lp5/e1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lp5/e1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lp5/x1;->d(Lcom/zykj/blackboard/core/edit/IPageControl;Lx7/l;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final q0(Lcom/zykj/blackboard/bean/BoardConfig;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->a:Lp5/b1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {v0}, Lp5/b1;->d()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/bean/MoveActionConfig;->setMoveActionEnable(Z)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-virtual {p1, v1}, Lcom/zykj/blackboard/bean/MoveActionConfig;->setMoveActionEnable(Z)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v1}, Lcom/zykj/blackboard/bean/MoveActionConfig;->setVerticalTranslate(Z)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v1}, Lcom/zykj/blackboard/bean/MoveActionConfig;->setHorizontalTranslate(Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v1}, Lcom/zykj/blackboard/bean/MoveActionConfig;->setMaxWidthTimes(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lp5/b1;->a()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/bean/MoveActionConfig;->setMaxHeightTimes(I)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final r0(Lcom/zykj/blackboard/core/edit/IPageControl;)V
    .locals 1

    .line 1
    const-string v0, "initPageControl Start"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->n0(Lcom/zykj/blackboard/core/edit/IPageControl;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->t0(Lcom/zykj/blackboard/core/edit/IPageControl;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->o0(Lcom/zykj/blackboard/core/edit/IPageControl;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->A0(Lcom/zykj/blackboard/core/edit/IPageControl;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->l0(Lcom/zykj/blackboard/core/edit/IPageControl;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->Z(Lcom/zykj/blackboard/core/edit/IPageControl;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->j0(Lcom/zykj/blackboard/core/edit/IPageControl;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->x0(Lcom/zykj/blackboard/core/edit/IPageControl;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->G0()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->H0()V

    .line 38
    .line 39
    .line 40
    const-string p1, "initPageControl Finished"

    .line 41
    .line 42
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {p1}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final s0(Lcom/zykj/blackboard/bean/BoardConfig;)V
    .locals 9

    .line 1
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel;->l:Ll8/h;

    .line 2
    .line 3
    :cond_0
    invoke-interface {p1}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lcom/zykj/view/board/board/t;

    .line 9
    .line 10
    invoke-static {}, Lcom/zykj/view/board/board/h;->d()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-static {}, La6/n;->e()Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    const/4 v4, 0x0

    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move v3, v4

    .line 27
    :goto_0
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Lcom/zykj/view/board/board/u;

    .line 32
    .line 33
    invoke-static {}, La6/n;->d()Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    :cond_2
    move v5, v4

    .line 44
    invoke-static {}, Lcom/zykj/view/board/board/h;->c()Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    :cond_3
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-eqz v6, :cond_5

    .line 57
    .line 58
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    move-object v7, v6

    .line 63
    check-cast v7, Lcom/zykj/view/board/board/s;

    .line 64
    .line 65
    invoke-virtual {v7}, Lcom/zykj/view/board/board/s;->a()I

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    invoke-static {}, La6/n;->c()Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    if-nez v8, :cond_4

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_4
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 77
    .line 78
    .line 79
    move-result v8

    .line 80
    if-ne v7, v8, :cond_3

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_5
    const/4 v6, 0x0

    .line 84
    :goto_2
    check-cast v6, Lcom/zykj/view/board/board/s;

    .line 85
    .line 86
    if-nez v6, :cond_6

    .line 87
    .line 88
    invoke-static {v3}, Li7/f0;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    move-object v6, v3

    .line 93
    check-cast v6, Lcom/zykj/view/board/board/s;

    .line 94
    .line 95
    :cond_6
    const/4 v7, 0x3

    .line 96
    const/4 v8, 0x0

    .line 97
    move-object v4, v2

    .line 98
    const/4 v2, 0x0

    .line 99
    const/4 v3, 0x0

    .line 100
    invoke-static/range {v1 .. v8}, Lcom/zykj/view/board/board/t;->b(Lcom/zykj/view/board/board/t;ZZLcom/zykj/view/board/board/u;ILcom/zykj/view/board/board/s;ILjava/lang/Object;)Lcom/zykj/view/board/board/t;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-interface {p1, v0, v1}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_0

    .line 109
    .line 110
    return-void
.end method

.method public final t0(Lcom/zykj/blackboard/core/edit/IPageControl;)V
    .locals 3

    .line 1
    new-instance v0, Lp5/m1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lp5/m1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lp5/n1;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Lp5/n1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;)V

    .line 9
    .line 10
    .line 11
    new-instance v2, Lp5/o1;

    .line 12
    .line 13
    invoke-direct {v2, p0}, Lp5/o1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1, v0, v1, v2}, Lp5/x1;->e(Lcom/zykj/blackboard/core/edit/IPageControl;Lx7/a;Lx7/l;Lx7/a;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final x(Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;ZLjava/lang/String;Lx7/l;)V
    .locals 9

    .line 1
    const-string v0, "scaleTypeEnum"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "filename"

    .line 7
    .line 8
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object v2, p1

    .line 12
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Li8/b0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    new-instance v0, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;

    .line 17
    .line 18
    const/4 v8, 0x0

    .line 19
    move-object v1, p0

    .line 20
    move-object v5, p2

    .line 21
    move-object v4, p3

    .line 22
    move v7, p4

    .line 23
    move-object v3, p5

    .line 24
    move-object v6, p6

    .line 25
    invoke-direct/range {v0 .. v8}, Lcom/zykj/view/board/board/BoardViewModel$addImageGraph$1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;Ljava/lang/String;Lx7/l;ZLm7/c;)V

    .line 26
    .line 27
    .line 28
    move-object p4, v0

    .line 29
    const/4 p5, 0x3

    .line 30
    const/4 p6, 0x0

    .line 31
    const/4 p2, 0x0

    .line 32
    const/4 p3, 0x0

    .line 33
    invoke-static/range {p1 .. p6}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final x0(Lcom/zykj/blackboard/core/edit/IPageControl;)V
    .locals 1

    .line 1
    new-instance v0, Lp5/j1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lp5/j1;-><init>(Lcom/zykj/view/board/board/BoardViewModel;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lp5/x1;->a(Lcom/zykj/blackboard/core/edit/IPageControl;Lx7/p;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final z(Ljava/lang/String;)V
    .locals 12

    .line 1
    const-string v0, "content"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/view/board/board/BoardViewModel;->S()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget-object v3, Lcom/zykj/board/EzyPositionEnum$PositionEnum;->f:Lcom/zykj/board/EzyPositionEnum$PositionEnum;

    .line 14
    .line 15
    const/4 v5, 0x4

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    move-object v2, p1

    .line 19
    invoke-static/range {v1 .. v6}, Lcom/zykj/blackboard/core/edit/IPageControl$DefaultImpls;->addText$default(Lcom/zykj/blackboard/core/edit/IPageControl;Ljava/lang/String;Lcom/zykj/board/EzyPositionEnum$PositionEnum;IILjava/lang/Object;)Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel;->j:Ll8/h;

    .line 26
    .line 27
    :cond_1
    invoke-interface {v0}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    move-object v3, v2

    .line 32
    check-cast v3, Lcom/zykj/view/board/board/p;

    .line 33
    .line 34
    sget-object v9, Lcom/zykj/view/board/board/q$d;->e:Lcom/zykj/view/board/board/q$d;

    .line 35
    .line 36
    const/16 v10, 0x1f

    .line 37
    .line 38
    const/4 v11, 0x0

    .line 39
    const/4 v4, 0x0

    .line 40
    const/4 v5, 0x0

    .line 41
    const/4 v6, 0x0

    .line 42
    const/4 v7, 0x0

    .line 43
    const/4 v8, 0x0

    .line 44
    invoke-static/range {v3 .. v11}, Lcom/zykj/view/board/board/p;->b(Lcom/zykj/view/board/board/p;ZZZZZLcom/zykj/view/board/board/q;ILjava/lang/Object;)Lcom/zykj/view/board/board/p;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-interface {v0, v2, v3}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_1

    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/graph/Graph;->getId()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {p1}, Li7/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-interface {v1, p1}, Lcom/zykj/blackboard/core/edit/IPageControl;->newSelectGraph(Ljava/util/List;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    :goto_0
    return-void
.end method

.method public final z0(Lp5/b1;)V
    .locals 1

    .line 1
    const-string v0, "boardSketchConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel;->a:Lp5/b1;

    .line 7
    .line 8
    return-void
.end method
