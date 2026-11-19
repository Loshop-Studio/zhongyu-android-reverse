.class public Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->j(ILandroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Landroid/view/View;

.field public final synthetic d:I

.field public final synthetic e:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;Landroid/view/View;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;->e:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;->c:Landroid/view/View;

    .line 4
    .line 5
    iput p3, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;->d:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;->e:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->a(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;->e:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;->e:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    .line 16
    .line 17
    invoke-static {p1}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->a(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    const/4 v0, 0x1

    .line 22
    const/4 v1, 0x0

    .line 23
    if-ne p1, v0, :cond_3

    .line 24
    .line 25
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;->e:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    .line 26
    .line 27
    invoke-static {p1}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->b(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;)Landroid/util/SparseBooleanArray;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget v2, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;->d:I

    .line 32
    .line 33
    invoke-virtual {p1, v2}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;->e:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    .line 40
    .line 41
    invoke-static {p1}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->c(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_7

    .line 46
    .line 47
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;->e:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    .line 48
    .line 49
    invoke-static {p1}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->b(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;)Landroid/util/SparseBooleanArray;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iget v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;->d:I

    .line 54
    .line 55
    invoke-virtual {p1, v0, v1}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;->c:Landroid/view/View;

    .line 59
    .line 60
    invoke-virtual {p1, v1}, Landroid/view/View;->setSelected(Z)V

    .line 61
    .line 62
    .line 63
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;->e:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    .line 64
    .line 65
    new-instance v0, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->d(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;Ljava/util/List;)Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    .line 71
    .line 72
    .line 73
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;->e:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_1
    move p1, v1

    .line 80
    :goto_0
    iget-object v2, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;->e:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    .line 81
    .line 82
    iget-object v2, v2, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->d:Ll8/a;

    .line 83
    .line 84
    invoke-virtual {v2}, Lz7/b;->getCount()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-ge p1, v2, :cond_2

    .line 89
    .line 90
    iget-object v2, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;->e:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    .line 91
    .line 92
    invoke-static {v2}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->b(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;)Landroid/util/SparseBooleanArray;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-virtual {v2, p1, v1}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 97
    .line 98
    .line 99
    iget-object v2, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;->e:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    .line 100
    .line 101
    invoke-virtual {v2, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-virtual {v2, v1}, Landroid/view/View;->setSelected(Z)V

    .line 106
    .line 107
    .line 108
    add-int/lit8 p1, p1, 0x1

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;->e:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    .line 112
    .line 113
    invoke-static {p1}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->b(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;)Landroid/util/SparseBooleanArray;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    iget v1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;->d:I

    .line 118
    .line 119
    invoke-virtual {p1, v1, v0}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 120
    .line 121
    .line 122
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;->c:Landroid/view/View;

    .line 123
    .line 124
    invoke-virtual {p1, v0}, Landroid/view/View;->setSelected(Z)V

    .line 125
    .line 126
    .line 127
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;->e:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    .line 128
    .line 129
    iget v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;->d:I

    .line 130
    .line 131
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->d(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;Ljava/util/List;)Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    .line 140
    .line 141
    .line 142
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;->e:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    .line 143
    .line 144
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :cond_3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;->e:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    .line 149
    .line 150
    invoke-static {p1}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->a(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;)I

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    const/4 v2, 0x2

    .line 155
    if-ne p1, v2, :cond_7

    .line 156
    .line 157
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;->e:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    .line 158
    .line 159
    invoke-static {p1}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->b(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;)Landroid/util/SparseBooleanArray;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    iget v2, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;->d:I

    .line 164
    .line 165
    invoke-virtual {p1, v2}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    if-eqz p1, :cond_4

    .line 170
    .line 171
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;->e:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    .line 172
    .line 173
    invoke-static {p1}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->b(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;)Landroid/util/SparseBooleanArray;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    iget v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;->d:I

    .line 178
    .line 179
    invoke-virtual {p1, v0, v1}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 180
    .line 181
    .line 182
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;->c:Landroid/view/View;

    .line 183
    .line 184
    invoke-virtual {p1, v1}, Landroid/view/View;->setSelected(Z)V

    .line 185
    .line 186
    .line 187
    goto :goto_1

    .line 188
    :cond_4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;->e:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    .line 189
    .line 190
    invoke-static {p1}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->b(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;)Landroid/util/SparseBooleanArray;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    iget v2, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;->d:I

    .line 195
    .line 196
    invoke-virtual {p1, v2, v0}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 197
    .line 198
    .line 199
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;->c:Landroid/view/View;

    .line 200
    .line 201
    invoke-virtual {p1, v0}, Landroid/view/View;->setSelected(Z)V

    .line 202
    .line 203
    .line 204
    :goto_1
    new-instance p1, Ljava/util/ArrayList;

    .line 205
    .line 206
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 207
    .line 208
    .line 209
    :goto_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;->e:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    .line 210
    .line 211
    iget-object v0, v0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->d:Ll8/a;

    .line 212
    .line 213
    invoke-virtual {v0}, Lz7/b;->getCount()I

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    if-ge v1, v0, :cond_6

    .line 218
    .line 219
    iget-object v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;->e:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    .line 220
    .line 221
    invoke-static {v0}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->b(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;)Landroid/util/SparseBooleanArray;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-virtual {v0, v1}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    if-eqz v0, :cond_5

    .line 230
    .line 231
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 239
    .line 240
    goto :goto_2

    .line 241
    :cond_6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;->e:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    .line 242
    .line 243
    invoke-static {v0, p1}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->d(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;Ljava/util/List;)Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    .line 244
    .line 245
    .line 246
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;->e:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    .line 247
    .line 248
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    :cond_7
    return-void
.end method
