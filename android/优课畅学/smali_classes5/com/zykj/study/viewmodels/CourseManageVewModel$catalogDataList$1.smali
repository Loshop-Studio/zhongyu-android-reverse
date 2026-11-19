.class final Lcom/zykj/study/viewmodels/CourseManageVewModel$catalogDataList$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/CourseManageVewModel;-><init>(Lo4/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lx7/q;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.study.viewmodels.CourseManageVewModel$catalogDataList$1"
    f = "CourseManageVewModel.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lm7/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-direct {p0, v0, p1}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final c(Ljava/util/List;Ljava/util/List;Lm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$catalogDataList$1;

    .line 2
    .line 3
    invoke-direct {v0, p3}, Lcom/zykj/study/viewmodels/CourseManageVewModel$catalogDataList$1;-><init>(Lm7/c;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$catalogDataList$1;->b:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p2, v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$catalogDataList$1;->c:Ljava/lang/Object;

    .line 9
    .line 10
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lcom/zykj/study/viewmodels/CourseManageVewModel$catalogDataList$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/List;

    check-cast p3, Lm7/c;

    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/study/viewmodels/CourseManageVewModel$catalogDataList$1;->c(Ljava/util/List;Ljava/util/List;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$catalogDataList$1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/List;

    .line 6
    .line 7
    iget-object v2, v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$catalogDataList$1;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ljava/util/List;

    .line 10
    .line 11
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    iget v3, v0, Lcom/zykj/study/viewmodels/CourseManageVewModel$catalogDataList$1;->a:I

    .line 15
    .line 16
    if-nez v3, :cond_c

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-eqz v4, :cond_b

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    check-cast v4, Lcom/zykj/study/bean/course/CatalogLockedBean;

    .line 41
    .line 42
    invoke-virtual {v4}, Lcom/zykj/study/bean/course/CatalogLockedBean;->getId()J

    .line 43
    .line 44
    .line 45
    move-result-wide v5

    .line 46
    invoke-static {v5, v6}, Lo7/a;->d(J)Ljava/lang/Long;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-interface {v2, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v13

    .line 54
    invoke-virtual {v4}, Lcom/zykj/study/bean/course/CatalogLockedBean;->getId()J

    .line 55
    .line 56
    .line 57
    move-result-wide v7

    .line 58
    invoke-virtual {v4}, Lcom/zykj/study/bean/course/CatalogLockedBean;->getTitle()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v9

    .line 62
    invoke-virtual {v4}, Lcom/zykj/study/bean/course/CatalogLockedBean;->isLeaf()Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    const/16 v17, 0x0

    .line 67
    .line 68
    const/16 v18, 0x1

    .line 69
    .line 70
    if-nez v5, :cond_2

    .line 71
    .line 72
    invoke-virtual {v4}, Lcom/zykj/study/bean/course/CatalogLockedBean;->getChildren()Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    if-eqz v5, :cond_2

    .line 77
    .line 78
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    if-eqz v5, :cond_1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    move/from16 v12, v18

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_2
    :goto_0
    move/from16 v12, v17

    .line 89
    .line 90
    :goto_1
    invoke-virtual {v4}, Lcom/zykj/study/bean/course/CatalogLockedBean;->isLeaf()Z

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-nez v5, :cond_8

    .line 95
    .line 96
    invoke-virtual {v4}, Lcom/zykj/study/bean/course/CatalogLockedBean;->getChildren()Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    if-eqz v5, :cond_7

    .line 101
    .line 102
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    if-eqz v5, :cond_3

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_3
    invoke-virtual {v4}, Lcom/zykj/study/bean/course/CatalogLockedBean;->getChildren()Ljava/util/List;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    if-eqz v5, :cond_5

    .line 114
    .line 115
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    if-eqz v6, :cond_5

    .line 120
    .line 121
    :cond_4
    move/from16 v5, v17

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_5
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    :cond_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v6

    .line 132
    if-eqz v6, :cond_4

    .line 133
    .line 134
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    check-cast v6, Lcom/zykj/study/bean/course/CatalogLockedBean;

    .line 139
    .line 140
    invoke-virtual {v6}, Lcom/zykj/study/bean/course/CatalogLockedBean;->getLocked()I

    .line 141
    .line 142
    .line 143
    move-result v6

    .line 144
    if-nez v6, :cond_6

    .line 145
    .line 146
    move/from16 v5, v18

    .line 147
    .line 148
    :goto_2
    move v11, v5

    .line 149
    goto :goto_4

    .line 150
    :cond_7
    :goto_3
    move/from16 v11, v18

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_8
    invoke-virtual {v4}, Lcom/zykj/study/bean/course/CatalogLockedBean;->getLocked()I

    .line 154
    .line 155
    .line 156
    move-result v5

    .line 157
    if-nez v5, :cond_9

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_9
    move/from16 v11, v17

    .line 161
    .line 162
    :goto_4
    invoke-virtual {v4}, Lcom/zykj/study/bean/course/CatalogLockedBean;->isLeaf()Z

    .line 163
    .line 164
    .line 165
    move-result v10

    .line 166
    new-instance v6, Lcom/zykj/study/bean/course/CatalogManageData;

    .line 167
    .line 168
    const/16 v15, 0x40

    .line 169
    .line 170
    const/16 v16, 0x0

    .line 171
    .line 172
    const/4 v14, 0x0

    .line 173
    invoke-direct/range {v6 .. v16}, Lcom/zykj/study/bean/course/CatalogManageData;-><init>(JLjava/lang/String;ZZZZZILkotlin/jvm/internal/n;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    if-eqz v13, :cond_0

    .line 180
    .line 181
    invoke-virtual {v4}, Lcom/zykj/study/bean/course/CatalogLockedBean;->getChildren()Ljava/util/List;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    if-eqz v4, :cond_0

    .line 186
    .line 187
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 192
    .line 193
    .line 194
    move-result v5

    .line 195
    if-eqz v5, :cond_0

    .line 196
    .line 197
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    check-cast v5, Lcom/zykj/study/bean/course/CatalogLockedBean;

    .line 202
    .line 203
    invoke-virtual {v5}, Lcom/zykj/study/bean/course/CatalogLockedBean;->getId()J

    .line 204
    .line 205
    .line 206
    move-result-wide v7

    .line 207
    invoke-virtual {v5}, Lcom/zykj/study/bean/course/CatalogLockedBean;->getTitle()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v9

    .line 211
    invoke-virtual {v5}, Lcom/zykj/study/bean/course/CatalogLockedBean;->getLocked()I

    .line 212
    .line 213
    .line 214
    move-result v6

    .line 215
    if-nez v6, :cond_a

    .line 216
    .line 217
    move/from16 v11, v18

    .line 218
    .line 219
    goto :goto_6

    .line 220
    :cond_a
    move/from16 v11, v17

    .line 221
    .line 222
    :goto_6
    invoke-virtual {v5}, Lcom/zykj/study/bean/course/CatalogLockedBean;->isLeaf()Z

    .line 223
    .line 224
    .line 225
    move-result v10

    .line 226
    new-instance v6, Lcom/zykj/study/bean/course/CatalogManageData;

    .line 227
    .line 228
    const/16 v15, 0x30

    .line 229
    .line 230
    const/16 v16, 0x0

    .line 231
    .line 232
    const/4 v12, 0x0

    .line 233
    const/4 v13, 0x0

    .line 234
    const/4 v14, 0x0

    .line 235
    invoke-direct/range {v6 .. v16}, Lcom/zykj/study/bean/course/CatalogManageData;-><init>(JLjava/lang/String;ZZZZZILkotlin/jvm/internal/n;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    goto :goto_5

    .line 242
    :cond_b
    return-object v3

    .line 243
    :cond_c
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 244
    .line 245
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 246
    .line 247
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    throw v1
.end method
