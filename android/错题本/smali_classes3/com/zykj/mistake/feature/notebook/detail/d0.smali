.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 1
    iput p6, p0, Lcom/zykj/mistake/feature/notebook/detail/d0;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/d0;->d:Ljava/lang/Object;

    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/d0;->e:Ljava/lang/Object;

    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/d0;->f:Ljava/lang/Object;

    iput-object p4, p0, Lcom/zykj/mistake/feature/notebook/detail/d0;->b:Ljava/lang/Object;

    iput p5, p0, Lcom/zykj/mistake/feature/notebook/detail/d0;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;I)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lcom/zykj/mistake/feature/notebook/detail/d0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/d0;->d:Ljava/lang/Object;

    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/d0;->b:Ljava/lang/Object;

    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/d0;->e:Ljava/lang/Object;

    iput-object p4, p0, Lcom/zykj/mistake/feature/notebook/detail/d0;->f:Ljava/lang/Object;

    iput p5, p0, Lcom/zykj/mistake/feature/notebook/detail/d0;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/notebook/detail/d0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/d0;->d:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Lw4/c;

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/d0;->e:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v2, v0

    .line 14
    check-cast v2, Lw4/a;

    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/d0;->f:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v3, v0

    .line 19
    check-cast v3, Lt4/e;

    .line 20
    .line 21
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/d0;->b:Ljava/lang/Object;

    .line 22
    .line 23
    move-object v4, v0

    .line 24
    check-cast v4, Lr6/e;

    .line 25
    .line 26
    move-object v5, p1

    .line 27
    check-cast v5, Landroidx/compose/runtime/Composer;

    .line 28
    .line 29
    check-cast p2, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    iget p1, p0, Lcom/zykj/mistake/feature/notebook/detail/d0;->c:I

    .line 35
    .line 36
    or-int/lit8 p1, p1, 0x1

    .line 37
    .line 38
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    invoke-static/range {v1 .. v6}, Ly1/a;->b(Lw4/c;Lw4/a;Lt4/e;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    .line 43
    .line 44
    .line 45
    :goto_0
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 46
    .line 47
    return-object p1

    .line 48
    :pswitch_0
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/d0;->d:Ljava/lang/Object;

    .line 49
    .line 50
    move-object v1, v0

    .line 51
    check-cast v1, Ljava/lang/String;

    .line 52
    .line 53
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/d0;->e:Ljava/lang/Object;

    .line 54
    .line 55
    move-object v2, v0

    .line 56
    check-cast v2, Ljava/util/ArrayList;

    .line 57
    .line 58
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/d0;->f:Ljava/lang/Object;

    .line 59
    .line 60
    move-object v3, v0

    .line 61
    check-cast v3, Ljava/util/List;

    .line 62
    .line 63
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/d0;->b:Ljava/lang/Object;

    .line 64
    .line 65
    move-object v4, v0

    .line 66
    check-cast v4, Lr6/e;

    .line 67
    .line 68
    move-object v5, p1

    .line 69
    check-cast v5, Landroidx/compose/runtime/Composer;

    .line 70
    .line 71
    check-cast p2, Ljava/lang/Integer;

    .line 72
    .line 73
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget p1, p0, Lcom/zykj/mistake/feature/notebook/detail/d0;->c:I

    .line 77
    .line 78
    or-int/lit8 p1, p1, 0x1

    .line 79
    .line 80
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    invoke-static/range {v1 .. v6}, Lcom/zykj/mistake/main/drawer/l;->e(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/List;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :pswitch_1
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/d0;->d:Ljava/lang/Object;

    .line 89
    .line 90
    move-object v1, v0

    .line 91
    check-cast v1, Ljava/lang/String;

    .line 92
    .line 93
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/d0;->e:Ljava/lang/Object;

    .line 94
    .line 95
    move-object v2, v0

    .line 96
    check-cast v2, Ljava/lang/String;

    .line 97
    .line 98
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/d0;->f:Ljava/lang/Object;

    .line 99
    .line 100
    move-object v3, v0

    .line 101
    check-cast v3, Ljava/lang/String;

    .line 102
    .line 103
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/d0;->b:Ljava/lang/Object;

    .line 104
    .line 105
    move-object v4, v0

    .line 106
    check-cast v4, Landroidx/compose/ui/Modifier;

    .line 107
    .line 108
    move-object v5, p1

    .line 109
    check-cast v5, Landroidx/compose/runtime/Composer;

    .line 110
    .line 111
    check-cast p2, Ljava/lang/Integer;

    .line 112
    .line 113
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    iget p1, p0, Lcom/zykj/mistake/feature/notebook/detail/d0;->c:I

    .line 117
    .line 118
    or-int/lit8 p1, p1, 0x1

    .line 119
    .line 120
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    invoke-static/range {v1 .. v6}, Lcom/zykj/mistake/feature/review/y;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :pswitch_2
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/d0;->d:Ljava/lang/Object;

    .line 129
    .line 130
    move-object v1, v0

    .line 131
    check-cast v1, Ljava/lang/String;

    .line 132
    .line 133
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/d0;->b:Ljava/lang/Object;

    .line 134
    .line 135
    move-object v2, v0

    .line 136
    check-cast v2, Landroidx/compose/ui/Modifier;

    .line 137
    .line 138
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/d0;->e:Ljava/lang/Object;

    .line 139
    .line 140
    move-object v3, v0

    .line 141
    check-cast v3, Landroidx/compose/ui/Modifier;

    .line 142
    .line 143
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/d0;->f:Ljava/lang/Object;

    .line 144
    .line 145
    move-object v4, v0

    .line 146
    check-cast v4, Landroidx/compose/ui/Modifier;

    .line 147
    .line 148
    move-object v5, p1

    .line 149
    check-cast v5, Landroidx/compose/runtime/Composer;

    .line 150
    .line 151
    check-cast p2, Ljava/lang/Integer;

    .line 152
    .line 153
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    iget p1, p0, Lcom/zykj/mistake/feature/notebook/detail/d0;->c:I

    .line 157
    .line 158
    or-int/lit8 p1, p1, 0x1

    .line 159
    .line 160
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 161
    .line 162
    .line 163
    move-result v6

    .line 164
    invoke-static/range {v1 .. v6}, Lcom/zykj/mistake/feature/notebook/detail/q4;->f(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 165
    .line 166
    .line 167
    goto :goto_0

    .line 168
    :pswitch_3
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/d0;->d:Ljava/lang/Object;

    .line 169
    .line 170
    move-object v1, v0

    .line 171
    check-cast v1, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 172
    .line 173
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/d0;->e:Ljava/lang/Object;

    .line 174
    .line 175
    move-object v2, v0

    .line 176
    check-cast v2, Lcom/zykj/mistake/feature/notebook/detail/a5;

    .line 177
    .line 178
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/d0;->f:Ljava/lang/Object;

    .line 179
    .line 180
    move-object v3, v0

    .line 181
    check-cast v3, Lr6/c;

    .line 182
    .line 183
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/d0;->b:Ljava/lang/Object;

    .line 184
    .line 185
    move-object v4, v0

    .line 186
    check-cast v4, Landroidx/compose/ui/Modifier;

    .line 187
    .line 188
    move-object v5, p1

    .line 189
    check-cast v5, Landroidx/compose/runtime/Composer;

    .line 190
    .line 191
    check-cast p2, Ljava/lang/Integer;

    .line 192
    .line 193
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    iget p1, p0, Lcom/zykj/mistake/feature/notebook/detail/d0;->c:I

    .line 197
    .line 198
    or-int/lit8 p1, p1, 0x1

    .line 199
    .line 200
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 201
    .line 202
    .line 203
    move-result v6

    .line 204
    invoke-static/range {v1 .. v6}, Lcom/zykj/mistake/feature/notebook/detail/g0;->b(Lcom/zykj/mistake/feature/notebook/detail/m3;Lcom/zykj/mistake/feature/notebook/detail/a5;Lr6/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 205
    .line 206
    .line 207
    goto/16 :goto_0

    .line 208
    .line 209
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
