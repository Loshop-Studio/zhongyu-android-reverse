.class public final Lv4/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv4/b$a;
    }
.end annotation


# instance fields
.field public final A:Lv4/d;

.field public B:F

.field public C:Z

.field public D:Z

.field public E:Lt5/b;

.field public F:Ljava/util/List;

.field public G:Ljava/util/List;

.field public final H:F

.field public I:F

.field public J:F

.field public K:Lcom/zykj/blackboard/core/action/GeometryActionEnum;

.field public L:F

.field public M:I

.field public N:F

.field public O:Ljava/util/List;

.field public P:Ljava/util/List;

.field public Q:Ljava/util/List;

.field public R:Lkotlin/jvm/functions/Function1;

.field public S:Lt5/a;

.field public final a:I

.field public final b:I

.field public c:I

.field public d:Z

.field public e:I

.field public f:I

.field public g:F

.field public h:F

.field public i:F

.field public j:Z

.field public k:F

.field public l:F

.field public m:Lcom/zykj/board/EzyModeEnum$ModeEnum;

.field public n:Lt5/c;

.field public o:Landroid/graphics/RectF;

.field public p:Ljava/lang/String;

.field public q:F

.field public r:F

.field public s:F

.field public t:I

.field public u:I

.field public final v:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

.field public w:I

.field public x:I

.field public y:F

.field public z:F


# direct methods
.method public constructor <init>(II)V
    .locals 12

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lv4/b;->a:I

    .line 5
    .line 6
    iput p2, p0, Lv4/b;->b:I

    .line 7
    .line 8
    const/4 p1, 0x3

    .line 9
    iput p1, p0, Lv4/b;->c:I

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Lv4/b;->d:Z

    .line 13
    .line 14
    const/high16 p1, -0x1000000

    .line 15
    .line 16
    iput p1, p0, Lv4/b;->e:I

    .line 17
    .line 18
    iput p1, p0, Lv4/b;->f:I

    .line 19
    .line 20
    const/high16 p2, 0x40a00000    # 5.0f

    .line 21
    .line 22
    iput p2, p0, Lv4/b;->g:F

    .line 23
    .line 24
    iput p2, p0, Lv4/b;->h:F

    .line 25
    .line 26
    const/high16 p2, 0x42200000    # 40.0f

    .line 27
    .line 28
    iput p2, p0, Lv4/b;->i:F

    .line 29
    .line 30
    const/high16 p2, 0x41f00000    # 30.0f

    .line 31
    .line 32
    iput p2, p0, Lv4/b;->k:F

    .line 33
    .line 34
    const/high16 p2, 0x41700000    # 15.0f

    .line 35
    .line 36
    iput p2, p0, Lv4/b;->l:F

    .line 37
    .line 38
    sget-object v0, Lcom/zykj/board/EzyModeEnum$ModeEnum;->c:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 39
    .line 40
    iput-object v0, p0, Lv4/b;->m:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 41
    .line 42
    new-instance v0, Landroid/graphics/RectF;

    .line 43
    .line 44
    const/high16 v1, 0x43c80000    # 400.0f

    .line 45
    .line 46
    const/high16 v2, 0x42c80000    # 100.0f

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    invoke-direct {v0, v3, v3, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, Lv4/b;->o:Landroid/graphics/RectF;

    .line 53
    .line 54
    const-string v0, "\u8bf7\u8f93\u5165\u6587\u5b57"

    .line 55
    .line 56
    iput-object v0, p0, Lv4/b;->p:Ljava/lang/String;

    .line 57
    .line 58
    const/high16 v0, 0x41e00000    # 28.0f

    .line 59
    .line 60
    iput v0, p0, Lv4/b;->q:F

    .line 61
    .line 62
    const/high16 v1, 0x41a00000    # 20.0f

    .line 63
    .line 64
    iput v1, p0, Lv4/b;->r:F

    .line 65
    .line 66
    const/high16 v2, 0x42400000    # 48.0f

    .line 67
    .line 68
    iput v2, p0, Lv4/b;->s:F

    .line 69
    .line 70
    iput p1, p0, Lv4/b;->t:I

    .line 71
    .line 72
    new-instance v3, Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 73
    .line 74
    const/16 v8, 0xf

    .line 75
    .line 76
    const/4 v9, 0x0

    .line 77
    const/4 v4, 0x0

    .line 78
    const/4 v5, 0x0

    .line 79
    const/4 v6, 0x0

    .line 80
    const/4 v7, 0x0

    .line 81
    invoke-direct/range {v3 .. v9}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;-><init>(IFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 82
    .line 83
    .line 84
    iput-object v3, p0, Lv4/b;->v:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 85
    .line 86
    const/4 v2, -0x1

    .line 87
    iput v2, p0, Lv4/b;->w:I

    .line 88
    .line 89
    const/high16 v2, -0x10000

    .line 90
    .line 91
    iput v2, p0, Lv4/b;->x:I

    .line 92
    .line 93
    iput v1, p0, Lv4/b;->y:F

    .line 94
    .line 95
    const/high16 v1, 0x42480000    # 50.0f

    .line 96
    .line 97
    iput v1, p0, Lv4/b;->z:F

    .line 98
    .line 99
    new-instance v2, Lv4/d;

    .line 100
    .line 101
    const/16 v10, 0x7f

    .line 102
    .line 103
    const/4 v11, 0x0

    .line 104
    const/4 v3, 0x0

    .line 105
    const/4 v5, 0x0

    .line 106
    const/4 v6, 0x0

    .line 107
    const/4 v7, 0x0

    .line 108
    const/4 v8, 0x0

    .line 109
    const/4 v9, 0x0

    .line 110
    invoke-direct/range {v2 .. v11}, Lv4/d;-><init>(ZZZZZIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 111
    .line 112
    .line 113
    iput-object v2, p0, Lv4/b;->A:Lv4/d;

    .line 114
    .line 115
    iput v1, p0, Lv4/b;->B:F

    .line 116
    .line 117
    invoke-static {}, Lq5/a;->b()Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    iput-object v1, p0, Lv4/b;->F:Ljava/util/List;

    .line 122
    .line 123
    invoke-static {}, Lq5/a;->b()Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    iput-object v1, p0, Lv4/b;->G:Ljava/util/List;

    .line 128
    .line 129
    const/high16 v1, 0x42700000    # 60.0f

    .line 130
    .line 131
    iput v1, p0, Lv4/b;->H:F

    .line 132
    .line 133
    const/high16 v1, 0x42100000    # 36.0f

    .line 134
    .line 135
    iput v1, p0, Lv4/b;->I:F

    .line 136
    .line 137
    const/high16 v2, 0x3f000000    # 0.5f

    .line 138
    .line 139
    iput v2, p0, Lv4/b;->J:F

    .line 140
    .line 141
    sget-object v2, Lcom/zykj/blackboard/core/action/GeometryActionEnum;->b:Lcom/zykj/blackboard/core/action/GeometryActionEnum;

    .line 142
    .line 143
    iput-object v2, p0, Lv4/b;->K:Lcom/zykj/blackboard/core/action/GeometryActionEnum;

    .line 144
    .line 145
    const/high16 v2, 0x40400000    # 3.0f

    .line 146
    .line 147
    iput v2, p0, Lv4/b;->L:F

    .line 148
    .line 149
    iput p1, p0, Lv4/b;->M:I

    .line 150
    .line 151
    iput v1, p0, Lv4/b;->N:F

    .line 152
    .line 153
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    const/high16 v2, 0x41000000    # 8.0f

    .line 158
    .line 159
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    filled-new-array {p1, v2, p2}, [Ljava/lang/Float;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    iput-object p1, p0, Lv4/b;->O:Ljava/util/List;

    .line 176
    .line 177
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    const/high16 v0, 0x42600000    # 56.0f

    .line 186
    .line 187
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    filled-new-array {p1, p2, v0}, [Ljava/lang/Float;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    iput-object p1, p0, Lv4/b;->P:Ljava/util/List;

    .line 200
    .line 201
    return-void
.end method

.method public static synthetic d0(Lv4/b;ZFFILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const/high16 p2, 0x41f00000    # 30.0f

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    const/high16 p3, 0x41700000    # 15.0f

    .line 12
    .line 13
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lv4/b;->c0(ZFF)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final A()F
    .locals 1

    .line 1
    iget v0, p0, Lv4/b;->B:F

    .line 2
    .line 3
    return v0
.end method

.method public final B()I
    .locals 1

    .line 1
    iget v0, p0, Lv4/b;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public final C()F
    .locals 1

    .line 1
    iget v0, p0, Lv4/b;->k:F

    .line 2
    .line 3
    return v0
.end method

.method public final D()F
    .locals 1

    .line 1
    iget v0, p0, Lv4/b;->l:F

    .line 2
    .line 3
    return v0
.end method

.method public final E()F
    .locals 1

    .line 1
    iget v0, p0, Lv4/b;->h:F

    .line 2
    .line 3
    return v0
.end method

.method public final F()F
    .locals 1

    .line 1
    iget v0, p0, Lv4/b;->H:F

    .line 2
    .line 3
    return v0
.end method

.method public final G()Lt5/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/b;->S:Lt5/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final H()Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/b;->R:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final I()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/b;->Q:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final J()F
    .locals 1

    .line 1
    iget v0, p0, Lv4/b;->I:F

    .line 2
    .line 3
    return v0
.end method

.method public final K()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/b;->F:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final L()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/b;->G:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final M(Z)Ljava/util/List;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lv4/b;->P:Ljava/util/List;

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    iget-object p1, p0, Lv4/b;->O:Ljava/util/List;

    .line 7
    .line 8
    return-object p1
.end method

.method public final N()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/b;->O:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final O()Lt5/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/b;->n:Lt5/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final P()I
    .locals 1

    .line 1
    iget v0, p0, Lv4/b;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public final Q()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lv4/b;->j:Z

    .line 2
    .line 3
    return v0
.end method

.method public final R()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lv4/b;->d:Z

    .line 2
    .line 3
    return v0
.end method

.method public final S()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lv4/b;->D:Z

    .line 2
    .line 3
    return v0
.end method

.method public final T()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lv4/b;->C:Z

    .line 2
    .line 3
    return v0
.end method

.method public final U(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lv4/b;->p:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final V(I)V
    .locals 0

    .line 1
    iput p1, p0, Lv4/b;->t:I

    .line 2
    .line 3
    return-void
.end method

.method public final W(F)V
    .locals 0

    .line 1
    iput p1, p0, Lv4/b;->s:F

    .line 2
    .line 3
    return-void
.end method

.method public final X(F)V
    .locals 0

    .line 1
    iput p1, p0, Lv4/b;->r:F

    .line 2
    .line 3
    return-void
.end method

.method public final Y(F)V
    .locals 0

    .line 1
    iput p1, p0, Lv4/b;->q:F

    .line 2
    .line 3
    return-void
.end method

.method public final Z(I)V
    .locals 0

    .line 1
    iput p1, p0, Lv4/b;->u:I

    .line 2
    .line 3
    return-void
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/b;->p:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final a0(I)V
    .locals 0

    .line 1
    iput p1, p0, Lv4/b;->f:I

    .line 2
    .line 3
    return-void
.end method

.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Lv4/b;->t:I

    .line 2
    .line 3
    return v0
.end method

.method public final b0(F)V
    .locals 0

    .line 1
    iput p1, p0, Lv4/b;->g:F

    .line 2
    .line 3
    return-void
.end method

.method public final c()F
    .locals 1

    .line 1
    iget v0, p0, Lv4/b;->s:F

    .line 2
    .line 3
    return v0
.end method

.method public final c0(ZFF)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lv4/b;->j:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    sget-object v0, Lu5/i;->a:Lu5/i;

    .line 6
    .line 7
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->e:Lcom/zykj/blackboard/utils/EventKey;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lu5/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iput-boolean p1, p0, Lv4/b;->j:Z

    .line 13
    .line 14
    iput p2, p0, Lv4/b;->k:F

    .line 15
    .line 16
    iput p3, p0, Lv4/b;->l:F

    .line 17
    .line 18
    return-void
.end method

.method public final d()F
    .locals 1

    .line 1
    iget v0, p0, Lv4/b;->r:F

    .line 2
    .line 3
    return v0
.end method

.method public final e()F
    .locals 1

    .line 1
    iget v0, p0, Lv4/b;->q:F

    .line 2
    .line 3
    return v0
.end method

.method public final e0(F)V
    .locals 0

    .line 1
    iput p1, p0, Lv4/b;->i:F

    .line 2
    .line 3
    return-void
.end method

.method public final f()Landroid/graphics/RectF;
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/b;->o:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f0(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lv4/b;->d:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    sget-object v0, Lu5/i;->a:Lu5/i;

    .line 6
    .line 7
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->d:Lcom/zykj/blackboard/utils/EventKey;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lu5/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 10
    .line 11
    .line 12
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->e:Lcom/zykj/blackboard/utils/EventKey;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lu5/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iput-boolean p1, p0, Lv4/b;->d:Z

    .line 18
    .line 19
    return-void
.end method

.method public final g()Lv4/a;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final g0(Lcom/zykj/blackboard/core/action/GeometryActionEnum;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lv4/b;->K:Lcom/zykj/blackboard/core/action/GeometryActionEnum;

    .line 7
    .line 8
    return-void
.end method

.method public final h()I
    .locals 1

    .line 1
    iget v0, p0, Lv4/b;->u:I

    .line 2
    .line 3
    return v0
.end method

.method public final h0(I)V
    .locals 0

    .line 1
    iput p1, p0, Lv4/b;->M:I

    .line 2
    .line 3
    return-void
.end method

.method public final i()I
    .locals 1

    .line 1
    iget v0, p0, Lv4/b;->w:I

    .line 2
    .line 3
    return v0
.end method

.method public final i0(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lv4/b;->C:Z

    .line 2
    .line 3
    return-void
.end method

.method public final j()Lcom/zykj/blackboard/bean/BackgroundLineConfig;
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/b;->v:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j0(Lt5/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv4/b;->E:Lt5/b;

    .line 2
    .line 3
    return-void
.end method

.method public final k()I
    .locals 1

    .line 1
    iget v0, p0, Lv4/b;->f:I

    .line 2
    .line 3
    return v0
.end method

.method public final k0(I)V
    .locals 0

    .line 1
    iput p1, p0, Lv4/b;->c:I

    .line 2
    .line 3
    return-void
.end method

.method public final l()F
    .locals 1

    .line 1
    iget v0, p0, Lv4/b;->g:F

    .line 2
    .line 3
    return v0
.end method

.method public final l0(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V
    .locals 2

    .line 1
    const-string v0, "mode"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lv4/b$a;->a:[I

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    aget v0, v0, v1

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    if-eq v0, v1, :cond_4

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    if-eq v0, v1, :cond_3

    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    if-eq v0, v1, :cond_2

    .line 22
    .line 23
    const/4 v1, 0x4

    .line 24
    if-eq v0, v1, :cond_1

    .line 25
    .line 26
    const/4 v1, 0x5

    .line 27
    if-eq v0, v1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    sget-object v0, Lu5/i;->a:Lu5/i;

    .line 31
    .line 32
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->d:Lcom/zykj/blackboard/utils/EventKey;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lu5/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    sget-object v0, Lu5/i;->a:Lu5/i;

    .line 39
    .line 40
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->a:Lcom/zykj/blackboard/utils/EventKey;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Lu5/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 43
    .line 44
    .line 45
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->d:Lcom/zykj/blackboard/utils/EventKey;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Lu5/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    sget-object v0, Lu5/i;->a:Lu5/i;

    .line 52
    .line 53
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->c:Lcom/zykj/blackboard/utils/EventKey;

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Lu5/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 56
    .line 57
    .line 58
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->d:Lcom/zykj/blackboard/utils/EventKey;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Lu5/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    iget-object v0, p0, Lv4/b;->m:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 65
    .line 66
    if-eq v0, p1, :cond_5

    .line 67
    .line 68
    sget-object v0, Lu5/i;->a:Lu5/i;

    .line 69
    .line 70
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->e:Lcom/zykj/blackboard/utils/EventKey;

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Lu5/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    sget-object v0, Lu5/i;->a:Lu5/i;

    .line 77
    .line 78
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->b:Lcom/zykj/blackboard/utils/EventKey;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Lu5/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 81
    .line 82
    .line 83
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->d:Lcom/zykj/blackboard/utils/EventKey;

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Lu5/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 86
    .line 87
    .line 88
    :cond_5
    :goto_0
    iput-object p1, p0, Lv4/b;->m:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 89
    .line 90
    return-void
.end method

.method public final m()I
    .locals 1

    .line 1
    iget v0, p0, Lv4/b;->x:I

    .line 2
    .line 3
    return v0
.end method

.method public final m0(I)V
    .locals 2

    .line 1
    iget v0, p0, Lv4/b;->e:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    sget-object v0, Lu5/i;->a:Lu5/i;

    .line 6
    .line 7
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->d:Lcom/zykj/blackboard/utils/EventKey;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lu5/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 10
    .line 11
    .line 12
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->e:Lcom/zykj/blackboard/utils/EventKey;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lu5/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iput p1, p0, Lv4/b;->e:I

    .line 18
    .line 19
    return-void
.end method

.method public final n()F
    .locals 1

    .line 1
    iget v0, p0, Lv4/b;->z:F

    .line 2
    .line 3
    return v0
.end method

.method public final n0(F)V
    .locals 2

    .line 1
    iget v0, p0, Lv4/b;->h:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object v0, Lu5/i;->a:Lu5/i;

    .line 9
    .line 10
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->d:Lcom/zykj/blackboard/utils/EventKey;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lu5/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 13
    .line 14
    .line 15
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->e:Lcom/zykj/blackboard/utils/EventKey;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lu5/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    iput p1, p0, Lv4/b;->h:F

    .line 21
    .line 22
    return-void
.end method

.method public final o()F
    .locals 1

    .line 1
    iget v0, p0, Lv4/b;->y:F

    .line 2
    .line 3
    return v0
.end method

.method public final o0(Lt5/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv4/b;->S:Lt5/a;

    .line 2
    .line 3
    return-void
.end method

.method public final p()F
    .locals 1

    .line 1
    iget v0, p0, Lv4/b;->i:F

    .line 2
    .line 3
    return v0
.end method

.method public final p0(Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv4/b;->Q:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public final q()Lcom/zykj/blackboard/core/action/GeometryActionEnum;
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/b;->K:Lcom/zykj/blackboard/core/action/GeometryActionEnum;

    .line 2
    .line 3
    return-object v0
.end method

.method public final q0(F)V
    .locals 0

    .line 1
    iput p1, p0, Lv4/b;->I:F

    .line 2
    .line 3
    return-void
.end method

.method public final r()F
    .locals 1

    .line 1
    iget v0, p0, Lv4/b;->N:F

    .line 2
    .line 3
    return v0
.end method

.method public final r0(Ljava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lv4/b;->G:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method

.method public final s()I
    .locals 1

    .line 1
    iget v0, p0, Lv4/b;->M:I

    .line 2
    .line 3
    return v0
.end method

.method public final s0(Lt5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv4/b;->n:Lt5/c;

    .line 2
    .line 3
    return-void
.end method

.method public final t()F
    .locals 1

    .line 1
    iget v0, p0, Lv4/b;->L:F

    .line 2
    .line 3
    return v0
.end method

.method public final u()I
    .locals 1

    .line 1
    iget v0, p0, Lv4/b;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final v()F
    .locals 1

    .line 1
    iget v0, p0, Lv4/b;->J:F

    .line 2
    .line 3
    return v0
.end method

.method public final w()Lt5/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/b;->E:Lt5/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final x()I
    .locals 1

    .line 1
    iget v0, p0, Lv4/b;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public final y()Lcom/zykj/board/EzyModeEnum$ModeEnum;
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/b;->m:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 2
    .line 3
    return-object v0
.end method

.method public final z()Lv4/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/b;->A:Lv4/d;

    .line 2
    .line 3
    return-object v0
.end method
